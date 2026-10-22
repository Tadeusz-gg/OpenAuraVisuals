package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;

public final class LH {
    private final float[] nw;
    private final float[] Zs;
    private final Lv[] ah;
    public static final int LS;

    LH(float[] var1, float[] var2, Lv[] var3) {
        this.nw = var1;
        this.Zs = var2;
        this.ah = var3;
    }

    public static GQ ve() {
        return new GQ();
    }

    public float S() {
        int var1 = LS;
        var1 ^= -1056256616;
        int var2 = System.identityHashCode(this);
        float[] var3 = this.nw;
        float[] var4 = this.nw;
        int var22 = var4.length;
        var22--;
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var29;
        var2 = (var29 = var5 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= 564290847;
            var1 |= 225388979;
            var1 ^= -1121418503;
            Integer var21 = var1;
            if (var21 != null) {
                return var3[var22];
            }
        } else {
            Integer var17 = switch (var1) {
                case -1205325067 -> {
                    var1 *= -1287658453;
                    yield var1 ^ 506303678;
                }
                default -> var1 ^ 2995965;
                case 651159353 -> var1 ^ -1637659389;
            };
            if (var17 != null) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public float u(float var1) {
        label98: {
            int var2 = LS;
            var2 ^= -925380552;
            int var3 = System.identityHashCode(this);
            float[] var4 = this.nw;
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            var6 = of_2.Tk;
            var2 ^= var6;
            var2 ^= 475706417;
            of_2.Tk = 475706417;
            var6 = of_2.dx;
            var2 ^= var6;
            var2 ^= 2133974452;
            of_2.dx = 2133974452;
            if (var5 == 0) {
                var2 >>>= 21;
                var2 ^= -1371235800;
                var5 = var2 + 1;
                var5 = var2 * var5;
                var6 = var2 + 2;
                var5 *= var6;
                var6 = var2 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 != 0) {
                    break label98;
                }

                float var84 = var4[0];
                float var171;
                int var85 = (var171 = var1 - var84) == 0.0F ? 0 : (var171 < 0.0F ? -1 : 1);
                if (var85 <= 0) {
                    var2 += 473456401;
                    var2 -= -309340736;
                    var2 ^= 1664852236;
                    var4 = this.Zs;
                    Integer var105 = var3;
                    if (var105 != null) {
                        var2 |= 1612703967;
                        var2 &= -618551415;
                        var2 ^= -1099230762;
                        long var106 = var2;
                        long var7 = var106 + 1L;
                        var7 = var106 * var7;
                        long var9 = var106 + 2L;
                        var7 *= var9;
                        long var107 = var106 + 3L;
                        var7 *= var107;
                        long var108 = var7 & 7L;
                        long var172;
                        int var109 = (var172 = var108 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                        if (var109 == 0) {
                            return var4[0];
                        }
                        break label98;
                    }

                    var2 ^= 731029951;
                    var2 += 431745265;
                    var2 -= 728412173;
                    var2 ^= -948232704;
                    var2 ^= -377024238;
                } else {
                    var2 |= -975762258;
                    var2 ^= 384847193;
                    Integer var87 = var2;
                    if (var87 == null) {
                        break label98;
                    }

                    var4 = this.nw;
                    var5 = var3 + 1;
                    var5 = var3 * var5;
                    var5 &= 1;
                    if (var5 == 0) {
                        var2 ^= 57730410;
                        var2 |= 86751624;
                        var2 ^= 1561145398;
                        Integer var113 = var2;
                        if (var113 == null) {
                            break label98;
                        }

                        int var89 = var4.length;
                        var89--;
                        float[] var114 = this.nw;
                        float var115 = var114[var89];
                        float var173;
                        int var116 = (var173 = var1 - var115) == 0.0F ? 0 : (var173 < 0.0F ? -1 : 1);
                        if (var116 >= 0) {
                            var2 >>>= 26;
                            var2 += 461259914;
                            var2 ^= -192234188;
                            float[] var117 = this.Zs;
                            var6 = var3 + 1;
                            var6 = var3 * var6;
                            var6 &= 1;
                            if (var6 == 0) {
                                var2 *= -1243706907;
                                var2 >>>= 5;
                                var2 ^= -1119768962;
                                long var134 = var2;
                                long var8 = var134 + 1L;
                                var8 = var134 * var8;
                                long var10 = var134 + 2L;
                                var8 *= var10;
                                long var135 = var134 + 3L;
                                var8 *= var135;
                                long var136 = var8 & 7L;
                                long var174;
                                var6 = (var174 = var136 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    return var117[var89];
                                }
                                break label98;
                            }

                            switch (var2) {
                                case -880609704:
                                default:
                                    var2 ^= -157623256;
                                    break;
                                case -269158010:
                                    var2 &= -1370325659;
                                    var2 ^= 37295929;
                                    break;
                                case -209701062:
                                    var2 ^= 125428720;
                            }
                        } else {
                            var2 -= -1292241197;
                            var2 |= 1879043032;
                            var2 &= -2037918545;
                            var2 <<= 18;
                            var2 ^= -1054773880;
                            var4 = this.nw;
                            long var118 = var3;
                            long var156 = var118 + 1L;
                            var156 = var118 * var156;
                            long var119 = var156 & 1L;
                            long var175;
                            var116 = (var175 = var119 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                            if (var116 != 0) {
                                var2 &= -858191141;
                                var2 += -222613540;
                                var2 ^= -558016935;
                            } else {
                                var2 = switch (var2) {
                                    case -2095223416 -> {
                                        var2 ^= -2114702132;
                                        var2 >>>= 28;
                                        yield var2 ^ -1146786425;
                                    }
                                    default -> var2 ^ -1976679358;
                                    case 178051689 -> var2 ^ -1175024577;
                                };
                                int var92 = Arrays.binarySearch(var4, var1);
                                if (var92 >= 0) {
                                    var2 -= 1128032158;
                                    var2 <<= 13;
                                    var2 ^= -398120188;
                                    float[] var121 = this.Zs;
                                    var6 = var3 + 1;
                                    var6 = var3 * var6;
                                    int var158 = var3 + 2;
                                    var6 *= var158;
                                    int var159 = var3 + 3;
                                    var6 *= var159;
                                    var6 &= 7;
                                    if (var6 == 0) {
                                        var2 += -614721913;
                                        var2 <<= 22;
                                        var2 += -2134289208;
                                        var2 ^= 167546287;
                                        long var143 = var2;
                                        long var166 = var143 + 1L;
                                        var166 = var143 * var166;
                                        long var170 = var143 + 2L;
                                        var166 *= var170;
                                        long var144 = var143 + 3L;
                                        var166 *= var144;
                                        long var145 = var166 & 7L;
                                        long var176;
                                        var6 = (var176 = var145 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                                        if (var6 == 0) {
                                            return var121[var92];
                                        }
                                        break label98;
                                    }

                                    var2 += -1157707871;
                                    var2 <<= 30;
                                    var2 ^= -328634819;
                                } else {
                                    var2 -= -1309977558;
                                    var2 -= 1697928880;
                                    var2 -= -350045935;
                                    var2 ^= -2133366881;
                                    int var93 = -var92;
                                    Integer var78 = var3;
                                    if (var78 != null) {
                                        var2 &= 1149284503;
                                        var2 ^= 1192324713;
                                        int var79 = var93 - 1;
                                        int var94 = var79 - 1;
                                        float[] var122 = this.nw;
                                        float var123 = var122[var94];
                                        float var124 = var1 - var123;
                                        float[] var147 = this.nw;
                                        float var148 = var147[var79];
                                        float[] var160 = this.nw;
                                        float var161 = var160[var94];
                                        float var149 = var148 - var161;
                                        float var125 = var124 / var149;
                                        float[] var150 = this.Zs;
                                        float var95 = var150[var94];
                                        float[] var151 = this.Zs;
                                        float var152 = var151[var79];
                                        Lv[] var162 = this.ah;
                                        Lv var80 = var162[var79];
                                        float var81 = var80.l(var125);
                                        return TP.GO(var95, var152, var81);
                                    }

                                    var2 &= -1490785279;
                                    var2 *= 1042502969;
                                    var2 >>>= 5;
                                    var2 ^= -1347308236;
                                }
                            }
                        }
                    } else {
                        var2 -= -735045961;
                        var2 ^= -2002857470;
                    }
                }
            } else {
                var2 *= -845605139;
                var2 |= -1742707055;
                var2 -= -1689155099;
                var2 &= 294822880;
                var2 ^= -1377185795;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                AssertionError var77 = new AssertionError();
                throw var77;
            }
        }

        AssertionError var76 = new AssertionError();
        throw var76;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -2076229730;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        LS = var4;
    }
}
