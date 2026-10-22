package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record eJ(float R, float v, float aa, float p) {
    public static final eJ EMPTY;
    public static final int Kr;

    public static eJ mZ(float var0, float var1, float var2, float var3) {
        int var4 = Kr;
        var4 ^= 1987582548;
        int var5 = (int)var0;
        int var6 = var5 + 1;
        var6 = var5 * var6;
        var5 = var6 & 1;
        if (var5 != 0) {
            var4 |= -240059887;
            var4 ^= 1822128773;
            Integer var23 = var4;
            if (var23 != null) {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var4 ^= 1484732560;
            var4 >>= 28;
            var4 -= 1013766028;
            var4 ^= -1846069943;
            long var17 = var4;
            long var27 = var17 + 1L;
            long var28 = var17 * var27;
            long var8 = var17 + 2L;
            long var29 = var28 * var8;
            long var18 = var17 + 3L;
            long var30 = var29 * var18;
            long var19 = var30 & 7L;
            long var32;
            var4 = (var32 = var19 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var4 == 0) {
                float var25 = var2 - var0;
                float var31 = var3 - var1;
                return new eJ(var0, var1, var25, var31);
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    public float right() {
        int var1 = Kr;
        var1 ^= 1573259059;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.Ny;
        var1 ^= var3;
        var1 ^= 130860231;
        of_2.Ny = 130860231;
        var3 = of_2.DR;
        var1 ^= var3;
        var1 ^= 721178372;
        of_2.DR = 721178372;
        if (var2 != 0) {
            var1 ^= 940595164;
            var1 ^= -1779107770;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            } else {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        } else {
            var1 *= 828230223;
            var1 ^= -371580316;
            var1 -= -166514206;
            var1 ^= -36322762;
            float var13 = this.R;
            float var17 = this.aa;
            return var13 + var17;
        }
    }

    public float bottom() {
        int var1 = Kr;
        var1 ^= -1789362569;
        int var2 = System.identityHashCode(this);
        float var3 = this.v;
        float var4 = this.p;
        int var5 = var2 + 1;
        var5 = var2 * var5;
        var2 = var5 & 1;
        var5 = of_2.Ny;
        var1 ^= var5;
        var1 ^= 130860231;
        var5 = of_2.DR;
        var1 ^= var5;
        var1 ^= 721178372;
        if (var2 == 0) {
            var1 <<= 20;
            var1 &= 1248297195;
            var1 ^= 1645381405;
            Integer var19 = var1;
            if (var19 == null) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            } else {
                return var3 + var4;
            }
        } else {
            var1 -= -1693153876;
            var1 *= -1556070563;
            var1 ^= -1905902134;
            IllegalArgumentException var14 = new IllegalArgumentException();
            throw var14;
        }
    }

    public float centerX() {
        int var1 = Kr;
        var1 ^= -144355453;
        int var2 = System.identityHashCode(this);
        float var3 = this.R;
        float var4 = this.aa;
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var33;
        var2 = (var33 = var5 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= 1731370635;
            var1 <<= 2;
            var1 ^= 1695183176;
            var5 = var1;
            var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var34;
            var2 = (var34 = var5 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var2 != 0) {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            } else {
                float var22 = var4 * 0.5F;
                return var3 + var22;
            }
        } else {
            var1 *= -1055113821;
            var1 -= 1473512916;
            var1 *= 2117643897;
            var1 ^= 494471952;
            AssertionError var16 = new AssertionError();
            throw var16;
        }
    }

    public float centerY() {
        int var1 = Kr;
        var1 ^= -355745678;
        int var2 = System.identityHashCode(this);
        float var3 = this.v;
        float var4 = this.p;
        int var5 = var2 + 1;
        var5 = var2 * var5;
        int var6 = var2 + 2;
        var5 *= var6;
        var2 += 3;
        var5 *= var2;
        var2 = var5 & 7;
        if (var2 != 0) {
            var1 -= -1017868633;
            var1 ^= 1350223675;
            Integer var16 = var1;
            if (var16 == null) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            } else {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            }
        } else {
            var1 |= -974001338;
            var1 ^= 625756800;
            var1 ^= -515634067;
            float var11 = var4 * 0.5F;
            return var3 + var11;
        }
    }

    public boolean contains(double var1, double var3) {
        label112: {
            int var49;
            int var75;
            label119: {
                var49 = Kr;
                var49 ^= -802351279;
                var75 = System.identityHashCode(this);
                float var7 = this.R;
                double var80 = var7;
                Integer var9 = var75;
                label109:
                if (var9 != null) {
                    var49 = switch (var49) {
                        default -> var49 ^ 941969555;
                        case 997243069 -> {
                            var49 += -2126747043;
                            var49 |= 295716359;
                            var49 &= 1283580018;
                            var49 -= -141379265;
                            yield var49 ^ 560002158;
                        }
                        case 2036643520 -> var49 ^ 929189394;
                    };
                    double var128;
                    int var81 = (var128 = var1 - var80) == 0.0 ? 0 : (var128 < 0.0 ? -1 : 1);
                    if (var81 >= 0) {
                        var49 ^= -35827044;
                        var49 |= -186290518;
                        var49 *= 1879136191;
                        var49 ^= -1155730525;
                        var49 ^= -181551269;
                        long var82 = var49;
                        long var119 = var82 + 1L;
                        long var120 = var82 * var119;
                        long var83 = var120 & 1L;
                        long var129;
                        int var84 = (var129 = var83 - 0L) == 0L ? 0 : (var129 < 0L ? -1 : 1);
                        if (var84 != 0) {
                            break label112;
                        }

                        var7 = this.v;
                        double var86 = var7;
                        double var130;
                        int var87 = (var130 = var3 - var86) == 0.0 ? 0 : (var130 < 0.0 ? -1 : 1);
                        int var8 = var75 + 1;
                        var8 = var75 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            var49 >>>= 19;
                            var49 *= 1929502305;
                            var49 ^= -526127036;
                            break label109;
                        }

                        var49 ^= 352651206;
                        var49 ^= 68523828;
                        var8 = var49 + 1;
                        var8 = var49 * var8;
                        int var121 = var49 + 2;
                        var8 *= var121;
                        var121 = var49 + 3;
                        var8 *= var121;
                        var8 &= 7;
                        if (var8 != 0) {
                            break label112;
                        }

                        if (var87 >= 0) {
                            var49 >>= 9;
                            var49 ^= -1824898328;
                            int var88 = var49 + 1;
                            int var89 = var49 * var88;
                            int var90 = var89 & 1;
                            if (var90 != 0) {
                                break label112;
                            }

                            var7 = this.R;
                            var8 = var75 + 1;
                            var8 = var75 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                var49 <<= 12;
                                var49 ^= 220330892;
                                var49 ^= 1540771442;
                                break label109;
                            }

                            var49 >>>= 16;
                            var49 &= -1430375943;
                            var49 ^= -1609219998;
                            var49 ^= -1433661038;
                            Integer var115 = var49;
                            if (var115 == null) {
                                break label112;
                            }

                            float var116 = this.aa;
                            var7 += var116;
                            double var93 = var7;
                            double var131;
                            int var94 = (var131 = var1 - var93) == 0.0 ? 0 : (var131 < 0.0 ? -1 : 1);
                            if (var94 < 0) {
                                var49 |= -1750466399;
                                var49 |= 801322166;
                                var49 ^= 456562229;
                                long var95 = var49;
                                long var123 = var95 + 1L;
                                long var124 = var95 * var123;
                                long var11 = var95 + 2L;
                                long var125 = var124 * var11;
                                long var96 = var95 + 3L;
                                long var126 = var125 * var96;
                                long var97 = var126 & 7L;
                                long var132;
                                int var98 = (var132 = var97 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                                if (var98 != 0) {
                                    break label112;
                                }

                                var7 = this.v;
                                long var117 = var75;
                                long var10 = var117 + 1L;
                                var10 = var117 * var10;
                                long var118 = var10 & 1L;
                                long var133;
                                var75 = (var133 = var118 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                                if (var75 != 0) {
                                    var49 += -22564729;
                                    var49 ^= 666318511;
                                    break label109;
                                }

                                var49 ^= -237639031;
                                var49 -= -485890033;
                                var49 |= -1067069098;
                                var49 >>= 11;
                                var49 ^= -36548924;
                                float var70 = this.p;
                                float var71 = var7 + var70;
                                double var72 = var71;
                                double var134;
                                var75 = (var134 = var3 - var72) == 0.0 ? 0 : (var134 < 0.0 ? -1 : 1);
                                if (var75 < 0) {
                                    var49 = switch (var49) {
                                        case -1657287165 -> var49 ^ 1257766607;
                                        case 36438842 -> {
                                            var49 *= -1713901811;
                                            yield var49 ^ -1018015183;
                                        }
                                        default -> var49 ^ 1626464041;
                                    };
                                    Integer var74 = var49;
                                    if (var74 == null) {
                                        break label112;
                                    }

                                    var75 = 1;
                                    var49 |= 351289794;
                                    var49 ^= 2052794772;
                                    break label119;
                                }

                                var49 |= 1707360911;
                                var49 ^= -1077077794;
                            } else {
                                var49 |= -634648758;
                                var49 ^= -1766873082;
                                var49 ^= -1808550772;
                            }
                        } else {
                            var49 *= -2106492879;
                            var49 += -1447372464;
                            var49 ^= 1908916701;
                            var49 ^= 418106115;
                        }
                    } else {
                        switch (var49) {
                            case -1777826830:
                            default:
                                var49 ^= 1119311228;
                                break;
                            case -109082713:
                                var49 ^= -1040002848;
                                break;
                            case 898519741:
                                var49 += -421054006;
                                var49 += -451023698;
                                var49 ^= -642637228;
                        }
                    }

                    int var101 = var49 + 1;
                    int var102 = var49 * var101;
                    int var103 = var102 & 1;
                    if (var103 != 0) {
                        break label112;
                    }

                    var75 = 0;
                    switch (var49) {
                        case -668902559:
                            var49 &= -1705812762;
                            var49 <<= 5;
                            var49 += 1828273353;
                            var49 ^= 1116224670;
                            break label119;
                        case -271913748:
                            var49 ^= 1646824477;
                            break label119;
                        case -81866221:
                        default:
                            var49 ^= 1386565722;
                            break label119;
                    }
                } else {
                    var49 |= -1462042238;
                    var49 |= 833737208;
                    var49 >>>= 27;
                    var49 ^= -2067618327;
                }

                var75 = var49 + 1;
                var75 = var49 * var75;
                int var100 = var49 + 2;
                var75 *= var100;
                var49 += 3;
                var75 *= var49;
                var49 = var75 & 7;
                if (var49 == 0) {
                    IllegalArgumentException var62 = new IllegalArgumentException();
                    throw var62;
                }
                break label112;
            }

            Integer var104 = var49;
            if (var104 != null) {
                return (var75 != 0);
            }
        }

        AssertionError var68 = new AssertionError();
        throw var68;
    }

    public eJ inset(float var1) {
        int var2 = Kr;
        var2 ^= -735437536;
        int var3 = System.identityHashCode(this);
        Integer var15 = var3;
        if (var15 != null) {
            var2 -= -1157973088;
            var2 -= -1122598576;
            var2 -= 939930389;
            var2 |= 422941616;
            var2 ^= -1790872409;
            return this.inset(var1, var1);
        } else {
            var2 -= 1573895485;
            var2 ^= 122687573;
            var2 ^= -1858694989;
            var2 ^= -2084984317;
            IllegalStateException var9 = new IllegalStateException();
            throw var9;
        }
    }

    public eJ inset(float var1, float var2) {
        int var3 = Kr;
        var3 ^= -1593708164;
        int var4 = System.identityHashCode(this);
        Integer var26 = var4;
        if (var26 != null) {
            var3 -= -191971232;
            var3 >>>= 28;
            var3 &= -1701384219;
            var3 |= -1703991917;
            var3 ^= -743809344;
            var26 = var3;
            if (var26 != null) {
                float var5 = this.R;
                var5 += var1;
                float var6 = this.v;
                var6 += var2;
                float var7 = this.aa;
                float var8 = var1 * 2.0F;
                var7 -= var8;
                var7 = Math.max(0.0F, var7);
                var8 = this.p;
                float var9 = var2 * 2.0F;
                var8 -= var9;
                var8 = Math.max(0.0F, var8);
                return new eJ(var5, var6, var7, var8);
            }
        } else {
            long var20 = switch (var3) {
                default -> var3 ^ -1070161173;
                case -1405207307 -> var3 ^ -260192586;
                case 1247567504 -> {
                    var3 -= 1816327248;
                    var3 ^= -1540682893;
                    var3 *= -398878895;
                    yield var3 ^ 1011660845;
                }
            };
            long var29 = var20 + 1L;
            var29 = var20 * var29;
            long var36 = var20 + 2L;
            var29 *= var36;
            long var21 = var20 + 3L;
            var29 *= var21;
            long var22 = var29 & 7L;
            long var40;
            var3 = (var40 = var22 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var3 == 0) {
                RuntimeException var25 = new RuntimeException();
                throw var25;
            }
        }

        IllegalStateException var24 = new IllegalStateException();
        throw var24;
    }

    public eJ offset(float var1, float var2) {
        int var3 = Kr;
        var3 ^= 251109321;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        int var6 = var4 + 2;
        var5 *= var6;
        var4 += 3;
        var5 *= var4;
        var4 = var5 & 7;
        if (var4 == 0) {
            Integer var23 = switch (var3) {
                case -521072060 -> var3 ^ 10422033;
                case -441831387 -> {
                    var3 ^= -1678455757;
                    yield var3 ^ -2142260822;
                }
                default -> var3 ^ -1762480667;
            };
            if (var23 != null) {
                float var27 = this.R;
                float var28 = var27 + var1;
                float var31 = this.v;
                float var32 = var31 + var2;
                float var7 = this.aa;
                float var8 = this.p;
                return new eJ(var28, var32, var7, var8);
            }
        } else {
            long var16 = switch (var3) {
                case -441831387 -> {
                    var3 *= 1208463633;
                    var3 |= 1596886225;
                    var3 -= -340274868;
                    yield var3 ^ -60791199;
                }
                case -244966043 -> var3 ^ -1166025513;
                default -> var3 ^ 1428088428;
            };
            long var29 = var16 + 1L;
            long var30 = var16 * var29;
            long var17 = var30 & 1L;
            long var33;
            var3 = (var33 = var17 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    public eJ withHeight(float var1) {
        int var2 = Kr;
        var2 ^= -389691502;
        int var3 = System.identityHashCode(this);
        Integer var16 = var3;
        if (var16 == null) {
            var2 *= 807182607;
            var2 += 1020818196;
            var2 ^= -567005639;
            var16 = var2;
            if (var16 == null) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            } else {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            }
        } else {
            switch (var2) {
                case 60319870:
                    var2 -= -587217782;
                    var2 >>>= 24;
                    var2 *= -1249813623;
                    var2 ^= 380473031;
                    break;
                case 752986657:
                    var2 ^= 302774088;
                    break;
                case 1760435613:
                default:
                    var2 ^= -1524600680;
            }

            float var17 = this.R;
            float var4 = this.v;
            float var5 = this.aa;
            return new eJ(var17, var4, var5, var1);
        }
    }

    public eJ withWidth(float var1) {
        int var2 = Kr;
        var2 ^= -190613605;
        int var3 = System.identityHashCode(this);
        Integer var16 = var3;
        if (var16 == null) {
            var2 += 1511941661;
            var2 += -787694479;
            var2 ^= 447028298;
            RuntimeException var18 = new RuntimeException();
            throw var18;
        } else {
            switch (var2) {
                case 536795255:
                    var2 >>>= 27;
                    var2 &= 1093406159;
                    var2 &= -1061605980;
                    var2 ^= -1567391142;
                    break;
                case 1812474459:
                    var2 ^= 484109824;
                    break;
                case 1897224464:
                default:
                    var2 ^= -65977205;
            }

            float var17 = this.R;
            float var4 = this.v;
            float var5 = this.p;
            return new eJ(var17, var4, var1, var5);
        }
    }

    public eJ scaleCentered(float var1) {
        int var2 = Kr;
        var2 ^= 1976101180;
        int var3 = System.identityHashCode(this);
        float var4 = this.aa;
        var4 *= var1;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var3 = var5 & 1;
        if (var3 != 0) {
            var2 = switch (var2) {
                case -1778771397 -> var2 ^ 959763546;
                case -1634384176 -> {
                    var2 ^= 1019444755;
                    var2 -= -1217303010;
                    yield var2 ^ 1959220619;
                }
                default -> var2 ^ 176052225;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            }
        } else {
            var2 <<= 14;
            var2 *= 35332589;
            var2 &= -822334690;
            var2 ^= 704795320;
            var2 ^= 1167163584;
            long var17 = var2;
            long var30 = var17 + 1L;
            long var31 = var17 * var30;
            long var18 = var31 & 1L;
            long var36;
            var2 = (var36 = var18 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                float var26 = this.p;
                float var27 = var26 * var1;
                float var32 = this.centerX();
                float var6 = var4 * 0.5F;
                float var33 = var32 - var6;
                var6 = this.centerY();
                float var7 = var27 * 0.5F;
                var6 -= var7;
                return new eJ(var33, var6, var4, var27);
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public eJ intersect(eJ var1) {
        eJ var81 = null;
        int var2 = Kr;
        var2 ^= -194206298;
        int var3 = System.identityHashCode(this);
        float var4 = this.R;
        float var5 = var1.R;
        var4 = Math.max(var4, var5);
        var5 = this.v;
        float var6 = var1.v;
        var5 = Math.max(var5, var6);
        var6 = this.right();
        float var7 = var1.right();
        var6 = Math.min(var6, var7);
        var7 = this.bottom();
        float var8 = var1.bottom();
        var7 = Math.min(var7, var8);
        int var95 = var3 + 1;
        int var96 = var3 * var95;
        int var9 = var3 + 2;
        int var97 = var96 * var9;
        var9 = var3 + 3;
        int var98 = var97 * var9;
        int var99 = var98 & 7;
        if (var99 != 0) {
            switch (var2) {
                case 523307594:
                    var2 *= 1515422929;
                    var2 >>= 5;
                    var2 &= 2055506174;
                    var2 -= 585412492;
                    var2 ^= -1654922073;
                    break;
                case 735743607:
                    var2 ^= 1648118562;
                    break;
                case 1192320964:
                default:
                    var2 ^= 373103803;
            }
        } else {
            label112: {
                var2 *= -539064729;
                var2 ^= 1764380137;
                int var100 = var2 + 1;
                int var101 = var2 * var100;
                var9 = var2 + 2;
                int var102 = var101 * var9;
                var9 = var2 + 3;
                int var103 = var102 * var9;
                int var104 = var103 & 7;
                label86:
                if (var104 == 0) {
                    label110: {
                        float var130;
                        int var105 = (var130 = var6 - var4) == 0.0F ? 0 : (var130 < 0.0F ? -1 : 1);
                        if (var105 > 0) {
                            var2 &= -246927793;
                            var2 += 547373848;
                            var2 -= -1236247755;
                            var2 ^= -672140647;
                            long var106 = var2;
                            long var10 = var106 + 1L;
                            var10 = var106 * var10;
                            long var12 = var106 + 2L;
                            var10 *= var12;
                            long var107 = var106 + 3L;
                            var10 *= var107;
                            long var108 = var10 & 7L;
                            long var131;
                            int var109 = (var131 = var108 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                            if (var109 != 0) {
                                break label86;
                            }

                            float var132;
                            int var110 = (var132 = var7 - var5) == 0.0F ? 0 : (var132 < 0.0F ? -1 : 1);
                            long var118 = var3;
                            long var11 = var118 + 1L;
                            var11 = var118 * var11;
                            long var119 = var11 & 1L;
                            long var133;
                            var9 = (var133 = var119 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                            if (var9 != 0) {
                                switch (var2) {
                                    case -1939858581:
                                        var2 >>= 10;
                                        var2 ^= -1088215993;
                                        break label112;
                                    case 594169328:
                                    default:
                                        var2 ^= 434497870;
                                        break label112;
                                    case 1028056319:
                                        var2 ^= 1502090153;
                                        break label112;
                                }
                            }

                            var2 |= -1753522418;
                            var2 <<= 3;
                            var2 |= 233640563;
                            var2 += -82179532;
                            var2 ^= -163490173;
                            long var121 = var2;
                            var11 = var121 + 1L;
                            var11 = var121 * var11;
                            long var122 = var11 & 1L;
                            long var134;
                            var9 = (var134 = var122 - 0L) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                            if (var9 != 0) {
                                break label86;
                            }

                            if (var110 > 0) {
                                var2 >>= 9;
                                var2 |= -1040884466;
                                var2 += 1480200550;
                                var2 ^= 331887525;
                                eJ var80 = mZ(var4, var5, var6, var7);
                                int var84 = var3 + 1;
                                int var85 = var3 * var84;
                                int var86 = var85 & 1;
                                if (var86 != 0) {
                                    var2 *= 714636989;
                                    var2 ^= 819810737;
                                    break label112;
                                }

                                var2 <<= 28;
                                var2 &= -1252350651;
                                var2 >>= 14;
                                var2 ^= 924239059;
                                var81 = var80;
                                switch (var2) {
                                    case -1595935313:
                                        var2 ^= -970950423;
                                        break label110;
                                    case 924239059:
                                        var2 |= -947616824;
                                        var2 *= -565047793;
                                        var2 -= 1702375991;
                                        var2 ^= 1301356427;
                                        break label110;
                                    case 1611402893:
                                    default:
                                        var2 ^= -520526714;
                                        break label110;
                                }
                            }

                            switch (var2) {
                                case 176905151:
                                default:
                                    var2 ^= -1127987292;
                                    break;
                                case 224088876:
                                    var2 += -464101434;
                                    var2 ^= 1144071160;
                                    break;
                                case 1783806283:
                                    var2 ^= -1961720322;
                            }
                        } else {
                            var2 -= -649162423;
                            var2 ^= -1349152276;
                        }

                        int var87 = var2 + 1;
                        int var88 = var2 * var87;
                        int var111 = var2 + 2;
                        int var89 = var88 * var111;
                        int var112 = var2 + 3;
                        int var90 = var89 * var112;
                        int var91 = var90 & 7;
                        if (var91 != 0) {
                            break label86;
                        }

                        eJ var92 = new eJ(var4, var5, 0.0F, 0.0F);
                        Integer var67 = var3;
                        if (var67 == null) {
                            var2 |= -558488759;
                            var2 *= 338043947;
                            var2 ^= 1590203864;
                            break label112;
                        }
                        var2 = switch (var2) {
                            case -1249865462 -> {
                                var2 -= -689802090;
                                var2 *= -1720972607;
                                var2 *= -357831101;
                                var2 *= -460088757;
                                yield var2 ^ -683698328;
                            }
                            case -313067269 -> var2 ^ 1000183576;
                            default -> var2 ^ 700820229;
                        };
                        long var68 = var2;
                        long var113 = var68 + 1L;
                        long var114 = var68 * var113;
                        long var69 = var114 & 1L;
                        long var135;
                        int var70 = (var135 = var69 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                        if (var70 != 0) {
                            break label86;
                        }

                        var81 = var92;
                        var2 += 1418076646;
                        var2 += -973547899;
                        var2 |= 1759929296;
                        var2 *= -727508599;
                        var2 ^= -1189310694;
                    }

                    long var71 = var2;
                    long var93 = var71 + 1L;
                    long var94 = var71 * var93;
                    long var72 = var94 & 1L;
                    long var136;
                    var3 = (var136 = var72 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        return var81;
                    }
                }

                UnsupportedOperationException var74 = new UnsupportedOperationException();
                throw var74;
            }
        }

        UnsupportedOperationException var66 = new UnsupportedOperationException();
        throw var66;
    }

    public boolean isEmpty() {
        label61: {
            int var1 = Kr;
            var1 ^= 630291016;
            int var2 = System.identityHashCode(this);
            float var3 = this.aa;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            var4 &= 1;
            if (var4 != 0) {
                switch (var1) {
                    case -825436764:
                        var1 -= 306899300;
                        var1 &= 221799501;
                        var1 ^= 1745577746;
                        break;
                    case -781912417:
                    default:
                        var1 ^= 1936641047;
                        break;
                    case 2035690920:
                        var1 ^= 1985005454;
                }
            } else {
                label67: {
                    var1 &= -753626615;
                    var1 *= -37442957;
                    var1 |= 202464663;
                    var1 <<= 20;
                    var1 ^= -240420862;
                    float var67;
                    int var55 = (var67 = var3 - 0.0F) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
                    if (var55 > 0) {
                        var1 >>= 6;
                        var1 ^= -168270223;
                        Integer var56 = var1;
                        if (var56 == null) {
                            break label61;
                        }

                        var3 = this.p;
                        Integer var48 = var2;
                        if (var48 == null) {
                            var1 &= -1764413896;
                            var1 *= -1510819961;
                            var1 -= 2093252119;
                            var1 ^= 524436235;
                            break label67;
                        }

                        var1 >>= 17;
                        var1 ^= -253268119;
                        var1 <<= 24;
                        var1 ^= 802958695;
                        var1 ^= -1812855467;
                        float var68;
                        int var49 = (var68 = var3 - 0.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                        if (var49 > 0) {
                            var1 -= 1055322765;
                            var1 ^= 1338124110;
                            long var50 = var1;
                            long var63 = var50 + 1L;
                            long var64 = var50 * var63;
                            long var6 = var50 + 2L;
                            long var65 = var64 * var6;
                            long var51 = var50 + 3L;
                            long var66 = var65 * var51;
                            long var52 = var66 & 7L;
                            long var69;
                            var49 = (var69 = var52 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                            if (var49 != 0) {
                                break label61;
                            }

                            boolean var54 = false;
                            var1 |= 607906094;
                            var1 += -1245948265;
                            var1 -= -696584663;
                            var1 ^= 309097195;
                            return var54;
                        }

                        var1 ^= -724401095;
                        var1 += -87859047;
                        var1 |= -1005964436;
                        var1 &= 974473204;
                        var1 ^= 1105251136;
                    } else {
                        var1 |= -1865434535;
                        var1 *= -750957887;
                        var1 -= 784131751;
                        var1 += 2000311494;
                        var1 ^= 1938208286;
                    }

                    Integer var58 = var1;
                    if (var58 == null) {
                        break label61;
                    }

                    boolean var70 = true;
                    var1 -= 315685523;
                    var1 >>= 21;
                    var1 |= -1362347347;
                    var1 ^= -1225705272;
                    var1 ^= 1548758227;
                    return var70;
                }
            }

            Integer var59 = var1;
            if (var59 != null) {
                IllegalArgumentException var60 = new IllegalArgumentException();
                throw var60;
            }
        }

        IllegalStateException var47 = new IllegalStateException();
        throw var47;
    }




    public float x() {
        int var1 = Kr;
        var1 ^= -1369431874;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var26;
        var2 = (var26 = var20 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -1052936280:
                    var1 ^= 1798558016;
                    break;
                case -855801960:
                default:
                    var1 ^= 1693574677;
                    break;
                case 1161662290:
                    var1 ^= 634206223;
                    var1 &= 683371394;
                    var1 ^= 1764837331;
            }

            IllegalArgumentException var22 = new IllegalArgumentException();
            throw var22;
        } else {
            switch (var1) {
                case 192719731:
                default:
                    var1 ^= -188486608;
                    break;
                case 1161662290:
                    var1 += 41607917;
                    var1 ^= -1676719618;
                    break;
                case 1175971898:
                    var1 ^= 1540064808;
            }

            return this.R;
        }
    }

    public float y() {
        int var1 = Kr;
        var1 ^= -1827093058;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 != null) {
            var1 ^= 1174203677;
            var1 ^= 380960899;
            return this.v;
        } else {
            var1 -= -731766245;
            var1 *= -495932445;
            var1 ^= -1453556492;
            long var11 = var1;
            long var3 = var11 + 1L;
            var3 = var11 * var3;
            long var5 = var11 + 2L;
            var3 *= var5;
            long var12 = var11 + 3L;
            var3 *= var12;
            long var13 = var3 & 7L;
            long var23;
            var1 = (var23 = var13 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var1 != 0) {
                AssertionError var16 = new AssertionError();
                throw var16;
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }
    }

    public float width() {
        int var1 = Kr;
        var1 ^= -131955727;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 == null) {
            var1 |= -1916750005;
            var1 <<= 21;
            var1 |= 225413558;
            var1 -= 1099494895;
            var1 ^= -1799143914;
            IllegalStateException var14 = new IllegalStateException();
            throw var14;
        } else {
            var1 >>>= 22;
            var1 ^= -1068413301;
            Integer var6 = var1;
            if (var6 != null) {
                return this.aa;
            } else {
                IllegalStateException var7 = new IllegalStateException();
                throw var7;
            }
        }
    }

    public float height() {
        int var1 = Kr;
        var1 ^= 1653430240;
        int var2 = System.identityHashCode(this);
        Integer var15 = var2;
        if (var15 != null) {
            var1 >>>= 10;
            var1 *= 1259834185;
            var1 ^= -284508309;
            return this.p;
        } else {
            Integer var9 = switch (var1) {
                case -1982793716 -> {
                    var1 ^= -421598511;
                    var1 -= 998720218;
                    var1 += -73361515;
                    var1 += -1102604828;
                    yield var1 ^ 1522562596;
                }
                case -922039780 -> var1 ^ -86430348;
                default -> var1 ^ 335480856;
            };
            if (var9 == null) {
                IllegalArgumentException var11 = new IllegalArgumentException();
                throw var11;
            } else {
                AssertionError var10 = new AssertionError();
                throw var10;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1268534004;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Kr = var4;
        eJ var5 = new eJ(0.0F, 0.0F, 0.0F, 0.0F);
        EMPTY = var5;
    }
}
