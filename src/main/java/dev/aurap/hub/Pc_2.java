package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.function.Predicate;

public final class Pc_2 {
    private final Object[] YX;
    private final int[] J;
    public static final int pG;

    public Pc_2(int var1) {
        Object[] var2 = new Object[var1];
        this.YX = var2;
        int[] var3 = new int[var1];
        this.J = var3;
    }

    public void aw(Object var1, int var2) {
        label215: {
            int var3 = pG;
            int var4 = var2;
            var3 ^= -2004653082;
            int var5 = System.identityHashCode(this);
            int var6 = var3 | 1746027339;
            var6 |= -1632448686;
            var6 |= -958775014;
            var6 *= 1932323993;
            var6 ^= 1352841660;
            var6 = this.rP(var1, var6);
            long var7 = var5;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var239;
            int var140 = (var239 = var7 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
            if (var140 != 0) {
                var3 -= 1537194814;
                var3 >>= 11;
                var3 ^= -1909288392;
            } else {
                label246: {
                    var3 <<= 21;
                    var3 >>= 18;
                    var3 ^= -1745665470;
                    var3 -= 409584158;
                    var3 ^= 570300014;
                    int var141 = var2 + 1;
                    int var142 = var2 * var141;
                    int var143 = var142 & 1;
                    if (var143 != 0) {
                        break label215;
                    }

                    int var159;
                    if (var6 < 0) {
                        var3 = switch (var3) {
                            default -> var3 ^ 440685942;
                            case 1253385135 -> var3 ^ -226386445;
                            case 1851583778 -> {
                                var3 &= 1641685794;
                                yield var3 ^ 1125921937;
                            }
                        };
                        byte var147 = 0;
                        int var8 = 0;
                        var9 = var5;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var240;
                        int var163 = (var240 = var9 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                        if (var163 != 0) {
                            var3 *= -1508657657;
                            var3 *= -842100125;
                            var3 ^= 630771693;
                            break label246;
                        }

                        var3 += -717259249;
                        var3 |= -1899575601;
                        var3 ^= 1991920052;
                        int var164 = var2 + 1;
                        int var165 = var2 * var164;
                        int var166 = var165 & 1;
                        if (var166 != 0) {
                            break label215;
                        }

                        int var148 = var147;
                        var8 = var8;

                        var3 = switch (var3) {
                            case -2005033349 -> {
                                var3 &= 942610723;
                                var3 >>>= 31;
                                var3 -= 1870214758;
                                var3 += -92908351;
                                yield var3 ^ 1123524853;
                            }
                            default -> var3 ^ 1534094593;
                            case 1420721758 -> var3 ^ 376332139;
                        };

                        while (true) {
                            Integer var167 = var4;
                            if (var167 == null) {
                                break label215;
                            }

                            Object[] var168 = this.YX;
                            int var169 = var168.length;
                            long var179 = var5;
                            long var12 = var179 + 1L;
                            var12 = var179 * var12;
                            var179 = var12 & 1L;
                            long var241;
                            int var181 = (var241 = var179 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                            if (var181 != 0) {
                                switch (var3) {
                                    case -938819922:
                                        var3 ^= 1105748211;
                                        var3 ^= -498387510;
                                        var3 ^= 442890741;
                                        break label246;
                                    case 530480052:
                                    default:
                                        var3 ^= -1250353049;
                                        break label246;
                                    case 1737814920:
                                        var3 ^= -1513972007;
                                        break label246;
                                }
                            }
                            var3 = switch (var3) {
                                case -1586423990 -> var3 ^ 1916154266;
                                case -938819922 -> {
                                    var3 -= 1541163459;
                                    yield var3 ^ 1408236151;
                                }
                                default -> var3 ^ -263878955;
                            };
                            var179 = var4;
                            var12 = var179 + 1L;
                            var12 = var179 * var12;
                            var179 = var12 & 1L;
                            long var242;
                            int var184 = (var242 = var179 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                            if (var184 != 0) {
                                break label215;
                            }

                            if (var8 >= var169) {
                                var3 = switch (var3) {
                                    default -> var3 ^ -1921874785;
                                    case -718218941 -> var3 ^ 1339326062;
                                    case 1069649564 -> {
                                        var3 &= 503512322;
                                        var3 <<= 19;
                                        var3 *= 843433531;
                                        yield var3 ^ 991863561;
                                    }
                                };
                                Integer var154 = var4;
                                if (var154 == null) {
                                    break label215;
                                }

                                var159 = var148;
                                var3 += 1866039190;
                                var3 ^= -309418854;
                                break;
                            }
                            var3 = switch (var3) {
                                default -> var3 ^ 369271221;
                                case 612727249 -> var3 ^ -1155163033;
                                case 1069649564 -> {
                                    var3 += -1959882111;
                                    var3 += -2125404152;
                                    yield var3 ^ 2022559364;
                                }
                            };
                            var9 = var4;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var243;
                            int var172 = (var243 = var9 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                            if (var172 != 0) {
                                break label215;
                            }

                            Object[] var173 = this.YX;
                            Integer var185 = var5;
                            if (var185 == null) {
                                switch (var3) {
                                    case 603570902:
                                    default:
                                        var3 ^= -1765272574;
                                        break label246;
                                    case 885835681:
                                        var3 &= 1367424298;
                                        var3 += 118407230;
                                        var3 ^= 875649970;
                                        var3 ^= 1850856975;
                                        var3 ^= 1008884353;
                                        break label246;
                                    case 1363913388:
                                        var3 ^= 1607133415;
                                        break label246;
                                }
                            }

                            var3 |= 273225017;
                            var3 ^= 659340498;
                            Object var174 = var173[var8];
                            if (var174 == null) {
                                var3 &= -1005977636;
                                var3 |= -331597380;
                                var3 ^= 1387231838;
                                int var175 = var4 + 1;
                                int var176 = var4 * var175;
                                int var177 = var176 & 1;
                                if (var177 != 0) {
                                    break label215;
                                }

                                var179 = var5;
                                var12 = var179 + 1L;
                                var12 = var179 * var12;
                                long var14 = var179 + 2L;
                                var12 *= var14;
                                var179 += 3L;
                                var12 *= var179;
                                var179 = var12 & 7L;
                                long var244;
                                int var195 = (var244 = var179 - 0L) == 0L ? 0 : (var244 < 0L ? -1 : 1);
                                if (var195 != 0) {
                                    var3 -= -1473593218;
                                    var3 -= -601545127;
                                    var3 -= 950416124;
                                    var3 |= 1855149988;
                                    var3 ^= 509076877;
                                    break label246;
                                }
                                var3 = switch (var3) {
                                    default -> var3 ^ 2027749860;
                                    case -1097727582 -> {
                                        var3 ^= 1744894629;
                                        var3 >>>= 26;
                                        yield var3 ^ 2131193313;
                                    }
                                    case -461867760 -> var3 ^ 1866918128;
                                };
                                Integer var196 = var4;
                                if (var196 == null) {
                                    break label215;
                                }

                                var159 = var8;
                                var3 >>>= 5;
                                var3 &= -1179953164;
                                var3 ^= 1719571809;
                                break;
                            }

                            var3 += -660265072;
                            var3 ^= 89674316;
                            var179 = var4;
                            var12 = var179 + 1L;
                            var12 = var179 * var12;
                            var179 = var12 & 1L;
                            long var245;
                            int var188 = (var245 = var179 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                            if (var188 != 0) {
                                break label215;
                            }

                            int[] var189 = this.J;
                            int var190 = var189[var8];
                            Integer var203 = var5;
                            if (var203 == null) {
                                switch (var3) {
                                    case -377569097:
                                        var3 ^= -122311593;
                                        var3 ^= 1611103874;
                                        break label246;
                                    case 507015172:
                                    default:
                                        var3 ^= 917008425;
                                        break label246;
                                    case 1519445241:
                                        var3 ^= -143102334;
                                        break label246;
                                }
                            }
                            var3 = switch (var3) {
                                case -1123473333 -> var3 ^ -573804915;
                                case -377569097 -> {
                                    var3 -= 1452947581;
                                    var3 *= 1423184305;
                                    var3 -= -2077526838;
                                    var3 += 1882816251;
                                    yield var3 ^ -835681;
                                }
                                default -> var3 ^ -829701015;
                            };
                            int[] var204 = this.J;
                            int var205 = var204[var148];
                            int var191;
                            if (var190 < var205) {
                                var3 &= -1640855170;
                                var3 ^= 1421474545;
                                var11 = var5;
                                var13 = var11 + 1L;
                                var13 = var11 * var13;
                                long var15 = var11 + 2L;
                                var13 *= var15;
                                var11 += 3L;
                                var13 *= var11;
                                var11 = var13 & 7L;
                                long var246;
                                int var209 = (var246 = var11 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                                if (var209 != 0) {
                                    switch (var3) {
                                        case 1252783013:
                                            var3 += 883256260;
                                            var3 &= -698060885;
                                            var3 ^= 663510347;
                                            break label246;
                                        case 1902655685:
                                            var3 ^= 1310787126;
                                            break label246;
                                        case 2068318337:
                                        default:
                                            var3 ^= 467919790;
                                            break label246;
                                    }
                                }

                                var3 -= -846420829;
                                var3 -= 2041540451;
                                var3 -= 294753703;
                                var3 ^= -1737978992;
                                int var210 = var4 + 1;
                                int var211 = var4 * var210;
                                int var212 = var211 & 1;
                                if (var212 != 0) {
                                    break label215;
                                }

                                var191 = var8;
                                var3 ^= -454377944;
                                var3 ^= -1113852575;
                            } else {
                                var3 |= -1379219500;
                                var3 ^= 1978375309;
                                var191 = var148;
                                switch (var3) {
                                    case -1976274087:
                                        var3 += -1978414622;
                                        var3 ^= 613397530;
                                        break;
                                    case -6395821:
                                    default:
                                        var3 ^= 1309645784;
                                        break;
                                    case 250030849:
                                        var3 ^= -681118663;
                                }
                            }

                            var11 = var4;
                            var13 = var11 + 1L;
                            var13 = var11 * var13;
                            var11 = var13 & 1L;
                            long var247;
                            int var215 = (var247 = var11 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                            if (var215 != 0) {
                                break label215;
                            }

                            int var216 = var8 + 1;
                            int var222 = var5 + 1;
                            int var223 = var5 * var222;
                            int var237 = var5 + 2;
                            int var224 = var223 * var237;
                            int var238 = var5 + 3;
                            int var225 = var224 * var238;
                            int var226 = var225 & 7;
                            if (var226 != 0) {
                                var3 |= 1986528888;
                                var3 ^= 119774491;
                                break label246;
                            }
                            var3 = switch (var3) {
                                case -438497405 -> var3 ^ 1467459554;
                                case 818383137 -> {
                                    var3 <<= 16;
                                    yield var3 ^ -1977283685;
                                }
                                default -> var3 ^ 1644383719;
                            };
                            var148 = var191;
                            var8 = var216;
                            var3 &= 71569647;
                            var3 ^= -938557915;
                        }
                    } else {
                        var3 *= 1724575683;
                        var3 ^= -351386839;
                        var7 = var2;
                        long var10 = var7 + 1L;
                        var10 = var7 * var10;
                        var7 = var10 & 1L;
                        long var248;
                        int var146 = (var248 = var7 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                        if (var146 != 0) {
                            break label215;
                        }

                        var159 = var6;
                        var3 += -2103296002;
                        var3 >>>= 7;
                        var3 -= 2105470430;
                        var3 ^= -444809512;
                    }

                    Object[] var137 = this.YX;
                    int var149 = var5 + 1;
                    int var150 = var5 * var149;
                    int var155 = var5 + 2;
                    int var151 = var150 * var155;
                    var5 += 3;
                    int var152 = var151 * var5;
                    var5 = var152 & 7;
                    if (var5 == 0) {
                        var3 &= -336352292;
                        var3 *= 577994539;
                        var3 ^= -1293656125;
                        var3 ^= -530017572;
                        var3 ^= 885548999;
                        var137[var159] = var1;
                        int[] var116 = this.J;
                        var116[var159] = var2;
                        return;
                    }

                    switch (var3) {
                        case -269104315:
                            var3 ^= 2647937;
                            break;
                        case 1104812340:
                        default:
                            var3 ^= -1913207895;
                            break;
                        case 1742112261:
                            var3 ^= -963773122;
                            var3 |= -729057465;
                            var3 ^= -2078839523;
                    }
                }
            }

            var5 = var4 + 1;
            var5 = var4 * var5;
            var4 = var5 & 1;
            if (var4 == 0) {
                AssertionError var127 = new AssertionError();
                throw var127;
            }
        }

        IllegalStateException var125 = new IllegalStateException();
        throw var125;
    }

    private int rP(Object var1, int var2) {
        label95: {
            int var4 = System.identityHashCode(this);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            int var15;
            if (var5 == 0) {
                var15 = var2 * 282533017;
                var15 >>>= 23;
                var15 ^= 1068690658;
                var15 ^= -495745872;
                long var64 = var15;
                long var7 = var64 + 1L;
                var7 = var64 * var7;
                long var9 = var64 + 2L;
                var7 *= var9;
                long var65 = var64 + 3L;
                var7 *= var65;
                long var66 = var7 & 7L;
                long var109;
                var5 = (var109 = var66 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label95;
                }

                int var68 = 0;
                var68 = var68;
                var15 ^= 823408921;
                var15 -= 1259561887;
                var15 *= -1698721051;
                var15 ^= 1555291910;

                while (true) {
                    Integer var6 = var15;
                    if (var6 == null) {
                        break label95;
                    }

                    Object[] var70 = this.YX;
                    var7 = var4;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var110;
                    int var84 = (var110 = var7 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
                    if (var84 != 0) {
                        var15 |= 340504617;
                        var15 += -1735888472;
                        var15 ^= -463197261;
                        break;
                    }

                    var15 ^= -1715644281;
                    var15 ^= 1504009882;
                    var7 = var15;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var111;
                    int var88 = (var111 = var7 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
                    if (var88 != 0) {
                        break label95;
                    }

                    int var71 = var70.length;
                    if (var68 >= var71) {
                        var15 += -1496140015;
                        var15 |= 1717561095;
                        var15 -= -1383710675;
                        var15 |= -1187138321;
                        var15 ^= 1100816119;
                        Integer var59 = var15;
                        if (var59 != null) {
                            return -1;
                        }
                        break label95;
                    }

                    var15 &= 1895528628;
                    var15 *= 456278691;
                    var15 |= -653249073;
                    var15 -= 1454579684;
                    var15 ^= -813792702;
                    Integer var72 = var15;
                    if (var72 == null) {
                        break label95;
                    }

                    Object[] var73 = this.YX;
                    var72 = (Integer)var73[var68];
                    int var89 = var4 + 1;
                    int var90 = var4 * var89;
                    int var8 = var4 + 2;
                    int var91 = var90 * var8;
                    var8 = var4 + 3;
                    int var92 = var91 * var8;
                    int var93 = var92 & 7;
                    if (var93 != 0) {
                        var15 |= -703326301;
                        var15 |= 1132143249;
                        var15 |= 1693570604;
                        var15 += 1031631141;
                        var15 ^= -1914621056;
                        break;
                    }
                    var15 = switch (var15) {
                        default -> var15 ^ 41933154;
                        case 1283235257 -> {
                            var15 ^= -191994688;
                            yield var15 ^ -1068432222;
                        }
                        case 2114202678 -> var15 ^ 1720301432;
                    };
                    Integer var94 = var15;
                    if (var94 == null) {
                        break label95;
                    }

                    if (var72 == var1) {
                        var15 &= -1063684826;
                        var15 ^= 1103522093;
                        int var76 = var15 + 1;
                        var76 = var15 * var76;
                        var76 &= 1;
                        if (var76 == 0) {
                            return var68;
                        }
                        break label95;
                    }

                    var15 += -723310823;
                    var15 ^= -635397331;
                    int var75 = var68 + 1;
                    int var95 = var4 + 1;
                    int var96 = var4 * var95;
                    var8 = var4 + 2;
                    int var97 = var96 * var8;
                    var8 = var4 + 3;
                    int var98 = var97 * var8;
                    int var99 = var98 & 7;
                    if (var99 != 0) {
                        var15 -= 373354143;
                        var15 *= -2002410709;
                        var15 ^= 1833128410;
                        break;
                    }
                    var15 = switch (var15) {
                        case -1750614055 -> {
                            var15 ^= 241020151;
                            var15 += 474802377;
                            var15 += -1769829930;
                            var15 -= 1458522111;
                            yield var15 ^ -1423720387;
                        }
                        default -> var15 ^ 1654858697;
                        case -1016890816 -> var15 ^ 1133764596;
                    };
                    var68 = var75;
                    var15 ^= 442886448;
                    var15 ^= -323988499;
                }
            } else {
                var15 = var2 | 439599406;
                var15 -= -412439760;
                var15 &= -107374149;
                var15 ^= 1074615279;
            }

            var4 = var15 + 1;
            var4 = var15 * var4;
            var15 = var4 & 1;
            if (var15 == 0) {
                AssertionError var57 = new AssertionError();
                throw var57;
            }
        }

        IllegalArgumentException var58 = new IllegalArgumentException();
        throw var58;
    }

    public void Ps(Predicate var1) {
        int var2 = pG;
        var2 ^= -1517088337;
        int var3 = System.identityHashCode(this);
        Integer var4 = var3;
        if (var4 == null) {
            var2 &= -1361579024;
            var2 |= -174863142;
            var2 ^= -757986986;
        } else {
            label161: {
                var2 ^= 540589824;
                var2 *= 84256179;
                var2 ^= -465354744;
                var2 <<= 16;
                var2 ^= 398778725;
                long var106 = var2;
                long var6 = var106 + 1L;
                var6 = var106 * var6;
                long var107 = var6 & 1L;
                long var171;
                int var108 = (var171 = var107 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                if (var108 == 0) {
                    int var109 = 0;
                    var109 = var109;

                    var2 = switch (var2) {
                        case -2058939184 -> var2 ^ -450614368;
                        case 1166598501 -> {
                            var2 |= -610732515;
                            var2 += 750784535;
                            var2 *= 882125277;
                            var2 *= -1333298807;
                            yield var2 ^ -431422521;
                        }
                        default -> var2 ^ 1880980938;
                    };

                    while (true) {
                        Integer var5 = var2;
                        if (var5 == null) {
                            break;
                        }

                        Object[] var111 = this.YX;
                        var6 = var3;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var172;
                        int var122 = (var172 = var6 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                        if (var122 != 0) {
                            var2 |= 674203965;
                            var2 |= -201938154;
                            var2 += -1798980930;
                            var2 ^= -1316716207;
                            break label161;
                        }
                        var2 = switch (var2) {
                            case -1625880384 -> var2 ^ -726927389;
                            case -40683229 -> {
                                var2 -= 1308080806;
                                var2 >>= 30;
                                var2 <<= 19;
                                yield var2 ^ -401152581;
                            }
                            default -> var2 ^ 2073696880;
                        };
                        Integer var123 = var2;
                        if (var123 == null) {
                            break;
                        }

                        int var112 = var111.length;
                        if (var109 >= var112) {
                            var2 += 354464352;
                            var2 += 1723844797;
                            var2 >>>= 26;
                            var2 ^= 1741327922;
                            Integer var104 = var2;
                            if (var104 != null) {
                                return;
                            }
                            break;
                        }

                        var2 |= -721720019;
                        var2 ^= -1765907972;
                        Object[] var113 = this.YX;
                        Integer var124 = var3;
                        if (var124 == null) {
                            var2 -= 1649129231;
                            var2 += 1854785318;
                            var2 -= -638727655;
                            var2 ^= 1456744173;
                            break label161;
                        }

                        var2 <<= 25;
                        var2 ^= -1981556593;
                        Object var114 = var113[var109];
                        if (var114 == null) {
                            var2 = switch (var2) {
                                case -1529356360 -> var2 ^ -1394800014;
                                case 266590351 -> {
                                    var2 >>>= 2;
                                    var2 ^= -1058540347;
                                    var2 &= 1585417643;
                                    yield var2 ^ 1794433977;
                                }
                                default -> var2 ^ -822063780;
                            } & 460363022;
                            var2 ^= 558053438;
                        } else {
                            label147: {
                                var2 += -715671761;
                                var2 >>>= 8;
                                var2 |= 662048681;
                                var2 += 903724027;
                                var2 ^= -889197322;
                                int var125 = var2 + 1;
                                int var126 = var2 * var125;
                                int var7 = var2 + 2;
                                int var127 = var126 * var7;
                                var7 = var2 + 3;
                                int var128 = var127 * var7;
                                int var129 = var128 & 7;
                                if (var129 != 0) {
                                    break;
                                }

                                int[] var130 = this.J;
                                long var146 = var3;
                                long var9 = var146 + 1L;
                                var9 = var146 * var9;
                                long var11 = var146 + 2L;
                                var9 *= var11;
                                long var147 = var146 + 3L;
                                var9 *= var147;
                                long var148 = var9 & 7L;
                                long var173;
                                var7 = (var173 = var148 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    var2 |= -422299707;
                                    var2 ^= -759250063;
                                    break label161;
                                }

                                var2 ^= -414202593;
                                var2 >>>= 4;
                                var2 &= -370677883;
                                var2 ^= 1682905318;
                                Integer var150 = var2;
                                if (var150 == null) {
                                    break;
                                }

                                int var151 = var130[var109];
                                var130[var109] = --var151;
                                if (var151 >= 0) {
                                    var2 |= 522389689;
                                    var2 <<= 20;
                                    var2 ^= 1435721437;
                                    boolean var115 = var1.test(var114);
                                    int var131 = var3 + 1;
                                    int var132 = var3 * var131;
                                    var151 = var3 + 2;
                                    int var133 = var132 * var151;
                                    var151 = var3 + 3;
                                    int var134 = var133 * var151;
                                    int var135 = var134 & 7;
                                    if (var135 != 0) {
                                        switch (var2) {
                                            case -1977393443:
                                                var2 >>= 6;
                                                var2 ^= -613844521;
                                                break label161;
                                            case -396487086:
                                            default:
                                                var2 ^= 581469121;
                                                break label161;
                                            case -261236090:
                                                var2 ^= 1740510934;
                                                break label161;
                                        }
                                    }

                                    var2 -= -1665546462;
                                    var2 ^= 1996175759;
                                    if (var115) {
                                        var2 &= 969530989;
                                        var2 ^= 816002832;
                                        break label147;
                                    }

                                    var2 &= -2141172214;
                                    var2 ^= -1708525909;
                                    var2 >>>= 2;
                                    var2 ^= 1869243779;
                                } else {
                                    var2 |= -151464242;
                                    var2 >>= 19;
                                    var2 *= -1145709507;
                                    var2 &= -911863730;
                                    var2 ^= -507241493;
                                }

                                Object[] var116 = this.YX;
                                var6 = var3;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var10 = var6 + 2L;
                                var8 *= var10;
                                var6 += 3L;
                                var8 *= var6;
                                var6 = var8 & 7L;
                                long var174;
                                int var139 = (var174 = var6 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                                if (var139 != 0) {
                                    var2 += -782108633;
                                    var2 ^= -1785885184;
                                    var2 ^= 13121263;
                                    var2 ^= -1371766389;
                                    var2 ^= 628809240;
                                    break label161;
                                }

                                var2 *= 1435832243;
                                var2 *= 895659555;
                                var2 += -1221322931;
                                var2 ^= -1858104523;
                                Integer var140 = var2;
                                if (var140 == null) {
                                    break;
                                }

                                var116[var109] = null;
                                var2 |= 1641718910;
                                var2 ^= 1123835723;
                            }
                        }

                        var112 = var109 + 1;
                        var6 = var3;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var175;
                        int var144 = (var175 = var6 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                        if (var144 != 0) {
                            switch (var2) {
                                case -1735765278:
                                default:
                                    var2 ^= -864658750;
                                    break label161;
                                case 690207028:
                                    var2 *= -710437031;
                                    var2 ^= 1372912568;
                                    break label161;
                                case 1602380332:
                                    var2 ^= 914148601;
                                    break label161;
                            }
                        }

                        var2 |= -648900253;
                        var2 *= 896052193;
                        var2 &= -1115170094;
                        var2 -= 31372995;
                        var2 ^= 907867948;
                        var109 = var112;
                        switch (var2) {
                            case -1262660381:
                                var2 -= -919479152;
                                var2 &= 623047359;
                                var2 ^= -594458320;
                                break;
                            case 318631888:
                            default:
                                var2 ^= -456745433;
                                break;
                            case 1008331440:
                                var2 ^= 285778229;
                        }
                    }
                }

                RuntimeException var105 = new RuntimeException();
                throw var105;
            }
        }

        AssertionError var103 = new AssertionError();
        throw var103;
    }

    public int lC() {
        label128: {
            int var1 = pG;
            var1 ^= 1233784743;
            int var2 = System.identityHashCode(this);
            int var3 = 0;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                var1 += 200579614;
                var1 += -2106241207;
                var1 ^= 198102403;
            } else {
                var1 = switch (var1) {
                    case -1901335644 -> {
                        var1 -= -864665784;
                        var1 ^= 1174946121;
                        yield var1 ^ 1638400632;
                    }
                    case -1466445986 -> var1 ^ 267352306;
                    default -> var1 ^ 1817604741;
                };
                var4 = var1 + 1;
                var4 = var1 * var4;
                var5 = var1 + 2;
                var4 *= var5;
                var5 = var1 + 3;
                var4 *= var5;
                var4 &= 7;
                if (var4 != 0) {
                    break label128;
                }

                Object[] var80 = this.YX;
                Object[] var81 = var80;
                var5 = var80.length;
                var5 = var5;
                int var6 = 0;
                var3 = var3;
                var6 = var6;

                var1 = switch (var1) {
                    default -> var1 ^ -706189225;
                    case -443158675 -> {
                        var1 += 983098290;
                        var1 &= -1484413460;
                        var1 += 1245579797;
                        var1 |= -1694932558;
                        yield var1 ^ 1318568270;
                    }
                    case -176280875 -> var1 ^ -430844715;
                };

                label125:
                while (true) {
                    int var7 = var1 + 1;
                    var7 = var1 * var7;
                    int var8 = var1 + 2;
                    var7 *= var8;
                    var8 = var1 + 3;
                    var7 *= var8;
                    var7 &= 7;
                    if (var7 != 0) {
                        break label128;
                    }

                    if (var6 >= var5) {
                        Integer var67 = switch (var1) {
                            default -> var1 ^ -714758066;
                            case -1267979523 -> {
                                var1 |= 1003346497;
                                yield var1 ^ 1915385591;
                            }
                            case -975424712 -> var1 ^ 924732517;
                        };
                        if (var67 != null) {
                            return var3;
                        }
                        break label128;
                    }

                    var1 |= -1412440565;
                    var1 -= -1249367039;
                    var1 *= -562193535;
                    var1 ^= -138354915;
                    Integer var92 = var1;
                    if (var92 == null) {
                        break label128;
                    }

                    var92 = (Integer)var81[var6];
                    long var106 = var2;
                    long var10 = var106 + 1L;
                    var10 = var106 * var10;
                    long var12 = var106 + 2L;
                    var10 *= var12;
                    long var107 = var106 + 3L;
                    var10 *= var107;
                    long var108 = var10 & 7L;
                    long var138;
                    var8 = (var138 = var108 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                    if (var8 != 0) {
                        var1 |= -1426527826;
                        var1 ^= -1406864025;
                        break;
                    }

                    var1 <<= 7;
                    var1 ^= 858642674;
                    long var110 = var1;
                    var10 = var110 + 1L;
                    var10 = var110 * var10;
                    long var111 = var10 & 1L;
                    long var139;
                    var8 = (var139 = var111 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                    if (var8 != 0) {
                        break label128;
                    }

                    int var98;
                    if (var92 != null) {
                        var1 = switch (var1) {
                            default -> var1 ^ -1480374940;
                            case 170087131 -> var1 ^ 1814224749;
                            case 1490004338 -> {
                                var1 -= -1246407719;
                                var1 >>>= 16;
                                yield var1 ^ -163883759;
                            }
                        };
                        long var94 = var1;
                        long var9 = var94 + 1L;
                        var9 = var94 * var9;
                        long var95 = var9 & 1L;
                        long var140;
                        var98 = (var140 = var95 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                        if (var98 != 0) {
                            break label128;
                        }

                        var98 = var3 + 1;
                        Integer var113 = var2;
                        if (var113 == null) {
                            switch (var1) {
                                case -453599209:
                                default:
                                    var1 ^= -579408783;
                                    break label125;
                                case -163842549:
                                    var1 += -115143336;
                                    var1 ^= -108782613;
                                    break label125;
                                case 1835344023:
                                    var1 ^= 2122551426;
                                    break label125;
                            }
                        }

                        var1 |= -1034266483;
                        var1 ^= -1880513482;
                        int var114 = var1 + 1;
                        var114 = var1 * var114;
                        var114 &= 1;
                        if (var114 != 0) {
                            break label128;
                        }

                        var98 = var98;
                        var1 &= -1280039258;
                        var1 -= 2011913896;
                        var1 |= -175633883;
                        var1 ^= -1794977958;
                    } else {
                        var1 = switch (var1) {
                            default -> var1 ^ -2093806746;
                            case 1366847386 -> var1 ^ -332036429;
                            case 1490004338 -> {
                                var1 ^= 1975670727;
                                var1 ^= -1255699844;
                                var1 ^= 1043785869;
                                yield var1 ^ 164518594;
                            }
                        };
                        long var117 = var1;
                        var10 = var117 + 1L;
                        var10 = var117 * var10;
                        var12 = var117 + 2L;
                        var10 *= var12;
                        long var118 = var117 + 3L;
                        var10 *= var118;
                        long var119 = var10 & 7L;
                        long var141;
                        var8 = (var141 = var119 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label128;
                        }

                        var98 = var3;
                        switch (var1) {
                            case -1345141114:
                                var1 &= -1611656637;
                                var1 *= 1028865663;
                                var1 *= 1432145455;
                                var1 ^= -197288955;
                                break;
                            case -1014675063:
                            default:
                                var1 ^= -1433199137;
                                break;
                            case 701218834:
                                var1 ^= 1551331276;
                        }
                    }

                    var8 = var6 + 1;
                    var3 = var98;
                    var98 = var2 + 1;
                    var98 = var2 * var98;
                    int var123 = var2 + 2;
                    var98 *= var123;
                    var123 = var2 + 3;
                    var98 *= var123;
                    var98 &= 7;
                    if (var98 != 0) {
                        switch (var1) {
                            case -1721638064:
                                var1 ^= -421618547;
                                break label125;
                            case 877125160:
                            default:
                                var1 ^= -380875831;
                                break label125;
                            case 1756259495:
                                var1 -= -1639521591;
                                var1 ^= -591619754;
                                break label125;
                        }
                    }
                    var1 = switch (var1) {
                        default -> var1 ^ 247633404;
                        case 163614873 -> var1 ^ 2002532044;
                        case 1756259495 -> {
                            var1 &= 1554716389;
                            var1 += 1592666760;
                            yield var1 ^ -1318705673;
                        }
                    };
                    long var125 = var1;
                    long var11 = var125 + 1L;
                    var11 = var125 * var11;
                    long var126 = var11 & 1L;
                    long var142;
                    var98 = (var142 = var126 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
                    if (var98 != 0) {
                        break label128;
                    }

                    var6 = var8;
                    var1 <<= 25;
                    var1 &= 197799158;
                    var1 -= -1263498083;
                    var1 ^= 265346890;
                    var1 ^= -252475692;
                }
            }

            IllegalStateException var69 = new IllegalStateException();
            throw var69;
        }

        UnsupportedOperationException var68 = new UnsupportedOperationException();
        throw var68;
    }

    public void E() {
        int var1 = pG;
        var1 ^= 1486994309;
        int var2 = System.identityHashCode(this);
        Object[] var3 = this.YX;
        Integer var17 = var2;
        if (var17 == null) {
            var1 *= -1574507019;
            var1 ^= -2111985101;
            long var4 = var1;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var24;
            int var18 = (var24 = var4 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var18 == 0) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            }
        } else {
            var1 ^= -1531679349;
            var1 += -1519144194;
            var1 *= 695680441;
            var1 ^= -968401985;
            int var20 = var1 + 1;
            var20 = var1 * var20;
            var1 = var20 & 1;
            if (var1 == 0) {
                Arrays.fill(var3, null);
                return;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1720674693;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        pG = var4;
    }
}
