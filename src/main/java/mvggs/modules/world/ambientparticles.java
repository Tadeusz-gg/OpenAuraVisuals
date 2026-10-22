package mvggs.modules.world;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SpriteShape;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public final class ambientparticles extends Yn {
    private static final int N = 400;
    private static final int OF = 150;
    private static final int n = 30;
    private final r_2 mH;
    private final RZ Go;
    private final r_2 uq;
    private final Uq h;
    private final Uq g;
    private final Uq DD;
    private final Uq nN;
    private final Uq F;
    private final Uq DS;
    private final zS Ps;
    private final double[] zv;
    private final double[] AB;
    private final double[] CM;
    private final double[] Ja;
    private final double[] Ro;
    private final double[] FA;
    private final float[] d;
    private final float[] LI;
    private final float[] l;
    private final int[] Ym;
    private final int[] U;
    private final float[] Iv;
    private final float[] f;
    private final byte[] DT;
    private int xy;
    private final double[] aN;
    private final double[] v;
    private final double[] y;
    private final float[] o;
    private final float[] Jc;
    private final float[] X;
    private final int[] zj;
    private final int[] SB;
    private final int[] UQ;
    private final int[] I;
    private final float[] Kl;
    private final double[][] jm;
    private final double[][] fW;
    private final double[][] az;
    private int z;
    private static final SpriteShape[] t;
    private Object T;
    public static final int w;

    public ambientparticles() {
        super("ambient_particles", "Ambient Particles", AJ.WORLD);
        AJ var1 = AJ.WORLD;

        XW var2 = XW.BOTH;
        r_2 var3 = new r_2("style", "Style", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.mH = var5;
        Ru var81 = Ru.SNOWFLAKES;
        RZ var6 = new RZ(var81);
        nM var7 = this.bU(var6);
        RZ var8 = (RZ)var7;
        this.Go = var8;
        Tq var82 = Tq.DRIFT;
        r_2 var9 = new r_2("motion", "Motion", var82);
        xB var10 = this.vn(var9);
        r_2 var11 = (r_2)var10;
        this.uq = var11;
        Uq var12 = new Uq("count", "Particles", 100.0F, 10.0F, 400.0F);
        Uq var13 = var12.W(1.0F);
        BooleanSupplier var83 = () -> {
            int var1x = w;
            var1x ^= 1042657904;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.mH;
            Integer var37x = var2x;
            if (var37x != null) {
                var1x &= 963557320;
                var1x <<= 11;
                var1x += 715291861;
                var1x ^= -1925895051;
                long var4x = var1x;
                long var6x = var4x + 1L;
                var6x = var4x * var6x;
                long var8x = var4x + 2L;
                var6x *= var8x;
                var4x += 3L;
                var6x *= var4x;
                var4x = var6x & 7L;
                long var50x;
                int var40x = (var50x = var4x - 0L) == 0L ? 0 : (var50x < 0L ? -1 : 1);
                label29:
                if (var40x == 0) {
                    XW var41x = XW.FIREFLIES;
                    int var42x = (var3x.TJ(var41x)) ? 1 : 0;
                    if (var42x == 0) {
                        var1x |= -1875781384;
                        var1x *= -417073131;
                        var1x >>= 14;
                        var1x ^= 1198188917;
                        Integer var43x = var1x;
                        if (var43x == null) {
                            break label29;
                        }

                        var42x = 1;
                        var1x += -995447067;
                        var1x <<= 13;
                        var1x += -1244551698;
                        var1x *= 1825732925;
                        var1x ^= -485464632;
                    } else {
                        var1x ^= 1767890219;
                        var1x <<= 10;
                        var1x -= -2018292312;
                        var1x ^= -782354927;
                        var42x = 0;
                        var1x += -935679321;
                        var1x ^= 565129358;
                    }

                      return var42x != 0;
                }
            } else {
                var1x += 521858161;
                var1x ^= 1491047397;
                var1x *= -1566927595;
                var1x ^= -1279329455;
                int var38x = var1x + 1;
                var38x = var1x * var38x;
                var1x = var38x & 1;
                if (var1x == 0) {
                    RuntimeException var16x = new RuntimeException();
                    throw var16x;
                }
            }

            IllegalStateException var30x = new IllegalStateException();
            throw var30x;
        };
        xB var14 = var13.Pt(var83);
        Uq var15 = (Uq)var14;
        xB var16 = this.vn(var15);
        Uq var17 = (Uq)var16;
        this.h = var17;
        Uq var18 = new Uq("size", "Particle Size", 1.0F, 0.1F, 2.0F);
        Uq var19 = var18.W(0.05F);
        Uq var20 = var19.L("x");
        BooleanSupplier var84 = () -> {
            int var1x = w;
            var1x ^= 2062473239;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.mH;
            XW var4x = XW.FIREFLIES;
            boolean var47x = var3x.TJ(var4x);
            Integer var35x = var2x;
            if (var35x == null) {
                var1x = switch (var1x) {
                    case -1494580979 -> {
                        var1x -= -1604799800;
                        var1x *= 1906642017;
                        var1x -= -892715619;
                        var1x >>= 22;
                        yield var1x ^ -132286671;
                    }
                    default -> var1x ^ -314370364;
                    case 1458311034 -> var1x ^ 1662623047;
                };
                int var36x = var1x + 1;
                var36x = var1x * var36x;
                int var53x = var1x + 2;
                var36x *= var53x;
                int var54x = var1x + 3;
                var36x *= var54x;
                var36x &= 7;
                if (var36x == 0) {
                    AssertionError var41x = new AssertionError();
                    throw var41x;
                }
            } else {
                label48: {
                    var1x ^= -1484763472;
                    var1x *= -987016767;
                    var1x ^= 2026219530;
                    boolean var46x;
                      if (!var47x) {
                        var1x += 1921802438;
                        var1x |= 2007541199;
                        var1x ^= 500449703;
                        var1x ^= 1225226438;
                        long var42x = var1x;
                        long var55x = var42x + 1L;
                        long var56x = var42x * var55x;
                        long var6x = var42x + 2L;
                        long var57x = var56x * var6x;
                        long var43x = var42x + 3L;
                        long var58x = var57x * var43x;
                        long var44x = var58x & 7L;
                        long var60x;
                        int var45x = (var60x = var44x - 0L) == 0L ? 0 : (var60x < 0L ? -1 : 1);
                        if (var45x != 0) {
                            break label48;
                        }

                        var46x = true;
                        switch (var1x) {
                            case -1808609191:
                                var1x ^= -355290275;
                                break;
                            case -1423335778:
                                var1x -= -127909427;
                                var1x |= -1548493882;
                                var1x ^= -1782427990;
                                var1x ^= -1687644193;
                                break;
                            case -33887201:
                            default:
                                var1x ^= -464776655;
                        }
                    } else {
                        var1x *= 1612785887;
                        var1x -= -583503043;
                        var1x |= 1358444076;
                        var1x ^= -1629130509;
                        long var48x = var1x;
                        long var5x = var48x + 1L;
                        var5x = var48x * var5x;
                        long var49x = var5x & 1L;
                        long var61x;
                        int var50x = (var61x = var49x - 0L) == 0L ? 0 : (var61x < 0L ? -1 : 1);
                        if (var50x != 0) {
                            break label48;
                        }

                        var46x = false;
                        switch (var1x) {
                            case -1628283829:
                            default:
                                var1x ^= -894765291;
                                break;
                            case 1601865689:
                                var1x ^= -1770659552;
                                break;
                            case 1696124575:
                                var1x += -1877133974;
                                var1x &= 244425927;
                                var1x &= -1078894635;
                                var1x ^= 1775230617;
                                var1x ^= -795943878;
                        }
                    }

                    int var51x = var1x + 1;
                    int var52x = var1x * var51x;
                    var1x = var52x & 1;
                    if (var1x == 0) {
                        return var46x;
                    }
                }
            }

            IllegalArgumentException var34x = new IllegalArgumentException();
            throw var34x;
        };
        xB var21 = var20.Pt(var84);
        Uq var22 = (Uq)var21;
        xB var23 = this.vn(var22);
        Uq var24 = (Uq)var23;
        this.g = var24;
        Uq var25 = new Uq("fireflies", "Fireflies", 30.0F, 10.0F, 150.0F);
        Uq var26 = var25.W(1.0F);
        BooleanSupplier var85 = () -> {
            int var1x = w;
            var1x ^= -1101160550;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.mH;
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            long var8x = var4x + 2L;
            var6x *= var8x;
            var4x += 3L;
            var6x *= var4x;
            var4x = var6x & 7L;
            long var70x;
            var2x = (var70x = var4x - 0L) == 0L ? 0 : (var70x < 0L ? -1 : 1);
            if (var2x == 0) {
                var1x = switch (var1x) {
                    case -1235677289 -> var1x ^ 726935499;
                    default -> var1x ^ -1255572448;
                    case 1650050688 -> {
                        var1x <<= 26;
                        var1x -= -1594729742;
                        var1x |= -968471511;
                        yield var1x ^ -45647136;
                    }
                };
                var2x = var1x + 1;
                var2x = var1x * var2x;
                int var57x = var1x + 2;
                var2x *= var57x;
                int var58x = var1x + 3;
                var2x *= var58x;
                var2x &= 7;
                label43:
                if (var2x == 0) {
                    XW var43x = XW.PARTICLES;
                    int var44x = (var3x.TJ(var43x)) ? 1 : 0;
                    if (var44x == 0) {
                        var1x += 1246451105;
                        var1x <<= 13;
                        var1x ^= 846535662;
                        long var45x = var1x;
                        var4x = var45x + 1L;
                        var4x = var45x * var4x;
                        var6x = var45x + 2L;
                        var4x *= var6x;
                        long var46x = var45x + 3L;
                        var4x *= var46x;
                        long var47x = var4x & 7L;
                        long var71x;
                        var44x = (var71x = var47x - 0L) == 0L ? 0 : (var71x < 0L ? -1 : 1);
                        if (var44x != 0) {
                            break label43;
                        }

                        var44x = 1;
                        switch (var1x) {
                            case 216521238:
                                var1x ^= -1429767451;
                                break;
                            case 1339759598:
                                var1x *= 147998451;
                                var1x -= 130017914;
                                var1x += -320459056;
                                var1x >>= 31;
                                var1x ^= -1864882760;
                                break;
                            case 1504137969:
                            default:
                                var1x ^= -783377665;
                        }
                    } else {
                        var1x = switch (var1x) {
                            case -261706823 -> var1x ^ -2035946713;
                            default -> var1x ^ -798175909;
                            case 570988495 -> {
                                var1x *= -124046489;
                                var1x >>= 24;
                                var1x >>= 1;
                                yield var1x ^ -815917879;
                            }
                        };
                        var44x = 0;
                        var1x >>>= 1;
                        var1x &= -586165608;
                        var1x &= 1127316729;
                        var1x &= 277468409;
                        var1x ^= 1864862423;
                    }

                    long var50x = var1x;
                    long var5x = var50x + 1L;
                    var5x = var50x * var5x;
                    long var7x = var50x + 2L;
                    var5x *= var7x;
                    long var51x = var50x + 3L;
                    var5x *= var51x;
                    long var52x = var5x & 7L;
                    long var72x;
                    int var53x = (var72x = var52x - 0L) == 0L ? 0 : (var72x < 0L ? -1 : 1);
                    if (var53x == 0) {
                        return var44x != 0;
                    }
                }

                AssertionError var54x = new AssertionError();
                throw var54x;
            } else {
                var1x += 1546468517;
                var1x ^= 1783247698;
                var1x -= 820725241;
                var1x |= 1812869166;
                var1x ^= 286474366;
                RuntimeException var16x = new RuntimeException();
                throw var16x;
            }
        };
        xB var27 = var26.Pt(var85);
        Uq var28 = (Uq)var27;
        xB var29 = this.vn(var28);
        Uq var30 = (Uq)var29;
        this.DD = var30;
        Uq var31 = new Uq("trail", "Trail Length", 10.0F, 5.0F, 30.0F);
        Uq var32 = var31.W(1.0F);
        BooleanSupplier var86 = () -> {
            int var1x = w;
            var1x ^= 916587191;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.mH;
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            var4x = var6x & 1L;
            long var49x;
            var2x = (var49x = var4x - 0L) == 0L ? 0 : (var49x < 0L ? -1 : 1);
            label36:
            if (var2x == 0) {
                var1x += -713590772;
                var1x *= 103368299;
                var1x ^= 1011834346;
                XW var34x = XW.PARTICLES;
                  int var35x = var3x.TJ(var34x) ? 1 : 0;
                if (var35x == 0) {
                    var1x |= 167960735;
                    var1x ^= 1976222689;
                    long var36x = var1x;
                    var4x = var36x + 1L;
                    var4x = var36x * var4x;
                    long var37x = var4x & 1L;
                    long var50x;
                    var35x = (var50x = var37x - 0L) == 0L ? 0 : (var50x < 0L ? -1 : 1);
                    if (var35x != 0) {
                        break label36;
                    }

                    var35x = 1;
                    var1x -= -1668268001;
                    var1x += -749363066;
                    var1x *= -30721359;
                    var1x ^= -929815903;
                    var1x ^= 1354192983;
                } else {
                    var1x -= 760560305;
                    var1x ^= -1732179878;
                    Integer var44x = var1x;
                    if (var44x == null) {
                        break label36;
                    }

                    var35x = 0;
                    var1x += 1326972475;
                    var1x += -29739450;
                    var1x *= -359127565;
                    var1x ^= -853039478;
                }

                return var35x != 0;
            } else {
                long var11x = switch (var1x) {
                    case -1692978567 -> var1x ^ -1968055263;
                    default -> var1x ^ 526029071;
                    case -358196307 -> {
                        var1x >>>= 23;
                        yield var1x ^ -1913482418;
                    }
                };
                long var40x = var11x + 1L;
                long var41x = var11x * var40x;
                long var5x = var11x + 2L;
                long var42x = var41x * var5x;
                long var12x = var11x + 3L;
                long var43x = var42x * var12x;
                long var13x = var43x & 7L;
                long var51x;
                var1x = (var51x = var13x - 0L) == 0L ? 0 : (var51x < 0L ? -1 : 1);
                if (var1x == 0) {
                    IllegalArgumentException var15x = new IllegalArgumentException();
                    throw var15x;
                }
            }

            UnsupportedOperationException var32x = new UnsupportedOperationException();
            throw var32x;
        };
        xB var33 = var32.Pt(var86);
        Uq var34 = (Uq)var33;
        xB var35 = this.vn(var34);
        Uq var36 = (Uq)var35;
        this.nN = var36;
        Uq var37 = new Uq("firefly_size", "Firefly Size", 1.0F, 0.2F, 2.0F);
        Uq var38 = var37.W(0.05F);
        Uq var39 = var38.L("x");
        BooleanSupplier var87 = () -> {
            int var1x = w;
            var1x ^= 1012576656;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.mH;
            XW var4x = XW.PARTICLES;
            boolean var31x = var3x.TJ(var4x);
            long var36x = var2x;
            long var6x = var36x + 1L;
            var6x = var36x * var6x;
            long var37x = var6x & 1L;
            long var44x;
            var2x = (var44x = var37x - 0L) == 0L ? 0 : (var44x < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x |= -1263409248;
                var1x >>>= 9;
                var1x ^= 177042389;
                long var38x = var1x;
                var6x = var38x + 1L;
                var6x = var38x * var6x;
                long var39x = var6x & 1L;
                long var45x;
                var2x = (var45x = var39x - 0L) == 0L ? 0 : (var45x < 0L ? -1 : 1);
                if (var2x == 0) {
                    RuntimeException var28x = new RuntimeException();
                    throw var28x;
                }
            } else {
                var1x += -1212859479;
                var1x ^= -559943151;
                if (!var31x) {
                    var1x &= 1856316967;
                    var1x ^= 716790664;
                    Integer var29x = var1x;
                    if (var29x != null) {
                        boolean var30x = true;
                        var1x ^= 926623804;
                        var1x += 237266762;
                        var1x -= 984924282;
                        var1x ^= 1509161164;
                        return var30x;
                    }
                } else {
                    var1x &= -454948017;
                    var1x ^= 2041699305;
                    long var32x = var1x;
                    long var5x = var32x + 1L;
                    var5x = var32x * var5x;
                    long var33x = var5x & 1L;
                    long var46x;
                    int var34x = (var46x = var33x - 0L) == 0L ? 0 : (var46x < 0L ? -1 : 1);
                    if (var34x == 0) {
                        int var47x = 0;
                        var1x += 566436508;
                        var1x |= 1832479381;
                        var1x <<= 19;
                        var1x ^= -2093423446;
                          return var47x != 0;
                    }
                }
            }

            RuntimeException var35x = new RuntimeException();
            throw var35x;
        };
        xB var40 = var39.Pt(var87);
        Uq var41 = (Uq)var40;
        xB var42 = this.vn(var41);
        Uq var43 = (Uq)var42;
        this.F = var43;
        Uq var44 = new Uq("glow", "Glow", 0.8F, 0.0F, 1.0F);
        Uq var45 = var44.W(0.05F);
        xB var46 = this.vn(var45);
        Uq var47 = (Uq)var46;
        this.DS = var47;
        Ry var88 = Ry.RAINBOW;
        zS var48 = new zS(var88, -11559425, -5870593);
        nM var49 = this.bU(var48);
        zS var50 = (zS)var49;
        this.Ps = var50;
        double[] var51 = new double[400];
        this.zv = var51;
        double[] var52 = new double[400];
        this.AB = var52;
        double[] var53 = new double[400];
        this.CM = var53;
        double[] var54 = new double[400];
        this.Ja = var54;
        double[] var55 = new double[400];
        this.Ro = var55;
        double[] var56 = new double[400];
        this.FA = var56;
        float[] var57 = new float[400];
        this.d = var57;
        float[] var58 = new float[400];
        this.LI = var58;
        float[] var59 = new float[400];
        this.l = var59;
        int[] var60 = new int[400];
        this.Ym = var60;
        int[] var61 = new int[400];
        this.U = var61;
        float[] var62 = new float[400];
        this.Iv = var62;
        float[] var63 = new float[400];
        this.f = var63;
        byte[] var64 = new byte[400];
        this.DT = var64;
        double[] var65 = new double[150];
        this.aN = var65;
        double[] var66 = new double[150];
        this.v = var66;
        double[] var67 = new double[150];
        this.y = var67;
        float[] var68 = new float[150];
        this.o = var68;
        float[] var69 = new float[150];
        this.Jc = var69;
        float[] var70 = new float[150];
        this.X = var70;
        int[] var71 = new int[150];
        this.zj = var71;
        int[] var72 = new int[150];
        this.SB = var72;
        int[] var73 = new int[150];
        this.UQ = var73;
        int[] var74 = new int[150];
        this.I = var74;
        float[] var75 = new float[150];
        this.Kl = var75;
        double[][] var76 = new double[150][31];
        this.jm = var76;
        double[][] var77 = new double[150][31];
        this.fW = var77;
        double[][] var78 = new double[150][31];
        this.az = var78;
        this.dy("Snow, drifting stars and fireflies with glowing trails in the air around you.");
        wD<sE> var79 = (sE var1x) -> {
            int var2x = w;
            var2x ^= -504141076;
            int var3x = System.identityHashCode(this);
            int var4x = var3x + 1;
            var4x = var3x * var4x;
            var3x = var4x & 1;
            if (var3x != 0) {
                var2x &= -59549846;
                var2x >>>= 21;
                var2x ^= -136375866;
                long var20x = var2x;
                long var5x = var20x + 1L;
                var5x = var20x * var5x;
                long var7x = var20x + 2L;
                var5x *= var7x;
                long var21x = var20x + 3L;
                var5x *= var21x;
                long var22x = var5x & 7L;
                long var31x;
                var3x = (var31x = var22x - 0L) == 0L ? 0 : (var31x < 0L ? -1 : 1);
                if (var3x == 0) {
                    IllegalStateException var24x = new IllegalStateException();
                    throw var24x;
                }
            } else {
                var2x -= 1973110462;
                var2x ^= 1921566171;
                Integer var25x = var2x;
                if (var25x != null) {
                    var2x *= -223848637;
                    var2x ^= -268037951;
                    var2x &= 359531365;
                    var2x ^= -1434125899;
                    this.qi(var2x);
                    return;
                }
            }

            RuntimeException var26x = new RuntimeException();
            throw var26x;
        };
        this.iI(sE.class, var79);
        wD<T> var80 = this::u;
        this.iI(T.class, var80);
    }

    public int YR() {
        int var1 = w;
        var1 ^= 1612738557;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 ^= -1414194659;
            var1 *= 958033193;
            var1 -= -754737319;
            var1 += -804620301;
            var1 ^= 694202119;
            int var14 = this.xy;
            int var3 = this.z;
            return var14 + var3;
        } else {
            var1 ^= 885651412;
            var1 ^= -1324305903;
            UnsupportedOperationException var7 = new UnsupportedOperationException();
            throw var7;
        }
    }

    @Override
    protected void J() {
        int var1 = w;
        var1 ^= -351949277;
        int var2 = System.identityHashCode(this);
        this.xy = 0;
        this.z = 0;
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.dS;
        var1 ^= var3;
        var1 ^= -1699540653;
        var3 = of_2.r;
        var1 ^= var3;
        var1 ^= 1874708218;
        if (var2 == 0) {
            var1 ^= 1525714007;
            var1 += 1851830775;
            var1 ^= 1729153899;
            var1 ^= -882963131;
            this.T = null;
        } else {
            var1 >>= 16;
            var1 += -1312433666;
            var1 &= -1156346086;
            var1 >>= 14;
            var1 ^= 1202444974;
            UnsupportedOperationException var14 = new UnsupportedOperationException();
            throw var14;
        }
    }

    private void qi(int var1) {
        int var3 = System.identityHashCode(this);
        Entity var4 = i_2.QI();
        var4 = var4;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var5 &= 1;
        if (var5 != 0) {
            int var337 = var1 - 1499947985;
            var337 &= -939338241;
            var337 ^= -1897862910;
        } else {
            label558: {
                int var2 = var1 - -2107886743;
                var2 &= 1363366911;
                var2 -= 921654361;
                var2 ^= -1471900608;
                long var352 = var2;
                long var7 = var352 + 1L;
                var7 = var352 * var7;
                long var353 = var7 & 1L;
                long var795;
                var5 = (var795 = var353 - 0L) == 0L ? 0 : (var795 < 0L ? -1 : 1);
                if (var5 == 0) {
                    if (var4 == null) {
                        long var360 = switch (var2) {
                            default -> var2 ^ 1504127502;
                            case 13974507 -> var2 ^ 688159681;
                            case 1645640083 -> {
                                var2 -= -1939257534;
                                yield var2 ^ 1424174392;
                            }
                        };
                        var7 = var360 + 1L;
                        var7 = var360 * var7;
                        long var540 = var360 + 2L;
                        var7 *= var540;
                        long var361 = var360 + 3L;
                        var7 *= var361;
                        long var362 = var7 & 7L;
                        long var796;
                        var5 = (var796 = var362 - 0L) == 0L ? 0 : (var796 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            return;
                        }
                    } else {
                        var2 ^= -48029446;
                        var2 ^= -277501668;
                        Object var355 = this.T;
                        long var6 = var3;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var797;
                        int var366 = (var797 = var6 - 0L) == 0L ? 0 : (var797 < 0L ? -1 : 1);
                        if (var366 != 0) {
                            var2 *= -92708139;
                            var2 |= 1229011894;
                            var2 ^= -1518106823;
                            break label558;
                        }

                        var2 += 414903022;
                        var2 |= 435930834;
                        var2 >>>= 21;
                        var2 ^= -425027675;
                        var6 = var2;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var798;
                        int var369 = (var798 = var6 - 0L) == 0L ? 0 : (var798 < 0L ? -1 : 1);
                        label469:
                        if (var369 == 0) {
                            World var370 = var4.getEntityWorld();
                            if ((Object)var355 != var370) {
                                var2 |= -1226277012;
                                var2 *= -1894782017;
                                var2 ^= 1385361670;
                                this.J();
                                World var356 = var4.getEntityWorld();
                                int var371 = var3 + 1;
                                int var372 = var3 * var371;
                                int var394 = var3 + 2;
                                int var373 = var372 * var394;
                                int var395 = var3 + 3;
                                int var374 = var373 * var395;
                                int var375 = var374 & 7;
                                if (var375 != 0) {
                                    var2 &= -656721553;
                                    var2 ^= -969915198;
                                    break label558;
                                }

                                var2 += -2130101775;
                                var2 ^= -245891923;
                                var2 <<= 21;
                                var2 *= 423131225;
                                var2 ^= -458281133;
                                int var376 = var2 + 1;
                                int var377 = var2 * var376;
                                int var378 = var377 & 1;
                                if (var378 != 0) {
                                    break label469;
                                }

                                this.T = var356;
                                var2 -= 852308383;
                                var2 ^= -1239584234;
                            } else {
                                var2 >>= 22;
                                var2 |= -1167587281;
                                var2 ^= 2130931741;
                            }

                            Integer var357 = var2;
                            label462:
                            if (var357 != null) {
                                ThreadLocalRandom var358 = ThreadLocalRandom.current();
                                ThreadLocalRandom var359 = var358;
                                r_2 var379 = this.uq;
                                Tq var396 = Tq.SNOW;
                                boolean var380 = var379.TJ(var396);
                                boolean var381 = var380;
                                r_2 var397 = this.mH;
                                XW var460 = XW.FIREFLIES;
                                boolean var398 = var397.TJ(var460);
                                var8 = var3;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                var8 = var10 & 1L;
                                long var799;
                                int var463 = (var799 = var8 - 0L) == 0L ? 0 : (var799 < 0L ? -1 : 1);
                                if (var463 != 0) {
                                    var2 *= -2003069335;
                                    var2 |= 190003632;
                                    var2 += -544545673;
                                    var2 >>= 3;
                                    var2 ^= 932061323;
                                    break label558;
                                }
                                var2 = switch (var2) {
                                    case -2130931806 -> {
                                        var2 |= 1143283614;
                                        var2 >>= 14;
                                        yield var2 ^ -952652715;
                                    }
                                    default -> var2 ^ 945669423;
                                    case -401879507 -> var2 ^ -1742005372;
                                };
                                int var402;
                                if (var398) {
                                    var2 ^= 1980493781;
                                    var2 |= -2069246648;
                                    var2 |= 840498513;
                                    var2 += 1011081222;
                                    var2 ^= 20437999;
                                    var7 = var2;
                                    long var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var7 = var9 & 1L;
                                    long var800;
                                    int var401 = (var800 = var7 - 0L) == 0L ? 0 : (var800 < 0L ? -1 : 1);
                                    if (var401 != 0) {
                                        break label462;
                                    }

                                    var402 = 0;
                                    var2 &= 1718029303;
                                    var2 ^= 449369681;
                                } else {
                                    var2 *= 474877991;
                                    var2 ^= -991784582;
                                    Integer var464 = var2;
                                    if (var464 == null) {
                                        break label462;
                                    }

                                    Uq var465 = this.h;
                                      int var466 = var465.B();
                                    Integer var481 = var3;
                                    if (var481 == null) {
                                        var2 *= 790939701;
                                        var2 ^= -808455939;
                                        break label558;
                                    }

                                    var2 += 151925776;
                                    var2 -= -1303455857;
                                    var2 *= -332022535;
                                    var2 ^= 47588318;
                                    var402 = var466;
                                    var2 |= -1540452584;
                                    var2 ^= -2051593395;
                                }

                                int var467 = var2 + 1;
                                int var468 = var2 * var467;
                                int var482 = var2 + 2;
                                int var469 = var468 * var482;
                                var482 = var2 + 3;
                                int var470 = var469 * var482;
                                int var471 = var470 & 7;
                                if (var471 == 0) {
                                    int var403 = var402;
                                    Integer var472 = var3;
                                    if (var472 == null) {
                                        var2 >>= 4;
                                        var2 ^= -848367227;
                                        break label558;
                                    }
                                    var2 = switch (var2) {
                                        case 952685619 -> {
                                            var2 -= 1721759870;
                                            var2 += -2134956633;
                                            yield var2 ^ -700506016;
                                        }
                                        default -> var2 ^ -2000529989;
                                        case 1833521921 -> var2 ^ -1906766062;
                                    };
                                    int var473 = var2 + 1;
                                    int var474 = var2 * var473;
                                    int var475 = var474 & 1;
                                    label446:
                                    if (var475 == 0) {
                                        r_2 var476 = this.mH;
                                        XW var484 = XW.PARTICLES;
                                        boolean var477 = var476.TJ(var484);
                                        int var478;
                                        if (var477) {
                                            var2 += 1964904026;
                                            var2 ^= -619670411;
                                            var478 = 0;
                                            var2 ^= 781340011;
                                            var2 -= -21602210;
                                            var2 -= 1958344774;
                                            var2 *= -1560763801;
                                            var2 ^= 587138807;
                                        } else {
                                            var2 = switch (var2) {
                                                case -2066276036 -> {
                                                    var2 -= -1219287587;
                                                    var2 |= 933373347;
                                                    var2 -= -1794358988;
                                                    var2 |= -1250818574;
                                                    yield var2 ^ 1052907443;
                                                }
                                                case -1100337004 -> var2 ^ 1577400310;
                                                default -> var2 ^ 2106491358;
                                            };
                                            var482 = var2 + 1;
                                            var482 = var2 * var482;
                                            int var543 = var2 + 2;
                                            var482 *= var543;
                                            int var544 = var2 + 3;
                                            var482 *= var544;
                                            var482 &= 7;
                                            if (var482 != 0) {
                                                break label446;
                                            }

                                            Uq var490 = this.DD;
                                            var10 = var3;
                                            long var12 = var10 + 1L;
                                            var12 = var10 * var12;
                                            long var14 = var10 + 2L;
                                            var12 *= var14;
                                            var10 += 3L;
                                            var12 *= var10;
                                            var10 = var12 & 7L;
                                            long var801;
                                            int var548 = (var801 = var10 - 0L) == 0L ? 0 : (var801 < 0L ? -1 : 1);
                                            if (var548 != 0) {
                                                var2 -= 1062562909;
                                                var2 ^= 1325549357;
                                                break label558;
                                            }

                                            var2 |= -828418083;
                                            var2 ^= -233483589;
                                            var10 = var2;
                                            var12 = var10 + 1L;
                                            var12 = var10 * var12;
                                            var10 = var12 & 1L;
                                            long var802;
                                            int var551 = (var802 = var10 - 0L) == 0L ? 0 : (var802 < 0L ? -1 : 1);
                                            if (var551 != 0) {
                                                break label446;
                                            }

                                            var482 = var490.B();
                                            var478 = var482;
                                            var2 += 1685024080;
                                            var2 ^= 541053693;
                                        }

                                        Integer var492 = var2;
                                        if (var492 != null) {
                                            int var479 = var478;
                                            byte var493 = 0;
                                            int var552 = var3 + 1;
                                            int var553 = var3 * var552;
                                            int var11 = var3 + 2;
                                            int var554 = var553 * var11;
                                            var11 = var3 + 3;
                                            int var555 = var554 * var11;
                                            int var556 = var555 & 7;
                                            if (var556 != 0) {
                                                var2 ^= -544839499;
                                                var2 >>= 30;
                                                var2 *= -666058283;
                                                var2 ^= 380550419;
                                                break label558;
                                            }

                                            var2 *= 1841573205;
                                            var2 *= 1192332473;
                                            var2 += 1036947158;
                                            var2 |= -764162663;
                                            var2 ^= 1301977703;
                                            int var557 = var2 + 1;
                                            int var558 = var2 * var557;
                                            int var559 = var558 & 1;
                                            if (var559 == 0) {
                                                int var494 = var493;

                                                var2 = switch (var2) {
                                                    case -1754703942 -> {
                                                        var2 |= -640393789;
                                                        var2 -= -1622908850;
                                                        yield var2 ^ -823121152;
                                                    }
                                                    default -> var2 ^ 873193660;
                                                    case -54707048 -> var2 ^ 1928907166;
                                                };

                                                label524:
                                                while (true) {
                                                    Integer var560 = var2;
                                                    if (var560 == null) {
                                                        break;
                                                    }

                                                    int var561 = this.xy;
                                                    long var583 = var3;
                                                    long var13 = var583 + 1L;
                                                    var13 = var583 * var13;
                                                    long var584 = var13 & 1L;
                                                    long var803;
                                                    var11 = (var803 = var584 - 0L) == 0L ? 0 : (var803 < 0L ? -1 : 1);
                                                    if (var11 == 0) {
                                                        var2 = switch (var2) {
                                                            case -1907829587 -> {
                                                                var2 &= -579516599;
                                                                var2 -= -1908961717;
                                                                var2 <<= 5;
                                                                var2 -= 618435449;
                                                                yield var2 ^ -1245359581;
                                                            }
                                                            case -1304154812 -> var2 ^ 1572758883;
                                                            default -> var2 ^ 2115505580;
                                                        };
                                                        Integer var586 = var2;
                                                        if (var586 == null) {
                                                            break;
                                                        }

                                                        if (var494 < var561) {
                                                            var2 += 513942882;
                                                            var2 ^= 167394262;
                                                            var10 = var2;
                                                            long var626 = var10 + 1L;
                                                            var626 = var10 * var626;
                                                            var10 = var626 & 1L;
                                                            long var804;
                                                            int var578 = (var804 = var10 - 0L) == 0L ? 0 : (var804 < 0L ? -1 : 1);
                                                            if (var578 != 0) {
                                                                break;
                                                            }

                                                            double[] var579 = this.zv;
                                                            int var611 = var3 + 1;
                                                            var611 = var3 * var611;
                                                            int var628 = var3 + 2;
                                                            var611 *= var628;
                                                            int var629 = var3 + 3;
                                                            var611 *= var629;
                                                            var611 &= 7;
                                                            if (var611 != 0) {
                                                                var2 ^= 1640472171;
                                                                var2 *= -1142887337;
                                                                var2 >>>= 2;
                                                                var2 -= -739755323;
                                                                var2 ^= -1710353944;
                                                                break label558;
                                                            }

                                                            var2 += -419793428;
                                                            var2 -= 733673448;
                                                            var2 ^= -174747940;
                                                            double var580 = var579[var494];
                                                            double var630 = var4.getX();
                                                            double var581 = var580 - var630;
                                                            double[] var631 = this.AB;
                                                            double var632 = var631[var494];
                                                            double var638 = var4.getY();
                                                            double var633 = var632 - var638;
                                                            double[] var639 = this.CM;
                                                            var638 = var639[var494];
                                                            double var668 = var4.getZ();
                                                            var638 -= var668;
                                                            int[] var669 = this.Ym;
                                                            int var17 = var669[var494];
                                                            double var746 = var581 * var581;
                                                            double var786 = var633 * var633;
                                                            var746 += var786;
                                                            var786 = var638 * var638;
                                                            var746 += var786;
                                                            double var805;
                                                            int var749 = (var805 = var746 - 4096.0) == 0.0 ? 0 : (var805 < 0.0 ? -1 : 1);
                                                            byte var751;
                                                            if (var749 > 0) {
                                                                var2 = switch (var2) {
                                                                    case 151949512 -> {
                                                                        var2 ^= 553360205;
                                                                        var2 >>= 12;
                                                                        var2 >>= 28;
                                                                        yield var2 ^ 78996151;
                                                                    }
                                                                    default -> var2 ^ -1896042518;
                                                                    case 1674636637 -> var2 ^ -1082155975;
                                                                };
                                                                Integer var750 = var2;
                                                                if (var750 == null) {
                                                                    break;
                                                                }

                                                                var751 = 8;
                                                                var2 -= 1610101730;
                                                                var2 ^= -1563812705;
                                                            } else {
                                                                var2 *= -1002260503;
                                                                var2 ^= 873842230;
                                                                var751 = 1;
                                                                var2 *= -1170413605;
                                                                var2 ^= 1543699776;
                                                            }

                                                            Integer var19 = var2;
                                                            if (var19 == null) {
                                                                break;
                                                            }

                                                            var17 += var751;
                                                            var669[var494] = var17;
                                                            int[] var670 = this.Ym;
                                                            int var671 = var670[var494];
                                                            int[] var701 = this.U;
                                                            Integer var752 = var3;
                                                            if (var752 == null) {
                                                                var2 ^= 380887096;
                                                                var2 ^= -1335860623;
                                                                var2 |= 1456693970;
                                                                var2 |= -685012208;
                                                                var2 ^= 958236437;
                                                                break label558;
                                                            }

                                                            var2 |= -626844269;
                                                            var2 <<= 5;
                                                            var2 ^= -1590690687;
                                                            var2 ^= -606144410;
                                                            var2 ^= -1634165251;
                                                            long var753 = var2;
                                                            long var788 = var753 + 1L;
                                                            long var789 = var753 * var788;
                                                            long var22 = var753 + 2L;
                                                            long var790 = var789 * var22;
                                                            long var754 = var753 + 3L;
                                                            long var791 = var790 * var754;
                                                            long var755 = var791 & 7L;
                                                            long var806;
                                                            int var756 = (var806 = var755 - 0L) == 0L ? 0 : (var806 < 0L ? -1 : 1);
                                                            if (var756 != 0) {
                                                                break;
                                                            }

                                                            var17 = var701[var494];
                                                            if (var671 < var17) {
                                                                var2 = switch (var2) {
                                                                    case 414457684 -> var2 ^ 485416145;
                                                                    case 982409850 -> {
                                                                        var2 -= -381411741;
                                                                        var2 &= -1767184465;
                                                                        var2 += -1175721238;
                                                                        yield var2 ^ -295028025;
                                                                    }
                                                                    default -> var2 ^ 1937700151;
                                                                };
                                                                if (var494 < var403) {
                                                                    var2 |= -42430062;
                                                                    var2 |= 1159922850;
                                                                    var2 ^= 263072784;
                                                                    double[] var672 = this.Ja;
                                                                    double[] var703 = this.zv;
                                                                    double var704 = var703[var494];
                                                                    var672[var494] = var704;
                                                                    double[] var673 = this.Ro;
                                                                    double[] var705 = this.AB;
                                                                    double var706 = var705[var494];
                                                                    var673[var494] = var706;
                                                                    double[] var674 = this.FA;
                                                                    double[] var707 = this.CM;
                                                                    double var708 = var707[var494];
                                                                    var674[var494] = var708;
                                                                    double[] var675 = this.zv;
                                                                    double var709 = var675[var494];
                                                                    float[] var773 = this.d;
                                                                    float var774 = var773[var494];
                                                                    double var775 = var774;
                                                                    double var710 = var709 + var775;
                                                                    var675[var494] = var710;
                                                                    double[] var676 = this.AB;
                                                                    double var711 = var676[var494];
                                                                    float[] var776 = this.LI;
                                                                    float var777 = var776[var494];
                                                                    double var778 = var777;
                                                                    double var712 = var711 + var778;
                                                                    var676[var494] = var712;
                                                                    double[] var677 = this.CM;
                                                                    double var713 = var677[var494];
                                                                    float[] var779 = this.l;
                                                                    float var780 = var779[var494];
                                                                    double var781 = var780;
                                                                    double var714 = var713 + var781;
                                                                    var677[var494] = var714;
                                                                    float[] var678 = this.d;
                                                                    var17 = var3 + 1;
                                                                    var17 = var3 * var17;
                                                                    int var757 = var3 + 2;
                                                                    var17 *= var757;
                                                                    int var758 = var3 + 3;
                                                                    var17 *= var758;
                                                                    var17 &= 7;
                                                                    if (var17 != 0) {
                                                                        switch (var2) {
                                                                            case -263079514:
                                                                                var2 >>>= 14;
                                                                                var2 -= -1457490516;
                                                                                var2 |= -1887136710;
                                                                                var2 &= -412184078;
                                                                                var2 ^= 159706484;
                                                                                break label558;
                                                                            case -204579572:
                                                                            default:
                                                                                var2 ^= -284665867;
                                                                                break label558;
                                                                            case 323640045:
                                                                                var2 ^= 404753334;
                                                                                break label558;
                                                                        }
                                                                    }

                                                                    var2 += -1635178328;
                                                                    var2 &= 1837769398;
                                                                    var2 -= -347010530;
                                                                    var2 ^= 36585626;
                                                                    float var720 = var678[var494];
                                                                    float var721 = var720 * 0.9F;
                                                                    var678[var494] = var721;
                                                                    float[] var679 = this.l;
                                                                    float var722 = var679[var494];
                                                                    float var723 = var722 * 0.9F;
                                                                    var679[var494] = var723;
                                                                    if (!var381) {
                                                                        var2 = switch (var2) {
                                                                            default -> var2 ^ -631891119;
                                                                            case -254221173 -> var2 ^ 503757081;
                                                                            case 588732274 -> {
                                                                                var2 |= -333184926;
                                                                                var2 -= 1700683164;
                                                                                yield var2 ^ 787071361;
                                                                            }
                                                                        };
                                                                        Integer var680 = var2;
                                                                        if (var680 == null) {
                                                                            break;
                                                                        }

                                                                        float[] var681 = this.LI;
                                                                        float var724 = var681[var494];
                                                                        Integer var759 = var3;
                                                                        if (var759 == null) {
                                                                            var2 |= 1994545838;
                                                                            var2 -= -1428813808;
                                                                            var2 >>= 22;
                                                                            var2 >>>= 14;
                                                                            var2 ^= -824017722;
                                                                            break label558;
                                                                        }
                                                                        var2 = switch (var2) {
                                                                            case -1489946537 -> {
                                                                                var2 -= 1794934290;
                                                                                var2 += -665064180;
                                                                                var2 *= -953111245;
                                                                                yield var2 ^ 1137320803;
                                                                            }
                                                                            default -> var2 ^ 1754514739;
                                                                            case 1929485501 -> var2 ^ 1160213381;
                                                                        };
                                                                        int var760 = var2 + 1;
                                                                        int var761 = var2 * var760;
                                                                        int var762 = var761 & 1;
                                                                        if (var762 != 0) {
                                                                            break;
                                                                        }

                                                                        float var725 = var724 * 0.9F;
                                                                        var681[var494] = var725;
                                                                        var2 += -292853433;
                                                                        var2 *= -430573259;
                                                                        var2 ^= 726871513;
                                                                    } else {
                                                                        switch (var2) {
                                                                            case -1744906677:
                                                                            default:
                                                                                var2 ^= 1750199397;
                                                                                break;
                                                                            case 588732274:
                                                                                var2 &= 1926532103;
                                                                                var2 *= -462500571;
                                                                                var2 *= -1816624125;
                                                                                var2 >>= 19;
                                                                                var2 ^= -81413356;
                                                                                break;
                                                                            case 2011646558:
                                                                                var2 ^= 1342008973;
                                                                        }
                                                                    }

                                                                    int var682 = var2 + 1;
                                                                    int var683 = var2 * var682;
                                                                    int var684 = var683 & 1;
                                                                    if (var684 != 0) {
                                                                        break;
                                                                    }

                                                                    float[] var685 = this.LI;
                                                                    float var726 = var685[var494];
                                                                    long var763 = var3;
                                                                    long var792 = var763 + 1L;
                                                                    long var793 = var763 * var792;
                                                                    long var764 = var793 & 1L;
                                                                    long var807;
                                                                    int var765 = (var807 = var764 - 0L) == 0L ? 0 : (var807 < 0L ? -1 : 1);
                                                                    if (var765 != 0) {
                                                                        var2 >>= 12;
                                                                        var2 += -334478858;
                                                                        var2 ^= 585992343;
                                                                        break label558;
                                                                    }

                                                                    var2 *= -122516187;
                                                                    var2 ^= -1960627731;
                                                                    var2 ^= 1804371162;
                                                                    int var766 = var2 + 1;
                                                                    int var767 = var2 * var766;
                                                                    int var768 = var767 & 1;
                                                                    if (var768 != 0) {
                                                                        break;
                                                                    }

                                                                    float var727 = var726 - 0.001F;
                                                                    var685[var494] = var727;
                                                                    int var686 = var494 + 1;
                                                                    var494 = var686;
                                                                    switch (var2) {
                                                                        case -998022528:
                                                                            var2 ^= 430860875;
                                                                            continue;
                                                                        case 206258936:
                                                                        default:
                                                                            var2 ^= -84192485;
                                                                            continue;
                                                                        case 1644974117:
                                                                            var2 += 1612126953;
                                                                            var2 >>= 17;
                                                                            var2 -= 1915657893;
                                                                            var2 ^= 60397249;
                                                                            continue;
                                                                    }
                                                                }

                                                                switch (var2) {
                                                                    case -1894358547:
                                                                        var2 ^= -1688714795;
                                                                        break;
                                                                    case -1838853837:
                                                                    default:
                                                                        var2 ^= 1142608273;
                                                                        break;
                                                                    case 664540214:
                                                                        var2 *= -1708159917;
                                                                        var2 -= -1420000731;
                                                                        var2 |= -1626509858;
                                                                        var2 *= -43351439;
                                                                        var2 ^= -1310640893;
                                                                }
                                                            } else {
                                                                var2 -= 410438831;
                                                                var2 ^= -1470787673;
                                                            }

                                                            Integer var687 = var2;
                                                            if (var687 == null) {
                                                                break;
                                                            }

                                                            int var688 = var2 >>> 23;
                                                            int var689 = var688 & -648888084;
                                                            int var690 = var689 * -1789781697;
                                                            int var691 = var690 + 337052000;
                                                            int var692 = var691 ^ 198063808;
                                                            this.A(var494, var692);
                                                            long var693 = var3;
                                                            long var769 = var693 + 1L;
                                                            long var770 = var693 * var769;
                                                            long var794 = var693 + 2L;
                                                            long var771 = var770 * var794;
                                                            long var694 = var693 + 3L;
                                                            long var772 = var771 * var694;
                                                            long var695 = var772 & 7L;
                                                            long var808;
                                                            int var696 = (var808 = var695 - 0L) == 0L ? 0 : (var808 < 0L ? -1 : 1);
                                                            if (var696 != 0) {
                                                                var2 += -238474006;
                                                                var2 |= 1015296125;
                                                                var2 |= 1713738729;
                                                                var2 ^= -1337095367;
                                                                break label558;
                                                            }

                                                            var2 |= -1420528072;
                                                            var2 ^= -289480105;
                                                            var2 ^= -262226805;
                                                            int var697 = var2 + 1;
                                                            int var698 = var2 * var697;
                                                            int var699 = var698 & 1;
                                                            if (var699 != 0) {
                                                                break;
                                                            }

                                                            var494 = var494;
                                                            var2 -= 484433134;
                                                            var2 += -109244660;
                                                            var2 |= -1583028787;
                                                            var2 &= -242516666;
                                                            var2 ^= 1070309867;
                                                            continue;
                                                        }

                                                        var2 &= 423053630;
                                                        var2 >>>= 28;
                                                        var2 >>= 9;
                                                        var2 ^= -732639003;

                                                        while (true) {
                                                            var494 = this.xy;
                                                            long var16 = var3;
                                                            long var18 = var16 + 1L;
                                                            var18 = var16 * var18;
                                                            var16 = var18 & 1L;
                                                            long var809;
                                                            int var643 = (var809 = var16 - 0L) == 0L ? 0 : (var809 < 0L ? -1 : 1);
                                                            if (var643 != 0) {
                                                                var2 -= 10988947;
                                                                var2 *= 1148830365;
                                                                var2 *= 1153672867;
                                                                var2 += -424684856;
                                                                var2 ^= -1247217632;
                                                                break label558;
                                                            }

                                                            var2 >>= 6;
                                                            var2 >>= 6;
                                                            var2 ^= 430817803;
                                                            if (var494 >= var403) {
                                                                var2 = switch (var2) {
                                                                    case -1792141672 -> var2 ^ 149102074;
                                                                    case -430930106 -> {
                                                                        var2 ^= 962520194;
                                                                        yield var2 ^ 1537916029;
                                                                    }
                                                                    default -> var2 ^ -283117613;
                                                                };
                                                                int var382 = var2 + 1;
                                                                int var383 = var2 * var382;
                                                                int var384 = var383 & 1;
                                                                if (var384 == 0) {
                                                                    byte var385 = 0;
                                                                    var16 = var3;
                                                                    var18 = var16 + 1L;
                                                                    var18 = var16 * var18;
                                                                    long var20 = var16 + 2L;
                                                                    var18 *= var20;
                                                                    var16 += 3L;
                                                                    var18 *= var16;
                                                                    var16 = var18 & 7L;
                                                                    long var810;
                                                                    int var404 = (var810 = var16 - 0L) == 0L ? 0 : (var810 < 0L ? -1 : 1);
                                                                    if (var404 != 0) {
                                                                        var2 += -123978818;
                                                                        var2 *= -1469066151;
                                                                        var2 |= 941971835;
                                                                        var2 ^= -1340267079;
                                                                        break label558;
                                                                    }

                                                                    var2 += 762227556;
                                                                    var2 += 57169146;
                                                                    var2 ^= 2065924726;
                                                                    var16 = var2;
                                                                    var18 = var16 + 1L;
                                                                    var18 = var16 * var18;
                                                                    var20 = var16 + 2L;
                                                                    var18 *= var20;
                                                                    var16 += 3L;
                                                                    var18 *= var16;
                                                                    var16 = var18 & 7L;
                                                                    long var811;
                                                                    int var405 = (var811 = var16 - 0L) == 0L ? 0 : (var811 < 0L ? -1 : 1);
                                                                    if (var405 == 0) {
                                                                        int var386 = var385;
                                                                        var2 -= 1749973166;
                                                                        var2 += -1559949230;
                                                                        var2 ^= 131504807;

                                                                        while (true) {
                                                                            int var406 = var2 + 1;
                                                                            int var407 = var2 * var406;
                                                                            int var408 = var407 & 1;
                                                                            if (var408 != 0) {
                                                                                break label524;
                                                                            }

                                                                            int var409 = this.z;
                                                                            Integer var500 = var3;
                                                                            if (var500 == null) {
                                                                                var2 += 1315510786;
                                                                                var2 -= 2046745993;
                                                                                var2 ^= 765518301;
                                                                                break label558;
                                                                            }

                                                                            var2 -= 1240152257;
                                                                            var2 |= 352907444;
                                                                            var2 ^= 88897375;
                                                                            var500 = var2;
                                                                            if (var500 == null) {
                                                                                break label524;
                                                                            }

                                                                            if (var386 >= var409) {
                                                                                var2 &= -1118749527;
                                                                                var2 ^= -687826741;

                                                                                while (true) {
                                                                                    int var387 = this.z;
                                                                                    long var538 = var3;
                                                                                    long var609 = var538 + 1L;
                                                                                    long var610 = var538 * var609;
                                                                                    long var539 = var610 & 1L;
                                                                                    long var812;
                                                                                    int var450 = (var812 = var539 - 0L) == 0L ? 0 : (var812 < 0L ? -1 : 1);
                                                                                    if (var450 != 0) {
                                                                                        var2 ^= -188097881;
                                                                                        var2 &= 163459195;
                                                                                        var2 ^= -815104890;
                                                                                        break label558;
                                                                                    }

                                                                                    var2 |= 2147043711;
                                                                                    var2 += -77067991;
                                                                                    var2 ^= -255252903;
                                                                                    var2 ^= 847928043;
                                                                                    if (var387 >= var479) {
                                                                                        var2 ^= 1016151549;
                                                                                        var2 ^= -1326701888;
                                                                                        var3 = var2 + 1;
                                                                                        var3 = var2 * var3;
                                                                                        int var348 = var2 + 2;
                                                                                        var3 *= var348;
                                                                                        int var349 = var2 + 3;
                                                                                        var3 *= var349;
                                                                                        var3 &= 7;
                                                                                        if (var3 == 0) {
                                                                                            return;
                                                                                        }
                                                                                        break label524;
                                                                                    }

                                                                                    var2 &= -545784310;
                                                                                    var2 -= -630781533;
                                                                                    var2 += -712780711;
                                                                                    var2 >>= 27;
                                                                                    var2 ^= -487735747;
                                                                                    int var388 = var2 * 753188603;
                                                                                    int var389 = var388 + 870517979;
                                                                                    int var390 = var389 ^ -354792566;
                                                                                    int var391 = var390 ^ -1857577490;
                                                                                    int var392 = var391 ^ -2066250373;
                                                                                    this.Nk(var4, var359, var392);
                                                                                    var2 ^= 45008461;
                                                                                    var2 &= -1397032986;
                                                                                    var2 ^= 1270423521;
                                                                                }
                                                                            }

                                                                            var2 <<= 10;
                                                                            var2 |= 1297202536;
                                                                            var2 ^= 2089269008;
                                                                            var2 ^= 296215249;
                                                                            var16 = var2;
                                                                            var18 = var16 + 1L;
                                                                            var18 = var16 * var18;
                                                                            var20 = var16 + 2L;
                                                                            var18 *= var20;
                                                                            var16 += 3L;
                                                                            var18 *= var16;
                                                                            var16 = var18 & 7L;
                                                                            long var813;
                                                                            int var410 = (var813 = var16 - 0L) == 0L ? 0 : (var813 < 0L ? -1 : 1);
                                                                            if (var410 != 0) {
                                                                                break label524;
                                                                            }

                                                                            double[] var411 = this.aN;
                                                                            double var653 = var411[var386];
                                                                            var18 = var3;
                                                                            var20 = var18 + 1L;
                                                                            var20 = var18 * var20;
                                                                            var18 = var20 & 1L;
                                                                            long var814;
                                                                            int var412 = (var814 = var18 - 0L) == 0L ? 0 : (var814 < 0L ? -1 : 1);
                                                                            if (var412 != 0) {
                                                                                var2 ^= 1575794553;
                                                                                var2 -= 1748989009;
                                                                                var2 ^= 1364131915;
                                                                                var2 ^= 150116338;
                                                                                break label558;
                                                                            }

                                                                            var2 += -1227226382;
                                                                            var2 &= -359546770;
                                                                            var2 ^= -492713478;
                                                                            var2 ^= 1469054757;
                                                                            double var743 = var4.getX();
                                                                            double var654 = var653 - var743;
                                                                            double[] var413 = this.v;
                                                                            double var655 = var413[var386];
                                                                            double var744 = var4.getY();
                                                                            double var656 = var655 - var744;
                                                                            double[] var414 = this.y;
                                                                            double var657 = var414[var386];
                                                                            double var745 = var4.getZ();
                                                                            double var658 = var657 - var745;
                                                                            double[] var415 = this.aN;
                                                                            double var659 = var415[var386];
                                                                            double var660 = Math.floor(var659);
                                                                            int var416 = (int)var660;
                                                                            double[] var502 = this.v;
                                                                            double var661 = var502[var386];
                                                                            double var662 = Math.floor(var661);
                                                                            int var503 = (int)var662;
                                                                            double[] var663 = this.y;
                                                                            double var664 = var663[var386];
                                                                            double var665 = Math.floor(var664);
                                                                            int var666 = (int)var665;
                                                                            boolean var417 = i_2.rZ(var416, var503, var666);
                                                                            int[] var504 = this.zj;
                                                                            int var667 = var504[var386];
                                                                            double var563 = var654 * var654;
                                                                            double var622 = var656 * var656;
                                                                            double var564 = var563 + var622;
                                                                            var622 = var658 * var658;
                                                                            double var565 = var564 + var622;
                                                                            double var815;
                                                                            int var566 = (var815 = var565 - 100.0) == 0.0 ? 0 : (var815 < 0.0 ? -1 : 1);
                                                                            byte var568;
                                                                            if (var566 > 0) {
                                                                                var2 ^= -1032372584;
                                                                                var2 &= -2131279763;
                                                                                var2 ^= 951247077;
                                                                                var2 += -1186723881;
                                                                                var2 ^= -246529455;
                                                                                Integer var567 = var2;
                                                                                if (var567 == null) {
                                                                                    break label524;
                                                                                }

                                                                                var568 = 4;
                                                                                var2 |= 1283783683;
                                                                                var2 ^= -6182147;
                                                                                var2 |= 1939346112;
                                                                                var2 ^= 2052010504;
                                                                                var2 ^= -206629874;
                                                                            } else {
                                                                                var2 |= 1588552979;
                                                                                var2 <<= 23;
                                                                                var2 += 1845810696;
                                                                                var2 ^= 281670521;
                                                                                int var587 = var2 + 1;
                                                                                var587 = var2 * var587;
                                                                                int var624 = var2 + 2;
                                                                                var587 *= var624;
                                                                                int var625 = var2 + 3;
                                                                                var587 *= var625;
                                                                                var587 &= 7;
                                                                                if (var587 != 0) {
                                                                                    break label524;
                                                                                }

                                                                                if (var417) {
                                                                                    var2 &= 2061602175;
                                                                                    var2 ^= -942476564;
                                                                                    int var418 = var2 + 1;
                                                                                    int var419 = var2 * var418;
                                                                                    int var420 = var419 & 1;
                                                                                    if (var420 != 0) {
                                                                                        break label524;
                                                                                    }

                                                                                    var568 = 8;
                                                                                    switch (var2) {
                                                                                        case -1886128227:
                                                                                            var2 -= -1977038217;
                                                                                            var2 *= -1300253761;
                                                                                            var2 |= -1018860008;
                                                                                            var2 >>>= 27;
                                                                                            var2 ^= 2050846925;
                                                                                            break;
                                                                                        case -1623157014:
                                                                                            var2 ^= -205260852;
                                                                                            break;
                                                                                        case -765784575:
                                                                                        default:
                                                                                            var2 ^= -1696025506;
                                                                                    }
                                                                                } else {
                                                                                    var2 = switch (var2) {
                                                                                        case -1117215851 -> var2 ^ -595406347;
                                                                                        case 1229792625 -> {
                                                                                            var2 -= 57514613;
                                                                                            var2 *= 72889893;
                                                                                            yield var2 ^ 464225352;
                                                                                        }
                                                                                        default -> var2 ^ 863449009;
                                                                                    };
                                                                                    Integer var421 = var2;
                                                                                    if (var421 == null) {
                                                                                        break label524;
                                                                                    }

                                                                                    var568 = 1;
                                                                                    var2 *= 2078604601;
                                                                                    var2 ^= -1312852272;
                                                                                }
                                                                            }

                                                                            int var422 = var667 + var568;
                                                                            var504[var386] = var422;
                                                                            int[] var423 = this.zj;
                                                                            int var424 = var423[var386];
                                                                            int[] var505 = this.SB;
                                                                            var503 = var505[var386];
                                                                            Integer var569 = var3;
                                                                            if (var569 == null) {
                                                                                var2 ^= 1632134427;
                                                                                var2 ^= -711497463;
                                                                                break label558;
                                                                            }

                                                                            var2 >>= 17;
                                                                            var2 ^= 1105344672;
                                                                            var2 ^= 1737078964;
                                                                            if (var424 < var503) {
                                                                                var2 = switch (var2) {
                                                                                    case 644594954 -> {
                                                                                        var2 >>>= 3;
                                                                                        yield var2 ^ 1742461513;
                                                                                    }
                                                                                    default -> var2 ^ 151316335;
                                                                                    case 2105147173 -> var2 ^ -1711296382;
                                                                                };
                                                                                if (var386 < var479) {
                                                                                    var2 *= 905264121;
                                                                                    var2 ^= -879935164;
                                                                                    long var507 = var2;
                                                                                    long var592 = var507 + 1L;
                                                                                    long var593 = var507 * var592;
                                                                                    var13 = var507 + 2L;
                                                                                    long var594 = var593 * var13;
                                                                                    long var508 = var507 + 3L;
                                                                                    long var595 = var594 * var508;
                                                                                    long var509 = var595 & 7L;
                                                                                    long var816;
                                                                                    int var425 = (var816 = var509 - 0L) == 0L ? 0 : (var816 < 0L ? -1 : 1);
                                                                                    if (var425 != 0) {
                                                                                        break label524;
                                                                                    }

                                                                                    int[] var426 = this.UQ;
                                                                                    int var427 = var426[var386];
                                                                                    int var429 = ++var427 % 31;
                                                                                    double[][] var510 = this.jm;
                                                                                    double[] var511 = var510[var386];
                                                                                    double[] var570 = this.aN;
                                                                                    double var571 = var570[var386];
                                                                                    var511[var429] = var571;
                                                                                    double[][] var512 = this.fW;
                                                                                    double[] var513 = var512[var386];
                                                                                    double[] var572 = this.v;
                                                                                    double var573 = var572[var386];
                                                                                    var513[var429] = var573;
                                                                                    double[][] var514 = this.az;
                                                                                    double[] var515 = var514[var386];
                                                                                    double[] var574 = this.y;
                                                                                    double var575 = var574[var386];
                                                                                    var515[var429] = var575;
                                                                                    int[] var516 = this.UQ;
                                                                                    var516[var386] = var429;
                                                                                    int[] var430 = this.I;
                                                                                    int[] var517 = this.I;
                                                                                    var503 = var517[var386];
                                                                                    var503 = Math.min(++var503, 30);
                                                                                    var430[var386] = var503;
                                                                                    Integer var431 = var3;
                                                                                    if (var431 == null) {
                                                                                        switch (var2) {
                                                                                            case -774707522:
                                                                                            default:
                                                                                                var2 ^= -2139198604;
                                                                                                break label558;
                                                                                            case -643375124:
                                                                                                var2 *= -1636037477;
                                                                                                var2 *= -1026617425;
                                                                                                var2 &= 249752526;
                                                                                                var2 += -1679316711;
                                                                                                var2 ^= 1795716387;
                                                                                                break label558;
                                                                                            case 2048880163:
                                                                                                var2 ^= 1938604043;
                                                                                                break label558;
                                                                                        }
                                                                                    }

                                                                                    var2 <<= 23;
                                                                                    var2 >>= 29;
                                                                                    var2 ^= 528119325;
                                                                                    int var432 = var2 + 1;
                                                                                    int var433 = var2 * var432;
                                                                                    var503 = var2 + 2;
                                                                                    int var434 = var433 * var503;
                                                                                    var503 = var2 + 3;
                                                                                    int var435 = var434 * var503;
                                                                                    int var436 = var435 & 7;
                                                                                    if (var436 != 0) {
                                                                                        break label524;
                                                                                    }

                                                                                    double[] var437 = this.aN;
                                                                                    double var523 = var437[var386];
                                                                                    float[] var596 = this.o;
                                                                                    float var597 = var596[var386];
                                                                                    double var598 = var597;
                                                                                    double var524 = var523 + var598;
                                                                                    var437[var386] = var524;
                                                                                    double[] var438 = this.v;
                                                                                    double var525 = var438[var386];
                                                                                    float[] var599 = this.Jc;
                                                                                    float var600 = var599[var386];
                                                                                    double var601 = var600;
                                                                                    double var526 = var525 + var601;
                                                                                    var438[var386] = var526;
                                                                                    double[] var439 = this.y;
                                                                                    double var527 = var439[var386];
                                                                                    float[] var602 = this.X;
                                                                                    float var603 = var602[var386];
                                                                                    double var604 = var603;
                                                                                    double var528 = var527 + var604;
                                                                                    var439[var386] = var528;
                                                                                    float[] var440 = this.o;
                                                                                    float var529 = var440[var386];
                                                                                    float var530 = var529 * 0.99F;
                                                                                    var440[var386] = var530;
                                                                                    float[] var441 = this.Jc;
                                                                                    float var531 = var441[var386];
                                                                                    float var532 = var531 * 0.99F;
                                                                                    var441[var386] = var532;
                                                                                    float[] var442 = this.X;
                                                                                    float var533 = var442[var386];
                                                                                    float var534 = var533 * 0.99F;
                                                                                    var442[var386] = var534;
                                                                                    int var443 = var386 + 1;
                                                                                    var386 = var443;
                                                                                    switch (var2) {
                                                                                        case -1804055981:
                                                                                        default:
                                                                                            var2 ^= 1571649953;
                                                                                            continue;
                                                                                        case -1695774437:
                                                                                            var2 ^= -850131801;
                                                                                            continue;
                                                                                        case -528119326:
                                                                                            var2 -= 1072215132;
                                                                                            var2 &= -320293;
                                                                                            var2 += 176574956;
                                                                                            var2 <<= 3;
                                                                                            var2 ^= 1445680082;
                                                                                            continue;
                                                                                    }
                                                                                }

                                                                                var2 ^= 1820481909;
                                                                                var2 *= 1252438201;
                                                                                var2 ^= 1369105480;
                                                                            } else {
                                                                                var2 *= -1991763035;
                                                                                var2 -= 427421343;
                                                                                var2 ^= 1890756590;
                                                                            }

                                                                            int var444 = var2 + 1;
                                                                            int var445 = var2 * var444;
                                                                            int var446 = var445 & 1;
                                                                            if (var446 != 0) {
                                                                                break label524;
                                                                            }

                                                                            int var447 = var2 | -1214890591;
                                                                            int var448 = var447 ^ 1374039231;
                                                                            this.f(var386, var448);
                                                                            long var535 = var3;
                                                                            long var605 = var535 + 1L;
                                                                            long var606 = var535 * var605;
                                                                            var13 = var535 + 2L;
                                                                            long var607 = var606 * var13;
                                                                            long var536 = var535 + 3L;
                                                                            long var608 = var607 * var536;
                                                                            long var537 = var608 & 7L;
                                                                            long var817;
                                                                            int var449 = (var817 = var537 - 0L) == 0L ? 0 : (var817 < 0L ? -1 : 1);
                                                                            if (var449 != 0) {
                                                                                var2 |= -1642418389;
                                                                                var2 &= 186075158;
                                                                                var2 -= 1221607015;
                                                                                var2 ^= 212104553;
                                                                                break label558;
                                                                            }
                                                                            var2 = switch (var2) {
                                                                                default -> var2 ^ 394465860;
                                                                                case -1211637848 -> var2 ^ 263920421;
                                                                                case -83603139 -> {
                                                                                    var2 |= -1069727338;
                                                                                    var2 |= 1264344061;
                                                                                    yield var2 ^ 22342539;
                                                                                }
                                                                            };
                                                                            var386 = var386;
                                                                            var2 *= 1410546261;
                                                                            var2 ^= -1531593178;
                                                                        }
                                                                    }
                                                                }
                                                                break label524;
                                                            }

                                                            var2 += -2142737261;
                                                            var2 *= -2070973627;
                                                            var2 |= -552095978;
                                                            var2 |= 2031775778;
                                                            var2 ^= -127232546;
                                                            var494 = var2 >>> 13;
                                                            var494 &= 473301505;
                                                            var494 -= 345343021;
                                                            var494 ^= 173107125;
                                                            this.h(var4, var359, var381, var494);
                                                            var2 ^= 190064624;
                                                            var2 &= -1424124394;
                                                            var2 |= 220180308;
                                                            var2 ^= -649363535;
                                                        }
                                                    }

                                                    var2 *= 1752381651;
                                                    var2 ^= -928620975;
                                                    break label558;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                UnsupportedOperationException var346 = new UnsupportedOperationException();
                throw var346;
            }
        }

        UnsupportedOperationException var340 = new UnsupportedOperationException();
        throw var340;
    }

    private void h(Entity var1, ThreadLocalRandom var2, boolean var3, int var4) {
        label158: {
            int var6 = System.identityHashCode(this);
            int var7 = this.xy;
            int var8 = var6 + 1;
            var8 = var6 * var8;
            var8 &= 1;
            int var18;
            if (var8 != 0) {
                var18 = var4 | -1058186293;
                var18 ^= -1714718213;
            } else {
                label156: {
                    var18 = var4 + -601289310;
                    var18 ^= 510889298;
                    var8 = var7 + 1;
                    this.xy = var8;
                    double[] var119 = this.zv;
                    double[] var9 = this.Ja;
                    double var10 = var1.getX();
                    double var12 = var2.nextDouble(-48.0, 48.0);
                    var10 += var12;
                    var9[var7] = var10;
                    var119[var7] = var10;
                    double[] var120 = this.AB;
                    var9 = this.Ro;
                    var10 = var1.getY();
                    var12 = var2.nextDouble(2.0, 48.0);
                    var10 += var12;
                    var9[var7] = var10;
                    var120[var7] = var10;
                    double[] var121 = this.CM;
                    var9 = this.FA;
                    var10 = var1.getZ();
                    var12 = var2.nextDouble(-48.0, 48.0);
                    var10 += var12;
                    var9[var7] = var10;
                    var121[var7] = var10;
                    float[] var122 = this.d;
                    float var155;
                    if (var3) {
                        var18 *= 976511595;
                        var18 ^= -1184932521;
                        long var151 = var18;
                        long var11 = var151 + 1L;
                        var11 = var151 * var11;
                        long var13 = var151 + 2L;
                        var11 *= var13;
                        long var152 = var151 + 3L;
                        var11 *= var152;
                        long var153 = var11 & 7L;
                        long var248;
                        int var154 = (var248 = var153 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                        if (var154 != 0) {
                            break label158;
                        }

                        var155 = 0.0F;
                        var18 &= -164544821;
                        var18 ^= -1581921426;
                    } else {
                        var18 >>= 4;
                        var18 ^= -1055503583;
                        var10 = var2.nextDouble(-0.4, 0.4);
                        float var182 = (float)var10;
                        long var204 = var6;
                        long var237 = var204 + 1L;
                        var237 = var204 * var237;
                        var204 = var237 & 1L;
                        long var249;
                        int var206 = (var249 = var204 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                        if (var206 != 0) {
                            var18 += 917834649;
                            var18 -= -1491901162;
                            var18 ^= -1661631154;
                            var18 ^= 772371593;
                            break label156;
                        }
                        var18 = switch (var18) {
                            default -> var18 ^ 470275220;
                            case 232997927 -> var18 ^ 2059922002;
                            case 992424276 -> {
                                var18 &= -319101392;
                                yield var18 ^ 1434865812;
                            }
                        };
                        var155 = var182;
                        var18 >>= 29;
                        var18 -= 1903689057;
                        var18 |= 1664455774;
                        var18 <<= 30;
                        var18 ^= 394651622;
                    }

                    var122[var7] = var155;
                    var8 = var6 + 1;
                    var8 = var6 * var8;
                    int var156 = var6 + 2;
                    var8 *= var156;
                    int var157 = var6 + 3;
                    var8 *= var157;
                    var8 &= 7;
                    label151:
                    if (var8 == 0) {
                        var18 >>= 20;
                        var18 &= 153325339;
                        var18 ^= 1769765862;
                        Integer var128 = var18;
                        if (var128 == null) {
                            break label158;
                        }

                        float[] var129 = this.LI;
                        float var163;
                        if (var3) {
                            var18 -= 208045771;
                            var18 -= -452928422;
                            var18 ^= 1469129491;
                            int var158 = var18 + 1;
                            int var159 = var18 * var158;
                            int var160 = var159 & 1;
                            if (var160 != 0) {
                                break label158;
                            }

                            double var161 = var2.nextDouble(-0.2, -0.05);
                            int var207 = var6 + 1;
                            var207 = var6 * var207;
                            var207 &= 1;
                            if (var207 != 0) {
                                switch (var18) {
                                    case 802445820:
                                    default:
                                        var18 ^= 422159786;
                                        break label151;
                                    case 963226826:
                                        var18 ^= -11903001;
                                        var18 ^= -1105734339;
                                        break label151;
                                    case 1115512024:
                                        var18 ^= 1444604953;
                                        break label151;
                                }
                            }

                            var18 &= 215114597;
                            var18 ^= -110510936;
                            long var210 = var18;
                            long var239 = var210 + 1L;
                            var239 = var210 * var239;
                            long var15 = var210 + 2L;
                            var239 *= var15;
                            long var211 = var210 + 3L;
                            var239 *= var211;
                            long var212 = var239 & 7L;
                            long var250;
                            var207 = (var250 = var212 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                            if (var207 != 0) {
                                break label158;
                            }

                            float var162 = (float)var161;
                            var163 = var162;
                            var18 &= -1787834050;
                            var18 -= -1968061834;
                            var18 ^= 261994185;
                        } else {
                            var18 = switch (var18) {
                                case -1998273860 -> var18 ^ -554767730;
                                default -> var18 ^ 125743683;
                                case 1616900862 -> {
                                    var18 -= -990435187;
                                    var18 *= -788741969;
                                    var18 |= 339846785;
                                    var18 += 1232395803;
                                    yield var18 ^ 826877549;
                                }
                            };
                            var10 = var2.nextDouble(-0.1, 0.1);
                            float var184 = (float)var10;
                            int var214 = var6 + 1;
                            var214 = var6 * var214;
                            var214 &= 1;
                            if (var214 != 0) {
                                switch (var18) {
                                    case -871050464:
                                    default:
                                        var18 ^= -361610509;
                                        break label151;
                                    case 606974113:
                                        var18 ^= -1174334395;
                                        break label151;
                                    case 2015470519:
                                        var18 += -1142833410;
                                        var18 ^= 1278690469;
                                        break label151;
                                }
                            }

                            var18 *= 22968001;
                            var18 >>= 4;
                            var18 *= 1464469729;
                            var18 |= -405422417;
                            var18 ^= -778109518;
                            var163 = var184;
                            var18 |= 145859039;
                            var18 &= -684373642;
                            var18 ^= 266025517;
                        }

                        long var185 = var18;
                        long var227 = var185 + 1L;
                        long var228 = var185 * var227;
                        long var14 = var185 + 2L;
                        long var229 = var228 * var14;
                        long var186 = var185 + 3L;
                        long var230 = var229 * var186;
                        long var187 = var230 & 7L;
                        long var251;
                        int var188 = (var251 = var187 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                        if (var188 != 0) {
                            break label158;
                        }

                        var129[var7] = var163;
                        long var130 = var6;
                        long var189 = var130 + 1L;
                        long var190 = var130 * var189;
                        long var231 = var130 + 2L;
                        long var191 = var190 * var231;
                        long var131 = var130 + 3L;
                        long var192 = var191 * var131;
                        long var132 = var192 & 7L;
                        long var252;
                        int var133 = (var252 = var132 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                        if (var133 != 0) {
                            var18 -= 323523521;
                            var18 *= 1047990047;
                            var18 ^= 966163728;
                            var18 -= -693790832;
                            var18 ^= 901306134;
                        } else {
                            label164: {
                                var18 |= 536662658;
                                var18 ^= 1617323800;
                                var18 &= -238465883;
                                var18 ^= 586893821;
                                var133 = var18 + 1;
                                var133 = var18 * var133;
                                int var164 = var18 + 2;
                                var133 *= var164;
                                int var165 = var18 + 3;
                                var133 *= var165;
                                var133 &= 7;
                                if (var133 != 0) {
                                    break label158;
                                }

                                float[] var139 = this.l;
                                float var169;
                                if (var3) {
                                    var18 -= -1966295328;
                                    var18 += -436090343;
                                    var18 |= -1923462369;
                                    var18 &= 418322157;
                                    var18 ^= 299258674;
                                    int var166 = var18 + 1;
                                    int var167 = var18 * var166;
                                    int var168 = var167 & 1;
                                    if (var168 != 0) {
                                        break label158;
                                    }

                                    var169 = 0.0F;
                                    var18 |= -809919602;
                                    var18 *= -422997551;
                                    var18 *= -1095988749;
                                    var18 += 650644801;
                                    var18 ^= 2137745980;
                                } else {
                                    var18 *= 25494901;
                                    var18 &= 482367074;
                                    var18 ^= -1847769756;
                                    int var193 = var18 + 1;
                                    int var194 = var18 * var193;
                                    int var217 = var18 + 2;
                                    int var195 = var194 * var217;
                                    var217 = var18 + 3;
                                    int var196 = var195 * var217;
                                    int var197 = var196 & 7;
                                    if (var197 != 0) {
                                        break label158;
                                    }

                                    var10 = var2.nextDouble(-0.4, 0.4);
                                    long var232 = var6;
                                    var14 = var232 + 1L;
                                    var14 = var232 * var14;
                                    long var16 = var232 + 2L;
                                    var14 *= var16;
                                    long var233 = var232 + 3L;
                                    var14 *= var233;
                                    long var234 = var14 & 7L;
                                    long var253;
                                    int var235 = (var253 = var234 - 0L) == 0L ? 0 : (var253 < 0L ? -1 : 1);
                                    if (var235 != 0) {
                                        var18 ^= 2130241743;
                                        var18 -= 2266080;
                                        var18 *= 434460513;
                                        var18 &= -1619704177;
                                        var18 ^= -61774181;
                                        break label164;
                                    }
                                    var18 = switch (var18) {
                                        case -1726147740 -> {
                                            var18 *= 476525401;
                                            var18 >>= 18;
                                            yield var18 ^ 777850299;
                                        }
                                        default -> var18 ^ -1793280962;
                                        case -63838385 -> var18 ^ 625030646;
                                    };
                                    Integer var236 = var18;
                                    if (var236 == null) {
                                        break label158;
                                    }

                                    float var199 = (float)var10;
                                    var169 = var199;
                                    var18 ^= 964151459;
                                    var18 ^= -693858074;
                                    var18 *= -875231013;
                                    var18 ^= -584399229;
                                }

                                Integer var200 = var18;
                                if (var200 == null) {
                                    break label158;
                                }

                                var139[var7] = var169;
                                int[] var140 = this.Ym;
                                long var170 = var6;
                                long var219 = var170 + 1L;
                                var219 = var170 * var219;
                                long var171 = var219 & 1L;
                                long var254;
                                var6 = (var254 = var171 - 0L) == 0L ? 0 : (var254 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    long var172 = switch (var18) {
                                        case 33172514 -> {
                                            var18 *= 2098720711;
                                            var18 &= 593311224;
                                            var18 &= -27269704;
                                            yield var18 ^ 794652411;
                                        }
                                        default -> var18 ^ -994480555;
                                        case 1185952052 -> var18 ^ -484808957;
                                    };
                                    var219 = var172 + 1L;
                                    var219 = var172 * var219;
                                    long var243 = var172 + 2L;
                                    var219 *= var243;
                                    long var173 = var172 + 3L;
                                    var219 *= var173;
                                    long var174 = var219 & 7L;
                                    long var255;
                                    var6 = (var255 = var174 - 0L) == 0L ? 0 : (var255 < 0L ? -1 : 1);
                                    if (var6 == 0) {
                                        var140[var7] = 0;
                                        int[] var108 = this.U;
                                        var133 = var2.nextInt(100, 301);
                                        var108[var7] = var133;
                                        float[] var109 = this.Iv;
                                        float var142 = var2.nextFloat();
                                        var109[var7] = var142;
                                        float[] var110 = this.f;
                                        double var143 = var2.nextDouble((float) (Math.PI * 2));
                                        float var144 = (float)var143;
                                        var110[var7] = var144;
                                        byte[] var111 = this.DT;
                                        RZ var145 = this.Go;
                                        SpriteShape var146 = var145.xZ(var2);
                                        var133 = var146.ordinal();
                                        byte var148 = (byte)var133;
                                        var111[var7] = var148;
                                        return;
                                    }
                                    break label158;
                                }

                                var18 >>= 27;
                                var18 += -2067315923;
                                var18 &= 2044334157;
                                var18 ^= 2029397533;
                            }
                        }
                    } else {
                        switch (var18) {
                            case -1752832026:
                                var18 ^= -884497167;
                                var18 ^= 620127495;
                                break;
                            case 165728881:
                                var18 ^= 202220418;
                                break;
                            case 734750867:
                            default:
                                var18 ^= 1425868251;
                        }
                    }
                }
            }

            long var100 = var18;
            long var112 = var100 + 1L;
            long var113 = var100 * var112;
            long var175 = var100 + 2L;
            long var114 = var113 * var175;
            long var101 = var100 + 3L;
            long var115 = var114 * var101;
            long var102 = var115 & 7L;
            long var256;
            var18 = (var256 = var102 - 0L) == 0L ? 0 : (var256 < 0L ? -1 : 1);
            if (var18 == 0) {
                UnsupportedOperationException var105 = new UnsupportedOperationException();
                throw var105;
            }
        }

        UnsupportedOperationException var104 = new UnsupportedOperationException();
        throw var104;
    }

    private void Nk(Entity var1, ThreadLocalRandom var2, int var3) {
        int var5 = System.identityHashCode(this);
        int var6 = this.z;
        int var7 = var6 + 1;
        this.z = var7;
        double[] var31 = this.aN;
        double var8 = var1.getX();
        double var10 = var2.nextDouble(-25.0, 25.0);
        var8 += var10;
        var31[var6] = var8;
        double[] var32 = this.v;
        var8 = var1.getY();
        var10 = var2.nextDouble(2.0, 15.0);
        var8 += var10;
        var32[var6] = var8;
        double[] var33 = this.y;
        var8 = var1.getZ();
        var10 = var2.nextDouble(-25.0, 25.0);
        var8 += var10;
        var33[var6] = var8;
        float[] var34 = this.o;
        var8 = var2.nextDouble(-0.2, 0.2);
        float var55 = (float)var8;
        var34[var6] = var55;
        float[] var35 = this.Jc;
        var8 = var2.nextDouble(-0.1, 0.1);
        float var57 = (float)var8;
        var35[var6] = var57;
        float[] var36 = this.X;
        var8 = var2.nextDouble(-0.2, 0.2);
        float var59 = (float)var8;
        var36[var6] = var59;
        int[] var37 = this.zj;
        var37[var6] = 0;
        int[] var38 = this.SB;
        int var60 = var2.nextInt(100, 301);
        var38[var6] = var60;
        int[] var39 = this.UQ;
        var39[var6] = 0;
        int[] var40 = this.I;
        var40[var6] = 0;
        double[][] var41 = this.jm;
        long var61 = var5;
        long var68 = var61 + 1L;
        long var69 = var61 * var68;
        long var62 = var69 & 1L;
        long var74;
        var5 = (var74 = var62 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
        if (var5 == 0) {
            int var19 = var3 & -1583233702;
            var19 -= -1498857032;
            var19 ^= 1881052774;
            long var63 = var19;
            long var70 = var63 + 1L;
            long var71 = var63 * var70;
            long var12 = var63 + 2L;
            long var72 = var71 * var12;
            long var64 = var63 + 3L;
            long var73 = var72 * var64;
            long var65 = var73 & 7L;
            long var75;
            var5 = (var75 = var65 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
            if (var5 != 0) {
                RuntimeException var30 = new RuntimeException();
                throw var30;
            } else {
                double[] var24 = var41[var6];
                double[] var42 = this.aN;
                double var43 = var42[var6];
                var24[0] = var43;
                double[][] var25 = this.fW;
                double[] var26 = var25[var6];
                double[] var44 = this.v;
                double var45 = var44[var6];
                var26[0] = var45;
                double[][] var27 = this.az;
                double[] var28 = var27[var6];
                double[] var46 = this.y;
                double var47 = var46[var6];
                var28[0] = var47;
                float[] var29 = this.Kl;
                float var48 = var2.nextFloat();
                var29[var6] = var48;
            }
        } else {
            int var4 = var3 - -874303384;
            var4 -= -241873209;
            var4 &= -37572056;
            var4 += 250908577;
            var4 ^= -897803492;
            IllegalStateException var18 = new IllegalStateException();
            throw var18;
        }
    }

    private void A(int var1, int var2) {
        int var4 = System.identityHashCode(this);
        int var5 = this.xy;
        this.xy = --var5;
        double[] var6 = this.zv;
        double[] var7 = this.zv;
        double var50 = var7[var5];
        var6[var1] = var50;
        var6 = this.AB;
        var7 = this.AB;
        double var52 = var7[var5];
        var6[var1] = var52;
        var6 = this.CM;
        var7 = this.CM;
        double var54 = var7[var5];
        var6[var1] = var54;
        var6 = this.Ja;
        var7 = this.Ja;
        double var56 = var7[var5];
        var6[var1] = var56;
        var6 = this.Ro;
        var7 = this.Ro;
        double var58 = var7[var5];
        var6[var1] = var58;
        var6 = this.FA;
        var7 = this.FA;
        double var60 = var7[var5];
        var6[var1] = var60;
        int var33 = var4 + 1;
        int var34 = var4 * var33;
        var4 = var34 & 1;
        if (var4 == 0) {
            switch (var2) {
                case 1195453209:
                default:
                    int var16 = var2 ^ 1009409560;
                    break;
                case 1653690524:
                    int var12 = var2 & -1470316690;
                    var12 ^= 423614624;
                    var12 >>>= 16;
                    var12 ^= -13087764;
                    break;
                case 2105208374:
                    int var11 = var2 ^ -652416370;
            }

            float[] var18 = this.d;
            float[] var35 = this.d;
            float var36 = var35[var5];
            var18[var1] = var36;
            float[] var19 = this.LI;
            float[] var37 = this.LI;
            float var38 = var37[var5];
            var19[var1] = var38;
            float[] var20 = this.l;
            float[] var39 = this.l;
            float var40 = var39[var5];
            var20[var1] = var40;
            int[] var21 = this.Ym;
            int[] var41 = this.Ym;
            int var42 = var41[var5];
            var21[var1] = var42;
            int[] var22 = this.U;
            int[] var43 = this.U;
            int var44 = var43[var5];
            var22[var1] = var44;
            float[] var23 = this.Iv;
            float[] var45 = this.Iv;
            float var46 = var45[var5];
            var23[var1] = var46;
            float[] var24 = this.f;
            float[] var47 = this.f;
            float var48 = var47[var5];
            var24[var1] = var48;
            byte[] var25 = this.DT;
            byte[] var49 = this.DT;
            byte var27 = var49[var5];
            var25[var1] = var27;
        } else {
            int var3 = var2 & -325312755;
            var3 ^= -1535232919;
            IllegalArgumentException var10 = new IllegalArgumentException();
            throw var10;
        }
    }

    private void f(int var1, int var2) {
        int var5 = System.identityHashCode(this);
        int var6 = this.z;
        this.z = --var6;
        double[] var7 = this.aN;
        double[] var8 = this.aN;
        double var52 = var8[var6];
        var7[var1] = var52;
        var7 = this.v;
        var8 = this.v;
        double var54 = var8[var6];
        var7[var1] = var54;
        var7 = this.y;
        var8 = this.y;
        double var56 = var8[var6];
        var7[var1] = var56;
        float[] var42 = this.o;
        float[] var57 = this.o;
        float var58 = var57[var6];
        var42[var1] = var58;
        float[] var43 = this.Jc;
        float[] var59 = this.Jc;
        float var60 = var59[var6];
        var43[var1] = var60;
        float[] var44 = this.X;
        float[] var61 = this.X;
        float var62 = var61[var6];
        var44[var1] = var62;
        int[] var45 = this.zj;
        int[] var63 = this.zj;
        int var64 = var63[var6];
        var45[var1] = var64;
        int[] var46 = this.SB;
        int[] var65 = this.SB;
        int var66 = var65[var6];
        var46[var1] = var66;
        int[] var47 = this.UQ;
        int[] var67 = this.UQ;
        int var68 = var67[var6];
        var47[var1] = var68;
        int[] var48 = this.I;
        int[] var69 = this.I;
        int var70 = var69[var6];
        var48[var1] = var70;
        float[] var49 = this.Kl;
        float[] var71 = this.Kl;
        float var72 = var71[var6];
        var49[var1] = var72;
        double[][] var50 = this.jm;
        var7 = var50[var1];
        double[][] var73 = this.fW;
        var8 = var73[var1];
        double[][] var9 = this.az;
        double[] var75 = var9[var1];
        double[][] var10 = this.jm;
        double[][] var11 = this.jm;
        double[] var77 = var11[var6];
        var10[var1] = var77;
        var10 = this.fW;
        var11 = this.fW;
        long var12 = var5;
        long var14 = var12 + 1L;
        var14 = var12 * var14;
        var12 = var14 & 1L;
        long var90;
        var5 = (var90 = var12 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
        if (var5 != 0) {
            int var3 = var2 * -825450755;
            var3 ^= 157364349;
            var12 = var1;
            var14 = var12 + 1L;
            var14 = var12 * var14;
            long var16 = var12 + 2L;
            var14 *= var16;
            var12 += 3L;
            var14 *= var12;
            var12 = var14 & 7L;
            long var91;
            var5 = (var91 = var12 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
            if (var5 == 0) {
                IllegalArgumentException var38 = new IllegalArgumentException();
                throw var38;
            }
        } else {
            switch (var2) {
                case -1607194850:
                default:
                    int var25 = var2 ^ 1331301193;
                    break;
                case -1368370942:
                    int var20 = var2 * -1385559159;
                    var20 ^= 1022894722;
                    var20 += -1794246435;
                    var20 &= 602152373;
                    var20 ^= -953477937;
                    break;
                case -1162734991:
                    int var19 = var2 ^ -1806660491;
            }

            long var26 = var1;
            var12 = var26 + 1L;
            var12 = var26 * var12;
            var26 = var12 & 1L;
            long var92;
            int var28 = (var92 = var26 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
            if (var28 == 0) {
                double[] var30 = var11[var6];
                var10[var1] = var30;
                double[][] var31 = this.az;
                double[][] var4 = this.az;
                double[] var35 = var4[var6];
                var31[var1] = var35;
                double[][] var32 = this.jm;
                var32[var6] = var7;
                double[][] var33 = this.fW;
                var33[var6] = var8;
                double[][] var34 = this.az;
                var34[var6] = var75;
                return;
            }
        }

        IllegalArgumentException var29 = new IllegalArgumentException();
        throw var29;
    }

    private void u(T var1) {
        label690: {
            label649: {
                int var2 = w;
                var2 ^= 576082869;
                int var3 = System.identityHashCode(this);
                Integer var4 = var3;
                if (var4 == null) {
                    var2 += 1076389764;
                    var2 ^= -643382922;
                } else {
                    label675: {
                        var2 = switch (var2) {
                            case -28177745 -> {
                                var2 -= -1099552102;
                                var2 &= 1609734216;
                                yield var2 ^ 2026568481;
                            }
                            default -> var2 ^ 1891125078;
                            case 1850820235 -> var2 ^ -1801606557;
                        };
                        int var378 = var2 + 1;
                        var378 = var2 * var378;
                        var378 &= 1;
                        if (var378 != 0) {
                            break label690;
                        }

                        RenderPhase var381 = var1.phase();
                        Object var5 = RenderPhase.WORLD;
                        if (var381 == var5) {
                            var2 = switch (var2) {
                                default -> var2 ^ -1707966204;
                                case 749264533 -> var2 ^ 748501622;
                                case 1729657633 -> {
                                    var2 &= -1512592798;
                                    var2 <<= 15;
                                    var2 |= -1833723488;
                                    yield var2 ^ 434050424;
                                }
                            };
                            Integer var382 = var2;
                            if (var382 == null) {
                                break label690;
                            }

                            var382 = (Integer)this.T;
                            long var389 = var3;
                            long var7 = var389 + 1L;
                            var7 = var389 * var7;
                            long var9 = var389 + 2L;
                            var7 *= var9;
                            long var390 = var389 + 3L;
                            var7 *= var390;
                            long var391 = var7 & 7L;
                            long var873;
                            int var392 = (var873 = var391 - 0L) == 0L ? 0 : (var873 < 0L ? -1 : 1);
                            if (var392 != 0) {
                                var2 -= 322989942;
                                var2 <<= 13;
                                var2 &= -1335055816;
                                var2 ^= 1743827781;
                                break label675;
                            }

                            var2 &= -1095282287;
                            var2 -= -1762011392;
                            var2 ^= -252296034;
                            if (var382 != null) {
                                var2 ^= 241996281;
                                var2 *= -1865164261;
                                var2 ^= -1885140414;
                                Entity var384 = i_2.QI();
                                long var393 = var3;
                                var7 = var393 + 1L;
                                var7 = var393 * var7;
                                long var394 = var7 & 1L;
                                long var874;
                                int var395 = (var874 = var394 - 0L) == 0L ? 0 : (var874 < 0L ? -1 : 1);
                                if (var395 != 0) {
                                    var2 ^= -2099973046;
                                    var2 &= -348134446;
                                    var2 *= -1464884781;
                                    var2 -= -363519531;
                                    var2 ^= 1303549806;
                                    break label675;
                                }

                                var2 ^= -2023942813;
                                var2 |= -582881150;
                                var2 &= -110702582;
                                var2 ^= 592787877;
                                long var396 = var2;
                                var7 = var396 + 1L;
                                var7 = var396 * var7;
                                var9 = var396 + 2L;
                                var7 *= var9;
                                long var397 = var396 + 3L;
                                var7 *= var397;
                                long var398 = var7 & 7L;
                                long var875;
                                int var399 = (var875 = var398 - 0L) == 0L ? 0 : (var875 < 0L ? -1 : 1);
                                if (var399 != 0) {
                                    break label690;
                                }

                                if (var384 == null) {
                                    var2 *= -1528491473;
                                    var2 *= -1132476253;
                                    var2 &= -886240282;
                                    var2 -= -285026067;
                                    var2 ^= -1067448857;
                                    break label649;
                                }

                                var2 ^= 375987273;
                                var2 |= -1198143232;
                                var2 ^= 743086584;
                                var2 -= -850628822;
                                var2 ^= 865175124;
                                Integer var400 = var2;
                                if (var400 == null) {
                                    break label690;
                                }

                                var5 = (RenderPhase)this.T;
                                World var385 = var384.getEntityWorld();
                                long var6 = var3;
                                long var8 = var6 + 1L;
                                var8 = var6 * var8;
                                long var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var876;
                                int var410 = (var876 = var6 - 0L) == 0L ? 0 : (var876 < 0L ? -1 : 1);
                                if (var410 != 0) {
                                    switch (var2) {
                                        case -1740729015:
                                        default:
                                            var2 ^= 577724794;
                                            break label675;
                                        case 372869707:
                                            var2 ^= 948614633;
                                            break label675;
                                        case 821785248:
                                            var2 -= -1078262818;
                                            var2 ^= -1768104569;
                                            break label675;
                                    }
                                }

                                var2 ^= 542192382;
                                var2 ^= -210202003;
                                var6 = var2;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var877;
                                int var414 = (var877 = var6 - 0L) == 0L ? 0 : (var877 < 0L ? -1 : 1);
                                if (var414 != 0) {
                                    break label690;
                                }

                                if (var5 != var385) {
                                    switch (var2) {
                                        case -472722893:
                                            var2 ^= 35985857;
                                            var2 ^= 850518272;
                                            break label649;
                                        case 18083560:
                                            var2 ^= -612144886;
                                            break label649;
                                        case 1802667763:
                                        default:
                                            var2 ^= 560601255;
                                            break label649;
                                    }
                                }

                                var2 -= 1083993759;
                                var2 += 307913691;
                                var2 &= -253502916;
                                var2 ^= -1637227106;
                                var382 = var2;
                                if (var382 == null) {
                                    break label690;
                                }

                                Canvas var387 = var1.canvas();
                                Canvas var388 = var387;
                                Ud var402 = Ud.Z();
                                AuraPipeline var403 = var402.Ul();
                                WorldDraw var404 = var403.world();
                                int var415 = var3 + 1;
                                int var416 = var3 * var415;
                                int var417 = var416 & 1;
                                if (var417 != 0) {
                                    var2 |= -810313991;
                                    var2 += -1988823139;
                                    var2 &= 1996244799;
                                    var2 ^= -1750289315;
                                    break label675;
                                }

                                var2 *= 1096387657;
                                var2 *= -1085799265;
                                var2 ^= 1098579464;
                                WorldDraw var405 = var404;
                                FrameContext var418 = var1.frame();
                                float var419 = var418.partialTick();
                                float var420 = var419;
                                FrameContext var430 = var1.frame();
                                double var431 = var430.time();
                                double var432 = var431;
                                var387.save();
                                Uq var443 = this.DS;
                                float var444 = var443.WM();
                                var387.additive(var444);
                                Uq var445 = this.g;
                                float var446 = var445.WM();
                                float var447 = 0.32F * var446;
                                float var448 = var447;
                                byte var457 = 0;
                                int var458 = var457;
                                var2 -= 1159287460;
                                var2 ^= 1684141424;

                                while (true) {
                                    long var11 = var2;
                                    long var13 = var11 + 1L;
                                    var13 = var11 * var13;
                                    var11 = var13 & 1L;
                                    long var878;
                                    int var464 = (var878 = var11 - 0L) == 0L ? 0 : (var878 < 0L ? -1 : 1);
                                    if (var464 != 0) {
                                        break label690;
                                    }

                                    int var465 = this.xy;
                                    long var12 = var3;
                                    long var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    var12 = var14 & 1L;
                                    long var879;
                                    int var493 = (var879 = var12 - 0L) == 0L ? 0 : (var879 < 0L ? -1 : 1);
                                    if (var493 != 0) {
                                        var2 |= -1155977965;
                                        var2 += -1874215006;
                                        var2 *= 1136167867;
                                        var2 ^= -1834963737;
                                        var2 ^= 813835701;
                                        break label675;
                                    }

                                    var2 &= -1969065926;
                                    var2 |= -1546510055;
                                    var2 ^= 1044790016;
                                    if (var458 >= var465) {
                                        var2 &= 172121446;
                                        var2 *= -365766749;
                                        var2 &= -663932487;
                                        var2 ^= -1968186683;
                                        var9 = var2;
                                        var11 = var9 + 1L;
                                        var11 = var9 * var11;
                                        var13 = var9 + 2L;
                                        var11 *= var13;
                                        var9 += 3L;
                                        var11 *= var9;
                                        var9 = var11 & 7L;
                                        long var894;
                                        int var452 = (var894 = var9 - 0L) == 0L ? 0 : (var894 < 0L ? -1 : 1);
                                        if (var452 != 0) {
                                            break label690;
                                        }

                                        Uq var453 = this.nN;
                                          int var454 = var453.B();
                                        int var455 = var454;
                                        Uq var459 = this.F;
                                        float var460 = var459.WM();
                                        float var461 = 0.07F * var460;
                                        float var462 = var461;
                                        int var470 = var3 + 1;
                                        int var471 = var3 * var470;
                                        int var472 = var471 & 1;
                                        if (var472 != 0) {
                                            switch (var2) {
                                                case -527318312:
                                                default:
                                                    var2 ^= -2050273421;
                                                    break label675;
                                                case 47184741:
                                                    var2 >>= 29;
                                                    var2 ^= 454212328;
                                                    var2 ^= -53605971;
                                                    break label675;
                                                case 768738866:
                                                    var2 ^= 1649715069;
                                                    break label675;
                                            }
                                        }

                                        var2 |= -1758383758;
                                        var2 ^= -352773747;
                                        Integer var473 = var2;
                                        if (var473 == null) {
                                            break label690;
                                        }

                                        byte var474 = 0;
                                        int var475 = var474;
                                        var2 += -868694129;
                                        var2 += 696658681;
                                        var2 ^= 1775581668;
                                        var2 ^= -1911082088;

                                        while (true) {
                                            int var494 = this.z;
                                            int var537 = var3 + 1;
                                            int var538 = var3 * var537;
                                            int var539 = var538 & 1;
                                            if (var539 != 0) {
                                                var2 >>>= 24;
                                                var2 |= -1279919203;
                                                var2 ^= -1480338717;
                                                var2 &= -641997847;
                                                var2 ^= -135359955;
                                                break label675;
                                            }

                                            var2 ^= -916976979;
                                            var2 *= -2028206433;
                                            var2 |= 1585907391;
                                            var2 ^= -1421792408;
                                            if (var475 >= var494) {
                                                long var406 = switch (var2) {
                                                    case -570898297 -> var2 ^ -2142089627;
                                                    case 1440636375 -> {
                                                        var2 >>= 27;
                                                        var2 += -874473734;
                                                        yield var2 ^ 1978721100;
                                                    }
                                                    default -> var2 ^ 1569440141;
                                                };
                                                var7 = var406 + 1L;
                                                var7 = var406 * var7;
                                                long var407 = var7 & 1L;
                                                long var905;
                                                var3 = (var905 = var407 - 0L) == 0L ? 0 : (var905 < 0L ? -1 : 1);
                                                if (var3 == 0) {
                                                    var388.restore();
                                                    return;
                                                }
                                                break label690;
                                            }
                                            var2 = switch (var2) {
                                                case -895073712 -> var2 ^ -1198333725;
                                                default -> var2 ^ 420013332;
                                                case 1440636375 -> {
                                                    var2 >>= 22;
                                                    var2 |= -167445054;
                                                    yield var2 ^ -1280141076;
                                                }
                                            };
                                            int var495 = var2 + 1;
                                            int var496 = var2 * var495;
                                            int var540 = var2 + 2;
                                            int var497 = var496 * var540;
                                            int var541 = var2 + 3;
                                            int var498 = var497 * var541;
                                            int var499 = var498 & 7;
                                            if (var499 != 0) {
                                                break label690;
                                            }

                                            int[] var500 = this.zj;
                                            int var501 = var500[var475];
                                            float var502 = var501;
                                            float var503 = var502 + var420;
                                            float var542 = var503 / 10.0F;
                                            float var543 = TP.S(var542);
                                            int[] var581 = this.SB;
                                            int var582 = var581[var475];
                                            float var583 = var582;
                                            float var504 = var503 / var583;
                                            float var505 = 1.0F - var504;
                                            Integer var584 = var3;
                                            if (var584 == null) {
                                                var2 |= -727688884;
                                                var2 |= 1234242793;
                                                var2 *= 356829273;
                                                var2 ^= 908768994;
                                                break label675;
                                            }
                                            var2 = switch (var2) {
                                                case -425540439 -> var2 ^ -1707523635;
                                                case 1169581371 -> {
                                                    var2 += -1992849407;
                                                    var2 &= 327026512;
                                                    yield var2 ^ 2076389449;
                                                }
                                                default -> var2 ^ -4081426;
                                            };
                                            int var585 = var2 + 1;
                                            int var586 = var2 * var585;
                                            int var15 = var2 + 2;
                                            int var587 = var586 * var15;
                                            var15 = var2 + 3;
                                            int var588 = var587 * var15;
                                            int var589 = var588 & 7;
                                            if (var589 != 0) {
                                                break label690;
                                            }

                                            float var506 = var543 * var505;
                                            float var507 = var506;
                                            float var895;
                                            int var544 = (var895 = var506 - 0.01F) == 0.0F ? 0 : (var895 < 0.0F ? -1 : 1);
                                            if (var544 <= 0) {
                                                var2 *= 1676290865;
                                                var2 &= 1808106424;
                                                var2 ^= 705779979;
                                                var2 += -363696373;
                                                var2 *= 1756740621;
                                                var2 += 139064496;
                                                var2 ^= 24301164;
                                            } else {
                                                var2 *= 779505361;
                                                var2 ^= -1992575315;
                                                var13 = var2;
                                                long var641 = var13 + 1L;
                                                long var642 = var13 * var641;
                                                var13 = var642 & 1L;
                                                long var896;
                                                int var547 = (var896 = var13 - 0L) == 0L ? 0 : (var896 < 0L ? -1 : 1);
                                                if (var547 != 0) {
                                                    break label690;
                                                }

                                                zS var548 = this.Ps;
                                                float[] var590 = this.Kl;
                                                float var591 = var590[var475];
                                                int var549 = var548.x(var591, var432);
                                                int var550 = var549;
                                                int[] var592 = this.I;
                                                int var593 = var592[var475];
                                                var593--;
                                                long var643 = var3;
                                                long var17 = var643 + 1L;
                                                var17 = var643 * var17;
                                                long var644 = var17 & 1L;
                                                long var897;
                                                var15 = (var897 = var644 - 0L) == 0L ? 0 : (var897 < 0L ? -1 : 1);
                                                if (var15 != 0) {
                                                    switch (var2) {
                                                        case -2067636435:
                                                            var2 ^= -1240798257;
                                                            break label675;
                                                        case -966124284:
                                                            var2 ^= -1851698455;
                                                            var2 -= -995097056;
                                                            var2 |= -480630964;
                                                            var2 ^= 1714985236;
                                                            var2 ^= 1925137820;
                                                            break label675;
                                                        case 1620903823:
                                                        default:
                                                            var2 ^= 1718260596;
                                                            break label675;
                                                    }
                                                }

                                                var2 |= -2084820299;
                                                var2 += 673782899;
                                                var2 ^= 712989931;
                                                var15 = var2 + 1;
                                                var15 = var2 * var15;
                                                int var16 = var2 + 2;
                                                var15 *= var16;
                                                var16 = var2 + 3;
                                                var15 *= var16;
                                                var15 &= 7;
                                                if (var15 != 0) {
                                                    break label690;
                                                }

                                                int var595 = Math.min(var593, var455);
                                                int var596 = var595;
                                                var2 -= -22329356;
                                                var2 *= -648171547;
                                                var2 -= -404773616;
                                                var2 -= 867871645;
                                                var2 ^= 1468893988;

                                                while (var596 >= 0) {
                                                    var2 += 604517814;
                                                    var2 &= -1919700539;
                                                    var2 ^= -1802796032;
                                                    Integer var651 = var2;
                                                    if (var651 == null) {
                                                        break label690;
                                                    }

                                                    double var700;
                                                    double var776;
                                                    double var810;
                                                    if (var596 == 0) {
                                                        var2 *= -1092101139;
                                                        var2 ^= -444958893;
                                                        var2 ^= 1177534686;
                                                        var2 -= 1416324700;
                                                        var2 ^= 1462666925;
                                                        int[] var652 = this.UQ;
                                                        int var653 = var652[var475];
                                                        double[][] var696 = this.jm;
                                                        double[] var697 = var696[var475];
                                                        double var698 = var697[var653];
                                                        double[] var18 = this.aN;
                                                        var776 = var18[var475];
                                                        var810 = var420;
                                                        double var699 = TP.y(var698, var776, var810);
                                                        double[][] var772 = this.fW;
                                                        double[] var773 = var772[var475];
                                                        var776 = var773[var653];
                                                        double[] var802 = this.v;
                                                        var810 = var802[var475];
                                                        double var22 = var420;
                                                        var776 = TP.y(var776, var810, var22);
                                                        Integer var804 = var3;
                                                        if (var804 == null) {
                                                            var2 += 1463221117;
                                                            var2 -= 1586966040;
                                                            var2 ^= 361880132;
                                                            break label675;
                                                        }

                                                        var2 += -1614163507;
                                                        var2 += -114765192;
                                                        var2 -= 266362742;
                                                        var2 ^= -332211549;
                                                        var2 ^= 1661328910;
                                                        Integer var805 = var2;
                                                        if (var805 == null) {
                                                            break label690;
                                                        }

                                                        double[][] var806 = this.az;
                                                        double[] var807 = var806[var475];
                                                        var810 = var807[var653];
                                                        double[] var822 = this.y;
                                                        var22 = var822[var475];
                                                        double var24 = var420;
                                                        var810 = TP.y(var810, var22, var24);
                                                        var700 = var699;
                                                        var776 = var776;
                                                        var810 = var810;
                                                        switch (var2) {
                                                            case -1448810776:
                                                                var2 ^= 701610144;
                                                                break;
                                                            case -555342912:
                                                            default:
                                                                var2 ^= -1285697092;
                                                                break;
                                                            case 227075270:
                                                                var2 *= -2132623105;
                                                                var2 |= -1345162126;
                                                                var2 ^= 1324611449;
                                                        }
                                                    } else {
                                                        var2 ^= -145603549;
                                                        var2 += 665056338;
                                                        var2 -= -958850297;
                                                        var2 ^= 113333108;
                                                        long var824 = var2;
                                                        long var842 = var824 + 1L;
                                                        var842 = var824 * var842;
                                                        var824 = var842 & 1L;
                                                        long var898;
                                                        int var826 = (var898 = var824 - 0L) == 0L ? 0 : (var898 < 0L ? -1 : 1);
                                                        if (var826 != 0) {
                                                            break label690;
                                                        }

                                                        int[] var827 = this.UQ;
                                                        int var828 = var827[var475];
                                                        int var829 = var828 - var596;
                                                        int var831 = Math.floorMod(++var829, 31);
                                                        int[] var832 = this.UQ;
                                                        int var833 = var832[var475];
                                                        int var834 = var833 - var596;
                                                        int var835 = Math.floorMod(var834, 31);
                                                        double[][] var23 = this.jm;
                                                        double[] var839 = var23[var475];
                                                        double var840 = var839[var835];
                                                        double[][] var25 = this.jm;
                                                        double[] var844 = var25[var475];
                                                        double var845 = var844[var831];
                                                        double var27 = var420;
                                                        double var841 = TP.y(var840, var845, var27);
                                                        var25 = this.fW;
                                                        long var26 = var3;
                                                        long var28 = var26 + 1L;
                                                        var28 = var26 * var28;
                                                        long var30 = var26 + 2L;
                                                        var28 *= var30;
                                                        var26 += 3L;
                                                        var28 *= var26;
                                                        var26 = var28 & 7L;
                                                        long var899;
                                                        int var852 = (var899 = var26 - 0L) == 0L ? 0 : (var899 < 0L ? -1 : 1);
                                                        if (var852 != 0) {
                                                            var2 &= -873918493;
                                                            var2 ^= -2090550476;
                                                            var2 >>>= 16;
                                                            var2 ^= -1747999560;
                                                            var2 ^= 1880317304;
                                                            break label675;
                                                        }

                                                        var2 -= -6332132;
                                                        var2 &= 1963793519;
                                                        var2 += 881390179;
                                                        var2 >>= 25;
                                                        var2 ^= -283091713;
                                                        var26 = var2;
                                                        var28 = var26 + 1L;
                                                        var28 = var26 * var28;
                                                        var30 = var26 + 2L;
                                                        var28 *= var30;
                                                        var26 += 3L;
                                                        var28 *= var26;
                                                        var26 = var28 & 7L;
                                                        long var900;
                                                        int var856 = (var900 = var26 - 0L) == 0L ? 0 : (var900 < 0L ? -1 : 1);
                                                        if (var856 != 0) {
                                                            break label690;
                                                        }

                                                        double[] var847 = var25[var475];
                                                        double var848 = var847[var835];
                                                        double[][] var857 = this.fW;
                                                        double[] var858 = var857[var475];
                                                        var27 = var858[var831];
                                                        double var29 = var420;
                                                        double var849 = TP.y(var848, var27, var29);
                                                        double[][] var860 = this.az;
                                                        double[] var861 = var860[var475];
                                                        var27 = var861[var835];
                                                        double[][] var836 = this.az;
                                                        double[] var837 = var836[var475];
                                                        var29 = var837[var831];
                                                        double var31 = var420;
                                                        var27 = TP.y(var27, var29, var31);
                                                        var700 = var841;
                                                        var776 = var849;
                                                        var810 = var27;
                                                        switch (var2) {
                                                            case -1514876342:
                                                                var2 ^= 240625101;
                                                                break;
                                                            case -341695046:
                                                            default:
                                                                var2 ^= 841931505;
                                                                break;
                                                            case -283091773:
                                                                var2 *= -203551203;
                                                                var2 *= 1246851033;
                                                                var2 ^= -909845892;
                                                        }
                                                    }

                                                    var651 = var2;
                                                    if (var651 == null) {
                                                        break label690;
                                                    }

                                                    boolean var656 = var405.at(var388, var700, var776, var810);
                                                    Integer var701 = var3;
                                                    if (var701 == null) {
                                                        switch (var2) {
                                                            case -1638589290:
                                                            default:
                                                                var2 ^= -2092880821;
                                                                break label675;
                                                            case -250772989:
                                                                var2 ^= -201718362;
                                                                var2 -= 1832274526;
                                                                var2 ^= 1914539522;
                                                                break label675;
                                                            case 1421596844:
                                                                var2 ^= -1679283062;
                                                                break label675;
                                                        }
                                                    }

                                                    var2 ^= -2128134415;
                                                    var2 &= 10160076;
                                                    var2 -= -1012750015;
                                                    var2 ^= -698496450;
                                                    var701 = var2;
                                                    if (var701 == null) {
                                                        break label690;
                                                    }

                                                    if (!var656) {
                                                        var2 -= -1331912626;
                                                        var2 -= -1637699527;
                                                        var2 -= 366363053;
                                                        var2 ^= -273331043;
                                                        int var657 = var2 + 1;
                                                        var657 = var2 * var657;
                                                        int var703 = var2 + 2;
                                                        var657 *= var703;
                                                        var703 = var2 + 3;
                                                        var657 *= var703;
                                                        var657 &= 7;
                                                        if (var657 != 0) {
                                                            break label690;
                                                        }

                                                        var2 ^= 1075700017;
                                                        var2 += 167927534;
                                                        var2 ^= 660881787;
                                                    } else {
                                                        var2 = switch (var2) {
                                                            case -365260479 -> {
                                                                var2 >>= 9;
                                                                var2 <<= 14;
                                                                var2 &= 148267547;
                                                                var2 ^= 708460882;
                                                                yield var2 ^ 787634105;
                                                            }
                                                            default -> var2 ^ -1253786873;
                                                            case 1269010921 -> var2 ^ -1699066877;
                                                        };
                                                        float var662 = var596;
                                                        float var663 = var662 + var420;
                                                        var701 = var3;
                                                        if (var701 == null) {
                                                            switch (var2) {
                                                                case -1473421857:
                                                                default:
                                                                    var2 ^= 794471653;
                                                                    break label675;
                                                                case -633109323:
                                                                    var2 ^= -1183103071;
                                                                    break label675;
                                                                case 77207275:
                                                                    var2 += 391054633;
                                                                    var2 += 1770189389;
                                                                    var2 += -860863830;
                                                                    var2 ^= -1891055719;
                                                                    var2 ^= 982001111;
                                                                    break label675;
                                                            }
                                                        }

                                                        var2 ^= 1509147236;
                                                        var2 &= -775627297;
                                                        var2 -= -48699800;
                                                        var2 ^= -310934016;
                                                        float var706 = var455;
                                                        var706++;
                                                        float var664 = var663 / var706;
                                                        float var665 = 1.0F - var664;
                                                        float var708 = var405.unitsPerBlock();
                                                        float var709 = var462 * var708;
                                                        float var739 = 0.55F * var665;
                                                        float var740 = 0.45F + var739;
                                                        float var710 = var709 * var740;
                                                        float var901;
                                                        int var741 = (var901 = var710 - 0.2F) == 0.0F ? 0 : (var901 < 0.0F ? -1 : 1);
                                                        if (var741 < 0) {
                                                            var2 = switch (var2) {
                                                                default -> var2 ^ 1192637177;
                                                                case -1185912793 -> {
                                                                    var2 ^= 2066032844;
                                                                    var2 &= -1358698842;
                                                                    var2 ^= -1507703273;
                                                                    yield var2 ^ 1180907020;
                                                                }
                                                                case 1545975390 -> var2 ^ -176605870;
                                                            };
                                                            var17 = var2;
                                                            long var19 = var17 + 1L;
                                                            var19 = var17 * var19;
                                                            long var21 = var17 + 2L;
                                                            var19 *= var21;
                                                            var17 += 3L;
                                                            var19 *= var17;
                                                            var17 = var19 & 7L;
                                                            long var902;
                                                            int var745 = (var902 = var17 - 0L) == 0L ? 0 : (var902 < 0L ? -1 : 1);
                                                            if (var745 != 0) {
                                                                break label690;
                                                            }

                                                            var2 >>= 10;
                                                            var2 ^= 330457336;
                                                        } else {
                                                            var2 &= -267399019;
                                                            var2 &= -580584910;
                                                            var2 >>= 1;
                                                            var2 ^= -603529710;
                                                            int var746 = var2 + 1;
                                                            int var747 = var2 * var746;
                                                            int var777 = var2 + 2;
                                                            int var748 = var747 * var777;
                                                            int var778 = var2 + 3;
                                                            int var749 = var748 * var778;
                                                            int var750 = var749 & 7;
                                                            if (var750 != 0) {
                                                                break label690;
                                                            }

                                                            float var666 = var507 * var665;
                                                            int var751 = var3 + 1;
                                                            int var752 = var3 * var751;
                                                            int var753 = var752 & 1;
                                                            if (var753 != 0) {
                                                                var2 >>>= 14;
                                                                var2 ^= -404954274;
                                                                break label675;
                                                            }

                                                            var2 &= 1829284799;
                                                            var2 *= -189232377;
                                                            var2 ^= -216694306;
                                                            float var755;
                                                            if (var596 == 0) {
                                                                var2 &= 1716781519;
                                                                var2 ^= 1054851141;
                                                                Integer var754 = var2;
                                                                if (var754 == null) {
                                                                    break label690;
                                                                }

                                                                var755 = 1.0F;
                                                                var2 *= -1579820765;
                                                                var2 ^= -745045050;
                                                            } else {
                                                                var2 += -145213772;
                                                                var2 <<= 26;
                                                                var2 &= 198840106;
                                                                var2 ^= -723407309;
                                                                var755 = 0.55F;
                                                                switch (var2) {
                                                                    case -723407309:
                                                                        var2 >>>= 8;
                                                                        var2 += 1099398912;
                                                                        var2 -= -1334823942;
                                                                        var2 ^= 380360093;
                                                                        break;
                                                                    case 680681926:
                                                                        var2 ^= -419976117;
                                                                        break;
                                                                    case 1893450557:
                                                                    default:
                                                                        var2 ^= -680099955;
                                                                }
                                                            }

                                                            long var779 = var2;
                                                            long var811 = var779 + 1L;
                                                            long var812 = var779 * var811;
                                                            long var838 = var779 + 2L;
                                                            long var813 = var812 * var838;
                                                            long var780 = var779 + 3L;
                                                            long var814 = var813 * var780;
                                                            long var781 = var814 & 7L;
                                                            long var903;
                                                            int var782 = (var903 = var781 - 0L) == 0L ? 0 : (var903 < 0L ? -1 : 1);
                                                            if (var782 != 0) {
                                                                break label690;
                                                            }

                                                            float var667 = var666 * var755;
                                                            int var668 = DP.Y(var550, var667);
                                                            var388.save();
                                                            float var756 = var405.depth();
                                                            var388.depth(var756);
                                                            SpriteShape var757 = SpriteShape.FIREFLY;
                                                            float var783 = var405.x();
                                                            float var798 = var405.y();
                                                            Integer var815 = var3;
                                                            if (var815 == null) {
                                                                var2 ^= 824715378;
                                                                var2 &= -597603040;
                                                                var2 -= 325454037;
                                                                var2 ^= 1730644846;
                                                                break label675;
                                                            }

                                                            var2 *= 517050315;
                                                            var2 |= 403407629;
                                                            var2 ^= 1951313919;
                                                            Integer var816 = var2;
                                                            if (var816 == null) {
                                                                break label690;
                                                            }

                                                            float var817 = var710 * 4.5F;
                                                            int var820 = var668 | 16777215;
                                                            var820 = DP.Z(var668, var820, 0.55F);
                                                            var388.sprite(var757, var783, var798, var710, var817, var820, var668, 0.0F);
                                                            var388.restore();
                                                            switch (var2) {
                                                                case -822782864:
                                                                    var2 |= 1491779624;
                                                                    var2 ^= -850058100;
                                                                    break;
                                                                case 773244282:
                                                                    var2 ^= -924927514;
                                                                    break;
                                                                case 1550992281:
                                                                default:
                                                                    var2 ^= -329570772;
                                                            }
                                                        }
                                                    }

                                                    int var669 = var596 + -1;
                                                    int var711 = var3 + 1;
                                                    var711 = var3 * var711;
                                                    var711 &= 1;
                                                    if (var711 != 0) {
                                                        var2 |= 1075341356;
                                                        var2 -= 1906064420;
                                                        var2 ^= 96604061;
                                                        break label675;
                                                    }

                                                    var2 |= 1222469330;
                                                    var2 ^= -66739911;
                                                    var2 <<= 4;
                                                    var2 ^= 1102028494;
                                                    long var714 = var2;
                                                    long var784 = var714 + 1L;
                                                    long var785 = var714 * var784;
                                                    long var715 = var785 & 1L;
                                                    long var904;
                                                    var711 = (var904 = var715 - 0L) == 0L ? 0 : (var904 < 0L ? -1 : 1);
                                                    if (var711 != 0) {
                                                        break label690;
                                                    }

                                                    var596 = var669;
                                                    var2 *= -370133179;
                                                    var2 ^= 1192270092;
                                                    var2 ^= -1789337632;
                                                }

                                                var2 *= 484835759;
                                                var2 &= -500945925;
                                                var2 |= 2106082944;
                                                var2 ^= 1694038408;
                                            }

                                            Integer var508 = var2;
                                            if (var508 == null) {
                                                break label690;
                                            }

                                            int var509 = var475 + 1;
                                            int var551 = var3 + 1;
                                            int var552 = var3 * var551;
                                            int var597 = var3 + 2;
                                            int var553 = var552 * var597;
                                            int var598 = var3 + 3;
                                            int var554 = var553 * var598;
                                            int var555 = var554 & 7;
                                            if (var555 != 0) {
                                                var2 -= 763477875;
                                                var2 *= 1200760473;
                                                var2 ^= 388137071;
                                                var2 ^= -1788307179;
                                                break label675;
                                            }

                                            var2 ^= 2061140858;
                                            var2 *= 1218049125;
                                            var2 >>>= 29;
                                            var2 ^= -1656470611;
                                            Integer var556 = var2;
                                            if (var556 == null) {
                                                break label690;
                                            }

                                            var475 = var509;
                                            switch (var2) {
                                                case -1869673905:
                                                    var2 ^= 925415937;
                                                    break;
                                                case -1656470616:
                                                    var2 <<= 15;
                                                    var2 += 98271389;
                                                    var2 ^= -1297588381;
                                                    break;
                                                case -863403459:
                                                default:
                                                    var2 ^= -976472710;
                                            }
                                        }
                                    }

                                    var2 += -2036438407;
                                    var2 *= -137110795;
                                    var2 ^= 979380940;
                                    var2 ^= -1544661137;
                                    var11 = var2;
                                    var13 = var11 + 1L;
                                    var13 = var11 * var13;
                                    long var670 = var11 + 2L;
                                    var13 *= var670;
                                    var11 += 3L;
                                    var13 *= var11;
                                    var11 = var13 & 7L;
                                    long var880;
                                    int var479 = (var880 = var11 - 0L) == 0L ? 0 : (var880 < 0L ? -1 : 1);
                                    if (var479 != 0) {
                                        break label690;
                                    }

                                    double[] var480 = this.Ja;
                                    double var481 = var480[var458];
                                    double[] var561 = this.zv;
                                    double var562 = var561[var458];
                                    double var671 = var420;
                                    double var482 = TP.y(var481, var562, var671);
                                    double[] var563 = this.Ro;
                                    double var564 = var563[var458];
                                    double[] var672 = this.AB;
                                    long var717 = var3;
                                    long var786 = var717 + 1L;
                                    var786 = var717 * var786;
                                    long var818 = var717 + 2L;
                                    var786 *= var818;
                                    var717 += 3L;
                                    var786 *= var717;
                                    var717 = var786 & 7L;
                                    long var881;
                                    int var720 = (var881 = var717 - 0L) == 0L ? 0 : (var881 < 0L ? -1 : 1);
                                    if (var720 != 0) {
                                        var2 ^= 1287565134;
                                        var2 *= -1818067861;
                                        var2 ^= 1591636966;
                                        break label675;
                                    }

                                    var2 ^= -1542299192;
                                    var2 &= 821114921;
                                    var2 ^= -826286825;
                                    var717 = var2;
                                    var786 = var717 + 1L;
                                    var786 = var717 * var786;
                                    var818 = var717 + 2L;
                                    var786 *= var818;
                                    var717 += 3L;
                                    var786 *= var717;
                                    var717 = var786 & 7L;
                                    long var882;
                                    int var724 = (var882 = var717 - 0L) == 0L ? 0 : (var882 < 0L ? -1 : 1);
                                    if (var724 != 0) {
                                        break label690;
                                    }

                                    double var673 = var672[var458];
                                    double var758 = var420;
                                    double var565 = TP.y(var564, var673, var758);
                                    double[] var674 = this.FA;
                                    double var675 = var674[var458];
                                    double[] var759 = this.CM;
                                    var758 = var759[var458];
                                    double var799 = var420;
                                    double var676 = TP.y(var675, var758, var799);
                                    boolean var483 = var405.at(var388, var482, var565, var676);
                                    if (!var483) {
                                        var2 -= -1047263247;
                                        var2 ^= 1781240424;
                                        var2 ^= -2094617424;
                                        var11 = var2;
                                        var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        var11 = var13 & 1L;
                                        long var883;
                                        int var489 = (var883 = var11 - 0L) == 0L ? 0 : (var883 < 0L ? -1 : 1);
                                        if (var489 != 0) {
                                            break label690;
                                        }

                                        var2 |= 2125563265;
                                        var2 ^= -1369533434;
                                        var2 *= -72144599;
                                        var2 ^= -1399925423;
                                        var2 ^= -182600733;
                                    } else {
                                        var2 &= -1875139450;
                                        var2 *= -1038629899;
                                        var2 >>= 23;
                                        var2 ^= -148859514;
                                        float var484 = var405.unitsPerBlock();
                                        float var485 = var448 * var484;
                                        var12 = var3;
                                        var14 = var12 + 1L;
                                        var14 = var12 * var14;
                                        var717 = var12 + 2L;
                                        var14 *= var717;
                                        var12 += 3L;
                                        var14 *= var12;
                                        var12 = var14 & 7L;
                                        long var884;
                                        int var513 = (var884 = var12 - 0L) == 0L ? 0 : (var884 < 0L ? -1 : 1);
                                        if (var513 != 0) {
                                            var2 |= -1765072172;
                                            var2 |= -1445307218;
                                            var2 += -1375650108;
                                            var2 ^= -1975775609;
                                            break label675;
                                        }

                                        var2 *= -909132625;
                                        var2 ^= -1056240668;
                                        var2 ^= 1152359232;
                                        var12 = var2;
                                        var14 = var12 + 1L;
                                        var14 = var12 * var14;
                                        var717 = var12 + 2L;
                                        var14 *= var717;
                                        var12 += 3L;
                                        var14 *= var12;
                                        var12 = var14 & 7L;
                                        long var885;
                                        int var517 = (var885 = var12 - 0L) == 0L ? 0 : (var885 < 0L ? -1 : 1);
                                        if (var517 != 0) {
                                            break label690;
                                        }

                                        float var886;
                                        int var518 = (var886 = var485 - 0.25F) == 0.0F ? 0 : (var886 < 0.0F ? -1 : 1);
                                        if (var518 < 0) {
                                            var2 -= 1911806774;
                                            var2 ^= -1143002386;
                                            switch (var2) {
                                                case -1183434558:
                                                default:
                                                    var2 ^= -1377169448;
                                                    break;
                                                case 1638637166:
                                                    var2 >>>= 30;
                                                    var2 |= -931056423;
                                                    var2 ^= 506961888;
                                                    break;
                                                case 1704855124:
                                                    var2 ^= 746141991;
                                            }
                                        } else {
                                            var2 += -131133391;
                                            var2 ^= 255202063;
                                            var12 = var2;
                                            var14 = var12 + 1L;
                                            var14 = var12 * var14;
                                            var12 = var14 & 1L;
                                            long var887;
                                            int var521 = (var887 = var12 - 0L) == 0L ? 0 : (var887 < 0L ? -1 : 1);
                                            if (var521 != 0) {
                                                break label690;
                                            }

                                            int[] var522 = this.Ym;
                                            int var523 = var522[var458];
                                            float var524 = var523;
                                            float var525 = var524 + var420;
                                            float var566 = var525 / 10.0F;
                                            float var567 = TP.S(var566);
                                            int[] var609 = this.U;
                                            int var610 = var609[var458];
                                            float var611 = var610;
                                            float var526 = var525 / var611;
                                            float var527 = 1.0F - var526;
                                            float var528 = var567 * var527;
                                            var13 = var3;
                                            var670 = var13 + 1L;
                                            var670 = var13 * var670;
                                            var13 = var670 & 1L;
                                            long var888;
                                            int var570 = (var888 = var13 - 0L) == 0L ? 0 : (var888 < 0L ? -1 : 1);
                                            if (var570 != 0) {
                                                var2 ^= 1683123318;
                                                var2 ^= 1443298172;
                                                var2 -= 1839742765;
                                                var2 ^= -342855696;
                                                break label675;
                                            }
                                            var2 = switch (var2) {
                                                default -> var2 ^ -497362590;
                                                case 1011730567 -> var2 ^ 2027276989;
                                                case 1268878568 -> {
                                                    var2 += -1887724286;
                                                    var2 ^= 2061522046;
                                                    var2 |= -501074635;
                                                    yield var2 ^ 1853108321;
                                                }
                                            };
                                            Integer var571 = var2;
                                            if (var571 == null) {
                                                break label690;
                                            }

                                            float var889;
                                            int var572 = (var889 = var528 - 0.01F) == 0.0F ? 0 : (var889 < 0.0F ? -1 : 1);
                                            if (var572 <= 0) {
                                                var2 = switch (var2) {
                                                    case -1920250412 -> {
                                                        var2 -= 1005125663;
                                                        var2 &= -417850912;
                                                        var2 >>>= 14;
                                                        var2 ^= 519618889;
                                                        yield var2 ^ -1978096844;
                                                    }
                                                    case -113723563 -> var2 ^ -1915573066;
                                                    default -> var2 ^ 814472736;
                                                };
                                                Integer var577 = var2;
                                                if (var577 == null) {
                                                    break label690;
                                                }

                                                var2 |= 584222804;
                                                var2 *= 1510205633;
                                                var2 += 113457821;
                                                var2 ^= 351593955;
                                            } else {
                                                var2 *= 514549863;
                                                var2 &= -1328802547;
                                                var2 *= -1129997687;
                                                var2 >>>= 7;
                                                var2 ^= -1293299832;
                                                zS var573 = this.Ps;
                                                float[] var612 = this.Iv;
                                                float var613 = var612[var458];
                                                int var574 = var573.x(var613, var432);
                                                int var529 = DP.Y(var574, var528);
                                                SpriteShape[] var575 = t;
                                                byte[] var614 = this.DT;
                                                byte var615 = var614[var458];
                                                SpriteShape var576 = var575[var615];
                                                var388.save();
                                                float var616 = var405.depth();
                                                var388.depth(var616);
                                                float var617 = var405.x();
                                                float var679 = var405.y();
                                                var388.translate(var617, var679);
                                                var14 = var3;
                                                var717 = var14 + 1L;
                                                var717 = var14 * var717;
                                                var786 = var14 + 2L;
                                                var717 *= var786;
                                                var14 += 3L;
                                                var717 *= var14;
                                                var14 = var717 & 7L;
                                                long var890;
                                                int var621 = (var890 = var14 - 0L) == 0L ? 0 : (var890 < 0L ? -1 : 1);
                                                if (var621 != 0) {
                                                    switch (var2) {
                                                        case -1284354028:
                                                            var2 *= 216596119;
                                                            var2 ^= -1769315944;
                                                            var2 ^= -1218985711;
                                                            break label675;
                                                        case 216245431:
                                                        default:
                                                            var2 ^= -776634813;
                                                            break label675;
                                                        case 1312423502:
                                                            var2 ^= -939519802;
                                                            break label675;
                                                    }
                                                }

                                                label633: {
                                                    var2 -= -1971646065;
                                                    var2 ^= 1435215190;
                                                    float[] var622 = this.f;
                                                    float var623 = var622[var458];
                                                    var388.rotate(var623);
                                                    SpriteShape var624 = SpriteShape.GLOW;
                                                    if (var576 != var624) {
                                                        var2 *= -1606898619;
                                                        var2 *= -379140605;
                                                        var2 ^= 1157464093;
                                                        int var625 = var2 + 1;
                                                        int var626 = var2 * var625;
                                                        int var627 = var626 & 1;
                                                        if (var627 != 0) {
                                                            break label690;
                                                        }

                                                        SpriteShape var628 = SpriteShape.FIREFLY;
                                                        Integer var680 = var3;
                                                        if (var680 == null) {
                                                            var2 ^= 1411479237;
                                                            var2 >>= 1;
                                                            var2 -= 612998222;
                                                            var2 ^= 686771729;
                                                            break label675;
                                                        }
                                                        var2 = switch (var2) {
                                                            case -1285929600 -> {
                                                                var2 &= 517912001;
                                                                var2 *= 1160871983;
                                                                yield var2 ^ 699242197;
                                                            }
                                                            case 179504841 -> var2 ^ -1954234266;
                                                            default -> var2 ^ -1425767330;
                                                        };
                                                        var670 = var2;
                                                        long var761 = var670 + 1L;
                                                        long var762 = var670 * var761;
                                                        long var800 = var670 + 2L;
                                                        long var763 = var762 * var800;
                                                        var670 += 3L;
                                                        long var764 = var763 * var670;
                                                        var670 = var764 & 7L;
                                                        long var891;
                                                        int var684 = (var891 = var670 - 0L) == 0L ? 0 : (var891 < 0L ? -1 : 1);
                                                        if (var684 != 0) {
                                                            break label690;
                                                        }

                                                        if (var576 != var628) {
                                                            var2 = switch (var2) {
                                                                case -949316523 -> {
                                                                    var2 >>>= 20;
                                                                    var2 |= -1737074058;
                                                                    var2 += 551888934;
                                                                    yield var2 ^ -1239447380;
                                                                }
                                                                default -> var2 ^ 945393065;
                                                                case 531735028 -> var2 ^ 999546467;
                                                            };
                                                            int var629 = var2 + 1;
                                                            int var630 = var2 * var629;
                                                            int var685 = var2 + 2;
                                                            int var631 = var630 * var685;
                                                            int var686 = var2 + 3;
                                                            int var632 = var631 * var686;
                                                            int var633 = var632 & 7;
                                                            if (var633 != 0) {
                                                                break label690;
                                                            }

                                                            float var634 = var485 * 0.8F;
                                                            int var687 = var529 | 16777215;
                                                            int var688 = DP.Z(var529, var687, 0.14F);
                                                            Integer var731 = var3;
                                                            if (var731 == null) {
                                                                switch (var2) {
                                                                    case -1547464984:
                                                                        var2 ^= -1170894538;
                                                                        break label675;
                                                                    case 256118320:
                                                                        var2 ^= 934020779;
                                                                        var2 ^= -550192162;
                                                                        break label675;
                                                                    case 2047299066:
                                                                    default:
                                                                        var2 ^= -2021934892;
                                                                        break label675;
                                                                }
                                                            }

                                                            var2 <<= 4;
                                                            var2 ^= 156102889;
                                                            var2 &= -2082876381;
                                                            var2 ^= -1963869137;
                                                            int var732 = var2 + 1;
                                                            int var733 = var2 * var732;
                                                            int var765 = var2 + 2;
                                                            int var734 = var733 * var765;
                                                            int var766 = var2 + 3;
                                                            int var735 = var734 * var766;
                                                            int var736 = var735 & 7;
                                                            if (var736 != 0) {
                                                                break label690;
                                                            }

                                                            var388.sprite(var576, 0.0F, 0.0F, var485, var634, var688, var529, 0.0F);
                                                            var2 ^= 120595460;
                                                            var2 -= 709218958;
                                                            var2 ^= 1953515954;
                                                            var2 <<= 17;
                                                            var2 ^= -1824286818;
                                                            break label633;
                                                        }

                                                        var2 *= 689538749;
                                                        var2 ^= 1859132505;
                                                    } else {
                                                        var2 |= 376431271;
                                                        var2 |= -860655404;
                                                        var2 *= 2085893671;
                                                        var2 ^= 574644281;
                                                    }

                                                    float var635 = var485 * 0.35F;
                                                    var670 = var3;
                                                    long var767 = var670 + 1L;
                                                    long var768 = var670 * var767;
                                                    long var801 = var670 + 2L;
                                                    long var769 = var768 * var801;
                                                    var670 += 3L;
                                                    long var770 = var769 * var670;
                                                    var670 = var770 & 7L;
                                                    long var892;
                                                    int var692 = (var892 = var670 - 0L) == 0L ? 0 : (var892 < 0L ? -1 : 1);
                                                    if (var692 != 0) {
                                                        var2 &= -933040473;
                                                        var2 *= 1196519507;
                                                        var2 &= -1579408700;
                                                        var2 ^= -423578683;
                                                        break label675;
                                                    }
                                                    var2 = switch (var2) {
                                                        default -> var2 ^ -157118598;
                                                        case 504316416 -> var2 ^ -2108764169;
                                                        case 1920015512 -> {
                                                            var2 *= -1763497945;
                                                            var2 >>>= 11;
                                                            var2 |= -1273210401;
                                                            yield var2 ^ -1733326421;
                                                        }
                                                    };
                                                    float var486 = var485 * 1.6F;
                                                    int var693 = var529 | 16777215;
                                                    int var694 = DP.Z(var529, var693, 0.5F);
                                                    var388.sprite(var576, 0.0F, 0.0F, var635, var486, var694, var529, 0.0F);
                                                    var2 |= -312513549;
                                                    var2 &= 1438076589;
                                                    var2 -= -2095301566;
                                                    var2 |= 1392006682;
                                                    var2 ^= -1205550619;
                                                }

                                                var388.restore();
                                                var2 &= -1173164242;
                                                var2 *= -1191363481;
                                                var2 ^= 457651611;
                                            }
                                        }
                                    }

                                    Integer var490 = var2;
                                    if (var490 == null) {
                                        break label690;
                                    }

                                    int var491 = var458 + 1;
                                    var12 = var3;
                                    var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    var717 = var12 + 2L;
                                    var14 *= var717;
                                    var12 += 3L;
                                    var14 *= var12;
                                    var12 = var14 & 7L;
                                    long var893;
                                    int var533 = (var893 = var12 - 0L) == 0L ? 0 : (var893 < 0L ? -1 : 1);
                                    if (var533 != 0) {
                                        switch (var2) {
                                            case -1672466599:
                                            default:
                                                var2 ^= 1389248489;
                                                break label675;
                                            case -692671687:
                                                var2 |= 1579292747;
                                                var2 &= 648234102;
                                                var2 ^= -511790281;
                                                break label675;
                                            case 12978275:
                                                var2 ^= -1224511355;
                                                break label675;
                                        }
                                    }

                                    var2 += -2117017009;
                                    var2 ^= 219644602;
                                    Integer var534 = var2;
                                    if (var534 == null) {
                                        break label690;
                                    }

                                    var458 = var491;
                                    switch (var2) {
                                        case -1336053317:
                                        default:
                                            var2 ^= -989323533;
                                            break;
                                        case 396415296:
                                            var2 ^= -1355676225;
                                            break;
                                        case 1435504434:
                                            var2 |= -1638983409;
                                            var2 >>= 14;
                                            var2 ^= 1907789669;
                                            var2 ^= 2077635515;
                                    }
                                }
                            }

                            var2 -= -313021396;
                            var2 <<= 16;
                            var2 ^= 659728395;
                            var2 ^= 1704538873;
                        } else {
                            var2 -= -322949868;
                            var2 += -1105285710;
                            var2 >>>= 9;
                            var2 ^= -2110414449;
                        }

                        var3 = var2 + 1;
                        var3 = var2 * var3;
                        var2 = var3 & 1;
                        if (var2 == 0) {
                            return;
                        }
                        break label690;
                    }
                }

                Integer var376 = var2;
                if (var376 != null) {
                    IllegalArgumentException var377 = new IllegalArgumentException();
                    throw var377;
                }
                break label690;
            }

            this.J();
            return;
        }

        IllegalStateException var372 = new IllegalStateException();
        throw var372;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2035918905;
        int var2 = Yn.C;
        int var4 = of_2.xF(var3, var1, var2);
        w = var4;
        SpriteShape[] var5 = SpriteShape.values();
        t = var5;
    }
}
