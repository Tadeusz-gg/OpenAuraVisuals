package mvggs.modules.hud;

import dev.aurap.hub.*;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.GlyphTint;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Objects;
import java.util.function.BooleanSupplier;

public final class watermark extends tR_2 {
    private static final String KR = "aura-visuals.pl";
    private static final float oK = 15.0F;
    private static final float aZ = 8.0F;
    private static final float x = 4.5F;
    private static final float f = 7.0F;
    private static final float dc = 0.8F;
    private static final float Na = 26.0F;
    private static final TextStyle xh;
    private static final TextStyle Vu;
    private static final TextStyle u;
    private final r_2 tw;
    private final JL fq;
    private final JL B;
    private final JL D;
    private final Uq Lf;
    private TextStyle Lh;
    private TextStyle uY;
    private TextStyle Pi;
    private final StringBuilder dZ;
    private final StringBuilder C;
    private final Re jt;
    private boolean Us;
    private float HT;
    private float kW;
    private float lj;
    private int o;
    private int L;
    private final GlyphTint t;
    public static final int gm;

    public watermark() {
        super("watermark", "Watermark", Cl_2.TOP_LEFT, 4.0F, 4.0F, 2.0F);
        Cl_2 var1 = Cl_2.TOP_LEFT;

        cK var2 = cK.SLASH;
        r_2 var4 = new r_2("separator", "Separator", var2);
        xB var5 = this.vn(var4);
        r_2 var6 = (r_2)var5;
        this.tw = var6;
        JL var7 = new JL("ping", "Ping", true);
        xB var8 = this.vn(var7);
        JL var9 = (JL)var8;
        this.fq = var9;
        JL var10 = new JL("fps", "FPS", true);
        xB var11 = this.vn(var10);
        JL var12 = (JL)var11;
        this.B = var12;
        JL var13 = new JL("shimmer", "Shimmer", true);
        xB var14 = this.vn(var13);
        JL var15 = (JL)var14;
        this.D = var15;
        Uq var16 = new Uq("shimmer_every", "Shimmer Every", 4.0F, 1.5F, 15.0F);
        Uq var17 = var16.W(0.5F);
        Uq var18 = var17.L("s");
        JL var30 = this.D;
        Object var3 = Objects.requireNonNull(var30);
        BooleanSupplier var31 = var30::vb;
        xB var19 = var18.Pt(var31);
        Uq var20 = (Uq)var19;
        xB var21 = this.vn(var20);
        Uq var22 = (Uq)var21;
        this.Lf = var22;
        TextStyle var23 = xh;
        this.Lh = var23;
        TextStyle var24 = Vu;
        this.uY = var24;
        TextStyle var25 = u;
        this.Pi = var25;
        StringBuilder var26 = new StringBuilder(12);
        this.dZ = var26;
        StringBuilder var27 = new StringBuilder(12);
        this.C = var27;
        Re var28 = new Re(0.0F, 0.09F);
        this.jt = var28;
        this.Us = true;
        this.kW = -1.0F;
        GlyphTint var29 = this::Qb;
        this.t = var29;
        this.dy("aura-visuals.pl · ping · FPS, with a light sweep in the accent gradient.");
        this.fJ(true);
    }

