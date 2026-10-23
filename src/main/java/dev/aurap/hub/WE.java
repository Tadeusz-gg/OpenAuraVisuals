package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class WE extends XR {
    private static final float m = 15.0F;
    private static final int s = 5;
    private final ModeSetting D;
    private final nv Ef;
    private final Enum[] KA;
    private final XF U;
    private final XF[] Z;
    private final XF[] h;
    private boolean wr;
    private float lh;
    private int M;
    public static final int Xd;

    public WE(ModeSetting var1, nv var2) {
        kE_2 var4 = kE_2.uY(0.3F, 0.95F);
        XF var3 = new XF(0.0F, var4);
        this.U = var3;
        this.M = -1;
        this.D = var1;
        this.Ef = var2;
        Enum[] var8 = var1.M();
        this.KA = var8;
        Enum[] var9 = this.KA;
        int var10 = var9.length;
        XF[] var11 = new XF[var10];
        this.Z = var11;
        Enum[] var12 = this.KA;
        int var13 = var12.length;
        XF[] var14 = new XF[var13];
        this.h = var14;
        byte var15 = 0;
        int var16 = var15;

        while (true) {
            Enum[] var17 = this.KA;
            int var18 = var17.length;
            if (var16 >= var18) {
                return;
            }

            XF[] var19 = this.Z;
            XF var5;
            int var6 = var1.g();
            float var23;
            if (var16 == var6) {
                var23 = 1.0F;
            } else {
                var23 = 0.0F;
            }

            kE_2 var7 = kE_2.SNAPPY;
            var5 = new XF(var23, var7);
            var19[var16] = var5;
            XF[] var20 = this.h;
            kE_2 var24 = kE_2.SNAPPY;
            var5 = new XF(0.0F, var24);
            var20[var16] = var5;
            int var21 = var16 + 1;
            var16 = var21;
        }
    }

    @Override
    public Setting W() {
        int var1 = Xd;
        var1 ^= 1051327092;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 != null) {
            var1 *= 1764639809;
            var1 &= -1629501596;
            var1 ^= 1884689297;
            int var18 = var1 + 1;
            var18 = var1 * var18;
            var18 &= 1;
            if (var18 == 0) {
                return this.D;
            }
        } else {
            var1 |= 1778831945;
            var1 |= -1412640526;
            var1 ^= -1316816487;
            long var12 = var1;
            long var3 = var12 + 1L;
            var3 = var12 * var3;
            long var13 = var3 & 1L;
            long var22;
            var1 = (var22 = var13 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    private float H(int var1) {
        int var3 = System.identityHashCode(this);
        float var4 = this.pP;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var27;
        var3 = (var27 = var5 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var16 = var1 * 1981903883;
            var16 *= -897667837;
            var16 ^= 779870807;
            var16 ^= -123434860;
            IllegalArgumentException var21 = new IllegalArgumentException();
            throw var21;
        } else {
            Integer var13 = switch (var1) {
                default -> var1 ^ 1871826409;
                case 959481763 -> {
                    int var11 = var1 >> 13;
                    var11 ^= -828643166;
                    yield var11 ^ -499394361;
                }
                case 1760541171 -> var1 ^ 1941282848;
            };
            if (var13 != null) {
                float var15 = Math.max(var4, 110.0F);
                return var15 / 5.0F;
            } else {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        }
    }

    private int e(int var1) {
        int var3 = System.identityHashCode(this);
        Enum[] var4 = this.KA;
        Integer var20 = var3;
        if (var20 == null) {
            int var16 = var1 ^ 1682844102;
            var16 *= 1835733381;
            var16 *= 1878819713;
            var16 ^= 1053385096;
            IllegalArgumentException var21 = new IllegalArgumentException();
            throw var21;
        } else {
            int var2 = var1 - 1950725286;
            var2 *= -241268221;
            var2 ^= 51456874;
            long var9 = var2;
            long var5 = var9 + 1L;
            var5 = var9 * var5;
            long var10 = var5 & 1L;
            long var23;
            var2 = (var23 = var10 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var2 != 0) {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            } else {
                var2 = var4.length;
                var2 += 5;
                var2--;
                return var2 / 5;
            }
        }
    }

    @Override
    public float v() {
        int var1 = Xd;
        var1 ^= 262893808;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 != null) {
            var1 -= 655452950;
            var1 += -742129135;
            var1 |= -1162668761;
            var1 &= 1890249704;
            var1 ^= -1199623816;
            var19 = var1;
            if (var19 != null) {
                XF var21 = this.U;
                float var22 = var21.bs();
                int var3 = var1 & -60271135;
                var3 ^= 2044403725;
                var3 = this.e(var3);
                float var26 = var3;
                int var4 = var1 - 975386108;
                var4 += -748642889;
                var4 ^= 1528980976;
                float var33 = this.H(var4);
                float var27 = var26 * var33;
                float var28 = var27 + 3.0F;
                float var23 = var22 * var28;
                return 15.0F + var23;
            }
        } else {
            long var14 = switch (var1) {
                default -> var1 ^ -23513783;
                case 1119667418 -> {
                    var1 += -413251969;
                    var1 += 247767878;
                    yield var1 ^ -1932123157;
                }
                case 1134996326 -> var1 ^ 1841404858;
            };
            long var29 = var14 + 1L;
            var29 = var14 * var29;
            long var15 = var29 & 1L;
            long var34;
            var1 = (var34 = var15 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    @Override
    public void ol(float var1) {
        label122: {
            int var2 = Xd;
            var2 ^= -2008179675;
            int var3 = System.identityHashCode(this);
            float var4 = this.lh;
            var4 += var1;
            this.lh = var4;
            XF var112 = this.U;
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var192;
            int var120 = (var192 = var5 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
            if (var120 == 0) {
                var2 |= -1329848834;
                var2 |= -28696855;
                var2 += 556032002;
                var2 += 2080151212;
                var2 ^= 1986618066;
                boolean var121 = this.wr;
                float var125;
                if (var121) {
                    var2 += 377214938;
                    var2 += 1359714847;
                    var2 ^= -1380203779;
                    var2 ^= 236650675;
                    int var122 = var2 + 1;
                    int var123 = var2 * var122;
                    int var124 = var123 & 1;
                    if (var124 != 0) {
                        break label122;
                    }

                    var125 = 1.0F;
                    var2 ^= 1339910967;
                    var2 ^= -1091986783;
                } else {
                    var2 += 527641645;
                    var2 += 1971854303;
                    var2 *= -180772043;
                    var2 += 726961956;
                    var2 ^= -1468402932;
                    int var6 = var2 + 1;
                    var6 = var2 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label122;
                    }

                    var125 = 0.0F;
                    var2 += 679695166;
                    var2 ^= 2078943877;
                }

                Integer var132 = var2;
                if (var132 == null) {
                    break label122;
                }

                var112.H(var125);
                XF var113 = this.U;
                Integer var126 = var3;
                if (var126 == null) {
                    switch (var2) {
                        case -630337658:
                        default:
                            var2 ^= 488960949;
                            break;
                        case 6944160:
                            var2 |= -1480589054;
                            var2 >>>= 2;
                            var2 |= 1954212164;
                            var2 *= 450274713;
                            var2 ^= 648653624;
                            break;
                        case 1766995862:
                            var2 ^= -1443450752;
                    }
                } else {
                    var2 ^= -303570437;
                    var2 ^= -307174574;
                    Integer var127 = var2;
                    if (var127 == null) {
                        break label122;
                    }

                    var4 = var113.N(var1);
                    ModeSetting var115 = this.D;
                    int var116 = var115.g();
                    int var117 = var116;
                    byte var128 = 0;
                    int var129 = var128;
                    var2 -= -2131942990;
                    var2 ^= -1680276673;
                    var2 >>= 26;
                    var2 ^= -1595535020;

                    while (true) {
                        int var133 = var2 + 1;
                        var133 = var2 * var133;
                        int var157 = var2 + 2;
                        var133 *= var157;
                        int var158 = var2 + 3;
                        var133 *= var158;
                        var133 &= 7;
                        if (var133 != 0) {
                            break label122;
                        }

                        Enum[] var138 = this.KA;
                        var133 = var138.length;
                        int var159 = var3 + 1;
                        int var160 = var3 * var159;
                        int var8 = var3 + 2;
                        int var161 = var160 * var8;
                        var8 = var3 + 3;
                        int var162 = var161 * var8;
                        int var163 = var162 & 7;
                        if (var163 != 0) {
                            var2 ^= -1704020804;
                            var2 >>= 11;
                            var2 ^= 972100703;
                            break;
                        }

                        var2 *= -104252101;
                        var2 -= 1492204014;
                        var2 ^= -58029333;
                        if (var129 >= var133) {
                            switch (var2) {
                                case -1774745062:
                                    var2 -= -1721940534;
                                    var2 *= -1160115593;
                                    var2 *= 882466111;
                                    var2 ^= -414081122;
                                    break;
                                case -427934240:
                                    var2 ^= 218487929;
                                    break;
                                case 125176935:
                                default:
                                    var2 ^= -630988450;
                            }

                            return;
                        }

                        var2 <<= 27;
                        var2 ^= -595549511;
                        var2 ^= 1605713929;
                        XF[] var140 = this.Z;
                        XF var141 = var140[var129];
                        var7 = var3;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var193;
                        int var167 = (var193 = var7 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                        if (var167 != 0) {
                            var2 ^= -519963341;
                            var2 += -1811759933;
                            var2 >>= 10;
                            var2 -= 310748993;
                            var2 ^= 729963714;
                            break;
                        }

                        var2 |= 650289224;
                        var2 |= 1574055183;
                        var2 ^= 1063095094;
                        float var168;
                        if (var129 == var117) {
                            var2 = switch (var2) {
                                case -301331034 -> var2 ^ -1793225517;
                                case 1084908745 -> {
                                    var2 ^= -1273743314;
                                    var2 += -451961513;
                                    var2 += -366918853;
                                    yield var2 ^ 921461040;
                                }
                                default -> var2 ^ -427359510;
                            };
                            var168 = 1.0F;
                            var2 >>= 18;
                            var2 ^= 1324855780;
                        } else {
                            var2 += 872565234;
                            var2 ^= 1288704848;
                            var2 += -1670221808;
                            var2 += 999492627;
                            var2 ^= 532934557;
                            var168 = 0.0F;
                            var2 -= -2112590861;
                            var2 |= 1321609927;
                            var2 |= -42118301;
                            var2 -= -1675147888;
                            var2 ^= -758088973;
                        }

                        var141.H(var168);
                        XF[] var142 = this.Z;
                        XF var143 = var142[var129];
                        float var144 = var143.N(var1);
                        var133 = var3 + 1;
                        var133 = var3 * var133;
                        int var169 = var3 + 2;
                        var133 *= var169;
                        int var170 = var3 + 3;
                        var133 *= var170;
                        var133 &= 7;
                        if (var133 != 0) {
                            var2 ^= -549975340;
                            var2 ^= -1472594748;
                            break;
                        }

                        var2 += -1643417578;
                        var2 |= 412605573;
                        var2 ^= 81432706;
                        XF[] var150 = this.h;
                        XF var151 = var150[var129];
                        int var171 = this.M;
                        float var173;
                        if (var129 == var171) {
                            var2 *= 2109529927;
                            var2 += 513182084;
                            var2 *= 286700699;
                            var2 ^= -1611664851;
                            Integer var172 = var2;
                            if (var172 == null) {
                                break label122;
                            }

                            var173 = 1.0F;
                            var2 ^= 1116358885;
                            var2 &= 692692744;
                            var2 += 741180979;
                            var2 ^= 1361560104;
                        } else {
                            var2 &= -873671081;
                            var2 ^= 1820860962;
                            var173 = 0.0F;
                            var2 &= 1712528948;
                            var2 += -1140412037;
                            var2 ^= -11570244;
                        }

                        var151.H(var173);
                        XF[] var152 = this.h;
                        var7 = var3;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var194;
                        int var176 = (var194 = var7 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                        if (var176 != 0) {
                            var2 -= 834213645;
                            var2 ^= 765007794;
                            break;
                        }

                        var2 &= -934684179;
                        var2 *= 922558783;
                        var2 ^= -926011772;
                        var7 = var2;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var195;
                        int var180 = (var195 = var7 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                        if (var180 != 0) {
                            break label122;
                        }

                        XF var153 = var152[var129];
                        float var154 = var153.N(var1);
                        var133 = var129 + 1;
                        var129 = var133;
                        var2 ^= -1746207485;
                        var2 -= 1468643282;
                        var2 *= -362384099;
                        var2 ^= -481467229;
                    }
                }
            } else {
                var2 += 775611496;
                var2 |= 668381855;
                var2 ^= 836633675;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var118 = var2 + 2;
            var3 *= var118;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                RuntimeException var106 = new RuntimeException();
                throw var106;
            }
        }

        RuntimeException var105 = new RuntimeException();
        throw var105;
    }

    @Override
    protected void R(Canvas var1, jX var2, float var3) {
        label313: {
            int var4 = Xd;
            var4 ^= -73387932;
            int var5 = System.identityHashCode(this);
            XF var6 = this.U;
            int var7 = var5 + 1;
            var7 = var5 * var7;
            int var8 = var5 + 2;
            var7 *= var8;
            var8 = var5 + 3;
            var7 *= var8;
            var7 &= 7;
            if (var7 != 0) {
                var4 *= 667178713;
                var4 >>>= 7;
                var4 ^= -170699671;
            } else {
                label318: {
                    var4 *= 1399940299;
                    var4 ^= 1313753757;
                    var7 = var4 + 1;
                    var7 = var4 * var7;
                    var8 = var4 + 2;
                    var7 *= var8;
                    var8 = var4 + 3;
                    var7 *= var8;
                    var7 &= 7;
                    if (var7 != 0) {
                        break label313;
                    }

                    float var189 = var6.bs();
                    float var190 = TP.S(var189);
                    float var462;
                    var7 = (var462 = var190 - 0.5F) == 0.0F ? 0 : (var462 < 0.0F ? -1 : 1);
                    if (var7 > 0) {
                        var4 &= -399818196;
                        var4 += 1466461072;
                        var4 *= -1637065263;
                        var4 ^= -1909548729;
                        var4 ^= -1819693797;
                        float var210 = var2.oO;
                        float var240 = var2.RD;
                        Integer var9 = var5;
                        if (var9 == null) {
                            var4 *= 706603093;
                            var4 *= 454885427;
                            var4 &= 1060318666;
                            var4 ^= 620920998;
                            var4 ^= -860256333;
                            break label318;
                        }

                        var4 &= 795633469;
                        var4 += -1972226833;
                        var4 ^= -333529168;
                        var4 ^= 160192465;
                        var4 ^= -1049089513;
                        int var283 = var4 + 1;
                        var283 = var4 * var283;
                        var283 &= 1;
                        if (var283 != 0) {
                            break label313;
                        }

                        var283 = var4 ^ 1497519589;
                        var283 ^= 1802508267;
                        var7 = this.G(var210, var240, var283);
                        var7 = var7;
                        var4 <<= 15;
                        var4 ^= -832108756;
                    } else {
                        var4 &= 252229875;
                        var4 |= 1854836133;
                        var4 &= 302206398;
                        var4 ^= -512325242;
                        long var241 = var4;
                        long var10 = var241 + 1L;
                        var10 = var241 * var10;
                        long var242 = var10 & 1L;
                        long var463;
                        var8 = (var463 = var242 - 0L) == 0L ? 0 : (var463 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label313;
                        }

                        var7 = -1;
                        var4 *= -1208214083;
                        var4 -= -517969005;
                        var4 ^= -1644476639;
                    }

                    this.M = var7;
                    var7 = this.M;
                    Integer var244 = var5;
                    if (var244 == null) {
                        var4 ^= -127015681;
                        var4 ^= -1083030258;
                    } else {
                        label320: {
                            var4 += -808155216;
                            var4 *= -161441147;
                            var4 >>= 7;
                            var4 -= -1699110254;
                            var4 ^= -385826931;
                            var244 = var4;
                            if (var244 == null) {
                                break label313;
                            }

                            Enum var219;
                            if (var7 >= 0) {
                                var4 <<= 8;
                                var4 -= 831715732;
                                var4 ^= -807937403;
                                var4 ^= -310991291;
                                var7 = var4 + 1;
                                var7 = var4 * var7;
                                var7 &= 1;
                                if (var7 != 0) {
                                    break label313;
                                }

                                Enum[] var217 = this.KA;
                                long var246 = var5;
                                long var327 = var246 + 1L;
                                var327 = var246 * var327;
                                long var12 = var246 + 2L;
                                var327 *= var12;
                                long var247 = var246 + 3L;
                                var327 *= var247;
                                long var248 = var327 & 7L;
                                long var464;
                                int var249 = (var464 = var248 - 0L) == 0L ? 0 : (var464 < 0L ? -1 : 1);
                                if (var249 != 0) {
                                    switch (var4) {
                                        case -911837780:
                                            var4 &= -258210126;
                                            var4 -= -1467657688;
                                            var4 &= -832035718;
                                            var4 ^= -221247835;
                                            break label320;
                                        case 397177383:
                                        default:
                                            var4 ^= -1119567736;
                                            break label320;
                                        case 746633393:
                                            var4 ^= -1231594074;
                                            break label320;
                                    }
                                }
                                var4 = switch (var4) {
                                    default -> var4 ^ 99260638;
                                    case -911837780 -> {
                                        var4 &= 1488194890;
                                        var4 ^= 1281399510;
                                        var4 |= -1273523939;
                                        var4 ^= 289812455;
                                        yield var4 ^ -1615596548;
                                    }
                                    case 1264450 -> var4 ^ -1736798458;
                                };
                                var249 = this.M;
                                Enum var218 = var217[var249];
                                var219 = var218;
                                var4 -= 2008635433;
                                var4 ^= -758999028;
                            } else {
                                var4 = switch (var4) {
                                    case -1944282621 -> {
                                        var4 += -697795723;
                                        var4 &= 2047093362;
                                        yield var4 ^ -1958186556;
                                    }
                                    default -> var4 ^ -560060665;
                                    case 1903168223 -> var4 ^ -231416969;
                                };
                                ModeSetting var251 = this.D;
                                Enum var252 = var251.A();
                                long var288 = var5;
                                long var11 = var288 + 1L;
                                var11 = var288 * var11;
                                long var13 = var288 + 2L;
                                var11 *= var13;
                                var288 += 3L;
                                var11 *= var288;
                                var288 = var11 & 7L;
                                long var465;
                                int var291 = (var465 = var288 - 0L) == 0L ? 0 : (var465 < 0L ? -1 : 1);
                                if (var291 != 0) {
                                    var4 >>>= 21;
                                    var4 *= 3506673;
                                    var4 += 1522457372;
                                    var4 |= 2077143070;
                                    var4 ^= 259430147;
                                    break label320;
                                }

                                var4 *= -423644803;
                                var4 &= 1590408156;
                                var4 *= 1336452953;
                                var4 ^= -553113200;
                                int var292 = var4 + 1;
                                int var293 = var4 * var292;
                                int var294 = var293 & 1;
                                if (var294 != 0) {
                                    break label313;
                                }

                                var219 = var252;
                                var4 += 1520403690;
                                var4 <<= 15;
                                var4 ^= 187079334;
                                var4 ^= 1690560817;
                            }

                            var244 = var4;
                            if (var244 == null) {
                                break label313;
                            }

                            ModeSetting var254 = this.D;
                            String var255 = var254.Tp();
                            float var295 = ((XR)this).U;
                            float var331 = this.fb;
                            var331 += 3.5F;
                            TextStyle var367 = lt;
                            TextStyle var392 = lt;
                            int var393 = var392.color();
                            int var394 = DP.nq(var393, var3);
                            var367 = var367.color(var394);
                            int var395 = var5 + 1;
                            int var396 = var5 * var395;
                            int var419 = var5 + 2;
                            int var397 = var396 * var419;
                            var419 = var5 + 3;
                            int var398 = var397 * var419;
                            int var399 = var398 & 7;
                            label293:
                            if (var399 == 0) {
                                var4 -= -2083786457;
                                var4 ^= -803012328;
                                float var256 = var1.text(var255, var295, var331, var367);
                                int var257 = this.M;
                                if (var257 >= 0) {
                                    var4 >>>= 7;
                                    var4 ^= -769148044;
                                    Integer var258 = var4;
                                    if (var258 == null) {
                                        break label313;
                                    }

                                    var257 = -854017;
                                    switch (var4) {
                                        case -1169287861:
                                            var4 ^= 1978080657;
                                            break;
                                        case -761380750:
                                            var4 -= 1463132861;
                                            var4 ^= -65269882;
                                            break;
                                        case 986363143:
                                        default:
                                            var4 ^= -1238367163;
                                    }
                                } else {
                                    var4 |= 90999865;
                                    var4 ^= -593420321;
                                    long var296 = var4;
                                    long var369 = var296 + 1L;
                                    long var370 = var296 * var369;
                                    long var297 = var370 & 1L;
                                    long var466;
                                    int var298 = (var466 = var297 - 0L) == 0L ? 0 : (var466 < 0L ? -1 : 1);
                                    if (var298 != 0) {
                                        break label313;
                                    }

                                    TextStyle var299 = XR.M;
                                    int var300 = var299.color();
                                    Integer var333 = var5;
                                    if (var333 == null) {
                                        switch (var4) {
                                            case -2124640090:
                                                var4 *= 1201113607;
                                                var4 ^= -362215764;
                                                var4 ^= -709209861;
                                                break label293;
                                            case -2024719127:
                                                var4 ^= -875099694;
                                                break label293;
                                            case 2124845210:
                                            default:
                                                var4 ^= 1519228884;
                                                break label293;
                                        }
                                    }

                                    var4 &= 195438362;
                                    var4 ^= 2086626646;
                                    Integer var334 = var4;
                                    if (var334 == null) {
                                        break label313;
                                    }

                                    var257 = var300;
                                    var4 *= 1166968779;
                                    var4 ^= -917948266;
                                    var4 ^= 1019023161;
                                }

                                String var220 = ModeSetting.R(var219);
                                var295 = ((XR)this).U;
                                var331 = this.pP;
                                var295 += var331;
                                long var336 = var5;
                                long var400 = var336 + 1L;
                                long var401 = var336 * var400;
                                long var337 = var401 & 1L;
                                long var467;
                                int var338 = (var467 = var337 - 0L) == 0L ? 0 : (var467 < 0L ? -1 : 1);
                                if (var338 != 0) {
                                    switch (var4) {
                                        case -2022403533:
                                            var4 |= 960207043;
                                            var4 -= 434513912;
                                            var4 &= 1192952852;
                                            var4 ^= -241097011;
                                            break;
                                        case -266953965:
                                        default:
                                            var4 ^= -1024436331;
                                            break;
                                        case 2094164649:
                                            var4 ^= -209621054;
                                    }
                                } else {
                                    label324: {
                                        var4 &= 1090880661;
                                        var4 += -237510363;
                                        var4 ^= 1396135165;
                                        var4 >>= 12;
                                        var4 ^= -1380414798;
                                        var295 -= 8.0F;
                                        var331 = this.fb;
                                        var331 += 3.5F;
                                        var367 = XR.M;
                                        var257 = DP.nq(var257, var3);
                                        TextStyle var261 = var367.color(var257);
                                        float var221 = var1.textRight(var220, var295, var331, var261);
                                        float var468;
                                        var257 = (var468 = var190 - 0.5F) == 0.0F ? 0 : (var468 < 0.0F ? -1 : 1);
                                        if (var257 < 0) {
                                            var4 += -1017495416;
                                            var4 -= -54337985;
                                            var4 -= 977229501;
                                            var4 ^= 733323271;
                                            nv var263 = this.Ef;
                                            ModeSetting var304 = this.D;
                                            Enum var305 = var304.A();
                                            var331 = ((XR)this).U;
                                            float var372 = this.pP;
                                            var331 += var372;
                                            var331 -= 8.0F;
                                            float var222 = var331 - var221;
                                            float var223 = var222 - 8.0F;
                                            var331 = this.fb;
                                            var331 += 7.5F;
                                            Integer var373 = var5;
                                            if (var373 == null) {
                                                switch (var4) {
                                                    case -181452918:
                                                        var4 |= -154807376;
                                                        var4 |= -566259809;
                                                        var4 ^= -1653901178;
                                                        var4 ^= -1775459868;
                                                        break label324;
                                                    case 389890831:
                                                        var4 ^= -499777325;
                                                        break label324;
                                                    case 2002576718:
                                                    default:
                                                        var4 ^= -1534021655;
                                                        break label324;
                                                }
                                            }
                                            var4 = switch (var4) {
                                                default -> var4 ^ 993264546;
                                                case -362653661 -> var4 ^ -163998691;
                                                case -181452918 -> {
                                                    var4 ^= 1959057318;
                                                    var4 &= 1072230717;
                                                    var4 &= 1294992831;
                                                    yield var4 ^ -2075620779;
                                                }
                                            };
                                            long var374 = var4;
                                            long var421 = var374 + 1L;
                                            long var422 = var374 * var421;
                                            long var15 = var374 + 2L;
                                            long var423 = var422 * var15;
                                            long var375 = var374 + 3L;
                                            long var424 = var423 * var375;
                                            long var376 = var424 & 7L;
                                            long var469;
                                            int var377 = (var469 = var376 - 0L) == 0L ? 0 : (var469 < 0L ? -1 : 1);
                                            if (var377 != 0) {
                                                break label313;
                                            }

                                            float var378 = this.lh;
                                            float var402 = var190 * 2.0F;
                                            float var403 = 1.0F - var402;
                                            float var404 = var3 * var403;
                                            var263.aq(var1, var305, var223, var331, 13.0F, var378, var404);
                                            var4 -= 1678354411;
                                            var4 <<= 17;
                                            var4 -= 1981943582;
                                            var4 ^= -1435026455;
                                        } else {
                                            var4 -= -1622275876;
                                            var4 -= 2100200331;
                                            var4 |= -238457136;
                                            var4 ^= 289514705;
                                        }

                                        var7 = var4 + 1;
                                        var7 = var4 * var7;
                                        var257 = var4 + 2;
                                        var7 *= var257;
                                        var257 = var4 + 3;
                                        var7 *= var257;
                                        var7 &= 7;
                                        if (var7 != 0) {
                                            break label313;
                                        }

                                        float var229 = ((XR)this).U;
                                        float var266 = this.pP;
                                        Integer var306 = var5;
                                        if (var306 != null) {
                                            var4 |= -575265684;
                                            var4 -= 953937039;
                                            var4 -= -2053278839;
                                            var4 ^= 982589539;
                                            int var307 = var4 + 1;
                                            int var308 = var4 * var307;
                                            int var309 = var308 & 1;
                                            if (var309 != 0) {
                                                break label313;
                                            }

                                            float var230 = var229 + var266;
                                            float var231 = var230 - 2.0F;
                                            float var267 = this.fb;
                                            float var268 = var267 + 7.5F;
                                            XF var310 = this.U;
                                            var295 = var310.bs();
                                            int var346 = DP.nq(-2130706433, var3);
                                            Hc.D(var1, var231, var268, var295, var346);
                                            float var470;
                                            var7 = (var470 = var190 - 0.01F) == 0.0F ? 0 : (var470 < 0.0F ? -1 : 1);
                                            if (var7 <= 0) {
                                                var4 += -1536090805;
                                                var4 ^= -1784508604;
                                                return;
                                            }
                                            var4 = switch (var4) {
                                                case -1582320599 -> var4 ^ 1185354998;
                                                default -> var4 ^ -2072886409;
                                                case 97824564 -> {
                                                    var4 -= 1105729911;
                                                    yield var4 ^ 1182209836;
                                                }
                                            };
                                            var1.save();
                                            var1.alpha(var190);
                                            float var191 = ((XR)this).U;
                                            float var192 = var191 - 2.0F;
                                            float var233 = this.fb;
                                            float var234 = var233 + 15.0F;
                                            float var269 = this.pP;
                                            float var270 = var269 + 4.0F;
                                            var295 = this.v();
                                            Integer var347 = var5;
                                            if (var347 == null) {
                                                switch (var4) {
                                                    case -2053406063:
                                                        var4 <<= 13;
                                                        var4 += -102835399;
                                                        var4 ^= -1635197468;
                                                        break;
                                                    case -2033291421:
                                                        var4 ^= -2143180284;
                                                        break;
                                                    case 37695941:
                                                    default:
                                                        var4 ^= 1754547535;
                                                }
                                            } else {
                                                var4 += -1717208290;
                                                var4 ^= -564064619;
                                                long var348 = var4;
                                                long var405 = var348 + 1L;
                                                long var406 = var348 * var405;
                                                long var14 = var348 + 2L;
                                                long var407 = var406 * var14;
                                                long var349 = var348 + 3L;
                                                long var408 = var407 * var349;
                                                long var350 = var408 & 7L;
                                                long var471;
                                                int var351 = (var471 = var350 - 0L) == 0L ? 0 : (var471 < 0L ? -1 : 1);
                                                if (var351 != 0) {
                                                    break label313;
                                                }

                                                var295 -= 15.0F;
                                                var1.clip(var192, var234, var270, var295, 0.0F);
                                                int var193 = var4 + 139364770;
                                                int var194 = var193 ^ 1981505249;
                                                int var195 = var194 >>> 20;
                                                int var196 = var195 ^ 393184961;
                                                int var197 = var196 ^ 777980564;
                                                float var198 = this.H(var197);
                                                float var199 = var198;
                                                int var235 = 0;
                                                var235 = var235;

                                                var4 = switch (var4) {
                                                    default -> var4 ^ 2099690221;
                                                    case -1054739654 -> {
                                                        var4 &= -24902394;
                                                        yield var4 ^ 1774808444;
                                                    }
                                                    case 648571913 -> var4 ^ -1632568716;
                                                };

                                                label275:
                                                while (true) {
                                                    var257 = var4 + 1;
                                                    var257 = var4 * var257;
                                                    var257 &= 1;
                                                    if (var257 != 0) {
                                                        break label313;
                                                    }

                                                    Enum[] var274 = this.KA;
                                                    var257 = var274.length;
                                                    long var314 = var5;
                                                    long var379 = var314 + 1L;
                                                    long var380 = var314 * var379;
                                                    long var315 = var380 & 1L;
                                                    long var472;
                                                    int var316 = (var472 = var315 - 0L) == 0L ? 0 : (var472 < 0L ? -1 : 1);
                                                    if (var316 != 0) {
                                                        var4 |= 409909684;
                                                        var4 ^= 1297603363;
                                                        break;
                                                    }

                                                    var4 ^= -1120234227;
                                                    var4 ^= 995440397;
                                                    var4 ^= 813390908;
                                                    Integer var317 = var4;
                                                    if (var317 == null) {
                                                        break label313;
                                                    }

                                                    if (var235 >= var257) {
                                                        switch (var4) {
                                                            case -1967156768:
                                                            default:
                                                                var4 ^= -365393784;
                                                                break;
                                                            case 534614594:
                                                                var4 -= -1428216747;
                                                                var4 += -782582925;
                                                                var4 -= -1546853752;
                                                                var4 -= -2030896957;
                                                                var4 ^= 370530669;
                                                                break;
                                                            case 1897482917:
                                                                var4 ^= -295321543;
                                                        }

                                                        var1.restore();
                                                        return;
                                                    }
                                                    var4 = switch (var4) {
                                                        default -> var4 ^ -2010142880;
                                                        case 163551303 -> var4 ^ -1177432998;
                                                        case 534614594 -> {
                                                            var4 ^= 320798498;
                                                            yield var4 ^ 186697948;
                                                        }
                                                    };
                                                    long var276 = var4;
                                                    long var352 = var276 + 1L;
                                                    long var353 = var276 * var352;
                                                    long var277 = var353 & 1L;
                                                    long var473;
                                                    var257 = (var473 = var277 - 0L) == 0L ? 0 : (var473 < 0L ? -1 : 1);
                                                    if (var257 != 0) {
                                                        break label313;
                                                    }

                                                    float var279 = ((XR)this).U;
                                                    int var318 = var235 % 5;
                                                    var295 = var318;
                                                    var295 *= var199;
                                                    float var280 = var279 + var295;
                                                    var295 = this.fb;
                                                    var295 += 15.0F;
                                                    var295++;
                                                    int var354 = var235 / 5;
                                                    var331 = var354;
                                                    var331 *= var199;
                                                    var295 += var331;
                                                    XF[] var357 = this.Z;
                                                    XF var358 = var357[var235];
                                                    var331 = var358.bs();
                                                    Integer var381 = var5;
                                                    if (var381 == null) {
                                                        switch (var4) {
                                                            case -959664309:
                                                                var4 ^= 1761333679;
                                                                break label275;
                                                            case -147715886:
                                                            default:
                                                                var4 ^= 1666562048;
                                                                break label275;
                                                            case 132359612:
                                                                var4 *= -1933519929;
                                                                var4 -= -1803353826;
                                                                var4 += -1491774504;
                                                                var4 ^= 127548675;
                                                                break label275;
                                                        }
                                                    }

                                                    var4 ^= -443435233;
                                                    var4 ^= -249043235;
                                                    int var382 = var4 + 1;
                                                    int var383 = var4 * var382;
                                                    int var384 = var383 & 1;
                                                    if (var384 != 0) {
                                                        break label313;
                                                    }

                                                    XF[] var385 = this.h;
                                                    XF var386 = var385[var235];
                                                    float var387 = var386.bs();
                                                    int var409 = DP.Z(251658239, 650501887, var387);
                                                    var419 = DP.U(-7684353, 48);
                                                    int var410 = DP.Z(var409, var419, var331);
                                                    float var426 = var280 + 1.0F;
                                                    float var431 = var295 + 1.0F;
                                                    float var439 = var199 - 2.0F;
                                                    float var16 = var199 - 2.0F;
                                                    int var411 = DP.nq(var410, var3);
                                                    var1.roundRect(var426, var431, var439, var16, 5.0F, var411);
                                                    float var474;
                                                    int var412 = (var474 = var331 - 0.01F) == 0.0F ? 0 : (var474 < 0.0F ? -1 : 1);
                                                    if (var412 > 0) {
                                                        var4 -= 59974196;
                                                        var4 += -2009491614;
                                                        var4 ^= -738231543;
                                                        long var413 = var4;
                                                        var14 = var413 + 1L;
                                                        var14 = var413 * var14;
                                                        long var414 = var14 & 1L;
                                                        long var475;
                                                        int var415 = (var475 = var414 - 0L) == 0L ? 0 : (var475 < 0L ? -1 : 1);
                                                        if (var415 != 0) {
                                                            break label313;
                                                        }

                                                        float var416 = var280 + 1.4F;
                                                        float var427 = var295 + 1.4F;
                                                        float var434 = var199 - 2.8F;
                                                        long var440 = var5;
                                                        long var17 = var440 + 1L;
                                                        var17 = var440 * var17;
                                                        long var441 = var17 & 1L;
                                                        long var476;
                                                        int var442 = (var476 = var441 - 0L) == 0L ? 0 : (var476 < 0L ? -1 : 1);
                                                        if (var442 != 0) {
                                                            var4 *= 429051963;
                                                            var4 += 1843586121;
                                                            var4 ^= -1402968435;
                                                            break;
                                                        }

                                                        var4 <<= 15;
                                                        var4 ^= 1858537933;
                                                        long var443 = var4;
                                                        var17 = var443 + 1L;
                                                        var17 = var443 * var17;
                                                        long var19 = var443 + 2L;
                                                        var17 *= var19;
                                                        long var444 = var443 + 3L;
                                                        var17 *= var444;
                                                        long var445 = var17 & 7L;
                                                        long var477;
                                                        int var446 = (var477 = var445 - 0L) == 0L ? 0 : (var477 < 0L ? -1 : 1);
                                                        if (var446 != 0) {
                                                            break label313;
                                                        }

                                                        var439 = var199 - 2.8F;
                                                        var16 = var3 * var331;
                                                        int var451 = DP.nq(-7684353, var16);
                                                        Paint var452 = Paint.solid(var451);
                                                        Paint var453 = var452.stroke(0.9F);
                                                        var1.roundRect(var416, var427, var434, var439, 4.6F, var453);
                                                        var4 &= 1692085022;
                                                        var4 *= 1817032875;
                                                        var4 &= -1022803222;
                                                        var4 += 1861776667;
                                                        var4 ^= 1193811445;
                                                    } else {
                                                        var4 ^= -1975877728;
                                                        var4 &= -475202797;
                                                        var4 ^= -1274682884;
                                                    }

                                                    var1.save();
                                                    float var417 = var280 + 1.0F;
                                                    float var428 = var295 + 1.0F;
                                                    float var435 = var199 - 2.0F;
                                                    var439 = var199 - 2.0F;
                                                    var1.clip(var417, var428, var435, var439, 5.0F);
                                                    nv var418 = this.Ef;
                                                    Enum[] var429 = this.KA;
                                                    Enum var430 = var429[var235];
                                                    float var436 = var199 * 0.5F;
                                                    float var281 = var280 + var436;
                                                    float var437 = var199 * 0.5F;
                                                    var295 += var437;
                                                    float var438 = var199 - 2.0F;
                                                    var439 = this.lh;
                                                    var331 = Math.max(var331, var387);
                                                    int var388 = var5 + 1;
                                                    int var389 = var5 * var388;
                                                    int var390 = var389 & 1;
                                                    if (var390 != 0) {
                                                        switch (var4) {
                                                            case -314479368:
                                                                var4 ^= 169419177;
                                                                break label275;
                                                            case 891906798:
                                                                var4 <<= 2;
                                                                var4 <<= 15;
                                                                var4 |= -1231828514;
                                                                var4 ^= 57143043;
                                                                break label275;
                                                            case 1682512779:
                                                            default:
                                                                var4 ^= 238345521;
                                                                break label275;
                                                        }
                                                    }

                                                    var4 ^= 643036464;
                                                    var4 ^= 110025269;
                                                    long var454 = var4;
                                                    long var18 = var454 + 1L;
                                                    var18 = var454 * var18;
                                                    long var455 = var18 & 1L;
                                                    long var478;
                                                    int var391 = (var478 = var455 - 0L) == 0L ? 0 : (var478 < 0L ? -1 : 1);
                                                    if (var391 != 0) {
                                                        break label313;
                                                    }

                                                    var331 = 0.25F * var331;
                                                    var331 = 0.75F + var331;
                                                    var331 = var3 * var331;
                                                    var418.aq(var1, var430, var281, var295, var438, var439, var331);
                                                    var1.restore();
                                                    var257 = var235 + 1;
                                                    var235 = var257;
                                                    var4 >>= 1;
                                                    var4 += 2131150168;
                                                    var4 &= 1154650032;
                                                    var4 -= 1471297185;
                                                    var4 ^= 25640225;
                                                }
                                            }
                                        } else {
                                            var4 += -772320087;
                                            var4 <<= 21;
                                            var4 &= -1136426004;
                                            var4 ^= 1085810397;
                                        }
                                    }
                                }
                            } else {
                                switch (var4) {
                                    case -1460316652:
                                    default:
                                        var4 ^= 418640048;
                                        break;
                                    case 279606167:
                                        var4 *= 1319006455;
                                        var4 ^= 1724540927;
                                        var4 ^= 1873689144;
                                        var4 ^= -35263061;
                                        break;
                                    case 1262824972:
                                        var4 ^= 1284237190;
                                }
                            }
                        }
                    }
                }
            }

            var5 = var4 + 1;
            var5 = var4 * var5;
            var4 = var5 & 1;
            if (var4 == 0) {
                AssertionError var185 = new AssertionError();
                throw var185;
            }
        }

        IllegalStateException var186 = new IllegalStateException();
        throw var186;
    }

    private int G(float var1, float var2, int var3) {
        label122: {
            int var5 = System.identityHashCode(this);
            int var6 = var3 ^ -1727951497;
            var6 ^= 983020379;
            float var81 = this.H(var6);
            float var7 = ((XR)this).U;
            var7 = var1 - var7;
            float var8 = this.fb;
            var8 += 15.0F;
            var8++;
            long var9 = var5;
            long var11 = var9 + 1L;
            var11 = var9 * var11;
            var9 = var11 & 1L;
            long var122;
            int var102 = (var122 = var9 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
            int var41;
            if (var102 != 0) {
                var41 = var3 + -1762508847;
                var41 ^= 191583122;
            } else {
                label121: {
                    var41 = var3 | -997818719;
                    var41 &= 2075222427;
                    var41 &= -2046829012;
                    var41 ^= -1673969692;
                    var8 = var2 - var8;
                    float var123;
                    int var103 = (var123 = var7 - 0.0F) == 0.0F ? 0 : (var123 < 0.0F ? -1 : 1);
                    if (var103 >= 0) {
                        var41 -= 1363220872;
                        var41 <<= 27;
                        var41 *= 682294115;
                        var41 &= 1939237342;
                        var41 ^= 829181576;
                        float var124;
                        int var104 = (var124 = var8 - 0.0F) == 0.0F ? 0 : (var124 < 0.0F ? -1 : 1);
                        long var10 = var5;
                        long var12 = var10 + 1L;
                        var12 = var10 * var12;
                        var10 = var12 & 1L;
                        long var125;
                        int var115 = (var125 = var10 - 0L) == 0L ? 0 : (var125 < 0L ? -1 : 1);
                        if (var115 != 0) {
                            var41 ^= -1524388684;
                            var41 ^= -826521394;
                            break label121;
                        }
                        var41 = switch (var41) {
                            default -> var41 ^ 1286956451;
                            case 302225578 -> var41 ^ 2031261590;
                            case 1366052488 -> {
                                var41 += 459630263;
                                var41 *= 525290491;
                                var41 += -944268427;
                                var41 *= -2115205061;
                                yield var41 ^ -1430736816;
                            }
                        };
                        Integer var116 = var41;
                        if (var116 == null) {
                            break label122;
                        }

                        if (var104 >= 0) {
                            var41 = switch (var41) {
                                case -1792084978 -> {
                                    var41 += -1959161752;
                                    var41 *= 770632623;
                                    yield var41 ^ -1953316450;
                                }
                                default -> var41 ^ -175425617;
                                case 1442695210 -> var41 ^ -1219235836;
                            };
                            int var105 = var41 + 1;
                            int var106 = var41 * var105;
                            int var117 = var41 + 2;
                            int var107 = var106 * var117;
                            int var118 = var41 + 3;
                            int var108 = var107 * var118;
                            int var109 = var108 & 7;
                            if (var109 != 0) {
                                break label122;
                            }

                            float var110 = 5.0F * var81;
                            Integer var119 = var5;
                            if (var119 == null) {
                                switch (var41) {
                                    case -812364709:
                                    default:
                                        var41 ^= -193603951;
                                        break label121;
                                    case 1305932493:
                                        var41 ^= 1060783638;
                                        break label121;
                                    case 1999380276:
                                        var41 &= 1093904819;
                                        var41 |= 309520554;
                                        var41 &= -686762874;
                                        var41 -= 1925894694;
                                        var41 ^= -625589074;
                                        break label121;
                                }
                            }

                            var41 -= -1408449002;
                            var41 ^= -137774903;
                            float var126;
                            int var111 = (var126 = var7 - var110) == 0.0F ? 0 : (var126 < 0.0F ? -1 : 1);
                            if (var111 < 0) {
                                var41 += 1733897296;
                                var41 ^= 1009620887;
                                var41 ^= -310224129;
                                var8 /= var81;
                                int var99 = (int)var8;
                                int var100 = var99 * 5;
                                float var82 = var7 / var81;
                                var6 = (int)var82;
                                var6 = var100 + var6;
                                long var91 = var5;
                                var9 = var91 + 1L;
                                var9 = var91 * var9;
                                long var92 = var9 & 1L;
                                long var127;
                                var5 = (var127 = var92 - 0L) == 0L ? 0 : (var127 < 0L ? -1 : 1);
                                if (var5 == 0) {
                                    var41 = switch (var41) {
                                        case -972603341 -> var41 ^ 768833238;
                                        default -> var41 ^ 315881579;
                                        case 1973404495 -> {
                                            var41 ^= -720090777;
                                            yield var41 ^ 681525206;
                                        }
                                    };
                                    Integer var71 = var41;
                                    if (var71 != null) {
                                        Enum[] var72 = this.KA;
                                        int var73 = var72.length;
                                        if (var6 < var73) {
                                            var41 *= 1424147883;
                                            var41 |= 149805515;
                                            var41 *= 33977729;
                                            var41 *= 1439558515;
                                            var41 ^= -1663068005;
                                            Integer var74 = var41;
                                            if (var74 == null) {
                                                break label122;
                                            }

                                            var73 = var6;
                                            switch (var41) {
                                                case -1632694824:
                                                    var41 ^= 90186036;
                                                    break;
                                                case 600294794:
                                                    var41 <<= 15;
                                                    var41 &= -1324165544;
                                                    var41 += 286506920;
                                                    var41 += -1460928947;
                                                    var41 ^= -632361642;
                                                    break;
                                                case 928575284:
                                                default:
                                                    var41 ^= -198927223;
                                            }
                                        } else {
                                            var41 >>= 8;
                                            var41 ^= -419372182;
                                            var73 = -1;
                                            var41 &= -2146584247;
                                            var41 ^= -2084970006;
                                        }

                                        var6 = var41 + 1;
                                        var6 = var41 * var6;
                                        int var93 = var41 + 2;
                                        var6 *= var93;
                                        int var94 = var41 + 3;
                                        var6 *= var94;
                                        var6 &= 7;
                                        if (var6 == 0) {
                                            return var73;
                                        }
                                    }
                                    break label122;
                                }

                                switch (var41) {
                                    case 165496782:
                                    default:
                                        var41 ^= -4361326;
                                        break label121;
                                    case 566353839:
                                        var41 ^= 1919421802;
                                        break label121;
                                    case 1973404495:
                                        var41 >>>= 13;
                                        var41 ^= 988808716;
                                        break label121;
                                }
                            }

                            var41 >>= 9;
                            var41 |= -29292069;
                            var41 *= 110374605;
                            var41 += 1672109456;
                            var41 ^= -177704610;
                        } else {
                            switch (var41) {
                                case -1792084978:
                                    var41 ^= -317722641;
                                    var41 ^= -2089006249;
                                    var41 ^= -579441252;
                                    var41 ^= 1507173371;
                                    break;
                                case -1211828131:
                                default:
                                    var41 ^= -1068219135;
                                    break;
                                case -677030291:
                                    var41 ^= -512900366;
                            }
                        }
                    } else {
                        var41 ^= 2106870599;
                        var41 &= -1234221452;
                        var41 ^= -537683215;
                    }

                    var5 = var41 + 1;
                    var5 = var41 * var5;
                    var41 = var5 & 1;
                    if (var41 == 0) {
                        return -1;
                    }
                    break label122;
                }
            }

            Integer var78 = var41;
            if (var78 != null) {
                IllegalStateException var79 = new IllegalStateException();
                throw var79;
            }
        }

        AssertionError var69 = new AssertionError();
        throw var69;
    }

    @Override
    public boolean i(jX var1, float var2, float var3, int var4) {
        label202: {
            label201: {
                int var5 = Xd;
                var5 ^= -886433220;
                int var7 = System.identityHashCode(this);
                int var8 = var7 + 1;
                var8 = var7 * var8;
                var8 &= 1;
                if (var8 != 0) {
                    var5 >>= 23;
                    var5 &= -2043165212;
                    var5 |= 1472380160;
                    var5 ^= -991631864;
                } else {
                    var5 += -440134100;
                    var5 ^= 1496352849;
                    float var146 = this.fb;
                    float var147 = var146 + 15.0F;
                    float var234;
                    var8 = (var234 = var3 - var147) == 0.0F ? 0 : (var234 < 0.0F ? -1 : 1);
                    if (var8 < 0) {
                        var5 |= -145538944;
                        var5 += -356902480;
                        var5 -= -1227006033;
                        var5 <<= 19;
                        var5 ^= 1742682563;
                        if (var4 == 0) {
                            var5 = switch (var5) {
                                default -> var5 ^ 163870171;
                                case 1400846787 -> {
                                    var5 += 1032428750;
                                    var5 *= -124967343;
                                    var5 -= -1743730600;
                                    var5 *= 575141393;
                                    yield var5 ^ -1410030293;
                                }
                                case 1799677267 -> var5 ^ 1919589955;
                            };
                            long var149 = var4;
                            long var10 = var149 + 1L;
                            var10 = var149 * var10;
                            long var12 = var149 + 2L;
                            var10 *= var12;
                            long var150 = var149 + 3L;
                            var10 *= var150;
                            long var151 = var10 & 7L;
                            long var235;
                            var8 = (var235 = var151 - 0L) == 0L ? 0 : (var235 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                break label202;
                            }

                            int var153 = (this.wr ? 1 : 0);
                            long var9 = var7;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var236;
                            int var182 = (var236 = var9 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                            if (var182 == 0) {
                                var5 &= -315303200;
                                var5 *= -482582137;
                                var5 |= -530498345;
                                var5 ^= 1133500488;
                                Integer var183 = var4;
                                if (var183 == null) {
                                    break label202;
                                }

                                if (var153 == 0) {
                                    var5 -= -1904645971;
                                    var5 ^= 1837421616;
                                    var153 = var4 + 1;
                                    var153 = var4 * var153;
                                    int var184 = var4 + 2;
                                    var153 *= var184;
                                    int var185 = var4 + 3;
                                    var153 *= var185;
                                    var153 &= 7;
                                    if (var153 != 0) {
                                        break label202;
                                    }

                                    var153 = 1;
                                    var5 *= 307413185;
                                    var5 |= -1053709604;
                                    var5 ^= 1870169651;
                                } else {
                                    var5 += -494941820;
                                    var5 >>>= 7;
                                    var5 &= -1981258617;
                                    var5 ^= 1405594274;
                                    int var186 = var4 + 1;
                                    int var187 = var4 * var186;
                                    int var188 = var187 & 1;
                                    if (var188 != 0) {
                                        break label202;
                                    }

                                    var153 = 0;
                                    var5 *= -374389893;
                                    var5 ^= 623932303;
                                }

                                this.wr = (var153 != 0);
                                switch (var5) {
                                    case -1419694292:
                                        var5 ^= -2122192577;
                                        break label201;
                                    case -1308283443:
                                        var5 >>>= 17;
                                        var5 *= -1177615561;
                                        var5 >>>= 25;
                                        var5 ^= 678093082;
                                        break label201;
                                    case 491527916:
                                    default:
                                        var5 ^= 1987525604;
                                        break label201;
                                }
                            }

                            switch (var5) {
                                case 590398770:
                                    var5 -= 1852008545;
                                    var5 ^= -1478604835;
                                    break;
                                case 1282804492:
                                    var5 ^= -313565544;
                                    break;
                                case 1889500717:
                                default:
                                    var5 ^= -1237552581;
                            }
                        } else {
                            var5 = switch (var5) {
                                case -1084816593 -> var5 ^ -274655082;
                                default -> var5 ^ 530335402;
                                case 1400846787 -> {
                                    var5 <<= 9;
                                    yield var5 ^ 441234014;
                                }
                            };
                            var8 = var4 + 1;
                            var8 = var4 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                break label202;
                            }

                            if (var4 != 1) {
                                var5 *= -444153035;
                                var5 ^= -1978308574;
                                var8 = var4 + 1;
                                var8 = var4 * var8;
                                int var190 = var4 + 2;
                                var8 *= var190;
                                var190 = var4 + 3;
                                var8 *= var190;
                                var8 &= 7;
                                if (var8 == 0) {
                                    return false;
                                }
                                break label202;
                            }

                            var5 += 1367735479;
                            var5 &= 36277977;
                            var5 ^= -1239344820;
                            long var163 = var4;
                            long var218 = var163 + 1L;
                            var218 = var163 * var218;
                            long var233 = var163 + 2L;
                            var218 *= var233;
                            long var164 = var163 + 3L;
                            var218 *= var164;
                            long var165 = var218 & 7L;
                            long var237;
                            var8 = (var237 = var165 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                break label202;
                            }

                            ModeSetting var167 = this.D;
                            Integer var189 = var7;
                            if (var189 != null) {
                                var5 = switch (var5) {
                                    default -> var5 ^ -115023035;
                                    case -1239410339 -> {
                                        var5 *= -1768383723;
                                        yield var5 ^ 1127005383;
                                    }
                                    case 566874405 -> var5 ^ -1043827111;
                                };
                                var167.p(1);
                                switch (var5) {
                                    case -2053009893:
                                    default:
                                        var5 ^= -593136145;
                                        break label201;
                                    case -1374036122:
                                        var5 |= 488879953;
                                        var5 ^= -1756291496;
                                        break label201;
                                    case -834491314:
                                        var5 ^= 1381152757;
                                        break label201;
                                }
                            }

                            switch (var5) {
                                case -1719638536:
                                default:
                                    var5 ^= -665243907;
                                    break;
                                case -1239410339:
                                    var5 >>>= 31;
                                    var5 ^= 1505690136;
                                    var5 *= 487004369;
                                    var5 ^= 62985573;
                                    break;
                                case -94968576:
                                    var5 ^= 1320763126;
                            }
                        }
                    } else {
                        var5 = switch (var5) {
                            case 892423187 -> {
                                var5 -= 1598269131;
                                var5 <<= 7;
                                yield var5 ^ -63288040;
                            }
                            case 1450932371 -> var5 ^ -1948624478;
                            default -> var5 ^ -327063770;
                        };
                        int var174 = (this.wr ? 1 : 0);
                        Integer var192 = var7;
                        label186:
                        if (var192 != null) {
                            var5 *= -1600499081;
                            var5 *= 1199314355;
                            var5 -= -639543313;
                            var5 ^= 1685304904;
                            if (var174 != 0) {
                                var5 = switch (var5) {
                                    case -1606748386 -> var5 ^ -1307724887;
                                    default -> var5 ^ -489220270;
                                    case 627489857 -> {
                                        var5 *= 1665557305;
                                        yield var5 ^ 840781344;
                                    }
                                };
                                var174 = var5 + -2018231399;
                                var174 ^= -997765201;
                                var174 *= 1592498891;
                                var174 ^= 1789505328;
                                var174 = this.G(var2, var3, var174);
                                int var193 = var7 + 1;
                                var193 = var7 * var193;
                                int var222 = var7 + 2;
                                var193 *= var222;
                                var222 = var7 + 3;
                                var193 *= var222;
                                var193 &= 7;
                                if (var193 != 0) {
                                    switch (var5) {
                                        case -1720827047:
                                            var5 ^= 1564787513;
                                            var5 ^= -684090516;
                                            break label186;
                                        case -1689719808:
                                            var5 ^= 701487067;
                                            break label186;
                                        case -1002382899:
                                        default:
                                            var5 ^= -1097501635;
                                            break label186;
                                    }
                                }

                                var5 += 357013216;
                                var5 |= -1232801706;
                                var5 ^= 49391422;
                                var193 = var4 + 1;
                                var193 = var4 * var193;
                                var222 = var4 + 2;
                                var193 *= var222;
                                var222 = var4 + 3;
                                var193 *= var222;
                                var193 &= 7;
                                if (var193 != 0) {
                                    break label202;
                                }

                                var174 = var174;
                                switch (var5) {
                                    case -1136370367:
                                        var5 <<= 19;
                                        var5 |= -967499330;
                                        var5 -= 23901149;
                                        var5 ^= 2105715411;
                                        break;
                                    case 115248665:
                                    default:
                                        var5 ^= 1051320984;
                                        break;
                                    case 1399769607:
                                        var5 ^= 1377887460;
                                }
                            } else {
                                var5 |= 702058684;
                                var5 += -1780667577;
                                var5 *= -119577585;
                                var5 += 1366481707;
                                var5 ^= 1447850092;
                                long var203 = var4;
                                long var227 = var203 + 1L;
                                var227 = var203 * var227;
                                long var204 = var227 & 1L;
                                long var238;
                                int var205 = (var238 = var204 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                                if (var205 != 0) {
                                    break label202;
                                }

                                var174 = -1;
                                var5 &= 1530623906;
                                var5 >>>= 14;
                                var5 ^= -1854764237;
                            }

                            long var206 = var7;
                            long var229 = var206 + 1L;
                            var229 = var206 * var229;
                            long var13 = var206 + 2L;
                            var229 *= var13;
                            long var207 = var206 + 3L;
                            var229 *= var207;
                            long var208 = var229 & 7L;
                            long var239;
                            int var209 = (var239 = var208 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
                            if (var209 != 0) {
                                var5 ^= -1678417645;
                                var5 *= 745515515;
                                var5 -= 635078604;
                                var5 += 1089758971;
                                var5 ^= -1140354682;
                            } else {
                                var5 = switch (var5) {
                                    case -1854748878 -> {
                                        var5 ^= 4312731;
                                        var5 += 43156164;
                                        yield var5 ^ 889112906;
                                    }
                                    default -> var5 ^ -453074155;
                                    case 126855350 -> var5 ^ -1737245665;
                                };
                                if (var174 < 0) {
                                    var5 *= -857453163;
                                    var5 |= -502559602;
                                    var5 |= -1527644672;
                                    var5 ^= 750929393;
                                    Integer var213 = var4;
                                    if (var213 != null) {
                                        return false;
                                    }
                                    break label202;
                                }

                                var5 += 1583300550;
                                var5 -= -225305341;
                                var5 *= 708328313;
                                var5 -= -137416088;
                                var5 ^= 838878728;
                                Integer var210 = var4;
                                if (var210 == null) {
                                    break label202;
                                }

                                int var211 = var5 >> 19;
                                var211 ^= 1732533070;
                                this.gN(var174, var211);
                                Integer var139 = var7;
                                if (var139 != null) {
                                    var5 += 86468675;
                                    var5 *= 110336451;
                                    var5 -= -321422395;
                                    var5 += 1395634904;
                                    var5 ^= 1231350630;
                                    var1.Ht("ui_click");
                                    return true;
                                }

                                switch (var5) {
                                    case -1135752303:
                                        var5 ^= -567626473;
                                        break;
                                    case 609001274:
                                        var5 |= -2041790179;
                                        var5 &= 1622972701;
                                        var5 |= -1893670871;
                                        var5 ^= -1136664015;
                                        break;
                                    case 960870271:
                                    default:
                                        var5 ^= 1897589621;
                                }
                            }
                        } else {
                            var5 ^= 666889018;
                            var5 *= -1055699395;
                            var5 ^= 167036182;
                        }
                    }
                }

                long var133 = var4;
                long var140 = var133 + 1L;
                long var141 = var133 * var140;
                long var214 = var133 + 2L;
                long var142 = var141 * var214;
                long var134 = var133 + 3L;
                long var143 = var142 * var134;
                long var135 = var143 & 7L;
                long var240;
                var5 = (var240 = var135 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                if (var5 == 0) {
                    AssertionError var138 = new AssertionError();
                    throw var138;
                }
                break label202;
            }

            Integer var168 = var4;
            if (var168 != null) {
                var1.Ht("ui_click");
                return true;
            }
        }

        IllegalArgumentException var137 = new IllegalArgumentException();
        throw var137;
    }

    @Override
    public void zx(boolean var1) {
        int var2 = Xd;
        var2 ^= 1867021774;
        int var3 = System.identityHashCode(this);
        long var16 = var3;
        long var5 = var16 + 1L;
        var5 = var16 * var5;
        long var17 = var5 & 1L;
        long var23;
        var3 = (var23 = var17 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 &= 998695632;
            var2 ^= 734259208;
            Integer var19 = var2;
            if (var19 != null) {
                this.wr = var1;
                return;
            }
        } else {
            var2 = switch (var2) {
                default -> var2 ^ -1127139052;
                case -169838038 -> var2 ^ 1516888792;
                case 576702948 -> {
                    var2 *= -1126350457;
                    var2 += -383531738;
                    yield var2 ^ 561057279;
                }
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            }
        }

        IllegalStateException var14 = new IllegalStateException();
        throw var14;
    }

    private void gN(int var1, int var2) {
        int var5 = System.identityHashCode(this);
        ModeSetting var6 = this.D;
        Enum[] var7 = this.KA;
        long var8 = var5;
        long var10 = var8 + 1L;
        var10 = var8 * var10;
        var8 = var10 & 1L;
        long var27;
        var5 = (var27 = var8 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var5 != 0) {
            int var3 = var2 - 1453711494;
            var3 ^= 309148834;
            Integer var23 = var1;
            if (var23 != null) {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            }
        } else {
            int var13 = var2 << 8;
            var13 |= 526944078;
            var13 >>= 16;
            var13 ^= -646044471;
            var13 = var1 + 1;
            var13 = var1 * var13;
            var13 &= 1;
            if (var13 == 0) {
                Enum var21 = var7[var1];
                var6.UY(var21);
                return;
            }
        }

        RuntimeException var20 = new RuntimeException();
        throw var20;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -550230479;
        int var2 = XR.Mz;
        int var4 = of_2.xF(var3, var1, var2);
        Xd = var4;
    }
}
