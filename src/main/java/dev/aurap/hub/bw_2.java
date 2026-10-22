package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import net.fabricmc.loader.api.FabricLoader;

public final class bw_2 {
    private static final String FW = "auravisuals";
    private static final String K = "sounds/hit_custom.ogg";
    private static Path DT;
    public static final int W;

    private bw_2() {
    }

    public static boolean NZ(String var0, String var1) {
        int var2 = W;
        var2 ^= 733486054;
        int var3 = System.identityHashCode(var0);
        Path var4 = DZ(var0, var1);
        Integer var36 = var3;
        if (var36 == null) {
            var2 -= -1967114919;
            var2 += -1820076647;
            var2 &= -1824307638;
            var2 *= 877555017;
            var2 ^= 117956933;
            long var5 = var2;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var53;
            int var37 = (var53 = var5 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
            if (var37 == 0) {
                IllegalStateException var38 = new IllegalStateException();
                throw var38;
            }
        } else {
            var2 ^= -959310106;
            var2 |= -1648761469;
            var2 ^= 1840911601;
            var36 = var2;
            label42:
            if (var36 != null) {
                boolean var40;
                if (var4 != null) {
                    var2 -= -784478309;
                    var2 *= -28238567;
                    var2 ^= -1932667619;
                    var40 = true;
                    switch (var2) {
                        case -1604635731:
                            var2 ^= 60721401;
                            break;
                        case -1408836662:
                            var2 -= 70975938;
                            var2 ^= -747654382;
                            var2 += 1769072519;
                            var2 *= -54557021;
                            var2 ^= -68884613;
                            break;
                        case 335970646:
                        default:
                            var2 ^= 639757562;
                    }
                } else {
                    var2 = switch (var2) {
                        default -> var2 ^ -705840386;
                        case -263853814 -> {
                            var2 += 764877843;
                            var2 -= 945951664;
                            var2 |= -441672976;
                            var2 |= 811695940;
                            yield var2 ^ 7502336;
                        }
                        case 1834638429 -> var2 ^ -1378424005;
                    };
                    int var41 = var2 + 1;
                    int var42 = var2 * var41;
                    int var48 = var2 + 2;
                    int var43 = var42 * var48;
                    var48 = var2 + 3;
                    int var44 = var43 * var48;
                    int var45 = var44 & 7;
                    if (var45 != 0) {
                        break label42;
                    }

                    var40 = false;
                    var2 &= 1077129680;
                    var2 ^= 23984680;
                }

                Integer var34 = var2;
                if (var34 != null) {
                    return var40;
                }
            }
        }

        IllegalStateException var35 = new IllegalStateException();
        throw var35;
    }

    public static Path S() {
        int var0 = W;
        var0 ^= 568717055;
        Path var1 = DT;
        int var2 = of_2.Ny;
        var0 ^= var2;
        var0 ^= 130860231;
        of_2.Ny = 130860231;
        var2 = of_2.j;
        var0 ^= var2;
        var0 ^= -2009831859;
        of_2.j = -2009831859;

        var0 = switch (var0) {
            case -926318971 -> {
                var0 ^= 702441785;
                var0 *= -206479385;
                var0 += -1567094712;
                yield var0 ^ -1212754029;
            }
            default -> var0 ^ -24888545;
            case 595781037 -> var0 ^ 1008418568;
        };
        var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label31:
        if (var2 == 0) {
            Path var55;
            if (var1 == null) {
                var0 ^= 999744661;
                var0 ^= -341042224;
                long var47 = var0;
                long var4 = var47 + 1L;
                var4 = var47 * var4;
                long var6 = var47 + 2L;
                var4 *= var6;
                long var48 = var47 + 3L;
                var4 *= var48;
                long var49 = var4 & 7L;
                long var61;
                var2 = (var61 = var49 - 0L) == 0L ? 0 : (var61 < 0L ? -1 : 1);
                if (var2 != 0) {
                    break label31;
                }

                FabricLoader var51 = FabricLoader.getInstance();
                Path var52 = var51.getConfigDir();
                Path var53 = var52.resolve("auravisuals");
                Path var54 = var53.resolve("sounds");
                var0 ^= -1217621508;
                var0 >>>= 18;
                var0 ^= -1136910442;
                var0 -= 78804462;
                var0 ^= 62004005;
                DT = var54;
                var55 = var54;
                var0 |= -1450019496;
                var0 -= 1667915245;
                var0 ^= -1062971332;
            } else {
                var0 >>= 22;
                var0 >>= 26;
                var0 ^= 2138834618;
                var55 = var1;
                var0 -= 1173061051;
                var0 |= 1449921161;
                var0 |= 1953356719;
                var0 += -567697754;
                var0 ^= -942516837;
            }

            int var37 = var0 + 1;
            int var38 = var0 * var37;
            var3 = var0 + 2;
            int var39 = var38 * var3;
            var0 += 3;
            int var40 = var39 * var0;
            var0 = var40 & 7;
            if (var0 == 0) {
                return var55;
            }
        }

        IllegalArgumentException var36 = new IllegalArgumentException();
        throw var36;
    }

    public static Path DZ(String var0, String var1) {
        byte var252 = 0;
        label339: {
            int var137;
            Path var208;
            label355: {
                var137 = W;
                var137 ^= -1906888415;
                int var3 = System.identityHashCode(var0);
                boolean var4 = "auravisuals".equals(var0);
                Integer var5 = var3;
                if (var5 != null) {
                    var137 = switch (var137) {
                        default -> var137 ^ -923303636;
                        case 1335226610 -> var137 ^ 1259156184;
                        case 1736155483 -> {
                            var137 >>>= 1;
                            var137 ^= 1969573013;
                            var137 *= 715722083;
                            yield var137 ^ 1191446702;
                        }
                    };
                    if (!var4) {
                        var137 *= 1295906713;
                        var137 ^= 1201338466;
                        var137 *= 760783591;
                        var137 ^= 2132398575;
                        int var215 = var137 + 1;
                        int var216 = var137 * var215;
                        int var217 = var216 & 1;
                        if (var217 == 0) {
                            return null;
                        }
                        break label339;
                    }

                    var137 -= 1497086104;
                    var137 -= 196147915;
                    var137 ^= 838188727;
                    long var201 = var137;
                    long var6 = var201 + 1L;
                    var6 = var201 * var6;
                    long var202 = var6 & 1L;
                    long var422;
                    int var203 = (var422 = var202 - 0L) == 0L ? 0 : (var422 < 0L ? -1 : 1);
                    if (var203 != 0) {
                        break label339;
                    }

                    byte var218 = -1;
                    var6 = var3;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var423;
                    int var250 = (var423 = var6 - 0L) == 0L ? 0 : (var423 < 0L ? -1 : 1);
                    if (var250 != 0) {
                        switch (var137) {
                            case -1120457964:
                                var137 <<= 5;
                                var137 -= 1261244272;
                                var137 &= -1450598284;
                                var137 ^= 1740249791;
                                var137 ^= -635131523;
                                break;
                            case -158254321:
                                var137 ^= -937922071;
                                break;
                            case 1509361645:
                            default:
                                var137 ^= 1443467534;
                        }
                    } else {
                        label354: {
                            var137 -= 1787796548;
                            var137 >>>= 19;
                            var137 ^= 1528807518;
                            int var251 = var1.hashCode();
                            label331:
                            switch (var251) {
                                case -1599992408:
                                    var137 = switch (var137) {
                                        default -> var137 ^ 1926929152;
                                        case 881797503 -> var137 ^ 920933254;
                                        case 1528809994 -> {
                                            var137 &= -2023594535;
                                            yield var137 ^ 737686675;
                                        }
                                    };
                                    Integer var306 = var137;
                                    if (var306 == null) {
                                        break label339;
                                    }

                                    boolean var204 = var1.equals("sounds/death_custom.ogg");
                                    int var307 = var3 + 1;
                                    var307 = var3 * var307;
                                    int var372 = var3 + 2;
                                    var307 *= var372;
                                    int var373 = var3 + 3;
                                    var307 *= var373;
                                    var307 &= 7;
                                    if (var307 != 0) {
                                        switch (var137) {
                                            case -1476055805:
                                            default:
                                                var137 ^= -1086186744;
                                                break label354;
                                            case -412149174:
                                                var137 ^= -1202506973;
                                                break label354;
                                            case 687502491:
                                                var137 -= 1171275300;
                                                var137 |= 1926459165;
                                                var137 ^= 1206766765;
                                                break label354;
                                        }
                                    }

                                    var137 ^= -1817365756;
                                    var137 += 1144882287;
                                    var137 ^= 253562539;
                                    long var312 = var137;
                                    long var389 = var312 + 1L;
                                    var389 = var312 * var389;
                                    long var418 = var312 + 2L;
                                    var389 *= var418;
                                    long var313 = var312 + 3L;
                                    var389 *= var313;
                                    long var314 = var389 & 7L;
                                    long var424;
                                    var307 = (var424 = var314 - 0L) == 0L ? 0 : (var424 < 0L ? -1 : 1);
                                    if (var307 != 0) {
                                        break label339;
                                    }

                                    if (var204) {
                                        var137 = switch (var137) {
                                            default -> var137 ^ -1052844622;
                                            case -259407195 -> {
                                                var137 ^= 2080314680;
                                                var137 &= 1569924087;
                                                yield var137 ^ -625033809;
                                            }
                                            case 1717240290 -> var137 ^ -321703414;
                                        };
                                        long var316 = var137;
                                        var389 = var316 + 1L;
                                        var389 = var316 * var389;
                                        long var317 = var389 & 1L;
                                        long var425;
                                        int var205 = (var425 = var317 - 0L) == 0L ? 0 : (var425 < 0L ? -1 : 1);
                                        if (var205 != 0) {
                                            break label339;
                                        }

                                        byte var206 = 3;
                                        long var318 = var3;
                                        var389 = var318 + 1L;
                                        var389 = var318 * var389;
                                        long var319 = var389 & 1L;
                                        long var426;
                                        var307 = (var426 = var319 - 0L) == 0L ? 0 : (var426 < 0L ? -1 : 1);
                                        if (var307 != 0) {
                                            var137 += -1094521467;
                                            var137 *= 1045079441;
                                            var137 -= 487762263;
                                            var137 *= -1790949795;
                                            var137 ^= 326731178;
                                            break label354;
                                        }

                                        var137 |= 37266158;
                                        var137 *= 1157621603;
                                        var137 ^= -319379702;
                                        long var321 = var137;
                                        var389 = var321 + 1L;
                                        var389 = var321 * var389;
                                        long var322 = var389 & 1L;
                                        long var427;
                                        var307 = (var427 = var322 - 0L) == 0L ? 0 : (var427 < 0L ? -1 : 1);
                                        if (var307 != 0) {
                                            break label339;
                                        }

                                        var252 = var206;
                                        var137 *= -2040354999;
                                        var137 ^= -1810763443;
                                    } else {
                                        var137 = switch (var137) {
                                            case -992844119 -> var137 ^ 824658310;
                                            case -259407195 -> {
                                                var137 &= 491293678;
                                                yield var137 ^ -34438716;
                                            }
                                            default -> var137 ^ 802157325;
                                        };
                                        long var324 = var137;
                                        var389 = var324 + 1L;
                                        var389 = var324 * var389;
                                        var418 = var324 + 2L;
                                        var389 *= var418;
                                        long var325 = var324 + 3L;
                                        var389 *= var325;
                                        long var326 = var389 & 7L;
                                        long var428;
                                        int var207 = (var428 = var326 - 0L) == 0L ? 0 : (var428 < 0L ? -1 : 1);
                                        if (var207 != 0) {
                                            break label339;
                                        }

                                        var252 = var218;
                                        var137 += -857420858;
                                        var137 ^= -635916069;
                                    }
                                    break;
                                case -663301655:
                                    var137 = switch (var137) {
                                        default -> var137 ^ -199318100;
                                        case 1528809994 -> {
                                            var137 ^= -692561840;
                                            yield var137 ^ 144332305;
                                        }
                                        case 1899282485 -> var137 ^ 736888473;
                                    };
                                    int var300 = (var1.equals("sounds/hit_custom.ogg")) ? 1 : 0;
                                    Integer var358 = var3;
                                    if (var358 == null) {
                                        switch (var137) {
                                            case -2059549621:
                                                var137 &= -215782780;
                                                var137 *= 1898134161;
                                                var137 *= -1988326311;
                                                var137 ^= -55184430;
                                                break label354;
                                            case 727206509:
                                            default:
                                                var137 ^= -720943675;
                                                break label354;
                                            case 1079262402:
                                                var137 ^= -297690087;
                                                break label354;
                                        }
                                    }

                                    var137 &= 1453101453;
                                    var137 ^= -86021026;
                                    int var359 = var137 + 1;
                                    int var360 = var137 * var359;
                                    int var387 = var137 + 2;
                                    int var361 = var360 * var387;
                                    var387 = var137 + 3;
                                    int var362 = var361 * var387;
                                    int var363 = var362 & 7;
                                    if (var363 != 0) {
                                        break label339;
                                    }

                                    if (var300 != 0) {
                                        var137 *= -1287042155;
                                        var137 ^= 2127343871;
                                        var300 = var137 + 1;
                                        var300 = var137 * var300;
                                        var300 &= 1;
                                        if (var300 != 0) {
                                            break label339;
                                        }

                                        byte var304 = 0;
                                        var8 = var3;
                                        var10 = var8 + 1L;
                                        var10 = var8 * var10;
                                        long var420 = var8 + 2L;
                                        var10 *= var420;
                                        var8 += 3L;
                                        var10 *= var8;
                                        var8 = var10 & 7L;
                                        long var432;
                                        int var367 = (var432 = var8 - 0L) == 0L ? 0 : (var432 < 0L ? -1 : 1);
                                        if (var367 != 0) {
                                            switch (var137) {
                                                case -1849271083:
                                                default:
                                                    var137 ^= -103149483;
                                                    break label354;
                                                case -1764115620:
                                                    var137 *= -1088535659;
                                                    var137 &= -35190633;
                                                    var137 += -34629102;
                                                    var137 ^= -345757372;
                                                    break label354;
                                                case -1041548465:
                                                    var137 ^= 1811713540;
                                                    break label354;
                                            }
                                        }
                                        var137 = switch (var137) {
                                            case -1764115620 -> {
                                                var137 >>>= 17;
                                                var137 <<= 10;
                                                yield var137 ^ -627351132;
                                            }
                                            default -> var137 ^ 122058665;
                                            case 862496128 -> var137 ^ 1954396147;
                                        };
                                        var8 = var137;
                                        var10 = var8 + 1L;
                                        var10 = var8 * var10;
                                        var420 = var8 + 2L;
                                        var10 *= var420;
                                        var8 += 3L;
                                        var10 *= var8;
                                        var8 = var10 & 7L;
                                        long var433;
                                        int var371 = (var433 = var8 - 0L) == 0L ? 0 : (var433 < 0L ? -1 : 1);
                                        if (var371 != 0) {
                                            break label339;
                                        }

                                        var252 = var304;
                                        switch (var137) {
                                            case -1530038243:
                                                var137 ^= -976319812;
                                                break label331;
                                            case -1489265161:
                                            default:
                                                var137 ^= 999367010;
                                                break label331;
                                            case -608775772:
                                                var137 <<= 13;
                                                var137 ^= -1158479875;
                                        }
                                    } else {
                                        var137 &= -438644949;
                                        var137 *= 1139274297;
                                        var137 ^= -1201720362;
                                        var137 ^= 1929521910;
                                        Integer var305 = var137;
                                        if (var305 == null) {
                                            break label339;
                                        }

                                        var252 = var218;
                                        var137 -= -665281610;
                                        var137 |= -30460854;
                                        var137 ^= -1631993822;
                                    }
                                    break;
                                case 101684882:
                                    var137 = switch (var137) {
                                        case -1295160757 -> var137 ^ -772588371;
                                        default -> var137 ^ -860523594;
                                        case 1528809994 -> {
                                            var137 *= -1575972327;
                                            yield var137 ^ 1461802647;
                                        }
                                    };
                                    long var290 = var137;
                                    long var381 = var290 + 1L;
                                    var381 = var290 * var381;
                                    long var417 = var290 + 2L;
                                    var381 *= var417;
                                    var290 += 3L;
                                    var381 *= var290;
                                    var290 = var381 & 7L;
                                    long var429;
                                    int var293 = (var429 = var290 - 0L) == 0L ? 0 : (var429 < 0L ? -1 : 1);
                                    if (var293 != 0) {
                                        break label339;
                                    }

                                    boolean var294 = var1.equals("sounds/hit_custom_crit.ogg");
                                    int var343 = var3 + 1;
                                    int var344 = var3 * var343;
                                    int var345 = var344 & 1;
                                    if (var345 != 0) {
                                        var137 -= 300706755;
                                        var137 |= 103441908;
                                        var137 *= -1083636477;
                                        var137 ^= 646057000;
                                        break label354;
                                    }

                                    var137 &= 161481430;
                                    var137 ^= 1273307894;
                                    var8 = var137;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    long var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var430;
                                    int var349 = (var430 = var8 - 0L) == 0L ? 0 : (var430 < 0L ? -1 : 1);
                                    if (var349 != 0) {
                                        break label339;
                                    }

                                    if (var294) {
                                        var137 += -478355770;
                                        var137 ^= -929011146;
                                        Integer var295 = var137;
                                        if (var295 == null) {
                                            break label339;
                                        }

                                        byte var296 = 1;
                                        var8 = var3;
                                        var10 = var8 + 1L;
                                        var10 = var8 * var10;
                                        var8 = var10 & 1L;
                                        long var431;
                                        int var352 = (var431 = var8 - 0L) == 0L ? 0 : (var431 < 0L ? -1 : 1);
                                        if (var352 != 0) {
                                            var137 += -1800701188;
                                            var137 &= 847828237;
                                            var137 ^= -1231128614;
                                            break label354;
                                        }

                                        var137 <<= 31;
                                        var137 |= 572313330;
                                        var137 ^= -1285665987;
                                        var137 -= -970541554;
                                        var137 ^= -1031440609;
                                        int var353 = var137 + 1;
                                        int var354 = var137 * var353;
                                        int var385 = var137 + 2;
                                        int var355 = var354 * var385;
                                        int var386 = var137 + 3;
                                        int var356 = var355 * var386;
                                        int var357 = var356 & 7;
                                        if (var357 != 0) {
                                            break label339;
                                        }

                                        var252 = var296;
                                        var137 ^= 229660654;
                                        var137 ^= 1692963021;
                                    } else {
                                        var137 *= -1786010337;
                                        var137 ^= -1401405934;
                                        var137 ^= -1313775917;
                                        int var297 = var137 + 1;
                                        int var298 = var137 * var297;
                                        int var299 = var298 & 1;
                                        if (var299 != 0) {
                                            break label339;
                                        }

                                        var252 = var218;
                                        var137 -= -735870520;
                                        var137 += 108136443;
                                        var137 += -1016209982;
                                        var137 <<= 2;
                                        var137 ^= 1238743789;
                                    }
                                    break;
                                case 501419862:
                                    var137 *= -1628601119;
                                    var137 &= -577295524;
                                    var137 >>>= 7;
                                    var137 ^= 2108757789;
                                    boolean var253 = var1.equals("sounds/hit_custom_sweep.ogg");
                                    long var7 = var3;
                                    long var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    long var11 = var7 + 2L;
                                    var9 *= var11;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var434;
                                    int var284 = (var434 = var7 - 0L) == 0L ? 0 : (var434 < 0L ? -1 : 1);
                                    if (var284 != 0) {
                                        var137 <<= 23;
                                        var137 -= -53856035;
                                        var137 += 890081040;
                                        var137 >>= 7;
                                        var137 ^= 1269773694;
                                        break label354;
                                    }

                                    var137 <<= 9;
                                    var137 |= 1685053383;
                                    var137 |= 1910045500;
                                    var137 ^= -1800899251;
                                    if (var253) {
                                        var137 -= 309125179;
                                        var137 >>= 17;
                                        var137 |= -1074906176;
                                        var137 ^= 2052468910;
                                        var6 = var137;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        var6 = var8 & 1L;
                                        long var435;
                                        int var256 = (var435 = var6 - 0L) == 0L ? 0 : (var435 < 0L ? -1 : 1);
                                        if (var256 != 0) {
                                            break label339;
                                        }

                                        byte var257 = 2;
                                        int var285 = var3 + 1;
                                        int var286 = var3 * var285;
                                        int var341 = var3 + 2;
                                        int var287 = var286 * var341;
                                        int var342 = var3 + 3;
                                        int var288 = var287 * var342;
                                        int var289 = var288 & 7;
                                        if (var289 != 0) {
                                            switch (var137) {
                                                case -2052469925:
                                                    var137 ^= 44368892;
                                                    var137 ^= 857373557;
                                                    break label354;
                                                case -1335488087:
                                                default:
                                                    var137 ^= 667681389;
                                                    break label354;
                                                case -1103840900:
                                                    var137 ^= 290220985;
                                                    break label354;
                                            }
                                        }

                                        var137 -= 1918123966;
                                        var137 ^= -936892538;
                                        var137 ^= -1639056960;
                                        var137 -= -1619295808;
                                        var137 ^= 1689281540;
                                        var252 = var257;
                                        var137 |= 333464977;
                                        var137 += -956512152;
                                        var137 += -87518796;
                                        var137 -= -1078497412;
                                        var137 ^= -1254842430;
                                    } else {
                                        var137 = switch (var137) {
                                            case -480802126 -> {
                                                var137 += -364234115;
                                                yield var137 ^ 351730027;
                                            }
                                            default -> var137 ^ -1305006239;
                                            case 259666665 -> var137 ^ 336891805;
                                        };
                                        var252 = var218;
                                        var137 ^= 1606373654;
                                        var137 >>>= 27;
                                        var137 += 1544568769;
                                        var137 ^= 1020674092;
                                    }
                                    break;
                                default:
                                    var137 -= -120755862;
                                    var137 ^= -1478558361;
                                    var252 = var218;
                                    var137 <<= 5;
                                    var137 |= 365276863;
                                    var137 *= -891455221;
                                    var137 ^= -2123840504;
                            }

                            label299:
                            switch (var252) {
                                case 0:
                                    var137 -= -665861402;
                                    var137 ^= -1947476680;
                                    Path var245 = Ss();
                                    int var275 = var3 + 1;
                                    int var276 = var3 * var275;
                                    int var335 = var3 + 2;
                                    int var277 = var276 * var335;
                                    var3 += 3;
                                    int var278 = var277 * var3;
                                    var3 = var278 & 7;
                                    if (var3 == 0) {
                                        var137 *= -1095983239;
                                        var137 ^= -317668285;
                                        var6 = var137;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        var6 = var8 & 1L;
                                        long var436;
                                        var3 = (var436 = var6 - 0L) == 0L ? 0 : (var436 < 0L ? -1 : 1);
                                        if (var3 != 0) {
                                            break label339;
                                        }

                                        var208 = var245;
                                        switch (var137) {
                                            case -440840732:
                                            default:
                                                var137 ^= -1538498464;
                                                break label355;
                                            case 248520662:
                                                var137 ^= -624019518;
                                                break label355;
                                            case 413361012:
                                                var137 &= 1516152519;
                                                var137 ^= -782583975;
                                                var137 &= -514368067;
                                                var137 -= 2081159477;
                                                var137 ^= -587161904;
                                                break label355;
                                        }
                                    }

                                    switch (var137) {
                                        case -2072694708:
                                            var137 ^= -1977100585;
                                            break label299;
                                        case 60645423:
                                            var137 += 1516136373;
                                            var137 >>= 20;
                                            var137 ^= -1273580019;
                                            break label299;
                                        case 1956809568:
                                        default:
                                            var137 ^= 1512701774;
                                            break label299;
                                    }
                                case 1:
                                    var137 &= -331201242;
                                    var137 |= 1745239209;
                                    var137 ^= 374621764;
                                    long var238 = var137;
                                    long var331 = var238 + 1L;
                                    var331 = var238 * var331;
                                    long var239 = var331 & 1L;
                                    long var439;
                                    int var240 = (var439 = var239 - 0L) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                                    if (var240 != 0) {
                                        break label339;
                                    }

                                    var240 = var137 * -900088629;
                                    var240 *= -1460947507;
                                    var240 ^= -1939508655;
                                    Path var244 = P("crit.ogg", var240);
                                    int var270 = var3 + 1;
                                    int var271 = var3 * var270;
                                    int var333 = var3 + 2;
                                    int var272 = var271 * var333;
                                    int var334 = var3 + 3;
                                    int var273 = var272 * var334;
                                    int var274 = var273 & 7;
                                    if (var274 == 0) {
                                        var137 = switch (var137) {
                                            default -> var137 ^ 1359453600;
                                            case 2047515026 -> var137 ^ 1077493198;
                                            case 2115124201 -> {
                                                var137 &= 1038021517;
                                                var137 *= -306954255;
                                                yield var137 ^ -81470094;
                                            }
                                        };
                                        var208 = var244;
                                        var137 &= -2065718152;
                                        var137 -= -1982115709;
                                        var137 |= -1638232883;
                                        var137 ^= 1715100405;
                                        break label355;
                                    }

                                    var137 |= -347729208;
                                    var137 >>= 14;
                                    var137 += -930394969;
                                    var137 ^= 2090727981;
                                    break;
                                case 2:
                                    var137 = switch (var137) {
                                        default -> var137 ^ -1580384428;
                                        case 1230858634 -> var137 ^ -1439409657;
                                        case 1623621629 -> {
                                            var137 += -602972583;
                                            var137 *= 987519171;
                                            var137 += -296719789;
                                            yield var137 ^ 982929041;
                                        }
                                    };
                                    long var229 = var137;
                                    long var327 = var229 + 1L;
                                    var327 = var229 * var327;
                                    long var230 = var327 & 1L;
                                    long var437;
                                    int var231 = (var437 = var230 - 0L) == 0L ? 0 : (var437 < 0L ? -1 : 1);
                                    if (var231 != 0) {
                                        break label339;
                                    }

                                    var231 = var137 * -2140586487;
                                    var231 += 1973269298;
                                    var231 -= 1166995663;
                                    var231 >>>= 5;
                                    var231 ^= -561678584;
                                    Path var237 = P("sweep.ogg", var231);
                                    var6 = var3;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var6 = var8 & 1L;
                                    long var438;
                                    int var264 = (var438 = var6 - 0L) == 0L ? 0 : (var438 < 0L ? -1 : 1);
                                    if (var264 == 0) {
                                        var137 = switch (var137) {
                                            default -> var137 ^ -837189330;
                                            case 512814076 -> var137 ^ 1125691736;
                                            case 1830296388 -> {
                                                var137 |= -1781507243;
                                                yield var137 ^ 1337806120;
                                            }
                                        };
                                        int var265 = var137 + 1;
                                        int var266 = var137 * var265;
                                        int var329 = var137 + 2;
                                        int var267 = var266 * var329;
                                        int var330 = var137 + 3;
                                        int var268 = var267 * var330;
                                        int var269 = var268 & 7;
                                        if (var269 != 0) {
                                            break label339;
                                        }

                                        var208 = var237;
                                        var137 <<= 6;
                                        var137 *= -1119633657;
                                        var137 -= -1122221266;
                                        var137 ^= -887139670;
                                        break label355;
                                    }

                                    var137 >>>= 28;
                                    var137 *= 1052824567;
                                    var137 ^= -862829544;
                                    break;
                                case 3:
                                    var137 ^= 632268629;
                                    var137 ^= -216272716;
                                    var208 = S();
                                    var208 = var208.resolve("death.ogg");
                                    int var219 = var3 + 1;
                                    var219 = var3 * var219;
                                    int var258 = var3 + 2;
                                    var219 *= var258;
                                    int var259 = var3 + 3;
                                    var219 *= var259;
                                    var219 &= 7;
                                    if (var219 == 0) {
                                        var137 -= 1335347800;
                                        var137 <<= 29;
                                        var137 *= -282017145;
                                        var137 -= -1788800891;
                                        var137 ^= -156162081;
                                        var219 = var137 + 1;
                                        var219 = var137 * var219;
                                        int var260 = var137 + 2;
                                        var219 *= var260;
                                        int var261 = var137 + 3;
                                        var219 *= var261;
                                        var219 &= 7;
                                        if (var219 != 0) {
                                            break label339;
                                        }

                                        var208 = var208;
                                        var137 *= 47364487;
                                        var137 ^= -604121276;
                                        break label355;
                                    }

                                    var137 -= -876994790;
                                    var137 += -1440007029;
                                    var137 ^= 552990303;
                                    break;
                                default:
                                    var137 = switch (var137) {
                                        case -80973369 -> var137 ^ -34191457;
                                        case 1623621629 -> {
                                            var137 <<= 5;
                                            var137 &= -1591258712;
                                            var137 -= 2078668552;
                                            yield var137 ^ 524127531;
                                        }
                                        default -> var137 ^ 1624512775;
                                    };
                                    var208 = null;
                                    var137 -= -305181143;
                                    var137 += 575873823;
                                    var137 &= -1964062089;
                                    var137 ^= 577818917;
                                    var137 ^= 815062076;
                                    break label355;
                            }
                        }
                    }
                } else {
                    var137 *= 406665045;
                    var137 ^= 1383109605;
                }

                long var187 = var137;
                long var211 = var187 + 1L;
                long var212 = var187 * var211;
                long var281 = var187 + 2L;
                long var213 = var212 * var281;
                long var188 = var187 + 3L;
                long var214 = var213 * var188;
                long var189 = var214 & 7L;
                long var440;
                var137 = (var440 = var189 - 0L) == 0L ? 0 : (var440 < 0L ? -1 : 1);
                if (var137 == 0) {
                    IllegalStateException var191 = new IllegalStateException();
                    throw var191;
                }
                break label339;
            }

            Integer var200 = var137;
            if (var200 != null) {
                return var208;
            }
        }

        RuntimeException var196 = new RuntimeException();
        throw var196;
    }

    private static Path P(String var0, int var1) {
        label53: {
            int var3 = System.identityHashCode(var0);
            Path var4 = S();
            var4 = var4.resolve(var0);
            long var5 = f(var4);
            long var73;
            int var52 = (var73 = var5 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
            Integer var6 = var3;
            int var13;
            if (var6 == null) {
                var13 = var1 * 1919203803;
                var13 ^= -142737242;
                var13 ^= 542845949;
            } else {
                var13 = switch (var1) {
                    case -1909465464 -> var1 ^ -1327052275;
                    case -555858314 -> {
                        var13 = var1 >>> 8;
                        var13 &= -1438219135;
                        var13 *= 1233071115;
                        yield var13 ^ 91746411;
                    }
                    default -> var1 ^ 1337601926;
                };
                long var60 = var13;
                long var8 = var60 + 1L;
                var8 = var60 * var8;
                long var61 = var8 & 1L;
                long var74;
                int var62 = (var74 = var61 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                if (var62 != 0) {
                    break label53;
                }

                if (var52 != 0) {
                    var13 <<= 18;
                    var13 |= -1234092081;
                    var13 |= -708529023;
                    var13 += -2128613549;
                    var13 ^= -556267348;
                    int var57 = var13 + 1;
                    int var58 = var13 * var57;
                    int var59 = var58 & 1;
                    if (var59 != 0) {
                        break label53;
                    }

                    switch (var13) {
                        case -1480218738:
                            var13 |= -2044402429;
                            var13 ^= -1950960906;
                            var13 *= -494094379;
                            var13 ^= -454181627;
                            return var4;
                        case -1411161598:
                        default:
                            var13 ^= -78725693;
                            return var4;
                        case -691512631:
                            var13 ^= -1884496004;
                            return var4;
                    }
                }

                var13 &= -728346147;
                var13 ^= 784790043;
                var5 = var13;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var75;
                int var55 = (var75 = var5 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                if (var55 != 0) {
                    break label53;
                }

                Path var56 = Ss();
                long var63 = var3;
                var8 = var63 + 1L;
                var8 = var63 * var8;
                long var10 = var63 + 2L;
                var8 *= var10;
                long var64 = var63 + 3L;
                var8 *= var64;
                long var65 = var8 & 7L;
                long var76;
                var3 = (var76 = var65 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var13 ^= 1843169596;
                    var13 ^= 197905619;
                    var13 += 71484325;
                    var13 ^= 1004702410;
                    return var56;
                }

                var13 |= -556496943;
                var13 |= -1841769271;
                var13 |= 1169779512;
                var13 |= 907359440;
                var13 ^= 1945327698;
            }

            long var24 = var13;
            long var47 = var24 + 1L;
            long var48 = var24 * var47;
            long var66 = var24 + 2L;
            long var49 = var48 * var66;
            long var25 = var24 + 3L;
            long var50 = var49 * var25;
            long var26 = var50 & 7L;
            long var77;
            var13 = (var77 = var26 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
            if (var13 == 0) {
                UnsupportedOperationException var28 = new UnsupportedOperationException();
                throw var28;
            }
        }

        AssertionError var44 = new AssertionError();
        throw var44;
    }

    public static Path Ss() {
        int var0 = W;
        var0 ^= 995302854;
        Path var1 = S();
        var0 |= 1435131909;
        var0 ^= -183294273;
        var0 += 1923763909;
        var0 -= -2058598625;
        var0 ^= 1298451364;
        return var1.resolve("hit.ogg");
    }

    public static long f(Path var0) {
        LinkOption[] var184 = null;
        BasicFileAttributes var190 = null;
        long var228 = 0L;
        long var240 = 0L;
        java.nio.file.attribute.FileTime var249 = null;
        long var251 = 0L;
        label206: {
            int var43;
            try {
                var43 = W;
                var43 ^= -1184536984;
                Object var23 = null;
            } catch (Exception var22Failure) {
                if (!(var22Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var22Failure);
                IOException var22 = (IOException)var22Failure;

                var43 = W;
                var43 ^= 1008913017;
                Throwable var3 = W(var22);
                IOException var1 = (IOException)var3;
                var43 += 1237374405;
                var43 *= 1899899719;
                var43 *= 1247085897;
                var43 ^= -1681541643;
                int var172 = var43 + 1;
                int var173 = var43 * var172;
                int var174 = var173 & 1;
                if (var174 != 0) {
                    break label206;
                }

                return 0L;
            }
            var43 = switch (var43) {
                case -1040292869 -> var43 ^ -406948513;
                case 1347024402 -> {
                    var43 ^= 2009801626;
                    yield var43 ^ 1032501487;
                }
                default -> var43 ^ 1212014909;
            };
            int var175 = var43 + 1;
            var175 = var43 * var175;
            int var4 = var43 + 2;
            var175 *= var4;
            var4 = var43 + 3;
            var175 *= var4;
            var175 &= 7;
            label137:
            if (var175 == 0) {
                try {
                    var184 = new LinkOption[0];
                    var43 |= 1244658608;
                    var43 &= 2132417218;
                    var43 >>= 7;
                    var43 ^= 1429335396;
                    var43 ^= 1615616197;
                } catch (Exception var21Failure) {
                if (!(var21Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var21Failure);
                IOException var21 = (IOException)var21Failure;

                    var43 = W;
                    var43 ^= 1008913017;
                    Throwable var180 = W(var21);
                    IOException var24 = (IOException)var180;
                    var43 += 1237374405;
                    var43 *= 1899899719;
                    var43 *= 1247085897;
                    var43 ^= -1681541643;
                    var175 = var43 + 1;
                    var175 = var43 * var175;
                    var175 &= 1;
                    if (var175 != 0) {
                        break label137;
                    }

                    return 0L;
                }

                long var234 = var43;
                long var6 = var234 + 1L;
                var6 = var234 * var6;
                long var235 = var6 & 1L;
                long var281;
                var4 = (var281 = var235 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                label136:
                if (var4 == 0) {
                    try {
                        BasicFileAttributes var189 = Files.readAttributes(var0, BasicFileAttributes.class, var184);
                        var43 *= 967596749;
                        var43 &= -272691088;
                        var43 |= 2003770046;
                        var43 *= 430516689;
                        var43 ^= 628115039;
                        var190 = var189;
                        var43 <<= 7;
                        var43 *= -1346754615;
                        var43 += 1145593322;
                        var43 -= 563856047;
                        var43 ^= -1053400016;
                    } catch (IOException var20) {
                        var43 = W;
                        var43 ^= 1008913017;
                        Throwable var185 = W(var20);
                        IOException var25 = (IOException)var185;
                        var43 += 1237374405;
                        var43 *= 1899899719;
                        var43 *= 1247085897;
                        var43 ^= -1681541643;
                        var175 = var43 + 1;
                        var175 = var43 * var175;
                        var175 &= 1;
                        if (var175 != 0) {
                            break label136;
                        }

                        return 0L;
                    }

                    Integer var237 = var43;
                    label135:
                    if (var237 != null) {
                        label194: {
                            label176: {
                                label207: {
                                    try {
                                        boolean var238 = var190.isRegularFile();
                                        var43 -= 809514589;
                                        var43 += -296417706;
                                        var43 >>= 14;
                                        var43 >>= 5;
                                        var43 ^= -777980823;
                                        if (!var238) {
                                            break label207;
                                        }
                                    } catch (Exception var19Failure) {
                if (!(var19Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var19Failure);
                IOException var19 = (IOException)var19Failure;

                                        var43 = W;
                                        var43 ^= 1008913017;
                                        Throwable var191 = W(var19);
                                        IOException var26 = (IOException)var191;
                                        var43 += 1237374405;
                                        var43 *= 1899899719;
                                        var43 *= 1247085897;
                                        var43 ^= -1681541643;
                                        var175 = var43 + 1;
                                        var175 = var43 * var175;
                                        var175 &= 1;
                                        if (var175 != 0) {
                                            break label135;
                                        }

                                        return 0L;
                                    }

                                    var43 >>>= 30;
                                    var43 ^= 1315754733;

                                    var43 = switch (var43) {
                                        default -> var43 ^ -1606633196;
                                        case -159894360 -> var43 ^ -73384307;
                                        case 1315754734 -> {
                                            var43 += -2045498110;
                                            var43 &= -1527296739;
                                            var43 ^= -1790118711;
                                            var43 += 655274763;
                                            yield var43 ^ -365730276;
                                        }
                                    };
                                    var237 = var43;
                                    if (var237 == null) {
                                        break label135;
                                    }

                                    try {
                                        var240 = var190.size();
                                        var43 >>>= 7;
                                        var43 ^= -1471379393;
                                    } catch (Exception var17Failure) {
                if (!(var17Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var17Failure);
                IOException var17 = (IOException)var17Failure;

                                        var43 = W;
                                        var43 ^= 1008913017;
                                        Throwable var195 = W(var17);
                                        IOException var27 = (IOException)var195;
                                        var43 += 1237374405;
                                        var43 *= 1899899719;
                                        var43 *= 1247085897;
                                        var43 ^= -1681541643;
                                        var175 = var43 + 1;
                                        var175 = var43 * var175;
                                        var175 &= 1;
                                        if (var175 != 0) {
                                            break label135;
                                        }

                                        return 0L;
                                    }

                                    int var259 = var43 + 1;
                                    int var260 = var43 * var259;
                                    int var261 = var260 & 1;
                                    if (var261 != 0) {
                                        break label135;
                                    }

                                    try {
                                        long var282;
                                        int var241 = (var282 = var240 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                                        if (var241 != 0) {
                                            break label194;
                                        }
                                    } catch (Exception var18Failure) {
                if (!(var18Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var18Failure);
                IOException var18 = (IOException)var18Failure;

                                        var43 = W;
                                        var43 ^= 1008913017;
                                        Throwable var199 = W(var18);
                                        IOException var28 = (IOException)var199;
                                        var43 += 1237374405;
                                        var43 *= 1899899719;
                                        var43 *= 1247085897;
                                        var43 ^= -1681541643;
                                        var175 = var43 + 1;
                                        var175 = var43 * var175;
                                        var175 &= 1;
                                        if (var175 != 0) {
                                            break label135;
                                        }

                                        return 0L;
                                    }

                                    var43 ^= -1890470675;
                                    var43 |= 910778159;
                                    var43 ^= 1200032434;
                                    break label176;
                                }

                                switch (var43) {
                                    case -777981254:
                                        var43 &= 1423258746;
                                        var43 -= 79426608;
                                        var43 &= -2012773771;
                                        var43 ^= 2038101341;
                                        break;
                                    case -187389009:
                                    default:
                                        var43 ^= -1743988988;
                                        break;
                                    case 603553223:
                                        var43 ^= 206415189;
                                }
                            }

                            try {
                                var43 *= -7330819;
                                var43 -= -753161594;
                                var43 ^= 715341216;
                            } catch (Exception var16Failure) {
                if (!(var16Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var16Failure);
                IOException var16 = (IOException)var16Failure;

                                var43 = W;
                                var43 ^= 1008913017;
                                Throwable var229 = W(var16);
                                IOException var34 = (IOException)var229;
                                var43 += 1237374405;
                                var43 *= 1899899719;
                                var43 *= 1247085897;
                                var43 ^= -1681541643;
                                var175 = var43 + 1;
                                var175 = var43 * var175;
                                var175 &= 1;
                                if (var175 != 0) {
                                    break label135;
                                }

                                return 0L;
                            }

                            Integer var35 = var43;
                            if (var35 != null) {
                                return 0L;
                            }
                            break label135;
                        }
                        var43 = switch (var43) {
                            case -1444325334 -> {
                                var43 += 1158719903;
                                var43 >>>= 29;
                                var43 >>= 27;
                                yield var43 ^ 697995036;
                            }
                            default -> var43 ^ -1531200084;
                            case 1227290818 -> var43 ^ -760530492;
                        };
                        long var242 = var43;
                        var6 = var242 + 1L;
                        var6 = var242 * var6;
                        long var8 = var242 + 2L;
                        var6 *= var8;
                        long var243 = var242 + 3L;
                        var6 *= var243;
                        long var244 = var6 & 7L;
                        long var283;
                        int var245 = (var283 = var244 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                        label130:
                        if (var245 == 0) {
                            try {
                                var43 &= -158500465;
                                var43 |= -1435470355;
                                var43 -= 328777933;
                                var43 ^= 1011334365;
                            } catch (Exception var15Failure) {
                if (!(var15Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var15Failure);
                IOException var15 = (IOException)var15Failure;

                                var43 = W;
                                var43 ^= 1008913017;
                                Throwable var203 = W(var15);
                                IOException var29 = (IOException)var203;
                                var43 += 1237374405;
                                var43 *= 1899899719;
                                var43 *= 1247085897;
                                var43 ^= -1681541643;
                                var175 = var43 + 1;
                                var175 = var43 * var175;
                                var175 &= 1;
                                if (var175 != 0) {
                                    break label130;
                                }

                                return 0L;
                            }

                            var245 = var43 + 1;
                            var245 = var43 * var245;
                            var245 &= 1;
                            label129:
                            if (var245 == 0) {
                                try {
                                    var249 = var190.lastModifiedTime();
                                } catch (Exception var14Failure) {
                if (!(var14Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var14Failure);
                IOException var14 = (IOException)var14Failure;

                                    var43 = W;
                                    var43 ^= 1008913017;
                                    Throwable var207 = W(var14);
                                    IOException var30 = (IOException)var207;
                                    var43 += 1237374405;
                                    var43 *= 1899899719;
                                    var43 *= 1247085897;
                                    var43 ^= -1681541643;
                                    var175 = var43 + 1;
                                    var175 = var43 * var175;
                                    var175 &= 1;
                                    if (var175 != 0) {
                                        break label129;
                                    }

                                    return 0L;
                                }
                                var43 = switch (var43) {
                                    case -1424489987 -> {
                                        var43 += -174728090;
                                        var43 *= 2024111313;
                                        yield var43 ^ -342491456;
                                    }
                                    default -> var43 ^ 317774223;
                                    case 319622607 -> var43 ^ -599134077;
                                };
                                long var5 = var43;
                                long var7 = var5 + 1L;
                                var7 = var5 * var7;
                                var5 = var7 & 1L;
                                long var284;
                                int var253 = (var284 = var5 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                                label127:
                                if (var253 == 0) {
                                    try {
                                        long var250 = var249.toMillis();
                                        var43 &= -857899787;
                                        var43 ^= -592174451;
                                        var251 = var250 * 31L;
                                    } catch (Exception var13Failure) {
                if (!(var13Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var13Failure);
                IOException var13 = (IOException)var13Failure;

                                        var43 = W;
                                        var43 ^= 1008913017;
                                        Throwable var211 = W(var13);
                                        IOException var31 = (IOException)var211;
                                        var43 += 1237374405;
                                        var43 *= 1899899719;
                                        var43 *= 1247085897;
                                        var43 ^= -1681541643;
                                        var175 = var43 + 1;
                                        var175 = var43 * var175;
                                        var175 &= 1;
                                        if (var175 != 0) {
                                            break label127;
                                        }

                                        return 0L;
                                    }
                                    var43 = switch (var43) {
                                        default -> var43 ^ -714400531;
                                        case -1225201761 -> var43 ^ -1270326100;
                                        case 343432860 -> {
                                            var43 -= 1606268425;
                                            yield var43 ^ -1913287715;
                                        }
                                    };
                                    int var266 = var43 + 1;
                                    int var267 = var43 * var266;
                                    int var273 = var43 + 2;
                                    int var268 = var267 * var273;
                                    int var274 = var43 + 3;
                                    int var269 = var268 * var274;
                                    int var270 = var269 & 7;
                                    label125:
                                    if (var270 == 0) {
                                        try {
                                            var6 = var190.size();
                                            var43 ^= -1107388995;
                                            var43 ^= -578654325;
                                            var43 ^= 634962009;
                                        } catch (Exception var12Failure) {
                if (!(var12Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var12Failure);
                IOException var12 = (IOException)var12Failure;

                                            var43 = W;
                                            var43 ^= 1008913017;
                                            Throwable var215 = W(var12);
                                            IOException var32 = (IOException)var215;
                                            var43 += 1237374405;
                                            var43 *= 1899899719;
                                            var43 *= 1247085897;
                                            var43 ^= -1681541643;
                                            var175 = var43 + 1;
                                            var175 = var43 * var175;
                                            var175 &= 1;
                                            if (var175 != 0) {
                                                break label125;
                                            }

                                            return 0L;
                                        }

                                        var175 = var43 + 1;
                                        var175 = var43 * var175;
                                        int var279 = var43 + 2;
                                        var175 *= var279;
                                        int var280 = var43 + 3;
                                        var175 *= var280;
                                        var175 &= 7;
                                        label124:
                                        if (var175 == 0) {
                                            try {
                                                var228 = var251 + var6;
                                                var43 &= 2091159977;
                                                var43 >>= 16;
                                                var43 |= 1169392678;
                                                var43 ^= -1963793913;
                                            } catch (Exception var11Failure) {
                if (!(var11Failure instanceof IOException)) throw UncheckedExceptions.rethrow(var11Failure);
                IOException var11 = (IOException)var11Failure;

                                                var43 = W;
                                                var43 ^= 1008913017;
                                                Throwable var224 = W(var11);
                                                IOException var33 = (IOException)var224;
                                                var43 += 1237374405;
                                                var43 *= 1899899719;
                                                var43 *= 1247085897;
                                                var43 ^= -1681541643;
                                                var175 = var43 + 1;
                                                var175 = var43 * var175;
                                                var175 &= 1;
                                                if (var175 != 0) {
                                                    break label124;
                                                }

                                                return 0L;
                                            }

                                            var5 = var43;
                                            var7 = var5 + 1L;
                                            var7 = var5 * var7;
                                            long var9 = var5 + 2L;
                                            var7 *= var9;
                                            var5 += 3L;
                                            var7 *= var5;
                                            var5 = var7 & 7L;
                                            long var285;
                                            int var257 = (var285 = var5 - 0L) == 0L ? 0 : (var285 < 0L ? -1 : 1);
                                            if (var257 == 0) {
                                                return var228;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        IllegalArgumentException var36 = new IllegalArgumentException();
        throw var36;
    }

    public static void Q() {
        java.nio.file.Path var123 = null;
        java.nio.file.Path var124 = null;
        java.nio.file.Path var125 = null;
        java.nio.file.Path var126 = null;
        FileAttribute[] var137 = null;
        boolean var145 = false;
        OpenOption[] var150 = null;
        label195: {
            int var111;
            label187: {
                label196: {
                    Throwable var0;
                    int var3;
                    label185: {
                        label184: {
                            label183: {
                                label192: {
                                    try {
                                        var111 = W;
                                        var111 ^= -1810447497;
                                        Object var2 = null;
                                        var123 = S();
                                        var111 *= 710749843;
                                        var111 &= -1304361653;
                                        var111 <<= 16;
                                        var111 <<= 15;
                                        var111 ^= -1664940165;
                                        int var4 = of_2.Ny;
                                        var111 ^= var4;
                                        var111 ^= 130860231;
                                        var4 = of_2.j;
                                        var111 ^= var4;
                                        var111 ^= -2009831859;
                                    } catch (Throwable var20) {
                                        var0 = var20;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var20 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    Integer var132 = var111;
                                    if (var132 == null) {
                                        break label195;
                                    }

                                    try {
                                        var124 = var123;
                                        var111 -= 665677558;
                                        var111 |= 337352902;
                                        var111 ^= 907568180;
                                    } catch (Throwable var19) {
                                        var0 = var19;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var19 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    long var133 = var111;
                                    long var6 = var133 + 1L;
                                    var6 = var133 * var6;
                                    long var8 = var133 + 2L;
                                    var6 *= var8;
                                    long var134 = var133 + 3L;
                                    var6 *= var134;
                                    long var135 = var6 & 7L;
                                    long var175;
                                    int var136 = (var175 = var135 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                                    if (var136 != 0) {
                                        break label195;
                                    }

                                    try {
                                        var137 = new FileAttribute[0];
                                        var111 |= -1442707284;
                                        var111 &= -1745334889;
                                        var111 -= -1353518411;
                                        var111 -= 305419701;
                                        var111 ^= 2017981559;
                                    } catch (Throwable var18) {
                                        var0 = var18;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var18 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    Integer var5 = var111;
                                    if (var5 == null) {
                                        break label195;
                                    }

                                    try {
                                        Path var138 = Files.createDirectories(var124, var137);
                                        var111 ^= 1510783573;
                                        var111 ^= -1543990178;
                                    } catch (Throwable var17) {
                                        var0 = var17;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var17 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    Integer var139 = var111;
                                    if (var139 == null) {
                                        break label195;
                                    }

                                    try {
                                        var125 = var124.resolve("README.txt");
                                        var111 *= 705643039;
                                        var111 |= 269607596;
                                        var111 &= 1446327555;
                                        var111 |= 1644774444;
                                        var111 ^= -128385840;
                                    } catch (Throwable var16) {
                                        var0 = var16;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var16 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    int var140 = var111 + 1;
                                    var140 = var111 * var140;
                                    var140 &= 1;
                                    if (var140 != 0) {
                                        break label195;
                                    }

                                    try {
                                        var126 = var125;
                                        var111 &= 177298412;
                                        var111 &= 1166790916;
                                        var111 ^= 541688050;
                                    } catch (Throwable var15) {
                                        var0 = var15;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var15 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    Integer var143 = var111;
                                    if (var143 == null) {
                                        break label195;
                                    }

                                    try {
                                        LinkOption[] var144 = new LinkOption[0];
                                        var111 &= -1930916232;
                                        var111 <<= 25;
                                        var111 += -1020433081;
                                        var111 ^= -1633720292;
                                        var145 = Files.notExists(var126, var144);
                                        var111 ^= -141239717;
                                        var111 ^= -230364203;
                                        var111 ^= -1617251619;
                                    } catch (Throwable var14) {
                                        var0 = var14;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var14 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    int var151 = var111 + 1;
                                    var151 = var111 * var151;
                                    int var165 = var111 + 2;
                                    var151 *= var165;
                                    int var166 = var111 + 3;
                                    var151 *= var166;
                                    var151 &= 7;
                                    if (var151 != 0) {
                                        break label195;
                                    }

                                    try {
                                        if (!var145) {
                                            break label196;
                                        }
                                    } catch (Throwable var13) {
                                        var0 = var13;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var13 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    var111 ^= 932506623;
                                    var111 |= 635348677;
                                    var111 -= -2115814449;
                                    var111 |= -2089569340;
                                    var111 ^= -376878909;
                                    long var146 = var111;
                                    var6 = var146 + 1L;
                                    var6 = var146 * var6;
                                    var8 = var146 + 2L;
                                    var6 *= var8;
                                    long var147 = var146 + 3L;
                                    var6 *= var147;
                                    long var148 = var6 & 7L;
                                    long var176;
                                    int var149 = (var176 = var148 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                                    if (var149 != 0) {
                                        break label195;
                                    }

                                    try {
                                        var111 -= 874050323;
                                        var111 |= -382238920;
                                        var111 *= 1204972833;
                                        var111 += 156867858;
                                        var111 ^= -1569643484;
                                        var150 = new OpenOption[0];
                                        var111 += 359252521;
                                        var111 &= -717854474;
                                        var111 &= -1567652364;
                                        var111 |= -636141065;
                                        var111 ^= -1109095964;
                                    } catch (Throwable var12) {
                                        var0 = var12;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var12 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                                break label192;
                                        }
                                    }

                                    long var156 = var111;
                                    long var7 = var156 + 1L;
                                    var7 = var156 * var7;
                                    long var9 = var156 + 2L;
                                    var7 *= var9;
                                    long var157 = var156 + 3L;
                                    var7 *= var157;
                                    long var158 = var7 & 7L;
                                    long var177;
                                    var151 = (var177 = var158 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                                    if (var151 != 0) {
                                        break label195;
                                    }

                                    try {
                                        Path var130 = Files.writeString(
                                            var126,
                                            "Aura Visuals - your own hit sounds\n\nPut Ogg Vorbis files here: hit.ogg (normal), crit.ogg (critical),\nsweep.ogg (low-cooldown / spam). Pick Custom for each channel\nin Hit Sounds (Right Shift). Missing crit/sweep files use hit.ogg.\ndeath.ogg plays when you die with Death Effect -> Sound: Custom.\nThe file is read again whenever it changes; short sounds work best.\n",
                                            var150
                                        );
                                        var111 ^= -523973357;
                                        var111 *= 539890139;
                                        var111 ^= 492632184;
                                        break label187;
                                    } catch (Throwable var11) {
                                        var0 = var11;
                                        var111 = W;
                                        var111 ^= 1420865855;
                                        var3 = var11 instanceof IOException ? 1 : 0;
                                        switch (var111) {
                                            case -1113841339:
                                                break label183;
                                            case 205038348:
                                            default:
                                                break label184;
                                            case 2010017973:
                                        }
                                    }
                                }

                                var111 ^= -130134642;
                                break label185;
                            }

                            var111 -= 678348523;
                            var111 <<= 20;
                            var111 += 1215791576;
                            var111 &= 874704177;
                            var111 ^= 1810488660;
                            break label185;
                        }

                        var111 ^= -2056387150;
                    }

                    if (var3 == 0) {
                        switch (var111) {
                            case 337998320:
                                var111 ^= -1463122680;
                                break;
                            case 488293437:
                            default:
                                var111 ^= -19295029;
                                break;
                            case 1340824644:
                                var111 &= 977403225;
                                var111 <<= 17;
                                var111 &= -433562835;
                                var111 ^= -804755355;
                        }

                        throw UncheckedExceptions.rethrow(var0);
                    }

                    var111 &= -1797693823;
                    var111 <<= 3;
                    var111 *= -241818695;
                    var111 ^= 170920930;
                    var111 ^= -1199107091;
                    long var127 = var111;
                    long var160 = var127 + 1L;
                    var160 = var127 * var160;
                    long var128 = var160 & 1L;
                    long var178;
                    var3 = (var178 = var128 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        break label195;
                    }

                    IOException var122 = (IOException)var0;
                    var111 &= -497481542;
                    var111 >>>= 30;
                    var111 ^= 67556552;
                    var111 ^= 512584579;
                    var111 ^= -1844401434;
                    var111 -= -1655561166;
                    var111 ^= -1660406858;
                    var111 &= -655605180;
                    var111 &= -1899505153;
                    var111 ^= -1261322435;
                    return;
                }

                var111 |= -1182627025;
                var111 |= -1751971467;
                var111 *= 622574765;
                var111 ^= -738425941;
            }

            switch (var111) {
                case -1500112272:
                default:
                    var111 ^= 1047090581;
                    break;
                case 492944715:
                    var111 ^= 2052999556;
                    break;
                case 607829880:
                    var111 ^= 584970789;
                    var111 &= 1603782388;
                    var111 += 729106301;
                    var111 -= 1141706176;
                    var111 ^= 1501462892;
            }

            return;
        }

        UnsupportedOperationException var21 = new UnsupportedOperationException();
        throw var21;
    }

    private static Throwable W(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1240336501;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        W = var4;
    }
}
