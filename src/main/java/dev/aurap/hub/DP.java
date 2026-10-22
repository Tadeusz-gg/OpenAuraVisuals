package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class DP {
    public static final int AU = 0;
    public static final int s = -1;
    public static final int pP = -16777216;
    public static final int x;

    private DP() {
    }

    public static int Q(int var0, int var1, int var2, int var3) {
        int var4 = x;
        var4 ^= -569632779;
        Integer var6 = var0;
        if (var6 != null) {
            var4 ^= 1984797542;
            var4 &= 1659018832;
            var4 ^= 1232143588;
            Integer var5 = var0;
            if (var5 != null) {
                int var20 = var0 & 0xFF;
                var20 <<= 24;
                int var24 = var1 & 0xFF;
                var24 <<= 16;
                var20 |= var24;
                var24 = var2 & 0xFF;
                var24 <<= 8;
                var20 |= var24;
                var24 = var3 & 0xFF;
                return var20 | var24;
            } else {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            }
        } else {
            switch (var4) {
                case -1791098388:
                    var4 ^= 1307342967;
                    break;
                case 1183680715:
                default:
                    var4 ^= -225856129;
                    break;
                case 1449170785:
                    var4 &= 1312006236;
                    var4 >>>= 21;
                    var4 *= 100149587;
                    var4 ^= 1017305785;
                    var4 ^= -2114179867;
            }

            AssertionError var15 = new AssertionError();
            throw var15;
        }
    }

    public static int J(float var0, float var1, float var2, float var3) {
        int var4 = x;
        var4 ^= 2028423838;
        int var5 = (int)var0;
        int var6 = var4 | 850963249;
        var6 ^= 1655210009;
        var6 = A(var0, var6);
        int var7 = var4 - -305105567;
        var7 <<= 4;
        var7 += 188260922;
        var7 <<= 26;
        var7 ^= -1206686942;
        var7 = A(var1, var7);
        int var8 = var4 & 713061963;
        var8 >>= 11;
        var8 ^= -1877509334;
        var8 = A(var2, var8);
        int var9 = var4 & 1095149058;
        var9 += 633337362;
        var9 += 1115634609;
        var9 >>>= 26;
        var9 ^= -1877775608;
        var9 = A(var3, var9);
        Integer var17 = var5;
        if (var17 == null) {
            var4 += 653551923;
            var4 -= -908239139;
            var4 ^= -92364027;
            UnsupportedOperationException var18 = new UnsupportedOperationException();
            throw var18;
        } else {
            var4 += -223456850;
            var4 -= -2097382513;
            var4 ^= 2084181853;
            return Q(var6, var7, var8, var9);
        }
    }

    public static int Pp(int var0) {
        int var1 = x;
        var1 ^= 399200146;
        Integer var3 = var0;
        if (var3 == null) {
            var1 |= 1226610176;
            var1 >>= 1;
            var1 &= 1480690010;
            var1 ^= 605651045;
            var3 = var0;
            if (var3 != null) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            }
        } else {
            var1 *= -297550397;
            var1 |= 1816622485;
            var1 ^= 2077382245;
            var1 = var0 + 1;
            var1 = var0 * var1;
            int var20 = var0 + 2;
            var1 *= var20;
            int var2 = var0 + 3;
            var1 *= var2;
            var1 &= 7;
            if (var1 == 0) {
                return 0xFF000000 | var0;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public static int R(int var0) {
        int var1 = x;
        var1 ^= 1960700063;
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        long var6 = var2 + 2L;
        var4 *= var6;
        var2 += 3L;
        var4 *= var2;
        var2 = var4 & 7L;
        long var26;
        int var21 = (var26 = var2 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var21 != 0) {
            switch (var1) {
                case -55482357:
                    var1 <<= 2;
                    var1 *= -1933811557;
                    var1 >>>= 10;
                    var1 &= 1402678027;
                    var1 ^= 1062113018;
                    break;
                case 1297033723:
                    var1 ^= 1362695214;
                    break;
                case 1960743867:
                default:
                    var1 ^= 1560396750;
            }

            UnsupportedOperationException var22 = new UnsupportedOperationException();
            throw var22;
        } else {
            var1 >>>= 17;
            var1 >>>= 14;
            var1 ^= -1401564862;
            return var0 >>> 24;
        }
    }

    public static int QN(int var0) {
        int var1 = x;
        var1 ^= -2068508798;
        long var3 = var0;
        long var5 = var3 + 1L;
        var5 = var3 * var5;
        long var7 = var3 + 2L;
        var5 *= var7;
        var3 += 3L;
        var5 *= var3;
        var3 = var5 & 7L;
        long var30;
        int var25 = (var30 = var3 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var25 != 0) {
            var1 *= 2096308291;
            var1 |= -1137420516;
            var1 |= -1762404176;
            var1 ^= 97704852;
            long var2 = var0;
            long var4 = var2 + 1L;
            var4 = var2 * var4;
            var2 = var4 & 1L;
            long var31;
            int var20 = (var31 = var2 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var20 == 0) {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            } else {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            var1 -= -521659463;
            var1 &= 1731367828;
            var1 |= 489982306;
            var1 ^= -611913620;
            var1 = var0 >> 16;
            return var1 & 0xFF;
        }
    }

    public static int W(int var0) {
        int var1 = x;
        var1 ^= 2017161042;
        long var3 = var0;
        long var5 = var3 + 1L;
        var5 = var3 * var5;
        var3 = var5 & 1L;
        long var29;
        int var26 = (var29 = var3 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var26 != 0) {
            var1 >>>= 5;
            var1 -= 467832437;
            var1 *= 580057943;
            var1 += -1062144617;
            var1 ^= -1983833308;
            long var2 = var0;
            long var4 = var2 + 1L;
            var4 = var2 * var4;
            var2 = var4 & 1L;
            long var30;
            int var22 = (var30 = var2 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var22 != 0) {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            } else {
                IllegalArgumentException var23 = new IllegalArgumentException();
                throw var23;
            }
        } else {
            switch (var1) {
                case -1590808513:
                    var1 ^= -1500780671;
                    break;
                case -262672442:
                    var1 |= 388367092;
                    var1 |= -75672607;
                    var1 >>= 13;
                    var1 += 1543866367;
                    var1 ^= -1860137423;
                    break;
                case 671318458:
                default:
                    var1 ^= 454748877;
            }

            var1 = var0 >> 8;
            return var1 & 0xFF;
        }
    }

    public static int Of(int var0) {
        int var1 = x;
        var1 ^= 532405954;
        Integer var3 = var0;
        if (var3 == null) {
            var1 &= 1891090723;
            var1 *= -372671705;
            var1 &= -1424899203;
            var1 ^= -189519663;
            long var22 = var0;
            long var5 = var22 + 1L;
            var5 = var22 * var5;
            long var7 = var22 + 2L;
            var5 *= var7;
            long var23 = var22 + 3L;
            var5 *= var23;
            long var24 = var5 & 7L;
            long var31;
            int var25 = (var31 = var24 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var25 == 0) {
                RuntimeException var26 = new RuntimeException();
                throw var26;
            }
        } else {
            var1 *= -1111954307;
            var1 ^= -10729567;
            var1 = var0 + 1;
            var1 = var0 * var1;
            int var27 = var0 + 2;
            var1 *= var27;
            int var2 = var0 + 3;
            var1 *= var2;
            var1 &= 7;
            if (var1 == 0) {
                return var0 & 0xFF;
            }
        }

        AssertionError var21 = new AssertionError();
        throw var21;
    }

    public static float L(int var0) {
        int var1 = x;
        var1 ^= -423903179;
        int var3 = R(var0);
        float var13 = var3;
        Integer var2 = var0;
        if (var2 != null) {
            var1 >>>= 13;
            var1 >>= 27;
            var1 ^= 1195938560;
            return var13 / 255.0F;
        } else {
            var1 >>= 21;
            var1 -= -992671918;
            var1 >>>= 18;
            var1 ^= -1550183717;
            IllegalStateException var9 = new IllegalStateException();
            throw var9;
        }
    }

    public static int U(int var0, int var1) {
        int var2 = x;
        var2 ^= -671284153;
        long var4 = var0;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var35;
        int var30 = (var35 = var4 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var30 != 0) {
            var2 -= 1206929871;
            var2 *= -635703881;
            var2 += 1755602971;
            var2 ^= -614101379;
            IllegalStateException var31 = new IllegalStateException();
            throw var31;
        } else {
            switch (var2) {
                case 1392624060:
                    var2 ^= 1409615823;
                    break;
                case 1603372243:
                    var2 += -598754798;
                    var2 ^= -822533565;
                    var2 ^= -1413398634;
                    var2 -= 545274240;
                    var2 ^= -1911559169;
                    break;
                case 1693256789:
                default:
                    var2 ^= -547179791;
            }

            var2 = var0 + 1;
            var2 = var0 * var2;
            var2 &= 1;
            if (var2 == 0) {
                var2 = var0 & 16777215;
                int var3 = TP.B(var1, 0, 255);
                var3 <<= 24;
                return var2 | var3;
            } else {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        }
    }

    public static int Y(int var0, float var1) {
        int var2 = x;
        var2 ^= 577605123;
        int var5 = var2 | 567596926;
        var5 ^= 1002878173;
        var5 = A(var1, var5);
        long var6 = var0;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var40;
        int var4 = (var40 = var6 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
        int var30 = of_2.qG;
        var2 ^= var30;
        var2 ^= 1220043223;
        int var31 = of_2.Y;
        var2 ^= var31;
        var2 ^= 383802779;
        if (var4 != 0) {
            var2 >>= 22;
            var2 &= 92832287;
            var2 ^= -1574618735;
            var6 = var0;
            var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var41;
            var4 = (var41 = var6 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        } else {
            var2 |= -2142224849;
            var2 -= -802823090;
            var2 ^= 446627476;
            Integer var23 = var0;
            if (var23 != null) {
                return U(var0, var5);
            }
        }

        RuntimeException var24 = new RuntimeException();
        throw var24;
    }

    public static int nq(int var0, float var1) {
        int var2 = x;
        var2 ^= 1883042583;
        int var4 = R(var0);
        float var23 = var4;
        float var5 = TP.S(var1);
        int var6 = var0 + 1;
        var6 = var0 * var6;
        int var7 = var0 + 2;
        var6 *= var7;
        int var3 = var0 + 3;
        var6 *= var3;
        var3 = var6 & 7;
        var6 = of_2.qG;
        var2 ^= var6;
        var2 ^= 1220043223;
        of_2.qG = 1220043223;
        var6 = of_2.Y;
        var2 ^= var6;
        var2 ^= 383802779;
        of_2.Y = 383802779;
        if (var3 != 0) {
            var2 += 1356887023;
            var2 += 1595465425;
            var2 += -814740611;
            var2 ^= 2129074872;
            IllegalArgumentException var22 = new IllegalArgumentException();
            throw var22;
        } else {
            var2 |= 966821275;
            var2 ^= -955208238;
            float var15 = var23 * var5;
            var2 = Math.round(var15);
            return U(var0, var2);
        }
    }

    public static int Z(int var0, int var1, float var2) {
        int var3 = x;
        var3 ^= -246459236;
        float var6 = TP.S(var2);
        int var34 = R(var0);
        float var35 = var34;
        int var7 = R(var1);
        float var38 = var7;
        float var36 = TP.GO(var35, var38, var6);
        int var37 = Math.round(var36);
        var7 = QN(var0);
        float var40 = var7;
        int var8 = QN(var1);
        float var43 = var8;
        float var41 = TP.GO(var40, var43, var6);
        var7 = Math.round(var41);
        var8 = W(var0);
        float var45 = var8;
        int var9 = W(var1);
        float var48 = var9;
        float var46 = TP.GO(var45, var48, var6);
        var8 = Math.round(var46);
        var9 = Of(var0);
        float var50 = var9;
        int var10 = Of(var1);
        float var51 = var10;
        long var11 = var0;
        long var13 = var11 + 1L;
        var13 = var11 * var13;
        long var15 = var11 + 2L;
        var13 *= var15;
        var11 += 3L;
        var13 *= var11;
        var11 = var13 & 7L;
        long var65;
        int var5 = (var65 = var11 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
        if (var5 == 0) {
            switch (var3) {
                case 461814668:
                    var3 ^= -1513768737;
                    break;
                case 602443177:
                default:
                    var3 ^= -2079173366;
                    break;
                case 2032391176:
                    var3 += 1842240484;
                    var3 ^= 585758944;
            }

            var11 = var0;
            var13 = var11 + 1L;
            var13 = var11 * var13;
            var15 = var11 + 2L;
            var13 *= var15;
            var11 += 3L;
            var13 *= var11;
            var11 = var13 & 7L;
            long var66;
            var5 = (var66 = var11 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
            if (var5 == 0) {
                float var32 = TP.GO(var50, var51, var6);
                var5 = Math.round(var32);
                return Q(var37, var7, var8, var5);
            }
        } else {
            var3 += -801775981;
            var3 &= 926106600;
            var3 += -249216969;
            var3 -= -1529052425;
            var3 ^= 1934670869;
            Integer var28 = var0;
            if (var28 != null) {
                IllegalArgumentException var30 = new IllegalArgumentException();
                throw var30;
            }
        }

        RuntimeException var29 = new RuntimeException();
        throw var29;
    }

    public static int Bp(int var0, int var1, float var2) {
        int var3 = x;
        var3 ^= -768022534;
        float var6 = TP.S(var2);
        float[] var44 = ed.I(var0);
        long var7 = var0;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        long var11 = var7 + 2L;
        var9 *= var11;
        var7 += 3L;
        var9 *= var7;
        var7 = var9 & 7L;
        long var56;
        int var5 = (var56 = var7 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
        if (var5 != 0) {
            var3 <<= 13;
            var3 >>>= 27;
            var3 ^= -309905816;
            var5 = var0 + 1;
            var5 = var0 * var5;
            var5 &= 1;
            if (var5 == 0) {
                IllegalStateException var40 = new IllegalStateException();
                throw var40;
            }
        } else {
            var3 ^= -1652624660;
            var3 >>>= 15;
            var3 ^= 1837266998;
            var3 = var0 + 1;
            var3 = var0 * var3;
            var5 = var0 + 2;
            var3 *= var5;
            int var4 = var0 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                float[] var31 = ed.I(var1);
                float var42 = var44[0];
                float var45 = var31[0];
                float var43 = TP.GO(var42, var45, var6);
                float var46 = var44[1];
                float var50 = var31[1];
                float var47 = TP.GO(var46, var50, var6);
                float var28 = var44[2];
                float var32 = var31[2];
                float var29 = TP.GO(var28, var32, var6);
                var4 = R(var0);
                float var34 = var4;
                int var51 = R(var1);
                float var52 = var51;
                float var35 = TP.GO(var34, var52, var6);
                var4 = Math.round(var35);
                var3 = ed.Yn(var43, var47, var29);
                return U(var3, var4);
            }
        }

        IllegalArgumentException var26 = new IllegalArgumentException();
        throw var26;
    }

    public static int PP(int var0, float var1) {
        int var2 = x;
        var2 ^= -929360282;
        int var5 = var0 + 1;
        var5 = var0 * var5;
        int var6 = var0 + 2;
        var5 *= var6;
        var6 = var0 + 3;
        var5 *= var6;
        var5 &= 7;
        label52:
        if (var5 == 0) {
            var2 = switch (var2) {
                default -> var2 ^ 13015215;
                case 1089967858 -> {
                    var2 *= 1431798089;
                    var2 *= -83106213;
                    var2 &= 176342823;
                    var2 *= 1151881105;
                    yield var2 ^ 1868709139;
                }
                case 1403067016 -> var2 ^ -540688402;
            };
            long var42 = var0;
            long var7 = var42 + 1L;
            var7 = var42 * var7;
            long var43 = var7 & 1L;
            long var49;
            var5 = (var49 = var43 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
            label48:
            if (var5 == 0) {
                float var50;
                var5 = (var50 = var1 - 0.0F) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
                int var34;
                if (var5 >= 0) {
                    var2 = switch (var2) {
                        case -850313323 -> {
                            var2 &= 1731837205;
                            yield var2 ^ -2115819596;
                        }
                        default -> var2 ^ -1824893674;
                        case 2052899523 -> var2 ^ -1542808653;
                    };
                    Integer var3 = var0;
                    if (var3 == null) {
                        break label48;
                    }

                    var34 = -1;
                    var2 -= -1941504927;
                    var2 ^= 1467863004;
                    var2 ^= 1204446467;
                } else {
                    var2 = switch (var2) {
                        case -850313323 -> {
                            var2 *= -1387085541;
                            yield var2 ^ -984108631;
                        }
                        case -273792479 -> var2 ^ -1557909802;
                        default -> var2 ^ -1726497679;
                    };
                    var34 = -16777216;
                    var2 &= 1817138319;
                    var2 ^= 139502737;
                }

                Integer var4 = var0;
                if (var4 != null) {
                    var2 *= -889971401;
                    var2 ^= 2067791359;
                    var2 ^= -1343553178;
                    var2 += 2001782218;
                    var2 ^= -2128130200;
                    float var36 = Math.abs(var1);
                    var34 = Z(var0, var34, var36);
                    int var37 = R(var0);
                    return U(var34, var37);
                }

                var2 >>= 4;
                var2 ^= -2139723767;
                break label52;
            }

            IllegalArgumentException var46 = new IllegalArgumentException();
            throw var46;
        } else {
            var2 >>>= 16;
            var2 -= -1966217724;
            var2 ^= -138020429;
        }

        AssertionError var28 = new AssertionError();
        throw var28;
    }

    public static int SW(float var0, float var1, float var2) {
        long var134 = 0L;
        label140: {
            int var38;
            var38 = x;
            var38 ^= -1760923074;
            int var4 = (int)var0;
            float var5 = var0 % 1.0F;
            var5 = ++var5 % 1.0F;
            float var113 = TP.S(var1);
            float var114 = TP.S(var2);
            float var115 = var114 * var113;
            float var6 = var5 * 6.0F;
            float var7 = var6 % 2.0F;
            var7 = Math.abs(--var7);
            var7 = 1.0F - var7;
            var7 = var115 * var7;
            Integer var8 = var4;
            label139:
            if (var8 != null) {
                var38 ^= 893531901;
                var38 &= -651580413;
                var38 ^= 1100247966;
                int var131 = var38 + 1;
                var131 = var38 * var131;
                var131 &= 1;
                if (var131 != 0) {
                    break label140;
                }

                float var9;
                int var117 = (int)var6;
                label136:
                switch (var117) {
                    case 0:
                        var38 *= -663530059;
                        var38 |= 977635865;
                        var38 &= -1905594157;
                        var38 ^= 2091808720;
                        float var168 = 0.0F;
                        int var182 = var4 + 1;
                        var182 = var4 * var182;
                        var182 &= 1;
                        if (var182 != 0) {
                            var38 &= -1314685793;
                            var38 *= 351230339;
                            var38 ^= -1071556683;
                            break label139;
                        }

                        var38 ^= 1050889096;
                        var38 ^= 1986027242;
                        long var185 = var38;
                        long var196 = var185 + 1L;
                        var196 = var185 * var196;
                        long var201 = var185 + 2L;
                        var196 *= var201;
                        long var186 = var185 + 3L;
                        var196 *= var186;
                        long var187 = var196 & 7L;
                        long var202;
                        var182 = (var202 = var187 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                        if (var182 != 0) {
                            break label140;
                        }

                        var6 = var115;
                        var134 = (long)var7;
                        var9 = var168;
                        var38 &= 2048857831;
                        var38 ^= 73204118;
                        break;
                    case 1:
                        var38 = switch (var38) {
                            default -> var38 ^ -1543521451;
                            case 436712588 -> var38 ^ -442168198;
                            case 1236596637 -> {
                                var38 |= -1910979352;
                                var38 |= 2005451051;
                                var38 += 1922113957;
                                var38 ^= 1249040239;
                                yield var38 ^ 1495087567;
                            }
                        };
                        float var167 = 0.0F;
                        var6 = var7;
                        int var146 = var4 + 1;
                        var146 = var4 * var146;
                        int var180 = var4 + 2;
                        var146 *= var180;
                        var180 = var4 + 3;
                        var146 *= var180;
                        var146 &= 7;
                        if (var146 != 0) {
                            var38 += -1532857814;
                            var38 ^= 1628297624;
                            break label139;
                        }

                        var38 ^= 1899017;
                        var38 >>>= 30;
                        var38 ^= -2039388684;
                        var38 ^= -1772696681;
                        var134 = (long)var115;
                        var9 = var167;
                        var38 *= -877606965;
                        var38 |= -774579625;
                        var38 ^= -274338622;
                        break;
                    case 2:
                        var38 |= 1716205952;
                        var38 -= 1962536348;
                        var38 -= -247885638;
                        var38 ^= 1583359052;
                        Integer var142 = var38;
                        if (var142 == null) {
                            break label140;
                        }

                        float var143 = 0.0F;
                        var6 = var143;
                        long var174 = var4;
                        long var15 = var174 + 1L;
                        var15 = var174 * var15;
                        long var17 = var174 + 2L;
                        var15 *= var17;
                        var174 += 3L;
                        var15 *= var174;
                        var174 = var15 & 7L;
                        long var203;
                        int var144 = (var203 = var174 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                        if (var144 != 0) {
                            var38 *= 1475100735;
                            var38 ^= -81072893;
                            break label139;
                        }
                        var38 = switch (var38) {
                            case -1526062007 -> var38 ^ 1514541067;
                            default -> var38 ^ 1275683931;
                            case 1470932235 -> {
                                var38 += -1263872886;
                                var38 &= 290148467;
                                var38 ^= -162387645;
                                yield var38 ^ -1769724554;
                            }
                        };
                        var174 = var38;
                        var15 = var174 + 1L;
                        var15 = var174 * var15;
                        var17 = var174 + 2L;
                        var15 *= var17;
                        var174 += 3L;
                        var15 *= var174;
                        var174 = var15 & 7L;
                        long var204;
                        var144 = (var204 = var174 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                        if (var144 != 0) {
                            break label140;
                        }

                        var134 = (long)var115;
                        var9 = var7;
                        switch (var38) {
                            case 157705956:
                                var38 ^= -673906632;
                                break label136;
                            case 289812788:
                            default:
                                var38 ^= 6379545;
                                break label136;
                            case 1620401188:
                                var38 ^= 418922520;
                                var38 *= 976359337;
                                var38 ^= 1043805353;
                                break label136;
                        }
                    case 3:
                        var38 -= -820237922;
                        var38 ^= 2045059495;
                        Integer var10 = var38;
                        if (var10 == null) {
                            break label140;
                        }

                        float var141 = 0.0F;
                        Integer var154 = var4;
                        if (var154 == null) {
                            var38 ^= 1944957274;
                            var38 &= 112993827;
                            var38 += -1475080819;
                            var38 ^= 2139065130;
                            var38 ^= -1290655213;
                            break label139;
                        }

                        var38 += -36993440;
                        var38 ^= -231814400;
                        int var155 = var38 + 1;
                        var155 = var38 * var155;
                        int var165 = var38 + 2;
                        var155 *= var165;
                        var165 = var38 + 3;
                        var155 *= var165;
                        var155 &= 7;
                        if (var155 != 0) {
                            break label140;
                        }

                        var6 = var141;
                        var134 = (long)var7;
                        var9 = var115;
                        var38 |= -92996595;
                        var38 |= -661858251;
                        var38 ^= -978325880;
                        break;
                    case 4:
                        var38 >>= 25;
                        var38 ^= -1779151225;
                        var38 ^= -130737128;
                        int var119 = var38 + 1;
                        int var120 = var38 * var119;
                        var131 = var38 + 2;
                        int var121 = var120 * var131;
                        var131 = var38 + 3;
                        int var122 = var121 * var131;
                        int var123 = var122 & 7;
                        if (var123 != 0) {
                            break label140;
                        }

                        var131 = var4 + 1;
                        var131 = var4 * var131;
                        var131 &= 1;
                        if (var131 != 0) {
                            var38 |= -1693689747;
                            var38 &= 827695880;
                            var38 *= -1568595295;
                            var38 ^= 1484449726;
                            break label139;
                        }
                        var38 = switch (var38) {
                            case -1754546679 -> var38 ^ 1972805804;
                            default -> var38 ^ 1531477060;
                            case 1841386171 -> {
                                var38 -= 1588625732;
                                var38 ^= -1528004003;
                                var38 += -2005030071;
                                var38 &= 1621462326;
                                yield var38 ^ -947546886;
                            }
                        };
                        float var140 = 0.0F;
                        var6 = var7;
                        var134 = (long)var140;
                        var9 = var115;
                        var38 ^= 1472603353;
                        var38 |= -2078081153;
                        var38 *= 1881377915;
                        var38 <<= 13;
                        var38 ^= -661605579;
                        break;
                    default:
                        var38 = switch (var38) {
                            default -> var38 ^ -188957986;
                            case 1236596637 -> {
                                var38 &= -1479318660;
                                var38 += 1993839975;
                                var38 ^= 994195367;
                                yield var38 ^ 1085598746;
                            }
                            case 1758782829 -> var38 ^ -995280696;
                        };
                        float var11 = 0.0F;
                        Integer var12 = var4;
                        if (var12 == null) {
                            var38 *= -1391105263;
                            var38 ^= -725749336;
                            break label139;
                        }

                        var38 += 628516490;
                        var38 &= 158683324;
                        var38 ^= 1153563293;
                        int var160 = var38 + 1;
                        var160 = var38 * var160;
                        int var13 = var38 + 2;
                        var160 *= var13;
                        var13 = var38 + 3;
                        var160 *= var13;
                        var160 &= 7;
                        if (var160 != 0) {
                            break label140;
                        }

                        var6 = var115;
                        var134 = (long)var11;
                        var9 = var7;
                        switch (var38) {
                            case -891608709:
                            default:
                                var38 ^= -792132280;
                                break;
                            case 1304754709:
                                var38 -= -444378933;
                                var38 &= 1806766684;
                                var38 -= -79118754;
                                var38 ^= 1390957279;
                                break;
                            case 1844360632:
                                var38 ^= -1246590949;
                        }
                }

                long var151 = var38;
                long var169 = var151 + 1L;
                var169 = var151 * var169;
                long var14 = var151 + 2L;
                var169 *= var14;
                var151 += 3L;
                var169 *= var151;
                var151 = var169 & 7L;
                long var205;
                int var129 = (var205 = var151 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                if (var129 != 0) {
                    break label140;
                }

                var5 = var114 - var115;
                var6 += var5;
                var7 = var134 + var5;
                Integer var109 = var4;
                if (var109 != null) {
                    var38 >>>= 23;
                    var38 *= -140234899;
                    var38 ^= 1809442672;
                    var38 ^= 2080389100;
                    float var110 = var9 + var5;
                    return J(1.0F, var6, var7, var110);
                }

                var38 ^= -1512907356;
                var38 ^= -1425183239;
                var38 ^= 1413878750;
            } else {
                var38 &= -2083464023;
                var38 -= -362260508;
                var38 |= 764685733;
                var38 |= 2097023460;
                var38 ^= 423087443;
            }

            Integer var106 = var38;
            if (var106 != null) {
                AssertionError var108 = new AssertionError();
                throw var108;
            }
        }

        UnsupportedOperationException var107 = new UnsupportedOperationException();
        throw var107;
    }

    public static float[] l(int var0, float[] var1) {
        label248: {
            int var2 = x;
            var2 ^= -246026851;
            int var5 = QN(var0);
            float var168 = var5;
            float var169 = var168 / 255.0F;
            int var6 = W(var0);
            float var191 = var6;
            float var192 = var191 / 255.0F;
            int var7 = Of(var0);
            float var216 = var7;
            long var8 = var0;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            var8 = var10 & 1L;
            long var325;
            int var232 = (var325 = var8 - 0L) == 0L ? 0 : (var325 < 0L ? -1 : 1);
            if (var232 != 0) {
                switch (var2) {
                    case -12001826:
                    default:
                        var2 ^= 133462756;
                        break;
                    case 1559218486:
                        var2 ^= 861827909;
                        break;
                    case 2033806601:
                        var2 >>= 14;
                        var2 <<= 21;
                        var2 -= 1885364125;
                        var2 ^= 178194103;
                }
            } else {
                label250: {
                    var2 |= -1447473205;
                    var2 ^= -1379415257;
                    int var233 = var0 + 1;
                    int var234 = var0 * var233;
                    int var9 = var0 + 2;
                    int var235 = var234 * var9;
                    var9 = var0 + 3;
                    int var236 = var235 * var9;
                    int var237 = var236 & 7;
                    if (var237 != 0) {
                        break label248;
                    }

                    float var217 = var216 / 255.0F;
                    float var238 = Math.max(var192, var217);
                    float var239 = Math.max(var169, var238);
                    float var241 = Math.min(var192, var217);
                    float var242 = Math.min(var169, var241);
                    float var243 = var239 - var242;
                    float var326;
                    int var247 = (var326 = var243 - 0.0F) == 0.0F ? 0 : (var326 < 0.0F ? -1 : 1);
                    float var250;
                    if (var247 == 0) {
                        var2 += -1029285674;
                        var2 ^= -1279369435;
                        Integer var248 = var0;
                        if (var248 == null) {
                            break label248;
                        }

                        float var249 = 0.0F;
                        int var11 = var0 + 1;
                        var11 = var0 * var11;
                        int var12 = var0 + 2;
                        var11 *= var12;
                        var12 = var0 + 3;
                        var11 *= var12;
                        var11 &= 7;
                        if (var11 != 0) {
                            var2 += -759061605;
                            var2 -= 64519489;
                            var2 ^= 1428385685;
                            break label250;
                        }

                        var2 >>>= 10;
                        var2 ^= 1994912956;
                        Integer var257 = var0;
                        if (var257 == null) {
                            break label248;
                        }

                        var250 = var249;
                        var2 |= 285886636;
                        var2 &= 487775628;
                        var2 -= -800976656;
                        var2 ^= -1632042310;
                    } else {
                        var2 = switch (var2) {
                            case 1417585900 -> {
                                var2 += 832460196;
                                var2 >>= 26;
                                yield var2 ^ -607851351;
                            }
                            case 1535329795 -> var2 ^ 73919384;
                            default -> var2 ^ -393188932;
                        };
                        int var258 = var0 + 1;
                        var258 = var0 * var258;
                        var258 &= 1;
                        if (var258 != 0) {
                            break label248;
                        }

                        float var327;
                        var258 = (var327 = var239 - var169) == 0.0F ? 0 : (var327 < 0.0F ? -1 : 1);
                        Integer var285 = var0;
                        if (var285 == null) {
                            var2 |= 774136130;
                            var2 *= 569147433;
                            var2 ^= -760819698;
                            break label250;
                        }

                        var2 ^= 1451366638;
                        var2 ^= -898373155;
                        var2 <<= 22;
                        var2 >>= 2;
                        var2 ^= -18745107;
                        int var286 = var0 + 1;
                        var286 = var0 * var286;
                        var286 &= 1;
                        if (var286 != 0) {
                            break label248;
                        }

                        if (var258 == 0) {
                            var2 ^= -428527213;
                            var2 ^= -549667315;
                            Integer var262 = var0;
                            if (var262 == null) {
                                break label248;
                            }

                            float var263 = var192 - var217;
                            float var264 = var263 / var243;
                            float var265 = var264 % 6.0F;
                            long var289 = var0;
                            long var14 = var289 + 1L;
                            var14 = var289 * var14;
                            long var16 = var289 + 2L;
                            var14 *= var16;
                            long var290 = var289 + 3L;
                            var14 *= var290;
                            long var291 = var14 & 7L;
                            long var328;
                            var286 = (var328 = var291 - 0L) == 0L ? 0 : (var328 < 0L ? -1 : 1);
                            if (var286 != 0) {
                                var2 ^= -99969600;
                                var2 >>= 18;
                                var2 ^= -648064944;
                                break label250;
                            }
                            var2 = switch (var2) {
                                case -1892674 -> var2 ^ 1806472899;
                                case 538474355 -> {
                                    var2 *= 1739364155;
                                    var2 *= -1691570279;
                                    var2 >>>= 25;
                                    yield var2 ^ -1863840869;
                                }
                                default -> var2 ^ 346876784;
                            };
                            long var293 = var0;
                            var14 = var293 + 1L;
                            var14 = var293 * var14;
                            var16 = var293 + 2L;
                            var14 *= var16;
                            long var294 = var293 + 3L;
                            var14 *= var294;
                            long var295 = var14 & 7L;
                            long var329;
                            var286 = (var329 = var295 - 0L) == 0L ? 0 : (var329 < 0L ? -1 : 1);
                            if (var286 != 0) {
                                break label248;
                            }

                            var250 = var265;
                            var2 += -1311255772;
                            var2 -= -1851397951;
                            var2 <<= 20;
                            var2 += 901236943;
                            var2 ^= 1309543913;
                        } else {
                            var2 *= 1520878207;
                            var2 ^= -452429106;
                            float var330;
                            var258 = (var330 = var239 - var192) == 0.0F ? 0 : (var330 < 0.0F ? -1 : 1);
                            long var297 = var0;
                            long var321 = var297 + 1L;
                            var321 = var297 * var321;
                            long var298 = var321 & 1L;
                            long var331;
                            var286 = (var331 = var298 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
                            if (var286 != 0) {
                                var2 += 747557461;
                                var2 ^= -1854248066;
                                var2 -= 2101420910;
                                var2 ^= -1927768182;
                                break label250;
                            }
                            var2 = switch (var2) {
                                case -1930138275 -> {
                                    var2 += 1166545726;
                                    var2 -= -385305141;
                                    yield var2 ^ 1546926296;
                                }
                                default -> var2 ^ 632397290;
                                case 886810953 -> var2 ^ -875969759;
                            };
                            Integer var300 = var0;
                            if (var300 == null) {
                                break label248;
                            }

                            if (var258 == 0) {
                                var2 += -1294571678;
                                var2 |= -747109172;
                                var2 *= 998898285;
                                var2 ^= 193899650;
                                long var267 = var0;
                                long var13 = var267 + 1L;
                                var13 = var267 * var13;
                                long var15 = var267 + 2L;
                                var13 *= var15;
                                long var268 = var267 + 3L;
                                var13 *= var268;
                                long var269 = var13 & 7L;
                                long var332;
                                var258 = (var332 = var269 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                                if (var258 != 0) {
                                    break label248;
                                }

                                float var218 = var217 - var169;
                                float var219 = var218 / var243;
                                float var220 = var219 + 2.0F;
                                long var271 = var0;
                                var13 = var271 + 1L;
                                var13 = var271 * var13;
                                var15 = var271 + 2L;
                                var13 *= var15;
                                long var272 = var271 + 3L;
                                var13 *= var272;
                                long var273 = var13 & 7L;
                                long var333;
                                var258 = (var333 = var273 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
                                if (var258 != 0) {
                                    var2 ^= -817760869;
                                    var2 ^= 817809332;
                                    var2 |= -1038159331;
                                    var2 >>= 13;
                                    var2 ^= -648031701;
                                    break label250;
                                }

                                var2 |= -427946774;
                                var2 ^= 1293199077;
                                var258 = var0 + 1;
                                var258 = var0 * var258;
                                int var301 = var0 + 2;
                                var258 *= var301;
                                var301 = var0 + 3;
                                var258 *= var301;
                                var258 &= 7;
                                if (var258 != 0) {
                                    break label248;
                                }

                                var250 = var220;
                                switch (var2) {
                                    case -1891314068:
                                        var2 ^= -1498376000;
                                        break;
                                    case -1167431653:
                                        var2 *= -1330710833;
                                        var2 += 343208667;
                                        var2 *= -1884231627;
                                        var2 >>>= 18;
                                        var2 ^= -629547110;
                                        break;
                                    case -363929512:
                                    default:
                                        var2 ^= 1101746216;
                                }
                            } else {
                                var2 &= -388202959;
                                var2 -= 1343784265;
                                var2 ^= 182320613;
                                var2 ^= 711384714;
                                long var280 = var0;
                                long var312 = var280 + 1L;
                                var312 = var280 * var312;
                                long var281 = var312 & 1L;
                                long var334;
                                var7 = (var334 = var281 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label248;
                                }

                                float var170 = var169 - var192;
                                float var171 = var170 / var243;
                                var6 = var0 + 1;
                                var6 = var0 * var6;
                                var6 &= 1;
                                if (var6 != 0) {
                                    switch (var2) {
                                        case -513746303:
                                            var2 ^= -1131580349;
                                            break label250;
                                        case -134638353:
                                        default:
                                            var2 ^= 682687372;
                                            break label250;
                                        case 1888538584:
                                            var2 -= 1866102477;
                                            var2 &= -293245550;
                                            var2 *= -597592353;
                                            var2 ^= 2038702698;
                                            break label250;
                                    }
                                }

                                var2 -= -604478108;
                                var2 ^= 2112461950;
                                var2 |= -1853064462;
                                var2 ^= 1320233776;
                                var6 = var0 + 1;
                                var6 = var0 * var6;
                                var7 = var0 + 2;
                                var6 *= var7;
                                var7 = var0 + 3;
                                var6 *= var7;
                                var6 &= 7;
                                if (var6 != 0) {
                                    break label248;
                                }

                                float var172 = var171 + 4.0F;
                                var250 = var172;
                                var2 |= -1217594857;
                                var2 += -611781722;
                                var2 ^= 1217148579;
                            }
                        }
                    }

                    var5 = var0 + 1;
                    var5 = var0 * var5;
                    var5 &= 1;
                    if (var5 != 0) {
                        break label248;
                    }

                    float var176 = var250 / 6.0F;
                    float var335;
                    var6 = (var335 = var176 - 0.0F) == 0.0F ? 0 : (var335 < 0.0F ? -1 : 1);
                    var7 = var0 + 1;
                    var7 = var0 * var7;
                    var7 &= 1;
                    if (var7 != 0) {
                        switch (var2) {
                            case -1985377603:
                            default:
                                var2 ^= -1407644834;
                                break;
                            case -629553882:
                                var2 *= 262980157;
                                var2 -= 1114012404;
                                var2 ^= -450040370;
                                break;
                            case 1237032990:
                                var2 ^= 1307577477;
                        }
                    } else {
                        label257: {
                            var2 |= 1841855628;
                            var2 |= -630192227;
                            var2 ^= 1531984284;
                            float var206;
                            if (var6 < 0) {
                                var2 <<= 15;
                                var2 ^= -1832694422;
                                var6 = var0 + 1;
                                var6 = var0 * var6;
                                var6 &= 1;
                                if (var6 != 0) {
                                    break label248;
                                }

                                float var205 = var176 + 1.0F;
                                Integer var227 = var0;
                                if (var227 == null) {
                                    var2 &= 1731464251;
                                    var2 >>>= 31;
                                    var2 |= 1231557434;
                                    var2 ^= 1875424750;
                                    break label257;
                                }

                                var2 += 1795908878;
                                var2 ^= -165765556;
                                var2 ^= -1864135788;
                                var206 = var205;
                                var2 &= -789016305;
                                var2 &= 428902545;
                                var2 *= 1841211767;
                                var2 ^= -358462204;
                            } else {
                                var2 &= 1666037308;
                                var2 &= -1896220576;
                                var2 ^= 676330312;
                                var10 = var0;
                                long var303 = var10 + 1L;
                                var303 = var10 * var303;
                                var10 = var303 & 1L;
                                long var336;
                                var7 = (var336 = var10 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label248;
                                }

                                var206 = var176;
                                var2 >>= 3;
                                var2 ^= -1927170500;
                                var2 ^= 311112789;
                            }

                            Integer var177 = var0;
                            if (var177 == null) {
                                break label248;
                            }

                            var1[0] = var206;
                            int var178 = var0 + 1;
                            var178 = var0 * var178;
                            var178 &= 1;
                            if (var178 != 0) {
                                var2 *= -1259983231;
                                var2 += 1754645751;
                                var2 &= 1037679943;
                                var2 ^= 459911063;
                            } else {
                                label259: {
                                    var2 &= 923318844;
                                    var2 >>>= 7;
                                    var2 >>>= 18;
                                    var2 += 1155668707;
                                    var2 ^= -338402498;
                                    var178 = var0 + 1;
                                    var178 = var0 * var178;
                                    var178 &= 1;
                                    if (var178 != 0) {
                                        break label248;
                                    }

                                    float var337;
                                    var178 = (var337 = var239 - 0.0F) == 0.0F ? 0 : (var337 < 0.0F ? -1 : 1);
                                    float var190;
                                    if (var178 == 0) {
                                        var2 >>>= 7;
                                        var2 ^= -1183783580;
                                        var178 = var0 + 1;
                                        var178 = var0 * var178;
                                        var6 = var0 + 2;
                                        var178 *= var6;
                                        var6 = var0 + 3;
                                        var178 *= var6;
                                        var178 &= 7;
                                        if (var178 != 0) {
                                            break label248;
                                        }

                                        var190 = 0.0F;
                                        switch (var2) {
                                            case -1985179508:
                                                var2 ^= 774016131;
                                                break;
                                            case -1204909673:
                                                var2 *= 809530155;
                                                var2 ^= 1503522515;
                                                var2 ^= -1596468125;
                                                break;
                                            case 20625620:
                                            default:
                                                var2 ^= 1699766266;
                                        }
                                    } else {
                                        var2 -= 930349265;
                                        var2 ^= 990520249;
                                        Integer var209 = var0;
                                        if (var209 == null) {
                                            break label248;
                                        }

                                        float var210 = var243 / var239;
                                        long var244 = var0;
                                        long var282 = var244 + 1L;
                                        var282 = var244 * var282;
                                        long var245 = var282 & 1L;
                                        long var338;
                                        var7 = (var338 = var245 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                                        if (var7 != 0) {
                                            var2 *= 465247417;
                                            var2 >>= 27;
                                            var2 ^= 648062678;
                                            break label259;
                                        }
                                        var2 = switch (var2) {
                                            default -> var2 ^ 363853556;
                                            case 1288198840 -> {
                                                var2 &= 48653214;
                                                var2 |= 20094875;
                                                var2 <<= 25;
                                                yield var2 ^ 558450552;
                                            }
                                            case 2043216742 -> var2 ^ -1017660558;
                                        };
                                        Integer var230 = var0;
                                        if (var230 == null) {
                                            break label248;
                                        }

                                        var190 = var210;
                                        var2 <<= 6;
                                        var2 ^= 1234803821;
                                        var2 ^= -270694016;
                                    }

                                    Integer var211 = var0;
                                    if (var211 == null) {
                                        break label248;
                                    }

                                    var1[1] = var190;
                                    long var4 = var0;
                                    long var212 = var4 + 1L;
                                    long var213 = var4 * var212;
                                    var4 = var213 & 1L;
                                    long var339;
                                    int var164 = (var339 = var4 - 0L) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                                    if (var164 == 0) {
                                        var2 |= -574991051;
                                        var2 ^= -689785399;
                                        var4 = var0;
                                        long var214 = var4 + 1L;
                                        long var215 = var4 * var214;
                                        var4 = var215 & 1L;
                                        long var340;
                                        int var167 = (var340 = var4 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                                        if (var167 == 0) {
                                            var1[2] = var239;
                                            return var1;
                                        }
                                        break label248;
                                    }

                                    var2 <<= 6;
                                    var2 -= -1623163509;
                                    var2 ^= 1083366241;
                                }
                            }
                        }
                    }
                }
            }

            var2 = var0 + 1;
            var2 = var0 * var2;
            var2 &= 1;
            if (var2 == 0) {
                RuntimeException var161 = new RuntimeException();
                throw var161;
            }
        }

        IllegalArgumentException var162 = new IllegalArgumentException();
        throw var162;
    }

    public static int ue(String var0) {
        label169: {
            int var59;
            int var152;
            label181: {
                var59 = x;
                var59 ^= 1774753446;
                int var2 = System.identityHashCode(var0);
                Integer var3 = var2;
                if (var3 == null) {
                    var59 |= 2104478508;
                    var59 -= -729795423;
                    var59 ^= -1607883635;
                } else {
                    label180: {
                        var59 -= 17728961;
                        var59 ^= -114529538;
                        int var112 = var59 + 1;
                        var112 = var59 * var112;
                        var112 &= 1;
                        if (var112 != 0) {
                            break label169;
                        }

                        int var115 = (var0.startsWith("#")) ? 1 : 0;
                        String var118;
                        if (var115 != 0) {
                            var59 *= -427681159;
                            var59 += 185907623;
                            var59 += -64555289;
                            var59 ^= 1630758064;
                            Integer var116 = var59;
                            if (var116 == null) {
                                break label169;
                            }

                            String var117 = var0.substring(1);
                            long var4 = var2;
                            long var6 = var4 + 1L;
                            var6 = var4 * var6;
                            long var8 = var4 + 2L;
                            var6 *= var8;
                            long var124 = var4 + 3L;
                            var6 *= var124;
                            long var125 = var6 & 7L;
                            long var242;
                            var152 = (var242 = var125 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                            if (var152 != 0) {
                                var59 += -1400579648;
                                var59 -= 755304144;
                                var59 += -261129210;
                                var59 >>= 10;
                                var59 ^= -1992248813;
                                break label180;
                            }

                            var59 |= -1926875981;
                            var59 ^= -1331149541;
                            var59 ^= -99909018;
                            long var127 = var59;
                            var6 = var127 + 1L;
                            var6 = var127 * var6;
                            var8 = var127 + 2L;
                            var6 *= var8;
                            long var128 = var127 + 3L;
                            var6 *= var128;
                            long var129 = var6 & 7L;
                            long var243;
                            var152 = (var243 = var129 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                            if (var152 != 0) {
                                break label169;
                            }

                            var118 = var117;
                            switch (var59) {
                                case -444255286:
                                    var59 *= 1622274693;
                                    var59 |= -66918991;
                                    var59 += -1130934708;
                                    var59 |= -813329446;
                                    var59 ^= 1895106174;
                                    break;
                                case 455164868:
                                default:
                                    var59 ^= 1932508418;
                                    break;
                                case 1432602567:
                                    var59 ^= 180896154;
                            }
                        } else {
                            var59 *= 1958480999;
                            var59 -= 477023155;
                            var59 &= 1592683723;
                            var59 ^= -2127227671;
                            var118 = var0;
                            var59 >>>= 28;
                            var59 >>>= 18;
                            var59 >>= 3;
                            var59 |= -1466746133;
                            var59 ^= 663348074;
                        }

                        var152 = var59 + 1;
                        var152 = var59 * var152;
                        int var5 = var59 + 2;
                        var152 *= var5;
                        var5 = var59 + 3;
                        var152 *= var5;
                        var152 &= 7;
                        if (var152 != 0) {
                            break label169;
                        }

                        var152 = var2 + 1;
                        var152 = var2 * var152;
                        var5 = var2 + 2;
                        var152 *= var5;
                        var5 = var2 + 3;
                        var152 *= var5;
                        var152 &= 7;
                        if (var152 == 0) {
                            var59 >>= 24;
                            var59 ^= 572627845;
                            long var141 = var59;
                            long var183 = var141 + 1L;
                            var183 = var141 * var183;
                            long var226 = var141 + 2L;
                            var183 *= var226;
                            long var142 = var141 + 3L;
                            var183 *= var142;
                            long var143 = var183 & 7L;
                            long var244;
                            var152 = (var244 = var143 - 0L) == 0L ? 0 : (var244 < 0L ? -1 : 1);
                            if (var152 != 0) {
                                break label169;
                            }

                            var152 = var118.length();
                            switch (var152) {
                                case 3:
                                    var59 &= -639800314;
                                    var59 += 583567171;
                                    var59 >>= 6;
                                    var59 ^= -523030002;
                                    long var168 = var59;
                                    long var201 = var168 + 1L;
                                    var201 = var168 * var201;
                                    long var169 = var201 & 1L;
                                    long var248;
                                    var5 = (var248 = var169 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                                    if (var5 != 0) {
                                        break label169;
                                    }

                                    int var171 = var118.charAt(0);
                                    var171 = Character.digit((char)var171, 16);
                                    char var198 = var118.charAt(1);
                                    int var199 = Character.digit(var198, 16);
                                    var201 = var2;
                                    long var9 = var201 + 1L;
                                    var9 = var201 * var9;
                                    var201 = var9 & 1L;
                                    long var249;
                                    int var205 = (var249 = var201 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                                    if (var205 != 0) {
                                        var59 *= -114661599;
                                        var59 ^= 307914003;
                                    } else {
                                        var59 ^= -1517869701;
                                        var59 |= -372385342;
                                        var59 ^= 2062972822;
                                        int var206 = var59 + 1;
                                        int var207 = var59 * var206;
                                        int var232 = var59 + 2;
                                        int var208 = var207 * var232;
                                        int var233 = var59 + 3;
                                        int var209 = var208 * var233;
                                        int var210 = var209 & 7;
                                        if (var210 != 0) {
                                            break label169;
                                        }

                                        var115 = var118.charAt(2);
                                        var115 = Character.digit(var115, 16);
                                        int var211 = var171 | var199;
                                        int var212 = var211 | var115;
                                        if (var212 < 0) {
                                            var201 = switch (var59) {
                                                case -2129024436 -> {
                                                    var59 *= 694235503;
                                                    yield var59 ^ -2133880055;
                                                }
                                                default -> var59 ^ -1383885816;
                                                case 655794959 -> var59 ^ 208749160;
                                            };
                                            var9 = var201 + 1L;
                                            var9 = var201 * var9;
                                            var201 = var9 & 1L;
                                            long var252;
                                            int var223 = (var252 = var201 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                                            if (var223 == 0) {
                                                String var234 = "Invalid color: " + var0;
                                                IllegalArgumentException var224 = new IllegalArgumentException(var234);
                                                throw var224;
                                            }
                                            break label169;
                                        }

                                        var59 += -1530283770;
                                        var59 |= 908827367;
                                        var59 ^= -888723771;
                                        int var213 = var59 + 1;
                                        int var214 = var59 * var213;
                                        int var215 = var214 & 1;
                                        if (var215 != 0) {
                                            break label169;
                                        }

                                        var171 *= 17;
                                        var201 = var2;
                                        var9 = var201 + 1L;
                                        var9 = var201 * var9;
                                        long var11 = var201 + 2L;
                                        var9 *= var11;
                                        var201 += 3L;
                                        var9 *= var201;
                                        var201 = var9 & 7L;
                                        long var250;
                                        var2 = (var250 = var201 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                                        if (var2 == 0) {
                                            var59 = switch (var59) {
                                                case -51585742 -> {
                                                    var59 >>>= 15;
                                                    var59 ^= -90179644;
                                                    yield var59 ^ -196002420;
                                                }
                                                default -> var59 ^ 92267049;
                                                case 2017603031 -> var59 ^ 42199858;
                                            };
                                            var2 = var59 + 1;
                                            var2 = var59 * var2;
                                            int var219 = var59 + 2;
                                            var2 *= var219;
                                            int var220 = var59 + 3;
                                            var2 *= var220;
                                            var2 &= 7;
                                            if (var2 != 0) {
                                                break label169;
                                            }

                                            var2 = var199 * 17;
                                            var115 *= 17;
                                            var2 = Q(255, var171, var2, var115);
                                            var152 = var2;
                                            switch (var59) {
                                                case -1046578484:
                                                default:
                                                    var59 ^= -867313026;
                                                    break label181;
                                                case 248460177:
                                                    var59 += -758686690;
                                                    var59 *= 290491513;
                                                    var59 *= 435473669;
                                                    var59 ^= 1422893523;
                                                    break label181;
                                                case 1290327648:
                                                    var59 ^= -1681686808;
                                                    break label181;
                                            }
                                        }

                                        var59 += 1917261667;
                                        var59 ^= -428475771;
                                    }
                                    break;
                                case 6:
                                    var59 ^= 539320187;
                                    var59 ^= 1004070672;
                                    Integer var164 = var59;
                                    if (var164 == null) {
                                        break label169;
                                    }

                                    long var165 = Long.parseLong(var118, 16);
                                    int var166 = (int)var165;
                                    var166 = 0xFF000000 | var166;
                                    var183 = var2;
                                    var226 = var183 + 1L;
                                    var226 = var183 * var226;
                                    long var10 = var183 + 2L;
                                    var226 *= var10;
                                    var183 += 3L;
                                    var226 *= var183;
                                    var183 = var226 & 7L;
                                    long var247;
                                    int var196 = (var247 = var183 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                                    if (var196 == 0) {
                                        var59 >>>= 3;
                                        var59 ^= -133739789;
                                        Integer var197 = var59;
                                        if (var197 == null) {
                                            break label169;
                                        }

                                        var152 = var166;
                                        var59 *= -1236460313;
                                        var59 <<= 6;
                                        var59 ^= -477535325;
                                        var59 ^= 2118007715;
                                        break label181;
                                    }

                                    var59 += -718764141;
                                    var59 ^= 302673380;
                                    break;
                                case 8:
                                    var59 += -1988908720;
                                    var59 |= -1913125393;
                                    var59 ^= 1676987127;
                                    var59 &= -725489442;
                                    var59 ^= -1967845303;
                                    long var146 = var59;
                                    var183 = var146 + 1L;
                                    var183 = var146 * var183;
                                    var226 = var146 + 2L;
                                    var183 *= var226;
                                    long var147 = var146 + 3L;
                                    var183 *= var147;
                                    long var148 = var183 & 7L;
                                    long var245;
                                    var152 = (var245 = var148 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                                    if (var152 != 0) {
                                        break label169;
                                    }

                                    long var150 = Long.parseLong(var118, 16);
                                    var152 = (int)var150;
                                    var5 = var2 + 1;
                                    var5 = var2 * var5;
                                    int var191 = var2 + 2;
                                    var5 *= var191;
                                    int var192 = var2 + 3;
                                    var5 *= var192;
                                    var5 &= 7;
                                    if (var5 == 0) {
                                        var59 |= -170983252;
                                        var59 ^= -1707121142;
                                        var59 &= 1411369161;
                                        var59 *= 1959688639;
                                        var59 ^= -588274894;
                                        long var161 = var59;
                                        long var7 = var161 + 1L;
                                        var7 = var161 * var7;
                                        long var162 = var7 & 1L;
                                        long var246;
                                        var5 = (var246 = var162 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                                        if (var5 != 0) {
                                            break label169;
                                        }

                                        var152 = var152;
                                        switch (var59) {
                                            case -731452467:
                                                var59 <<= 10;
                                                var59 ^= -1447359936;
                                                break label181;
                                            case -656788946:
                                            default:
                                                var59 ^= 121493248;
                                                break label181;
                                            case 1350465483:
                                                var59 ^= 718444875;
                                                break label181;
                                        }
                                    }

                                    var59 ^= -1684557553;
                                    var59 -= 1192735993;
                                    var59 += -953029904;
                                    var59 ^= -1669686955;
                                    break;
                                default:
                                    var59 *= -605539941;
                                    var59 &= -1404436491;
                                    var59 ^= 1558725216;
                                    String var119 = "Invalid color: " + var0;
                                    IllegalArgumentException var96 = new IllegalArgumentException(var119);
                                    throw var96;
                            }
                        } else {
                            switch (var59) {
                                case -2074328245:
                                    var59 ^= 153618810;
                                    break;
                                case -1894065791:
                                    var59 ^= 375426275;
                                    var59 ^= 272391026;
                                    break;
                                case 3060511:
                                default:
                                    var59 ^= -35732163;
                            }
                        }
                    }
                }

                var2 = var59 + 1;
                var2 = var59 * var2;
                int var123 = var59 + 2;
                var2 *= var123;
                var59 += 3;
                var2 *= var59;
                var59 = var2 & 7;
                if (var59 == 0) {
                    IllegalStateException var95 = new IllegalStateException();
                    throw var95;
                }
                break label169;
            }

            long var105 = var59;
            long var174 = var105 + 1L;
            var174 = var105 * var174;
            var105 = var174 & 1L;
            long var251;
            int var107 = (var251 = var105 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
            if (var107 == 0) {
                return var152;
            }
        }

        RuntimeException var94 = new RuntimeException();
        throw var94;
    }

    public static String nN(int var0) {
        int var1 = x;
        var1 ^= 1806722810;
        Object[] var4 = new Object[1];
        Integer var5 = var0;
        var4[0] = var5;
        int var19 = var0 + 1;
        var19 = var0 * var19;
        int var3 = var19 & 1;
        if (var3 == 0) {
            var1 >>>= 15;
            var1 *= 646789037;
            var1 ^= -1319505826;
            Integer var18 = var0;
            if (var18 != null) {
                return String.format("#%08X", var4);
            }
        } else {
            var1 >>>= 5;
            var1 -= 1556441501;
            var1 &= 2007300659;
            var1 *= -1053469467;
            var1 ^= 1116376326;
            Integer var15 = var0;
            if (var15 != null) {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    private static int A(float var0, int var1) {
        int var3 = (int)var0;
        long var14 = var3;
        long var5 = var14 + 1L;
        var5 = var14 * var5;
        long var15 = var5 & 1L;
        long var20;
        var3 = (var20 = var15 - 0L) == 0L ? 0 : (var20 < 0L ? -1 : 1);
        if (var3 != 0) {
            int var2 = var1 * 1632912849;
            var2 ^= 245451308;
            Integer var17 = var2;
            if (var17 != null) {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        } else {
            int var8 = var1 & 1632832466;
            var8 ^= 1741690562;
            Integer var10 = var8;
            if (var10 != null) {
                float var12 = TP.S(var0);
                float var13 = var12 * 255.0F;
                return Math.round(var13);
            }
        }

        AssertionError var11 = new AssertionError();
        throw var11;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1092929804;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        x = var4;
    }
}
