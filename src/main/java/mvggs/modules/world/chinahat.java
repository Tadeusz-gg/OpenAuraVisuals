package mvggs.modules.world;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.Projection;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.client.render.WorldDraw;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import net.minecraft.entity.Entity;

public final class chinahat extends Yn {
    private static final int TG = 48;
    private final Uq Oc;
    private final Uq yQ;
    private final Uq f;
    private final Uq iZ;
    private final JL n;
    private final JL T;
    private final Uq fC;
    private final Uq r;
    private final zS c;
    private final JL o;
    private final double[] i;
    private final double[] U;
    private final double[] TJ;
    private final int[] V;
    public static final int p;

    public chinahat() {
        super("china_hat", "China Hat", AJ.WORLD);
        AJ var1 = AJ.WORLD;

        Uq var3 = new Uq("radius", "Brim Radius", 0.65F, 0.3F, 1.0F);
        Uq var4 = var3.W(0.01F);
        Uq var5 = var4.L("m");
        xB var6 = this.vn(var5);
        Uq var7 = (Uq)var6;
        this.Oc = var7;
        Uq var8 = new Uq("tip", "Tip Height", 0.35F, 0.1F, 1.0F);
        Uq var9 = var8.W(0.01F);
        Uq var10 = var9.L("m");
        xB var11 = this.vn(var10);
        Uq var12 = (Uq)var11;
        this.yQ = var12;
        Uq var13 = new Uq("lift", "Height", 0.0F, -0.3F, 0.3F);
        Uq var14 = var13.W(0.01F);
        Uq var15 = var14.L("m");
        xB var16 = this.vn(var15);
        Uq var17 = (Uq)var16;
        this.f = var17;
        Uq var18 = new Uq("opacity", "Opacity", 0.55F, 0.1F, 1.0F);
        Uq var19 = var18.W(0.05F);
        xB var20 = this.vn(var19);
        Uq var21 = (Uq)var20;
        this.iZ = var21;
        JL var22 = new JL("fade_brim", "Fade Toward Brim", false);
        xB var23 = this.vn(var22);
        JL var24 = (JL)var23;
        this.n = var24;
        JL var25 = new JL("rim", "Glowing Rim", true);
        xB var26 = this.vn(var25);
        JL var27 = (JL)var26;
        this.T = var27;
        Uq var28 = new Uq("spin", "Color Spin", 1.0F, 0.0F, 3.0F);
        Uq var29 = var28.W(0.1F);
        xB var30 = this.vn(var29);
        Uq var31 = (Uq)var30;
        this.fC = var31;
        Uq var32 = new Uq("glow", "Glow", 0.35F, 0.0F, 1.0F);
        Uq var33 = var32.W(0.05F);
        xB var34 = this.vn(var33);
        Uq var35 = (Uq)var34;
        this.r = var35;
        Ry var2 = Ry.GRADIENT;
        zS var36 = new zS(var2, -11559425, -5870593);
        nM var37 = this.bU(var36);
        zS var38 = (zS)var37;
        this.c = var38;
        JL var39 = new JL("players", "Other Players", false);
        xB var40 = this.vn(var39);
        JL var41 = (JL)var40;
        this.o = var41;
        double[] var42 = new double[49];
        this.i = var42;
        double[] var43 = new double[49];
        this.U = var43;
        double[] var44 = new double[49];
        this.TJ = var44;
        int[] var45 = new int[49];
        this.V = var45;
        this.dy("A glowing conical hat that sits on the head and tilts with it.");
        wD<T> var46 = this::W;
        this.iI(T.class, var46);
    }

