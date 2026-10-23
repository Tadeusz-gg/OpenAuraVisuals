package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EventBus {
    private static final Logger HQ;
    private static final CL[] bE;
    private final Map Kf;
    private final Map Jt;
    public static final int kQ;

    public EventBus() {
        ConcurrentHashMap var1 = new ConcurrentHashMap();
        this.Kf = var1;
        var1 = new ConcurrentHashMap();
        this.Jt = var1;
    }

    public <E> EventSubscription o(Class<E> var1, EventListener<E> var2) {
        int var3 = kQ;
        var3 ^= -1048269259;
        int var4 = System.identityHashCode(this);
        long var24 = var4;
        long var6 = var24 + 1L;
        var6 = var24 * var6;
        long var25 = var6 & 1L;
        long var32;
        var4 = (var32 = var25 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var4 == 0) {
            var3 += -1126233410;
            var3 *= -165052551;
            var3 *= -1801309507;
            var3 ^= -2132998622;
            Integer var27 = var3;
            if (var27 != null) {
                return this.DP(var1, 0, var2);
            }
        } else {
            var3 ^= -1881643097;
            var3 |= 431991925;
            var3 &= 1530483018;
            var3 ^= -48681054;
            long var18 = var3;
            long var5 = var18 + 1L;
            var5 = var18 * var5;
            long var7 = var18 + 2L;
            var5 *= var7;
            long var19 = var18 + 3L;
            var5 *= var19;
            long var20 = var5 & 7L;
            long var33;
            var3 = (var33 = var20 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var3 == 0) {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        }

        IllegalStateException var22 = new IllegalStateException();
        throw var22;
    }

    public <E> EventSubscription DP(Class<E> var1, int var2, EventListener<E> var3) {
        int var4 = kQ;
        var4 ^= 423397452;
        int var6 = System.identityHashCode(this);
        Integer var29 = var6;
        int var7 = of_2.GI;
        var4 ^= var7;
        var4 ^= 970741366;
        of_2.GI = 970741366;
        var7 = of_2.uC;
        var4 ^= var7;
        var4 ^= -1851397018;
        of_2.uC = -1851397018;
        if (var29 != null) {
            switch (var4) {
                case -1820390049:
                    var4 ^= 1705908328;
                    var4 += -1244359962;
                    var4 ^= -2109494052;
                    break;
                case -1626606267:
                default:
                    var4 ^= 1988157476;
                    break;
                case -20627183:
                    var4 ^= -152584508;
            }

            long var30 = var2;
            long var8 = var30 + 1L;
            var8 = var30 * var8;
            long var31 = var8 & 1L;
            long var44;
            int var32 = (var44 = var31 - 0L) == 0L ? 0 : (var44 < 0L ? -1 : 1);
            if (var32 == 0) {
                CL var33 = new CL(var2, var3);
                Map var39 = this.Kf;
                BiFunction<Object, CL[], CL[]> var42 = (var2x, var3x) -> {
                    label153: {
                        int var4x = kQ;
                        int var5 = var2;
                        var4x ^= 1732108184;
                        int var6x = var2;
                        long var7x = var2;
                        long var9 = var7x + 1L;
                        var9 = var7x * var9;
                        var7x = var9 & 1L;
                        long var173;
                        int var103 = (var173 = var7x - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                        if (var103 != 0) {
                            var4x &= -365301678;
                            var4x += -415137061;
                            var4x >>= 12;
                            var4x -= 1073182886;
                            var4x ^= -649581567;
                        } else {
                            label151: {
                                var4x -= -347028455;
                                var4x >>>= 4;
                                var4x &= -897961613;
                                var4x += -1983886693;
                                var4x ^= 384840660;
                                var7x = var2;
                                var9 = var7x + 1L;
                                var9 = var7x * var9;
                                var7x = var9 & 1L;
                                long var174;
                                int var106 = (var174 = var7x - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                                if (var106 != 0) {
                                    break label153;
                                }

                                CL[] var111;
                                if (var3x == null) {
                                    var4x ^= 1977641740;
                                    var4x *= 1300261493;
                                    var4x += 1922195513;
                                    var4x ^= 903438662;
                                    var4x ^= -50134499;
                                    int var107 = var2 + 1;
                                    int var108 = var2 * var107;
                                    int var109 = var108 & 1;
                                    if (var109 != 0) {
                                        break label153;
                                    }

                                    CL[] var110 = bE;
                                    long var8x = var2;
                                    long var10x = var8x + 1L;
                                    var10x = var8x * var10x;
                                    var8x = var10x & 1L;
                                    long var175;
                                    int var116 = (var175 = var8x - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                                    if (var116 != 0) {
                                        var4x |= -1808119815;
                                        var4x *= -26296649;
                                        var4x -= -495227354;
                                        var4x ^= -1627539645;
                                        break label151;
                                    }
                                    var4x = switch (var4x) {
                                        case -1403869733 -> var4x ^ 1564767985;
                                        case -1046351924 -> {
                                            var4x &= 268151729;
                                            yield var4x ^ 762280467;
                                        }
                                        default -> var4x ^ 430112400;
                                    };
                                    var111 = var110;
                                    var4x <<= 30;
                                    var4x &= -712768124;
                                    var4x ^= 1474205680;
                                } else {
                                    var4x |= -797864826;
                                    var4x ^= -1349067110;
                                    int var117 = var2 + 1;
                                    var117 = var2 * var117;
                                    var117 &= 1;
                                    if (var117 != 0) {
                                        break label153;
                                    }

                                    var111 = var3x;
                                    switch (var4x) {
                                        case -915907514:
                                        default:
                                            var4x ^= -1303385444;
                                            break;
                                        case 493534080:
                                            var4x ^= -1918522514;
                                            break;
                                        case 1894068788:
                                            var4x &= 2123549418;
                                            var4x ^= -211228015;
                                            var4x |= -2056675241;
                                            var4x ^= 272072455;
                                    }
                                }

                                Integer var120 = var2;
                                if (var120 == null) {
                                    break label153;
                                }

                                int var121 = var111.length;
                                Object[] var112 = Arrays.copyOf(var111, ++var121);
                                CL[] var113 = (CL[])var112;
                                CL[] var114 = var113;
                                var121 = var2 + 1;
                                var121 = var2 * var121;
                                int var139 = var2 + 2;
                                var121 *= var139;
                                int var140 = var2 + 3;
                                var121 *= var140;
                                var121 &= 7;
                                if (var121 != 0) {
                                    switch (var4x) {
                                        case -1747019792:
                                            var4x -= -654007274;
                                            var4x ^= -1483431636;
                                            break;
                                        case 1142866246:
                                        default:
                                            var4x ^= -879798010;
                                            break;
                                        case 1357490758:
                                            var4x ^= 561699317;
                                    }
                                } else {
                                    label152: {
                                        var4x |= 568303172;
                                        var4x |= 2113480297;
                                        var4x >>= 17;
                                        var4x &= 2081288239;
                                        var4x ^= -1721831942;
                                        var121 = var2 + 1;
                                        var121 = var2 * var121;
                                        int var141 = var2 + 2;
                                        var121 *= var141;
                                        int var142 = var2 + 3;
                                        var121 *= var142;
                                        var121 &= 7;
                                        if (var121 != 0) {
                                            break label153;
                                        }

                                        var121 = var113.length;
                                        var121 = --var121;
                                        var4x &= -1405888677;
                                        var4x >>= 29;
                                        var4x += 1630149850;
                                        var4x ^= 2091504490;

                                        label141:
                                        while (true) {
                                            int var143 = var5 + 1;
                                            int var144 = var5 * var143;
                                            int var145 = var144 & 1;
                                            if (var145 != 0) {
                                                break label153;
                                            }

                                            if (var121 > 0) {
                                                var4x = switch (var4x) {
                                                    case -676067482 -> var4x ^ -940605130;
                                                    default -> var4x ^ -1163789319;
                                                    case 495177661 -> {
                                                        var4x &= 525057300;
                                                        var4x &= 2126848942;
                                                        var4x *= 1298834725;
                                                        var4x += 1422464597;
                                                        yield var4x ^ -1654547280;
                                                    }
                                                };
                                                Integer var146 = var5;
                                                if (var146 == null) {
                                                    break label153;
                                                }

                                                int var147 = var121 - 1;
                                                CL var148 = var114[var147];
                                                int var149 = var148.priority();
                                                int var155 = var6x + 1;
                                                var155 = var6x * var155;
                                                int var11x = var6x + 2;
                                                var155 *= var11x;
                                                var11x = var6x + 3;
                                                var155 *= var11x;
                                                var155 &= 7;
                                                if (var155 != 0) {
                                                    var4x |= -259790835;
                                                    var4x &= -1936901739;
                                                    var4x ^= -1849660445;
                                                    break label152;
                                                }

                                                var4x |= -503642299;
                                                var4x >>= 2;
                                                var4x += -1649162889;
                                                var4x ^= -426101707;
                                                var4x ^= 293843944;
                                                if (var149 < var2) {
                                                    var4x = switch (var4x) {
                                                        case -28351502 -> var4x ^ 779882655;
                                                        default -> var4x ^ -976904664;
                                                        case 1806310547 -> {
                                                            var4x |= 1559113846;
                                                            var4x |= 495717563;
                                                            var4x -= 1192231724;
                                                            yield var4x ^ -1635120150;
                                                        }
                                                    };
                                                    Integer var150 = var5;
                                                    if (var150 == null) {
                                                        break label153;
                                                    }

                                                    int var151 = var121 - 1;
                                                    CL var152 = var114[var151];
                                                    var114[var121] = var152;
                                                    int var153 = var121 + -1;
                                                    long var160 = var6x;
                                                    long var12x = var160 + 1L;
                                                    var12x = var160 * var12x;
                                                    long var14x = var160 + 2L;
                                                    var12x *= var14x;
                                                    long var161 = var160 + 3L;
                                                    var12x *= var161;
                                                    long var162 = var12x & 7L;
                                                    long var176;
                                                    var155 = (var176 = var162 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                                                    if (var155 != 0) {
                                                        switch (var4x) {
                                                            case -1504431559:
                                                                var4x &= 425793165;
                                                                var4x *= -1762318397;
                                                                var4x ^= 1701267757;
                                                                break label152;
                                                            case -1434138667:
                                                            default:
                                                                var4x ^= -472063041;
                                                                break label152;
                                                            case -1143673990:
                                                                var4x ^= -458951630;
                                                                break label152;
                                                        }
                                                    }

                                                    var4x &= 1288911632;
                                                    var4x &= -795339782;
                                                    var4x -= 1248905440;
                                                    var4x -= -1783766743;
                                                    var4x ^= -1901228352;
                                                    Integer var164 = var5;
                                                    if (var164 == null) {
                                                        break label153;
                                                    }

                                                    var121 = var153;
                                                    switch (var4x) {
                                                        case -1856182585:
                                                            var4x >>= 25;
                                                            var4x |= -1808252785;
                                                            var4x ^= -495177614;
                                                            continue;
                                                        case 717449905:
                                                            var4x ^= 1534151299;
                                                            continue;
                                                        case 1856028111:
                                                        default:
                                                            var4x ^= -1819330924;
                                                            continue;
                                                    }
                                                }

                                                var4x &= -1102124732;
                                                var4x ^= 2011609255;
                                                break;
                                            }

                                            switch (var4x) {
                                                case -198746668:
                                                default:
                                                    var4x ^= 1331119655;
                                                    break label141;
                                                case 495177661:
                                                    var4x += 1728628340;
                                                    var4x ^= -648010090;
                                                    break label141;
                                                case 1588029660:
                                                    var4x ^= -1267634449;
                                                    break label141;
                                            }
                                        }

                                        var4x = var5 + 1;
                                        var4x = var5 * var4x;
                                        var6x = var5 + 2;
                                        var4x *= var6x;
                                        var5 += 3;
                                        var4x *= var5;
                                        var4x &= 7;
                                        if (var4x == 0) {
                                            var114[var121] = var33;
                                            return var114;
                                        }
                                        break label153;
                                    }
                                }
                            }
                        }

                        int var165 = var5 + 1;
                        var165 = var5 * var165;
                        var165 &= 1;
                        if (var165 == 0) {
                            UnsupportedOperationException var168 = new UnsupportedOperationException();
                            throw var168;
                        }
                    }

                    AssertionError var99 = new AssertionError();
                    throw var99;
                };
                Object var40 = var39.compute(var1, var42);
                return () -> {
                    int var3x = kQ;
                    var3x ^= -1897173985;
                    int var4x = System.identityHashCode(this);
                    long var15x = var4x;
                    long var6x = var15x + 1L;
                    var6x = var15x * var6x;
                    long var16x = var6x & 1L;
                    long var25x;
                    var4x = (var25x = var16x - 0L) == 0L ? 0 : (var25x < 0L ? -1 : 1);
                    if (var4x == 0) {
                        var3x *= 2138867133;
                        var3x ^= 690307554;
                        Integer var18x = var3x;
                        if (var18x == null) {
                            UnsupportedOperationException var23x = new UnsupportedOperationException();
                            throw var23x;
                        } else {
                            int var19x = var3x & 1117847133;
                            var19x &= 1399124680;
                            var19x -= 1982697878;
                            var19x ^= -944716955;
                            this.a(var1, var33, var19x);
                        }
                    } else {
                        var3x -= -203495201;
                        var3x -= 1485207783;
                        var3x ^= 1188018444;
                        IllegalStateException var12x = new IllegalStateException();
                        throw var12x;
                    }
                };
            }
        } else {
            var4 &= 84031017;
            var4 &= 129316632;
            var4 ^= 909387492;
            long var23 = var2;
            long var34 = var23 + 1L;
            long var35 = var23 * var34;
            long var43 = var23 + 2L;
            long var36 = var35 * var43;
            long var24 = var23 + 3L;
            long var37 = var36 * var24;
            long var25 = var37 & 7L;
            long var45;
            var4 = (var45 = var25 - 0L) == 0L ? 0 : (var45 < 0L ? -1 : 1);
            if (var4 == 0) {
                UnsupportedOperationException var28 = new UnsupportedOperationException();
                throw var28;
            }
        }

        RuntimeException var27 = new RuntimeException();
        throw var27;
    }

    private void a(Class var1, CL var2, int var3) {
        int var5 = System.identityHashCode(this);
        int var6 = var5 + 1;
        var6 = var5 * var6;
        int var7 = var5 + 2;
        var6 *= var7;
        var5 += 3;
        var6 *= var5;
        var5 = var6 & 7;
        if (var5 == 0) {
            long var23 = switch (var3) {
                default -> var3 ^ -1001669862;
                case -1812143297 -> var3 ^ 2004645840;
                case 1279438103 -> {
                    int var4 = var3 + 1043308422;
                    var4 &= 1802901075;
                    var4 *= -2015963477;
                    var4 += 1097539535;
                    yield var4 ^ -2102759111;
                }
            };
            long var37 = var23 + 1L;
            long var38 = var23 * var37;
            long var24 = var38 & 1L;
            long var39;
            var5 = (var39 = var24 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var5 == 0) {
                Map var26 = this.Kf;
                BiFunction<Object, CL[], CL[]> var35 = (var1x, var2x) -> {
                    int var3x = kQ;
                    var3x ^= -2017608729;
                    int var4x = System.identityHashCode(var2);
                    int var5x = -1;
                    int var6x = 0;
                    Integer var7x = var4x;
                    if (var7x == null) {
                        var3x <<= 13;
                        var3x ^= -1247081020;
                    } else {
                        label140: {
                            var3x |= 898801681;
                            var3x ^= -1126479957;
                            var3x &= -2062829668;
                            var3x ^= -898369357;
                            var6x = var6x;
                            var3x &= -2066443273;
                            var3x -= -1337637676;
                            var3x |= -1750519899;
                            var3x ^= 64228535;
                            var3x ^= -334806261;

                            while (true) {
                                int var123 = var3x + 1;
                                var123 = var3x * var123;
                                int var8 = var3x + 2;
                                var123 *= var8;
                                var8 = var3x + 3;
                                var123 *= var8;
                                var123 &= 7;
                                if (var123 != 0) {
                                    break;
                                }

                                var123 = var2x.length;
                                Integer var137 = var4x;
                                if (var137 == null) {
                                    var3x <<= 23;
                                    var3x &= 875933323;
                                    var3x ^= 1450544580;
                                    break label140;
                                }

                                var3x &= 1135170929;
                                var3x *= 1848514933;
                                var3x |= 617678747;
                                var3x ^= -2019113637;
                                var137 = var3x;
                                if (var137 == null) {
                                    break;
                                }

                                if (var6x < var123) {
                                    var3x = switch (var3x) {
                                        case -1823362042 -> var3x ^ 482850015;
                                        default -> var3x ^ -1284341339;
                                        case 864010980 -> {
                                            var3x += 702806927;
                                            yield var3x ^ -422619894;
                                        }
                                    };
                                    var123 = var3x + 1;
                                    var123 = var3x * var123;
                                    int var139 = var3x + 2;
                                    var123 *= var139;
                                    var139 = var3x + 3;
                                    var123 *= var139;
                                    var123 &= 7;
                                    if (var123 != 0) {
                                        break;
                                    }

                                    CL var134 = var2x[var6x];
                                    var139 = var4x + 1;
                                    var139 = var4x * var139;
                                    var139 &= 1;
                                    if (var139 != 0) {
                                        var3x |= 1354057451;
                                        var3x ^= 1485769488;
                                        var3x ^= -783849169;
                                        break label140;
                                    }

                                    var3x *= -39009155;
                                    var3x >>= 17;
                                    var3x ^= 1444687139;
                                    var3x ^= -1459663596;
                                    Integer var144 = var3x;
                                    if (var144 == null) {
                                        break;
                                    }

                                    if (var134 != var2) {
                                        var3x &= -1764819162;
                                        var3x ^= 51421369;
                                        var3x >>= 31;
                                        var3x ^= -1577220629;
                                        long var149 = var3x;
                                        long var10x = var149 + 1L;
                                        var10x = var149 * var10x;
                                        long var150 = var10x & 1L;
                                        long var195;
                                        int var151 = (var195 = var150 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                                        if (var151 != 0) {
                                            break;
                                        }

                                        var151 = var6x + 1;
                                        int var9x = var4x + 1;
                                        var9x = var4x * var9x;
                                        int var177 = var4x + 2;
                                        var9x *= var177;
                                        int var178 = var4x + 3;
                                        var9x *= var178;
                                        var9x &= 7;
                                        if (var9x != 0) {
                                            var3x += 322051452;
                                            var3x -= 20858250;
                                            var3x ^= -1048260583;
                                            break label140;
                                        }

                                        var3x &= 1106587324;
                                        var3x += -1460079418;
                                        var3x ^= -1530570725;
                                        long var168 = var3x;
                                        long var11x = var168 + 1L;
                                        var11x = var168 * var11x;
                                        long var13x = var168 + 2L;
                                        var11x *= var13x;
                                        long var169 = var168 + 3L;
                                        var11x *= var169;
                                        long var170 = var11x & 7L;
                                        long var196;
                                        var9x = (var196 = var170 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                                        if (var9x != 0) {
                                            break;
                                        }

                                        var6x = var151;
                                        var3x |= -1950918964;
                                        var3x += -924781844;
                                        var3x -= -2099043941;
                                        var3x ^= -305579771;
                                        continue;
                                    }

                                    var3x *= 1947677189;
                                    var3x <<= 3;
                                    var3x ^= 1524700191;
                                    var144 = var4x;
                                    if (var144 == null) {
                                        var3x *= -329932845;
                                        var3x ^= -1577702167;
                                        var3x ^= -2007598768;
                                        break label140;
                                    }

                                    var3x |= 919231801;
                                    var3x ^= 219207194;
                                    int var146 = var3x + 1;
                                    var146 = var3x * var146;
                                    var146 &= 1;
                                    if (var146 != 0) {
                                        break;
                                    }

                                    var123 = var6x;
                                    var3x ^= 2138841720;
                                    var3x *= -1903507929;
                                    var3x &= -534101344;
                                    var3x ^= -564581155;
                                } else {
                                    var3x -= -1537874285;
                                    var3x -= -668154187;
                                    var3x >>>= 31;
                                    var3x ^= -1355995777;
                                    long var153 = var3x;
                                    long var179 = var153 + 1L;
                                    var179 = var153 * var179;
                                    long var12 = var153 + 2L;
                                    var179 *= var12;
                                    long var154 = var153 + 3L;
                                    var179 *= var154;
                                    long var155 = var179 & 7L;
                                    long var197;
                                    var6x = (var197 = var155 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                                    if (var6x != 0) {
                                        break;
                                    }

                                    var123 = var5x;
                                    var3x ^= 658170758;
                                    var3x |= -572388908;
                                    var3x |= 1783790671;
                                    var3x ^= -511388926;
                                }

                                if (var123 < 0) {
                                    var3x <<= 17;
                                    var3x ^= 587591060;
                                    var3x ^= -1058730293;
                                    Integer var103 = var3x;
                                    if (var103 != null) {
                                        return var2x;
                                    }
                                } else {
                                    var3x += -761817719;
                                    var3x &= -1898370515;
                                    var3x ^= -1909882826;
                                    var5x = var3x + 1;
                                    var5x = var3x * var5x;
                                    var6x = var3x + 2;
                                    var5x *= var6x;
                                    var6x = var3x + 3;
                                    var5x *= var6x;
                                    var5x &= 7;
                                    if (var5x == 0) {
                                        var5x = var2x.length;
                                        long var156 = var4x;
                                        long var183 = var156 + 1L;
                                        var183 = var156 * var183;
                                        long var157 = var183 & 1L;
                                        long var198;
                                        var6x = (var198 = var157 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                                        if (var6x != 0) {
                                            var3x -= 196379618;
                                            var3x ^= 1880716180;
                                            break label140;
                                        }

                                        var3x >>>= 23;
                                        var3x ^= 982273831;
                                        long var158 = var3x;
                                        var183 = var158 + 1L;
                                        var183 = var158 * var183;
                                        long var194 = var158 + 2L;
                                        var183 *= var194;
                                        long var159 = var158 + 3L;
                                        var183 *= var159;
                                        long var160 = var183 & 7L;
                                        long var199;
                                        var6x = (var199 = var160 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                                        if (var6x == 0) {
                                            if (var5x == 1) {
                                                var3x ^= -1327022045;
                                                var3x >>= 19;
                                                var3x *= 650290885;
                                                var3x += -425512260;
                                                var3x ^= -1146458064;
                                                return null;
                                            }

                                            var3x >>= 18;
                                            var3x += -1884289909;
                                            var3x ^= 327327296;
                                            var5x = var3x + 1;
                                            var5x = var3x * var5x;
                                            var5x &= 1;
                                            if (var5x == 0) {
                                                var5x = var2x.length;
                                                CL[] var115 = new CL[--var5x];
                                                System.arraycopy(var2x, 0, var115, 0, var123);
                                                var6x = var123 + 1;
                                                int var161 = var2x.length;
                                                var161 -= var123;
                                                var161--;
                                                int var172 = var4x + 1;
                                                var172 = var4x * var172;
                                                var4x = var172 & 1;
                                                if (var4x != 0) {
                                                    var3x ^= -2094156778;
                                                    var3x ^= 1835709628;
                                                    break label140;
                                                }

                                                var3x &= 1575506711;
                                                var3x |= -1519758618;
                                                var3x &= 111013038;
                                                var3x ^= 1325395511;
                                                long var174 = var3x;
                                                long var192 = var174 + 1L;
                                                var192 = var174 * var192;
                                                long var175 = var192 & 1L;
                                                long var200;
                                                var4x = (var200 = var175 - 0L) == 0L ? 0 : (var200 < 0L ? -1 : 1);
                                                if (var4x == 0) {
                                                    System.arraycopy(var2x, var6x, var115, var123, var161);
                                                    return var115;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }

                            IllegalStateException var102 = new IllegalStateException();
                            throw var102;
                        }
                    }

                    IllegalArgumentException var99 = new IllegalArgumentException();
                    throw var99;
                };
                Object var27 = var26.computeIfPresent(var1, var35);
                return;
            }
        } else {
            int var16 = switch (var3) {
                case -1300780758 -> var3 ^ -1796268347;
                default -> var3 ^ 1946411807;
                case 1279438103 -> {
                    int var13 = var3 | 2058311981;
                    var13 *= -1431488885;
                    var13 += -512514958;
                    yield var13 ^ -636751222;
                }
            };
            var5 = var16 + 1;
            var5 = var16 * var5;
            var6 = var16 + 2;
            var5 *= var6;
            var16 += 3;
            var5 *= var16;
            var16 = var5 & 7;
            if (var16 == 0) {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        }

        IllegalArgumentException var19 = new IllegalArgumentException();
        throw var19;
    }

    public boolean l(Class var1) {
        int var2 = kQ;
        var2 ^= -1419728270;
        int var3 = System.identityHashCode(this);
        long var23 = var3;
        long var5 = var23 + 1L;
        var5 = var23 * var5;
        long var7 = var23 + 2L;
        var5 *= var7;
        long var24 = var23 + 3L;
        var5 *= var24;
        long var25 = var5 & 7L;
        long var33;
        var3 = (var33 = var25 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 ^= 1895984152;
            var2 &= 1113725002;
            var2 &= 105082229;
            var2 <<= 11;
            var2 ^= -1053001691;
            Integer var27 = var2;
            if (var27 == null) {
                UnsupportedOperationException var29 = new UnsupportedOperationException();
                throw var29;
            } else {
                Map var28 = this.Kf;
                return var28.containsKey(var1);
            }
        } else {
            switch (var2) {
                case -1046262796:
                    var2 ^= 728297400;
                    break;
                case -264312972:
                default:
                    var2 ^= 1105449356;
                    break;
                case 555954017:
                    var2 += 1807345746;
                    var2 += 981517900;
                    var2 >>>= 10;
                    var2 <<= 8;
                    var2 ^= -1900257658;
            }

            IllegalStateException var17 = new IllegalStateException();
            throw var17;
        }
    }

    public Object A(Object var1) {
        Throwable var141 = null;
        EventListener var142 = null;
        int var2 = kQ;
        var2 ^= -634130979;
        Object var3 = null;
        Map var4 = this.Kf;
        Class var5 = var1.getClass();
        Object var107 = var4.get(var5);
        var107 = (CL[])var107;
        var2 &= -565636928;
        var2 ^= -542495404;
        var2 ^= 255947540;
        int var110 = of_2.GI;
        var2 ^= var110;
        var2 ^= 970741366;
        int var111 = of_2.uC;
        var2 ^= var111;
        var2 ^= -1851397018;
        long var112 = var2;
        long var7 = var112 + 1L;
        var7 = var112 * var7;
        long var113 = var7 & 1L;
        long var166;
        int var114 = (var166 = var113 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
        if (var114 == 0) {
            if (var107 == null) {
                var2 <<= 23;
                var2 ^= -783550945;
                Integer var115 = var2;
                if (var115 != null) {
                    return var1;
                }
            } else {
                var2 ^= 193764446;
                var2 *= 634452291;
                var2 |= 880852665;
                var2 ^= -1110771155;
                int var116 = var2 + 1;
                int var117 = var2 * var116;
                int var118 = var117 & 1;
                if (var118 == 0) {
                    CL[] var109 = (CL[])var107;
                    int var119 = ((Object[])var107).length;

                    var2 = switch (var2) {
                        default -> var2 ^ 2108721390;
                        case -199097138 -> var2 ^ 478268149;
                        case 186320022 -> {
                            var2 |= 1292695657;
                            var2 &= -1819693188;
                            var2 |= -1445081034;
                            var2 |= 2090373032;
                            yield var2 ^ 1783406285;
                        }
                    };
                    int var6 = var2 + 1;
                    var6 = var2 * var6;
                    int var127 = var2 + 2;
                    var6 *= var127;
                    int var128 = var2 + 3;
                    var6 *= var128;
                    var6 &= 7;
                    label161:
                    if (var6 == 0) {
                        int var120 = var119;
                        var6 = 0;

                        var2 = switch (var2) {
                            case -1785634509 -> {
                                var2 -= 2130949055;
                                yield var2 ^ -1161238941;
                            }
                            case -1725101288 -> var2 ^ 376357742;
                            default -> var2 ^ 1614930350;
                        };

                        while (var6 < var120) {
                            var2 = switch (var2) {
                                default -> var2 ^ -340431942;
                                case -1404744937 -> {
                                    var2 ^= 1485093190;
                                    var2 *= 1066576873;
                                    var2 ^= 735681888;
                                    yield var2 ^ 1756456105;
                                }
                                case -329633137 -> var2 ^ 1068358751;
                            };
                            CL var129 = var109[var6];

                            var2 = switch (var2) {
                                default -> var2 ^ 390879341;
                                case 838557552 -> {
                                    var2 -= 2033643353;
                                    var2 |= -405160214;
                                    var2 ^= -756966684;
                                    yield var2 ^ -394078285;
                                }
                                case 1980472149 -> var2 ^ -1522697268;
                            };
                            long var8 = var2;
                            long var10 = var8 + 1L;
                            var10 = var8 * var10;
                            long var12 = var8 + 2L;
                            var10 *= var12;
                            var8 += 3L;
                            var10 *= var8;
                            var8 = var10 & 7L;
                            long var167;
                            int var136 = (var167 = var8 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
                            if (var136 != 0) {
                                break label161;
                            }

                            CL var130 = var129;
                            var2 &= 225137732;
                            var2 += -285189169;
                            var2 &= 794732758;
                            var2 ^= 1903119101;
                            var2 ^= 1746549748;
                            int var137 = var2 + 1;
                            int var138 = var2 * var137;
                            int var139 = var138 & 1;
                            if (var139 != 0) {
                                break label161;
                            }

                            var2 -= -736442213;
                            var2 ^= 1701859426;
                            Integer var140 = var2;
                            if (var140 == null) {
                                break label161;
                            }

                            label185: {
                                label170: {
                                    label153: {
                                        label152: {
                                            label151: {
                                                label171: {
                                                    try {
                                                        var142 = var130.listener();
                                                        var2 *= 1431464885;
                                                        var2 -= 715789794;
                                                        var2 -= -1645521555;
                                                        var2 |= -238139633;
                                                        var2 ^= -1996383539;
                                                    } catch (Throwable var15) {
                                                        var2 = kQ;
                                                        var2 ^= 1500413194;
                                                        var141 = var15;
                                                        switch (var2) {
                                                            case -751962087:
                                                                break label151;
                                                            case 668236037:
                                                                break label171;
                                                            case 788433633:
                                                            default:
                                                                break label152;
                                                        }
                                                    }

                                                    int var9 = var2 + 1;
                                                    var9 = var2 * var9;
                                                    int var163 = var2 + 2;
                                                    var9 *= var163;
                                                    int var164 = var2 + 3;
                                                    var9 *= var164;
                                                    var9 &= 7;
                                                    if (var9 != 0) {
                                                        break label161;
                                                    }

                                                    try {
                                                        var142.onEvent(var1);
                                                        break label170;
                                                    } catch (Throwable var14) {
                                                        var2 = kQ;
                                                        var2 ^= 1500413194;
                                                        var141 = var14;
                                                        switch (var2) {
                                                            case -751962087:
                                                                break label151;
                                                            case 668236037:
                                                                break;
                                                            case 788433633:
                                                            default:
                                                                break label152;
                                                        }
                                                    }
                                                }

                                                var2 ^= -88689187;
                                                break label153;
                                            }

                                            var2 -= 1971461957;
                                            var2 ^= -192583069;
                                            break label153;
                                        }

                                        var2 ^= 220675850;
                                    }

                                    int var148 = (var141 instanceof VirtualMachineError) ? 1 : 0;
                                    if (var148 != 0) {
                                        var2 ^= 1181185749;
                                        var2 *= 883032627;
                                        var2 += -940830047;
                                        var2 &= -807451023;
                                        var2 ^= 1485683149;
                                        Integer var158 = var2;
                                        if (var158 != null) {
                                            VirtualMachineError var159 = (VirtualMachineError)var141;
                                            switch (var2) {
                                                case -1653735412:
                                                default:
                                                    var2 ^= 1775151283;
                                                    break;
                                                case 1058156891:
                                                    var2 ^= -1008170420;
                                                    break;
                                                case 1569193964:
                                                    var2 ^= 1969486036;
                                                    var2 &= 1057703594;
                                                    var2 <<= 9;
                                                    var2 |= -618057934;
                                                    var2 ^= 2084965856;
                                            }

                                            throw var159;
                                        }
                                        break label161;
                                    }

                                    var2 >>= 22;
                                    var2 ^= 91316354;
                                    long var149 = var2;
                                    long var11 = var149 + 1L;
                                    var11 = var149 * var11;
                                    long var150 = var11 & 1L;
                                    long var168;
                                    var148 = (var168 = var150 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                                    if (var148 != 0) {
                                        break label161;
                                    }

                                    EventListener var131 = var129.listener();
                                    var2 |= -1148810527;
                                    var2 ^= -333329031;
                                    var2 &= 297508078;
                                    var2 ^= -1378248192;
                                    var2 ^= 1779729084;
                                    Integer var152 = var2;
                                    if (var152 == null) {
                                        break label161;
                                    }

                                    int var153 = var2 * -1193758863;
                                    var153 *= 687877241;
                                    var153 -= -692435459;
                                    var153 >>>= 6;
                                    var153 ^= 1460501779;
                                    this.GU(var131, var1, var141, var153);
                                    var2 ^= 815712792;
                                    var2 <<= 20;
                                    var2 ^= -188307606;
                                    var2 -= 1677667339;
                                    var2 ^= -230457682;
                                    break label185;
                                }
                                var2 = switch (var2) {
                                    default -> var2 ^ 582852570;
                                    case 1341290527 -> var2 ^ -1252067184;
                                    case 1929373106 -> {
                                        var2 |= 1430741485;
                                        var2 |= 1779299484;
                                        var2 ^= -408303946;
                                        var2 |= -2064111479;
                                        yield var2 ^ -1818640493;
                                    }
                                };
                                Integer var132 = var2;
                                if (var132 == null) {
                                    break label161;
                                }

                                var2 += -1715074460;
                                var2 += 1290840631;
                                var2 ^= 1983528196;
                            }

                            int var133 = var6 + 1;
                            var2 &= 715997997;
                            var2 &= -1227315696;
                            var2 += -207267347;
                            var2 |= -655641917;
                            var2 ^= -2094386472;
                            Integer var143 = var2;
                            if (var143 == null) {
                                break label161;
                            }

                            var6 = var133;
                            switch (var2) {
                                case -1000084102:
                                    var2 ^= 266309105;
                                    break;
                                case 1257624904:
                                default:
                                    var2 ^= -620330255;
                                    break;
                                case 2026228023:
                                    var2 += 1623635762;
                                    var2 += 1605965321;
                                    var2 ^= -1795105435;
                            }
                        }

                        var2 |= 25827634;
                        var2 <<= 1;
                        var2 -= 1068765564;
                        var2 -= -1465930082;
                        var2 ^= 417096508;
                        Integer var105 = var2;
                        if (var105 != null) {
                            return var1;
                        }
                    }
                }
            }
        }

        AssertionError var106 = new AssertionError();
        throw var106;
    }

    public int YG(Class var1) {
        label55: {
            int var27;
            int var49;
            label54: {
                var27 = kQ;
                var27 ^= -1245594341;
                int var3 = System.identityHashCode(this);
                Map var4 = this.Kf;
                Object var45 = var4.get(var1);
                var45 = (CL[])var45;
                Integer var5 = var3;
                if (var5 != null) {
                    var27 *= -534839169;
                    var27 ^= -51784049;
                    var27 ^= 1227410470;
                    var5 = var27;
                    if (var5 == null) {
                        break label55;
                    }

                    if (var45 == null) {
                        var27 -= -1016610300;
                        var27 &= 1738224812;
                        var27 *= -1376925823;
                        var27 ^= -367034183;
                        int var50 = var27 + 1;
                        var50 = var27 * var50;
                        var50 &= 1;
                        if (var50 != 0) {
                            break label55;
                        }

                        var49 = 0;
                        var27 &= -1853165143;
                        var27 ^= -1595617594;
                        var27 <<= 10;
                        var27 -= -240766793;
                        var27 ^= -1288438510;
                        break label54;
                    }

                    var27 ^= 1238458054;
                    var27 -= 1228526585;
                    var27 -= -1328095618;
                    var27 += -1773222525;
                    var27 ^= 211246473;
                    int var6 = var27 + 1;
                    var6 = var27 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label55;
                    }

                    int var47 = ((Object[])var45).length;
                    long var55 = var3;
                    long var8 = var55 + 1L;
                    var8 = var55 * var8;
                    long var56 = var8 & 1L;
                    long var58;
                    var3 = (var58 = var56 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var27 ^= 367632023;
                        var27 -= -1796706837;
                        var27 ^= -872549662;
                        Integer var43 = var27;
                        if (var43 == null) {
                            break label55;
                        }

                        var49 = var47;
                        var27 |= -1321897381;
                        var27 <<= 6;
                        var27 ^= 1488734363;
                        break label54;
                    }

                    var27 >>>= 6;
                    var27 += -1267081749;
                    var27 ^= 731773276;
                } else {
                    switch (var27) {
                        case -657611726:
                        default:
                            var27 ^= 1380911292;
                            break;
                        case 953691445:
                            var27 ^= 1974960066;
                            break;
                        case 1065498632:
                            var27 >>= 4;
                            var27 *= 421421805;
                            var27 += -1204227119;
                            var27 ^= -1779979798;
                    }
                }

                Integer var39 = var27;
                if (var39 != null) {
                    AssertionError var41 = new AssertionError();
                    throw var41;
                }
                break label55;
            }

            Integer var44 = var27;
            if (var44 != null) {
                return var49;
            }
        }

        RuntimeException var40 = new RuntimeException();
        throw var40;
    }

    private void GU(EventListener var1, Object var2, Throwable var3, int var4) {
        label49: {
            int var37;
            int var6 = System.identityHashCode(this);
            Integer var7 = var6;
            label48:
            if (var7 != null) {
                var37 = var4 & -1003643446;
                var37 |= 1532931350;
                var37 ^= -2124683062;
                var7 = var37;
                if (var7 == null) {
                    break label49;
                }

                long var54 = System.nanoTime();
                Map var9 = this.Jt;
                Long var58 = (Long)var9.get(var1);
                var58 = var58;
                if (var58 != null) {
                    var37 |= 728217515;
                    var37 |= -1494998677;
                    var37 &= 372245887;
                    var37 ^= -761838729;
                    long var60 = var58;
                    var60 = var54 - var60;
                    long var71;
                    int var62 = (var71 = var60 - 5000000000L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                    Integer var10 = var6;
                    if (var10 == null) {
                        var37 -= 316559623;
                        var37 ^= -2112583405;
                        var37 ^= -1861377489;
                        break label48;
                    }

                    var37 ^= 873789681;
                    var37 ^= -1636282084;
                    var37 |= -778400149;
                    var37 *= -567688259;
                    var37 ^= 1616791550;
                    if (var62 < 0) {
                        var37 &= 663600462;
                        var37 += 1729925564;
                        var37 |= -1880325865;
                        var37 ^= -2058662154;
                        return;
                    }

                    var37 -= -1432703464;
                    var37 += 1825548063;
                    var37 *= -287273349;
                    var37 ^= -1293865421;
                } else {
                    var37 *= 1781965505;
                    var37 |= -2109379589;
                    var37 ^= -1700794672;
                }

                Map var63 = this.Jt;
                Long var55 = var54;
                var63.put(var1, var55);
                Logger var57 = HQ;
                Object[] var8 = new Object[]{var1, null, null};
                Class var64 = var2.getClass();
                long var65 = var6;
                long var12 = var65 + 1L;
                var12 = var65 * var12;
                long var14 = var65 + 2L;
                var12 *= var14;
                var65 += 3L;
                var12 *= var65;
                var65 = var12 & 7L;
                long var72;
                var6 = (var72 = var65 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                if (var6 == 0) {
                    var37 += 1273893680;
                    var37 ^= 790937330;
                    Integer var51 = var37;
                    if (var51 != null) {
                        String var52 = var64.getSimpleName();
                        var8[1] = var52;
                        var8[2] = var3;
                        var57.error("Listener {} failed handling {}", var8);
                        return;
                    }
                    break label49;
                }

                var37 *= -859747577;
                var37 *= -1198774659;
                var37 &= 842507110;
                var37 &= -367014522;
                var37 ^= -1563173319;
            } else {
                var37 = var4 - 320137568;
                var37 ^= -428991340;
            }

            Integer var47 = var37;
            if (var47 != null) {
                IllegalStateException var49 = new IllegalStateException();
                throw var49;
            }
        }

        IllegalArgumentException var48 = new IllegalArgumentException();
        throw var48;
    }

    public <E> EventSubscription subscribe(Class<E> eventType, EventListener<E> listener) {
        return this.o(eventType, listener);
    }

    public <E> EventSubscription subscribePriority(Class<E> eventType, int priority, EventListener<E> listener) {
        return this.DP(eventType, priority, listener);
    }

    public boolean hasListeners(Class<?> eventType) { return this.l(eventType); }

    public Object post(Object event) { return this.A(event); }

    public int listenerCount(Class<?> eventType) { return this.YG(eventType); }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -184182332;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        kQ = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/events");
        HQ = var5;
        CL[] var6 = new CL[0];
        bE = var6;
    }
}
