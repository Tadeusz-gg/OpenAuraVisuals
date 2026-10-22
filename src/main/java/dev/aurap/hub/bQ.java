package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class bQ implements Lv {
    private static final int T = 8;
    private static final float s = 1.0E-6F;
    private final float GK;
    private final float AH;
    private final float e;
    private final float Do;
    private final float R;
    private final float ct;
    public static final int OE;

    public bQ(float var1, float var2, float var3, float var4) {
        float var28;
        int var5 = (var28 = var1 - 0.0F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
        if (var5 >= 0) {
            float var29;
            var5 = (var29 = var1 - 1.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
            if (var5 <= 0) {
                float var30;
                var5 = (var30 = var3 - 0.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                if (var5 >= 0) {
                    float var31;
                    var5 = (var31 = var3 - 1.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                    if (var5 <= 0) {
                        float var11 = 3.0F * var1;
                        this.e = var11;
                        float var12 = var3 - var1;
                        float var13 = 3.0F * var12;
                        float var6 = this.e;
                        float var14 = var13 - var6;
                        this.AH = var14;
                        float var15 = this.e;
                        float var16 = 1.0F - var15;
                        var6 = this.AH;
                        float var17 = var16 - var6;
                        this.GK = var17;
                        float var18 = 3.0F * var2;
                        this.ct = var18;
                        float var19 = var4 - var2;
                        float var20 = 3.0F * var19;
                        var6 = this.ct;
                        float var21 = var20 - var6;
                        this.R = var21;
                        float var22 = this.ct;
                        float var23 = 1.0F - var22;
                        var6 = this.R;
                        float var24 = var23 - var6;
                        this.Do = var24;
                        return;
                    }
                }
            }
        }

        IllegalArgumentException var10 = new IllegalArgumentException("Bezier x control points must be within [0, 1]");
        throw var10;
    }

    @Override
    public float l(float var1) {
        int var2 = OE;
        var2 ^= -71041233;
        int var3 = System.identityHashCode(this);
        float var86;
        int var4 = (var86 = var1 - 0.0F) == 0.0F ? 0 : (var86 < 0.0F ? -1 : 1);
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var87;
        int var73 = (var87 = var5 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
        if (var73 == 0) {
            var2 -= 127640319;
            var2 += -480003747;
            var2 |= 1066865346;
            var2 ^= 1343182560;
            if (var4 <= 0) {
                var2 -= -1809610487;
                var2 <<= 11;
                var2 *= 1834859699;
                var2 &= -764668749;
                var2 ^= -1238926887;
                return 0.0F;
            }

            var2 |= -845981281;
            var2 &= 1886666947;
            var2 -= 1687819417;
            var2 ^= -1790002840;
            float var88;
            var4 = (var88 = var1 - 1.0F) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
            var5 = var3;
            var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var89;
            int var76 = (var89 = var5 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
            label50:
            if (var76 == 0) {
                var2 |= -1763126588;
                var2 |= -2139786286;
                var2 &= 648621473;
                var2 ^= 801369026;
                var2 ^= 793886989;
                int var77 = var2 + 1;
                int var78 = var2 * var77;
                int var79 = var78 & 1;
                if (var79 == 0) {
                    if (var4 >= 0) {
                        var2 *= -1445037213;
                        var2 += -1136968073;
                        var2 *= 61007139;
                        var2 -= -1255734889;
                        var2 ^= 242748531;
                        long var63 = var2;
                        long var6 = var63 + 1L;
                        var6 = var63 * var6;
                        long var64 = var6 & 1L;
                        long var90;
                        var4 = (var90 = var64 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            return 1.0F;
                        }
                    } else {
                        var2 &= -512052771;
                        var2 |= -1337638469;
                        var2 ^= -212997181;
                        Integer var66 = var2;
                        if (var66 != null) {
                            int var67 = var2 ^ -1952285765;
                            var67 -= -212307476;
                            var67 |= -1087553516;
                            var67 ^= 1316985001;
                            float var71 = this.vq(var1, var67);
                            Integer var51 = var3;
                            if (var51 == null) {
                                switch (var2) {
                                    case -1369846679:
                                        var2 ^= -624416114;
                                        break label50;
                                    case -1339112460:
                                    default:
                                        var2 ^= -242963308;
                                        break label50;
                                    case 1127393852:
                                        var2 &= 780876578;
                                        var2 += -504629623;
                                        var2 ^= 1391709629;
                                        break label50;
                                }
                            }

                            var2 >>= 23;
                            var2 ^= 723353866;
                            int var52 = var2 + 1;
                            var52 = var2 * var52;
                            int var80 = var2 + 2;
                            var52 *= var80;
                            int var81 = var2 + 3;
                            var52 *= var81;
                            var52 &= 7;
                            if (var52 == 0) {
                                var52 = var2 ^ 490223221;
                                var52 ^= -1200622497;
                                var52 ^= -1077627569;
                                var52 ^= -791889776;
                                return this.du(var71, var52);
                            }
                        }
                    }
                }

                IllegalStateException var57 = new IllegalStateException();
                throw var57;
            } else {
                var2 &= -731368195;
                var2 <<= 18;
                var2 ^= -216142572;
            }
        } else {
            var2 -= -1490823236;
            var2 &= -1248768331;
            var2 *= 830574231;
            var2 ^= 1440368227;
        }

        IllegalArgumentException var45 = new IllegalArgumentException();
        throw var45;
    }

    private float tr(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        float var5 = this.GK;
        var5 *= var1;
        float var6 = this.AH;
        var5 += var6;
        int var33 = var4 + 1;
        int var34 = var4 * var33;
        var4 = var34 & 1;
        if (var4 != 0) {
            long var35 = switch (var2) {
                default -> var2 ^ 701895000;
                case -183767222 -> {
                    int var12 = var2 * 1435496841;
                    var12 >>>= 1;
                    var12 -= 1896007559;
                    var12 -= 687300989;
                    yield var12 ^ 971169314;
                }
                case 1679171028 -> var2 ^ 1706231489;
            };
            long var8 = var35 + 1L;
            var8 = var35 * var8;
            long var10 = var35 + 2L;
            var8 *= var10;
            long var36 = var35 + 3L;
            var8 *= var36;
            long var37 = var8 & 7L;
            long var43;
            var4 = (var43 = var37 - 0L) == 0L ? 0 : (var43 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalArgumentException var29 = new IllegalArgumentException();
                throw var29;
            }
        } else {
            long var21 = switch (var2) {
                case -881991478 -> var2 ^ 305527521;
                case -183767222 -> {
                    int var17 = var2 ^ -569015820;
                    var17 -= 135134699;
                    var17 |= -1363296093;
                    var17 *= 91792177;
                    yield var17 ^ 83230714;
                }
                default -> var2 ^ -1168296629;
            };
            long var38 = var21 + 1L;
            long var39 = var21 * var38;
            var21 = var39 & 1L;
            long var44;
            int var23 = (var44 = var21 - 0L) == 0L ? 0 : (var44 < 0L ? -1 : 1);
            if (var23 == 0) {
                float var25 = var5 * var1;
                float var30 = this.e;
                float var26 = var25 + var30;
                return var26 * var1;
            }
        }

        IllegalStateException var24 = new IllegalStateException();
        throw var24;
    }

    private float du(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var4 = var5 & 1;
        if (var4 != 0) {
            int var3 = var2 | -37204098;
            var3 ^= -392609672;
            var3 |= 1711721598;
            var3 ^= 1896968619;
            Integer var22 = var3;
            if (var22 != null) {
                AssertionError var23 = new AssertionError();
                throw var23;
            }
        } else {
            int var9 = var2 << 24;
            var9 *= -1134771451;
            var9 >>= 17;
            var9 *= 351246653;
            var9 ^= -1710180676;
            var4 = var9 + 1;
            var4 = var9 * var4;
            var9 = var4 & 1;
            if (var9 == 0) {
                float var16 = this.Do;
                float var17 = var16 * var1;
                float var26 = this.R;
                float var18 = var17 + var26;
                float var19 = var18 * var1;
                float var27 = this.ct;
                float var20 = var19 + var27;
                return var20 * var1;
            }
        }

        UnsupportedOperationException var15 = new UnsupportedOperationException();
        throw var15;
    }

    private float bF(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        float var5 = this.GK;
        var5 = 3.0F * var5;
        var5 *= var1;
        float var6 = this.AH;
        Integer var19 = var4;
        if (var19 == null) {
            int var3 = var2 & 1167245287;
            var3 ^= 900843188;
            int var20 = var3 + 1;
            var20 = var3 * var20;
            int var7 = var3 + 2;
            var20 *= var7;
            var7 = var3 + 3;
            var20 *= var7;
            var20 &= 7;
            if (var20 == 0) {
                IllegalArgumentException var25 = new IllegalArgumentException();
                throw var25;
            }
        } else {
            int var9 = switch (var2) {
                default -> var2 ^ -1050009518;
                case -997503154 -> {
                    int var10 = var2 * 1952325485;
                    var10 <<= 31;
                    var10 |= 620493787;
                    yield var10 ^ -1062192757;
                }
                case 954975005 -> var2 ^ -668057761;
            };
            int var26 = var9 + 1;
            var26 = var9 * var26;
            int var34 = var9 + 2;
            var26 *= var34;
            var9 += 3;
            var26 *= var9;
            var9 = var26 & 7;
            if (var9 == 0) {
                float var16 = 2.0F * var6;
                float var17 = var5 + var16;
                float var18 = var17 * var1;
                float var30 = this.e;
                return var18 + var30;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    private float vq(float var1, int var2) {
        label288: {
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var326;
            int var165 = (var326 = var5 - 0L) == 0L ? 0 : (var326 < 0L ? -1 : 1);
            int var59;
            if (var165 != 0) {
                var59 = var2 & 177517964;
                var59 += -1977978871;
                var59 &= -1108127470;
                var59 &= 671823786;
                var59 ^= -1398352719;
            } else {
                var59 = var2 << 25;
                var59 ^= -547068998;
                int var166 = var59 + 1;
                int var167 = var59 * var166;
                int var168 = var167 & 1;
                if (var168 != 0) {
                    break label288;
                }

                int var6 = 0;
                float var169 = var1;
                var6 = var6;
                var59 &= 578519676;
                var59 -= 614447633;
                var59 ^= -2125223703;

                label272:
                while (true) {
                    var7 = var59;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var327;
                    int var184 = (var327 = var7 - 0L) == 0L ? 0 : (var327 < 0L ? -1 : 1);
                    if (var184 != 0) {
                        break label288;
                    }

                    if (var6 < 8) {
                        var59 += -338500900;
                        var59 ^= -934940082;
                        var59 >>>= 21;
                        var59 += 1358862790;
                        var59 ^= 1358544307;
                        int var185 = var59 + 1;
                        int var186 = var59 * var185;
                        int var187 = var186 & 1;
                        if (var187 != 0) {
                            break label288;
                        }

                        int var188 = var59 >>> 10;
                        int var189 = var188 - -1482823460;
                        int var190 = var189 ^ -1385564250;
                        float var191 = this.tr(var169, var190);
                        Integer var8 = var4;
                        if (var8 == null) {
                            var59 *= -1345074085;
                            var59 ^= -1815949427;
                            break;
                        }

                        var59 ^= -1066421860;
                        var59 >>= 22;
                        var59 -= 2047921448;
                        var59 |= -55642384;
                        var59 ^= -2135959917;
                        long var196 = var59;
                        long var10 = var196 + 1L;
                        var10 = var196 * var10;
                        long var197 = var10 & 1L;
                        long var328;
                        int var198 = (var328 = var197 - 0L) == 0L ? 0 : (var328 < 0L ? -1 : 1);
                        if (var198 != 0) {
                            break label288;
                        }

                        float var192 = var191 - var1;
                        float var199 = Math.abs(var192);
                        float var329;
                        var198 = (var329 = var199 - 1.0E-6F) == 0.0F ? 0 : (var329 < 0.0F ? -1 : 1);
                        if (var198 < 0) {
                            var59 <<= 18;
                            var59 |= 999463118;
                            var59 |= 272225759;
                            var59 &= 537347930;
                            var59 ^= 1206306469;
                            var198 = var59 + 1;
                            var198 = var59 * var198;
                            int var227 = var59 + 2;
                            var198 *= var227;
                            int var228 = var59 + 3;
                            var198 *= var228;
                            var198 &= 7;
                            if (var198 == 0) {
                                return var169;
                            }
                            break label288;
                        }

                        var59 += 721856516;
                        var59 += -1147796955;
                        var59 -= 218258673;
                        var59 *= 29423807;
                        var59 ^= -758391739;
                        var198 = var59 ^ 1413512942;
                        var198 *= -607400261;
                        var198 *= -856724657;
                        var198 ^= -2033663497;
                        float var205 = this.bF(var169, var198);
                        float var216 = Math.abs(var205);
                        float var330;
                        int var217 = (var330 = var216 - 1.0E-6F) == 0.0F ? 0 : (var330 < 0.0F ? -1 : 1);
                        Integer var259 = var4;
                        if (var259 == null) {
                            var59 -= -1383750604;
                            var59 ^= -2024945706;
                            break;
                        }
                        var59 = switch (var59) {
                            case -781277541 -> {
                                var59 += -74670898;
                                yield var59 ^ -1333016765;
                            }
                            case -187007471 -> var59 ^ -618855897;
                            default -> var59 ^ 1888563376;
                        };
                        int var260 = var59 + 1;
                        int var261 = var59 * var260;
                        int var262 = var261 & 1;
                        if (var262 != 0) {
                            break label288;
                        }

                        if (var217 >= 0) {
                            var59 -= 1354525503;
                            var59 *= 1948553125;
                            var59 |= -1197459025;
                            var59 &= -505506436;
                            var59 ^= 1510925324;
                            var9 = var59;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var331;
                            int var220 = (var331 = var9 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
                            if (var220 != 0) {
                                break label288;
                            }

                            float var193 = var192 / var205;
                            float var194 = var169 - var193;
                            int var221 = var4 + 1;
                            int var222 = var4 * var221;
                            int var263 = var4 + 2;
                            int var223 = var222 * var263;
                            int var264 = var4 + 3;
                            int var224 = var223 * var264;
                            int var225 = var224 & 7;
                            if (var225 != 0) {
                                switch (var59) {
                                    case -2061902518:
                                        var59 ^= -1422229978;
                                        break label272;
                                    case -1165692560:
                                        var59 += 882795952;
                                        var59 += 1589227727;
                                        var59 *= 1770763585;
                                        var59 ^= -975488226;
                                        break label272;
                                    case -624684866:
                                    default:
                                        var59 ^= 1032324144;
                                        break label272;
                                }
                            }

                            var59 *= -1427436647;
                            var59 |= 1531628889;
                            var59 -= -15276025;
                            var59 ^= 589464766;
                            int var226 = var6 + 1;
                            var169 = var194;
                            var6 = var226;
                            switch (var59) {
                                case -794874684:
                                default:
                                    var59 ^= -522428944;
                                    continue;
                                case 140484206:
                                    var59 ^= -87326850;
                                    continue;
                                case 1609921356:
                                    var59 |= -1830333830;
                                    var59 >>= 30;
                                    var59 |= -179426575;
                                    var59 *= 707110223;
                                    var59 ^= -1454785921;
                                    continue;
                            }
                        }

                        var59 <<= 2;
                        var59 *= 745204023;
                        var59 *= 692280235;
                        var59 *= -403915975;
                        var59 ^= 1078009255;
                        var59 -= 1181383374;
                        var59 ^= 1485695049;
                        var59 <<= 14;
                        var59 ^= 865717242;
                    } else {
                        var59 += -876526135;
                        var59 -= -38620624;
                        var59 ^= 1547812765;
                    }

                    var5 = var59;
                    var9 = var5 + 1L;
                    var9 = var5 * var9;
                    long var282 = var5 + 2L;
                    var9 *= var282;
                    var5 += 3L;
                    var9 *= var5;
                    var5 = var9 & 7L;
                    long var332;
                    int var173 = (var332 = var5 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                    if (var173 != 0) {
                        break label288;
                    }

                    float var174 = 0.0F;
                    float var179 = 1.0F;
                    float var195 = var1;
                    Integer var233 = var4;
                    if (var233 != null) {
                        var59 ^= -2042691302;
                        var59 >>= 8;
                        var59 *= 212950107;
                        var59 ^= 1984352646;
                        float var180 = var179;
                        float var175 = var174;
                        var59 |= -1349413797;
                        var59 -= 723207915;
                        var59 ^= -290187479;

                        while (true) {
                            Integer var234 = var59;
                            if (var234 == null) {
                                break label288;
                            }

                            float var333;
                            int var235 = (var333 = var175 - var180) == 0.0F ? 0 : (var333 < 0.0F ? -1 : 1);
                            Integer var265 = var4;
                            if (var265 == null) {
                                var59 |= -711665160;
                                var59 ^= 1530403912;
                                break label272;
                            }
                            var59 = switch (var59) {
                                case -357707236 -> var59 ^ -293253896;
                                default -> var59 ^ 1988551612;
                                case 973641817 -> {
                                    var59 |= -309856527;
                                    var59 -= -793965534;
                                    yield var59 ^ -1574765990;
                                }
                            };
                            long var266 = var59;
                            long var12 = var266 + 1L;
                            var12 = var266 * var12;
                            long var14 = var266 + 2L;
                            var12 *= var14;
                            long var267 = var266 + 3L;
                            var12 *= var267;
                            long var268 = var12 & 7L;
                            long var334;
                            int var269 = (var334 = var268 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                            if (var269 != 0) {
                                break label288;
                            }

                            if (var235 >= 0) {
                                var59 *= -153796921;
                                var59 ^= 2075909714;
                                var59 *= 1398006011;
                                var59 -= 260101761;
                                var59 ^= -795384488;
                                return var195;
                            }
                            var59 = switch (var59) {
                                case -1933571955 -> {
                                    var59 |= -2015387236;
                                    var59 ^= 125338362;
                                    var59 += 1313136058;
                                    yield var59 ^ 337064282;
                                }
                                case -213919356 -> var59 ^ 988371520;
                                default -> var59 ^ -464775176;
                            };
                            int var236 = var59 * 1007139629;
                            int var237 = var236 >>> 25;
                            int var238 = var237 & -677060933;
                            int var239 = var238 ^ -183767207;
                            float var240 = this.tr(var195, var239);
                            Integer var241 = var4;
                            if (var241 == null) {
                                var59 &= -966362723;
                                var59 += -212316415;
                                var59 ^= 287195819;
                                break label272;
                            }

                            var59 <<= 14;
                            var59 *= -1184077411;
                            var59 += 1335859297;
                            var59 ^= -1744080418;
                            int var242 = var59 + 1;
                            int var243 = var59 * var242;
                            int var244 = var243 & 1;
                            if (var244 != 0) {
                                break label288;
                            }

                            float var245 = var240 - var1;
                            float var246 = Math.abs(var245);
                            float var335;
                            int var247 = (var335 = var246 - 1.0E-6F) == 0.0F ? 0 : (var335 < 0.0F ? -1 : 1);
                            if (var247 < 0) {
                                var59 |= 385629211;
                                var59 |= -823136493;
                                var59 *= -212420231;
                                var59 ^= -665420094;
                                int var253 = var59 + 1;
                                int var254 = var59 * var253;
                                var269 = var59 + 2;
                                int var255 = var254 * var269;
                                var269 = var59 + 3;
                                int var256 = var255 * var269;
                                int var257 = var256 & 7;
                                if (var257 == 0) {
                                    return var195;
                                }
                                break label288;
                            }

                            var59 *= -2081821143;
                            var59 += -983870914;
                            var59 |= -1383170721;
                            var59 ^= 514407540;
                            Integer var248 = var59;
                            if (var248 == null) {
                                break label288;
                            }

                            float var336;
                            int var212 = (var336 = var1 - var240) == 0.0F ? 0 : (var336 < 0.0F ? -1 : 1);
                            Integer var249 = var4;
                            if (var249 == null) {
                                var59 += -415967509;
                                var59 ^= 1055416103;
                                break label272;
                            }

                            var59 ^= 452959472;
                            var59 &= 920886076;
                            var59 &= -1234895046;
                            var59 ^= 1682229784;
                            Integer var250 = var59;
                            if (var250 == null) {
                                break label288;
                            }

                            float var214;
                            float var252;
                            if (var212 > 0) {
                                var59 *= 1627218117;
                                var59 ^= 2001026063;
                                Integer var213 = var59;
                                if (var213 == null) {
                                    break label288;
                                }

                                Integer var251 = var4;
                                if (var251 == null) {
                                    var59 -= 1593015808;
                                    var59 ^= 552350990;
                                    var59 ^= -642344016;
                                    break label272;
                                }
                                var59 = switch (var59) {
                                    case -1124996849 -> {
                                        var59 += 677540826;
                                        yield var59 ^ 1946627792;
                                    }
                                    default -> var59 ^ -169277770;
                                    case 1622782918 -> var59 ^ 723157892;
                                };
                                var252 = var180;
                                var214 = var195;
                                var59 |= -1142729154;
                                var59 ^= -1288669628;
                            } else {
                                var59 = switch (var59) {
                                    case 756288574 -> var59 ^ 2054908513;
                                    case 1143263488 -> {
                                        var59 >>= 28;
                                        var59 >>= 17;
                                        yield var59 ^ -1083343981;
                                    }
                                    default -> var59 ^ 489332225;
                                };
                                var269 = var59 + 1;
                                var269 = var59 * var269;
                                var269 &= 1;
                                if (var269 != 0) {
                                    break label288;
                                }

                                var282 = var4;
                                long var13 = var282 + 1L;
                                var13 = var282 * var13;
                                var282 = var13 & 1L;
                                long var337;
                                int var285 = (var337 = var282 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                                if (var285 != 0) {
                                    var59 *= 1274517371;
                                    var59 |= 1260483371;
                                    var59 *= 1661973493;
                                    var59 ^= 1117245974;
                                    break label272;
                                }

                                var59 *= -297204921;
                                var59 ^= 268590518;
                                var252 = var195;
                                var214 = var175;
                                var59 *= -323059767;
                                var59 ^= 1517147664;
                                var59 ^= 1371976736;
                            }

                            long var273 = var59;
                            var12 = var273 + 1L;
                            var12 = var273 * var12;
                            var14 = var273 + 2L;
                            var12 *= var14;
                            long var274 = var273 + 3L;
                            var12 *= var274;
                            long var275 = var12 & 7L;
                            long var338;
                            var269 = (var338 = var275 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                            if (var269 != 0) {
                                break label288;
                            }

                            float var277 = var214 + var252;
                            float var278 = var277 * 0.5F;
                            float var339;
                            int var286 = (var339 = var278 - var195) == 0.0F ? 0 : (var339 < 0.0F ? -1 : 1);
                            int var310 = var4 + 1;
                            int var311 = var4 * var310;
                            int var312 = var311 & 1;
                            if (var312 != 0) {
                                switch (var59) {
                                    case -1903794105:
                                    default:
                                        var59 ^= -1434776920;
                                        break label272;
                                    case 146997371:
                                        var59 &= 1545884991;
                                        var59 -= 1265967009;
                                        var59 -= 426614216;
                                        var59 ^= 129599331;
                                        break label272;
                                    case 1831488161:
                                        var59 ^= 1328146809;
                                        break label272;
                                }
                            }

                            var59 += 1167173783;
                            var59 ^= 978819054;
                            int var313 = var59 + 1;
                            int var314 = var59 * var313;
                            int var315 = var314 & 1;
                            if (var315 != 0) {
                                break label288;
                            }

                            if (var286 == 0) {
                                var59 = switch (var59) {
                                    case -657985384 -> var59 ^ 875296161;
                                    default -> var59 ^ 1919469507;
                                    case 1946369788 -> {
                                        var59 >>>= 12;
                                        var59 ^= 120434848;
                                        yield var59 ^ -445606080;
                                    }
                                };
                                int var298 = var59 + 1;
                                int var299 = var59 * var298;
                                int var318 = var59 + 2;
                                int var300 = var299 * var318;
                                int var319 = var59 + 3;
                                int var301 = var300 * var319;
                                int var302 = var301 & 7;
                                if (var302 != 0) {
                                    break label288;
                                }

                                var59 -= -705986171;
                                var59 ^= 432867741;
                                var59 ^= -633213159;
                                return var195;
                            }
                            var59 = switch (var59) {
                                default -> var59 ^ 1229260445;
                                case 1113517854 -> var59 ^ 1612097474;
                                case 1946369788 -> {
                                    var59 -= -2009945221;
                                    var59 >>>= 24;
                                    yield var59 ^ 536067363;
                                }
                            };
                            int var287 = var59 + 1;
                            int var288 = var59 * var287;
                            int var316 = var59 + 2;
                            int var289 = var288 * var316;
                            int var317 = var59 + 3;
                            int var290 = var289 * var317;
                            int var291 = var290 & 7;
                            if (var291 != 0) {
                                break label288;
                            }

                            var282 = var4;
                            long var321 = var282 + 1L;
                            var321 = var282 * var321;
                            var282 = var321 & 1L;
                            long var340;
                            int var294 = (var340 = var282 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                            if (var294 != 0) {
                                var59 |= -433792247;
                                var59 <<= 18;
                                var59 ^= 1535165873;
                                break label272;
                            }

                            var59 <<= 15;
                            var59 -= -1917508031;
                            var59 -= 100650561;
                            var59 += 245824427;
                            var59 ^= -595780171;
                            var282 = var59;
                            var321 = var282 + 1L;
                            var321 = var282 * var321;
                            var282 = var321 & 1L;
                            long var341;
                            int var297 = (var341 = var282 - 0L) == 0L ? 0 : (var341 < 0L ? -1 : 1);
                            if (var297 != 0) {
                                break label288;
                            }

                            var195 = var278;
                            var180 = var252;
                            var175 = var214;
                            var59 &= 702962677;
                            var59 -= -1318190433;
                            var59 >>= 31;
                            var59 ^= 973641817;
                        }
                    }

                    var59 *= -836430881;
                    var59 ^= -2122323000;
                    var59 ^= 1517228735;
                    break;
                }
            }

            long var159 = var59;
            var5 = var159 + 1L;
            var5 = var159 * var5;
            long var160 = var5 & 1L;
            long var342;
            var59 = (var342 = var160 - 0L) == 0L ? 0 : (var342 < 0L ? -1 : 1);
            if (var59 == 0) {
                AssertionError var163 = new AssertionError();
                throw var163;
            }
        }

        IllegalArgumentException var162 = new IllegalArgumentException();
        throw var162;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 56947502;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        OE = var4;
    }
}
