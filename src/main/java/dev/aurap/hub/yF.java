package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;

public final class yF {
    public static final int w = 24;
    private static final int r = 4;
    private final double[] V;
    private final int[] qj;
    private final float[] US;
    private final int[] Z;
    private final float[] cG;
    private int ER;
    private int Zi;
    private int fE;
    private int L;
    private float XC;
    public static final int IG;

    public yF() {
        double[] var1 = new double[24];
        this.V = var1;
        int[] var2 = new int[24];
        this.qj = var2;
        float[] var3 = new float[24];
        this.US = var3;
        int[] var4 = new int[24];
        this.Z = var4;
        float[] var5 = new float[24];
        this.cG = var5;
        this.ER = 4;
        this.XC = 1.0F;
    }

    public static int zl(float var0, float var1, int var2) {
        int var3 = IG;
        var3 ^= -1062680038;
        int var5 = (int)var0;
        int var6 = var5 + 1;
        var6 = var5 * var6;
        int var7 = var5 + 2;
        var6 *= var7;
        var7 = var5 + 3;
        var6 *= var7;
        var6 &= 7;
        label182:
        if (var6 == 0) {
            var3 = switch (var3) {
                case -1826282302 -> {
                    var3 >>= 20;
                    var3 -= -1933954521;
                    yield var3 ^ -1031550610;
                }
                case -1335261625 -> var3 ^ -326541694;
                default -> var3 ^ 1858641658;
            };
            float var229;
            var6 = (var229 = var0 - 0.0F) == 0.0F ? 0 : (var229 < 0.0F ? -1 : 1);
            if (var6 > 0) {
                var3 = switch (var3) {
                    case -1312420251 -> {
                        var3 >>>= 5;
                        var3 |= -1752724243;
                        yield var3 ^ -2044653240;
                    }
                    default -> var3 ^ -1609514634;
                    case 1726481501 -> var3 ^ -1736417004;
                };
                long var128 = var2;
                long var8 = var128 + 1L;
                var8 = var128 * var8;
                long var129 = var8 & 1L;
                long var230;
                var6 = (var230 = var129 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                if (var6 == 0) {
                    if (var2 <= 0) {
                        var3 |= -1238796105;
                        var3 ^= -152313489;
                        return 4;
                    }

                    var3 += -1501881096;
                    var3 >>>= 2;
                    var3 -= 341018410;
                    var3 *= 230609579;
                    var3 ^= 587924992;
                    Integer var131 = var2;
                    if (var131 != null) {
                        float var231;
                        int var132 = (var231 = var1 - 0.0F) == 0.0F ? 0 : (var231 < 0.0F ? -1 : 1);
                        long var139 = var5;
                        long var9 = var139 + 1L;
                        var9 = var139 * var9;
                        long var140 = var9 & 1L;
                        long var232;
                        var7 = (var232 = var140 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            var3 *= 1740459251;
                            var3 &= 1675447787;
                            var3 ^= 1412655132;
                            break label182;
                        }
                        var3 = switch (var3) {
                            case -1307171029 -> {
                                var3 *= -2082026439;
                                var3 &= 891612767;
                                yield var3 ^ -35936623;
                            }
                            default -> var3 ^ -1328239734;
                            case 1265054582 -> var3 ^ 2011596868;
                        };
                        long var142 = var2;
                        var9 = var142 + 1L;
                        var9 = var142 * var9;
                        long var143 = var9 & 1L;
                        long var233;
                        var7 = (var233 = var143 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                        label166:
                        if (var7 == 0) {
                            double var137;
                            if (var132 > 0) {
                                var3 = switch (var3) {
                                    case -924890494 -> {
                                        var3 >>= 8;
                                        var3 += 2095052038;
                                        var3 &= 1520859767;
                                        yield var3 ^ -579660557;
                                    }
                                    case 1155911349 -> var3 ^ 52692402;
                                    default -> var3 ^ 763362928;
                                };
                                Integer var133 = var2;
                                if (var133 == null) {
                                    break label166;
                                }

                                float var134 = var2;
                                float var135 = Math.min(var1, var134);
                                double var136 = var135;
                                var8 = var5;
                                long var10 = var8 + 1L;
                                var10 = var8 * var10;
                                long var12 = var8 + 2L;
                                var10 *= var12;
                                var8 += 3L;
                                var10 *= var8;
                                var8 = var10 & 7L;
                                long var234;
                                int var149 = (var234 = var8 - 0L) == 0L ? 0 : (var234 < 0L ? -1 : 1);
                                if (var149 != 0) {
                                    var3 |= 761338543;
                                    var3 ^= -1148946574;
                                    break label182;
                                }

                                var3 &= -477952885;
                                var3 ^= 1662650577;
                                var8 = var2;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                var8 = var10 & 1L;
                                long var235;
                                int var152 = (var235 = var8 - 0L) == 0L ? 0 : (var235 < 0L ? -1 : 1);
                                if (var152 != 0) {
                                    break label166;
                                }

                                var137 = var136;
                                var3 <<= 16;
                                var3 &= -1570287145;
                                var3 += -54404732;
                                var3 ^= -196296331;
                                var3 ^= 1791246040;
                            } else {
                                var3 >>>= 6;
                                var3 >>= 10;
                                var3 ^= 343961806;
                                double var153 = var2;
                                Integer var175 = var5;
                                if (var175 == null) {
                                    var3 -= 1379091404;
                                    var3 <<= 1;
                                    var3 ^= -1829912233;
                                    break label182;
                                }

                                var3 |= 1950119138;
                                var3 ^= 1179229654;
                                int var176 = var2 + 1;
                                var176 = var2 * var176;
                                int var11 = var2 + 2;
                                var176 *= var11;
                                var11 = var2 + 3;
                                var176 *= var11;
                                var176 &= 7;
                                if (var176 != 0) {
                                    break label166;
                                }

                                var137 = var153;
                                var3 += 1665634274;
                                var3 ^= -1992157121;
                                var3 ^= 916003010;
                                var3 ^= 1248647123;
                            }

                            int var154 = var2 + 1;
                            int var155 = var2 * var154;
                            int var156 = var155 & 1;
                            if (var156 == 0) {
                                Integer var157 = var5;
                                if (var157 == null) {
                                    var3 *= 863018327;
                                    var3 += 535472062;
                                    var3 <<= 26;
                                    var3 ^= -1569248803;
                                    break label182;
                                }

                                var3 <<= 28;
                                var3 ^= -311064453;
                                var3 ^= 1026347926;
                                Integer var158 = var2;
                                label150:
                                if (var158 != null) {
                                    float var236;
                                    int var159 = (var236 = var1 - 0.0F) == 0.0F ? 0 : (var236 < 0.0F ? -1 : 1);
                                    double var166;
                                    if (var159 > 0) {
                                        var3 *= -289344357;
                                        var3 -= 1114153581;
                                        var3 ^= 1412820189;
                                        var3 &= -915320492;
                                        var3 ^= 1215588808;
                                        var8 = var2;
                                        long var181 = var8 + 1L;
                                        var181 = var8 * var181;
                                        long var203 = var8 + 2L;
                                        var181 *= var203;
                                        var8 += 3L;
                                        var181 *= var8;
                                        var8 = var181 & 7L;
                                        long var237;
                                        int var163 = (var237 = var8 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                                        if (var163 != 0) {
                                            break label150;
                                        }

                                        double var164 = var1;
                                        var181 = var5;
                                        var203 = var181 + 1L;
                                        var203 = var181 * var203;
                                        var181 = var203 & 1L;
                                        long var238;
                                        int var187 = (var238 = var181 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                                        if (var187 != 0) {
                                            switch (var3) {
                                                case -125895401:
                                                    var3 ^= 1226803817;
                                                    break label182;
                                                case 155478412:
                                                    var3 += 1606359715;
                                                    var3 ^= 2138353138;
                                                    break label182;
                                                case 776985561:
                                                default:
                                                    var3 ^= 66011817;
                                                    break label182;
                                            }
                                        }

                                        var3 *= -87994081;
                                        var3 -= -507959919;
                                        var3 ^= 1767327772;
                                        var181 = var2;
                                        var203 = var181 + 1L;
                                        var203 = var181 * var203;
                                        long var14 = var181 + 2L;
                                        var203 *= var14;
                                        var181 += 3L;
                                        var203 *= var181;
                                        var181 = var203 & 7L;
                                        long var239;
                                        int var191 = (var239 = var181 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
                                        if (var191 != 0) {
                                            break label150;
                                        }

                                        double var165 = 1.0 / var164;
                                        var166 = var165;
                                        switch (var3) {
                                            case -364680225:
                                                var3 ^= -217903800;
                                                break;
                                            case 1154983551:
                                                var3 &= -81032918;
                                                var3 += -818279645;
                                                var3 -= -1335042628;
                                                var3 <<= 12;
                                                var3 ^= -1845479425;
                                                break;
                                            case 2021945774:
                                            default:
                                                var3 ^= -366505708;
                                        }
                                    } else {
                                        var3 += 997676452;
                                        var3 <<= 12;
                                        var3 ^= 1297691143;
                                        var3 |= 248154167;
                                        var3 ^= 1614260891;
                                        long var192 = var2;
                                        long var210 = var192 + 1L;
                                        var210 = var192 * var210;
                                        var192 = var210 & 1L;
                                        long var240;
                                        int var194 = (var240 = var192 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                                        if (var194 != 0) {
                                            break label150;
                                        }

                                        double var195 = var2;
                                        Integer var212 = var5;
                                        if (var212 == null) {
                                            var3 += -1597128815;
                                            var3 *= 245600579;
                                            var3 ^= -474024662;
                                            break label182;
                                        }

                                        var3 |= 133177264;
                                        var3 *= -1347664621;
                                        var3 ^= -1818315014;
                                        var3 ^= 1458223624;
                                        var210 = var2;
                                        long var226 = var210 + 1L;
                                        var226 = var210 * var226;
                                        var210 = var226 & 1L;
                                        long var241;
                                        int var215 = (var241 = var210 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                                        if (var215 != 0) {
                                            break label150;
                                        }

                                        double var196 = 1.0 / var195;
                                        var166 = var196;
                                        switch (var3) {
                                            case -763054291:
                                            default:
                                                var3 ^= -180913099;
                                                break;
                                            case -87136166:
                                                var3 ^= -1613310464;
                                                break;
                                            case 1523780102:
                                                var3 += 2034304978;
                                                var3 ^= 1288517159;
                                        }
                                    }

                                    long var197 = var2;
                                    long var216 = var197 + 1L;
                                    var216 = var197 * var216;
                                    long var228 = var197 + 2L;
                                    var216 *= var228;
                                    var197 += 3L;
                                    var216 *= var197;
                                    var197 = var216 & 7L;
                                    long var242;
                                    int var200 = (var242 = var197 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                                    if (var200 == 0) {
                                        double var201 = var0;
                                        int var220 = var5 + 1;
                                        int var221 = var5 * var220;
                                        int var13 = var5 + 2;
                                        int var222 = var221 * var13;
                                        var5 += 3;
                                        int var223 = var222 * var5;
                                        var5 = var223 & 7;
                                        if (var5 != 0) {
                                            var3 -= 1549473134;
                                            var3 ^= 705248076;
                                            break label182;
                                        }

                                        switch (var3) {
                                            case -1730598913:
                                                var3 ^= -1185154894;
                                                var3 ^= 1494785952;
                                                break;
                                            case -1633573483:
                                            default:
                                                var3 ^= -578406915;
                                                break;
                                            case -1064904512:
                                                var3 ^= 998876277;
                                        }

                                        long var4 = var2;
                                        var216 = var4 + 1L;
                                        var216 = var4 * var216;
                                        var4 = var216 & 1L;
                                        long var243;
                                        int var114 = (var243 = var4 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                                        if (var114 == 0) {
                                            double var115 = var201 / var137;
                                            double var116 = var115 / var166;
                                            double var117 = var116 - 1.0E-6;
                                            double var118 = Math.ceil(var117);
                                            int var119 = (int)var118;
                                            return var119 + 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                AssertionError var120 = new AssertionError();
                throw var120;
            } else {
                switch (var3) {
                    case -1312420251:
                        var3 *= -926735439;
                        var3 |= -1808029497;
                        var3 ^= 1830928980;
                        var3 ^= -258329509;
                        break;
                    case -534063277:
                        var3 ^= 328178283;
                        break;
                    case 897136537:
                    default:
                        var3 ^= -836339373;
                }
            }

            return 4;
        } else {
            var3 *= -356769131;
            var3 >>>= 24;
            var3 ^= 376908088;
        }

        IllegalStateException var110 = new IllegalStateException();
        throw var110;
    }

    public void S() {
        int var1 = IG;
        var1 ^= 1759143204;
        int var2 = System.identityHashCode(this);
        double[] var3 = this.V;
        Arrays.fill(var3, 0.0);
        this.Zi = 0;
        this.fE = 0;
        this.L = 0;
        int var24 = var2 + 1;
        int var25 = var2 * var24;
        var2 = var25 & 1;
        int var26 = of_2.sS;
        var1 ^= var26;
        var1 ^= -1964026;
        of_2.sS = -1964026;
        int var27 = of_2.gl;
        var1 ^= var27;
        var1 ^= -1560118394;
        of_2.gl = -1560118394;
        if (var2 == 0) {
            var1 >>= 23;
            var1 |= -449226822;
            var1 -= 1497075177;
            var1 ^= 649674953;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                this.XC = 1.0F;
                return;
            }
        } else {
            var1 += -426366534;
            var1 |= -16229685;
            var1 -= -16697366;
            var1 ^= 238722822;
            Integer var17 = var1;
            if (var17 != null) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        }

        RuntimeException var18 = new RuntimeException();
        throw var18;
    }

    public boolean Eb(int var1) {
        int var2 = IG;
        var2 ^= 1769173281;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        int var6 = var4 + 2;
        var5 *= var6;
        var6 = var4 + 3;
        var5 *= var6;
        var5 &= 7;
        label50:
        if (var5 == 0) {
            var2 = switch (var2) {
                case -648172068 -> var2 ^ -1848434866;
                default -> var2 ^ 703894316;
                case 989765625 -> {
                    var2 >>>= 15;
                    var2 *= -1750801937;
                    var2 <<= 8;
                    yield var2 ^ -1730935664;
                }
            };
            var5 = var1 + 1;
            var5 = var1 * var5;
            var5 &= 1;
            if (var5 == 0) {
                var5 = var1 + 3;
                var5 &= -4;
                var5 = Math.max(4, var5);
                var5 = Math.min(24, var5);
                var6 = this.ER;
                if (var5 <= var6) {
                    var2 |= -386651210;
                    var2 ^= -1412858663;
                    long var52 = var1;
                    long var8 = var52 + 1L;
                    var8 = var52 * var8;
                    long var10 = var52 + 2L;
                    var8 *= var10;
                    long var53 = var52 + 3L;
                    var8 *= var53;
                    long var54 = var8 & 7L;
                    long var68;
                    var6 = (var68 = var54 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        return false;
                    }
                } else {
                    var2 ^= 2072256277;
                    var2 *= 1129846931;
                    var2 ^= 1649979412;
                    long var56 = var1;
                    long var63 = var56 + 1L;
                    var63 = var56 * var63;
                    long var67 = var56 + 2L;
                    var63 *= var67;
                    long var57 = var56 + 3L;
                    var63 *= var57;
                    long var58 = var63 & 7L;
                    long var69;
                    var6 = (var69 = var58 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        this.ER = var5;
                        var5 = var4 + 1;
                        var5 = var4 * var5;
                        var4 = var5 & 1;
                        if (var4 != 0) {
                            switch (var2) {
                                case -1643180981:
                                    var2 &= -924824975;
                                    var2 ^= -362133620;
                                    break label50;
                                case 496262820:
                                default:
                                    var2 ^= 1938944297;
                                    break label50;
                                case 1622407704:
                                    var2 ^= -200998812;
                                    break label50;
                            }
                        }

                        var2 -= 207668208;
                        var2 *= -1298616061;
                        var2 ^= -1248185597;
                        Integer var3 = var1;
                        if (var3 != null) {
                            this.S();
                            return true;
                        }
                    }
                }
            }

            IllegalStateException var35 = new IllegalStateException();
            throw var35;
        } else {
            switch (var2) {
                case -780286669:
                    var2 ^= -1517628134;
                    break;
                case 801536999:
                default:
                    var2 ^= 940756173;
                    break;
                case 989765625:
                    var2 >>= 30;
                    var2 += -1377377941;
                    var2 ^= -812863834;
            }
        }

        UnsupportedOperationException var34 = new UnsupportedOperationException();
        throw var34;
    }

    public int yA(double var1) {
        label56: {
            int var3 = IG;
            var3 ^= -346960488;
            int var4 = System.identityHashCode(this);
            int var5 = this.Zi;
            int var6 = var4 + 1;
            var6 = var4 * var6;
            var6 &= 1;
            if (var6 == 0) {
                var3 = switch (var3) {
                    case -1193532608 -> {
                        var3 -= -1246724056;
                        var3 &= -1495896171;
                        var3 *= -490839131;
                        yield var3 ^ -1972175177;
                    }
                    default -> var3 ^ 730046220;
                    case 1891935561 -> var3 ^ -1002767881;
                };
                var6 = var3 + 1;
                var6 = var3 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    break label56;
                }

                double[] var47 = this.V;
                var47[var5] = var1;
                var6 = this.Zi;
                var6++;
                int var7 = this.ER;
                var6 %= var7;
                this.Zi = var6;
                var6 = this.fE;
                var7 = this.ER;
                if (var6 >= var7) {
                    var3 >>>= 29;
                    var3 &= -1677695622;
                    var3 *= 501219627;
                    var3 += 1320767031;
                    var3 ^= -38089687;
                    return var5;
                }

                var3 -= -539161985;
                var3 <<= 1;
                var3 -= 815808415;
                var3 ^= 567693702;
                var6 = var3 + 1;
                var6 = var3 * var6;
                var7 = var3 + 2;
                var6 *= var7;
                var7 = var3 + 3;
                var6 *= var7;
                var6 &= 7;
                if (var6 != 0) {
                    break label56;
                }

                var6 = this.fE;
                Integer var35 = var4;
                if (var35 != null) {
                    var3 = switch (var3) {
                        case -1930016073 -> {
                            var3 &= -694665415;
                            yield var3 ^ 1710432979;
                        }
                        case 682513739 -> var3 ^ -339475193;
                        default -> var3 ^ -1451040449;
                    };
                    int var36 = var3 + 1;
                    var36 = var3 * var36;
                    var7 = var3 + 2;
                    var36 *= var7;
                    var7 = var3 + 3;
                    var36 *= var7;
                    var36 &= 7;
                    if (var36 != 0) {
                        break label56;
                    }

                    var36 = var6 + 1;
                    this.fE = var36;
                    var3 += 1068834695;
                    var3 ^= 1457247437;
                    return var5;
                }

                var3 ^= 1360788488;
                var3 &= -1022695770;
                var3 >>>= 30;
                var3 += 1548925496;
                var3 ^= 669517496;
            } else {
                switch (var3) {
                    case -1359572464:
                    default:
                        var3 ^= 1828712190;
                        break;
                    case -1193532608:
                        var3 ^= 2065560706;
                        var3 ^= -1199871167;
                        break;
                    case 962870990:
                        var3 ^= 1763451311;
                }
            }

            Integer var32 = var3;
            if (var32 != null) {
                RuntimeException var34 = new RuntimeException();
                throw var34;
            }
        }

        IllegalArgumentException var33 = new IllegalArgumentException();
        throw var33;
    }

    public int q(double var1, int var3, float var4, int var5, float var6) {
        label642: {
            int var7 = IG;
            int var8 = var3;
            var7 ^= 962708618;
            int var9 = System.identityHashCode(this);
            float[] var10 = this.US;
            Arrays.fill(var10, 0.0F);
            this.L = 0;
            int var421 = this.fE;
            Integer var11 = var9;
            if (var11 == null) {
                switch (var7) {
                    case 1650675567:
                    default:
                        var7 ^= 2128899498;
                        break;
                    case 1793862226:
                        var7 |= -314511292;
                        var7 >>= 30;
                        var7 ^= 2100975911;
                        break;
                    case 1804559541:
                        var7 ^= -1191277007;
                }
            } else {
                label679: {
                    var7 = switch (var7) {
                        default -> var7 ^ -767325461;
                        case 1628759351 -> var7 ^ 893120147;
                        case 1793862226 -> {
                            var7 &= -1859640416;
                            var7 *= -245907065;
                            yield var7 ^ -263360651;
                        }
                    };
                    int var451 = var3 + 1;
                    var451 = var3 * var451;
                    int var12 = var3 + 2;
                    var451 *= var12;
                    var12 = var3 + 3;
                    var451 *= var12;
                    var451 &= 7;
                    if (var451 != 0) {
                        break label642;
                    }

                    if (var421 > 0) {
                        var7 *= 2094746373;
                        var7 ^= -955294833;
                        if (var3 > 0) {
                            var7 = switch (var7) {
                                case -22309434 -> {
                                    var7 *= 1733502981;
                                    var7 += 1346279427;
                                    var7 <<= 18;
                                    yield var7 ^ -838950920;
                                }
                                case 147460405 -> var7 ^ -680175748;
                                default -> var7 ^ 343071543;
                            };
                            long var422 = var3;
                            long var472 = var422 + 1L;
                            long var473 = var422 * var472;
                            long var423 = var473 & 1L;
                            long var761;
                            int var424 = (var761 = var423 - 0L) == 0L ? 0 : (var761 < 0L ? -1 : 1);
                            if (var424 != 0) {
                                break label642;
                            }

                            float var762;
                            int var425 = (var762 = var4 - 0.0F) == 0.0F ? 0 : (var762 < 0.0F ? -1 : 1);
                            Integer var456 = var9;
                            if (var456 != null) {
                                var7 >>>= 9;
                                var7 *= 852088481;
                                var7 ^= 974868067;
                                double var429;
                                if (var425 > 0) {
                                    var7 = switch (var7) {
                                        default -> var7 ^ -579994797;
                                        case 1582870882 -> var7 ^ 1967018469;
                                        case 1841813196 -> {
                                            var7 &= 772414979;
                                            var7 *= 1418719909;
                                            var7 >>= 9;
                                            var7 += 2124602765;
                                            yield var7 ^ 787813868;
                                        }
                                    };
                                    Integer var426 = var3;
                                    if (var426 == null) {
                                        break label642;
                                    }

                                    double var427 = var4;
                                    double var474 = var3;
                                    int var14 = var9 + 1;
                                    var14 = var9 * var14;
                                    var14 &= 1;
                                    if (var14 != 0) {
                                        var7 *= -1557914199;
                                        var7 += 1830411583;
                                        var7 += 1310892177;
                                        var7 |= -375604914;
                                        var7 ^= 2101041542;
                                        break label679;
                                    }

                                    var7 &= 2059664841;
                                    var7 -= -2028349772;
                                    var7 >>>= 26;
                                    var7 += -854989375;
                                    var7 ^= 1018027424;
                                    double var428 = Math.min(var427, var474);
                                    var429 = var428;
                                    var7 -= -2038420732;
                                    var7 += 1105988603;
                                    var7 ^= -1427248723;
                                    var7 ^= 1318951484;
                                    var7 ^= -1310749515;
                                } else {
                                    var7 = switch (var7) {
                                        case 595068014 -> var7 ^ -2109216866;
                                        default -> var7 ^ -1495986079;
                                        case 1841813196 -> {
                                            var7 ^= -1627575574;
                                            var7 += -846527128;
                                            yield var7 ^ -491879018;
                                        }
                                    };
                                    var12 = var3 + 1;
                                    var12 = var3 * var12;
                                    var12 &= 1;
                                    if (var12 != 0) {
                                        break label642;
                                    }

                                    double var478 = var3;
                                    int var531 = var9 + 1;
                                    var531 = var9 * var531;
                                    var531 &= 1;
                                    if (var531 != 0) {
                                        var7 &= -331600876;
                                        var7 *= -1089778733;
                                        var7 += -289525926;
                                        var7 ^= -950034862;
                                        break label679;
                                    }
                                    var7 = switch (var7) {
                                        default -> var7 ^ 1951435652;
                                        case -162531448 -> var7 ^ -642475655;
                                        case 577274904 -> {
                                            var7 >>= 30;
                                            yield var7 ^ -1700790575;
                                        }
                                    };
                                    var531 = var3 + 1;
                                    var531 = var3 * var531;
                                    var531 &= 1;
                                    if (var531 != 0) {
                                        break label642;
                                    }

                                    var429 = var478;
                                    var7 *= 467692809;
                                    var7 ^= -156407233;
                                    var7 >>>= 13;
                                    var7 ^= -121842446;
                                }

                                var12 = var3 + 1;
                                var12 = var3 * var12;
                                int var13 = var3 + 2;
                                var12 *= var13;
                                var13 = var3 + 3;
                                var12 *= var13;
                                var12 &= 7;
                                if (var12 != 0) {
                                    break label642;
                                }

                                double var484 = var6;
                                int var537 = var9 + 1;
                                var537 = var9 * var537;
                                var537 &= 1;
                                if (var537 != 0) {
                                    switch (var7) {
                                        case -1345546039:
                                        default:
                                            var7 ^= -1383190915;
                                            break label679;
                                        case -121641362:
                                            var7 |= 591064933;
                                            var7 ^= 2038057399;
                                            break label679;
                                        case 423323756:
                                            var7 ^= 1714473457;
                                            break label679;
                                    }
                                }

                                var7 &= -2048126723;
                                var7 ^= 430674039;
                                var537 = var3 + 1;
                                var537 = var3 * var537;
                                int var15 = var3 + 2;
                                var537 *= var15;
                                var15 = var3 + 3;
                                var537 *= var15;
                                var537 &= 7;
                                if (var537 != 0) {
                                    break label642;
                                }

                                double var485 = Math.max(0.0, var484);
                                double var430 = var485 / var429;
                                double var431 = var1 - var430;
                                double var432 = var431;
                                float var763;
                                var12 = (var763 = var4 - 0.0F) == 0.0F ? 0 : (var763 < 0.0F ? -1 : 1);
                                double var493;
                                if (var12 > 0) {
                                    var7 >>= 27;
                                    var7 ^= 414404606;
                                    long var487 = var3;
                                    long var545 = var487 + 1L;
                                    long var546 = var487 * var545;
                                    long var16 = var487 + 2L;
                                    long var547 = var546 * var16;
                                    long var488 = var487 + 3L;
                                    long var548 = var547 * var488;
                                    long var489 = var548 & 7L;
                                    long var764;
                                    var12 = (var764 = var489 - 0L) == 0L ? 0 : (var764 < 0L ? -1 : 1);
                                    if (var12 != 0) {
                                        break label642;
                                    }

                                    double var491 = var4;
                                    long var549 = var9;
                                    var16 = var549 + 1L;
                                    var16 = var549 * var16;
                                    long var550 = var16 & 1L;
                                    long var765;
                                    var537 = (var765 = var550 - 0L) == 0L ? 0 : (var765 < 0L ? -1 : 1);
                                    if (var537 != 0) {
                                        var7 <<= 22;
                                        var7 ^= -1791327034;
                                        var7 &= 2068920920;
                                        var7 |= 573523715;
                                        var7 ^= -1329929829;
                                        break label679;
                                    }

                                    var7 *= 1677793963;
                                    var7 ^= 813289652;
                                    Integer var552 = var3;
                                    if (var552 == null) {
                                        break label642;
                                    }

                                    double var492 = 1.0 / var491;
                                    var493 = var492;
                                    switch (var7) {
                                        case -98767468:
                                            var7 ^= -1101942102;
                                            break;
                                        case 806090040:
                                        default:
                                            var7 ^= 1115236758;
                                            break;
                                        case 1046362651:
                                            var7 &= 589420431;
                                            var7 ^= 441554381;
                                    }
                                } else {
                                    var7 = switch (var7) {
                                        case -1727557605 -> {
                                            var7 -= 904557446;
                                            var7 += 364598303;
                                            var7 &= -1121722748;
                                            var7 |= 1963886124;
                                            yield var7 ^ -1221543837;
                                        }
                                        default -> var7 ^ -1527245088;
                                        case 2095032966 -> var7 ^ -1851902657;
                                    };
                                    long var553 = var3;
                                    long var578 = var553 + 1L;
                                    var578 = var553 * var578;
                                    long var554 = var578 & 1L;
                                    long var766;
                                    var537 = (var766 = var554 - 0L) == 0L ? 0 : (var766 < 0L ? -1 : 1);
                                    if (var537 != 0) {
                                        break label642;
                                    }

                                    double var556 = var3;
                                    double var557 = 1.0 / var556;
                                    int var580 = var9 + 1;
                                    int var581 = var9 * var580;
                                    int var582 = var581 & 1;
                                    if (var582 != 0) {
                                        switch (var7) {
                                            case -1649277502:
                                            default:
                                                var7 ^= 770498448;
                                                break label679;
                                            case -1595735626:
                                                var7 ^= -74639503;
                                                break label679;
                                            case -901878065:
                                                var7 <<= 30;
                                                var7 *= 1672252105;
                                                var7 ^= -247922958;
                                                var7 ^= -1275242454;
                                                break label679;
                                        }
                                    }

                                    var7 -= -38918759;
                                    var7 >>>= 11;
                                    var7 ^= -1582910498;
                                    var7 ^= -296692487;
                                    var493 = var557;
                                    var7 ^= 1864206118;
                                    var7 >>>= 5;
                                    var7 ^= 961942614;
                                }

                                Integer var558 = var3;
                                if (var558 == null) {
                                    break label642;
                                }

                                double var494 = var493;
                                double var559 = 0.0;
                                int var583 = 0;
                                int var17 = this.Zi;
                                int var18 = var9 + 1;
                                var18 = var9 * var18;
                                int var19 = var9 + 2;
                                var18 *= var19;
                                var19 = var9 + 3;
                                var18 *= var19;
                                var18 &= 7;
                                if (var18 == 0) {
                                    var7 = switch (var7) {
                                        case -186505638 -> var7 ^ -1224869764;
                                        case 944867270 -> {
                                            var7 &= 1736932756;
                                            yield var7 ^ 706401609;
                                        }
                                        default -> var7 ^ -386084554;
                                    };
                                    var18 = var3 + 1;
                                    var18 = var3 * var18;
                                    var18 &= 1;
                                    if (var18 != 0) {
                                        break label642;
                                    }

                                    var18 = this.fE;
                                    var17 -= var18;
                                    if (var17 < 0) {
                                        var7 &= -1470382885;
                                        var7 -= -459254730;
                                        var7 ^= -2078574564;
                                        long var598 = var3;
                                        long var20 = var598 + 1L;
                                        var20 = var598 * var20;
                                        long var599 = var20 & 1L;
                                        long var767;
                                        var18 = (var767 = var599 - 0L) == 0L ? 0 : (var767 < 0L ? -1 : 1);
                                        if (var18 != 0) {
                                            break label642;
                                        }

                                        var18 = this.ER;
                                        var18 = var17 + var18;
                                        var19 = var9 + 1;
                                        var19 = var9 * var19;
                                        var19 &= 1;
                                        if (var19 != 0) {
                                            var7 |= 91205727;
                                            var7 += -695516888;
                                            var7 ^= -12676897;
                                            break label679;
                                        }

                                        var7 += 179824223;
                                        var7 ^= 511472265;
                                        var18 = var18;
                                        var7 += -981991727;
                                        var7 ^= 1511328923;
                                        var7 ^= 898818480;
                                    } else {
                                        var7 += -425634795;
                                        var7 |= 1230353556;
                                        var7 ^= 32616987;
                                        var19 = var3 + 1;
                                        var19 = var3 * var19;
                                        var19 &= 1;
                                        if (var19 != 0) {
                                            break label642;
                                        }

                                        var18 = var17;
                                        switch (var7) {
                                            case -133429523:
                                                var7 += 810373606;
                                                var7 <<= 12;
                                                var7 ^= -1948874221;
                                                break;
                                            case 1273745834:
                                                var7 ^= 1923496670;
                                                break;
                                            case 1549597302:
                                            default:
                                                var7 ^= 731019435;
                                        }
                                    }

                                    int var586 = 0;
                                    double var560 = var559;
                                    var583 = var583;
                                    Integer var611 = var9;
                                    if (var611 == null) {
                                        var7 &= -2003773240;
                                        var7 *= -405561991;
                                        var7 -= -1478875407;
                                        var7 ^= 535828439;
                                        break label679;
                                    }

                                    var7 &= 866536099;
                                    var7 -= 1240216716;
                                    var7 += 523501105;
                                    var7 &= -1622898833;
                                    var7 ^= 2004095072;
                                    var611 = var3;
                                    if (var611 == null) {
                                        break label642;
                                    }

                                    var586 = var586;

                                    var7 = switch (var7) {
                                        case -264989880 -> {
                                            var7 &= -636711534;
                                            var7 |= 751409878;
                                            var7 >>= 31;
                                            yield var7 ^ 1449812398;
                                        }
                                        default -> var7 ^ -1829827892;
                                        case 2042237317 -> var7 ^ -73477091;
                                    };

                                    while (true) {
                                        var611 = var8;
                                        if (var611 == null) {
                                            break label642;
                                        }

                                        int var614 = this.fE;
                                        Integer var637 = var9;
                                        if (var637 == null) {
                                            var7 += 245479907;
                                            var7 >>= 27;
                                            var7 &= 935277210;
                                            var7 ^= -1250257846;
                                            break label679;
                                        }
                                        var7 = switch (var7) {
                                            case -1449812399 -> {
                                                var7 >>>= 31;
                                                var7 -= -1270336454;
                                                yield var7 ^ 1062889320;
                                            }
                                            default -> var7 ^ 408334630;
                                            case -149913591 -> var7 ^ 674334648;
                                        };
                                        if (var586 >= var614) {
                                            var7 *= -995287515;
                                            var7 ^= -1793059654;
                                            var7 ^= -1942107544;
                                            var7 ^= 1194771113;
                                            Integer var433 = var8;
                                            if (var433 == null) {
                                                break label642;
                                            }

                                            if (var583 > 0) {
                                                var7 ^= 1861072367;
                                                var7 >>>= 25;
                                                var7 *= -1192271929;
                                                var7 *= -1365356957;
                                                var7 ^= 516246362;
                                                int var434 = var8 + 1;
                                                int var435 = var8 * var434;
                                                int var457 = var8 + 2;
                                                int var436 = var435 * var457;
                                                var457 = var8 + 3;
                                                int var437 = var436 * var457;
                                                int var438 = var437 & 7;
                                                if (var438 != 0) {
                                                    break label642;
                                                }

                                                double var768;
                                                int var439 = (var768 = var560 - 1.0E-7) == 0.0 ? 0 : (var768 < 0.0 ? -1 : 1);
                                                long var459 = var9;
                                                long var509 = var459 + 1L;
                                                long var510 = var459 * var509;
                                                long var460 = var510 & 1L;
                                                long var769;
                                                var457 = (var769 = var460 - 0L) == 0L ? 0 : (var769 < 0L ? -1 : 1);
                                                if (var457 != 0) {
                                                    var7 |= -1178939746;
                                                    var7 ^= 1031764071;
                                                    break label679;
                                                }

                                                var7 &= 1485188139;
                                                var7 ^= 100377722;
                                                if (var439 > 0) {
                                                    var7 = switch (var7) {
                                                        case 368815195 -> {
                                                            var7 |= -1145623049;
                                                            yield var7 ^ 495418491;
                                                        }
                                                        default -> var7 ^ 2097255090;
                                                        case 1600675829 -> var7 ^ -1211029469;
                                                    };
                                                    int var440 = var8 + 1;
                                                    int var441 = var8 * var440;
                                                    int var442 = var441 & 1;
                                                    if (var442 != 0) {
                                                        break label642;
                                                    }

                                                    int var450;
                                                    if (var583 > var5) {
                                                        var7 -= -140220784;
                                                        var7 ^= 649294366;
                                                        int var443 = var8 + 1;
                                                        int var444 = var8 * var443;
                                                        int var445 = var444 & 1;
                                                        if (var445 != 0) {
                                                            break label642;
                                                        }

                                                        int var446 = var7 >> 7;
                                                        int var447 = var446 - -1198135052;
                                                        int var448 = var447 ^ -1773307832;
                                                        int var449 = this.oK(var583, var5, var448);
                                                        var457 = var9 + 1;
                                                        var457 = var9 * var457;
                                                        var457 &= 1;
                                                        if (var457 != 0) {
                                                            var7 ^= -131908218;
                                                            var7 ^= -159284300;
                                                            break label679;
                                                        }

                                                        var7 *= 420142151;
                                                        var7 ^= -363052924;
                                                        var7 -= 295813215;
                                                        var7 ^= -600963178;
                                                        var450 = var449;
                                                        var7 *= 1279164827;
                                                        var7 ^= -394503207;
                                                        var7 >>= 1;
                                                        var7 &= 1266374619;
                                                        var7 ^= 1009783591;
                                                    } else {
                                                        var7 *= -444965601;
                                                        var7 -= 941651393;
                                                        var7 ^= 1724390326;
                                                        var450 = var583;
                                                        var7 |= 1598723462;
                                                        var7 |= 1275072362;
                                                        var7 += -858433018;
                                                        var7 *= -744337103;
                                                        var7 ^= -894395375;
                                                    }

                                                    Integer var465 = var8;
                                                    if (var465 == null) {
                                                        break label642;
                                                    }

                                                    float var466 = 0.0F;
                                                    int var495 = 0;
                                                    Integer var511 = var9;
                                                    if (var511 == null) {
                                                        var7 += 1669212210;
                                                        var7 += -507725221;
                                                        var7 *= 702913785;
                                                        var7 *= 505730849;
                                                        var7 ^= -318458815;
                                                        break label679;
                                                    } else {
                                                        var7 &= -861001807;
                                                        var7 ^= 1755587246;
                                                        int var512 = var8 + 1;
                                                        var512 = var8 * var512;
                                                        var512 &= 1;
                                                        if (var512 != 0) {
                                                            break label642;
                                                        }

                                                        var495 = var495;
                                                        float var467 = var466;
                                                        var7 ^= 1486665577;
                                                        var7 &= 579647196;
                                                        var7 &= -1408692842;
                                                        var7 *= 937434863;
                                                        var7 ^= 979739408;

                                                        while (true) {
                                                            long var515 = var8;
                                                            long var566 = var515 + 1L;
                                                            long var567 = var515 * var566;
                                                            long var588 = var515 + 2L;
                                                            long var568 = var567 * var588;
                                                            long var516 = var515 + 3L;
                                                            long var569 = var568 * var516;
                                                            long var517 = var569 & 7L;
                                                            long var770;
                                                            var512 = (var770 = var517 - 0L) == 0L ? 0 : (var770 < 0L ? -1 : 1);
                                                            if (var512 != 0) {
                                                                break label642;
                                                            }

                                                            if (var495 >= var450) {
                                                                var7 ^= -1374003562;
                                                                var7 ^= 646518431;
                                                                var7 &= 1141484502;
                                                                var7 ^= -465182539;
                                                                var495 = var8 + 1;
                                                                var495 = var8 * var495;
                                                                var495 &= 1;
                                                                if (var495 != 0) {
                                                                    break label642;
                                                                }

                                                                float var771;
                                                                var495 = (var771 = var467 - 0.0F) == 0.0F ? 0 : (var771 < 0.0F ? -1 : 1);
                                                                long var522 = var9;
                                                                long var570 = var522 + 1L;
                                                                long var571 = var522 * var570;
                                                                long var523 = var571 & 1L;
                                                                long var772;
                                                                var512 = (var772 = var523 - 0L) == 0L ? 0 : (var772 < 0L ? -1 : 1);
                                                                if (var512 != 0) {
                                                                    var7 >>>= 18;
                                                                    var7 -= -1271246832;
                                                                    var7 += -246150116;
                                                                    var7 += 167998118;
                                                                    var7 ^= -975650789;
                                                                } else {
                                                                    var7 = switch (var7) {
                                                                        case -532322015 -> {
                                                                            var7 &= -1692075381;
                                                                            var7 -= 772676970;
                                                                            var7 >>>= 1;
                                                                            yield var7 ^ 169916041;
                                                                        }
                                                                        default -> var7 ^ 1574855189;
                                                                        case 616102671 -> var7 ^ -1292609681;
                                                                    };
                                                                    long var525 = var8;
                                                                    long var572 = var525 + 1L;
                                                                    long var573 = var525 * var572;
                                                                    long var589 = var525 + 2L;
                                                                    long var574 = var573 * var589;
                                                                    long var526 = var525 + 3L;
                                                                    long var575 = var574 * var526;
                                                                    long var527 = var575 & 7L;
                                                                    long var773;
                                                                    var512 = (var773 = var527 - 0L) == 0L ? 0 : (var773 < 0L ? -1 : 1);
                                                                    if (var512 != 0) {
                                                                        break label642;
                                                                    }

                                                                    float var469;
                                                                    if (var495 > 0) {
                                                                        var7 >>>= 8;
                                                                        var7 ^= -599503929;
                                                                        var7 -= -1465806917;
                                                                        var7 += 1131043341;
                                                                        var7 ^= 2010160100;
                                                                        float var468 = 1.0F / var467;
                                                                        var495 = var9 + 1;
                                                                        var495 = var9 * var495;
                                                                        var495 &= 1;
                                                                        if (var495 != 0) {
                                                                            var7 -= 813604167;
                                                                            var7 &= 1499840651;
                                                                            var7 ^= -758864301;
                                                                            break label679;
                                                                        }

                                                                        var7 *= 1633591021;
                                                                        var7 &= -1885789119;
                                                                        var7 += -2074464171;
                                                                        var7 -= -1342371780;
                                                                        var7 ^= -423541061;
                                                                        Integer var504 = var8;
                                                                        if (var504 == null) {
                                                                            break label642;
                                                                        }

                                                                        var469 = var468;
                                                                        var7 += -73088341;
                                                                        var7 >>= 23;
                                                                        var7 |= -219779302;
                                                                        var7 ^= -1548713499;
                                                                    } else {
                                                                        var7 = switch (var7) {
                                                                            case -1700892809 -> var7 ^ -2055228377;
                                                                            default -> var7 ^ -139502565;
                                                                            case 584815554 -> {
                                                                                var7 &= 546217238;
                                                                                yield var7 ^ 1834834264;
                                                                            }
                                                                        };
                                                                        long var505 = var8;
                                                                        long var563 = var505 + 1L;
                                                                        long var564 = var505 * var563;
                                                                        long var506 = var564 & 1L;
                                                                        long var774;
                                                                        var495 = (var774 = var506 - 0L) == 0L ? 0 : (var774 < 0L ? -1 : 1);
                                                                        if (var495 != 0) {
                                                                            break label642;
                                                                        }

                                                                        var469 = 1.0F;
                                                                        var7 >>>= 27;
                                                                        var7 ^= 1183677018;
                                                                        var7 |= -1948758667;
                                                                        var7 ^= -1819147896;
                                                                    }

                                                                    this.XC = var469;
                                                                    Integer var414 = var9;
                                                                    if (var414 != null) {
                                                                        var7 |= 289048233;
                                                                        var7 ^= -55243014;
                                                                        var414 = var8;
                                                                        if (var414 != null) {
                                                                            this.L = var450;
                                                                            return var450;
                                                                        }
                                                                        break label642;
                                                                    }

                                                                    var7 ^= -1707496414;
                                                                    var7 *= -863758033;
                                                                    var7 ^= 1654254923;
                                                                }
                                                                break label679;
                                                            }

                                                            var7 += 1224096641;
                                                            var7 |= -713135248;
                                                            var7 *= -135521197;
                                                            var7 &= 713496877;
                                                            var7 ^= -1558516860;
                                                            float[] var519 = this.US;
                                                            float var520 = var519[var495];
                                                            float var521 = var467 + var520;
                                                            int var561 = var495 + 1;
                                                            var495 = var561;
                                                            Integer var562 = var9;
                                                            if (var562 == null) {
                                                                var7 &= 1150144797;
                                                                var7 ^= 1782016817;
                                                                var7 *= 1227041799;
                                                                var7 ^= -1772926840;
                                                                break label679;
                                                            }

                                                            var7 &= -102440913;
                                                            var7 *= -1984069097;
                                                            var7 &= 1403673039;
                                                            var7 <<= 2;
                                                            var7 ^= -83236146;
                                                            var467 = var521;
                                                            var7 *= -689182619;
                                                            var7 *= -711406159;
                                                            var7 |= -1598202591;
                                                            var7 ^= 598628359;
                                                        }
                                                    }
                                                }

                                                switch (var7) {
                                                    case -392883543:
                                                    default:
                                                        var7 ^= 59939345;
                                                        break;
                                                    case 368815195:
                                                        var7 += 1721738973;
                                                        var7 ^= -1455914728;
                                                        var7 ^= 895036688;
                                                        break;
                                                    case 626292683:
                                                        var7 ^= -317781588;
                                                }
                                            } else {
                                                var7 <<= 1;
                                                var7 ^= -2128729776;
                                            }

                                            return 0;
                                        }
                                        var7 = switch (var7) {
                                            default -> var7 ^ 760609446;
                                            case 549497256 -> var7 ^ -728245758;
                                            case 1961733295 -> {
                                                var7 <<= 30;
                                                var7 -= 962445219;
                                                yield var7 ^ -1269553120;
                                            }
                                        };
                                        long var615 = var8;
                                        long var21 = var615 + 1L;
                                        var21 = var615 * var21;
                                        long var616 = var21 & 1L;
                                        long var775;
                                        var614 = (var775 = var616 - 0L) == 0L ? 0 : (var775 < 0L ? -1 : 1);
                                        if (var614 != 0) {
                                            break label642;
                                        }

                                        var614 = var18 + var586;
                                        int var638 = this.ER;
                                        var614 %= var638;
                                        var638 = var9 + 1;
                                        var638 = var9 * var638;
                                        int var660 = var9 + 2;
                                        var638 *= var660;
                                        int var661 = var9 + 3;
                                        var638 *= var661;
                                        var638 &= 7;
                                        if (var638 != 0) {
                                            switch (var7) {
                                                case -452598330:
                                                    var7 ^= 1209574491;
                                                    break label679;
                                                case -428208568:
                                                default:
                                                    var7 ^= -1102009752;
                                                    break label679;
                                                case 855009405:
                                                    var7 &= 1922576775;
                                                    var7 ^= -1336572195;
                                                    break label679;
                                            }
                                        }

                                        var7 &= 2062615971;
                                        var7 <<= 18;
                                        var7 &= -455843870;
                                        var7 ^= -1107192788;
                                        var638 = var8 + 1;
                                        var638 = var8 * var638;
                                        var638 &= 1;
                                        if (var638 != 0) {
                                            break label642;
                                        }

                                        double[] var647 = this.V;
                                        double var648 = var647[var614];
                                        double var776;
                                        int var22 = (var776 = var648 - 0.0) == 0.0 ? 0 : (var776 < 0.0 ? -1 : 1);
                                        double var670;
                                        int var675;
                                        if (var22 <= 0) {
                                            var7 = switch (var7) {
                                                case -1438823797 -> var7 ^ -1913580987;
                                                case -1098542036 -> {
                                                    var7 -= -1571495712;
                                                    var7 >>= 16;
                                                    var7 |= -1349716105;
                                                    var7 |= -1532380694;
                                                    yield var7 ^ -458026745;
                                                }
                                                default -> var7 ^ 942234969;
                                            };
                                            var22 = var8 + 1;
                                            var22 = var8 * var22;
                                            int var23 = var8 + 2;
                                            var22 *= var23;
                                            var23 = var8 + 3;
                                            var22 *= var23;
                                            var22 &= 7;
                                            if (var22 != 0) {
                                                break label642;
                                            }

                                            var670 = var560;
                                            long var24 = var9;
                                            long var26 = var24 + 1L;
                                            var26 = var24 * var26;
                                            long var672 = var26 & 1L;
                                            long var777;
                                            var675 = (var777 = var672 - 0L) == 0L ? 0 : (var777 < 0L ? -1 : 1);
                                            if (var675 != 0) {
                                                switch (var7) {
                                                    case 220392035:
                                                    default:
                                                        var7 ^= 692162328;
                                                        break label679;
                                                    case 1260318456:
                                                        var7 &= 2119715829;
                                                        var7 ^= -924980184;
                                                        break label679;
                                                    case 1379214826:
                                                        var7 ^= -807541100;
                                                        break label679;
                                                }
                                            }

                                            var7 &= -1328776428;
                                            var7 -= 933779438;
                                            var7 ^= 1848447562;
                                            Integer var674 = var8;
                                            if (var674 == null) {
                                                break label642;
                                            }

                                            var675 = var583;
                                            var7 |= -1568745245;
                                            var7 &= 956013465;
                                            var7 >>= 18;
                                            var7 ^= -712548663;
                                        } else {
                                            var7 ^= 2055464752;
                                            var7 ^= 1526471873;
                                            var7 ^= -216117751;
                                            long var25 = var8;
                                            long var27 = var25 + 1L;
                                            var27 = var25 * var27;
                                            var25 = var27 & 1L;
                                            long var778;
                                            int var677 = (var778 = var25 - 0L) == 0L ? 0 : (var778 < 0L ? -1 : 1);
                                            if (var677 != 0) {
                                                break label642;
                                            }

                                            double var680;
                                            if (var586 > 0) {
                                                var7 ^= 1621585000;
                                                var7 >>>= 23;
                                                var7 ^= 1354413278;
                                                double[] var678 = this.V;
                                                long var694 = var9;
                                                long var28 = var694 + 1L;
                                                var28 = var694 * var28;
                                                long var30 = var694 + 2L;
                                                var28 *= var30;
                                                var694 += 3L;
                                                var28 *= var694;
                                                var694 = var28 & 7L;
                                                long var779;
                                                int var697 = (var779 = var694 - 0L) == 0L ? 0 : (var779 < 0L ? -1 : 1);
                                                if (var697 != 0) {
                                                    var7 ^= 662249931;
                                                    var7 -= 445522585;
                                                    var7 ^= -537865042;
                                                    break label679;
                                                }
                                                var7 = switch (var7) {
                                                    case 1106104160 -> var7 ^ 181462036;
                                                    case 1354413252 -> {
                                                        var7 *= 1881875627;
                                                        yield var7 ^ 1719537565;
                                                    }
                                                    default -> var7 ^ 542561873;
                                                };
                                                var694 = var8;
                                                var28 = var694 + 1L;
                                                var28 = var694 * var28;
                                                var694 = var28 & 1L;
                                                long var780;
                                                int var700 = (var780 = var694 - 0L) == 0L ? 0 : (var780 < 0L ? -1 : 1);
                                                if (var700 != 0) {
                                                    break label642;
                                                }

                                                int var701 = var18 + var586;
                                                var701--;
                                                int var708 = this.ER;
                                                int var703 = var701 % var708;
                                                double var679 = var678[var703];
                                                var680 = var679;
                                                var7 += 1546525755;
                                                var7 -= -1181419377;
                                                var7 *= 539287583;
                                                var7 |= -1931366386;
                                                var7 ^= -1196962205;
                                            } else {
                                                var7 |= 711298775;
                                                var7 *= 282404153;
                                                var7 >>>= 19;
                                                var7 >>>= 6;
                                                var7 ^= -1630817694;
                                                int var709 = var8 + 1;
                                                int var710 = var8 * var709;
                                                int var737 = var8 + 2;
                                                int var711 = var710 * var737;
                                                var737 = var8 + 3;
                                                int var712 = var711 * var737;
                                                int var713 = var712 & 7;
                                                if (var713 != 0) {
                                                    break label642;
                                                }

                                                double var714 = var648 - var494;
                                                long var29 = var9;
                                                long var31 = var29 + 1L;
                                                var31 = var29 * var31;
                                                var29 = var31 & 1L;
                                                long var781;
                                                int var742 = (var781 = var29 - 0L) == 0L ? 0 : (var781 < 0L ? -1 : 1);
                                                if (var742 != 0) {
                                                    var7 *= -1024022483;
                                                    var7 ^= -1915256197;
                                                    break label679;
                                                }
                                                var7 = switch (var7) {
                                                    case -1630817777 -> {
                                                        var7 |= -583798975;
                                                        yield var7 ^ -2017566751;
                                                    }
                                                    case 1608417084 -> var7 ^ 1927997744;
                                                    default -> var7 ^ 987062520;
                                                };
                                                var680 = var714;
                                                switch (var7) {
                                                    case -325254:
                                                    default:
                                                        var7 ^= -380024514;
                                                        break;
                                                    case 1480958126:
                                                        var7 *= -2098541457;
                                                        var7 ^= -2012142690;
                                                        break;
                                                    case 1932980373:
                                                        var7 ^= -125279383;
                                                }
                                            }

                                            var27 = var8;
                                            long var743 = var27 + 1L;
                                            var743 = var27 * var743;
                                            var27 = var743 & 1L;
                                            long var782;
                                            int var717 = (var782 = var27 - 0L) == 0L ? 0 : (var782 < 0L ? -1 : 1);
                                            if (var717 != 0) {
                                                break label642;
                                            }

                                            Integer var718 = var9;
                                            if (var718 == null) {
                                                var7 <<= 29;
                                                var7 &= 73318444;
                                                var7 -= -1305656021;
                                                var7 ^= 1536718190;
                                                var7 ^= -1802540701;
                                                break label679;
                                            }

                                            var7 *= -1633082271;
                                            var7 ^= -2102967308;
                                            double var783;
                                            int var719 = (var783 = var680 - var648) == 0.0 ? 0 : (var783 < 0.0 ? -1 : 1);
                                            double var726;
                                            if (var719 >= 0) {
                                                var7 ^= 975613173;
                                                var7 += -626735184;
                                                var7 += -479929913;
                                                var7 ^= -891467646;
                                                int var720 = var8 + 1;
                                                int var721 = var8 * var720;
                                                int var739 = var8 + 2;
                                                int var722 = var721 * var739;
                                                var739 = var8 + 3;
                                                int var723 = var722 * var739;
                                                int var724 = var723 & 7;
                                                if (var724 != 0) {
                                                    break label642;
                                                }

                                                double var725 = var648 - var494;
                                                var743 = var9;
                                                long var755 = var743 + 1L;
                                                var755 = var743 * var755;
                                                var743 = var755 & 1L;
                                                long var784;
                                                int var747 = (var784 = var743 - 0L) == 0L ? 0 : (var784 < 0L ? -1 : 1);
                                                if (var747 != 0) {
                                                    switch (var7) {
                                                        case -316080282:
                                                            var7 &= 1466345929;
                                                            var7 *= 1110487693;
                                                            var7 ^= 1770615710;
                                                            var7 ^= -270045946;
                                                            break label679;
                                                        case 1641877867:
                                                        default:
                                                            var7 ^= -420068037;
                                                            break label679;
                                                        case 2061952876:
                                                            var7 ^= -286486564;
                                                            break label679;
                                                    }
                                                }
                                                var7 = switch (var7) {
                                                    case -316080282 -> {
                                                        var7 &= 970614116;
                                                        var7 |= -1429904108;
                                                        yield var7 ^ -1191916513;
                                                    }
                                                    case 1353950182 -> var7 ^ -1478323320;
                                                    default -> var7 ^ -398855413;
                                                };
                                                Integer var748 = var8;
                                                if (var748 == null) {
                                                    break label642;
                                                }

                                                var726 = var725;
                                                var7 |= -2015420914;
                                                var7 ^= -391449269;
                                            } else {
                                                var7 *= -1033518959;
                                                var7 >>= 18;
                                                var7 ^= -772799065;
                                                var7 ^= 173300392;
                                                var743 = var8;
                                                long var757 = var743 + 1L;
                                                var757 = var743 * var757;
                                                long var33 = var743 + 2L;
                                                var757 *= var33;
                                                var743 += 3L;
                                                var757 *= var743;
                                                var743 = var757 & 7L;
                                                long var785;
                                                int var752 = (var785 = var743 - 0L) == 0L ? 0 : (var785 < 0L ? -1 : 1);
                                                if (var752 != 0) {
                                                    break label642;
                                                }

                                                var726 = var680;
                                                var7 &= 2041491323;
                                                var7 ^= 653346372;
                                            }

                                            double var649 = Math.min(var648, var1);
                                            double var681 = Math.max(var726, var432);
                                            double var650 = var649 - var681;
                                            double var786;
                                            int var682 = (var786 = var650 - 1.0E-7) == 0.0 ? 0 : (var786 < 0.0 ? -1 : 1);
                                            int var704 = var9 + 1;
                                            var704 = var9 * var704;
                                            var704 &= 1;
                                            if (var704 != 0) {
                                                switch (var7) {
                                                    case -1200481168:
                                                        var7 ^= 1522828964;
                                                        break label679;
                                                    case 903087330:
                                                    default:
                                                        var7 ^= 174138411;
                                                        break label679;
                                                    case 2136295972:
                                                        var7 >>= 20;
                                                        var7 ^= -2100977363;
                                                        break label679;
                                                }
                                            }

                                            var7 &= -1022232646;
                                            var7 ^= 7237998;
                                            var7 -= 2098614946;
                                            var7 ^= -1437368014;
                                            if (var682 > 0) {
                                                var7 *= -293860235;
                                                var7 >>= 5;
                                                var7 ^= 855798345;
                                                var25 = var8;
                                                var27 = var25 + 1L;
                                                var27 = var25 * var27;
                                                var743 = var25 + 2L;
                                                var27 *= var743;
                                                var25 += 3L;
                                                var27 *= var25;
                                                var25 = var27 & 7L;
                                                long var787;
                                                int var686 = (var787 = var25 - 0L) == 0L ? 0 : (var787 < 0L ? -1 : 1);
                                                if (var686 != 0) {
                                                    break label642;
                                                }

                                                int[] var687 = this.qj;
                                                var687[var583] = var614;
                                                float[] var620 = this.US;
                                                float var688 = (float)var650;
                                                var620[var583] = var688;
                                                double var621 = var560 + var650;
                                                int var662 = var583 + 1;
                                                var670 = var621;
                                                var614 = var9 + 1;
                                                var614 = var9 * var614;
                                                var638 = var9 + 2;
                                                var614 *= var638;
                                                var638 = var9 + 3;
                                                var614 *= var638;
                                                var614 &= 7;
                                                if (var614 != 0) {
                                                    var7 += -1666089711;
                                                    var7 *= -164841225;
                                                    var7 <<= 17;
                                                    var7 ^= 1321969368;
                                                    break label679;
                                                }

                                                var7 -= -1910852501;
                                                var7 >>>= 8;
                                                var7 ^= 142963054;
                                                var675 = var662;
                                                var7 >>= 9;
                                                var7 -= -436149873;
                                                var7 += 324102677;
                                                var7 &= 1101374470;
                                                var7 ^= -729558315;
                                            } else {
                                                var7 &= -1627724609;
                                                var7 |= -2077533494;
                                                var7 &= 1841952723;
                                                var7 += 2111314297;
                                                var7 ^= 552594288;
                                                var670 = var560;
                                                long var627 = var9;
                                                var25 = var627 + 1L;
                                                var25 = var627 * var25;
                                                var27 = var627 + 2L;
                                                var25 *= var27;
                                                long var628 = var627 + 3L;
                                                var25 *= var628;
                                                long var629 = var25 & 7L;
                                                long var788;
                                                var614 = (var788 = var629 - 0L) == 0L ? 0 : (var788 < 0L ? -1 : 1);
                                                if (var614 != 0) {
                                                    var7 -= -1134743248;
                                                    var7 += -31986886;
                                                    var7 &= 1529483437;
                                                    var7 ^= -926046499;
                                                    break label679;
                                                }

                                                var7 &= 588463808;
                                                var7 *= -1520652431;
                                                var7 >>= 29;
                                                var7 ^= -224084160;
                                                Integer var631 = var8;
                                                if (var631 == null) {
                                                    break label642;
                                                }

                                                var675 = var583;
                                                var7 += -1730937067;
                                                var7 *= -424763089;
                                                var7 ^= -1827889319;
                                            }
                                        }

                                        var614 = var8 + 1;
                                        var614 = var8 * var614;
                                        var614 &= 1;
                                        if (var614 != 0) {
                                            break label642;
                                        }

                                        var614 = var586 + 1;
                                        var638 = var9 + 1;
                                        var638 = var9 * var638;
                                        int var663 = var9 + 2;
                                        var638 *= var663;
                                        int var664 = var9 + 3;
                                        var638 *= var664;
                                        var638 &= 7;
                                        if (var638 != 0) {
                                            var7 *= -1654272267;
                                            var7 += -1138373053;
                                            var7 *= -508596813;
                                            var7 ^= -831573782;
                                            break label679;
                                        }
                                        var7 = switch (var7) {
                                            default -> var7 ^ -1250590409;
                                            case -712550697 -> {
                                                var7 += -1081600035;
                                                yield var7 ^ -2095196584;
                                            }
                                            case 1602292236 -> var7 ^ -2133341220;
                                        };
                                        Integer var658 = var8;
                                        if (var658 == null) {
                                            break label642;
                                        }

                                        var560 = var670;
                                        var583 = var675;
                                        var586 = var614;
                                        var7 *= 1603476711;
                                        var7 *= 581357985;
                                        var7 -= -416240731;
                                        var7 *= -1104945789;
                                        var7 ^= 1009655228;
                                    }
                                }

                                switch (var7) {
                                    case -1715530126:
                                        var7 ^= -253392061;
                                        break label679;
                                    case 522028066:
                                    default:
                                        var7 ^= 1351520176;
                                        break label679;
                                    case 944867270:
                                        var7 += 581000953;
                                        var7 *= 216291791;
                                        var7 &= 568566410;
                                        var7 ^= -1570437928;
                                        break label679;
                                }
                            }

                            var7 -= 1021328902;
                            var7 ^= 1667221290;
                            break label679;
                        }

                        var7 &= -2036870649;
                        var7 ^= 621736879;
                    } else {
                        switch (var7) {
                            case -1192093630:
                            default:
                                var7 ^= -1568689376;
                                break;
                            case 344359285:
                                var7 ^= -1854574274;
                                var7 ^= 645829602;
                                break;
                            case 853380586:
                                var7 ^= -1488713259;
                        }
                    }

                    long var404 = var3;
                    long var416 = var404 + 1L;
                    long var417 = var404 * var416;
                    long var470 = var404 + 2L;
                    long var418 = var417 * var470;
                    long var405 = var404 + 3L;
                    long var419 = var418 * var405;
                    long var406 = var419 & 7L;
                    long var789;
                    var7 = (var789 = var406 - 0L) == 0L ? 0 : (var789 < 0L ? -1 : 1);
                    if (var7 == 0) {
                        return 0;
                    }
                    break label642;
                }
            }

            RuntimeException var420 = new RuntimeException();
            throw var420;
        }

        IllegalStateException var408 = new IllegalStateException();
        throw var408;
    }

    private int oK(int var1, int var2, int var3) {
        label250: {
            int var5 = var1;
            int var6 = System.identityHashCode(this);
            long var7 = var6;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var314;
            int var156 = (var314 = var7 - 0L) == 0L ? 0 : (var314 < 0L ? -1 : 1);
            if (var156 != 0) {
                int var140 = var3 | 1509874466;
                var140 ^= 174951355;
                var140 *= 1471919323;
                var140 ^= -1937042194;
            } else {
                label249: {
                    int var4 = var3 * -716404895;
                    var4 ^= 1504132109;
                    var7 = var1;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var315;
                    int var159 = (var315 = var7 - 0L) == 0L ? 0 : (var315 < 0L ? -1 : 1);
                    if (var159 != 0) {
                        break label250;
                    }

                    if (var1 > var2) {
                        var4 -= 387935810;
                        var4 += 1125963947;
                        var4 *= 236275053;
                        var4 ^= 615538647;
                        var7 = var1;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var316;
                        int var163 = (var316 = var7 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                        if (var163 != 0) {
                            break label250;
                        }

                        if (var2 > 0) {
                            var4 += 1688731411;
                            var4 += -1801913094;
                            var4 += 641923295;
                            var4 -= -1048374273;
                            var4 ^= -1617191414;
                            if (var2 == 1) {
                                var4 = switch (var4) {
                                    case -2019984915 -> {
                                        var4 ^= 1547317509;
                                        var4 &= -1561537926;
                                        yield var4 ^ 55214892;
                                    }
                                    case -1979046478 -> var4 ^ -2061867292;
                                    default -> var4 ^ -189153359;
                                };
                                float var164 = 0.0F;
                                int var8 = 0;
                                int var229 = var6 + 1;
                                int var230 = var6 * var229;
                                int var10 = var6 + 2;
                                int var231 = var230 * var10;
                                var10 = var6 + 3;
                                int var232 = var231 * var10;
                                int var233 = var232 & 7;
                                if (var233 != 0) {
                                    var4 &= -9178400;
                                    var4 ^= 725101610;
                                } else {
                                    var4 |= -1604454745;
                                    var4 *= 673432837;
                                    var4 >>= 16;
                                    var4 += 1521041176;
                                    var4 ^= -643856428;
                                    Integer var234 = var1;
                                    if (var234 == null) {
                                        break label250;
                                    }

                                    float var165 = var164;
                                    var8 = var8;

                                    var4 = switch (var4) {
                                        case -2093557595 -> {
                                            var4 >>= 25;
                                            var4 >>= 10;
                                            var4 -= -1860860400;
                                            yield var4 ^ 241547460;
                                        }
                                        case -443393334 -> var4 ^ -442660850;
                                        default -> var4 ^ -15208433;
                                    };

                                    while (true) {
                                        var9 = var5;
                                        var11 = var9 + 1L;
                                        var11 = var9 * var11;
                                        var9 = var11 & 1L;
                                        long var317;
                                        int var237 = (var317 = var9 - 0L) == 0L ? 0 : (var317 < 0L ? -1 : 1);
                                        if (var237 != 0) {
                                            break label250;
                                        }

                                        if (var8 >= var1) {
                                            var4 ^= 500620931;
                                            var4 ^= -1556810736;
                                            Integer var183 = var5;
                                            if (var183 == null) {
                                                break label250;
                                            }

                                            int[] var184 = this.qj;
                                            int[] var241 = this.qj;
                                            var10 = var1 - 1;
                                            int var242 = var241[var10];
                                            var184[0] = var242;
                                            float[] var185 = this.US;
                                            var185[0] = var165;
                                            float[] var166 = this.US;
                                            int var186 = var6 + 1;
                                            var186 = var6 * var186;
                                            int var243 = var6 + 2;
                                            var186 *= var243;
                                            int var244 = var6 + 3;
                                            var186 *= var244;
                                            var186 &= 7;
                                            if (var186 == 0) {
                                                var4 ^= -2119465708;
                                                var4 |= -1634342381;
                                                var4 &= -1763081105;
                                                var4 ^= -1813319841;
                                                Integer var191 = var5;
                                                if (var191 != null) {
                                                    Arrays.fill(var166, 1, var1, 0.0F);
                                                    return 1;
                                                }
                                                break label250;
                                            }

                                            var4 ^= -1977860141;
                                            var4 *= 1060663753;
                                            var4 >>>= 3;
                                            var4 ^= 1577481925;
                                            var4 ^= -11667249;
                                            break label249;
                                        }

                                        var4 ^= 1171478095;
                                        var4 += -699024335;
                                        var4 &= 138963265;
                                        var4 >>>= 10;
                                        var4 ^= 1155190150;
                                        float[] var238 = this.US;
                                        float var239 = var238[var8];
                                        float var240 = var165 + var239;
                                        var10 = var8 + 1;
                                        var11 = var6;
                                        long var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        long var15 = var11 + 2L;
                                        var13 *= var15;
                                        var11 += 3L;
                                        var13 *= var11;
                                        var11 = var13 & 7L;
                                        long var318;
                                        int var290 = (var318 = var11 - 0L) == 0L ? 0 : (var318 < 0L ? -1 : 1);
                                        if (var290 != 0) {
                                            var4 |= 643718979;
                                            var4 += 1128073619;
                                            var4 ^= 1571235456;
                                            var4 *= -217650573;
                                            var4 ^= 1996727412;
                                            break label249;
                                        }

                                        var4 ^= 812126793;
                                        var4 -= 1951956357;
                                        var4 ^= -789187320;
                                        int var291 = var5 + 1;
                                        int var292 = var5 * var291;
                                        int var293 = var292 & 1;
                                        if (var293 != 0) {
                                            break label250;
                                        }

                                        var165 = var240;
                                        var8 = var10;
                                        var4 -= 93499012;
                                        var4 ^= -1434946208;
                                        var4 ^= 32332933;
                                    }
                                }
                            } else {
                                var4 ^= 947930235;
                                var4 >>= 13;
                                var4 ^= -306606673;
                                Integer var167 = var1;
                                if (var167 == null) {
                                    break label250;
                                }

                                float[] var168 = this.cG;
                                Arrays.fill(var168, 0.0F);
                                byte var169 = 0;
                                long var192 = var6;
                                long var259 = var192 + 1L;
                                var259 = var192 * var259;
                                long var12 = var192 + 2L;
                                var259 *= var12;
                                var192 += 3L;
                                var259 *= var192;
                                var192 = var259 & 7L;
                                long var319;
                                int var195 = (var319 = var192 - 0L) == 0L ? 0 : (var319 < 0L ? -1 : 1);
                                if (var195 == 0) {
                                    var4 += 1080979220;
                                    var4 ^= -538768217;
                                    var192 = var1;
                                    var259 = var192 + 1L;
                                    var259 = var192 * var259;
                                    var192 = var259 & 1L;
                                    long var320;
                                    int var198 = (var320 = var192 - 0L) == 0L ? 0 : (var320 < 0L ? -1 : 1);
                                    if (var198 != 0) {
                                        break label250;
                                    }

                                    int var170 = var169;

                                    var4 = switch (var4) {
                                        case -1924011811 -> {
                                            var4 *= -506863177;
                                            var4 *= 392127291;
                                            yield var4 ^ -1589177638;
                                        }
                                        default -> var4 ^ 990786766;
                                        case 1886873064 -> var4 ^ -1588152251;
                                    };

                                    while (true) {
                                        Integer var199 = var5;
                                        if (var199 == null) {
                                            break label250;
                                        }

                                        if (var170 >= var2) {
                                            var4 = switch (var4) {
                                                default -> var4 ^ 590118842;
                                                case 1386103299 -> {
                                                    var4 -= -1331230282;
                                                    var4 ^= 704980499;
                                                    var4 >>= 27;
                                                    yield var4 ^ 182337139;
                                                }
                                                case 2075930315 -> var4 ^ -813130574;
                                            };
                                            int var171 = var5 + 1;
                                            int var172 = var5 * var171;
                                            int var173 = var172 & 1;
                                            if (var173 != 0) {
                                                break label250;
                                            }

                                            byte var174 = 0;
                                            int var202 = var6 + 1;
                                            int var203 = var6 * var202;
                                            int var204 = var203 & 1;
                                            if (var204 != 0) {
                                                var4 &= -663446855;
                                                var4 ^= 2054844138;
                                                break label249;
                                            } else {
                                                var4 |= 1820256275;
                                                var4 ^= 865981854;
                                                int var205 = var5 + 1;
                                                int var206 = var5 * var205;
                                                int var207 = var206 & 1;
                                                if (var207 != 0) {
                                                    break label250;
                                                }

                                                int var175 = var174;

                                                var4 = switch (var4) {
                                                    case -824034291 -> {
                                                        var4 &= 1706466192;
                                                        var4 |= -1932446015;
                                                        var4 -= -209038814;
                                                        yield var4 ^ -1844968825;
                                                    }
                                                    case -474037710 -> var4 ^ -1946651871;
                                                    default -> var4 ^ 1931837645;
                                                };

                                                while (true) {
                                                    var192 = var5;
                                                    var259 = var192 + 1L;
                                                    var259 = var192 * var259;
                                                    var192 = var259 & 1L;
                                                    long var321;
                                                    int var210 = (var321 = var192 - 0L) == 0L ? 0 : (var321 < 0L ? -1 : 1);
                                                    if (var210 != 0) {
                                                        break label250;
                                                    }

                                                    if (var175 >= var1) {
                                                        var4 -= -596836170;
                                                        var4 |= -837587709;
                                                        var4 ^= -967787540;
                                                        var7 = var5;
                                                        var9 = var7 + 1L;
                                                        var9 = var7 * var9;
                                                        var11 = var7 + 2L;
                                                        var9 *= var11;
                                                        var7 += 3L;
                                                        var9 *= var7;
                                                        var7 = var9 & 7L;
                                                        long var322;
                                                        int var179 = (var322 = var7 - 0L) == 0L ? 0 : (var322 < 0L ? -1 : 1);
                                                        if (var179 != 0) {
                                                            break label250;
                                                        }

                                                        int[] var180 = this.Z;
                                                        int var218 = var6 + 1;
                                                        int var219 = var6 * var218;
                                                        var6 = var219 & 1;
                                                        if (var6 == 0) {
                                                            var4 &= 1822879066;
                                                            var4 >>= 3;
                                                            var4 ^= 287893501;
                                                            Integer var147 = var5;
                                                            if (var147 != null) {
                                                                int[] var148 = this.qj;
                                                                System.arraycopy(var180, 0, var148, 0, var2);
                                                                float[] var149 = this.cG;
                                                                float[] var181 = this.US;
                                                                System.arraycopy(var149, 0, var181, 0, var2);
                                                                float[] var150 = this.US;
                                                                Arrays.fill(var150, var2, var1, 0.0F);
                                                                return var2;
                                                            }
                                                            break label250;
                                                        }

                                                        switch (var4) {
                                                            case 681793167:
                                                                var4 |= -1709438457;
                                                                var4 ^= 283488485;
                                                                break label249;
                                                            case 1500385066:
                                                                var4 ^= -1068776651;
                                                                break label249;
                                                            case 1869002849:
                                                            default:
                                                                var4 ^= -923580491;
                                                                break label249;
                                                        }
                                                    }
                                                    var4 = switch (var4) {
                                                        default -> var4 ^ 485286273;
                                                        case -932453596 -> var4 ^ 2034756775;
                                                        case 1264643608 -> {
                                                            var4 ^= 585226413;
                                                            yield var4 ^ -1730170948;
                                                        }
                                                    };
                                                    float var211 = var175;
                                                    int var247 = var2 - 1;
                                                    float var248 = var247;
                                                    float var212 = var211 * var248;
                                                    int var249 = var1 - 1;
                                                    float var250 = var249;
                                                    float var213 = var212 / var250;
                                                    int var214 = Math.round(var213);
                                                    float[] var251 = this.cG;
                                                    int var281 = var2 - 1;
                                                    int var215 = Math.min(var281, var214);
                                                    int var216 = Math.max(0, var215);
                                                    float var282 = var251[var216];
                                                    float[] var302 = this.US;
                                                    int var305 = var6 + 1;
                                                    int var306 = var6 * var305;
                                                    int var307 = var306 & 1;
                                                    if (var307 != 0) {
                                                        var4 ^= 280909307;
                                                        var4 ^= 1270489752;
                                                        break label249;
                                                    }
                                                    var4 = switch (var4) {
                                                        case -245458679 -> {
                                                            var4 &= -1277297477;
                                                            yield var4 ^ 2004090877;
                                                        }
                                                        case 376576470 -> var4 ^ -1761840109;
                                                        default -> var4 ^ -1065475928;
                                                    };
                                                    int var308 = var5 + 1;
                                                    int var309 = var5 * var308;
                                                    int var310 = var309 & 1;
                                                    if (var310 != 0) {
                                                        break label250;
                                                    }

                                                    float var303 = var302[var175];
                                                    float var283 = var282 + var303;
                                                    var251[var216] = var283;
                                                    int var217 = var175 + 1;
                                                    var175 = var217;
                                                    switch (var4) {
                                                        case -1687367838:
                                                            var4 ^= 1953987108;
                                                            break;
                                                        case -1476700647:
                                                        default:
                                                            var4 ^= -1168296264;
                                                            break;
                                                        case -969971724:
                                                            var4 &= 1692771898;
                                                            var4 *= 1628068561;
                                                            var4 >>= 9;
                                                            var4 ^= 1263484574;
                                                    }
                                                }
                                            }
                                        }

                                        var4 >>= 10;
                                        var4 ^= 1882322193;
                                        int[] var200 = this.Z;
                                        int[] var245 = this.qj;
                                        float var265 = var170;
                                        int var294 = var1 - 1;
                                        float var295 = var294;
                                        float var266 = var265 * var295;
                                        int var296 = var2 - 1;
                                        float var297 = var296;
                                        float var267 = var266 / var297;
                                        int var268 = Math.round(var267);
                                        int var246 = var245[var268];
                                        int var269 = var6 + 1;
                                        int var270 = var6 * var269;
                                        int var298 = var6 + 2;
                                        int var271 = var270 * var298;
                                        int var299 = var6 + 3;
                                        int var272 = var271 * var299;
                                        int var273 = var272 & 7;
                                        if (var273 != 0) {
                                            var4 += -456524215;
                                            var4 ^= -1757309631;
                                            var4 ^= 1156916344;
                                            var4 += 2079545565;
                                            var4 ^= -1458187078;
                                            break label249;
                                        }

                                        var4 &= 476360223;
                                        var4 ^= -2002010567;
                                        var4 ^= 1369330647;
                                        var4 ^= 12183091;
                                        int var274 = var5 + 1;
                                        int var275 = var5 * var274;
                                        int var300 = var5 + 2;
                                        int var276 = var275 * var300;
                                        int var301 = var5 + 3;
                                        int var277 = var276 * var301;
                                        int var278 = var277 & 7;
                                        if (var278 != 0) {
                                            break label250;
                                        }

                                        var200[var170] = var246;
                                        int var201 = var170 + 1;
                                        var170 = var201;
                                        var4 -= 587332274;
                                        var4 ^= -197636823;
                                    }
                                } else {
                                    var4 |= 1687751472;
                                    var4 >>= 30;
                                    var4 ^= -1436881301;
                                }
                            }
                            break label249;
                        }

                        switch (var4) {
                            case -1545769522:
                            default:
                                var4 ^= -878242779;
                                break;
                            case -1174272262:
                                var4 += -756131427;
                                var4 >>= 2;
                                var4 -= 847499152;
                                var4 <<= 22;
                                var4 ^= -2112295786;
                                break;
                            case -43446809:
                                var4 ^= 1417151278;
                        }
                    } else {
                        switch (var4) {
                            case -1741201219:
                                var4 ^= -1212100644;
                                break;
                            case -744927564:
                            default:
                                var4 ^= 787039063;
                                break;
                            case -339189672:
                                var4 |= 1934684206;
                                var4 |= -1003600261;
                                var4 -= 434756114;
                                var4 ^= 1388581961;
                                var4 ^= 327804082;
                        }
                    }

                    var4 = var1 + 1;
                    var4 = var1 * var4;
                    var6 = var1 + 2;
                    var4 *= var6;
                    var5 = var1 + 3;
                    var4 *= var5;
                    var4 &= 7;
                    if (var4 == 0) {
                        return var1;
                    }
                    break label250;
                }
            }

            Integer var152 = var5;
            if (var152 != null) {
                AssertionError var153 = new AssertionError();
                throw var153;
            }
        }

        IllegalArgumentException var144 = new IllegalArgumentException();
        throw var144;
    }

    public int Rc(int var1) {
        int var2 = IG;
        var2 ^= 877436954;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var4 = var5 & 1;
        if (var4 != 0) {
            var2 -= 699768541;
            var2 |= -113060964;
            var2 ^= 1203531696;
            var4 = var1 + 1;
            var4 = var1 * var4;
            int var3 = var4 & 1;
            if (var3 == 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            } else {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            }
        } else {
            var2 -= 867870801;
            var2 += 1882023306;
            var2 |= 2027370931;
            var2 <<= 19;
            var2 ^= -1686974468;
            int[] var12 = this.qj;
            return var12[var1];
        }
    }

    public float Q(int var1) {
        int var2 = IG;
        var2 ^= -1718045606;
        int var4 = System.identityHashCode(this);
        float[] var5 = this.US;
        int var6 = var4 + 1;
        var6 = var4 * var6;
        var4 = var6 & 1;
        if (var4 == 0) {
            var2 &= -1889877376;
            var2 += -1144621214;
            var2 ^= 252356479;
            return var5[var1];
        } else {
            var2 -= -122960938;
            var2 |= -554201762;
            var2 |= 1414909516;
            var2 *= 1944671573;
            var2 ^= -497278162;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            } else {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }
    }

    public int k() {
        int var1 = IG;
        var1 ^= 1322043474;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ 1938292529;
                case 490808970 -> {
                    var1 ^= -143439625;
                    yield var1 ^ -338511422;
                }
                case 1725925680 -> var1 ^ -1577519912;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.L;
            }
        } else {
            var1 <<= 6;
            var1 >>= 6;
            var1 ^= -359694403;
            long var11 = var1;
            long var25 = var11 + 1L;
            long var26 = var11 * var25;
            long var12 = var26 & 1L;
            long var27;
            var1 = (var27 = var12 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }

        RuntimeException var14 = new RuntimeException();
        throw var14;
    }

    public float z() {
        int var1 = IG;
        var1 ^= -920625960;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 += -1472952550;
            var1 |= -1304605381;
            var1 ^= -755973917;
            return this.XC;
        } else {
            switch (var1) {
                case -1699892736:
                    var1 &= 309046952;
                    var1 -= 1355078899;
                    var1 |= -1564368145;
                    var1 ^= -1996791763;
                    break;
                case -746103059:
                    var1 ^= -453529249;
                    break;
                case 1356054206:
                default:
                    var1 ^= -8287002;
            }

            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    public int aZ() {
        int var1 = IG;
        var1 ^= -1753546038;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 ^= -1547568619;
            var1 ^= 1666028145;
            var1 <<= 8;
            var1 ^= -1517829744;
            long var21 = var1;
            long var31 = var21 + 1L;
            long var32 = var21 * var31;
            long var6 = var21 + 2L;
            long var33 = var32 * var6;
            long var22 = var21 + 3L;
            long var34 = var33 * var22;
            long var23 = var34 & 7L;
            long var35;
            var2 = (var35 = var23 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            }
        } else {
            var1 ^= 51581601;
            var1 ^= 1151511079;
            long var15 = var1;
            long var29 = var15 + 1L;
            long var30 = var15 * var29;
            long var16 = var30 & 1L;
            long var36;
            var1 = (var36 = var16 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.fE;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    public int t() {
        int var1 = IG;
        var1 ^= -1264379237;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            switch (var1) {
                case -416353213:
                    var1 += 673836181;
                    var1 >>= 20;
                    var1 |= -1415232651;
                    var1 ^= -308469709;
                    break;
                case 1636606467:
                    var1 ^= -495224377;
                    break;
                case 1769043727:
                default:
                    var1 ^= -459532393;
            }

            IllegalArgumentException var15 = new IllegalArgumentException();
            throw var15;
        } else {
            var1 >>= 26;
            var1 -= 312203888;
            var1 >>>= 28;
            var1 ^= 2641245;
            return this.ER;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -547153306;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        IG = var4;
    }
}
