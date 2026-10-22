package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Re {
    private float e;
    private float wi;
    private float ar;
    private float s = Float.POSITIVE_INFINITY;
    public static final int nf;

    public Re(float var1, float var2) {
        this.e = var1;
        float var3 = Math.max(1.0E-4F, var2);
        this.ar = var3;
    }

    public Re N(float var1) {
        int var2 = nf;
        var2 ^= 1737462596;
        int var3 = System.identityHashCode(this);
        Integer var18 = var3;
        if (var18 == null) {
            var2 <<= 26;
            var2 &= -354434210;
            var2 >>>= 31;
            var2 ^= 905912400;
            UnsupportedOperationException var19 = new UnsupportedOperationException();
            throw var19;
        } else {
            var2 &= 617773106;
            var2 *= -1052141553;
            var2 ^= 1464738646;
            long var10 = var2;
            long var4 = var10 + 1L;
            var4 = var10 * var4;
            long var11 = var4 & 1L;
            long var21;
            var2 = (var21 = var11 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var2 == 0) {
                this.s = var1;
                return this;
            } else {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            }
        }
    }

    public void Q(float var1) {
        int var2 = nf;
        var2 ^= -1578818774;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 != 0) {
            var2 <<= 21;
            var2 >>>= 3;
            var2 -= 1149614493;
            var2 <<= 6;
            var2 ^= -1224489038;
            RuntimeException var20 = new RuntimeException();
            throw var20;
        } else {
            var2 |= 1707153823;
            var2 ^= -500401991;
            long var9 = var2;
            long var22 = var9 + 1L;
            long var23 = var9 * var22;
            long var10 = var23 & 1L;
            long var24;
            var2 = (var24 = var10 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var2 == 0) {
                float var13 = Math.max(1.0E-4F, var1);
                this.ar = var13;
            } else {
                AssertionError var12 = new AssertionError();
                throw var12;
            }
        }
    }

    public void v(float var1) {
        int var2 = nf;
        var2 ^= -1566436087;
        int var3 = System.identityHashCode(this);
        Integer var21 = var3;
        int var4 = of_2.dq;
        var2 ^= var4;
        var2 ^= 1054152787;
        of_2.dq = 1054152787;
        var4 = of_2.AE;
        var2 ^= var4;
        var2 ^= 2089348130;
        of_2.AE = 2089348130;
        if (var21 == null) {
            var2 *= 282736081;
            var2 += -520513147;
            var2 |= -852259679;
            var2 *= 400530317;
            var2 ^= 308229467;
            var21 = var2;
            if (var21 != null) {
                IllegalStateException var24 = new IllegalStateException();
                throw var24;
            } else {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        } else {
            switch (var2) {
                case -1081716370:
                    var2 ^= -342425094;
                    break;
                case -962871072:
                    var2 |= 2096464516;
                    var2 -= -2045478355;
                    var2 &= 696421167;
                    var2 ^= -576585580;
                    break;
                case 1734000714:
                default:
                    var2 ^= 1302662758;
            }

            this.e = var1;
            this.wi = 0.0F;
        }
    }

    public float ey() {
        int var1 = nf;
        var1 ^= -2116132446;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 -= -1374016742;
            var1 <<= 15;
            var1 ^= -1889973094;
            var13 = var1;
            if (var13 == null) {
                AssertionError var15 = new AssertionError();
                throw var15;
            } else {
                return this.e;
            }
        } else {
            var1 += 668553233;
            var1 ^= -1282405985;
            var1 -= -957666616;
            var1 |= -575074343;
            var1 ^= 904891454;
            IllegalArgumentException var9 = new IllegalArgumentException();
            throw var9;
        }
    }

    public float Gc(float var1, float var2) {
        label111: {
            int var3 = nf;
            var3 ^= 822947462;
            int var4 = System.identityHashCode(this);
            float var225;
            int var5 = (var225 = var2 - 0.0F) == 0.0F ? 0 : (var225 < 0.0F ? -1 : 1);
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var226;
            int var131 = (var226 = var6 - 0L) == 0L ? 0 : (var226 < 0L ? -1 : 1);
            int var7 = of_2.dq;
            var3 ^= var7;
            var3 ^= 1054152787;
            var7 = of_2.AE;
            var3 ^= var7;
            var3 ^= 2089348130;
            if (var131 != 0) {
                var3 -= -1773858253;
                var3 ^= 512797153;
            } else {
                var3 |= -1672880698;
                var3 ^= 834448311;
                if (var5 <= 0) {
                    var3 |= -1941636205;
                    var3 += 2052267393;
                    var3 |= -1572954295;
                    var3 >>= 17;
                    var3 ^= -1670176845;
                    return this.e;
                }

                var3 -= -1718863778;
                var3 += -1967074057;
                var3 ^= 1290695691;
                var3 -= -1151673206;
                var3 ^= -162301204;
                var5 = var3 + 1;
                var5 = var3 * var5;
                var5 &= 1;
                if (var5 != 0) {
                    break label111;
                }

                float var121 = this.ar;
                float var122 = 2.0F / var121;
                float var132 = var122 * var2;
                float var153 = 1.0F + var132;
                float var176 = 0.48F * var132;
                float var177 = var176 * var132;
                float var154 = var153 + var177;
                float var178 = 0.235F * var132;
                float var179 = var178 * var132;
                float var133 = var179 * var132;
                float var134 = var154 + var133;
                float var135 = 1.0F / var134;
                float var155 = this.e;
                float var156 = var155 - var1;
                float var180 = this.s;
                float var9 = this.ar;
                int var10 = var4 + 1;
                var10 = var4 * var10;
                int var11 = var4 + 2;
                var10 *= var11;
                var11 = var4 + 3;
                var10 *= var11;
                var10 &= 7;
                if (var10 == 0) {
                    var3 -= 1139090036;
                    var3 &= -502934244;
                    var3 |= 1550842373;
                    var3 <<= 20;
                    var3 ^= 1005721455;
                    var10 = var3 + 1;
                    var10 = var3 * var10;
                    var10 &= 1;
                    if (var10 != 0) {
                        break label111;
                    }

                    float var181 = var180 * var9;
                    var9 = -var181;
                    float var182 = Math.min(var181, var156);
                    float var183 = Math.max(var9, var182);
                    float var184 = this.e;
                    float var185 = var184 - var183;
                    var9 = this.wi;
                    float var218 = var122 * var183;
                    var9 += var218;
                    var9 *= var2;
                    float var219 = this.wi;
                    float var123 = var122 * var9;
                    float var124 = var219 - var123;
                    float var125 = var124 * var135;
                    this.wi = var125;
                    float var126 = var183 + var9;
                    float var127 = var126 * var135;
                    float var128 = var185 + var127;
                    float var136 = this.e;
                    float var137 = var1 - var136;
                    float var227;
                    int var138 = (var227 = var137 - 0.0F) == 0.0F ? 0 : (var227 < 0.0F ? -1 : 1);
                    boolean var143;
                    if (var138 > 0) {
                        var3 &= 1715213415;
                        var3 ^= 378622357;
                        var3 ^= 1111024617;
                        var6 = var3;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var220 = var6 + 2L;
                        var8 *= var220;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var228;
                        int var142 = (var228 = var6 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                        if (var142 != 0) {
                            break label111;
                        }

                        var143 = true;
                        var3 ^= -1519646292;
                        var3 |= -1730547854;
                        var3 &= -1403812280;
                        var3 ^= 210968819;
                        var3 ^= -1743277032;
                    } else {
                        var3 <<= 24;
                        var3 ^= 2088508781;
                        var3 >>= 25;
                        var3 ^= 210623625;
                        var143 = false;
                        var3 &= 1411149253;
                        var3 *= -175703797;
                        var3 ^= -1858413781;
                    }

                    long var158 = var3;
                    long var205 = var158 + 1L;
                    long var206 = var158 * var205;
                    long var224 = var158 + 2L;
                    long var207 = var206 * var224;
                    long var159 = var158 + 3L;
                    long var208 = var207 * var159;
                    long var160 = var208 & 7L;
                    long var229;
                    var7 = (var229 = var160 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label111;
                    }

                    float var230;
                    var7 = (var230 = var128 - var1) == 0.0F ? 0 : (var230 < 0.0F ? -1 : 1);
                    Integer var190 = var4;
                    if (var190 == null) {
                        var3 >>= 1;
                        var3 ^= 1685008134;
                        var3 |= -1264776408;
                        var3 ^= 1591930790;
                    } else {
                        label119: {
                            var3 = switch (var3) {
                                case -977891482 -> var3 ^ -505230054;
                                default -> var3 ^ 1742552582;
                                case 1020596907 -> {
                                    var3 += 841442418;
                                    var3 *= -2009703949;
                                    var3 *= 511495187;
                                    yield var3 ^ -1323155915;
                                }
                            };
                            var8 = var3;
                            long var221 = var8 + 1L;
                            long var222 = var8 * var221;
                            var8 = var222 & 1L;
                            long var231;
                            int var193 = (var231 = var8 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                            if (var193 != 0) {
                                break label111;
                            }

                            int var163;
                            if (var7 > 0) {
                                var3 &= 461000722;
                                var3 ^= -1719813853;
                                var163 = 1;
                                var3 -= -235630124;
                                var3 *= -595203077;
                                var3 += -462192745;
                                var3 -= -83399829;
                                var3 ^= -952263141;
                            } else {
                                var3 &= 770200625;
                                var3 -= 583647598;
                                var3 |= -264523465;
                                var3 ^= -2099837912;
                                var3 ^= 474780971;
                                int var194 = var3 + 1;
                                int var195 = var3 * var194;
                                int var209 = var3 + 2;
                                int var196 = var195 * var209;
                                int var210 = var3 + 3;
                                int var197 = var196 * var210;
                                int var198 = var197 & 7;
                                if (var198 != 0) {
                                    break label111;
                                }

                                var163 = 0;
                                var3 += 1968291382;
                                var3 -= -1443504227;
                                var3 *= 134198925;
                                var3 -= -920279523;
                                var3 ^= -885754938;
                            }

                            float var149;
                            if (var143 == (var163 != 0)) {
                                var3 |= 1092817544;
                                var3 &= -960240115;
                                var3 |= -2088961139;
                                var3 <<= 25;
                                var3 ^= 1142931072;
                                int var144 = var3 + 1;
                                int var145 = var3 * var144;
                                var163 = var3 + 2;
                                int var146 = var145 * var163;
                                var163 = var3 + 3;
                                int var147 = var146 * var163;
                                int var148 = var147 & 7;
                                if (var148 != 0) {
                                    break label111;
                                }

                                float var166 = var1 - var1;
                                float var167 = var166 / var2;
                                this.wi = var167;
                                var163 = var4 + 1;
                                var163 = var4 * var163;
                                int var199 = var4 + 2;
                                var163 *= var199;
                                int var200 = var4 + 3;
                                var163 *= var200;
                                var163 &= 7;
                                if (var163 != 0) {
                                    var3 |= 1511973488;
                                    var3 += 2012880342;
                                    var3 += 818977441;
                                    var3 ^= -1500121158;
                                    break label119;
                                }

                                var3 ^= 810782374;
                                var3 += -506842630;
                                var3 *= -1470812879;
                                var3 -= 1254714709;
                                var3 ^= -561882130;
                                Integer var173 = var3;
                                if (var173 == null) {
                                    break label111;
                                }

                                var149 = var1;
                                var3 &= -121744398;
                                var3 -= 1822301715;
                                var3 >>= 8;
                                var3 ^= 269447817;
                            } else {
                                var3 ^= 1151180361;
                                var3 ^= -1065392727;
                                Integer var174 = var3;
                                if (var174 == null) {
                                    break label111;
                                }

                                var149 = var128;
                                var3 += -1728030045;
                                var3 >>>= 7;
                                var3 &= -1942947230;
                                var3 *= 816545867;
                                var3 ^= 416431676;
                            }

                            this.e = var149;
                            long var111 = var4;
                            var6 = var111 + 1L;
                            var6 = var111 * var6;
                            long var112 = var6 & 1L;
                            long var232;
                            var4 = (var232 = var112 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                            if (var4 == 0) {
                                var3 &= -159953599;
                                var3 ^= -718892399;
                                return this.e;
                            }

                            var3 <<= 31;
                            var3 -= 1149374664;
                            var3 += 798339131;
                            var3 += -2018952657;
                            var3 ^= -758933121;
                        }
                    }
                } else {
                    var3 >>= 11;
                    var3 <<= 27;
                    var3 &= -833092335;
                    var3 *= -1542026595;
                    var3 ^= 1618952413;
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            var5 = var3 + 2;
            var4 *= var5;
            var3 += 3;
            var4 *= var3;
            var3 = var4 & 7;
            if (var3 == 0) {
                RuntimeException var104 = new RuntimeException();
                throw var104;
            }
        }

        IllegalStateException var105 = new IllegalStateException();
        throw var105;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1208361240;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        nf = var4;
    }
}
