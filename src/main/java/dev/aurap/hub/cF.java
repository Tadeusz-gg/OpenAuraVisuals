package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.Locale;

public final class cF {
    public static final int rz;

    private cF() {
    }

    public static wJ q(KI var0, String var1, String var2, String var3, long var4, vW var6, ZH var7) {
        boolean var374 = false;
        Object var378 = null;
        String var391 = null;
        String var437 = null;
        String var449 = null;
        label593: {
            int var30;
            var30 = rz;
            var30 ^= 1670114311;
            int var9 = System.identityHashCode(var0);
            long var10 = var9;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            var10 = var12 & 1L;
            long var615;
            int var362 = (var615 = var10 - 0L) == 0L ? 0 : (var615 < 0L ? -1 : 1);
            int var11 = of_2.l;
            var30 ^= var11;
            var30 ^= 1720137465;
            of_2.l = 1720137465;
            var11 = of_2.U;
            var30 ^= var11;
            var30 ^= -104329307;
            of_2.U = -104329307;
            label565:
            if (var362 == 0) {
                var30 = switch (var30) {
                    case -1882847029 -> var30 ^ 630083769;
                    case -1452473071 -> {
                        var30 &= 1819001983;
                        yield var30 ^ -1250301449;
                    }
                    default -> var30 ^ 498168166;
                };
                var10 = var30;
                var12 = var10 + 1L;
                var12 = var10 * var12;
                long var14 = var10 + 2L;
                var12 *= var14;
                var10 += 3L;
                var12 *= var10;
                var10 = var12 & 7L;
                long var616;
                int var366 = (var616 = var10 - 0L) == 0L ? 0 : (var616 < 0L ? -1 : 1);
                if (var366 != 0) {
                    break label593;
                }

                label561: {
                    if (var2 != null) {
                        var30 >>= 5;
                        var30 *= -1664430941;
                        var30 >>>= 3;
                        var30 ^= -699168262;
                        var10 = var30;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var617;
                        int var370 = (var617 = var10 - 0L) == 0L ? 0 : (var617 < 0L ? -1 : 1);
                        if (var370 != 0) {
                            break label593;
                        }

                        Locale var371 = Locale.ROOT;
                        String var372 = var2.toLowerCase(var371);
                        Integer var380 = var9;
                        if (var380 == null) {
                            var30 &= 1559672560;
                            var30 ^= 1105604206;
                            break label565;
                        }

                        var30 >>>= 24;
                        var30 >>= 8;
                        var30 |= 2006804559;
                        var30 ^= -1134469232;
                        long var381 = var30;
                        long var13 = var381 + 1L;
                        var13 = var381 * var13;
                        long var382 = var13 & 1L;
                        long var618;
                        int var383 = (var618 = var382 - 0L) == 0L ? 0 : (var618 < 0L ? -1 : 1);
                        if (var383 != 0) {
                            break label593;
                        }

                        boolean var373 = var372.startsWith("pl");
                        if (var373) {
                            var30 <<= 25;
                            var30 ^= -1007961105;
                            var374 = true;
                            switch (var30) {
                                case -1408481015:
                                default:
                                    var30 ^= -1687128972;
                                    break label561;
                                case -834984560:
                                    var30 ^= 350476816;
                                    break label561;
                                case 2112601071:
                                    var30 >>= 7;
                                    var30 *= 700443197;
                                    var30 ^= -63785520;
                                    var30 ^= 530426437;
                                    break label561;
                            }
                        }

                        var30 *= 309700851;
                        var30 ^= -1248980575;
                    } else {
                        var30 &= -442110155;
                        var30 += 1274550866;
                        var30 ^= 1366565173;
                        var30 ^= 1878873935;
                    }

                    var374 = false;
                    var30 >>>= 7;
                    var30 -= -1555659395;
                    var30 *= 221247573;
                    var30 ^= 621818439;
                }

                Integer var384 = var30;
                if (var384 == null) {
                    break label593;
                }

                var384 = var9;
                if (var384 == null) {
                    var30 ^= 1638968842;
                    var30 &= -1757009175;
                    var30 ^= -1744399698;
                } else {
                    label574: {
                        var30 &= -1921609279;
                        var30 += 452156938;
                        var30 += 79490042;
                        var30 += 1180660971;
                        var30 ^= -704076280;
                        boolean var386 = var6.showServer();
                        if (var386) {
                            var30 <<= 22;
                            var30 |= 455617057;
                            var30 |= 1862073294;
                            var30 -= 186882626;
                            var30 ^= 663837350;
                            var384 = var30;
                            if (var384 == null) {
                                break label593;
                            }

                            KI var388 = KI.MULTIPLAYER;
                            Integer var412 = var9;
                            if (var412 == null) {
                                var30 ^= -1472959185;
                                var30 ^= -159716278;
                                break label565;
                            }

                            var30 ^= 266724555;
                            var30 ^= 1446452477;
                            var12 = var30;
                            var14 = var12 + 1L;
                            var14 = var12 * var14;
                            var12 = var14 & 1L;
                            long var619;
                            int var415 = (var619 = var12 - 0L) == 0L ? 0 : (var619 < 0L ? -1 : 1);
                            if (var415 != 0) {
                                break label593;
                            }

                            if (var0 == var388) {
                                var30 |= -1342855517;
                                var30 >>>= 30;
                                var30 ^= -1583654488;
                                var384 = var30;
                                if (var384 == null) {
                                    break label593;
                                }

                                String var390 = t(var1);
                                int var416 = var9 + 1;
                                int var417 = var9 * var416;
                                int var451 = var9 + 2;
                                int var418 = var417 * var451;
                                var451 = var9 + 3;
                                int var419 = var418 * var451;
                                int var420 = var419 & 7;
                                if (var420 != 0) {
                                    var30 |= 902493747;
                                    var30 |= 1167026771;
                                    var30 -= 2136799121;
                                    var30 ^= 2072359428;
                                    break label565;
                                }

                                var30 += -967931603;
                                var30 ^= -1985509667;
                                var12 = var30;
                                var14 = var12 + 1L;
                                var14 = var12 * var14;
                                var12 = var14 & 1L;
                                long var620;
                                int var423 = (var620 = var12 - 0L) == 0L ? 0 : (var620 < 0L ? -1 : 1);
                                if (var423 != 0) {
                                    break label593;
                                }

                                var391 = var390;
                                var30 >>= 26;
                                var30 *= 1601604119;
                                var30 >>= 6;
                                var30 ^= 953258291;
                                break label574;
                            }

                            switch (var30) {
                                case -232442409:
                                default:
                                    var30 ^= 96171331;
                                    break;
                                case 177914685:
                                    var30 -= -624649355;
                                    var30 >>= 2;
                                    var30 += 933702320;
                                    var30 ^= -297474735;
                                    break;
                                case 1250764582:
                                    var30 ^= -1083376587;
                            }
                        } else {
                            var30 *= -644930605;
                            var30 ^= 1728882774;
                        }

                        var12 = var30;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        long var16 = var12 + 2L;
                        var14 *= var16;
                        var12 += 3L;
                        var14 *= var12;
                        var12 = var14 & 7L;
                        long var621;
                        int var427 = (var621 = var12 - 0L) == 0L ? 0 : (var621 < 0L ? -1 : 1);
                        if (var427 != 0) {
                            break label593;
                        }

                        var391 = null;
                        var30 -= 901110657;
                        var30 <<= 27;
                        var30 &= 406445046;
                        var30 ^= 677063685;
                    }

                    int var428 = var30 + 1;
                    int var429 = var30 * var428;
                    int var430 = var429 & 1;
                    if (var430 != 0) {
                        break label593;
                    }

                    Integer var431 = var9;
                    if (var431 == null) {
                        var30 ^= -992390364;
                        var30 ^= 357609625;
                        var30 += -596616365;
                        var30 ^= -884633243;
                    } else {
                        var30 >>>= 7;
                        var30 &= 450782816;
                        var30 <<= 17;
                        var30 ^= -561444017;
                        int var432 = var0.ordinal();
                        label526:
                        switch (var432) {
                            case 0:
                                var30 -= 930662242;
                                var30 ^= -1397471899;
                                var30 += 1445849250;
                                var30 ^= 308432849;
                                if (var374) {
                                    var30 &= 333468127;
                                    var30 += 1543062214;
                                    var30 >>>= 29;
                                    var30 -= -1295380565;
                                    var30 ^= 877601038;
                                    var437 = "Uruchamia grę";
                                    var30 |= -612788994;
                                    var30 ^= 1617540484;
                                } else {
                                    var30 = switch (var30) {
                                        case 1580441851 -> {
                                            var30 -= 2041992193;
                                            var30 ^= 1188891094;
                                            var30 ^= 311693921;
                                            yield var30 ^ 773250360;
                                        }
                                        case 1618059028 -> var30 ^ 1541532219;
                                        default -> var30 ^ -538059541;
                                    };
                                    var437 = "Starting the game";
                                    var30 |= 773262998;
                                    var30 >>= 7;
                                    var30 *= -1946695687;
                                    var30 *= 1916333837;
                                    var30 ^= 962585547;
                                }
                                break;
                            case 1:
                                var30 *= 1059721455;
                                var30 ^= -1567694452;
                                if (var374) {
                                    var30 += 168120709;
                                    var30 ^= 2065452228;
                                    var437 = "W menu głównym";
                                    var30 *= 1350522813;
                                    var30 -= -1000505316;
                                    var30 *= -1283110523;
                                    var30 ^= 2128581072;
                                } else {
                                    var30 = switch (var30) {
                                        case -1852661939 -> {
                                            var30 *= 1957483503;
                                            var30 ^= -1602249270;
                                            var30 >>>= 14;
                                            yield var30 ^ -527321577;
                                        }
                                        case -726158568 -> var30 ^ 1267544189;
                                        default -> var30 ^ 4184882;
                                    };
                                    var384 = var30;
                                    if (var384 == null) {
                                        break label593;
                                    }

                                    var437 = "In the main menu";
                                    var30 -= -1751350250;
                                    var30 ^= -739811243;
                                }
                                break;
                            case 2:
                                var30 &= -1651334499;
                                var30 >>= 12;
                                var30 &= 719654028;
                                var30 ^= 409594198;
                                int var395 = var30 + 1;
                                var395 = var30 * var395;
                                var395 &= 1;
                                if (var395 != 0) {
                                    break label593;
                                }

                                if (var374) {
                                    var30 = switch (var30) {
                                        case -1872858269 -> var30 ^ -905773131;
                                        case 847833430 -> {
                                            var30 &= -1223000095;
                                            yield var30 ^ 70866708;
                                        }
                                        default -> var30 ^ -389290732;
                                    };
                                    Integer var398 = var30;
                                    if (var398 == null) {
                                        break label593;
                                    }

                                    var437 = "Gra jednoosobowa";
                                    switch (var30) {
                                        case -1592246513:
                                            var30 ^= -1766750076;
                                            break label526;
                                        case -558393456:
                                        default:
                                            var30 ^= -1395464020;
                                            break label526;
                                        case 909196884:
                                            var30 *= -2051432199;
                                            var30 *= -1487499593;
                                            var30 *= 1735589429;
                                            var30 -= 1714308598;
                                            var30 ^= 1855544028;
                                    }
                                } else {
                                    var30 |= -711990087;
                                    var30 += -448138736;
                                    var30 ^= 728311150;
                                    Integer var399 = var30;
                                    if (var399 == null) {
                                        break label593;
                                    }

                                    var437 = "Playing singleplayer";
                                    var30 >>>= 25;
                                    var30 |= -914481118;
                                    var30 ^= 1382825985;
                                }
                                break;
                            case 3:
                                var30 ^= -2094387938;
                                var30 |= -310153249;
                                var30 ^= 143060236;
                                Integer var464 = var30;
                                if (var464 == null) {
                                    break label593;
                                }

                                if (var391 != null) {
                                    var30 = switch (var30) {
                                        default -> var30 ^ -401964638;
                                        case -182091053 -> {
                                            var30 |= 168862788;
                                            var30 |= -1431717834;
                                            yield var30 ^ 1396468064;
                                        }
                                        case -68547932 -> var30 ^ -303887303;
                                    };
                                    long var465 = var30;
                                    long var558 = var465 + 1L;
                                    var558 = var465 * var558;
                                    long var602 = var465 + 2L;
                                    var558 *= var602;
                                    long var466 = var465 + 3L;
                                    var558 *= var466;
                                    long var467 = var558 & 7L;
                                    long var625;
                                    int var468 = (var625 = var467 - 0L) == 0L ? 0 : (var625 < 0L ? -1 : 1);
                                    if (var468 != 0) {
                                        break label593;
                                    }

                                    String var472;
                                    if (var374) {
                                        var30 *= -400266735;
                                        var30 += 918086404;
                                        var30 += -1851012999;
                                        var30 ^= -467304306;
                                        long var469 = var30;
                                        var558 = var469 + 1L;
                                        var558 = var469 * var558;
                                        long var470 = var558 & 1L;
                                        long var626;
                                        var468 = (var626 = var470 - 0L) == 0L ? 0 : (var626 < 0L ? -1 : 1);
                                        if (var468 != 0) {
                                            break label593;
                                        }

                                        var472 = "Gra na ";
                                        var30 -= 802405217;
                                        var30 ^= 1005886002;
                                        var30 >>>= 26;
                                        var30 &= -1562696904;
                                        var30 ^= 1917922766;
                                    } else {
                                        var30 *= -1812216275;
                                        var30 <<= 13;
                                        var30 ^= 204514563;
                                        var472 = "Playing on ";
                                        var30 += 942006990;
                                        var30 &= -491913766;
                                        var30 += 1816865882;
                                        var30 *= -1071694461;
                                        var30 ^= 1714725016;
                                    }

                                    String var392 = var472 + var391;
                                    Integer var473 = var9;
                                    if (var473 == null) {
                                        switch (var30) {
                                            case -548004944:
                                                var30 ^= 1673634674;
                                                break label565;
                                            case 1901076113:
                                            default:
                                                var30 ^= 1800738543;
                                                break label565;
                                            case 1917922790:
                                                var30 -= -1624942832;
                                                var30 -= 2072584004;
                                                var30 ^= 1520700924;
                                                break label565;
                                        }
                                    }
                                    var30 = switch (var30) {
                                        case -1898209491 -> var30 ^ 1143403119;
                                        default -> var30 ^ 727816912;
                                        case 1917922790 -> {
                                            var30 <<= 23;
                                            yield var30 ^ -1475947851;
                                        }
                                    };
                                    var473 = var30;
                                    if (var473 == null) {
                                        break label593;
                                    }

                                    var437 = var392;
                                    var30 += 1677675228;
                                    var30 -= -1780865052;
                                    var30 *= 567344337;
                                    var30 >>>= 7;
                                    var30 ^= -1702169658;
                                } else {
                                    var30 -= -795426035;
                                    var30 ^= 2045990074;
                                    long var475 = var30;
                                    long var564 = var475 + 1L;
                                    var564 = var475 * var564;
                                    long var603 = var475 + 2L;
                                    var564 *= var603;
                                    long var476 = var475 + 3L;
                                    var564 *= var476;
                                    long var477 = var564 & 7L;
                                    long var627;
                                    int var393 = (var627 = var477 - 0L) == 0L ? 0 : (var627 < 0L ? -1 : 1);
                                    if (var393 != 0) {
                                        break label593;
                                    }

                                    if (var374) {
                                        var30 = switch (var30) {
                                            case -1812024857 -> var30 ^ -1587420642;
                                            default -> var30 ^ 1232096362;
                                            case 1568533372 -> {
                                                var30 &= -1943345053;
                                                var30 -= 1521254390;
                                                var30 >>>= 31;
                                                var30 &= 678676542;
                                                yield var30 ^ -663788196;
                                            }
                                        };
                                        var437 = "Gra wieloosobowa";
                                        switch (var30) {
                                            case -990098348:
                                                var30 ^= -2013068339;
                                                break label526;
                                            case -663788196:
                                                var30 >>= 23;
                                                var30 *= -1026882099;
                                                var30 += -1375003722;
                                                var30 &= -771936365;
                                                var30 ^= 1535863800;
                                                break label526;
                                            case 315142525:
                                            default:
                                                var30 ^= 573746988;
                                        }
                                    } else {
                                        var30 ^= -597700736;
                                        var30 *= -1527106429;
                                        var30 *= -980912293;
                                        var30 ^= -1884377502;
                                        long var478 = var30;
                                        var564 = var478 + 1L;
                                        var564 = var478 * var564;
                                        var603 = var478 + 2L;
                                        var564 *= var603;
                                        long var479 = var478 + 3L;
                                        var564 *= var479;
                                        long var480 = var564 & 7L;
                                        long var628;
                                        var393 = (var628 = var480 - 0L) == 0L ? 0 : (var628 < 0L ? -1 : 1);
                                        if (var393 != 0) {
                                            break label593;
                                        }

                                        var437 = "Playing multiplayer";
                                        var30 ^= 1158023635;
                                        var30 <<= 10;
                                        var30 ^= -682208134;
                                    }
                                }
                                break;
                            case 4:
                                var30 = switch (var30) {
                                    case -1844901041 -> {
                                        var30 |= 492073124;
                                        var30 += 1502729323;
                                        var30 &= 297685754;
                                        yield var30 ^ -1610208992;
                                    }
                                    default -> var30 ^ 929194645;
                                    case 1664300984 -> var30 ^ -728627257;
                                };
                                long var456 = var30;
                                long var552 = var456 + 1L;
                                var552 = var456 * var552;
                                long var17 = var456 + 2L;
                                var552 *= var17;
                                var456 += 3L;
                                var552 *= var456;
                                var456 = var552 & 7L;
                                long var623;
                                int var459 = (var623 = var456 - 0L) == 0L ? 0 : (var623 < 0L ? -1 : 1);
                                if (var459 != 0) {
                                    break label593;
                                }

                                if (var374) {
                                    var30 *= -196490433;
                                    var30 ^= 1570172346;
                                    var456 = var30;
                                    var552 = var456 + 1L;
                                    var552 = var456 * var552;
                                    var456 = var552 & 1L;
                                    long var624;
                                    int var462 = (var624 = var456 - 0L) == 0L ? 0 : (var624 < 0L ? -1 : 1);
                                    if (var462 != 0) {
                                        break label593;
                                    }

                                    var437 = "Gra w sieci LAN";
                                    switch (var30) {
                                        case -2053518816:
                                        default:
                                            var30 ^= -163393381;
                                            break label526;
                                        case -1610264900:
                                            var30 >>= 24;
                                            var30 ^= -2076849467;
                                            var30 ^= -522693345;
                                            break label526;
                                        case -866350432:
                                            var30 ^= 613009869;
                                    }
                                } else {
                                    var30 = switch (var30) {
                                        case -1331136134 -> {
                                            var30 *= -1049205937;
                                            var30 &= -989492318;
                                            yield var30 ^ -1290787545;
                                        }
                                        default -> var30 ^ -1791292874;
                                        case 360956528 -> var30 ^ 31740596;
                                    };
                                    Integer var463 = var30;
                                    if (var463 == null) {
                                        break label593;
                                    }

                                    var437 = "Playing on LAN";
                                    var30 -= -583760885;
                                    var30 ^= -808498432;
                                }
                                break;
                            case 5:
                                var30 = switch (var30) {
                                    case -1844901041 -> {
                                        var30 <<= 15;
                                        var30 -= 387784271;
                                        var30 |= -977303272;
                                        var30 |= 341647156;
                                        yield var30 ^ -1463838718;
                                    }
                                    default -> var30 ^ -1412289548;
                                    case 1738635241 -> var30 ^ -949283216;
                                };
                                Integer var433 = var30;
                                if (var433 == null) {
                                    break label593;
                                }

                                if (var374) {
                                    var30 = switch (var30) {
                                        case -1459732988 -> var30 ^ 551355523;
                                        default -> var30 ^ -1082820760;
                                        case 1463838655 -> {
                                            var30 *= 1436797797;
                                            var30 ^= 1298102636;
                                            yield var30 ^ -1865542884;
                                        }
                                    };
                                    int var434 = var30 + 1;
                                    int var435 = var30 * var434;
                                    int var436 = var435 & 1;
                                    if (var436 != 0) {
                                        break label593;
                                    }

                                    var437 = "Gra na Realms";
                                    var30 ^= -418016285;
                                    var30 |= -686479326;
                                    var30 &= -1448187416;
                                    var30 ^= 446449810;
                                } else {
                                    var30 *= -47057757;
                                    var30 *= -1691952013;
                                    var30 ^= -1006217916;
                                    long var453 = var30;
                                    long var15 = var453 + 1L;
                                    var15 = var453 * var15;
                                    var453 = var15 & 1L;
                                    long var622;
                                    int var455 = (var622 = var453 - 0L) == 0L ? 0 : (var622 < 0L ? -1 : 1);
                                    if (var455 != 0) {
                                        break label593;
                                    }

                                    var437 = "Playing on Realms";
                                    switch (var30) {
                                        case -1712867901:
                                            var30 &= 65768067;
                                            var30 <<= 15;
                                            var30 |= -1094971394;
                                            var30 *= -1470238115;
                                            var30 ^= -929887428;
                                            break label526;
                                        case -881065903:
                                            var30 ^= -1745305926;
                                            break label526;
                                        case 507559066:
                                        default:
                                            var30 ^= 375114020;
                                    }
                                }
                                break;
                            default:
                                var30 |= -995279876;
                                var30 >>= 30;
                                var30 -= 413582939;
                                var30 ^= -1658854290;
                                var9 = var30 + 1;
                                var9 = var30 * var9;
                                var9 &= 1;
                                if (var9 == 0) {
                                    MatchException var355 = new MatchException(null, null);
                                    throw var355;
                                }
                                break label593;
                        }

                        long var481 = var30;
                        long var572 = var481 + 1L;
                        var572 = var481 * var572;
                        long var605 = var481 + 2L;
                        var572 *= var605;
                        var481 += 3L;
                        var572 *= var481;
                        var481 = var572 & 7L;
                        long var629;
                        int var401 = (var629 = var481 - 0L) == 0L ? 0 : (var629 < 0L ? -1 : 1);
                        if (var401 != 0) {
                            break label593;
                        }

                        int var438 = var9 + 1;
                        int var439 = var9 * var438;
                        int var440 = var439 & 1;
                        if (var440 != 0) {
                            switch (var30) {
                                case -1693294470:
                                    var30 ^= 938413591;
                                    var30 -= 2111976751;
                                    var30 *= -397322223;
                                    var30 ^= -495401847;
                                    var30 ^= 644113401;
                                    break;
                                case -413852549:
                                default:
                                    var30 ^= 487450631;
                                    break;
                                case 1966531716:
                                    var30 ^= -1472816797;
                            }
                        } else {
                            label584: {
                                label585: {
                                    var30 &= -1341407682;
                                    var30 ^= -1083120770;
                                    if (var3 != null) {
                                        var30 |= 1216034653;
                                        var30 ^= 981307546;
                                        Integer var441 = var30;
                                        if (var441 == null) {
                                            break label593;
                                        }

                                        boolean var442 = var3.isBlank();
                                        int var484 = var9 + 1;
                                        int var485 = var9 * var484;
                                        int var486 = var485 & 1;
                                        if (var486 != 0) {
                                            switch (var30) {
                                                case 786293830:
                                                    var30 ^= 843285340;
                                                    break label584;
                                                case 1215464349:
                                                default:
                                                    var30 ^= -1481792353;
                                                    break label584;
                                                case 1426483143:
                                                    var30 &= -1788769188;
                                                    var30 ^= -1350924344;
                                                    var30 >>>= 3;
                                                    var30 ^= 441051679;
                                                    break label584;
                                            }
                                        }

                                        var30 += -938557197;
                                        var30 *= -1039786371;
                                        var30 |= 793991676;
                                        var30 ^= -286899400;
                                        if (!var442) {
                                            var30 = switch (var30) {
                                                default -> var30 ^ 977376064;
                                                case 1085258731 -> var30 ^ -1378763445;
                                                case 1368505542 -> {
                                                    var30 |= 1460245881;
                                                    yield var30 ^ 1755266289;
                                                }
                                            };
                                            int var443 = var30 + 1;
                                            int var444 = var30 * var443;
                                            int var487 = var30 + 2;
                                            int var445 = var444 * var487;
                                            int var488 = var30 + 3;
                                            int var446 = var445 * var488;
                                            int var447 = var446 & 7;
                                            if (var447 != 0) {
                                                break label593;
                                            }

                                            String var448 = "Minecraft " + var3;
                                            int var489 = var9 + 1;
                                            int var490 = var9 * var489;
                                            int var528 = var9 + 2;
                                            int var491 = var490 * var528;
                                            int var529 = var9 + 3;
                                            int var492 = var491 * var529;
                                            int var493 = var492 & 7;
                                            if (var493 != 0) {
                                                var30 <<= 14;
                                                var30 &= 1952585014;
                                                var30 ^= 759478894;
                                                break label584;
                                            }
                                            var30 = switch (var30) {
                                                case 1023419217 -> var30 ^ -2072215171;
                                                case 1057390862 -> {
                                                    var30 >>>= 6;
                                                    var30 &= 525551090;
                                                    var30 -= 2026121637;
                                                    var30 &= 1140835791;
                                                    yield var30 ^ -1033366053;
                                                }
                                                default -> var30 ^ 418241194;
                                            };
                                            var449 = var448;
                                            var30 |= 1499318469;
                                            var30 |= -306750575;
                                            var30 ^= -1031846473;
                                            break label585;
                                        }

                                        var30 *= -1777999445;
                                        var30 += -494559201;
                                        var30 |= 901486481;
                                        var30 |= -1360337165;
                                        var30 ^= 467920139;
                                    } else {
                                        var30 ^= -739054841;
                                        var30 >>= 5;
                                        var30 ^= 1542986682;
                                    }

                                    Integer var494 = var30;
                                    if (var494 == null) {
                                        break label593;
                                    }

                                    var449 = null;
                                    var30 ^= 305612776;
                                    var30 |= 2102951100;
                                    var30 ^= -1057233954;
                                }

                                Integer var495 = var30;
                                if (var495 == null) {
                                    break label593;
                                }

                                boolean var496 = var6.showButton();
                                var14 = var9;
                                long var580 = var14 + 1L;
                                var580 = var14 * var580;
                                long var18 = var14 + 2L;
                                var580 *= var18;
                                var14 += 3L;
                                var580 *= var14;
                                var14 = var580 & 7L;
                                long var630;
                                int var533 = (var630 = var14 - 0L) == 0L ? 0 : (var630 < 0L ? -1 : 1);
                                label502:
                                if (var533 == 0) {
                                    label588: {
                                        var30 *= 287391337;
                                        var30 -= -1229768783;
                                        var30 -= 778889632;
                                        var30 *= -486200375;
                                        var30 ^= 76299905;
                                        if (var496) {
                                            var30 = switch (var30) {
                                                default -> var30 ^ -47696098;
                                                case -1367932196 -> var30 ^ 1724851377;
                                                case 867611944 -> {
                                                    var30 ^= 1724766490;
                                                    var30 |= -1669335154;
                                                    var30 *= 521228341;
                                                    var30 |= 500402126;
                                                    yield var30 ^ -2090000335;
                                                }
                                            };
                                            var481 = var30;
                                            var572 = var481 + 1L;
                                            var572 = var481 * var572;
                                            var605 = var481 + 2L;
                                            var572 *= var605;
                                            var481 += 3L;
                                            var572 *= var481;
                                            var481 = var572 & 7L;
                                            long var631;
                                            int var500 = (var631 = var481 - 0L) == 0L ? 0 : (var631 < 0L ? -1 : 1);
                                            if (var500 != 0) {
                                                break label593;
                                            }

                                            String var501 = var7.inviteUrl();
                                            var14 = var9;
                                            var580 = var14 + 1L;
                                            var580 = var14 * var580;
                                            var18 = var14 + 2L;
                                            var580 *= var18;
                                            var14 += 3L;
                                            var580 *= var14;
                                            var14 = var580 & 7L;
                                            long var632;
                                            int var537 = (var632 = var14 - 0L) == 0L ? 0 : (var632 < 0L ? -1 : 1);
                                            if (var537 != 0) {
                                                switch (var30) {
                                                    case -1247119739:
                                                        var30 ^= 8123244;
                                                        break label502;
                                                    case 1466957328:
                                                    default:
                                                        var30 ^= 115560515;
                                                        break label502;
                                                    case 1589049327:
                                                        var30 -= 800352722;
                                                        var30 ^= -854416288;
                                                        var30 ^= -1343698761;
                                                        var30 ^= 1090410660;
                                                        break label502;
                                                }
                                            }

                                            var30 -= -1678518591;
                                            var30 ^= 610890184;
                                            Integer var538 = var30;
                                            if (var538 == null) {
                                                break label593;
                                            }

                                            if (var501 != null) {
                                                var30 ^= 1965114273;
                                                var30 &= 413963168;
                                                var30 ^= -1527504587;
                                                int var502 = var30 + 1;
                                                int var503 = var30 * var502;
                                                int var504 = var503 & 1;
                                                if (var504 != 0) {
                                                    break label593;
                                                }

                                                GE var505;
                                                String var376;
                                                if (var374) {
                                                    var30 >>= 23;
                                                    var30 *= -415798509;
                                                    var30 += -922427207;
                                                    var30 ^= 1190376143;
                                                    Integer var375 = var30;
                                                    if (var375 == null) {
                                                        break label593;
                                                    }

                                                    var376 = "Dołącz na Discord";
                                                    var30 -= 861380443;
                                                    var30 >>>= 11;
                                                    var30 -= -358477963;
                                                    var30 ^= -835735571;
                                                } else {
                                                    var30 |= 81519616;
                                                    var30 *= 440940171;
                                                    var30 ^= 397046893;
                                                    var30 &= 794700648;
                                                    var30 ^= -1862838104;
                                                    var376 = "Join our Discord";
                                                    var30 -= -64002206;
                                                    var30 ^= 1830929796;
                                                }

                                                String var539 = var7.inviteUrl();
                                                var505 = new GE(var376, var539);
                                                List var377 = List.of(var505);
                                                Integer var506 = var9;
                                                if (var506 == null) {
                                                    switch (var30) {
                                                        case -1006466526:
                                                            var30 ^= -1068024207;
                                                            break label502;
                                                        case -614478694:
                                                            var30 ^= 1631812443;
                                                            var30 *= 401875595;
                                                            var30 *= -2032939733;
                                                            var30 ^= -1537850249;
                                                            break label502;
                                                        case 911362048:
                                                        default:
                                                            var30 ^= 795409352;
                                                            break label502;
                                                    }
                                                }

                                                var30 >>= 30;
                                                var30 += -1178621466;
                                                var30 -= -1178069811;
                                                var30 ^= 338178344;
                                                Integer var507 = var30;
                                                if (var507 == null) {
                                                    break label593;
                                                }

                                                var378 = var377;
                                                var30 ^= -806911762;
                                                var30 *= 650875763;
                                                var30 *= 588557289;
                                                var30 >>>= 8;
                                                var30 ^= 1032643260;
                                                break label588;
                                            }

                                            var30 |= -2080336634;
                                            var30 ^= -1067648721;
                                        } else {
                                            var30 |= 1796832301;
                                            var30 *= -1106881537;
                                            var30 &= -1491491786;
                                            var30 ^= -378458329;
                                            var30 ^= 1334282236;
                                        }

                                        int var508 = var30 + 1;
                                        int var509 = var30 * var508;
                                        int var510 = var509 & 1;
                                        if (var510 != 0) {
                                            break label593;
                                        }

                                        List var511 = List.of();
                                        var14 = var9;
                                        var580 = var14 + 1L;
                                        var580 = var14 * var580;
                                        var18 = var14 + 2L;
                                        var580 *= var18;
                                        var14 += 3L;
                                        var580 *= var14;
                                        var14 = var580 & 7L;
                                        long var633;
                                        int var543 = (var633 = var14 - 0L) == 0L ? 0 : (var633 < 0L ? -1 : 1);
                                        if (var543 != 0) {
                                            var30 += -1611934759;
                                            var30 *= -1928491375;
                                            var30 -= -1365812843;
                                            var30 -= 1027179186;
                                            var30 ^= 1438900501;
                                            break label502;
                                        }

                                        var30 &= 1925967377;
                                        var30 *= -1530575931;
                                        var30 &= 199428114;
                                        var30 ^= -966748676;
                                        var378 = var511;
                                        var30 <<= 4;
                                        var30 += 576968921;
                                        var30 ^= 1993491198;
                                        var30 *= 2111457743;
                                        var30 ^= -420277011;
                                    }

                                    Integer var512 = var9;
                                    if (var512 != null) {
                                        var30 ^= -926191089;
                                        var30 &= 374112306;
                                        var30 ^= -8304685;
                                        int var513 = var30 + 1;
                                        int var514 = var30 * var513;
                                        int var544 = var30 + 2;
                                        int var515 = var514 * var544;
                                        int var545 = var30 + 3;
                                        int var516 = var515 * var545;
                                        int var517 = var516 & 7;
                                        if (var517 != 0) {
                                            break label593;
                                        }

                                        wJ var518;
                                        boolean var546 = var6.showElapsed();
                                        if (var546) {
                                            var30 = switch (var30) {
                                                default -> var30 ^ 907786662;
                                                case -339621903 -> {
                                                    var30 &= 82500022;
                                                    yield var30 ^ -1289981183;
                                                }
                                                case 698211136 -> var30 ^ 2092062067;
                                            };
                                            int var547 = var30 + 1;
                                            int var548 = var30 * var547;
                                            int var549 = var548 & 1;
                                            if (var549 != 0) {
                                                break label593;
                                            }

                                            var14 = var4;
                                            var30 -= -42031923;
                                            var30 *= 820752531;
                                            var30 |= -830436564;
                                            var30 |= -747763400;
                                            var30 ^= -1272334977;
                                        } else {
                                            var30 *= -1139022831;
                                            var30 >>>= 12;
                                            var30 -= 1476892303;
                                            var30 ^= 1322893945;
                                            int var592 = var30 + 1;
                                            int var593 = var30 * var592;
                                            int var607 = var30 + 2;
                                            int var594 = var593 * var607;
                                            int var608 = var30 + 3;
                                            int var595 = var594 * var608;
                                            int var596 = var595 & 7;
                                            if (var596 != 0) {
                                                break label593;
                                            }

                                            var14 = 0L;
                                            var30 -= -1176591319;
                                            var30 *= -51457187;
                                            var30 *= -1863456019;
                                            var30 ^= 403351270;
                                        }

                                        var580 = var30;
                                        var18 = var580 + 1L;
                                        var18 = var580 * var18;
                                        long var20 = var580 + 2L;
                                        var18 *= var20;
                                        var580 += 3L;
                                        var18 *= var580;
                                        var580 = var18 & 7L;
                                        long var634;
                                        int var600 = (var634 = var580 - 0L) == 0L ? 0 : (var634 < 0L ? -1 : 1);
                                        if (var600 != 0) {
                                            break label593;
                                        }

                                        String var601 = var7.logo();
                                        Integer var356 = var9;
                                        if (var356 != null) {
                                            var356 = switch (var30) {
                                                default -> var30 ^ 1228483047;
                                                case 1272385155 -> {
                                                    var30 *= 261337751;
                                                    yield var30 ^ 997624852;
                                                }
                                                case 1507417400 -> var30 ^ 53477213;
                                            };
                                            if (var356 != null) {
                                                String var358 = var7.logoText();
                                                var518 = new wJ(var437, var449, var14, var601, var358, null, null, (List)var378);
                                                return var518;
                                            }
                                            break label593;
                                        }

                                        var30 *= -2119612331;
                                        var30 *= 79343843;
                                        var30 *= 504838023;
                                        var30 ^= -642420571;
                                    } else {
                                        switch (var30) {
                                            case -1579218702:
                                                var30 ^= -302332032;
                                                break;
                                            case -753770652:
                                            default:
                                                var30 ^= -1016230656;
                                                break;
                                            case 1033620644:
                                                var30 |= 2006869267;
                                                var30 ^= 1922652121;
                                        }
                                    }
                                } else {
                                    var30 >>>= 14;
                                    var30 += 2123035320;
                                    var30 |= -1481468188;
                                    var30 ^= -222475120;
                                }
                            }
                        }
                    }
                }
            } else {
                var30 &= -1453328479;
                var30 += -1494523202;
                var30 *= -1414618897;
                var30 ^= 861176127;
            }

            var9 = var30 + 1;
            var9 = var30 * var9;
            var30 = var9 & 1;
            if (var30 == 0) {
                RuntimeException var350 = new RuntimeException();
                throw var350;
            }
        }

        RuntimeException var351 = new RuntimeException();
        throw var351;
    }

