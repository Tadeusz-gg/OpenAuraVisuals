package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class vw_2 implements Ya_2 {
    private Canvas qd;
    private float E;
    private float u;
    private float r;
    private float m;
    private int fV;
    private int F;
    private int Sr;
    private float oh;
    private float Sa;
    private float R;
    private boolean O;
    private boolean Lv = true;
    private lB vN;
    public static final int a;

    public vw_2() {
        lB var1 = lB.FILL;
        this.vN = var1;
    }

    public vw_2 D(Canvas var1, float var2, float var3, float var4, float var5) {
        label87: {
            int var6 = a;
            var6 ^= 142627642;
            int var7 = System.identityHashCode(this);
            int var8 = var7 + 1;
            var8 = var7 * var8;
            int var9 = var7 + 2;
            var8 *= var9;
            var9 = var7 + 3;
            var8 *= var9;
            var8 &= 7;
            var9 = of_2.dq;
            var6 ^= var9;
            var6 ^= 1054152787;
            of_2.dq = 1054152787;
            var9 = of_2.Nb;
            var6 ^= var9;
            var6 ^= -1068364821;
            of_2.Nb = -1068364821;
            if (var8 != 0) {
                switch (var6) {
                    case -1494587600:
                        var6 ^= -701465676;
                        break;
                    case -890901613:
                        var6 *= 74755833;
                        var6 += -702379645;
                        var6 ^= 954060659;
                        break;
                    case 688320266:
                    default:
                        var6 ^= -562818337;
                }
            } else {
                label89: {
                    var6 *= -392347777;
                    var6 ^= -1255036207;
                    long var97 = var6;
                    long var10 = var97 + 1L;
                    var10 = var97 * var10;
                    long var12 = var97 + 2L;
                    var10 *= var12;
                    long var98 = var97 + 3L;
                    var10 *= var98;
                    long var99 = var10 & 7L;
                    long var174;
                    var8 = (var174 = var99 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                    if (var8 != 0) {
                        break label87;
                    }

                    this.qd = var1;
                    this.r = var4;
                    float var101 = var1.pixelScale();
                    float var102 = Math.max(0.01F, var101);
                    this.m = var102;
                    int var103 = (this.Lv ? 1 : 0);
                    if (var103 != 0) {
                        var6 *= -414527875;
                        var6 &= -1883342501;
                        var6 += 573714689;
                        var6 -= 949353652;
                        var6 ^= 1453134092;
                        var103 = var6 + 1;
                        var103 = var6 * var103;
                        var9 = var6 + 2;
                        var103 *= var9;
                        var9 = var6 + 3;
                        var103 *= var9;
                        var103 &= 7;
                        if (var103 != 0) {
                            break label87;
                        }

                        float var109 = var5 * var4;
                        float var125 = this.m;
                        float var110 = var109 * var125;
                        var103 = Math.round(var110);
                        var103 = Math.max(1, var103);
                        long var126 = var7;
                        long var11 = var126 + 1L;
                        var11 = var126 * var11;
                        long var13 = var126 + 2L;
                        var11 *= var13;
                        long var127 = var126 + 3L;
                        var11 *= var127;
                        long var128 = var11 & 7L;
                        long var175;
                        var9 = (var175 = var128 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            var6 &= -242836188;
                            var6 >>= 18;
                            var6 &= 717117253;
                            var6 += -471490751;
                            var6 ^= -1241466484;
                            break label89;
                        }

                        var6 &= 142462670;
                        var6 |= -1740827397;
                        var6 |= -308838617;
                        var6 += -814774529;
                        var6 ^= -842584205;
                        var103 &= 1;
                        float var115;
                        if (var103 == 1) {
                            var6 += -1593110300;
                            var6 *= 1951868557;
                            var6 *= -1582240635;
                            var6 |= -1141326810;
                            var6 ^= -2012866434;
                            Integer var114 = var6;
                            if (var114 == null) {
                                break label87;
                            }

                            var115 = 0.5F;
                            var6 -= -870669887;
                            var6 &= 752854955;
                            var6 |= -1256162691;
                            var6 ^= 1412563436;
                        } else {
                            var6 -= -1414968418;
                            var6 |= -70565873;
                            var6 -= 1113559220;
                            var6 ^= 262672754;
                            var115 = 0.0F;
                            var6 &= 1661920241;
                            var6 ^= -875020336;
                        }

                        var9 = var6 + 1;
                        var9 = var6 * var9;
                        int var151 = var6 + 2;
                        var9 *= var151;
                        int var152 = var6 + 3;
                        var9 *= var152;
                        var9 &= 7;
                        if (var9 != 0) {
                            break label87;
                        }

                        float var135 = this.m;
                        float var136 = var2 * var135;
                        double var137 = var136;
                        double var138 = Math.floor(var137);
                        float var139 = (float)var138;
                        float var140 = var139 + var115;
                        float var153 = this.m;
                        float var141 = var140 / var153;
                        this.E = var141;
                        float var142 = this.m;
                        float var143 = var3 * var142;
                        double var144 = var143;
                        double var145 = Math.floor(var144);
                        float var146 = (float)var145;
                        var10 = var7;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        long var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var176;
                        int var157 = (var176 = var10 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                        if (var157 != 0) {
                            switch (var6) {
                                case -1457239825:
                                default:
                                    var6 ^= 1365611229;
                                    break label89;
                                case -562088782:
                                    var6 ^= 161109221;
                                    break label89;
                                case -372211823:
                                    var6 -= 1788944179;
                                    var6 ^= -947111341;
                                    break label89;
                            }
                        }

                        var6 ^= 998557886;
                        var6 -= 1558267231;
                        var6 &= -25837760;
                        var6 &= -1377882658;
                        var6 ^= 1437140690;
                        var10 = var6;
                        var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var177;
                        int var161 = (var177 = var10 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                        if (var161 != 0) {
                            break label87;
                        }

                        float var116 = var146 + var115;
                        float var147 = this.m;
                        float var117 = var116 / var147;
                        this.u = var117;
                        var6 &= 1155867354;
                        var6 ^= 156852365;
                    } else {
                        var6 &= 917756769;
                        var6 &= 169204023;
                        var6 >>= 21;
                        var6 ^= 862941901;
                        this.E = var2;
                        Integer var86 = var7;
                        if (var86 == null) {
                            switch (var6) {
                                case 635797202:
                                    var6 ^= 2039496668;
                                    break label89;
                                case 862941917:
                                    var6 -= -962190466;
                                    var6 ^= -731245230;
                                    break label89;
                                case 1477867013:
                                default:
                                    var6 ^= 452611405;
                                    break label89;
                            }
                        }

                        var6 >>>= 4;
                        var6 *= 335565181;
                        var6 >>>= 5;
                        var6 *= -662697593;
                        var6 ^= -1694452464;
                        var86 = var6;
                        if (var86 == null) {
                            break label87;
                        }

                        this.u = var3;
                        var6 *= -671197701;
                        var6 -= 61647419;
                        var6 ^= -492976046;
                        var6 ^= 311322501;
                    }

                    var7 = var6 + 1;
                    var7 = var6 * var7;
                    var103 = var6 + 2;
                    var7 *= var103;
                    var103 = var6 + 3;
                    var7 *= var103;
                    var7 &= 7;
                    if (var7 == 0) {
                        return this;
                    }
                    break label87;
                }
            }

            RuntimeException var84 = new RuntimeException();
            throw var84;
        }

        RuntimeException var85 = new RuntimeException();
        throw var85;
    }

    public vw_2 gs(int var1, int var2, int var3) {
        int var4 = a;
        var4 ^= -244015347;
        int var6 = System.identityHashCode(this);
        this.fV = var1;
        Integer var25 = var6;
        int var7 = of_2.dq;
        var4 ^= var7;
        var4 ^= 1054152787;
        var7 = of_2.Nb;
        var4 ^= var7;
        var4 ^= -1068364821;
        if (var25 != null) {
            var4 *= -34227655;
            var4 ^= -306297140;
            var4 |= 1693735562;
            var4 += 170789372;
            var4 ^= -2079829367;
            int var26 = var1 + 1;
            var26 = var1 * var26;
            var26 &= 1;
            if (var26 == 0) {
                this.F = var2;
                this.Sr = var3;
                return this;
            }
        } else {
            var4 += 645446876;
            var4 |= 177165837;
            var4 |= -947851748;
            var4 ^= 1740529135;
            Integer var22 = var1;
            if (var22 != null) {
                IllegalStateException var24 = new IllegalStateException();
                throw var24;
            }
        }

        IllegalStateException var23 = new IllegalStateException();
        throw var23;
    }

    public vw_2 c(float var1, float var2, boolean var3, boolean var4) {
        int var5 = a;
        var5 ^= 962282428;
        int var6 = System.identityHashCode(this);
        Integer var17 = var6;
        if (var17 == null) {
            var5 -= -1598515075;
            var5 ^= -255588168;
            var5 -= 1822378684;
            var5 >>= 6;
            var5 ^= -1415436589;
            UnsupportedOperationException var18 = new UnsupportedOperationException();
            throw var18;
        } else {
            var5 >>= 23;
            var5 ^= -1271076289;
            Integer var10 = var5;
            if (var10 != null) {
                this.oh = var1;
                this.Sa = var2;
                this.O = var3;
                this.Lv = var4;
                return this;
            } else {
                IllegalStateException var11 = new IllegalStateException();
                throw var11;
            }
        }
    }

    public void BA(kP_2 var1, VA var2, float var3) {
        label131: {
            int var4 = a;
            var4 ^= -620892234;
            int var5 = System.identityHashCode(this);
            int var6 = var5 + 1;
            var6 = var5 * var6;
            int var7 = var5 + 2;
            var6 *= var7;
            var7 = var5 + 3;
            var6 *= var7;
            var6 &= 7;
            if (var6 != 0) {
                var4 |= -941960108;
                var4 ^= 183601551;
            } else {
                var4 |= 2067945566;
                var4 &= 2057543938;
                var4 ^= 1086053271;
                Integer var104 = var4;
                if (var104 == null) {
                    break label131;
                }

                float var164;
                int var105 = (var164 = var3 - 0.004F) == 0.0F ? 0 : (var164 < 0.0F ? -1 : 1);
                if (var105 <= 0) {
                    var4 &= -1096034235;
                    var4 -= 867764768;
                    var4 ^= 846630670;
                    return;
                }

                var4 += 1812409924;
                var4 &= -824303931;
                var4 -= -2065600098;
                var4 ^= 406308388;
                long var106 = var4;
                long var8 = var106 + 1L;
                var8 = var106 * var8;
                long var10 = var106 + 2L;
                var8 *= var10;
                long var107 = var106 + 3L;
                var8 *= var107;
                long var108 = var8 & 7L;
                long var165;
                var105 = (var165 = var108 - 0L) == 0L ? 0 : (var165 < 0L ? -1 : 1);
                if (var105 != 0) {
                    break label131;
                }

                this.R = var3;
                float var110 = this.Sa;
                float var166;
                var105 = (var166 = var110 - 0.01F) == 0.0F ? 0 : (var166 < 0.0F ? -1 : 1);
                var7 = var5 + 1;
                var7 = var5 * var7;
                int var153 = var5 + 2;
                var7 *= var153;
                int var154 = var5 + 3;
                var7 *= var154;
                var7 &= 7;
                label128:
                if (var7 == 0) {
                    var4 *= 614938237;
                    var4 ^= 1940895457;
                    var7 = var4 + 1;
                    var7 = var4 * var7;
                    var7 &= 1;
                    if (var7 != 0) {
                        break label131;
                    }

                    if (var105 > 0) {
                        var4 *= -1336304463;
                        var4 &= -2024656948;
                        var4 *= -1025197567;
                        var4 *= -1944442573;
                        var4 ^= 1655482029;
                        lB var112 = lB.GLOW;
                        long var129 = var5;
                        long var9 = var129 + 1L;
                        var9 = var129 * var9;
                        long var11 = var129 + 2L;
                        var9 *= var11;
                        long var130 = var129 + 3L;
                        var9 *= var130;
                        long var131 = var9 & 7L;
                        long var167;
                        var7 = (var167 = var131 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            switch (var4) {
                                case -1267344907:
                                    var4 |= -583025776;
                                    var4 -= 1326801082;
                                    var4 += 1025165913;
                                    var4 <<= 23;
                                    var4 ^= 522936016;
                                    break label128;
                                case -665785025:
                                    var4 ^= 938591879;
                                    break label128;
                                case -289240353:
                                default:
                                    var4 ^= 1058167984;
                                    break label128;
                            }
                        }
                        var4 = switch (var4) {
                            default -> var4 ^ 290903913;
                            case -1267344907 -> {
                                var4 |= -95493330;
                                var4 &= -332711145;
                                var4 ^= -1516804189;
                                var4 -= 1007495667;
                                yield var4 ^ 848305004;
                            }
                            case 1170030892 -> var4 ^ 1776072671;
                        };
                        Integer var133 = var4;
                        if (var133 == null) {
                            break label131;
                        }

                        this.vN = var112;
                        var1.emit(this, var2);
                        var4 |= 630304935;
                        var4 |= 1770272260;
                        var4 ^= -959439800;
                    } else {
                        var4 -= 743852975;
                        var4 ^= -2042399303;
                        var4 |= 189439179;
                        var4 ^= -436191732;
                    }

                    float var113 = this.oh;
                    float var168;
                    var105 = (var168 = var113 - 0.01F) == 0.0F ? 0 : (var168 < 0.0F ? -1 : 1);
                    Integer var134 = var5;
                    label121:
                    if (var134 != null) {
                        var4 -= 123613007;
                        var4 ^= -984566229;
                        int var135 = var4 + 1;
                        var135 = var4 * var135;
                        var135 &= 1;
                        if (var135 != 0) {
                            break label131;
                        }

                        if (var105 > 0) {
                            var4 = switch (var4) {
                                case 548166199 -> var4 ^ -114164557;
                                case 2000798387 -> {
                                    var4 *= 1037030813;
                                    yield var4 ^ 2022379737;
                                }
                                default -> var4 ^ -1251570301;
                            };
                            var105 = this.Sr;
                            var105 = DP.R(var105);
                            long var138 = var5;
                            long var159 = var138 + 1L;
                            var159 = var138 * var159;
                            long var163 = var138 + 2L;
                            var159 *= var163;
                            long var139 = var138 + 3L;
                            var159 *= var139;
                            long var140 = var159 & 7L;
                            long var169;
                            var135 = (var169 = var140 - 0L) == 0L ? 0 : (var169 < 0L ? -1 : 1);
                            if (var135 != 0) {
                                var4 *= 365077817;
                                var4 ^= -1034638210;
                                break label121;
                            }

                            var4 += 317935912;
                            var4 |= -477479294;
                            var4 ^= 941208930;
                            var135 = var4 + 1;
                            var135 = var4 * var135;
                            var135 &= 1;
                            if (var135 != 0) {
                                break label131;
                            }

                            if (var105 > 0) {
                                var4 = switch (var4) {
                                    case -1683170937 -> var4 ^ 204566224;
                                    default -> var4 ^ -822414047;
                                    case -1013511516 -> {
                                        var4 -= 1504036922;
                                        var4 += -525253488;
                                        var4 >>= 27;
                                        var4 += -319546106;
                                        yield var4 ^ -2075839608;
                                    }
                                };
                                lB var117 = lB.OUTLINE;
                                Integer var145 = var5;
                                if (var145 == null) {
                                    var4 &= 786819606;
                                    var4 &= 802674945;
                                    var4 += 150085501;
                                    var4 ^= -463963731;
                                    break label121;
                                }

                                var4 -= -829465708;
                                var4 += -143310900;
                                var4 ^= 544462060;
                                this.vN = var117;
                                var1.emit(this, var2);
                                switch (var4) {
                                    case -1310407085:
                                        var4 >>>= 28;
                                        var4 -= -254670479;
                                        var4 += 467285860;
                                        var4 ^= -321370682;
                                        break;
                                    case -97305877:
                                        var4 ^= -247967698;
                                        break;
                                    case 2062966740:
                                    default:
                                        var4 ^= -1072350901;
                                }
                            } else {
                                switch (var4) {
                                    case -1013511516:
                                        var4 *= 1920820009;
                                        var4 -= -549889867;
                                        var4 |= -1994198856;
                                        var4 -= -1192859467;
                                        var4 ^= 563406642;
                                        break;
                                    case -860536740:
                                        var4 ^= 1175152039;
                                        break;
                                    case 767554905:
                                    default:
                                        var4 ^= 537583482;
                                }
                            }
                        } else {
                            var4 ^= -1603084146;
                            var4 ^= 283331077;
                        }

                        Integer var118 = var4;
                        if (var118 == null) {
                            break label131;
                        }

                        lB var119 = lB.FILL;
                        var135 = var5 + 1;
                        var135 = var5 * var135;
                        int var155 = var5 + 2;
                        var135 *= var155;
                        var5 += 3;
                        var135 *= var5;
                        var5 = var135 & 7;
                        if (var5 == 0) {
                            var4 &= -798376078;
                            var4 ^= -1469394309;
                            var4 |= -2086176107;
                            var4 ^= 577842553;
                            this.vN = var119;
                            var1.emit(this, var2);
                            return;
                        }

                        var4 ^= -845205755;
                        var4 ^= -547087891;
                    } else {
                        var4 ^= -1824942638;
                        var4 >>>= 31;
                        var4 -= 138423152;
                        var4 ^= 580160064;
                    }
                } else {
                    var4 &= 16740072;
                    var4 >>= 26;
                    var4 &= -130061618;
                    var4 ^= 1602469852;
                    var4 ^= -1968643828;
                }
            }

            AssertionError var93 = new AssertionError();
            throw var93;
        }

        AssertionError var97 = new AssertionError();
        throw var97;
    }

    public void Y(du var1, float var2, float var3) {
        label149: {
            int var4 = a;
            var4 ^= -1614971544;
            int var5 = System.identityHashCode(this);
            Integer var6 = var5;
            if (var6 == null) {
                switch (var4) {
                    case -499908296:
                    default:
                        var4 ^= 1550922791;
                        break;
                    case 718594495:
                        var4 ^= 1698992627;
                        break;
                    case 1574487489:
                        var4 += 245491048;
                        var4 *= 927163597;
                        var4 -= -803438046;
                        var4 ^= 257395232;
                }
            } else {
                var4 -= 191572852;
                var4 ^= 744047333;
                var4 ^= 1825774714;
                var6 = var4;
                if (var6 == null) {
                    break label149;
                }

                float var185;
                int var101 = (var185 = var3 - 0.004F) == 0.0F ? 0 : (var185 < 0.0F ? -1 : 1);
                if (var101 <= 0) {
                    var4 = switch (var4) {
                        case -1588485741 -> var4 ^ -238664220;
                        case 317179090 -> {
                            var4 += -1794402132;
                            var4 &= 1187531872;
                            yield var4 ^ -139287834;
                        }
                        default -> var4 ^ 1318911529;
                    };
                    var101 = var4 + 1;
                    var101 = var4 * var101;
                    int var159 = var4 + 2;
                    var101 *= var159;
                    var159 = var4 + 3;
                    var101 *= var159;
                    var101 &= 7;
                    if (var101 == 0) {
                        return;
                    }
                    break label149;
                }

                var4 |= 241175069;
                var4 *= -211782001;
                var4 ^= -3145285;
                var4 ^= -950326537;
                long var102 = var4;
                long var8 = var102 + 1L;
                var8 = var102 * var8;
                long var103 = var8 & 1L;
                long var186;
                var101 = (var186 = var103 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                if (var101 != 0) {
                    break label149;
                }

                this.R = var3;
                float var105 = this.Sa;
                float var187;
                var101 = (var187 = var105 - 0.01F) == 0.0F ? 0 : (var187 < 0.0F ? -1 : 1);
                long var7 = var5;
                long var9 = var7 + 1L;
                var9 = var7 * var9;
                var7 = var9 & 1L;
                long var188;
                int var131 = (var188 = var7 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                label143:
                if (var131 == 0) {
                    var4 -= 1191384895;
                    var4 ^= 990705771;
                    if (var101 > 0) {
                        var4 += -634368700;
                        var4 ^= -400765354;
                        lB var107 = lB.GLOW;
                        Integer var132 = var5;
                        if (var132 == null) {
                            switch (var4) {
                                case -398902161:
                                    var4 <<= 16;
                                    var4 ^= -1601365101;
                                    break label143;
                                case 1313559737:
                                default:
                                    var4 ^= 1275118155;
                                    break label143;
                                case 1583801600:
                                    var4 ^= 351501070;
                                    break label143;
                            }
                        }

                        var4 ^= -824575713;
                        var4 >>>= 26;
                        var4 ^= -1653595662;
                        int var133 = var4 + 1;
                        int var134 = var4 * var133;
                        int var162 = var4 + 2;
                        int var135 = var134 * var162;
                        int var163 = var4 + 3;
                        int var136 = var135 * var163;
                        int var137 = var136 & 7;
                        if (var137 != 0) {
                            break label149;
                        }

                        int var138 = var4 | 48933099;
                        int var139 = var138 - 252590139;
                        int var140 = var139 ^ -253399552;
                        this.X(var1, var2, var107, var140);
                        switch (var4) {
                            case -1653595653:
                                var4 *= 339391043;
                                var4 ^= -34917962;
                                var4 ^= -1955371685;
                                break;
                            case -933215702:
                            default:
                                var4 ^= 401458042;
                                break;
                            case 229223042:
                                var4 ^= 1180245145;
                        }
                    } else {
                        var4 -= -429820327;
                        var4 &= -360614978;
                        var4 ^= 651107520;
                    }

                    long var108 = var4;
                    var8 = var108 + 1L;
                    var8 = var108 * var8;
                    long var10 = var108 + 2L;
                    var8 *= var10;
                    long var109 = var108 + 3L;
                    var8 *= var109;
                    long var110 = var8 & 7L;
                    long var189;
                    var101 = (var189 = var110 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                    if (var101 != 0) {
                        break label149;
                    }

                    float var112 = this.oh;
                    Integer var141 = var5;
                    if (var141 == null) {
                        var4 >>>= 3;
                        var4 >>>= 21;
                        var4 ^= -217680089;
                        var4 ^= 1877241016;
                    } else {
                        label154: {
                            var4 += -1692728504;
                            var4 ^= 772358475;
                            var7 = var4;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var190;
                            int var145 = (var190 = var7 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                            if (var145 != 0) {
                                break label149;
                            }

                            float var191;
                            var101 = (var191 = var112 - 0.01F) == 0.0F ? 0 : (var191 < 0.0F ? -1 : 1);
                            if (var101 > 0) {
                                var4 |= -979339003;
                                var4 >>= 8;
                                var4 &= -1876764077;
                                var4 ^= -1313352209;
                                var4 ^= 1017709616;
                                long var114 = var4;
                                var8 = var114 + 1L;
                                var8 = var114 * var8;
                                var10 = var114 + 2L;
                                var8 *= var10;
                                long var115 = var114 + 3L;
                                var8 *= var115;
                                long var116 = var8 & 7L;
                                long var192;
                                var101 = (var192 = var116 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                                if (var101 != 0) {
                                    break label149;
                                }

                                var101 = this.Sr;
                                var101 = DP.R(var101);
                                int var146 = var5 + 1;
                                int var147 = var5 * var146;
                                int var148 = var147 & 1;
                                if (var148 != 0) {
                                    var4 >>= 5;
                                    var4 ^= 1586379539;
                                    var4 <<= 5;
                                    var4 *= 2020919495;
                                    var4 ^= 731684531;
                                    break label154;
                                }
                                var4 = switch (var4) {
                                    default -> var4 ^ -1697901776;
                                    case 488510350 -> {
                                        var4 ^= -195715320;
                                        var4 ^= -954438319;
                                        yield var4 ^ -1057934789;
                                    }
                                    case 1900356280 -> var4 ^ 540910512;
                                };
                                var7 = var4;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                var7 = var9 & 1L;
                                long var193;
                                int var151 = (var193 = var7 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                                if (var151 != 0) {
                                    break label149;
                                }

                                if (var101 > 0) {
                                    var4 &= 1799905658;
                                    var4 >>>= 1;
                                    var4 ^= -385367559;
                                    Integer var120 = var4;
                                    if (var120 == null) {
                                        break label149;
                                    }

                                    lB var121 = lB.OUTLINE;
                                    var7 = var5;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var11 = var7 + 2L;
                                    var9 *= var11;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var194;
                                    int var155 = (var194 = var7 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                                    if (var155 != 0) {
                                        var4 += -1597387644;
                                        var4 ^= 1147847749;
                                        var4 *= 1610164651;
                                        var4 += -134857565;
                                        var4 ^= -488608276;
                                        break label154;
                                    }
                                    var4 = switch (var4) {
                                        case -603463347 -> {
                                            var4 >>>= 17;
                                            var4 += 465315179;
                                            yield var4 ^ -819459770;
                                        }
                                        case 368072394 -> var4 ^ 854222989;
                                        default -> var4 ^ -1511986918;
                                    };
                                    int var156 = var4 * 1283262689;
                                    int var157 = var156 + -1358298606;
                                    int var158 = var157 ^ 804757754;
                                    this.X(var1, var2, var121, var158);
                                    switch (var4) {
                                        case -1143480946:
                                        default:
                                            var4 ^= 587458919;
                                            break;
                                        case -728458712:
                                            var4 &= 1036970311;
                                            var4 &= 1263435231;
                                            var4 &= 1390914711;
                                            var4 ^= -1660760702;
                                            var4 ^= 95967096;
                                            break;
                                        case 1344325194:
                                            var4 ^= -672585714;
                                    }
                                } else {
                                    var4 *= 360542995;
                                    var4 -= -1779104698;
                                    var4 &= -1567112175;
                                    var4 &= -1364434672;
                                    var4 ^= 977179370;
                                }
                            } else {
                                var4 &= 670905889;
                                var4 -= -297999501;
                                var4 >>>= 18;
                                var4 |= -1264331781;
                                var4 ^= 740115713;
                            }

                            lB var122 = lB.FILL;
                            Integer var93 = var5;
                            if (var93 != null) {
                                var4 |= 1441231928;
                                var4 ^= 190917349;
                                var93 = var4;
                                if (var93 != null) {
                                    int var95 = var4 ^ 1757498253;
                                    var95 += -1123660583;
                                    var95 |= -570237767;
                                    var95 -= -1433509270;
                                    var95 ^= 886080849;
                                    this.X(var1, var2, var122, var95);
                                    return;
                                }
                                break label149;
                            }

                            var4 &= -724512328;
                            var4 -= -1076346433;
                            var4 ^= 1280988522;
                        }
                    }
                } else {
                    var4 ^= 162478361;
                    var4 &= 2028374464;
                    var4 *= -1341156573;
                    var4 ^= 867133907;
                }
            }

            long var85 = var4;
            long var123 = var85 + 1L;
            long var124 = var85 * var123;
            long var86 = var124 & 1L;
            long var195;
            var4 = (var195 = var86 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalStateException var88 = new IllegalStateException();
                throw var88;
            }
        }

        UnsupportedOperationException var92 = new UnsupportedOperationException();
        throw var92;
    }

    private void X(du var1, float var2, lB var3, int var4) {
        label176: {
            int var6 = System.identityHashCode(this);
            this.vN = var3;
            Integer var7 = var6;
            int var19;
            if (var7 == null) {
                var19 = var4 >>> 30;
                var19 &= -579251439;
                var19 ^= -19297341;
            } else {
                var19 = switch (var4) {
                    default -> var4 ^ 1055577935;
                    case -1258998643 -> var4 ^ 938584658;
                    case 1611210688 -> {
                        var19 = var4 << 21;
                        yield var19 ^ -2014765510;
                    }
                };
                int var109 = var19 + 1;
                var109 = var19 * var109;
                int var8 = var19 + 2;
                var109 *= var8;
                var8 = var19 + 3;
                var109 *= var8;
                var109 &= 7;
                if (var109 != 0) {
                    break label176;
                }

                float var114 = var2 * 0.5F;
                float var115 = var114;
                int var119 = 0;
                var119 = var119;
                var19 += 887910124;
                var19 <<= 30;
                var19 += 1252129731;
                var19 ^= -229404914;

                label173:
                while (true) {
                    long var9 = var19;
                    long var11 = var9 + 1L;
                    var11 = var9 * var11;
                    long var13 = var9 + 2L;
                    var11 *= var13;
                    var9 += 3L;
                    var11 *= var9;
                    var9 = var11 & 7L;
                    long var199;
                    int var123 = (var199 = var9 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                    if (var123 != 0) {
                        break label176;
                    }

                    if (var119 >= 17) {
                        var19 <<= 31;
                        var19 += 1614102412;
                        var19 >>= 9;
                        var19 |= 1506372027;
                        var19 ^= 327427735;
                        long var103 = var19;
                        long var116 = var103 + 1L;
                        long var117 = var103 * var116;
                        long var104 = var117 & 1L;
                        long var200;
                        var19 = (var200 = var104 - 0L) == 0L ? 0 : (var200 < 0L ? -1 : 1);
                        if (var19 == 0) {
                            return;
                        }
                        break label176;
                    }

                    var19 -= -487849151;
                    var19 -= -267394466;
                    var19 <<= 17;
                    var19 *= 1115133957;
                    var19 ^= 1759436384;
                    var9 = var19;
                    var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var9 = var11 & 1L;
                    long var201;
                    int var126 = (var201 = var9 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                    if (var126 != 0) {
                        break label176;
                    }

                    byte var127 = 0;
                    int var10 = var6 + 1;
                    var10 = var6 * var10;
                    var10 &= 1;
                    if (var10 != 0) {
                        var19 += 1492294889;
                        var19 += -1121362419;
                        var19 ^= -1946725740;
                        break;
                    }
                    var19 = switch (var19) {
                        case -81424887 -> var19 ^ 869587380;
                        default -> var19 ^ -1070323876;
                        case 1595072096 -> {
                            var19 <<= 4;
                            yield var19 ^ 165947784;
                        }
                    };
                    var10 = var19 + 1;
                    var10 = var19 * var10;
                    var10 &= 1;
                    if (var10 != 0) {
                        break label176;
                    }

                    int var128 = var127;
                    var19 -= -1106030873;
                    var19 >>= 13;
                    var19 ^= -461361545;

                    while (true) {
                        long var135 = var19;
                        long var12 = var135 + 1L;
                        var12 = var135 * var12;
                        long var14 = var135 + 2L;
                        var12 *= var14;
                        long var136 = var135 + 3L;
                        var12 *= var136;
                        long var137 = var12 & 7L;
                        long var202;
                        var10 = (var202 = var137 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                        if (var10 != 0) {
                            break label176;
                        }

                        if (var128 >= 17) {
                            var19 = switch (var19) {
                                case -461243453 -> {
                                    var19 += -376716598;
                                    yield var19 ^ 618364833;
                                }
                                default -> var19 ^ -372148756;
                                case 1408699997 -> var19 ^ -103817804;
                            };
                            int var129 = var119 + 1;
                            Integer var149 = var6;
                            if (var149 == null) {
                                var19 ^= -401966375;
                                var19 -= 2093708786;
                                var19 |= 701060403;
                                var19 ^= 1359011057;
                                break label173;
                            }

                            var19 += 592445631;
                            var19 ^= 1037185983;
                            var19 &= -1783296307;
                            var19 ^= 2055669876;
                            var19 ^= -123274583;
                            var119 = var129;
                            var19 &= 791296994;
                            var19 ^= 1005732941;
                            break;
                        }
                        var19 = switch (var19) {
                            case -461243453 -> {
                                var19 >>= 12;
                                yield var19 ^ 798679934;
                            }
                            default -> var19 ^ -1294637565;
                            case 1798995830 -> var19 ^ 54178615;
                        };
                        Integer var139 = var19;
                        if (var139 == null) {
                            break label176;
                        }

                        byte var140 = var1.q(var128, var119);
                        Integer var155 = var6;
                        if (var155 == null) {
                            var19 *= -306037693;
                            var19 ^= 836509089;
                            break label173;
                        }

                        var19 ^= 851834954;
                        var19 -= -2055120118;
                        var19 &= -104444104;
                        var19 ^= -586944528;
                        var11 = var19;
                        var13 = var11 + 1L;
                        var13 = var11 * var13;
                        long var15 = var11 + 2L;
                        var13 *= var15;
                        var11 += 3L;
                        var13 *= var11;
                        var11 = var13 & 7L;
                        long var203;
                        int var159 = (var203 = var11 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                        if (var159 != 0) {
                            break label176;
                        }

                        if (var140 == 0) {
                            var19 -= -485684472;
                            var19 += 321719834;
                            var19 ^= -1399967564;
                            var19 += -9005292;
                            var19 ^= 1888421342;
                        } else {
                            var19 &= -1508931998;
                            var19 *= 71649183;
                            var19 &= -770439798;
                            var19 &= -1658780661;
                            var19 ^= 537247999;
                            int var160 = var19 + 1;
                            int var161 = var19 * var160;
                            int var162 = var161 & 1;
                            if (var162 != 0) {
                                break label176;
                            }

                            int var163 = var128 - 8;
                            float var164 = var163;
                            var12 = var6;
                            var14 = var12 + 1L;
                            var14 = var12 * var14;
                            long var16 = var12 + 2L;
                            var14 *= var16;
                            var12 += 3L;
                            var14 *= var12;
                            var12 = var14 & 7L;
                            long var204;
                            int var176 = (var204 = var12 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                            if (var176 != 0) {
                                var19 += 285731617;
                                var19 &= 2039359957;
                                var19 ^= -1076517950;
                                break label173;
                            }
                            var19 = switch (var19) {
                                case -1341800193 -> {
                                    var19 ^= -545681611;
                                    yield var19 ^ 1870878549;
                                }
                                default -> var19 ^ -448563828;
                                case 1923244870 -> var19 ^ 2026454085;
                            };
                            float var165 = var164 * var2;
                            int var177 = var119 - 8;
                            float var178 = var177;
                            float var179 = var178 * var2;
                            float var185 = var165 - var115;
                            float var192 = var179 - var115;
                            float var166 = var165 + var115;
                            float var180 = var179 + var115;
                            byte var144;
                            if (var140 == 2) {
                                var19 -= 1533843139;
                                var19 *= -1153527457;
                                var19 -= 1047904678;
                                var19 ^= 1937182051;
                                var19 ^= -450107568;
                                int var141 = var19 + 1;
                                var141 = var19 * var141;
                                var141 &= 1;
                                if (var141 != 0) {
                                    break label176;
                                }

                                var144 = 1;
                                var19 += 1381234217;
                                var19 ^= 1872255330;
                            } else {
                                var19 *= -1326842913;
                                var19 |= -1199161595;
                                var19 ^= -1166534850;
                                var144 = 0;
                                switch (var19) {
                                    case -561088983:
                                    default:
                                        var19 ^= -2094085744;
                                        break;
                                    case -341877292:
                                        var19 ^= -803416983;
                                        break;
                                    case 116353211:
                                        var19 *= -2120166137;
                                        var19 &= 2067457098;
                                        var19 &= 2136094132;
                                        var19 >>>= 15;
                                        var19 ^= 2041490320;
                                }
                            }

                            Integer var193 = var19;
                            if (var193 == null) {
                                break label176;
                            }

                            int var194 = var19 ^ -336199513;
                            int var195 = var194 >> 30;
                            int var196 = var195 + 545576494;
                            int var197 = var196 ^ -1412812904;
                            int var198 = var197 ^ 824235530;
                            this.BM(var185, var192, var166, var180, 0.0F, var144, 1.0F, var198);
                            switch (var19) {
                                case 612725680:
                                default:
                                    var19 ^= -968258080;
                                    break;
                                case 1363726256:
                                    var19 ^= -819829115;
                                    break;
                                case 2041483156:
                                    var19 += -1137087036;
                                    var19 &= 1864152245;
                                    var19 -= 1966620478;
                                    var19 ^= -949927834;
                            }
                        }

                        int var145 = var19 + 1;
                        var145 = var19 * var145;
                        var145 &= 1;
                        if (var145 != 0) {
                            break label176;
                        }

                        var145 = var128 + 1;
                        var11 = var6;
                        var13 = var11 + 1L;
                        var13 = var11 * var13;
                        var11 = var13 & 1L;
                        long var205;
                        int var169 = (var205 = var11 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                        if (var169 != 0) {
                            switch (var19) {
                                case -1361447077:
                                default:
                                    var19 ^= 1769736614;
                                    break label173;
                                case 146877936:
                                    var19 ^= 366329457;
                                    break label173;
                                case 1756181684:
                                    var19 += -1138812898;
                                    var19 *= -532336891;
                                    var19 |= -1430327861;
                                    var19 ^= 1348953113;
                                    break label173;
                            }
                        }
                        var19 = switch (var19) {
                            default -> var19 ^ -1880237908;
                            case -1181172939 -> var19 ^ 1206690890;
                            case 1756181684 -> {
                                var19 |= -2116550960;
                                var19 *= -1032121987;
                                var19 ^= 1878325454;
                                var19 |= -1352909281;
                                yield var19 ^ -990143754;
                            }
                        };
                        var128 = var145;
                        var19 &= -1097860536;
                        var19 ^= -895025134;
                        var19 |= 1734331428;
                        var19 ^= 58595325;
                    }
                }
            }

            Integer var107 = var19;
            if (var107 != null) {
                AssertionError var108 = new AssertionError();
                throw var108;
            }
        }

        UnsupportedOperationException var106 = new UnsupportedOperationException();
        throw var106;
    }

    @Override
    public void jG(float var1, float var2, float var3, float var4, float var5, int var6, float var7) {
        label232: {
            label246: {
                int var8 = a;
                var8 ^= 472801346;
                int var10 = System.identityHashCode(this);
                float var11 = var5 * 0.5F;
                float var12 = var4 - var2;
                var12 = Math.abs(var12);
                float var399;
                int var187 = (var399 = var12 - 0.001F) == 0.0F ? 0 : (var399 < 0.0F ? -1 : 1);
                int var13 = var10 + 1;
                var13 = var10 * var13;
                int var14 = var10 + 2;
                var13 *= var14;
                var14 = var10 + 3;
                var13 *= var14;
                var13 &= 7;
                if (var13 == 0) {
                    var8 |= -824601962;
                    var8 ^= -773259164;
                    Integer var208 = var6;
                    if (var208 == null) {
                        break label232;
                    }

                    if (var187 < 0) {
                        var8 <<= 25;
                        var8 &= -803644455;
                        var8 += 1618025915;
                        var8 -= 1871729693;
                        var8 ^= 429875963;
                        Integer var202 = var6;
                        if (var202 == null) {
                            break label232;
                        }

                        var12 = Math.min(var1, var3);
                        float var220 = var2 - var11;
                        Integer var232 = var10;
                        if (var232 != null) {
                            var8 = switch (var8) {
                                default -> var8 ^ -1736160559;
                                case 427797349 -> {
                                    var8 >>= 31;
                                    var8 -= 1671786443;
                                    var8 ^= -1622242120;
                                    yield var8 ^ -1183835054;
                                }
                                case 591934597 -> var8 ^ -1876776769;
                            };
                            long var233 = var6;
                            long var290 = var233 + 1L;
                            var290 = var233 * var290;
                            long var359 = var233 + 2L;
                            var290 *= var359;
                            long var234 = var233 + 3L;
                            var290 *= var234;
                            long var235 = var290 & 7L;
                            long var400;
                            int var236 = (var400 = var235 - 0L) == 0L ? 0 : (var400 < 0L ? -1 : 1);
                            if (var236 == 0) {
                                float var237 = Math.max(var1, var3);
                                float var260 = var2 + var11;
                                boolean var294 = this.O;
                                float var300;
                                if (var294) {
                                    var8 = switch (var8) {
                                        default -> var8 ^ 1101746508;
                                        case -1167851297 -> {
                                            var8 *= -966481797;
                                            var8 ^= 108494866;
                                            var8 += 1424434617;
                                            var8 *= -559787283;
                                            yield var8 ^ -221480868;
                                        }
                                        case -298133501 -> var8 ^ 1179335448;
                                    };
                                    int var295 = var6 + 1;
                                    int var296 = var6 * var295;
                                    int var331 = var6 + 2;
                                    int var297 = var296 * var331;
                                    var331 = var6 + 3;
                                    int var298 = var297 * var331;
                                    int var299 = var298 & 7;
                                    if (var299 != 0) {
                                        break label232;
                                    }

                                    var300 = var11;
                                    var8 |= 201203630;
                                    var8 ^= 637080946;
                                } else {
                                    var8 &= 737148070;
                                    var8 >>>= 4;
                                    var8 ^= 288911485;
                                    int var333 = var6 + 1;
                                    var333 = var6 * var333;
                                    int var360 = var6 + 2;
                                    var333 *= var360;
                                    int var361 = var6 + 3;
                                    var333 *= var361;
                                    var333 &= 7;
                                    if (var333 != 0) {
                                        break label232;
                                    }

                                    var300 = 0.0F;
                                    var8 |= 1414390131;
                                    var8 ^= -1418924604;
                                    var8 ^= 112490031;
                                }

                                Integer var338 = var6;
                                if (var338 != null) {
                                    int var339 = var8 + 784328858;
                                    var339 -= -664221270;
                                    var339 ^= -365910478;
                                    this.BM(var12, var220, var237, var260, var300, var6, var7, var339);
                                    return;
                                }
                            }
                            break label232;
                        }

                        var8 ^= 2003648644;
                        var8 <<= 16;
                        var8 |= -1206270141;
                        var8 ^= -1390658128;
                    } else {
                        var8 ^= -942963636;
                        var8 -= -2043342335;
                        var8 ^= 1028899178;
                        var8 &= 1804571901;
                        var8 ^= 206669835;
                        int var188 = var6 + 1;
                        int var189 = var6 * var188;
                        int var209 = var6 + 2;
                        int var190 = var189 * var209;
                        var209 = var6 + 3;
                        int var191 = var190 * var209;
                        int var192 = var191 & 7;
                        if (var192 != 0) {
                            break label232;
                        }

                        var12 = var3 - var1;
                        var12 = Math.abs(var12);
                        long var211 = var10;
                        long var15 = var211 + 1L;
                        var15 = var211 * var15;
                        long var212 = var15 & 1L;
                        long var401;
                        var209 = (var401 = var212 - 0L) == 0L ? 0 : (var401 < 0L ? -1 : 1);
                        if (var209 == 0) {
                            var8 &= -235580213;
                            var8 -= 499828010;
                            var8 *= 222878485;
                            var8 |= -147492553;
                            var8 ^= -1367225692;
                            Integer var214 = var6;
                            if (var214 == null) {
                                break label232;
                            }

                            float var402;
                            int var195 = (var402 = var12 - 0.001F) == 0.0F ? 0 : (var402 < 0.0F ? -1 : 1);
                            if (var195 < 0) {
                                var8 = switch (var8) {
                                    default -> var8 ^ -218392387;
                                    case 160652588 -> var8 ^ 1788003516;
                                    case 1501478875 -> {
                                        var8 *= 963966605;
                                        var8 &= 900259595;
                                        yield var8 ^ -1123709840;
                                    }
                                };
                                var12 = var1 - var11;
                                float var219 = Math.min(var2, var4);
                                float var231 = var1 + var11;
                                float var259 = Math.max(var2, var4);
                                int var285 = (this.O ? 1 : 0);
                                long var320 = var10;
                                long var384 = var320 + 1L;
                                var384 = var320 * var384;
                                var320 = var384 & 1L;
                                long var403;
                                int var322 = (var403 = var320 - 0L) == 0L ? 0 : (var403 < 0L ? -1 : 1);
                                if (var322 == 0) {
                                    var8 = switch (var8) {
                                        case -1139276996 -> var8 ^ 1705238123;
                                        case -1137864325 -> {
                                            var8 &= -531953451;
                                            var8 >>>= 27;
                                            var8 &= 455369944;
                                            var8 ^= -1614974713;
                                            yield var8 ^ -1613341710;
                                        }
                                        default -> var8 ^ 587026272;
                                    };
                                    var320 = var6;
                                    var384 = var320 + 1L;
                                    var384 = var320 * var384;
                                    long var398 = var320 + 2L;
                                    var384 *= var398;
                                    var320 += 3L;
                                    var384 *= var320;
                                    var320 = var384 & 7L;
                                    long var404;
                                    int var326 = (var404 = var320 - 0L) == 0L ? 0 : (var404 < 0L ? -1 : 1);
                                    if (var326 == 0) {
                                        float var289;
                                        if (var285 != 0) {
                                            var8 -= -62547709;
                                            var8 ^= 858807440;
                                            var8 ^= -362503367;
                                            long var286 = var6;
                                            long var357 = var286 + 1L;
                                            var357 = var286 * var357;
                                            long var287 = var357 & 1L;
                                            long var405;
                                            var285 = (var405 = var287 - 0L) == 0L ? 0 : (var405 < 0L ? -1 : 1);
                                            if (var285 != 0) {
                                                break label232;
                                            }

                                            var289 = var11;
                                            var8 ^= -1712210960;
                                            var8 &= 2006547693;
                                            var8 ^= 14346947;
                                        } else {
                                            var8 = switch (var8) {
                                                default -> var8 ^ 728695844;
                                                case 7023333 -> {
                                                    var8 += 383022064;
                                                    var8 |= -1323264611;
                                                    var8 ^= -382115970;
                                                    yield var8 ^ 1352640601;
                                                }
                                                case 68098741 -> var8 ^ -1785102132;
                                            };
                                            var289 = 0.0F;
                                            var8 &= -1703421108;
                                            var8 += -1275576160;
                                            var8 |= 214075559;
                                            var8 ^= -91146619;
                                        }

                                        Integer var327 = var6;
                                        if (var327 != null) {
                                            int var328 = var8 + 840119880;
                                            int var329 = var328 + -337660333;
                                            int var330 = var329 ^ -668760901;
                                            this.BM(var12, var219, var231, var259, var289, var6, var7, var330);
                                            return;
                                        }
                                    }
                                    break label232;
                                }

                                var8 &= 605462921;
                                var8 += -1795875311;
                                var8 ^= -300128791;
                            } else {
                                var8 = switch (var8) {
                                    case -925964919 -> var8 ^ -297090930;
                                    default -> var8 ^ 1849220447;
                                    case 1501478875 -> {
                                        var8 *= -146139969;
                                        yield var8 ^ 1957635151;
                                    }
                                };
                                var12 = var3 - var1;
                                float var215 = var4 - var2;
                                float var222 = var12 * var12;
                                float var239 = var215 * var215;
                                float var223 = var222 + var239;
                                double var224 = var223;
                                int var16 = var10 + 1;
                                var16 = var10 * var16;
                                int var17 = var10 + 2;
                                var16 *= var17;
                                var17 = var10 + 3;
                                var16 *= var17;
                                var16 &= 7;
                                if (var16 != 0) {
                                    var8 *= -807383547;
                                    var8 += -149062769;
                                    var8 ^= -1471515375;
                                    var8 *= 645552507;
                                    var8 ^= 1830535715;
                                } else {
                                    label245: {
                                        var8 &= 1836622214;
                                        var8 *= -1686231033;
                                        var8 &= -568106870;
                                        var8 &= -679845352;
                                        var8 ^= 369075607;
                                        long var265 = var6;
                                        long var18 = var265 + 1L;
                                        var18 = var265 * var18;
                                        long var20 = var265 + 2L;
                                        var18 *= var20;
                                        long var266 = var265 + 3L;
                                        var18 *= var266;
                                        long var267 = var18 & 7L;
                                        long var406;
                                        var16 = (var406 = var267 - 0L) == 0L ? 0 : (var406 < 0L ? -1 : 1);
                                        if (var16 != 0) {
                                            break label232;
                                        }

                                        double var225 = Math.sqrt(var224);
                                        float var226 = (float)var225;
                                        boolean var240 = this.O;
                                        float var246;
                                        if (var240) {
                                            var8 = switch (var8) {
                                                case -2080406113 -> {
                                                    var8 >>>= 5;
                                                    var8 |= 241107593;
                                                    yield var8 ^ -524064139;
                                                }
                                                default -> var8 ^ 1540032664;
                                                case 2033542958 -> var8 ^ 1350451099;
                                            };
                                            int var241 = var6 + 1;
                                            int var242 = var6 * var241;
                                            var16 = var6 + 2;
                                            int var243 = var242 * var16;
                                            var16 = var6 + 3;
                                            int var244 = var243 * var16;
                                            int var245 = var244 & 7;
                                            if (var245 != 0) {
                                                break label232;
                                            }

                                            var246 = 0.0F;
                                            var8 -= 1386332116;
                                            var8 -= -556138445;
                                            var8 -= -1029290724;
                                            var8 ^= 1941422896;
                                        } else {
                                            var8 += -305158475;
                                            var8 <<= 16;
                                            var8 ^= 392108150;
                                            var16 = var6 + 1;
                                            var16 = var6 * var16;
                                            var17 = var6 + 2;
                                            var16 *= var17;
                                            var17 = var6 + 3;
                                            var16 *= var17;
                                            var16 &= 7;
                                            if (var16 != 0) {
                                                break label232;
                                            }

                                            float var276 = var226 * 0.5F;
                                            var17 = var10 + 1;
                                            var17 = var10 * var17;
                                            var17 &= 1;
                                            if (var17 != 0) {
                                                var8 &= -1235793403;
                                                var8 += 143260897;
                                                var8 ^= 1818820118;
                                                break label245;
                                            }

                                            var8 -= 202938815;
                                            var8 |= 1388031929;
                                            var8 += -1926751558;
                                            var8 *= -188379335;
                                            var8 ^= 1478115149;
                                            long var307 = var6;
                                            long var19 = var307 + 1L;
                                            var19 = var307 * var19;
                                            long var308 = var19 & 1L;
                                            long var407;
                                            var17 = (var407 = var308 - 0L) == 0L ? 0 : (var407 < 0L ? -1 : 1);
                                            if (var17 != 0) {
                                                break label232;
                                            }

                                            var11 = Math.min(var11, var276);
                                            var246 = var11;
                                            var8 *= -1076647111;
                                            var8 ^= -708072103;
                                        }

                                        var12 /= var226;
                                        var12 *= var246;
                                        float var216 = var215 / var226;
                                        var11 = var216 * var246;
                                        float var217 = var1 + var12;
                                        var14 = var8 ^ -1291971490;
                                        var14 ^= 1054625761;
                                        float var218 = this.Hc(var217, var14);
                                        float var229 = var2 + var11;
                                        int var247 = var8 | -311721360;
                                        int var248 = var247 | -2045822099;
                                        int var249 = var248 ^ 245856263;
                                        float var230 = this.t(var229, var249);
                                        var12 = var3 - var12;
                                        int var250 = var8 & -498341544;
                                        int var251 = var250 + 687665872;
                                        int var252 = var251 ^ -1398198806;
                                        var12 = this.Hc(var12, var252);
                                        var11 = var4 - var11;
                                        int var253 = var8 ^ -702312406;
                                        int var254 = var253 * -1687946625;
                                        int var255 = var254 ^ -957880533;
                                        var11 = this.t(var11, var255);
                                        float var256 = this.r;
                                        Integer var277 = var10;
                                        if (var277 != null) {
                                            var8 |= -1586822006;
                                            var8 ^= 1485532168;
                                            float var257 = var5 * var256;
                                            int var278 = var8 * -1071977499;
                                            var278 ^= -677336001;
                                            var278 *= -1734183729;
                                            var278 ^= 1644925838;
                                            var278 = this.GS(var6, var7, var278);
                                            lB var310 = this.vN;
                                            var17 = var310.ordinal();
                                            switch (var17) {
                                                case 0:
                                                    var8 |= 1046341036;
                                                    var8 -= 1828532941;
                                                    var8 -= -2087733344;
                                                    var8 ^= -2104783561;
                                                    Canvas var319 = this.qd;
                                                    float var350 = this.r;
                                                    float var351 = 3.0F * var350;
                                                    float var258 = var257 + var351;
                                                    int var352 = var8 >> 9;
                                                    int var353 = var352 * -1375953669;
                                                    int var354 = var353 * 114709567;
                                                    int var355 = var354 ^ -1437266547;
                                                    var278 = this.FP(var278, var355);
                                                    Paint var284 = Paint.solid(var278);
                                                    float var356 = this.r;
                                                    int var379 = var10 + 1;
                                                    var379 = var10 * var379;
                                                    var10 = var379 & 1;
                                                    if (var10 == 0) {
                                                        var8 &= -997292130;
                                                        var8 += -1209369204;
                                                        var8 ^= 496983026;
                                                        long var381 = var6;
                                                        long var394 = var381 + 1L;
                                                        var394 = var381 * var394;
                                                        long var23 = var381 + 2L;
                                                        var394 *= var23;
                                                        long var382 = var381 + 3L;
                                                        var394 *= var382;
                                                        long var383 = var394 & 7L;
                                                        long var410;
                                                        var10 = (var410 = var383 - 0L) == 0L ? 0 : (var410 < 0L ? -1 : 1);
                                                        if (var10 != 0) {
                                                            break label232;
                                                        }

                                                        float var177 = 2.5F * var356;
                                                        Paint var178 = var284.soft(var177);
                                                        var319.line(var218, var230, var12, var11, var258, var178);
                                                        var8 *= 706699101;
                                                        var8 ^= 934946636;
                                                        break label246;
                                                    }

                                                    var8 |= 1054865983;
                                                    var8 ^= -1049796121;
                                                    var8 ^= 83628145;
                                                    var8 *= 1957801855;
                                                    var8 ^= -1296608924;
                                                    break;
                                                case 1:
                                                    var8 &= 560347030;
                                                    var8 ^= 324481303;
                                                    Integer var317 = var6;
                                                    if (var317 == null) {
                                                        break label232;
                                                    }

                                                    Canvas var318 = this.qd;
                                                    float var346 = this.oh;
                                                    float var347 = var346 * 2.0F;
                                                    float var367 = this.r;
                                                    float var348 = var347 * var367;
                                                    int var368 = var10 + 1;
                                                    int var369 = var10 * var368;
                                                    int var390 = var10 + 2;
                                                    int var370 = var369 * var390;
                                                    int var391 = var10 + 3;
                                                    int var371 = var370 * var391;
                                                    int var372 = var371 & 7;
                                                    if (var372 == 0) {
                                                        var8 ^= 802654727;
                                                        var8 += -141709914;
                                                        var8 ^= -683142916;
                                                        long var373 = var6;
                                                        long var392 = var373 + 1L;
                                                        var392 = var373 * var392;
                                                        long var374 = var392 & 1L;
                                                        long var409;
                                                        int var375 = (var409 = var374 - 0L) == 0L ? 0 : (var409 < 0L ? -1 : 1);
                                                        if (var375 != 0) {
                                                            break label232;
                                                        }

                                                        float var349 = var257 + var348;
                                                        int var376 = var8 >>> 9;
                                                        int var377 = var376 ^ -895737555;
                                                        int var378 = this.n(var7, var377);
                                                        var318.line(var218, var230, var12, var11, var349, var378);
                                                        var8 |= -926331801;
                                                        var8 &= -865498496;
                                                        var8 &= -454184635;
                                                        var8 ^= 1471227014;
                                                        break label246;
                                                    }

                                                    var8 -= -144686451;
                                                    var8 -= -1015446277;
                                                    var8 += 622402770;
                                                    var8 ^= -896033752;
                                                    break;
                                                case 2:
                                                    var8 >>= 4;
                                                    var8 >>>= 6;
                                                    var8 ^= -1641985638;
                                                    long var312 = var6;
                                                    long var363 = var312 + 1L;
                                                    var363 = var312 * var363;
                                                    long var21 = var312 + 2L;
                                                    var363 *= var21;
                                                    long var313 = var312 + 3L;
                                                    var363 *= var313;
                                                    long var314 = var363 & 7L;
                                                    long var408;
                                                    var17 = (var408 = var314 - 0L) == 0L ? 0 : (var408 < 0L ? -1 : 1);
                                                    if (var17 != 0) {
                                                        break label232;
                                                    }

                                                    Canvas var316 = this.qd;
                                                    Integer var345 = var10;
                                                    if (var345 != null) {
                                                        var8 |= -398740039;
                                                        var8 ^= -223328520;
                                                        var8 ^= 337913928;
                                                        var316.line(var218, var230, var12, var11, var257, var278);
                                                        var8 <<= 24;
                                                        var8 |= -2055168415;
                                                        var8 &= 994545311;
                                                        var8 -= -880628775;
                                                        var8 ^= -1465530706;
                                                        break label246;
                                                    }

                                                    var8 -= 2096968528;
                                                    var8 ^= 1983522737;
                                                    break;
                                                default:
                                                    var8 <<= 10;
                                                    var8 -= 1458723154;
                                                    var8 ^= -1369971160;
                                                    break label246;
                                            }
                                        } else {
                                            var8 -= -1308993131;
                                            var8 ^= -2127099901;
                                        }
                                    }
                                }
                            }
                        } else {
                            var8 -= -2047831848;
                            var8 -= -308984857;
                            var8 ^= -1565143797;
                        }
                    }
                } else {
                    var8 *= -1043400035;
                    var8 ^= 1217821932;
                }

                long var154 = var6;
                long var180 = var154 + 1L;
                long var181 = var154 * var180;
                long var155 = var181 & 1L;
                long var411;
                var8 = (var411 = var155 - 0L) == 0L ? 0 : (var411 < 0L ? -1 : 1);
                if (var8 == 0) {
                    AssertionError var157 = new AssertionError();
                    throw var157;
                }
                break label232;
            }

            Integer var179 = var6;
            if (var179 != null) {
                return;
            }
        }

        IllegalStateException var174 = new IllegalStateException();
        throw var174;
    }

    @Override
    public void a(float var1, float var2, float var3, int var4, float var5) {
        label80: {
            int var6 = a;
            var6 ^= -2005987278;
            int var8 = System.identityHashCode(this);
            float var9 = this.r;
            var9 = var3 * var9;
            int var10 = var6 * 1999369453;
            var10 &= 1232250767;
            var10 &= -2048563057;
            var10 ^= 82777909;
            float var88 = this.Hc(var1, var10);
            int var11 = var6 * 1650928679;
            var11 ^= -1447046041;
            float var90 = this.t(var2, var11);
            int var12 = var6 ^ -1538236121;
            var12 ^= -274335498;
            var12 = this.GS(var4, var5, var12);
            lB var13 = this.vN;
            int var14 = var8 + 1;
            var14 = var8 * var14;
            var14 &= 1;
            if (var14 != 0) {
                var6 &= 293416606;
                var6 -= 567631146;
                var6 ^= 895589741;
            } else {
                label82: {
                    var6 -= -1369557705;
                    var6 >>= 10;
                    var6 ^= 1694539039;
                    var6 ^= -270578490;
                    Integer var107 = var4;
                    if (var107 == null) {
                        break label80;
                    }

                    int var95 = var13.ordinal();
                    switch (var95) {
                        case 0:
                            var6 = switch (var6) {
                                default -> var6 ^ 854268529;
                                case -1152094764 -> var6 ^ -220315574;
                                case 1966684869 -> {
                                    var6 &= -1911408355;
                                    var6 |= -788376434;
                                    var6 ^= -83910304;
                                    var6 -= -1651362054;
                                    yield var6 ^ 1441530353;
                                }
                            };
                            Canvas var104 = this.qd;
                            float var117 = this.r;
                            float var118 = 1.5F * var117;
                            var9 += var118;
                            int var119 = var6 + 89377783;
                            var119 ^= 2009542801;
                            var12 = this.FP(var12, var119);
                            Paint var94 = Paint.solid(var12);
                            float var121 = this.r;
                            int var126 = var8 + 1;
                            var126 = var8 * var126;
                            var8 = var126 & 1;
                            if (var8 != 0) {
                                switch (var6) {
                                    case -1700211838:
                                    default:
                                        var6 ^= -400427776;
                                        break label82;
                                    case -944265468:
                                        var6 |= 2064186761;
                                        var6 *= 121494015;
                                        var6 |= 29081150;
                                        var6 ^= -916690434;
                                        var6 ^= 502301084;
                                        break label82;
                                    case -163308657:
                                        var6 ^= -293606740;
                                        break label82;
                                }
                            }

                            var6 *= -844051591;
                            var6 *= 1455052789;
                            var6 ^= 901696998;
                            float var80 = 2.5F * var121;
                            Paint var81 = var94.soft(var80);
                            var104.circle(var88, var90, var9, var81);
                            var6 ^= -1208281286;
                            var6 ^= 1615649265;
                            break;
                        case 1:
                            var6 -= -1016281450;
                            var6 += 329723450;
                            var6 &= 602191098;
                            var6 ^= 401032340;
                            int var100 = var4 + 1;
                            int var101 = var4 * var100;
                            int var102 = var101 & 1;
                            if (var102 != 0) {
                                break label80;
                            }

                            Canvas var103 = this.qd;
                            float var114 = this.oh;
                            float var15 = this.r;
                            float var115 = var114 * var15;
                            float var116 = var9 + var115;
                            int var122 = var6 | 898786761;
                            int var123 = var122 >>> 16;
                            int var124 = var123 ^ -889386090;
                            int var125 = this.n(var5, var124);
                            long var131 = var8;
                            long var18 = var131 + 1L;
                            var18 = var131 * var18;
                            var131 = var18 & 1L;
                            long var137;
                            int var133 = (var137 = var131 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                            if (var133 != 0) {
                                var6 |= 1033814115;
                                var6 ^= -724782366;
                                break label82;
                            }
                            var6 = switch (var6) {
                                case 378004732 -> {
                                    var6 += 1325680033;
                                    var6 &= 648689857;
                                    var6 ^= 899500840;
                                    yield var6 ^ 1731872103;
                                }
                                default -> var6 ^ 141774098;
                                case 1228615646 -> var6 ^ -896068812;
                            };
                            var103.circle(var88, var90, var116, var125);
                            var6 += 85567153;
                            var6 |= 359626685;
                            var6 ^= -926032154;
                            break;
                        case 2:
                            var6 = switch (var6) {
                                default -> var6 ^ -1617891741;
                                case -507119957 -> var6 ^ -1112651526;
                                case 1966684869 -> {
                                    var6 *= -566060199;
                                    yield var6 ^ 333460778;
                                }
                            };
                            int var96 = var4 + 1;
                            int var97 = var4 * var96;
                            int var98 = var97 & 1;
                            if (var98 != 0) {
                                break label80;
                            }

                            Canvas var99 = this.qd;
                            long var108 = var8;
                            long var16 = var108 + 1L;
                            var16 = var108 * var16;
                            long var109 = var16 & 1L;
                            long var135;
                            int var110 = (var135 = var109 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                            if (var110 != 0) {
                                var6 >>>= 11;
                                var6 &= -230288000;
                                var6 ^= -1027257435;
                                var6 *= 2093457477;
                                var6 ^= -1867410716;
                                break label82;
                            }

                            var6 |= 980100102;
                            var6 -= 139880612;
                            var6 &= 1116096929;
                            var6 ^= 2036156947;
                            var6 ^= 2101962761;
                            long var111 = var4;
                            var16 = var111 + 1L;
                            var16 = var111 * var16;
                            long var112 = var16 & 1L;
                            long var136;
                            var110 = (var136 = var112 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                            if (var110 != 0) {
                                break label80;
                            }

                            var99.circle(var88, var90, var9, var12);
                            var6 -= -138504661;
                            var6 += 2025876691;
                            var6 ^= 1882465146;
                            break;
                        default:
                            var6 >>= 3;
                            var6 ^= -1190853055;
                    }

                    var6 = var4 + 1;
                    var6 = var4 * var6;
                    var6 &= 1;
                    if (var6 == 0) {
                        return;
                    }
                    break label80;
                }
            }

            AssertionError var82 = new AssertionError();
            throw var82;
        }

        UnsupportedOperationException var78 = new UnsupportedOperationException();
        throw var78;
    }

    @Override
    public void ag(float var1, float var2, float var3, float var4, float var5, float var6, int var7, float var8) {
        label72: {
            int var9 = a;
            var9 ^= 501541205;
            int var11 = System.identityHashCode(this);
            float var12 = this.r;
            var12 = var3 * var12;
            float var13 = this.r;
            var13 = var4 * var13;
            int var14 = var9 * -721672847;
            var14 -= 208654644;
            var14 &= -391908920;
            var14 |= 668935250;
            var14 ^= -1573850528;
            float var97 = this.Hc(var1, var14);
            int var15 = var9 & -1559306720;
            var15 += -191406442;
            var15 ^= -1763759796;
            float var100 = this.t(var2, var15);
            int var16 = var9 ^ -1160320513;
            var16 &= 1042838901;
            var16 <<= 14;
            var16 &= 1887461114;
            var16 ^= 33517898;
            var16 = this.GS(var7, var8, var16);
            Integer var17 = var11;
            if (var17 == null) {
                var9 |= 2065112951;
                var9 ^= 538145814;
                var9 <<= 24;
                var9 ^= 499978051;
            } else {
                var9 >>= 15;
                var9 *= -36096781;
                var9 *= -769954969;
                var9 &= 2089691794;
                var9 ^= 1913507313;
                lB var107 = this.vN;
                int var108 = var107.ordinal();
                switch (var108) {
                    case 0:
                        var9 ^= 1977850728;
                        var9 *= 1978416167;
                        var9 ^= 767716992;
                        long var115 = var7;
                        long var148 = var115 + 1L;
                        var148 = var115 * var148;
                        long var116 = var148 & 1L;
                        long var156;
                        var108 = (var156 = var116 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                        if (var108 != 0) {
                            break label72;
                        }

                        Canvas var118 = this.qd;
                        float var123 = this.r;
                        var123 = 3.0F * var123;
                        var13 += var123;
                        int var125 = var9 & -551201345;
                        int var126 = var125 ^ -1091762441;
                        var16 = this.FP(var16, var126);
                        long var127 = var11;
                        long var151 = var127 + 1L;
                        var151 = var127 * var151;
                        long var22 = var127 + 2L;
                        var151 *= var22;
                        long var128 = var127 + 3L;
                        var151 *= var128;
                        long var129 = var151 & 7L;
                        long var157;
                        var11 = (var157 = var129 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                        if (var11 == 0) {
                            var9 >>= 14;
                            var9 += -1108093802;
                            var9 |= -1213623189;
                            var9 |= -1682843431;
                            var9 ^= -167419224;
                            Paint var84 = Paint.solid(var16);
                            float var88 = this.r;
                            float var89 = 2.5F * var88;
                            var84 = var84.soft(var89);
                            var118.arc(var97, var100, var12, var13, var5, var6, var84);
                            switch (var9) {
                                case -1776837714:
                                default:
                                    var9 ^= 991091647;
                                    return;
                                case 509725363:
                                    var9 ^= -1428049911;
                                    return;
                                case 1241423191:
                                    var9 ^= -1932315467;
                                    var9 ^= 1200251821;
                                    var9 ^= 1577395595;
                                    var9 ^= 874303985;
                                    return;
                            }
                        }

                        var9 *= -530647941;
                        var9 &= 1834147400;
                        var9 -= -1235202168;
                        var9 += -838144455;
                        var9 ^= -865601606;
                        break;
                    case 1:
                        var9 = switch (var9) {
                            case -1637448803 -> var9 ^ 1389952627;
                            default -> var9 ^ 792713769;
                            case 1048700275 -> {
                                var9 -= 1483852677;
                                yield var9 ^ -1537732415;
                            }
                        };
                        long var111 = var7;
                        long var137 = var111 + 1L;
                        var137 = var111 * var137;
                        long var112 = var137 & 1L;
                        long var158;
                        var108 = (var158 = var112 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                        if (var108 != 0) {
                            break label72;
                        }

                        Canvas var114 = this.qd;
                        float var119 = this.oh;
                        var119 *= 2.0F;
                        var137 = var11;
                        long var21 = var137 + 1L;
                        var21 = var137 * var21;
                        var137 = var21 & 1L;
                        long var159;
                        int var141 = (var159 = var137 - 0L) == 0L ? 0 : (var159 < 0L ? -1 : 1);
                        if (var141 == 0) {
                            var9 ^= 1641252139;
                            var9 <<= 21;
                            var9 += -746330252;
                            var9 += -1457113763;
                            var9 ^= -1409994443;
                            Integer var142 = var7;
                            if (var142 != null) {
                                float var143 = this.r;
                                var119 *= var143;
                                var119 = var13 + var119;
                                int var144 = var9 | -2113466829;
                                int var145 = var144 ^ 471995382;
                                int var146 = this.n(var8, var145);
                                Paint var147 = Paint.solid(var146);
                                var114.arc(var97, var100, var12, var119, var5, var6, var147);
                                var9 <<= 5;
                                var9 -= 1697912130;
                                var9 *= -2090633457;
                                var9 ^= 413048983;
                                return;
                            }
                            break label72;
                        }

                        var9 &= -991627394;
                        var9 ^= -1265824147;
                        break;
                    case 2:
                        var9 += -1560506528;
                        var9 *= -1849494831;
                        var9 ^= -1200926181;
                        var9 ^= 2084126939;
                        Integer var109 = var7;
                        if (var109 == null) {
                            break label72;
                        }

                        Canvas var110 = this.qd;
                        Paint var18 = Paint.solid(var16);
                        int var19 = var11 + 1;
                        var19 = var11 * var19;
                        var19 &= 1;
                        if (var19 == 0) {
                            var9 += -157348810;
                            var9 >>= 24;
                            var9 ^= 1291667493;
                            var19 = var7 + 1;
                            var19 = var7 * var19;
                            int var20 = var7 + 2;
                            var19 *= var20;
                            var20 = var7 + 3;
                            var19 *= var20;
                            var19 &= 7;
                            if (var19 == 0) {
                                var110.arc(var97, var100, var12, var13, var5, var6, var18);
                                var9 ^= 1728206600;
                                var9 *= -852017635;
                                var9 ^= -1061679220;
                                return;
                            }
                            break label72;
                        }

                        var9 -= 1692483813;
                        var9 ^= -267219747;
                        break;
                    default:
                        var9 *= -803420643;
                        var9 -= -1970793991;
                        var9 &= -1744123429;
                        var9 &= -1176279043;
                        var9 ^= 1623096893;
                        return;
                }
            }

            Integer var10 = var7;
            if (var10 != null) {
                IllegalArgumentException var83 = new IllegalArgumentException();
                throw var83;
            }
        }

        IllegalStateException var86 = new IllegalStateException();
        throw var86;
    }

    private void BM(float var1, float var2, float var3, float var4, float var5, int var6, float var7, int var8) {
        label276: {
            label293: {
                int var11 = System.identityHashCode(this);
                int var12 = var8 << 7;
                var12 -= -1536696438;
                var12 ^= -1757353908;
                float var219 = this.Hc(var1, var12);
                int var13 = var8 - -687314297;
                var13 >>= 8;
                var13 *= 1258106127;
                var13 += -586924423;
                var13 ^= 1550139303;
                float var220 = this.Ap(var219, var13);
                var13 = var8 * 798415673;
                var13 ^= 1107078324;
                float var229 = this.t(var2, var13);
                int var14 = var8 & -2089273826;
                var14 ^= -2014916675;
                float var230 = this.Ap(var229, var14);
                var14 = var8 ^ -1768666231;
                var14 ^= 689271565;
                float var236 = this.Hc(var3, var14);
                int var15 = var8 + 314035782;
                var15 <<= 19;
                var15 -= -1410913183;
                var15 *= 1143653159;
                var15 ^= -1535200358;
                float var237 = this.Ap(var236, var15);
                var15 = var8 & -1066814206;
                var15 ^= 1629528824;
                float var252 = this.t(var4, var15);
                Integer var16 = var11;
                label273:
                if (var16 != null) {
                    int var32 = var8 + -1286270266;
                    var32 ^= -1322221673;
                    var16 = var6;
                    if (var16 == null) {
                        break label276;
                    }

                    int var264 = var32 | 1160716184;
                    var264 <<= 2;
                    var264 |= 1705382614;
                    var264 ^= 1320069256;
                    var264 ^= 1021231061;
                    float var253 = this.Ap(var252, var264);
                    float var269 = this.m;
                    float var270 = 1.0F / var269;
                    float var17 = var237 - var220;
                    float var438;
                    int var275 = (var438 = var17 - var270) == 0.0F ? 0 : (var438 < 0.0F ? -1 : 1);
                    if (var275 < 0) {
                        var32 &= -667086393;
                        var32 |= 1467566354;
                        var32 += -676944322;
                        var32 += -1806499551;
                        var32 ^= -1510266545;
                        Integer var276 = var6;
                        if (var276 == null) {
                            break label276;
                        }

                        var17 = var220 + var270;
                        long var18 = var11;
                        long var20 = var18 + 1L;
                        var20 = var18 * var20;
                        long var22 = var18 + 2L;
                        var20 *= var22;
                        var18 += 3L;
                        var20 *= var18;
                        var18 = var20 & 7L;
                        long var439;
                        int var282 = (var439 = var18 - 0L) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                        if (var282 != 0) {
                            var32 |= -381125697;
                            var32 *= 1959770497;
                            var32 |= -1962120497;
                            var32 ^= -1261337802;
                            break label273;
                        }

                        var32 &= 786451288;
                        var32 >>= 23;
                        var32 *= -1088856525;
                        var32 |= -1032961762;
                        var32 ^= 1243056157;
                        var18 = var6;
                        var20 = var18 + 1L;
                        var20 = var18 * var20;
                        var18 = var20 & 1L;
                        long var440;
                        int var285 = (var440 = var18 - 0L) == 0L ? 0 : (var440 < 0L ? -1 : 1);
                        if (var285 != 0) {
                            break label276;
                        }

                        var17 = var17;
                        var32 *= -1379879769;
                        var32 -= -1657699921;
                        var32 ^= -103867095;
                    } else {
                        var32 |= 1527964589;
                        var32 ^= -188215298;
                        var17 = var237;
                        var32 -= 1648831944;
                        var32 |= 611240117;
                        var32 ^= 2107811275;
                    }

                    long var286 = var6;
                    long var340 = var286 + 1L;
                    var340 = var286 * var340;
                    var286 = var340 & 1L;
                    long var441;
                    var14 = (var441 = var286 - 0L) == 0L ? 0 : (var441 < 0L ? -1 : 1);
                    if (var14 != 0) {
                        break label276;
                    }

                    float var239 = var253 - var230;
                    Integer var288 = var11;
                    label264:
                    if (var288 != null) {
                        var32 >>>= 28;
                        var32 *= 1520407815;
                        var32 &= 1882622766;
                        var32 ^= -1110268246;
                        Integer var289 = var6;
                        if (var289 == null) {
                            break label276;
                        }

                        float var442;
                        var14 = (var442 = var239 - var270) == 0.0F ? 0 : (var442 < 0.0F ? -1 : 1);
                        float var243;
                        if (var14 < 0) {
                            var32 = switch (var32) {
                                case -1647923324 -> {
                                    var32 ^= 357890579;
                                    yield var32 ^ 52146105;
                                }
                                case -1560095348 -> var32 ^ 474395051;
                                default -> var32 ^ -1676907123;
                            };
                            Integer var241 = var6;
                            if (var241 == null) {
                                break label276;
                            }

                            float var242 = var230 + var270;
                            Integer var290 = var11;
                            if (var290 == null) {
                                var32 >>>= 24;
                                var32 -= 2097857213;
                                var32 >>= 17;
                                var32 ^= -1866323789;
                                break label264;
                            }

                            var32 &= 513745862;
                            var32 ^= -835666421;
                            var32 ^= 582131916;
                            int var291 = var6 + 1;
                            int var292 = var6 * var291;
                            int var19 = var6 + 2;
                            int var293 = var292 * var19;
                            var19 = var6 + 3;
                            int var294 = var293 * var19;
                            int var295 = var294 & 7;
                            if (var295 != 0) {
                                break label276;
                            }

                            var243 = var242;
                            var32 >>= 5;
                            var32 -= -1700337023;
                            var32 |= -1755703648;
                            var32 += 656020057;
                            var32 ^= -1451416220;
                        } else {
                            var32 = switch (var32) {
                                case -1824250251 -> var32 ^ 774814994;
                                case -1647923324 -> {
                                    var32 &= 1640145827;
                                    var32 += 49679039;
                                    yield var32 ^ 1243605854;
                                }
                                default -> var32 ^ 1814254627;
                            };
                            Integer var296 = var6;
                            if (var296 == null) {
                                break label276;
                            }

                            var243 = var253;
                            var32 -= -1011493467;
                            var32 <<= 23;
                            var32 ^= 1770567514;
                        }

                        var286 = var6;
                        var340 = var286 + 1L;
                        var340 = var286 * var340;
                        long var385 = var286 + 2L;
                        var340 *= var385;
                        var286 += 3L;
                        var340 *= var286;
                        var286 = var340 & 7L;
                        long var443;
                        var15 = (var443 = var286 - 0L) == 0L ? 0 : (var443 < 0L ? -1 : 1);
                        if (var15 != 0) {
                            break label276;
                        }

                        float var255 = this.r;
                        Integer var300 = var11;
                        if (var300 != null) {
                            var32 |= -1402720831;
                            var32 *= 2106986743;
                            var32 |= -1326911403;
                            var32 *= -170653147;
                            var32 ^= 1001443312;
                            Integer var301 = var6;
                            if (var301 == null) {
                                break label276;
                            }

                            float var256 = var5 * var255;
                            int var302 = var32 | 1656744132;
                            int var303 = var302 << 30;
                            int var304 = var303 * 1576927355;
                            int var305 = var304 >> 26;
                            int var306 = var305 ^ -33501510;
                            int var307 = this.GS(var6, var7, var306);
                            lB var309 = this.vN;
                            int var310 = var309.ordinal();
                            label253:
                            switch (var310) {
                                case 0:
                                    var32 *= -1612424207;
                                    var32 >>>= 14;
                                    var32 &= -825942410;
                                    var32 |= 1719764494;
                                    var32 ^= 1010847035;
                                    Integer var331 = var6;
                                    if (var331 == null) {
                                        break label276;
                                    }

                                    float var332 = this.r;
                                    float var333 = 1.5F * var332;
                                    Canvas var334 = this.qd;
                                    int var368 = var11 + 1;
                                    int var369 = var11 * var368;
                                    var11 = var369 & 1;
                                    if (var11 == 0) {
                                        var32 = switch (var32) {
                                            case -1028485717 -> var32 ^ 1459225979;
                                            default -> var32 ^ 965467441;
                                            case 1522652005 -> {
                                                var32 >>>= 6;
                                                var32 += 1330115123;
                                                yield var32 ^ -1149648168;
                                            }
                                        };
                                        Integer var214 = var6;
                                        if (var214 == null) {
                                            break label276;
                                        }

                                        float var215 = var220 - var333;
                                        float var370 = var230 - var333;
                                        float var221 = var17 - var220;
                                        var17 = 2.0F * var333;
                                        float var222 = var221 + var17;
                                        float var231 = var243 - var230;
                                        float var244 = 2.0F * var333;
                                        float var232 = var231 + var244;
                                        float var245 = var256 + var333;
                                        var15 = var32 - 1682549567;
                                        var15 &= -1507507918;
                                        var15 ^= 1020084858;
                                        var15 = this.FP(var307, var15);
                                        Paint var261 = Paint.solid(var15);
                                        float var273 = this.r;
                                        float var274 = 2.5F * var273;
                                        Paint var262 = var261.soft(var274);
                                        var334.roundRect(var215, var370, var222, var232, var245, var262);
                                        var32 ^= 1151659845;
                                        var32 &= -645058646;
                                        var32 |= -1869181887;
                                        var32 ^= 1662021501;
                                        break label293;
                                    }

                                    var32 -= 1889764578;
                                    var32 &= 549929978;
                                    var32 -= 812551220;
                                    var32 -= -233245461;
                                    var32 ^= -1841092438;
                                    break;
                                case 1:
                                    var32 |= 1687665024;
                                    var32 ^= -1730754349;
                                    boolean var316 = this.Lv;
                                    Integer var351 = var11;
                                    if (var351 != null) {
                                        var32 |= 2108233771;
                                        var32 >>>= 8;
                                        var32 -= 1916234149;
                                        var32 *= -1875942301;
                                        var32 ^= -1154592736;
                                        int var352 = var6 + 1;
                                        int var353 = var6 * var352;
                                        int var375 = var6 + 2;
                                        int var354 = var353 * var375;
                                        var375 = var6 + 3;
                                        int var355 = var354 * var375;
                                        int var356 = var355 & 7;
                                        if (var356 != 0) {
                                            break label276;
                                        }

                                        float var323;
                                        if (var316) {
                                            var32 ^= -656974986;
                                            var32 += 2050621487;
                                            var32 ^= 545561040;
                                            float var317 = this.oh;
                                            float var357 = this.r;
                                            float var318 = var317 * var357;
                                            float var358 = this.m;
                                            long var377 = var11;
                                            long var397 = var377 + 1L;
                                            var397 = var377 * var397;
                                            long var378 = var397 & 1L;
                                            long var446;
                                            var375 = (var446 = var378 - 0L) == 0L ? 0 : (var446 < 0L ? -1 : 1);
                                            if (var375 != 0) {
                                                switch (var32) {
                                                    case -2004422397:
                                                    default:
                                                        var32 ^= 1560784286;
                                                        break label253;
                                                    case 466511133:
                                                        var32 >>>= 21;
                                                        var32 ^= 1866328343;
                                                        break label253;
                                                    case 937671219:
                                                        var32 ^= -295037081;
                                                        break label253;
                                                }
                                            }
                                            var32 = switch (var32) {
                                                case -835775302 -> var32 ^ 1169698402;
                                                default -> var32 ^ -313082577;
                                                case 466511133 -> {
                                                    var32 -= -2061202637;
                                                    var32 -= 1608751391;
                                                    yield var32 ^ 2077798889;
                                                }
                                            };
                                            Integer var380 = var6;
                                            if (var380 == null) {
                                                break label276;
                                            }

                                            float var319 = var318 * var358;
                                            int var320 = Math.round(var319);
                                            float var321 = var320;
                                            float var359 = this.m;
                                            float var322 = var321 / var359;
                                            var323 = var322;
                                            var32 &= -1337022957;
                                            var32 |= -2140321934;
                                            var32 ^= 1552269095;
                                            var32 ^= 1010529357;
                                            var32 ^= -681300788;
                                        } else {
                                            var32 -= 1574977402;
                                            var32 *= 182671709;
                                            var32 ^= 1797115337;
                                            int var360 = var6 + 1;
                                            int var361 = var6 * var360;
                                            var375 = var6 + 2;
                                            int var362 = var361 * var375;
                                            var375 = var6 + 3;
                                            int var363 = var362 * var375;
                                            int var364 = var363 & 7;
                                            if (var364 != 0) {
                                                break label276;
                                            }

                                            float var365 = this.oh;
                                            float var383 = this.r;
                                            var385 = var11;
                                            long var24 = var385 + 1L;
                                            var24 = var385 * var24;
                                            long var26 = var385 + 2L;
                                            var24 *= var26;
                                            var385 += 3L;
                                            var24 *= var385;
                                            var385 = var24 & 7L;
                                            long var447;
                                            int var391 = (var447 = var385 - 0L) == 0L ? 0 : (var447 < 0L ? -1 : 1);
                                            if (var391 != 0) {
                                                var32 *= 430453681;
                                                var32 ^= -848417586;
                                                var32 |= 1122819180;
                                                var32 <<= 6;
                                                var32 ^= -1874660727;
                                                break;
                                            }

                                            var32 *= 281751059;
                                            var32 -= -1991379995;
                                            var32 += -1941950117;
                                            var32 &= -15456642;
                                            var32 ^= 1120512558;
                                            var385 = var6;
                                            var24 = var385 + 1L;
                                            var24 = var385 * var24;
                                            var385 = var24 & 1L;
                                            long var448;
                                            int var394 = (var448 = var385 - 0L) == 0L ? 0 : (var448 < 0L ? -1 : 1);
                                            if (var394 != 0) {
                                                break label276;
                                            }

                                            float var366 = var365 * var383;
                                            var323 = var366;
                                            var32 |= 1872920417;
                                            var32 &= -68069675;
                                            var32 |= 1938168570;
                                            var32 *= 1297106017;
                                            var32 ^= -1491879349;
                                        }

                                        float var271 = Math.max(var270, var323);
                                        int var324 = var11 + 1;
                                        int var325 = var11 * var324;
                                        int var326 = var325 & 1;
                                        if (var326 == 0) {
                                            var32 &= 892979182;
                                            var32 |= 1030145951;
                                            var32 ^= 956692531;
                                            int var327 = var6 + 1;
                                            int var328 = var6 * var327;
                                            int var329 = var328 & 1;
                                            if (var329 != 0) {
                                                break label276;
                                            }

                                            Canvas var330 = this.qd;
                                            float var367 = var220 - var271;
                                            float var384 = var230 - var271;
                                            float var395 = var17 - var220;
                                            float var399 = 2.0F * var271;
                                            float var396 = var395 + var399;
                                            var399 = var243 - var230;
                                            float var407 = 2.0F * var271;
                                            var399 += var407;
                                            float var449;
                                            int var408 = (var449 = var256 - 0.0F) == 0.0F ? 0 : (var449 < 0.0F ? -1 : 1);
                                            if (var408 > 0) {
                                                var32 = switch (var32) {
                                                    case 74596332 -> {
                                                        var32 ^= 1578132057;
                                                        yield var32 ^ 533450212;
                                                    }
                                                    default -> var32 ^ -2086368536;
                                                    case 1528831533 -> var32 ^ 109588039;
                                                };
                                                var407 = var256 + var271;
                                                int var25 = var11 + 1;
                                                var25 = var11 * var25;
                                                var25 &= 1;
                                                if (var25 != 0) {
                                                    switch (var32) {
                                                        case -1719724791:
                                                        default:
                                                            var32 ^= 1012890515;
                                                            break label253;
                                                        case -97919694:
                                                            var32 ^= 189028395;
                                                            break label253;
                                                        case 1168740433:
                                                            var32 ^= -1073432251;
                                                            var32 -= 1653643649;
                                                            var32 <<= 31;
                                                            var32 *= 482516995;
                                                            var32 ^= -281155127;
                                                            break label253;
                                                    }
                                                }
                                                var32 = switch (var32) {
                                                    case -1944959063 -> var32 ^ 583174530;
                                                    case 1168740433 -> {
                                                        var32 <<= 7;
                                                        var32 &= 1579571294;
                                                        var32 -= 1692585216;
                                                        yield var32 ^ 1555291592;
                                                    }
                                                    default -> var32 ^ -1765506714;
                                                };
                                                Integer var413 = var6;
                                                if (var413 == null) {
                                                    break label276;
                                                }

                                                var407 = var407;
                                                var32 |= -2080794932;
                                                var32 -= -1842463931;
                                                var32 += -842978596;
                                                var32 += -545029288;
                                                var32 ^= -1311303455;
                                            } else {
                                                var32 = switch (var32) {
                                                    default -> var32 ^ 1366625521;
                                                    case 74596332 -> {
                                                        var32 |= 614215096;
                                                        var32 >>= 13;
                                                        var32 ^= -1504693865;
                                                        yield var32 ^ -1256323141;
                                                    }
                                                    case 1887325162 -> var32 ^ -1100036473;
                                                };
                                                int var414 = var6 + 1;
                                                var414 = var6 * var414;
                                                var414 &= 1;
                                                if (var414 != 0) {
                                                    break label276;
                                                }

                                                var407 = 0.0F;
                                                var32 |= 817155845;
                                                var32 &= -1931333105;
                                                var32 *= -1945248227;
                                                var32 ^= 1429020707;
                                            }

                                            long var417 = var6;
                                            long var27 = var417 + 1L;
                                            var27 = var417 * var27;
                                            var417 = var27 & 1L;
                                            long var450;
                                            int var419 = (var450 = var417 - 0L) == 0L ? 0 : (var450 < 0L ? -1 : 1);
                                            if (var419 != 0) {
                                                break label276;
                                            }

                                            int var420 = var32 >>> 6;
                                            int var421 = var420 ^ -888784444;
                                            int var422 = this.n(var7, var421);
                                            int var423 = var11 + 1;
                                            var423 = var11 * var423;
                                            int var434 = var11 + 2;
                                            var423 *= var434;
                                            int var435 = var11 + 3;
                                            var423 *= var435;
                                            var423 &= 7;
                                            if (var423 == 0) {
                                                var32 = switch (var32) {
                                                    case 498672759 -> var32 ^ 1856449010;
                                                    default -> var32 ^ 767131237;
                                                    case 2126606682 -> {
                                                        var32 |= -578229094;
                                                        yield var32 ^ 287339647;
                                                    }
                                                };
                                                var423 = var6 + 1;
                                                var423 = var6 * var423;
                                                int var436 = var6 + 2;
                                                var423 *= var436;
                                                int var437 = var6 + 3;
                                                var423 *= var437;
                                                var423 &= 7;
                                                if (var423 != 0) {
                                                    break label276;
                                                }

                                                var330.roundRect(var367, var384, var396, var399, var407, var422);
                                                var32 -= -101392786;
                                                var32 ^= 1584839897;
                                                var32 ^= 1343091930;
                                                break label293;
                                            }

                                            var32 -= -918460216;
                                            var32 ^= -625090213;
                                            break;
                                        }

                                        var32 *= 1895995465;
                                        var32 ^= 392205172;
                                        var32 += -1404865669;
                                        var32 ^= -52761678;
                                        break;
                                    }

                                    var32 >>>= 5;
                                    var32 ^= -1436071623;
                                    var32 -= 114887564;
                                    var32 ^= -846471986;
                                    break;
                                case 2:
                                    var32 ^= 400209588;
                                    var32 ^= 186038505;
                                    long var311 = var6;
                                    long var21 = var311 + 1L;
                                    var21 = var311 * var21;
                                    long var23 = var311 + 2L;
                                    var21 *= var23;
                                    long var312 = var311 + 3L;
                                    var21 *= var312;
                                    long var313 = var21 & 7L;
                                    long var444;
                                    int var314 = (var444 = var313 - 0L) == 0L ? 0 : (var444 < 0L ? -1 : 1);
                                    if (var314 != 0) {
                                        break label276;
                                    }

                                    Canvas var315 = this.qd;
                                    Integer var346 = var11;
                                    if (var346 != null) {
                                        var32 -= 2026918728;
                                        var32 ^= -2131794621;
                                        var32 ^= 1209951596;
                                        var340 = var6;
                                        var385 = var340 + 1L;
                                        var385 = var340 * var385;
                                        var340 = var385 & 1L;
                                        long var445;
                                        int var349 = (var445 = var340 - 0L) == 0L ? 0 : (var445 < 0L ? -1 : 1);
                                        if (var349 != 0) {
                                            break label276;
                                        }

                                        float var350 = var17 - var220;
                                        float var374 = var243 - var230;
                                        var315.roundRect(var220, var230, var350, var374, var256, var307);
                                        var32 >>>= 10;
                                        var32 &= -511208095;
                                        var32 &= -1465463108;
                                        var32 ^= -91364588;
                                        break label293;
                                    }

                                    var32 >>= 3;
                                    var32 |= 954434670;
                                    var32 ^= 454844575;
                                    var32 |= -1004279628;
                                    var32 ^= -1950214595;
                                    break;
                                default:
                                    var32 |= -1016373722;
                                    var32 -= -880296060;
                                    var32 |= -1539928468;
                                    var32 &= -1522315488;
                                    var32 ^= 1590553620;
                                    break label293;
                            }
                        } else {
                            var32 &= 349739259;
                            var32 += 1061843549;
                            var32 >>>= 30;
                            var32 |= -1559649165;
                            var32 ^= -868987462;
                        }
                    } else {
                        var32 -= -1307405369;
                        var32 ^= -1334562138;
                    }
                } else {
                    int var9 = var8 * -1142080971;
                    var9 -= -1572054061;
                    var9 <<= 12;
                    var9 ^= -971646519;
                }

                int var201 = var6 + 1;
                var201 = var6 * var201;
                var201 &= 1;
                if (var201 == 0) {
                    IllegalArgumentException var204 = new IllegalArgumentException();
                    throw var204;
                }
                break label276;
            }

            Integer var216 = var6;
            if (var216 != null) {
                return;
            }
        }

        RuntimeException var212 = new RuntimeException();
        throw var212;
    }

    private float Hc(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var4 = var5 & 1;
        if (var4 != 0) {
            int var14 = var2 | 1297368323;
            var14 *= -732798721;
            var14 ^= 1583502681;
            RuntimeException var20 = new RuntimeException();
            throw var20;
        } else {
            int var3 = var2 & -1151870744;
            var3 -= -2113354552;
            var3 ^= -721865230;
            long var9 = var3;
            long var22 = var9 + 1L;
            long var23 = var9 * var22;
            long var10 = var23 & 1L;
            long var24;
            var3 = (var24 = var10 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var3 != 0) {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            } else {
                float var12 = this.E;
                float var18 = this.r;
                float var19 = var1 * var18;
                return var12 + var19;
            }
        }
    }

    private float t(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        float var5 = this.u;
        float var6 = this.r;
        var6 = var1 * var6;
        Integer var22 = var4;
        if (var22 == null) {
            int var3 = var2 & -1213134701;
            var3 &= -1932437770;
            var3 ^= -1297450646;
            var3 *= -1171899501;
            var3 ^= -852995402;
            long var7 = var3;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var36;
            int var23 = (var36 = var7 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var23 == 0) {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            int var17 = var2 + -643350810;
            var17 ^= -684353919;
            int var25 = var17 + 1;
            var25 = var17 * var25;
            int var32 = var17 + 2;
            var25 *= var32;
            var17 += 3;
            var25 *= var17;
            var17 = var25 & 7;
            if (var17 == 0) {
                return var5 + var6;
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    private float Ap(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        int var5 = (this.Lv ? 1 : 0);
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var79;
        int var66 = (var79 = var6 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
        if (var66 != 0) {
            switch (var2) {
                case -1485013156:
                    int var39 = var2 ^ 1512654506;
                    break;
                case 93252003:
                    int var37 = var2 - -1927910670;
                    var37 ^= 1754663831;
                    break;
                case 1001193179:
                default:
                    int var36 = var2 ^ -513484692;
            }
        } else {
            label54: {
                label48: {
                    int var3 = var2 | 1378973620;
                    var3 |= 445597410;
                    var3 ^= 9075862;
                    float var49;
                    if (var5 != 0) {
                        var3 *= -364102029;
                        var3 ^= -1926650497;
                        var3 &= -1970757309;
                        var3 |= -1407981500;
                        var3 ^= 1687166797;
                        var5 = var3 + 1;
                        var5 = var3 * var5;
                        int var67 = var3 + 2;
                        var5 *= var67;
                        int var68 = var3 + 3;
                        var5 *= var68;
                        var5 &= 7;
                        if (var5 != 0) {
                            break label48;
                        }

                        float var55 = this.m;
                        float var56 = var1 * var55;
                        var5 = Math.round(var56);
                        float var58 = var5;
                        float var69 = this.m;
                        int var7 = var4 + 1;
                        var7 = var4 * var7;
                        int var78 = var4 + 2;
                        var7 *= var78;
                        var4 += 3;
                        var7 *= var4;
                        var4 = var7 & 7;
                        if (var4 != 0) {
                            var3 -= 140300675;
                            var3 ^= 1942878441;
                            var3 ^= -594761399;
                            break label54;
                        }
                        var3 = switch (var3) {
                            case -938740215 -> {
                                var3 ^= 2091848612;
                                var3 >>>= 3;
                                var3 *= 1066661711;
                                var3 -= -1342972670;
                                yield var3 ^ 1242890049;
                            }
                            default -> var3 ^ -1473459434;
                            case 2117883066 -> var3 ^ -1863793016;
                        };
                        var4 = var3 + 1;
                        var4 = var3 * var4;
                        var7 = var3 + 2;
                        var4 *= var7;
                        var7 = var3 + 3;
                        var4 *= var7;
                        var4 &= 7;
                        if (var4 != 0) {
                            break label48;
                        }

                        float var48 = var58 / var69;
                        var49 = var48;
                        var3 *= 570330619;
                        var3 += -1129423426;
                        var3 |= 1124036068;
                        var3 -= 1602008655;
                        var3 ^= 590247447;
                    } else {
                        var3 |= 2116454939;
                        var3 ^= 1934963802;
                        var49 = var1;
                        var3 |= 1340517938;
                        var3 |= 1226602283;
                        var3 ^= 71265663;
                        var3 -= -568051807;
                        var3 ^= -651039965;
                    }

                    var5 = var3 + 1;
                    var5 = var3 * var5;
                    int var70 = var3 + 2;
                    var5 *= var70;
                    int var71 = var3 + 3;
                    var5 *= var71;
                    var5 &= 7;
                    if (var5 == 0) {
                        return var49;
                    }
                }

                RuntimeException var64 = new RuntimeException();
                throw var64;
            }
        }

        AssertionError var40 = new AssertionError();
        throw var40;
    }

    private int GS(int var1, float var2, int var3) {
        label64: {
            int var6 = System.identityHashCode(this);
            int var7 = var6 + 1;
            var7 = var6 * var7;
            var7 &= 1;
            label63:
            if (var7 == 0) {
                int var4 = switch (var3) {
                    case -1671789442 -> var3 ^ 63610919;
                    case 33501514 -> {
                        int var15 = var3 - -1159508543;
                        yield var15 ^ -2114575708;
                    }
                    default -> var3 ^ 868267689;
                };
                Integer var57 = var1;
                if (var57 == null) {
                    break label64;
                }

                int var64;
                if (var1 == 1) {
                    var4 |= -956359336;
                    var4 ^= 862366328;
                    var64 = var1 + 1;
                    var64 = var1 * var64;
                    int var8 = var1 + 2;
                    var64 *= var8;
                    var8 = var1 + 3;
                    var64 *= var8;
                    var64 &= 7;
                    if (var64 != 0) {
                        break label64;
                    }

                    var64 = this.F;
                    Integer var66 = var6;
                    if (var66 == null) {
                        var4 -= 1128358871;
                        var4 *= 57557335;
                        var4 ^= 465046202;
                        break label63;
                    }

                    var4 -= 2127980662;
                    var4 >>= 22;
                    var4 += 56547413;
                    var4 -= -244134029;
                    var4 ^= -345806109;
                    int var67 = var1 + 1;
                    var67 = var1 * var67;
                    int var9 = var1 + 2;
                    var67 *= var9;
                    var9 = var1 + 3;
                    var67 *= var9;
                    var67 &= 7;
                    if (var67 != 0) {
                        break label64;
                    }

                    var64 = var64;
                    var4 -= -814020770;
                    var4 -= 47347958;
                    var4 ^= -235311542;
                } else {
                    var4 *= 1651838861;
                    var4 -= 764212642;
                    var4 += -414439701;
                    var4 |= -1750973114;
                    var4 ^= 359561788;
                    int var72 = var1 + 1;
                    var72 = var1 * var72;
                    var72 &= 1;
                    if (var72 != 0) {
                        break label64;
                    }

                    var72 = this.fV;
                    Integer var78 = var6;
                    if (var78 == null) {
                        var4 >>= 28;
                        var4 ^= 618055650;
                        break label63;
                    }

                    var4 &= 1428375419;
                    var4 >>= 2;
                    var4 ^= -810425639;
                    var4 *= -360006501;
                    var4 ^= 1499409723;
                    var64 = var72;
                    var4 &= 1277627012;
                    var4 &= 1554979504;
                    var4 ^= -1782610368;
                }

                float var76 = this.R;
                long var79 = var6;
                long var11 = var79 + 1L;
                var11 = var79 * var11;
                long var13 = var79 + 2L;
                var11 *= var13;
                var79 += 3L;
                var11 *= var79;
                var79 = var11 & 7L;
                long var85;
                var6 = (var85 = var79 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                if (var6 == 0) {
                    var4 &= 193748794;
                    var4 ^= 2025980247;
                    float var54 = var76 * var2;
                    return DP.nq(var64, var54);
                }

                var4 += -261116009;
                var4 ^= 285279695;
            } else {
                int var47 = var3 ^ -669643607;
                var47 += -1223753147;
                var47 ^= 1272018992;
            }

            Integer var50 = var1;
            if (var50 != null) {
                IllegalArgumentException var52 = new IllegalArgumentException();
                throw var52;
            }
        }

        RuntimeException var51 = new RuntimeException();
        throw var51;
    }

    private int n(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        int var5 = this.Sr;
        float var6 = this.R;
        var6 *= var1;
        int var7 = var4 + 1;
        var7 = var4 * var7;
        var4 = var7 & 1;
        if (var4 == 0) {
            int var3 = var2 + -179924243;
            var3 ^= -1179290885;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var7 = var3 + 2;
            var4 *= var7;
            var7 = var3 + 3;
            var4 *= var7;
            var4 &= 7;
            if (var4 == 0) {
                return DP.nq(var5, var6);
            }
        } else {
            int var9 = var2 + 1313504436;
            var9 -= 1067933752;
            var9 ^= -1377822337;
            var9 -= 1236657682;
            var9 ^= 858129314;
            Integer var14 = var9;
            if (var14 != null) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    private int FP(int var1, int var2) {
        int var5 = System.identityHashCode(this);
        float var6 = this.Sa;
        var6 = 0.45F * var6;
        Integer var17 = var5;
        if (var17 == null) {
            int var11 = var2 + -1136182673;
            var11 *= -2092789437;
            var11 += -1215649257;
            var11 ^= 1764523007;
            int var18 = var1 + 1;
            var18 = var1 * var18;
            int var4 = var18 & 1;
            if (var4 != 0) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            } else {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            }
        } else {
            int var3 = var2 - -1273334246;
            var3 ^= 838303082;
            var3 |= -1056485093;
            var3 *= -1162329247;
            var3 ^= 241184206;
            return DP.nq(var1, var6);
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 48602921;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        a = var4;
    }
}
