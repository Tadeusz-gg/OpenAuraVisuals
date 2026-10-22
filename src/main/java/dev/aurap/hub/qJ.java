package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class qJ extends XR {
    private static final float QW = 15.0F;
    private static final float X = 12.0F;
    private final r_2 CF;
    private final XF bZ;
    private final XF[] dL;
    private boolean w;
    public static final int Oa;

    public qJ(r_2 var1) {
        kE_2 var3 = kE_2.uY(0.3F, 0.95F);
        XF var2 = new XF(0.0F, var3);
        this.bZ = var2;
        this.CF = var1;
        Enum[] var7 = var1.M();
        int var8 = var7.length;
        XF[] var9 = new XF[var8];
        this.dL = var9;
        byte var10 = 0;
        int var11 = var10;

        while (true) {
            XF[] var12 = this.dL;
            int var13 = var12.length;
            if (var11 >= var13) {
                return;
            }

            XF[] var14 = this.dL;
            XF var4;
            int var5 = var1.g();
            float var16;
            if (var11 == var5) {
                var16 = 1.0F;
            } else {
                var16 = 0.0F;
            }

            kE_2 var6 = kE_2.SNAPPY;
            var4 = new XF(var16, var6);
            var14[var11] = var4;
            int var15 = var11 + 1;
            var11 = var15;
        }
    }

    @Override
    public xB W() {
        int var1 = Oa;
        var1 ^= -286178631;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 += 404502412;
            var1 ^= -603989818;
            var1 -= -502157383;
            var1 |= -1470683584;
            var1 ^= -945258634;
            UnsupportedOperationException var18 = new UnsupportedOperationException();
            throw var18;
        } else {
            long var8 = switch (var1) {
                default -> var1 ^ -650261262;
                case 720550209 -> {
                    var1 &= 1922741412;
                    yield var1 ^ -867737624;
                }
                case 1405623677 -> var1 ^ 752490863;
            };
            long var20 = var8 + 1L;
            long var21 = var8 * var20;
            long var9 = var21 & 1L;
            long var22;
            var1 = (var22 = var9 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var1 != 0) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                return this.CF;
            }
        }
    }

    @Override
    public float v() {
        int var1 = Oa;
        var1 ^= -1206008314;
        int var2 = System.identityHashCode(this);
        XF var3 = this.bZ;
        float var15 = var3.bs();
        XF[] var4 = this.dL;
        int var17 = var4.length;
        float var18 = var17;
        float var19 = var18 * 12.0F;
        float var20 = var19 + 2.0F;
        float var16 = var15 * var20;
        Integer var13 = var2;
        if (var13 == null) {
            var1 |= 911279121;
            var1 ^= 1706678720;
            AssertionError var14 = new AssertionError();
            throw var14;
        } else {
            var1 ^= -1474511495;
            var1 ^= 161756140;
            var1 ^= -1225349500;
            Integer var9 = var1;
            if (var9 == null) {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            } else {
                return 15.0F + var16;
            }
        }
    }

    @Override
    public void ol(float var1) {
        label117: {
            int var2 = Oa;
            var2 ^= 1843388040;
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            if (var4 == null) {
                var2 += -156823718;
                var2 *= 290651839;
                var2 ^= -1742881733;
                var2 ^= -574447378;
            } else {
                var2 += 198441907;
                var2 *= -1942649709;
                var2 &= -1836421272;
                var2 ^= 990389761;
                var4 = var2;
                if (var4 == null) {
                    break label117;
                }

                XF var93 = this.bZ;
                int var5 = (this.w ? 1 : 0);
                float var99;
                if (var5 != 0) {
                    var2 &= 1772842629;
                    var2 ^= -2057758696;
                    Integer var98 = var2;
                    if (var98 == null) {
                        break label117;
                    }

                    var99 = 1.0F;
                    switch (var2) {
                        case -1403438055:
                            var2 |= 1200029421;
                            var2 -= 543523473;
                            var2 ^= -2020410030;
                            break;
                        case -247586040:
                        default:
                            var2 ^= -266782835;
                            break;
                        case 85277734:
                            var2 ^= -203478258;
                    }
                } else {
                    var2 |= 757548535;
                    var2 -= -710793869;
                    var2 ^= 1860105935;
                    var99 = 0.0F;
                    switch (var2) {
                        case 123450947:
                            var2 >>= 24;
                            var2 -= 2098231113;
                            var2 -= 143617076;
                            var2 += -1075519272;
                            var2 ^= 1923906652;
                            break;
                        case 1363574869:
                        default:
                            var2 ^= 2034118560;
                            break;
                        case 1768904952:
                            var2 ^= 292129733;
                    }
                }

                long var6 = var2;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var140;
                int var119 = (var140 = var6 - 0L) == 0L ? 0 : (var140 < 0L ? -1 : 1);
                if (var119 != 0) {
                    break label117;
                }

                var93.H(var99);
                XF var94 = this.bZ;
                float var95 = var94.N(var1);
                byte var96 = 0;
                Integer var100 = var3;
                if (var100 == null) {
                    var2 *= -1820669181;
                    var2 += 852113416;
                    var2 -= 179872676;
                    var2 -= 597983221;
                    var2 ^= 1745424458;
                } else {
                    var2 >>>= 19;
                    var2 += -1019815346;
                    var2 ^= 1693932227;
                    var100 = var2;
                    if (var100 == null) {
                        break label117;
                    }

                    int var97 = var96;
                    var2 |= -11786789;
                    var2 ^= -1945435168;
                    var2 += -315045382;
                    var2 >>>= 26;
                    var2 ^= 1378471410;

                    while (true) {
                        var5 = var2 + 1;
                        int var103 = var2 * var5;
                        var103 &= 1;
                        if (var103 != 0) {
                            break label117;
                        }

                        XF[] var105 = this.dL;
                        var103 = var105.length;
                        int var120 = var3 + 1;
                        int var121 = var3 * var120;
                        int var7 = var3 + 2;
                        int var122 = var121 * var7;
                        var7 = var3 + 3;
                        int var123 = var122 * var7;
                        int var124 = var123 & 7;
                        if (var124 != 0) {
                            var2 += -1707126294;
                            var2 ^= -347157065;
                            break;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ -1799257588;
                            case 1274125818 -> var2 ^ -1936577177;
                            case 1378471402 -> {
                                var2 <<= 16;
                                var2 += 1360193326;
                                var2 &= 52669251;
                                yield var2 ^ -572912116;
                            }
                        };
                        int var125 = var2 + 1;
                        int var126 = var2 * var125;
                        var7 = var2 + 2;
                        int var127 = var126 * var7;
                        var7 = var2 + 3;
                        int var128 = var127 * var7;
                        int var129 = var128 & 7;
                        if (var129 != 0) {
                            break label117;
                        }

                        if (var97 >= var103) {
                            var2 *= 736104979;
                            var2 |= -438749375;
                            var2 += -1550744158;
                            var2 ^= 976670676;
                            Integer var84 = var2;
                            if (var84 != null) {
                                return;
                            }
                            break label117;
                        }

                        var2 *= -345809409;
                        var2 ^= 2141561900;
                        var2 += -1992469067;
                        var2 >>= 25;
                        var2 ^= 1148644773;
                        Integer var107 = var2;
                        if (var107 == null) {
                            break label117;
                        }

                        XF[] var108 = this.dL;
                        XF var109 = var108[var97];
                        Integer var130 = var3;
                        if (var130 == null) {
                            var2 -= 927143247;
                            var2 += -1191307621;
                            var2 ^= 823416069;
                            var2 ^= -268277348;
                            break;
                        }
                        var2 = switch (var2) {
                            case -1415726950 -> var2 ^ -2143474036;
                            case 1148644782 -> {
                                var2 *= 2124943827;
                                var2 *= 620580993;
                                yield var2 ^ 655271523;
                            }
                            default -> var2 ^ -212626968;
                        };
                        r_2 var131 = this.CF;
                        int var132 = var131.g();
                        float var133;
                        if (var97 == var132) {
                            var2 -= 70551451;
                            var2 += -1285972667;
                            var2 ^= 1219598041;
                            var133 = 1.0F;
                            var2 |= 790112931;
                            var2 += -230713914;
                            var2 *= -535017581;
                            var2 ^= 1564348387;
                        } else {
                            var2 -= -453671515;
                            var2 += 596545864;
                            var2 |= 119880914;
                            var2 ^= -539906733;
                            var133 = 0.0F;
                            var2 ^= -1594044353;
                            var2 += -1256200235;
                            var2 &= 2107758445;
                            var2 *= 1592818111;
                            var2 ^= -131635685;
                        }

                        var109.H(var133);
                        XF[] var110 = this.dL;
                        XF var111 = var110[var97];
                        float var112 = var111.N(var1);
                        int var113 = var97 + 1;
                        Integer var134 = var3;
                        if (var134 == null) {
                            var2 += 1012121859;
                            var2 -= -1584107189;
                            var2 ^= -679747429;
                            break;
                        }

                        var2 ^= -601964948;
                        var2 ^= -964762192;
                        var97 = var113;
                        var2 *= 364406563;
                        var2 &= 1709648581;
                        var2 -= -1576520927;
                        var2 ^= 770834633;
                    }
                }
            }

            long var87 = var2;
            long var114 = var87 + 1L;
            var114 = var87 * var114;
            long var138 = var87 + 2L;
            var114 *= var138;
            long var88 = var87 + 3L;
            var114 *= var88;
            long var89 = var114 & 7L;
            long var141;
            var3 = (var141 = var89 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalStateException var91 = new IllegalStateException();
                throw var91;
            }
        }

        UnsupportedOperationException var86 = new UnsupportedOperationException();
        throw var86;
    }

    @Override
    protected void R(Canvas var1, jX var2, float var3) {
        label177: {
            int var4 = Oa;
            var4 ^= -523369156;
            int var5 = System.identityHashCode(this);
            r_2 var6 = this.CF;
            Integer var7 = var5;
            if (var7 == null) {
                switch (var4) {
                    case -1640205391:
                    default:
                        var4 ^= 1960537964;
                        break;
                    case -785851581:
                        var4 ^= 1160006602;
                        break;
                    case 617479876:
                        var4 >>= 11;
                        var4 <<= 16;
                        var4 ^= -2056869701;
                }
            } else {
                label176: {
                    var4 -= 977307820;
                    var4 *= -995193167;
                    var4 += -983836727;
                    var4 ^= -1052543599;
                    String var119 = var6.Tp();
                    float var144 = this.U;
                    float var8 = this.fb;
                    var8 += 3.5F;
                    TextStyle var9 = lt;
                    TextStyle var10 = lt;
                    int var220 = var10.color();
                    int var221 = DP.nq(var220, var3);
                    var9 = var9.color(var221);
                    float var120 = var1.text(var119, var144, var8, var9);
                    var6 = this.CF;
                    Enum var122 = var6.A();
                    String var123 = r_2.R(var122);
                    float var145 = this.U;
                    var8 = this.pP;
                    float var146 = var145 + var8;
                    float var147 = var146 - 8.0F;
                    var8 = this.fb;
                    var8 += 3.5F;
                    var9 = M;
                    var10 = M;
                    int var223 = var10.color();
                    int var224 = DP.nq(var223, var3);
                    var9 = var9.color(var224);
                    float var124 = var1.textRight(var123, var147, var8, var9);
                    r_2 var148 = this.CF;
                    boolean var149 = var148.m();
                    if (var149) {
                        var4 &= 1532100085;
                        var4 ^= -114643830;
                        r_2 var150 = this.CF;
                        int var151 = var150.g();
                        var8 = this.U;
                        float var199 = this.pP;
                        var8 += var199;
                        var8 -= 8.0F;
                        float var125 = var8 - var124;
                        float var126 = var125 - 5.5F;
                        int var175 = var5 + 1;
                        int var176 = var5 * var175;
                        int var200 = var5 + 2;
                        int var177 = var176 * var200;
                        int var201 = var5 + 3;
                        int var178 = var177 * var201;
                        int var179 = var178 & 7;
                        if (var179 != 0) {
                            var4 += -1776311777;
                            var4 |= 1401595710;
                            var4 += -350863946;
                            var4 ^= 1579703758;
                            break label176;
                        }
                        var4 = switch (var4) {
                            case -1338370694 -> {
                                var4 += -2120108977;
                                yield var4 ^ -307303509;
                            }
                            default -> var4 ^ 1097337916;
                            case 1399163390 -> var4 ^ 876006850;
                        };
                        long var180 = var4;
                        long var225 = var180 + 1L;
                        long var226 = var180 * var225;
                        long var12 = var180 + 2L;
                        long var227 = var226 * var12;
                        long var181 = var180 + 3L;
                        long var228 = var227 * var181;
                        long var182 = var228 & 7L;
                        long var313;
                        int var183 = (var313 = var182 - 0L) == 0L ? 0 : (var313 < 0L ? -1 : 1);
                        if (var183 != 0) {
                            break label177;
                        }

                        var8 = this.fb;
                        var8 += 7.5F;
                        int var202 = var4 * 170063459;
                        int var203 = var202 ^ 739090139;
                        this.C(var1, var151, var126, var8, var3, var203);
                        var4 ^= -464345067;
                        var4 >>= 11;
                        var4 += 1307015600;
                        var4 ^= 131320235;
                    } else {
                        var4 -= -1496434848;
                        var4 >>= 5;
                        var4 ^= 1259004718;
                    }

                    int var127 = var4 + 1;
                    int var128 = var4 * var127;
                    int var129 = var128 & 1;
                    if (var129 != 0) {
                        break label177;
                    }

                    float var130 = this.U;
                    float var152 = this.pP;
                    float var131 = var130 + var152;
                    float var132 = var131 - 2.0F;
                    float var153 = this.fb;
                    float var154 = var153 + 7.5F;
                    XF var186 = this.bZ;
                    var8 = var186.bs();
                    int var204 = DP.nq(-2130706433, var3);
                    Hc.D(var1, var132, var154, var8, var204);
                    long var133 = var5;
                    long var188 = var133 + 1L;
                    long var189 = var133 * var188;
                    long var229 = var133 + 2L;
                    long var190 = var189 * var229;
                    long var134 = var133 + 3L;
                    long var191 = var190 * var134;
                    long var135 = var191 & 7L;
                    long var314;
                    int var136 = (var314 = var135 - 0L) == 0L ? 0 : (var314 < 0L ? -1 : 1);
                    if (var136 == 0) {
                        var4 -= 1346534910;
                        var4 ^= -1587236264;
                        int var137 = var4 + 1;
                        int var138 = var4 * var137;
                        int var139 = var138 & 1;
                        if (var139 != 0) {
                            break label177;
                        }

                        XF var140 = this.bZ;
                        float var141 = var140.bs();
                        float var142 = TP.S(var141);
                        float var143 = var142;
                        float var315;
                        int var155 = (var315 = var142 - 0.01F) == 0.0F ? 0 : (var315 < 0.0F ? -1 : 1);
                        if (var155 <= 0) {
                            var4 <<= 16;
                            var4 *= 1771039499;
                            var4 ^= -2043849862;
                            return;
                        }

                        var4 <<= 7;
                        var4 &= 782721263;
                        var4 ^= -399853554;
                        var155 = var4 + 1;
                        var155 = var4 * var155;
                        var155 &= 1;
                        if (var155 != 0) {
                            break label177;
                        }

                        var1.save();
                        Integer var159 = var5;
                        if (var159 != null) {
                            var4 -= 1343213867;
                            var4 ^= 1001747106;
                            int var160 = var4 + 1;
                            var160 = var4 * var160;
                            var160 &= 1;
                            if (var160 != 0) {
                                break label177;
                            }

                            float var163 = this.U;
                            float var164 = var163 - 2.0F;
                            var8 = this.fb;
                            var8 += 15.0F;
                            float var205 = this.pP;
                            float var206 = var205 + 4.0F;
                            float var230 = this.v();
                            float var231 = var230 - 15.0F;
                            var1.clip(var164, var8, var206, var231, 0.0F);
                            r_2 var165 = this.CF;
                            Enum[] var166 = var165.M();
                            Enum[] var167 = var166;
                            byte var194 = 0;
                            int var195 = var194;
                            var4 -= -553036990;
                            var4 ^= -1780504135;
                            var4 ^= -1024846236;

                            label154:
                            while (true) {
                                long var207 = var4;
                                long var11 = var207 + 1L;
                                var11 = var207 * var11;
                                long var13 = var207 + 2L;
                                var11 *= var13;
                                long var208 = var207 + 3L;
                                var11 *= var208;
                                long var209 = var11 & 7L;
                                long var316;
                                int var210 = (var316 = var209 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                                if (var210 != 0) {
                                    break label177;
                                }

                                int var211 = var167.length;
                                long var232 = var5;
                                long var257 = var232 + 1L;
                                var257 = var232 * var257;
                                long var14 = var232 + 2L;
                                var257 *= var14;
                                long var233 = var232 + 3L;
                                var257 *= var233;
                                long var234 = var257 & 7L;
                                long var317;
                                int var235 = (var317 = var234 - 0L) == 0L ? 0 : (var317 < 0L ? -1 : 1);
                                if (var235 != 0) {
                                    var4 &= -2059533925;
                                    var4 |= 478702701;
                                    var4 *= 1721953837;
                                    var4 -= 1683346841;
                                    var4 ^= 620572753;
                                    break;
                                }
                                var4 = switch (var4) {
                                    default -> var4 ^ -211056806;
                                    case -1726685406 -> {
                                        var4 &= 591405329;
                                        var4 += 1645820566;
                                        yield var4 ^ -1786080898;
                                    }
                                    case -1081154497 -> var4 ^ 1732383943;
                                };
                                long var236 = var4;
                                var257 = var236 + 1L;
                                var257 = var236 * var257;
                                long var237 = var257 & 1L;
                                long var318;
                                int var238 = (var318 = var237 - 0L) == 0L ? 0 : (var318 < 0L ? -1 : 1);
                                if (var238 != 0) {
                                    break label177;
                                }

                                if (var195 >= var211) {
                                    var4 ^= -920142956;
                                    var4 &= 2023395073;
                                    var4 <<= 25;
                                    var4 &= -2018682744;
                                    var4 ^= 2110633794;
                                    var1.restore();
                                    return;
                                }
                                var4 = switch (var4) {
                                    default -> var4 ^ 692914927;
                                    case -158094616 -> {
                                        var4 >>>= 3;
                                        var4 |= 699926080;
                                        var4 += 557205048;
                                        yield var4 ^ -1457560282;
                                    }
                                    case 893423913 -> var4 ^ 51530010;
                                };
                                long var212 = var4;
                                var11 = var212 + 1L;
                                var11 = var212 * var11;
                                long var213 = var11 & 1L;
                                long var319;
                                int var214 = (var319 = var213 - 0L) == 0L ? 0 : (var319 < 0L ? -1 : 1);
                                if (var214 != 0) {
                                    break label177;
                                }

                                float var215 = this.fb;
                                float var216 = var215 + 15.0F;
                                float var239 = var195;
                                float var240 = var239 * 12.0F;
                                float var217 = var216 + var240;
                                XF[] var241 = this.dL;
                                XF var242 = var241[var195];
                                float var243 = var242.bs();
                                int var249 = DP.Z(-2130706433, -1, var243);
                                float var263 = this.U;
                                float var264 = var263 + 2.0F;
                                r_2 var272 = this.CF;
                                boolean var273 = var272.m();
                                Integer var279 = var5;
                                if (var279 == null) {
                                    switch (var4) {
                                        case -936388429:
                                            var4 |= -187324465;
                                            var4 *= 1099580431;
                                            var4 |= 1439701321;
                                            var4 *= -2065154819;
                                            var4 ^= -716666450;
                                            break label154;
                                        case 31315632:
                                        default:
                                            var4 ^= 1315938012;
                                            break label154;
                                        case 110585177:
                                            var4 ^= 1507328581;
                                            break label154;
                                    }
                                }

                                var4 ^= 1917262389;
                                var4 ^= -1838852337;
                                float var278;
                                if (var273) {
                                    var4 >>>= 10;
                                    var4 *= 1845513513;
                                    var4 ^= -1669590534;
                                    Integer var274 = var4;
                                    if (var274 == null) {
                                        break label177;
                                    }

                                    float var275 = this.U;
                                    float var276 = var275 + 4.5F;
                                    var14 = var5;
                                    long var16 = var14 + 1L;
                                    var16 = var14 * var16;
                                    var14 = var16 & 1L;
                                    long var320;
                                    int var282 = (var320 = var14 - 0L) == 0L ? 0 : (var320 < 0L ? -1 : 1);
                                    if (var282 != 0) {
                                        switch (var4) {
                                            case -152830505:
                                                var4 >>= 17;
                                                var4 ^= -484027446;
                                                break label154;
                                            case 163434847:
                                                var4 ^= 970700603;
                                                break label154;
                                            case 594096053:
                                            default:
                                                var4 ^= 1955590497;
                                                break label154;
                                        }
                                    }

                                    var4 ^= -356861046;
                                    var4 -= -1667993178;
                                    var4 ^= -1884001107;
                                    Integer var283 = var4;
                                    if (var283 == null) {
                                        break label177;
                                    }

                                    float var284 = var217 + 6.0F;
                                    float var15 = var3 * var143;
                                    int var300 = var4 + -58699083;
                                    int var301 = var300 * 1244681897;
                                    int var302 = var301 ^ 1531171934;
                                    int var303 = var302 ^ 59085252;
                                    this.C(var1, var195, var276, var284, var15, var303);
                                    float var277 = var264 + 8.0F;
                                    var278 = var277;
                                    var4 <<= 9;
                                    var4 ^= -953669726;
                                } else {
                                    var4 &= 123091921;
                                    var4 |= 1013153188;
                                    var4 *= 691099751;
                                    var4 -= 869404089;
                                    var4 ^= 1366000889;
                                    int var285 = var4 + 1;
                                    int var286 = var4 * var285;
                                    int var287 = var286 & 1;
                                    if (var287 != 0) {
                                        break label177;
                                    }

                                    var278 = var264;
                                    var4 &= -938167130;
                                    var4 ^= 1716298656;
                                }

                                int var265 = var4 + 1;
                                int var266 = var4 * var265;
                                int var267 = var266 & 1;
                                if (var267 != 0) {
                                    break label177;
                                }

                                Enum var268 = var167[var195];
                                String var269 = r_2.R(var268);
                                float var288 = var217 + 2.0F;
                                long var289 = var5;
                                long var17 = var289 + 1L;
                                var17 = var289 * var17;
                                long var19 = var289 + 2L;
                                var17 *= var19;
                                var289 += 3L;
                                var17 *= var289;
                                var289 = var17 & 7L;
                                long var321;
                                int var292 = (var321 = var289 - 0L) == 0L ? 0 : (var321 < 0L ? -1 : 1);
                                if (var292 != 0) {
                                    var4 += 306373310;
                                    var4 -= -602487034;
                                    var4 ^= 1079871457;
                                    break;
                                }

                                var4 *= -757005573;
                                var4 *= -293589549;
                                var4 ^= -835893375;
                                var4 ^= 1316497854;
                                var289 = var4;
                                var17 = var289 + 1L;
                                var17 = var289 * var17;
                                var19 = var289 + 2L;
                                var17 *= var19;
                                var289 += 3L;
                                var17 *= var289;
                                var289 = var17 & 7L;
                                long var322;
                                int var296 = (var322 = var289 - 0L) == 0L ? 0 : (var322 < 0L ? -1 : 1);
                                if (var296 != 0) {
                                    break label177;
                                }

                                TextStyle var297 = G;
                                float var304 = var3 * var143;
                                int var250 = DP.nq(var249, var304);
                                TextStyle var251 = var297.color(var250);
                                float var298 = 0.09F * var243;
                                TextStyle var252 = var251.weight(var298);
                                float var253 = var1.text(var269, var278, var288, var252);
                                float var254 = this.U;
                                float var270 = this.pP;
                                float var255 = var254 + var270;
                                float var256 = var255 - 4.0F;
                                float var218 = var217 + 6.0F;
                                float var271 = var3 * var143;
                                Hc.F(var1, var256, var218, var243, var271);
                                int var219 = var195 + 1;
                                var195 = var219;
                                var4 ^= 1109690434;
                                var4 ^= -1675048731;
                                var4 ^= -139378639;
                                var4 *= -1196384523;
                                var4 ^= -1228892571;
                            }
                        } else {
                            var4 -= 372385802;
                            var4 ^= -861611841;
                        }
                    } else {
                        var4 -= -2008612341;
                        var4 ^= -584115132;
                    }
                }
            }

            IllegalStateException var118 = new IllegalStateException();
            throw var118;
        }

        IllegalArgumentException var112 = new IllegalArgumentException();
        throw var112;
    }

    private void C(Canvas var1, int var2, float var3, float var4, float var5, int var6) {
        int var9 = System.identityHashCode(this);
        float var10 = 2.7F;
        r_2 var11 = this.CF;
        long var12 = var9;
        long var14 = var12 + 1L;
        var14 = var12 * var14;
        long var16 = var12 + 2L;
        var14 *= var16;
        var12 += 3L;
        var14 *= var12;
        var12 = var14 & 7L;
        long var51;
        var9 = (var51 = var12 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
        if (var9 == 0) {
            int var25 = var6 >>> 16;
            var25 ^= -1653204505;
            long var8 = var2;
            var12 = var8 + 1L;
            var12 = var8 * var12;
            var14 = var8 + 2L;
            var12 *= var14;
            var8 += 3L;
            var12 *= var8;
            var8 = var12 & 7L;
            long var52;
            int var29 = (var52 = var8 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
            if (var29 == 0) {
                int var31 = var11.u(var2, 0);
                int var32 = DP.nq(var31, var5);
                r_2 var38 = this.CF;
                var9 = var38.u(var2, 1);
                var9 = DP.nq(var9, var5);
                Paint var33 = Paint.linear(var32, var9, (float) (Math.PI / 4));
                var1.circle(var3, var4, var10, var33);
                int var34 = DP.nq(956301311, var5);
                Paint var35 = Paint.solid(var34);
                Paint var36 = var35.stroke(0.5F);
                var1.circle(var3, var4, var10, var36);
            } else {
                AssertionError var30 = new AssertionError();
                throw var30;
            }
        } else {
            switch (var6) {
                case -269251519:
                default:
                    int var23 = var6 ^ 903619730;
                    break;
                case 425191741:
                    int var18 = var6 | 1425703188;
                    var18 |= -1827401065;
                    var18 >>>= 17;
                    var18 ^= 2116058669;
                    var18 ^= 1263156719;
                    break;
                case 1047111479:
                    int var7 = var6 ^ 731630813;
            }

            IllegalStateException var24 = new IllegalStateException();
            throw var24;
        }
    }

    @Override
    public boolean i(jX var1, float var2, float var3, int var4) {
        int var5 = Oa;
        var5 ^= -1292664261;
        int var7 = System.identityHashCode(this);
        float var8 = this.fb;
        var8 += 15.0F;
        long var9 = var7;
        long var11 = var9 + 1L;
        var11 = var9 * var11;
        var9 = var11 & 1L;
        long var227;
        int var177 = (var227 = var9 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
        if (var177 != 0) {
            switch (var5) {
                case 493040416:
                    var5 ^= -1133854009;
                    break;
                case 1864302891:
                default:
                    var5 ^= 2129414106;
                    break;
                case 1995471299:
                    var5 += 1921950408;
                    var5 &= 965891047;
                    var5 &= 1143937923;
                    var5 ^= -1436367998;
            }
        } else {
            label206: {
                var5 *= 890514163;
                var5 <<= 22;
                var5 += -1911139302;
                var5 ^= -1608169497;
                Integer var178 = var4;
                if (var178 != null) {
                    float var228;
                    int var151 = (var228 = var3 - var8) == 0.0F ? 0 : (var228 < 0.0F ? -1 : 1);
                    label189:
                    if (var151 < 0) {
                        var5 += -20640596;
                        var5 *= 2031494539;
                        var5 |= 138083061;
                        var5 ^= 1188305487;
                        if (var4 == 0) {
                            var5 &= 1876572956;
                            var5 >>= 5;
                            var5 ^= 1090876062;
                            int var157 = var4 + 1;
                            int var158 = var4 * var157;
                            int var159 = var158 & 1;
                            if (var159 != 0) {
                                break label189;
                            }

                            boolean var160 = this.w;
                            int var195 = var7 + 1;
                            int var196 = var7 * var195;
                            int var197 = var196 & 1;
                            if (var197 != 0) {
                                switch (var5) {
                                    case -1777383310:
                                    default:
                                        var5 ^= 2066339825;
                                        break label206;
                                    case -607854160:
                                        var5 ^= -2121418850;
                                        break label206;
                                    case 1131357086:
                                        var5 ^= -1481406892;
                                        var5 ^= 1320974027;
                                        break label206;
                                }
                            }
                            var5 = switch (var5) {
                                case 692632774 -> var5 ^ -1223187169;
                                case 1131357086 -> {
                                    var5 <<= 17;
                                    var5 *= 223016361;
                                    var5 += -1308916322;
                                    var5 >>>= 23;
                                    yield var5 ^ -323009806;
                                }
                                default -> var5 ^ 389388213;
                            };
                            int var198 = var4 + 1;
                            int var199 = var4 * var198;
                            int var200 = var199 & 1;
                            if (var200 != 0) {
                                break label189;
                            }

                            boolean var161;
                            if (!var160) {
                                var5 <<= 30;
                                var5 >>>= 23;
                                var5 ^= -765824015;
                                var161 = true;
                                var5 &= 155529054;
                                var5 *= -333823267;
                                var5 |= -1835270196;
                                var5 ^= 556889822;
                            } else {
                                var5 = switch (var5) {
                                    case -804671562 -> var5 ^ -1196541843;
                                    default -> var5 ^ 2145555252;
                                    case -323009861 -> {
                                        var5 -= 881821298;
                                        var5 *= 979929457;
                                        var5 <<= 18;
                                        var5 &= -2025072301;
                                        yield var5 ^ -471541693;
                                    }
                                };
                                var161 = false;
                                var5 <<= 24;
                                var5 -= 49340842;
                                var5 ^= -1612605612;
                            }

                            Integer var201 = var4;
                            if (var201 == null) {
                                break label189;
                            }

                            this.w = var161;
                            long var162 = var7;
                            long var215 = var162 + 1L;
                            var215 = var162 * var215;
                            long var163 = var215 & 1L;
                            long var229;
                            int var164 = (var229 = var163 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                            if (var164 != 0) {
                                switch (var5) {
                                    case -1206581633:
                                    default:
                                        var5 ^= -1706373285;
                                        break label206;
                                    case -1111059557:
                                        var5 ^= -1004434554;
                                        break label206;
                                    case -538015486:
                                        var5 |= -1392765591;
                                        var5 ^= 1436438122;
                                        break label206;
                                }
                            }
                            var5 = switch (var5) {
                                case -1078346560 -> var5 ^ -1193320897;
                                case -538015486 -> {
                                    var5 &= 1269762044;
                                    var5 ^= -745664125;
                                    var5 *= 775655527;
                                    yield var5 ^ -1132076246;
                                }
                                default -> var5 ^ 1526176406;
                            };
                            int var165 = var4 + 1;
                            int var166 = var4 * var165;
                            int var202 = var4 + 2;
                            int var167 = var166 * var202;
                            int var203 = var4 + 3;
                            int var168 = var167 * var203;
                            int var169 = var168 & 7;
                            if (var169 != 0) {
                                break label189;
                            }

                            var1.Ht("ui_click");
                            var5 -= 168613969;
                            var5 &= -640833117;
                            var5 *= -948503837;
                            var5 &= -1441846578;
                            var5 ^= -1971468129;
                        } else {
                            var5 ^= 1796092590;
                            var5 ^= 1674578726;
                            if (var4 == 1) {
                                var5 -= -1020085760;
                                var5 += 719595750;
                                var5 |= 971280704;
                                var5 ^= 86768931;
                                Integer var170 = var4;
                                if (var170 == null) {
                                    break label189;
                                }

                                r_2 var171 = this.CF;
                                var171.p(1);
                                Integer var172 = var7;
                                if (var172 == null) {
                                    switch (var5) {
                                        case -1488053477:
                                            var5 ^= -1616429162;
                                            break label206;
                                        case -1194515339:
                                            var5 <<= 7;
                                            var5 &= -238770834;
                                            var5 *= 1125501783;
                                            var5 ^= -1366674687;
                                            break label206;
                                        case -204766975:
                                        default:
                                            var5 ^= -885887378;
                                            break label206;
                                    }
                                }

                                var5 ^= 1122292872;
                                var5 ^= -984425198;
                                var5 >>>= 21;
                                var5 |= 1654490026;
                                var5 ^= 702271401;
                                long var173 = var4;
                                long var217 = var173 + 1L;
                                var217 = var173 * var217;
                                long var174 = var217 & 1L;
                                long var230;
                                int var175 = (var230 = var174 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                                if (var175 != 0) {
                                    break label189;
                                }

                                var1.Ht("ui_click");
                                var5 <<= 1;
                                var5 >>>= 2;
                                var5 ^= -407931999;
                                var5 ^= 1114750417;
                            } else {
                                var5 -= 872013248;
                                var5 *= 2064100013;
                                var5 ^= 1310167513;
                                var5 ^= 903492400;
                            }
                        }

                        return true;
                    } else {
                        var5 = switch (var5) {
                            case -1267526659 -> {
                                var5 *= -1956586043;
                                var5 += 1693141116;
                                var5 -= -1336023003;
                                yield var5 ^ 1003942988;
                            }
                            default -> var5 ^ -2032477052;
                            case 1861864094 -> var5 ^ -1530857297;
                        };
                        var8 = this.fb;
                        var8 = var3 - var8;
                        var8 -= 15.0F;
                        var8 /= 12.0F;
                        int var156 = (int)var8;
                        boolean var179 = this.w;
                        int var10 = var7 + 1;
                        var10 = var7 * var10;
                        var10 &= 1;
                        if (var10 != 0) {
                            var5 *= 501102035;
                            var5 ^= 922405389;
                            break label206;
                        }

                        var5 >>>= 25;
                        var5 ^= 416056025;
                        long var206 = var4;
                        long var12 = var206 + 1L;
                        var12 = var206 * var12;
                        long var207 = var12 & 1L;
                        long var231;
                        var10 = (var231 = var207 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                        label186:
                        if (var10 == 0) {
                            if (var179) {
                                var5 &= 1889423818;
                                var5 += -1794679180;
                                var5 += 16407819;
                                var5 ^= 1230328123;
                                var9 = var4;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                long var13 = var9 + 2L;
                                var11 *= var13;
                                var9 += 3L;
                                var11 *= var9;
                                var9 = var11 & 7L;
                                long var232;
                                int var183 = (var232 = var9 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                                if (var183 != 0) {
                                    break label186;
                                }

                                if (var156 >= 0) {
                                    var5 &= 1466882457;
                                    var5 -= -1185874830;
                                    var5 >>>= 25;
                                    var5 >>>= 5;
                                    var5 ^= 1979394288;
                                    int var184 = var4 + 1;
                                    int var185 = var4 * var184;
                                    int var186 = var185 & 1;
                                    if (var186 != 0) {
                                        break label186;
                                    }

                                    XF[] var187 = this.dL;
                                    int var188 = var187.length;
                                    var10 = var7 + 1;
                                    var10 = var7 * var10;
                                    var10 &= 1;
                                    if (var10 != 0) {
                                        var5 >>>= 22;
                                        var5 -= 1269157519;
                                        var5 ^= 507174985;
                                        break label206;
                                    }
                                    var5 = switch (var5) {
                                        case -1355473973 -> var5 ^ 1665711977;
                                        default -> var5 ^ 1226190665;
                                        case 1979394290 -> {
                                            var5 <<= 24;
                                            var5 &= -2127554644;
                                            var5 -= 1394789090;
                                            var5 += -1400097123;
                                            yield var5 ^ 64994521;
                                        }
                                    };
                                    long var212 = var4;
                                    var12 = var212 + 1L;
                                    var12 = var212 * var12;
                                    long var213 = var12 & 1L;
                                    long var233;
                                    var10 = (var233 = var213 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                                    if (var10 != 0) {
                                        break label186;
                                    }

                                    if (var156 < var188) {
                                        var5 += 1295703060;
                                        var5 += -959158864;
                                        var5 *= 768033139;
                                        var5 &= 1422357051;
                                        var5 ^= -1333384367;
                                        Integer var189 = var4;
                                        if (var189 != null) {
                                            int var190 = var5 * 914954739;
                                            int var191 = var190 << 3;
                                            int var192 = var191 ^ -1855949793;
                                            this.Q(var156, var192);
                                            long var145 = var7;
                                            var9 = var145 + 1L;
                                            var9 = var145 * var9;
                                            long var146 = var9 & 1L;
                                            long var234;
                                            var7 = (var234 = var146 - 0L) == 0L ? 0 : (var234 < 0L ? -1 : 1);
                                            if (var7 == 0) {
                                                switch (var5) {
                                                    case -263759549:
                                                        var5 += -319551810;
                                                        var5 -= 531218232;
                                                        var5 *= 1945467025;
                                                        var5 *= 391677537;
                                                        var5 ^= -989133825;
                                                        break;
                                                    case 1475420058:
                                                    default:
                                                        var5 ^= -782569821;
                                                        break;
                                                    case 1603492479:
                                                        var5 ^= 1346762195;
                                                }

                                                var1.Ht("ui_click");
                                                return true;
                                            }

                                            var5 >>= 9;
                                            var5 ^= 225535211;
                                            var5 ^= 1491702854;
                                            break label206;
                                        }
                                        break label186;
                                    }

                                    var5 *= -11345413;
                                    var5 -= 1250566159;
                                    var5 ^= -2022619142;
                                } else {
                                    var5 |= -265773256;
                                    var5 += 1842885115;
                                    var5 ^= -1613997624;
                                }
                            } else {
                                var5 ^= 558117832;
                                var5 ^= 2100194098;
                                var5 ^= -1229213024;
                            }

                            var7 = var4 + 1;
                            var7 = var4 * var7;
                            int var6 = var7 & 1;
                            if (var6 == 0) {
                                return false;
                            }
                        }
                    }
                }

                IllegalArgumentException var144 = new IllegalArgumentException();
                throw var144;
            }
        }

        AssertionError var143 = new AssertionError();
        throw var143;
    }

    @Override
    public void zx(boolean var1) {
        int var2 = Oa;
        var2 ^= -1761716010;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 == 0) {
            var2 += 1060606530;
            var2 -= 1962412864;
            var2 += -1926069926;
            var2 &= 2130523361;
            var2 ^= 756412479;
            this.w = var1;
        } else {
            var2 -= -82461771;
            var2 ^= -2100558388;
            AssertionError var8 = new AssertionError();
            throw var8;
        }
    }

    private void Q(int var1, int var2) {
        int var5 = System.identityHashCode(this);
        r_2 var6 = this.CF;
        long var7 = var5;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        var7 = var9 & 1L;
        long var36;
        var5 = (var36 = var7 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
        if (var5 != 0) {
            int var3 = var2 | -1826327857;
            var3 >>= 29;
            var3 ^= -1635049031;
            Integer var27 = var1;
            if (var27 != null) {
                AssertionError var28 = new AssertionError();
                throw var28;
            }
        } else {
            switch (var2) {
                case -162843463:
                    int var18 = var2 ^ 1899712019;
                    break;
                case 50485463:
                    int var14 = var2 + 581657608;
                    var14 *= 1589388569;
                    var14 <<= 22;
                    var14 ^= 207061576;
                    break;
                case 649658102:
                default:
                    int var13 = var2 ^ 1029389553;
            }

            long var19 = var1;
            var7 = var19 + 1L;
            var7 = var19 * var7;
            var9 = var19 + 2L;
            var7 *= var9;
            var19 += 3L;
            var7 *= var19;
            var19 = var7 & 7L;
            long var37;
            int var22 = (var37 = var19 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var22 == 0) {
                Enum[] var24 = var6.M();
                Enum var25 = var24[var1];
                r_2 var4 = this.CF;
                var4.UY(var25);
                return;
            }
        }

        AssertionError var23 = new AssertionError();
        throw var23;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 427911140;
        int var2 = XR.Mz;
        int var4 = of_2.xF(var3, var1, var2);
        Oa = var4;
    }
}
