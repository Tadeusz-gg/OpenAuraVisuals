package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class CT {
    public final double[] p;
    public final double[] Y;
    public final double[] J;
    public final long[] LJ;
    public int C;
    public int GY;
    public long b;
    public static final int j;

    public CT() {
        double[] var1 = new double[32];
        this.p = var1;
        var1 = new double[32];
        this.Y = var1;
        var1 = new double[32];
        this.J = var1;
        long[] var4 = new long[32];
        this.LJ = var4;
    }

    public int T(int var1) {
        int var2 = j;
        var2 ^= 2054323571;
        int var4 = System.identityHashCode(this);
        int var5 = this.C;
        int var6 = var4 + 1;
        var6 = var4 * var6;
        var4 = var6 & 1;
        var6 = of_2.qG;
        var2 ^= var6;
        var2 ^= 1220043223;
        of_2.qG = 1220043223;
        var6 = of_2.D;
        var2 ^= var6;
        var2 ^= -1771401246;
        of_2.D = -1771401246;
        if (var4 != 0) {
            var2 ^= 1312285500;
            var2 ^= 1202476016;
            long var30 = var1;
            long var8 = var30 + 1L;
            var8 = var30 * var8;
            long var31 = var8 & 1L;
            long var33;
            var4 = (var33 = var31 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        } else {
            var2 -= -715901932;
            var2 <<= 3;
            var2 >>>= 23;
            var2 ^= -1028057909;
            Integer var21 = var1;
            if (var21 != null) {
                int var23 = var5 + var1;
                return var23 % 32;
            }
        }

        RuntimeException var22 = new RuntimeException();
        throw var22;
    }

    public void l(double var1, double var3, double var5, long var7, int var9) {
        int var10 = j;
        int var11 = var9;
        var10 ^= 1305163578;
        int var12 = System.identityHashCode(this);
        var10 += 217189779;
        var10 ^= 1276810938;

        while (true) {
            int var13 = this.GY;
            Integer var14 = var12;
            if (var14 == null) {
                var10 &= -1473985650;
                var10 -= -1824844578;
                var10 >>>= 3;
                var10 ^= 1800706041;
            } else {
                label163: {
                    var10 += -1690054731;
                    var10 ^= 2049858034;
                    long var158 = var11;
                    long var16 = var158 + 1L;
                    var16 = var158 * var16;
                    long var18 = var158 + 2L;
                    var16 *= var18;
                    long var159 = var158 + 3L;
                    var16 *= var159;
                    long var160 = var16 & 7L;
                    long var267;
                    int var161 = (var267 = var160 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                    if (var161 != 0) {
                        break;
                    }

                    if (var13 > 0) {
                        var10 ^= -1732087589;
                        var10 ^= 1352817413;
                        long var136 = var11;
                        long var15 = var136 + 1L;
                        var15 = var136 * var15;
                        long var137 = var15 & 1L;
                        long var268;
                        var13 = (var268 = var137 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                        if (var13 != 0) {
                            break;
                        }

                        long[] var139 = this.LJ;
                        var161 = this.C;
                        var15 = var12;
                        long var17 = var15 + 1L;
                        var17 = var15 * var17;
                        var15 = var17 & 1L;
                        long var269;
                        int var206 = (var269 = var15 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                        if (var206 != 0) {
                            var10 &= -1386865696;
                            var10 |= 2123587778;
                            var10 ^= -1374742970;
                            var10 *= 1732527409;
                            var10 ^= -1595546792;
                            break label163;
                        }

                        var10 |= -1453056020;
                        var10 &= 1045534407;
                        var10 |= -1895886208;
                        var10 &= -1552111381;
                        var10 ^= 1420450005;
                        Integer var207 = var11;
                        if (var207 == null) {
                            break;
                        }

                        long var140 = var139[var161];
                        long var141 = var7 - var140;
                        var15 = var9;
                        long var270;
                        var13 = (var270 = var141 - var15) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                        if (var13 > 0) {
                            var10 *= -368497679;
                            var10 |= -976505325;
                            var10 ^= -1721330890;
                            var10 ^= -1540634219;
                            var13 = this.C;
                            var13 = ++var13 % 32;
                            this.C = var13;
                            var13 = this.GY;
                            var13--;
                            long var163 = var12;
                            var16 = var163 + 1L;
                            var16 = var163 * var16;
                            var18 = var163 + 2L;
                            var16 *= var18;
                            long var164 = var163 + 3L;
                            var16 *= var164;
                            long var165 = var16 & 7L;
                            long var271;
                            var161 = (var271 = var165 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                            if (var161 == 0) {
                                var10 |= 253524733;
                                var10 ^= -140164379;
                                var10 ^= -916846592;
                                var161 = var11 + 1;
                                var161 = var11 * var161;
                                var161 &= 1;
                                if (var161 != 0) {
                                    break;
                                }

                                this.GY = var13;
                                var10 *= 2096066001;
                                var10 >>>= 3;
                                var10 ^= -1065224981;
                                continue;
                            }

                            var10 &= -1714170284;
                            var10 ^= -45171096;
                            break label163;
                        }

                        var10 ^= 2034189475;
                        var10 &= -1256192878;
                        var10 |= 1201803577;
                        var10 -= 2077603222;
                        var10 ^= -2084561181;
                    } else {
                        var10 += 1543154410;
                        var10 &= -2006538626;
                        var10 |= 1659773949;
                        var10 ^= -1562191557;
                    }

                    var13 = var11 + 1;
                    var13 = var11 * var13;
                    var13 &= 1;
                    if (var13 != 0) {
                        break;
                    }

                    var13 = this.GY;
                    long var170 = var12;
                    var16 = var170 + 1L;
                    var16 = var170 * var16;
                    var18 = var170 + 2L;
                    var16 *= var18;
                    long var171 = var170 + 3L;
                    var16 *= var171;
                    long var172 = var16 & 7L;
                    long var272;
                    var161 = (var272 = var172 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                    label145:
                    if (var161 == 0) {
                        var10 = switch (var10) {
                            default -> var10 ^ -1654324266;
                            case -938705210 -> {
                                var10 <<= 13;
                                var10 *= 1845273897;
                                var10 >>>= 1;
                                yield var10 ^ 713559301;
                            }
                            case 1699413743 -> var10 ^ -795755127;
                        };
                        Integer var174 = var11;
                        if (var174 == null) {
                            break;
                        }

                        if (var13 > 0) {
                            var10 &= 1794736766;
                            var10 *= 762340355;
                            var10 &= 379815976;
                            var10 ^= -917880017;
                            long var152 = var11;
                            long var209 = var152 + 1L;
                            var209 = var152 * var209;
                            long var153 = var209 & 1L;
                            long var273;
                            var13 = (var273 = var153 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
                            if (var13 != 0) {
                                break;
                            }

                            var13 = this.GY;
                            var13 = this.T(--var13);
                            double[] var175 = this.p;
                            var209 = var12;
                            long var253 = var209 + 1L;
                            var253 = var209 * var253;
                            var209 = var253 & 1L;
                            long var274;
                            int var213 = (var274 = var209 - 0L) == 0L ? 0 : (var274 < 0L ? -1 : 1);
                            if (var213 != 0) {
                                switch (var10) {
                                    case -615857369:
                                        var10 <<= 2;
                                        var10 ^= 417805984;
                                        break label145;
                                    case 764162399:
                                    default:
                                        var10 ^= -1644135349;
                                        break label145;
                                    case 1294936807:
                                        var10 ^= 2027406543;
                                        break label145;
                                }
                            }

                            var10 *= 891491865;
                            var10 -= -198700867;
                            var10 >>>= 27;
                            var10 |= -75665063;
                            var10 ^= -1220057038;
                            int var214 = var11 + 1;
                            int var215 = var11 * var214;
                            int var216 = var215 & 1;
                            if (var216 != 0) {
                                break;
                            }

                            double var176 = var175[var13];
                            double var177 = var1 - var176;
                            double[] var243 = this.Y;
                            double var244 = var243[var13];
                            double var245 = var3 - var244;
                            double[] var263 = this.J;
                            double var264 = var263[var13];
                            double var265 = var5 - var264;
                            double var178 = var177 * var177;
                            double var246 = var245 * var245;
                            double var179 = var178 + var246;
                            double var247 = var265 * var265;
                            double var180 = var179 + var247;
                            double var275;
                            int var181 = (var275 = var180 - 1.0E-6) == 0.0 ? 0 : (var275 < 0.0 ? -1 : 1);
                            if (var181 < 0) {
                                var10 |= -1484289406;
                                var10 *= 1071849529;
                                var10 -= -917570611;
                                var10 ^= -330129649;
                                long var182 = var11;
                                var16 = var182 + 1L;
                                var16 = var182 * var16;
                                var18 = var182 + 2L;
                                var16 *= var18;
                                long var183 = var182 + 3L;
                                var16 *= var183;
                                long var184 = var16 & 7L;
                                long var276;
                                var181 = (var276 = var184 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                                if (var181 == 0) {
                                    return;
                                }
                                break;
                            }

                            var10 -= -1358347472;
                            var10 ^= 279565230;
                        } else {
                            var10 ^= -785004347;
                            var10 += -1525716190;
                            var10 &= -2107878366;
                            var10 ^= -454965774;
                            var10 ^= 1802293313;
                        }

                        int var186 = var11 + 1;
                        var186 = var11 * var186;
                        var186 &= 1;
                        if (var186 != 0) {
                            break;
                        }

                        var186 = this.GY;
                        long var217 = var12;
                        long var255 = var217 + 1L;
                        var255 = var217 * var255;
                        long var19 = var217 + 2L;
                        var255 *= var19;
                        var217 += 3L;
                        var255 *= var217;
                        var217 = var255 & 7L;
                        long var277;
                        int var220 = (var277 = var217 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                        label136:
                        if (var220 == 0) {
                            var10 ^= 1947646927;
                            var10 += -2118893169;
                            var10 ^= -1003734984;
                            var217 = var11;
                            var255 = var217 + 1L;
                            var255 = var217 * var255;
                            var217 = var255 & 1L;
                            long var278;
                            int var223 = (var278 = var217 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
                            if (var223 != 0) {
                                break;
                            }

                            if (var186 == 32) {
                                var10 *= 63782415;
                                var10 ^= 1154938345;
                                var186 = var11 + 1;
                                var186 = var11 * var186;
                                int var224 = var11 + 2;
                                var186 *= var224;
                                int var225 = var11 + 3;
                                var186 *= var225;
                                var186 &= 7;
                                if (var186 != 0) {
                                    break;
                                }

                                var186 = this.C;
                                var186++;
                                int var226 = var12 + 1;
                                int var227 = var12 * var226;
                                int var228 = var227 & 1;
                                if (var228 != 0) {
                                    var10 *= 1281715337;
                                    var10 ^= -835801570;
                                    break label136;
                                }

                                var10 ^= 631285431;
                                var10 &= -344175346;
                                var10 &= 897429220;
                                var10 &= 1508342625;
                                var10 ^= -1998653057;
                                var186 %= 32;
                                this.C = var186;
                                var186 = this.GY;
                                this.GY = --var186;
                                var10 -= 1368902;
                                var10 |= -695139556;
                                var10 *= -633357223;
                                var10 ^= 385826200;
                            } else {
                                switch (var10) {
                                    case -1083193387:
                                        var10 &= 994420254;
                                        var10 += 1481495528;
                                        var10 <<= 23;
                                        var10 |= 1410688040;
                                        var10 ^= 254951813;
                                        break;
                                    case -658710178:
                                    default:
                                        var10 ^= 292893739;
                                        break;
                                    case -499600167:
                                        var10 ^= 1474961796;
                                }
                            }

                            var186 = this.GY;
                            int var229 = var186 + 1;
                            this.GY = var229;
                            var186 = this.T(var186);
                            int var230 = var12 + 1;
                            int var231 = var12 * var230;
                            var12 = var231 & 1;
                            if (var12 == 0) {
                                switch (var10) {
                                    case -249092691:
                                        var10 += -1627171024;
                                        var10 ^= -161076757;
                                        break;
                                    case 1299143420:
                                        var10 ^= 1470206212;
                                        break;
                                    case 1310881282:
                                    default:
                                        var10 ^= 61193462;
                                }

                                double[] var128 = this.p;
                                var128[var186] = var1;
                                double[] var129 = this.Y;
                                var129[var186] = var3;
                                double[] var130 = this.J;
                                var130[var186] = var5;
                                long[] var131 = this.LJ;
                                var131[var186] = var7;
                                return;
                            }

                            var10 >>>= 9;
                            var10 ^= 90015791;
                            var10 <<= 10;
                            var10 -= -406118587;
                            var10 ^= -646975865;
                        } else {
                            var10 |= 800649970;
                            var10 ^= -629813809;
                        }
                    } else {
                        var10 ^= 2104407701;
                        var10 ^= -1062276497;
                    }
                }
            }

            long var121 = var11;
            long var132 = var121 + 1L;
            long var133 = var121 * var132;
            long var202 = var121 + 2L;
            long var134 = var133 * var202;
            long var122 = var121 + 3L;
            long var135 = var134 * var122;
            long var123 = var135 & 7L;
            long var279;
            var10 = (var279 = var123 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
            if (var10 == 0) {
                IllegalArgumentException var125 = new IllegalArgumentException();
                throw var125;
            }
            break;
        }

        RuntimeException var126 = new RuntimeException();
        throw var126;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1862673722;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        j = var4;
    }
}
