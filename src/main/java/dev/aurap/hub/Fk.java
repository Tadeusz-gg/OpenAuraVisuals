package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Fk extends xB {
    private final int bD;
    private final boolean ns;
    private int I;
    public static final int po;

    public Fk(String var1, String var2, int var3, boolean var4) {
        super(var1, var2);
        this.ns = var4;
        int var5;
        if (var4) {
            var5 = var3;
        } else {
            int var6 = var3 | 0xFF000000;
            var5 = var6;
        }

        this.bD = var5;
        var5 = this.bD;
        this.I = var5;
    }

    public Fk(String var1, String var2, int var3) {
        this(var1, var2, var3, true);
    }

    public int zz() {
        int var1 = po;
        var1 ^= 51289413;
        int var2 = System.identityHashCode(this);
        Integer var21 = var2;
        int var3 = of_2.Ik;
        var1 ^= var3;
        var1 ^= -924068123;
        of_2.Ik = -924068123;
        var3 = of_2.nE;
        var1 ^= var3;
        var1 ^= -1075023892;
        of_2.nE = -1075023892;
        if (var21 == null) {
            var1 >>= 11;
            var1 -= 1145756354;
            var1 ^= -146711129;
            var21 = var1;
            if (var21 != null) {
                IllegalArgumentException var23 = new IllegalArgumentException();
                throw var23;
            }
        } else {
            var1 -= 1120789627;
            var1 >>= 6;
            var1 += 311213116;
            var1 ^= -1444767802;
            long var17 = var1;
            long var25 = var17 + 1L;
            long var26 = var17 * var25;
            long var18 = var26 & 1L;
            long var27;
            var1 = (var27 = var18 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.I;
            }
        }

        UnsupportedOperationException var20 = new UnsupportedOperationException();
        throw var20;
    }

    public boolean hO() {
        int var1 = po;
        var1 ^= 1678859004;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var29;
        var2 = (var29 = var23 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 <<= 3;
            var1 &= 1430906044;
            var1 -= -355521275;
            var1 ^= -707013436;
            var1 ^= 881024335;
            IllegalStateException var25 = new IllegalStateException();
            throw var25;
        } else {
            switch (var1) {
                case 949202486:
                    var1 |= 1052706815;
                    var1 += 1000774933;
                    var1 ^= -1603957113;
                    var1 &= -1818943753;
                    var1 ^= 967829857;
                    break;
                case 1220766343:
                    var1 ^= 1857006274;
                    break;
                case 1908952183:
                default:
                    var1 ^= -2013590753;
            }

            return this.ns;
        }
    }

    public void L(int var1) {
        label107: {
            int var2 = po;
            var2 ^= -2095644976;
            int var4 = System.identityHashCode(this);
            int var5 = (this.ns ? 1 : 0);
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var127;
            int var78 = (var127 = var6 - 0L) == 0L ? 0 : (var127 < 0L ? -1 : 1);
            if (var78 != 0) {
                var2 ^= 702930928;
                var2 ^= 4094903;
            } else {
                label116: {
                    var2 = switch (var2) {
                        case -1594914440 -> var2 ^ 383928591;
                        case -543946214 -> {
                            var2 *= -1764029947;
                            var2 >>>= 29;
                            yield var2 ^ 1949268042;
                        }
                        default -> var2 ^ 462505469;
                    };
                    var6 = var1;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var128;
                    int var81 = (var128 = var6 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
                    if (var81 != 0) {
                        break label107;
                    }

                    if (var5 != 0) {
                        var2 |= -1710170600;
                        var2 -= -809721122;
                        var2 ^= 964896656;
                        Integer var75 = var1;
                        if (var75 == null) {
                            break label107;
                        }

                        var5 = var1;
                        var2 <<= 19;
                        var2 -= 336610375;
                        var2 ^= 1590172164;
                    } else {
                        var2 *= -1518156969;
                        var2 |= -1488062615;
                        var2 |= 988379717;
                        var2 ^= 833615386;
                        int var82 = var1 + 1;
                        int var83 = var1 * var82;
                        int var84 = var83 & 1;
                        if (var84 != 0) {
                            break label107;
                        }

                        int var85 = var1 | 0xFF000000;
                        int var7 = var4 + 1;
                        var7 = var4 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            var2 |= -863796490;
                            var2 ^= 1092146701;
                            var2 |= -880387090;
                            var2 ^= 964751779;
                            break label116;
                        }

                        var2 ^= -6150353;
                        var2 ^= -1114109342;
                        long var107 = var1;
                        long var9 = var107 + 1L;
                        var9 = var107 * var9;
                        long var108 = var9 & 1L;
                        long var129;
                        var7 = (var129 = var108 - 0L) == 0L ? 0 : (var129 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label107;
                        }

                        var5 = var85;
                        switch (var2) {
                            case -1939200968:
                                var2 |= 844037584;
                                var2 &= 545541786;
                                var2 |= -2079530211;
                                var2 += 962419346;
                                var2 ^= 1357769618;
                                break;
                            case -711110205:
                            default:
                                var2 ^= 1156385057;
                                break;
                            case 1928872284:
                                var2 ^= 1151786325;
                        }
                    }

                    var6 = var1;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var130;
                    int var88 = (var130 = var6 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                    if (var88 != 0) {
                        break label107;
                    }

                    int var89 = var4 + 1;
                    int var90 = var4 * var89;
                    int var110 = var4 + 2;
                    int var91 = var90 * var110;
                    var110 = var4 + 3;
                    int var92 = var91 * var110;
                    int var93 = var92 & 7;
                    if (var93 != 0) {
                        var2 <<= 24;
                        var2 += -1633173149;
                        var2 |= -520129941;
                        var2 ^= 229662006;
                    } else {
                        var2 = switch (var2) {
                            case -1920491075 -> {
                                var2 -= -1484214611;
                                var2 &= -626388203;
                                yield var2 ^ 1597788265;
                            }
                            default -> var2 ^ 286473195;
                            case -170606346 -> var2 ^ 1934146882;
                        };
                        Integer var94 = var1;
                        if (var94 == null) {
                            break label107;
                        }

                        int var95 = this.I;
                        if (var5 == var95) {
                            var2 += -355083310;
                            var2 &= -1765211882;
                            var2 ^= 786986851;
                            var2 &= 729851016;
                            var2 ^= 2052881748;
                            var6 = var1;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            long var126 = var6 + 2L;
                            var8 *= var126;
                            var6 += 3L;
                            var8 *= var6;
                            var6 = var8 & 7L;
                            long var131;
                            int var103 = (var131 = var6 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                            if (var103 == 0) {
                                return;
                            }
                            break label107;
                        }

                        var2 *= -312571457;
                        var2 ^= -20151187;
                        var2 *= -14086271;
                        var2 ^= 1196551527;
                        var6 = var1;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var132;
                        int var99 = (var132 = var6 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                        if (var99 != 0) {
                            break label107;
                        }

                        this.I = var5;
                        Integer var69 = var4;
                        if (var69 != null) {
                            switch (var2) {
                                case -79716976:
                                    var2 ^= 620025866;
                                    break;
                                case 284920840:
                                default:
                                    var2 ^= -1124213654;
                                    break;
                                case 1120455245:
                                    var2 |= -1213413370;
                                    var2 -= 2010223588;
                                    var2 ^= -525550245;
                            }

                            var69 = var1;
                            if (var69 != null) {
                                this.lU();
                                return;
                            }
                            break label107;
                        }

                        switch (var2) {
                            case 36068551:
                                var2 ^= -2079761636;
                                break;
                            case 481347782:
                            default:
                                var2 ^= 1259922919;
                                break;
                            case 1120455245:
                                var2 |= -1744561809;
                                var2 ^= 746812722;
                        }
                    }
                }
            }

            long var63 = var1;
            long var71 = var63 + 1L;
            long var72 = var63 * var71;
            var6 = var63 + 2L;
            long var73 = var72 * var6;
            long var64 = var63 + 3L;
            long var74 = var73 * var64;
            long var65 = var74 & 7L;
            long var133;
            var2 = (var133 = var65 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var67 = new RuntimeException();
                throw var67;
            }
        }

        IllegalStateException var68 = new IllegalStateException();
        throw var68;
    }

    public Integer EH() {
        int var1 = po;
        var1 ^= 1623023397;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var34;
        var2 = (var34 = var20 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 642448668;
            var1 ^= -17521518;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                UnsupportedOperationException var27 = new UnsupportedOperationException();
                throw var27;
            }
        } else {
            var1 ^= 1793677274;
            var1 ^= -81264620;
            long var13 = var1;
            long var29 = var13 + 1L;
            var29 = var13 * var29;
            long var14 = var29 & 1L;
            long var35;
            var1 = (var35 = var14 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var1 == 0) {
                var1 = this.I;
                return var1;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    public void Vd(Integer var1) {
        int var2 = po;
        var2 ^= -590113337;
        int var3 = System.identityHashCode(this);
        int var4 = var1;
        Integer var22 = var3;
        if (var22 != null) {
            long var5 = switch (var2) {
                case -2142150387 -> {
                    var2 |= -577814714;
                    var2 <<= 4;
                    var2 |= -830138678;
                    var2 |= -111033218;
                    yield var2 ^ 1656432094;
                }
                default -> var2 ^ 1981023559;
                case 2056682775 -> var2 ^ 1364238215;
            };
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var28;
            int var23 = (var28 = var5 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var23 == 0) {
                this.L(var4);
                return;
            }
        } else {
            var2 >>>= 23;
            var2 ^= 1550325397;
            long var17 = var2;
            long var24 = var17 + 1L;
            long var25 = var17 * var24;
            long var18 = var25 & 1L;
            long var29;
            var2 = (var29 = var18 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    public Integer I() {
        int var1 = po;
        var1 ^= 299587525;
        int var2 = System.identityHashCode(this);
        int var3 = this.bD;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var27;
        var2 = (var27 = var4 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= 257976163;
            var1 -= 2076911471;
            var1 ^= -1839222568;
            Integer var18 = var1;
            if (var18 != null) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            }
        } else {
            var1 |= -115386709;
            var1 ^= -1458800774;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var25 = var1 + 2;
            var2 *= var25;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return var3;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    @Override
    public Object yW() {
        int var1 = po;
        var1 ^= 2131410271;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 *= -340636977;
            var1 >>>= 29;
            var1 ^= 1276607758;
            var1 *= -1573437137;
            var1 ^= -1910450437;
            AssertionError var17 = new AssertionError();
            throw var17;
        } else {
            var1 >>= 29;
            var1 >>= 9;
            var1 *= -1662791385;
            var1 &= 982260561;
            var1 ^= -1099136588;
            var1 = this.I;
            return DP.nN(var1);
        }
    }

    @Override
    public boolean YT(Object var1) {
        int var3 = po;
        var3 ^= 838210373;
        Object var4 = null;
        int var5 = (var1 instanceof String) ? 1 : 0;

        var3 = switch (var3) {
            case -1516633124 -> var3 ^ -1433551735;
            default -> var3 ^ 1363596566;
            case 1836377999 -> {
                var3 ^= -458774050;
                var3 ^= 1661225117;
                yield var3 ^ -1390774825;
            }
        };
        long var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var99;
        int var81 = (var99 = var6 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
        if (var81 == 0) {
            if (var5 != 0) {
                var3 |= -1016518378;
                var3 <<= 7;
                var3 ^= -1039438826;
                Integer var73 = var3;
                if (var73 != null) {
                    String var74 = (String)var1;
                    var3 |= 869615775;
                    var3 |= 1164537393;
                    var3 &= -1273135755;
                    var3 *= 1097181669;
                    var3 ^= 197556407;
                    var6 = var3;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var100;
                    int var84 = (var100 = var6 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                    label68:
                    if (var84 == 0) {
                        String var75 = var74;
                        var3 >>>= 12;
                        var3 += -664877275;
                        var3 ^= -1234279754;

                        Throwable var13;
                        label94: {
                            try {
                                var3 += -1324523258;
                                var3 <<= 13;
                                var3 &= 1930576958;
                                var3 ^= -1381427988;
                            } catch (Throwable var12) {
                                var13 = var12;
                                int var35 = po;
                                int var36 = var35 ^ -2002410280;
                                var5 = (var12 instanceof IllegalArgumentException) ? 1 : 0;
                                int var37 = var36 * 460929299;
                                int var38 = var37 * 1162677861;
                                int var39 = var38 + -1258964964;
                                int var40 = var39 ^ 995164907;
                                var3 = var40 ^ -1539745070;
                                int var85 = var3 + 1;
                                int var86 = var3 * var85;
                                int var87 = var86 & 1;
                                if (var87 != 0) {
                                    break label68;
                                }
                                break label94;
                            }

                            Integer var88 = var3;
                            if (var88 == null) {
                                break label68;
                            }

                            try {
                                var5 = DP.ue(var75);
                                var3 += -1586520896;
                                var3 ^= -1944258389;
                            } catch (Throwable var11) {
                                var13 = var11;
                                int var46 = po;
                                int var47 = var46 ^ -2002410280;
                                var5 = (var11 instanceof IllegalArgumentException) ? 1 : 0;
                                int var48 = var47 * 460929299;
                                int var49 = var48 * 1162677861;
                                int var50 = var49 + -1258964964;
                                int var51 = var50 ^ 995164907;
                                var3 = var51 ^ -1539745070;
                                int var89 = var3 + 1;
                                int var90 = var3 * var89;
                                int var91 = var90 & 1;
                                if (var91 != 0) {
                                    break label68;
                                }
                                break label94;
                            }

                            Integer var92 = var3;
                            if (var92 == null) {
                                break label68;
                            }

                            try {
                                this.L(var5);
                                var3 += 545145112;
                                var3 |= -17012411;
                                var3 -= -1651340817;
                                var3 <<= 16;
                                var3 ^= 1179908984;
                                return true;
                            } catch (Throwable var10) {
                                var13 = var10;
                                int var54 = po;
                                int var55 = var54 ^ -2002410280;
                                var5 = (var10 instanceof IllegalArgumentException) ? 1 : 0;
                                int var56 = var55 * 460929299;
                                int var57 = var56 * 1162677861;
                                int var58 = var57 + -1258964964;
                                int var59 = var58 ^ 995164907;
                                var3 = var59 ^ -1539745070;
                                int var93 = var3 + 1;
                                int var94 = var3 * var93;
                                int var95 = var94 & 1;
                                if (var95 != 0) {
                                    break label68;
                                }
                            }
                        }

                        if (var5 == 0) {
                            var3 -= 394311872;
                            var3 ^= 1269723237;
                            var73 = var3;
                            if (var73 != null) {
                                throw UncheckedExceptions.rethrow(var13);
                            }
                        } else {
                            var3 -= 486946115;
                            var3 *= -689104651;
                            var3 ^= 1874109943;
                            var73 = var3;
                            if (var73 != null) {
                                var4 = (IllegalArgumentException)var13;
                                var3 -= -116916151;
                                var3 ^= 2079887914;
                                int var14 = var3 + 1;
                                int var15 = var3 * var14;
                                int var16 = var15 & 1;
                                if (var16 == 0) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            } else {
                var3 |= -625450151;
                var3 ^= 2014065483;
                Integer var2 = var3;
                if (var2 != null) {
                    return false;
                }
            }
        }

        IllegalStateException var17 = new IllegalStateException();
        throw var17;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -988110041;
        int var2 = xB.nu;
        int var4 = of_2.ro(var3, var1, var2);
        po = var4;
    }

    @Override
    public Object a() {
        return this.I();
    }

    @Override
    public void t(Object var1) {
        this.Vd((Integer)var1);
    }

    @Override
    public Object cQ() {
        return this.EH();
    }
}
