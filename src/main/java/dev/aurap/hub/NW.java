package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class NW {
    private final PH cI;
    private final Map L;
    private final Map k;
    private final List N;
    public static final int wU;

    public NW(PH var1) {
        LinkedHashMap var2 = new LinkedHashMap();
        this.L = var2;
        var2 = new LinkedHashMap();
        this.k = var2;
        CopyOnWriteArrayList var4 = new CopyOnWriteArrayList();
        this.N = var4;
        this.cI = var1;
    }

    public Yn v(Yn var1) {
        label40: {
            int var2 = wU;
            var2 ^= -625807790;
            int var3 = System.identityHashCode(this);
            Map var4 = this.L;
            String var5 = var1.F();
            boolean var40 = var4.containsKey(var5);
            int var56 = var3 + 1;
            int var57 = var3 * var56;
            int var58 = var57 & 1;
            int var6 = of_2.qA;
            var2 ^= var6;
            var2 ^= -477106862;
            of_2.qA = -477106862;
            var6 = of_2.KZ;
            var2 ^= var6;
            var2 ^= 780895631;
            of_2.KZ = 780895631;
            if (var58 != 0) {
                var2 >>>= 11;
                var2 ^= 1491484633;
            } else {
                var2 |= -108689391;
                var2 |= 1762687399;
                var2 ^= -346051382;
                if (var40) {
                    var2 |= -499481348;
                    var2 >>>= 3;
                    var2 -= 1136229567;
                    var2 ^= 946533156;
                    int var50 = var2 + 1;
                    int var51 = var2 * var50;
                    int var62 = var2 + 2;
                    int var52 = var51 * var62;
                    int var63 = var2 + 3;
                    int var53 = var52 * var63;
                    int var54 = var53 & 7;
                    if (var54 == 0) {
                        var5 = var1.F();
                        var5 = "Duplicate module id " + var5;
                        IllegalArgumentException var55 = new IllegalArgumentException(var5);
                        throw var55;
                    }
                    break label40;
                }

                var2 >>= 24;
                var2 >>= 8;
                var2 ^= -1345804076;
                long var41 = var2;
                long var67 = var41 + 1L;
                long var68 = var41 * var67;
                long var8 = var41 + 2L;
                long var69 = var68 * var8;
                long var42 = var41 + 3L;
                long var70 = var69 * var42;
                long var43 = var70 & 7L;
                long var75;
                int var44 = (var75 = var43 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                if (var44 != 0) {
                    break label40;
                }

                var4 = this.L;
                var5 = var1.F();
                var4.put(var5, var1);
                Map var46 = this.k;
                Class var60 = var1.getClass();
                var46.put(var60, var1);
                PH var49 = this.cI;
                Runnable var61 = this::T;
                var6 = var3 + 1;
                var6 = var3 * var6;
                int var7 = var3 + 2;
                var6 *= var7;
                var3 += 3;
                var6 *= var3;
                var3 = var6 & 7;
                if (var3 == 0) {
                    var2 &= -1137477089;
                    var2 ^= -1071489372;
                    var3 = var2 + 1;
                    var3 = var2 * var3;
                    var3 &= 1;
                    if (var3 == 0) {
                        var1.Xc(var49, var61);
                        return var1;
                    }
                    break label40;
                }

                switch (var2) {
                    case -1345804076:
                        var2 |= -1254256314;
                        var2 ^= -417407200;
                        break;
                    case -1317839826:
                        var2 ^= 1831005367;
                        break;
                    case 1653464228:
                    default:
                        var2 ^= -567707853;
                }
            }

            IllegalArgumentException var27 = new IllegalArgumentException();
            throw var27;
        }

        IllegalStateException var34 = new IllegalStateException();
        throw var34;
    }

    public Optional p(String var1) {
        int var2 = wU;
        var2 ^= 1726348728;
        int var3 = System.identityHashCode(this);
        long var20 = var3;
        long var5 = var20 + 1L;
        var5 = var20 * var5;
        long var21 = var5 & 1L;
        long var35;
        var3 = (var35 = var21 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 ^= 1530593160;
            var2 ^= -1182455369;
            long var23 = var2;
            var5 = var23 + 1L;
            var5 = var23 * var5;
            long var7 = var23 + 2L;
            var5 *= var7;
            long var24 = var23 + 3L;
            var5 *= var24;
            long var25 = var5 & 7L;
            long var36;
            var3 = (var36 = var25 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var3 == 0) {
                Map var27 = this.L;
                Object var28 = var27.get(var1);
                Yn var29 = (Yn)var28;
                return Optional.ofNullable(var29);
            }
        } else {
            Integer var17 = switch (var2) {
                case -1875611139 -> var2 ^ 2102449753;
                case -1768003473 -> {
                    var2 += -270888128;
                    var2 <<= 6;
                    var2 -= -441956875;
                    var2 *= 740977273;
                    yield var2 ^ -1986556701;
                }
                default -> var2 ^ -1526741401;
            };
            if (var17 != null) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        }

        UnsupportedOperationException var18 = new UnsupportedOperationException();
        throw var18;
    }

    public Yn tG(Class var1) {
        label45: {
            int var2 = wU;
            var2 ^= 1201571379;
            int var3 = System.identityHashCode(this);
            Map var4 = this.k;
            Object var44 = var4.get(var1);
            var44 = (Yn)var44;
            Integer var5 = var3;
            int var6 = of_2.qA;
            var2 ^= var6;
            var2 ^= -477106862;
            var6 = of_2.KZ;
            var2 ^= var6;
            var2 ^= 780895631;
            if (var5 == null) {
                var2 ^= 585457709;
                var2 -= -1510824714;
                var2 |= -1243355506;
                var2 ^= -1279815056;
            } else {
                var2 += -1874754580;
                var2 -= 713569626;
                var2 *= 57109553;
                var2 += -21703646;
                var2 ^= 1012829380;
                long var47 = var2;
                long var7 = var47 + 1L;
                var7 = var47 * var7;
                long var48 = var7 & 1L;
                long var65;
                int var49 = (var65 = var48 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
                if (var49 != 0) {
                    break label45;
                }

                if (var44 == null) {
                    var2 ^= -1802958899;
                    var2 *= 928753643;
                    var2 -= -2143577876;
                    var2 ^= -957593809;
                    var2 ^= 1992068092;
                    Integer var57 = var2;
                    if (var57 != null) {
                        String var62 = var1.getSimpleName();
                        String var63 = "Module not registered: " + var62;
                        IllegalArgumentException var58 = new IllegalArgumentException(var63);
                        throw var58;
                    }
                    break label45;
                }

                var2 -= -1339697630;
                var2 >>>= 28;
                var2 ^= 534649729;
                var49 = var2 + 1;
                var49 = var2 * var49;
                var6 = var2 + 2;
                var49 *= var6;
                var6 = var2 + 3;
                var49 *= var6;
                var49 &= 7;
                if (var49 != 0) {
                    break label45;
                }

                var44 = var1.cast(var44);
                var49 = var3 + 1;
                var49 = var3 * var49;
                var3 = var49 & 1;
                if (var3 == 0) {
                    switch (var2) {
                        case -48532061:
                            var2 ^= 525060392;
                            break;
                        case 534649736:
                            var2 &= -257109982;
                            var2 >>= 28;
                            var2 ^= 1396614073;
                            var2 ^= -1233012568;
                            break;
                        case 1699208475:
                        default:
                            var2 ^= -778065519;
                    }

                    return (Yn)var44;
                }

                var2 |= 173788776;
                var2 ^= 1401398087;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                UnsupportedOperationException var42 = new UnsupportedOperationException();
                throw var42;
            }
        }

        UnsupportedOperationException var43 = new UnsupportedOperationException();
        throw var43;
    }

    public List dG() {
        int var1 = wU;
        var1 ^= -1447778283;
        int var2 = System.identityHashCode(this);
        Map var4 = this.L;
        Collection var24 = var4.values();
        ArrayList var3 = new ArrayList(var24);
        long var25 = var2;
        long var6 = var25 + 1L;
        var6 = var25 * var6;
        long var26 = var6 & 1L;
        long var28;
        var2 = (var28 = var26 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -907023369;
            var1 ^= 528653959;
            var1 |= -1476412246;
            var1 <<= 20;
            var1 ^= -1185510846;
            return Collections.unmodifiableList(var3);
        } else {
            var1 = switch (var1) {
                case -2107526772 -> var1 ^ 1492481803;
                case 1506753986 -> {
                    var1 *= 1332182099;
                    var1 &= 510249460;
                    var1 *= -263558251;
                    yield var1 ^ 2034528136;
                }
                default -> var1 ^ 441445360;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            } else {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        }
    }

    public List h(AJ var1) {
        label102: {
            int var2 = wU;
            var2 ^= 623043455;
            int var3 = System.identityHashCode(this);
            ArrayList var4 = new ArrayList();
            var4 = var4;
            Map var5 = this.L;
            Collection var67 = var5.values();
            Iterator var68 = var67.iterator();
            long var6 = var3;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var103;
            int var72 = (var103 = var6 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
            if (var72 != 0) {
                var2 *= -589075761;
                var2 |= -130371636;
                var2 ^= -1098974553;
            } else {
                var2 ^= -531124838;
                var2 += -652308270;
                var2 -= 558143264;
                var2 |= -1865294194;
                var2 ^= -574806867;
                int var73 = var2 + 1;
                int var74 = var2 * var73;
                int var75 = var74 & 1;
                if (var75 != 0) {
                    break label102;
                }

                Iterator var69 = var68;

                var2 = switch (var2) {
                    case -516670961 -> var2 ^ 741724129;
                    default -> var2 ^ -165243578;
                    case 558168643 -> {
                        var2 >>= 11;
                        var2 *= -620439115;
                        var2 >>= 1;
                        yield var2 ^ 618425382;
                    }
                };

                label99:
                while (true) {
                    var6 = var2;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var104;
                    int var78 = (var104 = var6 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                    if (var78 != 0) {
                        break label102;
                    }

                    boolean var79 = var69.hasNext();
                    Integer var7 = var3;
                    if (var7 == null) {
                        var2 <<= 3;
                        var2 |= 1332228376;
                        var2 <<= 24;
                        var2 ^= -620472965;
                        break;
                    }

                    var2 |= -1086304458;
                    var2 |= 223390871;
                    var2 ^= -1399348488;
                    if (!var79) {
                        var2 ^= 1777284222;
                        var2 >>>= 17;
                        var2 ^= -1206769926;
                        var3 = var2 + 1;
                        var3 = var2 * var3;
                        var2 = var3 & 1;
                        if (var2 == 0) {
                            return var4;
                        }
                        break label102;
                    }

                    var2 <<= 18;
                    var2 <<= 9;
                    var2 >>>= 21;
                    var2 ^= 487946110;
                    var6 = var2;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var105;
                    int var82 = (var105 = var6 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                    if (var82 != 0) {
                        break label102;
                    }

                    Object var83 = var69.next();
                    Yn var84 = (Yn)var83;
                    AJ var87 = var84.bZ();
                    int var98 = var3 + 1;
                    int var99 = var3 * var98;
                    int var100 = var99 & 1;
                    if (var100 != 0) {
                        switch (var2) {
                            case -1996285942:
                            default:
                                var2 ^= 78010387;
                                break label99;
                            case -1364054101:
                                var2 ^= 997833017;
                                break label99;
                            case 487945406:
                                var2 += -1201292617;
                                var2 += -761807954;
                                var2 |= 1003664849;
                                var2 ^= -120149368;
                                break label99;
                        }
                    }
                    var2 = switch (var2) {
                        case 487945406 -> {
                            var2 *= 1512679805;
                            var2 -= -599728193;
                            yield var2 ^ -1543092804;
                        }
                        case 645640443 -> var2 ^ 13551107;
                        default -> var2 ^ 681408616;
                    };
                    Integer var101 = var2;
                    if (var101 == null) {
                        break label102;
                    }

                    if (var87 == var1) {
                        var2 = switch (var2) {
                            default -> var2 ^ -934800710;
                            case 1231168661 -> var2 ^ 79540499;
                            case 1539230395 -> {
                                var2 -= -1950155843;
                                var2 |= -773541913;
                                var2 &= -1975295813;
                                yield var2 ^ 3979078;
                            }
                        };
                        long var88 = var2;
                        long var9 = var88 + 1L;
                        var9 = var88 * var9;
                        long var89 = var9 & 1L;
                        long var106;
                        int var90 = (var106 = var89 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                        if (var90 != 0) {
                            break label102;
                        }

                        boolean var85 = var4.add(var84);
                        switch (var2) {
                            case -1971333123:
                                var2 &= 291971666;
                                var2 >>>= 6;
                                var2 &= -961350486;
                                var2 &= -377938869;
                                var2 ^= 1490177869;
                                break;
                            case 698718490:
                                var2 ^= 969967672;
                                break;
                            case 1184451862:
                            default:
                                var2 ^= 320231732;
                        }
                    } else {
                        var2 *= -211008631;
                        var2 *= -78258951;
                        var2 -= 136304578;
                        var2 ^= -50653140;
                        var2 ^= 111003344;
                    }

                    Integer var86 = var2;
                    if (var86 == null) {
                        break label102;
                    }

                    switch (var2) {
                        case -937795523:
                        default:
                            var2 ^= 867598400;
                            break;
                        case 1490180933:
                            var2 >>>= 6;
                            var2 *= 1301546947;
                            var2 >>= 3;
                            var2 ^= 1015353011;
                            break;
                        case 1548524718:
                            var2 ^= -751418491;
                    }
                }
            }

            Integer var64 = var2;
            if (var64 != null) {
                AssertionError var65 = new AssertionError();
                throw var65;
            }
        }

        IllegalStateException var61 = new IllegalStateException();
        throw var61;
    }

    public void VY(Set var1) {
        boolean var107 = false;
        int var2 = wU;
        var2 ^= -1108039606;
        int var3 = System.identityHashCode(this);
        long var4 = var3;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var131;
        int var81 = (var131 = var4 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
        if (var81 != 0) {
            var2 += 842320853;
            var2 -= 579723309;
            var2 -= -1993960215;
            var2 |= -524949908;
            var2 ^= 1923847403;
        } else {
            var2 *= -1417108639;
            var2 ^= -1015891971;
            Map var82 = this.L;
            Collection var83 = var82.values();
            Iterator var84 = var83.iterator();
            Iterator var85 = var84;
            var2 |= -1726262024;
            var2 += -305050381;
            var2 += -1967900829;
            var2 ^= -1027827173;

            while (true) {
                boolean var5 = var85.hasNext();
                int var94 = var3 + 1;
                int var95 = var3 * var94;
                int var96 = var95 & 1;
                if (var96 == 0) {
                    var2 = switch (var2) {
                        case -2055018602 -> var2 ^ 765824024;
                        case -1231217835 -> {
                            var2 *= -1082098449;
                            var2 *= -1388488031;
                            yield var2 ^ 1238542094;
                        }
                        default -> var2 ^ 1004839834;
                    };
                    int var97 = var2 + 1;
                    int var98 = var2 * var97;
                    int var99 = var98 & 1;
                    if (var99 == 0) {
                        if (var5) {
                            var2 <<= 27;
                            var2 -= 1079208219;
                            var2 *= -2466967;
                            var2 |= 549811480;
                            var2 ^= 2145050838;
                            Integer var88 = var2;
                            label74:
                            if (var88 != null) {
                                Object var89 = var85.next();
                                Yn var90 = (Yn)var89;
                                Integer var100 = var3;
                                if (var100 == null) {
                                    var2 -= 1579178698;
                                    var2 *= -24829529;
                                    var2 ^= -1375633712;
                                    break;
                                }

                                label99: {
                                    var2 *= 287680349;
                                    var2 *= -2048351417;
                                    var2 ^= -1399698638;
                                    String var101 = var90.H();
                                    if (var101 != null) {
                                        var2 |= 1599349950;
                                        var2 |= -1519117707;
                                        var2 |= -882834989;
                                        var2 -= 297574266;
                                        var2 ^= 678219559;
                                        long var7 = var2;
                                        long var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        long var11 = var7 + 2L;
                                        var9 *= var11;
                                        var7 += 3L;
                                        var9 *= var7;
                                        var7 = var9 & 7L;
                                        long var132;
                                        int var110 = (var132 = var7 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                                        if (var110 != 0) {
                                            break label74;
                                        }

                                        boolean var102 = var1.contains(var101);
                                        var7 = var3;
                                        var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        var11 = var7 + 2L;
                                        var9 *= var11;
                                        var7 += 3L;
                                        var9 *= var7;
                                        var7 = var9 & 7L;
                                        long var133;
                                        int var114 = (var133 = var7 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                                        if (var114 != 0) {
                                            var2 >>= 31;
                                            var2 -= 188708122;
                                            var2 *= -1885258341;
                                            var2 -= -1082948234;
                                            var2 ^= 287983270;
                                            break;
                                        }

                                        var2 -= -428162209;
                                        var2 += -1515448077;
                                        var2 ^= 268010316;
                                        int var115 = var2 + 1;
                                        int var116 = var2 * var115;
                                        int var117 = var116 & 1;
                                        if (var117 != 0) {
                                            break label74;
                                        }

                                        if (!var102) {
                                            var2 |= -1081690957;
                                            var2 += -1959622417;
                                            var2 ^= 858722068;
                                            var6 = var2;
                                            var8 = var6 + 1L;
                                            var8 = var6 * var8;
                                            long var10 = var6 + 2L;
                                            var8 *= var10;
                                            var6 += 3L;
                                            var8 *= var6;
                                            var6 = var8 & 7L;
                                            long var134;
                                            int var106 = (var134 = var6 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                                            if (var106 != 0) {
                                                break label74;
                                            }

                                            var107 = false;
                                            var2 += -859902188;
                                            var2 += -1806343443;
                                            var2 += -369434157;
                                            var2 |= 738088583;
                                            var2 ^= 1429439989;
                                            break label99;
                                        }

                                        var2 &= 500471594;
                                        var2 ^= 173037414;
                                    } else {
                                        var2 &= 1837791835;
                                        var2 += 1644184039;
                                        var2 ^= -1400629058;
                                    }

                                    Integer var118 = var2;
                                    if (var118 == null) {
                                        break label74;
                                    }

                                    var107 = true;
                                    var2 |= -982160222;
                                    var2 += 350719348;
                                    var2 >>>= 18;
                                    var2 ^= -1093909483;
                                }

                                var90.vY(var107);
                                var2 -= 1666462463;
                                var2 ^= -303735946;
                                continue;
                            }
                        } else {
                            var2 <<= 18;
                            var2 ^= -917067136;
                            long var75 = var2;
                            long var86 = var75 + 1L;
                            long var87 = var75 * var86;
                            long var76 = var87 & 1L;
                            long var135;
                            var3 = (var135 = var76 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                return;
                            }
                        }
                    }

                    IllegalStateException var78 = new IllegalStateException();
                    throw var78;
                }

                var2 += -729330275;
                var2 ^= -371266796;
                var2 -= -905350108;
                var2 ^= 518352213;
                break;
            }
        }

        IllegalArgumentException var74 = new IllegalArgumentException();
        throw var74;
    }

    public void P(Runnable var1) {
        int var2 = wU;
        var2 ^= 1535008236;
        int var3 = System.identityHashCode(this);
        List var4 = this.N;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var26;
        var3 = (var26 = var5 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var3 != 0) {
            var2 *= 6180327;
            var2 |= 483964285;
            var2 &= -455804379;
            var2 ^= 2127418586;
            RuntimeException var20 = new RuntimeException();
            throw var20;
        } else {
            var2 >>= 6;
            var2 ^= 949600711;
            boolean var14 = var4.add(var1);
        }
    }

    private void T() {
        label74: {
            int var1 = wU;
            var1 ^= -72382363;
            int var2 = System.identityHashCode(this);
            List var3 = this.N;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                var1 &= -1780742888;
                var1 &= 2077291886;
                var1 ^= 1207707595;
                var1 ^= 1585732661;
            } else {
                var1 &= -202994782;
                var1 >>= 15;
                var1 &= -856217938;
                var1 ^= 726597632;
                var1 ^= -921885882;
                var4 = var1 + 1;
                var4 = var1 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label74;
                }

                Iterator var47 = var3.iterator();
                Iterator var48 = var47;
                var1 -= 2057072241;
                var1 += 1125957822;
                var1 ^= 509246671;
                var1 >>= 28;
                var1 ^= -1323277925;

                label66:
                while (true) {
                    boolean var56 = var48.hasNext();
                    long var64 = var2;
                    long var7 = var64 + 1L;
                    var7 = var64 * var7;
                    long var9 = var64 + 2L;
                    var7 *= var9;
                    long var65 = var64 + 3L;
                    var7 *= var65;
                    long var66 = var7 & 7L;
                    long var74;
                    var5 = (var74 = var66 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        switch (var1) {
                            case 1323277920:
                                var1 ^= -1748851784;
                                var1 ^= -1045085402;
                                break label66;
                            case 1423485859:
                                var1 ^= 1633293005;
                                break label66;
                            case 1948682614:
                            default:
                                var1 ^= -1317496288;
                                break label66;
                        }
                    }

                    var1 ^= 621434261;
                    var1 ^= 703586558;
                    if (!var56) {
                        var1 ^= -1325547367;
                        var1 -= 251594905;
                        var1 ^= -586245652;
                        long var43 = var1;
                        long var59 = var43 + 1L;
                        long var60 = var43 * var59;
                        long var6 = var43 + 2L;
                        long var61 = var60 * var6;
                        long var44 = var43 + 3L;
                        long var62 = var61 * var44;
                        long var45 = var62 & 7L;
                        long var75;
                        var2 = (var75 = var45 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                        if (var2 == 0) {
                            return;
                        }
                        break label74;
                    }
                    var1 = switch (var1) {
                        default -> var1 ^ -1558765763;
                        case -1137169732 -> var1 ^ -1830832100;
                        case 1111108363 -> {
                            var1 |= -8643978;
                            var1 >>= 22;
                            yield var1 ^ -401452274;
                        }
                    };
                    Object var57 = var48.next();
                    Runnable var58 = (Runnable)var57;
                    var5 = var2 + 1;
                    var5 = var2 * var5;
                    var5 &= 1;
                    if (var5 != 0) {
                        var1 |= 2138857804;
                        var1 ^= 1733661441;
                        break;
                    }
                    var1 = switch (var1) {
                        case -1656895762 -> var1 ^ -1039339824;
                        case 401452275 -> {
                            var1 <<= 12;
                            var1 &= 1410662395;
                            yield var1 ^ -471419059;
                        }
                        default -> var1 ^ -537170375;
                    };
                    var58.run();
                    switch (var1) {
                        case -1276999859:
                            var1 |= 2016927204;
                            var1 ^= -1255652979;
                            break;
                        case -800763722:
                            var1 ^= 1097819507;
                            break;
                        case -49839213:
                        default:
                            var1 ^= -176032330;
                    }
                }
            }

            Integer var40 = var1;
            if (var40 != null) {
                IllegalArgumentException var42 = new IllegalArgumentException();
                throw var42;
            }
        }

        AssertionError var41 = new AssertionError();
        throw var41;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -168046749;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        wU = var4;
    }
}
