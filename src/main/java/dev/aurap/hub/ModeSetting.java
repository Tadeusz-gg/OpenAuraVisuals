package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Locale;

public final class ModeSetting extends Setting {
    private final Enum[] Pd;
    private Enum[] w;
    private final Enum Zv;
    private Enum Y;
    private El N;
    public static final int q;

    public ModeSetting(String var1, String var2, Enum var3) {
        super(var1, var2);
        this.Zv = var3;
        this.Y = var3;
        Class var4 = var3.getDeclaringClass();
        Object[] var5 = var4.getEnumConstants();
        Enum[] var6 = (Enum[])var5;
        this.Pd = var6;
        Enum[] var7 = this.Pd;
        this.w = var7;
    }

    public ModeSetting FP(Enum[] var1) {
        label101: {
            int var2 = q;
            var2 ^= -1517164227;
            int var3 = System.identityHashCode(this);
            int var4 = 0;
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var124;
            int var89 = (var124 = var5 - 0L) == 0L ? 0 : (var124 < 0L ? -1 : 1);
            if (var89 == 0) {
                var2 *= 183405795;
                var2 *= -206832829;
                var2 += 706727156;
                var2 ^= -40681637;
                var5 = var2;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var125;
                int var92 = (var125 = var5 - 0L) == 0L ? 0 : (var125 < 0L ? -1 : 1);
                if (var92 != 0) {
                    break label101;
                }

                Enum[] var93 = var1;
                int var6 = var1.length;
                var6 = var6;
                byte var101 = 0;
                var4 = (var4 != 0) ? 1 : 0;
                int var102 = var101;

                var2 = switch (var2) {
                    case -292996065 -> var2 ^ -708975794;
                    default -> var2 ^ -959176846;
                    case 1580883678 -> {
                        var2 &= -728564380;
                        yield var2 ^ 1031532499;
                    }
                };

                label98:
                while (true) {
                    long var8 = var2;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    long var12 = var8 + 2L;
                    var10 *= var12;
                    var8 += 3L;
                    var10 *= var8;
                    var8 = var10 & 7L;
                    long var126;
                    int var105 = (var126 = var8 - 0L) == 0L ? 0 : (var126 < 0L ? -1 : 1);
                    if (var105 != 0) {
                        break label101;
                    }

                    if (var102 >= var6) {
                        var2 &= 2141314894;
                        var2 ^= -633119924;
                        if (var4 == 0) {
                            var2 *= 268324499;
                            var2 ^= 1737393553;
                            Enum var94 = this.Zv;
                            String var95 = String.valueOf(var94);
                            String var96 = "default not allowed: " + var95;
                            IllegalArgumentException var85 = new IllegalArgumentException(var96);
                            throw var85;
                        }

                        var2 -= 130156980;
                        var2 ^= -671680573;
                        var4 = var2 + 1;
                        var4 = var2 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            break label101;
                        }

                        Object var83 = var1.clone();
                        Enum[] var84 = (Enum[])var83;
                        Integer var77 = var3;
                        if (var77 != null) {
                            var2 += 189479735;
                            var2 *= 1369981115;
                            var2 <<= 2;
                            var2 ^= -1712546858;
                            var77 = var2;
                            if (var77 != null) {
                                this.w = var84;
                                return this;
                            }
                            break label101;
                        }

                        switch (var2) {
                            case -2005095108:
                                var2 ^= -589608949;
                                break label98;
                            case 1364839358:
                            default:
                                var2 ^= 1592704493;
                                break label98;
                            case 2086029653:
                                var2 |= -1081184760;
                                var2 <<= 2;
                                var2 += 1090861580;
                                var2 <<= 19;
                                var2 ^= -1143374952;
                                break label98;
                        }
                    }

                    var2 |= 841468476;
                    var2 ^= 517685207;
                    Enum var106 = var93[var102];
                    Integer var9 = var3;
                    if (var9 == null) {
                        var2 &= 1563944006;
                        var2 <<= 24;
                        var2 ^= 211674489;
                        var2 &= 1742356979;
                        var2 ^= 1128348393;
                        break;
                    }

                    var2 -= 969717918;
                    var2 ^= -1753930973;
                    Enum var110 = this.Zv;
                    int var108 = 0;
                    if (var106 == var110) {
                        var2 = switch (var2) {
                            case -1130551063 -> {
                                var2 &= 1999625234;
                                var2 <<= 12;
                                yield var2 ^ 1140218657;
                            }
                            default -> var2 ^ 236614970;
                            case 1542114521 -> var2 ^ -1574986613;
                        };
                        Integer var107 = var2;
                        if (var107 == null) {
                            break label101;
                        }

                        var108 = 1;
                        var2 += 46742958;
                        var2 ^= 1659955940;
                        var2 ^= 893893153;
                    } else {
                        var2 |= 1913833744;
                        var2 -= 521384027;
                        var2 ^= -694539438;
                        var2 *= -2137990761;
                        var2 ^= 1416240862;
                        var108 = 0;
                        var2 |= -1083262640;
                        var2 ^= 1529296457;
                        var2 |= -1126784989;
                        var2 >>= 1;
                        var2 ^= 535240147;
                    }

                    var9 = var2;
                    if (var9 == null) {
                        break label101;
                    }

                    boolean var109 = (var4 != 0) | (var108 != 0);
                    var9 = var3;
                    if (var9 == null) {
                        var2 |= -1298655781;
                        var2 ^= 1573795325;
                        var2 |= 2087670314;
                        var2 ^= -106528330;
                        break;
                    }

                    var2 -= -134772867;
                    var2 *= -321049609;
                    var2 <<= 21;
                    var2 -= 1798741376;
                    var2 ^= -1411682410;
                    int var113 = var2 + 1;
                    var113 = var2 * var113;
                    int var122 = var2 + 2;
                    var113 *= var122;
                    int var123 = var2 + 3;
                    var113 *= var123;
                    var113 &= 7;
                    if (var113 != 0) {
                        break label101;
                    }

                    var113 = var102 + 1;
                    var4 = var109 ? 1 : 0;
                    var102 = var113;
                    var2 -= 889291676;
                    var2 |= 1008359853;
                    var2 *= 1438508999;
                    var2 &= -1560684476;
                    var2 ^= -375899241;
                }
            } else {
                var2 |= 1673813392;
                var2 ^= -334035359;
            }

            long var72 = var2;
            long var86 = var72 + 1L;
            long var87 = var72 * var86;
            long var73 = var87 & 1L;
            long var127;
            var2 = (var127 = var73 - 0L) == 0L ? 0 : (var127 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var76 = new AssertionError();
                throw var76;
            }
        }

