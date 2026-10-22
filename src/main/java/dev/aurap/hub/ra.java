package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;

public final class ra {
    private byte[] Dj;
    private int Tf;
    public static final int w;

    public ra(int var1) {
        int var2 = Math.max(16, var1);
        byte[] var3 = new byte[var2];
        this.Dj = var3;
    }

    public ra T(int var1) {
        int var2 = w;
        var2 ^= 1640033431;
        int var4 = System.identityHashCode(this);
        long var5 = var1;
        long var7 = var4;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        var7 = var9 & 1L;
        long var27;
        var4 = (var27 = var7 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var4 != 0) {
            var2 -= 567522263;
            var2 -= 1949796320;
            var2 -= 568669578;
            var2 ^= 1980076522;
            Integer var23 = var1;
            if (var23 != null) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            var2 &= -1291439594;
            var2 ^= -1025094803;
            var2 ^= -1083634916;
            Integer var19 = var1;
            if (var19 != null) {
                long var21 = var5 & 4294967295L;
                return this.rp(var21);
            }
        }

        UnsupportedOperationException var20 = new UnsupportedOperationException();
        throw var20;
    }

    public ra h(int var1) {
        label58: {
            label57: {
                int var2 = w;
                var2 ^= -2069279606;
                int var4 = System.identityHashCode(this);
                Integer var5 = var4;
                int var6 = of_2.E;
                var2 ^= var6;
                var2 ^= -989584871;
                var6 = of_2.cT;
                var2 ^= var6;
                var2 ^= 766553785;
                if (var5 == null) {
                    switch (var2) {
                        case -2100496196:
                            var2 ^= -872629150;
                            break;
                        case -2098152534:
                            var2 &= 456573129;
                            var2 *= 197599291;
                            var2 ^= 1145601467;
                            break;
                        case 1880112784:
                        default:
                            var2 ^= -707581279;
                    }
                } else {
                    var2 = switch (var2) {
                        case -2098152534 -> {
                            var2 += 2040568335;
                            yield var2 ^ 1628158548;
                        }
                        case -1504448059 -> var2 ^ 1964663280;
                        default -> var2 ^ 284569749;
                    };
                    int var59 = var1 + 1;
                    var59 = var1 * var59;
                    var6 = var1 + 2;
                    var59 *= var6;
                    var6 = var1 + 3;
                    var59 *= var6;
                    var59 &= 7;
                    if (var59 != 0) {
                        break label57;
                    }

                    if (var1 < 0) {
                        var2 *= 197984411;
                        var2 |= -1271244455;
                        var2 -= -255817198;
                        var2 ^= 1798985388;
                        break label58;
                    }

                    var2 >>>= 2;
                    var2 ^= -1225538594;
                    if (var1 > 255) {
                        var2 |= 2070836189;
                        var2 &= -738092349;
                        var2 |= -992899664;
                        var2 -= 1747506271;
                        var2 ^= -865382829;
                        break label58;
                    }
                    var2 = switch (var2) {
                        case -1852475355 -> {
                            var2 -= -1174828397;
                            var2 &= 75818223;
                            var2 -= 858494856;
                            yield var2 ^ -411583680;
                        }
                        default -> var2 ^ -856034436;
                        case 1063896015 -> var2 ^ 1517489729;
                    };
                    var59 = var2 ^ -558510072;
                    var59 ^= 241640058;
                    this.F(1, var59);
                    byte[] var66 = this.Dj;
                    Integer var52 = var4;
                    if (var52 != null) {
                        var2 *= -1127864955;
                        var2 *= 1316728777;
                        var2 <<= 9;
                        var2 -= -70476069;
                        var2 ^= -1223381019;
                        int var53 = var1 + 1;
                        var53 = var1 * var53;
                        var6 = var1 + 2;
                        var53 *= var6;
                        var6 = var1 + 3;
                        var53 *= var6;
                        var53 &= 7;
                        if (var53 == 0) {
                            var53 = this.Tf;
                            var6 = var53 + 1;
                            this.Tf = var6;
                            byte var77 = (byte)var1;
                            var66[var53] = var77;
                            return this;
                        }
                        break label57;
                    }

                    var2 *= -1374828553;
                    var2 -= 2021062928;
                    var2 &= 1565014105;
                    var2 += 323741556;
                    var2 ^= 1965745495;
                }

                long var3 = var1;
                long var67 = var3 + 1L;
                long var68 = var3 * var67;
                long var7 = var3 + 2L;
                long var69 = var68 * var7;
                var3 += 3L;
                long var70 = var69 * var3;
                var3 = var70 & 7L;
                long var78;
                int var49 = (var78 = var3 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                if (var49 == 0) {
                    AssertionError var50 = new AssertionError();
                    throw var50;
                }
            }

            IllegalStateException var51 = new IllegalStateException();
            throw var51;
        }

        IllegalArgumentException var46 = new IllegalArgumentException("u8 out of range");
        throw var46;
    }

    public ra C(int var1) {
        label71: {
            int var2 = w;
            var2 ^= 1658911950;
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var81;
            int var63 = (var81 = var5 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
            if (var63 != 0) {
                switch (var2) {
                    case -1927942470:
                        var2 ^= 2000387572;
                        break;
                    case -1375458015:
                    default:
                        var2 ^= 2040927677;
                        break;
                    case 1689848814:
                        var2 += -851486115;
                        var2 += 1431725154;
                        var2 -= 966292232;
                        var2 &= 1880115570;
                        var2 ^= -2133322410;
                }
            } else {
                label70: {
                    var2 |= 1765006831;
                    var2 &= -1327602122;
                    var2 |= -606237949;
                    var2 *= 1326082697;
                    var2 ^= 1955714428;
                    if (var1 >= 0) {
                        var2 = switch (var2) {
                            default -> var2 ^ -1433199383;
                            case -477899613 -> {
                                var2 |= -600083332;
                                var2 += 1589283313;
                                var2 += -161985042;
                                var2 ^= 1310274829;
                                yield var2 ^ -304066080;
                            }
                            case 1764408407 -> var2 ^ 322433207;
                        };
                        if (var1 <= 65535) {
                            var2 = switch (var2) {
                                default -> var2 ^ 1237198919;
                                case -147347405 -> {
                                    var2 -= -797843553;
                                    var2 <<= 1;
                                    var2 &= -1333706849;
                                    yield var2 ^ 1369818937;
                                }
                                case 792350543 -> var2 ^ -48949131;
                            };
                            Integer var64 = var1;
                            if (var64 == null) {
                                break label71;
                            }

                            int var65 = var2 | -1808808422;
                            int var66 = var65 ^ -1727433112;
                            int var67 = var66 ^ -1428773477;
                            this.F(2, var67);
                            byte[] var68 = this.Dj;
                            int var6 = this.Tf;
                            int var73 = var6 + 1;
                            this.Tf = var73;
                            int var74 = var1 >>> 8;
                            int var8 = var4 + 1;
                            var8 = var4 * var8;
                            int var9 = var4 + 2;
                            var8 *= var9;
                            var4 += 3;
                            var8 *= var4;
                            var4 = var8 & 7;
                            if (var4 == 0) {
                                var2 |= -1139703752;
                                var2 -= -214147508;
                                var2 ^= 1189049998;
                                long var78 = var1;
                                long var10 = var78 + 1L;
                                var10 = var78 * var10;
                                long var79 = var10 & 1L;
                                long var82;
                                var4 = (var82 = var79 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                                if (var4 == 0) {
                                    byte var56 = (byte)var74;
                                    var68[var6] = var56;
                                    byte[] var57 = this.Dj;
                                    int var69 = this.Tf;
                                    var6 = var69 + 1;
                                    this.Tf = var6;
                                    byte var71 = (byte)var1;
                                    var57[var69] = var71;
                                    return this;
                                }
                                break label71;
                            }

                            var2 >>= 29;
                            var2 ^= -1060613004;
                            break label70;
                        }

                        switch (var2) {
                            case -716770611:
                                var2 ^= -1048039796;
                                break;
                            case -147347405:
                                var2 *= 663788541;
                                var2 *= 1713015855;
                                var2 -= -1282323821;
                                var2 ^= -457139155;
                                break;
                            case 255469569:
                            default:
                                var2 ^= -823234385;
                        }
                    } else {
                        var2 += 629765765;
                        var2 &= -1211272944;
                        var2 *= 265637765;
                        var2 &= 683910891;
                        var2 ^= -1528886917;
                    }

                    Integer var43 = var1;
                    if (var43 != null) {
                        IllegalArgumentException var44 = new IllegalArgumentException("u16 out of range");
                        throw var44;
                    }
                    break label71;
                }
            }

            var4 = var1 + 1;
            var4 = var1 * var4;
            var4 &= 1;
            if (var4 == 0) {
                AssertionError var61 = new AssertionError();
                throw var61;
            }
        }

        IllegalArgumentException var52 = new IllegalArgumentException();
        throw var52;
    }

    public ra rp(long var1) {
        label81: {
            int var3 = w;
            var3 ^= -1327614360;
            int var4 = System.identityHashCode(this);
            Integer var5 = var4;
            if (var5 == null) {
                var3 += 1367026292;
                var3 *= 479214205;
                var3 ^= -1568696382;
            } else {
                label80: {
                    var3 += 1288450478;
                    var3 &= 1304927418;
                    var3 >>= 21;
                    var3 *= -286957729;
                    var3 ^= 1240252737;
                    int var54 = var3 + 1;
                    var54 = var3 * var54;
                    int var6 = var3 + 2;
                    var54 *= var6;
                    var6 = var3 + 3;
                    var54 *= var6;
                    var54 &= 7;
                    if (var54 != 0) {
                        break label81;
                    }

                    long var94;
                    var54 = (var94 = var1 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
                    if (var54 >= 0) {
                        var3 -= 881317305;
                        var3 |= -942788183;
                        var3 &= -1275261603;
                        var3 *= 498724575;
                        var3 ^= -1433872062;
                        long var60 = var3;
                        long var7 = var60 + 1L;
                        var7 = var60 * var7;
                        long var61 = var7 & 1L;
                        long var95;
                        var54 = (var95 = var61 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                        if (var54 != 0) {
                            break label81;
                        }

                        long var96;
                        var54 = (var96 = var1 - 4294967295L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                        var6 = var4 + 1;
                        var6 = var4 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            var3 -= -265331829;
                            var3 >>= 18;
                            var3 >>>= 5;
                            var3 >>= 22;
                            var3 ^= 518661393;
                            break label80;
                        }
                        var3 = switch (var3) {
                            case -1483560985 -> var3 ^ -211828159;
                            case -519489791 -> {
                                var3 |= -6672779;
                                yield var3 ^ -1125741535;
                            }
                            default -> var3 ^ -2021552166;
                        };
                        Integer var76 = var3;
                        if (var76 == null) {
                            break label81;
                        }

                        if (var54 <= 0) {
                            var3 ^= -1520283713;
                            var3 ^= 129270819;
                            var3 >>= 15;
                            var3 ^= 1964993590;
                            var54 = var3 + 1022544646;
                            var54 &= 404683896;
                            var54 <<= 3;
                            var54 ^= -429668664;
                            this.F(4, var54);
                            byte[] var68 = this.Dj;
                            int var77 = this.Tf;
                            int var84 = var77 + 1;
                            this.Tf = var84;
                            var7 = var1 >>> 24;
                            int var86 = (int)var7;
                            byte var87 = (byte)var86;
                            var68[var77] = var87;
                            byte[] var69 = this.Dj;
                            var77 = this.Tf;
                            int var88 = var77 + 1;
                            this.Tf = var88;
                            var7 = var1 >>> 16;
                            int var90 = (int)var7;
                            byte var91 = (byte)var90;
                            var69[var77] = var91;
                            byte[] var70 = this.Dj;
                            var77 = this.Tf;
                            int var92 = var77 + 1;
                            Integer var46 = var4;
                            if (var46 != null) {
                                switch (var3) {
                                    case -1964986528:
                                        var3 -= 374392802;
                                        var3 += 2057778020;
                                        var3 <<= 24;
                                        var3 ^= -1000436987;
                                        break;
                                    case 530932812:
                                    default:
                                        var3 ^= 1384543239;
                                        break;
                                    case 707470402:
                                        var3 ^= -1074269592;
                                }

                                this.Tf = var92;
                                var7 = var1 >>> 8;
                                int var47 = (int)var7;
                                byte var48 = (byte)var47;
                                var70[var77] = var48;
                                byte[] var49 = this.Dj;
                                var54 = this.Tf;
                                var77 = var54 + 1;
                                this.Tf = var77;
                                var77 = (int)var1;
                                byte var82 = (byte)var77;
                                var49[var54] = var82;
                                return this;
                            }

                            switch (var3) {
                                case -1964986528:
                                    var3 += -2042255722;
                                    var3 ^= 265056504;
                                    break label80;
                                case -1786818842:
                                default:
                                    var3 ^= -1426841617;
                                    break label80;
                                case 1711660591:
                                    var3 ^= 866052001;
                                    break label80;
                            }
                        }

                        var3 ^= -858536167;
                        var3 ^= 1808038370;
                    } else {
                        switch (var3) {
                            case -1103591054:
                            default:
                                var3 ^= 1189551536;
                                break;
                            case 488208631:
                                var3 <<= 28;
                                var3 ^= -1804989009;
                                break;
                            case 705501533:
                                var3 ^= 1847660303;
                        }
                    }

                    Integer var41 = var3;
                    if (var41 != null) {
                        IllegalArgumentException var42 = new IllegalArgumentException("u32 out of range");
                        throw var42;
                    }
                    break label81;
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 == 0) {
                RuntimeException var53 = new RuntimeException();
                throw var53;
            }
        }

        AssertionError var45 = new AssertionError();
        throw var45;
    }

    public ra FX(long var1) {
        label44: {
            int var3 = w;
            var3 ^= -613186764;
            int var4 = System.identityHashCode(this);
            int var5 = var3 & 1743043535;
            var5 ^= -1546635828;
            this.F(8, var5);
            long var41 = var4;
            long var7 = var41 + 1L;
            var7 = var41 * var7;
            long var9 = var41 + 2L;
            var7 *= var9;
            long var42 = var41 + 3L;
            var7 *= var42;
            long var43 = var7 & 7L;
            long var63;
            var5 = (var63 = var43 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
            if (var5 != 0) {
                var3 += -869269749;
                var3 ^= 1166127047;
            } else {
                var3 >>= 18;
                var3 ^= -1765138849;
                var3 |= -1435830516;
                var3 ^= -1012533587;
                int var45 = 56;
                var45 = var45;
                var3 |= -60406999;
                var3 *= 13958217;
                var3 |= -959172270;
                var3 ^= 2103983804;

                while (true) {
                    Integer var6 = var3;
                    if (var6 == null) {
                        break label44;
                    }

                    if (var45 < 0) {
                        var3 ^= -991347761;
                        var3 >>>= 2;
                        var3 += -756413441;
                        var3 ^= 747317416;
                        var3 ^= -1545511885;
                        return this;
                    }

                    var3 += 2029869071;
                    var3 -= 1060024720;
                    var3 ^= -1091577353;
                    byte[] var47 = this.Dj;
                    int var52 = this.Tf;
                    int var8 = var52 + 1;
                    this.Tf = var8;
                    long var60 = var1 >>> var45;
                    var8 = (int)var60;
                    byte var62 = (byte)var8;
                    var47[var52] = var62;
                    int var48 = var45 + -8;
                    int var53 = var4 + 1;
                    int var54 = var4 * var53;
                    int var55 = var54 & 1;
                    if (var55 != 0) {
                        var3 += 1561373443;
                        var3 += -1305457195;
                        var3 ^= 1853832745;
                        break;
                    }

                    var3 <<= 22;
                    var3 ^= -890528651;
                    int var56 = var3 + 1;
                    int var57 = var3 * var56;
                    int var58 = var57 & 1;
                    if (var58 != 0) {
                        break label44;
                    }

                    var45 = var48;
                    var3 |= 1263438391;
                    var3 -= 173082865;
                    var3 <<= 31;
                    var3 |= -1926908824;
                    var3 ^= 513292551;
                }
            }

            IllegalArgumentException var59 = new IllegalArgumentException();
            throw var59;
        }

        RuntimeException var39 = new RuntimeException();
        throw var39;
    }

    public ra Fo(byte[] var1, int var2) {
        label63: {
            int var3 = w;
            var3 ^= -1185720416;
            int var5 = System.identityHashCode(this);
            int var6 = var5 + 1;
            var6 = var5 * var6;
            int var7 = var5 + 2;
            var6 *= var7;
            var7 = var5 + 3;
            var6 *= var7;
            var6 &= 7;
            var7 = of_2.E;
            var3 ^= var7;
            var3 ^= -989584871;
            of_2.E = -989584871;
            var7 = of_2.cT;
            var3 ^= var7;
            var3 ^= 766553785;
            of_2.cT = 766553785;
            if (var6 != 0) {
                var3 ^= -999405039;
                var3 += 1560104969;
                var3 ^= 1881134747;
                var3 ^= 4618089;
            } else {
                label65: {
                    var3 ^= -362858944;
                    var3 -= 1467159218;
                    var3 ^= 1966516708;
                    var6 = var2 + 1;
                    var6 = var2 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label63;
                    }

                    if (var1 != null) {
                        var3 = switch (var3) {
                            case -1999360534 -> {
                                var3 &= -1376974597;
                                var3 += 1218051964;
                                var3 &= -1658536733;
                                yield var3 ^ 1995489661;
                            }
                            default -> var3 ^ 2091294811;
                            case 729786428 -> var3 ^ -1241559692;
                        };
                        var6 = var1.length;
                        long var76 = var5;
                        long var9 = var76 + 1L;
                        var9 = var76 * var9;
                        long var77 = var9 & 1L;
                        long var89;
                        var7 = (var89 = var77 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            var3 -= -1185350985;
                            var3 ^= -2036312832;
                            break label65;
                        }

                        var3 *= 1954129373;
                        var3 *= 2102982839;
                        var3 ^= -608330306;
                        var7 = var2 + 1;
                        var7 = var2 * var7;
                        int var8 = var2 + 2;
                        var7 *= var8;
                        var8 = var2 + 3;
                        var7 *= var8;
                        var7 &= 7;
                        if (var7 != 0) {
                            break label63;
                        }

                        if (var6 == var2) {
                            var3 = switch (var3) {
                                case -1264312339 -> var3 ^ 1607120262;
                                case 360649947 -> {
                                    var3 -= 300157101;
                                    var3 += -1767604393;
                                    yield var3 ^ -848690360;
                                }
                                default -> var3 ^ -1430818201;
                            };
                            var6 = var3 + 1714088122;
                            var6 ^= 1534096463;
                            this.F(var2, var6);
                            byte[] var71 = this.Dj;
                            var7 = this.Tf;
                            System.arraycopy(var1, 0, var71, var7, var2);
                            var6 = this.Tf;
                            var7 = var5 + 1;
                            var7 = var5 * var7;
                            var5 = var7 & 1;
                            if (var5 == 0) {
                                var3 &= 1007570486;
                                var3 >>= 2;
                                var3 ^= 912535810;
                                Integer var58 = var2;
                                if (var58 != null) {
                                    int var59 = var6 + var2;
                                    this.Tf = var59;
                                    return this;
                                }
                                break label63;
                            }

                            var3 <<= 23;
                            var3 ^= -826565784;
                            break label65;
                        }

                        var3 >>>= 8;
                        var3 *= 1584103765;
                        var3 &= -1216664240;
                        var3 ^= -1057622734;
                        var3 ^= -621219547;
                    } else {
                        var3 -= -1639480245;
                        var3 += -137191631;
                        var3 ^= -379958841;
                    }

                    var3 = var2 + 1;
                    var3 = var2 * var3;
                    var3 &= 1;
                    if (var3 == 0) {
                        StringBuilder var4 = new StringBuilder();
                        var4 = var4.append("fixed field must be ");
                        var4 = var4.append(var2);
                        var4 = var4.append(" bytes");
                        String var56 = var4.toString();
                        IllegalArgumentException var51 = new IllegalArgumentException(var56);
                        throw var51;
                    }
                    break label63;
                }
            }

            RuntimeException var60 = new RuntimeException();
            throw var60;
        }

        UnsupportedOperationException var52 = new UnsupportedOperationException();
        throw var52;
    }

    public ra N(byte[] var1) {
        int var2 = w;
        var2 ^= -725564537;
        int var3 = System.identityHashCode(this);
        int var4 = var1.length;
        int var5 = var2 | -2037923836;
        var5 <<= 27;
        var5 *= -1154085431;
        var5 += -664615473;
        var5 ^= 915587079;
        this.F(var4, var5);
        byte[] var23 = this.Dj;
        var5 = this.Tf;
        Integer var19 = var3;
        if (var19 == null) {
            var19 = switch (var2) {
                case -761711449 -> {
                    var2 ^= 6171113;
                    var2 &= 72305285;
                    var2 >>>= 23;
                    var2 += -1372566995;
                    yield var2 ^ 752309702;
                }
                default -> var2 ^ -916467629;
                case 676148466 -> var2 ^ 1091435079;
            };
            if (var19 != null) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            var2 ^= -1662755125;
            var2 ^= -297027832;
            Integer var14 = var2;
            if (var14 != null) {
                int var16 = var1.length;
                System.arraycopy(var1, 0, var23, var5, var16);
                var16 = this.Tf;
                int var22 = var1.length;
                var16 += var22;
                this.Tf = var16;
                return this;
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    public ra c(String var1, int var2) {
        int var3 = w;
        var3 ^= -473375708;
        int var5 = System.identityHashCode(this);
        byte[] var6 = gZ.U(var1);
        int var7 = var5 + 1;
        var7 = var5 * var7;
        var7 &= 1;
        label43:
        if (var7 == 0) {
            var3 >>= 2;
            var3 ^= 1543546906;
            var7 = var6.length;
            if (var7 > var2) {
                switch (var3) {
                    case -1584323559:
                    default:
                        var3 ^= 1901854099;
                        break;
                    case -1520114981:
                        var3 |= -552249254;
                        var3 ^= 1518089234;
                        break;
                    case -33392588:
                        var3 ^= -732820132;
                }

                Integer var42 = var2;
                if (var42 != null) {
                    StringBuilder var8 = new StringBuilder();
                    var8 = var8.append("string longer than ");
                    var8 = var8.append(var2);
                    String var51 = var8.toString();
                    IllegalArgumentException var43 = new IllegalArgumentException(var51);
                    throw var43;
                }
            } else {
                var3 &= -403927203;
                var3 ^= 53414548;
                long var44 = var2;
                long var9 = var44 + 1L;
                var9 = var44 * var9;
                long var11 = var44 + 2L;
                var9 *= var11;
                long var45 = var44 + 3L;
                var9 *= var45;
                long var46 = var9 & 7L;
                long var55;
                var7 = (var55 = var46 - 0L) == 0L ? 0 : (var55 < 0L ? -1 : 1);
                if (var7 == 0) {
                    var7 = var6.length;
                    Integer var38 = var5;
                    if (var38 == null) {
                        switch (var3) {
                            case -1504999219:
                                var3 |= 1571684923;
                                var3 *= -1403430029;
                                var3 ^= 366376569;
                                var3 &= 985492999;
                                var3 ^= 1178350760;
                                break label43;
                            case -868234005:
                            default:
                                var3 ^= -969957363;
                                break label43;
                            case 281907744:
                                var3 ^= -718264344;
                                break label43;
                        }
                    }

                    var3 >>>= 8;
                    var3 *= 2030066795;
                    var3 |= 1625625385;
                    var3 ^= 157218235;
                    Integer var4 = var2;
                    if (var4 != null) {
                        ra var37 = this.C(var7);
                        return this.N(var6);
                    }
                }
            }

            RuntimeException var36 = new RuntimeException();
            throw var36;
        } else {
            var3 -= 1868305549;
            var3 ^= 540295387;
        }

        RuntimeException var35 = new RuntimeException();
        throw var35;
    }

    public int uP() {
        int var1 = w;
        var1 ^= 40007884;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 ^= 578985552;
            var1 |= 10832911;
            var1 -= 2023324621;
            var1 ^= 1584593509;
            Integer var17 = var1;
            if (var17 != null) {
                return this.Tf;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        } else {
            var1 &= -1765616035;
            var1 -= 1716159376;
            var1 <<= 29;
            var1 ^= -399781391;
            AssertionError var10 = new AssertionError();
            throw var10;
        }
    }

    public byte[] ET() {
        int var1 = w;
        var1 ^= -1655339526;
        int var2 = System.identityHashCode(this);
        byte[] var3 = this.Dj;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 == 0) {
            var1 = switch (var1) {
                case -1693682982 -> {
                    var1 >>>= 2;
                    var1 &= 2052940918;
                    var1 -= 1575864022;
                    yield var1 ^ -1501163569;
                }
                case -820025775 -> var1 ^ -1616604433;
                default -> var1 ^ 1545319516;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var4 = var1 + 2;
            var2 *= var4;
            var4 = var1 + 3;
            var2 *= var4;
            var2 &= 7;
            if (var2 == 0) {
                var2 = this.Tf;
                return Arrays.copyOf(var3, var2);
            }
        } else {
            var1 += 1514514624;
            var1 &= -952800808;
            var1 ^= 1934172740;
            var1 *= 1204743215;
            var1 ^= -360164899;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var30 = var1 + 2;
            var2 *= var30;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }

        AssertionError var17 = new AssertionError();
        throw var17;
    }

    private void F(int var1, int var2) {
        label85: {
            int var4 = var1;
            int var5 = System.identityHashCode(this);
            int var6 = this.Tf;
            var6 += var1;
            int var7 = var5 + 1;
            var7 = var5 * var7;
            int var8 = var5 + 2;
            var7 *= var8;
            var8 = var5 + 3;
            var7 *= var8;
            var7 &= 7;
            if (var7 == 0) {
                int var3 = var2 ^ -2127533144;
                var3 ^= 1300072713;
                var3 &= 1401141434;
                var3 ^= -1786283203;
                var6 = var6;
                byte[] var89 = this.Dj;
                var7 = var89.length;
                if (var6 <= var7) {
                    var3 -= -1292272286;
                    var3 ^= -661527015;
                    long var94 = var1;
                    long var125 = var94 + 1L;
                    var125 = var94 * var125;
                    long var95 = var125 & 1L;
                    long var146;
                    var7 = (var146 = var95 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                    if (var7 == 0) {
                        return;
                    }
                    break label85;
                }

                var3 >>>= 9;
                var3 ^= -26225048;
                var3 ^= -453631684;
                byte[] var91 = this.Dj;
                var7 = var91.length;
                long var99 = var5;
                long var10 = var99 + 1L;
                var10 = var99 * var10;
                long var12 = var99 + 2L;
                var10 *= var12;
                long var100 = var99 + 3L;
                var10 *= var100;
                long var101 = var10 & 7L;
                long var147;
                var8 = (var147 = var101 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                if (var8 == 0) {
                    var3 = switch (var3) {
                        case -44682159 -> var3 ^ 1564131970;
                        default -> var3 ^ 2135600223;
                        case 449999929 -> {
                            var3 &= -1098710465;
                            var3 |= -649781463;
                            var3 -= 1851504449;
                            yield var3 ^ 1598241284;
                        }
                    };
                    var7 = var7;
                    var3 -= -688948057;
                    var3 *= -425818373;
                    var3 ^= -43460999;

                    while (true) {
                        long var103 = var4;
                        var10 = var103 + 1L;
                        var10 = var103 * var10;
                        long var104 = var10 & 1L;
                        long var148;
                        var8 = (var148 = var104 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label85;
                        }

                        if (var7 >= var6) {
                            var3 = switch (var3) {
                                default -> var3 ^ 702104390;
                                case 1514519086 -> {
                                    var3 -= 1704063769;
                                    yield var3 ^ -1783785411;
                                }
                                case 2075655083 -> var3 ^ -156128496;
                            };
                            var6 = var4 + 1;
                            var6 = var4 * var6;
                            var8 = var4 + 2;
                            var6 *= var8;
                            var8 = var4 + 3;
                            var6 *= var8;
                            var6 &= 7;
                            if (var6 != 0) {
                                break label85;
                            }

                            byte[] var84 = this.Dj;
                            long var113 = var5;
                            var10 = var113 + 1L;
                            var10 = var113 * var10;
                            var12 = var113 + 2L;
                            var10 *= var12;
                            long var114 = var113 + 3L;
                            var10 *= var114;
                            long var115 = var10 & 7L;
                            long var149;
                            var5 = (var149 = var115 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                            if (var5 == 0) {
                                switch (var3) {
                                    case -1464487448:
                                        var3 ^= -214362852;
                                        break;
                                    case 1629380392:
                                        var3 *= -1644381329;
                                        var3 += 1058958164;
                                        var3 *= 1017213513;
                                        var3 ^= 1986553085;
                                        var3 ^= 212806941;
                                        break;
                                    case 1991702374:
                                    default:
                                        var3 ^= -513141731;
                                }

                                byte[] var72 = Arrays.copyOf(var84, var7);
                                this.Dj = var72;
                                return;
                            }

                            var3 -= -1412730195;
                            var3 ^= 815603018;
                            break;
                        }

                        var3 >>= 13;
                        var3 += -1547771887;
                        var3 *= 505550061;
                        var3 >>>= 29;
                        var3 ^= -1635060681;
                        long var106 = var4;
                        var10 = var106 + 1L;
                        var10 = var106 * var10;
                        var12 = var106 + 2L;
                        var10 *= var12;
                        long var107 = var106 + 3L;
                        var10 *= var107;
                        long var108 = var10 & 7L;
                        long var150;
                        var8 = (var150 = var108 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label85;
                        }

                        var8 = var7 * 2;
                        int var9 = var5 + 1;
                        var9 = var5 * var9;
                        int var136 = var5 + 2;
                        var9 *= var136;
                        int var137 = var5 + 3;
                        var9 *= var137;
                        var9 &= 7;
                        if (var9 != 0) {
                            var3 <<= 9;
                            var3 *= 1276209177;
                            var3 &= 2006364486;
                            var3 ^= -1243647695;
                            break;
                        }

                        var3 -= 524146214;
                        var3 ^= 1962209086;
                        var3 ^= -914456698;
                        var9 = var4 + 1;
                        var9 = var4 * var9;
                        int var138 = var4 + 2;
                        var9 *= var138;
                        int var139 = var4 + 3;
                        var9 *= var139;
                        var9 &= 7;
                        if (var9 != 0) {
                            break label85;
                        }

                        var7 = var8;
                        var3 += 945248420;
                        var3 += 372524997;
                        var3 ^= -2079821147;
                        var3 &= -1087826635;
                        var3 ^= -817058018;
                    }
                } else {
                    var3 |= 1036296545;
                    var3 *= 196248183;
                    var3 += 365752138;
                    var3 ^= 1229819320;
                }
            } else {
                int var60 = var2 * -305545821;
                var60 >>= 14;
                var60 += -43925145;
                var60 &= 1429522379;
                var60 ^= -789613319;
            }

            long var65 = var4;
            long var73 = var65 + 1L;
            long var74 = var65 * var73;
            long var97 = var65 + 2L;
            long var75 = var74 * var97;
            var65 += 3L;
            long var76 = var75 * var65;
            var65 = var76 & 7L;
            long var151;
            int var68 = (var151 = var65 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
            if (var68 == 0) {
                IllegalStateException var70 = new IllegalStateException();
                throw var70;
            }
        }

        IllegalArgumentException var69 = new IllegalArgumentException();
        throw var69;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1534359669;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        w = var4;
    }
}
