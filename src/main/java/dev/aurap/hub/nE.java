package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class nE {
    private String O;
    private String l;
    private float KB = -1.0F;
    private TextStyle gq;
    public static final int z;

    public nE() {
    }

    public String Mh(Canvas var1, String var2, TextStyle var3, float var4) {
        label183: {
            int var5 = z;
            var5 ^= 1475479486;
            int var6 = System.identityHashCode(this);
            long var7 = var6;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            var7 = var9 & 1L;
            long var222;
            int var131 = (var222 = var7 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
            int var8 = of_2.IX;
            var5 ^= var8;
            var5 ^= -922803453;
            of_2.IX = -922803453;
            var8 = of_2.pR;
            var5 ^= var8;
            var5 ^= 1005510479;
            of_2.pR = 1005510479;
            if (var131 != 0) {
                var5 <<= 9;
                var5 ^= 294132797;
            } else {
                label202: {
                    var5 = switch (var5) {
                        case -1915432780 -> {
                            var5 >>>= 3;
                            yield var5 ^ -1252310218;
                        }
                        default -> var5 ^ -1503091392;
                        case 1313759727 -> var5 ^ -1388961496;
                    };
                    Integer var132 = var5;
                    if (var132 == null) {
                        break label183;
                    }

                    String var133 = this.O;
                    boolean var134 = var2.equals(var133);
                    if (var134) {
                        var5 *= 1219629107;
                        var5 <<= 9;
                        var5 &= -1053540203;
                        var5 ^= 213915717;
                        var5 ^= 828672382;
                        int var135 = var5 + 1;
                        int var136 = var5 * var135;
                        var8 = var5 + 2;
                        int var137 = var136 * var8;
                        var8 = var5 + 3;
                        int var138 = var137 * var8;
                        int var139 = var138 & 7;
                        if (var139 != 0) {
                            break label183;
                        }

                        TextStyle var140 = this.gq;
                        Integer var162 = var6;
                        if (var162 == null) {
                            switch (var5) {
                                case -1113272005:
                                    var5 ^= -487127111;
                                    var5 >>= 31;
                                    var5 ^= -1205242819;
                                    break label202;
                                case -648499261:
                                    var5 ^= 783581265;
                                    break label202;
                                case 2124958508:
                                default:
                                    var5 ^= -2042228677;
                                    break label202;
                            }
                        }
                        var5 = switch (var5) {
                            default -> var5 ^ -1618026516;
                            case -1113272005 -> {
                                var5 *= -948054069;
                                yield var5 ^ 1615717893;
                            }
                            case 1429783386 -> var5 ^ 1012653802;
                        };
                        long var163 = var5;
                        long var10 = var163 + 1L;
                        var10 = var163 * var10;
                        long var12 = var163 + 2L;
                        var10 *= var12;
                        long var164 = var163 + 3L;
                        var10 *= var164;
                        long var165 = var10 & 7L;
                        long var223;
                        int var166 = (var223 = var165 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                        if (var166 != 0) {
                            break label183;
                        }

                        if (var3 == var140) {
                            var5 <<= 14;
                            var5 ^= -1481466999;
                            int var141 = var5 + 1;
                            int var142 = var5 * var141;
                            int var143 = var142 & 1;
                            if (var143 != 0) {
                                break label183;
                            }

                            float var144 = this.KB;
                            float var145 = var4 - var144;
                            float var146 = Math.abs(var145);
                            var166 = var6 + 1;
                            var166 = var6 * var166;
                            int var197 = var6 + 2;
                            var166 *= var197;
                            int var198 = var6 + 3;
                            var166 *= var198;
                            var166 &= 7;
                            if (var166 != 0) {
                                switch (var5) {
                                    case -2088658039:
                                        var5 ^= -1784971604;
                                        var5 >>= 2;
                                        var5 ^= -1112552076;
                                        break label202;
                                    case -439524272:
                                    default:
                                        var5 ^= -1838655465;
                                        break label202;
                                    case 1982610896:
                                        var5 ^= 1322783003;
                                        break label202;
                                }
                            }

                            var5 >>= 29;
                            var5 += -1535034850;
                            var5 += 1871885816;
                            var5 &= -1632700809;
                            var5 ^= -1900078583;
                            var166 = var5 + 1;
                            var166 = var5 * var166;
                            int var199 = var5 + 2;
                            var166 *= var199;
                            int var200 = var5 + 3;
                            var166 *= var200;
                            var166 &= 7;
                            if (var166 != 0) {
                                break label183;
                            }

                            float var224;
                            int var147 = (var224 = var146 - 0.25F) == 0.0F ? 0 : (var224 < 0.0F ? -1 : 1);
                            if (var147 < 0) {
                                var5 = switch (var5) {
                                    default -> var5 ^ 1356895242;
                                    case -1698829797 -> {
                                        var5 >>= 15;
                                        var5 |= 1819921493;
                                        var5 *= 1627358857;
                                        var5 *= -682575013;
                                        yield var5 ^ 72996057;
                                    }
                                    case -1278702760 -> var5 ^ -1709485241;
                                };
                                int var148 = var5 + 1;
                                int var149 = var5 * var148;
                                int var150 = var149 & 1;
                                if (var150 == 0) {
                                    return this.l;
                                }
                                break label183;
                            }

                            var5 *= 1690502929;
                            var5 >>= 17;
                            var5 |= -823794500;
                            var5 ^= -335106393;
                        } else {
                            var5 &= -1088171512;
                            var5 ^= -1765551791;
                        }
                    } else {
                        var5 &= 748711315;
                        var5 |= -2030860311;
                        var5 |= -1866440611;
                        var5 ^= -1810846044;
                    }

                    this.O = var2;
                    this.gq = var3;
                    this.KB = var4;
                    float var151 = var1.measure(var2, var3);
                    var8 = var6 + 1;
                    var8 = var6 * var8;
                    var8 &= 1;
                    if (var8 != 0) {
                        var5 |= 1426659370;
                        var5 ^= -809358010;
                    } else {
                        var5 -= -965761373;
                        var5 >>= 25;
                        var5 -= 433498285;
                        var5 ^= 1289161901;
                        var5 ^= -455321263;
                        float var225;
                        int var152 = (var225 = var151 - var4) == 0.0F ? 0 : (var225 < 0.0F ? -1 : 1);
                        if (var152 <= 0) {
                            Integer var158 = switch (var5) {
                                case 732789280 -> var5 ^ -845465018;
                                default -> var5 ^ 1935639126;
                                case 1310851709 -> {
                                    var5 -= -22695743;
                                    var5 ^= 313061023;
                                    var5 *= 2134754711;
                                    yield var5 ^ -400469047;
                                }
                            };
                            if (var158 != null) {
                                this.l = var2;
                                return var2;
                            }
                            break label183;
                        }
                        var5 = switch (var5) {
                            default -> var5 ^ 648372641;
                            case 955986964 -> var5 ^ -922600536;
                            case 1310851709 -> {
                                var5 += -1605802051;
                                var5 -= 2088236274;
                                yield var5 ^ -1834018931;
                            }
                        };
                        int var153 = var2.length();
                        Integer var180 = var6;
                        if (var180 == null) {
                            var5 ^= 2048610434;
                            var5 *= 1309566697;
                            var5 *= -1712570553;
                            var5 ^= 1465570596;
                        } else {
                            var5 += -1448453685;
                            var5 &= 1460778916;
                            var5 ^= -227627165;
                            int var154 = var153;
                            var5 *= 1766747923;
                            var5 ^= 1938276189;
                            var5 &= -1163233288;
                            var5 ^= 412386224;

                            label163:
                            while (true) {
                                int var181 = var5 + 1;
                                var181 = var5 * var181;
                                int var201 = var5 + 2;
                                var181 *= var201;
                                int var202 = var5 + 3;
                                var181 *= var202;
                                var181 &= 7;
                                if (var181 != 0) {
                                    break label183;
                                }

                                if (var154 > 1) {
                                    var5 ^= -2085544139;
                                    var5 >>= 24;
                                    var5 ^= -979449604;
                                    String var186 = var2.substring(0, var154);
                                    String var187 = var186 + "…";
                                    int var203 = var6 + 1;
                                    int var204 = var6 * var203;
                                    int var205 = var204 & 1;
                                    if (var205 != 0) {
                                        switch (var5) {
                                            case -1006069171:
                                            default:
                                                var5 ^= -298064208;
                                                break label163;
                                            case -979449627:
                                                var5 |= 340857142;
                                                var5 ^= 1844882890;
                                                break label163;
                                            case 351832320:
                                                var5 ^= -291767709;
                                                break label163;
                                        }
                                    }

                                    var5 += -1402865646;
                                    var5 |= 50963216;
                                    var5 ^= 1207858789;
                                    int var206 = var5 + 1;
                                    int var207 = var5 * var206;
                                    int var218 = var5 + 2;
                                    int var208 = var207 * var218;
                                    var218 = var5 + 3;
                                    int var209 = var208 * var218;
                                    int var210 = var209 & 7;
                                    if (var210 != 0) {
                                        break label183;
                                    }

                                    float var188 = var1.measure(var187, var3);
                                    float var226;
                                    var181 = (var226 = var188 - var4) == 0.0F ? 0 : (var226 < 0.0F ? -1 : 1);
                                    if (var181 > 0) {
                                        var5 += -1692038894;
                                        var5 -= -1090345805;
                                        var5 += -296973352;
                                        var5 ^= 1719623554;
                                        var181 = var154 + -1;
                                        int var211 = var6 + 1;
                                        int var212 = var6 * var211;
                                        int var213 = var212 & 1;
                                        if (var213 != 0) {
                                            var5 &= -151536959;
                                            var5 -= -148976007;
                                            var5 -= 1270206998;
                                            var5 += 1581360428;
                                            var5 ^= 324299491;
                                            break;
                                        }

                                        var5 ^= -478692309;
                                        var5 += -312122908;
                                        var5 -= -88944510;
                                        var5 += -1436579476;
                                        var5 ^= -776257610;
                                        Integer var214 = var5;
                                        if (var214 == null) {
                                            break label183;
                                        }

                                        var154 = var181;
                                        var5 |= 836081588;
                                        var5 ^= 428015551;
                                        var5 >>= 15;
                                        var5 ^= 1707155150;
                                        continue;
                                    }

                                    var5 |= -333847578;
                                    var5 |= -1256213704;
                                    var5 ^= -1152262655;
                                } else {
                                    switch (var5) {
                                        case -1707163088:
                                            var5 &= -238160799;
                                            var5 += -1710290937;
                                            var5 *= 703984329;
                                            var5 ^= 1509305696;
                                            break;
                                        case -175897942:
                                            var5 ^= -1294905895;
                                            break;
                                        case 687566934:
                                        default:
                                            var5 ^= 1609124031;
                                    }
                                }

                                Integer var191 = var5;
                                if (var191 == null) {
                                    break label183;
                                }

                                String var155 = var2.substring(0, var154);
                                String var156 = var155.stripTrailing();
                                String var157 = var156 + "…";
                                long var192 = var6;
                                long var220 = var192 + 1L;
                                var220 = var192 * var220;
                                long var193 = var220 & 1L;
                                long var227;
                                var6 = (var227 = var193 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    var5 ^= 52893251;
                                    var5 ^= -941429650;
                                    var6 = var5 + 1;
                                    var6 = var5 * var6;
                                    int var194 = var5 + 2;
                                    var6 *= var194;
                                    var194 = var5 + 3;
                                    var6 *= var194;
                                    var6 &= 7;
                                    if (var6 == 0) {
                                        this.l = var157;
                                        return var157;
                                    }
                                    break label183;
                                }

                                var5 >>= 21;
                                var5 ^= -1205242360;
                                break;
                            }
                        }
                    }
                }
            }

            AssertionError var116 = new AssertionError();
            throw var116;
        }

        AssertionError var123 = new AssertionError();
        throw var123;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 940132982;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        z = var4;
    }
}
