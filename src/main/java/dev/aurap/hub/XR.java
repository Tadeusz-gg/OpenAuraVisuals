package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;

public abstract sealed class XR permits Mz, DZ, qJ, Ml, Nx, WE, wY {
    protected static final TextStyle lt;
    protected static final TextStyle M;
    protected static final TextStyle G;
    protected float U;
    protected float fb;
    protected float pP;
    public static final int Mz;

    public XR() {
    }

    public static XR n(xB var0) {
        label197: {
            int var34;
            Object var141;
            label196: {
                var34 = Mz;
                var34 ^= -1456686772;
                int var2 = System.identityHashCode(var0);
                Integer var3 = var2;
                if (var3 != null) {
                    var34 >>= 9;
                    var34 += -861695194;
                    var34 -= 1287685574;
                    var34 *= -1684067393;
                    var34 ^= 865634914;
                    Objects.requireNonNull(var0);
                    byte var4 = 0;
                    int var138 = ((var0 instanceof JL) ? 0 : (var0 instanceof Uq) ? 1 : (var0 instanceof r_2) ? 2 : (var0 instanceof Fk) ? 3 : (var0 instanceof ia) ? 4 : (var0 instanceof cS) ? 5 : -1);
                    label194:
                    switch (var138) {
                        case 0:
                            var34 ^= 531806585;
                            var34 |= 187460285;
                            var34 *= 1135687685;
                            var34 ^= -1331496530;
                            long var163 = var34;
                            long var208 = var163 + 1L;
                            var208 = var163 * var208;
                            var163 = var208 & 1L;
                            long var230;
                            int var165 = (var230 = var163 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                            if (var165 != 0) {
                                break label197;
                            }

                            JL var133 = (JL)var0;
                            int var166 = var2 + 1;
                            int var167 = var2 * var166;
                            var2 = var167 & 1;
                            if (var2 == 0) {
                                var34 = switch (var34) {
                                    case -1438581153 -> {
                                        var34 |= -1865350927;
                                        yield var34 ^ 1941863417;
                                    }
                                    default -> var34 ^ 53807488;
                                    case 943340361 -> var34 ^ 1077500854;
                                };
                                var163 = var34;
                                var208 = var163 + 1L;
                                var208 = var163 * var208;
                                long var228 = var163 + 2L;
                                var208 *= var228;
                                var163 += 3L;
                                var208 *= var163;
                                var163 = var208 & 7L;
                                long var231;
                                var2 = (var231 = var163 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                                if (var2 != 0) {
                                    break label197;
                                }

                                Mz var126 = new Mz(var133);
                                var141 = var126;
                                var34 &= 377386457;
                                var34 ^= 1935308087;
                                break label196;
                            }

                            switch (var34) {
                                case -1438581153:
                                    var34 ^= -1307555811;
                                    var34 |= -562965625;
                                    var34 *= -234940709;
                                    var34 += -35555309;
                                    var34 ^= -1176758077;
                                    break label194;
                                case -1425695816:
                                default:
                                    var34 ^= -1938298209;
                                    break label194;
                                case 2122449665:
                                    var34 ^= -84710353;
                                    break label194;
                            }
                        case 1:
                            var34 ^= -785394955;
                            var34 -= -1095783302;
                            var34 ^= -210502172;
                            long var159 = var34;
                            long var206 = var159 + 1L;
                            var206 = var159 * var206;
                            var159 = var206 & 1L;
                            long var234;
                            int var161 = (var234 = var159 - 0L) == 0L ? 0 : (var234 < 0L ? -1 : 1);
                            if (var161 != 0) {
                                break label197;
                            }

                            Uq var162 = (Uq)var0;
                            long var185 = var2;
                            long var215 = var185 + 1L;
                            var215 = var185 * var215;
                            long var10 = var185 + 2L;
                            var215 *= var10;
                            var185 += 3L;
                            var215 *= var185;
                            var185 = var215 & 7L;
                            long var235;
                            int var188 = (var235 = var185 - 0L) == 0L ? 0 : (var235 < 0L ? -1 : 1);
                            if (var188 == 0) {
                                var34 = switch (var34) {
                                    default -> var34 ^ -1281766133;
                                    case 224846867 -> {
                                        var34 -= 374951517;
                                        var34 |= 1919662587;
                                        yield var34 ^ -1071534070;
                                    }
                                    case 364054048 -> var34 ^ 838829607;
                                };
                                var185 = var34;
                                var215 = var185 + 1L;
                                var215 = var185 * var215;
                                var185 = var215 & 1L;
                                long var236;
                                int var191 = (var236 = var185 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                                if (var191 != 0) {
                                    break label197;
                                }

                                DZ var192 = new DZ(var162);
                                var141 = var192;
                                var34 += -146184907;
                                var34 ^= -1445006937;
                                var34 ^= -193072454;
                                break label196;
                            }

                            var34 += 1710644470;
                            var34 *= 1703272845;
                            var34 ^= 1409952614;
                            break;
                        case 2:
                            var34 += 80949440;
                            var34 -= -1670832258;
                            var34 <<= 22;
                            var34 &= -1896582794;
                            var34 ^= 70693654;
                            int var151 = var34 + 1;
                            var151 = var34 * var151;
                            var151 &= 1;
                            if (var151 != 0) {
                                break label197;
                            }

                            r_2 var154 = (r_2)var0;
                            int var173 = var2 + 1;
                            var173 = var2 * var173;
                            int var198 = var2 + 2;
                            var173 *= var198;
                            var198 = var2 + 3;
                            var173 *= var198;
                            var173 &= 7;
                            if (var173 != 0) {
                                switch (var34) {
                                    case -793201625:
                                        var34 ^= -2105509675;
                                        break label194;
                                    case 13903687:
                                    default:
                                        var34 ^= -875596502;
                                        break label194;
                                    case 79082262:
                                        var34 &= 1528123618;
                                        var34 -= 1738501737;
                                        var34 ^= 457977866;
                                }
                            } else {
                                var34 |= 748299826;
                                var34 ^= -597950794;
                                nv var178 = UN.p(var154);
                                if (var178 != null) {
                                    var34 -= 1534701909;
                                    var34 &= -325656961;
                                    var34 ^= -1126972986;
                                    Integer var179 = var34;
                                    if (var179 == null) {
                                        break label197;
                                    }

                                    nv var200 = UN.p(var154);
                                    WE var180 = new WE(var154, var200);
                                    var198 = var2 + 1;
                                    var198 = var2 * var198;
                                    int var8 = var2 + 2;
                                    var198 *= var8;
                                    var8 = var2 + 3;
                                    var198 *= var8;
                                    var198 &= 7;
                                    if (var198 == 0) {
                                        var34 = switch (var34) {
                                            default -> var34 ^ 965487705;
                                            case 953244141 -> {
                                                var34 ^= -1038694418;
                                                var34 ^= 1605459924;
                                                yield var34 ^ -1980537313;
                                            }
                                            case 1842278133 -> var34 ^ -115638883;
                                        };
                                        var141 = var180;
                                        switch (var34) {
                                            case -280244783:
                                                var34 ^= -828241773;
                                                break label196;
                                            case -264791215:
                                            default:
                                                var34 ^= -1036643178;
                                                break label196;
                                            case 746956744:
                                                var34 -= -1124351690;
                                                var34 ^= 482186917;
                                                break label196;
                                        }
                                    }

                                    var34 -= 1380032836;
                                    var34 <<= 4;
                                    var34 ^= -339535101;
                                } else {
                                    var34 = switch (var34) {
                                        case -253408896 -> {
                                            var34 *= 585704663;
                                            var34 += -614840195;
                                            var34 >>= 31;
                                            yield var34 ^ -1852572462;
                                        }
                                        case 72210394 -> var34 ^ -670084822;
                                        default -> var34 ^ 1563217133;
                                    };
                                    var173 = var34 + 1;
                                    var173 = var34 * var173;
                                    var173 &= 1;
                                    if (var173 != 0) {
                                        break label197;
                                    }

                                    qJ var184 = new qJ(var154);
                                    Integer var155 = var2;
                                    if (var155 != null) {
                                        var34 &= 2138634228;
                                        var34 += -182926623;
                                        var34 ^= 1897817140;
                                        int var156 = var34 + 1;
                                        var156 = var34 * var156;
                                        var156 &= 1;
                                        if (var156 != 0) {
                                            break label197;
                                        }

                                        var141 = var184;
                                        var34 >>>= 17;
                                        var34 -= 684786104;
                                        var34 &= 1840267064;
                                        var34 ^= 907299095;
                                        break label196;
                                    }

                                    var34 &= 1805795263;
                                    var34 -= 373119461;
                                    var34 >>= 3;
                                    var34 -= -1364385989;
                                    var34 ^= -846992247;
                                }
                            }
                            break;
                        case 3:
                            var34 = switch (var34) {
                                case -1033370850 -> var34 ^ -382395218;
                                default -> var34 ^ -1763279474;
                                case 1844122756 -> {
                                    var34 |= -775535328;
                                    var34 *= -1855052551;
                                    var34 -= 2006711094;
                                    yield var34 ^ -1485945353;
                                }
                            };
                            Fk var148 = (Fk)var0;
                            Ml var172 = new Ml(var148);
                            long var7 = var2;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var232;
                            int var149 = (var232 = var7 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                            if (var149 == 0) {
                                var34 ^= 2076365625;
                                var34 ^= -1988673304;
                                var34 <<= 6;
                                var34 |= -1812271280;
                                var34 ^= -200676809;
                                var7 = var34;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var11 = var7 + 2L;
                                var9 *= var11;
                                var7 += 3L;
                                var9 *= var7;
                                var7 = var9 & 7L;
                                long var233;
                                int var150 = (var233 = var7 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                                if (var150 != 0) {
                                    break label197;
                                }

                                var141 = var172;
                                var34 *= 850895039;
                                var34 ^= 1940858862;
                                break label196;
                            }

                            var34 >>>= 27;
                            var34 -= 1459815;
                            var34 += 1312830855;
                            var34 ^= -854491460;
                            break;
                        case 4:
                            var34 |= -644900574;
                            var34 >>>= 15;
                            var34 <<= 31;
                            var34 ^= 344769480;
                            var34 ^= -203076182;
                            Integer var146 = var34;
                            if (var146 == null) {
                                break label197;
                            }

                            ia var147 = (ia)var0;
                            Integer var6 = var2;
                            if (var6 != null) {
                                var34 = switch (var34) {
                                    case -2146220176 -> var34 ^ -647216886;
                                    default -> var34 ^ 654673605;
                                    case 1734970978 -> {
                                        var34 &= -497446135;
                                        var34 >>>= 30;
                                        yield var34 ^ -580353586;
                                    }
                                };
                                Nx var171 = new Nx(var147);
                                var141 = var171;
                                switch (var34) {
                                    case -1134235072:
                                    default:
                                        var34 ^= -2108592685;
                                        break label196;
                                    case -580353585:
                                        var34 ^= 118368661;
                                        var34 >>= 9;
                                        var34 |= -1783487701;
                                        var34 *= -1399520665;
                                        var34 ^= 969655854;
                                        break label196;
                                    case 748345013:
                                        var34 ^= 1239519188;
                                        break label196;
                                }
                            }

                            switch (var34) {
                                case -285937667:
                                    var34 ^= -506945522;
                                    break label194;
                                case 1684556412:
                                default:
                                    var34 ^= -271860667;
                                    break label194;
                                case 1734970978:
                                    var34 += -350722182;
                                    var34 |= -801878265;
                                    var34 |= -727634156;
                                    var34 ^= 1435332172;
                                    break label194;
                            }
                        case 5:
                            var34 -= 1436009858;
                            var34 |= -662062546;
                            var34 ^= -965603911;
                            var141 = var34;
                            if (var141 == null) {
                                break label197;
                            }

                            var141 = (cS)var0;
                            int var5 = var2 + 1;
                            var5 = var2 * var5;
                            var5 &= 1;
                            if (var5 == 0) {
                                var34 *= -227401835;
                                var34 -= 2016854082;
                                var34 &= 1820583306;
                                var34 ^= 644633575;
                                Integer var144 = var34;
                                if (var144 == null) {
                                    break label197;
                                }

                                wY var145 = new wY((cS)var141);
                                var141 = var145;
                                var34 |= -686573786;
                                var34 ^= -1404336304;
                                break label196;
                            }

                            var34 ^= -633747153;
                            var34 ^= 1202235947;
                            break;
                        default:
                            var34 -= 924355721;
                            var34 |= -1818356005;
                            var34 *= 547363247;
                            var34 &= 305676331;
                            var34 ^= -1238956469;
                            Integer var122 = var34;
                            if (var122 != null) {
                                MatchException var123 = new MatchException(null, null);
                                throw var123;
                            }
                            break label197;
                    }
                } else {
                    switch (var34) {
                        case -568906905:
                        default:
                            var34 ^= -1640092226;
                            break;
                        case -364219289:
                            var34 |= 315628505;
                            var34 ^= 2044915308;
                            break;
                        case 1140341553:
                            var34 ^= -248091586;
                    }
                }

                long var117 = var34;
                long var136 = var117 + 1L;
                long var137 = var117 * var136;
                long var118 = var137 & 1L;
                long var237;
                var34 = (var237 = var118 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                if (var34 == 0) {
                    UnsupportedOperationException var121 = new UnsupportedOperationException();
                    throw var121;
                }
                break label197;
            }

            int var127 = var34 + 1;
            var127 = var34 * var127;
            int var134 = var34 + 2;
            var127 *= var134;
            var134 = var34 + 3;
            var127 *= var134;
            var127 &= 7;
            if (var127 == 0) {
                return (XR)var141;
            }
        }

        UnsupportedOperationException var120 = new UnsupportedOperationException();
        throw var120;
    }

    public abstract xB W();

    public abstract float v();

    public abstract void ol(float var1);

    public final void Ar(Canvas var1, jX var2, float var3, float var4, float var5, float var6) {
        int var7 = Mz;
        var7 ^= 2005308228;
        int var8 = System.identityHashCode(this);
        this.U = var3;
        this.fb = var4;
        this.pP = var5;
        long var30 = var8;
        long var10 = var30 + 1L;
        var10 = var30 * var10;
        long var31 = var10 & 1L;
        long var37;
        var8 = (var37 = var31 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        if (var8 == 0) {
            switch (var7) {
                case -843611688:
                default:
                    var7 ^= 358126684;
                    break;
                case 510910610:
                    var7 ^= 490622734;
                    break;
                case 887119471:
                    var7 -= -1207632473;
                    var7 &= -1188003073;
                    var7 += 1926068267;
                    var7 |= -470945945;
                    var7 ^= -1331971893;
            }

            this.R(var1, var2, var6);
        } else {
            var7 *= -974598835;
            var7 |= 1278472741;
            var7 ^= 22665104;
            long var17 = var7;
            long var9 = var17 + 1L;
            var9 = var17 * var9;
            long var11 = var17 + 2L;
            var9 *= var11;
            long var18 = var17 + 3L;
            var9 *= var18;
            long var19 = var9 & 7L;
            long var38;
            var7 = (var38 = var19 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var7 == 0) {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            } else {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        }
    }

    protected abstract void R(Canvas var1, jX var2, float var3);

    public boolean CG(float var1, float var2) {
        label130: {
            int var3 = Mz;
            var3 ^= 1083243976;
            int var4 = System.identityHashCode(this);
            Integer var5 = var4;
            if (var5 == null) {
                switch (var3) {
                    case -572214841:
                        var3 ^= -1389916428;
                        break;
                    case 66466019:
                        var3 -= -1518392576;
                        var3 ^= 1435458855;
                        break;
                    case 339100258:
                    default:
                        var3 ^= 339137941;
                }
            } else {
                label148: {
                    var3 = switch (var3) {
                        default -> var3 ^ -596349258;
                        case -146247368 -> var3 ^ 474027836;
                        case 66466019 -> {
                            var3 *= 843110935;
                            var3 &= -1292040786;
                            yield var3 ^ -2005316736;
                        }
                    };
                    int var78 = var3 + 1;
                    var78 = var3 * var78;
                    var78 &= 1;
                    if (var78 != 0) {
                        break label130;
                    }

                    float var81 = this.U;
                    float var138;
                    var78 = (var138 = var1 - var81) == 0.0F ? 0 : (var138 < 0.0F ? -1 : 1);
                    if (var78 >= 0) {
                        var3 = switch (var3) {
                            case -1880957761 -> var3 ^ 88801631;
                            default -> var3 ^ -689750124;
                            case 168053668 -> {
                                var3 += 775728731;
                                var3 -= -1426620397;
                                var3 ^= 2086504295;
                                var3 *= -1231217661;
                                yield var3 ^ -131342237;
                            }
                        };
                        float var83 = this.U;
                        float var6 = this.pP;
                        long var7 = var4;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var139;
                        int var119 = (var139 = var7 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                        if (var119 != 0) {
                            var3 -= 315644269;
                            var3 ^= 1287012116;
                            var3 ^= -1495264891;
                            break label148;
                        }

                        var3 &= 445154072;
                        var3 ^= -434981676;
                        Integer var120 = var3;
                        if (var120 == null) {
                            break label130;
                        }

                        float var84 = var83 + var6;
                        float var140;
                        var78 = (var140 = var1 - var84) == 0.0F ? 0 : (var140 < 0.0F ? -1 : 1);
                        if (var78 < 0) {
                            var3 -= 146385486;
                            var3 ^= 1533217141;
                            var3 |= -12581646;
                            var3 |= -194167772;
                            var3 ^= 1981294753;
                            long var86 = var3;
                            var7 = var86 + 1L;
                            var7 = var86 * var7;
                            long var87 = var7 & 1L;
                            long var141;
                            var78 = (var141 = var87 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                            if (var78 != 0) {
                                break label130;
                            }

                            float var89 = this.fb;
                            float var142;
                            var78 = (var142 = var2 - var89) == 0.0F ? 0 : (var142 < 0.0F ? -1 : 1);
                            long var103 = var4;
                            long var8 = var103 + 1L;
                            var8 = var103 * var8;
                            long var10 = var103 + 2L;
                            var8 *= var10;
                            long var104 = var103 + 3L;
                            var8 *= var104;
                            long var105 = var8 & 7L;
                            long var143;
                            int var106 = (var143 = var105 - 0L) == 0L ? 0 : (var143 < 0L ? -1 : 1);
                            if (var106 != 0) {
                                var3 &= -1387140314;
                                var3 ^= -976432740;
                                var3 += -56273029;
                                var3 ^= 1824652914;
                                var3 ^= 779816867;
                                break label148;
                            }
                            var3 = switch (var3) {
                                case -1988651946 -> {
                                    var3 += 35349377;
                                    var3 *= 2022996661;
                                    var3 |= -807759256;
                                    var3 ^= 150086732;
                                    yield var3 ^ -945519598;
                                }
                                default -> var3 ^ -191048355;
                                case 1911448070 -> var3 ^ -2142044701;
                            };
                            long var107 = var3;
                            var8 = var107 + 1L;
                            var8 = var107 * var8;
                            var10 = var107 + 2L;
                            var8 *= var10;
                            long var108 = var107 + 3L;
                            var8 *= var108;
                            long var109 = var8 & 7L;
                            long var144;
                            int var110 = (var144 = var109 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                            if (var110 != 0) {
                                break label130;
                            }

                            if (var78 >= 0) {
                                var3 += -123417783;
                                var3 >>= 5;
                                var3 |= -810845136;
                                var3 ^= 768751632;
                                var3 ^= -493831234;
                                Integer var91 = var3;
                                if (var91 == null) {
                                    break label130;
                                }

                                float var92 = this.fb;
                                var6 = this.v();
                                float var93 = var92 + var6;
                                float var145;
                                int var94 = (var145 = var2 - var93) == 0.0F ? 0 : (var145 < 0.0F ? -1 : 1);
                                int var112 = var4 + 1;
                                int var113 = var4 * var112;
                                var4 = var113 & 1;
                                if (var4 != 0) {
                                    var3 >>>= 23;
                                    var3 ^= 200824997;
                                    break label148;
                                }

                                var3 += -765808117;
                                var3 -= 423204394;
                                var3 ^= -628384639;
                                if (var94 < 0) {
                                    var3 = switch (var3) {
                                        default -> var3 ^ -505957364;
                                        case -1405298699 -> var3 ^ -1815837083;
                                        case 859899327 -> {
                                            var3 |= -2090135232;
                                            yield var3 ^ 1088801755;
                                        }
                                    };
                                    long var73 = var3;
                                    long var114 = var73 + 1L;
                                    long var115 = var73 * var114;
                                    var8 = var73 + 2L;
                                    long var116 = var115 * var8;
                                    long var74 = var73 + 3L;
                                    long var117 = var116 * var74;
                                    long var75 = var117 & 7L;
                                    long var146;
                                    var4 = (var146 = var75 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                                    if (var4 != 0) {
                                        break label130;
                                    }

                                    boolean var77 = true;
                                    var3 *= 1809697439;
                                    var3 *= -1967885553;
                                    var3 ^= -335792722;
                                    return var77;
                                }

                                switch (var3) {
                                    case -173195178:
                                        var3 ^= 1634037562;
                                        break;
                                    case 859899327:
                                        var3 *= 104805245;
                                        var3 &= -1565213036;
                                        var3 |= 1114302376;
                                        var3 += 1379274578;
                                        var3 ^= 1502853388;
                                        break;
                                    case 867271165:
                                    default:
                                        var3 ^= -1126388679;
                                }
                            } else {
                                var3 <<= 13;
                                var3 ^= -288352266;
                            }
                        } else {
                            switch (var3) {
                                case -166053932:
                                    var3 *= -1125373277;
                                    var3 &= -837405681;
                                    var3 &= 401104084;
                                    var3 *= -1330031909;
                                    var3 ^= 916737178;
                                    break;
                                case 1529519204:
                                    var3 ^= 667784682;
                                    break;
                                case 2025285891:
                                default:
                                    var3 ^= 11248902;
                            }
                        }
                    } else {
                        var3 &= 707951178;
                        var3 += 1895301288;
                        var3 &= -1555062671;
                        var3 &= -434710880;
                        var3 ^= 1857468374;
                    }

                    long var95 = var3;
                    long var123 = var95 + 1L;
                    var123 = var95 * var123;
                    long var136 = var95 + 2L;
                    var123 *= var136;
                    long var96 = var95 + 3L;
                    var123 *= var96;
                    long var97 = var123 & 7L;
                    long var147;
                    var78 = (var147 = var97 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                    if (var78 != 0) {
                        break label130;
                    }

                    boolean var148 = false;
                    var3 += -1103353976;
                    var3 ^= 2053641140;
                    return var148;
                }
            }

            int var99 = var3 + 1;
            var99 = var3 * var99;
            var99 &= 1;
            if (var99 == 0) {
                AssertionError var102 = new AssertionError();
                throw var102;
            }
        }

        IllegalStateException var71 = new IllegalStateException();
        throw var71;
    }

    public boolean i(jX var1, float var2, float var3, int var4) {
        int var5 = System.identityHashCode(this);
        return false;
    }

    public void M(jX var1, float var2, float var3) {
        int var4 = System.identityHashCode(this);
    }

    public void u(jX var1) {
        int var2 = System.identityHashCode(this);
    }

    public boolean E(jX var1, int var2) {
        int var3 = System.identityHashCode(this);
        return false;
    }

    public void zx(boolean var1) {
        int var2 = System.identityHashCode(this);
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -49617826;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Mz = var4;
        TextStyle var5 = TextStyle.of(8.0F, -419430401);
        lt = var5;
        TextStyle var6 = TextStyle.of(8.0F, -4075035);
        M = var6;
        TextStyle var7 = TextStyle.of(7.5F, -4075035);
        G = var7;
    }
}
