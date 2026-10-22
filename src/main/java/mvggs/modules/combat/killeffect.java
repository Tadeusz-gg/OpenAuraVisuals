package mvggs.modules.combat;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.SpriteShape;
import dev.skidware.visuals.render.fx.ScreenEffects;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public final class killeffect extends Yn {
    private static final SpriteShape[] EJ;
    private static final int jO = 5;
    private static final int m = 33;
    private static final int MI = 3;
    private static final int T = 9;
    private final r_2 A;
    private final JL D;
    private final Uq RN;
    private final JL o;
    private final Uq L;
    private final Uq ma;
    private final JL s;
    private final JL b;
    private final Uq d;
    private final JL UB;
    private final Uq y;
    private final Uq J;
    private final zS M;
    private final mN w;
    private final oL z;
    private final double[] JI;
    private final double[] E;
    private final double[] cb;
    private final double[][] AP;
    private final double[][] Ji;
    private final double[][] AM;
    private float W;
    private float X;
    private float t;
    private float hz;
    private float ZS;
    private float oy;
    private float I;
    private int G;
    private double mC;
    private double Om;
    private double f;
    private double xV;
    private Object Ex;
    public static final int j;

    public killeffect() {
        super("kill_effect", "Kill Effect", AJ.COMBAT);
        AJ var1 = AJ.COMBAT;

        ws var2 = ws.LIGHT;
        r_2 var4 = new r_2("style", "Style", var2);
        xB var5 = var4.q("Sahur replays a player's skin without equipment, then knocks it away with a bat. Mob kills use Light.");
        r_2 var6 = (r_2)var5;
        xB var7 = this.vn(var6);
        r_2 var8 = (r_2)var7;
        this.A = var8;
        JL var9 = new JL("bonk", "Bat Sound", true);
        BooleanSupplier var72 = () -> {
            int var1x = j;
            var1x ^= -669510743;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.A;
            int var4x = var2x + 1;
            var4x = var2x * var4x;
            var2x = var4x & 1;
            if (var2x != 0) {
                var1x &= -1156159608;
                var1x += -961621562;
                var1x ^= -796864052;
                Integer var16x = var1x;
                if (var16x != null) {
                    IllegalStateException var18x = new IllegalStateException();
                    throw var18x;
                } else {
                    RuntimeException var17x = new RuntimeException();
                    throw var17x;
                }
            } else {
                var1x &= 1274126444;
                var1x >>= 19;
                var1x ^= 1740624473;
                var1x |= 656611392;
                var1x ^= 2104965254;
                ws var11x = ws.SAHUR;
                return var3x.TJ(var11x);
            }
        };
        xB var10 = var9.Pt(var72);
        JL var11 = (JL)var10;
        xB var12 = this.vn(var11);
        JL var13 = (JL)var12;
        this.D = var13;
        Uq var14 = new Uq("bonk_volume", "Bat Volume", 0.8F, 0.0F, 1.0F);
        Uq var15 = var14.W(0.05F);
        BooleanSupplier var73 = () -> {
            int var1x = j;
            var1x ^= 387959805;
            int var2x = System.identityHashCode(this);
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            var3x &= 1;
            if (var3x != 0) {
                var1x *= -219061485;
                var1x >>= 20;
                var1x >>>= 25;
                var1x ^= 1900982445;
                var1x ^= 1365336991;
            } else {
                label68: {
                    var1x -= -347429758;
                    var1x <<= 9;
                    var1x |= -1045953582;
                    var1x ^= -1634034675;
                    long var56x = var1x;
                    long var5x = var56x + 1L;
                    var5x = var56x * var5x;
                    long var7x = var56x + 2L;
                    var5x *= var7x;
                    long var57x = var56x + 3L;
                    var5x *= var57x;
                    long var58x = var5x & 7L;
                    long var84;
                    var3x = (var84 = var58x - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                    label50:
                    if (var3x == 0) {
                        r_2 var60x = this.A;
                        ws var4x = ws.SAHUR;
                        int var61x = (var60x.TJ(var4x)) ? 1 : 0;
                        if (var61x != 0) {
                            var1x = switch (var1x) {
                                default -> var1x ^ 1646927874;
                                case 821333569 -> var1x ^ -282498349;
                                case 1433715679 -> {
                                    var1x ^= -805382740;
                                    yield var1x ^ 770820373;
                                }
                            };
                            long var62x = var1x;
                            var5x = var62x + 1L;
                            var5x = var62x * var5x;
                            var7x = var62x + 2L;
                            var5x *= var7x;
                            long var63x = var62x + 3L;
                            var5x *= var63x;
                            long var64x = var5x & 7L;
                            long var85;
                            var61x = (var85 = var64x - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                            if (var61x != 0) {
                                break label50;
                            }

                            JL var66x = this.D;
                            boolean var67x = var66x.vb();
                            long var68x = var2x;
                            long var6x = var68x + 1L;
                            var6x = var68x * var6x;
                            long var69x = var6x & 1L;
                            long var86;
                            var2x = (var86 = var69x - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                            if (var2x != 0) {
                                var1x &= -864694519;
                                var1x ^= -1537336243;
                                break label68;
                            }

                            var1x >>>= 28;
                            var1x *= -280427849;
                            var1x *= 82921067;
                            var1x += 1872069629;
                            var1x ^= -1366366916;
                            if (var67x) {
                                var1x <<= 10;
                                var1x |= -220007758;
                                var1x &= 1306774728;
                                var1x |= -2046963194;
                                var1x ^= 1874095882;
                                long var48x = var1x;
                                long var70x = var48x + 1L;
                                long var71x = var48x * var70x;
                                var6x = var48x + 2L;
                                long var72x = var71x * var6x;
                                long var49x = var48x + 3L;
                                long var73x = var72x * var49x;
                                long var50x = var73x & 7L;
                                long var87;
                                var2x = (var87 = var50x - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                                if (var2x != 0) {
                                    break label50;
                                }

                                boolean var52x = true;
                                var1x &= 1426914414;
                                var1x += 1879657689;
                                var1x ^= 1373414525;
                                return var52x;
                            }

                            var1x &= 120426607;
                            var1x += -1755945986;
                            var1x |= -663959842;
                            var1x ^= 783345303;
                        } else {
                            var1x *= -1491108773;
                            var1x ^= -793992180;
                        }

                        boolean var88 = false;
                        switch (var1x) {
                            case -499526879:
                            default:
                                var1x ^= 9844557;
                                break;
                            case -254934967:
                                var1x -= 1487085452;
                                var1x &= 1084399673;
                                var1x ^= 569117857;
                                break;
                            case 684141460:
                                var1x ^= 1258495490;
                        }

                        return var88;
                    }

                    UnsupportedOperationException var53x = new UnsupportedOperationException();
                    throw var53x;
                }
            }

            IllegalArgumentException var46x = new IllegalArgumentException();
            throw var46x;
        };
        xB var16 = var15.Pt(var73);
        Uq var17 = (Uq)var16;
        xB var18 = this.vn(var17);
        Uq var19 = (Uq)var18;
        this.RN = var19;
        JL var20 = new JL("particles", "Particles", true);
        xB var21 = this.vn(var20);
        JL var22 = (JL)var21;
        this.o = var22;
        Uq var23 = new Uq("duration", "Duration", 4.0F, 2.0F, 8.0F);
        Uq var24 = var23.W(0.25F);
        Uq var25 = var24.L("s");
        xB var26 = this.vn(var25);
        Uq var27 = (Uq)var26;
        this.L = var27;
        Uq var28 = new Uq("amount", "Amount", 30.0F, 8.0F, 70.0F);
        Uq var29 = var28.W(1.0F);
        JL var74 = this.o;
        Object var3 = Objects.requireNonNull(var74);
        BooleanSupplier var75 = var74::vb;
        xB var30 = var29.Pt(var75);
        Uq var31 = (Uq)var30;
        xB var32 = this.vn(var31);
        Uq var33 = (Uq)var32;
        this.ma = var33;
        JL var34 = new JL("lightning", "Lightning", true);
        xB var35 = this.vn(var34);
        JL var36 = (JL)var35;
        this.s = var36;
        JL var37 = new JL("thunder", "Thunder Sound", false);
        xB var38 = this.vn(var37);
        JL var39 = (JL)var38;
        this.b = var39;
        Uq var40 = new Uq("thunder_volume", "Thunder Volume", 0.8F, 0.0F, 1.0F);
        Uq var41 = var40.W(0.05F);
        JL var76 = this.b;
        var3 = Objects.requireNonNull(var76);
        BooleanSupplier var77 = var76::vb;
        xB var42 = var41.Pt(var77);
        Uq var43 = (Uq)var42;
        xB var44 = this.vn(var43);
        Uq var45 = (Uq)var44;
        this.d = var45;
        JL var46 = new JL("shockwave", "Shockwave", true);
        xB var47 = this.vn(var46);
        JL var48 = (JL)var47;
        this.UB = var48;
        Uq var49 = new Uq("flash", "Screen Flash", 0.0F, 0.0F, 0.3F);
        Uq var50 = var49.W(0.02F);
        xB var51 = this.vn(var50);
        Uq var52 = (Uq)var51;
        this.y = var52;
        Uq var53 = new Uq("glow", "Glow", 0.7F, 0.0F, 1.0F);
        Uq var54 = var53.W(0.05F);
        xB var55 = this.vn(var54);
        Uq var56 = (Uq)var55;
        this.J = var56;
        zS var57 = new zS();
        nM var58 = this.bU(var57);
        zS var59 = (zS)var58;
        this.M = var59;
        mN var60 = new mN(256);
        this.w = var60;
        oL var61 = new oL();
        this.z = var61;
        double[] var62 = new double[33];
        this.JI = var62;
        double[] var63 = new double[33];
        this.E = var63;
        double[] var64 = new double[33];
        this.cb = var64;
        double[][] var65 = new double[3][9];
        this.AP = var65;
        double[][] var66 = new double[3][9];
        this.Ji = var66;
        double[][] var67 = new double[3][9];
        this.AM = var67;
        this.W = Float.MAX_VALUE;
        this.X = Float.MAX_VALUE;
        this.t = Float.MAX_VALUE;
        this.hz = 4.0F;
        this.I = Float.MAX_VALUE;
        this.G = -1;
        this.dy("Light and lightning, or Tung Tung Tung Sahur knocking your defeated opponent away with a bat.");
        this.fJ(true);
        r_2 var68 = this.A;
        Runnable var78 = this::J;
        var68.k(var78);
        wD<I> var69 = this::S;
        this.iI(I.class, var69);
        wD<p_2> var70 = (p_2 var1x) -> {
            int var2x = j;
            var2x ^= 488849832;
            int var3x = System.identityHashCode(this);
            FrameContext var4x = var1x.frame();
            float var152 = var4x.dt();
            r_2 var5x = this.A;
            ws var6x = ws.SAHUR;
            int var7x = var3x + 1;
            var7x = var3x * var7x;
            int var8x = var3x + 2;
            var7x *= var8x;
            var8x = var3x + 3;
            var7x *= var8x;
            var7x &= 7;
            if (var7x != 0) {
                var2x >>>= 10;
                var2x ^= -1010574727;
                var2x ^= -239060352;
            } else {
                label210: {
                    label203: {
                        var2x |= -971653480;
                        var2x ^= 642338435;
                        var2x ^= -248146874;
                        boolean var177 = var5x.TJ(var6x);
                        if (var177) {
                            var2x -= -1331879004;
                            var2x += -163208432;
                            var2x *= 1726325399;
                            var2x ^= 988670398;
                            Integer var178 = var2x;
                            if (var178 == null) {
                                break label203;
                            }

                            oL var179 = this.z;
                            int var217 = var3x + 1;
                            int var218 = var3x * var217;
                            var7x = var3x + 2;
                            int var219 = var218 * var7x;
                            var7x = var3x + 3;
                            int var220 = var219 * var7x;
                            int var221 = var220 & 7;
                            if (var221 != 0) {
                                var2x ^= -205020375;
                                var2x += -821868671;
                                var2x ^= -1602087236;
                                break label210;
                            }

                            var2x -= 853922208;
                            var2x &= -518499638;
                            var2x |= -1084717755;
                            var2x >>= 12;
                            var2x ^= -404152716;
                            long var222 = var2x;
                            long var287 = var222 + 1L;
                            long var288 = var222 * var287;
                            long var223 = var288 & 1L;
                            long var299;
                            int var224 = (var299 = var223 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                            if (var224 != 0) {
                                break label203;
                            }

                            var179.AO();
                            switch (var2x) {
                                case -532701549:
                                    var2x ^= -1016200208;
                                    break;
                                case 404155385:
                                    var2x ^= -898322077;
                                    var2x &= -1387363102;
                                    var2x ^= -797762731;
                                    var2x *= 2062127555;
                                    var2x ^= -1596352501;
                                    break;
                                case 1266869903:
                                default:
                                    var2x ^= 2131966004;
                            }
                        } else {
                            var2x -= 1167839250;
                            var2x ^= -28838167;
                        }

                        oL var180 = this.z;
                        JL var225 = this.D;
                        boolean var226 = var225.vb();
                        Uq var265 = this.RN;
                        float var266 = var265.WM();
                        var8x = var3x + 1;
                        var8x = var3x * var8x;
                        var8x &= 1;
                        if (var8x != 0) {
                            var2x -= -168898038;
                            var2x ^= 774492733;
                            break label210;
                        }

                        var2x ^= -1237929498;
                        var2x -= 2128534702;
                        var2x ^= 1587502548;
                        var2x ^= -2027219841;
                        var2x ^= 1896567665;
                        var180.mZ(var152, var226, var266);
                        float var181 = this.W;
                        float var182 = var181 + var152;
                        this.W = var182;
                        float var183 = this.X;
                        float var184 = var183 + var152;
                        this.X = var184;
                        float var185 = this.t;
                        float var153 = var185 + var152;
                        this.t = var153;
                        JL var154 = this.o;
                        boolean var155 = var154.vb();
                        if (var155) {
                            var2x = switch (var2x) {
                                case -1913983072 -> {
                                    var2x &= 1731051436;
                                    var2x -= 1479635276;
                                    var2x *= -934659583;
                                    yield var2x ^ 1161618134;
                                }
                                default -> var2x ^ -924457473;
                                case 1877102002 -> var2x ^ 1115732200;
                            };
                            float var156 = this.t;
                            float var186 = this.hz;
                            float var187 = var186 * 0.18F;
                            int var227 = var3x + 1;
                            int var228 = var3x * var227;
                            var7x = var3x + 2;
                            int var229 = var228 * var7x;
                            var7x = var3x + 3;
                            int var230 = var229 * var7x;
                            int var231 = var230 & 7;
                            if (var231 != 0) {
                                switch (var2x) {
                                    case 274900098:
                                        var2x |= -839752745;
                                        var2x -= -104028170;
                                        var2x ^= -702776296;
                                        break label210;
                                    case 801761979:
                                    default:
                                        var2x ^= 1900281573;
                                        break label210;
                                    case 1433408081:
                                        var2x ^= 1887088724;
                                        break label210;
                                }
                            }
                            var2x = switch (var2x) {
                                default -> var2x ^ -1197930215;
                                case 133549975 -> var2x ^ 1448667022;
                                case 274900098 -> {
                                    var2x >>>= 21;
                                    var2x <<= 23;
                                    var2x *= 1532779045;
                                    var2x *= 1345623901;
                                    yield var2x ^ 136085926;
                                }
                            };
                            Integer var232 = var2x;
                            if (var232 == null) {
                                break label203;
                            }

                            float var300;
                            int var157 = (var300 = var156 - var187) == 0.0F ? 0 : (var300 < 0.0F ? -1 : 1);
                            if (var157 < 0) {
                                var2x -= 1115977505;
                                var2x *= -572032971;
                                var2x ^= 1314404253;

                                while (true) {
                                    float var158 = this.I;
                                    float var188 = this.hz;
                                    int var233 = var3x + 1;
                                    int var234 = var3x * var233;
                                    var7x = var3x + 2;
                                    int var235 = var234 * var7x;
                                    var7x = var3x + 3;
                                    int var236 = var235 * var7x;
                                    int var237 = var236 & 7;
                                    if (var237 != 0) {
                                        var2x ^= -1566269166;
                                        var2x >>>= 1;
                                        var2x >>= 18;
                                        var2x *= -721362269;
                                        var2x ^= 611326239;
                                        break label210;
                                    }

                                    var2x *= 1788303035;
                                    var2x ^= 768714676;
                                    int var238 = var2x + 1;
                                    int var239 = var2x * var238;
                                    var7x = var2x + 2;
                                    int var240 = var239 * var7x;
                                    var7x = var2x + 3;
                                    int var241 = var240 * var7x;
                                    int var242 = var241 & 7;
                                    if (var242 != 0) {
                                        break label203;
                                    }

                                    float var189 = var188 * 0.18F;
                                    float var301;
                                    int var159 = (var301 = var158 - var189) == 0.0F ? 0 : (var301 < 0.0F ? -1 : 1);
                                    if (var159 <= 0) {
                                        var2x ^= 1808042783;
                                        var2x *= 778736583;
                                        var2x *= -941291879;
                                        var2x ^= 1318784355;
                                        long var160 = var2x;
                                        long var243 = var160 + 1L;
                                        long var244 = var160 * var243;
                                        long var161 = var244 & 1L;
                                        long var302;
                                        int var162 = (var302 = var161 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                                        if (var162 != 0) {
                                            break label203;
                                        }

                                        float var163 = this.t;
                                        Integer var190 = var3x;
                                        if (var190 == null) {
                                            var2x ^= -2104766677;
                                            var2x ^= -644169240;
                                            break label210;
                                        }

                                        var2x &= -864176937;
                                        var2x ^= -977365342;
                                        long var191 = var2x;
                                        long var273 = var191 + 1L;
                                        long var274 = var191 * var273;
                                        long var192 = var274 & 1L;
                                        long var303;
                                        int var193 = (var303 = var192 - 0L) == 0L ? 0 : (var303 < 0L ? -1 : 1);
                                        if (var193 != 0) {
                                            break label203;
                                        }

                                        float var194 = this.I;
                                        float var304;
                                        int var164 = (var304 = var163 - var194) == 0.0F ? 0 : (var304 < 0.0F ? -1 : 1);
                                        if (var164 >= 0) {
                                            var2x = switch (var2x) {
                                                case -1919446352 -> {
                                                    var2x *= 1007785479;
                                                    var2x += -1626542213;
                                                    var2x ^= 665758751;
                                                    yield var2x ^ 873245980;
                                                }
                                                default -> var2x ^ -2134681613;
                                                case 634636356 -> var2x ^ 939962243;
                                            };
                                            int var165 = var2x + 1;
                                            int var166 = var2x * var165;
                                            int var195 = var2x + 2;
                                            int var167 = var166 * var195;
                                            int var196 = var2x + 3;
                                            int var168 = var167 * var196;
                                            int var169 = var168 & 7;
                                            if (var169 != 0) {
                                                break label203;
                                            }

                                            double var170 = this.xV;
                                            Uq var245 = this.ma;
                                            int var246 = var245.B();
                                            long var275 = var3x;
                                            long var9x = var275 + 1L;
                                            var9x = var275 * var9x;
                                            long var276 = var9x & 1L;
                                            long var305;
                                            var7x = (var305 = var276 - 0L) == 0L ? 0 : (var305 < 0L ? -1 : 1);
                                            if (var7x != 0) {
                                                switch (var2x) {
                                                    case 803691710:
                                                        var2x ^= -126884312;
                                                        break label210;
                                                    case 1403595405:
                                                    default:
                                                        var2x ^= 877922641;
                                                        break label210;
                                                    case 1484198728:
                                                        var2x *= 614193583;
                                                        var2x += 879365092;
                                                        var2x -= 1859615949;
                                                        var2x ^= -925727050;
                                                        break label210;
                                                }
                                            }

                                            var2x -= -1395620070;
                                            var2x |= 2100186795;
                                            var2x ^= -1679850711;
                                            var2x += 809892413;
                                            var2x ^= -1839926337;
                                            var7x = var2x + 1;
                                            var7x = var2x * var7x;
                                            var7x &= 1;
                                            if (var7x != 0) {
                                                break label203;
                                            }

                                            int var247 = var246 / 10;
                                            int var248 = Math.max(1, var247);
                                            var7x = var2x & -506597592;
                                            var7x -= 1982148910;
                                            var7x ^= 1592109944;
                                            this.PB(var170, var248, var7x);
                                            float var171 = this.I;
                                            float var197 = this.hz;
                                            float var198 = var197 * 0.04F;
                                            float var172 = var171 + var198;
                                            this.I = var172;
                                            var2x >>>= 24;
                                            var2x |= 1127228527;
                                            var2x &= 1881423414;
                                            var2x ^= -822840953;
                                            var2x ^= 1130882997;
                                            continue;
                                        }

                                        var2x |= 26107129;
                                        var2x ^= 1272262552;
                                        break;
                                    }

                                    var2x *= -68546279;
                                    var2x += 1790287494;
                                    var2x <<= 29;
                                    var2x *= -2000711953;
                                    var2x ^= -2041908895;
                                    break;
                                }
                            } else {
                                var2x |= -1526697414;
                                var2x ^= 601227999;
                            }
                        } else {
                            var2x &= 1426871144;
                            var2x *= -1109851199;
                            var2x ^= -1402402239;
                        }

                        Integer var173 = var2x;
                        if (var173 != null) {
                            Uq var174 = this.y;
                            float var175 = var174.WM();
                            long var199 = var3x;
                            long var284 = var199 + 1L;
                            long var285 = var199 * var284;
                            long var200 = var285 & 1L;
                            long var306;
                            int var201 = (var306 = var200 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
                            if (var201 != 0) {
                                switch (var2x) {
                                    case -968167071:
                                        var2x -= -1705252914;
                                        var2x >>>= 11;
                                        var2x += -1127702065;
                                        var2x &= 1729973149;
                                        var2x ^= 372656233;
                                        break label210;
                                    case -175933734:
                                    default:
                                        var2x ^= -643245081;
                                        break label210;
                                    case 836915949:
                                        var2x ^= 1836002133;
                                        break label210;
                                }
                            }

                            var2x |= 1794087542;
                            var2x += 2052073983;
                            var2x &= -1235476;
                            var2x ^= -993475992;
                            int var202 = var2x + 1;
                            int var203 = var2x * var202;
                            int var249 = var2x + 2;
                            int var204 = var203 * var249;
                            int var250 = var2x + 3;
                            int var205 = var204 * var250;
                            int var206 = var205 & 7;
                            label156:
                            if (var206 == 0) {
                                float var307;
                                int var207 = (var307 = var175 - 0.0F) == 0.0F ? 0 : (var307 < 0.0F ? -1 : 1);
                                if (var207 > 0) {
                                    var2x *= 1584487007;
                                    var2x |= 605259639;
                                    var2x -= -587435577;
                                    var2x ^= 256112495;
                                    float var208 = this.t;
                                    float var308;
                                    int var209 = (var308 = var208 - 0.35F) == 0.0F ? 0 : (var308 < 0.0F ? -1 : 1);
                                    long var251 = var3x;
                                    long var292 = var251 + 1L;
                                    long var293 = var251 * var292;
                                    long var252 = var293 & 1L;
                                    long var309;
                                    int var253 = (var309 = var252 - 0L) == 0L ? 0 : (var309 < 0L ? -1 : 1);
                                    if (var253 != 0) {
                                        var2x &= 118746905;
                                        var2x >>>= 16;
                                        var2x ^= 842680041;
                                        break label210;
                                    }

                                    var2x *= -2072465709;
                                    var2x ^= -1224542094;
                                    if (var209 < 0) {
                                        var2x &= -1998654702;
                                        var2x *= -451575691;
                                        var2x -= 1406932069;
                                        var2x -= 683835728;
                                        var2x ^= 1124549223;
                                        int var210 = var2x + 1;
                                        int var211 = var2x * var210;
                                        int var212 = var211 & 1;
                                        if (var212 != 0) {
                                            break label156;
                                        }

                                        Ud var213 = Ud.Z();
                                        int var254 = var3x + 1;
                                        int var255 = var3x * var254;
                                        var3x = var255 & 1;
                                        if (var3x != 0) {
                                            var2x -= 1104779207;
                                            var2x |= -257778671;
                                            var2x ^= -1042939934;
                                            break label210;
                                        }

                                        var2x ^= 665647061;
                                        var2x &= 874084767;
                                        var2x <<= 16;
                                        var2x ^= -800650584;
                                        long var256 = var2x;
                                        long var294 = var256 + 1L;
                                        long var295 = var256 * var294;
                                        long var10x = var256 + 2L;
                                        long var296 = var295 * var10x;
                                        long var257 = var256 + 3L;
                                        long var297 = var296 * var257;
                                        long var258 = var297 & 7L;
                                        long var310;
                                        var3x = (var310 = var258 - 0L) == 0L ? 0 : (var310 < 0L ? -1 : 1);
                                        if (var3x != 0) {
                                            break label156;
                                        }

                                        AuraRenderer var149 = var213.ZP();
                                        ScreenEffects var150 = var149.screenEffects();
                                        float var214 = this.t;
                                        float var215 = var214 / 0.35F;
                                        float var216 = 1.0F - var215;
                                        float var176 = var175 * var216;
                                        var150.flash(var176, -854017);
                                        var2x &= 1310337371;
                                        var2x ^= -883551511;
                                    } else {
                                        switch (var2x) {
                                            case 91539391:
                                                var2x *= -833134151;
                                                var2x ^= 1337631462;
                                                break;
                                            case 935612157:
                                            default:
                                                var2x ^= 660329647;
                                                break;
                                            case 1685263785:
                                                var2x ^= 371186838;
                                        }
                                    }
                                } else {
                                    var2x &= 2035302333;
                                    var2x += -1805488814;
                                    var2x ^= 941983544;
                                    var2x ^= 234948999;
                                }

                                return;
                            }
                        }
                    }

                    IllegalStateException var151 = new IllegalStateException();
                    throw var151;
                }
            }

            UnsupportedOperationException var146 = new UnsupportedOperationException();
            throw var146;
        };
        this.iI(p_2.class, var70);
        wD<T> var71 = this::ZL;
        this.iI(T.class, var71);
    }

    @Override
    protected void J() {
        int var1 = j;
        var1 ^= -1718167044;
        int var2 = System.identityHashCode(this);
        oL var3 = this.z;
        var3.U();
        mN var34 = this.w;
        var34.wW();
        this.X = Float.MAX_VALUE;
        this.W = Float.MAX_VALUE;
        long var28 = var2;
        long var4 = var28 + 1L;
        var4 = var28 * var4;
        long var29 = var4 & 1L;
        long var42;
        var2 = (var42 = var29 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
        int var35 = of_2.qA;
        var1 ^= var35;
        var1 ^= -477106862;
        of_2.qA = -477106862;
        int var36 = of_2.m;
        var1 ^= var36;
        var1 ^= -1389865651;
        of_2.m = -1389865651;
        if (var2 == 0) {
            var1 |= -531834984;
            var1 >>= 25;
            var1 &= 1746939682;
            var1 *= 90844235;
            var1 ^= 1267479991;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                this.I = Float.MAX_VALUE;
                this.t = Float.MAX_VALUE;
                this.Ex = null;
                return;
            }
        } else {
            long var22 = switch (var1) {
                default -> var1 ^ 1042669402;
                case 663300282 -> var1 ^ -1709568063;
                case 1647942064 -> {
                    var1 |= 500634388;
                    var1 += 1909283587;
                    var1 |= 605492489;
                    var1 += -1284043799;
                    yield var1 ^ -2048162548;
                }
            };
            long var37 = var22 + 1L;
            long var38 = var22 * var37;
            long var5 = var22 + 2L;
            long var39 = var38 * var5;
            long var23 = var22 + 3L;
            long var40 = var39 * var23;
            long var24 = var40 & 7L;
            long var43;
            var1 = (var43 = var24 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var27 = new AssertionError();
                throw var27;
            }
        }

        AssertionError var26 = new AssertionError();
        throw var26;
    }

    private void S(I var1) {
        label271: {
            int var2 = j;
            var2 ^= -206446310;
            int var3 = System.identityHashCode(this);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 != 0) {
                switch (var2) {
                    case 136225110:
                        var2 ^= 1220978478;
                        var2 *= -1077337477;
                        var2 ^= -1004104164;
                        break;
                    case 509888938:
                    default:
                        var2 ^= -861907145;
                        break;
                    case 2117274422:
                        var2 ^= 322095410;
                }
            } else {
                label269: {
                    var2 >>= 27;
                    var2 ^= -667162306;
                    LivingEntity var173 = var1.victim();
        Object var5 = (r_2)this.Ex;
                    if (var5 != null) {
                        var2 += 544083381;
                        var2 |= 2108272534;
                        var2 ^= 553474849;
                        int var219 = var2 + 1;
                        int var220 = var2 * var219;
                        int var221 = var220 & 1;
                        if (var221 != 0) {
                            break label271;
                        }

                        var5 = this.Ex;
                        long var6 = var3;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var343;
                        int var259 = (var343 = var6 - 0L) == 0L ? 0 : (var343 < 0L ? -1 : 1);
                        if (var259 != 0) {
                            var2 += 1657903122;
                            var2 >>>= 13;
                            var2 ^= -1325687675;
                            break label269;
                        }

                        var2 <<= 5;
                        var2 *= -19505787;
                        var2 *= 1634342547;
                        var2 ^= 572137305;
                        Integer var260 = var2;
                        if (var260 == null) {
                            break label271;
                        }

                        World var261 = var173.getEntityWorld();
                        if ((Object)var5 != var261) {
                            var2 |= -1137810157;
                            var2 ^= -763703584;
                            var5 = var2;
                            if (var5 == null) {
                                break label271;
                            }

                            this.J();
                            switch (var2) {
                                case -1968180788:
                                    var2 ^= 1847695695;
                                    break;
                                case 802466203:
                                    var2 |= -1713431912;
                                    var2 ^= -455558092;
                                    break;
                                case 1023788484:
                                default:
                                    var2 ^= -432519412;
                            }
                        } else {
                            var2 &= -350853407;
                            var2 &= -792107166;
                            var2 ^= 453460431;
                        }
                    } else {
                        var2 &= 1978229929;
                        var2 ^= -1895032273;
                        var2 &= 840271037;
                        var2 ^= 1224869803;
                    }

                    var5 = var173.getEntityWorld();
                    this.Ex = var5;
                    var5 = var3;
                    label263:
                    if (var5 != null) {
                        var2 += 1129779627;
                        var2 &= 1076333677;
                        var2 &= -1241069384;
                        var2 <<= 21;
                        var2 ^= 2129668822;
                        var5 = this.A;
                        ws var262 = ws.SAHUR;
        boolean var227 = ((r_2)var5).TJ(var262);
                        if (var227) {
                            var2 |= -1247858443;
                            var2 |= -415399756;
                            var2 ^= -563693686;
                            int var228 = var2 + 1;
                            int var229 = var2 * var228;
                            int var230 = var229 & 1;
                            if (var230 != 0) {
                                break label271;
                            }

                            oL var231 = this.z;
                            long var263 = var3;
                            long var326 = var263 + 1L;
                            var326 = var263 * var326;
                            long var264 = var326 & 1L;
                            long var344;
                            int var265 = (var344 = var264 - 0L) == 0L ? 0 : (var344 < 0L ? -1 : 1);
                            if (var265 != 0) {
                                var2 *= -720219399;
                                var2 ^= 386118945;
                                break label263;
                            }

                            var2 += 1508072966;
                            var2 *= 1913642925;
                            var2 += 1228274302;
                            var2 ^= -1453574575;
                            int var266 = var2 + 1;
                            int var267 = var2 * var266;
                            int var7 = var2 + 2;
                            int var268 = var267 * var7;
                            var7 = var2 + 3;
                            int var269 = var268 * var7;
                            int var270 = var269 & 7;
                            if (var270 != 0) {
                                break label271;
                            }

                            Uq var271 = this.L;
                            float var272 = var271.WM();
                            boolean var232 = var231.SZ(var173, var272);
                            if (var232) {
                                var2 += 1517174261;
                                var2 &= 219024135;
                                var2 ^= 920871515;
                                return;
                            }

                            var2 += -1779185570;
                            var2 |= 1618099527;
                            var2 >>= 9;
                            var2 ^= 1913807443;
                        } else {
                            var2 |= 142530636;
                            var2 &= -1683099437;
                            var2 *= -2027712877;
                            var2 ^= -243966469;
                        }

                        Integer var233 = var2;
                        if (var233 == null) {
                            break label271;
                        }

                        double var234 = var173.getX();
                        this.mC = var234;
                        double var235 = var173.getY();
                        this.Om = var235;
                        double var236 = var173.getZ();
                        this.f = var236;
                        double var237 = this.Om;
                        float var174 = var173.getHeight();
                        int var300 = var3 + 1;
                        var300 = var3 * var300;
                        int var328 = var3 + 2;
                        var300 *= var328;
                        var328 = var3 + 3;
                        var300 *= var328;
                        var300 &= 7;
                        label255:
                        if (var300 == 0) {
                            var2 >>= 31;
                            var2 ^= -1895849425;
                            long var305 = var2;
                            long var9 = var305 + 1L;
                            var9 = var305 * var9;
                            long var11 = var305 + 2L;
                            var9 *= var11;
                            long var306 = var305 + 3L;
                            var9 *= var306;
                            long var307 = var9 & 7L;
                            long var345;
                            var300 = (var345 = var307 - 0L) == 0L ? 0 : (var345 < 0L ? -1 : 1);
                            if (var300 != 0) {
                                break label271;
                            }

                            double var309 = var174;
                            double var310 = var309 * 0.5;
                            double var175 = var237 + var310;
                            this.xV = var175;
                            this.t = 0.0F;
                            Uq var176 = this.L;
                            float var177 = var176.WM();
                            this.hz = var177;
                            float var178 = this.hz;
                            float var179 = var178 * 0.4F;
                            this.ZS = var179;
                            float var180 = this.hz;
                            float var181 = var180 * 0.55F;
                            this.oy = var181;
                            JL var182 = this.o;
                            int var183 = (var182.vb()) ? 1 : 0;
                            float var186;
                            if (var183 != 0) {
                                var2 = switch (var2) {
                                    case 447682106 -> var2 ^ -1579947146;
                                    case 1895849424 -> {
                                        var2 -= -1501678958;
                                        var2 += -1779871982;
                                        var2 ^= -1219708404;
                                        var2 ^= -741009494;
                                        yield var2 ^ -1447319740;
                                    }
                                    default -> var2 ^ -961200972;
                                };
                                float var184 = this.hz;
                                float var185 = var184 * 0.04F;
                                Integer var238 = var3;
                                if (var238 == null) {
                                    var2 ^= 34893704;
                                    var2 ^= 530875022;
                                    break label255;
                                }

                                var2 ^= -582916911;
                                var2 += 1632100031;
                                var2 ^= -832317163;
                                long var239 = var2;
                                long var311 = var239 + 1L;
                                long var312 = var239 * var311;
                                long var240 = var312 & 1L;
                                long var346;
                                int var241 = (var346 = var240 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                                if (var241 != 0) {
                                    break label271;
                                }

                                var186 = var185;
                                var2 ^= 1766539397;
                                var2 <<= 8;
                                var2 ^= -1348807419;
                            } else {
                                var2 ^= -1405866091;
                                var2 += -458472064;
                                var2 ^= 1555622092;
                                var186 = Float.MAX_VALUE;
                                var2 &= -191587203;
                                var2 >>>= 14;
                                var2 ^= -923650235;
                            }

                            this.I = var186;
                            var183 = var3 + 1;
                            var183 = var3 * var183;
                            var183 &= 1;
                            label247:
                            if (var183 == 0) {
                                var2 += -1103289323;
                                var2 &= -1753615584;
                                var2 &= 1788357635;
                                var2 |= 1686121892;
                                var2 ^= -2026850275;
                                var183 = var2 + 1;
                                var183 = var2 * var183;
                                var183 &= 1;
                                if (var183 != 0) {
                                    break label271;
                                }

                                JL var193 = this.o;
                                int var194 = (var193.vb()) ? 1 : 0;
                                if (var194 != 0) {
                                    var2 += -1009005209;
                                    var2 += -1105546520;
                                    var2 += 800441627;
                                    var2 ^= 1875060841;
                                    var194 = var2 + 1;
                                    var194 = var2 * var194;
                                    var194 &= 1;
                                    if (var194 != 0) {
                                        break label271;
                                    }

                                    double var198 = this.xV;
                                    long var273 = var3;
                                    long var330 = var273 + 1L;
                                    long var331 = var273 * var330;
                                    long var274 = var331 & 1L;
                                    long var347;
                                    int var275 = (var347 = var274 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
                                    if (var275 != 0) {
                                        var2 ^= -754886883;
                                        var2 |= -1313447944;
                                        var2 &= -1235212546;
                                        var2 ^= 114932554;
                                        break label247;
                                    }

                                    var2 |= -132572718;
                                    var2 &= 1887873212;
                                    var2 ^= -444027379;
                                    Uq var276 = this.ma;
                                    int var277 = var276.B();
                                    var300 = var2 ^ 692725369;
                                    var300 ^= 1748892014;
                                    this.PB(var198, var277, var300);
                                    var2 -= -1711018929;
                                    var2 *= 1719921227;
                                    var2 ^= -308429711;
                                } else {
                                    var2 *= -1421108893;
                                    var2 ^= -62495368;
                                }

                                Integer var199 = var2;
                                if (var199 == null) {
                                    break label271;
                                }

                                JL var200 = this.b;
                                int var242 = var3 + 1;
                                int var243 = var3 * var242;
                                int var278 = var3 + 2;
                                int var244 = var243 * var278;
                                int var279 = var3 + 3;
                                int var245 = var244 * var279;
                                int var246 = var245 & 7;
                                if (var246 != 0) {
                                    switch (var2) {
                                        case -1096565607:
                                        default:
                                            var2 ^= 1156536946;
                                            break;
                                        case -262794509:
                                            var2 >>= 18;
                                            var2 &= -2056868069;
                                            var2 ^= 899625381;
                                            break;
                                        case 1328665618:
                                            var2 ^= 923883357;
                                    }
                                } else {
                                    label280: {
                                        var2 *= 245518645;
                                        var2 ^= 731414414;
                                        boolean var201 = var200.vb();
                                        if (var201) {
                                            var2 = switch (var2) {
                                                default -> var2 ^ -1928383397;
                                                case 599442810 -> var2 ^ -1482925087;
                                                case 1846456513 -> {
                                                    var2 *= -62547945;
                                                    var2 &= -267758615;
                                                    var2 |= 751341832;
                                                    var2 |= -1501975613;
                                                    yield var2 ^ 1100111472;
                                                }
                                            };
                                            long var202 = var2;
                                            long var280 = var202 + 1L;
                                            long var281 = var202 * var280;
                                            long var332 = var202 + 2L;
                                            long var282 = var281 * var332;
                                            long var203 = var202 + 3L;
                                            long var283 = var282 * var203;
                                            long var204 = var283 & 7L;
                                            long var348;
                                            int var205 = (var348 = var204 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                                            if (var205 != 0) {
                                                break label271;
                                            }

                                            Uq var206 = this.d;
                                            float var207 = var206.WM();
                                            HP var247 = HP.Aa();
                                            long var284 = var3;
                                            long var333 = var284 + 1L;
                                            long var334 = var284 * var333;
                                            long var10 = var284 + 2L;
                                            long var335 = var334 * var10;
                                            long var285 = var284 + 3L;
                                            long var336 = var335 * var285;
                                            long var286 = var336 & 7L;
                                            long var349;
                                            int var287 = (var349 = var286 - 0L) == 0L ? 0 : (var349 < 0L ? -1 : 1);
                                            if (var287 != 0) {
                                                switch (var2) {
                                                    case -9722437:
                                                        var2 *= -1877866611;
                                                        var2 &= -558256316;
                                                        var2 >>>= 7;
                                                        var2 *= -1446309377;
                                                        var2 ^= 1924530700;
                                                        break label280;
                                                    case 83255980:
                                                        var2 ^= -1158743836;
                                                        break label280;
                                                    case 935315069:
                                                    default:
                                                        var2 ^= -329591555;
                                                        break label280;
                                                }
                                            }

                                            var2 &= 929802705;
                                            var2 &= -612292598;
                                            var2 += 369811547;
                                            var2 ^= -597865975;
                                            var2 ^= -1456753942;
                                            int var288 = var2 + 1;
                                            int var289 = var2 * var288;
                                            var300 = var2 + 2;
                                            int var290 = var289 * var300;
                                            var300 = var2 + 3;
                                            int var291 = var290 * var300;
                                            int var292 = var291 & 7;
                                            if (var292 != 0) {
                                                break label271;
                                            }

                                            i_2.zf("minecraft:entity.lightning_bolt.thunder", var207, 1.0F, var247);
                                            switch (var2) {
                                                case -615420367:
                                                    var2 ^= -1980652894;
                                                    break;
                                                case 1551562936:
                                                    var2 >>>= 22;
                                                    var2 -= 1516684263;
                                                    var2 ^= -920897577;
                                                    break;
                                                case 1635775177:
                                                default:
                                                    var2 ^= 164231531;
                                            }
                                        } else {
                                            switch (var2) {
                                                case -1071216710:
                                                default:
                                                    var2 ^= 875878926;
                                                    break;
                                                case 1633258681:
                                                    var2 ^= -425832727;
                                                    break;
                                                case 1846456513:
                                                    var2 ^= -1123414546;
                                                    var2 ^= -1082017934;
                                            }
                                        }

                                        long var208 = var2;
                                        long var293 = var208 + 1L;
                                        long var294 = var208 * var293;
                                        long var337 = var208 + 2L;
                                        long var295 = var294 * var337;
                                        long var209 = var208 + 3L;
                                        long var296 = var295 * var209;
                                        long var210 = var296 & 7L;
                                        long var350;
                                        int var211 = (var350 = var210 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                                        if (var211 != 0) {
                                            break label271;
                                        }

                                        JL var212 = this.s;
                                        int var213 = (var212.vb()) ? 1 : 0;
                                        long var248 = var3;
                                        long var317 = var248 + 1L;
                                        long var318 = var248 * var317;
                                        var9 = var248 + 2L;
                                        long var319 = var318 * var9;
                                        long var249 = var248 + 3L;
                                        long var320 = var319 * var249;
                                        long var250 = var320 & 7L;
                                        long var351;
                                        int var251 = (var351 = var250 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                                        if (var251 != 0) {
                                            switch (var2) {
                                                case -696236677:
                                                    var2 ^= 624061567;
                                                    break;
                                                case 1447032340:
                                                default:
                                                    var2 ^= 55403439;
                                                    break;
                                                case 1820658269:
                                                    var2 -= -1687145043;
                                                    var2 ^= 1642940676;
                                            }
                                        } else {
                                            label282: {
                                                var2 >>= 4;
                                                var2 &= -1987994812;
                                                var2 >>= 16;
                                                var2 += 1299230287;
                                                var2 ^= -1298578737;
                                                long var252 = var2;
                                                long var321 = var252 + 1L;
                                                long var322 = var252 * var321;
                                                var9 = var252 + 2L;
                                                long var323 = var322 * var9;
                                                long var253 = var252 + 3L;
                                                long var324 = var323 * var253;
                                                long var254 = var324 & 7L;
                                                long var352;
                                                int var255 = (var352 = var254 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                                                if (var255 != 0) {
                                                    break label271;
                                                }

                                                if (var213 != 0) {
                                                    var2 -= 481069996;
                                                    var2 *= 372090969;
                                                    var2 ^= 297666920;
                                                    long var214 = var2;
                                                    long var297 = var214 + 1L;
                                                    long var298 = var214 * var297;
                                                    long var215 = var298 & 1L;
                                                    long var353;
                                                    var213 = (var353 = var215 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                                                    if (var213 != 0) {
                                                        break label271;
                                                    }

                                                    this.W = 0.0F;
                                                    Integer var217 = var3;
                                                    if (var217 == null) {
                                                        var2 |= -1207440043;
                                                        var2 <<= 29;
                                                        var2 ^= 985092171;
                                                        var2 ^= 709807615;
                                                        break label282;
                                                    }

                                                    var2 |= 1901077352;
                                                    var2 >>= 30;
                                                    var2 ^= -1854493887;
                                                    this.G = -1;
                                                    var2 <<= 1;
                                                    var2 <<= 24;
                                                    var2 ^= 1868778863;
                                                } else {
                                                    var2 &= -2041147024;
                                                    var2 ^= 1763954031;
                                                }

                                                JL var218 = this.UB;
                                                int var256 = var3 + 1;
                                                int var257 = var3 * var256;
                                                var3 = var257 & 1;
                                                if (var3 == 0) {
                                                    var2 -= -472151863;
                                                    var2 |= 2029513664;
                                                    var2 <<= 1;
                                                    var2 ^= 116932156;
                                                    boolean var169 = var218.vb();
                                                    if (var169) {
                                                        var2 = switch (var2) {
                                                            case -632282114 -> var2 ^ 297266133;
                                                            case -250093072 -> {
                                                                var2 *= -1250737801;
                                                                var2 -= 1332103065;
                                                                yield var2 ^ -1270867544;
                                                            }
                                                            default -> var2 ^ -941411444;
                                                        };
                                                        Integer var170 = var2;
                                                        if (var170 == null) {
                                                            break label271;
                                                        }

                                                        this.X = 0.0F;
                                                        var2 *= 616392717;
                                                        var2 &= -1980740786;
                                                        var2 += -420740884;
                                                        var2 |= -258215666;
                                                        var2 ^= 1487173556;
                                                    } else {
                                                        switch (var2) {
                                                            case -1975440535:
                                                                var2 ^= -524842187;
                                                                break;
                                                            case -250093072:
                                                                var2 <<= 27;
                                                                var2 += -113669432;
                                                                var2 ^= -568194990;
                                                                break;
                                                            case 1088505530:
                                                            default:
                                                                var2 ^= -1908211472;
                                                        }
                                                    }

                                                    return;
                                                }

                                                var2 *= 631627193;
                                                var2 ^= 484398467;
                                            }
                                        }
                                    }
                                }
                            } else {
                                var2 &= 467589491;
                                var2 -= -673562924;
                                var2 >>= 16;
                                var2 ^= -1325814462;
                            }
                        } else {
                            var2 += 787466873;
                            var2 += -250219025;
                            var2 |= -271811923;
                            var2 ^= 1594287689;
                        }
                    } else {
                        switch (var2) {
                            case 846421742:
                                var2 ^= 1079676696;
                                break;
                            case 850221535:
                            default:
                                var2 ^= -2014028858;
                                break;
                            case 1527187375:
                                var2 &= -1177202150;
                                var2 &= 1290115468;
                                var2 ^= -1191404100;
                        }
                    }
                }
            }

            Integer var165 = var2;
            if (var165 != null) {
                AssertionError var167 = new AssertionError();
                throw var167;
            }
        }

        RuntimeException var166 = new RuntimeException();
        throw var166;
    }

    public int zk() {
        int var1 = j;
        var1 ^= -404384544;
        int var2 = System.identityHashCode(this);
        mN var3 = this.w;
        Integer var13 = var2;
        if (var13 == null) {
            var1 ^= -320342074;
            var1 -= -674053433;
            var1 ^= -270714186;
            var13 = var1;
            if (var13 != null) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            }
        } else {
            var1 ^= 1752099944;
            var1 >>>= 16;
            var1 ^= 1753894957;
            Integer var11 = var1;
            if (var11 != null) {
                return var3.qi();
            }
        }

        IllegalStateException var12 = new IllegalStateException();
        throw var12;
    }

    public ws cm() {
        int var1 = j;
        var1 ^= 1560809928;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var24;
        var2 = (var24 = var19 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 >>>= 16;
            var1 |= 1115323670;
            var1 *= 1665825731;
            var1 ^= 921146073;
            r_2 var21 = this.A;
            Enum var22 = var21.A();
            return (ws)var22;
        } else {
            Integer var11 = switch (var1) {
                default -> var1 ^ -1199368300;
                case -1498984060 -> {
                    var1 &= -1836999685;
                    var1 += 406085037;
                    var1 ^= 746736374;
                    yield var1 ^ -1657091932;
                }
                case 1007673516 -> var1 ^ 1553725791;
            };
            if (var11 == null) {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            } else {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        }
    }

    public void z(ws var1) {
        int var2 = j;
        var2 ^= 275343557;
        int var3 = System.identityHashCode(this);
        Integer var14 = var3;
        if (var14 != null) {
            var2 ^= 1610947034;
            var2 &= -1512895921;
            var2 >>= 29;
            var2 -= 1913916418;
            var2 ^= -338261857;
            r_2 var15 = this.A;
            var15.UY(var1);
        } else {
            var2 -= -592626271;
            var2 &= 1442626224;
            var2 ^= 736514098;
            RuntimeException var8 = new RuntimeException();
            throw var8;
        }
    }

    public int HF() {
        int var1 = j;
        var1 ^= -1463021707;
        int var2 = System.identityHashCode(this);
        oL var3 = this.z;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 == 0) {
            var1 += -1447913915;
            var1 |= -1442057742;
            var1 ^= 1859682701;
            return var3.uq();
        } else {
            var1 += 1766394677;
            var1 ^= -767275986;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var20 = var1 + 2;
            var2 *= var20;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            } else {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            }
        }
    }

    public boolean W() {
        int var1 = j;
        var1 ^= -37043501;
        int var2 = System.identityHashCode(this);
        float var3 = this.W;
        Integer var35 = var2;
        if (var35 != null) {
            var1 = switch (var1) {
                case -1713959207 -> var1 ^ -1801868813;
                default -> var1 ^ -1635099076;
                case 107315871 -> {
                    var1 ^= -908196413;
                    var1 ^= -1304925337;
                    var1 -= 689200915;
                    yield var1 ^ 1728547408;
                }
            };
            long var4 = var1;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var64;
            int var36 = (var64 = var4 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
            label45:
            if (var36 == 0) {
                float var37 = this.ZS;
                float var65;
                var36 = (var65 = var3 - var37) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
                int var43;
                if (var36 < 0) {
                    var1 >>>= 28;
                    var1 >>= 2;
                    var1 += 1062991831;
                    var1 ^= 1316592803;
                    long var39 = var1;
                    var4 = var39 + 1L;
                    var4 = var39 * var4;
                    var6 = var39 + 2L;
                    var4 *= var6;
                    long var40 = var39 + 3L;
                    var4 *= var40;
                    long var41 = var4 & 7L;
                    long var66;
                    var43 = (var66 = var41 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                    if (var43 != 0) {
                        break label45;
                    }

                    var43 = 1;
                    var1 ^= 1368150990;
                    var1 *= 1831356705;
                    var1 &= -1043189967;
                    var1 ^= 1480037348;
                } else {
                    var1 = switch (var1) {
                        case 862455672 -> {
                            var1 += 584067757;
                            yield var1 ^ 1336547186;
                        }
                        default -> var1 ^ 1800899445;
                        case 1789354122 -> var1 ^ 973998298;
                    };
                    int var44 = var1 + 1;
                    int var45 = var1 * var44;
                    int var46 = var45 & 1;
                    if (var46 != 0) {
                        break label45;
                    }

                    var43 = 0;
                    var1 &= 530735041;
                    var1 ^= -2144886891;
                }

                int var47 = var1 + 1;
                int var48 = var1 * var47;
                int var49 = var48 & 1;
                if (var49 == 0) {
                    return (var43 != 0);
                }
            }
        } else {
            var1 -= -991820263;
            var1 &= -2004170218;
            var1 ^= 348576031;
            long var29 = var1;
            long var50 = var29 + 1L;
            long var51 = var29 * var50;
            long var5 = var29 + 2L;
            long var52 = var51 * var5;
            long var30 = var29 + 3L;
            long var53 = var52 * var30;
            long var31 = var53 & 7L;
            long var67;
            var1 = (var67 = var31 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var34 = new RuntimeException();
                throw var34;
            }
        }

        RuntimeException var33 = new RuntimeException();
        throw var33;
    }

    public boolean Ty() {
        int var1 = j;
        var1 ^= 167273944;
        int var2 = System.identityHashCode(this);
        Integer var32 = var2;
        if (var32 == null) {
            var1 *= 603715463;
            var1 ^= -1678695949;
            var32 = var1;
            if (var32 != null) {
                UnsupportedOperationException var34 = new UnsupportedOperationException();
                throw var34;
            }
        } else {
            label39: {
                var1 <<= 1;
                var1 <<= 10;
                var1 += -1625675212;
                var1 |= -226955410;
                var1 ^= 1892244477;
                float var35 = this.X;
                float var3 = this.oy;
                float var39;
                int var36 = (var39 = var35 - var3) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
                boolean var37;
                if (var36 < 0) {
                    var1 += -1593790457;
                    var1 -= -929551620;
                    var1 >>>= 18;
                    var1 ^= -331403259;
                    var37 = true;
                    switch (var1) {
                        case -1407798298:
                        default:
                            var1 ^= -1196503912;
                            break;
                        case -331405107:
                            var1 *= -1979250487;
                            var1 ^= -1985348760;
                            var1 |= 696321551;
                            var1 *= 2064427843;
                            var1 ^= 791219983;
                            break;
                        case 1301511867:
                            var1 ^= 1442481309;
                    }
                } else {
                    var1 |= -309486324;
                    var1 >>>= 3;
                    var1 ^= -1162497767;
                    var1 &= 143948591;
                    var1 ^= -482870148;
                    Integer var38 = var1;
                    if (var38 == null) {
                        break label39;
                    }

                    var37 = false;
                    switch (var1) {
                        case -1970227141:
                            var1 ^= -1418475629;
                            break;
                        case -482886060:
                            var1 *= 86096805;
                            var1 -= 318244912;
                            var1 *= 1116081067;
                            var1 += 1699032903;
                            var1 ^= 1501915089;
                            break;
                        case 728866011:
                        default:
                            var1 ^= -1234876495;
                    }
                }

                Integer var30 = var1;
                if (var30 != null) {
                    return var37;
                }
            }
        }

        AssertionError var31 = new AssertionError();
        throw var31;
    }

    private void PB(double var1, int var3, int var4) {
        label84: {
            int var6 = var3;
            int var7 = System.identityHashCode(this);
            ThreadLocalRandom var8 = ThreadLocalRandom.current();
            long var9 = var7;
            long var11 = var9 + 1L;
            var11 = var9 * var11;
            var9 = var11 & 1L;
            long var174;
            int var90 = (var174 = var9 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
            if (var90 != 0) {
                int var5 = var4 ^ 1994609286;
                var5 -= -193332145;
                var5 -= 1101013462;
                var5 *= -650357361;
                var5 ^= 1449116538;
            } else {
                int var36 = var4 | 900000709;
                var36 |= -1124825674;
                var36 += 343700713;
                var36 ^= -98213261;
                int var91 = var3 + 1;
                int var92 = var3 * var91;
                int var93 = var92 & 1;
                if (var93 != 0) {
                    break label84;
                }

                var8 = var8;
                byte var94 = 0;
                int var95 = var94;
                var36 -= -845868795;
                var36 ^= 760759209;

                label81:
                while (true) {
                    long var10 = var6;
                    long var12 = var10 + 1L;
                    var12 = var10 * var12;
                    long var14 = var10 + 2L;
                    var12 *= var14;
                    var10 += 3L;
                    var12 *= var10;
                    var10 = var12 & 7L;
                    long var175;
                    int var98 = (var175 = var10 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                    if (var98 != 0) {
                        break label84;
                    }

                    if (var95 >= var3) {
                        var36 += -351202958;
                        var36 ^= 1318687372;
                        return;
                    }

                    var36 ^= -1819064606;
                    var36 += -400367413;
                    var36 ^= -436429759;
                    var10 = var6;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var176;
                    int var101 = (var176 = var10 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                    if (var101 != 0) {
                        break label84;
                    }

                    mN var102 = this.w;
                    double var105 = this.mC;
                    double var13 = var8.nextGaussian();
                    var13 *= 0.15;
                    double var106 = var105 + var13;
                    var13 = var8.nextGaussian();
                    var13 *= 0.2;
                    var13 = var1 + var13;
                    double var15 = this.f;
                    double var17 = var8.nextGaussian();
                    var17 *= 0.15;
                    var15 += var17;
                    var17 = var8.nextDouble(-2.6, 2.6);
                    float var119 = (float)var17;
                    long var18 = var7;
                    long var20 = var18 + 1L;
                    var20 = var18 * var20;
                    long var22 = var18 + 2L;
                    var20 *= var22;
                    var18 += 3L;
                    var20 *= var18;
                    var18 = var20 & 7L;
                    long var177;
                    int var122 = (var177 = var18 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                    if (var122 != 0) {
                        var36 |= 931594956;
                        var36 |= 1428621039;
                        var36 ^= -494508268;
                        break;
                    }

                    var36 += -1185857378;
                    var36 ^= -879085283;
                    var36 *= 1602245051;
                    var36 ^= 793231022;
                    var36 ^= 1055024846;
                    double var123 = var8.nextDouble(3.5, 6.0);
                    float var124 = (float)var123;
                    double var19 = var8.nextDouble(-2.6, 2.6);
                    float var125 = (float)var19;
                    float var129 = this.hz;
                    float var21 = this.t;
                    float var130 = var129 - var21;
                    double var132 = var8.nextDouble(0.9, 1.0);
                    var21 = (float)var132;
                    float var131 = var130 * var21;
                    double var134 = var8.nextDouble(0.065, 0.105);
                    var21 = (float)var134;
                    double var136 = var8.nextDouble((float) (Math.PI * 2));
                    float var137 = (float)var136;
                    double var23 = var8.nextDouble(1.5, 5.0);
                    int var25 = var8.nextBoolean() ? 1 : 0;
                    if (var25 != 0) {
                        var36 &= 1441373887;
                        var36 *= -2027094465;
                        var36 &= 452658843;
                        var36 ^= -1348033050;
                        long var141 = var6;
                        long var27 = var141 + 1L;
                        var27 = var141 * var27;
                        long var142 = var27 & 1L;
                        long var178;
                        var25 = (var178 = var142 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                        if (var25 != 0) {
                            break label84;
                        }

                        var25 = (byte)1;
                        var36 -= -1640137959;
                        var36 *= -1103678097;
                        var36 ^= 1021470227;
                        var36 += -204267436;
                        var36 ^= -835512975;
                    } else {
                        var36 = switch (var36) {
                            default -> var36 ^ -603737654;
                            case -1179513699 -> var36 ^ 548496299;
                            case -506865114 -> {
                                var36 -= 1480192624;
                                var36 |= -2043273717;
                                var36 -= 481175287;
                                var36 >>= 15;
                                yield var36 ^ 1315826217;
                            }
                        };
                        long var26 = var6;
                        long var28 = var26 + 1L;
                        var28 = var26 * var28;
                        long var30 = var26 + 2L;
                        var28 *= var30;
                        var26 += 3L;
                        var28 *= var26;
                        var26 = var28 & 7L;
                        long var179;
                        int var152 = (var179 = var26 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                        if (var152 != 0) {
                            break label84;
                        }

                        var25 = (byte)-1;
                        var36 -= -132858004;
                        var36 ^= -849712579;
                    }

                    long var153 = var6;
                    long var168 = var153 + 1L;
                    var168 = var153 * var168;
                    long var173 = var153 + 2L;
                    var168 *= var173;
                    var153 += 3L;
                    var168 *= var153;
                    var153 = var168 & 7L;
                    long var180;
                    int var156 = (var180 = var153 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                    if (var156 != 0) {
                        break label84;
                    }

                    double var145 = var25;
                    var23 *= var145;
                    float var139 = (float)var23;
                    SpriteShape[] var24 = EJ;
                    SpriteShape[] var146 = EJ;
                    var25 = var146.length;
                    var25 = var8.nextInt(var25);
                    SpriteShape var140 = var24[var25];
                    bA_2 var149 = bA_2.FOUNTAIN;
                    float var157 = var8.nextFloat();
                    int var159 = var7 + 1;
                    var159 = var7 * var159;
                    var159 &= 1;
                    if (var159 != 0) {
                        switch (var36) {
                            case -1694357853:
                                var36 += -1159102987;
                                var36 -= 286045106;
                                var36 += -1241378595;
                                var36 &= -778222540;
                                var36 ^= 1308104939;
                                break label81;
                            case -313712454:
                                var36 ^= -1999767445;
                                break label81;
                            case -310537485:
                            default:
                                var36 ^= -1030959874;
                                break label81;
                        }
                    }

                    var36 >>>= 13;
                    var36 ^= 875930354;
                    long var162 = var6;
                    long var29 = var162 + 1L;
                    var29 = var162 * var29;
                    long var163 = var29 & 1L;
                    long var181;
                    var159 = (var181 = var163 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                    if (var159 != 0) {
                        break label84;
                    }

                    var102.q(var106, var13, var15, var119, var124, var125, var131, var21, var137, var139, var140, var149, var157);
                    int var103 = var95 + 1;
                    var95 = var103;
                    var36 += 1746629094;
                    var36 -= -994730533;
                    var36 ^= -536540983;
                }
            }

            long var82 = var6;
            long var87 = var82 + 1L;
            long var88 = var82 * var87;
            long var83 = var88 & 1L;
            long var182;
            var6 = (var182 = var83 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
            if (var6 == 0) {
                IllegalStateException var85 = new IllegalStateException();
                throw var85;
            }
        }

        IllegalArgumentException var81 = new IllegalArgumentException();
        throw var81;
    }

    private void ZL(T var1) {
        label150: {
            label159: {
                int var2 = j;
                var2 ^= -1182626736;
                int var3 = System.identityHashCode(this);
                RenderPhase var4 = var1.phase();
                RenderPhase var5 = RenderPhase.WORLD;
                Integer var6 = var3;
                if (var6 == null) {
                    var2 ^= -1543788866;
                    var2 += 1085395118;
                    var2 ^= -600037796;
                    var2 ^= -725962366;
                } else {
                    var2 -= 367118897;
                    var2 &= 552316511;
                    var2 += -1790747391;
                    var2 *= 1189772551;
                    var2 ^= -343107173;
                    long var141 = var2;
                    long var8 = var141 + 1L;
                    var8 = var141 * var8;
                    long var142 = var8 & 1L;
                    long var189;
                    int var143 = (var189 = var142 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                    if (var143 != 0) {
                        break label150;
                    }

                    if (var4 != var5) {
                        var2 ^= -1358451206;
                        var2 *= -382675489;
                        var2 ^= 1929909098;
                        long var129 = var2;
                        long var159 = var129 + 1L;
                        long var160 = var129 * var159;
                        long var130 = var160 & 1L;
                        long var190;
                        int var131 = (var190 = var130 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                        if (var131 == 0) {
                            return;
                        }
                        break label150;
                    }

                    var2 |= 1968209529;
                    var2 ^= 1685909851;
                    var2 >>>= 11;
                    var2 ^= 1748410834;
                    Integer var118 = var2;
                    if (var118 == null) {
                        break label150;
                    }

                    Entity var119 = i_2.QI();
                    Integer var132 = var3;
                    if (var132 == null) {
                        switch (var2) {
                            case -1892516462:
                                var2 ^= -1566633728;
                                break;
                            case -671781708:
                            default:
                                var2 ^= -1295257677;
                                break;
                            case 1747289443:
                                var2 ^= 426290132;
                                var2 ^= 1531150905;
                        }
                    } else {
                        var2 *= -2128191697;
                        var2 >>= 21;
                        var2 *= -1794449391;
                        var2 ^= -883371551;
                        if (var119 == null) {
                            var2 -= 1115711716;
                            var2 ^= -695500601;
                            break label159;
                        }

                        var2 -= 885403635;
                        var2 -= 813322706;
                        var2 |= -517681945;
                        var2 &= 943768913;
                        var2 ^= -1211795392;
                        Integer var133 = var2;
                        if (var133 == null) {
                            break label150;
                        }

                        var5 = (RenderPhase)this.Ex;
                        Integer var144 = var3;
                        label136:
                        if (var144 != null) {
                            var2 *= -1501892665;
                            var2 ^= -1186101052;
                            int var145 = var2 + 1;
                            var145 = var2 * var145;
                            var145 &= 1;
                            if (var145 != 0) {
                                break label150;
                            }

                            if (var5 != null) {
                                var2 = switch (var2) {
                                    case -2110875405 -> {
                                        var2 |= 1213123582;
                                        yield var2 ^ -261131487;
                                    }
                                    default -> var2 ^ 1195468381;
                                    case 1591046584 -> var2 ^ 1779131806;
                                };
                                var5 = (RenderPhase)this.Ex;
                                var145 = var3 + 1;
                                var145 = var3 * var145;
                                int var7 = var3 + 2;
                                var145 *= var7;
                                var7 = var3 + 3;
                                var145 *= var7;
                                var145 &= 7;
                                if (var145 != 0) {
                                    var2 &= -268397613;
                                    var2 |= -540971810;
                                    var2 += 1267525541;
                                    var2 += -1406250787;
                                    var2 ^= -579630610;
                                    break label136;
                                }

                                var2 <<= 15;
                                var2 *= -627372883;
                                var2 ^= 463476801;
                                var145 = var2 + 1;
                                var145 = var2 * var145;
                                var145 &= 1;
                                if (var145 != 0) {
                                    break label150;
                                }

                                World var120 = var119.getEntityWorld();
                                if ((Object)var5 != var120) {
                                    var2 |= 888876930;
                                    var2 *= 1297348371;
                                    var2 += 1767521874;
                                    var2 ^= 308690905;
                                    break label159;
                                }

                                var2 ^= -757105981;
                                var2 ^= 551857811;
                            } else {
                                var2 -= 1144068656;
                                var2 ^= 392540882;
                            }

                            int var121 = var2 + 1;
                            int var122 = var2 * var121;
                            int var136 = var2 + 2;
                            int var123 = var122 * var136;
                            int var137 = var2 + 3;
                            int var124 = var123 * var137;
                            int var125 = var124 & 7;
                            if (var125 != 0) {
                                break label150;
                            }

                            Canvas var126 = var1.canvas();
                            Ud var138 = Ud.Z();
                            AuraPipeline var139 = var138.Ul();
                            WorldDraw var140 = var139.world();
                            oL var156 = this.z;
                            var156.gP(var126, var140);
                            FrameContext var157 = var1.frame();
                            double var158 = var157.time();
                            Uq var163 = this.J;
                            float var164 = var163.WM();
                            int var9 = var3 + 1;
                            var9 = var3 * var9;
                            var9 &= 1;
                            if (var9 == 0) {
                                var2 ^= 1804577669;
                                var2 ^= -1011607863;
                                mN var167 = this.w;
                                ka var10 = ka.ALPHA;
                                var167.Vs(var10, 0.55F, true);
                                mN var168 = this.w;
                                FrameContext var180 = var1.frame();
                                float var181 = var180.dt();
                                float var182 = Math.min(var181, 0.1F);
                                zS var11 = this.M;
                                var168.h(var126, var140, var182, var158, var11, var164);
                    int var169 = this.Ty() ? 1 : 0;
                                if (var169 != 0) {
                                    var2 &= 1052420110;
                                    var2 *= 216106309;
                                    var2 ^= 357351611;
                                    Integer var170 = var2;
                                    if (var170 == null) {
                                        break label150;
                                    }

                                    var169 = var2 ^ -9594112;
                                    int var172 = var169 * 531506411;
                                    var172 <<= 12;
                                    var172 >>= 20;
                                    var172 ^= -853029545;
                                    this.SC(var126, var140, var158, var164, var172);
                                    var2 &= 1666467889;
                                    var2 -= 350318869;
                                    var2 ^= -1417444593;
                                    var2 ^= -1185358931;
                                } else {
                                    var2 *= -511134973;
                                    var2 &= 2078805901;
                                    var2 ^= 1581630795;
                                }

                                var169 = var2 + 1;
                                var169 = var2 * var169;
                                var169 &= 1;
                                if (var169 != 0) {
                                    break label150;
                                }

                                boolean var179 = this.W();
                                long var183 = var3;
                                long var12 = var183 + 1L;
                                var12 = var183 * var12;
                                long var14 = var183 + 2L;
                                var12 *= var14;
                                long var184 = var183 + 3L;
                                var12 *= var184;
                                long var185 = var12 & 7L;
                                long var191;
                                var3 = (var191 = var185 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                                if (var3 == 0) {
                                    var2 = switch (var2) {
                                        default -> var2 ^ -482329849;
                                        case -971451292 -> var2 ^ 738928747;
                                        case 482725454 -> {
                                            var2 >>= 1;
                                            var2 &= -1980441976;
                                            yield var2 ^ 1563019546;
                                        }
                                    };
                                    Integer var105 = var2;
                                    if (var105 != null) {
                                        if (var179) {
                                            var2 >>= 19;
                                            var2 ^= -2130056968;
                                            var2 ^= 404269137;
                                            var105 = var2;
                                            if (var105 == null) {
                                                break label150;
                                            }

                                            int var107 = var2 & 2089244683;
                                            var107 &= 1922007436;
                                            var107 -= -1117364382;
                                            var107 *= -874893167;
                                            var107 ^= 556133350;
                                            this.Sg(var126, var140, var158, var164, var107);
                                            var2 -= -987100743;
                                            var2 ^= -631093664;
                                        } else {
                                            var2 >>= 31;
                                            var2 &= -225701906;
                                            var2 |= 168733268;
                                            var2 >>= 28;
                                            var2 ^= 159712807;
                                        }

                                        int var112 = var2 + 1;
                                        var112 = var2 * var112;
                                        int var127 = var2 + 2;
                                        var112 *= var127;
                                        int var128 = var2 + 3;
                                        var112 *= var128;
                                        var112 &= 7;
                                        if (var112 == 0) {
                                            return;
                                        }
                                    }
                                    break label150;
                                }

                                switch (var2) {
                                    case 482725454:
                                        var2 -= -2023299060;
                                        var2 &= 914673540;
                                        var2 <<= 29;
                                        var2 ^= 705604750;
                                        break;
                                    case 1226252424:
                                    default:
                                        var2 ^= -309454977;
                                        break;
                                    case 1921448082:
                                        var2 ^= -1030334279;
                                }
                            } else {
                                var2 &= 296474962;
                                var2 |= 1563270474;
                                var2 ^= 2007200212;
                            }
                        } else {
                            var2 *= 39734635;
                            var2 *= 282275581;
                            var2 += 1377269767;
                            var2 ^= -875960264;
                        }
                    }
                }

                AssertionError var117 = new AssertionError();
                throw var117;
            }

            this.J();
            return;
        }

        IllegalArgumentException var99 = new IllegalArgumentException();
        throw var99;
    }

    private void SC(Canvas var1, WorldDraw var2, double var3, float var5, int var6) {
        label157: {
            int var8 = System.identityHashCode(this);
            float var9 = this.X;
            float var10 = this.oy;
            var9 /= var10;
            float var129 = var9;
            Lv var132 = sT_2.q;
            float var11 = var9 - 0.2F;
            var11 /= 0.8F;
            var11 = TP.S(var11);
            var10 = var132.l(var11);
            var10 = 1.0F - var10;
            zS var139 = this.M;
            int var140 = var139.x(0.0F, var3);
            int var135 = DP.Y(var140, var10);
            int var136 = var135;
            int var141 = var135 | 16777215;
            int var142 = DP.Z(var135, var141, 0.2F);
            int var143 = var142;
            var1.save();
            int var12 = var8 + 1;
            var12 = var8 * var12;
            var12 &= 1;
            int var79;
            if (var12 == 0) {
                var79 = var6 << 22;
                var79 <<= 28;
                var79 <<= 8;
                var79 ^= 737926247;
                var1.additive(var5);
                int var146 = 0;
                var146 = var146;
                var79 *= -488941417;
                var79 ^= 1814554221;

                label154:
                while (true) {
                    long var13 = var79;
                    long var15 = var13 + 1L;
                    var15 = var13 * var15;
                    var13 = var15 & 1L;
                    long var236;
                    int var149 = (var236 = var13 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                    if (var149 != 0) {
                        break label157;
                    }

                    if (var146 >= 2) {
                        var79 -= -257858992;
                        var79 *= -1179595095;
                        var79 *= 1928246297;
                        var79 ^= -267363510;
                        var1.restore();
                        return;
                    }

                    var79 &= -428255661;
                    var79 += -835581366;
                    var79 ^= 516421605;
                    Lv var150 = sT_2.aO;
                    float var151 = var150.l(var129);
                    float var152 = 2.4F * var151;
                    float var153 = 0.3F + var152;
                    long var14 = var8;
                    long var16 = var14 + 1L;
                    var16 = var14 * var16;
                    var14 = var16 & 1L;
                    long var237;
                    int var163 = (var237 = var14 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                    if (var163 != 0) {
                        switch (var79) {
                            case -2128924853:
                                var79 ^= 893971685;
                                break label154;
                            case 1146658597:
                            default:
                                var79 ^= 1621357010;
                                break label154;
                            case 1321068463:
                                var79 ^= 1759821953;
                                var79 -= -681033430;
                                var79 ^= 561302338;
                                break label154;
                        }
                    }

                    var79 += 1976705295;
                    var79 *= -1008741905;
                    var79 >>>= 29;
                    var79 ^= 761672783;
                    float var164;
                    if (var146 == 0) {
                        var79 |= 1834364139;
                        var79 &= -254866779;
                        var79 ^= -1832213709;
                        var164 = 1.0F;
                        var79 *= 1095420839;
                        var79 &= 1326682701;
                        var79 ^= -398609195;
                    } else {
                        var79 ^= -2083839893;
                        var79 &= -1269748156;
                        var79 ^= 184132525;
                        Integer var189 = var79;
                        if (var189 == null) {
                            break label157;
                        }

                        var164 = 0.72F;
                        var79 -= 1618389483;
                        var79 ^= -1522223902;
                        var79 ^= 1190886849;
                    }

                    int var190 = var79 + 1;
                    int var191 = var79 * var190;
                    int var192 = var191 & 1;
                    if (var192 != 0) {
                        break label157;
                    }

                    float var154 = var153 * var164;
                    float var155 = var154 * 1.3F;
                    var1.save();
                    double var165 = this.mC;
                    double var206 = this.Om;
                    double var207 = var206 + 0.03;
                    double var18 = this.f;
                    double var20 = var155;
                    long var22 = var8;
                    long var24 = var22 + 1L;
                    var24 = var22 * var24;
                    long var26 = var22 + 2L;
                    var24 *= var26;
                    var22 += 3L;
                    var24 *= var22;
                    var22 = var24 & 7L;
                    long var238;
                    int var231 = (var238 = var22 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                    if (var231 != 0) {
                        switch (var79) {
                            case -1834495378:
                                var79 ^= -1613044054;
                                break label154;
                            case -1388432227:
                                var79 += -1297788426;
                                var79 |= 1189504910;
                                var79 -= -1463296198;
                                var79 <<= 19;
                                var79 ^= 749481286;
                                break label154;
                            case 794236773:
                            default:
                                var79 ^= -991248168;
                                break label154;
                        }
                    }

                    var79 += -135323302;
                    var79 &= -202411176;
                    var79 ^= 673542592;
                    double var232 = var155;
                    boolean var156 = var2.plane(var1, var165, var207, var18, var20, 0.0, 0.0, 0.0, 0.0, var232);
                    if (var156) {
                        var79 = switch (var79) {
                            case -1995956080 -> {
                                var79 *= -1236605759;
                                var79 &= -132727878;
                                var79 += 970409736;
                                var79 &= 76495015;
                                yield var79 ^ 1802000356;
                            }
                            case -246235220 -> var79 ^ 2025799457;
                            default -> var79 ^ -262253021;
                        };
                        float var157 = 0.7692308F;
                        var14 = var8;
                        var16 = var14 + 1L;
                        var16 = var14 * var16;
                        long var226 = var14 + 2L;
                        var16 *= var226;
                        var14 += 3L;
                        var16 *= var14;
                        var14 = var16 & 7L;
                        long var239;
                        int var169 = (var239 = var14 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
                        if (var169 != 0) {
                            switch (var79) {
                                case -191916209:
                                default:
                                    var79 ^= 1522110562;
                                    break label154;
                                case 1165288164:
                                    var79 ^= -371155501;
                                    break label154;
                                case 1810849636:
                                    var79 &= -2063330223;
                                    var79 ^= -811751024;
                                    var79 <<= 16;
                                    var79 ^= -766235322;
                                    break label154;
                            }
                        }

                        var79 -= -1141775029;
                        var79 ^= -1656105446;
                        var14 = var79;
                        var16 = var14 + 1L;
                        var16 = var14 * var16;
                        long var227 = var14 + 2L;
                        var16 *= var227;
                        var14 += 3L;
                        var16 *= var14;
                        var14 = var16 & 7L;
                        long var240;
                        int var173 = (var240 = var14 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                        if (var173 != 0) {
                            break label157;
                        }

                        if (var146 == 0) {
                            var79 -= 1617430509;
                            var79 >>= 20;
                            var79 += -1788057694;
                            var79 ^= -455104958;
                            var79 ^= 2072568480;
                            int var174 = var79 + 1;
                            int var175 = var79 * var174;
                            int var176 = var175 & 1;
                            if (var176 != 0) {
                                break label157;
                            }

                            SpriteShape var177 = SpriteShape.RING;
                            var15 = var8;
                            long var17 = var15 + 1L;
                            var17 = var15 * var17;
                            long var19 = var15 + 2L;
                            var17 *= var19;
                            var15 += 3L;
                            var17 *= var15;
                            var15 = var17 & 7L;
                            long var241;
                            int var196 = (var241 = var15 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                            if (var196 != 0) {
                                var79 |= -1230974277;
                                var79 *= 1622410295;
                                var79 ^= 1201122067;
                                var79 += -1244305174;
                                var79 ^= 1514200130;
                                break;
                            }
                            var79 = switch (var79) {
                                case -813315661 -> var79 ^ 2063010395;
                                default -> var79 ^ 1493599055;
                                case 171647012 -> {
                                    var79 ^= -850861675;
                                    var79 *= 1255137953;
                                    var79 &= -971044848;
                                    yield var79 ^ 991671051;
                                }
                            };
                            Integer var197 = var79;
                            if (var197 == null) {
                                break label157;
                            }

                            float var198 = 1.0F - var157;
                            var1.sprite(var177, 0.0F, 0.0F, var157, var198, var143, var136, 0.0F);
                            switch (var79) {
                                case 480397151:
                                    var79 ^= 1146676952;
                                    break;
                                case 1240882067:
                                default:
                                    var79 ^= 1068954258;
                                    break;
                                case 2064757531:
                                    var79 *= -1045331717;
                                    var79 *= -667707053;
                                    var79 |= -980717983;
                                    var79 >>= 28;
                                    var79 ^= -1535717977;
                            }
                        } else {
                            var79 = switch (var79) {
                                default -> var79 ^ -1089424026;
                                case -306578491 -> var79 ^ -856042650;
                                case 850701315 -> {
                                    var79 += 1695079756;
                                    var79 &= -742286589;
                                    var79 ^= 1597607728;
                                    var79 -= 1635498821;
                                    yield var79 ^ 1681422506;
                                }
                            };
                            SpriteShape var178 = SpriteShape.RING;
                            float var199 = 1.0F - var157;
                            float var200 = var199 * 0.6F;
                            int var216 = DP.nq(var143, 0.55F);
                            Integer var224 = var8;
                            if (var224 == null) {
                                var79 += 1884457254;
                                var79 |= 850916972;
                                var79 += 496577677;
                                var79 |= -1979847089;
                                var79 ^= -226901319;
                                break;
                            }

                            var79 *= -1156452109;
                            var79 -= -88079996;
                            var79 -= 1746144498;
                            var79 ^= 1985218549;
                            int var225 = DP.nq(var136, 0.55F);
                            var1.sprite(var178, 0.0F, 0.0F, var157, var200, var216, var225, 0.0F);
                            var79 -= -209040155;
                            var79 ^= -416630526;
                            var79 >>>= 3;
                            var79 |= -1602344434;
                            var79 ^= -603868;
                        }
                    } else {
                        var79 += 920563716;
                        var79 &= 1352467666;
                        var79 *= 1038825383;
                        var79 ^= -1377665109;
                    }

                    var13 = var79;
                    var15 = var13 + 1L;
                    var15 = var13 * var15;
                    var13 = var15 & 1L;
                    long var242;
                    int var160 = (var242 = var13 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                    if (var160 != 0) {
                        break label157;
                    }

                    var1.restore();
                    int var161 = var146 + 1;
                    var14 = var8;
                    var16 = var14 + 1L;
                    var16 = var14 * var16;
                    long var228 = var14 + 2L;
                    var16 *= var228;
                    var14 += 3L;
                    var16 *= var14;
                    var14 = var16 & 7L;
                    long var243;
                    int var182 = (var243 = var14 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                    if (var182 != 0) {
                        switch (var79) {
                            case 1481824659:
                                var79 ^= -154621071;
                                break label154;
                            case 1535717979:
                                var79 += -2141280678;
                                var79 ^= -1268517389;
                                break label154;
                            case 1974452619:
                            default:
                                var79 ^= -29926923;
                                break label154;
                        }
                    }

                    var79 &= -2050211862;
                    var79 ^= -664586280;
                    var79 |= 775929163;
                    var79 ^= 350374561;
                    int var183 = var79 + 1;
                    int var184 = var79 * var183;
                    int var203 = var79 + 2;
                    int var185 = var184 * var203;
                    int var204 = var79 + 3;
                    int var186 = var185 * var204;
                    int var187 = var186 & 7;
                    if (var187 != 0) {
                        break label157;
                    }

                    var146 = var161;
                    switch (var79) {
                        case -873311373:
                            var79 ^= -505617149;
                            break;
                        case -350357638:
                            var79 ^= 2139308241;
                            var79 &= 1828226379;
                            var79 ^= -1747973209;
                            break;
                        case 1231032592:
                        default:
                            var79 ^= 1403976891;
                    }
                }
            } else {
                var79 = var6 >> 22;
                var79 |= -1544346193;
                var79 -= -1348018452;
                var79 ^= 1071451541;
            }

            long var123 = var79;
            long var130 = var123 + 1L;
            long var131 = var123 * var130;
            long var124 = var131 & 1L;
            long var244;
            var79 = (var244 = var124 - 0L) == 0L ? 0 : (var244 < 0L ? -1 : 1);
            if (var79 == 0) {
                AssertionError var127 = new AssertionError();
                throw var127;
            }
        }

        IllegalStateException var126 = new IllegalStateException();
        throw var126;
    }

    private void Sg(Canvas var1, WorldDraw var2, double var3, float var5, int var6) {
        int var8 = System.identityHashCode(this);
        float var9 = this.W;
        float var10 = this.ZS;
        var9 /= var10;
        float var515;
        int var304 = (var515 = var9 - 0.06F) == 0.0F ? 0 : (var515 < 0.0F ? -1 : 1);
        long var11 = var8;
        long var13 = var11 + 1L;
        var13 = var11 * var13;
        var11 = var13 & 1L;
        long var516;
        int var329 = (var516 = var11 - 0L) == 0L ? 0 : (var516 < 0L ? -1 : 1);
        if (var329 != 0) {
            int var275 = var6 - -2013031680;
            var275 ^= -1382852766;
        } else {
            label418: {
                int var7 = var6 & 2108229779;
                var7 ^= 804934924;
                var7 ^= -1103698870;
                int var330 = var7 + 1;
                int var331 = var7 * var330;
                int var12 = var7 + 2;
                int var332 = var331 * var12;
                var12 = var7 + 3;
                int var333 = var332 * var12;
                int var334 = var333 & 7;
                label392:
                if (var334 == 0) {
                    byte var305;
                    if (var304 < 0) {
                        var7 |= -600526176;
                        var7 *= 1836347073;
                        var7 *= -1673027307;
                        var7 ^= -265777708;
                        var305 = 0;
                        var7 ^= 2104307359;
                        var7 += -778498087;
                        var7 &= -1343468827;
                        var7 &= 117990035;
                        var7 ^= 1531343592;
                    } else {
                        var7 = switch (var7) {
                            case -1903865133 -> var7 ^ 297829308;
                            case -389697066 -> {
                                var7 -= -471047039;
                                var7 += 916679742;
                                var7 >>= 5;
                                yield var7 ^ 1841019203;
                            }
                            default -> var7 ^ -1142037555;
                        };
                        float var517;
                        int var335 = (var517 = var9 - 0.1F) == 0.0F ? 0 : (var517 < 0.0F ? -1 : 1);
                        var12 = var8 + 1;
                        var12 = var8 * var12;
                        var12 &= 1;
                        if (var12 != 0) {
                            var7 |= 171852035;
                            var7 ^= -1752296724;
                            var7 ^= 628410265;
                            break label418;
                        }

                        var7 += -1133176539;
                        var7 ^= -1204679094;
                        if (var335 < 0) {
                            var7 = switch (var7) {
                                case -1863877634 -> {
                                    var7 *= -210074831;
                                    var7 |= 1249191605;
                                    var7 -= 691140413;
                                    var7 |= 1794326030;
                                    yield var7 ^ -1841499202;
                                }
                                case -1601321804 -> var7 ^ 1591184694;
                                default -> var7 ^ -1497403283;
                            };
                            Integer var336 = var7;
                            if (var336 == null) {
                                break label392;
                            }

                            var305 = 1;
                            var7 -= 1004466433;
                            var7 ^= -509202873;
                        } else {
                            var7 &= -578609735;
                            var7 -= -1110278664;
                            var7 ^= -1924378887;
                            int var337 = var7 + 1;
                            int var338 = var7 * var337;
                            var12 = var7 + 2;
                            int var339 = var338 * var12;
                            var12 = var7 + 3;
                            int var340 = var339 * var12;
                            int var341 = var340 & 7;
                            if (var341 != 0) {
                                break label392;
                            }

                            float var518;
                            int var342 = (var518 = var9 - 0.18F) == 0.0F ? 0 : (var518 < 0.0F ? -1 : 1);
                            var12 = var8 + 1;
                            var12 = var8 * var12;
                            var12 &= 1;
                            if (var12 != 0) {
                                switch (var7) {
                                    case 401081843:
                                        var7 ^= 1967751365;
                                        break label418;
                                    case 1415757114:
                                    default:
                                        var7 ^= 1138611403;
                                        break label418;
                                    case 1610405177:
                                        var7 -= -335674444;
                                        var7 >>>= 13;
                                        var7 ^= -595126516;
                                        break label418;
                                }
                            }
                            var7 = switch (var7) {
                                default -> var7 ^ -1413982383;
                                case 1277874016 -> var7 ^ 1071502128;
                                case 1610405177 -> {
                                    var7 += -366250330;
                                    var7 += -1639575207;
                                    yield var7 ^ -1428227105;
                                }
                            };
                            long var395 = var7;
                            long var14 = var395 + 1L;
                            var14 = var395 * var14;
                            long var396 = var14 & 1L;
                            long var519;
                            var12 = (var519 = var396 - 0L) == 0L ? 0 : (var519 < 0L ? -1 : 1);
                            if (var12 != 0) {
                                break label392;
                            }

                            if (var342 < 0) {
                                var7 -= 284348201;
                                var7 |= -249123197;
                                var7 &= -957180674;
                                var7 ^= 1270884837;
                                var7 ^= -1722441674;
                                int var343 = var7 + 1;
                                int var344 = var7 * var343;
                                int var345 = var344 & 1;
                                if (var345 != 0) {
                                    break label392;
                                }

                                var305 = 2;
                                var7 -= 1643009298;
                                var7 &= -391572659;
                                var7 ^= -43634143;
                            } else {
                                var7 ^= -2128165560;
                                var7 ^= 2017572425;
                                var7 ^= -1566949390;
                                float var520;
                                int var346 = (var520 = var9 - 0.22F) == 0.0F ? 0 : (var520 < 0.0F ? -1 : 1);
                                long var398 = var8;
                                var14 = var398 + 1L;
                                var14 = var398 * var14;
                                long var399 = var14 & 1L;
                                long var521;
                                var12 = (var521 = var399 - 0L) == 0L ? 0 : (var521 < 0L ? -1 : 1);
                                if (var12 != 0) {
                                    var7 &= -829888775;
                                    var7 += 1749376175;
                                    var7 ^= -1396001211;
                                    break label418;
                                }

                                var7 ^= -830111372;
                                var7 |= -1960490173;
                                var7 <<= 21;
                                var7 ^= 1993299050;
                                if (var346 < 0) {
                                    var7 >>>= 4;
                                    var7 += -1633605242;
                                    var7 ^= 248462842;
                                    int var347 = var7 + 1;
                                    int var348 = var7 * var347;
                                    int var349 = var348 & 1;
                                    if (var349 != 0) {
                                        break label392;
                                    }

                                    var305 = 3;
                                    switch (var7) {
                                        case -1529749782:
                                        default:
                                            var7 ^= -997578958;
                                            break;
                                        case -1367137482:
                                            var7 ^= 1602522374;
                                            var7 ^= -1404461992;
                                            break;
                                        case 1711294279:
                                            var7 ^= 119076953;
                                    }
                                } else {
                                    var7 = switch (var7) {
                                        case 72580209 -> var7 ^ 921953450;
                                        case 447698026 -> {
                                            var7 *= -70975275;
                                            yield var7 ^ 608618227;
                                        }
                                        default -> var7 ^ -326727190;
                                    };
                                    Integer var350 = var7;
                                    if (var350 == null) {
                                        break label392;
                                    }

                                    float var522;
                                    int var351 = (var522 = var9 - 0.3F) == 0.0F ? 0 : (var522 < 0.0F ? -1 : 1);
                                    Integer var401 = var8;
                                    if (var401 == null) {
                                        var7 -= 596903775;
                                        var7 *= 909926755;
                                        var7 ^= -1017788388;
                                        break label418;
                                    }
                                    var7 = switch (var7) {
                                        default -> var7 ^ 250145140;
                                        case 290572943 -> var7 ^ 335336899;
                                        case 859175617 -> {
                                            var7 &= -1452523071;
                                            var7 &= -25792244;
                                            yield var7 ^ 1531008362;
                                        }
                                    };
                                    if (var351 < 0) {
                                        var7 <<= 14;
                                        var7 <<= 10;
                                        var7 |= -1830302902;
                                        var7 -= -1485590852;
                                        var7 ^= 2108746156;
                                        var305 = 4;
                                        var7 -= 656028102;
                                        var7 <<= 10;
                                        var7 -= -505393257;
                                        var7 ^= -1805446655;
                                    } else {
                                        var7 *= -1950123397;
                                        var7 ^= 1290969732;
                                        var7 ^= 676084346;
                                        var11 = var7;
                                        var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        long var15 = var11 + 2L;
                                        var13 *= var15;
                                        var11 += 3L;
                                        var13 *= var11;
                                        var11 = var13 & 7L;
                                        long var523;
                                        int var355 = (var523 = var11 - 0L) == 0L ? 0 : (var523 < 0L ? -1 : 1);
                                        if (var355 != 0) {
                                            break label392;
                                        }

                                        float var524;
                                        int var356 = (var524 = var9 - 0.34F) == 0.0F ? 0 : (var524 < 0.0F ? -1 : 1);
                                        int var402 = var8 + 1;
                                        var402 = var8 * var402;
                                        var402 &= 1;
                                        if (var402 != 0) {
                                            switch (var7) {
                                                case -1197597681:
                                                default:
                                                    var7 ^= -38686462;
                                                    break label418;
                                                case 926766352:
                                                    var7 &= -35662855;
                                                    var7 <<= 26;
                                                    var7 ^= -1669035782;
                                                    break label418;
                                                case 1453776377:
                                                    var7 ^= -1872011882;
                                                    break label418;
                                            }
                                        }

                                        var7 ^= -557296491;
                                        var7 |= -325784281;
                                        var7 *= 1277649349;
                                        var7 ^= -1762790500;
                                        if (var356 < 0) {
                                            var7 &= -970695051;
                                            var7 *= 1965784277;
                                            var7 ^= 1175181637;
                                            var305 = 5;
                                            switch (var7) {
                                                case -2132254878:
                                                    var7 ^= -190335976;
                                                    break;
                                                case 88565142:
                                                default:
                                                    var7 ^= 872064629;
                                                    break;
                                                case 1451214396:
                                                    var7 &= -9878506;
                                                    var7 ^= 187135612;
                                            }
                                        } else {
                                            var7 ^= -1190738080;
                                            var7 ^= -1140940944;
                                            float var525;
                                            int var357 = (var525 = var9 - 0.44F) == 0.0F ? 0 : (var525 < 0.0F ? -1 : 1);
                                            long var405 = var8;
                                            var14 = var405 + 1L;
                                            var14 = var405 * var14;
                                            long var406 = var14 & 1L;
                                            long var526;
                                            var402 = (var526 = var406 - 0L) == 0L ? 0 : (var526 < 0L ? -1 : 1);
                                            if (var402 != 0) {
                                                var7 ^= 843816624;
                                                var7 ^= 1869059397;
                                                break label418;
                                            }

                                            var7 &= 633198331;
                                            var7 ^= -324340671;
                                            if (var357 < 0) {
                                                var7 &= 442565389;
                                                var7 *= 39446377;
                                                var7 ^= 666428193;
                                                Integer var358 = var7;
                                                if (var358 == null) {
                                                    break label392;
                                                }

                                                var305 = 6;
                                                var7 += -461100863;
                                                var7 -= -1826784226;
                                                var7 -= -481704152;
                                                var7 &= 1066527177;
                                                var7 ^= 1246753704;
                                            } else {
                                                var7 &= 604739615;
                                                var7 ^= -340871063;
                                                float var527;
                                                int var359 = (var527 = var9 - 0.48F) == 0.0F ? 0 : (var527 < 0.0F ? -1 : 1);
                                                var402 = var8 + 1;
                                                var402 = var8 * var402;
                                                var402 &= 1;
                                                if (var402 != 0) {
                                                    var7 <<= 13;
                                                    var7 &= -933376446;
                                                    var7 >>= 28;
                                                    var7 ^= 595293954;
                                                    break label418;
                                                }

                                                var7 |= -515896604;
                                                var7 += 1266675550;
                                                var7 *= 1225749025;
                                                var7 ^= 99860058;
                                                var7 ^= -746364086;
                                                if (var359 < 0) {
                                                    var7 *= -1577201721;
                                                    var7 |= -358421128;
                                                    var7 ^= -80172351;
                                                    var7 ^= -1282653115;
                                                    var305 = 7;
                                                    switch (var7) {
                                                        case -1575877633:
                                                            var7 -= -500006554;
                                                            var7 *= -1144716117;
                                                            var7 ^= -1235381669;
                                                            break;
                                                        case 88333257:
                                                            var7 ^= -1987619854;
                                                            break;
                                                        case 2062214806:
                                                        default:
                                                            var7 ^= -1776366269;
                                                    }
                                                } else {
                                                    var7 *= -316952447;
                                                    var7 &= 1564586911;
                                                    var7 ^= -1657071318;
                                                    int var360 = var7 + 1;
                                                    int var361 = var7 * var360;
                                                    int var362 = var361 & 1;
                                                    if (var362 != 0) {
                                                        break label392;
                                                    }

                                                    var305 = 8;
                                                    var7 |= 330989427;
                                                    var7 ^= -957035241;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    int var363 = var8 + 1;
                    int var364 = var8 * var363;
                    var12 = var8 + 2;
                    int var365 = var364 * var12;
                    var12 = var8 + 3;
                    int var366 = var365 * var12;
                    int var367 = var366 & 7;
                    if (var367 != 0) {
                        switch (var7) {
                            case -1733786609:
                                var7 ^= 741751600;
                                break label418;
                            case 599016895:
                            default:
                                var7 ^= -2000784708;
                                break label418;
                            case 1565405800:
                                var7 ^= 1878428909;
                                var7 |= 1005453538;
                                var7 ^= -411421155;
                                break label418;
                        }
                    }

                    var7 ^= 1019883028;
                    var7 *= 856130757;
                    var7 ^= 708908703;
                    int var368 = var7 + 1;
                    int var369 = var7 * var368;
                    int var370 = var369 & 1;
                    label348:
                    if (var370 == 0) {
                        float var375;
                        if (var305 < 8) {
                            var7 = switch (var7) {
                                case -1896034829 -> {
                                    var7 -= 642516601;
                                    yield var7 ^ -1257793169;
                                }
                                default -> var7 ^ 127201762;
                                case 1216558111 -> var7 ^ 1046406696;
                            };
                            int var371 = var305 % 2;
                            long var413 = var8;
                            long var472 = var413 + 1L;
                            var472 = var413 * var472;
                            long var16 = var413 + 2L;
                            var472 *= var16;
                            long var414 = var413 + 3L;
                            var472 *= var414;
                            long var415 = var472 & 7L;
                            long var528;
                            var12 = (var528 = var415 - 0L) == 0L ? 0 : (var528 < 0L ? -1 : 1);
                            if (var12 != 0) {
                                var7 += -474396922;
                                var7 ^= 502541793;
                                break label418;
                            }

                            var7 &= -289111398;
                            var7 -= 1783499908;
                            var7 ^= 167733393;
                            var7 ^= 295493338;
                            var7 ^= -421773340;
                            if (var371 == 0) {
                                var7 >>>= 14;
                                var7 >>>= 3;
                                var7 ^= 61545331;
                                var7 *= 944124389;
                                var7 ^= 1627977639;
                                int var372 = var7 + 1;
                                int var373 = var7 * var372;
                                int var374 = var373 & 1;
                                if (var374 != 0) {
                                    break label348;
                                }

                                var375 = 1.0F;
                                var7 ^= 1710738748;
                                var7 ^= -394132739;
                            } else {
                                var7 |= -875501839;
                                var7 ^= -1365632844;
                                long var417 = var7;
                                var472 = var417 + 1L;
                                var472 = var417 * var472;
                                long var418 = var472 & 1L;
                                long var529;
                                var12 = (var529 = var418 - 0L) == 0L ? 0 : (var529 < 0L ? -1 : 1);
                                if (var12 != 0) {
                                    break label348;
                                }

                                var375 = 0.18F;
                                var7 <<= 4;
                                var7 ^= 47940469;
                                var7 &= -2138140328;
                                var7 >>= 3;
                                var7 ^= -600103160;
                            }
                        } else {
                            var7 &= -279432110;
                            var7 ^= -1102074846;
                            var12 = var7 + 1;
                            var12 = var7 * var12;
                            int var436 = var7 + 2;
                            var12 *= var436;
                            int var437 = var7 + 3;
                            var12 *= var437;
                            var12 &= 7;
                            if (var12 != 0) {
                                break label348;
                            }

                            Lv var425 = sT_2.q;
                            var13 = var8;
                            long var487 = var13 + 1L;
                            var487 = var13 * var487;
                            var13 = var487 & 1L;
                            long var530;
                            int var440 = (var530 = var13 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                            if (var440 != 0) {
                                switch (var7) {
                                    case -1890546140:
                                        var7 ^= -1256331322;
                                        break label418;
                                    case -993784611:
                                    default:
                                        var7 ^= -874237924;
                                        break label418;
                                    case 806856816:
                                        var7 |= -726475910;
                                        var7 *= -1822046417;
                                        var7 += -980526961;
                                        var7 ^= 544723215;
                                        break label418;
                                }
                            }
                            var7 = switch (var7) {
                                case -54436319 -> var7 ^ -1825207614;
                                case 806856816 -> {
                                    var7 *= 1257666053;
                                    var7 -= 830801897;
                                    var7 -= 863386672;
                                    var7 *= 124310601;
                                    yield var7 ^ -654473483;
                                }
                                default -> var7 ^ 668311040;
                            };
                            var9 -= 0.48F;
                            var9 /= 0.52F;
                            var9 = var425.l(var9);
                            var9 = 1.0F - var9;
                            var375 = var9;
                            switch (var7) {
                                case 146665082:
                                    var7 += 814941554;
                                    var7 *= -106156037;
                                    var7 &= -1225208490;
                                    var7 &= -1718991290;
                                    var7 ^= -861146260;
                                    break;
                                case 419542616:
                                default:
                                    var7 ^= 1821531207;
                                    break;
                                case 974506934:
                                    var7 ^= 1263731823;
                            }
                        }

                        int var287 = var7 + 1;
                        int var288 = var7 * var287;
                        var12 = var7 + 2;
                        int var289 = var288 * var12;
                        var12 = var7 + 3;
                        int var290 = var289 * var12;
                        int var291 = var290 & 7;
                        if (var291 == 0) {
                            int var306 = var305 / 2;
                            var11 = var8;
                            var13 = var11 + 1L;
                            var13 = var11 * var13;
                            long var489 = var11 + 2L;
                            var13 *= var489;
                            var11 += 3L;
                            var13 *= var11;
                            var11 = var13 & 7L;
                            long var531;
                            int var379 = (var531 = var11 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                            if (var379 != 0) {
                                var7 += -1955228187;
                                var7 ^= -1155152393;
                                break label418;
                            }

                            var7 -= -467373147;
                            var7 &= -140603484;
                            var7 ^= 704570773;
                            Integer var380 = var7;
                            label333:
                            if (var380 != null) {
                                int var381 = this.G;
                                if (var306 != var381) {
                                    var7 += -839244821;
                                    var7 += -285292939;
                                    var7 -= 1547073095;
                                    var7 += 1497082309;
                                    var7 ^= -1281289592;
                                    Integer var382 = var7;
                                    if (var382 == null) {
                                        break label333;
                                    }

                                    this.G = var306;
                                    int var307 = var8 + 1;
                                    int var308 = var8 * var307;
                                    int var309 = var308 & 1;
                                    if (var309 != 0) {
                                        var7 *= 26844283;
                                        var7 &= -1797806267;
                                        var7 ^= 1543539451;
                                        break label418;
                                    }

                                    var7 &= 1118696284;
                                    var7 += 1170539170;
                                    var7 <<= 28;
                                    var7 ^= 851984355;
                                    int var310 = var7 + 1;
                                    int var311 = var7 * var310;
                                    int var312 = var311 & 1;
                                    if (var312 != 0) {
                                        break label333;
                                    }

                                    int var313 = var7 & 1363831068;
                                    int var314 = var313 << 20;
                                    int var315 = var314 ^ 812117085;
                                    this.Uf(var315);
                                    var7 += 381955200;
                                    var7 |= -1386239383;
                                    var7 ^= -1959509271;
                                } else {
                                    var7 += 640887529;
                                    var7 &= -1744116622;
                                    var7 *= -1666733103;
                                    var7 |= 560382246;
                                    var7 ^= 127758260;
                                }

                                Integer var316 = var7;
                                if (var316 != null) {
                                    zS var317 = this.M;
                                    int var318 = var317.x(0.2F, var3);
                                    float var383 = 0.45F * var375;
                                    int var384 = DP.Y(var318, var383);
                                    int var385 = var384;
                                    var12 = DP.Z(var318, -1, 0.75F);
                                    var12 = DP.Y(var12, var375);
                                    var13 = var8;
                                    var489 = var13 + 1L;
                                    var489 = var13 * var489;
                                    long var17 = var13 + 2L;
                                    var489 *= var17;
                                    var13 += 3L;
                                    var489 *= var13;
                                    var13 = var489 & 7L;
                                    long var532;
                                    int var448 = (var532 = var13 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                                    if (var448 != 0) {
                                        switch (var7) {
                                            case 652979330:
                                                var7 *= -673845975;
                                                var7 *= 526722197;
                                                var7 ^= -547769917;
                                                var7 -= 1024143275;
                                                var7 ^= -1382183244;
                                                break label418;
                                            case 895663375:
                                                var7 ^= 2121186238;
                                                break label418;
                                            case 1417991837:
                                            default:
                                                var7 ^= 1680020025;
                                                break label418;
                                        }
                                    }

                                    var7 &= 503244634;
                                    var7 -= -1425946847;
                                    var7 ^= 874347832;
                                    var7 ^= -742809256;
                                    int var449 = var7 + 1;
                                    int var450 = var7 * var449;
                                    int var478 = var7 + 2;
                                    int var451 = var450 * var478;
                                    var478 = var7 + 3;
                                    int var452 = var451 * var478;
                                    int var453 = var452 & 7;
                                    label321:
                                    if (var453 == 0) {
                                        var12 = var12;
                                        var1.save();
                                        var1.additive(var5);
                                        var1.save();
                                        double var454 = this.mC;
                                        double var494 = this.Om;
                                        double var495 = var494 + 0.02;
                                        double var507 = this.f;
                                        boolean var455 = var2.plane(var1, var454, var495, var507, 1.6, 0.0, 0.0, 0.0, 0.0, 1.6);
                                        if (var455) {
                                            var7 = switch (var7) {
                                                default -> var7 ^ -1870050430;
                                                case -1102315391 -> {
                                                    var7 ^= -812922682;
                                                    var7 ^= -128527722;
                                                    yield var7 ^ -855492956;
                                                }
                                                case -130443673 -> var7 ^ -750792756;
                                            };
                                            Integer var456 = var7;
                                            if (var456 == null) {
                                                break label321;
                                            }

                                            SpriteShape var457 = SpriteShape.GLOW;
                                            float var480 = 0.55F * var375;
                                            var478 = DP.Y(var318, var480);
                                            var489 = var8;
                                            var17 = var489 + 1L;
                                            var17 = var489 * var17;
                                            var489 = var17 & 1L;
                                            long var533;
                                            int var498 = (var533 = var489 - 0L) == 0L ? 0 : (var533 < 0L ? -1 : 1);
                                            if (var498 != 0) {
                                                var7 *= 161610119;
                                                var7 *= 1746799715;
                                                var7 ^= -2073351229;
                                                break label418;
                                            }

                                            var7 -= 1130637722;
                                            var7 |= 611116215;
                                            var7 |= 1689516718;
                                            var7 &= 1450680810;
                                            var7 ^= 1067843358;
                                            var489 = var7;
                                            var17 = var489 + 1L;
                                            var17 = var489 * var17;
                                            var489 = var17 & 1L;
                                            long var534;
                                            int var501 = (var534 = var489 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                                            if (var501 != 0) {
                                                break label321;
                                            }

                                            var9 = 0.4F * var375;
                                            int var294 = DP.Y(var318, var9);
                                            var1.sprite(var457, 0.0F, 0.0F, 0.08F, 0.92F, var478, var294, 0.0F);
                                            var7 ^= 523309542;
                                            var7 *= -2106241731;
                                            var7 ^= 159647165;
                                        } else {
                                            switch (var7) {
                                                case -1102315391:
                                                    var7 >>= 21;
                                                    var7 += -742876818;
                                                    var7 -= 841436198;
                                                    var7 ^= -1832236339;
                                                    break;
                                                case 581487545:
                                                default:
                                                    var7 ^= 769658257;
                                                    break;
                                                case 2061515864:
                                                    var7 ^= 10965289;
                                            }
                                        }

                                        long var295 = var7;
                                        var13 = var295 + 1L;
                                        var13 = var295 * var13;
                                        var489 = var295 + 2L;
                                        var13 *= var489;
                                        long var296 = var295 + 3L;
                                        var13 *= var296;
                                        long var297 = var13 & 7L;
                                        long var535;
                                        int var298 = (var535 = var297 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                                        if (var298 == 0) {
                                            var1.restore();
                                            double[] var299 = this.JI;
                                            double[] var319 = this.E;
                                            double[] var462 = this.cb;
                                            var478 = var7 >> 9;
                                            var478 *= -1219904347;
                                            var478 ^= 380421328;
                                            this.v(var1, var2, var299, var319, var462, 33, 1.0F, var384, var12, var478);
                                            Integer var300 = var8;
                                            if (var300 == null) {
                                                var7 -= -44174955;
                                                var7 ^= 98946033;
                                                var7 |= -308772409;
                                                var7 >>>= 28;
                                                var7 ^= -595293963;
                                                break label418;
                                            }

                                            var7 += -1707402607;
                                            var7 >>>= 3;
                                            var7 ^= 44856345;
                                            var7 &= -68543042;
                                            var7 ^= -68267958;
                                            Integer var301 = var7;
                                            if (var301 != null) {
                                                byte var302 = 0;
                                                int var303 = var302;
                                                var7 ^= 247420303;
                                                var7 *= -980532119;
                                                var7 ^= -185455389;
                                                var7 ^= 106643221;

                                                while (true) {
                                                    Integer var320 = var7;
                                                    if (var320 == null) {
                                                        break;
                                                    }

                                                    if (var303 >= 3) {
                                                        var7 -= 58670050;
                                                        var7 *= -855353245;
                                                        var7 |= -383460917;
                                                        var7 |= 431877490;
                                                        var7 ^= 37252541;
                                                        var8 = var7 + 1;
                                                        var8 = var7 * var8;
                                                        var8 &= 1;
                                                        if (var8 == 0) {
                                                            var1.restore();
                                                            return;
                                                        }
                                                        break;
                                                    }

                                                    var7 |= -38133432;
                                                    var7 ^= 1156770183;
                                                    int var321 = var7 + 1;
                                                    int var322 = var7 * var321;
                                                    int var323 = var322 & 1;
                                                    if (var323 != 0) {
                                                        break;
                                                    }

                                                    double[][] var324 = this.AP;
                                                    double[] var325 = var324[var303];
                                                    double[][] var463 = this.Ji;
                                                    double[] var464 = var463[var303];
                                                    double[][] var485 = this.AM;
                                                    double[] var486 = var485[var303];
                                                    int var503 = DP.nq(var385, 0.8F);
                                                    int var506 = DP.nq(var12, 0.8F);
                                                    int var512 = var7 & 1112805285;
                                                    int var513 = var512 & 707873215;
                                                    int var514 = var513 ^ -203808780;
                                                    this.v(var1, var2, var325, var464, var486, 9, 0.55F, var503, var506, var514);
                                                    var13 = var8;
                                                    var489 = var13 + 1L;
                                                    var489 = var13 * var489;
                                                    var13 = var489 & 1L;
                                                    long var536;
                                                    int var326 = (var536 = var13 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                                                    if (var326 != 0) {
                                                        var7 -= -1224119291;
                                                        var7 ^= 2127537864;
                                                        var7 *= 1228975561;
                                                        var7 >>= 14;
                                                        var7 ^= 595202420;
                                                        break label418;
                                                    }

                                                    var7 &= -1156771410;
                                                    var7 |= -710873470;
                                                    var7 |= 1988138487;
                                                    var7 ^= -1173518184;
                                                    int var327 = var303 + 1;
                                                    var303 = var327;
                                                    switch (var7) {
                                                        case -1787223147:
                                                            var7 ^= -747795518;
                                                            break;
                                                        case 984957118:
                                                        default:
                                                            var7 ^= -251744273;
                                                            break;
                                                        case 1168144231:
                                                            var7 &= -295126136;
                                                            var7 *= -1623800527;
                                                            var7 >>= 20;
                                                            var7 ^= 842189141;
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

                RuntimeException var281 = new RuntimeException();
                throw var281;
            }
        }

        IllegalArgumentException var277 = new IllegalArgumentException();
        throw var277;
    }

    private void v(Canvas var1, WorldDraw var2, double[] var3, double[] var4, double[] var5, int var6, float var7, int var8, int var9, int var10) {
        label107: {
            int var12 = var6;
            int var13 = System.identityHashCode(this);
            long var14 = var13;
            long var16 = var14 + 1L;
            var16 = var14 * var16;
            long var18 = var14 + 2L;
            var16 *= var18;
            var14 += 3L;
            var16 *= var14;
            var14 = var16 & 7L;
            long var213;
            int var113 = (var213 = var14 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
            if (var113 != 0) {
                int var11 = var10 + -435850302;
                var11 -= -602566507;
                var11 -= -70651129;
                var11 ^= -32542729;
            } else {
                int var38 = var10 | 777963515;
                var38 -= 66154063;
                var38 |= -1232131252;
                var38 -= -1475960680;
                var38 ^= -569381305;
                int var114 = var6 + 1;
                int var115 = var6 * var114;
                int var116 = var115 & 1;
                if (var116 != 0) {
                    break label107;
                }

                byte var117 = 0;
                int var118 = var117;
                var38 -= -611297386;
                var38 ^= -1943055434;

                label104:
                while (true) {
                    long var15 = var12;
                    long var17 = var15 + 1L;
                    var17 = var15 * var17;
                    long var19 = var15 + 2L;
                    var17 *= var19;
                    var15 += 3L;
                    var17 *= var15;
                    var15 = var17 & 7L;
                    long var214;
                    int var121 = (var214 = var15 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                    if (var121 != 0) {
                        break label107;
                    }

                    int var122 = var118 + 1;
                    var16 = var13;
                    var18 = var16 + 1L;
                    var18 = var16 * var18;
                    var16 = var18 & 1L;
                    long var215;
                    int var147 = (var215 = var16 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                    if (var147 != 0) {
                        var38 |= -1199312022;
                        var38 ^= 1190434666;
                        break;
                    }

                    var38 ^= 1463410454;
                    var38 <<= 23;
                    var38 ^= 1161618358;
                    int var148 = var12 + 1;
                    int var149 = var12 * var148;
                    int var150 = var149 & 1;
                    if (var150 != 0) {
                        break label107;
                    }

                    if (var122 >= var6) {
                        switch (var38) {
                            case -1413684298:
                                var38 &= 1627386157;
                                var38 &= -1068279936;
                                var38 += -334330616;
                                var38 |= -1363895048;
                                var38 ^= 1902842749;
                                break;
                            case -360924473:
                            default:
                                var38 ^= 783720426;
                                break;
                            case 533977604:
                                var38 ^= -82057344;
                        }

                        return;
                    }
                    var38 = switch (var38) {
                        case -1413684298 -> {
                            var38 ^= -675662654;
                            var38 ^= -1720845821;
                            yield var38 ^ 1082764607;
                        }
                        default -> var38 ^ -1684335196;
                        case -192249229 -> var38 ^ -970470431;
                    };
                    double var123 = var3[var118];
                    int var172 = var118 + 1;
                    double var173 = var3[var172];
                    double var124 = var123 + var173;
                    double var125 = var124 * 0.5;
                    double var174 = var4[var118];
                    int var189 = var118 + 1;
                    double var190 = var4[var189];
                    double var175 = var174 + var190;
                    double var176 = var175 * 0.5;
                    double var191 = var5[var118];
                    int var21 = var118 + 1;
                    double var195 = var5[var21];
                    double var192 = var191 + var195;
                    double var193 = var192 * 0.5;
                    boolean var126 = var2.at(var1, var125, var176, var193);
                    var16 = var13;
                    var18 = var16 + 1L;
                    var18 = var16 * var18;
                    var16 = var18 & 1L;
                    long var216;
                    int var153 = (var216 = var16 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                    if (var153 != 0) {
                        switch (var38) {
                            case -1511882680:
                                var38 ^= -1570434239;
                                var38 >>= 18;
                                var38 *= 1932387045;
                                var38 += 62025429;
                                var38 ^= -1863919717;
                                break label104;
                            case -169118614:
                                var38 ^= 1948440381;
                                break label104;
                            case 1684330358:
                            default:
                                var38 ^= 116228522;
                                break label104;
                        }
                    }

                    var38 >>>= 19;
                    var38 |= -51769010;
                    var38 ^= -1457374523;
                    Integer var154 = var12;
                    if (var154 == null) {
                        break label107;
                    }

                    if (!var126) {
                        var38 -= 1993909415;
                        var38 += 530489043;
                        var38 += 893593477;
                        var38 *= -843236425;
                        var38 ^= 798784054;
                        var15 = var12;
                        var17 = var15 + 1L;
                        var17 = var15 * var17;
                        var15 = var17 & 1L;
                        long var217;
                        int var129 = (var217 = var15 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                        if (var129 != 0) {
                            break label107;
                        }

                        var38 <<= 13;
                        var38 <<= 15;
                        var38 &= -448463027;
                        var38 ^= 156606922;
                    } else {
                        var38 = switch (var38) {
                            case -276070799 -> var38 ^ 668411702;
                            default -> var38 ^ 821847787;
                            case 1439182651 -> {
                                var38 >>>= 18;
                                var38 *= -207656557;
                                var38 &= -1906236639;
                                var38 -= 1743070407;
                                yield var38 ^ -1330934795;
                            }
                        };
                        int var130 = var12 + 1;
                        int var131 = var12 * var130;
                        int var155 = var12 + 2;
                        int var132 = var131 * var155;
                        int var156 = var12 + 3;
                        int var133 = var132 * var156;
                        int var134 = var133 & 7;
                        if (var134 != 0) {
                            break label107;
                        }

                        float var135 = var2.unitsPerBlock();
                        float var157 = var118;
                        float var158 = 0.45F * var157;
                        float var179 = var6;
                        var179--;
                        float var159 = var158 / var179;
                        float var160 = 1.0F - var159;
                        float var136 = 0.07F * var135;
                        float var137 = var136 * var7;
                        float var138 = var137 * var160;
                        float var139 = Math.max(0.5F, var138);
                        double var161 = var3[var118];
                        double var187 = var4[var118];
                        double var20 = var5[var118];
                        int var22 = var118 + 1;
                        double var196 = var3[var22];
                        int var24 = var118 + 1;
                        double var199 = var4[var24];
                        int var26 = var118 + 1;
                        double var202 = var5[var26];
                        float var28 = var139 * 4.5F;
                        Paint var29 = Paint.solid(var8);
                        float var30 = var139 * 2.2F;
                        long var31 = var13;
                        long var33 = var31 + 1L;
                        var33 = var31 * var33;
                        var31 = var33 & 1L;
                        long var218;
                        int var208 = (var218 = var31 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                        if (var208 != 0) {
                            var38 &= 1228929722;
                            var38 ^= -1750688464;
                            var38 ^= 1673045785;
                            break;
                        }

                        var38 += 97379348;
                        var38 >>= 5;
                        var38 *= -1164636227;
                        var38 ^= 133969217;
                        int var209 = var12 + 1;
                        int var210 = var12 * var209;
                        int var211 = var210 & 1;
                        if (var211 != 0) {
                            break label107;
                        }

                        var29 = var29.soft(var30);
                        boolean var162 = var2.line(var1, var161, var187, var20, var196, var199, var202, var28, var29);
                        double var163 = var3[var118];
                        double var188 = var4[var118];
                        var20 = var5[var118];
                        var22 = var118 + 1;
                        double var198 = var3[var22];
                        var24 = var118 + 1;
                        double var201 = var4[var24];
                        var26 = var118 + 1;
                        double var204 = var5[var26];
                        Paint var205 = Paint.solid(var9);
                        boolean var140 = var2.line(var1, var163, var188, var20, var198, var201, var204, var139, var205);
                        var38 |= -1731110000;
                        var38 *= -1584908539;
                        var38 -= 1034037760;
                        var38 += -1712564134;
                        var38 ^= -1180556321;
                    }

                    int var141 = var118 + 1;
                    int var164 = var13 + 1;
                    int var165 = var13 * var164;
                    int var181 = var13 + 2;
                    int var166 = var165 * var181;
                    int var182 = var13 + 3;
                    int var167 = var166 * var182;
                    int var168 = var167 & 7;
                    if (var168 != 0) {
                        var38 += -197381598;
                        var38 &= 82663262;
                        var38 -= -1838962180;
                        var38 *= -813560633;
                        var38 ^= 1066481073;
                        break;
                    }

                    var38 -= -1167534896;
                    var38 *= 1365245875;
                    var38 -= 326958537;
                    var38 ^= 277512900;
                    var118 = var141;
                    var38 <<= 8;
                    var38 >>= 23;
                    var38 ^= -578395700;
                }
            }

            var13 = var12 + 1;
            var13 = var12 * var13;
            var12 = var13 & 1;
            if (var12 == 0) {
                IllegalArgumentException var108 = new IllegalArgumentException();
                throw var108;
            }
        }

        AssertionError var106 = new AssertionError();
        throw var106;
    }

    private void Uf(int var1) {
        int var3 = System.identityHashCode(this);
        ThreadLocalRandom var4 = ThreadLocalRandom.current();
        ThreadLocalRandom var242 = var4;
        int var5 = 32;
        double[] var6 = this.JI;
        double var7 = this.mC;
        double var9 = var4.nextDouble(-2.5, 2.5);
        var7 += var9;
        var6[0] = var7;
        var6 = this.E;
        var7 = this.Om;
        var9 = var4.nextDouble(16.0, 20.0);
        int var11 = var3 + 1;
        var11 = var3 * var11;
        var11 &= 1;
        if (var11 != 0) {
            int var235 = var1 | 1093234896;
            var235 *= 1948825931;
            var235 |= 1699889499;
            var235 ^= 1546472502;
        } else {
            label337: {
                int var2 = var1 & 1901349560;
                var2 ^= -1728815895;
                var2 ^= -1429178813;
                var2 |= -518997312;
                var2 ^= -224659661;
                var7 += var9;
                var6[0] = var7;
                var6 = this.cb;
                var7 = this.f;
                var9 = var4.nextDouble(-2.5, 2.5);
                var7 += var9;
                var6[0] = var7;
                var6 = this.JI;
                var7 = this.mC;
                var6[var5] = var7;
                var6 = this.E;
                var7 = this.Om;
                var6[var5] = var7;
                var6 = this.cb;
                var7 = this.f;
                var6[var5] = var7;
                byte var250 = 0;
                int var251 = var250;
                var2 |= 1178732623;
                var2 ^= 474990922;
                var2 *= -326236551;
                var2 &= -652704373;
                var2 ^= 2106425232;

                label322:
                while (true) {
                    int var269 = var2 + 1;
                    int var270 = var2 * var269;
                    int var271 = var270 & 1;
                    if (var271 != 0) {
                        break;
                    }

                    if (var251 < 5) {
                        var2 = switch (var2) {
                            case -1265795303 -> {
                                var2 += 1254199657;
                                var2 &= -548430125;
                                var2 ^= -2065032499;
                                var2 &= 846775458;
                                yield var2 ^ 1204654244;
                            }
                            case -1214933288 -> var2 ^ 1247868019;
                            default -> var2 ^ 422798971;
                        };
                        int var277 = var5 >> var251;
                        long var284 = var3;
                        long var309 = var284 + 1L;
                        var309 = var284 * var309;
                        long var331 = var284 + 2L;
                        var309 *= var331;
                        var284 += 3L;
                        var309 *= var284;
                        var284 = var309 & 7L;
                        long var498;
                        int var287 = (var498 = var284 - 0L) == 0L ? 0 : (var498 < 0L ? -1 : 1);
                        if (var287 != 0) {
                            var2 >>>= 26;
                            var2 += -880590411;
                            var2 *= 1064530381;
                            var2 -= -1684389945;
                            var2 ^= 691412274;
                            break label337;
                        }

                        var2 |= 1625925324;
                        var2 |= -307349630;
                        var2 >>>= 9;
                        var2 *= -1707476375;
                        var2 ^= -912526252;
                        var284 = var2;
                        var309 = var284 + 1L;
                        var309 = var284 * var309;
                        var331 = var284 + 2L;
                        var309 *= var331;
                        var284 += 3L;
                        var309 *= var284;
                        var284 = var309 & 7L;
                        long var499;
                        int var291 = (var499 = var284 - 0L) == 0L ? 0 : (var499 < 0L ? -1 : 1);
                        if (var291 != 0) {
                            break;
                        }

                        int var278 = var277;
                        int var292 = var277 >> 1;
                        int var293 = var292;
                        byte var299 = 0;
                        int var300 = var299;
                        var2 += -1987039993;
                        var2 ^= 1168629432;
                        var2 ^= 1211201147;

                        while (true) {
                            int var317 = var300 + var278;
                            long var325 = var3;
                            long var13 = var325 + 1L;
                            var13 = var325 * var13;
                            long var15 = var325 + 2L;
                            var13 *= var15;
                            long var326 = var325 + 3L;
                            var13 *= var326;
                            long var327 = var13 & 7L;
                            long var500;
                            var11 = (var500 = var327 - 0L) == 0L ? 0 : (var500 < 0L ? -1 : 1);
                            if (var11 != 0) {
                                var2 &= -865755794;
                                var2 ^= 1541189376;
                                var2 ^= 72019757;
                                var2 ^= -1427320664;
                                break label337;
                            }

                            var2 &= -1495499562;
                            var2 ^= 1188818851;
                            Integer var329 = var2;
                            if (var329 == null) {
                                break label322;
                            }

                            if (var317 > var5) {
                                var2 >>>= 10;
                                var2 ^= 974829363;
                                var2 ^= 1869542605;
                                int var294 = var251 + 1;
                                long var301 = var3;
                                long var367 = var301 + 1L;
                                var367 = var301 * var367;
                                long var302 = var367 & 1L;
                                long var501;
                                int var303 = (var501 = var302 - 0L) == 0L ? 0 : (var501 < 0L ? -1 : 1);
                                if (var303 != 0) {
                                    var2 -= -1306083087;
                                    var2 >>= 22;
                                    var2 |= 1188949387;
                                    var2 |= 471730148;
                                    var2 ^= 1182824998;
                                    break label337;
                                }

                                var2 *= 2053283075;
                                var2 += -408361857;
                                var2 ^= -1200218361;
                                var2 ^= 387728345;
                                var251 = var294;
                                var2 -= 984913187;
                                var2 += -1268272976;
                                var2 *= 1783709699;
                                var2 ^= 918311579;
                                continue label322;
                            }
                            var2 = switch (var2) {
                                case -943472840 -> var2 ^ 545108982;
                                default -> var2 ^ 108233171;
                                case 1648876519 -> {
                                    var2 |= 1691842597;
                                    var2 += 218356995;
                                    yield var2 ^ -993673494;
                                }
                            };
                            int var318 = var2 + 1;
                            int var319 = var2 * var318;
                            int var320 = var319 & 1;
                            if (var320 != 0) {
                                break label322;
                            }

                            int var321 = var300 + var278;
                            int var330 = var300 + var293;
                            double[] var333 = this.E;
                            double var334 = var333[var300];
                            double[] var341 = this.E;
                            double var342 = var341[var321];
                            double var335 = var334 - var342;
                            double var336 = Math.abs(var335);
                            double var337 = var336 + 0.5;
                            double var343 = var337 * 0.22;
                            double[] var364 = this.JI;
                            double[] var370 = this.JI;
                            double var371 = var370[var300];
                            double[] var420 = this.JI;
                            Integer var436 = var3;
                            if (var436 == null) {
                                var2 >>= 3;
                                var2 |= -1441174337;
                                var2 *= -2044786593;
                                var2 ^= 314208104;
                                break label337;
                            }
                            var2 = switch (var2) {
                                case -1222744576 -> {
                                    var2 &= -1810925953;
                                    var2 -= -645928808;
                                    var2 -= 1206386969;
                                    var2 ^= -1266527679;
                                    yield var2 ^ -984800937;
                                }
                                default -> var2 ^ 606432947;
                                case 471572969 -> var2 ^ -1460364586;
                            };
                            long var437 = var2;
                            long var468 = var437 + 1L;
                            var468 = var437 * var468;
                            long var438 = var468 & 1L;
                            long var502;
                            int var439 = (var502 = var438 - 0L) == 0L ? 0 : (var502 < 0L ? -1 : 1);
                            if (var439 != 0) {
                                break label322;
                            }

                            double var421 = var420[var321];
                            double var372 = var371 + var421;
                            double var373 = var372 * 0.5;
                            double var422 = -var343;
                            double var423 = var242.nextDouble(var422, var343);
                            double var374 = var373 + var423;
                            var364[var330] = var374;
                            var364 = this.E;
                            var370 = this.E;
                            double var376 = var370[var300];
                            var420 = this.E;
                            double var425 = var420[var321];
                            double var377 = var376 + var425;
                            double var378 = var377 * 0.5;
                            double var426 = -var343;
                            double var427 = var242.nextDouble(var426, var343);
                            double var428 = var427 * 0.3;
                            double var379 = var378 + var428;
                            var364[var330] = var379;
                            var364 = this.cb;
                            var370 = this.cb;
                            double var381 = var370[var300];
                            var420 = this.cb;
                            double var430 = var420[var321];
                            double var382 = var381 + var430;
                            double var383 = var382 * 0.5;
                            double var431 = -var343;
                            double var432 = var242.nextDouble(var431, var343);
                            double var384 = var383 + var432;
                            var364[var330] = var384;
                            int var322 = var300 + var278;
                            var300 = var322;
                            var2 *= 568428311;
                            var2 *= -639059213;
                            var2 ^= 1328087616;
                        }
                    }
                    var2 = switch (var2) {
                        case -1265795303 -> {
                            var2 ^= -1670793192;
                            yield var2 ^ 1389102197;
                        }
                        case 614053175 -> var2 ^ 726793995;
                        default -> var2 ^ 1321250609;
                    };
                    var5 = (byte)0;
                    long var8 = var3;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var503;
                    int var252 = (var503 = var8 - 0L) == 0L ? 0 : (var503 < 0L ? -1 : 1);
                    if (var252 != 0) {
                        var2 &= -1395693218;
                        var2 &= -1164870291;
                        var2 <<= 1;
                        var2 ^= 201934680;
                        var2 ^= -445235175;
                        break label337;
                    }
                    var2 = switch (var2) {
                        case -1927245837 -> var2 ^ -1514780126;
                        default -> var2 ^ 1977304118;
                        case 2049491828 -> {
                            var2 <<= 13;
                            var2 -= -1657059970;
                            yield var2 ^ 1240082038;
                        }
                    };
                    Integer var253 = var2;
                    if (var253 == null) {
                        break;
                    }

                    var5 = var5;
                    var2 |= -710770380;
                    var2 |= 955616221;
                    var2 -= -53264421;
                    var2 ^= 1773480046;

                    label320:
                    while (true) {
                        var8 = var2;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var504;
                        int var254 = (var504 = var8 - 0L) == 0L ? 0 : (var504 < 0L ? -1 : 1);
                        if (var254 != 0) {
                            break label322;
                        }

                        if (var5 >= 3) {
                            var2 <<= 4;
                            var2 -= 1538407595;
                            var2 &= -1799822561;
                            var2 *= 401296285;
                            var2 ^= -1030372283;
                            Integer var240 = var2;
                            if (var240 != null) {
                                return;
                            }
                            break label322;
                        }

                        var2 &= 1837300103;
                        var2 |= -1318285751;
                        var2 += 1392663243;
                        var2 ^= 2018538495;
                        Integer var255 = var2;
                        if (var255 == null) {
                            break label322;
                        }

                        int var256 = var242.nextInt(4, 23);
                        int var272 = var256;
                        double var282 = var242.nextDouble(-1.0, 1.0);
                        double var283 = var282;
                        double var307 = var242.nextDouble(-1.0, 1.0);
                        double var308 = var307;
                        long var16 = var3;
                        long var18 = var16 + 1L;
                        var18 = var16 * var18;
                        long var20 = var16 + 2L;
                        var18 *= var20;
                        var16 += 3L;
                        var18 *= var16;
                        var16 = var18 & 7L;
                        long var505;
                        int var257 = (var505 = var16 - 0L) == 0L ? 0 : (var505 < 0L ? -1 : 1);
                        if (var257 != 0) {
                            var2 -= 1857124552;
                            var2 += 1734453790;
                            var2 *= 1716813183;
                            var2 ^= -357835126;
                            break label337;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ 1651174356;
                            case 36569683 -> var2 ^ 1420857374;
                            case 884955879 -> {
                                var2 &= 618527850;
                                var2 *= 969397383;
                                var2 <<= 8;
                                yield var2 ^ 1917062719;
                            }
                        };
                        double var346 = Math.hypot(var282, var307);
                        double var347 = Math.max(0.2, var346);
                        double var12 = var347;
                        double var348 = var242.nextDouble(2.5, 5.0);
                        double var14 = var348;
                        byte var258 = 0;
                        int var259 = var258;

                        var2 = switch (var2) {
                            case -1818833114 -> var2 ^ 177538518;
                            case 713531455 -> {
                                var2 -= -1023762381;
                                yield var2 ^ 2103846850;
                            }
                            default -> var2 ^ 1117026643;
                        };

                        while (true) {
                            int var349 = var2 + 1;
                            int var350 = var2 * var349;
                            int var17 = var2 + 2;
                            int var351 = var350 * var17;
                            var17 = var2 + 3;
                            int var352 = var351 * var17;
                            int var353 = var352 & 7;
                            if (var353 != 0) {
                                break label322;
                            }

                            if (var259 >= 9) {
                                var2 -= -861413193;
                                var2 &= -1255715157;
                                var2 ^= -1873981697;
                                int var260 = var5 + 1;
                                Integer var273 = var3;
                                if (var273 == null) {
                                    switch (var2) {
                                        case -1806825220:
                                            var2 += 1611086562;
                                            var2 *= 274137155;
                                            var2 |= -1266307228;
                                            var2 *= 1363824009;
                                            var2 ^= -183790169;
                                            break label337;
                                        case -1321585858:
                                            var2 ^= -1701790526;
                                            break label337;
                                        case -34317400:
                                        default:
                                            var2 ^= 1587464302;
                                            break label337;
                                    }
                                }

                                var2 ^= 1166233877;
                                var2 *= -383778671;
                                var2 ^= 1333544377;
                                long var274 = var2;
                                long var297 = var274 + 1L;
                                long var298 = var274 * var297;
                                long var275 = var298 & 1L;
                                long var506;
                                int var276 = (var506 = var275 - 0L) == 0L ? 0 : (var506 < 0L ? -1 : 1);
                                if (var276 != 0) {
                                    break label322;
                                }

                                var5 = var260;
                                switch (var2) {
                                    case -2045179180:
                                        var2 ^= -70809588;
                                        continue label320;
                                    case 621436914:
                                    default:
                                        var2 ^= 1503188471;
                                        continue label320;
                                    case 1813227840:
                                        var2 &= 1334425216;
                                        var2 *= 1758483847;
                                        var2 ^= -194893748;
                                        continue label320;
                                }
                            }
                            var2 = switch (var2) {
                                default -> var2 ^ -1056054052;
                                case 451618766 -> {
                                    var2 <<= 19;
                                    yield var2 ^ -1564620540;
                                }
                                case 1078759725 -> var2 ^ 1603664201;
                            };
                            double var354 = var259;
                            double var355 = var354 / 8.0;
                            double[][] var388 = this.AP;
                            double[] var389 = var388[var5];
                            double[] var19 = this.JI;
                            double var403 = var19[var272];
                            double var21 = var283 / var12;
                            var21 *= var14;
                            var21 *= var355;
                            double var404 = var403 + var21;
                            int var442 = var3 + 1;
                            int var443 = var3 * var442;
                            int var22 = var3 + 2;
                            int var444 = var443 * var22;
                            var22 = var3 + 3;
                            int var445 = var444 * var22;
                            int var446 = var445 & 7;
                            if (var446 != 0) {
                                var2 *= -692465485;
                                var2 -= 1131350933;
                                var2 *= -1325235967;
                                var2 += 1898003288;
                                var2 ^= 6762822;
                                break label337;
                            }

                            var2 >>= 17;
                            var2 -= -1735317130;
                            var2 ^= 1240370037;
                            var2 -= -467722751;
                            var2 ^= 877907422;
                            if (var259 == 0) {
                                var2 = switch (var2) {
                                    default -> var2 ^ 94892298;
                                    case -464444862 -> var2 ^ -82105035;
                                    case 2117262426 -> {
                                        var2 *= -713239407;
                                        var2 -= -20920860;
                                        yield var2 ^ -1752519630;
                                    }
                                };
                                int var447 = var2 + 1;
                                int var448 = var2 * var447;
                                int var449 = var448 & 1;
                                if (var449 != 0) {
                                    break label322;
                                }

                                var21 = 0.0;
                                switch (var2) {
                                    case -2118851400:
                                    default:
                                        var2 ^= 146341790;
                                        break;
                                    case -1347797724:
                                        var2 >>>= 21;
                                        var2 -= -419035359;
                                        var2 &= -623813558;
                                        var2 ^= -2078585481;
                                        break;
                                    case -867731600:
                                        var2 ^= 1446899327;
                                }
                            } else {
                                var2 += 921418803;
                                var2 ^= -219855519;
                                int var23 = var2 + 1;
                                var23 = var2 * var23;
                                var23 &= 1;
                                if (var23 != 0) {
                                    break label322;
                                }

                                double var472 = var242.nextDouble(-0.35, 0.35);
                                Integer var25 = var3;
                                if (var25 == null) {
                                    var2 <<= 16;
                                    var2 |= -1536013911;
                                    var2 ^= 1149357152;
                                    break label337;
                                }

                                var2 &= -465841780;
                                var2 -= -1121393750;
                                var2 += -362889273;
                                var2 &= -1660631053;
                                var2 ^= 1858753581;
                                var25 = var2;
                                if (var25 == null) {
                                    break label322;
                                }

                                var21 = var472;
                                var2 &= -193202417;
                                var2 ^= -394215373;
                            }

                            double var405 = var404 + var21;
                            var389[var259] = var405;
                            double[][] var390 = this.Ji;
                            double[] var391 = var390[var5];
                            var19 = this.E;
                            double var407 = var19[var272];
                            int var451 = var3 + 1;
                            int var452 = var3 * var451;
                            int var453 = var452 & 1;
                            if (var453 != 0) {
                                var2 &= -1801061910;
                                var2 *= 793657301;
                                var2 ^= -1158932421;
                                break label337;
                            }

                            var2 -= 1612160069;
                            var2 ^= -846894411;
                            var21 = var14 * 0.9;
                            var21 *= var355;
                            double var408 = var407 - var21;
                            if (var259 == 0) {
                                var2 &= -2115208725;
                                var2 *= 1528054271;
                                var2 *= 956482141;
                                var2 ^= -756343415;
                                int var456 = var2 + 1;
                                int var457 = var2 * var456;
                                var22 = var2 + 2;
                                int var458 = var457 * var22;
                                var22 = var2 + 3;
                                int var459 = var458 * var22;
                                int var460 = var459 & 7;
                                if (var460 != 0) {
                                    break label322;
                                }

                                var21 = 0.0;
                                switch (var2) {
                                    case -1295670875:
                                        var2 ^= -1509409971;
                                        break;
                                    case 284872769:
                                    default:
                                        var2 ^= -1599093171;
                                        break;
                                    case 1167690056:
                                        var2 >>>= 7;
                                        var2 |= 466461665;
                                        var2 |= -199288269;
                                        var2 |= -1637135340;
                                        var2 ^= 489712077;
                                }
                            } else {
                                var2 &= 1043516305;
                                var2 -= -1770622804;
                                var2 >>= 4;
                                var2 ^= 1630871702;
                                long var473 = var2;
                                long var488 = var473 + 1L;
                                var488 = var473 * var488;
                                long var27 = var473 + 2L;
                                var488 *= var27;
                                var473 += 3L;
                                var488 *= var473;
                                var473 = var488 & 7L;
                                long var507;
                                int var476 = (var507 = var473 - 0L) == 0L ? 0 : (var507 < 0L ? -1 : 1);
                                if (var476 != 0) {
                                    break label322;
                                }

                                double var477 = var242.nextDouble(-0.25, 0.25);
                                int var492 = var3 + 1;
                                int var493 = var3 * var492;
                                int var494 = var493 & 1;
                                if (var494 != 0) {
                                    var2 &= -1103895354;
                                    var2 ^= -49487019;
                                    var2 ^= -598612322;
                                    break label337;
                                }

                                var2 <<= 22;
                                var2 += -689390667;
                                var2 ^= 920272900;
                                Integer var495 = var2;
                                if (var495 == null) {
                                    break label322;
                                }

                                var21 = var477;
                                switch (var2) {
                                    case 560752564:
                                        var2 ^= 219203928;
                                        break;
                                    case 561183665:
                                        var2 |= 1718392856;
                                        var2 -= 48299067;
                                        var2 ^= -2041419452;
                                        break;
                                    case 722564725:
                                    default:
                                        var2 ^= -394516183;
                                }
                            }

                            int var478 = var2 + 1;
                            var478 = var2 * var478;
                            int var24 = var2 + 2;
                            var478 *= var24;
                            var24 = var2 + 3;
                            var478 *= var24;
                            var478 &= 7;
                            if (var478 != 0) {
                                break label322;
                            }

                            double var409 = var408 + var21;
                            var391[var259] = var409;
                            int var392 = var3 + 1;
                            int var393 = var3 * var392;
                            int var410 = var3 + 2;
                            int var394 = var393 * var410;
                            int var411 = var3 + 3;
                            int var395 = var394 * var411;
                            int var396 = var395 & 7;
                            if (var396 != 0) {
                                var2 *= -2063828029;
                                var2 >>>= 2;
                                var2 ^= -1833174217;
                                var2 ^= 962407925;
                                break label337;
                            }
                            var2 = switch (var2) {
                                case -2139944738 -> var2 ^ -359081448;
                                case -489712070 -> {
                                    var2 *= 357375877;
                                    yield var2 ^ -1919609935;
                                }
                                default -> var2 ^ -1883962694;
                            };
                            double[][] var397 = this.AM;
                            double[] var398 = var397[var5];
                            var19 = this.cb;
                            double var413 = var19[var272];
                            var21 = var308 / var12;
                            var21 *= var14;
                            double var356 = var21 * var355;
                            double var357 = var413 + var356;
                            double var419;
                            if (var259 == 0) {
                                var2 = switch (var2) {
                                    default -> var2 ^ -983655918;
                                    case 363743183 -> var2 ^ -1113774803;
                                    case 1743323539 -> {
                                        var2 <<= 1;
                                        var2 |= 1870663377;
                                        var2 &= -1125043386;
                                        var2 >>>= 18;
                                        yield var2 ^ -849461565;
                                    }
                                };
                                int var414 = var2 + 1;
                                int var415 = var2 * var414;
                                int var433 = var2 + 2;
                                int var416 = var415 * var433;
                                int var434 = var2 + 3;
                                int var417 = var416 * var434;
                                int var418 = var417 & 7;
                                if (var418 != 0) {
                                    break label322;
                                }

                                var419 = 0.0;
                                var2 >>>= 14;
                                var2 |= 1344744221;
                                var2 -= 668345540;
                                var2 ^= -1033539386;
                                var2 ^= -1500850101;
                            } else {
                                var2 >>= 30;
                                var2 *= -633084079;
                                var2 ^= -1125453954;
                                var21 = var242.nextDouble(-0.35, 0.35);
                                long var483 = var3;
                                long var496 = var483 + 1L;
                                var496 = var483 * var496;
                                long var484 = var496 & 1L;
                                long var508;
                                var478 = (var508 = var484 - 0L) == 0L ? 0 : (var508 < 0L ? -1 : 1);
                                if (var478 != 0) {
                                    var2 -= -1461144782;
                                    var2 *= 1242316479;
                                    var2 >>>= 17;
                                    var2 -= 1525582392;
                                    var2 ^= 476978569;
                                    break label337;
                                }

                                var2 *= 572500637;
                                var2 |= -1070942473;
                                var2 >>= 22;
                                var2 ^= 68981350;
                                var419 = var21;
                                var2 |= -393070446;
                                var2 ^= -1219637373;
                            }

                            double var358 = var357 + var419;
                            var398[var259] = var358;
                            var16 = var3;
                            var18 = var16 + 1L;
                            var18 = var16 * var18;
                            var20 = var16 + 2L;
                            var18 *= var20;
                            var16 += 3L;
                            var18 *= var16;
                            var16 = var18 & 7L;
                            long var509;
                            int var362 = (var509 = var16 - 0L) == 0L ? 0 : (var509 < 0L ? -1 : 1);
                            if (var362 != 0) {
                                var2 &= -708090301;
                                var2 |= 832893983;
                                var2 ^= 596365892;
                                var2 ^= -279273070;
                                break label337;
                            }
                            var2 = switch (var2) {
                                case 707723439 -> var2 ^ -1351995972;
                                case 1287565876 -> {
                                    var2 += 448091054;
                                    var2 *= -761829743;
                                    var2 >>= 20;
                                    yield var2 ^ -588824697;
                                }
                                default -> var2 ^ 86874555;
                            };
                            int var363 = var259 + 1;
                            var259 = var363;
                            var2 += 1236212603;
                            var2 *= 439256009;
                            var2 -= -2101451968;
                            var2 ^= -1341433317;
                        }
                    }
                }

                IllegalStateException var241 = new IllegalStateException();
                throw var241;
            }
        }

        IllegalArgumentException var239 = new IllegalArgumentException();
        throw var239;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 317221022;
        int var2 = Yn.C;
        int var4 = of_2.kj(var3, var1, var2);
        j = var4;
        SpriteShape[] var5 = new SpriteShape[3];
        SpriteShape var6 = SpriteShape.STAR;
        var5[0] = var6;
        SpriteShape var7 = SpriteShape.HEART;
        var5[1] = var7;
        SpriteShape var8 = SpriteShape.GLOW;
        var5[2] = var8;
        EJ = var5;
    }
}
