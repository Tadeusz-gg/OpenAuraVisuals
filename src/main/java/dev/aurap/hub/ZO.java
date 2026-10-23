package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.Locale;
import java.util.function.LongSupplier;

public final class ZO {
    public static final int EventBus;

    private ZO() {
    }

    public static boolean Wr() {
        boolean var44 = false;
        int var0 = EventBus;
        var0 ^= -564271438;
        String var1 = System.getProperty("os.name", "");

        label64: {
            label68: {
                var0 = switch (var0) {
                    case 253851308 -> {
                        var0 >>= 3;
                        var0 &= -277204525;
                        yield var0 ^ -1262791322;
                    }
                    case 705750991 -> var0 ^ -1823563762;
                    default -> var0 ^ 9746357;
                };
                Locale var2 = Locale.ROOT;
                var1 = var1.toLowerCase(var2);
                boolean var45 = var1.contains("mac");
                if (!var45) {
                    var0 = switch (var0) {
                        case -1243908681 -> {
                            var0 ^= -1048339572;
                            yield var0 ^ 809745347;
                        }
                        default -> var0 ^ -591484859;
                        case 528419842 -> var0 ^ -1392098531;
                    };
                    int var46 = var0 + 1;
                    int var47 = var0 * var46;
                    int var48 = var47 & 1;
                    if (var48 != 0) {
                        break label64;
                    }

                    boolean var40 = var1.contains("darwin");

                    var0 = switch (var0) {
                        case -984225075 -> var0 ^ -1719685159;
                        default -> var0 ^ -1554977299;
                        case 1142642168 -> {
                            var0 -= -755849648;
                            var0 &= 2146947577;
                            var0 += 374465927;
                            var0 |= 1695949439;
                            yield var0 ^ 2063025572;
                        }
                    };
                    long var49 = var0;
                    long var4 = var49 + 1L;
                    var4 = var49 * var4;
                    long var50 = var4 & 1L;
                    long var63;
                    int var51 = (var63 = var50 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                    if (var51 != 0) {
                        break label64;
                    }

                    if (!var40) {
                        var0 |= -415911250;
                        var0 >>= 1;
                        var0 += 1111179665;
                        var0 ^= -1672672317;
                        int var41 = var0 + 1;
                        int var42 = var0 * var41;
                        int var43 = var42 & 1;
                        if (var43 != 0) {
                            break label64;
                        }

                        var44 = false;
                        var0 *= 1724801929;
                        var0 -= 1164253350;
                        var0 ^= -672385355;
                        break label68;
                    }

                    var0 ^= 2019965791;
                    var0 <<= 12;
                    var0 *= -222790465;
                    var0 *= -2004171907;
                    var0 ^= 491981588;
                } else {
                    var0 &= 591675816;
                    var0 *= 1351880743;
                    var0 &= -1230422371;
                    var0 ^= 2099967252;
                }

                long var52 = var0;
                long var59 = var52 + 1L;
                var59 = var52 * var59;
                long var6 = var52 + 2L;
                var59 *= var6;
                long var53 = var52 + 3L;
                var59 *= var53;
                long var54 = var59 & 7L;
                long var64;
                int var55 = (var64 = var54 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
                if (var55 != 0) {
                    break label64;
                }

                var44 = true;
                switch (var0) {
                    case -374757230:
                        var0 ^= 1732448558;
                        break;
                    case 1688312837:
                    default:
                        var0 ^= 231880341;
                        break;
                    case 2030816020:
                        var0 |= -1139822194;
                        var0 *= 1557974851;
                        var0 &= -917569391;
                        var0 ^= 1376106464;
                }
            }

            int var56 = var0 + 1;
            var56 = var0 * var56;
            var0 = var56 & 1;
            if (var0 == 0) {
                return var44;
            }
        }

        AssertionError var38 = new AssertionError();
        throw var38;
    }

    public static Co g(boolean var0, Path var1, LongSupplier var2) {
        int var0_i = var0 ? 1 : 0;
        label167: {
            int var71;
            label177: {
                var71 = EventBus;
                var71 ^= 394443244;
                String var5 = System.getProperty("os.name", "");
                Locale var6 = Locale.ROOT;
                var5 = var5.toLowerCase(var6);
                boolean var115 = var5.contains("mac");
                long var7 = var0_i;
                long var9 = var7 + 1L;
                var9 = var7 * var9;
                long var11 = var7 + 2L;
                var9 *= var11;
                var7 += 3L;
                var9 *= var7;
                var7 = var9 & 7L;
                long var194;
                int var145 = (var194 = var7 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                if (var145 != 0) {
                    var71 <<= 4;
                    var71 ^= -617699059;
                    var71 ^= 603918167;
                    var71 |= 1491552989;
                    var71 ^= -1728100955;
                } else {
                    label176: {
                        var71 |= -61402819;
                        var71 |= -132406751;
                        var71 &= 130402223;
                        var71 *= -1965122949;
                        var71 ^= -700414534;
                        Integer var146 = var71;
                        if (var146 == null) {
                            break label167;
                        }

                        if (!var115) {
                            var71 *= 229790163;
                            var71 ^= 260633386;
                            var71 &= 808993854;
                            var71 ^= 228153503;
                            long var116 = var71;
                            long var8 = var116 + 1L;
                            var8 = var116 * var8;
                            long var117 = var8 & 1L;
                            long var195;
                            int var118 = (var195 = var117 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                            if (var118 != 0) {
                                break label167;
                            }

                            boolean var119 = var5.contains("darwin");
                            int var147 = var0_i + 1;
                            int var148 = var0_i * var147;
                            int var149 = var148 & 1;
                            if (var149 != 0) {
                                switch (var71) {
                                    case 144665912:
                                    default:
                                        var71 ^= -1803384034;
                                        break label176;
                                    case 230250633:
                                        var71 &= -1435037375;
                                        var71 >>>= 22;
                                        var71 ^= 1191722618;
                                        break label176;
                                    case 1262489258:
                                        var71 ^= 1284756917;
                                        break label176;
                                }
                            }

                            var71 <<= 18;
                            var71 -= 1448567296;
                            var71 ^= 792370336;
                            if (!var119) {
                                var71 *= -1164448089;
                                var71 >>>= 17;
                                var71 |= 1022662006;
                                var71 ^= -285832366;
                                Integer var120 = var71;
                                if (var120 == null) {
                                    break label167;
                                }

                                boolean var121 = var5.contains("win");
                                var7 = var0_i;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var7 = var9 & 1L;
                                long var196;
                                int var152 = (var196 = var7 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                                if (var152 == 0) {
                                    var71 ^= -854980520;
                                    var71 -= -1830256215;
                                    var71 ^= 298593351;
                                    Integer var153 = var71;
                                    if (var153 == null) {
                                        break label167;
                                    }

                                    if (var121) {
                                        var71 ^= -997169253;
                                        var71 &= -1357199004;
                                        var71 >>>= 14;
                                        var71 -= 863462637;
                                        var71 ^= 659017684;
                                        int var138 = var71 + 1;
                                        int var139 = var71 * var138;
                                        int var170 = var71 + 2;
                                        int var140 = var139 * var170;
                                        int var171 = var71 + 3;
                                        int var141 = var140 * var171;
                                        int var142 = var141 & 7;
                                        if (var142 == 0) {
                                            return new dq(var0, var1, var2);
                                        }
                                        break label167;
                                    }
                                    var71 = switch (var71) {
                                        case -1647053036 -> {
                                            var71 |= -993264400;
                                            var71 &= -1565406170;
                                            var71 -= -1115064484;
                                            var71 &= -541605796;
                                            yield var71 ^ -2018664907;
                                        }
                                        default -> var71 ^ 1818146904;
                                        case 824275976 -> var71 ^ 1021688879;
                                    };
                                    int var122 = var71 + 1;
                                    int var123 = var71 * var122;
                                    int var124 = var123 & 1;
                                    if (var124 != 0) {
                                        break label167;
                                    }

                                    boolean var125 = var5.contains("nux");
                                    int var154 = var0_i + 1;
                                    int var155 = var0_i * var154;
                                    int var173 = var0_i + 2;
                                    int var156 = var155 * var173;
                                    int var174 = var0_i + 3;
                                    int var157 = var156 * var174;
                                    int var158 = var157 & 7;
                                    if (var158 == 0) {
                                        var71 = switch (var71) {
                                            case -1828391424 -> var71 ^ 1342814058;
                                            default -> var71 ^ 447471393;
                                            case 1152245373 -> {
                                                var71 *= 348980177;
                                                var71 &= 1643181922;
                                                var71 >>>= 8;
                                                yield var71 ^ -387007560;
                                            }
                                        };
                                        Integer var159 = var71;
                                        if (var159 == null) {
                                            break label167;
                                        }

                                        if (var125) {
                                            var71 <<= 11;
                                            var71 += -1398309823;
                                            var71 ^= 1264195554;
                                            break label177;
                                        }

                                        var71 |= -1538470289;
                                        var71 |= 1143853468;
                                        var71 ^= -1553460182;
                                        Integer var126 = var71;
                                        if (var126 == null) {
                                            break label167;
                                        }

                                        boolean var127 = var5.contains("nix");
                                        var7 = var0_i;
                                        var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        var11 = var7 + 2L;
                                        var9 *= var11;
                                        var7 += 3L;
                                        var9 *= var7;
                                        var7 = var9 & 7L;
                                        long var197;
                                        int var163 = (var197 = var7 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                                        if (var163 == 0) {
                                            var71 = switch (var71) {
                                                default -> var71 ^ -1834228154;
                                                case 1334299605 -> {
                                                    var71 &= -1816011001;
                                                    var71 &= -1608098058;
                                                    var71 |= 246414342;
                                                    var71 -= -1816132412;
                                                    yield var71 ^ 520364892;
                                                }
                                                case 1837882436 -> var71 ^ 1341188687;
                                            };
                                            var7 = var71;
                                            var9 = var7 + 1L;
                                            var9 = var7 * var9;
                                            var11 = var7 + 2L;
                                            var9 *= var11;
                                            var7 += 3L;
                                            var9 *= var7;
                                            var7 = var9 & 7L;
                                            long var198;
                                            int var167 = (var198 = var7 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                                            if (var167 != 0) {
                                                break label167;
                                            }

                                            if (var127) {
                                                var71 ^= -1723524937;
                                                var71 ^= -470912236;
                                                var71 <<= 20;
                                                var71 >>>= 3;
                                                var71 ^= 1839514531;
                                                break label177;
                                            }

                                            var71 *= -958862867;
                                            var71 |= 566279280;
                                            var71 ^= 1948970347;
                                            int var128 = var71 + 1;
                                            int var129 = var71 * var128;
                                            int var168 = var71 + 2;
                                            int var130 = var129 * var168;
                                            int var169 = var71 + 3;
                                            int var131 = var130 * var169;
                                            int var132 = var131 & 7;
                                            if (var132 != 0) {
                                                break label167;
                                            }

                                            boolean var114 = var5.contains("bsd");
                                            long var133 = var0_i;
                                            var8 = var133 + 1L;
                                            var8 = var133 * var8;
                                            long var10 = var133 + 2L;
                                            var8 *= var10;
                                            long var134 = var133 + 3L;
                                            var8 *= var134;
                                            long var135 = var8 & 7L;
                                            long var199;
                                            int var4 = (var199 = var135 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                                            if (var4 == 0) {
                                                var71 <<= 10;
                                                var71 -= 1757818165;
                                                var71 ^= 1112698656;
                                                var71 ^= 2090471076;
                                                var71 ^= -698504828;
                                                Integer var104 = var71;
                                                if (var104 == null) {
                                                    break label167;
                                                }

                                                if (!var114) {
                                                    var104 = switch (var71) {
                                                        default -> var71 ^ 1027308854;
                                                        case 1074892491 -> {
                                                            var71 += -459334813;
                                                            var71 *= 847127589;
                                                            var71 += -1759630409;
                                                            yield var71 ^ 749767025;
                                                        }
                                                        case 1954412547 -> var71 ^ 1784378597;
                                                    };
                                                    if (var104 != null) {
                                                        return new lN();
                                                    }
                                                    break label167;
                                                }

                                                var71 >>= 25;
                                                var71 &= 1623297986;
                                                var71 *= -1288200599;
                                                var71 -= 589774360;
                                                var71 ^= -1308229045;
                                                break label177;
                                            }

                                            var71 += -1902191366;
                                            var71 -= 344427056;
                                            var71 |= -815333991;
                                            var71 *= -651360455;
                                            var71 ^= -338904931;
                                        } else {
                                            var71 += 253685714;
                                            var71 |= -1683190161;
                                            var71 ^= -1733918283;
                                        }
                                    } else {
                                        var71 -= -2111603807;
                                        var71 *= 1106760039;
                                        var71 >>= 16;
                                        var71 ^= 1191723261;
                                    }
                                } else {
                                    switch (var71) {
                                        case -771599196:
                                            var71 |= 221144445;
                                            var71 ^= -1742320729;
                                            break label176;
                                        case 835575410:
                                            var71 ^= -728856682;
                                            break label176;
                                        case 2129487381:
                                        default:
                                            var71 ^= -1968015769;
                                    }
                                }
                                break label176;
                            }

                            var71 -= -744151581;
                            var71 &= 92677934;
                            var71 &= -2074264671;
                            var71 ^= -755515906;
                        } else {
                            var71 *= -859534853;
                            var71 += 1840959978;
                            var71 <<= 6;
                            var71 ^= 864035358;
                        }

                        Integer var98 = var71;
                        if (var98 != null) {
                            return new zf(var2);
                        }
                        break label167;
                    }
                }

                int var109 = var71 + 1;
                var109 = var71 * var109;
                var109 &= 1;
                if (var109 == 0) {
                    UnsupportedOperationException var112 = new UnsupportedOperationException();
                    throw var112;
                }
                break label167;
            }

            long var106 = var71;
            long var136 = var106 + 1L;
            var136 = var106 * var136;
            var106 = var136 & 1L;
            long var200;
            int var108 = (var200 = var106 - 0L) == 0L ? 0 : (var200 < 0L ? -1 : 1);
            if (var108 == 0) {
                return new YA(var0, var2);
            }
        }

        UnsupportedOperationException var103 = new UnsupportedOperationException();
        throw var103;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -465306927;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        EventBus = var4;
    }
}
