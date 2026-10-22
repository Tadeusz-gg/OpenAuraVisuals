package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum kP_2 implements oF {
    SAME("Same Shape", false),
    CLASSIC("Classic", false),
    DOT("Dot", false),
    CIRCLE("Circle", false),
    CIRCLE_DOT("Circle Dot", false),
    T_SHAPE("T-Shape", false),
    DIAGONAL("X", false),
    PLUS("Plus", false),
    CHEVRON("Chevron", false),
    BRACKETS("Brackets", false),
    TRIAD("Triad", false),
    SNIPER("Sniper", false),
    BURST("Burst", false),
    KILL_X("Crossed Ring", false),
    SPIN("Spin", true),
    PULSE("Pulse", true),
    ORBIT("Orbit", true),
    RADAR("Radar", true),
    BREATHE("Breathe", true),
    HEARTBEAT("Heartbeat", true),
    SCAN("Scan", true),
    TRIAD_SPIN("Triad Spin", true),
    DRAWN("Drawn", false);

    private static final float JF = (float) Math.PI;
    private static final float V = (float) (Math.PI * 2);
    private final String Z;
    private final boolean Q;
    public static final int Jy;

    private kP_2(String var3, boolean var4) {
        this.Z = var3;
        this.Q = var4;
    }

    @Override
    public String displayName() {
        int var1 = Jy;
        var1 ^= -241721443;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var25;
        var2 = (var25 = var18 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 = switch (var1) {
                case -1527745789 -> var1 ^ 1231240721;
                default -> var1 ^ -876351999;
                case 1916884715 -> {
                    var1 |= -609129453;
                    yield var1 ^ 718216194;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.Z;
            } else {
                IllegalStateException var23 = new IllegalStateException();
                throw var23;
            }
        } else {
            switch (var1) {
                case -538672149:
                default:
                    var1 ^= -1988520780;
                    break;
                case 1317764396:
                    var1 ^= -840836720;
                    break;
                case 1916884715:
                    var1 &= 1824855413;
                    var1 -= 552942021;
                    var1 ^= 1247728871;
                    var1 ^= -694965592;
                    var1 ^= 1240364611;
            }

            IllegalArgumentException var14 = new IllegalArgumentException();
            throw var14;
        }
    }

    public boolean animated() {
        int var1 = Jy;
        var1 ^= -1952912490;
        int var2 = System.identityHashCode(this);
        long var24 = var2;
        long var4 = var24 + 1L;
        var4 = var24 * var4;
        long var6 = var24 + 2L;
        var4 *= var6;
        long var25 = var24 + 3L;
        var4 *= var25;
        long var26 = var4 & 7L;
        long var35;
        var2 = (var35 = var26 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        int var3 = of_2.dq;
        var1 ^= var3;
        var1 ^= 1054152787;
        of_2.dq = 1054152787;
        var3 = of_2.P;
        var1 ^= var3;
        var1 ^= 1625666314;
        of_2.P = 1625666314;
        if (var2 != 0) {
            var1 *= 1560764843;
            var1 &= -118313657;
            var1 ^= 1493981326;
            var1 ^= -1773828066;
            IllegalArgumentException var28 = new IllegalArgumentException();
            throw var28;
        } else {
            var1 -= 1340503505;
            var1 -= 707521806;
            var1 ^= 1970975057;
            long var16 = var1;
            long var30 = var16 + 1L;
            long var31 = var16 * var30;
            long var17 = var31 & 1L;
            long var36;
            var1 = (var36 = var17 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var1 != 0) {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            } else {
                return this.Q;
            }
        }
    }

    public static kP_2[] A() {
        int var0 = Jy;
        var0 ^= -313208722;
        kP_2[] var1 = values();
        int var2 = var1.length;
        kP_2[] var8 = new kP_2[--var2];
        var0 <<= 8;
        var0 ^= 853197900;
        var2 = var8.length;
        System.arraycopy(var1, 1, var8, 0, var2);
        return var8;
    }

    public void emit(Ya_2 var1, VA var2) {
        label729: {
            int var25;
            var25 = Jy;
            var25 ^= -809008775;
            int var4 = System.identityHashCode(this);
            float var5 = var2.aM;
            var5 = var5;
            float var6 = var2.tJ;
            var6 = var6;
            float var7 = var2.et;
            var7 = var7;
            float var8 = var2.ea;
            var8 = var8;
            Integer var9 = var4;
            int var10 = of_2.dq;
            var25 ^= var10;
            var25 ^= 1054152787;
            var10 = of_2.P;
            var25 ^= var10;
            var25 ^= 1625666314;
            label694:
            if (var9 != null) {
                var25 ^= -917573576;
                var25 *= -892667201;
                var25 *= 1194116893;
                var25 ^= 1320642797;
                float var571 = var7 * 0.6F;
                float var572 = var571 + 0.1F;
                var10 = this.ordinal();
                label691:
                switch (var10) {
                    case 0:
                        var25 += 139447740;
                        var25 ^= -787434561;
                        var25 &= -1332340174;
                        var25 += 2078070132;
                        var25 ^= 1258532106;
                        break;
                    case 1:
                        var25 = switch (var25) {
                            case -1926778455 -> var25 ^ 2051577436;
                            default -> var25 ^ -862543911;
                            case 70321128 -> {
                                var25 -= -11419818;
                                yield var25 ^ -279813896;
                            }
                        };
                        L(var1, 0.0F, 4, var6, var5, var7, 0, 1.0F);
                        boolean var498 = var2.o;
                        long var500 = var4;
                        long var630 = var500 + 1L;
                        long var631 = var500 * var630;
                        long var501 = var631 & 1L;
                        long var968;
                        var4 = (var968 = var501 - 0L) == 0L ? 0 : (var968 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            var25 = switch (var25) {
                                case -382218061 -> var25 ^ 1523922754;
                                case -343071638 -> {
                                    var25 &= -2090273599;
                                    yield var25 ^ -1640169387;
                                }
                                default -> var25 ^ 907702784;
                            };
                            if (var498) {
                                var25 = switch (var25) {
                                    case -2093016045 -> var25 ^ -1305050952;
                                    case 490021909 -> {
                                        var25 -= -649398106;
                                        var25 ^= -1711346225;
                                        var25 *= -261788521;
                                        var25 += -2060010229;
                                        yield var25 ^ 290098904;
                                    }
                                    default -> var25 ^ 165730724;
                                };
                                long var490 = var25;
                                long var502 = var490 + 1L;
                                long var503 = var490 * var502;
                                long var632 = var490 + 2L;
                                long var504 = var503 * var632;
                                long var491 = var490 + 3L;
                                long var505 = var504 * var491;
                                long var492 = var505 & 7L;
                                long var969;
                                var4 = (var969 = var492 - 0L) == 0L ? 0 : (var969 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label729;
                                }

                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                var25 += -1585212437;
                                var25 += 904740881;
                                var25 ^= 738388177;
                            } else {
                                var25 >>= 15;
                                var25 ^= 558754153;
                                var25 <<= 6;
                                var25 ^= 838779275;
                                var25 ^= 2115130933;
                            }

                            return;
                        }

                        switch (var25) {
                            case -2059633563:
                            default:
                                var25 ^= -1369507905;
                                break label694;
                            case -497716610:
                                var25 ^= 1160352940;
                                break label694;
                            case -343071638:
                                var25 |= -1369573103;
                                var25 &= 472033390;
                                var25 *= -712174147;
                                var25 ^= 1652181008;
                                break label694;
                        }
                    case 2:
                        var25 = switch (var25) {
                            default -> var25 ^ 356582186;
                            case 70321128 -> {
                                var25 -= 810884854;
                                var25 >>>= 1;
                                var25 += -286197279;
                                var25 -= -1555823654;
                                yield var25 ^ -1585720490;
                            }
                            case 1313805988 -> var25 ^ 316828621;
                        };
                        int var564 = var25 + 1;
                        int var565 = var25 * var564;
                        var10 = var25 + 2;
                        int var566 = var565 * var10;
                        var10 = var25 + 3;
                        int var567 = var566 * var10;
                        int var568 = var567 & 7;
                        if (var568 != 0) {
                            break label729;
                        }

                        var8 = var7 * 0.5F;
                        float var628 = var5 * 0.15F;
                        var8 += var628;
                        Integer var629 = var4;
                        if (var629 != null) {
                            var25 *= -255433087;
                            var25 |= -1025374599;
                            var25 ^= 1303521182;
                            var25 ^= -880047351;
                            var1.a(0.0F, 0.0F, var8, 0, 1.0F);
                            var25 -= -1072498515;
                            var25 ^= 1278706283;
                            var25 ^= -65069906;
                            return;
                        }

                        var25 |= -1544713516;
                        var25 |= -1359615775;
                        var25 ^= 53001125;
                        break label694;
                    case 3:
                        var25 = switch (var25) {
                            default -> var25 ^ 799996358;
                            case 70321128 -> {
                                var25 <<= 10;
                                var25 *= 724778245;
                                yield var25 ^ 75562138;
                            }
                            case 76196472 -> var25 ^ -661073640;
                        };
                        Integer var555 = var25;
                        if (var555 == null) {
                            break label729;
                        }

                        var8 = var5 * 0.5F;
                        var8 = var6 + var8;
                        var1.ag(0.0F, 0.0F, var8, var7, 0.0F, (float) (Math.PI * 2), 0, 1.0F);
                        boolean var558 = var2.o;
                        var10 = var4 + 1;
                        var10 = var4 * var10;
                        int var752 = var4 + 2;
                        var10 *= var752;
                        var752 = var4 + 3;
                        var10 *= var752;
                        var10 &= 7;
                        if (var10 == 0) {
                            var25 &= -791841208;
                            var25 ^= -144350567;
                            var10 = var25 + 1;
                            var10 = var25 * var10;
                            var752 = var25 + 2;
                            var10 *= var752;
                            var752 = var25 + 3;
                            var10 *= var752;
                            var10 &= 7;
                            if (var10 != 0) {
                                break label729;
                            }

                            if (var558) {
                                var25 ^= -345796899;
                                var25 &= 1643080050;
                                var25 *= -81216557;
                                var25 ^= 1165610390;
                                int var559 = var25 + 1;
                                int var560 = var25 * var559;
                                var10 = var25 + 2;
                                int var561 = var560 * var10;
                                var10 = var25 + 3;
                                int var562 = var561 * var10;
                                int var563 = var562 & 7;
                                if (var563 != 0) {
                                    break label729;
                                }

                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                var25 ^= -969215881;
                                var25 *= 1706377145;
                                var25 ^= 1102634353;
                                var25 ^= 903460310;
                            } else {
                                var25 += 1377657403;
                                var25 >>>= 14;
                                var25 ^= 479752292;
                            }

                            return;
                        }

                        var25 |= -149993917;
                        var25 += -1592835334;
                        var25 &= 1459922330;
                        var25 ^= -1127128638;
                        break label694;
                    case 4:
                        var25 *= -539917117;
                        var25 += 540217827;
                        var25 ^= 342060664;
                        long var610 = var25;
                        long var854 = var610 + 1L;
                        var854 = var610 * var854;
                        long var611 = var854 & 1L;
                        long var985;
                        int var552 = (var985 = var611 - 0L) == 0L ? 0 : (var985 < 0L ? -1 : 1);
                        if (var552 != 0) {
                            break label729;
                        }

                        var8 = var5 * 0.5F;
                        Integer var612 = var4;
                        if (var612 != null) {
                            var25 = switch (var25) {
                                case -1500262528 -> var25 ^ 1737666918;
                                case -879245853 -> {
                                    var25 &= 1038626351;
                                    var25 -= -1346227559;
                                    yield var25 ^ 1175348591;
                                }
                                default -> var25 ^ -217622030;
                            };
                            var612 = var25;
                            if (var612 == null) {
                                break label729;
                            }

                            var8 = var6 + var8;
                            var1.ag(0.0F, 0.0F, var8, var7, 0.0F, (float) (Math.PI * 2), 0, 1.0F);
                            var1.a(0.0F, 0.0F, var572, 1, 1.0F);
                            var25 -= 19766888;
                            var25 ^= 35537155;
                            return;
                        }

                        var25 &= -561696149;
                        var25 ^= 1984970801;
                        break label694;
                    case 5:
                        var25 -= 601462745;
                        var25 -= -641084816;
                        var25 ^= 1851041387;
                        var25 ^= -2015612360;
                        long var603 = var25;
                        long var848 = var603 + 1L;
                        var848 = var603 * var848;
                        long var944 = var603 + 2L;
                        var848 *= var944;
                        long var604 = var603 + 3L;
                        var848 *= var604;
                        long var605 = var848 & 7L;
                        long var983;
                        int var546 = (var983 = var605 - 0L) == 0L ? 0 : (var983 < 0L ? -1 : 1);
                        if (var546 != 0) {
                            break label729;
                        }

                        int var547 = var25 * -1659955545;
                        int var548 = var547 >>> 20;
                        int var549 = var548 - -1867904318;
                        int var550 = var549 ^ -340861898;
                        Rn(var1, 0.0F, 4, var6, var5, var7, 0, 1.0F, 3, var550);
                        boolean var551 = var2.o;
                        Integer var606 = var4;
                        if (var606 != null) {
                            var25 = switch (var25) {
                                default -> var25 ^ -643988394;
                                case -284881460 -> {
                                    var25 -= 2139540729;
                                    var25 &= -164266197;
                                    yield var25 ^ -1011724329;
                                }
                                case 1264888782 -> var25 ^ 1227098004;
                            };
                            long var607 = var25;
                            var848 = var607 + 1L;
                            var848 = var607 * var848;
                            long var608 = var848 & 1L;
                            long var984;
                            int var609 = (var984 = var608 - 0L) == 0L ? 0 : (var984 < 0L ? -1 : 1);
                            if (var609 != 0) {
                                break label729;
                            }

                            if (var551) {
                                var25 += -1213978759;
                                var25 &= -1815133523;
                                var25 ^= 1761643714;
                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                switch (var25) {
                                    case -1958294546:
                                        var25 ^= -671244627;
                                        return;
                                    case 399673433:
                                    default:
                                        var25 ^= -1813876905;
                                        return;
                                    case 2013957839:
                                        var25 += 1432375812;
                                        var25 |= -2083751321;
                                        var25 += 594125531;
                                        var25 ^= -272577876;
                                }
                            } else {
                                var25 += -231868001;
                                var25 ^= -1960026611;
                            }

                            return;
                        }

                        var25 ^= -1947243785;
                        var25 *= -207243421;
                        var25 ^= -1666361213;
                        break label694;
                    case 6:
                        var25 *= 1610910111;
                        var25 ^= -1774564732;
                        long var593 = var25;
                        long var838 = var593 + 1L;
                        var838 = var593 * var838;
                        long var942 = var593 + 2L;
                        var838 *= var942;
                        long var594 = var593 + 3L;
                        var838 *= var594;
                        long var595 = var838 & 7L;
                        long var980;
                        int var544 = (var980 = var595 - 0L) == 0L ? 0 : (var980 < 0L ? -1 : 1);
                        if (var544 != 0) {
                            break label729;
                        }

                        L(var1, (float) (Math.PI / 4), 4, var6, var5, var7, 0, 1.0F);
                        boolean var545 = var2.o;
                        long var596 = var4;
                        var838 = var596 + 1L;
                        var838 = var596 * var838;
                        long var597 = var838 & 1L;
                        long var981;
                        var10 = (var981 = var597 - 0L) == 0L ? 0 : (var981 < 0L ? -1 : 1);
                        if (var10 == 0) {
                            var25 >>= 3;
                            var25 *= -2081346533;
                            var25 |= 2112469757;
                            var25 ^= 1777759378;
                            long var599 = var25;
                            var838 = var599 + 1L;
                            var838 = var599 * var838;
                            var942 = var599 + 2L;
                            var838 *= var942;
                            long var600 = var599 + 3L;
                            var838 *= var600;
                            long var601 = var838 & 7L;
                            long var982;
                            var10 = (var982 = var601 - 0L) == 0L ? 0 : (var982 < 0L ? -1 : 1);
                            if (var10 != 0) {
                                break label729;
                            }

                            if (var545) {
                                var25 *= 1723069355;
                                var25 ^= 1044809431;
                                var25 += 3876404;
                                var25 &= -878486680;
                                var25 ^= 661088278;
                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                var25 |= 1456703957;
                                var25 *= 706854233;
                                var25 ^= 1193600161;
                            } else {
                                var25 |= 559952177;
                                var25 -= 887393570;
                                var25 ^= 471038243;
                            }

                            return;
                        }

                        var25 *= 1727685485;
                        var25 |= 153338668;
                        var25 ^= 1697549118;
                        break label694;
                    case 7:
                        var25 >>>= 5;
                        var25 += -319276905;
                        var25 *= 2133541321;
                        var25 ^= 1941197410;
                        int var538 = var25 + 1;
                        int var539 = var25 * var538;
                        int var540 = var539 & 1;
                        if (var540 != 0) {
                            break label729;
                        }

                        var8 = var6 + var5;
                        float var542 = -var8;
                        var1.jG(var542, 0.0F, var8, 0.0F, var7, 0, 1.0F);
                        var8 = -var8;
                        int var746 = var4 + 1;
                        var746 = var4 * var746;
                        int var836 = var4 + 2;
                        var746 *= var836;
                        var836 = var4 + 3;
                        var746 *= var836;
                        var746 &= 7;
                        if (var746 == 0) {
                            var25 |= -137826536;
                            var25 ^= -1512850465;
                            Integer var751 = var25;
                            if (var751 == null) {
                                break label729;
                            }

                            var1.jG(0.0F, var8, 0.0F, var8, var7, 0, 1.0F);
                            switch (var25) {
                                case -1333530541:
                                    var25 ^= 1485783472;
                                    return;
                                case 933076684:
                                default:
                                    var25 ^= 858151645;
                                    return;
                                case 1511998531:
                                    var25 <<= 3;
                                    var25 ^= 736497391;
                                    var25 -= 1400419966;
                                    var25 ^= -1153752825;
                                    return;
                            }
                        }

                        var25 |= -1223251025;
                        var25 += 773387593;
                        var25 |= -340312903;
                        var25 ^= 1398979755;
                        break label694;
                    case 8:
                        var25 = switch (var25) {
                            case 70321128 -> {
                                var25 >>>= 14;
                                var25 |= 1636554145;
                                yield var25 ^ -403234693;
                            }
                            default -> var25 ^ -1657327461;
                            case 1894775750 -> var25 ^ 1258904854;
                        };
                        int var531 = var25 + 1;
                        int var532 = var25 * var531;
                        int var533 = var532 & 1;
                        if (var533 != 0) {
                            break label729;
                        }

                        var8 = var5 * 0.8F;
                        Integer var535 = var4;
                        if (var535 != null) {
                            var25 *= 1321425989;
                            var25 ^= -1026331157;
                            var25 ^= 2089825884;
                            float var536 = -var8;
                            float var745 = var6 + var8;
                            var1.jG(var536, var745, 0.0F, var6, var7, 0, 1.0F);
                            float var537 = var6 + var8;
                            var1.jG(0.0F, var6, var8, var537, var7, 0, 1.0F);
                            var1.a(0.0F, 0.0F, var572, 1, 1.0F);
                            switch (var25) {
                                case -928433094:
                                    var25 ^= -695978985;
                                    return;
                                case -586178527:
                                    var25 *= 2145147955;
                                    var25 ^= -1080257043;
                                    return;
                                case 1016434764:
                                default:
                                    var25 ^= -1295460431;
                                    return;
                            }
                        }

                        var25 <<= 3;
                        var25 <<= 20;
                        var25 ^= -22606550;
                        var25 ^= 92348674;
                        var25 ^= -1997312902;
                        break label694;
                    case 9:
                        var25 += -798519415;
                        var25 ^= 139914461;
                        var8 = var5 * 0.5F;
                        var8 = var6 + var8;
                        float var741 = var5 * 0.6F;
                        int var834 = var25 << 16;
                        var834 ^= -1668056393;
                        q(var1, 0.0F, var8, var741, var7, 0, 1.0F, var834);
                        long var742 = var4;
                        long var898 = var742 + 1L;
                        var898 = var742 * var898;
                        long var962 = var742 + 2L;
                        var898 *= var962;
                        long var743 = var742 + 3L;
                        var898 *= var743;
                        long var744 = var898 & 7L;
                        long var979;
                        int var529 = (var979 = var744 - 0L) == 0L ? 0 : (var979 < 0L ? -1 : 1);
                        if (var529 == 0) {
                            var25 = switch (var25) {
                                case -810834480 -> var25 ^ -342491185;
                                case -590446676 -> {
                                    var25 *= 1839574771;
                                    yield var25 ^ -1411708446;
                                }
                                default -> var25 ^ 1052805753;
                            };
                            boolean var530 = var2.o;
                            if (var530) {
                                var25 += -473119777;
                                var25 -= -634056983;
                                var25 += 1081201639;
                                var25 ^= 1836881295;
                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                switch (var25) {
                                    case 1098878156:
                                        var25 ^= -202949416;
                                        return;
                                    case 1188779228:
                                    default:
                                        var25 ^= 1646995717;
                                        return;
                                    case 1895436044:
                                        var25 &= 2036810631;
                                        var25 += 1416779574;
                                        var25 >>>= 22;
                                        var25 += 1208631234;
                                        var25 ^= 1418859947;
                                }
                            } else {
                                switch (var25) {
                                    case -1129988962:
                                        var25 ^= 241035731;
                                        return;
                                    case -746778202:
                                        var25 |= -2039162195;
                                        var25 -= 294332785;
                                        var25 += -201709825;
                                        var25 <<= 19;
                                        var25 ^= -714057858;
                                        return;
                                    case 708086919:
                                    default:
                                        var25 ^= 825566602;
                                }
                            }

                            return;
                        }

                        var25 ^= 627011369;
                        var25 ^= 1162105047;
                        break label694;
                    case 10:
                        var25 >>>= 18;
                        var25 >>>= 12;
                        var25 ^= -1935795305;
                        L(var1, (float) (Math.PI / 2), 3, var6, var5, var7, 0, 1.0F);
                        Integer var523 = var4;
                        if (var523 != null) {
                            var25 = switch (var25) {
                                case -1935795305 -> {
                                    var25 &= 2105607374;
                                    var25 |= 1014631224;
                                    var25 &= -1658593567;
                                    var25 += 957083851;
                                    yield var25 ^ -484964179;
                                }
                                default -> var25 ^ 1569808525;
                                case 265261345 -> var25 ^ -1160228003;
                            };
                            long var739 = var25;
                            long var896 = var739 + 1L;
                            var896 = var739 * var896;
                            var739 = var896 & 1L;
                            long var978;
                            int var524 = (var978 = var739 - 0L) == 0L ? 0 : (var978 < 0L ? -1 : 1);
                            if (var524 != 0) {
                                break label729;
                            }

                            boolean var525 = var2.o;
                            if (var525) {
                                var25 &= 1200661609;
                                var25 ^= -1299245783;
                                Integer var526 = var25;
                                if (var526 == null) {
                                    break label729;
                                }

                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                var25 &= 934885701;
                                var25 += 2022508828;
                                var25 ^= 1451885838;
                                var25 ^= 2030013909;
                                var25 ^= -1614027272;
                            } else {
                                switch (var25) {
                                    case -1237978170:
                                        var25 += -665899506;
                                        var25 -= -334333025;
                                        var25 &= 907953805;
                                        var25 ^= 1049252219;
                                        return;
                                    case -691953857:
                                        var25 ^= -194863371;
                                        return;
                                    case 60510174:
                                    default:
                                        var25 ^= -238967457;
                                }
                            }

                            return;
                        }

                        var25 &= -405040748;
                        var25 |= 183314185;
                        var25 >>>= 19;
                        var25 *= -1430989453;
                        var25 ^= 157799039;
                        break label694;
                    case 11:
                        var25 >>>= 21;
                        var25 >>= 27;
                        var25 ^= 1650771194;
                        var8 = var6 * 0.6F;
                        float var738 = var5 * 2.5F;
                        float var833 = var7 * 0.6F;
                        L(var1, 0.0F, 4, var8, var738, var833, 0, 1.0F);
                        Integer var521 = var4;
                        if (var521 != null) {
                            var25 *= 1940075219;
                            var25 &= 216929754;
                            var25 ^= -36997318;
                            var25 ^= 160498082;
                            Integer var522 = var25;
                            if (var522 == null) {
                                break label729;
                            }

                            var1.a(0.0F, 0.0F, var572, 1, 1.0F);
                            switch (var25) {
                                case -291670761:
                                default:
                                    var25 ^= 1475390316;
                                    return;
                                case -184651118:
                                    var25 |= -1302646141;
                                    var25 -= -1534347249;
                                    var25 ^= 1324084730;
                                    return;
                                case 2092845016:
                                    var25 ^= -856349318;
                                    return;
                            }
                        }

                        switch (var25) {
                            case -1881628475:
                                var25 ^= 1919405001;
                                break label694;
                            case -621987834:
                            default:
                                var25 ^= -1122515681;
                                break label694;
                            case 1650771194:
                                var25 -= -1218480339;
                                var25 += -1170747885;
                                var25 ^= -639083598;
                                break label694;
                        }
                    case 12:
                        var25 *= -1217043491;
                        var25 ^= 1739134190;
                        Integer var514 = var25;
                        if (var514 == null) {
                            break label729;
                        }

                        byte var515 = 0;
                        Integer var726 = var4;
                        if (var726 != null) {
                            var25 = switch (var25) {
                                default -> var25 ^ -869669984;
                                case 1416758182 -> {
                                    var25 ^= -110434299;
                                    yield var25 ^ 650723542;
                                }
                                case 1864395789 -> var25 ^ -1108826778;
                            };
                            int var727 = var25 + 1;
                            var727 = var25 * var727;
                            var727 &= 1;
                            if (var727 != 0) {
                                break label729;
                            }

                            int var516 = var515;
                            var25 += 362464514;
                            var25 |= 1616720117;
                            var25 ^= 1380699889;

                            while (true) {
                                long var730 = var25;
                                long var887 = var730 + 1L;
                                var887 = var730 * var887;
                                long var952 = var730 + 2L;
                                var887 *= var952;
                                long var731 = var730 + 3L;
                                var887 *= var731;
                                long var732 = var887 & 7L;
                                long var986;
                                var727 = (var986 = var732 - 0L) == 0L ? 0 : (var986 < 0L ? -1 : 1);
                                if (var727 != 0) {
                                    break label729;
                                }

                                if (var516 >= 8) {
                                    var25 -= -1887997889;
                                    var25 ^= 740182420;
                                    int var517 = var25 + 1;
                                    int var518 = var25 * var517;
                                    int var519 = var518 & 1;
                                    if (var519 != 0) {
                                        break label729;
                                    }

                                    var25 |= 1846154882;
                                    var25 >>= 24;
                                    var25 += 1344062918;
                                    var25 ^= 1726549156;
                                    var25 ^= 711826927;
                                    return;
                                }

                                var25 |= 2100879103;
                                var25 &= -1568530831;
                                var25 <<= 2;
                                var25 *= -80857819;
                                var25 ^= 1716665863;
                                float var734 = var516;
                                float var735 = var734 * (float) (Math.PI * 2);
                                float var736 = var735 / 8.0F;
                                Integer var818 = var4;
                                if (var818 == null) {
                                    var25 += 862613121;
                                    var25 |= -1429848686;
                                    var25 |= -112056436;
                                    var25 &= 452883321;
                                    var25 ^= -1509199094;
                                    break label694;
                                }
                                var25 = switch (var25) {
                                    default -> var25 ^ -536700628;
                                    case 301273939 -> {
                                        var25 >>>= 31;
                                        var25 += -1015003731;
                                        var25 *= 368482401;
                                        var25 &= -572215152;
                                        yield var25 ^ -1823526386;
                                    }
                                    case 1873348481 -> var25 ^ -1239587976;
                                };
                                int var819 = var516 & 1;
                                int var824;
                                if (var819 == 0) {
                                    var25 &= -515328239;
                                    var25 ^= -1316048071;
                                    long var820 = var25;
                                    long var923 = var820 + 1L;
                                    var923 = var820 * var923;
                                    long var965 = var820 + 2L;
                                    var923 *= var965;
                                    long var821 = var820 + 3L;
                                    var923 *= var821;
                                    long var822 = var923 & 7L;
                                    long var987;
                                    var824 = (var987 = var822 - 0L) == 0L ? 0 : (var987 < 0L ? -1 : 1);
                                    if (var824 != 0) {
                                        break label729;
                                    }

                                    var824 = 1;
                                    var25 <<= 28;
                                    var25 -= 1743245775;
                                    var25 <<= 3;
                                    var25 ^= -642338069;
                                } else {
                                    var25 += -1387675871;
                                    var25 &= -2091559862;
                                    var25 += -215021985;
                                    var25 -= -1743127689;
                                    var25 ^= -301435197;
                                    var824 = 0;
                                    var25 |= 1390146920;
                                    var25 <<= 25;
                                    var25 -= 1650549588;
                                    var25 >>>= 13;
                                    var25 ^= -1720467561;
                                }

                                var887 = var4;
                                var952 = var887 + 1L;
                                var952 = var887 * var952;
                                long var17 = var887 + 2L;
                                var952 *= var17;
                                var887 += 3L;
                                var952 *= var887;
                                var887 = var952 & 7L;
                                long var988;
                                int var894 = (var988 = var887 - 0L) == 0L ? 0 : (var988 < 0L ? -1 : 1);
                                if (var894 != 0) {
                                    var25 ^= 278289564;
                                    var25 |= -966488780;
                                    var25 ^= 1932582829;
                                    break label694;
                                }
                                var25 = switch (var25) {
                                    case -1720204445 -> {
                                        var25 -= -758858040;
                                        var25 -= -1376131069;
                                        var25 -= 630832064;
                                        yield var25 ^ -1844173890;
                                    }
                                    case -1693944923 -> var25 ^ -1178379873;
                                    default -> var25 ^ -520969807;
                                };
                                float var895;
                                if (var824 != 0) {
                                    var25 += 948909154;
                                    var25 |= 1889285189;
                                    var25 *= -879449743;
                                    var25 &= -1223251971;
                                    var25 ^= -3834686;
                                    var895 = var5;
                                    var25 += 1542820554;
                                    var25 &= -382684375;
                                    var25 ^= 1215574268;
                                } else {
                                    var25 = switch (var25) {
                                        case 1234860013 -> var25 ^ 844650140;
                                        case 1628128102 -> {
                                            var25 += -258372772;
                                            var25 |= -2096419920;
                                            var25 <<= 7;
                                            var25 |= 1766771220;
                                            yield var25 ^ 2105468470;
                                        }
                                        default -> var25 ^ -735385065;
                                    };
                                    int var927 = var25 + 1;
                                    var927 = var25 * var927;
                                    int var957 = var25 + 2;
                                    var927 *= var957;
                                    int var958 = var25 + 3;
                                    var927 *= var958;
                                    var927 &= 7;
                                    if (var927 != 0) {
                                        break label729;
                                    }

                                    float var932 = var5 * 0.6F;
                                    var952 = var4;
                                    var17 = var952 + 1L;
                                    var17 = var952 * var17;
                                    var952 = var17 & 1L;
                                    long var989;
                                    int var961 = (var989 = var952 - 0L) == 0L ? 0 : (var989 < 0L ? -1 : 1);
                                    if (var961 != 0) {
                                        var25 <<= 18;
                                        var25 ^= -933412782;
                                        break label694;
                                    }

                                    var25 += -212223187;
                                    var25 ^= -341768258;
                                    var895 = var932;
                                    switch (var25) {
                                        case -1833747665:
                                        default:
                                            var25 ^= -1645004795;
                                            break;
                                        case -1636048911:
                                            var25 &= -333042842;
                                            var25 -= 1077842795;
                                            var25 |= 792567641;
                                            var25 ^= -407147000;
                                            break;
                                        case 1963054339:
                                            var25 ^= -69003186;
                                    }
                                }

                                int var933 = var25 + 1;
                                var933 = var25 * var933;
                                var933 &= 1;
                                if (var933 != 0) {
                                    break label729;
                                }

                                Integer var936 = var4;
                                if (var936 == null) {
                                    switch (var25) {
                                        case -2008772107:
                                            var25 |= 1981085578;
                                            var25 -= -110572082;
                                            var25 -= -1219329238;
                                            var25 += -1866883375;
                                            var25 ^= 1652950410;
                                            break label694;
                                        case -1356489868:
                                        default:
                                            var25 ^= 1860336060;
                                            break label694;
                                        case 323577922:
                                            var25 ^= -1930443543;
                                            break label694;
                                    }
                                }
                                var25 = switch (var25) {
                                    default -> var25 ^ 249338518;
                                    case -2008772107 -> {
                                        var25 *= 2011787757;
                                        var25 |= -351856616;
                                        var25 |= -72394944;
                                        yield var25 ^ -885829534;
                                    }
                                    case -1722719247 -> var25 ^ -1419550138;
                                };
                                byte var828;
                                if (var824 != 0) {
                                    var25 = switch (var25) {
                                        default -> var25 ^ 1383978539;
                                        case 886837179 -> {
                                            var25 -= -115698350;
                                            var25 -= 1937065878;
                                            var25 += 978256713;
                                            var25 |= 303238288;
                                            yield var25 ^ 2144036437;
                                        }
                                        case 1085987368 -> var25 ^ 774114087;
                                    };
                                    var828 = (byte)(var25 + 1);
                                    var828 = (byte)(var25 * var828);
                                    var828 &= 1;
                                    if (var828 != 0) {
                                        break label729;
                                    }

                                    var828 = 0;
                                    var25 &= -861116411;
                                    var25 ^= -1957483914;
                                } else {
                                    var25 = switch (var25) {
                                        default -> var25 ^ 647961875;
                                        case 886837179 -> {
                                            var25 *= 301993269;
                                            var25 >>>= 18;
                                            var25 -= 705318473;
                                            var25 &= -92324370;
                                            yield var25 ^ 1622744345;
                                        }
                                        case 1123299434 -> var25 ^ 414768207;
                                    };
                                    var828 = 1;
                                    var25 -= 1192352741;
                                    var25 -= -74279083;
                                    var25 |= -2132665027;
                                    var25 ^= 699719112;
                                }

                                int var937 = var25 | 1562074127;
                                var937 ^= -1809754184;
                                var937 -= -2051168130;
                                var937 |= 1442920252;
                                var937 ^= 162429722;
                                F(var1, var736, var6, var895, var7, var828, 1.0F, var937);
                                var727 = var516 + 1;
                                var828 = (byte)(var4 + 1);
                                var828 = (byte)(var4 * var828);
                                var828 &= 1;
                                if (var828 != 0) {
                                    var25 ^= 1885723908;
                                    var25 &= -1017635069;
                                    var25 &= 1957754636;
                                    var25 ^= -1127917742;
                                    break label694;
                                }

                                var25 <<= 14;
                                var25 |= 855705040;
                                var25 ^= 891979448;
                                Integer var832 = var25;
                                if (var832 == null) {
                                    break label729;
                                }

                                var516 = var727;
                                switch (var25) {
                                    case -826850456:
                                        var25 &= 366682997;
                                        var25 += 1156347161;
                                        var25 ^= -95828353;
                                        break;
                                    case -23306195:
                                    default:
                                        var25 ^= -1289351475;
                                        break;
                                    case 552650055:
                                        var25 ^= -877675172;
                                }
                            }
                        } else {
                            var25 &= 1633842730;
                            var25 |= -1466251778;
                            var25 *= 444447405;
                            var25 ^= -1525091596;
                            break label694;
                        }
                    case 13:
                        var25 |= 1918854387;
                        var25 &= 417980238;
                        var25 ^= 1306294680;
                        var25 ^= -1473390888;
                        Integer var510 = var25;
                        if (var510 == null) {
                            break label729;
                        }

                        var8 = var6 * 0.5F;
                        float var725 = var5 * 1.4F;
                        Integer var816 = var4;
                        if (var816 != null) {
                            var25 = switch (var25) {
                                default -> var25 ^ 1951579794;
                                case -174528502 -> {
                                    var25 += -750797371;
                                    var25 ^= -340426186;
                                    yield var25 ^ 616198826;
                                }
                                case 1884738211 -> var25 ^ 222571475;
                            };
                            float var817 = var7 * 1.2F;
                            L(var1, (float) (Math.PI / 4), 4, var8, var725, var817, 0, 1.0F);
                            var8 = var5 * 0.7F;
                            var8 = var6 + var8;
                            var1.ag(0.0F, 0.0F, var8, var7, 0.0F, (float) (Math.PI * 2), 1, 1.0F);
                            var25 ^= -959115116;
                            var25 ^= -577105223;
                            return;
                        }

                        switch (var25) {
                            case -174528502:
                                var25 -= 978632355;
                                var25 ^= 126970165;
                                break label694;
                            case 1643361435:
                                var25 ^= -1976167846;
                                break label694;
                            case 1702679258:
                            default:
                                var25 ^= 167475611;
                                break label694;
                        }
                    case 14:
                        var25 &= -143616876;
                        var25 += 702147851;
                        var25 += 1572325285;
                        var25 |= -1212861977;
                        var25 ^= 1049383451;
                        int var712 = var25 + 1;
                        var712 = var25 * var712;
                        int var812 = var25 + 2;
                        var712 *= var812;
                        var812 = var25 + 3;
                        var712 *= var812;
                        var712 &= 7;
                        if (var712 != 0) {
                            break label729;
                        }

                        var8 *= (float) Math.PI;
                        var712 = var4 + 1;
                        var712 = var4 * var712;
                        var812 = var4 + 2;
                        var712 *= var812;
                        var812 = var4 + 3;
                        var712 *= var812;
                        var712 &= 7;
                        if (var712 == 0) {
                            var25 |= -347901563;
                            var25 -= 1852247305;
                            var25 ^= -70326530;
                            long var722 = var25;
                            long var885 = var722 + 1L;
                            var885 = var722 * var885;
                            long var723 = var885 & 1L;
                            long var977;
                            var712 = (var977 = var723 - 0L) == 0L ? 0 : (var977 < 0L ? -1 : 1);
                            if (var712 != 0) {
                                break label729;
                            }

                            var8 *= 0.8F;
                            L(var1, var8, 4, var6, var5, var7, 0, 1.0F);
                            var1.a(0.0F, 0.0F, var572, 1, 1.0F);
                            var25 &= 1121189946;
                            var25 ^= -1915236178;
                            var25 ^= -1818261558;
                            return;
                        }

                        var25 *= 1221196009;
                        var25 ^= -734399074;
                        break label694;
                    case 15:
                        var25 = switch (var25) {
                            case -1326041773 -> var25 ^ 1773904231;
                            default -> var25 ^ -804074402;
                            case 70321128 -> {
                                var25 >>>= 9;
                                yield var25 ^ 898097884;
                            }
                        };
                        int var695 = var25 + 1;
                        var695 = var25 * var695;
                        var695 &= 1;
                        if (var695 != 0) {
                            break label729;
                        }

                        float var698 = var8 * 0.8F;
                        int var803 = var25 * -1932834681;
                        var803 |= -448111419;
                        var803 *= -928058081;
                        var803 ^= -1487727143;
                        var803 ^= 319486959;
                        float var699 = u(var698, var803);
                        float var700 = 0.45F * var699;
                        float var701 = 0.3F + var700;
                        float var702 = var5 * var701;
                        float var703 = var6 + var702;
                        float var808 = 0.75F * var699;
                        float var809 = 1.0F - var808;
                        var1.ag(0.0F, 0.0F, var703, var7, 0.0F, (float) (Math.PI * 2), 1, var809);
                        Integer var704 = var4;
                        if (var704 != null) {
                            var25 = switch (var25) {
                                case 113601111 -> var25 ^ 1455429917;
                                case 897972829 -> {
                                    var25 += -1338400295;
                                    var25 += 133823479;
                                    var25 *= 1816404635;
                                    var25 += -806450706;
                                    yield var25 ^ 225687481;
                                }
                                default -> var25 ^ -1144041346;
                            };
                            int var705 = var25 + 1;
                            var705 = var25 * var705;
                            var803 = var25 + 2;
                            var705 *= var803;
                            var803 = var25 + 3;
                            var705 *= var803;
                            var705 &= 7;
                            if (var705 != 0) {
                                break label729;
                            }

                            float var710 = var5 * 0.3F;
                            float var711 = var6 + var710;
                            var1.ag(0.0F, 0.0F, var711, var7, 0.0F, (float) (Math.PI * 2), 0, 1.0F);
                            var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                            switch (var25) {
                                case -2067166290:
                                default:
                                    var25 ^= -811327243;
                                    return;
                                case -1073475436:
                                    var25 -= 1633665760;
                                    var25 ^= 1111235274;
                                    return;
                                case 2119027953:
                                    var25 ^= 1144005730;
                                    return;
                            }
                        }

                        var25 += 1806470713;
                        var25 &= 719680404;
                        var25 ^= -1661648698;
                        break label694;
                    case 16:
                        var25 >>= 3;
                        var25 &= 269528293;
                        var25 ^= -2099168037;
                        long var682 = var25;
                        long var874 = var682 + 1L;
                        var874 = var682 * var874;
                        var682 = var874 & 1L;
                        long var990;
                        int var684 = (var990 = var682 - 0L) == 0L ? 0 : (var990 < 0L ? -1 : 1);
                        if (var684 != 0) {
                            break label729;
                        }

                        float var685 = var5 * 0.6F;
                        float var686 = var6 + var685;
                        Integer var790 = var4;
                        if (var790 == null) {
                            var25 ^= 37357948;
                            var25 &= -892023834;
                            var25 *= 1596656927;
                            var25 -= 1358054004;
                            var25 ^= -1656779176;
                            break label694;
                        }

                        var25 += 708917769;
                        var25 ^= 339443454;
                        float var589 = var686;
                        float var687 = var7 * 0.6F;
                        var1.ag(0.0F, 0.0F, var686, var687, 0.0F, (float) (Math.PI * 2), 0, 0.3F);
                        byte var688 = 0;
                        int var689 = var688;

                        var25 = switch (var25) {
                            case -1189533639 -> {
                                var25 ^= -1762147419;
                                var25 |= -1350578700;
                                var25 <<= 27;
                                var25 >>>= 29;
                                yield var25 ^ -2097532507;
                            }
                            default -> var25 ^ -1124080943;
                            case -25886443 -> var25 ^ 1425915369;
                        };

                        while (true) {
                            var790 = var25;
                            if (var790 == null) {
                                break label729;
                            }

                            if (var689 >= 3) {
                                var25 -= 754917220;
                                var25 |= -553543616;
                                var25 &= -927139817;
                                var25 >>= 19;
                                var25 ^= -1628069672;
                                int var690 = var25 + 1;
                                int var691 = var25 * var690;
                                int var801 = var25 + 2;
                                int var692 = var691 * var801;
                                var801 = var25 + 3;
                                int var693 = var692 * var801;
                                int var694 = var693 & 7;
                                if (var694 != 0) {
                                    break label729;
                                }

                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                var25 |= 1392543922;
                                var25 ^= 1871875713;
                                return;
                            }

                            var25 *= -235770893;
                            var25 |= 1872893037;
                            var25 ^= 756008236;
                            long var792 = var25;
                            long var915 = var792 + 1L;
                            var915 = var792 * var915;
                            long var793 = var915 & 1L;
                            long var991;
                            int var794 = (var991 = var793 - 0L) == 0L ? 0 : (var991 < 0L ? -1 : 1);
                            if (var794 != 0) {
                                break label729;
                            }

                            float var795 = var8 * (float) (Math.PI * 2);
                            float var796 = var795 * 0.5F;
                            float var876 = var689;
                            float var877 = var876 * (float) (Math.PI * 2);
                            float var878 = var877 / 3.0F;
                            float var797 = var796 + var878;
                            int var879 = var25 >>> 19;
                            int var880 = var879 >>> 21;
                            int var881 = var880 * 747420541;
                            int var882 = var881 ^ 543149952;
                            float var883 = wf(var797, var882);
                            float var884 = var883 * var589;
                            int var917 = var25 & -744935772;
                            int var918 = var917 & -1401708531;
                            int var919 = var918 | -572191871;
                            int var920 = var919 ^ 1676851405;
                            float var798 = YL(var797, var920);
                            float var799 = var798 * var589;
                            float var921 = var7 * 0.75F;
                            float var922 = var921 + 0.15F;
                            int var947 = var4 + 1;
                            var947 = var4 * var947;
                            int var963 = var4 + 2;
                            var947 *= var963;
                            var963 = var4 + 3;
                            var947 *= var963;
                            var947 &= 7;
                            if (var947 != 0) {
                                var25 &= 1437617356;
                                var25 -= -1352937753;
                                var25 *= 382380961;
                                var25 ^= 313265195;
                                break label694;
                            }

                            var25 += 468700142;
                            var25 ^= -107482582;
                            var25 *= -914834403;
                            var25 *= -763691471;
                            var25 ^= -1804016906;
                            var1.a(var884, var799, var922, 1, 1.0F);
                            var794 = var689 + 1;
                            var689 = var794;
                            var25 &= -1474301391;
                            var25 *= -928106679;
                            var25 &= 1633507763;
                            var25 |= 9086422;
                            var25 ^= -479886251;
                        }
                    case 17:
                        var25 = switch (var25) {
                            default -> var25 ^ 1787984953;
                            case 70321128 -> {
                                var25 -= -401050533;
                                yield var25 ^ -341199325;
                            }
                            case 1095064413 -> var25 ^ 246980361;
                        };
                        int var673 = var25 + 1;
                        var673 = var25 * var673;
                        int var783 = var25 + 2;
                        var673 *= var783;
                        var783 = var25 + 3;
                        var673 *= var783;
                        var673 &= 7;
                        if (var673 != 0) {
                            break label729;
                        }

                        float var678 = var5 * 0.6F;
                        float var679 = var6 + var678;
                        var1.ag(0.0F, 0.0F, var679, var7, 0.0F, (float) (Math.PI * 2), 0, 0.3F);
                        float var680 = var8 * (float) (Math.PI * 2);
                        var783 = var4 + 1;
                        var783 = var4 * var783;
                        int var872 = var4 + 2;
                        var783 *= var872;
                        var872 = var4 + 3;
                        var783 *= var872;
                        var783 &= 7;
                        if (var783 == 0) {
                            var25 -= -39706424;
                            var25 += -1060987558;
                            var25 |= -1401084025;
                            var25 ^= -1845047870;
                            float var681 = var680 * 0.6F;
                            var1.ag(0.0F, 0.0F, var679, var7, var681, 1.7278761F, 1, 1.0F);
                            var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                            var25 -= 1103887693;
                            var25 *= 1056490041;
                            var25 &= -1169937805;
                            var25 |= 1666543145;
                            var25 ^= -405980921;
                            return;
                        }

                        switch (var25) {
                            case -1401278154:
                            default:
                                var25 ^= -1365292647;
                                break label694;
                            case -139380306:
                                var25 += -804455440;
                                var25 += 1892550982;
                                var25 ^= -2099982108;
                                var25 += -618813514;
                                var25 ^= 698602980;
                                break label694;
                            case 657924271:
                                var25 ^= 1249051703;
                                break label694;
                        }
                    case 18:
                        var25 = switch (var25) {
                            case -1766158421 -> var25 ^ 658346323;
                            default -> var25 ^ -440252097;
                            case 70321128 -> {
                                var25 -= -1394901682;
                                yield var25 ^ -695530791;
                            }
                        };
                        long var665 = var25;
                        long var864 = var665 + 1L;
                        var864 = var665 * var864;
                        long var946 = var665 + 2L;
                        var864 *= var946;
                        var665 += 3L;
                        var864 *= var665;
                        var665 = var864 & 7L;
                        long var970;
                        int var668 = (var970 = var665 - 0L) == 0L ? 0 : (var970 < 0L ? -1 : 1);
                        if (var668 != 0) {
                            break label729;
                        }

                        float var669 = var5 * 0.5F;
                        float var775 = var8 * 0.7F;
                        int var868 = var25 & -1525593801;
                        int var869 = var868 * 357960925;
                        int var870 = var869 - 2058632932;
                        int var871 = var870 ^ -1431980908;
                        var775 = u(var775, var871);
                        float var670 = var669 * var775;
                        float var671 = var6 + var670;
                        long var777 = var4;
                        long var911 = var777 + 1L;
                        var911 = var777 * var911;
                        long var778 = var911 & 1L;
                        long var971;
                        int var779 = (var971 = var778 - 0L) == 0L ? 0 : (var971 < 0L ? -1 : 1);
                        if (var779 == 0) {
                            var25 += -1199649957;
                            var25 |= -1843979836;
                            var25 ^= -36079897;
                            long var780 = var25;
                            var911 = var780 + 1L;
                            var911 = var780 * var911;
                            long var781 = var911 & 1L;
                            long var972;
                            int var782 = (var972 = var781 - 0L) == 0L ? 0 : (var972 < 0L ? -1 : 1);
                            if (var782 != 0) {
                                break label729;
                            }

                            L(var1, 0.0F, 4, var671, var5, var7, 0, 1.0F);
                            boolean var672 = var2.o;
                            if (var672) {
                                var25 |= 1295917487;
                                var25 &= -477167203;
                                var25 |= -964394663;
                                var25 -= -839645937;
                                var25 ^= 1477794150;
                                var1.a(0.0F, 0.0F, var572, 0, 1.0F);
                                var25 -= -1304996028;
                                var25 -= 2117900413;
                                var25 ^= 1837327001;
                            } else {
                                var25 &= 1931582834;
                                var25 += 516163439;
                                var25 -= 348442967;
                                var25 ^= 1348954166;
                            }

                            return;
                        }

                        switch (var25) {
                            case -2116121533:
                                var25 >>>= 29;
                                var25 &= 231147291;
                                var25 ^= -13854069;
                                var25 >>= 30;
                                var25 ^= 1126875053;
                                break label694;
                            case -62849338:
                                var25 ^= 956648819;
                                break label694;
                            case 237654496:
                            default:
                                var25 ^= 1977499807;
                                break label694;
                        }
                    case 19:
                        var25 |= -503904150;
                        var25 ^= -1134848933;
                        Integer var644 = var25;
                        if (var644 == null) {
                            break label729;
                        }

                        float var645 = t(var8);
                        int var646 = var4 + 1;
                        var646 = var4 * var646;
                        int var770 = var4 + 2;
                        var646 *= var770;
                        var770 = var4 + 3;
                        var646 *= var770;
                        var646 &= 7;
                        if (var646 == 0) {
                            var25 = switch (var25) {
                                case -1021376351 -> var25 ^ 805002983;
                                default -> var25 ^ 1422224269;
                                case 1504485297 -> {
                                    var25 += -933987701;
                                    yield var25 ^ 976850161;
                                }
                            };
                            long var651 = var25;
                            long var860 = var651 + 1L;
                            var860 = var651 * var860;
                            long var945 = var651 + 2L;
                            var860 *= var945;
                            long var652 = var651 + 3L;
                            var860 *= var652;
                            long var653 = var860 & 7L;
                            long var976;
                            var646 = (var976 = var653 - 0L) == 0L ? 0 : (var976 < 0L ? -1 : 1);
                            if (var646 != 0) {
                                break label729;
                            }

                            float var655 = 0.35F * var645;
                            float var656 = 0.35F + var655;
                            float var657 = var5 * var656;
                            float var658 = var6 + var657;
                            var1.ag(0.0F, 0.0F, var658, var7, 0.0F, (float) (Math.PI * 2), 1, var645);
                            float var659 = var7 * 0.9F;
                            float var660 = var659 * var645;
                            float var661 = var572 + var660;
                            var1.a(0.0F, 0.0F, var661, 0, 1.0F);
                            float var662 = var5 * 0.6F;
                            float var663 = var6 + var662;
                            float var772 = var5 * 0.25F;
                            float var773 = var772 * var645;
                            float var664 = var663 + var773;
                            float var774 = var5 * 0.5F;
                            L(var1, 0.0F, 4, var664, var774, var7, 0, 0.85F);
                            var25 -= 955321486;
                            var25 += -1586180159;
                            var25 -= 530144121;
                            var25 *= -891237975;
                            var25 ^= -896904863;
                            return;
                        }

                        var25 >>= 27;
                        var25 |= 954820190;
                        var25 += -1904976409;
                        var25 ^= 2072544276;
                        break label694;
                    case 20:
                        var25 -= 1536479722;
                        var25 ^= -1306607513;
                        var10 = var25 + 1;
                        var10 = var25 * var10;
                        var10 &= 1;
                        if (var10 != 0) {
                            break label729;
                        }

                        float var585 = var8 * 0.9F;
                        int var637 = var25 & -490880356;
                        var637 *= -958572659;
                        var637 ^= -4931425;
                        float var586 = u(var585, var637);
                        float var640 = var8 * (float) Math.PI;
                        float var641 = var640 * 0.5F;
                        float var759 = 0.3F * var586;
                        var759 = 0.35F + var759;
                        var759 = var5 * var759;
                        var759 = var6 + var759;
                        float var859 = var5 * 0.55F;
                        int var902 = var25 * -1391280233;
                        var902 &= -323528579;
                        var902 *= 1157908601;
                        var902 ^= -1292382061;
                        var902 ^= -75454735;
                        q(var1, var641, var759, var859, var7, 0, 1.0F, var902);
                        float var642 = 0.4F * var586;
                        int var763 = var4 + 1;
                        int var764 = var4 * var763;
                        int var765 = var764 & 1;
                        if (var765 == 0) {
                            var25 &= 16402672;
                            var25 ^= -405863598;
                            var25 |= 1701662383;
                            var25 -= -322642364;
                            var25 ^= 559747394;
                            long var766 = var25;
                            long var907 = var766 + 1L;
                            long var908 = var766 * var907;
                            long var16 = var766 + 2L;
                            long var909 = var908 * var16;
                            long var767 = var766 + 3L;
                            long var910 = var909 * var767;
                            long var768 = var910 & 7L;
                            long var975;
                            int var769 = (var975 = var768 - 0L) == 0L ? 0 : (var975 < 0L ? -1 : 1);
                            if (var769 != 0) {
                                break label729;
                            }

                            float var643 = 0.6F + var642;
                            var1.a(0.0F, 0.0F, var572, 1, var643);
                            switch (var25) {
                                case -1602889300:
                                    var25 ^= -1322825194;
                                    return;
                                case -604675863:
                                    var25 *= 1130603465;
                                    var25 += -118090847;
                                    var25 &= -1401466834;
                                    var25 *= -1386169567;
                                    var25 ^= 1769939260;
                                    return;
                                case -180969384:
                                default:
                                    var25 ^= -527373238;
                                    return;
                            }
                        }

                        var25 &= -1627279211;
                        var25 ^= 1346144198;
                        var25 ^= -152471803;
                        break label694;
                    case 21:
                        var25 += 660533337;
                        var25 ^= 544825569;
                        long var575 = var25;
                        long var12 = var575 + 1L;
                        var12 = var575 * var12;
                        long var14 = var575 + 2L;
                        var12 *= var14;
                        long var576 = var575 + 3L;
                        var12 *= var576;
                        long var577 = var12 & 7L;
                        long var973;
                        var10 = (var973 = var577 - 0L) == 0L ? 0 : (var973 < 0L ? -1 : 1);
                        if (var10 != 0) {
                            break label729;
                        }

                        float var579 = var8 * (float) Math.PI;
                        float var580 = var579 * 0.9F;
                        float var581 = (float) (Math.PI / 2) - var580;
                        long var11 = var4;
                        long var13 = var11 + 1L;
                        var13 = var11 * var13;
                        long var15 = var11 + 2L;
                        var13 *= var15;
                        var11 += 3L;
                        var13 *= var11;
                        var11 = var13 & 7L;
                        long var974;
                        int var635 = (var974 = var11 - 0L) == 0L ? 0 : (var974 < 0L ? -1 : 1);
                        if (var635 == 0) {
                            var25 -= -1286103026;
                            var25 *= -157165371;
                            var25 ^= -2024913741;
                            Integer var636 = var25;
                            if (var636 == null) {
                                break label729;
                            }

                            L(var1, var581, 3, var6, var5, var7, 0, 1.0F);
                            var1.a(0.0F, 0.0F, var572, 1, 1.0F);
                            var25 |= -576499436;
                            var25 |= 1127005263;
                            var25 ^= -483939711;
                            return;
                        }

                        switch (var25) {
                            case -361925172:
                                var25 ^= -869377810;
                                break label694;
                            case 200709280:
                                var25 -= 1255998767;
                                var25 -= 1601140246;
                                var25 |= -2065471566;
                                var25 ^= 1497251753;
                                break label694;
                            case 1683029407:
                            default:
                                var25 ^= -1823408299;
                                break label694;
                        }
                    case 22:
                        switch (var25) {
                            case -2131621031:
                                var25 ^= 390051798;
                                break label691;
                            case -1898527503:
                            default:
                                var25 ^= 925596824;
                                break label691;
                            case 70321128:
                                var25 &= -468308109;
                                var25 &= -923666314;
                                var25 += -538426331;
                                var25 ^= -1734918647;
                                break label691;
                        }
                    default:
                        var25 >>>= 16;
                        var25 ^= 1793751216;
                        var25 *= -1865070959;
                        var25 *= 973396923;
                        var25 ^= -553142507;
                        return;
                }

                var4 = var25 + 1;
                var4 = var25 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label729;
                }

                var25 -= 1025807046;
                var25 &= -195159889;
                var25 ^= 483547128;
                return;
            } else {
                var25 >>>= 8;
                var25 ^= -1130802918;
            }

            Integer var464 = var25;
            if (var464 != null) {
                AssertionError var465 = new AssertionError();
                throw var465;
            }
        }

        UnsupportedOperationException var488 = new UnsupportedOperationException();
        throw var488;
    }

    private static void L(Ya_2 var0, float var1, int var2, float var3, float var4, float var5, int var6, float var7) {
        int var8 = Jy;
        var8 ^= 514633789;
        int var10 = System.identityHashCode(var0);
        Integer var25 = var10;
        if (var25 != null) {
            var8 ^= -2013878835;
            var8 |= 1477281009;
            var8 |= -123220896;
            var8 ^= -2108473190;
            Integer var9 = var2;
            if (var9 != null) {
                int var22 = var8 | 1085729153;
                var22 >>>= 2;
                var22 ^= -1698391319;
                Rn(var0, var1, var2, var3, var4, var5, var6, var7, var2, var22);
            } else {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            }
        } else {
            var8 |= 1460558854;
            var8 &= 1182189427;
            var8 += 2011819836;
            var8 ^= 1684356203;
            IllegalArgumentException var16 = new IllegalArgumentException();
            throw var16;
        }
    }

    private static void Rn(Ya_2 var0, float var1, int var2, float var3, float var4, float var5, int var6, float var7, int var8, int var9) {
        label65: {
            int var11 = var2;
            int var12 = System.identityHashCode(var0);
            int var13 = 0;
            long var14 = var12;
            long var16 = var14 + 1L;
            var16 = var14 * var16;
            long var18 = var14 + 2L;
            var16 *= var18;
            var14 += 3L;
            var16 *= var14;
            var14 = var16 & 7L;
            long var84;
            int var54 = (var84 = var14 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
            if (var54 == 0) {
                int var25 = var9 + 1732275181;
                var25 ^= -937285677;
                var14 = var2;
                var16 = var14 + 1L;
                var16 = var14 * var16;
                var14 = var16 & 1L;
                long var85;
                int var57 = (var85 = var14 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                if (var57 != 0) {
                    break label65;
                }

                var13 = var13;

                var25 = switch (var25) {
                    case 605664940 -> {
                        var25 -= -1246462127;
                        var25 -= -881338562;
                        var25 |= 1457987716;
                        yield var25 ^ 1483182028;
                    }
                    default -> var25 ^ 1049282467;
                    case 1875386044 -> var25 ^ -1223559042;
                };

                while (true) {
                    int var58 = var11 + 1;
                    int var59 = var11 * var58;
                    int var60 = var59 & 1;
                    if (var60 != 0) {
                        break label65;
                    }

                    if (var13 >= var8) {
                        var25 -= -471376383;
                        var25 &= -1599170662;
                        var25 ^= 367021001;
                        var12 = var11 + 1;
                        var12 = var11 * var12;
                        var12 &= 1;
                        if (var12 == 0) {
                            return;
                        }
                        break label65;
                    }

                    var25 &= 410250162;
                    var25 &= 1587674850;
                    var25 |= -1038082003;
                    var25 &= 1827805309;
                    var25 ^= -352446233;
                    Integer var61 = var11;
                    if (var61 == null) {
                        break label65;
                    }

                    float var62 = var13;
                    long var15 = var12;
                    long var17 = var15 + 1L;
                    var17 = var15 * var17;
                    long var19 = var15 + 2L;
                    var17 *= var19;
                    var15 += 3L;
                    var17 *= var15;
                    var15 = var17 & 7L;
                    long var86;
                    int var69 = (var86 = var15 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                    if (var69 != 0) {
                        var25 ^= -1808402010;
                        var25 ^= -1098739848;
                        break;
                    }

                    var25 <<= 7;
                    var25 ^= -315555141;
                    float var63 = var62 * (float) (Math.PI * 2);
                    float var70 = var2;
                    float var64 = var63 / var70;
                    float var65 = var1 + var64;
                    int var71 = var25 ^ -903691264;
                    int var72 = var71 - -1836672559;
                    int var73 = var72 ^ 1738392671;
                    int var74 = var73 ^ 1132290227;
                    int var75 = var74 ^ 1332109665;
                    F(var0, var65, var3, var4, var5, var6, var7, var75);
                    int var66 = var13 + 1;
                    var13 = var66;
                    switch (var25) {
                        case -2110167109:
                            var25 ^= -20217983;
                            var25 ^= 709633421;
                            var25 ^= -130624794;
                            break;
                        case -21506321:
                            var25 ^= -1157907383;
                            break;
                        case 1014611398:
                        default:
                            var25 ^= 2001615453;
                    }
                }
            } else {
                int var10 = var9 << 3;
                var10 ^= 702901507;
                var10 <<= 24;
                var10 &= 1358415864;
                var10 ^= -1737923052;
            }

            Integer var42 = var11;
            if (var42 != null) {
                RuntimeException var43 = new RuntimeException();
                throw var43;
            }
        }

        RuntimeException var47 = new RuntimeException();
        throw var47;
    }

    private static void F(Ya_2 var0, float var1, float var2, float var3, float var4, int var5, float var6, int var7) {
        int var10 = System.identityHashCode(var0);
        int var11 = var7 + -1749992352;
        var11 &= 180573376;
        var11 ^= 547278656;
        float var39 = wf(var1, var11);
        int var12 = var7 & -185050463;
        var12 -= -967448904;
        var12 ^= -1279405531;
        float var43 = YL(var1, var12);
        float var13 = var39 * var2;
        float var14 = var43 * var2;
        float var15 = var2 + var3;
        float var40 = var39 * var15;
        int var44 = var10 + 1;
        int var45 = var10 * var44;
        var10 = var45 & 1;
        if (var10 != 0) {
            switch (var7) {
                case -1345754817:
                    int var25 = var7 ^ -1022829340;
                    break;
                case -569127833:
                    int var21 = var7 + 1563499031;
                    var21 += 804618710;
                    var21 |= -517266812;
                    var21 ^= 846607844;
                    break;
                case 1548834942:
                default:
                    int var8 = var7 ^ 1279460567;
            }

            long var46 = var5;
            long var17 = var46 + 1L;
            var17 = var46 * var17;
            long var19 = var46 + 2L;
            var17 *= var19;
            long var47 = var46 + 3L;
            var17 *= var47;
            long var48 = var17 & 7L;
            long var52;
            var10 = (var52 = var48 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
            if (var10 == 0) {
                IllegalArgumentException var36 = new IllegalArgumentException();
                throw var36;
            }
        } else {
            int var26 = var7 ^ -399925150;
            var26 |= -1327987380;
            var26 ^= -1230980697;
            var26 ^= -1600677992;
            Integer var30 = var5;
            if (var30 != null) {
                float var32 = var2 + var3;
                float var33 = var43 * var32;
                var0.jG(var13, var14, var40, var33, var4, var5, var6);
                return;
            }
        }

        RuntimeException var31 = new RuntimeException();
        throw var31;
    }

    private static void q(Ya_2 var0, float var1, float var2, float var3, float var4, int var5, float var6, int var7) {
        label113: {
            int var9 = var5;
            int var10 = System.identityHashCode(var0);
            int var11 = var7 | -41049385;
            var11 |= 2015698648;
            var11 ^= -538955393;
            float var91 = wf(var1, var11);
            float var92 = var91;
            int var12 = var7 * 1152510819;
            var12 |= 971150002;
            var12 -= 126067990;
            var12 ^= 176160173;
            float var96 = YL(var1, var12);
            float var97 = var96;
            long var13 = var10;
            long var15 = var13 + 1L;
            var15 = var13 * var15;
            var13 = var15 & 1L;
            long var186;
            int var99 = (var186 = var13 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
            if (var99 != 0) {
                int var8 = var7 ^ 344709415;
                var8 += -1792400234;
                var8 ^= -1904454822;
            } else {
                int var24 = var7 - -1054056778;
                var24 &= -1931660228;
                var24 ^= -1205026177;
                var13 = var5;
                var15 = var13 + 1L;
                var15 = var13 * var15;
                var13 = var15 & 1L;
                long var187;
                int var102 = (var187 = var13 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                if (var102 != 0) {
                    break label113;
                }

                byte var103 = 0;
                int var104 = var103;
                var24 |= 1125933029;
                var24 |= 1890137458;
                var24 ^= 1495732801;

                while (true) {
                    long var14 = var9;
                    long var16 = var14 + 1L;
                    var16 = var14 * var16;
                    var14 = var16 & 1L;
                    long var188;
                    int var106 = (var188 = var14 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                    if (var106 != 0) {
                        break label113;
                    }

                    if (var104 >= 4) {
                        var24 *= 1819890079;
                        var24 += 1669661968;
                        var24 ^= 1689240096;
                        var24 ^= 2060888763;
                        return;
                    }

                    var24 += 1894905298;
                    var24 -= 2143350898;
                    var24 ^= 719394315;
                    var24 ^= 618274054;
                    int var107 = var104 & 1;
                    var15 = var10;
                    long var17 = var15 + 1L;
                    var17 = var15 * var17;
                    var15 = var17 & 1L;
                    long var189;
                    int var123 = (var189 = var15 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                    if (var123 != 0) {
                        var24 >>>= 24;
                        var24 += -706884575;
                        var24 ^= -679520318;
                        break;
                    }

                    var24 -= -1115353958;
                    var24 >>>= 22;
                    var24 ^= -1661309352;
                    int var124 = var9 + 1;
                    int var125 = var9 * var124;
                    int var141 = var9 + 2;
                    int var126 = var125 * var141;
                    int var142 = var9 + 3;
                    int var127 = var126 * var142;
                    int var128 = var127 & 7;
                    if (var128 != 0) {
                        break label113;
                    }

                    float var109;
                    if (var107 == 0) {
                        var24 |= -358345218;
                        var24 <<= 23;
                        var24 -= 1250720896;
                        var24 ^= -1568253428;
                        Integer var108 = var9;
                        if (var108 == null) {
                            break label113;
                        }

                        var109 = 1.0F;
                        switch (var24) {
                            case -1498954733:
                            default:
                                var24 ^= 1904267312;
                                break;
                            case 376822156:
                                var24 |= 987302888;
                                var24 >>>= 11;
                                var24 ^= -279842883;
                                var24 ^= 1956881646;
                                break;
                            case 1814661060:
                                var24 ^= 1619728116;
                        }
                    } else {
                        var24 &= -202659115;
                        var24 <<= 13;
                        var24 ^= -503090021;
                        Integer var129 = var9;
                        if (var129 == null) {
                            break label113;
                        }

                        var109 = -1.0F;
                        var24 *= -1040579445;
                        var24 *= 947460895;
                        var24 ^= -1272516833;
                    }

                    var15 = var10;
                    var17 = var15 + 1L;
                    var17 = var15 * var17;
                    var15 = var17 & 1L;
                    long var190;
                    int var132 = (var190 = var15 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                    if (var132 != 0) {
                        var24 <<= 27;
                        var24 ^= 281521162;
                        var24 += 1169734270;
                        var24 ^= -1809646092;
                        break;
                    }
                    var24 = switch (var24) {
                        case -1678404376 -> {
                            var24 ^= 1361019010;
                            var24 -= 236925281;
                            yield var24 ^ 1283552153;
                        }
                        default -> var24 ^ -1775317251;
                        case 1649673070 -> var24 ^ 1155723539;
                    };
                    float var136;
                    if (var104 < 2) {
                        var24 += 1122404302;
                        var24 -= 1562323799;
                        var24 ^= 89562209;
                        var24 >>>= 27;
                        var24 ^= -1785990807;
                        int var133 = var9 + 1;
                        int var134 = var9 * var133;
                        int var135 = var134 & 1;
                        if (var135 != 0) {
                            break label113;
                        }

                        var136 = 1.0F;
                        switch (var24) {
                            case -2002294814:
                                var24 ^= -619106233;
                                break;
                            case -1785990797:
                                var24 |= -903630260;
                                var24 ^= -1439238371;
                                break;
                            case -1424140502:
                            default:
                                var24 ^= 1096784104;
                        }
                    } else {
                        var24 &= -1943777693;
                        var24 ^= -40833569;
                        var24 &= 820276254;
                        var24 ^= -511729927;
                        int var143 = var9 + 1;
                        int var144 = var9 * var143;
                        int var153 = var9 + 2;
                        int var145 = var144 * var153;
                        int var154 = var9 + 3;
                        int var146 = var145 * var154;
                        int var147 = var146 & 7;
                        if (var147 != 0) {
                            break label113;
                        }

                        var136 = -1.0F;
                        var24 &= 1406453495;
                        var24 -= 640822439;
                        var24 ^= 1581224482;
                    }

                    Integer var148 = var9;
                    if (var148 == null) {
                        break label113;
                    }

                    float var149 = var109 * var2;
                    float var155 = var136 * var2;
                    float var110 = var109 * var3;
                    float var111 = var149 - var110;
                    long var18 = var10;
                    long var20 = var18 + 1L;
                    var20 = var18 * var20;
                    var18 = var20 & 1L;
                    long var191;
                    int var158 = (var191 = var18 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                    if (var158 != 0) {
                        var24 &= 1796413029;
                        var24 |= -686507674;
                        var24 >>>= 13;
                        var24 ^= 44377041;
                        break;
                    }

                    var24 |= 806162160;
                    var24 <<= 26;
                    var24 ^= 1235714260;
                    float var137 = var136 * var3;
                    float var138 = var155 - var137;
                    int var159 = var24 * -952250905;
                    int var160 = var159 * -571817677;
                    int var161 = var160 ^ -1996782158;
                    float var162 = Or(var149, var155, var92, var97, var161);
                    int var19 = var24 >>> 2;
                    var19 -= 2088924927;
                    var19 ^= 1519245127;
                    float var172 = cQ(var149, var155, var92, var97, var19);
                    int var176 = var24 & -936985219;
                    int var177 = var176 + -2051412546;
                    int var178 = var177 + -1328503108;
                    int var179 = var178 - -530049201;
                    int var180 = var179 ^ 105811177;
                    float var181 = Or(var111, var155, var92, var97, var180);
                    int var21 = var24 + 691252903;
                    var21 *= 744581127;
                    var21 |= 360374928;
                    var21 |= 640738209;
                    var21 ^= 110188940;
                    float var112 = cQ(var111, var155, var92, var97, var21);
                    var0.jG(var162, var172, var181, var112, var4, var5, var6);
                    int var113 = var24 - -243157842;
                    int var114 = var113 + 1301358213;
                    int var115 = var114 ^ 229671741;
                    float var116 = Or(var149, var155, var92, var97, var115);
                    int var163 = var24 ^ -1229210282;
                    int var164 = var163 * -1583723851;
                    int var165 = var164 ^ 463056539;
                    float var156 = cQ(var149, var155, var92, var97, var165);
                    int var166 = var24 & -672647725;
                    int var167 = var166 ^ -1005888051;
                    int var168 = var167 ^ -1783812981;
                    float var169 = Or(var149, var138, var92, var97, var168);
                    var19 = var24 ^ -1237879157;
                    var19 ^= -822458322;
                    float var139 = cQ(var149, var138, var92, var97, var19);
                    var0.jG(var116, var156, var169, var139, var4, var5, var6);
                    int var117 = var104 + 1;
                    var104 = var117;
                    switch (var24) {
                        case -2119728940:
                            var24 |= 1296853659;
                            var24 |= 949501919;
                            var24 ^= 1600459361;
                            break;
                        case -2073285717:
                        default:
                            var24 ^= -959735757;
                            break;
                        case -113381440:
                            var24 ^= -1297834210;
                    }
                }
            }

            Integer var87 = var9;
            if (var87 != null) {
                AssertionError var88 = new AssertionError();
                throw var88;
            }
        }

        RuntimeException var86 = new RuntimeException();
        throw var86;
    }

    private static float Or(float var0, float var1, float var2, float var3, int var4) {
        int var6 = (int)var0;
        float var7 = var0 * var2;
        float var8 = var1 * var3;
        long var9 = var6;
        long var11 = var9 + 1L;
        var11 = var9 * var11;
        var9 = var11 & 1L;
        long var30;
        var6 = (var30 = var9 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var6 != 0) {
            int var5 = var4 + -485649314;
            var5 += -318346816;
            var5 &= 1467675811;
            var5 ^= -1547331813;
            var5 ^= 1201474632;
            var6 = var5 + 1;
            var6 = var5 * var6;
            var6 &= 1;
            if (var6 == 0) {
                AssertionError var27 = new AssertionError();
                throw var27;
            }
        } else {
            int var17 = var4 + 934459735;
            var17 -= -1689669554;
            var17 *= 1329186767;
            var17 ^= 528316762;
            Integer var21 = var17;
            if (var21 != null) {
                return var7 - var8;
            }
        }

        IllegalArgumentException var22 = new IllegalArgumentException();
        throw var22;
    }

    private static float cQ(float var0, float var1, float var2, float var3, int var4) {
        int var6 = (int)var0;
        int var7 = var6 + 1;
        var7 = var6 * var7;
        var6 = var7 & 1;
        if (var6 != 0) {
            int var13 = var4 & -1815202818;
            var13 >>>= 12;
            var13 += -2111696931;
            var13 <<= 18;
            var13 ^= -1843244523;
            var6 = var13 + 1;
            var6 = var13 * var6;
            var7 = var13 + 2;
            var6 *= var7;
            var7 = var13 + 3;
            var6 *= var7;
            var6 &= 7;
            if (var6 != 0) {
                IllegalStateException var26 = new IllegalStateException();
                throw var26;
            } else {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            }
        } else {
            switch (var4) {
                case -1075044293:
                default:
                    int var11 = var4 ^ 1513179675;
                    break;
                case -558906277:
                    int var10 = var4 ^ -1852107806;
                    break;
                case -110444943:
                    int var5 = var4 * -1633028499;
                    var5 *= 619142049;
                    var5 ^= 991038816;
            }

            float var12 = var0 * var3;
            float var19 = var1 * var2;
            return var12 + var19;
        }
    }

    private static float u(float var0, int var1) {
        int var3 = (int)var0;
        float var4 = var0 * (float) (Math.PI * 2);
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 == 0) {
            int var14 = var1 + -665077229;
            var14 += -1719005194;
            var14 &= -1286329148;
            var14 ^= 1355730148;
            var3 = var14 << 19;
            var3 += 1045603767;
            var3 &= 298929719;
            var3 ^= 554683319;
            float var28 = wf(var4, var3);
            float var29 = 0.5F * var28;
            return 0.5F - var29;
        } else {
            int var2 = switch (var1) {
                default -> var1 ^ 1132087631;
                case 169966375 -> {
                    int var7 = var1 >>> 28;
                    var7 |= 1743780703;
                    var7 ^= -19142855;
                    yield var7 ^ 357976467;
                }
                case 1019128361 -> var1 ^ 1358842542;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var30 = var2 + 2;
            var3 *= var30;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            } else {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            }
        }
    }

    public static float t(float var0) {
        int var1 = Jy;
        var1 ^= 1353697489;
        int var2 = (int)var0;
        float var3 = var0 / 1.1F;
        double var4 = var3;
        Integer var19 = var2;
        if (var19 == null) {
            var1 *= -1806460221;
            var1 += 743236659;
            var1 &= -126480849;
            var1 ^= 1138478741;
            var19 = var1;
            if (var19 == null) {
                RuntimeException var28 = new RuntimeException();
                throw var28;
            } else {
                RuntimeException var27 = new RuntimeException();
                throw var27;
            }
        } else {
            var1 -= 898230281;
            var1 *= 589024563;
            var1 ^= -80486322;
            var4 = Math.floor(var4);
            float var20 = (float)var4;
            float var21 = var3 - var20;
            int var22 = var1 ^ -857937698;
            var22 ^= -1549358801;
            var22 ^= -1722382114;
            float var25 = R(var21, 0.06F, var22);
            var1 &= -424457047;
            var1 *= 1509534023;
            var1 ^= 2089181691;
            float var13 = R(var21, 0.26F, var1);
            float var14 = 0.7F * var13;
            return Math.max(var25, var14);
        }
    }

    private static float R(float var0, float var1, int var2) {
        int var4 = (int)var0;
        float var5 = var0 - var1;
        var5 /= 0.06F;
        float var6 = -var5;
        var5 = var6 * var5;
        double var22 = var5;
        double var23 = Math.exp(var22);
        long var7 = var4;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        var7 = var9 & 1L;
        long var26;
        var4 = (var26 = var7 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var4 != 0) {
            int var14 = var2 ^ 2120408221;
            var14 ^= -1679065792;
            AssertionError var19 = new AssertionError();
            throw var19;
        } else {
            int var3 = var2 + 480321517;
            var3 ^= -799577714;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var3 = var4 & 1;
            if (var3 == 0) {
                return (float)var23;
            } else {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            }
        }
    }

    private static float wf(float var0, int var1) {
        int var3 = (int)var0;
        Integer var19 = var3;
        if (var19 != null) {
            int var2 = var1 | 773991572;
            var2 ^= 769044279;
            long var20 = var2;
            long var5 = var20 + 1L;
            var5 = var20 * var5;
            long var7 = var20 + 2L;
            var5 *= var7;
            long var21 = var20 + 3L;
            var5 *= var21;
            long var22 = var5 & 7L;
            long var33;
            int var23 = (var33 = var22 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var23 == 0) {
                double var24 = var0;
                double var25 = Math.cos(var24);
                return (float)var25;
            }
        } else {
            int var10 = var1 - -508192666;
            var10 -= 1940208067;
            var10 >>>= 26;
            var10 -= -1233745933;
            var10 ^= -844089670;
            int var26 = var10 + 1;
            var26 = var10 * var26;
            int var4 = var10 + 2;
            var26 *= var4;
            var10 += 3;
            var26 *= var10;
            var10 = var26 & 7;
            if (var10 == 0) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }

        IllegalStateException var17 = new IllegalStateException();
        throw var17;
    }

    private static float YL(float var0, int var1) {
        int var3 = (int)var0;
        double var4 = var0;
        var4 = Math.sin(var4);
        long var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var42;
        var3 = (var42 = var6 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var2 = var1 ^ -1683537941;
            var2 ^= -1970296657;
            var6 = var2;
            var8 = var6 + 1L;
            var8 = var6 * var8;
            var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var43;
            var3 = (var43 = var6 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        } else {
            int var13 = switch (var1) {
                case -1106791604 -> {
                    int var14 = var1 * -1067697409;
                    var14 &= -1673423854;
                    var14 ^= 2094392616;
                    yield var14 ^ -1652548677;
                }
                default -> var1 ^ -1592207418;
                case 1945823164 -> var1 ^ 971651834;
            };
            var3 = var13 + 1;
            var3 = var13 * var3;
            int var33 = var13 + 2;
            var3 *= var33;
            var13 += 3;
            var3 *= var13;
            var13 = var3 & 7;
            if (var13 == 0) {
                return (float)var4;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 985805489;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Jy = var4;
    }
}
