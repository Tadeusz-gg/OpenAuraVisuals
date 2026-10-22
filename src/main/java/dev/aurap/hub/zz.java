package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class zz {
    private static final double pH = 0.001;
    private kE_2 F;
    private double d;
    private double R;
    private double X;
    public static final int M;

    public zz(kE_2 var1, float var2) {
        this.F = var1;
        double var3 = var2;
        this.d = var3;
        var3 = var2;
        this.X = var3;
    }

    public zz(kE_2 var1) {
        this(var1, 0.0F);
    }

    public void L(kE_2 var1) {
        int var2 = M;
        var2 ^= -1188623850;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 == 0) {
            switch (var2) {
                case -1457485571:
                    var2 ^= -281953418;
                    var2 ^= -13699736;
                    var2 += -389091856;
                    var2 >>= 27;
                    var2 ^= -850456905;
                    break;
                case 899667812:
                default:
                    var2 ^= -1228626892;
                    break;
                case 1177384152:
                    var2 ^= 1136734327;
            }

            this.F = var1;
        } else {
            switch (var2) {
                case -1457485571:
                    var2 *= -343250323;
                    var2 -= 346667994;
                    var2 &= -1276497231;
                    var2 ^= -2077629195;
                    break;
                case 888836838:
                    var2 ^= -1923356952;
                    break;
                case 1198519678:
                default:
                    var2 ^= -499654487;
            }

            RuntimeException var12 = new RuntimeException();
            throw var12;
        }
    }

    public kE_2 g() {
        int var1 = M;
        var1 ^= -2035818440;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 += 1824840187;
            var1 <<= 1;
            var1 >>= 9;
            var1 ^= -581306595;
            long var24 = var1;
            long var35 = var24 + 1L;
            long var36 = var24 * var35;
            long var25 = var36 & 1L;
            long var37;
            var2 = (var37 = var25 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        } else {
            var1 += -2137462303;
            var1 &= 749980447;
            var1 -= -545430327;
            var1 <<= 19;
            var1 ^= 1231342095;
            long var17 = var1;
            long var31 = var17 + 1L;
            long var32 = var17 * var31;
            long var5 = var17 + 2L;
            long var33 = var32 * var5;
            long var18 = var17 + 3L;
            long var34 = var33 * var18;
            long var19 = var34 & 7L;
            long var38;
            var1 = (var38 = var19 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.F;
            }
        }

        UnsupportedOperationException var21 = new UnsupportedOperationException();
        throw var21;
    }

    public void Td(float var1) {
        int var2 = M;
        var2 ^= 145551608;
        int var3 = System.identityHashCode(this);
        double var4 = var1;
        Integer var18 = var3;
        int var6 = of_2.c;
        var2 ^= var6;
        var2 ^= 1699975548;
        of_2.c = 1699975548;
        var6 = of_2.zP;
        var2 ^= var6;
        var2 ^= -122377665;
        of_2.zP = -122377665;
        if (var18 == null) {
            var2 ^= 2018427248;
            var2 -= 1636238758;
            var2 <<= 11;
            var2 ^= 1833064121;
            UnsupportedOperationException var19 = new UnsupportedOperationException();
            throw var19;
        } else {
            var2 += 1234113390;
            var2 ^= -881648977;
            this.X = var4;
        }
    }

    public void p(float var1) {
        int var2 = M;
        var2 ^= 1424931592;
        int var3 = System.identityHashCode(this);
        double var4 = var1;
        this.d = var4;
        var4 = var1;
        long var6 = var3;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var39;
        var3 = (var39 = var6 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        int var34 = of_2.c;
        var2 ^= var34;
        var2 ^= 1699975548;
        int var35 = of_2.zP;
        var2 ^= var35;
        var2 ^= -122377665;
        if (var3 != 0) {
            var2 -= 443795995;
            var2 += 2044726620;
            var2 ^= -1846903209;
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var36 = var2 + 2;
            var3 *= var36;
            int var37 = var2 + 3;
            var3 *= var37;
            var3 &= 7;
            if (var3 == 0) {
                IllegalArgumentException var31 = new IllegalArgumentException();
                throw var31;
            }
        } else {
            Integer var23 = switch (var2) {
                case 426526973 -> var2 ^ 344250075;
                case 1156135395 -> {
                    var2 ^= 142447235;
                    var2 >>>= 8;
                    var2 += -1157361579;
                    var2 -= -1532011009;
                    yield var2 ^ -633460691;
                }
                default -> var2 ^ 361944298;
            };
            if (var23 != null) {
                this.X = var4;
                this.R = 0.0;
                return;
            }
        }

        IllegalStateException var24 = new IllegalStateException();
        throw var24;
    }

    public void Z(float var1) {
        int var2 = M;
        var2 ^= 790590537;
        int var3 = System.identityHashCode(this);
        double var4 = this.R;
        int var6 = var3 + 1;
        var6 = var3 * var6;
        var3 = var6 & 1;
        if (var3 == 0) {
            switch (var2) {
                case -730523589:
                default:
                    var2 ^= -161120345;
                    break;
                case -664484129:
                    var2 ^= -677680233;
                    break;
                case 1058600610:
                    var2 -= 662845866;
                    var2 ^= 288812029;
            }

            double var24 = var1;
            double var22 = var4 + var24;
            this.R = var22;
        } else {
            var2 = switch (var2) {
                default -> var2 ^ -389509812;
                case -1297524643 -> var2 ^ 1918414187;
                case 1058600610 -> {
                    var2 |= 1432137153;
                    var2 *= 1893796735;
                    yield var2 ^ -854454876;
                }
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 != 0) {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            } else {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            }
        }
    }

    public float qm() {
        int var1 = M;
        var1 ^= -100899437;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 != null) {
            switch (var1) {
                case -1106625852:
                default:
                    var1 ^= -649270122;
                    break;
                case -509540161:
                    var1 ^= 1899930823;
                    break;
                case -369367176:
                    var1 |= 1639239419;
                    var1 *= -1439619807;
                    var1 ^= -2026727787;
            }

            double var18 = this.d;
            return (float)var18;
        } else {
            var1 -= -772606812;
            var1 ^= 662098681;
            var1 |= 1205462432;
            var1 ^= -637684150;
            Integer var9 = var1;
            if (var9 == null) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            }
        }
    }

    public float f() {
        int var1 = M;
        var1 ^= -1949936076;
        int var2 = System.identityHashCode(this);
        double var3 = this.R;
        int var5 = var2 + 1;
        var5 = var2 * var5;
        int var6 = var2 + 2;
        var5 *= var6;
        var2 += 3;
        var5 *= var2;
        var2 = var5 & 7;
        if (var2 != 0) {
            switch (var1) {
                case -1681795873:
                    var1 <<= 27;
                    var1 ^= -1739490081;
                    var1 |= 460283230;
                    var1 |= -1260064616;
                    var1 ^= 668159267;
                    break;
                case -1279499771:
                    var1 ^= 1179410661;
                    break;
                case -446796512:
                default:
                    var1 ^= 86001192;
            }

            IllegalStateException var29 = new IllegalStateException();
            throw var29;
        } else {
            long var15 = switch (var1) {
                case -1681795873 -> {
                    var1 |= 334466179;
                    var1 *= -808660547;
                    var1 += 1426930590;
                    var1 &= 1151187872;
                    yield var1 ^ -1431901260;
                }
                default -> var1 ^ -1356699953;
                case 1546540851 -> var1 ^ -2113448539;
            };
            long var33 = var15 + 1L;
            long var34 = var15 * var33;
            long var7 = var15 + 2L;
            long var35 = var34 * var7;
            long var16 = var15 + 3L;
            long var36 = var35 * var16;
            long var17 = var36 & 7L;
            long var37;
            var1 = (var37 = var17 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                return (float)var3;
            } else {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        }
    }

    public float I() {
        int var1 = M;
        var1 ^= 541025139;
        int var2 = System.identityHashCode(this);
        double var3 = this.X;
        Integer var14 = var2;
        if (var14 == null) {
            var1 |= -1794345941;
            var1 -= -2075676517;
            var1 ^= 1630475715;
            var14 = var1;
            if (var14 != null) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            }
        } else {
            var1 -= 1760373360;
            var1 &= -452636715;
            var1 ^= -1055715723;
            Integer var12 = var1;
            if (var12 != null) {
                return (float)var3;
            }
        }

        RuntimeException var13 = new RuntimeException();
        throw var13;
    }

    public boolean iY() {
        label62: {
            int var1 = M;
            var1 ^= -292802780;
            int var2 = System.identityHashCode(this);
            double var3 = this.d;
            double var5 = this.X;
            var3 -= var5;
            var3 = Math.abs(var3);
            int var62 = var2 + 1;
            int var63 = var2 * var62;
            int var6 = var2 + 2;
            int var64 = var63 * var6;
            var6 = var2 + 3;
            int var65 = var64 * var6;
            int var66 = var65 & 7;
            if (var66 != 0) {
                var1 ^= -1403876398;
                var1 += -321027711;
                var1 ^= 135287754;
            } else {
                label71: {
                    var1 += -505597369;
                    var1 |= -362879154;
                    var1 ^= -132561870;
                    var1 ^= -1505057794;
                    int var67 = var1 + 1;
                    int var68 = var1 * var67;
                    var6 = var1 + 2;
                    int var69 = var68 * var6;
                    var6 = var1 + 3;
                    int var70 = var69 * var6;
                    int var71 = var70 & 7;
                    if (var71 != 0) {
                        break label62;
                    }

                    double var79;
                    int var51 = (var79 = var3 - 0.001) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
                    if (var51 < 0) {
                        var1 = switch (var1) {
                            default -> var1 ^ -1596734579;
                            case -1272119150 -> {
                                var1 *= -468075473;
                                var1 += 2104602775;
                                var1 *= 922620561;
                                yield var1 ^ -979571715;
                            }
                            case 13641570 -> var1 ^ -1640000407;
                        };
                        var3 = this.R;
                        var3 = Math.abs(var3);
                        double var80;
                        int var54 = (var80 = var3 - 0.001) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
                        long var4 = var2;
                        long var75 = var4 + 1L;
                        long var76 = var4 * var75;
                        long var8 = var4 + 2L;
                        long var77 = var76 * var8;
                        var4 += 3L;
                        long var78 = var77 * var4;
                        var4 = var78 & 7L;
                        long var81;
                        var2 = (var81 = var4 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            var1 |= 1028727000;
                            var1 ^= 458222363;
                            var1 *= 1630821969;
                            var1 ^= 640371175;
                            break label71;
                        }

                        var1 >>>= 10;
                        var1 -= -1317412954;
                        var1 &= -79233809;
                        var1 ^= 1443733878;
                        Integer var47 = var1;
                        if (var47 == null) {
                            break label62;
                        }

                        if (var54 < 0) {
                            var1 &= -1988555869;
                            var1 >>>= 30;
                            var1 |= -1237775157;
                            var1 *= 276794867;
                            var1 ^= -1123400303;
                            boolean var48 = true;
                            var1 += -1728516178;
                            var1 |= 58398070;
                            var1 ^= 1838853645;
                            return var48;
                        }

                        var1 += 611007274;
                        var1 ^= -248857549;
                    } else {
                        var1 ^= -1479718852;
                        var1 <<= 13;
                        var1 ^= -500435851;
                        var1 ^= -1008621630;
                        var1 ^= -1719567399;
                    }

                    int var55 = var1 + 1;
                    int var56 = var1 * var55;
                    int var57 = var56 & 1;
                    if (var57 != 0) {
                        break label62;
                    }

                    boolean var82 = false;
                    var1 &= 1696141182;
                    var1 ^= 662508445;
                    return var82;
                }
            }

            Integer var58 = var1;
            if (var58 != null) {
                RuntimeException var59 = new RuntimeException();
                throw var59;
            }
        }

        RuntimeException var45 = new RuntimeException();
        throw var45;
    }

    public float et(float var1) {
        label157: {
            int var2 = M;
            var2 ^= 360365152;
            int var3 = System.identityHashCode(this);
            float var308;
            int var4 = (var308 = var1 - 0.0F) == 0.0F ? 0 : (var308 < 0.0F ? -1 : 1);
            int var5 = var3 + 1;
            var5 = var3 * var5;
            var5 &= 1;
            if (var5 != 0) {
                var2 ^= 1357360774;
                var2 &= -515199510;
                var2 ^= -1174773738;
            } else {
                var2 >>= 8;
                var2 *= 13069839;
                var2 |= -1970151063;
                var2 -= 601722280;
                var2 ^= 1848679603;
                if (var4 <= 0) {
                    var2 = switch (var2) {
                        default -> var2 ^ -593089161;
                        case -532632603 -> var2 ^ 584272750;
                        case -171379984 -> {
                            var2 ^= -581407023;
                            yield var2 ^ 1103165742;
                        }
                    };
                    double var136 = this.d;
                    int var6 = var3 + 1;
                    var6 = var3 * var6;
                    int var7 = var3 + 2;
                    var6 *= var7;
                    var7 = var3 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 == 0) {
                        var2 -= 1034848133;
                        var2 *= 314906653;
                        var2 &= -976375356;
                        var2 += -1525199169;
                        var2 ^= -287840903;
                        Integer var180 = var2;
                        if (var180 != null) {
                            return (float)var136;
                        }
                        break label157;
                    }

                    var2 <<= 16;
                    var2 ^= -444571008;
                    var2 ^= 2021622430;
                } else {
                    var2 ^= -812778784;
                    var2 ^= -731684296;
                    var2 += -341165707;
                    var2 ^= -1456801495;
                    long var137 = var2;
                    long var181 = var137 + 1L;
                    var181 = var137 * var181;
                    long var8 = var137 + 2L;
                    var181 *= var8;
                    long var138 = var137 + 3L;
                    var181 *= var138;
                    long var139 = var181 & 7L;
                    long var309;
                    var4 = (var309 = var139 - 0L) == 0L ? 0 : (var309 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label157;
                    }

                    int var141 = this.iY() ? 1 : 0;
                    long var169 = var3;
                    long var223 = var169 + 1L;
                    var223 = var169 * var223;
                    long var9 = var169 + 2L;
                    var223 *= var9;
                    long var170 = var169 + 3L;
                    var223 *= var170;
                    long var171 = var223 & 7L;
                    long var310;
                    var5 = (var310 = var171 - 0L) == 0L ? 0 : (var310 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        var2 >>>= 26;
                        var2 &= -1778955213;
                        var2 ^= 1162283853;
                        var2 >>= 11;
                        var2 ^= -117946113;
                    } else {
                        var2 <<= 17;
                        var2 *= -986817077;
                        var2 ^= 674269987;
                        var5 = var2 + 1;
                        var5 = var2 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            break label157;
                        }

                        if (var141 != 0) {
                            var2 &= -1827519336;
                            var2 ^= 940833219;
                            long var142 = var2;
                            var181 = var142 + 1L;
                            var181 = var142 * var181;
                            var8 = var142 + 2L;
                            var181 *= var8;
                            long var143 = var142 + 3L;
                            var181 *= var143;
                            long var144 = var181 & 7L;
                            long var311;
                            var141 = (var311 = var144 - 0L) == 0L ? 0 : (var311 < 0L ? -1 : 1);
                            if (var141 != 0) {
                                break label157;
                            }

                            double var146 = this.X;
                            this.d = var146;
                            var141 = var3 + 1;
                            var141 = var3 * var141;
                            var141 &= 1;
                            if (var141 == 0) {
                                var2 >>>= 9;
                                var2 ^= -1112335193;
                                long var150 = var2;
                                var181 = var150 + 1L;
                                var181 = var150 * var181;
                                var8 = var150 + 2L;
                                var181 *= var8;
                                long var151 = var150 + 3L;
                                var181 *= var151;
                                long var152 = var181 & 7L;
                                long var312;
                                var141 = (var312 = var152 - 0L) == 0L ? 0 : (var312 < 0L ? -1 : 1);
                                if (var141 == 0) {
                                    this.R = 0.0;
                                    double var154 = this.d;
                                    return (float)var154;
                                }
                                break label157;
                            }

                            var2 &= 489203546;
                            var2 &= -1477813206;
                            var2 -= -1618373910;
                            var2 += -530658399;
                            var2 ^= -1188702041;
                        } else {
                            var2 ^= 71344916;
                            var2 += 1510128328;
                            var2 ^= 248794206;
                            var2 -= 230397561;
                            var2 ^= -2138747695;
                            kE_2 var155 = this.F;
                            float var156 = var155.stiffness();
                            double var157 = var156;
                            double var158 = Math.sqrt(var157);
                            kE_2 var193 = this.F;
                            int var227 = var3 + 1;
                            int var228 = var3 * var227;
                            int var235 = var3 + 2;
                            int var229 = var228 * var235;
                            int var236 = var3 + 3;
                            int var230 = var229 * var236;
                            int var231 = var230 & 7;
                            label150:
                            if (var231 == 0) {
                                var2 -= 1224990685;
                                var2 ^= -1212936410;
                                Integer var232 = var2;
                                if (var232 == null) {
                                    break label157;
                                }

                                float var194 = var193.damping();
                                double var195 = var194;
                                double var237 = 2.0 * var158;
                                double var196 = var195 / var237;
                                double var238 = this.d;
                                double var10 = this.X;
                                double var239 = var238 - var10;
                                var10 = this.R;
                                double var313;
                                int var12 = (var313 = var196 - 0.999999) == 0.0 ? 0 : (var313 < 0.0 ? -1 : 1);
                                double var271;
                                double var279;
                                if (var12 < 0) {
                                    var2 += -1841450347;
                                    var2 -= -924122071;
                                    var2 ^= 803009134;
                                    var12 = var2 + 1;
                                    var12 = var2 * var12;
                                    var12 &= 1;
                                    if (var12 != 0) {
                                        break label157;
                                    }

                                    double var246 = var196 * var196;
                                    double var247 = 1.0 - var246;
                                    double var248 = Math.sqrt(var247);
                                    double var249 = var158 * var248;
                                    double var14 = -var196;
                                    var14 *= var158;
                                    double var16 = var1;
                                    var14 *= var16;
                                    var14 = Math.exp(var14);
                                    var16 = var1;
                                    var16 = var249 * var16;
                                    var16 = Math.cos(var16);
                                    double var18 = var1;
                                    var18 = var249 * var18;
                                    var18 = Math.sin(var18);
                                    var271 = var239 * var16;
                                    var279 = var196 * var158;
                                    var279 *= var239;
                                    var279 = var10 + var279;
                                    var279 /= var249;
                                    var279 *= var18;
                                    var271 += var279;
                                    var271 = var14 * var271;
                                    var279 = var10 * var16;
                                    double var24 = var196 * var158;
                                    var24 *= var10;
                                    double var26 = var158 * var158;
                                    var26 *= var239;
                                    var24 += var26;
                                    var24 /= var249;
                                    var24 *= var18;
                                    var279 -= var24;
                                    var279 = var14 * var279;
                                    Integer var284 = var3;
                                    if (var284 == null) {
                                        var2 -= -1941148844;
                                        var2 += -891031516;
                                        var2 <<= 25;
                                        var2 ^= -923738082;
                                        break label150;
                                    }

                                    var2 -= -1658777532;
                                    var2 -= 56184612;
                                    var2 ^= -1227793134;
                                    var271 = var271;
                                    var279 = var279;
                                    var2 |= -816931630;
                                    var2 ^= -742118563;
                                } else {
                                    var2 = switch (var2) {
                                        case -1542030790 -> {
                                            var2 |= -896163471;
                                            var2 ^= 121176569;
                                            var2 ^= -1091305224;
                                            var2 -= -480096686;
                                            yield var2 ^ -1088346953;
                                        }
                                        case -1468742037 -> var2 ^ -474470993;
                                        default -> var2 ^ -78102004;
                                    };
                                    Integer var285 = var2;
                                    if (var285 == null) {
                                        break label157;
                                    }

                                    double var314;
                                    int var286 = (var314 = var196 - 1.000001) == 0.0 ? 0 : (var314 < 0.0 ? -1 : 1);
                                    Integer var25 = var3;
                                    if (var25 == null) {
                                        var2 <<= 20;
                                        var2 ^= 1895882782;
                                        break label150;
                                    }

                                    var2 -= 263185137;
                                    var2 >>= 8;
                                    var2 += -298050557;
                                    var2 -= 1762301599;
                                    var2 ^= -1562877058;
                                    if (var286 > 0) {
                                        var2 += 1797201679;
                                        var2 -= 1539337256;
                                        var2 ^= -75924344;
                                        double var287 = var196 * var196;
                                        double var289 = Math.sqrt(--var287);
                                        double var290 = -var158;
                                        double var302 = var196 - var289;
                                        double var291 = var290 * var302;
                                        double var292 = -var158;
                                        double var197 = var196 + var289;
                                        double var198 = var292 * var197;
                                        var181 = var3;
                                        long var293 = var181 + 1L;
                                        long var294 = var181 * var293;
                                        long var303 = var181 + 2L;
                                        long var295 = var294 * var303;
                                        var181 += 3L;
                                        long var296 = var295 * var181;
                                        var181 = var296 & 7L;
                                        long var315;
                                        int var202 = (var315 = var181 - 0L) == 0L ? 0 : (var315 < 0L ? -1 : 1);
                                        if (var202 != 0) {
                                            switch (var2) {
                                                case -823393322:
                                                    var2 += 536970600;
                                                    var2 -= 280793368;
                                                    var2 *= 1182146019;
                                                    var2 |= -1975560216;
                                                    var2 ^= 667924452;
                                                    break label150;
                                                case 316811186:
                                                default:
                                                    var2 ^= 1321463429;
                                                    break label150;
                                                case 1540423516:
                                                    var2 ^= -1332240954;
                                                    break label150;
                                            }
                                        }

                                        var2 &= 1684040851;
                                        var2 ^= 1184880961;
                                        double var203 = var291 * var239;
                                        double var204 = var10 - var203;
                                        double var297 = var198 - var291;
                                        double var205 = var204 / var297;
                                        double var206 = var239 - var205;
                                        double var298 = var1;
                                        double var299 = var291 * var298;
                                        double var300 = Math.exp(var299);
                                        var302 = var1;
                                        var302 = var198 * var302;
                                        var302 = Math.exp(var302);
                                        double var28 = var206 * var300;
                                        double var30 = var205 * var302;
                                        var28 += var30;
                                        double var207 = var206 * var291;
                                        double var208 = var207 * var300;
                                        double var261 = var205 * var198;
                                        var261 *= var302;
                                        double var209 = var208 + var261;
                                        var271 = var28;
                                        var279 = var209;
                                        switch (var2) {
                                            case -666325059:
                                                var2 ^= -403267898;
                                                break;
                                            case 50321875:
                                                var2 *= 1440576385;
                                                var2 &= -1869914681;
                                                var2 ^= -1935435284;
                                                break;
                                            case 1026853228:
                                            default:
                                                var2 ^= 9893392;
                                        }
                                    } else {
                                        var2 -= 2986259;
                                        var2 += -148040736;
                                        var2 += -265917921;
                                        var2 += 520332070;
                                        var2 ^= 2045989336;
                                        var181 = var2;
                                        long var263 = var181 + 1L;
                                        var263 = var181 * var263;
                                        var181 = var263 & 1L;
                                        long var316;
                                        int var212 = (var316 = var181 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                                        if (var212 != 0) {
                                            break label157;
                                        }

                                        double var213 = -var158;
                                        double var265 = var1;
                                        double var214 = var213 * var265;
                                        double var215 = Math.exp(var214);
                                        double var216 = var158 * var239;
                                        double var217 = var10 + var216;
                                        double var218 = var1;
                                        double var219 = var217 * var218;
                                        double var220 = var239 + var219;
                                        Integer var240 = var3;
                                        if (var240 == null) {
                                            var2 ^= 400021227;
                                            var2 ^= -1162593372;
                                            break label150;
                                        }

                                        var2 ^= 342565968;
                                        var2 ^= -1763952484;
                                        var2 |= 539266119;
                                        var2 *= -1302518423;
                                        var2 ^= 258730846;
                                        double var221 = var220 * var215;
                                        double var159 = var158 * var217;
                                        double var241 = var1;
                                        double var160 = var159 * var241;
                                        double var161 = var10 - var160;
                                        double var162 = var161 * var215;
                                        var271 = var221;
                                        var279 = var162;
                                        switch (var2) {
                                            case -183085332:
                                                var2 ^= -939421301;
                                                break;
                                            case 531828777:
                                                var2 -= -1687994460;
                                                var2 <<= 13;
                                                var2 += -120869340;
                                                var2 &= -859799456;
                                                var2 ^= -857041521;
                                                break;
                                            case 1842361931:
                                            default:
                                                var2 ^= -59042619;
                                        }
                                    }
                                }

                                var141 = var2 + 1;
                                var141 = var2 * var141;
                                var141 &= 1;
                                if (var141 != 0) {
                                    break label157;
                                }

                                double var166 = this.X;
                                Integer var133 = var3;
                                if (var133 != null) {
                                    var2 |= -1703647588;
                                    var2 ^= 677090087;
                                    double var134 = var166 + var271;
                                    this.d = var134;
                                    this.R = var279;
                                    double var135 = this.d;
                                    return (float)var135;
                                }

                                var2 &= -762475397;
                                var2 >>= 11;
                                var2 *= -818628467;
                                var2 ^= -789252658;
                            } else {
                                var2 <<= 13;
                                var2 ^= 846184478;
                            }
                        }
                    }
                }
            }

            Integer var130 = var2;
            if (var130 != null) {
                IllegalStateException var131 = new IllegalStateException();
                throw var131;
            }
        }

        RuntimeException var132 = new RuntimeException();
        throw var132;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -85360045;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        M = var4;
    }
}
