package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;

public final class du {
    public static final int bg = 17;
    public static final int I = 8;
    public static final byte ap = 0;
    public static final byte l = 1;
    public static final byte ul = 2;
    private static final String iS = "g1:";
    private static final int k = 73;
    private final byte[] KY;
    private int OE;
    public static final int S;

    public du() {
        byte[] var1 = new byte[289];
        this.KY = var1;
    }

    public byte q(int var1, int var2) {
        label48: {
            int var54;
            label47: {
                int var3 = S;
                var3 ^= -1758073773;
                var54 = System.identityHashCode(this);
                long var6 = var54;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var88;
                int var60 = (var88 = var6 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                if (var60 == 0) {
                    var3 |= 145063952;
                    var3 += 1824545618;
                    var3 &= 1294060137;
                    var3 -= 274530746;
                    var3 ^= -2093295139;
                    Integer var61 = var1;
                    if (var61 == null) {
                        break label48;
                    }

                    int var62 = var3 * 961097353;
                    int var63 = var62 * 1512046303;
                    int var64 = var63 - -1565606275;
                    int var65 = var64 | -392700432;
                    int var66 = var65 ^ -898793930;
                    boolean var67 = jP(var1, var2, var66);
                    if (!var67) {
                        var3 -= 1664997625;
                        var3 <<= 7;
                        var3 |= -892409648;
                        var3 *= 1569148745;
                        var3 ^= -1820477175;
                        var6 = var1;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var89;
                        int var73 = (var89 = var6 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var73 != 0) {
                            break label48;
                        }

                        var54 = 0;
                        var3 += 19140354;
                        var3 *= 1744441007;
                        var3 >>= 18;
                        var3 += 1592184181;
                        var3 ^= -1401032772;
                        break label47;
                    }

                    var3 *= 1935532075;
                    var3 *= -811371835;
                    var3 += 1571582648;
                    var3 ^= -253977758;
                    byte[] var68 = this.KY;
                    int var7 = var2 * 17;
                    var7 += var1;
                    byte var69 = var68[var7];
                    Integer var53 = var54;
                    if (var53 != null) {
                        var3 &= 1329224610;
                        var3 |= -1216893706;
                        var3 ^= -883170731;
                        var54 = var69;
                        switch (var3) {
                            case 1568711881:
                                var3 ^= -910997481;
                                break label47;
                            case 2083282083:
                                var3 >>= 15;
                                var3 -= 1101763192;
                                var3 >>>= 16;
                                var3 += 131479449;
                                var3 ^= -179450582;
                                break label47;
                            case 2130026616:
                            default:
                                var3 ^= -149027787;
                                break label47;
                        }
                    }

                    var3 ^= -784108158;
                    var3 -= -461929870;
                    var3 ^= -652658724;
                } else {
                    var3 &= -1342796291;
                    var3 ^= -1857618323;
                }

                long var47 = var1;
                long var55 = var47 + 1L;
                long var56 = var47 * var55;
                long var82 = var47 + 2L;
                long var57 = var56 * var82;
                long var48 = var47 + 3L;
                long var58 = var57 * var48;
                long var49 = var58 & 7L;
                long var90;
                var3 = (var90 = var49 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                if (var3 == 0) {
                    UnsupportedOperationException var52 = new UnsupportedOperationException();
                    throw var52;
                }
                break label48;
            }

            int var74 = var1 + 1;
            var74 = var1 * var74;
            int var80 = var1 + 2;
            var74 *= var80;
            var80 = var1 + 3;
            var74 *= var80;
            var74 &= 7;
            if (var74 == 0) {
                return (byte)var54;
            }
        }

        IllegalArgumentException var51 = new IllegalArgumentException();
        throw var51;
    }

    public boolean Q(int var1, int var2, byte var3) {
        label103: {
            label102: {
                int var4 = S;
                var4 ^= 130472708;
                int var6 = System.identityHashCode(this);
                long var7 = var6;
                long var9 = var7 + 1L;
                var9 = var7 * var9;
                long var11 = var7 + 2L;
                var9 *= var11;
                var7 += 3L;
                var9 *= var7;
                var7 = var9 & 7L;
                long var138;
                int var86 = (var138 = var7 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                int var8 = of_2.Ik;
                var4 ^= var8;
                var4 ^= -924068123;
                of_2.Ik = -924068123;
                var8 = of_2.mQ;
                var4 ^= var8;
                var4 ^= 1287135269;
                of_2.mQ = 1287135269;
                if (var86 == 0) {
                    var4 += 2020315633;
                    var4 &= 1316113171;
                    var4 &= -2040911470;
                    var4 ^= 114508825;
                    int var87 = var1 + 1;
                    int var88 = var1 * var87;
                    int var89 = var88 & 1;
                    if (var89 != 0) {
                        break label103;
                    }

                    int var90 = var4 * 1477962691;
                    int var91 = var90 << 15;
                    int var92 = var91 ^ 252568561;
                    int var93 = var92 ^ -688734154;
                    boolean var94 = jP(var1, var2, var93);
                    if (!var94) {
                        var4 += 238470422;
                        var4 &= -620342418;
                        var4 &= -1843903696;
                        var4 &= -282450239;
                        var4 ^= 917680081;
                        break label102;
                    }
                    var4 = switch (var4) {
                        case -1697290891 -> var4 ^ 860115095;
                        case 46353673 -> {
                            var4 |= 2016070021;
                            yield var4 ^ -819231421;
                        }
                        default -> var4 ^ 1473191369;
                    };
                    int var95 = var1 + 1;
                    int var96 = var1 * var95;
                    int var97 = var96 & 1;
                    if (var97 != 0) {
                        break label103;
                    }

                    if (var3 < 0) {
                        var4 -= -1442806815;
                        var4 -= 1322667019;
                        var4 ^= 136893146;
                        var4 >>= 30;
                        var4 ^= -917679569;
                        break label102;
                    }

                    var4 >>>= 7;
                    var4 -= -304620302;
                    var4 |= 677004572;
                    var4 ^= -1970996057;
                    var7 = var1;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var139;
                    int var100 = (var139 = var7 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                    if (var100 != 0) {
                        break label103;
                    }

                    if (var3 > 2) {
                        var4 |= 1115677867;
                        var4 ^= -976399766;
                        break label102;
                    }

                    var4 ^= 1491480114;
                    var4 += 1321297995;
                    var4 >>>= 22;
                    var4 ^= 321030916;
                    int var101 = var2 * 17;
                    int var102 = var101 + var1;
                    var8 = var6 + 1;
                    var8 = var6 * var8;
                    int var126 = var6 + 2;
                    var8 *= var126;
                    int var127 = var6 + 3;
                    var8 *= var127;
                    var8 &= 7;
                    if (var8 != 0) {
                        switch (var4) {
                            case -71048764:
                            default:
                                var4 ^= 1297153314;
                                break;
                            case 321031141:
                                var4 *= -1678087659;
                                var4 >>= 23;
                                var4 >>= 8;
                                var4 ^= 6360119;
                                break;
                            case 844313806:
                                var4 ^= 2012332624;
                        }
                    } else {
                        var4 ^= -267900881;
                        var4 ^= 1582065628;
                        long var109 = var1;
                        long var10 = var109 + 1L;
                        var10 = var109 * var10;
                        long var110 = var10 & 1L;
                        long var140;
                        var8 = (var140 = var110 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label103;
                        }

                        byte[] var112 = this.KY;
                        int var113 = var112[var102];
                        if (var113 == var3) {
                            switch (var4) {
                                case -1117338602:
                                    var4 -= 55445042;
                                    var4 ^= -395166226;
                                    break;
                                case -365328993:
                                    var4 ^= -15365627;
                                    break;
                                case 1894248360:
                                default:
                                    var4 ^= 1278337841;
                            }

                            long var118 = var1;
                            var10 = var118 + 1L;
                            var10 = var118 * var10;
                            long var119 = var10 & 1L;
                            long var141;
                            var113 = (var141 = var119 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                            if (var113 == 0) {
                                return false;
                            }
                            break label103;
                        }

                        var4 ^= 338214265;
                        var4 += 601837655;
                        var4 |= -502211587;
                        var4 *= 1954974343;
                        var4 ^= -1710093432;
                        long var114 = var1;
                        var10 = var114 + 1L;
                        var10 = var114 * var10;
                        long var115 = var10 & 1L;
                        long var142;
                        var113 = (var142 = var115 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
                        if (var113 != 0) {
                            break label103;
                        }

                        byte[] var117 = this.KY;
                        int var128 = var6 + 1;
                        int var129 = var6 * var128;
                        int var135 = var6 + 2;
                        int var130 = var129 * var135;
                        var6 += 3;
                        int var131 = var130 * var6;
                        var6 = var131 & 7;
                        if (var6 == 0) {
                            var4 |= 2113747072;
                            var4 ^= -1695220429;
                            var4 ^= -1871654688;
                            var117[var102] = var3;
                            var6 = this.OE;
                            this.OE = ++var6;
                            return true;
                        }

                        switch (var4) {
                            case -1641775672:
                                var4 ^= 247873294;
                                break;
                            case -1348308239:
                                var4 += 1996323841;
                                var4 &= 2057619871;
                                var4 ^= 585483429;
                                break;
                            case -211366658:
                            default:
                                var4 ^= 351362862;
                        }
                    }
                } else {
                    switch (var4) {
                        case -1768384438:
                            var4 ^= -924756983;
                            break;
                        case 1307096441:
                        default:
                            var4 ^= -656441422;
                            break;
                        case 1682795008:
                            var4 += -1634902818;
                            var4 -= 1594471986;
                            var4 ^= -1548739429;
                    }
                }

                Integer var74 = var1;
                if (var74 != null) {
                    UnsupportedOperationException var76 = new UnsupportedOperationException();
                    throw var76;
                }
                break label103;
            }

            int var81 = var1 + 1;
            var81 = var1 * var81;
            var81 &= 1;
            if (var81 == 0) {
                return false;
            }
        }

        IllegalArgumentException var75 = new IllegalArgumentException();
        throw var75;
    }

    public boolean Pk(int var1, int var2, byte var3, Be var4) {
        int var5 = S;
        var5 ^= 1222579596;
        int var7 = System.identityHashCode(this);
        int var8 = 16 - var1;
        int var9 = 16 - var2;
        Integer var10 = var7;
        if (var10 == null) {
            var5 <<= 22;
            var5 += -423415032;
            var5 &= -580383400;
            var5 |= -1272797687;
            var5 ^= -1668301931;
        } else {
            label88: {
                var5 ^= 1098126751;
                var5 ^= 98190263;
                var5 -= -1316832429;
                var5 += -1347802277;
                var5 ^= 58972418;
                var10 = var1;
                if (var10 != null) {
                    int var72 = (this.Q(var1, var2, var3)) ? 1 : 0;
                    Be var11 = Be.NONE;
                    if (var4 == var11) {
                        switch (var5) {
                            case 573142688:
                                var5 ^= 1503012875;
                                break;
                            case 1480434587:
                            default:
                                var5 ^= 12441561;
                                break;
                            case 1839315882:
                                var5 |= 248993465;
                                var5 *= 108893237;
                                var5 ^= 1010742250;
                        }

                        int var77 = var1 + 1;
                        int var78 = var1 * var77;
                        int var79 = var78 & 1;
                        if (var79 == 0) {
                            return var72 != 0;
                        }
                    } else {
                        var5 -= 1896297030;
                        var5 -= -541831459;
                        var5 &= 2106001264;
                        var5 ^= 365574234;
                        int var80 = (this.Q(var8, var2, var3)) ? 1 : 0;
                        int var81 = ((var72 | var80) != 0) ? 1 : 0;
                        var11 = Be.HORIZONTAL;
                        int var12 = var7 + 1;
                        var12 = var7 * var12;
                        int var13 = var7 + 2;
                        var12 *= var13;
                        var13 = var7 + 3;
                        var12 *= var13;
                        var12 &= 7;
                        if (var12 != 0) {
                            var5 |= 1346232528;
                            var5 ^= 2039539270;
                            break label88;
                        }

                        var5 &= 525513176;
                        var5 ^= 1538802741;
                        var5 ^= -388075554;
                        long var93 = var1;
                        long var14 = var93 + 1L;
                        var14 = var93 * var14;
                        long var16 = var93 + 2L;
                        var14 *= var16;
                        long var94 = var93 + 3L;
                        var14 *= var94;
                        long var95 = var14 & 7L;
                        long var111;
                        var12 = (var111 = var95 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
                        if (var12 == 0) {
                            if (var4 == var11) {
                                var5 ^= -1089907517;
                                var5 |= -1036764070;
                                var5 ^= -161570803;
                                Integer var83 = var1;
                                if (var83 != null) {
                                    return var81 != 0;
                                }
                            } else {
                                var5 &= -1114274860;
                                var5 ^= -187103846;
                                Integer var84 = var1;
                                if (var84 != null) {
                                    int var85 = (this.Q(var1, var9, var3)) ? 1 : 0;
                                    long var97 = var7;
                                    var14 = var97 + 1L;
                                    var14 = var97 * var14;
                                    var16 = var97 + 2L;
                                    var14 *= var16;
                                    long var98 = var97 + 3L;
                                    var14 *= var98;
                                    long var99 = var14 & 7L;
                                    long var112;
                                    var12 = (var112 = var99 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
                                    if (var12 != 0) {
                                        var5 &= -405868744;
                                        var5 += -807372666;
                                        var5 ^= 876700178;
                                        break label88;
                                    }
                                    var5 = switch (var5) {
                                        case -1866057480 -> var5 ^ -1775664893;
                                        default -> var5 ^ 1133470540;
                                        case 1289553418 -> {
                                            var5 >>= 28;
                                            yield var5 ^ 1393152751;
                                        }
                                    };
                                    int var101 = (this.Q(var8, var9, var3)) ? 1 : 0;
                                    int var86 = ((var85 | var101) != 0) ? 1 : 0;
                                    int var87 = ((var81 | var86) != 0) ? 1 : 0;
                                    var11 = Be.QUAD;
                                    if (var4 == var11) {
                                        switch (var5) {
                                            case -1771742887:
                                                var5 ^= 482463165;
                                                break;
                                            case 308882336:
                                            default:
                                                var5 ^= -1604988585;
                                                break;
                                            case 1393152747:
                                                var5 |= 1713980990;
                                                var5 ^= -719690727;
                                        }

                                        return var87 != 0;
                                    }

                                    var5 += -1693109394;
                                    var5 ^= -1008874944;
                                    Integer var6 = var1;
                                    if (var6 != null) {
                                        int var65 = (this.Q(var2, var1, var3)) ? 1 : 0;
                                        int var66 = ((var87 | var65) != 0) ? 1 : 0;
                                        int var75 = (this.Q(var9, var1, var3)) ? 1 : 0;
                                        int var67 = ((var66 | var75) != 0) ? 1 : 0;
                                        int var76 = (this.Q(var2, var8, var3)) ? 1 : 0;
                                        int var68 = ((var67 | var76) != 0) ? 1 : 0;
                                        Integer var69 = var7;
                                        if (var69 != null) {
                                            var5 -= 1646332308;
                                            var5 ^= 721550545;
                                            int var70 = (this.Q(var9, var8, var3)) ? 1 : 0;
                                            return (var68 | var70) != 0;
                                        }

                                        var5 >>= 15;
                                        var5 ^= 552421145;
                                        break label88;
                                    }
                                }
                            }
                        }
                    }
                }

                IllegalArgumentException var64 = new IllegalArgumentException();
                throw var64;
            }
        }

        IllegalStateException var63 = new IllegalStateException();
        throw var63;
    }

    public void E() {
        int var1 = S;
        var1 ^= -271905618;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var4 = var2 + 3;
        var3 *= var4;
        var3 &= 7;
        if (var3 != 0) {
            var1 |= 1014458468;
            var1 ^= 176004978;
        } else {
            label42: {
                var1 *= -613880241;
                var1 ^= -232341127;
                var1 ^= 875364497;
                int var34 = this.G() ? 1 : 0;
                if (var34 != 0) {
                    var1 ^= 1266727307;
                    var1 |= -1980518937;
                    var1 |= -986180679;
                    var1 *= -1718895397;
                    var1 ^= -248294436;
                    return;
                }

                var1 *= -1091916475;
                var1 ^= 242693417;
                var1 ^= -906684860;
                var34 = var1 + 1;
                var34 = var1 * var34;
                var4 = var1 + 2;
                var34 *= var4;
                var4 = var1 + 3;
                var34 *= var4;
                var34 &= 7;
                if (var34 == 0) {
                    byte[] var40 = this.KY;
                    Arrays.fill(var40, (byte)0);
                    var34 = this.OE;
                    var4 = var2 + 1;
                    var4 = var2 * var4;
                    var2 = var4 & 1;
                    if (var2 != 0) {
                        var1 <<= 22;
                        var1 ^= -926260580;
                        break label42;
                    }
                    var1 = switch (var1) {
                        default -> var1 ^ -468338409;
                        case 224987132 -> var1 ^ -129204277;
                        case 381823483 -> {
                            var1 ^= -1201390539;
                            yield var1 ^ 975894848;
                        }
                    };
                    var2 = var1 + 1;
                    var2 = var1 * var2;
                    var2 &= 1;
                    if (var2 == 0) {
                        var2 = var34 + 1;
                        this.OE = var2;
                        return;
                    }
                }

                IllegalStateException var28 = new IllegalStateException();
                throw var28;
            }
        }

        IllegalStateException var23 = new IllegalStateException();
        throw var23;
    }

    public boolean G() {
        label90: {
            int var1 = S;
            var1 ^= -1256980595;
            int var2 = System.identityHashCode(this);
            byte[] var3 = this.KY;
            Integer var4 = var2;
            if (var4 == null) {
                var1 >>= 10;
                var1 *= 1969225927;
                var1 ^= -2115408560;
            } else {
                var1 |= 1768741262;
                var1 <<= 25;
                var1 |= -1089602791;
                var1 >>= 4;
                var1 ^= 867777665;
                byte[] var58 = var3;
                int var59 = var3.length;
                var59 = var59;
                int var5 = 0;
                var5 = var5;
                var1 |= -1084320050;
                var1 += 2118715802;
                var1 &= 1538248658;
                var1 ^= -1231293366;

                label80:
                while (true) {
                    int var6 = var1 + 1;
                    var6 = var1 * var6;
                    int var7 = var1 + 2;
                    var6 *= var7;
                    var7 = var1 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label90;
                    }

                    if (var5 >= var59) {
                        var1 &= -250949606;
                        var1 ^= -1845476938;
                        var1 >>>= 29;
                        var1 |= 244122097;
                        var1 ^= -647857831;
                        Integer var54 = var1;
                        if (var54 != null) {
                            return true;
                        }
                        break label90;
                    }
                    var1 = switch (var1) {
                        case -281872934 -> {
                            var1 ^= 1506728043;
                            var1 ^= 1560095046;
                            var1 *= -1504962973;
                            yield var1 ^ -697558025;
                        }
                        case 1289796779 -> var1 ^ 624999182;
                        default -> var1 ^ -103958429;
                    };
                    Integer var66 = var1;
                    if (var66 == null) {
                        break label90;
                    }

                    byte var67 = var58[var5];
                    Integer var76 = var2;
                    if (var76 == null) {
                        var1 &= -1174665534;
                        var1 |= 880398135;
                        var1 &= 2068006330;
                        var1 ^= 1471951015;
                        break;
                    }

                    var1 >>= 19;
                    var1 |= 1745804046;
                    var1 ^= -1133481272;
                    if (var67 != 0) {
                        var1 &= -110704640;
                        var1 ^= 1429840745;
                        int var72 = var1 + 1;
                        var72 = var1 * var72;
                        var72 &= 1;
                        if (var72 == 0) {
                            return false;
                        }
                        break label90;
                    }

                    var1 *= 382029899;
                    var1 += 1009999809;
                    var1 -= -942606648;
                    var1 &= 1470731558;
                    var1 ^= 1556499514;
                    long var68 = var1;
                    long var8 = var68 + 1L;
                    var8 = var68 * var8;
                    long var69 = var8 & 1L;
                    long var84;
                    int var70 = (var84 = var69 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                    if (var70 != 0) {
                        break label90;
                    }

                    var70 = var5 + 1;
                    var76 = var2;
                    if (var76 == null) {
                        switch (var1) {
                            case -2078203466:
                            default:
                                var1 ^= 134054797;
                                break label80;
                            case 1332202556:
                                var1 >>>= 31;
                                var1 >>= 24;
                                var1 *= -143276707;
                                var1 ^= -1028082815;
                                var1 ^= -1387936236;
                                break label80;
                            case 1803806968:
                                var1 ^= 1300529747;
                                break label80;
                        }
                    }
                    var1 = switch (var1) {
                        case -1547519773 -> var1 ^ 1619394394;
                        default -> var1 ^ -705120969;
                        case 1332202556 -> {
                            var1 |= 694633074;
                            var1 |= 1744588630;
                            yield var1 ^ -707089919;
                        }
                    };
                    var76 = var1;
                    if (var76 == null) {
                        break label90;
                    }

                    var5 = var70;
                    var1 *= 541531671;
                    var1 -= -407840216;
                    var1 <<= 25;
                    var1 -= -1682274108;
                    var1 ^= 158827238;
                }
            }

            int var79 = var1 + 1;
            var79 = var1 * var79;
            var79 &= 1;
            if (var79 == 0) {
                UnsupportedOperationException var82 = new UnsupportedOperationException();
                throw var82;
            }
        }

        RuntimeException var57 = new RuntimeException();
        throw var57;
    }

    public void R(du var1) {
        label41: {
            int var2 = S;
            var2 ^= 1797365456;
            int var3 = System.identityHashCode(this);
            byte[] var4 = this.KY;
            byte[] var5 = var1.KY;
            boolean var43 = Arrays.equals(var4, var5);
            Integer var48 = var3;
            if (var48 != null) {
                var2 += -1062108209;
                var2 -= 671171685;
                var2 *= -1254333589;
                var2 ^= 1202883946;
                var2 ^= 689268973;
                long var49 = var2;
                long var7 = var49 + 1L;
                var7 = var49 * var7;
                long var9 = var49 + 2L;
                var7 *= var9;
                long var50 = var49 + 3L;
                var7 *= var50;
                long var51 = var7 & 7L;
                long var61;
                int var52 = (var61 = var51 - 0L) == 0L ? 0 : (var61 < 0L ? -1 : 1);
                if (var52 != 0) {
                    break label41;
                }

                if (var43) {
                    var2 &= -205618418;
                    var2 >>= 28;
                    var2 >>= 4;
                    var2 ^= 393729734;
                    var2 ^= -705945157;
                    Integer var45 = var2;
                    if (var45 != null) {
                        return;
                    }
                    break label41;
                }
                var2 = switch (var2) {
                    default -> var2 ^ 1944988748;
                    case 835032476 -> var2 ^ -2037409386;
                    case 1023319405 -> {
                        var2 += 777182750;
                        var2 ^= 1513445341;
                        yield var2 ^ -259845336;
                    }
                };
                var4 = var1.KY;
                var5 = this.KY;
                byte[] var6 = this.KY;
                int var57 = var3 + 1;
                int var58 = var3 * var57;
                int var8 = var3 + 2;
                int var59 = var58 * var8;
                var3 += 3;
                int var60 = var59 * var3;
                var3 = var60 & 7;
                if (var3 == 0) {
                    var2 -= -1105423993;
                    var2 -= 775072903;
                    var2 += -767715359;
                    var2 ^= 791217239;
                    var3 = var6.length;
                    System.arraycopy(var4, 0, var5, 0, var3);
                    var3 = this.OE;
                    this.OE = ++var3;
                    return;
                }

                var2 |= -1742242726;
                var2 -= -1266690971;
                var2 ^= -1043810752;
            } else {
                var2 |= -2129623685;
                var2 ^= 1830138534;
            }

            long var33 = var2;
            long var46 = var33 + 1L;
            long var47 = var33 * var46;
            long var34 = var47 & 1L;
            long var62;
            var2 = (var62 = var34 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var37 = new IllegalStateException();
                throw var37;
            }
        }

        RuntimeException var36 = new RuntimeException();
        throw var36;
    }

    public int b() {
        int var1 = S;
        var1 ^= 1910842148;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var27;
        var2 = (var27 = var21 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        int var3 = of_2.Ik;
        var1 ^= var3;
        var1 ^= -924068123;
        var3 = of_2.mQ;
        var1 ^= var3;
        var1 ^= 1287135269;
        if (var2 == 0) {
            var1 &= 2021684781;
            var1 ^= 1415839789;
            return this.OE;
        } else {
            var1 -= 1719566600;
            var1 &= 1495807367;
            var1 ^= -437678383;
            IllegalStateException var16 = new IllegalStateException();
            throw var16;
        }
    }

    public String lU() {
        label68: {
            int var1 = S;
            var1 ^= 1457620172;
            int var2 = System.identityHashCode(this);
            byte[] var3 = new byte[73];
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var113;
            int var54 = (var113 = var4 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
            if (var54 != 0) {
                var1 |= 2018635756;
                var1 ^= 1886206446;
            } else {
                var1 *= -1408272687;
                var1 += -437763696;
                var1 -= 1788672321;
                var1 -= -739636486;
                var1 ^= 575391884;
                int var55 = var1 + 1;
                int var56 = var1 * var55;
                int var57 = var56 & 1;
                if (var57 != 0) {
                    break label68;
                }

                var3 = var3;
                byte var58 = 0;
                int var59 = var58;
                var1 &= -1263776387;
                var1 &= -2102599583;
                var1 ^= -639713220;

                while (true) {
                    byte[] var5 = this.KY;
                    int var75 = var2 + 1;
                    int var76 = var2 * var75;
                    int var77 = var76 & 1;
                    if (var77 != 0) {
                        var1 -= 1983896556;
                        var1 |= 141483878;
                        var1 *= -192875453;
                        var1 ^= -668168665;
                        break;
                    }

                    var1 -= 700210348;
                    var1 ^= -1962139855;
                    int var78 = var1 + 1;
                    int var79 = var1 * var78;
                    int var80 = var79 & 1;
                    if (var80 != 0) {
                        break label68;
                    }

                    int var65 = var5.length;
                    if (var59 >= var65) {
                        var1 *= -866704751;
                        var1 ^= 549343234;
                        var4 = var1;
                        var6 = var4 + 1L;
                        var6 = var4 * var6;
                        long var108 = var4 + 2L;
                        var6 *= var108;
                        var4 += 3L;
                        var6 *= var4;
                        var4 = var6 & 7L;
                        long var114;
                        int var63 = (var114 = var4 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                        if (var63 != 0) {
                            break label68;
                        }

                        Encoder var64 = Base64.getUrlEncoder();
                        long var68 = var2;
                        long var91 = var68 + 1L;
                        var91 = var68 * var91;
                        long var110 = var68 + 2L;
                        var91 *= var110;
                        long var69 = var68 + 3L;
                        var91 *= var69;
                        long var70 = var91 & 7L;
                        long var115;
                        var2 = (var115 = var70 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                        if (var2 == 0) {
                            var1 += -1484336044;
                            var1 += -740541590;
                            var1 ^= 1443512737;
                            var1 ^= 1642351057;
                            Encoder var43 = var64.withoutPadding();
                            String var44 = var43.encodeToString(var3);
                            return "g1:" + var44;
                        }

                        var1 <<= 24;
                        var1 >>>= 2;
                        var1 ^= 630638082;
                        break;
                    }

                    var1 += 1373138786;
                    var1 -= 1088212272;
                    var1 ^= -600120832;
                    int var66 = var59 >> 2;
                    byte var81 = var3[var66];
                    byte[] var7 = this.KY;
                    byte var88 = var7[var59];
                    int var8 = var59 & 3;
                    var8 *= 2;
                    int var89 = var88 << var8;
                    long var100 = var2;
                    long var10 = var100 + 1L;
                    var10 = var100 * var10;
                    long var101 = var10 & 1L;
                    long var116;
                    var8 = (var116 = var101 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                    if (var8 != 0) {
                        var1 *= -1533604661;
                        var1 |= -770725944;
                        var1 -= 1378434906;
                        var1 ^= -11760143;
                        var1 ^= 1540158343;
                        break;
                    }

                    var1 &= 1781975033;
                    var1 ^= 1708543997;
                    var8 = var1 + 1;
                    var8 = var1 * var8;
                    int var9 = var1 + 2;
                    var8 *= var9;
                    var9 = var1 + 3;
                    var8 *= var9;
                    var8 &= 7;
                    if (var8 != 0) {
                        break label68;
                    }

                    byte var90 = (byte)var89;
                    int var82 = var81 | var90;
                    byte var83 = (byte)var82;
                    var3[var66] = var83;
                    int var67 = var59 + 1;
                    var59 = var67;
                    switch (var1) {
                        case 231115565:
                            var1 *= 167394899;
                            var1 ^= 1431881130;
                            break;
                        case 835071230:
                        default:
                            var1 ^= 268928028;
                            break;
                        case 1839842997:
                            var1 ^= -227392008;
                    }
                }
            }

            long var71 = var1;
            long var95 = var71 + 1L;
            var95 = var71 * var95;
            long var111 = var71 + 2L;
            var95 *= var111;
            var71 += 3L;
            var95 *= var71;
            var71 = var95 & 7L;
            long var117;
            var2 = (var117 = var71 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var50 = new IllegalStateException();
                throw var50;
            }
        }

        IllegalArgumentException var51 = new IllegalArgumentException();
        throw var51;
    }

    public boolean F(String var1) {
        java.util.Base64.Decoder var200 = null;
        byte[] var201 = null;
        byte[] var202 = null;
        int var216 = 0;
        String var218 = null;
        int var3 = S;
        var3 ^= -1278008502;
        Object var4 = null;
        var3 *= 413322435;
        var3 ^= -1720864699;
        var3 -= 1901705433;
        var3 &= -277316398;
        var3 ^= 971954330;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var5 &= 1;
        label222:
        if (var5 == 0) {
            if (var1 != null) {
                var3 ^= -1397706537;
                var3 |= 2046778959;
                var3 |= 165688075;
                var3 ^= 1953464244;
                int var199 = (var1.startsWith("g1:")) ? 1 : 0;

                var3 = switch (var3) {
                    case -1953496853 -> {
                        var3 += -977523288;
                        var3 &= -1191819107;
                        var3 <<= 10;
                        yield var3 ^ 1963021730;
                    }
                    case 531582777 -> var3 ^ 573549061;
                    default -> var3 ^ -1105856243;
                };
                long var6 = var3;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                long var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var282;
                int var210 = (var282 = var6 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                if (var210 != 0) {
                    break label222;
                }

                if (var199 != 0) {
                    var3 *= -1795470713;
                    var3 >>>= 12;
                    var3 |= -436341735;
                    var3 <<= 27;
                    var3 ^= 222386445;

                    label211: {
                        Throwable var2;
                        label210: {
                            label226: {
                                try {
                                    var200 = Base64.getUrlDecoder();
                                    var3 &= 10964003;
                                    var3 >>= 19;
                                    var3 ^= -370191327;
                                } catch (Throwable var16) {
                                    var2 = var16;
                                    var3 = S;
                                    var3 ^= 265797036;
                                    boolean var211 = var16 instanceof IllegalArgumentException;
                                    var3 *= -2066009207;
                                    var3 |= 1049459894;
                                    var3 -= 406119490;
                                    var3 ^= 1762334539;
                                    if (!var211) {
                                        break label210;
                                    }
                                    break label226;
                                }

                                var6 = var3;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var6 = var8 & 1L;
                                long var283;
                                int var214 = (var283 = var6 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                                if (var214 != 0) {
                                    break label222;
                                }

                                try {
                                    var216 = "g1:".length();
                                    var3 |= -799101939;
                                    var3 -= 1253097482;
                                    var3 |= -1013534327;
                                    var3 ^= -1825483920;
                                    var3 ^= -1266419865;
                                } catch (Throwable var15) {
                                    var2 = var15;
                                    var3 = S;
                                    var3 ^= 265797036;
                                    boolean var215 = var15 instanceof IllegalArgumentException;
                                    var3 *= -2066009207;
                                    var3 |= 1049459894;
                                    var3 -= 406119490;
                                    var3 ^= 1762334539;
                                    if (!var215) {
                                        break label210;
                                    }
                                    break label226;
                                }

                                long var7 = var3;
                                long var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var7 = var9 & 1L;
                                long var284;
                                int var251 = (var284 = var7 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                                if (var251 != 0) {
                                    break label222;
                                }

                                try {
                                    var218 = var1.substring(var216);
                                    var3 += 1258507016;
                                    var3 *= 708129187;
                                    var3 -= 1050704340;
                                    var3 += -824946161;
                                    var3 ^= 673102165;
                                } catch (Throwable var14) {
                                    var2 = var14;
                                    var3 = S;
                                    var3 ^= 265797036;
                                    boolean var217 = var14 instanceof IllegalArgumentException;
                                    var3 *= -2066009207;
                                    var3 |= 1049459894;
                                    var3 -= 406119490;
                                    var3 ^= 1762334539;
                                    if (!var217) {
                                        break label210;
                                    }
                                    break label226;
                                }

                                Integer var252 = var3;
                                if (var252 == null) {
                                    break label222;
                                }

                                try {
                                    var201 = var200.decode(var218);
                                    var3 &= -492302779;
                                    var3 ^= 2133062314;
                                } catch (Throwable var13) {
                                    var2 = var13;
                                    var3 = S;
                                    var3 ^= 265797036;
                                    boolean var219 = var13 instanceof IllegalArgumentException;
                                    var3 *= -2066009207;
                                    var3 |= 1049459894;
                                    var3 -= 406119490;
                                    var3 ^= 1762334539;
                                    if (!var219) {
                                        break label210;
                                    }
                                    break label226;
                                }

                                var6 = var3;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var285;
                                int var223 = (var285 = var6 - 0L) == 0L ? 0 : (var285 < 0L ? -1 : 1);
                                if (var223 != 0) {
                                    break label222;
                                }

                                try {
                                    var202 = var201;
                                    break label211;
                                } catch (Throwable var12) {
                                    var2 = var12;
                                    var3 = S;
                                    var3 ^= 265797036;
                                    boolean var224 = var12 instanceof IllegalArgumentException;
                                    var3 *= -2066009207;
                                    var3 |= 1049459894;
                                    var3 -= 406119490;
                                    var3 ^= 1762334539;
                                    if (!var224) {
                                        break label210;
                                    }
                                }
                            }

                            var3 &= -1532418719;
                            var3 <<= 18;
                            var3 *= 1741373195;
                            var3 *= -1962587251;
                            var3 ^= 627398383;
                            var4 = (IllegalArgumentException)var2;
                            var3 += 445792670;
                            var3 &= -1879942730;
                            var3 ^= -694450794;
                            int var17 = var3 + 1;
                            int var18 = var3 * var17;
                            int var225 = var3 + 2;
                            int var19 = var18 * var225;
                            int var226 = var3 + 3;
                            int var20 = var19 * var226;
                            int var21 = var20 & 7;
                            if (var21 == 0) {
                                return false;
                            }
                            break label222;
                        }

                        var3 *= -1443388365;
                        var3 &= -1141786904;
                        var3 -= -1420959897;
                        var3 ^= -1267680791;
                        var6 = var3;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var286;
                        int var229 = (var286 = var6 - 0L) == 0L ? 0 : (var286 < 0L ? -1 : 1);
                        if (var229 == 0) {
                            throw UncheckedExceptions.rethrow(var2);
                        }
                        break label222;
                    }
                    var3 = switch (var3) {
                        default -> var3 ^ 385493296;
                        case 853299471 -> var3 ^ 434961937;
                        case 1066139370 -> {
                            var3 ^= 1760345652;
                            yield var3 ^ -967498544;
                        }
                    };
                    Integer var22 = var3;
                    if (var22 != null) {
                        var3 *= 789543515;
                        var3 ^= -107340938;
                        int var23 = var202.length;
                        var3 -= 695276807;
                        var3 &= -1867494001;
                        var3 ^= 1254385308;
                        if (var23 != 73) {
                            var3 &= 217723856;
                            var3 ^= -1868744098;
                            var6 = var3;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var10 = var6 + 2L;
                            var8 *= var10;
                            var6 += 3L;
                            var8 *= var6;
                            var6 = var8 & 7L;
                            long var287;
                            var23 = (var287 = var6 - 0L) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                            if (var23 == 0) {
                                return false;
                            }
                        } else {
                            var3 = switch (var3) {
                                default -> var3 ^ -1880199372;
                                case -889952743 -> {
                                    var3 &= -971954105;
                                    yield var3 ^ -815656199;
                                }
                                case 986897147 -> var3 ^ 444522064;
                            };
                            var23 = var3 + 1;
                            var23 = var3 * var23;
                            var23 &= 1;
                            if (var23 == 0) {
                                byte[] var28 = this.KY;
                                var23 = var28.length;
                                byte[] var30 = new byte[var23];
                                byte[] var31 = var30;
                                byte var188 = 0;

                                var3 = switch (var3) {
                                    default -> var3 ^ 727913075;
                                    case 225587960 -> {
                                        var3 ^= -1476879325;
                                        var3 ^= -149206956;
                                        var3 &= -770354613;
                                        var3 *= 1611701465;
                                        yield var3 ^ 299650939;
                                    }
                                    case 613185500 -> var3 ^ -2094633239;
                                };
                                int var189 = var188;

                                var3 = switch (var3) {
                                    default -> var3 ^ -1766410161;
                                    case -1303125976 -> {
                                        var3 -= -1504937396;
                                        var3 += 1102186298;
                                        var3 ^= 1188056663;
                                        var3 ^= 2130489994;
                                        yield var3 ^ 1276577601;
                                    }
                                    case -940466068 -> var3 ^ -803531627;
                                };

                                while (true) {
                                    Integer var233 = var3;
                                    if (var233 == null) {
                                        break label222;
                                    }

                                    int var234 = var31.length;
                                    var3 ^= -1498606167;
                                    var3 -= 72010259;
                                    var3 ^= 1692209424;
                                    var3 ^= 1049433626;
                                    if (var189 >= var234) {
                                        var3 *= -1240016727;
                                        var3 |= 1816397879;
                                        var3 ^= -1650061663;
                                        var4 = this.KY;
                                        var3 |= 1555027603;
                                        var3 -= 1681708307;
                                        var3 += 598830714;
                                        var3 *= -94994087;
                                        var3 ^= 2098527723;
                                        var199 = var3 + 1;
                                        var199 = var3 * var199;
                                        var199 &= 1;
                                        if (var199 == 0) {
                                            boolean var191 = Arrays.equals((byte[])var4, var31);
                                            if (!var191) {
                                                var3 &= -480654228;
                                                var3 += 1426676021;
                                                var3 ^= 2001512373;
                                                var4 = this.KY;
                                                byte[] var206 = this.KY;
                                                var199 = var206.length;
                                                System.arraycopy(var31, 0, var4, 0, var199);
                                                var23 = this.OE;
                                                var23++;
                                                var3 *= -106713803;
                                                var3 |= 1269935608;
                                                var3 ^= 936666432;
                                                this.OE = var23;
                                                switch (var3) {
                                                    case 484717676:
                                                        var3 ^= -1205567264;
                                                        break;
                                                    case 2063242831:
                                                    default:
                                                        var3 ^= 930824580;
                                                        break;
                                                    case 2087180988:
                                                        var3 |= 1486186167;
                                                        var3 *= 2026381295;
                                                        var3 ^= 1600762547;
                                                }
                                            } else {
                                                var3 |= 772351832;
                                                var3 *= 849841265;
                                                var3 >>= 25;
                                                var3 |= 1722564071;
                                                var3 ^= 2035448341;
                                            }

                                            Integer var34 = var3;
                                            if (var34 != null) {
                                                return true;
                                            }
                                        }
                                        break label222;
                                    }
                                    var3 = switch (var3) {
                                        case -1061896678 -> {
                                            var3 |= -250678697;
                                            var3 <<= 24;
                                            var3 -= 259223534;
                                            yield var3 ^ -1081062918;
                                        }
                                        case -490675360 -> var3 ^ 996103296;
                                        default -> var3 ^ 1737145699;
                                    };
                                    int var235 = var3 + 1;
                                    int var236 = var3 * var235;
                                    int var253 = var3 + 2;
                                    int var237 = var236 * var253;
                                    var253 = var3 + 3;
                                    int var238 = var237 * var253;
                                    int var239 = var238 & 7;
                                    if (var239 != 0) {
                                        break label222;
                                    }

                                    int var240 = var189 >> 2;
                                    byte var241 = var202[var240];
                                    var253 = var189 & 3;
                                    var253 *= 2;
                                    int var242 = var241 >> var253;
                                    int var243 = var242 & 3;
                                    var3 += 1025321652;
                                    var3 -= -1543859238;
                                    var3 |= -112700884;
                                    var3 -= 1949802870;
                                    var3 ^= 797579847;
                                    long var257 = var3;
                                    long var278 = var257 + 1L;
                                    var278 = var257 * var278;
                                    long var258 = var278 & 1L;
                                    long var288;
                                    var253 = (var288 = var258 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                                    if (var253 != 0) {
                                        break label222;
                                    }

                                    if (var243 > 2) {
                                        Integer var261 = switch (var3) {
                                            case -1429353665 -> {
                                                var3 &= -876716551;
                                                yield var3 ^ 2118579422;
                                            }
                                            default -> var3 ^ -324386858;
                                            case 843491626 -> var3 ^ 1457628234;
                                        };
                                        if (var261 != null) {
                                            return false;
                                        }
                                        break label222;
                                    }

                                    var3 ^= 1489263549;
                                    var3 ^= -113546958;
                                    var3 |= 507247910;
                                    var3 += 249067602;
                                    var3 ^= -2069861482;
                                    Integer var260 = var3;
                                    if (var260 == null) {
                                        break label222;
                                    }

                                    byte var244 = (byte)var243;
                                    var31[var189] = var244;
                                    var3 |= 275699365;
                                    var3 += 963235450;
                                    var3 ^= -257533981;
                                    int var245 = var3 + 1;
                                    int var246 = var3 * var245;
                                    int var247 = var246 & 1;
                                    if (var247 != 0) {
                                        break label222;
                                    }

                                    int var248 = var189 + 1;
                                    var189 = var248;
                                    var3 += -1708182582;
                                    var3 &= 1934930689;
                                    var3 ^= 735491978;
                                }
                            }
                        }
                    }
                    break label222;
                }

                var3 ^= -615742244;
                var3 &= -183539268;
                var3 <<= 14;
                var3 ^= -376089519;
                var3 ^= 1550483987;
            } else {
                var3 ^= 1696886632;
                var3 *= -378710703;
                var3 *= -2043512703;
                var3 ^= -1272852510;
            }

            long var35 = var3;
            long var193 = var35 + 1L;
            long var194 = var35 * var193;
            long var249 = var35 + 2L;
            long var195 = var194 * var249;
            var35 += 3L;
            long var196 = var195 * var35;
            var35 = var196 & 7L;
            long var289;
            int var38 = (var289 = var35 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
            if (var38 == 0) {
                return false;
            }
        }

        IllegalArgumentException var39 = new IllegalArgumentException();
        throw var39;
    }

    public static du z(String... var0) {
        label169: {
            int var1 = S;
            var1 ^= -889853478;
            int var2 = System.identityHashCode(var0);
            du var3 = new du();
            var3 = var3;
            int var4 = var0.length;
            long var5 = var2;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var187;
            int var113 = (var187 = var5 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
            if (var113 == 0) {
                var1 -= 1631665714;
                var1 ^= 815690644;
                var1 *= 948627029;
                var1 ^= 385756492;
                var5 = var1;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var188;
                int var116 = (var188 = var5 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                if (var116 != 0) {
                    break label169;
                }

                var4 /= 2;
                var4 = 8 - var4;
                var4 = var4;
                byte var117 = 0;
                int var118 = var117;
                var1 *= -1948098253;
                var1 += 1195631235;
                var1 ^= 2063297679;

                label165:
                while (true) {
                    int var6 = var0.length;
                    var7 = var2;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var189;
                    int var132 = (var189 = var7 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                    if (var132 != 0) {
                        var1 ^= 1838457848;
                        var1 >>= 9;
                        var1 |= 421959844;
                        var1 += 1215372064;
                        var1 ^= -1739021482;
                        break;
                    }
                    var1 = switch (var1) {
                        default -> var1 ^ 921026330;
                        case -1264149968 -> {
                            var1 >>= 30;
                            yield var1 ^ -697689009;
                        }
                        case 1944878776 -> var1 ^ -1686899786;
                    };
                    if (var118 >= var6) {
                        var1 += 1642877956;
                        var1 |= 1615656928;
                        var1 ^= 239403368;
                        return var3;
                    }
                    var1 = switch (var1) {
                        default -> var1 ^ -759302342;
                        case 697689009 -> {
                            var1 >>>= 29;
                            var1 &= 455289759;
                            var1 |= -587013876;
                            yield var1 ^ -1527168093;
                        }
                        case 1349050608 -> var1 ^ -518816330;
                    };
                    var6 = var1 + 1;
                    var6 = var1 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label169;
                    }

                    String var122 = var0[var118];
                    String var123 = var122;
                    int var133 = var122.length();
                    int var134 = var133 / 2;
                    int var135 = 8 - var134;
                    int var136 = var135;
                    long var8 = var2;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    long var12 = var8 + 2L;
                    var10 *= var12;
                    var8 += 3L;
                    var10 *= var8;
                    var8 = var10 & 7L;
                    long var190;
                    int var145 = (var190 = var8 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                    if (var145 != 0) {
                        switch (var1) {
                            case 686756179:
                            default:
                                var1 ^= 1189653269;
                                break label165;
                            case 1309445217:
                                var1 ^= -1514618246;
                                break label165;
                            case 2046534318:
                                var1 -= 1031900925;
                                var1 &= 774605330;
                                var1 ^= -691211748;
                                var1 ^= 719447942;
                                break label165;
                        }
                    }

                    var1 *= 1502476929;
                    var1 ^= 904421873;
                    Integer var146 = var1;
                    if (var146 == null) {
                        break label169;
                    }

                    byte var147 = 0;
                    int var148 = var147;
                    var1 <<= 26;
                    var1 ^= -1204972481;
                    var1 ^= 892669325;

                    while (true) {
                        int var154 = var123.length();
                        Integer var167 = var2;
                        if (var167 == null) {
                            var1 ^= -171997045;
                            var1 += 724291436;
                            var1 += -847643334;
                            var1 *= 1224133255;
                            var1 ^= -152837869;
                            break label165;
                        }

                        var1 *= 322166379;
                        var1 &= -608622505;
                        var1 ^= -1844216056;
                        var1 <<= 11;
                        var1 ^= -1662472179;
                        Integer var168 = var1;
                        if (var168 == null) {
                            break label169;
                        }

                        if (var148 >= var154) {
                            var1 -= 1286656317;
                            var1 ^= 1256049465;
                            Integer var124 = var1;
                            if (var124 == null) {
                                break label169;
                            }

                            int var125 = var118 + 1;
                            int var137 = var2 + 1;
                            int var138 = var2 * var137;
                            int var149 = var2 + 2;
                            int var139 = var138 * var149;
                            int var150 = var2 + 3;
                            int var140 = var139 * var150;
                            int var141 = var140 & 7;
                            if (var141 != 0) {
                                var1 *= 717050031;
                                var1 += -366883187;
                                var1 ^= -2116378786;
                                break label165;
                            }

                            var1 &= -1827888953;
                            var1 ^= -1732050819;
                            Integer var142 = var1;
                            if (var142 == null) {
                                break label169;
                            }

                            var118 = var125;
                            switch (var1) {
                                case -1969245516:
                                    var1 ^= 474795400;
                                    continue label165;
                                case 147792060:
                                    var1 >>= 8;
                                    var1 ^= -1263643376;
                                    continue label165;
                                case 347388452:
                                default:
                                    var1 ^= -349899971;
                                    continue label165;
                            }
                        }

                        var1 |= -1225770330;
                        var1 |= 830953720;
                        var1 ^= 2076642811;
                        var9 = var1;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var191;
                        int var158 = (var191 = var9 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                        if (var158 != 0) {
                            break label169;
                        }

                        char var159 = var123.charAt(var148);
                        int var169 = var136 + var148;
                        int var176 = var4 + var118;
                        Integer var177 = var2;
                        if (var177 == null) {
                            switch (var1) {
                                case -1276631148:
                                    var1 ^= 315524379;
                                    break label165;
                                case -869206268:
                                    var1 &= -1946813251;
                                    var1 |= 1566475033;
                                    var1 *= -181636423;
                                    var1 &= -1200008663;
                                    var1 ^= 1078347691;
                                    break label165;
                                case -222832200:
                                default:
                                    var1 ^= 1952496807;
                                    break label165;
                            }
                        }

                        var1 *= -1243554319;
                        var1 |= -847399649;
                        var1 ^= 328421005;
                        int var178 = var1 + 1;
                        int var179 = var1 * var178;
                        int var180 = var179 & 1;
                        if (var180 != 0) {
                            break label169;
                        }

                        byte var184;
                        if (var159 == '#') {
                            var1 -= 63133834;
                            var1 ^= 49155870;
                            var12 = var1;
                            long var14 = var12 + 1L;
                            var14 = var12 * var14;
                            var12 = var14 & 1L;
                            long var192;
                            int var183 = (var192 = var12 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                            if (var183 != 0) {
                                break label169;
                            }

                            var184 = 1;
                            var1 += 1076977355;
                            var1 ^= 1168715591;
                            var1 >>= 17;
                            var1 >>= 18;
                            var1 ^= -1398073510;
                        } else {
                            var1 &= -1246809273;
                            var1 ^= 631904013;
                            var1 ^= 716687854;
                            Integer var185 = var1;
                            if (var185 == null) {
                                break label169;
                            }

                            if (var159 == '+') {
                                var1 *= -1032499325;
                                var1 <<= 2;
                                var1 += 159824999;
                                var1 ^= 177556378;
                                var1 ^= 1605768435;
                                Integer var160 = var1;
                                if (var160 == null) {
                                    break label169;
                                }

                                var184 = 2;
                                var1 *= -1932759635;
                                var1 ^= -338834616;
                            } else {
                                var1 ^= 366293666;
                                var1 += -1859194546;
                                var1 -= -346143785;
                                var1 *= -1484989809;
                                var1 ^= 229326523;
                                Integer var161 = var1;
                                if (var161 == null) {
                                    break label169;
                                }

                                var184 = 0;
                                var1 >>>= 1;
                                var1 ^= -347564268;
                            }
                        }

                        boolean var162 = var3.Q(var169, var176, var184);
                        int var163 = var148 + 1;
                        Integer var170 = var2;
                        if (var170 == null) {
                            switch (var1) {
                                case -2121091496:
                                    var1 ^= -249770198;
                                    break label165;
                                case -1398073510:
                                    var1 &= 1429745320;
                                    var1 *= -1496379667;
                                    var1 ^= -908258590;
                                    break label165;
                                case 1574924284:
                                default:
                                    var1 ^= -2090672032;
                                    break label165;
                            }
                        }

                        var1 >>= 7;
                        var1 ^= 1404346804;
                        Integer var171 = var1;
                        if (var171 == null) {
                            break label169;
                        }

                        var148 = var163;
                        var1 >>>= 4;
                        var1 <<= 19;
                        var1 ^= 591088341;
                        var1 ^= 703320935;
                    }
                }
            } else {
                var1 -= 997008861;
                var1 ^= -793281219;
                var1 |= 2092073235;
                var1 <<= 26;
                var1 ^= 738662282;
            }

            Integer var105 = var1;
            if (var105 != null) {
                IllegalArgumentException var107 = new IllegalArgumentException();
                throw var107;
            }
        }

        IllegalArgumentException var106 = new IllegalArgumentException();
        throw var106;
    }

    private static boolean jP(int var0, int var1, int var2) {
        Integer var5 = var0;
        if (var5 != null) {
            int var16 = switch (var2) {
                case -1979497125 -> var2 ^ -1902574662;
                case 563258311 -> {
                    int var17 = var2 & 1042129783;
                    var17 ^= -275990947;
                    var17 *= -1442798383;
                    yield var17 ^ 1969981790;
                }
                default -> var2 ^ -1190151226;
            };
            int var59 = var0 + 1;
            var59 = var0 * var59;
            int var6 = var0 + 2;
            var59 *= var6;
            var6 = var0 + 3;
            var59 *= var6;
            var59 &= 7;
            label66:
            if (var59 == 0) {
                if (var0 >= 0) {
                    var16 = switch (var16) {
                        case -895849628 -> {
                            var16 |= 22597619;
                            var16 &= -2098688608;
                            yield var16 ^ -1691807526;
                        }
                        default -> var16 ^ -484474559;
                        case 2029259336 -> var16 ^ -617987653;
                    };
                    var59 = var0 + 1;
                    var59 = var0 * var59;
                    var59 &= 1;
                    if (var59 != 0) {
                        break label66;
                    }

                    if (var1 >= 0) {
                        var16 *= 1835889995;
                        var16 *= -689455705;
                        var16 += 1216781940;
                        var16 *= -1452211677;
                        var16 ^= -1241239193;
                        var59 = var0 + 1;
                        var59 = var0 * var59;
                        var59 &= 1;
                        if (var59 != 0) {
                            break label66;
                        }

                        if (var0 < 17) {
                            var16 &= 2075245016;
                            var16 -= 615188702;
                            var16 &= 1137227954;
                            var16 ^= 1615436443;
                            var16 ^= 1595862242;
                            var59 = var0 + 1;
                            var59 = var0 * var59;
                            var6 = var0 + 2;
                            var59 *= var6;
                            var6 = var0 + 3;
                            var59 *= var6;
                            var59 &= 7;
                            if (var59 != 0) {
                                break label66;
                            }

                            if (var1 < 17) {
                                var16 = switch (var16) {
                                    default -> var16 ^ -1420236072;
                                    case -1878631569 -> var16 ^ 1527180824;
                                    case 1033371339 -> {
                                        var16 ^= 1222404399;
                                        var16 += -121023876;
                                        yield var16 ^ -1784360070;
                                    }
                                };
                                long var75 = var0;
                                long var82 = var75 + 1L;
                                var82 = var75 * var82;
                                long var76 = var82 & 1L;
                                long var84;
                                var59 = (var84 = var76 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
                                if (var59 != 0) {
                                    break label66;
                                }

                                boolean var78 = true;
                                var16 ^= 1340240124;
                                var16 ^= 1477828442;
                                return var78;
                            }

                            var16 |= -878700223;
                            var16 &= -903867283;
                            var16 >>= 10;
                            var16 ^= -1155910497;
                        } else {
                            var16 ^= 904968865;
                            var16 ^= 786227364;
                            var16 ^= -1778735647;
                            var16 ^= -1779310613;
                        }
                    } else {
                        switch (var16) {
                            case -1083987291:
                            default:
                                var16 ^= 807473364;
                                break;
                            case -987074843:
                                var16 ^= 1850388467;
                                break;
                            case 434216314:
                                var16 |= -808707882;
                                var16 |= 2051215508;
                                var16 ^= -1157160604;
                        }
                    }
                } else {
                    var16 |= 640836005;
                    var16 ^= 1656443459;
                    var16 <<= 21;
                    var16 *= -1049903431;
                    var16 ^= -634864486;
                }

                boolean var86 = false;
                var16 >>>= 4;
                var16 += -257097161;
                var16 ^= 414980284;
                return var86;
            }
        } else {
            int var3 = var2 ^ -1019812242;
            var3 -= -669653087;
            var3 ^= -1648649225;
            long var11 = var0;
            long var55 = var11 + 1L;
            long var56 = var11 * var55;
            long var7 = var11 + 2L;
            long var57 = var56 * var7;
            long var12 = var11 + 3L;
            long var58 = var57 * var12;
            long var13 = var58 & 7L;
            long var85;
            var3 = (var85 = var13 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            }
        }

        UnsupportedOperationException var47 = new UnsupportedOperationException();
        throw var47;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1111828918;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        S = var4;
    }
}
