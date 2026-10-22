package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.LongSupplier;
import java.util.random.RandomGenerator;

public final class Fp {
    private final nb_2 s;
    private final gj T;
    private final RandomGenerator m;
    private final LongSupplier ZF;
    private final Map C;
    private final Map hE;
    private float iB;
    public static final int CW;

    public Fp(nb_2 var1, gj var2, RandomGenerator var3, LongSupplier var4) {
        LinkedHashMap var5 = new LinkedHashMap();
        this.C = var5;
        HashMap var6 = new HashMap();
        this.hE = var6;
        this.iB = 1.0F;
        this.s = var1;
        this.T = var2;
        this.m = var3;
        this.ZF = var4;
    }

    public void wb(Pd var1) {
        int var2 = CW;
        var2 ^= -136354773;
        int var3 = System.identityHashCode(this);
        Map var4 = this.C;
        String var5 = var1.id();
        Integer var26 = var3;
        int var6 = of_2.dS;
        var2 ^= var6;
        var2 ^= -1699540653;
        of_2.dS = -1699540653;
        var6 = of_2.Fy;
        var2 ^= var6;
        var2 ^= 1886316933;
        of_2.Fy = 1886316933;
        if (var26 != null) {
            var2 <<= 4;
            var2 <<= 9;
            var2 ^= -1374496574;
            long var35 = var2;
            long var8 = var35 + 1L;
            var8 = var35 * var8;
            long var10 = var35 + 2L;
            var8 *= var10;
            long var36 = var35 + 3L;
            var8 *= var36;
            long var37 = var8 & 7L;
            long var41;
            int var27 = (var41 = var37 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            if (var27 == 0) {
                Object var28 = var4.put(var5, var1);
                return;
            }
        } else {
            var2 &= 1525792651;
            var2 ^= -2109056316;
            int var29 = var2 + 1;
            var29 = var2 * var29;
            int var33 = var2 + 2;
            var29 *= var33;
            var2 += 3;
            var29 *= var2;
            var2 = var29 & 7;
            if (var2 == 0) {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            }
        }

        UnsupportedOperationException var24 = new UnsupportedOperationException();
        throw var24;
    }

    public Optional ap(String var1) {
        int var2 = CW;
        var2 ^= 1153312665;
        int var3 = System.identityHashCode(this);
        Integer var19 = var3;
        if (var19 == null) {
            var2 ^= 827372254;
            var2 *= 1303462065;
            var2 &= -643850054;
            var2 *= 2093560549;
            var2 ^= 2009804175;
            int var20 = var2 + 1;
            var20 = var2 * var20;
            int var4 = var2 + 2;
            var20 *= var4;
            var4 = var2 + 3;
            var20 *= var4;
            var20 &= 7;
            if (var20 == 0) {
                AssertionError var25 = new AssertionError();
                throw var25;
            }
        } else {
            var2 |= -673951363;
            var2 -= -1445858831;
            var2 ^= -32073269;
            int var26 = var2 + 1;
            var26 = var2 * var26;
            var2 = var26 & 1;
            if (var2 == 0) {
                Map var16 = this.C;
                Object var17 = var16.get(var1);
                Pd var18 = (Pd)var17;
                return Optional.ofNullable(var18);
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    public Collection bp() {
        int var1 = CW;
        var1 ^= 1589409984;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 += 340839209;
            var1 |= -2011299521;
            var1 += -76358602;
            var1 ^= 695020227;
            var1 ^= -1840684622;
            Map var15 = this.C;
            Collection var16 = var15.values();
            return Collections.unmodifiableCollection(var16);
        } else {
            var1 |= 1980469917;
            var1 &= 738209015;
            var1 ^= 397191791;
            RuntimeException var8 = new RuntimeException();
            throw var8;
        }
    }

    public void RL(float var1) {
        int var2 = CW;
        var2 ^= -153793025;
        int var3 = System.identityHashCode(this);
        float var4 = TP.t(var1, 0.0F, 2.0F);
        Integer var19 = var3;
        if (var19 != null) {
            switch (var2) {
                case -1717062450:
                default:
                    var2 ^= 1472949601;
                    break;
                case -1578949368:
                    var2 -= 751888642;
                    var2 &= -962533152;
                    var2 ^= -47133279;
                    break;
                case 347608794:
                    var2 ^= -352843339;
            }

            this.iB = var4;
        } else {
            var2 ^= -40306735;
            var2 >>= 20;
            var2 ^= -460346781;
            var2 ^= 103195360;
            var2 ^= -2062333072;
            int var20 = var2 + 1;
            var20 = var2 * var20;
            var2 = var20 & 1;
            if (var2 != 0) {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            } else {
                AssertionError var12 = new AssertionError();
                throw var12;
            }
        }
    }

    public float m() {
        int var1 = CW;
        var1 ^= -1977784555;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var38;
        var2 = (var38 = var22 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= -1307965322;
            var1 >>= 7;
            var1 |= 1731655587;
            var1 ^= -180292729;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            var6 = var24 + 2L;
            var4 *= var6;
            long var25 = var24 + 3L;
            var4 *= var25;
            long var26 = var4 & 7L;
            long var39;
            var2 = (var39 = var26 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.iB;
            }
        } else {
            var1 ^= 178840897;
            var1 &= -594932308;
            var1 &= 1005410613;
            var1 ^= 273920955;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        }

        AssertionError var18 = new AssertionError();
        throw var18;
    }

    public int Hk(String var1) {
        label91: {
            int var2 = CW;
            var2 ^= 1798163902;
            int var3 = System.identityHashCode(this);
            Map var4 = this.hE;
            St var67 = (St)var4.get(var1);
            var67 = var67;
            Integer var5 = var3;
            if (var5 == null) {
                var2 ^= -1779088366;
                var2 <<= 19;
                var2 &= 914608051;
                var2 ^= 1887851152;
            } else {
                var2 = switch (var2) {
                    case 808725806 -> var2 ^ -2070184002;
                    default -> var2 ^ -467123097;
                    case 1008444745 -> {
                        var2 += -259856814;
                        yield var2 ^ 1944532071;
                    }
                };
                Map var70 = this.C;
                // var5
                Pd var72 = (Pd)var70.get(var1);
                if (var67 == null) {
                    var2 |= -1769274791;
                    var2 -= -938566901;
                    var2 &= -668313594;
                    var2 ^= 499618395;
                    return 0;
                }

                var2 &= 1361718939;
                var2 *= 1799750847;
                var2 ^= -999343494;
                if (var72 == null) {
                    var2 += 214114498;
                    var2 ^= -838685811;
                    return 0;
                }
                var2 = switch (var2) {
                    default -> var2 ^ -129260868;
                    case -1221977838 -> {
                        var2 *= -529874273;
                        var2 *= 121845405;
                        yield var2 ^ 876450611;
                    }
                    case 525105546 -> var2 ^ -96850318;
                };
                int var6 = var2 + 1;
                var6 = var2 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    break label91;
                }

                LongSupplier var78 = this.ZF;
                long var79 = var78.getAsLong();
                long var8 = var67.MR;
                long var80 = var79 - var8;
                var8 = var3;
                long var10 = var8 + 1L;
                var10 = var8 * var10;
                var8 = var10 & 1L;
                long var101;
                int var90 = (var101 = var8 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                if (var90 != 0) {
                    var2 ^= 1417750018;
                    var2 ^= -1932064361;
                } else {
                    var2 ^= -1171589863;
                    var2 &= 389122682;
                    var2 ^= 1915219693;
                    int var91 = var2 + 1;
                    int var92 = var2 * var91;
                    int var9 = var2 + 2;
                    int var93 = var92 * var9;
                    var9 = var2 + 3;
                    int var94 = var93 * var9;
                    int var95 = var94 & 7;
                    if (var95 != 0) {
                        break label91;
                    }

                    int var73 = var72.comboWindowMs();
                    var8 = var73;
                    long var102;
                    var73 = (var102 = var80 - var8) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                    if (var73 > 0) {
                        var2 = switch (var2) {
                            default -> var2 ^ -1222801304;
                            case 1645700853 -> {
                                var2 -= -536629742;
                                var2 >>= 27;
                                var2 &= 1842742010;
                                var2 -= -556167863;
                                yield var2 ^ 541373864;
                            }
                            case 1651015038 -> var2 ^ -1301822830;
                        };
                        byte var75 = 0;
                        switch (var2) {
                            case -1363623921:
                                var2 ^= -1808845977;
                                var2 ^= 1431783609;
                                return var75;
                            case -1125341750:
                            default:
                                var2 ^= -1431777988;
                                return var75;
                            case 1052198789:
                                var2 ^= -1204098102;
                                return var75;
                        }
                    }

                    var2 >>= 6;
                    var2 ^= 831634110;
                    var6 = var2 + 1;
                    var6 = var2 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label91;
                    }

                    int var69 = var67.jI;
                    long var84 = var3;
                    var8 = var84 + 1L;
                    var8 = var84 * var8;
                    long var85 = var8 & 1L;
                    long var103;
                    var3 = (var103 = var85 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var2 >>>= 18;
                        var2 *= 47371345;
                        var2 <<= 2;
                        var2 ^= 1079336686;
                        var3 = var2 + 1;
                        var3 = var2 * var3;
                        var6 = var2 + 2;
                        var3 *= var6;
                        var6 = var2 + 3;
                        var3 *= var6;
                        var3 &= 7;
                        if (var3 != 0) {
                            break label91;
                        }

                        switch (var2) {
                            case -1949939338:
                                var2 *= 455987355;
                                var2 ^= 2008867235;
                                return var69;
                            case -1122208593:
                                var2 ^= 1708932671;
                                return var69;
                            case -612368867:
                            default:
                                var2 ^= 1487275217;
                                return var69;
                        }
                    }

                    var2 &= -650422695;
                    var2 >>= 8;
                    var2 <<= 4;
                    var2 >>>= 13;
                    var2 ^= 1913019036;
                }
            }

            Integer var59 = var2;
            if (var59 != null) {
                RuntimeException var60 = new RuntimeException();
                throw var60;
            }
        }

        AssertionError var66 = new AssertionError();
        throw var66;
    }

    public boolean t(String var1, HP var2) {
        int var300 = 0;
        label329: {
            int var3 = CW;
            var3 ^= 1296064821;
            int var4 = System.identityHashCode(this);
            Map var5 = this.C;
            Pd var195 = (Pd)var5.get(var1);
            var195 = var195;
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var431;
            int var202 = (var431 = var6 - 0L) == 0L ? 0 : (var431 < 0L ? -1 : 1);
            int var7 = of_2.dS;
            var3 ^= var7;
            var3 ^= -1699540653;
            var7 = of_2.Fy;
            var3 ^= var7;
            var3 ^= 1886316933;
            if (var202 != 0) {
                switch (var3) {
                    case -2019914505:
                        var3 ^= 343460893;
                        break;
                    case -1780673919:
                    default:
                        var3 ^= -1106946149;
                        break;
                    case 443943362:
                        var3 -= -1420734029;
                        var3 ^= -518810814;
                }
            } else {
                label340: {
                    var3 = switch (var3) {
                        case -288280681 -> var3 ^ -991610817;
                        case 443943362 -> {
                            var3 &= -1785858959;
                            var3 += -349480337;
                            var3 &= 1948037924;
                            yield var3 ^ 833479370;
                        }
                        default -> var3 ^ -892023250;
                    };
                    Integer var203 = var3;
                    if (var203 == null) {
                        break label329;
                    }

                    if (var195 != null) {
                        var3 <<= 8;
                        var3 ^= -2045018329;
                        var6 = var3;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var432;
                        int var206 = (var432 = var6 - 0L) == 0L ? 0 : (var432 < 0L ? -1 : 1);
                        if (var206 != 0) {
                            break label329;
                        }

                        float var207 = this.iB;
                        long var230 = var4;
                        long var9 = var230 + 1L;
                        var9 = var230 * var9;
                        long var231 = var9 & 1L;
                        long var433;
                        var7 = (var433 = var231 - 0L) == 0L ? 0 : (var433 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            switch (var3) {
                                case -887597833:
                                default:
                                    var3 ^= -1507437854;
                                    break label340;
                                case 411209496:
                                    var3 ^= -1497000780;
                                    break label340;
                                case 669749543:
                                    var3 ^= -1944763547;
                                    var3 += 614551571;
                                    var3 ^= 121326834;
                                    var3 |= -628978504;
                                    var3 ^= 1370277362;
                                    break label340;
                            }
                        }
                        var3 = switch (var3) {
                            case -29598705 -> var3 ^ -1661984406;
                            default -> var3 ^ 256794869;
                            case 669749543 -> {
                                var3 -= -1321699884;
                                yield var3 ^ -128954683;
                            }
                        };
                        float var434;
                        int var208 = (var434 = var207 - 0.0F) == 0.0F ? 0 : (var434 < 0.0F ? -1 : 1);
                        if (var208 > 0) {
                            var3 *= -878953521;
                            var3 |= -961778824;
                            var3 -= 1873004722;
                            var3 ^= 514879277;
                            int var209 = var3 + 1;
                            int var210 = var3 * var209;
                            int var211 = var210 & 1;
                            if (var211 != 0) {
                                break label329;
                            }

                            LongSupplier var212 = this.ZF;
                            var6 = var212.getAsLong();
                            Map var258 = this.hE;
                            Function var278 = var0 -> {
                                int var1x = CW;
                                var1x ^= 919569063;
                                int var2x = System.identityHashCode(var0);
                                Integer var18x = var2x;
                                if (var18x != null) {
                                    var1x &= -898630566;
                                    var1x |= 1373834348;
                                    var1x *= -424858371;
                                    var1x ^= 1394843457;
                                    long var19x = var1x;
                                    long var4x = var19x + 1L;
                                    var4x = var19x * var4x;
                                    long var20x = var4x & 1L;
                                    long var23x;
                                    int var21x = (var23x = var20x - 0L) == 0L ? 0 : (var23x < 0L ? -1 : 1);
                                    if (var21x == 0) {
                                        return new St();
                                    }
                                } else {
                                    var1x -= -265030116;
                                    var1x *= 590556905;
                                    var1x ^= 1196594613;
                                    var1x ^= 1552110616;
                                    Integer var15x = var1x;
                                    if (var15x != null) {
                                        IllegalStateException var17x = new IllegalStateException();
                                        throw var17x;
                                    }
                                }

                                AssertionError var16 = new AssertionError();
                                throw var16;
                            };
                            var10 = var4;
                            long var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var10 = var12 & 1L;
                            long var435;
                            int var327 = (var435 = var10 - 0L) == 0L ? 0 : (var435 < 0L ? -1 : 1);
                            if (var327 == 0) {
                                var3 *= 1930573593;
                                var3 ^= 518053459;
                                Object var259 = var258.computeIfAbsent(var1, var278);
                                St var260 = (St)var259;
                                var9 = var260.MR;
                                long var436;
                                int var280 = (var436 = var9 - Long.MIN_VALUE) == 0L ? 0 : (var436 < 0L ? -1 : 1);
                                if (var280 != 0) {
                                    var3 *= 1304572635;
                                    var3 ^= -126928524;
                                    int var281 = var3 + 1;
                                    int var282 = var3 * var281;
                                    int var328 = var3 + 2;
                                    int var283 = var282 * var328;
                                    int var329 = var3 + 3;
                                    int var284 = var283 * var329;
                                    int var285 = var284 & 7;
                                    if (var285 != 0) {
                                        break label329;
                                    }

                                    var9 = var260.MR;
                                    var9 = var6 - var9;
                                    int var11 = var195.cooldownMs();
                                    Integer var398 = var4;
                                    if (var398 == null) {
                                        var3 >>>= 16;
                                        var3 -= 526405177;
                                        var3 &= 2012201032;
                                        var3 ^= -292050099;
                                        break label340;
                                    }

                                    var3 &= -1816305107;
                                    var3 -= 1669569540;
                                    var3 ^= -103193155;
                                    Integer var399 = var3;
                                    if (var399 == null) {
                                        break label329;
                                    }

                                    long var358 = var11;
                                    long var437;
                                    int var288 = (var437 = var9 - var358) == 0L ? 0 : (var437 < 0L ? -1 : 1);
                                    if (var288 < 0) {
                                        var3 |= -1378016351;
                                        var3 |= -1405545059;
                                        var3 ^= 75116628;
                                        var9 = var3;
                                        long var359 = var9 + 1L;
                                        long var360 = var9 * var359;
                                        var9 = var360 & 1L;
                                        long var438;
                                        int var291 = (var438 = var9 - 0L) == 0L ? 0 : (var438 < 0L ? -1 : 1);
                                        if (var291 == 0) {
                                            return false;
                                        }
                                        break label329;
                                    }

                                    var3 += 764678775;
                                    var3 += -98301545;
                                    var3 >>= 23;
                                    var3 += -343308132;
                                    var3 ^= -180377351;
                                } else {
                                    var3 -= 121997600;
                                    var3 ^= -887223645;
                                }

                                var9 = var260.MR;
                                int var361 = var4 + 1;
                                var361 = var4 * var361;
                                int var400 = var4 + 2;
                                var361 *= var400;
                                int var401 = var4 + 3;
                                var361 *= var401;
                                var361 &= 7;
                                if (var361 != 0) {
                                    var3 *= -88424321;
                                    var3 ^= -256709250;
                                    break label340;
                                }

                                var3 &= -781324199;
                                var3 ^= 180280134;
                                var3 |= -690941981;
                                var3 ^= 1406727545;
                                var361 = var3 + 1;
                                var361 = var3 * var361;
                                int var402 = var3 + 2;
                                var361 *= var402;
                                int var403 = var3 + 3;
                                var361 *= var403;
                                var361 &= 7;
                                if (var361 != 0) {
                                    break label329;
                                }

                                label322: {
                                    long var439;
                                    int var293 = (var439 = var9 - Long.MIN_VALUE) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                                    if (var293 != 0) {
                                        var3 ^= -463641168;
                                        var3 ^= 1127304704;
                                        var9 = var260.MR;
                                        long var371 = var4;
                                        long var13 = var371 + 1L;
                                        var13 = var371 * var13;
                                        long var15 = var371 + 2L;
                                        var13 *= var15;
                                        long var372 = var371 + 3L;
                                        var13 *= var372;
                                        long var373 = var13 & 7L;
                                        long var440;
                                        var361 = (var440 = var373 - 0L) == 0L ? 0 : (var440 < 0L ? -1 : 1);
                                        if (var361 != 0) {
                                            var3 ^= -549573756;
                                            var3 ^= 2070290927;
                                            break label340;
                                        }

                                        var3 += 1603124432;
                                        var3 ^= -1570081924;
                                        long var375 = var3;
                                        var13 = var375 + 1L;
                                        var13 = var375 * var13;
                                        var15 = var375 + 2L;
                                        var13 *= var15;
                                        long var376 = var375 + 3L;
                                        var13 *= var376;
                                        long var377 = var13 & 7L;
                                        long var441;
                                        var361 = (var441 = var377 - 0L) == 0L ? 0 : (var441 < 0L ? -1 : 1);
                                        if (var361 != 0) {
                                            break label329;
                                        }

                                        var9 = var6 - var9;
                                        var361 = var195.comboWindowMs();
                                        long var380 = var361;
                                        long var442;
                                        int var296 = (var442 = var9 - var380) == 0L ? 0 : (var442 < 0L ? -1 : 1);
                                        if (var296 <= 0) {
                                            var3 |= -1506429831;
                                            var3 |= -2136328022;
                                            var3 *= -148456545;
                                            var3 ^= -1333904951;
                                            int var297 = var260.jI;
                                            var297++;
                                            int var330 = var4 + 1;
                                            int var331 = var4 * var330;
                                            int var332 = var331 & 1;
                                            if (var332 != 0) {
                                                var3 *= -1226211657;
                                                var3 ^= -488314055;
                                                break label340;
                                            }

                                            var3 -= -618926788;
                                            var3 += 454226732;
                                            var3 ^= -1181738845;
                                            var10 = var3;
                                            var12 = var10 + 1L;
                                            var12 = var10 * var12;
                                            var10 = var12 & 1L;
                                            long var443;
                                            int var335 = (var443 = var10 - 0L) == 0L ? 0 : (var443 < 0L ? -1 : 1);
                                            if (var335 != 0) {
                                                break label329;
                                            }

                                            int var336 = var195.maxCombo();
                                            int var299 = Math.min(var297, var336);
                                            var300 = var299;
                                            var3 &= -1899360721;
                                            var3 |= 791817686;
                                            var3 >>>= 5;
                                            var3 ^= 2052784447;
                                            break label322;
                                        }

                                        var3 &= -2681670;
                                        var3 |= -955200617;
                                        var3 ^= -43754994;
                                        var3 ^= -1660472718;
                                    } else {
                                        var3 -= -942821023;
                                        var3 ^= 1254162134;
                                    }

                                    var10 = var3;
                                    var12 = var10 + 1L;
                                    var12 = var10 * var12;
                                    long var14 = var10 + 2L;
                                    var12 *= var14;
                                    var10 += 3L;
                                    var12 *= var10;
                                    var10 = var12 & 7L;
                                    long var444;
                                    int var340 = (var444 = var10 - 0L) == 0L ? 0 : (var444 < 0L ? -1 : 1);
                                    if (var340 != 0) {
                                        break label329;
                                    }

                                    var300 = 0;
                                    var3 += 1246671254;
                                    var3 += -1021059680;
                                    var3 -= 1741979675;
                                    var3 ^= 1253140142;
                                }

                                var260.jI = var300;
                                var260.MR = var6;
                                var6 = var4;
                                var9 = var6 + 1L;
                                var9 = var6 * var9;
                                long var381 = var6 + 2L;
                                var9 *= var381;
                                var6 += 3L;
                                var9 *= var6;
                                var6 = var9 & 7L;
                                long var445;
                                int var217 = (var445 = var6 - 0L) == 0L ? 0 : (var445 < 0L ? -1 : 1);
                                if (var217 != 0) {
                                    switch (var3) {
                                        case -508638520:
                                        default:
                                            var3 ^= 690860758;
                                            break label340;
                                        case -474716846:
                                            var3 ^= 1082249148;
                                            break label340;
                                        case 2132987984:
                                            var3 <<= 24;
                                            var3 <<= 22;
                                            var3 &= -2044901425;
                                            var3 += -758694844;
                                            var3 ^= 1559238409;
                                            break label340;
                                    }
                                }

                                var3 &= -195019097;
                                var3 += 731925629;
                                var3 *= 174353989;
                                var3 *= 37355509;
                                var3 ^= 674057844;
                                Integer var218 = var3;
                                if (var218 == null) {
                                    break label329;
                                }

                                boolean var219 = var2.combo();
                                float var223;
                                if (var219) {
                                    var3 &= -1235083780;
                                    var3 &= 773978219;
                                    var3 >>= 11;
                                    var3 >>>= 26;
                                    var3 ^= -352816391;
                                    float var220 = var195.comboPitchStep();
                                    var7 = var260.jI;
                                    float var234 = var7;
                                    float var221 = var220 * var234;
                                    var221++;
                                    Integer var235 = var4;
                                    if (var235 == null) {
                                        switch (var3) {
                                            case -352816391:
                                                var3 &= 1142462140;
                                                var3 -= -1566855102;
                                                var3 &= 1726714265;
                                                var3 += -1605580019;
                                                var3 ^= 713285712;
                                                break label340;
                                            case -134681559:
                                                var3 ^= -1242615980;
                                                break label340;
                                            case 168083681:
                                            default:
                                                var3 ^= 18221629;
                                                break label340;
                                        }
                                    }

                                    var3 *= 323189671;
                                    var3 ^= 597280725;
                                    var223 = var221;
                                    var3 <<= 1;
                                    var3 ^= 760163237;
                                } else {
                                    var3 |= -972292994;
                                    var3 *= 1410008279;
                                    var3 ^= 1573034956;
                                    var3 *= 1940523813;
                                    var3 ^= 1325761298;
                                    var223 = 1.0F;
                                    var3 ^= -1365839499;
                                    var3 &= -1049625899;
                                    var3 -= -389744039;
                                    var3 ^= 1088525482;
                                }

                                long var236 = var3;
                                var9 = var236 + 1L;
                                var9 = var236 * var9;
                                long var237 = var9 & 1L;
                                long var446;
                                var7 = (var446 = var237 - 0L) == 0L ? 0 : (var446 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label329;
                                }

                                float var224 = var223;
                                List var197 = var195.layers();
                                var7 = var4 + 1;
                                var7 = var4 * var7;
                                var7 &= 1;
                                if (var7 != 0) {
                                    var3 -= 1947717939;
                                    var3 ^= 709049043;
                                    break label340;
                                }

                                var3 <<= 12;
                                var3 ^= 1020749060;
                                long var242 = var3;
                                var9 = var242 + 1L;
                                var9 = var242 * var9;
                                long var243 = var9 & 1L;
                                long var447;
                                var7 = (var447 = var243 - 0L) == 0L ? 0 : (var447 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label329;
                                }

                                Iterator var198 = var197.iterator();
                                Iterator var199 = var198;
                                var3 *= -949314037;
                                var3 ^= 854287704;

                                while (true) {
                                    int var245 = (var199.hasNext()) ? 1 : 0;
                                    var8 = var4;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var448;
                                    int var264 = (var448 = var8 - 0L) == 0L ? 0 : (var448 < 0L ? -1 : 1);
                                    if (var264 != 0) {
                                        var3 += -856021081;
                                        var3 -= -2014155379;
                                        var3 ^= -1250361405;
                                        break label340;
                                    }

                                    var3 &= -1061769310;
                                    var3 += 412223329;
                                    var3 -= -385704259;
                                    var3 ^= -368382093;
                                    int var265 = var3 + 1;
                                    int var266 = var3 * var265;
                                    int var309 = var3 + 2;
                                    int var267 = var266 * var309;
                                    int var310 = var3 + 3;
                                    int var268 = var267 * var310;
                                    int var269 = var268 & 7;
                                    if (var269 != 0) {
                                        break label329;
                                    }

                                    if (var245 == 0) {
                                        var3 *= 356167225;
                                        var3 ^= 1132454990;
                                        Integer var189 = var3;
                                        if (var189 != null) {
                                            return true;
                                        }
                                        break label329;
                                    }
                                    var3 = switch (var3) {
                                        case -907377933 -> var3 ^ -940474312;
                                        case 92642743 -> {
                                            var3 *= -784693511;
                                            var3 >>= 23;
                                            var3 &= -1629465165;
                                            var3 *= -1179034331;
                                            yield var3 ^ -661652258;
                                        }
                                        default -> var3 ^ -393330442;
                                    };
                                    Object var246 = var199.next();
                                    WK var247 = (WK)var246;
                                    float var270 = var247.volume();
                                    float var311 = var247.volumeJitter();
                                    int var345 = var3 & 1148191460;
                                    int var346 = var345 ^ 1598919766;
                                    float var271 = this.NL(var270, var311, var346);
                                    Integer var312 = var4;
                                    if (var312 == null) {
                                        var3 += 1671899068;
                                        var3 -= 1402376793;
                                        var3 >>= 25;
                                        var3 |= 543511216;
                                        var3 ^= 1908987065;
                                        break label340;
                                    }
                                    var3 = switch (var3) {
                                        case -1719029167 -> {
                                            var3 >>= 12;
                                            var3 |= -456477405;
                                            yield var3 ^ 846645253;
                                        }
                                        case -317156749 -> var3 ^ 256450278;
                                        default -> var3 ^ -1152612291;
                                    };
                                    Integer var313 = var3;
                                    if (var313 == null) {
                                        break label329;
                                    }

                                    float var314 = var2.volumeScale();
                                    float var272 = var271 * var314;
                                    float var315 = this.iB;
                                    float var273 = var272 * var315;
                                    float var316 = var247.pitch();
                                    float var347 = var247.pitchJitter();
                                    var361 = var3 << 26;
                                    var361 >>>= 7;
                                    var361 >>= 3;
                                    var361 ^= 1601410582;
                                    float var317 = this.NL(var316, var347, var361);
                                    float var348 = var2.pitchScale();
                                    float var318 = var317 * var348;
                                    float var319 = var318 * var224;
                                    float var274 = Math.max(0.0F, var273);
                                    float var275 = var274;
                                    float var320 = TP.t(var319, 0.5F, 2.0F);
                                    int var349 = var247.delayMs();
                                    if (var349 <= 0) {
                                        var3 >>>= 21;
                                        var3 &= -553599908;
                                        var3 -= 1515033368;
                                        var3 -= -518124467;
                                        var3 ^= 1301344098;
                                        Integer var350 = var3;
                                        if (var350 == null) {
                                            break label329;
                                        }

                                        nb_2 var351 = this.s;
                                        String var386 = var247.sound();
                                        int var411 = var4 + 1;
                                        int var412 = var4 * var411;
                                        int var423 = var4 + 2;
                                        int var413 = var412 * var423;
                                        var423 = var4 + 3;
                                        int var414 = var413 * var423;
                                        int var415 = var414 & 7;
                                        if (var415 != 0) {
                                            switch (var3) {
                                                case -1996190843:
                                                    var3 >>>= 14;
                                                    var3 *= -295182723;
                                                    var3 ^= -1784278137;
                                                    break label340;
                                                case 218172713:
                                                default:
                                                    var3 ^= -597412609;
                                                    break label340;
                                                case 570270636:
                                                    var3 ^= -1890792975;
                                                    break label340;
                                            }
                                        }

                                        var3 -= 2087255564;
                                        var3 *= -988659071;
                                        var3 ^= 1997949935;
                                        var351.Xs(var386, var275, var320, var2);
                                        var3 -= -1364112373;
                                        var3 += 1219851324;
                                        var3 += -1589471908;
                                        var3 *= 494265843;
                                        var3 ^= 1939856094;
                                    } else {
                                        var3 = switch (var3) {
                                            case -846367298 -> {
                                                var3 ^= -565781670;
                                                var3 |= 1745948942;
                                                yield var3 ^ -557758280;
                                            }
                                            default -> var3 ^ 563558410;
                                            case 2102563726 -> var3 ^ 205186918;
                                        };
                                        int var352 = var3 + 1;
                                        int var353 = var3 * var352;
                                        var361 = var3 + 2;
                                        int var354 = var353 * var361;
                                        var361 = var3 + 3;
                                        int var355 = var354 * var361;
                                        int var356 = var355 & 7;
                                        if (var356 != 0) {
                                            break label329;
                                        }

                                        gj var357 = this.T;
                                        Integer var389 = var4;
                                        if (var389 == null) {
                                            switch (var3) {
                                                case -1868246636:
                                                default:
                                                    var3 ^= 1692631108;
                                                    break label340;
                                                case -1524959402:
                                                    var3 += -1845576271;
                                                    var3 &= -1279455200;
                                                    var3 ^= 1235838203;
                                                    var3 *= -1110290813;
                                                    var3 ^= 1591835964;
                                                    break label340;
                                                case 2045428976:
                                                    var3 ^= 363004350;
                                                    break label340;
                                            }
                                        }

                                        var3 &= 1427192551;
                                        var3 &= 576168389;
                                        var3 ^= -1047996195;
                                        long var390 = var3;
                                        long var425 = var390 + 1L;
                                        var425 = var390 * var425;
                                        long var430 = var390 + 2L;
                                        var425 *= var430;
                                        long var391 = var390 + 3L;
                                        var425 *= var391;
                                        long var392 = var425 & 7L;
                                        long var449;
                                        int var393 = (var449 = var392 - 0L) == 0L ? 0 : (var449 < 0L ? -1 : 1);
                                        if (var393 != 0) {
                                            break label329;
                                        }

                                        var393 = var247.delayMs();
                                        long var395 = var393;
                                        Runnable var248 = () -> {
                                            int var5x = CW;
                                            var5x ^= -50463096;
                                            int var6x = System.identityHashCode(this);
                                            nb_2 var7x = this.s;
                                            String var8x = var247.sound();
                                            int var9x = var6x + 1;
                                            var9x = var6x * var9x;
                                            var6x = var9x & 1;
                                            if (var6x != 0) {
                                                var5x ^= 768715373;
                                                var5x &= -97125061;
                                                var5x &= -1687774023;
                                                var5x *= 838412207;
                                                var5x ^= 2065956372;
                                                UnsupportedOperationException var19x = new UnsupportedOperationException();
                                                throw var19x;
                                            } else {
                                                var5x ^= -1783291096;
                                                var5x ^= 1925848713;
                                                var7x.Xs(var8x, var275, var320, var2);
                                            }
                                        };
                                        var357.Zl(var395, var248);
                                        switch (var3) {
                                            case -1046939495:
                                                var3 *= -681187675;
                                                var3 &= 169221353;
                                                var3 += 705552940;
                                                var3 ^= -1759885102;
                                                break;
                                            case -612496170:
                                            default:
                                                var3 ^= 1320894350;
                                                break;
                                            case 252711888:
                                                var3 ^= 1228909051;
                                        }
                                    }

                                    long var249 = var3;
                                    var9 = var249 + 1L;
                                    var9 = var249 * var9;
                                    long var396 = var249 + 2L;
                                    var9 *= var396;
                                    long var250 = var249 + 3L;
                                    var9 *= var250;
                                    long var251 = var9 & 7L;
                                    long var450;
                                    var245 = (var450 = var251 - 0L) == 0L ? 0 : (var450 < 0L ? -1 : 1);
                                    if (var245 != 0) {
                                        break label329;
                                    }

                                    switch (var3) {
                                        case -1559643545:
                                            var3 ^= 1490496713;
                                            var3 &= -1680423586;
                                            var3 <<= 7;
                                            var3 &= 1830421113;
                                            var3 ^= -1622534028;
                                            break;
                                        case -401112681:
                                        default:
                                            var3 ^= -1668365636;
                                            break;
                                        case 451261507:
                                            var3 ^= 1051813280;
                                    }
                                }
                            }

                            var3 >>>= 20;
                            var3 &= 178848752;
                            var3 &= 1381253353;
                            var3 ^= 1982750812;
                            var3 ^= -132560015;
                            break label340;
                        }

                        var3 <<= 15;
                        var3 *= -1888692979;
                        var3 &= 1602783635;
                        var3 ^= -1353063754;
                    } else {
                        switch (var3) {
                            case -1622873032:
                                var3 ^= 483241753;
                                break;
                            case -170431280:
                            default:
                                var3 ^= 1201717915;
                                break;
                            case 1101132014:
                                var3 >>>= 25;
                                var3 <<= 18;
                                var3 &= -913858641;
                                var3 ^= -1127095626;
                        }
                    }

                    Integer var186 = var3;
                    if (var186 != null) {
                        return false;
                    }
                    break label329;
                }
            }

            long var190 = var3;
            var6 = var190 + 1L;
            var6 = var190 * var6;
            var8 = var190 + 2L;
            var6 *= var8;
            long var191 = var190 + 3L;
            var6 *= var191;
            long var192 = var6 & 7L;
            long var451;
            var4 = (var451 = var192 - 0L) == 0L ? 0 : (var451 < 0L ? -1 : 1);
            if (var4 == 0) {
                UnsupportedOperationException var194 = new UnsupportedOperationException();
                throw var194;
            }
        }

        UnsupportedOperationException var188 = new UnsupportedOperationException();
        throw var188;
    }

    private float NL(float var1, float var2, int var3) {
        int var5 = System.identityHashCode(this);
        long var6 = var5;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var65;
        int var44 = (var65 = var6 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
        if (var44 != 0) {
            int var32 = var3 + -119050585;
            var32 += -1510985093;
            var32 ^= -481590412;
        } else {
            label37: {
                int var4 = var3 ^ -531839352;
                var4 *= -1766523745;
                var4 &= -845519375;
                var4 ^= -1431979031;
                Integer var45 = var4;
                if (var45 != null) {
                    float var66;
                    int var46 = (var66 = var2 - 0.0F) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
                    if (var46 <= 0) {
                        var4 &= -1688884731;
                        var4 ^= 2082754243;
                        return var1;
                    }

                    var4 *= 1785333209;
                    var4 <<= 14;
                    var4 += -752270270;
                    var4 ^= 775493862;
                    RandomGenerator var47 = this.m;
                    float var48 = var47.nextFloat();
                    long var7 = var5;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var67;
                    var5 = (var67 = var7 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        var4 &= -1204660081;
                        var4 >>>= 9;
                        var4 |= 1401820361;
                        var4 |= -1239516455;
                        var4 ^= -353318255;
                        break label37;
                    }

                    var4 &= -1283903190;
                    var4 -= -1879220393;
                    var4 &= -1989295679;
                    var4 >>>= 3;
                    var4 ^= 1363896842;
                    var7 = var4;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var68;
                    var5 = (var68 = var7 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        float var39 = var48 * 2.0F;
                        float var41 = --var39 * var2;
                        return var1 + var41;
                    }
                }

                AssertionError var38 = new AssertionError();
                throw var38;
            }
        }

        RuntimeException var35 = new RuntimeException();
        throw var35;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1054293494;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        CW = var4;
    }
}
