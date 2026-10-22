package mvggs.modules.combat;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.fx.ScreenEffects;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.BooleanSupplier;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public final class deatheffect extends Yn {
    private static final float j = 0.4F;
    private static final long MQ = 8000L;
    private static final DateTimeFormatter l;
    private final r_2 E;
    private final r_2 w;
    private final Uq V;
    private final Uq O;
    private final JL X;
    private final JL Dh;
    private final JL rk;
    private final vS_2[] C;
    private final XK n;
    private vS_2 G;
    private float K;
    private float S;
    private boolean mL;
    private boolean Y;
    private boolean m;
    private boolean vF;
    private boolean vP;
    private Object CY;
    private String J;
    private long qo;
    public static final int Td;

    public deatheffect() {
        super("death_effect", "Death Effect", AJ.COMBAT);
        AJ var1 = AJ.COMBAT;

        d_2 var2 = d_2.WASTED;
        r_2 var3 = new r_2("style", "Style", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.E = var5;
        nl_2 var46 = nl_2.STYLE;
        r_2 var6 = new r_2("sound", "Sound", var46);
        xB var7 = var6.q("The style's own sound, or config/auravisuals/sounds/death.ogg (Custom).");
        r_2 var8 = (r_2)var7;
        xB var9 = this.vn(var8);
        r_2 var10 = (r_2)var9;
        this.w = var10;
        Uq var11 = new Uq("volume", "Volume", 1.0F, 0.0F, 1.0F);
        Uq var12 = var11.W(0.05F);
        BooleanSupplier var47 = () -> {
            int var1x = Td;
            var1x ^= 1975289891;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.w;
            nl_2 var4x = nl_2.OFF;
            boolean var37x = var3x.TJ(var4x);
            Integer var29x = var2x;
            if (var29x == null) {
                long var38x = switch (var1x) {
                    default -> var1x ^ -943496272;
                    case 877620509 -> {
                        var1x -= 421162649;
                        var1x >>>= 31;
                        var1x += 1525259829;
                        var1x &= 1189841820;
                        yield var1x ^ -886591126;
                    }
                    case 1570941272 -> var1x ^ 1920628144;
                };
                long var6x = var38x + 1L;
                var6x = var38x * var6x;
                long var8x = var38x + 2L;
                var6x *= var8x;
                long var39x = var38x + 3L;
                var6x *= var39x;
                long var40x = var6x & 7L;
                long var44x;
                int var30x = (var44x = var40x - 0L) == 0L ? 0 : (var44x < 0L ? -1 : 1);
                if (var30x == 0) {
                    IllegalArgumentException var31x = new IllegalArgumentException();
                    throw var31x;
                }
            } else {
                var1x &= 1902689614;
                var1x ^= -85199417;
                var1x |= 704469522;
                var1x ^= -537535519;
                var29x = var1x;
                label37:
                if (var29x != null) {
                    boolean var36x;
                    if (!var37x) {
                        var1x ^= -1761810945;
                        var1x ^= -983341351;
                        int var33x = var1x + 1;
                        var33x = var1x * var33x;
                        var33x &= 1;
                        if (var33x != 0) {
                            break label37;
                        }

                        var36x = true;
                        var1x -= -1990362560;
                        var1x ^= -1821388190;
                    } else {
                        var1x >>= 9;
                        var1x ^= 473275415;
                        var36x = false;
                        var1x |= 1154526264;
                        var1x ^= 296249473;
                    }

                    Integer var27x = var1x;
                    if (var27x != null) {
                        return var36x;
                    }
                }
            }

            RuntimeException var28x = new RuntimeException();
            throw var28x;
        };
        xB var13 = var12.Pt(var47);
        Uq var14 = (Uq)var13;
        xB var15 = this.vn(var14);
        Uq var16 = (Uq)var15;
        this.V = var16;
        Uq var17 = new Uq("intensity", "Screen Intensity", 1.0F, 0.0F, 1.0F);
        Uq var18 = var17.W(0.05F);
        xB var19 = var18.q("How strongly the world is graded (grey, dark, torn) behind the effect.");
        Uq var20 = (Uq)var19;
        xB var21 = this.vn(var20);
        Uq var22 = (Uq)var21;
        this.O = var22;
        JL var23 = new JL("cinematic", "Cinematic", true);
        xB var24 = var23.q("Keeps the respawn buttons hidden until the effect has played. A click skips it.");
        JL var25 = (JL)var24;
        xB var26 = this.vn(var25);
        JL var27 = (JL)var26;
        this.X = var27;
        JL var28 = new JL("hide_hud", "Hide HUD", true);
        xB var29 = var28.q("Aura's HUD panels step aside while the effect plays.");
        JL var30 = (JL)var29;
        xB var31 = this.vn(var30);
        JL var32 = (JL)var31;
        this.Dh = var32;
        JL var33 = new JL("death_message", "Death Message", true);
        xB var34 = var33.q("Shows the death message (or your killer) under the title.");
        JL var35 = (JL)var34;
        xB var36 = this.vn(var35);
        JL var37 = (JL)var36;
        this.rk = var37;
        vS_2[] var38 = vS_2.xU();
        this.C = var38;
        XK var39 = new XK();
        this.n = var39;
        this.K = -1.0F;
        this.S = -1.0F;
        this.J = "";
        this.dy("A cinematic moment when you die: GTA's wasted, Souls' you died, a flatline or a kill card.");
        this.fJ(true);
        r_2 var40 = this.E;
        Runnable var48 = () -> {
            int var1x = Td;
            var1x ^= 1840413034;
            int var2x = System.identityHashCode(this);
            long var15x = var2x;
            long var4x = var15x + 1L;
            var4x = var15x * var4x;
            long var16x = var4x & 1L;
            long var21x;
            var2x = (var21x = var16x - 0L) == 0L ? 0 : (var21x < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x -= -1637253900;
                var1x &= 1062243591;
                var1x ^= 462525922;
                Integer var18x = var1x;
                if (var18x != null) {
                    UnsupportedOperationException var19x = new UnsupportedOperationException();
                    throw var19x;
                }
            } else {
                var1x += -542825892;
                var1x &= -461404806;
                var1x ^= -2045494320;
                Integer var13x = var1x;
                if (var13x != null) {
                    this.vF = false;
                    return;
                }
            }

            AssertionError var14x = new AssertionError();
            throw var14x;
        };
        var40.k(var48);
        r_2 var41 = this.w;
        Runnable var49 = () -> {
            int var1x = Td;
            var1x ^= -44386604;
            int var2x = System.identityHashCode(this);
            long var39x = var2x;
            long var4x = var39x + 1L;
            var4x = var39x * var4x;
            long var40x = var4x & 1L;
            long var45x;
            var2x = (var45x = var40x - 0L) == 0L ? 0 : (var45x < 0L ? -1 : 1);
            if (var2x == 0) {
                var1x |= -513025916;
                var1x &= 1492113961;
                var1x ^= -1441333050;
                var1x += -1341947387;
                var1x ^= 550594137;
                r_2 var42x = this.w;
                nl_2 var3x = nl_2.CUSTOM;
                boolean var43x = var42x.TJ(var3x);
                if (var43x) {
                    var1x ^= -1549981988;
                    var1x += -1740012763;
                    var1x |= -1605296066;
                    var1x -= 1759233118;
                    var1x ^= -1942942760;
                    bw_2.Q();
                    switch (var1x) {
                        case -1305126696:
                        default:
                            var1x ^= -1348949916;
                            break;
                        case -1010241351:
                            var1x += 1766938079;
                            var1x >>>= 13;
                            var1x |= -665196475;
                            var1x *= 67172525;
                            var1x ^= 1153416767;
                            break;
                        case 1891406513:
                            var1x ^= -1539267493;
                    }
                } else {
                    switch (var1x) {
                        case -2083439958:
                            var1x -= 1624186007;
                            var1x <<= 16;
                            var1x |= -1300171884;
                            var1x ^= -107973259;
                            var1x ^= -1443980907;
                            break;
                        case -634574893:
                            var1x ^= 363540601;
                            break;
                        case 1145637228:
                        default:
                            var1x ^= -821769510;
                    }
                }
            } else {
                var1x -= -435554227;
                var1x ^= -2013220119;
                var1x <<= 20;
                var1x |= -811846593;
                var1x ^= -1211127344;
                Integer var12x = var1x;
                if (var12x == null) {
                    RuntimeException var14x = new RuntimeException();
                    throw var14x;
                } else {
                    UnsupportedOperationException var13x = new UnsupportedOperationException();
                    throw var13x;
                }
            }
        };
        var41.k(var49);
        wD<tc> var42 = (tc var1x) -> {
            int var2x = Td;
            var2x ^= -1315990733;
            int var3x = System.identityHashCode(this);
            String var4x = var1x.message();
            long var5x = var3x;
            long var7x = var5x + 1L;
            var7x = var5x * var7x;
            var5x = var7x & 1L;
            long var25x;
            var3x = (var25x = var5x - 0L) == 0L ? 0 : (var25x < 0L ? -1 : 1);
            if (var3x == 0) {
                var3x = switch (var2x) {
                    case -260278771 -> {
                        var2x += -397525514;
                        var2x |= 663217861;
                        yield var2x ^ 1908410542;
                    }
                    default -> var2x ^ -888106192;
                    case 2080090514 -> var2x ^ 1888483315;
                } & -1518794919;
                var3x &= -94835341;
                var3x += -1300201625;
                var3x ^= 740548682;
                this.DT(var4x, true, var3x);
            } else {
                var2x &= 608966333;
                var2x |= 717041587;
                var2x *= -1215578827;
                var2x ^= -2060140715;
                AssertionError var14x = new AssertionError();
                throw var14x;
            }
        };
        this.iI(tc.class, var42);
        wD<PC> var43 = this::M;
        this.iI(PC.class, var43);
        wD<p_2> var44 = (p_2 var1x) -> {
            int var2x = Td;
            var2x ^= 19232358;
            int var3x = System.identityHashCode(this);
            FrameContext var4x = var1x.frame();
            long var5x = var3x;
            long var7x = var5x + 1L;
            var7x = var5x * var7x;
            long var9x = var5x + 2L;
            var7x *= var9x;
            var5x += 3L;
            var7x *= var5x;
            var5x = var7x & 7L;
            long var45x;
            var3x = (var45x = var5x - 0L) == 0L ? 0 : (var45x < 0L ? -1 : 1);
            if (var3x == 0) {
                var2x |= -1244229979;
                var2x += 1413491875;
                var2x &= -1674142138;
                var2x ^= 560877294;
                var5x = var2x;
                var7x = var5x + 1L;
                var7x = var5x * var7x;
                var9x = var5x + 2L;
                var7x *= var9x;
                var5x += 3L;
                var7x *= var5x;
                var5x = var7x & 7L;
                long var46x;
                var3x = (var46x = var5x - 0L) == 0L ? 0 : (var46x < 0L ? -1 : 1);
                if (var3x == 0) {
                    float var24x = var4x.dt();
                    int var29x = var2x + -1541138829;
                    int var30x = var29x ^ -2003015183;
                    this.dA(var24x, var30x);
                    return;
                }
            } else {
                var2x += 1431063276;
                var2x ^= -650427236;
                var3x = var2x + 1;
                var3x = var2x * var3x;
                int var31x = var2x + 2;
                var3x *= var31x;
                var2x += 3;
                var3x *= var2x;
                var2x = var3x & 7;
                if (var2x == 0) {
                    IllegalStateException var21x = new IllegalStateException();
                    throw var21x;
                }
            }

            UnsupportedOperationException var20x = new UnsupportedOperationException();
            throw var20x;
        };
        this.iI(p_2.class, var44);
        wD<T> var45 = this::e;
        this.vw(T.class, -100, var45);
    }

    public d_2 O() {
        int var1 = Td;
        var1 ^= -391023441;
        int var2 = System.identityHashCode(this);
        r_2 var3 = this.E;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var39;
        var2 = (var39 = var4 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= -1581118787;
            var1 |= 1844279193;
            var1 |= 646062268;
            var1 ^= 1393812662;
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var40;
            var2 = (var40 = var4 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            }
        } else {
            var1 ^= -848598213;
            var1 -= 664165305;
            var1 ^= -1642362213;
            var1 ^= 607867959;
            var1 ^= -1861575607;
            Integer var20 = var1;
            if (var20 != null) {
                Enum var22 = var3.A();
                return (d_2)var22;
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    public void PA(d_2 var1) {
        int var2 = Td;
        var2 ^= 1844523565;
        int var3 = System.identityHashCode(this);
        Integer var20 = var3;
        if (var20 == null) {
            var2 *= 1891282227;
            var2 -= -398666914;
            var2 <<= 6;
            var2 ^= 1392337533;
            RuntimeException var21 = new RuntimeException();
            throw var21;
        } else {
            var2 -= 1593732916;
            var2 ^= 1007083203;
            var2 &= 1102584250;
            var2 ^= -1196875068;
            long var11 = var2;
            long var4 = var11 + 1L;
            var4 = var11 * var4;
            long var12 = var4 & 1L;
            long var23;
            var2 = (var23 = var12 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var2 == 0) {
                r_2 var15 = this.E;
                var15.UY(var1);
            } else {
                IllegalArgumentException var14 = new IllegalArgumentException();
                throw var14;
            }
        }
    }

    public void gO() {
        int var1 = Td;
        var1 ^= -1514093067;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 == null) {
            var1 += -848906385;
            var1 += 170199114;
            var1 &= 1952311656;
            var1 ^= 83922588;
            long var18 = var1;
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var24;
            int var20 = (var24 = var19 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var20 == 0) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            } else {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            var1 += 169017693;
            var1 ^= -1032148876;
            var1 ^= 742109673;
            var1 *= -194351047;
            var1 |= 1754436352;
            var1 ^= 1981061295;
            this.DT("", false, var1);
        }
    }

    @Override
    protected void J() {
        int var1 = Td;
        var1 ^= -2057334137;
        int var2 = System.identityHashCode(this);
        Integer var22 = var2;
        if (var22 != null) {
            var1 -= -722584059;
            var1 *= 448856915;
            var1 ^= 634876704;
            var1 *= -596513477;
            var1 ^= -1788448635;
            long var23 = var1;
            long var4 = var23 + 1L;
            var4 = var23 * var4;
            long var6 = var23 + 2L;
            var4 *= var6;
            long var24 = var23 + 3L;
            var4 *= var24;
            long var25 = var4 & 7L;
            long var34;
            int var26 = (var34 = var25 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var26 == 0) {
                var26 = var1 ^ -584885010;
                var26 &= 708987958;
                var26 ^= -692400943;
                this.f(var26);
                return;
            }
        } else {
            var1 += -1813266920;
            var1 ^= -1918253071;
            var1 ^= -366907969;
            long var17 = var1;
            long var3 = var17 + 1L;
            var3 = var17 * var3;
            long var18 = var3 & 1L;
            long var35;
            var1 = (var35 = var18 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    public static boolean BU() {
        boolean var43 = false;
        int var0 = Td;
        var0 ^= 2033128831;
        int var1 = var0 ^ -1173702655;
        var1 &= 1480736413;
        var1 ^= -498244946;
        deatheffect var37 = ST(var1);
        var0 += 1463841027;
        var0 ^= 1862112823;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        var2 &= 1;
        label53:
        if (var2 == 0) {
            label51: {
                if (var37 != null) {
                    var0 = switch (var0) {
                        default -> var0 ^ 1763937387;
                        case -650289898 -> var0 ^ 1764288683;
                        case -18811021 -> {
                            var0 &= 1654894692;
                            var0 += 234047849;
                            var0 >>>= 29;
                            var0 *= -1206595995;
                            yield var0 ^ 1433599835;
                        }
                    };
                    XK var38 = var37.n;
                    var0 *= 1162343009;
                    var0 ^= 1600470437;
                      int var39 = var38.a ? 1 : 0;
                    if (var39 == 0) {
                        var0 |= -1507240077;
                        var0 &= -801394870;
                        var0 ^= 1365305522;
                        long var40 = var0;
                        long var3 = var40 + 1L;
                        var3 = var40 * var3;
                        long var41 = var3 & 1L;
                        long var53;
                        var39 = (var53 = var41 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                        if (var39 != 0) {
                            break label53;
                        }

                        var43 = true;
                        switch (var0) {
                            case -1052153872:
                                var0 ^= -28258210;
                                var0 += 1440725198;
                                var0 -= 839080218;
                                var0 ^= -244991560;
                                break label51;
                            case -516670484:
                            default:
                                var0 ^= 1968811975;
                                break label51;
                            case 414808480:
                                var0 ^= -1548270592;
                                break label51;
                        }
                    }

                    var0 &= 1835845021;
                    var0 *= 506572765;
                    var0 &= 1987870178;
                    var0 |= 2146330795;
                    var0 ^= 1297723233;
                } else {
                    switch (var0) {
                        case -18811021:
                            var0 ^= -1178622041;
                            var0 &= 1853390475;
                            var0 ^= 1962906186;
                            break;
                        case 254665763:
                            var0 ^= 2084556009;
                            break;
                        case 317110217:
                        default:
                            var0 ^= 1380347092;
                    }
                }

                var43 = false;
                switch (var0) {
                    case -289154735:
                    default:
                        var0 ^= -1459587636;
                        break;
                    case 793206656:
                        var0 ^= -333109156;
                        break;
                    case 849855178:
                        var0 *= 156678977;
                        var0 ^= 1647160720;
                }
            }

            long var46 = var0;
            long var4 = var46 + 1L;
            var4 = var46 * var4;
            long var6 = var46 + 2L;
            var4 *= var6;
            long var47 = var46 + 3L;
            var4 *= var47;
            long var48 = var4 & 7L;
            long var54;
            var0 = (var54 = var48 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
            if (var0 == 0) {
                return var43;
            }
        }

        RuntimeException var34 = new RuntimeException();
        throw var34;
    }

    public static boolean c() {
        int var0 = Td;
        var0 ^= -432379508;
        int var1 = var0 + -162279588;
        var1 += 109170970;
        var1 ^= 1183860614;
        deatheffect var20 = ST(var1);
        var0 |= -2001329925;
        var0 ^= 1171470725;
        boolean var21;
        if (var20 != null) {
            var0 |= 726343313;
            var0 ^= -449976456;
            var21 = true;
            var0 *= -2003979311;
            var0 += 1731984322;
            var0 |= -403891787;
            var0 ^= 485383841;
        } else {
            var0 ^= -1886076951;
            var0 |= 462245784;
            var0 *= 1269277651;
            var0 ^= 472700879;
            var21 = false;
            var0 <<= 30;
            var0 ^= 2063827292;
        }

        Integer var16 = var0;
        if (var16 == null) {
            UnsupportedOperationException var17 = new UnsupportedOperationException();
            throw var17;
        } else {
            return var21;
        }
    }

    public static boolean xD() {
        label50: {
            int var0 = Td;
            var0 ^= 736662163;
            int var1 = var0 >> 10;
            var1 >>>= 8;
            var1 ^= -502304728;
            deatheffect var36 = ST(var1);
            var0 *= 1784243219;
            var0 &= -651637852;
            var0 ^= -1761247074;
            if (var36 != null) {
                var0 &= -961074895;
                var0 &= -1287735415;
                var0 |= -166695245;
                var0 ^= 230393548;
                long var2 = var0;
                long var4 = var2 + 1L;
                var4 = var2 * var4;
                var2 = var4 & 1L;
                long var49;
                int var39 = (var49 = var2 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
                if (var39 != 0) {
                    break label50;
                }

                XK var40 = var36.n;
                boolean var41 = var40.a;
                var0 |= -1163995884;
                var0 >>= 26;
                var0 &= 1848725191;
                var0 ^= -1285164398;
                long var3 = var0;
                long var5 = var3 + 1L;
                var5 = var3 * var5;
                var3 = var5 & 1L;
                long var50;
                int var46 = (var50 = var3 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
                if (var46 != 0) {
                    break label50;
                }

                if (!var41) {
                    var0 >>>= 10;
                    var0 &= 1687008377;
                    var0 ^= 58404140;
                    int var42 = var0 + 1;
                    int var43 = var0 * var42;
                    int var44 = var43 & 1;
                    if (var44 == 0) {
                        var36.mL = true;
                        XK var37 = var36.n;
                        switch (var0) {
                            case -1753662649:
                            default:
                                var0 ^= -1595780338;
                                break;
                            case -1555358538:
                                var0 ^= -286334610;
                                break;
                            case 58603781:
                                var0 *= 826424949;
                                var0 &= 1136027442;
                                var0 ^= 267778567;
                        }

                        var37.a = true;
                        return true;
                    }
                    break label50;
                }

                switch (var0) {
                    case -2085533272:
                        var0 ^= -59533514;
                        break;
                    case -1778719697:
                    default:
                        var0 ^= 92025890;
                        break;
                    case -581649324:
                        var0 &= 605066862;
                        var0 -= -432608529;
                        var0 &= 1506559826;
                        var0 ^= 306288619;
                }
            } else {
                switch (var0) {
                    case -467734522:
                        var0 ^= -1851765792;
                        break;
                    case -28297693:
                    default:
                        var0 ^= -1495912752;
                        break;
                    case 1177403674:
                        var0 -= -5215886;
                        var0 ^= 1307885843;
                }
            }

            Integer var32 = var0;
            if (var32 != null) {
                return false;
            }
        }

        AssertionError var33 = new AssertionError();
        throw var33;
    }

    public static boolean VC() {
        int var0 = Td;
        var0 ^= 1020526100;
        int var1 = var0 >> 31;
        var1 += -1130865233;
        var1 >>= 23;
        var1 -= -1865317908;
        var1 ^= -1927211229;
        deatheffect var24 = ST(var1);
        var0 += 848121228;
        var0 -= -87659853;
        var0 ^= -901256819;
        var0 >>>= 13;
        var0 ^= -196502710;
        boolean var25;
        if (var24 != null) {
            var0 = switch (var0) {
                default -> var0 ^ -1097776535;
                case -196448702 -> {
                    var0 >>>= 19;
                    yield var0 ^ 1731502221;
                }
                case 468600182 -> var0 ^ 1875470939;
            };
            var25 = true;
            switch (var0) {
                case 549696043:
                default:
                    var0 ^= 1186079247;
                    break;
                case 1382435167:
                    var0 ^= 314171060;
                    break;
                case 1731509764:
                    var0 <<= 13;
                    var0 ^= 97520583;
            }
        } else {
            var0 += 1155610601;
            var0 &= 651583793;
            var0 ^= 488674607;
            var25 = false;
            var0 -= -604735577;
            var0 &= -1222458098;
            var0 ^= -1288532287;
        }

        return var25;
    }

    public static boolean b() {
        int var0 = Td;
        var0 ^= -704725225;
        int var1 = var0 | 1918373021;
        var1 *= 905078059;
        var1 -= 1986034740;
        var1 += 1945769932;
        var1 ^= 123501817;
        deatheffect var29 = ST(var1);
        var0 *= -1447172337;
        var0 += 854850259;
        var0 ^= -112587998;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label29:
        if (var2 == 0) {
            int var34;
            if (var29 != null) {
                var0 ^= -892907604;
                var0 ^= -724517492;
                long var30 = var0;
                long var43 = var30 + 1L;
                long var44 = var30 * var43;
                long var5 = var30 + 2L;
                long var45 = var44 * var5;
                long var31 = var30 + 3L;
                long var46 = var45 * var31;
                long var32 = var46 & 7L;
                long var48;
                var34 = (var48 = var32 - 0L) == 0L ? 0 : (var48 < 0L ? -1 : 1);
                if (var34 != 0) {
                    break label29;
                }

                var34 = 1;
                var0 -= 2093608258;
                var0 ^= 1609803416;
            } else {
                var0 <<= 21;
                var0 += 114061132;
                var0 &= -2067110780;
                var0 ^= -1426583154;
                long var39 = var0;
                long var4 = var39 + 1L;
                var4 = var39 * var4;
                long var40 = var4 & 1L;
                long var49;
                var2 = (var49 = var40 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
                if (var2 != 0) {
                    break label29;
                }

                var34 = 0;
                var0 += -1344954595;
                var0 >>= 14;
                var0 >>>= 11;
                var0 ^= -1300095233;
                var0 ^= 4617660;
            }

            Integer var23 = var0;
            if (var23 != null) {
                return (var34 != 0);
            }
        }

        AssertionError var24 = new AssertionError();
        throw var24;
    }

    private static deatheffect ST(int var0) {
        int var2 = (Ud.y()) ? 1 : 0;
        int var1 = var0 - -1413186591;
        var1 |= -2019204158;
        var1 ^= 1350563713;
        int var3 = var1 + 1;
        var3 = var1 * var3;
        int var4 = var1 + 2;
        var3 *= var4;
        var4 = var1 + 3;
        var3 *= var4;
        var3 &= 7;
        if (var3 == 0) {
            if (var2 == 0) {
                var1 ^= 1008416890;
                var1 -= -1261382112;
                var1 |= 535962222;
                var1 ^= -86120706;
                var2 = var1 + 1;
                var2 = var1 * var2;
                var2 &= 1;
                if (var2 == 0) {
                    return null;
                }
            } else {
                var1 &= 966821731;
                var1 ^= -1705612144;
                var2 = var1 + 1;
                var2 = var1 * var2;
                var3 = var1 + 2;
                var2 *= var3;
                var3 = var1 + 3;
                var2 *= var3;
                var2 &= 7;
                label57:
                if (var2 == 0) {
                    Ud var58 = Ud.Z();
                    var1 -= -726986366;
                    var1 |= -2038054592;
                    var1 ^= 1186937149;
                    NW var59 = var58.sP();
                    Yn var60 = var59.tG(deatheffect.class);
                    deatheffect var61 = (deatheffect)var60;
                    int var72 = (var61.IU()) ? 1 : 0;
                    if (var72 != 0) {
                        var1 = switch (var1) {
                            case -1592728979 -> {
                                var1 >>>= 8;
                                var1 |= 733505954;
                                yield var1 ^ -568216317;
                            }
                            default -> var1 ^ 729413181;
                            case -889150136 -> var1 ^ -1168168184;
                        };
                        long var73 = var1;
                        long var5 = var73 + 1L;
                        var5 = var73 * var5;
                        long var74 = var5 & 1L;
                        long var84;
                        var72 = (var84 = var74 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                        if (var72 != 0) {
                            break label57;
                        }

                        float var76 = var61.K;
                        float var85;
                        var72 = (var85 = var76 - 0.0F) == 0.0F ? 0 : (var85 < 0.0F ? -1 : 1);
                        var1 |= 1076994732;
                        var1 -= 61244480;
                        var1 >>>= 25;
                        var1 &= -1697792410;
                        var1 ^= 2127720977;
                        if (var72 >= 0) {
                            var1 &= -982634018;
                            var1 ^= -594733646;
                            float var78 = var61.S;
                            float var86;
                            var72 = (var86 = var78 - 0.0F) == 0.0F ? 0 : (var86 < 0.0F ? -1 : 1);
                            var1 <<= 28;
                            var1 &= -1047235105;
                            var1 |= 1579200173;
                            var1 &= 319155957;
                            var1 ^= -1263907626;
                            if (var72 < 0) {
                                var1 *= -810017315;
                                var1 ^= 1377204722;
                                Integer var80 = var1;
                                if (var80 == null) {
                                    break label57;
                                }

                                var1 += 920593880;
                                var1 |= -650838115;
                                var1 ^= 1379880791;
                                return var61;
                            }

                            var1 -= -125674508;
                            var1 *= -691111375;
                            var1 -= 944365419;
                            var1 <<= 8;
                            var1 ^= -2119370105;
                        } else {
                            switch (var1) {
                                case 871001867:
                                default:
                                    var1 ^= -765931786;
                                    break;
                                case 2003699128:
                                    var1 ^= -1204621462;
                                    break;
                                case 2127721073:
                                    var1 ^= 1262161542;
                                    var1 ^= 253403143;
                                    var1 &= -1719052384;
                                    var1 ^= 1531529767;
                            }
                        }
                    } else {
                        var1 >>= 19;
                        var1 ^= 856232304;
                        var1 ^= -1891697707;
                    }

                    Integer var81 = var1;
                    if (var81 != null) {
                        Object var62 = null;
                        var1 |= 1653867485;
                        var1 += -632444242;
                        var1 >>>= 2;
                        var1 ^= -1610366359;
                        return (deatheffect)var62;
                    }
                }
            }
        }

        IllegalArgumentException var52 = new IllegalArgumentException();
        throw var52;
    }

    private void M(PC var1) {
        int var2 = Td;
        var2 ^= -1900400407;
        int var3 = System.identityHashCode(this);
        Entity var4 = i_2.QI();
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var6 = var3 + 3;
        var5 *= var6;
        var5 &= 7;
        if (var5 != 0) {
            switch (var2) {
                case -1927303017:
                default:
                    var2 ^= -317310981;
                    break;
                case -1793594972:
                    var2 ^= 1809731468;
                    break;
                case -817244713:
                    var2 >>= 23;
                    var2 &= 206159841;
                    var2 ^= -1243890069;
                    var2 ^= -1438161410;
                    var2 ^= 930174095;
            }
        } else {
            var2 *= 1724663943;
            var2 &= -285271401;
            var2 *= -1221317591;
            var2 ^= -1356693634;
            label94:
            if (var4 != null) {
                var2 -= -1599688167;
                var2 |= -713300658;
                var2 |= 1053288545;
                var2 ^= 6800524;
                Integer var103 = var2;
                if (var103 != null) {
                    Entity var104 = var1.victim();
                    var6 = var3 + 1;
                    var6 = var3 * var6;
                    int var7 = var3 + 2;
                    var6 *= var7;
                    var7 = var3 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        var2 -= -1282629285;
                        var2 >>= 7;
                        var2 *= -995325739;
                        var2 &= -1247736179;
                        var2 ^= -1601947489;
                        break label94;
                    }
                    var2 = switch (var2) {
                        case -1953833011 -> var2 ^ -910108063;
                        case -6805005 -> {
                            var2 *= -806962673;
                            var2 ^= -1906725582;
                            var2 ^= 467470959;
                            yield var2 ^ -1091843913;
                        }
                        default -> var2 ^ -1757489408;
                    };
                    long var119 = var2;
                    long var8 = var119 + 1L;
                    var8 = var119 * var8;
                    long var10 = var119 + 2L;
                    var8 *= var10;
                    long var120 = var119 + 3L;
                    var8 *= var120;
                    long var121 = var8 & 7L;
                    long var134;
                    var6 = (var134 = var121 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        if (var104 != var4) {
                            var2 &= 1442179395;
                            var2 >>>= 17;
                            var2 -= 1154707625;
                            var2 ^= -2053617098;
                            return;
                        }

                        var2 += 297158665;
                        var2 &= -41788749;
                        var2 &= 1813224804;
                        var2 ^= 738409116;
                        Entity var105 = var1.cause();
                        Integer var123 = var3;
                        if (var123 == null) {
                            var2 ^= 96810946;
                            var2 &= -598523454;
                            var2 ^= 753152472;
                            break label94;
                        }

                        var2 &= 771301980;
                        var2 ^= 402830656;
                        if (var105 == null) {
                            var2 >>= 28;
                            var2 |= 563120462;
                            var2 ^= 522476230;
                            return;
                        }

                        var2 -= -2068128407;
                        var2 ^= -1911831477;
                        long var106 = var2;
                        long var127 = var106 + 1L;
                        long var128 = var106 * var127;
                        long var9 = var106 + 2L;
                        long var129 = var128 * var9;
                        long var107 = var106 + 3L;
                        long var130 = var129 * var107;
                        long var108 = var130 & 7L;
                        long var135;
                        int var109 = (var135 = var108 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                        if (var109 == 0) {
                            Entity var110 = var1.cause();
                            var123 = var3;
                            if (var123 == null) {
                                switch (var2) {
                                    case 21200312:
                                        var2 ^= -1688549427;
                                        var2 |= 2030990381;
                                        var2 &= 1271238246;
                                        var2 += 2042226452;
                                        var2 ^= -535083550;
                                        break label94;
                                    case 560354947:
                                    default:
                                        var2 ^= 1549624267;
                                        break label94;
                                    case 1974911544:
                                        var2 ^= -1633216229;
                                        break label94;
                                }
                            }

                            var2 ^= 874317396;
                            var2 &= 1038054387;
                            var2 |= -771043122;
                            var2 -= -433550586;
                            var2 ^= -641255644;
                            var123 = var2;
                            if (var123 != null) {
                                if (var110 == var4) {
                                    var2 ^= -1771865943;
                                    var2 ^= 1613165804;
                                    return;
                                }

                                var2 += 2138283224;
                                var2 -= -2100106321;
                                var2 += -1682588604;
                                var2 ^= -1193854646;
                                int var95 = var2 + 1;
                                int var96 = var2 * var95;
                                int var97 = var96 & 1;
                                if (var97 == 0) {
                                    var4 = var1.cause();
                                    var109 = var3 + 1;
                                    var109 = var3 * var109;
                                    var3 = var109 & 1;
                                    if (var3 != 0) {
                                        var2 ^= 322433906;
                                        var2 += 1639969437;
                                        var2 &= 1375270884;
                                        var2 ^= 616874270;
                                        break label94;
                                    }

                                    var2 |= -1208540620;
                                    var2 += 205731218;
                                    var2 -= -1921134746;
                                    var2 ^= 680919316;
                                    var3 = var2 + 1;
                                    var3 = var2 * var3;
                                    var3 &= 1;
                                    if (var3 == 0) {
                                        Text var92 = var4.getName();
                                        String var93 = var92.getString();
                                        this.J = var93;
                                        long var94 = System.currentTimeMillis();
                                        this.qo = var94;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }

                IllegalStateException var91 = new IllegalStateException();
                throw var91;
            } else {
                var2 ^= -1759623563;
                var2 *= 692161163;
                var2 -= -1735882139;
                var2 *= 1871936183;
                var2 ^= 780026030;
                return;
            }
        }

        RuntimeException var86 = new RuntimeException();
        throw var86;
    }

    private void DT(String var1, boolean var2, int var3) {
        boolean var188 = false;
        boolean var200 = false;
Object var203 = null;
        label320: {
            int var5 = System.identityHashCode(this);
            Entity var6 = i_2.QI();
            int var7 = var5 + 1;
            var7 = var5 * var7;
            var7 &= 1;
            int var15;
            if (var7 != 0) {
                var15 = var3 | -1220815914;
                var15 ^= -199856621;
            } else {
                var15 = switch (var3) {
                    default -> var3 ^ -1835796008;
                    case 514548706 -> {
                        var15 = var3 ^ -267446069;
                        var15 >>>= 18;
                        yield var15 ^ -996650053;
                    }
                    case 2040172095 -> var3 ^ -643249249;
                };
                long var215 = var15;
                long var9 = var215 + 1L;
                var9 = var215 * var9;
                long var11 = var215 + 2L;
                var9 *= var11;
                long var216 = var215 + 3L;
                var9 *= var216;
                long var217 = var9 & 7L;
                long var384;
                var7 = (var384 = var217 - 0L) == 0L ? 0 : (var384 < 0L ? -1 : 1);
                if (var7 != 0) {
                    break label320;
                }

                if (var6 == null) {
                    var15 *= -696014761;
                    var15 ^= 845811783;
                    var15 ^= 1896977523;
                    return;
                }
                var15 = switch (var15) {
                    default -> var15 ^ -12989221;
                    case -996644846 -> {
                        var15 |= 1626058125;
                        var15 >>= 4;
                        var15 *= 1957878959;
                        yield var15 ^ 1057170803;
                    }
                    case 1001027458 -> var15 ^ 604248750;
                };
                vS_2[] var219 = this.C;
                r_2 var8 = this.E;
                int var265 = var8.Bz();
                vS_2 var220 = var219[var265];
                this.G = var220;
                vS_2 var221 = this.G;
                var221.Az();
                var7 = var5 + 1;
                var7 = var5 * var7;
                int var266 = var5 + 2;
                var7 *= var266;
                int var267 = var5 + 3;
                var7 *= var267;
                var7 &= 7;
                if (var7 != 0) {
                    var15 *= 1849230123;
                    var15 |= -709091673;
                    var15 ^= -1135607222;
                } else {
                    label373: {
                        var15 = switch (var15) {
                            case -1596931858 -> var15 ^ 1083738872;
                            default -> var15 ^ 213364565;
                            case 1483003684 -> {
                                var15 += -157508712;
                                var15 += 1029492048;
                                var15 >>>= 13;
                                var15 *= -1838129053;
                                yield var15 ^ -1438651917;
                            }
                        };
                        long var227 = var15;
                        var9 = var227 + 1L;
                        var9 = var227 * var9;
                        var11 = var227 + 2L;
                        var9 *= var11;
                        long var228 = var227 + 3L;
                        var9 *= var228;
                        long var229 = var9 & 7L;
                        long var385;
                        var7 = (var385 = var229 - 0L) == 0L ? 0 : (var385 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label320;
                        }

                        label326: {
                            World var231 = var6.getEntityWorld();
                            this.CY = var231;
                            this.K = 0.0F;
                            this.S = -1.0F;
                            this.Y = false;
                            this.mL = false;
                            if (var2) {
                                var15 *= 1951187819;
                                var15 += -803558479;
                                var15 &= 551825873;
                                var15 ^= -2120945528;
                                int var232 = (var6 instanceof ClientPlayerEntity) ? 1 : 0;
                                int var268 = var5 + 1;
                                int var269 = var5 * var268;
                                int var322 = var5 + 2;
                                int var270 = var269 * var322;
                                int var323 = var5 + 3;
                                int var271 = var270 * var323;
                                int var272 = var271 & 7;
                                if (var272 != 0) {
                                    var15 += -875910932;
                                    var15 &= 3453498;
                                    var15 ^= 1270422997;
                                    break label373;
                                }

                                var15 *= 774997875;
                                var15 *= 1382400593;
                                var15 &= 2012559912;
                                var15 >>= 17;
                                var15 ^= 178257668;
                                Integer var273 = var15;
                                if (var273 == null) {
                                    break label320;
                                }

                                if (var232 != 0) {
                                    var15 -= -1835344879;
                                    var15 -= -1855635388;
                                    var15 |= -2069373488;
                                    var15 ^= 1637738707;
                                    ClientPlayerEntity var186 = (ClientPlayerEntity)var6;
                                    boolean var187 = var186.showsDeathScreen();
                                    long var233 = var5;
                                    var9 = var233 + 1L;
                                    var9 = var233 * var9;
                                    var11 = var233 + 2L;
                                    var9 *= var11;
                                    long var234 = var233 + 3L;
                                    var9 *= var234;
                                    long var235 = var9 & 7L;
                                    long var386;
                                    var232 = (var386 = var235 - 0L) == 0L ? 0 : (var386 < 0L ? -1 : 1);
                                    if (var232 != 0) {
                                        var15 += 1672685095;
                                        var15 &= -67664751;
                                        var15 ^= -1585931804;
                                        break label373;
                                    }
                                    var15 = switch (var15) {
                                        case -2027800796 -> {
                                            var15 *= 1881768203;
                                            yield var15 ^ 794020454;
                                        }
                                        default -> var15 ^ -2039161855;
                                        case -187477127 -> var15 ^ 1787018351;
                                    };
                                    long var237 = var15;
                                    var9 = var237 + 1L;
                                    var9 = var237 * var9;
                                    var11 = var237 + 2L;
                                    var9 *= var11;
                                    long var238 = var237 + 3L;
                                    var9 *= var238;
                                    long var239 = var9 & 7L;
                                    long var387;
                                    var232 = (var387 = var239 - 0L) == 0L ? 0 : (var387 < 0L ? -1 : 1);
                                    if (var232 != 0) {
                                        break label320;
                                    }

                                    if (var187) {
                                        var15 ^= 89418446;
                                        var15 &= -680205967;
                                        var15 -= 2021419086;
                                        var15 ^= 67968488;
                                        var188 = true;
                                        var15 |= 173364830;
                                        var15 ^= -98915734;
                                        break label326;
                                    }

                                    var15 += -960309472;
                                    var15 *= -729983849;
                                    var15 -= 1755140005;
                                    var15 -= 1567542494;
                                    var15 ^= -166751209;
                                } else {
                                    switch (var15) {
                                        case 178249340:
                                            var15 |= 2092792338;
                                            var15 >>= 16;
                                            var15 ^= 1629813707;
                                            break;
                                        case 265217218:
                                            var15 ^= 2053702883;
                                            break;
                                        case 1604279917:
                                        default:
                                            var15 ^= 473567885;
                                    }
                                }
                            } else {
                                switch (var15) {
                                    case -693918914:
                                        var15 ^= 1737481077;
                                        break;
                                    case 1371409073:
                                    default:
                                        var15 ^= -865797573;
                                        break;
                                    case 1586686565:
                                        var15 >>= 25;
                                        var15 ^= 1629783387;
                                }
                            }

                            long var241 = var15;
                            var9 = var241 + 1L;
                            var9 = var241 * var9;
                            var11 = var241 + 2L;
                            var9 *= var11;
                            long var242 = var241 + 3L;
                            var9 *= var242;
                            long var243 = var9 & 7L;
                            long var388;
                            var7 = (var388 = var243 - 0L) == 0L ? 0 : (var388 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                break label320;
                            }

                            var188 = false;
                            var15 += 806899925;
                            var15 |= -1983841476;
                            var15 *= -1480302651;
                            var15 <<= 4;
                            var15 ^= 1744484100;
                        }

                        var7 = var15 + 1;
                        var7 = var15 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label320;
                        }

                        this.m = var188;
                        Integer var189 = var5;
                        if (var189 == null) {
                            var15 += 548891650;
                            var15 += -871311098;
                            var15 *= 451673127;
                            var15 -= 867983121;
                            var15 ^= -1142154794;
                        } else {
                            label374: {
                                var15 >>= 8;
                                var15 += -1196747094;
                                var15 += -573635606;
                                var15 ^= -1257168165;
                                long var190 = var15;
                                long var274 = var190 + 1L;
                                long var275 = var190 * var274;
                                long var10 = var190 + 2L;
                                long var276 = var275 * var10;
                                long var191 = var190 + 3L;
                                long var277 = var276 * var191;
                                long var192 = var277 & 7L;
                                long var389;
                                int var193 = (var389 = var192 - 0L) == 0L ? 0 : (var389 < 0L ? -1 : 1);
                                if (var193 != 0) {
                                    break label320;
                                }

                                label330: {
                                    if (var2) {
                                        var15 <<= 15;
                                        var15 += -2031848581;
                                        var15 ^= -2021610973;
                                        long var194 = System.currentTimeMillis();
                                        long var278 = this.qo;
                                        long var195 = var194 - var278;
                                        int var279 = var5 + 1;
                                        int var280 = var5 * var279;
                                        int var281 = var280 & 1;
                                        if (var281 != 0) {
                                            var15 += 1353952668;
                                            var15 <<= 19;
                                            var15 -= 179423638;
                                            var15 |= -2028923948;
                                            var15 ^= -464344549;
                                            break label374;
                                        }
                                        var15 = switch (var15) {
                                            case -1996868303 -> var15 ^ -240786152;
                                            case 50157912 -> {
                                                var15 &= -1714481469;
                                                yield var15 ^ -2122401847;
                                            }
                                            default -> var15 ^ 86466034;
                                        };
                                        long var390;
                                        int var196 = (var390 = var195 - 8000L) == 0L ? 0 : (var390 < 0L ? -1 : 1);
                                        if (var196 < 0) {
                                            var15 = switch (var15) {
                                                case -2118932599 -> {
                                                    var15 *= -740889953;
                                                    var15 += 1450651516;
                                                    yield var15 ^ 1880142471;
                                                }
                                                case -1301000186 -> var15 ^ 1643314785;
                                                default -> var15 ^ 417032023;
                                            };
                                            int var197 = var15 + 1;
                                            int var198 = var15 * var197;
                                            int var199 = var198 & 1;
                                            if (var199 != 0) {
                                                break label320;
                                            }

                                            var200 = true;
                                            var15 |= -1145744389;
                                            var15 ^= -894906513;
                                            break label330;
                                        }

                                        switch (var15) {
                                            case -2118932599:
                                                var15 |= -1138062870;
                                                var15 += -1627550138;
                                                var15 &= -1481342362;
                                                var15 ^= -1571282763;
                                                break;
                                            case -1107399872:
                                            default:
                                                var15 ^= 191178626;
                                                break;
                                            case 1237425618:
                                                var15 ^= -779069733;
                                        }
                                    } else {
                                        switch (var15) {
                                            case -80975890:
                                            default:
                                                var15 ^= 581086798;
                                                break;
                                            case 595590451:
                                                var15 += -537929639;
                                                var15 |= 1131719509;
                                                var15 >>>= 31;
                                                var15 ^= -1494736235;
                                                break;
                                            case 1613974468:
                                                var15 ^= -1141762352;
                                        }
                                    }

                                    long var248 = var15;
                                    var9 = var248 + 1L;
                                    var9 = var248 * var9;
                                    long var249 = var9 & 1L;
                                    long var391;
                                    var7 = (var391 = var249 - 0L) == 0L ? 0 : (var391 < 0L ? -1 : 1);
                                    if (var7 != 0) {
                                        break label320;
                                    }

                                    var200 = false;
                                    var15 *= -211442835;
                                    var15 >>>= 4;
                                    var15 += 2010484288;
                                    var15 >>= 4;
                                    var15 ^= -915216916;
                                }

                                XK var251 = this.n;
                                JL var282 = this.rk;
                                int var338 = var5 + 1;
                                int var339 = var5 * var338;
                                int var340 = var339 & 1;
                                if (var340 != 0) {
                                    var15 ^= -1402388152;
                                    var15 ^= -690371523;
                                } else {
                                    var15 = switch (var15) {
                                        default -> var15 ^ -997612008;
                                        case 823990416 -> {
                                            var15 <<= 29;
                                            var15 <<= 14;
                                            var15 -= -1528904891;
                                            yield var15 ^ 2095921212;
                                        }
                                        case 1463757136 -> var15 ^ -356885477;
                                    };
                                    Integer var341 = var15;
                                    if (var341 == null) {
                                        break label320;
                                    }

                                    boolean var283 = var282.vb();
                                    String var285;
                                    if (var283) {
                                        var15 *= 484706543;
                                        var15 ^= 1644078233;
                                        Integer var284 = var15;
                                        if (var284 == null) {
                                            break label320;
                                        }

                                        var285 = var1;
                                        switch (var15) {
                                            case 841406096:
                                                var15 &= 2141827645;
                                                var15 -= 1330566412;
                                                var15 ^= 494570436;
                                                var15 |= -1251123758;
                                                var15 ^= 78256844;
                                                break;
                                            case 1203031818:
                                            default:
                                                var15 ^= 1714488512;
                                                break;
                                            case 1776569532:
                                                var15 ^= 1691552919;
                                        }
                                    } else {
                                        var15 = switch (var15) {
                                            default -> var15 ^ -1173113650;
                                            case 4185313 -> var15 ^ -1540743797;
                                            case 667681927 -> {
                                                var15 >>= 13;
                                                yield var15 ^ -876030771;
                                            }
                                        };
                                        var285 = "";
                                        var15 &= 1061059913;
                                        var15 &= -176606768;
                                        var15 ^= -95599330;
                                    }

                                    int var342 = var15 + 1;
                                    int var343 = var15 * var342;
                                    int var363 = var15 + 2;
                                    int var344 = var343 * var363;
                                    int var364 = var15 + 3;
                                    int var345 = var344 * var364;
                                    int var346 = var345 & 7;
                                    if (var346 != 0) {
                                        break label320;
                                    }

                                    var251.MZ = var285;
                                    XK var252 = this.n;
                                    JL var286 = this.rk;
                                    boolean var287 = var286.vb();
                                    var9 = var5;
                                    var11 = var9 + 1L;
                                    var11 = var9 * var11;
                                    long var13 = var9 + 2L;
                                    var11 *= var13;
                                    var9 += 3L;
                                    var11 *= var9;
                                    var9 = var11 & 7L;
                                    long var392;
                                    int var350 = (var392 = var9 - 0L) == 0L ? 0 : (var392 < 0L ? -1 : 1);
                                    if (var350 != 0) {
                                        var15 += -743608719;
                                        var15 ^= -1394534843;
                                        var15 >>>= 27;
                                        var15 ^= 1269669353;
                                    } else {
                                        label334: {
                                            var15 |= -1517907688;
                                            var15 ^= -1043631982;
                                            int var351 = var15 + 1;
                                            int var352 = var15 * var351;
                                            int var365 = var15 + 2;
                                            int var353 = var352 * var365;
                                            int var366 = var15 + 3;
                                            int var354 = var353 * var366;
                                            int var355 = var354 & 7;
                                            if (var355 != 0) {
                                                break label320;
                                            }

                                            label277: {
                                                if (var287) {
                                                    var15 = switch (var15) {
                                                        case -389291875 -> var15 ^ 561342569;
                                                        default -> var15 ^ 2131700291;
                                                        case 1041008012 -> {
                                                            var15 ^= -1538770978;
                                                            yield var15 ^ 91370643;
                                                        }
                                                    };
                                                    long var288 = var15;
                                                    var10 = var288 + 1L;
                                                    var10 = var288 * var10;
                                                    long var12 = var288 + 2L;
                                                    var10 *= var12;
                                                    long var289 = var288 + 3L;
                                                    var10 *= var289;
                                                    long var290 = var10 & 7L;
                                                    long var393;
                                                    int var291 = (var393 = var290 - 0L) == 0L ? 0 : (var393 < 0L ? -1 : 1);
                                                    if (var291 != 0) {
                                                        break label320;
                                                    }

                                                    if (var200) {
                                                        var15 &= -482434694;
                                                        var15 ^= -2011711189;
                                                        Integer var201 = var15;
                                                        if (var201 == null) {
                                                            break label320;
                                                        }

                                                        String var202 = this.J;
                                                        int var292 = var5 + 1;
                                                        int var293 = var5 * var292;
                                                        int var356 = var5 + 2;
                                                        int var294 = var293 * var356;
                                                        int var357 = var5 + 3;
                                                        int var295 = var294 * var357;
                                                        int var296 = var295 & 7;
                                                        if (var296 != 0) {
                                                            var15 ^= -1460420648;
                                                            var15 ^= -394323114;
                                                            break label334;
                                                        }

                                                        var15 &= 1280332162;
                                                        var15 -= 115019408;
                                                        var15 ^= 1040365257;
                                                        int var297 = var15 + 1;
                                                        int var298 = var15 * var297;
                                                        int var358 = var15 + 2;
                                                        int var299 = var298 * var358;
                                                        int var359 = var15 + 3;
                                                        int var300 = var299 * var359;
                                                        int var301 = var300 & 7;
                                                        if (var301 != 0) {
                                                            break label320;
                                                        }

                                                        var203 = var202;
                                                        var15 -= 1637744284;
                                                        var15 ^= 434364789;
                                                        var15 ^= -747451175;
                                                        break label277;
                                                    }

                                                    var15 >>>= 23;
                                                    var15 >>= 18;
                                                    var15 ^= -522014548;
                                                } else {
                                                    switch (var15) {
                                                        case 829616877:
                                                            var15 ^= -1572237525;
                                                            break;
                                                        case 1041008012:
                                                            var15 &= 580204352;
                                                            var15 ^= -983713166;
                                                            var15 ^= -176558608;
                                                            var15 -= -1533403440;
                                                            var15 ^= -1922792674;
                                                            break;
                                                        case 1147820713:
                                                        default:
                                                            var15 ^= -168583501;
                                                    }
                                                }

                                                var203 = "";
                                                var15 ^= 941388690;
                                                var15 ^= -806987635;
                                            }

                                            long var302 = var15;
                                            var10 = var302 + 1L;
                                            var10 = var302 * var10;
                                            long var383 = var302 + 2L;
                                            var10 *= var383;
                                            long var303 = var302 + 3L;
                                            var10 *= var303;
                                            long var304 = var10 & 7L;
                                            long var394;
                                            int var305 = (var394 = var304 - 0L) == 0L ? 0 : (var394 < 0L ? -1 : 1);
                                            if (var305 != 0) {
                                                break label320;
                                            }

                                            var252.Ry = (String)var203;
                                            XK var204 = this.n;
                                            LocalTime var253 = LocalTime.now();
                                            DateTimeFormatter var306 = l;
                                            String var254 = var253.format(var306);
                                            var204.W = var254;
                                            Integer var205 = var5;
                                            if (var205 != null) {
                                                var15 = switch (var15) {
                                                    case 387488691 -> {
                                                        var15 += -505306235;
                                                        var15 -= 1449705420;
                                                        yield var15 ^ 242869951;
                                                    }
                                                    default -> var15 ^ 447367779;
                                                    case 1749166061 -> var15 ^ 1385420248;
                                                };
                                                XK var206 = this.n;
                                                var206.jQ = 0.0F;
                                                XK var207 = this.n;
                                                var207.i = 1.0F;
                                                XK var208 = this.n;
                                                JL var255 = this.X;
                                                int var256 = (var255.vb()) ? 1 : 0;
                                                if (var256 == 0) {
                                                    var15 ^= 1774553824;
                                                    var15 >>>= 7;
                                                    var15 ^= 807294933;
                                                    var256 = var15 + 1;
                                                    var256 = var15 * var256;
                                                    var256 &= 1;
                                                    if (var256 != 0) {
                                                        break label320;
                                                    }

                                                    var256 = 1;
                                                    var15 += -1071188350;
                                                    var15 *= -1412772807;
                                                    var15 &= -1581124526;
                                                    var15 ^= -1436519437;
                                                } else {
                                                    var15 = switch (var15) {
                                                        case -1394042413 -> {
                                                            var15 ^= 618811601;
                                                            var15 ^= -1863989860;
                                                            var15 &= -176200287;
                                                            yield var15 ^ -2105373212;
                                                        }
                                                        default -> var15 ^ -1111280264;
                                                        case 506544009 -> var15 ^ -707067256;
                                                    };
                                                    int var307 = var15 + 1;
                                                    int var308 = var15 * var307;
                                                    int var309 = var308 & 1;
                                                    if (var309 != 0) {
                                                        break label320;
                                                    }

                                                    var256 = 0;
                                                    var15 *= -1565572613;
                                                    var15 -= 1807082163;
                                                    var15 -= -737684785;
                                                    var15 &= -561278612;
                                                    var15 ^= 2044936955;
                                                }

                                                int var310 = var15 + 1;
                                                int var311 = var15 * var310;
                                                int var360 = var15 + 2;
                                                int var312 = var311 * var360;
                                                int var361 = var15 + 3;
                                                int var313 = var312 * var361;
                                                int var314 = var313 & 7;
                                                if (var314 != 0) {
                                                    break label320;
                                                }

                                                var208.a = var256 != 0;
                                                long var170 = var5;
                                                long var261 = var170 + 1L;
                                                long var262 = var170 * var261;
                                                var9 = var170 + 2L;
                                                long var263 = var262 * var9;
                                                long var171 = var170 + 3L;
                                                long var264 = var263 * var171;
                                                long var172 = var264 & 7L;
                                                long var395;
                                                var5 = (var395 = var172 - 0L) == 0L ? 0 : (var395 < 0L ? -1 : 1);
                                                if (var5 == 0) {
                                                    var15 *= -1522414303;
                                                    var15 -= 1260142183;
                                                    var15 ^= 735411917;
                                                    var5 = var15 + 1;
                                                    var5 = var15 * var5;
                                                    int var209 = var15 + 2;
                                                    var5 *= var209;
                                                    int var210 = var15 + 3;
                                                    var5 *= var210;
                                                    var5 &= 7;
                                                    if (var5 == 0) {
                                                        vS_2 var179 = this.G;
                                                        XK var211 = this.n;
                                                        var179.N(var211);
                                                        var5 = var15 | -1232838951;
                                                        var5 ^= 1363143637;
                                                        this.g(var5);
                                                        return;
                                                    }
                                                    break label320;
                                                }

                                                var15 *= 279866317;
                                                var15 ^= -497129614;
                                            } else {
                                                var15 <<= 22;
                                                var15 ^= -1485988379;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            var5 = var15 + 1;
            var5 = var15 * var5;
            int var212 = var15 + 2;
            var5 *= var212;
            var15 += 3;
            var5 *= var15;
            var15 = var5 & 7;
            if (var15 == 0) {
                IllegalStateException var165 = new IllegalStateException();
                throw var165;
            }
        }

        UnsupportedOperationException var169 = new UnsupportedOperationException();
        throw var169;
    }

    private void g(int var1) {
        label140: {
            int var3 = System.identityHashCode(this);
            r_2 var4 = this.w;
            Enum var91 = var4.A();
            nl_2 var92 = (nl_2)var91;
            Integer var5 = var3;
            int var45;
            if (var5 != null) {
                var45 = switch (var1) {
                    case -287271636 -> {
                        var45 = var1 * 1250233887;
                        yield var45 ^ 1427981009;
                    }
                    default -> var1 ^ -1597149881;
                    case 2020662099 -> var1 ^ 580401019;
                };
                nl_2 var106 = nl_2.OFF;
                if (var92 == var106) {
                    var45 ^= -207296380;
                    var45 ^= 1817672612;
                    return;
                }

                var45 *= 620285037;
                var45 &= -1833007605;
                var45 |= 1916787846;
                var45 ^= 1457146380;
                long var107 = var45;
                long var7 = var107 + 1L;
                var7 = var107 * var7;
                long var9 = var107 + 2L;
                var7 *= var9;
                long var108 = var107 + 3L;
                var7 *= var108;
                long var109 = var7 & 7L;
                long var168;
                int var110 = (var168 = var109 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                if (var110 != 0) {
                    break label140;
                }

                Uq var111 = this.V;
                int var6 = var3 + 1;
                var6 = var3 * var6;
                int var144 = var3 + 2;
                var6 *= var144;
                int var145 = var3 + 3;
                var6 *= var145;
                var6 &= 7;
                if (var6 == 0) {
                    var45 = switch (var45) {
                        case -1536846709 -> {
                            var45 += 1761845639;
                            var45 *= -484731981;
                            var45 &= 169680278;
                            yield var45 ^ -2031904880;
                        }
                        default -> var45 ^ 2023730052;
                        case 1034633662 -> var45 ^ -696895415;
                    };
                    var6 = var45 + 1;
                    var6 = var45 * var6;
                    int var146 = var45 + 2;
                    var6 *= var146;
                    int var147 = var45 + 3;
                    var6 *= var147;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label140;
                    }

                    float var112 = var111.WM();
                    float var169;
                    var110 = (var169 = var112 - 0.0F) == 0.0F ? 0 : (var169 < 0.0F ? -1 : 1);
                    if (var110 <= 0) {
                        var45 -= 1448346710;
                        var45 &= -1403973465;
                        var45 ^= -2015844091;
                        return;
                    }

                    var45 += 1688982713;
                    var45 ^= 2036282663;
                    vS_2 var114 = this.G;
                    String var115 = var114.K();
                    long var126 = var3;
                    long var8 = var126 + 1L;
                    var8 = var126 * var8;
                    long var127 = var8 & 1L;
                    long var170;
                    var6 = (var170 = var127 - 0L) == 0L ? 0 : (var170 < 0L ? -1 : 1);
                    label132:
                    if (var6 == 0) {
                        var45 <<= 10;
                        var45 -= -2079132858;
                        var45 *= -1535122517;
                        var45 |= 710553410;
                        var45 ^= -793838998;
                        nl_2 var129 = nl_2.CUSTOM;
                        String var140;
                        if (var92 == var129) {
                            var45 = switch (var45) {
                                case -1305170325 -> var45 ^ -1428028316;
                                case -1085254380 -> {
                                    var45 *= 1498708373;
                                    var45 *= 163499385;
                                    var45 |= -1566860237;
                                    var45 &= 1810838442;
                                    yield var45 ^ 547927960;
                                }
                                default -> var45 ^ 523959744;
                            };
                            int var93 = var45 + 1;
                            int var94 = var45 * var93;
                            int var95 = var94 & 1;
                            if (var95 != 0) {
                                break label140;
                            }

                            String var96 = "death_custom";
                            var6 = var3 + 1;
                            var6 = var3 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                var45 |= -1477964549;
                                var45 |= -235960926;
                                var45 -= 1746813951;
                                var45 += -711470285;
                                var45 ^= -559412103;
                                break label132;
                            }

                            var45 &= 1169703470;
                            var45 ^= -1155631471;
                            int var133 = (this.vP ? 1 : 0);
                            if (var133 == 0) {
                                var45 &= -68822606;
                                var45 ^= 1268412019;
                                Integer var134 = var45;
                                if (var134 == null) {
                                    break label140;
                                }

                                this.vP = true;
                                bw_2.Q();
                                i_2.Je("§7Aura: §fdeath.ogg §7in config/auravisuals/sounds (Ogg Vorbis).");
                                var134 = var3;
                                if (var134 == null) {
                                    var45 -= -1979067762;
                                    var45 &= -61436565;
                                    var45 ^= -539672715;
                                    break label132;
                                }

                                var45 *= 1564006739;
                                var45 >>= 24;
                                var45 -= 1803976943;
                                var45 ^= 1096894229;
                                long var136 = var45;
                                var8 = var136 + 1L;
                                var8 = var136 * var8;
                                long var10 = var136 + 2L;
                                var8 *= var10;
                                long var137 = var136 + 3L;
                                var8 *= var137;
                                long var138 = var8 & 7L;
                                long var171;
                                var133 = (var171 = var138 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                                if (var133 != 0) {
                                    break label140;
                                }

                                var140 = var96;
                                var45 |= 498371819;
                                var45 ^= -514671301;
                            } else {
                                var45 = switch (var45) {
                                    case -1153534789 -> {
                                        var45 -= -1607208414;
                                        var45 &= -1572091979;
                                        var45 ^= -1096226372;
                                        yield var45 ^ 955782272;
                                    }
                                    case -91852924 -> var45 ^ -1335784092;
                                    default -> var45 ^ 1530711687;
                                };
                                int var148 = var45 + 1;
                                int var149 = var45 * var148;
                                int var162 = var45 + 2;
                                int var150 = var149 * var162;
                                int var163 = var45 + 3;
                                int var151 = var150 * var163;
                                int var152 = var151 & 7;
                                if (var152 != 0) {
                                    break label140;
                                }

                                var140 = var96;
                                var45 ^= 2094833292;
                                var45 >>>= 24;
                                var45 >>= 19;
                                var45 ^= 1022230996;
                            }
                        } else {
                            var45 ^= -1950835807;
                            var45 ^= 646620699;
                            int var97 = var45 + 1;
                            int var98 = var45 * var97;
                            int var153 = var45 + 2;
                            int var99 = var98 * var153;
                            int var154 = var45 + 3;
                            int var100 = var99 * var154;
                            int var101 = var100 & 7;
                            if (var101 != 0) {
                                break label140;
                            }

                            var140 = var115;
                            var45 -= 1572870798;
                            var45 ^= -2008264716;
                        }

                        Integer var102 = var45;
                        if (var102 == null) {
                            break label140;
                        }

                        Ud var103 = Ud.Z();
                        Fp var104 = var103.J();
                        HP var116 = HP.Aa();
                        Uq var155 = this.V;
                        float var156 = var155.WM();
                        var8 = var3;
                        long var166 = var8 + 1L;
                        var166 = var8 * var166;
                        var8 = var166 & 1L;
                        long var172;
                        var3 = (var172 = var8 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            var45 -= -561189670;
                            var45 ^= -917870690;
                            var45 ^= -1460060866;
                            var45 ^= -1897058103;
                            Integer var83 = var45;
                            if (var83 != null) {
                                HP var84 = var116.scaled(var156, 1.0F);
                                HP var85 = var84.withoutCombo();
                                boolean var86 = var104.t(var140, var85);
                                return;
                            }
                            break label140;
                        }

                        var45 *= -734296213;
                        var45 ^= 1301069002;
                    } else {
                        switch (var45) {
                            case -1831775592:
                                var45 += -1449471110;
                                var45 += 170670016;
                                var45 &= 1105228490;
                                var45 ^= -79600748;
                                break;
                            case 37113264:
                            default:
                                var45 ^= 700292101;
                                break;
                            case 447555133:
                                var45 ^= 2009437592;
                        }
                    }
                } else {
                    switch (var45) {
                        case -2064033550:
                            var45 ^= 1236686707;
                            break;
                        case -1536846709:
                            var45 &= -684463604;
                            var45 ^= 1071690590;
                            break;
                        case -1451492025:
                        default:
                            var45 ^= 1548059768;
                    }
                }
            } else {
                switch (var1) {
                    case -1805608436:
                        var45 = var1 ^ 1748957253;
                        break;
                    case -607416199:
                    default:
                        var45 = var1 ^ 1371010328;
                        break;
                    case -287271636:
                        var45 = var1 ^ 1791933469;
                        var45 *= -219586123;
                        var45 &= -2009524482;
                        var45 -= 583734506;
                        var45 ^= -427505428;
                }
            }

            var3 = var45 + 1;
            var3 = var45 * var3;
            int var105 = var45 + 2;
            var3 *= var105;
            var45 += 3;
            var3 *= var45;
            var45 = var3 & 7;
            if (var45 == 0) {
                IllegalStateException var81 = new IllegalStateException();
                throw var81;
            }
        }

        RuntimeException var80 = new RuntimeException();
        throw var80;
    }

    private void dA(float var1, int var2) {
        label546: {
            int var240;
            label572: {
                int var4 = System.identityHashCode(this);
                Integer var5 = var4;
                label543:
                if (var5 != null) {
                    var240 = switch (var2) {
                        case -1518389551 -> var2 ^ 778176871;
                        default -> var2 ^ 627986631;
                        case 1157673104 -> {
                            var240 = var2 - 2100353595;
                            var240 ^= 224232940;
                            yield var240 ^ 1793776824;
                        }
                    };
                    boolean var294 = this.vF;
                    if (!var294) {
                        var240 &= -1363093229;
                        var240 += 529951742;
                        var240 ^= -585449828;
                        vS_2[] var295 = this.C;
                        r_2 var6 = this.E;
                        int var348 = var6.Bz();
                        int var7 = var4 + 1;
                        var7 = var4 * var7;
                        int var8 = var4 + 2;
                        var7 *= var8;
                        var8 = var4 + 3;
                        var7 *= var8;
                        var7 &= 7;
                        if (var7 != 0) {
                            var240 |= -1225532575;
                            var240 += 96504683;
                            var240 ^= -882619014;
                            break label543;
                        }
                        var240 = switch (var240) {
                            case -1939591399 -> var240 ^ -220540000;
                            default -> var240 ^ -490251839;
                            case 1657555555 -> {
                                var240 += -2032883759;
                                var240 |= -2121795630;
                                var240 &= -1921789491;
                                var240 += 776905071;
                                yield var240 ^ -1504225981;
                            }
                        };
                        Integer var402 = var240;
                        if (var402 == null) {
                            break label546;
                        }

                        vS_2 var296 = var295[var348];
                        var296.Az();
                        this.vF = true;
                        switch (var240) {
                            case -1105814718:
                                var240 ^= -2070797235;
                                break;
                            case 287647344:
                                var240 *= 1705496569;
                                var240 &= -2030917959;
                                var240 ^= 820997175;
                                var240 ^= -1470069872;
                                break;
                            case 1633188040:
                            default:
                                var240 ^= 2021048869;
                        }
                    } else {
                        switch (var240) {
                            case -1602711807:
                                var240 &= -891787203;
                                var240 ^= -1701493482;
                                break;
                            case 1589068692:
                                var240 ^= -1157501694;
                                break;
                            case 1618693318:
                            default:
                                var240 ^= -958819044;
                        }
                    }

                    float var297 = this.K;
                    long var349 = var4;
                    long var449 = var349 + 1L;
                    var449 = var349 * var449;
                    long var10 = var349 + 2L;
                    var449 *= var10;
                    var349 += 3L;
                    var449 *= var349;
                    var349 = var449 & 7L;
                    long var551;
                    int var352 = (var551 = var349 - 0L) == 0L ? 0 : (var551 < 0L ? -1 : 1);
                    if (var352 != 0) {
                        var240 >>= 11;
                        var240 -= -278050344;
                        var240 ^= 657597541;
                    } else {
                        var240 -= 755105363;
                        var240 |= 837241455;
                        var240 ^= -1460767128;
                        Integer var353 = var240;
                        if (var353 == null) {
                            break label546;
                        }

                        float var552;
                        int var298 = (var552 = var297 - 0.0F) == 0.0F ? 0 : (var552 < 0.0F ? -1 : 1);
                        if (var298 < 0) {
                            switch (var240) {
                                case -436004855:
                                default:
                                    var240 ^= 796133283;
                                    break;
                                case 1426143367:
                                    var240 ^= -156221929;
                                    var240 |= -564849740;
                                    var240 ^= 203802123;
                                    break;
                                case 1691322650:
                                    var240 ^= 178142841;
                            }

                            return;
                        }

                        var240 &= -1927307154;
                        var240 -= -492017356;
                        var240 ^= 1873179298;
                        Entity var299 = i_2.QI();
                        var349 = var4;
                        var449 = var349 + 1L;
                        var449 = var349 * var449;
                        var349 = var449 & 1L;
                        long var553;
                        int var356 = (var553 = var349 - 0L) == 0L ? 0 : (var553 < 0L ? -1 : 1);
                        if (var356 != 0) {
                            var240 >>= 30;
                            var240 += 741215031;
                            var240 |= 666622673;
                            var240 >>= 30;
                            var240 ^= 933505972;
                        } else {
                            var240 = switch (var240) {
                                case -385201759 -> var240 ^ 1246092596;
                                default -> var240 ^ 1399903398;
                                case 1307755632 -> {
                                    var240 *= 350026729;
                                    var240 <<= 8;
                                    var240 >>= 16;
                                    var240 >>>= 4;
                                    yield var240 ^ -2080247364;
                                }
                            };
                            var349 = var240;
                            var449 = var349 + 1L;
                            var449 = var349 * var449;
                            var10 = var349 + 2L;
                            var449 *= var10;
                            var349 += 3L;
                            var449 *= var349;
                            var349 = var449 & 7L;
                            long var554;
                            int var360 = (var554 = var349 - 0L) == 0L ? 0 : (var554 < 0L ? -1 : 1);
                            if (var360 != 0) {
                                break label546;
                            }

                            if (var299 == null) {
                                var240 *= 312978203;
                                var240 ^= -1277850560;
                                var240 ^= -659240859;
                                Integer var395 = var240;
                                if (var395 != null) {
                                    int var396 = var240 | 1108268138;
                                    int var397 = var396 ^ -1665846755;
                                    this.f(var397);
                                    return;
                                }
                                break label546;
                            }

                            var240 -= 140063320;
                            var240 >>>= 12;
                            var240 ^= 2003415604;
                            var349 = var240;
                            var449 = var349 + 1L;
                            var449 = var349 * var449;
                            var349 = var449 & 1L;
                            long var555;
                            int var363 = (var555 = var349 - 0L) == 0L ? 0 : (var555 < 0L ? -1 : 1);
                            if (var363 != 0) {
                                break label546;
                            }

                            float var364 = Math.min(var1, 0.1F);
                            float var403 = this.K;
                            int var461 = var4 + 1;
                            int var462 = var4 * var461;
                            int var9 = var4 + 2;
                            int var463 = var462 * var9;
                            var9 = var4 + 3;
                            int var464 = var463 * var9;
                            int var465 = var464 & 7;
                            label534:
                            if (var465 == 0) {
                                var240 = switch (var240) {
                                    case -1926897756 -> var240 ^ -632303970;
                                    default -> var240 ^ -2040077075;
                                    case 2002880633 -> {
                                        var240 |= 295548962;
                                        yield var240 ^ -1415839454;
                                    }
                                };
                                int var466 = var240 + 1;
                                int var467 = var240 * var466;
                                var9 = var240 + 2;
                                int var468 = var467 * var9;
                                var9 = var240 + 3;
                                int var469 = var468 * var9;
                                int var470 = var469 & 7;
                                if (var470 != 0) {
                                    break label546;
                                }

                                var403 += var364;
                                this.K = var403;
                                Screen var405 = i_2.vB();
                                int var406 = (var405 instanceof DeathScreen) ? 1 : 0;
                                int var471 = (this.Y) ? 1 : 0;
                                boolean var472 = (var471 | var406) != 0;
                                this.Y = var472;
                                boolean var473 = var299 instanceof LivingEntity;
                                boolean var480;
                                if (var473) {
                                    var240 = switch (var240) {
                                        case -597575335 -> {
                                            var240 <<= 24;
                                            var240 ^= -634136260;
                                            yield var240 ^ 1775638775;
                                        }
                                        case 113541400 -> var240 ^ 40068437;
                                        default -> var240 ^ 245319336;
                                    };
                                    Integer var474 = var240;
                                    if (var474 == null) {
                                        break label546;
                                    }

                                    LivingEntity var475 = (LivingEntity)var299;
                                    boolean var476 = var475.isDead();
                                    Integer var516 = var4;
                                    if (var516 == null) {
                                        var240 -= 2136902251;
                                        var240 &= -571030704;
                                        var240 ^= 2116167924;
                                        break label534;
                                    }

                                    var240 &= 462655714;
                                    var240 ^= -1955646285;
                                    if (!var476) {
                                        var240 -= -1968257058;
                                        var240 |= 500733981;
                                        var240 ^= 1782879010;
                                        int var477 = var240 + 1;
                                        int var478 = var240 * var477;
                                        int var479 = var478 & 1;
                                        if (var479 != 0) {
                                            break label546;
                                        }

                                        var480 = true;
                                        switch (var240) {
                                            case -1782878275:
                                                var240 <<= 18;
                                                var240 -= -1952379320;
                                                var240 ^= -1384205952;
                                                break;
                                            case -650970286:
                                            default:
                                                var240 ^= -1130782442;
                                                break;
                                            case 1639015764:
                                                var240 ^= 505926318;
                                        }
                                    } else {
                                        var240 ^= 1712608;
                                        var240 ^= 2032765445;
                                        long var517 = var240;
                                        long var11 = var517 + 1L;
                                        var11 = var517 * var11;
                                        long var13 = var517 + 2L;
                                        var11 *= var13;
                                        long var518 = var517 + 3L;
                                        var11 *= var518;
                                        long var519 = var11 & 7L;
                                        long var556;
                                        int var520 = (var556 = var519 - 0L) == 0L ? 0 : (var556 < 0L ? -1 : 1);
                                        if (var520 != 0) {
                                            break label546;
                                        }

                                        var480 = false;
                                        switch (var240) {
                                            case -2112140982:
                                                var240 ^= -923150786;
                                                break;
                                            case -575841232:
                                            default:
                                                var240 ^= 544894529;
                                                break;
                                            case -119726188:
                                                var240 -= -1285707982;
                                                var240 ^= -615303078;
                                        }
                                    }
                                } else {
                                    var240 <<= 23;
                                    var240 += 645208516;
                                    var240 ^= 1638054685;
                                    Integer var521 = var240;
                                    if (var521 == null) {
                                        break label546;
                                    }

                                    boolean var522 = var299.isAlive();
                                    Integer var534 = var4;
                                    if (var534 == null) {
                                        switch (var240) {
                                            case -1286102311:
                                                var240 += 1013669718;
                                                var240 ^= -2120313757;
                                                var240 *= -1280496941;
                                                var240 -= -1603580995;
                                                var240 ^= 1360537427;
                                                break label534;
                                            case 422428144:
                                                var240 ^= -1968385692;
                                                break label534;
                                            case 954474413:
                                            default:
                                                var240 ^= -1883427446;
                                                break label534;
                                        }
                                    }

                                    var240 -= 656887;
                                    var240 += 153812791;
                                    var240 ^= -1045073513;
                                    var240 &= 1145100093;
                                    var240 ^= -701771048;
                                    var480 = var522;
                                    switch (var240) {
                                        case -1838475308:
                                            var240 |= -1262580393;
                                            var240 |= 588673884;
                                            var240 ^= 701743079;
                                            break;
                                        case -316809587:
                                        default:
                                            var240 ^= -1188545629;
                                            break;
                                        case 2105096665:
                                            var240 ^= 1413457656;
                                    }
                                }

                                float var523 = this.S;
                                Integer var535 = var4;
                                label531:
                                if (var535 != null) {
                                    var240 = switch (var240) {
                                        case -1641267144 -> {
                                            var240 ^= 1898828073;
                                            var240 &= 1749002119;
                                            var240 |= 2024812286;
                                            var240 ^= 233583658;
                                            yield var240 ^ -1594439217;
                                        }
                                        case 516532111 -> var240 ^ -1776744931;
                                        default -> var240 ^ 436758588;
                                    };
                                    float var557;
                                    var9 = (var557 = var523 - 0.0F) == 0.0F ? 0 : (var557 < 0.0F ? -1 : 1);
                                    if (var9 < 0) {
                                        var240 |= 1379531972;
                                        var240 ^= -994921902;
                                        var9 = var240 + 1;
                                        var9 = var240 * var9;
                                        var9 &= 1;
                                        if (var9 != 0) {
                                            break label546;
                                        }

                                        if (var406 == 0) {
                                            var240 = switch (var240) {
                                                default -> var240 ^ 2032524213;
                                                case 319376524 -> {
                                                    var240 &= 1251893722;
                                                    yield var240 ^ -1983697705;
                                                }
                                                case 1312526384 -> var240 ^ -727581928;
                                            };
                                            if (var480) {
                                                var240 ^= -1636418582;
                                                var240 &= 1125279844;
                                                var240 += -555104967;
                                                var240 ^= -1135181247;
                                                int var407 = var240 + 1;
                                                int var408 = var240 * var407;
                                                int var409 = var408 & 1;
                                                if (var409 != 0) {
                                                    break label546;
                                                }

                                                var403 = this.K;
                                                float var558;
                                                int var411 = (var558 = var403 - 0.3F) == 0.0F ? 0 : (var558 < 0.0F ? -1 : 1);
                                                int var481 = var4 + 1;
                                                int var482 = var4 * var481;
                                                int var483 = var482 & 1;
                                                if (var483 != 0) {
                                                    switch (var240) {
                                                        case -917967783:
                                                        default:
                                                            var240 ^= 905693351;
                                                            break label531;
                                                        case 1244238707:
                                                            var240 ^= -1258563967;
                                                            break label531;
                                                        case 1672251164:
                                                            var240 ^= 109337871;
                                                            var240 |= -234440057;
                                                            var240 &= -1335850126;
                                                            var240 |= 1955868783;
                                                            var240 ^= -1022324277;
                                                            break label531;
                                                    }
                                                }

                                                var240 += -1850868224;
                                                var240 += 1959039816;
                                                var240 |= 1008122153;
                                                var240 |= -1655268053;
                                                var240 ^= -230969898;
                                                label515:
                                                if (var411 > 0) {
                                                    var240 = switch (var240) {
                                                        case 224661689 -> {
                                                            var240 &= 26778954;
                                                            var240 ^= -677519666;
                                                            var240 ^= -1738901043;
                                                            var240 &= 1081318042;
                                                            yield var240 ^ 1410888597;
                                                        }
                                                        case 2022321675 -> var240 ^ -885853989;
                                                        default -> var240 ^ 1342800065;
                                                    };
                                                    boolean var412 = this.Y;
                                                    Integer var484 = var4;
                                                    if (var484 == null) {
                                                        switch (var240) {
                                                            case -681338702:
                                                                var240 ^= -2114464291;
                                                                break label531;
                                                            case -46190150:
                                                            default:
                                                                var240 ^= 1331087972;
                                                                break label531;
                                                            case 341565855:
                                                                var240 *= 968114525;
                                                                var240 -= -1099643375;
                                                                var240 *= 1392943573;
                                                                var240 *= 1740371743;
                                                                var240 ^= 1241682834;
                                                                break label531;
                                                        }
                                                    }
                                                    var240 = switch (var240) {
                                                        default -> var240 ^ 1878441377;
                                                        case 341565855 -> {
                                                            var240 *= 1896780861;
                                                            var240 >>>= 25;
                                                            yield var240 ^ 1528542520;
                                                        }
                                                        case 1343387082 -> var240 ^ -877123505;
                                                    };
                                                    if (!var412) {
                                                        var240 -= 1751143454;
                                                        var240 |= 1384481793;
                                                        var240 *= -320192753;
                                                        var240 <<= 8;
                                                        var240 ^= -1741284368;
                                                        int var413 = var240 + 1;
                                                        int var414 = var240 * var413;
                                                        int var485 = var240 + 2;
                                                        int var415 = var414 * var485;
                                                        int var486 = var240 + 3;
                                                        int var416 = var415 * var486;
                                                        int var417 = var416 & 7;
                                                        if (var417 != 0) {
                                                            break label546;
                                                        }

                                                        World var300 = var299.getEntityWorld();
                                                        Object var418 = this.CY;
                                                        var449 = var4;
                                                        var10 = var449 + 1L;
                                                        var10 = var449 * var10;
                                                        var449 = var10 & 1L;
                                                        long var559;
                                                        int var489 = (var559 = var449 - 0L) == 0L ? 0 : (var559 < 0L ? -1 : 1);
                                                        if (var489 != 0) {
                                                            var240 *= 1065274265;
                                                            var240 ^= -506654524;
                                                            break label531;
                                                        }

                                                        var240 *= -495466213;
                                                        var240 &= -2051978168;
                                                        var240 <<= 13;
                                                        var240 |= -1361024610;
                                                        var240 ^= 1873991024;
                                                        var449 = var240;
                                                        var10 = var449 + 1L;
                                                        var10 = var449 * var10;
                                                        long var12 = var449 + 2L;
                                                        var10 *= var12;
                                                        var449 += 3L;
                                                        var10 *= var449;
                                                        var449 = var10 & 7L;
                                                        long var560;
                                                        int var493 = (var560 = var449 - 0L) == 0L ? 0 : (var560 < 0L ? -1 : 1);
                                                        if (var493 != 0) {
                                                            break label546;
                                                        }

                                                        if (var300 == var418) {
                                                            var240 |= 1893541886;
                                                            var240 ^= 2074549917;
                                                            float var301 = this.K;
                                                            vS_2 var419 = this.G;
                                                            var449 = var4;
                                                            var10 = var449 + 1L;
                                                            var10 = var449 * var10;
                                                            var12 = var449 + 2L;
                                                            var10 *= var12;
                                                            var449 += 3L;
                                                            var10 *= var449;
                                                            var449 = var10 & 7L;
                                                            long var561;
                                                            int var497 = (var561 = var449 - 0L) == 0L ? 0 : (var561 < 0L ? -1 : 1);
                                                            if (var497 != 0) {
                                                                var240 |= 333788276;
                                                                var240 &= 1832782810;
                                                                var240 ^= 1050159846;
                                                                break label531;
                                                            }
                                                            var240 = switch (var240) {
                                                                case -1955028637 -> {
                                                                    var240 *= 841276007;
                                                                    var240 &= -567359724;
                                                                    yield var240 ^ -717037312;
                                                                }
                                                                case -1246142840 -> var240 ^ 717164097;
                                                                default -> var240 ^ -1947682612;
                                                            };
                                                            var403 = var419.Vb();
                                                            float var562;
                                                            var298 = (var562 = var301 - var403) == 0.0F ? 0 : (var562 < 0.0F ? -1 : 1);
                                                            if (var298 < 0) {
                                                                switch (var240) {
                                                                    case -26348640:
                                                                        var240 ^= -1349843650;
                                                                        break label515;
                                                                    case 190899476:
                                                                        var240 += 1786440250;
                                                                        var240 ^= 936783803;
                                                                        var240 ^= -955147418;
                                                                        break label515;
                                                                    case 1084971913:
                                                                    default:
                                                                        var240 ^= -718968153;
                                                                        break label515;
                                                                }
                                                            }

                                                            switch (var240) {
                                                                case -180797344:
                                                                    var240 ^= 2005445301;
                                                                    break;
                                                                case 190899476:
                                                                    var240 *= 1531158187;
                                                                    var240 |= 16709617;
                                                                    var240 ^= 296384254;
                                                                    break;
                                                                case 1722524732:
                                                                default:
                                                                    var240 ^= -1780706616;
                                                            }
                                                        } else {
                                                            var240 *= 1529379667;
                                                            var240 &= 1671872419;
                                                            var240 |= -2067884774;
                                                            var240 += 101150939;
                                                            var240 ^= -309094122;
                                                        }
                                                    } else {
                                                        var240 |= 1126553024;
                                                        var240 &= -799316378;
                                                        var240 ^= 911142213;
                                                    }

                                                    Integer var303 = var240;
                                                    if (var303 == null) {
                                                        break label546;
                                                    }

                                                    this.S = 0.0F;
                                                    var240 *= -1419828927;
                                                    var240 &= 395405701;
                                                    var240 -= -1087447146;
                                                    var240 ^= -688049288;
                                                } else {
                                                    var240 *= 1592213763;
                                                    var240 ^= 273043640;
                                                }
                                            } else {
                                                var240 ^= -385495696;
                                                var240 ^= 1417262948;
                                                var240 += 1338979380;
                                                var240 ^= 60436972;
                                            }
                                        } else {
                                            var240 &= -575606868;
                                            var240 ^= -1810090209;
                                        }
                                    } else {
                                        var240 *= -549500963;
                                        var240 += -2134818488;
                                        var240 ^= -691131351;
                                    }

                                    var298 = var240 + 1;
                                    var298 = var240 * var298;
                                    var298 &= 1;
                                    if (var298 != 0) {
                                        break label546;
                                    }

                                    float var307 = this.S;
                                    Integer var421 = var4;
                                    if (var421 == null) {
                                        var240 |= -746174840;
                                        var240 &= -1698702069;
                                        var240 += -597192512;
                                        var240 ^= 1486997119;
                                    } else {
                                        var240 = switch (var240) {
                                            case -2061730925 -> {
                                                var240 |= 1189357060;
                                                var240 += 1512695130;
                                                var240 <<= 24;
                                                yield var240 ^ -291476333;
                                            }
                                            default -> var240 ^ 742596746;
                                            case 1370569439 -> var240 ^ -1753448922;
                                        };
                                        Integer var422 = var240;
                                        if (var422 == null) {
                                            break label546;
                                        }

                                        float var563;
                                        var298 = (var563 = var307 - 0.0F) == 0.0F ? 0 : (var563 < 0.0F ? -1 : 1);
                                        if (var298 >= 0) {
                                            var240 -= -1518331964;
                                            var240 *= -761870265;
                                            var240 *= -1329216801;
                                            var240 |= -1439947403;
                                            var240 ^= -2121515920;
                                            long var423 = var240;
                                            long var528 = var423 + 1L;
                                            long var529 = var423 * var528;
                                            long var549 = var423 + 2L;
                                            long var530 = var529 * var549;
                                            long var424 = var423 + 3L;
                                            long var531 = var530 * var424;
                                            long var425 = var531 & 7L;
                                            long var564;
                                            var298 = (var564 = var425 - 0L) == 0L ? 0 : (var564 < 0L ? -1 : 1);
                                            if (var298 != 0) {
                                                break label546;
                                            }

                                            float var310 = this.S;
                                            int var426 = var4 + 1;
                                            int var427 = var4 * var426;
                                            int var428 = var427 & 1;
                                            if (var428 != 0) {
                                                switch (var240) {
                                                    case -2008376668:
                                                    default:
                                                        var240 ^= 221559133;
                                                        break label531;
                                                    case -1648538190:
                                                        var240 ^= 2005992285;
                                                        break label531;
                                                    case 992020743:
                                                        var240 += 1017219695;
                                                        var240 ^= 1080473794;
                                                        break label531;
                                                }
                                            }
                                            var240 = switch (var240) {
                                                case 992020743 -> {
                                                    var240 ^= 1214822691;
                                                    var240 >>= 28;
                                                    var240 -= 534728298;
                                                    yield var240 ^ 1670948442;
                                                }
                                                case 1322206962 -> var240 ^ 1517532551;
                                                default -> var240 ^ -738869870;
                                            };
                                            Integer var429 = var240;
                                            if (var429 == null) {
                                                break label546;
                                            }

                                            float var311 = var310 + var364;
                                            this.S = var311;
                                            float var312 = this.S;
                                            float var565;
                                            var298 = (var565 = var312 - 0.4F) == 0.0F ? 0 : (var565 < 0.0F ? -1 : 1);
                                            if (var298 >= 0) {
                                                var240 = switch (var240) {
                                                    case -2085087289 -> {
                                                        var240 |= 1525493733;
                                                        yield var240 ^ 722758856;
                                                    }
                                                    default -> var240 ^ -853731679;
                                                    case 1497471037 -> var240 ^ -1810641132;
                                                };
                                                var298 = var240 + 1;
                                                var298 = var240 * var298;
                                                var298 &= 1;
                                                if (var298 == 0) {
                                                    var298 = var240 - -423776028;
                                                    var298 += 1247957294;
                                                    var298 ^= -2106114146;
                                                    this.f(var298);
                                                    return;
                                                }
                                                break label546;
                                            }

                                            switch (var240) {
                                                case -2085087289:
                                                    var240 -= 1209301345;
                                                    var240 &= -1298618813;
                                                    var240 >>>= 22;
                                                    var240 ^= -858858376;
                                                    break;
                                                case -642429975:
                                                    var240 ^= 2053166186;
                                                    break;
                                                case 1464137662:
                                                default:
                                                    var240 ^= 325899138;
                                            }
                                        } else {
                                            var240 &= -1146786657;
                                            var240 ^= -794123805;
                                            var240 ^= 130290114;
                                        }

                                        XK var320 = this.n;
                                        Integer var365 = var4;
                                        if (var365 != null) {
                                            var240 |= -736123622;
                                            var240 ^= 790545513;
                                            float var366 = this.K;
                                            var320.jQ = var366;
                                            XK var321 = this.n;
                                            float var367 = this.S;
                                            float var566;
                                            int var368 = (var566 = var367 - 0.0F) == 0.0F ? 0 : (var566 < 0.0F ? -1 : 1);
                                            float var372;
                                            if (var368 < 0) {
                                                var240 &= -1761526042;
                                                var240 += 96201301;
                                                var240 &= -89930639;
                                                var240 ^= -1014685866;
                                                int var369 = var240 + 1;
                                                int var370 = var240 * var369;
                                                int var371 = var370 & 1;
                                                if (var371 != 0) {
                                                    break label546;
                                                }

                                                var372 = 1.0F;
                                                var240 += 621357319;
                                                var240 |= -1406080768;
                                                var240 ^= 1733660925;
                                            } else {
                                                var240 *= -181236941;
                                                var240 &= 1500011976;
                                                var240 >>= 29;
                                                var240 ^= -1074730133;
                                                var240 ^= -1653350950;
                                                Lv var430 = sT_2.Jj;
                                                float var498 = this.S;
                                                float var499 = var498 / 0.4F;
                                                var403 = var430.l(var499);
                                                int var500 = var4 + 1;
                                                int var501 = var4 * var500;
                                                int var502 = var501 & 1;
                                                if (var502 != 0) {
                                                    var240 *= -1527071599;
                                                    var240 &= 1255893101;
                                                    var240 &= -2119658355;
                                                    var240 += 1475829354;
                                                    var240 ^= 1616082399;
                                                    break label531;
                                                }
                                                var240 = switch (var240) {
                                                    case -962882511 -> var240 ^ 1572116663;
                                                    default -> var240 ^ -995396038;
                                                    case 579024561 -> {
                                                        var240 += 107511535;
                                                        yield var240 ^ -98746213;
                                                    }
                                                };
                                                int var503 = var240 + 1;
                                                int var504 = var240 * var503;
                                                int var505 = var504 & 1;
                                                if (var505 != 0) {
                                                    break label546;
                                                }

                                                var403 = 1.0F - var403;
                                                var372 = var403;
                                                var240 <<= 29;
                                                var240 ^= -1419216461;
                                            }

                                            Integer var433 = var240;
                                            if (var433 == null) {
                                                break label546;
                                            }

                                            var321.i = var372;
                                            var298 = var4 + 1;
                                            var298 = var4 * var298;
                                            int var373 = var4 + 2;
                                            var298 *= var373;
                                            int var374 = var4 + 3;
                                            var298 *= var374;
                                            var298 &= 7;
                                            if (var298 == 0) {
                                                var240 |= 319209890;
                                                var240 -= 1106634009;
                                                var240 ^= -1950074842;
                                                var298 = var240 + 1;
                                                var298 = var240 * var298;
                                                int var375 = var240 + 2;
                                                var298 *= var375;
                                                int var376 = var240 + 3;
                                                var298 *= var376;
                                                var298 &= 7;
                                                if (var298 != 0) {
                                                    break label546;
                                                }

                                                label619: {
                                                    XK var332 = this.n;
                                                    Uq var377 = this.O;
                                                    float var378 = var377.WM();
                                                    var332.mz = var378;
                                                    int var333 = (this.mL ? 1 : 0);
                                                    if (var333 == 0) {
                                                        var240 -= 163991938;
                                                        var240 ^= 2017008274;
                                                        float var334 = this.K;
                                                        vS_2 var379 = this.G;
                                                        float var380 = var379.w();
                                                        Integer var434 = var4;
                                                        if (var434 == null) {
                                                            switch (var240) {
                                                                case -1140410398:
                                                                    var240 ^= -580112110;
                                                                    break label531;
                                                                case -485564507:
                                                                default:
                                                                    var240 ^= -1911979658;
                                                                    break label531;
                                                                case 1892663720:
                                                                    var240 -= -788450156;
                                                                    var240 |= 1325779370;
                                                                    var240 -= 931775305;
                                                                    var240 ^= -1612570175;
                                                                    break label531;
                                                            }
                                                        }

                                                        var240 -= 889281001;
                                                        var240 &= 1164627687;
                                                        var240 ^= -1478568464;
                                                        int var435 = var240 + 1;
                                                        int var436 = var240 * var435;
                                                        int var437 = var436 & 1;
                                                        if (var437 != 0) {
                                                            break label546;
                                                        }

                                                        float var567;
                                                        var333 = (var567 = var334 - var380) == 0.0F ? 0 : (var567 < 0.0F ? -1 : 1);
                                                        if (var333 < 0) {
                                                            var240 = switch (var240) {
                                                                case -2126049230 -> var240 ^ -243134835;
                                                                case -1500212393 -> {
                                                                    var240 += 2007755460;
                                                                    yield var240 ^ -1798545386;
                                                                }
                                                                default -> var240 ^ 166329964;
                                                            };
                                                            JL var336 = this.X;
                                                            var349 = var4;
                                                            var449 = var349 + 1L;
                                                            var449 = var349 * var449;
                                                            var349 = var449 & 1L;
                                                            long var568;
                                                            int var383 = (var568 = var349 - 0L) == 0L ? 0 : (var568 < 0L ? -1 : 1);
                                                            if (var383 != 0) {
                                                                switch (var240) {
                                                                    case -1970528755:
                                                                        var240 ^= -1810401517;
                                                                        var240 ^= 692011690;
                                                                        break label531;
                                                                    case -200504924:
                                                                    default:
                                                                        var240 ^= 1129067090;
                                                                        break label531;
                                                                    case 1945853107:
                                                                        var240 ^= 1918502429;
                                                                        break label531;
                                                                }
                                                            }

                                                            var240 -= -1925393716;
                                                            var240 |= 1839943419;
                                                            var240 += -862030993;
                                                            var240 ^= 1215150758;
                                                            boolean var337 = var336.vb();
                                                            if (var337) {
                                                                var240 &= -1675499732;
                                                                var240 ^= -1736766143;
                                                                var240 |= -89347002;
                                                                var240 ^= -600215896;
                                                                var240 ^= 1350629539;
                                                                break label619;
                                                            }

                                                            var240 |= 1762970044;
                                                            var240 |= 543043117;
                                                            var240 ^= 537873880;
                                                        } else {
                                                            var240 -= 172711710;
                                                            var240 *= 1287876531;
                                                            var240 *= 457130269;
                                                            var240 &= 1492719634;
                                                            var240 ^= -873352665;
                                                        }
                                                    } else {
                                                        var240 &= -46757112;
                                                        var240 *= -1906248981;
                                                        var240 ^= 1235967357;
                                                    }

                                                    XK var338 = this.n;
                                                    var349 = var4;
                                                    var449 = var349 + 1L;
                                                    var449 = var349 * var449;
                                                    var349 = var449 & 1L;
                                                    long var569;
                                                    int var386 = (var569 = var349 - 0L) == 0L ? 0 : (var569 < 0L ? -1 : 1);
                                                    if (var386 != 0) {
                                                        var240 -= -973245140;
                                                        var240 += -390876267;
                                                        var240 &= -1455870880;
                                                        var240 &= 2019805789;
                                                        var240 ^= 528821172;
                                                        break label531;
                                                    }
                                                    var240 = switch (var240) {
                                                        case -873352667 -> {
                                                            var240 -= 1405343860;
                                                            var240 &= 1335209237;
                                                            var240 &= 730834422;
                                                            yield var240 ^ -856374376;
                                                        }
                                                        case 756391610 -> var240 ^ -1674897257;
                                                        default -> var240 ^ 914657315;
                                                    };
                                                    Integer var387 = var240;
                                                    if (var387 == null) {
                                                        break label546;
                                                    }

                                                    var338.a = true;
                                                    var240 ^= -1217339451;
                                                    var240 -= 1732841571;
                                                    var240 <<= 2;
                                                    var240 ^= 1185171948;
                                                }

                                                vS_2 var339 = this.G;
                                                Ud var388 = Ud.Z();
                                                AuraRenderer var389 = var388.ZP();
                                                ScreenEffects var390 = var389.screenEffects();
                                                int var438 = var4 + 1;
                                                int var439 = var4 * var438;
                                                int var510 = var4 + 2;
                                                int var440 = var439 * var510;
                                                int var511 = var4 + 3;
                                                int var441 = var440 * var511;
                                                int var442 = var441 & 7;
                                                if (var442 == 0) {
                                                    var240 |= 1547644022;
                                                    var240 ^= 1517043579;
                                                    XK var443 = this.n;
                                                    var339.l(var390, var443);
                                                    JL var340 = this.Dh;
                                                    int var341 = (var340.vb()) ? 1 : 0;
                                                    if (var341 == 0) {
                                                        var240 += 483478550;
                                                        var240 *= -768967499;
                                                        var240 |= 1415149109;
                                                        var240 ^= -229211094;
                                                        break label572;
                                                    }

                                                    var240 *= 127406775;
                                                    var240 ^= -181708182;
                                                    long var342 = var240;
                                                    long var444 = var342 + 1L;
                                                    long var445 = var342 * var444;
                                                    long var532 = var342 + 2L;
                                                    long var446 = var445 * var532;
                                                    long var343 = var342 + 3L;
                                                    long var447 = var446 * var343;
                                                    long var344 = var447 & 7L;
                                                    long var570;
                                                    var341 = (var570 = var344 - 0L) == 0L ? 0 : (var570 < 0L ? -1 : 1);
                                                    if (var341 != 0) {
                                                        break label546;
                                                    }

                                                    Ud var346 = Ud.Z();
                                                    BP var347 = var346.Kx();
                                                    Integer var289 = var4;
                                                    if (var289 != null) {
                                                        var240 += 36378688;
                                                        var240 ^= 1440594301;
                                                        var347.YX();
                                                        switch (var240) {
                                                            case -2118437868:
                                                            default:
                                                                var240 ^= 2089318468;
                                                                break label572;
                                                            case -1181880036:
                                                                var240 >>>= 25;
                                                                var240 ^= -2052228151;
                                                                break label572;
                                                            case -284928450:
                                                                var240 ^= 2135596244;
                                                                break label572;
                                                        }
                                                    }

                                                    var240 |= -13990943;
                                                    var240 ^= -930375595;
                                                } else {
                                                    var240 ^= -952040331;
                                                    var240 <<= 3;
                                                    var240 |= 54349237;
                                                    var240 *= 1503966055;
                                                    var240 ^= 815404479;
                                                }
                                            } else {
                                                var240 *= -58683455;
                                                var240 &= 171768867;
                                                var240 -= -1770491085;
                                                var240 |= -1071931036;
                                                var240 ^= -595869120;
                                            }
                                        } else {
                                            var240 &= -530465811;
                                            var240 &= -327175955;
                                            var240 *= 1773610111;
                                            var240 ^= 1092228308;
                                        }
                                    }
                                } else {
                                    var240 *= -2141743111;
                                    var240 <<= 24;
                                    var240 ^= 1336159156;
                                }
                            } else {
                                switch (var240) {
                                    case -1184745435:
                                    default:
                                        var240 ^= -1086519487;
                                        break;
                                    case 1352333302:
                                        var240 ^= 413687880;
                                        break;
                                    case 2002880633:
                                        var240 += -1996041113;
                                        var240 -= -95658761;
                                        var240 &= -2077187527;
                                        var240 -= 504495095;
                                        var240 ^= -765817466;
                                }
                            }
                        }
                    }
                } else {
                    var240 = var2 ^ 795201779;
                    var240 ^= 1572948951;
                }

                Integer var286 = var240;
                if (var286 != null) {
                    AssertionError var288 = new AssertionError();
                    throw var288;
                }
                break label546;
            }

            long var290 = var240;
            long var391 = var290 + 1L;
            var391 = var290 * var391;
            long var512 = var290 + 2L;
            var391 *= var512;
            var290 += 3L;
            var391 *= var290;
            var290 = var391 & 7L;
            long var571;
            int var293 = (var571 = var290 - 0L) == 0L ? 0 : (var571 < 0L ? -1 : 1);
            if (var293 == 0) {
                return;
            }
        }

        UnsupportedOperationException var287 = new UnsupportedOperationException();
        throw var287;
    }

    private void f(int var1) {
        int var3 = System.identityHashCode(this);
        this.K = -1.0F;
        this.S = -1.0F;
        this.G = null;
        long var14 = var3;
        long var5 = var14 + 1L;
        var5 = var14 * var5;
        long var15 = var5 & 1L;
        long var19;
        var3 = (var19 = var15 - 0L) == 0L ? 0 : (var19 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var11 = var1 >> 29;
            var11 ^= -1026433250;
            var11 ^= -705192561;
            IllegalStateException var17 = new IllegalStateException();
            throw var17;
        } else {
            int var2 = var1 + -1157103079;
            var2 >>= 7;
            var2 ^= 168201114;
            Integer var9 = var2;
            if (var9 == null) {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            } else {
                this.CY = null;
            }
        }
    }

    private void e(T var1) {
        vS_2 var174 = null;
        int var2 = Td;
        var2 ^= -701205649;
        Object var3 = null;
        var2 ^= 1689028861;
        var2 += -2096811163;
        var2 ^= -941142608;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var5 = var2 + 3;
        var4 *= var5;
        var4 &= 7;
        label159:
        if (var4 == 0) {
            RenderPhase var139 = var1.phase();
            RenderPhase var158 = RenderPhase.OVERLAY;
            if (var139 == var158) {
                var2 >>>= 21;
                var2 -= -2022801260;
                var2 -= 79900337;
                var2 ^= 947167425;
                long var140 = var2;
                long var6 = var140 + 1L;
                var6 = var140 * var6;
                long var8 = var140 + 2L;
                var6 *= var8;
                long var141 = var140 + 3L;
                var6 *= var141;
                long var142 = var6 & 7L;
                long var238;
                var4 = (var238 = var142 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label159;
                }

                float var144 = this.K;
                var2 += 1763307393;
                var2 ^= 129198317;
                Integer var159 = var2;
                if (var159 == null) {
                    break label159;
                }

                float var239;
                var4 = (var239 = var144 - 0.0F) == 0.0F ? 0 : (var239 < 0.0F ? -1 : 1);
                if (var4 >= 0) {
                    var2 |= -742074593;
                    var2 &= 946689302;
                    var2 -= 1471739817;
                    var2 += -583132481;
                    var2 ^= -1646720396;
                    var4 = var2 + 1;
                    var4 = var2 * var4;
                    int var160 = var2 + 2;
                    var4 *= var160;
                    var160 = var2 + 3;
                    var4 *= var160;
                    var4 &= 7;
                    if (var4 != 0) {
                        break label159;
                    }

                    vS_2 var151 = this.G;

                    var2 = switch (var2) {
                        case 674460248 -> {
                            var2 *= 1428618523;
                            var2 -= -1425170465;
                            yield var2 ^ -441793032;
                        }
                        case 771322124 -> var2 ^ 1896938977;
                        default -> var2 ^ 1778077525;
                    };
                    if (var151 != null) {
                        var2 *= 2014884451;
                        var2 >>= 25;
                        var2 -= 1540221557;
                        var2 -= 940344657;
                        var2 ^= 2144955319;
                        Integer var152 = var2;
                        if (var152 != null) {
                            Canvas var153 = var1.canvas();
                            var2 ^= 477666293;
                            var2 |= -212961287;
                            var2 ^= 1247360153;
                            Canvas var154 = var153;
                            XK var162 = this.n;
                            float var182 = var153.width();
                            var162.dW = var182;
                            XK var163 = this.n;
                            float var183 = var153.height();
                            var163.C = var183;
                            XK var164 = this.n;
                            boolean var184 = this.m;
                            float var193;
                            if (var184) {
                                var2 *= -639394031;
                                var2 |= -213160726;
                                var2 &= 396316063;
                                var2 ^= 1575129288;
                                var6 = var2;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                long var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var240;
                                int var188 = (var240 = var6 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                                if (var188 != 0) {
                                    break label159;
                                }

                                XK var189 = this.n;
                                float var190 = var189.C;
                                float var191 = var190 / 4.0F;

                                var2 = switch (var2) {
                                    case -1847734625 -> var2 ^ 74140915;
                                    default -> var2 ^ -2059861614;
                                    case 1249500486 -> {
                                        var2 += -618734086;
                                        yield var2 ^ 346921303;
                                    }
                                };
                                float var192 = var191 + 64.0F;
                                var193 = var192;
                                var2 += 1855668504;
                                var2 *= 610529595;
                                var2 |= -882388763;
                                var2 ^= -1401923282;
                                var2 ^= 1759199084;
                            } else {
                                var2 ^= 918213520;
                                var2 ^= 1553091010;
                                XK var7 = this.n;
                                var2 &= -999430700;
                                var2 <<= 14;
                                var2 ^= -1130674013;
                                var2 |= 1117154079;
                                var2 ^= -1757934639;
                                int var223 = var2 + 1;
                                int var224 = var2 * var223;
                                int var9 = var2 + 2;
                                int var225 = var224 * var9;
                                var9 = var2 + 3;
                                int var226 = var225 * var9;
                                int var227 = var226 & 7;
                                if (var227 != 0) {
                                    break label159;
                                }

                                float var203 = var7.C;
                                var193 = var203;
                                switch (var2) {
                                    case -759387440:
                                    default:
                                        var2 ^= -1372219969;
                                        break;
                                    case 1508270190:
                                        var2 *= -1738372677;
                                        var2 ^= 295957229;
                                        break;
                                    case 1932568787:
                                        var2 ^= -1517831316;
                                }
                            }

                            Integer var204 = var2;
                            if (var204 != null) {
                                var164.A = var193;
                                Ud var165 = Ud.Z();
                                BP var166 = var165.Kx();
                                Oo var167 = var166.C();
                                var2 &= 1604598546;
                                var2 ^= -1966675312;
                                int var194 = var2 + 1;
                                int var195 = var2 * var194;
                                int var196 = var195 & 1;
                                if (var196 == 0) {
                                    XK var197 = this.n;
                                    if (var167 != null) {
                                        var2 ^= 2132340346;
                                        var2 &= -1012465482;
                                        var2 -= -1764271933;
                                        var2 -= 1226097746;
                                        var2 ^= 1611897672;
                                        int var205 = var2 + 1;
                                        var205 = var2 * var205;
                                        int var228 = var2 + 2;
                                        var205 *= var228;
                                        int var229 = var2 + 3;
                                        var205 *= var229;
                                        var205 &= 7;
                                        if (var205 != 0) {
                                            break label159;
                                        }

                                        var160 = var167.E();
                                        var2 |= -1648423100;
                                        var2 |= 634440569;
                                        var2 -= 2085447622;
                                        var2 ^= 363560372;
                                        var160 = var160;
                                        var2 |= 1729662181;
                                        var2 ^= -431318919;
                                    } else {
                                        var2 ^= -690060949;
                                        var2 += 1115051894;
                                        var2 &= -1651854317;
                                        var2 ^= 1690927918;
                                        int var210 = var2 + 1;
                                        var210 = var2 * var210;
                                        var210 &= 1;
                                        if (var210 != 0) {
                                            break label159;
                                        }

                                        var160 = -7684353;
                                        var2 *= 1510138141;
                                        var2 >>>= 28;
                                        var2 -= -756869667;
                                        var2 ^= -1135632461;
                                    }

                                    int var213 = var2 + 1;
                                    var213 = var2 * var213;
                                    int var230 = var2 + 2;
                                    var213 *= var230;
                                    int var231 = var2 + 3;
                                    var213 *= var231;
                                    var213 &= 7;
                                    if (var213 == 0) {
                                        var197.K = var160;

                                        var2 = switch (var2) {
                                            case -1916831219 -> var2 ^ -1510801073;
                                            case -1856801388 -> {
                                                var2 |= -481076193;
                                                var2 ^= -1287540940;
                                                yield var2 ^ 526546100;
                                            }
                                            default -> var2 ^ 969926487;
                                        };
                                        var160 = var2 + 1;
                                        var160 = var2 * var160;
                                        var160 &= 1;
                                        if (var160 == 0) {
                                            var153.save();
                                            var2 |= 667665677;
                                            var2 ^= -1847466503;

                                            try {
                                                var2 >>= 15;
                                                var2 ^= 204721546;
                                            } catch (Throwable var14) {
                                                var2 = Td;
                                                var2 ^= 689177276;
                                                var2 <<= 3;
                                                var2 |= 246253122;
                                                var2 |= 1943614732;
                                                var2 ^= 411789048;
                                                var153.restore();
                                                throw var14;
                                            }

                                            Integer var173 = var2;
                                            if (var173 != null) {
                                                try {
                                                    var174 = this.G;
                                                } catch (Throwable var13) {
                                                    var2 = Td;
                                                    var2 ^= 689177276;
                                                    var2 <<= 3;
                                                    var2 |= 246253122;
                                                    var2 |= 1943614732;
                                                    var2 ^= 411789048;
                                                    var153.restore();
                                                    throw var13;
                                                }
                                                var2 = switch (var2) {
                                                    default -> var2 ^ -1475133777;
                                                    case -204729922 -> {
                                                        var2 += -5466968;
                                                        yield var2 ^ -1626675656;
                                                    }
                                                    case 724073262 -> var2 ^ -18445379;
                                                };
                                                var6 = var2;
                                                var8 = var6 + 1L;
                                                var8 = var6 * var8;
                                                long var237 = var6 + 2L;
                                                var8 *= var237;
                                                var6 += 3L;
                                                var8 *= var6;
                                                var6 = var8 & 7L;
                                                long var241;
                                                int var201 = (var241 = var6 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                                                if (var201 == 0) {
                                                    try {
                                                        XK var202 = this.n;
                                                        var2 <<= 31;
                                                        var2 ^= 1283438712;
                                                        var174.XE(var154, var202);
                                                        var2 += 1889620152;
                                                        var2 -= 789895847;
                                                        var2 -= -1263056223;
                                                        var2 ^= 730775957;
                                                    } catch (Throwable var12) {
                                                        var2 = Td;
                                                        var2 ^= 689177276;
                                                        var2 <<= 3;
                                                        var2 |= 246253122;
                                                        var2 |= 1943614732;
                                                        var2 ^= 411789048;
                                                        var153.restore();
                                                        throw var12;
                                                    }

                                                    var153.restore();
                                                    var2 *= 1826874827;
                                                    var2 ^= 548040455;
                                                    long var131 = var2;
                                                    long var175 = var131 + 1L;
                                                    long var176 = var131 * var175;
                                                    long var218 = var131 + 2L;
                                                    long var177 = var176 * var218;
                                                    long var132 = var131 + 3L;
                                                    long var178 = var177 * var132;
                                                    long var133 = var178 & 7L;
                                                    long var242;
                                                    int var134 = (var242 = var133 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                                                    if (var134 == 0) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break label159;
                    }

                    var2 ^= 1822427650;
                    var2 <<= 13;
                    var2 |= 1168960212;
                    var2 ^= 1698933838;
                } else {
                    var2 *= 1769699385;
                    var2 |= 715266754;
                    var2 += 1652076255;
                    var2 += 2029828985;
                    var2 ^= 932004776;
                }
            } else {
                var2 |= -390916937;
                var2 -= 2021192490;
                var2 >>= 19;
                var2 ^= -217334340;
                var2 ^= 1007225601;
            }

            long var127 = var2;
            long var155 = var127 + 1L;
            long var156 = var127 * var155;
            long var128 = var156 & 1L;
            long var243;
            var2 = (var243 = var128 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
            if (var2 == 0) {
                return;
            }
        }

        IllegalArgumentException var130 = new IllegalArgumentException();
        throw var130;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -959346294;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        Td = var4;
        DateTimeFormatter var5 = DateTimeFormatter.ofPattern("HH:mm:ss");
        l = var5;
    }
}
