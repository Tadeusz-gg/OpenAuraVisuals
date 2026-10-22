package mvggs.modules.world;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.function.BooleanSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public final class trails extends Yn {
    private static final int zO = 32;
    private static final double oc = 0.001;
    private final r_2 l;
    private final Uq c;
    private final Uq n;
    private final Uq Ax;
    private final JL CF;
    private final Uq Lx;
    private final Uq X;
    private final zS H;
    private final JL Pn;
    private final JL kl;
    private final JL Iu;
    private final Int2ObjectMap pn;
    private long i;
    private Object S;
    public static final int p;

    public trails() {
        super("trails", "Trails", AJ.WORLD);
        AJ var1 = AJ.WORLD;

        Qq var2 = Qq.FADED;
        r_2 var3 = new r_2("style", "Style", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.l = var5;
        Uq var6 = new Uq("length", "Length", 20.0F, 2.0F, 30.0F);
        Uq var7 = var6.W(1.0F);
        Uq var8 = var7.L(" ticks");
        xB var9 = this.vn(var8);
        Uq var10 = (Uq)var9;
        this.c = var10;
        Uq var11 = new Uq("height", "Height", 1.0F, 0.1F, 1.0F);
        Uq var12 = var11.W(0.05F);
        Uq var13 = var12.L("x");
        xB var14 = this.vn(var13);
        Uq var15 = (Uq)var14;
        this.n = var15;
        Uq var16 = new Uq("edge", "Edge Opacity", 0.35F, 0.1F, 1.0F);
        Uq var17 = var16.W(0.05F);
        BooleanSupplier var48 = () -> {
            int var1x = p;
            var1x ^= 1963698073;
            int var2x = System.identityHashCode(this);
            long var21x = var2x;
            long var4x = var21x + 1L;
            var4x = var21x * var4x;
            long var6x = var21x + 2L;
            var4x *= var6x;
            long var22x = var21x + 3L;
            var4x *= var22x;
            long var23x = var4x & 7L;
            long var34x;
            var2x = (var34x = var23x - 0L) == 0L ? 0 : (var34x < 0L ? -1 : 1);
            if (var2x == 0) {
                var1x += 1688327881;
                var1x -= -1364267230;
                var1x &= -2031927103;
                var1x ^= 1084033922;
                r_2 var29x = this.l;
                Qq var30x = Qq.INVERT;
                return var29x.TJ(var30x);
            } else {
                var1x ^= 1201780590;
                var1x >>>= 12;
                var1x *= -862211159;
                var1x ^= 1699629891;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                int var3x = var1x + 2;
                var2x *= var3x;
                var1x += 3;
                var2x *= var1x;
                var1x = var2x & 7;
                if (var1x != 0) {
                    IllegalArgumentException var16x = new IllegalArgumentException();
                    throw var16x;
                } else {
                    IllegalStateException var15x = new IllegalStateException();
                    throw var15x;
                }
            }
        };
        xB var18 = var17.Pt(var48);
        Uq var19 = (Uq)var18;
        xB var20 = this.vn(var19);
        Uq var21 = (Uq)var20;
        this.Ax = var21;
        JL var22 = new JL("half", "Lower Half Only", false);
        xB var23 = this.vn(var22);
        JL var24 = (JL)var23;
        this.CF = var24;
        Uq var25 = new Uq("opacity", "Opacity", 0.8F, 0.1F, 1.0F);
        Uq var26 = var25.W(0.05F);
        xB var27 = this.vn(var26);
        Uq var28 = (Uq)var27;
        this.Lx = var28;
        Uq var29 = new Uq("glow", "Glow", 0.4F, 0.0F, 1.0F);
        Uq var30 = var29.W(0.05F);
        xB var31 = this.vn(var30);
        Uq var32 = (Uq)var31;
        this.X = var32;
        Ry var49 = Ry.GRADIENT;
        zS var33 = new zS(var49, -11559425, -5870593);
        nM var34 = this.bU(var33);
        zS var35 = (zS)var34;
        this.H = var35;
        JL var36 = new JL("first_person", "In First Person", false);
        xB var37 = this.vn(var36);
        JL var38 = (JL)var37;
        this.Pn = var38;
        JL var39 = new JL("players", "Other Players", false);
        xB var40 = this.vn(var39);
        JL var41 = (JL)var40;
        this.kl = var41;
        JL var42 = new JL("gliders", "Elytra Fliers", true);
        xB var43 = this.vn(var42);
        JL var44 = (JL)var43;
        this.Iu = var44;
        Int2ObjectOpenHashMap var45 = new Int2ObjectOpenHashMap();
        this.pn = var45;
        this.dy("A fading ribbon of light behind you as you move.");
        wD<sE> var46 = (sE var1x) -> {
            int var2x = p;
            var2x ^= 1977181550;
            int var3x = System.identityHashCode(this);
            int var4x = var3x + 1;
            var4x = var3x * var4x;
            var3x = var4x & 1;
            if (var3x == 0) {
                var2x >>>= 27;
                var2x >>= 28;
                var2x >>= 28;
                var2x &= 1497794920;
                var2x ^= -353459755;
                long var20x = var2x;
                long var5x = var20x + 1L;
                var5x = var20x * var5x;
                long var21x = var5x & 1L;
                long var29x;
                var3x = (var29x = var21x - 0L) == 0L ? 0 : (var29x < 0L ? -1 : 1);
                if (var3x != 0) {
                    AssertionError var26x = new AssertionError();
                    throw var26x;
                } else {
                    var3x = var2x >> 16;
                    var3x &= 894402077;
                    var3x ^= -1050176873;
                    this.R(var3x);
                }
            } else {
                var2x &= 486179991;
                var2x ^= 1227579464;
                var2x -= -14362748;
                var2x &= 1373798381;
                var2x ^= 634591366;
                UnsupportedOperationException var13x = new UnsupportedOperationException();
                throw var13x;
            }
        };
        this.iI(sE.class, var46);
        wD<T> var47 = this::M;
        this.iI(T.class, var47);
    }

    @Override
    protected void J() {
        int var1 = p;
        var1 ^= 1087926293;
        int var2 = System.identityHashCode(this);
        Int2ObjectMap var3 = this.pn;
        Integer var15 = var2;
        if (var15 == null) {
            switch (var1) {
                case -2003403218:
                    var1 ^= 480716996;
                    break;
                case -88098496:
                    var1 >>= 18;
                    var1 >>= 14;
                    var1 >>>= 17;
                    var1 |= -1060150321;
                    var1 ^= 332630144;
                    break;
                case 810208504:
                default:
                    var1 ^= 1907474686;
            }

            IllegalStateException var16 = new IllegalStateException();
            throw var16;
        } else {
            var1 *= 1745269937;
            var1 += -1267208893;
            var1 ^= -1857442616;
            var3.clear();
            this.S = null;
        }
    }

    private boolean At(Entity var1, Entity var2, int var3) {
        boolean var89 = false;
        label158: {
            int var5 = System.identityHashCode(this);
            int var6 = var1.isInvisible() ? 1 : 0;
            Integer var7 = var5;
            int var41;
            if (var7 == null) {
                var41 = var3 * -1851238279;
                var41 |= 16751614;
                var41 ^= -967314277;
            } else {
                var41 = var3 ^ -1995078113;
                var41 -= -374678107;
                var41 ^= -1841983517;
                var41 ^= -544394326;
                var7 = var41;
                if (var7 == null) {
                    break label158;
                }

                if (var6 != 0) {
                    var41 += -955955048;
                    var41 |= 668168867;
                    var41 ^= -948190607;
                    return false;
                }

                var41 <<= 23;
                var41 ^= -2042956574;
                if (var1 == var2) {
                    var41 &= 1023019063;
                    var41 *= -814073851;
                    var41 &= 1789503837;
                    var41 ^= 2004942387;
                    return true;
                }
                var41 = switch (var41) {
                    case 490403042 -> {
                        var41 -= -1363405329;
                        var41 |= 1447058564;
                        var41 |= 315154520;
                        var41 |= -2055189261;
                        yield var41 ^ 1367501495;
                    }
                    case 637146946 -> var41 ^ 17350409;
                    default -> var41 ^ -1903547799;
                };
                var6 = var41 + 1;
                var6 = var41 * var6;
                int var113 = var41 + 2;
                var6 *= var113;
                var113 = var41 + 3;
                var6 *= var113;
                var6 &= 7;
                if (var6 != 0) {
                    break label158;
                }

                  int var97 = i_2.Jr(var1) ? 1 : 0;
                long var115 = var5;
                long var9 = var115 + 1L;
                var9 = var115 * var9;
                long var116 = var9 & 1L;
                long var136;
                var113 = (var136 = var116 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                if (var113 != 0) {
                    var41 >>= 5;
                    var41 += -899846240;
                    var41 |= -1250764136;
                    var41 ^= -1017383490;
                } else {
                    label156: {
                        var41 *= -418036827;
                        var41 >>>= 16;
                        var41 ^= 1930717997;
                        if (var97 != 0) {
                            var41 = switch (var41) {
                                case -1219862194 -> var41 ^ 1893426733;
                                default -> var41 ^ -1028616999;
                                case 1930713135 -> {
                                    var41 |= -762950268;
                                    var41 += -258612856;
                                    yield var41 ^ 1499390890;
                                }
                            };
                            JL var98 = this.kl;
                              var97 = var98.vb() ? 1 : 0;
                            Integer var118 = var5;
                            if (var118 == null) {
                                var41 -= -1787822566;
                                var41 |= -1275533081;
                                var41 ^= -1890396797;
                                break label156;
                            }

                            var41 -= 457996839;
                            var41 ^= 1666721896;
                            if (var97 != 0) {
                                var41 ^= -358135629;
                                var41 += -1896133828;
                                var41 += 1544521776;
                                var41 -= 464632964;
                                var41 ^= -222966139;
                                return true;
                            }

                            switch (var41) {
                                case -1090239383:
                                    var41 ^= -766627961;
                                    break;
                                case -1048688098:
                                    var41 &= 913476326;
                                    var41 *= -289370137;
                                    var41 ^= -303090601;
                                    break;
                                case -179213420:
                                default:
                                    var41 ^= -797209911;
                            }
                        } else {
                            switch (var41) {
                                case -776413495:
                                    var41 ^= 1944649609;
                                    break;
                                case -107068430:
                                default:
                                    var41 ^= -234080772;
                                    break;
                                case 1930713135:
                                    var41 -= -1105071510;
                                    var41 *= 980146971;
                                    var41 >>= 15;
                                    var41 *= -1810577773;
                                    var41 ^= 1886268567;
                            }
                        }

                        var97 = var41 + 1;
                        var97 = var41 * var97;
                        var97 &= 1;
                        if (var97 != 0) {
                            break label158;
                        }

                        JL var103 = this.Iu;
                        int var104 = (var103.vb()) ? 1 : 0;
                        long var119 = var5;
                        var9 = var119 + 1L;
                        var9 = var119 * var9;
                        long var120 = var9 & 1L;
                        long var137;
                        var113 = (var137 = var120 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                        if (var113 != 0) {
                            var41 += 1758252063;
                            var41 *= 2028356835;
                            var41 ^= 552227824;
                        } else {
                            label171: {
                                var41 &= 1635582875;
                                var41 >>>= 6;
                                var41 += -1475511422;
                                var41 ^= 906692886;
                                var113 = var41 + 1;
                                var113 = var41 * var113;
                                var113 &= 1;
                                if (var113 != 0) {
                                    break label158;
                                }

                                label153: {
                                    if (var104 != 0) {
                                        var41 ^= 125502386;
                                        var41 += -1646733429;
                                        var41 *= -448527341;
                                        var41 ^= 1240585103;
                                        var104 = var41 + 1;
                                        var104 = var41 * var104;
                                        var104 &= 1;
                                        if (var104 != 0) {
                                            break label158;
                                        }

                                        boolean var108 = i_2.x(var1);
                                        Integer var87 = var5;
                                        if (var87 == null) {
                                            var41 |= 1959744428;
                                            var41 ^= 1249369240;
                                            break label171;
                                        }
                                        var41 = switch (var41) {
                                            case 245344088 -> {
                                                var41 |= 38828463;
                                                var41 >>= 29;
                                                var41 ^= -1996072526;
                                                yield var41 ^ 162625930;
                                            }
                                            default -> var41 ^ 2023771968;
                                            case 1355859268 -> var41 ^ -929871760;
                                        };
                                        long var125 = var41;
                                        var9 = var125 + 1L;
                                        var9 = var125 * var9;
                                        long var11 = var125 + 2L;
                                        var9 *= var11;
                                        long var126 = var125 + 3L;
                                        var9 *= var126;
                                        long var127 = var9 & 7L;
                                        long var138;
                                        int var88 = (var138 = var127 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                                        if (var88 != 0) {
                                            break label158;
                                        }

                                        if (var108) {
                                            var41 ^= -183905037;
                                            var41 ^= -859053228;
                                            var89 = true;
                                            switch (var41) {
                                                case -1630470276:
                                                    var41 ^= -873702978;
                                                    break label153;
                                                case -1183508577:
                                                    var41 += -461137994;
                                                    var41 >>>= 25;
                                                    var41 ^= -2023323537;
                                                    break label153;
                                                case -394359524:
                                                default:
                                                    var41 ^= 1741546535;
                                                    break label153;
                                            }
                                        }

                                        var41 += -1317977827;
                                        var41 |= -276205666;
                                        var41 <<= 25;
                                        var41 &= -1813877382;
                                        var41 ^= 370485700;
                                    } else {
                                        var41 >>= 17;
                                        var41 ^= 2078991942;
                                    }

                                    Integer var109 = var41;
                                    if (var109 == null) {
                                        break label158;
                                    }

                                    var89 = false;
                                    var41 >>>= 14;
                                    var41 ^= -2023450507;
                                }

                                long var110 = var41;
                                long var8 = var110 + 1L;
                                var8 = var110 * var8;
                                long var111 = var8 & 1L;
                                long var139;
                                var41 = (var139 = var111 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                                if (var41 == 0) {
                                    return var89;
                                }
                                break label158;
                            }
                        }
                    }
                }
            }

            Integer var90 = var41;
            if (var90 != null) {
                RuntimeException var91 = new RuntimeException();
                throw var91;
            }
        }

        RuntimeException var86 = new RuntimeException();
        throw var86;
    }

    private void R(int var1) {
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
        long var363;
        int var196 = (var363 = var5 - 0L) == 0L ? 0 : (var363 < 0L ? -1 : 1);
        label241:
        if (var196 == 0) {
            int var20 = switch (var1) {
                case -198641509 -> {
                    int var21 = var1 - 638673441;
                    var21 &= -606103262;
                    yield var21 ^ 531775819;
                }
                case 930373803 -> var1 ^ 1272932367;
                default -> var1 ^ 242879850;
            };
            var4 = var4;
            if (var4 == null) {
                var20 += -1363082517;
                var20 ^= 1080101857;
                Integer var225 = var20;
                if (var225 != null) {
                    return;
                }
            } else {
                var20 = switch (var20) {
                    case -791739097 -> var20 ^ -177767749;
                    case -710553239 -> {
                        var20 *= -2013284699;
                        var20 += -187086853;
                        var20 &= 667111477;
                        var20 &= 1364845473;
                        yield var20 ^ 276448204;
                    }
                    default -> var20 ^ -1786116416;
                };
                int var197 = var20 + 1;
                int var198 = var20 * var197;
                int var6 = var20 + 2;
                int var199 = var198 * var6;
                var6 = var20 + 3;
                int var200 = var199 * var6;
                int var201 = var200 & 7;
                if (var201 == 0) {
                    Object var202 = this.S;
                    World var227 = var4.getEntityWorld();
                    var7 = var3;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var364;
                    int var252 = (var364 = var7 - 0L) == 0L ? 0 : (var364 < 0L ? -1 : 1);
                    if (var252 != 0) {
                        var20 *= -1082703723;
                        var20 ^= 562045022;
                        break label241;
                    }

                    var20 *= 492861391;
                    var20 &= -28126901;
                    var20 ^= -678457322;
                    int var253 = var20 + 1;
                    int var254 = var20 * var253;
                    int var8 = var20 + 2;
                    int var255 = var254 * var8;
                    var8 = var20 + 3;
                    int var256 = var255 * var8;
                    int var257 = var256 & 7;
                    label213:
                    if (var257 == 0) {
                        if (var202 != var227) {
                            var20 = switch (var20) {
                                case -589039075 -> var20 ^ 40925652;
                                default -> var20 ^ 1974809455;
                                case -371375786 -> {
                                    var20 += 1200599286;
                                    var20 ^= 548602706;
                                    var20 <<= 30;
                                    var20 &= -1930780824;
                                    yield var20 ^ 848443937;
                                }
                            };
                            Int2ObjectMap var203 = this.pn;
                            var203.clear();
                            World var204 = var4.getEntityWorld();
                            var6 = var3 + 1;
                            var6 = var3 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                var20 *= 30256915;
                                var20 *= 1328954819;
                                var20 += 1782302520;
                                var20 &= 1403235656;
                                var20 ^= -544192446;
                                break label241;
                            }

                            var20 -= 235155331;
                            var20 &= 384814636;
                            var20 -= 1670029148;
                            var20 *= -483334843;
                            var20 ^= -1841790210;
                            Integer var231 = var20;
                            if (var231 == null) {
                                break label213;
                            }

                            this.S = var204;
                            var20 &= -551282903;
                            var20 ^= -18647720;
                        } else {
                            var20 *= -1194376453;
                            var20 *= -278874977;
                            var20 ^= -399894082;
                        }

                        var5 = this.i;
                        this.i = ++var5;
                        Uq var207 = this.c;
                          int var208 = var207.B();
                        long var232 = var3;
                        long var269 = var232 + 1L;
                        long var270 = var232 * var269;
                        long var10 = var232 + 2L;
                        long var271 = var270 * var10;
                        long var233 = var232 + 3L;
                        long var272 = var271 * var233;
                        long var234 = var272 & 7L;
                        long var365;
                        var6 = (var365 = var234 - 0L) == 0L ? 0 : (var365 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            var20 >>= 5;
                            var20 >>= 12;
                            var20 += 228172020;
                            var20 *= -763666125;
                            var20 ^= 1099359853;
                            break label241;
                        }

                        var20 += -2129083145;
                        var20 ^= -1757054100;
                        var20 >>>= 26;
                        var20 ^= -377928709;
                        int var209 = var208;
                        Iterable var236 = i_2.S();
                        Iterator var237 = var236.iterator();
                        Iterator var238 = var237;

                        var20 = switch (var20) {
                            default -> var20 ^ 738163564;
                            case -377928764 -> {
                                var20 >>= 17;
                                var20 >>= 5;
                                var20 &= -204904540;
                                yield var20 ^ 1101807452;
                            }
                            case 1821827559 -> var20 ^ 2059228437;
                        };

                        label237:
                        while (true) {
                            boolean var258 = var238.hasNext();
                            long var273 = var3;
                            var10 = var273 + 1L;
                            var10 = var273 * var10;
                            long var12 = var273 + 2L;
                            var10 *= var12;
                            long var274 = var273 + 3L;
                            var10 *= var274;
                            long var275 = var10 & 7L;
                            long var366;
                            var8 = (var366 = var275 - 0L) == 0L ? 0 : (var366 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                var20 &= 1761627496;
                                var20 &= 664838465;
                                var20 >>>= 10;
                                var20 ^= -549754878;
                                break label241;
                            }

                            var20 |= 1586963732;
                            var20 ^= 74086671;
                            var20 ^= 146041702;
                            Integer var277 = var20;
                            if (var277 == null) {
                                break;
                            }

                            if (!var258) {
                                var20 ^= 1225621991;
                                var20 ^= -1732968450;
                                int var185 = var20 + 1;
                                int var186 = var20 * var185;
                                int var210 = var20 + 2;
                                int var187 = var186 * var210;
                                int var211 = var20 + 3;
                                int var188 = var187 * var211;
                                int var189 = var188 & 7;
                                if (var189 == 0) {
                                    Int2ObjectMap var190 = this.pn;
                                    Integer var212 = var3;
                                    if (var212 == null) {
                                        var20 -= -998285280;
                                        var20 ^= -2145134226;
                                        break label241;
                                    }

                                    var20 += -485987835;
                                    var20 ^= 2072212451;
                                    var5 = var20;
                                    var7 = var5 + 1L;
                                    var7 = var5 * var7;
                                    var5 = var7 & 1L;
                                    long var367;
                                    int var215 = (var367 = var5 - 0L) == 0L ? 0 : (var367 < 0L ? -1 : 1);
                                    if (var215 == 0) {
                                        ObjectCollection var191 = var190.values();
                                        ObjectIterator var192 = var191.iterator();
                                        ObjectIterator var193 = var192;
                                        var20 -= 629113532;
                                        var20 ^= -436276218;
                                        var20 ^= -164843054;

                                        while (true) {
                                            int var216 = var20 + 1;
                                            int var217 = var20 * var216;
                                            int var218 = var217 & 1;
                                            if (var218 != 0) {
                                                break label237;
                                            }

                                            boolean var219 = var193.hasNext();
                                            Integer var239 = var3;
                                            if (var239 == null) {
                                                var20 >>>= 18;
                                                var20 -= -345740539;
                                                var20 |= -2114675550;
                                                var20 ^= 1254938285;
                                                break label241;
                                            }

                                            var20 -= -856739175;
                                            var20 += -710862091;
                                            var20 ^= 11157605;
                                            long var240 = var20;
                                            long var302 = var240 + 1L;
                                            long var303 = var240 * var302;
                                            var10 = var240 + 2L;
                                            long var304 = var303 * var10;
                                            long var241 = var240 + 3L;
                                            long var305 = var304 * var241;
                                            long var242 = var305 & 7L;
                                            long var368;
                                            int var243 = (var368 = var242 - 0L) == 0L ? 0 : (var368 < 0L ? -1 : 1);
                                            if (var243 != 0) {
                                                break label237;
                                            }

                                            if (!var219) {
                                                switch (var20) {
                                                    case -1196889648:
                                                        var20 ^= 986718302;
                                                        break;
                                                    case 1209518023:
                                                    default:
                                                        var20 ^= -1245778303;
                                                        break;
                                                    case 1280436443:
                                                        var20 ^= 1105450346;
                                                        var20 |= 916436232;
                                                        var20 &= 330723449;
                                                        var20 *= 1017032935;
                                                        var20 ^= -400335634;
                                                }

                                                return;
                                            }

                                            var20 >>= 23;
                                            var20 *= 1815665597;
                                            var20 ^= -463956456;
                                            Object var220 = var193.next();
                                            CT var221 = (CT)var220;
                                            var5 = var221.b;
                                            var7 = this.i;
                                            long var369;
                                            int var223 = (var369 = var5 - var7) == 0L ? 0 : (var369 < 0L ? -1 : 1);
                                            Integer var244 = var3;
                                            if (var244 == null) {
                                                var20 &= -1712746327;
                                                var20 <<= 26;
                                                var20 ^= 147408755;
                                                var20 -= 1726498317;
                                                var20 ^= -19764892;
                                                break label241;
                                            }

                                            var20 <<= 24;
                                            var20 ^= -696998495;
                                            var244 = var20;
                                            if (var244 == null) {
                                                break label237;
                                            }

                                            if (var223 != 0) {
                                                var20 |= -1538890349;
                                                var20 -= 1241900412;
                                                var20 += -820129407;
                                                var20 >>= 2;
                                                var20 ^= 391335865;
                                                Integer var224 = var20;
                                                if (var224 == null) {
                                                    break label237;
                                                }

                                                var193.remove();
                                                switch (var20) {
                                                    case 162593751:
                                                        var20 >>= 8;
                                                        var20 &= -1225100084;
                                                        var20 ^= 1145172138;
                                                        break;
                                                    case 951874783:
                                                    default:
                                                        var20 ^= 745887052;
                                                        break;
                                                    case 987487227:
                                                        var20 ^= 1412550204;
                                                }
                                            } else {
                                                var20 -= 1004236776;
                                                var20 -= -127248155;
                                                var20 ^= -2040062794;
                                            }
                                        }
                                    }
                                }
                                break;
                            }

                            var20 *= -541716805;
                            var20 -= -1630720231;
                            var20 ^= -536926717;
                            var20 &= -688761851;
                            var20 ^= 754137452;
                            int var259 = var20 + 1;
                            int var260 = var20 * var259;
                            int var261 = var260 & 1;
                            if (var261 != 0) {
                                break;
                            }

                            Object var262 = var238.next();
                            Entity var263 = (Entity)var262;
                            long var278 = var3;
                            var10 = var278 + 1L;
                            var10 = var278 * var10;
                            var12 = var278 + 2L;
                            var10 *= var12;
                            long var279 = var278 + 3L;
                            var10 *= var279;
                            long var280 = var10 & 7L;
                            long var370;
                            int var281 = (var370 = var280 - 0L) == 0L ? 0 : (var370 < 0L ? -1 : 1);
                            if (var281 != 0) {
                                var20 >>>= 23;
                                var20 >>= 31;
                                var20 ^= -550279166;
                                break label241;
                            }

                            var20 >>>= 1;
                            var20 &= -1508114238;
                            var20 -= -931311003;
                            var20 ^= 1873869964;
                            var281 = var20 + 1;
                            var281 = var20 * var281;
                            int var310 = var20 + 2;
                            var281 *= var310;
                            int var311 = var20 + 3;
                            var281 *= var311;
                            var281 &= 7;
                            if (var281 != 0) {
                                break;
                            }

                            var281 = var20 + 510013760;
                            var281 &= 77414755;
                            var281 &= -1496553089;
                            var281 += -315913661;
                            var281 ^= -516814147;
                              int var292 = this.At(var263, var4, var281) ? 1 : 0;
                            if (var292 == 0) {
                                var20 &= -739493701;
                                var20 ^= -591960308;
                                switch (var20) {
                                    case -861964385:
                                        var20 |= -652484736;
                                        var20 ^= -513269705;
                                        var20 ^= -1902999728;
                                        break;
                                    case 216076316:
                                    default:
                                        var20 ^= -2080201811;
                                        break;
                                    case 391631533:
                                        var20 ^= 522730117;
                                }
                            } else {
                                var20 ^= -669031430;
                                var20 ^= -1179935203;
                                var20 ^= -389747725;
                                var292 = var20 + 1;
                                var292 = var20 * var292;
                                int var312 = var20 + 2;
                                var292 *= var312;
                                int var313 = var20 + 3;
                                var292 *= var313;
                                var292 &= 7;
                                if (var292 != 0) {
                                    break;
                                }

                                Int2ObjectMap var298 = this.pn;
                                var9 = var3;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                var9 = var11 & 1L;
                                long var371;
                                int var316 = (var371 = var9 - 0L) == 0L ? 0 : (var371 < 0L ? -1 : 1);
                                if (var316 != 0) {
                                    var20 <<= 23;
                                    var20 -= 127034592;
                                    var20 ^= 252315882;
                                    var20 |= 848879227;
                                    var20 ^= -372459527;
                                    break label241;
                                }
                                var20 = switch (var20) {
                                    default -> var20 ^ -318476142;
                                    case -1323805641 -> var20 ^ 1619415907;
                                    case -1118157693 -> {
                                        var20 <<= 2;
                                        var20 |= -1565631480;
                                        var20 += 225681224;
                                        var20 *= -2067974987;
                                        yield var20 ^ -307548336;
                                    }
                                };
                                int var317 = var263.getId();
                                Object var299 = var298.get(var317);
                                CT var300 = (CT)var299;
                                CT var320;
                                if (var300 == null) {
                                    var20 += -1601806841;
                                    var20 &= 2105997668;
                                    var20 += 1083199293;
                                    var20 >>>= 24;
                                    var20 ^= -1404739085;
                                    Int2ObjectMap var318 = this.pn;
                                    int var329 = var263.getId();
                                    int var337 = var3 + 1;
                                    int var338 = var3 * var337;
                                    int var339 = var338 & 1;
                                    if (var339 != 0) {
                                        var20 *= -1806954133;
                                        var20 *= 1036632819;
                                        var20 &= -875063227;
                                        var20 ^= -693047226;
                                        break label241;
                                    }

                                    var20 <<= 3;
                                    var20 >>= 22;
                                    var20 += 1402440135;
                                    var20 ^= -1379499110;
                                    var11 = var20;
                                    long var13 = var11 + 1L;
                                    var13 = var11 * var13;
                                    long var15 = var11 + 2L;
                                    var13 *= var15;
                                    var11 += 3L;
                                    var13 *= var11;
                                    var11 = var13 & 7L;
                                    long var372;
                                    int var343 = (var372 = var11 - 0L) == 0L ? 0 : (var372 < 0L ? -1 : 1);
                                    if (var343 != 0) {
                                        break;
                                    }

                                    CT var344 = new CT();
                                    Object var319 = var318.put(var329, var344);
                                    var320 = var344;
                                    var20 += 1293923891;
                                    var20 <<= 28;
                                    var20 |= 1617127571;
                                    var20 ^= 847564894;
                                } else {
                                    var20 -= -254965031;
                                    var20 += 1021463706;
                                    var20 ^= -2096995907;
                                    var20 >>>= 14;
                                    var20 ^= 990657870;
                                    var320 = var300;
                                    var20 += 1038871474;
                                    var20 ^= 639505567;
                                    var20 ^= -1946152352;
                                }

                                var10 = var20;
                                var12 = var10 + 1L;
                                var12 = var10 * var12;
                                var10 = var12 & 1L;
                                long var373;
                                var292 = (var373 = var10 - 0L) == 0L ? 0 : (var373 < 0L ? -1 : 1);
                                if (var292 != 0) {
                                    break;
                                }

                                var10 = this.i;
                                var320.b = var10;
                                double var333 = var263.getX();
                                double var348 = var263.getY();
                                double var264 = var263.getZ();
                                long var14 = var3;
                                long var16 = var14 + 1L;
                                var16 = var14 * var16;
                                var14 = var16 & 1L;
                                long var374;
                                int var353 = (var374 = var14 - 0L) == 0L ? 0 : (var374 < 0L ? -1 : 1);
                                if (var353 != 0) {
                                    var20 |= -683479704;
                                    var20 *= 1188497427;
                                    var20 &= -101429107;
                                    var20 |= -462831206;
                                    var20 ^= 726313373;
                                    break label241;
                                }

                                var20 &= -1688708750;
                                var20 >>= 3;
                                var20 &= 1007850235;
                                var20 >>>= 4;
                                var20 ^= 1694591163;
                                int var354 = var20 + 1;
                                int var355 = var20 * var354;
                                int var360 = var20 + 2;
                                int var356 = var355 * var360;
                                var360 = var20 + 3;
                                int var357 = var356 * var360;
                                int var358 = var357 & 7;
                                if (var358 != 0) {
                                    break;
                                }

                                var14 = this.i;
                                var320.l(var333, var348, var264, var14, var209);
                                var20 &= 18829358;
                                var20 += -708082953;
                                var20 &= -43900580;
                                var20 ^= 1730501112;
                            }
                        }
                    }
                }
            }

            IllegalArgumentException var183 = new IllegalArgumentException();
            throw var183;
        } else {
            int var2 = var1 ^ -1348535091;
            var2 >>>= 18;
            var2 ^= -550273297;
        }

        AssertionError var180 = new AssertionError();
        throw var180;
    }

    private void M(T var1) {
        double var532 = 0.0;
        label580: {
            int var2 = p;
            var2 ^= -122660065;
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
                var2 -= -1968182206;
                var2 >>>= 6;
                var2 |= -823080067;
                var2 ^= 1717975155;
            } else {
                label593: {
                    var2 = switch (var2) {
                        default -> var2 ^ 421083213;
                        case 1121423946 -> {
                            var2 *= -360571593;
                            var2 *= -191712103;
                            yield var2 ^ 1052673920;
                        }
                        case 1614599920 -> var2 ^ -1320046981;
                    };
                    RenderPhase var488 = RenderPhase.WORLD;
                    if (var4 == var488) {
                        var2 &= 880189855;
                        var2 *= -1090457549;
                        var2 ^= 274553256;
                        Int2ObjectMap var477 = this.pn;
                        boolean var478 = var477.isEmpty();
                        Integer var489 = var3;
                        if (var489 == null) {
                            var2 &= -1264357849;
                            var2 &= 973752794;
                            var2 &= 2055968457;
                            var2 ^= -7380988;
                            var2 ^= 1729857418;
                            break label593;
                        }

                        var2 |= -854295908;
                        var2 += -1697692586;
                        var2 ^= -2145449635;
                        var2 ^= -644740242;
                        if (!var478) {
                            var2 |= 1238854693;
                            var2 ^= -703136492;
                            long var479 = var2;
                            long var507 = var479 + 1L;
                            long var508 = var479 * var507;
                            long var480 = var508 & 1L;
                            long var916;
                            int var481 = (var916 = var480 - 0L) == 0L ? 0 : (var916 < 0L ? -1 : 1);
                            if (var481 != 0) {
                                break label580;
                            }

                            Entity var482 = i_2.QI();
                            Entity var483 = var482;
                            var489 = var3;
                            if (var489 == null) {
                                switch (var2) {
                                    case -731540793:
                                        var2 ^= 1959034393;
                                        break label593;
                                    case -103756064:
                                    default:
                                        var2 ^= -611963123;
                                        break label593;
                                    case 533271347:
                                        var2 >>= 28;
                                        var2 += 1094760208;
                                        var2 |= -1475607747;
                                        var2 ^= 1104826547;
                                        break label593;
                                }
                            }

                            var2 &= 1118763549;
                            var2 -= 937215161;
                            var2 -= 1424441157;
                            var2 ^= 1051976500;
                            var2 ^= 748557952;
                            long var491 = var2;
                            long var7 = var491 + 1L;
                            var7 = var491 * var7;
                            long var492 = var7 & 1L;
                            long var917;
                            int var493 = (var917 = var492 - 0L) == 0L ? 0 : (var917 < 0L ? -1 : 1);
                            if (var493 != 0) {
                                break label580;
                            }

                            if (var482 != null) {
                                var2 = switch (var2) {
                                    default -> var2 ^ 241894753;
                                    case 1743387559 -> {
                                        var2 >>>= 9;
                                        var2 >>= 10;
                                        var2 *= 1958429865;
                                        var2 *= 517598937;
                                        yield var2 ^ 775632864;
                                    }
                                    case 1864343000 -> var2 ^ 2055685857;
                                };
                                var493 = var2 + 1;
                                var493 = var2 * var493;
                                var6 = var2 + 2;
                                var493 *= var6;
                                var6 = var2 + 3;
                                var493 *= var6;
                                var493 &= 7;
                                if (var493 != 0) {
                                    break label580;
                                }

                                Object var499 = this.S;
                                long var511 = var3;
                                long var8 = var511 + 1L;
                                var8 = var511 * var8;
                                long var512 = var8 & 1L;
                                long var918;
                                var6 = (var918 = var512 - 0L) == 0L ? 0 : (var918 < 0L ? -1 : 1);
                                if (var6 != 0) {
                                    var2 -= 1754802737;
                                    var2 ^= -7101662;
                                    break label593;
                                }

                                var2 >>>= 27;
                                var2 -= 488022173;
                                var2 += 958957003;
                                var2 ^= -34463075;
                                long var514 = var2;
                                var8 = var514 + 1L;
                                var8 = var514 * var8;
                                long var515 = var8 & 1L;
                                long var919;
                                var6 = (var919 = var515 - 0L) == 0L ? 0 : (var919 < 0L ? -1 : 1);
                                if (var6 != 0) {
                                    break label580;
                                }

                                World var517 = var482.getEntityWorld();
                                if ((Object)var499 == var517) {
                                    var2 = switch (var2) {
                                        case -2070240113 -> var2 ^ 1144078462;
                                        case -505165864 -> {
                                            var2 ^= 2012834249;
                                            var2 += 27683702;
                                            var2 >>= 18;
                                            var2 &= -2057681006;
                                            yield var2 ^ -1859796859;
                                        }
                                        default -> var2 ^ -465795196;
                                    };
                                    Canvas var500 = var1.canvas();
                                    Canvas var501 = var500;
                                    Ud var518 = Ud.Z();
                                    AuraPipeline var519 = var518.Ul();
                                    WorldDraw var520 = var519.world();
                                    WorldDraw var521 = var520;
                                    FrameContext var523 = var1.frame();
                                    float var524 = var523.partialTick();
                                    float var525 = var524;
                                    FrameContext var530 = var1.frame();
                                    Integer var9 = var3;
                                    if (var9 == null) {
                                        switch (var2) {
                                            case -1118970445:
                                                var2 ^= 1965955790;
                                                break label593;
                                            case 237032408:
                                            default:
                                                var2 ^= -1078977222;
                                                break label593;
                                            case 343901461:
                                                var2 <<= 20;
                                                var2 += -259708299;
                                                var2 >>>= 22;
                                                var2 += -1714584269;
                                                var2 ^= 828072372;
                                        }
                                    } else {
                                        var2 |= 1015488770;
                                        var2 += -688786949;
                                        var2 += 244639567;
                                        var2 ^= -1103866318;
                                        var2 ^= 1347706901;
                                        int var533 = var2 + 1;
                                        var533 = var2 * var533;
                                        var533 &= 1;
                                        if (var533 != 0) {
                                            break label580;
                                        }

                                        float var14;
                                        float var537;
                                        float var539;
                                        boolean var546;
                                        float var551;
                                        double var531 = var530.time();
                                        var532 = var531;
                                        Uq var10 = this.c;
                                        var537 = var10.WM();
                                        var537 = var537;
                                        Uq var11 = this.Ax;
                                        var539 = var11.WM();
                                        JL var12 = this.CF;
                                        var546 = var12.vb();
                                        var546 = var546;
                                        r_2 var13 = this.l;
                                        Enum var548 = var13.A();
                                        Qq var549 = (Qq)var548;
                                        int var550 = var549.ordinal();
                                        label526:
                                        switch (var550) {
                                            case 0:
                                                var2 >>= 23;
                                                var2 *= -1170293617;
                                                var2 *= -1152623395;
                                                var2 ^= 657271443;
                                                float var590 = 1.0F;
                                                Integer var598 = var3;
                                                if (var598 == null) {
                                                    var2 &= -767454667;
                                                    var2 -= 2042454118;
                                                    var2 ^= 1611843124;
                                                    break label593;
                                                }

                                                var2 &= -2096837726;
                                                var2 |= 2145591288;
                                                var2 &= 723584985;
                                                var2 &= 1214070060;
                                                var2 ^= -1974330612;
                                                int var599 = var2 + 1;
                                                var599 = var2 * var599;
                                                int var609 = var2 + 2;
                                                var599 *= var609;
                                                var609 = var2 + 3;
                                                var599 *= var609;
                                                var599 &= 7;
                                                if (var599 != 0) {
                                                    break label580;
                                                }

                                                float var604 = 0.0F;
                                                float var611 = 1.0F;
                                                var551 = var590;
                                                var14 = var604;
                                                var539 = var611;
                                                switch (var2) {
                                                    case -2108482044:
                                                        var2 >>>= 16;
                                                        var2 += -1174970537;
                                                        var2 ^= 469554322;
                                                        break label526;
                                                    case -1697873896:
                                                    default:
                                                        var2 ^= 2086167991;
                                                        break label526;
                                                    case -1371745553:
                                                        var2 ^= 466037869;
                                                        break label526;
                                                }
                                            case 2:
                                                var2 -= 884726524;
                                                var2 *= 1862060915;
                                                var2 >>= 30;
                                                var2 -= 1630044724;
                                                var2 ^= 1535891470;
                                                long var552 = var2;
                                                long var583 = var552 + 1L;
                                                var583 = var552 * var583;
                                                long var608 = var552 + 2L;
                                                var583 *= var608;
                                                long var553 = var552 + 3L;
                                                var583 *= var553;
                                                long var554 = var583 & 7L;
                                                long var920;
                                                int var555 = (var920 = var554 - 0L) == 0L ? 0 : (var920 < 0L ? -1 : 1);
                                                if (var555 != 0) {
                                                    break label580;
                                                }

                                                var14 = 1.0F;
                                                int var587 = var3 + 1;
                                                int var588 = var3 * var587;
                                                int var589 = var588 & 1;
                                                if (var589 != 0) {
                                                    var2 ^= -1316010557;
                                                    var2 ^= -599455858;
                                                    break label593;
                                                }

                                                var2 += 1853768406;
                                                var2 ^= 365106456;
                                                var2 |= -1489637868;
                                                var2 <<= 11;
                                                var2 ^= -812822992;
                                                var551 = var539;
                                                var14 = var14;
                                                var539 = var539;
                                                var2 &= 1268691885;
                                                var2 -= 888552740;
                                                var2 ^= 1762742724;
                                                break;
                                            default:
                                                var2 |= 1101404015;
                                                var2 *= -1468780547;
                                                var2 &= 738338828;
                                                var2 ^= -581114848;
                                                Integer var15 = var2;
                                                if (var15 == null) {
                                                    break label580;
                                                }

                                                float var580 = 1.0F;
                                                float var16 = 1.0F;
                                                float var17 = 1.0F;
                                                var551 = var580;
                                                long var18 = var3;
                                                long var20 = var18 + 1L;
                                                var20 = var18 * var20;
                                                long var22 = var18 + 2L;
                                                var20 *= var22;
                                                var18 += 3L;
                                                var20 *= var18;
                                                var18 = var20 & 7L;
                                                long var921;
                                                int var581 = (var921 = var18 - 0L) == 0L ? 0 : (var921 < 0L ? -1 : 1);
                                                if (var581 != 0) {
                                                    switch (var2) {
                                                        case -1676792352:
                                                        default:
                                                            var2 ^= -1484574731;
                                                            break label593;
                                                        case -782449632:
                                                            var2 &= -51015895;
                                                            var2 += 1786780438;
                                                            var2 &= 686154990;
                                                            var2 *= 270799053;
                                                            var2 ^= 1248777696;
                                                            break label593;
                                                        case -60693660:
                                                            var2 ^= -512437889;
                                                            break label593;
                                                    }
                                                }

                                                var2 *= 1706709463;
                                                var2 *= -1674627597;
                                                var2 ^= -1196515388;
                                                Integer var582 = var2;
                                                if (var582 == null) {
                                                    break label580;
                                                }

                                                var14 = var16;
                                                var539 = var17;
                                                var2 += -1496165126;
                                                var2 -= 1899676020;
                                                var2 |= 1709146271;
                                                var2 *= 735025729;
                                                var2 ^= -1242384505;
                                        }

                                        int var591 = var2 + 1;
                                        var591 = var2 * var591;
                                        var591 &= 1;
                                        if (var591 != 0) {
                                            break label580;
                                        }

                                        float var597;
                                        float var607;
                                        if (var546) {
                                            var2 ^= -811759982;
                                            var2 |= 76831473;
                                            var2 |= -2012042662;
                                            var2 *= -1593643111;
                                            var2 ^= -1919047707;
                                            long var594 = var2;
                                            long var612 = var594 + 1L;
                                            var612 = var594 * var612;
                                            long var595 = var612 & 1L;
                                            long var922;
                                            var591 = (var922 = var595 - 0L) == 0L ? 0 : (var922 < 0L ? -1 : 1);
                                            if (var591 != 0) {
                                                break label580;
                                            }

                                            var607 = var551 + var14;
                                            var607 *= 0.5F;
                                            var607 = var607;
                                            var612 = var3;
                                            long var19 = var612 + 1L;
                                            var19 = var612 * var19;
                                            var612 = var19 & 1L;
                                            long var923;
                                            int var616 = (var923 = var612 - 0L) == 0L ? 0 : (var923 < 0L ? -1 : 1);
                                            if (var616 != 0) {
                                                var2 >>= 21;
                                                var2 *= 648550483;
                                                var2 ^= -607777349;
                                                break label593;
                                            }

                                            var2 &= 1264032331;
                                            var2 ^= -500914051;
                                            var2 *= 571334807;
                                            var2 &= -2020909599;
                                            var2 ^= -251801466;
                                            var597 = var14;
                                            var2 |= 118368364;
                                            var2 += -687339859;
                                            var2 ^= -543189770;
                                            var2 *= 1107309029;
                                            var2 ^= 631523517;
                                        } else {
                                            var2 |= 432362324;
                                            var2 &= 1728423390;
                                            var2 *= -918722523;
                                            var2 ^= 1964659891;
                                            long var617 = var2;
                                            long var654 = var617 + 1L;
                                            var654 = var617 * var654;
                                            var617 = var654 & 1L;
                                            long var924;
                                            int var619 = (var924 = var617 - 0L) == 0L ? 0 : (var924 < 0L ? -1 : 1);
                                            if (var619 != 0) {
                                                break label580;
                                            }

                                            var607 = var14;
                                            var617 = var3;
                                            var654 = var617 + 1L;
                                            var654 = var617 * var654;
                                            long var21 = var617 + 2L;
                                            var654 *= var21;
                                            var617 += 3L;
                                            var654 *= var617;
                                            var617 = var654 & 7L;
                                            long var925;
                                            int var557 = (var925 = var617 - 0L) == 0L ? 0 : (var925 < 0L ? -1 : 1);
                                            if (var557 != 0) {
                                                var2 >>= 2;
                                                var2 *= -1708071287;
                                                var2 |= 1137114410;
                                                var2 ^= -213902671;
                                                break label593;
                                            }

                                            var2 *= 587554663;
                                            var2 >>= 24;
                                            var2 -= 124911045;
                                            var2 &= 1830413972;
                                            var2 ^= 1234196774;
                                            var597 = var539;
                                            var2 >>= 24;
                                            var2 += -102632541;
                                            var2 &= -937146776;
                                            var2 ^= -1886856314;
                                            var2 ^= 1278519721;
                                        }

                                        Integer var540 = var2;
                                        if (var540 == null) {
                                            break label580;
                                        }

                                        var500.save();
                                        Uq var541 = this.X;
                                        var539 = var541.WM();
                                        var500.additive(var539);
                                        Iterable var543 = i_2.S();
                                        long var623 = var3;
                                        long var660 = var623 + 1L;
                                        var660 = var623 * var660;
                                        long var707 = var623 + 2L;
                                        var660 *= var707;
                                        var623 += 3L;
                                        var660 *= var623;
                                        var623 = var660 & 7L;
                                        long var926;
                                        int var558 = (var926 = var623 - 0L) == 0L ? 0 : (var926 < 0L ? -1 : 1);
                                        if (var558 == 0) {
                                            var2 += 2077934313;
                                            var2 >>= 30;
                                            var2 += 1533708152;
                                            var2 ^= 279375870;
                                            Iterator var544 = var543.iterator();
                                            Iterator var545 = var544;
                                            var2 |= 1610649702;
                                            var2 += 1422887091;
                                            var2 -= -1824397687;
                                            var2 |= 978764814;
                                            var2 ^= -315825026;

                                            while (true) {
                                                boolean var559 = var545.hasNext();
                                                Integer var626 = var3;
                                                if (var626 == null) {
                                                    var2 <<= 6;
                                                    var2 *= 1422541961;
                                                    var2 -= 106269035;
                                                    var2 ^= -1947539173;
                                                    break label593;
                                                }

                                                var2 >>>= 2;
                                                var2 |= -161421668;
                                                var2 |= 835221499;
                                                var2 ^= 1091755755;
                                                if (!var559) {
                                                    var2 -= -725987181;
                                                    var2 |= 1643298035;
                                                    var2 |= 396433170;
                                                    var2 ^= -690446800;
                                                    Integer var471 = var2;
                                                    if (var471 != null) {
                                                        var501.restore();
                                                        return;
                                                    }
                                                    break label580;
                                                }

                                                var2 += -357225587;
                                                var2 *= 993111241;
                                                var2 |= -1225850019;
                                                var2 -= -1246292696;
                                                var2 ^= 945693441;
                                                int var560 = var2 + 1;
                                                int var561 = var2 * var560;
                                                int var627 = var2 + 2;
                                                int var562 = var561 * var627;
                                                int var628 = var2 + 3;
                                                int var563 = var562 * var628;
                                                int var564 = var563 & 7;
                                                if (var564 != 0) {
                                                    break label580;
                                                }

                                                Object var565 = var545.next();
                                                Entity var566 = (Entity)var565;
                                                Int2ObjectMap var629 = this.pn;
                                                int var635 = var566.getId();
                                                var660 = var3;
                                                var707 = var660 + 1L;
                                                var707 = var660 * var707;
                                                long var23 = var660 + 2L;
                                                var707 *= var23;
                                                var660 += 3L;
                                                var707 *= var660;
                                                var660 = var707 & 7L;
                                                long var927;
                                                int var667 = (var927 = var660 - 0L) == 0L ? 0 : (var927 < 0L ? -1 : 1);
                                                if (var667 != 0) {
                                                    var2 ^= 1261984034;
                                                    var2 ^= -1698111496;
                                                    break label593;
                                                }

                                                var2 >>>= 26;
                                                var2 -= -2030420198;
                                                var2 += 1764068205;
                                                var2 ^= -738036648;
                                                Object var630 = var629.get(var635);
                                                CT var631 = (CT)var630;
                                                CT var632 = var631;
                                                if (var631 == null) {
                                                    var2 -= -1498565381;
                                                    var2 ^= 1560918094;
                                                } else {
                                                    var2 -= 1906834835;
                                                    var2 ^= 742066494;
                                                    var2 -= 1656836153;
                                                    var2 ^= 1028869794;
                                                    Integer var636 = var2;
                                                    if (var636 == null) {
                                                        break label580;
                                                    }

                                                    int var637 = var631.GY;
                                                    var660 = var3;
                                                    var707 = var660 + 1L;
                                                    var707 = var660 * var707;
                                                    var660 = var707 & 1L;
                                                    long var928;
                                                    int var670 = (var928 = var660 - 0L) == 0L ? 0 : (var928 < 0L ? -1 : 1);
                                                    if (var670 != 0) {
                                                        var2 |= 1911807066;
                                                        var2 += 1831545286;
                                                        var2 *= 1766143773;
                                                        var2 |= -1029571934;
                                                        var2 ^= 1601903933;
                                                        break label593;
                                                    }

                                                    var2 ^= 1575921516;
                                                    var2 -= -1431657803;
                                                    var2 ^= 1321191485;
                                                    var2 *= 308595665;
                                                    var2 ^= -1840057633;
                                                    if (var637 < 1) {
                                                        var2 >>= 12;
                                                        var2 &= 1887034968;
                                                        var2 |= -959831878;
                                                        var2 >>= 22;
                                                        var2 ^= 342167761;
                                                        Integer var652 = var2;
                                                        if (var652 == null) {
                                                            break label580;
                                                        }

                                                        switch (var2) {
                                                            case -739383821:
                                                            default:
                                                                var2 ^= 1355606552;
                                                                break;
                                                            case -342167798:
                                                                var2 &= -1746816864;
                                                                var2 |= 1973014706;
                                                                var2 *= -1657929519;
                                                                var2 ^= 93523135;
                                                                var2 ^= 1497937549;
                                                                break;
                                                            case 490506494:
                                                                var2 ^= 1425101949;
                                                        }
                                                    } else {
                                                        var2 ^= 203854414;
                                                        var2 -= 268530460;
                                                        var2 &= 2079040434;
                                                        var2 += -1634612932;
                                                        var2 ^= 150442885;
                                                        if (var566 == var483) {
                                                            var2 += -1170441400;
                                                            var2 -= 628488848;
                                                            var2 ^= -24678066;
                                                            int var638 = (i_2.ax()) ? 1 : 0;
                                                            var660 = var3;
                                                            var707 = var660 + 1L;
                                                            var707 = var660 * var707;
                                                            var23 = var660 + 2L;
                                                            var707 *= var23;
                                                            var660 += 3L;
                                                            var707 *= var660;
                                                            var660 = var707 & 7L;
                                                            long var929;
                                                            int var674 = (var929 = var660 - 0L) == 0L ? 0 : (var929 < 0L ? -1 : 1);
                                                            if (var674 != 0) {
                                                                switch (var2) {
                                                                    case 1352193469:
                                                                        var2 ^= -121179199;
                                                                        break label593;
                                                                    case 1477184463:
                                                                        var2 &= -1581788749;
                                                                        var2 |= 1385228083;
                                                                        var2 |= 1468661853;
                                                                        var2 ^= -16252815;
                                                                        break label593;
                                                                    case 1866099914:
                                                                    default:
                                                                        var2 ^= 1170541150;
                                                                        break label593;
                                                                }
                                                            }

                                                            var2 &= 230691234;
                                                            var2 <<= 19;
                                                            var2 &= -1436719244;
                                                            var2 ^= 1059369943;
                                                            int var675 = var2 + 1;
                                                            int var676 = var2 * var675;
                                                            int var677 = var676 & 1;
                                                            if (var677 != 0) {
                                                                break label580;
                                                            }

                                                            if (var638 != 0) {
                                                                var2 >>>= 30;
                                                                var2 &= -522627869;
                                                                var2 *= 2004182399;
                                                                var2 >>= 17;
                                                                var2 ^= 3359908;
                                                                long var639 = var2;
                                                                long var697 = var639 + 1L;
                                                                var697 = var639 * var697;
                                                                long var640 = var697 & 1L;
                                                                long var930;
                                                                var638 = (var930 = var640 - 0L) == 0L ? 0 : (var930 < 0L ? -1 : 1);
                                                                if (var638 != 0) {
                                                                    break label580;
                                                                }

                                                                JL var642 = this.Pn;
                                                                int var678 = var3 + 1;
                                                                int var679 = var3 * var678;
                                                                int var699 = var3 + 2;
                                                                int var680 = var679 * var699;
                                                                int var700 = var3 + 3;
                                                                int var681 = var680 * var700;
                                                                int var682 = var681 & 7;
                                                                if (var682 != 0) {
                                                                    var2 &= -1270768959;
                                                                    var2 <<= 28;
                                                                    var2 ^= -1466505330;
                                                                    break label593;
                                                                }
                                                                var2 = switch (var2) {
                                                                    case 3359908 -> {
                                                                        var2 <<= 22;
                                                                        var2 |= 1944629239;
                                                                        var2 += -697936339;
                                                                        yield var2 ^ 276965383;
                                                                    }
                                                                    default -> var2 ^ -238332570;
                                                                    case 2103441451 -> var2 ^ -1788719491;
                                                                };
                                                                var660 = var2;
                                                                var707 = var660 + 1L;
                                                                var707 = var660 * var707;
                                                                var23 = var660 + 2L;
                                                                var707 *= var23;
                                                                var660 += 3L;
                                                                var707 *= var660;
                                                                var660 = var707 & 7L;
                                                                long var931;
                                                                int var686 = (var931 = var660 - 0L) == 0L ? 0 : (var931 < 0L ? -1 : 1);
                                                                if (var686 != 0) {
                                                                    break label580;
                                                                }

                                                                int var643 = (var642.vb()) ? 1 : 0;
                                                                if (var643 == 0) {
                                                                    var2 = switch (var2) {
                                                                        default -> var2 ^ -1408191521;
                                                                        case 211840511 -> var2 ^ -1670569739;
                                                                        case 1120742947 -> {
                                                                            var2 &= 240331807;
                                                                            yield var2 ^ -665244260;
                                                                        }
                                                                    };
                                                                    var643 = var2 + 1;
                                                                    var643 = var2 * var643;
                                                                    var643 &= 1;
                                                                    if (var643 != 0) {
                                                                        break label580;
                                                                    }

                                                                    var2 *= -1014646453;
                                                                    var2 &= -700755399;
                                                                    var2 ^= -1065780367;
                                                                    continue;
                                                                }

                                                                var2 -= -863364991;
                                                                var2 |= 357447966;
                                                                var2 ^= -21162016;
                                                            } else {
                                                                var2 |= -270176204;
                                                                var2 ^= 160821674;
                                                                var2 ^= 2140284931;
                                                            }
                                                        } else {
                                                            var2 += -1493586175;
                                                            var2 |= 140022241;
                                                            var2 -= 2109896880;
                                                            var2 ^= -1295094939;
                                                        }

                                                        float var647 = var566.getHeight();
                                                        Uq var687 = this.n;
                                                        float var688 = var687.WM();
                                                        float var648 = var647 * var688;
                                                        int var689 = var3 + 1;
                                                        int var690 = var3 * var689;
                                                        int var701 = var3 + 2;
                                                        int var691 = var690 * var701;
                                                        var701 = var3 + 3;
                                                        int var692 = var691 * var701;
                                                        int var693 = var692 & 7;
                                                        if (var693 != 0) {
                                                            var2 ^= 1545744385;
                                                            var2 >>>= 15;
                                                            var2 &= 362489398;
                                                            var2 ^= -1466448466;
                                                            break label593;
                                                        }

                                                        var2 -= -408442838;
                                                        var2 >>>= 23;
                                                        var2 -= -463073397;
                                                        var2 ^= 2093840422;
                                                        double var649 = var648;
                                                        double var703;
                                                        if (var546) {
                                                            var2 |= 1916541644;
                                                            var2 |= 1452844032;
                                                            var2 &= 283874711;
                                                            var2 ^= -1037109916;
                                                            var703 = 0.5;
                                                            var2 |= -1345683356;
                                                            var2 |= -1178099971;
                                                            var2 -= -1327016657;
                                                            var2 += 594114001;
                                                            var2 ^= 2067548058;
                                                        } else {
                                                            var2 &= -910982472;
                                                            var2 >>= 7;
                                                            var2 &= 775097722;
                                                            var2 ^= -912892645;
                                                            var2 ^= 1381518151;
                                                            long var722 = var2;
                                                            long var24 = var722 + 1L;
                                                            var24 = var722 * var24;
                                                            long var26 = var722 + 2L;
                                                            var24 *= var26;
                                                            var722 += 3L;
                                                            var24 *= var722;
                                                            var722 = var24 & 7L;
                                                            long var932;
                                                            int var725 = (var932 = var722 - 0L) == 0L ? 0 : (var932 < 0L ? -1 : 1);
                                                            if (var725 != 0) {
                                                                break label580;
                                                            }

                                                            var703 = 1.0;
                                                            var2 >>= 22;
                                                            var2 &= 584450643;
                                                            var2 <<= 30;
                                                            var2 ^= -915515333;
                                                        }

                                                        Integer var726 = var2;
                                                        if (var726 == null) {
                                                            break label580;
                                                        }

                                                        double var650 = var649 * var703;
                                                        double var651 = var650;
                                                        double var704 = var566.lastX;
                                                        double var727 = var566.getX();
                                                        double var736 = var525;
                                                        double var705 = TP.y(var704, var727, var736);
                                                        double var706 = var705;
                                                        double var728 = var566.lastZ;
                                                        var736 = var566.getZ();
                                                        double var741 = var525;
                                                        double var729 = TP.y(var728, var736, var741);
                                                        double var730 = var729;
                                                        var736 = var566.lastY;
                                                        var741 = var566.getY();
                                                        double var28 = var525;
                                                        var736 = TP.y(var736, var741, var28);
                                                        int var567 = var3 + 1;
                                                        int var568 = var3 * var567;
                                                        int var743 = var3 + 2;
                                                        int var569 = var568 * var743;
                                                        int var744 = var3 + 3;
                                                        int var570 = var569 * var744;
                                                        int var571 = var570 & 7;
                                                        if (var571 != 0) {
                                                            var2 *= -1108471933;
                                                            var2 &= -250245810;
                                                            var2 += 643594571;
                                                            var2 ^= -1360534075;
                                                            break label593;
                                                        }
                                                        var2 = switch (var2) {
                                                            default -> var2 ^ -1175749670;
                                                            case -616860030 -> var2 ^ 1167039723;
                                                            case 158226491 -> {
                                                                var2 >>>= 8;
                                                                var2 ^= 1312300539;
                                                                var2 += 990595860;
                                                                yield var2 ^ 989558784;
                                                            }
                                                        };
                                                        int var572 = var2 + 1;
                                                        int var573 = var2 * var572;
                                                        int var745 = var2 + 2;
                                                        int var574 = var573 * var745;
                                                        int var746 = var2 + 3;
                                                        int var575 = var574 * var746;
                                                        int var576 = var575 & 7;
                                                        if (var576 != 0) {
                                                            break label580;
                                                        }

                                                        var736 = var736;
                                                        long var747 = this.i;
                                                        var14 = (float)var747;
                                                        var14 += var525;
                                                        var14 = var14;
                                                        byte var748 = 0;
                                                        int var749 = var748;
                                                        var2 &= -899684719;
                                                        var2 += -754408272;
                                                        var2 *= -584225489;
                                                        var2 ^= 672774934;

                                                        while (true) {
                                                            long var27 = var2;
                                                            long var29 = var27 + 1L;
                                                            var29 = var27 * var29;
                                                            var27 = var29 & 1L;
                                                            long var933;
                                                            int var751 = (var933 = var27 - 0L) == 0L ? 0 : (var933 < 0L ? -1 : 1);
                                                            if (var751 != 0) {
                                                                break label580;
                                                            }

                                                            int var752 = var632.GY;
                                                            Integer var772 = var3;
                                                            if (var772 != null) {
                                                                var2 >>>= 5;
                                                                var2 &= 2040058134;
                                                                var2 ^= -1195564920;
                                                                long var773 = var2;
                                                                long var30 = var773 + 1L;
                                                                var30 = var773 * var30;
                                                                long var32 = var773 + 2L;
                                                                var30 *= var32;
                                                                long var774 = var773 + 3L;
                                                                var30 *= var774;
                                                                long var775 = var30 & 7L;
                                                                long var934;
                                                                int var776 = (var934 = var775 - 0L) == 0L ? 0 : (var934 < 0L ? -1 : 1);
                                                                if (var776 != 0) {
                                                                    break label580;
                                                                }

                                                                if (var749 < var752) {
                                                                    var2 >>>= 15;
                                                                    var2 ^= 201995826;
                                                                    var27 = var2;
                                                                    var29 = var27 + 1L;
                                                                    var29 = var27 * var29;
                                                                    var27 = var29 & 1L;
                                                                    long var935;
                                                                    int var755 = (var935 = var27 - 0L) == 0L ? 0 : (var935 < 0L ? -1 : 1);
                                                                    if (var755 != 0) {
                                                                        break label580;
                                                                    }

                                                                    int var756 = var632.T(var749);
                                                                    double[] var777 = var632.p;
                                                                    var28 = var777[var756];
                                                                    double[] var793 = var632.Y;
                                                                    double var794 = var793[var756];
                                                                    double[] var797 = var632.J;
                                                                    double var798 = var797[var756];
                                                                    long[] var34 = var632.LJ;
                                                                    long var799 = var34[var756];
                                                                    long var36 = var3;
                                                                    long var38 = var36 + 1L;
                                                                    var38 = var36 * var38;
                                                                    var36 = var38 & 1L;
                                                                    long var936;
                                                                    int var757 = (var936 = var36 - 0L) == 0L ? 0 : (var936 < 0L ? -1 : 1);
                                                                    if (var757 == 0) {
                                                                        var2 <<= 20;
                                                                        var2 *= -1832840947;
                                                                        var2 += 1247471070;
                                                                        var2 &= -158415355;
                                                                        var2 ^= 1114254884;
                                                                        Integer var758 = var2;
                                                                        if (var758 == null) {
                                                                            break label580;
                                                                        }

                                                                        float var759 = (float)var799;
                                                                        float var760 = var14 - var759;
                                                                        int var800 = var749 + 1;
                                                                        int var35 = var632.GY;
                                                                        float var805;
                                                                        double var813;
                                                                        double var816;
                                                                        double var819;
                                                                        if (var800 < var35) {
                                                                            var2 <<= 11;
                                                                            var2 *= -1066281;
                                                                            var2 >>= 23;
                                                                            var2 ^= -833097530;
                                                                            int var801 = var749 + 1;
                                                                            int var802 = var632.T(var801);
                                                                            double[] var811 = var632.p;
                                                                            double var812 = var811[var802];
                                                                            double[] var37 = var632.Y;
                                                                            var816 = var37[var802];
                                                                            double[] var39 = var632.J;
                                                                            var819 = var39[var802];
                                                                            long var41 = var3;
                                                                            long var43 = var41 + 1L;
                                                                            var43 = var41 * var43;
                                                                            var41 = var43 & 1L;
                                                                            long var937;
                                                                            int var821 = (var937 = var41 - 0L) == 0L ? 0 : (var937 < 0L ? -1 : 1);
                                                                            if (var821 != 0) {
                                                                                var2 |= -729532692;
                                                                                var2 *= -1821018545;
                                                                                var2 ^= -1891172022;
                                                                                break label593;
                                                                            }

                                                                            var2 |= 1097380731;
                                                                            var2 <<= 16;
                                                                            var2 |= 1560710695;
                                                                            var2 ^= -2114645610;
                                                                            long[] var822 = var632.LJ;
                                                                            var41 = var822[var802];
                                                                            float var803 = (float)var41;
                                                                            float var804 = var14 - var803;
                                                                            var813 = var812;
                                                                            var816 = var816;
                                                                            var819 = var819;
                                                                            var805 = var804;
                                                                            var2 |= 1400917569;
                                                                            var2 |= 1016525353;
                                                                            var2 &= -833151079;
                                                                            var2 ^= 1688843661;
                                                                        } else {
                                                                            var2 >>>= 29;
                                                                            var2 ^= 2095958703;
                                                                            Integer var824 = var2;
                                                                            if (var824 == null) {
                                                                                break label580;
                                                                            }

                                                                            long var47 = var3;
                                                                            long var49 = var47 + 1L;
                                                                            var49 = var47 * var49;
                                                                            var47 = var49 & 1L;
                                                                            long var938;
                                                                            int var908 = (var938 = var47 - 0L) == 0L ? 0 : (var938 < 0L ? -1 : 1);
                                                                            if (var908 != 0) {
                                                                                switch (var2) {
                                                                                    case -1652047790:
                                                                                    default:
                                                                                        var2 ^= -609007214;
                                                                                        break label593;
                                                                                    case 1891242749:
                                                                                        var2 ^= 1725902439;
                                                                                        break label593;
                                                                                    case 2095958703:
                                                                                        var2 ^= 663145050;
                                                                                        var2 -= 565992573;
                                                                                        var2 |= -1896152983;
                                                                                        var2 ^= -995547082;
                                                                                        var2 ^= -742364223;
                                                                                        break label593;
                                                                                }
                                                                            }

                                                                            var2 *= 1651832727;
                                                                            var2 >>>= 9;
                                                                            var2 ^= -1761342740;
                                                                            int var909 = var2 + 1;
                                                                            int var910 = var2 * var909;
                                                                            int var911 = var910 & 1;
                                                                            if (var911 != 0) {
                                                                                break label580;
                                                                            }

                                                                            float var912 = 0.0F;
                                                                            var813 = var706;
                                                                            var816 = var736;
                                                                            var819 = var730;
                                                                            var805 = var912;
                                                                            switch (var2) {
                                                                                case -1753349025:
                                                                                    var2 &= 510014033;
                                                                                    var2 |= -1683360450;
                                                                                    var2 ^= -1253023893;
                                                                                    break;
                                                                                case -1503216792:
                                                                                default:
                                                                                    var2 ^= 899411599;
                                                                                    break;
                                                                                case -353199029:
                                                                                    var2 ^= -1992422187;
                                                                            }
                                                                        }

                                                                        Integer var825 = var2;
                                                                        if (var825 == null) {
                                                                            break label580;
                                                                        }

                                                                        double var826 = var813 - var28;
                                                                        double var867 = var813 - var28;
                                                                        double var827 = var826 * var867;
                                                                        var867 = var816 - var794;
                                                                        double var45 = var816 - var794;
                                                                        var867 *= var45;
                                                                        double var828 = var827 + var867;
                                                                        long var870 = var3;
                                                                        long var896 = var870 + 1L;
                                                                        long var897 = var870 * var896;
                                                                        long var913 = var870 + 2L;
                                                                        long var898 = var897 * var913;
                                                                        long var871 = var870 + 3L;
                                                                        long var899 = var898 * var871;
                                                                        long var872 = var899 & 7L;
                                                                        long var939;
                                                                        int var873 = (var939 = var872 - 0L) == 0L ? 0 : (var939 < 0L ? -1 : 1);
                                                                        if (var873 != 0) {
                                                                            var2 &= 450546842;
                                                                            var2 *= -13620823;
                                                                            var2 ^= -1705474786;
                                                                            break label593;
                                                                        }

                                                                        var2 -= -1979861255;
                                                                        var2 |= -1251423099;
                                                                        var2 += 464504902;
                                                                        var2 >>>= 4;
                                                                        var2 ^= -1149880526;
                                                                        long var874 = var2;
                                                                        long var900 = var874 + 1L;
                                                                        long var901 = var874 * var900;
                                                                        var913 = var874 + 2L;
                                                                        long var902 = var901 * var913;
                                                                        long var875 = var874 + 3L;
                                                                        long var903 = var902 * var875;
                                                                        long var876 = var903 & 7L;
                                                                        long var940;
                                                                        int var877 = (var940 = var876 - 0L) == 0L ? 0 : (var940 < 0L ? -1 : 1);
                                                                        if (var877 != 0) {
                                                                            break label580;
                                                                        }

                                                                        var867 = var819 - var798;
                                                                        var45 = var819 - var798;
                                                                        var867 *= var45;
                                                                        double var829 = var828 + var867;
                                                                        double var941;
                                                                        int var830 = (var941 = var829 - 1.0E-8) == 0.0 ? 0 : (var941 < 0.0 ? -1 : 1);
                                                                        if (var830 < 0) {
                                                                            var2 |= 1177294679;
                                                                            var2 |= 1543233363;
                                                                            var2 ^= 2011398938;
                                                                            var2 &= -1325870852;
                                                                            var2 ^= -167002346;
                                                                            long var831 = var2;
                                                                            long var880 = var831 + 1L;
                                                                            long var881 = var831 * var880;
                                                                            long var905 = var831 + 2L;
                                                                            long var882 = var881 * var905;
                                                                            long var832 = var831 + 3L;
                                                                            long var883 = var882 * var832;
                                                                            long var833 = var883 & 7L;
                                                                            long var942;
                                                                            var830 = (var942 = var833 - 0L) == 0L ? 0 : (var942 < 0L ? -1 : 1);
                                                                            if (var830 != 0) {
                                                                                break label580;
                                                                            }

                                                                            var2 |= -495787712;
                                                                            var2 &= 540838013;
                                                                            var2 += 1267616309;
                                                                            var2 *= -550586213;
                                                                            var2 ^= 303126207;
                                                                        } else {
                                                                            label574: {
                                                                                var2 ^= 973799084;
                                                                                var2 ^= -244173860;
                                                                                float var761 = var760 / var537;
                                                                                float var762 = 1.0F - var761;
                                                                                long var835 = var3;
                                                                                long var884 = var835 + 1L;
                                                                                long var885 = var835 * var884;
                                                                                long var836 = var885 & 1L;
                                                                                long var943;
                                                                                var830 = (var943 = var836 - 0L) == 0L ? 0 : (var943 < 0L ? -1 : 1);
                                                                                if (var830 != 0) {
                                                                                    var2 >>= 26;
                                                                                    var2 &= 1902749426;
                                                                                    var2 += 458795754;
                                                                                    var2 ^= -1278325390;
                                                                                    break label593;
                                                                                }

                                                                                var2 <<= 17;
                                                                                var2 += 1809423967;
                                                                                var2 *= -383186405;
                                                                                var2 >>= 3;
                                                                                var2 ^= -1193396679;
                                                                                long var838 = var2;
                                                                                long var886 = var838 + 1L;
                                                                                long var887 = var838 * var886;
                                                                                long var906 = var838 + 2L;
                                                                                long var888 = var887 * var906;
                                                                                long var839 = var838 + 3L;
                                                                                long var889 = var888 * var839;
                                                                                long var840 = var889 & 7L;
                                                                                long var944;
                                                                                var830 = (var944 = var840 - 0L) == 0L ? 0 : (var944 < 0L ? -1 : 1);
                                                                                if (var830 != 0) {
                                                                                    break label580;
                                                                                }

                                                                                float var763 = TP.S(var762);
                                                                                float var806 = var805 / var537;
                                                                                float var807 = 1.0F - var806;
                                                                                float var808 = TP.S(var807);
                                                                                float var945;
                                                                                var830 = (var945 = var763 - 0.0F) == 0.0F ? 0 : (var945 < 0.0F ? -1 : 1);
                                                                                if (var830 <= 0) {
                                                                                    var2 >>>= 11;
                                                                                    var2 &= 1023248482;
                                                                                    var2 &= -1963049699;
                                                                                    var2 *= 1023902525;
                                                                                    var2 ^= 863943432;
                                                                                    var830 = var2 + 1;
                                                                                    var830 = var2 * var830;
                                                                                    var830 &= 1;
                                                                                    if (var830 != 0) {
                                                                                        break label580;
                                                                                    }

                                                                                    float var946;
                                                                                    var830 = (var946 = var808 - 0.0F) == 0.0F ? 0 : (var946 < 0.0F ? -1 : 1);
                                                                                    long var42 = var3;
                                                                                    long var44 = var42 + 1L;
                                                                                    var44 = var42 * var44;
                                                                                    long var46 = var42 + 2L;
                                                                                    var44 *= var46;
                                                                                    var42 += 3L;
                                                                                    var44 *= var42;
                                                                                    var42 = var44 & 7L;
                                                                                    long var947;
                                                                                    int var858 = (var947 = var42 - 0L) == 0L ? 0 : (var947 < 0L ? -1 : 1);
                                                                                    if (var858 != 0) {
                                                                                        switch (var2) {
                                                                                            case -1713115693:
                                                                                                var2 ^= 1604593565;
                                                                                                break label593;
                                                                                            case 1702843144:
                                                                                                var2 -= -1612311057;
                                                                                                var2 |= 1872626879;
                                                                                                var2 ^= 1191828017;
                                                                                                break label593;
                                                                                            case 1793510047:
                                                                                            default:
                                                                                                var2 ^= 1752702280;
                                                                                                break label593;
                                                                                        }
                                                                                    }

                                                                                    var2 -= 173731672;
                                                                                    var2 ^= -1530059336;
                                                                                    if (var830 <= 0) {
                                                                                        var2 &= -1934349684;
                                                                                        var2 += -225909427;
                                                                                        var2 ^= 1045523985;
                                                                                        Integer var847 = var2;
                                                                                        if (var847 == null) {
                                                                                            break label580;
                                                                                        }

                                                                                        var2 += -588978670;
                                                                                        var2 -= 1139933118;
                                                                                        var2 |= -196446311;
                                                                                        var2 -= 618430967;
                                                                                        var2 ^= -650140262;
                                                                                        break label574;
                                                                                    }

                                                                                    var2 *= -1811315319;
                                                                                    var2 += 1785395872;
                                                                                    var2 ^= 1733486955;
                                                                                } else {
                                                                                    var2 |= 1538672318;
                                                                                    var2 ^= -1656288644;
                                                                                }

                                                                                var830 = var2 + 1;
                                                                                var830 = var2 * var830;
                                                                                int var859 = var2 + 2;
                                                                                var830 *= var859;
                                                                                var859 = var2 + 3;
                                                                                var830 *= var859;
                                                                                var830 &= 7;
                                                                                if (var830 != 0) {
                                                                                    break label580;
                                                                                }

                                                                                Uq var853 = this.Lx;
                                                                                Integer var861 = var3;
                                                                                if (var861 == null) {
                                                                                    switch (var2) {
                                                                                        case -1028033149:
                                                                                            var2 += 1148413694;
                                                                                            var2 ^= -1346749681;
                                                                                            break label593;
                                                                                        case -964521225:
                                                                                            var2 ^= -1916063382;
                                                                                            break label593;
                                                                                        case 731008201:
                                                                                        default:
                                                                                            var2 ^= -901360561;
                                                                                            break label593;
                                                                                    }
                                                                                }

                                                                                var2 |= -184072128;
                                                                                var2 ^= 1466801442;
                                                                                float var854 = var853.WM();
                                                                                zS var862 = this.H;
                                                                                float var890 = 1.0F - var763;
                                                                                int var863 = var862.x(var890, var532);
                                                                                float var764 = var763 * var854;
                                                                                int var765 = DP.Y(var863, var764);
                                                                                zS var864 = this.H;
                                                                                float var891 = 1.0F - var808;
                                                                                var863 = var864.x(var891, var532);
                                                                                float var809 = var808 * var854;
                                                                                int var810 = DP.Y(var863, var809);
                                                                                double var855 = var794 + var651;
                                                                                var867 = var816 + var651;
                                                                                boolean var766 = var521.band(
                                                                                    var501,
                                                                                    var28,
                                                                                    var794,
                                                                                    var798,
                                                                                    var28,
                                                                                    var855,
                                                                                    var798,
                                                                                    var813,
                                                                                    var816,
                                                                                    var819,
                                                                                    var813,
                                                                                    var867,
                                                                                    var819,
                                                                                    var765,
                                                                                    var810,
                                                                                    var551,
                                                                                    var607,
                                                                                    var597
                                                                                );
                                                                                var2 += 426985929;
                                                                                var2 *= -339579687;
                                                                                var2 >>>= 23;
                                                                                var2 ^= 11426300;
                                                                            }
                                                                        }

                                                                        var27 = var2;
                                                                        var29 = var27 + 1L;
                                                                        var29 = var27 * var29;
                                                                        long var31 = var27 + 2L;
                                                                        var29 *= var31;
                                                                        var27 += 3L;
                                                                        var29 *= var27;
                                                                        var27 = var29 & 7L;
                                                                        long var948;
                                                                        int var770 = (var948 = var27 - 0L) == 0L ? 0 : (var948 < 0L ? -1 : 1);
                                                                        if (var770 != 0) {
                                                                            break label580;
                                                                        }

                                                                        int var771 = var749 + 1;
                                                                        long var779 = var3;
                                                                        var30 = var779 + 1L;
                                                                        var30 = var779 * var30;
                                                                        long var780 = var30 & 1L;
                                                                        long var949;
                                                                        int var781 = (var949 = var780 - 0L) == 0L ? 0 : (var949 < 0L ? -1 : 1);
                                                                        if (var781 != 0) {
                                                                            switch (var2) {
                                                                                case -1337838937:
                                                                                    var2 ^= -354920666;
                                                                                    break label593;
                                                                                case -232132218:
                                                                                default:
                                                                                    var2 ^= 1950313920;
                                                                                    break label593;
                                                                                case 11425848:
                                                                                    var2 += -1005367008;
                                                                                    var2 >>>= 15;
                                                                                    var2 ^= -1466470899;
                                                                                    break label593;
                                                                            }
                                                                        }

                                                                        var2 += -1901323938;
                                                                        var2 &= 541982017;
                                                                        var2 += -1882149271;
                                                                        var2 ^= -1002662856;
                                                                        Integer var782 = var2;
                                                                        if (var782 == null) {
                                                                            break label580;
                                                                        }

                                                                        var749 = var771;
                                                                        var2 *= -1296087545;
                                                                        var2 ^= 575607758;
                                                                        continue;
                                                                    }

                                                                    var2 *= -1775124067;
                                                                    var2 >>= 22;
                                                                    var2 ^= 1466505259;
                                                                    break label593;
                                                                }

                                                                var2 &= 2140965280;
                                                                var2 |= -313515141;
                                                                var2 >>>= 23;
                                                                var2 >>>= 14;
                                                                var2 ^= -608176333;
                                                                var2 += 2071804162;
                                                                var2 ^= -2058417323;
                                                                break;
                                                            }

                                                            var2 |= 2101929721;
                                                            var2 *= -1064257871;
                                                            var2 *= 1370464043;
                                                            var2 ^= -1359510931;
                                                            break label593;
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        var2 ^= -1428082357;
                                        var2 |= 1048724731;
                                        var2 >>>= 13;
                                        var2 -= -1216933400;
                                        var2 ^= -535295588;
                                    }
                                    break label593;
                                }

                                switch (var2) {
                                    case -1410157359:
                                        var2 ^= 1412980670;
                                        break;
                                    case -505165864:
                                        var2 *= -801878419;
                                        var2 &= -1632150343;
                                        var2 *= -1442284173;
                                        var2 += -1741987208;
                                        var2 ^= 1606695605;
                                        break;
                                    case 1069184212:
                                    default:
                                        var2 ^= -442650006;
                                }
                            } else {
                                var2 |= -1434699299;
                                var2 |= 1918027647;
                                var2 ^= 306299004;
                                var2 ^= 313990166;
                            }

                            long var472 = var2;
                            long var502 = var472 + 1L;
                            long var503 = var472 * var502;
                            var7 = var472 + 2L;
                            long var504 = var503 * var7;
                            long var473 = var472 + 3L;
                            long var505 = var504 * var473;
                            long var474 = var505 & 7L;
                            long var950;
                            var3 = (var950 = var474 - 0L) == 0L ? 0 : (var950 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                return;
                            }
                            break label580;
                        }

                        var2 <<= 6;
                        var2 |= 1524126209;
                        var2 ^= 1885456606;
                    } else {
                        switch (var2) {
                            case -1653548258:
                            default:
                                var2 ^= -1889467060;
                                break;
                            case -829505190:
                                var2 ^= -1781511863;
                                break;
                            case -102400010:
                                var2 -= 1034537534;
                                var2 ^= -1230852441;
                        }
                    }

                    Integer var465 = var2;
                    if (var465 != null) {
                        return;
                    }
                    break label580;
                }
            }

            IllegalArgumentException var476 = new IllegalArgumentException();
            throw var476;
        }

        AssertionError var466 = new AssertionError();
        throw var466;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -314032318;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        p = var4;
    }
}
