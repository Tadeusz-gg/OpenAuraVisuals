package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class Gb {
    private final byte[] V;
    private final int a;
    private int kM;
    public static final int kA;

    public Gb(byte[] var1) {
        this(var1, var1.length);
    }

    public Gb(byte[] var1, int var2) {
        if (var2 >= 0) {
            int var3 = var1.length;
            if (var2 <= var3) {
                this.V = var1;
                this.a = var2;
                return;
            }
        }

        IllegalArgumentException var4 = new IllegalArgumentException("limit");
        throw var4;
    }

    public int F() {
        int var1 = kA;
        var1 ^= 730232096;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var24;
        var2 = (var24 = var19 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -1336972007;
            var1 ^= 1114004183;
            IllegalArgumentException var21 = new IllegalArgumentException();
            throw var21;
        } else {
            var1 >>= 4;
            var1 += 755924052;
            var1 |= -994227130;
            var1 >>= 12;
            var1 ^= 1984279818;
            long var12 = var1;
            long var3 = var12 + 1L;
            var3 = var12 * var3;
            long var13 = var3 & 1L;
            long var25;
            var1 = (var25 = var13 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var1 != 0) {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            } else {
                return this.kM;
            }
        }
    }

    public int tN() {
        int var1 = kA;
        var1 ^= 1710287209;
        int var2 = System.identityHashCode(this);
        int var3 = this.a;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var39;
        var2 = (var39 = var4 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= 151776835;
            var1 ^= 2126727468;
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var40;
            var2 = (var40 = var4 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var2 == 0) {
                var2 = this.kM;
                return var3 - var2;
            }
        } else {
            var1 += -2132225640;
            var1 &= -1296163127;
            var1 *= -1878892347;
            var1 ^= 1813506937;
            long var17 = var1;
            long var26 = var17 + 1L;
            long var27 = var17 * var26;
            long var5 = var17 + 2L;
            long var28 = var27 * var5;
            long var18 = var17 + 3L;
            long var29 = var28 * var18;
            long var19 = var29 & 7L;
            long var41;
            var1 = (var41 = var19 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var22 = new AssertionError();
                throw var22;
            }
        }

        AssertionError var21 = new AssertionError();
        throw var21;
    }

    public void n(int var1, String var2) throws hh {
        label41: {
            int var3 = kA;
            var3 ^= -1660734296;
            int var5 = System.identityHashCode(this);
            long var6 = this.E();
            long var8 = var1;
            var8 &= 4294967295L;
            long var60;
            int var46 = (var60 = var6 - var8) == 0L ? 0 : (var60 < 0L ? -1 : 1);
            int var7 = var5 + 1;
            var7 = var5 * var7;
            var7 &= 1;
            if (var7 != 0) {
                var3 &= -339714012;
                var3 ^= -1525265794;
            } else {
                var3 ^= -830015011;
                var3 >>>= 12;
                var3 >>= 17;
                var3 += 1577830564;
                var3 ^= -919739467;
                var7 = var1 + 1;
                var7 = var1 * var7;
                var7 &= 1;
                if (var7 != 0) {
                    break label41;
                }

                if (var46 == 0) {
                    var3 |= -37880453;
                    var3 ^= -1194265318;
                    long var29 = var1;
                    long var42 = var29 + 1L;
                    long var43 = var29 * var42;
                    long var57 = var29 + 2L;
                    long var44 = var43 * var57;
                    long var30 = var29 + 3L;
                    long var45 = var44 * var30;
                    long var31 = var45 & 7L;
                    long var61;
                    var3 = (var61 = var31 - 0L) == 0L ? 0 : (var61 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        return;
                    }
                    break label41;
                }
                var3 = switch (var3) {
                    case -1759106274 -> {
                        var3 |= -613239206;
                        yield var3 ^ -2068446077;
                    }
                    case 446954721 -> var3 ^ 918949888;
                    default -> var3 ^ 2010241760;
                };
                StringBuilder var47 = new StringBuilder();
                var7 = var5 + 1;
                var7 = var5 * var7;
                int var59 = var5 + 2;
                var7 *= var59;
                var5 += 3;
                var7 *= var5;
                var5 = var7 & 7;
                if (var5 == 0) {
                    var3 >>= 28;
                    var3 ^= 664433253;
                    StringBuilder var38 = var47.append("not a ");
                    StringBuilder var39 = var38.append(var2);
                    String var40 = var39.toString();
                    hh var41 = hh.ug(var40);
                    throw var41;
                }

                var3 ^= -618469728;
                var3 >>= 2;
                var3 += -1329974199;
                var3 -= 884967050;
                var3 ^= -794488992;
            }

            Integer var36 = var1;
            if (var36 != null) {
                UnsupportedOperationException var37 = new UnsupportedOperationException();
                throw var37;
            }
        }

        IllegalArgumentException var33 = new IllegalArgumentException();
        throw var33;
    }

    public void U() throws hh {
        int var1 = kA;
        var1 ^= 148883340;
        int var2 = System.identityHashCode(this);
        int var3 = this.Co();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var54;
        var2 = (var54 = var4 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 = switch (var1) {
                case -1403355787 -> {
                    var1 -= 638220496;
                    var1 += -1350529696;
                    yield var1 ^ 142183802;
                }
                case -76506411 -> var1 ^ 766610158;
                default -> var1 ^ -2099832575;
            };
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var55;
            var2 = (var55 = var4 - 0L) == 0L ? 0 : (var55 < 0L ? -1 : 1);
            if (var2 == 0) {
                if (var3 != 1) {
                    var1 += 546802055;
                    var1 >>= 3;
                    var1 ^= 913899603;
                    Py var46 = Py.UNSUPPORTED_SCHEMA;
                    StringBuilder var5 = new StringBuilder();
                    var5 = var5.append("schema ");
                    StringBuilder var34 = var5.append(var3);
                    StringBuilder var35 = var34.append(" not supported");
                    String var36 = var35.toString();
                    hh var37 = new hh(var46, var36);
                    throw var37;
                }
                long var30 = switch (var1) {
                    case -726417055 -> var1 ^ 524619729;
                    default -> var1 ^ -374763009;
                    case 1034493823 -> {
                        var1 += 518683385;
                        var1 &= 771854048;
                        yield var1 ^ -1925956977;
                    }
                };
                var4 = var30 + 1L;
                var4 = var30 * var4;
                var6 = var30 + 2L;
                var4 *= var6;
                long var31 = var30 + 3L;
                var4 *= var31;
                long var32 = var4 & 7L;
                long var56;
                var2 = (var56 = var32 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
                if (var2 == 0) {
                    return;
                }
            }
        } else {
            Integer var25 = switch (var1) {
                case -1403355787 -> {
                    var1 -= 2136111401;
                    var1 <<= 8;
                    var1 -= -306300809;
                    var1 ^= -1136067794;
                    yield var1 ^ 374119081;
                }
                case -1074888691 -> var1 ^ 85048291;
                default -> var1 ^ -444752822;
            };
            if (var25 != null) {
                AssertionError var27 = new AssertionError();
                throw var27;
            }
        }

        IllegalStateException var26 = new IllegalStateException();
        throw var26;
    }

    public int Co() throws hh {
        int var1 = kA;
        var1 ^= -500887581;
        int var2 = System.identityHashCode(this);
        int var3 = var1 * 2009914981;
        var3 ^= 868991974;
        this.S(1, var3);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var25;
        var2 = (var25 = var17 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= 1628250543;
            var1 ^= 1387037138;
            Integer var19 = var1;
            if (var19 != null) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        } else {
            var1 &= -559991445;
            var1 *= -758847105;
            var1 ^= 575126620;
            Integer var12 = var1;
            if (var12 != null) {
                byte[] var14 = this.V;
                var2 = this.kM;
                var3 = var2 + 1;
                this.kM = var3;
                byte var15 = var14[var2];
                return var15 & 0xFF;
            }
        }

        RuntimeException var13 = new RuntimeException();
        throw var13;
    }

    public int mA() throws hh {
        int var1 = kA;
        var1 ^= -112919036;
        int var2 = System.identityHashCode(this);
        int var3 = var1 + 1879856401;
        var3 |= 844095068;
        var3 &= 52322500;
        var3 |= -1401557436;
        var3 ^= 1033884384;
        this.S(2, var3);
        byte[] var31 = this.V;
        int var4 = this.kM;
        Integer var19 = var2;
        if (var19 != null) {
            var1 *= 204733733;
            var1 ^= 734770966;
            int var20 = var1 + 1;
            var20 = var1 * var20;
            var20 &= 1;
            if (var20 == 0) {
                int var23 = var31[var4];
                var23 &= 255;
                var23 <<= 8;
                int var5 = var4 + 1;
                int var32 = var31[var5];
                var32 &= 255;
                var23 |= var32;
                var32 = var4 + 2;
                this.kM = var32;
                return var23;
            }
        } else {
            long var14 = switch (var1) {
                case -2103871307 -> var1 ^ 403589945;
                default -> var1 ^ 151239262;
                case 1572947197 -> {
                    var1 |= 1132813218;
                    var1 *= -1507647387;
                    var1 >>>= 12;
                    var1 ^= 1057958585;
                    yield var1 ^ -1123134399;
                }
            };
            long var35 = var14 + 1L;
            long var36 = var14 * var35;
            long var15 = var36 & 1L;
            long var37;
            var1 = (var37 = var15 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            }
        }

        IllegalStateException var17 = new IllegalStateException();
        throw var17;
    }

    public long E() throws hh {
        int var1 = kA;
        var1 ^= -785388930;
        int var2 = System.identityHashCode(this);
        int var3 = var1 ^ 588991972;
        var3 ^= -1001315897;
        this.S(4, var3);
        byte[] var25 = this.V;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        if (var2 == 0) {
            var1 *= 648653963;
            var1 ^= 61588936;
            var1 ^= -1582772545;
            long var32 = var1;
            long var6 = var32 + 1L;
            var6 = var32 * var6;
            long var8 = var32 + 2L;
            var6 *= var8;
            long var33 = var32 + 3L;
            var6 *= var33;
            long var34 = var6 & 7L;
            long var56;
            var2 = (var56 = var34 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
            if (var2 != 0) {
                IllegalStateException var23 = new IllegalStateException();
                throw var23;
            } else {
                var2 = this.kM;
                int var35 = var25[var2];
                var35 &= 255;
                long var37 = var35;
                long var38 = var37 << 24;
                int var44 = var2 + 1;
                byte var45 = var25[var44];
                int var46 = var45 & 255;
                int var47 = var46 << 16;
                var6 = var47;
                long var39 = var38 | var6;
                int var49 = var2 + 2;
                byte var50 = var25[var49];
                int var51 = var50 & 255;
                int var52 = var51 << 8;
                var6 = var52;
                long var40 = var39 | var6;
                int var54 = var2 + 3;
                int var26 = var25[var54];
                var26 &= 255;
                var6 = var26;
                long var28 = var40 | var6;
                var2 += 4;
                this.kM = var2;
                return var28;
            }
        } else {
            var1 &= -1399898014;
            var1 -= 1410054854;
            var1 ^= 1773991068;
            RuntimeException var14 = new RuntimeException();
            throw var14;
        }
    }

    public long nB() throws hh {
        label76: {
            int var1 = kA;
            var1 ^= -1531820225;
            int var2 = System.identityHashCode(this);
            int var3 = var1 & 458014415;
            var3 *= 432391841;
            var3 ^= -709238750;
            this.S(8, var3);
            byte[] var57 = this.V;
            byte[] var58 = var57;
            int var4 = this.kM;
            int var5 = var2 + 1;
            var5 = var2 * var5;
            var5 &= 1;
            if (var5 == 0) {
                var1 *= 797605657;
                var1 ^= 1951415831;
                var1 &= 738995198;
                var1 &= 1155342525;
                var1 ^= 2137525082;
                Integer var68 = var1;
                if (var68 == null) {
                    break label76;
                }

                var4 = var4;
                long var69 = 0L;
                int var7 = 0;
                long var70 = var69;
                var7 = var7;

                var1 = switch (var1) {
                    case 19246674 -> var1 ^ 1832781233;
                    default -> var1 ^ 143286793;
                    case 2069900122 -> {
                        var1 >>>= 31;
                        var1 |= 1388355332;
                        var1 ^= -1646595439;
                        var1 -= 1809367462;
                        yield var1 ^ -2073625984;
                    }
                };

                label73:
                while (true) {
                    long var8 = var1;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var86;
                    int var73 = (var86 = var8 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                    if (var73 != 0) {
                        break label76;
                    }

                    if (var7 >= 8) {
                        var1 ^= 1694793049;
                        var1 ^= -1132570688;
                        var1 |= 322390512;
                        var1 ^= 1622139511;
                        var3 = var1 + 1;
                        var3 = var1 * var3;
                        var3 &= 1;
                        if (var3 != 0) {
                            break label76;
                        }

                        var3 = var4 + 8;
                        var4 = var2 + 1;
                        var4 = var2 * var4;
                        var2 = var4 & 1;
                        if (var2 == 0) {
                            Integer var54 = switch (var1) {
                                case -2038956861 -> var1 ^ -203515011;
                                default -> var1 ^ 915454027;
                                case 1607506305 -> {
                                    var1 *= 2003501435;
                                    var1 ^= 1045771376;
                                    yield var1 ^ -745104750;
                                }
                            };
                            if (var54 != null) {
                                this.kM = var3;
                                return var70;
                            }
                            break label76;
                        }

                        switch (var1) {
                            case -1567215161:
                                var1 ^= 1401834996;
                                break label73;
                            case 505307080:
                            default:
                                var1 ^= -919372510;
                                break label73;
                            case 1607506305:
                                var1 += 674063580;
                                var1 &= 1599098728;
                                var1 ^= 593767678;
                                break label73;
                        }
                    }

                    var1 *= 1690134233;
                    var1 -= -352638222;
                    var1 |= -2134519025;
                    var1 &= -1678982576;
                    var1 ^= 752484428;
                    int var74 = var1 + 1;
                    int var75 = var1 * var74;
                    int var76 = var75 & 1;
                    if (var76 != 0) {
                        break label76;
                    }

                    var8 = var70 << 8;
                    int var80 = var4 + var7;
                    byte var81 = var58[var80];
                    int var82 = var81 & 255;
                    var10 = var82;
                    var8 |= var10;
                    int var84 = var7 + 1;
                    Integer var11 = var2;
                    if (var11 == null) {
                        var1 >>>= 2;
                        var1 ^= -1758955562;
                        var1 |= -1415438791;
                        var1 ^= -1684816437;
                        break;
                    }

                    var1 >>= 27;
                    var1 ^= 433745390;
                    var1 ^= -505664755;
                    var11 = var1;
                    if (var11 == null) {
                        break label76;
                    }

                    var70 = var8;
                    var7 = var84;
                    var1 >>= 22;
                    var1 &= 574907626;
                    var1 *= -688490509;
                    var1 ^= -2105016815;
                }
            } else {
                var1 += 394474662;
                var1 ^= -692247652;
                var1 &= 167570085;
                var1 ^= 623927830;
            }

            Integer var50 = var1;
            if (var50 != null) {
                IllegalStateException var52 = new IllegalStateException();
                throw var52;
            }
        }

        IllegalStateException var51 = new IllegalStateException();
        throw var51;
    }

    public byte[] A(int var1) throws hh {
        int var2 = kA;
        var2 ^= 1513624118;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var4 = var5 & 1;
        var5 = of_2.LT;
        var2 ^= var5;
        var2 ^= -1115560575;
        of_2.LT = -1115560575;
        var5 = of_2.VI;
        var2 ^= var5;
        var2 ^= 2099516512;
        of_2.VI = 2099516512;
        if (var4 == 0) {
            var2 = switch (var2) {
                case -21124913 -> {
                    var2 |= -1422070388;
                    var2 += 174886553;
                    var2 -= -297636575;
                    var2 *= -1299117611;
                    yield var2 ^ -760082391;
                }
                default -> var2 ^ -1172092637;
                case 794969407 -> var2 ^ 29293548;
            };
            Integer var3 = var1;
            if (var3 == null) {
                AssertionError var26 = new AssertionError();
                throw var26;
            } else {
                int var22 = var2 * 8148271;
                var22 ^= 1636051714;
                this.S(var1, var22);
                var22 = this.kM;
                byte[] var28 = this.V;
                var5 = var22 + var1;
                byte[] var29 = Arrays.copyOfRange(var28, var22, var5);
                var22 += var1;
                this.kM = var22;
                return var29;
            }
        } else {
            switch (var2) {
                case -1376148283:
                default:
                    var2 ^= 1727114415;
                    break;
                case -596979493:
                    var2 ^= -2007199431;
                    break;
                case -21124913:
                    var2 >>= 28;
                    var2 ^= 792553179;
                    var2 ^= -490864161;
            }

            IllegalStateException var16 = new IllegalStateException();
            throw var16;
        }
    }

    public String Hs(int var1) throws hh {
        label132: {
            int var3;
            label140: {
                int var2 = kA;
                var3 = var1;
                var2 ^= -2115226811;
                int var4 = System.identityHashCode(this);
                int var5 = var4 + 1;
                var5 = var4 * var5;
                int var6 = var4 + 2;
                var5 *= var6;
                var6 = var4 + 3;
                var5 *= var6;
                var5 &= 7;
                var6 = of_2.LT;
                var2 ^= var6;
                var2 ^= -1115560575;
                var6 = of_2.VI;
                var2 ^= var6;
                var2 ^= 2099516512;
                if (var5 != 0) {
                    var2 &= -1162756305;
                    var2 -= 1631280878;
                    var2 += 766635774;
                    var2 ^= 120928124;
                } else {
                    var2 = switch (var2) {
                        default -> var2 ^ 1568629054;
                        case 473121541 -> var2 ^ -1106190877;
                        case 627673532 -> {
                            var2 |= 568031945;
                            yield var2 ^ 465415895;
                        }
                    };
                    var5 = var1 + 1;
                    var5 = var1 * var5;
                    var6 = var1 + 2;
                    var5 *= var6;
                    var6 = var1 + 3;
                    var5 *= var6;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label132;
                    }

                    var5 = this.mA();
                    var5 = var5;
                    if (var5 > var1) {
                        var2 <<= 12;
                        var2 >>>= 1;
                        var2 ^= -1540709117;
                        var2 ^= -557575170;
                        long var124 = var1;
                        long var143 = var124 + 1L;
                        var143 = var124 * var143;
                        long var125 = var143 & 1L;
                        long var211;
                        var6 = (var211 = var125 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                        if (var6 == 0) {
                            hh var127 = hh.ug("string too long");
                            throw var127;
                        }
                        break label132;
                    }

                    var2 |= 1481781570;
                    var2 |= 371750885;
                    var2 -= -1362895024;
                    var2 ^= 2147250080;
                    Integer var118 = var1;
                    if (var118 == null) {
                        break label132;
                    }

                    int var119 = var2 - -1828267394;
                    var119 &= 1910539759;
                    var119 ^= -2086651803;
                    this.S(var5, var119);
                    byte[] var122 = this.V;
                    byte[] var123 = var122;
                    int var7 = this.kM;
                    var7 = var7;
                    long var8 = var4;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    long var12 = var8 + 2L;
                    var10 *= var12;
                    var8 += 3L;
                    var10 *= var8;
                    var8 = var10 & 7L;
                    long var204;
                    int var133 = (var204 = var8 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                    if (var133 != 0) {
                        var2 += 1226165503;
                        var2 += -500490799;
                        var2 ^= 808111183;
                    } else {
                        var2 = switch (var2) {
                            case -2041390771 -> var2 ^ 1096972202;
                            case -1337526465 -> {
                                var2 ^= 772903669;
                                var2 ^= -2117513819;
                                var2 += -1388448128;
                                yield var2 ^ 1537234833;
                            }
                            default -> var2 ^ 1840658301;
                        };
                        byte var134 = 0;
                        int var135 = var134;
                        var2 >>= 29;
                        var2 += 290716197;
                        var2 ^= 157329642;

                        label124:
                        while (true) {
                            long var9 = var3;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var205;
                            int var146 = (var205 = var9 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                            if (var146 != 0) {
                                break label132;
                            }

                            if (var135 >= var5) {
                                var2 -= 2099178813;
                                var2 &= 348311446;
                                var2 >>>= 19;
                                var2 &= 1389865553;
                                var2 ^= 366951956;
                                var8 = var3;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                var12 = var8 + 2L;
                                var10 *= var12;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var206;
                                int var141 = (var206 = var8 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                                if (var141 != 0) {
                                    break label132;
                                }

                                Charset var156 = StandardCharsets.US_ASCII;
                                String var142 = new String(var123, var7, var5, var156);
                                var5 = var7 + var5;
                                long var129 = var4;
                                var9 = var129 + 1L;
                                var9 = var129 * var9;
                                long var130 = var9 & 1L;
                                long var207;
                                var4 = (var207 = var130 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                                if (var4 == 0) {
                                    var2 *= 840348789;
                                    var2 ^= 220578926;
                                    var2 ^= -627060988;
                                    this.kM = var5;
                                    return var142;
                                }

                                var2 |= -1402756289;
                                var2 <<= 16;
                                var2 &= 589143732;
                                var2 ^= -927977920;
                                break;
                            }
                            var2 = switch (var2) {
                                case 310543684 -> var2 ^ -1518962094;
                                case 406016715 -> {
                                    var2 -= 950947316;
                                    var2 *= -1706990523;
                                    var2 += -427972757;
                                    yield var2 ^ 1637567705;
                                }
                                default -> var2 ^ -349006645;
                            };
                            int var147 = var7 + var135;
                            Integer var162 = var4;
                            if (var162 == null) {
                                var2 += 1568786197;
                                var2 += -81829666;
                                var2 |= 1962070946;
                                var2 ^= -1655187014;
                                break;
                            }

                            var2 -= 1420483373;
                            var2 -= -380680667;
                            var2 -= 2022175327;
                            var2 ^= 2108560888;
                            int var163 = var3 + 1;
                            int var164 = var3 * var163;
                            int var187 = var3 + 2;
                            int var165 = var164 * var187;
                            int var188 = var3 + 3;
                            int var166 = var165 * var188;
                            int var167 = var166 & 7;
                            if (var167 != 0) {
                                break label132;
                            }

                            byte var148 = var123[var147];
                            int var149 = var148 & 255;
                            if (var149 < 32) {
                                var2 *= -2090277481;
                                var2 -= -1605744299;
                                var2 -= 519205297;
                                var2 ^= 1206462674;
                                break label140;
                            }

                            var2 ^= 1885849774;
                            var2 += 2141347284;
                            var2 |= 1653785376;
                            var2 ^= -578990697;
                            var10 = var3;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            long var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var208;
                            int var171 = (var208 = var10 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                            if (var171 != 0) {
                                break label132;
                            }

                            if (var149 > 126) {
                                var2 &= 2125476286;
                                var2 <<= 16;
                                var2 -= -1315095085;
                                var2 *= 361643341;
                                var2 ^= -1469685177;
                                break label140;
                            }

                            var2 -= 1121997048;
                            var2 += -1305753459;
                            var2 ^= 1678391218;
                            int var150 = var3 + 1;
                            int var151 = var3 * var150;
                            int var172 = var3 + 2;
                            int var152 = var151 * var172;
                            int var173 = var3 + 3;
                            int var153 = var152 * var173;
                            int var154 = var153 & 7;
                            if (var154 != 0) {
                                break label132;
                            }

                            int var155 = var135 + 1;
                            var10 = var4;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var209;
                            int var177 = (var209 = var10 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                            if (var177 != 0) {
                                switch (var2) {
                                    case -1250905627:
                                    default:
                                        var2 ^= 1551979295;
                                        break label124;
                                    case -166649398:
                                        var2 *= 2088024249;
                                        var2 ^= -925964369;
                                        var2 &= -1020949064;
                                        var2 ^= 1770595152;
                                        break label124;
                                    case 497530760:
                                        var2 ^= 2031164022;
                                        break label124;
                                }
                            }

                            var2 += -594334506;
                            var2 *= -1664811617;
                            var2 ^= 1024453818;
                            var10 = var3;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var210;
                            int var181 = (var210 = var10 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                            if (var181 != 0) {
                                break label132;
                            }

                            var135 = var155;
                            var2 -= 1777132315;
                            var2 ^= 1934713972;
                        }
                    }
                }

                var2 = var3 + 1;
                var2 = var3 * var2;
                var2 &= 1;
                if (var2 == 0) {
                    AssertionError var99 = new AssertionError();
                    throw var99;
                }
                break label132;
            }

            Integer var136 = var3;
            if (var136 != null) {
                hh var137 = hh.ug("non-printable string");
                throw var137;
            }
        }

        IllegalArgumentException var98 = new IllegalArgumentException();
        throw var98;
    }

    public void Cj() throws hh {
        int var1 = kA;
        var1 ^= 1172965745;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 ^= 9408039;
            var1 ^= 2070853440;
            Integer var27 = var1;
            if (var27 != null) {
                IllegalStateException var28 = new IllegalStateException();
                throw var28;
            }
        } else {
            var1 >>= 5;
            var1 ^= 60777421;
            var1 *= 653739545;
            var1 += 463218369;
            var1 ^= 1093147603;
            var2 = this.kM;
            var3 = this.a;
            if (var2 != var3) {
                var1 |= -191151599;
                var1 >>= 5;
                var1 *= -38166699;
                var1 ^= 246952552;
                var2 = var1 + 1;
                var2 = var1 * var2;
                var2 &= 1;
                if (var2 == 0) {
                    hh var33 = hh.ug("trailing bytes");
                    throw var33;
                }
            } else {
                var1 -= -192411100;
                var1 *= -557598515;
                var1 &= -494190626;
                var1 ^= -356037701;
                long var21 = var1;
                long var38 = var21 + 1L;
                long var39 = var21 * var38;
                long var22 = var39 & 1L;
                long var40;
                var1 = (var40 = var22 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
                if (var1 == 0) {
                    return;
                }
            }
        }

        UnsupportedOperationException var24 = new UnsupportedOperationException();
        throw var24;
    }

    private void S(int var1, int var2) throws hh {
        label48: {
            label47: {
                int var5 = System.identityHashCode(this);
                int var6 = this.kM;
                int var7 = this.a;
                Integer var8 = var5;
                if (var8 != null) {
                    int var3 = var2 * 1431889199;
                    var3 ^= 1980897459;
                    long var59 = var1;
                    long var10 = var59 + 1L;
                    var10 = var59 * var10;
                    long var60 = var10 & 1L;
                    long var68;
                    int var61 = (var68 = var60 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                    if (var61 != 0) {
                        break label48;
                    }

                    if (var1 < 0) {
                        var3 &= 421490855;
                        var3 *= 952977495;
                        var3 ^= 1538858290;
                        break label47;
                    }

                    var3 ^= -858520680;
                    var3 ^= -303791026;
                    var6 = var7 - var6;
                    long var53 = var5;
                    long var9 = var53 + 1L;
                    var9 = var53 * var9;
                    long var54 = var9 & 1L;
                    long var69;
                    var5 = (var69 = var54 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var3 ^= 664524748;
                        var3 |= 301588433;
                        var3 += -999862514;
                        var3 *= 1952801731;
                        var3 ^= -1113768113;
                        long var55 = var1;
                        var9 = var55 + 1L;
                        var9 = var55 * var9;
                        long var11 = var55 + 2L;
                        var9 *= var11;
                        long var56 = var55 + 3L;
                        var9 *= var56;
                        long var57 = var9 & 7L;
                        long var70;
                        var5 = (var70 = var57 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                        if (var5 != 0) {
                            break label48;
                        }

                        if (var6 >= var1) {
                            var3 -= -260160643;
                            var3 ^= 126767804;
                            return;
                        }

                        var3 += 933886811;
                        var3 <<= 25;
                        var3 ^= -1986662925;
                        break label47;
                    }

                    var3 ^= 484730512;
                    var3 &= 945525598;
                    var3 ^= 196745025;
                } else {
                    int var32 = var2 - -1720100222;
                    var32 ^= 782495441;
                    var32 ^= 1286970342;
                    var32 ^= -2134801636;
                }

                long var36 = var1;
                long var48 = var36 + 1L;
                long var49 = var36 * var48;
                long var58 = var36 + 2L;
                long var50 = var49 * var58;
                var36 += 3L;
                long var51 = var50 * var36;
                var36 = var51 & 7L;
                long var71;
                int var39 = (var71 = var36 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                if (var39 == 0) {
                    IllegalStateException var41 = new IllegalStateException();
                    throw var41;
                }
                break label48;
            }

            int var44 = var1 + 1;
            var44 = var1 * var44;
            var44 &= 1;
            if (var44 == 0) {
                hh var47 = hh.ug("truncated");
                throw var47;
            }
        }

        RuntimeException var40 = new RuntimeException();
        throw var40;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 751966750;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        kA = var4;
    }
}
