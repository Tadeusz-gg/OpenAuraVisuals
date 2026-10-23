package mvggs.modules.hud;

import dev.aurap.hub.*;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.item.ItemStack;

public final class cooldowns extends HudModule {
    private static final float su = 7.0F;
    private static final float aQ = 19.0F;
    private static final float ot = 14.0F;
    private static final float z = 5.0F;
    private static final float kE = 104.0F;
    private static final float GJ = 10.0F;
    private static final float pU = 10.0F;
    private static final float i = 30.0F;
    private static final TextStyle YP;
    private static final TextStyle xa;
    private static final TextStyle a;
    private TextStyle lI;
    private TextStyle k;
    private TextStyle Y;
    private Paint tS;
    private final List s;
    private final Re CR;
    private boolean Dk;
    private ItemStack[] J;
    private final Jn XW;
    public static final int o;

    public cooldowns() {
        super("cooldowns_hud", "Cooldowns", Cl_2.BOTTOM_RIGHT, -4.0F, -44.0F, 2.0F);
        TextStyle var2 = YP;
        this.lI = var2;
        TextStyle var3 = xa;
        this.k = var3;
        TextStyle var4 = a;
        this.Y = var4;
        Paint var5 = Paint.solid(0);
        this.tS = var5;
        ArrayList var6 = new ArrayList();
        this.s = var6;
        Re var7 = new Re(104.0F, 0.1F);
        this.CR = var7;
        this.Dk = true;
        Jn var8 = this::I;
        this.XW = var8;
        this.dy("Item cooldowns with time left; open chat to move it.");
        this.fJ(true);
    }

