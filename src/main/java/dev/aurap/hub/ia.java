package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class ia extends xB {
    public static final int KY = -1;
    private static volatile sx MP;
    private final int Y;
    private int P;
    public static final int mf;

    public ia(String var1, String var2, int var3) {
        super(var1, var2);
        this.Y = var3;
        this.P = var3;
    }

    public static void c(sx var0) {
        int var1 = mf;
        var1 ^= -93104121;
        int var2 = System.identityHashCode(var0);
        Integer var13 = var2;
        if (var13 != null) {
            var1 -= 1295823376;
            var1 -= 1012201896;
            var1 -= -1142331870;
            var1 |= -738254516;
            var1 ^= -1798870053;
            int var14 = var1 + 1;
            var14 = var1 * var14;
            int var3 = var1 + 2;
            var14 *= var3;
            var3 = var1 + 3;
            var14 *= var3;
            var14 &= 7;
            if (var14 != 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            } else {
                MP = var0;
            }
        } else {
            var1 &= 1840759740;
            var1 ^= 1866226539;
            RuntimeException var7 = new RuntimeException();
            throw var7;
        }
    }

    public static int WW(String var0) {
        int var1 = mf;
        var1 ^= 2144292634;
        int var2 = System.identityHashCode(var0);
        Integer var17 = var2;
        if (var17 == null) {
            var1 *= 814909837;
            var1 ^= 1595259578;
            long var18 = var1;
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var6 = var18 + 2L;
            var4 *= var6;
            long var19 = var18 + 3L;
            var4 *= var19;
            long var20 = var4 & 7L;
            long var27;
            int var21 = (var27 = var20 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var21 == 0) {
                IllegalStateException var23 = new IllegalStateException();
                throw var23;
            } else {
                UnsupportedOperationException var22 = new UnsupportedOperationException();
                throw var22;
            }
        } else {
            var1 >>= 17;
            var1 += 1460318192;
            var1 &= 913309327;
            var1 &= -138440163;
            var1 ^= -86484716;
            sx var14 = MP;
            return var14.W(var0);
        }
    }

    public int JQ() {
        int var1 = mf;
        var1 ^= -1224452570;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var22;
        var2 = (var22 = var17 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        int var3 = of_2.EM;
        var1 ^= var3;
        var1 ^= -1767770242;
        var3 = of_2.K;
        var1 ^= var3;
        var1 ^= 1171836387;
        if (var2 != 0) {
            var1 &= 96449183;
            var1 ^= 932258529;
            UnsupportedOperationException var19 = new UnsupportedOperationException();
            throw var19;
        } else {
            var1 ^= 1871326554;
            var1 >>>= 25;
            var1 ^= 1168253485;
            return this.P;
        }
    }

    @Override
    public boolean ji() {
        int var1 = System.identityHashCode(this);
        return false;
    }

    public boolean r() {
        int var1 = mf;
        var1 ^= -2080767742;
        int var2 = System.identityHashCode(this);
        Integer var31 = var2;
        if (var31 != null) {
            var1 &= -195489070;
            var1 *= -182584595;
            var1 ^= -249509576;
            var31 = var1;
            label47:
            if (var31 != null) {
                int var33 = this.P;
                int var37;
                if (var33 != -1) {
                    var1 = switch (var1) {
                        case 116423854 -> var1 ^ -1288889440;
                        case 1430419490 -> {
                            var1 &= -1334635501;
                            var1 ^= 72730877;
                            var1 |= 661217988;
                            var1 += -411954160;
                            yield var1 ^ -1177832349;
                        }
                        default -> var1 ^ 2135211306;
                    };
                    long var34 = var1;
                    long var4 = var34 + 1L;
                    var4 = var34 * var4;
                    long var35 = var4 & 1L;
                    long var47;
                    var37 = (var47 = var35 - 0L) == 0L ? 0 : (var47 < 0L ? -1 : 1);
                    if (var37 != 0) {
                        break label47;
                    }

                    var37 = 1;
                    switch (var1) {
                        case -1785332483:
                            var1 ^= -823400424;
                            break;
                        case -1489388692:
                            var1 ^= 1306155034;
                            var1 &= 1752756211;
                            var1 += -435122383;
                            var1 ^= -421059325;
                            break;
                        case 794485350:
                        default:
                            var1 ^= 203610163;
                    }
                } else {
                    var1 = switch (var1) {
                        default -> var1 ^ 1251296787;
                        case -412966919 -> var1 ^ -971259818;
                        case 1430419490 -> {
                            var1 <<= 1;
                            yield var1 ^ 466669327;
                        }
                    };
                    var37 = 0;
                    var1 ^= -1887221017;
                    var1 >>= 24;
                    var1 ^= -1466542178;
                }

                int var3 = var1 + 1;
                var3 = var1 * var3;
                int var45 = var1 + 2;
                var3 *= var45;
                var45 = var1 + 3;
                var3 *= var45;
                var3 &= 7;
                if (var3 == 0) {
                    return (var37 != 0);
                }
            }
        } else {
            var1 ^= 31232127;
            var1 |= 934733767;
            var1 ^= -257590493;
            long var26 = var1;
            long var42 = var26 + 1L;
            var42 = var26 * var42;
            long var27 = var42 & 1L;
            long var48;
            var1 = (var48 = var27 - 0L) == 0L ? 0 : (var48 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var30 = new RuntimeException();
                throw var30;
            }
        }

        RuntimeException var29 = new RuntimeException();
        throw var29;
    }

    public void y(int var1) {
        label33: {
            int var2 = mf;
            var2 ^= 541046923;
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            int var6 = var4 + 2;
            var5 *= var6;
            var6 = var4 + 3;
            var5 *= var6;
            var5 &= 7;
            var6 = of_2.EM;
            var2 ^= var6;
            var2 ^= -1767770242;
            of_2.EM = -1767770242;
            var6 = of_2.K;
            var2 ^= var6;
            var2 ^= 1171836387;
            of_2.K = 1171836387;
            if (var5 != 0) {
                var2 &= 1107932120;
                var2 |= 229311954;
                var2 -= 231765495;
                var2 ^= -1440261537;
            } else {
                var2 >>= 13;
                var2 *= 492476783;
                var2 ^= 918088304;
                var5 = this.P;
                if (var1 == var5) {
                    var2 >>= 11;
                    var2 += -122283020;
                    var2 |= -1699931861;
                    var2 += -1989567611;
                    var2 ^= 870378709;
                    var5 = var1 + 1;
                    var5 = var1 * var5;
                    var6 = var1 + 2;
                    var5 *= var6;
                    var6 = var1 + 3;
                    var5 *= var6;
                    var5 &= 7;
                    if (var5 == 0) {
                        return;
                    }
                    break label33;
                }

                var2 -= 1238871737;
                var2 ^= -1764996131;
                var5 = var1 + 1;
                var5 = var1 * var5;
                var6 = var1 + 2;
                var5 *= var6;
                int var3 = var1 + 3;
                var5 *= var3;
                var3 = var5 & 7;
                if (var3 != 0) {
                    break label33;
                }

                this.P = var1;
                long var35 = var4;
                long var48 = var35 + 1L;
                long var49 = var35 * var48;
                long var7 = var35 + 2L;
                long var50 = var49 * var7;
                long var36 = var35 + 3L;
                long var51 = var50 * var36;
                long var37 = var51 & 7L;
                long var63;
                var3 = (var63 = var37 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var2 >>= 30;
                    var2 ^= -1307780311;
                    this.lU();
                    return;
                }

                var2 *= 1444665769;
                var2 ^= 1264814590;
            }

            UnsupportedOperationException var25 = new UnsupportedOperationException();
            throw var25;
        }

        IllegalStateException var33 = new IllegalStateException();
        throw var33;
    }

    public Integer qt() {
        int var1 = mf;
        var1 ^= 412848843;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var33;
        var2 = (var33 = var20 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 1944040415;
            var1 += -107699736;
            var1 ^= 2104171006;
            long var22 = var1;
            var4 = var22 + 1L;
            var4 = var22 * var4;
            long var23 = var4 & 1L;
            long var34;
            var2 = (var34 = var23 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            }
        } else {
            var1 += 878150744;
            var1 <<= 27;
            var1 ^= -741282638;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                var1 = this.P;
                return var1;
            }
        }

        UnsupportedOperationException var16 = new UnsupportedOperationException();
        throw var16;
    }

    public void EM(Integer var1) {
        int var2 = mf;
        var2 ^= -1537153975;
        int var3 = System.identityHashCode(this);
        long var20 = var3;
        long var5 = var20 + 1L;
        var5 = var20 * var5;
        long var7 = var20 + 2L;
        var5 *= var7;
        long var21 = var20 + 3L;
        var5 *= var21;
        long var22 = var5 & 7L;
        long var28;
        var3 = (var28 = var22 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 -= 1680596127;
            var2 <<= 19;
            var2 -= 1603516711;
            var2 ^= 1977437322;
            var3 = var1;
            this.y(var3);
        } else {
            switch (var2) {
                case -1231117153:
                    var2 ^= -884650467;
                    break;
                case 855259798:
                default:
                    var2 ^= -1022151511;
                    break;
                case 1288849417:
                    var2 -= 1731304243;
                    var2 += -1950300497;
                    var2 ^= 1652779746;
            }

            IllegalArgumentException var15 = new IllegalArgumentException();
            throw var15;
        }
    }

    public Integer v() {
        int var1 = mf;
        var1 ^= 505206247;
        int var2 = System.identityHashCode(this);
        int var3 = this.Y;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var24;
        var2 = (var24 = var4 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 &= 2080259381;
            var1 >>>= 25;
            var1 ^= -44344282;
            AssertionError var18 = new AssertionError();
            throw var18;
        } else {
            var1 |= 1046279899;
            var1 <<= 10;
            var1 ^= -456985554;
            return var3;
        }
    }

    @Override
    public Object yW() {
        label62: {
            int var31;
            String var46;
            label61: {
                var31 = mf;
                var31 ^= 1670737846;
                int var2 = System.identityHashCode(this);
                long var3 = var2;
                long var5 = var3 + 1L;
                var5 = var3 * var5;
                long var41 = var5 & 1L;
                long var59;
                int var42 = (var59 = var41 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                if (var42 != 0) {
                    switch (var31) {
                        case -1960328202:
                            var31 &= -659150140;
                            var31 ^= 1981151374;
                            break;
                        case 344911410:
                            var31 ^= -1461790128;
                            break;
                        case 1632580840:
                        default:
                            var31 ^= 310523334;
                    }
                } else {
                    var31 *= -460715021;
                    var31 &= -2006672155;
                    var31 &= 715353979;
                    var31 ^= -2139952299;
                    int var43 = this.P;
                    if (var43 == -1) {
                        var31 = switch (var31) {
                            case -2139951275 -> {
                                var31 |= 1653714768;
                                yield var31 ^ -707830307;
                            }
                            default -> var31 ^ 2103545890;
                            case 1832824127 -> var31 ^ 1995494871;
                        };
                        var46 = "none";
                        var31 &= 636359283;
                        var31 |= 937021376;
                        var31 ^= 791110073;
                        break label61;
                    }
                    var31 = switch (var31) {
                        case -2139951275 -> {
                            var31 &= 1278303076;
                            var31 -= 885915749;
                            var31 |= 1269483944;
                            yield var31 ^ 1120111190;
                        }
                        default -> var31 ^ 1901213234;
                        case 679837241 -> var31 ^ 966172083;
                    };
                    Integer var4 = var31;
                    if (var4 == null) {
                        break label62;
                    }

                    sx var47 = MP;
                    int var51 = this.P;
                    Integer var37 = var2;
                    if (var37 != null) {
                        var31 |= 1028133697;
                        var31 ^= -619230521;
                        long var6 = var31;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var60;
                        int var38 = (var60 = var6 - 0L) == 0L ? 0 : (var60 < 0L ? -1 : 1);
                        if (var38 != 0) {
                            break label62;
                        }

                        String var39 = var47.s(var51);
                        var46 = var39;
                        switch (var31) {
                            case -1687849899:
                            default:
                                var31 ^= 1574940286;
                                break label61;
                            case -1469538955:
                                var31 ^= -1981150003;
                                break label61;
                            case 1719540014:
                                var31 <<= 13;
                                var31 ^= -604012935;
                                break label61;
                        }
                    }

                    var31 |= -1587577190;
                    var31 ^= 1464632817;
                }

                long var24 = var31;
                long var44 = var24 + 1L;
                long var45 = var24 * var44;
                long var25 = var45 & 1L;
                long var61;
                var31 = (var61 = var25 - 0L) == 0L ? 0 : (var61 < 0L ? -1 : 1);
                if (var31 == 0) {
                    AssertionError var27 = new AssertionError();
                    throw var27;
                }
                break label62;
            }

            long var48 = var31;
            long var54 = var48 + 1L;
            var54 = var48 * var54;
            var48 = var54 & 1L;
            long var62;
            int var40 = (var62 = var48 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
            if (var40 == 0) {
                return var46;
            }
        }

        RuntimeException var36 = new RuntimeException();
        throw var36;
    }

    @Override
    public boolean YT(Object var1) {
        label139: {
            int var2 = mf;
            var2 ^= -402562296;
            int var3 = System.identityHashCode(this);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            int var5 = var3 + 2;
            var4 *= var5;
            var5 = var3 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                var2 ^= -2084867837;
                var2 ^= 49216294;
            } else {
                var2 -= -1110483979;
                var2 -= -120680642;
                var2 |= 463346812;
                var2 ^= -8225816;
                long var101 = var2;
                long var6 = var101 + 1L;
                var6 = var101 * var6;
                long var102 = var6 & 1L;
                long var181;
                var4 = (var181 = var102 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label139;
                }

                int var104 = (var1 instanceof Number) ? 1 : 0;
                if (var104 != 0) {
                    var2 |= -1119651129;
                    var2 ^= -1552164851;
                    Integer var105 = var2;
                    if (var105 == null) {
                        break label139;
                    }

                    Number var106 = (Number)var1;
                    long var125 = var3;
                    long var7 = var125 + 1L;
                    var7 = var125 * var7;
                    long var9 = var125 + 2L;
                    var7 *= var9;
                    long var126 = var125 + 3L;
                    var7 *= var126;
                    long var127 = var7 & 7L;
                    long var182;
                    var5 = (var182 = var127 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var2 >>>= 22;
                        var2 ^= -1243703026;
                        long var129 = var2;
                        var7 = var129 + 1L;
                        var7 = var129 * var7;
                        long var130 = var7 & 1L;
                        long var183;
                        var5 = (var183 = var130 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            var104 = var106.intValue();
                            this.y(var104);
                            return true;
                        }
                        break label139;
                    }

                    var2 |= 1721442763;
                    var2 ^= 1735800365;
                    var2 ^= -1741728613;
                } else {
                    var2 = switch (var2) {
                        case -1541568619 -> {
                            var2 <<= 20;
                            var2 += -951200352;
                            var2 += 1285988181;
                            var2 &= 510355723;
                            yield var2 ^ -1858270109;
                        }
                        default -> var2 ^ -103889287;
                        case 560184282 -> var2 ^ -1194039069;
                    };
                    long var108 = var2;
                    var6 = var108 + 1L;
                    var6 = var108 * var6;
                    long var109 = var6 & 1L;
                    long var184;
                    var104 = (var184 = var109 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                    if (var104 != 0) {
                        break label139;
                    }

                    int var111 = (var1 instanceof String) ? 1 : 0;
                    long var132 = var3;
                    long var172 = var132 + 1L;
                    var172 = var132 * var172;
                    long var180 = var132 + 2L;
                    var172 *= var180;
                    long var133 = var132 + 3L;
                    var172 *= var133;
                    long var134 = var172 & 7L;
                    long var185;
                    var5 = (var185 = var134 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        switch (var2) {
                            case -1816892900:
                            default:
                                var2 ^= 1769726480;
                                break;
                            case -1652724638:
                                var2 &= -184602237;
                                var2 |= 1319894295;
                                var2 ^= 1595521146;
                                break;
                            case -948630356:
                                var2 ^= 893234738;
                        }
                    } else {
                        var2 >>>= 20;
                        var2 -= -14746195;
                        var2 &= 106398223;
                        var2 ^= -335398792;
                        if (var111 == 0) {
                            long var81 = switch (var2) {
                                default -> var2 ^ 1846934370;
                                case -331138958 -> {
                                    var2 |= 2130344203;
                                    var2 >>= 17;
                                    var2 ^= -921643008;
                                    var2 &= -570080256;
                                    yield var2 ^ -1716814331;
                                }
                                case -295926849 -> var2 ^ -1536047024;
                            };
                            long var120 = var81 + 1L;
                            long var121 = var81 * var120;
                            var6 = var81 + 2L;
                            long var122 = var121 * var6;
                            long var82 = var81 + 3L;
                            long var123 = var122 * var82;
                            long var83 = var123 & 7L;
                            long var186;
                            var2 = (var186 = var83 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                            if (var2 == 0) {
                                return false;
                            }
                            break label139;
                        }

                        var2 >>>= 5;
                        var2 >>>= 17;
                        var2 ^= -928983538;
                        String var112 = (String)var1;
                        var5 = var3 + 1;
                        var5 = var3 * var5;
                        int var153 = var3 + 2;
                        var5 *= var153;
                        int var154 = var3 + 3;
                        var5 *= var154;
                        var5 &= 7;
                        if (var5 == 0) {
                            var2 += 1762802935;
                            var2 >>= 5;
                            var2 -= -2015312138;
                            var2 ^= 384539450;
                            Integer var141 = var2;
                            if (var141 == null) {
                                break label139;
                            }

                            var2 ^= -1885956699;
                            var2 += -646332648;
                            var2 *= -2084056289;
                            var2 ^= 838175056;
                            boolean var142 = var112.equals("none");
                            var6 = var3;
                            long var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var187;
                            int var157 = (var187 = var6 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                            if (var157 != 0) {
                                var2 *= -1583466457;
                                var2 -= -1287363544;
                                var2 ^= 1330982151;
                                var2 ^= -1279802234;
                                var2 ^= 1257764364;
                            } else {
                                var2 *= 673370859;
                                var2 >>= 21;
                                var2 ^= 58622151;
                                var6 = var2;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var6 = var8 & 1L;
                                long var188;
                                int var160 = (var188 = var6 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                                if (var160 != 0) {
                                    break label139;
                                }

                                if (var142) {
                                    var141 = switch (var2) {
                                        case -2082935822 -> var2 ^ -1317655420;
                                        default -> var2 ^ -1713757681;
                                        case -58622482 -> {
                                            var2 &= -154852940;
                                            var2 |= -2052823695;
                                            var2 |= -1156846799;
                                            yield var2 ^ -1473840212;
                                        }
                                    };
                                    if (var141 != null) {
                                        this.y(-1);
                                        return true;
                                    }
                                    break label139;
                                }

                                var2 *= -257567687;
                                var2 += -1901796318;
                                var2 >>= 2;
                                var2 <<= 11;
                                var2 ^= -2075846478;
                                var141 = var2;
                                if (var141 == null) {
                                    break label139;
                                }

                                sx var144 = MP;
                                var111 = var144.W(var112);
                                int var145 = var3 + 1;
                                var145 = var3 * var145;
                                int var161 = var3 + 2;
                                var145 *= var161;
                                var3 += 3;
                                var145 *= var3;
                                var3 = var145 & 7;
                                if (var3 == 0) {
                                    var2 = switch (var2) {
                                        case -1419080648 -> var2 ^ 1009999484;
                                        default -> var2 ^ 397963067;
                                        case -699836238 -> {
                                            var2 &= -575474951;
                                            var2 -= 1446801994;
                                            yield var2 ^ -245345722;
                                        }
                                    };
                                    var3 = var2 + 1;
                                    var3 = var2 * var3;
                                    var3 &= 1;
                                    if (var3 == 0) {
                                        if (var111 != -1) {
                                            var2 >>= 29;
                                            var2 ^= -1138154544;
                                            this.y(var111);
                                            return true;
                                        }
                                        long var114 = switch (var2) {
                                            case -1935438816 -> {
                                                var2 *= -1614765395;
                                                var2 ^= 1601870521;
                                                var2 *= -1697732643;
                                                yield var2 ^ -1132136935;
                                            }
                                            default -> var2 ^ 1924126583;
                                            case 1744603424 -> var2 ^ 373867982;
                                        };
                                        var6 = var114 + 1L;
                                        var6 = var114 * var6;
                                        var8 = var114 + 2L;
                                        var6 *= var8;
                                        long var115 = var114 + 3L;
                                        var6 *= var115;
                                        long var116 = var6 & 7L;
                                        long var189;
                                        var111 = (var189 = var116 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                                        if (var111 == 0) {
                                            return false;
                                        }
                                    }
                                    break label139;
                                }

                                var2 |= -1315480854;
                                var2 >>= 24;
                                var2 ^= 2115615386;
                            }
                        } else {
                            var2 |= -928662892;
                            var2 >>>= 22;
                            var2 -= -1143858934;
                            var2 ^= -976507019;
                        }
                    }
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                UnsupportedOperationException var96 = new UnsupportedOperationException();
                throw var96;
            }
        }

        RuntimeException var85 = new RuntimeException();
        throw var85;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1332599848;
        int var2 = xB.nu;
        int var4 = of_2.xF(var3, var1, var2);
        mf = var4;
        qV var5 = new qV();
        MP = var5;
    }

    @Override
    public Object a() {
        return this.v();
    }

    @Override
    public void t(Object var1) {
        this.EM((Integer)var1);
    }

    @Override
    public Object cQ() {
        return this.qt();
    }
}