    public static String t(String var0) {
        label376: {
            int var90;
            label398: {
                var90 = rz;
                var90 ^= -142459012;
                int var2 = System.identityHashCode(var0);
                int var3 = var2 + 1;
                var3 = var2 * var3;
                int var4 = var2 + 2;
                var3 *= var4;
                var4 = var2 + 3;
                var3 *= var4;
                var3 &= 7;
                if (var3 != 0) {
                    var90 ^= 710503946;
                    var90 |= 1537726633;
                    var90 += 1783413867;
                    var90 ^= -661483595;
                } else {
                    var90 ^= 2004759206;
                    var90 -= 1150027063;
                    var90 ^= -1104827353;
                    var3 = var90 + 1;
                    var3 = var90 * var3;
                    var4 = var90 + 2;
                    var3 *= var4;
                    var4 = var90 + 3;
                    var3 *= var4;
                    var3 &= 7;
                    if (var3 != 0) {
                        break label376;
                    }

                    if (var0 == null) {
                        var90 <<= 20;
                        var90 ^= -1344544636;
                        Integer var246 = var90;
                        if (var246 != null) {
                            return null;
                        }
                        break label376;
                    }

                    var90 += -2133304262;
                    var90 -= 1726525541;
                    var90 ^= -1414151531;
                    var90 &= 576769003;
                    var90 ^= 987036784;
                    String var220 = var0.strip();
                    Locale var251 = Locale.ROOT;
                    Integer var5 = var2;
                    if (var5 != null) {
                        var90 = switch (var90) {
                            case -1892444388 -> var90 ^ -674682015;
                            case 418657650 -> {
                                var90 -= -2009285115;
                                var90 *= 830122855;
                                var90 *= 1202449563;
                                yield var90 ^ 1215055883;
                            }
                            default -> var90 ^ -1454299689;
                        };
                        String var221 = var220.toLowerCase(var251);
                        int var252 = (var221.startsWith("[")) ? 1 : 0;
                        if (var252 != 0) {
                            var90 <<= 7;
                            var90 ^= 1381408911;
                            Integer var258 = var90;
                            if (var258 != null) {
                                return null;
                            }
                            break label376;
                        }

                        var90 |= 1509063179;
                        var90 -= -1530688356;
                        var90 &= -2055836415;
                        var90 ^= -1946541396;
                        var252 = var221.indexOf(58);
                        int var259 = var2 + 1;
                        var259 = var2 * var259;
                        int var6 = var2 + 2;
                        var259 *= var6;
                        var6 = var2 + 3;
                        var259 *= var6;
                        var259 &= 7;
                        label367:
                        if (var259 == 0) {
                            var90 -= 38062184;
                            var90 &= -831326105;
                            var90 |= -811770338;
                            var90 ^= 781001884;
                            var259 = var90 + 1;
                            var259 = var90 * var259;
                            var6 = var90 + 2;
                            var259 *= var6;
                            var6 = var90 + 3;
                            var259 *= var6;
                            var259 &= 7;
                            if (var259 != 0) {
                                break label376;
                            }

                            String var255;
                            if (var252 >= 0) {
                                var90 >>= 10;
                                var90 ^= 582223093;
                                var259 = var90 + 1;
                                var259 = var90 * var259;
                                var6 = var90 + 2;
                                var259 *= var6;
                                var6 = var90 + 3;
                                var259 *= var6;
                                var259 &= 7;
                                if (var259 != 0) {
                                    break label376;
                                }

                                var259 = var252 + 1;
                                var259 = var221.indexOf(58, var259);
                                Integer var338 = var2;
                                if (var338 == null) {
                                    switch (var90) {
                                        case -582205365:
                                            var90 -= -1676620626;
                                            var90 -= -1852238421;
                                            var90 ^= -1120114925;
                                            break label367;
                                        case 942610134:
                                            var90 ^= 342292569;
                                            break label367;
                                        case 1132283743:
                                        default:
                                            var90 ^= 570665543;
                                            break label367;
                                    }
                                }

                                var90 |= 352234501;
                                var90 += 1086686991;
                                var90 &= -840773217;
                                var90 ^= -1341627818;
                                if (var259 >= 0) {
                                    var90 = switch (var90) {
                                        case -1667360992 -> var90 ^ -2050127708;
                                        case -1127730360 -> {
                                            var90 |= 97535361;
                                            yield var90 ^ -209414675;
                                        }
                                        default -> var90 ^ -1581273723;
                                    };
                                    var259 = var90 + 1;
                                    var259 = var90 * var259;
                                    int var341 = var90 + 2;
                                    var259 *= var341;
                                    var341 = var90 + 3;
                                    var259 *= var341;
                                    var259 &= 7;
                                    if (var259 == 0) {
                                        return null;
                                    }
                                    break label376;
                                }

                                var90 |= -1163599724;
                                var90 ^= 1150994514;
                                Integer var276 = var90;
                                if (var276 == null) {
                                    break label376;
                                }

                                String var254 = var221.substring(0, var252);
                                long var277 = var2;
                                long var7 = var277 + 1L;
                                var7 = var277 * var7;
                                long var9 = var277 + 2L;
                                var7 *= var9;
                                long var278 = var277 + 3L;
                                var7 *= var278;
                                long var279 = var7 & 7L;
                                long var412;
                                int var280 = (var412 = var279 - 0L) == 0L ? 0 : (var412 < 0L ? -1 : 1);
                                if (var280 != 0) {
                                    var90 ^= 1973688109;
                                    var90 -= -129735144;
                                    var90 ^= -2062287766;
                                    break label367;
                                }

                                var90 *= 831246405;
                                var90 ^= 148633096;
                                var90 >>= 23;
                                var90 ^= -1412837280;
                                var280 = var90 + 1;
                                var280 = var90 * var280;
                                int var339 = var90 + 2;
                                var280 *= var339;
                                var339 = var90 + 3;
                                var280 *= var339;
                                var280 &= 7;
                                if (var280 != 0) {
                                    break label376;
                                }

                                var255 = var254;
                                var90 ^= 1693825850;
                                var90 *= 830385821;
                                var90 *= -1068282225;
                                var90 -= -1122779162;
                                var90 ^= 218822229;
                            } else {
                                var90 <<= 14;
                                var90 ^= 703160735;
                                long var291 = var90;
                                long var350 = var291 + 1L;
                                var350 = var291 * var350;
                                long var404 = var291 + 2L;
                                var350 *= var404;
                                long var292 = var291 + 3L;
                                var350 *= var292;
                                long var293 = var350 & 7L;
                                long var413;
                                var259 = (var413 = var293 - 0L) == 0L ? 0 : (var413 < 0L ? -1 : 1);
                                if (var259 != 0) {
                                    break label376;
                                }

                                var255 = var221;
                                var90 |= 1177099073;
                                var90 ^= -1667848738;
                                var90 ^= 1354594891;
                            }

                            label357:
                            while (true) {
                                Integer var222 = var90;
                                if (var222 == null) {
                                    break label376;
                                }

                                boolean var223 = var255.endsWith(".");
                                Integer var295 = var2;
                                if (var295 == null) {
                                    switch (var90) {
                                        case -678571957:
                                            var90 ^= -1770826818;
                                            break label357;
                                        case 458384458:
                                            var90 ^= -1133948234;
                                            var90 |= -439643717;
                                            var90 ^= -1338130143;
                                            var90 ^= 1163414591;
                                            break label357;
                                        case 788870632:
                                        default:
                                            var90 ^= 254722811;
                                            break label357;
                                    }
                                }

                                var90 >>= 13;
                                var90 += 459535656;
                                var90 ^= -1106754284;
                                var90 ^= -1671791202;
                                var295 = var90;
                                if (var295 == null) {
                                    break label376;
                                }

                                if (!var223) {
                                    var90 += 280992584;
                                    var90 ^= 39838944;
                                    int var228 = var90 + 1;
                                    var228 = var90 * var228;
                                    var228 &= 1;
                                    if (var228 != 0) {
                                        break label376;
                                    }

                                    var228 = var255.length();
                                    var295 = var2;
                                    if (var295 != null) {
                                        var90 *= 1064579845;
                                        var90 |= -1251641000;
                                        var90 ^= -788004112;
                                        var295 = var90;
                                        if (var295 == null) {
                                            break label376;
                                        }

                                        if (var228 >= 3) {
                                            var90 = switch (var90) {
                                                default -> var90 ^ -1035132630;
                                                case 1205560707 -> var90 ^ -1648158059;
                                                case 1685059853 -> {
                                                    var90 -= 238846786;
                                                    var90 *= 405568405;
                                                    var90 += -810236288;
                                                    yield var90 ^ 215759297;
                                                }
                                            };
                                            var228 = var90 + 1;
                                            var228 = var90 * var228;
                                            var228 &= 1;
                                            if (var228 != 0) {
                                                break label376;
                                            }

                                            var228 = var255.length();
                                            long var308 = var2;
                                            long var358 = var308 + 1L;
                                            var358 = var308 * var358;
                                            long var309 = var358 & 1L;
                                            long var414;
                                            int var310 = (var414 = var309 - 0L) == 0L ? 0 : (var414 < 0L ? -1 : 1);
                                            if (var310 != 0) {
                                                var90 += -219703708;
                                                var90 -= 1479385584;
                                                var90 *= -2056399673;
                                                var90 ^= -2123017065;
                                                break;
                                            }
                                            var90 = switch (var90) {
                                                default -> var90 ^ -1037686201;
                                                case -1268514077 -> var90 ^ 2074261943;
                                                case -252123290 -> {
                                                    var90 |= 1049656591;
                                                    var90 ^= -1557507665;
                                                    var90 -= -243521726;
                                                    var90 |= 201031972;
                                                    yield var90 ^ -2076239143;
                                                }
                                            };
                                            if (var228 <= 100) {
                                                var90 += -1811939596;
                                                var90 ^= -1904311832;
                                                Integer var236 = var90;
                                                if (var236 == null) {
                                                    break label376;
                                                }

                                                int var237 = var255.indexOf(46);
                                                Integer var311 = var2;
                                                if (var311 != null) {
                                                    var90 -= -1016507301;
                                                    var90 ^= 431354794;
                                                    var90 &= 274249453;
                                                    var90 |= 2117328987;
                                                    var90 ^= 1578084767;
                                                    if (var237 < 0) {
                                                        switch (var90) {
                                                            case -676783935:
                                                            default:
                                                                var90 ^= -1640463199;
                                                                break label398;
                                                            case 545020772:
                                                                var90 ^= -868135745;
                                                                var90 &= -1364522972;
                                                                var90 += 1654579276;
                                                                var90 ^= 1717828766;
                                                                break label398;
                                                            case 1592458335:
                                                                var90 ^= 1656384953;
                                                                break label398;
                                                        }
                                                    }

                                                    var90 -= -1740097043;
                                                    var90 += 95700367;
                                                    var90 &= 1267587408;
                                                    var90 ^= -439474772;
                                                    int var238 = (var255.matches("[a-z0-9.-]+")) ? 1 : 0;
                                                    int var312 = var2 + 1;
                                                    var312 = var2 * var312;
                                                    var312 &= 1;
                                                    if (var312 != 0) {
                                                        switch (var90) {
                                                            case -426761494:
                                                            default:
                                                                var90 ^= 373396963;
                                                                break label357;
                                                            case -330931028:
                                                                var90 *= -1981371867;
                                                                var90 ^= -1343965853;
                                                                var90 &= 688098753;
                                                                var90 |= 1581211804;
                                                                var90 ^= 1285643132;
                                                                break label357;
                                                            case 443535122:
                                                                var90 ^= 1731810943;
                                                                break label357;
                                                        }
                                                    }

                                                    var90 &= -90652328;
                                                    var90 ^= -599707832;
                                                    var90 <<= 26;
                                                    var90 ^= 1311202862;
                                                    Integer var315 = var90;
                                                    if (var315 == null) {
                                                        break label376;
                                                    }

                                                    if (var238 == 0) {
                                                        switch (var90) {
                                                            case 742341582:
                                                                var90 ^= -1750741985;
                                                                return null;
                                                            case 1137917595:
                                                            default:
                                                                var90 ^= 1517583707;
                                                                return null;
                                                            case 1311202862:
                                                                var90 |= 30086204;
                                                                var90 ^= -1926402938;
                                                                var90 -= -981386413;
                                                                var90 ^= -603688637;
                                                                return null;
                                                        }
                                                    }

                                                    var90 ^= -111873997;
                                                    var90 ^= 1738765913;
                                                    var90 ^= -64496261;
                                                    var90 ^= 1923303708;
                                                    Integer var239 = var90;
                                                    if (var239 == null) {
                                                        break label376;
                                                    }

                                                    var238 = var255.matches("[0-9.]+") ? 1 : 0;
                                                    var315 = var2;
                                                    if (var315 == null) {
                                                        var90 += -366999313;
                                                        var90 ^= 1525313523;
                                                        break;
                                                    }

                                                    var90 |= -897948809;
                                                    var90 >>>= 8;
                                                    var90 ^= 1413426626;
                                                    long var317 = var90;
                                                    var358 = var317 + 1L;
                                                    var358 = var317 * var358;
                                                    long var406 = var317 + 2L;
                                                    var358 *= var406;
                                                    long var318 = var317 + 3L;
                                                    var358 *= var318;
                                                    long var319 = var358 & 7L;
                                                    long var415;
                                                    int var320 = (var415 = var319 - 0L) == 0L ? 0 : (var415 < 0L ? -1 : 1);
                                                    if (var320 != 0) {
                                                        break label376;
                                                    }

                                                    if (var238 != 0) {
                                                        var90 -= -814297693;
                                                        var90 ^= -1540489172;
                                                        return null;
                                                    }

                                                    var90 -= 1406423623;
                                                    var90 ^= -235628933;
                                                    long var321 = var90;
                                                    var358 = var321 + 1L;
                                                    var358 = var321 * var358;
                                                    var406 = var321 + 2L;
                                                    var358 *= var406;
                                                    long var322 = var321 + 3L;
                                                    var358 *= var322;
                                                    long var323 = var358 & 7L;
                                                    long var416;
                                                    var238 = (var416 = var323 - 0L) == 0L ? 0 : (var416 < 0L ? -1 : 1);
                                                    if (var238 != 0) {
                                                        break label376;
                                                    }

                                                    String[] var242 = new String[]{".local", ".lan", ".home", ".internal", ".localhost", ".localdomain"};
                                                    long var324 = var2;
                                                    var358 = var324 + 1L;
                                                    var358 = var324 * var358;
                                                    var406 = var324 + 2L;
                                                    var358 *= var406;
                                                    long var325 = var324 + 3L;
                                                    var358 *= var325;
                                                    long var326 = var358 & 7L;
                                                    long var417;
                                                    var320 = (var417 = var326 - 0L) == 0L ? 0 : (var417 < 0L ? -1 : 1);
                                                    if (var320 == 0) {
                                                        var90 &= 838714300;
                                                        var90 *= -1206993933;
                                                        var90 ^= 1428293553;
                                                        long var328 = var90;
                                                        var358 = var328 + 1L;
                                                        var358 = var328 * var358;
                                                        long var329 = var358 & 1L;
                                                        long var418;
                                                        var320 = (var418 = var329 - 0L) == 0L ? 0 : (var418 < 0L ? -1 : 1);
                                                        if (var320 != 0) {
                                                            break label376;
                                                        }

                                                        String[] var243 = var242;
                                                        var320 = var242.length;
                                                        var320 = var320;
                                                        int var345 = 0;
                                                        var345 = var345;
                                                        var90 &= -890744835;
                                                        var90 ^= -1679450360;

                                                        while (true) {
                                                            int var374 = var90 + 1;
                                                            int var375 = var90 * var374;
                                                            int var8 = var90 + 2;
                                                            int var376 = var375 * var8;
                                                            var8 = var90 + 3;
                                                            int var377 = var376 * var8;
                                                            int var378 = var377 & 7;
                                                            if (var378 != 0) {
                                                                break label376;
                                                            }

                                                            if (var345 >= var320) {
                                                                var90 >>>= 23;
                                                                var90 ^= 1606222959;
                                                                var2 = var90 + 1;
                                                                var2 = var90 * var2;
                                                                int var244 = var90 + 2;
                                                                var2 *= var244;
                                                                var244 = var90 + 3;
                                                                var2 *= var244;
                                                                var2 &= 7;
                                                                if (var2 == 0) {
                                                                    return var255;
                                                                }
                                                                break label376;
                                                            }
                                                            var90 = switch (var90) {
                                                                case -1203717597 -> var90 ^ -1284946283;
                                                                case -773464275 -> {
                                                                    var90 += -1464270943;
                                                                    var90 += -602414235;
                                                                    yield var90 ^ 1778981548;
                                                                }
                                                                default -> var90 ^ 1269986333;
                                                            };
                                                            int var379 = var90 + 1;
                                                            int var380 = var90 * var379;
                                                            var8 = var90 + 2;
                                                            int var381 = var380 * var8;
                                                            var8 = var90 + 3;
                                                            int var382 = var381 * var8;
                                                            int var383 = var382 & 7;
                                                            if (var383 != 0) {
                                                                break label376;
                                                            }

                                                            String var384 = var243[var345];
                                                            Integer var392 = var2;
                                                            if (var392 == null) {
                                                                var90 >>= 1;
                                                                var90 &= 510868096;
                                                                var90 *= 831131431;
                                                                var90 ^= 480060129;
                                                                break label357;
                                                            }

                                                            var90 >>>= 14;
                                                            var90 -= -1634858306;
                                                            var90 >>>= 18;
                                                            var90 ^= -1421001085;
                                                            int var393 = var90 + 1;
                                                            var393 = var90 * var393;
                                                            int var409 = var90 + 2;
                                                            var393 *= var409;
                                                            int var410 = var90 + 3;
                                                            var393 *= var410;
                                                            var393 &= 7;
                                                            if (var393 != 0) {
                                                                break label376;
                                                            }

                                                            boolean var385 = var255.endsWith(var384);
                                                            if (var385) {
                                                                var90 &= -578623853;
                                                                var90 >>= 20;
                                                                var90 -= 2091452453;
                                                                var90 ^= -1838622351;
                                                                Integer var388 = var90;
                                                                if (var388 != null) {
                                                                    return null;
                                                                }
                                                                break label376;
                                                            }

                                                            var90 &= -1284956655;
                                                            var90 ^= -93989059;
                                                            var90 <<= 31;
                                                            var90 ^= 1891802668;
                                                            Integer var386 = var90;
                                                            if (var386 == null) {
                                                                break label376;
                                                            }

                                                            int var387 = var345 + 1;
                                                            long var398 = var2;
                                                            long var10 = var398 + 1L;
                                                            var10 = var398 * var10;
                                                            long var399 = var10 & 1L;
                                                            long var419;
                                                            var393 = (var419 = var399 - 0L) == 0L ? 0 : (var419 < 0L ? -1 : 1);
                                                            if (var393 != 0) {
                                                                var90 &= -550075511;
                                                                var90 *= -1176834281;
                                                                var90 ^= 418454617;
                                                                break label357;
                                                            }

                                                            var90 -= -289155309;
                                                            var90 *= -749920385;
                                                            var90 >>= 25;
                                                            var90 |= 1868129671;
                                                            var90 ^= 552319804;
                                                            var393 = var90 + 1;
                                                            var393 = var90 * var393;
                                                            var393 &= 1;
                                                            if (var393 != 0) {
                                                                break label376;
                                                            }

                                                            var345 = var387;
                                                            var90 -= 1484697630;
                                                            var90 ^= -1435017773;
                                                            var90 *= 1937702025;
                                                            var90 ^= -466095941;
                                                        }
                                                    }

                                                    switch (var90) {
                                                        case -1586689190:
                                                            var90 ^= 723913104;
                                                            break label357;
                                                        case -1242349718:
                                                        default:
                                                            var90 ^= 1682395626;
                                                            break label357;
                                                        case -252078307:
                                                            var90 += -246760332;
                                                            var90 += -65254131;
                                                            var90 *= -1686369539;
                                                            var90 ^= 282251975;
                                                            break label357;
                                                    }
                                                }

                                                switch (var90) {
                                                    case -1144505042:
                                                        var90 ^= 674298811;
                                                        break label357;
                                                    case -239198861:
                                                        var90 -= 590461060;
                                                        var90 *= -2090735307;
                                                        var90 ^= 82007706;
                                                        break label357;
                                                    case 966447379:
                                                    default:
                                                        var90 ^= -278798974;
                                                        break label357;
                                                }
                                            }

                                            switch (var90) {
                                                case -339698265:
                                                    var90 &= -666386974;
                                                    var90 -= -1654813774;
                                                    var90 ^= 1111952674;
                                                    break label398;
                                                case 328846948:
                                                default:
                                                    var90 ^= 942243814;
                                                    break label398;
                                                case 341482812:
                                                    var90 ^= -1947465735;
                                                    break label398;
                                            }
                                        }

                                        var90 += -1239826541;
                                        var90 >>= 29;
                                        var90 ^= 1755585746;
                                        break label398;
                                    }

                                    var90 &= 1107518480;
                                    var90 ^= 1812488406;
                                    var90 ^= 1016544807;
                                    break;
                                }

                                var90 <<= 9;
                                var90 -= 1931499383;
                                var90 ^= -1457976536;
                                var222 = var90;
                                if (var222 == null) {
                                    break label376;
                                }

                                int var225 = var255.length();
                                var225--;
                                long var297 = var2;
                                long var354 = var297 + 1L;
                                var354 = var297 * var354;
                                long var405 = var297 + 2L;
                                var354 *= var405;
                                long var298 = var297 + 3L;
                                var354 *= var298;
                                long var299 = var354 & 7L;
                                long var420;
                                int var300 = (var420 = var299 - 0L) == 0L ? 0 : (var420 < 0L ? -1 : 1);
                                if (var300 != 0) {
                                    var90 += -220806412;
                                    var90 += 343369288;
                                    var90 &= 2117751474;
                                    var90 ^= 1220425841;
                                    break;
                                }
                                var90 = switch (var90) {
                                    default -> var90 ^ -1693872256;
                                    case 1075711315 -> var90 ^ 925849023;
                                    case 1406599585 -> {
                                        var90 <<= 31;
                                        var90 ^= -1616706184;
                                        var90 |= 777842114;
                                        var90 ^= -1512039390;
                                        yield var90 ^ 2058307293;
                                    }
                                };
                                var300 = var90 + 1;
                                var300 = var90 * var300;
                                var6 = var90 + 2;
                                var300 *= var6;
                                var6 = var90 + 3;
                                var300 *= var6;
                                var300 &= 7;
                                if (var300 != 0) {
                                    break label376;
                                }

                                String var227 = var255.substring(0, var225);
                                var255 = var227;
                                var90 |= -2063685868;
                                var90 ^= -5450913;
                            }
                        } else {
                            var90 ^= -645490608;
                            var90 ^= -1043010532;
                        }
                    } else {
                        switch (var90) {
                            case -1409306903:
                                var90 ^= -1143037591;
                                break;
                            case 418657650:
                                var90 -= 1165483256;
                                var90 ^= -909112755;
                                var90 += 1356237990;
                                var90 ^= 2031936572;
                                break;
                            case 424650945:
                            default:
                                var90 ^= -1848720558;
                        }
                    }
                }

                var2 = var90 + 1;
                var2 = var90 * var2;
                var3 = var90 + 2;
                var2 *= var3;
                var90 += 3;
                var2 *= var90;
                var90 = var2 & 7;
                if (var90 == 0) {
                    IllegalStateException var198 = new IllegalStateException();
                    throw var198;
                }
                break label376;
            }

            long var204 = var90;
            long var256 = var204 + 1L;
            var256 = var204 * var256;
            var204 = var256 & 1L;
            long var421;
            int var206 = (var421 = var204 - 0L) == 0L ? 0 : (var421 < 0L ? -1 : 1);
            if (var206 == 0) {
                return null;
            }
        }

        IllegalStateException var197 = new IllegalStateException();
        throw var197;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1319206355;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        rz = var4;
    }
}
