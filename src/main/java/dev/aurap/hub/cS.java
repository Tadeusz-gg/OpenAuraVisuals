package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public final class cS extends xB {
    private final String S;
    private final du pf;
    private Consumer u;
    private IntSupplier OS;
    private IntSupplier t;
    public static final int o;

    public cS(String var1, String var2, du var3) {
        super(var1, var2);
        du var4 = new du();
        this.pf = var4;
        IntSupplier var5 = () -> -1;
        this.OS = var5;
        IntSupplier var6 = () -> -11559425;
        this.t = var6;
        String var7 = var3.lU();
        this.S = var7;
        var4 = this.pf;
        var4.R(var3);
    }

    public du lP() {
        int var1 = o;
        var1 ^= 1808256321;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var20 = var4 & 1L;
        long var27;
        var2 = (var27 = var20 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        int var3 = of_2.Ik;
        var1 ^= var3;
        var1 ^= -924068123;
        var3 = of_2.nE;
        var1 ^= var3;
        var1 ^= -1075023892;
        if (var2 != 0) {
            var1 *= 909694433;
            var1 += -1032451603;
            var1 ^= -917124073;
            var1 ^= -437690675;
            IllegalArgumentException var24 = new IllegalArgumentException();
            throw var24;
        } else {
            var1 ^= 801001234;
            var1 ^= -1412365490;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return this.pf;
            } else {
                IllegalStateException var14 = new IllegalStateException();
                throw var14;
            }
        }
    }

    public void pJ(int var1, int var2, byte var3, Be var4) {
        int var5 = o;
        var5 ^= 1005205548;
        int var7 = System.identityHashCode(this);
        du var8 = this.pf;
        long var9 = var7;
        long var11 = var9 + 1L;
        var11 = var9 * var11;
        long var13 = var9 + 2L;
        var11 *= var13;
        var9 += 3L;
        var11 *= var9;
        var9 = var11 & 7L;
        long var59;
        var7 = (var59 = var9 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
        if (var7 == 0) {
            var5 *= 138100115;
            var5 &= 2113442612;
            var5 ^= 1245279286;
            Integer var42 = var1;
            if (var42 != null) {
                boolean var43 = var8.Pk(var1, var2, var3, var4);
                if (var43) {
                    var5 ^= -429262746;
                    var5 ^= 1499064550;
                    var5 ^= -146199564;
                    this.lU();
                    switch (var5) {
                        case -1569450887:
                            var5 ^= -1248461608;
                            break;
                        case 61890402:
                            var5 *= 1636531443;
                            var5 += 404126457;
                            var5 ^= -769997239;
                            break;
                        case 719204270:
                        default:
                            var5 ^= 432166372;
                    }
                } else {
                    switch (var5) {
                        case 347532302:
                            var5 ^= -844431613;
                            break;
                        case 1271489558:
                            var5 >>>= 17;
                            var5 ^= 552640338;
                            break;
                        case 1393111531:
                        default:
                            var5 ^= 1017960739;
                    }
                }

                long var44 = var1;
                var9 = var44 + 1L;
                var9 = var44 * var9;
                long var45 = var9 & 1L;
                long var60;
                int var46 = (var60 = var45 - 0L) == 0L ? 0 : (var60 < 0L ? -1 : 1);
                if (var46 == 0) {
                    return;
                }
            }
        } else {
            switch (var5) {
                case -1123643976:
                    var5 <<= 4;
                    var5 ^= 1351655280;
                    break;
                case 1648912995:
                    var5 ^= 657404350;
                    break;
                case 2124212155:
                default:
                    var5 ^= -1438722605;
            }

            long var35 = var1;
            long var47 = var35 + 1L;
            long var48 = var35 * var47;
            var9 = var35 + 2L;
            long var49 = var48 * var9;
            long var36 = var35 + 3L;
            long var50 = var49 * var36;
            long var37 = var50 & 7L;
            long var61;
            var5 = (var61 = var37 - 0L) == 0L ? 0 : (var61 < 0L ? -1 : 1);
            if (var5 == 0) {
                AssertionError var40 = new AssertionError();
                throw var40;
            }
        }

        UnsupportedOperationException var39 = new UnsupportedOperationException();
        throw var39;
    }

    public void sJ() {
        label48: {
            int var1 = o;
            var1 ^= -464572845;
            int var2 = System.identityHashCode(this);
            du var3 = this.pf;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            var4 &= 1;
            if (var4 == 0) {
                var1 *= -661618145;
                var1 ^= 1035144419;
                boolean var33 = var3.G();
                if (var33) {
                    var1 *= 2142465161;
                    var1 += -845841289;
                    var1 ^= 1280400525;
                    long var38 = var1;
                    long var49 = var38 + 1L;
                    var49 = var38 * var49;
                    long var7 = var38 + 2L;
                    var49 *= var7;
                    long var39 = var38 + 3L;
                    var49 *= var39;
                    long var40 = var49 & 7L;
                    long var56;
                    int var41 = (var56 = var40 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
                    if (var41 == 0) {
                        return;
                    }
                    break label48;
                }

                var1 >>>= 9;
                var1 ^= -619448870;
                long var34 = var1;
                long var5 = var34 + 1L;
                var5 = var34 * var5;
                long var35 = var5 & 1L;
                long var57;
                int var36 = (var57 = var35 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
                if (var36 != 0) {
                    break label48;
                }

                var3 = this.pf;
                long var44 = var2;
                long var6 = var44 + 1L;
                var6 = var44 * var6;
                long var45 = var6 & 1L;
                long var58;
                var2 = (var58 = var45 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                if (var2 == 0) {
                    long var46 = switch (var1) {
                        case -1527306340 -> var1 ^ -1396435873;
                        case -615890647 -> {
                            var1 |= 1683590084;
                            var1 |= 994521919;
                            yield var1 ^ 1112662319;
                        }
                        default -> var1 ^ 182066270;
                    };
                    var6 = var46 + 1L;
                    var6 = var46 * var6;
                    long var47 = var6 & 1L;
                    long var59;
                    var2 = (var59 = var47 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        var3.E();
                        this.lU();
                        return;
                    }
                    break label48;
                }

                switch (var1) {
                    case -615890647:
                        var1 += 1603946306;
                        var1 *= -1562748631;
                        var1 *= 60554165;
                        var1 &= 610101278;
                        var1 ^= 331308967;
                        break;
                    case -281046548:
                    default:
                        var1 ^= -1781134477;
                        break;
                    case -263574209:
                        var1 ^= 1186717947;
                }
            } else {
                var1 *= 563836887;
                var1 ^= -893818216;
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                RuntimeException var28 = new RuntimeException();
                throw var28;
            }
        }

        IllegalStateException var27 = new IllegalStateException();
        throw var27;
    }

    public cS tZ(Consumer var1) {
        int var2 = o;
        var2 ^= 1520524914;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 != 0) {
            var2 += -685060279;
            var2 >>= 8;
            var2 *= 2088926153;
            var2 ^= 485633681;
            AssertionError var16 = new AssertionError();
            throw var16;
        } else {
            var2 -= 939803463;
            var2 -= 1034995475;
            var2 ^= -1777284902;
            Integer var9 = var2;
            if (var9 == null) {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            } else {
                this.u = var1;
                return this;
            }
        }
    }

    public cS Z(IntSupplier var1, IntSupplier var2) {
        int var3 = o;
        var3 ^= 1947111905;
        int var4 = System.identityHashCode(this);
        long var19 = var4;
        long var6 = var19 + 1L;
        var6 = var19 * var6;
        long var8 = var19 + 2L;
        var6 *= var8;
        long var20 = var19 + 3L;
        var6 *= var20;
        long var21 = var6 & 7L;
        long var30;
        var4 = (var30 = var21 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var4 != 0) {
            var3 <<= 9;
            var3 &= -1134011557;
            var3 ^= -1451937160;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 == 0) {
                IllegalStateException var26 = new IllegalStateException();
                throw var26;
            }
        } else {
            var3 += 236173240;
            var3 *= -380039391;
            var3 ^= -1072595311;
            Integer var17 = var3;
            if (var17 != null) {
                this.OS = var1;
                this.t = var2;
                return this;
            }
        }

        RuntimeException var18 = new RuntimeException();
        throw var18;
    }

    public int b() {
        int var1 = o;
        var1 ^= -1136214756;
        int var2 = System.identityHashCode(this);
        IntSupplier var3 = this.OS;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var24;
        var2 = (var24 = var4 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 == 0) {
            switch (var1) {
                case -730469199:
                    var1 ^= -906409356;
                    break;
                case -403581716:
                default:
                    var1 ^= 1335291359;
                    break;
                case 984221832:
                    var1 ^= 259817248;
                    var1 >>>= 28;
                    var1 -= 169918251;
                    var1 ^= 843739905;
            }

            return var3.getAsInt();
        } else {
            switch (var1) {
                case -154131914:
                    var1 ^= -844180763;
                    break;
                case 984221832:
                    var1 |= 459467865;
                    var1 ^= -341746811;
                    var1 ^= -46384974;
                    break;
                case 1253065610:
                default:
                    var1 ^= -1309425893;
            }

            IllegalStateException var14 = new IllegalStateException();
            throw var14;
        }
    }

    public int U() {
        int var1 = o;
        var1 ^= -1511595815;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var25;
        var2 = (var25 = var17 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -1125541621;
            var1 *= 1167893927;
            var1 *= -1641874315;
            var1 ^= 184777031;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            } else {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            }
        } else {
            var1 &= -896920579;
            var1 += 759682441;
            var1 |= 1492328637;
            var1 ^= 785214005;
            IntSupplier var11 = this.t;
            return var11.getAsInt();
        }
    }

    public boolean H() {
        int var1 = o;
        var1 ^= -456800139;
        int var2 = System.identityHashCode(this);
        long var28 = var2;
        long var4 = var28 + 1L;
        var4 = var28 * var4;
        long var29 = var4 & 1L;
        long var42;
        var2 = (var42 = var29 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 2002236281;
            var1 ^= 1877698403;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                RuntimeException var36 = new RuntimeException();
                throw var36;
            }
        } else {
            var1 *= -2023070807;
            var1 += 132935883;
            var1 -= 1737259868;
            var1 *= 1176425777;
            var1 ^= -1886453864;
            Integer var37 = var1;
            if (var37 != null) {
                Consumer var38 = this.u;
                boolean var39;
                if (var38 != null) {
                    var1 |= 1340760734;
                    var1 += -1551111876;
                    var1 -= -1959639974;
                    var1 >>= 13;
                    var1 ^= 104248814;
                    var39 = true;
                    var1 ^= -1074275567;
                    var1 *= 572232197;
                    var1 ^= -2002850200;
                } else {
                    var1 &= -1410547;
                    var1 ^= -1727043111;
                    var39 = false;
                    var1 ^= 819144219;
                    var1 ^= 164235780;
                    var1 ^= 1950274581;
                }

                Integer var26 = var1;
                if (var26 != null) {
                    return var39;
                }
            }
        }

        IllegalStateException var27 = new IllegalStateException();
        throw var27;
    }

    public void B() {
        label58: {
            int var1 = o;
            var1 ^= -1326757711;
            int var2 = System.identityHashCode(this);
            int var3 = var2 + 1;
            var3 = var2 * var3;
            int var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 != 0) {
                var1 *= -603349939;
                var1 -= -365756181;
                var1 *= 21004549;
                var1 ^= -1911847808;
            } else {
                var1 = switch (var1) {
                    case -1475402780 -> var1 ^ 1601305183;
                    default -> var1 ^ 1835617497;
                    case 906493221 -> {
                        var1 ^= -951817884;
                        var1 -= -436270151;
                        var1 *= 1976910121;
                        var1 ^= 1246962796;
                        yield var1 ^ 1892706651;
                    }
                };
                Consumer var67 = this.u;
                if (var67 == null) {
                    var1 |= -516749956;
                    var1 &= -699205235;
                    var1 |= 1301234090;
                    var1 &= -301679783;
                    var1 ^= 1638809134;
                    return;
                }
                var1 = switch (var1) {
                    case -1548324876 -> var1 ^ -1183773021;
                    case -816895745 -> {
                        var1 *= -1075177765;
                        var1 += -1593763138;
                        var1 &= -934090423;
                        var1 |= 1749991312;
                        yield var1 ^ -1799275801;
                    }
                    default -> var1 ^ 844753836;
                };
                du var68 = this.pf;
                var3 = var68.b();
                Consumer var71 = this.u;
                du var5 = this.pf;
                var71.accept(var5);
                du var72 = this.pf;
                long var77 = var2;
                long var7 = var77 + 1L;
                var7 = var77 * var7;
                long var78 = var7 & 1L;
                long var82;
                var2 = (var82 = var78 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                if (var2 == 0) {
                    var1 >>= 17;
                    var1 ^= -1943542822;
                    var1 ^= -1981296358;
                    var2 = var1 + 1;
                    var2 = var1 * var2;
                    int var79 = var1 + 2;
                    var2 *= var79;
                    int var80 = var1 + 3;
                    var2 *= var80;
                    var2 &= 7;
                    if (var2 != 0) {
                        break label58;
                    }

                    var2 = var72.b();
                    if (var2 != var3) {
                        var1 ^= -372241646;
                        var1 &= -1306568488;
                        var1 *= 532969747;
                        var1 -= -1819166347;
                        var1 ^= -1088679495;
                        long var59 = var1;
                        long var73 = var59 + 1L;
                        long var74 = var59 * var73;
                        long var6 = var59 + 2L;
                        long var75 = var74 * var6;
                        long var60 = var59 + 3L;
                        long var76 = var75 * var60;
                        long var61 = var76 & 7L;
                        long var83;
                        var2 = (var83 = var61 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            break label58;
                        }

                        this.lU();
                        var1 >>= 17;
                        var1 ^= -1839706533;
                        var1 ^= -1769933917;
                    } else {
                        switch (var1) {
                            case -1478696984:
                                var1 ^= 368639053;
                                break;
                            case -91898393:
                            default:
                                var1 ^= 1093205130;
                                break;
                            case 96472207:
                                var1 >>= 3;
                                var1 -= 2013567902;
                                var1 >>>= 3;
                                var1 ^= 365876203;
                        }
                    }

                    return;
                }

                var1 *= -259243445;
                var1 += 1824051489;
                var1 ^= 1043888570;
                var1 ^= 435920071;
            }

            Integer var51 = var1;
            if (var51 != null) {
                IllegalArgumentException var52 = new IllegalArgumentException();
                throw var52;
            }
        }

        IllegalArgumentException var44 = new IllegalArgumentException();
        throw var44;
    }

    public String I() {
        int var1 = o;
        var1 ^= -953246028;
        int var2 = System.identityHashCode(this);
        du var3 = this.pf;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var18;
        var2 = (var18 = var4 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= -963712763;
            var1 ^= 1987526679;
            return var3.lU();
        } else {
            var1 &= 759552263;
            var1 ^= 1776793461;
            var1 ^= -1932262903;
            RuntimeException var12 = new RuntimeException();
            throw var12;
        }
    }

    public void g(String var1) {
        label56: {
            int var29;
            label55: {
                var29 = o;
                var29 ^= 1960198854;
                int var3 = System.identityHashCode(this);
                du var4 = this.pf;
                int var52 = var4.b();
                int var5 = var3 + 1;
                var5 = var3 * var5;
                int var6 = var3 + 2;
                var5 *= var6;
                var6 = var3 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    var29 |= 1323337799;
                    var29 ^= 1281945207;
                    du var63 = this.pf;
                    int var64 = (var63.F(var1)) ? 1 : 0;
                    if (var64 == 0) {
                        var29 *= -1865342811;
                        var29 *= -34895513;
                        var29 ^= 2045800727;
                        break label55;
                    }
                    var29 = switch (var29) {
                        case -1894107954 -> var29 ^ 1004632851;
                        case -1299050208 -> {
                            var29 ^= 1712991225;
                            var29 <<= 6;
                            var29 |= 438871502;
                            var29 &= 882368443;
                            yield var29 ^ -633810402;
                        }
                        default -> var29 ^ -1717118377;
                    };
                    du var65 = this.pf;
                    var64 = var65.b();
                    var6 = var3 + 1;
                    var6 = var3 * var6;
                    int var7 = var3 + 2;
                    var6 *= var7;
                    var3 += 3;
                    var6 *= var3;
                    var3 = var6 & 7;
                    if (var3 == 0) {
                        var29 += -1587980607;
                        var29 >>>= 29;
                        var29 ^= 485456574;
                        if (var64 != var52) {
                            var29 |= 1669219344;
                            var29 -= -2141575886;
                            var29 |= 295291434;
                            var29 ^= -1709046912;
                            var3 = var29 + 1;
                            var3 = var29 * var3;
                            int var53 = var29 + 2;
                            var3 *= var53;
                            int var54 = var29 + 3;
                            var3 *= var54;
                            var3 &= 7;
                            if (var3 != 0) {
                                break label56;
                            }

                            this.lU();
                            var29 -= 78746745;
                            var29 |= 884003156;
                            var29 += -2007577325;
                            var29 ^= 233615231;
                        } else {
                            switch (var29) {
                                case -1228236343:
                                    var29 ^= 2111987470;
                                    break label55;
                                case 485456570:
                                    var29 ^= -1652037068;
                                    var29 ^= 1909563129;
                                    break label55;
                                case 943946842:
                                default:
                                    var29 ^= 1127702693;
                            }
                        }
                        break label55;
                    }

                    var29 *= 863070873;
                    var29 |= -622302631;
                    var29 ^= -1743536716;
                } else {
                    switch (var29) {
                        case -1695795905:
                        default:
                            var29 ^= -146562602;
                            break;
                        case -231016622:
                            var29 -= 992397698;
                            var29 &= -1385604919;
                            var29 ^= -532867271;
                            var29 ^= 668228912;
                            break;
                        case 1988563828:
                            var29 ^= 939932634;
                    }
                }

                long var36 = var29;
                long var55 = var36 + 1L;
                long var56 = var36 * var55;
                long var74 = var36 + 2L;
                long var57 = var56 * var74;
                long var37 = var36 + 3L;
                long var58 = var57 * var37;
                long var38 = var58 & 7L;
                long var75;
                var29 = (var75 = var38 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                if (var29 == 0) {
                    IllegalArgumentException var41 = new IllegalArgumentException();
                    throw var41;
                }
                break label56;
            }

            long var49 = var29;
            long var67 = var49 + 1L;
            var67 = var49 * var67;
            var49 = var67 & 1L;
            long var76;
            int var51 = (var76 = var49 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
            if (var51 == 0) {
                return;
            }
        }

        RuntimeException var40 = new RuntimeException();
        throw var40;
    }

    public String X() {
        int var1 = o;
        var1 ^= 1590468690;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var32;
        var2 = (var32 = var19 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= -1291279207;
            var1 -= 1871149042;
            var1 ^= -977558514;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            var1 = switch (var1) {
                case -833808934 -> var1 ^ -577926615;
                case -668985914 -> {
                    var1 *= -773425683;
                    yield var1 ^ 143458661;
                }
                default -> var1 ^ -1623224119;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return this.S;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    @Override
    public Object yW() {
        int var1 = o;
        var1 ^= 1246431710;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 &= -1630729046;
            var1 ^= 1325204447;
            AssertionError var18 = new AssertionError();
            throw var18;
        } else {
            var1 = switch (var1) {
                default -> var1 ^ -1581245935;
                case -861422518 -> {
                    var1 -= -176079282;
                    var1 += 1985223696;
                    var1 -= -1735639148;
                    var1 <<= 23;
                    yield var1 ^ 1725945638;
                }
                case 3292285 -> var1 ^ 500316874;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                du var12 = this.pf;
                return var12.lU();
            } else {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            }
        }
    }

    @Override
    public boolean YT(Object var1) {
        label113: {
            int var2 = o;
            var2 ^= -1695305744;
            int var3 = System.identityHashCode(this);
            int var4 = (var1 instanceof String) ? 1 : 0;
            Integer var5 = var3;
            if (var5 == null) {
                var2 |= 1972692298;
                var2 |= -432185940;
                var2 ^= -1338561274;
            } else {
                var2 = switch (var2) {
                    case 471800420 -> {
                        var2 += 1832119793;
                        var2 &= 1380026880;
                        var2 ^= 48911720;
                        var2 += 1610521063;
                        yield var2 ^ -1590643855;
                    }
                    default -> var2 ^ -1176689741;
                    case 1184228690 -> var2 ^ -619799449;
                };
                int var90 = var2 + 1;
                var90 = var2 * var90;
                var90 &= 1;
                if (var90 != 0) {
                    break label113;
                }

                if (var4 == 0) {
                    long var64 = switch (var2) {
                        case -1013365698 -> {
                            var2 += 1271362346;
                            var2 ^= 1611331730;
                            yield var2 ^ 2036743817;
                        }
                        default -> var2 ^ 1340395817;
                        case 686820725 -> var2 ^ -1416848527;
                    };
                    long var86 = var64 + 1L;
                    long var87 = var64 * var86;
                    long var113 = var64 + 2L;
                    long var88 = var87 * var113;
                    long var65 = var64 + 3L;
                    long var89 = var88 * var65;
                    long var66 = var89 & 7L;
                    long var121;
                    var2 = (var121 = var66 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        return false;
                    }
                    break label113;
                }

                var2 |= -1338649032;
                var2 |= 1213632731;
                var2 += 1129276394;
                var2 &= 248300690;
                var2 ^= 932264187;
                var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label113;
                }

                String var81 = (String)var1;
                long var93 = var3;
                long var7 = var93 + 1L;
                var7 = var93 * var7;
                long var94 = var7 & 1L;
                long var122;
                var90 = (var122 = var94 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                if (var90 == 0) {
                    var2 = switch (var2) {
                        default -> var2 ^ -26889759;
                        case 970799227 -> {
                            var2 |= 1982899479;
                            var2 >>>= 7;
                            var2 -= 1132498325;
                            yield var2 ^ 1234531821;
                        }
                        case 1272768123 -> var2 ^ -171432282;
                    };
                    var90 = var2 + 1;
                    var90 = var2 * var90;
                    var90 &= 1;
                    if (var90 != 0) {
                        break label113;
                    }

                    var2 &= 86182056;
                    var2 ^= 1326203302;
                    du var99 = this.pf;
                    var90 = var99.b();
                    du var6 = this.pf;
                    int var82 = (var6.F(var81)) ? 1 : 0;
                    Integer var107 = var3;
                    if (var107 != null) {
                        var2 |= 2134056680;
                        var2 ^= 388327168;
                        var2 ^= 211553003;
                        if (var82 == 0) {
                            var2 -= -725670393;
                            var2 &= 981057278;
                            var2 |= 1881360103;
                            var2 ^= -1058642007;
                            long var110 = var2;
                            long var117 = var110 + 1L;
                            var117 = var110 * var117;
                            long var10 = var110 + 2L;
                            var117 *= var10;
                            long var111 = var110 + 3L;
                            var117 *= var111;
                            long var112 = var117 & 7L;
                            long var123;
                            var82 = (var123 = var112 - 0L) == 0L ? 0 : (var123 < 0L ? -1 : 1);
                            if (var82 == 0) {
                                return false;
                            }
                            break label113;
                        }
                        var2 = switch (var2) {
                            case 486531983 -> var2 ^ 1253688555;
                            default -> var2 ^ 1461907008;
                            case 1686516229 -> {
                                var2 -= 915705001;
                                yield var2 ^ -23660277;
                            }
                        };
                        du var83 = this.pf;
                        var82 = var83.b();
                        long var108 = var3;
                        long var8 = var108 + 1L;
                        var8 = var108 * var8;
                        long var109 = var8 & 1L;
                        long var124;
                        var3 = (var124 = var109 - 0L) == 0L ? 0 : (var124 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            var2 |= -1495236228;
                            var2 *= 2015767039;
                            var2 ^= 1833720293;
                            var2 ^= -2127862074;
                            if (var82 != var90) {
                                var2 ^= -722779446;
                                var2 ^= 1258363879;
                                long var70 = var2;
                                long var101 = var70 + 1L;
                                long var102 = var70 * var101;
                                long var71 = var102 & 1L;
                                long var125;
                                var3 = (var125 = var71 - 0L) == 0L ? 0 : (var125 < 0L ? -1 : 1);
                                if (var3 != 0) {
                                    break label113;
                                }

                                this.lU();
                                switch (var2) {
                                    case -886572456:
                                        var2 ^= -1142107957;
                                        break;
                                    case 147168911:
                                        var2 &= 96057747;
                                        var2 &= 408256212;
                                        var2 ^= 2105303949;
                                        break;
                                    case 1714396293:
                                    default:
                                        var2 ^= -1031501597;
                                }
                            } else {
                                var2 ^= 2049491342;
                                var2 -= -149453293;
                                var2 &= -2080054823;
                                var2 ^= -109446380;
                            }

                            return true;
                        }

                        switch (var2) {
                            case -748200873:
                                var2 *= 909540853;
                                var2 ^= -774698837;
                                break;
                            case -649132661:
                            default:
                                var2 ^= 247972334;
                                break;
                            case 2031744023:
                                var2 ^= 700009315;
                        }
                    } else {
                        switch (var2) {
                            case 528579724:
                            default:
                                var2 ^= 1984493921;
                                break;
                            case 1234945201:
                                var2 ^= 1773828469;
                                break;
                            case 1261324718:
                                var2 &= 263892376;
                                var2 &= 459833928;
                                var2 &= -1556426294;
                                var2 ^= 1285608160;
                        }
                    }
                } else {
                    switch (var2) {
                        case -982768798:
                            var2 ^= -378369885;
                            break;
                        case 426181184:
                        default:
                            var2 ^= -660103428;
                            break;
                        case 970799227:
                            var2 |= -627887699;
                            var2 ^= -1269306601;
                    }
                }
            }

            long var73 = var2;
            long var103 = var73 + 1L;
            long var104 = var73 * var103;
            long var115 = var73 + 2L;
            long var105 = var104 * var115;
            long var74 = var73 + 3L;
            long var106 = var105 * var74;
            long var75 = var106 & 7L;
            long var126;
            var3 = (var126 = var75 - 0L) == 0L ? 0 : (var126 < 0L ? -1 : 1);
            if (var3 == 0) {
                RuntimeException var77 = new RuntimeException();
                throw var77;
            }
        }

        RuntimeException var68 = new RuntimeException();
        throw var68;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2001162844;
        int var2 = xB.nu;
        int var4 = of_2.kj(var3, var1, var2);
        o = var4;
    }

    @Override
    public Object a() {
        return this.X();
    }

    @Override
    public void t(Object var1) {
        this.g((String)var1);
    }

    @Override
    public Object cQ() {
        return this.I();
    }
}
