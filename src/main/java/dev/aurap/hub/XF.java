package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class XF {
    private final zz a;
    private bW w;
    private float pf;
    private float n;
    private float RF;
    private float O;
    private float Ln;
    private Lv S;
    private float WA;
    private float bo;
    public static final int A;

    public XF(float var1, kE_2 var2) {
        bW var3 = bW.IDLE;
        this.w = var3;
        Lv var4 = sT_2.S;
        this.S = var4;
        this.pf = var1;
        this.n = var1;
        zz var5 = new zz(var2, var1);
        this.a = var5;
    }

    public XF(float var1) {
        this(var1, kE_2.SMOOTH);
    }

    public float bs() {
        int var1 = A;
        var1 ^= -2022469939;
        int var2 = System.identityHashCode(this);
        Integer var21 = var2;
        int var3 = of_2.qG;
        var1 ^= var3;
        var1 ^= 1220043223;
        of_2.qG = 1220043223;
        var3 = of_2.V;
        var1 ^= var3;
        var1 ^= 2118306304;
        of_2.V = 2118306304;
        if (var21 != null) {
            var1 &= -544529406;
            var1 &= 1200191430;
            var1 -= -490187790;
            var1 ^= 547312576;
            return this.pf;
        } else {
            var1 &= -1583273865;
            var1 ^= 1045014928;
            long var12 = var1;
            long var23 = var12 + 1L;
            long var24 = var12 * var23;
            long var13 = var24 & 1L;
            long var25;
            var1 = (var25 = var13 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var1 == 0) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }
    }

    public float O() {
        int var1 = A;
        var1 ^= 606897346;
        int var2 = System.identityHashCode(this);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var16 = var4 & 1L;
        long var21;
        var2 = (var21 = var16 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= -1302648561;
            var1 *= -1405705411;
            var1 += -416000071;
            var1 ^= 532373319;
            Integer var18 = var1;
            if (var18 != null) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            }
        } else {
            var1 *= -1965906291;
            var1 ^= -1054035775;
            Integer var13 = var1;
            if (var13 != null) {
                return this.n;
            }
        }

        UnsupportedOperationException var14 = new UnsupportedOperationException();
        throw var14;
    }

    public boolean Ef() {
        int var1 = A;
        var1 ^= 1834560002;
        int var2 = System.identityHashCode(this);
        bW var3 = this.w;
        bW var4 = bW.IDLE;
        Integer var28 = var2;
        if (var28 == null) {
            var1 ^= 2058939404;
            var1 += -1222157226;
            var1 ^= 508168281;
            RuntimeException var35 = new RuntimeException();
            throw var35;
        } else {
            var1 = switch (var1) {
                case -1650209055 -> {
                    var1 ^= -1799987761;
                    var1 &= -1447778691;
                    yield var1 ^ -337139064;
                }
                case -430718535 -> var1 ^ -2095759518;
                default -> var1 ^ 777750497;
            };
            int var29 = var1 + 1;
            var29 = var1 * var29;
            int var5 = var1 + 2;
            var29 *= var5;
            var5 = var1 + 3;
            var29 *= var5;
            var29 &= 7;
            if (var29 == 0) {
                boolean var34;
                if (var3 != var4) {
                    var1 = switch (var1) {
                        case -2042309440 -> var1 ^ -1628863278;
                        case -487380828 -> {
                            var1 += -454330662;
                            var1 &= -1814513291;
                            var1 >>= 12;
                            var1 >>>= 13;
                            yield var1 ^ -1211146973;
                        }
                        default -> var1 ^ 1588488882;
                    };
                    var34 = true;
                    switch (var1) {
                        case -1856368780:
                            var1 ^= -200227028;
                            break;
                        case -1211587870:
                            var1 *= 588924815;
                            var1 ^= 631251672;
                            break;
                        case -542391874:
                        default:
                            var1 ^= -1227731211;
                    }
                } else {
                    var1 += 1018767765;
                    var1 |= -408440583;
                    var1 ^= -584141412;
                    var34 = false;
                    switch (var1) {
                        case -594211170:
                        default:
                            var1 ^= -532285061;
                            break;
                        case 578897765:
                            var1 <<= 22;
                            var1 |= 1654824866;
                            var1 += -1620261030;
                            var1 ^= 31256090;
                            break;
                        case 2086186166:
                            var1 ^= -1976295082;
                    }
                }

                Integer var23 = var1;
                if (var23 != null) {
                    return var34;
                }
            }

            IllegalStateException var24 = new IllegalStateException();
            throw var24;
        }
    }

    public XF x(kE_2 var1) {
        int var2 = A;
        var2 ^= -466822690;
        int var3 = System.identityHashCode(this);
        zz var4 = this.a;
        Integer var18 = var3;
        if (var18 == null) {
            var2 |= -214430059;
            var2 -= 1317114063;
            var2 *= 138026421;
            var2 >>= 27;
            var2 ^= -1837676263;
            var18 = var2;
            if (var18 != null) {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        } else {
            var2 <<= 16;
            var2 ^= -1051527991;
            var2 ^= -1002790557;
            var2 += -269748134;
            var2 ^= 1954226615;
            int var21 = var2 + 1;
            var21 = var2 * var21;
            var2 = var21 & 1;
            if (var2 == 0) {
                var4.L(var1);
                return this;
            }
        }

        RuntimeException var17 = new RuntimeException();
        throw var17;
    }

    public void j(float var1) {
        int var2 = A;
        var2 ^= -662304541;
        int var3 = System.identityHashCode(this);
        this.n = var1;
        this.pf = var1;
        zz var4 = this.a;
        Integer var15 = var3;
        if (var15 == null) {
            var2 -= -357574247;
            var2 -= -861602902;
            var2 ^= -1739748916;
            IllegalStateException var16 = new IllegalStateException();
            throw var16;
        } else {
            var2 *= -1338545557;
            var2 -= -1744534020;
            var2 ^= -1257663301;
            var2 >>>= 2;
            var2 ^= 714463477;
            var4.p(var1);
            bW var11 = bW.IDLE;
            this.w = var11;
        }
    }

    public void H(float var1) {
        long var138 = 0L;
        label187: {
            int var2 = A;
            var2 ^= -1568876244;
            int var3 = System.identityHashCode(this);
            bW var4 = this.w;
            bW var5 = bW.SPRING;
            long var6 = var3;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var206;
            int var177 = (var206 = var6 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
            if (var177 != 0) {
                switch (var2) {
                    case 512270781:
                    default:
                        var2 ^= -1039014370;
                        break;
                    case 1384529359:
                        var2 += 1179070476;
                        var2 += 1963448284;
                        var2 *= 1356242879;
                        var2 *= 1871347833;
                        var2 ^= -1650309534;
                        break;
                    case 1947829438:
                        var2 ^= -684138902;
                }
            } else {
                label189: {
                    var2 ^= 1095774333;
                    var2 |= -444220055;
                    var2 ^= -724561263;
                    Integer var178 = var2;
                    if (var178 == null) {
                        break label187;
                    }

                    if (var4 == var5) {
                        var2 -= -1353071726;
                        var2 >>>= 28;
                        var2 ^= -1878086697;
                        Integer var124 = var2;
                        if (var124 == null) {
                            break label187;
                        }

                        float var125 = this.n;
                        float var207;
                        int var126 = (var207 = var1 - var125) == 0.0F ? 0 : (var207 < 0.0F ? -1 : 1);
                        int var146 = var3 + 1;
                        int var147 = var3 * var146;
                        int var179 = var3 + 2;
                        int var148 = var147 * var179;
                        int var180 = var3 + 3;
                        int var149 = var148 * var180;
                        int var150 = var149 & 7;
                        if (var150 != 0) {
                            switch (var2) {
                                case -1878086704:
                                    var2 |= -601930989;
                                    var2 ^= 2005967216;
                                    break label189;
                                case -1750759489:
                                default:
                                    var2 ^= 1129266090;
                                    break label189;
                                case 1000393889:
                                    var2 ^= -872904790;
                                    break label189;
                            }
                        }

                        var2 >>= 4;
                        var2 ^= 1261985726;
                        long var151 = var2;
                        long var7 = var151 + 1L;
                        var7 = var151 * var7;
                        long var9 = var151 + 2L;
                        var7 *= var9;
                        long var152 = var151 + 3L;
                        var7 *= var152;
                        long var153 = var7 & 7L;
                        long var208;
                        int var154 = (var208 = var153 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                        if (var154 != 0) {
                            break label187;
                        }

                        if (var126 == 0) {
                            var2 |= -772726923;
                            var2 ^= -41495994;
                            return;
                        }

                        var2 &= -444575915;
                        var2 ^= 169245029;
                    } else {
                        switch (var2) {
                            case -934797123:
                            default:
                                var2 ^= -477478692;
                                break;
                            case -564451854:
                                var2 ^= -1338642083;
                                break;
                            case 587706218:
                                var2 &= -1236460890;
                                var2 *= 343267411;
                                var2 |= 2062724118;
                                var2 ^= 1374454130;
                        }
                    }

                    long var127 = var2;
                    var6 = var127 + 1L;
                    var6 = var127 * var6;
                    var8 = var127 + 2L;
                    var6 *= var8;
                    long var128 = var127 + 3L;
                    var6 *= var128;
                    long var129 = var6 & 7L;
                    long var209;
                    int var130 = (var209 = var129 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                    if (var130 != 0) {
                        break label187;
                    }

                    var4 = this.w;
                    var5 = bW.SPRING;
                    int var185 = var3 + 1;
                    int var186 = var3 * var185;
                    int var187 = var186 & 1;
                    if (var187 != 0) {
                        var2 -= -892852499;
                        var2 ^= 1958813652;
                    } else {
                        label194: {
                            var2 >>>= 8;
                            var2 ^= -946667593;
                            if (var4 != var5) {
                                var2 = switch (var2) {
                                    case -952571445 -> {
                                        var2 &= 1521761974;
                                        yield var2 ^ 277234613;
                                    }
                                    case 863557060 -> var2 ^ -1247676984;
                                    default -> var2 ^ -1210413509;
                                };
                                var4 = this.w;
                                Integer var156 = var3;
                                if (var156 == null) {
                                    switch (var2) {
                                        case 1001274023:
                                        default:
                                            var2 ^= -1775563767;
                                            break label194;
                                        case 1387686711:
                                            var2 *= 1301955689;
                                            var2 >>>= 27;
                                            var2 -= -614662857;
                                            var2 ^= -1892923275;
                                            break label194;
                                        case 1926570199:
                                            var2 ^= 2036557010;
                                            break label194;
                                    }
                                }
                                label170: {
                                    var2 = switch (var2) {
                                        case -9474713 -> var2 ^ -526393807;
                                        default -> var2 ^ 302375538;
                                        case 1387686711 -> {
                                            var2 *= 160729699;
                                            var2 <<= 10;
                                            var2 += -518383453;
                                            yield var2 ^ -1035374090;
                                        }
                                    };
                                    var5 = bW.TWEEN;
                                    if (var4 == var5) {
                                        var2 = switch (var2) {
                                            case -1346216619 -> {
                                                var2 >>= 17;
                                                var2 -= 1952090145;
                                                yield var2 ^ -448203666;
                                            }
                                            case -58023914 -> var2 ^ -410520346;
                                            default -> var2 ^ -1045323107;
                                        };
                                        Integer var133 = var2;
                                        if (var133 == null) {
                                            break label187;
                                        }

                                        float var134 = this.bo;
                                        int var158 = var3 + 1;
                                        int var159 = var3 * var158;
                                        int var160 = var159 & 1;
                                        if (var160 != 0) {
                                            switch (var2) {
                                                case 1206319724:
                                                default:
                                                    var2 ^= 485408957;
                                                    break label194;
                                                case 1861073838:
                                                    var2 -= 1940984260;
                                                    var2 -= -1571329470;
                                                    var2 |= -629313452;
                                                    var2 ^= 1903310175;
                                                    break label194;
                                                case 2063843118:
                                                    var2 ^= -762802370;
                                                    break label194;
                                            }
                                        }

                                        var2 -= -258139335;
                                        var2 |= 1043652484;
                                        var2 &= 569253395;
                                        var2 ^= 1398278507;
                                        float var210;
                                        int var135 = (var210 = var134 - 0.0F) == 0.0F ? 0 : (var210 < 0.0F ? -1 : 1);
                                        if (var135 > 0) {
                                            var2 ^= 582001047;
                                            var2 ^= 967440756;
                                            float var136 = this.WA;
                                            long var161 = var3;
                                            long var197 = var161 + 1L;
                                            var197 = var161 * var197;
                                            long var205 = var161 + 2L;
                                            var197 *= var205;
                                            long var162 = var161 + 3L;
                                            var197 *= var162;
                                            long var163 = var197 & 7L;
                                            long var211;
                                            int var164 = (var211 = var163 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                                            if (var164 != 0) {
                                                switch (var2) {
                                                    case 1217150165:
                                                        var2 ^= -1590865704;
                                                        break label194;
                                                    case 1677921394:
                                                    default:
                                                        var2 ^= 706661435;
                                                        break label194;
                                                    case 1747275673:
                                                        var2 *= -1438405513;
                                                        var2 *= -363608541;
                                                        var2 += -2096374295;
                                                        var2 *= -1053804935;
                                                        var2 ^= 1559928661;
                                                        break label194;
                                                }
                                            }
                                            var2 = switch (var2) {
                                                default -> var2 ^ 1190793631;
                                                case -369080666 -> var2 ^ -1734473281;
                                                case 1747275673 -> {
                                                    var2 &= 346609479;
                                                    var2 *= -804328825;
                                                    yield var2 ^ 53531348;
                                                }
                                            };
                                            Integer var165 = var2;
                                            if (var165 == null) {
                                                break label187;
                                            }

                                            float var166 = this.bo;
                                            float var137 = var136 / var166;
                                            var138 = (long)var137;
                                            switch (var2) {
                                                case 181883098:
                                                default:
                                                    var2 ^= -1870390791;
                                                    break label170;
                                                case 1087015251:
                                                    var2 ^= -45078947;
                                                    var2 >>= 13;
                                                    var2 -= -354093292;
                                                    var2 -= -701793500;
                                                    var2 ^= -1231941530;
                                                    break label170;
                                                case 1434494720:
                                                    var2 ^= 756333914;
                                                    break label170;
                                            }
                                        }

                                        var2 |= 1801737946;
                                        var2 >>>= 12;
                                        var2 &= 403957019;
                                        var2 ^= 235926123;
                                    } else {
                                        switch (var2) {
                                            case -1966193770:
                                            default:
                                                var2 ^= 151382017;
                                                break;
                                            case -1346216619:
                                                var2 *= 313304659;
                                                var2 ^= -1112983579;
                                                break;
                                            case 140437109:
                                                var2 ^= 1162011542;
                                        }
                                    }

                                    var138 = 0L;
                                    switch (var2) {
                                        case -1592262483:
                                            var2 ^= -2118823249;
                                            break;
                                        case -413594484:
                                        default:
                                            var2 ^= -424954637;
                                            break;
                                        case 235689834:
                                            var2 |= -1624196172;
                                            var2 &= 2080492940;
                                            var2 += 1096323832;
                                            var2 ^= -718927233;
                                    }
                                }

                                int var167 = var2 + 1;
                                int var168 = var2 * var167;
                                int var188 = var2 + 2;
                                int var169 = var168 * var188;
                                int var189 = var2 + 3;
                                int var170 = var169 * var189;
                                int var171 = var170 & 7;
                                if (var171 != 0) {
                                    break label187;
                                }

                                zz var172 = this.a;
                                float var190 = this.pf;
                                var172.p(var190);
                                zz var173 = this.a;
                                int var191 = var3 + 1;
                                int var192 = var3 * var191;
                                int var193 = var192 & 1;
                                if (var193 != 0) {
                                    var2 -= -1034890079;
                                    var2 -= -697316675;
                                    var2 -= 984314830;
                                    var2 ^= 513547628;
                                    break label194;
                                }

                                var2 &= -481129555;
                                var2 -= -276641825;
                                var2 ^= 1031579004;
                                var2 ^= 1939975724;
                                var2 ^= 1455078067;
                                var173.Z(var138);
                                switch (var2) {
                                    case -2002193623:
                                        var2 &= -1146891616;
                                        var2 ^= 1578421836;
                                        break;
                                    case -745561202:
                                        var2 ^= 615134196;
                                        break;
                                    case 1959212647:
                                    default:
                                        var2 ^= 470663169;
                                }
                            } else {
                                var2 ^= 1336013075;
                                var2 |= 1564582692;
                                var2 ^= 191735696;
                            }

                            this.n = var1;
                            zz var139 = this.a;
                            var139.Td(var1);
                            int var140 = var3 + 1;
                            int var141 = var3 * var140;
                            int var174 = var3 + 2;
                            int var142 = var141 * var174;
                            var3 += 3;
                            int var143 = var142 * var3;
                            var3 = var143 & 7;
                            if (var3 == 0) {
                                var2 ^= 1985747300;
                                var2 &= -586941561;
                                var2 ^= -1119830661;
                                var3 = var2 + 1;
                                var3 = var2 * var3;
                                int var144 = var2 + 2;
                                var3 *= var144;
                                int var145 = var2 + 3;
                                var3 *= var145;
                                var3 &= 7;
                                if (var3 == 0) {
                                    bW var123 = bW.SPRING;
                                    this.w = var123;
                                    return;
                                }
                                break label187;
                            }

                            var2 &= 1004126516;
                            var2 |= 364782039;
                            var2 ^= 770125768;
                            var2 &= -1761241434;
                            var2 ^= -1181856635;
                        }
                    }
                }
            }

            AssertionError var114 = new AssertionError();
            throw var114;
        }

        AssertionError var115 = new AssertionError();
        throw var115;
    }

    public void xw(float var1, float var2, Lv var3) {
        label59: {
            int var4 = A;
            var4 ^= -264916457;
            int var5 = System.identityHashCode(this);
            int var6 = var5 + 1;
            var6 = var5 * var6;
            var6 &= 1;
            if (var6 != 0) {
                var4 &= 1836963084;
                var4 += 649354661;
                var4 -= 1595994043;
                var4 ^= -659465920;
            } else {
                label61: {
                    var4 &= 2032919857;
                    var4 -= 1760409739;
                    var4 ^= 1089734140;
                    Integer var55 = var4;
                    if (var55 == null) {
                        break label59;
                    }

                    bW var56 = this.w;
                    bW var7 = bW.TWEEN;
                    if (var56 == var7) {
                        var4 = switch (var4) {
                            default -> var4 ^ 2017026421;
                            case -672559527 -> {
                                var4 += 1677226465;
                                var4 += -862291645;
                                yield var4 ^ 637178244;
                            }
                            case 746522276 -> var4 ^ -2026682456;
                        };
                        float var57 = this.n;
                        float var94;
                        int var58 = (var94 = var1 - var57) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
                        int var67 = var5 + 1;
                        int var68 = var5 * var67;
                        int var8 = var5 + 2;
                        int var69 = var68 * var8;
                        var8 = var5 + 3;
                        int var70 = var69 * var8;
                        int var71 = var70 & 7;
                        if (var71 != 0) {
                            var4 ^= 1346762048;
                            var4 ^= 347299818;
                            var4 -= 1065678777;
                            var4 <<= 11;
                            var4 ^= 1157974190;
                            break label61;
                        }

                        var4 &= -2058666026;
                        var4 &= -984570074;
                        var4 &= 1117948627;
                        var4 &= -1211318683;
                        var4 ^= -84305723;
                        long var72 = var4;
                        long var9 = var72 + 1L;
                        var9 = var72 * var9;
                        long var11 = var72 + 2L;
                        var9 *= var11;
                        long var73 = var72 + 3L;
                        var9 *= var73;
                        long var74 = var9 & 7L;
                        long var95;
                        int var75 = (var95 = var74 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                        if (var75 != 0) {
                            break label59;
                        }

                        if (var58 == 0) {
                            var4 *= 1699194759;
                            var4 ^= 731312700;
                            return;
                        }

                        var4 -= 1144057949;
                        var4 |= -1767382812;
                        var4 -= -221194934;
                        var4 ^= -128325504;
                    } else {
                        var4 >>= 8;
                        var4 &= -209506468;
                        var4 &= -627112123;
                        var4 ^= -289015258;
                    }

                    int var59 = var4 + 1;
                    var59 = var4 * var59;
                    int var76 = var4 + 2;
                    var59 *= var76;
                    int var77 = var4 + 3;
                    var59 *= var77;
                    var59 &= 7;
                    if (var59 != 0) {
                        break label59;
                    }

                    this.n = var1;
                    float var64 = this.pf;
                    this.RF = var64;
                    float var65 = Math.max(1.0E-4F, var2);
                    this.O = var65;
                    this.Ln = 0.0F;
                    this.S = var3;
                    bW var66 = bW.TWEEN;
                    long var78 = var5;
                    long var87 = var78 + 1L;
                    var87 = var78 * var87;
                    long var93 = var78 + 2L;
                    var87 *= var93;
                    long var79 = var78 + 3L;
                    var87 *= var79;
                    long var80 = var87 & 7L;
                    long var96;
                    var5 = (var96 = var80 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var4 |= -1535453585;
                        var4 *= 727887511;
                        var4 ^= -673747930;
                        this.w = var66;
                        return;
                    }

                    var4 >>>= 12;
                    var4 -= 1696263221;
                    var4 -= -2145660930;
                    var4 |= 977625478;
                    var4 ^= 631042320;
                }
            }

            long var81 = var4;
            long var91 = var81 + 1L;
            var91 = var81 * var91;
            var81 = var91 & 1L;
            long var97;
            var5 = (var97 = var81 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
            if (var5 == 0) {
                RuntimeException var51 = new RuntimeException();
                throw var51;
            }
        }

        RuntimeException var52 = new RuntimeException();
        throw var52;
    }

    public void v(float var1) {
        label63: {
            int var2 = A;
            var2 ^= -1534249293;
            int var3 = System.identityHashCode(this);
            bW var4 = this.w;
            Integer var5 = var3;
            if (var5 == null) {
                var2 >>= 8;
                var2 ^= -404013610;
                var2 ^= -1971621813;
            } else {
                label65: {
                    var2 -= -1326225674;
                    var2 ^= 624062195;
                    long var65 = var2;
                    long var7 = var65 + 1L;
                    var7 = var65 * var7;
                    long var9 = var65 + 2L;
                    var7 *= var9;
                    long var66 = var65 + 3L;
                    var7 *= var66;
                    long var67 = var7 & 7L;
                    long var79;
                    int var68 = (var79 = var67 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                    if (var68 != 0) {
                        break label63;
                    }

                    bW var69 = bW.SPRING;
                    if (var4 != var69) {
                        var2 -= 528281219;
                        var2 |= 975431410;
                        var2 *= -1812851269;
                        var2 ^= -798430356;
                        var2 ^= -1959353785;
                        int var49 = var2 + 1;
                        int var50 = var2 * var49;
                        var68 = var2 + 2;
                        int var51 = var50 * var68;
                        var68 = var2 + 3;
                        int var52 = var51 * var68;
                        int var53 = var52 & 7;
                        if (var53 != 0) {
                            break label63;
                        }

                        zz var54 = this.a;
                        float var72 = this.pf;
                        var54.p(var72);
                        int var55 = var3 + 1;
                        int var56 = var3 * var55;
                        var68 = var3 + 2;
                        int var57 = var56 * var68;
                        var68 = var3 + 3;
                        int var58 = var57 * var68;
                        int var59 = var58 & 7;
                        if (var59 != 0) {
                            var2 >>>= 17;
                            var2 -= -2124614270;
                            var2 *= 1338256499;
                            var2 &= 31178888;
                            var2 ^= 1825848007;
                            break label65;
                        }

                        var2 |= -1925565762;
                        var2 -= -814576342;
                        var2 ^= -607697863;
                        var2 ^= -1911138214;
                        Integer var60 = var2;
                        if (var60 == null) {
                            break label63;
                        }

                        zz var61 = this.a;
                        float var75 = this.n;
                        var61.Td(var75);
                        var4 = bW.SPRING;
                        this.w = var4;
                        switch (var2) {
                            case -330690328:
                            default:
                                var2 ^= -1358058410;
                                break;
                            case 1163769590:
                                var2 >>= 10;
                                var2 += 459982599;
                                var2 ^= 1234120460;
                                break;
                            case 1885742171:
                                var2 ^= 1052492661;
                        }
                    } else {
                        var2 ^= -729686291;
                        var2 &= -101125034;
                        var2 -= -659321411;
                        var2 ^= 630092799;
                    }

                    Integer var63 = var2;
                    if (var63 == null) {
                        break label63;
                    }

                    zz var64 = this.a;
                    Integer var47 = var3;
                    if (var47 != null) {
                        switch (var2) {
                            case -2108385477:
                                var2 ^= 1998236055;
                                break;
                            case 1391669624:
                                var2 &= -189262736;
                                var2 ^= 1049193468;
                                break;
                            case 2023917501:
                            default:
                                var2 ^= -1967001019;
                        }

                        var64.Z(var1);
                        return;
                    }

                    switch (var2) {
                        case 1391669624:
                            var2 |= -1865907314;
                            var2 ^= 95283325;
                            var2 ^= -1164811828;
                            break;
                        case 1525176776:
                            var2 ^= 1349567177;
                            break;
                        case 2042190290:
                        default:
                            var2 ^= 1789053111;
                    }
                }
            }

            IllegalStateException var48 = new IllegalStateException();
            throw var48;
        }

        IllegalStateException var46 = new IllegalStateException();
        throw var46;
    }

    public float N(float var1) {
        int var2 = A;
        var2 ^= 598684993;
        int var3 = System.identityHashCode(this);
        float var4 = this.pf;
        Integer var5 = var3;
        int var6 = of_2.qG;
        var2 ^= var6;
        var2 ^= 1220043223;
        var6 = of_2.V;
        var2 ^= var6;
        var2 ^= 2118306304;
        label123:
        if (var5 != null) {
            var2 = switch (var2) {
                default -> var2 ^ -1995265201;
                case -749350494 -> {
                    var2 *= 576112055;
                    yield var2 ^ -1675282918;
                }
                case 22100066 -> var2 ^ -1887254294;
            };
            int var100 = var2 + 1;
            var100 = var2 * var100;
            var100 &= 1;
            label119:
            if (var100 == 0) {
                bW var103 = this.w;
                var100 = var103.ordinal();
                switch (var100) {
                    case 0:
                        var2 |= -669186705;
                        var2 >>>= 26;
                        var2 |= -998400312;
                        var2 ^= 1292999;
                        break;
                    case 1:
                        var2 += -400492827;
                        var2 -= 1837891383;
                        var2 -= 505650552;
                        var2 ^= -1562928901;
                        zz var120 = this.a;
                        float var121 = var120.et(var1);
                        this.pf = var121;
                        zz var122 = this.a;
                        var6 = var3 + 1;
                        var6 = var3 * var6;
                        int var155 = var3 + 2;
                        var6 *= var155;
                        var155 = var3 + 3;
                        var6 *= var155;
                        var6 &= 7;
                        if (var6 != 0) {
                            switch (var2) {
                                case -1858474990:
                                    var2 ^= -1976553426;
                                    break label123;
                                case 605733100:
                                default:
                                    var2 ^= 309705073;
                                    break label123;
                                case 1332909553:
                                    var2 >>>= 29;
                                    var2 ^= 1167569186;
                                    break label123;
                            }
                        }

                        var2 -= 1800955339;
                        var2 ^= 1020518170;
                        var6 = var2 + 1;
                        var6 = var2 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            break label119;
                        }

                        int var123 = var122.iY() ? 1 : 0;
                        if (var123 != 0) {
                            var2 -= 427968084;
                            var2 <<= 15;
                            var2 *= 297562045;
                            var2 *= -1857160787;
                            var2 ^= -688281980;
                            var123 = var2 + 1;
                            var123 = var2 * var123;
                            var123 &= 1;
                            if (var123 != 0) {
                                break label119;
                            }

                            float var127 = this.n;
                            this.pf = var127;
                            Integer var128 = var3;
                            if (var128 == null) {
                                var2 *= 1846403223;
                                var2 += -547257733;
                                var2 ^= -1373533321;
                                break label123;
                            }

                            var2 -= -543789498;
                            var2 -= -1330373371;
                            var2 -= -1686912278;
                            var2 ^= 1206822597;
                            bW var129 = bW.IDLE;
                            this.w = var129;
                            var2 |= 764045124;
                            var2 ^= 2078661623;
                        } else {
                            var2 -= -509357990;
                            var2 ^= -586682649;
                            var2 <<= 10;
                            var2 |= 276711071;
                            var2 ^= 1401975462;
                        }
                        break;
                    case 2:
                        var2 >>>= 4;
                        var2 |= 259202047;
                        var2 ^= 1592037355;
                        var2 ^= -30525076;
                        Integer var105 = var2;
                        if (var105 == null) {
                            break label119;
                        }

                        float var106 = this.Ln;
                        float var107 = var106 + var1;
                        this.Ln = var107;
                        float var108 = this.Ln;
                        long var137 = var3;
                        long var8 = var137 + 1L;
                        var8 = var137 * var8;
                        long var138 = var8 & 1L;
                        long var162;
                        var6 = (var162 = var138 - 0L) == 0L ? 0 : (var162 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            var2 ^= -1575691786;
                            var2 |= -368229325;
                            var2 ^= -1701024497;
                            var2 ^= 816220304;
                            break label123;
                        }
                        var2 = switch (var2) {
                            case -2055033163 -> var2 ^ 834777131;
                            default -> var2 ^ 248366534;
                            case -1346794120 -> {
                                var2 &= 1888760806;
                                var2 ^= -1822785653;
                                var2 |= 577991739;
                                yield var2 ^ -1495178949;
                            }
                        };
                        float var140 = this.O;
                        float var109 = var108 / var140;
                        float var110 = TP.S(var109);
                        float var141 = this.RF;
                        float var7 = this.n;
                        Lv var160 = this.S;
                        float var161 = var160.l(var110);
                        float var142 = TP.GO(var141, var7, var161);
                        this.pf = var142;
                        float var163;
                        int var111 = (var163 = var110 - 1.0F) == 0.0F ? 0 : (var163 < 0.0F ? -1 : 1);
                        if (var111 >= 0) {
                            var2 &= -1303455843;
                            var2 |= 1405784447;
                            var2 += -211584908;
                            var2 ^= 1918286586;
                            var111 = var2 + 1;
                            var111 = var2 * var111;
                            var6 = var2 + 2;
                            var111 *= var6;
                            var6 = var2 + 3;
                            var111 *= var6;
                            var111 &= 7;
                            if (var111 != 0) {
                                break label119;
                            }

                            float var117 = this.n;
                            Integer var145 = var3;
                            if (var145 == null) {
                                var2 ^= -764670440;
                                var2 ^= -1568467535;
                                break label123;
                            }

                            var2 |= -1483429266;
                            var2 *= -193241581;
                            var2 *= 333882389;
                            var2 ^= -763238728;
                            var2 ^= 2015758659;
                            var145 = var2;
                            if (var145 == null) {
                                break label119;
                            }

                            this.pf = var117;
                            bW var118 = bW.IDLE;
                            this.w = var118;
                            switch (var2) {
                                case -1465481350:
                                    var2 &= 1553340105;
                                    var2 |= 1957616447;
                                    var2 ^= 318769681;
                                    break;
                                case -1287088143:
                                default:
                                    var2 ^= -849151430;
                                    break;
                                case -1087601766:
                                    var2 ^= -1483281593;
                            }
                        } else {
                            var2 += -31353495;
                            var2 ^= -1186396141;
                            var2 ^= -1833318262;
                            var2 ^= 1190037919;
                            var2 ^= 294332737;
                        }

                        Integer var119 = var2;
                        if (var119 == null) {
                            break label119;
                        }

                        var2 >>>= 2;
                        var2 *= -2009288655;
                        var2 |= 554085966;
                        var2 >>= 9;
                        var2 ^= -999180466;
                        break;
                    default:
                        var2 *= 1960842295;
                        var2 ^= 33415093;
                }

                long var130 = var2;
                long var157 = var130 + 1L;
                var157 = var130 * var157;
                long var131 = var157 & 1L;
                long var164;
                var100 = (var164 = var131 - 0L) == 0L ? 0 : (var164 < 0L ? -1 : 1);
                if (var100 == 0) {
                    float var133 = this.pf;
                    var4 = var133 - var4;
                    var100 = var3 + 1;
                    var100 = var3 * var100;
                    var3 = var100 & 1;
                    if (var3 != 0) {
                        switch (var2) {
                            case -999414727:
                                var2 ^= -2114613620;
                                var2 -= 1550989282;
                                var2 += 226755972;
                                var2 ^= -1287992969;
                                break label123;
                            case -727499050:
                                var2 ^= -841822945;
                                break label123;
                            case 1226039906:
                            default:
                                var2 ^= -122325955;
                                break label123;
                        }
                    }

                    var2 &= 547615674;
                    var2 &= 1283044908;
                    var2 ^= -82378259;
                    Integer var97 = var2;
                    if (var97 != null) {
                        this.WA = var4;
                        this.bo = var1;
                        return this.pf;
                    }
                }
            }

            IllegalArgumentException var98 = new IllegalArgumentException();
            throw var98;
        } else {
            var2 += -773623966;
            var2 <<= 12;
            var2 ^= -779620064;
        }

        UnsupportedOperationException var95 = new UnsupportedOperationException();
        throw var95;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 781655635;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        A = var4;
    }
}
