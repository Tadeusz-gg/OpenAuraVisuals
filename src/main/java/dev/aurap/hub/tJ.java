package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.ToLongFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class tJ {
    private static final Pattern V;
    private static final Pattern LX;
    private static final Pattern wL;
    public static final int mc;

    private tJ() {
    }

    public static Za l(String var0) {
        boolean var438 = false;
        label548: {
            int var1 = mc;
            var1 ^= 1474414169;
            int var2 = System.identityHashCode(var0);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var643;
            int var334 = (var643 = var3 - 0L) == 0L ? 0 : (var643 < 0L ? -1 : 1);
            if (var334 != 0) {
                var1 |= 756953532;
                var1 >>= 1;
                var1 ^= 234979043;
            } else {
                label546: {
                    var1 &= 1284497832;
                    var1 &= 1227155446;
                    var1 ^= 1147843549;
                    var3 = var1;
                    var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var3 = var5 & 1L;
                    long var644;
                    int var337 = (var644 = var3 - 0L) == 0L ? 0 : (var644 < 0L ? -1 : 1);
                    if (var337 != 0) {
                        break label548;
                    }

                    if (var0 != null) {
                        var1 = switch (var1) {
                            case -1043735289 -> var1 ^ -1015790029;
                            default -> var1 ^ 1008483105;
                            case 74363613 -> {
                                var1 += -36868081;
                                var1 += -1147657461;
                                yield var1 ^ 1490454490;
                            }
                        };
                        var3 = var1;
                        var5 = var3 + 1L;
                        var5 = var3 * var5;
                        var7 = var3 + 2L;
                        var5 *= var7;
                        var3 += 3L;
                        var5 *= var3;
                        var3 = var5 & 7L;
                        long var645;
                        int var341 = (var645 = var3 - 0L) == 0L ? 0 : (var645 < 0L ? -1 : 1);
                        if (var341 != 0) {
                            break label548;
                        }

                        boolean var342 = var0.isBlank();
                        Integer var4 = var2;
                        if (var4 == null) {
                            var1 *= 1848293667;
                            var1 -= 131571364;
                            var1 ^= -1880944225;
                            break label546;
                        }

                        var1 >>= 29;
                        var1 &= -1921427900;
                        var1 -= -785884849;
                        var1 ^= 1280627542;
                        int var356 = var1 + 1;
                        var356 = var1 * var356;
                        var356 &= 1;
                        if (var356 != 0) {
                            break label548;
                        }

                        if (!var342) {
                            var1 *= 555762407;
                            var1 ^= 1879942098;
                            var1 -= -1536419694;
                            var1 ^= -1683384235;
                            int var343 = var1 + 1;
                            int var344 = var1 * var343;
                            int var345 = var344 & 1;
                            if (var345 != 0) {
                                break label548;
                            }

                            var3 = 0L;
                            Pattern var383 = LX;
                            Matcher var384 = var383.matcher(var0);
                            Integer var6 = var2;
                            if (var6 == null) {
                                var1 >>= 4;
                                var1 |= -1026871310;
                                var1 *= 344955909;
                                var1 ^= 1226671314;
                                break label546;
                            }

                            var1 -= 1931995889;
                            var1 >>= 16;
                            var1 |= 124354447;
                            var1 ^= 937814610;
                            boolean var421 = var384.find();
                            if (var421) {
                                var1 >>= 4;
                                var1 -= -635177695;
                                var1 <<= 27;
                                var1 ^= 85311225;
                                var6 = var1;
                                if (var6 == null) {
                                    break label548;
                                }

                                String var385 = var384.group(1);
                                var5 = Long.parseLong(var385);
                                int var448 = var2 + 1;
                                int var449 = var2 * var448;
                                int var8 = var2 + 2;
                                int var450 = var449 * var8;
                                var8 = var2 + 3;
                                int var451 = var450 * var8;
                                int var452 = var451 & 7;
                                if (var452 != 0) {
                                    var1 ^= 716170621;
                                    var1 &= 422645760;
                                    var1 &= -2098578131;
                                    var1 ^= -117542116;
                                    break label546;
                                }
                                var1 = switch (var1) {
                                    default -> var1 ^ 1271792720;
                                    case -317341959 -> {
                                        var1 ^= 368840796;
                                        var1 += 1828680284;
                                        yield var1 ^ 1608841197;
                                    }
                                    case 2127375347 -> var1 ^ -991506255;
                                };
                                var5 = var5;
                                var1 += -892048410;
                                var1 >>= 26;
                                var1 ^= -1655741931;
                                var1 *= -1445241747;
                                var1 ^= 2132216256;
                            } else {
                                var1 &= -617699451;
                                var1 -= -410682426;
                                var1 ^= 1297036953;
                                var5 = var3;
                                var1 |= 437527941;
                                var1 ^= -2055367815;
                                var1 |= -1328368721;
                                var1 ^= 415450299;
                            }

                            Integer var347 = var1;
                            if (var347 == null) {
                                break label548;
                            }

                            ArrayList var348 = new ArrayList();
                            ArrayList var349 = var348;
                            String[] var359 = var0.split("\\R");
                            int var453 = var2 + 1;
                            int var454 = var2 * var453;
                            int var495 = var2 + 2;
                            int var455 = var454 * var495;
                            var495 = var2 + 3;
                            int var456 = var455 * var495;
                            int var457 = var456 & 7;
                            if (var457 != 0) {
                                var1 &= -768240558;
                                var1 ^= -1504136019;
                                var1 ^= -1665775631;
                                break label546;
                            }
                            var1 = switch (var1) {
                                case -1899502227 -> var1 ^ -1702583060;
                                case -500106428 -> {
                                    var1 <<= 23;
                                    var1 *= -1934925729;
                                    yield var1 ^ 1740292199;
                                }
                                default -> var1 ^ 407650659;
                            };
                            var7 = var1;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var646;
                            int var461 = (var646 = var7 - 0L) == 0L ? 0 : (var646 < 0L ? -1 : 1);
                            if (var461 != 0) {
                                break label548;
                            }

                            String[] var360 = var359;
                            int var462 = var359.length;
                            int var463 = var462;
                            int var497 = 0;
                            var497 = var497;
                            var1 -= -573918896;
                            var1 &= 1866027032;
                            var1 ^= 399868718;
                            var1 <<= 22;
                            var1 ^= -2130694964;

                            while (var497 < var463) {
                                var1 = switch (var1) {
                                    case 553708778 -> var1 ^ 1384153765;
                                    default -> var1 ^ 265303406;
                                    case 1317022924 -> {
                                        var1 >>= 27;
                                        var1 -= -1283589061;
                                        yield var1 ^ 1780010906;
                                    }
                                };
                                String var514 = var360[var497];
                                String var515 = var514.strip();
                                Integer var10 = var2;
                                if (var10 == null) {
                                    var1 -= -1634564703;
                                    var1 &= -2001624719;
                                    var1 += -1020514660;
                                    var1 ^= -1275965999;
                                    break label546;
                                }

                                var1 -= -1605488368;
                                var1 ^= -1210895658;
                                var10 = var1;
                                if (var10 == null) {
                                    break label548;
                                }

                                String var516 = var515;
                                boolean var530 = var515.isEmpty();
                                if (var530) {
                                    var1 = switch (var1) {
                                        default -> var1 ^ -1936858715;
                                        case -232782002 -> var1 ^ 1541694987;
                                        case 832547218 -> {
                                            var1 &= -1727679589;
                                            var1 |= 1002478512;
                                            var1 *= -853021289;
                                            yield var1 ^ 1293170964;
                                        }
                                    };
                                    var10 = var1;
                                    if (var10 == null) {
                                        break label548;
                                    }

                                    var1 &= 388558418;
                                    var1 ^= -15320442;
                                } else {
                                    var1 <<= 22;
                                    var1 += 774183144;
                                    var1 <<= 20;
                                    var1 ^= 1258057836;
                                    long var531 = var1;
                                    long var12 = var531 + 1L;
                                    var12 = var531 * var12;
                                    long var14 = var531 + 2L;
                                    var12 *= var14;
                                    long var532 = var531 + 3L;
                                    var12 *= var532;
                                    long var533 = var12 & 7L;
                                    long var647;
                                    int var534 = (var647 = var533 - 0L) == 0L ? 0 : (var647 < 0L ? -1 : 1);
                                    if (var534 != 0) {
                                        break label548;
                                    }

                                    Pattern var535 = V;
                                    Matcher var536 = var535.matcher(var515);
                                    Matcher var537 = var536;
                                    byte var551 = 0;
                                    int var570 = var2 + 1;
                                    int var571 = var2 * var570;
                                    int var13 = var2 + 2;
                                    int var572 = var571 * var13;
                                    var13 = var2 + 3;
                                    int var573 = var572 * var13;
                                    int var574 = var573 & 7;
                                    if (var574 != 0) {
                                        var1 |= 218749728;
                                        var1 ^= 899913840;
                                        break label546;
                                    }

                                    var1 *= 2098706661;
                                    var1 ^= -692878172;
                                    Integer var575 = var1;
                                    if (var575 == null) {
                                        break label548;
                                    }

                                    ArrayList var576 = new ArrayList(2);
                                    ArrayList var577 = var576;
                                    int var552 = var551;
                                    var1 <<= 7;
                                    var1 ^= -1821938604;

                                    label500:
                                    while (true) {
                                        Integer var589 = var1;
                                        if (var589 == null) {
                                            break label548;
                                        }

                                        boolean var590 = var537.lookingAt();
                                        int var609 = var2 + 1;
                                        int var610 = var2 * var609;
                                        int var15 = var2 + 2;
                                        int var611 = var610 * var15;
                                        var15 = var2 + 3;
                                        int var612 = var611 * var15;
                                        int var613 = var612 & 7;
                                        if (var613 != 0) {
                                            var1 <<= 11;
                                            var1 ^= 324846364;
                                            break label546;
                                        }

                                        var1 |= -599830383;
                                        var1 <<= 29;
                                        var1 <<= 23;
                                        var1 ^= -237922920;
                                        int var614 = var1 + 1;
                                        int var615 = var1 * var614;
                                        var15 = var1 + 2;
                                        int var616 = var615 * var15;
                                        var15 = var1 + 3;
                                        int var617 = var616 * var15;
                                        int var618 = var617 & 7;
                                        if (var618 != 0) {
                                            break label548;
                                        }

                                        if (!var590) {
                                            var1 ^= 713254517;
                                            var1 ^= 2085223684;
                                            var1 >>= 29;
                                            var1 ^= 653592493;
                                            int var538 = (var577.isEmpty()) ? 1 : 0;
                                            long var598 = var2;
                                            long var633 = var598 + 1L;
                                            long var634 = var598 * var633;
                                            long var17 = var598 + 2L;
                                            long var635 = var634 * var17;
                                            long var599 = var598 + 3L;
                                            long var636 = var635 * var599;
                                            long var600 = var636 & 7L;
                                            long var648;
                                            int var601 = (var648 = var600 - 0L) == 0L ? 0 : (var648 < 0L ? -1 : 1);
                                            if (var601 != 0) {
                                                var1 *= -1297694159;
                                                var1 ^= -2013772724;
                                                break label546;
                                            }
                                            var1 = switch (var1) {
                                                default -> var1 ^ -329391269;
                                                case -653592496 -> {
                                                    var1 += 956278082;
                                                    var1 *= 1959441159;
                                                    var1 *= -355826529;
                                                    yield var1 ^ 320394856;
                                                }
                                                case 1851291208 -> var1 ^ 1189451163;
                                            };
                                            Integer var602 = var1;
                                            if (var602 == null) {
                                                break label548;
                                            }

                                            if (var538 != 0) {
                                                var1 += -1260069035;
                                                var1 -= -1407208324;
                                                var1 ^= -1619991992;
                                                var1 |= -897260489;
                                                var1 ^= 1697668528;
                                                var1 ^= 1499113550;
                                                var1 ^= 514031045;
                                                break;
                                            } else {
                                                var1 = switch (var1) {
                                                    case -1960334839 -> var1 ^ -825530913;
                                                    case -1930795094 -> {
                                                        var1 ^= -1895447497;
                                                        var1 &= 2056775699;
                                                        var1 += 1154505606;
                                                        var1 |= -503363162;
                                                        yield var1 ^ -1932554113;
                                                    }
                                                    default -> var1 ^ 275276168;
                                                };
                                                long var603 = var1;
                                                long var637 = var603 + 1L;
                                                long var638 = var603 * var637;
                                                long var604 = var638 & 1L;
                                                long var649;
                                                var538 = (var649 = var604 - 0L) == 0L ? 0 : (var649 < 0L ? -1 : 1);
                                                if (var538 != 0) {
                                                    break label548;
                                                }

                                                Pattern var540 = wL;
                                                int var605 = var2 + 1;
                                                var605 = var2 * var605;
                                                var605 &= 1;
                                                if (var605 != 0) {
                                                    var1 *= -1314109517;
                                                    var1 ^= -1335589096;
                                                    var1 ^= 1307090709;
                                                    var1 ^= 374190025;
                                                    break label546;
                                                }

                                                var1 |= -1104369395;
                                                var1 += 893548009;
                                                var1 <<= 2;
                                                var1 ^= -1574353978;
                                                String var517 = var516.substring(var552);
                                                Matcher var518 = var540.matcher(var517);
                                                String var519 = var518.replaceAll("");
                                                String var520 = var519.strip();
                                                String var521 = var520.replaceAll("\\s{2,}", " ");
                                                String var522 = var521;
                                                Iterator var541 = var577.iterator();
                                                Iterator var542 = var541;
                                                var1 >>>= 6;
                                                var1 <<= 28;
                                                var1 ^= 954900501;

                                                while (true) {
                                                    boolean var553 = var542.hasNext();
                                                    var12 = var2;
                                                    var14 = var12 + 1L;
                                                    var14 = var12 * var14;
                                                    long var642 = var12 + 2L;
                                                    var14 *= var642;
                                                    var12 += 3L;
                                                    var14 *= var12;
                                                    var12 = var14 & 7L;
                                                    long var650;
                                                    int var581 = (var650 = var12 - 0L) == 0L ? 0 : (var650 < 0L ? -1 : 1);
                                                    if (var581 != 0) {
                                                        var1 += 1204528173;
                                                        var1 >>= 24;
                                                        var1 ^= 119643356;
                                                        break label546;
                                                    }

                                                    var1 += -684568918;
                                                    var1 ^= 1020861883;
                                                    if (!var553) {
                                                        var1 &= -1900805848;
                                                        var1 &= -1480892592;
                                                        var1 *= 1555523669;
                                                        var1 ^= -570545724;
                                                        break label500;
                                                    }
                                                    var1 = switch (var1) {
                                                        case -1714432500 -> var1 ^ -30116863;
                                                        default -> var1 ^ -1460790809;
                                                        case 1824912132 -> {
                                                            var1 >>>= 27;
                                                            var1 &= -1370913265;
                                                            var1 += -1613245526;
                                                            yield var1 ^ 1244150268;
                                                        }
                                                    };
                                                    int var554 = var1 + 1;
                                                    int var555 = var1 * var554;
                                                    int var582 = var1 + 2;
                                                    int var556 = var555 * var582;
                                                    int var583 = var1 + 3;
                                                    int var557 = var556 * var583;
                                                    int var558 = var557 & 7;
                                                    if (var558 != 0) {
                                                        break label548;
                                                    }

                                                    Object var559 = var542.next();
                                                    Long var560 = (Long)var559;
                                                    long var561 = var560;
                                                    var561 -= var5;
                                                    var561 = Math.max(0L, var561);
                                                    hP_2 var608 = new hP_2(var561, var522);
                                                    Integer var564 = var2;
                                                    if (var564 == null) {
                                                        var1 *= -1432307757;
                                                        var1 ^= 2006440909;
                                                        break label546;
                                                    }

                                                    var1 |= -1481733685;
                                                    var1 |= 1097640768;
                                                    var1 &= -494192371;
                                                    var1 ^= 448766768;
                                                    Integer var565 = var1;
                                                    if (var565 == null) {
                                                        break label548;
                                                    }

                                                    boolean var566 = var349.add(var608);
                                                    switch (var1) {
                                                        case -1047468721:
                                                        default:
                                                            var1 ^= 1748855355;
                                                            break;
                                                        case -130774471:
                                                            var1 <<= 22;
                                                            var1 &= -113907777;
                                                            var1 ^= 1411393354;
                                                            var1 ^= -1530230945;
                                                            break;
                                                        case 770386439:
                                                            var1 ^= 1032199656;
                                                    }
                                                }
                                            }
                                        }
                                        var1 = switch (var1) {
                                            case -237922920 -> {
                                                var1 &= 1146285222;
                                                yield var1 ^ -1860627011;
                                            }
                                            default -> var1 ^ -1713342983;
                                            case 75263537 -> var1 ^ 1582744851;
                                        };
                                        int var591 = var1 | -421666483;
                                        var591 -= -2078656299;
                                        var591 ^= -126004739;
                                        long var594 = B(var537, var591);
                                        Long var595 = var594;
                                        int var596 = var577.add(var595) ? 1 : 0;
                                        var596 = var537.end();
                                        var14 = var2;
                                        long var16 = var14 + 1L;
                                        var16 = var14 * var16;
                                        long var18 = var14 + 2L;
                                        var16 *= var18;
                                        var14 += 3L;
                                        var16 *= var14;
                                        var14 = var16 & 7L;
                                        long var651;
                                        int var622 = (var651 = var14 - 0L) == 0L ? 0 : (var651 < 0L ? -1 : 1);
                                        if (var622 != 0) {
                                            var1 -= 168650782;
                                            var1 *= 678259043;
                                            var1 -= 716388015;
                                            var1 ^= 276759634;
                                            break label546;
                                        }

                                        var1 |= 855103552;
                                        var1 &= 2019373901;
                                        var1 |= -2624878;
                                        var1 ^= 1465388944;
                                        int var623 = var516.length();
                                        Matcher var624 = var537.region(var596, var623);
                                        var552 = var596;
                                        switch (var1) {
                                            case -1467483057:
                                                var1 &= -1836169557;
                                                var1 ^= -1556401057;
                                                break;
                                            case 18871968:
                                            default:
                                                var1 ^= -1568385343;
                                                break;
                                            case 1762896886:
                                                var1 ^= -495979698;
                                        }
                                    }
                                }

                                int var523 = var1 + 1;
                                int var524 = var1 * var523;
                                int var544 = var1 + 2;
                                int var525 = var524 * var544;
                                var544 = var1 + 3;
                                int var526 = var525 * var544;
                                int var527 = var526 & 7;
                                if (var527 != 0) {
                                    break label548;
                                }

                                int var528 = var497 + 1;
                                Integer var546 = var2;
                                if (var546 == null) {
                                    switch (var1) {
                                        case -401179452:
                                            var1 *= 1293477237;
                                            var1 += 2126847576;
                                            var1 >>>= 5;
                                            var1 ^= -1940307069;
                                            var1 ^= 1982798624;
                                            break label546;
                                        case 897268886:
                                            var1 ^= -2028480605;
                                            break label546;
                                        case 1044814626:
                                        default:
                                            var1 ^= 616376474;
                                            break label546;
                                    }
                                }
                                var1 = switch (var1) {
                                    case -401179452 -> {
                                        var1 >>= 25;
                                        var1 >>>= 21;
                                        var1 -= -1071269367;
                                        var1 ^= -104386408;
                                        yield var1 ^ -516755029;
                                    }
                                    case -174565778 -> var1 ^ -1596471173;
                                    default -> var1 ^ 1468008437;
                                };
                                long var547 = var1;
                                long var584 = var547 + 1L;
                                var584 = var547 * var584;
                                long var629 = var547 + 2L;
                                var584 *= var629;
                                long var548 = var547 + 3L;
                                var584 *= var548;
                                long var549 = var584 & 7L;
                                long var652;
                                int var550 = (var652 = var549 - 0L) == 0L ? 0 : (var652 < 0L ? -1 : 1);
                                if (var550 != 0) {
                                    break label548;
                                }

                                var497 = var528;
                                switch (var1) {
                                    case -704118619:
                                        var1 ^= -758410148;
                                        break;
                                    case 657427653:
                                        var1 *= -26840479;
                                        var1 |= -1719215998;
                                        var1 *= 2045253049;
                                        var1 ^= -2084540573;
                                        break;
                                    case 783711431:
                                    default:
                                        var1 ^= -861093813;
                                }
                            }

                            var1 ^= 69559349;
                            var1 -= 1013056937;
                            var1 -= -10039244;
                            var1 ^= -1659298712;
                            Integer var361 = var1;
                            if (var361 == null) {
                                break label548;
                            }

                            boolean var362 = var349.isEmpty();
                            int var388 = var2 + 1;
                            int var389 = var2 * var388;
                            int var423 = var2 + 2;
                            int var390 = var389 * var423;
                            var423 = var2 + 3;
                            int var391 = var390 * var423;
                            int var392 = var391 & 7;
                            if (var392 != 0) {
                                var1 ^= 157265910;
                                var1 ^= 1648665502;
                                break label546;
                            }

                            var1 ^= 889321565;
                            var1 ^= -1488225267;
                            if (var362) {
                                var1 &= -19966100;
                                var1 ^= 2144410332;
                                var1 <<= 2;
                                var1 |= 844432461;
                                var1 ^= -1984094090;
                                var361 = var1;
                                if (var361 != null) {
                                    return null;
                                }
                                break label548;
                            }
                            var1 = switch (var1) {
                                case -1936870480 -> var1 ^ 2031643515;
                                case 26209060 -> {
                                    var1 &= -1200334302;
                                    var1 |= -22260057;
                                    var1 -= -434514788;
                                    yield var1 ^ 1035719597;
                                }
                                default -> var1 ^ -1189020273;
                            };
                            int var363 = var1 + 1;
                            var363 = var1 * var363;
                            var363 &= 1;
                            if (var363 != 0) {
                                break label548;
                            }

                            ToLongFunction<hP_2> var366 = hP_2::startMs;
                            var5 = var2;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var9 = var5 + 2L;
                            var7 *= var9;
                            var5 += 3L;
                            var7 *= var5;
                            var5 = var7 & 7L;
                            long var653;
                            int var396 = (var653 = var5 - 0L) == 0L ? 0 : (var653 < 0L ? -1 : 1);
                            if (var396 != 0) {
                                var1 *= 1614598459;
                                var1 ^= 1836993630;
                                break label546;
                            }

                            var1 *= -1425217603;
                            var1 ^= 1437709800;
                            var1 |= -520446575;
                            var1 *= 645389415;
                            var1 ^= -1884695934;
                            int var397 = var1 + 1;
                            int var398 = var1 * var397;
                            int var399 = var398 & 1;
                            if (var399 != 0) {
                                break label548;
                            }

                            Comparator var367 = Comparator.comparingLong(var366);
                            var349.sort(var367);
                            int var400 = var349.size();
                            ArrayList var368 = new ArrayList(var400);
                            ArrayList var369 = var368;
                            Iterator var350 = var349.iterator();
                            Iterator var351 = var350;

                            var1 = switch (var1) {
                                case -837659511 -> var1 ^ 1487102717;
                                default -> var1 ^ 704484549;
                                case 2083078371 -> {
                                    var1 -= 782053046;
                                    var1 -= -188996203;
                                    var1 ^= 2084270621;
                                    var1 *= 1559811093;
                                    yield var1 ^ 1379142695;
                                }
                            };

                            while (true) {
                                boolean var401 = var351.hasNext();
                                var423 = var2 + 1;
                                var423 = var2 * var423;
                                var423 &= 1;
                                if (var423 == 0) {
                                    var1 &= -1536344479;
                                    var1 |= -1464590373;
                                    var1 ^= -1444798990;
                                    Integer var428 = var1;
                                    if (var428 == null) {
                                        break label548;
                                    }

                                    if (var401) {
                                        var1 |= 942357604;
                                        var1 ^= 2131902980;
                                        var5 = var1;
                                        var7 = var5 + 1L;
                                        var7 = var5 * var7;
                                        var9 = var5 + 2L;
                                        var7 *= var9;
                                        var5 += 3L;
                                        var7 *= var5;
                                        var5 = var7 & 7L;
                                        long var654;
                                        int var417 = (var654 = var5 - 0L) == 0L ? 0 : (var654 < 0L ? -1 : 1);
                                        if (var417 != 0) {
                                            break label548;
                                        }

                                        Object var418 = var351.next();
                                        hP_2 var419 = (hP_2)var418;
                                        var428 = var2;
                                        if (var428 == null) {
                                            var1 ^= -497051339;
                                            var1 -= 1390201729;
                                            var1 *= -1778811405;
                                            var1 |= -434095179;
                                            var1 ^= 111352041;
                                            break label546;
                                        }

                                        label468: {
                                            var1 *= -1827153241;
                                            var1 *= -140262421;
                                            var1 ^= -1787384833;
                                            boolean var432 = var369.isEmpty();
                                            if (!var432) {
                                                var1 -= 1421446090;
                                                var1 |= 1087001588;
                                                var1 ^= -2062226270;
                                                int var433 = var369.size();
                                                Object var435 = var369.get(--var433);
                                                int var482 = var2 + 1;
                                                int var483 = var2 * var482;
                                                var497 = var2 + 2;
                                                int var484 = var483 * var497;
                                                var497 = var2 + 3;
                                                int var485 = var484 * var497;
                                                int var486 = var485 & 7;
                                                if (var486 != 0) {
                                                    switch (var1) {
                                                        case -1942702344:
                                                        default:
                                                            var1 ^= 1975663106;
                                                            break label546;
                                                        case 1108724751:
                                                            var1 ^= -821192559;
                                                            break label546;
                                                        case 1809563478:
                                                            var1 |= 1853107793;
                                                            var1 -= 1503522760;
                                                            var1 ^= -289428333;
                                                            break label546;
                                                    }
                                                }
                                                var1 = switch (var1) {
                                                    default -> var1 ^ -189897430;
                                                    case 1268528395 -> var1 ^ 300417930;
                                                    case 1809563478 -> {
                                                        var1 += 370103122;
                                                        var1 >>>= 31;
                                                        var1 += -522702231;
                                                        var1 ^= -565878671;
                                                        yield var1 ^ -1645615881;
                                                    }
                                                };
                                                hP_2 var436 = (hP_2)var435;
                                                boolean var437 = var436.isBreak();
                                                if (!var437) {
                                                    var1 |= 1108142546;
                                                    var1 *= -785215769;
                                                    var1 |= 2125284630;
                                                    var1 += -2116507565;
                                                    var1 ^= -1039797147;
                                                    var438 = false;
                                                    switch (var1) {
                                                        case -1326229827:
                                                            var1 ^= 1498774839;
                                                            break label468;
                                                        case 1084765922:
                                                        default:
                                                            var1 ^= -1474182624;
                                                            break label468;
                                                        case 1136884716:
                                                            var1 <<= 21;
                                                            var1 |= -300427385;
                                                            var1 ^= -962616799;
                                                            var1 ^= -209668665;
                                                            break label468;
                                                    }
                                                }

                                                var1 ^= -897392257;
                                                var1 -= -2130953101;
                                                var1 ^= -226116381;
                                                var1 ^= 611400738;
                                                var1 ^= 270649647;
                                            } else {
                                                var1 += -508906977;
                                                var1 ^= 182197319;
                                            }

                                            var438 = true;
                                            var1 *= -465350177;
                                            var1 ^= -1830908141;
                                        }

                                        int var487 = var1 + 1;
                                        int var488 = var1 * var487;
                                        int var489 = var488 & 1;
                                        if (var489 != 0) {
                                            break label548;
                                        }

                                        boolean var490 = var419.isBreak();
                                        var497 = var2 + 1;
                                        var497 = var2 * var497;
                                        var497 &= 1;
                                        if (var497 != 0) {
                                            var1 *= 10885927;
                                            var1 ^= -19141925;
                                            break label546;
                                        }

                                        var1 ^= 1076799326;
                                        var1 ^= -1402548254;
                                        var497 = var1 + 1;
                                        var497 = var1 * var497;
                                        var497 &= 1;
                                        if (var497 != 0) {
                                            break label548;
                                        }

                                        if (var490) {
                                            var1 *= 2060170415;
                                            var1 <<= 15;
                                            var1 |= -1938834452;
                                            var1 ^= -946548081;
                                            Integer var491 = var1;
                                            if (var491 == null) {
                                                break label548;
                                            }

                                            if (var438) {
                                                var1 += 989371651;
                                                var1 &= -817221105;
                                                var1 *= -1236093369;
                                                var1 ^= 483988410;
                                                int var439 = var1 + 1;
                                                var439 = var1 * var439;
                                                int var492 = var1 + 2;
                                                var439 *= var492;
                                                int var493 = var1 + 3;
                                                var439 *= var493;
                                                var439 &= 7;
                                                if (var439 != 0) {
                                                    break label548;
                                                }

                                                var1 += 990791971;
                                                var1 |= -1286193298;
                                                var1 ^= 1573722033;
                                                continue;
                                            }

                                            var1 ^= 1678432461;
                                            var1 |= 924301203;
                                            var1 -= 2003987231;
                                            var1 ^= -2132642976;
                                        } else {
                                            switch (var1) {
                                                case -2105604019:
                                                    var1 ^= -824732483;
                                                    break;
                                                case 442645804:
                                                default:
                                                    var1 ^= 179124651;
                                                    break;
                                                case 650160349:
                                                    var1 -= -1788940280;
                                                    var1 >>= 14;
                                                    var1 ^= 1998158406;
                                            }
                                        }

                                        int var444 = var1 + 1;
                                        var444 = var1 * var444;
                                        var444 &= 1;
                                        if (var444 != 0) {
                                            break label548;
                                        }

                                        boolean var420 = var369.add(var419);
                                        var1 += 60763854;
                                        var1 ^= -1280188040;
                                        var1 *= 1770462017;
                                        var1 ^= 270489528;
                                        continue;
                                    }
                                    var1 = switch (var1) {
                                        default -> var1 ^ 1232763655;
                                        case 23011881 -> {
                                            var1 *= 1550181703;
                                            var1 >>>= 16;
                                            yield var1 ^ -221314602;
                                        }
                                        case 730924463 -> var1 ^ 327909149;
                                    };
                                    var5 = var1;
                                    var7 = var5 + 1L;
                                    var7 = var5 * var7;
                                    var9 = var5 + 2L;
                                    var7 *= var9;
                                    var5 += 3L;
                                    var7 *= var5;
                                    var5 = var7 & 7L;
                                    long var655;
                                    int var352 = (var655 = var5 - 0L) == 0L ? 0 : (var655 < 0L ? -1 : 1);
                                    if (var352 != 0) {
                                        break label548;
                                    }

                                    boolean var353 = var369.isEmpty();
                                    var5 = var2;
                                    var7 = var5 + 1L;
                                    var7 = var5 * var7;
                                    var9 = var5 + 2L;
                                    var7 *= var9;
                                    var5 += 3L;
                                    var7 *= var5;
                                    var5 = var7 & 7L;
                                    long var656;
                                    int var408 = (var656 = var5 - 0L) == 0L ? 0 : (var656 < 0L ? -1 : 1);
                                    if (var408 == 0) {
                                        var1 ^= -1672145358;
                                        var1 ^= -1401148546;
                                        Za var355;
                                        if (var353) {
                                            var1 ^= -2069733091;
                                            var1 ^= -979365280;
                                            var1 &= 637714399;
                                            var1 ^= -937736162;
                                            var1 ^= 2046918127;
                                            Integer var354 = var1;
                                            if (var354 == null) {
                                                break label548;
                                            }

                                            var355 = null;
                                            switch (var1) {
                                                case -1340437720:
                                                    var1 ^= 2124432318;
                                                    var1 >>= 20;
                                                    var1 |= 1747897958;
                                                    var1 |= -1843841095;
                                                    var1 ^= -195308127;
                                                    break;
                                                case -1186645742:
                                                default:
                                                    var1 ^= -1056819300;
                                                    break;
                                                case 1315922156:
                                                    var1 ^= -1151597964;
                                            }
                                        } else {
                                            var1 -= 1338581690;
                                            var1 ^= -411831100;
                                            var5 = var1;
                                            var7 = var5 + 1L;
                                            var7 = var5 * var7;
                                            var5 = var7 & 1L;
                                            long var657;
                                            int var411 = (var657 = var5 - 0L) == 0L ? 0 : (var657 < 0L ? -1 : 1);
                                            if (var411 != 0) {
                                                break label548;
                                            }

                                            Za var370 = Za.ls(var369);
                                            int var412 = var2 + 1;
                                            int var413 = var2 * var412;
                                            var2 = var413 & 1;
                                            if (var2 != 0) {
                                                var1 += 1315903933;
                                                var1 &= -594303016;
                                                var1 ^= 944751828;
                                                break label546;
                                            }
                                            var1 = switch (var1) {
                                                case -1804689906 -> {
                                                    var1 ^= 403741254;
                                                    var1 += -935052435;
                                                    yield var1 ^ -1660400170;
                                                }
                                                case -1752369337 -> var1 ^ 429495162;
                                                default -> var1 ^ 1580373389;
                                            };
                                            Integer var329 = var1;
                                            if (var329 == null) {
                                                break label548;
                                            }

                                            var355 = var370;
                                            var1 -= 652034638;
                                            var1 += 71742860;
                                            var1 += 2073482509;
                                            var1 *= -205512431;
                                            var1 ^= -1784481328;
                                        }

                                        long var371 = var1;
                                        long var429 = var371 + 1L;
                                        long var430 = var371 * var429;
                                        long var372 = var430 & 1L;
                                        long var658;
                                        var2 = (var658 = var372 - 0L) == 0L ? 0 : (var658 < 0L ? -1 : 1);
                                        if (var2 == 0) {
                                            return var355;
                                        }
                                        break label548;
                                    }

                                    var1 -= -1362799663;
                                    var1 ^= -1126940693;
                                    break label546;
                                }

                                var1 -= 120840384;
                                var1 *= -754109233;
                                var1 -= -1375277701;
                                var1 ^= -1064612149;
                                break label546;
                            }
                        }

                        var1 >>>= 16;
                        var1 -= 653064874;
                        var1 ^= 1106932214;
                    } else {
                        var1 ^= -1785662768;
                        var1 &= -1613412654;
                        var1 *= 167141661;
                        var1 += -175203183;
                        var1 ^= -30386115;
                    }

                    Integer var323 = var1;
                    if (var323 != null) {
                        return null;
                    }
                    break label548;
                }
            }

            IllegalStateException var331 = new IllegalStateException();
            throw var331;
        }

        IllegalArgumentException var324 = new IllegalArgumentException();
        throw var324;
    }

    private static long B(Matcher var0, int var1) {
        label130: {
            int var3 = System.identityHashCode(var0);
            String var4 = var0.group(1);
            long var95 = Long.parseLong(var4);
            Integer var6 = var3;
            if (var6 == null) {
                int var2 = var1 & -1092115896;
                var2 |= -1241180997;
                var2 *= 1145213301;
                var2 ^= 2114931581;
            } else {
                label132: {
                    int var24 = var1 ^ -2032021813;
                    var24 ^= -1542780040;
                    long var97 = var24;
                    long var8 = var97 + 1L;
                    var8 = var97 * var8;
                    long var10 = var97 + 2L;
                    var8 *= var10;
                    long var98 = var97 + 3L;
                    var8 *= var98;
                    long var99 = var8 & 7L;
                    long var168;
                    int var100 = (var168 = var99 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                    if (var100 != 0) {
                        break label130;
                    }

                    String var101 = var0.group(2);
                    long var102 = Long.parseLong(var101);
                    var8 = 0L;
                    String var116 = var0.group(3);
                    long var136;
                    if (var116 != null) {
                        var24 &= 834182973;
                        var24 ^= 1048605400;
                        long var11 = Long.parseLong(var116);
                        var136 = var3;
                        long var15 = var136 + 1L;
                        var15 = var136 * var15;
                        var136 = var15 & 1L;
                        long var169;
                        int var128 = (var169 = var136 - 0L) == 0L ? 0 : (var169 < 0L ? -1 : 1);
                        if (var128 != 0) {
                            switch (var24) {
                                case 335802363:
                                    var24 ^= 1288034497;
                                    break label132;
                                case 529563388:
                                    var24 *= -399468211;
                                    var24 ^= 55076614;
                                    break label132;
                                case 1208701001:
                                default:
                                    var24 ^= -104873040;
                                    break label132;
                            }
                        }

                        var24 >>= 27;
                        var24 *= 391932997;
                        var24 *= -1070059037;
                        var24 ^= -1365699066;
                        var136 = var24;
                        var15 = var136 + 1L;
                        var15 = var136 * var15;
                        long var17 = var136 + 2L;
                        var15 *= var17;
                        var136 += 3L;
                        var15 *= var136;
                        var136 = var15 & 7L;
                        long var170;
                        int var132 = (var170 = var136 - 0L) == 0L ? 0 : (var170 < 0L ? -1 : 1);
                        if (var132 != 0) {
                            break label130;
                        }

                        int var133 = var116.length();
                        if (var133 == 1) {
                            var24 = switch (var24) {
                                case -1644337339 -> var24 ^ 1851900605;
                                default -> var24 ^ 37290653;
                                case 718713995 -> {
                                    var24 -= 1746606026;
                                    yield var24 ^ -529208697;
                                }
                            };
                            Integer var134 = var24;
                            if (var134 == null) {
                                break label130;
                            }

                            var136 = var11 * 100L;
                            Integer var142 = var3;
                            if (var142 == null) {
                                var24 += -564601701;
                                var24 -= -322094070;
                                var24 ^= 512343069;
                                break label132;
                            }

                            var24 -= -148412908;
                            var24 *= -1295007477;
                            var24 >>>= 1;
                            var24 ^= 155447516;
                            var15 = var24;
                            var17 = var15 + 1L;
                            var17 = var15 * var17;
                            var15 = var17 & 1L;
                            long var171;
                            int var145 = (var171 = var15 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                            if (var145 != 0) {
                                break label130;
                            }

                            var136 = var136;
                            var24 -= 750389200;
                            var24 ^= 2000640913;
                            var24 ^= -562073604;
                        } else {
                            var24 = switch (var24) {
                                case 718713995 -> {
                                    var24 &= 1293259919;
                                    var24 *= 535514867;
                                    yield var24 ^ 1087241661;
                                }
                                default -> var24 ^ 26913590;
                                case 1436506685 -> var24 ^ -1459183829;
                            };
                            var15 = var24;
                            var17 = var15 + 1L;
                            var17 = var15 * var17;
                            long var19 = var15 + 2L;
                            var17 *= var19;
                            var15 += 3L;
                            var17 *= var15;
                            var15 = var17 & 7L;
                            long var172;
                            int var149 = (var172 = var15 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                            if (var149 != 0) {
                                break label130;
                            }

                            int var117 = var116.length();
                            int var150 = var3 + 1;
                            int var151 = var3 * var150;
                            int var16 = var3 + 2;
                            int var152 = var151 * var16;
                            var16 = var3 + 3;
                            int var153 = var152 * var16;
                            int var154 = var153 & 7;
                            if (var154 != 0) {
                                switch (var24) {
                                    case -197531439:
                                    default:
                                        var24 ^= 236210805;
                                        break label132;
                                    case 763266682:
                                        var24 ^= -832713502;
                                        break label132;
                                    case 1638507596:
                                        var24 &= -1919333876;
                                        var24 >>>= 4;
                                        var24 ^= 181025482;
                                        break label132;
                                }
                            }

                            var24 |= 1262119394;
                            var24 ^= -1919007627;
                            Integer var155 = var24;
                            if (var155 == null) {
                                break label130;
                            }

                            if (var117 == 2) {
                                var24 |= 819732517;
                                var24 >>= 14;
                                var24 >>>= 5;
                                var24 ^= -61252630;
                                Integer var118 = var24;
                                if (var118 == null) {
                                    break label130;
                                }

                                var15 = var11 * 10L;
                                var17 = var3;
                                var19 = var17 + 1L;
                                var19 = var17 * var19;
                                var17 = var19 & 1L;
                                long var173;
                                int var119 = (var173 = var17 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                                if (var119 != 0) {
                                    var24 += 820815533;
                                    var24 ^= 641851688;
                                    break label132;
                                }

                                var24 |= 1645080869;
                                var24 ^= 1622494385;
                                var136 = var15;
                                var24 <<= 2;
                                var24 += -470201454;
                                var24 &= 1700308961;
                                var24 += -1129398570;
                                var24 ^= 1373466340;
                            } else {
                                var24 -= -191138152;
                                var24 ^= 1371565841;
                                var24 ^= 403428316;
                                int var120 = var24 + 1;
                                int var121 = var24 * var120;
                                int var122 = var121 & 1;
                                if (var122 != 0) {
                                    break label130;
                                }

                                var136 = var11;
                                switch (var24) {
                                    case -1203662898:
                                        var24 += 1637814657;
                                        var24 >>= 18;
                                        var24 ^= -1389131542;
                                        break;
                                    case -511580230:
                                    default:
                                        var24 ^= -1094085145;
                                        break;
                                    case 1389915697:
                                        var24 ^= -950491949;
                                }
                            }
                        }
                    } else {
                        var24 *= 1343343653;
                        var24 ^= -1179326165;
                        Integer var123 = var24;
                        if (var123 == null) {
                            break label130;
                        }

                        var136 = var8;
                        var24 -= -933582613;
                        var24 -= -299533926;
                        var24 ^= -1238333694;
                    }

                    int var107 = var24 + 1;
                    int var108 = var24 * var107;
                    int var109 = var108 & 1;
                    if (var109 != 0) {
                        break label130;
                    }

                    long var96 = var95 * 60000L;
                    var8 = var3;
                    var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var174;
                    var3 = (var174 = var8 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var24 |= 1054265567;
                        var24 ^= -5395026;
                        var24 &= 1681626513;
                        var24 ^= -820656842;
                        long var86 = var24;
                        var8 = var86 + 1L;
                        var8 = var86 * var8;
                        var10 = var86 + 2L;
                        var8 *= var10;
                        long var87 = var86 + 3L;
                        var8 *= var87;
                        long var88 = var8 & 7L;
                        long var175;
                        var24 = (var175 = var88 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                        if (var24 == 0) {
                            long var90 = var102 * 1000L;
                            long var91 = var96 + var90;
                            return var91 + var136;
                        }
                        break label130;
                    }

                    var24 -= -1408361573;
                    var24 >>>= 24;
                    var24 ^= 181578443;
                }
            }

            IllegalStateException var94 = new IllegalStateException();
            throw var94;
        }

        UnsupportedOperationException var92 = new UnsupportedOperationException();
        throw var92;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1878012404;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        mc = var4;
        Pattern var5 = Pattern.compile("\\[(\\d{1,3}):(\\d{1,2})(?:[.:](\\d{1,3}))?]");
        V = var5;
        Pattern var6 = Pattern.compile("\\[offset:\\s*([+-]?\\d+)\\s*]", 2);
        LX = var6;
        Pattern var7 = Pattern.compile("<\\d{1,3}:\\d{1,2}(?:[.:]\\d{1,3})?>");
        wL = var7;
    }
}