        AssertionError var75 = new AssertionError();
        throw var75;
    }

    public Enum[] M() {
        int var1 = q;
        var1 ^= 63340724;
        int var2 = System.identityHashCode(this);
        Enum[] var3 = this.w;
        Object var19 = var3.clone();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var22;
        var2 = (var22 = var4 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= 1901119597;
            var1 ^= -934012731;
            Integer var18 = var1;
            if (var18 != null) {
                return (Enum[])var19;
            }
        } else {
            Integer var14 = switch (var1) {
                default -> var1 ^ -1474421554;
                case 1314460768 -> {
                    var1 &= -1163763161;
                    var1 *= 1044395873;
                    yield var1 ^ -825989951;
                }
                case 1412949598 -> var1 ^ -914202693;
            };
            if (var14 != null) {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    public int g() {
        int var1 = q;
        var1 ^= -1828398326;
        int var2 = System.identityHashCode(this);
        long var3 = var2;
        long var5 = var3 + 1L;
        var5 = var3 * var5;
        var3 = var5 & 1L;
        long var95;
        int var64 = (var95 = var3 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
        if (var64 != 0) {
            switch (var1) {
                case -2100424239:
                    var1 ^= 231020305;
                    break;
                case -560246818:
                    var1 += -1401472986;
                    var1 *= 555756851;
                    var1 ^= 1294083175;
                    break;
                case -414729375:
                default:
                    var1 ^= 948225322;
            }
        } else {
            var1 *= 876602677;
            var1 *= -2027991521;
            var1 |= 196028403;
            var1 <<= 16;
            var1 ^= 1349698360;
            byte var65 = 0;
            int var66 = var65;
            var1 ^= -2082490308;
            var1 >>>= 30;
            var1 ^= 2025280668;

            label76:
            while (true) {
                Enum[] var4 = this.w;
                var5 = var2;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var96;
                int var82 = (var96 = var5 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                if (var82 != 0) {
                    var1 += 397822361;
                    var1 ^= -1504282979;
                    break;
                }

                var1 &= -406110908;
                var1 ^= -2126817802;
                var1 *= -881601155;
                var1 ^= -803674515;
                var5 = var1;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var97;
                int var85 = (var97 = var5 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                if (var85 == 0) {
                    int var67 = var4.length;
                    if (var66 >= var67) {
                        var1 >>>= 19;
                        var1 &= -1413124103;
                        var1 += 297901423;
                        var1 ^= -798641078;
                        var1 ^= -15718974;
                        return 0;
                    }

                    var1 |= 179257793;
                    var1 >>>= 16;
                    var1 |= 1571680101;
                    var1 ^= -630179427;
                    int var68 = var1 + 1;
                    int var69 = var1 * var68;
                    int var86 = var1 + 2;
                    int var70 = var69 * var86;
                    int var87 = var1 + 3;
                    int var71 = var70 * var87;
                    int var72 = var71 & 7;
                    if (var72 == 0) {
                        var4 = this.w;
                        Enum var74 = var4[var66];
                        Integer var88 = var2;
                        if (var88 == null) {
                            var1 *= -675292421;
                            var1 ^= 1413815997;
                            break;
                        }

                        var1 -= 532573594;
                        var1 ^= -471161927;
                        Enum var89 = this.Y;
                        if (var74 == var89) {
                            switch (var1) {
                                case -1946813583:
                                    var1 -= 222917613;
                                    var1 += -608431642;
                                    var1 -= 334250653;
                                    var1 -= 720774973;
                                    var1 ^= -1222994426;
                                    break;
                                case -4160746:
                                    var1 ^= -1395800995;
                                    break;
                                case 990719560:
                                default:
                                    var1 ^= -123012302;
                            }

                            return var66;
                        }

                        var1 |= -330221931;
                        var1 ^= 133159827;
                        long var75 = var1;
                        long var6 = var75 + 1L;
                        var6 = var75 * var6;
                        long var76 = var6 & 1L;
                        long var98;
                        int var77 = (var98 = var76 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                        if (var77 == 0) {
                            int var78 = var66 + 1;
                            Integer var90 = var2;
                            if (var90 == null) {
                                switch (var1) {
                                    case -1913793907:
                                    default:
                                        var1 ^= 1192623472;
                                        break label76;
                                    case -400939930:
                                        var1 &= -146797950;
                                        var1 += -353269503;
                                        var1 ^= -53845592;
                                        break label76;
                                    case -389281488:
                                        var1 ^= 557946076;
                                        break label76;
                                }
                            }
                            var1 = switch (var1) {
                                default -> var1 ^ 1738999054;
                                case -400939930 -> {
                                    var1 &= 497082923;
                                    var1 -= 457135685;
                                    yield var1 ^ 164256973;
                                }
                                case 604456530 -> var1 ^ 289498345;
                            };
                            var66 = var78;
                            var1 |= 40131016;
                            var1 |= 1570342639;
                            var1 ^= -2025288862;
                            continue;
                        }
                    }
                }

                AssertionError var62 = new AssertionError();
                throw var62;
            }
        }

        IllegalStateException var61 = new IllegalStateException();
        throw var61;
    }

    public int Bz() {
        int var1 = q;
        var1 ^= 834797246;
        int var2 = System.identityHashCode(this);
        Enum var3 = this.Y;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var28;
        var2 = (var28 = var4 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= 1153735338;
            var1 ^= -44731399;
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var29;
            var2 = (var29 = var4 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 == 0) {
                return var3.ordinal();
            }
        } else {
            long var13 = switch (var1) {
                default -> var1 ^ 335230241;
                case 778537260 -> var1 ^ -989966444;
                case 2086562410 -> {
                    var1 += -798335420;
                    yield var1 ^ -942485838;
                }
            };
            long var20 = var13 + 1L;
            long var21 = var13 * var20;
            long var14 = var21 & 1L;
            long var30;
            var1 = (var30 = var14 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    public boolean TJ(Enum var1) {
        int var2 = q;
        var2 ^= 1324238077;
        int var3 = System.identityHashCode(this);
        Enum var4 = this.Y;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 != 0) {
            var2 += 5290982;
            var2 *= 2087709327;
            var2 <<= 2;
            var2 &= 2110952151;
            var2 ^= -154679167;
            long var51 = var2;
            long var7 = var51 + 1L;
            var7 = var51 * var7;
            long var52 = var7 & 1L;
            long var57;
            var3 = (var57 = var52 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var37 = new IllegalArgumentException();
                throw var37;
            }
        } else {
            var2 += -1402338464;
            var2 -= 1097682321;
            var2 ^= 984891501;
            var2 |= 373437331;
            var2 ^= 2119675346;
            Integer var38 = var2;
            label41:
            if (var38 != null) {
                boolean var40;
                if (var4 == var1) {
                    var2 |= 812760339;
                    var2 += 752371457;
                    var2 ^= 533847650;
                    var38 = var2;
                    if (var38 == null) {
                        break label41;
                    }

                    var40 = true;
                    switch (var2) {
                        case -1727923068:
                            var2 ^= -249704056;
                            break;
                        case -247808668:
                        default:
                            var2 ^= -1068917002;
                            break;
                        case 2047318074:
                            var2 &= 296529783;
                            var2 ^= 1228819785;
                    }
                } else {
                    var2 -= 1062342627;
                    var2 += -883569593;
                    var2 |= 1766228265;
                    var2 >>>= 9;
                    var2 ^= 652998504;
                    long var41 = var2;
                    long var54 = var41 + 1L;
                    long var55 = var41 * var54;
                    long var42 = var55 & 1L;
                    long var58;
                    int var43 = (var58 = var42 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                    if (var43 != 0) {
                        break label41;
                    }

                    var40 = false;
                    var2 ^= -324367453;
                    var2 ^= -1828367749;
                }

                int var44 = var2 + 1;
                int var45 = var2 * var44;
                var5 = var2 + 2;
                int var46 = var45 * var5;
                var2 += 3;
                int var47 = var46 * var2;
                var2 = var47 & 7;
                if (var2 == 0) {
                    return var40;
                }
            }
        }

        IllegalStateException var33 = new IllegalStateException();
        throw var33;
    }

    public ModeSetting w(El var1) {
        int var2 = q;
        var2 ^= -382457721;
        int var3 = System.identityHashCode(this);
        long var21 = var3;
        long var5 = var21 + 1L;
        var5 = var21 * var5;
        long var7 = var21 + 2L;
        var5 *= var7;
        long var22 = var21 + 3L;
        var5 *= var22;
        long var23 = var5 & 7L;
        long var33;
        var3 = (var33 = var23 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var3 == 0) {
            Integer var25 = switch (var2) {
                case -1532249005 -> {
                    var2 -= -1515998884;
                    var2 ^= -1630040164;
                    var2 += -689755889;
                    yield var2 ^ -61413509;
                }
                case 1758663108 -> var2 ^ -1000906457;
                default -> var2 ^ 1409608654;
            };
            if (var25 != null) {
                this.N = var1;
                return this;
            }
        } else {
            var2 &= -852545248;
            var2 *= 440544297;
            var2 ^= -1791373661;
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var4 = var2 + 2;
            var3 *= var4;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            }
        }

        IllegalArgumentException var19 = new IllegalArgumentException();
        throw var19;
    }

    public boolean m() {
        int var1 = q;
        var1 ^= -1548524146;
        int var2 = System.identityHashCode(this);
        Integer var37 = var2;
        label34:
        if (var37 != null) {
            var1 >>= 6;
            var1 -= -1024226958;
            var1 *= -229924759;
            var1 ^= -829055755;
            El var38 = this.N;
            boolean var39;
            if (var38 != null) {
                var1 *= 1019584147;
                var1 ^= -1026036439;
                var1 ^= 123961339;
                var39 = true;
                var1 |= 1921118791;
                var1 &= 711456132;
                var1 ^= -1642083346;
            } else {
                var1 -= 1920444149;
                var1 &= 374272901;
                var1 ^= 1103419572;
                var1 -= 1806725022;
                var1 ^= 522834338;
                long var3 = var1;
                long var5 = var3 + 1L;
                var5 = var3 * var5;
                var3 = var5 & 1L;
                long var49;
                int var41 = (var49 = var3 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
                if (var41 != 0) {
                    break label34;
                }

                var39 = false;
                switch (var1) {
                    case -191822249:
                        var1 ^= 656898797;
                        break;
                    case -147821899:
                        var1 ^= -49957459;
                        var1 -= 1497350625;
                        var1 -= -1969414859;
                        var1 |= -2079874783;
                        var1 ^= 306552777;
                        break;
                    case 1650050987:
                    default:
                        var1 ^= -399024088;
                }
            }

            Integer var42 = var1;
            if (var42 != null) {
                return var39;
            }
        } else {
            var1 ^= -894697327;
            var1 &= 1416550814;
            var1 -= -1687748761;
            var1 ^= -714776621;
            long var31 = var1;
            long var43 = var31 + 1L;
            var43 = var31 * var43;
            long var48 = var31 + 2L;
            var43 *= var48;
            long var32 = var31 + 3L;
            var43 *= var32;
            long var33 = var43 & 7L;
            long var50;
            var1 = (var50 = var33 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var36 = new IllegalArgumentException();
                throw var36;
            }
        }

        UnsupportedOperationException var35 = new UnsupportedOperationException();
        throw var35;
    }

    public int u(int var1, int var2) {
        int var3 = q;
        var3 ^= 2108489346;
        int var5 = System.identityHashCode(this);
        El var6 = this.N;
        long var7 = var5;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        var7 = var9 & 1L;
        long var40;
        var5 = (var40 = var7 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
        if (var5 != 0) {
            switch (var3) {
                case -934183610:
                    var3 ^= 708118402;
                    break;
                case 808675926:
                    var3 += 1330234282;
                    var3 >>= 5;
                    var3 >>= 14;
                    var3 *= 1831615245;
                    var3 ^= 1010807918;
                    break;
                case 1894555272:
                default:
                    var3 ^= 543159319;
            }

            var5 = var1 + 1;
            var5 = var1 * var5;
            int var37 = var1 + 2;
            var5 *= var37;
            int var38 = var1 + 3;
            var5 *= var38;
            var5 &= 7;
            if (var5 == 0) {
                IllegalArgumentException var35 = new IllegalArgumentException();
                throw var35;
            }
        } else {
            var3 >>>= 18;
            var3 &= -464142112;
            var3 -= -1146264393;
            var3 ^= 1546340839;
            var3 = var1 + 1;
            var3 = var1 * var3;
            var3 &= 1;
            if (var3 == 0) {
                Enum[] var27 = this.w;
                Enum var28 = var27[var1];
                return var6.t(var28, var2);
            }
        }

        RuntimeException var26 = new RuntimeException();
        throw var26;
    }

    public void p(int var1) {
        int var2 = q;
        var2 ^= 766734788;
        int var4 = System.identityHashCode(this);
        Enum[] var5 = this.w;
        int var28 = var5.length;
        Enum[] var6 = this.w;
        int var7 = this.g();
        var7 += var1;
        int var8 = var4 + 1;
        var8 = var4 * var8;
        int var9 = var4 + 2;
        var8 *= var9;
        var4 += 3;
        var8 *= var4;
        var4 = var8 & 7;
        if (var4 != 0) {
            var2 >>>= 6;
            var2 >>= 2;
            var2 ^= -1548569760;
            var2 &= -1822272728;
            var2 ^= 361877920;
            Integer var3 = var1;
            if (var3 == null) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            } else {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var2 ^= 129070860;
            var2 += -869065212;
            var2 ^= -1051979515;
            var2 ^= -197510748;
            var2 = var7 % var28;
            var2 += var28;
            var2 %= var28;
            Enum var18 = var6[var2];
            this.UY(var18);
        }
    }

    public static String R(Enum var0) {
        label175: {
            int var1 = q;
            var1 ^= -2075106766;
            int var2 = System.identityHashCode(var0);
            int var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 != 0) {
                var1 |= 1643158263;
                var1 &= -684071508;
                var1 >>= 24;
                var1 ^= 352119043;
            } else {
                var1 |= -1673157094;
                var1 ^= 657914414;
                long var110 = var1;
                long var5 = var110 + 1L;
                var5 = var110 * var5;
                long var111 = var5 & 1L;
                long var228;
                var3 = (var228 = var111 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                if (var3 != 0) {
                    break label175;
                }

                int var113 = (var0 instanceof oF) ? 1 : 0;
                if (var113 != 0) {
                    var1 += 403513960;
                    var1 ^= 1321079370;
                    oF var114 = (oF)var0;
                    Integer var4 = var2;
                    if (var4 != null) {
                        var1 = switch (var1) {
                            default -> var1 ^ 532672062;
                            case 1253753646 -> var1 ^ -474660075;
                            case 1572355442 -> {
                                var1 |= -1890456474;
                                var1 -= -1671995;
                                var1 ^= -1561805999;
                                yield var1 ^ -132336456;
                            }
                        };
                        int var122 = var1 + 1;
                        var122 = var1 * var122;
                        var122 &= 1;
                        if (var122 == 0) {
                            return var114.displayName();
                        }
                        break label175;
                    }

                    switch (var1) {
                        case -1714182298:
                            var1 ^= 555024414;
                            break;
                        case 1572355442:
                            var1 &= 518512699;
                            var1 |= -1136249908;
                            var1 |= 1075543636;
                            var1 ^= 402417980;
                            break;
                        case 2130585961:
                        default:
                            var1 ^= 1235258971;
                    }
                } else {
                    var1 |= -689388106;
                    var1 >>>= 18;
                    var1 &= 1208577805;
                    var1 ^= 782715443;
                    long var115 = var1;
                    var5 = var115 + 1L;
                    var5 = var115 * var5;
                    long var116 = var5 & 1L;
                    long var229;
                    var113 = (var229 = var116 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                    if (var113 != 0) {
                        break label175;
                    }

                    String var118 = var0.name();
                    Locale var125 = Locale.ROOT;
                    String var119 = var118.toLowerCase(var125);
                    String[] var120 = var119.split("_");
                    StringBuilder var126 = new StringBuilder();
                    StringBuilder var127 = var126;
                    String[] var121 = var120;
                    Integer var131 = var2;
                    if (var131 == null) {
                        var1 *= 64121349;
                        var1 ^= -388233479;
                    } else {
                        var1 = switch (var1) {
                            case -544262462 -> var1 ^ 824699240;
                            default -> var1 ^ -1755723173;
                            case 782722367 -> {
                                var1 &= -424017200;
                                var1 += 1010254544;
                                var1 += 1143664004;
                                var1 &= -1294548810;
                                yield var1 ^ -12047367;
                            }
                        };
                        var5 = var1;
                        long var7 = var5 + 1L;
                        var7 = var5 * var7;
                        long var9 = var5 + 2L;
                        var7 *= var9;
                        var5 += 3L;
                        var7 *= var5;
                        var5 = var7 & 7L;
                        long var230;
                        int var135 = (var230 = var5 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                        if (var135 != 0) {
                            break label175;
                        }

                        int var136 = var120.length;
                        int var137 = var136;
                        int var6 = 0;
                        var6 = var6;
                        var1 -= -1630046393;
                        var1 -= 1177024939;
                        var1 ^= -1502154942;
                        var1 ^= 2142396251;

                        while (true) {
                            var7 = var1;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var7 = var9 & 1L;
                            long var231;
                            int var148 = (var231 = var7 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                            if (var148 != 0) {
                                break label175;
                            }

                            if (var6 >= var137) {
                                var1 <<= 29;
                                var1 *= 1999539407;
                                var1 |= -1471752745;
                                var1 ^= 171969552;
                                var2 = var1 + 1;
                                var2 = var1 * var2;
                                var1 = var2 & 1;
                                if (var1 == 0) {
                                    return var127.toString();
                                }
                                break label175;
                            }

                            var1 -= -1263548567;
                            var1 ^= -949812259;
                            String var149 = var121[var6];
                            int var8 = var2 + 1;
                            var8 = var2 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                var1 &= -880983376;
                                var1 ^= 1440043294;
                                var1 ^= -1242626100;
                                break;
                            }
                            var1 = switch (var1) {
                                case 733691988 -> {
                                    var1 *= 1349351717;
                                    yield var1 ^ 2038357026;
                                }
                                default -> var1 ^ 314903751;
                                case 1919554422 -> var1 ^ 1230528115;
                            };
                            long var158 = var1;
                            long var10 = var158 + 1L;
                            var10 = var158 * var10;
                            long var159 = var10 & 1L;
                            long var232;
                            var8 = (var232 = var159 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                break label175;
                            }

                            int var161 = (var149.isEmpty()) ? 1 : 0;
                            if (var161 != 0) {
                                var1 &= 77997443;
                                var1 -= -1683556679;
                                var1 ^= -1320285507;
                                var1 *= -228212487;
                                var1 ^= 1571682456;
                                Integer var162 = var1;
                                if (var162 == null) {
                                    break label175;
                                }

                                var1 <<= 24;
                                var1 >>>= 10;
                                var1 ^= 1227593065;
                                var1 ^= -863445550;
                                var1 ^= -878092152;
                            } else {
                                var1 = switch (var1) {
                                    case 239262726 -> {
                                        var1 *= -108804159;
                                        var1 |= 502593360;
                                        var1 -= 1929676879;
                                        var1 |= -219710797;
                                        yield var1 ^ -1942055934;
                                    }
                                    case 1088486539 -> var1 ^ 1904324356;
                                    default -> var1 ^ 364773757;
                                };
                                long var163 = var1;
                                var10 = var163 + 1L;
                                var10 = var163 * var10;
                                long var12 = var163 + 2L;
                                var10 *= var12;
                                long var164 = var163 + 3L;
                                var10 *= var164;
                                long var165 = var10 & 7L;
                                long var233;
                                var161 = (var233 = var165 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                                if (var161 != 0) {
                                    break label175;
                                }

                                int var167 = (var127.isEmpty()) ? 1 : 0;
                                int var191 = var2 + 1;
                                int var192 = var2 * var191;
                                int var217 = var2 + 2;
                                int var193 = var192 * var217;
                                int var218 = var2 + 3;
                                int var194 = var193 * var218;
                                int var195 = var194 & 7;
                                if (var195 != 0) {
                                    var1 &= 798137451;
                                    var1 ^= -914120989;
                                    break;
                                }

                                var1 -= -194299605;
                                var1 ^= 2086473908;
                                int var196 = var1 + 1;
                                int var197 = var1 * var196;
                                int var198 = var197 & 1;
                                if (var198 != 0) {
                                    break label175;
                                }

                                if (var167 == 0) {
                                    var1 -= 1436083677;
                                    var1 ^= 688518124;
                                    var1 += 1231922642;
                                    var1 ^= 1085799022;
                                    var167 = var1 + 1;
                                    var167 = var1 * var167;
                                    int var199 = var1 + 2;
                                    var167 *= var199;
                                    int var200 = var1 + 3;
                                    var167 *= var200;
                                    var167 &= 7;
                                    if (var167 != 0) {
                                        break label175;
                                    }

                                    StringBuilder var173 = var127.append(' ');
                                    var1 &= 204551365;
                                    var1 *= -1266376081;
                                    var1 >>>= 23;
                                    var1 ^= 289863108;
                                } else {
                                    var1 ^= -1870942768;
                                    var1 |= 1073871300;
                                    var1 &= -191535352;
                                    var1 ^= -1051225318;
                                }

                                long var174 = var1;
                                var10 = var174 + 1L;
                                var10 = var174 * var10;
                                long var175 = var10 & 1L;
                                long var234;
                                var167 = (var234 = var175 - 0L) == 0L ? 0 : (var234 < 0L ? -1 : 1);
                                if (var167 != 0) {
                                    break label175;
                                }

                                char var177 = var149.charAt(0);
                                var177 = Character.toUpperCase(var177);
                                StringBuilder var179 = var127.append(var177);
                                int var201 = var2 + 1;
                                int var202 = var2 * var201;
                                int var221 = var2 + 2;
                                int var203 = var202 * var221;
                                int var222 = var2 + 3;
                                int var204 = var203 * var222;
                                int var205 = var204 & 7;
                                if (var205 != 0) {
                                    var1 -= -86263836;
                                    var1 ^= 413492379;
                                    var1 ^= -439529865;
                                    break;
                                }

                                var1 <<= 6;
                                var1 >>>= 16;
                                var1 *= 1525203857;
                                var1 ^= 49246250;
                                int var206 = var1 + 1;
                                int var207 = var1 * var206;
                                int var208 = var207 & 1;
                                if (var208 != 0) {
                                    break label175;
                                }

                                int var209 = var149.length();
                                StringBuilder var150 = var179.append(var149, 1, var209);
                                switch (var1) {
                                    case -1334649964:
                                        var1 ^= -802528420;
                                        break;
                                    case -1051315417:
                                        var1 ^= 269436304;
                                        var1 |= -1825592398;
                                        var1 ^= -1656301692;
                                        break;
                                    case 1221994742:
                                    default:
                                        var1 ^= -1415040072;
                                }
                            }

                            int var151 = var1 + 1;
                            int var152 = var1 * var151;
                            int var153 = var152 & 1;
                            if (var153 != 0) {
                                break label175;
                            }

                            int var154 = var6 + 1;
                            long var180 = var2;
                            var10 = var180 + 1L;
                            var10 = var180 * var10;
                            long var227 = var180 + 2L;
                            var10 *= var227;
                            long var181 = var180 + 3L;
                            var10 *= var181;
                            long var182 = var10 & 7L;
                            long var235;
                            var161 = (var235 = var182 - 0L) == 0L ? 0 : (var235 < 0L ? -1 : 1);
                            if (var161 != 0) {
                                var1 &= -1290396015;
                                var1 ^= -297677347;
                                var1 >>= 3;
                                var1 += -479675102;
                                var1 ^= 200401689;
                                break;
                            }

                            var1 -= 1923759094;
                            var1 >>>= 28;
                            var1 ^= -1311314551;
                            var161 = var1 + 1;
                            var161 = var1 * var161;
                            int var210 = var1 + 2;
                            var161 *= var210;
                            int var211 = var1 + 3;
                            var161 *= var211;
                            var161 &= 7;
                            if (var161 != 0) {
                                break label175;
                            }

                            var6 = var154;
                            switch (var1) {
                                case -1311314556:
                                    var1 *= -820396137;
                                    var1 ^= -1890083282;
                                    break;
                                case -383620546:
                                    var1 ^= 1549517075;
                                    break;
                                case 1548932209:
                                default:
                                    var1 ^= 266648016;
                            }
                        }
                    }
                }
            }

            long var101 = var1;
            long var138 = var101 + 1L;
            var138 = var101 * var138;
            long var155 = var101 + 2L;
            var138 *= var155;
            long var102 = var101 + 3L;
            var138 *= var102;
            long var103 = var138 & 7L;
            long var236;
            var2 = (var236 = var103 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var105 = new UnsupportedOperationException();
                throw var105;
            }
        }

        IllegalStateException var100 = new IllegalStateException();
        throw var100;
    }

    public Enum A() {
        int var1 = q;
        var1 ^= 444555232;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 != null) {
            var1 >>>= 10;
            var1 ^= 1889608409;
            var1 ^= -1197297487;
            var1 ^= 1131752838;
            var1 ^= 1814636082;
            int var17 = var1 + 1;
            var17 = var1 * var17;
            var17 &= 1;
            if (var17 == 0) {
                return this.Y;
            } else {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        } else {
            switch (var1) {
                case -326338001:
                default:
                    var1 ^= -211211038;
                    break;
                case 1124911284:
                    var1 ^= 1250314064;
                    break;
                case 1474349876:
                    var1 += -600177146;
                    var1 += 1746567195;
                    var1 |= -2104124789;
                    var1 ^= 1216214238;
            }

            IllegalArgumentException var10 = new IllegalArgumentException();
            throw var10;
        }
    }

    public void UY(Enum var1) {
        int var2 = q;
        var2 ^= 1973951365;
        int var3 = System.identityHashCode(this);
        Integer var4 = var3;
        if (var4 == null) {
            switch (var2) {
                case -2032946753:
                default:
                    var2 ^= -1220793301;
                    break;
                case -1967758869:
                    var2 ^= -1818918732;
                    break;
                case 943165265:
                    var2 *= -668081129;
                    var2 ^= -117681489;
                    var2 *= 1365398709;
                    var2 ^= -204011324;
            }
        } else {
            label78: {
                var2 |= -28758703;
                var2 &= 31445301;
                var2 ^= 22007495;
                var2 ^= 895447797;
                int var56 = var2 + 1;
                var56 = var2 * var56;
                int var5 = var2 + 2;
                var56 *= var5;
                var5 = var2 + 3;
                var56 *= var5;
                var56 &= 7;
                label67:
                if (var56 == 0) {
                    if (var1 != null) {
                        var2 = switch (var2) {
                            default -> var2 ^ -1321614345;
                            case 877608227 -> {
                                var2 ^= 1471212037;
                                yield var2 ^ 171648888;
                            }
                            case 1523895044 -> var2 ^ -1318545873;
                        };
                        Integer var61 = var2;
                        if (var61 == null) {
                            break label67;
                        }

                        Enum var62 = this.Y;
                        var5 = var3 + 1;
                        var5 = var3 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            var2 ^= -1643539281;
                            var2 += 1925758011;
                            var2 ^= -2112767008;
                            break label78;
                        }

                        var2 |= -1699200303;
                        var2 += 2068361624;
                        var2 *= -1177405523;
                        var2 |= 246532227;
                        var2 ^= 1487145078;
                        var5 = var2 + 1;
                        var5 = var2 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            break label67;
                        }

                        if (var1 != var62) {
                            var2 *= -838655731;
                            var2 += -2102507682;
                            var2 &= 2011983728;
                            var2 += -1847655758;
                            var2 ^= 1833653383;
                            long var63 = var2;
                            long var6 = var63 + 1L;
                            var6 = var63 * var6;
                            long var8 = var63 + 2L;
                            var6 *= var8;
                            long var64 = var63 + 3L;
                            var6 *= var64;
                            long var65 = var6 & 7L;
                            long var81;
                            int var66 = (var81 = var65 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                            if (var66 == 0) {
                                this.Y = var1;
                                var66 = var3 + 1;
                                var66 = var3 * var66;
                                var3 = var66 & 1;
                                if (var3 != 0) {
                                    var2 |= -1323289371;
                                    var2 |= -843914116;
                                    var2 -= 1712184267;
                                    var2 -= -1055476703;
                                    var2 ^= 806485981;
                                    break label78;
                                }

                                var2 |= -1679978518;
                                var2 ^= -990702124;
                                var3 = var2 + 1;
                                var3 = var2 * var3;
                                var3 &= 1;
                                if (var3 == 0) {
                                    this.lU();
                                    return;
                                }
                            }
                            break label67;
                        }

                        var2 ^= 1149874893;
                        var2 ^= 2102762819;
                    } else {
                        var2 -= 1570305699;
                        var2 *= -1490095559;
                        var2 ^= 1458661523;
                    }

                    long var52 = var2;
                    long var76 = var52 + 1L;
                    long var77 = var52 * var76;
                    long var53 = var77 & 1L;
                    long var82;
                    var3 = (var82 = var53 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        return;
                    }
                }

                IllegalStateException var55 = new IllegalStateException();
                throw var55;
            }
        }

        UnsupportedOperationException var47 = new UnsupportedOperationException();
        throw var47;
    }

    public Enum yG() {
        int var1 = q;
        var1 ^= -1025393641;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var27;
        var2 = (var27 = var21 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 <<= 30;
            var1 ^= 464760425;
            return this.Zv;
        } else {
            long var12 = switch (var1) {
                case -1887557437 -> {
                    var1 &= 1122074619;
                    var1 >>>= 12;
                    yield var1 ^ 1925075711;
                }
                case -1627836729 -> var1 ^ 445163841;
                default -> var1 ^ -612525896;
            };
            long var3 = var12 + 1L;
            var3 = var12 * var3;
            long var13 = var3 & 1L;
            long var28;
            var1 = (var28 = var13 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var16 = new IllegalArgumentException();
                throw var16;
            } else {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            }
        }
    }

    @Override
    public Object yW() {
        int var1 = q;
        var1 ^= -31931733;
        int var2 = System.identityHashCode(this);
        Enum var3 = this.Y;
        Integer var14 = var2;
        if (var14 != null) {
            var1 >>>= 9;
            var1 *= -2105000145;
            var1 ^= -1482366303;
            return var3.name();
        } else {
            var1 *= 75906999;
            var1 *= 1457166541;
            var1 ^= -477002709;
            int var15 = var1 + 1;
            var15 = var1 * var15;
            var1 = var15 & 1;
            if (var1 == 0) {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            } else {
                IllegalArgumentException var9 = new IllegalArgumentException();
                throw var9;
            }
        }
    }

    @Override
    public boolean YT(Object var1) {
        label106: {
            int var2 = q;
            var2 ^= -1892589191;
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            if (var4 != null) {
                var2 -= -895586968;
                var2 += -345364122;
                var2 ^= 1133325992;
                int var75 = var2 + 1;
                var75 = var2 * var75;
                int var5 = var2 + 2;
                var75 *= var5;
                var5 = var2 + 3;
                var75 *= var5;
                var75 &= 7;
                if (var75 != 0) {
                    break label106;
                }

                boolean var80 = var1 instanceof String;
                if (!var80) {
                    var2 *= 1493218365;
                    var2 ^= 428716350;
                    var3 = var2 + 1;
                    var3 = var2 * var3;
                    var3 &= 1;
                    if (var3 == 0) {
                        return false;
                    }
                    break label106;
                }

                var2 |= -874069410;
                var2 &= 1866539560;
                var2 ^= -1854585133;
                String var81 = (String)var1;
                var5 = var3 + 1;
                var5 = var3 * var5;
                int var6 = var3 + 2;
                var5 *= var6;
                var6 = var3 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    var2 *= -2078052873;
                    var2 ^= 337310389;
                    Integer var89 = var2;
                    if (var89 == null) {
                        break label106;
                    }

                    String var82 = var81;
                    var2 >>= 25;
                    var2 ^= -1421250578;
                    Enum[] var90 = this.w;
                    Enum[] var91 = var90;
                    var6 = var90.length;
                    var6 = var6;
                    Integer var7 = var3;
                    if (var7 == null) {
                        var2 += 728270787;
                        var2 ^= 863201657;
                    } else {
                        var2 &= -775251672;
                        var2 ^= 1183562803;
                        byte var95 = 0;
                        int var96 = var95;
                        var2 &= 1063686483;
                        var2 += -1562747012;
                        var2 <<= 23;
                        var2 ^= 1871558108;

                        while (true) {
                            int var8 = var2 + 1;
                            var8 = var2 * var8;
                            var8 &= 1;
                            if (var8 != 0) {
                                break label106;
                            }

                            if (var96 >= var6) {
                                var2 <<= 24;
                                var2 ^= 684748126;
                                return false;
                            }

                            var2 *= -607348401;
                            var2 ^= 869268768;
                            Enum var99 = var91[var96];
                            int var9 = var3 + 1;
                            var9 = var3 * var9;
                            int var10 = var3 + 2;
                            var9 *= var10;
                            var10 = var3 + 3;
                            var9 *= var10;
                            var9 &= 7;
                            if (var9 != 0) {
                                var2 <<= 6;
                                var2 ^= 242585511;
                                break;
                            }

                            var2 ^= -1535585793;
                            var2 -= -846040797;
                            var2 ^= 633329614;
                            long var108 = var2;
                            long var11 = var108 + 1L;
                            var11 = var108 * var11;
                            long var109 = var11 & 1L;
                            long var130;
                            var9 = (var130 = var109 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                            if (var9 != 0) {
                                break label106;
                            }

                            String var111 = var99.name();
                            int var112 = (var111.equalsIgnoreCase(var82)) ? 1 : 0;
                            if (var112 != 0) {
                                var2 &= 1415345139;
                                var2 *= 66735315;
                                var2 >>= 9;
                                var2 -= 173314764;
                                var2 ^= 1858544540;
                                long var116 = var2;
                                var11 = var116 + 1L;
                                var11 = var116 * var11;
                                long var13 = var116 + 2L;
                                var11 *= var13;
                                long var117 = var116 + 3L;
                                var11 *= var117;
                                long var118 = var11 & 7L;
                                long var133;
                                var112 = (var133 = var118 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                                if (var112 == 0) {
                                    this.UY(var99);
                                    return true;
                                }
                                break label106;
                            }

                            var2 |= 1031138382;
                            var2 ^= -325690056;
                            var2 ^= 2018928952;
                            long var100 = var2;
                            long var121 = var100 + 1L;
                            long var122 = var100 * var121;
                            long var101 = var122 & 1L;
                            long var131;
                            var8 = (var131 = var101 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                break label106;
                            }

                            var8 = var96 + 1;
                            long var113 = var3;
                            var11 = var113 + 1L;
                            var11 = var113 * var11;
                            long var114 = var11 & 1L;
                            long var132;
                            var112 = (var132 = var114 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                            if (var112 != 0) {
                                var2 <<= 20;
                                var2 -= 108573412;
                                var2 ^= -1483854831;
                                var2 <<= 31;
                                var2 ^= 862748327;
                                break;
                            }
                            var2 = switch (var2) {
                                case -870251079 -> var2 ^ 1251548846;
                                default -> var2 ^ 1668940034;
                                case 1773521630 -> {
                                    var2 -= -920091870;
                                    var2 |= -927229293;
                                    var2 *= -732353717;
                                    var2 -= 920859605;
                                    yield var2 ^ -297383915;
                                }
                            };
                            var96 = var8;
                            var2 |= 2036931109;
                            var2 &= 1028650137;
                            var2 ^= -1790672435;
                        }
                    }
                } else {
                    var2 |= -1339726838;
                    var2 ^= 1230576252;
                }
            } else {
                var2 += -1327641798;
                var2 *= -1835928589;
                var2 -= -1476650848;
                var2 ^= 301807874;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                AssertionError var66 = new AssertionError();
                throw var66;
            }
        }

        RuntimeException var69 = new RuntimeException();
        throw var69;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 733314846;
        int var2 = Setting.nu;
        int var4 = of_2.ro(var3, var1, var2);
        q = var4;
    }

    @Override
    public Object a() {
        return this.yG();
    }

    @Override
    public void t(Object var1) {
        this.UY((Enum)var1);
    }

    @Override
    public Object cQ() {
        return this.A();
    }
}
