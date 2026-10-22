package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.List;

public final class Za {
    public static final Za FQ;
    private final hP_2[] Vm;
    private final boolean U;
    private final boolean s;
    public static final int e;

    private Za(List var1, boolean var2, boolean var3) {
        hP_2[] var4 = new hP_2[0];
        Object[] var5 = var1.toArray(var4);
        var4 = (hP_2[])var5;
        this.Vm = var4;
        this.U = var2;
        this.s = var3;
    }

    public static Za ls(List var0) {
        int var1 = e;
        var1 ^= 487757925;
        int var2 = System.identityHashCode(var0);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var32;
        var2 = (var32 = var20 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= -108051050;
            var1 <<= 7;
            var1 ^= -1480158074;
            long var22 = var1;
            var4 = var22 + 1L;
            var4 = var22 * var4;
            long var23 = var4 & 1L;
            long var33;
            var2 = (var33 = var23 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var2 == 0) {
                return new Za(var0, true, false);
            }
        } else {
            var1 *= -9997275;
            var1 &= -78166128;
            var1 ^= -146173163;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            }
        }

        IllegalStateException var16 = new IllegalStateException();
        throw var16;
    }

    public static Za F(String var0) {
        int var1 = e;
        var1 ^= -1869218479;
        int var2 = System.identityHashCode(var0);
        ArrayList var3 = new ArrayList();
        var3 = var3;
        int var4 = 1;
        String[] var5 = var0.split("\\R");
        var5 = var5;
        Integer var6 = var2;
        if (var6 == null) {
            var1 ^= -766036805;
            var1 -= 585825416;
            var1 *= 1565772951;
            var1 ^= 2011792055;
        } else {
            label223: {
                var1 -= -180765468;
                var1 ^= -70023279;
                int var169 = var1 + 1;
                var169 = var1 * var169;
                var169 &= 1;
                if (var169 == 0) {
                    var169 = var5.length;
                    var169 = var169;
                    int var7 = 0;
                    var4 = (var4 != 0) ? 1 : 0;
                    var7 = var7;
                    var1 &= -510801928;
                    var1 ^= -2101527919;
                    var1 *= 439497235;
                    var1 |= -244246375;
                    var1 ^= 2002647850;

                    label206:
                    while (true) {
                        Integer var8 = var1;
                        if (var8 == null) {
                            break;
                        }

                        if (var7 >= var169) {
                            var1 *= -918090837;
                            var1 >>= 25;
                            var1 &= 1328528263;
                            var1 += -1571684190;
                            var1 ^= -1272173616;

                            while (true) {
                                Integer var139 = var1;
                                if (var139 == null) {
                                    break label206;
                                }

                                var4 = var3.isEmpty() ? 1 : 0;
                                int var155 = var2 + 1;
                                int var156 = var2 * var155;
                                var169 = var2 + 2;
                                int var157 = var156 * var169;
                                var169 = var2 + 3;
                                int var158 = var157 * var169;
                                int var159 = var158 & 7;
                                if (var159 == 0) {
                                    var1 = switch (var1) {
                                        case -916421626 -> var1 ^ 595184827;
                                        default -> var1 ^ -1859106661;
                                        case 1169004537 -> {
                                            var1 <<= 23;
                                            yield var1 ^ 1671009466;
                                        }
                                    };
                                    if (var4 == 0) {
                                        var1 = switch (var1) {
                                            case -1625713478 -> {
                                                var1 ^= 604893741;
                                                var1 |= 80206546;
                                                var1 ^= -721223139;
                                                var1 -= 281604011;
                                                yield var1 ^ -1587593534;
                                            }
                                            case -1412262531 -> var1 ^ -217213999;
                                            default -> var1 ^ 1955086357;
                                        };
                                        long var141 = var1;
                                        long var176 = var141 + 1L;
                                        long var177 = var141 * var176;
                                        long var142 = var177 & 1L;
                                        long var275;
                                        var4 = (var275 = var142 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
                                        if (var4 != 0) {
                                            break label206;
                                        }

                                        int var144 = var3.size();
                                        Object var146 = var3.get(--var144);
                                        hP_2 var147 = (hP_2)var146;
                                        int var148 = var147.isBreak() ? 1 : 0;
                                        long var160 = var2;
                                        long var183 = var160 + 1L;
                                        long var184 = var160 * var183;
                                        long var161 = var184 & 1L;
                                        long var276;
                                        int var162 = (var276 = var161 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                                        if (var162 != 0) {
                                            switch (var1) {
                                                case -1343919320:
                                                default:
                                                    var1 ^= -1280146187;
                                                    break label223;
                                                case -980416114:
                                                    var1 ^= 1884035718;
                                                    break label223;
                                                case -78433315:
                                                    var1 *= -49499063;
                                                    var1 -= -1929082374;
                                                    var1 ^= -1296301208;
                                                    break label223;
                                            }
                                        }

                                        var1 += -1901120951;
                                        var1 >>= 10;
                                        var1 <<= 30;
                                        var1 ^= 601307617;
                                        int var163 = var1 + 1;
                                        int var164 = var1 * var163;
                                        var169 = var1 + 2;
                                        int var165 = var164 * var169;
                                        var169 = var1 + 3;
                                        int var166 = var165 * var169;
                                        int var167 = var166 & 7;
                                        if (var167 != 0) {
                                            break label206;
                                        }

                                        if (var148 != 0) {
                                            var1 ^= 1388500343;
                                            var1 ^= -2104594714;
                                            var148 = var3.size();
                                            var148--;
                                            Integer var168 = var2;
                                            if (var168 == null) {
                                                var1 -= 750775610;
                                                var1 |= 979452736;
                                                var1 ^= 2043637781;
                                                break label223;
                                            }

                                            var1 &= 2052084195;
                                            var1 += 2116853438;
                                            var1 &= -1291606131;
                                            var1 ^= -863226194;
                                            Object var151 = var3.remove(var148);
                                            var1 &= 1969333347;
                                            var1 ^= 833435611;
                                            continue;
                                        }

                                        var1 *= -2143558309;
                                        var1 *= 1998684521;
                                        var1 *= 426134175;
                                        var1 += 782813353;
                                        var1 ^= 868293936;
                                    } else {
                                        switch (var1) {
                                            case -1625713478:
                                                var1 |= 2050827375;
                                                var1 ^= -651418535;
                                                break;
                                            case -61653769:
                                            default:
                                                var1 ^= -1754992952;
                                                break;
                                            case 373772361:
                                                var1 ^= -693290914;
                                        }
                                    }

                                    long var152 = var1;
                                    long var180 = var152 + 1L;
                                    long var181 = var152 * var180;
                                    long var153 = var181 & 1L;
                                    long var277;
                                    var2 = (var277 = var153 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                                    if (var2 == 0) {
                                        return new Za(var3, false, false);
                                    }
                                    break label206;
                                }

                                var1 -= 722888622;
                                var1 |= -1445680032;
                                var1 |= 356906546;
                                var1 ^= 2028165400;
                                break label223;
                            }
                        }

                        var1 &= 1357544925;
                        var1 ^= 1819502387;
                        var1 -= 460074131;
                        var1 ^= 2130991710;
                        int var185 = var1 + 1;
                        var185 = var1 * var185;
                        var185 &= 1;
                        if (var185 != 0) {
                            break;
                        }

                        String var188 = var5[var7];
                        String var189 = var188.strip();
                        long var9 = var2;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var278;
                        int var200 = (var278 = var9 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
                        if (var200 != 0) {
                            var1 |= 506083237;
                            var1 *= 2035493297;
                            var1 ^= -926447098;
                            break label223;
                        }

                        var1 |= -1454373074;
                        var1 |= 2131012450;
                        var1 *= -304248671;
                        var1 ^= 1216854754;
                        boolean var201 = var189.isEmpty();
                        boolean var215;
                        if (var201) {
                            var1 <<= 13;
                            var1 ^= -2031972392;
                            var1 ^= -1823838665;
                            var9 = var1;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var279;
                            int var205 = (var279 = var9 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                            if (var205 != 0) {
                                break;
                            }

                            if (var4 == 0) {
                                var1 >>>= 2;
                                var1 *= -1420462907;
                                var1 *= -560664649;
                                var1 ^= -8581974;
                                int var206 = var1 + 1;
                                int var207 = var1 * var206;
                                int var208 = var207 & 1;
                                if (var208 != 0) {
                                    break;
                                }

                                hP_2 var209 = new hP_2(-1L, "");
                                int var10 = var2 + 1;
                                var10 = var2 * var10;
                                int var252 = var2 + 2;
                                var10 *= var252;
                                int var253 = var2 + 3;
                                var10 *= var253;
                                var10 &= 7;
                                if (var10 != 0) {
                                    switch (var1) {
                                        case -1783557616:
                                            var1 ^= 1107140539;
                                            break label223;
                                        case 218779480:
                                        default:
                                            var1 ^= 1897166232;
                                            break label223;
                                        case 253455051:
                                            var1 &= 1858919900;
                                            var1 ^= -1042227360;
                                            var1 += -1889940485;
                                            var1 *= 390261909;
                                            var1 ^= 1035003580;
                                            break label223;
                                    }
                                }
                                var1 = switch (var1) {
                                    case 253455051 -> {
                                        var1 |= 597754059;
                                        var1 |= -801363608;
                                        yield var1 ^ 1364907478;
                                    }
                                    default -> var1 ^ -718912096;
                                    case 2072428149 -> var1 ^ -1244886032;
                                };
                                var10 = var1 + 1;
                                var10 = var1 * var10;
                                int var254 = var1 + 2;
                                var10 *= var254;
                                int var255 = var1 + 3;
                                var10 *= var255;
                                var10 &= 7;
                                if (var10 != 0) {
                                    break;
                                }

                                boolean var210 = var3.add(var209);
                                var1 += 1116929482;
                                var1 ^= 679533243;
                                var1 += 1976276215;
                                var1 ^= -1554654796;
                            } else {
                                var1 >>>= 26;
                                var1 *= 840297227;
                                var1 -= 976661460;
                                var1 |= -1849055868;
                                var1 ^= 1969852387;
                            }

                            int var211 = var1 + 1;
                            int var212 = var1 * var211;
                            int var213 = var212 & 1;
                            if (var213 != 0) {
                                break;
                            }

                            boolean var214 = true;
                            long var225 = var2;
                            long var12 = var225 + 1L;
                            var12 = var225 * var12;
                            var225 = var12 & 1L;
                            long var280;
                            int var227 = (var280 = var225 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                            if (var227 != 0) {
                                var1 *= -1944119413;
                                var1 -= -690045779;
                                var1 ^= 1892632685;
                                var1 ^= -1183403730;
                                break label223;
                            }

                            var1 |= -1286469633;
                            var1 *= 364269701;
                            var1 ^= -1828451614;
                            int var228 = var1 + 1;
                            int var229 = var1 * var228;
                            int var256 = var1 + 2;
                            int var230 = var229 * var256;
                            int var257 = var1 + 3;
                            int var231 = var230 * var257;
                            int var232 = var231 & 7;
                            if (var232 != 0) {
                                break;
                            }

                            var215 = var214;
                            switch (var1) {
                                case -1989160960:
                                default:
                                    var1 ^= 576228715;
                                    break;
                                case -1576501863:
                                    var1 &= -1194488582;
                                    var1 >>>= 27;
                                    var1 ^= -832938996;
                                    break;
                                case 1631400566:
                                    var1 ^= -1420150643;
                            }
                        } else {
                            var1 *= -594390221;
                            var1 >>= 24;
                            var1 ^= -356700027;
                            long var233 = var1;
                            long var261 = var233 + 1L;
                            var261 = var233 * var261;
                            var233 = var261 & 1L;
                            long var281;
                            int var235 = (var281 = var233 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                            if (var235 != 0) {
                                break;
                            }

                            hP_2 var236 = new hP_2(-1L, var189);
                            var185 = var2 + 1;
                            var185 = var2 * var185;
                            var185 &= 1;
                            if (var185 != 0) {
                                switch (var1) {
                                    case -356699941:
                                        var1 -= -499540731;
                                        var1 -= -1346725276;
                                        var1 ^= -1610850799;
                                        break label223;
                                    case -67848456:
                                        var1 ^= 128999775;
                                        break label223;
                                    case 850450194:
                                    default:
                                        var1 ^= -777762539;
                                        break label223;
                                }
                            }

                            var1 *= -759373399;
                            var1 ^= 637827880;
                            var11 = var1;
                            var13 = var11 + 1L;
                            var13 = var11 * var13;
                            var11 = var13 & 1L;
                            long var282;
                            var185 = (var282 = var11 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                            if (var185 != 0) {
                                break;
                            }

                            boolean var194 = var3.add(var236);
                            var194 = false;
                            var215 = var194;
                            var1 |= -622699785;
                            var1 ^= 901088999;
                        }

                        long var237 = var1;
                        long var263 = var237 + 1L;
                        var263 = var237 * var263;
                        long var14 = var237 + 2L;
                        var263 *= var14;
                        var237 += 3L;
                        var263 *= var237;
                        var237 = var263 & 7L;
                        long var283;
                        var185 = (var283 = var237 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                        if (var185 != 0) {
                            break;
                        }

                        var185 = var7 + 1;
                        var237 = var2;
                        var263 = var237 + 1L;
                        var263 = var237 * var263;
                        var14 = var237 + 2L;
                        var263 *= var14;
                        var237 += 3L;
                        var263 *= var237;
                        var237 = var263 & 7L;
                        long var284;
                        int var243 = (var284 = var237 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                        if (var243 != 0) {
                            var1 *= 1997512141;
                            var1 &= 1047194432;
                            var1 >>= 10;
                            var1 ^= -952553989;
                            break label223;
                        }
                        var1 = switch (var1) {
                            case -2120001397 -> var1 ^ 735574111;
                            case -832938984 -> {
                                var1 ^= 1590308500;
                                var1 |= -1200411628;
                                yield var1 ^ 62501169;
                            }
                            default -> var1 ^ -1377469161;
                        };
                        Integer var244 = var1;
                        if (var244 == null) {
                            break;
                        }

                        var4 = var215 ? 1 : 0;
                        var7 = var185;
                        var1 >>>= 29;
                        var1 ^= -2035416428;
                    }
                }

                IllegalStateException var136 = new IllegalStateException();
                throw var136;
            }
        }

        UnsupportedOperationException var134 = new UnsupportedOperationException();
        throw var134;
    }

    public boolean Gd() {
        int var1 = e;
        var1 ^= 1115737822;
        int var2 = System.identityHashCode(this);
        Integer var20 = var2;
        int var3 = of_2.p;
        var1 ^= var3;
        var1 ^= -1554133772;
        var3 = of_2.uY;
        var1 ^= var3;
        var1 ^= 803671914;
        if (var20 == null) {
            var1 -= 1709166936;
            var1 ^= -846168442;
            int var21 = var1 + 1;
            var21 = var1 * var21;
            var21 &= 1;
            if (var21 == 0) {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            }
        } else {
            var1 |= 1925429578;
            var1 ^= -182412965;
            var1 ^= 1036119379;
            var1 ^= -1382599314;
            long var16 = var1;
            long var26 = var16 + 1L;
            long var27 = var16 * var26;
            long var17 = var27 & 1L;
            long var28;
            var1 = (var28 = var17 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.U;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    public boolean RZ() {
        int var1 = e;
        var1 ^= 684547730;
        int var2 = System.identityHashCode(this);
        long var14 = var2;
        long var4 = var14 + 1L;
        var4 = var14 * var4;
        long var15 = var4 & 1L;
        long var26;
        var2 = (var26 = var15 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 436602032;
            var1 -= -765100563;
            var1 ^= -1981300270;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                AssertionError var23 = new AssertionError();
                throw var23;
            } else {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        } else {
            var1 -= -776853595;
            var1 -= 574156401;
            var1 += -754420764;
            var1 ^= 2056026022;
            return this.s;
        }
    }

    public int o() {
        int var1 = e;
        var1 ^= -181587677;
        int var2 = System.identityHashCode(this);
        long var13 = var2;
        long var4 = var13 + 1L;
        var4 = var13 * var4;
        long var14 = var4 & 1L;
        long var18;
        var2 = (var18 = var14 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 1352256945;
            var1 ^= -1830532496;
            UnsupportedOperationException var16 = new UnsupportedOperationException();
            throw var16;
        } else {
            var1 >>>= 16;
            var1 &= 436996559;
            var1 ^= 1889329564;
            hP_2[] var10 = this.Vm;
            return var10.length;
        }
    }

    public boolean O() {
        int var1 = e;
        var1 ^= -505259233;
        int var2 = System.identityHashCode(this);
        hP_2[] var3 = this.Vm;
        int var31 = var3.length;
        Integer var24 = var2;
        if (var24 != null) {
            var1 = switch (var1) {
                case 917072161 -> {
                    var1 += -31657899;
                    yield var1 ^ -1202057008;
                }
                default -> var1 ^ -302322823;
                case 1476213972 -> var1 ^ 1568120207;
            };
            var24 = var1;
            label38:
            if (var24 != null) {
                boolean var29;
                if (var31 == 0) {
                    var1 &= -558705694;
                    var1 -= 1673351768;
                    var1 ^= 901462502;
                    int var26 = var1 + 1;
                    var26 = var1 * var26;
                    var26 &= 1;
                    if (var26 != 0) {
                        break label38;
                    }

                    var29 = true;
                    switch (var1) {
                        case -2046819051:
                            var1 ^= 970039778;
                            break;
                        case -1298176322:
                        default:
                            var1 ^= -1086454263;
                            break;
                        case 493475500:
                            var1 ^= -900657325;
                            var1 &= -192143174;
                            var1 ^= 1418191640;
                    }
                } else {
                    var1 ^= -747366898;
                    var1 ^= 1192131929;
                    var29 = false;
                    var1 &= -810878380;
                    var1 ^= -2010267150;
                }

                long var32 = var1;
                long var5 = var32 + 1L;
                var5 = var32 * var5;
                long var7 = var32 + 2L;
                var5 *= var7;
                long var33 = var32 + 3L;
                var5 *= var33;
                long var34 = var5 & 7L;
                long var39;
                int var35 = (var39 = var34 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
                if (var35 == 0) {
                    return var29;
                }
            }

            UnsupportedOperationException var30 = new UnsupportedOperationException();
            throw var30;
        } else {
            var1 <<= 18;
            var1 ^= -1941642556;
            UnsupportedOperationException var12 = new UnsupportedOperationException();
            throw var12;
        }
    }

    public hP_2 VP(int var1) {
        int var2 = e;
        var2 ^= -13352167;
        int var4 = System.identityHashCode(this);
        hP_2[] var5 = this.Vm;
        int var6 = var4 + 1;
        var6 = var4 * var6;
        var4 = var6 & 1;
        if (var4 != 0) {
            var2 &= -389166739;
            var2 |= 541479538;
            var2 += 2096894559;
            var2 |= -1926648532;
            var2 ^= -858700549;
            Integer var3 = var1;
            if (var3 == null) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            } else {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        } else {
            var2 += -540744301;
            var2 += 569517988;
            var2 <<= 27;
            var2 -= 266177248;
            var2 ^= -859007467;
            return var5[var1];
        }
    }

    public int Q(long var1) {
        int var3 = e;
        var3 ^= 1716930300;
        int var4 = System.identityHashCode(this);
        long var5 = var4;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var253;
        int var128 = (var253 = var5 - 0L) == 0L ? 0 : (var253 < 0L ? -1 : 1);
        label181:
        if (var128 == 0) {
            var3 = switch (var3) {
                case -1323469630 -> {
                    var3 &= 2042610813;
                    yield var3 ^ 977944972;
                }
                default -> var3 ^ 407357333;
                case 949913758 -> var3 ^ 1146331825;
            };
            Integer var129 = var3;
            label177:
            if (var129 != null) {
                boolean var130 = this.U;
                if (var130) {
                    var3 &= 1431498995;
                    var3 >>= 1;
                    var3 ^= 717630135;
                    hP_2[] var131 = this.Vm;
                    int var6 = var4 + 1;
                    var6 = var4 * var6;
                    int var172 = var4 + 2;
                    var6 *= var172;
                    int var173 = var4 + 3;
                    var6 *= var173;
                    var6 &= 7;
                    if (var6 != 0) {
                        var3 += 1871715802;
                        var3 &= -1206520390;
                        var3 &= -1728590080;
                        var3 ^= 1450739839;
                        break label181;
                    }

                    var3 &= 1073728044;
                    var3 ^= -518038360;
                    int var132 = var131.length;
                    if (var132 != 0) {
                        var3 = switch (var3) {
                            case -881830228 -> {
                                var3 &= -1931075435;
                                var3 &= -267185959;
                                var3 |= 1270728863;
                                var3 += -569590219;
                                yield var3 ^ 1489707088;
                            }
                            default -> var3 ^ 1193424710;
                            case 1000327202 -> var3 ^ 1745999649;
                        };
                        int var133 = var3 + 1;
                        int var134 = var3 * var133;
                        var6 = var3 + 2;
                        int var135 = var134 * var6;
                        var6 = var3 + 3;
                        int var136 = var135 * var6;
                        int var137 = var136 & 7;
                        if (var137 != 0) {
                            break label177;
                        }

                        hP_2[] var138 = this.Vm;
                        hP_2 var139 = var138[0];
                        long var155 = var4;
                        long var8 = var155 + 1L;
                        var8 = var155 * var8;
                        long var156 = var8 & 1L;
                        long var254;
                        var6 = (var254 = var156 - 0L) == 0L ? 0 : (var254 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            var3 -= 1843211184;
                            var3 *= -1977209997;
                            var3 ^= 1125187907;
                            break label181;
                        }

                        var3 *= 529808659;
                        var3 -= 1358733402;
                        var3 += -1838294270;
                        var3 <<= 21;
                        var3 ^= 1265065902;
                        long var158 = var3;
                        var8 = var158 + 1L;
                        var8 = var158 * var8;
                        long var159 = var8 & 1L;
                        long var255;
                        var6 = (var255 = var159 - 0L) == 0L ? 0 : (var255 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label177;
                        }

                        var5 = var139.startMs();
                        long var256;
                        int var141 = (var256 = var1 - var5) == 0L ? 0 : (var256 < 0L ? -1 : 1);
                        if (var141 >= 0) {
                            var3 &= -451569466;
                            var3 |= -687266392;
                            var3 ^= 439208836;
                            int var142 = var3 + 1;
                            int var143 = var3 * var142;
                            var6 = var3 + 2;
                            int var144 = var143 * var6;
                            var6 = var3 + 3;
                            int var145 = var144 * var6;
                            int var146 = var145 & 7;
                            if (var146 != 0) {
                                break label177;
                            }

                            byte var147 = 0;
                            hP_2[] var163 = this.Vm;
                            var6 = var163.length;
                            var6--;
                            var7 = var4;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var257;
                            int var177 = (var257 = var7 - 0L) == 0L ? 0 : (var257 < 0L ? -1 : 1);
                            if (var177 != 0) {
                                var3 &= 1603805379;
                                var3 ^= -2020074623;
                                var3 += 1089563648;
                                var3 >>= 10;
                                var3 ^= -831575530;
                                break label181;
                            }

                            var3 += 788475846;
                            var3 <<= 19;
                            var3 >>= 7;
                            var3 ^= 1589125799;
                            var7 = var3;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var258;
                            int var181 = (var258 = var7 - 0L) == 0L ? 0 : (var258 < 0L ? -1 : 1);
                            if (var181 != 0) {
                                break label177;
                            }

                            int var148 = var147;
                            var6 = var6;
                            var3 <<= 6;
                            var3 *= -1504196619;
                            var3 ^= -2111543681;

                            while (true) {
                                int var182 = var3 + 1;
                                int var183 = var3 * var182;
                                int var202 = var3 + 2;
                                int var184 = var183 * var202;
                                int var203 = var3 + 3;
                                int var185 = var184 * var203;
                                int var186 = var185 & 7;
                                if (var186 != 0) {
                                    break label177;
                                }

                                if (var148 >= var6) {
                                    var3 *= -641621913;
                                    var3 ^= 1221375547;
                                    return var148;
                                }

                                var3 += 302794088;
                                var3 ^= 1647439099;
                                Integer var187 = var3;
                                if (var187 == null) {
                                    break label177;
                                }

                                int var188 = var148 + var6;
                                Integer var204 = var4;
                                if (var204 == null) {
                                    var3 |= -1105772945;
                                    var3 |= -521116988;
                                    var3 ^= 832190080;
                                    break label181;
                                }
                                var3 = switch (var3) {
                                    case -2119950306 -> var3 ^ -881126067;
                                    default -> var3 ^ 1303747934;
                                    case -283708196 -> {
                                        var3 -= 1191755302;
                                        var3 &= -510959398;
                                        var3 ^= 527445468;
                                        yield var3 ^ 1051408377;
                                    }
                                };
                                int var190 = ++var188 >>> 1;
                                hP_2[] var205 = this.Vm;
                                hP_2 var206 = var205[var190];
                                var8 = var206.startMs();
                                long var259;
                                int var208 = (var259 = var8 - var1) == 0L ? 0 : (var259 < 0L ? -1 : 1);
                                int var212;
                                int var226;
                                if (var208 <= 0) {
                                    var3 ^= 1443568927;
                                    var3 += -918594402;
                                    var3 ^= 964893560;
                                    var3 += -803328426;
                                    var3 ^= 1633912892;
                                    var8 = var3;
                                    long var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var8 = var10 & 1L;
                                    long var260;
                                    int var211 = (var260 = var8 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                                    if (var211 != 0) {
                                        break label177;
                                    }

                                    var9 = var4;
                                    var11 = var9 + 1L;
                                    var11 = var9 * var11;
                                    long var13 = var9 + 2L;
                                    var11 *= var13;
                                    var9 += 3L;
                                    var11 *= var9;
                                    var9 = var11 & 7L;
                                    long var261;
                                    int var224 = (var261 = var9 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                                    if (var224 != 0) {
                                        switch (var3) {
                                            case -1085154682:
                                                var3 ^= -2127575384;
                                                break label181;
                                            case 165365160:
                                                var3 &= 1621090825;
                                                var3 -= 175377305;
                                                var3 ^= 944438288;
                                                break label181;
                                            case 851897630:
                                            default:
                                                var3 ^= -1927589371;
                                                break label181;
                                        }
                                    }

                                    var3 &= -1922901719;
                                    var3 ^= 453373325;
                                    Integer var225 = var3;
                                    if (var225 == null) {
                                        break label177;
                                    }

                                    var212 = var190;
                                    var226 = var6;
                                    var3 ^= 435276554;
                                    var3 += -726591942;
                                    var3 &= 260516720;
                                    var3 <<= 21;
                                    var3 ^= 215571618;
                                } else {
                                    var3 &= 996625807;
                                    var3 &= 350208883;
                                    var3 ^= -943990133;
                                    Integer var228 = var3;
                                    if (var228 == null) {
                                        break label177;
                                    }

                                    var190--;
                                    long var229 = var4;
                                    long var12 = var229 + 1L;
                                    var12 = var229 * var12;
                                    long var230 = var12 & 1L;
                                    long var262;
                                    int var231 = (var262 = var230 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                                    if (var231 != 0) {
                                        switch (var3) {
                                            case -1187412565:
                                                var3 ^= -506292385;
                                                break label181;
                                            case -939861368:
                                                var3 >>= 2;
                                                var3 |= 1393198243;
                                                var3 ^= -983168987;
                                                var3 ^= -118130951;
                                                break label181;
                                            case 647251950:
                                            default:
                                                var3 ^= 405773068;
                                                break label181;
                                        }
                                    }

                                    var3 >>>= 1;
                                    var3 += 1875130399;
                                    var3 ^= 1780719404;
                                    long var232 = var3;
                                    var12 = var232 + 1L;
                                    var12 = var232 * var12;
                                    long var14 = var232 + 2L;
                                    var12 *= var14;
                                    long var233 = var232 + 3L;
                                    var12 *= var233;
                                    long var234 = var12 & 7L;
                                    long var263;
                                    var231 = (var263 = var234 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                                    if (var231 != 0) {
                                        break label177;
                                    }

                                    var212 = var148;
                                    var226 = var190;
                                    switch (var3) {
                                        case -1176356273:
                                            var3 += -1902426350;
                                            var3 |= -1780752924;
                                            var3 |= -857559667;
                                            var3 |= 1894124853;
                                            var3 ^= -584670881;
                                            break;
                                        case 63118404:
                                        default:
                                            var3 ^= 1297089754;
                                            break;
                                        case 1679754778:
                                            var3 ^= -1179351642;
                                    }
                                }

                                var148 = var212;
                                var7 = var4;
                                long var236 = var7 + 1L;
                                var236 = var7 * var236;
                                long var252 = var7 + 2L;
                                var236 *= var252;
                                var7 += 3L;
                                var236 *= var7;
                                var7 = var236 & 7L;
                                long var264;
                                int var195 = (var264 = var7 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                                if (var195 != 0) {
                                    var3 |= 84912692;
                                    var3 ^= -113273787;
                                    var3 ^= 1708843782;
                                    var3 ^= 2002207114;
                                    break label181;
                                }

                                var3 *= 1608701323;
                                var3 += 1488484013;
                                var3 ^= -1872893010;
                                var7 = var3;
                                var236 = var7 + 1L;
                                var236 = var7 * var236;
                                var7 = var236 & 1L;
                                long var265;
                                int var198 = (var265 = var7 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                                if (var198 != 0) {
                                    break label177;
                                }

                                var6 = var226;
                                switch (var3) {
                                    case 756409582:
                                    default:
                                        var3 ^= 668107633;
                                        break;
                                    case 929191528:
                                        var3 ^= 683375533;
                                        break;
                                    case 2106156813:
                                        var3 <<= 1;
                                        var3 *= -1923938215;
                                        var3 ^= 2138219957;
                                }
                            }
                        }

                        var3 *= 1429530711;
                        var3 *= 1737899139;
                        var3 += -1110376420;
                        var3 &= 548825692;
                        var3 ^= 615737170;
                    } else {
                        var3 -= -285349623;
                        var3 -= -28206916;
                        var3 ^= -100166731;
                    }
                } else {
                    switch (var3) {
                        case -1889611761:
                        default:
                            var3 ^= -1555894418;
                            break;
                        case 190252492:
                            var3 += 392415938;
                            var3 -= 559502734;
                            var3 ^= 1898164041;
                            var3 ^= 1415942939;
                            break;
                        case 546294232:
                            var3 ^= 2051732007;
                    }
                }

                long var122 = var3;
                long var167 = var122 + 1L;
                var167 = var122 * var167;
                long var123 = var167 & 1L;
                long var266;
                var4 = (var266 = var123 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                if (var4 == 0) {
                    return -1;
                }
            }

            RuntimeException var125 = new RuntimeException();
            throw var125;
        } else {
            var3 <<= 31;
            var3 ^= -831666049;
        }

        AssertionError var118 = new AssertionError();
        throw var118;
    }

    public long c(int var1, long var2) {
        long var77 = 0L;
        label127: {
            int var4 = e;
            var4 ^= -134595425;
            int var6 = System.identityHashCode(this);
            int var7 = var6 + 1;
            var7 = var6 * var7;
            int var8 = var6 + 2;
            var7 *= var8;
            var8 = var6 + 3;
            var7 *= var8;
            var7 &= 7;
            if (var7 != 0) {
                switch (var4) {
                    case 106013499:
                        var4 ^= -1006273280;
                        break;
                    case 548474529:
                        var4 <<= 8;
                        var4 ^= -768575341;
                        break;
                    case 606840089:
                    default:
                        var4 ^= -1715629748;
                }
            } else {
                label138: {
                    label122: {
                        var4 &= -519474454;
                        var4 ^= 2127810850;
                        int var82 = (this.U ? 1 : 0);
                        if (var82 != 0) {
                            var4 |= -1910778318;
                            var4 ^= -1965235757;
                            var82 = var1 + 1;
                            var82 = var1 * var82;
                            var82 &= 1;
                            if (var82 != 0) {
                                break label127;
                            }

                            var82 = var1 + 1;
                            hP_2[] var98 = this.Vm;
                            var8 = var98.length;
                            long var9 = var6;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var128;
                            int var116 = (var128 = var9 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
                            if (var116 != 0) {
                                switch (var4) {
                                    case 95500515:
                                        var4 ^= -410856042;
                                        break label138;
                                    case 1174515828:
                                    default:
                                        var4 ^= -1529520980;
                                        break label138;
                                    case 1409758817:
                                        var4 += 1675559230;
                                        var4 ^= -723980788;
                                        break label138;
                                }
                            }

                            var4 += -257444023;
                            var4 &= 412671732;
                            var4 >>>= 15;
                            var4 ^= 553759091;
                            Integer var117 = var1;
                            if (var117 == null) {
                                break label127;
                            }

                            if (var82 < var8) {
                                var4 = switch (var4) {
                                    default -> var4 ^ -142126282;
                                    case 553758818 -> {
                                        var4 >>>= 28;
                                        var4 ^= 1652347829;
                                        yield var4 ^ 1759725007;
                                    }
                                    case 1047005426 -> var4 ^ 969322593;
                                };
                                Integer var87 = var1;
                                if (var87 == null) {
                                    break label127;
                                }

                                int var88 = var1 + 1;
                                long var100 = var6;
                                long var10 = var100 + 1L;
                                var10 = var100 * var10;
                                long var101 = var10 & 1L;
                                long var129;
                                var8 = (var129 = var101 - 0L) == 0L ? 0 : (var129 < 0L ? -1 : 1);
                                if (var8 != 0) {
                                    var4 |= 184252105;
                                    var4 ^= 1283015107;
                                    var4 ^= 632843945;
                                    break label138;
                                }
                                var4 = switch (var4) {
                                    case -946071198 -> var4 ^ -1610013757;
                                    case 178230904 -> {
                                        var4 |= -1184396541;
                                        var4 += -867708362;
                                        var4 -= -1059522930;
                                        yield var4 ^ 576301624;
                                    }
                                    default -> var4 ^ 1700828963;
                                };
                                long var103 = var1;
                                var10 = var103 + 1L;
                                var10 = var103 * var10;
                                long var104 = var10 & 1L;
                                long var130;
                                var8 = (var130 = var104 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                                if (var8 != 0) {
                                    break label127;
                                }

                                if (var88 >= 0) {
                                    var4 &= -1063672268;
                                    var4 &= 711873513;
                                    var4 |= 1098329797;
                                    var4 *= -1040338559;
                                    var4 ^= -891769629;
                                    var88 = var1 + 1;
                                    var88 = var1 * var88;
                                    var8 = var1 + 2;
                                    var88 *= var8;
                                    var8 = var1 + 3;
                                    var88 *= var8;
                                    var88 &= 7;
                                    if (var88 != 0) {
                                        break label127;
                                    }

                                    hP_2[] var94 = this.Vm;
                                    var8 = var1 + 1;
                                    hP_2 var95 = var94[var8];
                                    long var96 = var95.startMs();
                                    int var118 = var6 + 1;
                                    int var119 = var6 * var118;
                                    int var125 = var6 + 2;
                                    int var120 = var119 * var125;
                                    var6 += 3;
                                    int var121 = var120 * var6;
                                    var6 = var121 & 7;
                                    if (var6 != 0) {
                                        var4 ^= -1858024479;
                                        var4 |= 807043726;
                                        var4 -= -1741473513;
                                        var4 *= -62998835;
                                        var4 ^= -209806133;
                                        break label138;
                                    }
                                    var4 = switch (var4) {
                                        case -389191002 -> {
                                            var4 ^= -336449893;
                                            yield var4 ^ 93891420;
                                        }
                                        default -> var4 ^ 172138798;
                                        case 1753761932 -> var4 ^ -667937668;
                                    };
                                    var77 = var96;
                                    switch (var4) {
                                        case -1117014794:
                                            var4 ^= -2110012767;
                                            break label122;
                                        case 111669089:
                                            var4 += 540011460;
                                            var4 &= 777640890;
                                            var4 ^= 1956294376;
                                            break label122;
                                        case 2002034387:
                                        default:
                                            var4 ^= 1167520394;
                                            break label122;
                                    }
                                }

                                var4 &= -1647520475;
                                var4 ^= -1619080880;
                            } else {
                                var4 ^= -1985950220;
                                var4 <<= 17;
                                var4 ^= -514451375;
                            }
                        } else {
                            var4 -= -1885729070;
                            var4 |= -2110995189;
                            var4 -= 165975117;
                            var4 >>= 11;
                            var4 ^= -444419241;
                        }

                        Integer var109 = var1;
                        if (var109 == null) {
                            break label127;
                        }

                        var77 = var2;
                        switch (var4) {
                            case -1981441536:
                            default:
                                var4 ^= -882314644;
                                break;
                            case 444209233:
                                var4 += 1471617448;
                                var4 ^= 588949340;
                                var4 ^= 65069933;
                                break;
                            case 802241355:
                                var4 ^= 1337834722;
                        }
                    }

                    long var66 = var1;
                    long var110 = var66 + 1L;
                    long var111 = var66 * var110;
                    long var126 = var66 + 2L;
                    long var112 = var111 * var126;
                    long var67 = var66 + 3L;
                    long var113 = var112 * var67;
                    long var68 = var113 & 7L;
                    long var131;
                    var4 = (var131 = var68 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        return var77;
                    }
                    break label127;
                }
            }

            IllegalArgumentException var114 = new IllegalArgumentException();
            throw var114;
        }

        AssertionError var70 = new AssertionError();
        throw var70;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1167387291;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        e = var4;
        List var6 = List.of();
        Za var5 = new Za(var6, false, true);
        FQ = var5;
    }
}