    private void W(T var1) {
        label315: {
            int var2 = p;
            var2 ^= 1417243035;
            int var3 = System.identityHashCode(this);
            RenderPhase var4 = var1.phase();
            RenderPhase var5 = RenderPhase.WORLD;
            Integer var6 = var3;
            if (var6 == null) {
                var2 ^= -2120237563;
                var2 &= -664686174;
                var2 ^= 445838368;
                var2 ^= -305030410;
            } else {
                var2 >>>= 14;
                var2 *= 1819974099;
                var2 |= -846490451;
                var2 *= -478223309;
                var2 ^= 1366948054;
                if (var4 != var5) {
                    var2 |= 490074224;
                    var2 += -445865003;
                    var2 &= 1496109811;
                    var2 ^= -474140004;
                    Integer var181 = var2;
                    if (var181 != null) {
                        return;
                    }
                    break label315;
                }
                var2 = switch (var2) {
                    default -> var2 ^ 343152581;
                    case -1034038768 -> var2 ^ 145563521;
                    case 4064539 -> {
                        var2 *= -1678883141;
                        var2 |= 1566970838;
                        yield var2 ^ -1373885412;
                    }
                };
                Integer var178 = var2;
                if (var178 == null) {
                    break label315;
                }

                Entity var179 = i_2.QI();
                Entity var180 = var179;
                Integer var186 = var3;
                if (var186 == null) {
                    var2 &= 1268821966;
                    var2 ^= 1052966164;
                } else {
                    var2 *= -275293277;
                    var2 += 672238692;
                    var2 += -1418005039;
                    var2 ^= 225163408;
                    int var187 = var2 + 1;
                    int var188 = var2 * var187;
                    int var195 = var2 + 2;
                    int var189 = var188 * var195;
                    var195 = var2 + 3;
                    int var190 = var189 * var195;
                    int var191 = var190 & 7;
                    if (var191 != 0) {
                        break label315;
                    }

                    if (var179 == null) {
                        var2 -= -448441258;
                        var2 &= 1014366667;
                        var2 ^= -1124348915;
                        return;
                    }
                    var2 = switch (var2) {
                        default -> var2 ^ -1977478860;
                        case 1842365330 -> var2 ^ 1249534120;
                        case 1909883950 -> {
                            var2 *= 1030776365;
                            yield var2 ^ 757624197;
                        }
                    };
                    Integer var192 = var2;
                    if (var192 == null) {
                        break label315;
                    }

                    Canvas var193 = var1.canvas();
                    Integer var197 = var3;
                    if (var197 == null) {
                        var2 -= 1581699599;
                        var2 *= 2051060977;
                        var2 -= 724845253;
                        var2 ^= 1441553065;
                    } else {
                        var2 |= -1138909993;
                        var2 *= -538889761;
                        var2 |= 1893505609;
                        var2 ^= -905070250;
                        long var198 = var2;
                        long var8 = var198 + 1L;
                        var8 = var198 * var8;
                        long var10 = var198 + 2L;
                        var8 *= var10;
                        long var199 = var198 + 3L;
                        var8 *= var199;
                        long var200 = var8 & 7L;
                        long var353;
                        int var201 = (var353 = var200 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                        if (var201 != 0) {
                            break label315;
                        }

                        Canvas var194 = var193;
                        Ud var202 = Ud.Z();
                        AuraPipeline var203 = var202.Ul();
                        WorldDraw var204 = var203.world();
                        WorldDraw var205 = var204;
                        FrameContext var7 = var1.frame();
                        float var211 = var7.partialTick();
                        float var212 = var211;
                        FrameContext var216 = var1.frame();
                        double var217 = var216.time();
                        double var218 = var217;
                        var193.save();
                        Uq var220 = this.r;
                        float var221 = var220.WM();
                        var193.additive(var221);
                        Iterable var222 = i_2.S();
                        Iterator var223 = var222.iterator();
                        Iterator var224 = var223;

                        var2 = switch (var2) {
                            default -> var2 ^ 1579666522;
                            case 821192223 -> {
                                var2 -= -1595969318;
                                var2 -= 1465303474;
                                var2 &= -1277222016;
                                var2 |= 1020167336;
                                yield var2 ^ 314259183;
                            }
                            case 2118582532 -> var2 ^ 679302321;
                        };

                        while (true) {
                            int var11 = var2 + 1;
                            var11 = var2 * var11;
                            int var12 = var2 + 2;
                            var11 *= var12;
                            var12 = var2 + 3;
                            var11 *= var12;
                            var11 &= 7;
                            if (var11 != 0) {
                                break label315;
                            }

                            int var229 = (var224.hasNext()) ? 1 : 0;
                            var12 = var3 + 1;
                            var12 = var3 * var12;
                            int var13 = var3 + 2;
                            var12 *= var13;
                            var13 = var3 + 3;
                            var12 *= var13;
                            var12 &= 7;
                            if (var12 != 0) {
                                var2 += 479465875;
                                var2 *= -854132801;
                                var2 ^= 578685040;
                                break;
                            }

                            var2 += -11918619;
                            var2 ^= 999019236;
                            Integer var242 = var2;
                            if (var242 == null) {
                                break label315;
                            }

                            if (var229 == 0) {
                                var2 *= -242849543;
                                var2 += -2019004745;
                                var2 &= 2122408163;
                                var2 ^= 1917344507;
                                long var174 = var2;
                                long var206 = var174 + 1L;
                                long var207 = var174 * var206;
                                var8 = var174 + 2L;
                                long var208 = var207 * var8;
                                long var175 = var174 + 3L;
                                long var209 = var208 * var175;
                                long var176 = var209 & 7L;
                                long var363;
                                var3 = (var363 = var176 - 0L) == 0L ? 0 : (var363 < 0L ? -1 : 1);
                                if (var3 == 0) {
                                    var194.restore();
                                    return;
                                }
                                break label315;
                            }

                            var2 *= 1906187215;
                            var2 &= -2122304173;
                            var2 ^= -325486987;
                            long var230 = var2;
                            long var288 = var230 + 1L;
                            long var289 = var230 * var288;
                            long var15 = var230 + 2L;
                            long var290 = var289 * var15;
                            long var231 = var230 + 3L;
                            long var291 = var290 * var231;
                            long var232 = var291 & 7L;
                            long var354;
                            var229 = (var354 = var232 - 0L) == 0L ? 0 : (var354 < 0L ? -1 : 1);
                            if (var229 != 0) {
                                break label315;
                            }

                            Object var234 = var224.next();
                            int var243 = var3 + 1;
                            var243 = var3 * var243;
                            var243 &= 1;
                            if (var243 != 0) {
                                var2 &= 351161233;
                                var2 ^= 2070584791;
                                break;
                            }

                            var2 *= -107606637;
                            var2 |= 1731134320;
                            var2 ^= -2084949303;
                            Entity var235 = (Entity)var234;
                            int var249;
                            if (var235 == var180) {
                                var2 += 361822967;
                                var2 &= 650759316;
                                var2 -= -1861871094;
                                var2 ^= -734003524;
                                long var246 = var2;
                                long var14 = var246 + 1L;
                                var14 = var246 * var14;
                                long var247 = var14 & 1L;
                                long var355;
                                var249 = (var355 = var247 - 0L) == 0L ? 0 : (var355 < 0L ? -1 : 1);
                                if (var249 != 0) {
                                    break label315;
                                }

                                var249 = 1;
                                switch (var2) {
                                    case -1960359499:
                                        var2 ^= -2042751651;
                                        break;
                                    case 969639219:
                                    default:
                                        var2 ^= 1437055259;
                                        break;
                                    case 1158026054:
                                        var2 &= 1167931522;
                                        var2 |= 1811633243;
                                        var2 ^= 322435650;
                                }
                            } else {
                                var2 = switch (var2) {
                                    case -1413792330 -> var2 ^ 593863695;
                                    default -> var2 ^ -1421730180;
                                    case 1690643766 -> {
                                        var2 ^= -1301623814;
                                        var2 += 1623877884;
                                        var2 *= 99789363;
                                        var2 *= 663437459;
                                        yield var2 ^ 2047998187;
                                    }
                                };
                                Integer var292 = var2;
                                if (var292 == null) {
                                    break label315;
                                }

                                var249 = 0;
                                var2 |= 1718211066;
                                var2 |= -432113303;
                                var2 -= -956610226;
                                var2 ^= 1573658292;
                            }

                            Integer var293 = var2;
                            if (var293 == null) {
                                break label315;
                            }

                            var293 = var3;
                            if (var293 == null) {
                                var2 |= -861362876;
                                var2 &= 1554354439;
                                var2 ^= -1009135900;
                                var2 ^= -535064265;
                                break;
                            }

                            var2 >>>= 12;
                            var2 |= 1801568530;
                            var2 ^= 1265079353;
                            long var295 = var2;
                            var15 = var295 + 1L;
                            var15 = var295 * var15;
                            long var296 = var15 & 1L;
                            long var356;
                            int var297 = (var356 = var296 - 0L) == 0L ? 0 : (var356 < 0L ? -1 : 1);
                            if (var297 != 0) {
                                break label315;
                            }

                            if (var249 != 0) {
                                var2 &= 1049024846;
                                var2 &= 537199254;
                                var2 *= 229179063;
                                var2 -= 1710288561;
                                var2 ^= 1686643954;
                                var249 = var2 + 1;
                                var249 = var2 * var249;
                                var297 = var2 + 2;
                                var249 *= var297;
                                var297 = var2 + 3;
                                var249 *= var297;
                                var249 &= 7;
                                if (var249 != 0) {
                                    break label315;
                                }

                                int var255 = (i_2.ax()) ? 1 : 0;
                                var297 = var3 + 1;
                                var297 = var3 * var297;
                                int var335 = var3 + 2;
                                var297 *= var335;
                                var335 = var3 + 3;
                                var297 *= var335;
                                var297 &= 7;
                                if (var297 != 0) {
                                    var2 ^= -446728616;
                                    var2 += 1047341676;
                                    var2 ^= 742479957;
                                    break;
                                }

                                var2 <<= 24;
                                var2 ^= -1059262510;
                                var2 ^= 1744716763;
                                var297 = var2 + 1;
                                var297 = var2 * var297;
                                var297 &= 1;
                                if (var297 != 0) {
                                    break label315;
                                }

                                if (var255 != 0) {
                                    var2 |= -1090770014;
                                    var2 ^= -1952926968;
                                    var255 = var2 + 1;
                                    var255 = var2 * var255;
                                    var297 = var2 + 2;
                                    var255 *= var297;
                                    var297 = var2 + 3;
                                    var255 *= var297;
                                    var255 &= 7;
                                    if (var255 != 0) {
                                        break label315;
                                    }

                                    var2 += 1819682869;
                                    var2 -= 1352357534;
                                    var2 ^= -1088061571;
                                    continue;
                                }

                                var2 += -304521892;
                                var2 <<= 8;
                                var2 &= -803304021;
                                var2 ^= -973936719;
                            } else {
                                var2 |= -342735180;
                                var2 *= -1853936187;
                                var2 >>>= 11;
                                var2 *= 534751567;
                                var2 ^= 594685643;
                                var249 = var2 + 1;
                                var249 = var2 * var249;
                                var249 &= 1;
                                if (var249 != 0) {
                                    break label315;
                                }

                                JL var264 = this.o;
                                long var310 = var3;
                                var15 = var310 + 1L;
                                var15 = var310 * var15;
                                long var311 = var15 & 1L;
                                long var357;
                                var297 = (var357 = var311 - 0L) == 0L ? 0 : (var357 < 0L ? -1 : 1);
                                if (var297 != 0) {
                                    var2 ^= 643422989;
                                    var2 >>= 12;
                                    var2 ^= -2137498121;
                                    break;
                                }

                                var2 |= -443576141;
                                var2 ^= 1509028756;
                                var297 = var2 + 1;
                                var297 = var2 * var297;
                                var297 &= 1;
                                if (var297 != 0) {
                                    break label315;
                                }

                                int var265 = (var264.vb()) ? 1 : 0;
                                if (var265 == 0) {
                                    var2 += 163128978;
                                    var2 *= 247369301;
                                    var2 -= -1875429088;
                                    var2 ^= -1866043738;
                                    continue;
                                }

                                var2 *= 836006239;
                                var2 -= 646134162;
                                var2 &= -854727600;
                                var2 += -1857827771;
                                var2 ^= 980532531;
                                var265 = var2 + 1;
                                var265 = var2 * var265;
                                var265 &= 1;
                                if (var265 != 0) {
                                    break label315;
                                }

                                boolean var269 = i_2.Jr(var235);
                                var297 = var3 + 1;
                                var297 = var3 * var297;
                                var297 &= 1;
                                if (var297 != 0) {
                                    var2 >>= 3;
                                    var2 ^= 1929763704;
                                    break;
                                }

                                var2 &= 1062212537;
                                var2 |= -14597008;
                                var2 ^= 1014064476;
                                var297 = var2 + 1;
                                var297 = var2 * var297;
                                var297 &= 1;
                                if (var297 != 0) {
                                    break label315;
                                }

                                if (!var269) {
                                    var2 |= 977610145;
                                    var2 ^= 1192867873;
                                    var2 &= 1680241859;
                                    var2 >>= 21;
                                    var2 >>>= 31;
                                    var2 ^= 778408263;
                                    continue;
                                }

                                var2 -= -921369460;
                                var2 *= 870790911;
                                var2 ^= 64923345;
                            }

                            long var270 = var2;
                            long var337 = var270 + 1L;
                            var337 = var270 * var337;
                            long var271 = var337 & 1L;
                            long var358;
                            var249 = (var358 = var271 - 0L) == 0L ? 0 : (var358 < 0L ? -1 : 1);
                            if (var249 != 0) {
                                break label315;
                            }

                            int var273 = var235.isInvisible() ? 1 : 0;
                            long var322 = var3;
                            var15 = var322 + 1L;
                            var15 = var322 * var15;
                            long var323 = var15 & 1L;
                            long var359;
                            var297 = (var359 = var323 - 0L) == 0L ? 0 : (var359 < 0L ? -1 : 1);
                            if (var297 != 0) {
                                var2 &= -1841766811;
                                var2 -= 1970000782;
                                var2 += 164380176;
                                var2 -= 1959219151;
                                var2 ^= 1353908738;
                                break;
                            }
                            var2 = switch (var2) {
                                default -> var2 ^ -419163654;
                                case 368763569 -> {
                                    var2 &= -1425243773;
                                    yield var2 ^ -841696077;
                                }
                                case 1871653802 -> var2 ^ 1085162880;
                            };
                            var297 = var2 + 1;
                            var297 = var2 * var297;
                            int var339 = var2 + 2;
                            var297 *= var339;
                            int var340 = var2 + 3;
                            var297 *= var340;
                            var297 &= 7;
                            if (var297 != 0) {
                                break label315;
                            }

                            if (var273 == 0) {
                                var2 &= 180189370;
                                var2 ^= 745737438;
                                long var274 = var2;
                                var337 = var274 + 1L;
                                var337 = var274 * var337;
                                long var16 = var274 + 2L;
                                var337 *= var16;
                                long var275 = var274 + 3L;
                                var337 *= var275;
                                long var276 = var337 & 7L;
                                long var360;
                                var273 = (var360 = var276 - 0L) == 0L ? 0 : (var360 < 0L ? -1 : 1);
                                if (var273 != 0) {
                                    break label315;
                                }

                                int var278 = i_2.x(var235) ? 1 : 0;
                                Integer var330 = var3;
                                if (var330 == null) {
                                    var2 >>= 25;
                                    var2 <<= 31;
                                    var2 >>>= 28;
                                    var2 ^= 2137186006;
                                    break;
                                }
                                var2 = switch (var2) {
                                    default -> var2 ^ -1987292524;
                                    case -149391658 -> var2 ^ 1374390061;
                                    case 619656428 -> {
                                        var2 ^= -1548564442;
                                        var2 |= -1246791854;
                                        yield var2 ^ 1019744323;
                                    }
                                };
                                int var331 = var2 + 1;
                                var331 = var2 * var331;
                                var331 &= 1;
                                if (var331 != 0) {
                                    break label315;
                                }

                                if (var278 != 0) {
                                    var2 = switch (var2) {
                                        case -1959268455 -> {
                                            var2 -= 1328772443;
                                            var2 *= -1364486355;
                                            yield var2 ^ 1799058176;
                                        }
                                        default -> var2 ^ -1911574598;
                                        case 362273828 -> var2 ^ 558256625;
                                    };
                                    switch (var2) {
                                        case -1753907738:
                                            var2 ^= -1655131803;
                                            var2 ^= 608722372;
                                            break;
                                        case 261102608:
                                            var2 ^= 917158237;
                                            break;
                                        case 1597808019:
                                        default:
                                            var2 ^= -1484855627;
                                    }
                                } else {
                                    var2 = switch (var2) {
                                        case -1959268455 -> {
                                            var2 |= -1443548354;
                                            var2 |= -940714504;
                                            var2 ^= 1678891773;
                                            yield var2 ^ -1242267872;
                                        }
                                        default -> var2 ^ -268923533;
                                        case 357162927 -> var2 ^ 1686823787;
                                    };
                                    long var279 = var2;
                                    var337 = var279 + 1L;
                                    var337 = var279 * var337;
                                    long var280 = var337 & 1L;
                                    long var361;
                                    var278 = (var361 = var280 - 0L) == 0L ? 0 : (var361 < 0L ? -1 : 1);
                                    if (var278 != 0) {
                                        break label315;
                                    }

                                    var278 = var2 * 1081349597;
                                    var278 += -594675734;
                                    var278 += 2080330439;
                                    var278 += 740375923;
                                    var278 ^= -1904185970;
                                    this.JS(var194, var205, var235, var212, var218, var278);
                                    var2 ^= 1281795861;
                                    var2 |= -55407572;
                                    var2 |= 950609720;
                                    var2 ^= -795185544;
                                }
                            } else {
                                var2 >>= 7;
                                var2 ^= 782293252;
                                var2 -= -369775899;
                                var2 &= -837191065;
                                var2 ^= -396057792;
                            }
                        }
                    }
                }
            }

            long var168 = var2;
            long var182 = var168 + 1L;
            long var183 = var168 * var182;
            long var210 = var168 + 2L;
            long var184 = var183 * var210;
            long var169 = var168 + 3L;
            long var185 = var184 * var169;
            long var170 = var185 & 7L;
            long var362;
            var2 = (var362 = var170 - 0L) == 0L ? 0 : (var362 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var173 = new UnsupportedOperationException();
                throw var173;
            }
        }

        AssertionError var172 = new AssertionError();
        throw var172;
    }

    private void JS(Canvas var1, WorldDraw var2, Entity var3, float var4, double var5, int var7) {
        label280: {
            int var9 = System.identityHashCode(this);
            double var10 = var3.lastX;
            double var12 = var3.getX();
            double var14 = var4;
            var10 = TP.y(var10, var12, var14);
            var12 = var3.lastZ;
            var14 = var3.getZ();
            double var16 = var4;
            var12 = TP.y(var12, var14, var16);
            var14 = var3.lastY;
            var16 = var3.getY();
            double var18 = var4;
            var14 = TP.y(var14, var16, var18);
            float var356 = var3.getStandingEyeHeight();
            var16 = var356;
            var14 += var16;
            var14 -= 0.12;
            float var358 = i_2.Aw(var3, var4);
            var16 = var358;
            var16 = Math.toRadians(var16);
            int var374 = var9 + 1;
            int var375 = var9 * var374;
            int var19 = var9 + 2;
            int var376 = var375 * var19;
            var19 = var9 + 3;
            int var377 = var376 * var19;
            int var378 = var377 & 7;
            int var86;
            if (var378 != 0) {
                var86 = var7 * -693141585;
                var86 ^= -1864494129;
            } else {
                label291: {
                    var86 = var7 & -218764013;
                    var86 += -1393593070;
                    var86 ^= 1106308726;
                    long var379 = var86;
                    long var20 = var379 + 1L;
                    var20 = var379 * var20;
                    long var380 = var20 & 1L;
                    long var603;
                    int var381 = (var603 = var380 - 0L) == 0L ? 0 : (var603 < 0L ? -1 : 1);
                    if (var381 != 0) {
                        break label280;
                    }

                    float var382 = i_2.E(var3, var4);
                    var18 = var382;
                    var18 = Math.toRadians(var18);
                    double var398 = Math.sin(var16);
                    double var399 = -var398;
                    var16 = Math.cos(var16);
                    double var22 = -var16;
                    var22 = var22;
                    double var24 = var399;
                    double var26 = Math.cos(var18);
                    var18 = Math.sin(var18);
                    double var28 = var399 * var18;
                    double var456 = var28;
                    double var30 = var26;
                    double var32 = var16 * var18;
                    double var458 = var32;
                    double var400 = var399 * var26;
                    double var401 = var400;
                    var18 = -var18;
                    var18 = var18;
                    var16 *= var26;
                    var16 = var16;
                    Uq var417 = this.f;
                    float var418 = var417.WM();
                    double var419 = var418;
                    double var420 = 0.24 + var419;
                    Uq var34 = this.yQ;
                    float var459 = var34.WM();
                    double var460 = var459;
                    double var461 = var420 + var460;
                    Uq var36 = this.Oc;
                    float var465 = var36.WM();
                    double var466 = var465;
                    double var467 = var466;
                    double var38 = var28 * var461;
                    var38 = var10 + var38;
                    var38 = var38;
                    double var40 = var26 * var461;
                    var40 = var14 + var40;
                    var40 = var40;
                    double var462 = var32 * var461;
                    double var463 = var12 + var462;
                    double var464 = var463;
                    double var42 = var28 * var420;
                    var10 += var42;
                    var10 = var10;
                    var42 = var26 * var420;
                    var14 += var42;
                    var14 = var14;
                    var26 = var32 * var420;
                    var12 += var26;
                    var12 = var12;
                    var26 = var5 * 0.28;
                    Uq var473 = this.fC;
                    float var474 = var473.WM();
                    var42 = var474;
                    var26 *= var42;
                    float var424 = (float)var26;
                    float var425 = var424;
                    Uq var27 = this.iZ;
                    float var454 = var27.WM();
                    float var455 = var454;
                    byte var476 = 0;
                    int var477 = var476;

                    var86 = switch (var86) {
                        case -1940902060 -> {
                            var86 >>>= 31;
                            var86 |= -1338744815;
                            var86 &= 721618888;
                            var86 |= -43908224;
                            yield var86 ^ -884832313;
                        }
                        default -> var86 ^ -1112870261;
                        case -486403977 -> var86 ^ 566033449;
                    };

                    while (var477 <= 48) {
                        var86 += 2029845477;
                        var86 &= -1886365455;
                        var86 += -2084458042;
                        var86 ^= 701622940;
                        int var43 = var86 + 1;
                        var43 = var86 * var43;
                        var43 &= 1;
                        if (var43 != 0) {
                            break label280;
                        }

                        float var498 = var477;
                        float var499 = var498 * (float) (Math.PI * 2);
                        float var500 = var499 / 48.0F;
                        double var501 = var500;
                        int var45 = var9 + 1;
                        var45 = var9 * var45;
                        int var46 = var9 + 2;
                        var45 *= var46;
                        var46 = var9 + 3;
                        var45 *= var46;
                        var45 &= 7;
                        if (var45 != 0) {
                            var86 -= -1058313215;
                            var86 *= -1623260241;
                            var86 ^= -276847256;
                            break label291;
                        }

                        var86 &= -1322762427;
                        var86 &= 1307319506;
                        var86 -= 1786789286;
                        var86 *= -544202737;
                        var86 ^= -252348961;
                        long var507 = var86;
                        long var47 = var507 + 1L;
                        var47 = var507 * var47;
                        long var49 = var507 + 2L;
                        var47 *= var49;
                        long var508 = var507 + 3L;
                        var47 *= var508;
                        long var509 = var47 & 7L;
                        long var604;
                        var45 = (var604 = var509 - 0L) == 0L ? 0 : (var604 < 0L ? -1 : 1);
                        if (var45 != 0) {
                            break label280;
                        }

                        double var511 = Math.cos(var501);
                        double var512 = var511 * var467;
                        double var518 = Math.sin(var501);
                        double var519 = var518 * var467;
                        double[] var521 = this.i;
                        double var50 = var22 * var512;
                        var50 = var10 + var50;
                        double var52 = var401 * var519;
                        var50 += var52;
                        var521[var477] = var50;
                        double[] var522 = this.U;
                        var50 = var18 * var519;
                        var50 = var14 + var50;
                        var522[var477] = var50;
                        double[] var523 = this.TJ;
                        var50 = var24 * var512;
                        var50 = var12 + var50;
                        var52 = var16 * var519;
                        var50 += var52;
                        var523[var477] = var50;
                        double var524 = var477;
                        double var525 = var524 / 48.0;
                        float var526 = (float)var525;
                        float var527 = var526 + var425;
                        var50 = var527;
                        var50 = Math.floor(var50);
                        float var562 = (float)var50;
                        float var528 = var527 - var562;
                        float var529 = var528 - 0.5F;
                        float var530 = Math.abs(var529);
                        float var531 = var530 * 2.0F;
                        float var532 = 1.0F - var531;
                        int[] var563 = this.V;
                        zS var51 = this.c;
                        int var533 = var51.x(var532, var5);
                        var563[var477] = var533;
                        int var534 = var477 + 1;
                        var477 = var534;
                        switch (var86) {
                            case 64719864:
                                var86 ^= -1240401070;
                                break;
                            case 428112601:
                                var86 += 391432689;
                                var86 &= -285569732;
                                var86 += 1923680637;
                                var86 ^= -1516140094;
                                break;
                            case 926625591:
                            default:
                                var86 ^= 600211689;
                        }
                    }
                    var86 = switch (var86) {
                        case 123341934 -> var86 ^ 1326403374;
                        case 908100679 -> {
                            var86 <<= 4;
                            var86 &= 567900478;
                            var86 ^= 395290988;
                            yield var86 ^ -2075738036;
                        }
                        default -> var86 ^ 600862607;
                    };
                    Integer var207 = var86;
                    if (var207 == null) {
                        break label280;
                    }

                    zS var208 = this.c;
                    int var209 = var208.x(1.0F, var5);
                    int var210 = var209;
                    Projection var11 = var2.projection();
                    double var219 = var11.cameraX();
                    double var502 = var219;
                    var11 = var2.projection();
                    double var221 = var11.cameraY();
                    double var513 = var221;
                    var11 = var2.projection();
                    int var256 = var9 + 1;
                    int var257 = var9 * var256;
                    int var258 = var257 & 1;
                    if (var258 != 0) {
                        var86 *= 656606919;
                        var86 ^= 875916154;
                        var86 ^= 1558354901;
                    } else {
                        label277: {
                            var86 >>= 3;
                            var86 -= -2050173356;
                            var86 += -833969383;
                            var86 ^= -1733661218;
                            Integer var259 = var86;
                            if (var259 == null) {
                                break label280;
                            }

                            double var223 = var11.cameraZ();
                            double var520 = var223;
                            Uq var224 = this.yQ;
                            float var225 = var224.WM();
                            double var226 = var225;
                            double var227 = var226;
                            int var13 = 0;
                            var13 = var13;
                            var86 >>>= 27;
                            var86 |= 1599330551;
                            var86 ^= -1815651769;

                            while (var13 < 48) {
                                var86 <<= 16;
                                var86 *= 542281277;
                                var86 >>= 8;
                                var86 ^= -1586758461;
                                int var304 = var86 + 1;
                                int var305 = var86 * var304;
                                int var15 = var86 + 2;
                                int var306 = var305 * var15;
                                var15 = var86 + 3;
                                int var307 = var306 * var15;
                                int var308 = var307 & 7;
                                if (var308 != 0) {
                                    break label280;
                                }

                                var14 = var13;
                                var14 += 0.5;
                                var14 *= (float) (Math.PI * 2);
                                var14 /= 48.0;
                                double var535 = Math.cos(var14);
                                var14 = Math.sin(var14);
                                double var564 = var22 * var535;
                                double var53 = var401 * var14;
                                var564 += var53;
                                var564 *= var227;
                                var53 = var456 * var467;
                                var564 += var53;
                                var53 = var18 * var14;
                                var53 *= var227;
                                double var55 = var30 * var467;
                                var53 += var55;
                                var535 = var24 * var535;
                                var14 = var16 * var14;
                                var14 = var535 + var14;
                                var14 *= var227;
                                var535 = var458 * var467;
                                var14 += var535;
                                double[] var426 = this.i;
                                var535 = var426[var13];
                                double[] var427 = this.i;
                                int var478 = var13 + 1;
                                var55 = var427[var478];
                                var535 += var55;
                                var535 += var38;
                                var535 /= 3.0;
                                double[] var428 = this.U;
                                var55 = var428[var13];
                                double[] var429 = this.U;
                                int var479 = var13 + 1;
                                double var57 = var429[var479];
                                var55 += var57;
                                var55 += var40;
                                var55 /= 3.0;
                                double[] var430 = this.TJ;
                                var57 = var430[var13];
                                double[] var431 = this.TJ;
                                int var480 = var13 + 1;
                                double var59 = var431[var480];
                                var57 += var59;
                                var57 += var464;
                                var57 /= 3.0;
                                var535 = var502 - var535;
                                var55 = var513 - var55;
                                var57 = var520 - var57;
                                var59 = var564 * var535;
                                double var61 = var53 * var55;
                                var59 += var61;
                                var61 = var14 * var57;
                                var59 += var61;
                                var564 *= var564;
                                var53 *= var53;
                                var564 += var53;
                                var14 *= var14;
                                var14 = var564 + var14;
                                var535 *= var535;
                                var564 = var55 * var55;
                                var535 += var564;
                                var564 = var57 * var57;
                                var535 += var564;
                                var14 *= var535;
                                var14 = Math.sqrt(var14);
                                var14 = Math.max(1.0E-6, var14);
                                var14 = var59 / var14;
                                var14 = Math.max(0.0, var14);
                                float var325 = (float)var14;
                                float var326 = 0.55F * var325;
                                float var327 = 0.45F + var326;
                                int[] var341 = this.V;
                                var15 = var341[var13];
                                int[] var432 = this.V;
                                int var481 = var13 + 1;
                                int var433 = var432[var481];
                                var15 = DP.Z(var15, var433, 0.5F);
                                JL var434 = this.n;
                                boolean var435 = var434.vb();
                                long var546 = var9;
                                long var572 = var546 + 1L;
                                long var573 = var546 * var572;
                                long var547 = var573 & 1L;
                                long var605;
                                int var482 = (var605 = var547 - 0L) == 0L ? 0 : (var605 < 0L ? -1 : 1);
                                if (var482 != 0) {
                                    switch (var86) {
                                        case -331179106:
                                            var86 ^= -1989390342;
                                            break label277;
                                        case 1588071619:
                                            var86 ^= -1602120246;
                                            var86 &= -893345404;
                                            var86 &= 588178036;
                                            var86 ^= 630864863;
                                            break label277;
                                        case 2064142083:
                                        default:
                                            var86 ^= 592408039;
                                            break label277;
                                    }
                                }
                                var86 = switch (var86) {
                                    case -1758843305 -> var86 ^ -769302437;
                                    default -> var86 ^ -899962767;
                                    case 1588071619 -> {
                                        var86 += -1403305897;
                                        var86 |= 455229873;
                                        yield var86 ^ -1915371402;
                                    }
                                };
                                int var483 = var86 + 1;
                                int var484 = var86 * var483;
                                int var548 = var86 + 2;
                                int var485 = var484 * var548;
                                int var549 = var86 + 3;
                                int var486 = var485 * var549;
                                int var487 = var486 & 7;
                                if (var487 != 0) {
                                    break label280;
                                }

                                float var439;
                                if (var435) {
                                    var86 >>>= 24;
                                    var86 ^= 1692785975;
                                    int var436 = var86 + 1;
                                    int var437 = var86 * var436;
                                    int var438 = var437 & 1;
                                    if (var438 != 0) {
                                        break label280;
                                    }

                                    var439 = 0.0F;
                                    var86 -= 2010661940;
                                    var86 *= -309759293;
                                    var86 ^= -462777285;
                                    var86 ^= -1880840280;
                                } else {
                                    var86 = switch (var86) {
                                        case -1762226739 -> {
                                            var86 <<= 31;
                                            var86 &= -100861189;
                                            var86 >>>= 7;
                                            var86 += 1062340925;
                                            yield var86 ^ 1132117423;
                                        }
                                        default -> var86 ^ -730443232;
                                        case 1549439977 -> var86 ^ 1067006801;
                                    };
                                    int var488 = var86 + 1;
                                    int var489 = var86 * var488;
                                    int var490 = var489 & 1;
                                    if (var490 != 0) {
                                        break label280;
                                    }

                                    float var491 = var455 * var327;
                                    Integer var550 = var9;
                                    if (var550 == null) {
                                        var86 >>>= 13;
                                        var86 ^= 664445594;
                                        break label277;
                                    }

                                    var86 <<= 16;
                                    var86 ^= -802541263;
                                    Integer var551 = var86;
                                    if (var551 == null) {
                                        break label280;
                                    }

                                    var439 = var491;
                                    var86 &= 1703455608;
                                    var86 >>= 26;
                                    var86 ^= -812819571;
                                }

                                Integer var492 = var86;
                                if (var492 == null) {
                                    break label280;
                                }

                                var15 = DP.Y(var15, var439);
                                int var440 = DP.Z(var210, -1, 0.15F);
                                float var328 = 0.4F * var327;
                                float var329 = 0.6F + var328;
                                float var330 = var455 * var329;
                                int var331 = DP.Y(var440, var330);
                                double[] var441 = this.i;
                                var535 = var441[var13];
                                double[] var442 = this.U;
                                var564 = var442[var13];
                                double[] var443 = this.TJ;
                                var53 = var443[var13];
                                double[] var444 = this.i;
                                int var493 = var13 + 1;
                                var55 = var444[var493];
                                double[] var445 = this.U;
                                int var494 = var13 + 1;
                                var57 = var445[var494];
                                double[] var446 = this.TJ;
                                int var495 = var13 + 1;
                                var59 = var446[var495];
                                long var600 = var9;
                                long var63 = var600 + 1L;
                                var63 = var600 * var63;
                                long var601 = var63 & 1L;
                                long var606;
                                int var447 = (var606 = var601 - 0L) == 0L ? 0 : (var606 < 0L ? -1 : 1);
                                if (var447 != 0) {
                                    var86 &= 240803603;
                                    var86 ^= 697491663;
                                    break label277;
                                }

                                var86 <<= 10;
                                var86 &= -1428255437;
                                var86 >>>= 25;
                                var86 ^= -781140325;
                                var86 ^= 1176956974;
                                int var448 = var86 + 1;
                                int var449 = var86 * var448;
                                int var450 = var449 & 1;
                                if (var450 != 0) {
                                    break label280;
                                }

                                boolean var332 = var2.band(
                                    var1, var535, var564, var53, var55, var57, var59, var38, var40, var464, var38, var40, var464, var15, var331, false
                                );
                                int var333 = var13 + 1;
                                var13 = var333;
                                switch (var86) {
                                    case -1755951451:
                                        var86 += 1564123130;
                                        var86 -= 1188325651;
                                        var86 += 1182816219;
                                        var86 ^= 671722107;
                                        var86 ^= 279049644;
                                        break;
                                    case -1650658595:
                                        var86 ^= 645939943;
                                        break;
                                    case 2098915109:
                                    default:
                                        var86 ^= 1011770679;
                                }
                            }

                            var86 |= 994005845;
                            var86 ^= -149507048;
                            Integer var211 = var86;
                            if (var211 == null) {
                                break label280;
                            }

                            JL var212 = this.T;
                            boolean var213 = var212.vb();
                            int var228 = var9 + 1;
                            int var229 = var9 * var228;
                            int var260 = var9 + 2;
                            int var230 = var229 * var260;
                            int var261 = var9 + 3;
                            int var231 = var230 * var261;
                            int var232 = var231 & 7;
                            if (var232 != 0) {
                                var86 -= -1705043552;
                                var86 ^= 1238431122;
                            } else {
                                var86 &= 766237154;
                                var86 >>= 6;
                                var86 ^= -1893303390;
                                if (!var213) {
                                    var86 |= -1957314418;
                                    var86 ^= -1660662765;
                                    var86 &= -447686212;
                                    var86 |= 24967864;
                                    var86 ^= 592831142;
                                    return;
                                }

                                var86 *= 199490269;
                                var86 += 1755953191;
                                var86 -= -1836022205;
                                var86 >>>= 20;
                                var86 ^= 644200223;
                                long var214 = var86;
                                long var262 = var214 + 1L;
                                long var263 = var214 * var262;
                                long var215 = var263 & 1L;
                                long var607;
                                int var216 = (var607 = var215 - 0L) == 0L ? 0 : (var607 < 0L ? -1 : 1);
                                if (var216 != 0) {
                                    break label280;
                                }

                                byte var217 = 0;
                                long var233 = var9;
                                long var279 = var233 + 1L;
                                long var280 = var233 * var279;
                                long var234 = var280 & 1L;
                                long var608;
                                int var235 = (var608 = var234 - 0L) == 0L ? 0 : (var608 < 0L ? -1 : 1);
                                if (var235 != 0) {
                                    var86 |= -1083528569;
                                    var86 += -2061652410;
                                    var86 &= 1367839384;
                                    var86 ^= 1730132959;
                                } else {
                                    label279: {
                                        var86 ^= 1539983823;
                                        var86 ^= -1467701972;
                                        var86 ^= 276118631;
                                        int var236 = var86 + 1;
                                        int var237 = var86 * var236;
                                        int var264 = var86 + 2;
                                        int var238 = var237 * var264;
                                        int var265 = var86 + 3;
                                        int var239 = var238 * var265;
                                        int var240 = var239 & 7;
                                        if (var240 != 0) {
                                            break label280;
                                        }

                                        int var218 = var217;
                                        var86 -= -396365625;
                                        var86 ^= -493615565;
                                        var86 |= 46448245;
                                        var86 |= 1955932229;
                                        var86 ^= 1037782780;

                                        while (var218 < 48) {
                                            var86 = switch (var86) {
                                                default -> var86 ^ 1448912143;
                                                case 1126478091 -> {
                                                    var86 += 982262778;
                                                    yield var86 ^ -1371928535;
                                                }
                                                case 1676607379 -> var86 ^ 1849353341;
                                            };
                                            Integer var241 = var86;
                                            if (var241 == null) {
                                                break label280;
                                            }

                                            double[] var242 = this.i;
                                            double var243 = var242[var218];
                                            double[] var281 = this.U;
                                            double var282 = var281[var218];
                                            double[] var345 = this.TJ;
                                            double var346 = var345[var218];
                                            long var17 = var9;
                                            long var389 = var17 + 1L;
                                            long var390 = var17 * var389;
                                            long var21 = var17 + 2L;
                                            long var391 = var390 * var21;
                                            var17 += 3L;
                                            long var392 = var391 * var17;
                                            var17 = var392 & 7L;
                                            long var609;
                                            int var367 = (var609 = var17 - 0L) == 0L ? 0 : (var609 < 0L ? -1 : 1);
                                            if (var367 != 0) {
                                                var86 >>= 1;
                                                var86 <<= 1;
                                                var86 -= -515678868;
                                                var86 ^= -706886625;
                                                break label279;
                                            }

                                            var86 *= 1635152279;
                                            var86 ^= -1140466858;
                                            Integer var368 = var86;
                                            if (var368 == null) {
                                                break label280;
                                            }

                                            boolean var244 = var2.at(var1, var243, var282, var346);
                                            if (!var244) {
                                                var86 *= -32011759;
                                                var86 *= 624046967;
                                                var86 ^= -1925643348;
                                                var86 ^= 1252404290;
                                                Integer var245 = var86;
                                                if (var245 == null) {
                                                    break label280;
                                                }

                                                var86 -= 827280794;
                                                var86 *= 991177011;
                                                var86 ^= -1836066406;
                                            } else {
                                                var86 -= 1828229201;
                                                var86 >>= 25;
                                                var86 ^= -1676298573;
                                                float var246 = var2.unitsPerBlock();
                                                float var247 = 0.02F * var246;
                                                float var248 = Math.max(0.6F, var247);
                                                int[] var266 = this.V;
                                                int var267 = var266[var218];
                                                float var283 = var455 + 0.35F;
                                                float var284 = Math.min(1.0F, var283);
                                                int var268 = DP.Y(var267, var284);
                                                long var285 = var9;
                                                long var347 = var285 + 1L;
                                                long var348 = var285 * var347;
                                                var17 = var285 + 2L;
                                                long var349 = var348 * var17;
                                                long var286 = var285 + 3L;
                                                long var350 = var349 * var286;
                                                long var287 = var350 & 7L;
                                                long var610;
                                                var13 = (var610 = var287 - 0L) == 0L ? 0 : (var610 < 0L ? -1 : 1);
                                                if (var13 != 0) {
                                                    var86 |= 2069517484;
                                                    var86 |= -577748313;
                                                    var86 |= 703344063;
                                                    var86 >>= 31;
                                                    var86 ^= -664452064;
                                                    break label279;
                                                }

                                                var86 -= 949217436;
                                                var86 *= 1459752481;
                                                var86 -= -285673882;
                                                var86 ^= 62135766;
                                                var13 = var86 + 1;
                                                var13 = var86 * var13;
                                                var13 &= 1;
                                                if (var13 != 0) {
                                                    break label280;
                                                }

                                                double[] var292 = this.i;
                                                double var293 = var292[var218];
                                                var345 = this.U;
                                                double var352 = var345[var218];
                                                double[] var370 = this.TJ;
                                                double var371 = var370[var218];
                                                double[] var393 = this.i;
                                                int var402 = var218 + 1;
                                                double var394 = var393[var402];
                                                double[] var404 = this.U;
                                                int var409 = var218 + 1;
                                                double var405 = var404[var409];
                                                double[] var23 = this.TJ;
                                                int var414 = var218 + 1;
                                                double var411 = var23[var414];
                                                float var25 = var248 * 3.5F;
                                                int var451 = DP.nq(var268, 0.35F);
                                                Paint var452 = Paint.solid(var451);
                                                float var457 = var248 * 1.6F;
                                                Paint var453 = var452.soft(var457);
                                                boolean var294 = var2.line(var1, var293, var352, var371, var394, var405, var411, var25, var453);
                                                double[] var295 = this.i;
                                                double var296 = var295[var218];
                                                var345 = this.U;
                                                double var354 = var345[var218];
                                                double[] var372 = this.TJ;
                                                double var373 = var372[var218];
                                                double[] var395 = this.i;
                                                int var403 = var218 + 1;
                                                double var396 = var395[var403];
                                                double[] var406 = this.U;
                                                int var410 = var218 + 1;
                                                double var407 = var406[var410];
                                                var23 = this.TJ;
                                                int var415 = var218 + 1;
                                                double var413 = var23[var415];
                                                int var416 = var268 | 16777215;
                                                int var269 = DP.Z(var268, var416, 0.3F);
                                                Paint var270 = Paint.solid(var269);
                                                boolean var249 = var2.line(var1, var296, var354, var373, var396, var407, var413, var248, var270);
                                                var86 <<= 20;
                                                var86 -= -1871111852;
                                                var86 ^= 1634089380;
                                            }

                                            Integer var250 = var86;
                                            if (var250 == null) {
                                                break label280;
                                            }

                                            int var251 = var218 + 1;
                                            long var271 = var9;
                                            long var334 = var271 + 1L;
                                            long var335 = var271 * var334;
                                            long var272 = var335 & 1L;
                                            long var611;
                                            int var273 = (var611 = var272 - 0L) == 0L ? 0 : (var611 < 0L ? -1 : 1);
                                            if (var273 != 0) {
                                                var86 -= 569922065;
                                                var86 ^= 246560552;
                                                break label279;
                                            }

                                            var86 *= 1124174671;
                                            var86 ^= 1757160546;
                                            long var274 = var86;
                                            long var336 = var274 + 1L;
                                            long var337 = var274 * var336;
                                            long var364 = var274 + 2L;
                                            long var338 = var337 * var364;
                                            long var275 = var274 + 3L;
                                            long var339 = var338 * var275;
                                            long var276 = var339 & 7L;
                                            long var612;
                                            int var277 = (var612 = var276 - 0L) == 0L ? 0 : (var612 < 0L ? -1 : 1);
                                            if (var277 != 0) {
                                                break label280;
                                            }

                                            var218 = var251;
                                            switch (var86) {
                                                case -1924644932:
                                                    var86 ^= -742577676;
                                                    break;
                                                case -1745219814:
                                                    var86 ^= 184675970;
                                                    var86 *= -1942228873;
                                                    var86 ^= 2042162339;
                                                    break;
                                                case 1171101783:
                                                default:
                                                    var86 ^= 718150616;
                                            }
                                        }

                                        var86 &= 2083414410;
                                        var86 += 2073818422;
                                        var86 |= 502402001;
                                        var86 ^= 1784281073;
                                        Integer var188 = var86;
                                        if (var188 != null) {
                                            return;
                                        }
                                        break label280;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            Integer var202 = var86;
            if (var202 != null) {
                RuntimeException var203 = new RuntimeException();
                throw var203;
            }
        }

        UnsupportedOperationException var201 = new UnsupportedOperationException();
        throw var201;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 458407706;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        p = var4;
    }
}
