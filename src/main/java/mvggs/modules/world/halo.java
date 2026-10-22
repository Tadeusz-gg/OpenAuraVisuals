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
import java.util.Iterator;
import net.minecraft.entity.Entity;

public final class halo extends Yn {
    private static final int L = 24;
    private static final double q;
    private final Uq a;
    private final Uq xD;
    private final Uq M;
    private final Uq I;
    private final Uq qD;
    private final Uq Y;
    private final zS lL;
    private final JL K;
    public static final int Ec;

    public halo() {
        super("halo", "Halo", AJ.WORLD);
        AJ var1 = AJ.WORLD;

        Uq var2 = new Uq("souls", "Souls", 2.0F, 1.0F, 4.0F);
        Uq var3 = var2.W(1.0F);
        xB var4 = this.vn(var3);
        Uq var5 = (Uq)var4;
        this.a = var5;
        Uq var6 = new Uq("radius", "Radius", 0.3F, 0.2F, 0.6F);
        Uq var7 = var6.W(0.01F);
        Uq var8 = var7.L("m");
        xB var9 = this.vn(var8);
        Uq var10 = (Uq)var9;
        this.xD = var10;
        Uq var11 = new Uq("speed", "Speed", 1.0F, 0.1F, 3.0F);
        Uq var12 = var11.W(0.05F);
        Uq var13 = var12.L("x");
        xB var14 = this.vn(var13);
        Uq var15 = (Uq)var14;
        this.M = var15;
        Uq var16 = new Uq("size", "Soul Size", 1.0F, 0.3F, 2.0F);
        Uq var17 = var16.W(0.05F);
        Uq var18 = var17.L("x");
        xB var19 = this.vn(var18);
        Uq var20 = (Uq)var19;
        this.I = var20;
        Uq var21 = new Uq("lift", "Height", 0.1F, -0.3F, 0.6F);
        Uq var22 = var21.W(0.01F);
        Uq var23 = var22.L("m");
        xB var24 = this.vn(var23);
        Uq var25 = (Uq)var24;
        this.qD = var25;
        Uq var26 = new Uq("glow", "Glow", 0.85F, 0.0F, 1.0F);
        Uq var27 = var26.W(0.05F);
        xB var28 = this.vn(var27);
        Uq var29 = (Uq)var28;
        this.Y = var29;
        zS var30 = new zS();
        nM var31 = this.bU(var30);
        zS var32 = (zS)var31;
        this.lL = var32;
        JL var33 = new JL("players", "Other Players", false);
        xB var34 = this.vn(var33);
        JL var35 = (JL)var34;
        this.K = var35;
        this.dy("Two souls of light circling above the head.");
        wD<T> var36 = this::L;
        this.iI(T.class, var36);
    }

