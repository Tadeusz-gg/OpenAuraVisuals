package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import dev.skidware.visuals.render.fx.ScreenEffects;
import dev.skidware.visuals.render.text.Wordmark;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class QK extends vS_2 {
    private static final int N = -3647400;
    private static final int Q = -15592942;
    private static final float Jy = 0.42F;
    private Wordmark B;
    private boolean cZ;
    public static final int PM;

    public QK() {
    }

    @Override
    public float w() {
        int var1 = System.identityHashCode(this);
        return 2.6F;
    }

    @Override
    public float Vb() {
        int var1 = System.identityHashCode(this);
        return 3.8F;
    }

    @Override
    public String K() {
        int var1 = System.identityHashCode(this);
        return "death_wasted";
    }

    @Override
    public void Az() {
        int var1 = PM;
        var1 ^= -478639071;
        int var2 = System.identityHashCode(this);
        int var3 = (this.cZ ? 1 : 0);
        Integer var4 = var2;
        label46:
        if (var4 != null) {
            var1 = switch (var1) {
                case -984197379 -> var1 ^ -1894435299;
                default -> var1 ^ -468171374;
                case 236710102 -> {
                    var1 *= -330992017;
                    var1 -= 118002939;
                    var1 >>= 17;
                    yield var1 ^ -91457976;
                }
            };
            int var40 = var1 + 1;
            var40 = var1 * var40;
            int var5 = var1 + 2;
            var40 *= var5;
            var5 = var1 + 3;
            var40 *= var5;
            var40 &= 7;
            if (var40 == 0) {
                if (var3 == 0) {
                    var1 = switch (var1) {
                        case -1765027789 -> var1 ^ 1801111389;
                        case 91457857 -> {
                            var1 += 1286259921;
                            var1 -= -700359099;
                            yield var1 ^ 1340487896;
                        }
                        default -> var1 ^ -1426040178;
                    };
                    Wordmark var39 = fF("wasted");
                    this.B = var39;
                    long var31 = var2;
                    long var45 = var31 + 1L;
                    long var46 = var31 * var45;
                    long var32 = var46 & 1L;
                    long var52;
                    var2 = (var52 = var32 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        var1 <<= 19;
                        var1 ^= 1085000916;
                        var1 ^= 927176701;
                        this.cZ = true;
                        return;
                    }

                    var1 >>= 15;
                    var1 += 1095185837;
                    var1 ^= 198674844;
                    break label46;
                }

                var1 ^= -889298038;
                var1 ^= -350963128;
                long var34 = var1;
                long var48 = var34 + 1L;
                long var49 = var34 * var48;
                long var7 = var34 + 2L;
                long var50 = var49 * var7;
                long var35 = var34 + 3L;
                long var51 = var50 * var35;
                long var36 = var51 & 7L;
                long var53;
                var3 = (var53 = var36 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                if (var3 == 0) {
                    return;
                }
            }

            UnsupportedOperationException var38 = new UnsupportedOperationException();
            throw var38;
        } else {
            switch (var1) {
                case -912144268:
                default:
                    var1 ^= 1701364806;
                    break;
                case 236710102:
                    var1 += 343462735;
                    var1 -= -1019404306;
                    var1 ^= 365398921;
                    break;
                case 891873594:
                    var1 ^= -1717756087;
            }
        }

        IllegalArgumentException var27 = new IllegalArgumentException();
        throw var27;
    }

    @Override
    public void l(ScreenEffects var1, XK var2) {
        label93: {
            int var52;
            label92: {
                var52 = PM;
                var52 ^= 869873092;
                int var4 = System.identityHashCode(this);
                float var5 = var2.mz;
                float var6 = var2.i;
                var5 *= var6;
                int var75 = var4 + 1;
                int var76 = var4 * var75;
                int var7 = var4 + 2;
                int var77 = var76 * var7;
                var7 = var4 + 3;
                int var78 = var77 * var7;
                int var79 = var78 & 7;
                if (var79 == 0) {
                    var52 |= -203292922;
                    var52 ^= -702475778;
                    float var126;
                    int var80 = (var126 = var5 - 0.0F) == 0.0F ? 0 : (var126 < 0.0F ? -1 : 1);
                    if (var80 <= 0) {
                        var52 -= 1030508647;
                        var52 -= 1862872600;
                        var52 ^= 601944506;
                        return;
                    }

                    var52 *= -2033673245;
                    var52 ^= -1103819645;
                    var52 ^= -934477941;
                    int var81 = var52 + 1;
                    int var82 = var52 * var81;
                    int var83 = var82 & 1;
                    if (var83 != 0) {
                        break label93;
                    }

                    Lv var84 = sT_2.aO;
                    float var93 = var2.jQ;
                    float var94 = qB(var93, 0.05F, 0.35F);
                    var6 = var84.l(var94);
                    Integer var95 = var4;
                    if (var95 == null) {
                        switch (var52) {
                            case -1673628750:
                                var52 ^= 188463767;
                                break;
                            case 415538227:
                                var52 |= 1227371688;
                                var52 *= -1915819571;
                                var52 >>= 20;
                                var52 -= -205689404;
                                var52 ^= 1119388737;
                                break;
                            case 1136534331:
                            default:
                                var52 ^= -1914935077;
                        }
                    } else {
                        var52 &= -641069452;
                        var52 >>>= 21;
                        var52 ^= 1642181359;
                        var95 = var52;
                        if (var95 == null) {
                            break label93;
                        }

                        var6 *= var5;
                        float var97 = 0.96F * var6;
                        float var98 = 1.0F - var97;
                        var1.saturation(var98);
                        float var99 = 0.05F * var6;
                        float var8 = 0.25F * var6;
                        var1.grade(0.0F, var99, 1.0F, ++var8);
                        var6 = 0.3F * var6;
                        var1.vignette(var6, -16777216, 0.5F, 1.05F);
                        var6 = var2.jQ;
                        var6 -= 0.42F;
                        float var127;
                        int var100 = (var127 = var6 - 0.0F) == 0.0F ? 0 : (var127 < 0.0F ? -1 : 1);
                        if (var100 < 0) {
                            var52 &= 1456643787;
                            var52 >>>= 14;
                            var52 ^= 2091142105;
                            break label92;
                        }
                        var52 = switch (var52) {
                            default -> var52 ^ -607054452;
                            case 273142460 -> var52 ^ -242117190;
                            case 1642181161 -> {
                                var52 *= 1255245671;
                                var52 -= -931294063;
                                var52 += -582926335;
                                yield var52 ^ 1384815286;
                            }
                        };
                        long var101 = var52;
                        long var9 = var101 + 1L;
                        var9 = var101 * var9;
                        long var102 = var9 & 1L;
                        long var128;
                        var100 = (var128 = var102 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
                        if (var100 != 0) {
                            break label93;
                        }

                        float var129;
                        var100 = (var129 = var6 - 0.35F) == 0.0F ? 0 : (var129 < 0.0F ? -1 : 1);
                        long var114 = var4;
                        long var10 = var114 + 1L;
                        var10 = var114 * var10;
                        long var115 = var10 & 1L;
                        long var130;
                        int var116 = (var130 = var115 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                        if (var116 != 0) {
                            var52 -= -1841509231;
                            var52 &= -2052975324;
                            var52 *= 1636624549;
                            var52 |= -1037517808;
                            var52 ^= -1207587096;
                        } else {
                            var52 += 1510642879;
                            var52 &= -1709465908;
                            var52 ^= -1353845641;
                            Integer var117 = var52;
                            if (var117 == null) {
                                break label93;
                            }

                            if (var100 >= 0) {
                                var52 -= -1468472435;
                                var52 -= 49168162;
                                var52 -= 1826743137;
                                var52 *= 1993720617;
                                var52 ^= 951390748;
                                break label92;
                            }

                            var52 ^= -123656151;
                            var52 |= -634902295;
                            var52 -= -297020298;
                            var52 >>>= 14;
                            var52 ^= -1001746000;
                            var100 = var52 + 1;
                            var100 = var52 * var100;
                            var100 &= 1;
                            if (var100 != 0) {
                                break label93;
                            }

                            var5 = 0.18F * var5;
                            var6 /= 0.35F;
                            var6 = 1.0F - var6;
                            long var108 = var4;
                            var9 = var108 + 1L;
                            var9 = var108 * var9;
                            long var109 = var9 & 1L;
                            long var131;
                            var4 = (var131 = var109 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                            if (var4 == 0) {
                                var52 += 354376185;
                                var52 *= 745736381;
                                var52 *= -1750079037;
                                var52 ^= -2063550157;
                                long var110 = var52;
                                var9 = var110 + 1L;
                                var9 = var110 * var9;
                                long var11 = var110 + 2L;
                                var9 *= var11;
                                long var111 = var110 + 3L;
                                var9 *= var111;
                                long var112 = var9 & 7L;
                                long var132;
                                var4 = (var132 = var112 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label93;
                                }

                                float var69 = var5 * var6;
                                var1.flash(var69, -1);
                                var52 ^= -517718912;
                                var52 -= 1155547196;
                                var52 ^= -1550846767;
                                break label92;
                            }

                            var52 >>= 16;
                            var52 *= -647911559;
                            var52 &= -116328395;
                            var52 ^= 1474982905;
                        }
                    }
                } else {
                    switch (var52) {
                        case -1737787457:
                            var52 ^= -271425633;
                            break;
                        case -558214861:
                            var52 -= 631969402;
                            var52 >>>= 20;
                            var52 ^= 1325013096;
                            break;
                        case 250708265:
                        default:
                            var52 ^= -847089948;
                    }
                }

                Integer var64 = var52;
                if (var64 != null) {
                    UnsupportedOperationException var66 = new UnsupportedOperationException();
                    throw var66;
                }
                break label93;
            }

            int var70 = var52 + 1;
            var70 = var52 * var70;
            var70 &= 1;
            if (var70 == 0) {
                return;
            }
        }

        IllegalArgumentException var65 = new IllegalArgumentException();
        throw var65;
    }

    @Override
    public void XE(Canvas var1, XK var2) {
        label133: {
            int var81;
            label141: {
                var81 = PM;
                var81 ^= -1888259044;
                int var4 = System.identityHashCode(this);
                float var5 = var2.jQ;
                var5 -= 0.42F;
                long var6 = var4;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                long var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var233;
                int var117 = (var233 = var6 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                if (var117 == 0) {
                    var81 ^= 371175188;
                    var81 &= -1519873726;
                    var81 ^= 481359214;
                    var81 ^= 1940022609;
                    int var118 = var81 + 1;
                    int var119 = var81 * var118;
                    int var7 = var81 + 2;
                    int var120 = var119 * var7;
                    var7 = var81 + 3;
                    int var121 = var120 * var7;
                    int var122 = var121 & 7;
                    if (var122 != 0) {
                        break label133;
                    }

                    float var234;
                    int var123 = (var234 = var5 - 0.0F) == 0.0F ? 0 : (var234 < 0.0F ? -1 : 1);
                    if (var123 < 0) {
                        var81 -= -1631409045;
                        var81 ^= 597335195;
                        return;
                    }

                    var81 -= -543474255;
                    var81 *= -709134567;
                    var81 *= 1447069091;
                    var81 ^= -1156123579;
                    var6 = var81;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var235;
                    int var127 = (var235 = var6 - 0L) == 0L ? 0 : (var235 < 0L ? -1 : 1);
                    if (var127 != 0) {
                        break label133;
                    }

                    this.Az();
                    float var128 = var2.C;
                    float var129 = var128 * 0.12F;
                    float var130 = TP.t(var129, 20.0F, 64.0F);
                    float var146 = var2.dW;
                    float var147 = var146 * 0.5F;
                    float var155 = var130 * 1.45F;
                    float var156 = var2.Os(var155);
                    Lv var9 = sT_2.aO;
                    float var178 = qB(var5, 0.0F, 0.2F);
                    float var158 = var9.l(var178);
                    float var179 = TP.GO(0.5F, 0.8F, var158);
                    float var180 = var130 * var179;
                    float var11 = var130 * 0.18F;
                    float var12 = var2.dW;
                    float var159 = 0.66F * var158;
                    float var13 = var2.i;
                    float var160 = var159 * var13;
                    int var161 = DP.Y(-15592942, var160);
                    nS(var1, var12, var156, var180, var11, var161);
                    var1.save();
                    float var162 = qB(var5, 0.0F, 0.08F);
                    var12 = var2.i;
                    float var163 = var162 * var12;
                    var1.alpha(var163);
                    var9 = sT_2.B;
                    var12 = qB(var5, 0.0F, 0.18F);
                    int var193 = var4 + 1;
                    int var194 = var4 * var193;
                    int var195 = var194 & 1;
                    label127:
                    if (var195 == 0) {
                        var81 = switch (var81) {
                            case -1391346687 -> {
                                var81 -= 70039133;
                                var81 &= -734313320;
                                var81 >>>= 6;
                                var81 *= 158995655;
                                yield var81 ^ -2015012200;
                            }
                            case -1035342952 -> var81 ^ -1111368316;
                            default -> var81 ^ 629785986;
                        };
                        int var196 = var81 + 1;
                        int var197 = var81 * var196;
                        int var198 = var197 & 1;
                        if (var198 != 0) {
                            break label133;
                        }

                        float var165 = var9.l(var12);
                        float var166 = TP.GO(1.6F, 1.0F, var165);
                        var1.scale(var166, var147, var156);
                        TextStyle var167 = TextStyle.of(var130, -3647400);
                        TextStyle var168 = var167.outline(-16777216, 0.09F);
                        var12 = var130 * 0.035F;
                        TextStyle var169 = var168.shadow(-1946157056, var12, 0.16F);
                        Wordmark var184 = this.B;
                        if (var184 != null) {
                            var81 ^= -1701244755;
                            var81 ^= 1529145811;
                            int var185 = var81 + 1;
                            int var186 = var81 * var185;
                            int var199 = var81 + 2;
                            int var187 = var186 * var199;
                            int var200 = var81 + 3;
                            int var188 = var187 * var200;
                            int var189 = var188 & 7;
                            if (var189 != 0) {
                                break label133;
                            }

                            Wordmark var190 = this.B;
                            var12 = var190.widthFor(var130);
                            Wordmark var201 = this.B;
                            float var14 = var12 * 0.5F;
                            var14 = var147 - var14;
                            Integer var15 = var4;
                            if (var15 == null) {
                                var81 &= 1447354427;
                                var81 >>= 5;
                                var81 <<= 11;
                                var81 ^= 486239714;
                                var81 ^= -80631453;
                                break label127;
                            }
                            var81 = switch (var81) {
                                default -> var81 ^ 269134483;
                                case 1341803988 -> var81 ^ -212481175;
                                case 1830072856 -> {
                                    var81 *= -2110872181;
                                    var81 &= 971262128;
                                    yield var81 ^ -855972159;
                                }
                            };
                            long var224 = var81;
                            long var17 = var224 + 1L;
                            var17 = var224 * var17;
                            long var19 = var224 + 2L;
                            var17 *= var19;
                            long var225 = var224 + 3L;
                            var17 *= var225;
                            long var226 = var17 & 7L;
                            long var236;
                            int var227 = (var236 = var226 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                            if (var227 != 0) {
                                break label133;
                            }

                            float var228 = var130 * 0.5F;
                            float var229 = var156 - var228;
                            var1.wordmark(var201, var14, var229, var130, var169);
                            var81 &= 1561100330;
                            var81 ^= -197758116;
                        } else {
                            var81 |= -896883024;
                            var81 ^= -1517919477;
                            var81 ^= -197199200;
                            Integer var202 = var81;
                            if (var202 == null) {
                                break label133;
                            }

                            var13 = var130 * 1.3F;
                            TextStyle var170 = var169.size(var13);
                            TextStyle var171 = var170.bold();
                            int var204 = var4 + 1;
                            int var205 = var4 * var204;
                            int var220 = var4 + 2;
                            int var206 = var205 * var220;
                            var220 = var4 + 3;
                            int var207 = var206 * var220;
                            int var208 = var207 & 7;
                            if (var208 != 0) {
                                var81 >>= 16;
                                var81 ^= 1801202364;
                                var81 &= 1731371520;
                                var81 ^= -490716031;
                                break label127;
                            }
                            var81 = switch (var81) {
                                case -1089243555 -> {
                                    var81 |= -681598598;
                                    yield var81 ^ -1109378777;
                                }
                                default -> var81 ^ -1036293111;
                                case 1745274099 -> var81 ^ 622886431;
                            };
                            Integer var209 = var81;
                            if (var209 == null) {
                                break label133;
                            }

                            var13 = var1.lineHeight(var171);
                            var13 *= 0.5F;
                            var13 = var156 - var13;
                            float var172 = var1.textCentered("wasted", var147, var13, var171);
                            var81 += -1041569079;
                            var81 |= -1868871154;
                            var81 ^= 763431027;
                        }

                        var1.restore();
                        String var173 = var2.MZ;
                        boolean var174 = var173.isEmpty();
                        int var213 = var4 + 1;
                        int var214 = var4 * var213;
                        int var222 = var4 + 2;
                        int var215 = var214 * var222;
                        var222 = var4 + 3;
                        int var216 = var215 * var222;
                        int var217 = var216 & 7;
                        if (var217 != 0) {
                            var81 += -466667791;
                            var81 ^= 2072571596;
                        } else {
                            var81 &= 1772254237;
                            var81 ^= -1432488961;
                            var81 += -1720132983;
                            var81 &= -937529276;
                            var81 ^= -821861384;
                            Integer var218 = var81;
                            if (var218 == null) {
                                break label133;
                            }

                            if (var174) {
                                var81 |= -40160235;
                                var81 ^= -584996734;
                                break label141;
                            }

                            var81 |= 1503030955;
                            var81 &= 1803518616;
                            var81 += 528610726;
                            var81 |= -1584838276;
                            var81 ^= -1767027409;
                            var5 = qB(var5, 0.5F, 0.4F);
                            float var175 = var2.i;
                            var5 *= var175;
                            float var108 = var130 * 0.22F;
                            float var109 = TP.t(var108, 7.0F, 12.0F);
                            float var131 = 0.85F * var5;
                            int var132 = DP.Y(-1250068, var131);
                            TextStyle var110 = TextStyle.of(var109, var132);
                            TextStyle var111 = var110.medium();
                            float var133 = 0.55F * var5;
                            int var134 = DP.Y(-16777216, var133);
                            TextStyle var112 = var111.shadow(var134, 0.6F, 0.12F);
                            int var135 = var4 + 1;
                            int var136 = var4 * var135;
                            int var176 = var4 + 2;
                            int var137 = var136 * var176;
                            var4 += 3;
                            int var138 = var137 * var4;
                            var4 = var138 & 7;
                            if (var4 == 0) {
                                var81 = switch (var81) {
                                    case -1204715254 -> var81 ^ 1765711752;
                                    default -> var81 ^ 552718723;
                                    case 2097460305 -> {
                                        var81 *= -1598596645;
                                        var81 += -63239904;
                                        var81 -= -14913849;
                                        var81 &= -243726067;
                                        yield var81 ^ 670683314;
                                    }
                                };
                                var4 = var81 + 1;
                                var4 = var81 * var4;
                                int var139 = var81 + 2;
                                var4 *= var139;
                                int var140 = var81 + 3;
                                var4 *= var140;
                                var4 &= 7;
                                if (var4 != 0) {
                                    break label133;
                                }

                                String var100 = var2.MZ;
                                float var141 = var156 + var180;
                                float var157 = var11 * 0.55F;
                                float var142 = var141 + var157;
                                float var101 = var1.textCentered(var100, var147, var142, var112);
                                var81 += 787352798;
                                var81 <<= 28;
                                var81 ^= 1656397631;
                                break label141;
                            }

                            var81 += 315044802;
                            var81 &= 225764762;
                            var81 &= -2069482443;
                            var81 ^= -488446831;
                        }
                    } else {
                        var81 += 936814340;
                        var81 += 949377491;
                        var81 &= -498181129;
                        var81 |= 1663268053;
                        var81 ^= -2054309804;
                    }
                } else {
                    switch (var81) {
                        case 883573493:
                            var81 ^= 1889161788;
                            break;
                        case 1645220075:
                            var81 *= -1588815835;
                            var81 += -638767680;
                            var81 ^= -2014452938;
                            break;
                        case 1948510131:
                        default:
                            var81 ^= 1401445737;
                    }
                }

                long var86 = var81;
                long var113 = var86 + 1L;
                long var114 = var86 * var113;
                long var87 = var114 & 1L;
                long var237;
                var81 = (var237 = var87 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                if (var81 == 0) {
                    RuntimeException var89 = new RuntimeException();
                    throw var89;
                }
                break label133;
            }

            long var102 = var81;
            long var143 = var102 + 1L;
            var143 = var102 * var143;
            var102 = var143 & 1L;
            long var238;
            int var104 = (var238 = var102 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
            if (var104 == 0) {
                return;
            }
        }

        RuntimeException var92 = new RuntimeException();
        throw var92;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -545849842;
        int var2 = vS_2.Ol;
        int var4 = of_2.ro(var3, var1, var2);
        PM = var4;
    }
}
