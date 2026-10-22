package mvggs.modules.hud;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.Projection;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.SpriteShape;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public final class targethud extends tR_2 {
    private static final int GQ = 64;
    private static final SpriteShape[] p;
    private static final float C = 148.0F;
    private static final float Zh = 50.5F;
    private static final float U = 6.0F;
    private static final float m = 30.0F;
    private static final float BM = 6.5F;
    private static final float K = 10.0F;
    private static final float R = 41.0F;
    private static final float k = 3.4F;
    private static final float c = 3.0F;
    private static final float d = 19.0F;
    private static final float Rl = 15.0F;
    private static final float tg = 11.0F;
    private static final float T = 118.0F;
    private static final float s = 32.0F;
    private static final float Hz = 22.0F;
    private static final TextStyle i;
    private static final TextStyle JD;
    private static final TextStyle D;
    private static final TextStyle h;
    private static final TextStyle Kz;
    private static final TextStyle hA;
    private final r_2 Z;
    private final r_2 LS;
    private final Uq P;
    private final JL dv;
    private final JL OG;
    private final JL bp;
    private final XF UA;
    private final Re Qy;
    private final Re F;
    private final Re j;
    private final Re ay;
    private final Re Lu;
    private final float[] l;
    private boolean O;
    private boolean x;
    private boolean G;
    private final int[] qb;
    private final ItemStack[] Ou;
    private int De;
    private LivingEntity rv;
    private String q;
    private String Om;
    private float Ib;
    private final StringBuilder rm;
    private final StringBuilder qc;
    private float bF;
    private float ym;
    private int rt;
    private float LR;
    private float au;
    private float tP;
    private float rD;
    private float L;
    private float Cx;
    private Oo Gf;
    private int Lr;
    private int Y;
    private TextStyle wt;
    private TextStyle jY;
    private TextStyle Im;
    private TextStyle MF;
    private TextStyle ve;
    private LivingEntity km;
    private long ma;
    private final float[] xm;
    private final float[] WW;
    private final float[] jZ;
    private final float[] xe;
    private final float[] b;
    private final float[] YY;
    private final float[] Of;
    private final float[] AF;
    private final float[] HA;
    private final float[] Zb;
    private final byte[] o;
    private int DE;
    public static final int QL;

    public targethud() {
        super("target_hud", "Target HUD", Cl_2.CENTER, 0.0F, 40.0F, 1.2F);
        Cl_2 var1 = Cl_2.CENTER;

        Nb var2 = Nb.MODERN;
        r_2 var3 = new r_2("style", "Style", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.Z = var5;
        b_2 var61 = b_2.FIXED;
        r_2 var6 = new r_2("placement", "Placement", var61);
        xB var7 = this.vn(var6);
        r_2 var8 = (r_2)var7;
        this.LS = var8;
        Uq var9 = new Uq("follow_scale", "Follow Size", 0.75F, 0.4F, 1.2F);
        Uq var10 = var9.W(0.05F);
        Uq var11 = var10.L("x");
        BooleanSupplier var62 = () -> {
            int var1x = QL;
            var1x ^= -1293254013;
            int var2x = System.identityHashCode(this);
            Integer var17x = var2x;
            if (var17x == null) {
                long var19x = switch (var1x) {
                    case -1935660015 -> var1x ^ -879458265;
                    case -520027276 -> {
                        var1x *= -1637110177;
                        yield var1x ^ 1453954289;
                    }
                    default -> var1x ^ -415009142;
                };
                long var4x = var19x + 1L;
                var4x = var19x * var4x;
                long var20x = var4x & 1L;
                long var25x;
                int var21x = (var25x = var20x - 0L) == 0L ? 0 : (var25x < 0L ? -1 : 1);
                if (var21x == 0) {
                    AssertionError var23x = new AssertionError();
                    throw var23x;
                } else {
                    AssertionError var22x = new AssertionError();
                    throw var22x;
                }
            } else {
                switch (var1x) {
                    case -1953064175:
                        var1x ^= -1569658150;
                        break;
                    case -1746825404:
                    default:
                        var1x ^= 1204178794;
                        break;
                    case -520027276:
                        var1x += -607824890;
                        var1x ^= 2079279215;
                        var1x += 384357611;
                        var1x *= 666523919;
                        var1x ^= 1473989299;
                }

                r_2 var14x = this.LS;
                b_2 var18x = b_2.FOLLOW;
                return var14x.TJ(var18x);
            }
        };
        xB var12 = var11.Pt(var62);
        Uq var13 = (Uq)var12;
        xB var14 = this.vn(var13);
        Uq var15 = (Uq)var14;
        this.P = var15;
        JL var16 = new JL("equipment", "Equipment", true);
        BooleanSupplier var63 = () -> {
            int var1x = QL;
            var1x ^= 104632475;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.Z;
            long var4x = var2x;
            long var6x = var4x + 1L;
            var6x = var4x * var6x;
            long var8x = var4x + 2L;
            var6x *= var8x;
            var4x += 3L;
            var6x *= var4x;
            var4x = var6x & 7L;
            long var33x;
            var2x = (var33x = var4x - 0L) == 0L ? 0 : (var33x < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x &= 1883510339;
                var1x |= -339749736;
                var1x |= 25011158;
                var1x ^= -845339253;
                var4x = var1x;
                var6x = var4x + 1L;
                var6x = var4x * var6x;
                var4x = var6x & 1L;
                long var34x;
                var2x = (var34x = var4x - 0L) == 0L ? 0 : (var34x < 0L ? -1 : 1);
                if (var2x == 0) {
                    RuntimeException var23x = new RuntimeException();
                    throw var23x;
                }
            } else {
                var1x *= 1514530189;
                var1x ^= 1698139678;
                var1x ^= -1646113414;
                Integer var18x = var1x;
                if (var18x != null) {
                    Nb var20x = Nb.MODERN;
                    return var3x.TJ(var20x);
                }
            }

            UnsupportedOperationException var19x = new UnsupportedOperationException();
            throw var19x;
        };
        xB var17 = var16.Pt(var63);
        JL var18 = (JL)var17;
        xB var19 = this.vn(var18);
        JL var20 = (JL)var19;
        this.dv = var20;
        JL var21 = new JL("particles", "Hit Particles", true);
        xB var22 = this.vn(var21);
        JL var23 = (JL)var22;
        this.OG = var23;
        JL var24 = new JL("on_look", "Show On Look", false);
        xB var25 = this.vn(var24);
        JL var26 = (JL)var25;
        this.bp = var26;
        kE_2 var64 = kE_2.uY(0.28F, 0.42F);
        XF var27 = new XF(0.0F, var64);
        this.UA = var27;
        Re var28 = new Re(1.0F, 0.12F);
        this.Qy = var28;
        Re var29 = new Re(1.0F, 0.45F);
        this.F = var29;
        Re var30 = new Re(0.0F, 0.045F);
        this.j = var30;
        Re var31 = new Re(0.0F, 0.045F);
        this.ay = var31;
        Re var32 = new Re(1.0F, 0.12F);
        this.Lu = var32;
        float[] var33 = new float[4];
        this.l = var33;
        this.O = true;
        int[] var34 = new int[2];
        this.qb = var34;
        ItemStack[] var35 = new ItemStack[6];
        this.Ou = var35;
        this.q = "";
        this.Om = "";
        StringBuilder var36 = new StringBuilder(8);
        this.rm = var36;
        StringBuilder var37 = new StringBuilder(8);
        this.qc = var37;
        this.tP = 1.0F;
        eG var38 = eG.CLASSIC;
        Oo var39 = var38.palette();
        this.Gf = var39;
        Oo var40 = this.Gf;
        int var41 = var40.E();
        this.Lr = var41;
        Oo var42 = this.Gf;
        int var43 = var42.P();
        this.Y = var43;
        TextStyle var44 = i;
        this.wt = var44;
        TextStyle var45 = JD;
        this.jY = var45;
        TextStyle var46 = D;
        this.Im = var46;
        TextStyle var47 = h;
        this.MF = var47;
        TextStyle var48 = hA;
        this.ve = var48;
        float[] var49 = new float[64];
        this.xm = var49;
        float[] var50 = new float[64];
        this.WW = var50;
        float[] var51 = new float[64];
        this.jZ = var51;
        float[] var52 = new float[64];
        this.xe = var52;
        float[] var53 = new float[64];
        this.b = var53;
        float[] var54 = new float[64];
        this.YY = var54;
        float[] var55 = new float[64];
        this.Of = var55;
        float[] var56 = new float[64];
        this.AF = var56;
        float[] var57 = new float[64];
        this.HA = var57;
        float[] var58 = new float[64];
        this.Zb = var58;
        byte[] var59 = new byte[64];
        this.o = var59;
        this.dy("Card for your current target: face, health with damage trail, equipment. Open chat to move it.");
        this.fJ(true);
        wD<Hm> var60 = (Hm var1x) -> {
            label83: {
                int var51x;
                label82: {
                    var51x = QL;
                    var51x ^= 2124655807;
                    int var3x = System.identityHashCode(this);
                    Entity var4x = var1x.target();
                    long var5x = var3x;
                    long var7x = var5x + 1L;
                    var7x = var5x * var7x;
                    long var9x = var5x + 2L;
                    var7x *= var9x;
                    var5x += 3L;
                    var7x *= var5x;
                    var5x = var7x & 7L;
                    long var121;
                    int var94 = (var121 = var5x - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                    if (var94 == 0) {
                        var51x -= -1400674345;
                        var51x += -1205419441;
                        var51x |= -1770172540;
                        var51x += -478631246;
                        var51x ^= 716054938;
                        LivingEntity var95 = this.rv;
                        if (var4x != var95) {
                            var51x ^= 1201079567;
                            var51x >>>= 21;
                            var51x ^= -1424022670;
                            Integer var90 = var51x;
                            if (var90 != null) {
                                return;
                            }
                            break label83;
                        }

                        var51x >>= 18;
                        var51x >>>= 31;
                        var51x ^= 740512867;
                        var51x <<= 27;
                        var51x ^= 93835305;
                        XF var75 = this.UA;
                        var75.v(3.0F);
                        this.bF = 0.35F;
                        JL var76 = this.OG;
                        boolean var77 = var76.vb();
                        var5x = var3x;
                        var7x = var5x + 1L;
                        var7x = var5x * var7x;
                        var9x = var5x + 2L;
                        var7x *= var9x;
                        var5x += 3L;
                        var7x *= var5x;
                        var5x = var7x & 7L;
                        long var122;
                        int var99 = (var122 = var5x - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                        if (var99 != 0) {
                            var51x += -1220924991;
                            var51x += 1834096274;
                            var51x ^= -1400344965;
                        } else {
                            var51x |= -31564470;
                            var51x += -1075305910;
                            var51x &= -390077675;
                            var51x ^= -1559310971;
                            var5x = var51x;
                            var7x = var5x + 1L;
                            var7x = var5x * var7x;
                            var9x = var5x + 2L;
                            var7x *= var9x;
                            var5x += 3L;
                            var7x *= var5x;
                            var5x = var7x & 7L;
                            long var123;
                            int var103 = (var123 = var5x - 0L) == 0L ? 0 : (var123 < 0L ? -1 : 1);
                            if (var103 != 0) {
                                break label83;
                            }

                            if (!var77) {
                                var51x += -1128337687;
                                var51x *= -571384575;
                                var51x ^= 1769805979;
                                var51x ^= -1110170421;
                                break label82;
                            }
                            var51x = switch (var51x) {
                                case -868362414 -> var51x ^ 1689970400;
                                case 193539728 -> {
                                    var51x *= 560624805;
                                    yield var51x ^ 1298795592;
                                }
                                default -> var51x ^ -1493803260;
                            };
                            Integer var78 = var51x;
                            if (var78 == null) {
                                break label83;
                            }

                            boolean var79 = var1x.crit();
                            int var104 = var3x + 1;
                            int var105 = var3x * var104;
                            var3x = var105 & 1;
                            if (var3x == 0) {
                                var51x *= 495305145;
                                var51x += -253770606;
                                var51x >>= 20;
                                var51x ^= -1737308664;
                                Integer var66 = var51x;
                                if (var66 == null) {
                                    break label83;
                                }

                                byte var67;
                                if (var79) {
                                    var51x |= -392886897;
                                    var51x ^= 932575705;
                                    var51x <<= 30;
                                    var51x ^= -1700247113;
                                    var67 = 13;
                                    var51x &= -1304526783;
                                    var51x &= 301387043;
                                    var51x *= -1872841875;
                                    var51x ^= -1126902931;
                                } else {
                                    var51x *= -323041009;
                                    var51x ^= 1563386274;
                                    var67 = 9;
                                    var51x += -366340094;
                                    var51x -= -2035936208;
                                    var51x &= 676840724;
                                    var51x ^= 1361929476;
                                }

                                int var80 = var51x + 1;
                                int var81 = var51x * var80;
                                int var106 = var51x + 2;
                                int var82 = var81 * var106;
                                int var107 = var51x + 3;
                                int var83 = var82 * var107;
                                int var84 = var83 & 7;
                                if (var84 != 0) {
                                    break label83;
                                }

                                int var85 = var51x - -1566505795;
                                int var86 = var85 | -1688476253;
                                int var87 = var86 | -238655336;
                                int var88 = var87 >>> 17;
                                int var89 = var88 ^ 2083377830;
                                this.s(var67, var89);
                                switch (var51x) {
                                    case -2012939801:
                                        var51x ^= -80364782;
                                        break label82;
                                    case 402233559:
                                    default:
                                        var51x ^= 777044951;
                                        break label82;
                                    case 1898602496:
                                        var51x ^= 1007777036;
                                        var51x |= -783584316;
                                        var51x ^= 657742309;
                                        break label82;
                                }
                            }

                            var51x *= 1022568457;
                            var51x ^= 150797663;
                        }
                    } else {
                        var51x -= -774582637;
                        var51x ^= -2098645112;
                        var51x += 1646259410;
                        var51x ^= -1391056888;
                    }

                    var3x = var51x + 1;
                    var3x = var51x * var3x;
                    int var91 = var51x + 2;
                    var3x *= var91;
                    var51x += 3;
                    var3x *= var51x;
                    var51x = var3x & 7;
                    if (var51x == 0) {
                        UnsupportedOperationException var64x = new UnsupportedOperationException();
                        throw var64x;
                    }
                    break label83;
                }

                int var68 = var51x + 1;
                var68 = var51x * var68;
                var68 &= 1;
                if (var68 == 0) {
                    return;
                }
            }

            IllegalArgumentException var63x = new IllegalArgumentException();
            throw var63x;
        };
        this.iI(Hm.class, var60);
    }

    public void x(LivingEntity var1, float var2) {
        int var3 = QL;
        var3 ^= -725413360;
        int var4 = System.identityHashCode(this);
        this.km = var1;
        long var5 = System.currentTimeMillis();
        float var7 = var2 * 1000.0F;
        long var20 = (long)var7;
        Integer var18 = var4;
        if (var18 != null) {
            var3 |= 1444646927;
            var3 += 2118288332;
            var3 &= 1721744564;
            var3 *= 1523817709;
            var3 ^= -1775604231;
            long var19 = var5 + var20;
            this.ma = var19;
        } else {
            var3 &= 444598591;
            var3 ^= 520564467;
            IllegalStateException var12 = new IllegalStateException();
            throw var12;
        }
    }

    @Override
    protected void J() {
        int var1 = QL;
        var1 ^= 822981785;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            switch (var1) {
                case -178257443:
                default:
                    var1 ^= 1107862663;
                    break;
                case 1413386801:
                    var1 ^= 47509834;
                    break;
                case 1659254126:
                    var1 &= -2127464376;
                    var1 &= 554533530;
                    var1 ^= -2107339587;
            }

            float[] var17 = this.YY;
            Arrays.fill(var17, 0.0F);
        } else {
            var1 *= -759549473;
            var1 >>>= 5;
            var1 ^= -1146712582;
            Integer var8 = var1;
            if (var8 != null) {
                AssertionError var10 = new AssertionError();
                throw var10;
            } else {
                IllegalStateException var9 = new IllegalStateException();
                throw var9;
            }
        }
    }

    @Override
    protected void r(Oo var1) {
        int var2 = QL;
        var2 ^= 1062731046;
        int var3 = System.identityHashCode(this);
        this.Gf = var1;
        int var4 = var1.E();
        this.Lr = var4;
        var4 = var1.P();
        this.Y = var4;
        TextStyle var29 = i;
        int var5 = var1.MD();
        TextStyle var30 = var29.color(var5);
        this.wt = var30;
        TextStyle var31 = JD;
        Integer var21 = var3;
        if (var21 == null) {
            var2 *= 1807162505;
            var2 ^= -1705877347;
            var21 = var2;
            if (var21 != null) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            } else {
                UnsupportedOperationException var26 = new UnsupportedOperationException();
                throw var26;
            }
        } else {
            var2 *= 7304741;
            var2 *= 470373361;
            var2 ^= 593255115;
            var2 ^= 1230039497;
            var2 = var1.MD();
            TextStyle var12 = var31.color(var2);
            this.jY = var12;
            TextStyle var13 = D;
            int var22 = var1.bb();
            TextStyle var14 = var13.color(var22);
            this.Im = var14;
            TextStyle var15 = h;
            var22 = var1.Hb();
            TextStyle var16 = var15.color(var22);
            this.MF = var16;
            TextStyle var17 = hA;
            var22 = var1.Hb();
            TextStyle var18 = var17.color(var22);
            this.ve = var18;
        }
    }

    @Override
    protected void Mf() {
        label86: {
            int var1 = QL;
            var1 ^= 113224994;
            int var2 = System.identityHashCode(this);
            this.O = true;
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var69;
            int var43 = (var69 = var3 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
            if (var43 != 0) {
                switch (var1) {
                    case -2128585931:
                        var1 ^= 1008766704;
                        break;
                    case 1431579861:
                        var1 |= 1638654661;
                        var1 *= -2116917807;
                        var1 |= 913368540;
                        var1 ^= -924842826;
                        break;
                    case 1776546537:
                    default:
                        var1 ^= 2026170461;
                }
            } else {
                label95: {
                    var1 = switch (var1) {
                        default -> var1 ^ -407498724;
                        case -587718100 -> var1 ^ -875694982;
                        case 1431579861 -> {
                            var1 *= 1145554735;
                            var1 *= 6630637;
                            var1 &= -545433987;
                            yield var1 ^ -2064055024;
                        }
                    };
                    int var44 = var1 + 1;
                    int var45 = var1 * var44;
                    int var46 = var45 & 1;
                    if (var46 != 0) {
                        break label86;
                    }

                    this.tP = 1.0F;
                    Re var47 = this.Lu;
                    r_2 var4 = this.LS;
                    b_2 var64 = b_2.FOLLOW;
                    boolean var48 = var4.TJ(var64);
                    float var40;
                    if (var48) {
                        var1 = switch (var1) {
                            case -1802336730 -> var1 ^ 1389497526;
                            default -> var1 ^ 741590232;
                            case -1647749267 -> {
                                var1 ^= 1360316698;
                                yield var1 ^ 1614725407;
                            }
                        };
                        long var49 = var1;
                        long var6 = var49 + 1L;
                        var6 = var49 * var6;
                        long var50 = var6 & 1L;
                        long var70;
                        int var51 = (var70 = var50 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                        if (var51 != 0) {
                            break label86;
                        }

                        Uq var52 = this.P;
                        Integer var37 = var2;
                        if (var37 == null) {
                            var1 &= 1625513056;
                            var1 &= 1462635643;
                            var1 &= 1714742652;
                            var1 >>>= 9;
                            var1 ^= 1981215049;
                            break label95;
                        }
                        var1 = switch (var1) {
                            default -> var1 ^ 970941973;
                            case -1394385048 -> {
                                var1 |= -930788001;
                                var1 >>>= 5;
                                var1 &= -972532245;
                                yield var1 ^ -778475754;
                            }
                            case 2022886975 -> var1 ^ -1952293280;
                        };
                        var37 = var1;
                        if (var37 == null) {
                            break label86;
                        }

                        float var39 = var52.WM();
                        var40 = var39;
                        switch (var1) {
                            case -1191451592:
                            default:
                                var1 ^= -935295803;
                                break;
                            case -677808131:
                                var1 &= 983857299;
                                var1 ^= 738915486;
                                break;
                            case 142140262:
                                var1 ^= -1915551655;
                        }
                    } else {
                        var1 = switch (var1) {
                            case -1811982585 -> var1 ^ -1735987589;
                            case -1647749267 -> {
                                var1 |= 282823177;
                                yield var1 ^ -387045125;
                            }
                            default -> var1 ^ 1860614089;
                        };
                        var40 = 1.0F;
                        switch (var1) {
                            case -1916332049:
                            default:
                                var1 ^= -1612999114;
                                break;
                            case -341356687:
                                var1 ^= 1539089545;
                                break;
                            case 1966471062:
                                var1 |= 1820223678;
                                var1 &= 2079800663;
                                var1 ^= 1207810329;
                        }
                    }

                    int var53 = var1 + 1;
                    int var54 = var1 * var53;
                    int var65 = var1 + 2;
                    int var55 = var54 * var65;
                    var1 += 3;
                    int var56 = var55 * var1;
                    var1 = var56 & 7;
                    if (var1 == 0) {
                        var47.v(var40);
                        return;
                    }
                    break label86;
                }
            }

            long var57 = var1;
            long var67 = var57 + 1L;
            var67 = var57 * var67;
            var57 = var67 & 1L;
            long var71;
            int var59 = (var71 = var57 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
            if (var59 == 0) {
                UnsupportedOperationException var60 = new UnsupportedOperationException();
                throw var60;
            }
        }

        RuntimeException var36 = new RuntimeException();
        throw var36;
    }

    @Override
    protected void fS() {
        int var1 = QL;
        var1 ^= 561434944;
        int var2 = System.identityHashCode(this);
        r_2 var3 = this.LS;
        b_2 var4 = b_2.FIXED;
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var29;
        var2 = (var29 = var5 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            var5 = switch (var1) {
                default -> var1 ^ 1672260097;
                case 546779887 -> var1 ^ 476235912;
                case 1922912439 -> {
                    var1 |= -1275616210;
                    yield var1 ^ 24249331;
                }
            };
            var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var30;
            var2 = (var30 = var5 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            }
        } else {
            var1 *= 1145002815;
            var1 ^= 372126064;
            long var14 = var1;
            var5 = var14 + 1L;
            var5 = var14 * var5;
            long var15 = var5 & 1L;
            long var31;
            var1 = (var31 = var15 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var1 == 0) {
                var3.UY(var4);
                return;
            }
        }

        RuntimeException var17 = new RuntimeException();
        throw var17;
    }

    private LivingEntity PX(lH_3 var1, int var2) {
        label299: {
            int var135;
            LivingEntity var262;
            label313: {
                int var4 = System.identityHashCode(this);
                int var5 = var4 + 1;
                var5 = var4 * var5;
                int var6 = var4 + 2;
                var5 *= var6;
                var6 = var4 + 3;
                var5 *= var6;
                var5 &= 7;
                label296:
                if (var5 == 0) {
                    var135 = var2 | -1264869668;
                    var135 &= -760716967;
                    var135 ^= 562913957;
                    Integer var167 = var135;
                    if (var167 == null) {
                        break label299;
                    }

                    LivingEntity var168 = this.km;
                    if (var168 != null) {
                        var135 -= 121946;
                        var135 -= 1673198372;
                        var135 ^= 1384716549;
                        long var169 = System.currentTimeMillis();
                        long var7 = this.ma;
                        long var315;
                        int var170 = (var315 = var169 - var7) == 0L ? 0 : (var315 < 0L ? -1 : 1);
                        Integer var189 = var4;
                        if (var189 == null) {
                            switch (var135) {
                                case 173836522:
                                default:
                                    var135 ^= -71837625;
                                    break label296;
                                case 501322363:
                                    var135 |= 978411748;
                                    var135 |= -2027023902;
                                    var135 ^= 219330172;
                                    break label296;
                                case 1201859119:
                                    var135 ^= 438098047;
                                    break label296;
                            }
                        }

                        var135 &= 593840389;
                        var135 |= -1442064836;
                        var135 >>= 15;
                        var135 ^= -210069098;
                        if (var170 < 0) {
                            var135 |= 1470866475;
                            var135 ^= 1897149615;
                            long var171 = var135;
                            long var223 = var171 + 1L;
                            long var224 = var171 * var223;
                            long var9 = var171 + 2L;
                            long var225 = var224 * var9;
                            long var172 = var171 + 3L;
                            long var226 = var225 * var172;
                            long var173 = var226 & 7L;
                            long var316;
                            var170 = (var316 = var173 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                            if (var170 != 0) {
                                break label299;
                            }

                            LivingEntity var175 = this.km;
                            long var190 = var4;
                            long var8 = var190 + 1L;
                            var8 = var190 * var8;
                            long var10 = var190 + 2L;
                            var8 *= var10;
                            long var191 = var190 + 3L;
                            var8 *= var191;
                            long var192 = var8 & 7L;
                            long var317;
                            int var193 = (var317 = var192 - 0L) == 0L ? 0 : (var317 < 0L ? -1 : 1);
                            if (var193 != 0) {
                                switch (var135) {
                                    case -2030402289:
                                    default:
                                        var135 ^= -469848665;
                                        break label296;
                                    case -513780680:
                                        var135 ^= -909520997;
                                        break label296;
                                    case 784063428:
                                        var135 += -881452826;
                                        var135 ^= 1222422825;
                                        break label296;
                                }
                            }
                            var135 = switch (var135) {
                                case -966251029 -> var135 ^ 1341888964;
                                default -> var135 ^ -537542966;
                                case 784063428 -> {
                                    var135 ^= 1253670844;
                                    var135 |= 1856930222;
                                    var135 ^= -282590994;
                                    yield var135 ^ -424848909;
                                }
                            };
                            boolean var176 = var175.isAlive();
                            if (var176) {
                                var135 &= 1766504374;
                                var135 += -2022382377;
                                var135 ^= 444222989;
                                return this.km;
                            }

                            switch (var135) {
                                case -487845641:
                                    var135 ^= 1902012657;
                                    break;
                                case 1211670352:
                                default:
                                    var135 ^= -1170842996;
                                    break;
                                case 1730933987:
                                    var135 ^= -1877788220;
                                    var135 ^= 1011603955;
                            }
                        } else {
                            var135 ^= 702123914;
                            var135 ^= -298888161;
                        }
                    } else {
                        switch (var135) {
                            case -1289395460:
                                var135 ^= -686727448;
                                var135 ^= -1354291008;
                                break;
                            case -498067078:
                                var135 ^= -1234629916;
                                break;
                            case 1617297930:
                            default:
                                var135 ^= 1918011272;
                        }
                    }

                    var167 = var135;
                    if (var167 == null) {
                        break label299;
                    }

                    Ud var178 = Ud.Z();
                    var6 = var4 + 1;
                    var6 = var4 * var6;
                    int var227 = var4 + 2;
                    var6 *= var227;
                    int var228 = var4 + 3;
                    var6 *= var228;
                    var6 &= 7;
                    label284:
                    if (var6 == 0) {
                        var135 = switch (var135) {
                            case -881650476 -> {
                                var135 -= -941937264;
                                var135 *= 1563374425;
                                var135 &= -1641874319;
                                var135 += -400842770;
                                yield var135 ^ -832066231;
                            }
                            case 535073897 -> var135 ^ 723934107;
                            default -> var135 ^ 1981688362;
                        };
                        V var179 = var178.bA();
                        Entity var180 = var179.i();
                        Entity var203;
                        if (var180 == null) {
                            var135 = switch (var135) {
                                default -> var135 ^ 1416482896;
                                case -1166328505 -> {
                                    var135 *= 1778927997;
                                    var135 ^= 455681719;
                                    yield var135 ^ 966758201;
                                }
                                case -122489460 -> var135 ^ -1801602948;
                            };
                            JL var199 = this.bp;
                            int var229 = var4 + 1;
                            int var230 = var4 * var229;
                            int var266 = var4 + 2;
                            int var231 = var230 * var266;
                            var266 = var4 + 3;
                            int var232 = var231 * var266;
                            int var233 = var232 & 7;
                            if (var233 != 0) {
                                var135 -= 354123719;
                                var135 ^= 966805213;
                                break label284;
                            }

                            var135 >>= 3;
                            var135 *= -1875895069;
                            var135 ^= 1556413942;
                            boolean var200 = var199.vb();
                            if (var200) {
                                var135 ^= 1566693545;
                                var135 *= -492647349;
                                var135 += 490168541;
                                var135 ^= 1433204408;
                                Integer var201 = var135;
                                if (var201 == null) {
                                    break label299;
                                }

                                Entity var202 = i_2.aM();
                                Integer var234 = var4;
                                if (var234 == null) {
                                    var135 *= -1878716909;
                                    var135 >>= 2;
                                    var135 >>>= 21;
                                    var135 ^= -1293073775;
                                    break label284;
                                }

                                var135 *= -962642673;
                                var135 -= -1260758821;
                                var135 ^= 2005118919;
                                long var235 = var135;
                                long var293 = var235 + 1L;
                                var293 = var235 * var293;
                                long var11 = var235 + 2L;
                                var293 *= var11;
                                long var236 = var235 + 3L;
                                var293 *= var236;
                                long var237 = var293 & 7L;
                                long var318;
                                int var238 = (var318 = var237 - 0L) == 0L ? 0 : (var318 < 0L ? -1 : 1);
                                if (var238 != 0) {
                                    break label299;
                                }

                                var203 = var202;
                                var135 ^= 1626164476;
                                var135 ^= 553425379;
                            } else {
                                var135 = switch (var135) {
                                    default -> var135 ^ -400117439;
                                    case 623999095 -> var135 ^ -415961585;
                                    case 1961133402 -> {
                                        var135 -= 304214800;
                                        var135 += -737010124;
                                        var135 *= 108967345;
                                        var135 *= -541614453;
                                        yield var135 ^ 1194863562;
                                    }
                                };
                                int var239 = var135 + 1;
                                int var240 = var135 * var239;
                                var266 = var135 + 2;
                                int var241 = var240 * var266;
                                var266 = var135 + 3;
                                int var242 = var241 * var266;
                                int var243 = var242 & 7;
                                if (var243 != 0) {
                                    break label299;
                                }

                                var203 = var180;
                                var135 &= 1861231852;
                                var135 >>>= 15;
                                var135 ^= 1680345271;
                            }
                        } else {
                            var135 |= -1822809807;
                            var135 -= 1755943171;
                            var135 += -38836687;
                            var135 >>= 30;
                            var135 ^= -1096799587;
                            Integer var244 = var135;
                            if (var244 == null) {
                                break label299;
                            }

                            var203 = var180;
                            var135 <<= 3;
                            var135 += 994460657;
                            var135 ^= 1416593606;
                        }

                        var167 = var135;
                        if (var167 == null) {
                            break label299;
                        }

                        boolean var182 = var203 instanceof LivingEntity;
                        long var245 = var4;
                        long var297 = var245 + 1L;
                        var297 = var245 * var297;
                        long var246 = var297 & 1L;
                        long var319;
                        int var247 = (var319 = var246 - 0L) == 0L ? 0 : (var319 < 0L ? -1 : 1);
                        label271:
                        if (var247 == 0) {
                            var135 -= 325006283;
                            var135 ^= -919825965;
                            Integer var248 = var135;
                            if (var248 == null) {
                                break label299;
                            }

                            if (var182) {
                                var135 -= -42670972;
                                var135 ^= -948898200;
                                long var249 = var135;
                                var297 = var249 + 1L;
                                var297 = var249 * var297;
                                long var250 = var297 & 1L;
                                long var320;
                                int var183 = (var320 = var250 - 0L) == 0L ? 0 : (var320 < 0L ? -1 : 1);
                                if (var183 != 0) {
                                    break label299;
                                }

                                LivingEntity var184 = (LivingEntity)var203;
                                long var204 = var4;
                                long var270 = var204 + 1L;
                                var270 = var204 * var270;
                                long var313 = var204 + 2L;
                                var270 *= var313;
                                long var205 = var204 + 3L;
                                var270 *= var205;
                                long var206 = var270 & 7L;
                                long var321;
                                var6 = (var321 = var206 - 0L) == 0L ? 0 : (var321 < 0L ? -1 : 1);
                                if (var6 != 0) {
                                    var135 <<= 21;
                                    var135 ^= 1429442337;
                                    var135 ^= 1832650989;
                                    var135 |= -1972000547;
                                    var135 ^= 1821567582;
                                    break label271;
                                }

                                var135 >>>= 24;
                                var135 += -1013329311;
                                var135 ^= 998058082;
                                var135 ^= -1472133750;
                                var6 = var135 + 1;
                                var6 = var135 * var6;
                                var6 &= 1;
                                if (var6 != 0) {
                                    break label299;
                                }

                                boolean var211 = var184.isAlive();
                                if (var211) {
                                    var135 &= -234941315;
                                    var135 ^= -1746579095;
                                    Integer var212 = var135;
                                    if (var212 != null) {
                                        return var184;
                                    }
                                    break label299;
                                }
                                var135 = switch (var135) {
                                    default -> var135 ^ -1638912863;
                                    case 1353056084 -> {
                                        var135 -= 1253121559;
                                        var135 &= 1439390201;
                                        yield var135 ^ 1289353780;
                                    }
                                    case 1701458358 -> var135 ^ -894068261;
                                };
                                switch (var135) {
                                    case -1711527580:
                                        var135 ^= -166686361;
                                        break;
                                    case 261785941:
                                    default:
                                        var135 ^= -710235528;
                                        break;
                                    case 1226423053:
                                        var135 ^= 301568468;
                                        var135 ^= 789478709;
                                }
                            } else {
                                var135 = switch (var135) {
                                    case -1793930084 -> var135 ^ 747284580;
                                    case -1713080929 -> {
                                        var135 &= -1882578350;
                                        yield var135 ^ 1206142327;
                                    }
                                    default -> var135 ^ -706927309;
                                };
                                Integer var213 = var135;
                                if (var213 == null) {
                                    break label299;
                                }

                                var167 = null;
                                switch (var135) {
                                    case -836475547:
                                        var135 |= 1351089492;
                                        var135 += -601944839;
                                        var135 ^= -852927102;
                                        break;
                                    case -824538067:
                                    default:
                                        var135 ^= 848235101;
                                        break;
                                    case 1419708641:
                                        var135 ^= -2098793866;
                                }
                            }

                            var6 = var135 + 1;
                            var6 = var135 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                break label299;
                            }

                            int var217 = (var1.tl()) ? 1 : 0;
                            long var251 = var4;
                            var297 = var251 + 1L;
                            var297 = var251 * var297;
                            long var252 = var297 & 1L;
                            long var322;
                            int var253 = (var322 = var252 - 0L) == 0L ? 0 : (var322 < 0L ? -1 : 1);
                            if (var253 != 0) {
                                var135 |= 1919477825;
                                var135 *= 1730284347;
                                var135 ^= -211587300;
                            } else {
                                label312: {
                                    var135 |= -1126892001;
                                    var135 *= 1508140385;
                                    var135 |= 663208435;
                                    var135 ^= 1635203054;
                                    Integer var254 = var135;
                                    if (var254 == null) {
                                        break label299;
                                    }

                                    if (var217 != 0) {
                                        var135 = switch (var135) {
                                            case -1263364035 -> var135 ^ 1606604058;
                                            default -> var135 ^ -300821663;
                                            case 113830929 -> {
                                                var135 >>>= 22;
                                                var135 &= 1893087630;
                                                var135 -= 449167566;
                                                var135 <<= 26;
                                                yield var135 ^ 1442895945;
                                            }
                                        };
                                        var217 = var135 + 1;
                                        var217 = var135 * var217;
                                        var217 &= 1;
                                        if (var217 != 0) {
                                            break label299;
                                        }

                                        Entity var221 = i_2.QI();
                                        Integer var255 = var4;
                                        if (var255 == null) {
                                            var135 ^= -681752157;
                                            var135 ^= -1011821463;
                                            break label312;
                                        }

                                        var135 |= 1124270531;
                                        var135 ^= -1654419011;
                                        var135 -= -530379145;
                                        var135 *= -279956327;
                                        var135 ^= 238013167;
                                        Integer var256 = var135;
                                        if (var256 == null) {
                                            break label299;
                                        }

                                        boolean var257 = var221 instanceof LivingEntity;
                                        if (var257) {
                                            var135 ^= 1477043921;
                                            var135 ^= -581344192;
                                            long var258 = var135;
                                            var297 = var258 + 1L;
                                            var297 = var258 * var297;
                                            long var314 = var258 + 2L;
                                            var297 *= var314;
                                            long var259 = var258 + 3L;
                                            var297 *= var259;
                                            long var260 = var297 & 7L;
                                            long var323;
                                            int var261 = (var323 = var260 - 0L) == 0L ? 0 : (var323 < 0L ? -1 : 1);
                                            if (var261 != 0) {
                                                break label299;
                                            }

                                            LivingEntity var222 = (LivingEntity)var221;
                                            var262 = var222;
                                            int var274 = var4 + 1;
                                            var274 = var4 * var274;
                                            int var307 = var4 + 2;
                                            var274 *= var307;
                                            int var308 = var4 + 3;
                                            var274 *= var308;
                                            var274 &= 7;
                                            if (var274 == 0) {
                                                var135 *= 1955212849;
                                                var135 &= -1350159570;
                                                var135 ^= -2095171980;
                                                var274 = var135 + 1;
                                                var274 = var135 * var274;
                                                int var309 = var135 + 2;
                                                var274 *= var309;
                                                int var310 = var135 + 3;
                                                var274 *= var310;
                                                var274 &= 7;
                                                if (var274 != 0) {
                                                    break label299;
                                                }

                                                switch (var135) {
                                                    case 1971580:
                                                        var135 <<= 31;
                                                        var135 += -1796177831;
                                                        var135 ^= -742405842;
                                                        break label313;
                                                    case 1717449185:
                                                    default:
                                                        var135 ^= 1832926368;
                                                        break label313;
                                                    case 1910321567:
                                                        var135 ^= 1913656518;
                                                        break label313;
                                                }
                                            }

                                            var135 -= 925881353;
                                            var135 += -987191576;
                                            var135 *= 490938085;
                                            var135 ^= -1326506661;
                                            break label312;
                                        }

                                        var135 *= -2032042815;
                                        var135 *= 1456433907;
                                        var135 &= -408778470;
                                        var135 ^= -1036395542;
                                    } else {
                                        var135 -= -851803959;
                                        var135 ^= 1068871866;
                                    }

                                    int var284 = var135 + 1;
                                    var284 = var135 * var284;
                                    int var311 = var135 + 2;
                                    var284 *= var311;
                                    int var312 = var135 + 3;
                                    var284 *= var312;
                                    var284 &= 7;
                                    if (var284 != 0) {
                                        break label299;
                                    }

                                    var262 = null;
                                    var284 = var4 + 1;
                                    var284 = var4 * var284;
                                    var4 = var284 & 1;
                                    if (var4 == 0) {
                                        var135 <<= 24;
                                        var135 ^= 823494963;
                                        var4 = var135 + 1;
                                        var4 = var135 * var4;
                                        var284 = var135 + 2;
                                        var4 *= var284;
                                        var284 = var135 + 3;
                                        var4 *= var284;
                                        var4 &= 7;
                                        if (var4 != 0) {
                                            break label299;
                                        }

                                        var135 -= 1008667781;
                                        var135 ^= -1044826663;
                                        break label313;
                                    }

                                    var135 += -1643305467;
                                    var135 |= -1065920468;
                                    var135 ^= -1322864410;
                                    var135 *= 1242044901;
                                    var135 ^= 286634462;
                                }
                            }
                        } else {
                            var135 |= 1476917200;
                            var135 *= -1464837895;
                            var135 &= -1473921140;
                            var135 += -1094545820;
                            var135 ^= 201935859;
                        }
                    } else {
                        var135 *= -221349103;
                        var135 += -1906812455;
                        var135 ^= 880530030;
                    }
                } else {
                    var135 = var2 ^ 2048222315;
                    var135 *= 48267589;
                    var135 &= -1721604872;
                    var135 ^= 988766499;
                }

                Integer var149 = var135;
                if (var149 != null) {
                    IllegalArgumentException var150 = new IllegalArgumentException();
                    throw var150;
                }
                break label299;
            }

            int var158 = var135 + 1;
            var158 = var135 * var158;
            int var186 = var135 + 2;
            var158 *= var186;
            var186 = var135 + 3;
            var158 *= var186;
            var158 &= 7;
            if (var158 == 0) {
                return var262;
            }
        }

        RuntimeException var151 = new RuntimeException();
        throw var151;
    }

    @Override
    protected boolean BM(lH_3 var1) {
        int var2 = QL;
        var2 ^= 274874571;
        int var3 = System.identityHashCode(this);
        float var4 = var1.l();
        int var5 = var2 * 2067068885;
        var5 ^= 139997373;
        LivingEntity var581 = this.PX(var1, var5);
        int var6 = var3 + 1;
        var6 = var3 * var6;
        int var7 = var3 + 2;
        var6 *= var7;
        var7 = var3 + 3;
        var6 *= var7;
        var6 &= 7;
        if (var6 != 0) {
            var2 |= 2110058107;
            var2 ^= -1135158328;
        } else {
            label971: {
                label891: {
                    label892: {
                        var2 = switch (var2) {
                            default -> var2 ^ -839811501;
                            case 1133101372 -> {
                                var2 &= 384317428;
                                var2 &= 1258767223;
                                yield var2 ^ -1401449588;
                            }
                            case 1709067001 -> var2 ^ 1755944486;
                        };
                        if (var581 != null) {
                            var2 = switch (var2) {
                                case -1944737963 -> var2 ^ 1123016125;
                                case -1367895368 -> {
                                    var2 += -2006043783;
                                    var2 ^= -645825523;
                                    yield var2 ^ -1754755538;
                                }
                                default -> var2 ^ -366085024;
                            };
                            long var600 = var2;
                            long var8 = var600 + 1L;
                            var8 = var600 * var8;
                            long var10 = var600 + 2L;
                            var8 *= var10;
                            long var601 = var600 + 3L;
                            var8 *= var601;
                            long var602 = var8 & 7L;
                            long var1199;
                            var6 = (var1199 = var602 - 0L) == 0L ? 0 : (var1199 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                break label891;
                            }

                            LivingEntity var604 = this.rv;
                            Integer var648 = var3;
                            if (var648 == null) {
                                var2 += 2138111471;
                                var2 -= 164550158;
                                var2 += -1504062269;
                                var2 ^= 1469252609;
                                break label971;
                            }

                            var2 += -562177002;
                            var2 += 126050927;
                            var2 ^= 1119189724;
                            if (var581 != var604) {
                                var2 = switch (var2) {
                                    case -64480714 -> var2 ^ 1327401291;
                                    case 481822795 -> {
                                        var2 |= -1486997674;
                                        var2 -= -144064703;
                                        var2 ^= 1144956834;
                                        yield var2 ^ -1700073002;
                                    }
                                    default -> var2 ^ -1317467802;
                                };
                                Integer var605 = var2;
                                if (var605 == null) {
                                    break label891;
                                }

                                LivingEntity var606 = this.rv;
                                int var649 = var3 + 1;
                                var649 = var3 * var649;
                                var649 &= 1;
                                if (var649 != 0) {
                                    var2 ^= -528549534;
                                    var2 |= -80129615;
                                    var2 &= 747150989;
                                    var2 ^= -275568066;
                                    break label971;
                                }

                                var2 &= 63672870;
                                var2 += -2081579154;
                                var2 <<= 8;
                                var2 *= -60165733;
                                var2 ^= -1169435538;
                                var649 = var2 + 1;
                                var649 = var2 * var649;
                                int var731 = var2 + 2;
                                var649 *= var731;
                                int var732 = var2 + 3;
                                var649 *= var732;
                                var649 &= 7;
                                if (var649 != 0) {
                                    break label891;
                                }

                                boolean var610;
                                if (var606 != null) {
                                    var2 = switch (var2) {
                                        case -1352967401 -> var2 ^ -1973389187;
                                        default -> var2 ^ 1181327036;
                                        case 1255793774 -> {
                                            var2 >>>= 22;
                                            yield var2 ^ -1756899415;
                                        }
                                    };
                                    long var607 = var2;
                                    var8 = var607 + 1L;
                                    var8 = var607 * var8;
                                    long var608 = var8 & 1L;
                                    long var1200;
                                    int var609 = (var1200 = var608 - 0L) == 0L ? 0 : (var1200 < 0L ? -1 : 1);
                                    if (var609 != 0) {
                                        break label891;
                                    }

                                    var610 = true;
                                    var2 |= 1221773500;
                                    var2 |= -564987329;
                                    var2 &= -1940547608;
                                    var2 += -1382253047;
                                    var2 ^= -1782547730;
                                } else {
                                    var2 ^= -256235162;
                                    var2 *= -2093442237;
                                    var2 *= -525637509;
                                    var2 += -1160771959;
                                    var2 ^= -1928896020;
                                    var649 = var2 + 1;
                                    var649 = var2 * var649;
                                    int var735 = var2 + 2;
                                    var649 *= var735;
                                    int var736 = var2 + 3;
                                    var649 *= var736;
                                    var649 &= 7;
                                    if (var649 != 0) {
                                        break label891;
                                    }

                                    var610 = false;
                                    var2 &= 1894766261;
                                    var2 += -2096373613;
                                    var2 ^= 524552983;
                                }

                                long var662 = var2;
                                long var9 = var662 + 1L;
                                var9 = var662 * var9;
                                long var663 = var9 & 1L;
                                long var1201;
                                var649 = (var1201 = var663 - 0L) == 0L ? 0 : (var1201 < 0L ? -1 : 1);
                                if (var649 != 0) {
                                    break label891;
                                }

                                this.rv = var581;
                                var649 = var2 & 1744289821;
                                var649 &= 1695134468;
                                var649 += -2084698879;
                                var649 *= -447051047;
                                var649 ^= 1008903114;
                                float var670 = O(var581, var649);
                                Re var737 = this.Qy;
                                var737.v(var670);
                                Re var738 = this.F;
                                var738.v(var670);
                                int var739 = var2 + 1418180127;
                                int var740 = var739 * -1760196597;
                                int var741 = var740 ^ 551505266;
                                this.X(var581, var741);
                                Integer var742 = var3;
                                if (var742 == null) {
                                    var2 |= 956004929;
                                    var2 ^= 68411698;
                                    var2 ^= 2071178202;
                                    break label971;
                                }

                                var2 ^= 970274240;
                                var2 *= -584222383;
                                var2 ^= -1442760641;
                                var8 = var2;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                long var12 = var8 + 2L;
                                var10 *= var12;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var1202;
                                int var746 = (var1202 = var8 - 0L) == 0L ? 0 : (var1202 < 0L ? -1 : 1);
                                if (var746 != 0) {
                                    break label891;
                                }

                                int var747 = var2 >>> 3;
                                int var748 = var747 ^ 986976841;
                                int var749 = var748 >>> 4;
                                int var750 = var749 ^ 557643221;
                                this.t(var750);
                                boolean var751 = i_2.Jr(var581);
                                String var755;
                                if (var751) {
                                    var2 = switch (var2) {
                                        case -1938547600 -> {
                                            var2 -= 1505240642;
                                            yield var2 ^ -433382664;
                                        }
                                        case -1147335167 -> var2 ^ -2107133233;
                                        default -> var2 ^ 1313815787;
                                    };
                                    int var752 = var2 + 1;
                                    int var753 = var2 * var752;
                                    int var754 = var753 & 1;
                                    if (var754 != 0) {
                                        break label891;
                                    }

                                    var755 = "Player";
                                    var2 -= -286343718;
                                    var2 *= -1523641597;
                                    var2 ^= -1208628900;
                                } else {
                                    var2 <<= 18;
                                    var2 ^= -1793367244;
                                    var2 ^= 2042991759;
                                    Integer var907 = var2;
                                    if (var907 == null) {
                                        break label891;
                                    }

                                    boolean var908 = i_2.lJ(var581);
                                    var10 = var3;
                                    var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    long var14 = var10 + 2L;
                                    var12 *= var14;
                                    var10 += 3L;
                                    var12 *= var10;
                                    var10 = var12 & 7L;
                                    long var1203;
                                    int var1039 = (var1203 = var10 - 0L) == 0L ? 0 : (var1203 < 0L ? -1 : 1);
                                    if (var1039 != 0) {
                                        var2 ^= -1747395611;
                                        var2 *= 853402589;
                                        var2 ^= 1812632465;
                                        break label971;
                                    }
                                    var2 = switch (var2) {
                                        case -1658914885 -> {
                                            var2 ^= -894421457;
                                            var2 -= -2036718760;
                                            yield var2 ^ 539647472;
                                        }
                                        default -> var2 ^ -1584067639;
                                        case 248419902 -> var2 ^ 1429138732;
                                    };
                                    if (var908) {
                                        var2 -= -950897486;
                                        var2 |= 1590780662;
                                        var2 >>= 25;
                                        var2 ^= -1113764771;
                                        int var909 = var2 + 1;
                                        int var910 = var2 * var909;
                                        int var911 = var910 & 1;
                                        if (var911 != 0) {
                                            break label891;
                                        }

                                        var755 = "Hostile";
                                        var2 ^= 1682872201;
                                        var2 ^= -1467919805;
                                    } else {
                                        var2 >>>= 31;
                                        var2 |= 1547806055;
                                        var2 *= -1476916511;
                                        var2 |= -244334237;
                                        var2 ^= 1386663231;
                                        var755 = "Mob";
                                        var2 += 31518186;
                                        var2 &= -32506897;
                                        var2 ^= -749167766;
                                    }
                                }

                                Integer var912 = var2;
                                if (var912 == null) {
                                    break label891;
                                }

                                this.Om = var755;
                                Integer var756 = var3;
                                if (var756 == null) {
                                    switch (var2) {
                                        case 1626138071:
                                            var2 ^= -549029614;
                                            break label971;
                                        case 1852305261:
                                        default:
                                            var2 ^= 64760899;
                                            break label971;
                                        case 1901234600:
                                            var2 -= -391409870;
                                            var2 |= 1349762436;
                                            var2 -= -806640438;
                                            var2 ^= -896045157;
                                            break label971;
                                    }
                                }

                                var2 += -1108887922;
                                var2 <<= 9;
                                var2 &= 1956033352;
                                var2 *= 806231771;
                                var2 ^= 1174828825;
                                var8 = var2;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                var12 = var8 + 2L;
                                var10 *= var12;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var1204;
                                int var760 = (var1204 = var8 - 0L) == 0L ? 0 : (var1204 < 0L ? -1 : 1);
                                if (var760 != 0) {
                                    break label891;
                                }

                                this.O = true;
                                if (var610) {
                                    var2 = switch (var2) {
                                        case -822549495 -> var2 ^ 1899829971;
                                        default -> var2 ^ 251773599;
                                        case 727521049 -> {
                                            var2 &= 1008698586;
                                            yield var2 ^ 773571112;
                                        }
                                    };
                                    Integer var761 = var2;
                                    if (var761 == null) {
                                        break label891;
                                    }

                                    this.tP = 0.0F;
                                    var2 -= 1060731192;
                                    var2 ^= -1215694111;
                                } else {
                                    var2 += 236540347;
                                    var2 ^= 1511640372;
                                    var2 ^= 304813049;
                                }

                                var2 |= 36854579;
                                var2 |= 492576767;
                                var2 -= -162162239;
                                var2 ^= -1466491110;
                                break label892;
                            }

                            var2 *= -660141487;
                            var2 ^= 1836340055;
                        } else {
                            switch (var2) {
                                case -1500557463:
                                default:
                                    var2 ^= -1535615156;
                                    break;
                                case -1367895368:
                                    var2 ^= 1066124274;
                                    var2 &= 1120881659;
                                    var2 ^= -1698521178;
                                    break;
                                case 468693116:
                                    var2 ^= 1098212325;
                            }
                        }

                        long var762 = var2;
                        long var1044 = var762 + 1L;
                        var1044 = var762 * var1044;
                        long var1151 = var762 + 2L;
                        var1044 *= var1151;
                        var762 += 3L;
                        var1044 *= var762;
                        var762 = var1044 & 7L;
                        long var1205;
                        int var765 = (var1205 = var762 - 0L) == 0L ? 0 : (var1205 < 0L ? -1 : 1);
                        if (var765 != 0) {
                            break label891;
                        }

                        LivingEntity var766 = this.rv;
                        int var913 = var3 + 1;
                        var913 = var3 * var913;
                        int var1048 = var3 + 2;
                        var913 *= var1048;
                        int var1049 = var3 + 3;
                        var913 *= var1049;
                        var913 &= 7;
                        if (var913 != 0) {
                            switch (var2) {
                                case -1710301460:
                                    var2 &= 1541924492;
                                    var2 >>>= 14;
                                    var2 ^= -1013228372;
                                    break label971;
                                case 679015158:
                                default:
                                    var2 ^= -1076523619;
                                    break label971;
                                case 1932216060:
                                    var2 ^= -1266248733;
                                    break label971;
                            }
                        }

                        var2 ^= -1268051559;
                        var2 |= 463025264;
                        var2 &= 2064602599;
                        var2 *= 2084995495;
                        var2 ^= -2099860529;
                        var913 = var2 + 1;
                        var913 = var2 * var913;
                        var913 &= 1;
                        if (var913 != 0) {
                            break label891;
                        }

                        if (var766 != null) {
                            var2 ^= 2104840126;
                            var2 += -1728178039;
                            var2 += 1001012680;
                            var2 -= -1247939222;
                            var2 ^= 69566149;
                            var762 = var2;
                            var1044 = var762 + 1L;
                            var1044 = var762 * var1044;
                            var1151 = var762 + 2L;
                            var1044 *= var1151;
                            var762 += 3L;
                            var1044 *= var762;
                            var762 = var1044 & 7L;
                            long var1206;
                            int var770 = (var1206 = var762 - 0L) == 0L ? 0 : (var1206 < 0L ? -1 : 1);
                            if (var770 != 0) {
                                break label891;
                            }

                            float var771 = this.ym;
                            float var772 = var771 + var4;
                            this.ym = var772;
                            float var1207;
                            int var773 = (var1207 = var772 - 1.0F) == 0.0F ? 0 : (var1207 < 0.0F ? -1 : 1);
                            var913 = var3 + 1;
                            var913 = var3 * var913;
                            var913 &= 1;
                            if (var913 != 0) {
                                var2 &= 1069256720;
                                var2 &= 608581413;
                                var2 &= -1466733218;
                                var2 -= 194425128;
                                var2 ^= 938637935;
                                break label971;
                            }

                            var2 += -2144713267;
                            var2 -= 186814351;
                            var2 ^= -1293421168;
                            long var924 = var2;
                            long var11 = var924 + 1L;
                            var11 = var924 * var11;
                            long var925 = var11 & 1L;
                            long var1208;
                            var913 = (var1208 = var925 - 0L) == 0L ? 0 : (var1208 < 0L ? -1 : 1);
                            if (var913 != 0) {
                                break label891;
                            }

                            if (var773 > 0) {
                                var2 ^= 865462030;
                                var2 ^= 896909000;
                                Integer var774 = var2;
                                if (var774 == null) {
                                    break label891;
                                }

                                LivingEntity var775 = this.rv;
                                Integer var927 = var3;
                                if (var927 == null) {
                                    var2 >>= 5;
                                    var2 &= 61834843;
                                    var2 &= 945908315;
                                    var2 ^= -1013303578;
                                    break label971;
                                }
                                var2 = switch (var2) {
                                    case -1188037972 -> {
                                        var2 |= -304288146;
                                        var2 >>>= 5;
                                        var2 += 664868893;
                                        yield var2 ^ -623803271;
                                    }
                                    case -49539859 -> var2 ^ 358970828;
                                    default -> var2 ^ -140125637;
                                };
                                var927 = var2;
                                if (var927 == null) {
                                    break label891;
                                }

                                int var929 = var2 - 1533474769;
                                var929 -= 576611774;
                                var929 |= 1991881943;
                                var929 ^= 1822192327;
                                this.X(var775, var929);
                                switch (var2) {
                                    case -712746290:
                                    default:
                                        var2 ^= -596452247;
                                        break;
                                    case -180315027:
                                        var2 >>= 7;
                                        var2 *= 10960927;
                                        var2 |= 1153178596;
                                        var2 ^= 968274671;
                                        var2 ^= 579002338;
                                        break;
                                    case 96699664:
                                        var2 ^= -1725795157;
                                }
                            } else {
                                var2 += 1821008404;
                                var2 ^= -1939995812;
                                var2 ^= 1452266691;
                            }

                            int var776 = var2 + 1;
                            int var777 = var2 * var776;
                            int var778 = var777 & 1;
                            if (var778 != 0) {
                                break label891;
                            }

                            float var779 = this.Ib;
                            float var780 = var779 + var4;
                            var913 = var3 + 1;
                            var913 = var3 * var913;
                            int var1054 = var3 + 2;
                            var913 *= var1054;
                            int var1055 = var3 + 3;
                            var913 *= var1055;
                            var913 &= 7;
                            if (var913 != 0) {
                                var2 ^= 937826975;
                                var2 |= 2032454419;
                                var2 ^= 989265864;
                                break label971;
                            }

                            var2 *= -1584256931;
                            var2 <<= 27;
                            var2 <<= 11;
                            var2 |= -166137556;
                            var2 ^= 655298608;
                            this.Ib = var780;
                            float var1209;
                            int var781 = (var1209 = var780 - 1.0F) == 0.0F ? 0 : (var1209 < 0.0F ? -1 : 1);
                            if (var781 > 0) {
                                var2 = switch (var2) {
                                    case -786964196 -> {
                                        var2 -= -1471380624;
                                        var2 -= -1169116103;
                                        var2 ^= 1492572401;
                                        var2 &= -1678497656;
                                        yield var2 ^ -322610519;
                                    }
                                    default -> var2 ^ 1837678289;
                                    case 357917110 -> var2 ^ 326263711;
                                };
                                Integer var782 = var2;
                                if (var782 == null) {
                                    break label891;
                                }

                                int var783 = var2 & 1214266027;
                                int var784 = var783 * -531667707;
                                int var785 = var784 | -1588588709;
                                int var786 = var785 ^ -1873603818;
                                this.t(var786);
                                switch (var2) {
                                    case -963139835:
                                        var2 ^= -1236969690;
                                        break;
                                    case -29263319:
                                        var2 |= 1600451230;
                                        var2 ^= -556039269;
                                        break;
                                    case 1739284515:
                                    default:
                                        var2 ^= -448308679;
                                }
                            } else {
                                var2 *= 1222414795;
                                var2 *= -2052340503;
                                var2 *= -737389797;
                                var2 |= -1277937491;
                                var2 ^= -1706901031;
                            }
                        } else {
                            switch (var2) {
                                case -1600541199:
                                    var2 ^= 507590208;
                                    break;
                                case 26096172:
                                    var2 *= 315271615;
                                    var2 ^= -1756363792;
                                    break;
                                case 1681782744:
                                default:
                                    var2 ^= 1523477237;
                            }
                        }
                    }

                    long var787 = var2;
                    long var1056 = var787 + 1L;
                    var1056 = var787 * var1056;
                    long var1153 = var787 + 2L;
                    var1056 *= var1153;
                    var787 += 3L;
                    var1056 *= var787;
                    var787 = var1056 & 7L;
                    long var1210;
                    int var790 = (var1210 = var787 - 0L) == 0L ? 0 : (var1210 < 0L ? -1 : 1);
                    label791:
                    if (var790 == 0) {
                        XF var791 = this.UA;
                        var791.H(0.0F);
                        XF var792 = this.UA;
                        float var793 = var792.N(var4);
                        this.L = var793;
                        Integer var794 = var3;
                        if (var794 == null) {
                            switch (var2) {
                                case 368291669:
                                default:
                                    var2 ^= -1798474631;
                                    break label971;
                                case 566130980:
                                    var2 |= -23195719;
                                    var2 -= -1908068477;
                                    var2 &= 2142931636;
                                    var2 &= -1763097031;
                                    var2 ^= -743230329;
                                    break label971;
                                case 2120383516:
                                    var2 ^= -1841339081;
                                    break label971;
                            }
                        }

                        var2 ^= -1885745032;
                        var2 <<= 6;
                        var2 ^= -723349940;
                        float var795 = this.tP;
                        float var938 = var4 / 0.32F;
                        float var796 = var795 + var938;
                        float var797 = Math.min(1.0F, var796);
                        this.tP = var797;
                        r_2 var798 = this.Z;
                        Nb var939 = Nb.MODERN;
                        boolean var799 = var798.TJ(var939);
                        float var803;
                        if (var799) {
                            var2 |= 167625196;
                            var2 ^= 1416936484;
                            int var800 = var2 + 1;
                            int var801 = var2 * var800;
                            int var802 = var801 & 1;
                            if (var802 != 0) {
                                break label791;
                            }

                            var803 = 148.0F;
                            var2 *= -533853309;
                            var2 ^= -229698849;
                            var2 ^= -1295452793;
                        } else {
                            var2 *= -147714747;
                            var2 += 1069604946;
                            var2 -= 733786069;
                            var2 ^= 1512563770;
                            long var940 = var2;
                            long var1106 = var940 + 1L;
                            var1106 = var940 * var1106;
                            long var13 = var940 + 2L;
                            var1106 *= var13;
                            long var941 = var940 + 3L;
                            var1106 *= var941;
                            long var942 = var1106 & 7L;
                            long var1211;
                            int var943 = (var1211 = var942 - 0L) == 0L ? 0 : (var1211 < 0L ? -1 : 1);
                            if (var943 != 0) {
                                break label791;
                            }

                            var803 = 118.0F;
                            var2 -= 1557756190;
                            var2 ^= -90289499;
                        }

                        long var944 = var2;
                        long var1110 = var944 + 1L;
                        var1110 = var944 * var1110;
                        long var1169 = var944 + 2L;
                        var1110 *= var1169;
                        long var945 = var944 + 3L;
                        var1110 *= var945;
                        long var946 = var1110 & 7L;
                        long var1212;
                        int var947 = (var1212 = var946 - 0L) == 0L ? 0 : (var1212 < 0L ? -1 : 1);
                        label782:
                        if (var947 == 0) {
                            if (var799) {
                                var2 -= -201462391;
                                var2 |= 1169849264;
                                var2 >>= 11;
                                var2 ^= 1890784068;
                                Integer var948 = var2;
                                if (var948 == null) {
                                    break label782;
                                }

                                var938 = 50.5F;
                                var2 += 963060806;
                                var2 ^= 1123229713;
                            } else {
                                var2 <<= 12;
                                var2 ^= -605916357;
                                var2 *= 2033255901;
                                var2 += -1524371059;
                                var2 ^= 1247685235;
                                var1056 = var2;
                                var1153 = var1056 + 1L;
                                var1153 = var1056 * var1153;
                                var1056 = var1153 & 1L;
                                long var1213;
                                int var1062 = (var1213 = var1056 - 0L) == 0L ? 0 : (var1213 < 0L ? -1 : 1);
                                if (var1062 != 0) {
                                    break label782;
                                }

                                var938 = 32.0F;
                                var2 &= 1192591713;
                                var2 ^= 2124677298;
                                var2 ^= 556797019;
                                var2 ^= -1302879096;
                            }

                            Integer var1063 = var2;
                            if (var1063 != null) {
                                this.dV(var803, var938);
                                Integer var804 = var3;
                                if (var804 == null) {
                                    var2 -= 1125442058;
                                    var2 |= -1991044131;
                                    var2 &= 1809607146;
                                    var2 |= -1343145173;
                                    var2 ^= 1818644316;
                                    break label971;
                                }

                                var2 |= -474691354;
                                var2 &= -1682076010;
                                var2 += 528646887;
                                var2 += 453662258;
                                var2 ^= 840679944;
                                var787 = var2;
                                var1056 = var787 + 1L;
                                var1056 = var787 * var1056;
                                var787 = var1056 & 1L;
                                long var1214;
                                int var807 = (var1214 = var787 - 0L) == 0L ? 0 : (var1214 < 0L ? -1 : 1);
                                if (var807 == 0) {
                                    LivingEntity var808 = this.rv;
                                    if (var808 == null) {
                                        var2 *= -718783309;
                                        var2 ^= 980881435;
                                        var787 = var2;
                                        var1056 = var787 + 1L;
                                        var1056 = var787 * var1056;
                                        var787 = var1056 & 1L;
                                        long var1215;
                                        int var905 = (var1215 = var787 - 0L) == 0L ? 0 : (var1215 < 0L ? -1 : 1);
                                        if (var905 == 0) {
                                            return false;
                                        }
                                    } else {
                                        label980: {
                                            var2 ^= 1802328014;
                                            var2 ^= 1971699917;
                                            LivingEntity var809 = this.rv;
                                            Integer var950 = var3;
                                            if (var950 == null) {
                                                var2 <<= 24;
                                                var2 *= -662839383;
                                                var2 += 2091795287;
                                                var2 ^= -214599712;
                                                break label971;
                                            }
                                            var2 = switch (var2) {
                                                case -357485420 -> {
                                                    var2 *= -771888043;
                                                    var2 ^= 1194948509;
                                                    yield var2 ^ -1024500215;
                                                }
                                                default -> var2 ^ -478803731;
                                                case 1676146816 -> var2 ^ -1507271922;
                                            };
                                            int var951 = var2 | -2094322795;
                                            int var952 = var951 & 1277750658;
                                            int var953 = var952 | -57620988;
                                            int var954 = var953 + -1749870225;
                                            int var955 = var954 ^ 1942378500;
                                            float var810 = O(var809, var955);
                                            Re var811 = this.Qy;
                                            float var812 = var811.Gc(var810, var4);
                                            this.Cx = var812;
                                            float var813 = this.bF;
                                            float var814 = var813 - var4;
                                            this.bF = var814;
                                            float var815 = this.bF;
                                            float var1216;
                                            int var816 = (var1216 = var815 - 0.0F) == 0.0F ? 0 : (var1216 < 0.0F ? -1 : 1);
                                            if (var816 <= 0) {
                                                var2 += 790733125;
                                                var2 ^= -689215591;
                                                Re var817 = this.F;
                                                long var956 = var3;
                                                var1110 = var956 + 1L;
                                                var1110 = var956 * var1110;
                                                var1169 = var956 + 2L;
                                                var1110 *= var1169;
                                                long var957 = var956 + 3L;
                                                var1110 *= var957;
                                                long var958 = var1110 & 7L;
                                                long var1217;
                                                int var959 = (var1217 = var958 - 0L) == 0L ? 0 : (var1217 < 0L ? -1 : 1);
                                                if (var959 != 0) {
                                                    var2 += 29582027;
                                                    var2 |= 1145829948;
                                                    var2 |= 646377891;
                                                    var2 ^= -1270559992;
                                                    break label971;
                                                }

                                                var2 ^= -751588123;
                                                var2 *= -1607955837;
                                                var2 -= -1936270207;
                                                var2 ^= -89973643;
                                                int var960 = var2 + 1;
                                                int var961 = var2 * var960;
                                                int var962 = var961 & 1;
                                                if (var962 != 0) {
                                                    break label980;
                                                }

                                                float var672 = var817.Gc(var810, var4);
                                                var2 |= -890985988;
                                                var2 ^= 718830481;
                                                var2 *= 29058045;
                                                var2 *= -2070495655;
                                                var2 ^= -80426609;
                                            } else {
                                                var2 *= 126052303;
                                                var2 ^= 1309039359;
                                                var2 ^= -41151898;
                                            }

                                            long var673 = var2;
                                            long var963 = var673 + 1L;
                                            long var964 = var673 * var963;
                                            long var674 = var964 & 1L;
                                            long var1218;
                                            var7 = (var1218 = var674 - 0L) == 0L ? 0 : (var1218 < 0L ? -1 : 1);
                                            if (var7 == 0) {
                                                Re var676 = this.F;
                                                float var677 = var676.ey();
                                                float var818 = this.Cx;
                                                float var1219;
                                                var7 = (var1219 = var677 - var818) == 0.0F ? 0 : (var1219 < 0.0F ? -1 : 1);
                                                var787 = var3;
                                                var1056 = var787 + 1L;
                                                var1056 = var787 * var1056;
                                                var787 = var1056 & 1L;
                                                long var1220;
                                                int var821 = (var1220 = var787 - 0L) == 0L ? 0 : (var1220 < 0L ? -1 : 1);
                                                if (var821 != 0) {
                                                    var2 *= 939145389;
                                                    var2 &= 1814449497;
                                                    var2 >>>= 29;
                                                    var2 ^= -1013238603;
                                                    break label971;
                                                }

                                                var2 -= -68873996;
                                                var2 -= -742742541;
                                                var2 ^= 426756940;
                                                Integer var822 = var2;
                                                label759:
                                                if (var822 != null) {
                                                    if (var7 < 0) {
                                                        var2 -= 1324469085;
                                                        var2 ^= -1251550620;
                                                        var2 <<= 29;
                                                        var2 ^= 155379138;
                                                        long var679 = var2;
                                                        long var965 = var679 + 1L;
                                                        long var966 = var679 * var965;
                                                        long var680 = var966 & 1L;
                                                        long var1221;
                                                        var7 = (var1221 = var680 - 0L) == 0L ? 0 : (var1221 < 0L ? -1 : 1);
                                                        if (var7 != 0) {
                                                            break label759;
                                                        }

                                                        Re var682 = this.F;
                                                        float var823 = this.Cx;
                                                        Integer var967 = var3;
                                                        if (var967 == null) {
                                                            switch (var2) {
                                                                case -1455233598:
                                                                    var2 <<= 11;
                                                                    var2 ^= 324347067;
                                                                    var2 += -439640638;
                                                                    var2 ^= 702408394;
                                                                    break label971;
                                                                case -1166445529:
                                                                default:
                                                                    var2 ^= 200645673;
                                                                    break label971;
                                                                case -97897288:
                                                                    var2 ^= 1840580669;
                                                                    break label971;
                                                            }
                                                        }

                                                        var2 *= -802902525;
                                                        var2 ^= -1869792703;
                                                        long var968 = var2;
                                                        var1110 = var968 + 1L;
                                                        var1110 = var968 * var1110;
                                                        long var969 = var1110 & 1L;
                                                        long var1222;
                                                        int var970 = (var1222 = var969 - 0L) == 0L ? 0 : (var1222 < 0L ? -1 : 1);
                                                        if (var970 != 0) {
                                                            break label759;
                                                        }

                                                        var682.v(var823);
                                                        switch (var2) {
                                                            case -206063865:
                                                                var2 *= 949034851;
                                                                var2 >>>= 27;
                                                                var2 &= 310960604;
                                                                var2 ^= 605769405;
                                                                break;
                                                            case 187411789:
                                                                var2 ^= 2001771415;
                                                                break;
                                                            case 2117315620:
                                                            default:
                                                                var2 ^= 328005790;
                                                        }
                                                    } else {
                                                        var2 >>= 6;
                                                        var2 ^= 2026795662;
                                                        var2 |= 2008503412;
                                                        var2 ^= 1541675733;
                                                    }

                                                    Integer var683 = var2;
                                                    label750:
                                                    if (var683 != null) {
                                                        LivingEntity var684 = this.rv;
                                                        Integer var824 = var3;
                                                        if (var824 == null) {
                                                            switch (var2) {
                                                                case -326843444:
                                                                default:
                                                                    var2 ^= -2075492777;
                                                                    break label971;
                                                                case 605769385:
                                                                    var2 += -1676635764;
                                                                    var2 *= -690211493;
                                                                    var2 ^= -1558929568;
                                                                    break label971;
                                                                case 1633181534:
                                                                    var2 ^= 163221111;
                                                                    break label971;
                                                            }
                                                        }

                                                        var2 += 1725909904;
                                                        var2 ^= 1146145626;
                                                        var2 ^= -2115767178;
                                                        var2 ^= -476117146;
                                                        int var685 = var684.hurtTime;
                                                        float var692;
                                                        if (var685 > 0) {
                                                            var2 |= -1985954713;
                                                            var2 -= -330195945;
                                                            var2 ^= 626527942;
                                                            var2 &= 2101330987;
                                                            var2 ^= 2103534955;
                                                            LivingEntity var686 = this.rv;
                                                            var685 = var686.hurtTime;
                                                            float var688 = var685;
                                                            float var825 = var1.fV();
                                                            float var689 = var688 - var825;
                                                            Integer var826 = var3;
                                                            if (var826 == null) {
                                                                var2 |= 1775790783;
                                                                var2 ^= -1169727672;
                                                                break label971;
                                                            }

                                                            var2 *= -1740231735;
                                                            var2 ^= -623269425;
                                                            int var827 = var2 + 1;
                                                            int var828 = var2 * var827;
                                                            int var971 = var2 + 2;
                                                            int var829 = var828 * var971;
                                                            int var972 = var2 + 3;
                                                            int var830 = var829 * var972;
                                                            int var831 = var830 & 7;
                                                            if (var831 != 0) {
                                                                break label750;
                                                            }

                                                            float var690 = var689 / 10.0F;
                                                            float var691 = TP.S(var690);
                                                            var692 = var691;
                                                            switch (var2) {
                                                                case -2062807906:
                                                                    var2 |= 911118149;
                                                                    var2 |= 78543056;
                                                                    var2 &= -1633505433;
                                                                    var2 ^= 1369618413;
                                                                    break;
                                                                case -1432325901:
                                                                default:
                                                                    var2 ^= 1731708117;
                                                                    break;
                                                                case -1289333521:
                                                                    var2 ^= 216497497;
                                                            }
                                                        } else {
                                                            var2 ^= 1845808788;
                                                            var2 -= 1901232470;
                                                            var2 ^= -1833376180;
                                                            var692 = 0.0F;
                                                            var2 |= -66245222;
                                                            var2 += 28576399;
                                                            var2 ^= -964484924;
                                                        }

                                                        var787 = var2;
                                                        var1056 = var787 + 1L;
                                                        var1056 = var787 * var1056;
                                                        var787 = var1056 & 1L;
                                                        long var1223;
                                                        int var834 = (var1223 = var787 - 0L) == 0L ? 0 : (var1223 < 0L ? -1 : 1);
                                                        label742:
                                                        if (var834 == 0) {
                                                            this.rD = var692;
                                                            StringBuilder var693 = this.rm;
                                                            var693.setLength(0);
                                                            StringBuilder var694 = this.rm;
                                                            LivingEntity var835 = this.rv;
                                                            float var836 = var835.getHealth();
                                                            int var973 = var2 | 705388182;
                                                            int var974 = var973 | 1199511396;
                                                            int var975 = var974 + -378142260;
                                                            int var976 = var975 ^ 831098316;
                                                            c(var694, var836, var976);
                                                            var685 = var3 + 1;
                                                            var685 = var3 * var685;
                                                            var685 &= 1;
                                                            if (var685 != 0) {
                                                                var2 *= 219667355;
                                                                var2 |= -165313319;
                                                                var2 ^= 1022683208;
                                                                break label971;
                                                            }

                                                            var2 -= 530850428;
                                                            var2 ^= -152634241;
                                                            StringBuilder var698 = this.qc;
                                                            var698.setLength(0);
                                                            LivingEntity var699 = this.rv;
                                                            float var700 = var699.getAbsorptionAmount();
                                                            float var1224;
                                                            var685 = (var1224 = var700 - 0.0F) == 0.0F ? 0 : (var1224 < 0.0F ? -1 : 1);
                                                            if (var685 > 0) {
                                                                var2 = switch (var2) {
                                                                    default -> var2 ^ -176151414;
                                                                    case 1371343441 -> {
                                                                        var2 -= 1803801825;
                                                                        yield var2 ^ 75239859;
                                                                    }
                                                                    case 1688980547 -> var2 ^ 1936503055;
                                                                };
                                                                long var702 = var2;
                                                                long var977 = var702 + 1L;
                                                                long var978 = var702 * var977;
                                                                long var703 = var978 & 1L;
                                                                long var1225;
                                                                var685 = (var1225 = var703 - 0L) == 0L ? 0 : (var1225 < 0L ? -1 : 1);
                                                                if (var685 != 0) {
                                                                    break label742;
                                                                }

                                                                StringBuilder var705 = this.qc;
                                                                StringBuilder var706 = var705.append('+');
                                                                LivingEntity var837 = this.rv;
                                                                long var979 = var3;
                                                                var1110 = var979 + 1L;
                                                                var1110 = var979 * var1110;
                                                                long var980 = var1110 & 1L;
                                                                long var1226;
                                                                int var981 = (var1226 = var980 - 0L) == 0L ? 0 : (var1226 < 0L ? -1 : 1);
                                                                if (var981 != 0) {
                                                                    switch (var2) {
                                                                        case -1206670411:
                                                                        default:
                                                                            var2 ^= 810352267;
                                                                            break label971;
                                                                        case -498785085:
                                                                            var2 <<= 30;
                                                                            var2 ^= 60503223;
                                                                            break label971;
                                                                        case 23990876:
                                                                            var2 ^= -1522689531;
                                                                            break label971;
                                                                    }
                                                                }

                                                                var2 ^= -541250298;
                                                                var2 ^= 84774649;
                                                                var2 &= -832964741;
                                                                var2 ^= 1923501743;
                                                                float var838 = var837.getAbsorptionAmount();
                                                                int var982 = var2 | -1054178385;
                                                                int var983 = var982 << 4;
                                                                int var984 = var983 ^ -1653669527;
                                                                int var985 = var984 ^ -873507169;
                                                                c(var706, var838, var985);
                                                                var2 *= 1891908201;
                                                                var2 >>>= 16;
                                                                var2 <<= 5;
                                                                var2 ^= -397837944;
                                                                var2 ^= -911652400;
                                                            } else {
                                                                var2 &= 1601281266;
                                                                var2 |= 1463483226;
                                                                var2 ^= 1992594978;
                                                            }

                                                            long var707 = var2;
                                                            long var986 = var707 + 1L;
                                                            long var987 = var707 * var986;
                                                            long var708 = var987 & 1L;
                                                            long var1227;
                                                            var685 = (var1227 = var708 - 0L) == 0L ? 0 : (var1227 < 0L ? -1 : 1);
                                                            if (var685 == 0) {
                                                                this.De = 0;
                                                                Integer var710 = var3;
                                                                if (var710 == null) {
                                                                    var2 ^= 2083339443;
                                                                    var2 += -1866615333;
                                                                    var2 |= 1802572879;
                                                                    var2 ^= 745153368;
                                                                    break label971;
                                                                }

                                                                var2 -= 965387243;
                                                                var2 &= -1803475215;
                                                                var2 -= -270979062;
                                                                var2 ^= -843754276;
                                                                int var711 = var2 + 1;
                                                                var711 = var2 * var711;
                                                                int var839 = var2 + 2;
                                                                var711 *= var839;
                                                                int var840 = var2 + 3;
                                                                var711 *= var840;
                                                                var711 &= 7;
                                                                label732:
                                                                if (var711 == 0) {
                                                                    if (var799) {
                                                                        var2 += -143909591;
                                                                        var2 ^= -1872445192;
                                                                        JL var612 = this.dv;
                                                                        long var716 = var3;
                                                                        long var988 = var716 + 1L;
                                                                        long var989 = var716 * var988;
                                                                        long var717 = var989 & 1L;
                                                                        long var1228;
                                                                        var711 = (var1228 = var717 - 0L) == 0L ? 0 : (var1228 < 0L ? -1 : 1);
                                                                        if (var711 != 0) {
                                                                            var2 <<= 13;
                                                                            var2 ^= -1346456393;
                                                                            break label971;
                                                                        }

                                                                        var2 |= -515504494;
                                                                        var2 ^= -926629215;
                                                                        var711 = var2 + 1;
                                                                        var711 = var2 * var711;
                                                                        int var841 = var2 + 2;
                                                                        var711 *= var841;
                                                                        int var842 = var2 + 3;
                                                                        var711 *= var842;
                                                                        var711 &= 7;
                                                                        if (var711 != 0) {
                                                                            break label732;
                                                                        }

                                                                        int var613 = (var612.vb()) ? 1 : 0;
                                                                        if (var613 != 0) {
                                                                            var2 |= 374008010;
                                                                            var2 ^= -992140879;
                                                                            long var614 = var2;
                                                                            var787 = var614 + 1L;
                                                                            var787 = var614 * var787;
                                                                            var1056 = var614 + 2L;
                                                                            var787 *= var1056;
                                                                            long var615 = var614 + 3L;
                                                                            var787 *= var615;
                                                                            long var616 = var787 & 7L;
                                                                            long var1229;
                                                                            var613 = (var1229 = var616 - 0L) == 0L ? 0 : (var1229 < 0L ? -1 : 1);
                                                                            if (var613 != 0) {
                                                                                break label732;
                                                                            }

                                                                            LivingEntity var618 = this.rv;
                                                                            ItemStack[] var724 = this.Ou;
                                                                            i_2.wB(var618, var724);
                                                                            ItemStack[] var619 = this.Ou;
                                                                            ItemStack[] var620 = var619;
                                                                            var711 = var619.length;
                                                                            Integer var847 = var3;
                                                                            if (var847 == null) {
                                                                                switch (var2) {
                                                                                    case -1148549953:
                                                                                        var2 ^= -2080753543;
                                                                                        break label971;
                                                                                    case -75051922:
                                                                                        var2 &= 412526960;
                                                                                        var2 ^= -618808105;
                                                                                        break label971;
                                                                                    case 2051635682:
                                                                                    default:
                                                                                        var2 ^= 2048215067;
                                                                                        break label971;
                                                                                }
                                                                            }

                                                                            var2 -= 1730549981;
                                                                            var2 |= 1824425259;
                                                                            var2 ^= -281229332;
                                                                            int var848 = var2 + 1;
                                                                            int var849 = var2 * var848;
                                                                            int var850 = var849 & 1;
                                                                            if (var850 != 0) {
                                                                                break label732;
                                                                            }

                                                                            var711 = var711;
                                                                            byte var851 = 0;
                                                                            int var852 = var851;
                                                                            var2 &= 1037662976;
                                                                            var2 |= 2139677998;
                                                                            var2 ^= -1778145925;

                                                                            while (true) {
                                                                                int var990 = var2 + 1;
                                                                                int var991 = var2 * var990;
                                                                                int var992 = var991 & 1;
                                                                                if (var992 != 0) {
                                                                                    break label732;
                                                                                }

                                                                                if (var852 >= var711) {
                                                                                    var2 |= 992310576;
                                                                                    var2 ^= -1622901569;
                                                                                    var2 ^= 1002027192;
                                                                                    break;
                                                                                }

                                                                                var2 ^= -260129637;
                                                                                var2 -= -312126722;
                                                                                var2 ^= -991144630;
                                                                                Integer var993 = var2;
                                                                                if (var993 == null) {
                                                                                    break label732;
                                                                                }

                                                                                ItemStack var994 = var620[var852];
                                                                                var1056 = var3;
                                                                                var1153 = var1056 + 1L;
                                                                                var1153 = var1056 * var1153;
                                                                                var1056 = var1153 & 1L;
                                                                                long var1230;
                                                                                int var1073 = (var1230 = var1056 - 0L) == 0L ? 0 : (var1230 < 0L ? -1 : 1);
                                                                                if (var1073 != 0) {
                                                                                    switch (var2) {
                                                                                        case -565013628:
                                                                                        default:
                                                                                            var2 ^= 716538351;
                                                                                            break label971;
                                                                                        case -390280038:
                                                                                            var2 += 1285366379;
                                                                                            var2 <<= 21;
                                                                                            var2 |= -1714410869;
                                                                                            var2 ^= 980098620;
                                                                                            break label971;
                                                                                        case 246007131:
                                                                                            var2 ^= 900418275;
                                                                                            break label971;
                                                                                    }
                                                                                }

                                                                                var2 &= -1106419764;
                                                                                var2 <<= 15;
                                                                                var2 *= 925482197;
                                                                                var2 ^= 256594285;
                                                                                var2 ^= -1251890628;
                                                                                var1056 = var2;
                                                                                var1153 = var1056 + 1L;
                                                                                var1153 = var1056 * var1153;
                                                                                long var1181 = var1056 + 2L;
                                                                                var1153 *= var1181;
                                                                                var1056 += 3L;
                                                                                var1153 *= var1056;
                                                                                var1056 = var1153 & 7L;
                                                                                long var1231;
                                                                                int var1077 = (var1231 = var1056 - 0L) == 0L ? 0 : (var1231 < 0L ? -1 : 1);
                                                                                if (var1077 != 0) {
                                                                                    break label732;
                                                                                }

                                                                                boolean var995 = var994.isEmpty();
                                                                                if (!var995) {
                                                                                    var2 |= -1467700248;
                                                                                    var2 ^= -1524642249;
                                                                                    int var996 = this.De;
                                                                                    var996++;
                                                                                    Integer var1078 = var3;
                                                                                    if (var1078 == null) {
                                                                                        switch (var2) {
                                                                                            case 1176920779:
                                                                                                var2 ^= -937578600;
                                                                                                break label971;
                                                                                            case 1503737294:
                                                                                                var2 *= 98284151;
                                                                                                var2 += -121669656;
                                                                                                var2 ^= 80314909;
                                                                                                break label971;
                                                                                            case 1753815276:
                                                                                            default:
                                                                                                var2 ^= -1522264247;
                                                                                                break label971;
                                                                                        }
                                                                                    }

                                                                                    var2 ^= -907191569;
                                                                                    var2 <<= 4;
                                                                                    var2 -= 789005615;
                                                                                    var2 &= 1297357417;
                                                                                    var2 ^= 907174699;
                                                                                    int var1079 = var2 + 1;
                                                                                    int var1080 = var2 * var1079;
                                                                                    int var1081 = var1080 & 1;
                                                                                    if (var1081 != 0) {
                                                                                        break label732;
                                                                                    }

                                                                                    this.De = var996;
                                                                                    var2 ^= 2094434283;
                                                                                    var2 ^= 67394326;
                                                                                    var2 |= 803722719;
                                                                                    var2 &= -1818789274;
                                                                                    var2 ^= 2108639533;
                                                                                } else {
                                                                                    var2 ^= -1865713474;
                                                                                    var2 -= -287291837;
                                                                                    var2 *= -328058031;
                                                                                    var2 ^= -700507097;
                                                                                }

                                                                                long var998 = var2;
                                                                                var1110 = var998 + 1L;
                                                                                var1110 = var998 * var1110;
                                                                                long var999 = var1110 & 1L;
                                                                                long var1232;
                                                                                int var1000 = (var1232 = var999 - 0L) == 0L ? 0 : (var1232 < 0L ? -1 : 1);
                                                                                if (var1000 != 0) {
                                                                                    break label732;
                                                                                }

                                                                                int var1001 = var852 + 1;
                                                                                int var1082 = var3 + 1;
                                                                                int var1083 = var3 * var1082;
                                                                                int var1084 = var1083 & 1;
                                                                                if (var1084 != 0) {
                                                                                    var2 *= 1746629917;
                                                                                    var2 ^= 2080099016;
                                                                                    break label971;
                                                                                }

                                                                                var2 ^= 631944983;
                                                                                var2 ^= -532965496;
                                                                                var2 ^= -679735316;
                                                                                var1056 = var2;
                                                                                var1153 = var1056 + 1L;
                                                                                var1153 = var1056 * var1153;
                                                                                var1181 = var1056 + 2L;
                                                                                var1153 *= var1181;
                                                                                var1056 += 3L;
                                                                                var1153 *= var1056;
                                                                                var1056 = var1153 & 7L;
                                                                                long var1233;
                                                                                int var1088 = (var1233 = var1056 - 0L) == 0L ? 0 : (var1233 < 0L ? -1 : 1);
                                                                                if (var1088 != 0) {
                                                                                    break label732;
                                                                                }

                                                                                var852 = var1001;
                                                                                var2 >>>= 9;
                                                                                var2 += -1567663563;
                                                                                var2 *= 1033899775;
                                                                                var2 += 585670898;
                                                                                var2 ^= 2025938278;
                                                                            }
                                                                        } else {
                                                                            var2 -= 1154582952;
                                                                            var2 |= 1199011904;
                                                                            var2 += -1157086597;
                                                                            var2 ^= -1990928449;
                                                                            var2 ^= 2093079359;
                                                                        }
                                                                    } else {
                                                                        var2 &= -1290450819;
                                                                        var2 &= 385594246;
                                                                        var2 ^= 1325642098;
                                                                    }

                                                                    int var583;
                                                                    if (var581 != null) {
                                                                        var2 ^= 1091382671;
                                                                        var2 -= 1232401016;
                                                                        var2 ^= 4976134;
                                                                        Integer var582 = var2;
                                                                        if (var582 == null) {
                                                                            break label732;
                                                                        }

                                                                        var583 = 1;
                                                                        var2 *= 1577743189;
                                                                        var2 ^= 1341609287;
                                                                        var2 |= 282241531;
                                                                        var2 &= -1881823364;
                                                                        var2 ^= 1329747022;
                                                                    } else {
                                                                        var2 = switch (var2) {
                                                                            default -> var2 ^ -226249246;
                                                                            case 1595060594 -> {
                                                                                var2 ^= -426834943;
                                                                                var2 ^= 1262237739;
                                                                                yield var2 ^ 767434171;
                                                                            }
                                                                            case 1721987975 -> var2 ^ 1439118492;
                                                                        };
                                                                        var583 = 0;
                                                                        var2 -= 1980859216;
                                                                        var2 <<= 23;
                                                                        var2 &= -1250717618;
                                                                        var2 += 164839172;
                                                                        var2 ^= 1296354866;
                                                                    }

                                                                    var6 = var2 + 1;
                                                                    var6 = var2 * var6;
                                                                    int var853 = var2 + 2;
                                                                    var6 *= var853;
                                                                    int var854 = var2 + 3;
                                                                    var6 *= var854;
                                                                    var6 &= 7;
                                                                    if (var6 == 0) {
                                                                        var6 = var2 | -762377683;
                                                                        var6 |= -1700734866;
                                                                        var6 ^= 340365794;
                                                                        int var629 = this.u(var1, var6) ? 1 : 0;
                                                                        Integer var855 = var3;
                                                                        if (var855 == null) {
                                                                            var2 *= -1124133231;
                                                                            var2 |= -1309421756;
                                                                            var2 ^= 2053962593;
                                                                            break label971;
                                                                        }

                                                                        var2 |= -1594206432;
                                                                        var2 ^= -331261999;
                                                                        var2 &= 896159706;
                                                                        var2 ^= -1461243987;
                                                                        Integer var856 = var2;
                                                                        label700:
                                                                        if (var856 != null) {
                                                                            if (var629 != 0) {
                                                                                var2 &= -1667479142;
                                                                                var2 += 1573092592;
                                                                                var2 ^= -637978370;
                                                                                var787 = var2;
                                                                                var1056 = var787 + 1L;
                                                                                var1056 = var787 * var1056;
                                                                                var787 = var1056 & 1L;
                                                                                long var1234;
                                                                                var629 = (var1234 = var787 - 0L) == 0L ? 0 : (var1234 < 0L ? -1 : 1);
                                                                                if (var629 != 0) {
                                                                                    break label700;
                                                                                }

                                                                                int var631 = (this.G ? 1 : 0);
                                                                                int var859 = var3 + 1;
                                                                                int var860 = var3 * var859;
                                                                                int var1002 = var3 + 2;
                                                                                int var861 = var860 * var1002;
                                                                                int var1003 = var3 + 3;
                                                                                int var862 = var861 * var1003;
                                                                                int var863 = var862 & 7;
                                                                                if (var863 != 0) {
                                                                                    switch (var2) {
                                                                                        case -856442742:
                                                                                        default:
                                                                                            var2 ^= -1111564330;
                                                                                            break label971;
                                                                                        case -235704896:
                                                                                            var2 ^= -485164476;
                                                                                            break label971;
                                                                                        case 1068940548:
                                                                                            var2 -= 811567979;
                                                                                            var2 |= -338526192;
                                                                                            var2 ^= 743212334;
                                                                                            break label971;
                                                                                    }
                                                                                }
                                                                                var2 = switch (var2) {
                                                                                    default -> var2 ^ -1315526951;
                                                                                    case 1068940548 -> {
                                                                                        var2 -= 815738220;
                                                                                        var2 &= 1039822049;
                                                                                        yield var2 ^ -1095340456;
                                                                                    }
                                                                                    case 1727091237 -> var2 ^ 1560035124;
                                                                                };
                                                                                var787 = var2;
                                                                                var1056 = var787 + 1L;
                                                                                var1056 = var787 * var1056;
                                                                                var1153 = var787 + 2L;
                                                                                var1056 *= var1153;
                                                                                var787 += 3L;
                                                                                var1056 *= var787;
                                                                                var787 = var1056 & 7L;
                                                                                long var1235;
                                                                                int var867 = (var1235 = var787 - 0L) == 0L ? 0 : (var1235 < 0L ? -1 : 1);
                                                                                if (var867 != 0) {
                                                                                    break label700;
                                                                                }

                                                                                if (var631 == 0) {
                                                                                    var2 = switch (var2) {
                                                                                        default -> var2 ^ 197882170;
                                                                                        case -1281072424 -> {
                                                                                            var2 |= -1282639064;
                                                                                            var2 -= 1639448431;
                                                                                            var2 += 569312927;
                                                                                            yield var2 ^ 956508670;
                                                                                        }
                                                                                        case -918052857 -> var2 ^ -1050261128;
                                                                                    };
                                                                                    Integer var632 = var2;
                                                                                    if (var632 == null) {
                                                                                        break label700;
                                                                                    }

                                                                                    float var633 = this.YU();
                                                                                    int var868 = var3 + 1;
                                                                                    int var869 = var3 * var868;
                                                                                    int var870 = var869 & 1;
                                                                                    if (var870 != 0) {
                                                                                        var2 ^= 651470085;
                                                                                        var2 >>>= 16;
                                                                                        var2 &= -1494570193;
                                                                                        var2 |= -440271376;
                                                                                        var2 ^= 643483971;
                                                                                        break label971;
                                                                                    }

                                                                                    var2 ^= -1750771978;
                                                                                    var2 *= 96893635;
                                                                                    var2 >>>= 2;
                                                                                    var2 >>= 21;
                                                                                    var2 ^= 1403786241;
                                                                                    int var871 = var2 + 1;
                                                                                    int var872 = var2 * var871;
                                                                                    int var873 = var872 & 1;
                                                                                    if (var873 != 0) {
                                                                                        break label700;
                                                                                    }

                                                                                    float var1236;
                                                                                    var631 = (var1236 = var633 - 1.0F) == 0.0F ? 0 : (var1236 < 0.0F ? -1 : 1);
                                                                                    if (var631 > 0) {
                                                                                        var2 = switch (var2) {
                                                                                            case -1808457406 -> var2 ^ 1357083015;
                                                                                            default -> var2 ^ -278107383;
                                                                                            case 1403786511 -> {
                                                                                                var2 ^= -465194996;
                                                                                                yield var2 ^ -868674816;
                                                                                            }
                                                                                        };
                                                                                        var632 = var2;
                                                                                        if (var632 == null) {
                                                                                            break label700;
                                                                                        }

                                                                                        Re var636 = this.j;
                                                                                        float var874 = this.aM();
                                                                                        var938 = this.YU();
                                                                                        var938 *= 0.5F;
                                                                                        float var875 = var874 + var938;
                                                                                        var636.v(var875);
                                                                                        Re var637 = this.ay;
                                                                                        var787 = var3;
                                                                                        var1056 = var787 + 1L;
                                                                                        var1056 = var787 * var1056;
                                                                                        var1153 = var787 + 2L;
                                                                                        var1056 *= var1153;
                                                                                        var787 += 3L;
                                                                                        var1056 *= var787;
                                                                                        var787 = var1056 & 7L;
                                                                                        long var1237;
                                                                                        int var879 = (var1237 = var787 - 0L) == 0L
                                                                                            ? 0
                                                                                            : (var1237 < 0L ? -1 : 1);
                                                                                        if (var879 != 0) {
                                                                                            var2 &= -2020870319;
                                                                                            var2 += 2057057576;
                                                                                            var2 <<= 31;
                                                                                            var2 += 968120325;
                                                                                            var2 ^= 2049928370;
                                                                                            break label971;
                                                                                        }

                                                                                        var2 |= 1911685886;
                                                                                        var2 += 1784084815;
                                                                                        var2 += 45169434;
                                                                                        var2 ^= -1058660356;
                                                                                        Integer var880 = var2;
                                                                                        if (var880 == null) {
                                                                                            break label700;
                                                                                        }

                                                                                        float var881 = this.eJ();
                                                                                        var938 = this.Bm();
                                                                                        var938 *= 0.5F;
                                                                                        float var882 = var881 + var938;
                                                                                        var637.v(var882);
                                                                                        this.O = false;
                                                                                        var2 |= 212744738;
                                                                                        var2 ^= 1041442423;
                                                                                    } else {
                                                                                        var2 *= -405584617;
                                                                                        var2 -= 466407917;
                                                                                        var2 ^= -1138834003;
                                                                                    }
                                                                                } else {
                                                                                    switch (var2) {
                                                                                        case -1698088844:
                                                                                            var2 ^= 982101245;
                                                                                            break;
                                                                                        case -1388164167:
                                                                                        default:
                                                                                            var2 ^= 399898038;
                                                                                            break;
                                                                                        case -1281072424:
                                                                                            var2 -= 1882148547;
                                                                                            var2 |= -837812558;
                                                                                            var2 -= -1749127209;
                                                                                            var2 ^= 627856929;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                switch (var2) {
                                                                                    case -1797243846:
                                                                                    default:
                                                                                        var2 ^= -2075241385;
                                                                                        break;
                                                                                    case -1446170769:
                                                                                        var2 >>= 3;
                                                                                        var2 |= -482578452;
                                                                                        var2 += -1475361319;
                                                                                        var2 ^= -1914671865;
                                                                                        break;
                                                                                    case -821552837:
                                                                                        var2 ^= -339743089;
                                                                                }
                                                                            }

                                                                            Integer var638 = var2;
                                                                            if (var638 != null) {
                                                                                this.G = (var629 != 0);
                                                                                float var639 = 1.0F;
                                                                                int var883 = var3 + 1;
                                                                                int var884 = var3 * var883;
                                                                                int var885 = var884 & 1;
                                                                                if (var885 != 0) {
                                                                                    switch (var2) {
                                                                                        case -1866224935:
                                                                                            var2 ^= 1316263407;
                                                                                            break label971;
                                                                                        case -1336026977:
                                                                                        default:
                                                                                            var2 ^= -758412535;
                                                                                            break label971;
                                                                                        case 313383105:
                                                                                            var2 >>= 7;
                                                                                            var2 -= 1832773235;
                                                                                            var2 ^= -506718747;
                                                                                            var2 *= -1130572161;
                                                                                            var2 ^= -43308526;
                                                                                            break label971;
                                                                                    }
                                                                                }

                                                                                var2 &= -584536793;
                                                                                var2 ^= 1669865216;
                                                                                int var886 = var2 + 1;
                                                                                int var887 = var2 * var886;
                                                                                int var1008 = var2 + 2;
                                                                                int var888 = var887 * var1008;
                                                                                int var1009 = var2 + 3;
                                                                                int var889 = var888 * var1009;
                                                                                int var890 = var889 & 7;
                                                                                label672:
                                                                                if (var890 == 0) {
                                                                                    boolean var1102;
                                                                                    if (var629 != 0) {
                                                                                        var2 *= -87635705;
                                                                                        var2 >>= 10;
                                                                                        var2 ^= 1665663956;
                                                                                        int var891 = var2 | -360376034;
                                                                                        int var892 = var891 + 1989520843;
                                                                                        int var893 = var892 ^ -2013973699;
                                                                                        boolean var894 = this.ov(var1, var893);
                                                                                        this.x = var894;
                                                                                        int var895 = (this.x) ? 1 : 0;
                                                                                        Integer var1010 = var3;
                                                                                        if (var1010 == null) {
                                                                                            switch (var2) {
                                                                                                case -1203246138:
                                                                                                    var2 ^= -1007649424;
                                                                                                    break label971;
                                                                                                case 1581957010:
                                                                                                default:
                                                                                                    var2 ^= -1161541896;
                                                                                                    break label971;
                                                                                                case 1665740206:
                                                                                                    var2 ^= -513726794;
                                                                                                    var2 ^= 1102266287;
                                                                                                    break label971;
                                                                                            }
                                                                                        }
                                                                                        var2 = switch (var2) {
                                                                                            case 1058995619 -> var2 ^ -1574777505;
                                                                                            default -> var2 ^ 1378000233;
                                                                                            case 1665740206 -> {
                                                                                                var2 -= -1765767048;
                                                                                                var2 ^= -1883168472;
                                                                                                var2 |= 1569108376;
                                                                                                yield var2 ^ -252135977;
                                                                                            }
                                                                                        };
                                                                                        Integer var1011 = var2;
                                                                                        if (var1011 == null) {
                                                                                            break label672;
                                                                                        }

                                                                                        boolean var896 = (var583 & var895) != 0;
                                                                                        boolean var1012 = this.x;
                                                                                        if (var1012) {
                                                                                            var2 += -1504848808;
                                                                                            var2 ^= 1170885948;
                                                                                            var2 ^= -841551819;
                                                                                            long var1013 = var2;
                                                                                            var1110 = var1013 + 1L;
                                                                                            var1110 = var1013 * var1110;
                                                                                            long var1014 = var1110 & 1L;
                                                                                            long var1238;
                                                                                            int var1015 = (var1238 = var1014 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1238 < 0L ? -1 : 1);
                                                                                            if (var1015 != 0) {
                                                                                                break label672;
                                                                                            }

                                                                                            LivingEntity var1016 = this.rv;
                                                                                            Integer var1099 = var3;
                                                                                            if (var1099 == null) {
                                                                                                switch (var2) {
                                                                                                    case -577214040:
                                                                                                        var2 += 198552836;
                                                                                                        var2 ^= 720708123;
                                                                                                        break label971;
                                                                                                    case 628046403:
                                                                                                        var2 ^= 1879167437;
                                                                                                        break label971;
                                                                                                    case 1505235038:
                                                                                                    default:
                                                                                                        var2 ^= -1448378001;
                                                                                                        break label971;
                                                                                                }
                                                                                            }

                                                                                            var2 -= -1998333591;
                                                                                            var2 ^= -467180048;
                                                                                            var2 |= 1770006154;
                                                                                            var2 ^= -1167020122;
                                                                                            if (var1016 != null) {
                                                                                                var2 -= 631772812;
                                                                                                var2 -= 1884392939;
                                                                                                var2 >>>= 23;
                                                                                                var2 ^= 1776165708;
                                                                                                Integer var1017 = var2;
                                                                                                if (var1017 == null) {
                                                                                                    break label672;
                                                                                                }

                                                                                                Ud var1018 = Ud.Z();
                                                                                                AuraPipeline var1019 = var1018.Ul();
                                                                                                Projection var1020 = var1019.projection();
                                                                                                float var1100 = var1.fV();
                                                                                                LivingEntity var1126 = this.rv;
                                                                                                double var1127 = var1126.lastX;
                                                                                                LivingEntity var1171 = this.rv;
                                                                                                double var1172 = var1171.getX();
                                                                                                double var15 = var1100;
                                                                                                Integer var17 = var3;
                                                                                                if (var17 == null) {
                                                                                                    var2 ^= 296170633;
                                                                                                    var2 -= 254799963;
                                                                                                    var2 ^= -1640428439;
                                                                                                    var2 &= -330155190;
                                                                                                    var2 ^= 667623101;
                                                                                                    break label971;
                                                                                                }

                                                                                                var2 += 392022296;
                                                                                                var2 ^= 1758356956;
                                                                                                double var1128 = TP.y(var1127, var1172, var15);
                                                                                                LivingEntity var1173 = this.rv;
                                                                                                double var1174 = var1173.lastY;
                                                                                                LivingEntity var1184 = this.rv;
                                                                                                var15 = var1184.getY();
                                                                                                double var1193 = var1100;
                                                                                                double var1175 = TP.y(var1174, var15, var1193);
                                                                                                LivingEntity var1186 = this.rv;
                                                                                                float var1187 = var1186.getHeight();
                                                                                                var15 = var1187;
                                                                                                var15 *= 0.5;
                                                                                                double var1176 = var1175 + var15;
                                                                                                LivingEntity var1190 = this.rv;
                                                                                                var15 = var1190.lastZ;
                                                                                                LivingEntity var1194 = this.rv;
                                                                                                double var1195 = var1194.getZ();
                                                                                                double var19 = var1100;
                                                                                                var15 = TP.y(var15, var1195, var19);
                                                                                                double var1196 = var1020.cameraX();
                                                                                                double var1101 = var1128 - var1196;
                                                                                                double var1197 = var1020.cameraY();
                                                                                                double var1168 = var1176 - var1197;
                                                                                                double var1198 = var1020.cameraZ();
                                                                                                double var1183 = var15 - var1198;
                                                                                                double var1021 = var1101 * var1101;
                                                                                                double var1129 = var1168 * var1168;
                                                                                                double var1022 = var1021 + var1129;
                                                                                                double var1130 = var1183 * var1183;
                                                                                                double var1023 = var1022 + var1130;
                                                                                                double var1024 = Math.sqrt(var1023);
                                                                                                double var1131 = 3.5;
                                                                                                double var1025 = Math.max(1.0, var1024);
                                                                                                double var1026 = var1131 / var1025;
                                                                                                double var1027 = Math.pow(var1026, 0.55);
                                                                                                Uq var1132 = this.P;
                                                                                                float var1133 = var1132.WM();
                                                                                                double var1134 = var1133;
                                                                                                double var1028 = var1134 * var1027;
                                                                                                var938 = (float)var1028;
                                                                                                var938 = TP.t(var938, 0.35F, 1.2F);
                                                                                                var1102 = var896;
                                                                                                var938 = var938;
                                                                                                var2 *= -476714351;
                                                                                                var2 >>= 30;
                                                                                                var2 -= -1652432555;
                                                                                                var2 -= -583793332;
                                                                                                var2 ^= 1612702390;
                                                                                            } else {
                                                                                                var2 += 462858782;
                                                                                                var2 |= -1419773752;
                                                                                                var2 ^= -1775880045;
                                                                                                var1102 = var896;
                                                                                                int var1135 = var3 + 1;
                                                                                                int var1136 = var3 * var1135;
                                                                                                int var1137 = var1136 & 1;
                                                                                                if (var1137 != 0) {
                                                                                                    var2 -= -1204657428;
                                                                                                    var2 |= 1635955213;
                                                                                                    var2 ^= 842845130;
                                                                                                    break label971;
                                                                                                }

                                                                                                var2 ^= 773391308;
                                                                                                var2 ^= -197976718;
                                                                                                int var1138 = var2 + 1;
                                                                                                int var1139 = var2 * var1138;
                                                                                                int var1140 = var1139 & 1;
                                                                                                if (var1140 != 0) {
                                                                                                    break label672;
                                                                                                }

                                                                                                var938 = var639;
                                                                                                var2 -= -716165407;
                                                                                                var2 -= -1121580863;
                                                                                                var2 += -1154794251;
                                                                                                var2 ^= 964499934;
                                                                                            }
                                                                                        } else {
                                                                                            var2 <<= 5;
                                                                                            var2 ^= 274586927;
                                                                                            var1110 = var2;
                                                                                            var1169 = var1110 + 1L;
                                                                                            var1169 = var1110 * var1169;
                                                                                            var1110 = var1169 & 1L;
                                                                                            long var1239;
                                                                                            int var1143 = (var1239 = var1110 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1239 < 0L ? -1 : 1);
                                                                                            if (var1143 != 0) {
                                                                                                break label672;
                                                                                            }

                                                                                            var1102 = var896;
                                                                                            var1110 = var3;
                                                                                            var1169 = var1110 + 1L;
                                                                                            var1169 = var1110 * var1169;
                                                                                            var1110 = var1169 & 1L;
                                                                                            long var1240;
                                                                                            int var897 = (var1240 = var1110 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1240 < 0L ? -1 : 1);
                                                                                            if (var897 != 0) {
                                                                                                var2 *= 1961323921;
                                                                                                var2 ^= 2042842056;
                                                                                                break label971;
                                                                                            }

                                                                                            var2 -= 1801939776;
                                                                                            var2 ^= -2006196229;
                                                                                            Integer var898 = var2;
                                                                                            if (var898 == null) {
                                                                                                break label672;
                                                                                            }

                                                                                            var938 = var639;
                                                                                            var2 -= -922640260;
                                                                                            var2 &= 1742367990;
                                                                                            var2 ^= 1204377404;
                                                                                            var2 += -1679930672;
                                                                                            var2 ^= -453352009;
                                                                                        }
                                                                                    } else {
                                                                                        var2 *= -2064709547;
                                                                                        var2 -= 303509782;
                                                                                        var2 |= -1406811400;
                                                                                        var2 -= -1201363095;
                                                                                        var2 ^= 1663123354;
                                                                                        var1102 = var583 != 0;
                                                                                        Integer var584 = var3;
                                                                                        if (var584 == null) {
                                                                                            var2 >>= 18;
                                                                                            var2 *= -212605481;
                                                                                            var2 ^= -1266160273;
                                                                                            break label971;
                                                                                        }

                                                                                        var2 *= -2033305701;
                                                                                        var2 ^= -225570217;
                                                                                        var2 *= -1456174057;
                                                                                        var2 &= 1526554970;
                                                                                        var2 ^= -1328123525;
                                                                                        var583 = var2 + 1;
                                                                                        int var586 = var2 * var583;
                                                                                        int var899 = var2 + 2;
                                                                                        var586 *= var899;
                                                                                        int var900 = var2 + 3;
                                                                                        var586 *= var900;
                                                                                        var586 &= 7;
                                                                                        if (var586 != 0) {
                                                                                            break label672;
                                                                                        }

                                                                                        var938 = var639;
                                                                                        var2 |= 1480650776;
                                                                                        var2 ^= 496891361;
                                                                                        var2 <<= 11;
                                                                                        var2 ^= 1567697899;
                                                                                    }

                                                                                    var583 = var2 + 1;
                                                                                    var583 = var2 * var583;
                                                                                    int var640 = var2 + 2;
                                                                                    var583 *= var640;
                                                                                    var640 = var2 + 3;
                                                                                    var583 *= var640;
                                                                                    var583 &= 7;
                                                                                    label611:
                                                                                    if (var583 == 0) {
                                                                                        Re var595 = this.Lu;
                                                                                        var640 = var3 + 1;
                                                                                        var640 = var3 * var640;
                                                                                        var3 = var640 & 1;
                                                                                        if (var3 != 0) {
                                                                                            switch (var2) {
                                                                                                case -1814106474:
                                                                                                    var2 ^= -712172565;
                                                                                                    break label971;
                                                                                                case -447349781:
                                                                                                    var2 *= -1540542737;
                                                                                                    var2 += 2112308806;
                                                                                                    var2 ^= 593200156;
                                                                                                    break label971;
                                                                                                case 1663672203:
                                                                                                default:
                                                                                                    var2 ^= -1408774909;
                                                                                                    break label971;
                                                                                            }
                                                                                        }

                                                                                        var2 *= 863532859;
                                                                                        var2 ^= 981970498;
                                                                                        float var577;
                                                                                        if (var629 != 0) {
                                                                                            var2 += 1657827391;
                                                                                            var2 &= 318544129;
                                                                                            var2 ^= -445665876;
                                                                                            Integer var576 = var2;
                                                                                            if (var576 == null) {
                                                                                                break label611;
                                                                                            }

                                                                                            var577 = var938;
                                                                                            var2 += -908514525;
                                                                                            var2 -= 716169933;
                                                                                            var2 ^= -834705610;
                                                                                        } else {
                                                                                            var2 *= 1324572517;
                                                                                            var2 ^= -1153055015;
                                                                                            var577 = 1.0F;
                                                                                            var2 -= -2045725901;
                                                                                            var2 ^= -686220356;
                                                                                            var2 ^= 705848883;
                                                                                        }

                                                                                        long var644 = var2;
                                                                                        var787 = var644 + 1L;
                                                                                        var787 = var644 * var787;
                                                                                        long var645 = var787 & 1L;
                                                                                        long var1241;
                                                                                        var640 = (var1241 = var645 - 0L) == 0L ? 0 : (var1241 < 0L ? -1 : 1);
                                                                                        if (var640 == 0) {
                                                                                            float var578 = var595.Gc(var577, var4);
                                                                                            return var1102;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                IllegalStateException var579 = new IllegalStateException();
                throw var579;
            }
        }

        AssertionError var574 = new AssertionError();
        throw var574;
    }

    private boolean u(lH_3 var1, int var2) {
        int var4 = System.identityHashCode(this);
        Integer var5 = var4;
        if (var5 == null) {
            int var37 = var2 * -2066402649;
            var37 *= 1624635805;
            var37 *= 727420203;
            var37 += 258833436;
            var37 ^= 410583090;
        } else {
            label54: {
                int var3 = var2 + -937561864;
                var3 ^= -618954616;
                int var44 = var3 + 1;
                var44 = var3 * var44;
                int var6 = var3 + 2;
                var44 *= var6;
                var6 = var3 + 3;
                var44 *= var6;
                var44 &= 7;
                if (var44 != 0) {
                    IllegalStateException var36 = new IllegalStateException();
                    throw var36;
                }

                r_2 var49 = this.LS;
                b_2 var54 = b_2.FOLLOW;
                boolean var50 = var49.TJ(var54);
                if (var50) {
                    var3 *= 1661413545;
                    var3 <<= 29;
                    var3 ^= -1778282789;
                    var3 ^= 1677892032;
                    var50 = var1.tl();
                    var6 = var4 + 1;
                    var6 = var4 * var6;
                    var4 = var6 & 1;
                    if (var4 != 0) {
                        var3 <<= 5;
                        var3 *= -669567551;
                        var3 ^= 754910339;
                        break label54;
                    }

                    var3 ^= 488887449;
                    var3 += 1817435880;
                    var3 -= -1345844143;
                    var3 ^= -188116970;
                    if (!var50) {
                        var3 *= 1007255949;
                        var3 ^= 798862360;
                        boolean var43 = true;
                        var3 >>= 29;
                        var3 *= -54313515;
                        var3 |= -1608395159;
                        var3 ^= 784785951;
                        return var43;
                    }

                    var3 >>= 20;
                    var3 &= 1859040456;
                    var3 += 304889802;
                    var3 ^= -1419508441;
                } else {
                    switch (var3) {
                        case -1401293079:
                            var3 ^= -389386554;
                            break;
                        case 725706972:
                        default:
                            var3 ^= 276804310;
                            break;
                        case 1326439197:
                            var3 ^= -1700692280;
                            var3 *= -1717534519;
                            var3 ^= 548685200;
                    }
                }

                boolean var57 = false;
                var3 |= -215788629;
                var3 <<= 21;
                var3 >>= 8;
                var3 >>= 8;
                var3 ^= -659593088;
                return var57;
            }
        }

        AssertionError var52 = new AssertionError();
        throw var52;
    }

    private boolean ov(lH_3 var1, int var2) {
        label95: {
            int var4 = System.identityHashCode(this);
            Ud var5 = Ud.Z();
            AuraPipeline var74 = var5.Ul();
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            int var44;
            if (var6 == 0) {
                var44 = var2 & -2087187303;
                var44 *= -2089203357;
                var44 += 1569733376;
                var44 >>>= 19;
                var44 ^= 1471589860;
                Projection var75 = var74.projection();
                int var89 = var75.isValid() ? 1 : 0;
                if (var89 == 0) {
                    var44 *= -2075200747;
                    var44 ^= -1148940431;
                    var89 = var44 + 1;
                    var89 = var44 * var89;
                    var89 &= 1;
                    if (var89 == 0) {
                        return false;
                    }
                    break label95;
                }

                var44 |= -355769387;
                var44 ^= 252352533;
                var44 *= 1644708839;
                var44 ^= 1887492885;
                var44 ^= 1475015068;
                float var90 = var1.fV();
                LivingEntity var7 = this.rv;
                double var110 = var7.lastX;
                LivingEntity var9 = this.rv;
                double var125 = var9.getX();
                double var11 = var90;
                double var111 = TP.y(var110, var125, var11);
                var9 = this.rv;
                double var127 = var9.lastZ;
                LivingEntity var134 = this.rv;
                var11 = var134.getZ();
                double var13 = var90;
                double var128 = TP.y(var127, var11, var13);
                LivingEntity var136 = this.rv;
                var11 = var136.lastY;
                int var141 = var4 + 1;
                int var142 = var4 * var141;
                int var143 = var142 & 1;
                if (var143 == 0) {
                    var44 += 2120554923;
                    var44 ^= -273598200;
                    var44 &= 1787402612;
                    var44 += 1176727896;
                    var44 ^= -1756493194;
                    int var144 = var44 + 1;
                    int var145 = var44 * var144;
                    int var14 = var44 + 2;
                    int var146 = var145 * var14;
                    var14 = var44 + 3;
                    int var147 = var146 * var14;
                    int var148 = var147 & 7;
                    if (var148 != 0) {
                        break label95;
                    }

                    LivingEntity var149 = this.rv;
                    var13 = var149.getY();
                    double var15 = var90;
                    var11 = TP.y(var11, var13, var15);
                    LivingEntity var91 = this.rv;
                    float var92 = var91.getHeight();
                    var13 = var92;
                    var13 *= 0.5;
                    var11 += var13;
                    float var93 = var1.w();
                    float var153 = var1.Bi();
                    float[] var155 = this.l;
                    boolean var76 = var75.project(var111, var11, var128, var93, var153, var155);
                    if (!var76) {
                        var44 &= -611366633;
                        var44 ^= 248071731;
                        long var84 = var44;
                        long var118 = var84 + 1L;
                        long var119 = var84 * var118;
                        long var85 = var119 & 1L;
                        long var156;
                        int var86 = (var156 = var85 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                        if (var86 == 0) {
                            this.O = true;
                            return false;
                        }
                        break label95;
                    }

                    var44 ^= 843088491;
                    var44 ^= 1303184398;
                    boolean var77 = this.O;
                    var89 = var4 + 1;
                    var89 = var4 * var89;
                    var89 &= 1;
                    label90:
                    if (var89 == 0) {
                        var44 ^= -896564378;
                        var44 ^= -1195127780;
                        long var97 = var44;
                        long var8 = var97 + 1L;
                        var8 = var97 * var8;
                        long var98 = var8 & 1L;
                        long var157;
                        var89 = (var157 = var98 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                        if (var89 != 0) {
                            break label95;
                        }

                        if (var77) {
                            var44 >>= 7;
                            var44 ^= -977639313;
                            Integer var78 = var44;
                            if (var78 == null) {
                                break label95;
                            }

                            Re var79 = this.j;
                            float[] var100 = this.l;
                            float var101 = var100[0];
                            var79.v(var101);
                            Re var80 = this.ay;
                            float[] var102 = this.l;
                            float var103 = var102[1];
                            Integer var112 = var4;
                            if (var112 == null) {
                                var44 &= -179749287;
                                var44 ^= -1560876960;
                                break label90;
                            }

                            var44 *= -248362597;
                            var44 ^= -708192206;
                            long var113 = var44;
                            long var129 = var113 + 1L;
                            long var130 = var113 * var129;
                            long var140 = var113 + 2L;
                            long var131 = var130 * var140;
                            long var114 = var113 + 3L;
                            long var132 = var131 * var114;
                            long var115 = var132 & 7L;
                            long var158;
                            int var116 = (var158 = var115 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                            if (var116 != 0) {
                                break label95;
                            }

                            var80.v(var103);
                            this.O = false;
                            switch (var44) {
                                case 161795238:
                                    var44 += -1978751446;
                                    var44 >>= 12;
                                    var44 <<= 4;
                                    var44 ^= -1121273521;
                                    break;
                                case 227845689:
                                default:
                                    var44 ^= -49834255;
                                    break;
                                case 1567433137:
                                    var44 ^= -924554000;
                            }
                        } else {
                            var44 += -1515375440;
                            var44 *= -1232480161;
                            var44 ^= 478909364;
                        }

                        Re var81 = this.j;
                        float[] var104 = this.l;
                        float var105 = var104[0];
                        float var117 = var1.l();
                        int var121 = var4 + 1;
                        int var122 = var4 * var121;
                        int var133 = var4 + 2;
                        int var123 = var122 * var133;
                        var4 += 3;
                        int var124 = var123 * var4;
                        var4 = var124 & 7;
                        if (var4 == 0) {
                            Integer var70 = switch (var44) {
                                case -1591531331 -> var44 ^ -1853546902;
                                case 1119423039 -> {
                                    var44 &= -254652816;
                                    yield var44 ^ -2015530389;
                                }
                                default -> var44 ^ -1661412015;
                            };
                            if (var70 != null) {
                                float var71 = var81.Gc(var105, var117);
                                Re var72 = this.ay;
                                float[] var82 = this.l;
                                float var83 = var82[1];
                                float var106 = var1.l();
                                float var73 = var72.Gc(var83, var106);
                                return true;
                            }
                            break label95;
                        }

                        var44 ^= 1449244695;
                        var44 ^= -2040038896;
                    } else {
                        var44 >>= 4;
                        var44 |= -1247296144;
                        var44 -= 989561593;
                        var44 *= -1085586245;
                        var44 ^= -2034471340;
                    }
                } else {
                    var44 |= -1535044504;
                    var44 *= -123622183;
                    var44 &= -1126954313;
                    var44 *= -645329115;
                    var44 ^= -1044464819;
                }
            } else {
                var44 = var2 - -850750535;
                var44 |= 780061560;
                var44 >>= 1;
                var44 ^= -1920979003;
            }

            Integer var65 = var44;
            if (var65 != null) {
                IllegalStateException var67 = new IllegalStateException();
                throw var67;
            }
        }

        UnsupportedOperationException var66 = new UnsupportedOperationException();
        throw var66;
    }

    @Override
    protected boolean cd(lH_3 var1, float var2, float var3, float[] var4) {
        int var5 = QL;
        var5 ^= -1098823158;
        int var6 = System.identityHashCode(this);
        int var7 = var5 ^ 951198733;
        var7 += -1791103607;
        var7 &= -1339649822;
        var7 ^= -336528643;
        int var68 = this.u(var1, var7) ? 1 : 0;
        long var8 = var6;
        long var10 = var8 + 1L;
        var10 = var8 * var10;
        long var12 = var8 + 2L;
        var10 *= var12;
        var8 += 3L;
        var10 *= var8;
        var8 = var10 & 7L;
        long var120;
        int var88 = (var120 = var8 - 0L) == 0L ? 0 : (var120 < 0L ? -1 : 1);
        if (var88 != 0) {
            switch (var5) {
                case -311768067:
                    var5 &= 2140104934;
                    var5 >>>= 10;
                    var5 *= 155424217;
                    var5 >>>= 5;
                    var5 ^= 1043274888;
                    break;
                case 512333470:
                default:
                    var5 ^= -1721593967;
                    break;
                case 877262549:
                    var5 ^= -1527053663;
            }
        } else {
            label79: {
                var5 -= -2076796364;
                var5 &= -617899838;
                var5 ^= -412851869;
                var8 = var5;
                var10 = var8 + 1L;
                var10 = var8 * var10;
                var12 = var8 + 2L;
                var10 *= var12;
                var8 += 3L;
                var10 *= var8;
                var8 = var10 & 7L;
                long var121;
                int var92 = (var121 = var8 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                label68:
                if (var92 == 0) {
                    if (var68 != 0) {
                        var5 *= -1420320143;
                        var5 ^= -1740918935;
                        long var69 = var5;
                        long var9 = var69 + 1L;
                        var9 = var69 * var9;
                        long var70 = var9 & 1L;
                        long var122;
                        var68 = (var122 = var70 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                        if (var68 != 0) {
                            break label68;
                        }

                        int var72 = (this.x ? 1 : 0);
                        int var93 = var6 + 1;
                        int var94 = var6 * var93;
                        int var108 = var6 + 2;
                        int var95 = var94 * var108;
                        int var109 = var6 + 3;
                        int var96 = var95 * var109;
                        int var97 = var96 & 7;
                        if (var97 != 0) {
                            var5 ^= 929643375;
                            var5 += -1380515077;
                            var5 ^= 1114494425;
                            var5 += -1199471185;
                            var5 ^= 55972462;
                            break label79;
                        }
                        var5 = switch (var5) {
                            case -1364172246 -> var5 ^ 345776837;
                            default -> var5 ^ 2116418680;
                            case 599777690 -> {
                                var5 &= -432213519;
                                var5 *= -192250733;
                                var5 *= 1688027727;
                                yield var5 ^ 303197430;
                            }
                        };
                        int var98 = var5 + 1;
                        int var99 = var5 * var98;
                        int var100 = var99 & 1;
                        if (var100 != 0) {
                            break label68;
                        }

                        if (var72 != 0) {
                            var5 ^= -1363146055;
                            var5 ^= 336444826;
                            var72 = var5 + 1;
                            var72 = var5 * var72;
                            int var101 = var5 + 2;
                            var72 *= var101;
                            int var102 = var5 + 3;
                            var72 *= var102;
                            var72 &= 7;
                            if (var72 == 0) {
                                Re var78 = this.j;
                                float var79 = var78.ey();
                                float var103 = var2 * 0.5F;
                                float var80 = var79 - var103;
                                float var104 = var1.w();
                                int var110 = var6 + 1;
                                int var111 = var6 * var110;
                                var6 = var111 & 1;
                                if (var6 != 0) {
                                    var5 |= -1714906390;
                                    var5 >>>= 24;
                                    var5 |= 836090245;
                                    var5 *= -316688445;
                                    var5 ^= 1821731211;
                                    break label79;
                                }

                                var5 ^= -868544382;
                                var5 += 823049061;
                                var5 ^= -1954744723;
                                Integer var52 = var5;
                                if (var52 != null) {
                                    float var53 = var104 - var2;
                                    float var54 = var53 - 2.0F;
                                    float var55 = Math.max(2.0F, var54);
                                    float var56 = TP.t(var80, 2.0F, var55);
                                    var4[0] = var56;
                                    Re var57 = this.ay;
                                    float var58 = var57.ey();
                                    float var81 = var3 * 0.5F;
                                    float var59 = var58 - var81;
                                    float var82 = var1.Bi();
                                    float var83 = var82 - var3;
                                    float var84 = var83 - 2.0F;
                                    float var85 = Math.max(2.0F, var84);
                                    float var60 = TP.t(var59, 2.0F, var85);
                                    var4[1] = var60;
                                    return true;
                                }
                            }
                            break label68;
                        }

                        var5 -= 1891864271;
                        var5 ^= -413959370;
                    } else {
                        var5 += 537176150;
                        var5 |= -1402273038;
                        var5 ^= -960782822;
                    }

                    long var61 = var5;
                    var8 = var61 + 1L;
                    var8 = var61 * var8;
                    long var62 = var8 & 1L;
                    long var123;
                    var6 = (var123 = var62 - 0L) == 0L ? 0 : (var123 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        return false;
                    }
                }

                UnsupportedOperationException var64 = new UnsupportedOperationException();
                throw var64;
            }
        }

        IllegalStateException var50 = new IllegalStateException();
        throw var50;
    }

    @Override
    protected float K(lH_3 var1) {
        label130: {
            int var2 = QL;
            var2 ^= 413045283;
            int var3 = System.identityHashCode(this);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var152;
            int var72 = (var152 = var4 - 0L) == 0L ? 0 : (var152 < 0L ? -1 : 1);
            if (var72 != 0) {
                var2 |= 521241120;
                var2 -= 832001723;
                var2 *= -1287231335;
                var2 ^= -16165787;
            } else {
                var2 = switch (var2) {
                    default -> var2 ^ 1976420695;
                    case 384815005 -> var2 ^ -1289370882;
                    case 1265963988 -> {
                        var2 += 612240078;
                        var2 += 1511654331;
                        var2 |= -21302021;
                        yield var2 ^ -1547495595;
                    }
                };
                Integer var73 = var2;
                if (var73 == null) {
                    break label130;
                }

                int var74 = var2 & -1343235774;
                int var75 = var74 ^ 316424492;
                int var76 = var75 - -407990497;
                int var77 = var76 | -674941749;
                int var78 = var77 ^ 875798354;
                boolean var79 = this.u(var1, var78);
                if (var79) {
                    var2 = switch (var2) {
                        case 262458403 -> var2 ^ 983338630;
                        default -> var2 ^ 2129812363;
                        case 1568465322 -> {
                            var2 -= 345916958;
                            var2 >>= 2;
                            var2 |= -1722530438;
                            var2 |= 1155050348;
                            yield var2 ^ 447745079;
                        }
                    };
                    Integer var80 = var2;
                    if (var80 == null) {
                        break label130;
                    }

                    Uq var81 = this.cm;
                    float var82 = var81.WM();
                    int var5 = var3 + 1;
                    var5 = var3 * var5;
                    var5 &= 1;
                    label125:
                    if (var5 == 0) {
                        var2 ^= 772088931;
                        var2 *= 1904185737;
                        var2 *= 1538818575;
                        var2 ^= 1439819371;
                        var2 ^= -547891050;
                        Integer var92 = var2;
                        if (var92 == null) {
                            break label130;
                        }

                        float var153;
                        int var93 = (var153 = var82 - 0.01F) == 0.0F ? 0 : (var153 < 0.0F ? -1 : 1);
                        float var84;
                        if (var93 > 0) {
                            var2 = switch (var2) {
                                default -> var2 ^ 2116066036;
                                case 1741419901 -> var2 ^ -994192229;
                                case 1878529616 -> {
                                    var2 *= 1711363743;
                                    var2 -= 1917140855;
                                    var2 >>= 1;
                                    var2 += 1703522370;
                                    yield var2 ^ -975352808;
                                }
                            };
                            Integer var94 = var2;
                            if (var94 == null) {
                                break label130;
                            }

                            float var83 = 1.2F / var82;
                            long var95 = var3;
                            long var7 = var95 + 1L;
                            var7 = var95 * var7;
                            long var96 = var7 & 1L;
                            long var154;
                            int var97 = (var154 = var96 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
                            if (var97 != 0) {
                                var2 *= -2052302149;
                                var2 >>>= 7;
                                var2 ^= -1244080066;
                                break label125;
                            }
                            var2 = switch (var2) {
                                case 866353389 -> var2 ^ 179341193;
                                case 1560552006 -> {
                                    var2 *= 2108358137;
                                    var2 *= -418151889;
                                    var2 += -1920861118;
                                    yield var2 ^ -1270034499;
                                }
                                default -> var2 ^ -999452464;
                            };
                            var97 = var2 + 1;
                            var97 = var2 * var97;
                            int var127 = var2 + 2;
                            var97 *= var127;
                            int var128 = var2 + 3;
                            var97 *= var128;
                            var97 &= 7;
                            if (var97 != 0) {
                                break label130;
                            }

                            var84 = var83;
                            var2 &= 307277095;
                            var2 *= 1977684825;
                            var2 *= 830018845;
                            var2 &= 1489350606;
                            var2 ^= 63159022;
                        } else {
                            var2 >>= 18;
                            var2 ^= -1880451581;
                            Integer var103 = var2;
                            if (var103 == null) {
                                break label130;
                            }

                            var84 = 1.2F;
                            var2 *= 413600489;
                            var2 ^= 634400303;
                        }

                        long var104 = var2;
                        long var134 = var104 + 1L;
                        var134 = var104 * var134;
                        long var9 = var104 + 2L;
                        var134 *= var9;
                        long var105 = var104 + 3L;
                        var134 *= var105;
                        long var106 = var134 & 7L;
                        long var155;
                        var93 = (var155 = var106 - 0L) == 0L ? 0 : (var155 < 0L ? -1 : 1);
                        if (var93 != 0) {
                            break label130;
                        }

                        long var108 = var3;
                        var134 = var108 + 1L;
                        var134 = var108 * var134;
                        var9 = var108 + 2L;
                        var134 *= var9;
                        long var109 = var108 + 3L;
                        var134 *= var109;
                        long var110 = var134 & 7L;
                        long var156;
                        var93 = (var156 = var110 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                        if (var93 == 0) {
                            Integer var112 = switch (var2) {
                                default -> var2 ^ 1353596201;
                                case 1131801901 -> var2 ^ 1427849297;
                                case 1539453802 -> {
                                    var2 ^= 1357515757;
                                    yield var2 ^ 302106311;
                                }
                            };
                            if (var112 != null) {
                                Re var113 = this.Lu;
                                float var114 = var113.ey();
                                return Math.min(var84, var114);
                            }
                            break label130;
                        }

                        switch (var2) {
                            case 576592727:
                                var2 ^= -1499702230;
                                break;
                            case 1539453802:
                                var2 <<= 9;
                                var2 ^= 807944052;
                                break;
                            case 1896699677:
                            default:
                                var2 ^= -1939644343;
                        }
                    } else {
                        switch (var2) {
                            case -984620088:
                                var2 -= -272364048;
                                var2 &= -1813610663;
                                var2 ^= 634175020;
                                break;
                            case -342774893:
                            default:
                                var2 ^= 566014716;
                                break;
                            case -61266594:
                                var2 ^= -297292191;
                        }
                    }
                } else {
                    var2 += -749378434;
                    var2 ^= 1785948643;
                    var4 = var2;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var8 = var4 + 2L;
                    var6 *= var8;
                    var4 += 3L;
                    var6 *= var4;
                    var4 = var6 & 7L;
                    long var157;
                    int var88 = (var157 = var4 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                    if (var88 != 0) {
                        break label130;
                    }

                    Re var89 = this.Lu;
                    long var115 = var3;
                    long var142 = var115 + 1L;
                    var142 = var115 * var142;
                    long var151 = var115 + 2L;
                    var142 *= var151;
                    var115 += 3L;
                    var142 *= var115;
                    var115 = var142 & 7L;
                    long var158;
                    var3 = (var158 = var115 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        long var62 = switch (var2) {
                            default -> var2 ^ 1835826147;
                            case 1140432093 -> var2 ^ -1439187059;
                            case 1520512971 -> {
                                var2 -= -1095486229;
                                var2 += 188514074;
                                var2 |= 1636300545;
                                var2 ^= -428177007;
                                yield var2 ^ 1082588067;
                            }
                        };
                        var115 = var62 + 1L;
                        var115 = var62 * var115;
                        var142 = var62 + 2L;
                        var115 *= var142;
                        long var63 = var62 + 3L;
                        var115 *= var63;
                        long var64 = var115 & 7L;
                        long var159;
                        var2 = (var159 = var64 - 0L) == 0L ? 0 : (var159 < 0L ? -1 : 1);
                        if (var2 == 0) {
                            return var89.ey();
                        }
                        break label130;
                    }

                    var2 += 616687334;
                    var2 ^= -886178363;
                }
            }

            long var118 = var2;
            long var146 = var118 + 1L;
            var146 = var118 * var146;
            var118 = var146 & 1L;
            long var160;
            var3 = (var160 = var118 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalStateException var69 = new IllegalStateException();
                throw var69;
            }
        }

        AssertionError var66 = new AssertionError();
        throw var66;
    }

    @Override
    protected void BO(hr var1, lH_3 var2) {
        label68: {
            int var3 = QL;
            var3 ^= 969896396;
            int var4 = System.identityHashCode(this);
            r_2 var5 = this.Z;
            Nb var6 = Nb.MODERN;
            long var7 = var4;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            var7 = var9 & 1L;
            long var85;
            int var77 = (var85 = var7 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
            if (var77 != 0) {
                var3 ^= -2026831830;
                var3 |= 1743438303;
                var3 &= 1684612557;
                var3 ^= -79984991;
            } else {
                var3 = switch (var3) {
                    default -> var3 ^ 1915828608;
                    case 29159387 -> var3 ^ -1796838059;
                    case 1780805691 -> {
                        var3 &= -1140785192;
                        var3 |= -880020290;
                        var3 ^= 1097639476;
                        var3 >>>= 6;
                        yield var3 ^ 1143551108;
                    }
                };
                Integer var78 = var3;
                if (var78 == null) {
                    break label68;
                }

                boolean var59 = var5.TJ(var6);
                if (!var59) {
                    var3 *= 1571008611;
                    var3 -= 1276535214;
                    var3 *= 1709499709;
                    var3 ^= 1484950126;
                    Integer var69 = var3;
                    if (var69 != null) {
                        var1.Ky(0.0F, 0.0F, 118.0F, 32.0F, 8.0F);
                        return;
                    }
                    break label68;
                }
                var3 = switch (var3) {
                    default -> var3 ^ -1641780519;
                    case 1182968270 -> {
                        var3 >>>= 16;
                        var3 -= 548656520;
                        yield var3 ^ -158362745;
                    }
                    case 1929902484 -> var3 ^ -1217137240;
                };
                var1.Ky(0.0F, 0.0F, 148.0F, 50.5F, 10.0F);
                int var60 = this.De;
                Integer var70 = var4;
                if (var70 == null) {
                    var3 ^= -83654476;
                    var3 &= -1162632983;
                    var3 |= -284082358;
                    var3 ^= 1623431335;
                } else {
                    var3 ^= 1602712967;
                    var3 -= -579469970;
                    var3 <<= 21;
                    var3 ^= -730076599;
                    if (var60 <= 0) {
                        var3 -= -291333119;
                        var3 += 109199282;
                        var3 &= 729674690;
                        var3 ^= -286306269;
                        return;
                    }

                    var3 |= 1453654530;
                    var3 += 904818930;
                    var3 ^= -1679857813;
                    int var61 = var3 * -718908415;
                    int var62 = var61 << 13;
                    int var63 = var62 & 2138665338;
                    int var64 = var63 >> 14;
                    int var65 = var64 ^ -1230830200;
                    float var66 = this.i(var65);
                    long var71 = var4;
                    long var8 = var71 + 1L;
                    var8 = var71 * var8;
                    long var72 = var8 & 1L;
                    long var86;
                    var4 = (var86 = var72 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        var3 = switch (var3) {
                            case -1238287274 -> {
                                var3 &= 1362758423;
                                var3 >>>= 27;
                                var3 <<= 8;
                                yield var3 ^ -1715627992;
                            }
                            default -> var3 ^ -531057747;
                            case 958367177 -> var3 ^ -970734300;
                        };
                        long var73 = var3;
                        var8 = var73 + 1L;
                        var8 = var73 * var8;
                        long var10 = var73 + 2L;
                        var8 *= var10;
                        long var74 = var73 + 3L;
                        var8 *= var74;
                        long var75 = var8 & 7L;
                        long var87;
                        var4 = (var87 = var75 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label68;
                        }

                        float var67 = 148.0F - var66;
                        float var68 = var67 * 0.5F;
                        var1.Ky(var68, 53.5F, var66, 19.0F, 7.0F);
                        var3 *= -606561429;
                        var3 |= -461827295;
                        var3 |= -1515192707;
                        var3 *= 1000460401;
                        var3 ^= -1397989556;
                        return;
                    }

                    var3 |= 2030427400;
                    var3 ^= 1617386034;
                }
            }

            Integer var55 = var3;
            if (var55 != null) {
                IllegalArgumentException var56 = new IllegalArgumentException();
                throw var56;
            }
        }

        IllegalArgumentException var53 = new IllegalArgumentException();
        throw var53;
    }

    @Override
    protected void G(Canvas var1, lH_3 var2) {
        label136: {
            int var3 = QL;
            var3 ^= -2059806632;
            int var4 = System.identityHashCode(this);
            LivingEntity var5 = this.rv;
            Integer var6 = var4;
            if (var6 != null) {
                var3 ^= -791836964;
                var3 >>>= 22;
                var3 += -1490853453;
                var3 >>= 9;
                var3 ^= 932548519;
                if (var5 == null) {
                    var3 |= 1775590977;
                    var3 ^= -1045367596;
                    return;
                }

                var3 ^= -1688010464;
                var3 -= -601337936;
                var3 ^= 394811355;
                Integer var99 = var3;
                if (var99 == null) {
                    break label136;
                }

                r_2 var100 = this.Z;
                var6 = var4;
                if (var6 == null) {
                    var3 >>>= 14;
                    var3 |= 31175532;
                    var3 &= -1468052127;
                    var3 &= 1894237265;
                    var3 ^= -1726305029;
                } else {
                    var3 = switch (var3) {
                        case -1295354654 -> var3 ^ 1842964712;
                        default -> var3 ^ 1912541990;
                        case 1635031132 -> {
                            var3 &= 1974834673;
                            var3 |= 1907143755;
                            var3 |= -1574155110;
                            var3 <<= 5;
                            yield var3 ^ -863610765;
                        }
                    };
                    Nb var113 = Nb.MODERN;
                    boolean var101 = var100.TJ(var113);
                    float var117;
                    if (var101) {
                        var3 |= -1384348251;
                        var3 ^= 922071547;
                        int var114 = var3 + 1;
                        var114 = var3 * var114;
                        var114 &= 1;
                        if (var114 != 0) {
                            break label136;
                        }

                        var117 = 148.0F;
                        var3 += 442237176;
                        var3 += -856791432;
                        var3 *= -1674445879;
                        var3 ^= -757273476;
                    } else {
                        var3 = switch (var3) {
                            case -1155939565 -> {
                                var3 &= 1688938184;
                                var3 += -1553478347;
                                var3 *= -2047812375;
                                yield var3 ^ -5914362;
                            }
                            case -972068810 -> var3 ^ 1038384872;
                            default -> var3 ^ -48369355;
                        };
                        int var7 = var3 + 1;
                        var7 = var3 * var7;
                        int var8 = var3 + 2;
                        var7 *= var8;
                        var8 = var3 + 3;
                        var7 *= var8;
                        var7 &= 7;
                        if (var7 != 0) {
                            break label136;
                        }

                        var117 = 118.0F;
                        var3 *= 1725613359;
                        var3 *= -1225825183;
                        var3 ^= 233280341;
                    }

                    Integer var131 = var4;
                    if (var131 != null) {
                        var3 |= -1156903012;
                        var3 ^= 2060889353;
                        var131 = var3;
                        if (var131 == null) {
                            break label136;
                        }

                        float var136;
                        if (var101) {
                            var3 &= -1863443655;
                            var3 -= -1276793923;
                            var3 -= 585902664;
                            var3 &= 990289363;
                            var3 ^= 1582004041;
                            int var133 = var3 + 1;
                            var133 = var3 * var133;
                            var133 &= 1;
                            if (var133 != 0) {
                                break label136;
                            }

                            var136 = 50.5F;
                            var3 += 1026067457;
                            var3 *= -1331347063;
                            var3 ^= -1790436330;
                        } else {
                            var3 = switch (var3) {
                                default -> var3 ^ -29298542;
                                case -973528331 -> {
                                    var3 |= 1613767939;
                                    yield var3 ^ 393635123;
                                }
                                case 1899409637 -> var3 ^ 1306088926;
                            };
                            long var143 = var3;
                            long var10 = var143 + 1L;
                            var10 = var143 * var10;
                            var143 = var10 & 1L;
                            long var157;
                            int var145 = (var157 = var143 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                            if (var145 != 0) {
                                break label136;
                            }

                            var136 = 32.0F;
                            switch (var3) {
                                case -958186225:
                                    var3 ^= -760010299;
                                    break;
                                case -225492284:
                                    var3 <<= 26;
                                    var3 >>>= 26;
                                    var3 ^= 402500744;
                                    break;
                                case 1711818916:
                                default:
                                    var3 ^= -512814357;
                            }
                        }

                        Integer var146 = var3;
                        if (var146 == null) {
                            break label136;
                        }

                        var1.save();
                        float var147 = this.L;
                        long var9 = var4;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var158;
                        int var152 = (var158 = var9 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                        if (var152 == 0) {
                            var3 = switch (var3) {
                                case 402500748 -> {
                                    var3 -= -302937877;
                                    var3 &= 988264368;
                                    var3 ^= -705067820;
                                    var3 >>>= 6;
                                    yield var3 ^ 2068008936;
                                }
                                case 468681103 -> var3 ^ -1557290751;
                                default -> var3 ^ 639575357;
                            };
                            float var148 = 0.018F * var147;
                            var148++;
                            float var118 = var117 * 0.5F;
                            float var137 = var136 * 0.5F;
                            var1.scale(var148, var118, var137);
                            float var119 = this.tP;
                            float var120 = 1.0F - var119;
                            float var138 = this.tP;
                            float var139 = 1.0F - var138;
                            float var121 = var120 * var139;
                            float var122 = 1.0F - var121;
                            var1.save();
                            float var140 = 0.75F * var122;
                            float var141 = 0.25F + var140;
                            var1.alpha(var141);
                            float var123 = 1.0F - var122;
                            float var124 = var123 * 5.0F;
                            var1.translate(var124, 0.0F);
                            if (var101) {
                                var3 = switch (var3) {
                                    default -> var3 ^ 1174828407;
                                    case 134463929 -> var3 ^ -169732704;
                                    case 2025634165 -> {
                                        var3 |= 2097069026;
                                        var3 *= 17100407;
                                        var3 >>>= 10;
                                        yield var3 ^ -1024521537;
                                    }
                                };
                                int var102 = var3 * 1060451093;
                                int var103 = var102 ^ 1058291219;
                                this.ep(var1, var2, var103);
                                var3 += -744893918;
                                var3 >>= 14;
                                var3 ^= 1058757701;
                            } else {
                                var3 &= -1891142524;
                                var3 ^= -1705988790;
                                Integer var104 = var3;
                                if (var104 == null) {
                                    break label136;
                                }

                                int var105 = var3 & 419487777;
                                int var106 = var105 - 1062238843;
                                int var107 = var106 ^ 1271410829;
                                int var108 = var107 ^ 284479418;
                                this.Dy(var1, var2, var108);
                                var3 &= 263792403;
                                var3 >>>= 22;
                                var3 *= 834369577;
                                var3 ^= 1295959234;
                            }

                            var1.restore();
                            float var109 = var2.l();
                            int var125 = var3 ^ -1127987049;
                            var125 ^= 1209541076;
                            this.rx(var1, var109, var125);
                            int var110 = var4 + 1;
                            int var111 = var4 * var110;
                            var4 = var111 & 1;
                            if (var4 == 0) {
                                var3 -= -1441138761;
                                var3 ^= -476613184;
                                var3 |= 2119902857;
                                var3 ^= 1759609390;
                                Integer var96 = var3;
                                if (var96 != null) {
                                    var1.restore();
                                    return;
                                }
                                break label136;
                            }

                            var3 *= -128724705;
                            var3 ^= 1235680525;
                        } else {
                            var3 += -1151333367;
                            var3 *= 144976737;
                            var3 >>>= 31;
                            var3 ^= -1722177350;
                        }
                    } else {
                        var3 += -1312062646;
                        var3 -= -1663447183;
                        var3 >>>= 11;
                        var3 += -2056034558;
                        var3 ^= 484393875;
                    }
                }
            } else {
                switch (var3) {
                    case -1921307607:
                        var3 ^= 173441499;
                        break;
                    case -803880347:
                    default:
                        var3 ^= -202002745;
                        break;
                    case -690857553:
                        var3 &= 435613249;
                        var3 ^= -1987321670;
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            var3 = var4 & 1;
            if (var3 == 0) {
                IllegalStateException var94 = new IllegalStateException();
                throw var94;
            }
        }

        UnsupportedOperationException var93 = new UnsupportedOperationException();
        throw var93;
    }

    @Override
    protected void IA(Sn var1, lH_3 var2) {
        label162: {
            int var3 = QL;
            var3 ^= -759601616;
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            int var6 = var4 + 2;
            var5 *= var6;
            var6 = var4 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 != 0) {
                var3 <<= 13;
                var3 <<= 25;
                var3 ^= 1868778707;
            } else {
                label167: {
                    var3 = switch (var3) {
                        case -2125273145 -> {
                            var3 >>>= 13;
                            var3 >>>= 3;
                            var3 -= 197654980;
                            yield var3 ^ 401510002;
                        }
                        default -> var3 ^ -567318367;
                        case 81478748 -> var3 ^ -1948958131;
                    };
                    Integer var102 = var3;
                    if (var102 == null) {
                        break label162;
                    }

                    int var103 = this.De;
                    if (var103 != 0) {
                        var3 >>= 5;
                        var3 ^= 658603269;
                        long var104 = var3;
                        long var7 = var104 + 1L;
                        var7 = var104 * var7;
                        long var9 = var104 + 2L;
                        var7 *= var9;
                        long var105 = var104 + 3L;
                        var7 *= var105;
                        long var106 = var7 & 7L;
                        long var197;
                        var103 = (var197 = var106 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                        if (var103 != 0) {
                            break label162;
                        }

                        r_2 var108 = this.Z;
                        long var123 = var4;
                        long var8 = var123 + 1L;
                        var8 = var123 * var8;
                        long var10 = var123 + 2L;
                        var8 *= var10;
                        long var124 = var123 + 3L;
                        var8 *= var124;
                        long var125 = var8 & 7L;
                        long var198;
                        var6 = (var198 = var125 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            switch (var3) {
                                case -1538435425:
                                    var3 ^= -1714463909;
                                    break label167;
                                case -664810166:
                                    var3 &= 879507498;
                                    var3 += 1737727267;
                                    var3 ^= 440806620;
                                    var3 ^= 49988898;
                                    break label167;
                                case -418257194:
                                default:
                                    var3 ^= -889374967;
                                    break label167;
                            }
                        }

                        var3 -= -319461538;
                        var3 ^= -1267511372;
                        Integer var127 = var3;
                        if (var127 == null) {
                            break label162;
                        }

                        Nb var128 = Nb.MODERN;
                        int var109 = (var108.TJ(var128)) ? 1 : 0;
                        if (var109 != 0) {
                            var3 += -2117390001;
                            var3 *= -636100073;
                            var3 -= 844419937;
                            var3 |= 1821487936;
                            var3 ^= 235449315;
                            var109 = var3 + 1;
                            var109 = var3 * var109;
                            var109 &= 1;
                            if (var109 != 0) {
                                break label162;
                            }

                            var109 = var3 | 1368449526;
                            var109 &= -1481295616;
                            var109 ^= 1594748621;
                            var109 ^= -901813660;
                            float var117 = this.i(var109);
                            float var118 = 148.0F - var117;
                            float var119 = var118 * 0.5F;
                            float var120 = var119 + 4.0F;
                            float var129 = 56.0F;
                            ItemStack[] var135 = this.Ou;
                            ItemStack[] var136 = var135;
                            int var140 = var135.length;
                            int var141 = var140;
                            int var142 = var4 + 1;
                            int var143 = var4 * var142;
                            int var150 = var4 + 2;
                            int var144 = var143 * var150;
                            int var151 = var4 + 3;
                            int var145 = var144 * var151;
                            int var146 = var145 & 7;
                            if (var146 == 0) {
                                var3 ^= 305798656;
                                var3 ^= 1093131736;
                                Integer var147 = var3;
                                if (var147 == null) {
                                    break label162;
                                }

                                byte var148 = 0;
                                float var121 = var120;
                                int var149 = var148;
                                var3 ^= 2140859746;
                                var3 -= 1712615059;
                                var3 += -1169484596;
                                var3 |= 1434229711;
                                var3 ^= -729329108;

                                while (true) {
                                    Integer var152 = var3;
                                    if (var152 == null) {
                                        break label162;
                                    }

                                    if (var149 >= var141) {
                                        var3 |= 2021100476;
                                        var3 ^= -607360377;
                                        return;
                                    }

                                    var3 -= -1083079548;
                                    var3 ^= -283735358;
                                    int var153 = var3 + 1;
                                    int var154 = var3 * var153;
                                    int var11 = var3 + 2;
                                    int var155 = var154 * var11;
                                    var11 = var3 + 3;
                                    int var156 = var155 * var11;
                                    int var157 = var156 & 7;
                                    if (var157 != 0) {
                                        break label162;
                                    }

                                    ItemStack var158 = var136[var149];
                                    var11 = var4 + 1;
                                    var11 = var4 * var11;
                                    int var12 = var4 + 2;
                                    var11 *= var12;
                                    var12 = var4 + 3;
                                    var11 *= var12;
                                    var11 &= 7;
                                    if (var11 != 0) {
                                        switch (var3) {
                                            case -1961767027:
                                                var3 >>= 10;
                                                var3 -= -1757904382;
                                                var3 ^= 130616994;
                                                break label167;
                                            case -1746549911:
                                            default:
                                                var3 ^= -2067220990;
                                                break label167;
                                            case 1971672094:
                                                var3 ^= -1865628429;
                                                break label167;
                                        }
                                    }

                                    var3 -= -1833400774;
                                    var3 ^= -3300728;
                                    Integer var168 = var3;
                                    if (var168 == null) {
                                        break label162;
                                    }

                                    boolean var169 = var158.isEmpty();
                                    float var171;
                                    if (var169) {
                                        var3 &= -1102016941;
                                        var3 ^= -526570771;
                                        var3 ^= 1374308510;
                                        var168 = var3;
                                        if (var168 == null) {
                                            break label162;
                                        }

                                        var171 = var121;
                                        switch (var3) {
                                            case -1217927136:
                                                var3 <<= 18;
                                                var3 += -1792822989;
                                                var3 ^= -1232178877;
                                                var3 ^= 1811060012;
                                                break;
                                            case 716210744:
                                                var3 ^= -1986656888;
                                                break;
                                            case 1002435584:
                                            default:
                                                var3 ^= -225325164;
                                        }
                                    } else {
                                        var3 = switch (var3) {
                                            default -> var3 ^ 1555130910;
                                            case 127200219 -> {
                                                var3 |= 2119046076;
                                                var3 &= 451548409;
                                                yield var3 ^ 2108465388;
                                            }
                                            case 556043771 -> var3 ^ 523312580;
                                        };
                                        long var173 = var3;
                                        long var14 = var173 + 1L;
                                        var14 = var173 * var14;
                                        long var16 = var173 + 2L;
                                        var14 *= var16;
                                        long var174 = var173 + 3L;
                                        var14 *= var174;
                                        long var175 = var14 & 7L;
                                        long var199;
                                        var12 = (var199 = var175 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                                        if (var12 != 0) {
                                            break label162;
                                        }

                                        float var177 = var121 + 2.0F;
                                        var1.wM(var158, var177, var129, 11.0F);
                                        float var159 = var121 + 15.0F;
                                        var12 = var4 + 1;
                                        var12 = var4 * var12;
                                        var12 &= 1;
                                        if (var12 != 0) {
                                            var3 >>>= 5;
                                            var3 += 1697569937;
                                            var3 ^= 118054594;
                                            break label167;
                                        }
                                        var3 = switch (var3) {
                                            case -1337059633 -> var3 ^ -1626057157;
                                            default -> var3 ^ 1939962850;
                                            case 1734782997 -> {
                                                var3 += -1862414094;
                                                var3 &= -1948468685;
                                                var3 >>>= 13;
                                                yield var3 ^ 951295150;
                                            }
                                        };
                                        var171 = var159;
                                        var3 -= -138004823;
                                        var3 -= -2100641248;
                                        var3 |= 654820500;
                                        var3 |= -1282544426;
                                        var3 ^= 1467005067;
                                    }

                                    long var181 = var3;
                                    long var190 = var181 + 1L;
                                    var190 = var181 * var190;
                                    long var182 = var190 & 1L;
                                    long var200;
                                    int var160 = (var200 = var182 - 0L) == 0L ? 0 : (var200 < 0L ? -1 : 1);
                                    if (var160 != 0) {
                                        break label162;
                                    }

                                    int var161 = var149 + 1;
                                    long var183 = var4;
                                    var190 = var183 + 1L;
                                    var190 = var183 * var190;
                                    long var196 = var183 + 2L;
                                    var190 *= var196;
                                    long var184 = var183 + 3L;
                                    var190 *= var184;
                                    long var185 = var190 & 7L;
                                    long var201;
                                    var12 = (var201 = var185 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                                    if (var12 != 0) {
                                        var3 &= -690394487;
                                        var3 -= 599346345;
                                        var3 |= -1158519410;
                                        var3 |= 2074336510;
                                        var3 ^= -1868778708;
                                        break label167;
                                    }

                                    var3 *= -397369333;
                                    var3 *= 361662787;
                                    var3 += -1072739286;
                                    var3 ^= 1057532052;
                                    var3 ^= -1635004380;
                                    var121 = var171;
                                    var149 = var161;
                                    var3 |= 1602529983;
                                    var3 ^= 1560160108;
                                }
                            } else {
                                var3 -= 1298789731;
                                var3 ^= 1225402995;
                                break label167;
                            }
                        }

                        var3 *= -603093553;
                        var3 *= -1475551463;
                        var3 |= 1224678004;
                        var3 -= 1730404092;
                        var3 ^= 2058797526;
                    } else {
                        var3 -= 21386577;
                        var3 ^= -1629320835;
                    }

                    var4 = var3 + 1;
                    var4 = var3 * var4;
                    var3 = var4 & 1;
                    if (var3 == 0) {
                        return;
                    }
                    break label162;
                }
            }

            long var94 = var3;
            long var130 = var94 + 1L;
            long var131 = var94 * var130;
            long var95 = var131 & 1L;
            long var202;
            var4 = (var202 = var95 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalStateException var97 = new IllegalStateException();
                throw var97;
            }
        }

        UnsupportedOperationException var91 = new UnsupportedOperationException();
        throw var91;
    }

    private float i(int var1) {
        int var3 = System.identityHashCode(this);
        int var4 = this.De;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var3 = var5 & 1;
        if (var3 != 0) {
            Integer var20 = switch (var1) {
                default -> var1 ^ 245373818;
                case -1230783063 -> {
                    int var6 = var1 + 1159182873;
                    var6 ^= 1919856230;
                    var6 >>>= 3;
                    var6 += 296382647;
                    yield var6 ^ 1779098479;
                }
                case -1178901517 -> var1 ^ 1285202700;
            };
            if (var20 != null) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            Integer var15 = switch (var1) {
                case -1230783063 -> {
                    int var11 = var1 ^ 1450605675;
                    var11 *= 487212081;
                    var11 |= 1374196969;
                    var11 |= -1097706033;
                    yield var11 ^ 268475657;
                }
                case 33517905 -> var1 ^ -130314712;
                default -> var1 ^ -1341347111;
            };
            if (var15 != null) {
                float var17 = var4;
                float var18 = var17 * 15.0F;
                return var18 + 8.0F;
            }
        }

        RuntimeException var16 = new RuntimeException();
        throw var16;
    }

    private void ep(Canvas var1, lH_3 var2, int var3) {
        label183: {
            int var5 = System.identityHashCode(this);
            int var6 = var3 << 15;
            var6 ^= 432166450;
            this.k(var1, 6.0F, 6.0F, 30.0F, 6.5F, var6);
            float var148 = 43.0F;
            String var7 = this.Om;
            Integer var8 = var5;
            if (var8 == null) {
                int var4 = var3 - 1835662083;
                var4 += 387748080;
                var4 |= -521195291;
                var4 ^= 1113041637;
            } else {
                int var20 = var3 >>> 31;
                var20 |= -1225522196;
                var20 ^= -2126757279;
                var20 ^= 1967272425;
                long var171 = var20;
                long var10 = var171 + 1L;
                var10 = var171 * var10;
                long var12 = var171 + 2L;
                var10 *= var12;
                long var172 = var171 + 3L;
                var10 *= var172;
                long var173 = var10 & 7L;
                long var245;
                int var174 = (var245 = var173 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                if (var174 != 0) {
                    break label183;
                }

                boolean var158 = var7.equals("Player");
                float var175 = 10.0F;
                String var9 = this.Om;
                TextStyle var206 = this.ve;
                float var191 = var1.measure(var9, var206);
                float var212;
                if (var158) {
                    var20 = switch (var20) {
                        default -> var20 ^ -184067958;
                        case 1116368997 -> {
                            var20 &= 1056622941;
                            var20 >>= 7;
                            var20 ^= -1053389070;
                            yield var20 ^ -1442929327;
                        }
                        case 1771661063 -> var20 ^ 49667414;
                    };
                    int var207 = var20 + 1;
                    int var208 = var20 * var207;
                    int var11 = var20 + 2;
                    int var209 = var208 * var11;
                    var11 = var20 + 3;
                    int var210 = var209 * var11;
                    int var211 = var210 & 7;
                    if (var211 != 0) {
                        break label183;
                    }

                    var212 = 14.0F;
                    var20 -= 472212281;
                    var20 ^= -181673425;
                    var20 += 142525974;
                    var20 ^= 1287859684;
                } else {
                    var20 = switch (var20) {
                        case 724987864 -> var20 ^ 436775001;
                        case 1116368997 -> {
                            var20 >>= 13;
                            yield var20 ^ 1290075795;
                        }
                        default -> var20 ^ -398733212;
                    };
                    Integer var215 = var20;
                    if (var215 == null) {
                        break label183;
                    }

                    var212 = 8.0F;
                    var20 ^= 400753357;
                    var20 *= -1890574675;
                    var20 &= 444424566;
                    var20 ^= -1795911041;
                }

                long var216 = var20;
                long var13 = var216 + 1L;
                var13 = var216 * var13;
                long var15 = var216 + 2L;
                var13 *= var15;
                var216 += 3L;
                var13 *= var216;
                var216 = var13 & 7L;
                long var246;
                int var219 = (var246 = var216 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                if (var219 != 0) {
                    break label183;
                }

                float var192 = var191 + var212;
                float var213 = 142.0F - var192;
                float var220 = 7.0F;
                Oo var226 = this.Gf;
                Integer var240 = var5;
                if (var240 == null) {
                    var20 += -109815179;
                    var20 += 1210561200;
                    var20 ^= 1842202980;
                } else {
                    label188: {
                        var20 &= 1631455623;
                        var20 &= 831842069;
                        var20 ^= 604884639;
                        kN.MB(var1, var226, var213, var220, var192, var175);
                        if (var158) {
                            var20 &= 837258216;
                            var20 *= 935936955;
                            var20 <<= 8;
                            var20 ^= 1207019812;
                            var20 ^= -1634070713;
                            float var193 = var213 + 6.3F;
                            float var227 = var175 * 0.5F;
                            Integer var241 = var5;
                            if (var241 == null) {
                                var20 >>= 30;
                                var20 += -1792410668;
                                var20 -= 1047015433;
                                var20 ^= -345383478;
                                break label188;
                            }
                            var20 = switch (var20) {
                                default -> var20 ^ -778145137;
                                case -861733277 -> {
                                    var20 += -832512792;
                                    var20 &= -709364088;
                                    yield var20 ^ -371709874;
                                }
                                case 1116164791 -> var20 ^ -1042867403;
                            };
                            float var228 = var220 + var227;
                            Oo var242 = this.Gf;
                            int var243 = var242.Hb();
                            kN.GV(var1, var193, var228, 6.4F, var243);
                            var20 *= -1121165375;
                            var20 ^= 2077241828;
                        } else {
                            switch (var20) {
                                case 604884634:
                                    var20 ^= 1351860373;
                                    var20 += 1165748805;
                                    var20 |= -1456200794;
                                    var20 ^= -1320000812;
                                    break;
                                case 669882264:
                                    var20 ^= 1575383394;
                                    break;
                                case 952581676:
                                default:
                                    var20 ^= -1128160791;
                            }
                        }

                        Integer var194 = var20;
                        if (var194 == null) {
                            break label183;
                        }

                        var9 = this.Om;
                        Integer var229 = var5;
                        if (var229 != null) {
                            var20 = switch (var20) {
                                case -1098590207 -> var20 ^ 1640682491;
                                case 175085858 -> {
                                    var20 <<= 3;
                                    var20 += 1730753733;
                                    var20 += 1265591698;
                                    var20 ^= 807526469;
                                    yield var20 ^ -1817063094;
                                }
                                default -> var20 ^ -549298971;
                            };
                            int var230 = var20 + 1;
                            int var231 = var20 * var230;
                            int var232 = var231 & 1;
                            if (var232 != 0) {
                                break label183;
                            }

                            float var159;
                            if (var158) {
                                var20 ^= 1759561633;
                                var20 += 2126910405;
                                var20 ^= 1605843377;
                                var159 = 10.8F;
                                switch (var20) {
                                    case 329027647:
                                        var20 *= -588749819;
                                        var20 -= 229618441;
                                        var20 ^= -947171645;
                                        var20 ^= 1119181981;
                                        break;
                                    case 1306101946:
                                    default:
                                        var20 ^= 836688335;
                                        break;
                                    case 1613726797:
                                        var20 ^= 1938809295;
                                }
                            } else {
                                var20 &= 375046452;
                                var20 -= -1750897862;
                                var20 ^= 416936732;
                                var20 |= 521927441;
                                var20 ^= -1132806556;
                                Integer var233 = var20;
                                if (var233 == null) {
                                    break label183;
                                }

                                var159 = 4.0F;
                                var20 ^= 1223540172;
                                var20 |= -1618335055;
                                var20 *= -1215058311;
                                var20 ^= 544539319;
                            }

                            float var160 = var213 + var159;
                            TextStyle var234 = hA;
                            float var235 = var234.size();
                            float var176 = var175 - var235;
                            float var177 = var176 * 0.5F;
                            Integer var236 = var5;
                            if (var236 == null) {
                                var20 ^= 1403080193;
                                var20 |= -1628567662;
                                var20 <<= 16;
                                var20 ^= 1515656704;
                            } else {
                                label206: {
                                    var20 = switch (var20) {
                                        case -1116514666 -> var20 ^ -2005065520;
                                        case -588142484 -> {
                                            var20 -= 991836501;
                                            var20 <<= 12;
                                            yield var20 ^ -1193844023;
                                        }
                                        default -> var20 ^ -333560892;
                                    };
                                    float var178 = var220 + var177;
                                    TextStyle var221 = this.ve;
                                    float var161 = var1.text(var9, var160, var178, var221);
                                    var1.save();
                                    float var162 = var213 - 4.0F;
                                    float var163 = var162 - var148;
                                    var1.clip(var148, 0.0F, var163, 50.5F, 0.0F);
                                    var7 = this.q;
                                    TextStyle var179 = this.wt;
                                    float var165 = var1.text(var7, var148, 9.0F, var179);
                                    var1.restore();
                                    float var166 = 22.0F;
                                    TextStyle var180 = this.Im;
                                    float var181 = var1.text("HP", var148, var166, var180);
                                    float var149 = var148 + var181;
                                    TextStyle var182 = this.Im;
                                    float var183 = var1.text(" / ", var149, var166, var182);
                                    float var184 = var149 + var183;
                                    StringBuilder var185 = this.rm;
                                    TextStyle var196 = this.MF;
                                    float var186 = var1.text(var185, var184, var166, var196);
                                    float var187 = var184 + var186;
                                    StringBuilder var188 = this.qc;
                                    var174 = var188.length();
                                    if (var174 > 0) {
                                        var20 = switch (var20) {
                                            case -1910107447 -> {
                                                var20 += -320660323;
                                                var20 ^= 676584417;
                                                yield var20 ^ -1684911531;
                                            }
                                            default -> var20 ^ 1606440525;
                                            case 193451102 -> var20 ^ -602051855;
                                        };
                                        StringBuilder var190 = this.qc;
                                        float var152 = var187 + 3.0F;
                                        Integer var197 = var5;
                                        if (var197 == null) {
                                            switch (var20) {
                                                case -1642352472:
                                                default:
                                                    var20 ^= 373511562;
                                                    break label206;
                                                case -926368046:
                                                    var20 &= 836379141;
                                                    var20 ^= -1117768704;
                                                    break label206;
                                                case -614819484:
                                                    var20 ^= -554659725;
                                                    break label206;
                                            }
                                        }

                                        var20 ^= -1403760037;
                                        var20 ^= -539672489;
                                        var20 |= 797520913;
                                        var20 &= 1604139552;
                                        var20 ^= 6575516;
                                        long var198 = var20;
                                        var216 = var198 + 1L;
                                        var216 = var198 * var216;
                                        var13 = var198 + 2L;
                                        var216 *= var13;
                                        long var199 = var198 + 3L;
                                        var216 *= var199;
                                        long var200 = var216 & 7L;
                                        long var247;
                                        int var201 = (var247 = var200 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                                        if (var201 != 0) {
                                            break label183;
                                        }

                                        TextStyle var202 = Kz;
                                        float var153 = var1.text(var190, var152, var166, var202);
                                        var20 += -1767785143;
                                        var20 += -1947062240;
                                        var20 += -113922757;
                                        var20 >>>= 19;
                                        var20 ^= -1528486420;
                                    } else {
                                        var20 -= -2036242412;
                                        var20 *= 590922417;
                                        var20 *= 970398059;
                                        var20 &= 42290182;
                                        var20 ^= -1494997348;
                                    }

                                    Integer var154 = var20;
                                    if (var154 == null) {
                                        break label183;
                                    }

                                    int var155 = var20 & -1462571791;
                                    var155 >>>= 2;
                                    var155 ^= -2134655332;
                                    this.sh(var1, 6.0F, 41.0F, 136.0F, 3.4F, var2, var155);
                                    Integer var134 = var5;
                                    if (var134 != null) {
                                        var20 += 1965122154;
                                        var20 ^= -2035419487;
                                        var20 ^= 248944942;
                                        var134 = var20;
                                        if (var134 != null) {
                                            int var136 = this.De;
                                            if (var136 > 0) {
                                                var20 *= -587153739;
                                                var20 &= 578386559;
                                                var20 ^= -2091638945;
                                                var20 ^= -102692094;
                                                long var137 = var20;
                                                long var167 = var137 + 1L;
                                                long var168 = var137 * var167;
                                                long var138 = var168 & 1L;
                                                long var248;
                                                var136 = (var248 = var138 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                                                if (var136 != 0) {
                                                    break label183;
                                                }

                                                var136 = var20 << 4;
                                                var136 *= -3719971;
                                                var136 >>>= 21;
                                                var136 ^= 847519467;
                                                this.uI(var1, var136);
                                                var20 ^= 109590416;
                                                var20 -= -1574767387;
                                                var20 >>>= 29;
                                                var20 |= 768292014;
                                                var20 ^= -1200079547;
                                            } else {
                                                switch (var20) {
                                                    case -2038627171:
                                                    default:
                                                        var20 ^= 472076134;
                                                        break;
                                                    case -1837241717:
                                                        var20 <<= 14;
                                                        var20 |= 1932693702;
                                                        var20 ^= -301868755;
                                                        break;
                                                    case 601398612:
                                                        var20 ^= -1228628833;
                                                }
                                            }

                                            long var144 = var20;
                                            long var169 = var144 + 1L;
                                            long var170 = var144 * var169;
                                            long var145 = var170 & 1L;
                                            long var249;
                                            var136 = (var249 = var145 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                                            if (var136 == 0) {
                                                return;
                                            }
                                        }
                                        break label183;
                                    }

                                    switch (var20) {
                                        case -1528487270:
                                            var20 >>= 28;
                                            var20 ^= 79267605;
                                            var20 *= -1982815285;
                                            var20 |= 392854074;
                                            var20 ^= -489526081;
                                            break;
                                        case -104221878:
                                        default:
                                            var20 ^= -818001372;
                                            break;
                                        case 1881066856:
                                            var20 ^= 958246025;
                                    }
                                }
                            }
                        } else {
                            var20 += -409681806;
                            var20 ^= -954768634;
                            var20 ^= -2000999278;
                        }
                    }
                }
            }

            AssertionError var132 = new AssertionError();
            throw var132;
        }

        RuntimeException var133 = new RuntimeException();
        throw var133;
    }

    private void Dy(Canvas var1, lH_3 var2, int var3) {
        int var5 = System.identityHashCode(this);
        int var6 = var3 >>> 13;
        var6 >>>= 14;
        var6 <<= 19;
        var6 *= -623817759;
        var6 ^= -1388947918;
        this.k(var1, 5.0F, 5.0F, 22.0F, 5.5F, var6);
        float var37 = 33.0F;
        float var7 = 112.0F;
        Integer var24 = var5;
        if (var24 != null) {
            int var19 = var3 ^ -2070139906;
            var19 += 875687867;
            var19 *= -119498873;
            var19 += -1730232265;
            var19 ^= 325184622;
            StringBuilder var25 = this.rm;
            TextStyle var47 = this.MF;
            float var26 = var1.measure(var25, var47);
            StringBuilder var48 = this.rm;
            float var9 = var7 - var26;
            TextStyle var10 = this.MF;
            float var49 = var1.text(var48, var9, 7.5F, var10);
            var1.save();
            float var27 = var7 - var26;
            float var28 = var27 - 4.0F;
            float var29 = var28 - var37;
            var1.clip(var37, 0.0F, var29, 32.0F, 0.0F);
            String var30 = this.q;
            var47 = this.jY;
            float var31 = var1.text(var30, var37, 6.5F, var47);
            var1.restore();
            float var32 = var7 - var37;
            int var42 = var19 | 247499683;
            int var43 = var42 + -1270622596;
            int var44 = var43 ^ -472036470;
            int var45 = var44 >>> 15;
            int var46 = var45 ^ -1460406429;
            this.sh(var1, var37, 21.5F, var32, 2.6F, var2, var46);
        } else {
            int var4 = var3 & 967850734;
            var4 *= 53812711;
            var4 ^= 1782931420;
            long var13 = var4;
            long var38 = var13 + 1L;
            long var39 = var13 * var38;
            long var8 = var13 + 2L;
            long var40 = var39 * var8;
            long var14 = var13 + 3L;
            long var41 = var40 * var14;
            long var15 = var41 & 7L;
            long var51;
            var4 = (var51 = var15 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            } else {
                IllegalStateException var17 = new IllegalStateException();
                throw var17;
            }
        }
    }

    private void k(Canvas var1, float var2, float var3, float var4, float var5, int var6) {
        label206: {
            int var8 = System.identityHashCode(this);
            float var9 = this.rD;
            Integer var10 = var8;
            if (var10 == null) {
                int var7 = var6 ^ 124865157;
                var7 ^= 1436088585;
            } else {
                label225: {
                    int var17 = switch (var6) {
                        case -666046214 -> var6 ^ 1960482419;
                        case -490842574 -> {
                            int var18 = var6 & -295814115;
                            var18 += -340880244;
                            yield var18 ^ 25046212;
                        }
                        default -> var6 ^ 1728979212;
                    };
                    var10 = var17;
                    if (var10 == null) {
                        break label206;
                    }

                    var9 *= (float) Math.PI;
                    double var147 = var9;
                    double var148 = Math.sin(var147);
                    var9 = (float)var148;
                    var9 = 0.08F * var9;
                    var9 = 1.0F - var9;
                    var1.save();
                    float var193 = var4 * 0.5F;
                    float var194 = var2 + var193;
                    float var11 = var4 * 0.5F;
                    var11 = var3 + var11;
                    var1.scale(var9, var194, var11);
                    var9 = this.rD;
                    float var307;
                    int var153 = (var307 = var9 - 0.0F) == 0.0F ? 0 : (var307 < 0.0F ? -1 : 1);
                    if (var153 > 0) {
                        var17 += 1866645816;
                        var17 >>>= 27;
                        var17 *= 966032703;
                        var17 ^= 1179416060;
                        int var154 = var17 + 1;
                        int var155 = var17 * var154;
                        int var195 = var17 + 2;
                        int var156 = var155 * var195;
                        var195 = var17 + 3;
                        int var157 = var156 * var195;
                        int var158 = var157 & 7;
                        if (var158 != 0) {
                            break label206;
                        }

                        var9 = this.rD;
                        var9 = 0.55F * var9;
                        long var197 = var8;
                        long var12 = var197 + 1L;
                        var12 = var197 * var12;
                        long var14 = var197 + 2L;
                        var12 *= var14;
                        long var198 = var197 + 3L;
                        var12 *= var198;
                        long var199 = var12 & 7L;
                        long var308;
                        var195 = (var308 = var199 - 0L) == 0L ? 0 : (var308 < 0L ? -1 : 1);
                        if (var195 != 0) {
                            var17 *= -1059593151;
                            var17 &= 1357743117;
                            var17 ^= -264609349;
                            break label225;
                        }
                        var17 = switch (var17) {
                            default -> var17 ^ 164838125;
                            case -1673107646 -> var17 ^ -1033531584;
                            case -717022907 -> {
                                var17 >>= 9;
                                var17 *= 1174139193;
                                yield var17 ^ 1393461461;
                            }
                        };
                        Integer var201 = var17;
                        if (var201 == null) {
                            break label206;
                        }

                        int var161 = DP.Y(-50354, var9);
                        var1.shadow(var2, var3, var4, var4, var5, 10.0F, var161);
                        var17 += -1100790285;
                        var17 ^= -265558354;
                    } else {
                        switch (var17) {
                            case -1785607114:
                                var17 ^= 1586434174;
                                break;
                            case -1317322189:
                            default:
                                var17 ^= 1165844738;
                                break;
                            case -860715944:
                                var17 &= -862047416;
                                var17 -= -1863145585;
                                var17 += 1732539413;
                                var17 ^= -688536650;
                                var17 ^= -389645510;
                        }
                    }

                    int var162 = var17 + 1;
                    int var163 = var17 * var162;
                    int var164 = var163 & 1;
                    if (var164 != 0) {
                        break label206;
                    }

                    int var165 = this.rt;
                    int var202 = var8 + 1;
                    var202 = var8 * var202;
                    var202 &= 1;
                    if (var202 != 0) {
                        var17 *= -184738543;
                        var17 ^= 1684723676;
                    } else {
                        label210: {
                            var17 += 1790795210;
                            var17 ^= 297917949;
                            long var205 = var17;
                            long var273 = var205 + 1L;
                            var273 = var205 * var273;
                            long var303 = var205 + 2L;
                            var273 *= var303;
                            long var206 = var205 + 3L;
                            var273 *= var206;
                            long var207 = var273 & 7L;
                            long var309;
                            var202 = (var309 = var207 - 0L) == 0L ? 0 : (var309 < 0L ? -1 : 1);
                            if (var202 != 0) {
                                break label206;
                            }

                            if (var165 > 0) {
                                var17 |= 1919959220;
                                var17 *= -1619553673;
                                var17 -= -1354280192;
                                var17 += -1776818633;
                                var17 ^= 1160906385;
                                long var166 = var17;
                                long var250 = var166 + 1L;
                                long var251 = var166 * var250;
                                long var167 = var251 & 1L;
                                long var310;
                                int var168 = (var310 = var167 - 0L) == 0L ? 0 : (var310 < 0L ? -1 : 1);
                                if (var168 != 0) {
                                    break label206;
                                }

                                Oo var169 = this.Gf;
                                int var170 = var169.kG();
                                Integer var209 = var8;
                                if (var209 == null) {
                                    switch (var17) {
                                        case 1550835895:
                                        default:
                                            var17 ^= -742054215;
                                            break label210;
                                        case 1803346536:
                                            var17 ^= 1022908526;
                                            break label210;
                                        case 1931771531:
                                            var17 <<= 18;
                                            var17 ^= 1249633726;
                                            break label210;
                                    }
                                }

                                var17 |= -2808702;
                                var17 ^= -452439916;
                                var1.roundRect(var2, var3, var4, var4, var5, var170);
                                int var171 = this.rt;
                                float var210 = this.LR;
                                var11 = this.au;
                                var1.image(var171, var2, var3, var4, var4, 0.125F, var210, 0.25F, var11, -1, var5, false);
                                LivingEntity var172 = this.rv;
                                boolean var173 = i_2.Jr(var172);
                                if (var173) {
                                    var17 = switch (var17) {
                                        case -1398463326 -> var17 ^ 1031469170;
                                        default -> var17 ^ 28587372;
                                        case 452800031 -> {
                                            var17 -= 1123675520;
                                            var17 &= 1507763407;
                                            var17 |= -1389304484;
                                            var17 += -1636765013;
                                            yield var17 ^ 1749174534;
                                        }
                                    };
                                    long var174 = var17;
                                    long var253 = var174 + 1L;
                                    long var254 = var174 * var253;
                                    long var13 = var174 + 2L;
                                    long var255 = var254 * var13;
                                    long var175 = var174 + 3L;
                                    long var256 = var255 * var175;
                                    long var176 = var256 & 7L;
                                    long var311;
                                    int var177 = (var311 = var176 - 0L) == 0L ? 0 : (var311 < 0L ? -1 : 1);
                                    if (var177 != 0) {
                                        break label206;
                                    }

                                    int var178 = this.rt;
                                    long var211 = var8;
                                    var273 = var211 + 1L;
                                    var273 = var211 * var273;
                                    long var212 = var273 & 1L;
                                    long var312;
                                    int var213 = (var312 = var212 - 0L) == 0L ? 0 : (var312 < 0L ? -1 : 1);
                                    if (var213 != 0) {
                                        switch (var17) {
                                            case -1967687712:
                                            default:
                                                var17 ^= 2002370116;
                                                break label210;
                                            case -203320948:
                                                var17 &= -1647047442;
                                                var17 ^= -1663553275;
                                                var17 *= -2051423757;
                                                var17 -= -674027107;
                                                var17 ^= 2083176912;
                                                break label210;
                                            case 553908093:
                                                var17 ^= 1581476655;
                                                break label210;
                                        }
                                    }

                                    var17 *= 1377196565;
                                    var17 ^= 1093640676;
                                    var17 |= 1239042674;
                                    var17 ^= 2673792;
                                    long var214 = var17;
                                    var273 = var214 + 1L;
                                    var273 = var214 * var273;
                                    long var215 = var273 & 1L;
                                    long var313;
                                    var213 = (var313 = var215 - 0L) == 0L ? 0 : (var313 < 0L ? -1 : 1);
                                    if (var213 != 0) {
                                        break label206;
                                    }

                                    float var217 = this.LR;
                                    var11 = this.au;
                                    var1.image(var178, var2, var3, var4, var4, 0.625F, var217, 0.75F, var11, -1, var5, false);
                                    var17 >>>= 3;
                                    var17 ^= -1562867784;
                                    var17 ^= 1131140654;
                                    var17 ^= -1526394104;
                                } else {
                                    switch (var17) {
                                        case -1764634379:
                                        default:
                                            var17 ^= 1027141190;
                                            break;
                                        case -346336262:
                                            var17 ^= -1149190475;
                                            break;
                                        case 452800031:
                                            var17 ^= -924999417;
                                            var17 |= 739547001;
                                            var17 ^= -1480803064;
                                    }
                                }
                            } else {
                                var17 &= -802661172;
                                var17 *= -1880630529;
                                var17 ^= 1950817387;
                                var17 ^= -935164173;
                                int var179 = this.Lr;
                                int var180 = DP.PP(var179, -0.35F);
                                var202 = this.Lr;
                                var202 = DP.PP(var202, -0.65F);
                                Paint var181 = Paint.linear(var180, var202, 1.1F);
                                var1.roundRect(var2, var3, var4, var4, var5, var181);
                                String var182 = this.q;
                                boolean var183 = var182.isEmpty();
                                var202 = var8 + 1;
                                var202 = var8 * var202;
                                var202 &= 1;
                                if (var202 != 0) {
                                    var17 &= -975895123;
                                    var17 += -1737163740;
                                    var17 |= -314495899;
                                    var17 *= -1175849905;
                                    var17 ^= 1345824157;
                                    break label210;
                                }

                                var17 ^= -633926803;
                                var17 += -2129012672;
                                var17 ^= -1222132555;
                                String var184;
                                if (var183) {
                                    var17 ^= 848131704;
                                    var17 ^= -2087724668;
                                    var184 = "?";
                                    var17 &= -353143943;
                                    var17 ^= -1846912069;
                                } else {
                                    var17 >>>= 11;
                                    var17 += 2029990266;
                                    var17 <<= 7;
                                    var17 |= -660945781;
                                    var17 ^= -1420755266;
                                    var202 = var17 + 1;
                                    var202 = var17 * var202;
                                    int var258 = var17 + 2;
                                    var202 *= var258;
                                    int var259 = var17 + 3;
                                    var202 *= var259;
                                    var202 &= 7;
                                    if (var202 != 0) {
                                        break label206;
                                    }

                                    String var228 = this.q;
                                    String var260 = this.q;
                                    int var281 = var8 + 1;
                                    int var282 = var8 * var281;
                                    int var301 = var8 + 2;
                                    int var283 = var282 * var301;
                                    var301 = var8 + 3;
                                    int var284 = var283 * var301;
                                    int var285 = var284 & 7;
                                    if (var285 != 0) {
                                        var17 >>= 21;
                                        var17 += 169112289;
                                        var17 += -1094190087;
                                        var17 += 2009594539;
                                        var17 ^= -252475209;
                                        break label210;
                                    }
                                    var17 = switch (var17) {
                                        case -2093740225 -> var17 ^ -918195917;
                                        default -> var17 ^ 392574412;
                                        case 1888158517 -> {
                                            var17 -= -457101874;
                                            yield var17 ^ 2076151996;
                                        }
                                    };
                                    int var261 = var260.offsetByCodePoints(0, 1);
                                    String var229 = var228.substring(0, var261);
                                    Locale var262 = Locale.ROOT;
                                    String var230 = var229.toUpperCase(var262);
                                    var184 = var230;
                                    var17 ^= -298181053;
                                    var17 ^= -274243301;
                                }

                                float var231 = var4 * 0.5F;
                                float var232 = var2 + var231;
                                var11 = var4 * 0.24F;
                                var11 = var3 + var11;
                                Integer var286 = var8;
                                if (var286 == null) {
                                    var17 *= 403293017;
                                    var17 ^= 782484789;
                                    break label210;
                                }
                                var17 = switch (var17) {
                                    default -> var17 ^ 1530113750;
                                    case -236242301 -> {
                                        var17 |= -1861589634;
                                        var17 ^= -582566624;
                                        var17 -= 744853223;
                                        var17 ^= -43789636;
                                        yield var17 ^ 125557853;
                                    }
                                    case 614457519 -> var17 ^ 1660786354;
                                };
                                var273 = var17;
                                var303 = var273 + 1L;
                                var303 = var273 * var303;
                                var273 = var303 & 1L;
                                long var314;
                                int var289 = (var314 = var273 - 0L) == 0L ? 0 : (var314 < 0L ? -1 : 1);
                                if (var289 != 0) {
                                    break label206;
                                }

                                float var290 = var4 * 0.48F;
                                TextStyle var291 = TextStyle.of(var290, -218103809);
                                TextStyle var292 = var291.bold();
                                var9 = var1.textCentered(var184, var232, var11, var292);
                                var17 -= 1383804003;
                                var17 -= 1707324025;
                                var17 >>>= 15;
                                var17 >>>= 22;
                                var17 ^= 1502093937;
                            }

                            var9 = this.rD;
                            var202 = var8 + 1;
                            var202 = var8 * var202;
                            int var265 = var8 + 2;
                            var202 *= var265;
                            int var266 = var8 + 3;
                            var202 *= var266;
                            var202 &= 7;
                            label175:
                            if (var202 == 0) {
                                var17 -= 1293481149;
                                var17 ^= -1841571735;
                                long var238 = var17;
                                var273 = var238 + 1L;
                                var273 = var238 * var273;
                                var303 = var238 + 2L;
                                var273 *= var303;
                                long var239 = var238 + 3L;
                                var273 *= var239;
                                long var240 = var273 & 7L;
                                long var315;
                                var202 = (var315 = var240 - 0L) == 0L ? 0 : (var315 < 0L ? -1 : 1);
                                if (var202 != 0) {
                                    break label206;
                                }

                                float var316;
                                int var187 = (var316 = var9 - 0.0F) == 0.0F ? 0 : (var316 < 0.0F ? -1 : 1);
                                if (var187 > 0) {
                                    var17 += -1993776831;
                                    var17 += 918082190;
                                    var17 *= 56596645;
                                    var17 ^= -1081269151;
                                    var9 = this.rD;
                                    var9 = 0.42F * var9;
                                    int var190 = DP.Y(-50354, var9);
                                    var202 = var8 + 1;
                                    var202 = var8 * var202;
                                    int var267 = var8 + 2;
                                    var202 *= var267;
                                    int var268 = var8 + 3;
                                    var202 *= var268;
                                    var202 &= 7;
                                    if (var202 != 0) {
                                        switch (var17) {
                                            case 526846941:
                                            default:
                                                var17 ^= -1757269250;
                                                break label175;
                                            case 1251139517:
                                                var17 &= 951085963;
                                                var17 ^= -1194873289;
                                                break label175;
                                            case 2065209723:
                                                var17 ^= 1116561693;
                                                break label175;
                                        }
                                    }

                                    var17 *= 1753339057;
                                    var17 ^= -735896962;
                                    var17 >>>= 2;
                                    var17 -= 583929065;
                                    var17 ^= -1665371033;
                                    Integer var247 = var17;
                                    if (var247 == null) {
                                        break label206;
                                    }

                                    var1.roundRect(var2, var3, var4, var4, var5, var190);
                                    var17 -= -1649902489;
                                    var17 ^= 277325462;
                                } else {
                                    var17 -= 1278985770;
                                    var17 -= -1434227631;
                                    var17 += -506494867;
                                    var17 ^= 1383803484;
                                }

                                var9 = var2 + 0.25F;
                                float var248 = var3 + 0.25F;
                                var11 = var4 - 0.5F;
                                int var297 = var8 + 1;
                                int var298 = var8 * var297;
                                var8 = var298 & 1;
                                if (var8 == 0) {
                                    var17 -= -1265179608;
                                    var17 ^= -304034687;
                                    float var145 = var4 - 0.5F;
                                    Oo var299 = this.Gf;
                                    Paint var300 = var299.FH();
                                    var1.roundRect(var9, var248, var11, var145, var5, var300);
                                    var1.restore();
                                    return;
                                }

                                var17 &= 1593137811;
                                var17 ^= -364663507;
                            } else {
                                switch (var17) {
                                    case -49307499:
                                        var17 ^= -611280022;
                                        break;
                                    case 1502093937:
                                        var17 &= -814558110;
                                        var17 &= -1251164879;
                                        var17 ^= -1319639650;
                                        break;
                                    case 2027924688:
                                    default:
                                        var17 ^= -638414031;
                                }
                            }
                        }
                    }
                }
            }

            AssertionError var142 = new AssertionError();
            throw var142;
        }

        AssertionError var143 = new AssertionError();
        throw var143;
    }

    private void sh(Canvas var1, float var2, float var3, float var4, float var5, lH_3 var6, int var7) {
        int var9 = System.identityHashCode(this);
        float var10 = var5 * 0.5F;
        float var11 = this.Cx;
        int var12 = var9 + 1;
        var12 = var9 * var12;
        int var13 = var9 + 2;
        var12 *= var13;
        var13 = var9 + 3;
        var12 *= var13;
        var12 &= 7;
        label166:
        if (var12 == 0) {
            int var26 = switch (var7) {
                case -1460422984 -> {
                    int var27 = var7 * -198459939;
                    var27 &= -260584594;
                    var27 -= -841059935;
                    yield var27 ^ -1556631140;
                }
                case -1088769541 -> var7 ^ -1221101197;
                default -> var7 ^ -379717837;
            };
            long var143 = var26;
            long var14 = var143 + 1L;
            var14 = var143 * var14;
            long var144 = var14 & 1L;
            long var240;
            var12 = (var240 = var144 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
            label162:
            if (var12 == 0) {
                var11 = TP.S(var11);
                Re var146 = this.F;
                float var147 = var146.ey();
                float var148 = TP.S(var147);
                Oo var168 = this.Gf;
                var13 = var168.UK();
                var1.roundRect(var2, var3, var4, var5, var10, var13);
                Oo var170 = this.Gf;
                var13 = var170.D();
                if (var13 != 0) {
                    var26 |= 431562186;
                    var26 |= 1374466778;
                    var26 &= 1381451500;
                    var26 ^= -1663250764;
                    float var172 = var5 * 0.5F;
                    float var173 = var3 + var172;
                    Integer var191 = var9;
                    if (var191 == null) {
                        switch (var26) {
                            case -1859460552:
                            default:
                                var26 ^= 887561454;
                                break label166;
                            case -1277691064:
                                var26 ^= -1056771527;
                                break label166;
                            case -863254436:
                                var26 |= 1742747017;
                                var26 -= 243119824;
                                var26 += -144795787;
                                var26 += -751437334;
                                var26 ^= 1867247370;
                                break label166;
                        }
                    }

                    var26 <<= 22;
                    var26 <<= 5;
                    var26 ^= 1322185656;
                    var26 ^= 302437874;
                    var14 = var26;
                    long var16 = var14 + 1L;
                    var16 = var14 * var16;
                    long var18 = var14 + 2L;
                    var16 *= var18;
                    var14 += 3L;
                    var16 *= var14;
                    var14 = var16 & 7L;
                    long var241;
                    int var195 = (var241 = var14 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                    if (var195 != 0) {
                        break label162;
                    }

                    float var174 = var173 - 0.35F;
                    Oo var196 = this.Gf;
                    int var197 = var196.D();
                    var1.roundRect(var2, var174, var4, 0.7F, 0.35F, var197);
                    var26 += 819047506;
                    var26 *= -600865443;
                    var26 *= -605835355;
                    var26 ^= -557777059;
                } else {
                    var26 += 121723246;
                    var26 ^= -361599192;
                }

                var13 = var26 + 1;
                var13 = var26 * var13;
                var13 &= 1;
                if (var13 == 0) {
                    float var178 = var4 * var11;
                    float var149 = var4 * var148;
                    float var198 = var178 + 0.2F;
                    long var15 = var9;
                    long var17 = var15 + 1L;
                    var17 = var15 * var17;
                    var15 = var17 & 1L;
                    long var242;
                    int var215 = (var242 = var15 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                    if (var215 != 0) {
                        switch (var26) {
                            case -1720181997:
                            default:
                                var26 ^= -1712221710;
                                break label166;
                            case 577527034:
                                var26 ^= -1883992872;
                                break label166;
                            case 1121417089:
                                var26 -= -1882940409;
                                var26 >>>= 4;
                                var26 ^= -931652911;
                                break label166;
                        }
                    }

                    var26 *= -140398973;
                    var26 ^= -1856248419;
                    var15 = var26;
                    var17 = var15 + 1L;
                    var17 = var15 * var17;
                    long var19 = var15 + 2L;
                    var17 *= var19;
                    var15 += 3L;
                    var17 *= var15;
                    var15 = var17 & 7L;
                    long var243;
                    int var219 = (var243 = var15 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                    if (var219 == 0) {
                        float var244;
                        int var199 = (var244 = var149 - var198) == 0.0F ? 0 : (var244 < 0.0F ? -1 : 1);
                        if (var199 > 0) {
                            var26 >>>= 10;
                            var26 |= 733841765;
                            var26 += -740038219;
                            var26 |= -1716472130;
                            var26 ^= -245840302;
                            var1.roundRect(var2, var3, var149, var5, var10, -1929379841);
                            var26 += 97131996;
                            var26 ^= 2044796810;
                        } else {
                            var26 >>>= 25;
                            var26 -= -150362309;
                            var26 >>= 26;
                            var26 += 704131286;
                            var26 ^= 1152016538;
                        }

                        Integer var150 = var26;
                        if (var150 != null) {
                            float var245;
                            int var151 = (var245 = var178 - 0.2F) == 0.0F ? 0 : (var245 < 0.0F ? -1 : 1);
                            Integer var200 = var9;
                            if (var200 == null) {
                                switch (var26) {
                                    case -1026175936:
                                    default:
                                        var26 ^= -969149730;
                                        break label166;
                                    case 470938453:
                                        var26 ^= 1214803332;
                                        break label166;
                                    case 1834111042:
                                        var26 *= 1773135667;
                                        var26 &= 474958294;
                                        var26 -= -2061238690;
                                        var26 += -1446574129;
                                        var26 ^= -2084887279;
                                        break label166;
                                }
                            }

                            var26 += 298941051;
                            var26 -= -494133186;
                            var26 &= 14522900;
                            var26 ^= 477504901;
                            Integer var201 = var26;
                            label146:
                            if (var201 != null) {
                                if (var151 > 0) {
                                    var26 = switch (var26) {
                                        case -1613154993 -> var26 ^ -1410733555;
                                        case 484683665 -> {
                                            var26 *= -1500567417;
                                            var26 += 1726511363;
                                            var26 ^= -1531599400;
                                            yield var26 ^ -1359778238;
                                        }
                                        default -> var26 ^ 10860281;
                                    };
                                    var151 = var26 & 346115617;
                                    var151 += -1191057453;
                                    var151 *= 591607691;
                                    var151 ^= 2074490226;
                                    int var129 = this.xG(var11, var151);
                                    float var156 = var5 * 1.6F;
                                    float var157 = Math.max(4.0F, var156);
                                    var14 = var9;
                                    long var224 = var14 + 1L;
                                    var224 = var14 * var224;
                                    long var238 = var14 + 2L;
                                    var224 *= var238;
                                    var14 += 3L;
                                    var224 *= var14;
                                    var14 = var224 & 7L;
                                    long var246;
                                    int var205 = (var246 = var14 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                                    if (var205 != 0) {
                                        var26 += 852870916;
                                        var26 ^= -1245809790;
                                        break label166;
                                    }

                                    var26 ^= 521650528;
                                    var26 >>= 27;
                                    var26 >>>= 9;
                                    var26 >>>= 22;
                                    var26 ^= -143650688;
                                    var14 = var26;
                                    var224 = var14 + 1L;
                                    var224 = var14 * var224;
                                    var238 = var14 + 2L;
                                    var224 *= var238;
                                    var14 += 3L;
                                    var224 *= var14;
                                    var14 = var224 & 7L;
                                    long var247;
                                    int var209 = (var247 = var14 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                                    if (var209 != 0) {
                                        break label146;
                                    }

                                    int var210 = DP.Y(var129, 0.45F);
                                    var1.shadow(var2, var3, var178, var5, var10, var157, var210);
                                    var151 = DP.PP(var129, 0.16F);
                                    int var130 = DP.PP(var129, -0.48F);
                                    Paint var131 = Paint.vertical(var151, var130);
                                    var1.roundRect(var2, var3, var178, var5, var10, var131);
                                    var11 = var2 + 0.5F;
                                    float var159 = var3 + 0.35F;
                                    float var180 = Math.max(0.0F, --var178);
                                    float var211 = var5 * 0.38F;
                                    float var220 = var10 * 0.7F;
                                    Paint var232 = Paint.vertical(1090519039, 16777215);
                                    var1.roundRect(var11, var159, var180, var211, var220, var232);
                                    var26 -= -1418105049;
                                    var26 += 1839754053;
                                    var26 ^= -21925297;
                                } else {
                                    var26 ^= -506289938;
                                    var26 ^= 736214549;
                                    var26 ^= -1851747284;
                                    var26 >>>= 14;
                                    var26 ^= 1194287889;
                                }

                                Integer var133 = var26;
                                if (var133 != null) {
                                    LivingEntity var134 = this.rv;
                                    var11 = var134.getAbsorptionAmount();
                                    float var248;
                                    var151 = (var248 = var11 - 0.0F) == 0.0F ? 0 : (var248 < 0.0F ? -1 : 1);
                                    var13 = var9 + 1;
                                    var13 = var9 * var13;
                                    int var212 = var9 + 2;
                                    var13 *= var212;
                                    int var213 = var9 + 3;
                                    var13 *= var213;
                                    var13 &= 7;
                                    if (var13 != 0) {
                                        var26 <<= 17;
                                        var26 <<= 10;
                                        var26 ^= 1103497478;
                                        var26 >>>= 1;
                                        var26 ^= -1482017819;
                                        break label166;
                                    }

                                    var26 *= -1808112275;
                                    var26 ^= -1519201481;
                                    var13 = var26 + 1;
                                    var13 = var26 * var13;
                                    var13 &= 1;
                                    label136:
                                    if (var13 == 0) {
                                        if (var151 > 0) {
                                            var26 += -224038465;
                                            var26 ^= 512252683;
                                            Integer var161 = var26;
                                            if (var161 == null) {
                                                break label136;
                                            }

                                            LivingEntity var162 = this.rv;
                                            float var163 = var162.getMaxHealth();
                                            float var164 = Math.max(1.0F, var163);
                                            var11 /= var164;
                                            var11 = TP.S(var11);
                                            var11 = var4 * var11;
                                            float var165 = var2 + var4;
                                            float var166 = var165 - var11;
                                            var13 = DP.Y(-1850997, 0.9F);
                                            Integer var124 = var9;
                                            if (var124 == null) {
                                                switch (var26) {
                                                    case -1735767678:
                                                        var26 *= -1047259397;
                                                        var26 += 388054133;
                                                        var26 ^= 1121038989;
                                                        var26 += -1850936660;
                                                        var26 ^= 432508020;
                                                        break label166;
                                                    case -957859108:
                                                    default:
                                                        var26 ^= 502714737;
                                                        break label166;
                                                    case -495512932:
                                                        var26 ^= -977075343;
                                                        break label166;
                                                }
                                            }
                                            var26 = switch (var26) {
                                                case -1735767678 -> {
                                                    var26 &= 833695923;
                                                    var26 += -791092591;
                                                    yield var26 ^ 1400265481;
                                                }
                                                case -1326430797 -> var26 ^ -2128416992;
                                                default -> var26 ^ 1742223613;
                                            };
                                            var124 = var26;
                                            if (var124 == null) {
                                                break label136;
                                            }

                                            var1.roundRect(var166, var3, var11, var5, var10, var13);
                                            switch (var26) {
                                                case -1305561062:
                                                    var26 |= -1898678107;
                                                    var26 += 1890168847;
                                                    var26 &= -1572593696;
                                                    var26 += -1431627165;
                                                    var26 ^= -400560034;
                                                    break;
                                                case -208861586:
                                                    var26 ^= 1862741571;
                                                    break;
                                                case 310874512:
                                                default:
                                                    var26 ^= 1624787609;
                                            }
                                        } else {
                                            var26 += -643141586;
                                            var26 ^= -465133616;
                                            var26 ^= -1376428971;
                                        }

                                        Integer var126 = var26;
                                        if (var126 != null) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            RuntimeException var127 = new RuntimeException();
            throw var127;
        } else {
            switch (var7) {
                case -1872102047:
                    int var25 = var7 ^ -109459273;
                    break;
                case -1460422984:
                    int var21 = var7 ^ 1811597794;
                    var21 *= 617200797;
                    var21 <<= 22;
                    var21 ^= 1338586982;
                    break;
                case 1267876925:
                default:
                    int var8 = var7 ^ -2069851697;
            }
        }

        IllegalStateException var123 = new IllegalStateException();
        throw var123;
    }

    private int xG(float var1, int var2) {
        label54: {
            int var27;
            int var61;
            label53: {
                int var4 = System.identityHashCode(this);
                float var5 = 0.3F - var1;
                var5 /= 0.3F;
                Integer var6 = var4;
                if (var6 == null) {
                    var27 = var2 >> 19;
                    var27 ^= 2069698307;
                    var27 ^= -2145463824;
                } else {
                    var27 = var2 << 23;
                    var27 -= 1698119519;
                    var27 |= -912363916;
                    var27 ^= -279591708;
                    var5 = TP.S(var5);
                    float var82;
                    int var59 = (var82 = var5 - 0.0F) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
                    if (var59 <= 0) {
                        var27 = switch (var27) {
                            case 703693920 -> var27 ^ -2044917545;
                            case 847981073 -> {
                                var27 &= -1913320288;
                                yield var27 ^ -390037113;
                            }
                            default -> var27 ^ 972804731;
                        };
                        var59 = this.Lr;
                        long var7 = var4;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var83;
                        int var64 = (var83 = var7 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
                        if (var64 == 0) {
                            var27 *= 402792243;
                            var27 ^= -283362225;
                            var61 = var59;
                            var27 *= 574223639;
                            var27 ^= 159091395;
                            break label53;
                        }

                        var27 ^= -1496864864;
                        var27 &= -1531166621;
                        var27 |= 254116089;
                        var27 ^= -186234105;
                    } else {
                        var27 += 1180892503;
                        var27 |= -483319072;
                        var27 >>>= 4;
                        var27 >>= 29;
                        var27 ^= 1240634803;
                        long var65 = var27;
                        long var76 = var65 + 1L;
                        var76 = var65 * var76;
                        long var81 = var65 + 2L;
                        var76 *= var81;
                        var65 += 3L;
                        var76 *= var65;
                        var65 = var76 & 7L;
                        long var84;
                        int var68 = (var84 = var65 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                        if (var68 != 0) {
                            break label54;
                        }

                        int var69 = this.Lr;
                        var5 *= 0.75F;
                        int var8 = var4 + 1;
                        var8 = var4 * var8;
                        int var80 = var4 + 2;
                        var8 *= var80;
                        var4 += 3;
                        var8 *= var4;
                        var4 = var8 & 7;
                        if (var4 == 0) {
                            var27 = switch (var27) {
                                default -> var27 ^ 546641071;
                                case -180240955 -> var27 ^ 1029670161;
                                case 1240634803 -> {
                                    var27 &= 1238396082;
                                    yield var27 ^ 1253718973;
                                }
                            };
                            var4 = DP.Bp(var69, -50354, var5);
                            var61 = var4;
                            var27 -= -1314419571;
                            var27 |= 1691097310;
                            var27 ^= 492347958;
                            var27 &= 36161159;
                            var27 ^= -1366891259;
                            break label53;
                        }

                        var27 |= -777717531;
                        var27 >>>= 11;
                        var27 *= -1356134183;
                        var27 ^= 2128124240;
                        var27 ^= 1948193195;
                    }
                }

                var4 = var27 + 1;
                var4 = var27 * var4;
                int var58 = var27 + 2;
                var4 *= var58;
                var27 += 3;
                var4 *= var27;
                var27 = var4 & 7;
                if (var27 == 0) {
                    UnsupportedOperationException var39 = new UnsupportedOperationException();
                    throw var39;
                }
                break label54;
            }

            Integer var54 = var27;
            if (var54 != null) {
                return var61;
            }
        }

        IllegalArgumentException var46 = new IllegalArgumentException();
        throw var46;
    }

    private void uI(Canvas var1, int var2) {
        label157: {
            int var4 = System.identityHashCode(this);
            int var5 = var2 ^ 1481834405;
            var5 ^= -596288120;
            float var115 = this.i(var5);
            float var116 = 148.0F - var115;
            float var117 = var116 * 0.5F;
            float var118 = var117 + 4.0F;
            float var6 = 68.3F;
            ItemStack[] var7 = this.Ou;
            ItemStack[] var126 = var7;
            int var8 = var7.length;
            long var9 = var4;
            long var11 = var9 + 1L;
            var11 = var9 * var11;
            var9 = var11 & 1L;
            long var219;
            int var130 = (var219 = var9 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
            int var3;
            if (var130 != 0) {
                switch (var2) {
                    case -270191871:
                        var3 = var2 ^ -1742403471;
                        break;
                    case 847519620:
                        var3 = var2 ^ 1858587340;
                        var3 += 1734901557;
                        var3 -= 1365965781;
                        var3 ^= -146757300;
                        break;
                    case 2093731758:
                    default:
                        var3 = var2 ^ 2103432551;
                }
            } else {
                var3 = var2 - 397677792;
                var3 |= 1343974991;
                var3 *= 846870681;
                var3 *= 1674102601;
                var3 ^= 863245825;
                var8 = var8;
                byte var131 = 0;
                float var119 = var118;
                int var132 = var131;
                var3 += 1481580406;
                var3 &= -346537411;
                var3 -= 1082476953;
                var3 ^= -1947760104;

                label154:
                while (true) {
                    int var10 = var3 + 1;
                    var10 = var3 * var10;
                    var10 &= 1;
                    if (var10 != 0) {
                        break label157;
                    }

                    if (var132 >= var8) {
                        var3 -= 1011615859;
                        var3 *= -1278903513;
                        var3 |= -629940413;
                        var3 ^= -1827119829;
                        long var105 = var3;
                        long var120 = var105 + 1L;
                        long var121 = var105 * var120;
                        long var106 = var121 & 1L;
                        long var220;
                        var3 = (var220 = var106 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                        break label157;
                    }

                    var3 *= 1992636809;
                    var3 >>= 30;
                    var3 |= -1222939549;
                    var3 ^= -597626078;
                    var10 = var3 + 1;
                    var10 = var3 * var10;
                    int var153 = var3 + 2;
                    var10 *= var153;
                    int var154 = var3 + 3;
                    var10 *= var154;
                    var10 &= 7;
                    if (var10 != 0) {
                        break label157;
                    }

                    ItemStack var140 = var126[var132];
                    int var155 = var4 + 1;
                    int var156 = var4 * var155;
                    int var157 = var156 & 1;
                    if (var157 != 0) {
                        var3 ^= -104384618;
                        var3 &= 1822390990;
                        var3 &= 1434412730;
                        var3 &= 2113820306;
                        var3 ^= -2061635226;
                        break;
                    }

                    var3 >>= 2;
                    var3 ^= 867522451;
                    int var158 = var3 + 1;
                    int var159 = var3 * var158;
                    int var160 = var159 & 1;
                    if (var160 != 0) {
                        break label157;
                    }

                    boolean var161 = var140.isEmpty();
                    float var163;
                    if (var161) {
                        var3 = switch (var3) {
                            default -> var3 ^ -1083770253;
                            case 694923331 -> {
                                var3 *= 1753837107;
                                var3 &= 928970154;
                                var3 ^= -919854987;
                                var3 <<= 12;
                                yield var3 ^ 1005734522;
                            }
                            case 1089983248 -> var3 ^ 1782436017;
                        };
                        Integer var162 = var3;
                        if (var162 == null) {
                            break label157;
                        }

                        var163 = var119;
                        var3 <<= 3;
                        var3 ^= 808745929;
                    } else {
                        var3 ^= 1783290283;
                        var3 &= 27893603;
                        var3 += 1271178370;
                        var3 ^= -277014746;
                        var3 ^= 1536050966;
                        Integer var12 = var3;
                        if (var12 == null) {
                            break label157;
                        }

                        boolean var168 = var140.isDamageable();
                        int var13 = var4 + 1;
                        var13 = var4 * var13;
                        var13 &= 1;
                        if (var13 != 0) {
                            switch (var3) {
                                case -132710958:
                                    var3 -= 196683501;
                                    var3 ^= 1767646977;
                                    break label154;
                                case 77874774:
                                default:
                                    var3 ^= 2108481773;
                                    break label154;
                                case 1257214922:
                                    var3 ^= 945344382;
                                    break label154;
                            }
                        }

                        var3 |= -1503730451;
                        var3 += -907617761;
                        var3 += -2025085937;
                        var3 ^= -2047706038;
                        Integer var184 = var3;
                        if (var184 == null) {
                            break label157;
                        }

                        if (var168) {
                            var3 *= 591271745;
                            var3 ^= -36274877;
                            var12 = var3;
                            if (var12 == null) {
                                break label157;
                            }

                            int var170 = var140.getMaxDamage();
                            int var185 = var4 + 1;
                            var185 = var4 * var185;
                            int var14 = var4 + 2;
                            var185 *= var14;
                            var14 = var4 + 3;
                            var185 *= var14;
                            var185 &= 7;
                            if (var185 != 0) {
                                var3 &= -2142997953;
                                var3 |= -629470191;
                                var3 += -1758965986;
                                var3 += -1942377026;
                                var3 ^= 2027739893;
                                break;
                            }
                            var3 = switch (var3) {
                                case -1949817244 -> {
                                    var3 ^= -317742061;
                                    var3 &= 69833824;
                                    yield var3 ^ -1271922665;
                                }
                                case -1177156201 -> var3 ^ 654241367;
                                default -> var3 ^ 333885529;
                            };
                            var185 = var3 + 1;
                            var185 = var3 * var185;
                            var14 = var3 + 2;
                            var185 *= var14;
                            var14 = var3 + 3;
                            var185 *= var14;
                            var185 &= 7;
                            if (var185 != 0) {
                                break label157;
                            }

                            if (var170 > 0) {
                                var3 >>= 11;
                                var3 |= -1394986961;
                                var3 &= 1944039963;
                                var3 |= -1589558119;
                                var3 ^= -1606071551;
                                var170 = var140.getDamage();
                                float var172 = var170;
                                var10 = var140.getMaxDamage();
                                float var142 = var10;
                                float var143 = var172 / var142;
                                float var144 = TP.S(var143);
                                float var145 = 1.0F - var144;
                                float var173 = 9.0F;
                                float var195 = 15.0F - var173;
                                long var205 = var4;
                                long var16 = var205 + 1L;
                                var16 = var205 * var16;
                                long var206 = var16 & 1L;
                                long var221;
                                var14 = (var221 = var206 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                                if (var14 != 0) {
                                    var3 += 666570103;
                                    var3 ^= -28001547;
                                    break;
                                }

                                var3 += 1489132268;
                                var3 ^= 1407911931;
                                var14 = var3 + 1;
                                var14 = var3 * var14;
                                var14 &= 1;
                                if (var14 != 0) {
                                    break label157;
                                }

                                float var196 = var195 * 0.5F;
                                float var197 = var119 + var196;
                                var1.roundRect(var197, var6, var173, 1.3F, 0.65F, 385875967);
                                float var174 = var173 * var145;
                                float var175 = Math.max(1.3F, var174);
                                float var146 = var145 * 0.33F;
                                var10 = DP.SW(var146, 0.5F, 0.78F);
                                var1.roundRect(var197, var6, var175, 1.3F, 0.65F, var10);
                                switch (var3) {
                                    case -965994328:
                                    default:
                                        var3 ^= 1340570599;
                                        break;
                                    case -717524519:
                                        var3 ^= 1089085683;
                                        break;
                                    case -4743299:
                                        var3 ^= -1964334713;
                                        var3 *= 968043831;
                                        var3 |= -1021082109;
                                        var3 ^= 557281914;
                                        var3 ^= 1957160302;
                                }
                            } else {
                                var3 *= 214099493;
                                var3 *= -554238921;
                                var3 ^= 1809433430;
                            }
                        } else {
                            switch (var3) {
                                case -899481497:
                                    var3 &= 1610761174;
                                    var3 *= 1049163075;
                                    var3 ^= 1501722865;
                                    break;
                                case -185152706:
                                    var3 ^= -1730382839;
                                    break;
                                case 161319106:
                                default:
                                    var3 ^= -256475155;
                            }
                        }

                        Integer var148 = var3;
                        if (var148 == null) {
                            break label157;
                        }

                        float var149 = var119 + 15.0F;
                        long var176 = var4;
                        long var211 = var176 + 1L;
                        var211 = var176 * var211;
                        long var177 = var211 & 1L;
                        long var222;
                        int var178 = (var222 = var177 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
                        if (var178 != 0) {
                            var3 |= 1200325562;
                            var3 -= 378823730;
                            var3 += -1744763541;
                            var3 ^= -462848752;
                            break;
                        }

                        var3 |= -279378506;
                        var3 |= 1526756989;
                        var3 &= 31830921;
                        var3 ^= -194564488;
                        var163 = var149;
                        var3 &= 1034545472;
                        var3 ^= -779406936;
                        var3 -= -437715001;
                        var3 ^= 1941606712;
                    }

                    long var179 = var3;
                    long var213 = var179 + 1L;
                    var213 = var179 * var213;
                    long var218 = var179 + 2L;
                    var213 *= var218;
                    var179 += 3L;
                    var213 *= var179;
                    var179 = var213 & 7L;
                    long var223;
                    var10 = (var223 = var179 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                    if (var10 != 0) {
                        break label157;
                    }

                    var10 = var132 + 1;
                    var119 = var163;
                    var11 = var4;
                    long var198 = var11 + 1L;
                    var198 = var11 * var198;
                    long var15 = var11 + 2L;
                    var198 *= var15;
                    var11 += 3L;
                    var198 *= var11;
                    var11 = var198 & 7L;
                    long var224;
                    int var167 = (var224 = var11 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
                    if (var167 != 0) {
                        var3 -= 22819693;
                        var3 ^= 247301448;
                        break;
                    }

                    var3 -= 509410373;
                    var3 |= 1994243965;
                    var3 -= -1630691323;
                    var3 ^= 987535803;
                    var132 = var10;
                    var3 *= 870022047;
                    var3 *= 1957352557;
                    var3 ^= 2146941999;
                    var3 ^= 1022477445;
                }
            }

            long var109 = var3;
            long var122 = var109 + 1L;
            long var123 = var109 * var122;
            long var128 = var109 + 2L;
            long var124 = var123 * var128;
            long var110 = var109 + 3L;
            long var125 = var124 * var110;
            long var111 = var125 & 7L;
            long var225;
            var4 = (var225 = var111 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
            if (var4 == 0) {
                UnsupportedOperationException var113 = new UnsupportedOperationException();
                throw var113;
            }
        }

        RuntimeException var108 = new RuntimeException();
        throw var108;
    }

    private void s(int var1, int var2) {
        label126: {
            int var4 = var1;
            int var5 = System.identityHashCode(this);
            Integer var6 = var5;
            if (var6 == null) {
                switch (var2) {
                    case -1918052616:
                        int var22 = var2 ^ -792863048;
                        break;
                    case 996201084:
                    default:
                        int var21 = var2 ^ 230091191;
                        break;
                    case 2083368265:
                        int var3 = var2 & -941808580;
                        var3 += 1739922173;
                        var3 ^= 1893407047;
                }
            } else {
                int var27 = switch (var2) {
                    default -> var2 ^ -319249819;
                    case 1960531315 -> var2 ^ 1336925265;
                    case 2083368265 -> {
                        int var23 = var2 ^ 808436590;
                        var23 &= 1736081902;
                        var23 >>= 29;
                        var23 ^= 50280674;
                        yield var23 ^ 1388751930;
                    }
                };
                var6 = var1;
                if (var6 == null) {
                    break label126;
                }

                ThreadLocalRandom var88 = ThreadLocalRandom.current();
                ThreadLocalRandom var89 = var88;
                r_2 var7 = this.Z;
                Nb var8 = Nb.MODERN;
                boolean var90 = var7.TJ(var8);
                float var96;
                if (var90) {
                    var27 = switch (var27) {
                        default -> var27 ^ 1377873762;
                        case -80408435 -> var27 ^ -1631775377;
                        case 1345950938 -> {
                            var27 &= -1626081126;
                            yield var27 ^ 215184168;
                        }
                    };
                    int var91 = var1 + 1;
                    int var92 = var1 * var91;
                    int var98 = var1 + 2;
                    int var93 = var92 * var98;
                    int var99 = var1 + 3;
                    int var94 = var93 * var99;
                    int var95 = var94 & 7;
                    if (var95 != 0) {
                        break label126;
                    }

                    var96 = 21.0F;
                    var27 -= 829168984;
                    var27 += 2066998797;
                    var27 += -866569196;
                    var27 ^= -641068541;
                } else {
                    var27 >>= 18;
                    var27 += 1242707093;
                    var27 += -935469382;
                    var27 ^= 1368698556;
                    long var100 = var1;
                    long var10 = var100 + 1L;
                    var10 = var100 * var10;
                    long var101 = var10 & 1L;
                    long var167;
                    int var102 = (var167 = var101 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
                    if (var102 != 0) {
                        break label126;
                    }

                    var96 = 16.0F;
                    switch (var27) {
                        case 1136953825:
                            var27 *= 1990929437;
                            var27 ^= -1352091643;
                            break;
                        case 1260119492:
                        default:
                            var27 ^= 1343101142;
                            break;
                        case 1500894019:
                            var27 ^= 884708275;
                    }
                }

                float var97 = var96;
                long var103 = var5;
                long var109 = var103 + 1L;
                var109 = var103 * var109;
                long var104 = var109 & 1L;
                long var168;
                int var105 = (var168 = var104 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                if (var105 != 0) {
                    switch (var27) {
                        case -1757372250:
                        default:
                            var27 ^= -335824065;
                            break;
                        case -349572488:
                            var27 &= -48336200;
                            var27 |= 707645976;
                            var27 ^= 808768634;
                            break;
                        case 1572696731:
                            var27 ^= 1169905276;
                    }
                } else {
                    var27 = switch (var27) {
                        case -1411451663 -> var27 ^ -418543697;
                        case -349572488 -> {
                            var27 *= -69058019;
                            var27 -= 678468566;
                            var27 *= 232299209;
                            yield var27 ^ 2112322430;
                        }
                        default -> var27 ^ 497370256;
                    };
                    float var106 = var96;
                    int var9 = 0;
                    var9 = var9;
                    var27 *= -1780320895;
                    var27 ^= 1072452766;

                    while (true) {
                        Integer var111 = var4;
                        if (var111 == null) {
                            break label126;
                        }

                        if (var9 >= var1) {
                            var27 *= -1259853545;
                            var27 |= 1989221266;
                            var27 ^= 2062379165;
                            var27 ^= 1372574419;
                            return;
                        }

                        var27 &= 1879027834;
                        var27 |= -1810000706;
                        var27 ^= 1973242699;
                        Integer var112 = var4;
                        if (var112 == null) {
                            break label126;
                        }

                        int var113 = this.DE;
                        int var11 = this.DE;
                        var11 = ++var11 % 64;
                        this.DE = var11;
                        double var117 = var89.nextDouble((float) (Math.PI * 2));
                        int var13 = var5 + 1;
                        var13 = var5 * var13;
                        int var14 = var5 + 2;
                        var13 *= var14;
                        var14 = var5 + 3;
                        var13 *= var14;
                        var13 &= 7;
                        if (var13 != 0) {
                            var27 |= 1925505372;
                            var27 &= -1357458581;
                            var27 *= 1128318547;
                            var27 += -13201936;
                            var27 ^= 1730767033;
                            break;
                        }

                        var27 += -1988727459;
                        var27 *= -954209415;
                        var27 ^= -315872780;
                        double var145 = var89.nextDouble(30.0, 85.0);
                        float[] var15 = this.xm;
                        var15[var113] = var97;
                        var15 = this.WW;
                        var15[var113] = var106;
                        var15 = this.jZ;
                        double var16 = Math.cos(var117);
                        var16 *= var145;
                        float var166 = (float)var16;
                        var15[var113] = var166;
                        var15 = this.xe;
                        double var118 = Math.sin(var117);
                        double var119 = var118 * var145;
                        float var120 = (float)var119;
                        var15[var113] = var120;
                        float[] var121 = this.b;
                        var121[var113] = 0.0F;
                        float[] var122 = this.YY;
                        double var12 = var89.nextDouble(1.0, 1.7);
                        float var128 = (float)var12;
                        var122[var113] = var128;
                        float[] var123 = this.Of;
                        var12 = var89.nextDouble(2.2, 3.8);
                        float var130 = (float)var12;
                        var123[var113] = var130;
                        float[] var124 = this.AF;
                        var12 = var89.nextDouble((float) (Math.PI * 2));
                        float var132 = (float)var12;
                        var124[var113] = var132;
                        float[] var125 = this.HA;
                        var12 = var89.nextDouble(2.0, 6.0);
                        byte var154 = (byte)(var89.nextBoolean() ? 1 : 0);
                        if (var154 != 0) {
                            var27 <<= 20;
                            var27 ^= 641691551;
                            var154 = 1;
                            var27 &= 1290310125;
                            var27 |= 1341816388;
                            var27 |= -1105605029;
                            var27 ^= 1686252572;
                        } else {
                            var27 -= -228084019;
                            var27 ^= 1619743887;
                            var154 = -1;
                            var27 ^= 2083720427;
                            var27 >>= 16;
                            var27 += 82096329;
                            var27 ^= -1658604697;
                            var27 ^= 46090399;
                        }

                        Integer var160 = var4;
                        if (var160 == null) {
                            break label126;
                        }

                        double var156 = var154;
                        var12 *= var156;
                        float var135 = (float)var12;
                        var125[var113] = var135;
                        float[] var126 = this.Zb;
                        float var136 = var89.nextFloat();
                        Integer var146 = var5;
                        if (var146 == null) {
                            var27 |= -419805758;
                            var27 |= -370595365;
                            var27 ^= 618846617;
                            break;
                        }
                        var27 = switch (var27) {
                            case -1686514749 -> {
                                var27 *= 1658614959;
                                var27 += 1347694417;
                                var27 += -268624918;
                                var27 += 763814624;
                                yield var27 ^ -1107355957;
                            }
                            default -> var27 ^ 956367673;
                            case 2069497768 -> var27 ^ 205110850;
                        };
                        var146 = var4;
                        if (var146 == null) {
                            break label126;
                        }

                        var126[var113] = var136;
                        byte[] var127 = this.o;
                        SpriteShape[] var137 = p;
                        int var138 = var137.length;
                        int var139 = var89.nextInt(var138);
                        byte var140 = (byte)var139;
                        var127[var113] = var140;
                        int var114 = var9 + 1;
                        var9 = var114;
                        switch (var27) {
                            case -1366945910:
                                var27 ^= -1454193296;
                                break;
                            case -322968344:
                            default:
                                var27 ^= -615937875;
                                break;
                            case 911694499:
                                var27 *= -1990046225;
                                var27 ^= 5568415;
                        }
                    }
                }
            }

            long var148 = var4;
            long var161 = var148 + 1L;
            var161 = var148 * var161;
            long var17 = var148 + 2L;
            var161 *= var17;
            var148 += 3L;
            var161 *= var148;
            var148 = var161 & 7L;
            long var169;
            int var151 = (var169 = var148 - 0L) == 0L ? 0 : (var169 < 0L ? -1 : 1);
            if (var151 == 0) {
                IllegalArgumentException var152 = new IllegalArgumentException();
                throw var152;
            }
        }

        IllegalArgumentException var86 = new IllegalArgumentException();
        throw var86;
    }

    private void rx(Canvas var1, float var2, int var3) {
        int var5 = System.identityHashCode(this);
        float var6 = -2.4F * var2;
        double var143 = var6;
        double var144 = Math.exp(var143);
        int var8 = var5 + 1;
        var8 = var5 * var8;
        int var9 = var5 + 2;
        var8 *= var9;
        var9 = var5 + 3;
        var8 *= var9;
        var8 &= 7;
        if (var8 != 0) {
            int var134 = var3 << 13;
            var134 &= -1448515894;
            var134 |= -457929495;
            var134 ^= -978422232;
        } else {
            label174: {
                int var4 = var3 << 12;
                var4 ^= -1159196078;
                var4 &= 973112928;
                var4 ^= -454549246;
                long var154 = var4;
                long var10 = var154 + 1L;
                var10 = var154 * var10;
                long var155 = var10 & 1L;
                long var319;
                var8 = (var319 = var155 - 0L) == 0L ? 0 : (var319 < 0L ? -1 : 1);
                if (var8 == 0) {
                    var6 = (float)var144;
                    var6 = var6;
                    var1.save();
                    var1.additive(1.0F);
                    int var7 = 0;
                    var7 = var7;
                    var4 += 69085879;
                    var4 ^= -728460371;

                    while (true) {
                        var8 = var4 + 1;
                        var8 = var4 * var8;
                        var9 = var4 + 2;
                        var8 *= var9;
                        var9 = var4 + 3;
                        var8 *= var9;
                        var8 &= 7;
                        if (var8 != 0) {
                            break;
                        }

                        if (var7 >= 64) {
                            var4 ^= -1212638209;
                            var4 >>= 6;
                            var4 ^= -323397872;
                            var4 ^= 1100797550;
                            long var139 = var4;
                            long var148 = var139 + 1L;
                            long var149 = var139 * var148;
                            long var140 = var149 & 1L;
                            long var320;
                            var5 = (var320 = var140 - 0L) == 0L ? 0 : (var320 < 0L ? -1 : 1);
                            if (var5 == 0) {
                                var1.restore();
                                return;
                            }
                            break;
                        }

                        var4 >>>= 25;
                        var4 -= 77029661;
                        var4 -= -1116986793;
                        var4 ^= -463408765;
                        long var162 = var4;
                        var10 = var162 + 1L;
                        var10 = var162 * var10;
                        long var12 = var162 + 2L;
                        var10 *= var12;
                        long var163 = var162 + 3L;
                        var10 *= var163;
                        long var164 = var10 & 7L;
                        long var321;
                        var8 = (var321 = var164 - 0L) == 0L ? 0 : (var321 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break;
                        }

                        float[] var166 = this.YY;
                        float var167 = var166[var7];
                        Integer var203 = var5;
                        if (var203 == null) {
                            var4 ^= 1514929771;
                            var4 ^= -1413174873;
                            break label174;
                        }

                        var4 |= 453244631;
                        var4 ^= 1908643743;
                        var4 ^= 2105613602;
                        long var204 = var4;
                        long var11 = var204 + 1L;
                        var11 = var204 * var11;
                        long var13 = var204 + 2L;
                        var11 *= var13;
                        long var205 = var204 + 3L;
                        var11 *= var205;
                        long var206 = var11 & 7L;
                        long var322;
                        int var207 = (var322 = var206 - 0L) == 0L ? 0 : (var322 < 0L ? -1 : 1);
                        if (var207 != 0) {
                            break;
                        }

                        float var323;
                        var8 = (var323 = var167 - 0.0F) == 0.0F ? 0 : (var323 < 0.0F ? -1 : 1);
                        if (var8 <= 0) {
                            var4 >>= 15;
                            var4 -= -409108285;
                            var4 += 1763253643;
                            var4 ^= -1391433326;
                            long var169 = var4;
                            var10 = var169 + 1L;
                            var10 = var169 * var10;
                            long var170 = var10 & 1L;
                            long var324;
                            var8 = (var324 = var170 - 0L) == 0L ? 0 : (var324 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                break;
                            }

                            var4 += -1780342449;
                            var4 += 1058073466;
                            var4 |= 254169298;
                            var4 -= 529964406;
                            var4 ^= -698361470;
                        } else {
                            var4 -= 1734109268;
                            var4 >>= 25;
                            var4 ^= 1835983496;
                            float[] var172 = this.b;
                            float var208 = var172[var7];
                            float var209 = var208 + var2;
                            var172[var7] = var209;
                            float[] var173 = this.b;
                            float var174 = var173[var7];
                            float[] var210 = this.YY;
                            float var211 = var210[var7];
                            float var325;
                            var8 = (var325 = var174 - var211) == 0.0F ? 0 : (var325 < 0.0F ? -1 : 1);
                            Integer var212 = var5;
                            if (var212 == null) {
                                var4 >>>= 31;
                                var4 &= 1694044761;
                                var4 <<= 23;
                                var4 ^= 672389825;
                                break label174;
                            }

                            var4 |= 1465274507;
                            var4 &= -262571706;
                            var4 ^= -1139120658;
                            int var213 = var4 + 1;
                            var213 = var4 * var213;
                            var213 &= 1;
                            if (var213 != 0) {
                                break;
                            }

                            if (var8 >= 0) {
                                var4 ^= 1742089321;
                                var4 ^= -1703795382;
                                var4 *= -574705247;
                                var4 ^= -1110989145;
                                Integer var176 = var4;
                                if (var176 == null) {
                                    break;
                                }

                                float[] var177 = this.YY;
                                Integer var216 = var5;
                                if (var216 == null) {
                                    var4 ^= 2088993708;
                                    var4 &= -368767319;
                                    var4 &= 1938556154;
                                    var4 -= -1598407971;
                                    var4 ^= -1219092606;
                                    break label174;
                                }

                                var4 <<= 31;
                                var4 |= 1236662679;
                                var4 >>= 20;
                                var4 ^= 1347474707;
                                var177[var7] = 0.0F;
                                var4 ^= -328035189;
                                var4 |= -1438036339;
                                var4 &= 1250142181;
                                var4 -= -1764041658;
                                var4 ^= 1250961112;
                            } else {
                                var4 ^= 729547498;
                                var4 &= -1639863015;
                                var4 ^= -1482924602;
                                long var178 = var4;
                                var10 = var178 + 1L;
                                var10 = var178 * var10;
                                var12 = var178 + 2L;
                                var10 *= var12;
                                long var179 = var178 + 3L;
                                var10 *= var179;
                                long var180 = var10 & 7L;
                                long var326;
                                var8 = (var326 = var180 - 0L) == 0L ? 0 : (var326 < 0L ? -1 : 1);
                                if (var8 != 0) {
                                    break;
                                }

                                float[] var182 = this.jZ;
                                float var217 = var182[var7];
                                float var218 = var217 * var6;
                                var182[var7] = var218;
                                float[] var183 = this.xe;
                                float[] var219 = this.xe;
                                float var220 = var219[var7];
                                float var221 = var220 * var6;
                                float var251 = 14.0F * var2;
                                float var222 = var221 + var251;
                                var183[var7] = var222;
                                float[] var184 = this.xm;
                                float var223 = var184[var7];
                                float[] var252 = this.jZ;
                                float var253 = var252[var7];
                                float var254 = var253 * var2;
                                float var224 = var223 + var254;
                                var184[var7] = var224;
                                float[] var185 = this.WW;
                                float var225 = var185[var7];
                                float[] var255 = this.xe;
                                float var256 = var255[var7];
                                float var257 = var256 * var2;
                                float var226 = var225 + var257;
                                Integer var258 = var5;
                                if (var258 == null) {
                                    switch (var4) {
                                        case -1353070692:
                                        default:
                                            var4 ^= -1464235950;
                                            break label174;
                                        case -303689654:
                                            var4 ^= 55391938;
                                            break label174;
                                        case 563894470:
                                            var4 &= -1551443381;
                                            var4 ^= -536400008;
                                            var4 ^= -376394245;
                                            break label174;
                                    }
                                }

                                var4 -= 1546784859;
                                var4 += -577197123;
                                var4 |= -491768755;
                                var4 >>>= 15;
                                var4 ^= 1229537651;
                                int var259 = var4 + 1;
                                int var260 = var4 * var259;
                                int var279 = var4 + 2;
                                int var261 = var260 * var279;
                                int var280 = var4 + 3;
                                int var262 = var261 * var280;
                                int var263 = var262 & 7;
                                if (var263 != 0) {
                                    break;
                                }

                                var185[var7] = var226;
                                float[] var186 = this.AF;
                                float var227 = var186[var7];
                                float[] var264 = this.HA;
                                float var265 = var264[var7];
                                float var266 = var265 * var2;
                                float var228 = var227 + var266;
                                var186[var7] = var228;
                                float[] var187 = this.b;
                                float var188 = var187[var7];
                                float var189 = var188 / 0.05F;
                                float var190 = TP.S(var189);
                                float[] var229 = this.b;
                                float var230 = var229[var7];
                                float[] var267 = this.YY;
                                float var268 = var267[var7];
                                float var231 = var230 / var268;
                                float var232 = 1.0F - var231;
                                float var191 = var190 * var232;
                                var213 = this.Lr;
                                int var269 = this.Y;
                                float[] var281 = this.Zb;
                                float var282 = var281[var7];
                                var213 = DP.Bp(var213, var269, var282);
                                var8 = DP.Y(var213, var191);
                                var213 = var8 | 16777215;
                                var213 = DP.Z(var8, var213, 0.14F);
                                SpriteShape[] var270 = p;
                                byte[] var283 = this.o;
                                byte var284 = var283[var7];
                                SpriteShape var271 = var270[var284];
                                float[] var285 = this.Of;
                                float var286 = var285[var7];
                                float[] var289 = this.b;
                                float var290 = var289[var7];
                                float var291 = var290 / 0.15F;
                                float var292 = TP.S(var291);
                                float var293 = 0.4F * var292;
                                float var294 = 0.6F + var293;
                                float var287 = var286 * var294;
                                var1.save();
                                float[] var295 = this.xm;
                                float var296 = var295[var7];
                                float[] var307 = this.WW;
                                float var308 = var307[var7];
                                var1.translate(var296, var308);
                                float[] var297 = this.AF;
                                float var298 = var297[var7];
                                var1.rotate(var298);
                                SpriteShape var299 = SpriteShape.GLOW;
                                if (var271 == var299) {
                                    var4 |= -322562702;
                                    var4 &= -1671181328;
                                    var4 |= 174198535;
                                    var4 <<= 30;
                                    var4 ^= 796841821;
                                    int var300 = var4 + 1;
                                    int var301 = var4 * var300;
                                    int var309 = var4 + 2;
                                    int var302 = var301 * var309;
                                    int var310 = var4 + 3;
                                    int var303 = var302 * var310;
                                    int var304 = var303 & 7;
                                    if (var304 != 0) {
                                        break;
                                    }

                                    float var305 = var287 * 0.4F;
                                    float var311 = var287 * 1.4F;
                                    int var14 = var5 + 1;
                                    var14 = var5 * var14;
                                    int var15 = var5 + 2;
                                    var14 *= var15;
                                    var15 = var5 + 3;
                                    var14 *= var15;
                                    var14 &= 7;
                                    if (var14 != 0) {
                                        switch (var4) {
                                            case -276900003:
                                                var4 ^= -145114538;
                                                var4 ^= -686007400;
                                                var4 ^= 1421038747;
                                                var4 ^= -719628418;
                                                var4 ^= 1719726007;
                                                break label174;
                                            case -194069391:
                                            default:
                                                var4 ^= -1082553772;
                                                break label174;
                                            case 386033179:
                                                var4 ^= 1960097318;
                                                break label174;
                                        }
                                    }

                                    var4 += -1573034312;
                                    var4 += 230491105;
                                    var4 ^= -462543601;
                                    var4 -= 2139575492;
                                    var4 ^= 1651709774;
                                    Integer var317 = var4;
                                    if (var317 == null) {
                                        break;
                                    }

                                    var1.sprite(var271, 0.0F, 0.0F, var305, var311, var213, var8, 0.0F);
                                    var4 <<= 18;
                                    var4 |= -602940254;
                                    var4 <<= 20;
                                    var4 ^= 1537759907;
                                } else {
                                    var4 -= -1389631598;
                                    var4 *= -1790898491;
                                    var4 *= 16898737;
                                    var4 += -717484778;
                                    var4 ^= 832701921;
                                    float var306 = var287 * 0.8F;
                                    Integer var312 = var5;
                                    if (var312 == null) {
                                        var4 += 73320620;
                                        var4 -= -1685562328;
                                        var4 |= 720545544;
                                        var4 ^= 116159950;
                                        break label174;
                                    }

                                    var4 >>= 29;
                                    var4 -= 1803194015;
                                    var4 *= -1383790835;
                                    var4 ^= 21013755;
                                    var4 ^= 66623013;
                                    var1.sprite(var271, 0.0F, 0.0F, var287, var306, var213, var8, 0.0F);
                                    var4 *= -2089686051;
                                    var4 >>>= 31;
                                    var4 *= 1012760467;
                                    var4 ^= -1378540240;
                                }

                                long var193 = var4;
                                var10 = var193 + 1L;
                                var10 = var193 * var10;
                                long var194 = var10 & 1L;
                                long var327;
                                var8 = (var327 = var194 - 0L) == 0L ? 0 : (var327 < 0L ? -1 : 1);
                                if (var8 != 0) {
                                    break;
                                }

                                var1.restore();
                                switch (var4) {
                                    case -1853334877:
                                        var4 *= -6042139;
                                        var4 ^= 1273927464;
                                        break;
                                    case 1798738194:
                                    default:
                                        var4 ^= -908208769;
                                        break;
                                    case 1823217677:
                                        var4 ^= 978035929;
                                }
                            }
                        }

                        long var196 = var4;
                        var10 = var196 + 1L;
                        var10 = var196 * var10;
                        long var197 = var10 & 1L;
                        long var328;
                        var8 = (var328 = var197 - 0L) == 0L ? 0 : (var328 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break;
                        }

                        var8 = var7 + 1;
                        var207 = var5 + 1;
                        var207 = var5 * var207;
                        var207 &= 1;
                        if (var207 != 0) {
                            var4 |= 1270599740;
                            var4 &= -1289382164;
                            var4 -= 1796461764;
                            var4 &= 666240359;
                            var4 ^= 672652001;
                            break label174;
                        }
                        var4 = switch (var4) {
                            case -1285150476 -> var4 ^ -1398087916;
                            case 968363495 -> {
                                var4 ^= -1329195550;
                                var4 ^= -1012608132;
                                var4 -= 1498997096;
                                yield var4 ^ 675671447;
                            }
                            default -> var4 ^ -951573310;
                        };
                        var7 = var8;
                        var4 *= 1995069135;
                        var4 &= 469299355;
                        var4 &= -953420876;
                        var4 ^= 93474372;
                    }
                }

                UnsupportedOperationException var142 = new UnsupportedOperationException();
                throw var142;
            }
        }

        IllegalStateException var138 = new IllegalStateException();
        throw var138;
    }

    private void t(int var1) {
        int var3 = System.identityHashCode(this);
        this.Ib = 0.0F;
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 != 0) {
            switch (var1) {
                case 305871328:
                    int var18 = var1 ^ 763066505;
                    break;
                case 596204745:
                    int var13 = var1 + -1215323314;
                    var13 ^= -304112881;
                    var13 *= -1841617823;
                    var13 += -168996569;
                    var13 ^= -1861899543;
                    break;
                case 669825478:
                default:
                    int var12 = var1 ^ -1516298079;
            }

            IllegalStateException var20 = new IllegalStateException();
            throw var20;
        } else {
            Integer var7 = switch (var1) {
                case 596204745 -> {
                    int var5 = var1 | 1564424032;
                    var5 >>>= 13;
                    yield var5 ^ -372742144;
                }
                case 1239892972 -> var1 ^ 303908716;
                default -> var1 ^ 1656650670;
            };
            if (var7 == null) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                LivingEntity var8 = this.rv;
                Text var9 = var8.getName();
                String var10 = var9.getString();
                this.q = var10;
            }
        }
    }

    private void X(LivingEntity var1, int var2) {
        float var103 = 0.0F;
        label117: {
            int var4 = System.identityHashCode(this);
            this.ym = 0.0F;
            int var5 = i_2.bW(var1);
            Integer var6 = var4;
            int var3;
            if (var6 == null) {
                switch (var2) {
                    case -892321918:
                    default:
                        var3 = var2 ^ -1261024278;
                        break;
                    case 459787288:
                        var3 = var2 - -42026920;
                        var3 |= 133804902;
                        var3 &= 1072969194;
                        var3 ^= -1085249648;
                        break;
                    case 946520960:
                        var3 = var2 ^ 732647925;
                }
            } else {
                var3 = var2 - -250915823;
                var3 |= -1333642268;
                var3 ^= -1919044814;
                var3 >>>= 13;
                var3 ^= -463444557;
                int var109 = var3 + 1;
                var109 = var3 * var109;
                var109 &= 1;
                if (var109 != 0) {
                    break label117;
                }

                this.rt = var5;
                var5 = this.rt;
                if (var5 <= 0) {
                    var3 >>= 24;
                    var3 |= 475034753;
                    var3 ^= 1698101302;
                    var5 = var3 + 1;
                    var5 = var3 * var5;
                    var109 = var3 + 2;
                    var5 *= var109;
                    var109 = var3 + 3;
                    var5 *= var109;
                    var5 &= 7;
                    if (var5 == 0) {
                        return;
                    }
                    break label117;
                }

                var3 &= -1506234529;
                var3 += -1950248442;
                var3 ^= 867637559;
                Ud var86 = Ud.Z();
                AuraRenderer var87 = var86.ZP();
                var109 = this.rt;
                int[] var7 = this.qb;
                var87.textureSize(var109, var7);
                int[] var88 = this.qb;
                var5 = var88[1];
                long var113 = var4;
                long var8 = var113 + 1L;
                var8 = var113 * var8;
                long var114 = var8 & 1L;
                long var143;
                var109 = (var143 = var114 - 0L) == 0L ? 0 : (var143 < 0L ? -1 : 1);
                if (var109 != 0) {
                    var3 += 460217958;
                    var3 >>>= 29;
                    var3 *= -859118635;
                    var3 ^= 1818932647;
                } else {
                    label128: {
                        label121: {
                            var3 -= -301874349;
                            var3 >>= 8;
                            var3 -= 540919812;
                            var3 ^= -1906817334;
                            if (var5 > 0) {
                                var3 += -1035624860;
                                var3 -= 2033902055;
                                var3 >>>= 5;
                                var3 ^= 650024480;
                                var5 = var3 + 1;
                                var5 = var3 * var5;
                                var109 = var3 + 2;
                                var5 *= var109;
                                var109 = var3 + 3;
                                var5 *= var109;
                                var5 &= 7;
                                if (var5 != 0) {
                                    break label117;
                                }

                                int[] var95 = this.qb;
                                var5 = var95[0];
                                Integer var118 = var4;
                                if (var118 == null) {
                                    switch (var3) {
                                        case 493871027:
                                            var3 ^= -954865379;
                                            break label128;
                                        case 577440369:
                                            var3 <<= 1;
                                            var3 |= 612103285;
                                            var3 -= 1322684258;
                                            var3 ^= -1232522265;
                                            break label128;
                                        case 890660637:
                                        default:
                                            var3 ^= -992975894;
                                            break label128;
                                    }
                                }
                                var3 = switch (var3) {
                                    case 577440369 -> {
                                        var3 <<= 14;
                                        var3 *= -1384920769;
                                        var3 ^= 591190405;
                                        yield var3 ^ 587509590;
                                    }
                                    default -> var3 ^ 1684528901;
                                    case 1651131979 -> var3 ^ 942002053;
                                };
                                var118 = var3;
                                if (var118 == null) {
                                    break label117;
                                }

                                if (var5 > 0) {
                                    var3 -= -938443689;
                                    var3 ^= 964497283;
                                    var3 |= -1739051883;
                                    var3 |= -320478994;
                                    var3 ^= -190303783;
                                    Integer var97 = var3;
                                    if (var97 == null) {
                                        break label117;
                                    }

                                    int[] var98 = this.qb;
                                    int var99 = var98[1];
                                    float var100 = var99;
                                    float var101 = 64.0F * var100;
                                    long var120 = var4;
                                    var8 = var120 + 1L;
                                    var8 = var120 * var8;
                                    long var121 = var8 & 1L;
                                    long var144;
                                    int var122 = (var144 = var121 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                                    if (var122 != 0) {
                                        switch (var3) {
                                            case -426570031:
                                                var3 ^= -1973052520;
                                                break label128;
                                            case 190303270:
                                                var3 |= -1363906672;
                                                var3 >>= 4;
                                                var3 ^= 1516185737;
                                                break label128;
                                            case 410187179:
                                            default:
                                                var3 ^= 1541856154;
                                                break label128;
                                        }
                                    }
                                    var3 = switch (var3) {
                                        case -480834577 -> var3 ^ 146826802;
                                        case 190303270 -> {
                                            var3 -= 837418063;
                                            yield var3 ^ 997970119;
                                        }
                                        default -> var3 ^ -1567519573;
                                    };
                                    int[] var123 = this.qb;
                                    var122 = var123[0];
                                    float var125 = var122;
                                    float var102 = var101 / var125;
                                    var103 = var102;
                                    var3 |= 1292565815;
                                    var3 -= -440529654;
                                    var3 ^= -2137011662;
                                    var3 *= -2009763481;
                                    var3 ^= -1062929723;
                                    break label121;
                                }

                                var3 &= -1112012332;
                                var3 <<= 26;
                                var3 *= -113419819;
                                var3 -= -1274392641;
                                var3 ^= 1801540235;
                            } else {
                                var3 |= 771185147;
                                var3 -= -55988784;
                                var3 &= 713905549;
                                var3 ^= -527371581;
                            }

                            var109 = var3 + 1;
                            var109 = var3 * var109;
                            var109 &= 1;
                            if (var109 != 0) {
                                break label117;
                            }

                            var103 = 64.0F;
                            var3 <<= 22;
                            var3 -= 694721556;
                            var3 ^= -841040684;
                            var3 ^= -947034492;
                        }

                        long var129 = var3;
                        var8 = var129 + 1L;
                        var8 = var129 * var8;
                        long var10 = var129 + 2L;
                        var8 *= var10;
                        long var130 = var129 + 3L;
                        var8 *= var130;
                        long var131 = var8 & 7L;
                        long var145;
                        var109 = (var145 = var131 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                        if (var109 != 0) {
                            break label117;
                        }

                        float var133 = 8.0F / var103;
                        this.LR = var133;
                        Integer var78 = var4;
                        if (var78 != null) {
                            var3 |= -2057885124;
                            var3 *= 137165347;
                            var3 &= -1472033199;
                            var3 ^= 1809676643;
                            int var83 = var3 + 1;
                            var83 = var3 * var83;
                            var3 = var83 & 1;
                            if (var3 == 0) {
                                float var73 = 16.0F / var103;
                                this.au = var73;
                                return;
                            }
                            break label117;
                        }

                        var3 ^= 421996677;
                        var3 *= 1373679701;
                        var3 ^= 1902522783;
                    }
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 == 0) {
                RuntimeException var82 = new RuntimeException();
                throw var82;
            }
        }

        RuntimeException var77 = new RuntimeException();
        throw var77;
    }

    private static void c(StringBuilder var0, float var1, int var2) {
        int var4 = System.identityHashCode(var0);
        float var5 = var1 * 10.0F;
        int var30 = Math.round(var5);
        int var31 = Math.max(0, var30);
        Integer var22 = var4;
        if (var22 == null) {
            long var6 = switch (var2) {
                case -1996236915 -> var2 ^ 295424454;
                case -377689082 -> {
                    int var10 = var2 & 1912398948;
                    var10 >>= 21;
                    var10 &= 468968361;
                    yield var10 ^ 1431542209;
                }
                default -> var2 ^ -818011322;
            };
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var35;
            int var23 = (var35 = var6 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var23 == 0) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            int var13 = var2 - 2132047084;
            var13 ^= -1245093831;
            int var25 = var13 + 1;
            var25 = var13 * var25;
            int var33 = var13 + 2;
            var25 *= var33;
            var13 += 3;
            var25 *= var13;
            var13 = var25 & 7;
            if (var13 == 0) {
                var13 = var31 / 10;
                StringBuilder var19 = var0.append(var13);
                StringBuilder var20 = var19.append(',');
                var25 = var31 % 10;
                StringBuilder var21 = var20.append(var25);
                return;
            }
        }

        IllegalStateException var17 = new IllegalStateException();
        throw var17;
    }

    private static float O(LivingEntity var0, int var1) {
        int var3 = System.identityHashCode(var0);
        float var4 = var0.getHealth();
        float var5 = var0.getMaxHealth();
        Integer var18 = var3;
        if (var18 != null) {
            int var15 = var1 | -1469509086;
            var15 -= 534826651;
            var15 ^= -660246725;
            float var19 = Math.max(1.0F, var5);
            float var20 = var4 / var19;
            return TP.S(var20);
        } else {
            int var2 = var1 << 17;
            var2 ^= 1588315022;
            long var9 = var2;
            long var21 = var9 + 1L;
            long var22 = var9 * var21;
            long var6 = var9 + 2L;
            long var23 = var22 * var6;
            long var10 = var9 + 3L;
            long var24 = var23 * var10;
            long var11 = var24 & 7L;
            long var25;
            var2 = (var25 = var11 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var2 != 0) {
                AssertionError var14 = new AssertionError();
                throw var14;
            } else {
                AssertionError var13 = new AssertionError();
                throw var13;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1466061175;
        int var2 = tR_2.qG;
        int var4 = of_2.kj(var3, var1, var2);
        QL = var4;
        SpriteShape[] var5 = new SpriteShape[3];
        SpriteShape var19 = SpriteShape.STAR;
        var5[0] = var19;
        SpriteShape var20 = SpriteShape.HEART;
        var5[1] = var20;
        SpriteShape var21 = SpriteShape.GLOW;
        var5[2] = var21;
        p = var5;
        TextStyle var6 = TextStyle.of(9.5F, -1);
        TextStyle var7 = var6.semibold();
        i = var7;
        TextStyle var8 = TextStyle.of(8.0F, -1);
        TextStyle var9 = var8.semibold();
        JD = var9;
        TextStyle var10 = TextStyle.of(7.0F, -1);
        TextStyle var11 = var10.medium();
        D = var11;
        TextStyle var12 = TextStyle.of(7.0F, -1);
        TextStyle var13 = var12.medium();
        TextStyle var14 = var13.tabular();
        h = var14;
        TextStyle var15 = h;
        TextStyle var16 = var15.color(-1850997);
        Kz = var16;
        TextStyle var17 = TextStyle.of(5.8F, -1);
        TextStyle var18 = var17.medium();
        hA = var18;
    }
}