    @Override
    protected void r(Oo var1) {
        int var2 = o;
        var2 ^= -1368758378;
        int var3 = System.identityHashCode(this);
        TextStyle var4 = YP;
        int var5 = var1.MD();
        var4 = var4.color(var5);
        this.lI = var4;
        var4 = xa;
        var5 = var1.MD();
        var4 = var4.color(var5);
        this.k = var4;
        Integer var22 = var3;
        if (var22 != null) {
            var2 -= 1519582372;
            var2 ^= -1302280195;
            TextStyle var23 = a;
            int var35 = var1.MD();
            TextStyle var24 = var23.color(var35);
            this.Y = var24;
            int var25 = var1.E();
            var25 = DP.Y(var25, 0.6F);
            int var36 = var1.P();
            int var37 = DP.Y(var36, 0.45F);
            Paint var27 = Paint.horizontal(var25, var37);
            this.tS = var27;
        } else {
            var2 |= -932098621;
            var2 <<= 8;
            var2 -= 1447906195;
            var2 ^= 1526131139;
            var2 ^= 1959915692;
            long var14 = var2;
            long var31 = var14 + 1L;
            long var32 = var14 * var31;
            long var6 = var14 + 2L;
            long var33 = var32 * var6;
            long var15 = var14 + 3L;
            long var34 = var33 * var15;
            long var16 = var34 & 7L;
            long var39;
            var2 = (var39 = var16 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var2 != 0) {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            } else {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        }
    }

    @Override
    protected void Mf() {
        int var1 = o;
        var1 ^= -1965727504;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 != null) {
            var1 ^= -691294287;
            var1 *= -360429349;
            var1 ^= -1001833216;
            long var18 = var1;
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var6 = var18 + 2L;
            var4 *= var6;
            long var19 = var18 + 3L;
            var4 *= var19;
            long var20 = var4 & 7L;
            long var26;
            int var21 = (var26 = var20 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var21 != 0) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            } else {
                this.Dk = true;
            }
        } else {
            var1 |= -669330226;
            var1 *= 1487734369;
            var1 &= -1797047790;
            var1 ^= -758474404;
            IllegalStateException var13 = new IllegalStateException();
            throw var13;
        }
    }

    @Override
    protected boolean BM(lH_3 var1) {
        boolean var394 = false;
        float var649 = 0.0F;
        float var665 = 0.0F;
        int var2 = o;
        var2 ^= 542661451;
        int var3 = System.identityHashCode(this);
        List var4 = this.s;
        Iterator var396 = var4.iterator();
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var704;
        int var427 = (var704 = var5 - 0L) == 0L ? 0 : (var704 < 0L ? -1 : 1);
        if (var427 != 0) {
            var2 -= -699642968;
            var2 -= -462730010;
            var2 -= -497228048;
            var2 ^= -366779487;
        } else {
            label575: {
                var2 &= -1593812693;
                var2 >>= 1;
                var2 &= 1838855427;
                var2 >>>= 5;
                var2 ^= 1916627961;
                var5 = var2;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var705;
                int var431 = (var705 = var5 - 0L) == 0L ? 0 : (var705 < 0L ? -1 : 1);
                if (var431 == 0) {
                    Iterator var397 = var396;
                    var2 += 46933611;
                    var2 ^= 55403581;

                    label546:
                    while (true) {
                        int var432 = var2 + 1;
                        int var433 = var2 * var432;
                        int var6 = var2 + 2;
                        int var434 = var433 * var6;
                        var6 = var2 + 3;
                        int var435 = var434 * var6;
                        int var436 = var435 & 7;
                        if (var436 != 0) {
                            break;
                        }

                        boolean var437 = var397.hasNext();
                        var6 = var3 + 1;
                        var6 = var3 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            switch (var2) {
                                case -1501353056:
                                    var2 ^= 1663118881;
                                    break label575;
                                case 1332798003:
                                default:
                                    var2 ^= 307472316;
                                    break label575;
                                case 1984492889:
                                    var2 += 1935674448;
                                    var2 >>>= 4;
                                    var2 -= -663010258;
                                    var2 *= 1596096657;
                                    var2 ^= 1945440763;
                                    break label575;
                            }
                        }

                        var2 ^= -983462146;
                        var2 ^= 622262771;
                        var2 ^= 21555212;
                        long var485 = var2;
                        long var8 = var485 + 1L;
                        var8 = var485 * var8;
                        long var10 = var485 + 2L;
                        var8 *= var10;
                        long var486 = var485 + 3L;
                        var8 *= var486;
                        long var487 = var8 & 7L;
                        long var706;
                        var6 = (var706 = var487 - 0L) == 0L ? 0 : (var706 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break;
                        }

                        if (!var437) {
                            var2 += 1272839489;
                            var2 -= 392315162;
                            var2 ^= -1873329424;
                            float var398 = var1.fV();
                            Jn var440 = this.XW;
                            i_2.Z(var398, var440);
                            boolean var399 = false;
                            int var441 = var3 + 1;
                            int var442 = var3 * var441;
                            int var443 = var442 & 1;
                            if (var443 != 0) {
                                var2 += -117325283;
                                var2 |= 184807731;
                                var2 -= 456498598;
                                var2 ^= -1064350898;
                                break label575;
                            }
                            var2 = switch (var2) {
                                case -1934832064 -> var2 ^ 249953344;
                                default -> var2 ^ -749072589;
                                case 1537500303 -> {
                                    var2 ^= -1587716117;
                                    var2 *= -951776199;
                                    yield var2 ^ -1713562353;
                                }
                            };
                            var5 = var2;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var707;
                            int var446 = (var707 = var5 - 0L) == 0L ? 0 : (var707 < 0L ? -1 : 1);
                            if (var446 != 0) {
                                break;
                            }

                            List var447 = this.s;
                            Iterator var448 = var447.iterator();
                            Iterator var449 = var448;
                            int var400 = (var399) ? 1 : 0;

                            var2 = switch (var2) {
                                case -672664501 -> {
                                    var2 -= -1607887955;
                                    var2 -= 366797587;
                                    var2 >>= 2;
                                    var2 &= -595658814;
                                    yield var2 ^ -967278069;
                                }
                                case -156782385 -> var2 ^ -693612022;
                                default -> var2 ^ 1160648324;
                            };

                            while (true) {
                                var6 = var2 + 1;
                                var6 = var2 * var6;
                                int var526 = var2 + 2;
                                var6 *= var526;
                                int var527 = var2 + 3;
                                var6 *= var527;
                                var6 &= 7;
                                if (var6 != 0) {
                                    break label546;
                                }

                                int var499 = (var449.hasNext()) ? 1 : 0;
                                Integer var528 = var3;
                                if (var528 == null) {
                                    var2 >>= 1;
                                    var2 ^= 1676508147;
                                    break label575;
                                }

                                var2 *= 1526498227;
                                var2 |= -1598300039;
                                var2 -= -1619480712;
                                var2 |= -740746709;
                                var2 ^= 820516659;
                                int var529 = var2 + 1;
                                int var530 = var2 * var529;
                                int var567 = var2 + 2;
                                int var531 = var530 * var567;
                                int var568 = var2 + 3;
                                int var532 = var531 * var568;
                                int var533 = var532 & 7;
                                if (var533 != 0) {
                                    break label546;
                                }

                                if (var499 == 0) {
                                    var2 = switch (var2) {
                                        case -500420496 -> var2 ^ 2075519339;
                                        case -281589480 -> {
                                            var2 *= 606021;
                                            var2 *= 1352711699;
                                            yield var2 ^ 1458882656;
                                        }
                                        default -> var2 ^ 1446053397;
                                    };
                                    if (var400 == 0) {
                                        var2 &= -1449041191;
                                        var2 >>= 9;
                                        var2 ^= -263590957;
                                        boolean var401 = var1.tl();
                                        var5 = var3;
                                        var7 = var5 + 1L;
                                        var7 = var5 * var7;
                                        var5 = var7 & 1L;
                                        long var708;
                                        int var452 = (var708 = var5 - 0L) == 0L ? 0 : (var708 < 0L ? -1 : 1);
                                        if (var452 != 0) {
                                            var2 &= -1352017886;
                                            var2 += 2086639812;
                                            var2 >>>= 7;
                                            var2 ^= -2067512522;
                                            break label575;
                                        }
                                        var2 = switch (var2) {
                                            default -> var2 ^ 1294419239;
                                            case -595572044 -> var2 ^ -901009297;
                                            case -263341197 -> {
                                                var2 >>>= 3;
                                                var2 ^= 2017502935;
                                                var2 -= 561467294;
                                                var2 *= -1804971007;
                                                yield var2 ^ 1614106214;
                                            }
                                        };
                                        if (var401) {
                                            var2 &= -709934964;
                                            var2 ^= -1504887175;
                                            ItemStack[] var402 = this.J;
                                            Integer var453 = var3;
                                            if (var453 == null) {
                                                var2 &= 1550137383;
                                                var2 -= -376516697;
                                                var2 |= 382352050;
                                                var2 ^= -100242519;
                                                break label575;
                                            }

                                            var2 &= 411127624;
                                            var2 |= -1696920633;
                                            var2 ^= 132037255;
                                            int var454 = var2 + 1;
                                            int var455 = var2 * var454;
                                            int var456 = var455 & 1;
                                            if (var456 != 0) {
                                                break label546;
                                            }

                                            if (var402 == null) {
                                                var2 -= 659773775;
                                                var2 -= -68678367;
                                                var2 *= 1156316555;
                                                var2 &= -280490645;
                                                var2 ^= -801926636;
                                                Integer var403 = var2;
                                                if (var403 == null) {
                                                    break label546;
                                                }

                                                ItemStack[] var404 = i_2.vM();
                                                int var457 = var3 + 1;
                                                int var458 = var3 * var457;
                                                int var459 = var458 & 1;
                                                if (var459 != 0) {
                                                    var2 -= 1680735952;
                                                    var2 += 772759187;
                                                    var2 ^= -941495456;
                                                    break label575;
                                                }

                                                var2 |= -792574345;
                                                var2 <<= 1;
                                                var2 += 376388496;
                                                var2 -= -1597169313;
                                                var2 ^= 1822497156;
                                                int var460 = var2 + 1;
                                                int var461 = var2 * var460;
                                                int var462 = var461 & 1;
                                                if (var462 != 0) {
                                                    break label546;
                                                }

                                                this.J = var404;
                                                var2 |= 1910841720;
                                                var2 += -616544094;
                                                var2 ^= -785558814;
                                                var2 ^= -1855048023;
                                            } else {
                                                var2 |= 1018435262;
                                                var2 += 1101991121;
                                                var2 -= 1586254697;
                                                var2 ^= -1314525776;
                                            }

                                            Integer var405 = var2;
                                            if (var405 == null) {
                                                break label546;
                                            }

                                            ItemStack[] var406 = this.J;
                                            ItemStack var407 = var406[0];
                                            ItemStack[] var463 = this.J;
                                            ItemStack var464 = var463[0];
                                            Integer var507 = var3;
                                            if (var507 == null) {
                                                var2 -= -1018444408;
                                                var2 += -418261394;
                                                var2 -= 1507251602;
                                                var2 ^= 1603373437;
                                                break label575;
                                            }

                                            var2 += -495848326;
                                            var2 >>= 5;
                                            var2 *= -536147907;
                                            var2 ^= -1396776067;
                                            long var508 = var2;
                                            var8 = var508 + 1L;
                                            var8 = var508 * var8;
                                            long var509 = var8 & 1L;
                                            long var709;
                                            var499 = (var709 = var509 - 0L) == 0L ? 0 : (var709 < 0L ? -1 : 1);
                                            if (var499 != 0) {
                                                break label546;
                                            }

                                            this.I(var407, var464, 284.0F, 400.0F);
                                            ItemStack[] var408 = this.J;
                                            ItemStack var409 = var408[1];
                                            ItemStack[] var465 = this.J;
                                            ItemStack var466 = var465[1];
                                            this.I(var409, var466, 9.0F, 10.0F);
                                            var2 -= 1666816765;
                                            var2 += -1583805248;
                                            var2 ^= 1960092953;
                                        } else {
                                            switch (var2) {
                                                case -690784982:
                                                default:
                                                    var2 ^= 772171490;
                                                    break;
                                                case 486354026:
                                                    var2 ^= 872366937;
                                                    break;
                                                case 1938149501:
                                                    var2 ^= -80033212;
                                                    var2 *= -526993673;
                                                    var2 |= -62440236;
                                                    var2 ^= 134252676;
                                            }
                                        }
                                    } else {
                                        var2 >>>= 22;
                                        var2 >>>= 12;
                                        var2 ^= -160467333;
                                    }

                                    long var410 = var2;
                                    long var511 = var410 + 1L;
                                    long var512 = var410 * var511;
                                    var8 = var410 + 2L;
                                    long var513 = var512 * var8;
                                    long var411 = var410 + 3L;
                                    long var514 = var513 * var411;
                                    long var412 = var514 & 7L;
                                    long var710;
                                    int var413 = (var710 = var412 - 0L) == 0L ? 0 : (var710 < 0L ? -1 : 1);
                                    if (var413 != 0) {
                                        break label546;
                                    }

                                    TextStyle var414 = this.lI;
                                    float var415 = var1.me("Cooldowns", var414);
                                    float var416 = var415 + 14.0F;
                                    float var417 = var416 + 14.0F;
                                    Integer var467 = var3;
                                    if (var467 == null) {
                                        switch (var2) {
                                            case -180801562:
                                                var2 ^= 1542337906;
                                                break label575;
                                            case -160467333:
                                                var2 *= -846037897;
                                                var2 ^= 413447802;
                                                break label575;
                                            case 1594603550:
                                            default:
                                                var2 ^= 1475016453;
                                                break label575;
                                        }
                                    }

                                    var2 &= -144313183;
                                    var2 <<= 20;
                                    var2 ^= -131337288;
                                    var2 |= -347152291;
                                    var2 ^= -1840542405;
                                    var5 = var2;
                                    var7 = var5 + 1L;
                                    var7 = var5 * var7;
                                    var9 = var5 + 2L;
                                    var7 *= var9;
                                    var5 += 3L;
                                    var7 *= var5;
                                    var5 = var7 & 7L;
                                    long var711;
                                    int var471 = (var711 = var5 - 0L) == 0L ? 0 : (var711 < 0L ? -1 : 1);
                                    if (var471 != 0) {
                                        break label546;
                                    }

                                    float var472 = 21.0F;
                                    boolean var515 = false;
                                    List var541 = this.s;
                                    int var542 = var541.size();
                                    var542--;
                                    float var418 = var417;
                                    float var473 = var472;
                                    var515 = var515;
                                    int var544 = var542;

                                    var2 = switch (var2) {
                                        default -> var2 ^ -810592300;
                                        case 1765048006 -> {
                                            var2 <<= 21;
                                            var2 *= 1623578023;
                                            var2 &= 345159315;
                                            yield var2 ^ 743247233;
                                        }
                                        case 2047829904 -> var2 ^ -734047129;
                                    };

                                    while (true) {
                                        Integer var572 = var2;
                                        if (var572 == null) {
                                            break label546;
                                        }

                                        if (var544 < 0) {
                                            var2 = switch (var2) {
                                                case 515754266 -> var2 ^ -1894600953;
                                                default -> var2 ^ 1509918737;
                                                case 676138369 -> {
                                                    var2 -= 1416323415;
                                                    var2 >>>= 1;
                                                    yield var2 ^ 1846637866;
                                                }
                                            };
                                            Integer var545 = var2;
                                            if (var545 != null) {
                                                float var546 = 21.0F;
                                                List var573 = this.s;
                                                Iterator var574 = var573.iterator();
                                                var9 = var3;
                                                long var11 = var9 + 1L;
                                                var11 = var9 * var11;
                                                var9 = var11 & 1L;
                                                long var718;
                                                int var596 = (var718 = var9 - 0L) == 0L ? 0 : (var718 < 0L ? -1 : 1);
                                                if (var596 != 0) {
                                                    var2 <<= 27;
                                                    var2 ^= 2096959831;
                                                    break label575;
                                                }

                                                var2 -= 249225939;
                                                var2 |= -1538425688;
                                                var2 |= 1483681268;
                                                var2 ^= -463014709;
                                                int var597 = var2 + 1;
                                                int var598 = var2 * var597;
                                                int var630 = var2 + 2;
                                                int var599 = var598 * var630;
                                                int var631 = var2 + 3;
                                                int var600 = var599 * var631;
                                                int var601 = var600 & 7;
                                                if (var601 == 0) {
                                                    Iterator var575 = var574;
                                                    float var547 = var546;
                                                    var2 |= 1669035719;
                                                    var2 -= -461466038;
                                                    var2 ^= -1354640394;

                                                    while (true) {
                                                        Integer var602 = var2;
                                                        if (var602 == null) {
                                                            break label546;
                                                        }

                                                        boolean var603 = var575.hasNext();
                                                        Integer var632 = var3;
                                                        if (var632 == null) {
                                                            var2 ^= 1902285524;
                                                            var2 += 2063465485;
                                                            var2 ^= 1193326027;
                                                            break label575;
                                                        }

                                                        var2 += -1945238407;
                                                        var2 ^= -1649693814;
                                                        var2 &= 1420995757;
                                                        var2 *= 946288649;
                                                        var2 ^= 1214503208;
                                                        if (!var603) {
                                                            var2 &= -1060117629;
                                                            var2 ^= 1231963903;
                                                            var7 = var2;
                                                            var9 = var7 + 1L;
                                                            var9 = var7 * var9;
                                                            var7 = var9 & 1L;
                                                            long var719;
                                                            int var550 = (var719 = var7 - 0L) == 0L ? 0 : (var719 < 0L ? -1 : 1);
                                                            if (var550 == 0) {
                                                                float var419 = Math.max(104.0F, var418);
                                                                int var551 = var3 + 1;
                                                                int var552 = var3 * var551;
                                                                int var576 = var3 + 2;
                                                                int var553 = var552 * var576;
                                                                int var577 = var3 + 3;
                                                                int var554 = var553 * var577;
                                                                int var555 = var554 & 7;
                                                                if (var555 != 0) {
                                                                    var2 += -511209573;
                                                                    var2 <<= 25;
                                                                    var2 ^= 2005017761;
                                                                    var2 ^= -947964426;
                                                                    break label575;
                                                                }

                                                                var2 &= -1482386075;
                                                                var2 ^= -1418588273;
                                                                var2 >>= 31;
                                                                var2 ^= -1317698717;
                                                                int var556 = var2 + 1;
                                                                int var557 = var2 * var556;
                                                                int var558 = var557 & 1;
                                                                if (var558 == 0) {
                                                                    boolean var559 = this.Dk;
                                                                    if (var559) {
                                                                        var2 ^= 1966045355;
                                                                        var2 ^= -1600738686;
                                                                        Re var560 = this.CR;
                                                                        Integer var578 = var3;
                                                                        if (var578 == null) {
                                                                            var2 += -140495608;
                                                                            var2 ^= -661547259;
                                                                            break label575;
                                                                        }

                                                                        var2 *= -231825997;
                                                                        var2 &= 1840517749;
                                                                        var2 ^= -705218065;
                                                                        Integer var579 = var2;
                                                                        if (var579 == null) {
                                                                            break label546;
                                                                        }

                                                                        var560.v(var419);
                                                                        this.Dk = false;
                                                                        var2 *= 1569450929;
                                                                        var2 ^= 1873318450;
                                                                    } else {
                                                                        var2 &= -23356688;
                                                                        var2 ^= 914888350;
                                                                        var2 |= 2096163211;
                                                                        var2 ^= -177629530;
                                                                    }

                                                                    Re var561 = this.CR;
                                                                    float var580 = var1.l();
                                                                    float var420 = var561.Gc(var419, var580);
                                                                    float var474 = var473 + 5.0F;
                                                                    Integer var562 = var3;
                                                                    if (var562 == null) {
                                                                        var2 &= 420873000;
                                                                        var2 -= 119642746;
                                                                        var2 -= 42168141;
                                                                        var2 ^= 2073552918;
                                                                        break label575;
                                                                    }

                                                                    label415: {
                                                                        var2 |= 378641573;
                                                                        var2 ^= -940232817;
                                                                        this.dV(var420, var474);
                                                                        if (!var515) {
                                                                            var2 += -178936283;
                                                                            var2 &= -1167190367;
                                                                            var2 -= -455967649;
                                                                            var2 ^= 459671605;
                                                                            Integer var421 = var2;
                                                                            if (var421 == null) {
                                                                                break label546;
                                                                            }

                                                                            boolean var422 = var1.tl();
                                                                            Integer var384 = var3;
                                                                            if (var384 == null) {
                                                                                switch (var2) {
                                                                                    case -1737161587:
                                                                                    default:
                                                                                        var2 ^= -1782015541;
                                                                                        break label575;
                                                                                    case -1204710889:
                                                                                        var2 += -785999679;
                                                                                        var2 ^= 228932495;
                                                                                        break label575;
                                                                                    case -127804107:
                                                                                        var2 ^= -322196008;
                                                                                        break label575;
                                                                                }
                                                                            }

                                                                            var2 -= -287543758;
                                                                            var2 *= 2053266361;
                                                                            var2 &= -652692929;
                                                                            var2 ^= -60369039;
                                                                            int var385 = var2 + 1;
                                                                            var385 = var2 * var385;
                                                                            int var475 = var2 + 2;
                                                                            var385 *= var475;
                                                                            int var476 = var2 + 3;
                                                                            var385 *= var476;
                                                                            var385 &= 7;
                                                                            if (var385 != 0) {
                                                                                break label546;
                                                                            }

                                                                            if (!var422) {
                                                                                var2 = switch (var2) {
                                                                                    case -1528934776 -> var2 ^ -1451499100;
                                                                                    default -> var2 ^ -696580112;
                                                                                    case 2104935756 -> {
                                                                                        var2 += -1911299495;
                                                                                        var2 <<= 21;
                                                                                        var2 *= 2113074449;
                                                                                        var2 <<= 19;
                                                                                        yield var2 ^ 1158689103;
                                                                                    }
                                                                                };
                                                                                long var390 = var2;
                                                                                var5 = var390 + 1L;
                                                                                var5 = var390 * var5;
                                                                                var7 = var390 + 2L;
                                                                                var5 *= var7;
                                                                                long var391 = var390 + 3L;
                                                                                var5 *= var391;
                                                                                long var392 = var5 & 7L;
                                                                                long var720;
                                                                                var385 = (var720 = var392 - 0L) == 0L ? 0 : (var720 < 0L ? -1 : 1);
                                                                                if (var385 != 0) {
                                                                                    break label546;
                                                                                }

                                                                                var394 = false;
                                                                                switch (var2) {
                                                                                    case -671574919:
                                                                                    default:
                                                                                        var2 ^= 83638940;
                                                                                        break label415;
                                                                                    case 801012381:
                                                                                        var2 ^= -981488619;
                                                                                        break label415;
                                                                                    case 1158689103:
                                                                                        var2 |= 172330222;
                                                                                        var2 -= -2065298793;
                                                                                        var2 ^= 4000641;
                                                                                        break label415;
                                                                                }
                                                                            }

                                                                            var2 += 1355592892;
                                                                            var2 ^= -1248795062;
                                                                        } else {
                                                                            var2 >>= 30;
                                                                            var2 ^= -2077465667;
                                                                        }

                                                                        var394 = true;
                                                                        var2 *= 475931477;
                                                                        var2 &= -696224129;
                                                                        var2 ^= 1221779123;
                                                                    }

                                                                    int var423 = var2 + 1;
                                                                    int var424 = var2 * var423;
                                                                    int var425 = var424 & 1;
                                                                    if (var425 == 0) {
                                                                        return var394;
                                                                    }
                                                                }
                                                            }
                                                            break label546;
                                                        }

                                                        var2 |= 1490178501;
                                                        var2 |= -868034518;
                                                        var2 += 1496538892;
                                                        var2 ^= 1445937388;
                                                        var2 ^= -897279157;
                                                        Object var604 = var575.next();
                                                        Vf var605 = (Vf)var604;
                                                        var605.b = var547;
                                                        XF var606 = var605.GK;
                                                        float var607 = var606.bs();
                                                        float var608 = TP.S(var607);
                                                        float var609 = 14.0F * var608;
                                                        float var610 = var547 + var609;
                                                        int var633 = var3 + 1;
                                                        int var634 = var3 * var633;
                                                        int var635 = var634 & 1;
                                                        if (var635 != 0) {
                                                            var2 *= 1590188385;
                                                            var2 -= 164592906;
                                                            var2 -= -1470082872;
                                                            var2 += 1579709545;
                                                            var2 ^= -1124508380;
                                                            break label575;
                                                        }

                                                        var2 >>= 4;
                                                        var2 |= 1215385626;
                                                        var2 ^= 1526214283;
                                                        Integer var636 = var2;
                                                        if (var636 == null) {
                                                            break label546;
                                                        }

                                                        var547 = var610;
                                                        var2 <<= 6;
                                                        var2 &= 960161052;
                                                        var2 *= -145053933;
                                                        var2 |= -1536207598;
                                                        var2 ^= -1638742711;
                                                    }
                                                }
                                            }
                                            break label546;
                                        }
                                        var2 = switch (var2) {
                                            default -> var2 ^ 1034044703;
                                            case 676138369 -> {
                                                var2 ^= -1071866294;
                                                yield var2 ^ 2097706281;
                                            }
                                            case 1185396466 -> var2 ^ -1052817110;
                                        };
                                        Integer var581 = var2;
                                        if (var581 == null) {
                                            break label546;
                                        }

                                        List var582 = this.s;
                                        Object var583 = var582.get(var544);
                                        Vf var584 = (Vf)var583;
                                        int var613 = var3 + 1;
                                        int var614 = var3 * var613;
                                        int var637 = var3 + 2;
                                        int var615 = var614 * var637;
                                        int var638 = var3 + 3;
                                        int var616 = var615 * var638;
                                        int var617 = var616 & 7;
                                        if (var617 != 0) {
                                            var2 *= 544332149;
                                            var2 *= -256026889;
                                            var2 ^= -866979721;
                                            var2 |= 1970732677;
                                            var2 ^= 2063790018;
                                            break label575;
                                        }

                                        var2 -= -1495541110;
                                        var2 -= 768150618;
                                        var2 ^= -1656875003;
                                        var9 = var2;
                                        long var651 = var9 + 1L;
                                        var651 = var9 * var651;
                                        long var13 = var9 + 2L;
                                        var651 *= var13;
                                        var9 += 3L;
                                        var651 *= var9;
                                        var9 = var651 & 7L;
                                        long var712;
                                        int var621 = (var712 = var9 - 0L) == 0L ? 0 : (var712 < 0L ? -1 : 1);
                                        if (var621 != 0) {
                                            break label546;
                                        }

                                        XF var622 = var584.GK;
                                        boolean var639 = var584.s;
                                        float var640;
                                        if (var639) {
                                            var2 = switch (var2) {
                                                case -1061635422 -> var2 ^ 878178328;
                                                default -> var2 ^ -1340267909;
                                                case 1569384443 -> {
                                                    var2 ^= 854774086;
                                                    var2 *= 1303401697;
                                                    var2 |= 1588739702;
                                                    yield var2 ^ 1196640252;
                                                }
                                            };
                                            var640 = 1.0F;
                                            var2 |= -757222346;
                                            var2 += 1980165394;
                                            var2 &= 139852353;
                                            var2 ^= 980647054;
                                        } else {
                                            var2 += -1682192411;
                                            var2 -= 649993155;
                                            var2 ^= -164163594;
                                            Integer var655 = var2;
                                            if (var655 == null) {
                                                break label546;
                                            }

                                            var640 = 0.0F;
                                            var2 += -673707897;
                                            var2 += 1749993640;
                                            var2 ^= 750780938;
                                            var2 ^= 202082411;
                                            var2 ^= 2119856564;
                                        }

                                        var622.H(var640);
                                        XF var623 = var584.GK;
                                        float var641 = var1.l();
                                        float var624 = var623.N(var641);
                                        boolean var642 = var584.s;
                                        int var656 = var3 + 1;
                                        int var657 = var3 * var656;
                                        int var658 = var657 & 1;
                                        if (var658 != 0) {
                                            switch (var2) {
                                                case 753813515:
                                                    var2 ^= -901283523;
                                                    break label575;
                                                case 980915919:
                                                    var2 >>>= 6;
                                                    var2 &= -27243839;
                                                    var2 <<= 24;
                                                    var2 ^= -973270697;
                                                    break label575;
                                                case 1755850797:
                                                default:
                                                    var2 ^= 2063734329;
                                                    break label575;
                                            }
                                        }

                                        var2 += 1287379473;
                                        var2 ^= 1969684173;
                                        var2 >>>= 24;
                                        var2 ^= -652375586;
                                        var651 = var2;
                                        var13 = var651 + 1L;
                                        var13 = var651 * var13;
                                        long var15 = var651 + 2L;
                                        var13 *= var15;
                                        var651 += 3L;
                                        var13 *= var651;
                                        var651 = var13 & 7L;
                                        long var713;
                                        int var662 = (var713 = var651 - 0L) == 0L ? 0 : (var713 < 0L ? -1 : 1);
                                        if (var662 != 0) {
                                            break label546;
                                        }

                                        boolean var666;
                                        label608: {
                                            if (!var642) {
                                                var2 ^= 1512899619;
                                                var2 -= 390955996;
                                                var2 += -1492306788;
                                                var2 += -1780797272;
                                                var2 ^= 690282716;
                                                int var643 = var2 + 1;
                                                int var644 = var2 * var643;
                                                int var645 = var644 & 1;
                                                if (var645 != 0) {
                                                    break label546;
                                                }

                                                float var714;
                                                int var646 = (var714 = var624 - 0.005F) == 0.0F ? 0 : (var714 < 0.0F ? -1 : 1);
                                                Integer var663 = var3;
                                                if (var663 == null) {
                                                    var2 -= -948621940;
                                                    var2 -= 564925084;
                                                    var2 |= -232061129;
                                                    var2 ^= 2115133152;
                                                    break label575;
                                                }
                                                var2 = switch (var2) {
                                                    case -2115006805 -> {
                                                        var2 <<= 25;
                                                        var2 ^= 2042908573;
                                                        var2 *= 600247421;
                                                        yield var2 ^ 1041652760;
                                                    }
                                                    case 1334396263 -> var2 ^ 555209185;
                                                    default -> var2 ^ 1139164460;
                                                };
                                                Integer var664 = var2;
                                                if (var664 == null) {
                                                    break label546;
                                                }

                                                if (var646 <= 0) {
                                                    var2 += 388349439;
                                                    var2 *= 487611267;
                                                    var2 |= -276441279;
                                                    var2 ^= 701987959;
                                                    List var647 = this.s;
                                                    Object var648 = var647.remove(var544);
                                                    var649 = var418;
                                                    var665 = var473;
                                                    Integer var12 = var3;
                                                    if (var12 == null) {
                                                        var2 ^= -1078208068;
                                                        var2 |= 69353427;
                                                        var2 += -1886744202;
                                                        var2 ^= 2039676934;
                                                        break label575;
                                                    }
                                                    var2 = switch (var2) {
                                                        case -776946072 -> var2 ^ 968078915;
                                                        case -698834138 -> {
                                                            var2 *= 144087241;
                                                            var2 ^= 331630227;
                                                            yield var2 ^ 1896123;
                                                        }
                                                        default -> var2 ^ -861523928;
                                                    };
                                                    var666 = var515;
                                                    switch (var2) {
                                                        case -1486749442:
                                                            var2 += 2140248831;
                                                            var2 += 1543896959;
                                                            var2 ^= -2036961414;
                                                            break label608;
                                                        case 1241893543:
                                                        default:
                                                            var2 ^= 289421494;
                                                            break label608;
                                                        case 1900756972:
                                                            var2 ^= 902803974;
                                                            break label608;
                                                    }
                                                }

                                                var2 += 796628860;
                                                var2 >>>= 29;
                                                var2 ^= -1019164085;
                                                var2 ^= -1962095890;
                                            } else {
                                                var2 |= -533889107;
                                                var2 += 1712491969;
                                                var2 |= 1974499510;
                                                var2 ^= 935132507;
                                            }

                                            Integer var671 = var2;
                                            if (var671 == null) {
                                                break label546;
                                            }

                                            boolean var672 = var584.s;
                                            long var14 = var3;
                                            long var16 = var14 + 1L;
                                            var16 = var14 * var16;
                                            var14 = var16 & 1L;
                                            long var715;
                                            int var682 = (var715 = var14 - 0L) == 0L ? 0 : (var715 < 0L ? -1 : 1);
                                            if (var682 != 0) {
                                                switch (var2) {
                                                    case -1244475016:
                                                    default:
                                                        var2 ^= 1149773577;
                                                        break label575;
                                                    case 1212940453:
                                                        var2 &= 538698700;
                                                        var2 &= 1493309450;
                                                        var2 &= 1673948438;
                                                        var2 ^= -224333239;
                                                        var2 ^= 1985864478;
                                                        break label575;
                                                    case 1681527674:
                                                        var2 ^= -401396198;
                                                        break label575;
                                                }
                                            }

                                            var2 *= -1992016631;
                                            var2 += -986960020;
                                            var2 -= 1025463950;
                                            var2 ^= 946589004;
                                            var2 ^= 848114405;
                                            boolean var677;
                                            if (var672) {
                                                var2 ^= -1328938262;
                                                var2 >>>= 24;
                                                var2 >>= 7;
                                                var2 *= -480426297;
                                                var2 ^= 1022954927;
                                                int var673 = var2 + 1;
                                                int var674 = var2 * var673;
                                                int var675 = var674 & 1;
                                                if (var675 != 0) {
                                                    break label546;
                                                }

                                                boolean var676 = true;
                                                Re var683 = var584.qA;
                                                float var690 = var584.QJ;
                                                var16 = var3;
                                                long var18 = var16 + 1L;
                                                var18 = var16 * var18;
                                                var16 = var18 & 1L;
                                                long var716;
                                                int var701 = (var716 = var16 - 0L) == 0L ? 0 : (var716 < 0L ? -1 : 1);
                                                if (var701 != 0) {
                                                    var2 >>= 23;
                                                    var2 += 1660859917;
                                                    var2 += -700330946;
                                                    var2 -= 1289058649;
                                                    var2 ^= 1754667068;
                                                    break label575;
                                                }
                                                var2 = switch (var2) {
                                                    default -> var2 ^ -1438525006;
                                                    case -632670584 -> var2 ^ 119335253;
                                                    case 1022954927 -> {
                                                        var2 -= 470288936;
                                                        var2 *= 1714970427;
                                                        var2 *= 731623755;
                                                        var2 >>>= 3;
                                                        yield var2 ^ 1358462846;
                                                    }
                                                };
                                                float var702 = var1.l();
                                                float var684 = var683.Gc(var690, var702);
                                                var677 = var676;
                                                var2 &= -1836244401;
                                                var2 ^= -1873185295;
                                                var2 ^= 1936339024;
                                                var2 &= -1070969147;
                                                var2 ^= 1694415065;
                                            } else {
                                                var2 ^= 1441307131;
                                                var2 ^= -1101098924;
                                                var2 ^= 445793308;
                                                Integer var685 = var2;
                                                if (var685 == null) {
                                                    break label546;
                                                }

                                                var677 = var515;
                                                var2 -= 1675758120;
                                                var2 ^= -2013933042;
                                                var2 |= -1406373708;
                                                var2 ^= 1538887086;
                                            }

                                            String var686 = var584.i;
                                            Integer var691 = var3;
                                            if (var691 == null) {
                                                var2 -= 86909612;
                                                var2 <<= 28;
                                                var2 -= -866819;
                                                var2 ^= 1425025876;
                                                break label575;
                                            }
                                            var2 = switch (var2) {
                                                case -1529545703 -> {
                                                    var2 -= 424686918;
                                                    yield var2 ^ -392261901;
                                                }
                                                default -> var2 ^ -769962107;
                                                case -551365356 -> var2 ^ -352417293;
                                            };
                                            TextStyle var692 = this.k;
                                            float var687 = var1.me(var686, var692);
                                            var584.al = var687;
                                            StringBuilder var688 = var584.io;
                                            TextStyle var693 = this.Y;
                                            float var689 = var1.me(var688, var693);
                                            var584.Pf = var689;
                                            float var585 = var584.al;
                                            float var586 = 22.0F + var585;
                                            float var587 = var586 + 12.0F;
                                            float var588 = var587 + 30.0F;
                                            float var589 = var588 + 7.0F;
                                            float var590 = Math.max(var418, var589);
                                            float var625 = TP.S(var624);
                                            float var626 = 14.0F * var625;
                                            float var627 = var473 + var626;
                                            var649 = var590;
                                            var665 = var627;
                                            var666 = var677;
                                            switch (var2) {
                                                case -2020333791:
                                                default:
                                                    var2 ^= 1200595741;
                                                    break;
                                                case 1388670868:
                                                    var2 ^= -455877801;
                                                    break;
                                                case 1662666784:
                                                    var2 += 2112306287;
                                                    var2 ^= -445747063;
                                            }
                                        }

                                        Integer var591 = var2;
                                        if (var591 == null) {
                                            break label546;
                                        }

                                        int var592 = var544 + -1;
                                        Integer var628 = var3;
                                        if (var628 == null) {
                                            var2 ^= 3874811;
                                            var2 |= 412158838;
                                            var2 &= -1103310179;
                                            var2 ^= -1729506358;
                                            break label575;
                                        }

                                        var2 &= -101343303;
                                        var2 *= -929652533;
                                        var2 ^= 1784835963;
                                        var13 = var2;
                                        var15 = var13 + 1L;
                                        var15 = var13 * var15;
                                        long var17 = var13 + 2L;
                                        var15 *= var17;
                                        var13 += 3L;
                                        var15 *= var13;
                                        var13 = var15 & 7L;
                                        long var717;
                                        int var629 = (var717 = var13 - 0L) == 0L ? 0 : (var717 < 0L ? -1 : 1);
                                        if (var629 != 0) {
                                            break label546;
                                        }

                                        var418 = var649;
                                        var473 = var665;
                                        var515 = var666;
                                        var544 = var592;
                                        var2 ^= 770963738;
                                        var2 *= -314116027;
                                        var2 += 1363367711;
                                        var2 ^= -317466939;
                                    }
                                }

                                var2 *= 1129083357;
                                var2 &= 197885793;
                                var2 <<= 20;
                                var2 |= -1850842537;
                                var2 ^= -1528298710;
                                var499 = var2 + 1;
                                var499 = var2 * var499;
                                var499 &= 1;
                                if (var499 != 0) {
                                    break label546;
                                }

                                Object var503 = var449.next();
                                Vf var504 = (Vf)var503;
                                int var505 = (var504.s) ? 1 : 0;
                                var505 = var400 | var505;
                                Integer var534 = var3;
                                if (var534 == null) {
                                    var2 *= -1272069609;
                                    var2 |= 380818364;
                                    var2 += 1781437371;
                                    var2 -= -1562394071;
                                    var2 ^= -1695498234;
                                    break label575;
                                }

                                var2 >>= 3;
                                var2 <<= 29;
                                var2 ^= 1239413654;
                                var2 ^= -1548663406;
                                var400 = var505;
                                var2 *= 1351506737;
                                var2 ^= -1785586057;
                                var2 += 1963943716;
                                var2 ^= -1262676322;
                            }
                        }
                        var2 = switch (var2) {
                            case -1753781672 -> {
                                var2 >>= 28;
                                var2 |= -2093491031;
                                var2 += 816965151;
                                yield var2 ^ -1885024091;
                            }
                            case 650627446 -> var2 ^ -660096709;
                            default -> var2 ^ -19073479;
                        };
                        Object var438 = var397.next();
                        var6 = var3 + 1;
                        var6 = var3 * var6;
                        int var522 = var3 + 2;
                        var6 *= var522;
                        int var523 = var3 + 3;
                        var6 *= var523;
                        var6 &= 7;
                        if (var6 != 0) {
                            var2 &= 865126402;
                            var2 ^= -365831404;
                            var2 <<= 6;
                            var2 ^= -863251369;
                            break label575;
                        }
                        var2 = switch (var2) {
                            case -1221491491 -> var2 ^ -733374944;
                            case -1089128771 -> {
                                var2 ^= 1237725679;
                                var2 |= -1385638565;
                                var2 -= -2069719574;
                                yield var2 ^ 1508258449;
                            }
                            default -> var2 ^ -278663866;
                        };
                        Vf var439 = (Vf)var438;
                        var439.s = false;
                        switch (var2) {
                            case -665332300:
                            default:
                                var2 ^= -1185976672;
                                break;
                            case 582972384:
                                var2 -= -2017879911;
                                var2 *= 971452185;
                                var2 *= 147179969;
                                var2 ^= 1449965686;
                                break;
                            case 1872674138:
                                var2 ^= -4458467;
                        }
                    }
                }

                UnsupportedOperationException var395 = new UnsupportedOperationException();
                throw var395;
            }
        }

        RuntimeException var383 = new RuntimeException();
        throw var383;
    }

    private void I(Object var1, ItemStack var2, float var3, float var4) {
        label132: {
            int var5 = o;
            var5 ^= -606767312;
            int var6 = System.identityHashCode(this);
            Vf var7 = null;
            List var8 = this.s;
            Iterator var106 = var8.iterator();
            long var9 = var6;
            long var11 = var9 + 1L;
            var11 = var9 * var11;
            var9 = var11 & 1L;
            long var206;
            int var123 = (var206 = var9 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
            if (var123 == 0) {
                var5 ^= -1180623171;
                var5 ^= -1304527787;
                var5 -= 2038487778;
                var5 -= 828667801;
                var5 ^= 183817965;
                var9 = var5;
                var11 = var9 + 1L;
                var11 = var9 * var11;
                long var13 = var9 + 2L;
                var11 *= var13;
                var9 += 3L;
                var11 *= var9;
                var9 = var11 & 7L;
                long var207;
                int var127 = (var207 = var9 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                if (var127 != 0) {
                    break label132;
                }

                Iterator var107 = var106;
                var5 |= 1648391936;
                var5 &= 1951716670;
                var5 >>>= 31;
                var5 *= 281451109;
                var5 ^= 727244902;

                label129:
                while (true) {
                    var9 = var5;
                    var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var13 = var9 + 2L;
                    var11 *= var13;
                    var9 += 3L;
                    var11 *= var9;
                    var9 = var11 & 7L;
                    long var208;
                    int var131 = (var208 = var9 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                    if (var131 != 0) {
                        break label132;
                    }

                    boolean var132 = var107.hasNext();
                    long var10 = var6;
                    long var12 = var10 + 1L;
                    var12 = var10 * var12;
                    long var14 = var10 + 2L;
                    var12 *= var14;
                    var10 += 3L;
                    var12 *= var10;
                    var10 = var12 & 7L;
                    long var209;
                    int var142 = (var209 = var10 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                    if (var142 != 0) {
                        switch (var5) {
                            case -706364816:
                                var5 ^= 242475915;
                                break label129;
                            case -196824155:
                            default:
                                var5 ^= 1233916004;
                                break label129;
                            case 727244902:
                                var5 ^= -1576026634;
                                var5 |= -1475998714;
                                var5 ^= 729793496;
                                break label129;
                        }
                    }

                    var5 += 97852378;
                    var5 *= -868847589;
                    var5 *= 1422154979;
                    var5 ^= -1605020394;
                    var10 = var5;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var14 = var10 + 2L;
                    var12 *= var14;
                    var10 += 3L;
                    var12 *= var10;
                    var10 = var12 & 7L;
                    long var210;
                    int var146 = (var210 = var10 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                    if (var146 != 0) {
                        break label132;
                    }

                    Vf var139;
                    if (var132) {
                        var5 |= -704104158;
                        var5 *= 1348392917;
                        var5 ^= 951214682;
                        var9 = var5;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var211;
                        int var136 = (var211 = var9 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                        if (var136 != 0) {
                            break label132;
                        }

                        Object var137 = var107.next();
                        Vf var138 = (Vf)var137;
                        var10 = var6;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var212;
                        int var149 = (var212 = var10 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                        if (var149 != 0) {
                            var5 |= -1998131270;
                            var5 += 1282606195;
                            var5 += 1980552136;
                            var5 += 74310058;
                            var5 ^= 1157375917;
                            break;
                        }

                        var5 ^= 333964834;
                        var5 >>>= 23;
                        var5 >>= 5;
                        var5 >>= 21;
                        var5 ^= -1369550165;
                        Object var150 = var138.vx;
                        boolean var151 = var150.equals(var1);
                        if (!var151) {
                            var5 &= 1379668471;
                            var5 |= 1328892887;
                            var5 >>= 14;
                            var5 *= -449449623;
                            var5 ^= -133071868;
                            Integer var162 = var5;
                            if (var162 == null) {
                                break label132;
                            }

                            var5 >>= 23;
                            var5 >>= 15;
                            var5 += 1584736339;
                            var5 |= -1664749325;
                            var5 ^= -173205355;
                            continue;
                        }

                        var5 -= -567597238;
                        var5 &= -425459289;
                        var5 |= -909263004;
                        var5 ^= 15716088;
                        var10 = var5;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var213;
                        int var154 = (var213 = var10 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                        if (var154 != 0) {
                            break label132;
                        }

                        int var155 = var6 + 1;
                        int var156 = var6 * var155;
                        int var157 = var156 & 1;
                        if (var157 != 0) {
                            switch (var5) {
                                case -922586723:
                                    var5 &= 666782095;
                                    var5 -= -1306929827;
                                    var5 *= -526597287;
                                    var5 ^= -463555842;
                                    break label129;
                                case 1720275855:
                                    var5 ^= 1407645318;
                                    break label129;
                                case 2086717178:
                                default:
                                    var5 ^= 1319896492;
                                    break label129;
                            }
                        }

                        var5 >>>= 26;
                        var5 ^= 957429569;
                        var10 = var5;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var214;
                        int var161 = (var214 = var10 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                        if (var161 != 0) {
                            break label132;
                        }

                        var139 = var138;
                        var5 &= -361859107;
                        var5 ^= 1103581109;
                    } else {
                        var5 ^= 455655087;
                        var5 ^= -430718531;
                        var5 ^= 1331467165;
                        int var108 = var5 + 1;
                        int var109 = var5 * var108;
                        int var110 = var109 & 1;
                        if (var110 != 0) {
                            break label132;
                        }

                        var139 = var7;
                        var5 &= -1642637917;
                        var5 ^= -204441243;
                    }

                    Integer var_pred = var5;
                    if (var_pred == null) {
                        break label132;
                    }

                    if (var139 == null) {
                        var5 *= 1513850441;
                        var5 ^= -216394853;
                        var7 = new Vf(var1, var2);
                        Re var111 = var7.qA;
                        float var163 = var3 / var4;
                        float var164 = TP.S(var163);
                        var111.v(var164);
                        int var112 = var6 + 1;
                        int var113 = var6 * var112;
                        int var114 = var113 & 1;
                        if (var114 != 0) {
                            var5 ^= -432277778;
                            var5 ^= -1683361993;
                            var5 ^= -1693170424;
                            break;
                        }
                        var5 = switch (var5) {
                            case -277173262 -> var5 ^ -1556309260;
                            default -> var5 ^ 857105593;
                            case 1689174687 -> {
                                var5 *= 909045837;
                                var5 -= -1269761982;
                                yield var5 ^ -776432388;
                            }
                        };
                        var8 = this.s;
                        boolean var116 = var8.add(var7);
                        var7 = var7;
                        var5 |= 93422624;
                        var5 ^= -1466710892;
                        var5 ^= -688130245;
                    } else {
                        var5 ^= 1007450912;
                        var5 -= 401336572;
                        var5 ^= -1036129392;
                        var10 = var5;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var215;
                        int var117 = (var215 = var10 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                        if (var117 != 0) {
                            break label132;
                        }

                        var7 = var139;
                        var5 *= -617174247;
                        var5 |= -304336764;
                        var5 <<= 24;
                        var5 ^= -543717694;
                    }

                    Integer var118 = var5;
                    if (var118 == null) {
                        break label132;
                    }

                    var7.s = true;
                    long var119 = var6;
                    var10 = var119 + 1L;
                    var10 = var119 * var10;
                    var12 = var119 + 2L;
                    var10 *= var12;
                    long var120 = var119 + 3L;
                    var10 *= var120;
                    long var121 = var10 & 7L;
                    long var216;
                    var6 = (var216 = var121 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        var5 -= 1664517382;
                        var5 *= 454682761;
                        var5 -= -1945827605;
                        var5 ^= 1756590780;
                        var7.w(var3, var4);
                        return;
                    }

                    var5 -= 981901056;
                    var5 ^= -1959233140;
                    break;
                }
            } else {
                var5 ^= 1656443916;
                var5 |= -1218639869;
                var5 ^= -1412007484;
                var5 |= -1136832868;
                var5 ^= 1041719697;
            }

            long var95 = var5;
            long var104 = var95 + 1L;
            long var105 = var95 * var104;
            long var96 = var105 & 1L;
            long var217;
            var5 = (var217 = var96 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
            if (var5 == 0) {
                UnsupportedOperationException var99 = new UnsupportedOperationException();
                throw var99;
            }
        }

        IllegalStateException var98 = new IllegalStateException();
        throw var98;
    }

    @Override
    protected void BO(hr var1, lH_3 var2) {
        int var3 = o;
        var3 ^= -865481883;
        int var4 = System.identityHashCode(this);
        float var5 = this.tQ();
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var25;
        var4 = (var25 = var6 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var4 == 0) {
            var3 &= 1150982826;
            var3 ^= -133076135;
            var3 ^= -2064638070;
            var3 ^= 147847378;
            float var22 = this.Yo();
            var1.Ky(0.0F, 0.0F, var5, var22, 9.0F);
        } else {
            var3 *= -1576902037;
            var3 -= 1294521086;
            var3 ^= 656597947;
            Integer var14 = var3;
            if (var14 != null) {
                IllegalArgumentException var16 = new IllegalArgumentException();
                throw var16;
            } else {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            }
        }
    }

    @Override
    protected void G(Canvas var1, lH_3 var2) {
        label167: {
            int var3 = o;
            var3 ^= 496114023;
            int var4 = System.identityHashCode(this);
            float var5 = this.tQ();
            float var121 = var5;
            Oo var6 = var2.x();
            Oo var123 = var6;
            int var7 = var6.E();
            double var8 = var2.M();
            kN.W(var1, 11.0F, 9.5F, 9.0F, var7, var8);
            TextStyle var124 = this.lI;
            kN.O(var1, var6, "Cooldowns", var5, 7.0F, 19.0F, var124);
            var1.save();
            float var125 = this.Yo();
            float var126 = var125 - 19.0F;
            var1.clip(0.0F, 19.0F, var5, var126, 0.0F);
            List var127 = this.s;
            long var130 = var4;
            long var10 = var130 + 1L;
            var10 = var130 * var10;
            long var12 = var130 + 2L;
            var10 *= var12;
            long var131 = var130 + 3L;
            var10 *= var131;
            long var132 = var10 & 7L;
            long var263;
            int var133 = (var263 = var132 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
            if (var133 != 0) {
                var3 <<= 5;
                var3 += 544717966;
                var3 -= -1718711849;
                var3 ^= 1106267479;
            } else {
                var3 *= -283148875;
                var3 >>>= 23;
                var3 -= 909175143;
                var3 ^= -1734177109;
                Iterator var128 = var127.iterator();
                Iterator var129 = var128;
                var3 &= -1136770024;
                var3 |= -2108191067;
                var3 ^= 988006461;

                label154:
                while (true) {
                    Integer var134 = var3;
                    if (var134 == null) {
                        break label167;
                    }

                    boolean var135 = var129.hasNext();
                    Integer var9 = var4;
                    if (var9 == null) {
                        var3 -= -742675836;
                        var3 |= 766588128;
                        var3 ^= -234959860;
                        break;
                    }

                    var3 |= -906550070;
                    var3 ^= 1649661737;
                    if (!var135) {
                        var3 += 157587633;
                        var3 |= 447552989;
                        var3 ^= -1815814463;
                        var4 = var3 + 1;
                        var4 = var3 * var4;
                        int var122 = var3 + 2;
                        var4 *= var122;
                        var3 += 3;
                        var4 *= var3;
                        var3 = var4 & 7;
                        if (var3 == 0) {
                            var1.restore();
                            return;
                        }
                        break label167;
                    }

                    var3 |= -395301692;
                    var3 *= -1610128987;
                    var3 ^= 846425745;
                    Object var136 = var129.next();
                    Vf var137 = (Vf)var136;
                    XF var143 = var137.GK;
                    float var144 = var143.bs();
                    float var145 = TP.S(var144);
                    var10 = var4;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var264;
                    int var155 = (var264 = var10 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                    if (var155 != 0) {
                        var3 &= 865396066;
                        var3 >>= 31;
                        var3 |= -512397574;
                        var3 |= -201859990;
                        var3 ^= -487910;
                        break;
                    }

                    var3 *= 1047629367;
                    var3 ^= -1749945314;
                    var3 += 1895541703;
                    var3 ^= 53797321;
                    var10 = var3;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var265;
                    int var158 = (var265 = var10 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                    if (var158 != 0) {
                        break label167;
                    }

                    float var266;
                    int var159 = (var266 = var145 - 0.005F) == 0.0F ? 0 : (var266 < 0.0F ? -1 : 1);
                    if (var159 <= 0) {
                        var3 += 1380732499;
                        var3 ^= -790611565;
                        var3 ^= 2098238527;
                        var10 = var3;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var267;
                        int var162 = (var267 = var10 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                        if (var162 != 0) {
                            break label167;
                        }

                        switch (var3) {
                            case -686571747:
                                var3 *= 1173800709;
                                var3 ^= -1421082623;
                                break;
                            case -577418221:
                            default:
                                var3 ^= -1879024265;
                                break;
                            case 826078540:
                                var3 ^= -493224170;
                        }
                    } else {
                        var3 ^= -486467568;
                        var3 *= -823951379;
                        var3 *= 1313338743;
                        var3 ^= 651857282;
                        var3 ^= 1379626009;
                        float var163 = var137.b;
                        var1.save();
                        var1.alpha(var145);
                        float var146 = 1.0F - var145;
                        float var147 = var146 * 8.0F;
                        var1.translate(var147, 0.0F);
                        float var148 = var163 + 7.0F;
                        String var164 = var137.i;
                        TextStyle var11 = xa;
                        float var172 = var11.size();
                        float var173 = var172 * 0.5F;
                        var12 = var4;
                        long var14 = var12 + 1L;
                        var14 = var12 * var14;
                        long var16 = var12 + 2L;
                        var14 *= var16;
                        var12 += 3L;
                        var14 *= var12;
                        var12 = var14 & 7L;
                        long var268;
                        int var189 = (var268 = var12 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                        if (var189 != 0) {
                            var3 >>= 14;
                            var3 ^= -202250576;
                            break;
                        }

                        var3 ^= -956000469;
                        var3 ^= -2107167794;
                        var3 ^= 190754216;
                        int var190 = var3 + 1;
                        int var191 = var3 * var190;
                        int var13 = var3 + 2;
                        int var192 = var191 * var13;
                        var13 = var3 + 3;
                        int var193 = var192 * var13;
                        int var194 = var193 & 7;
                        if (var194 != 0) {
                            break label167;
                        }

                        float var174 = var148 - var173;
                        TextStyle var195 = this.k;
                        float var165 = var1.text(var164, 22.0F, var174, var195);
                        float var166 = var121 - 7.0F;
                        float var167 = var166 - 30.0F;
                        float var175 = var148 - 5.0F;
                        kN.MB(var1, var123, var167, var175, 30.0F, 10.0F);
                        Re var196 = var137.qA;
                        float var197 = var196.ey();
                        float var198 = TP.S(var197);
                        float var199 = 30.0F * var198;
                        float var269;
                        var13 = (var269 = var199 - 0.3F) == 0.0F ? 0 : (var269 < 0.0F ? -1 : 1);
                        if (var13 > 0) {
                            var3 &= -1116958887;
                            var3 ^= 1772236700;
                            float var270;
                            var13 = (var270 = var199 - 10.0F) == 0.0F ? 0 : (var270 < 0.0F ? -1 : 1);
                            Integer var233 = var4;
                            if (var233 == null) {
                                switch (var3) {
                                    case -1856182838:
                                    default:
                                        var3 ^= 65726059;
                                        break label154;
                                    case -1064685868:
                                        var3 *= 217000927;
                                        var3 ^= -1708714420;
                                        break label154;
                                    case 648811591:
                                        var3 ^= 214311658;
                                        break label154;
                                }
                            }

                            var3 -= 904701187;
                            var3 -= -1093633292;
                            var3 |= 2058399914;
                            var3 += -231379476;
                            var3 ^= -1574623446;
                            Integer var234 = var3;
                            if (var234 == null) {
                                break label167;
                            }

                            if (var13 >= 0) {
                                var3 -= -299350437;
                                var3 *= -1320654629;
                                var3 >>= 13;
                                var3 ^= 728016611;
                                Paint var213 = this.tS;
                                var14 = var4;
                                var16 = var14 + 1L;
                                var16 = var14 * var16;
                                var14 = var16 & 1L;
                                long var271;
                                int var237 = (var271 = var14 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                                if (var237 != 0) {
                                    var3 *= -1071518789;
                                    var3 ^= 1922454163;
                                    break;
                                }
                                var3 = switch (var3) {
                                    default -> var3 ^ -1248831349;
                                    case -728019799 -> {
                                        var3 &= 1712720499;
                                        var3 |= -693663627;
                                        var3 -= 1709295587;
                                        var3 |= -461220159;
                                        yield var3 ^ 1135583984;
                                    }
                                    case 1294813014 -> var3 ^ -1115692854;
                                };
                                var14 = var3;
                                var16 = var14 + 1L;
                                var16 = var14 * var16;
                                var14 = var16 & 1L;
                                long var272;
                                int var240 = (var272 = var14 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                                if (var240 != 0) {
                                    break label167;
                                }

                                var1.roundRect(var167, var175, var199, 10.0F, 5.0F, var213);
                                switch (var3) {
                                    case -1216842717:
                                        var3 += -619760180;
                                        var3 &= 180786641;
                                        var3 *= -21810773;
                                        var3 ^= 1659725973;
                                        break;
                                    case -1172747211:
                                        var3 ^= -127729994;
                                        break;
                                    case 1902167107:
                                    default:
                                        var3 ^= 1413353498;
                                }
                            } else {
                                var3 &= 1591696238;
                                var3 *= 164348663;
                                var3 ^= -1842619388;
                                var3 -= 2024585400;
                                var3 ^= 343368002;
                                long var214 = var3;
                                long var15 = var214 + 1L;
                                var15 = var214 * var15;
                                long var17 = var214 + 2L;
                                var15 *= var17;
                                long var215 = var214 + 3L;
                                var15 *= var215;
                                long var216 = var15 & 7L;
                                long var273;
                                var13 = (var273 = var216 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
                                if (var13 != 0) {
                                    break label167;
                                }

                                var1.save();
                                long var218 = var4;
                                var15 = var218 + 1L;
                                var15 = var218 * var15;
                                var17 = var218 + 2L;
                                var15 *= var17;
                                long var219 = var218 + 3L;
                                var15 *= var219;
                                long var220 = var15 & 7L;
                                long var274;
                                var13 = (var274 = var220 - 0L) == 0L ? 0 : (var274 < 0L ? -1 : 1);
                                if (var13 != 0) {
                                    var3 &= -1542404617;
                                    var3 ^= 672134566;
                                    break;
                                }

                                var3 -= 1717584513;
                                var3 ^= 486726207;
                                long var222 = var3;
                                var15 = var222 + 1L;
                                var15 = var222 * var15;
                                var17 = var222 + 2L;
                                var15 *= var17;
                                long var223 = var222 + 3L;
                                var15 *= var223;
                                long var224 = var15 & 7L;
                                long var275;
                                var13 = (var275 = var224 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
                                if (var13 != 0) {
                                    break label167;
                                }

                                var1.clip(var167, var175, var199, 10.0F, 0.0F);
                                Paint var200 = this.tS;
                                var1.roundRect(var167, var175, 10.0F, 10.0F, 5.0F, var200);
                                var1.restore();
                                switch (var3) {
                                    case -39946187:
                                    default:
                                        var3 ^= 418157401;
                                        break;
                                    case 220641010:
                                        var3 *= 595743667;
                                        var3 ^= -733563470;
                                        var3 ^= -1404296966;
                                        break;
                                    case 2003898001:
                                        var3 ^= 1580108086;
                                }
                            }
                        } else {
                            var3 ^= -424486725;
                            var3 |= -277796914;
                            var3 ^= 725027713;
                        }

                        long var176 = var3;
                        long var226 = var176 + 1L;
                        long var227 = var176 * var226;
                        long var177 = var227 & 1L;
                        long var276;
                        int var178 = (var276 = var177 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                        if (var178 != 0) {
                            break label167;
                        }

                        StringBuilder var179 = var137.io;
                        float var138 = var137.Pf;
                        float var139 = 30.0F - var138;
                        float var140 = var139 * 0.5F;
                        float var141 = var167 + var140;
                        TextStyle var168 = a;
                        float var169 = var168.size();
                        var12 = var4;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var16 = var12 + 2L;
                        var14 *= var16;
                        var12 += 3L;
                        var14 *= var12;
                        var12 = var14 & 7L;
                        long var277;
                        int var204 = (var277 = var12 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                        if (var204 != 0) {
                            var3 ^= 1050729015;
                            var3 += 100996154;
                            var3 *= -1487939677;
                            var3 &= 1183005794;
                            var3 ^= 244149376;
                            break;
                        }

                        var3 -= -875886214;
                        var3 ^= 256872859;
                        int var205 = var3 + 1;
                        int var206 = var3 * var205;
                        var13 = var3 + 2;
                        int var207 = var206 * var13;
                        var13 = var3 + 3;
                        int var208 = var207 * var13;
                        int var209 = var208 & 7;
                        if (var209 != 0) {
                            break label167;
                        }

                        float var170 = var169 * 0.5F;
                        float var149 = var148 - var170;
                        TextStyle var171 = this.Y;
                        float var142 = var1.text(var179, var141, var149, var171);
                        var1.restore();
                        switch (var3) {
                            case -1974988790:
                            default:
                                var3 ^= 1963018322;
                                break;
                            case -137463137:
                                var3 -= 1360924068;
                                var3 -= 1385963244;
                                var3 ^= -58193761;
                                break;
                            case 1925351109:
                                var3 ^= 1642441250;
                        }
                    }
                }
            }

            IllegalStateException var120 = new IllegalStateException();
            throw var120;
        }

        IllegalStateException var111 = new IllegalStateException();
        throw var111;
    }

    @Override
    protected void IA(Sn var1, lH_3 var2) {
        label115: {
            int var3 = o;
            var3 ^= -1319032385;
            int var4 = System.identityHashCode(this);
            List var5 = this.s;
            Integer var6 = var4;
            if (var6 != null) {
                var3 &= 1205571745;
                var3 |= 169973098;
                var3 -= 686366446;
                var3 ^= 1309504751;
                var6 = var3;
                if (var6 == null) {
                    break label115;
                }

                Iterator var81 = var5.iterator();
                Iterator var82 = var81;

                var3 = switch (var3) {
                    case -1408302573 -> {
                        var3 ^= 882354655;
                        var3 >>= 5;
                        var3 -= 289194628;
                        yield var3 ^ -536480648;
                    }
                    case -1035045817 -> var3 ^ -191582927;
                    default -> var3 ^ 1149390661;
                };

                while (true) {
                    int var88 = var3 + 1;
                    var88 = var3 * var88;
                    int var7 = var3 + 2;
                    var88 *= var7;
                    var7 = var3 + 3;
                    var88 *= var7;
                    var88 &= 7;
                    if (var88 != 0) {
                        break label115;
                    }

                    boolean var93 = var82.hasNext();
                    var7 = var4 + 1;
                    var7 = var4 * var7;
                    int var8 = var4 + 2;
                    var7 *= var8;
                    var8 = var4 + 3;
                    var7 *= var8;
                    var7 &= 7;
                    if (var7 != 0) {
                        var3 >>= 17;
                        var3 -= -1737387140;
                        var3 ^= 1028211686;
                        break;
                    }

                    var3 &= -1615815229;
                    var3 ^= 1707783620;
                    Integer var105 = var3;
                    if (var105 == null) {
                        break label115;
                    }

                    if (!var93) {
                        var3 -= -57419202;
                        var3 += 261494111;
                        var3 += -70892227;
                        var3 ^= 105353561;
                        var4 = var3 + 1;
                        var4 = var3 * var4;
                        int var83 = var3 + 2;
                        var4 *= var83;
                        int var84 = var3 + 3;
                        var4 *= var84;
                        var4 &= 7;
                        if (var4 == 0) {
                            return;
                        }
                        break label115;
                    }

                    var3 -= 1101447985;
                    var3 += 212111428;
                    var3 ^= -1518147477;
                    Integer var94 = var3;
                    if (var94 == null) {
                        break label115;
                    }

                    Object var95 = var82.next();
                    Vf var96 = (Vf)var95;
                    long var106 = var4;
                    long var9 = var106 + 1L;
                    var9 = var106 * var9;
                    long var107 = var9 & 1L;
                    long var147;
                    int var108 = (var147 = var107 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                    if (var108 != 0) {
                        var3 *= 1833564539;
                        var3 += 395333345;
                        var3 ^= 1095097163;
                        break;
                    }

                    var3 |= -421562464;
                    var3 ^= 1217447582;
                    long var109 = var3;
                    var9 = var109 + 1L;
                    var9 = var109 * var9;
                    long var11 = var109 + 2L;
                    var9 *= var11;
                    long var110 = var109 + 3L;
                    var9 *= var110;
                    long var111 = var9 & 7L;
                    long var148;
                    var108 = (var148 = var111 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                    if (var108 != 0) {
                        break label115;
                    }

                    XF var113 = var96.GK;
                    float var114 = var113.bs();
                    float var149;
                    var108 = (var149 = var114 - 0.6F) == 0.0F ? 0 : (var149 < 0.0F ? -1 : 1);
                    if (var108 >= 0) {
                        var3 -= -1200897117;
                        var3 -= 1995699255;
                        var3 ^= 675002775;
                        ItemStack var116 = var96.Q;
                        int var117 = (var116.isEmpty()) ? 1 : 0;
                        var8 = var4 + 1;
                        var8 = var4 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            var3 |= -1800858546;
                            var3 ^= -465935005;
                            break;
                        }

                        var3 >>= 29;
                        var3 |= -1775137035;
                        var3 |= 1886876652;
                        var3 -= -4310582;
                        var3 ^= -529991817;
                        if (var117 != 0) {
                            var3 *= 801424085;
                            var3 &= 728795884;
                            var3 &= -2001636043;
                            var3 ^= -1896308906;
                            var3 ^= -1177964400;
                            var3 -= -1355244785;
                            var3 += -1797406611;
                            var3 ^= 792437634;
                        } else {
                            var3 = switch (var3) {
                                case -1588117312 -> var3 ^ -428707600;
                                case -534171324 -> {
                                    var3 ^= -1664367170;
                                    var3 &= 474197852;
                                    yield var3 ^ -1830758320;
                                }
                                default -> var3 ^ -2136767185;
                            };
                            long var118 = var3;
                            var9 = var118 + 1L;
                            var9 = var118 * var9;
                            var11 = var118 + 2L;
                            var9 *= var11;
                            long var119 = var118 + 3L;
                            var9 *= var119;
                            long var120 = var9 & 7L;
                            long var150;
                            var117 = (var150 = var120 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                            if (var117 != 0) {
                                break label115;
                            }

                            ItemStack var122 = var96.Q;
                            float var97 = var96.b;
                            float var98 = var97 + 2.0F;
                            var8 = var4 + 1;
                            var8 = var4 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                var3 <<= 17;
                                var3 -= -1614415112;
                                var3 |= -1435860022;
                                var3 ^= -1599228314;
                                break;
                            }

                            var3 |= 353094684;
                            var3 ^= -686381651;
                            var8 = var3 + 1;
                            var8 = var3 * var8;
                            int var144 = var3 + 2;
                            var8 *= var144;
                            int var145 = var3 + 3;
                            var8 *= var145;
                            var8 &= 7;
                            if (var8 != 0) {
                                break label115;
                            }

                            var1.wM(var122, 6.5F, var98, 10.0F);
                            var3 &= 1381914302;
                            var3 ^= -1789388469;
                            var3 += -1756450907;
                            var3 ^= 1263398052;
                            var3 ^= 743629734;
                        }
                    } else {
                        switch (var3) {
                            case -1236291284:
                                var3 -= 1143761230;
                                var3 ^= 2041491836;
                                break;
                            case -1131289177:
                                var3 ^= -694616299;
                                break;
                            case -862690963:
                            default:
                                var3 ^= -1196288882;
                        }
                    }
                }
            } else {
                var3 |= 823286470;
                var3 >>= 5;
                var3 &= -2134984830;
                var3 += -1944889631;
                var3 ^= 1450630351;
            }

            long var71 = var3;
            long var85 = var71 + 1L;
            long var86 = var71 * var85;
            long var72 = var86 & 1L;
            long var151;
            var3 = (var151 = var72 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
            if (var3 == 0) {
                UnsupportedOperationException var74 = new UnsupportedOperationException();
                throw var74;
            }
        }

        AssertionError var75 = new AssertionError();
        throw var75;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1094776786;
        int var2 = HudModule.qG;
        int var4 = of_2.kj(var3, var1, var2);
        o = var4;
        TextStyle var5 = TextStyle.of(8.2F, -1);
        TextStyle var6 = var5.semibold();
        YP = var6;
        TextStyle var7 = TextStyle.of(7.0F, -1);
        TextStyle var8 = var7.medium();
        xa = var8;
        TextStyle var9 = TextStyle.of(6.4F, -1);
        TextStyle var10 = var9.medium();
        TextStyle var11 = var10.tabular();
        a = var11;
    }
}