    private void L(T var1) {
        int var2 = Ec;
        var2 ^= 2067178001;
        int var3 = System.identityHashCode(this);
        RenderPhase var4 = var1.phase();
        Integer var5 = var3;
        if (var5 == null) {
            var2 += -673221941;
            var2 += 1112755084;
            var2 <<= 13;
            var2 ^= -1309584691;
        } else {
            label296: {
                var2 |= 1998328191;
                var2 *= -1847515831;
                var2 <<= 18;
                var2 ^= -2056788944;
                long var202 = var2;
                long var7 = var202 + 1L;
                var7 = var202 * var7;
                long var203 = var7 & 1L;
                long var351;
                int var204 = (var351 = var203 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                if (var204 == 0) {
                    RenderPhase var205 = RenderPhase.WORLD;
                    if (var4 != var205) {
                        switch (var2) {
                            case -1765293365:
                                var2 ^= -1924099474;
                                break;
                            case -384940172:
                            default:
                                var2 ^= -2007722150;
                                break;
                            case 1304159280:
                                var2 <<= 20;
                                var2 ^= -903885938;
                        }

                        return;
                    }

                    var2 &= 355893802;
                    var2 <<= 22;
                    var2 *= -1881775697;
                    var2 ^= -2027728603;
                    var2 ^= 1034249408;
                    int var195 = var2 + 1;
                    int var196 = var2 * var195;
                    var204 = var2 + 2;
                    int var197 = var196 * var204;
                    var204 = var2 + 3;
                    int var198 = var197 * var204;
                    int var199 = var198 & 7;
                    if (var199 == 0) {
                        Entity var200 = i_2.QI();
                        Entity var201 = var200;
                        var204 = var3 + 1;
                        var204 = var3 * var204;
                        var204 &= 1;
                        if (var204 != 0) {
                            var2 &= 1962576984;
                            var2 *= 1674745203;
                            var2 &= 1786740488;
                            var2 ^= -125732147;
                            break label296;
                        }

                        var2 += 471066450;
                        var2 += -1716273154;
                        var2 ^= 160268514;
                        if (var200 == null) {
                            var2 >>>= 18;
                            var2 &= -384767240;
                            var2 |= 1645110223;
                            var2 >>>= 11;
                            var2 ^= 1557908749;
                            return;
                        }

                        var2 >>= 18;
                        var2 ^= -550451674;
                        var2 += -1221431415;
                        var2 <<= 8;
                        var2 ^= 1896448042;
                        var204 = var2 + 1;
                        var204 = var2 * var204;
                        int var6 = var2 + 2;
                        var204 *= var6;
                        var6 = var2 + 3;
                        var204 *= var6;
                        var204 &= 7;
                        if (var204 == 0) {
                            Canvas var216 = var1.canvas();
                            Canvas var217 = var216;
                            Ud var219 = Ud.Z();
                            AuraPipeline var220 = var219.Ul();
                            WorldDraw var221 = var220.world();
                            WorldDraw var222 = var221;
                            FrameContext var224 = var1.frame();
                            float var225 = var224.partialTick();
                            float var226 = var225;
                            FrameContext var8 = var1.frame();
                            double var227 = var8.time();
                            double var228 = var227;
                            var216.save();
                            Uq var10 = this.Y;
                            float var229 = var10.WM();
                            long var11 = var3;
                            long var13 = var11 + 1L;
                            var13 = var11 * var13;
                            long var15 = var11 + 2L;
                            var13 *= var15;
                            var11 += 3L;
                            var13 *= var11;
                            var11 = var13 & 7L;
                            long var352;
                            int var235 = (var352 = var11 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                            if (var235 != 0) {
                                switch (var2) {
                                    case -1398007314:
                                    default:
                                        var2 ^= 316920462;
                                        break label296;
                                    case 306208554:
                                        var2 |= -1809347647;
                                        var2 ^= 210210086;
                                        break label296;
                                    case 1267831384:
                                        var2 ^= 693678329;
                                        break label296;
                                }
                            }
                            var2 = switch (var2) {
                                default -> var2 ^ -782332661;
                                case 13192153 -> var2 ^ -1681594745;
                                case 306208554 -> {
                                    var2 += 2049228032;
                                    var2 |= -1466414147;
                                    var2 += -449282575;
                                    yield var2 ^ -1858070295;
                                }
                            };
                            int var236 = var2 + 1;
                            int var237 = var2 * var236;
                            int var12 = var2 + 2;
                            int var238 = var237 * var12;
                            var12 = var2 + 3;
                            int var239 = var238 * var12;
                            int var240 = var239 & 7;
                            if (var240 == 0) {
                                var216.additive(var229);
                                Iterable var230 = i_2.S();
                                Iterator var231 = var230.iterator();
                                Iterator var232 = var231;
                                var2 -= 1154241255;
                                var2 >>>= 1;
                                var2 &= -1846022097;
                                var2 ^= 441657958;

                                while (true) {
                                    boolean var241 = var232.hasNext();
                                    var12 = var3 + 1;
                                    var12 = var3 * var12;
                                    var12 &= 1;
                                    if (var12 != 0) {
                                        switch (var2) {
                                            case 185047631:
                                                var2 >>>= 19;
                                                var2 &= 248122970;
                                                var2 &= 1882094018;
                                                var2 ^= -1696574835;
                                                break label296;
                                            case 220244878:
                                            default:
                                                var2 ^= 659091876;
                                                break label296;
                                            case 2110109455:
                                                var2 ^= 2048209277;
                                                break label296;
                                        }
                                    }
                                    var2 = switch (var2) {
                                        default -> var2 ^ 689092616;
                                        case 185047631 -> {
                                            var2 >>= 22;
                                            var2 -= 1178568869;
                                            yield var2 ^ -431098482;
                                        }
                                        case 553179169 -> var2 ^ -1799106307;
                                    };
                                    if (!var241) {
                                        var2 |= -1521245779;
                                        var2 ^= 1005737008;
                                        var217.restore();
                                        return;
                                    }

                                    var2 >>= 10;
                                    var2 ^= -883557298;
                                    Integer var242 = var2;
                                    if (var242 == null) {
                                        break;
                                    }

                                    Object var243 = var232.next();
                                    Entity var244 = (Entity)var243;
                                    var12 = var3 + 1;
                                    var12 = var3 * var12;
                                    int var290 = var3 + 2;
                                    var12 *= var290;
                                    int var291 = var3 + 3;
                                    var12 *= var291;
                                    var12 &= 7;
                                    if (var12 != 0) {
                                        switch (var2) {
                                            case -1051479188:
                                            default:
                                                var2 ^= 11675387;
                                                break label296;
                                            case -884859090:
                                                var2 += -219193221;
                                                var2 >>= 20;
                                                var2 <<= 19;
                                                var2 *= -500346427;
                                                var2 ^= -543665459;
                                                break label296;
                                            case 1241682305:
                                                var2 ^= -1431496148;
                                                break label296;
                                        }
                                    }
                                    var2 = switch (var2) {
                                        default -> var2 ^ 513145615;
                                        case -1044171150 -> var2 ^ 244394923;
                                        case -884859090 -> {
                                            var2 |= -1569316606;
                                            yield var2 ^ 462734604;
                                        }
                                    };
                                    Integer var254 = var2;
                                    if (var254 == null) {
                                        break;
                                    }

                                    boolean var255;
                                    if (var244 == var201) {
                                        var2 ^= 1496486641;
                                        var2 ^= 1442491665;
                                        var255 = true;
                                        switch (var2) {
                                            case -64305726:
                                                var2 ^= 1423116724;
                                                var2 ^= 1453551532;
                                                var2 ^= -1534741387;
                                                break;
                                            case 895371550:
                                                var2 ^= 2040505610;
                                                break;
                                            case 1229962944:
                                            default:
                                                var2 ^= -453727975;
                                        }
                                    } else {
                                        var2 *= 439283941;
                                        var2 ^= -2017792633;
                                        var255 = false;
                                        var2 >>>= 3;
                                        var2 ^= 1599929874;
                                    }

                                    var13 = var3;
                                    var15 = var13 + 1L;
                                    var15 = var13 * var15;
                                    var13 = var15 & 1L;
                                    long var353;
                                    int var294 = (var353 = var13 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                                    if (var294 != 0) {
                                        var2 *= -213545089;
                                        var2 ^= -1460481508;
                                        break label296;
                                    }

                                    var2 >>>= 6;
                                    var2 ^= -1721750706;
                                    var2 ^= -857176415;
                                    int var295 = var2 + 1;
                                    int var296 = var2 * var295;
                                    int var297 = var296 & 1;
                                    if (var297 != 0) {
                                        break;
                                    }

                                    if (var255) {
                                        var2 *= -288467767;
                                        var2 >>>= 18;
                                        var2 |= -1556869264;
                                        var2 ^= -685525108;
                                        int var256 = var2 + 1;
                                        var256 = var2 * var256;
                                        var256 &= 1;
                                        if (var256 != 0) {
                                            break;
                                        }

                                        boolean var259 = i_2.ax();
                                        var13 = var3;
                                        var15 = var13 + 1L;
                                        var15 = var13 * var15;
                                        var13 = var15 & 1L;
                                        long var354;
                                        int var300 = (var354 = var13 - 0L) == 0L ? 0 : (var354 < 0L ? -1 : 1);
                                        if (var300 != 0) {
                                            var2 &= -165183309;
                                            var2 ^= -286797057;
                                            break label296;
                                        }

                                        var2 |= 182713482;
                                        var2 -= 497570998;
                                        var2 -= 1335840669;
                                        var2 -= -1166488718;
                                        var2 ^= 789634248;
                                        if (var259) {
                                            var2 = switch (var2) {
                                                default -> var2 ^ -1907903868;
                                                case -82659507 -> var2 ^ -658510354;
                                                case 2015842813 -> {
                                                    var2 *= -650990983;
                                                    var2 -= -296333345;
                                                    var2 -= -2058013286;
                                                    var2 *= 1636966305;
                                                    yield var2 ^ 460274617;
                                                }
                                            } & 1277375627;
                                            var2 &= -2089952937;
                                            var2 *= 1442800247;
                                            var2 |= 1659632398;
                                            var2 ^= 1828217136;
                                            continue;
                                        }

                                        var2 &= 32025333;
                                        var2 -= -901471009;
                                        var2 ^= 1907080930;
                                    } else {
                                        var2 -= 837316343;
                                        var2 ^= -320193871;
                                        var254 = var2;
                                        if (var254 == null) {
                                            break;
                                        }

                                        JL var261 = this.K;
                                        int var301 = var3 + 1;
                                        int var302 = var3 * var301;
                                        int var14 = var3 + 2;
                                        int var303 = var302 * var14;
                                        var14 = var3 + 3;
                                        int var304 = var303 * var14;
                                        int var305 = var304 & 7;
                                        if (var305 != 0) {
                                            var2 &= -571484712;
                                            var2 -= 961837341;
                                            var2 *= 1934641199;
                                            var2 &= 1918349158;
                                            var2 ^= -621420567;
                                            break label296;
                                        }

                                        var2 |= -1835751796;
                                        var2 &= -2136239969;
                                        var2 >>>= 18;
                                        var2 &= -323970469;
                                        var2 ^= -1736930807;
                                        boolean var262 = var261.vb();
                                        if (!var262) {
                                            switch (var2) {
                                                case -1736930807:
                                                    var2 >>= 26;
                                                    var2 ^= -185047639;
                                                    continue;
                                                case 427674846:
                                                    var2 ^= 272529507;
                                                    continue;
                                                case 1611987177:
                                                default:
                                                    var2 ^= 1476534429;
                                                    continue;
                                            }
                                        }

                                        var2 -= 179445237;
                                        var2 *= -584278815;
                                        var2 -= -2125368506;
                                        var2 -= 757874723;
                                        var2 ^= -946405046;
                                        int var263 = var2 + 1;
                                        var263 = var2 * var263;
                                        int var306 = var2 + 2;
                                        var263 *= var306;
                                        int var307 = var2 + 3;
                                        var263 *= var307;
                                        var263 &= 7;
                                        if (var263 != 0) {
                                            break;
                                        }

                                          int var268 = i_2.Jr(var244) ? 1 : 0;
                                        var13 = var3;
                                        var15 = var13 + 1L;
                                        var15 = var13 * var15;
                                        var13 = var15 & 1L;
                                        long var355;
                                        int var310 = (var355 = var13 - 0L) == 0L ? 0 : (var355 < 0L ? -1 : 1);
                                        if (var310 != 0) {
                                            switch (var2) {
                                                case 1363258570:
                                                    var2 ^= -1303338332;
                                                    break label296;
                                                case 1772387169:
                                                    var2 ^= -216059854;
                                                    var2 *= -776388651;
                                                    var2 += -634066609;
                                                    var2 &= -62189742;
                                                    var2 ^= 2062241951;
                                                    break label296;
                                                case 2055865669:
                                                default:
                                                    var2 ^= -2089753278;
                                                    break label296;
                                            }
                                        }

                                        var2 += -178353149;
                                        var2 -= -1273833130;
                                        var2 += -1844203918;
                                        var2 |= -1909905143;
                                        var2 ^= 398475660;
                                        var13 = var2;
                                        var15 = var13 + 1L;
                                        var15 = var13 * var15;
                                        long var17 = var13 + 2L;
                                        var15 *= var17;
                                        var13 += 3L;
                                        var15 *= var13;
                                        var13 = var15 & 7L;
                                        long var356;
                                        int var314 = (var356 = var13 - 0L) == 0L ? 0 : (var356 < 0L ? -1 : 1);
                                        if (var314 != 0) {
                                            break;
                                        }

                                        if (var268 == 0) {
                                            var2 = switch (var2) {
                                                case -1460945915 -> {
                                                    var2 ^= 813867292;
                                                    yield var2 ^ -837781387;
                                                }
                                                case 144753679 -> var2 ^ 556357366;
                                                default -> var2 ^ -791844138;
                                            };
                                            long var284 = var2;
                                            long var329 = var284 + 1L;
                                            long var330 = var284 * var329;
                                            long var285 = var330 & 1L;
                                            long var357;
                                            var268 = (var357 = var285 - 0L) == 0L ? 0 : (var357 < 0L ? -1 : 1);
                                            if (var268 != 0) {
                                                break;
                                            }

                                            var2 <<= 24;
                                            var2 ^= 1169575842;
                                            var2 >>>= 13;
                                            var2 *= -1817833477;
                                            var2 ^= -1488518711;
                                            continue;
                                        }

                                        var2 &= 1477342434;
                                        var2 &= -2044685636;
                                        var2 &= -529643310;
                                        var2 ^= 1148248820;
                                    }

                                    var254 = var2;
                                    if (var254 == null) {
                                        break;
                                    }

                                    boolean var270 = var244.isInvisible();
                                    var13 = var3;
                                    var15 = var13 + 1L;
                                    var15 = var13 * var15;
                                    long var349 = var13 + 2L;
                                    var15 *= var349;
                                    var13 += 3L;
                                    var15 *= var13;
                                    var13 = var15 & 7L;
                                    long var358;
                                    int var318 = (var358 = var13 - 0L) == 0L ? 0 : (var358 < 0L ? -1 : 1);
                                    if (var318 != 0) {
                                        var2 += 17525350;
                                        var2 &= 1938363117;
                                        var2 ^= 75345109;
                                        var2 ^= 1988689828;
                                        var2 ^= -1457716748;
                                        break label296;
                                    }

                                    var2 |= -1586891110;
                                    var2 *= -1091051933;
                                    var2 *= -145328011;
                                    var2 ^= -824141247;
                                    var13 = var2;
                                    var15 = var13 + 1L;
                                    var15 = var13 * var15;
                                    var349 = var13 + 2L;
                                    var15 *= var349;
                                    var13 += 3L;
                                    var15 *= var13;
                                    var13 = var15 & 7L;
                                    long var359;
                                    int var322 = (var359 = var13 - 0L) == 0L ? 0 : (var359 < 0L ? -1 : 1);
                                    if (var322 != 0) {
                                        break;
                                    }

                                    if (!var270) {
                                        var2 ^= 1571615669;
                                        var2 ^= -944745817;
                                        long var271 = var2;
                                        long var327 = var271 + 1L;
                                        var327 = var271 * var327;
                                        long var272 = var327 & 1L;
                                        long var360;
                                        int var273 = (var360 = var272 - 0L) == 0L ? 0 : (var360 < 0L ? -1 : 1);
                                        if (var273 != 0) {
                                            break;
                                        }

                                          int var274 = i_2.x(var244) ? 1 : 0;
                                        Integer var323 = var3;
                                        if (var323 == null) {
                                            var2 ^= 2020200182;
                                            var2 <<= 6;
                                            var2 ^= 1009883917;
                                            break label296;
                                        }
                                        var2 = switch (var2) {
                                            case 384993745 -> {
                                                var2 &= 995802133;
                                                yield var2 ^ -1362060590;
                                            }
                                            case 1021666535 -> var2 ^ 346355623;
                                            default -> var2 ^ -129090502;
                                        };
                                        if (var274 != 0) {
                                            var2 ^= -1606766446;
                                            var2 ^= -1016567703;
                                            var2 ^= -731150603;
                                            var274 = var2 + 1;
                                            var274 = var2 * var274;
                                            int var324 = var2 + 2;
                                            var274 *= var324;
                                            int var325 = var2 + 3;
                                            var274 *= var325;
                                            var274 &= 7;
                                            if (var274 != 0) {
                                                break;
                                            }

                                            var2 -= 1142454531;
                                            var2 *= -1959320297;
                                            var2 ^= -1381719191;
                                        } else {
                                            var2 = switch (var2) {
                                                case -1132326205 -> {
                                                    var2 *= 966224309;
                                                    yield var2 ^ -485239396;
                                                }
                                                default -> var2 ^ -1956374437;
                                                case 1982888766 -> var2 ^ 701193406;
                                            };
                                            Integer var280 = var2;
                                            if (var280 == null) {
                                                break;
                                            }

                                            int var281 = var2 - 940650521;
                                            var281 += -2146889172;
                                            var281 ^= -775014650;
                                            this.ZW(var217, var222, var244, var226, var228, var281);
                                            var2 += 1072078324;
                                            var2 -= -1104475204;
                                            var2 ^= 368819578;
                                            var2 ^= -1635427762;
                                        }
                                    } else {
                                        var2 &= 788559880;
                                        var2 &= 550215282;
                                        var2 *= -1264943571;
                                        var2 |= 1291925049;
                                        var2 ^= -722017162;
                                    }
                                }
                            }
                        }
                    }
                }

                RuntimeException var194 = new RuntimeException();
                throw var194;
            }
        }

        IllegalArgumentException var193 = new IllegalArgumentException();
        throw var193;
    }

    private void ZW(Canvas var1, WorldDraw var2, Entity var3, float var4, double var5, int var7) {
        label186: {
            int var9 = System.identityHashCode(this);
            double var10 = var3.lastX;
            int var12 = var9 + 1;
            var12 = var9 * var12;
            int var13 = var9 + 2;
            var12 *= var13;
            var13 = var9 + 3;
            var12 *= var13;
            var12 &= 7;
            int var98;
            if (var12 != 0) {
                switch (var7) {
                    case -1753482672:
                        var98 = var7 ^ 1071776370;
                        var98 &= 88708447;
                        var98 ^= 1197060904;
                        break;
                    case -1298083739:
                        var98 = var7 ^ -1157530930;
                        break;
                    case 600171489:
                    default:
                        var98 = var7 ^ -1231092667;
                }
            } else {
                var98 = var7 * 532577455;
                var98 ^= 894898115;
                var12 = var98 + 1;
                var12 = var98 * var12;
                var13 = var98 + 2;
                var12 *= var13;
                var13 = var98 + 3;
                var12 *= var13;
                var12 &= 7;
                if (var12 != 0) {
                    break label186;
                }

                double var143 = var3.getX();
                double var14 = var4;
                var10 = TP.y(var10, var143, var14);
                var10 = var10;
                double var144 = var3.lastZ;
                var14 = var3.getZ();
                double var16 = var4;
                double var145 = TP.y(var144, var14, var16);
                double var146 = var145;
                var14 = var3.lastY;
                var16 = var3.getY();
                double var18 = var4;
                var14 = TP.y(var14, var16, var18);
                float var157 = var3.getHeight();
                var16 = var157;
                var14 += var16;
                Uq var159 = this.qD;
                float var160 = var159.WM();
                var16 = var160;
                var14 += var16;
                var14 = var14;
                Uq var162 = this.xD;
                float var163 = var162.WM();
                var16 = var163;
                var16 = var16;
                var18 = Math.toRadians(320.0);
                var18 = var5 * var18;
                Uq var20 = this.M;
                float var171 = var20.WM();
                double var172 = var171;
                var18 *= var172;
                int var173 = var3.getId();
                double var174 = var173;
                double var175 = var174 * 1.7;
                var18 += var175;
                var18 = var18;
                var20 = this.a;
                  int var177 = var20.B();
                int var178 = var177;
                Uq var21 = this.I;
                float var179 = var21.WM();
                float var180 = 0.17F * var179;
                float var181 = var180;
                Uq var22 = this.I;
                float var182 = var22.WM();
                float var183 = 0.04F * var182;
                float var184 = var183;
                int var23 = 0;
                var23 = var23;
                var98 *= 1985453445;
                var98 += -61215827;
                var98 *= -1038585967;
                var98 ^= 433195811;

                label173:
                while (true) {
                    Integer var24 = var98;
                    if (var24 == null) {
                        break label186;
                    }

                    if (var23 >= var178) {
                        var98 += -802778603;
                        var98 ^= 1169844486;
                        Integer var126 = var98;
                        if (var126 != null) {
                            return;
                        }
                        break label186;
                    }

                    var98 += 71975095;
                    var98 ^= 940755504;
                    long var186 = var98;
                    long var26 = var186 + 1L;
                    var26 = var186 * var26;
                    long var28 = var186 + 2L;
                    var26 *= var28;
                    long var187 = var186 + 3L;
                    var26 *= var187;
                    long var188 = var26 & 7L;
                    long var290;
                    int var189 = (var290 = var188 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                    if (var189 != 0) {
                        break label186;
                    }

                    float var190 = var23;
                    float var191 = var190 * (float) (Math.PI * 2);
                    float var25 = var178;
                    float var192 = var191 / var25;
                    double var193 = var192;
                    double var194 = var18 + var193;
                    var26 = var9;
                    var28 = var26 + 1L;
                    var28 = var26 * var28;
                    long var30 = var26 + 2L;
                    var28 *= var30;
                    var26 += 3L;
                    var28 *= var26;
                    var26 = var28 & 7L;
                    long var291;
                    int var208 = (var291 = var26 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                    if (var208 != 0) {
                        var98 >>= 12;
                        var98 += -279444614;
                        var98 -= -1191989030;
                        var98 >>>= 13;
                        var98 ^= 1196527721;
                        break;
                    }

                    var98 >>= 8;
                    var98 *= 210944661;
                    var98 ^= 1518304760;
                    var98 ^= 285748458;
                    int var209 = var98 + 1;
                    int var210 = var98 * var209;
                    int var211 = var210 & 1;
                    if (var211 != 0) {
                        break label186;
                    }

                    double var195 = var194;
                    zS var212 = this.lL;
                    float var27 = var23;
                    float var224 = var178;
                    var27 /= var224;
                    int var213 = var212.x(var27, var5);
                    int var214 = var213;
                    byte var216 = 0;
                    int var217 = var216;

                    var98 = switch (var98) {
                        default -> var98 ^ 588228466;
                        case -1848198726 -> var98 ^ 1198547480;
                        case 732987977 -> {
                            var98 *= 567526527;
                            var98 &= -1211486766;
                            var98 -= 1428638230;
                            var98 -= 1757887039;
                            yield var98 ^ -2091150582;
                        }
                    };

                    while (var217 < 24) {
                        var98 |= 1890457605;
                        var98 += -1848566943;
                        var98 ^= 1237110861;
                        var98 ^= 1428190197;
                        float var225 = var217;
                        var225++;
                        float var227 = var225 / 24.0F;
                        double var29 = var227;
                        var29 = 1.0 - var29;
                        double var31 = q;
                        var29 *= var31;
                        var29 = var195 - var29;
                        var31 = Math.cos(var29);
                        var31 *= var16;
                        var31 = var10 + var31;
                        var29 = Math.sin(var29);
                        long var33 = var9;
                        long var35 = var33 + 1L;
                        var35 = var33 * var35;
                        var33 = var35 & 1L;
                        long var292;
                        int var270 = (var292 = var33 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                        if (var270 != 0) {
                            var98 -= 1301850711;
                            var98 ^= -2116799901;
                            break label173;
                        }

                        var98 *= -1195950841;
                        var98 ^= 1473135961;
                        var29 *= var16;
                        var29 = var146 + var29;
                        boolean var241 = var2.at(var1, var31, var14, var29);
                        if (!var241) {
                            var98 = switch (var98) {
                                case -753925063 -> {
                                    var98 *= -1776021317;
                                    var98 *= -609331861;
                                    yield var98 ^ 596069810;
                                }
                                case 932304967 -> var98 ^ 609236654;
                                default -> var98 ^ 911989813;
                            } - 577480126;
                            var98 += 256615953;
                            var98 >>>= 3;
                            var98 *= -1543443509;
                            var98 ^= -655171079;
                        } else {
                            var98 |= 711121028;
                            var98 ^= 763001725;
                            var98 += 1219884848;
                            var98 -= -1261419366;
                            var98 ^= -190665022;
                            float var242 = var2.unitsPerBlock();
                            float var247 = TP.GO(var184, var181, var227);
                            float var243 = var247 * var242;
                            float var293;
                            int var248 = (var293 = var243 - 0.15F) == 0.0F ? 0 : (var293 < 0.0F ? -1 : 1);
                            int var258 = var9 + 1;
                            int var259 = var9 * var258;
                            int var260 = var259 & 1;
                            if (var260 != 0) {
                                switch (var98) {
                                    case -2068939139:
                                        var98 ^= -255797969;
                                        break label173;
                                    case -1712959568:
                                    default:
                                        var98 ^= 1488575160;
                                        break label173;
                                    case -1655901036:
                                        var98 *= -961198775;
                                        var98 *= -961414853;
                                        var98 ^= -1181182678;
                                        var98 ^= 525353980;
                                        break label173;
                                }
                            }
                            var98 = switch (var98) {
                                case -1655901036 -> {
                                    var98 -= -399655809;
                                    var98 += 1182837729;
                                    yield var98 ^ 813018633;
                                }
                                default -> var98 ^ 1784979406;
                                case -422083306 -> var98 ^ 1462633690;
                            };
                            int var261 = var98 + 1;
                            int var262 = var98 * var261;
                            int var32 = var98 + 2;
                            int var263 = var262 * var32;
                            var32 = var98 + 3;
                            int var264 = var263 * var32;
                            int var265 = var264 & 7;
                            if (var265 != 0) {
                                break label186;
                            }

                            if (var248 < 0) {
                                var98 &= 385323680;
                                var98 -= 840927561;
                                var98 ^= 881661253;
                                int var249 = var98 + 1;
                                int var250 = var98 * var249;
                                int var251 = var250 & 1;
                                if (var251 != 0) {
                                    break label186;
                                }

                                var98 >>>= 23;
                                var98 += -169333302;
                                var98 ^= 1254063564;
                                var98 ^= 340746867;
                            } else {
                                var98 = switch (var98) {
                                    case -873837057 -> {
                                        var98 += -1987879997;
                                        yield var98 ^ 115629134;
                                    }
                                    case -707820168 -> var98 ^ -1576423316;
                                    default -> var98 ^ 427411371;
                                };
                                float var252 = 0.2F * var227;
                                float var228 = var252 * var227;
                                float var229 = 0.05F + var228;
                                int var230 = DP.Y(var214, var229);
                                var1.save();
                                float var253 = var2.depth();
                                var1.depth(var253);
                                SpriteShape var254 = SpriteShape.GLOW;
                                float var266 = var2.x();
                                float var268 = var2.y();
                                float var271 = var243 * 0.1F;
                                float var244 = var243 * 0.9F;
                                int var34 = var230 | 16777215;
                                var34 = DP.Z(var230, var34, 0.2F);
                                var35 = var9;
                                long var37 = var35 + 1L;
                                var37 = var35 * var37;
                                long var39 = var35 + 2L;
                                var37 *= var39;
                                var35 += 3L;
                                var37 *= var35;
                                var35 = var37 & 7L;
                                long var294;
                                int var277 = (var294 = var35 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                                if (var277 != 0) {
                                    var98 += 863852614;
                                    var98 ^= -1068011784;
                                    break label173;
                                }

                                var98 <<= 28;
                                var98 ^= -228598954;
                                var35 = var98;
                                var37 = var35 + 1L;
                                var37 = var35 * var37;
                                var39 = var35 + 2L;
                                var37 *= var39;
                                var35 += 3L;
                                var37 *= var35;
                                var35 = var37 & 7L;
                                long var295;
                                int var281 = (var295 = var35 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                                if (var281 != 0) {
                                    break label186;
                                }

                                var1.sprite(var254, var266, var268, var271, var244, var34, var230, 0.0F);
                                var1.restore();
                                var98 |= 861710203;
                                var98 >>= 26;
                                var98 *= -831284261;
                                var98 ^= 108232297;
                            }
                        }

                        int var231 = var98 + 1;
                        int var232 = var98 * var231;
                        int var233 = var232 & 1;
                        if (var233 != 0) {
                            break label186;
                        }

                        int var234 = var217 + 1;
                        Integer var245 = var9;
                        if (var245 == null) {
                            var98 ^= -505617728;
                            var98 *= 244507127;
                            var98 ^= 623111297;
                            break label173;
                        }
                        var98 = switch (var98) {
                            case -1424478163 -> {
                                var98 |= -161250982;
                                yield var98 ^ -910417787;
                            }
                            default -> var98 ^ 1799554578;
                            case 781530516 -> var98 ^ -955444797;
                        };
                        Integer var246 = var98;
                        if (var246 == null) {
                            break label186;
                        }

                        var217 = var234;
                        var98 *= 1203761319;
                        var98 -= 1496171162;
                        var98 ^= -312329269;
                    }

                    var98 *= 311880165;
                    var98 &= -1788097244;
                    var98 *= -1165758303;
                    var98 ^= 863583433;
                    Integer var196 = var98;
                    if (var196 == null) {
                        break label186;
                    }

                    int var197 = var23 + 1;
                    Integer var198 = var9;
                    if (var198 == null) {
                        var98 >>= 26;
                        var98 ^= -1196434230;
                        break;
                    }

                    var98 >>>= 29;
                    var98 *= -1980121603;
                    var98 <<= 11;
                    var98 ^= 1267903050;
                    long var199 = var98;
                    long var218 = var199 + 1L;
                    long var219 = var199 * var218;
                    long var200 = var219 & 1L;
                    long var296;
                    int var201 = (var296 = var200 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                    if (var201 != 0) {
                        break label186;
                    }

                    var23 = var197;
                    switch (var98) {
                        case -1162714434:
                            var98 ^= -101233947;
                            break;
                        case 1418605298:
                        default:
                            var98 ^= -92731068;
                            break;
                        case 2083326538:
                            var98 |= -1827286228;
                            var98 ^= -1947500959;
                    }
                }
            }

            var9 = var98 + 1;
            var9 = var98 * var9;
            int var133 = var98 + 2;
            var9 *= var133;
            var98 += 3;
            var9 *= var98;
            var98 = var9 & 7;
            if (var98 == 0) {
                UnsupportedOperationException var125 = new UnsupportedOperationException();
                throw var125;
            }
        }

        IllegalArgumentException var124 = new IllegalArgumentException();
        throw var124;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1843805309;
        int var2 = Yn.C;
        int var4 = of_2.xF(var3, var1, var2);
        Ec = var4;
        double var5 = Math.toRadians(128.0);
        q = var5;
    }
}