    public void p() {
        int var1 = gm;
        var1 ^= -29503455;
        int var2 = System.identityHashCode(this);
        this.HT = 0.0F;
        long var22 = var2;
        long var4 = var22 + 1L;
        var4 = var22 * var4;
        long var6 = var22 + 2L;
        var4 *= var6;
        long var23 = var22 + 3L;
        var4 *= var23;
        long var24 = var4 & 7L;
        long var33;
        var2 = (var33 = var24 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -1850670226;
            var1 ^= 665144345;
            var1 += 1308545688;
            var1 ^= -1836554291;
            Integer var26 = var1;
            if (var26 != null) {
                this.kW = 0.0F;
                return;
            }
        } else {
            var1 >>>= 6;
            var1 *= -657954869;
            var1 ^= 1511801354;
            long var16 = var1;
            long var3 = var16 + 1L;
            var3 = var16 * var3;
            long var5 = var16 + 2L;
            var3 *= var5;
            long var17 = var16 + 3L;
            var3 *= var17;
            long var18 = var3 & 7L;
            long var34;
            var1 = (var34 = var18 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    @Override
    protected void r(Oo var1) {
        int var2 = gm;
        var2 ^= 1073848970;
        int var3 = System.identityHashCode(this);
        TextStyle var4 = xh;
        int var5 = var1.MD();
        var4 = var4.color(var5);
        this.Lh = var4;
        var4 = Vu;
        var5 = var1.FM();
        var4 = var4.color(var5);
        this.uY = var4;
        var4 = u;
        long var36 = var3;
        long var7 = var36 + 1L;
        var7 = var36 * var7;
        long var37 = var7 & 1L;
        long var43;
        var3 = (var43 = var37 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 |= 1885944988;
            var2 += -1963728473;
            var2 += 808156411;
            var2 ^= 852199887;
            long var38 = var2;
            var7 = var38 + 1L;
            var7 = var38 * var7;
            long var39 = var7 & 1L;
            long var44;
            var3 = (var44 = var39 - 0L) == 0L ? 0 : (var44 < 0L ? -1 : 1);
            if (var3 == 0) {
                var3 = var1.bb();
                TextStyle var25 = var4.color(var3);
                this.Pi = var25;
                return;
            }
        } else {
            var2 <<= 7;
            var2 ^= -2044311923;
            var2 ^= -587301067;
            var2 ^= 1817265638;
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var34 = var2 + 2;
            var3 *= var34;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    @Override
    protected void Mf() {
        int var1 = gm;
        var1 ^= -1672305608;
        int var2 = System.identityHashCode(this);
        this.Us = true;
        this.HT = 0.0F;
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            switch (var1) {
                case -929158293:
                    var1 ^= -81135869;
                    break;
                case 205053500:
                    var1 *= 1780374449;
                    var1 *= 1805170393;
                    var1 += -671224070;
                    var1 ^= 2135540649;
                    break;
                case 1269587834:
                default:
                    var1 ^= -1945250815;
            }

            this.kW = 0.0F;
        } else {
            var1 |= -1357900339;
            var1 += 1476183263;
            var1 >>>= 3;
            var1 ^= 1390351112;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            }
        }
    }

    @Override
    protected boolean BM(lH_3 var1) {
        label223: {
            int var2 = gm;
            var2 ^= 252124447;
            int var3 = System.identityHashCode(this);
            StringBuilder var4 = this.dZ;
            var4.setLength(0);
            var4 = this.dZ;
            int var5 = i_2.g();
            var4 = var4.append(var5);
            var4 = var4.append(" ms");
            Integer var161 = var3;
            if (var161 == null) {
                var2 *= -421076803;
                var2 -= 795486094;
                var2 ^= -1304831686;
            } else {
                label225: {
                    var2 &= 1302729695;
                    var2 ^= -1565454950;
                    Integer var162 = var2;
                    if (var162 == null) {
                        break label223;
                    }

                    var4 = this.C;
                    var4.setLength(0);
                    var4 = this.C;
                    var5 = i_2.r();
                    var4 = var4.append(var5);
                    var4 = var4.append(" FPS");
                    TextStyle var167 = this.Lh;
                    float var168 = var1.me("aura-visuals.pl", var167);
                    r_2 var218 = this.tw;
                    Enum var219 = var218.A();
                    cK var220 = (cK)var219;
                    String var221 = var220.glyph;
                    TextStyle var6 = this.Pi;
                    float var222 = var1.me(var221, var6);
                    float var223 = var222 + 9.0F;
                    JL var271 = this.fq;
                    boolean var272 = var271.vb();
                    float var280;
                    if (var272) {
                        var2 = switch (var2) {
                            case -1349185919 -> {
                                var2 -= 2111021425;
                                var2 *= -204949489;
                                var2 >>>= 3;
                                var2 |= 1277187931;
                                yield var2 ^ -125664145;
                            }
                            default -> var2 ^ -1300265437;
                            case -573420650 -> var2 ^ -1830699043;
                        };
                        long var273 = var2;
                        long var8 = var273 + 1L;
                        var8 = var273 * var8;
                        long var274 = var8 & 1L;
                        long var337;
                        int var275 = (var337 = var274 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                        if (var275 != 0) {
                            break label223;
                        }

                        StringBuilder var276 = this.dZ;
                        Integer var7 = var3;
                        if (var7 == null) {
                            switch (var2) {
                                case -1239033072:
                                    var2 -= 1293727396;
                                    var2 |= -737141824;
                                    var2 ^= 1844736439;
                                    break label225;
                                case 1803488738:
                                    var2 ^= -1753341245;
                                    break label225;
                                case 1952274252:
                                default:
                                    var2 ^= -468368556;
                                    break label225;
                            }
                        }

                        var2 |= -663128863;
                        var2 |= 857189309;
                        var2 *= -1165144423;
                        var2 ^= 1593491864;
                        var2 ^= -444728336;
                        TextStyle var291 = this.uY;
                        float var277 = var1.me(var276, var291);
                        float var278 = var223 + var277;
                        float var279 = var168 + var278;
                        var280 = var279;
                        var2 *= 805564833;
                        var2 ^= 1071414704;
                    } else {
                        var2 -= -655887699;
                        var2 ^= -245877930;
                        int var292 = var2 + 1;
                        var292 = var2 * var292;
                        var292 &= 1;
                        if (var292 != 0) {
                            break label223;
                        }

                        var280 = var168;
                        var2 ^= -1713105464;
                        var2 += -1790322253;
                        var2 ^= -490603260;
                        var2 ^= -2015485132;
                    }

                    int var169 = var2 + 1;
                    int var170 = var2 * var169;
                    int var171 = var170 & 1;
                    if (var171 != 0) {
                        break label223;
                    }

                    JL var172 = this.B;
                    boolean var173 = var172.vb();
                    Integer var295 = var3;
                    label213:
                    if (var295 != null) {
                        var2 ^= -608474309;
                        var2 <<= 22;
                        var2 &= -2070562148;
                        var2 &= -1321233563;
                        var2 ^= 524705491;
                        var295 = var2;
                        if (var295 == null) {
                            break label223;
                        }

                        float var183;
                        if (var173) {
                            var2 &= -1277569616;
                            var2 ^= -1739054427;
                            int var174 = var2 + 1;
                            int var175 = var2 * var174;
                            int var297 = var2 + 2;
                            int var176 = var175 * var297;
                            var297 = var2 + 3;
                            int var177 = var176 * var297;
                            int var178 = var177 & 7;
                            if (var178 != 0) {
                                break label223;
                            }

                            var4 = this.C;
                            TextStyle var299 = this.uY;
                            float var180 = var1.me(var4, var299);
                            float var181 = var223 + var180;
                            float var182 = var280 + var181;
                            long var300 = var3;
                            long var9 = var300 + 1L;
                            var9 = var300 * var9;
                            long var301 = var9 & 1L;
                            long var338;
                            var5 = (var338 = var301 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                var2 *= 1339846881;
                                var2 += 991232821;
                                var2 += 1345743051;
                                var2 ^= 1625542350;
                                break label213;
                            }

                            var2 &= -301996257;
                            var2 ^= -6044053;
                            var183 = var182;
                            var2 -= 1974225137;
                            var2 ^= -534611140;
                            var2 &= -65504069;
                            var2 ^= -1948279589;
                            var2 ^= 421746646;
                        } else {
                            var2 <<= 3;
                            var2 += 1594490710;
                            var2 *= 1223947597;
                            var2 ^= -1504644821;
                            Integer var225 = var2;
                            if (var225 == null) {
                                break label223;
                            }

                            var183 = var280;
                            var2 -= 1883831980;
                            var2 += 401500069;
                            var2 *= -632402465;
                            var2 ^= 417743670;
                        }

                        long var226 = var2;
                        long var302 = var226 + 1L;
                        long var303 = var226 * var302;
                        long var332 = var226 + 2L;
                        long var304 = var303 * var332;
                        long var227 = var226 + 3L;
                        long var305 = var304 * var227;
                        long var228 = var305 & 7L;
                        long var339;
                        var5 = (var339 = var228 - 0L) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label223;
                        }

                        float var184 = var183 + 16.0F;
                        long var230 = var3;
                        long var306 = var230 + 1L;
                        long var307 = var230 * var306;
                        long var231 = var307 & 1L;
                        long var340;
                        var5 = (var340 = var231 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            var2 ^= 830528215;
                            var2 -= 1205048366;
                            var2 &= 1939624320;
                            var2 ^= -479375525;
                        } else {
                            label229: {
                                var2 <<= 11;
                                var2 &= 521793520;
                                var2 ^= -691713974;
                                long var233 = var2;
                                long var308 = var233 + 1L;
                                long var309 = var233 * var308;
                                var332 = var233 + 2L;
                                long var310 = var309 * var332;
                                long var234 = var233 + 3L;
                                long var311 = var310 * var234;
                                long var235 = var311 & 7L;
                                long var341;
                                var5 = (var341 = var235 - 0L) == 0L ? 0 : (var341 < 0L ? -1 : 1);
                                if (var5 != 0) {
                                    break label223;
                                }

                                int var237 = (this.Us ? 1 : 0);
                                if (var237 != 0) {
                                    var2 ^= 1435338307;
                                    var2 ^= -227468052;
                                    long var238 = var2;
                                    long var312 = var238 + 1L;
                                    long var313 = var238 * var312;
                                    long var239 = var313 & 1L;
                                    long var342;
                                    var237 = (var342 = var239 - 0L) == 0L ? 0 : (var342 < 0L ? -1 : 1);
                                    if (var237 != 0) {
                                        break label223;
                                    }

                                    Re var241 = this.jt;
                                    var241.v(var184);
                                    Integer var242 = var3;
                                    if (var242 == null) {
                                        switch (var2) {
                                            case 102979264:
                                            default:
                                                var2 ^= -1490716506;
                                                break label229;
                                            case 1171035803:
                                                var2 ^= 1051466341;
                                                break label229;
                                            case 1981821669:
                                                var2 *= 2102589539;
                                                var2 ^= 1262921511;
                                                var2 ^= 632319987;
                                                break label229;
                                        }
                                    }

                                    var2 >>>= 20;
                                    var2 -= -1215055521;
                                    var2 *= 1338435199;
                                    var2 ^= -1552232941;
                                    var2 ^= 782486901;
                                    int var243 = var2 + 1;
                                    var243 = var2 * var243;
                                    var243 &= 1;
                                    if (var243 != 0) {
                                        break label223;
                                    }

                                    this.Us = false;
                                    var2 >>= 1;
                                    var2 |= 1372942860;
                                    var2 *= 151325769;
                                    var2 ^= 281837304;
                                } else {
                                    switch (var2) {
                                        case -1841070874:
                                        default:
                                            var2 ^= -1996720039;
                                            break;
                                        case -774068150:
                                            var2 -= -898203771;
                                            var2 += 100911128;
                                            var2 ^= -1018239856;
                                            break;
                                        case -400041824:
                                            var2 ^= 72235914;
                                    }
                                }

                                Re var246 = this.jt;
                                float var281 = var1.l();
                                float var185 = var246.Gc(var184, var281);
                                long var247 = var3;
                                long var314 = var247 + 1L;
                                long var315 = var247 * var314;
                                var332 = var247 + 2L;
                                long var316 = var315 * var332;
                                long var248 = var247 + 3L;
                                long var317 = var316 * var248;
                                long var249 = var317 & 7L;
                                long var343;
                                var237 = (var343 = var249 - 0L) == 0L ? 0 : (var343 < 0L ? -1 : 1);
                                if (var237 != 0) {
                                    var2 -= -1354342217;
                                    var2 &= -1870431128;
                                    var2 ^= -2140307877;
                                } else {
                                    label231: {
                                        var2 &= -915125342;
                                        var2 ^= 1678593608;
                                        var2 *= -1806371453;
                                        var2 ^= -1098341408;
                                        var2 ^= 923813524;
                                        long var251 = var2;
                                        long var318 = var251 + 1L;
                                        long var319 = var251 * var318;
                                        long var252 = var319 & 1L;
                                        long var344;
                                        var237 = (var344 = var252 - 0L) == 0L ? 0 : (var344 < 0L ? -1 : 1);
                                        if (var237 != 0) {
                                            break label223;
                                        }

                                        this.dV(var185, 15.0F);
                                        Oo var186 = var1.x();
                                        int var187 = var186.E();
                                        this.o = var187;
                                        Oo var188 = var1.x();
                                        int var189 = var188.P();
                                        this.L = var189;
                                        float var190 = this.HT;
                                        float var254 = var1.l();
                                        float var191 = var190 + var254;
                                        this.HT = var191;
                                        JL var192 = this.D;
                                        boolean var193 = var192.vb();
                                        if (var193) {
                                            var2 ^= -1037765636;
                                            var2 *= -958685047;
                                            var2 ^= -1191813857;
                                            Integer var194 = var2;
                                            if (var194 == null) {
                                                break label223;
                                            }

                                            float var195 = this.HT;
                                            Uq var255 = this.Lf;
                                            Integer var282 = var3;
                                            if (var282 == null) {
                                                var2 &= -1455612127;
                                                var2 <<= 3;
                                                var2 <<= 6;
                                                var2 ^= -1698476965;
                                                break label231;
                                            }
                                            var2 = switch (var2) {
                                                default -> var2 ^ 1727163769;
                                                case -1245358129 -> {
                                                    var2 *= -1537958649;
                                                    var2 |= 756460534;
                                                    var2 -= 86637077;
                                                    var2 *= -316151123;
                                                    yield var2 ^ 1894212131;
                                                }
                                                case -72461518 -> var2 ^ -2131769848;
                                            };
                                            float var256 = var255.WM();
                                            float var345;
                                            int var196 = (var345 = var195 - var256) == 0.0F ? 0 : (var345 < 0.0F ? -1 : 1);
                                            if (var196 >= 0) {
                                                var2 ^= 376329743;
                                                var2 ^= -458168651;
                                                var2 >>>= 21;
                                                var2 *= -361437339;
                                                var2 ^= 1058471547;
                                                this.HT = 0.0F;
                                                long var197 = var3;
                                                long var283 = var197 + 1L;
                                                long var284 = var197 * var283;
                                                long var329 = var197 + 2L;
                                                long var285 = var284 * var329;
                                                long var198 = var197 + 3L;
                                                long var286 = var285 * var198;
                                                long var199 = var286 & 7L;
                                                long var346;
                                                int var200 = (var346 = var199 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                                                if (var200 != 0) {
                                                    var2 *= 1769806719;
                                                    var2 &= -1776305707;
                                                    var2 ^= 15759311;
                                                    break label231;
                                                }

                                                var2 <<= 15;
                                                var2 &= 276910309;
                                                var2 += -1066920595;
                                                var2 ^= -834351428;
                                                this.kW = 0.0F;
                                                var2 += -268839250;
                                                var2 ^= 1448999179;
                                                var2 ^= 1994706910;
                                            } else {
                                                var2 += -2097002061;
                                                var2 ^= 2006006593;
                                                var2 |= 580598272;
                                                var2 ^= -450872481;
                                            }
                                        } else {
                                            var2 -= -107398907;
                                            var2 += 1058928353;
                                            var2 |= -1847233137;
                                            var2 ^= 1633841445;
                                        }

                                        Integer var201 = var2;
                                        if (var201 == null) {
                                            break label223;
                                        }

                                        float var202 = this.kW;
                                        float var347;
                                        int var203 = (var347 = var202 - 0.0F) == 0.0F ? 0 : (var347 < 0.0F ? -1 : 1);
                                        Integer var257 = var3;
                                        label183:
                                        if (var257 != null) {
                                            var2 |= -1651947101;
                                            var2 += -921288088;
                                            var2 -= -487515133;
                                            var2 += -1970465772;
                                            var2 ^= 891128374;
                                            long var258 = var2;
                                            long var320 = var258 + 1L;
                                            long var321 = var258 * var320;
                                            var332 = var258 + 2L;
                                            long var322 = var321 * var332;
                                            long var259 = var258 + 3L;
                                            long var323 = var322 * var259;
                                            long var260 = var323 & 7L;
                                            long var348;
                                            int var261 = (var348 = var260 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                                            if (var261 != 0) {
                                                break label223;
                                            }

                                            if (var203 >= 0) {
                                                var2 += -583062273;
                                                var2 ^= -759519702;
                                                Integer var204 = var2;
                                                if (var204 == null) {
                                                    break label223;
                                                }

                                                float var205 = this.kW;
                                                float var262 = var1.l();
                                                float var263 = var262 / 0.8F;
                                                float var206 = var205 + var263;
                                                this.kW = var206;
                                                Integer var207 = var3;
                                                if (var207 == null) {
                                                    var2 |= -632432623;
                                                    var2 |= -961149349;
                                                    var2 ^= 1309839648;
                                                    break label183;
                                                }

                                                var2 |= 1652839818;
                                                var2 -= 872958293;
                                                var2 |= -980278885;
                                                var2 ^= -582692122;
                                                float var208 = this.kW;
                                                float var349;
                                                int var209 = (var349 = var208 - 1.0F) == 0.0F ? 0 : (var349 < 0.0F ? -1 : 1);
                                                if (var209 > 0) {
                                                    var2 ^= -1194301623;
                                                    var2 ^= -184643813;
                                                    var2 ^= -1115569184;
                                                    this.kW = -1.0F;
                                                    var2 |= 419718700;
                                                    var2 ^= 774881368;
                                                } else {
                                                    var2 &= -1709353259;
                                                    var2 |= -214958551;
                                                    var2 ^= -1556764112;
                                                    var2 ^= -1519355138;
                                                }
                                            } else {
                                                var2 ^= 1491745706;
                                                var2 <<= 18;
                                                var2 *= 1701179707;
                                                var2 ^= -522572041;
                                            }

                                            long var210 = var2;
                                            long var287 = var210 + 1L;
                                            long var288 = var210 * var287;
                                            long var330 = var210 + 2L;
                                            long var289 = var288 * var330;
                                            long var211 = var210 + 3L;
                                            long var290 = var289 * var211;
                                            long var212 = var290 & 7L;
                                            long var350;
                                            int var213 = (var350 = var212 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                                            if (var213 != 0) {
                                                break label223;
                                            }

                                            float var214 = this.tQ();
                                            var261 = var3 + 1;
                                            var261 = var3 * var261;
                                            var3 = var261 & 1;
                                            if (var3 == 0) {
                                                var2 += 1230263570;
                                                var2 ^= -1871710410;
                                                long var266 = var2;
                                                long var324 = var266 + 1L;
                                                long var325 = var266 * var324;
                                                var332 = var266 + 2L;
                                                long var326 = var325 * var332;
                                                long var267 = var266 + 3L;
                                                long var327 = var326 * var267;
                                                long var268 = var327 & 7L;
                                                long var351;
                                                var3 = (var351 = var268 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                                                if (var3 == 0) {
                                                    float var156 = var214 + 26.0F;
                                                    Lv var215 = sT_2.q;
                                                    float var269 = this.kW;
                                                    float var270 = TP.S(var269);
                                                    float var216 = var215.l(var270);
                                                    float var157 = TP.GO(-26.0F, var156, var216);
                                                    this.lj = var157;
                                                    return true;
                                                }
                                                break label223;
                                            }

                                            var2 >>>= 20;
                                            var2 <<= 16;
                                            var2 += 657450229;
                                            var2 ^= -1502893394;
                                        } else {
                                            var2 += 1193760839;
                                            var2 += 1297882157;
                                            var2 ^= -472926395;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var2 |= 1916727773;
                        var2 ^= -426526842;
                    }
                }
            }

            Integer var151 = var2;
            if (var151 != null) {
                UnsupportedOperationException var152 = new UnsupportedOperationException();
                throw var152;
            }
        }

        IllegalStateException var153 = new IllegalStateException();
        throw var153;
    }

    @Override
    protected void BO(hr var1, lH_3 var2) {
        int var3 = gm;
        var3 ^= 520794431;
        int var4 = System.identityHashCode(this);
        float var5 = this.tQ();
        Integer var20 = var4;
        if (var20 == null) {
            switch (var3) {
                case -1889481925:
                    var3 *= -1091894241;
                    var3 *= -1403657209;
                    var3 ^= 1682108087;
                    break;
                case 1042456909:
                    var3 ^= -2039508658;
                    break;
                case 1407930850:
                default:
                    var3 ^= 385503660;
            }

            AssertionError var25 = new AssertionError();
            throw var25;
        } else {
            var3 = switch (var3) {
                case -1889481925 -> {
                    var3 &= -556055892;
                    var3 ^= -869982175;
                    var3 &= 1095787109;
                    yield var3 ^ 605869775;
                }
                case 80393637 -> var3 ^ -1948344335;
                default -> var3 ^ -1370515462;
            };
            int var21 = var3 + 1;
            var21 = var3 * var21;
            int var6 = var3 + 2;
            var21 *= var6;
            var3 += 3;
            var21 *= var3;
            var3 = var21 & 7;
            if (var3 != 0) {
                AssertionError var14 = new AssertionError();
                throw var14;
            } else {
                var1.Ky(0.0F, 0.0F, var5, 15.0F, 7.5F);
            }
        }
    }

    @Override
    protected void G(Canvas var1, lH_3 var2) {
        float var154 = 0.0F;
        label215: {
            int var127;
            label225: {
                var127 = gm;
                var127 ^= 326463126;
                int var4 = System.identityHashCode(this);
                Integer var5 = var4;
                label212:
                if (var5 != null) {
                    var127 |= 631415507;
                    var127 &= -954067743;
                    var127 ^= 624695847;
                    int var151 = var127 + 1;
                    var151 = var127 * var151;
                    var151 &= 1;
                    if (var151 != 0) {
                        break label215;
                    }

                    int var174;
                    label219: {
                        var154 = this.tQ();
                        float var6 = this.kW;
                        float var264;
                        var174 = (var264 = var6 - 0.0F) == 0.0F ? 0 : (var264 < 0.0F ? -1 : 1);
                        if (var174 >= 0) {
                            var127 ^= -499446821;
                            var127 ^= 6718140;
                            var127 &= 551027283;
                            var127 ^= -701422050;
                            Integer var166 = var127;
                            if (var166 == null) {
                                break label215;
                            }

                            JL var167 = this.D;
                            long var7 = var4;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var7 = var9 & 1L;
                            long var265;
                            int var183 = (var265 = var7 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                            if (var183 != 0) {
                                var127 >>= 8;
                                var127 &= 1894326268;
                                var127 >>= 9;
                                var127 *= -1245456115;
                                var127 ^= -79495185;
                                break label212;
                            }

                            var127 ^= 1929959717;
                            var127 &= -1322009465;
                            var127 *= 652983613;
                            var127 ^= 1231003558;
                            Integer var184 = var127;
                            if (var184 == null) {
                                break label215;
                            }

                            boolean var168 = var167.vb();
                            if (var168) {
                                var127 -= 1112470158;
                                var127 |= 1438311730;
                                var127 *= -951723761;
                                var127 ^= -1899636618;
                                int var169 = var127 + 1;
                                var169 = var127 * var169;
                                int var185 = var127 + 2;
                                var169 *= var185;
                                int var186 = var127 + 3;
                                var169 *= var186;
                                var169 &= 7;
                                if (var169 != 0) {
                                    break label215;
                                }

                                var174 = 1;
                                var127 &= -58355889;
                                var127 |= 2143755863;
                                var127 |= -1360004179;
                                var127 <<= 8;
                                var127 ^= -1067307094;
                                break label219;
                            }

                            switch (var127) {
                                case -457441688:
                                default:
                                    var127 ^= -1419790814;
                                    break;
                                case 1260575196:
                                    var127 += -2135359129;
                                    var127 += -1115431036;
                                    var127 |= 946389314;
                                    var127 ^= -1311141670;
                                    var127 ^= 630352090;
                                    break;
                                case 1503667373:
                                    var127 ^= 578848237;
                            }
                        } else {
                            var127 >>= 2;
                            var127 ^= -978091906;
                        }

                        int var187 = var127 + 1;
                        var187 = var127 * var187;
                        var187 &= 1;
                        if (var187 != 0) {
                            break label215;
                        }

                        var174 = 0;
                        var127 += 1630013276;
                        var127 |= -2141150707;
                        var127 &= -1197591502;
                        var127 ^= -1484656504;
                    }

                    long var190 = var4;
                    long var224 = var190 + 1L;
                    var224 = var190 * var224;
                    long var11 = var190 + 2L;
                    var224 *= var11;
                    var190 += 3L;
                    var224 *= var190;
                    var190 = var224 & 7L;
                    long var266;
                    int var193 = (var266 = var190 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                    if (var193 == 0) {
                        var127 |= -2004214529;
                        var127 |= -939801113;
                        var127 ^= -1039420829;
                        if (var174 != 0) {
                            var127 |= -414793830;
                            var127 *= 1407365057;
                            var127 ^= -2050604698;
                            Integer var194 = var127;
                            if (var194 == null) {
                                break label215;
                            }

                            int var195 = var127 >>> 11;
                            int var196 = var195 ^ 740747562;
                            this.T(var1, var154, var196);
                            var127 &= -555146672;
                            var127 |= -746962328;
                            var127 |= 795693203;
                            var127 ^= -1336043058;
                            var127 ^= -1501342495;
                        } else {
                            var127 *= 1393385695;
                            var127 ^= -1295624728;
                            var127 <<= 20;
                            var127 ^= 971096020;
                        }

                        GlyphTint var177;
                        if (var174 != 0) {
                            var127 = switch (var127) {
                                case -383664172 -> {
                                    var127 ^= -1030269238;
                                    var127 += 1828181130;
                                    var127 ^= -142868963;
                                    yield var127 ^ -1893526326;
                                }
                                default -> var127 ^ -671469828;
                                case 644469503 -> var127 ^ -314415646;
                            };
                            Integer var175 = var127;
                            if (var175 == null) {
                                break label215;
                            }

                            GlyphTint var176 = this.t;
                            Integer var197 = var4;
                            if (var197 == null) {
                                var127 |= 1990984327;
                                var127 |= -1284575242;
                                var127 ^= -8178808;
                                var127 ^= 1768201200;
                                break label212;
                            }

                            var127 |= 500612092;
                            var127 <<= 1;
                            var127 ^= -567379996;
                            var127 >>>= 1;
                            var127 ^= -1091607982;
                            Integer var198 = var127;
                            if (var198 == null) {
                                break label215;
                            }

                            var177 = var176;
                            var127 |= -452783617;
                            var127 |= -242478062;
                            var127 -= 570572203;
                            var127 += 990804651;
                            var127 ^= 360442716;
                        } else {
                            var127 ^= 823127129;
                            var127 -= 1622969959;
                            var127 += -341262207;
                            var127 -= -369555221;
                            var127 ^= 1833264005;
                            int var199 = var127 + 1;
                            int var200 = var127 * var199;
                            int var8 = var127 + 2;
                            int var201 = var200 * var8;
                            var8 = var127 + 3;
                            int var202 = var201 * var8;
                            int var203 = var202 & 7;
                            if (var203 != 0) {
                                break label215;
                            }

                            var177 = null;
                            var127 *= 92274115;
                            var127 -= -1312246130;
                            var127 ^= 1618835838;
                        }

                        var190 = var127;
                        var224 = var190 + 1L;
                        var224 = var190 * var224;
                        var190 = var224 & 1L;
                        long var267;
                        int var206 = (var267 = var190 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                        if (var206 != 0) {
                            break label215;
                        }

                        float var207 = 4.0F;
                        var1.save();
                        long var210 = var4;
                        long var10 = var210 + 1L;
                        var10 = var210 * var10;
                        long var12 = var210 + 2L;
                        var10 *= var12;
                        var210 += 3L;
                        var10 *= var210;
                        var210 = var10 & 7L;
                        long var268;
                        int var213 = (var268 = var210 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                        if (var213 != 0) {
                            switch (var127) {
                                case -1569329206:
                                default:
                                    var127 ^= 1230357440;
                                    break label212;
                                case -852399381:
                                    var127 ^= -197234236;
                                    break label212;
                                case 65019811:
                                    var127 &= -1124107381;
                                    var127 += 544976565;
                                    var127 |= -1195452137;
                                    var127 ^= -655979336;
                            }
                        } else {
                            var127 *= -230326239;
                            var127 -= -1558178132;
                            var127 ^= -1091729015;
                            Integer var214 = var127;
                            if (var214 == null) {
                                break label215;
                            }

                            var1.clip(0.0F, 0.0F, var154, 15.0F, 7.5F);
                            float var155 = 8.0F;
                            TextStyle var215 = this.Lh;
                            float var216 = var1.text("aura-visuals.pl", var155, var207, var215, var177);
                            float var156 = var155 + var216;
                            JL var217 = this.fq;
                            boolean var218 = var217.vb();
                            float var221;
                            if (var218) {
                                var127 = switch (var127) {
                                    default -> var127 ^ 1502617697;
                                    case 929690846 -> {
                                        var127 |= 734158099;
                                        var127 |= 1958808513;
                                        yield var127 ^ 861293246;
                                    }
                                    case 1414988753 -> var127 ^ 2042985828;
                                };
                                StringBuilder var219 = this.dZ;
                                int var230 = var127 * 930154635;
                                int var231 = var230 - -1788537667;
                                int var232 = var231 << 11;
                                int var233 = var232 ^ -1910148123;
                                float var220 = this.LL(var1, var219, var156, var207, var177, var233);
                                var224 = var4;
                                var11 = var224 + 1L;
                                var11 = var224 * var11;
                                long var13 = var224 + 2L;
                                var11 *= var13;
                                var224 += 3L;
                                var11 *= var224;
                                var224 = var11 & 7L;
                                long var269;
                                int var237 = (var269 = var224 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                                if (var237 != 0) {
                                    switch (var127) {
                                        case -355148202:
                                        default:
                                            var127 ^= 856879009;
                                            break label212;
                                        case -608949:
                                            var127 ^= -1726485317;
                                            break label212;
                                        case 1287501153:
                                            var127 -= -1946572570;
                                            var127 ^= -1579328516;
                                            break label212;
                                    }
                                }
                                var127 = switch (var127) {
                                    default -> var127 ^ -561009589;
                                    case -298020039 -> var127 ^ 387443546;
                                    case 1287501153 -> {
                                        var127 += -216334266;
                                        yield var127 ^ -581778467;
                                    }
                                };
                                var221 = var220;
                                var127 |= 687527215;
                                var127 *= -1925185551;
                                var127 ^= -1351416415;
                            } else {
                                var127 *= -1932148553;
                                var127 |= 312799429;
                                var127 >>= 20;
                                var127 &= 1158007857;
                                var127 ^= -120917815;
                                var224 = var127;
                                var11 = var224 + 1L;
                                var11 = var224 * var11;
                                long var262 = var224 + 2L;
                                var11 *= var262;
                                var224 += 3L;
                                var11 *= var224;
                                var224 = var11 & 7L;
                                long var270;
                                int var241 = (var270 = var224 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                                if (var241 != 0) {
                                    break label215;
                                }

                                var221 = var156;
                                var127 &= 301492631;
                                var127 ^= -1313858882;
                            }

                            var224 = var127;
                            var11 = var224 + 1L;
                            var11 = var224 * var11;
                            long var263 = var224 + 2L;
                            var11 *= var263;
                            var224 += 3L;
                            var11 *= var224;
                            var224 = var11 & 7L;
                            long var271;
                            var151 = (var271 = var224 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                            if (var151 != 0) {
                                break label215;
                            }

                            JL var158 = this.B;
                            boolean var159 = var158.vb();
                            Integer var245 = var4;
                            if (var245 != null) {
                                var127 |= -1127790377;
                                var127 *= 2000847993;
                                var127 *= -1408943965;
                                var127 ^= 1029519206;
                                Integer var246 = var127;
                                if (var246 == null) {
                                    break label215;
                                }

                                if (!var159) {
                                    var127 &= 41449011;
                                    var127 <<= 23;
                                    var127 &= -356222595;
                                    var127 ^= 786660059;
                                    break label225;
                                }
                                var127 = switch (var127) {
                                    case 77363169 -> var127 ^ 1640208817;
                                    default -> var127 ^ 2043229593;
                                    case 1424900243 -> {
                                        var127 += 1990232153;
                                        var127 >>= 16;
                                        var127 *= -1839577157;
                                        yield var127 ^ 1633245167;
                                    }
                                };
                                StringBuilder var160 = this.C;
                                Integer var141 = var4;
                                if (var141 != null) {
                                    var127 = switch (var127) {
                                        default -> var127 ^ 1533870033;
                                        case 476267861 -> {
                                            var127 += 1852027151;
                                            var127 &= -1977286446;
                                            yield var127 ^ -492597398;
                                        }
                                        case 1601503034 -> var127 ^ 1125992762;
                                    };
                                    int var142 = var127 | -1949582611;
                                    var142 |= 1016669567;
                                    var142 >>= 2;
                                    var142 ^= -1297224678;
                                    float var146 = this.LL(var1, var160, var221, var207, var177, var142);
                                    switch (var127) {
                                        case -1546626086:
                                            var127 ^= 1978963399;
                                            break label225;
                                        case 138874756:
                                        default:
                                            var127 ^= -1120537840;
                                            break label225;
                                        case 1755811626:
                                            var127 |= -525478932;
                                            var127 ^= -825449163;
                                            break label225;
                                    }
                                }

                                var127 += -1330104015;
                                var127 &= 964417026;
                                var127 <<= 30;
                                var127 += 1392710490;
                                var127 ^= -1306901283;
                            } else {
                                var127 += 1419732472;
                                var127 ^= -1760643167;
                            }
                        }
                    } else {
                        var127 >>= 28;
                        var127 &= -1109998313;
                        var127 += 626768555;
                        var127 ^= 1145236778;
                    }
                } else {
                    switch (var127) {
                        case -2095115118:
                            var127 *= 752581345;
                            var127 += -958539796;
                            var127 ^= -453257287;
                            break;
                        case 73612656:
                            var127 ^= -2111537883;
                            break;
                        case 2121227908:
                        default:
                            var127 ^= -1293756226;
                    }
                }

                long var135 = var127;
                long var161 = var135 + 1L;
                long var162 = var135 * var161;
                long var208 = var135 + 2L;
                long var163 = var162 * var208;
                long var136 = var135 + 3L;
                long var164 = var163 * var136;
                long var137 = var164 & 7L;
                long var272;
                var127 = (var272 = var137 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                if (var127 == 0) {
                    IllegalStateException var139 = new IllegalStateException();
                    throw var139;
                }
                break label215;
            }

            long var147 = var127;
            long var178 = var147 + 1L;
            var178 = var147 * var178;
            long var222 = var147 + 2L;
            var178 *= var222;
            var147 += 3L;
            var178 *= var147;
            var147 = var178 & 7L;
            long var273;
            int var150 = (var273 = var147 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
            if (var150 == 0) {
                var1.restore();
                return;
            }
        }

        UnsupportedOperationException var140 = new UnsupportedOperationException();
        throw var140;
    }

    private float LL(Canvas var1, CharSequence var2, float var3, float var4, GlyphTint var5, int var6) {
        int var8 = System.identityHashCode(this);
        float var9 = var3 + 4.5F;
        int var10 = var8 + 1;
        var10 = var8 * var10;
        int var11 = var8 + 2;
        var10 *= var11;
        var8 += 3;
        var10 *= var8;
        var8 = var10 & 7;
        if (var8 != 0) {
            int var25 = var6 ^ 1854855408;
            var25 |= -787358605;
            var25 ^= 646216035;
            var25 ^= -1935122031;
            var8 = var25 + 1;
            var8 = var25 * var8;
            var8 &= 1;
            if (var8 != 0) {
                IllegalArgumentException var36 = new IllegalArgumentException();
                throw var36;
            } else {
                IllegalStateException var35 = new IllegalStateException();
                throw var35;
            }
        } else {
            int var7 = var6 * -1966889545;
            var7 += 1666277475;
            var7 *= -1646439629;
            var7 ^= -1533558939;
            r_2 var16 = this.tw;
            Enum var17 = var16.A();
            cK var18 = (cK)var17;
            String var19 = var18.glyph;
            TextStyle var31 = this.Pi;
            float var20 = var1.text(var19, var9, var4, var31);
            float var21 = var9 + var20;
            float var22 = var21 + 4.5F;
            TextStyle var23 = this.uY;
            float var24 = var1.text(var2, var22, var4, var23, var5);
            return var22 + var24;
        }
    }

    private void T(Canvas var1, float var2, int var3) {
        int var5 = System.identityHashCode(this);
        float var6 = this.kW;
        var6 = TP.S(var6);
        var6 = (float) Math.PI * var6;
        double var28 = var6;
        double var29 = Math.sin(var28);
        var6 = (float)var29;
        var1.save();
        var1.clip(0.0F, 0.0F, var2, 15.0F, 7.5F);
        var1.additive(0.85F);
        float var7 = this.lj;
        var1.translate(var7, 7.5F);
        var1.transform(1.0F, -0.45F, 0.0F, 1.0F);
        int var36 = this.o;
        int var8 = this.L;
        int var37 = DP.Bp(var36, var8, 0.5F);
        Integer var20 = var5;
        if (var20 != null) {
            int var16 = var3 ^ 366265797;
            var16 += -456440873;
            var16 >>= 31;
            var16 ^= 496891248;
            long var38 = var16;
            long var10 = var38 + 1L;
            var10 = var38 * var10;
            long var39 = var10 & 1L;
            long var41;
            int var21 = (var41 = var39 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            if (var21 == 0) {
                float var23 = 0.5F * var6;
                var21 = DP.Y(var37, var23);
                int var31 = this.o;
                int var32 = DP.Y(var31, 0.0F);
                Paint var33 = Paint.horizontal(var32, var21);
                var1.rect(-20.800001F, -15.0F, 20.800001F, 30.0F, var33);
                int var34 = this.L;
                int var35 = DP.Y(var34, 0.0F);
                Paint var25 = Paint.horizontal(var21, var35);
                var1.rect(0.0F, -15.0F, 20.800001F, 30.0F, var25);
                var1.restore();
            } else {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            }
        } else {
            int var4 = var3 | 1995252017;
            var4 += -951835413;
            var4 ^= 334449609;
            var4 ^= -1897998959;
            IllegalStateException var15 = new IllegalStateException();
            throw var15;
        }
    }

    private int Qb(int var1, float var2) {
        label49: {
            int var3 = gm;
            var3 ^= 477619342;
            int var5 = System.identityHashCode(this);
            Integer var6 = var5;
            if (var6 == null) {
                var3 &= 1493103185;
                var3 += 760262862;
                var3 *= -1555595077;
                var3 <<= 27;
                var3 ^= 929567616;
            } else {
                var3 -= 200599375;
                var3 <<= 10;
                var3 += 1959370975;
                var3 += 2123352210;
                var3 ^= -255136603;
                float var54 = this.lj;
                float var55 = var2 - var54;
                float var56 = var55 / 26.0F;
                float var95;
                int var7 = (var95 = var56 - -1.0F) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
                if (var7 <= 0) {
                    var3 += -1974093715;
                    var3 ^= 1914074417;
                    var3 ^= -334382437;
                    return var1;
                }

                var3 -= -390873254;
                var3 ^= -1728997853;
                var3 ^= 1951224522;
                float var96;
                var7 = (var96 = var56 - 1.0F) == 0.0F ? 0 : (var96 < 0.0F ? -1 : 1);
                int var8 = var5 + 1;
                var8 = var5 * var8;
                int var9 = var5 + 2;
                var8 *= var9;
                var9 = var5 + 3;
                var8 *= var9;
                var8 &= 7;
                if (var8 != 0) {
                    var3 ^= -441397718;
                    var3 ^= -964909534;
                    var3 >>>= 3;
                    var3 ^= -246474413;
                } else {
                    var3 *= 2002276387;
                    var3 >>>= 25;
                    var3 ^= -785999696;
                    var3 ^= -1259885373;
                    var8 = var1 + 1;
                    var8 = var1 * var8;
                    var8 &= 1;
                    if (var8 != 0) {
                        break label49;
                    }

                    if (var7 >= 0) {
                        var3 <<= 19;
                        var3 ^= -842678805;
                        return var1;
                    }

                    var3 ^= 1901781781;
                    var3 ^= 1423580874;
                    long var63 = var1;
                    long var85 = var63 + 1L;
                    long var86 = var63 * var85;
                    long var11 = var63 + 2L;
                    long var87 = var86 * var11;
                    long var64 = var63 + 3L;
                    long var88 = var87 * var64;
                    long var65 = var88 & 7L;
                    long var97;
                    var7 = (var97 = var65 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label49;
                    }

                    float var67 = var56 * var56;
                    float var68 = 1.0F - var67;
                    float var82 = var68 * var68;
                    var8 = this.o;
                    var9 = this.L;
                    float var58 = ++var56 * 0.5F;
                    int var59 = DP.Bp(var8, var9, var58);
                    var59 = DP.PP(var59, 0.22F);
                    var59 = DP.Z(var1, var59, var82);
                    long var70 = var5;
                    long var90 = var70 + 1L;
                    long var91 = var70 * var90;
                    var11 = var70 + 2L;
                    long var92 = var91 * var11;
                    long var71 = var70 + 3L;
                    long var93 = var92 * var71;
                    long var72 = var93 & 7L;
                    long var98;
                    var5 = (var98 = var72 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var3 *= -1841422991;
                        var3 ^= 1391427388;
                        var3 ^= -1691140654;
                        long var48 = var1;
                        long var73 = var48 + 1L;
                        long var74 = var48 * var73;
                        var48 = var74 & 1L;
                        long var99;
                        int var50 = (var99 = var48 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                        if (var50 == 0) {
                            float var51 = DP.L(var1);
                            return DP.Y(var59, var51);
                        }
                        break label49;
                    }

                    var3 |= 287003816;
                    var3 >>>= 10;
                    var3 ^= -411286153;
                }
            }

            AssertionError var4 = new AssertionError();
            throw var4;
        }

        IllegalArgumentException var52 = new IllegalArgumentException();
        throw var52;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1965041161;
        int var2 = tR_2.qG;
        int var4 = of_2.xF(var3, var1, var2);
        gm = var4;
        TextStyle var5 = TextStyle.of(7.0F, -1);
        TextStyle var6 = var5.semibold();
        xh = var6;
        TextStyle var7 = TextStyle.of(7.0F, -1);
        TextStyle var8 = var7.medium();
        TextStyle var9 = var8.tabular();
        Vu = var9;
        TextStyle var10 = TextStyle.of(7.0F, -1);
        u = var10;
    }
}
