package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public final class gZ {
    private static final SecureRandom oN;
    private static final char[] K;
    public static final int l;

    private gZ() {
    }

    public static byte[] Pp(int var0) {
        int var1 = l;
        var1 ^= -877975818;
        byte[] var4 = new byte[var0];
        SecureRandom var5 = oN;
        int var6 = var0 + 1;
        var6 = var0 * var6;
        int var3 = var6 & 1;
        if (var3 != 0) {
            switch (var1) {
                case -2067181032:
                    var1 ^= -910042480;
                    break;
                case -502130225:
                default:
                    var1 ^= -248841007;
                    break;
                case 1208229766:
                    var1 -= 19790968;
                    var1 ^= 835773251;
            }

            long var26 = var0;
            long var8 = var26 + 1L;
            var8 = var26 * var8;
            long var10 = var26 + 2L;
            var8 *= var10;
            long var27 = var26 + 3L;
            var8 *= var27;
            long var28 = var8 & 7L;
            long var32;
            var3 = (var32 = var28 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            var1 += -1592563333;
            var1 |= -711272387;
            var1 += -1933953609;
            var1 ^= 1888872653;
            Integer var21 = var0;
            if (var21 != null) {
                var5.nextBytes(var4);
                return var4;
            }
        }

        RuntimeException var22 = new RuntimeException();
        throw var22;
    }

    public static byte[] Ls(String var0, byte[]... var1) {
        label88: {
            int var2 = l;
            var2 ^= 1442168753;
            int var3 = System.identityHashCode(var0);
            int var4 = var2 * -851707701;
            var4 |= -734911382;
            var4 -= 1322643038;
            var4 ^= 606871900;
            MessageDigest var52 = zY(var4);
            MessageDigest var53 = var52;
            byte[] var5 = U(var0);
            long var6 = var3;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var87;
            int var59 = (var87 = var6 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
            if (var59 == 0) {
                var2 += 322608953;
                var2 ^= -726496015;
                var2 ^= 597457204;
                int var60 = var2 + 1;
                int var61 = var2 * var60;
                int var7 = var2 + 2;
                int var62 = var61 * var7;
                var7 = var2 + 3;
                int var63 = var62 * var7;
                int var64 = var63 & 7;
                if (var64 != 0) {
                    break label88;
                }

                var52.update(var5);
                var52.update((byte)0);
                byte var54 = 0;
                int var55 = var54;

                var2 = switch (var2) {
                    case -14350307 -> var2 ^ 1262348927;
                    case 515625023 -> {
                        var2 ^= -1870154930;
                        var2 &= 152496185;
                        var2 -= -545379610;
                        var2 ^= -1200785785;
                        yield var2 ^ -615272563;
                    }
                    default -> var2 ^ 935450069;
                };

                label78:
                while (true) {
                    Integer var65 = var2;
                    if (var65 == null) {
                        break label88;
                    }

                    int var66 = var1.length;
                    Integer var76 = var3;
                    if (var76 == null) {
                        switch (var2) {
                            case -188791728:
                            default:
                                var2 ^= 2102655442;
                                break label78;
                            case 943162857:
                                var2 ^= 992447579;
                                break label78;
                            case 1269361729:
                                var2 *= 1703964299;
                                var2 ^= -956742953;
                                var2 |= 1680365460;
                                var2 ^= -786351242;
                                break label78;
                        }
                    }

                    var2 &= 745926654;
                    var2 ^= -678575789;
                    var2 &= 1942628010;
                    var2 *= -1622459173;
                    var2 ^= -704440770;
                    int var77 = var2 + 1;
                    var77 = var2 * var77;
                    var77 &= 1;
                    if (var77 != 0) {
                        break label88;
                    }

                    if (var55 >= var66) {
                        long var56 = switch (var2) {
                            case -1513052313 -> var2 ^ -605268536;
                            case -25275512 -> {
                                var2 ^= -846734549;
                                yield var2 ^ 1361177181;
                            }
                            default -> var2 ^ 1768046077;
                        };
                        long var80 = var56 + 1L;
                        long var81 = var56 * var80;
                        long var57 = var81 & 1L;
                        long var89;
                        var3 = (var89 = var57 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return var53.digest();
                        }
                        break label88;
                    }

                    var2 |= 542151544;
                    var2 ^= -1695259560;
                    var6 = var2;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var88;
                    int var70 = (var88 = var6 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                    if (var70 != 0) {
                        break label88;
                    }

                    byte[] var71 = var1[var55];
                    var53.update(var71);
                    Integer var72 = var3;
                    if (var72 == null) {
                        switch (var2) {
                            case -1331695731:
                            default:
                                var2 ^= -1508268779;
                                break label78;
                            case 525713571:
                                var2 ^= -751960000;
                                break label78;
                            case 1686812576:
                                var2 *= 1702360261;
                                var2 |= -1802044841;
                                var2 |= 731831636;
                                var2 &= -685296197;
                                var2 ^= -1287947815;
                                break label78;
                        }
                    }

                    var2 |= 1821571726;
                    var2 ^= -1908107119;
                    Integer var73 = var2;
                    if (var73 == null) {
                        break label88;
                    }

                    int var74 = var55 + 1;
                    var55 = var74;
                    var2 -= 1109901072;
                    var2 ^= 537830425;
                    var2 *= -909495967;
                    var2 ^= 1124473399;
                }
            } else {
                var2 ^= 1321191840;
                var2 ^= -35462852;
                var2 ^= 1092346551;
            }

            Integer var45 = var2;
            if (var45 != null) {
                IllegalArgumentException var46 = new IllegalArgumentException();
                throw var46;
            }
        }

        RuntimeException var47 = new RuntimeException();
        throw var47;
    }

    public static byte[] u(byte[] var0) {
        int var1 = l;
        var1 ^= -1009650297;
        int var2 = System.identityHashCode(var0);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 ^= -947996857;
            var1 -= 1916705216;
            var1 ^= 979170186;
            var1 ^= -324049448;
            IllegalStateException var21 = new IllegalStateException();
            throw var21;
        } else {
            var1 >>>= 23;
            var1 *= -883598299;
            var1 ^= 1697160463;
            var1 += 511515828;
            var1 ^= -1771464722;
            var1 *= -400365517;
            var1 >>>= 31;
            var1 ^= -1392170928;
            MessageDigest var14 = zY(var1);
            return var14.digest(var0);
        }
    }

    public static boolean S(byte[] var0, byte[] var1) {
        int var2 = l;
        var2 ^= 922680037;
        int var3 = System.identityHashCode(var0);
        Integer var4 = var3;
        int var5 = of_2.S;
        var2 ^= var5;
        var2 ^= 1615241382;
        of_2.S = 1615241382;
        var5 = of_2.GF;
        var2 ^= var5;
        var2 ^= -1078108660;
        of_2.GF = -1078108660;
        label77:
        if (var4 != null) {
            var2 = switch (var2) {
                case -1252932715 -> {
                    var2 |= 251163150;
                    var2 *= 376694195;
                    var2 &= 1182347093;
                    yield var2 ^ -130316163;
                }
                case -483875396 -> var2 ^ -1747712100;
                default -> var2 ^ 1922601652;
            };
            int var62 = var2 + 1;
            var62 = var2 * var62;
            var62 &= 1;
            label64:
            if (var62 == 0) {
                if (var0 != null) {
                    var2 ^= 572227676;
                    var2 ^= -1410757389;
                    long var65 = var2;
                    long var6 = var65 + 1L;
                    var6 = var65 * var6;
                    long var8 = var65 + 2L;
                    var6 *= var8;
                    long var66 = var65 + 3L;
                    var6 *= var66;
                    long var67 = var6 & 7L;
                    long var86;
                    var62 = (var86 = var67 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                    if (var62 != 0) {
                        break label64;
                    }

                    if (var1 != null) {
                        var2 >>>= 29;
                        var2 ^= 1933100042;
                        var2 ^= -432092699;
                        boolean var69 = MessageDigest.isEqual(var0, var1);
                        var5 = var3 + 1;
                        var5 = var3 * var5;
                        var3 = var5 & 1;
                        if (var3 != 0) {
                            var2 >>>= 12;
                            var2 ^= 1855090074;
                            break label77;
                        }

                        var2 -= 545522335;
                        var2 <<= 7;
                        var2 -= 1057161416;
                        var2 ^= 115157398;
                        long var76 = var2;
                        long var7 = var76 + 1L;
                        var7 = var76 * var7;
                        long var77 = var7 & 1L;
                        long var87;
                        var3 = (var87 = var77 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                        if (var3 != 0) {
                            break label64;
                        }

                        if (var69) {
                            var2 |= -2066440179;
                            var2 += 488017145;
                            var2 ^= 1981447614;
                            long var57 = var2;
                            long var78 = var57 + 1L;
                            long var79 = var57 * var78;
                            long var58 = var79 & 1L;
                            long var88;
                            var3 = (var88 = var58 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                            if (var3 != 0) {
                                break label64;
                            }

                            boolean var60 = true;
                            switch (var2) {
                                case -672382570:
                                    var2 |= -546644711;
                                    var2 ^= 1799023826;
                                    return var60;
                                case 1443173826:
                                default:
                                    var2 ^= 1916832770;
                                    return var60;
                                case 1459644463:
                                    var2 ^= 751277518;
                                    return var60;
                            }
                        }

                        var2 &= 286112113;
                        var2 -= -857966241;
                        var2 |= 1170833138;
                        var2 ^= 1977451862;
                    } else {
                        var2 <<= 29;
                        var2 += -870703042;
                        var2 ^= -1371612517;
                    }
                } else {
                    var2 |= -2040645314;
                    var2 <<= 27;
                    var2 ^= -232457563;
                }

                long var70 = var2;
                long var83 = var70 + 1L;
                var83 = var70 * var83;
                long var71 = var83 & 1L;
                long var89;
                var62 = (var89 = var71 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                if (var62 == 0) {
                    boolean var90 = false;
                    switch (var2) {
                        case 35977893:
                            var2 |= 1088018966;
                            var2 -= -2079769882;
                            var2 >>>= 28;
                            var2 >>>= 20;
                            var2 ^= -1261162163;
                            break;
                        case 1331632065:
                        default:
                            var2 ^= 1324875898;
                            break;
                        case 1917517822:
                            var2 ^= 754178010;
                    }

                    return var90;
                }
            }

            AssertionError var61 = new AssertionError();
            throw var61;
        } else {
            var2 &= 468235058;
            var2 ^= 2145107690;
        }

        AssertionError var43 = new AssertionError();
        throw var43;
    }

    public static byte[] U(String var0) {
        int var1 = l;
        var1 ^= -1341838759;
        int var2 = System.identityHashCode(var0);
        int var3 = var0.length();
        Integer var4 = var2;
        int var5 = of_2.S;
        var1 ^= var5;
        var1 ^= 1615241382;
        var5 = of_2.GF;
        var1 ^= var5;
        var1 ^= -1078108660;
        if (var4 == null) {
            var1 -= 611020788;
            var1 ^= 1692960076;
        } else {
            label112: {
                var1 &= -1072472137;
                var1 ^= 1984266347;
                int var73 = var1 + 1;
                var73 = var1 * var73;
                var73 &= 1;
                if (var73 == 0) {
                    byte[] var71 = new byte[var3];
                    byte[] var72 = var71;
                    int var76 = 0;
                    var76 = var76;
                    var1 += -209307441;
                    var1 ^= 1069546277;
                    var1 &= 1495491343;
                    var1 ^= 943937625;

                    while (true) {
                        Integer var79 = var1;
                        if (var79 == null) {
                            break;
                        }

                        int var80 = var72.length;
                        long var6 = var2;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var106;
                        int var85 = (var106 = var6 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                        if (var85 != 0) {
                            var1 |= 1974764832;
                            var1 >>= 5;
                            var1 += -1853700930;
                            var1 ^= -22785344;
                            break label112;
                        }

                        var1 += 297278771;
                        var1 ^= 377159116;
                        int var86 = var1 + 1;
                        int var87 = var1 * var86;
                        int var88 = var87 & 1;
                        if (var88 != 0) {
                            break;
                        }

                        if (var76 < var80) {
                            var1 ^= -1465294036;
                            var1 ^= 543836046;
                            int var81 = var0.charAt(var76);
                            var6 = var2;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var107;
                            int var91 = (var107 = var6 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                            if (var91 != 0) {
                                var1 |= -653447690;
                                var1 ^= -1770304625;
                                break label112;
                            }

                            var1 -= -1504676767;
                            var1 -= -127354529;
                            var1 >>= 29;
                            var1 += -1771638341;
                            var1 ^= -563265403;
                            Integer var92 = var1;
                            if (var92 == null) {
                                break;
                            }

                            if (var81 >= 32) {
                                var1 |= -1096742847;
                                var1 &= 781687067;
                                var1 *= 815043417;
                                var1 <<= 1;
                                var1 ^= 854112184;
                                var6 = var1;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                long var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var108;
                                int var96 = (var108 = var6 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                                if (var96 != 0) {
                                    break;
                                }

                                if (var81 <= 126) {
                                    var1 = switch (var1) {
                                        case -827931605 -> var1 ^ 1405048987;
                                        case -321675558 -> {
                                            var1 ^= 1520076734;
                                            var1 += 1691774118;
                                            var1 |= 1642214317;
                                            yield var1 ^ 129831095;
                                        }
                                        default -> var1 ^ 1610728016;
                                    };
                                    byte var82 = (byte)var81;
                                    Integer var97 = var2;
                                    if (var97 == null) {
                                        var1 ^= -1313379307;
                                        var1 -= -394846426;
                                        var1 += -261522936;
                                        var1 ^= -1103232106;
                                        break label112;
                                    }

                                    var1 |= 9564216;
                                    var1 -= 2044025164;
                                    var1 ^= -1071294197;
                                    var1 ^= -330251937;
                                    Integer var98 = var1;
                                    if (var98 == null) {
                                        break;
                                    }

                                    var72[var76] = var82;
                                    var81 = var76 + 1;
                                    var76 = var81;
                                    var1 += 1374459838;
                                    var1 ^= -401152477;
                                    continue;
                                }

                                var1 += -1088192494;
                                var1 ^= -1365557857;
                            } else {
                                switch (var1) {
                                    case -1537858590:
                                        var1 ^= -146573829;
                                        break;
                                    case 153845242:
                                    default:
                                        var1 ^= -1637362523;
                                        break;
                                    case 1208725816:
                                        var1 &= 1147909824;
                                        var1 ^= 1164415859;
                                }
                            }

                            Integer var68 = var1;
                            if (var68 != null) {
                                IllegalArgumentException var69 = new IllegalArgumentException("printable ASCII only");
                                throw var69;
                            }
                            break;
                        }
                        Integer var67 = switch (var1) {
                            case -1984082961 -> var1 ^ -287037043;
                            default -> var1 ^ 267235433;
                            case 1818453316 -> {
                                var1 -= -634330834;
                                var1 *= -1680659239;
                                var1 >>= 12;
                                var1 |= 998569055;
                                yield var1 ^ 1862988905;
                            }
                        };
                        if (var67 != null) {
                            return var72;
                        }
                        break;
                    }
                }

                AssertionError var70 = new AssertionError();
                throw var70;
            }
        }

        RuntimeException var66 = new RuntimeException();
        throw var66;
    }

    public static String P(byte[] var0) {
        int var1 = l;
        var1 ^= -1761665164;
        int var2 = System.identityHashCode(var0);
        Integer var12 = var2;
        if (var12 == null) {
            var1 += 1123448306;
            var1 ^= 818244350;
            var1 >>>= 6;
            var1 ^= 633456017;
            var12 = var1;
            if (var12 != null) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            } else {
                UnsupportedOperationException var15 = new UnsupportedOperationException();
                throw var15;
            }
        } else {
            switch (var1) {
                case -298321120:
                default:
                    var1 ^= -1978217129;
                    break;
                case 357574148:
                    var1 |= -117160868;
                    var1 ^= -600328367;
                    break;
                case 1645839519:
                    var1 ^= -643332445;
            }

            Charset var13 = StandardCharsets.US_ASCII;
            return new String(var0, var13);
        }
    }

    public static String v(byte[] var0) {
        label72: {
            int var1 = l;
            var1 ^= -1801989410;
            int var2 = System.identityHashCode(var0);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            var3 = var5 & 1L;
            long var113;
            int var55 = (var113 = var3 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
            if (var55 != 0) {
                var1 -= -2101923567;
                var1 ^= 1760636596;
            } else {
                var1 <<= 16;
                var1 ^= 1006977300;
                var1 ^= -1183951890;
                var3 = var1;
                var5 = var3 + 1L;
                var5 = var3 * var5;
                var3 = var5 & 1L;
                long var114;
                int var58 = (var114 = var3 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                if (var58 != 0) {
                    break label72;
                }

                int var59 = var0.length;
                int var60 = var59 * 2;
                char[] var61 = new char[var60];
                char[] var62 = var61;
                int var4 = 0;
                var4 = var4;
                var1 ^= -557006960;
                var1 >>= 13;
                var1 &= 1956646307;
                var1 >>>= 30;
                var1 ^= -107258151;

                while (true) {
                    int var70 = var0.length;
                    int var6 = var2 + 1;
                    var6 = var2 * var6;
                    int var7 = var2 + 2;
                    var6 *= var7;
                    var7 = var2 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        var1 |= -1474639798;
                        var1 *= 1818764489;
                        var1 ^= 1727304158;
                        var1 ^= -36920099;
                        break;
                    }
                    var1 = switch (var1) {
                        case -107258152 -> {
                            var1 += 1287568396;
                            var1 -= 752225668;
                            var1 >>= 20;
                            yield var1 ^ 1613157184;
                        }
                        case 86485713 -> var1 ^ 215191633;
                        default -> var1 ^ 550320439;
                    };
                    Integer var84 = var1;
                    if (var84 == null) {
                        break label72;
                    }

                    if (var4 >= var70) {
                        var1 ^= 687726211;
                        var1 &= -769528915;
                        var1 >>>= 8;
                        var1 ^= 1013555787;
                        long var64 = var1;
                        long var91 = var64 + 1L;
                        long var92 = var64 * var91;
                        long var107 = var64 + 2L;
                        long var93 = var92 * var107;
                        long var65 = var64 + 3L;
                        long var94 = var93 * var65;
                        long var66 = var94 & 7L;
                        long var117;
                        var2 = (var117 = var66 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                        if (var2 == 0) {
                            return new String(var62);
                        }
                        break label72;
                    }

                    var1 ^= 1580251981;
                    var1 *= 1347152553;
                    var1 &= 39916550;
                    var1 *= 1617008561;
                    var1 ^= 1126365524;
                    int var71 = var1 + 1;
                    int var72 = var1 * var71;
                    int var85 = var1 + 2;
                    int var73 = var72 * var85;
                    var85 = var1 + 3;
                    int var74 = var73 * var85;
                    int var75 = var74 & 7;
                    if (var75 != 0) {
                        break label72;
                    }

                    int var76 = var4 * 2;
                    char[] var87 = K;
                    int var96 = var0[var4];
                    var96 >>= 4;
                    var96 &= 15;
                    char var88 = var87[var96];
                    var62[var76] = var88;
                    int var77 = var4 * 2;
                    var77++;
                    char[] var89 = K;
                    int var99 = var0[var4];
                    long var8 = var2;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    long var12 = var8 + 2L;
                    var10 *= var12;
                    var8 += 3L;
                    var10 *= var8;
                    var8 = var10 & 7L;
                    long var115;
                    int var103 = (var115 = var8 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                    if (var103 != 0) {
                        var1 &= 1005996463;
                        var1 ^= -149496407;
                        break;
                    }

                    var1 >>= 5;
                    var1 += 1784985510;
                    var1 |= -971374076;
                    var1 ^= -2008742626;
                    var8 = var1;
                    var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var116;
                    int var106 = (var116 = var8 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                    if (var106 != 0) {
                        break label72;
                    }

                    var99 &= 15;
                    var88 = var89[var99];
                    var62[var77] = var88;
                    int var79 = var4 + 1;
                    var4 = var79;
                    var1 <<= 29;
                    var1 <<= 3;
                    var1 ^= 860378384;
                    var1 >>>= 31;
                    var1 ^= -107258152;
                }
            }

            Integer var50 = var1;
            if (var50 != null) {
                RuntimeException var52 = new RuntimeException();
                throw var52;
            }
        }

        RuntimeException var51 = new RuntimeException();
        throw var51;
    }

    public static byte[] oF(String var0) {
        label171: {
            int var68;
            label156: {
                var68 = l;
                var68 ^= 1369932579;
                int var2 = System.identityHashCode(var0);
                int var3 = var0.length();
                int var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 == 0) {
                    var68 |= 116870759;
                    var68 ^= -1648809504;
                    var68 &= -1065889388;
                    var68 += 610541960;
                    var68 ^= 1943830731;
                    var4 = var68 + 1;
                    var4 = var68 * var4;
                    int var5 = var68 + 2;
                    var4 *= var5;
                    var5 = var68 + 3;
                    var4 *= var5;
                    var4 &= 7;
                    if (var4 != 0) {
                        break label171;
                    }

                    var3 &= 1;
                    if (var3 != 0) {
                        var68 *= 990836539;
                        var68 -= -1544865322;
                        var68 += -1382048180;
                        var68 *= 783448161;
                        var68 ^= 822015201;
                        var3 = var68 + 1;
                        var3 = var68 * var3;
                        var4 = var68 + 2;
                        var3 *= var4;
                        var4 = var68 + 3;
                        var3 *= var4;
                        var3 &= 7;
                        if (var3 == 0) {
                            IllegalArgumentException var111 = new IllegalArgumentException("odd hex length");
                            throw var111;
                        }
                        break label171;
                    }
                    var68 = switch (var68) {
                        case 393638871 -> {
                            var68 -= 1058353622;
                            yield var68 ^ 697993317;
                        }
                        case 1775171220 -> var68 ^ -554656300;
                        default -> var68 ^ -1388787940;
                    };
                    long var95 = var68;
                    long var131 = var95 + 1L;
                    long var132 = var95 * var131;
                    long var96 = var132 & 1L;
                    long var181;
                    var3 = (var181 = var96 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        break label171;
                    }

                    var3 = var0.length();
                    var3 /= 2;
                    var4 = var2 + 1;
                    var4 = var2 * var4;
                    var4 &= 1;
                    if (var4 == 0) {
                        var68 = switch (var68) {
                            case -235156892 -> {
                                var68 &= -922489893;
                                var68 -= 203246564;
                                var68 >>>= 6;
                                yield var68 ^ -441951709;
                            }
                            case 1968048877 -> var68 ^ 326716996;
                            default -> var68 ^ -1112103416;
                        };
                        Integer var122 = var68;
                        if (var122 == null) {
                            break label171;
                        }

                        byte[] var100 = new byte[var3];
                        byte[] var101 = var100;
                        byte var123 = 0;
                        int var124 = var123;
                        var68 &= 1695315027;
                        var68 += 1464497568;
                        var68 ^= -1624803873;

                        while (true) {
                            Integer var133 = var68;
                            if (var133 == null) {
                                break label171;
                            }

                            int var134 = var101.length;
                            int var6 = var2 + 1;
                            var6 = var2 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                var68 &= 666402649;
                                var68 ^= -619347493;
                                break;
                            }

                            var68 *= -1492993429;
                            var68 |= -161886152;
                            var68 *= 1641639423;
                            var68 ^= 1923954678;
                            Integer var149 = var68;
                            if (var149 == null) {
                                break label171;
                            }

                            if (var124 >= var134) {
                                var68 |= 1756117303;
                                var68 *= 694109257;
                                var68 ^= 1405034742;
                                var2 = var68 + 1;
                                var2 = var68 * var2;
                                var2 &= 1;
                                if (var2 == 0) {
                                    return var101;
                                }
                                break label171;
                            }

                            var68 &= 693992729;
                            var68 -= -1276551275;
                            var68 ^= 446568391;
                            var68 ^= -291245511;
                            long var135 = var68;
                            long var7 = var135 + 1L;
                            var7 = var135 * var7;
                            long var9 = var135 + 2L;
                            var7 *= var9;
                            long var136 = var135 + 3L;
                            var7 *= var136;
                            long var137 = var7 & 7L;
                            long var182;
                            var134 = (var182 = var137 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                            if (var134 != 0) {
                                break label171;
                            }

                            var134 = var124 * 2;
                            int var140 = var0.charAt(var134);
                            var140 = Character.digit((char)var140, 16);
                            int var150 = var124 * 2;
                            int var152 = var0.charAt(++var150);
                            int var169 = var2 + 1;
                            int var170 = var2 * var169;
                            int var171 = var170 & 1;
                            if (var171 != 0) {
                                var68 ^= -226230024;
                                var68 >>>= 26;
                                var68 ^= 1529905043;
                                var68 ^= -1558856109;
                                break;
                            }

                            var68 &= -1796948575;
                            var68 ^= 1039542040;
                            var68 >>= 13;
                            var68 ^= 1007038733;
                            Integer var172 = var68;
                            if (var172 == null) {
                                break label171;
                            }

                            var152 = Character.digit((char)var152, 16);
                            if (var140 < 0) {
                                var68 &= -1557710323;
                                var68 -= 1942110831;
                                var68 ^= 256261493;
                                break label156;
                            }
                            var68 = switch (var68) {
                                default -> var68 ^ -630604404;
                                case -1449693626 -> var68 ^ 1517467933;
                                case -1006936420 -> {
                                    var68 >>>= 23;
                                    var68 -= 122028091;
                                    var68 |= 1945464217;
                                    var68 += -403792214;
                                    yield var68 ^ -1537695343;
                                }
                            };
                            int var173 = var68 + 1;
                            int var174 = var68 * var173;
                            int var175 = var174 & 1;
                            if (var175 != 0) {
                                break label171;
                            }

                            if (var152 < 0) {
                                var68 ^= -1491127463;
                                var68 ^= -527469401;
                                break label156;
                            }

                            var68 >>>= 11;
                            var68 += -1312685945;
                            var68 >>= 27;
                            var68 >>>= 26;
                            var68 ^= 856095576;
                            int var176 = var68 + 1;
                            int var177 = var68 * var176;
                            int var178 = var177 & 1;
                            if (var178 != 0) {
                                break label171;
                            }

                            var140 <<= 4;
                            var140 |= var152;
                            var152 = var2 + 1;
                            var152 = var2 * var152;
                            int var179 = var2 + 2;
                            var152 *= var179;
                            int var180 = var2 + 3;
                            var152 *= var180;
                            var152 &= 7;
                            if (var152 != 0) {
                                var68 += -1992871555;
                                var68 += 2035664165;
                                var68 <<= 18;
                                var68 -= -62749404;
                                var68 ^= 868530958;
                                break;
                            }
                            var68 = switch (var68) {
                                default -> var68 ^ -1875711548;
                                case 856095591 -> {
                                    var68 ^= -783291768;
                                    var68 &= 1594408118;
                                    yield var68 ^ -629730413;
                                }
                                case 1338912224 -> var68 ^ 1654655010;
                            };
                            var152 = var68 + 1;
                            var152 = var68 * var152;
                            var152 &= 1;
                            if (var152 != 0) {
                                break label171;
                            }

                            int var144 = (byte)var140;
                            var101[var124] = (byte)var144;
                            var144 = var124 + 1;
                            var124 = var144;
                            var68 ^= -1750801858;
                            var68 ^= -380823731;
                            var68 <<= 12;
                            var68 *= 721046899;
                            var68 ^= -645734355;
                        }
                    } else {
                        switch (var68) {
                            case -1723451226:
                                var68 ^= 1909889076;
                                break;
                            case -552997082:
                            default:
                                var68 ^= 1989143778;
                                break;
                            case -235156892:
                                var68 += -1477907295;
                                var68 &= 19224955;
                                var68 <<= 27;
                                var68 &= -945581839;
                                var68 ^= -131743278;
                        }
                    }
                } else {
                    var68 += 1557670168;
                    var68 -= -1895327789;
                    var68 -= 1163595898;
                    var68 ^= -1571030324;
                }

                long var78 = var68;
                long var102 = var78 + 1L;
                long var103 = var78 * var102;
                long var146 = var78 + 2L;
                long var104 = var103 * var146;
                long var79 = var78 + 3L;
                long var105 = var104 * var79;
                long var80 = var105 & 7L;
                long var183;
                var68 = (var183 = var80 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                if (var68 == 0) {
                    IllegalStateException var82 = new IllegalStateException();
                    throw var82;
                }
                break label171;
            }

            long var125 = var68;
            long var162 = var125 + 1L;
            var162 = var125 * var162;
            long var8 = var125 + 2L;
            var162 *= var8;
            var125 += 3L;
            var162 *= var125;
            var125 = var162 & 7L;
            long var184;
            int var89 = (var184 = var125 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
            if (var89 == 0) {
                IllegalArgumentException var90 = new IllegalArgumentException("not hex");
                throw var90;
            }
        }

        IllegalArgumentException var88 = new IllegalArgumentException();
        throw var88;
    }

    public static String o(byte[] var0) {
        String var57 = null;
        label79: {
            int var1 = l;
            var1 ^= -1644065491;
            int var2 = System.identityHashCode(var0);
            Integer var3 = var2;
            if (var3 == null) {
                var1 >>>= 9;
                var1 |= -1633465351;
                var1 ^= 1354162565;
            } else {
                label84: {
                    label69: {
                        var1 += 1691076967;
                        var1 *= -14430649;
                        var1 ^= 194934811;
                        if (var0 != null) {
                            var1 = switch (var1) {
                                case -534285638 -> var1 ^ -1489325139;
                                default -> var1 ^ 1787499960;
                                case 627499335 -> {
                                    var1 -= -1804148224;
                                    yield var1 ^ 2128310804;
                                }
                            };
                            var3 = var1;
                            if (var3 == null) {
                                break label79;
                            }

                            int var59 = var0.length;
                            long var4 = var2;
                            long var6 = var4 + 1L;
                            var6 = var4 * var6;
                            long var8 = var4 + 2L;
                            var6 *= var8;
                            var4 += 3L;
                            var6 *= var4;
                            var4 = var6 & 7L;
                            long var91;
                            int var72 = (var91 = var4 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                            if (var72 != 0) {
                                var1 |= 863939294;
                                var1 &= 81533091;
                                var1 ^= -2110553893;
                                var1 >>= 23;
                                var1 ^= 837206386;
                                break label84;
                            }

                            var1 &= -821221107;
                            var1 += 760676906;
                            var1 ^= 1516993108;
                            var1 *= 2085745119;
                            var1 ^= -1239721149;
                            var4 = var1;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var8 = var4 + 2L;
                            var6 *= var8;
                            var4 += 3L;
                            var6 *= var4;
                            var4 = var6 & 7L;
                            long var92;
                            int var76 = (var92 = var4 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                            if (var76 != 0) {
                                break label79;
                            }

                            if (var59 >= 4) {
                                var1 &= 1273480481;
                                var1 ^= -1778008659;
                                var59 = var1 + 1;
                                var59 = var1 * var59;
                                int var77 = var1 + 2;
                                var59 *= var77;
                                int var78 = var1 + 3;
                                var59 *= var78;
                                var59 &= 7;
                                if (var59 != 0) {
                                    break label79;
                                }

                                byte[] var65 = new byte[4];
                                var4 = var2;
                                var6 = var4 + 1L;
                                var6 = var4 * var6;
                                var4 = var6 & 1L;
                                long var93;
                                var2 = (var93 = var4 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                                if (var2 != 0) {
                                    var1 ^= 1466517691;
                                    var1 ^= 2007402284;
                                    var1 ^= 1005734244;
                                    break label84;
                                }

                                var1 += -1915566656;
                                var1 &= -69284192;
                                var1 -= -3979570;
                                var1 *= -1121946451;
                                var1 ^= -303817546;
                                Integer var51 = var1;
                                if (var51 == null) {
                                    break label79;
                                }

                                byte var52 = var0[0];
                                var65[0] = var52;
                                byte var53 = var0[1];
                                var65[1] = var53;
                                byte var54 = var0[2];
                                var65[2] = var54;
                                byte var55 = var0[3];
                                var65[3] = var55;
                                String var56 = v(var65);
                                var57 = var56;
                                var1 -= -972075447;
                                var1 ^= -2016509075;
                                var1 |= -1614524677;
                                var1 ^= 607700941;
                                break label69;
                            }

                            var1 ^= 477325665;
                            var1 ^= 428293692;
                        } else {
                            var1 -= -1428386112;
                            var1 ^= -1201720776;
                        }

                        var57 = "-";
                        var1 ^= -1462368465;
                        var1 &= 2076202335;
                        var1 <<= 23;
                        var1 += 2053004121;
                        var1 ^= -108833941;
                    }

                    int var66 = var1 + 1;
                    var66 = var1 * var66;
                    var1 = var66 & 1;
                    if (var1 == 0) {
                        return var57;
                    }
                    break label79;
                }
            }

            var3 = var1;
            if (var3 != null) {
                RuntimeException var69 = new RuntimeException();
                throw var69;
            }
        }

        UnsupportedOperationException var49 = new UnsupportedOperationException();
        throw var49;
    }

    private static MessageDigest zY(int var0) {
        label47: {
            Throwable var1;
            int var21;
            label46: {
                label49: {
                    try {
                        Object var3 = null;
                        var21 = var0 & -1303831884;
                        var21 >>>= 23;
                        var21 >>>= 10;
                        var21 *= -1875038091;
                        var21 ^= -1118877601;
                    } catch (Throwable var11) {
                        var1 = var11;
                        var21 = l;
                        var21 ^= -866859555;
                        boolean var5 = var11 instanceof NoSuchAlgorithmException;
                        var21 ^= 1439579613;
                        var21 ^= 383700754;
                        if (!var5) {
                            break label46;
                        }
                        break label49;
                    }

                    long var4 = var21;
                    long var6 = var4 + 1L;
                    var6 = var4 * var6;
                    long var8 = var4 + 2L;
                    var6 *= var8;
                    var4 += 3L;
                    var6 *= var4;
                    var4 = var6 & 7L;
                    long var67;
                    int var57 = (var67 = var4 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                    if (var57 != 0) {
                        break label47;
                    }

                    try {
                        MessageDigest var58 = MessageDigest.getInstance("SHA-256");
                        var21 ^= 96471270;
                        var21 &= -1945395999;
                        var21 += 614048209;
                        var21 ^= -1499708880;
                        return var58;
                    } catch (Throwable var10) {
                        var1 = var10;
                        var21 = l;
                        var21 ^= -866859555;
                        boolean var59 = var10 instanceof NoSuchAlgorithmException;
                        var21 ^= 1439579613;
                        var21 ^= 383700754;
                        if (!var59) {
                            break label46;
                        }
                    }
                }

                var21 += 1961158251;
                var21 ^= 1782595971;
                var21 ^= 1596616038;
                Integer var60 = var21;
                if (var60 != null) {
                    NoSuchAlgorithmException var52 = (NoSuchAlgorithmException)var1;
                    var21 += -607344370;
                    var21 <<= 2;
                    var21 |= 685255599;
                    var21 ^= 674621089;
                    int var12 = var21 + 1;
                    int var13 = var21 * var12;
                    int var61 = var21 + 2;
                    int var14 = var13 * var61;
                    var61 = var21 + 3;
                    int var15 = var14 * var61;
                    int var16 = var15 & 7;
                    if (var16 == 0) {
                        var21 &= 1471437029;
                        var21 += -994160475;
                        var21 -= -726431126;
                        var21 *= -1947725187;
                        var21 ^= 935597918;
                        int var53 = var21 + 1;
                        int var54 = var21 * var53;
                        var21 = var54 & 1;
                        if (var21 == 0) {
                            IllegalStateException var43 = new IllegalStateException("SHA-256 missing from the JDK", var52);
                            throw var43;
                        }
                    }
                }
                break label47;
            }

            var21 &= 1695479287;
            var21 += -950299117;
            var21 <<= 19;
            var21 ^= 1411787617;
            Integer var63 = var21;
            if (var63 != null) {
                throw UncheckedExceptions.rethrow(var1);
            }
        }

        UnsupportedOperationException var18 = new UnsupportedOperationException();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1981522874;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        l = var4;
        SecureRandom var5 = new SecureRandom();
        oN = var5;
        char[] var6 = "0123456789abcdef".toCharArray();
        K = var6;
    }
}
