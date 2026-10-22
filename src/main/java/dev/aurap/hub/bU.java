package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class bU {
    public static final int AB = 1;
    public static final int nx = 2;
    public static final int Ur = 3;
    public static final int O = 4;
    private final int ua;
    private final long G;
    private final int e;
    private final byte[] Qh;
    private final String tf;
    public static final int m;

    private bU(int var1, long var2, int var4, byte[] var5, String var6) {
        this.ua = var1;
        this.G = var2;
        this.e = var4;
        this.Qh = var5;
        this.tf = var6;
    }

    public static bU bH() {
        return new bU(1, 0L, 0, null, null);
    }

    public static bU p(long var0, int var2, byte[] var3) {
        int var4 = m;
        var4 ^= -1113305258;
        int var6 = (int)var0;
        long var26 = var6;
        long var8 = var26 + 1L;
        var8 = var26 * var8;
        long var27 = var8 & 1L;
        long var41;
        var6 = (var41 = var27 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        if (var6 == 0) {
            var4 = switch (var4) {
                case -2120985200 -> {
                    var4 += 868412200;
                    var4 >>= 18;
                    var4 *= -1719982287;
                    var4 *= -612681597;
                    yield var4 ^ -154712519;
                }
                case 895927195 -> var4 ^ 1292536930;
                default -> var4 ^ -166259094;
            };
            long var29 = var2;
            var8 = var29 + 1L;
            var8 = var29 * var8;
            long var30 = var8 & 1L;
            long var42;
            var6 = (var42 = var30 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
            if (var6 == 0) {
                var6 = var4 & 1143239131;
                var6 &= 1650784164;
                var6 &= -214463228;
                var6 ^= -1862991265;
                JP(var3, var6);
                Object var7 = var3.clone();
                var7 = (byte[])var7;
                return new bU(2, var0, var2, (byte[])var7, null);
            }
        } else {
            var4 &= -1020759737;
            var4 -= -472430480;
            var4 ^= 696069265;
            var4 = var2 + 1;
            var4 = var2 * var4;
            var6 = var2 + 2;
            var4 *= var6;
            int var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 == 0) {
                RuntimeException var25 = new RuntimeException();
                throw var25;
            }
        }

        AssertionError var24 = new AssertionError();
        throw var24;
    }

    public static bU b(int var0, byte[] var1) {
        int var2 = m;
        var2 ^= -249146378;
        int var5 = var2 - -866194348;
        var5 >>= 9;
        var5 *= -2083886633;
        var5 ^= 1472355965;
        JP(var1, var5);
        var5 = var0 + 1;
        var5 = var0 * var5;
        int var4 = var5 & 1;
        if (var4 == 0) {
            switch (var2) {
                case -854177488:
                    var2 *= 1132102071;
                    var2 ^= -169112766;
                    var2 ^= -1991739905;
                    break;
                case 858311025:
                default:
                    var2 ^= 447847387;
                    break;
                case 1888508041:
                    var2 ^= 114852677;
            }

            Integer var21 = var0;
            if (var21 != null) {
                Object var27 = var1.clone();
                byte[] var28 = (byte[])var27;
                return new bU(3, 0L, var0, var28, null);
            }
        } else {
            var2 *= -1414667019;
            var2 |= 1148774327;
            var2 += 905198740;
            var2 ^= -60784526;
            var2 = var0 + 1;
            var2 = var0 * var2;
            var2 &= 1;
            if (var2 == 0) {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        }

        AssertionError var19 = new AssertionError();
        throw var19;
    }

    public static bU o(String var0) {
        label86: {
            int var1 = m;
            var1 ^= 1267406101;
            int var2 = System.identityHashCode(var0);
            Integer var3 = var2;
            if (var3 == null) {
                switch (var1) {
                    case -1601415651:
                    default:
                        var1 ^= -163306626;
                        break;
                    case 1889645708:
                        var1 ^= -750098673;
                        break;
                    case 2008747987:
                        var1 &= 1308289248;
                        var1 += -279265950;
                        var1 ^= 443105440;
                }
            } else {
                label85: {
                    var1 *= 1520775993;
                    var1 &= 354840182;
                    var1 <<= 2;
                    var1 ^= 73400860;
                    long var61 = var1;
                    long var5 = var61 + 1L;
                    var5 = var61 * var5;
                    long var7 = var61 + 2L;
                    var5 *= var7;
                    long var62 = var61 + 3L;
                    var5 *= var62;
                    long var63 = var5 & 7L;
                    long var103;
                    int var64 = (var103 = var63 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                    if (var64 != 0) {
                        break label86;
                    }

                    if (var0 != null) {
                        var1 &= 1094409496;
                        var1 ^= -38002482;
                        int var65 = (var0.isEmpty()) ? 1 : 0;
                        long var4 = var2;
                        long var6 = var4 + 1L;
                        var6 = var4 * var6;
                        var4 = var6 & 1L;
                        long var104;
                        int var77 = (var104 = var4 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                        if (var77 != 0) {
                            var1 ^= -1950404692;
                            var1 <<= 4;
                            var1 ^= 1280106914;
                            break label85;
                        }

                        var1 |= -507103065;
                        var1 &= -2146033571;
                        var1 ^= -1522812425;
                        int var78 = var1 + 1;
                        int var79 = var1 * var78;
                        int var93 = var1 + 2;
                        int var80 = var79 * var93;
                        int var94 = var1 + 3;
                        int var81 = var80 * var94;
                        int var82 = var81 & 7;
                        if (var82 != 0) {
                            break label86;
                        }

                        if (var65 == 0) {
                            var1 &= 50196476;
                            var1 &= -1120161604;
                            var1 ^= -190619732;
                            var1 ^= -1251603246;
                            var65 = var1 + 1;
                            var65 = var1 * var65;
                            int var83 = var1 + 2;
                            var65 *= var83;
                            int var84 = var1 + 3;
                            var65 *= var84;
                            var65 &= 7;
                            if (var65 != 0) {
                                break label86;
                            }

                            var65 = var0.length();
                            var4 = var2;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var4 = var6 & 1L;
                            long var105;
                            var2 = (var105 = var4 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                var1 ^= -1730327119;
                                var1 >>>= 15;
                                var1 ^= -762907802;
                                var1 ^= -33896537;
                                break label85;
                            }

                            var1 >>= 8;
                            var1 -= -1408290807;
                            var1 *= -1640912649;
                            var1 += -298573193;
                            var1 ^= 1343316053;
                            Integer var58 = var1;
                            if (var58 == null) {
                                break label86;
                            }

                            if (var65 <= 16) {
                                switch (var1) {
                                    case -1843560825:
                                    default:
                                        var1 ^= 1385851714;
                                        break;
                                    case 773493760:
                                        var1 ^= 41006488;
                                        break;
                                    case 811018504:
                                        var1 >>= 5;
                                        var1 >>>= 23;
                                        var1 += 1285114959;
                                        var1 &= -1961952588;
                                        var1 ^= -1153101331;
                                }

                                return new bU(4, 0L, 0, null, var0);
                            }

                            switch (var1) {
                                case -1317995592:
                                    var1 ^= -1273418572;
                                    break;
                                case -807742849:
                                default:
                                    var1 ^= -1559200088;
                                    break;
                                case 811018504:
                                    var1 += -964566761;
                                    var1 ^= -2036612365;
                                    var1 ^= 426124838;
                            }
                        } else {
                            var1 -= 1554772329;
                            var1 ^= -1581955445;
                        }
                    } else {
                        var1 ^= 363725300;
                        var1 |= 1962729759;
                        var1 ^= 1696793419;
                        var1 ^= 2046367422;
                    }

                    long var49 = var1;
                    long var72 = var49 + 1L;
                    long var73 = var49 * var72;
                    var5 = var49 + 2L;
                    long var74 = var73 * var5;
                    long var50 = var49 + 3L;
                    long var75 = var74 * var50;
                    long var51 = var75 & 7L;
                    long var106;
                    var1 = (var106 = var51 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        IllegalArgumentException var53 = new IllegalArgumentException("share code");
                        throw var53;
                    }
                    break label86;
                }
            }

            long var87 = var1;
            long var99 = var87 + 1L;
            var99 = var87 * var99;
            long var8 = var87 + 2L;
            var99 *= var8;
            var87 += 3L;
            var99 *= var87;
            var87 = var99 & 7L;
            long var107;
            var2 = (var107 = var87 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var60 = new IllegalStateException();
                throw var60;
            }
        }

        UnsupportedOperationException var56 = new UnsupportedOperationException();
        throw var56;
    }

    private static void JP(byte[] var0, int var1) {
        label81: {
            int var3 = System.identityHashCode(var0);
            Integer var4 = var3;
            int var36;
            if (var4 == null) {
                switch (var1) {
                    case -789511329:
                        var36 = var1 | -537937980;
                        var36 |= -77289604;
                        var36 &= -339060254;
                        var36 ^= 1168620084;
                        break;
                    case 487860681:
                        var36 = var1 ^ 664546503;
                        break;
                    case 1156825103:
                    default:
                        var36 = var1 ^ 893896168;
                }
            } else {
                label80: {
                    var36 = var1 & 504776420;
                    var36 >>>= 24;
                    var36 -= 355693772;
                    var36 *= -193684691;
                    var36 ^= -2133481806;
                    if (var0 != null) {
                        var36 |= -2126658579;
                        var36 *= -427705079;
                        var36 <<= 9;
                        var36 ^= 544963096;
                        int var59 = var0.length;
                        long var5 = var3;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var72;
                        int var62 = (var72 = var5 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var62 != 0) {
                            var36 *= -1048951193;
                            var36 ^= -619336066;
                            break label80;
                        }

                        var36 += -1516278262;
                        var36 ^= -907163604;
                        var36 >>= 19;
                        var36 ^= 364865997;
                        Integer var63 = var36;
                        if (var63 == null) {
                            break label81;
                        }

                        if (var59 != 0) {
                            var36 *= -1697246299;
                            var36 ^= 195464444;
                            var59 = var0.length;
                            Integer var49 = var3;
                            if (var49 == null) {
                                var36 >>>= 22;
                                var36 >>>= 15;
                                var36 |= -932387387;
                                var36 ^= 1711361555;
                                break label80;
                            }
                            var36 = switch (var36) {
                                default -> var36 ^ 549085023;
                                case -978089248 -> var36 ^ -1888578953;
                                case 756373002 -> {
                                    var36 <<= 8;
                                    var36 <<= 15;
                                    var36 += 1191339089;
                                    var36 >>>= 8;
                                    yield var36 ^ 666571681;
                                }
                            };
                            var49 = var36;
                            if (var49 == null) {
                                break label81;
                            }

                            if (var59 <= 7168) {
                                var36 |= -840013766;
                                var36 *= 497947489;
                                var36 ^= 1199391502;
                                long var51 = var36;
                                var5 = var51 + 1L;
                                var5 = var51 * var5;
                                var7 = var51 + 2L;
                                var5 *= var7;
                                long var52 = var51 + 3L;
                                var5 *= var52;
                                long var53 = var5 & 7L;
                                long var73;
                                int var54 = (var73 = var53 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                                if (var54 == 0) {
                                    return;
                                }
                                break label81;
                            }

                            var36 <<= 24;
                            var36 ^= -238455476;
                        } else {
                            var36 >>= 14;
                            var36 ^= 1904562189;
                            var36 ^= 1162638268;
                        }
                    } else {
                        switch (var36) {
                            case -1983709114:
                                var36 ^= 1847313934;
                                var36 |= -583145844;
                                var36 <<= 19;
                                var36 ^= 44660044;
                                break;
                            case -870575012:
                                var36 ^= 409696552;
                                break;
                            case 1529222431:
                            default:
                                var36 ^= -501912261;
                        }
                    }

                    Integer var43 = var36;
                    if (var43 != null) {
                        IllegalArgumentException var44 = new IllegalArgumentException("config body must be 1..7168 bytes");
                        throw var44;
                    }
                    break label81;
                }
            }

            long var55 = var36;
            long var68 = var55 + 1L;
            var68 = var55 * var68;
            long var56 = var68 & 1L;
            long var74;
            var3 = (var74 = var56 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
            if (var3 == 0) {
                AssertionError var58 = new AssertionError();
                throw var58;
            }
        }

        IllegalArgumentException var48 = new IllegalArgumentException();
        throw var48;
    }

    public byte[] R() {
        label134: {
            int var42;
            ra var96;
            label140: {
                var42 = m;
                var42 ^= -91898844;
                int var2 = System.identityHashCode(this);
                long var3 = var2;
                long var5 = var3 + 1L;
                var5 = var3 * var5;
                long var93 = var5 & 1L;
                long var155;
                int var94 = (var155 = var93 - 0L) == 0L ? 0 : (var155 < 0L ? -1 : 1);
                label131:
                if (var94 == 0) {
                    var42 |= -611270211;
                    var42 &= 74213722;
                    var42 += 491986138;
                    var42 ^= 1875620849;
                    var96 = null;
                    byte[] var4 = this.Qh;
                    int var102;
                    if (var4 == null) {
                        var42 |= 980129385;
                        var42 ^= 901292478;
                        Integer var101 = var42;
                        if (var101 == null) {
                            break label134;
                        }

                        var102 = 32;
                        switch (var42) {
                            case -961150273:
                            default:
                                var42 ^= 304371864;
                                break;
                            case -681125212:
                                var42 ^= 650264785;
                                break;
                            case 1262976595:
                                var42 -= -585415207;
                                var42 ^= -1770649329;
                                var42 |= 61075226;
                                var42 ^= -792838918;
                        }
                    } else {
                        var42 *= 1927124875;
                        var42 *= 810134965;
                        var42 ^= -22472959;
                        var42 ^= -741903317;
                        Integer var123 = var42;
                        if (var123 == null) {
                            break label134;
                        }

                        byte[] var124 = this.Qh;
                        long var6 = var2;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var156;
                        int var147 = (var156 = var6 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                        if (var147 != 0) {
                            var42 >>= 4;
                            var42 -= 746297549;
                            var42 *= 363020449;
                            var42 ^= 1664297013;
                            break label131;
                        }
                        var42 = switch (var42) {
                            case -2056907127 -> {
                                var42 += 22473778;
                                yield var42 ^ -1677351414;
                            }
                            case -123351946 -> var42 ^ 85669484;
                            default -> var42 ^ -624802386;
                        };
                        int var148 = var42 + 1;
                        int var149 = var42 * var148;
                        int var150 = var149 & 1;
                        if (var150 != 0) {
                            break label134;
                        }

                        int var125 = var124.length;
                        int var126 = var125 + 16;
                        var102 = var126;
                        var42 |= -1440636029;
                        var42 |= -437005028;
                        var42 ^= -725732294;
                    }

                    Integer var127 = var42;
                    if (var127 == null) {
                        break label134;
                    }

                    var96 = new ra(var102);
                    Integer var103 = var2;
                    if (var103 != null) {
                        var42 ^= -102688128;
                        var42 *= 1055379247;
                        var42 -= -1291517309;
                        var42 >>>= 17;
                        var42 ^= 967259534;
                        int var104 = var42 + 1;
                        int var105 = var42 * var104;
                        int var106 = var105 & 1;
                        if (var106 != 0) {
                            break label134;
                        }

                        int var107 = this.ua;
                        var96 = var96.h(var107);
                        int var108 = this.ua;
                        switch (var108) {
                            case 2:
                                var42 *= -1408453525;
                                var42 |= 746705597;
                                var42 ^= 1953673489;
                                long var118 = this.G;
                                ra var119 = var96.FX(var118);
                                int var142 = this.e;
                                ra var120 = var119.C(var142);
                                byte[] var143 = this.Qh;
                                int var144 = var143.length;
                                Integer var89 = var2;
                                if (var89 != null) {
                                    var42 ^= 1542547375;
                                    var42 *= -452025459;
                                    var42 ^= 1452756018;
                                    ra var90 = var120.C(var144);
                                    var4 = this.Qh;
                                    ra var91 = var90.N(var4);
                                    var42 |= -2017926921;
                                    var42 *= 168766037;
                                    var42 ^= 817579462;
                                    break label140;
                                }

                                var42 |= 1714084193;
                                var42 *= 435757545;
                                var42 += 1796157694;
                                var42 += 1269819658;
                                var42 ^= 1598632179;
                                break;
                            case 3:
                                var42 &= 634573569;
                                var42 >>>= 14;
                                var42 ^= 1521624575;
                                int var114 = this.e;
                                ra var115 = var96.C(var114);
                                byte[] var135 = this.Qh;
                                int var136 = var135.length;
                                ra var116 = var115.C(var136);
                                int var137 = var2 + 1;
                                int var138 = var2 * var137;
                                int var139 = var138 & 1;
                                if (var139 == 0) {
                                    var42 = switch (var42) {
                                        default -> var42 ^ -940702899;
                                        case -543521832 -> var42 ^ -1522849037;
                                        case 1521656823 -> {
                                            var42 += 539752827;
                                            var42 += 315226362;
                                            var42 -= -1171921406;
                                            var42 &= 1139990735;
                                            yield var42 ^ 485972343;
                                        }
                                    };
                                    Integer var140 = var42;
                                    if (var140 == null) {
                                        break label134;
                                    }

                                    byte[] var141 = this.Qh;
                                    ra var117 = var116.N(var141);
                                    switch (var42) {
                                        case -860354694:
                                            var42 ^= -1492946031;
                                            break label140;
                                        case 1601567037:
                                            var42 |= -1900409512;
                                            var42 &= 807696836;
                                            var42 >>= 12;
                                            var42 ^= -2095221374;
                                            break label140;
                                        case 2079175726:
                                        default:
                                            var42 ^= 1544886290;
                                            break label140;
                                    }
                                }

                                var42 >>= 15;
                                var42 |= 672809275;
                                var42 ^= 323367985;
                                break;
                            case 4:
                                var42 += -401413076;
                                var42 -= 1771521996;
                                var42 -= 2030641279;
                                var42 >>= 6;
                                var42 ^= 430337035;
                                int var109 = var42 + 1;
                                int var110 = var42 * var109;
                                int var111 = var110 & 1;
                                if (var111 != 0) {
                                    break label134;
                                }

                                String var112 = this.tf;
                                int var128 = var2 + 1;
                                int var129 = var2 * var128;
                                int var130 = var129 & 1;
                                if (var130 == 0) {
                                    var42 += 1832898545;
                                    var42 ^= -1234119347;
                                    var5 = var42;
                                    long var7 = var5 + 1L;
                                    var7 = var5 * var7;
                                    long var9 = var5 + 2L;
                                    var7 *= var9;
                                    var5 += 3L;
                                    var7 *= var5;
                                    var5 = var7 & 7L;
                                    long var157;
                                    int var134 = (var157 = var5 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                                    if (var134 != 0) {
                                        break label134;
                                    }

                                    ra var113 = var96.c(var112, 16);
                                    switch (var42) {
                                        case -598690469:
                                            var42 ^= 1622219892;
                                            break label140;
                                        case 818516989:
                                        default:
                                            var42 ^= -23197239;
                                            break label140;
                                        case 820580110:
                                            var42 <<= 9;
                                            var42 ^= 1359113157;
                                            break label140;
                                    }
                                }

                                var42 *= -1866695915;
                                var42 &= -1531402400;
                                var42 -= 75143578;
                                var42 ^= -951497272;
                                break;
                            default:
                                var42 *= -1585315555;
                                var42 <<= 18;
                                var42 ^= 710703045;
                                break label140;
                        }
                    } else {
                        switch (var42) {
                            case -1538012632:
                            default:
                                var42 ^= -880601473;
                                break;
                            case 725992325:
                                var42 *= 772448527;
                                var42 ^= -916203387;
                                break;
                            case 1549817004:
                                var42 ^= -548319260;
                        }
                    }
                } else {
                    switch (var42) {
                        case -961173790:
                            var42 ^= -855628496;
                            var42 += 102111935;
                            var42 <<= 17;
                            var42 += 1316166873;
                            var42 ^= -1328947817;
                            break;
                        case -247692520:
                            var42 ^= 1801855794;
                            break;
                        case 1270695659:
                        default:
                            var42 ^= 1401193619;
                    }
                }

                long var83 = var42;
                long var97 = var83 + 1L;
                long var98 = var83 * var97;
                var5 = var83 + 2L;
                long var99 = var98 * var5;
                long var84 = var83 + 3L;
                long var100 = var99 * var84;
                long var85 = var100 & 7L;
                long var158;
                var42 = (var158 = var85 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                if (var42 == 0) {
                    AssertionError var87 = new AssertionError();
                    throw var87;
                }
                break label134;
            }

            Integer var92 = var42;
            if (var92 != null) {
                return var96.ET();
            }
        }

        AssertionError var88 = new AssertionError();
        throw var88;
    }

    public static bU BI(byte[] var0) throws hh {
        label137: {
            Gb var127;
            bU var138;
            label136: {
                int var1 = m;
                var1 ^= 1245720828;
                int var2 = System.identityHashCode(var0);
                int var3 = var2 + 1;
                int var119 = var2 * var3;
                int var4 = var2 + 2;
                int var120 = var119 * var4;
                int var134 = var2 + 3;
                int var121 = var120 * var134;
                int var122 = var121 & 7;
                if (var122 == 0) {
                    var1 -= -651443291;
                    var1 >>= 2;
                    var1 -= -1536894363;
                    var1 >>>= 15;
                    var1 ^= 1313400983;
                    long var123 = var1;
                    long var5 = var123 + 1L;
                    var5 = var123 * var5;
                    long var7 = var123 + 2L;
                    var5 *= var7;
                    long var124 = var123 + 3L;
                    var5 *= var124;
                    long var125 = var5 & 7L;
                    long var223;
                    int var126 = (var223 = var125 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                    if (var126 != 0) {
                        break label137;
                    }

                    var127 = new Gb(var0);
                    int var135 = var127.Co();
                    label133:
                    switch (var135) {
                        case 1:
                            var1 = switch (var1) {
                                case 1313369423 -> {
                                    var1 -= -616884159;
                                    var1 -= -1828896749;
                                    yield var1 ^ 1100811610;
                                }
                                case 1646780411 -> var1 ^ -2057427467;
                                default -> var1 ^ -302494519;
                            };
                            var5 = var1;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            long var220 = var5 + 2L;
                            var7 *= var220;
                            var5 += 3L;
                            var7 *= var5;
                            var5 = var7 & 7L;
                            long var224;
                            int var158 = (var224 = var5 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
                            if (var158 != 0) {
                                break label137;
                            }

                            bU var159 = bH();
                            long var175 = var2;
                            long var205 = var175 + 1L;
                            var205 = var175 * var205;
                            long var222 = var175 + 2L;
                            var205 *= var222;
                            var175 += 3L;
                            var205 *= var175;
                            var175 = var205 & 7L;
                            long var225;
                            var2 = (var225 = var175 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
                            if (var2 == 0) {
                                var1 = switch (var1) {
                                    case -1584588383 -> {
                                        var1 |= 1054357803;
                                        var1 <<= 18;
                                        var1 ^= 460284947;
                                        var1 |= 1029271568;
                                        yield var1 ^ 511860412;
                                    }
                                    default -> var1 ^ -1821611441;
                                    case 2060247252 -> var1 ^ 1408977707;
                                };
                                var138 = var159;
                                switch (var1) {
                                    case -480695633:
                                        var1 >>>= 16;
                                        var1 &= -852529479;
                                        var1 *= -848644215;
                                        var1 += -1067612261;
                                        var1 ^= -1389950576;
                                        break label136;
                                    case 145992090:
                                    default:
                                        var1 ^= -428867730;
                                        break label136;
                                    case 1422791857:
                                        var1 ^= 1338954736;
                                        break label136;
                                }
                            }

                            switch (var1) {
                                case -1584588383:
                                    var1 -= -1810677873;
                                    var1 &= 1455672024;
                                    var1 &= -1257711311;
                                    var1 += -1510503446;
                                    var1 ^= 310169964;
                                    break label133;
                                case -574475040:
                                default:
                                    var1 ^= 993216289;
                                    break label133;
                                case 1666750493:
                                    var1 ^= -322953418;
                                    break label133;
                            }
                        case 2:
                            var1 -= -1804773937;
                            var1 &= -1135146612;
                            var1 <<= 28;
                            var1 += -1834056283;
                            var1 ^= -56012341;
                            Integer var153 = var1;
                            if (var153 == null) {
                                break label137;
                            }

                            var5 = var127.nB();
                            var7 = var2;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var7 = var9 & 1L;
                            long var230;
                            int var183 = (var230 = var7 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                            if (var183 == 0) {
                                var1 -= 1721779557;
                                var1 *= -697817879;
                                var1 -= -1650855468;
                                var1 |= 1478786555;
                                var1 ^= -726850213;
                                var7 = var1;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                long var11 = var7 + 2L;
                                var9 *= var11;
                                var7 += 3L;
                                var9 *= var7;
                                var7 = var9 & 7L;
                                long var231;
                                int var187 = (var231 = var7 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                                if (var187 != 0) {
                                    break label137;
                                }

                                int var188 = var127.mA();
                                int var214 = var1 & -1647672060;
                                int var215 = var214 | 1258059423;
                                int var216 = var215 ^ -1681846826;
                                int var217 = var216 & 1705246485;
                                int var218 = var217 ^ -1625553652;
                                byte[] var219 = DS(var127, var218);
                                bU var204 = new bU(2, var5, var188, var219, null);
                                var138 = var204;
                                var1 -= -1367090855;
                                var1 >>= 14;
                                var1 ^= -1324362492;
                                var1 ^= 1239172511;
                                break label136;
                            }

                            var1 ^= -1271018192;
                            var1 ^= -110314753;
                            var1 ^= -1731059401;
                            break;
                        case 3:
                            var1 *= 248821403;
                            var1 ^= -708200750;
                            var1 -= -1482932816;
                            var1 ^= -1404198563;
                            int var148 = var1 + 1;
                            int var149 = var1 * var148;
                            int var150 = var149 & 1;
                            if (var150 != 0) {
                                break label137;
                            }

                            int var151 = var127.mA();
                            int var178 = var1 + -17074594;
                            int var179 = var178 ^ -1309509275;
                            byte[] var180 = DS(var127, var179);
                            bU var167 = new bU(3, 0L, var151, var180, null);
                            long var168 = var2;
                            long var198 = var168 + 1L;
                            var198 = var168 * var198;
                            long var221 = var168 + 2L;
                            var198 *= var221;
                            long var169 = var168 + 3L;
                            var198 *= var169;
                            long var170 = var198 & 7L;
                            long var228;
                            int var171 = (var228 = var170 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                            if (var171 == 0) {
                                var1 |= -405987301;
                                var1 ^= 276109325;
                                var1 ^= -1889859481;
                                long var172 = var1;
                                var198 = var172 + 1L;
                                var198 = var172 * var198;
                                long var173 = var198 & 1L;
                                long var229;
                                int var174 = (var229 = var173 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                                if (var174 != 0) {
                                    break label137;
                                }

                                var138 = var167;
                                var1 *= 2107841569;
                                var1 ^= -1713485827;
                                break label136;
                            }

                            var1 *= -1180527591;
                            var1 *= -2040983909;
                            var1 &= -2020185554;
                            var1 &= -1331513948;
                            var1 ^= 990290578;
                            break;
                        case 4:
                            var1 <<= 15;
                            var1 ^= -815695277;
                            String var136 = var127.Hs(16);
                            boolean var142 = var136.isEmpty();
                            long var6 = var2;
                            long var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var226;
                            int var162 = (var226 = var6 - 0L) == 0L ? 0 : (var226 < 0L ? -1 : 1);
                            if (var162 != 0) {
                                switch (var1) {
                                    case -1450137068:
                                    default:
                                        var1 ^= 1428007197;
                                        break label133;
                                    case -104400301:
                                        var1 |= -1132032008;
                                        var1 ^= 1178762605;
                                        break label133;
                                    case 1882832739:
                                        var1 ^= -1306687350;
                                }
                            } else {
                                var1 &= 1244152343;
                                var1 &= -1333321723;
                                var1 *= 391962333;
                                var1 ^= 767786109;
                                var6 = var1;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                long var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var227;
                                int var166 = (var227 = var6 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
                                if (var166 != 0) {
                                    break label137;
                                }

                                if (var142) {
                                    Integer var146 = switch (var1) {
                                        case 980440815 -> var1 ^ 1931617670;
                                        case 983540384 -> {
                                            var1 >>>= 7;
                                            var1 += 1047181615;
                                            yield var1 ^ -190548904;
                                        }
                                        default -> var1 ^ 881627528;
                                    };
                                    if (var146 != null) {
                                        hh var147 = hh.ug("share code");
                                        throw var147;
                                    }
                                    break label137;
                                }

                                var1 |= -94777764;
                                var1 |= 761836340;
                                var1 |= -1888762718;
                                var1 ^= -237170112;
                                var1 ^= -997621674;
                                Integer var143 = var1;
                                if (var143 == null) {
                                    break label137;
                                }

                                bU var144 = new bU(4, 0L, 0, null, var136);
                                Integer var145 = var2;
                                if (var145 != null) {
                                    var1 -= -1778247469;
                                    var1 &= 112707988;
                                    var1 ^= 1042083399;
                                    var138 = var144;
                                    switch (var1) {
                                        case 401366364:
                                            var1 ^= -354057029;
                                            break label136;
                                        case 666815639:
                                        default:
                                            var1 ^= 1031978184;
                                            break label136;
                                        case 985509715:
                                            var1 ^= 893569726;
                                            var1 ^= -234088520;
                                            var1 *= -2008735701;
                                            var1 <<= 5;
                                            var1 ^= -438934388;
                                            break label136;
                                    }
                                }

                                var1 += -52930126;
                                var1 += 1939783870;
                                var1 <<= 12;
                                var1 += 1668724865;
                                var1 ^= 813218327;
                            }
                            break;
                        default:
                            var1 &= -77762805;
                            var1 |= -1498038229;
                            var1 >>= 4;
                            var1 += -724735839;
                            var1 ^= -94368994;
                            var2 = var1 + 1;
                            var2 = var1 * var2;
                            int var128 = var1 + 2;
                            var2 *= var128;
                            int var129 = var1 + 3;
                            var2 *= var129;
                            var2 &= 7;
                            if (var2 == 0) {
                                hh var117 = hh.ug("config action");
                                throw var117;
                            }
                            break label137;
                    }
                } else {
                    var1 *= 887156413;
                    var1 += -985160780;
                    var1 += -352201098;
                    var1 += -695015994;
                    var1 ^= 1110047316;
                }

                long var106 = var1;
                long var130 = var106 + 1L;
                long var131 = var106 * var130;
                long var160 = var106 + 2L;
                long var132 = var131 * var160;
                long var107 = var106 + 3L;
                long var133 = var132 * var107;
                long var108 = var133 & 7L;
                long var232;
                var1 = (var232 = var108 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                if (var1 == 0) {
                    RuntimeException var111 = new RuntimeException();
                    throw var111;
                }
                break label137;
            }

            var127.Cj();
            return var138;
        }

        RuntimeException var110 = new RuntimeException();
        throw var110;
    }

    private static byte[] DS(Gb var0, int var1) throws hh {
        int var3 = System.identityHashCode(var0);
        Integer var27 = var3;
        if (var27 != null) {
            int var7 = switch (var1) {
                default -> var1 ^ -715051045;
                case -616694259 -> {
                    int var8 = var1 >>> 9;
                    var8 &= -1265210073;
                    yield var8 ^ -1374675098;
                }
                case 166317586 -> var1 ^ -199335396;
            };
            var27 = var7;
            if (var27 != null) {
                int var30 = var0.mA();
                if (var30 != 0) {
                    var7 = switch (var7) {
                        case -1374416063 -> {
                            var7 &= -1583838868;
                            yield var7 ^ 419350309;
                        }
                        case -602615465 -> var7 ^ -75786785;
                        default -> var7 ^ 1973308919;
                    };
                    if (var30 <= 7168) {
                        var7 |= 249680047;
                        var7 += 1454445012;
                        var7 &= 2079491499;
                        var7 += -57207654;
                        var7 ^= -210357630;
                        return var0.A(var30);
                    }

                    switch (var7) {
                        case -1192311195:
                            var7 += 774952996;
                            var7 += -610448548;
                            var7 |= 1449025074;
                            var7 -= -871168102;
                            var7 ^= 1087493355;
                            break;
                        case -410202593:
                            var7 ^= 1763502434;
                            break;
                        case 427976426:
                        default:
                            var7 ^= 914892159;
                    }
                } else {
                    var7 |= -194185545;
                    var7 ^= 1892125149;
                    var7 ^= -998157668;
                }

                Py var4 = Py.PAYLOAD_TOO_LARGE;
                hh var31 = new hh(var4, "config too large");
                throw var31;
            } else {
                AssertionError var29 = new AssertionError();
                throw var29;
            }
        } else {
            int var2 = var1 - -1857320830;
            var2 ^= -1307307552;
            RuntimeException var6 = new RuntimeException();
            throw var6;
        }
    }

    public int KL() {
        int var1 = m;
        var1 ^= 1093791478;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 *= 1164468285;
            var1 |= 643644161;
            var1 ^= 1262959324;
            long var21 = var1;
            long var4 = var21 + 1L;
            var4 = var21 * var4;
            long var6 = var21 + 2L;
            var4 *= var6;
            long var22 = var21 + 3L;
            var4 *= var22;
            long var23 = var4 & 7L;
            long var31;
            var2 = (var31 = var23 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.ua;
            }
        } else {
            var1 -= 821077867;
            var1 &= 1150575837;
            var1 &= -1463254638;
            var1 *= 985252617;
            var1 ^= 1850923657;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        UnsupportedOperationException var18 = new UnsupportedOperationException();
        throw var18;
    }

    public long JF() {
        int var1 = m;
        var1 ^= 71736605;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 != null) {
            var1 = switch (var1) {
                case -1109424147 -> var1 ^ 1949306527;
                default -> var1 ^ 2003240413;
                case 947292123 -> {
                    var1 *= 1478984693;
                    var1 &= 1180507586;
                    yield var1 ^ 100257213;
                }
            };
            int var17 = var1 + 1;
            var17 = var1 * var17;
            int var3 = var1 + 2;
            var17 *= var3;
            var3 = var1 + 3;
            var17 *= var3;
            var17 &= 7;
            if (var17 == 0) {
                return this.G;
            } else {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            }
        } else {
            switch (var1) {
                case -2071094162:
                    var1 ^= -750497017;
                    break;
                case 942846483:
                default:
                    var1 ^= -1162221077;
                    break;
                case 947292123:
                    var1 -= 1863834587;
                    var1 &= -1467271314;
                    var1 >>>= 16;
                    var1 ^= 1597347941;
                    var1 ^= -2141062062;
            }

            RuntimeException var12 = new RuntimeException();
            throw var12;
        }
    }

    public int L() {
        int var1 = m;
        var1 ^= 1443595600;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var28;
        var2 = (var28 = var19 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -1322619304;
            var1 >>= 1;
            var1 -= -528792103;
            var1 &= -685695108;
            var1 ^= 242891357;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.e;
            }
        } else {
            Integer var15 = switch (var1) {
                case -788879713 -> var1 ^ -1876356070;
                default -> var1 ^ -274654855;
                case 1782292374 -> {
                    var1 -= 1444204149;
                    var1 &= -2082476249;
                    yield var1 ^ 1033891627;
                }
            };
            if (var15 != null) {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    public byte[] f() {
        label51: {
            int var33;
            byte[] var53;
            label50: {
                var33 = m;
                var33 ^= 329027432;
                int var2 = System.identityHashCode(this);
                Integer var3 = var2;
                if (var3 != null) {
                    var33 &= -1389000429;
                    var33 >>= 10;
                    var33 |= -444358117;
                    var33 ^= 2052404089;
                    var53 = this.Qh;
                    if (var53 == null) {
                        var33 -= -1393526784;
                        var33 ^= 681863461;
                        long var54 = var33;
                        long var66 = var54 + 1L;
                        var66 = var54 * var66;
                        long var76 = var54 + 2L;
                        var66 *= var76;
                        long var55 = var54 + 3L;
                        var66 *= var55;
                        long var56 = var66 & 7L;
                        long var77;
                        int var57 = (var77 = var56 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                        if (var57 != 0) {
                            break label51;
                        }

                        var53 = null;
                        var33 &= -1570463949;
                        var33 |= -1666832321;
                        var33 &= 1301301248;
                        var33 -= -1494025167;
                        var33 ^= -403182430;
                        break label50;
                    }

                    var33 &= 243264869;
                    var33 += 698792557;
                    var33 &= 2039790530;
                    var33 ^= 589891690;
                    var33 ^= 322581587;
                    byte[] var4 = this.Qh;
                    Object var59 = var4.clone();
                    var59 = (byte[])var59;
                    long var5 = var2;
                    long var7 = var5 + 1L;
                    var7 = var5 * var7;
                    long var9 = var5 + 2L;
                    var7 *= var9;
                    var5 += 3L;
                    var7 *= var5;
                    var5 = var7 & 7L;
                    long var78;
                    var2 = (var78 = var5 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        var33 ^= -1685494700;
                        var33 += 573387415;
                        var33 >>>= 3;
                        var33 |= -349850438;
                        var33 ^= 2012516703;
                        Integer var46 = var33;
                        if (var46 == null) {
                            break label51;
                        }

                        var53 = (byte[])var59;
                        var33 *= 1611662605;
                        var33 *= -1608660075;
                        var33 >>= 20;
                        var33 ^= -2105876205;
                        break label50;
                    }

                    switch (var33) {
                        case 135773881:
                            var33 *= -1993014623;
                            var33 += -573022358;
                            var33 <<= 15;
                            var33 ^= 1335932038;
                            break;
                        case 1168772038:
                        default:
                            var33 ^= 1986898165;
                            break;
                        case 1495965440:
                            var33 ^= 1493743119;
                    }
                } else {
                    switch (var33) {
                        case -1931002998:
                        default:
                            var33 ^= 587121788;
                            break;
                        case 134869389:
                            var33 ^= 1216352815;
                            break;
                        case 799839662:
                            var33 &= -161566798;
                            var33 ^= -2008174300;
                    }
                }

                var2 = var33 + 1;
                var2 = var33 * var2;
                int var58 = var33 + 2;
                var2 *= var58;
                var33 += 3;
                var2 *= var33;
                var33 = var2 & 7;
                if (var33 == 0) {
                    AssertionError var44 = new AssertionError();
                    throw var44;
                }
                break label51;
            }

            long var61 = var33;
            long var6 = var61 + 1L;
            var6 = var61 * var6;
            long var8 = var61 + 2L;
            var6 *= var8;
            var61 += 3L;
            var6 *= var61;
            var61 = var6 & 7L;
            long var79;
            int var47 = (var79 = var61 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
            if (var47 == 0) {
                return var53;
            }
        }

        AssertionError var43 = new AssertionError();
        throw var43;
    }

    public String I() {
        int var1 = m;
        var1 ^= 397109901;
        int var2 = System.identityHashCode(this);
        Integer var20 = var2;
        if (var20 != null) {
            var1 ^= -1854453820;
            var1 -= -2015232768;
            var1 >>>= 26;
            var1 ^= 417328920;
            long var21 = var1;
            long var4 = var21 + 1L;
            var4 = var21 * var4;
            long var22 = var4 & 1L;
            long var29;
            int var23 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var23 == 0) {
                return this.tf;
            }
        } else {
            var1 *= -1677853439;
            var1 |= -2026003020;
            var1 ^= 2002938949;
            var1 ^= 1217290234;
            var1 ^= 666307727;
            int var24 = var1 + 1;
            var24 = var1 * var24;
            int var3 = var1 + 2;
            var24 *= var3;
            var1 += 3;
            var24 *= var1;
            var1 = var24 & 7;
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1524373877;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        m = var4;
    }
}
