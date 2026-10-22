package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import dev.skidware.visuals.render.fx.ScreenEffects;
import dev.skidware.visuals.render.text.Wordmark;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class GO extends vS_2 {
    private static final int C = -6218981;
    private static final int Td = 1723868196;
    private Wordmark o;
    private boolean f;
    public static final int bq;

    public GO() {
    }

    @Override
    public float w() {
        int var1 = System.identityHashCode(this);
        return 3.4F;
    }

    @Override
    public float Vb() {
        int var1 = System.identityHashCode(this);
        return 4.6F;
    }

    @Override
    public String K() {
        int var1 = System.identityHashCode(this);
        return "death_souls";
    }

    @Override
    public void Az() {
        label40: {
            int var1 = bq;
            var1 ^= -1943562194;
            int var2 = System.identityHashCode(this);
            int var3 = (this.f ? 1 : 0);
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var54;
            int var49 = (var54 = var4 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
            if (var49 != 0) {
                switch (var1) {
                    case -850654873:
                        var1 ^= 669036779;
                        break;
                    case -164515463:
                    default:
                        var1 ^= 1953775063;
                        break;
                    case -56073647:
                        var1 *= 794984553;
                        var1 |= -987314242;
                        var1 -= 1065575934;
                        var1 ^= -669491562;
                }
            } else {
                var1 *= 300453027;
                var1 -= -1359374212;
                var1 |= -140396319;
                var1 >>= 23;
                var1 ^= 223624410;
                Integer var50 = var1;
                if (var50 == null) {
                    break label40;
                }

                if (var3 != 0) {
                    var1 &= 2008930363;
                    var1 -= -1507419589;
                    var1 -= -2081860682;
                    var1 ^= 919792125;
                    var3 = var1 + 1;
                    var3 = var1 * var3;
                    var3 &= 1;
                    if (var3 == 0) {
                        return;
                    }
                    break label40;
                }

                var1 |= -1982929146;
                var1 ^= -2025040620;
                var1 += -1703123216;
                var1 >>= 22;
                var1 ^= -1673374884;
                Wordmark var44 = fF("you_died");
                this.o = var44;
                long var40 = var2;
                var4 = var40 + 1L;
                var4 = var40 * var4;
                long var41 = var4 & 1L;
                long var55;
                var2 = (var55 = var41 - 0L) == 0L ? 0 : (var55 < 0L ? -1 : 1);
                if (var2 == 0) {
                    var1 += 531430561;
                    var1 |= 1071209668;
                    var1 += -1888951203;
                    var1 -= -1352765866;
                    var1 ^= 2083525431;
                    Integer var43 = var1;
                    if (var43 != null) {
                        this.f = true;
                        return;
                    }
                    break label40;
                }

                var1 |= -45646556;
                var1 -= -1987471281;
                var1 *= 2041002313;
                var1 ^= -958656278;
            }

            IllegalStateException var29 = new IllegalStateException();
            throw var29;
        }

        IllegalArgumentException var39 = new IllegalArgumentException();
        throw var39;
    }

    @Override
    public void l(ScreenEffects var1, XK var2) {
        int var3 = bq;
        var3 ^= -1040381654;
        int var4 = System.identityHashCode(this);
        float var5 = var2.mz;
        float var6 = var2.i;
        var5 *= var6;
        float var74;
        int var46 = (var74 = var5 - 0.0F) == 0.0F ? 0 : (var74 < 0.0F ? -1 : 1);
        int var7 = var4 + 1;
        var7 = var4 * var7;
        int var8 = var4 + 2;
        var7 *= var8;
        var8 = var4 + 3;
        var7 *= var8;
        var7 &= 7;
        label38:
        if (var7 == 0) {
            var3 <<= 26;
            var3 ^= 1905801177;
            Integer var59 = var3;
            if (var59 != null) {
                if (var46 <= 0) {
                    var3 <<= 28;
                    var3 >>= 11;
                    var3 ^= 1161527921;
                    int var47 = var3 + 1;
                    int var48 = var3 * var47;
                    int var49 = var48 & 1;
                    if (var49 == 0) {
                        return;
                    }
                } else {
                    var3 >>= 18;
                    var3 |= -621397228;
                    var3 += -488580363;
                    var3 += -703222432;
                    var3 ^= 1917709116;
                    Lv var50 = sT_2.Jj;
                    float var60 = var2.jQ;
                    float var61 = qB(var60, 0.0F, 1.8F);
                    var6 = var50.l(var61);
                    var5 = var6 * var5;
                    var6 = 0.55F * var5;
                    var6 = 1.0F - var6;
                    var1.saturation(var6);
                    var6 = -0.24F * var5;
                    int var62 = var4 + 1;
                    var62 = var4 * var62;
                    var8 = var4 + 2;
                    var62 *= var8;
                    var4 += 3;
                    var62 *= var4;
                    var4 = var62 & 7;
                    if (var4 != 0) {
                        var3 >>>= 30;
                        var3 *= -2039299931;
                        var3 &= 2062005020;
                        var3 ^= -944277725;
                        break label38;
                    }

                    var3 *= -1515967175;
                    var3 <<= 12;
                    var3 ^= -40291341;
                    long var66 = var3;
                    long var9 = var66 + 1L;
                    var9 = var66 * var9;
                    long var11 = var66 + 2L;
                    var9 *= var11;
                    long var67 = var66 + 3L;
                    var9 *= var67;
                    long var68 = var9 & 7L;
                    long var75;
                    var4 = (var75 = var68 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        float var41 = 0.06F * var5;
                        var1.grade(0.0F, var6, 1.0F, ++var41);
                        float var43 = 0.6F * var5;
                        var1.vignette(var43, -16777216, 0.25F, 0.95F);
                        return;
                    }
                }
            }

            IllegalArgumentException var40 = new IllegalArgumentException();
            throw var40;
        } else {
            switch (var3) {
                case -1317866667:
                    var3 >>= 8;
                    var3 ^= 2094597773;
                    var3 ^= 1453261393;
                    break;
                case -358645394:
                    var3 ^= -803594281;
                    break;
                case 967737872:
                default:
                    var3 ^= 219243563;
            }
        }

        UnsupportedOperationException var36 = new UnsupportedOperationException();
        throw var36;
    }

    @Override
    public void XE(Canvas var1, XK var2) {
        label146: {
            int var3 = bq;
            var3 ^= -1234439370;
            int var4 = System.identityHashCode(this);
            this.Az();
            float var5 = var2.C;
            var5 *= 0.085F;
            var5 = TP.t(var5, 16.0F, 52.0F);
            float var6 = var2.dW;
            var6 *= 0.5F;
            float var7 = var5 * 2.1F;
            var7 = var2.Os(var7);
            Lv var8 = sT_2.Jj;
            float var9 = var2.jQ;
            var9 = qB(var9, 0.3F, 1.6F);
            float var117 = var8.l(var9);
            var9 = var2.dW;
            float var10 = var5 * 0.8F;
            float var11 = var5 * 1.15F;
            float var118 = 0.8F * var117;
            float var12 = var2.i;
            float var119 = var118 * var12;
            int var120 = DP.Y(-16777216, var119);
            int var212 = var4 + 1;
            int var213 = var4 * var212;
            int var214 = var213 & 1;
            if (var214 != 0) {
                var3 *= -401526749;
                var3 -= -433979204;
                var3 ^= -1367896483;
                var3 *= 1077257745;
                var3 ^= 2070203887;
            } else {
                label144: {
                    var3 <<= 7;
                    var3 &= -1348033434;
                    var3 += -965585258;
                    var3 ^= 123581123;
                    Integer var215 = var3;
                    if (var215 == null) {
                        break label146;
                    }

                    nS(var1, var9, var7, var10, var11, var120);
                    var8 = sT_2.Jj;
                    var9 = var2.jQ;
                    var9 = qB(var9, 0.55F, 1.8F);
                    float var122 = var8.l(var9);
                    float var234;
                    int var144 = (var234 = var122 - 0.0F) == 0.0F ? 0 : (var234 < 0.0F ? -1 : 1);
                    if (var144 > 0) {
                        var3 |= -1041276672;
                        var3 <<= 18;
                        var3 += -1919367973;
                        var3 ^= -433113468;
                        long var145 = var3;
                        long var192 = var145 + 1L;
                        long var193 = var145 * var192;
                        long var146 = var193 & 1L;
                        long var235;
                        int var147 = (var235 = var146 - 0L) == 0L ? 0 : (var235 < 0L ? -1 : 1);
                        if (var147 != 0) {
                            break label146;
                        }

                        var1.save();
                        var9 = var2.i;
                        int var177 = var4 + 1;
                        int var178 = var4 * var177;
                        int var179 = var178 & 1;
                        if (var179 != 0) {
                            var3 &= -1257707563;
                            var3 *= -1617242407;
                            var3 += 1414679190;
                            var3 ^= 820007886;
                            break label144;
                        }

                        var3 |= -1490552943;
                        var3 ^= -180476600;
                        var9 = var122 * var9;
                        var1.alpha(var9);
                        float var123 = 1.0F - var122;
                        float var124 = var123 * 5.0F;
                        var1.blur(var124);
                        float var125 = var2.jQ;
                        float var126 = -var125;
                        float var127 = var126 / 4.0F;
                        double var128 = var127;
                        double var129 = Math.exp(var128);
                        float var130 = (float)var129;
                        float var131 = 1.0F - var130;
                        float var132 = 0.09F * var131;
                        float var133 = 0.97F + var132;
                        var1.scale(var133, var6, var7);
                        TextStyle var134 = TextStyle.of(var5, -6218981);
                        TextStyle var135 = var134.shadow(1723868196, 0.0F, 0.42F);
                        Wordmark var150 = this.o;
                        if (var150 != null) {
                            var3 &= 2105743571;
                            var3 -= -409656968;
                            var3 ^= -829071475;
                            int var151 = var3 + 1;
                            int var152 = var3 * var151;
                            int var153 = var152 & 1;
                            if (var153 != 0) {
                                break label146;
                            }

                            Wordmark var154 = this.o;
                            var9 = var154.widthFor(var5);
                            Wordmark var180 = this.o;
                            var9 *= 0.5F;
                            long var194 = var4;
                            long var13 = var194 + 1L;
                            var13 = var194 * var13;
                            long var195 = var13 & 1L;
                            long var236;
                            int var196 = (var236 = var195 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                            if (var196 != 0) {
                                var3 |= -2114749352;
                                var3 *= 650403027;
                                var3 ^= -598584425;
                                break label144;
                            }

                            var3 &= -1720635330;
                            var3 += -1094376419;
                            var3 += -891690363;
                            var3 ^= 1401513273;
                            int var197 = var3 + 1;
                            int var198 = var3 * var197;
                            int var216 = var3 + 2;
                            int var199 = var198 * var216;
                            int var217 = var3 + 3;
                            int var200 = var199 * var217;
                            int var201 = var200 & 7;
                            if (var201 != 0) {
                                break label146;
                            }

                            var9 = var6 - var9;
                            var11 = var5 * 0.5F;
                            var11 = var7 - var11;
                            var1.wordmark(var180, var9, var11, var5, var135);
                            switch (var3) {
                                case -1888401145:
                                default:
                                    var3 ^= 1987029155;
                                    break;
                                case 639158064:
                                    var3 ^= 1335632926;
                                    break;
                                case 1233539969:
                                    var3 *= -1652921299;
                                    var3 &= -792954607;
                                    var3 &= 1469588523;
                                    var3 &= 34997232;
                                    var3 ^= -1767130182;
                            }
                        } else {
                            var3 <<= 6;
                            var3 ^= -686062005;
                            Integer var158 = var3;
                            if (var158 == null) {
                                break label146;
                            }

                            var9 = var5 * 1.35F;
                            TextStyle var136 = var135.size(var9);
                            Integer var160 = var4;
                            if (var160 == null) {
                                var3 -= -14803651;
                                var3 -= 632066938;
                                var3 ^= 1948455865;
                                break label144;
                            }

                            var3 <<= 28;
                            var3 ^= 994549492;
                            var3 *= -1121017937;
                            var3 |= 243677018;
                            var3 ^= -281087226;
                            int var161 = var3 + 1;
                            int var162 = var3 * var161;
                            int var163 = var162 & 1;
                            if (var163 != 0) {
                                break label146;
                            }

                            var9 = var5 * 0.12F;
                            TextStyle var137 = var136.spacing(var9);
                            var9 = var1.lineHeight(var137);
                            var9 *= 0.5F;
                            var9 = var7 - var9;
                            var9 = var1.textCentered("YOU DIED", var6, var9, var137);
                            switch (var3) {
                                case -2135309096:
                                    var3 ^= 1448430193;
                                    var3 += 1371287220;
                                    var3 &= 51163844;
                                    var3 ^= -1766650882;
                                    break;
                                case -1751844217:
                                    var3 ^= 50251577;
                                    break;
                                case 413210576:
                                default:
                                    var3 ^= 1000120530;
                            }
                        }

                        var1.restore();
                        var3 -= -1157977698;
                        var3 ^= 927776475;
                    } else {
                        switch (var3) {
                            case -1923771030:
                            default:
                                var3 ^= -434137228;
                                break;
                            case -1418728371:
                                var3 ^= 615291379;
                                break;
                            case -282376107:
                                var3 += -1285200179;
                                var3 -= 2058640144;
                                var3 &= 1504371429;
                                var3 ^= -318378809;
                        }
                    }

                    Integer var169 = var3;
                    if (var169 == null) {
                        break label146;
                    }

                    String var170 = var2.MZ;
                    boolean var171 = var170.isEmpty();
                    long var181 = var4;
                    long var218 = var181 + 1L;
                    long var219 = var181 * var218;
                    long var182 = var219 & 1L;
                    long var237;
                    int var183 = (var237 = var182 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                    if (var183 != 0) {
                        var3 += 1672419780;
                        var3 |= 235070300;
                        var3 -= 1488251490;
                        var3 ^= 1292803088;
                    } else {
                        label151: {
                            var3 = switch (var3) {
                                default -> var3 ^ -1645499600;
                                case -326259513 -> {
                                    var3 &= 1801454206;
                                    yield var3 ^ -1237819005;
                                }
                                case 1735508556 -> var3 ^ -839915513;
                            };
                            long var184 = var3;
                            long var220 = var184 + 1L;
                            long var221 = var184 * var220;
                            long var14 = var184 + 2L;
                            long var222 = var221 * var14;
                            long var185 = var184 + 3L;
                            long var223 = var222 * var185;
                            long var186 = var223 & 7L;
                            long var238;
                            int var187 = (var238 = var186 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                            if (var187 != 0) {
                                break label146;
                            }

                            if (!var171) {
                                var3 |= 2059380176;
                                var3 ^= -168317219;
                                var9 = var2.jQ;
                                var9 = qB(var9, 2.4F, 0.8F);
                                var10 = var2.i;
                                var9 *= var10;
                                var10 = var5 * 0.3F;
                                var10 = TP.t(var10, 7.0F, 12.0F);
                                var11 = 0.8F * var9;
                                int var205 = DP.Y(-4608354, var11);
                                TextStyle var191 = TextStyle.of(var10, var205);
                                long var206 = var4;
                                long var225 = var206 + 1L;
                                var225 = var206 * var225;
                                long var15 = var206 + 2L;
                                var225 *= var15;
                                long var207 = var206 + 3L;
                                var225 *= var207;
                                long var208 = var225 & 7L;
                                long var239;
                                var4 = (var239 = var208 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    switch (var3) {
                                        case -127602785:
                                        default:
                                            var3 ^= -1567455910;
                                            break label151;
                                        case 189287176:
                                            var3 -= -679988980;
                                            var3 ^= 2069330065;
                                            break label151;
                                        case 1883280976:
                                            var3 ^= -1409742402;
                                            break label151;
                                    }
                                }
                                var3 = switch (var3) {
                                    case -1425877796 -> var3 ^ 1510323841;
                                    default -> var3 ^ 524317691;
                                    case 189287176 -> {
                                        var3 *= 289039257;
                                        var3 >>>= 22;
                                        var3 |= 75909895;
                                        yield var3 ^ 1383590013;
                                    }
                                };
                                long var209 = var3;
                                var225 = var209 + 1L;
                                var225 = var209 * var225;
                                var15 = var209 + 2L;
                                var225 *= var15;
                                long var210 = var209 + 3L;
                                var225 *= var210;
                                long var211 = var225 & 7L;
                                long var240;
                                var4 = (var240 = var211 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label146;
                                }

                                TextStyle var93 = var191.spacing(0.6F);
                                var9 = 0.7F * var9;
                                int var176 = DP.Y(-16777216, var9);
                                TextStyle var94 = var93.shadow(var176, 0.6F, 0.15F);
                                String var95 = var2.MZ;
                                var5 *= 1.45F;
                                var5 = var7 + var5;
                                float var96 = var1.textCentered(var95, var6, var5, var94);
                                var3 -= -1054497856;
                                var3 -= -324941306;
                                var3 ^= 229107832;
                                var3 ^= 732410823;
                            } else {
                                var3 ^= 1854702208;
                                var3 &= 1029516574;
                                var3 *= -1572881165;
                                var3 ^= -1669584705;
                            }

                            long var79 = var3;
                            long var106 = var79 + 1L;
                            long var107 = var79 * var106;
                            long var116 = var79 + 2L;
                            long var108 = var107 * var116;
                            long var80 = var79 + 3L;
                            long var109 = var108 * var80;
                            long var81 = var109 & 7L;
                            long var241;
                            var3 = (var241 = var81 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                return;
                            }
                            break label146;
                        }
                    }
                }
            }

            long var97 = var3;
            long var111 = var97 + 1L;
            long var112 = var97 * var111;
            long var139 = var97 + 2L;
            long var113 = var112 * var139;
            long var98 = var97 + 3L;
            long var114 = var113 * var98;
            long var99 = var114 & 7L;
            long var242;
            var4 = (var242 = var99 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
            if (var4 == 0) {
                UnsupportedOperationException var101 = new UnsupportedOperationException();
                throw var101;
            }
        }

        IllegalArgumentException var90 = new IllegalArgumentException();
        throw var90;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -580590935;
        int var2 = vS_2.Ol;
        int var4 = of_2.ro(var3, var1, var2);
        bq = var4;
    }
}
