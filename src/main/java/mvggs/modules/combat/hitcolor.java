package mvggs.modules.combat;

import mvggs.modules.hud.hudstyle;

import dev.aurap.hub.*;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;

public final class hitcolor extends Yn {
    private final r_2 un;
    private final Fk C;
    private final Uq N;
    private int V;
    private boolean wf;
    public static final int iJ;

    public hitcolor() {
        super("hit_color", "Hit Color", AJ.COMBAT);
        AJ var1 = AJ.COMBAT;

        Fb var2 = Fb.THEME;
        r_2 var3 = new r_2("source", "Color", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.un = var5;
        Fk var6 = new Fk("color", "Custom Color", -50340, false);
        BooleanSupplier var16 = () -> {
            int var1x = iJ;
            var1x ^= 1990171061;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.un;
            Fb var4x = Fb.CUSTOM;
            int var5x = var2x + 1;
            var5x = var2x * var5x;
            int var6x = var2x + 2;
            var5x *= var6x;
            var2x += 3;
            var5x *= var2x;
            var2x = var5x & 7;
            if (var2x != 0) {
                var1x -= -905133619;
                var1x ^= -2133071881;
                long var26 = var1x;
                long var7x = var26 + 1L;
                var7x = var26 * var7x;
                long var27 = var7x & 1L;
                long var29;
                var2x = (var29 = var27 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
                if (var2x == 0) {
                    AssertionError var20 = new AssertionError();
                    throw var20;
                }
            } else {
                var1x -= -676189757;
                var1x >>>= 14;
                var1x ^= -361013001;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var1x = var2x & 1;
                if (var1x == 0) {
                    return var3x.TJ(var4x);
                }
            }

            RuntimeException var16x = new RuntimeException();
            throw var16x;
        };
        xB var7 = var6.Pt(var16);
        Fk var8 = (Fk)var7;
        xB var9 = this.vn(var8);
        Fk var10 = (Fk)var9;
        this.C = var10;
        Uq var11 = new Uq("strength", "Strength", 0.6F, 0.1F, 1.0F);
        Uq var12 = var11.W(0.05F);
        xB var13 = this.vn(var12);
        Uq var14 = (Uq)var13;
        this.N = var14;
        this.dy("Hurt entities flash in your theme color instead of vanilla red.");
        wD<sE> var15 = (sE var1x) -> {
            int var2x = iJ;
            var2x ^= -507335416;
            int var3x = System.identityHashCode(this);
            long var17 = var3x;
            long var5x = var17 + 1L;
            var5x = var17 * var5x;
            long var18 = var5x & 1L;
            long var25;
            var3x = (var25 = var18 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var3x == 0) {
                var2x ^= 1443998336;
                var2x -= -1545298468;
                var2x += 67044484;
                var2x ^= 1002388519;
                var3x = var2x << 15;
                var3x ^= -716382603;
                this.Q(var3x);
            } else {
                var2x += 1478478535;
                var2x ^= -914922785;
                var3x = var2x + 1;
                var3x = var2x * var3x;
                var2x = var3x & 1;
                if (var2x != 0) {
                    AssertionError var12x = new AssertionError();
                    throw var12x;
                } else {
                    UnsupportedOperationException var11x = new UnsupportedOperationException();
                    throw var11x;
                }
            }
        };
        this.iI(sE.class, var15);
    }

    @Override
    protected void eF() {
        int var1 = iJ;
        var1 ^= 1314241629;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var37;
        var2 = (var37 = var21 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        if (var2 == 0) {
            long var23 = switch (var1) {
                case -1526649206 -> {
                    var1 -= -1172628012;
                    var1 += 382472123;
                    var1 &= -2134969063;
                    var1 += 1045133756;
                    yield var1 ^ 749010078;
                }
                case 525691908 -> var1 ^ -597170358;
                default -> var1 ^ 89085431;
            };
            var4 = var23 + 1L;
            var4 = var23 * var4;
            var6 = var23 + 2L;
            var4 *= var6;
            long var24 = var23 + 3L;
            var4 *= var24;
            long var25 = var4 & 7L;
            long var38;
            var2 = (var38 = var25 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var2 == 0) {
                this.wf = false;
                return;
            }
        } else {
            var1 = switch (var1) {
                case -1526649206 -> {
                    var1 -= -309967377;
                    yield var1 ^ 70820333;
                }
                default -> var1 ^ 827276093;
                case 818700905 -> var1 ^ 1704282570;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            }
        }

        IllegalStateException var17 = new IllegalStateException();
        throw var17;
    }

    @Override
    protected void J() {
        label56: {
            int var1 = iJ;
            var1 ^= -1330572325;
            int var2 = System.identityHashCode(this);
            Integer var3 = var2;
            if (var3 == null) {
                var1 ^= 814885641;
                var1 &= -1097262043;
                var1 += -1640130034;
                var1 ^= 1207306393;
            } else {
                label55: {
                    var1 |= -1321155971;
                    var1 &= 653329516;
                    var1 &= 780561483;
                    var1 ^= -1819573923;
                    boolean var50 = this.wf;
                    if (var50) {
                        var1 >>>= 13;
                        var1 += -35798040;
                        var1 *= 1112985805;
                        var1 ^= -1563813505;
                        var3 = var1;
                        if (var3 == null) {
                            break label56;
                        }

                        boolean var52 = i_2.ZC(-1291911168);
                        long var4 = var2;
                        long var6 = var4 + 1L;
                        var6 = var4 * var6;
                        long var8 = var4 + 2L;
                        var6 *= var8;
                        var4 += 3L;
                        var6 *= var4;
                        var4 = var6 & 7L;
                        long var62;
                        var2 = (var62 = var4 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            var1 -= -783582356;
                            var1 ^= 544564501;
                            break label55;
                        }

                        var1 |= -1940496231;
                        var1 &= 137920565;
                        var1 ^= 1675810423;
                        Integer var45 = var1;
                        if (var45 == null) {
                            break label56;
                        }

                        if (var52) {
                            var1 -= -1913932912;
                            var1 |= -1414337483;
                            var1 ^= -856730997;
                            var1 ^= -1531175465;
                            this.wf = false;
                            var1 &= -1275780383;
                            var1 *= -702130577;
                            var1 |= -545218208;
                            var1 |= -552735620;
                            var1 ^= -2126553427;
                        } else {
                            switch (var1) {
                                case -1514846460:
                                default:
                                    var1 ^= 1413859266;
                                    break;
                                case -728684536:
                                    var1 ^= 1753922647;
                                    break;
                                case 1811600998:
                                    var1 -= 377972878;
                                    var1 += -733693786;
                                    var1 >>>= 21;
                                    var1 ^= 2129698847;
                            }
                        }
                    } else {
                        var1 -= 1290519077;
                        var1 ^= 451878818;
                    }

                    long var37 = var1;
                    long var53 = var37 + 1L;
                    long var54 = var37 * var53;
                    long var38 = var54 & 1L;
                    long var63;
                    var1 = (var63 = var38 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return;
                    }
                    break label56;
                }
            }

            long var46 = var1;
            long var57 = var46 + 1L;
            var57 = var46 * var57;
            long var47 = var57 & 1L;
            long var64;
            var2 = (var64 = var47 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var49 = new IllegalArgumentException();
                throw var49;
            }
        }

        IllegalArgumentException var43 = new IllegalArgumentException();
        throw var43;
    }

    public int o() {
        label85: {
            int var1 = iJ;
            var1 ^= 2072765506;
            int var2 = System.identityHashCode(this);
            r_2 var3 = this.un;
            Fb var4 = Fb.CUSTOM;
            long var5 = var2;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var132;
            int var96 = (var132 = var5 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
            if (var96 != 0) {
                switch (var1) {
                    case -1864403307:
                        var1 *= 2083606467;
                        var1 <<= 17;
                        var1 ^= -1544515846;
                        break;
                    case -689486379:
                    default:
                        var1 ^= -438155683;
                        break;
                    case -254263845:
                        var1 ^= -942648381;
                }
            } else {
                label87: {
                    var1 |= -1933706265;
                    var1 |= -4879959;
                    var1 >>>= 24;
                    var1 ^= 1773560033;
                    int var97 = var1 + 1;
                    int var98 = var1 * var97;
                    int var6 = var1 + 2;
                    int var99 = var98 * var6;
                    var6 = var1 + 3;
                    int var100 = var99 * var6;
                    int var101 = var100 & 7;
                    if (var101 != 0) {
                        break label85;
                    }

                    boolean var66 = var3.TJ(var4);
                    int var74;
                    if (var66) {
                        var1 = switch (var1) {
                            case -1718243329 -> var1 ^ -498464244;
                            default -> var1 ^ -445818956;
                            case 1773559838 -> {
                                var1 += -175212505;
                                var1 -= 257486446;
                                var1 ^= 1818256626;
                                yield var1 ^ 330959388;
                            }
                        };
                        int var67 = var1 + 1;
                        int var68 = var1 * var67;
                        int var75 = var1 + 2;
                        int var69 = var68 * var75;
                        int var76 = var1 + 3;
                        int var70 = var69 * var76;
                        int var71 = var70 & 7;
                        if (var71 != 0) {
                            break label85;
                        }

                        Fk var72 = this.C;
                        int var77 = var2 + 1;
                        int var78 = var2 * var77;
                        int var79 = var78 & 1;
                        if (var79 != 0) {
                            var1 ^= 1297078499;
                            var1 ^= 1115216163;
                            var1 *= 779948459;
                            var1 *= -102189561;
                            var1 ^= 1485854143;
                            break label87;
                        }

                        var1 += 1140503434;
                        var1 >>= 22;
                        var1 ^= 798676647;
                        var1 ^= 1428750442;
                        Integer var80 = var1;
                        if (var80 == null) {
                            break label85;
                        }

                        int var73 = var72.zz();
                        var74 = var73;
                        switch (var1) {
                            case -4023835:
                                var1 ^= -541336600;
                                break;
                            case 1711149048:
                            default:
                                var1 ^= -1049901080;
                                break;
                            case 2058606365:
                                var1 += 1875736531;
                                var1 *= -1292505545;
                                var1 ^= -82195219;
                                var1 >>= 27;
                                var1 ^= -679796305;
                        }
                    } else {
                        var1 >>>= 28;
                        var1 ^= -579553898;
                        var1 ^= 529387790;
                        int var81 = var1 + 1;
                        int var82 = var1 * var81;
                        int var83 = var82 & 1;
                        if (var83 != 0) {
                            break label85;
                        }

                        Ud var84 = Ud.Z();
                        var5 = var2;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var133;
                        int var105 = (var133 = var5 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                        if (var105 != 0) {
                            switch (var1) {
                                case -2057703275:
                                    var1 ^= 84287303;
                                    break label87;
                                case -1888788030:
                                default:
                                    var1 ^= -1235171629;
                                    break label87;
                                case -1023843170:
                                    var1 ^= -737063093;
                                    var1 *= 1653880277;
                                    var1 |= 92224499;
                                    var1 &= -152805471;
                                    var1 ^= 996840795;
                                    break label87;
                            }
                        }

                        var1 *= 455192347;
                        var1 ^= 9581879;
                        int var106 = var1 + 1;
                        int var107 = var1 * var106;
                        var6 = var1 + 2;
                        int var108 = var107 * var6;
                        var6 = var1 + 3;
                        int var109 = var108 * var6;
                        int var110 = var109 & 7;
                        if (var110 != 0) {
                            break label85;
                        }

                        NW var85 = var84.sP();
                        Yn var86 = var85.tG(hudstyle.class);
                        hudstyle var87 = (hudstyle)var86;
                        Oo var88 = var87.eo();
                        int var89 = var88.K();
                        var74 = var89;
                        var1 *= -166613467;
                        var1 ^= -1003790879;
                    }

                    long var90 = var1;
                    long var117 = var90 + 1L;
                    long var118 = var90 * var117;
                    long var91 = var118 & 1L;
                    long var134;
                    int var92 = (var134 = var91 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                    if (var92 != 0) {
                        break label85;
                    }

                    Uq var93 = this.N;
                    var5 = var2;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var9 = var5 + 2L;
                    var7 *= var9;
                    var5 += 3L;
                    var7 *= var5;
                    var5 = var7 & 7L;
                    long var135;
                    var2 = (var135 = var5 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        var1 ^= 1292608880;
                        var1 |= 102543278;
                        var1 |= -310707871;
                        var1 &= -1781926468;
                        var1 ^= 706134370;
                        Integer var53 = var1;
                        if (var53 != null) {
                            float var54 = var93.WM();
                            float var55 = 1.0F - var54;
                            return DP.Y(var74, var55);
                        }
                        break label85;
                    }

                    var1 -= -664830758;
                    var1 ^= 82118292;
                    var1 ^= 1808722200;
                }
            }

            RuntimeException var65 = new RuntimeException();
            throw var65;
        }

        IllegalArgumentException var63 = new IllegalArgumentException();
        throw var63;
    }

    private void Q(int var1) {
        int var3 = System.identityHashCode(this);
        int var4 = this.o();
        int var5 = (this.wf ? 1 : 0);
        Integer var6 = var3;
        if (var6 == null) {
            int var60 = var1 * -1600260611;
            var60 *= -344143491;
            var60 *= -201205633;
            var60 ^= 2111115909;
        } else {
            label98: {
                int var2 = var1 * 621686429;
                var2 += -963797248;
                var2 ^= 1070801958;
                long var80 = var2;
                long var8 = var80 + 1L;
                var8 = var80 * var8;
                long var81 = var8 & 1L;
                long var95;
                int var82 = (var95 = var81 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                label78:
                if (var82 == 0) {
                    if (var5 != 0) {
                        var2 ^= -1402033986;
                        var2 -= -266648799;
                        var2 ^= 785577363;
                        var5 = this.V;
                        long var83 = var3;
                        var8 = var83 + 1L;
                        var8 = var83 * var8;
                        long var10 = var83 + 2L;
                        var8 *= var10;
                        long var84 = var83 + 3L;
                        var8 *= var84;
                        long var85 = var8 & 7L;
                        long var96;
                        var82 = (var96 = var85 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                        if (var82 != 0) {
                            var2 ^= 528864599;
                            var2 ^= 64728203;
                            var2 &= -1480870000;
                            var2 ^= 210065642;
                            var2 ^= 469293468;
                            break label98;
                        }

                        var2 += 1790223571;
                        var2 ^= -339315116;
                        Integer var87 = var2;
                        if (var87 == null) {
                            break label78;
                        }

                        if (var4 == var5) {
                            var2 >>>= 19;
                            var2 *= -679428089;
                            var2 *= 1150188795;
                            var2 *= 1978233859;
                            var2 ^= -1547778564;
                            return;
                        }

                        var2 &= -1540919869;
                        var2 |= -1100235280;
                        var2 ^= -911327270;
                    } else {
                        var2 -= -287215724;
                        var2 &= -1342793347;
                        var2 ^= 984067996;
                        var2 -= 1530165539;
                        var2 ^= -1425852542;
                    }

                    Integer var74 = var2;
                    if (var74 != null) {
                        boolean var75 = i_2.ZC(var4);
                        Integer var88 = var3;
                        if (var88 == null) {
                            var2 *= -247528095;
                            var2 += 1029513075;
                            var2 += 1870796212;
                            var2 ^= -1855956951;
                            break label98;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ 1011867763;
                            case 1948683798 -> var2 ^ -168716489;
                            case 2009170472 -> {
                                var2 |= 696325386;
                                var2 &= -675716412;
                                var2 |= -724453025;
                                yield var2 ^ 97298014;
                            }
                        };
                        var88 = var2;
                        label69:
                        if (var88 != null) {
                            if (var75) {
                                var2 = switch (var2) {
                                    case -769843967 -> {
                                        var2 -= -1165840391;
                                        var2 ^= 287932875;
                                        var2 |= -2052377429;
                                        yield var2 ^ -305500485;
                                    }
                                    case 950599504 -> var2 ^ -1094619890;
                                    default -> var2 ^ 1407286655;
                                };
                                int var76 = var2 + 1;
                                var76 = var2 * var76;
                                var76 &= 1;
                                if (var76 != 0) {
                                    break label69;
                                }

                                this.V = var4;
                                var4 = var3 + 1;
                                var4 = var3 * var4;
                                var76 = var3 + 2;
                                var4 *= var76;
                                var3 += 3;
                                var4 *= var3;
                                var3 = var4 & 7;
                                if (var3 != 0) {
                                    var2 += 1854128983;
                                    var2 |= -1343025611;
                                    var2 ^= -368883247;
                                    break label98;
                                }

                                var2 *= -881779549;
                                var2 ^= 1989535239;
                                Integer var67 = var2;
                                if (var67 == null) {
                                    break label69;
                                }

                                this.wf = true;
                                var2 -= -172737962;
                                var2 >>= 1;
                                var2 &= -32689320;
                                var2 += -170659852;
                                var2 ^= 1646636671;
                            } else {
                                var2 *= -2069923901;
                                var2 ^= 1739993848;
                            }

                            return;
                        }
                    }
                }

                AssertionError var68 = new AssertionError();
                throw var68;
            }
        }

        IllegalArgumentException var64 = new IllegalArgumentException();
        throw var64;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 769411573;
        int var2 = Yn.C;
        int var4 = of_2.xF(var3, var1, var2);
        iJ = var4;
    }
}
