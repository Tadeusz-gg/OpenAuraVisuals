package mvggs.modules.hud;

import dev.aurap.hub.*;

import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.GlyphTint;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.LongSupplier;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.metadata.ModMetadata;

public final class dynamicisland extends tR_2 {
    private static final float mN = 17.0F;
    private static final float E = 86.0F;
    private static final float Ha = 196.0F;
    private static final float Ks = 236.0F;
    private static final float O = 11.0F;
    private static final float Yi = 3.0F;
    private static final float N = 10.0F;
    private static final float J = 7.5F;
    private static final float R = 37.0F;
    private static final float C = 150.0F;
    private static final float Pw = 240.0F;
    private static final float Af = 26.0F;
    private static final float OB = 240.0F;
    private static final float Kd = 152.0F;
    private static final float UI = 96.0F;
    private static final float Mh = 60.0F;
    private static final float L = 12.0F;
    private static final float T = 36.0F;
    private static final float e = 58.0F;
    private static final float t = 54.0F;
    private static final float S = 10.0F;
    private static final float Mm = 32.0F;
    private static final float gi = 1.5F;
    private static final float jk = 2.5F;
    private static final long q = 8000L;
    private static final float QH = 3.4F;
    private static final long ME = 3000L;
    private static final kE_2 zK;
    private static final kE_2 A;
    private static final int bv = -16777216;
    private static final int P = -1;
    private static final Paint f;
    private final r_2 y;
    private final JL K;
    private final JL RQ;
    private final JL nE;
    private final r_2 v;
    private final r_2 bC;
    private final JL Z;
    private final JL QJ;
    private final ia mr;
    private If s;
    private Zq nI;
    private final sN_2 SG;
    private boolean Hx;
    private FX IL;
    private long KA;
    private float IN;
    private Lk pw;
    private boolean m;
    private final XF aJ;
    private final XF I;
    private final XF EN;
    private final XF j;
    private float u;
    private float D;
    private float Kv;
    private float ET;
    private int rv;
    private Paint WG;
    private int zE;
    private final float[] i;
    private final float[] U;
    private double W;
    private long wN;
    private float B;
    private float PL;
    private float YI;
    private float h;
    private float G;
    private final XF fK;
    private final XF w;
    private final XF Y;
    private final XF a;
    private final XF H;
    private final XF g;
    private final XF Vu;
    private Bp_2 Ki;
    private String vV;
    private boolean kr;
    private boolean X;
    private TextStyle JM;
    private TextStyle St;
    private TextStyle vI;
    private TextStyle zm;
    private TextStyle V;
    private TextStyle lO;
    private TextStyle Rp;
    private TextStyle eR;
    private TextStyle fO;
    private TextStyle n;
    private Nr Lm;
    private int o;
    private int d;
    private int qn;
    private final StringBuilder aT;
    private final StringBuilder b;
    private float pM;
    private float Q;
    private boolean ey;
    private String l;
    private final GlyphTint z;
    private final float[] Iz;
    private final nE ic;
    private final nE pv;
    public static final int kS;

    public dynamicisland() {
        super("dynamic_island", "Dynamic Island", Cl_2.TOP_CENTER, 0.0F, 0.0F, 2.0F);
        Cl_2 var1 = Cl_2.TOP_CENTER;

        q_2 var2 = q_2.MINIMAL;
        r_2 var3 = new r_2("compact", "Compact View", var2);
        xB var4 = var3.q("What the small island shows while music plays.");
        r_2 var5 = (r_2)var4;
        xB var6 = this.vn(var5);
        r_2 var7 = (r_2)var6;
        this.y = var7;
        JL var8 = new JL("lyrics", "Lyrics", true);
        xB var9 = var8.q("Synced lyrics from lrclib.net (sends the song's title and artist).");
        JL var10 = (JL)var9;
        xB var11 = this.vn(var10);
        JL var12 = (JL)var11;
        this.K = var12;
        JL var13 = new JL("announce", "Track Changes", true);
        xB var14 = var13.q("Opens for a moment with the title of every new song.");
        JL var15 = (JL)var14;
        xB var16 = this.vn(var15);
        JL var17 = (JL)var16;
        this.RQ = var17;
        JL var18 = new JL("hide_paused", "Hide When Paused", true);
        xB var19 = var18.q("Tucks the island away a few seconds after you pause.");
        JL var20 = (JL)var19;
        xB var21 = this.vn(var20);
        JL var22 = (JL)var21;
        this.nE = var22;
        Rt var73 = Rt.BLACK;
        r_2 var23 = new r_2("material", "Background", var73);
        xB var24 = var23.q("Black like Apple's island, or the HUD theme's panel.");
        r_2 var25 = (r_2)var24;
        xB var26 = this.vn(var25);
        r_2 var27 = (r_2)var26;
        this.v = var27;
        vU var74 = vU.COVER;
        r_2 var28 = new r_2("accent", "Accent", var74);
        xB var29 = var28.q("Color of the waveform: taken from the album cover, or the HUD theme's accent.");
        r_2 var30 = (r_2)var29;
        xB var31 = this.vn(var30);
        r_2 var32 = (r_2)var31;
        this.bC = var32;
        JL var33 = new JL("other_players", "Other Players", true);
        xB var34 = var33.q("Follow another player (a browser, Apple Music) when Spotify plays nothing.");
        BooleanSupplier var75 = () -> {
            int var0 = kS;
            var0 ^= -905225623;
            int var1x = ZO.Wr() ? 1 : 0;

            label36: {
                var0 = switch (var0) {
                    case 1315761568 -> var0 ^ 94217018;
                    case 1531596062 -> {
                        var0 += -998995428;
                        var0 &= -1543409714;
                        var0 &= 692711072;
                        yield var0 ^ -1351400669;
                    }
                    default -> var0 ^ -1819600320;
                };
                if (var1x == 0) {
                    var0 ^= -1266425130;
                    var0 *= 1126848889;
                    var0 += -1968572718;
                    var0 ^= -1536772040;
                    var1x = var0 + 1;
                    var1x = var0 * var1x;
                    int var2x = var0 + 2;
                    var1x *= var2x;
                    var2x = var0 + 3;
                    var1x *= var2x;
                    var1x &= 7;
                    if (var1x != 0) {
                        break label36;
                    }

                    var1x = 1;
                    var0 &= -1670643331;
                    var0 += 890216069;
                    var0 *= -1896183427;
                    var0 *= 416897519;
                    var0 ^= -932300872;
                } else {
                    var0 = switch (var0) {
                        case -1351416541 -> {
                            var0 *= 1627083467;
                            var0 <<= 18;
                            var0 ^= 1293637373;
                            var0 *= 849021991;
                            yield var0 ^ 846749165;
                        }
                        default -> var0 ^ -734470432;
                        case 1857923530 -> var0 ^ -1410750020;
                    };
                    Integer var32x = var0;
                    if (var32x == null) {
                        break label36;
                    }

                    var1x = 0;
                    var0 >>>= 14;
                    var0 ^= 668712611;
                }

                int var33x = var0 + 1;
                var33x = var0 * var33x;
                var0 = var33x & 1;
                if (var0 == 0) {
                    return var1x != 0;
                }
            }

            IllegalArgumentException var24x = new IllegalArgumentException();
            throw var24x;
        };
        xB var35 = var34.Pt(var75);
        JL var36 = (JL)var35;
        xB var37 = this.vn(var36);
        JL var38 = (JL)var37;
        this.Z = var38;
        JL var39 = new JL("boss_bars", "Move Boss Bars", true);
        xB var40 = var39.q("Boss bars move down under the island instead of hiding behind it.");
        JL var41 = (JL)var40;
        xB var42 = this.vn(var41);
        JL var43 = (JL)var42;
        this.QJ = var43;
        ia var44 = new ia("peek_key", "Peek Key", -1);
        xB var45 = var44.q("Hold to open the island with the lyrics without opening the chat.");
        ia var46 = (ia)var45;
        xB var47 = this.vn(var46);
        ia var48 = (ia)var47;
        this.mr = var48;
        sN_2 var49 = new sN_2();
        this.SG = var49;
        this.KA = -1L;
        Lk var50 = Lk.COMPACT;
        this.pw = var50;
        this.m = true;
        kE_2 var76 = zK;
        XF var51 = new XF(86.0F, var76);
        this.aJ = var51;
        kE_2 var77 = zK;
        XF var52 = new XF(17.0F, var77);
        this.I = var52;
        kE_2 var78 = zK;
        XF var53 = new XF(8.5F, var78);
        this.EN = var53;
        kE_2 var79 = kE_2.SMOOTH;
        XF var54 = new XF(1.0F, var79);
        this.j = var54;
        this.u = 86.0F;
        this.D = 17.0F;
        this.Kv = 86.0F;
        this.ET = 150.0F;
        this.rv = -8408321;
        float[] var55 = new float[4];
        this.i = var55;
        float[] var56 = new float[]{0.3F, 2.1F, 4.4F, 1.2F};
        this.U = var56;
        this.h = Float.NaN;
        this.G = Float.NaN;
        kE_2 var80 = kE_2.SNAPPY;
        XF var57 = new XF(0.0F, var80);
        this.fK = var57;
        kE_2 var81 = kE_2.SNAPPY;
        XF var58 = new XF(0.0F, var81);
        this.w = var58;
        kE_2 var82 = kE_2.SNAPPY;
        XF var59 = new XF(0.0F, var82);
        this.Y = var59;
        kE_2 var83 = kE_2.SNAPPY;
        XF var60 = new XF(0.0F, var83);
        this.a = var60;
        kE_2 var84 = kE_2.BOUNCY;
        XF var61 = new XF(0.0F, var84);
        this.H = var61;
        kE_2 var85 = kE_2.BOUNCY;
        XF var62 = new XF(0.0F, var85);
        this.g = var62;
        kE_2 var86 = kE_2.BOUNCY;
        XF var63 = new XF(0.0F, var86);
        this.Vu = var63;
        Bp_2 var64 = Bp_2.jb("en");
        this.Ki = var64;
        this.vV = "";
        this.kr = true;
        this.o = -1;
        this.d = -1711276033;
        this.qn = 1644167167;
        StringBuilder var65 = new StringBuilder(8);
        this.aT = var65;
        StringBuilder var66 = new StringBuilder(8);
        this.b = var66;
        GlyphTint var67 = this::Es;
        this.z = var67;
        float[] var68 = new float[5];
        this.Iz = var68;
        nE var69 = new nE();
        this.ic = var69;
        nE var70 = new nE();
        this.pv = var70;
        this.dy("A notch at the top that shows your Spotify music: cover, waveform and, in chat, lyrics with controls.");
        this.fJ(true);
        JL var71 = this.Z;
        Runnable var87 = () -> {
            int var1x = kS;
            var1x ^= -1148720550;
            int var2x = System.identityHashCode(this);
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            int var4x = var2x + 2;
            var3x *= var4x;
            var2x += 3;
            var3x *= var2x;
            var2x = var3x & 7;
            if (var2x == 0) {
                var1x ^= 1104471137;
                var1x ^= -665992787;
                var1x ^= -1230006234;
                this.Hx = true;
            } else {
                var1x ^= -1408915010;
                var1x ^= 454626606;
                long var8x = var1x;
                long var21x = var8x + 1L;
                long var22x = var8x * var21x;
                long var9x = var22x & 1L;
                long var23x;
                var1x = (var23x = var9x - 0L) == 0L ? 0 : (var23x < 0L ? -1 : 1);
                if (var1x == 0) {
                    IllegalStateException var12x = new IllegalStateException();
                    throw var12x;
                } else {
                    AssertionError var11x = new AssertionError();
                    throw var11x;
                }
            }
        };
        var71.k(var87);
        r_2 var72 = this.v;
        Runnable var88 = () -> {
            int var1x = kS;
            var1x ^= -2033263910;
            int var2x = System.identityHashCode(this);
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            int var4x = var2x + 2;
            var3x *= var4x;
            var2x += 3;
            var3x *= var2x;
            var2x = var3x & 7;
            if (var2x != 0) {
                var1x |= -1868129121;
                var1x *= -369410531;
                var1x -= 674240111;
                var1x ^= -1679500247;
                IllegalStateException var17x = new IllegalStateException();
                throw var17x;
            } else {
                var1x |= -1958319187;
                var1x += 258706220;
                var1x &= 1856840584;
                var1x -= -2136612174;
                var1x ^= 2110641676;
                this.kr = true;
            }
        };
        var72.k(var88);
    }

    @Override
    protected void J() {
        label85: {
            int var1 = kS;
            var1 ^= 366805835;
            int var2 = System.identityHashCode(this);
            If var3 = this.s;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                var1 |= 649723518;
                var1 &= -1301783972;
                var1 <<= 27;
                var1 |= 561690020;
                var1 ^= -106955804;
            } else {
                label87: {
                    var1 -= 1659743888;
                    var1 -= 293155432;
                    var1 |= -430926613;
                    var1 ^= 805209399;
                    var4 = var1 + 1;
                    var4 = var1 * var4;
                    var5 = var1 + 2;
                    var4 *= var5;
                    var5 = var1 + 3;
                    var4 *= var5;
                    var4 &= 7;
                    if (var4 != 0) {
                        break label85;
                    }

                    if (var3 != null) {
                        var1 = switch (var1) {
                            default -> var1 ^ -566207282;
                            case -645188904 -> {
                                var1 -= 2079864912;
                                yield var1 ^ 201176902;
                            }
                            case 1207989060 -> var1 ^ -1159430715;
                        };
                        long var65 = var1;
                        long var102 = var65 + 1L;
                        long var103 = var65 * var102;
                        long var66 = var103 & 1L;
                        long var112;
                        int var67 = (var112 = var66 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
                        if (var67 != 0) {
                            break label85;
                        }

                        var3 = this.s;
                        Integer var95 = var2;
                        if (var95 == null) {
                            var1 -= -1652093650;
                            var1 ^= -1609756960;
                            break label87;
                        }
                        var1 = switch (var1) {
                            case -1660225562 -> var1 ^ 693241321;
                            case 1450134990 -> {
                                var1 |= 939552595;
                                var1 -= -433903556;
                                yield var1 ^ -38248328;
                            }
                            default -> var1 ^ -929905039;
                        };
                        var3.Em();
                        var1 += 1217400987;
                        var1 ^= 1454571247;
                    } else {
                        var1 |= 1770182515;
                        var1 ^= 2095747336;
                        var1 >>>= 20;
                        var1 |= -1598283035;
                        var1 ^= 1485499502;
                    }

                    int var69 = var1 + 1;
                    int var70 = var1 * var69;
                    var4 = var1 + 2;
                    int var71 = var70 * var4;
                    var4 = var1 + 3;
                    int var72 = var71 * var4;
                    int var73 = var72 & 7;
                    if (var73 != 0) {
                        break label85;
                    }

                    this.s = null;
                    this.IL = null;
                    long var74 = var2;
                    long var104 = var74 + 1L;
                    long var105 = var74 * var104;
                    long var7 = var74 + 2L;
                    long var106 = var105 * var7;
                    long var75 = var74 + 3L;
                    long var107 = var106 * var75;
                    long var76 = var107 & 7L;
                    long var113;
                    int var77 = (var113 = var76 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
                    if (var77 != 0) {
                        var1 -= 1499780806;
                        var1 ^= -2043371117;
                    } else {
                        label98: {
                            var1 = switch (var1) {
                                case -130627943 -> {
                                    var1 >>>= 5;
                                    var1 >>= 5;
                                    var1 |= -1637737988;
                                    yield var1 ^ 702418035;
                                }
                                default -> var1 ^ 2020288459;
                                case 1973597515 -> var1 ^ -1338129355;
                            };
                            int var78 = var1 + 1;
                            int var79 = var1 * var78;
                            int var80 = var79 & 1;
                            if (var80 != 0) {
                                break label85;
                            }

                            boolean var81 = Ud.y();
                            if (var81) {
                                var1 &= 1288393822;
                                var1 >>= 13;
                                var1 <<= 11;
                                var1 ^= -93037970;
                                long var82 = var1;
                                long var108 = var82 + 1L;
                                long var109 = var82 * var108;
                                long var83 = var109 & 1L;
                                long var114;
                                int var84 = (var114 = var83 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                                if (var84 != 0) {
                                    break label85;
                                }

                                sN_2 var85 = this.SG;
                                Ud var98 = Ud.Z();
                                var5 = var2 + 1;
                                var5 = var2 * var5;
                                var2 = var5 & 1;
                                if (var2 != 0) {
                                    var1 -= -433936356;
                                    var1 -= -1872322958;
                                    var1 ^= -1674682976;
                                    break label98;
                                }

                                var1 |= -109075451;
                                var1 *= 228781537;
                                var1 -= 1823663223;
                                var1 += -2067262801;
                                var1 ^= -1638743059;
                                AuraRenderer var61 = var98.ZP();
                                var85.wj(var61);
                                var1 &= 1534509283;
                                var1 *= 1792412975;
                                var1 += 408726788;
                                var1 ^= 1211603334;
                            } else {
                                var1 *= 1529074035;
                                var1 |= 1372585439;
                                var1 <<= 19;
                                var1 &= -228110242;
                                var1 ^= -41569084;
                            }

                            var2 = var1 + 1;
                            var2 = var1 * var2;
                            var1 = var2 & 1;
                            if (var1 == 0) {
                                return;
                            }
                            break label85;
                        }
                    }
                }
            }

            UnsupportedOperationException var62 = new UnsupportedOperationException();
            throw var62;
        }

        IllegalArgumentException var59 = new IllegalArgumentException();
        throw var59;
    }

    private If f(int var1) {
        int var3 = System.identityHashCode(this);
        int var4 = (this.Hx ? 1 : 0);
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var140;
        int var99 = (var140 = var5 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
        label114:
        if (var99 == 0) {
            label118: {
                int var14 = switch (var1) {
                    case -186345245 -> {
                        int var15 = var1 + 1256185761;
                        var15 *= -676759817;
                        yield var15 ^ -1433133801;
                    }
                    default -> var1 ^ -661800897;
                    case 1370285542 -> var1 ^ -1061799968;
                };
                if (var4 != 0) {
                    var14 -= -1708367249;
                    var14 |= 213216200;
                    var14 ^= 147077101;
                    long var80 = var14;
                    long var6 = var80 + 1L;
                    var6 = var80 * var6;
                    long var81 = var6 & 1L;
                    long var141;
                    var4 = (var141 = var81 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label118;
                    }

                    If var83 = this.s;
                    var5 = var3;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    long var9 = var5 + 2L;
                    var7 *= var9;
                    var5 += 3L;
                    var7 *= var5;
                    var5 = var7 & 7L;
                    long var142;
                    int var103 = (var142 = var5 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
                    if (var103 != 0) {
                        switch (var14) {
                            case -1787181007:
                                var14 &= -1104141802;
                                var14 ^= -1495031317;
                                break label114;
                            case -800310173:
                                var14 ^= 969905701;
                                break label114;
                            case -32868750:
                            default:
                                var14 ^= 830103791;
                                break label114;
                        }
                    }

                    var14 ^= -736122731;
                    var14 &= -1673193708;
                    var14 <<= 28;
                    var14 ^= 348455819;
                    if (var83 != null) {
                        var14 |= 71690826;
                        var14 *= 1500148431;
                        var14 ^= 241451640;
                        long var84 = var14;
                        var6 = var84 + 1L;
                        var6 = var84 * var6;
                        long var8 = var84 + 2L;
                        var6 *= var8;
                        long var85 = var84 + 3L;
                        var6 *= var85;
                        long var86 = var6 & 7L;
                        long var143;
                        var4 = (var143 = var86 - 0L) == 0L ? 0 : (var143 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label118;
                        }

                        If var88 = this.s;
                        int var104 = var3 + 1;
                        int var105 = var3 * var104;
                        int var124 = var3 + 2;
                        int var106 = var105 * var124;
                        int var125 = var3 + 3;
                        int var107 = var106 * var125;
                        int var108 = var107 & 7;
                        if (var108 != 0) {
                            var14 |= -1366817650;
                            var14 ^= -600839132;
                            break label114;
                        }

                        var14 &= -1816732190;
                        var14 |= -1048562512;
                        var14 *= -1473529825;
                        var14 *= -1567518851;
                        var14 ^= 1787946821;
                        Integer var109 = var14;
                        if (var109 == null) {
                            break label118;
                        }

                        var88.Em();
                        this.s = null;
                        var14 &= -973318827;
                        var14 -= 776746977;
                        var14 += -735855483;
                        var14 ^= 415751947;
                    } else {
                        switch (var14) {
                            case -347478894:
                            default:
                                var14 ^= 411448590;
                                break;
                            case 1422197643:
                                var14 |= 68120399;
                                var14 |= -81931118;
                                var14 ^= 211285101;
                                break;
                            case 1431278800:
                                var14 ^= -2064167106;
                        }
                    }
                } else {
                    switch (var14) {
                        case -1852247815:
                            var14 ^= -27228247;
                            break;
                        case 735380043:
                            var14 &= 2093536953;
                            var14 >>= 11;
                            var14 *= -675551413;
                            var14 &= -1990132836;
                            var14 ^= -211287118;
                            break;
                        case 1267073869:
                        default:
                            var14 ^= -819382166;
                    }
                }

                Integer var89 = var14;
                if (var89 != null) {
                    this.Hx = false;
                    If var90 = this.s;
                    Integer var110 = var3;
                    if (var110 == null) {
                        switch (var14) {
                            case -213382222:
                                var14 -= -1926097326;
                                var14 ^= 1422283931;
                                break label114;
                            case 1504531236:
                            default:
                                var14 ^= -263572364;
                                break label114;
                            case 2074699416:
                                var14 ^= -211240282;
                                break label114;
                        }
                    }

                    var14 <<= 15;
                    var14 *= -2076100453;
                    var14 |= -569721144;
                    var14 >>= 23;
                    var14 ^= -2032442002;
                    var5 = var14;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var144;
                    int var113 = (var144 = var5 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                    label96:
                    if (var113 == 0) {
                        if (var90 == null) {
                            var14 = switch (var14) {
                                case -1866490325 -> var14 ^ -1291394317;
                                default -> var14 ^ -1321454255;
                                case 2032442066 -> {
                                    var14 ^= 230150280;
                                    var14 <<= 11;
                                    var14 += -1346372159;
                                    var14 |= -1688277439;
                                    yield var14 ^ 31556278;
                                }
                            };
                            int var91 = var14 + 1;
                            var91 = var14 * var91;
                            int var114 = var14 + 2;
                            var91 *= var114;
                            int var115 = var14 + 3;
                            var91 *= var115;
                            var91 &= 7;
                            if (var91 != 0) {
                                break label96;
                            }

                            JL var116 = this.Z;
                            boolean var117 = var116.vb();
                            int var126 = var14 >> 7;
                            var126 ^= -1916147010;
                            var126 >>= 17;
                            var126 ^= 1349716032;
                            Path var130 = On(var126);
                            LongSupplier var139 = System::currentTimeMillis;
                            Co var118 = ZO.g(var117, var130, var139);
                            LongSupplier var131 = System::currentTimeMillis;
                            If var96 = new If(var118, var131);
                            this.s = var96;
                            If var97 = this.s;
                            Integer var77 = var3;
                            if (var77 == null) {
                                var14 <<= 25;
                                var14 += -51603498;
                                var14 <<= 8;
                                var14 &= -949965945;
                                var14 ^= -153934853;
                                break label114;
                            }

                            var14 *= 1163455459;
                            var14 &= 1878729963;
                            var14 ^= -1922561763;
                            var97.E();
                            var14 >>= 12;
                            var14 ^= 960894650;
                        } else {
                            var14 *= 103368911;
                            var14 ^= -1602774627;
                            var14 ^= -1687350250;
                            var14 += -554698299;
                            var14 ^= 1836334608;
                        }

                        Integer var78 = var14;
                        if (var78 != null) {
                            return this.s;
                        }
                    }
                }
            }

            UnsupportedOperationException var79 = new UnsupportedOperationException();
            throw var79;
        } else {
            switch (var1) {
                case -186345245:
                    int var12 = var1 - -572425425;
                    var12 ^= 634436687;
                    break;
                case 715798931:
                default:
                    int var11 = var1 ^ 1785225144;
                    break;
                case 945025179:
                    int var2 = var1 ^ -1824785089;
            }
        }

        AssertionError var76 = new AssertionError();
        throw var76;
    }

    private Zq PJ(int var1) {
        label60: {
            int var22;
            label59: {
                int var3 = System.identityHashCode(this);
                Zq var4 = this.nI;
                int var5 = var3 + 1;
                var5 = var3 * var5;
                var5 &= 1;
                if (var5 == 0) {
                    var22 = var1 + 566835188;
                    var22 |= -1348328027;
                    var22 ^= 1338150718;
                    Integer var49 = var22;
                    if (var49 == null) {
                        break label60;
                    }

                    if (var4 != null) {
                        var22 += 1425557047;
                        var22 -= 713086293;
                        var22 &= 1537930367;
                        var22 ^= -1239647436;
                        break label59;
                    }
                    var22 = switch (var22) {
                        case -530452341 -> {
                            var22 += -43727106;
                            yield var22 ^ 908589637;
                        }
                        case -364523359 -> var22 ^ -1242305979;
                        default -> var22 ^ -431553550;
                    };
                    long var33 = var22;
                    long var6 = var33 + 1L;
                    var6 = var33 * var6;
                    long var8 = var33 + 2L;
                    var6 *= var8;
                    long var34 = var33 + 3L;
                    var6 *= var34;
                    long var35 = var6 & 7L;
                    long var56;
                    int var36 = (var56 = var35 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
                    if (var36 != 0) {
                        break label60;
                    }

                    FabricLoader var37 = FabricLoader.getInstance();
                    Optional<ModContainer> var38 = var37.getModContainer("auravisuals");
                    Function<ModContainer, String> var50 = (ModContainer var0) -> {
                        int var1x = kS;
                        var1x ^= -1339223602;
                        int var2x = System.identityHashCode(var0);
                        int var3x = var2x + 1;
                        var3x = var2x * var3x;
                        int var4x = var2x + 2;
                        var3x *= var4x;
                        var2x += 3;
                        var3x *= var2x;
                        var2x = var3x & 7;
                        if (var2x != 0) {
                            switch (var1x) {
                                case -295096719:
                                default:
                                    var1x ^= -772789945;
                                    break;
                                case 560727737:
                                    var1x += 850662745;
                                    var1x ^= -2096312436;
                                    break;
                                case 1253708852:
                                    var1x ^= 1744049512;
                            }

                            UnsupportedOperationException var17x = new UnsupportedOperationException();
                            throw var17x;
                        } else {
                            var1x ^= 1571301210;
                            var1x += -440489771;
                            var1x ^= -1696562985;
                            ModMetadata var9 = var0.getMetadata();
                            Version var10x = var9.getVersion();
                            return var10x.getFriendlyString();
                        }
                    };
                    Optional var39 = var38.map(var50);
                    String var41 = (String)var39.orElse("dev");
                    String var42 = "AuraVisuals/" + var41 + " (offline)";
                    OfflineLyrics var55 = new OfflineLyrics(var42);
                    int var43 = var22 ^ -1094539103;
                    int var44 = var43 ^ 89183251;
                    Path var45 = On(var44);
                    Path var46 = var45.resolve("lyrics");
                    LongSupplier var7 = System::currentTimeMillis;
                    Zq var51 = new Zq(var55, var46, var7);
                    Integer var30 = var3;
                    if (var30 != null) {
                        var22 = switch (var22) {
                            case -337556020 -> {
                                var22 >>>= 1;
                                var22 -= -969319430;
                                var22 *= 1897573415;
                                var22 >>>= 1;
                                yield var22 ^ -1193902112;
                            }
                            case 1103191371 -> var22 ^ -1416171147;
                            default -> var22 ^ -632636037;
                        };
                        var30 = var22;
                        if (var30 == null) {
                            break label60;
                        }

                        this.nI = var51;
                        var22 >>= 13;
                        var22 ^= 1131090177;
                        break label59;
                    }

                    switch (var22) {
                        case -337556020:
                            var22 += 291849915;
                            var22 ^= 546850202;
                            break;
                        case -188222897:
                            var22 ^= -1368067338;
                            break;
                        case 573855061:
                        default:
                            var22 ^= 595061639;
                    }
                } else {
                    var22 = var1 * 1625417969;
                    var22 ^= 696742028;
                }

                Integer var27 = var22;
                if (var27 != null) {
                    UnsupportedOperationException var29 = new UnsupportedOperationException();
                    throw var29;
                }
                break label60;
            }

            Integer var32 = var22;
            if (var32 != null) {
                return this.nI;
            }
        }

        UnsupportedOperationException var28 = new UnsupportedOperationException();
        throw var28;
    }

    private static Path On(int var0) {
        FabricLoader var2 = FabricLoader.getInstance();
        Path var9 = var2.getConfigDir();
        int var1 = var0 - 1950370082;
        var1 ^= -19791561;
        var1 *= -1554844313;
        var1 ^= -505023646;
        var1 ^= 2091501067;
        Integer var7 = var1;
        if (var7 != null) {
            return var9.resolve("auravisuals-cache");
        } else {
            RuntimeException var8 = new RuntimeException();
            throw var8;
        }
    }

    @Override
    protected boolean nX() {
        int var1 = System.identityHashCode(this);
        return true;
    }

    @Override
    protected boolean jV() {
        int var1 = System.identityHashCode(this);
        return false;
    }

    @Override
    protected boolean HI(lH_3 var1) {
        label68: {
            int var31;
            int var44;
            label72: {
                var31 = kS;
                var31 ^= 322258133;
                var44 = System.identityHashCode(this);
                int var4 = (var1.tl()) ? 1 : 0;
                Integer var5 = var44;
                label65:
                if (var5 != null) {
                    var31 &= 874846355;
                    var31 &= -1294133517;
                    var31 ^= 267518346;
                    var5 = var31;
                    if (var5 == null) {
                        break label68;
                    }

                    if (var4 == 0) {
                        var31 >>= 31;
                        var31 ^= 1718775930;
                        long var47 = var31;
                        long var6 = var47 + 1L;
                        var6 = var47 * var6;
                        long var48 = var6 & 1L;
                        long var54;
                        var4 = (var54 = var48 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label68;
                        }

                        boolean var50 = this.X;
                        Integer var42 = var44;
                        if (var42 == null) {
                            switch (var31) {
                                case -2026206324:
                                    var31 ^= 302834363;
                                    break label65;
                                case 1232499604:
                                default:
                                    var31 ^= 545117241;
                                    break label65;
                                case 1718775930:
                                    var31 -= 1549651520;
                                    var31 >>= 2;
                                    var31 ^= -1824728002;
                                    break label65;
                            }
                        }

                        var31 &= 20308615;
                        var31 *= -486301109;
                        var31 *= 704099309;
                        var31 *= -1547743825;
                        var31 ^= 648166212;
                        var42 = var31;
                        if (var42 == null) {
                            break label68;
                        }

                        if (!var50) {
                            var31 -= 855058938;
                            var31 -= -1177387811;
                            var31 ^= 328337445;
                            var44 = 0;
                            var31 >>= 6;
                            var31 ^= -1699358560;
                            var31 ^= 1458046914;
                            break label72;
                        }

                        var31 += -241484962;
                        var31 *= -2035263969;
                        var31 ^= 1438412130;
                    } else {
                        var31 *= 786967203;
                        var31 -= 1688049090;
                        var31 ^= -1519530584;
                    }

                    var44 = 1;
                    switch (var31) {
                        case -1502126082:
                            var31 &= -1978780881;
                            var31 &= 1573796909;
                            var31 -= 1298150067;
                            var31 ^= -2132291387;
                            break label72;
                        case 436820302:
                            var31 ^= -541724508;
                            break label72;
                        case 539329713:
                        default:
                            var31 ^= -1682476883;
                            break label72;
                    }
                } else {
                    switch (var31) {
                        case -2106305630:
                            var31 >>= 10;
                            var31 >>>= 10;
                            var31 >>= 14;
                            var31 ^= -1850084273;
                            break;
                        case -2094638776:
                            var31 ^= 983462190;
                            break;
                        case 812964626:
                        default:
                            var31 ^= -2028861112;
                    }
                }

                var44 = var31 + 1;
                var44 = var31 * var44;
                var31 = var44 & 1;
                if (var31 == 0) {
                    IllegalArgumentException var35 = new IllegalArgumentException();
                    throw var35;
                }
                break label68;
            }

            Integer var51 = var31;
            if (var51 != null) {
                return (var44 != 0);
            }
        }

        IllegalStateException var41 = new IllegalStateException();
        throw var41;
    }

    @Override
    protected float dj() {
        int var1 = kS;
        var1 ^= 278638550;
        int var2 = System.identityHashCode(this);
        Integer var30 = var2;
        if (var30 == null) {
            var1 += 293548364;
            var1 ^= 1977029038;
            long var31 = var1;
            long var4 = var31 + 1L;
            var4 = var31 * var4;
            long var32 = var4 & 1L;
            long var48;
            int var33 = (var48 = var32 - 0L) == 0L ? 0 : (var48 < 0L ? -1 : 1);
            if (var33 == 0) {
                IllegalArgumentException var34 = new IllegalArgumentException();
                throw var34;
            }
        } else {
            var1 = switch (var1) {
                case -2116372319 -> {
                    var1 *= 2031630187;
                    var1 *= 559972801;
                    var1 &= -13575050;
                    var1 *= 1649846811;
                    yield var1 ^ -880014105;
                }
                default -> var1 ^ -586536179;
                case -1634043240 -> var1 ^ -1193701582;
            };
            var30 = var1;
            label36:
            if (var30 != null) {
                r_2 var36 = this.v;
                Rt var3 = Rt.BLACK;
                boolean var37 = var36.TJ(var3);
                float var41;
                if (var37) {
                    var1 <<= 2;
                    var1 ^= -955465911;
                    var1 *= -973008915;
                    var1 ^= -1348082396;
                    int var38 = var1 + 1;
                    var38 = var1 * var38;
                    var38 &= 1;
                    if (var38 != 0) {
                        break label36;
                    }

                    var41 = 0.0F;
                    var1 ^= -1712964791;
                    var1 &= -592163504;
                    var1 ^= 1212397234;
                } else {
                    var1 >>>= 30;
                    var1 ^= -928208840;
                    var41 = 3.0F;
                    var1 &= 871375007;
                    var1 += 1474847304;
                    var1 &= -1067212059;
                    var1 -= 582132384;
                    var1 ^= 29256754;
                }

                int var42 = var1 + 1;
                int var43 = var1 * var42;
                int var47 = var1 + 2;
                int var44 = var43 * var47;
                var1 += 3;
                int var45 = var44 * var1;
                var1 = var45 & 7;
                if (var1 == 0) {
                    return var41;
                }
            }
        }

        AssertionError var29 = new AssertionError();
        throw var29;
    }

    @Override
    protected float e(lH_3 var1) {
        label122: {
            int var76;
            label121: {
                var76 = kS;
                var76 ^= -42349586;
                int var3 = System.identityHashCode(this);
                JL var4 = this.QJ;
                boolean var97 = var4.vb();
                int var5 = var3 + 1;
                var5 = var3 * var5;
                int var6 = var3 + 2;
                var5 *= var6;
                var6 = var3 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    var76 = switch (var76) {
                        default -> var76 ^ 761596765;
                        case 315059107 -> var76 ^ 51142221;
                        case 1815665817 -> {
                            var76 &= -924191537;
                            var76 |= -739275801;
                            var76 -= -966980669;
                            yield var76 ^ -1114840072;
                        }
                    };
                    var5 = var76 + 1;
                    var5 = var76 * var5;
                    var6 = var76 + 2;
                    var5 *= var6;
                    var6 = var76 + 3;
                    var5 *= var6;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label122;
                    }

                    if (!var97) {
                        var76 *= 1344799133;
                        var76 += 603546773;
                        var76 ^= 600592110;
                        var76 <<= 16;
                        var76 ^= -2053153813;
                        break label121;
                    }

                    var76 += 48806061;
                    var76 *= -1934470433;
                    var76 ^= 1216294514;
                    var76 ^= -28261819;
                    long var98 = var76;
                    long var135 = var98 + 1L;
                    long var136 = var98 * var135;
                    long var8 = var98 + 2L;
                    long var137 = var136 * var8;
                    long var99 = var98 + 3L;
                    long var138 = var137 * var99;
                    long var100 = var138 & 7L;
                    long var162;
                    int var101 = (var162 = var100 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                    if (var101 != 0) {
                        break label122;
                    }

                    boolean var102 = this.m;
                    Integer var117 = var3;
                    if (var117 == null) {
                        var76 >>= 11;
                        var76 += 304458593;
                        var76 += 852714669;
                        var76 ^= -2147232186;
                        var76 ^= -1349324818;
                    } else {
                        var76 = switch (var76) {
                            case -2026856050 -> var76 ^ -1590809095;
                            case 1340685928 -> {
                                var76 |= 717406206;
                                var76 *= -1978563923;
                                var76 += 1756981231;
                                var76 >>>= 11;
                                yield var76 ^ -356269322;
                            }
                            default -> var76 ^ -214905279;
                        };
                        if (!var102) {
                            var76 += -1914845970;
                            var76 <<= 11;
                            var76 ^= 1515175339;
                            var76 <<= 2;
                            var76 ^= -1380537017;
                            break label121;
                        }
                        var76 = switch (var76) {
                            case -728095307 -> var76 ^ 1505226410;
                            default -> var76 ^ 268225222;
                            case -355594734 -> {
                                var76 ^= 1908983813;
                                var76 |= -25355336;
                                var76 *= 1877527261;
                                yield var76 ^ 1951701028;
                            }
                        };
                        float var103 = this.ur();
                        long var118 = var3;
                        long var7 = var118 + 1L;
                        var7 = var118 * var7;
                        long var9 = var118 + 2L;
                        var7 *= var9;
                        long var119 = var118 + 3L;
                        var7 *= var119;
                        long var120 = var7 & 7L;
                        long var163;
                        int var121 = (var163 = var120 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                        if (var121 == 0) {
                            var76 = switch (var76) {
                                default -> var76 ^ -2040941474;
                                case 1798418533 -> var76 ^ 2616425;
                                case 2052867527 -> {
                                    var76 >>= 21;
                                    var76 -= -264013949;
                                    yield var76 ^ -1921291555;
                                }
                            };
                            long var122 = var76;
                            var7 = var122 + 1L;
                            var7 = var122 * var7;
                            long var123 = var7 & 1L;
                            long var164;
                            var121 = (var164 = var123 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                            if (var121 != 0) {
                                break label122;
                            }

                            float var125 = var1.w();
                            float var126 = var125 * 0.5F;
                            float var139 = this.aM();
                            float var148 = this.aM();
                            float var156 = this.YU();
                            float var149 = var148 + var156;
                            float var157 = var126 - 91.0F;
                            float var165;
                            int var150 = (var165 = var149 - var157) == 0.0F ? 0 : (var165 < 0.0F ? -1 : 1);
                            if (var150 < 0) {
                                var76 ^= -1493525779;
                                var76 += -1231857762;
                                var76 ^= -1930396455;
                                return 0.0F;
                            }

                            var76 += -1070134931;
                            var76 *= 1650848419;
                            var76 |= -1376333905;
                            var76 *= 849832629;
                            var76 ^= -1626067123;
                            float var127 = var126 + 91.0F;
                            Integer var151 = var3;
                            if (var151 == null) {
                                var76 -= -1465093365;
                                var76 |= 47843361;
                                var76 <<= 25;
                                var76 ^= -1668139875;
                            } else {
                                var76 *= -228541379;
                                var76 *= -37534229;
                                var76 >>>= 25;
                                var76 ^= -1825616897;
                                var7 = var76;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                long var11 = var7 + 2L;
                                var9 *= var11;
                                var7 += 3L;
                                var9 *= var7;
                                var7 = var9 & 7L;
                                long var166;
                                int var155 = (var166 = var7 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                                if (var155 != 0) {
                                    break label122;
                                }

                                float var167;
                                var121 = (var167 = var139 - var127) == 0.0F ? 0 : (var167 < 0.0F ? -1 : 1);
                                if (var121 > 0) {
                                    var76 += 1708030212;
                                    var76 &= 515921651;
                                    var76 ^= 1323363525;
                                    return 0.0F;
                                }
                                var76 = switch (var76) {
                                    case -1825616899 -> {
                                        var76 *= 5452519;
                                        var76 += -1786863964;
                                        var76 *= 676693153;
                                        yield var76 ^ 516308444;
                                    }
                                    default -> var76 ^ 1484952965;
                                    case 1803271458 -> var76 ^ 447499162;
                                };
                                XF var129 = this.I;
                                float var130 = var129.bs();
                                float var131 = Math.min(var130, 17.0F);
                                Integer var89 = var3;
                                if (var89 != null) {
                                    var76 = switch (var76) {
                                        case -964586413 -> var76 ^ 446890821;
                                        default -> var76 ^ 155419874;
                                        case 1235433107 -> {
                                            var76 |= -400452894;
                                            var76 *= -353409635;
                                            var76 &= 253536617;
                                            yield var76 ^ 203981112;
                                        }
                                    };
                                    int var90 = var76 + 1;
                                    var90 = var76 * var90;
                                    var6 = var76 + 2;
                                    var90 *= var6;
                                    var6 = var76 + 3;
                                    var90 *= var6;
                                    var90 &= 7;
                                    if (var90 == 0) {
                                        float var95 = var131 + 2.5F;
                                        return var95 * var103;
                                    }
                                    break label122;
                                }

                                var76 ^= -389264926;
                                var76 ^= 1135174335;
                                var76 -= 1509425379;
                                var76 ^= -497276810;
                            }
                        } else {
                            switch (var76) {
                                case -910307195:
                                default:
                                    var76 ^= -2009718791;
                                    break;
                                case 2052867527:
                                    var76 ^= 201443915;
                                    var76 &= -412398555;
                                    var76 ^= -750366907;
                                    var76 |= 113504416;
                                    var76 ^= -581056644;
                                    break;
                                case 2056951699:
                                    var76 ^= 93656218;
                            }
                        }
                    }
                } else {
                    var76 -= 186002135;
                    var76 += -1270740717;
                    var76 ^= 2146864712;
                }

                long var83 = var76;
                long var104 = var83 + 1L;
                long var105 = var83 * var104;
                long var142 = var83 + 2L;
                long var106 = var105 * var142;
                long var84 = var83 + 3L;
                long var107 = var106 * var84;
                long var85 = var107 & 7L;
                long var168;
                var76 = (var168 = var85 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                if (var76 == 0) {
                    UnsupportedOperationException var88 = new UnsupportedOperationException();
                    throw var88;
                }
                break label122;
            }

            Integer var96 = var76;
            if (var96 != null) {
                return 0.0F;
            }
        }

        UnsupportedOperationException var87 = new UnsupportedOperationException();
        throw var87;
    }

    @Override
    protected void r(Oo var1) {
        int var2 = kS;
        var2 ^= 1334079152;
        int var3 = System.identityHashCode(this);
        r_2 var4 = this.v;
        Rt var5 = Rt.THEME;
        boolean var134 = var4.TJ(var5);
        int var141 = var3 + 1;
        int var142 = var3 * var141;
        int var143 = var142 & 1;
        if (var143 != 0) {
            var2 += 106636225;
            var2 ^= 1204723182;
            var2 ^= -233931891;
        } else {
            label205: {
                var2 |= -1355430945;
                var2 ^= 1876044320;
                Integer var144 = var2;
                label193:
                if (var144 != null) {
                    int var147;
                    if (var134) {
                        var2 += 1544968359;
                        var2 |= 1911536008;
                        var2 += 1689995549;
                        var2 |= -1207906315;
                        var2 ^= 521767727;
                        Integer var145 = var2;
                        if (var145 == null) {
                            break label193;
                        }

                        int var146 = var1.MD();
                        int var6 = var3 + 1;
                        var6 = var3 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            var2 |= 1115580926;
                            var2 ^= -1222765035;
                            break label205;
                        }

                        var2 &= 1095410100;
                        var2 ^= 1918468395;
                        long var200 = var2;
                        long var8 = var200 + 1L;
                        var8 = var200 * var8;
                        long var201 = var8 & 1L;
                        long var260;
                        var6 = (var260 = var201 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label193;
                        }

                        var147 = var146;
                        switch (var2) {
                            case -2010653388:
                            default:
                                var2 ^= -1066791998;
                                break;
                            case -1768458412:
                                var2 ^= 213298598;
                                break;
                            case 861635003:
                                var2 >>>= 13;
                                var2 |= 1377940622;
                                var2 += 472859377;
                                var2 ^= -1429771478;
                        }
                    } else {
                        var2 |= -1266009823;
                        var2 -= -1814651804;
                        var2 *= -491908679;
                        var2 ^= 1456075072;
                        long var203 = var2;
                        long var251 = var203 + 1L;
                        var251 = var203 * var251;
                        var203 = var251 & 1L;
                        long var261;
                        int var205 = (var261 = var203 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                        if (var205 != 0) {
                            break label193;
                        }

                        var147 = -218103809;
                        switch (var2) {
                            case -1171548577:
                            default:
                                var2 ^= -258545505;
                                break;
                            case -143916733:
                                var2 >>>= 25;
                                var2 *= -1211507471;
                                var2 -= -1662445479;
                                var2 <<= 20;
                                var2 ^= 867592933;
                                break;
                            case 633867811:
                                var2 ^= -1907769506;
                        }
                    }

                    int var206 = var2 + 1;
                    var206 = var2 * var206;
                    int var7 = var2 + 2;
                    var206 *= var7;
                    var7 = var2 + 3;
                    var206 *= var7;
                    var206 &= 7;
                    if (var206 == 0) {
                        this.o = var147;
                        Integer var148 = var3;
                        if (var148 == null) {
                            var2 &= 65280844;
                            var2 *= -1706686349;
                            var2 ^= 1121634151;
                            break label205;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ 1103630250;
                            case -996775195 -> {
                                var2 *= 356378047;
                                yield var2 ^ 2007414465;
                            }
                            case -59666744 -> var2 ^ 507500416;
                        };
                        long var149 = var2;
                        long var238 = var149 + 1L;
                        long var239 = var149 * var238;
                        long var9 = var149 + 2L;
                        long var240 = var239 * var9;
                        long var150 = var149 + 3L;
                        long var241 = var240 * var150;
                        long var151 = var241 & 7L;
                        long var262;
                        int var152 = (var262 = var151 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                        label178:
                        if (var152 == 0) {
                            int var154;
                            if (var134) {
                                var2 = switch (var2) {
                                    case -1431732 -> var2 ^ 944673955;
                                    case 214904602 -> {
                                        var2 += 406893544;
                                        var2 ^= 1567131119;
                                        var2 += -702354959;
                                        var2 += 1108009451;
                                        yield var2 ^ -1124552701;
                                    }
                                    default -> var2 ^ -612737399;
                                };
                                int var153 = var1.Hb();
                                Integer var211 = var3;
                                if (var211 == null) {
                                    var2 >>= 18;
                                    var2 &= -1889321398;
                                    var2 &= -1079074111;
                                    var2 <<= 27;
                                    var2 ^= 1356889067;
                                    break label205;
                                }

                                var2 |= -440639179;
                                var2 -= -1368199231;
                                var2 ^= -942660223;
                                var211 = var2;
                                if (var211 == null) {
                                    break label178;
                                }

                                var154 = var153;
                                var2 -= 206187341;
                                var2 *= 1445684577;
                                var2 ^= 1687774046;
                            } else {
                                var2 = switch (var2) {
                                    case -1416889395 -> var2 ^ 1381716135;
                                    default -> var2 ^ 1424022823;
                                    case 214904602 -> {
                                        var2 <<= 2;
                                        var2 -= 1605593688;
                                        yield var2 ^ -460213653;
                                    }
                                };
                                var154 = -1660944385;
                                var2 ^= -30350530;
                                var2 += -303815947;
                                var2 += 489301758;
                                var2 -= -499056039;
                                var2 ^= -800316749;
                            }

                            this.d = var154;
                            long var155 = var3;
                            long var242 = var155 + 1L;
                            long var243 = var155 * var242;
                            var9 = var155 + 2L;
                            long var244 = var243 * var9;
                            long var156 = var155 + 3L;
                            long var245 = var244 * var156;
                            long var157 = var245 & 7L;
                            long var263;
                            int var158 = (var263 = var157 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                            if (var158 != 0) {
                                var2 ^= 192682461;
                                var2 *= 1165850175;
                                var2 &= -1948605843;
                                var2 &= -1917417134;
                                var2 ^= -773653525;
                                break label205;
                            }
                            var2 = switch (var2) {
                                default -> var2 ^ 1452279478;
                                case 565799020 -> {
                                    var2 ^= -1566962065;
                                    yield var2 ^ -1184371083;
                                }
                                case 1129395281 -> var2 ^ 240429667;
                            };
                            Integer var159 = var2;
                            label168:
                            if (var159 != null) {
                                int var164;
                                if (var134) {
                                    var2 |= 990363857;
                                    var2 -= -1203311227;
                                    var2 -= -1283026861;
                                    var2 ^= 753256833;
                                    int var160 = var2 + 1;
                                    int var161 = var2 * var160;
                                    int var162 = var161 & 1;
                                    if (var162 != 0) {
                                        break label168;
                                    }

                                    int var163 = var1.bb();
                                    var206 = var3 + 1;
                                    var206 = var3 * var206;
                                    var7 = var3 + 2;
                                    var206 *= var7;
                                    var7 = var3 + 3;
                                    var206 *= var7;
                                    var206 &= 7;
                                    if (var206 != 0) {
                                        var2 += 2011203844;
                                        var2 += -2024290809;
                                        var2 ^= -1304974782;
                                        break label205;
                                    }

                                    var2 >>= 8;
                                    var2 += -1729479994;
                                    var2 |= 1460058622;
                                    var2 ^= 888896207;
                                    long var218 = var2;
                                    long var253 = var218 + 1L;
                                    var253 = var218 * var253;
                                    long var10 = var218 + 2L;
                                    var253 *= var10;
                                    long var219 = var218 + 3L;
                                    var253 *= var219;
                                    long var220 = var253 & 7L;
                                    long var264;
                                    var206 = (var264 = var220 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                                    if (var206 != 0) {
                                        break label168;
                                    }

                                    var164 = var163;
                                    switch (var2) {
                                        case -1447240498:
                                        default:
                                            var2 ^= 1338036257;
                                            break;
                                        case -348880591:
                                            var2 += 660096027;
                                            var2 ^= -1056314987;
                                            break;
                                        case 383507998:
                                            var2 ^= -327873418;
                                    }
                                } else {
                                    var2 ^= 825047317;
                                    var2 <<= 24;
                                    var2 += -1893829324;
                                    var2 ^= 1534017252;
                                    var164 = 1728053247;
                                    var2 -= 326443225;
                                    var2 &= 2071204430;
                                    var2 -= -177873997;
                                    var2 &= -1184967635;
                                    var2 ^= -880072488;
                                }

                                this.qn = var164;
                                int var165 = this.o;
                                TextStyle var166 = TextStyle.of(6.6F, var165);
                                TextStyle var167 = var166.semibold();
                                TextStyle var168 = var167.spacing(-0.04F);
                                this.JM = var168;
                                int var169 = this.qn;
                                Integer var222 = var3;
                                if (var222 == null) {
                                    var2 >>>= 29;
                                    var2 ^= 841644130;
                                    var2 ^= 1657406351;
                                    break label205;
                                }

                                var2 >>>= 2;
                                var2 ^= 1133666470;
                                TextStyle var170 = TextStyle.of(6.6F, var169);
                                TextStyle var171 = var170.medium();
                                this.St = var171;
                                int var172 = this.o;
                                TextStyle var173 = TextStyle.of(7.7F, var172);
                                TextStyle var174 = var173.semibold();
                                TextStyle var175 = var174.spacing(-0.06F);
                                this.vI = var175;
                                int var176 = this.d;
                                TextStyle var177 = TextStyle.of(6.5F, var176);
                                TextStyle var178 = var177.medium();
                                this.zm = var178;
                                int var179 = this.o;
                                TextStyle var180 = TextStyle.of(8.6F, var179);
                                TextStyle var181 = var180.semibold();
                                TextStyle var182 = var181.spacing(-0.08F);
                                this.V = var182;
                                int var183 = this.d;
                                TextStyle var184 = TextStyle.of(7.0F, var183);
                                TextStyle var185 = var184.medium();
                                this.lO = var185;
                                int var186 = this.d;
                                TextStyle var187 = TextStyle.of(5.8F, var186);
                                TextStyle var188 = var187.medium();
                                TextStyle var189 = var188.tabular();
                                this.Rp = var189;
                                int var190 = this.qn;
                                TextStyle var191 = TextStyle.of(7.0F, var190);
                                TextStyle var192 = var191.medium();
                                this.eR = var192;
                                int var193 = this.o;
                                TextStyle var194 = ii.rO(7.6F, var193);
                                this.fO = var194;
                                int var195 = this.o;
                                TextStyle var196 = ii.rO(10.4F, var195);
                                this.n = var196;
                                Nr var197;
                                int var137;
                                if (var134) {
                                    var2 &= -1663635804;
                                    var2 ^= 655774112;
                                    long var223 = var2;
                                    long var257 = var223 + 1L;
                                    var257 = var223 * var257;
                                    long var224 = var257 & 1L;
                                    long var265;
                                    int var135 = (var265 = var224 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                                    if (var135 != 0) {
                                        break label168;
                                    }

                                    int var136 = var1.MD();
                                    var222 = var3;
                                    if (var222 == null) {
                                        switch (var2) {
                                            case -631515209:
                                            default:
                                                var2 ^= -1268266087;
                                                break label205;
                                            case 860125984:
                                                var2 &= -1306943653;
                                                var2 -= -170671000;
                                                var2 ^= 1825320307;
                                                break label205;
                                            case 1341326955:
                                                var2 ^= 456574565;
                                                break label205;
                                        }
                                    }

                                    var2 ^= 1864930786;
                                    var2 |= -343268273;
                                    var2 ^= 46200478;
                                    int var226 = var2 + 1;
                                    var226 = var2 * var226;
                                    var226 &= 1;
                                    if (var226 != 0) {
                                        break label168;
                                    }

                                    var137 = var136;
                                    var2 ^= -1061307955;
                                    var2 ^= -1245966100;
                                } else {
                                    var2 += 1000421547;
                                    var2 >>= 23;
                                    var2 ^= 2064356991;
                                    var2 ^= 849888538;
                                    var2 ^= -476612689;
                                    int var229 = var2 + 1;
                                    var229 = var2 * var229;
                                    var229 &= 1;
                                    if (var229 != 0) {
                                        break label168;
                                    }

                                    var137 = -1;
                                    var2 *= 615242687;
                                    var2 >>>= 22;
                                    var2 ^= -1849208329;
                                    var2 ^= 434692383;
                                }

                                int var232 = var2 + 1;
                                var232 = var2 * var232;
                                var7 = var2 + 2;
                                var232 *= var7;
                                var7 = var2 + 3;
                                var232 *= var7;
                                var232 &= 7;
                                if (var232 == 0) {
                                    TextStyle var138 = TextStyle.of(9.6F, var137);
                                    TextStyle var139 = var138.bold();
                                    Integer var130 = var3;
                                    if (var130 == null) {
                                        switch (var2) {
                                            case -2010140304:
                                                var2 *= 8826757;
                                                var2 += 1452968906;
                                                var2 &= -1556668655;
                                                var2 ^= -756715013;
                                                break label205;
                                            case 1093115728:
                                                var2 ^= -112746390;
                                                break label205;
                                            case 1251324527:
                                            default:
                                                var2 ^= 1684750912;
                                                break label205;
                                        }
                                    }

                                    var2 *= 168525275;
                                    var2 ^= -1303737958;
                                    var2 ^= 1358651879;
                                    var130 = var2;
                                    if (var130 != null) {
                                        TextStyle var132 = var139.spacing(-0.12F);
                                        TextStyle var140 = this.eR;
                                        var197 = new Nr(var132, var140);
                                        this.Lm = var197;
                                        this.kr = false;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }

                IllegalStateException var133 = new IllegalStateException();
                throw var133;
            }
        }

        IllegalArgumentException var129 = new IllegalArgumentException();
        throw var129;
    }

    @Override
    protected void Mf() {
        label58: {
            int var26;
            var26 = kS;
            var26 ^= -585469316;
            int var2 = System.identityHashCode(this);
            Nr var3 = this.Lm;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            label57:
            if (var4 == 0) {
                var26 = switch (var26) {
                    case -700505422 -> var26 ^ -1863620897;
                    case 1281058059 -> {
                        var26 += 590100756;
                        yield var26 ^ -666752507;
                    }
                    default -> var26 ^ 1441561327;
                };
                if (var3 != null) {
                    var26 ^= 942974689;
                    var26 &= 1055895057;
                    var26 <<= 9;
                    var26 ^= -693212118;
                    Integer var43 = var26;
                    if (var43 == null) {
                        break label58;
                    }

                    var3 = this.Lm;
                    Integer var52 = var2;
                    if (var52 == null) {
                        var26 |= 1167168771;
                        var26 ^= 1086364878;
                        break label57;
                    }

                    var26 ^= -1229036837;
                    var26 |= -1827152442;
                    var26 ^= 387184072;
                    int var53 = var26 + 1;
                    var53 = var26 * var53;
                    var53 &= 1;
                    if (var53 != 0) {
                        break label58;
                    }

                    var3.FO();
                    switch (var26) {
                        case -1543239617:
                            var26 *= 668660203;
                            var26 &= -553304059;
                            var26 &= -1259165827;
                            var26 |= -1272480624;
                            var26 ^= -1334807710;
                            break;
                        case -715900699:
                        default:
                            var26 ^= -585468537;
                            break;
                        case 868677886:
                            var26 ^= -614827095;
                    }
                } else {
                    var26 <<= 4;
                    var26 += 1979855069;
                    var26 &= -496000815;
                    var26 ^= -434491482;
                }

                XF var45 = this.aJ;
                float var56 = this.u;
                var45.j(var56);
                XF var46 = this.I;
                float var57 = this.D;
                var46.j(var57);
                XF var47 = this.EN;
                long var58 = var2;
                long var6 = var58 + 1L;
                var6 = var58 * var6;
                long var8 = var58 + 2L;
                var6 *= var8;
                long var59 = var58 + 3L;
                var6 *= var59;
                long var60 = var6 & 7L;
                long var70;
                var2 = (var70 = var60 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                if (var2 == 0) {
                    var26 |= 2038450520;
                    var26 &= 275274188;
                    var26 &= -1162291150;
                    var26 ^= -354270761;
                    Lk var41 = this.pw;
                    float var61 = this.D;
                    var5 = var26 ^ 2026051688;
                    var5 *= 2111588609;
                    var5 *= 915066461;
                    var5 ^= 790812755;
                    float var42 = aw(var41, var61, var5);
                    var47.j(var42);
                    return;
                }

                var26 *= -774241821;
                var26 ^= 2061655264;
            } else {
                switch (var26) {
                    case 297427637:
                        var26 ^= 621237341;
                        break;
                    case 1281058059:
                        var26 -= -1328612518;
                        var26 |= -1193718082;
                        var26 ^= -1364841382;
                        break;
                    case 1284041755:
                    default:
                        var26 ^= -2103302659;
                }
            }

            Integer var37 = var26;
            if (var37 != null) {
                IllegalStateException var39 = new IllegalStateException();
                throw var39;
            }
        }

        IllegalStateException var38 = new IllegalStateException();
        throw var38;
    }

    @Override
    protected boolean BM(lH_3 var1) {
        boolean var1020 = false;
        boolean var726 = false;
        Lk var736 = null;
        boolean var746 = false;
        float var754 = 0.0F;
        boolean var952 = false;
        label1070: {
            int var28;
            var28 = kS;
            var28 ^= 625783482;
            int var3 = System.identityHashCode(this);
            boolean var4 = this.kr;
            int var5 = var3 + 1;
            var5 = var3 * var5;
            var5 &= 1;
            label1069:
            if (var5 == 0) {
                var28 ^= 1487171851;
                var28 += 2077446533;
                var28 |= 1887455305;
                var28 ^= 970969742;
                Integer var674 = var28;
                if (var674 == null) {
                    break label1070;
                }

                if (var4) {
                    var28 = switch (var28) {
                        default -> var28 ^ 48550416;
                        case 110712582 -> var28 ^ -639495720;
                        case 1092795589 -> {
                            var28 &= 1226151003;
                            yield var28 ^ -1679344875;
                        }
                    };
                    Oo var667 = var1.x();
                    long var675 = var3;
                    long var7 = var675 + 1L;
                    var7 = var675 * var7;
                    long var9 = var675 + 2L;
                    var7 *= var9;
                    long var676 = var675 + 3L;
                    var7 *= var676;
                    long var677 = var7 & 7L;
                    long var1356;
                    int var678 = (var1356 = var677 - 0L) == 0L ? 0 : (var1356 < 0L ? -1 : 1);
                    if (var678 != 0) {
                        var28 >>= 14;
                        var28 ^= 354917179;
                        break label1069;
                    }

                    var28 *= 77559435;
                    var28 ^= -52155209;
                    this.r(var667);
                    var28 ^= -1081751280;
                    var28 ^= 169960514;
                } else {
                    switch (var28) {
                        case -1759872912:
                            var28 ^= -80869932;
                            break;
                        case 1092795589:
                            var28 += -674073679;
                            var28 ^= 599826449;
                            var28 >>= 1;
                            var28 &= 1029068354;
                            var28 ^= -1885721733;
                            break;
                        case 1316850821:
                        default:
                            var28 ^= -1392451473;
                    }
                }

                Integer var668 = var28;
                if (var668 == null) {
                    break label1070;
                }

                String var669 = i_2.V();
                long var679 = var3;
                long var920 = var679 + 1L;
                var920 = var679 * var920;
                long var1021 = var679 + 2L;
                var920 *= var1021;
                long var680 = var679 + 3L;
                var920 *= var680;
                long var681 = var920 & 7L;
                long var1357;
                int var682 = (var1357 = var681 - 0L) == 0L ? 0 : (var1357 < 0L ? -1 : 1);
                if (var682 != 0) {
                    switch (var28) {
                        case -1836553351:
                            var28 += -42933520;
                            var28 ^= 1696710348;
                            break;
                        case 41436557:
                        default:
                            var28 ^= -592035802;
                            break;
                        case 1423767075:
                            var28 ^= -1374796601;
                    }
                } else {
                    label1156: {
                        var28 = switch (var28) {
                            case -1836553351 -> {
                                var28 >>= 22;
                                var28 >>>= 30;
                                var28 >>>= 11;
                                var28 *= -354943437;
                                yield var28 ^ -649110713;
                            }
                            default -> var28 ^ 13382533;
                            case 806001242 -> var28 ^ -120965670;
                        };
                        if (var669 != null) {
                            var28 += -766982231;
                            var28 |= 1963235615;
                            var28 >>= 24;
                            var28 -= -754284963;
                            var28 ^= -1737656195;
                            long var683 = var28;
                            var920 = var683 + 1L;
                            var920 = var683 * var920;
                            var1021 = var683 + 2L;
                            var920 *= var1021;
                            long var684 = var683 + 3L;
                            var920 *= var684;
                            long var685 = var920 & 7L;
                            long var1358;
                            var682 = (var1358 = var685 - 0L) == 0L ? 0 : (var1358 < 0L ? -1 : 1);
                            if (var682 != 0) {
                                break label1070;
                            }

                            String var687 = this.vV;
                            long var6 = var3;
                            long var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var1359;
                            int var781 = (var1359 = var6 - 0L) == 0L ? 0 : (var1359 < 0L ? -1 : 1);
                            if (var781 != 0) {
                                var28 ^= 1530671948;
                                var28 |= -1550886069;
                                var28 <<= 26;
                                var28 ^= -2032602971;
                                break label1156;
                            }

                            var28 -= -362248104;
                            var28 ^= -1760623206;
                            var28 -= -72555921;
                            var28 &= -128110303;
                            var28 ^= -526029709;
                            int var782 = var28 + 1;
                            int var783 = var28 * var782;
                            int var928 = var28 + 2;
                            int var784 = var783 * var928;
                            int var929 = var28 + 3;
                            int var785 = var784 * var929;
                            int var786 = var785 & 7;
                            if (var786 != 0) {
                                break label1070;
                            }

                            int var688 = (var669.equals(var687)) ? 1 : 0;
                            if (var688 == 0) {
                                var28 |= -162577522;
                                var28 ^= -979701088;
                                var688 = var28 + 1;
                                var688 = var28 * var688;
                                int var787 = var28 + 2;
                                var688 *= var787;
                                int var788 = var28 + 3;
                                var688 *= var788;
                                var688 &= 7;
                                if (var688 != 0) {
                                    break label1070;
                                }

                                this.vV = var669;
                                Integer var694 = var3;
                                if (var694 == null) {
                                    var28 ^= 2091128968;
                                    var28 &= 592556544;
                                    var28 -= 1376465387;
                                    var28 &= 1166299964;
                                    var28 ^= -337861967;
                                    break label1156;
                                }

                                var28 |= -858163124;
                                var28 &= 990488325;
                                var28 ^= -1767171136;
                                long var695 = var28;
                                var920 = var695 + 1L;
                                var920 = var695 * var920;
                                var1021 = var695 + 2L;
                                var920 *= var1021;
                                long var696 = var695 + 3L;
                                var920 *= var696;
                                long var697 = var920 & 7L;
                                long var1360;
                                int var698 = (var1360 = var697 - 0L) == 0L ? 0 : (var1360 < 0L ? -1 : 1);
                                if (var698 != 0) {
                                    break label1070;
                                }

                                Bp_2 var670 = Bp_2.jb(var669);
                                this.Ki = var670;
                                var28 &= 1220764459;
                                var28 <<= 27;
                                var28 += -1028934696;
                                var28 |= 710761004;
                                var28 ^= -10618185;
                            } else {
                                var28 += -1933536580;
                                var28 ^= 404164932;
                            }
                        } else {
                            switch (var28) {
                                case -1812276188:
                                    var28 ^= -1885890732;
                                    break;
                                case -649110713:
                                    var28 -= 1095816053;
                                    var28 |= -523854838;
                                    var28 *= 1128316023;
                                    var28 ^= 1558341405;
                                    break;
                                case 5170991:
                                default:
                                    var28 ^= -327702535;
                            }
                        }

                        float var671 = var1.l();
                        double var699 = this.W;
                        double var934 = var671;
                        Integer var1024 = var3;
                        label1047:
                        if (var1024 != null) {
                            var28 = switch (var28) {
                                case -550244600 -> var28 ^ 889845521;
                                default -> var28 ^ -173065279;
                                case 362938699 -> {
                                    var28 += -373309563;
                                    var28 &= 380344147;
                                    yield var28 ^ 1110588472;
                                }
                            };
                            var1021 = var28;
                            long var11 = var1021 + 1L;
                            var11 = var1021 * var11;
                            var1021 = var11 & 1L;
                            long var1361;
                            int var1027 = (var1361 = var1021 - 0L) == 0L ? 0 : (var1361 < 0L ? -1 : 1);
                            if (var1027 != 0) {
                                break label1070;
                            }

                            double var700 = var699 + var934;
                            this.W = var700;
                            long var701 = System.currentTimeMillis();
                            int var935 = var28 & 1719874361;
                            int var936 = var935 ^ -1326995253;
                            If var937 = this.f(var936);
                            FX var983 = var937.c();
                            if (var983 != null) {
                                var28 *= 2133349949;
                                var28 -= -1219682379;
                                var28 ^= -1759967570;
                                FX var1051 = this.IL;
                                long var1221 = var3;
                                long var1337 = var1221 + 1L;
                                var1337 = var1221 * var1337;
                                long var1355 = var1221 + 2L;
                                var1337 *= var1355;
                                var1221 += 3L;
                                var1337 *= var1221;
                                var1221 = var1337 & 7L;
                                long var1362;
                                int var1224 = (var1362 = var1221 - 0L) == 0L ? 0 : (var1362 < 0L ? -1 : 1);
                                if (var1224 != 0) {
                                    var28 |= -657720206;
                                    var28 += 609444640;
                                    var28 &= -24032121;
                                    var28 ^= -926306142;
                                    break label1047;
                                }

                                var28 |= -10530466;
                                var28 ^= 830455769;
                                boolean var1052 = var983.sameTrack(var1051);
                                if (!var1052) {
                                    var28 += -1338188820;
                                    var28 ^= 1941876380;
                                    var28 ^= -1493594949;
                                    int var1053 = var28 + 1;
                                    int var1054 = var28 * var1053;
                                    int var1055 = var1054 & 1;
                                    if (var1055 != 0) {
                                        break label1070;
                                    }

                                    boolean var1056 = var1.tl();
                                    var1221 = var3;
                                    var1337 = var1221 + 1L;
                                    var1337 = var1221 * var1337;
                                    var1221 = var1337 & 1L;
                                    long var1363;
                                    int var1227 = (var1363 = var1221 - 0L) == 0L ? 0 : (var1363 < 0L ? -1 : 1);
                                    if (var1227 != 0) {
                                        var28 &= -2005110403;
                                        var28 ^= 1654714512;
                                        break label1047;
                                    }

                                    var28 *= -373102791;
                                    var28 |= -1570258824;
                                    var28 >>>= 15;
                                    var28 ^= -804520814;
                                    int var1228 = var28 * -551929627;
                                    int var1229 = var1228 ^ -696020435;
                                    this.pY(var983, var1056, var1229);
                                    var28 += -1689203355;
                                    var28 ^= -57341018;
                                    var28 ^= 798169463;
                                    var28 <<= 18;
                                    var28 ^= 1469285114;
                                } else {
                                    switch (var28) {
                                        case -830452698:
                                            var28 |= 1394143966;
                                            var28 ^= -578323452;
                                            break;
                                        case -419619424:
                                            var28 ^= -263124569;
                                            break;
                                        case 203289530:
                                        default:
                                            var28 ^= 448530739;
                                    }
                                }

                                var1021 = var28;
                                var11 = var1021 + 1L;
                                var11 = var1021 * var11;
                                var1021 = var11 & 1L;
                                long var1364;
                                int var1059 = (var1364 = var1021 - 0L) == 0L ? 0 : (var1364 < 0L ? -1 : 1);
                                if (var1059 != 0) {
                                    break label1070;
                                }

                                this.IL = var983;
                                var1021 = var3;
                                var11 = var1021 + 1L;
                                var11 = var1021 * var11;
                                var1021 = var11 & 1L;
                                long var1365;
                                int var1062 = (var1365 = var1021 - 0L) == 0L ? 0 : (var1365 < 0L ? -1 : 1);
                                if (var1062 != 0) {
                                    var28 -= 663883666;
                                    var28 |= 1663680057;
                                    var28 += -1674681118;
                                    var28 ^= 2097452286;
                                    break label1047;
                                }
                                var28 = switch (var28) {
                                    case 35619578 -> {
                                        var28 >>>= 7;
                                        yield var28 ^ -99891820;
                                    }
                                    default -> var28 ^ 1651006349;
                                    case 1976446466 -> var28 ^ 1445102189;
                                };
                                var1021 = var28;
                                var11 = var1021 + 1L;
                                var11 = var1021 * var11;
                                var1021 = var11 & 1L;
                                long var1366;
                                int var1065 = (var1366 = var1021 - 0L) == 0L ? 0 : (var1366 < 0L ? -1 : 1);
                                if (var1065 != 0) {
                                    break label1070;
                                }

                                boolean var1066 = var983.playing();
                                if (var1066) {
                                    var28 += -2131678331;
                                    var28 -= -1090917761;
                                    var28 ^= -794107594;
                                    this.KA = -1L;
                                    var28 ^= -404628250;
                                    var28 += -576354674;
                                    var28 >>>= 3;
                                    var28 -= 1224068995;
                                    var28 ^= -333463808;
                                } else {
                                    var28 -= -1742527879;
                                    var28 ^= -756237612;
                                    var1021 = var28;
                                    var11 = var1021 + 1L;
                                    var11 = var1021 * var11;
                                    long var1346 = var1021 + 2L;
                                    var11 *= var1346;
                                    var1021 += 3L;
                                    var11 *= var1021;
                                    var1021 = var11 & 7L;
                                    long var1367;
                                    int var1070 = (var1367 = var1021 - 0L) == 0L ? 0 : (var1367 < 0L ? -1 : 1);
                                    if (var1070 != 0) {
                                        break label1070;
                                    }

                                    var1021 = this.KA;
                                    Integer var1281 = var3;
                                    if (var1281 == null) {
                                        var28 >>= 4;
                                        var28 ^= 300480137;
                                        break label1047;
                                    }
                                    var28 = switch (var28) {
                                        case -1983132743 -> var28 ^ -2126002107;
                                        case -1291820340 -> {
                                            var28 ^= 1530016506;
                                            yield var28 ^ 1423885679;
                                        }
                                        default -> var28 ^ 1669896334;
                                    };
                                    Integer var1282 = var28;
                                    if (var1282 == null) {
                                        break label1070;
                                    }

                                    long var1368;
                                    int var1072 = (var1368 = var1021 - 0L) == 0L ? 0 : (var1368 < 0L ? -1 : 1);
                                    if (var1072 < 0) {
                                        var28 = switch (var28) {
                                            case -1125345959 -> {
                                                var28 -= 1551253734;
                                                var28 &= 351345478;
                                                yield var28 ^ 268342282;
                                            }
                                            case -150118962 -> var28 ^ 1551305331;
                                            default -> var28 ^ -1602396194;
                                        };
                                        int var1073 = var28 + 1;
                                        int var1074 = var28 * var1073;
                                        int var1075 = var1074 & 1;
                                        if (var1075 != 0) {
                                            break label1070;
                                        }

                                        this.KA = var701;
                                        var28 &= 1710478155;
                                        var28 *= -564107017;
                                        var28 -= -800639593;
                                        var28 ^= 663229174;
                                    } else {
                                        var28 |= 976247731;
                                        var28 *= 1713799947;
                                        var28 ^= -192229922;
                                    }
                                }
                            } else {
                                var28 >>>= 7;
                                var28 |= -1020892043;
                                var28 &= -724667922;
                                var28 ^= -230979944;
                                int var1028 = var28 + 1;
                                int var1029 = var28 * var1028;
                                int var10 = var28 + 2;
                                int var1030 = var1029 * var10;
                                var10 = var28 + 3;
                                int var1031 = var1030 * var10;
                                int var1032 = var1031 & 7;
                                if (var1032 != 0) {
                                    break label1070;
                                }

                                FX var1033 = this.IL;
                                var10 = var3 + 1;
                                var10 = var3 * var10;
                                int var1263 = var3 + 2;
                                var10 *= var1263;
                                int var1264 = var3 + 3;
                                var10 *= var1264;
                                var10 &= 7;
                                if (var10 != 0) {
                                    var28 *= -1595564999;
                                    var28 ^= 1906796093;
                                    var28 |= 334885069;
                                    var28 ^= -1188625592;
                                    break label1047;
                                }
                                var28 = switch (var28) {
                                    default -> var28 ^ -1331089876;
                                    case 850782196 -> {
                                        var28 &= -346560468;
                                        yield var28 ^ -1575850060;
                                    }
                                    case 958479988 -> var28 ^ 162239722;
                                };
                                var10 = var28 + 1;
                                var10 = var28 * var10;
                                var10 &= 1;
                                if (var10 != 0) {
                                    break label1070;
                                }

                                label1038:
                                if (var1033 != null) {
                                    var28 >>= 7;
                                    var28 &= 1951565351;
                                    var28 ^= 1434521469;
                                    var28 ^= -1636249006;
                                    int var1034 = var28 + 1;
                                    int var1035 = var28 * var1034;
                                    var10 = var28 + 2;
                                    int var1036 = var1035 * var10;
                                    var10 = var28 + 3;
                                    int var1037 = var1036 * var10;
                                    int var1038 = var1037 & 7;
                                    if (var1038 != 0) {
                                        break label1070;
                                    }

                                    boolean var1039 = var1.tl();
                                    long var1201 = var3;
                                    long var12 = var1201 + 1L;
                                    var12 = var1201 * var12;
                                    long var1202 = var12 & 1L;
                                    long var1369;
                                    var10 = (var1369 = var1202 - 0L) == 0L ? 0 : (var1369 < 0L ? -1 : 1);
                                    if (var10 != 0) {
                                        var28 += 1950060812;
                                        var28 ^= -1989297943;
                                        var28 |= 699511598;
                                        var28 += -394621187;
                                        var28 ^= 1286370905;
                                        break label1047;
                                    }

                                    var28 *= 878394739;
                                    var28 -= -607251348;
                                    var28 >>= 22;
                                    var28 ^= -476757409;
                                    if (!var1039) {
                                        var28 ^= -1412326864;
                                        var28 ^= -2072516993;
                                        var1021 = var28;
                                        var11 = var1021 + 1L;
                                        var11 = var1021 * var11;
                                        long var13 = var1021 + 2L;
                                        var11 *= var13;
                                        var1021 += 3L;
                                        var11 *= var1021;
                                        var1021 = var11 & 7L;
                                        long var1370;
                                        int var1043 = (var1370 = var1021 - 0L) == 0L ? 0 : (var1370 < 0L ? -1 : 1);
                                        if (var1043 != 0) {
                                            break label1070;
                                        }

                                        float var1044 = this.Hu();
                                        Integer var1204 = var3;
                                        if (var1204 == null) {
                                            var28 |= 995943617;
                                            var28 &= -497638594;
                                            var28 ^= -477662293;
                                            var28 |= -1786314770;
                                            var28 ^= 1057951578;
                                            break label1047;
                                        }
                                        var28 = switch (var28) {
                                            case -24862240 -> var28 ^ 1889064896;
                                            case 869056983 -> {
                                                var28 |= 784850128;
                                                yield var28 ^ 1091172637;
                                            }
                                            default -> var28 ^ -2000358900;
                                        };
                                        var1204 = var28;
                                        if (var1204 == null) {
                                            break label1070;
                                        }

                                        float var1371;
                                        int var1045 = (var1371 = var1044 - 0.01F) == 0.0F ? 0 : (var1371 < 0.0F ? -1 : 1);
                                        if (var1045 >= 0) {
                                            var28 |= 188496523;
                                            var28 >>>= 3;
                                            var28 ^= -972051756;
                                            FX var1046 = this.IL;
                                            boolean var1047 = var1046.playing();
                                            var1204 = var3;
                                            if (var1204 == null) {
                                                var28 -= 2090320377;
                                                var28 ^= -1484760143;
                                                break label1047;
                                            }

                                            var28 -= -446752973;
                                            var28 ^= -343881519;
                                            int var1207 = var28 + 1;
                                            var1207 = var28 * var1207;
                                            int var1269 = var28 + 2;
                                            var1207 *= var1269;
                                            int var1270 = var28 + 3;
                                            var1207 *= var1270;
                                            var1207 &= 7;
                                            if (var1207 != 0) {
                                                break label1070;
                                            }

                                            if (var1047) {
                                                var28 -= -846923099;
                                                var28 |= 383767974;
                                                var28 |= 750199465;
                                                var28 ^= 1314866145;
                                                FX var1048 = this.IL;
                                                var1207 = var3 + 1;
                                                var1207 = var3 * var1207;
                                                var1207 &= 1;
                                                if (var1207 != 0) {
                                                    var28 *= -178220697;
                                                    var28 += -589309701;
                                                    var28 ^= 790415416;
                                                    break label1047;
                                                }

                                                var28 &= 18980922;
                                                var28 += 2008223029;
                                                var28 ^= -1604815654;
                                                long var1215 = var28;
                                                var12 = var1215 + 1L;
                                                var12 = var1215 * var12;
                                                long var14 = var1215 + 2L;
                                                var12 *= var14;
                                                long var1216 = var1215 + 3L;
                                                var12 *= var1216;
                                                long var1217 = var12 & 7L;
                                                long var1372;
                                                var1207 = (var1372 = var1217 - 0L) == 0L ? 0 : (var1372 < 0L ? -1 : 1);
                                                if (var1207 != 0) {
                                                    break label1070;
                                                }

                                                FX var1219 = this.IL;
                                                long var1220 = var1219.positionAt(var701);
                                                FX var1049 = var1048.withPlayback(false, var1220, var701);
                                                this.IL = var1049;
                                                var28 += -1904320555;
                                                var28 -= 1498629890;
                                                var28 |= 383772907;
                                                var28 >>= 14;
                                                var28 ^= 674734824;
                                            } else {
                                                switch (var28) {
                                                    case 252812555:
                                                        var28 *= -1060802133;
                                                        var28 ^= 851666978;
                                                        var28 ^= -1394169194;
                                                        var28 += -1013980243;
                                                        var28 ^= 437205645;
                                                        break label1038;
                                                    case 734935766:
                                                        var28 ^= -1899492299;
                                                        break label1038;
                                                    case 812217263:
                                                    default:
                                                        var28 ^= -1062579750;
                                                }
                                            }
                                            break label1038;
                                        }

                                        var28 -= -1542943661;
                                        var28 += 1402130615;
                                        var28 &= -1021348289;
                                        var28 >>= 17;
                                        var28 ^= 1616539270;
                                    } else {
                                        var28 &= -624348006;
                                        var28 &= -2100418099;
                                        var28 ^= 2062926910;
                                        var28 ^= 451382072;
                                    }

                                    Integer var1050 = var28;
                                    if (var1050 == null) {
                                        break label1070;
                                    }

                                    this.IL = null;
                                    var28 -= 1290758226;
                                    var28 ^= 995940907;
                                } else {
                                    var28 &= 1388844290;
                                    var28 |= 1445943238;
                                    var28 ^= 2115537617;
                                }
                            }

                            JL var1076 = this.K;
                            Integer var1230 = var3;
                            if (var1230 == null) {
                                var28 -= -278964499;
                                var28 ^= -771721585;
                            } else {
                                label1088: {
                                    var28 *= 2025885613;
                                    var28 -= -1672113487;
                                    var28 ^= -387125505;
                                    boolean var1077 = var1076.vb();
                                    if (var1077) {
                                        var28 ^= -846440450;
                                        var28 ^= -1370823897;
                                        var28 ^= 187484250;
                                        var1021 = var28;
                                        var11 = var1021 + 1L;
                                        var11 = var1021 * var11;
                                        long var1347 = var1021 + 2L;
                                        var11 *= var1347;
                                        var1021 += 3L;
                                        var11 *= var1021;
                                        var1021 = var11 & 7L;
                                        long var1373;
                                        int var1081 = (var1373 = var1021 - 0L) == 0L ? 0 : (var1373 < 0L ? -1 : 1);
                                        if (var1081 != 0) {
                                            break label1070;
                                        }

                                        int var1082 = var28 - 1420843778;
                                        int var1083 = var1082 & -895539008;
                                        int var1084 = var1083 ^ -2119998943;
                                        Zq var1085 = this.PJ(var1084);
                                        var1230 = var3;
                                        if (var1230 == null) {
                                            var28 &= 1351043547;
                                            var28 ^= -1159923673;
                                            break label1088;
                                        }

                                        var28 += -1541387992;
                                        var28 ^= 582141505;
                                        var1230 = var28;
                                        if (var1230 == null) {
                                            break label1070;
                                        }

                                        var1085.f(var983);
                                        var28 |= 444191023;
                                        var28 ^= 2077205661;
                                    } else {
                                        var28 >>>= 3;
                                        var28 ^= -691486922;
                                    }

                                    int var1086 = var28 + 1;
                                    int var1087 = var28 * var1086;
                                    int var1233 = var28 + 2;
                                    int var1088 = var1087 * var1233;
                                    var1233 = var28 + 3;
                                    int var1089 = var1088 * var1233;
                                    int var1090 = var1089 & 7;
                                    if (var1090 != 0) {
                                        break label1070;
                                    }

                                    sN_2 var1091 = this.SG;
                                    YG var938 = var937.ZQ();
                                    Ud var1235 = Ud.Z();
                                    AuraRenderer var1236 = var1235.ZP();
                                    var1091.Kz(var938, var1236, var671);
                                    var1021 = var3;
                                    var11 = var1021 + 1L;
                                    var11 = var1021 * var11;
                                    long var1348 = var1021 + 2L;
                                    var11 *= var1348;
                                    var1021 += 3L;
                                    var11 *= var1021;
                                    var1021 = var11 & 7L;
                                    long var1374;
                                    int var939 = (var1374 = var1021 - 0L) == 0L ? 0 : (var1374 < 0L ? -1 : 1);
                                    if (var939 != 0) {
                                        var28 |= 1354517698;
                                        var28 -= 764828807;
                                        var28 ^= 403787852;
                                        var28 += -1644300988;
                                        var28 ^= -1276274482;
                                    } else {
                                        label1182: {
                                            var28 = switch (var28) {
                                                case -1070565582 -> {
                                                    var28 *= 1589594467;
                                                    var28 += -115881243;
                                                    var28 |= -138787062;
                                                    var28 ^= -109783332;
                                                    yield var28 ^ 1108413258;
                                                }
                                                default -> var28 ^ 1035392459;
                                                case 461849068 -> var28 ^ 1651514039;
                                            };
                                            int var940 = var28 + 1;
                                            int var941 = var28 * var940;
                                            int var1095 = var28 + 2;
                                            int var942 = var941 * var1095;
                                            int var1096 = var28 + 3;
                                            int var943 = var942 * var1096;
                                            int var944 = var943 & 7;
                                            if (var944 != 0) {
                                                break label1070;
                                            }

                                            label985: {
                                                label1091: {
                                                    if (var983 != null) {
                                                        var28 -= 827028304;
                                                        var28 &= -919179240;
                                                        var28 -= 1815465344;
                                                        var28 -= 1454872547;
                                                        var28 ^= -1527430265;
                                                        JL var945 = this.nE;
                                                        long var984 = var3;
                                                        long var1237 = var984 + 1L;
                                                        long var1238 = var984 * var1237;
                                                        long var1343 = var984 + 2L;
                                                        long var1239 = var1238 * var1343;
                                                        long var985 = var984 + 3L;
                                                        long var1240 = var1239 * var985;
                                                        long var986 = var1240 & 7L;
                                                        long var1375;
                                                        int var987 = (var1375 = var986 - 0L) == 0L ? 0 : (var1375 < 0L ? -1 : 1);
                                                        if (var987 != 0) {
                                                            switch (var28) {
                                                                case -1856755304:
                                                                default:
                                                                    var28 ^= -277617250;
                                                                    break label1182;
                                                                case -1697539790:
                                                                    var28 ^= 79756681;
                                                                    var28 <<= 16;
                                                                    var28 ^= 1231189808;
                                                                    var28 ^= -956201067;
                                                                    break label1182;
                                                                case -1602380769:
                                                                    var28 ^= 311756005;
                                                                    break label1182;
                                                            }
                                                        }

                                                        var28 += 1262941577;
                                                        var28 += -1370682683;
                                                        var28 >>>= 19;
                                                        var28 ^= 1862984847;
                                                        long var988 = var28;
                                                        long var1241 = var988 + 1L;
                                                        long var1242 = var988 * var1241;
                                                        var1343 = var988 + 2L;
                                                        long var1243 = var1242 * var1343;
                                                        long var989 = var988 + 3L;
                                                        long var1244 = var1243 * var989;
                                                        long var990 = var1244 & 7L;
                                                        long var1376;
                                                        int var991 = (var1376 = var990 - 0L) == 0L ? 0 : (var1376 < 0L ? -1 : 1);
                                                        if (var991 != 0) {
                                                            break label1070;
                                                        }

                                                        boolean var946 = var945.vb();
                                                        if (!var946) {
                                                            switch (var28) {
                                                                case 463858152:
                                                                default:
                                                                    var28 ^= 578565771;
                                                                    break label1091;
                                                                case 1318068553:
                                                                    var28 ^= -1112007559;
                                                                    break label1091;
                                                                case 1862989315:
                                                                    var28 ^= -1339324958;
                                                                    var28 -= -512619439;
                                                                    var28 ^= 1066889003;
                                                                    var28 >>>= 13;
                                                                    var28 ^= 1732131147;
                                                                    break label1091;
                                                            }
                                                        }

                                                        var28 -= -466344913;
                                                        var28 *= 1658483669;
                                                        var28 |= -383192358;
                                                        var28 ^= -983462932;
                                                        var920 = this.KA;
                                                        long var1377;
                                                        int var948 = (var1377 = var920 - 0L) == 0L ? 0 : (var1377 < 0L ? -1 : 1);
                                                        Integer var992 = var3;
                                                        if (var992 == null) {
                                                            switch (var28) {
                                                                case -1564254585:
                                                                default:
                                                                    var28 ^= 176174466;
                                                                    break label1182;
                                                                case 1053784082:
                                                                    var28 ^= -1520907581;
                                                                    var28 &= 702527499;
                                                                    var28 ^= -481345372;
                                                                    break label1182;
                                                                case 1455340386:
                                                                    var28 ^= 1955647998;
                                                                    break label1182;
                                                            }
                                                        }

                                                        var28 &= 1668441069;
                                                        var28 -= 1104589215;
                                                        var28 *= -215640625;
                                                        var28 ^= 174232764;
                                                        var28 ^= -234670869;
                                                        int var993 = var28 + 1;
                                                        int var994 = var28 * var993;
                                                        int var1097 = var28 + 2;
                                                        int var995 = var994 * var1097;
                                                        int var1098 = var28 + 3;
                                                        int var996 = var995 * var1098;
                                                        int var997 = var996 & 7;
                                                        if (var997 != 0) {
                                                            break label1070;
                                                        }

                                                        if (var948 < 0) {
                                                            var28 += 1314860482;
                                                            var28 &= -2132488631;
                                                            var28 ^= -732768949;
                                                            var28 ^= 858718088;
                                                            break label1091;
                                                        }

                                                        var28 &= 80223293;
                                                        var28 &= 198473685;
                                                        var28 ^= -906023619;
                                                        var920 = this.KA;
                                                        var920 = var701 - var920;
                                                        Integer var1099 = var3;
                                                        if (var1099 == null) {
                                                            var28 ^= 147584847;
                                                            var28 >>= 13;
                                                            var28 ^= 354877187;
                                                            break label1182;
                                                        }

                                                        var28 &= 856647341;
                                                        var28 &= 665375411;
                                                        var28 ^= 1360815260;
                                                        long var1378;
                                                        int var951 = (var1378 = var920 - 8000L) == 0L ? 0 : (var1378 < 0L ? -1 : 1);
                                                        if (var951 <= 0) {
                                                            var28 &= -900307770;
                                                            var28 >>= 20;
                                                            var28 ^= 1731734666;
                                                            break label1091;
                                                        }

                                                        switch (var28) {
                                                            case -6719708:
                                                                var28 ^= -1951700496;
                                                                break;
                                                            case 950990785:
                                                            default:
                                                                var28 ^= 243401337;
                                                                break;
                                                            case 1343513789:
                                                                var28 *= 555051877;
                                                                var28 &= 1977348626;
                                                                var28 |= -113905490;
                                                                var28 &= -924764900;
                                                                var28 ^= 108285073;
                                                        }
                                                    } else {
                                                        var28 &= -1721761474;
                                                        var28 >>>= 22;
                                                        var28 += -698368377;
                                                        var28 ^= 411746821;
                                                    }

                                                    int var998 = var28 + 1;
                                                    int var999 = var28 * var998;
                                                    int var1100 = var28 + 2;
                                                    int var1000 = var999 * var1100;
                                                    int var1101 = var28 + 3;
                                                    int var1001 = var1000 * var1101;
                                                    int var1002 = var1001 & 7;
                                                    if (var1002 != 0) {
                                                        break label1070;
                                                    }

                                                    var952 = false;
                                                    var28 &= 292166334;
                                                    var28 -= -1364124519;
                                                    var28 &= -1120179445;
                                                    var28 |= -1309392331;
                                                    var28 ^= 1583663254;
                                                    break label985;
                                                }

                                                var952 = true;
                                                var28 *= -1034499137;
                                                var28 &= -223165217;
                                                var28 >>= 29;
                                                var28 ^= -275078238;
                                            }

                                            int var1003 = var3 + 1;
                                            int var1004 = var3 * var1003;
                                            int var1005 = var1004 & 1;
                                            if (var1005 != 0) {
                                                var28 += 273993245;
                                                var28 |= -322652667;
                                                var28 |= -2094663772;
                                                var28 ^= 355927834;
                                            } else {
                                                label1183: {
                                                    var28 *= 1161158203;
                                                    var28 >>>= 31;
                                                    var28 -= 1681353248;
                                                    var28 *= 652888635;
                                                    var28 ^= -1155669197;
                                                    int var1006 = var28 + 1;
                                                    int var1007 = var28 * var1006;
                                                    int var1008 = var1007 & 1;
                                                    if (var1008 != 0) {
                                                        break label1070;
                                                    }

                                                    label958: {
                                                        label957: {
                                                            label1164: {
                                                                if (!var952) {
                                                                    var28 |= 1380797213;
                                                                    var28 += -485563654;
                                                                    var28 += -2032411360;
                                                                    var28 ^= 1006163710;
                                                                    int var1009 = var28 + 1;
                                                                    int var1010 = var28 * var1009;
                                                                    int var1011 = var1010 & 1;
                                                                    if (var1011 != 0) {
                                                                        break label1070;
                                                                    }

                                                                    boolean var1012 = var1.tl();
                                                                    var1021 = var3;
                                                                    var11 = var1021 + 1L;
                                                                    var11 = var1021 * var11;
                                                                    var1348 = var1021 + 2L;
                                                                    var11 *= var1348;
                                                                    var1021 += 3L;
                                                                    var11 *= var1021;
                                                                    var1021 = var11 & 7L;
                                                                    long var1379;
                                                                    int var1105 = (var1379 = var1021 - 0L) == 0L ? 0 : (var1379 < 0L ? -1 : 1);
                                                                    if (var1105 != 0) {
                                                                        var28 *= -549364079;
                                                                        var28 ^= -143460516;
                                                                        break label1183;
                                                                    }

                                                                    var28 += -495308478;
                                                                    var28 *= 744738265;
                                                                    var28 -= -315675537;
                                                                    var28 ^= -2138453216;
                                                                    if (!var1012) {
                                                                        switch (var28) {
                                                                            case 1010735219:
                                                                            default:
                                                                                var28 ^= -1240408252;
                                                                                break label1164;
                                                                            case 1152007185:
                                                                                var28 ^= 1521524809;
                                                                                break label1164;
                                                                            case 1705518116:
                                                                                var28 ^= 1165391326;
                                                                                var28 >>>= 29;
                                                                                var28 >>= 17;
                                                                                var28 ^= -1902240088;
                                                                                break label1164;
                                                                        }
                                                                    }

                                                                    var28 &= -542556148;
                                                                    var28 ^= 1011853865;
                                                                    var28 |= -81782804;
                                                                    var28 ^= -1976136894;
                                                                } else {
                                                                    var28 >>= 13;
                                                                    var28 *= -1161525629;
                                                                    var28 ^= 172610518;
                                                                }

                                                                long var1013 = var28;
                                                                long var1245 = var1013 + 1L;
                                                                long var1246 = var1013 * var1245;
                                                                long var1345 = var1013 + 2L;
                                                                long var1247 = var1246 * var1345;
                                                                long var1014 = var1013 + 3L;
                                                                long var1248 = var1247 * var1014;
                                                                long var1015 = var1248 & 7L;
                                                                long var1380;
                                                                int var1016 = (var1380 = var1015 - 0L) == 0L ? 0 : (var1380 < 0L ? -1 : 1);
                                                                if (var1016 != 0) {
                                                                    break label1070;
                                                                }

                                                                boolean var1017 = i_2.NE();
                                                                var1021 = var3;
                                                                var11 = var1021 + 1L;
                                                                var11 = var1021 * var11;
                                                                var1348 = var1021 + 2L;
                                                                var11 *= var1348;
                                                                var1021 += 3L;
                                                                var11 *= var1021;
                                                                var1021 = var11 & 7L;
                                                                long var1381;
                                                                int var1109 = (var1381 = var1021 - 0L) == 0L ? 0 : (var1381 < 0L ? -1 : 1);
                                                                if (var1109 != 0) {
                                                                    switch (var28) {
                                                                        case 1497852618:
                                                                        default:
                                                                            var28 ^= 1888425972;
                                                                            break label1183;
                                                                        case 1909535919:
                                                                            var28 *= -511330095;
                                                                            var28 |= -1339247198;
                                                                            var28 ^= 493096794;
                                                                            break label1183;
                                                                        case 1991523044:
                                                                            var28 ^= 1072040766;
                                                                            break label1183;
                                                                    }
                                                                }
                                                                var28 = switch (var28) {
                                                                    default -> var28 ^ -2083855837;
                                                                    case -347167051 -> var28 ^ -584838627;
                                                                    case 1909535919 -> {
                                                                        var28 ^= 267127073;
                                                                        var28 |= 1820349777;
                                                                        var28 *= 1973975555;
                                                                        yield var28 ^ -1771416149;
                                                                    }
                                                                };
                                                                if (!var1017) {
                                                                    var28 -= -1935117636;
                                                                    var28 *= 705450847;
                                                                    var28 ^= -527235442;
                                                                    break label957;
                                                                }

                                                                var28 ^= 675533620;
                                                                var28 ^= -1264323166;
                                                                var28 |= 1795200158;
                                                                var28 ^= 1555385129;
                                                                Integer var1018 = var28;
                                                                if (var1018 == null) {
                                                                    break label1070;
                                                                }

                                                                boolean var1019 = var1.tl();
                                                                Integer var1110 = var3;
                                                                if (var1110 == null) {
                                                                    var28 += -1583337153;
                                                                    var28 -= 921384254;
                                                                    var28 *= 2109715127;
                                                                    var28 ^= -1559117555;
                                                                    break label1183;
                                                                }

                                                                var28 += 2031348788;
                                                                var28 >>>= 14;
                                                                var28 ^= -667229768;
                                                                var1021 = var28;
                                                                var11 = var1021 + 1L;
                                                                var11 = var1021 * var11;
                                                                var1021 = var11 & 1L;
                                                                long var1382;
                                                                int var1113 = (var1382 = var1021 - 0L) == 0L ? 0 : (var1382 < 0L ? -1 : 1);
                                                                if (var1113 != 0) {
                                                                    break label1070;
                                                                }

                                                                if (var1019) {
                                                                    var28 ^= 603725392;
                                                                    var28 -= 1055473276;
                                                                    var28 ^= 2067432234;
                                                                    var28 ^= -340355333;
                                                                    var28 ^= 1147599203;
                                                                    break label957;
                                                                }

                                                                var28 ^= 757394540;
                                                                var28 ^= -487424113;
                                                                var28 ^= -2058486503;
                                                                var28 ^= 473768692;
                                                            }

                                                            var1020 = false;
                                                            var28 -= -1443631313;
                                                            var28 ^= 972718187;
                                                            break label958;
                                                        }

                                                        var1020 = true;
                                                        var28 -= -478286110;
                                                        var28 ^= 1508072692;
                                                    }

                                                    var1021 = var28;
                                                    var11 = var1021 + 1L;
                                                    var11 = var1021 * var11;
                                                    var1021 = var11 & 1L;
                                                    long var1383;
                                                    int var1116 = (var1383 = var1021 - 0L) == 0L ? 0 : (var1383 < 0L ? -1 : 1);
                                                    if (var1116 != 0) {
                                                        break label1070;
                                                    }

                                                    int var1117 = var3 + 1;
                                                    int var1118 = var3 * var1117;
                                                    var1233 = var3 + 2;
                                                    int var1119 = var1118 * var1233;
                                                    var1233 = var3 + 3;
                                                    int var1120 = var1119 * var1233;
                                                    int var1121 = var1120 & 7;
                                                    if (var1121 != 0) {
                                                        var28 >>>= 2;
                                                        var28 ^= -577971359;
                                                    } else {
                                                        label1097: {
                                                            var28 |= 736401110;
                                                            var28 += 56532596;
                                                            var28 ^= -878741944;
                                                            int var1122 = var28 + 1;
                                                            int var1123 = var28 * var1122;
                                                            int var1124 = var1123 & 1;
                                                            if (var1124 != 0) {
                                                                break label1070;
                                                            }

                                                            FX var1125 = this.IL;
                                                            if (var1125 != null) {
                                                                var28 -= -1201186740;
                                                                var28 ^= -451343406;
                                                                var1021 = var28;
                                                                var11 = var1021 + 1L;
                                                                var11 = var1021 * var11;
                                                                var1348 = var1021 + 2L;
                                                                var11 *= var1348;
                                                                var1021 += 3L;
                                                                var11 *= var1021;
                                                                var1021 = var11 & 7L;
                                                                long var1384;
                                                                int var1129 = (var1384 = var1021 - 0L) == 0L ? 0 : (var1384 < 0L ? -1 : 1);
                                                                if (var1129 != 0) {
                                                                    break label1070;
                                                                }

                                                                FX var1130 = this.IL;
                                                                var1233 = var3 + 1;
                                                                var1233 = var3 * var1233;
                                                                var1233 &= 1;
                                                                if (var1233 != 0) {
                                                                    var28 &= 465575326;
                                                                    var28 &= 1956650909;
                                                                    var28 ^= -86444895;
                                                                    break label1097;
                                                                }

                                                                var28 >>= 8;
                                                                var28 >>= 19;
                                                                var28 -= 1404619338;
                                                                var28 &= -503161009;
                                                                var28 ^= 1936843006;
                                                                var1233 = var28 + 1;
                                                                var1233 = var28 * var1233;
                                                                int var1307 = var28 + 2;
                                                                var1233 *= var1307;
                                                                int var1308 = var28 + 3;
                                                                var1233 *= var1308;
                                                                var1233 &= 7;
                                                                if (var1233 != 0) {
                                                                    break label1070;
                                                                }

                                                                var1021 = var1130.positionAt(var701);
                                                                var1021 = var1021;
                                                                var28 >>= 1;
                                                                var28 ^= -676621371;
                                                            } else {
                                                                var28 -= -1710437319;
                                                                var28 &= -1390739500;
                                                                var28 *= 1690862237;
                                                                var28 ^= 1246471408;
                                                                var1021 = 0L;
                                                                switch (var28) {
                                                                    case -726588183:
                                                                    default:
                                                                        var28 ^= 397508034;
                                                                        break;
                                                                    case 1451909168:
                                                                        var28 -= 1180965315;
                                                                        var28 >>= 21;
                                                                        var28 ^= 1041394105;
                                                                        break;
                                                                    case 1516102625:
                                                                        var28 ^= -197795987;
                                                                }
                                                            }

                                                            this.wN = var1021;
                                                            int var1133 = var3 + 1;
                                                            int var1134 = var3 * var1133;
                                                            var1233 = var3 + 2;
                                                            int var1135 = var1134 * var1233;
                                                            var1233 = var3 + 3;
                                                            int var1136 = var1135 * var1233;
                                                            int var1137 = var1136 & 7;
                                                            if (var1137 != 0) {
                                                                var28 += -327963851;
                                                                var28 ^= -1067522872;
                                                            } else {
                                                                label1099: {
                                                                    var28 += -769770662;
                                                                    var28 |= 1005544858;
                                                                    var28 >>>= 21;
                                                                    var28 ^= -1976546125;
                                                                    FX var1138 = this.IL;
                                                                    float var703;
                                                                    if (var1138 != null) {
                                                                        var28 ^= -1136551201;
                                                                        var28 &= -939885580;
                                                                        var28 ^= -344429390;
                                                                        var28 += 754653578;
                                                                        var28 ^= 1467026499;
                                                                        var1021 = var28;
                                                                        var11 = var1021 + 1L;
                                                                        var11 = var1021 * var11;
                                                                        var1348 = var1021 + 2L;
                                                                        var11 *= var1348;
                                                                        var1021 += 3L;
                                                                        var11 *= var1021;
                                                                        var1021 = var11 & 7L;
                                                                        long var1385;
                                                                        int var1142 = (var1385 = var1021 - 0L) == 0L ? 0 : (var1385 < 0L ? -1 : 1);
                                                                        if (var1142 != 0) {
                                                                            break label1070;
                                                                        }

                                                                        FX var1143 = this.IL;
                                                                        Integer var1261 = var3;
                                                                        if (var1261 == null) {
                                                                            var28 += -127819379;
                                                                            var28 |= 1567590397;
                                                                            var28 ^= -1222178984;
                                                                            break label1099;
                                                                        }

                                                                        var28 ^= 157198167;
                                                                        var28 ^= -1069117180;
                                                                        float var702 = var1143.progressAt(var701);
                                                                        var703 = var702;
                                                                        var28 -= -507963250;
                                                                        var28 ^= -644475190;
                                                                    } else {
                                                                        var28 -= -680013576;
                                                                        var28 -= -1720354665;
                                                                        var28 ^= 1629190362;
                                                                        int var789 = var28 + 1;
                                                                        var789 = var28 * var789;
                                                                        var789 &= 1;
                                                                        if (var789 != 0) {
                                                                            break label1070;
                                                                        }

                                                                        var703 = 0.0F;
                                                                        var28 += 884898582;
                                                                        var28 -= 1800887855;
                                                                        var28 |= -362873172;
                                                                        var28 ^= -1864850646;
                                                                    }

                                                                    int var792 = var28 + 1;
                                                                    var792 = var28 * var792;
                                                                    int var1144 = var28 + 2;
                                                                    var792 *= var1144;
                                                                    int var1145 = var28 + 3;
                                                                    var792 *= var1145;
                                                                    var792 &= 7;
                                                                    if (var792 != 0) {
                                                                        break label1070;
                                                                    }

                                                                    this.B = var703;
                                                                    float var704 = this.IN;
                                                                    float var705 = var704 - var671;
                                                                    float var706 = Math.max(0.0F, var705);
                                                                    this.IN = var706;
                                                                    float var707 = var1.T();
                                                                    var792 = var3 + 1;
                                                                    var792 = var3 * var792;
                                                                    var792 &= 1;
                                                                    label914:
                                                                    if (var792 == 0) {
                                                                        label912: {
                                                                            var28 ^= 1964827183;
                                                                            var28 ^= -1367899264;
                                                                            float var708 = this.M(var707);
                                                                            this.h = var708;
                                                                            float var709 = var1.D();
                                                                            float var710 = this.D(var709);
                                                                            this.G = var710;
                                                                            int var711 = (var1.tl()) ? 1 : 0;
                                                                            if (var711 == 0) {
                                                                                var28 += 1139552802;
                                                                                var28 &= 1936857472;
                                                                                var28 &= 969081230;
                                                                                var28 &= -1824718416;
                                                                                var28 ^= 632829433;
                                                                                Integer var712 = var28;
                                                                                if (var712 == null) {
                                                                                    break label1070;
                                                                                }

                                                                                if (var952) {
                                                                                    var28 *= 1404365123;
                                                                                    var28 ^= -1767216050;
                                                                                    var712 = var28;
                                                                                    if (var712 == null) {
                                                                                        break label1070;
                                                                                    }

                                                                                    var711 = i_2.Wt() ? 1 : 0;
                                                                                    Integer var800 = var3;
                                                                                    if (var800 == null) {
                                                                                        switch (var28) {
                                                                                            case -1071882151:
                                                                                                var28 ^= -46349147;
                                                                                                break label914;
                                                                                            case 832680165:
                                                                                                var28 |= 728724178;
                                                                                                var28 |= 1852896796;
                                                                                                var28 ^= 1275952114;
                                                                                                var28 &= 822842915;
                                                                                                var28 ^= -606440284;
                                                                                                break label914;
                                                                                            case 1170762971:
                                                                                            default:
                                                                                                var28 ^= -2103881929;
                                                                                                break label914;
                                                                                        }
                                                                                    }

                                                                                    var28 -= -1018705040;
                                                                                    var28 ^= 334882610;
                                                                                    var28 |= 564307836;
                                                                                    var28 |= -773603910;
                                                                                    var28 ^= 695943139;
                                                                                    if (var711 == 0) {
                                                                                        var28 -= -98016106;
                                                                                        var28 += -1537402118;
                                                                                        var28 *= 1775441111;
                                                                                        var28 -= 1338927590;
                                                                                        var28 ^= -654734530;
                                                                                        var711 = var28 + 1;
                                                                                        int var716 = var28 * var711;
                                                                                        int var801 = var28 + 2;
                                                                                        var716 *= var801;
                                                                                        var801 = var28 + 3;
                                                                                        var716 *= var801;
                                                                                        var716 &= 7;
                                                                                        if (var716 != 0) {
                                                                                            break label1070;
                                                                                        }

                                                                                        ia var720 = this.mr;
                                                                                        var716 = var720.JQ();
                                                                                        int var722 = (i_2.R(var716)) ? 1 : 0;
                                                                                        var1021 = var3;
                                                                                        var11 = var1021 + 1L;
                                                                                        var11 = var1021 * var11;
                                                                                        var1348 = var1021 + 2L;
                                                                                        var11 *= var1348;
                                                                                        var1021 += 3L;
                                                                                        var11 *= var1021;
                                                                                        var1021 = var11 & 7L;
                                                                                        long var1386;
                                                                                        var801 = (var1386 = var1021 - 0L) == 0L ? 0 : (var1386 < 0L ? -1 : 1);
                                                                                        if (var801 != 0) {
                                                                                            var28 += 678254603;
                                                                                            var28 ^= -1996927083;
                                                                                            var28 ^= -598304865;
                                                                                            break label914;
                                                                                        }

                                                                                        var28 |= -70210266;
                                                                                        var28 -= 1129964090;
                                                                                        var28 += -473549170;
                                                                                        var28 ^= 705388703;
                                                                                        if (var722 != 0) {
                                                                                            var28 |= 1286369335;
                                                                                            var28 ^= -866094212;
                                                                                            long var723 = var28;
                                                                                            var1021 = var723 + 1L;
                                                                                            var1021 = var723 * var1021;
                                                                                            long var724 = var1021 & 1L;
                                                                                            long var1387;
                                                                                            var722 = (var1387 = var724 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1387 < 0L ? -1 : 1);
                                                                                            if (var722 != 0) {
                                                                                                break label1070;
                                                                                            }

                                                                                            var726 = true;
                                                                                            switch (var28) {
                                                                                                case -215276913:
                                                                                                default:
                                                                                                    var28 ^= 307277790;
                                                                                                    break label912;
                                                                                                case 42795531:
                                                                                                    var28 *= 211115015;
                                                                                                    var28 -= -1312918425;
                                                                                                    var28 += 2146012086;
                                                                                                    var28 *= -1894279899;
                                                                                                    var28 ^= -1505965278;
                                                                                                    break label912;
                                                                                                case 1396386160:
                                                                                                    var28 ^= -1044271549;
                                                                                                    break label912;
                                                                                            }
                                                                                        }

                                                                                        switch (var28) {
                                                                                            case -1974652571:
                                                                                                var28 ^= -1212451692;
                                                                                                var28 += 164219233;
                                                                                                var28 ^= 1762727282;
                                                                                                var28 *= -1447021247;
                                                                                                var28 ^= 1822408714;
                                                                                                break;
                                                                                            case 363493517:
                                                                                            default:
                                                                                                var28 ^= 1286917697;
                                                                                                break;
                                                                                            case 2137282335:
                                                                                                var28 ^= 1129850559;
                                                                                        }
                                                                                    } else {
                                                                                        var28 ^= -1486450956;
                                                                                        var28 ^= 1638363482;
                                                                                        var28 |= 68106441;
                                                                                        var28 ^= -1623130671;
                                                                                    }
                                                                                } else {
                                                                                    var28 += -1059143904;
                                                                                    var28 |= 806362569;
                                                                                    var28 += -904078316;
                                                                                    var28 -= 2011168054;
                                                                                    var28 ^= -1043571555;
                                                                                }
                                                                            } else {
                                                                                switch (var28) {
                                                                                    case -1605616277:
                                                                                        var28 |= -1966538981;
                                                                                        var28 *= 139586739;
                                                                                        var28 += -561089067;
                                                                                        var28 ^= 2085289724;
                                                                                        break;
                                                                                    case -1313331003:
                                                                                        var28 ^= 1871171550;
                                                                                        break;
                                                                                    case -198219239:
                                                                                    default:
                                                                                        var28 ^= -1203879616;
                                                                                }
                                                                            }

                                                                            var726 = false;
                                                                            var28 += 2011752872;
                                                                            var28 |= 1258217822;
                                                                            var28 *= 1192016105;
                                                                            var28 += 1776419879;
                                                                            var28 ^= 255260059;
                                                                        }

                                                                        Integer var804 = var28;
                                                                        if (var804 == null) {
                                                                            break label1070;
                                                                        }

                                                                        this.X = var726;
                                                                        int var727 = (var1.tl()) ? 1 : 0;
                                                                        var804 = var3;
                                                                        label896:
                                                                        if (var804 != null) {
                                                                            var28 <<= 16;
                                                                            var28 *= -877955973;
                                                                            var28 ^= 805610096;
                                                                            var804 = var28;
                                                                            if (var804 == null) {
                                                                                break label1070;
                                                                            }

                                                                            label1105: {
                                                                                label1106: {
                                                                                    if (var727 != 0) {
                                                                                        var28 -= -915456360;
                                                                                        var28 >>= 21;
                                                                                        var28 ^= 1111505764;
                                                                                        var28 <<= 18;
                                                                                        var28 ^= -1994591810;
                                                                                        var727 = this.mF() ? 1 : 0;
                                                                                        var804 = var3;
                                                                                        if (var804 == null) {
                                                                                            var28 -= 1016419350;
                                                                                            var28 *= -1280402877;
                                                                                            var28 ^= 382837341;
                                                                                            break label896;
                                                                                        }
                                                                                        var28 = switch (var28) {
                                                                                            case -1656163906 -> {
                                                                                                var28 *= -136869933;
                                                                                                var28 *= -1029730435;
                                                                                                var28 *= -1575769701;
                                                                                                var28 |= 617297867;
                                                                                                yield var28 ^ -165895870;
                                                                                            }
                                                                                            default -> var28 ^ -373273895;
                                                                                            case -1247024873 -> var28 ^ -1406575970;
                                                                                        };
                                                                                        int var808 = var28 + 1;
                                                                                        var808 = var28 * var808;
                                                                                        var808 &= 1;
                                                                                        if (var808 != 0) {
                                                                                            break label1070;
                                                                                        }

                                                                                        if (var727 != 0) {
                                                                                            var28 >>= 4;
                                                                                            var28 &= 1549823126;
                                                                                            var28 ^= -1430794462;
                                                                                            break label1106;
                                                                                        }

                                                                                        var28 -= -1349829195;
                                                                                        var28 ^= 421974164;
                                                                                    } else {
                                                                                        switch (var28) {
                                                                                            case -1751211408:
                                                                                                var28 ^= 362477464;
                                                                                                var28 ^= 1248732580;
                                                                                                break;
                                                                                            case -1120882916:
                                                                                            default:
                                                                                                var28 ^= -2050287443;
                                                                                                break;
                                                                                            case 456717826:
                                                                                                var28 ^= 1508224874;
                                                                                        }
                                                                                    }

                                                                                    var727 = var28 + 1;
                                                                                    var727 = var28 * var727;
                                                                                    int var811 = var28 + 2;
                                                                                    var727 *= var811;
                                                                                    var811 = var28 + 3;
                                                                                    var727 *= var811;
                                                                                    var727 &= 7;
                                                                                    if (var727 != 0) {
                                                                                        break label1070;
                                                                                    }

                                                                                    boolean var734 = this.X;
                                                                                    Integer var813 = var3;
                                                                                    if (var813 == null) {
                                                                                        var28 ^= 532389179;
                                                                                        var28 ^= 1024007634;
                                                                                        break label896;
                                                                                    }

                                                                                    var28 <<= 10;
                                                                                    var28 &= 1239061643;
                                                                                    var28 ^= -1500518500;
                                                                                    int var814 = var28 + 1;
                                                                                    var814 = var28 * var814;
                                                                                    int var1151 = var28 + 2;
                                                                                    var814 *= var1151;
                                                                                    int var1152 = var28 + 3;
                                                                                    var814 *= var1152;
                                                                                    var814 &= 7;
                                                                                    if (var814 != 0) {
                                                                                        break label1070;
                                                                                    }

                                                                                    if (!var734) {
                                                                                        var28 ^= 1433008215;
                                                                                        var28 ^= 1799065319;
                                                                                        var814 = var28 + 1;
                                                                                        var814 = var28 * var814;
                                                                                        var814 &= 1;
                                                                                        if (var814 != 0) {
                                                                                            break label1070;
                                                                                        }

                                                                                        float var828 = this.IN;
                                                                                        float var1388;
                                                                                        var814 = (var1388 = var828 - 0.0F) == 0.0F
                                                                                            ? 0
                                                                                            : (var1388 < 0.0F ? -1 : 1);
                                                                                        var1021 = var3;
                                                                                        var11 = var1021 + 1L;
                                                                                        var11 = var1021 * var11;
                                                                                        var1348 = var1021 + 2L;
                                                                                        var11 *= var1348;
                                                                                        var1021 += 3L;
                                                                                        var11 *= var1021;
                                                                                        var1021 = var11 & 7L;
                                                                                        long var1389;
                                                                                        int var1156 = (var1389 = var1021 - 0L) == 0L
                                                                                            ? 0
                                                                                            : (var1389 < 0L ? -1 : 1);
                                                                                        if (var1156 != 0) {
                                                                                            switch (var28) {
                                                                                                case -1860337364:
                                                                                                    var28 += 1939121124;
                                                                                                    var28 += -933183401;
                                                                                                    var28 -= 190138127;
                                                                                                    var28 ^= 728067837;
                                                                                                    break label896;
                                                                                                case 384818884:
                                                                                                default:
                                                                                                    var28 ^= -490189967;
                                                                                                    break label896;
                                                                                                case 660047955:
                                                                                                    var28 ^= -1872314604;
                                                                                                    break label896;
                                                                                            }
                                                                                        }
                                                                                        var28 = switch (var28) {
                                                                                            default -> var28 ^ 1641967709;
                                                                                            case -1860337364 -> {
                                                                                                var28 += 2022352659;
                                                                                                yield var28 ^ -865541671;
                                                                                            }
                                                                                            case -1807583023 -> var28 ^ 1773655075;
                                                                                        };
                                                                                        var1021 = var28;
                                                                                        var11 = var1021 + 1L;
                                                                                        var11 = var1021 * var11;
                                                                                        var1021 = var11 & 1L;
                                                                                        long var1390;
                                                                                        int var1159 = (var1390 = var1021 - 0L) == 0L
                                                                                            ? 0
                                                                                            : (var1390 < 0L ? -1 : 1);
                                                                                        if (var1159 != 0) {
                                                                                            break label1070;
                                                                                        }

                                                                                        if (var814 > 0) {
                                                                                            var28 -= -849590708;
                                                                                            var28 |= -1649391031;
                                                                                            var28 >>>= 19;
                                                                                            var28 *= -19295937;
                                                                                            var28 ^= 479281693;
                                                                                            if (var952) {
                                                                                                var28 -= -1919123422;
                                                                                                var28 &= 978948060;
                                                                                                var28 &= -523611952;
                                                                                                var28 <<= 28;
                                                                                                var28 ^= -307576444;
                                                                                                var814 = var28 + 1;
                                                                                                var814 = var28 * var814;
                                                                                                var814 &= 1;
                                                                                                if (var814 != 0) {
                                                                                                    break label1070;
                                                                                                }

                                                                                                Lk var833 = Lk.ANNOUNCE;
                                                                                                int var953 = var3 + 1;
                                                                                                int var954 = var3 * var953;
                                                                                                int var1160 = var3 + 2;
                                                                                                int var955 = var954 * var1160;
                                                                                                int var1161 = var3 + 3;
                                                                                                int var956 = var955 * var1161;
                                                                                                int var957 = var956 & 7;
                                                                                                if (var957 != 0) {
                                                                                                    switch (var28) {
                                                                                                        case -307576444:
                                                                                                            var28 |= 2014395033;
                                                                                                            var28 += 1997158941;
                                                                                                            var28 ^= -67302391;
                                                                                                            var28 += 1347117419;
                                                                                                            var28 ^= 895380411;
                                                                                                            break label896;
                                                                                                        case 244695258:
                                                                                                            var28 ^= 1781555663;
                                                                                                            break label896;
                                                                                                        case 274932521:
                                                                                                        default:
                                                                                                            var28 ^= 1420550878;
                                                                                                            break label896;
                                                                                                    }
                                                                                                }

                                                                                                var28 ^= 538812753;
                                                                                                var28 ^= -77463145;
                                                                                                Integer var958 = var28;
                                                                                                if (var958 == null) {
                                                                                                    break label1070;
                                                                                                }

                                                                                                var736 = var833;
                                                                                                var28 += 1507449128;
                                                                                                var28 -= -1526021080;
                                                                                                var28 ^= 987794293;
                                                                                                var28 += -1936928699;
                                                                                                var28 ^= -2111410013;
                                                                                                break label1105;
                                                                                            }

                                                                                            var28 |= 411529346;
                                                                                            var28 &= 1543949005;
                                                                                            var28 |= 10792106;
                                                                                            var28 |= -344072647;
                                                                                            var28 ^= 1784148072;
                                                                                        } else {
                                                                                            switch (var28) {
                                                                                                case -1578164036:
                                                                                                    var28 ^= 1908396630;
                                                                                                    break;
                                                                                                case -977221146:
                                                                                                    var28 *= 574352971;
                                                                                                    var28 |= 2127756163;
                                                                                                    var28 += 343294775;
                                                                                                    var28 ^= 96547213;
                                                                                                    break;
                                                                                                case 1519632805:
                                                                                                default:
                                                                                                    var28 ^= 1947459346;
                                                                                            }
                                                                                        }

                                                                                        Integer var834 = var28;
                                                                                        if (var834 == null) {
                                                                                            break label1070;
                                                                                        }

                                                                                        Lk var835 = Lk.COMPACT;
                                                                                        var1021 = var3;
                                                                                        var11 = var1021 + 1L;
                                                                                        var11 = var1021 * var11;
                                                                                        var1021 = var11 & 1L;
                                                                                        long var1391;
                                                                                        int var959 = (var1391 = var1021 - 0L) == 0L
                                                                                            ? 0
                                                                                            : (var1391 < 0L ? -1 : 1);
                                                                                        if (var959 != 0) {
                                                                                            switch (var28) {
                                                                                                case -1851257193:
                                                                                                    var28 -= 30772280;
                                                                                                    var28 -= -1723196504;
                                                                                                    var28 -= 1877037011;
                                                                                                    var28 *= -728283071;
                                                                                                    var28 ^= -1786765503;
                                                                                                    break label896;
                                                                                                case -1663947499:
                                                                                                    var28 ^= 1006023658;
                                                                                                    break label896;
                                                                                                case 1681629226:
                                                                                                default:
                                                                                                    var28 ^= -547769924;
                                                                                                    break label896;
                                                                                            }
                                                                                        }
                                                                                        var28 = switch (var28) {
                                                                                            case -1851257193 -> {
                                                                                                var28 ^= 1063613231;
                                                                                                var28 *= 329166505;
                                                                                                var28 += -92840249;
                                                                                                yield var28 ^ 1997618642;
                                                                                            }
                                                                                            case -1524474092 -> var28 ^ 376909251;
                                                                                            default -> var28 ^ -812409705;
                                                                                        };
                                                                                        var736 = var835;
                                                                                        switch (var28) {
                                                                                            case 1009996013:
                                                                                                var28 += -1496867441;
                                                                                                var28 ^= 1024283555;
                                                                                                break label1105;
                                                                                            case 1687024557:
                                                                                                var28 ^= -412406094;
                                                                                                break label1105;
                                                                                            case 2068627662:
                                                                                            default:
                                                                                                var28 ^= 659713340;
                                                                                                break label1105;
                                                                                        }
                                                                                    }

                                                                                    var28 |= 1247453526;
                                                                                    var28 &= -514706811;
                                                                                    var28 -= 1645746805;
                                                                                    var28 += -449483349;
                                                                                    var28 ^= -1764219368;
                                                                                }

                                                                                Lk var735 = Lk.EXPANDED;
                                                                                int var819 = var3 + 1;
                                                                                var819 = var3 * var819;
                                                                                var819 &= 1;
                                                                                if (var819 != 0) {
                                                                                    var28 &= 455347313;
                                                                                    var28 -= 593904466;
                                                                                    var28 ^= 73747563;
                                                                                    break label896;
                                                                                }

                                                                                var28 -= 150860769;
                                                                                var28 &= 865707253;
                                                                                var28 <<= 20;
                                                                                var28 ^= -393282305;
                                                                                var819 = var28 + 1;
                                                                                var819 = var28 * var819;
                                                                                var819 &= 1;
                                                                                if (var819 != 0) {
                                                                                    break label1070;
                                                                                }

                                                                                var736 = var735;
                                                                                switch (var28) {
                                                                                    case -1533084417:
                                                                                        var28 >>= 19;
                                                                                        var28 ^= 740411710;
                                                                                        var28 |= 125675866;
                                                                                        var28 ^= 134742048;
                                                                                        break;
                                                                                    case 1311604891:
                                                                                    default:
                                                                                        var28 ^= 322648494;
                                                                                        break;
                                                                                    case 1354797607:
                                                                                        var28 ^= -536258530;
                                                                                }
                                                                            }

                                                                            this.pw = var736;
                                                                            r_2 var737 = this.v;
                                                                            long var836 = var3;
                                                                            var1021 = var836 + 1L;
                                                                            var1021 = var836 * var1021;
                                                                            var11 = var836 + 2L;
                                                                            var1021 *= var11;
                                                                            long var837 = var836 + 3L;
                                                                            var1021 *= var837;
                                                                            long var838 = var1021 & 7L;
                                                                            long var1392;
                                                                            int var839 = (var1392 = var838 - 0L) == 0L ? 0 : (var1392 < 0L ? -1 : 1);
                                                                            label855:
                                                                            if (var839 == 0) {
                                                                                label1111: {
                                                                                    var28 -= -1035624805;
                                                                                    var28 ^= -1071250202;
                                                                                    Rt var840 = Rt.BLACK;
                                                                                    int var738 = (var737.TJ(var840)) ? 1 : 0;
                                                                                    if (var738 != 0) {
                                                                                        var28 *= 2001742901;
                                                                                        var28 &= -1948696024;
                                                                                        var28 ^= 1642159880;
                                                                                        var28 ^= -1205213985;
                                                                                        var738 = var28 + 1;
                                                                                        var738 = var28 * var738;
                                                                                        var839 = var28 + 2;
                                                                                        var738 *= var839;
                                                                                        var839 = var28 + 3;
                                                                                        var738 *= var839;
                                                                                        var738 &= 7;
                                                                                        if (var738 != 0) {
                                                                                            break label1070;
                                                                                        }

                                                                                        float var744 = this.eJ();
                                                                                        float var1393;
                                                                                        var738 = (var1393 = var744 - 1.5F) == 0.0F
                                                                                            ? 0
                                                                                            : (var1393 < 0.0F ? -1 : 1);
                                                                                        var839 = var3 + 1;
                                                                                        var839 = var3 * var839;
                                                                                        var839 &= 1;
                                                                                        if (var839 != 0) {
                                                                                            var28 |= 1600828908;
                                                                                            var28 |= -48602143;
                                                                                            var28 ^= 354619226;
                                                                                            break label855;
                                                                                        }

                                                                                        var28 |= -1549280541;
                                                                                        var28 |= 1376592626;
                                                                                        var28 -= 1034586288;
                                                                                        var28 *= -1502430329;
                                                                                        var28 ^= -1593333368;
                                                                                        var839 = var28 + 1;
                                                                                        var839 = var28 * var839;
                                                                                        var839 &= 1;
                                                                                        if (var839 != 0) {
                                                                                            break label1070;
                                                                                        }

                                                                                        if (var738 < 0) {
                                                                                            var28 *= 523050487;
                                                                                            var28 -= -584266675;
                                                                                            var28 -= -270273759;
                                                                                            var28 *= 1100495123;
                                                                                            var28 ^= -1417229199;
                                                                                            var746 = true;
                                                                                            var28 ^= 476596917;
                                                                                            var28 >>= 15;
                                                                                            var28 ^= 869851159;
                                                                                            break label1111;
                                                                                        }

                                                                                        var28 += 1924462626;
                                                                                        var28 += -1146189834;
                                                                                        var28 ^= -1616462527;
                                                                                    } else {
                                                                                        switch (var28) {
                                                                                            case -577496158:
                                                                                                var28 |= 875190186;
                                                                                                var28 -= 1846304452;
                                                                                                var28 >>= 24;
                                                                                                var28 ^= 1854663852;
                                                                                                var28 ^= 1017119835;
                                                                                                break;
                                                                                            case -391438353:
                                                                                                var28 ^= 507155455;
                                                                                                break;
                                                                                            case 2139061380:
                                                                                            default:
                                                                                                var28 ^= 164890616;
                                                                                        }
                                                                                    }

                                                                                    long var849 = var28;
                                                                                    var1021 = var849 + 1L;
                                                                                    var1021 = var849 * var1021;
                                                                                    var11 = var849 + 2L;
                                                                                    var1021 *= var11;
                                                                                    long var850 = var849 + 3L;
                                                                                    var1021 *= var850;
                                                                                    long var851 = var1021 & 7L;
                                                                                    long var1394;
                                                                                    var839 = (var1394 = var851 - 0L) == 0L ? 0 : (var1394 < 0L ? -1 : 1);
                                                                                    if (var839 != 0) {
                                                                                        break label1070;
                                                                                    }

                                                                                    var746 = false;
                                                                                    var28 -= 235348365;
                                                                                    var28 &= 832010471;
                                                                                    var28 *= -838532853;
                                                                                    var28 -= -1490980290;
                                                                                    var28 ^= -1337397258;
                                                                                }

                                                                                var839 = var28 + 1;
                                                                                var839 = var28 * var839;
                                                                                int var960 = var28 + 2;
                                                                                var839 *= var960;
                                                                                int var961 = var28 + 3;
                                                                                var839 *= var961;
                                                                                var839 &= 7;
                                                                                if (var839 != 0) {
                                                                                    break label1070;
                                                                                }

                                                                                this.m = var746;
                                                                                var727 = var28 ^ -1321480622;
                                                                                var727 &= 602053836;
                                                                                var727 ^= 1443414529;
                                                                                var727 >>>= 23;
                                                                                var727 ^= -1205792134;
                                                                                this.Z(var1, var727);
                                                                                Lk var752 = this.pw;
                                                                                long var858 = var3;
                                                                                var1021 = var858 + 1L;
                                                                                var1021 = var858 * var1021;
                                                                                var11 = var858 + 2L;
                                                                                var1021 *= var11;
                                                                                long var859 = var858 + 3L;
                                                                                var1021 *= var859;
                                                                                long var860 = var1021 & 7L;
                                                                                long var1395;
                                                                                var839 = (var1395 = var860 - 0L) == 0L ? 0 : (var1395 < 0L ? -1 : 1);
                                                                                label840:
                                                                                if (var839 == 0) {
                                                                                    var28 >>>= 31;
                                                                                    var28 |= -214109167;
                                                                                    var28 |= 855073179;
                                                                                    var28 ^= -559204838;
                                                                                    var839 = var28 + 1;
                                                                                    var839 = var28 * var839;
                                                                                    int var962 = var28 + 2;
                                                                                    var839 *= var962;
                                                                                    int var963 = var28 + 3;
                                                                                    var839 *= var963;
                                                                                    var839 &= 7;
                                                                                    if (var839 != 0) {
                                                                                        break label1070;
                                                                                    }

                                                                                    var727 = var752.ordinal();
                                                                                    label836:
                                                                                    switch (var727) {
                                                                                        case 0:
                                                                                            var28 += -1254350433;
                                                                                            var28 ^= 1939108295;
                                                                                            var28 -= -2115350455;
                                                                                            var28 >>= 23;
                                                                                            var28 ^= -1787120950;
                                                                                            long var873 = var28;
                                                                                            var1021 = var873 + 1L;
                                                                                            var1021 = var873 * var1021;
                                                                                            long var874 = var1021 & 1L;
                                                                                            long var1397;
                                                                                            var839 = (var1397 = var874 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1397 < 0L ? -1 : 1);
                                                                                            if (var839 != 0) {
                                                                                                break label1070;
                                                                                            }

                                                                                            float var876 = this.Kv;
                                                                                            Integer var967 = var3;
                                                                                            if (var967 == null) {
                                                                                                var28 ^= 84501098;
                                                                                                var28 *= -2120797665;
                                                                                                var28 ^= 268800935;
                                                                                                break label840;
                                                                                            }

                                                                                            var28 ^= -615675372;
                                                                                            var28 ^= 2042882540;
                                                                                            int var968 = var28 + 1;
                                                                                            int var969 = var28 * var968;
                                                                                            int var970 = var969 & 1;
                                                                                            if (var970 != 0) {
                                                                                                break label1070;
                                                                                            }

                                                                                            var754 = var876;
                                                                                            var28 -= 1006003217;
                                                                                            var28 += -1906266888;
                                                                                            var28 ^= -1979958981;
                                                                                            var28 ^= -305627994;
                                                                                            break;
                                                                                        case 1:
                                                                                            var28 = switch (var28) {
                                                                                                default -> var28 ^ -864721749;
                                                                                                case 760529793 -> {
                                                                                                    var28 &= 1915639898;
                                                                                                    var28 &= -1462704752;
                                                                                                    yield var28 ^ -1385101053;
                                                                                                }
                                                                                                case 1740526667 -> var28 ^ -1831383912;
                                                                                            };
                                                                                            var839 = var28 + 1;
                                                                                            var839 = var28 * var839;
                                                                                            int var964 = var28 + 2;
                                                                                            var839 *= var964;
                                                                                            int var965 = var28 + 3;
                                                                                            var839 *= var965;
                                                                                            var839 &= 7;
                                                                                            if (var839 != 0) {
                                                                                                break label1070;
                                                                                            }

                                                                                            float var872 = this.ET;
                                                                                            var1021 = var3;
                                                                                            var11 = var1021 + 1L;
                                                                                            var11 = var1021 * var11;
                                                                                            var1021 = var11 & 1L;
                                                                                            long var1396;
                                                                                            int var966 = (var1396 = var1021 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1396 < 0L ? -1 : 1);
                                                                                            if (var966 != 0) {
                                                                                                var28 >>>= 15;
                                                                                                var28 ^= -354817465;
                                                                                                break label840;
                                                                                            }

                                                                                            var28 ^= 65285883;
                                                                                            var28 += -1562760403;
                                                                                            var28 ^= -2110315273;
                                                                                            var28 ^= 1513946232;
                                                                                            var754 = var872;
                                                                                            switch (var28) {
                                                                                                case -1526666118:
                                                                                                    var28 ^= 439263294;
                                                                                                    break label836;
                                                                                                case -379302998:
                                                                                                    var28 += -470716507;
                                                                                                    var28 -= -1659941192;
                                                                                                    var28 ^= 48049841;
                                                                                                    var28 ^= -588243544;
                                                                                                    break label836;
                                                                                                case 1057997632:
                                                                                                default:
                                                                                                    var28 ^= 665691475;
                                                                                                    break label836;
                                                                                            }
                                                                                        case 2:
                                                                                            var28 -= 234065284;
                                                                                            var28 ^= 1529173246;
                                                                                            var754 = 240.0F;
                                                                                            switch (var28) {
                                                                                                case -780890346:
                                                                                                    var28 ^= 1309504777;
                                                                                                    break label836;
                                                                                                case 444500744:
                                                                                                default:
                                                                                                    var28 ^= -1857339535;
                                                                                                    break label836;
                                                                                                case 1145331971:
                                                                                                    var28 -= 1183649697;
                                                                                                    var28 -= 699915047;
                                                                                                    var28 |= -1579373923;
                                                                                                    var28 ^= 496279857;
                                                                                                    break label836;
                                                                                            }
                                                                                        default:
                                                                                            var28 ^= 650843767;
                                                                                            var28 *= -1374043681;
                                                                                            var28 ^= -276658145;
                                                                                            var28 *= -33981557;
                                                                                            var28 ^= 1245800263;
                                                                                            MatchException var648 = new MatchException(null, null);
                                                                                            throw var648;
                                                                                    }

                                                                                    long var877 = var28;
                                                                                    var1021 = var877 + 1L;
                                                                                    var1021 = var877 * var1021;
                                                                                    long var878 = var1021 & 1L;
                                                                                    long var1398;
                                                                                    var839 = (var1398 = var878 - 0L) == 0L ? 0 : (var1398 < 0L ? -1 : 1);
                                                                                    if (var839 != 0) {
                                                                                        break label1070;
                                                                                    }

                                                                                    this.u = var754;
                                                                                    Lk var755 = this.pw;
                                                                                    var839 = var3 + 1;
                                                                                    var839 = var3 * var839;
                                                                                    int var971 = var3 + 2;
                                                                                    var839 *= var971;
                                                                                    int var972 = var3 + 3;
                                                                                    var839 *= var972;
                                                                                    var839 &= 7;
                                                                                    if (var839 != 0) {
                                                                                        var28 <<= 7;
                                                                                        var28 &= -114272414;
                                                                                        var28 &= -118655651;
                                                                                        var28 -= -1204913767;
                                                                                        var28 ^= -1658242110;
                                                                                    } else {
                                                                                        label1116: {
                                                                                            var28 -= 1762022590;
                                                                                            var28 &= 1947227600;
                                                                                            var28 += -149064412;
                                                                                            var28 *= 1544820031;
                                                                                            var28 ^= 77085453;
                                                                                            var839 = var28 + 1;
                                                                                            var839 = var28 * var839;
                                                                                            int var973 = var28 + 2;
                                                                                            var839 *= var973;
                                                                                            int var974 = var28 + 3;
                                                                                            var839 *= var974;
                                                                                            var839 &= 7;
                                                                                            if (var839 != 0) {
                                                                                                break label1070;
                                                                                            }

                                                                                            var839 = var28 | 579794322;
                                                                                            var839 += -6629219;
                                                                                            var839 ^= 1744098941;
                                                                                            float var756 = this.ct(var755, var839);
                                                                                            this.D = var756;
                                                                                            float var757 = this.D;
                                                                                            XF var893 = this.I;
                                                                                            float var894 = var893.bs();
                                                                                            float var895 = var894 + 0.5F;
                                                                                            float var1399;
                                                                                            var727 = (var1399 = var757 - var895) == 0.0F
                                                                                                ? 0
                                                                                                : (var1399 < 0.0F ? -1 : 1);
                                                                                            kE_2 var763;
                                                                                            if (var727 > 0) {
                                                                                                var28 = switch (var28) {
                                                                                                    default -> var28 ^ -1661510849;
                                                                                                    case 426061825 -> {
                                                                                                        var28 |= -1117015168;
                                                                                                        var28 ^= 535393175;
                                                                                                        yield var28 ^ -1509982038;
                                                                                                    }
                                                                                                    case 1533788257 -> var28 ^ -1075033692;
                                                                                                };
                                                                                                var727 = var28 + 1;
                                                                                                var727 = var28 * var727;
                                                                                                var727 &= 1;
                                                                                                if (var727 != 0) {
                                                                                                    break label1070;
                                                                                                }

                                                                                                kE_2 var762 = zK;
                                                                                                Integer var896 = var3;
                                                                                                if (var896 == null) {
                                                                                                    var28 |= -1030326947;
                                                                                                    var28 &= 1478700940;
                                                                                                    var28 &= 510917447;
                                                                                                    var28 ^= -352595551;
                                                                                                    break label1116;
                                                                                                }
                                                                                                var28 = switch (var28) {
                                                                                                    default -> var28 ^ -1222538567;
                                                                                                    case 125386940 -> {
                                                                                                        var28 *= -933514833;
                                                                                                        var28 += -1583560823;
                                                                                                        var28 ^= -1049225912;
                                                                                                        var28 ^= 679785971;
                                                                                                        yield var28 ^ -829215302;
                                                                                                    }
                                                                                                    case 2033676211 -> var28 ^ -794684209;
                                                                                                };
                                                                                                var763 = var762;
                                                                                                var28 -= 1480149577;
                                                                                                var28 += -300346285;
                                                                                                var28 *= -1213766367;
                                                                                                var28 ^= 1275885254;
                                                                                            } else {
                                                                                                var28 &= -1823653020;
                                                                                                var28 |= -30542646;
                                                                                                var28 *= -1027790245;
                                                                                                var28 -= 1293596533;
                                                                                                var28 ^= 869205276;
                                                                                                long var897 = var28;
                                                                                                var1021 = var897 + 1L;
                                                                                                var1021 = var897 * var1021;
                                                                                                long var898 = var1021 & 1L;
                                                                                                long var1400;
                                                                                                var839 = (var1400 = var898 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var1400 < 0L ? -1 : 1);
                                                                                                if (var839 != 0) {
                                                                                                    break label1070;
                                                                                                }

                                                                                                kE_2 var900 = A;
                                                                                                Integer var975 = var3;
                                                                                                if (var975 == null) {
                                                                                                    var28 &= 1858958154;
                                                                                                    var28 -= 616354470;
                                                                                                    var28 ^= -720081345;
                                                                                                    break label1116;
                                                                                                }

                                                                                                var28 -= 850642732;
                                                                                                var28 >>= 8;
                                                                                                var28 -= 1526383044;
                                                                                                var28 &= 1741375748;
                                                                                                var28 ^= 940647251;
                                                                                                var763 = var900;
                                                                                                var28 >>>= 5;
                                                                                                var28 ^= 2139610114;
                                                                                            }

                                                                                            XF var901 = this.aJ;
                                                                                            XF var902 = var901.x(var763);
                                                                                            XF var903 = this.I;
                                                                                            XF var904 = var903.x(var763);
                                                                                            XF var905 = this.EN;
                                                                                            XF var764 = var905.x(var763);
                                                                                            XF var765 = this.aJ;
                                                                                            float var906 = this.u;
                                                                                            var765.H(var906);
                                                                                            XF var766 = this.I;
                                                                                            float var907 = this.D;
                                                                                            var766.H(var907);
                                                                                            XF var767 = this.EN;
                                                                                            Lk var908 = this.pw;
                                                                                            float var976 = this.D;
                                                                                            int var1184 = var28 << 10;
                                                                                            int var1185 = var1184 ^ 2143536944;
                                                                                            float var909 = aw(var908, var976, var1185);
                                                                                            var767.H(var909);
                                                                                            XF var768 = this.aJ;
                                                                                            float var769 = var768.N(var671);
                                                                                            XF var770 = this.I;
                                                                                            float var771 = var770.N(var671);
                                                                                            XF var772 = this.EN;
                                                                                            float var773 = var772.N(var671);
                                                                                            XF var774 = this.j;
                                                                                            Integer var910 = var3;
                                                                                            if (var910 != null) {
                                                                                                var28 >>= 23;
                                                                                                var28 <<= 12;
                                                                                                var28 ^= -2008750029;
                                                                                                var910 = var28;
                                                                                                if (var910 == null) {
                                                                                                    break label1070;
                                                                                                }

                                                                                                boolean var912 = this.m;
                                                                                                float var914;
                                                                                                if (var912) {
                                                                                                    var28 = switch (var28) {
                                                                                                        case -2008348621 -> {
                                                                                                            var28 *= -1846314377;
                                                                                                            var28 &= 1462650826;
                                                                                                            var28 ^= -759221395;
                                                                                                            yield var28 ^ 1410394697;
                                                                                                        }
                                                                                                        default -> var28 ^ 180783133;
                                                                                                        case 1082549063 -> var28 ^ -1808413801;
                                                                                                    };
                                                                                                    var910 = var28;
                                                                                                    if (var910 == null) {
                                                                                                        break label1070;
                                                                                                    }

                                                                                                    var914 = 1.0F;
                                                                                                    var28 ^= -490702116;
                                                                                                    var28 ^= 1586285386;
                                                                                                } else {
                                                                                                    var28 += -99874853;
                                                                                                    var28 &= 1250380470;
                                                                                                    var28 ^= 778086687;
                                                                                                    var914 = 0.0F;
                                                                                                    var28 *= -459690991;
                                                                                                    var28 ^= -1766757477;
                                                                                                }

                                                                                                int var977 = var28 + 1;
                                                                                                int var978 = var28 * var977;
                                                                                                int var1186 = var28 + 2;
                                                                                                int var979 = var978 * var1186;
                                                                                                int var1187 = var28 + 3;
                                                                                                int var980 = var979 * var1187;
                                                                                                int var981 = var980 & 7;
                                                                                                if (var981 != 0) {
                                                                                                    break label1070;
                                                                                                }

                                                                                                var774.H(var914);
                                                                                                XF var775 = this.j;
                                                                                                float var776 = var775.N(var671);
                                                                                                XF var777 = this.aJ;
                                                                                                float var778 = var777.bs();
                                                                                                float var779 = Math.max(1.0F, var778);
                                                                                                XF var915 = this.I;
                                                                                                float var916 = var915.bs();
                                                                                                var1021 = var3;
                                                                                                var11 = var1021 + 1L;
                                                                                                var11 = var1021 * var11;
                                                                                                var1021 = var11 & 1L;
                                                                                                long var1401;
                                                                                                var3 = (var1401 = var1021 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var1401 < 0L ? -1 : 1);
                                                                                                if (var3 == 0) {
                                                                                                    var28 |= 676985531;
                                                                                                    var28 |= -1272411499;
                                                                                                    var28 ^= 1323658414;
                                                                                                    float var650 = Math.max(1.0F, var916);
                                                                                                    this.dV(var779, var650);
                                                                                                    var3 = var28 + -1777954254;
                                                                                                    var3 += -647750407;
                                                                                                    var3 ^= 1884047095;
                                                                                                    this.P(var1, var671, var3);
                                                                                                    var3 = var28 + -1628359864;
                                                                                                    var3 |= -339812214;
                                                                                                    var3 -= 480745628;
                                                                                                    var3 |= 842487952;
                                                                                                    var3 ^= -2024042143;
                                                                                                    this.Ha(var671, var3);
                                                                                                    var3 = var28 | -471756228;
                                                                                                    var3 &= 539820588;
                                                                                                    var3 -= 147358478;
                                                                                                    var3 ^= 662364979;
                                                                                                    this.C(var671, var3);
                                                                                                    var3 = var28 >>> 21;
                                                                                                    var3 ^= -1539442246;
                                                                                                    this.Nk(var671, var3);
                                                                                                    return var1020;
                                                                                                }

                                                                                                var28 <<= 21;
                                                                                                var28 *= 1656268623;
                                                                                                var28 >>= 31;
                                                                                                var28 ^= -354881371;
                                                                                            } else {
                                                                                                var28 <<= 13;
                                                                                                var28 *= -1579975767;
                                                                                                var28 >>= 10;
                                                                                                var28 *= 1508039415;
                                                                                                var28 ^= -1746522331;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var28 ^= -2127578464;
                                                                                    var28 *= -498951327;
                                                                                    var28 <<= 3;
                                                                                    var28 ^= 955827469;
                                                                                }
                                                                            } else {
                                                                                switch (var28) {
                                                                                    case -537412129:
                                                                                        var28 &= 1191645054;
                                                                                        var28 |= -777026474;
                                                                                        var28 -= -1529662235;
                                                                                        var28 *= -562292215;
                                                                                        var28 ^= 428840676;
                                                                                        break;
                                                                                    case -42089635:
                                                                                        var28 ^= -1759355371;
                                                                                        break;
                                                                                    case 2080504587:
                                                                                    default:
                                                                                        var28 ^= 598089258;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            var28 >>= 28;
                                                                            var28 += 1529727089;
                                                                            var28 *= 4392567;
                                                                            var28 &= -42020209;
                                                                            var28 ^= 113647780;
                                                                        }
                                                                    } else {
                                                                        var28 &= -301139655;
                                                                        var28 += 579013253;
                                                                        var28 ^= 1717539360;
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
                        } else {
                            switch (var28) {
                                case 362938699:
                                    var28 *= -1659066481;
                                    var28 ^= 223499584;
                                    break;
                                case 1613310788:
                                    var28 ^= 1758823700;
                                    break;
                                case 1925596266:
                                default:
                                    var28 ^= -311095747;
                            }
                        }
                    }
                }
            } else {
                var28 >>= 15;
                var28 ^= 354916542;
            }

            var3 = var28 + 1;
            var3 = var28 * var3;
            var28 = var3 & 1;
            if (var28 == 0) {
                AssertionError var647 = new AssertionError();
                throw var647;
            }
        }

        RuntimeException var646 = new RuntimeException();
        throw var646;
    }

    private void pY(FX var1, boolean var2, int var3) {
        float var72 = 0.0F;
        label103: {
            int var5 = System.identityHashCode(this);
            JL var6 = this.RQ;
            boolean var65 = var6.vb();
            int var7 = var5 + 1;
            var7 = var5 * var7;
            int var8 = var5 + 2;
            var7 *= var8;
            var8 = var5 + 3;
            var7 *= var8;
            var7 &= 7;
            int var46;
            if (var7 == 0) {
                var46 = switch (var3) {
                    case -2110034740 -> {
                        var46 = var3 - -694151358;
                        var46 += 1850960027;
                        yield var46 ^ 1515649835;
                    }
                    case -2033590586 -> var3 ^ 1099026900;
                    default -> var3 ^ -2056205332;
                };
                Integer var83 = var46;
                if (var83 == null) {
                    break label103;
                }

                label107: {
                    if (var65) {
                        var46 = switch (var46) {
                            case 807169426 -> var46 ^ -972139595;
                            case 1136149774 -> {
                                var46 *= 896168871;
                                var46 <<= 3;
                                var46 &= 821758606;
                                var46 += -1748020347;
                                yield var46 ^ 1853197467;
                            }
                            default -> var46 ^ -1496459705;
                        };
                        int var66 = var46 + 1;
                        int var67 = var46 * var66;
                        int var84 = var46 + 2;
                        int var68 = var67 * var84;
                        var84 = var46 + 3;
                        int var69 = var68 * var84;
                        int var70 = var69 & 7;
                        if (var70 != 0) {
                            break label103;
                        }

                        if (!var2) {
                            var46 -= -1363882980;
                            var46 >>= 28;
                            var46 -= -286206413;
                            var46 *= 1872274207;
                            var46 ^= -907953072;
                            Integer var71 = var46;
                            if (var71 == null) {
                                break label103;
                            }

                            var72 = 3.4F;
                            var46 |= -1343498984;
                            var46 |= -403362546;
                            var46 ^= -2027558399;
                            var46 ^= -583192440;
                            break label107;
                        }

                        var46 += 1451372731;
                        var46 += -1481056989;
                        var46 *= 734646765;
                        var46 ^= 1445114881;
                    } else {
                        switch (var46) {
                            case -1877881142:
                                var46 ^= 1728419168;
                                break;
                            case 601083055:
                            default:
                                var46 ^= 1086661416;
                                break;
                            case 1136149774:
                                var46 *= 1511639551;
                                var46 += 1254177999;
                                var46 ^= 1559402124;
                        }
                    }

                    int var86 = var46 + 1;
                    var86 = var46 * var86;
                    var86 &= 1;
                    if (var86 != 0) {
                        break label103;
                    }

                    var72 = 0.0F;
                    var46 *= -1146313921;
                    var46 ^= -809638972;
                }

                int var89 = var46 + 1;
                var89 = var46 * var89;
                var8 = var46 + 2;
                var89 *= var8;
                var8 = var46 + 3;
                var89 *= var8;
                var89 &= 7;
                if (var89 != 0) {
                    break label103;
                }

                this.IN = var72;
                this.PL = 0.0F;
                this.YI = 1.6F;
                Integer var73 = var5;
                if (var73 != null) {
                    var46 = switch (var46) {
                        case -1511577801 -> {
                            var46 &= 1174782015;
                            var46 += -1833067516;
                            var46 *= 1949047411;
                            var46 *= -785793557;
                            yield var46 ^ 1925772717;
                        }
                        default -> var46 ^ -1967569660;
                        case -414074879 -> var46 ^ 632787216;
                    };
                    long var74 = var46;
                    long var102 = var74 + 1L;
                    long var103 = var74 * var102;
                    long var75 = var103 & 1L;
                    long var109;
                    int var76 = (var109 = var75 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                    if (var76 != 0) {
                        break label103;
                    }

                    Nr var77 = this.Lm;
                    if (var77 == null) {
                        var46 >>>= 17;
                        var46 |= -2047567238;
                        var46 ^= 1818492061;
                        return;
                    }

                    var46 &= 1554484862;
                    var46 <<= 24;
                    var46 ^= 828958849;
                    var46 ^= -643324400;
                    Nr var78 = this.Lm;
                    long var94 = var5;
                    long var9 = var94 + 1L;
                    var9 = var94 * var9;
                    long var95 = var9 & 1L;
                    long var110;
                    var5 = (var110 = var95 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var46 = switch (var46) {
                            case -1362145647 -> {
                                var46 |= -1315743395;
                                yield var46 ^ -239212711;
                            }
                            case -748713488 -> var46 ^ -566944952;
                            default -> var46 ^ 1749538019;
                        };
                        long var96 = var46;
                        var9 = var96 + 1L;
                        var9 = var96 * var9;
                        long var11 = var96 + 2L;
                        var9 *= var11;
                        long var97 = var96 + 3L;
                        var9 *= var97;
                        long var98 = var9 & 7L;
                        long var111;
                        var5 = (var111 = var98 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label103;
                        }

                        var78.FO();
                        var46 *= 1324140469;
                        var46 -= -763243367;
                        var46 ^= 1107181145;
                        return;
                    }

                    var46 -= 1934905935;
                    var46 ^= -1132147961;
                } else {
                    var46 *= 1296965375;
                    var46 *= 365831401;
                    var46 += -392497316;
                    var46 ^= 2126998536;
                }
            } else {
                var46 = var3 | 1897625884;
                var46 *= -447566911;
                var46 ^= -1096949351;
            }

            Integer var60 = var46;
            if (var60 != null) {
                RuntimeException var62 = new RuntimeException();
                throw var62;
            }
        }

        IllegalStateException var61 = new IllegalStateException();
        throw var61;
    }

    private float ct(Lk var1, int var2) {
        float var105 = 0.0F;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var5 &= 1;
        if (var5 != 0) {
            int var79 = var2 & 109409541;
            var79 -= 887606851;
            var79 ^= -1286107449;
            var79 ^= 1897529605;
        } else {
            label120: {
                int var3 = var2 + -1293989832;
                var3 ^= 1903039468;
                Integer var102 = var3;
                label108:
                if (var102 != null) {
                    int var103 = var1.ordinal();
                    label106:
                    switch (var103) {
                        case 0:
                            var3 &= 312997883;
                            var3 |= -1218571348;
                            var3 ^= 1414996518;
                            var3 &= 1207398237;
                            var3 ^= 301778385;
                            Integer var97 = var3;
                            if (var97 == null) {
                                break label108;
                            }

                            var105 = 17.0F;
                            var3 |= -2139533888;
                            var3 ^= -147472229;
                            var3 ^= -1382155307;
                            break;
                        case 1:
                            var3 *= -2002677269;
                            var3 *= -1450491357;
                            var3 *= 559050421;
                            var3 ^= -59898994;
                            var4 = var3 + 1;
                            var4 = var3 * var4;
                            int var113 = var3 + 2;
                            var4 *= var113;
                            var113 = var3 + 3;
                            var4 *= var113;
                            var4 &= 7;
                            if (var4 != 0) {
                                break label108;
                            }

                            var105 = 37.0F;
                            var3 ^= 130413751;
                            var3 ^= 987386432;
                            var3 -= -628311367;
                            var3 |= 1508761290;
                            var3 ^= 1470761341;
                            break;
                        case 2:
                            var3 &= -440271923;
                            var3 ^= -333905786;
                            var3 ^= 1647425082;
                            var3 &= -1419703546;
                            var3 ^= 1337915292;
                            FX var104 = this.IL;
                            Integer var6 = var4;
                            if (var6 == null) {
                                switch (var3) {
                                    case -442501480:
                                        var3 ^= -1285520231;
                                        var3 |= -1604732854;
                                        var3 ^= -72469429;
                                        break label120;
                                    case 1137157232:
                                    default:
                                        var3 ^= -1762146135;
                                        break label120;
                                    case 1481887721:
                                        var3 ^= -908674345;
                                        break label120;
                                }
                            }

                            var3 += -2546872;
                            var3 &= 1720179539;
                            var3 += -1282339433;
                            var3 ^= -163529124;
                            var6 = var3;
                            if (var6 == null) {
                                break label108;
                            }

                            if (var104 == null) {
                                var3 -= 311652364;
                                var3 |= 989714114;
                                var3 ^= -159095448;
                                var105 = 60.0F;
                                switch (var3) {
                                    case -124285845:
                                        var3 ^= -122419107;
                                        break label106;
                                    case 159095703:
                                        var3 |= -297130975;
                                        var3 &= 1873035811;
                                        var3 ^= -1720458480;
                                        var3 += 1355019941;
                                        var3 ^= -817749682;
                                        break label106;
                                    case 746214769:
                                    default:
                                        var3 ^= 1847882908;
                                }
                            } else {
                                var3 = switch (var3) {
                                    default -> var3 ^ -257911139;
                                    case -506292085 -> {
                                        var3 *= 1093322435;
                                        var3 >>= 4;
                                        var3 |= 720794985;
                                        yield var3 ^ 533346923;
                                    }
                                    case -203120266 -> var3 ^ -180817234;
                                };
                                int var107 = var3 + 1;
                                var107 = var3 * var107;
                                int var7 = var3 + 2;
                                var107 *= var7;
                                var7 = var3 + 3;
                                var107 *= var7;
                                var107 &= 7;
                                if (var107 != 0) {
                                    break label108;
                                }

                                JL var112 = this.K;
                                var7 = var4 + 1;
                                var7 = var4 * var7;
                                int var8 = var4 + 2;
                                var7 *= var8;
                                var4 += 3;
                                var7 *= var4;
                                var4 = var7 & 7;
                                if (var4 != 0) {
                                    var3 *= 1302550025;
                                    var3 &= 1877842426;
                                    var3 &= -135113338;
                                    var3 ^= 1850855296;
                                    break label120;
                                }

                                var3 += 1806359733;
                                var3 ^= -993121040;
                                var4 = var3 + 1;
                                var4 = var3 * var4;
                                var4 &= 1;
                                if (var4 != 0) {
                                    break label108;
                                }

                                boolean var90 = var112.vb();
                                if (var90) {
                                    var3 <<= 26;
                                    var3 ^= -351206097;
                                    var3 ^= 863346153;
                                    var105 = 152.0F;
                                    switch (var3) {
                                        case -571506095:
                                        default:
                                            var3 ^= 886925944;
                                            break label106;
                                        case 246806619:
                                            var3 ^= 1309995222;
                                            break label106;
                                        case 1013225670:
                                            var3 += 663094416;
                                            var3 |= 860280904;
                                            var3 *= -226127291;
                                            var3 ^= -551374656;
                                    }
                                } else {
                                    var3 -= 1703779959;
                                    var3 -= 1959622671;
                                    var3 += 129337315;
                                    var3 ^= -1240296002;
                                    var3 ^= 1412435770;
                                    Integer var91 = var3;
                                    if (var91 == null) {
                                        break label108;
                                    }

                                    var105 = 96.0F;
                                    switch (var3) {
                                        case -1136078775:
                                        default:
                                            var3 ^= -737218371;
                                            break label106;
                                        case 1036052699:
                                            var3 ^= -1487767579;
                                            break label106;
                                        case 1789060114:
                                            var3 |= -1732910966;
                                            var3 >>>= 9;
                                            var3 |= 1441684787;
                                            var3 -= -327615906;
                                            var3 ^= -506227965;
                                    }
                                }
                            }
                            break;
                        default:
                            switch (var3) {
                                case -1983182013:
                                    var3 ^= 958321147;
                                    break;
                                case -1714564628:
                                default:
                                    var3 ^= -1494974659;
                                    break;
                                case 2117301097:
                                    var3 *= -7129619;
                                    var3 &= 1574307221;
                                    var3 += -1710891466;
                                    var3 ^= 1776116166;
                            }

                            MatchException var84 = new MatchException(null, null);
                            throw var84;
                    }

                    long var115 = var3;
                    long var122 = var115 + 1L;
                    var122 = var115 * var122;
                    var115 = var122 & 1L;
                    long var124;
                    var4 = (var124 = var115 - 0L) == 0L ? 0 : (var124 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        return var105;
                    }
                }

                IllegalStateException var99 = new IllegalStateException();
                throw var99;
            }
        }

        AssertionError var83 = new AssertionError();
        throw var83;
    }

    private static float aw(Lk var0, float var1, int var2) {
        label67: {
            int var23;
            float var69;
            label66: {
                int var4 = System.identityHashCode(var0);
                Integer var5 = var4;
                if (var5 != null) {
                    var23 = var2 >> 27;
                    var23 *= 1575605113;
                    var23 |= 1147389026;
                    var23 ^= -1731005346;
                    int var60 = var23 + 1;
                    int var61 = var23 * var60;
                    int var6 = var23 + 2;
                    int var62 = var61 * var6;
                    var6 = var23 + 3;
                    int var63 = var62 * var6;
                    int var64 = var63 & 7;
                    if (var64 != 0) {
                        break label67;
                    }

                    int var65 = var0.ordinal();
                    switch (var65) {
                        case 0:
                            var23 = switch (var23) {
                                case -1299420613 -> var23 ^ 1993522774;
                                case -870248412 -> {
                                    var23 *= 1588153131;
                                    yield var23 ^ -1317640017;
                                }
                                default -> var23 ^ 2015896859;
                            };
                            float var76 = var1 * 0.5F;
                            int var7 = var4 + 1;
                            var7 = var4 * var7;
                            int var82 = var4 + 2;
                            var7 *= var82;
                            var4 += 3;
                            var7 *= var4;
                            var4 = var7 & 7;
                            if (var4 == 0) {
                                var23 -= 195439215;
                                var23 ^= 330815564;
                                var23 ^= -106173062;
                                long var80 = var23;
                                long var9 = var80 + 1L;
                                var9 = var80 * var9;
                                long var81 = var9 & 1L;
                                long var85;
                                var4 = (var85 = var81 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label67;
                                }

                                var69 = var76;
                                switch (var23) {
                                    case -1482444984:
                                    default:
                                        var23 ^= 2077615062;
                                        break label66;
                                    case -1228393214:
                                        var23 |= 1482312195;
                                        var23 >>= 5;
                                        var23 |= -1020447407;
                                        var23 ^= -2104151711;
                                        break label66;
                                    case -750333783:
                                        var23 ^= -355610901;
                                        break label66;
                                }
                            }

                            var23 *= -338513749;
                            var23 -= 2046351872;
                            var23 |= 1654396344;
                            var23 ^= -1259071725;
                            break;
                        case 1:
                            var23 |= 779530269;
                            var23 ^= -418259494;
                            var69 = 16.0F;
                            var23 -= 320322087;
                            var23 ^= -1960544936;
                            break label66;
                        case 2:
                            var23 |= 1971723288;
                            var23 |= 91779962;
                            var23 >>= 4;
                            var23 ^= -1958893566;
                            int var66 = var23 + 1;
                            int var67 = var23 * var66;
                            int var68 = var67 & 1;
                            if (var68 != 0) {
                                break label67;
                            }

                            var69 = 22.0F;
                            switch (var23) {
                                case -1435387683:
                                    var23 ^= 961883125;
                                    break label66;
                                case 489751869:
                                default:
                                    var23 ^= -2142234397;
                                    break label66;
                                case 1960992757:
                                    var23 -= 467314845;
                                    var23 ^= -332714133;
                                    var23 += -1833313284;
                                    var23 ^= 982299319;
                                    break label66;
                            }
                        default:
                            var23 -= -766317775;
                            var23 ^= 10805838;
                            long var47 = var23;
                            long var72 = var47 + 1L;
                            long var73 = var47 * var72;
                            long var8 = var47 + 2L;
                            long var74 = var73 * var8;
                            long var48 = var47 + 3L;
                            long var75 = var74 * var48;
                            long var49 = var75 & 7L;
                            long var84;
                            var4 = (var84 = var49 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                            if (var4 == 0) {
                                MatchException var51 = new MatchException(null, null);
                                throw var51;
                            }
                            break label67;
                    }
                } else {
                    var23 = var2 | 1531001369;
                    var23 >>= 3;
                    var23 &= 1713768546;
                    var23 <<= 18;
                    var23 ^= 1388552938;
                }

                var4 = var23 + 1;
                var4 = var23 * var4;
                int var70 = var23 + 2;
                var4 *= var70;
                var23 += 3;
                var4 *= var23;
                var23 = var4 & 7;
                if (var23 == 0) {
                    IllegalStateException var46 = new IllegalStateException();
                    throw var46;
                }
                break label67;
            }

            Integer var55 = var23;
            if (var55 != null) {
                return var69;
            }
        }

        AssertionError var45 = new AssertionError();
        throw var45;
    }

    private void Z(lH_3 var1, int var2) {
        label318: {
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var418;
            int var230 = (var418 = var5 - 0L) == 0L ? 0 : (var418 < 0L ? -1 : 1);
            if (var230 != 0) {
                switch (var2) {
                    case -1205792108:
                        int var217 = var2 + 1465539818;
                        var217 ^= -648866599;
                        var217 ^= -295069321;
                        break;
                    case -1116984081:
                    default:
                        int var216 = var2 ^ 1412484514;
                        break;
                    case 1233124313:
                        int var215 = var2 ^ -1873496706;
                }
            } else {
                label316: {
                    int var3 = var2 * 1182456593;
                    var3 &= -1985370751;
                    var3 += -212475643;
                    var3 ^= -895196601;
                    FX var231 = this.IL;
                    String var235;
                    if (var231 != null) {
                        var3 -= 1730520215;
                        var3 &= 695021016;
                        var3 *= 1223664847;
                        var3 ^= -524298223;
                        Integer var232 = var3;
                        if (var232 == null) {
                            break label318;
                        }

                        FX var233 = this.IL;
                        String var234 = var233.title();
                        long var6 = var4;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var419;
                        int var241 = (var419 = var6 - 0L) == 0L ? 0 : (var419 < 0L ? -1 : 1);
                        if (var241 != 0) {
                            var3 *= 1897718427;
                            var3 >>>= 22;
                            var3 += 262831049;
                            var3 &= 1896235588;
                            var3 ^= 960733396;
                            break label316;
                        }

                        var3 += 1640847950;
                        var3 += -1750874371;
                        var3 *= -966057359;
                        var3 ^= -1567295849;
                        var235 = var234;
                        var3 &= 1722552418;
                        var3 *= -788671565;
                        var3 ^= 623207057;
                    } else {
                        var3 += -1168048759;
                        var3 ^= 49003961;
                        Bp_2 var242 = this.Ki;
                        var7 = var4;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var420;
                        int var291 = (var420 = var7 - 0L) == 0L ? 0 : (var420 < 0L ? -1 : 1);
                        if (var291 != 0) {
                            switch (var3) {
                                case 648757418:
                                    var3 ^= -960178607;
                                    break label316;
                                case 1198241494:
                                default:
                                    var3 ^= 2115570283;
                                    break label316;
                                case 2050015218:
                                    var3 += -2027429625;
                                    var3 += -1451011768;
                                    var3 += 1017996621;
                                    var3 |= -1940465806;
                                    var3 ^= -677497554;
                                    break label316;
                            }
                        }
                        var3 = switch (var3) {
                            case -1449900155 -> var3 ^ 1203670078;
                            default -> var3 ^ 590447058;
                            case 2050015218 -> {
                                var3 ^= 55347183;
                                var3 *= 1733395551;
                                yield var3 ^ 1481276168;
                            }
                        };
                        Integer var292 = var3;
                        if (var292 == null) {
                            break label318;
                        }

                        String var243 = var242.notPlaying();
                        var235 = var243;
                        var3 ^= -819968267;
                        var3 ^= 1638245161;
                    }

                    Integer var244 = var3;
                    if (var244 == null) {
                        break label318;
                    }

                    int var245 = var4 + 1;
                    var245 = var4 * var245;
                    int var293 = var4 + 2;
                    var245 *= var293;
                    int var294 = var4 + 3;
                    var245 *= var294;
                    var245 &= 7;
                    if (var245 != 0) {
                        var3 -= -520574387;
                        var3 &= -578752009;
                        var3 &= 343105994;
                        var3 ^= 675398418;
                    } else {
                        label317: {
                            var3 ^= 636671280;
                            var3 *= -545207681;
                            var3 -= 1443925615;
                            var3 ^= -1608219536;
                            Integer var250 = var3;
                            if (var250 == null) {
                                break label318;
                            }

                            float var251 = 21.0F;
                            float var295 = 22.0F;
                            r_2 var319 = this.y;
                            Enum var320 = var319.A();
                            q_2 var321 = (q_2)var320;
                            int var322 = var321.ordinal();
                            float var343;
                            switch (var322) {
                                case 0:
                                    var3 -= 837332778;
                                    var3 >>= 30;
                                    var3 ^= 770502249;
                                    FX var381 = this.IL;
                                    int var399 = var4 + 1;
                                    var399 = var4 * var399;
                                    var399 &= 1;
                                    if (var399 != 0) {
                                        var3 <<= 24;
                                        var3 ^= 633139369;
                                        var3 ^= 1962742393;
                                        break label317;
                                    }
                                    var3 = switch (var3) {
                                        default -> var3 ^ 618208294;
                                        case -838815585 -> var3 ^ -2103295481;
                                        case 770502249 -> {
                                            var3 >>= 24;
                                            var3 |= -2030547037;
                                            yield var3 ^ -872957403;
                                        }
                                    };
                                    if (var381 == null) {
                                        var3 = switch (var3) {
                                            default -> var3 ^ -1994165071;
                                            case 1292891530 -> {
                                                var3 &= 199590303;
                                                var3 += -2054961272;
                                                var3 |= -205209332;
                                                var3 ^= 1051588071;
                                                yield var3 ^ 508640292;
                                            }
                                            case 1347339902 -> var3 ^ -832099221;
                                        };
                                        Integer var382 = var3;
                                        if (var382 == null) {
                                            break label318;
                                        }

                                        TextStyle var383 = this.JM;
                                        float var384 = var1.me(var235, var383);
                                        float var252 = var251 + var384;
                                        Integer var385 = var4;
                                        if (var385 == null) {
                                            switch (var3) {
                                                case -1337527938:
                                                    var3 ^= -1388943419;
                                                    break label317;
                                                case -550436643:
                                                    var3 += 1922341908;
                                                    var3 |= -1782432252;
                                                    var3 ^= -309961691;
                                                    break label317;
                                                case -214564131:
                                                default:
                                                    var3 ^= 2053741263;
                                                    break label317;
                                            }
                                        }
                                        var3 = switch (var3) {
                                            case -550436643 -> {
                                                var3 *= -1678825451;
                                                var3 &= -1383670626;
                                                var3 &= -830742092;
                                                var3 *= -24190263;
                                                yield var3 ^ -145564883;
                                            }
                                            default -> var3 ^ -707139996;
                                            case 82155935 -> var3 ^ 304857821;
                                        };
                                        float var253 = var252 + var295;
                                        var343 = var253;
                                        var3 -= -1229696418;
                                        var3 ^= 1462549448;
                                        var3 -= 370779844;
                                        var3 &= -387421587;
                                        var3 ^= -1026023653;
                                    } else {
                                        var3 = switch (var3) {
                                            default -> var3 ^ -1118795339;
                                            case 918204880 -> var3 ^ 1130277530;
                                            case 1292891530 -> {
                                                var3 ^= 1015256186;
                                                var3 *= 634173085;
                                                yield var3 ^ 1938629902;
                                            }
                                        };
                                        var250 = var3;
                                        if (var250 == null) {
                                            break label318;
                                        }

                                        var343 = 86.0F;
                                        var3 |= 766267599;
                                        var3 += -742277653;
                                        var3 += -262760313;
                                        var3 -= -789464221;
                                        var3 ^= -1153669548;
                                    }
                                    break;
                                case 1:
                                    var3 |= 2017217262;
                                    var3 >>= 15;
                                    var3 ^= -610140404;
                                    var3 ^= 1476757758;
                                    TextStyle var376 = this.JM;
                                    float var377 = var1.me(var235, var376);
                                    int var396 = var4 + 1;
                                    var396 = var4 * var396;
                                    var396 &= 1;
                                    if (var396 != 0) {
                                        var3 &= 898550395;
                                        var3 ^= 969239257;
                                        break label317;
                                    }

                                    var3 ^= 612513747;
                                    var3 <<= 12;
                                    var3 ^= -1416970567;
                                    float var378 = var251 + var377;
                                    float var379 = var378 + var295;
                                    float var380 = TP.t(var379, 86.0F, 196.0F);
                                    var343 = var380;
                                    var3 >>>= 24;
                                    var3 -= 1506478750;
                                    var3 ^= 1814880632;
                                    break;
                                case 2:
                                    var3 = switch (var3) {
                                        case 983847395 -> var3 ^ 1855263534;
                                        case 1202305434 -> {
                                            var3 &= -2028492290;
                                            var3 ^= 2037112226;
                                            yield var3 ^ -1429386991;
                                        }
                                        default -> var3 ^ 1548324986;
                                    };
                                    Integer var323 = var3;
                                    if (var323 == null) {
                                        break label318;
                                    }

                                    int var324 = var3 & 1171192542;
                                    int var325 = var324 ^ 183982717;
                                    String var326 = this.L(var325);
                                    Integer var333 = var4;
                                    if (var333 == null) {
                                        var3 -= -1081635606;
                                        var3 ^= 761156335;
                                        break label317;
                                    }

                                    var3 |= -1575759808;
                                    var3 |= 654220468;
                                    var3 >>>= 27;
                                    var3 ^= 286899208;
                                    Integer var334 = var3;
                                    if (var334 == null) {
                                        break label318;
                                    }

                                    String var338;
                                    if (var326 != null) {
                                        var3 >>>= 28;
                                        var3 |= -760715931;
                                        var3 &= -376815237;
                                        var3 ^= -968091018;
                                        int var335 = var3 + 1;
                                        int var336 = var3 * var335;
                                        int var337 = var336 & 1;
                                        if (var337 != 0) {
                                            break label318;
                                        }

                                        var338 = var326;
                                        var3 |= -459851007;
                                        var3 ^= 72746091;
                                        var3 <<= 26;
                                        var3 ^= -333457807;
                                    } else {
                                        var3 += 2008985142;
                                        var3 &= -1436255255;
                                        var3 -= -2097190415;
                                        var3 ^= 423112817;
                                        Integer var371 = var3;
                                        if (var371 == null) {
                                            break label318;
                                        }

                                        var338 = var235;
                                        var3 += 1642420009;
                                        var3 &= -343036854;
                                        var3 ^= 1980977723;
                                    }

                                    int var372 = var3 + 1;
                                    var372 = var3 * var372;
                                    var372 &= 1;
                                    if (var372 != 0) {
                                        break label318;
                                    }

                                    TextStyle var375 = this.JM;
                                    long var388 = var4;
                                    long var13 = var388 + 1L;
                                    var13 = var388 * var13;
                                    long var15 = var388 + 2L;
                                    var13 *= var15;
                                    var388 += 3L;
                                    var13 *= var388;
                                    var388 = var13 & 7L;
                                    long var421;
                                    int var391 = (var421 = var388 - 0L) == 0L ? 0 : (var421 < 0L ? -1 : 1);
                                    if (var391 != 0) {
                                        switch (var3) {
                                            case -1183229719:
                                            default:
                                                var3 ^= 2001899554;
                                                break label317;
                                            case 145143580:
                                                var3 ^= -2144348276;
                                                break label317;
                                            case 471848561:
                                                var3 += 1970299442;
                                                var3 |= 1590121071;
                                                var3 ^= 258593828;
                                                var3 >>= 1;
                                                var3 ^= -803293771;
                                                break label317;
                                        }
                                    }

                                    var3 |= -941585108;
                                    var3 ^= -754684151;
                                    var388 = var3;
                                    var13 = var388 + 1L;
                                    var13 = var388 * var13;
                                    var15 = var388 + 2L;
                                    var13 *= var15;
                                    var388 += 3L;
                                    var13 *= var388;
                                    var388 = var13 & 7L;
                                    long var422;
                                    int var395 = (var422 = var388 - 0L) == 0L ? 0 : (var422 < 0L ? -1 : 1);
                                    if (var395 != 0) {
                                        break label318;
                                    }

                                    var343 = var1.me(var338, var375);
                                    var343 = var251 + var343;
                                    var343 += var295;
                                    var343 = TP.t(var343, 86.0F, 236.0F);
                                    var343 = var343;
                                    var3 *= -974861029;
                                    var3 &= -1177875792;
                                    var3 -= -772270697;
                                    var3 ^= -199754301;
                                    break;
                                default:
                                    var3 *= -2035579647;
                                    var3 *= -1646932829;
                                    var3 ^= 1221107048;
                                    var4 = var3 + 1;
                                    var4 = var3 * var4;
                                    var3 = var4 & 1;
                                    if (var3 == 0) {
                                        MatchException var50 = new MatchException(null, null);
                                        throw var50;
                                    }
                                    break label318;
                            }

                            int var255 = var3 + 1;
                            var255 = var3 * var255;
                            int var296 = var3 + 2;
                            var255 *= var296;
                            int var297 = var3 + 3;
                            var255 *= var297;
                            var255 &= 7;
                            if (var255 != 0) {
                                break label318;
                            }

                            this.Kv = var343;
                            long var260 = var4;
                            long var344 = var260 + 1L;
                            long var345 = var260 * var344;
                            long var402 = var260 + 2L;
                            long var346 = var345 * var402;
                            long var261 = var260 + 3L;
                            long var347 = var346 * var261;
                            long var262 = var347 & 7L;
                            long var423;
                            var255 = (var423 = var262 - 0L) == 0L ? 0 : (var423 < 0L ? -1 : 1);
                            if (var255 != 0) {
                                switch (var3) {
                                    case -1366641580:
                                    default:
                                        var3 ^= 2141476285;
                                        break;
                                    case -904390822:
                                        var3 ^= 788496769;
                                        var3 -= -1862147082;
                                        var3 *= -1067466245;
                                        var3 += 1660098518;
                                        var3 ^= -868040307;
                                        break;
                                    case 1878687275:
                                        var3 ^= -1947547884;
                                }
                            } else {
                                label340: {
                                    var3 = switch (var3) {
                                        default -> var3 ^ -2044510707;
                                        case -904390822 -> {
                                            var3 += -1166677548;
                                            var3 &= 788499830;
                                            var3 >>= 4;
                                            yield var3 ^ -1899493216;
                                        }
                                        case -524683676 -> var3 ^ -1719533297;
                                    };
                                    Integer var264 = var3;
                                    if (var264 == null) {
                                        break label318;
                                    }

                                    FX var265 = this.IL;
                                    if (var265 == null) {
                                        var3 &= 1185988165;
                                        var3 ^= -1959306845;
                                        long var266 = var3;
                                        long var348 = var266 + 1L;
                                        long var349 = var266 * var348;
                                        var402 = var266 + 2L;
                                        long var350 = var349 * var402;
                                        long var267 = var266 + 3L;
                                        long var351 = var350 * var267;
                                        long var268 = var351 & 7L;
                                        long var424;
                                        int var269 = (var424 = var268 - 0L) == 0L ? 0 : (var424 < 0L ? -1 : 1);
                                        if (var269 != 0) {
                                            break label318;
                                        }

                                        float var270 = this.Kv;
                                        float var271 = TP.t(var270, 86.0F, 196.0F);
                                        Integer var298 = var4;
                                        if (var298 == null) {
                                            var3 >>= 29;
                                            var3 += -178342975;
                                            var3 *= 1364229273;
                                            var3 ^= 1157174565;
                                            break label340;
                                        }
                                        var3 = switch (var3) {
                                            case -1917324893 -> {
                                                var3 -= 1277164846;
                                                yield var3 ^ -1446611258;
                                            }
                                            case -1295353138 -> var3 ^ -1880047181;
                                            default -> var3 ^ -141576094;
                                        };
                                        long var352 = var3;
                                        var402 = var352 + 1L;
                                        var402 = var352 * var402;
                                        long var416 = var352 + 2L;
                                        var402 *= var416;
                                        long var353 = var352 + 3L;
                                        var402 *= var353;
                                        long var354 = var402 & 7L;
                                        long var425;
                                        int var299 = (var425 = var354 - 0L) == 0L ? 0 : (var425 < 0L ? -1 : 1);
                                        if (var299 != 0) {
                                            break label318;
                                        }

                                        this.Kv = var271;
                                        var3 <<= 16;
                                        var3 ^= 677548261;
                                    } else {
                                        var3 |= 680092099;
                                        var3 ^= 72907030;
                                    }

                                    FX var272 = this.IL;
                                    int var300 = var4 + 1;
                                    int var301 = var4 * var300;
                                    int var355 = var4 + 2;
                                    int var302 = var301 * var355;
                                    int var356 = var4 + 3;
                                    int var303 = var302 * var356;
                                    int var304 = var303 & 7;
                                    if (var304 != 0) {
                                        switch (var3) {
                                            case -1429106459:
                                                var3 += 663097540;
                                                var3 |= 1905161561;
                                                var3 *= 1920823969;
                                                var3 += -473919222;
                                                var3 ^= -1007040909;
                                                break;
                                            case -1345788406:
                                            default:
                                                var3 ^= -1196909980;
                                                break;
                                            case -1251244180:
                                                var3 ^= 1774633879;
                                        }
                                    } else {
                                        label313: {
                                            var3 &= -1923530203;
                                            var3 <<= 15;
                                            var3 &= -1954205399;
                                            var3 ^= 1877546079;
                                            String var279;
                                            if (var272 != null) {
                                                var3 = switch (var3) {
                                                    case -269937569 -> {
                                                        var3 -= 1686177439;
                                                        var3 *= -883867179;
                                                        yield var3 ^ -753610311;
                                                    }
                                                    default -> var3 ^ 1609762103;
                                                    case 1745356513 -> var3 ^ 970974924;
                                                };
                                                long var273 = var3;
                                                long var357 = var273 + 1L;
                                                long var358 = var273 * var357;
                                                var402 = var273 + 2L;
                                                long var359 = var358 * var402;
                                                long var274 = var273 + 3L;
                                                long var360 = var359 * var274;
                                                long var275 = var360 & 7L;
                                                long var426;
                                                int var276 = (var426 = var275 - 0L) == 0L ? 0 : (var426 < 0L ? -1 : 1);
                                                if (var276 != 0) {
                                                    break label318;
                                                }

                                                FX var277 = this.IL;
                                                Integer var305 = var4;
                                                if (var305 == null) {
                                                    var3 ^= 1926131212;
                                                    var3 ^= -258149554;
                                                    var3 ^= 1809227499;
                                                    break label313;
                                                }

                                                var3 ^= -1199628762;
                                                var3 *= -1624077733;
                                                var3 += 859002084;
                                                var3 += -1197833858;
                                                var3 ^= 836274768;
                                                int var306 = var3 + 1;
                                                int var307 = var3 * var306;
                                                int var361 = var3 + 2;
                                                int var308 = var307 * var361;
                                                int var362 = var3 + 3;
                                                int var309 = var308 * var362;
                                                int var310 = var309 & 7;
                                                if (var310 != 0) {
                                                    break label318;
                                                }

                                                String var278 = var277.artist();
                                                var279 = var278;
                                                var3 &= -1341379441;
                                                var3 ^= 1224379638;
                                                var3 += 1598003763;
                                                var3 ^= 701180354;
                                            } else {
                                                var3 *= -1045055135;
                                                var3 *= -973866329;
                                                var3 *= -994262677;
                                                var3 += 1776243182;
                                                var3 ^= -326311374;
                                                int var311 = var3 + 1;
                                                int var312 = var3 * var311;
                                                int var313 = var312 & 1;
                                                if (var313 != 0) {
                                                    break label318;
                                                }

                                                Bp_2 var314 = this.Ki;
                                                int var363 = var4 + 1;
                                                int var364 = var4 * var363;
                                                int var365 = var364 & 1;
                                                if (var365 != 0) {
                                                    var3 += 61633481;
                                                    var3 ^= 256878532;
                                                    var3 &= 440594499;
                                                    var3 += 2017795282;
                                                    var3 ^= -1476092414;
                                                    break label313;
                                                }

                                                var3 >>>= 7;
                                                var3 ^= -461800142;
                                                int var366 = var3 + 1;
                                                int var367 = var3 * var366;
                                                int var386 = var3 + 2;
                                                int var368 = var367 * var386;
                                                var386 = var3 + 3;
                                                int var369 = var368 * var386;
                                                int var370 = var369 & 7;
                                                if (var370 != 0) {
                                                    break label318;
                                                }

                                                String var315 = var314.idleHint();
                                                var279 = var315;
                                                var3 |= -1160655509;
                                                var3 *= -32015617;
                                                var3 ^= -789585933;
                                            }

                                            TextStyle var280 = this.vI;
                                            float var236 = var1.me(var235, var280);
                                            TextStyle var281 = this.zm;
                                            float var282 = var1.me(var279, var281);
                                            float var237 = Math.max(var236, var282);
                                            float var238 = 41.0F + var237;
                                            int var283 = var4 + 1;
                                            var283 = var4 * var283;
                                            var4 = var283 & 1;
                                            if (var4 == 0) {
                                                var3 ^= 245124111;
                                                var3 ^= 1328627641;
                                                var3 -= -432890194;
                                                var3 += -97778734;
                                                var3 ^= -799013464;
                                                long var285 = var3;
                                                long var328 = var285 + 1L;
                                                long var329 = var285 * var328;
                                                long var286 = var329 & 1L;
                                                long var427;
                                                var4 = (var427 = var286 - 0L) == 0L ? 0 : (var427 < 0L ? -1 : 1);
                                                if (var4 == 0) {
                                                    float var224 = var238 + 12.0F;
                                                    float var225 = var224 + 10.0F;
                                                    float var226 = var225 + 8.0F;
                                                    float var227 = TP.t(var226, 150.0F, 240.0F);
                                                    this.ET = var227;
                                                    return;
                                                }
                                                break label318;
                                            }

                                            var3 += 1942124786;
                                            var3 += -1653290667;
                                            var3 ^= -1418880003;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            RuntimeException var228 = new RuntimeException();
            throw var228;
        }

        UnsupportedOperationException var207 = new UnsupportedOperationException();
        throw var207;
    }

    private String L(int var1) {
        label109: {
            int var43;
            String var103;
            label108: {
                label107: {
                    int var3 = System.identityHashCode(this);
                    int var4 = var1 + -1514070878;
                    var4 ^= 1260542473;
                    Za var76 = this.g(var4);
                    long var5 = var3;
                    long var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var121;
                    int var80 = (var121 = var5 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                    if (var80 == 0) {
                        var43 = var1 & 9250926;
                        var43 ^= 317918077;
                        int var81 = var43 + 1;
                        int var82 = var43 * var81;
                        int var83 = var82 & 1;
                        if (var83 != 0) {
                            break label109;
                        }

                        if (var76 == null) {
                            var43 *= 1390930111;
                            var43 <<= 23;
                            var43 ^= 1348496952;
                            var43 &= -1425172027;
                            var43 ^= -1301560985;
                            break label107;
                        }

                        var43 >>= 18;
                        var43 &= -186190602;
                        var43 |= -1472388411;
                        var43 ^= 1756039158;
                        var5 = var43;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var122;
                        int var86 = (var122 = var5 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                        if (var86 != 0) {
                            break label109;
                        }

                        boolean var87 = var76.Gd();
                        Integer var6 = var3;
                        if (var6 == null) {
                            var43 += -254598710;
                            var43 ^= 2058690493;
                            var43 <<= 12;
                            var43 -= 1599529711;
                            var43 ^= -486238361;
                        } else {
                            var43 &= -400149321;
                            var43 ^= 1879667868;
                            var43 -= 1587872256;
                            var43 ^= -1864744602;
                            Integer var96 = var43;
                            if (var96 == null) {
                                break label109;
                            }

                            if (!var87) {
                                var43 -= -1241267018;
                                var43 |= -1772529154;
                                var43 -= 763844364;
                                var43 ^= 643352207;
                                var43 ^= 1699022619;
                                break label107;
                            }
                            var43 = switch (var43) {
                                case -1045425159 -> {
                                    var43 ^= 1285276713;
                                    var43 *= 736229243;
                                    yield var43 ^ 2024996632;
                                }
                                default -> var43 ^ 1760164234;
                                case 1665196338 -> var43 ^ 1491922119;
                            };
                            var5 = this.wN;
                            int var89 = Nr.G(var76, var5);
                            long var97 = var3;
                            long var8 = var97 + 1L;
                            var8 = var97 * var8;
                            long var98 = var8 & 1L;
                            long var123;
                            int var99 = (var123 = var98 - 0L) == 0L ? 0 : (var123 < 0L ? -1 : 1);
                            if (var99 != 0) {
                                switch (var43) {
                                    case -945250328:
                                        var43 |= -537571456;
                                        var43 &= -1170583991;
                                        var43 ^= -503530812;
                                        var43 ^= -29327622;
                                        break;
                                    case -531914773:
                                    default:
                                        var43 ^= 1536110019;
                                        break;
                                    case -463967453:
                                        var43 ^= 671670837;
                                }
                            } else {
                                var43 |= 1227796410;
                                var43 ^= 289922948;
                                int var100 = var43 + 1;
                                int var101 = var43 * var100;
                                int var102 = var101 & 1;
                                if (var102 != 0) {
                                    break label109;
                                }

                                if (var89 < 0) {
                                    var43 = switch (var43) {
                                        case -649965569 -> var43 ^ -1207888139;
                                        case -555130754 -> {
                                            var43 -= 1450343441;
                                            yield var43 ^ -1735836162;
                                        }
                                        default -> var43 ^ 1125025242;
                                    };
                                    int var104 = var43 + 1;
                                    int var105 = var43 * var104;
                                    int var116 = var43 + 2;
                                    int var106 = var105 * var116;
                                    int var117 = var43 + 3;
                                    int var107 = var106 * var117;
                                    int var108 = var107 & 7;
                                    if (var108 != 0) {
                                        break label109;
                                    }

                                    var103 = "";
                                    var43 >>= 8;
                                    var43 *= -1020472105;
                                    var43 &= 1193096641;
                                    var43 ^= 1184518555;
                                    break label108;
                                }

                                var43 *= 1147582199;
                                var43 |= -900964296;
                                var43 ^= -1908448624;
                                var43 -= 2021876900;
                                var43 ^= -756730106;
                                int var112 = var43 + 1;
                                int var113 = var43 * var112;
                                int var114 = var113 & 1;
                                if (var114 != 0) {
                                    break label109;
                                }

                                hP_2 var77 = var76.VP(var89);
                                String var78 = var77.text();
                                int var90 = var3 + 1;
                                int var91 = var3 * var90;
                                int var115 = var3 + 2;
                                int var92 = var91 * var115;
                                var3 += 3;
                                int var93 = var92 * var3;
                                var3 = var93 & 7;
                                if (var3 == 0) {
                                    var43 ^= 929320012;
                                    var43 |= -1258669909;
                                    var43 += 478453774;
                                    var43 ^= 197451834;
                                    var3 = var43 + 1;
                                    var3 = var43 * var3;
                                    int var94 = var43 + 2;
                                    var3 *= var94;
                                    int var95 = var43 + 3;
                                    var3 *= var95;
                                    var3 &= 7;
                                    if (var3 != 0) {
                                        break label109;
                                    }

                                    var103 = var78;
                                    var43 >>= 11;
                                    var43 ^= -9435035;
                                    break label108;
                                }

                                var43 *= 670120511;
                                var43 ^= -279394058;
                            }
                        }
                    } else {
                        switch (var1) {
                            case 495944685:
                            default:
                                var43 = var1 ^ -1409790364;
                                break;
                            case 1316053621:
                                var43 = var1 + 726432023;
                                var43 ^= -63352326;
                                break;
                            case 2077885485:
                                var43 = var1 ^ 332333231;
                        }
                    }

                    var3 = var43 + 1;
                    var3 = var43 * var3;
                    var43 = var3 & 1;
                    if (var43 == 0) {
                        RuntimeException var61 = new RuntimeException();
                        throw var61;
                    }
                    break label109;
                }

                Integer var72 = var43;
                if (var72 != null) {
                    return null;
                }
                break label109;
            }

            long var69 = var43;
            long var118 = var69 + 1L;
            var118 = var69 * var118;
            var69 = var118 & 1L;
            long var124;
            int var71 = (var124 = var69 - 0L) == 0L ? 0 : (var124 < 0L ? -1 : 1);
            if (var71 == 0) {
                return var103;
            }
        }

        RuntimeException var60 = new RuntimeException();
        throw var60;
    }

    private Za g(int var1) {
        label197: {
            int var66;
            label152: {
                int var3 = System.identityHashCode(this);
                JL var4 = this.K;
                long var5 = var3;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var174;
                int var116 = (var174 = var5 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                if (var116 != 0) {
                    var66 = var1 << 17;
                    var66 += 1464021396;
                    var66 -= 204639545;
                    var66 += -1966591125;
                    var66 ^= 862223717;
                } else {
                    var66 = switch (var1) {
                        case -1755956768 -> var1 ^ -1982001027;
                        default -> var1 ^ -1600890420;
                        case -1089460962 -> {
                            var66 = var1 >>> 17;
                            var66 *= 1288142691;
                            var66 -= -38634442;
                            var66 <<= 17;
                            yield var66 ^ -158712178;
                        }
                    };
                    var5 = var66;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var175;
                    int var119 = (var175 = var5 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                    if (var119 != 0) {
                        break label197;
                    }

                    boolean var104 = var4.vb();
                    if (!var104) {
                        switch (var66) {
                            case -549023034:
                                var66 ^= 1069186919;
                                return null;
                            case 454453592:
                            default:
                                var66 ^= 969520678;
                                return null;
                            case 743325326:
                                var66 += -798795374;
                                var66 -= -670423950;
                                var66 ^= 656872432;
                                return null;
                        }
                    }
                    var66 = switch (var66) {
                        default -> var66 ^ 1980679381;
                        case 743325326 -> {
                            var66 &= -902003070;
                            yield var66 ^ -1183480321;
                        }
                        case 2025786243 -> var66 ^ -961205120;
                    };
                    Integer var105 = var66;
                    if (var105 == null) {
                        break label197;
                    }

                    Zq var106 = this.nI;
                    var5 = var3;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var9 = var5 + 2L;
                    var7 *= var9;
                    var5 += 3L;
                    var7 *= var5;
                    var5 = var7 & 7L;
                    long var176;
                    int var123 = (var176 = var5 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                    if (var123 == 0) {
                        var66 = switch (var66) {
                            case -1317436547 -> {
                                var66 ^= 359485789;
                                var66 *= -585173289;
                                yield var66 ^ 654995615;
                            }
                            default -> var66 ^ 1579772202;
                            case 429463725 -> var66 ^ -121342051;
                        };
                        if (var106 == null) {
                            var66 &= -270000291;
                            var66 ^= 732456963;
                            return null;
                        }

                        var66 -= -625860391;
                        var66 |= 1767564827;
                        var66 >>>= 8;
                        var66 >>= 25;
                        var66 ^= 1714512848;
                        int var107 = var66 + 1;
                        int var108 = var66 * var107;
                        int var109 = var108 & 1;
                        if (var109 != 0) {
                            break label197;
                        }

                        FX var110 = this.IL;
                        Integer var124 = var3;
                        if (var124 != null) {
                            var66 *= 432653345;
                            var66 -= 113946116;
                            var66 ^= -1531052497;
                            var5 = var66;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var177;
                            int var127 = (var177 = var5 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                            if (var127 != 0) {
                                break label197;
                            }

                            if (var110 == null) {
                                switch (var66) {
                                    case -1616498133:
                                        var66 ^= -1210295514;
                                        return null;
                                    case -1356635233:
                                    default:
                                        var66 ^= -1797461880;
                                        return null;
                                    case 15962595:
                                        var66 |= 970221240;
                                        var66 |= 1516059642;
                                        var66 ^= 2021629861;
                                        return null;
                                }
                            }
                            var66 = switch (var66) {
                                default -> var66 ^ -812950177;
                                case 15962595 -> {
                                    var66 &= 1146298869;
                                    var66 -= 424534178;
                                    yield var66 ^ -485917038;
                                }
                                case 1487408677 -> var66 ^ -2083073780;
                            };
                            Zq var111 = this.nI;
                            be_2 var112 = var111.nB();
                            BA var128 = var112.state();
                            BA var6 = BA.FOUND;
                            int var157 = var3 + 1;
                            int var158 = var3 * var157;
                            int var159 = var158 & 1;
                            if (var159 == 0) {
                                var66 -= 1866245619;
                                var66 += -924487510;
                                var66 -= 1884675269;
                                var66 *= -595290727;
                                var66 ^= -1164431982;
                                Integer var160 = var66;
                                if (var160 == null) {
                                    break label197;
                                }

                                if (var128 != var6) {
                                    var66 ^= -1456630502;
                                    var66 ^= -1199051050;
                                    break label152;
                                }
                                var66 = switch (var66) {
                                    case -1165573483 -> {
                                        var66 <<= 8;
                                        var66 <<= 14;
                                        yield var66 ^ -1604517472;
                                    }
                                    default -> var66 ^ 790095895;
                                    case 2100921469 -> var66 ^ 1640259225;
                                };
                                Integer var129 = var66;
                                if (var129 == null) {
                                    break label197;
                                }

                                String var130 = var112.trackId();
                                FX var144 = this.IL;
                                String var145 = var144.trackId();
                                int var161 = var3 + 1;
                                int var162 = var3 * var161;
                                int var8 = var3 + 2;
                                int var163 = var162 * var8;
                                var8 = var3 + 3;
                                int var164 = var163 * var8;
                                int var165 = var164 & 7;
                                if (var165 == 0) {
                                    var66 |= 53632794;
                                    var66 *= 245080099;
                                    var66 ^= 1221728679;
                                    boolean var131 = var130.equals(var145);
                                    if (!var131) {
                                        var66 |= -1002417397;
                                        var66 ^= 1380702510;
                                        var66 <<= 4;
                                        var66 ^= -210446583;
                                        break label152;
                                    }

                                    var66 *= 2088150333;
                                    var66 |= -1123057513;
                                    var66 *= 1676090503;
                                    var66 ^= -817921161;
                                    int var132 = var66 + 1;
                                    int var133 = var66 * var132;
                                    int var134 = var133 & 1;
                                    if (var134 != 0) {
                                        break label197;
                                    }

                                    Za var113 = var112.lyrics();
                                    int var135 = var3 + 1;
                                    int var136 = var3 * var135;
                                    var3 = var136 & 1;
                                    if (var3 == 0) {
                                        var66 |= -205621396;
                                        var66 &= 781367480;
                                        var66 |= -2039256833;
                                        var66 |= 1573853870;
                                        var66 ^= -1576232681;
                                        var5 = var66;
                                        var7 = var5 + 1L;
                                        var7 = var5 * var7;
                                        var9 = var5 + 2L;
                                        var7 *= var9;
                                        var5 += 3L;
                                        var7 *= var5;
                                        var5 = var7 & 7L;
                                        long var178;
                                        var3 = (var178 = var5 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                                        if (var3 != 0) {
                                            break label197;
                                        }

                                        switch (var66) {
                                            case 1576264680:
                                                var66 &= 1039125607;
                                                var66 ^= 2025092203;
                                                return var113;
                                            case 1614176344:
                                                var66 ^= -817589201;
                                                return var113;
                                            case 1847251457:
                                            default:
                                                var66 ^= -1410882941;
                                                return var113;
                                        }
                                    }

                                    switch (var66) {
                                        case -1699614398:
                                        default:
                                            var66 ^= 301893598;
                                            break;
                                        case -1132159772:
                                            var66 ^= -849880087;
                                            break;
                                        case -501519306:
                                            var66 <<= 21;
                                            var66 -= 1819285799;
                                            var66 -= 1661813526;
                                            var66 ^= -1540224672;
                                    }
                                } else {
                                    var66 |= 66306974;
                                    var66 -= 292806910;
                                    var66 ^= -1034314403;
                                    var66 ^= 664982846;
                                }
                            } else {
                                var66 ^= -2001782433;
                                var66 ^= -1613509551;
                            }
                        } else {
                            var66 += -1708775619;
                            var66 |= -776070764;
                            var66 ^= 1151663836;
                            var66 ^= -2043949086;
                        }
                    } else {
                        var66 |= 1805008208;
                        var66 *= 840888621;
                        var66 ^= -1001930858;
                        var66 *= -756203531;
                        var66 ^= 1220282264;
                    }
                }

                long var98 = var66;
                var5 = var98 + 1L;
                var5 = var98 * var5;
                var7 = var98 + 2L;
                var5 *= var7;
                long var99 = var98 + 3L;
                var5 *= var99;
                long var100 = var5 & 7L;
                long var179;
                var3 = (var179 = var100 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                if (var3 == 0) {
                    AssertionError var102 = new AssertionError();
                    throw var102;
                }
                break label197;
            }

            Object var97 = null;
            var66 -= 1817434809;
            var66 -= -1878444076;
            var66 &= 1148873057;
            var66 ^= 1629328459;
            return (Za)var97;
        }

        IllegalArgumentException var103 = new IllegalArgumentException();
        throw var103;
    }

    private void P(lH_3 var1, float var2, int var3) {
        int var58 = 0;
        label86: {
            int var36;
            int var5 = System.identityHashCode(this);
            sN_2 var6 = this.SG;
            int var57 = var6.r();
            r_2 var7 = this.bC;
            vU var8 = vU.COVER;
            boolean var59 = var7.TJ(var8);
            int var73 = var5 + 1;
            int var74 = var5 * var73;
            int var9 = var5 + 2;
            int var75 = var74 * var9;
            var9 = var5 + 3;
            int var76 = var75 * var9;
            int var77 = var76 & 7;
            label85:
            if (var77 == 0) {
                var36 = var3 & 188812342;
                var36 ^= -409259338;
                Integer var78 = var36;
                if (var78 == null) {
                    break label86;
                }

                label89: {
                    if (var59) {
                        var36 *= 617593301;
                        var36 -= 1881927689;
                        var36 |= 439651034;
                        var36 ^= 104205415;
                        Integer var60 = var36;
                        if (var60 == null) {
                            break label86;
                        }

                        if (var57 != 0) {
                            var36 *= -156651255;
                            var36 >>= 21;
                            var36 -= -1291347443;
                            var36 ^= 1605153939;
                            long var61 = var36;
                            long var86 = var61 + 1L;
                            long var87 = var61 * var86;
                            long var11 = var61 + 2L;
                            long var88 = var87 * var11;
                            long var62 = var61 + 3L;
                            long var89 = var88 * var62;
                            long var63 = var89 & 7L;
                            long var95;
                            int var64 = (var95 = var63 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                            if (var64 != 0) {
                                break label86;
                            }

                            var58 = var57;
                            switch (var36) {
                                case -601648652:
                                default:
                                    var36 ^= -917798405;
                                    break label89;
                                case 324325813:
                                    var36 ^= -1855132578;
                                    var36 ^= 189758068;
                                    break label89;
                                case 1511728725:
                                    var36 ^= -309580102;
                                    break label89;
                            }
                        }

                        var36 |= 950180961;
                        var36 -= 16923949;
                        var36 &= 1754397094;
                        var36 ^= -738002206;
                    } else {
                        switch (var36) {
                            case -1251429624:
                            default:
                                var36 ^= -446173878;
                                break;
                            case -321243468:
                                var36 += 237234030;
                                var36 ^= 1316840512;
                                break;
                            case 577341860:
                                var36 ^= -1803308177;
                        }
                    }

                    Integer var65 = var36;
                    if (var65 == null) {
                        break label86;
                    }

                    Oo var66 = var1.x();
                    int var67 = var66.E();
                    int var79 = var5 + 1;
                    int var80 = var5 * var79;
                    int var81 = var80 & 1;
                    if (var81 != 0) {
                        var36 >>>= 5;
                        var36 ^= -142483898;
                        break label85;
                    }

                    var36 ^= -1623744082;
                    var36 ^= 1430182386;
                    Integer var82 = var36;
                    if (var82 == null) {
                        break label86;
                    }

                    var58 = var67;
                    var36 -= 1071789738;
                    var36 ^= -1211069429;
                }

                long var68 = var36;
                long var90 = var68 + 1L;
                long var91 = var68 * var90;
                long var94 = var68 + 2L;
                long var92 = var91 * var94;
                long var69 = var68 + 3L;
                long var93 = var92 * var69;
                long var70 = var93 & 7L;
                long var96;
                int var71 = (var96 = var70 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                if (var71 != 0) {
                    break label86;
                }

                int var72 = this.rv;
                Integer var48 = var5;
                if (var48 != null) {
                    var36 = switch (var36) {
                        case -1988671585 -> {
                            var36 &= -1170503745;
                            var36 &= 74043996;
                            var36 *= -2054459971;
                            var36 |= 258664619;
                            yield var36 ^ 1508660656;
                        }
                        default -> var36 ^ -989453593;
                        case -920439775 -> var36 ^ -256774551;
                    };
                    int var49 = var36 + 1;
                    var49 = var36 * var49;
                    var49 &= 1;
                    if (var49 == 0) {
                        float var52 = -var2;
                        float var53 = var52 * 5.0F;
                        double var83 = var53;
                        double var84 = Math.exp(var83);
                        float var54 = (float)var84;
                        float var55 = 1.0F - var54;
                        var49 = DP.Bp(var72, var58, var55);
                        this.rv = var49;
                        return;
                    }
                    break label86;
                }

                var36 += -1794353697;
                var36 += 1537986913;
                var36 <<= 2;
                var36 |= -36251091;
                var36 ^= 265961192;
            } else {
                var36 = var3 ^ 1476845362;
                var36 *= -485735057;
                var36 ^= 991803490;
            }

            Integer var45 = var36;
            if (var45 != null) {
                AssertionError var47 = new AssertionError();
                throw var47;
            }
        }

        RuntimeException var46 = new RuntimeException();
        throw var46;
    }

    private void Ha(float var1, int var2) {
        boolean var140 = false;
        label193: {
            int var4 = System.identityHashCode(this);
            FX var5 = this.IL;
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var265;
            int var143 = (var265 = var6 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
            if (var143 != 0) {
                switch (var2) {
                    case 589402424:
                    default:
                        int var20 = var2 ^ 458868744;
                        break;
                    case 674657812:
                        int var19 = var2 ^ 764862387;
                        break;
                    case 1952763870:
                        int var3 = var2 + 1956615050;
                        var3 *= -988162097;
                        var3 |= -819092041;
                        var3 ^= 1858587832;
                }
            } else {
                label213: {
                    int var21 = var2 & -2060559956;
                    var21 *= -803415563;
                    var21 += -1101309929;
                    var21 ^= 1912359984;
                    Integer var144 = var21;
                    if (var144 == null) {
                        break label193;
                    }

                    label188: {
                        if (var5 != null) {
                            var21 |= -1398169165;
                            var21 ^= 1498477164;
                            Integer var133 = var21;
                            if (var133 == null) {
                                break label193;
                            }

                            var5 = this.IL;
                            Integer var145 = var4;
                            if (var145 == null) {
                                var21 >>>= 20;
                                var21 &= -1221480167;
                                var21 -= 817398118;
                                var21 &= -2077059495;
                                var21 ^= 905471750;
                                break label213;
                            }

                            var21 >>>= 21;
                            var21 *= -1024572047;
                            var21 ^= -117903828;
                            int var146 = var21 + 1;
                            int var147 = var21 * var146;
                            int var148 = var147 & 1;
                            if (var148 != 0) {
                                break label193;
                            }

                            boolean var135 = var5.playing();
                            if (var135) {
                                var21 -= 1684112682;
                                var21 ^= 1559520420;
                                long var136 = var21;
                                long var7 = var136 + 1L;
                                var7 = var136 * var7;
                                long var9 = var136 + 2L;
                                var7 *= var9;
                                long var137 = var136 + 3L;
                                var7 *= var137;
                                long var138 = var7 & 7L;
                                long var266;
                                int var139 = (var266 = var138 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                                if (var139 != 0) {
                                    break label193;
                                }

                                var140 = true;
                                switch (var21) {
                                    case -2132524221:
                                    default:
                                        var21 ^= 746495403;
                                        break label188;
                                    case -1617596229:
                                        var21 &= 39265407;
                                        var21 *= -787555439;
                                        var21 -= 391044004;
                                        var21 += 1445592154;
                                        var21 ^= 1522979023;
                                        break label188;
                                    case -688021324:
                                        var21 ^= 309068690;
                                        break label188;
                                }
                            }

                            var21 >>>= 5;
                            var21 |= -1435196698;
                            var21 += 1677626785;
                            var21 <<= 12;
                            var21 ^= 1008871136;
                        } else {
                            var21 ^= -1688247138;
                            var21 ^= 1081383261;
                        }

                        var140 = false;
                        switch (var21) {
                            case -1651072039:
                                var21 ^= -215557644;
                                break;
                            case -395651360:
                                var21 += -1548662009;
                                var21 += -67589140;
                                var21 ^= -1085487555;
                                break;
                            case 543550816:
                            default:
                                var21 ^= 1855232376;
                        }
                    }

                    var6 = var21;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var267;
                    int var151 = (var267 = var6 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                    if (var151 != 0) {
                        break label193;
                    }

                    boolean var141 = var140;
                    float var152 = -var1;
                    int var162 = var4 + 1;
                    var162 = var4 * var162;
                    var162 &= 1;
                    if (var162 != 0) {
                        var21 |= 138196747;
                        var21 ^= -331249398;
                        var21 ^= 453029457;
                        var21 ^= 2043144627;
                    } else {
                        var21 = switch (var21) {
                            case -1032803167 -> var21 ^ 461136549;
                            case 928517102 -> {
                                var21 ^= 613263716;
                                var21 ^= -506878311;
                                var21 |= 1894410888;
                                var21 += 721278009;
                                yield var21 ^ 937637378;
                            }
                            default -> var21 ^ -1015212850;
                        };
                        float var165;
                        if (var140) {
                            var21 *= -752512093;
                            var21 ^= -1555586852;
                            var165 = 16.0F;
                            switch (var21) {
                                case -2075400546:
                                    var21 -= -1425804722;
                                    var21 ^= 1219903373;
                                    break;
                                case -1177473801:
                                default:
                                    var21 ^= -982957630;
                                    break;
                                case 512083427:
                                    var21 ^= 1221339535;
                            }
                        } else {
                            var21 &= -1069894051;
                            var21 -= 85835962;
                            var21 *= 1900529369;
                            var21 ^= 566509346;
                            var165 = 7.0F;
                            var21 >>>= 3;
                            var21 += 1901492794;
                            var21 ^= -415214382;
                        }

                        int var175 = var21 + 1;
                        int var176 = var21 * var175;
                        int var177 = var176 & 1;
                        if (var177 != 0) {
                            break label193;
                        }

                        float var153 = var152 * var165;
                        double var154 = var153;
                        double var155 = Math.exp(var154);
                        float var156 = (float)var155;
                        float var157 = 1.0F - var156;
                        long var166 = var4;
                        long var189 = var166 + 1L;
                        var189 = var166 * var189;
                        long var167 = var189 & 1L;
                        long var268;
                        var162 = (var268 = var167 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                        if (var162 != 0) {
                            var21 += -1698024372;
                            var21 -= -940937241;
                            var21 <<= 9;
                            var21 ^= 316339463;
                        } else {
                            var21 ^= 1530541290;
                            var21 -= -641405350;
                            var21 &= 481634758;
                            var21 ^= -689848687;
                            Integer var169 = var21;
                            if (var169 == null) {
                                break label193;
                            }

                            float var158 = var157;
                            byte var170 = 0;
                            int var171 = var170;
                            var21 |= -788571325;
                            var21 |= -2117399130;
                            var21 >>= 25;
                            var21 *= 860894891;
                            var21 ^= -832218133;

                            while (true) {
                                var8 = var21;
                                long var10 = var8 + 1L;
                                var10 = var8 * var10;
                                long var12 = var8 + 2L;
                                var10 *= var12;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var269;
                                int var181 = (var269 = var8 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                                if (var181 != 0) {
                                    break label193;
                                }

                                float[] var182 = this.i;
                                Integer var191 = var4;
                                if (var191 == null) {
                                    var21 &= -1599360204;
                                    var21 *= 835691565;
                                    var21 ^= 1548594917;
                                    var21 ^= -1096659662;
                                    break;
                                }

                                var21 >>= 1;
                                var21 ^= -28041512;
                                int var183 = var182.length;
                                if (var171 >= var183) {
                                    var21 >>>= 20;
                                    var21 >>= 25;
                                    var21 &= 1916232007;
                                    var21 ^= -1727307920;
                                    return;
                                }

                                var21 &= -886378844;
                                var21 += -1506720258;
                                var21 *= 1401282039;
                                var21 ^= 1818896069;
                                Integer var184 = var21;
                                if (var184 == null) {
                                    break label193;
                                }

                                float var185 = 0.16F;
                                Integer var192 = var4;
                                if (var192 == null) {
                                    var21 *= -1698223401;
                                    var21 *= 1233908039;
                                    var21 ^= 39234607;
                                    var21 ^= 352150175;
                                    break;
                                }
                                var21 = switch (var21) {
                                    case -1294861400 -> var21 ^ 126010375;
                                    default -> var21 ^ -279764053;
                                    case 598241623 -> {
                                        var21 -= -1188074958;
                                        yield var21 ^ -1930759988;
                                    }
                                };
                                Integer var193 = var21;
                                if (var193 == null) {
                                    break label193;
                                }

                                float var209;
                                if (var141) {
                                    var21 ^= 876321536;
                                    var21 |= -1000515415;
                                    var21 += -71983281;
                                    var21 -= 232846303;
                                    var21 ^= -718190266;
                                    int var194 = var21 + 1;
                                    int var195 = var21 * var194;
                                    int var216 = var21 + 2;
                                    int var196 = var195 * var216;
                                    int var217 = var21 + 3;
                                    int var197 = var196 * var217;
                                    int var198 = var197 & 7;
                                    if (var198 != 0) {
                                        break label193;
                                    }

                                    double var199 = this.W;
                                    int var11 = var4 + 1;
                                    var11 = var4 * var11;
                                    var11 &= 1;
                                    if (var11 != 0) {
                                        var21 ^= 1843265911;
                                        var21 >>>= 12;
                                        var21 &= -1564974361;
                                        var21 ^= -1309002815;
                                        break;
                                    }

                                    var21 *= 1832991697;
                                    var21 &= -1732334000;
                                    var21 ^= 1499061074;
                                    Integer var227 = var21;
                                    if (var227 == null) {
                                        break label193;
                                    }

                                    double var228 = var171;
                                    double var229 = var228 * 1.9;
                                    double var230 = 6.1 + var229;
                                    double var231 = var199 * var230;
                                    float[] var13 = this.U;
                                    float var253 = var13[var171];
                                    double var254 = var253;
                                    double var232 = var231 + var254;
                                    double var233 = Math.sin(var232);
                                    float var234 = (float)var233;
                                    double var244 = var171;
                                    double var245 = var244 * 2.6;
                                    double var246 = 9.7 + var245;
                                    double var247 = var199 * var246;
                                    float[] var14 = this.U;
                                    float var262 = var14[var171];
                                    double var263 = var262;
                                    double var264 = var263 * 1.7;
                                    double var248 = var247 + var264;
                                    double var249 = Math.sin(var248);
                                    float var250 = (float)var249;
                                    double var255 = var171;
                                    double var256 = var255 * 0.7;
                                    double var257 = 2.3 + var256;
                                    double var200 = var199 * var257;
                                    var13 = this.U;
                                    float var259 = var13[var171];
                                    double var260 = var259;
                                    double var261 = var260 * 0.6;
                                    double var201 = var200 + var261;
                                    double var202 = Math.sin(var201);
                                    float var203 = (float)var202;
                                    float var218 = 0.32F * var234;
                                    float var219 = 0.5F + var218;
                                    float var235 = 0.22F * var250;
                                    float var220 = var219 + var235;
                                    float var204 = 0.18F * var203;
                                    float var205 = var220 + var204;
                                    float var206 = TP.S(var205);
                                    float var207 = 0.7F * var206;
                                    float var208 = 0.3F + var207;
                                    var209 = var208;
                                    var21 -= 433869035;
                                    var21 >>>= 24;
                                    var21 ^= 1544226724;
                                } else {
                                    var21 = switch (var21) {
                                        case -1444910940 -> var21 ^ 1544209114;
                                        default -> var21 ^ 2114356677;
                                        case -426510359 -> {
                                            var21 += 2012273082;
                                            var21 &= -926232780;
                                            yield var21 ^ -1669326446;
                                        }
                                    };
                                    Integer var221 = var21;
                                    if (var221 == null) {
                                        break label193;
                                    }

                                    var209 = var185;
                                    var21 &= -595095941;
                                    var21 ^= -756581254;
                                    var21 ^= 1525478212;
                                }

                                var10 = var21;
                                var12 = var10 + 1L;
                                var12 = var10 * var12;
                                var10 = var12 & 1L;
                                long var270;
                                int var186 = (var270 = var10 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                                if (var186 != 0) {
                                    break label193;
                                }

                                float[] var187 = this.i;
                                float var224 = var187[var171];
                                float[] var236 = this.i;
                                float var237 = var236[var171];
                                float var210 = var209 - var237;
                                float var211 = var210 * var158;
                                int var238 = var4 + 1;
                                int var239 = var4 * var238;
                                int var240 = var239 & 1;
                                if (var240 != 0) {
                                    var21 += -892272600;
                                    var21 >>>= 3;
                                    var21 <<= 15;
                                    var21 ^= 1904832775;
                                    break;
                                }

                                var21 += -2124871449;
                                var21 ^= -940172975;
                                var21 ^= -1483544694;
                                int var241 = var21 + 1;
                                int var242 = var21 * var241;
                                int var243 = var242 & 1;
                                if (var243 != 0) {
                                    break label193;
                                }

                                float var212 = var224 + var211;
                                var187[var171] = var212;
                                int var188 = var171 + 1;
                                var171 = var188;
                                var21 -= 509477494;
                                var21 ^= 2109915319;
                                var21 ^= -412158441;
                            }
                        }
                    }
                }
            }

            UnsupportedOperationException var131 = new UnsupportedOperationException();
            throw var131;
        }

        RuntimeException var132 = new RuntimeException();
        throw var132;
    }

    private void C(float var1, int var2) {
        boolean var201 = false;
        float var211 = 0.0F;
        float var236 = 0.0F;
        XF var283 = null;
        XF var286 = null;
        XF var289 = null;
        float var302 = 0.0F;
        float var312 = 0.0F;
        label323: {
            int var40;
            int var4 = System.identityHashCode(this);
            Lk var5 = this.pw;
            Lk var6 = Lk.EXPANDED;
            long var7 = var4;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            var7 = var9 & 1L;
            long var394;
            int var243 = (var394 = var7 - 0L) == 0L ? 0 : (var394 < 0L ? -1 : 1);
            label322:
            if (var243 == 0) {
                label319: {
                    var40 = var2 - 402388624;
                    var40 |= -39001921;
                    var40 -= 936670438;
                    var40 ^= -1422366497;
                    if (var5 == var6) {
                        var40 >>>= 19;
                        var40 |= -929738707;
                        var40 ^= 1022494702;
                        long var197 = var40;
                        var7 = var197 + 1L;
                        var7 = var197 * var7;
                        long var198 = var7 & 1L;
                        long var395;
                        int var199 = (var395 = var198 - 0L) == 0L ? 0 : (var395 < 0L ? -1 : 1);
                        if (var199 != 0) {
                            break label323;
                        }

                        FX var200 = this.IL;
                        int var221 = var4 + 1;
                        int var222 = var4 * var221;
                        int var246 = var4 + 2;
                        int var223 = var222 * var246;
                        int var247 = var4 + 3;
                        int var224 = var223 * var247;
                        int var225 = var224 & 7;
                        if (var225 != 0) {
                            var40 -= -697885162;
                            var40 ^= -1015520541;
                            break label322;
                        }

                        var40 |= 1579263371;
                        var40 &= -1792900212;
                        var40 &= -2131791403;
                        var40 ^= -836486186;
                        var40 ^= 18244972;
                        Integer var226 = var40;
                        if (var226 == null) {
                            break label323;
                        }

                        if (var200 != null) {
                            var40 = switch (var40) {
                                default -> var40 ^ -1635578155;
                                case -363511818 -> var40 ^ 279178839;
                                case 1326473018 -> {
                                    var40 |= 1999424824;
                                    var40 |= 1437246577;
                                    var40 *= -814170837;
                                    yield var40 ^ -676603123;
                                }
                            };
                            var201 = true;
                            var40 += -905577631;
                            var40 &= -1887938158;
                            var40 *= -1737537641;
                            var40 ^= 1212327340;
                            break label319;
                        }

                        var40 |= -936458780;
                        var40 <<= 22;
                        var40 &= -278773826;
                        var40 ^= 1955349475;
                    } else {
                        var40 >>= 21;
                        var40 *= 816784149;
                        var40 -= 1703784466;
                        var40 ^= -758604206;
                    }

                    var201 = false;
                    switch (var40) {
                        case -1685306397:
                            var40 >>= 17;
                            var40 &= -679267471;
                            var40 ^= 1496505324;
                            break;
                        case 1573413667:
                            var40 ^= -5258833;
                            break;
                        case 1986035497:
                        default:
                            var40 ^= -165503447;
                    }
                }

                int var227 = var40 | -319417067;
                int var228 = var227 ^ -2132132874;
                float var229 = this.eC(var228);
                int var248 = var40 ^ 222491541;
                int var249 = var248 ^ -370705464;
                float var250 = this.bJ(var249);
                int var8 = var4 + 1;
                var8 = var4 * var8;
                var8 &= 1;
                label308:
                if (var8 == 0) {
                    var40 += 1438432200;
                    var40 ^= 316213335;
                    var8 = var40 + 1;
                    var8 = var40 * var8;
                    var8 &= 1;
                    if (var8 != 0) {
                        break label323;
                    }

                    label327: {
                        var283 = this.fK;
                        if (var201) {
                            var40 *= 1313116199;
                            var40 *= 156254197;
                            var40 *= 828551853;
                            var40 ^= 644591415;
                            var9 = var40;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var396;
                            int var296 = (var396 = var9 - 0L) == 0L ? 0 : (var396 < 0L ? -1 : 1);
                            if (var296 != 0) {
                                break label323;
                            }

                            float var297 = var250 - 32.0F;
                            int var10 = var40 - -1925547663;
                            var10 ^= -1729631964;
                            var10 += -936534696;
                            var10 &= -712102017;
                            var10 ^= -1634191364;
                            boolean var298 = this.qA(var297, var229, var10);
                            Integer var338 = var4;
                            if (var338 == null) {
                                switch (var40) {
                                    case -1282899076:
                                        var40 ^= 639575746;
                                        break label308;
                                    case -30159342:
                                        var40 -= 222238514;
                                        var40 ^= 764211198;
                                        break label308;
                                    case 502610346:
                                    default:
                                        var40 ^= -634941756;
                                        break label308;
                                }
                            }

                            var40 *= -1309747673;
                            var40 |= -737144028;
                            var40 >>>= 19;
                            var40 ^= -1150001413;
                            if (var298) {
                                var40 &= -225988508;
                                var40 ^= 767994371;
                                var9 = var40;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                var9 = var11 & 1L;
                                long var397;
                                int var301 = (var397 = var9 - 0L) == 0L ? 0 : (var397 < 0L ? -1 : 1);
                                if (var301 != 0) {
                                    break label323;
                                }

                                var302 = 1.0F;
                                var40 ^= 728384712;
                                var40 |= 2066245463;
                                var40 += 2145078327;
                                var40 ^= 1492949363;
                                break label327;
                            }

                            switch (var40) {
                                case -1150008027:
                                    var40 *= -740692673;
                                    var40 *= 255157989;
                                    var40 &= 249959410;
                                    var40 ^= -1325191411;
                                    break;
                                case -144247526:
                                default:
                                    var40 ^= 2056515271;
                                    break;
                                case 1009043274:
                                    var40 ^= 994495699;
                            }
                        } else {
                            var40 -= -1916258392;
                            var40 &= 631781926;
                            var40 >>>= 6;
                            var40 *= -490550365;
                            var40 ^= 539833015;
                        }

                        Integer var339 = var40;
                        if (var339 == null) {
                            break label323;
                        }

                        var302 = 0.0F;
                        var40 &= -140451690;
                        var40 ^= -1864858301;
                    }

                    long var340 = var40;
                    long var12 = var340 + 1L;
                    var12 = var340 * var12;
                    long var14 = var340 + 2L;
                    var12 *= var14;
                    var340 += 3L;
                    var12 *= var340;
                    var340 = var12 & 7L;
                    long var398;
                    int var343 = (var398 = var340 - 0L) == 0L ? 0 : (var398 < 0L ? -1 : 1);
                    if (var343 != 0) {
                        break label323;
                    }

                    var283.H(var302);
                    Integer var284 = var4;
                    label295:
                    if (var284 != null) {
                        var40 >>>= 1;
                        var40 -= 1547930700;
                        var40 &= 713965142;
                        var40 &= -444907204;
                        var40 ^= -1523837290;
                        var284 = var40;
                        if (var284 == null) {
                            break label323;
                        }

                        label331: {
                            var286 = this.w;
                            if (var201) {
                                var40 |= 563248178;
                                var40 |= -1119666234;
                                var40 += -512428097;
                                var40 &= 628263443;
                                var40 ^= -1103994657;
                                Integer var303 = var40;
                                if (var303 == null) {
                                    break label323;
                                }

                                int var304 = var40 << 25;
                                int var305 = var304 & -1271626372;
                                int var306 = var305 ^ -1701560927;
                                boolean var307 = this.qA(var250, var229, var306);
                                int var344 = var4 + 1;
                                int var345 = var4 * var344;
                                int var364 = var4 + 2;
                                int var346 = var345 * var364;
                                var364 = var4 + 3;
                                int var347 = var346 * var364;
                                int var348 = var347 & 7;
                                if (var348 != 0) {
                                    var40 |= -804055623;
                                    var40 |= -1307679569;
                                    var40 *= 183119477;
                                    var40 ^= 1916792981;
                                    break label295;
                                }
                                var40 = switch (var40) {
                                    case -1659747993 -> var40 ^ -1101977120;
                                    case -1152228658 -> {
                                        var40 += 2112331093;
                                        var40 *= -366063929;
                                        yield var40 ^ 1705956942;
                                    }
                                    default -> var40 ^ 285722499;
                                };
                                int var349 = var40 + 1;
                                int var350 = var40 * var349;
                                var364 = var40 + 2;
                                int var351 = var350 * var364;
                                var364 = var40 + 3;
                                int var352 = var351 * var364;
                                int var353 = var352 & 7;
                                if (var353 != 0) {
                                    break label323;
                                }

                                if (var307) {
                                    var40 = switch (var40) {
                                        default -> var40 ^ 2058377051;
                                        case 116829572 -> var40 ^ -1369134070;
                                        case 1237586811 -> {
                                            var40 += -2146278410;
                                            var40 |= 728161692;
                                            var40 += -655998779;
                                            var40 -= 1691432027;
                                            yield var40 ^ -1184021175;
                                        }
                                    };
                                    var9 = var40;
                                    long var368 = var9 + 1L;
                                    long var369 = var9 * var368;
                                    long var390 = var9 + 2L;
                                    long var370 = var369 * var390;
                                    var9 += 3L;
                                    long var371 = var370 * var9;
                                    var9 = var371 & 7L;
                                    long var399;
                                    int var311 = (var399 = var9 - 0L) == 0L ? 0 : (var399 < 0L ? -1 : 1);
                                    if (var311 != 0) {
                                        break label323;
                                    }

                                    var312 = 1.0F;
                                    var40 ^= -1613964281;
                                    var40 <<= 26;
                                    var40 ^= 680260669;
                                    break label331;
                                }

                                var40 &= -576833010;
                                var40 *= 1679187307;
                                var40 &= 1066673712;
                                var40 >>= 12;
                                var40 ^= 2066009535;
                            } else {
                                var40 -= -26002684;
                                var40 *= 987396311;
                                var40 ^= 26292783;
                            }

                            var340 = var40;
                            var12 = var340 + 1L;
                            var12 = var340 * var12;
                            var14 = var340 + 2L;
                            var12 *= var14;
                            var340 += 3L;
                            var12 *= var340;
                            var340 = var12 & 7L;
                            long var400;
                            int var357 = (var400 = var340 - 0L) == 0L ? 0 : (var400 < 0L ? -1 : 1);
                            if (var357 != 0) {
                                break label323;
                            }

                            var312 = 0.0F;
                            var40 |= 884644331;
                            var40 &= 875191950;
                            var40 &= -224541420;
                            var40 |= -1185824528;
                            var40 ^= 902967497;
                        }

                        Integer var358 = var40;
                        if (var358 == null) {
                            break label323;
                        }

                        var286.H(var312);
                        var284 = var4;
                        if (var284 == null) {
                            switch (var40) {
                                case -1936985027:
                                    var40 += 396779931;
                                    var40 -= -57250813;
                                    var40 |= -448884836;
                                    var40 += 1521495393;
                                    var40 ^= -1626848224;
                                    break;
                                case -481764961:
                                default:
                                    var40 ^= -744403913;
                                    break;
                                case -324281147:
                                    var40 ^= -1003531175;
                            }
                        } else {
                            label358: {
                                var40 = switch (var40) {
                                    case -1936985027 -> {
                                        var40 ^= -1384101931;
                                        var40 -= -1246744483;
                                        var40 ^= 861778178;
                                        var40 &= 1377752607;
                                        yield var40 ^ -1143828857;
                                    }
                                    case -910795925 -> var40 ^ 1922419443;
                                    default -> var40 ^ 2022949327;
                                };
                                var284 = var40;
                                if (var284 == null) {
                                    break label323;
                                }

                                label275: {
                                    var289 = this.Y;
                                    if (var201) {
                                        var40 = switch (var40) {
                                            case -338387826 -> {
                                                var40 ^= -808302708;
                                                var40 &= 993618586;
                                                var40 &= -406331367;
                                                yield var40 ^ 228343925;
                                            }
                                            case -161265607 -> var40 ^ -205023207;
                                            default -> var40 ^ -1408329402;
                                        };
                                        float var251 = var250 + 32.0F;
                                        int var313 = var40 * -1051327921;
                                        int var314 = var313 - 1767996022;
                                        int var315 = var314 ^ 814067204;
                                        boolean var230 = this.qA(var251, var229, var315);
                                        var9 = var4;
                                        long var372 = var9 + 1L;
                                        var372 = var9 * var372;
                                        long var391 = var9 + 2L;
                                        var372 *= var391;
                                        var9 += 3L;
                                        var372 *= var9;
                                        var9 = var372 & 7L;
                                        long var401;
                                        int var252 = (var401 = var9 - 0L) == 0L ? 0 : (var401 < 0L ? -1 : 1);
                                        if (var252 != 0) {
                                            switch (var40) {
                                                case -1588803450:
                                                default:
                                                    var40 ^= 1467041924;
                                                    break label358;
                                                case 765198453:
                                                    var40 |= 325860450;
                                                    var40 ^= -455117756;
                                                    var40 >>= 9;
                                                    var40 ^= 580241594;
                                                    break label358;
                                                case 1807365674:
                                                    var40 ^= -348223502;
                                                    break label358;
                                            }
                                        }

                                        var40 <<= 29;
                                        var40 >>>= 16;
                                        var40 &= 1597771467;
                                        var40 ^= 1154114067;
                                        var9 = var40;
                                        var372 = var9 + 1L;
                                        var372 = var9 * var372;
                                        var391 = var9 + 2L;
                                        var372 *= var391;
                                        var9 += 3L;
                                        var372 *= var9;
                                        var9 = var372 & 7L;
                                        long var402;
                                        int var253 = (var402 = var9 - 0L) == 0L ? 0 : (var402 < 0L ? -1 : 1);
                                        if (var253 != 0) {
                                            break label323;
                                        }

                                        if (var230) {
                                            var40 *= -2136537033;
                                            var40 -= -1669652030;
                                            var40 ^= -1942349346;
                                            int var231 = var40 + 1;
                                            int var232 = var40 * var231;
                                            int var254 = var40 + 2;
                                            int var233 = var232 * var254;
                                            int var255 = var40 + 3;
                                            int var234 = var233 * var255;
                                            int var235 = var234 & 7;
                                            if (var235 != 0) {
                                                break label323;
                                            }

                                            var236 = 1.0F;
                                            switch (var40) {
                                                case -2141952123:
                                                default:
                                                    var40 ^= -1047839954;
                                                    break label275;
                                                case 1009561276:
                                                    var40 ^= -780646592;
                                                    break label275;
                                                case 1951371661:
                                                    var40 += -854246335;
                                                    var40 -= -113301309;
                                                    var40 >>= 21;
                                                    var40 >>= 21;
                                                    var40 ^= -534717370;
                                                    break label275;
                                            }
                                        }

                                        var40 ^= 720977294;
                                        var40 >>>= 14;
                                        var40 -= -1418506205;
                                        var40 >>= 23;
                                        var40 ^= -1068377881;
                                    } else {
                                        switch (var40) {
                                            case -338387826:
                                                var40 *= 611466165;
                                                var40 *= -781495577;
                                                var40 ^= -562399676;
                                                break;
                                            case 1501075879:
                                                var40 ^= 686203846;
                                                break;
                                            case 2127101040:
                                            default:
                                                var40 ^= -937125309;
                                        }
                                    }

                                    var236 = 0.0F;
                                    var40 *= 1865025771;
                                    var40 += 2056363818;
                                    var40 += 1210309925;
                                    var40 ^= -884627537;
                                }

                                int var256 = var40 + 1;
                                int var257 = var40 * var256;
                                int var258 = var257 & 1;
                                if (var258 != 0) {
                                    break label323;
                                }

                                var289.H(var236);
                                XF var237 = this.a;
                                var7 = var4;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                long var380 = var7 + 2L;
                                var9 *= var380;
                                var7 += 3L;
                                var9 *= var7;
                                var7 = var9 & 7L;
                                long var403;
                                int var262 = (var403 = var7 - 0L) == 0L ? 0 : (var403 < 0L ? -1 : 1);
                                label263:
                                if (var262 == 0) {
                                    label338: {
                                        var40 += -1634008018;
                                        var40 *= 1116825079;
                                        var40 *= -1707720949;
                                        var40 ^= -89525232;
                                        if (var201) {
                                            var40 += 1707069657;
                                            var40 -= -1106443160;
                                            var40 += -364898060;
                                            var40 ^= -1156668061;
                                            int var202 = var40 + 1;
                                            int var203 = var40 * var202;
                                            int var204 = var203 & 1;
                                            if (var204 != 0) {
                                                break label323;
                                            }

                                            int var205 = var40 + -934740285;
                                            int var206 = var205 >> 9;
                                            int var207 = var206 | -1040253190;
                                            int var208 = var207 ^ -688353073;
                                            boolean var209 = this.U(var208);
                                            int var263 = var4 + 1;
                                            int var264 = var4 * var263;
                                            int var290 = var4 + 2;
                                            int var265 = var264 * var290;
                                            var290 = var4 + 3;
                                            int var266 = var265 * var290;
                                            int var267 = var266 & 7;
                                            if (var267 != 0) {
                                                var40 += 1379672716;
                                                var40 -= -863753380;
                                                var40 ^= -548961228;
                                                break label263;
                                            }

                                            var40 |= -388813137;
                                            var40 ^= 371740747;
                                            var40 *= 540346297;
                                            var40 ^= 1814433990;
                                            Integer var268 = var40;
                                            if (var268 == null) {
                                                break label323;
                                            }

                                            if (var209) {
                                                var40 ^= -54219532;
                                                var40 &= -549289507;
                                                var40 ^= -221009906;
                                                var7 = var40;
                                                var9 = var7 + 1L;
                                                var9 = var7 * var9;
                                                var380 = var7 + 2L;
                                                var9 *= var380;
                                                var7 += 3L;
                                                var9 *= var7;
                                                var7 = var9 & 7L;
                                                long var404;
                                                int var210 = (var404 = var7 - 0L) == 0L ? 0 : (var404 < 0L ? -1 : 1);
                                                if (var210 != 0) {
                                                    break label323;
                                                }

                                                var211 = 1.0F;
                                                var40 >>>= 8;
                                                var40 *= 1891335133;
                                                var40 *= 1941732421;
                                                var40 ^= 50240004;
                                                break label338;
                                            }

                                            var40 ^= -2032386827;
                                            var40 -= -1762547104;
                                            var40 -= 1738928869;
                                            var40 *= 411227467;
                                            var40 ^= -78389521;
                                        } else {
                                            var40 >>>= 3;
                                            var40 += 1380637815;
                                            var40 &= -785738766;
                                            var40 <<= 1;
                                            var40 ^= -1790194567;
                                        }

                                        Integer var272 = var40;
                                        if (var272 == null) {
                                            break label323;
                                        }

                                        var211 = 0.0F;
                                        var40 *= 368868627;
                                        var40 ^= -1865567194;
                                    }

                                    var7 = var40;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var380 = var7 + 2L;
                                    var9 *= var380;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var405;
                                    int var276 = (var405 = var7 - 0L) == 0L ? 0 : (var405 < 0L ? -1 : 1);
                                    if (var276 != 0) {
                                        break label323;
                                    }

                                    var237.H(var211);
                                    XF var212 = this.fK;
                                    float var213 = var212.N(var1);
                                    XF var214 = this.w;
                                    float var215 = var214.N(var1);
                                    XF var216 = this.Y;
                                    float var217 = var216.N(var1);
                                    XF var218 = this.a;
                                    float var219 = var218.N(var1);
                                    XF var220 = this.H;
                                    int var238 = var4 + 1;
                                    int var239 = var4 * var238;
                                    int var277 = var4 + 2;
                                    int var240 = var239 * var277;
                                    var4 += 3;
                                    int var241 = var240 * var4;
                                    var4 = var241 & 7;
                                    if (var4 == 0) {
                                        var40 |= -302454735;
                                        var40 ^= 88566907;
                                        var40 ^= -156594888;
                                        Integer var191 = var40;
                                        if (var191 != null) {
                                            float var192 = var220.N(var1);
                                            XF var193 = this.g;
                                            float var194 = var193.N(var1);
                                            XF var195 = this.Vu;
                                            float var196 = var195.N(var1);
                                            return;
                                        }
                                        break label323;
                                    }

                                    var40 -= -331125334;
                                    var40 ^= -590058099;
                                } else {
                                    switch (var40) {
                                        case -534717370:
                                            var40 &= 2138387207;
                                            var40 ^= -1118287592;
                                            break;
                                        case -219072885:
                                            var40 ^= 724571250;
                                            break;
                                        case 1582378713:
                                        default:
                                            var40 ^= 896763208;
                                    }
                                }
                            }
                        }
                    } else {
                        var40 &= 2073258375;
                        var40 |= 1382807477;
                        var40 ^= -1375490389;
                    }
                } else {
                    switch (var40) {
                        case -1900946772:
                            var40 &= -1270265990;
                            var40 ^= 1501109046;
                            break;
                        case -1723043320:
                            var40 ^= 1308535386;
                            break;
                        case -1330785186:
                        default:
                            var40 ^= -1753301294;
                    }
                }
            } else {
                switch (var2) {
                    case -2103674687:
                        var40 = var2 ^ -1712056993;
                        break;
                    case -1259541798:
                    default:
                        var40 = var2 ^ -1811008872;
                        break;
                    case 807312429:
                        var40 = var2 + -1405128278;
                        var40 |= 436319849;
                        var40 ^= 52946657;
                }
            }

            Integer var186 = var40;
            if (var186 != null) {
                AssertionError var188 = new AssertionError();
                throw var188;
            }
        }

        AssertionError var187 = new AssertionError();
        throw var187;
    }

    private void Nk(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        float var5 = this.YI;
        Integer var6 = var4;
        if (var6 == null) {
            int var46 = var2 - 962321286;
            var46 ^= -931784433;
        } else {
            label66: {
                label59: {
                    int var3 = var2 + 905918837;
                    var3 *= 812364607;
                    var3 ^= 1925888891;
                    var3 *= 1654273857;
                    var3 ^= 1874032254;
                    float var79;
                    int var56 = (var79 = var5 - 0.0F) == 0.0F ? 0 : (var79 < 0.0F ? -1 : 1);
                    if (var56 > 0) {
                        var3 = switch (var3) {
                            default -> var3 ^ 338778025;
                            case 121798292 -> {
                                var3 >>>= 24;
                                yield var3 ^ -1806645485;
                            }
                            case 1900318858 -> var3 ^ 169503941;
                        };
                        int var57 = var3 + 1;
                        int var58 = var3 * var57;
                        int var59 = var58 & 1;
                        if (var59 != 0) {
                            break label59;
                        }

                        var5 = this.YI;
                        long var63 = var4;
                        long var8 = var63 + 1L;
                        var8 = var63 * var8;
                        long var10 = var63 + 2L;
                        var8 *= var10;
                        long var64 = var63 + 3L;
                        var8 *= var64;
                        long var65 = var8 & 7L;
                        long var80;
                        int var66 = (var80 = var65 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                        if (var66 != 0) {
                            var3 += -1325790540;
                            var3 ^= 1911487791;
                            var3 |= -1338386155;
                            var3 ^= 371835980;
                            break label66;
                        }
                        var3 = switch (var3) {
                            case -1806645484 -> {
                                var3 &= -1287465204;
                                var3 += 1201126938;
                                var3 &= -2034449078;
                                var3 >>>= 4;
                                yield var3 ^ 1151985404;
                            }
                            default -> var3 ^ -1006044364;
                            case -558308064 -> var3 ^ 551227646;
                        };
                        var66 = var3 + 1;
                        var66 = var3 * var66;
                        var66 &= 1;
                        if (var66 != 0) {
                            break label59;
                        }

                        var5 -= var1;
                        this.YI = var5;
                        var3 |= 1428017820;
                        var3 *= 620864103;
                        var3 -= -648311712;
                        var3 ^= 1097423596;
                    } else {
                        var3 *= 1523784091;
                        var3 &= 1107676003;
                        var3 ^= 357143334;
                        var5 = this.PL;
                        float var70 = var1 * 16.0F;
                        long var7 = var4;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var81;
                        var4 = (var81 = var7 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            var3 *= 362778753;
                            var3 |= -514028884;
                            var3 ^= -1602886413;
                            var3 += -1794668966;
                            var3 ^= 1252314124;
                            break label66;
                        }

                        var3 -= -535070891;
                        var3 &= -22566582;
                        var3 -= 1548472035;
                        var3 ^= -1037754920;
                        Integer var50 = var3;
                        if (var50 == null) {
                            break label59;
                        }

                        float var51 = var5 + var70;
                        this.PL = var51;
                        var3 *= -1066164603;
                        var3 ^= 1012507048;
                        var3 ^= -1113842407;
                    }

                    var4 = var3 + 1;
                    var4 = var3 * var4;
                    var4 &= 1;
                    if (var4 == 0) {
                        return;
                    }
                }

                IllegalStateException var55 = new IllegalStateException();
                throw var55;
            }
        }

        IllegalArgumentException var48 = new IllegalArgumentException();
        throw var48;
    }

    @Override
    protected boolean vo(float var1, float var2, int var3, lH_3 var4) {
        label461: {
            int var5 = kS;
            var5 ^= 1832819115;
            int var7 = System.identityHashCode(this);
            long var8 = var7;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            long var12 = var8 + 2L;
            var10 *= var12;
            var8 += 3L;
            var10 *= var8;
            var8 = var10 & 7L;
            long var682;
            int var349 = (var682 = var8 - 0L) == 0L ? 0 : (var682 < 0L ? -1 : 1);
            if (var349 != 0) {
                var5 -= 280874174;
                var5 += 782527211;
                var5 &= 918135668;
                var5 ^= 1809871559;
            } else {
                label460: {
                    var5 <<= 9;
                    var5 += 1893975627;
                    var5 += 1605102388;
                    var5 ^= -625435666;
                    if (var3 == 0) {
                        var5 &= -1609870655;
                        var5 ^= -1889585961;
                        Integer var350 = var3;
                        if (var350 == null) {
                            break label461;
                        }

                        Lk var351 = this.pw;
                        long var9 = var7;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var683;
                        int var435 = (var683 = var9 - 0L) == 0L ? 0 : (var683 < 0L ? -1 : 1);
                        if (var435 != 0) {
                            var5 |= -648148290;
                            var5 -= -1363133723;
                            var5 ^= 1230923742;
                            break label460;
                        }

                        var5 *= 1664739923;
                        var5 ^= -384043306;
                        Lk var436 = Lk.EXPANDED;
                        if (var351 == var436) {
                            var5 *= -158855633;
                            var5 += 1865456627;
                            var5 *= -667351383;
                            var5 += 1397137123;
                            var5 ^= -1658366960;
                            int var352 = var3 + 1;
                            int var353 = var3 * var352;
                            int var437 = var3 + 2;
                            int var354 = var353 * var437;
                            int var438 = var3 + 3;
                            int var355 = var354 * var438;
                            int var356 = var355 & 7;
                            if (var356 != 0) {
                                break label461;
                            }

                            FX var357 = this.IL;
                            int var439 = var7 + 1;
                            int var440 = var7 * var439;
                            int var522 = var7 + 2;
                            int var441 = var440 * var522;
                            int var523 = var7 + 3;
                            int var442 = var441 * var523;
                            int var443 = var442 & 7;
                            if (var443 != 0) {
                                var5 -= -1159410332;
                                var5 *= -847326341;
                                var5 |= 928789811;
                                var5 &= -2056580902;
                                var5 ^= -55950507;
                                break label460;
                            }

                            var5 += 1903233634;
                            var5 ^= -743250304;
                            var9 = var3;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var684;
                            int var446 = (var684 = var9 - 0L) == 0L ? 0 : (var684 < 0L ? -1 : 1);
                            if (var446 != 0) {
                                break label461;
                            }

                            if (var357 != null) {
                                var5 *= -758319767;
                                var5 ^= -88626025;
                                int var358 = var3 + 1;
                                int var359 = var3 * var358;
                                int var447 = var3 + 2;
                                int var360 = var359 * var447;
                                int var448 = var3 + 3;
                                int var361 = var360 * var448;
                                int var362 = var361 & 7;
                                if (var362 != 0) {
                                    break label461;
                                }

                                If var363 = this.s;
                                Integer var449 = var7;
                                if (var449 == null) {
                                    var5 ^= -1880516162;
                                    var5 &= -173275863;
                                    var5 |= -125291597;
                                    var5 *= 1840122941;
                                    var5 ^= 1606346336;
                                    break label460;
                                }

                                var5 ^= 1475195005;
                                var5 &= -716978965;
                                var5 -= -2097811401;
                                var5 >>= 28;
                                var5 ^= 1126118272;
                                if (var363 != null) {
                                    var5 |= -1936851468;
                                    var5 -= -537247990;
                                    var5 <<= 30;
                                    var5 &= 1752122131;
                                    var5 ^= 1039850373;
                                    Lk var364 = Lk.EXPANDED;
                                    int var450 = var5 + 968182669;
                                    int var451 = var450 | -676631500;
                                    int var452 = var451 - -1228718265;
                                    int var453 = var452 ^ -1423039578;
                                    float var365 = this.MA(var364, var453);
                                    Integer var454 = var7;
                                    if (var454 == null) {
                                        switch (var5) {
                                            case -1299353587:
                                            default:
                                                var5 ^= 1452026745;
                                                break label460;
                                            case -457177224:
                                                var5 ^= 1681332817;
                                                break label460;
                                            case 2113592197:
                                                var5 *= -1463923035;
                                                var5 &= 266523142;
                                                var5 &= -940043194;
                                                var5 ^= 2139116487;
                                                break label460;
                                        }
                                    }

                                    var5 *= 1624964659;
                                    var5 *= 664702805;
                                    var5 *= 644889015;
                                    var5 *= 1490131659;
                                    var5 ^= -229116025;
                                    var9 = var3;
                                    var11 = var9 + 1L;
                                    var11 = var9 * var11;
                                    var9 = var11 & 1L;
                                    long var685;
                                    int var457 = (var685 = var9 - 0L) == 0L ? 0 : (var685 < 0L ? -1 : 1);
                                    if (var457 != 0) {
                                        break label461;
                                    }

                                    float var686;
                                    int var366 = (var686 = var365 - 0.6F) == 0.0F ? 0 : (var686 < 0.0F ? -1 : 1);
                                    if (var366 >= 0) {
                                        var5 += -900458892;
                                        var5 ^= -1283325868;
                                        int var367 = var5 + -2144016718;
                                        int var368 = var367 - -306137450;
                                        int var369 = var368 << 7;
                                        int var370 = var369 * 2122165883;
                                        int var371 = var370 ^ -1172415925;
                                        float var372 = this.eC(var371);
                                        int var458 = var5 << 9;
                                        int var459 = var458 >> 28;
                                        int var460 = var459 & 57919854;
                                        int var461 = var460 | -1287997303;
                                        int var462 = var461 ^ -646993126;
                                        float var463 = this.bJ(var462);
                                        float var524 = var463 - 32.0F;
                                        int var582 = var5 + 15861704;
                                        int var583 = var582 << 22;
                                        int var584 = var583 ^ -694927967;
                                        boolean var525 = this.qA(var524, var372, var584);
                                        int var585 = var7 + 1;
                                        int var586 = var7 * var585;
                                        int var627 = var7 + 2;
                                        int var587 = var586 * var627;
                                        int var628 = var7 + 3;
                                        int var588 = var587 * var628;
                                        int var589 = var588 & 7;
                                        if (var589 != 0) {
                                            var5 -= 681173857;
                                            var5 ^= 435911664;
                                            break label460;
                                        }

                                        var5 -= -1700058521;
                                        var5 <<= 29;
                                        var5 ^= 435593303;
                                        if (var525) {
                                            var5 *= 1636483679;
                                            var5 >>= 5;
                                            var5 ^= 245108293;
                                            var5 ^= 761339371;
                                            var5 ^= 1293691595;
                                            var10 = var3;
                                            var12 = var10 + 1L;
                                            var12 = var10 * var12;
                                            var10 = var12 & 1L;
                                            long var687;
                                            int var569 = (var687 = var10 - 0L) == 0L ? 0 : (var687 < 0L ? -1 : 1);
                                            if (var569 != 0) {
                                                break label461;
                                            }

                                            If var570 = this.s;
                                            var11 = this.wN;
                                            long var688;
                                            int var623 = (var688 = var11 - 3000L) == 0L ? 0 : (var688 < 0L ? -1 : 1);
                                            int var641 = var7 + 1;
                                            int var642 = var7 * var641;
                                            int var643 = var642 & 1;
                                            if (var643 == 0) {
                                                var5 = switch (var5) {
                                                    default -> var5 ^ 1561985101;
                                                    case -1869721065 -> {
                                                        var5 ^= -1063281947;
                                                        var5 |= 1298909119;
                                                        var5 -= -169025475;
                                                        var5 |= -126271785;
                                                        yield var5 ^ 392620954;
                                                    }
                                                    case 1754592913 -> var5 ^ 628323501;
                                                };
                                                var12 = var3;
                                                long var674 = var12 + 1L;
                                                var674 = var12 * var674;
                                                var12 = var674 & 1L;
                                                long var689;
                                                int var646 = (var689 = var12 - 0L) == 0L ? 0 : (var689 < 0L ? -1 : 1);
                                                if (var646 != 0) {
                                                    break label461;
                                                }

                                                Ar var626;
                                                if (var623 > 0) {
                                                    var5 -= 236025718;
                                                    var5 ^= 1840056115;
                                                    var5 *= -876910337;
                                                    var5 &= 144184464;
                                                    var5 ^= -1067441652;
                                                    Integer var624 = var3;
                                                    if (var624 == null) {
                                                        break label461;
                                                    }

                                                    Ar var625 = Ar.RESTART;
                                                    var12 = var7;
                                                    var674 = var12 + 1L;
                                                    var674 = var12 * var674;
                                                    var12 = var674 & 1L;
                                                    long var690;
                                                    int var649 = (var690 = var12 - 0L) == 0L ? 0 : (var690 < 0L ? -1 : 1);
                                                    if (var649 != 0) {
                                                        var5 ^= 2027787063;
                                                        var5 ^= -1567440417;
                                                        var5 -= -1789233326;
                                                        var5 -= -1723355506;
                                                        var5 ^= -1705174829;
                                                        break label460;
                                                    }

                                                    var5 |= -2053605131;
                                                    var5 ^= 1303252438;
                                                    var626 = var625;
                                                    switch (var5) {
                                                        case -2141817045:
                                                            var5 >>>= 30;
                                                            var5 >>= 28;
                                                            var5 ^= 566248;
                                                            var5 ^= 1395369609;
                                                            break;
                                                        case -1483184892:
                                                            var5 ^= -1088949625;
                                                            break;
                                                        case 798181173:
                                                        default:
                                                            var5 ^= -91999588;
                                                    }
                                                } else {
                                                    var5 *= 1324756293;
                                                    var5 *= 1072743925;
                                                    var5 &= 118729370;
                                                    var5 += 151008867;
                                                    var5 ^= -1406607751;
                                                    Ar var650 = Ar.PREVIOUS;
                                                    var13 = var7;
                                                    long var680 = var13 + 1L;
                                                    var680 = var13 * var680;
                                                    var13 = var680 & 1L;
                                                    long var691;
                                                    int var668 = (var691 = var13 - 0L) == 0L ? 0 : (var691 < 0L ? -1 : 1);
                                                    if (var668 != 0) {
                                                        var5 >>>= 28;
                                                        var5 *= 1504415829;
                                                        var5 &= 2037765858;
                                                        var5 -= -363395605;
                                                        var5 ^= 1813655440;
                                                        break label460;
                                                    }
                                                    var5 = switch (var5) {
                                                        case -2002995043 -> var5 ^ -9792728;
                                                        case -1574336886 -> {
                                                            var5 ^= 1247874390;
                                                            var5 &= -1608442882;
                                                            var5 += -1786932572;
                                                            yield var5 ^ 2097781656;
                                                        }
                                                        default -> var5 ^ -2132657904;
                                                    };
                                                    int var669 = var3 + 1;
                                                    int var670 = var3 * var669;
                                                    int var678 = var3 + 2;
                                                    int var671 = var670 * var678;
                                                    int var679 = var3 + 3;
                                                    int var672 = var671 * var679;
                                                    int var673 = var672 & 7;
                                                    if (var673 != 0) {
                                                        break label461;
                                                    }

                                                    var626 = var650;
                                                    switch (var5) {
                                                        case -193574695:
                                                        default:
                                                            var5 ^= -1108850856;
                                                            break;
                                                        case 964389447:
                                                            var5 ^= 1014467155;
                                                            break;
                                                        case 1215563032:
                                                            var5 |= 1758850162;
                                                            var5 ^= 1003939867;
                                                    }
                                                }

                                                int var651 = var3 + 1;
                                                int var652 = var3 * var651;
                                                int var653 = var652 & 1;
                                                if (var653 != 0) {
                                                    break label461;
                                                }

                                                var570.Wf(var626);
                                                var10 = var7;
                                                var12 = var10 + 1L;
                                                var12 = var10 * var12;
                                                var10 = var12 & 1L;
                                                long var692;
                                                int var573 = (var692 = var10 - 0L) == 0L ? 0 : (var692 < 0L ? -1 : 1);
                                                if (var573 == 0) {
                                                    var5 ^= -1125818245;
                                                    var5 -= -1471076702;
                                                    var5 ^= 2081172249;
                                                    XF var574 = this.H;
                                                    var574.v(-9.0F);
                                                    return true;
                                                }

                                                var5 |= -211328;
                                                var5 <<= 5;
                                                var5 |= 947470607;
                                                var5 ^= -2043040024;
                                            } else {
                                                var5 *= -458800793;
                                                var5 += -995167764;
                                                var5 *= -763052847;
                                                var5 |= -2028699384;
                                                var5 ^= -1099050374;
                                            }
                                            break label460;
                                        }

                                        var5 <<= 1;
                                        var5 *= -2032404209;
                                        var5 -= -1759148941;
                                        var5 ^= -2119030232;
                                        int var526 = var5 ^ 370740245;
                                        int var527 = var526 - 1470315170;
                                        int var528 = var527 - 465205752;
                                        int var529 = var528 ^ -1924805303;
                                        boolean var530 = this.qA(var463, var372, var529);
                                        int var590 = var7 + 1;
                                        int var591 = var7 * var590;
                                        int var592 = var591 & 1;
                                        if (var592 != 0) {
                                            var5 |= -1772145517;
                                            var5 |= -1854605780;
                                            var5 >>>= 20;
                                            var5 ^= -739544482;
                                            var5 ^= -1440010514;
                                            break label460;
                                        }

                                        var5 *= -1353305821;
                                        var5 ^= 856469770;
                                        if (var530) {
                                            var5 ^= 1580010053;
                                            var5 *= 249490555;
                                            var5 ^= -140437785;
                                            If var565 = this.s;
                                            var11 = var7;
                                            var13 = var11 + 1L;
                                            var13 = var11 * var13;
                                            var11 = var13 & 1L;
                                            long var693;
                                            int var620 = (var693 = var11 - 0L) == 0L ? 0 : (var693 < 0L ? -1 : 1);
                                            if (var620 == 0) {
                                                var5 |= -1094319421;
                                                var5 *= 896539729;
                                                var5 -= -1345346464;
                                                var5 *= 221914223;
                                                var5 ^= -1522434029;
                                                Ar var621 = Ar.TOGGLE;
                                                var565.Wf(var621);
                                                XF var566 = this.g;
                                                var566.v(-9.0F);
                                                return true;
                                            }

                                            var5 &= -1784516604;
                                            var5 *= -2099071137;
                                            var5 *= 1637302785;
                                            var5 ^= -22289465;
                                            break label460;
                                        }

                                        var5 *= 1341540171;
                                        var5 <<= 13;
                                        var5 ^= -1263639530;
                                        var10 = var3;
                                        var12 = var10 + 1L;
                                        var12 = var10 * var12;
                                        var10 = var12 & 1L;
                                        long var694;
                                        int var533 = (var694 = var10 - 0L) == 0L ? 0 : (var694 < 0L ? -1 : 1);
                                        if (var533 != 0) {
                                            break label461;
                                        }

                                        float var464 = var463 + 32.0F;
                                        int var534 = var7 + 1;
                                        int var535 = var7 * var534;
                                        int var536 = var535 & 1;
                                        if (var536 == 0) {
                                            var5 = switch (var5) {
                                                case -1048132586 -> {
                                                    var5 *= -262766335;
                                                    var5 += 2017099876;
                                                    var5 -= 703728762;
                                                    var5 &= 889209173;
                                                    yield var5 ^ 1050590259;
                                                }
                                                default -> var5 ^ -708234935;
                                                case 1512383436 -> var5 ^ 417475177;
                                            };
                                            var10 = var3;
                                            var12 = var10 + 1L;
                                            var12 = var10 * var12;
                                            var10 = var12 & 1L;
                                            long var695;
                                            int var539 = (var695 = var10 - 0L) == 0L ? 0 : (var695 < 0L ? -1 : 1);
                                            if (var539 != 0) {
                                                break label461;
                                            }

                                            int var540 = var5 << 28;
                                            int var541 = var540 * -63284395;
                                            int var542 = var541 ^ -23839327;
                                            boolean var373 = this.qA(var464, var372, var542);
                                            if (var373) {
                                                var5 ^= 2130662529;
                                                var5 ^= -1887516947;
                                                Integer var430 = var3;
                                                if (var430 == null) {
                                                    break label461;
                                                }

                                                If var431 = this.s;
                                                Ar var511 = Ar.NEXT;
                                                var431.Wf(var511);
                                                XF var432 = this.Vu;
                                                int var512 = var7 + 1;
                                                int var513 = var7 * var512;
                                                int var514 = var513 & 1;
                                                if (var514 == 0) {
                                                    var5 >>>= 17;
                                                    var5 >>>= 30;
                                                    var5 *= 169752355;
                                                    var5 ^= -534587967;
                                                    var9 = var3;
                                                    var11 = var9 + 1L;
                                                    var11 = var9 * var11;
                                                    var13 = var9 + 2L;
                                                    var11 *= var13;
                                                    var9 += 3L;
                                                    var11 *= var9;
                                                    var9 = var11 & 7L;
                                                    long var696;
                                                    int var518 = (var696 = var9 - 0L) == 0L ? 0 : (var696 < 0L ? -1 : 1);
                                                    if (var518 == 0) {
                                                        var432.v(-9.0F);
                                                        return true;
                                                    }
                                                    break label461;
                                                }

                                                var5 &= -393912423;
                                                var5 >>= 23;
                                                var5 += -988545501;
                                                var5 ^= -1126977996;
                                                break label460;
                                            }
                                            var5 = switch (var5) {
                                                case -232623872 -> var5 ^ -747031158;
                                                case 245300275 -> {
                                                    var5 *= -1473577299;
                                                    var5 += -749002416;
                                                    var5 *= 1409160741;
                                                    var5 |= -1744643427;
                                                    yield var5 ^ -509278902;
                                                }
                                                default -> var5 ^ 1964281084;
                                            };
                                            int var374 = var3 + 1;
                                            int var375 = var3 * var374;
                                            int var465 = var3 + 2;
                                            int var376 = var375 * var465;
                                            int var466 = var3 + 3;
                                            int var377 = var376 * var466;
                                            int var378 = var377 & 7;
                                            if (var378 != 0) {
                                                break label461;
                                            }

                                            int var379 = var5 >> 15;
                                            int var380 = var379 ^ 386293368;
                                            boolean var381 = this.U(var380);
                                            var9 = var7;
                                            var11 = var9 + 1L;
                                            var11 = var9 * var11;
                                            var9 = var11 & 1L;
                                            long var697;
                                            int var469 = (var697 = var9 - 0L) == 0L ? 0 : (var697 < 0L ? -1 : 1);
                                            if (var469 != 0) {
                                                var5 -= -351641247;
                                                var5 |= 1132293222;
                                                var5 ^= 381529777;
                                                break label460;
                                            }
                                            var5 = switch (var5) {
                                                case 405208725 -> {
                                                    var5 &= -1925536146;
                                                    var5 -= -2107270469;
                                                    var5 *= 186574699;
                                                    yield var5 ^ 524276970;
                                                }
                                                case 837591426 -> var5 ^ -983341265;
                                                default -> var5 ^ 1436555698;
                                            };
                                            if (var381) {
                                                var5 += 971764555;
                                                var5 ^= -1104988498;
                                                FX var382 = this.IL;
                                                var9 = var7;
                                                var11 = var9 + 1L;
                                                var11 = var9 * var11;
                                                var13 = var9 + 2L;
                                                var11 *= var13;
                                                var9 += 3L;
                                                var11 *= var9;
                                                var9 = var11 & 7L;
                                                long var698;
                                                int var473 = (var698 = var9 - 0L) == 0L ? 0 : (var698 < 0L ? -1 : 1);
                                                if (var473 != 0) {
                                                    switch (var5) {
                                                        case -1748499686:
                                                            var5 >>= 21;
                                                            var5 += 983048522;
                                                            var5 ^= 1129860559;
                                                            break label460;
                                                        case 451498451:
                                                        default:
                                                            var5 ^= 103729389;
                                                            break label460;
                                                        case 484434363:
                                                            var5 ^= -1745251829;
                                                            break label460;
                                                    }
                                                }

                                                var5 |= -343098436;
                                                var5 *= 1355377695;
                                                var5 ^= 1341744483;
                                                var5 &= 768835162;
                                                var5 ^= 897710294;
                                                int var474 = var3 + 1;
                                                int var475 = var3 * var474;
                                                int var543 = var3 + 2;
                                                int var476 = var475 * var543;
                                                int var544 = var3 + 3;
                                                int var477 = var476 * var544;
                                                int var478 = var477 & 7;
                                                if (var478 != 0) {
                                                    break label461;
                                                }

                                                boolean var383 = var382.canSeek();
                                                if (var383) {
                                                    var5 ^= -556391204;
                                                    var5 += -1775644355;
                                                    var5 ^= -898682786;
                                                    int var384 = var3 + 1;
                                                    int var385 = var3 * var384;
                                                    int var386 = var385 & 1;
                                                    if (var386 != 0) {
                                                        break label461;
                                                    }

                                                    FX var387 = this.IL;
                                                    var8 = var387.durationMs();
                                                    Integer var545 = var7;
                                                    if (var545 == null) {
                                                        var5 &= 304905303;
                                                        var5 ^= 1808551830;
                                                        break label460;
                                                    }

                                                    var5 *= -601248145;
                                                    var5 -= 1183917060;
                                                    var5 |= -343020713;
                                                    var5 ^= 457643084;
                                                    long var699;
                                                    int var389 = (var699 = var8 - 0L) == 0L ? 0 : (var699 < 0L ? -1 : 1);
                                                    if (var389 > 0) {
                                                        var5 ^= -1547191799;
                                                        var5 -= 1090850097;
                                                        var5 |= -357671162;
                                                        var5 ^= 812354759;
                                                        int var390 = var3 + 1;
                                                        int var391 = var3 * var390;
                                                        int var479 = var3 + 2;
                                                        int var392 = var391 * var479;
                                                        int var480 = var3 + 3;
                                                        int var393 = var392 * var480;
                                                        int var394 = var393 & 7;
                                                        if (var394 != 0) {
                                                            break label461;
                                                        }

                                                        int var395 = var5 - -534099123;
                                                        int var396 = var395 & -672353548;
                                                        int var397 = var396 + -995318750;
                                                        int var398 = var397 ^ -1886120931;
                                                        float var399 = this.d(var398);
                                                        float var400 = var1 - var399;
                                                        int var481 = var5 - 1910826751;
                                                        int var482 = var481 ^ -2103880961;
                                                        float var483 = this.xO(var482);
                                                        int var546 = var5 + 1778510815;
                                                        int var547 = var546 ^ 1575390224;
                                                        float var548 = this.d(var547);
                                                        float var484 = var483 - var548;
                                                        float var401 = var400 / var484;
                                                        float var402 = TP.S(var401);
                                                        If var485 = this.s;
                                                        FX var549 = this.IL;
                                                        var10 = var549.durationMs();
                                                        float var551 = (float)var10;
                                                        float var403 = var402 * var551;
                                                        var10 = (long)var403;
                                                        Ar var404 = Ar.ge(var10);
                                                        int var553 = var7 + 1;
                                                        int var554 = var7 * var553;
                                                        int var555 = var554 & 1;
                                                        if (var555 == 0) {
                                                            switch (var5) {
                                                                case -1679162225:
                                                                default:
                                                                    var5 ^= 1965574541;
                                                                    break;
                                                                case -561646816:
                                                                    var5 -= -1979277969;
                                                                    var5 ^= -2014362442;
                                                                    break;
                                                                case 344772002:
                                                                    var5 ^= -708224641;
                                                            }

                                                            var10 = var3;
                                                            var12 = var10 + 1L;
                                                            var12 = var10 * var12;
                                                            long var14 = var10 + 2L;
                                                            var12 *= var14;
                                                            var10 += 3L;
                                                            var12 *= var10;
                                                            var10 = var12 & 7L;
                                                            long var700;
                                                            int var559 = (var700 = var10 - 0L) == 0L ? 0 : (var700 < 0L ? -1 : 1);
                                                            if (var559 == 0) {
                                                                var485.Wf(var404);
                                                                return true;
                                                            }
                                                            break label461;
                                                        }

                                                        switch (var5) {
                                                            case -561646816:
                                                                var5 ^= -211104379;
                                                                var5 += 1328259044;
                                                                var5 ^= 81431886;
                                                                break label460;
                                                            case -224498776:
                                                            default:
                                                                var5 ^= 1247197346;
                                                                break label460;
                                                            case 714821668:
                                                                var5 ^= -181534359;
                                                                break label460;
                                                        }
                                                    }

                                                    switch (var5) {
                                                        case -1196572297:
                                                        default:
                                                            var5 ^= 927875873;
                                                            break;
                                                        case -458686693:
                                                            var5 ^= -1351753839;
                                                            var5 ^= -1087822393;
                                                            break;
                                                        case 1522569653:
                                                            var5 ^= 21839437;
                                                    }
                                                } else {
                                                    var5 |= 776201123;
                                                    var5 += -8437011;
                                                    var5 &= 1357257537;
                                                    var5 ^= -466739379;
                                                }
                                            } else {
                                                var5 -= 11640441;
                                                var5 ^= -1346146305;
                                                var5 ^= -1268594366;
                                            }

                                            Integer var405 = var3;
                                            if (var405 == null) {
                                                break label461;
                                            }

                                            Nr var406 = this.Lm;
                                            Integer var486 = var7;
                                            if (var486 != null) {
                                                var5 += 323225938;
                                                var5 *= -1072624307;
                                                var5 |= -256822265;
                                                var5 &= -55935593;
                                                var5 ^= 1939422776;
                                                int var487 = var3 + 1;
                                                int var488 = var3 * var487;
                                                int var489 = var488 & 1;
                                                if (var489 != 0) {
                                                    break label461;
                                                }

                                                if (var406 != null) {
                                                    var5 >>= 14;
                                                    var5 ^= 1075720139;
                                                    int var407 = var3 + 1;
                                                    int var408 = var3 * var407;
                                                    int var409 = var408 & 1;
                                                    if (var409 != 0) {
                                                        break label461;
                                                    }

                                                    Nr var410 = this.Lm;
                                                    int var411 = var410.nn();
                                                    var9 = var7;
                                                    var11 = var9 + 1L;
                                                    var11 = var9 * var11;
                                                    var13 = var9 + 2L;
                                                    var11 *= var13;
                                                    var9 += 3L;
                                                    var11 *= var9;
                                                    var9 = var11 & 7L;
                                                    long var701;
                                                    int var493 = (var701 = var9 - 0L) == 0L ? 0 : (var701 < 0L ? -1 : 1);
                                                    if (var493 != 0) {
                                                        var5 -= 403609672;
                                                        var5 ^= 297563228;
                                                        var5 -= 1249608044;
                                                        var5 ^= 305258121;
                                                        break label460;
                                                    }

                                                    var5 *= 1501896745;
                                                    var5 ^= -1076287903;
                                                    Integer var494 = var3;
                                                    if (var494 == null) {
                                                        break label461;
                                                    }

                                                    if (var411 >= 0) {
                                                        var5 &= 1337055881;
                                                        var5 ^= 1185823301;
                                                        int var412 = var3 + 1;
                                                        int var413 = var3 * var412;
                                                        int var414 = var413 & 1;
                                                        if (var414 != 0) {
                                                            break label461;
                                                        }

                                                        FX var415 = this.IL;
                                                        int var495 = var7 + 1;
                                                        int var496 = var7 * var495;
                                                        int var497 = var496 & 1;
                                                        if (var497 != 0) {
                                                            var5 += -973048779;
                                                            var5 -= -2066406300;
                                                            var5 &= -393239507;
                                                            var5 -= 1966257553;
                                                            var5 ^= 1796749755;
                                                            break label460;
                                                        }

                                                        var5 &= -827176537;
                                                        var5 += -785126399;
                                                        var5 ^= 332380480;
                                                        var5 *= 2012673293;
                                                        var5 ^= 1405297364;
                                                        var9 = var3;
                                                        var11 = var9 + 1L;
                                                        var11 = var9 * var11;
                                                        var9 = var11 & 1L;
                                                        long var702;
                                                        int var500 = (var702 = var9 - 0L) == 0L ? 0 : (var702 < 0L ? -1 : 1);
                                                        if (var500 != 0) {
                                                            break label461;
                                                        }

                                                        boolean var416 = var415.canSeek();
                                                        if (var416) {
                                                            var5 &= -733361666;
                                                            var5 |= 1835953294;
                                                            var5 ^= -1580705549;
                                                            int var417 = var3 + 1;
                                                            int var418 = var3 * var417;
                                                            int var501 = var3 + 2;
                                                            int var419 = var418 * var501;
                                                            int var502 = var3 + 3;
                                                            int var420 = var419 * var502;
                                                            int var421 = var420 & 7;
                                                            if (var421 != 0) {
                                                                break label461;
                                                            }

                                                            int var422 = var5 * 434526353;
                                                            int var423 = var422 - -1483578401;
                                                            int var424 = var423 + -1782754261;
                                                            int var425 = var424 ^ 152347607;
                                                            Za var426 = this.g(var425);
                                                            var9 = var7;
                                                            var11 = var9 + 1L;
                                                            var11 = var9 * var11;
                                                            var13 = var9 + 2L;
                                                            var11 *= var13;
                                                            var9 += 3L;
                                                            var11 *= var9;
                                                            var9 = var11 & 7L;
                                                            long var703;
                                                            int var506 = (var703 = var9 - 0L) == 0L ? 0 : (var703 < 0L ? -1 : 1);
                                                            if (var506 != 0) {
                                                                var5 *= -70578371;
                                                                var5 += 247114339;
                                                                var5 ^= 1356966619;
                                                                break label460;
                                                            }

                                                            var5 >>= 18;
                                                            var5 *= 416954779;
                                                            var5 &= -1964382602;
                                                            var5 ^= 1110889913;
                                                            if (var426 != null) {
                                                                var5 -= -434790538;
                                                                var5 ^= -1533396292;
                                                                Integer var507 = var3;
                                                                if (var507 == null) {
                                                                    break label461;
                                                                }

                                                                Nr var508 = this.Lm;
                                                                int var509 = var508.nn();
                                                                int var560 = var426.o();
                                                                var11 = var7;
                                                                var13 = var11 + 1L;
                                                                var13 = var11 * var13;
                                                                long var15 = var11 + 2L;
                                                                var13 *= var15;
                                                                var11 += 3L;
                                                                var13 *= var11;
                                                                var11 = var13 & 7L;
                                                                long var704;
                                                                int var612 = (var704 = var11 - 0L) == 0L ? 0 : (var704 < 0L ? -1 : 1);
                                                                if (var612 != 0) {
                                                                    var5 -= -1161475860;
                                                                    var5 ^= -1172933094;
                                                                    break label460;
                                                                }

                                                                var5 += -1683169266;
                                                                var5 &= 223997926;
                                                                var5 <<= 23;
                                                                var5 -= -868677892;
                                                                var5 ^= 719634741;
                                                                Integer var613 = var3;
                                                                if (var613 == null) {
                                                                    break label461;
                                                                }

                                                                if (var509 < var560) {
                                                                    var5 += -512716760;
                                                                    var5 &= 463382751;
                                                                    var5 ^= 2033302566;
                                                                    If var510 = this.s;
                                                                    Nr var561 = this.Lm;
                                                                    int var562 = var561.nn();
                                                                    hP_2 var427 = var426.VP(var562);
                                                                    var10 = var427.startMs();
                                                                    var10 -= 200L;
                                                                    int var428 = var7 + 1;
                                                                    int var429 = var7 * var428;
                                                                    var7 = var429 & 1;
                                                                    if (var7 == 0) {
                                                                        var5 += -1459831846;
                                                                        var5 ^= -1549170397;
                                                                        var5 ^= -693349799;
                                                                        var5 &= -706487007;
                                                                        var5 ^= -1114699014;
                                                                        long var337 = var3;
                                                                        var12 = var337 + 1L;
                                                                        var12 = var337 * var12;
                                                                        long var338 = var12 & 1L;
                                                                        long var705;
                                                                        var7 = (var705 = var338 - 0L) == 0L ? 0 : (var705 < 0L ? -1 : 1);
                                                                        if (var7 == 0) {
                                                                            long var340 = var10 + 50L;
                                                                            long var341 = Math.max(0L, var340);
                                                                            Ar var342 = Ar.ge(var341);
                                                                            var510.Wf(var342);
                                                                            return true;
                                                                        }
                                                                        break label461;
                                                                    }

                                                                    var5 |= 708578899;
                                                                    var5 -= -964675560;
                                                                    var5 ^= -570468960;
                                                                    break label460;
                                                                }

                                                                var5 -= 1490754708;
                                                                var5 += 1731926467;
                                                                var5 >>= 20;
                                                                var5 ^= -336209891;
                                                            } else {
                                                                var5 <<= 28;
                                                                var5 ^= -1542839115;
                                                            }
                                                        } else {
                                                            var5 += -1469120316;
                                                            var5 ^= 1244085420;
                                                        }
                                                    } else {
                                                        switch (var5) {
                                                            case -1460197632:
                                                                var5 ^= -1255199548;
                                                                break;
                                                            case 234353727:
                                                                var5 -= -1009661880;
                                                                var5 += -1028593690;
                                                                var5 *= 1832848531;
                                                                var5 += 69377201;
                                                                var5 ^= 1627276333;
                                                                break;
                                                            case 919515387:
                                                            default:
                                                                var5 ^= -577141443;
                                                        }
                                                    }
                                                } else {
                                                    var5 += 726380495;
                                                    var5 |= 1131416005;
                                                    var5 ^= -1232906380;
                                                    var5 ^= -1486211187;
                                                    var5 ^= -31998029;
                                                }

                                                Integer var343 = var3;
                                                if (var343 != null) {
                                                    return false;
                                                }
                                                break label461;
                                            }

                                            var5 ^= -1592521394;
                                            var5 -= 390898452;
                                            var5 >>= 15;
                                            var5 &= 393213951;
                                            var5 ^= 2042635921;
                                            break label460;
                                        }

                                        var5 |= 1504418222;
                                        var5 *= 965174777;
                                        var5 *= -768289221;
                                        var5 >>= 19;
                                        var5 ^= 2042646816;
                                        break label460;
                                    }

                                    var5 += 57003901;
                                    var5 ^= -1614114226;
                                    var5 <<= 12;
                                    var5 >>= 2;
                                    var5 ^= 1937074563;
                                } else {
                                    var5 += 1820388869;
                                    var5 &= 671979934;
                                    var5 ^= 2058772508;
                                    var5 ^= 681114907;
                                }
                            } else {
                                var5 *= -851215027;
                                var5 ^= 425520287;
                            }
                        } else {
                            var5 -= 1876967599;
                            var5 ^= -1287587066;
                        }
                    } else {
                        switch (var5) {
                            case -1849610608:
                            default:
                                var5 ^= 417779872;
                                break;
                            case 353759889:
                                var5 >>= 25;
                                var5 -= 1769198739;
                                var5 -= -570936526;
                                var5 -= -1942656310;
                                var5 ^= 1450281208;
                                break;
                            case 1752053332:
                                var5 ^= 1640421779;
                        }
                    }

                    long var328 = var3;
                    long var344 = var328 + 1L;
                    long var345 = var328 * var344;
                    long var329 = var345 & 1L;
                    long var706;
                    var5 = (var706 = var329 - 0L) == 0L ? 0 : (var706 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        return false;
                    }
                    break label461;
                }
            }

            IllegalArgumentException var346 = new IllegalArgumentException();
            throw var346;
        }

        AssertionError var331 = new AssertionError();
        throw var331;
    }

    @Override
    protected boolean cu(float var1, float var2, double var3, lH_3 var5) {
        boolean var72 = false;
        label114: {
            int var6 = kS;
            var6 ^= 609662605;
            int var7 = System.identityHashCode(this);
            Integer var8 = var7;
            if (var8 == null) {
                switch (var6) {
                    case -1256742406:
                        var6 ^= 1221143832;
                        var6 *= -97443065;
                        var6 ^= 1618707470;
                        break;
                    case 190462771:
                    default:
                        var6 ^= 1661894734;
                        break;
                    case 258738012:
                        var6 ^= -1959770530;
                }
            } else {
                label123: {
                    var6 = switch (var6) {
                        case -1256742406 -> {
                            var6 -= 1653147079;
                            var6 -= -408317787;
                            yield var6 ^ -2131565278;
                        }
                        case -200546932 -> var6 ^ -80160477;
                        default -> var6 ^ 1690570818;
                    };
                    int var75 = var6 + 1;
                    var75 = var6 * var75;
                    var75 &= 1;
                    if (var75 != 0) {
                        break label114;
                    }

                    label110: {
                        Lk var78 = this.pw;
                        Lk var9 = Lk.EXPANDED;
                        if (var78 == var9) {
                            var6 -= 1099508210;
                            var6 &= 2057793500;
                            var6 ^= -1320341369;
                            Nr var79 = this.Lm;
                            Integer var91 = var7;
                            if (var91 == null) {
                                var6 -= 1768724446;
                                var6 >>= 11;
                                var6 |= -1326504674;
                                var6 ^= 319463979;
                                var6 ^= -905655852;
                                break label123;
                            }
                            var6 = switch (var6) {
                                case -1714719713 -> {
                                    var6 ^= 1012254543;
                                    var6 += -1755455020;
                                    yield var6 ^ 1775164912;
                                }
                                case -892447850 -> var6 ^ -428235723;
                                default -> var6 ^ 1708131907;
                            };
                            long var92 = var6;
                            long var11 = var92 + 1L;
                            var11 = var92 * var11;
                            long var13 = var92 + 2L;
                            var11 *= var13;
                            long var93 = var92 + 3L;
                            var11 *= var93;
                            long var94 = var11 & 7L;
                            long var118;
                            int var95 = (var118 = var94 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
                            if (var95 != 0) {
                                break label114;
                            }

                            if (var79 != null) {
                                var6 |= 409191951;
                                var6 >>= 7;
                                var6 |= 1104274774;
                                var6 ^= -1333231915;
                                var75 = var6 + 1;
                                var75 = var6 * var75;
                                int var96 = var6 + 2;
                                var75 *= var96;
                                int var97 = var6 + 3;
                                var75 *= var97;
                                var75 &= 7;
                                if (var75 != 0) {
                                    break label114;
                                }

                                Nr var85 = this.Lm;
                                boolean var86 = var85.Y(var1, var2);
                                long var98 = var7;
                                var11 = var98 + 1L;
                                var11 = var98 * var11;
                                long var99 = var11 & 1L;
                                long var119;
                                var7 = (var119 = var99 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    var6 += -1297422458;
                                    var6 += -888156615;
                                    var6 -= 1082425278;
                                    var6 ^= 1195936555;
                                    break label123;
                                }

                                var6 <<= 11;
                                var6 &= -269745201;
                                var6 += 1890370848;
                                var6 <<= 16;
                                var6 ^= 1085402248;
                                var7 = var6 + 1;
                                var7 = var6 * var7;
                                int var100 = var6 + 2;
                                var7 *= var100;
                                int var101 = var6 + 3;
                                var7 *= var101;
                                var7 &= 7;
                                if (var7 != 0) {
                                    break label114;
                                }

                                if (var86) {
                                    var6 &= -707854582;
                                    var6 ^= -926127606;
                                    var72 = true;
                                    switch (var6) {
                                        case -516293631:
                                        default:
                                            var6 ^= -949119742;
                                            break label110;
                                        case -318664888:
                                            var6 ^= 55977281;
                                            break label110;
                                        case 1296860674:
                                            var6 &= -1777115871;
                                            var6 -= -1278839526;
                                            var6 >>>= 31;
                                            var6 ^= -1548426658;
                                            var6 ^= -1904022375;
                                            break label110;
                                    }
                                }

                                switch (var6) {
                                    case -2054034296:
                                        var6 &= -119280604;
                                        var6 &= 1597492019;
                                        var6 ^= 801351638;
                                        break;
                                    case -1490043630:
                                    default:
                                        var6 ^= 1784420450;
                                        break;
                                    case 469534529:
                                        var6 ^= 1531364330;
                                }
                            } else {
                                var6 += 864293376;
                                var6 &= 2078612028;
                                var6 ^= 661026242;
                            }
                        } else {
                            var6 ^= -147563711;
                            var6 -= 733182205;
                            var6 &= -513283451;
                            var6 &= 2069015980;
                            var6 ^= 1317160790;
                        }

                        Integer var87 = var6;
                        if (var87 == null) {
                            break label114;
                        }

                        var72 = false;
                        switch (var6) {
                            case -1114777136:
                                var6 ^= -1366347446;
                                break;
                            case 248008563:
                            default:
                                var6 ^= -1242230820;
                                break;
                            case 801271766:
                                var6 &= 1812380660;
                                var6 += 300431496;
                                var6 *= -89585595;
                                var6 >>>= 1;
                                var6 ^= 590608545;
                        }
                    }

                    long var88 = var6;
                    long var10 = var88 + 1L;
                    var10 = var88 * var10;
                    long var12 = var88 + 2L;
                    var10 *= var12;
                    long var89 = var88 + 3L;
                    var10 *= var89;
                    long var90 = var10 & 7L;
                    long var120;
                    var6 = (var120 = var90 - 0L) == 0L ? 0 : (var120 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        return var72;
                    }
                    break label114;
                }
            }

            long var102 = var6;
            long var113 = var102 + 1L;
            var113 = var102 * var113;
            long var117 = var102 + 2L;
            var113 *= var117;
            var102 += 3L;
            var113 *= var102;
            var102 = var113 & 7L;
            long var121;
            var7 = (var121 = var102 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
            if (var7 == 0) {
                IllegalStateException var74 = new IllegalStateException();
                throw var74;
            }
        }

        AssertionError var65 = new AssertionError();
        throw var65;
    }

    private boolean qA(float var1, float var2, int var3) {
        int var5 = System.identityHashCode(this);
        float var6 = this.h;
        var6 -= var1;
        float var7 = this.G;
        var7 -= var2;
        Integer var34 = var5;
        if (var34 != null) {
            int var4 = var3 - -355470602;
            var4 ^= 1341797638;
            int var35 = var4 + 1;
            var35 = var4 * var35;
            int var8 = var4 + 2;
            var35 *= var8;
            var8 = var4 + 3;
            var35 *= var8;
            var35 &= 7;
            label41:
            if (var35 == 0) {
                var6 *= var6;
                float var40 = var7 * var7;
                float var41 = var6 + var40;
                float var68;
                var35 = (var68 = var41 - 100.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                boolean var44;
                if (var35 <= 0) {
                    var4 += -1224671116;
                    var4 <<= 22;
                    var4 ^= -171370596;
                    var4 ^= -415640121;
                    Integer var43 = var4;
                    if (var43 == null) {
                        break label41;
                    }

                    var44 = true;
                    var4 <<= 11;
                    var4 *= -963610967;
                    var4 ^= -1393503373;
                } else {
                    var4 *= -1117192631;
                    var4 >>= 14;
                    var4 ^= -1849320454;
                    var4 ^= -105113534;
                    long var49 = var4;
                    long var59 = var49 + 1L;
                    long var60 = var49 * var59;
                    long var10 = var49 + 2L;
                    long var61 = var60 * var10;
                    long var50 = var49 + 3L;
                    long var62 = var61 * var50;
                    long var51 = var62 & 7L;
                    long var69;
                    int var52 = (var69 = var51 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                    if (var52 != 0) {
                        break label41;
                    }

                    var44 = false;
                    var4 <<= 10;
                    var4 += -988811111;
                    var4 >>>= 7;
                    var4 >>>= 7;
                    var4 ^= 519229818;
                }

                long var53 = var4;
                long var63 = var53 + 1L;
                long var64 = var53 * var63;
                long var67 = var53 + 2L;
                long var65 = var64 * var67;
                long var54 = var53 + 3L;
                long var66 = var65 * var54;
                long var55 = var66 & 7L;
                long var70;
                int var56 = (var70 = var55 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                if (var56 == 0) {
                    return var44;
                }
            }
        } else {
            int var28 = switch (var3) {
                case -730330030 -> var3 ^ -195786504;
                case 244596129 -> {
                    int var29 = var3 | -170870878;
                    var29 += 599736588;
                    yield var29 ^ -1802156545;
                }
                default -> var3 ^ 2076869781;
            };
            int var45 = var28 + 1;
            var45 = var28 * var45;
            var28 = var45 & 1;
            if (var28 == 0) {
                IllegalStateException var33 = new IllegalStateException();
                throw var33;
            }
        }

        IllegalStateException var32 = new IllegalStateException();
        throw var32;
    }

    private boolean U(int var1) {
        label90: {
            int var41;
            int var65;
            label95: {
                var65 = System.identityHashCode(this);
                int var4 = var1 * -2022579697;
                var4 |= 1477744205;
                var4 &= -1605414843;
                var4 &= -1564228637;
                var4 ^= 735301412;
                float var70 = this.FF(var4);
                long var5 = var65;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var117;
                int var78 = (var117 = var5 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                label87:
                if (var78 == 0) {
                    var41 = var1 & -562057094;
                    var41 ^= -2055412049;
                    float var79 = this.h;
                    int var6 = var41 * 1765770315;
                    var6 += -792372156;
                    var6 ^= 2032785974;
                    float var99 = this.d(var6);
                    float var100 = var99 - 3.0F;
                    float var118;
                    int var80 = (var118 = var79 - var100) == 0.0F ? 0 : (var118 < 0.0F ? -1 : 1);
                    if (var80 >= 0) {
                        var41 >>>= 3;
                        var41 ^= -922372131;
                        var5 = var41;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var119;
                        int var83 = (var119 = var5 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                        if (var83 != 0) {
                            break label90;
                        }

                        float var84 = this.h;
                        Integer var101 = var65;
                        if (var101 == null) {
                            var41 &= 1913388578;
                            var41 ^= -1681470692;
                            break label87;
                        }

                        var41 |= -1396530800;
                        var41 += -1816421948;
                        var41 ^= -1330182072;
                        var101 = var41;
                        if (var101 == null) {
                            break label90;
                        }

                        int var103 = var41 ^ -998916517;
                        var103 ^= 157049263;
                        float var105 = this.xO(var103);
                        float var106 = var105 + 3.0F;
                        float var120;
                        int var85 = (var120 = var84 - var106) == 0.0F ? 0 : (var120 < 0.0F ? -1 : 1);
                        if (var85 <= 0) {
                            var41 ^= 1972963121;
                            var41 >>>= 1;
                            var41 += 934855730;
                            var41 ^= 406490848;
                            var5 = var41;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var121;
                            int var88 = (var121 = var5 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                            if (var88 != 0) {
                                break label90;
                            }

                            float var89 = this.G;
                            float var71 = var89 - var70;
                            float var72 = Math.abs(var71);
                            var5 = var65;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            long var9 = var5 + 2L;
                            var7 *= var9;
                            var5 += 3L;
                            var7 *= var5;
                            var5 = var7 & 7L;
                            long var122;
                            var65 = (var122 = var5 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                            if (var65 != 0) {
                                var41 ^= 255191032;
                                var41 *= 469210841;
                                var41 -= 1334235019;
                                var41 &= 706915236;
                                var41 ^= -1041494886;
                                break label87;
                            }

                            var41 >>>= 6;
                            var41 &= -1714840944;
                            var41 -= 2119363287;
                            var41 ^= -145908184;
                            Integer var59 = var41;
                            if (var59 == null) {
                                break label90;
                            }

                            float var123;
                            int var60 = (var123 = var72 - 4.5F) == 0.0F ? 0 : (var123 < 0.0F ? -1 : 1);
                            if (var60 <= 0) {
                                var41 -= -285471126;
                                var41 -= -573131973;
                                var41 ^= -2026074770;
                                long var61 = var41;
                                var5 = var61 + 1L;
                                var5 = var61 * var5;
                                var7 = var61 + 2L;
                                var5 *= var7;
                                long var62 = var61 + 3L;
                                var5 *= var62;
                                long var63 = var5 & 7L;
                                long var124;
                                var60 = (var124 = var63 - 0L) == 0L ? 0 : (var124 < 0L ? -1 : 1);
                                if (var60 != 0) {
                                    break label90;
                                }

                                var65 = 1;
                                var41 += -1099370511;
                                var41 -= -1622726857;
                                var41 ^= -610026900;
                                var41 ^= -829543547;
                                var41 ^= -1870581949;
                                break label95;
                            }

                            switch (var41) {
                                case -1629142684:
                                    var41 ^= 333240164;
                                    break;
                                case -567127696:
                                default:
                                    var41 ^= -851706903;
                                    break;
                                case 1950068993:
                                    var41 *= -292424723;
                                    var41 |= -160125699;
                                    var41 -= -836032625;
                                    var41 ^= 1957597752;
                            }
                        } else {
                            var41 |= 43262970;
                            var41 ^= -343794573;
                            var41 ^= -1787430689;
                        }
                    } else {
                        switch (var41) {
                            case -1820670305:
                                var41 <<= 7;
                                var41 &= -997305430;
                                var41 -= 1040018122;
                                var41 += 439948383;
                                var41 ^= 1029679683;
                                break;
                            case 733036409:
                            default:
                                var41 ^= -123025783;
                                break;
                            case 775975166:
                                var41 ^= -259671033;
                        }
                    }

                    var4 = var41 + 1;
                    var4 = var41 * var4;
                    var4 &= 1;
                    if (var4 != 0) {
                        break label90;
                    }

                    var65 = 0;
                    var41 &= -1991372896;
                    var41 &= 578619823;
                    var41 ^= -1167420090;
                    break label95;
                } else {
                    switch (var1) {
                        case 386297397:
                            var41 = var1 - -1565728679;
                            var41 <<= 29;
                            var41 ^= 250473491;
                            var41 |= -1372125672;
                            var41 ^= 1731447557;
                            break;
                        case 920454795:
                            var41 = var1 ^ -566818804;
                            break;
                        case 2037283546:
                        default:
                            var41 = var1 ^ 1961766583;
                    }
                }

                Integer var49 = var41;
                if (var49 != null) {
                    IllegalArgumentException var50 = new IllegalArgumentException();
                    throw var50;
                }
                break label90;
            }

            Integer var76 = var41;
            if (var76 != null) {
                return (var65 != 0);
            }
        }

        UnsupportedOperationException var57 = new UnsupportedOperationException();
        throw var57;
    }

    private float I(int var1) {
        int var3 = System.identityHashCode(this);
        XF var4 = this.aJ;
        float var20 = var4.bs();
        Integer var17 = var3;
        if (var17 == null) {
            int var2 = var1 & 1075951678;
            var2 -= 1356641405;
            var2 &= -1483131629;
            var2 ^= -1256688584;
            long var5 = var2;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var23;
            int var18 = (var23 = var5 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var18 == 0) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        } else {
            int var12 = var1 - 2090007411;
            var12 ^= -517369998;
            Integer var14 = var12;
            if (var14 != null) {
                float var16 = var20 - 240.0F;
                return var16 * 0.5F;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    private float bJ(int var1) {
        int var3 = System.identityHashCode(this);
        XF var4 = this.aJ;
        float var19 = var4.bs();
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 != 0) {
            int var2 = var1 - -645979815;
            var2 -= -980195382;
            var2 ^= -1579849477;
            var2 -= -1097245972;
            var2 ^= 1484774774;
            Integer var17 = var2;
            if (var17 != null) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        } else {
            int var11 = var1 << 19;
            var11 ^= -1172046476;
            Integer var13 = var11;
            if (var13 != null) {
                return var19 * 0.5F;
            }
        }

        RuntimeException var14 = new RuntimeException();
        throw var14;
    }

    private float eC(int var1) {
        int var3 = System.identityHashCode(this);
        Lk var4 = Lk.EXPANDED;
        int var5 = var1 | 492946701;
        var5 *= 1698537225;
        var5 -= 512834000;
        var5 ^= 23396026;
        float var27 = this.ct(var4, var5);
        long var31 = var3;
        long var7 = var31 + 1L;
        var7 = var31 * var7;
        long var9 = var31 + 2L;
        var7 *= var9;
        long var32 = var31 + 3L;
        var7 *= var32;
        long var33 = var7 & 7L;
        long var42;
        var3 = (var42 = var33 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var2 = var1 - 612938322;
            var2 += 525780998;
            var2 *= 1035955119;
            var2 ^= -96087407;
            long var34 = var2;
            var7 = var34 + 1L;
            var7 = var34 * var7;
            long var35 = var7 & 1L;
            long var43;
            var3 = (var43 = var35 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        } else {
            int var16 = switch (var1) {
                case -690010829 -> var1 ^ -75739066;
                default -> var1 ^ 604486296;
                case 1847452747 -> {
                    int var14 = var1 ^ -1329166938;
                    var14 -= -792877024;
                    yield var14 ^ -1045684705;
                }
            };
            var3 = var16 + 1;
            var3 = var16 * var3;
            var5 = var16 + 2;
            var3 *= var5;
            var16 += 3;
            var3 *= var16;
            var16 = var3 & 7;
            if (var16 == 0) {
                return var27 - 13.0F;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    private float FF(int var1) {
        int var3 = System.identityHashCode(this);
        Lk var4 = Lk.EXPANDED;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 != 0) {
            switch (var1) {
                case -1412182171:
                    int var15 = var1 & 328053774;
                    var15 ^= 122828999;
                    var15 ^= -1802117540;
                    break;
                case 677150080:
                    int var14 = var1 ^ -2059430545;
                    break;
                case 737038661:
                default:
                    int var13 = var1 ^ 1228425994;
            }

            RuntimeException var20 = new RuntimeException();
            throw var20;
        } else {
            int var8 = switch (var1) {
                default -> var1 ^ 1956525843;
                case -1412182171 -> {
                    int var7 = var1 + 396236637;
                    yield var7 ^ -738955376;
                }
                case 664081563 -> var1 ^ -1528494884;
            } ^ -509078682;
            var8 ^= 1984210608;
            var8 += 1450811995;
            var8 ^= -2120431982;
            float var12 = this.ct(var4, var8);
            return var12 - 30.0F;
        }
    }

    private float d(int var1) {
        int var3 = System.identityHashCode(this);
        int var4 = var1 | -330040343;
        var4 ^= -617809295;
        float var23 = this.I(var4);
        float var24 = var23 + 12.0F;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var29;
        var3 = (var29 = var5 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var3 != 0) {
            Integer var20 = switch (var1) {
                case -624524212 -> var1 ^ -1006460338;
                case 358699759 -> {
                    int var9 = var1 + -456303752;
                    var9 ^= 561142699;
                    var9 &= -1141388759;
                    var9 -= -393721483;
                    yield var9 ^ -1632756326;
                }
                default -> var1 ^ 214705141;
            };
            if (var20 != null) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            int var13 = var1 >> 19;
            var13 ^= 1662613656;
            long var15 = var13;
            var5 = var15 + 1L;
            var5 = var15 * var5;
            long var16 = var5 & 1L;
            long var30;
            var13 = (var30 = var16 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var13 == 0) {
                return var24 + 26.0F;
            }
        }

        RuntimeException var18 = new RuntimeException();
        throw var18;
    }

    private float xO(int var1) {
        int var3 = System.identityHashCode(this);
        int var4 = var1 << 6;
        var4 *= -655830523;
        var4 -= -1019312821;
        var4 ^= -438300245;
        float var18 = this.I(var4);
        float var19 = var18 + 240.0F;
        Integer var13 = var3;
        if (var13 != null) {
            int var9 = var1 >> 23;
            var9 += 2003032896;
            var9 -= 1100351599;
            var9 ^= 788417763;
            float var14 = var19 - 12.0F;
            return var14 - 26.0F;
        } else {
            Integer var6 = switch (var1) {
                case -298295586 -> {
                    int var5 = var1 - 352604553;
                    yield var5 ^ 2076897278;
                }
                case 812025942 -> var1 ^ -1014054054;
                default -> var1 ^ -1824462242;
            };
            if (var6 == null) {
                UnsupportedOperationException var8 = new UnsupportedOperationException();
                throw var8;
            } else {
                UnsupportedOperationException var7 = new UnsupportedOperationException();
                throw var7;
            }
        }
    }

    @Override
    protected void BO(hr var1, lH_3 var2) {
        int var3 = kS;
        var3 ^= -1042016314;
        int var4 = System.identityHashCode(this);
        r_2 var5 = this.v;
        Rt var6 = Rt.THEME;
        Integer var7 = var4;
        if (var7 == null) {
            switch (var3) {
                case -201864671:
                default:
                    var3 ^= -1971934711;
                    break;
                case 1352990897:
                    var3 *= -1881638139;
                    var3 &= -2001797108;
                    var3 ^= -94328678;
                    break;
                case 2024070945:
                    var3 ^= -6970483;
            }
        } else {
            label54: {
                var3 = switch (var3) {
                    default -> var3 ^ -469824022;
                    case -1050787943 -> var3 ^ 592016815;
                    case 1352990897 -> {
                        var3 >>>= 12;
                        var3 -= 1464830073;
                        var3 *= -327669207;
                        yield var3 ^ -1604528244;
                    }
                };
                boolean var43 = var5.TJ(var6);
                if (var43) {
                    var3 = switch (var3) {
                        case -200835297 -> var3 ^ 663191650;
                        default -> var3 ^ 1784167751;
                        case 2105263843 -> {
                            var3 >>= 31;
                            yield var3 ^ 1152159344;
                        }
                    };
                    int var44 = var3 - 1544250173;
                    int var45 = var44 & -3003247;
                    int var46 = var45 ^ -412649867;
                    float[] var47 = this.vP(var46);
                    float var49 = var47[0];
                    long var50 = var4;
                    long var9 = var50 + 1L;
                    var9 = var50 * var9;
                    long var51 = var9 & 1L;
                    long var54;
                    var4 = (var54 = var51 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        var3 += 615182567;
                        var3 *= 1429003999;
                        var3 *= -1606986197;
                        var3 ^= -854599331;
                        break label54;
                    }

                    var3 <<= 18;
                    var3 |= 436274509;
                    var3 |= -1136225315;
                    var3 ^= 1899227115;
                    float var41 = var47[1];
                    float var52 = var47[2];
                    float var8 = var47[3];
                    float var48 = var47[4];
                    var1.Ky(var49, var41, var52, var8, var48);
                    var3 *= -986684355;
                    var3 |= -1454962348;
                    var3 >>= 24;
                    var3 ^= 1996522458;
                } else {
                    var3 >>= 31;
                    var3 += -307125586;
                    var3 &= 2051038267;
                    var3 ^= -520127459;
                }

                Integer var33 = var3;
                if (var33 == null) {
                    IllegalStateException var34 = new IllegalStateException();
                    throw var34;
                }

                return;
            }
        }

        IllegalArgumentException var42 = new IllegalArgumentException();
        throw var42;
    }

    private float[] vP(int var1) {
        label71: {
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            int var13;
            if (var4 == null) {
                var13 = var1 | -229301713;
                var13 ^= -1613104188;
            } else {
                label73: {
                    var13 = var1 | -1279477237;
                    var13 ^= 1628835011;
                    var13 += -125760089;
                    var13 ^= -366867399;
                    float var57 = this.Hu();
                    float var58 = TP.S(var57);
                    XF var5 = this.aJ;
                    float var62 = var5.bs();
                    XF var6 = this.I;
                    float var73 = var6.bs();
                    float var7 = Math.min(var62, 86.0F);
                    var7 *= 0.62F;
                    var7 = TP.GO(var7, var62, var58);
                    int var8 = (this.m ? 1 : 0);
                    float var83;
                    if (var8 != 0) {
                        var13 = switch (var13) {
                            default -> var13 ^ 1642266884;
                            case 1028197482 -> {
                                var13 -= -1401347268;
                                var13 *= 1766631863;
                                var13 *= -456319313;
                                var13 *= -326372049;
                                yield var13 ^ 1880407140;
                            }
                            case 1894895018 -> var13 ^ 773327160;
                        };
                        long var80 = var13;
                        long var10 = var80 + 1L;
                        var10 = var80 * var10;
                        long var81 = var10 & 1L;
                        long var102;
                        var8 = (var102 = var81 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label71;
                        }

                        var83 = 0.0F;
                        var13 *= 1147907309;
                        var13 += 1127447087;
                        var13 ^= 1280504894;
                    } else {
                        var13 = switch (var13) {
                            default -> var13 ^ 1560669106;
                            case -560295943 -> var13 ^ -590762111;
                            case 1028197482 -> {
                                var13 |= -158428285;
                                var13 -= -1568586145;
                                var13 <<= 12;
                                var13 += 429094184;
                                yield var13 ^ -1265981687;
                            }
                        };
                        long var9 = var13;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var103;
                        int var88 = (var103 = var9 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                        if (var88 != 0) {
                            break label71;
                        }

                        float var89 = var73 * 0.55F;
                        int var91 = var3 + 1;
                        var91 = var3 * var91;
                        int var100 = var3 + 2;
                        var91 *= var100;
                        int var101 = var3 + 3;
                        var91 *= var101;
                        var91 &= 7;
                        if (var91 != 0) {
                            var13 ^= -1864213088;
                            var13 ^= 1411273019;
                            var13 += 2114771101;
                            var13 ^= 1833562876;
                            break label73;
                        }

                        var13 *= 1583688329;
                        var13 ^= -1232100761;
                        var91 = var13 + 1;
                        var91 = var13 * var91;
                        var91 &= 1;
                        if (var91 != 0) {
                            break label71;
                        }

                        var83 = var89;
                        var13 *= 1593081059;
                        var13 ^= -1769419291;
                        var13 <<= 15;
                        var13 ^= -962015549;
                    }

                    float var59 = TP.GO(var83, var73, var58);
                    var6 = this.EN;
                    float var75 = var6.bs();
                    float var84 = Math.min(var7, var59);
                    float var85 = var84 * 0.5F;
                    float var76 = Math.min(var75, var85);
                    float[] var86 = this.Iz;
                    float var63 = var62 - var7;
                    float var64 = var63 * 0.5F;
                    var86[0] = var64;
                    float[] var65 = this.Iz;
                    var65[1] = 0.0F;
                    float[] var66 = this.Iz;
                    var66[2] = var7;
                    int var67 = var3 + 1;
                    int var68 = var3 * var67;
                    int var79 = var3 + 2;
                    int var69 = var68 * var79;
                    var3 += 3;
                    int var70 = var69 * var3;
                    var3 = var70 & 7;
                    if (var3 == 0) {
                        var13 = switch (var13) {
                            case -1164511061 -> var13 ^ -503413297;
                            case 227495619 -> {
                                var13 *= 860045049;
                                var13 *= 1834666691;
                                var13 |= -1783216874;
                                var13 >>>= 30;
                                yield var13 ^ -1864018899;
                            }
                            default -> var13 ^ -1947384574;
                        };
                        var3 = var13 + 1;
                        var3 = var13 * var3;
                        int var71 = var13 + 2;
                        var3 *= var71;
                        int var72 = var13 + 3;
                        var3 *= var72;
                        var3 &= 7;
                        if (var3 == 0) {
                            float[] var55 = this.Iz;
                            float var60 = Math.max(0.5F, var59);
                            var55[3] = var60;
                            float[] var56 = this.Iz;
                            float var61 = Math.max(0.0F, var76);
                            var56[4] = var61;
                            return this.Iz;
                        }
                        break label71;
                    }

                    switch (var13) {
                        case -1056957509:
                        default:
                            var13 ^= -1343676519;
                            break;
                        case -664215775:
                            var13 ^= 1916646930;
                            break;
                        case 227495619:
                            var13 |= -1337797361;
                            var13 ^= -572433820;
                    }
                }
            }

            Integer var45 = var13;
            if (var45 != null) {
                IllegalArgumentException var46 = new IllegalArgumentException();
                throw var46;
            }
        }

        AssertionError var47 = new AssertionError();
        throw var47;
    }

    @Override
    protected void G(Canvas var1, lH_3 var2) {
        label162: {
            int var3 = kS;
            var3 ^= 1182434080;
            int var4 = System.identityHashCode(this);
            int var5 = var3 | -207058830;
            var5 <<= 22;
            var5 ^= 304569956;
            float[] var122 = this.vP(var5);
            float var6 = var122[0];
            float var7 = var122[1];
            float var8 = var122[2];
            float var9 = var122[3];
            Integer var10 = var4;
            if (var10 == null) {
                var3 += -208010607;
                var3 *= -980776689;
                var3 >>>= 16;
                var3 *= -90590623;
                var3 ^= -1753898293;
            } else {
                var3 = switch (var3) {
                    case -683961257 -> {
                        var3 |= 258639392;
                        var3 |= 678817525;
                        var3 += -369332284;
                        var3 &= 1256162350;
                        yield var3 ^ -632526442;
                    }
                    case -31335643 -> var3 ^ -1853912163;
                    default -> var3 ^ -1020355550;
                };
                var10 = var3;
                if (var10 == null) {
                    break label162;
                }

                float var123 = var122[4];
                XF var165 = this.j;
                float var166 = var165.bs();
                r_2 var11 = this.v;
                Rt var12 = Rt.BLACK;
                boolean var191 = var11.TJ(var12);
                if (var191) {
                    var3 = switch (var3) {
                        case -1844417092 -> {
                            var3 += 1219270484;
                            var3 += -1942130671;
                            var3 -= -1732626839;
                            yield var3 ^ -1962296527;
                        }
                        default -> var3 ^ -429002003;
                        case 1626887324 -> var3 ^ -1586926525;
                    };
                    int var192 = var3 | -1391960996;
                    int var193 = var192 - 1614308896;
                    int var194 = var193 ^ 1762330371;
                    int var195 = var194 << 14;
                    int var196 = var195 ^ -1161870259;
                    this.T(var1, var6, var7, var8, var9, var123, var166, var196);
                    var3 |= 712748389;
                    var3 *= 406369303;
                    var3 |= 840296915;
                    var3 ^= -998016482;
                } else {
                    var3 += 1060859087;
                    var3 <<= 1;
                    var3 >>= 1;
                    var3 &= -1948774678;
                    var3 ^= 2079628623;
                }

                long var167 = var3;
                long var204 = var167 + 1L;
                long var205 = var167 * var204;
                long var14 = var167 + 2L;
                long var206 = var205 * var14;
                long var168 = var167 + 3L;
                long var207 = var206 * var168;
                long var169 = var207 & 7L;
                long var246;
                int var170 = (var246 = var169 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                if (var170 != 0) {
                    break label162;
                }

                Lk var171 = Lk.COMPACT;
                int var197 = var3 * -2107417357;
                int var198 = var197 | -1699704278;
                int var199 = var198 ^ 1902892982;
                float var172 = this.MA(var171, var199);
                Lk var200 = Lk.ANNOUNCE;
                int var208 = var3 & -1253528091;
                int var209 = var208 ^ 1296223725;
                int var210 = var209 ^ 379339873;
                float var201 = this.MA(var200, var210);
                Lk var211 = Lk.EXPANDED;
                int var13 = var3 & 1092317286;
                var13 ^= -1412555763;
                float var212 = this.MA(var211, var13);
                float var214 = var1.pixelScale();
                int var216 = var4 + 1;
                int var217 = var4 * var216;
                int var15 = var4 + 2;
                int var218 = var217 * var15;
                var15 = var4 + 3;
                int var219 = var218 * var15;
                int var220 = var219 & 7;
                if (var220 != 0) {
                    var3 += -976283782;
                    var3 |= -1280970250;
                    var3 |= 1716411886;
                    var3 ^= 1466042377;
                    var3 ^= 1578696200;
                } else {
                    label168: {
                        var3 = switch (var3) {
                            default -> var3 ^ 307965674;
                            case -88303675 -> {
                                var3 *= 958410239;
                                var3 *= -1136595803;
                                var3 >>= 29;
                                yield var3 ^ -266064894;
                            }
                            case 900990341 -> var3 ^ -133002905;
                        };
                        int var221 = var3 + 1;
                        int var222 = var3 * var221;
                        var15 = var3 + 2;
                        int var223 = var222 * var15;
                        var15 = var3 + 3;
                        int var224 = var223 * var15;
                        int var225 = var224 & 7;
                        if (var225 != 0) {
                            break label162;
                        }

                        float var226 = this.ur();
                        float var215 = var214 * var226;
                        var1.save();
                        var1.clip(var6, var7, var8, var9, var123);
                        float var247;
                        var5 = (var247 = var172 - 0.01F) == 0.0F ? 0 : (var247 < 0.0F ? -1 : 1);
                        if (var5 > 0) {
                            var3 += 2040666327;
                            var3 ^= -317689058;
                            var3 *= 1248717939;
                            var3 *= -378730783;
                            var3 ^= -1556548845;
                            var5 = var3 ^ -1971796710;
                            var5 >>= 21;
                            var5 ^= 588543596;
                            V(var1, var172, var6, var7, var8, var9, var5);
                            var14 = var4;
                            long var16 = var14 + 1L;
                            var16 = var14 * var16;
                            var14 = var16 & 1L;
                            long var248;
                            var5 = (var248 = var14 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                var3 += -67394739;
                                var3 |= -1250699251;
                                var3 += 746474592;
                                var3 >>>= 8;
                                var3 ^= -21397579;
                                break label168;
                            }
                            var3 = switch (var3) {
                                default -> var3 ^ -652304333;
                                case 1138016974 -> var3 ^ -795845872;
                                case 2130316246 -> {
                                    var3 *= 1282342697;
                                    var3 <<= 31;
                                    yield var3 ^ 727749267;
                                }
                            };
                            var5 = var3 + -1281164199;
                            var5 ^= 1161200898;
                            this.Ft(var1, var6, var7, var8, var9, var215, var5);
                            var1.restore();
                            var3 &= 103310554;
                            var3 ^= -709641163;
                            var3 ^= -557206839;
                        } else {
                            var3 -= 1052821663;
                            var3 &= -154086467;
                            var3 ^= -1189458609;
                        }

                        var5 = var3 + 1;
                        var5 = var3 * var5;
                        var170 = var3 + 2;
                        var5 *= var170;
                        var170 = var3 + 3;
                        var5 *= var170;
                        var5 &= 7;
                        if (var5 != 0) {
                            break label162;
                        }

                        float var249;
                        var5 = (var249 = var201 - 0.01F) == 0.0F ? 0 : (var249 < 0.0F ? -1 : 1);
                        Integer var175 = var4;
                        label140:
                        if (var175 != null) {
                            var3 |= -580044254;
                            var3 ^= 624175923;
                            var3 += 1978063496;
                            var3 -= -1806275996;
                            var3 ^= 935380759;
                            var14 = var3;
                            long var243 = var14 + 1L;
                            var243 = var14 * var243;
                            var14 = var243 & 1L;
                            long var250;
                            int var176 = (var250 = var14 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                            if (var176 != 0) {
                                break label162;
                            }

                            if (var5 > 0) {
                                var3 <<= 2;
                                var3 >>>= 9;
                                var3 ^= -1825336988;
                                var5 = var3 + 1;
                                var5 = var3 * var5;
                                var176 = var3 + 2;
                                var5 *= var176;
                                var176 = var3 + 3;
                                var5 *= var176;
                                var5 &= 7;
                                if (var5 != 0) {
                                    break label162;
                                }

                                var5 = var3 * -1938792501;
                                var5 >>>= 10;
                                var5 ^= -589408145;
                                V(var1, var201, var6, var7, var8, var9, var5);
                                var5 = var4 + 1;
                                var5 = var4 * var5;
                                var5 &= 1;
                                if (var5 != 0) {
                                    switch (var3) {
                                        case -1821399071:
                                            var3 <<= 3;
                                            var3 &= -1746537492;
                                            var3 *= 1931613783;
                                            var3 ^= -700314042;
                                            break label140;
                                        case -1114766609:
                                            var3 ^= -34002642;
                                            break label140;
                                        case -360288868:
                                        default:
                                            var3 ^= -78264016;
                                            break label140;
                                    }
                                }

                                var3 >>>= 30;
                                var3 >>= 30;
                                var3 += 1949231921;
                                var3 *= -1896863537;
                                var3 ^= -984115810;
                                long var179 = var3;
                                var14 = var179 + 1L;
                                var14 = var179 * var14;
                                var243 = var179 + 2L;
                                var14 *= var243;
                                long var180 = var179 + 3L;
                                var14 *= var180;
                                long var181 = var14 & 7L;
                                long var251;
                                var5 = (var251 = var181 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                                if (var5 != 0) {
                                    break label162;
                                }

                                var5 = var3 & -1613936077;
                                var5 |= 618716282;
                                var5 ^= -752349719;
                                this.Sv(var1, var6, var7, var8, var9, var215, var5);
                                var1.restore();
                                switch (var3) {
                                    case -1418277804:
                                    default:
                                        var3 ^= -880690228;
                                        break;
                                    case -383790465:
                                        var3 ^= 1544838699;
                                        break;
                                    case 935870721:
                                        var3 -= -1660498002;
                                        var3 |= -1853152350;
                                        var3 ^= 938166949;
                                }
                            } else {
                                switch (var3) {
                                    case -1838361759:
                                        var3 ^= -1784195445;
                                        break;
                                    case -300203370:
                                        var3 += 570425484;
                                        var3 ^= -1136952716;
                                        break;
                                    case 900252541:
                                    default:
                                        var3 ^= -648507970;
                                }
                            }

                            long var182 = var3;
                            var14 = var182 + 1L;
                            var14 = var182 * var14;
                            long var183 = var14 & 1L;
                            long var252;
                            var5 = (var252 = var183 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                break label162;
                            }

                            float var253;
                            var5 = (var253 = var212 - 0.01F) == 0.0F ? 0 : (var253 < 0.0F ? -1 : 1);
                            var176 = var4 + 1;
                            var176 = var4 * var176;
                            int var202 = var4 + 2;
                            var176 *= var202;
                            int var203 = var4 + 3;
                            var176 *= var203;
                            var176 &= 7;
                            label131:
                            if (var176 == 0) {
                                var3 *= -1727212487;
                                var3 *= 1058171303;
                                var3 ^= 218118376;
                                var3 ^= 1948749053;
                                if (var5 > 0) {
                                    var3 += -1975636377;
                                    var3 ^= 644731602;
                                    var3 ^= 874996639;
                                    long var189 = var3;
                                    var14 = var189 + 1L;
                                    var14 = var189 * var14;
                                    long var190 = var14 & 1L;
                                    long var254;
                                    var5 = (var254 = var190 - 0L) == 0L ? 0 : (var254 < 0L ? -1 : 1);
                                    if (var5 != 0) {
                                        break label162;
                                    }

                                    var5 = var3 ^ 667835594;
                                    var5 ^= 1181724937;
                                    V(var1, var212, var6, var7, var8, var9, var5);
                                    var5 = var3 - 474278262;
                                    var5 ^= -1063895330;
                                    this.Rd(var1, var2, var6, var7, var8, var9, var215, var5);
                                    var5 = var4 + 1;
                                    var5 = var4 * var5;
                                    int var163 = var4 + 2;
                                    var5 *= var163;
                                    var4 += 3;
                                    var5 *= var4;
                                    var4 = var5 & 7;
                                    if (var4 != 0) {
                                        var3 *= -1318372185;
                                        var3 ^= -1475879213;
                                        break label131;
                                    }
                                    var3 = switch (var3) {
                                        case -1119198197 -> {
                                            var3 -= 1340087778;
                                            var3 -= -1412509694;
                                            yield var3 ^ 1548021676;
                                        }
                                        case 1077450449 -> var3 ^ -1359738611;
                                        default -> var3 ^ 1951986906;
                                    };
                                    var1.restore();
                                    var3 -= 4772840;
                                    var3 -= 1644999487;
                                    var3 *= -2028295255;
                                    var3 *= -1081049157;
                                    var3 ^= -1279821169;
                                } else {
                                    var3 += 690778282;
                                    var3 ^= -573889558;
                                }

                                var1.restore();
                                return;
                            } else {
                                var3 *= -1249825283;
                                var3 -= -1648560332;
                                var3 ^= 605083956;
                            }
                        } else {
                            var3 >>= 31;
                            var3 -= 1073181695;
                            var3 ^= 1050510847;
                        }
                    }
                }
            }

            UnsupportedOperationException var117 = new UnsupportedOperationException();
            throw var117;
        }

        IllegalArgumentException var111 = new IllegalArgumentException();
        throw var111;
    }

    private float MA(Lk var1, int var2) {
        float var291 = 0.0F;
        label278: {
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            int var39;
            if (var5 != 0) {
                var39 = var2 * 702551275;
                var39 ^= 2040390666;
            } else {
                label277: {
                    var39 = var2 & -9532742;
                    var39 ^= -1438505681;
                    var5 = var39 + 1;
                    var5 = var39 * var5;
                    int var6 = var39 + 2;
                    var5 *= var6;
                    var6 = var39 + 3;
                    var5 *= var6;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label278;
                    }

                    var5 = var1.ordinal();
                    float var174;
                    switch (var5) {
                        case 0:
                            var39 = switch (var39) {
                                default -> var39 ^ -365393052;
                                case 59271141 -> var39 ^ -1052970670;
                                case 1090792743 -> {
                                    var39 *= -1210671043;
                                    var39 ^= -1791863585;
                                    var39 *= 685949055;
                                    yield var39 ^ 434441786;
                                }
                            };
                            float var187 = this.Kv;
                            long var210 = var4;
                            long var275 = var210 + 1L;
                            var275 = var210 * var275;
                            long var11 = var210 + 2L;
                            var275 *= var11;
                            var210 += 3L;
                            var275 *= var210;
                            var210 = var275 & 7L;
                            long var312;
                            int var213 = (var312 = var210 - 0L) == 0L ? 0 : (var312 < 0L ? -1 : 1);
                            if (var213 != 0) {
                                switch (var39) {
                                    case -1249125034:
                                        var39 |= 324106428;
                                        var39 |= -1748481094;
                                        var39 ^= 417189952;
                                        var39 ^= 1909010615;
                                        break label277;
                                    case -1078379853:
                                    default:
                                        var39 ^= 1467063010;
                                        break label277;
                                    case 1306245920:
                                        var39 ^= 202113705;
                                        break label277;
                                }
                            }

                            var39 += -1735052629;
                            var39 >>= 31;
                            var39 ^= 252457580;
                            int var214 = var39 + 1;
                            int var215 = var39 * var214;
                            int var248 = var39 + 2;
                            int var216 = var215 * var248;
                            var248 = var39 + 3;
                            int var217 = var216 * var248;
                            int var218 = var217 & 7;
                            if (var218 != 0) {
                                break label278;
                            }

                            var174 = var187;
                            var39 &= 1319426823;
                            var39 >>= 2;
                            var39 ^= -615730335;
                            break;
                        case 1:
                            var39 *= 1047476085;
                            var39 += -740566178;
                            var39 ^= -775935878;
                            long var182 = var39;
                            long var8 = var182 + 1L;
                            var8 = var182 * var8;
                            long var10 = var182 + 2L;
                            var8 *= var10;
                            long var183 = var182 + 3L;
                            var8 *= var183;
                            long var184 = var8 & 7L;
                            long var309;
                            var6 = (var309 = var184 - 0L) == 0L ? 0 : (var309 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                break label278;
                            }

                            float var186 = this.ET;
                            long var204 = var4;
                            long var9 = var204 + 1L;
                            var9 = var204 * var9;
                            var204 = var9 & 1L;
                            long var310;
                            int var206 = (var310 = var204 - 0L) == 0L ? 0 : (var310 < 0L ? -1 : 1);
                            if (var206 != 0) {
                                var39 += 667656792;
                                var39 <<= 4;
                                var39 ^= 671515961;
                                break label277;
                            }

                            var39 ^= -1386695405;
                            var39 ^= -691683251;
                            var39 ^= -2025152645;
                            var39 &= 1705976858;
                            var39 ^= -1729524305;
                            var204 = var39;
                            var9 = var204 + 1L;
                            var9 = var204 * var9;
                            var204 = var9 & 1L;
                            long var311;
                            int var209 = (var311 = var204 - 0L) == 0L ? 0 : (var311 < 0L ? -1 : 1);
                            if (var209 != 0) {
                                break label278;
                            }

                            var174 = var186;
                            var39 *= 1467677453;
                            var39 >>= 20;
                            var39 ^= -1892640230;
                            var39 ^= 1476210235;
                            break;
                        case 2:
                            var39 >>= 16;
                            var39 *= 1415118967;
                            var39 ^= -258805398;
                            long var171 = var39;
                            long var7 = var171 + 1L;
                            var7 = var171 * var7;
                            long var172 = var7 & 1L;
                            long var308;
                            var5 = (var308 = var172 - 0L) == 0L ? 0 : (var308 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                break label278;
                            }

                            var174 = 240.0F;
                            var39 += 895135066;
                            var39 ^= -1750679312;
                            break;
                        default:
                            var39 ^= -1273239689;
                            var39 <<= 28;
                            var39 >>= 9;
                            var39 ^= 1598148144;
                            Integer var19 = var39;
                            if (var19 != null) {
                                MatchException var20 = new MatchException(null, null);
                                throw var20;
                            }
                            break label278;
                    }

                    Integer var188 = var39;
                    if (var188 == null) {
                        break label278;
                    }

                    int var189 = var39 * 1754846213;
                    var189 >>>= 21;
                    var189 |= 1575855277;
                    var189 += -1744133339;
                    var189 ^= -1450815079;
                    float var194 = this.ct(var1, var189);
                    Lk var219 = this.pw;
                    int var250 = var4 + 1;
                    var250 = var4 * var250;
                    var250 &= 1;
                    label248:
                    if (var250 == 0) {
                        var39 -= -1694562333;
                        var39 -= 1725355417;
                        var39 ^= -555918392;
                        long var253 = var39;
                        long var292 = var253 + 1L;
                        var292 = var253 * var292;
                        long var12 = var253 + 2L;
                        var292 *= var12;
                        long var254 = var253 + 3L;
                        var292 *= var254;
                        long var255 = var292 & 7L;
                        long var313;
                        var250 = (var313 = var255 - 0L) == 0L ? 0 : (var313 < 0L ? -1 : 1);
                        if (var250 != 0) {
                            break label278;
                        }

                        if (var1 != var219) {
                            var39 = switch (var39) {
                                case -1739401293 -> var39 ^ -808524357;
                                default -> var39 ^ -1405902408;
                                case 137003436 -> {
                                    var39 -= 734205251;
                                    var39 >>>= 17;
                                    var39 ^= 1157888980;
                                    var39 >>>= 17;
                                    yield var39 ^ 1480339222;
                                }
                            };
                            int var220 = var39 + 1;
                            int var221 = var39 * var220;
                            int var222 = var221 & 1;
                            if (var222 != 0) {
                                break label278;
                            }

                            float var223 = this.u;
                            Integer var257 = var4;
                            if (var257 == null) {
                                var39 -= -14099398;
                                var39 *= 2049879573;
                                var39 |= -2134237653;
                                var39 += -319311716;
                                var39 ^= -1457975218;
                                break label248;
                            }

                            var39 -= 186813299;
                            var39 -= 534742044;
                            var39 -= -1147082765;
                            var39 *= -1817035991;
                            var39 ^= 499043503;
                            float var224 = var174 - var223;
                            float var225 = Math.abs(var224);
                            float var314;
                            int var226 = (var314 = var225 - 0.5F) == 0.0F ? 0 : (var314 < 0.0F ? -1 : 1);
                            if (var226 < 0) {
                                var39 >>>= 15;
                                var39 *= 472732631;
                                var39 |= 1611303081;
                                var39 ^= -1623871565;
                                float var227 = this.D;
                                float var228 = var194 - var227;
                                float var229 = Math.abs(var228);
                                float var315;
                                int var230 = (var315 = var229 - 0.5F) == 0.0F ? 0 : (var315 < 0.0F ? -1 : 1);
                                var257 = var4;
                                if (var257 == null) {
                                    var39 ^= -248208565;
                                    var39 *= -1234223771;
                                    var39 -= 2125950531;
                                    var39 += -971484428;
                                    var39 ^= -977700321;
                                    break label248;
                                }

                                var39 |= -1237435093;
                                var39 ^= 1416375104;
                                var257 = var39;
                                if (var257 == null) {
                                    break label278;
                                }

                                if (var230 < 0) {
                                    var39 |= 881190484;
                                    var39 ^= -1285859795;
                                    var39 ^= -1835911583;
                                    long var231 = var39;
                                    long var279 = var231 + 1L;
                                    var279 = var231 * var279;
                                    long var232 = var279 & 1L;
                                    long var316;
                                    int var233 = (var316 = var232 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                                    if (var233 == 0) {
                                        return 0.0F;
                                    }
                                    break label278;
                                }

                                var39 |= 1996769495;
                                var39 ^= -1532687215;
                            } else {
                                var39 |= -586377347;
                                var39 *= -425540065;
                                var39 ^= -512349297;
                            }
                        } else {
                            var39 -= -1079170769;
                            var39 ^= 113966605;
                            var39 &= -11902298;
                            var39 -= 2073604762;
                            var39 ^= -1990574616;
                        }

                        Integer var234 = var39;
                        if (var234 == null) {
                            break label278;
                        }

                        XF var235 = this.aJ;
                        float var236 = var235.bs();
                        float var237 = Math.max(1.0F, var236);
                        XF var260 = this.I;
                        float var261 = var260.bs();
                        float var262 = Math.max(1.0F, var261);
                        Integer var281 = var4;
                        label236:
                        if (var281 != null) {
                            var39 |= 1385918038;
                            var39 ^= 1707615473;
                            long var282 = var39;
                            long var304 = var282 + 1L;
                            var304 = var282 * var304;
                            long var283 = var304 & 1L;
                            long var317;
                            int var284 = (var317 = var283 - 0L) == 0L ? 0 : (var317 < 0L ? -1 : 1);
                            if (var284 != 0) {
                                break label278;
                            }

                            label295: {
                                Lk var285 = Lk.COMPACT;
                                if (var1 == var285) {
                                    var39 = switch (var39) {
                                        case 1047747215 -> {
                                            var39 ^= -679592275;
                                            var39 &= 1640087490;
                                            var39 >>= 2;
                                            var39 ^= 1587742198;
                                            yield var39 ^ 784883816;
                                        }
                                        default -> var39 ^ 254253857;
                                        case 1614316988 -> var39 ^ 216773266;
                                    };
                                    var284 = var39 + 1;
                                    var284 = var39 * var284;
                                    var284 &= 1;
                                    if (var284 != 0) {
                                        break label278;
                                    }

                                    Lk var289 = this.pw;
                                    Lk var296 = Lk.COMPACT;
                                    Integer var306 = var4;
                                    if (var306 == null) {
                                        var39 &= 1160120933;
                                        var39 -= -33379569;
                                        var39 >>= 31;
                                        var39 ^= -556851447;
                                        break label236;
                                    }
                                    var39 = switch (var39) {
                                        default -> var39 ^ 972183112;
                                        case 1420323970 -> var39 ^ 1149559317;
                                        case 1747659934 -> {
                                            var39 *= 1898927849;
                                            var39 ^= 448249483;
                                            yield var39 ^ -683491404;
                                        }
                                    };
                                    if (var289 == var296) {
                                        var39 <<= 19;
                                        var39 >>>= 30;
                                        var39 ^= -1682105243;
                                        Integer var290 = var39;
                                        if (var290 == null) {
                                            break label278;
                                        }

                                        var291 = 1.0F;
                                        var39 *= 461815075;
                                        var39 >>= 17;
                                        var39 ^= 1472310458;
                                        break label295;
                                    }

                                    var39 &= 52060626;
                                    var39 += 512590890;
                                    var39 >>>= 13;
                                    var39 ^= 369073221;
                                } else {
                                    switch (var39) {
                                        case -457402915:
                                        default:
                                            var39 ^= -1429764312;
                                            break;
                                        case 400144093:
                                            var39 ^= -1243787965;
                                            break;
                                        case 1047747215:
                                            var39 &= -1589809355;
                                            var39 <<= 20;
                                            var39 ^= -1246848648;
                                    }
                                }

                                Integer var297 = var39;
                                if (var297 == null) {
                                    break label278;
                                }

                                float var298 = Math.min(var237, var174);
                                float var175 = Math.max(var237, var174);
                                Integer var238 = var4;
                                if (var238 == null) {
                                    var39 += 1139989435;
                                    var39 ^= -2025952710;
                                    break label236;
                                }
                                var39 = switch (var39) {
                                    default -> var39 ^ -1365332433;
                                    case 369006968 -> {
                                        var39 >>>= 31;
                                        var39 ^= -1233208603;
                                        var39 &= 1066715031;
                                        var39 += 1294010619;
                                        yield var39 ^ 2000506080;
                                    }
                                    case 1164804840 -> var39 ^ -42696411;
                                };
                                Integer var239 = var39;
                                if (var239 == null) {
                                    break label278;
                                }

                                float var176 = var298 / var175;
                                var291 = var176;
                                var39 += -423668570;
                                var39 -= -1699295449;
                                var39 &= 1682251085;
                                var39 >>= 23;
                                var39 ^= 1472300206;
                            }

                            Integer var177 = var39;
                            if (var177 == null) {
                                break label278;
                            }

                            float var240 = Math.min(var262, var194);
                            float var195 = Math.max(var262, var194);
                            long var263 = var4;
                            var292 = var263 + 1L;
                            var292 = var263 * var292;
                            var12 = var263 + 2L;
                            var292 *= var12;
                            long var264 = var263 + 3L;
                            var292 *= var264;
                            long var265 = var292 & 7L;
                            long var318;
                            var250 = (var318 = var265 - 0L) == 0L ? 0 : (var318 < 0L ? -1 : 1);
                            if (var250 != 0) {
                                switch (var39) {
                                    case -466966141:
                                        var39 ^= -1278165839;
                                        break;
                                    case 1472300078:
                                        var39 |= -2018971754;
                                        var39 ^= 153546935;
                                        break;
                                    case 1991170062:
                                    default:
                                        var39 ^= 552724563;
                                }
                            } else {
                                var39 = switch (var39) {
                                    case -1285092613 -> var39 ^ -829254557;
                                    default -> var39 ^ 1695422348;
                                    case 1472300078 -> {
                                        var39 |= -1899124776;
                                        var39 += -1574603561;
                                        var39 -= 1837189484;
                                        var39 -= 1624956814;
                                        yield var39 ^ 2049252121;
                                    }
                                };
                                float var196 = var240 / var195;
                                float var178 = var291 * var196;
                                float var179 = TP.N(0.62F, 0.95F, var178);
                                Lk var197 = this.pw;
                                if (var1 == var197) {
                                    var39 = switch (var39) {
                                        case -910956350 -> {
                                            var39 += -296855367;
                                            var39 ^= -744311772;
                                            var39 -= 1682233499;
                                            var39 ^= -999751119;
                                            yield var39 ^ -1907458430;
                                        }
                                        case 55898566 -> var39 ^ 626716972;
                                        default -> var39 ^ -438805672;
                                    };
                                    long var199 = var39;
                                    long var268 = var199 + 1L;
                                    long var269 = var199 * var268;
                                    var292 = var199 + 2L;
                                    long var270 = var269 * var292;
                                    long var200 = var199 + 3L;
                                    long var271 = var270 * var200;
                                    long var201 = var271 & 7L;
                                    long var319;
                                    var189 = (var319 = var201 - 0L) == 0L ? 0 : (var319 < 0L ? -1 : 1);
                                    if (var189 != 0) {
                                        break label278;
                                    }

                                    var39 >>>= 27;
                                    var39 |= 1493619823;
                                    var39 ^= 1942462062;
                                    var39 ^= -576020063;
                                    return var179;
                                }

                                var39 += -1277924627;
                                var39 &= 1915458255;
                                var39 ^= 916979172;
                                float var180 = var179 * 0.85F;
                                int var241 = var4 + 1;
                                int var242 = var4 * var241;
                                var250 = var4 + 2;
                                int var243 = var242 * var250;
                                var4 += 3;
                                int var244 = var243 * var4;
                                var4 = var244 & 7;
                                if (var4 == 0) {
                                    var39 *= 1893461823;
                                    var39 &= -379773361;
                                    var39 ^= 1553666118;
                                    var4 = var39 + 1;
                                    var4 = var39 * var4;
                                    var4 &= 1;
                                    if (var4 != 0) {
                                        break label278;
                                    }

                                    var39 *= 789080433;
                                    var39 ^= 667998195;
                                    return var180;
                                }

                                var39 -= -116123928;
                                var39 ^= -1823160438;
                            }
                        } else {
                            switch (var39) {
                                case -1139880572:
                                default:
                                    var39 ^= 1654341836;
                                    break;
                                case -229723132:
                                    var39 ^= -519220663;
                                    break;
                                case 1530090094:
                                    var39 *= 1845467419;
                                    var39 ^= -927206081;
                                    var39 |= -2090974458;
                                    var39 += -553253163;
                                    var39 ^= 137100661;
                            }
                        }
                    } else {
                        var39 += -560894787;
                        var39 ^= 1771060116;
                    }
                }
            }

            Integer var161 = var39;
            if (var161 != null) {
                IllegalArgumentException var162 = new IllegalArgumentException();
                throw var162;
            }
        }

        IllegalStateException var155 = new IllegalStateException();
        throw var155;
    }

    private static void V(Canvas var0, float var1, float var2, float var3, float var4, float var5, int var6) {
        int var8 = System.identityHashCode(var0);
        var0.save();
        Integer var9 = var8;
        if (var9 == null) {
            int var46 = var6 ^ -2142059190;
            var46 ^= -217004297;
        } else {
            label60: {
                int var7 = var6 + -190477980;
                var7 |= -1751841413;
                var7 >>= 10;
                var7 ^= -71004925;
                long var56 = var7;
                long var11 = var56 + 1L;
                var11 = var56 * var11;
                long var57 = var11 & 1L;
                long var82;
                int var58 = (var82 = var57 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                label49:
                if (var58 == 0) {
                    var0.alpha(var1);
                    float var83;
                    var58 = (var83 = var1 - 0.98F) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
                    if (var58 < 0) {
                        var7 += -383165088;
                        var7 *= -1470788625;
                        var7 >>= 11;
                        var7 += -805108997;
                        var7 ^= -1160697879;
                        long var60 = var7;
                        var11 = var60 + 1L;
                        var11 = var60 * var11;
                        long var61 = var11 & 1L;
                        long var84;
                        var58 = (var84 = var61 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                        if (var58 != 0) {
                            break label49;
                        }

                        float var63 = 1.0F - var1;
                        float var64 = var63 * 2.2F;
                        Integer var10 = var8;
                        if (var10 == null) {
                            switch (var7) {
                                case 33717526:
                                default:
                                    var7 ^= 737052963;
                                    break label60;
                                case 1790971718:
                                    var7 *= -297506603;
                                    var7 -= 1510071540;
                                    var7 ^= 255771199;
                                    break label60;
                                case 1980679411:
                                    var7 ^= 1563893121;
                                    break label60;
                            }
                        }

                        var7 *= -1053471105;
                        var7 *= 1999509575;
                        var7 &= 1048163633;
                        var7 ^= 1262243885;
                        var0.blur(var64);
                        var7 += 1410135400;
                        var7 |= 778529567;
                        var7 ^= 1631344928;
                        var7 >>= 31;
                        var7 ^= 1785864912;
                    } else {
                        var7 ^= 1967960328;
                        var7 ^= -454032287;
                    }

                    var58 = var7 + 1;
                    var58 = var7 * var58;
                    int var72 = var7 + 2;
                    var58 *= var72;
                    var72 = var7 + 3;
                    var58 *= var72;
                    var58 &= 7;
                    if (var58 == 0) {
                        float var70 = 0.04F * var1;
                        float var71 = 0.96F + var70;
                        float var74 = var4 * 0.5F;
                        float var75 = var2 + var74;
                        float var79 = var5 * 0.35F;
                        float var80 = var3 + var79;
                        Integer var49 = var8;
                        if (var49 == null) {
                            var7 -= 894130141;
                            var7 ^= -843922233;
                            var7 >>>= 21;
                            var7 &= -1454002525;
                            var7 ^= -1347842474;
                            break label60;
                        }

                        var7 ^= 280629562;
                        var7 >>= 28;
                        var7 >>>= 20;
                        var7 <<= 10;
                        var7 ^= 1220902515;
                        int var50 = var7 + 1;
                        var50 = var7 * var50;
                        int var12 = var7 + 2;
                        var50 *= var12;
                        var12 = var7 + 3;
                        var50 *= var12;
                        var50 &= 7;
                        if (var50 == 0) {
                            var0.scale(var71, var75, var80);
                            return;
                        }
                    }
                }

                UnsupportedOperationException var55 = new UnsupportedOperationException();
                throw var55;
            }
        }

        RuntimeException var48 = new RuntimeException();
        throw var48;
    }

    private void T(Canvas var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
        int var10 = System.identityHashCode(this);
        float var11 = var5 - 17.0F;
        var11 /= 135.0F;
        var11 = TP.S(var11);
        int var12 = var10 + 1;
        var12 = var10 * var12;
        int var13 = var10 + 2;
        var12 *= var13;
        var13 = var10 + 3;
        var12 *= var13;
        var12 &= 7;
        if (var12 != 0) {
            int var38 = var8 & -379449065;
            var38 += -235448292;
            var38 |= 868602135;
            var38 ^= 474776418;
        } else {
            label55: {
                int var9 = var8 * -37409899;
                var9 >>>= 14;
                var9 ^= 2051946657;
                long var73 = var9;
                long var14 = var73 + 1L;
                var14 = var73 * var14;
                long var16 = var73 + 2L;
                var14 *= var16;
                long var74 = var73 + 3L;
                var14 *= var74;
                long var75 = var14 & 7L;
                long var91;
                var12 = (var91 = var75 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                label44:
                if (var12 == 0) {
                    float var77 = var3 + 1.5F;
                    float var84 = 10.0F * var11;
                    float var85 = 8.0F + var84;
                    var11 = 0.22F * var11;
                    var11 = 0.28F + var11;
                    int var61 = DP.Y(-16777216, var11);
                    var1.shadow(var2, var77, var4, var5, var6, var85, var61);
                    var11 = 1.0F - var7;
                    var11 = var6 * var11;
                    Paint var78 = f;
                    var1.roundRect(var2, var3, var4, var5, var11, var11, var6, var6, var78);
                    float var92;
                    int var64 = (var92 = var7 - 0.02F) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
                    if (var64 > 0) {
                        var9 >>= 15;
                        var9 ^= 416982256;
                        var9 ^= 1253249815;
                        Integer var65 = var9;
                        if (var65 == null) {
                            break label44;
                        }

                        var11 = var6 * 0.42F;
                        var11 = TP.t(var11, 2.6F, 6.5F);
                        var11 *= var7;
                        var12 = var9 | -1581866608;
                        var12 |= 1991752524;
                        var12 ^= 1691178720;
                        S(var1, var2, var3, var11, true, var12);
                        float var82 = var2 + var4;
                        Integer var43 = var10;
                        if (var43 == null) {
                            var9 &= -286297193;
                            var9 += 839763702;
                            var9 ^= 1540116575;
                            break label55;
                        }

                        var9 |= -1831432522;
                        var9 |= 1300132745;
                        var9 >>>= 9;
                        var9 |= -605921996;
                        var9 ^= 271979256;
                        int var44 = var9 + 1;
                        var44 = var9 * var44;
                        var13 = var9 + 2;
                        var44 *= var13;
                        var13 = var9 + 3;
                        var44 *= var13;
                        var44 &= 7;
                        if (var44 != 0) {
                            break label44;
                        }

                        var44 = var9 & -102889334;
                        var44 -= -1464926647;
                        var44 ^= -1939400974;
                        var44 ^= 1048359511;
                        S(var1, var82, var3, var11, false, var44);
                        var9 |= 2063574460;
                        var9 *= -469582669;
                        var9 -= 1840685592;
                        var9 ^= 705493440;
                    } else {
                        switch (var9) {
                            case -1172006220:
                            default:
                                var9 ^= -1071867983;
                                break;
                            case 1972395485:
                                var9 ^= 1382712984;
                                break;
                            case 2051904849:
                                var9 -= 1787006451;
                                var9 ^= -1419205789;
                                var9 ^= 463252074;
                                var9 ^= 627059170;
                        }
                    }

                    var10 = var9 + 1;
                    var10 = var9 * var10;
                    var10 &= 1;
                    if (var10 == 0) {
                        return;
                    }
                }

                IllegalStateException var56 = new IllegalStateException();
                throw var56;
            }
        }

        IllegalStateException var42 = new IllegalStateException();
        throw var42;
    }

    private static void S(Canvas var0, float var1, float var2, float var3, boolean var4, int var5) {
        label160: {
            int var7 = System.identityHashCode(var0);
            float var185;
            int var8 = (var185 = var3 - 0.2F) == 0.0F ? 0 : (var185 < 0.0F ? -1 : 1);
            Integer var9 = var7;
            int var6;
            if (var9 == null) {
                switch (var5) {
                    case -1825395428:
                        var6 = var5 & 1132019424;
                        var6 += -270270085;
                        var6 &= -855254965;
                        var6 >>>= 14;
                        var6 ^= -864006352;
                        break;
                    case -519717523:
                        var6 = var5 ^ 1019183631;
                        break;
                    case 944573368:
                    default:
                        var6 = var5 ^ 398294081;
                }
            } else {
                label173: {
                    var6 = var5 + 1287268604;
                    var6 ^= 1160510467;
                    var6 ^= -664893742;
                    if (var8 < 0) {
                        var6 += 667386090;
                        var6 ^= -466063436;
                        return;
                    }
                    var6 = switch (var6) {
                        default -> var6 ^ 1622603887;
                        case 1112453974 -> var6 ^ -478573300;
                        case 1117367497 -> {
                            var6 -= 571632436;
                            var6 ^= -1199042823;
                            var6 -= -672671424;
                            var6 |= 802958144;
                            yield var6 ^ -763582403;
                        }
                    };
                    float var111;
                    if (var4) {
                        var6 >>= 16;
                        var6 ^= 2123515717;
                        var6 *= 1909255581;
                        var6 ^= -703341098;
                        var8 = var6 + 1;
                        var8 = var6 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            break label160;
                        }

                        float var110 = var1 - var3;
                        int var113 = var7 + 1;
                        var113 = var7 * var113;
                        int var10 = var7 + 2;
                        var113 *= var10;
                        var10 = var7 + 3;
                        var113 *= var10;
                        var113 &= 7;
                        if (var113 != 0) {
                            switch (var6) {
                                case -1588247368:
                                    var6 >>>= 25;
                                    var6 += 428771182;
                                    var6 += 36790507;
                                    var6 -= -1969675068;
                                    var6 ^= 1571129541;
                                    break label173;
                                case 796589045:
                                default:
                                    var6 ^= 1592532205;
                                    break label173;
                                case 1130460177:
                                    var6 ^= -1120513596;
                                    break label173;
                            }
                        }

                        var6 *= -987569483;
                        var6 ^= 656465270;
                        Integer var118 = var6;
                        if (var118 == null) {
                            break label160;
                        }

                        var111 = var110;
                        var6 ^= 393414726;
                        var6 |= -108689756;
                        var6 ^= -1916974286;
                    } else {
                        var6 -= 1070045135;
                        var6 ^= -1081781730;
                        var6 ^= 1120083934;
                        long var119 = var6;
                        long var11 = var119 + 1L;
                        var11 = var119 * var11;
                        long var13 = var119 + 2L;
                        var11 *= var13;
                        long var120 = var119 + 3L;
                        var11 *= var120;
                        long var121 = var11 & 7L;
                        long var186;
                        int var122 = (var186 = var121 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                        if (var122 != 0) {
                            break label160;
                        }

                        float var123 = var1 + var3;
                        int var147 = var7 + 1;
                        var147 = var7 * var147;
                        var147 &= 1;
                        if (var147 != 0) {
                            var6 += 209591261;
                            var6 >>= 29;
                            var6 ^= -863810784;
                            break label173;
                        }

                        var6 ^= 995900361;
                        var6 ^= 847538917;
                        var147 = var6 + 1;
                        var147 = var6 * var147;
                        int var172 = var6 + 2;
                        var147 *= var172;
                        int var173 = var6 + 3;
                        var147 *= var173;
                        var147 &= 7;
                        if (var147 != 0) {
                            break label160;
                        }

                        var111 = var123;
                        switch (var6) {
                            case 153232238:
                                var6 ^= 483698388;
                                var6 -= 1165273121;
                                var6 ^= -1534377721;
                                break;
                            case 323579852:
                                var6 ^= -1451510535;
                                break;
                            case 2007227046:
                            default:
                                var6 ^= -662856375;
                        }
                    }

                    int var124 = var6 + 1;
                    var124 = var6 * var124;
                    var124 &= 1;
                    if (var124 != 0) {
                        break label160;
                    }

                    var0.save();
                    var124 = var7 + 1;
                    var124 = var7 * var124;
                    int var155 = var7 + 2;
                    var124 *= var155;
                    var155 = var7 + 3;
                    var124 *= var155;
                    var124 &= 7;
                    label147:
                    if (var124 == 0) {
                        var6 >>= 10;
                        var6 ^= -327876082;
                        long var132 = var6;
                        long var174 = var132 + 1L;
                        var174 = var132 * var174;
                        long var183 = var132 + 2L;
                        var174 *= var183;
                        long var133 = var132 + 3L;
                        var174 *= var133;
                        long var134 = var174 & 7L;
                        long var187;
                        var124 = (var187 = var134 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                        if (var124 != 0) {
                            break label160;
                        }

                        float var142;
                        if (var4) {
                            var6 ^= -491628711;
                            var6 ^= 561887249;
                            var124 = var6 + 1;
                            var124 = var6 * var124;
                            var155 = var6 + 2;
                            var124 *= var155;
                            var155 = var6 + 3;
                            var124 *= var155;
                            var124 &= 7;
                            if (var124 != 0) {
                                break label160;
                            }

                            float var141 = var1 - var3;
                            Integer var159 = var7;
                            if (var159 == null) {
                                var6 *= -1352881403;
                                var6 ^= -740445883;
                                break label147;
                            }

                            var6 |= -673015107;
                            var6 &= -1111626209;
                            var6 *= -834021099;
                            var6 ^= -1693118951;
                            int var160 = var6 + 1;
                            var160 = var6 * var160;
                            int var178 = var6 + 2;
                            var160 *= var178;
                            int var179 = var6 + 3;
                            var160 *= var179;
                            var160 &= 7;
                            if (var160 != 0) {
                                break label160;
                            }

                            var142 = var141;
                            var6 &= 1087412815;
                            var6 &= -1938291604;
                            var6 -= 20530908;
                            var6 ^= -1191760172;
                        } else {
                            var6 = switch (var6) {
                                case -328728407 -> {
                                    var6 &= 1037810985;
                                    var6 -= -549504835;
                                    var6 ^= 1678565493;
                                    yield var6 ^ 1599585890;
                                }
                                case 407602265 -> var6 ^ 1330519385;
                                default -> var6 ^ -274661469;
                            };
                            var142 = var1;
                            var6 -= 810416586;
                            var6 -= -34619647;
                            var6 |= 425036841;
                            var6 ^= 526678785;
                        }

                        var155 = var6 + 1;
                        var155 = var6 * var155;
                        var155 &= 1;
                        if (var155 != 0) {
                            break label160;
                        }

                        var0.clip(var142, var2, var3, var3, 0.0F);
                        Integer var143 = var7;
                        if (var143 != null) {
                            var6 = switch (var6) {
                                case -1733136715 -> var6 ^ -333370329;
                                default -> var6 ^ -109938191;
                                case 1177655224 -> {
                                    var6 &= 971741491;
                                    yield var6 ^ 1413453423;
                                }
                            };
                            float var144 = var3 * 0.6F;
                            float var145 = var144 + 0.6F;
                            float var168;
                            if (var4) {
                                var6 = switch (var6) {
                                    default -> var6 ^ -1398596315;
                                    case 1411254111 -> {
                                        var6 &= 1932380139;
                                        var6 |= -1677127980;
                                        var6 &= 1955643729;
                                        yield var6 ^ 83971504;
                                    }
                                    case 1543866532 -> var6 ^ 1222881573;
                                };
                                var168 = (float) (-Math.PI / 2);
                                var6 -= -268731683;
                                var6 |= 1816469307;
                                var6 ^= -674766310;
                            } else {
                                var6 >>>= 5;
                                var6 ^= -78366995;
                                Integer var180 = var6;
                                if (var180 == null) {
                                    break label160;
                                }

                                var168 = (float) Math.PI;
                                var6 <<= 13;
                                var6 >>>= 18;
                                var6 *= -727395207;
                                var6 ^= -389219677;
                            }

                            float var181 = var2 + var3;
                            float var12 = var145 * 0.5F;
                            var12 = var3 + var12;
                            Paint var184 = f;
                            Integer var101 = var7;
                            if (var101 != null) {
                                var6 |= -315791129;
                                var6 &= 1274903248;
                                var6 -= 98651941;
                                var6 ^= -1658999392;
                                var101 = var6;
                                if (var101 != null) {
                                    var0.arc(var111, var181, var12, var145, var168, (float) (Math.PI / 2), var184);
                                    var0.restore();
                                    return;
                                }
                                break label160;
                            }

                            var6 -= -220800800;
                            var6 += -754721431;
                            var6 ^= -1274156416;
                            var6 ^= -501096434;
                        } else {
                            var6 += 2138928560;
                            var6 <<= 28;
                            var6 -= 754674551;
                            var6 += 726162934;
                            var6 ^= -1295009441;
                        }
                    } else {
                        var6 -= 2066928341;
                        var6 ^= 877953769;
                    }
                }
            }

            var7 = var6 + 1;
            var7 = var6 * var7;
            var8 = var6 + 2;
            var7 *= var8;
            var6 += 3;
            var7 *= var6;
            var6 = var7 & 7;
            if (var6 == 0) {
                UnsupportedOperationException var97 = new UnsupportedOperationException();
                throw var97;
            }
        }

        UnsupportedOperationException var98 = new UnsupportedOperationException();
        throw var98;
    }

    private void Ft(Canvas var1, float var2, float var3, float var4, float var5, float var6, int var7) {
        label270: {
            int var134;
            float var173;
            float var180;
            float var193;
            String var198;
            TextStyle var245;
            label269: {
                label281: {
                    int var9 = System.identityHashCode(this);
                    var173 = var5 - 6.0F;
                    var173 = Math.min(11.0F, var173);
                    var180 = var5 - var173;
                    var180 *= 0.5F;
                    var180 = var3 + var180;
                    sN_2 var12 = this.SG;
                    float var13 = var2 + 3.0F;
                    float var14 = var173 * 0.28F;
                    float var15 = var173 * var6;
                    var12.R(var1, var13, var180, var173, var14, var15);
                    var180 = var2 + var4;
                    var180 -= 5.0F;
                    var180 -= 10.0F;
                    var193 = var5 - 7.5F;
                    var193 *= 0.5F;
                    var193 = var3 + var193;
                    float[] var194 = this.i;
                    Integer var199 = var9;
                    label266:
                    if (var199 != null) {
                        var134 = var7 * -1066612901;
                        var134 -= -1673754845;
                        var134 >>= 14;
                        var134 |= 893357672;
                        var134 ^= 1303521133;
                        long var200 = var134;
                        long var16 = var200 + 1L;
                        var16 = var200 * var16;
                        long var18 = var200 + 2L;
                        var16 *= var18;
                        long var201 = var200 + 3L;
                        var16 *= var201;
                        long var202 = var16 & 7L;
                        long var320;
                        int var203 = (var320 = var202 - 0L) == 0L ? 0 : (var320 < 0L ? -1 : 1);
                        if (var203 != 0) {
                            break label270;
                        }

                        int var204 = this.rv;
                        ii.ZI(var1, var180, var193, 10.0F, 7.5F, var194, var204);
                        Object var184 = null;
                        FX var195 = this.IL;
                        if (var195 == null) {
                            var134 &= -21135257;
                            var134 ^= 1329098336;
                            Bp_2 var196 = this.Ki;
                            var198 = var196.notPlaying();
                            long var205 = var9;
                            var16 = var205 + 1L;
                            var16 = var205 * var16;
                            long var206 = var16 & 1L;
                            long var321;
                            int var207 = (var321 = var206 - 0L) == 0L ? 0 : (var321 < 0L ? -1 : 1);
                            if (var207 != 0) {
                                switch (var134) {
                                    case -883893573:
                                    default:
                                        var134 ^= -1242858454;
                                        break label266;
                                    case -46797209:
                                        var134 *= -1804540493;
                                        var134 |= -893505632;
                                        var134 &= 1302082379;
                                        var134 ^= -1610849029;
                                        break label266;
                                    case 1009877829:
                                        var134 ^= -2066768511;
                                        break label266;
                                }
                            }
                            var134 = switch (var134) {
                                default -> var134 ^ -1285969538;
                                case -537885076 -> var134 ^ 610039849;
                                case -46797209 -> {
                                    var134 ^= -118827466;
                                    var134 += 1940043570;
                                    var134 &= 227885048;
                                    yield var134 ^ 263520628;
                                }
                            };
                            long var208 = var134;
                            var16 = var208 + 1L;
                            var16 = var208 * var16;
                            long var209 = var16 & 1L;
                            long var322;
                            int var210 = (var322 = var209 - 0L) == 0L ? 0 : (var322 < 0L ? -1 : 1);
                            if (var210 != 0) {
                                break label270;
                            }

                            var198 = var198;
                            var134 |= 944936798;
                            var134 ^= -34748430;
                        } else {
                            var134 = switch (var134) {
                                default -> var134 ^ 930375233;
                                case -1303525353 -> {
                                    var134 -= 1014282514;
                                    var134 += 1321898147;
                                    var134 &= -222835678;
                                    yield var134 ^ -556064435;
                                }
                                case -1236060867 -> var134 ^ -5474513;
                            };
                            Integer var211 = var134;
                            if (var211 == null) {
                                break label270;
                            }

                            r_2 var212 = this.y;
                            int var246 = var9 + 1;
                            int var247 = var9 * var246;
                            int var248 = var247 & 1;
                            if (var248 != 0) {
                                switch (var134) {
                                    case -1629313020:
                                        var134 ^= 1655431560;
                                        break label266;
                                    case 511225197:
                                        var134 *= -1901875101;
                                        var134 >>>= 24;
                                        var134 |= 354799706;
                                        var134 ^= -968521984;
                                        break label266;
                                    case 1658572925:
                                    default:
                                        var134 ^= -419874989;
                                        break label266;
                                }
                            }

                            var134 *= 888359637;
                            var134 ^= 495332223;
                            int var249 = var134 + 1;
                            int var250 = var134 * var249;
                            int var294 = var134 + 2;
                            int var251 = var250 * var294;
                            int var295 = var134 + 3;
                            int var252 = var251 * var295;
                            int var253 = var252 & 7;
                            if (var253 != 0) {
                                break label270;
                            }

                            q_2 var254 = q_2.TITLE;
                            boolean var213 = var212.TJ(var254);
                            if (var213) {
                                var134 *= 601210465;
                                var134 -= -871086690;
                                var134 ^= 621281166;
                                int var214 = var134 + 1;
                                int var215 = var134 * var214;
                                int var255 = var134 + 2;
                                int var216 = var215 * var255;
                                int var256 = var134 + 3;
                                int var217 = var216 * var256;
                                int var218 = var217 & 7;
                                if (var218 != 0) {
                                    break label270;
                                }

                                FX var219 = this.IL;
                                String var220 = var219.title();
                                int var257 = var9 + 1;
                                int var258 = var9 * var257;
                                int var259 = var258 & 1;
                                if (var259 != 0) {
                                    var134 -= 882285660;
                                    var134 ^= -1723529640;
                                    break label266;
                                }

                                var134 -= 1469842660;
                                var134 ^= 153193253;
                                var134 += 904168388;
                                var134 |= 233419893;
                                var134 ^= -31025901;
                                var198 = var220;
                                var134 -= 222035587;
                                var134 &= 771803076;
                                var134 -= 421476368;
                                var134 -= -913638853;
                                var134 ^= -523408775;
                            } else {
                                var134 = switch (var134) {
                                    case -620173560 -> var134 ^ 750700776;
                                    case -494475570 -> {
                                        var134 |= -1639427064;
                                        yield var134 ^ 1857094048;
                                    }
                                    default -> var134 ^ 274248385;
                                };
                                Integer var221 = var134;
                                if (var221 == null) {
                                    break label270;
                                }

                                r_2 var222 = this.y;
                                q_2 var260 = q_2.LYRICS;
                                var16 = var9;
                                var18 = var16 + 1L;
                                var18 = var16 * var18;
                                var16 = var18 & 1L;
                                long var323;
                                int var298 = (var323 = var16 - 0L) == 0L ? 0 : (var323 < 0L ? -1 : 1);
                                if (var298 != 0) {
                                    var134 &= 173811657;
                                    var134 -= 837649598;
                                    var134 >>>= 23;
                                    var134 ^= -748661146;
                                    break label266;
                                }

                                var134 <<= 2;
                                var134 += 692695855;
                                var134 -= -1217326489;
                                var134 ^= 1921389596;
                                Integer var299 = var134;
                                if (var299 == null) {
                                    break label270;
                                }

                                boolean var223 = var222.TJ(var260);
                                if (var223) {
                                    var134 *= 736629049;
                                    var134 ^= -437768411;
                                    int var224 = var134 - -727626913;
                                    int var225 = var224 ^ -1568567729;
                                    String var226 = this.L(var225);
                                    int var261 = var9 + 1;
                                    int var262 = var9 * var261;
                                    int var300 = var9 + 2;
                                    int var263 = var262 * var300;
                                    int var301 = var9 + 3;
                                    int var264 = var263 * var301;
                                    int var265 = var264 & 7;
                                    if (var265 != 0) {
                                        var134 *= 1401340183;
                                        var134 *= -1741293049;
                                        var134 -= 918418240;
                                        var134 ^= -1106423523;
                                        var134 ^= 1578761758;
                                        break label266;
                                    }

                                    var134 >>>= 10;
                                    var134 += 1134404164;
                                    var134 += -1930866256;
                                    var134 ^= -474215166;
                                    String var271;
                                    if (var226 == null) {
                                        var134 = switch (var134) {
                                            default -> var134 ^ -290775476;
                                            case 856380803 -> {
                                                var134 += 280538616;
                                                var134 <<= 9;
                                                var134 ^= -1499318045;
                                                yield var134 ^ 2015492214;
                                            }
                                            case 907980403 -> var134 ^ -1008010890;
                                        };
                                        int var266 = var134 + 1;
                                        int var267 = var134 * var266;
                                        int var268 = var267 & 1;
                                        if (var268 != 0) {
                                            break label270;
                                        }

                                        FX var269 = this.IL;
                                        Integer var302 = var9;
                                        if (var302 == null) {
                                            var134 *= 75515219;
                                            var134 -= 1854633775;
                                            var134 <<= 12;
                                            var134 |= 392185213;
                                            var134 ^= 1677857415;
                                            break label266;
                                        }

                                        var134 >>= 30;
                                        var134 ^= -1354257322;
                                        Integer var303 = var134;
                                        if (var303 == null) {
                                            break label270;
                                        }

                                        String var270 = var269.title();
                                        var271 = var270;
                                        switch (var134) {
                                            case -1354257321:
                                                var134 &= -1006192112;
                                                var134 ^= 917164822;
                                                break;
                                            case -222256901:
                                                var134 ^= 391950499;
                                                break;
                                            case 703082970:
                                            default:
                                                var134 ^= 2005583442;
                                        }
                                    } else {
                                        var134 += -575286691;
                                        var134 ^= 1732145156;
                                        int var304 = var134 + 1;
                                        int var305 = var134 * var304;
                                        int var306 = var305 & 1;
                                        if (var306 != 0) {
                                            break label270;
                                        }

                                        var271 = var226;
                                        var134 += 312755755;
                                        var134 += -1775460531;
                                        var134 *= -1470042511;
                                        var134 >>>= 21;
                                        var134 ^= -1297319747;
                                    }

                                    int var227 = var134 + 1;
                                    int var228 = var134 * var227;
                                    int var307 = var134 + 2;
                                    int var229 = var228 * var307;
                                    int var308 = var134 + 3;
                                    int var230 = var229 * var308;
                                    int var231 = var230 & 7;
                                    if (var231 != 0) {
                                        break label270;
                                    }

                                    Integer var272 = var9;
                                    if (var272 == null) {
                                        var134 -= 1255680883;
                                        var134 -= -1526913421;
                                        var134 ^= 297238234;
                                        break label266;
                                    }

                                    var134 |= -328118020;
                                    var134 *= -1652653327;
                                    var134 += -1694939485;
                                    var134 ^= 1583747085;
                                    int var273 = var134 + 1;
                                    int var274 = var134 * var273;
                                    int var275 = var274 & 1;
                                    if (var275 != 0) {
                                        break label270;
                                    }

                                    var198 = var271;
                                    var134 <<= 19;
                                    var134 ^= 206822144;
                                    var134 <<= 6;
                                    var134 *= 670063469;
                                    var134 ^= 2027206668;
                                } else {
                                    var134 = switch (var134) {
                                        case -1050776932 -> {
                                            var134 *= 1990510065;
                                            var134 ^= -1333488219;
                                            var134 ^= 1976153340;
                                            var134 += -549447264;
                                            yield var134 ^ -1662160833;
                                        }
                                        default -> var134 ^ 1064091962;
                                        case 1450699681 -> var134 ^ 780968838;
                                    };
                                    var198 = (String)var184;
                                    var134 *= -526073639;
                                    var134 &= -429282888;
                                    var134 += 1101372664;
                                    var134 |= -1357231957;
                                    var134 ^= 746849959;
                                }
                            }
                        }

                        if (var198 == null) {
                            var134 -= -164434614;
                            var134 += 2115789049;
                            var134 ^= -29208150;
                            break label281;
                        }
                        var134 = switch (var134) {
                            default -> var134 ^ -523088865;
                            case -1382677061 -> var134 ^ 1459977640;
                            case -1013221364 -> {
                                var134 *= 1828636205;
                                yield var134 ^ -253471054;
                            }
                        };
                        Integer var185 = var134;
                        if (var185 == null) {
                            break label270;
                        }

                        boolean var186 = var198.isEmpty();
                        int var233 = var9 + 1;
                        int var234 = var9 * var233;
                        int var276 = var9 + 2;
                        int var235 = var234 * var276;
                        int var277 = var9 + 3;
                        int var236 = var235 * var277;
                        int var237 = var236 & 7;
                        if (var237 != 0) {
                            var134 >>>= 27;
                            var134 ^= -748660739;
                        } else {
                            var134 += 562038918;
                            var134 ^= 509343398;
                            Integer var238 = var134;
                            if (var238 == null) {
                                break label270;
                            }

                            if (var186) {
                                switch (var134) {
                                    case -331179399:
                                    default:
                                        var134 ^= -1390141155;
                                        break label281;
                                    case -296402596:
                                        var134 ^= 2087132663;
                                        break label281;
                                    case 1093323666:
                                        var134 <<= 19;
                                        var134 |= -1416968025;
                                        var134 <<= 4;
                                        var134 ^= 1282027617;
                                        break label281;
                                }
                            }
                            var134 = switch (var134) {
                                case 38027 -> var134 ^ -1326557047;
                                case 1093323666 -> {
                                    var134 |= -1562571061;
                                    var134 ^= 1231483811;
                                    var134 &= -1303295599;
                                    yield var134 ^ 1368077301;
                                }
                                default -> var134 ^ 1038774010;
                            };
                            var193 = var2 + 3.0F;
                            float var172 = var193 + var173;
                            var173 = var172 + 6.0F;
                            var180 -= 6.0F;
                            TextStyle var188 = this.JM;
                            var193 = var188.size();
                            var193 = var5 - var193;
                            var193 *= 0.5F;
                            var193 = var3 + var193;
                            var193 -= 0.2F;
                            var180 -= var173;
                            long var239 = var9;
                            var16 = var239 + 1L;
                            var16 = var239 * var16;
                            long var240 = var16 & 1L;
                            long var324;
                            int var241 = (var324 = var240 - 0L) == 0L ? 0 : (var324 < 0L ? -1 : 1);
                            if (var241 == 0) {
                                var134 = switch (var134) {
                                    default -> var134 ^ 675861708;
                                    case -207995931 -> {
                                        var134 *= -667778781;
                                        var134 += 524299432;
                                        yield var134 ^ -216288678;
                                    }
                                    case 1980089838 -> var134 ^ -94514461;
                                };
                                FX var242 = this.IL;
                                if (var242 == null) {
                                    var134 &= -1429850968;
                                    var134 *= -1753430951;
                                    var134 &= 720590090;
                                    var134 |= 249291237;
                                    var134 ^= -1513340344;
                                    Integer var243 = var134;
                                    if (var243 == null) {
                                        break label270;
                                    }

                                    var245 = this.St;
                                    int var278 = var9 + 1;
                                    int var279 = var9 * var278;
                                    int var280 = var279 & 1;
                                    if (var280 == 0) {
                                        var134 -= 991922609;
                                        var134 -= 592918918;
                                        var134 ^= -1720868931;
                                        var134 ^= 390176337;
                                        long var281 = var134;
                                        long var17 = var281 + 1L;
                                        var17 = var281 * var17;
                                        long var282 = var17 & 1L;
                                        long var325;
                                        int var283 = (var325 = var282 - 0L) == 0L ? 0 : (var325 < 0L ? -1 : 1);
                                        if (var283 != 0) {
                                            break label270;
                                        }

                                        var245 = var245;
                                        switch (var134) {
                                            case -1567825534:
                                                var134 *= 1404305971;
                                                var134 -= 1132093315;
                                                var134 ^= 2114718457;
                                                break label269;
                                            case -502143757:
                                            default:
                                                var134 ^= 1745937628;
                                                break label269;
                                            case 1018421525:
                                                var134 ^= -1881469859;
                                                break label269;
                                        }
                                    }

                                    var134 -= 1462897141;
                                    var134 ^= 1956974749;
                                    var134 += 349503959;
                                    var134 *= -1993092901;
                                    var134 ^= -833782890;
                                } else {
                                    var134 *= -435222159;
                                    var134 >>>= 7;
                                    var134 ^= 1188677720;
                                    TextStyle var284 = this.JM;
                                    Integer var163 = var9;
                                    if (var163 != null) {
                                        var134 ^= 449159600;
                                        var134 ^= -2033683633;
                                        var16 = var134;
                                        var18 = var16 + 1L;
                                        var18 = var16 * var18;
                                        var16 = var18 & 1L;
                                        long var326;
                                        int var164 = (var326 = var16 - 0L) == 0L ? 0 : (var326 < 0L ? -1 : 1);
                                        if (var164 != 0) {
                                            break label270;
                                        }

                                        var245 = var284;
                                        var134 >>= 13;
                                        var134 ^= 1815298465;
                                        break label269;
                                    }

                                    var134 |= -1483816429;
                                    var134 -= 1383919244;
                                    var134 ^= 1177703549;
                                }
                            } else {
                                var134 += -1380880975;
                                var134 *= -214811843;
                                var134 |= -1940095087;
                                var134 ^= 1058842693;
                            }
                        }
                    } else {
                        var134 = var7 >>> 23;
                        var134 ^= -748661042;
                    }

                    Integer var160 = var134;
                    if (var160 != null) {
                        UnsupportedOperationException var161 = new UnsupportedOperationException();
                        throw var161;
                    }
                    break label270;
                }

                int var168 = var134 + 1;
                var168 = var134 * var168;
                var168 &= 1;
                if (var168 == 0) {
                    return;
                }
                break label270;
            }

            long var285 = var134;
            long var314 = var285 + 1L;
            var314 = var285 * var314;
            var285 = var314 & 1L;
            long var327;
            int var165 = (var327 = var285 - 0L) == 0L ? 0 : (var327 < 0L ? -1 : 1);
            if (var165 == 0) {
                var165 = var134 & 1484614270;
                var165 ^= 502980971;
                this.dt(var1, var198, var173, var193, var180, var245, var165);
                return;
            }
        }

        UnsupportedOperationException var162 = new UnsupportedOperationException();
        throw var162;
    }

    private void Sv(Canvas var1, float var2, float var3, float var4, float var5, float var6, int var7) {
        label131: {
            int var9 = System.identityHashCode(this);
            float var10 = this.ET;
            var10 = var4 - var10;
            var10 *= 0.5F;
            var10 = var2 + var10;
            float var11 = this.ET;
            float var12 = 37.0F;
            int var13 = var9 + 1;
            var13 = var9 * var13;
            int var14 = var9 + 2;
            var13 *= var14;
            var14 = var9 + 3;
            var13 *= var14;
            var13 &= 7;
            int var8;
            if (var13 != 0) {
                switch (var7) {
                    case -1250205030:
                    default:
                        var8 = var7 ^ -740247683;
                        break;
                    case -457125486:
                        var8 = var7 - 2053490896;
                        var8 += -1012343771;
                        var8 ^= 1372182123;
                        break;
                    case 893963027:
                        var8 = var7 ^ -2069741107;
                }
            } else {
                label133: {
                    var8 = var7 & 1343999805;
                    var8 *= 1236734077;
                    var8 += 783920478;
                    var8 -= -355223789;
                    var8 ^= 908754573;
                    Integer var126 = var8;
                    if (var126 == null) {
                        break label131;
                    }

                    float var127 = var10 + 6.0F;
                    float var149 = var12 - 26.0F;
                    float var150 = var149 * 0.5F;
                    float var151 = var3 + var150;
                    sN_2 var15 = this.SG;
                    float var16 = 26.0F * var6;
                    var15.R(var1, var127, var151, 26.0F, 6.5F, var16);
                    var10 += var11;
                    var10 -= 8.0F;
                    var10 -= 10.0F;
                    var11 = var12 - 9.0F;
                    var11 *= 0.5F;
                    var11 = var3 + var11;
                    float[] var116 = this.i;
                    var14 = this.rv;
                    ii.ZI(var1, var10, var11, 10.0F, 9.0F, var116, var14);
                    var11 = var127 + 26.0F;
                    var11 += 8.0F;
                    var10 -= 8.0F;
                    var10 -= var11;
                    FX var117 = this.IL;
                    String var120;
                    if (var117 != null) {
                        var8 = switch (var8) {
                            case -1332541358 -> var8 ^ -939778309;
                            case 351225238 -> {
                                var8 += -1384073941;
                                var8 *= 62386587;
                                yield var8 ^ -1789988743;
                            }
                            default -> var8 ^ 969627260;
                        };
                        FX var118 = this.IL;
                        String var119 = var118.title();
                        var126 = var9;
                        if (var126 == null) {
                            var8 |= 1068059200;
                            var8 ^= 1081559406;
                            break label133;
                        }

                        var8 |= -121976484;
                        var8 += 781651318;
                        var8 ^= 2127138090;
                        long var129 = var8;
                        long var177 = var129 + 1L;
                        long var178 = var129 * var177;
                        long var17 = var129 + 2L;
                        long var179 = var178 * var17;
                        long var130 = var129 + 3L;
                        long var180 = var179 * var130;
                        long var131 = var180 & 7L;
                        long var206;
                        int var132 = (var206 = var131 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                        if (var132 != 0) {
                            break label131;
                        }

                        var120 = var119;
                        var8 *= 296954859;
                        var8 ^= -1396077657;
                    } else {
                        var8 *= 1788002505;
                        var8 *= 1112166217;
                        var8 >>>= 10;
                        var8 |= -867698536;
                        var8 ^= 240942608;
                        long var133 = var8;
                        long var181 = var133 + 1L;
                        long var182 = var133 * var181;
                        long var134 = var182 & 1L;
                        long var207;
                        int var135 = (var207 = var134 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                        if (var135 != 0) {
                            break label131;
                        }

                        Bp_2 var136 = this.Ki;
                        String var137 = var136.notPlaying();
                        long var153 = var9;
                        long var190 = var153 + 1L;
                        long var191 = var153 * var190;
                        long var154 = var191 & 1L;
                        long var208;
                        var14 = (var208 = var154 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                        if (var14 != 0) {
                            var8 ^= 2030026734;
                            var8 >>= 3;
                            var8 += -464573146;
                            var8 ^= -1537047034;
                            break label133;
                        }

                        var8 *= -2124572697;
                        var8 += -1815429257;
                        var8 += 2111589001;
                        var8 &= 1489136873;
                        var8 ^= 1879816874;
                        Integer var156 = var8;
                        if (var156 == null) {
                            break label131;
                        }

                        var120 = var137;
                        var8 -= -1070233127;
                        var8 &= 1825743650;
                        var8 ^= 1453377263;
                    }

                    var126 = var8;
                    if (var126 == null) {
                        break label131;
                    }

                    var126 = var9;
                    if (var126 == null) {
                        var8 -= -312443314;
                        var8 ^= 1143004904;
                        var8 -= 1563129109;
                        var8 *= -1976869365;
                        var8 ^= -1346091846;
                    } else {
                        label136: {
                            var8 += -1777439691;
                            var8 &= 1754312257;
                            var8 += -615524578;
                            var8 += 481020393;
                            var8 ^= 1103641208;
                            int var140 = var8 + 1;
                            var140 = var8 * var140;
                            var140 &= 1;
                            if (var140 != 0) {
                                break label131;
                            }

                            FX var143 = this.IL;
                            String var147;
                            if (var143 != null) {
                                var8 &= 1435105434;
                                var8 += -923758170;
                                var8 &= 1022010922;
                                var8 ^= -1311708392;
                                Integer var144 = var8;
                                if (var144 == null) {
                                    break label131;
                                }

                                FX var145 = this.IL;
                                long var157 = var9;
                                long var192 = var157 + 1L;
                                long var193 = var157 * var192;
                                long var18 = var157 + 2L;
                                long var194 = var193 * var18;
                                long var158 = var157 + 3L;
                                long var195 = var194 * var158;
                                long var159 = var195 & 7L;
                                long var209;
                                var14 = (var209 = var159 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                                if (var14 != 0) {
                                    var8 |= -251876831;
                                    var8 -= 834674811;
                                    var8 ^= 256411837;
                                    var8 ^= -1195609969;
                                    break label136;
                                }
                                var8 = switch (var8) {
                                    case -1187878120 -> {
                                        var8 |= -1989742541;
                                        var8 &= -1876313192;
                                        var8 ^= 786916195;
                                        yield var8 ^ 70981787;
                                    }
                                    default -> var8 ^ -1185277983;
                                    case 1211753314 -> var8 ^ -778578555;
                                };
                                long var161 = var8;
                                long var196 = var161 + 1L;
                                long var197 = var161 * var196;
                                long var162 = var197 & 1L;
                                long var210;
                                var14 = (var210 = var162 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                                if (var14 != 0) {
                                    break label131;
                                }

                                String var146 = var145.artist();
                                var147 = var146;
                                var8 ^= -791778771;
                                var8 ^= 653789012;
                            } else {
                                var8 += -2145730015;
                                var8 &= 326320089;
                                var8 -= -1115563995;
                                var8 ^= -177537624;
                                var14 = var8 + 1;
                                var14 = var8 * var14;
                                int var183 = var8 + 2;
                                var14 *= var183;
                                int var184 = var8 + 3;
                                var14 *= var184;
                                var14 &= 7;
                                if (var14 != 0) {
                                    break label131;
                                }

                                Bp_2 var169 = this.Ki;
                                long var185 = var9;
                                long var202 = var185 + 1L;
                                var202 = var185 * var202;
                                long var19 = var185 + 2L;
                                var202 *= var19;
                                long var186 = var185 + 3L;
                                var202 *= var186;
                                long var187 = var202 & 7L;
                                long var211;
                                int var188 = (var211 = var187 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                                if (var188 != 0) {
                                    var8 >>= 12;
                                    var8 ^= -2144249567;
                                    break label136;
                                }
                                var8 = switch (var8) {
                                    case -1317821651 -> var8 ^ 877512606;
                                    case -1229269773 -> {
                                        var8 *= -326497225;
                                        var8 >>>= 13;
                                        yield var8 ^ -1651044080;
                                    }
                                    default -> var8 ^ -1874102555;
                                };
                                String var170 = var169.idleHint();
                                var147 = var170;
                                var8 -= 646656950;
                                var8 ^= 1003289562;
                            }

                            long var171 = var8;
                            long var198 = var171 + 1L;
                            long var199 = var171 * var198;
                            long var172 = var199 & 1L;
                            long var212;
                            var14 = (var212 = var172 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                            if (var14 != 0) {
                                break label131;
                            }

                            float var174 = var3 + 8.6F;
                            TextStyle var189 = this.vI;
                            int var200 = var8 ^ -1000643806;
                            int var201 = var200 ^ -2061097526;
                            this.dt(var1, var120, var11, var174, var10, var189, var201);
                            nE var121 = this.ic;
                            Integer var96 = var9;
                            if (var96 != null) {
                                var8 -= -737822545;
                                var8 >>>= 22;
                                var8 &= -1984439197;
                                var8 -= -573491725;
                                var8 ^= 448427622;
                                long var85 = var8;
                                long var175 = var85 + 1L;
                                long var176 = var85 * var175;
                                long var86 = var176 & 1L;
                                long var213;
                                var8 = (var213 = var86 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                                if (var8 == 0) {
                                    TextStyle var88 = this.zm;
                                    String var89 = var121.Mh(var1, var147, var88, var10);
                                    float var97 = var3 + 20.3F;
                                    TextStyle var110 = this.zm;
                                    float var90 = var1.text(var89, var11, var97, var110);
                                    return;
                                }
                                break label131;
                            }

                            var8 ^= 1635330205;
                            var8 ^= 1383708552;
                        }
                    }
                }
            }

            var9 = var8 + 1;
            var9 = var8 * var9;
            var9 &= 1;
            if (var9 == 0) {
                IllegalArgumentException var101 = new IllegalArgumentException();
                throw var101;
            }
        }

        AssertionError var95 = new AssertionError();
        throw var95;
    }

    private void Rd(Canvas var1, lH_3 var2, float var3, float var4, float var5, float var6, float var7, int var8) {
        int var10 = System.identityHashCode(this);
        float var11 = var5 - 240.0F;
        var11 *= 0.5F;
        var11 = var3 + var11;
        long var12 = var10;
        long var14 = var12 + 1L;
        var14 = var12 * var14;
        var12 = var14 & 1L;
        long var801;
        int var410 = (var801 = var12 - 0L) == 0L ? 0 : (var801 < 0L ? -1 : 1);
        if (var410 != 0) {
            switch (var8) {
                case -55472071:
                    int var391 = var8 ^ 1093894401;
                    break;
                case 539725605:
                default:
                    int var390 = var8 ^ -1624684496;
                    break;
                case 1637041227:
                    int var385 = var8 & -1213214598;
                    var385 += 553916072;
                    var385 *= 170850007;
                    var385 >>= 21;
                    var385 ^= 1369691447;
            }
        } else {
            label665: {
                int var9 = var8 | -321786191;
                var9 >>= 29;
                var9 -= -729131577;
                var9 ^= 1241832239;
                var12 = var9;
                var14 = var12 + 1L;
                var14 = var12 * var14;
                long var16 = var12 + 2L;
                var14 *= var16;
                var12 += 3L;
                var14 *= var12;
                var12 = var14 & 7L;
                long var802;
                int var414 = (var802 = var12 - 0L) == 0L ? 0 : (var802 < 0L ? -1 : 1);
                label560:
                if (var414 == 0) {
                    float var415 = 240.0F;
                    FX var13 = this.IL;
                    if (var13 != null) {
                        var9 ^= -1730721359;
                        var9 <<= 27;
                        var9 ^= -62977520;
                        int var422 = var9 + 1;
                        int var423 = var9 * var422;
                        int var476 = var9 + 2;
                        int var424 = var423 * var476;
                        int var477 = var9 + 3;
                        int var425 = var424 * var477;
                        int var426 = var425 & 7;
                        if (var426 != 0) {
                            break label560;
                        }

                        sN_2 var427 = this.SG;
                        boolean var428 = var427.J();
                        var14 = var10;
                        var16 = var14 + 1L;
                        var16 = var14 * var16;
                        long var18 = var14 + 2L;
                        var16 *= var18;
                        var14 += 3L;
                        var16 *= var14;
                        var14 = var16 & 7L;
                        long var803;
                        int var481 = (var803 = var14 - 0L) == 0L ? 0 : (var803 < 0L ? -1 : 1);
                        if (var481 != 0) {
                            var9 >>>= 9;
                            var9 ^= 1371916983;
                            break label665;
                        }
                        var9 = switch (var9) {
                            case -1218489835 -> var9 ^ 22946159;
                            case -868283888 -> {
                                var9 *= -1436609561;
                                var9 &= 346885185;
                                yield var9 ^ -234367863;
                            }
                            default -> var9 ^ -1653284337;
                        };
                        var14 = var9;
                        var16 = var14 + 1L;
                        var16 = var14 * var16;
                        var18 = var14 + 2L;
                        var16 *= var18;
                        var14 += 3L;
                        var16 *= var14;
                        var14 = var16 & 7L;
                        long var804;
                        int var485 = (var804 = var14 - 0L) == 0L ? 0 : (var804 < 0L ? -1 : 1);
                        if (var485 != 0) {
                            break label560;
                        }

                        if (var428) {
                            var9 = switch (var9) {
                                case -1812128802 -> var9 ^ -897074387;
                                case -427372343 -> {
                                    var9 ^= -2036513925;
                                    var9 += 382552219;
                                    yield var9 ^ 1106043231;
                                }
                                default -> var9 ^ -1024582309;
                            };
                            Integer var429 = var9;
                            if (var429 == null) {
                                break label560;
                            }

                            Paint var430 = this.WG;
                            var14 = var10;
                            var16 = var14 + 1L;
                            var16 = var14 * var16;
                            var18 = var14 + 2L;
                            var16 *= var18;
                            var14 += 3L;
                            var16 *= var14;
                            var14 = var16 & 7L;
                            long var805;
                            int var489 = (var805 = var14 - 0L) == 0L ? 0 : (var805 < 0L ? -1 : 1);
                            if (var489 != 0) {
                                var9 <<= 23;
                                var9 ^= -1190142302;
                                var9 ^= 1638665104;
                                break label665;
                            }

                            label597: {
                                var9 |= -128685218;
                                var9 *= -909385425;
                                var9 ^= -2031618103;
                                if (var430 != null) {
                                    var9 ^= -1332728913;
                                    var9 -= -2120348047;
                                    var9 ^= -1144276468;
                                    int var431 = this.zE;
                                    int var490 = this.rv;
                                    long var15 = var10;
                                    long var17 = var15 + 1L;
                                    var17 = var15 * var17;
                                    var15 = var17 & 1L;
                                    long var806;
                                    int var529 = (var806 = var15 - 0L) == 0L ? 0 : (var806 < 0L ? -1 : 1);
                                    if (var529 != 0) {
                                        var9 -= 92239506;
                                        var9 ^= 527139388;
                                        var9 *= -267560905;
                                        var9 &= -1675957630;
                                        var9 ^= -642656848;
                                        break label665;
                                    }
                                    var9 = switch (var9) {
                                        default -> var9 ^ 260850466;
                                        case -1254301692 -> var9 ^ -2062333401;
                                        case -31361089 -> {
                                            var9 &= 559021416;
                                            var9 |= -538354856;
                                            var9 -= -478104751;
                                            yield var9 ^ 1128252416;
                                        }
                                    };
                                    if (var431 == var490) {
                                        switch (var9) {
                                            case 485549955:
                                                var9 ^= 1543007011;
                                                break label597;
                                            case 1469463002:
                                            default:
                                                var9 ^= -2091794138;
                                                break label597;
                                            case 1599539239:
                                                var9 ^= -2029811481;
                                                var9 ^= 724423409;
                                                var9 -= 993261533;
                                                var9 ^= -921619047;
                                                break label597;
                                        }
                                    }

                                    var9 &= -809848685;
                                    var9 &= -1905013309;
                                    var9 ^= 2027352952;
                                    var9 ^= 1005864923;
                                } else {
                                    var9 -= 46982263;
                                    var9 += 2038869775;
                                    var9 ^= -2049849957;
                                    var9 ^= 624145176;
                                }

                                long var432 = var9;
                                long var530 = var432 + 1L;
                                var530 = var432 * var530;
                                long var603 = var432 + 2L;
                                var530 *= var603;
                                long var433 = var432 + 3L;
                                var530 *= var433;
                                long var434 = var530 & 7L;
                                long var807;
                                int var435 = (var807 = var434 - 0L) == 0L ? 0 : (var807 < 0L ? -1 : 1);
                                if (var435 != 0) {
                                    break label560;
                                }

                                int var436 = this.rv;
                                this.zE = var436;
                                int var437 = this.rv;
                                int var438 = DP.Y(var437, 0.2F);
                                int var491 = this.rv;
                                int var534 = var10 + 1;
                                int var535 = var10 * var534;
                                int var536 = var535 & 1;
                                if (var536 != 0) {
                                    var9 *= 1690329063;
                                    var9 &= -1023661326;
                                    var9 += 1049874015;
                                    var9 ^= -299367539;
                                    break label665;
                                }

                                var9 -= -1224702569;
                                var9 |= 1362354821;
                                var9 ^= -1395664628;
                                Integer var537 = var9;
                                if (var537 == null) {
                                    break label560;
                                }

                                int var492 = DP.Y(var491, 0.0F);
                                Paint var439 = Paint.radial(var438, var492);
                                this.WG = var439;
                                var9 += -2110692572;
                                var9 += -1559314957;
                                var9 |= -2129130468;
                                var9 >>= 15;
                                var9 ^= -1901384267;
                            }

                            Integer var440 = var9;
                            if (var440 == null) {
                                break label560;
                            }

                            float var441 = var11 + 12.0F;
                            float var442 = var441 + 18.0F;
                            float var493 = var4 + 12.0F;
                            float var494 = var493 + 18.0F;
                            int var538 = var10 + 1;
                            var538 = var10 * var538;
                            var538 &= 1;
                            if (var538 != 0) {
                                var9 &= -2131075768;
                                var9 &= 399396315;
                                var9 ^= 1373870202;
                                break label665;
                            }

                            var9 >>= 16;
                            var9 += 1216369502;
                            var9 *= 833885451;
                            var9 *= 1267589959;
                            var9 ^= 1346920362;
                            Paint var541 = this.WG;
                            var1.circle(var442, var494, 74.0F, var541);
                            switch (var9) {
                                case -1973902176:
                                    var9 <<= 11;
                                    var9 ^= -398121919;
                                    var9 <<= 20;
                                    var9 |= 808633943;
                                    var9 ^= -157915468;
                                    break;
                                case -440932194:
                                default:
                                    var9 ^= 1862915520;
                                    break;
                                case 98100991:
                                    var9 ^= 65760562;
                            }
                        } else {
                            var9 &= 534266673;
                            var9 ^= -2077957918;
                        }
                    } else {
                        switch (var9) {
                            case -759145210:
                            default:
                                var9 ^= 408882973;
                                break;
                            case 454120691:
                                var9 ^= 55435002;
                                break;
                            case 1634824471:
                                var9 -= 1643390125;
                                var9 -= 996598498;
                                var9 *= 1372469735;
                                var9 ^= 1670127963;
                        }
                    }

                    int var443 = var9 + 1;
                    int var444 = var9 * var443;
                    int var445 = var444 & 1;
                    if (var445 == 0) {
                        sN_2 var446 = this.SG;
                        float var495 = var11 + 12.0F;
                        float var542 = var4 + 12.0F;
                        float var566 = 36.0F * var7;
                        var446.R(var1, var495, var542, 36.0F, 8.5F, var566);
                        float var447 = var11 + 12.0F;
                        float var448 = var447 + 36.0F;
                        float var449 = var448 + 10.0F;
                        float var496 = var11 + var415;
                        float var497 = var496 - 12.0F;
                        float var498 = var497 - 10.0F;
                        var498--;
                        var542 = var498 - 10.0F;
                        Integer var567 = var10;
                        if (var567 == null) {
                            var9 >>>= 10;
                            var9 *= -1329407589;
                            var9 ^= 584746506;
                            break label665;
                        }
                        var9 = switch (var9) {
                            case -2103140125 -> {
                                var9 -= -91780862;
                                yield var9 ^ 1534070696;
                            }
                            default -> var9 ^ -1196659456;
                            case 1307472017 -> var9 ^ 2140971730;
                        };
                        Integer var568 = var9;
                        label542:
                        if (var568 != null) {
                            var542 -= var449;
                            If var569 = this.s;
                            Cj var572;
                            if (var569 != null) {
                                var9 &= -1597143638;
                                var9 ^= -4464239;
                                var9 ^= -1700604331;
                                var9 |= 883018935;
                                var9 ^= 1915097395;
                                If var570 = this.s;
                                long var604 = var10;
                                long var19 = var604 + 1L;
                                var19 = var604 * var19;
                                long var21 = var604 + 2L;
                                var19 *= var21;
                                var604 += 3L;
                                var19 *= var604;
                                var604 = var19 & 7L;
                                long var808;
                                int var607 = (var808 = var604 - 0L) == 0L ? 0 : (var808 < 0L ? -1 : 1);
                                if (var607 != 0) {
                                    var9 -= -1332933376;
                                    var9 += -358836134;
                                    var9 -= -36534602;
                                    var9 ^= -134199387;
                                    var9 ^= 1840472551;
                                    break label665;
                                }

                                var9 <<= 30;
                                var9 &= 1672257851;
                                var9 += 751717511;
                                var9 ^= 306322185;
                                var604 = var9;
                                var19 = var604 + 1L;
                                var19 = var604 * var19;
                                var21 = var604 + 2L;
                                var19 *= var21;
                                var604 += 3L;
                                var19 *= var604;
                                var604 = var19 & 7L;
                                long var809;
                                int var611 = (var809 = var604 - 0L) == 0L ? 0 : (var809 < 0L ? -1 : 1);
                                if (var611 != 0) {
                                    break label542;
                                }

                                Cj var571 = var570.L();
                                var572 = var571;
                                var9 -= 697990795;
                                var9 ^= -1405150385;
                                var9 >>>= 22;
                                var9 >>= 25;
                                var9 ^= 393652306;
                            } else {
                                var9 >>>= 1;
                                var9 += -28876099;
                                var9 ^= 350972096;
                                var9 += 530184107;
                                var9 ^= 946859200;
                                long var612 = var9;
                                long var649 = var612 + 1L;
                                var649 = var612 * var649;
                                var612 = var649 & 1L;
                                long var810;
                                int var614 = (var810 = var612 - 0L) == 0L ? 0 : (var810 < 0L ? -1 : 1);
                                if (var614 != 0) {
                                    break label542;
                                }

                                Cj var615 = Cj.OFF;
                                Integer var632 = var10;
                                if (var632 == null) {
                                    var9 -= 51527142;
                                    var9 -= -1712937031;
                                    var9 ^= 1548058207;
                                    break label665;
                                }

                                var9 += -1560560764;
                                var9 ^= 1229828971;
                                var9 ^= 151202551;
                                var9 |= 1653062527;
                                var9 ^= -136219403;
                                var572 = var615;
                                var9 |= -549393501;
                                var9 += 1559497574;
                                var9 ^= 723279683;
                            }

                            FX var616 = this.IL;
                            int var633 = var10 + 1;
                            var633 = var10 * var633;
                            var633 &= 1;
                            if (var633 != 0) {
                                switch (var9) {
                                    case 393652306:
                                        var9 ^= -1394820955;
                                        var9 |= 133232727;
                                        var9 >>>= 21;
                                        var9 ^= 1369690317;
                                        break label665;
                                    case 652902526:
                                    default:
                                        var9 ^= -1267325934;
                                        break label665;
                                    case 908672043:
                                        var9 ^= 865819772;
                                        break label665;
                                }
                            }

                            var9 <<= 5;
                            var9 ^= 840279803;
                            String var620;
                            String var638;
                            if (var616 != null) {
                                var9 |= -1062884469;
                                var9 ^= 1279652392;
                                var9 *= -1836820989;
                                var9 ^= -1422130916;
                                Integer var617 = var9;
                                if (var617 == null) {
                                    break label542;
                                }

                                var616 = this.IL;
                                String var619 = var616.title();
                                FX var636 = this.IL;
                                String var637 = var636.artist();
                                int var651 = var10 + 1;
                                var651 = var10 * var651;
                                int var20 = var10 + 2;
                                var651 *= var20;
                                var20 = var10 + 3;
                                var651 *= var20;
                                var651 &= 7;
                                if (var651 != 0) {
                                    var9 += -1122820364;
                                    var9 &= -1858800854;
                                    var9 ^= -1052011152;
                                    var9 <<= 1;
                                    var9 ^= -782902334;
                                    break label665;
                                }
                                var9 = switch (var9) {
                                    default -> var9 ^ -1913497407;
                                    case 203455397 -> {
                                        var9 ^= -73996303;
                                        var9 |= -757568414;
                                        yield var9 ^ 562333033;
                                    }
                                    case 1468363863 -> var9 ^ 1325381306;
                                };
                                var620 = var619;
                                var638 = var637;
                                var9 -= -1994088522;
                                var9 |= 2061200658;
                                var9 <<= 7;
                                var9 |= 1124665898;
                                var9 ^= -1536987418;
                            } else {
                                var9 &= -352094008;
                                var9 >>= 25;
                                var9 &= 1957317379;
                                var9 ^= -747912611;
                                Integer var656 = var9;
                                if (var656 == null) {
                                    break label542;
                                }

                                Cj var657 = Cj.DENIED;
                                int var705 = var10 + 1;
                                var705 = var10 * var705;
                                var705 &= 1;
                                if (var705 != 0) {
                                    switch (var9) {
                                        case -1732192764:
                                        default:
                                            var9 ^= -1912544454;
                                            break label665;
                                        case -1480488611:
                                            var9 <<= 18;
                                            var9 &= -1095753879;
                                            var9 ^= 1972622642;
                                            break label665;
                                        case 1584792142:
                                            var9 ^= -1647552228;
                                            break label665;
                                    }
                                }

                                var9 |= 683506412;
                                var9 ^= -1137721471;
                                long var708 = var9;
                                long var22 = var708 + 1L;
                                var22 = var708 * var22;
                                long var24 = var708 + 2L;
                                var22 *= var24;
                                long var709 = var708 + 3L;
                                var22 *= var709;
                                long var710 = var22 & 7L;
                                long var811;
                                var705 = (var811 = var710 - 0L) == 0L ? 0 : (var811 < 0L ? -1 : 1);
                                if (var705 != 0) {
                                    break label542;
                                }

                                if (var572 == var657) {
                                    var9 = switch (var9) {
                                        default -> var9 ^ 184443611;
                                        case 35334635 -> var9 ^ -1028291720;
                                        case 332547196 -> {
                                            var9 |= -1237218907;
                                            var9 += -1620889143;
                                            yield var9 ^ -1830877368;
                                        }
                                    };
                                    long var658 = var9;
                                    long var756 = var658 + 1L;
                                    var756 = var658 * var756;
                                    long var23 = var658 + 2L;
                                    var756 *= var23;
                                    long var659 = var658 + 3L;
                                    var756 *= var659;
                                    long var660 = var756 & 7L;
                                    long var812;
                                    int var661 = (var812 = var660 - 0L) == 0L ? 0 : (var812 < 0L ? -1 : 1);
                                    if (var661 != 0) {
                                        break label542;
                                    }

                                    Bp_2 var662 = this.Ki;
                                    String var663 = var662.denied();
                                    Bp_2 var712 = this.Ki;
                                    String var713 = var712.deniedHint();
                                    Integer var760 = var10;
                                    if (var760 == null) {
                                        switch (var9) {
                                            case -974522226:
                                                var9 *= 1281069161;
                                                var9 -= -1435432511;
                                                var9 ^= -244572849;
                                                break label665;
                                            case 701980985:
                                            default:
                                                var9 ^= -71232411;
                                                break label665;
                                            case 1664033545:
                                                var9 ^= 427504398;
                                                break label665;
                                        }
                                    }
                                    var9 = switch (var9) {
                                        case -974522226 -> {
                                            var9 |= 1526809035;
                                            var9 >>>= 25;
                                            var9 -= 855422122;
                                            yield var9 ^ -2103967471;
                                        }
                                        case -927221706 -> var9 ^ -743238429;
                                        default -> var9 ^ 1943627531;
                                    };
                                    Integer var761 = var9;
                                    if (var761 == null) {
                                        break label542;
                                    }

                                    var620 = var663;
                                    var638 = var713;
                                    switch (var9) {
                                        case 1335577300:
                                            var9 <<= 10;
                                            var9 -= 860003849;
                                            var9 -= -560336936;
                                            var9 ^= 282202963;
                                            break;
                                        case 1739670942:
                                            var9 ^= -289576460;
                                            break;
                                        case 1924232679:
                                        default:
                                            var9 ^= -1389754526;
                                    }
                                } else {
                                    var9 = switch (var9) {
                                        case -1329610399 -> var9 ^ 396557862;
                                        default -> var9 ^ -56223570;
                                        case 332547196 -> {
                                            var9 *= 808993439;
                                            var9 &= 623381185;
                                            var9 <<= 30;
                                            yield var9 ^ 1740588582;
                                        }
                                    };
                                    int var664 = var9 + 1;
                                    var664 = var9 * var664;
                                    var664 &= 1;
                                    if (var664 != 0) {
                                        break label542;
                                    }

                                    Cj var667 = Cj.MISSING_TOOL;
                                    long var714 = var10;
                                    var22 = var714 + 1L;
                                    var22 = var714 * var22;
                                    var24 = var714 + 2L;
                                    var22 *= var24;
                                    long var715 = var714 + 3L;
                                    var22 *= var715;
                                    long var716 = var22 & 7L;
                                    long var813;
                                    var705 = (var813 = var716 - 0L) == 0L ? 0 : (var813 < 0L ? -1 : 1);
                                    if (var705 != 0) {
                                        var9 += -1002826696;
                                        var9 &= -921424213;
                                        var9 += 296547799;
                                        var9 ^= 1260333779;
                                        break label665;
                                    }
                                    var9 = switch (var9) {
                                        case -2072353686 -> var9 ^ -84996175;
                                        default -> var9 ^ -1216126190;
                                        case 1740588582 -> {
                                            var9 >>>= 19;
                                            var9 |= -283471068;
                                            var9 ^= 1752506266;
                                            var9 <<= 12;
                                            yield var9 ^ 1486089951;
                                        }
                                    };
                                    var705 = var9 + 1;
                                    var705 = var9 * var705;
                                    var705 &= 1;
                                    if (var705 != 0) {
                                        break label542;
                                    }

                                    if (var572 == var667) {
                                        var9 = switch (var9) {
                                            case -1600831777 -> {
                                                var9 += -1379226485;
                                                yield var9 ^ -1068563854;
                                            }
                                            default -> var9 ^ -642553219;
                                            case 829102257 -> var9 ^ -611741346;
                                        };
                                        long var668 = var9;
                                        long var762 = var668 + 1L;
                                        var762 = var668 * var762;
                                        long var794 = var668 + 2L;
                                        var762 *= var794;
                                        long var669 = var668 + 3L;
                                        var762 *= var669;
                                        long var670 = var762 & 7L;
                                        long var814;
                                        var664 = (var814 = var670 - 0L) == 0L ? 0 : (var814 < 0L ? -1 : 1);
                                        if (var664 != 0) {
                                            break label542;
                                        }

                                        Bp_2 var672 = this.Ki;
                                        String var673 = var672.notPlaying();
                                        long var721 = var10;
                                        var22 = var721 + 1L;
                                        var22 = var721 * var22;
                                        var24 = var721 + 2L;
                                        var22 *= var24;
                                        long var722 = var721 + 3L;
                                        var22 *= var722;
                                        long var723 = var22 & 7L;
                                        long var815;
                                        var705 = (var815 = var723 - 0L) == 0L ? 0 : (var815 < 0L ? -1 : 1);
                                        if (var705 != 0) {
                                            var9 += 1323289826;
                                            var9 ^= -1923915576;
                                            break label665;
                                        }

                                        var9 <<= 12;
                                        var9 += -1138677808;
                                        var9 |= -32266253;
                                        var9 ^= -1490976926;
                                        var705 = var9 + 1;
                                        var705 = var9 * var705;
                                        int var766 = var9 + 2;
                                        var705 *= var766;
                                        int var767 = var9 + 3;
                                        var705 *= var767;
                                        var705 &= 7;
                                        if (var705 != 0) {
                                            break label542;
                                        }

                                        Bp_2 var730 = this.Ki;
                                        String var731 = var730.missingTool();
                                        var620 = var673;
                                        var638 = var731;
                                        var9 >>>= 25;
                                        var9 ^= 45989412;
                                        var9 *= -643957747;
                                        var9 |= -731782420;
                                        var9 ^= -1234749536;
                                    } else {
                                        var9 ^= -1497677748;
                                        var9 += 710626974;
                                        var9 ^= 529813733;
                                        var9 ^= 680078929;
                                        var664 = var9 + 1;
                                        var664 = var9 * var664;
                                        var705 = var9 + 2;
                                        var664 *= var705;
                                        var705 = var9 + 3;
                                        var664 *= var705;
                                        var664 &= 7;
                                        if (var664 != 0) {
                                            break label542;
                                        }

                                        Cj var679 = Cj.UNSUPPORTED;
                                        var705 = var10 + 1;
                                        var705 = var10 * var705;
                                        var705 &= 1;
                                        if (var705 != 0) {
                                            var9 += 251165116;
                                            var9 *= 1584201055;
                                            var9 >>= 20;
                                            var9 *= -1593294523;
                                            var9 ^= -712956726;
                                            break label665;
                                        }

                                        var9 ^= 108651175;
                                        var9 ^= 2070616554;
                                        if (var572 == var679) {
                                            var9 = switch (var9) {
                                                case -71965379 -> var9 ^ 1744381089;
                                                default -> var9 ^ 1922251013;
                                                case 2055620808 -> {
                                                    var9 += -592468810;
                                                    var9 >>>= 16;
                                                    yield var9 ^ 819315707;
                                                }
                                            };
                                            Bp_2 var680 = this.Ki;
                                            String var681 = var680.notPlaying();
                                            var705 = var10 + 1;
                                            var705 = var10 * var705;
                                            var705 &= 1;
                                            if (var705 != 0) {
                                                var9 &= 163421723;
                                                var9 >>>= 22;
                                                var9 ^= 1369691440;
                                                break label665;
                                            }
                                            var9 = switch (var9) {
                                                default -> var9 ^ 1551180375;
                                                case 468646680 -> var9 ^ -1977736504;
                                                case 819303630 -> {
                                                    var9 &= -605009846;
                                                    var9 &= 1029967911;
                                                    yield var9 ^ -293730195;
                                                }
                                            };
                                            var705 = var9 + 1;
                                            var705 = var9 * var705;
                                            int var768 = var9 + 2;
                                            var705 *= var768;
                                            var768 = var9 + 3;
                                            var705 *= var768;
                                            var705 &= 7;
                                            if (var705 != 0) {
                                                break label542;
                                            }

                                            Bp_2 var745 = this.Ki;
                                            String var746 = var745.unsupported();
                                            var620 = var681;
                                            var638 = var746;
                                            var9 >>= 18;
                                            var9 &= -998401386;
                                            var9 *= -1590008865;
                                            var9 ^= 1327218166;
                                        } else {
                                            var9 *= -381118253;
                                            var9 &= -1919852821;
                                            var9 ^= -1010938360;
                                            var9 *= -1853894675;
                                            var9 ^= 1132461332;
                                            Integer var682 = var9;
                                            if (var682 == null) {
                                                break label542;
                                            }

                                            Cj var683 = Cj.ERROR;
                                            Integer var747 = var10;
                                            if (var747 == null) {
                                                var9 ^= 1739114593;
                                                var9 &= 24475808;
                                                var9 <<= 28;
                                                var9 |= -668842440;
                                                var9 ^= -1987996918;
                                                break label665;
                                            }

                                            var9 += -1057684172;
                                            var9 ^= -589846394;
                                            var9 ^= -1275067919;
                                            var747 = var9;
                                            if (var747 == null) {
                                                break label542;
                                            }

                                            if (var572 == var683) {
                                                var9 *= -1180593929;
                                                var9 |= -920062941;
                                                var9 ^= 946201400;
                                                int var573 = var9 + 1;
                                                int var574 = var9 * var573;
                                                int var575 = var574 & 1;
                                                if (var575 != 0) {
                                                    break label542;
                                                }

                                                Bp_2 var576 = this.Ki;
                                                String var577 = var576.notPlaying();
                                                Bp_2 var684 = this.Ki;
                                                String var685 = var684.notResponding();
                                                var620 = var577;
                                                Integer var578 = var10;
                                                if (var578 == null) {
                                                    switch (var9) {
                                                        case -480502125:
                                                            var9 ^= 339098954;
                                                            var9 *= -912382431;
                                                            var9 ^= 2001535435;
                                                            break label665;
                                                        case 994591611:
                                                        default:
                                                            var9 ^= 110774141;
                                                            break label665;
                                                        case 1154446727:
                                                            var9 ^= 651935183;
                                                            break label665;
                                                    }
                                                }

                                                var9 >>= 15;
                                                var9 += 1023075779;
                                                var9 *= -2026617429;
                                                var9 ^= 152641504;
                                                long var749 = var9;
                                                var22 = var749 + 1L;
                                                var22 = var749 * var22;
                                                var24 = var749 + 2L;
                                                var22 *= var24;
                                                long var750 = var749 + 3L;
                                                var22 *= var750;
                                                long var751 = var22 & 7L;
                                                long var816;
                                                int var579 = (var816 = var751 - 0L) == 0L ? 0 : (var816 < 0L ? -1 : 1);
                                                if (var579 != 0) {
                                                    break label542;
                                                }

                                                var638 = var685;
                                                var9 -= 1050310871;
                                                var9 += -168351817;
                                                var9 += -1232785407;
                                                var9 ^= -313921306;
                                            } else {
                                                var9 >>>= 31;
                                                var9 |= 829423873;
                                                var9 ^= 1153779824;
                                                var9 >>>= 31;
                                                var9 ^= -758079679;
                                                Bp_2 var580 = this.Ki;
                                                long var686 = var10;
                                                long var770 = var686 + 1L;
                                                var770 = var686 * var770;
                                                long var687 = var770 & 1L;
                                                long var817;
                                                int var688 = (var817 = var687 - 0L) == 0L ? 0 : (var817 < 0L ? -1 : 1);
                                                if (var688 != 0) {
                                                    var9 &= -243173157;
                                                    var9 -= -372871080;
                                                    var9 ^= -2132850724;
                                                    var9 += 653458135;
                                                    var9 ^= -587592130;
                                                    break label665;
                                                }

                                                var9 |= 1395027602;
                                                var9 >>= 16;
                                                var9 ^= -1316711655;
                                                String var581 = var580.notPlaying();
                                                Bp_2 var689 = this.Ki;
                                                String var690 = var689.idleHint();
                                                var620 = var581;
                                                var638 = var690;
                                                switch (var9) {
                                                    case 1316700399:
                                                        var9 *= -1296250365;
                                                        var9 += -323711144;
                                                        var9 ^= -2025848541;
                                                        var9 ^= 976894026;
                                                        break;
                                                    case 1651124205:
                                                        var9 ^= 647227722;
                                                        break;
                                                    case 1913260521:
                                                    default:
                                                        var9 ^= 977487349;
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            Integer var582 = var9;
                            label478:
                            if (var582 != null) {
                                float var583 = var4 + 12.0F;
                                float var584 = var583 + 5.2F;
                                TextStyle var691 = this.V;
                                int var752 = var9 * -183532323;
                                var752 ^= 738735597;
                                this.dt(var1, var620, var449, var584, var542, var691, var752);
                                nE var585 = this.pv;
                                long var692 = var10;
                                long var772 = var692 + 1L;
                                var772 = var692 * var772;
                                long var693 = var772 & 1L;
                                long var818;
                                int var621 = (var818 = var693 - 0L) == 0L ? 0 : (var818 < 0L ? -1 : 1);
                                if (var621 != 0) {
                                    var9 -= -1946088012;
                                    var9 *= -40648263;
                                    var9 &= 1945218668;
                                    var9 ^= -239945279;
                                    var9 ^= -1034892101;
                                    break label665;
                                }

                                var9 ^= 1866152828;
                                var9 *= 697431683;
                                var9 ^= -897551833;
                                TextStyle var622 = this.lO;
                                var542 += 10.0F;
                                var542 += 8.0F;
                                String var547 = var585.Mh(var1, var638, var622, var542);
                                float var586 = var4 + 12.0F;
                                float var587 = var586 + 17.6F;
                                TextStyle var623 = this.lO;
                                float var450 = var1.text(var547, var449, var587, var623);
                                var13 = this.IL;
                                if (var13 != null) {
                                    var9 <<= 19;
                                    var9 += 795009621;
                                    var9 ^= -1017304711;
                                    Integer var452 = var9;
                                    if (var452 == null) {
                                        break label478;
                                    }

                                    float var453 = var4 + 12.0F;
                                    float var454 = var453 + 6.0F;
                                    float[] var548 = this.i;
                                    int var588 = this.rv;
                                    long var624 = var10;
                                    long var694 = var624 + 1L;
                                    long var695 = var624 * var694;
                                    long var625 = var695 & 1L;
                                    long var819;
                                    int var626 = (var819 = var625 - 0L) == 0L ? 0 : (var819 < 0L ? -1 : 1);
                                    if (var626 != 0) {
                                        var9 *= 1126438303;
                                        var9 >>>= 21;
                                        var9 ^= 1369692081;
                                        break label665;
                                    }
                                    var9 = switch (var9) {
                                        case -1773679828 -> {
                                            var9 ^= 1166824482;
                                            var9 -= 562838434;
                                            var9 += -407111877;
                                            yield var9 ^ -2123534674;
                                        }
                                        case 1118911278 -> var9 ^ -948080231;
                                        default -> var9 ^ 590629188;
                                    };
                                    long var627 = var9;
                                    long var696 = var627 + 1L;
                                    long var697 = var627 * var696;
                                    long var628 = var697 & 1L;
                                    long var820;
                                    int var629 = (var820 = var628 - 0L) == 0L ? 0 : (var820 < 0L ? -1 : 1);
                                    if (var629 != 0) {
                                        break label478;
                                    }

                                    ii.ZI(var1, var498, var454, 10.0F, 9.0F, var548, var588);
                                    var9 += 1403891683;
                                    var9 |= 1428867375;
                                    var9 ^= -182304115;
                                } else {
                                    var9 *= -1560295533;
                                    var9 -= -1044869041;
                                    var9 ^= 1058098340;
                                }

                                var13 = this.IL;
                                int var500 = var10 + 1;
                                int var501 = var10 * var500;
                                int var549 = var10 + 2;
                                int var502 = var501 * var549;
                                int var550 = var10 + 3;
                                int var503 = var502 * var550;
                                int var504 = var503 & 7;
                                if (var504 != 0) {
                                    var9 *= 959899811;
                                    var9 >>= 28;
                                    var9 ^= -1933636833;
                                    var9 *= 993541745;
                                    var9 ^= -331941620;
                                    break label665;
                                }

                                var9 |= -694629406;
                                var9 ^= 311668430;
                                var9 <<= 30;
                                var9 |= -1001684703;
                                var9 ^= -1072005681;
                                int var505 = var9 + 1;
                                int var506 = var9 * var505;
                                int var507 = var506 & 1;
                                if (var507 == 0) {
                                    if (var13 == null) {
                                        var9 += -462911987;
                                        var9 &= -887313148;
                                        var9 ^= 108622524;
                                        int var466 = var9 + 1;
                                        int var467 = var9 * var466;
                                        int var526 = var9 + 2;
                                        int var468 = var467 * var526;
                                        int var527 = var9 + 3;
                                        int var469 = var468 * var527;
                                        int var470 = var469 & 7;
                                        if (var470 == 0) {
                                            return;
                                        }
                                    } else {
                                        var9 = switch (var9) {
                                            case 72482030 -> {
                                                var9 -= -1247874559;
                                                yield var9 ^ 1420301580;
                                            }
                                            case 352635021 -> var9 ^ -1768415361;
                                            default -> var9 ^ 419385714;
                                        };
                                        Integer var456 = var9;
                                        label460:
                                        if (var456 != null) {
                                            JL var457 = this.K;
                                            boolean var458 = var457.vb();
                                            var14 = var10;
                                            var16 = var14 + 1L;
                                            var16 = var14 * var16;
                                            var14 = var16 & 1L;
                                            long var821;
                                            int var510 = (var821 = var14 - 0L) == 0L ? 0 : (var821 < 0L ? -1 : 1);
                                            if (var510 != 0) {
                                                switch (var9) {
                                                    case -1073290381:
                                                        var9 ^= 1205618462;
                                                        break label665;
                                                    case -448960220:
                                                    default:
                                                        var9 ^= -953865763;
                                                        break label665;
                                                    case 437985249:
                                                        var9 ^= 47988710;
                                                        var9 ^= 1231353141;
                                                        break label665;
                                                }
                                            }

                                            var9 >>= 14;
                                            var9 |= 1663617912;
                                            var9 ^= 1310110159;
                                            if (var458) {
                                                var9 &= -1728235281;
                                                var9 ^= -1652461216;
                                                Integer var459 = var9;
                                                if (var459 == null) {
                                                    break label460;
                                                }

                                                Nr var460 = this.Lm;
                                                Integer var511 = var10;
                                                if (var511 == null) {
                                                    switch (var9) {
                                                        case -1782748733:
                                                            var9 >>= 4;
                                                            var9 ^= -1460141138;
                                                            break label665;
                                                        case -1546769829:
                                                            var9 ^= 1683218329;
                                                            break label665;
                                                        case 1258403287:
                                                        default:
                                                            var9 ^= -947783424;
                                                            break label665;
                                                    }
                                                }

                                                var9 >>= 17;
                                                var9 += 335541308;
                                                var9 &= -80930519;
                                                var9 >>= 28;
                                                var9 ^= -1194474781;
                                                Integer var512 = var9;
                                                if (var512 == null) {
                                                    break label460;
                                                }

                                                if (var460 != null) {
                                                    var9 -= 259396347;
                                                    var9 ^= 1094617757;
                                                    Integer var461 = var9;
                                                    if (var461 == null) {
                                                        break label460;
                                                    }

                                                    Zq var462 = this.nI;
                                                    var14 = var10;
                                                    var16 = var14 + 1L;
                                                    var16 = var14 * var16;
                                                    var14 = var16 & 1L;
                                                    long var822;
                                                    int var515 = (var822 = var14 - 0L) == 0L ? 0 : (var822 < 0L ? -1 : 1);
                                                    if (var515 != 0) {
                                                        var9 >>>= 8;
                                                        var9 &= -1404975178;
                                                        var9 ^= 1373869078;
                                                        break label665;
                                                    }
                                                    var9 = switch (var9) {
                                                        case -1417422587 -> var9 ^ 108133340;
                                                        case -395762310 -> {
                                                            var9 ^= -1029577842;
                                                            var9 += 1829751895;
                                                            var9 *= -1271459077;
                                                            yield var9 ^ 881149895;
                                                        }
                                                        default -> var9 ^ -359275025;
                                                    };
                                                    be_2 var465;
                                                    if (var462 != null) {
                                                        var9 |= -656257004;
                                                        var9 &= 296250346;
                                                        var9 >>>= 15;
                                                        var9 ^= 292262182;
                                                        Zq var463 = this.nI;
                                                        be_2 var464 = var463.nB();
                                                        var14 = var10;
                                                        var16 = var14 + 1L;
                                                        var16 = var14 * var16;
                                                        long var639 = var14 + 2L;
                                                        var16 *= var639;
                                                        var14 += 3L;
                                                        var16 *= var14;
                                                        var14 = var16 & 7L;
                                                        long var823;
                                                        int var519 = (var823 = var14 - 0L) == 0L ? 0 : (var823 < 0L ? -1 : 1);
                                                        if (var519 != 0) {
                                                            var9 *= -453138667;
                                                            var9 ^= 921365406;
                                                            var9 *= -477676029;
                                                            var9 *= 846132467;
                                                            var9 ^= 141031154;
                                                            break label665;
                                                        }

                                                        var9 |= -972042206;
                                                        var9 += 1657091622;
                                                        var9 *= 621022719;
                                                        var9 &= 780332536;
                                                        var9 ^= -638483773;
                                                        var465 = var464;
                                                        var9 |= 1794652425;
                                                        var9 *= 672868917;
                                                        var9 ^= 1243436319;
                                                        var9 -= 1165642565;
                                                        var9 ^= 599616465;
                                                    } else {
                                                        var9 = switch (var9) {
                                                            case 19799038 -> var9 ^ 1577323729;
                                                            default -> var9 ^ -527252358;
                                                            case 1213593422 -> {
                                                                var9 |= 2086422392;
                                                                yield var9 ^ 560713552;
                                                            }
                                                        };
                                                        var14 = var9;
                                                        var16 = var14 + 1L;
                                                        var16 = var14 * var16;
                                                        long var640 = var14 + 2L;
                                                        var16 *= var640;
                                                        var14 += 3L;
                                                        var16 *= var14;
                                                        var14 = var16 & 7L;
                                                        long var824;
                                                        int var523 = (var824 = var14 - 0L) == 0L ? 0 : (var824 < 0L ? -1 : 1);
                                                        if (var523 != 0) {
                                                            break label460;
                                                        }

                                                        var465 = null;
                                                        switch (var9) {
                                                            case -1934633422:
                                                                var9 ^= -261761280;
                                                                break;
                                                            case -1785068617:
                                                            default:
                                                                var9 ^= -900905924;
                                                                break;
                                                            case 1563834414:
                                                                var9 += -1460348465;
                                                                var9 -= -1346675994;
                                                                var9 ^= 404230163;
                                                                var9 ^= -1043275850;
                                                        }
                                                    }

                                                    Nr var524 = this.Lm;
                                                    int var551 = var9 + 1928649784;
                                                    int var552 = var551 ^ -1952543337;
                                                    String var553 = this.W(var465, var552);
                                                    var16 = this.wN;
                                                    float var641 = this.B;
                                                    var11 += 12.0F;
                                                    var11 += 2.0F;
                                                    Integer var698 = var10;
                                                    if (var698 == null) {
                                                        var9 >>= 19;
                                                        var9 *= 361794979;
                                                        var9 ^= 1155114862;
                                                        break label665;
                                                    }
                                                    var9 = switch (var9) {
                                                        case -1884849998 -> {
                                                            var9 ^= -1185153430;
                                                            yield var9 ^ 188841198;
                                                        }
                                                        case -1505851793 -> var9 ^ -1676748756;
                                                        default -> var9 ^ 1698910260;
                                                    };
                                                    long var699 = var9;
                                                    var772 = var699 + 1L;
                                                    var772 = var699 * var772;
                                                    long var795 = var699 + 2L;
                                                    var772 *= var795;
                                                    long var700 = var699 + 3L;
                                                    var772 *= var700;
                                                    long var701 = var772 & 7L;
                                                    long var825;
                                                    int var702 = (var825 = var701 - 0L) == 0L ? 0 : (var825 < 0L ? -1 : 1);
                                                    if (var702 != 0) {
                                                        break label460;
                                                    }

                                                    float var703 = var4 + 58.0F;
                                                    float var416 = var415 - 24.0F;
                                                    float var417 = var416 - 4.0F;
                                                    float var754 = var2.l();
                                                    double var778 = this.W;
                                                    float var796 = this.h;
                                                    float var800 = this.G;
                                                    var524.on(var1, var465, var553, var16, var641, var11, var703, var417, 54.0F, var754, var778, var796, var800);
                                                    var9 *= 615440221;
                                                    var9 ^= 269201577;
                                                    var9 += 927401257;
                                                    var9 ^= -1789965786;
                                                } else {
                                                    var9 ^= -391956974;
                                                    var9 ^= 2144328374;
                                                }
                                            } else {
                                                var9 |= -1485074415;
                                                var9 ^= -2132871947;
                                            }

                                            Integer var405 = var9;
                                            if (var405 != null) {
                                                int var406 = var9 >>> 26;
                                                int var407 = var406 | -804208814;
                                                int var408 = var407 ^ 237253089;
                                                this.Y(var1, var408);
                                                Integer var393 = var10;
                                                if (var393 == null) {
                                                    var9 -= 2100399503;
                                                    var9 -= 1359760699;
                                                    var9 ^= -1230527417;
                                                    var9 ^= -2040061431;
                                                    break label665;
                                                }

                                                var9 |= 861516360;
                                                var9 ^= 834049561;
                                                long var394 = var9;
                                                var12 = var394 + 1L;
                                                var12 = var394 * var12;
                                                var14 = var394 + 2L;
                                                var12 *= var14;
                                                long var395 = var394 + 3L;
                                                var12 *= var395;
                                                long var396 = var12 & 7L;
                                                long var826;
                                                int var397 = (var826 = var396 - 0L) == 0L ? 0 : (var826 < 0L ? -1 : 1);
                                                if (var397 == 0) {
                                                    var397 = var9 + -737140925;
                                                    var397 ^= -6253466;
                                                    this.o(var1, var397);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                IllegalArgumentException var400 = new IllegalArgumentException();
                throw var400;
            }
        }

        RuntimeException var392 = new RuntimeException();
        throw var392;
    }

    private String W(be_2 var1, int var2) {
        label199: {
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            int var29;
            if (var5 == 0) {
                var29 = switch (var2) {
                    case -1996301955 -> {
                        var29 = var2 ^ -1474323502;
                        var29 -= -1558204036;
                        var29 |= -1801655979;
                        yield var29 ^ -1858305579;
                    }
                    default -> var2 ^ -803004217;
                    case 233616862 -> var2 ^ -762344022;
                };
                Integer var142 = var29;
                if (var142 == null) {
                    break label199;
                }

                FX var143 = this.IL;
                if (var143 == null) {
                    var29 &= 1241738416;
                    var29 ^= 691962377;
                    long var170 = var29;
                    long var251 = var170 + 1L;
                    var251 = var170 * var251;
                    long var171 = var251 & 1L;
                    long var282;
                    int var172 = (var282 = var171 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                    if (var172 == 0) {
                        return "";
                    }
                    break label199;
                }

                var29 -= -342566235;
                var29 += 1203592835;
                var29 ^= 1858563136;
                long var144 = var29;
                long var7 = var144 + 1L;
                var7 = var144 * var7;
                long var9 = var144 + 2L;
                var7 *= var9;
                long var145 = var144 + 3L;
                var7 *= var145;
                long var146 = var7 & 7L;
                long var283;
                int var147 = (var283 = var146 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                if (var147 != 0) {
                    break label199;
                }

                FX var148 = this.IL;
                int var149 = (var148.isSong()) ? 1 : 0;
                Integer var6 = var4;
                if (var6 != null) {
                    var29 -= -1776626737;
                    var29 >>= 26;
                    var29 -= -1500835232;
                    var29 *= 920906017;
                    var29 ^= 765306155;
                    if (var149 == 0) {
                        var29 |= 1224326034;
                        var29 -= 469467499;
                        var29 >>= 16;
                        var29 |= -1360167790;
                        var29 ^= 83051920;
                        var149 = var29 + 1;
                        var149 = var29 * var149;
                        int var173 = var29 + 2;
                        var149 *= var173;
                        var173 = var29 + 3;
                        var149 *= var173;
                        var149 &= 7;
                        if (var149 != 0) {
                            break label199;
                        }

                        Bp_2 var155 = this.Ki;
                        long var175 = var4;
                        long var8 = var175 + 1L;
                        var8 = var175 * var8;
                        long var176 = var8 & 1L;
                        long var284;
                        var173 = (var284 = var176 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                        if (var173 == 0) {
                            var29 |= -974680704;
                            var29 *= 680013723;
                            var29 |= 1439004079;
                            var29 -= 1745743219;
                            var29 ^= -272504552;
                            var173 = var29 + 1;
                            var173 = var29 * var173;
                            int var211 = var29 + 2;
                            var173 *= var211;
                            int var212 = var29 + 3;
                            var173 *= var212;
                            var173 &= 7;
                            if (var173 == 0) {
                                return var155.noLyrics();
                            }
                            break label199;
                        }

                        switch (var29) {
                            case -1440859390:
                                var29 ^= 784158190;
                                var29 ^= -18199182;
                                break;
                            case -148281843:
                            default:
                                var29 ^= -2058418848;
                                break;
                            case 625008959:
                                var29 ^= 1571118085;
                        }
                    } else {
                        var29 >>>= 15;
                        var29 += 1132881730;
                        var29 ^= -1615522615;
                        var149 = var29 + 1;
                        var149 = var29 * var149;
                        int var183 = var29 + 2;
                        var149 *= var183;
                        var183 = var29 + 3;
                        var149 *= var183;
                        var149 &= 7;
                        if (var149 != 0) {
                            break label199;
                        }

                        if (var1 == null) {
                            var29 -= -1391255471;
                            var29 <<= 29;
                            var29 ^= 1818074845;
                            var149 = var29 + 1;
                            var149 = var29 * var149;
                            var183 = var29 + 2;
                            var149 *= var183;
                            var183 = var29 + 3;
                            var149 *= var183;
                            var149 &= 7;
                            if (var149 == 0) {
                                return "";
                            }
                            break label199;
                        }

                        var29 += 1726569595;
                        var29 += -2125203273;
                        var29 &= -1567610739;
                        var29 ^= 1667532387;
                        int[] var161 = Qy.Q;
                        BA var185 = var1.state();
                        var7 = var4;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var285;
                        int var215 = (var285 = var7 - 0L) == 0L ? 0 : (var285 < 0L ? -1 : 1);
                        if (var215 != 0) {
                            var29 |= -169859396;
                            var29 ^= -1918001824;
                        } else {
                            var29 ^= 242668269;
                            var29 ^= -784024368;
                            var7 = var29;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var286;
                            int var219 = (var286 = var7 - 0L) == 0L ? 0 : (var286 < 0L ? -1 : 1);
                            if (var219 != 0) {
                                break label199;
                            }

                            var183 = var185.ordinal();
                            var149 = var161[var183];
                            label187:
                            switch (var149) {
                                case 1:
                                    var29 |= 1212679552;
                                    var29 |= -974473753;
                                    var29 ^= -88469898;
                                    Bp_2 var204 = this.Ki;
                                    String var205 = var204.loading();
                                    var7 = var4;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var7 = var9 & 1L;
                                    long var291;
                                    var4 = (var291 = var7 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                                    if (var4 == 0) {
                                        var29 *= 932537869;
                                        var29 ^= 1935249774;
                                        var7 = var29;
                                        var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        var7 = var9 & 1L;
                                        long var292;
                                        var4 = (var292 = var7 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                                        if (var4 != 0) {
                                            break label199;
                                        }

                                        var29 *= -1343633753;
                                        var29 |= 57811504;
                                        var29 |= 608850788;
                                        var29 ^= 1383826010;
                                        return var205;
                                    }

                                    var29 -= 1478489569;
                                    var29 ^= -714226122;
                                    break;
                                case 2:
                                    var29 <<= 30;
                                    var29 ^= 820274574;
                                    Bp_2 var202 = this.Ki;
                                    String var203 = var202.missing();
                                    Integer var241 = var4;
                                    if (var241 != null) {
                                        var29 |= -223235066;
                                        var29 &= 2009314339;
                                        var29 ^= -1411280053;
                                        int var242 = var29 + 1;
                                        int var243 = var29 * var242;
                                        int var256 = var29 + 2;
                                        int var244 = var243 * var256;
                                        var256 = var29 + 3;
                                        int var245 = var244 * var256;
                                        int var246 = var245 & 7;
                                        if (var246 != 0) {
                                            break label199;
                                        }

                                        var29 += 2139115407;
                                        var29 >>= 23;
                                        var29 *= -573852813;
                                        var29 <<= 23;
                                        var29 ^= -1543441113;
                                        return var203;
                                    }

                                    var29 ^= 608095196;
                                    var29 ^= -1366059572;
                                    break;
                                case 3:
                                    var29 = switch (var29) {
                                        case -1151163314 -> var29 ^ -1879867964;
                                        default -> var29 ^ -2058988566;
                                        case 1012328539 -> {
                                            var29 += -1964301471;
                                            yield var29 ^ 533908118;
                                        }
                                    };
                                    var183 = var29 + 1;
                                    var183 = var29 * var183;
                                    int var234 = var29 + 2;
                                    var183 *= var234;
                                    int var235 = var29 + 3;
                                    var183 *= var235;
                                    var183 &= 7;
                                    if (var183 != 0) {
                                        break label199;
                                    }

                                    Bp_2 var200 = this.Ki;
                                    int var236 = var4 + 1;
                                    int var237 = var4 * var236;
                                    int var254 = var4 + 2;
                                    int var238 = var237 * var254;
                                    var254 = var4 + 3;
                                    int var239 = var238 * var254;
                                    int var240 = var239 & 7;
                                    if (var240 == 0) {
                                        var29 = switch (var29) {
                                            case -661602006 -> {
                                                var29 ^= 1944599952;
                                                var29 ^= 589857087;
                                                var29 ^= 2098913824;
                                                yield var29 ^ -1774429836;
                                            }
                                            case 1084566702 -> var29 ^ 1799061119;
                                            default -> var29 ^ -740870745;
                                        };
                                        String var201 = var200.offline();
                                        var29 |= 944939796;
                                        var29 -= 928308945;
                                        var29 |= -1863496479;
                                        var29 ^= 829405378;
                                        return var201;
                                    }

                                    var29 |= -1590103031;
                                    var29 ^= -2081304907;
                                    break;
                                case 4:
                                    var29 = switch (var29) {
                                        default -> var29 ^ 790456035;
                                        case -574712004 -> var29 ^ 1379917341;
                                        case 1012328539 -> {
                                            var29 >>>= 21;
                                            var29 -= -1581081570;
                                            yield var29 ^ 1180175647;
                                        }
                                    };
                                    Za var187 = var1.lyrics();
                                    var7 = var4;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var11 = var7 + 2L;
                                    var9 *= var11;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var287;
                                    int var223 = (var287 = var7 - 0L) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                                    if (var223 != 0) {
                                        var29 &= 1892999091;
                                        var29 &= 1650179528;
                                        var29 += 1770392970;
                                        var29 ^= 328150420;
                                    } else {
                                        var29 += -1689758542;
                                        var29 *= 657529725;
                                        var29 |= -1864483607;
                                        var29 ^= 535874901;
                                        var7 = var29;
                                        var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        var7 = var9 & 1L;
                                        long var288;
                                        int var226 = (var288 = var7 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                                        if (var226 != 0) {
                                            break label199;
                                        }

                                        int var188 = var187.RZ() ? 1 : 0;
                                        if (var188 == 0) {
                                            var29 ^= -2087943645;
                                            var29 += 1721663796;
                                            var29 <<= 27;
                                            var29 ^= -686640454;
                                            var188 = var29 + 1;
                                            var188 = var29 * var188;
                                            var188 &= 1;
                                            if (var188 != 0) {
                                                break label199;
                                            }

                                            String var293 = "";
                                            var29 -= -1947396796;
                                            var29 += -1536643267;
                                            var29 -= 344136252;
                                            var29 |= 1667663269;
                                            var29 ^= 384778960;
                                            return var293;
                                        }

                                        var29 &= -1609130842;
                                        var29 ^= 98844818;
                                        Integer var189 = var29;
                                        if (var189 == null) {
                                            break label199;
                                        }

                                        Bp_2 var190 = this.Ki;
                                        String var191 = var190.instrumental();
                                        var7 = var4;
                                        var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        var11 = var7 + 2L;
                                        var9 *= var11;
                                        var7 += 3L;
                                        var9 *= var7;
                                        var7 = var9 & 7L;
                                        long var289;
                                        int var230 = (var289 = var7 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                                        if (var230 == 0) {
                                            var29 = switch (var29) {
                                                case -2062625444 -> var29 ^ 1913258725;
                                                case -2048733130 -> {
                                                    var29 *= 2119259773;
                                                    var29 &= -417364555;
                                                    var29 *= -151827161;
                                                    yield var29 ^ 803813967;
                                                }
                                                default -> var29 ^ -76428328;
                                            };
                                            var7 = var29;
                                            var9 = var7 + 1L;
                                            var9 = var7 * var9;
                                            var7 = var9 & 1L;
                                            long var290;
                                            int var233 = (var290 = var7 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                                            if (var233 != 0) {
                                                break label199;
                                            }

                                            var29 *= -314955083;
                                            var29 |= 1364435696;
                                            var29 |= -1363614148;
                                            var29 ^= 444533720;
                                            return var191;
                                        }

                                        switch (var29) {
                                            case -2048733130:
                                                var29 <<= 12;
                                                var29 <<= 6;
                                                var29 += 1322164601;
                                                var29 |= -1894739921;
                                                var29 ^= -167802143;
                                                break label187;
                                            case -1119143416:
                                                var29 ^= -2020704455;
                                                break label187;
                                            case 487392396:
                                            default:
                                                var29 ^= 327147362;
                                        }
                                    }
                                    break;
                                case 5:
                                    var29 *= 1597592473;
                                    var29 &= 967011668;
                                    var29 |= 2107262542;
                                    var29 &= -570209835;
                                    var29 ^= 1997511916;
                                    Integer var163 = var29;
                                    if (var163 == null) {
                                        break label199;
                                    }

                                    String var164 = "";
                                    var29 += -856250256;
                                    var29 ^= 495160127;
                                    return var164;
                                default:
                                    var29 &= 997881522;
                                    var29 += -198959764;
                                    var29 |= 700869652;
                                    var29 ^= -1316544903;
                                    MatchException var137 = new MatchException(null, null);
                                    throw var137;
                            }
                        }
                    }
                } else {
                    var29 -= 890286818;
                    var29 *= 869441989;
                    var29 -= -1224845120;
                    var29 >>>= 15;
                    var29 ^= 2051642586;
                }
            } else {
                var29 = var2 ^ 364163795;
                var29 += -1181067674;
                var29 *= 1361405997;
                var29 ^= 564594202;
            }

            Integer var134 = var29;
            if (var134 != null) {
                UnsupportedOperationException var136 = new UnsupportedOperationException();
                throw var136;
            }
        }

        AssertionError var135 = new AssertionError();
        throw var135;
    }

    private void Y(Canvas var1, int var2) {
        float var181 = 0.0F;
        float var206 = 0.0F;
        label221: {
            int var4 = System.identityHashCode(this);
            int var5 = var2 << 17;
            var5 += 316915959;
            var5 ^= -1685844078;
            float var162 = this.FF(var5);
            int var6 = var2 + 141698627;
            var6 -= -574633227;
            var6 >>>= 17;
            var6 ^= 358700700;
            float var168 = this.d(var6);
            long var7 = var4;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            var7 = var9 & 1L;
            long var345;
            int var172 = (var345 = var7 - 0L) == 0L ? 0 : (var345 < 0L ? -1 : 1);
            if (var172 != 0) {
                int var3 = var2 | -453748469;
                var3 ^= 379338133;
                var3 &= -619005372;
                var3 *= 108198043;
                var3 ^= 1290760797;
            } else {
                label247: {
                    int var24 = var2 - -1278301199;
                    var24 ^= -1211392207;
                    var7 = var24;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var346;
                    int var176 = (var346 = var7 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                    if (var176 != 0) {
                        break label221;
                    }

                    float var182;
                    int var255;
                    label225: {
                        int var177 = var24 * -1807259169;
                        int var178 = var177 - 1226683898;
                        int var179 = var178 << 18;
                        int var180 = var179 ^ 436231902;
                        var181 = this.xO(var180);
                        XF var8 = this.a;
                        var182 = var8.bs();
                        float var205 = 1.6F * var182;
                        var206 = 2.6F + var205;
                        FX var10 = this.IL;
                        if (var10 != null) {
                            var24 -= 756275027;
                            var24 ^= 33747028;
                            long var249 = var24;
                            long var12 = var249 + 1L;
                            var12 = var249 * var12;
                            long var250 = var12 & 1L;
                            long var347;
                            var255 = (var347 = var250 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
                            if (var255 != 0) {
                                break label221;
                            }

                            FX var252 = this.IL;
                            long var253 = var252.durationMs();
                            long var348;
                            var255 = (var348 = var253 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                            Integer var261 = var4;
                            if (var261 == null) {
                                var24 *= 1743041735;
                                var24 ^= -1581377768;
                                var24 &= 315855206;
                                var24 ^= -375809417;
                                break label247;
                            }

                            var24 &= -1054080450;
                            var24 ^= 1999197754;
                            var24 *= -1091721275;
                            var24 ^= -637586051;
                            int var262 = var24 + 1;
                            int var263 = var24 * var262;
                            int var281 = var24 + 2;
                            int var264 = var263 * var281;
                            int var282 = var24 + 3;
                            int var265 = var264 * var282;
                            int var266 = var265 & 7;
                            if (var266 != 0) {
                                break label221;
                            }

                            if (var255 > 0) {
                                var24 >>>= 30;
                                var24 -= 863853539;
                                var24 ^= -745091464;
                                var255 = 1;
                                switch (var24) {
                                    case -1791358374:
                                    default:
                                        var24 ^= 688698146;
                                        break label225;
                                    case -1717047983:
                                        var24 ^= -476278676;
                                        break label225;
                                    case 521431655:
                                        var24 |= 1710396709;
                                        var24 ^= -392272279;
                                        break label225;
                                }
                            }

                            var24 += -481890644;
                            var24 |= -869403364;
                            var24 >>>= 21;
                            var24 ^= 1469053429;
                        } else {
                            var24 &= -1822008681;
                            var24 ^= -961960056;
                        }

                        Integer var267 = var24;
                        if (var267 == null) {
                            break label221;
                        }

                        var255 = 0;
                        switch (var24) {
                            case 1395338146:
                                var24 ^= 1039075657;
                                break;
                            case 1469054744:
                                var24 &= 1635731080;
                                var24 += -903892562;
                                var24 ^= -1673105736;
                                break;
                            case 1869196124:
                            default:
                                var24 ^= -1972195108;
                        }
                    }

                    var11 = var24;
                    long var13 = var11 + 1L;
                    var13 = var11 * var13;
                    var11 = var13 & 1L;
                    long var349;
                    int var270 = (var349 = var11 - 0L) == 0L ? 0 : (var349 < 0L ? -1 : 1);
                    if (var270 != 0) {
                        break label221;
                    }

                    int var271 = this.o;
                    int var272 = DP.Y(var271, 0.2F);
                    float var283 = var206 * 0.5F;
                    var283 = var162 - var283;
                    var13 = var4;
                    long var15 = var13 + 1L;
                    var15 = var13 * var15;
                    long var17 = var13 + 2L;
                    var15 *= var17;
                    var13 += 3L;
                    var15 *= var13;
                    var13 = var15 & 7L;
                    long var350;
                    int var317 = (var350 = var13 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                    if (var317 != 0) {
                        switch (var24) {
                            case -1754752754:
                                var24 &= -1483650508;
                                var24 |= -1629295374;
                                var24 *= -1581910957;
                                var24 &= 1384607651;
                                var24 ^= -1155939917;
                                break;
                            case -1404328017:
                                var24 ^= 1175176563;
                                break;
                            case 1165896426:
                            default:
                                var24 ^= 2083295483;
                        }
                    } else {
                        label242: {
                            var24 = switch (var24) {
                                case -1754752754 -> {
                                    var24 -= 2046712960;
                                    var24 |= 340467486;
                                    yield var24 ^ -1050035107;
                                }
                                default -> var24 ^ -1635229903;
                                case -727558503 -> var24 ^ -1063622268;
                            };
                            float var318 = var181 - var168;
                            float var14 = var206 * 0.5F;
                            var1.roundRect(var168, var283, var318, var206, var14, var272);
                            if (var255 != 0) {
                                var24 &= 1038717595;
                                var24 ^= 2002818119;
                                var11 = var24;
                                var13 = var11 + 1L;
                                var13 = var11 * var13;
                                var11 = var13 & 1L;
                                long var351;
                                int var275 = (var351 = var11 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                                if (var275 != 0) {
                                    break label221;
                                }

                                float var276 = var181 - var168;
                                var283 = this.B;
                                var283 = TP.S(var283);
                                float var277 = var276 * var283;
                                float var278 = var168 + var277;
                                var283 = var206 * 0.5F;
                                var283 = var162 - var283;
                                float var321 = var278 - var168;
                                float var322 = Math.max(var206, var321);
                                var14 = var206 * 0.5F;
                                int var338 = this.o;
                                long var16 = var4;
                                long var18 = var16 + 1L;
                                var18 = var16 * var18;
                                var16 = var18 & 1L;
                                long var352;
                                int var341 = (var352 = var16 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                                if (var341 != 0) {
                                    var24 >>= 18;
                                    var24 >>>= 12;
                                    var24 >>= 25;
                                    var24 -= -2024981919;
                                    var24 ^= -2086121554;
                                    break label242;
                                }
                                var24 = switch (var24) {
                                    case -1562885793 -> var24 ^ 616044334;
                                    default -> var24 ^ -278364111;
                                    case 1801459396 -> {
                                        var24 <<= 24;
                                        var24 |= 1782756636;
                                        var24 ^= -1745610346;
                                        var24 *= -1731056041;
                                        yield var24 ^ 1741039809;
                                    }
                                };
                                int var339 = DP.Y(var338, 0.92F);
                                var1.roundRect(var168, var283, var322, var206, var14, var339);
                                float var353;
                                int var207 = (var353 = var182 - 0.02F) == 0.0F ? 0 : (var353 < 0.0F ? -1 : 1);
                                if (var207 > 0) {
                                    var24 = switch (var24) {
                                        case -2002472256 -> var24 ^ 2036532968;
                                        case -829471193 -> {
                                            var24 *= -1311957499;
                                            var24 >>>= 19;
                                            yield var24 ^ 961213577;
                                        }
                                        default -> var24 ^ 663605882;
                                    };
                                    long var289 = var24;
                                    long var324 = var289 + 1L;
                                    long var325 = var289 * var324;
                                    long var290 = var325 & 1L;
                                    long var354;
                                    int var208 = (var354 = var290 - 0L) == 0L ? 0 : (var354 < 0L ? -1 : 1);
                                    if (var208 != 0) {
                                        break label221;
                                    }

                                    var182 = 3.2F * var182;
                                    int var209 = var4 + 1;
                                    int var210 = var4 * var209;
                                    int var211 = var210 & 1;
                                    if (var211 != 0) {
                                        var24 ^= -1706722673;
                                        var24 += 871609550;
                                        var24 >>>= 2;
                                        var24 ^= -824550566;
                                        break label242;
                                    }

                                    var24 += 2088273245;
                                    var24 ^= 664960865;
                                    var24 &= 1606538272;
                                    var24 ^= -1230301467;
                                    int var212 = var24 + 1;
                                    int var213 = var24 * var212;
                                    int var291 = var24 + 2;
                                    int var214 = var213 * var291;
                                    int var292 = var24 + 3;
                                    int var215 = var214 * var292;
                                    int var216 = var215 & 7;
                                    if (var216 != 0) {
                                        break label221;
                                    }

                                    int var217 = this.o;
                                    var1.circle(var278, var162, var182, var217);
                                    var24 -= -1665944030;
                                    var24 ^= -245982714;
                                } else {
                                    switch (var24) {
                                        case -1436840962:
                                        default:
                                            var24 ^= 406828243;
                                            break;
                                        case -829471193:
                                            var24 *= -1088466869;
                                            var24 &= 1083343364;
                                            var24 ^= -1175303519;
                                            break;
                                        case 903707182:
                                            var24 ^= 731751241;
                                    }
                                }
                            } else {
                                var24 -= 1085590234;
                                var24 >>= 12;
                                var24 ^= 110722686;
                            }

                            int var184 = var24 + 1;
                            int var185 = var24 * var184;
                            int var186 = var185 & 1;
                            if (var186 != 0) {
                                break label221;
                            }

                            StringBuilder var187 = this.aT;
                            long var293 = var4;
                            long var326 = var293 + 1L;
                            long var327 = var293 * var326;
                            long var294 = var327 & 1L;
                            long var355;
                            int var218 = (var355 = var294 - 0L) == 0L ? 0 : (var355 < 0L ? -1 : 1);
                            if (var218 != 0) {
                                var24 &= 1377207036;
                                var24 ^= -1424357227;
                            } else {
                                label230: {
                                    var24 -= -376304351;
                                    var24 &= -1145546734;
                                    var24 ^= -1021518395;
                                    var24 ^= -761981875;
                                    int var219 = var24 + 1;
                                    int var220 = var24 * var219;
                                    int var295 = var24 + 2;
                                    int var221 = var220 * var295;
                                    int var296 = var24 + 3;
                                    int var222 = var221 * var296;
                                    int var223 = var222 & 7;
                                    if (var223 != 0) {
                                        break label221;
                                    }

                                    FX var224 = this.IL;
                                    long var300;
                                    if (var224 != null) {
                                        var24 &= 594451240;
                                        var24 ^= -1220731961;
                                        long var297 = var24;
                                        long var328 = var297 + 1L;
                                        long var329 = var297 * var328;
                                        long var298 = var329 & 1L;
                                        long var356;
                                        int var225 = (var356 = var298 - 0L) == 0L ? 0 : (var356 < 0L ? -1 : 1);
                                        if (var225 != 0) {
                                            break label221;
                                        }

                                        long var299 = this.wN;
                                        long var330 = var4;
                                        long var342 = var330 + 1L;
                                        var342 = var330 * var342;
                                        long var331 = var342 & 1L;
                                        long var357;
                                        int var226 = (var357 = var331 - 0L) == 0L ? 0 : (var357 < 0L ? -1 : 1);
                                        if (var226 != 0) {
                                            var24 ^= -1736881619;
                                            var24 *= 1703097459;
                                            var24 -= 1297129294;
                                            var24 ^= 645882889;
                                            break label230;
                                        }
                                        var24 = switch (var24) {
                                            case -1254257969 -> {
                                                var24 >>>= 16;
                                                yield var24 ^ -432226809;
                                            }
                                            default -> var24 ^ -2067105303;
                                            case 1655214080 -> var24 ^ 85700844;
                                        };
                                        var300 = var299;
                                        var24 -= -2086319327;
                                        var24 &= 16669577;
                                        var24 *= 163500893;
                                        var24 ^= 1653754475;
                                    } else {
                                        var24 = switch (var24) {
                                            case 436326792 -> {
                                                var24 *= 1592002911;
                                                var24 |= 673811947;
                                                var24 -= 986527336;
                                                var24 &= -1988259833;
                                                yield var24 ^ -1227909812;
                                            }
                                            case 1807149056 -> var24 ^ 867794470;
                                            default -> var24 ^ 1928813140;
                                        };
                                        int var227 = var24 + 1;
                                        int var228 = var24 * var227;
                                        int var332 = var24 + 2;
                                        int var229 = var228 * var332;
                                        int var333 = var24 + 3;
                                        int var230 = var229 * var333;
                                        int var231 = var230 & 7;
                                        if (var231 != 0) {
                                            break label221;
                                        }

                                        var300 = 0L;
                                        switch (var24) {
                                            case -1215068849:
                                                var24 += 1468558663;
                                                var24 >>>= 14;
                                                var24 -= -1856664686;
                                                var24 *= 371647353;
                                                var24 ^= 1876388699;
                                                break;
                                            case 901224315:
                                                var24 ^= 2104320521;
                                                break;
                                            case 1199814481:
                                            default:
                                                var24 ^= -760482941;
                                        }
                                    }

                                    Integer var232 = var24;
                                    if (var232 == null) {
                                        break label221;
                                    }

                                    int var233 = var24 ^ -407600875;
                                    int var234 = var233 | 1715986258;
                                    int var235 = var234 & 2117726646;
                                    int var236 = var235 ^ 1068460698;
                                    int var237 = var236 ^ -861238887;
                                    s(var187, var300, false, var237);
                                    int var188 = var4 + 1;
                                    int var189 = var4 * var188;
                                    int var238 = var4 + 2;
                                    int var190 = var189 * var238;
                                    int var239 = var4 + 3;
                                    int var191 = var190 * var239;
                                    int var192 = var191 & 7;
                                    label181:
                                    if (var192 == 0) {
                                        var24 -= 1627339776;
                                        var24 *= -1982076121;
                                        var24 += -654210406;
                                        var24 += -1626408303;
                                        var24 ^= -1238194277;
                                        int var193 = var24 + 1;
                                        int var194 = var24 * var193;
                                        int var195 = var194 & 1;
                                        if (var195 != 0) {
                                            break label221;
                                        }

                                        StringBuilder var196 = this.b;
                                        if (var255 != 0) {
                                            var24 ^= -1056837467;
                                            var24 |= 1705751474;
                                            var24 += -1805575851;
                                            var24 |= -224714820;
                                            var24 ^= -1217117964;
                                            FX var240 = this.IL;
                                            var255 = var4 + 1;
                                            var255 = var4 * var255;
                                            int var301 = var4 + 2;
                                            var255 *= var301;
                                            int var302 = var4 + 3;
                                            var255 *= var302;
                                            var255 &= 7;
                                            if (var255 != 0) {
                                                var24 ^= -447546944;
                                                var24 += -173118684;
                                                var24 += -1262745575;
                                                var24 *= 1604176215;
                                                var24 ^= 1783440578;
                                                break label181;
                                            }

                                            var24 -= 1744240411;
                                            var24 ^= 2032733897;
                                            var9 = var240.durationMs();
                                            long var303 = this.wN;
                                            var9 -= var303;
                                            var9 = var9;
                                            var24 ^= 948071455;
                                            var24 >>= 20;
                                            var24 ^= 352318181;
                                            var24 ^= 961104499;
                                            var24 ^= 2042413140;
                                        } else {
                                            var24 &= 1267982204;
                                            var24 -= 2102616360;
                                            var24 -= -1711476737;
                                            var24 ^= -708805794;
                                            var9 = 0L;
                                            var24 ^= -1240295892;
                                            var24 += 1357987859;
                                            var24 -= 1417988284;
                                            var24 ^= -298295791;
                                        }

                                        int var304 = var24 & -2124847590;
                                        int var305 = var304 & -242778564;
                                        int var306 = var305 * 176107455;
                                        int var307 = var306 << 21;
                                        int var308 = var307 ^ 1428951601;
                                        s(var196, var9, true, var308);
                                        TextStyle var197 = this.Rp;
                                        var182 = var197.size();
                                        var182 *= 0.5F;
                                        int var244 = var4 + 1;
                                        int var245 = var4 * var244;
                                        var4 = var245 & 1;
                                        if (var4 == 0) {
                                            var24 |= 876618010;
                                            var24 ^= 1009137217;
                                            var9 = var24;
                                            long var309 = var9 + 1L;
                                            long var310 = var9 * var309;
                                            long var334 = var9 + 2L;
                                            long var311 = var310 * var334;
                                            var9 += 3L;
                                            long var312 = var311 * var9;
                                            var9 = var312 & 7L;
                                            long var358;
                                            var4 = (var358 = var9 - 0L) == 0L ? 0 : (var358 < 0L ? -1 : 1);
                                            if (var4 == 0) {
                                                float var154 = var162 - var182;
                                                float var155 = var154 - 0.3F;
                                                StringBuilder var156 = this.aT;
                                                float var163 = var168 - 6.0F;
                                                TextStyle var169 = this.Rp;
                                                float var157 = var1.textRight(var156, var163, var155, var169);
                                                StringBuilder var158 = this.b;
                                                float var164 = var181 + 6.0F;
                                                TextStyle var170 = this.Rp;
                                                float var159 = var1.text(var158, var164, var155, var170);
                                                return;
                                            }
                                            break label221;
                                        }

                                        var24 += 382524714;
                                        var24 ^= 970511808;
                                    } else {
                                        var24 += -1646684241;
                                        var24 ^= 461242826;
                                        var24 ^= -988352474;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            UnsupportedOperationException var150 = new UnsupportedOperationException();
            throw var150;
        }

        IllegalStateException var151 = new IllegalStateException();
        throw var151;
    }

    private void o(Canvas var1, int var2) {
        label88: {
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            int var14;
            if (var5 != 0) {
                var14 = var2 | 241037486;
                var14 ^= 397507880;
            } else {
                var14 = switch (var2) {
                    case 326450840 -> var2 ^ -1574313486;
                    case 503305212 -> {
                        var14 = var2 + -700976278;
                        var14 >>= 3;
                        var14 ^= -1333162556;
                        yield var14 ^ -1863422228;
                    }
                    default -> var2 ^ -366887105;
                };
                var5 = var14 + 1;
                var5 = var14 * var5;
                var5 &= 1;
                if (var5 != 0) {
                    break label88;
                }

                var5 = var14 ^ 97557154;
                var5 -= -1281770485;
                var5 >>>= 26;
                var5 ^= 1847452738;
                float var78 = this.eC(var5);
                int var6 = var14 & -2101438041;
                var6 |= 1021744739;
                var6 += -1017230326;
                var6 ^= -397362944;
                float var82 = this.bJ(var6);
                FX var7 = this.IL;
                boolean var86;
                if (var7 != null) {
                    var14 &= 1889823743;
                    var14 <<= 15;
                    var14 |= -1674574115;
                    var14 >>>= 22;
                    var14 ^= 1465590339;
                    Integer var85 = var14;
                    if (var85 == null) {
                        break label88;
                    }

                    var86 = true;
                    var14 += -1909303233;
                    var14 *= -235839751;
                    var14 ^= -163048055;
                } else {
                    var14 &= 426354717;
                    var14 *= -1795089067;
                    var14 ^= 755673614;
                    var86 = false;
                    var14 >>= 13;
                    var14 -= 962817933;
                    var14 += -1026990068;
                    var14 ^= -1623745114;
                }

                int var8 = var14 + 1;
                var8 = var14 * var8;
                var8 &= 1;
                if (var8 != 0) {
                    break label88;
                }

                var8 = var4 + 1;
                var8 = var4 * var8;
                var8 &= 1;
                if (var8 == 0) {
                    var14 -= -1693710827;
                    var14 ^= 369488296;
                    var14 -= 1210011059;
                    var14 ^= -77114948;
                    var14 ^= 1263278806;
                    long var109 = var14;
                    long var10 = var109 + 1L;
                    var10 = var109 * var10;
                    long var110 = var10 & 1L;
                    long var138;
                    var8 = (var138 = var110 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                    if (var8 != 0) {
                        break label88;
                    }

                    var1.save();
                    if (!var86) {
                        var14 -= 915830937;
                        var14 ^= 2051079977;
                        Integer var87 = var14;
                        if (var87 == null) {
                            break label88;
                        }

                        var1.alpha(0.35F);
                        switch (var14) {
                            case 616914630:
                                var14 |= -1589678327;
                                var14 *= 1723946197;
                                var14 ^= -2067174809;
                                break;
                            case 911616008:
                                var14 ^= 1739583652;
                                break;
                            case 1961733143:
                            default:
                                var14 ^= -1603603389;
                        }
                    } else {
                        var14 &= -1430472508;
                        var14 >>>= 10;
                        var14 -= -1100864620;
                        var14 ^= 232835630;
                    }

                    int var88 = var14 + 1;
                    int var89 = var14 * var88;
                    var8 = var14 + 2;
                    int var90 = var89 * var8;
                    var8 = var14 + 3;
                    int var91 = var90 * var8;
                    int var92 = var91 & 7;
                    if (var92 != 0) {
                        break label88;
                    }

                    float var93 = var82 - 32.0F;
                    XF var114 = this.fK;
                    float var115 = var114.bs();
                    XF var9 = this.H;
                    float var128 = var9.bs();
                    int var132 = var14 | -346747836;
                    int var133 = var132 ^ -1249294990;
                    this.wq(var1, var93, var78, var115, var128, var133);
                    XF var94 = this.w;
                    float var95 = var94.bs();
                    Integer var58 = var4;
                    if (var58 != null) {
                        var14 = switch (var14) {
                            case 972529673 -> var14 ^ -986686386;
                            case 1281173852 -> {
                                var14 |= -1276046791;
                                var14 &= -1369302612;
                                yield var14 ^ 1679686672;
                            }
                            default -> var14 ^ 108209616;
                        };
                        long var116 = var14;
                        var10 = var116 + 1L;
                        var10 = var116 * var10;
                        long var12 = var116 + 2L;
                        var10 *= var12;
                        long var117 = var116 + 3L;
                        var10 *= var117;
                        long var118 = var10 & 7L;
                        long var139;
                        int var59 = (var139 = var118 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                        if (var59 == 0) {
                            XF var60 = this.g;
                            float var61 = var60.bs();
                            var8 = var14 & -1178657960;
                            var8 += 619699102;
                            var8 -= -138409885;
                            var8 |= 417747195;
                            var8 ^= -415580971;
                            this.wq(var1, var82, var78, var95, var61, var8);
                            float var62 = var82 + 32.0F;
                            XF var96 = this.Y;
                            float var97 = var96.bs();
                            XF var124 = this.Vu;
                            float var125 = var124.bs();
                            int var129 = var14 * -1660122511;
                            int var130 = var129 ^ -1826558126;
                            this.wq(var1, var62, var78, var97, var125, var130);
                            float var63 = var82 - 32.0F;
                            XF var98 = this.H;
                            float var99 = var98.bs();
                            var8 = var14 + -1497119854;
                            var8 ^= -743841365;
                            this.A(var1, var63, var78, var99, 0, var8);
                            XF var64 = this.g;
                            float var65 = var64.bs();
                            int var100 = var14 | 2033360769;
                            int var101 = var100 ^ 1503114968;
                            this.A(var1, var82, var78, var65, 1, var101);
                            float var66 = var82 + 32.0F;
                            XF var83 = this.Vu;
                            float var84 = var83.bs();
                            int var102 = var14 + 1953462511;
                            int var103 = var102 ^ -1677387954;
                            this.A(var1, var66, var78, var84, 2, var103);
                            var1.restore();
                            return;
                        }
                        break label88;
                    }

                    switch (var14) {
                        case -628035569:
                            var14 ^= -1698836023;
                            break;
                        case 1281173852:
                            var14 -= 37257129;
                            var14 &= -286383837;
                            var14 ^= 1114288117;
                            break;
                        case 1870841400:
                        default:
                            var14 ^= -719852119;
                    }
                } else {
                    var14 |= -1237634099;
                    var14 -= -687403784;
                    var14 *= -310912991;
                    var14 *= -1616311305;
                    var14 ^= 838576343;
                }
            }

            var4 = var14 + 1;
            var4 = var14 * var4;
            var14 = var4 & 1;
            if (var14 == 0) {
                UnsupportedOperationException var56 = new UnsupportedOperationException();
                throw var56;
            }
        }

        IllegalArgumentException var57 = new IllegalArgumentException();
        throw var57;
    }

    private void wq(Canvas var1, float var2, float var3, float var4, float var5, int var6) {
        label39: {
            int var8 = System.identityHashCode(this);
            float var82;
            int var9 = (var82 = var4 - 0.02F) == 0.0F ? 0 : (var82 < 0.0F ? -1 : 1);
            long var10 = var8;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            var10 = var12 & 1L;
            long var83;
            int var61 = (var83 = var10 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
            int var27;
            if (var61 == 0) {
                var27 = var6 - 908202789;
                var27 -= 494897837;
                var27 += -1963680166;
                var27 |= 1682941196;
                var27 ^= 184420756;
                var10 = var27;
                var12 = var10 + 1L;
                var12 = var10 * var12;
                long var14 = var10 + 2L;
                var12 *= var14;
                var10 += 3L;
                var12 *= var10;
                var10 = var12 & 7L;
                long var84;
                int var65 = (var84 = var10 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                if (var65 != 0) {
                    break label39;
                }

                if (var9 < 0) {
                    var27 |= -1953871192;
                    var27 >>>= 1;
                    var27 &= 1645448268;
                    var27 ^= 1132788882;
                    return;
                }

                var27 *= 1982927221;
                var27 &= 2125594918;
                var27 += 1114659081;
                var27 &= -1699693219;
                var27 ^= 905841763;
                var9 = var27 + 1;
                var9 = var27 * var9;
                var9 &= 1;
                if (var9 != 0) {
                    break label39;
                }

                float var56 = 0.1F * var5;
                int var66 = var8 + 1;
                int var67 = var8 * var66;
                var8 = var67 & 1;
                if (var8 == 0) {
                    var27 &= 158194941;
                    var27 -= 784846059;
                    var27 -= -257500356;
                    var27 *= -1008808959;
                    var27 ^= 1796445269;
                    var10 = var27;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var14 = var10 + 2L;
                    var12 *= var14;
                    var10 += 3L;
                    var12 *= var10;
                    var10 = var12 & 7L;
                    long var85;
                    var8 = (var85 = var10 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                    if (var8 == 0) {
                        float var47 = 1.0F + var56;
                        float var48 = 9.5F * var47;
                        var9 = this.o;
                        float var71 = 0.13F * var4;
                        var9 = DP.Y(var9, var71);
                        var1.circle(var2, var3, var48, var9);
                        return;
                    }
                    break label39;
                }

                var27 += 1537118711;
                var27 *= -849797491;
                var27 ^= -1840621549;
            } else {
                var27 = var6 & -1574404703;
                var27 <<= 8;
                var27 += 380375391;
                var27 -= -1690126255;
                var27 ^= -1843715984;
            }

            var8 = var27 + 1;
            var8 = var27 * var8;
            var9 = var27 + 2;
            var8 *= var9;
            var27 += 3;
            var8 *= var27;
            var27 = var8 & 7;
            if (var27 == 0) {
                RuntimeException var44 = new RuntimeException();
                throw var44;
            }
        }

        IllegalArgumentException var43 = new IllegalArgumentException();
        throw var43;
    }

    private void A(Canvas var1, float var2, float var3, float var4, int var5, int var6) {
        label145: {
            label155: {
                int var9 = System.identityHashCode(this);
                var1.save();
                float var10 = 0.18F * var4;
                var10++;
                int var11 = var9 + 1;
                var11 = var9 * var11;
                int var12 = var9 + 2;
                var11 *= var12;
                var12 = var9 + 3;
                var11 *= var12;
                var11 &= 7;
                if (var11 != 0) {
                    switch (var6) {
                        case -1561835163:
                            int var105 = var6 >> 2;
                            var105 ^= -483537364;
                            break;
                        case 260163218:
                        default:
                            int var104 = var6 ^ -479516920;
                            break;
                        case 1770646258:
                            int var103 = var6 ^ 257160281;
                    }
                } else {
                    int var7 = var6 << 31;
                    var7 <<= 23;
                    var7 <<= 19;
                    var7 ^= -1232374656;
                    var11 = var5 + 1;
                    var11 = var5 * var11;
                    var12 = var5 + 2;
                    var11 *= var12;
                    var12 = var5 + 3;
                    var11 *= var12;
                    var11 &= 7;
                    if (var11 != 0) {
                        break label145;
                    }

                    var1.scale(var10, var2, var3);
                    label140:
                    switch (var5) {
                        case 0:
                            var7 >>>= 3;
                            var7 ^= 673755689;
                            long var135 = var5;
                            long var181 = var135 + 1L;
                            long var182 = var135 * var181;
                            long var136 = var182 & 1L;
                            long var196;
                            int var137 = (var196 = var136 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                            if (var137 != 0) {
                                break label145;
                            }

                            TextStyle var138 = this.fO;
                            var11 = this.o;
                            long var183 = var9;
                            long var194 = var183 + 1L;
                            var194 = var183 * var194;
                            long var184 = var194 & 1L;
                            long var197;
                            var12 = (var197 = var184 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                            if (var12 == 0) {
                                var7 ^= -589246738;
                                var7 ^= -1646542890;
                                ii.G(var1, var2, var3, var138, var11);
                                var7 += -196454757;
                                var7 *= 1059135627;
                                var7 &= 220202915;
                                var7 ^= -338995459;
                                break label155;
                            }

                            var7 &= -1690405316;
                            var7 ^= 296716365;
                            break;
                        case 1:
                            var7 = switch (var7) {
                                case -1232374656 -> {
                                    var7 *= -930210867;
                                    var7 -= -1075268898;
                                    yield var7 ^ 540229532;
                                }
                                default -> var7 ^ -135399389;
                                case -582533434 -> var7 ^ 621330924;
                            };
                            FX var122 = this.IL;
                            Integer var151 = var9;
                            if (var151 != null) {
                                var7 &= -1499228642;
                                var7 ^= 999660880;
                                if (var122 != null) {
                                    var7 &= 567902690;
                                    var7 -= -1086887020;
                                    var7 -= 1298035063;
                                    var7 ^= -344014263;
                                    long var123 = var5;
                                    long var173 = var123 + 1L;
                                    long var174 = var123 * var173;
                                    long var192 = var123 + 2L;
                                    long var175 = var174 * var192;
                                    long var124 = var123 + 3L;
                                    long var176 = var175 * var124;
                                    long var125 = var176 & 7L;
                                    long var200;
                                    int var126 = (var200 = var125 - 0L) == 0L ? 0 : (var200 < 0L ? -1 : 1);
                                    if (var126 != 0) {
                                        break label145;
                                    }

                                    FX var127 = this.IL;
                                    var151 = var9;
                                    if (var151 == null) {
                                        var7 ^= 1481091736;
                                        var7 += -60710290;
                                        var7 -= -2074946531;
                                        var7 &= 1504140668;
                                        var7 ^= 303482177;
                                        break;
                                    }
                                    var7 = switch (var7) {
                                        case -1134302843 -> var7 ^ -2065449775;
                                        case 528836222 -> {
                                            var7 += -1072473385;
                                            var7 &= 415986507;
                                            var7 |= -2135285326;
                                            yield var7 ^ -1296297897;
                                        }
                                        default -> var7 ^ -391762109;
                                    };
                                    boolean var128 = var127.playing();
                                    if (var128) {
                                        var7 ^= -1708323064;
                                        var7 >>>= 2;
                                        var7 *= -1484526421;
                                        var7 <<= 14;
                                        var7 ^= -658467205;
                                        int var129 = this.o;
                                        long var153 = var9;
                                        long var189 = var153 + 1L;
                                        var189 = var153 * var189;
                                        long var154 = var189 & 1L;
                                        long var201;
                                        int var155 = (var201 = var154 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                                        if (var155 == 0) {
                                            var7 = switch (var7) {
                                                case -1992247650 -> var7 ^ 1743981830;
                                                default -> var7 ^ 1178402730;
                                                case 1510921851 -> {
                                                    var7 >>>= 5;
                                                    yield var7 ^ 1812897512;
                                                }
                                            };
                                            Integer var156 = var5;
                                            if (var156 == null) {
                                                break label145;
                                            }

                                            ii.U(var1, var2, var3, 10.4F, var129);
                                            var7 ^= -984632778;
                                            var7 ^= 1299845040;
                                            break label155;
                                        }

                                        switch (var7) {
                                            case 226175223:
                                            default:
                                                var7 ^= -1954385758;
                                                break label140;
                                            case 612872169:
                                                var7 ^= 1715348912;
                                                break label140;
                                            case 1510921851:
                                                var7 <<= 24;
                                                var7 &= -807132971;
                                                var7 += -1969615126;
                                                var7 ^= -569519457;
                                                break label140;
                                        }
                                    }

                                    var7 -= -1153615691;
                                    var7 ^= 1725521944;
                                } else {
                                    var7 >>>= 31;
                                    var7 &= -454829190;
                                    var7 ^= 135289079;
                                }

                                long var130 = var5;
                                long var177 = var130 + 1L;
                                long var178 = var130 * var177;
                                long var193 = var130 + 2L;
                                long var179 = var178 * var193;
                                long var131 = var130 + 3L;
                                long var180 = var179 * var131;
                                long var132 = var180 & 7L;
                                long var202;
                                int var133 = (var202 = var132 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                                if (var133 != 0) {
                                    break label145;
                                }

                                TextStyle var134 = this.n;
                                var151 = var9;
                                if (var151 != null) {
                                    var7 ^= 572213808;
                                    var7 &= 1290533330;
                                    var7 ^= 631598965;
                                    int var158 = var5 + 1;
                                    var158 = var5 * var158;
                                    var158 &= 1;
                                    if (var158 != 0) {
                                        break label145;
                                    }

                                    ii.J(var1, var2, var3, var134);
                                    switch (var7) {
                                        case -1339265261:
                                        default:
                                            var7 ^= -1625481134;
                                            break label155;
                                        case 209445894:
                                            var7 ^= 362429147;
                                            break label155;
                                        case 766410679:
                                            var7 += 1266454584;
                                            var7 |= -875580201;
                                            var7 += 644777536;
                                            var7 -= 1110419317;
                                            var7 ^= 113625879;
                                            break label155;
                                    }
                                }

                                var7 += 651016084;
                                var7 += -1529890384;
                                var7 ^= -667281842;
                            } else {
                                switch (var7) {
                                    case -499242946:
                                        var7 *= 121173995;
                                        var7 += 1413237450;
                                        var7 += -1284742071;
                                        var7 ^= 1753851975;
                                        var7 ^= 1275397583;
                                        break label140;
                                    case 1155891168:
                                        var7 ^= -654314219;
                                        break label140;
                                    case 1487310915:
                                    default:
                                        var7 ^= -1870174538;
                                }
                            }
                            break;
                        default:
                            var7 += 22667322;
                            var7 ^= 1817651047;
                            long var117 = var5;
                            long var169 = var117 + 1L;
                            long var170 = var117 * var169;
                            long var14 = var117 + 2L;
                            long var171 = var170 * var14;
                            long var118 = var117 + 3L;
                            long var172 = var171 * var118;
                            long var119 = var172 & 7L;
                            long var198;
                            int var120 = (var198 = var119 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                            if (var120 != 0) {
                                break label145;
                            }

                            TextStyle var121 = this.fO;
                            long var148 = var9;
                            long var13 = var148 + 1L;
                            var13 = var148 * var13;
                            long var15 = var148 + 2L;
                            var13 *= var15;
                            long var149 = var148 + 3L;
                            var13 *= var149;
                            long var150 = var13 & 7L;
                            long var199;
                            var9 = (var199 = var150 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                            if (var9 == 0) {
                                var7 ^= -1868025712;
                                var7 ^= -836855649;
                                var9 = this.o;
                                ii.mr(var1, var2, var3, var121, var9);
                                switch (var7) {
                                    case -2082383693:
                                        var7 ^= -676901299;
                                        break label155;
                                    case -2063279150:
                                        var7 *= 1370258583;
                                        var7 >>>= 27;
                                        var7 ^= 325703777;
                                        var7 += -1778886133;
                                        var7 ^= 1334404951;
                                        break label155;
                                    case -1734305497:
                                    default:
                                        var7 ^= -1126472677;
                                        break label155;
                                }
                            }

                            var7 += -2082894832;
                            var7 <<= 3;
                            var7 -= 1288695973;
                            var7 *= 20043273;
                            var7 ^= 623729326;
                    }
                }

                Integer var107 = var5;
                if (var107 != null) {
                    AssertionError var109 = new AssertionError();
                    throw var109;
                }
                break label145;
            }

            long var112 = var5;
            long var162 = var112 + 1L;
            var162 = var112 * var162;
            long var191 = var112 + 2L;
            var162 *= var191;
            var112 += 3L;
            var162 *= var112;
            var112 = var162 & 7L;
            long var203;
            int var115 = (var203 = var112 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
            if (var115 == 0) {
                var1.restore();
                return;
            }
        }

        AssertionError var108 = new AssertionError();
        throw var108;
    }

    private void dt(Canvas var1, String var2, float var3, float var4, float var5, TextStyle var6, int var7) {
        int var9 = System.identityHashCode(this);
        float var10 = var1.measure(var2, var6);
        float var11 = var5 + 0.5F;
        float var205;
        int var129 = (var205 = var10 - var11) == 0.0F ? 0 : (var205 < 0.0F ? -1 : 1);
        long var12 = var9;
        long var14 = var12 + 1L;
        var14 = var12 * var14;
        var12 = var14 & 1L;
        long var206;
        int var165 = (var206 = var12 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
        label142:
        if (var165 == 0) {
            int var23 = switch (var7) {
                default -> var7 ^ -1694389881;
                case 230157169 -> {
                    int var24 = var7 + -1289822977;
                    var24 ^= 803091537;
                    yield var24 ^ 1250351324;
                }
                case 935173922 -> var7 ^ 1241567070;
            };
            var12 = var23;
            var14 = var12 + 1L;
            var14 = var12 * var14;
            var12 = var14 & 1L;
            long var207;
            int var168 = (var207 = var12 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
            if (var168 == 0) {
                if (var129 <= 0) {
                    var23 += -181183539;
                    var23 >>>= 15;
                    var23 |= 1930620057;
                    var23 ^= 2084400941;
                    Integer var130 = var23;
                    if (var130 != null) {
                        var11 = var1.text(var2, var3, var4, var6);
                        return;
                    }
                } else {
                    var23 = switch (var23) {
                        case -1517411075 -> {
                            var23 += 1534878343;
                            var23 -= -758422685;
                            yield var23 ^ 161702376;
                        }
                        default -> var23 ^ 1866529743;
                        case 2141373490 -> var23 ^ 2124861884;
                    };
                    var11 = 22.0F;
                    var10 += var11;
                    Integer var133 = var9;
                    if (var133 == null) {
                        var23 ^= -2111632468;
                        var23 ^= 1209718022;
                        break label142;
                    }

                    var23 -= 313127221;
                    var23 ^= -2136184240;
                    var23 >>>= 3;
                    var23 *= 1693256623;
                    var23 ^= 1793585584;
                    Integer var134 = var23;
                    label136:
                    if (var134 != null) {
                        String var135 = this.l;
                        if (var2 != var135) {
                            var23 >>>= 25;
                            var23 <<= 9;
                            var23 ^= 1874343160;
                            int var136 = var23 + 1;
                            int var137 = var23 * var136;
                            int var138 = var137 & 1;
                            if (var138 != 0) {
                                break label136;
                            }

                            this.l = var2;
                            this.PL = 0.0F;
                            int var139 = var9 + 1;
                            int var140 = var9 * var139;
                            int var141 = var140 & 1;
                            if (var141 != 0) {
                                switch (var23) {
                                    case -1885855213:
                                        var23 ^= 189909001;
                                        break label142;
                                    case 310863172:
                                    default:
                                        var23 ^= -1160096416;
                                        break label142;
                                    case 1874349304:
                                        var23 *= -1376926037;
                                        var23 &= 1996426907;
                                        var23 |= -327046898;
                                        var23 ^= 18756333;
                                        break label142;
                                }
                            }

                            var23 ^= 955365467;
                            var23 += -1374023301;
                            var23 >>= 5;
                            var23 -= 1359801877;
                            var23 ^= -221002459;
                            long var142 = var23;
                            long var13 = var142 + 1L;
                            var13 = var142 * var13;
                            long var143 = var13 & 1L;
                            long var208;
                            int var144 = (var208 = var143 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                            if (var144 != 0) {
                                break label136;
                            }

                            this.YI = 1.6F;
                            var23 |= 1529432020;
                            var23 ^= 186063595;
                        } else {
                            var23 -= -2089993796;
                            var23 <<= 21;
                            var23 += 1979074283;
                            var23 |= -1731475818;
                            var23 ^= -1392170006;
                        }

                        int var145 = var23 + 1;
                        int var146 = var23 * var145;
                        int var169 = var23 + 2;
                        int var147 = var146 * var169;
                        int var170 = var23 + 3;
                        int var148 = var147 * var170;
                        int var149 = var148 & 7;
                        if (var149 == 0) {
                            var11 = this.PL;
                            var11 %= var10;
                            float var171 = this.PL;
                            float var209;
                            int var172 = (var209 = var171 - var10) == 0.0F ? 0 : (var209 < 0.0F ? -1 : 1);
                            int var179 = var9 + 1;
                            var179 = var9 * var179;
                            var179 &= 1;
                            if (var179 != 0) {
                                var23 >>>= 7;
                                var23 |= 2048297097;
                                var23 += -569370604;
                                var23 ^= -1250586996;
                                break label142;
                            }

                            var23 |= 2014178289;
                            var23 ^= 1316208950;
                            long var182 = var23;
                            long var15 = var182 + 1L;
                            var15 = var182 * var15;
                            long var17 = var182 + 2L;
                            var15 *= var17;
                            long var183 = var182 + 3L;
                            var15 *= var183;
                            long var184 = var15 & 7L;
                            long var210;
                            var179 = (var210 = var184 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                            label124:
                            if (var179 == 0) {
                                float var177;
                                if (var172 >= 0) {
                                    var23 |= -693994495;
                                    var23 -= -1341931218;
                                    var23 ^= 88560064;
                                    float var173 = this.PL;
                                    float var174 = var173 - var10;
                                    this.PL = var174;
                                    this.YI = 1.6F;
                                    Integer var175 = var9;
                                    if (var175 == null) {
                                        var23 += -434979488;
                                        var23 <<= 20;
                                        var23 *= -575362549;
                                        var23 ^= 567647075;
                                        break label142;
                                    }

                                    var23 += 1204141794;
                                    var23 += 1816908467;
                                    var23 ^= -1637442755;
                                    float var176 = 0.0F;
                                    var177 = var176;
                                    var23 *= -1054457457;
                                    var23 &= 548591966;
                                    var23 ^= 1098348219;
                                } else {
                                    var23 = switch (var23) {
                                        case 848047811 -> {
                                            var23 >>>= 30;
                                            var23 ^= -1977298712;
                                            var23 -= -1892703886;
                                            var23 ^= 1518931453;
                                            yield var23 ^ 548696910;
                                        }
                                        case 997136708 -> var23 ^ -1003566293;
                                        default -> var23 ^ -284689915;
                                    };
                                    Integer var186 = var23;
                                    if (var186 == null) {
                                        break label124;
                                    }

                                    var177 = var11;
                                    var23 += -673327790;
                                    var23 |= 653629252;
                                    var23 -= -1508934013;
                                    var23 ^= 352968028;
                                    var23 ^= -1398531541;
                                }

                                var1.save();
                                var11 = var4 - 2.0F;
                                float var187 = var6.size();
                                float var188 = var187 + 4.0F;
                                var1.clip(var3, var11, var5, var188, 0.0F);
                                this.pM = var3;
                                var11 = var3 + var5;
                                this.Q = var11;
                                int var154 = var9 + 1;
                                int var155 = var9 * var154;
                                int var156 = var155 & 1;
                                if (var156 != 0) {
                                    var23 &= 560863746;
                                    var23 ^= -857636511;
                                    break label142;
                                }

                                var23 |= -755544135;
                                var23 >>>= 16;
                                var23 <<= 28;
                                var23 -= 1000830928;
                                var23 ^= 375204909;
                                int var157 = var23 + 1;
                                int var158 = var23 * var157;
                                int var159 = var158 & 1;
                                label116:
                                if (var159 == 0) {
                                    float var211;
                                    int var160 = (var211 = var177 - 0.5F) == 0.0F ? 0 : (var211 < 0.0F ? -1 : 1);
                                    boolean var162;
                                    if (var160 > 0) {
                                        var23 -= 1230626878;
                                        var23 ^= 1117060226;
                                        var23 ^= 1901758167;
                                        var23 ^= 1483781419;
                                        var23 ^= 1207433772;
                                        long var189 = var23;
                                        var15 = var189 + 1L;
                                        var15 = var189 * var15;
                                        long var190 = var15 & 1L;
                                        long var212;
                                        int var161 = (var212 = var190 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                                        if (var161 != 0) {
                                            break label116;
                                        }

                                        var162 = true;
                                        var23 >>>= 19;
                                        var23 ^= -1895839333;
                                    } else {
                                        var23 &= 1752463367;
                                        var23 += -308652456;
                                        var23 &= -1651814559;
                                        var23 *= -1176247873;
                                        var23 ^= -1004989727;
                                        var162 = false;
                                        var23 |= 174561319;
                                        var23 -= -1213220206;
                                        var23 *= 1315684951;
                                        var23 ^= 748954956;
                                    }

                                    long var191 = var23;
                                    var15 = var191 + 1L;
                                    var15 = var191 * var15;
                                    long var192 = var15 & 1L;
                                    long var213;
                                    var179 = (var213 = var192 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                                    if (var179 == 0) {
                                        this.ey = var162;
                                        var11 = var3 - var177;
                                        GlyphTint var194 = this.z;
                                        Integer var121 = var9;
                                        if (var121 != null) {
                                            var23 *= -2098147479;
                                            var23 -= -2074494984;
                                            var23 ^= 733749143;
                                            float var122 = var1.text(var2, var11, var4, var6, var194);
                                            float var123 = var3 - var177;
                                            float var124 = var123 + var10;
                                            GlyphTint var128 = this.z;
                                            float var125 = var1.text(var2, var124, var4, var6, var128);
                                            var1.restore();
                                            return;
                                        }

                                        switch (var23) {
                                            case -1895835897:
                                                var23 &= 1261282474;
                                                var23 += 1930839387;
                                                var23 -= 1120422941;
                                                var23 *= 589939823;
                                                var23 ^= 1528157603;
                                                break label142;
                                            case 391816260:
                                            default:
                                                var23 ^= 289429987;
                                                break label142;
                                            case 1046490886:
                                                var23 ^= -913445383;
                                                break label142;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            IllegalArgumentException var126 = new IllegalArgumentException();
            throw var126;
        } else {
            int var8 = var7 - 242872353;
            var8 -= -894895545;
            var8 += 188242585;
            var8 |= 1268233399;
            var8 ^= -1837472556;
        }

        RuntimeException var120 = new RuntimeException();
        throw var120;
    }

    private int Es(int var1, float var2) {
        label103: {
            int var95;
            label110: {
                int var3 = kS;
                var3 ^= -1687785790;
                int var5 = System.identityHashCode(this);
                float var6 = 7.0F;
                int var7 = (this.ey ? 1 : 0);
                long var8 = var5;
                long var10 = var8 + 1L;
                var10 = var8 * var10;
                var8 = var10 & 1L;
                long var135;
                int var100 = (var135 = var8 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                if (var100 != 0) {
                    var3 -= 1925521167;
                    var3 ^= -2020234090;
                    var3 |= -982921381;
                    var3 ^= -980126935;
                } else {
                    label109: {
                        var3 *= -1903733501;
                        var3 += -191326635;
                        var3 ^= -1719021105;
                        Integer var101 = var1;
                        if (var101 == null) {
                            break label103;
                        }

                        float var91;
                        if (var7 != 0) {
                            var3 *= 555708243;
                            var3 ^= 1329024027;
                            long var83 = var1;
                            long var9 = var83 + 1L;
                            var9 = var83 * var9;
                            long var11 = var83 + 2L;
                            var9 *= var11;
                            long var84 = var83 + 3L;
                            var9 *= var84;
                            long var85 = var9 & 7L;
                            long var136;
                            var7 = (var136 = var85 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                break label103;
                            }

                            float var87 = this.pM;
                            float var88 = var2 - var87;
                            float var89 = var88 / var6;
                            float var90 = TP.S(var89);
                            Integer var102 = var5;
                            if (var102 == null) {
                                var3 -= -852124044;
                                var3 ^= 1993042452;
                                break label109;
                            }

                            var3 &= 2056521744;
                            var3 ^= 1355219908;
                            var3 |= 6979746;
                            var3 &= -247027396;
                            var3 ^= -828858571;
                            int var103 = var1 + 1;
                            int var104 = var1 * var103;
                            int var127 = var1 + 2;
                            int var105 = var104 * var127;
                            int var128 = var1 + 3;
                            int var106 = var105 * var128;
                            int var107 = var106 & 7;
                            if (var107 != 0) {
                                break label103;
                            }

                            var91 = var90;
                            switch (var3) {
                                case -1361437183:
                                    var3 |= 537022118;
                                    var3 <<= 13;
                                    var3 ^= -380764680;
                                    var3 ^= -512787295;
                                    break;
                                case -1228193951:
                                default:
                                    var3 ^= 663634515;
                                    break;
                                case 375712915:
                                    var3 ^= 1764304681;
                            }
                        } else {
                            var3 = switch (var3) {
                                default -> var3 ^ 257957782;
                                case 1533201851 -> {
                                    var3 &= 1942299935;
                                    var3 ^= -1996389002;
                                    var3 += -837865704;
                                    var3 |= -1406421596;
                                    yield var3 ^ -401231508;
                                }
                                case 1700919360 -> var3 ^ 992468739;
                            };
                            var8 = var1;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var8 = var10 & 1L;
                            long var137;
                            int var110 = (var137 = var8 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                            if (var110 != 0) {
                                break label103;
                            }

                            var91 = 1.0F;
                            var3 |= 1427420355;
                            var3 ^= 183521823;
                            var3 >>>= 16;
                            var3 += 2033576538;
                            var3 ^= 985671857;
                        }

                        int var111 = var1 + 1;
                        int var112 = var1 * var111;
                        int var113 = var112 & 1;
                        if (var113 != 0) {
                            break label103;
                        }

                        float var114 = this.Q;
                        float var115 = var114 - var2;
                        var6 = var115 / var6;
                        var6 = TP.S(var6);
                        var6 = var91 * var6;
                        Integer var92 = var5;
                        if (var92 != null) {
                            var3 |= 1044252717;
                            var3 ^= 958640116;
                            var92 = var1;
                            if (var92 == null) {
                                break label103;
                            }

                            float var138;
                            int var94 = (var138 = var6 - 1.0F) == 0.0F ? 0 : (var138 < 0.0F ? -1 : 1);
                            if (var94 >= 0) {
                                var3 <<= 30;
                                var3 ^= 89870782;
                                long var96 = var1;
                                long var129 = var96 + 1L;
                                var129 = var96 * var129;
                                long var97 = var129 & 1L;
                                long var139;
                                var94 = (var139 = var97 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                                if (var94 != 0) {
                                    break label103;
                                }

                                var95 = var1;
                                var3 += 2020253467;
                                var3 &= 1380310822;
                                var3 ^= 131094722;
                                break label110;
                            }
                            var3 = switch (var3) {
                                case -694103714 -> var3 ^ 1013869707;
                                case 1188939401 -> {
                                    var3 *= 1221299427;
                                    var3 |= -1883967895;
                                    var3 *= -1770088601;
                                    var3 &= 316461908;
                                    yield var3 ^ -1629880583;
                                }
                                default -> var3 ^ 505231919;
                            };
                            Integer var116 = var1;
                            if (var116 == null) {
                                break label103;
                            }

                            float var117 = DP.L(var1);
                            var6 = var117 * var6;
                            int var118 = var5 + 1;
                            int var119 = var5 * var118;
                            var5 = var119 & 1;
                            if (var5 == 0) {
                                var3 <<= 30;
                                var3 ^= 1927322285;
                                var3 -= 1528442416;
                                var3 ^= -999100056;
                                var5 = DP.Y(var1, var6);
                                var95 = var5;
                                var3 -= 155667771;
                                var3 |= -403601364;
                                var3 += 1909501823;
                                var3 *= 583687231;
                                var3 ^= 1842463489;
                                break label110;
                            }

                            var3 *= -686716513;
                            var3 += 984263400;
                            var3 -= -1902733341;
                            var3 ^= -1621489110;
                        } else {
                            var3 ^= -2122176597;
                            var3 ^= -769668448;
                        }
                    }
                }

                Integer var70 = var1;
                if (var70 != null) {
                    AssertionError var72 = new AssertionError();
                    throw var72;
                }
                break label103;
            }

            long var75 = var1;
            long var120 = var75 + 1L;
            var120 = var75 * var120;
            long var134 = var75 + 2L;
            var120 *= var134;
            var75 += 3L;
            var120 *= var75;
            var75 = var120 & 7L;
            long var140;
            int var78 = (var140 = var75 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
            if (var78 == 0) {
                return var95;
            }
        }

        RuntimeException var71 = new RuntimeException();
        throw var71;
    }

    private static void s(StringBuilder var0, long var1, boolean var3, int var4) {
        label133: {
            int var6 = System.identityHashCode(var0);
            int var7 = var6 + 1;
            var7 = var6 * var7;
            int var8 = var6 + 2;
            var7 *= var8;
            var8 = var6 + 3;
            var7 *= var8;
            var7 &= 7;
            int var20;
            if (var7 != 0) {
                var20 = var4 >> 7;
                var20 *= 77686159;
                var20 |= 1527084991;
                var20 &= -1412214683;
                var20 ^= -226775291;
            } else {
                var20 = var4 >>> 28;
                var20 ^= 1930289803;
                var0.setLength(0);
                long var107 = Math.max(0L, var1);
                long var108 = var107 / 1000L;
                if (var3) {
                    var20 -= -1696031190;
                    var20 -= -976464521;
                    var20 += 886647842;
                    var20 &= -1508275201;
                    var20 ^= -1823690028;
                    long var9 = var20;
                    long var11 = var9 + 1L;
                    var11 = var9 * var11;
                    long var13 = var9 + 2L;
                    var11 *= var13;
                    var9 += 3L;
                    var11 *= var9;
                    var9 = var11 & 7L;
                    long var186;
                    int var114 = (var186 = var9 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                    if (var114 != 0) {
                        break label133;
                    }

                    StringBuilder var115 = var0.append('-');
                    var20 += 1406156771;
                    var20 &= 932048287;
                    var20 ^= 787533920;
                } else {
                    var20 -= -1624947730;
                    var20 ^= -602626194;
                }

                long var116 = var20;
                long var154 = var116 + 1L;
                var154 = var116 * var154;
                long var178 = var116 + 2L;
                var154 *= var178;
                var116 += 3L;
                var154 *= var116;
                var116 = var154 & 7L;
                long var187;
                int var119 = (var187 = var116 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                if (var119 != 0) {
                    break label133;
                }

                var116 = var108 / 3600L;
                Integer var158 = var6;
                label130:
                if (var158 != null) {
                    var20 >>= 6;
                    var20 >>= 7;
                    var20 ^= -770006739;
                    var154 = var108 / 60L;
                    var154 %= 60L;
                    long var109 = var108 % 60L;
                    long var188;
                    int var179 = (var188 = var116 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                    if (var179 > 0) {
                        var20 = switch (var20) {
                            case -1559710879 -> var20 ^ -1920562218;
                            case -769990964 -> {
                                var20 ^= 1690792668;
                                var20 <<= 29;
                                yield var20 ^ 1123831806;
                            }
                            default -> var20 ^ -721594552;
                        };
                        StringBuilder var121 = var0.append(var116);
                        int var10 = var6 + 1;
                        var10 = var6 * var10;
                        int var180 = var6 + 2;
                        var10 *= var180;
                        int var181 = var6 + 3;
                        var10 *= var181;
                        var10 &= 7;
                        if (var10 != 0) {
                            var20 &= 1227033529;
                            var20 ^= -1723140968;
                            break label130;
                        }

                        var20 &= 1634124531;
                        var20 ^= 1565966931;
                        Integer var132 = var20;
                        if (var132 == null) {
                            break label133;
                        }

                        StringBuilder var122 = var121.append(':');
                        long var189;
                        int var133 = (var189 = var154 - 10L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                        String var134;
                        if (var133 < 0) {
                            var20 += 1547030145;
                            var20 &= 255236499;
                            var20 ^= -674739055;
                            var134 = "0";
                            switch (var20) {
                                case -1748046119:
                                default:
                                    var20 ^= -1456081280;
                                    break;
                                case -1671652317:
                                    var20 ^= -1367931012;
                                    break;
                                case -555203181:
                                    var20 <<= 24;
                                    var20 ^= -1138527980;
                                    var20 >>= 6;
                                    var20 += 307007371;
                                    var20 ^= -879475627;
                            }
                        } else {
                            var20 -= -153866153;
                            var20 ^= 836339977;
                            var134 = "";
                            switch (var20) {
                                case -73453766:
                                    var20 ^= -368783479;
                                    break;
                                case 394778947:
                                    var20 += 191956774;
                                    var20 -= -1147965745;
                                    var20 ^= -1074255744;
                                    break;
                                case 1027964304:
                                default:
                                    var20 ^= 541735256;
                            }
                        }

                        var178 = var20;
                        long var15 = var178 + 1L;
                        var15 = var178 * var15;
                        var178 = var15 & 1L;
                        long var190;
                        int var184 = (var190 = var178 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                        if (var184 != 0) {
                            break label133;
                        }

                        StringBuilder var123 = var122.append(var134);
                        var20 ^= 991376546;
                        var20 ^= 1247560119;
                        var20 ^= 178583895;
                    } else {
                        var20 += 1145636307;
                        var20 += -1058992472;
                        var20 ^= 2113809481;
                        var20 &= 1498920744;
                        var20 ^= -1419754928;
                    }

                    Integer var124 = var20;
                    if (var124 == null) {
                        break label133;
                    }

                    StringBuilder var125 = var0.append(var154);
                    int var135 = var6 + 1;
                    var135 = var6 * var135;
                    int var161 = var6 + 2;
                    var135 *= var161;
                    int var162 = var6 + 3;
                    var135 *= var162;
                    var135 &= 7;
                    if (var135 == 0) {
                        var20 += -1303762341;
                        var20 -= -836328564;
                        var20 |= 1054291938;
                        var20 ^= 2093041201;
                        var20 ^= 1452601586;
                        var135 = var20 + 1;
                        var135 = var20 * var135;
                        var135 &= 1;
                        if (var135 != 0) {
                            break label133;
                        }

                        StringBuilder var126 = var125.append(':');
                        long var191;
                        var135 = (var191 = var109 - 10L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                        String var148;
                        if (var135 < 0) {
                            var20 = switch (var20) {
                                default -> var20 ^ 1918037130;
                                case -1786590940 -> {
                                    var20 |= 732487041;
                                    var20 ^= -916610359;
                                    yield var20 ^ 1420296502;
                                }
                                case 1159177778 -> var20 ^ 25996232;
                            };
                            long var144 = var20;
                            long var12 = var144 + 1L;
                            var12 = var144 * var12;
                            long var14 = var144 + 2L;
                            var12 *= var14;
                            long var145 = var144 + 3L;
                            var12 *= var145;
                            long var146 = var12 & 7L;
                            long var192;
                            var135 = (var192 = var146 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                            if (var135 != 0) {
                                break label133;
                            }

                            var148 = "0";
                            switch (var20) {
                                case 576683610:
                                    var20 ^= -505639827;
                                    var20 ^= 350370651;
                                    break;
                                case 1271554021:
                                default:
                                    var20 ^= 2014897006;
                                    break;
                                case 1417502193:
                                    var20 ^= -53874524;
                            }
                        } else {
                            var20 &= -442697240;
                            var20 -= 1706611691;
                            var20 ^= 1794069187;
                            var20 ^= -1880816304;
                            int var163 = var20 + 1;
                            int var164 = var20 * var163;
                            int var174 = var20 + 2;
                            int var165 = var164 * var174;
                            var174 = var20 + 3;
                            int var166 = var165 * var174;
                            int var167 = var166 & 7;
                            if (var167 != 0) {
                                break label133;
                            }

                            var148 = "";
                            var20 |= -443132003;
                            var20 -= -1368366209;
                            var20 ^= 1939298768;
                            var20 &= -1482610641;
                            var20 ^= -171851412;
                        }

                        int var168 = var20 + 1;
                        int var169 = var20 * var168;
                        int var170 = var169 & 1;
                        if (var170 != 0) {
                            break label133;
                        }

                        StringBuilder var127 = var126.append(var148);
                        long var149 = var6;
                        long var176 = var149 + 1L;
                        var176 = var149 * var176;
                        long var150 = var176 & 1L;
                        long var193;
                        var6 = (var193 = var150 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                        if (var6 == 0) {
                            var20 *= 412311851;
                            var20 *= -1709280313;
                            var20 ^= -403801275;
                            var6 = var20 + 1;
                            var6 = var20 * var6;
                            var6 &= 1;
                            if (var6 == 0) {
                                StringBuilder var98 = var127.append(var109);
                                return;
                            }
                            break label133;
                        }

                        var20 -= 1531615616;
                        var20 |= 1213434311;
                        var20 -= -2097266526;
                        var20 ^= -729665930;
                        var20 ^= -189678053;
                    } else {
                        var20 *= 1027762481;
                        var20 ^= -2109664520;
                    }
                } else {
                    var20 >>= 15;
                    var20 *= 1544896463;
                    var20 <<= 28;
                    var20 ^= 1714274521;
                    var20 ^= 1061634041;
                }
            }

            var6 = var20 + 1;
            var6 = var20 * var6;
            var7 = var20 + 2;
            var6 *= var7;
            var20 += 3;
            var6 *= var20;
            var20 = var6 & 7;
            if (var20 == 0) {
                RuntimeException var92 = new RuntimeException();
                throw var92;
            }
        }

        IllegalArgumentException var93 = new IllegalArgumentException();
        throw var93;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1512449613;
        int var2 = tR_2.qG;
        int var4 = of_2.xF(var3, var1, var2);
        kS = var4;
        kE_2 var5 = kE_2.uY(0.5F, 0.74F);
        zK = var5;
        kE_2 var6 = kE_2.uY(0.4F, 0.86F);
        A = var6;
        Paint var7 = Paint.solid(-16777216);
        f = var7;
    }
}
