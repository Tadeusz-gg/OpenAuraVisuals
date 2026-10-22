package mvggs.modules.animations;

import dev.aurap.hub.*;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;

public final class hurtcam extends Yn {
    private final r_2 AH;
    private final Uq cD;
    public static final int LN;

    public hurtcam() {
        super("hurt_cam", "Hurt Cam", AJ.ANIMATIONS);
        AJ var1 = AJ.ANIMATIONS;

        XE var2 = XE.STEADY;
        r_2 var3 = new r_2("mode", "Mode", var2);
        xB var4 = this.vn(var3);
        r_2 var5 = (r_2)var4;
        this.AH = var5;
        Uq var6 = new Uq("strength", "Strength", 0.25F, 0.0F, 1.0F);
        Uq var7 = var6.W(0.05F);
        Uq var8 = var7.L("x");
        BooleanSupplier var13 = () -> {
            int var1x = LN;
            var1x ^= -593025183;
            int var2x = System.identityHashCode(this);
            r_2 var3x = this.AH;
            XE var4x = XE.STEADY;
            boolean var44 = var3x.TJ(var4x);
            long var47 = var2x;
            long var6x = var47 + 1L;
            var6x = var47 * var6x;
            long var48 = var6x & 1L;
            long var53;
            var2x = (var53 = var48 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x |= 1731938904;
                var1x |= 666867587;
                var1x ^= -290057994;
                IllegalStateException var43 = new IllegalStateException();
                throw var43;
            } else {
                var1x ^= 751570534;
                var1x += 1738726855;
                var1x ^= 1622839613;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                int var49 = var1x + 2;
                var2x *= var49;
                int var50 = var1x + 3;
                var2x *= var50;
                var2x &= 7;
                label34:
                if (var2x == 0) {
                    int var42 = 0;
                    if (!var44) {
                        var1x &= -1162709953;
                        var1x <<= 15;
                        var1x ^= 1291764950;
                        var1x ^= -947085531;
                        var42 = var1x + 1;
                        var42 = var1x * var42;
                        var42 &= 1;
                        if (var42 != 0) {
                            break label34;
                        }

                        var42 = 1;
                        switch (var1x) {
                            case -2089853965:
                                var1x += 1531183814;
                                var1x |= -396246347;
                                var1x *= -889792949;
                                var1x += -3073279;
                                var1x ^= -501837277;
                                break;
                            case -1828283535:
                            default:
                                var1x ^= 998219074;
                                break;
                            case -648243207:
                                var1x ^= 1729597215;
                        }
                    } else {
                        var1x -= -237664214;
                        var1x |= 89740422;
                        var1x *= 698702023;
                        var1x ^= -1824509620;
                        var42 = 0;
                        var1x &= -1766011198;
                        var1x |= 1044053969;
                        var1x |= 1629842907;
                        var1x ^= -1539688552;
                    }

                    long var45 = var1x;
                    long var5x = var45 + 1L;
                    var5x = var45 * var5x;
                    long var46 = var5x & 1L;
                    long var54;
                    var1x = (var54 = var46 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
                    if (var1x == 0) {
                        return (var42 != 0);
                    }
                }

                UnsupportedOperationException var29 = new UnsupportedOperationException();
                throw var29;
            }
        };
        xB var9 = var8.Pt(var13);
        Uq var10 = (Uq)var9;
        xB var11 = this.vn(var10);
        Uq var12 = (Uq)var11;
        this.cD = var12;
        this.dy("Steady camera, reduced vanilla tilt, or a softer damage envelope.");
        this.fJ(true);
    }

    public static float C(float var0) {
        label128: {
            int var1 = LN;
            var1 ^= 56684598;
            int var2 = (int)var0;
            int var3 = (Ud.y()) ? 1 : 0;
            Integer var4 = var2;
            if (var4 != null) {
                var1 = switch (var1) {
                    case -1962872368 -> var1 ^ -299754311;
                    default -> var1 ^ -2046031508;
                    case 1904079985 -> {
                        var1 *= -177673697;
                        yield var1 ^ 1516648409;
                    }
                };
                long var97 = var1;
                long var6 = var97 + 1L;
                var6 = var97 * var6;
                long var98 = var6 & 1L;
                long var167;
                int var99 = (var167 = var98 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
                if (var99 != 0) {
                    break label128;
                }

                if (var3 == 0) {
                    Integer var96 = switch (var1) {
                        case 150066294 -> {
                            var1 -= 1745872678;
                            yield var1 ^ -743244452;
                        }
                        default -> var1 ^ -260453431;
                        case 1589978730 -> var1 ^ 293249751;
                    };
                    if (var96 != null) {
                        return var0;
                    }
                    break label128;
                }

                var1 ^= -1697100687;
                var1 ^= 598673471;
                var3 = var1 + 1;
                var3 = var1 * var3;
                var99 = var1 + 2;
                var3 *= var99;
                var99 = var1 + 3;
                var3 *= var99;
                var3 &= 7;
                if (var3 != 0) {
                    break label128;
                }

                Ud var90 = Ud.Z();
                NW var91 = var90.sP();
                Yn var92 = var91.tG(hurtcam.class);
                hurtcam var93 = (hurtcam)var92;
                long var102 = var2;
                var6 = var102 + 1L;
                var6 = var102 * var6;
                long var103 = var6 & 1L;
                long var168;
                var99 = (var168 = var103 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                if (var99 == 0) {
                    var1 ^= -1743824227;
                    var1 += -384821263;
                    var1 ^= -1421399802;
                    var99 = var1 + 1;
                    var99 = var1 * var99;
                    int var5 = var1 + 2;
                    var99 *= var5;
                    var5 = var1 + 3;
                    var99 *= var5;
                    var99 &= 7;
                    if (var99 != 0) {
                        break label128;
                    }

                    int var110 = (var93.IU()) ? 1 : 0;
                    if (var110 == 0) {
                        var1 ^= -421047279;
                        var1 -= -1315287017;
                        var1 ^= -1259405502;
                        var1 ^= -1282891898;
                        long var130 = var1;
                        var6 = var130 + 1L;
                        var6 = var130 * var6;
                        long var131 = var6 & 1L;
                        long var169;
                        var110 = (var169 = var131 - 0L) == 0L ? 0 : (var169 < 0L ? -1 : 1);
                        if (var110 == 0) {
                            return var0;
                        }
                        break label128;
                    }

                    var1 -= -21973858;
                    var1 *= -123914673;
                    var1 |= -1378872375;
                    var1 ^= -336278027;
                    Integer var111 = var1;
                    if (var111 == null) {
                        break label128;
                    }

                    r_2 var112 = var93.AH;
                    Integer var134 = var2;
                    if (var134 != null) {
                        var1 ^= -2144550925;
                        var1 >>= 24;
                        var1 <<= 13;
                        var1 -= -991968093;
                        var1 ^= -1208803475;
                        XE var135 = XE.STEADY;
                        boolean var113 = var112.TJ(var135);
                        if (var113) {
                            var1 ^= 1860556721;
                            var1 ^= -1400774683;
                            long var127 = var1;
                            var6 = var127 + 1L;
                            var6 = var127 * var6;
                            long var128 = var6 & 1L;
                            long var170;
                            int var129 = (var170 = var128 - 0L) == 0L ? 0 : (var170 < 0L ? -1 : 1);
                            if (var129 == 0) {
                                return 0.0F;
                            }
                            break label128;
                        }
                        var1 = switch (var1) {
                            case -1931369424 -> {
                                var1 |= 405459582;
                                var1 |= -449673346;
                                yield var1 ^ 542988987;
                            }
                            default -> var1 ^ -1175692525;
                            case 1310987545 -> var1 ^ 822479454;
                        };
                        r_2 var114 = var93.AH;
                        XE var136 = XE.REDUCED;
                        boolean var115 = var114.TJ(var136);
                        var134 = var2;
                        if (var134 != null) {
                            var1 &= -2078063735;
                            var1 *= -1473780153;
                            var1 *= -1944728631;
                            var1 ^= 580678189;
                            int var138 = var1 + 1;
                            var138 = var1 * var138;
                            int var154 = var1 + 2;
                            var138 *= var154;
                            int var155 = var1 + 3;
                            var138 *= var155;
                            var138 &= 7;
                            if (var138 != 0) {
                                break label128;
                            }

                            if (var115) {
                                var1 ^= 742610578;
                                var1 >>= 24;
                                var1 ^= -1842803313;
                                long var116 = var1;
                                var6 = var116 + 1L;
                                var6 = var116 * var6;
                                long var8 = var116 + 2L;
                                var6 *= var8;
                                long var117 = var116 + 3L;
                                var6 *= var117;
                                long var118 = var6 & 7L;
                                long var171;
                                int var119 = (var171 = var118 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                                if (var119 != 0) {
                                    break label128;
                                }

                                Uq var120 = var93.cD;
                                float var121 = var120.WM();
                                var138 = var2 + 1;
                                var138 = var2 * var138;
                                int var160 = var2 + 2;
                                var138 *= var160;
                                int var161 = var2 + 3;
                                var138 *= var161;
                                var138 &= 7;
                                if (var138 == 0) {
                                    var1 >>>= 20;
                                    var1 += 233288156;
                                    var1 -= -1448287798;
                                    var1 ^= -603328559;
                                    var1 ^= 598461739;
                                    Integer var148 = var1;
                                    if (var148 != null) {
                                        return var0 * var121;
                                    }
                                    break label128;
                                }

                                var1 |= 602679456;
                                var1 -= 556909508;
                                var1 >>>= 27;
                                var1 ^= -188439657;
                            } else {
                                var1 |= 477760479;
                                var1 ^= 618715964;
                                var111 = var1;
                                if (var111 == null) {
                                    break label128;
                                }

                                float var123 = Math.abs(var0);
                                float var124 = var123 / 14.0F;
                                float var125 = TP.S(var124);
                                long var149 = var2;
                                long var7 = var149 + 1L;
                                var7 = var149 * var7;
                                long var150 = var7 & 1L;
                                long var172;
                                var2 = (var172 = var150 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                                if (var2 == 0) {
                                    var1 ^= 328287496;
                                    var1 |= -2070610730;
                                    var1 -= 191410118;
                                    var1 ^= 1687473748;
                                    Integer var78 = var1;
                                    if (var78 != null) {
                                        float var126 = var125 * var125;
                                        float var80 = 2.0F * var125;
                                        float var81 = 3.0F - var80;
                                        float var82 = var126 * var81;
                                        float var83 = 14.0F * var82;
                                        Uq var94 = var93.cD;
                                        float var95 = var94.WM();
                                        float var84 = var83 * var95;
                                        return Math.copySign(var84, var0);
                                    }
                                    break label128;
                                }

                                var1 &= -1321758236;
                                var1 ^= -1212311654;
                                var1 *= -860424467;
                                var1 += 328013351;
                                var1 ^= 1381080455;
                            }
                        } else {
                            var1 >>= 29;
                            var1 ^= 188439648;
                        }
                    } else {
                        var1 &= 1740476416;
                        var1 |= 606196539;
                        var1 &= -2030039887;
                        var1 ^= -255548497;
                    }
                } else {
                    var1 >>= 11;
                    var1 &= -331424083;
                    var1 >>>= 29;
                    var1 += 737668292;
                    var1 ^= -550285483;
                }
            } else {
                var1 -= -224512785;
                var1 ^= 1122617461;
                var1 ^= -923610007;
            }

            Integer var74 = var1;
            if (var74 != null) {
                UnsupportedOperationException var76 = new UnsupportedOperationException();
                throw var76;
            }
        }

        IllegalStateException var75 = new IllegalStateException();
        throw var75;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1689267092;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        LN = var4;
    }
}
