package dev.aurap.hub;

import mvggs.modules.client.clickgui;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Glass;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class bS {
    private static final float J = 12.0F;
    private static final float X = 76.0F;
    private static final float P = 32.0F;
    private static final float c = 0.6F;
    private final Ud KV;
    private final List t;
    private final List T;
    private final ut we;
    private final jX qX;
    private final XF OI;
    private boolean Cn;
    private boolean FK;
    private Runnable U;
    private long G;
    private float O;
    private float r;
    private float Ph;
    private float Ls;
    private float hf;
    public static final int x;

    public bS(Ud var1) {
        ArrayList var2 = new ArrayList();
        this.t = var2;
        var2 = new ArrayList();
        this.T = var2;
        ut var10 = new ut();
        this.we = var10;
        jX var11 = new jX();
        this.qX = var11;
        kE_2 var3 = kE_2.uY(0.45F, 0.84F);
        XF var12 = new XF(0.0F, var3);
        this.OI = var12;
        this.Ph = 1.0F;
        this.Ls = 1.0F;
        this.hf = 1.0F;
        this.KV = var1;
        AJ[] var13 = AJ.values();
        AJ[] var14 = var13;
        int var17 = var13.length;
        int var18 = var17;
        int var4 = 0;
        var4 = var4;

        while (var4 < var18) {
            AJ var5 = var14[var4];
            NW var6 = var1.sP();
            List var23 = var6.h(var5);
            Stream var7 = var23.stream();
            Predicate var8 = var0 -> {
                int var1x = x;
                var1x ^= 1974094578;
                int var2x = System.identityHashCode(var0);
                int var3x = var2x + 1;
                var3x = var2x * var3x;
                int var4x = var2x + 2;
                var3x *= var4x;
                var2x += 3;
                var3x *= var2x;
                var2x = var3x & 7;
                if (var2x == 0) {
                    var1x = switch (var1x) {
                        default -> var1x ^ 1552351762;
                        case 857804730 -> {
                            var1x ^= -362770658;
                            var1x &= -1961899511;
                            yield var1x ^ 750348110;
                        }
                        case 1714073378 -> var1x ^ 1626763289;
                    };
                    Integer var36 = var1x;
                    label50:
                    if (var36 != null) {
                        boolean var37 = ((Yn)var0).y();
                        boolean var42;
                        if (!var37) {
                            var1x = switch (var1x) {
                                case -1747645951 -> var1x ^ -1137981608;
                                case -1514608818 -> {
                                    var1x >>= 28;
                                    var1x ^= -1385392237;
                                    yield var1x ^ 44143655;
                                }
                                default -> var1x ^ -563786253;
                            };
                            long var38 = var1x;
                            long var50 = var38 + 1L;
                            long var51 = var38 * var50;
                            long var6x = var38 + 2L;
                            long var52 = var51 * var6x;
                            long var39 = var38 + 3L;
                            long var53 = var52 * var39;
                            long var40 = var53 & 7L;
                            long var54;
                            int var41 = (var54 = var40 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
                            if (var41 != 0) {
                                break label50;
                            }

                            var42 = true;
                            switch (var1x) {
                                case 1345518670:
                                    var1x >>= 6;
                                    var1x += -1380914285;
                                    var1x *= 934610229;
                                    var1x ^= -1666827223;
                                    break;
                                case 1400533784:
                                    var1x ^= -101440158;
                                    break;
                                case 1922502949:
                                default:
                                    var1x ^= -85833296;
                            }
                        } else {
                            var1x = switch (var1x) {
                                case -1514608818 -> {
                                    var1x >>>= 16;
                                    var1x >>>= 12;
                                    yield var1x ^ 1368137989;
                                }
                                default -> var1x ^ -1336476332;
                                case 71045010 -> var1x ^ 973416740;
                            };
                            var3x = var1x + 1;
                            var3x = var1x * var3x;
                            var3x &= 1;
                            if (var3x != 0) {
                                break label50;
                            }

                            var42 = false;
                            var1x ^= -1063108816;
                            var1x -= -1864972742;
                            var1x *= -729093637;
                            var1x ^= -81561702;
                        }

                        return var42;
                    }

                    RuntimeException var43 = new RuntimeException();
                    throw var43;
                } else {
                    var1x *= -737535865;
                    var1x ^= 1890211655;
                    var1x &= 52306332;
                    var1x >>= 21;
                    var1x ^= -1599484901;
                    RuntimeException var14x = new RuntimeException();
                    throw var14x;
                }
            };
            boolean var24 = var7.anyMatch(var8);
            if (var24) {
                List var25 = this.t;
                xV var26 = new xV(var5, var23);
                boolean var21 = var25.add(var26);
            }

            int var22 = var4 + 1;
            var4 = var22;
        }

        PH var15 = var1.ZM();
        wD<T> var19 = (T var1x) -> {
            int var2x = x;
            var2x ^= -1362223291;
            int var3x = System.identityHashCode(this);
            RenderPhase var4x = var1x.phase();
            RenderPhase var5x = RenderPhase.SCREEN;
            Integer var6x = var3x;
            if (var6x == null) {
                var2x &= -399376597;
                var2x *= -1005270525;
                var2x &= -1708745457;
                var2x ^= -963379688;
            } else {
                label77: {
                    var2x >>= 11;
                    var2x &= 1088141260;
                    var2x += -1909954081;
                    var2x *= -827693977;
                    var2x ^= 304789298;
                    var6x = var2x;
                    label65:
                    if (var6x != null) {
                        if (var4x == var5x) {
                            var2x *= -578264705;
                            var2x ^= 1809149746;
                            int var60 = var2x + 1;
                            int var61 = var2x * var60;
                            int var67 = var2x + 2;
                            int var62 = var61 * var67;
                            int var68 = var2x + 3;
                            int var63 = var62 * var68;
                            int var64 = var63 & 7;
                            if (var64 != 0) {
                                break label65;
                            }

                            boolean var65 = this.Cn;
                            Integer var69 = var3x;
                            if (var69 == null) {
                                var2x -= 183356523;
                                var2x <<= 25;
                                var2x += -395181779;
                                var2x ^= 1726215998;
                                break label77;
                            }
                            var2x = switch (var2x) {
                                case -1971476721 -> {
                                    var2x *= 308012309;
                                    var2x >>= 17;
                                    var2x *= -2064936481;
                                    var2x -= 401955404;
                                    yield var2x ^ -1230716793;
                                }
                                case 1068551983 -> var2x ^ -1611622536;
                                default -> var2x ^ 1901532534;
                            };
                            Integer var70 = var2x;
                            if (var70 == null) {
                                break label65;
                            }

                            if (var65) {
                                var2x &= -1656154255;
                                var2x += -924464142;
                                var2x ^= -615932660;
                                Canvas var66 = var1x.canvas();
                                FrameContext var71 = var1x.frame();
                                int var73 = var3x + 1;
                                var73 = var3x * var73;
                                var3x = var73 & 1;
                                if (var3x != 0) {
                                    var2x *= -522322623;
                                    var2x ^= 350218748;
                                    var2x *= -139158979;
                                    var2x |= -307596652;
                                    var2x ^= -1455551100;
                                    break label77;
                                }

                                var2x |= -1934737392;
                                var2x >>>= 13;
                                var2x ^= -989243795;
                                var2x -= 2182327;
                                var2x ^= 633551907;
                                Integer var52 = var2x;
                                if (var52 == null) {
                                    break label65;
                                }

                                int var53 = var2x | -817893137;
                                var53 |= 793433990;
                                var53 ^= -208274143;
                                this.o(var66, var71, var53);
                                var2x += -881457167;
                                var2x ^= 1761466922;
                            } else {
                                switch (var2x) {
                                    case -1194466608:
                                        var2x ^= -765106957;
                                        break;
                                    case -356629524:
                                    default:
                                        var2x ^= 879296039;
                                        break;
                                    case 652398189:
                                        var2x += -633550027;
                                        var2x += 54419386;
                                        var2x &= -430236322;
                                        var2x <<= 21;
                                        var2x ^= -271013354;
                                }
                            }
                        } else {
                            var2x &= 1193098118;
                            var2x &= -1028309273;
                            var2x &= -419025291;
                            var2x ^= -2041019882;
                        }

                        var3x = var2x + 1;
                        var3x = var2x * var3x;
                        var3x &= 1;
                        if (var3x == 0) {
                            return;
                        }
                    }

                    AssertionError var59 = new AssertionError();
                    throw var59;
                }
            }

            AssertionError var50 = new AssertionError();
            throw var50;
        };
        kf var16 = var15.o(T.class, var19);
    }

    private clickgui u(int var1) {
        int var3 = System.identityHashCode(this);
        Ud var4 = this.KV;
        NW var24 = var4.sP();
        Yn var25 = var24.tG(clickgui.class);
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var31;
        var3 = (var31 = var5 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var2 = var1 ^ 564973339;
            var2 *= 474778953;
            var2 *= -262053317;
            var2 ^= -2078615759;
            var2 ^= -224486627;
            Integer var20 = var2;
            if (var20 != null) {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            }
        } else {
            int var16 = switch (var1) {
                default -> var1 ^ 1479236735;
                case -152712769 -> var1 ^ -808091202;
                case 922403676 -> {
                    int var15 = var1 ^ -322767151;
                    yield var15 ^ 1610390843;
                }
            };
            var3 = var16 + 1;
            var3 = var16 * var3;
            var16 = var3 & 1;
            if (var16 == 0) {
                return (clickgui)var25;
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public boolean A() {
        int var1 = x;
        var1 ^= -104847549;
        int var2 = System.identityHashCode(this);
        Integer var22 = var2;
        if (var22 != null) {
            var1 -= -9976384;
            var1 ^= 254632813;
            var1 &= -16303454;
            var1 ^= -49737829;
            return this.Cn;
        } else {
            long var12 = switch (var1) {
                case -1085578741 -> {
                    var1 ^= -1012591770;
                    var1 += 2071390049;
                    var1 ^= -1817895663;
                    yield var1 ^ -417623820;
                }
                case -788495097 -> var1 ^ -595768365;
                default -> var1 ^ 1137190563;
            };
            long var3 = var12 + 1L;
            var3 = var12 * var3;
            long var5 = var12 + 2L;
            var3 *= var5;
            long var13 = var12 + 3L;
            var3 *= var13;
            long var14 = var3 & 7L;
            long var26;
            var1 = (var26 = var14 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            } else {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }
    }

    public boolean gn() {
        int var1 = x;
        var1 ^= -86932242;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 = switch (var1) {
                case -1134902874 -> {
                    var1 &= -55242549;
                    var1 &= 1299175287;
                    yield var1 ^ 356930269;
                }
                default -> var1 ^ 368925125;
                case 1391516328 -> var1 ^ -1291283661;
            };
            Integer var31 = var1;
            label45:
            if (var31 != null) {
                ut var32 = this.we;
                boolean var33 = var32.AE();
                boolean var37;
                if (!var33) {
                    var1 += 1673329809;
                    var1 ^= -159855806;
                    var1 |= -2101956386;
                    var1 |= -1674697896;
                    var1 ^= -1336879222;
                    int var34 = var1 + 1;
                    var34 = var1 * var34;
                    var34 &= 1;
                    if (var34 != 0) {
                        break label45;
                    }

                    var37 = true;
                    var1 -= -292918575;
                    var1 ^= 1484436522;
                } else {
                    var1 <<= 6;
                    var1 *= 1547607401;
                    var1 ^= -28943428;
                    long var43 = var1;
                    long var5 = var43 + 1L;
                    var5 = var43 * var5;
                    long var7 = var43 + 2L;
                    var5 *= var7;
                    long var44 = var43 + 3L;
                    var5 *= var44;
                    long var45 = var5 & 7L;
                    long var52;
                    var3 = (var52 = var45 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        break label45;
                    }

                    var37 = false;
                    switch (var1) {
                        case -1489424413:
                        default:
                            var1 ^= -1416306113;
                            break;
                        case -1153781443:
                            var1 ^= 1860914050;
                            break;
                        case -713668996:
                            var1 >>= 13;
                            var1 ^= -425661893;
                    }
                }

                Integer var47 = var1;
                if (var47 != null) {
                    return var37;
                }
            }
        } else {
            var1 |= -350678945;
            var1 ^= -1949006399;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalStateException var29 = new IllegalStateException();
                throw var29;
            }
        }

        IllegalArgumentException var28 = new IllegalArgumentException();
        throw var28;
    }

    public void dh() {
        int var1 = x;
        var1 ^= 447669752;
        int var2 = System.identityHashCode(this);
        this.Cn = true;
        this.FK = false;
        this.U = null;
        XF var3 = this.OI;
        var3.H(1.0F);
        jX var26 = this.qX;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var34;
        var2 = (var34 = var4 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= -808593131;
            var1 -= 1882371186;
            var1 ^= 884213376;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var29 = var1 + 2;
            var2 *= var29;
            int var30 = var1 + 3;
            var2 *= var30;
            var2 &= 7;
            if (var2 == 0) {
                var26.Ht("ui_open");
            } else {
                AssertionError var25 = new AssertionError();
                throw var25;
            }
        } else {
            switch (var1) {
                case 16101218:
                default:
                    var1 ^= 1421362943;
                    break;
                case 1476687990:
                    var1 ^= -1532886189;
                    break;
                case 1545969840:
                    var1 += -281469402;
                    var1 ^= -740833870;
            }

            IllegalArgumentException var15 = new IllegalArgumentException();
            throw var15;
        }
    }

    public void Jn(Runnable var1) {
        label69: {
            int var2 = x;
            var2 ^= -554043387;
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            if (var4 != null) {
                var2 >>= 26;
                var2 ^= -615284960;
                boolean var56 = this.FK;
                if (var56) {
                    var2 += -904834302;
                    var2 >>= 28;
                    var2 &= -235206608;
                    var2 ^= 295003356;
                    long var72 = var2;
                    long var6 = var72 + 1L;
                    var6 = var72 * var6;
                    long var8 = var72 + 2L;
                    var6 *= var8;
                    long var73 = var72 + 3L;
                    var6 *= var73;
                    long var74 = var6 & 7L;
                    long var87;
                    int var75 = (var87 = var74 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                    if (var75 == 0) {
                        return;
                    }
                    break label69;
                }

                var2 &= 1185195715;
                var2 ^= -59686994;
                var4 = var2;
                if (var4 == null) {
                    break label69;
                }

                int var58 = var2 | -812369251;
                var58 &= 831056960;
                var58 *= 1651275673;
                var58 ^= -1209814963;
                int var62 = this.c(var58) ? 1 : 0;
                long var5 = var3;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var88;
                int var78 = (var88 = var5 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                if (var78 == 0) {
                    var2 ^= 1499810263;
                    var2 &= 1767534623;
                    var2 ^= 453048540;
                    if (var62 == 0) {
                        var2 -= 538336474;
                        var2 ^= 152658095;
                        var2 ^= -633346749;
                        Integer var63 = var2;
                        if (var63 == null) {
                            break label69;
                        }

                        this.B();
                        var62 = var3 + 1;
                        int var65 = var3 * var62;
                        int var79 = var3 + 2;
                        var65 *= var79;
                        int var80 = var3 + 3;
                        var65 *= var80;
                        var65 &= 7;
                        if (var65 == 0) {
                            var2 -= -609340392;
                            var2 |= 499363351;
                            var2 &= -646682604;
                            var2 ^= -290176005;
                            var1.run();
                            return;
                        }

                        var2 *= -1116441405;
                        var2 -= -2021596956;
                        var2 ^= -1341912033;
                    } else {
                        var2 -= -474455853;
                        var2 >>= 14;
                        var2 >>= 16;
                        var2 &= 1875950430;
                        var2 ^= -1015196129;
                        Integer var69 = var2;
                        if (var69 == null) {
                            break label69;
                        }

                        this.FK = true;
                        this.U = var1;
                        jX var70 = this.qX;
                        var70.dl = null;
                        jX var71 = this.qX;
                        Integer var53 = var3;
                        if (var53 != null) {
                            var2 += -1907587382;
                            var2 += -1445828087;
                            var2 ^= -108760399;
                            var71.Q = null;
                            XF var54 = this.OI;
                            var54.H(0.0F);
                            jX var55 = this.qX;
                            var55.Ht("ui_close");
                            return;
                        }

                        switch (var2) {
                            case -1949641858:
                            default:
                                var2 ^= 1922714274;
                                break;
                            case -1015196129:
                                var2 &= -1563290808;
                                var2 += -897781381;
                                var2 |= 1922463092;
                                var2 ^= 1547658807;
                                break;
                            case 1030670895:
                                var2 ^= -832580690;
                        }
                    }
                } else {
                    var2 &= 1294935597;
                    var2 += 264699855;
                    var2 ^= 1965831227;
                }
            } else {
                switch (var2) {
                    case -1737310899:
                        var2 += 636148367;
                        var2 &= -1719591893;
                        var2 *= 1443303927;
                        var2 &= 1186428644;
                        var2 ^= 1685472096;
                        break;
                    case -247316952:
                    default:
                        var2 ^= -1806637890;
                        break;
                    case -198536175:
                        var2 ^= 1534767778;
                }
            }

            Integer var50 = var2;
            if (var50 != null) {
                AssertionError var52 = new AssertionError();
                throw var52;
            }
        }

        UnsupportedOperationException var51 = new UnsupportedOperationException();
        throw var51;
    }

    public void q() {
        label112: {
            int var1 = x;
            var1 ^= -1943113627;
            int var2 = System.identityHashCode(this);
            int var3 = (this.FK ? 1 : 0);
            Integer var4 = var2;
            if (var4 == null) {
                switch (var1) {
                    case -1984112523:
                        var1 ^= -1215850328;
                        break;
                    case -895142611:
                        var1 *= 774189043;
                        var1 -= -793315156;
                        var1 >>= 11;
                        var1 ^= -1779513973;
                        break;
                    case 1737987113:
                    default:
                        var1 ^= -1645991112;
                }
            } else {
                label119: {
                    var1 = switch (var1) {
                        case -1409011799 -> var1 ^ 1264928253;
                        case -895142611 -> {
                            var1 &= 186117876;
                            var1 *= 239645931;
                            yield var1 ^ 445208518;
                        }
                        default -> var1 ^ -1956445171;
                    };
                    var4 = var1;
                    if (var4 == null) {
                        break label112;
                    }

                    if (var3 != 0) {
                        var1 ^= -1748731706;
                        var1 -= 1233129453;
                        var1 ^= -514342119;
                        Integer var62 = var1;
                        if (var62 == null) {
                            break label112;
                        }

                        var3 = var1 ^ -1069883424;
                        int var64 = var3 | 939775171;
                        var64 |= 464484017;
                        var64 -= 287085329;
                        var64 ^= 164129259;
                        boolean var68 = this.c(var64);
                        var4 = var2;
                        if (var4 == null) {
                            var1 |= 1678511923;
                            var1 |= -195941245;
                            var1 ^= -1631198748;
                            break label119;
                        }

                        var1 &= 635993101;
                        var1 *= -1614229915;
                        var1 <<= 29;
                        var1 ^= -1667047095;
                        long var74 = var1;
                        long var6 = var74 + 1L;
                        var6 = var74 * var6;
                        long var75 = var6 & 1L;
                        long var85;
                        int var76 = (var85 = var75 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                        if (var76 != 0) {
                            break label112;
                        }

                        if (!var68) {
                            var1 += -1236040760;
                            var1 += -1466019288;
                            var1 *= 433940261;
                            var1 *= -262588137;
                            var1 ^= -638731360;
                            Runnable var69 = this.U;
                            Integer var55 = var2;
                            if (var55 == null) {
                                switch (var1) {
                                    case -1589608379:
                                        var1 ^= 633746318;
                                        break label119;
                                    case -714171429:
                                        var1 += 634958716;
                                        var1 <<= 6;
                                        var1 *= 1256130149;
                                        var1 -= 130864989;
                                        var1 ^= 1225520;
                                        break label119;
                                    case 443906565:
                                    default:
                                        var1 ^= -231482588;
                                        break label119;
                                }
                            }
                            var1 = switch (var1) {
                                case -852475151 -> var1 ^ -1491438816;
                                case -714171429 -> {
                                    var1 |= -1510540931;
                                    var1 |= -1266522037;
                                    yield var1 ^ 1766055433;
                                }
                                default -> var1 ^ 1161292576;
                            };
                            long var77 = var1;
                            var6 = var77 + 1L;
                            var6 = var77 * var6;
                            long var8 = var77 + 2L;
                            var6 *= var8;
                            long var78 = var77 + 3L;
                            var6 *= var78;
                            long var79 = var6 & 7L;
                            long var86;
                            int var56 = (var86 = var79 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                            if (var56 != 0) {
                                break label112;
                            }

                            this.B();
                            this.U = null;
                            if (var69 != null) {
                                var1 = switch (var1) {
                                    case -1709934568 -> var1 ^ -1276304807;
                                    case -1665325578 -> {
                                        var1 >>= 8;
                                        var1 *= 958520755;
                                        yield var1 ^ 1628645348;
                                    }
                                    default -> var1 ^ -412525299;
                                };
                                var56 = var1 + 1;
                                var56 = var1 * var56;
                                var56 &= 1;
                                if (var56 != 0) {
                                    break label112;
                                }

                                var69.run();
                                var1 += -758702162;
                                var1 ^= -718171721;
                            } else {
                                switch (var1) {
                                    case -1916045301:
                                    default:
                                        var1 ^= -1304213700;
                                        break;
                                    case -1665325578:
                                        var1 -= 1338054121;
                                        var1 += -742190943;
                                        var1 *= -221129689;
                                        var1 += 638947621;
                                        var1 ^= -585365511;
                                        break;
                                    case -922634449:
                                        var1 ^= 1092627934;
                                }
                            }
                        } else {
                            switch (var1) {
                                case -1964142842:
                                    var1 ^= 1692551112;
                                    break;
                                case -954130181:
                                default:
                                    var1 ^= -1138828022;
                                    break;
                                case 480436553:
                                    var1 *= -1656104023;
                                    var1 >>= 3;
                                    var1 ^= 1097826776;
                            }
                        }
                    } else {
                        switch (var1) {
                            case -389535030:
                                var1 *= 1339433235;
                                var1 ^= 1719046816;
                                break;
                            case 267788750:
                            default:
                                var1 ^= 758325090;
                                break;
                            case 498260370:
                                var1 ^= 1049006578;
                        }
                    }

                    long var48 = var1;
                    long var70 = var48 + 1L;
                    long var71 = var48 * var70;
                    long var49 = var71 & 1L;
                    long var87;
                    var1 = (var87 = var49 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return;
                    }
                    break label112;
                }
            }

            Integer var60 = var1;
            if (var60 != null) {
                AssertionError var61 = new AssertionError();
                throw var61;
            }
        }

        IllegalStateException var54 = new IllegalStateException();
        throw var54;
    }

    private boolean c(int var1) {
        int var3 = System.identityHashCode(this);
        long var4 = System.nanoTime();
        long var6 = this.G;
        var4 -= var6;
        var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var67;
        var3 = (var67 = var6 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var27 = var1 - 232711380;
            var27 *= -680626263;
            var27 += 17080566;
            var27 &= -102723248;
            var27 ^= 1712895100;
            AssertionError var32 = new AssertionError();
            throw var32;
        } else {
            int var2 = var1 * 968135001;
            var2 &= -388033973;
            var2 += 216742905;
            var2 &= 1792387122;
            var2 ^= -1222138234;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            label39:
            if (var3 == 0) {
                long var68;
                var3 = (var68 = var4 - 250000000L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                int var43;
                if (var3 < 0) {
                    var2 ^= -1762200043;
                    var2 ^= 1541758325;
                    var43 = var2 + 1;
                    var43 = var2 * var43;
                    int var46 = var2 + 2;
                    var43 *= var46;
                    int var47 = var2 + 3;
                    var43 *= var47;
                    var43 &= 7;
                    if (var43 != 0) {
                        break label39;
                    }

                    var43 = 1;
                    var2 >>= 8;
                    var2 ^= -738056119;
                } else {
                    var2 >>>= 6;
                    var2 |= 181802191;
                    var2 ^= -833639528;
                    var2 <<= 15;
                    var2 ^= 823676125;
                    int var48 = var2 + 1;
                    int var49 = var2 * var48;
                    int var5 = var2 + 2;
                    int var50 = var49 * var5;
                    var5 = var2 + 3;
                    int var51 = var50 * var5;
                    int var52 = var51 & 7;
                    if (var52 != 0) {
                        break label39;
                    }

                    var43 = 0;
                    switch (var2) {
                        case -1359774109:
                        default:
                            var2 ^= 760538855;
                            break;
                        case -909047022:
                            var2 ^= -1538725337;
                            break;
                        case 195808477:
                            var2 -= 1569259757;
                            var2 *= 666967257;
                            var2 ^= 1843746364;
                    }
                }

                int var53 = var2 + 1;
                int var54 = var2 * var53;
                int var59 = var2 + 2;
                int var55 = var54 * var59;
                var59 = var2 + 3;
                int var56 = var55 * var59;
                int var57 = var56 & 7;
                if (var57 == 0) {
                    return (var43 != 0);
                }
            }

            UnsupportedOperationException var44 = new UnsupportedOperationException();
            throw var44;
        }
    }

    public void B() {
        int var1 = x;
        var1 ^= -868905766;
        int var2 = System.identityHashCode(this);
        this.Cn = false;
        this.FK = false;
        XF var3 = this.OI;
        var3.j(0.0F);
        long var23 = var2;
        long var4 = var23 + 1L;
        var4 = var23 * var4;
        long var24 = var4 & 1L;
        long var36;
        var2 = (var36 = var24 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
        int var31 = of_2.iP;
        var1 ^= var31;
        var1 ^= 380143496;
        int var32 = of_2.lt;
        var1 ^= var32;
        var1 ^= -1057129493;
        if (var2 == 0) {
            var1 |= -1038632826;
            var1 ^= 559159132;
            var1 ^= -1770164646;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                jX var29 = this.qX;
                var29.Q = null;
                jX var30 = this.qX;
                var30.dl = null;
                return;
            }
        } else {
            var1 ^= -990016717;
            var1 += 1832756641;
            var1 *= -1505982079;
            var1 ^= 1082180516;
            long var18 = var1;
            long var33 = var18 + 1L;
            long var34 = var18 * var33;
            long var19 = var34 & 1L;
            long var37;
            var1 = (var37 = var19 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            }
        }

        IllegalStateException var21 = new IllegalStateException();
        throw var21;
    }

    public void t(boolean var1) {
        label135: {
            int var2 = x;
            var2 ^= -485545094;
            int var3 = System.identityHashCode(this);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var162;
            int var81 = (var162 = var4 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
            if (var81 != 0) {
                var2 |= -1044189504;
                var2 ^= 1910332552;
            } else {
                var2 >>>= 5;
                var2 &= -392905692;
                var2 += 1583539474;
                var2 *= 88436903;
                var2 ^= -1684612198;
                int var82 = var2 + 1;
                int var83 = var2 * var82;
                int var84 = var83 & 1;
                if (var84 != 0) {
                    break label135;
                }

                List var85 = this.t;
                Iterator var86 = var85.iterator();
                Iterator var87 = var86;
                var2 += 2127622081;
                var2 ^= 274761483;

                label125:
                while (true) {
                    int var5 = var2 + 1;
                    var5 = var2 * var5;
                    int var109 = var2 + 2;
                    var5 *= var109;
                    int var110 = var2 + 3;
                    var5 *= var110;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label135;
                    }

                    int var94 = (var87.hasNext()) ? 1 : 0;
                    int var111 = var3 + 1;
                    int var112 = var3 * var111;
                    int var7 = var3 + 2;
                    int var113 = var112 * var7;
                    var7 = var3 + 3;
                    int var114 = var113 * var7;
                    int var115 = var114 & 7;
                    if (var115 != 0) {
                        var2 |= 449754945;
                        var2 ^= -310498515;
                        var2 &= 126413274;
                        var2 &= -32583782;
                        var2 ^= -1843709192;
                        break;
                    }

                    var2 *= -15502505;
                    var2 -= 1745890699;
                    var2 >>>= 30;
                    var2 += -1675295942;
                    var2 ^= -1285791502;
                    var6 = var2;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var163;
                    int var119 = (var163 = var6 - 0L) == 0L ? 0 : (var163 < 0L ? -1 : 1);
                    if (var119 != 0) {
                        break label135;
                    }

                    if (var94 == 0) {
                        long var76 = switch (var2) {
                            case -1085947271 -> var2 ^ 1022003373;
                            default -> var2 ^ -1447071794;
                            case 796484559 -> {
                                var2 &= 1846692888;
                                yield var2 ^ 1715274129;
                            }
                        };
                        long var104 = var76 + 1L;
                        long var105 = var76 * var104;
                        long var155 = var76 + 2L;
                        long var106 = var105 * var155;
                        long var77 = var76 + 3L;
                        long var107 = var106 * var77;
                        long var78 = var107 & 7L;
                        long var166;
                        var3 = (var166 = var78 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                        break label135;
                    }

                    var2 |= 342425504;
                    var2 &= 964623677;
                    var2 ^= 1420647432;
                    var2 ^= -1258363378;
                    Object var95 = var2;
                    if (var95 == null) {
                        break label135;
                    }

                    var95 = var87.next();
                    xV var97 = (xV)var95;
                    int var120 = var3 + 1;
                    int var121 = var3 * var120;
                    int var122 = var121 & 1;
                    if (var122 != 0) {
                        switch (var2) {
                            case -1029298291:
                                var2 ^= 1910978886;
                                break label125;
                            case -651475157:
                                var2 += -1535146888;
                                var2 -= 1858681749;
                                var2 -= 2105194156;
                                var2 ^= 92105496;
                                break label125;
                            case 64275017:
                            default:
                                var2 ^= 1414865024;
                                break label125;
                        }
                    }

                    var2 -= -766432024;
                    var2 ^= 836783721;
                    int var123 = var2 + 1;
                    int var124 = var2 * var123;
                    var7 = var2 + 2;
                    int var125 = var124 * var7;
                    var7 = var2 + 3;
                    int var126 = var125 * var7;
                    int var127 = var126 & 7;
                    if (var127 != 0) {
                        break label135;
                    }

                    List var98 = var97.F();
                    Iterator var99 = var98.iterator();
                    Iterator var100 = var99;
                    var2 >>= 5;
                    var2 *= 511612053;
                    var2 <<= 24;
                    var2 ^= -1940577104;

                    while (true) {
                        int var128 = var2 + 1;
                        int var129 = var2 * var128;
                        int var130 = var129 & 1;
                        if (var130 != 0) {
                            break label135;
                        }

                        boolean var131 = var100.hasNext();
                        long var142 = var3;
                        long var9 = var142 + 1L;
                        var9 = var142 * var9;
                        long var143 = var9 & 1L;
                        long var164;
                        var7 = (var164 = var143 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            var2 += 508837929;
                            var2 *= 440205379;
                            var2 ^= -1760438607;
                            break label125;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ 1242328207;
                            case 961881264 -> {
                                var2 |= -1225381316;
                                var2 -= 1874512242;
                                var2 &= -182188638;
                                yield var2 ^ -1397680773;
                            }
                            case 965380414 -> var2 ^ -204621997;
                        };
                        if (!var131) {
                            var2 *= -435267607;
                            var2 += -1944861798;
                            var2 ^= 1117200048;
                            var94 = var2 + 1;
                            int var102 = var2 * var94;
                            var102 &= 1;
                            if (var102 != 0) {
                                break label135;
                            }

                            switch (var2) {
                                case -931383217:
                                    var2 ^= 466341944;
                                    continue label125;
                                case -161350133:
                                    var2 >>>= 25;
                                    var2 &= 1259117399;
                                    var2 ^= 189989021;
                                    continue label125;
                                case 1311799028:
                                default:
                                    var2 ^= -664373363;
                                    continue label125;
                            }
                        }
                        var2 = switch (var2) {
                            case -1983401998 -> var2 ^ -328266562;
                            case -57339783 -> {
                                var2 -= 1507487327;
                                var2 |= 1301974610;
                                yield var2 ^ -953168152;
                            }
                            default -> var2 ^ 1857728535;
                        };
                        int var132 = var2 + 1;
                        int var133 = var2 * var132;
                        var7 = var2 + 2;
                        int var134 = var133 * var7;
                        var7 = var2 + 3;
                        int var135 = var134 * var7;
                        int var136 = var135 & 7;
                        if (var136 != 0) {
                            break label135;
                        }

                        Object var137 = var100.next();
                        var7 = var3 + 1;
                        var7 = var3 * var7;
                        int var159 = var3 + 2;
                        var7 *= var159;
                        int var160 = var3 + 3;
                        var7 *= var160;
                        var7 &= 7;
                        if (var7 != 0) {
                            var2 |= -1964468078;
                            var2 *= 320775303;
                            var2 ^= 1829273337;
                            var2 ^= -1022369443;
                            break label125;
                        }

                        var2 <<= 3;
                        var2 += -1212698545;
                        var2 ^= 1468851;
                        var2 += -1935676039;
                        var2 ^= 2126084486;
                        var7 = var2 + 1;
                        var7 = var2 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label135;
                        }

                        pk var138 = (pk)var137;
                        var138.JP(var1);
                        var2 |= -1471218364;
                        var2 |= -1730285811;
                        var2 -= -129383223;
                        var2 ^= 1055071766;
                    }
                }
            }

            long var71 = var2;
            var4 = var71 + 1L;
            var4 = var71 * var4;
            long var72 = var4 & 1L;
            long var165;
            var2 = (var165 = var72 - 0L) == 0L ? 0 : (var165 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var75 = new IllegalArgumentException();
                throw var75;
            }
        }

        AssertionError var74 = new AssertionError();
        throw var74;
    }

    public void Uk(Yn var1, String var2) {
        label157: {
            int var3 = x;
            var3 ^= -1667429204;
            int var4 = System.identityHashCode(this);
            String var5 = var1.UJ();
            this.LV(var5);
            int var97 = var4 + 1;
            int var98 = var4 * var97;
            int var99 = var98 & 1;
            if (var99 != 0) {
                var3 += -741205422;
                var3 ^= -1989447147;
            } else {
                var3 >>= 28;
                var3 -= -361587630;
                var3 ^= 1213098375;
                int var100 = var3 + 1;
                int var101 = var3 * var100;
                int var102 = var101 & 1;
                if (var102 != 0) {
                    break label157;
                }

                List var103 = this.t;
                Iterator var104 = var103.iterator();
                Iterator var105 = var104;

                var3 = switch (var3) {
                    case 334043759 -> var3 ^ -1463856965;
                    case 1573063212 -> {
                        var3 *= 22047291;
                        yield var3 ^ 1986856530;
                    }
                    default -> var3 ^ 748450714;
                };

                label153:
                while (true) {
                    Object var6 = var3;
                    if (var6 == null) {
                        break label157;
                    }

                    boolean var108 = var105.hasNext();
                    int var7 = var4 + 1;
                    var7 = var4 * var7;
                    int var8 = var4 + 2;
                    var7 *= var8;
                    var8 = var4 + 3;
                    var7 *= var8;
                    var7 &= 7;
                    if (var7 != 0) {
                        var3 ^= -862034532;
                        var3 &= -737262755;
                        var3 -= -247779858;
                        var3 ^= -173127769;
                        var3 ^= -1008581410;
                        break;
                    }

                    var3 ^= -443136650;
                    var3 ^= 1416523605;
                    long var119 = var3;
                    long var9 = var119 + 1L;
                    var9 = var119 * var9;
                    long var120 = var9 & 1L;
                    long var156;
                    var7 = (var156 = var120 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label157;
                    }

                    if (!var108) {
                        var3 += -1644350239;
                        var3 &= 783414586;
                        var3 |= -1705889145;
                        var3 &= 1694565112;
                        var3 ^= -698666833;
                        long var87 = var3;
                        long var106 = var87 + 1L;
                        long var107 = var87 * var106;
                        long var88 = var107 & 1L;
                        long var157;
                        var3 = (var157 = var88 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                        break label157;
                    }

                    var3 -= -1099479494;
                    var3 ^= 760021439;
                    var6 = var3;
                    if (var6 == null) {
                        break label157;
                    }

                    var6 = var105.next();
                    xV var111 = (xV)var6;
                    List var112 = var111.F();
                    long var122 = var4;
                    var9 = var122 + 1L;
                    var9 = var122 * var9;
                    long var123 = var9 & 1L;
                    long var158;
                    var7 = (var158 = var123 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        switch (var3) {
                            case -1622640732:
                                var3 *= 30500703;
                                var3 ^= 284746141;
                                var3 *= -1230434541;
                                var3 |= 1860977773;
                                var3 ^= -629390884;
                                break label153;
                            case -238263776:
                            default:
                                var3 ^= -1204928797;
                                break label153;
                            case 772532081:
                                var3 ^= -1494283033;
                                break label153;
                        }
                    }
                    var3 = switch (var3) {
                        case -1622640732 -> {
                            var3 |= -1382340360;
                            var3 ^= -1880104577;
                            var3 ^= -1627624943;
                            yield var3 ^ 1945219308;
                        }
                        case -630489882 -> var3 ^ -2118260165;
                        default -> var3 ^ -970222948;
                    };
                    long var125 = var3;
                    var9 = var125 + 1L;
                    var9 = var125 * var9;
                    long var11 = var125 + 2L;
                    var9 *= var11;
                    long var126 = var125 + 3L;
                    var9 *= var126;
                    long var127 = var9 & 7L;
                    long var159;
                    var7 = (var159 = var127 - 0L) == 0L ? 0 : (var159 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label157;
                    }

                    Iterator var113 = var112.iterator();
                    Iterator var114 = var113;
                    var3 >>>= 17;
                    var3 += -1739929272;
                    var3 |= -1345696975;
                    var3 ^= 1338292698;

                    while (true) {
                        int var129 = (var114.hasNext()) ? 1 : 0;
                        Integer var138 = var4;
                        if (var138 == null) {
                            var3 += -1310255094;
                            var3 &= -2024218984;
                            var3 ^= 1782253677;
                            var3 += -194297157;
                            var3 ^= -78377197;
                            break label153;
                        }
                        var3 = switch (var3) {
                            case -2079311995 -> var3 ^ 373353100;
                            case -267401681 -> {
                                var3 >>>= 10;
                                var3 ^= -578534601;
                                var3 += 297605744;
                                yield var3 ^ -2089656985;
                            }
                            default -> var3 ^ -339396896;
                        };
                        var138 = var3;
                        if (var138 == null) {
                            break label157;
                        }

                        if (var129 == 0) {
                            var3 &= 707608977;
                            var3 ^= 364119010;
                            switch (var3) {
                                case -1123053690:
                                    var3 ^= 952679078;
                                    continue label153;
                                case -866729612:
                                default:
                                    var3 ^= -3046490;
                                    continue label153;
                                case 1035011059:
                                    var3 &= 760577716;
                                    var3 <<= 15;
                                    var3 >>>= 23;
                                    var3 ^= -1048275084;
                                    continue label153;
                            }
                        }

                        var3 >>= 1;
                        var3 += -1792798074;
                        var3 -= 47338767;
                        var3 ^= 2132791174;
                        var129 = var3 + 1;
                        var129 = var3 * var129;
                        int var140 = var3 + 2;
                        var129 *= var140;
                        var140 = var3 + 3;
                        var129 *= var140;
                        var129 &= 7;
                        if (var129 != 0) {
                            break label157;
                        }

                        Object var135 = var114.next();
                        pk var136 = (pk)var135;
                        Integer var142 = var4;
                        if (var142 == null) {
                            var3 += -1105797707;
                            var3 ^= 1373797101;
                            break label153;
                        }

                        var3 *= 1551717857;
                        var3 ^= 1750273783;
                        var142 = var3;
                        if (var142 == null) {
                            break label157;
                        }

                        Yn var144 = var136.JQ();
                        boolean var145;
                        if (var144 == var1) {
                            var3 *= 794766691;
                            var3 *= 1836068811;
                            var3 ^= 267988859;
                            var3 ^= 1291969969;
                            var145 = true;
                            switch (var3) {
                                case -1750714172:
                                    var3 += 1518138022;
                                    var3 ^= 1015375484;
                                    break;
                                case -1732553945:
                                    var3 ^= -1036205233;
                                    break;
                                case -1101215600:
                                default:
                                    var3 ^= -2043292734;
                            }
                        } else {
                            var3 ^= -2133683314;
                            var3 &= -1002853019;
                            var3 += -1276497788;
                            var3 ^= -925332660;
                            var145 = false;
                            var3 >>>= 4;
                            var3 ^= -850035094;
                        }

                        var136.JP(var145);
                        Yn var146 = var136.JQ();
                        Integer var154 = var4;
                        if (var154 == null) {
                            var3 >>>= 31;
                            var3 -= -142669528;
                            var3 ^= 738451706;
                            break label153;
                        }

                        var3 >>>= 9;
                        var3 ^= 1795213587;
                        Integer var155 = var3;
                        if (var155 == null) {
                            break label157;
                        }

                        if (var146 == var1) {
                            var3 = switch (var3) {
                                case -1803626458 -> var3 ^ -1450754952;
                                default -> var3 ^ 856261517;
                                case 1801951797 -> {
                                    var3 &= 1308854904;
                                    yield var3 ^ 760981536;
                                }
                            };
                            var136.v(var2);
                            var3 -= 1319594758;
                            var3 ^= 2003766038;
                        } else {
                            var3 *= 898425137;
                            var3 ^= -1500822955;
                            var3 += -746555268;
                            var3 &= -1487462545;
                            var3 ^= 1317908336;
                        }

                        var3 -= -242633323;
                        var3 -= 1438912012;
                        var3 ^= -660717996;
                    }
                }
            }

            Integer var95 = var3;
            if (var95 != null) {
                UnsupportedOperationException var96 = new UnsupportedOperationException();
                throw var96;
            }
        }

        AssertionError var94 = new AssertionError();
        throw var94;
    }

    public void LV(String var1) {
        int var2 = x;
        var2 ^= 457872308;
        int var3 = System.identityHashCode(this);
        ut var4 = this.we;
        var4.Cz();
        IntStream var23 = var1.codePoints();
        ut var5 = this.we;
        Integer var19 = var3;
        if (var19 == null) {
            var2 >>>= 13;
            var2 ^= 1622627180;
            var2 ^= 1697006478;
            long var6 = var2;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var26;
            int var20 = (var26 = var6 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var20 == 0) {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            } else {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            var2 -= 1236849073;
            var2 <<= 3;
            var2 ^= 1419758527;
            Object var14 = Objects.requireNonNull(var5);
            IntConsumer var15 = var5::t;
            var23.forEach(var15);
        }
    }

    private void o(Canvas var1, FrameContext var2, int var3) {
        label446: {
            int var42;
            int var5 = System.identityHashCode(this);
            long var6 = System.nanoTime();
            this.G = var6;
            float var286 = var2.dt();
            float var287 = var286;
            jX var7 = this.qX;
            var7.FM = var286;
            int var324 = var3 - -225559959;
            int var325 = var324 - -1860196904;
            int var326 = var325 * -1305089279;
            int var327 = var326 | 685672348;
            int var328 = var327 ^ -939240255;
            clickgui var329 = this.u(var328);
            jX var8 = this.qX;
            int var9 = var329.i() ? 1 : 0;
            var8.tX = (var9 != 0);
            float var355 = var2.guiScale();
            this.Ls = var355;
            Integer var356 = var5;
            label445:
            if (var356 != null) {
                var42 = var3 * -1174623647;
                var42 |= 424474428;
                var42 -= 800041289;
                var42 -= 935563862;
                var42 ^= -1449354129;
                int var357 = var42 + 1;
                int var358 = var42 * var357;
                var9 = var42 + 2;
                int var359 = var358 * var9;
                var9 = var42 + 3;
                int var360 = var359 * var9;
                int var361 = var360 & 7;
                if (var361 != 0) {
                    break label446;
                }

                Ud var362 = this.KV;
                float var363 = var362.ia(var2);
                this.hf = var363;
                float var364 = var1.width();
                this.O = var364;
                float var365 = var1.height();
                this.r = var365;
                XF var366 = this.OI;
                float var367 = var366.N(var286);
                int var372 = (this.FK ? 1 : 0);
                if (var372 != 0) {
                    var42 -= -1379776980;
                    var42 &= 50342007;
                    var42 ^= 990735544;
                    long var373 = var42;
                    long var11 = var373 + 1L;
                    var11 = var373 * var11;
                    long var374 = var11 & 1L;
                    long var687;
                    var372 = (var687 = var374 - 0L) == 0L ? 0 : (var687 < 0L ? -1 : 1);
                    if (var372 != 0) {
                        break label446;
                    }

                    float var688;
                    var372 = (var688 = var367 - 0.02F) == 0.0F ? 0 : (var688 < 0.0F ? -1 : 1);
                    long var10 = var5;
                    long var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var689;
                    int var446 = (var689 = var10 - 0L) == 0L ? 0 : (var689 < 0L ? -1 : 1);
                    if (var446 != 0) {
                        switch (var42) {
                            case -960000688:
                            default:
                                var42 ^= -1018511279;
                                break label445;
                            case -885986059:
                                var42 ^= 1436180583;
                                break label445;
                            case 990733564:
                                var42 |= 570675260;
                                var42 ^= 2138123264;
                                break label445;
                        }
                    }

                    var42 -= -430226046;
                    var42 <<= 30;
                    var42 ^= 1455487779;
                    var42 ^= 1510222888;
                    if (var372 < 0) {
                        var42 &= -1444408633;
                        var42 |= -706693519;
                        var42 ^= -1577971954;
                        long var377 = var42;
                        var11 = var377 + 1L;
                        var11 = var377 * var11;
                        long var13 = var377 + 2L;
                        var11 *= var13;
                        long var378 = var377 + 3L;
                        var11 *= var378;
                        long var379 = var11 & 7L;
                        long var690;
                        var372 = (var690 = var379 - 0L) == 0L ? 0 : (var690 < 0L ? -1 : 1);
                        if (var372 != 0) {
                            break label446;
                        }

                        this.Cn = false;
                        this.FK = false;
                        Integer var381 = var5;
                        if (var381 != null) {
                            var42 |= 1679902637;
                            var42 += -487188425;
                            var42 *= -487237965;
                            var42 *= -467260159;
                            var42 ^= -395784611;
                            var381 = var42;
                            if (var381 != null) {
                                Runnable var383 = this.U;
                                this.U = null;
                                if (var383 != null) {
                                    var42 &= 1348622329;
                                    var42 &= 1231799723;
                                    var42 ^= 2127509184;
                                    var42 ^= 812776268;
                                    var42 ^= -830399638;
                                    int var447 = var42 + 1;
                                    int var448 = var42 * var447;
                                    int var494 = var42 + 2;
                                    int var449 = var448 * var494;
                                    int var495 = var42 + 3;
                                    int var450 = var449 * var495;
                                    int var451 = var450 & 7;
                                    if (var451 != 0) {
                                        break label446;
                                    }

                                    var383.run();
                                    var42 += 2079808518;
                                    var42 &= -277052701;
                                    var42 >>= 22;
                                    var42 ^= 643970944;
                                } else {
                                    var42 >>>= 13;
                                    var42 += -1538284794;
                                    var42 *= -1821614913;
                                    var42 <<= 18;
                                    var42 ^= -1954691023;
                                }

                                long var384 = var42;
                                var11 = var384 + 1L;
                                var11 = var384 * var11;
                                var13 = var384 + 2L;
                                var11 *= var13;
                                long var385 = var384 + 3L;
                                var11 *= var385;
                                long var386 = var11 & 7L;
                                long var691;
                                int var387 = (var691 = var386 - 0L) == 0L ? 0 : (var691 < 0L ? -1 : 1);
                                if (var387 == 0) {
                                    return;
                                }
                            }
                            break label446;
                        }

                        var42 |= -1745487000;
                        var42 ^= -1148640383;
                        break label445;
                    }

                    var42 |= 131600320;
                    var42 >>= 30;
                    var42 ^= -1666566984;
                } else {
                    var42 -= 1465516743;
                    var42 ^= -2118936977;
                }

                float var368 = TP.S(var367);
                float var369 = var368;
                float var388 = var329.k();
                var372 = DP.Y(-16312274, var388);
                int var452 = var5 + 1;
                var452 = var5 * var452;
                var452 &= 1;
                label435:
                if (var452 == 0) {
                    var42 *= 1222524677;
                    var42 ^= 1243101143;
                    var452 = var42 + 1;
                    var452 = var42 * var452;
                    int var500 = var42 + 2;
                    var452 *= var500;
                    var500 = var42 + 3;
                    var452 *= var500;
                    var452 &= 7;
                    if (var452 != 0) {
                        break label446;
                    }

                    var452 = var329.ed();
                    if (var452 > 0) {
                        var42 = switch (var42) {
                            case -2055097768 -> var42 ^ -854887117;
                            case 1316947337 -> {
                                var42 &= -1233630496;
                                yield var42 ^ -2135763712;
                            }
                            default -> var42 ^ -1732499755;
                        };
                        Integer var461 = var42;
                        if (var461 == null) {
                            break label446;
                        }

                        var1.save();
                        var1.alpha(var368);
                        float var462 = this.O;
                        float var502 = this.r;
                        int var330 = var329.ed();
                        long var514 = var5;
                        long var14 = var514 + 1L;
                        var14 = var514 * var14;
                        var514 = var14 & 1L;
                        long var692;
                        int var516 = (var692 = var514 - 0L) == 0L ? 0 : (var692 < 0L ? -1 : 1);
                        if (var516 != 0) {
                            var42 |= -1509254769;
                            var42 += 1371638379;
                            var42 <<= 16;
                            var42 >>= 13;
                            var42 ^= 1149101868;
                            break label435;
                        }

                        var42 &= -1167443622;
                        var42 >>>= 22;
                        var42 ^= -529841135;
                        var514 = var42;
                        var14 = var514 + 1L;
                        var14 = var514 * var14;
                        long var16 = var514 + 2L;
                        var14 *= var16;
                        var514 += 3L;
                        var14 *= var514;
                        var514 = var14 & 7L;
                        long var693;
                        int var520 = (var693 = var514 - 0L) == 0L ? 0 : (var693 < 0L ? -1 : 1);
                        if (var520 != 0) {
                            break label446;
                        }

                        var1.backdrop(0.0F, 0.0F, var462, var502, 0.0F, var330, var372);
                        var1.restore();
                        var42 += 209479004;
                        var42 -= 1502609149;
                        var42 ^= -2104324438;
                    } else {
                        var42 = switch (var42) {
                            default -> var42 ^ -917244911;
                            case 772228285 -> var42 ^ 863078416;
                            case 1316947337 -> {
                                var42 ^= -1299577213;
                                var42 ^= -391789777;
                                var42 ^= -2020683188;
                                var42 -= -1785235784;
                                yield var42 ^ 1628747461;
                            }
                        };
                        float var331 = this.O;
                        var452 = var5 + 1;
                        var452 = var5 * var452;
                        var500 = var5 + 2;
                        var452 *= var500;
                        var500 = var5 + 3;
                        var452 *= var500;
                        var452 &= 7;
                        if (var452 != 0) {
                            var42 -= 1616483168;
                            var42 |= 1117210383;
                            var42 ^= 981534691;
                            break label435;
                        }

                        var42 += 2101364839;
                        var42 -= 1580698768;
                        var42 ^= 464603975;
                        var42 ^= 1667648048;
                        float var468 = this.r;
                        var372 = DP.nq(var372, var368);
                        var1.rect(0.0F, 0.0F, var331, var468, var372);
                        switch (var42) {
                            case -1507206474:
                            default:
                                var42 ^= -1450495682;
                                break;
                            case -963778500:
                                var42 += -1840382010;
                                var42 &= -1993319520;
                                var42 *= 1303196367;
                                var42 ^= -145638329;
                                var42 ^= -1112627558;
                                break;
                            case -932072032:
                                var42 ^= -1706625872;
                        }
                    }

                    List var332 = this.T;
                    var332.clear();
                    List var333 = this.t;
                    Iterator var334 = var333.iterator();
                    Integer var391 = var5;
                    if (var391 != null) {
                        var42 *= 121349127;
                        var42 *= 736215053;
                        var42 |= 733247191;
                        var42 &= -399897365;
                        var42 ^= 124449923;
                        int var392 = var42 + 1;
                        var392 = var42 * var392;
                        var452 = var42 + 2;
                        var392 *= var452;
                        var452 = var42 + 3;
                        var392 *= var452;
                        var392 &= 7;
                        if (var392 != 0) {
                            break label446;
                        }

                        Iterator var335 = var334;
                        var42 -= 1989323253;
                        var42 -= 1541837100;
                        var42 ^= 1090113629;

                        label421:
                        while (true) {
                            int var397 = (var335.hasNext()) ? 1 : 0;
                            Integer var471 = var5;
                            if (var471 == null) {
                                switch (var42) {
                                    case -1170114726:
                                    default:
                                        var42 ^= -1497462632;
                                        break label421;
                                    case 1547070842:
                                        var42 >>>= 9;
                                        var42 |= -663709478;
                                        var42 += -1010391312;
                                        var42 ^= -667182574;
                                        break label421;
                                    case 1781946281:
                                        var42 ^= 1094435683;
                                        break label421;
                                }
                            }
                            var42 = switch (var42) {
                                default -> var42 ^ 1416566698;
                                case 1439105254 -> var42 ^ -1600419330;
                                case 1547070842 -> {
                                    var42 ^= 748357386;
                                    var42 += 1938741497;
                                    var42 -= -477602862;
                                    yield var42 ^ -1230483932;
                                }
                            };
                            var471 = var42;
                            if (var471 == null) {
                                break label446;
                            }

                            if (var397 == 0) {
                                var42 = switch (var42) {
                                    case -1470999765 -> var42 ^ -1400591824;
                                    default -> var42 ^ -1932250575;
                                    case -1239701069 -> {
                                        var42 |= -697240745;
                                        yield var42 ^ -1619149538;
                                    }
                                };
                                List var336 = this.T;
                                int var337 = var336.size();
                                int var338 = var337;
                                float var405 = var337;
                                float var406 = var405 * 148.0F;
                                int var478 = var337 - 1;
                                var478 = Math.max(0, var478);
                                float var480 = var478;
                                float var481 = var480 * 12.0F;
                                float var407 = var406 + var481;
                                float var482 = this.O;
                                float var483 = var482 - 24.0F;
                                float var509 = Math.max(1.0F, var407);
                                float var484 = var483 / var509;
                                float var485 = Math.min(1.0F, var484);
                                this.Ph = var485;
                                float var486 = this.O;
                                float var510 = this.Ph;
                                float var487 = var486 / var510;
                                float var511 = this.r;
                                float var521 = this.Ph;
                                float var512 = var511 / var521;
                                float var408 = var487 - var407;
                                float var409 = var408 / 2.0F;
                                float var410 = var409;
                                List var522 = this.t;
                                int var523 = var522.size();
                                var521 = var523;
                                var521 *= 148.0F;
                                var521 = var487 - var521;
                                List var531 = this.t;
                                int var532 = var531.size();
                                float var534 = --var532;
                                float var535 = var534 * 12.0F;
                                var521 -= var535;
                                var521 /= 2.0F;
                                var521 = Math.max(12.0F, var521);
                                float var536 = var487 - var521;
                                int var590 = var5 + 1;
                                var590 = var5 * var590;
                                var590 &= 1;
                                if (var590 != 0) {
                                    var42 |= -1228733144;
                                    var42 >>>= 7;
                                    var42 *= -1384676339;
                                    var42 ^= -2104876609;
                                    break;
                                } else {
                                    var42 &= 1287257948;
                                    var42 += -444463614;
                                    var42 |= -1884850719;
                                    var42 ^= -482406431;
                                    long var593 = var42;
                                    long var645 = var593 + 1L;
                                    var645 = var593 * var645;
                                    long var18 = var593 + 2L;
                                    var645 *= var18;
                                    long var594 = var593 + 3L;
                                    var645 *= var594;
                                    long var595 = var645 & 7L;
                                    long var694;
                                    var590 = (var694 = var595 - 0L) == 0L ? 0 : (var694 < 0L ? -1 : 1);
                                    if (var590 != 0) {
                                        break label446;
                                    }

                                    Lv var597 = sT_2.aO;
                                    float var598 = var597.l(var368);
                                    float var599 = 1.0F - var598;
                                    float var600 = var599 * 18.0F;
                                    float var601 = var600;
                                    float var15 = var512 - 76.0F;
                                    var15 -= 32.0F;
                                    var15 -= 32.0F;
                                    var15 -= 8.0F;
                                    var15 = var15;
                                    var1.save();
                                    float var649 = this.Ph;
                                    var1.scale(var649);
                                    byte var650 = 0;
                                    int var651 = var650;
                                    var42 *= 1219495293;
                                    var42 ^= -347521350;

                                    while (true) {
                                        long var17 = var42;
                                        long var19 = var17 + 1L;
                                        var19 = var17 * var19;
                                        long var21 = var17 + 2L;
                                        var19 *= var21;
                                        var17 += 3L;
                                        var19 *= var17;
                                        var17 = var19 & 7L;
                                        long var695;
                                        int var654 = (var695 = var17 - 0L) == 0L ? 0 : (var695 < 0L ? -1 : 1);
                                        if (var654 != 0) {
                                            break label446;
                                        }

                                        if (var651 >= var338) {
                                            var42 = switch (var42) {
                                                case -152823126 -> var42 ^ 1083573955;
                                                default -> var42 ^ 95426452;
                                                case 2093014616 -> {
                                                    var42 &= -1613429217;
                                                    var42 ^= -1787757901;
                                                    var42 *= 2081976997;
                                                    var42 |= -1176211733;
                                                    yield var42 ^ 103538181;
                                                }
                                            };
                                            long var614 = var42;
                                            var17 = var614 + 1L;
                                            var17 = var614 * var17;
                                            var19 = var614 + 2L;
                                            var17 *= var19;
                                            long var615 = var614 + 3L;
                                            var17 *= var615;
                                            long var616 = var17 & 7L;
                                            long var696;
                                            var397 = (var696 = var616 - 0L) == 0L ? 0 : (var696 < 0L ? -1 : 1);
                                            if (var397 != 0) {
                                                break label446;
                                            }

                                            ut var412 = this.we;
                                            float var537 = var536 - 210.0F;
                                            float var602 = 24.0F + var601;
                                            var412.dg(var537, var602, var287);
                                            long var538 = var5;
                                            long var617 = var538 + 1L;
                                            long var618 = var538 * var617;
                                            long var539 = var618 & 1L;
                                            long var697;
                                            int var288 = (var697 = var539 - 0L) == 0L ? 0 : (var697 < 0L ? -1 : 1);
                                            if (var288 == 0) {
                                                var42 ^= -1192324960;
                                                var42 -= -1216703462;
                                                var42 ^= 1904119351;
                                                Integer var289 = var42;
                                                if (var289 == null) {
                                                    break label446;
                                                }

                                                byte var290 = 0;
                                                int var291 = var290;
                                                var42 -= -403241509;
                                                var42 ^= 536977105;

                                                while (true) {
                                                    var397 = var42 + 1;
                                                    var397 = var42 * var397;
                                                    var397 &= 1;
                                                    if (var397 != 0) {
                                                        break label446;
                                                    }

                                                    if (var291 >= var338) {
                                                        var42 = switch (var42) {
                                                            case -1834333301 -> var42 ^ -1264809078;
                                                            default -> var42 ^ 1708388485;
                                                            case 1959289421 -> {
                                                                var42 &= -2101047981;
                                                                var42 *= -448622245;
                                                                var42 += 1685174920;
                                                                var42 *= -10810617;
                                                                yield var42 ^ -1881194841;
                                                            }
                                                        };
                                                        ut var292 = this.we;
                                                        var292.P(var1, var369);
                                                        long var547 = var5;
                                                        long var621 = var547 + 1L;
                                                        long var622 = var547 * var621;
                                                        var17 = var547 + 2L;
                                                        long var623 = var622 * var17;
                                                        long var548 = var547 + 3L;
                                                        long var624 = var623 * var548;
                                                        long var549 = var624 & 7L;
                                                        long var698;
                                                        int var293 = (var698 = var549 - 0L) == 0L ? 0 : (var698 < 0L ? -1 : 1);
                                                        if (var293 == 0) {
                                                            var42 ^= -1547199338;
                                                            var42 &= -452589773;
                                                            var42 ^= 945022678;
                                                            long var550 = var42;
                                                            long var625 = var550 + 1L;
                                                            long var626 = var550 * var625;
                                                            long var551 = var626 & 1L;
                                                            long var699;
                                                            int var294 = (var699 = var551 - 0L) == 0L ? 0 : (var699 < 0L ? -1 : 1);
                                                            if (var294 != 0) {
                                                                break label446;
                                                            }

                                                            byte var295 = 0;
                                                            int var296 = var295;
                                                            var42 += -71299643;
                                                            var42 -= -132360767;
                                                            var42 ^= 1979314209;

                                                            while (var296 < var338) {
                                                                var42 = switch (var42) {
                                                                    case -805434558 -> var42 ^ 298382715;
                                                                    default -> var42 ^ 272214539;
                                                                    case 1779199995 -> {
                                                                        var42 += 533284252;
                                                                        var42 += -535323937;
                                                                        var42 <<= 5;
                                                                        var42 += -191493457;
                                                                        yield var42 ^ 42627624;
                                                                    }
                                                                };
                                                                long var552 = var42;
                                                                long var627 = var552 + 1L;
                                                                long var628 = var552 * var627;
                                                                var17 = var552 + 2L;
                                                                long var629 = var628 * var17;
                                                                long var553 = var552 + 3L;
                                                                long var630 = var629 * var553;
                                                                long var554 = var630 & 7L;
                                                                long var700;
                                                                var397 = (var700 = var554 - 0L) == 0L ? 0 : (var700 < 0L ? -1 : 1);
                                                                if (var397 != 0) {
                                                                    break label446;
                                                                }

                                                                List var430 = this.T;
                                                                Object var431 = var430.get(var296);
                                                                int var555 = var5 + 1;
                                                                int var556 = var5 * var555;
                                                                var590 = var5 + 2;
                                                                int var557 = var556 * var590;
                                                                var590 = var5 + 3;
                                                                int var558 = var557 * var590;
                                                                int var559 = var558 & 7;
                                                                if (var559 != 0) {
                                                                    var42 &= 1813118838;
                                                                    var42 &= 1420170958;
                                                                    var42 -= -772493042;
                                                                    var42 ^= 1786087876;
                                                                    break label421;
                                                                }

                                                                var42 |= 540281798;
                                                                var42 &= 488938947;
                                                                var42 ^= -971409028;
                                                                xV var432 = (xV)var431;
                                                                int var560 = var42 * -75851337;
                                                                int var561 = var560 * 1550128477;
                                                                int var562 = var561 | 490747948;
                                                                int var563 = var562 & -1021514604;
                                                                int var564 = var563 ^ -284134359;
                                                                float var565 = Xn(var369, var296, var564);
                                                                jX var605 = this.qX;
                                                                boolean var606 = var605.tX;
                                                                var432.gB(var1, var565, var606);
                                                                var397 = var296 + 1;
                                                                var296 = var397;
                                                                var42 += 523182663;
                                                                var42 ^= -1621033731;
                                                            }
                                                            var42 = switch (var42) {
                                                                case 286509865 -> var42 ^ 1790342088;
                                                                default -> var42 ^ -643594401;
                                                                case 1779199995 -> {
                                                                    var42 |= 681687222;
                                                                    yield var42 ^ 1320955839;
                                                                }
                                                            };
                                                            long var566 = var42;
                                                            long var631 = var566 + 1L;
                                                            long var632 = var566 * var631;
                                                            var17 = var566 + 2L;
                                                            long var633 = var632 * var17;
                                                            long var567 = var566 + 3L;
                                                            long var634 = var633 * var567;
                                                            long var568 = var634 & 7L;
                                                            long var701;
                                                            int var297 = (var701 = var568 - 0L) == 0L ? 0 : (var701 < 0L ? -1 : 1);
                                                            if (var297 != 0) {
                                                                break label446;
                                                            }

                                                            ut var298 = this.we;
                                                            jX var434 = this.qX;
                                                            int var435 = var434.tX ? 1 : 0;
                                                            long var569 = var5;
                                                            long var635 = var569 + 1L;
                                                            long var636 = var569 * var635;
                                                            var17 = var569 + 2L;
                                                            long var637 = var636 * var17;
                                                            long var570 = var569 + 3L;
                                                            long var638 = var637 * var570;
                                                            long var571 = var638 & 7L;
                                                            long var702;
                                                            int var572 = (var702 = var571 - 0L) == 0L ? 0 : (var702 < 0L ? -1 : 1);
                                                            if (var572 == 0) {
                                                                var42 *= -1528821293;
                                                                var42 |= -802426799;
                                                                var42 += -77918293;
                                                                var42 += -1122076277;
                                                                var42 ^= -2104194206;
                                                                long var573 = var42;
                                                                long var639 = var573 + 1L;
                                                                long var640 = var573 * var639;
                                                                long var574 = var640 & 1L;
                                                                long var703;
                                                                int var575 = (var703 = var574 - 0L) == 0L ? 0 : (var703 < 0L ? -1 : 1);
                                                                if (var575 != 0) {
                                                                    break label446;
                                                                }

                                                                var298.l(var1, var369, (var435 != 0));
                                                                byte var299 = 0;
                                                                int var300 = var299;
                                                                var42 >>= 16;
                                                                var42 >>= 7;
                                                                var42 ^= 547942463;

                                                                while (var300 < var338) {
                                                                    var42 ^= -1187886015;
                                                                    var42 |= 1567327448;
                                                                    var42 ^= 1666026177;
                                                                    List var436 = this.T;
                                                                    int var576 = var5 + 1;
                                                                    int var577 = var5 * var576;
                                                                    int var578 = var577 & 1;
                                                                    if (var578 != 0) {
                                                                        var42 &= 1712560714;
                                                                        var42 >>= 22;
                                                                        var42 |= 404861339;
                                                                        var42 += -1442516129;
                                                                        var42 ^= -2041021434;
                                                                        break label421;
                                                                    }

                                                                    var42 &= -1210230467;
                                                                    var42 &= 1063851391;
                                                                    var42 ^= -283310071;
                                                                    var42 ^= -1758789706;
                                                                    long var579 = var42;
                                                                    long var641 = var579 + 1L;
                                                                    long var642 = var579 * var641;
                                                                    long var580 = var642 & 1L;
                                                                    long var704;
                                                                    int var581 = (var704 = var580 - 0L) == 0L ? 0 : (var704 < 0L ? -1 : 1);
                                                                    if (var581 != 0) {
                                                                        break label446;
                                                                    }

                                                                    Object var437 = var436.get(var300);
                                                                    xV var438 = (xV)var437;
                                                                    jX var582 = this.qX;
                                                                    var590 = var42 & -608354222;
                                                                    var590 ^= -467018577;
                                                                    float var609 = Xn(var369, var300, var590);
                                                                    var438.gI(var1, var582, var609);
                                                                    var435 = var300 + 1;
                                                                    var300 = var435;
                                                                    var42 -= 541719807;
                                                                    var42 &= -1746767194;
                                                                    var42 *= -582671491;
                                                                    var42 &= 691834398;
                                                                    var42 ^= 565739063;
                                                                }

                                                                var42 >>= 30;
                                                                var42 >>>= 7;
                                                                var42 -= -2087883393;
                                                                var42 |= 1119476080;
                                                                var42 ^= 601159140;
                                                                Integer var301 = var42;
                                                                if (var301 == null) {
                                                                    break label446;
                                                                }

                                                                ut var302 = this.we;
                                                                var302.H(var1, var369);
                                                                Integer var303 = var5;
                                                                if (var303 != null) {
                                                                    var42 -= 32170413;
                                                                    var42 ^= -1494150228;
                                                                    Integer var304 = var42;
                                                                    if (var304 == null) {
                                                                        break label446;
                                                                    }

                                                                    if (var338 == 0) {
                                                                        var42 >>= 1;
                                                                        var42 ^= -1379030096;
                                                                        int var305 = var42 + 1;
                                                                        int var306 = var42 * var305;
                                                                        int var339 = var42 + 2;
                                                                        int var307 = var306 * var339;
                                                                        int var340 = var42 + 3;
                                                                        int var308 = var307 * var340;
                                                                        int var309 = var308 & 7;
                                                                        if (var309 != 0) {
                                                                            break label446;
                                                                        }

                                                                        ut var310 = this.we;
                                                                        String var311 = var310.I();
                                                                        String var312 = "No modules match \"" + var311 + "\"";
                                                                        int var341 = var5 + 1;
                                                                        int var342 = var5 * var341;
                                                                        var435 = var5 + 2;
                                                                        int var343 = var342 * var435;
                                                                        var435 = var5 + 3;
                                                                        int var344 = var343 * var435;
                                                                        int var345 = var344 & 7;
                                                                        if (var345 != 0) {
                                                                            switch (var42) {
                                                                                case 107462716:
                                                                                default:
                                                                                    var42 ^= 605011090;
                                                                                    break label421;
                                                                                case 340815765:
                                                                                    var42 ^= -776152685;
                                                                                    break label421;
                                                                                case 1394017362:
                                                                                    var42 |= -1247043055;
                                                                                    var42 += 1755960947;
                                                                                    var42 += -111142880;
                                                                                    var42 ^= 498551834;
                                                                                    break label421;
                                                                            }
                                                                        }

                                                                        var42 >>= 19;
                                                                        var42 += -1119469467;
                                                                        var42 -= -1014571464;
                                                                        var42 ^= -2076976030;
                                                                        var42 ^= 597388330;
                                                                        long var583 = var42;
                                                                        long var643 = var583 + 1L;
                                                                        long var644 = var583 * var643;
                                                                        long var584 = var644 & 1L;
                                                                        long var705;
                                                                        int var346 = (var705 = var584 - 0L) == 0L ? 0 : (var705 < 0L ? -1 : 1);
                                                                        if (var346 != 0) {
                                                                            break label446;
                                                                        }

                                                                        float var347 = var487 / 2.0F;
                                                                        float var442 = var512 / 2.0F;
                                                                        float var443 = var442 - 6.0F;
                                                                        TextStyle var488 = TextStyle.of(9.0F, -4075035);
                                                                        float var313 = var1.textCentered(var312, var347, var443, var488);
                                                                        switch (var42) {
                                                                            case 44551067:
                                                                                var42 ^= -1171734619;
                                                                                break;
                                                                            case 1369474262:
                                                                            default:
                                                                                var42 ^= 855163533;
                                                                                break;
                                                                            case 1578622151:
                                                                                var42 += -1381068149;
                                                                                var42 >>= 19;
                                                                                var42 ^= -705557223;
                                                                        }
                                                                    } else {
                                                                        var42 -= 940305548;
                                                                        var42 += 926354855;
                                                                        var42 += -825981680;
                                                                        var42 &= -916333025;
                                                                        var42 ^= 483592302;
                                                                    }

                                                                    int var314 = DP.nq(-854017, var369);
                                                                    TextStyle var315 = TextStyle.of(20.0F, var314);
                                                                    TextStyle var316 = var315.semibold();
                                                                    float var317 = var1.text("aura", var521, 18.0F, var316);
                                                                    float var318 = var521 + 52.0F;
                                                                    int var348 = DP.nq(-7684353, var369);
                                                                    TextStyle var349 = TextStyle.of(7.0F, var348);
                                                                    TextStyle var350 = var349.spacing(1.3F);
                                                                    float var319 = var1.text("VISUALS", var318, 18.0F, var350);
                                                                    int var320 = var42 - 581977149;
                                                                    int var321 = var320 ^ 1427045502;
                                                                    this.Qe(var1, var369, var321);
                                                                    int var322 = var5 + 1;
                                                                    int var323 = var5 * var322;
                                                                    var5 = var323 & 1;
                                                                    if (var5 == 0) {
                                                                        var42 += -1777104207;
                                                                        var42 <<= 22;
                                                                        var42 *= -1550606909;
                                                                        var42 ^= 347493720;
                                                                        long var280 = var42;
                                                                        long var351 = var280 + 1L;
                                                                        long var352 = var280 * var351;
                                                                        long var444 = var280 + 2L;
                                                                        long var353 = var352 * var444;
                                                                        long var281 = var280 + 3L;
                                                                        long var354 = var353 * var281;
                                                                        long var282 = var354 & 7L;
                                                                        long var706;
                                                                        var5 = (var706 = var282 - 0L) == 0L ? 0 : (var706 < 0L ? -1 : 1);
                                                                        if (var5 == 0) {
                                                                            var1.restore();
                                                                            return;
                                                                        }
                                                                        break label446;
                                                                    }

                                                                    switch (var42) {
                                                                        case -2116027041:
                                                                            var42 ^= -609605694;
                                                                            break label421;
                                                                        case -1578742187:
                                                                        default:
                                                                            var42 ^= 1565584235;
                                                                            break label421;
                                                                        case -705557407:
                                                                            var42 *= 661091935;
                                                                            var42 += -1697406965;
                                                                            var42 ^= 387921654;
                                                                    }
                                                                } else {
                                                                    var42 -= 764866009;
                                                                    var42 ^= 1810274496;
                                                                }
                                                            } else {
                                                                var42 += 1315664804;
                                                                var42 &= -1989525211;
                                                                var42 &= -700767600;
                                                                var42 ^= 1146542332;
                                                            }
                                                        } else {
                                                            var42 *= -1951445443;
                                                            var42 -= 1859426691;
                                                            var42 ^= 990655867;
                                                        }
                                                        break label421;
                                                    }

                                                    var42 &= 612604111;
                                                    var42 += 1364396023;
                                                    var42 ^= 6938408;
                                                    long var540 = var42;
                                                    long var619 = var540 + 1L;
                                                    long var620 = var540 * var619;
                                                    long var541 = var620 & 1L;
                                                    long var707;
                                                    var397 = (var707 = var541 - 0L) == 0L ? 0 : (var707 < 0L ? -1 : 1);
                                                    if (var397 != 0) {
                                                        break label446;
                                                    }

                                                    List var417 = this.T;
                                                    Object var418 = var417.get(var291);
                                                    xV var419 = (xV)var418;
                                                    int var542 = var42 + 1585410851;
                                                    int var543 = var542 ^ 2049365538;
                                                    float var544 = Xn(var369, var291, var543);
                                                    var419.G(var1, var544);
                                                    var397 = var5 + 1;
                                                    var397 = var5 * var397;
                                                    var397 &= 1;
                                                    if (var397 != 0) {
                                                        var42 &= 1823170635;
                                                        var42 ^= 550803636;
                                                        break label421;
                                                    }

                                                    var42 &= 488156899;
                                                    var42 += -1402169880;
                                                    var42 -= 1525182074;
                                                    var42 ^= 1998985302;
                                                    var397 = var42 + 1;
                                                    var397 = var42 * var397;
                                                    int var545 = var42 + 2;
                                                    var397 *= var545;
                                                    int var546 = var42 + 3;
                                                    var397 *= var546;
                                                    var397 &= 7;
                                                    if (var397 != 0) {
                                                        break label446;
                                                    }

                                                    var397 = var291 + 1;
                                                    var291 = var397;
                                                    var42 *= -591027975;
                                                    var42 <<= 2;
                                                    var42 ^= 1284432173;
                                                }
                                            } else {
                                                var42 ^= -1740454178;
                                                var42 &= -966268401;
                                                var42 |= 1870088169;
                                                var42 -= 2114397350;
                                                var42 ^= -1257333829;
                                                break label421;
                                            }
                                        }

                                        var42 |= -286386955;
                                        var42 -= -340487623;
                                        var42 ^= -2066952625;
                                        var42 <<= 28;
                                        var42 ^= 1770583241;
                                        List var655 = this.T;
                                        Object var656 = var655.get(var651);
                                        xV var657 = (xV)var656;
                                        float var667 = var651;
                                        float var668 = var667 * 160.0F;
                                        float var669 = var410 + var668;
                                        float var678 = var651;
                                        float var679 = var678 * 0.15F;
                                        float var681 = var601 * ++var679;
                                        float var682 = 76.0F + var681;
                                        var657.W(var669, var682, var15, var287);
                                        jX var670 = this.qX;
                                        var657.c(var670, var287);
                                        int var658 = var651 + 1;
                                        var18 = var5;
                                        long var20 = var18 + 1L;
                                        var20 = var18 * var20;
                                        long var22 = var18 + 2L;
                                        var20 *= var22;
                                        var18 += 3L;
                                        var20 *= var18;
                                        var18 = var20 & 7L;
                                        long var708;
                                        int var674 = (var708 = var18 - 0L) == 0L ? 0 : (var708 < 0L ? -1 : 1);
                                        if (var674 != 0) {
                                            switch (var42) {
                                                case -1893168948:
                                                    var42 ^= -550091961;
                                                    break label421;
                                                case -1132545768:
                                                default:
                                                    var42 ^= -1923012654;
                                                    break label421;
                                                case -645335863:
                                                    var42 += -126257332;
                                                    var42 <<= 30;
                                                    var42 ^= 75421948;
                                                    break label421;
                                            }
                                        }

                                        var42 &= 1767467741;
                                        var42 >>= 1;
                                        var42 += 371285132;
                                        var42 ^= 1512185696;
                                        var651 = var658;
                                        switch (var42) {
                                            case -204617682:
                                                var42 ^= -106964917;
                                                break;
                                            case 1393293937:
                                            default:
                                                var42 ^= -359177995;
                                                break;
                                            case 1619497872:
                                                var42 >>>= 12;
                                                var42 += -1829514926;
                                                var42 += 1216580652;
                                                var42 *= -102096887;
                                                var42 ^= -1439847433;
                                        }
                                    }
                                }
                            }

                            var42 ^= 15132580;
                            var42 ^= 231236165;
                            var397 = var42 + 1;
                            var397 = var42 * var397;
                            var397 &= 1;
                            if (var397 != 0) {
                                break label446;
                            }

                            Object var401 = var335.next();
                            xV var402 = (xV)var401;
                            ut var473 = this.we;
                            String var474 = var473.I();
                            Integer var505 = var5;
                            if (var505 == null) {
                                var42 += 346611262;
                                var42 |= 238779600;
                                var42 >>= 6;
                                var42 ^= -1153358585;
                                break;
                            }

                            var42 |= -1447260680;
                            var42 ^= 2138018829;
                            var42 ^= -263877413;
                            var505 = var42;
                            if (var505 == null) {
                                break label446;
                            }

                            boolean var475 = var402.Lz(var474);
                            if (var475) {
                                var42 -= -192071818;
                                var42 *= 647043255;
                                var42 <<= 28;
                                var42 ^= 1769487726;
                                var471 = var42;
                                if (var471 == null) {
                                    break label446;
                                }

                                List var477 = this.T;
                                var505 = var5;
                                if (var505 == null) {
                                    switch (var42) {
                                        case -1744381270:
                                            var42 ^= -1374146753;
                                            break label421;
                                        case -914866834:
                                            var42 &= -1709068297;
                                            var42 *= -256132001;
                                            var42 ^= -1430841306;
                                            break label421;
                                        case 576282705:
                                        default:
                                            var42 ^= -255772008;
                                            break label421;
                                    }
                                }

                                var42 *= -1474218165;
                                var42 |= 1691207486;
                                var42 |= 1253882477;
                                var42 *= 1891480961;
                                var42 ^= -827432524;
                                var505 = var42;
                                if (var505 == null) {
                                    break label446;
                                }

                                boolean var403 = var477.add(var402);
                                var42 ^= -910297659;
                                var42 += 54232188;
                                var42 ^= 144902341;
                            } else {
                                var42 += -324023977;
                                var42 *= 205581171;
                                var42 |= 679637791;
                                var42 |= -2049778124;
                                var42 ^= 1591629104;
                            }

                            Integer var404 = var42;
                            if (var404 == null) {
                                break label446;
                            }

                            var42 += 2141849817;
                            var42 ^= 2122374866;
                        }
                    } else {
                        switch (var42) {
                            case 298132189:
                                var42 += -725437892;
                                var42 ^= 1991645825;
                                var42 ^= -733014172;
                                break;
                            case 818698063:
                                var42 ^= -54598744;
                                break;
                            case 1788677891:
                            default:
                                var42 ^= 243641526;
                        }
                    }
                } else {
                    var42 >>>= 26;
                    var42 -= 193002183;
                    var42 *= -1217119899;
                    var42 &= 1836153813;
                    var42 ^= 1216280873;
                }
            } else {
                var42 = var3 * -1665179193;
                var42 += 1957409652;
                var42 ^= 2099984234;
            }

            var5 = var42 + 1;
            var5 = var42 * var5;
            var42 = var5 & 1;
            if (var42 == 0) {
                RuntimeException var278 = new RuntimeException();
                throw var278;
            }
        }

        AssertionError var277 = new AssertionError();
        throw var277;
    }

    private static float Xn(float var0, int var1, int var2) {
        int var4 = (int)var0;
        float var5 = var0 * 1.3F;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var26;
        var4 = (var26 = var6 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var4 == 0) {
            int var15 = var2 ^ -1158511842;
            var15 ^= -1358949602;
            float var18 = var1;
            float var19 = var18 * 0.06F;
            float var20 = var5 - var19;
            return TP.S(var20);
        } else {
            int var3 = var2 & 386265830;
            var3 &= -686567827;
            var3 ^= -1211859935;
            UnsupportedOperationException var14 = new UnsupportedOperationException();
            throw var14;
        }
    }

    private void Qe(Canvas var1, float var2, int var3) {
        label127: {
            int var5 = System.identityHashCode(this);
            int var6 = var5 + 1;
            var6 = var5 * var6;
            int var7 = var5 + 2;
            var6 *= var7;
            var7 = var5 + 3;
            var6 *= var7;
            var6 &= 7;
            int var48;
            if (var6 != 0) {
                var48 = var3 * 647771681;
                var48 ^= -1948042774;
            } else {
                label134: {
                    var48 = switch (var3) {
                        case -431016870 -> {
                            var48 = var3 ^ 1731161742;
                            var48 *= -177840081;
                            var48 ^= -1795612322;
                            var48 |= 1893139841;
                            yield var48 ^ -1348359664;
                        }
                        default -> var3 ^ 1537139759;
                        case 1498346134 -> var3 ^ -934331222;
                    };
                    long var104 = var48;
                    long var8 = var104 + 1L;
                    var8 = var104 * var8;
                    long var10 = var104 + 2L;
                    var8 *= var10;
                    long var105 = var104 + 3L;
                    var8 *= var105;
                    long var106 = var8 & 7L;
                    long var175;
                    var6 = (var175 = var106 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        break label127;
                    }

                    var6 = var48 * 1324054183;
                    var6 *= 866311501;
                    var6 ^= -349722363;
                    var6 ^= 965396953;
                    var6 ^= -1131193945;
                    pk var113 = this.P(var6);
                    if (var113 != null) {
                        var48 *= 1802838301;
                        var48 *= 71591581;
                        var48 &= -1258054833;
                        var48 ^= -111544282;
                        long var127 = var48;
                        long var9 = var127 + 1L;
                        var9 = var127 * var9;
                        long var11 = var127 + 2L;
                        var9 *= var11;
                        long var128 = var127 + 3L;
                        var9 *= var128;
                        long var129 = var9 & 7L;
                        long var176;
                        var7 = (var176 = var129 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label127;
                        }

                        float var131 = var113.p();
                        int var141 = var5 + 1;
                        int var142 = var5 * var141;
                        int var143 = var142 & 1;
                        if (var143 != 0) {
                            switch (var48) {
                                case -2058153834:
                                default:
                                    var48 ^= 1816868870;
                                    break label134;
                                case -1494259449:
                                    var48 ^= 1531374080;
                                    break label134;
                                case 1230662253:
                                    var48 += 784715982;
                                    var48 ^= -1649910623;
                                    var48 += -359807441;
                                    var48 &= -1999280884;
                                    var48 ^= -1544575112;
                                    break label134;
                            }
                        }

                        var48 *= 1790116519;
                        var48 ^= 1878905997;
                        Integer var144 = var48;
                        if (var144 == null) {
                            break label127;
                        }

                        float var177;
                        var7 = (var177 = var131 - 0.6F) == 0.0F ? 0 : (var177 < 0.0F ? -1 : 1);
                        if (var7 >= 0) {
                            var48 = switch (var48) {
                                default -> var48 ^ -1129114686;
                                case 952279192 -> var48 ^ 73020406;
                                case 1962578838 -> {
                                    var48 <<= 28;
                                    var48 *= 387053279;
                                    yield var48 ^ 1819922666;
                                }
                            };
                            jX var133 = this.qX;
                            int var145 = var5 + 1;
                            int var146 = var5 * var145;
                            int var159 = var5 + 2;
                            int var147 = var146 * var159;
                            int var160 = var5 + 3;
                            int var148 = var147 * var160;
                            int var149 = var148 & 7;
                            if (var149 != 0) {
                                switch (var48) {
                                    case -1689308687:
                                    default:
                                        var48 ^= -207356944;
                                        break label134;
                                    case -864431894:
                                        var48 *= 1907067903;
                                        var48 -= 1173751805;
                                        var48 |= -1008120864;
                                        var48 += 289759334;
                                        var48 ^= -692108753;
                                        break label134;
                                    case 815829234:
                                        var48 ^= -1839915228;
                                        break label134;
                                }
                            }
                            var48 = switch (var48) {
                                case -864431894 -> {
                                    var48 ^= -1659679284;
                                    var48 -= -1535330781;
                                    var48 &= -1659786747;
                                    yield var48 ^ 1324716372;
                                }
                                case 114033735 -> var48 ^ 1240275129;
                                default -> var48 ^ -1895643619;
                            };
                            Object var134 = var133.Q;
                            if (var134 == null) {
                                var48 *= 2094508203;
                                var48 >>= 21;
                                var48 += 972278251;
                                var48 >>= 2;
                                var48 ^= -731927936;
                                Integer var135 = var48;
                                if (var135 == null) {
                                    break label127;
                                }

                                Yn var136 = var113.JQ();
                                String var137 = var136.Rm();
                                Integer var150 = var5;
                                if (var150 == null) {
                                    var48 |= -1080169178;
                                    var48 &= 1305371631;
                                    var48 += -153526891;
                                    var48 >>>= 10;
                                    var48 ^= 602577823;
                                } else {
                                    var48 &= 896309776;
                                    var48 *= -1846968111;
                                    var48 ^= -17021525;
                                    var48 -= -43819742;
                                    var48 ^= -761045345;
                                    boolean var151 = var137.isEmpty();
                                    if (var151) {
                                        var48 *= 858116761;
                                        var48 &= -381625404;
                                        var48 ^= -787161852;
                                        var48 += -1205290277;
                                        var48 ^= 1369689991;
                                        Integer var154 = var48;
                                        if (var154 != null) {
                                            return;
                                        }
                                        break label127;
                                    }

                                    var48 &= -780357547;
                                    var48 += -1398449755;
                                    var48 ^= -1324852452;
                                    float var114 = var113.p();
                                    float var115 = var114 - 0.6F;
                                    float var116 = var115 / 0.15F;
                                    float var117 = TP.S(var116);
                                    float var118 = var117 * var2;
                                    int var152 = DP.nq(-419430401, var118);
                                    TextStyle var153 = TextStyle.of(7.5F, var152);
                                    float var161 = var1.measure(var137, var153);
                                    float var162 = var161 + 14.0F;
                                    float var163 = 17.0F;
                                    jX var164 = this.qX;
                                    float var165 = var164.oO;
                                    float var166 = var165 + 10.0F;
                                    float var12 = this.O;
                                    float var13 = this.Ph;
                                    long var14 = var5;
                                    long var16 = var14 + 1L;
                                    var16 = var14 * var16;
                                    long var18 = var14 + 2L;
                                    var16 *= var18;
                                    var14 += 3L;
                                    var16 *= var14;
                                    var14 = var16 & 7L;
                                    long var178;
                                    var5 = (var178 = var14 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                                    if (var5 == 0) {
                                        switch (var48) {
                                            case -1768327675:
                                            default:
                                                var48 ^= -1363732870;
                                                break;
                                            case 486126245:
                                                var48 ^= -2004508057;
                                                var48 ^= -1411208070;
                                                var48 ^= -132150336;
                                                break;
                                            case 1855698428:
                                                var48 ^= 572079832;
                                        }

                                        float var90 = var12 / var13;
                                        float var91 = var90 - var162;
                                        float var92 = var91 - 6.0F;
                                        float var93 = Math.min(var166, var92);
                                        jX var167 = this.qX;
                                        float var168 = var167.RD;
                                        float var169 = var168 + 12.0F;
                                        var1.save();
                                        var1.alpha(var118);
                                        float var119 = var169 + 3.0F;
                                        var1.shadow(var93, var119, var162, var163, 8.0F, 12.0F, Integer.MIN_VALUE);
                                        Glass var120 = j_2.J;
                                        var1.glass(var93, var169, var162, var163, 8.0F, var120);
                                        var1.restore();
                                        float var94 = var93 + 7.0F;
                                        float var121 = var169 + 4.5F;
                                        float var95 = var1.text(var137, var94, var121, var153);
                                        return;
                                    }

                                    var48 &= 955376829;
                                    var48 *= -189883409;
                                    var48 += -1261916604;
                                    var48 ^= -1657008833;
                                }
                                break label134;
                            }

                            var48 ^= -1139242617;
                            var48 ^= -359720428;
                        } else {
                            switch (var48) {
                                case -1794046621:
                                default:
                                    var48 ^= -1315478431;
                                    break;
                                case 1843539602:
                                    var48 ^= 136112230;
                                    break;
                                case 1962578838:
                                    var48 &= 735700680;
                                    var48 &= -1574012836;
                                    var48 += 882799574;
                                    var48 &= -1442279822;
                                    var48 ^= -1805409644;
                            }
                        }
                    } else {
                        var48 += -2095149940;
                        var48 ^= -873032471;
                    }

                    long var83 = var48;
                    long var122 = var83 + 1L;
                    long var123 = var83 * var122;
                    var8 = var83 + 2L;
                    long var124 = var123 * var8;
                    long var84 = var83 + 3L;
                    long var125 = var124 * var84;
                    long var85 = var125 & 7L;
                    long var179;
                    var48 = (var179 = var85 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                    if (var48 == 0) {
                        return;
                    }
                    break label127;
                }
            }

            var5 = var48 + 1;
            var5 = var48 * var5;
            var5 &= 1;
            if (var5 == 0) {
                RuntimeException var99 = new RuntimeException();
                throw var99;
            }
        }

        UnsupportedOperationException var88 = new UnsupportedOperationException();
        throw var88;
    }

    private pk P(int var1) {
        int var3 = System.identityHashCode(this);
        long var4 = var3;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var109;
        int var59 = (var109 = var4 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
        if (var59 != 0) {
            int var49 = var1 + -1480641182;
            var49 += -1976741618;
            var49 <<= 3;
            var49 ^= 695443144;
        } else {
            label87: {
                int var2 = var1 ^ 1546953890;
                var2 -= -724585494;
                var2 += 437339636;
                var2 >>>= 11;
                var2 ^= 562814872;
                int var60 = var2 + 1;
                int var61 = var2 * var60;
                int var5 = var2 + 2;
                int var62 = var61 * var5;
                var5 = var2 + 3;
                int var63 = var62 * var5;
                int var64 = var63 & 7;
                if (var64 == 0) {
                    List var65 = this.T;
                    Iterator var66 = var65.iterator();
                    Iterator var67 = var66;
                    var2 |= 1403222962;
                    var2 ^= -683069387;

                    while (true) {
                        var5 = var2 + 1;
                        var5 = var2 * var5;
                        int var85 = var2 + 2;
                        var5 *= var85;
                        int var86 = var2 + 3;
                        var5 *= var86;
                        var5 &= 7;
                        if (var5 != 0) {
                            break;
                        }

                        int var74 = (var67.hasNext()) ? 1 : 0;
                        var6 = var3;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var110;
                        int var90 = (var110 = var6 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
                        if (var90 != 0) {
                            var2 *= -535676969;
                            var2 |= 550150542;
                            var2 ^= -1749961241;
                            break label87;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ 1649444684;
                            case -1527066677 -> {
                                var2 += -2059214847;
                                var2 >>>= 31;
                                var2 += 966799079;
                                var2 <<= 12;
                                yield var2 ^ 58815892;
                            }
                            case -394453414 -> var2 ^ -1329449035;
                        };
                        if (var74 == 0) {
                            var2 ^= 1606942983;
                            var2 ^= -1772081334;
                            long var54 = var2;
                            long var82 = var54 + 1L;
                            long var83 = var54 * var82;
                            long var55 = var83 & 1L;
                            long var111;
                            var3 = (var111 = var55 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                return null;
                            }
                            break;
                        }
                        var2 = switch (var2) {
                            case -564287152 -> var2 ^ 1124020880;
                            case 24053140 -> {
                                var2 += -1566109030;
                                var2 |= 663652365;
                                var2 ^= 204339349;
                                var2 ^= 2063927262;
                                yield var2 ^ -161640194;
                            }
                            default -> var2 ^ -1926826560;
                        };
                        long var75 = var2;
                        long var7 = var75 + 1L;
                        var7 = var75 * var7;
                        long var9 = var75 + 2L;
                        var7 *= var9;
                        long var76 = var75 + 3L;
                        var7 *= var76;
                        long var77 = var7 & 7L;
                        long var112;
                        var74 = (var112 = var77 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
                        if (var74 != 0) {
                            break;
                        }

                        Object var79 = var67.next();
                        xV var80 = (xV)var79;
                        jX var91 = this.qX;
                        float var92 = var91.oO;
                        jX var96 = this.qX;
                        Integer var101 = var3;
                        if (var101 == null) {
                            var2 >>= 24;
                            var2 &= 1337631823;
                            var2 *= -597102877;
                            var2 ^= 269192522;
                            break label87;
                        }

                        var2 |= 1882888784;
                        var2 ^= 144158723;
                        int var102 = var2 + 1;
                        int var103 = var2 * var102;
                        int var107 = var2 + 2;
                        int var104 = var103 * var107;
                        int var108 = var2 + 3;
                        int var105 = var104 * var108;
                        int var106 = var105 & 7;
                        if (var106 != 0) {
                            break;
                        }

                        float var97 = var96.RD;
                        pk var81 = var80.Tm(var92, var97);
                        if (var81 != null) {
                            var2 ^= 1728096490;
                            var2 |= 1489386912;
                            var2 ^= 1480601317;
                            return var81;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ -346839818;
                            case 2061810390 -> var2 ^ 1414762288;
                            case 2121027545 -> {
                                var2 += 1928860804;
                                var2 *= -1239157065;
                                yield var2 ^ 819860322;
                            }
                        } - 423796804;
                        var2 -= 1710970701;
                        var2 |= -990061876;
                        var2 ^= 1585527694;
                        var2 ^= 394734473;
                    }
                }

                UnsupportedOperationException var57 = new UnsupportedOperationException();
                throw var57;
            }
        }

        IllegalArgumentException var53 = new IllegalArgumentException();
        throw var53;
    }

    public float[] a(double var1, double var3) {
        int var5 = x;
        var5 ^= 501107015;
        int var6 = System.identityHashCode(this);
        float var7 = (float)var1;
        float var8 = this.Ls;
        var7 *= var8;
        Integer var32 = var6;
        if (var32 == null) {
            switch (var5) {
                case -475487174:
                default:
                    var5 ^= 1496746627;
                    break;
                case 1532300303:
                    var5 += -1408554531;
                    var5 <<= 3;
                    var5 &= 1193827680;
                    var5 *= -684110365;
                    var5 ^= 216171651;
                    break;
                case 1689233460:
                    var5 ^= -1789152414;
            }

            UnsupportedOperationException var36 = new UnsupportedOperationException();
            throw var36;
        } else {
            var5 *= -1228343517;
            var5 &= -679257986;
            var5 >>>= 7;
            var5 ^= 93294;
            long var15 = var5;
            long var40 = var15 + 1L;
            long var41 = var15 * var40;
            long var16 = var41 & 1L;
            long var44;
            var5 = (var44 = var16 - 0L) == 0L ? 0 : (var44 < 0L ? -1 : 1);
            if (var5 == 0) {
                float var33 = (float)var3;
                float var38 = this.Ls;
                float var34 = var33 * var38;
                float[] var39 = new float[2];
                var8 = this.hf;
                float var20 = var7 / var8;
                var8 = this.Ph;
                float var21 = var20 / var8;
                var39[0] = var21;
                float var22 = this.hf;
                float var23 = var34 / var22;
                float var35 = this.Ph;
                float var24 = var23 / var35;
                var39[1] = var24;
                return var39;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }
    }

    public void M(double var1, double var3) {
        int var5 = x;
        var5 ^= 968434702;
        int var6 = System.identityHashCode(this);
        float[] var7 = this.a(var1, var3);
        jX var8 = this.qX;
        float var9 = var7[0];
        long var10 = var6;
        long var12 = var10 + 1L;
        var12 = var10 * var12;
        long var14 = var10 + 2L;
        var12 *= var14;
        var10 += 3L;
        var12 *= var10;
        var10 = var12 & 7L;
        long var50;
        var6 = (var50 = var10 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
        int var43 = of_2.iP;
        var5 ^= var43;
        var5 ^= 380143496;
        of_2.iP = 380143496;
        int var44 = of_2.lt;
        var5 ^= var44;
        var5 ^= -1057129493;
        of_2.lt = -1057129493;
        if (var6 != 0) {
            var5 &= -309476075;
            var5 |= -1559540407;
            var5 += -39816131;
            var5 ^= 1634225775;
            var6 = var5 + 1;
            var6 = var5 * var6;
            int var45 = var5 + 2;
            var6 *= var45;
            int var46 = var5 + 3;
            var6 *= var46;
            var6 &= 7;
            if (var6 == 0) {
                IllegalArgumentException var39 = new IllegalArgumentException();
                throw var39;
            }
        } else {
            Integer var30 = switch (var5) {
                case 1411348425 -> var5 ^ 791054030;
                case 2134008134 -> {
                    var5 *= 2143780317;
                    var5 |= 2141605985;
                    var5 -= 118427749;
                    var5 *= -1670674389;
                    yield var5 ^ 1328415962;
                }
                default -> var5 ^ -582913264;
            };
            if (var30 != null) {
                var8.oO = var9;
                jX var32 = this.qX;
                float var40 = var7[1];
                var32.RD = var40;
                return;
            }
        }

        RuntimeException var31 = new RuntimeException();
        throw var31;
    }

    public boolean g(double var1, double var3, int var5) {
        int var6 = x;
        int var7 = var5;
        var6 ^= -1224524022;
        int var8 = System.identityHashCode(this);
        this.M(var1, var3);
        long var9 = var8;
        long var11 = var9 + 1L;
        var11 = var9 * var11;
        long var13 = var9 + 2L;
        var11 *= var13;
        var9 += 3L;
        var11 *= var9;
        var9 = var11 & 7L;
        long var142;
        int var89 = (var142 = var9 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
        label88:
        if (var89 == 0) {
            var6 *= -908378087;
            var6 >>>= 22;
            var6 &= 774239026;
            var6 ^= -523589800;
            var6 ^= 2010823930;
            boolean var90 = this.FK;
            if (var90) {
                var6 ^= 1135670697;
                var6 >>>= 31;
                var6 ^= 1806097574;
                var6 *= -2142277391;
                var6 ^= -1766563588;
                return true;
            }

            var6 -= 523815824;
            var6 *= -727711665;
            var6 += 458591351;
            var6 ^= -1720379041;
            Integer var91 = var5;
            if (var91 != null) {
                jX var92 = this.qX;
                var92.dl = null;
                var9 = var8;
                var11 = var9 + 1L;
                var11 = var9 * var11;
                var13 = var9 + 2L;
                var11 *= var13;
                var9 += 3L;
                var11 *= var9;
                var9 = var11 & 7L;
                long var143;
                int var96 = (var143 = var9 - 0L) == 0L ? 0 : (var143 < 0L ? -1 : 1);
                if (var96 != 0) {
                    var6 ^= -1103844741;
                    var6 >>>= 9;
                    var6 -= 2046682067;
                    var6 ^= -1147022949;
                    break label88;
                }

                var6 ^= 1629846636;
                var6 -= -753165231;
                var6 ^= 1291745302;
                var9 = var5;
                var11 = var9 + 1L;
                var11 = var9 * var11;
                var9 = var11 & 1L;
                long var144;
                int var99 = (var144 = var9 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                if (var99 == 0) {
                    List var100 = this.T;
                    Iterator var101 = var100.iterator();
                    Iterator var102 = var101;
                    var6 *= 692993363;
                    var6 += 1456286014;
                    var6 >>>= 23;
                    var6 ^= -1391297402;

                    while (true) {
                        int var10 = (var102.hasNext()) ? 1 : 0;
                        int var119 = var8 + 1;
                        int var120 = var8 * var119;
                        int var121 = var120 & 1;
                        if (var121 != 0) {
                            var6 |= 1116386444;
                            var6 &= 389052363;
                            var6 &= 637185080;
                            var6 |= -790444367;
                            var6 ^= -400127914;
                            break label88;
                        }

                        var6 *= 588961391;
                        var6 ^= -1690253470;
                        if (var10 == 0) {
                            var6 -= 2075304351;
                            var6 ^= 1769566184;
                            var8 = var7 + 1;
                            var8 = var7 * var8;
                            var7 = var8 & 1;
                            if (var7 == 0) {
                                return true;
                            }
                            break;
                        }

                        var6 |= -168846417;
                        var6 *= 441402231;
                        var6 ^= 1092110673;
                        Object var103 = var7;
                        if (var103 == null) {
                            break;
                        }

                        var103 = var102.next();
                        var11 = var8;
                        var13 = var11 + 1L;
                        var13 = var11 * var13;
                        var11 = var13 & 1L;
                        long var145;
                        int var124 = (var145 = var11 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                        if (var124 != 0) {
                            var6 ^= -1175304839;
                            var6 ^= 1950247326;
                            break label88;
                        }

                        var6 |= 1454801424;
                        var6 >>>= 25;
                        var6 &= 1642788013;
                        var6 <<= 28;
                        var6 ^= -714387559;
                        Integer var125 = var7;
                        if (var125 == null) {
                            break;
                        }

                        xV var105 = (xV)var103;
                        jX var126 = this.qX;
                        float var127 = var126.oO;
                        jX var12 = this.qX;
                        float var132 = var12.RD;
                        pk var106 = var105.Tm(var127, var132);
                        if (var106 != null) {
                            var6 |= -2131447078;
                            var6 += 1002456987;
                            var6 &= 1735608710;
                            var6 -= -1458279035;
                            var6 ^= -2102912187;
                            int var128 = var7 + 1;
                            int var129 = var7 * var128;
                            int var130 = var129 & 1;
                            if (var130 == 0) {
                                jX var131 = this.qX;
                                Integer var133 = var8;
                                if (var133 == null) {
                                    var6 |= -693242451;
                                    var6 |= -1729950034;
                                    var6 *= 1134760151;
                                    var6 ^= -2140172458;
                                    break label88;
                                }

                                var6 += 572501437;
                                var6 -= -205315157;
                                var6 ^= -1543035705;
                                Integer var134 = var7;
                                if (var134 != null) {
                                    var12 = this.qX;
                                    float var136 = var12.oO;
                                    jX var140 = this.qX;
                                    float var141 = var140.RD;
                                    return var106.K(var131, var136, var141, var5);
                                }
                            }
                            break;
                        }

                        var6 >>= 5;
                        var6 ^= -859389725;
                        var10 = var7 + 1;
                        int var108 = var7 * var10;
                        var108 &= 1;
                        if (var108 != 0) {
                            break;
                        }

                        var6 ^= -1291180196;
                        var6 |= 2145683792;
                        var6 -= -1013993287;
                        var6 ^= 290091103;
                    }
                }
            }

            RuntimeException var84 = new RuntimeException();
            throw var84;
        } else {
            var6 &= -907086871;
            var6 &= -1122019190;
            var6 >>>= 3;
            var6 &= 1647472598;
            var6 ^= 1039426799;
        }

        AssertionError var77 = new AssertionError();
        throw var77;
    }

    public boolean y(double var1, double var3) {
        label37: {
            int var5 = x;
            var5 ^= -1714803728;
            int var6 = System.identityHashCode(this);
            this.M(var1, var3);
            jX var7 = this.qX;
            XR var38 = (XR)var7.Q;
            long var8 = var6;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            long var12 = var8 + 2L;
            var10 *= var12;
            var8 += 3L;
            var10 *= var8;
            var8 = var10 & 7L;
            long var64;
            int var42 = (var64 = var8 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
            if (var42 != 0) {
                var5 &= -489806069;
                var5 -= -91018454;
                var5 ^= -1636885788;
            } else {
                var5 |= 957087576;
                var5 += 438262321;
                var5 ^= 1310166596;
                var8 = var5;
                var10 = var8 + 1L;
                var10 = var8 * var10;
                var12 = var8 + 2L;
                var10 *= var12;
                var8 += 3L;
                var10 *= var8;
                var8 = var10 & 7L;
                long var65;
                int var46 = (var65 = var8 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
                if (var46 != 0) {
                    break label37;
                }

                boolean var47 = var38 instanceof XR;
                if (!var47) {
                    var5 += 1020578888;
                    var5 -= -195180476;
                    var5 += 1137106997;
                    var5 *= -510175209;
                    var5 ^= 1427614930;
                    return false;
                }

                var5 <<= 10;
                var5 ^= -804669464;
                Integer var48 = var5;
                if (var48 == null) {
                    break label37;
                }

                var38 = var38;
                jX var49 = this.qX;
                jX var9 = this.qX;
                int var59 = var6 + 1;
                int var60 = var6 * var59;
                int var11 = var6 + 2;
                int var61 = var60 * var11;
                var6 += 3;
                int var62 = var61 * var6;
                var6 = var62 & 7;
                if (var6 == 0) {
                    var5 <<= 6;
                    var5 ^= -633175921;
                    float var37 = var9.oO;
                    var9 = this.qX;
                    float var51 = var9.RD;
                    var38.M(var49, var37, var51);
                    return true;
                }

                var5 ^= -753944218;
                var5 |= 1358405723;
                var5 ^= -1456186651;
            }

            Integer var35 = var5;
            if (var35 != null) {
                IllegalStateException var36 = new IllegalStateException();
                throw var36;
            }
        }

        AssertionError var32 = new AssertionError();
        throw var32;
    }

    public boolean vi(double var1, double var3) {
        int var5 = x;
        var5 ^= 1166369832;
        int var6 = System.identityHashCode(this);
        this.M(var1, var3);
        long var7 = var6;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        long var11 = var7 + 2L;
        var9 *= var11;
        var7 += 3L;
        var9 *= var7;
        var7 = var9 & 7L;
        long var76;
        int var51 = (var76 = var7 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
        label68:
        if (var51 == 0) {
            var5 = switch (var5) {
                case -186005304 -> var5 ^ 178267186;
                case 51257696 -> {
                    var5 -= 666647749;
                    var5 += 1404839377;
                    var5 -= 1428356161;
                    var5 += -1203945944;
                    yield var5 ^ 1196733000;
                }
                default -> var5 ^ 1106152456;
            };
            int var52 = var5 + 1;
            int var53 = var5 * var52;
            int var54 = var53 & 1;
            label64:
            if (var54 == 0) {
                jX var55 = this.qX;
                Object var56 = var55.Q;
                int var8 = (var56 instanceof XR) ? 1 : 0;
                if (var8 != 0) {
                    var5 *= 787721075;
                    var5 ^= 569170158;
                    Integer var59 = var5;
                    if (var59 == null) {
                        break label64;
                    }

                    XR var57 = (XR)var56;
                    var8 = var6 + 1;
                    int var61 = var6 * var8;
                    var61 &= 1;
                    if (var61 != 0) {
                        var5 -= -194801077;
                        var5 ^= -1763625667;
                        break label68;
                    }
                    var5 = switch (var5) {
                        case -941875199 -> var5 ^ -677252686;
                        default -> var5 ^ 1825729498;
                        case 1399846863 -> {
                            var5 |= -1794614369;
                            var5 ^= 1446796860;
                            yield var5 ^ -439844064;
                        }
                    };
                    Integer var63 = var5;
                    if (var63 == null) {
                        break label64;
                    }

                    jX var64 = this.qX;
                    var57.u(var64);
                    var5 -= -1247220865;
                    var5 ^= 920427744;
                } else {
                    var5 ^= -1950599675;
                    var5 ^= -957455430;
                }

                jX var58 = this.qX;
                long var65 = var6;
                long var10 = var65 + 1L;
                var10 = var65 * var10;
                long var12 = var65 + 2L;
                var10 *= var12;
                long var66 = var65 + 3L;
                var10 *= var66;
                long var67 = var10 & 7L;
                long var77;
                var6 = (var77 = var67 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                if (var6 != 0) {
                    var5 |= 1094978497;
                    var5 ^= 277085020;
                    break label68;
                }
                var5 = switch (var5) {
                    case -1741771868 -> {
                        var5 &= 1054095465;
                        var5 &= 896287169;
                        var5 *= -2107179597;
                        yield var5 ^ 1007539991;
                    }
                    default -> var5 ^ 713085118;
                    case 971977503 -> var5 ^ -661466454;
                };
                var6 = var5 + 1;
                var6 = var5 * var6;
                var8 = var5 + 2;
                var6 *= var8;
                var8 = var5 + 3;
                var6 *= var8;
                var6 &= 7;
                if (var6 == 0) {
                    var58.Q = null;
                    return true;
                }
            }

            IllegalStateException var48 = new IllegalStateException();
            throw var48;
        } else {
            switch (var5) {
                case -1795605892:
                default:
                    var5 ^= -1023056700;
                    break;
                case 51257696:
                    var5 *= 1814034669;
                    var5 -= -218334709;
                    var5 ^= -706725012;
                    break;
                case 1016380813:
                    var5 ^= -1483345192;
            }
        }

        IllegalStateException var41 = new IllegalStateException();
        throw var41;
    }

    public boolean Lt(double var1, double var3, double var5) {
        label86: {
            int var7 = x;
            var7 ^= -1356295996;
            int var8 = System.identityHashCode(this);
            this.M(var1, var3);
            List var9 = this.T;
            int var10 = var8 + 1;
            var10 = var8 * var10;
            int var11 = var8 + 2;
            var10 *= var11;
            var11 = var8 + 3;
            var10 *= var11;
            var10 &= 7;
            if (var10 != 0) {
                var7 += -454000919;
                var7 >>>= 9;
                var7 *= -174898713;
                var7 ^= 174781204;
                var7 ^= -431540629;
            } else {
                var7 = switch (var7) {
                    case -375138932 -> {
                        var7 >>= 15;
                        var7 ^= 567574706;
                        yield var7 ^ 1059998244;
                    }
                    default -> var7 ^ 644063963;
                    case 2090989691 -> var7 ^ -526865233;
                };
                long var77 = var7;
                long var12 = var77 + 1L;
                var12 = var77 * var12;
                long var78 = var12 & 1L;
                long var126;
                var10 = (var126 = var78 - 0L) == 0L ? 0 : (var126 < 0L ? -1 : 1);
                if (var10 != 0) {
                    break label86;
                }

                Iterator var71 = var9.iterator();
                Iterator var72 = var71;
                var7 <<= 31;
                var7 &= -1886151998;
                var7 *= -577306749;
                var7 ^= 598086326;

                while (true) {
                    int var80 = (var72.hasNext()) ? 1 : 0;
                    Integer var92 = var8;
                    if (var92 == null) {
                        var7 -= -1095624798;
                        var7 -= 1726043817;
                        var7 |= 1678107107;
                        var7 ^= -853756558;
                        break;
                    }

                    var7 -= -1174707823;
                    var7 -= -385765935;
                    var7 |= 1734811662;
                    var7 ^= 224821859;
                    long var93 = var7;
                    long var13 = var93 + 1L;
                    var13 = var93 * var13;
                    long var15 = var93 + 2L;
                    var13 *= var15;
                    long var94 = var93 + 3L;
                    var13 *= var94;
                    long var95 = var13 & 7L;
                    long var127;
                    int var96 = (var127 = var95 - 0L) == 0L ? 0 : (var127 < 0L ? -1 : 1);
                    if (var96 != 0) {
                        break label86;
                    }

                    if (var80 == 0) {
                        var7 &= -863433126;
                        var7 ^= -1849206673;
                        return false;
                    }

                    var7 >>= 31;
                    var7 ^= -115398803;
                    long var81 = var7;
                    var12 = var81 + 1L;
                    var12 = var81 * var12;
                    long var82 = var12 & 1L;
                    long var128;
                    var80 = (var128 = var82 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
                    if (var80 != 0) {
                        break label86;
                    }

                    Object var84 = var72.next();
                    xV var85 = (xV)var84;
                    Integer var97 = var8;
                    if (var97 == null) {
                        var7 >>= 4;
                        var7 ^= 1285202671;
                        break;
                    }

                    var7 += -1428802794;
                    var7 *= 587203887;
                    var7 &= 225735031;
                    var7 -= 1479569706;
                    var7 ^= 954192107;
                    var97 = var7;
                    if (var97 == null) {
                        break label86;
                    }

                    jX var99 = this.qX;
                    float var100 = var99.oO;
                    jX var111 = this.qX;
                    float var112 = var111.RD;
                    boolean var101 = var85.g(var100, var112);
                    if (var101) {
                        var7 += 710427586;
                        var7 |= 1967085046;
                        var7 &= 408946674;
                        var7 ^= 71485500;
                        long var102 = var7;
                        var13 = var102 + 1L;
                        var13 = var102 * var13;
                        long var103 = var13 & 1L;
                        long var129;
                        int var104 = (var129 = var103 - 0L) == 0L ? 0 : (var129 < 0L ? -1 : 1);
                        if (var104 != 0) {
                            break label86;
                        }

                        double var105 = -var5;
                        float var106 = (float)var105;
                        Integer var113 = var8;
                        if (var113 != null) {
                            var7 *= 747418251;
                            var7 |= 1827695573;
                            var7 *= -1566737145;
                            var7 ^= -1097860137;
                            int var114 = var7 + 1;
                            int var115 = var7 * var114;
                            int var124 = var7 + 2;
                            int var116 = var115 * var124;
                            int var125 = var7 + 3;
                            int var117 = var116 * var125;
                            int var118 = var117 & 7;
                            if (var118 == 0) {
                                float var107 = var106 * 28.0F;
                                var85.TL(var107);
                                return true;
                            }
                            break label86;
                        }

                        var7 ^= 1329504524;
                        var7 += 15163341;
                        var7 ^= -414671338;
                        break;
                    }

                    var7 -= 1076937788;
                    var7 >>>= 18;
                    var7 >>>= 24;
                    var7 |= -958677836;
                    var7 ^= -1643988280;
                    var80 = var7 + 1;
                    var80 = var7 * var80;
                    var80 &= 1;
                    if (var80 != 0) {
                        break label86;
                    }

                    var7 >>= 20;
                    var7 <<= 14;
                    var7 *= -1676049007;
                    var7 *= -3327469;
                    var7 ^= 201314998;
                }
            }

            long var66 = var7;
            long var89 = var66 + 1L;
            long var90 = var66 * var89;
            long var67 = var90 & 1L;
            long var130;
            var8 = (var130 = var67 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
            if (var8 == 0) {
                IllegalArgumentException var69 = new IllegalArgumentException();
                throw var69;
            }
        }

        AssertionError var70 = new AssertionError();
        throw var70;
    }

    public boolean d(int var1, boolean var2) {
        label234: {
            int var3 = x;
            int var4 = var1;
            var3 ^= -886479195;
            int var5 = System.identityHashCode(this);
            jX var6 = this.qX;
            List var165 = (List)var6.dl;
            Integer var7 = var5;
            if (var7 != null) {
                var3 &= -959174329;
                var3 ^= 535415702;
                if (var165 != null) {
                    var3 = switch (var3) {
                        case -1687557421 -> {
                            var3 |= 451603387;
                            yield var3 ^ 877010515;
                        }
                        default -> var3 ^ -337329341;
                        case 1602801602 -> var3 ^ 536564265;
                    };
                    long var166 = var1;
                    long var8 = var166 + 1L;
                    var8 = var166 * var8;
                    long var167 = var8 & 1L;
                    long var254;
                    int var168 = (var254 = var167 - 0L) == 0L ? 0 : (var254 < 0L ? -1 : 1);
                    if (var168 != 0) {
                        break label234;
                    }

                    var165 = this.t;
                    Iterator var170 = var165.iterator();
                    int var183 = var5 + 1;
                    var183 = var5 * var183;
                    int var213 = var5 + 2;
                    var183 *= var213;
                    int var214 = var5 + 3;
                    var183 *= var214;
                    var183 &= 7;
                    if (var183 == 0) {
                        var3 -= -1503446045;
                        var3 ^= -1399503886;
                        Iterator var171 = var170;
                        var3 += 306682701;
                        var3 ^= 1785473338;

                        label227:
                        while (true) {
                            Integer var188 = var4;
                            if (var188 == null) {
                                break label234;
                            }

                            boolean var189 = var171.hasNext();
                            Integer var215 = var5;
                            if (var215 == null) {
                                switch (var3) {
                                    case -766788418:
                                        var3 &= 887487661;
                                        var3 <<= 22;
                                        var3 ^= 2020997008;
                                        break label227;
                                    case -529638180:
                                        var3 ^= 1780309405;
                                        break label227;
                                    case -196691706:
                                    default:
                                        var3 ^= -1432225096;
                                        break label227;
                                }
                            }

                            var3 |= 1303273287;
                            var3 -= 1963566258;
                            var3 &= -1161219687;
                            var3 ^= 565735195;
                            if (!var189) {
                                var3 |= -389169002;
                                var3 -= -1826581248;
                                var3 >>= 9;
                                var3 &= -1168423673;
                                var3 ^= -64857686;
                                jX var172 = this.qX;
                                long var198 = var5;
                                long var239 = var198 + 1L;
                                var239 = var198 * var239;
                                long var199 = var239 & 1L;
                                long var255;
                                int var200 = (var255 = var199 - 0L) == 0L ? 0 : (var255 < 0L ? -1 : 1);
                                if (var200 == 0) {
                                    var3 &= -987914758;
                                    var3 &= 4540730;
                                    var3 ^= 718411304;
                                    var172.dl = null;
                                    return true;
                                }

                                var3 |= 475795572;
                                var3 += -127006866;
                                var3 += -602964580;
                                var3 ^= -2087824232;
                                break;
                            }

                            var3 |= 705647191;
                            var3 &= -1761514086;
                            var3 &= 451594789;
                            var3 ^= 2077553070;
                            int var190 = var4 + 1;
                            var190 = var4 * var190;
                            var190 &= 1;
                            if (var190 != 0) {
                                break label234;
                            }

                            Object var193 = var171.next();
                            Integer var216 = var5;
                            if (var216 == null) {
                                switch (var3) {
                                    case -1870534623:
                                    default:
                                        var3 ^= 850504520;
                                        break label227;
                                    case 272367358:
                                        var3 ^= -1440818732;
                                        break label227;
                                    case 2043984302:
                                        var3 *= 157945545;
                                        var3 -= -1910541547;
                                        var3 ^= -278123239;
                                        break label227;
                                }
                            }
                            var3 = switch (var3) {
                                case -592391240 -> var3 ^ 490806552;
                                default -> var3 ^ -1642678825;
                                case 2043984302 -> {
                                    var3 += 1092139664;
                                    var3 ^= 1287020647;
                                    yield var3 ^ -1021360608;
                                }
                            };
                            xV var194 = (xV)var193;
                            List var195 = var194.F();
                            Iterator var196 = var195.iterator();
                            Iterator var197 = var196;
                            var3 &= 455299519;
                            var3 += 691980793;
                            var3 ^= -410429867;

                            while (true) {
                                boolean var217 = var197.hasNext();
                                Integer var9 = var5;
                                if (var9 == null) {
                                    var3 *= 1899330513;
                                    var3 *= -1826763811;
                                    var3 &= 537413805;
                                    var3 *= 844986609;
                                    var3 ^= -1934051479;
                                    break label227;
                                }

                                var3 -= -1436814586;
                                var3 += 128981638;
                                var3 *= 1434683611;
                                var3 ^= -676991417;
                                long var226 = var4;
                                long var11 = var226 + 1L;
                                var11 = var226 * var11;
                                long var13 = var226 + 2L;
                                var11 *= var13;
                                long var227 = var226 + 3L;
                                var11 *= var227;
                                long var228 = var11 & 7L;
                                long var256;
                                int var229 = (var256 = var228 - 0L) == 0L ? 0 : (var256 < 0L ? -1 : 1);
                                if (var229 != 0) {
                                    break label234;
                                }

                                if (!var217) {
                                    var3 = switch (var3) {
                                        case -971165478 -> {
                                            var3 *= -1843373939;
                                            var3 &= -763923627;
                                            var3 &= -741040669;
                                            var3 *= 361448465;
                                            yield var3 ^ 52390934;
                                        }
                                        case -752912666 -> var3 ^ 185336645;
                                        default -> var3 ^ 1417723901;
                                    } & 912720110;
                                    var3 |= 920189960;
                                    var3 ^= -460242768;
                                    break;
                                }
                                var3 = switch (var3) {
                                    case -1342081132 -> var3 ^ 1369506633;
                                    case -971165478 -> {
                                        var3 += 440061262;
                                        var3 &= -1059957382;
                                        var3 -= -167192266;
                                        var3 <<= 12;
                                        yield var3 ^ 1305738080;
                                    }
                                    default -> var3 ^ 903008626;
                                };
                                Object var218 = var197.next();
                                pk var219 = (pk)var218;
                                jX var230 = this.qX;
                                boolean var220 = var219.WC(var230, var1);
                                var229 = var5 + 1;
                                var229 = var5 * var229;
                                int var10 = var5 + 2;
                                var229 *= var10;
                                var10 = var5 + 3;
                                var229 *= var10;
                                var229 &= 7;
                                if (var229 != 0) {
                                    var3 >>>= 24;
                                    var3 ^= 481885950;
                                    var3 -= 563174891;
                                    var3 ^= -1470998615;
                                    break label227;
                                }

                                var3 &= 1850444298;
                                var3 >>>= 9;
                                var3 |= -158118942;
                                var3 += 25879124;
                                var3 ^= 1880181147;
                                long var236 = var4;
                                var11 = var236 + 1L;
                                var11 = var236 * var11;
                                long var237 = var11 & 1L;
                                long var257;
                                var229 = (var257 = var237 - 0L) == 0L ? 0 : (var257 < 0L ? -1 : 1);
                                if (var229 != 0) {
                                    break label234;
                                }

                                if (var220) {
                                    switch (var3) {
                                        case -2007819360:
                                            var3 += -401712406;
                                            var3 |= 862262383;
                                            var3 ^= 40711218;
                                            break;
                                        case -1788677298:
                                            var3 ^= 605429264;
                                            break;
                                        case -440190871:
                                        default:
                                            var3 ^= 1705020207;
                                    }

                                    int var221 = var4 + 1;
                                    int var222 = var4 * var221;
                                    int var223 = var222 & 1;
                                    if (var223 == 0) {
                                        return true;
                                    }
                                    break label234;
                                }

                                var3 += -1718102271;
                                var3 |= -576549023;
                                var3 *= 1153463809;
                                var3 &= 923175728;
                                var3 ^= -545347629;
                                var3 ^= -36561969;
                                var3 &= 475262261;
                                var3 ^= -910794413;
                            }
                        }
                    } else {
                        switch (var3) {
                            case -1347553880:
                                var3 -= -822662318;
                                var3 ^= -1279050298;
                                break;
                            case 1386707773:
                            default:
                                var3 ^= -226553559;
                                break;
                            case 1595143423:
                                var3 ^= -870938552;
                        }
                    }
                } else {
                    var3 >>= 13;
                    var3 ^= 559257403;
                    Integer var173 = var1;
                    if (var173 == null) {
                        break label234;
                    }

                    if (var1 == 256) {
                        var3 = switch (var3) {
                            case -559330188 -> {
                                var3 -= -1353068487;
                                var3 |= 1632301609;
                                var3 <<= 8;
                                yield var3 ^ -2074555360;
                            }
                            default -> var3 ^ -114373327;
                            case 1143003295 -> var3 ^ 823517910;
                        };
                        Integer var174 = var1;
                        if (var174 == null) {
                            break label234;
                        }

                        ut var175 = this.we;
                        boolean var176 = var175.AE();
                        long var201 = var5;
                        long var241 = var201 + 1L;
                        var241 = var201 * var241;
                        long var202 = var241 & 1L;
                        long var258;
                        int var203 = (var258 = var202 - 0L) == 0L ? 0 : (var258 < 0L ? -1 : 1);
                        if (var203 == 0) {
                            var3 = switch (var3) {
                                case -1826097888 -> var3 ^ 364420680;
                                default -> var3 ^ 682120781;
                                case -878250208 -> {
                                    var3 += 1223501059;
                                    var3 ^= 1384714179;
                                    var3 ^= 350592299;
                                    var3 -= 1068202137;
                                    yield var3 ^ 380069871;
                                }
                            };
                            Integer var204 = var1;
                            if (var204 == null) {
                                break label234;
                            }

                            if (var176) {
                                switch (var3) {
                                    case 99250653:
                                        var3 <<= 2;
                                        var3 <<= 16;
                                        var3 ^= -722297391;
                                        break;
                                    case 480736126:
                                    default:
                                        var3 ^= 452914880;
                                        break;
                                    case 1808660602:
                                        var3 ^= -1560171105;
                                }

                                long var178 = var1;
                                long var224 = var178 + 1L;
                                var224 = var178 * var224;
                                long var179 = var224 & 1L;
                                long var259;
                                int var180 = (var259 = var179 - 0L) == 0L ? 0 : (var259 < 0L ? -1 : 1);
                                if (var180 == 0) {
                                    return false;
                                }
                                break label234;
                            }

                            var3 >>>= 21;
                            var3 += 1441214384;
                            var3 &= 1093839545;
                            var3 ^= 956249609;
                            ut var177 = this.we;
                            var204 = var5;
                            if (var204 != null) {
                                switch (var3) {
                                    case -1186715725:
                                        var3 ^= -1064272163;
                                        break;
                                    case 236689838:
                                    default:
                                        var3 ^= 937568777;
                                        break;
                                    case 2044533904:
                                        var3 *= 660193379;
                                        var3 ^= 22477349;
                                }

                                long var206 = var1;
                                var241 = var206 + 1L;
                                var241 = var206 * var241;
                                long var253 = var206 + 2L;
                                var241 *= var253;
                                long var207 = var206 + 3L;
                                var241 *= var207;
                                long var208 = var241 & 7L;
                                long var260;
                                int var209 = (var260 = var208 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                                if (var209 == 0) {
                                    var177.Cz();
                                    return true;
                                }
                                break label234;
                            }

                            var3 |= -1036283619;
                            var3 ^= -2088822103;
                            var3 |= 2030834335;
                            var3 |= 739575436;
                            var3 ^= 786980911;
                        } else {
                            var3 -= -317504343;
                            var3 <<= 2;
                            var3 ^= 691748428;
                        }
                    } else {
                        var3 -= 1958815277;
                        var3 *= -1924063635;
                        var3 |= -517874837;
                        var3 ^= -2040723521;
                        var3 ^= -1011602456;
                        Integer var181 = var1;
                        if (var181 == null) {
                            break label234;
                        }

                        if (var1 != 259) {
                            var3 -= 2136478414;
                            var3 ^= -1464666763;
                            return false;
                        }

                        var3 ^= 1647796631;
                        var3 += 261245189;
                        var3 *= -1695947845;
                        var3 ^= 1136047351;
                        ut var182 = this.we;
                        int var210 = var5 + 1;
                        var210 = var5 * var210;
                        var5 = var210 & 1;
                        if (var5 == 0) {
                            switch (var3) {
                                case -1831858641:
                                    var3 ^= 530495974;
                                    break;
                                case -969132524:
                                default:
                                    var3 ^= -559254828;
                                    break;
                                case 791572919:
                                    var3 &= 283673488;
                                    var3 ^= 1980370004;
                            }

                            Integer var164 = var1;
                            if (var164 != null) {
                                var182.g(var2);
                                return true;
                            }
                            break label234;
                        }

                        var3 &= 676975808;
                        var3 ^= 2071832336;
                    }
                }
            } else {
                var3 -= -1421395274;
                var3 |= 154760967;
                var3 &= 285335252;
                var3 ^= -1019331523;
                var3 ^= -1857415751;
            }

            Integer var160 = var4;
            if (var160 != null) {
                RuntimeException var162 = new RuntimeException();
                throw var162;
            }
        }

        IllegalStateException var161 = new IllegalStateException();
        throw var161;
    }

    public boolean iz(int var1) {
        label74: {
            int var2 = x;
            var2 ^= 584687328;
            int var4 = System.identityHashCode(this);
            jX var5 = this.qX;
            ut var59 = (ut)var5.dl;
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            if (var6 != 0) {
                switch (var2) {
                    case -1833616085:
                    default:
                        var2 ^= -2115796372;
                        break;
                    case 1045517594:
                        var2 ^= -130119473;
                        break;
                    case 1683151784:
                        var2 |= 1222581557;
                        var2 += 1673401471;
                        var2 ^= -19782877;
                }
            } else {
                var2 += 130528757;
                var2 |= 168076268;
                var2 ^= 893084082;
                var2 ^= 2099396694;
                long var75 = var1;
                long var8 = var75 + 1L;
                var8 = var75 * var8;
                long var10 = var75 + 2L;
                var8 *= var10;
                long var76 = var75 + 3L;
                var8 *= var76;
                long var77 = var8 & 7L;
                long var97;
                var6 = (var97 = var77 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                if (var6 != 0) {
                    break label74;
                }

                if (var59 != null) {
                    switch (var2) {
                        case -126128859:
                        default:
                            var2 ^= -1397005583;
                            return true;
                        case 638030361:
                            var2 += 1214329223;
                            var2 >>= 10;
                            var2 -= 1625207423;
                            var2 <<= 13;
                            var2 ^= 1544387606;
                            return true;
                        case 2094719106:
                            var2 ^= -1243543451;
                            return true;
                    }
                }
                var2 = switch (var2) {
                    case 638030361 -> {
                        var2 |= 135369245;
                        var2 &= -456271391;
                        yield var2 ^ -2019121383;
                    }
                    default -> var2 ^ 8279354;
                    case 1123160432 -> var2 ^ -1093502411;
                };
                long var60 = var1;
                long var7 = var60 + 1L;
                var7 = var60 * var7;
                long var9 = var60 + 2L;
                var7 *= var9;
                long var61 = var60 + 3L;
                var7 *= var61;
                long var62 = var7 & 7L;
                long var98;
                int var63 = (var98 = var62 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                if (var63 != 0) {
                    break label74;
                }

                boolean var64 = this.FK;
                long var79 = var4;
                var8 = var79 + 1L;
                var8 = var79 * var8;
                var10 = var79 + 2L;
                var8 *= var10;
                long var80 = var79 + 3L;
                var8 *= var80;
                long var81 = var8 & 7L;
                long var99;
                var6 = (var99 = var81 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                if (var6 != 0) {
                    var2 <<= 20;
                    var2 ^= 1607456543;
                } else {
                    var2 ^= -1884479051;
                    var2 |= 293726810;
                    var2 &= 623791904;
                    var2 -= -694885903;
                    var2 ^= -1940275314;
                    Integer var83 = var1;
                    if (var83 == null) {
                        break label74;
                    }

                    if (var64) {
                        var2 >>= 30;
                        var2 ^= 1459813408;
                        var2 ^= 1745248201;
                        return true;
                    }

                    var2 ^= -755968372;
                    var2 *= -1128047969;
                    var2 *= 502598101;
                    var2 ^= -1097854901;
                    int var65 = var1 + 1;
                    int var66 = var1 * var65;
                    int var84 = var1 + 2;
                    int var67 = var66 * var84;
                    var84 = var1 + 3;
                    int var68 = var67 * var84;
                    int var69 = var68 & 7;
                    if (var69 != 0) {
                        break label74;
                    }

                    var59 = this.we;
                    Integer var58 = var4;
                    if (var58 != null) {
                        var2 ^= -252463802;
                        var2 ^= -395843228;
                        var2 -= 880709234;
                        var2 ^= -1506091428;
                        var59.t(var1);
                        return true;
                    }

                    switch (var2) {
                        case 381177618:
                        default:
                            var2 ^= -1670766886;
                            break;
                        case 586035080:
                            var2 ^= 2037015591;
                            break;
                        case 1840442724:
                            var2 += -624590304;
                            var2 ^= 1714927771;
                    }
                }
            }

            long var3 = var1;
            long var71 = var3 + 1L;
            long var72 = var3 * var71;
            var3 = var72 & 1L;
            long var100;
            int var56 = (var100 = var3 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
            if (var56 == 0) {
                IllegalStateException var57 = new IllegalStateException();
                throw var57;
            }
        }

        RuntimeException var54 = new RuntimeException();
        throw var54;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1424675304;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        x = var4;
    }
}
