package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import dev.skidware.visuals.render.fx.ScreenEffects;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class mF extends vS_2 {
    private static final String Q = "ELIMINATED";
    private static final String[] BT;
    private static final String ji = "BY";
    private static final int qG = -657414;
    public static final int RL;

    public mF() {
    }

    @Override
    public float w() {
        int var1 = System.identityHashCode(this);
        return 2.3F;
    }

    @Override
    public float Vb() {
        int var1 = System.identityHashCode(this);
        return 3.3F;
    }

    @Override
    public String K() {
        int var1 = System.identityHashCode(this);
        return "death_eliminated";
    }

    @Override
    public void l(ScreenEffects var1, XK var2) {
        label78: {
            int var3 = RL;
            var3 ^= 1202484663;
            int var4 = System.identityHashCode(this);
            float var5 = var2.mz;
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var112;
            int var68 = (var112 = var6 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
            if (var68 != 0) {
                var3 -= -965117299;
                var3 >>= 12;
                var3 <<= 19;
                var3 >>= 1;
                var3 ^= -1818050128;
            } else {
                var3 = switch (var3) {
                    case -1324574605 -> var3 ^ -1280218744;
                    default -> var3 ^ -862383760;
                    case 834587003 -> {
                        var3 |= -1546383569;
                        var3 ^= 194687796;
                        var3 &= -340853608;
                        yield var3 ^ 839473931;
                    }
                };
                Integer var69 = var3;
                if (var69 == null) {
                    break label78;
                }

                float var70 = var2.i;
                var5 *= var70;
                float var113;
                int var71 = (var113 = var5 - 0.0F) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
                if (var71 <= 0) {
                    var3 ^= 356688587;
                    var3 ^= 552470698;
                    var3 >>= 24;
                    var3 ^= -53456137;
                    var3 ^= -850414346;
                    int var83 = var3 + 1;
                    int var84 = var3 * var83;
                    int var85 = var84 & 1;
                    if (var85 == 0) {
                        return;
                    }
                    break label78;
                }

                var3 &= -905587103;
                var3 ^= -1658169338;
                var3 |= -1398019365;
                var3 *= -991415663;
                var3 ^= -1369249087;
                Lv var72 = sT_2.aO;
                int var7 = var4 + 1;
                var7 = var4 * var7;
                int var104 = var4 + 2;
                var7 *= var104;
                int var105 = var4 + 3;
                var7 *= var105;
                var7 &= 7;
                if (var7 != 0) {
                    var3 ^= -421621064;
                    var3 *= -312579725;
                    var3 ^= 1618023922;
                } else {
                    label77: {
                        var3 *= 1925824207;
                        var3 >>= 3;
                        var3 |= 1246653925;
                        var3 ^= -362182026;
                        float var90 = var2.jQ;
                        float var91 = qB(var90, 0.0F, 0.6F);
                        float var73 = var72.l(var91);
                        float var74 = var73 * var5;
                        float var92 = 0.72F * var74;
                        float var93 = 1.0F - var92;
                        var1.saturation(var93);
                        float var94 = -6.0F * var74;
                        float var106 = -0.12F * var74;
                        float var9 = 0.12F * var74;
                        var1.grade(var94, var106, 1.0F, ++var9);
                        float var75 = 0.38F * var74;
                        var1.vignette(var75, -16777216, 0.4F, 1.0F);
                        float var76 = var2.jQ;
                        float var114;
                        int var77 = (var114 = var76 - 0.12F) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
                        if (var77 < 0) {
                            var3 = switch (var3) {
                                case -1514736247 -> {
                                    var3 |= 1123571314;
                                    var3 += -1220359369;
                                    var3 &= -1029637408;
                                    var3 ^= 1686900819;
                                    yield var3 ^ -966744211;
                                }
                                case -580675638 -> var3 ^ -200937937;
                                default -> var3 ^ 1674163257;
                            };
                            Integer var78 = var3;
                            if (var78 == null) {
                                break label78;
                            }

                            float var79 = var2.jQ;
                            float var80 = var79 / 0.12F;
                            float var81 = 1.0F - var80;
                            float var82 = 0.12F * var81;
                            long var95 = var4;
                            long var108 = var95 + 1L;
                            long var109 = var95 * var108;
                            long var96 = var109 & 1L;
                            long var115;
                            var4 = (var115 = var96 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                            if (var4 != 0) {
                                var3 ^= -1365832809;
                                var3 -= 94624319;
                                var3 += 1257832923;
                                var3 ^= -1860016235;
                                break label77;
                            }

                            var3 *= -289719391;
                            var3 ^= -428417728;
                            long var97 = var3;
                            long var110 = var97 + 1L;
                            long var111 = var97 * var110;
                            long var98 = var111 & 1L;
                            long var116;
                            var4 = (var116 = var98 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                            if (var4 != 0) {
                                break label78;
                            }

                            float var58 = var82 * var5;
                            var1.flash(var58, -657414);
                            var3 *= 1204161405;
                            var3 ^= 227848250;
                        } else {
                            var3 <<= 24;
                            var3 += -988853941;
                            var3 -= 681694353;
                            var3 |= -581558984;
                            var3 ^= 763952806;
                        }

                        Integer var43 = var3;
                        if (var43 != null) {
                            return;
                        }
                        break label78;
                    }
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            int var99 = var3 + 2;
            var4 *= var99;
            var99 = var3 + 3;
            var4 *= var99;
            var4 &= 7;
            if (var4 == 0) {
                UnsupportedOperationException var64 = new UnsupportedOperationException();
                throw var64;
            }
        }

        IllegalStateException var55 = new IllegalStateException();
        throw var55;
    }

    @Override
    public void XE(Canvas var1, XK var2) {
        label163: {
            int var3 = RL;
            var3 ^= 881073070;
            int var4 = System.identityHashCode(this);
            float var5 = var2.dW;
            float var6 = var2.C;
            float var7 = var2.jQ;
            var7 = var7;
            var1.save();
            float var8 = var2.i;
            var1.alpha(var8);
            var8 = var6 * 0.1F;
            Lv var9 = sT_2.R;
            Integer var10 = var4;
            if (var10 != null) {
                var3 >>= 26;
                var3 ^= 1695046310;
                var3 ^= 1177564060;
                var3 |= -1792554475;
                var3 ^= -143545129;
                int var176 = var3 + 1;
                var176 = var3 * var176;
                int var11 = var3 + 2;
                var176 *= var11;
                var11 = var3 + 3;
                var176 *= var11;
                var176 &= 7;
                if (var176 != 0) {
                    break label163;
                }

                float var181 = qB(var7, 0.0F, 0.6F);
                float var151 = var9.l(var181);
                var8 *= var151;
                var1.rect(0.0F, 0.0F, var5, var8, -234881024);
                float var152 = var6 - var8;
                var1.rect(0.0F, var152, var5, var8, -234881024);
                var6 *= 0.075F;
                var6 = TP.t(var6, 15.0F, 44.0F);
                float var119 = var6;
                var5 *= 0.5F;
                var8 = var6 * 1.75F;
                var8 = var2.Os(var8);
                var9 = sT_2.R;
                float var182 = qB(var7, 0.3F, 1.1F);
                float var154 = var9.l(var182);
                float var155 = TP.GO(0.62F, 0.3F, var154);
                float var156 = var6 * var155;
                float var157 = var156;
                TextStyle var183 = TextStyle.of(var6, -657414);
                TextStyle var184 = var183.semibold();
                TextStyle var185 = var184.spacing(var156);
                var11 = DP.Y(-16777216, 0.5F);
                float var12 = var6 * 0.04F;
                TextStyle var186 = var185.shadow(var11, var12, 0.2F);
                TextStyle var187 = var186;
                float var194 = var1.measure("ELIMINATED", var186);
                var12 = var6 * 0.55F;
                var12 = var8 - var12;
                float var13 = var1.lineHeight(var186);
                var13 *= 0.5F;
                var12 -= var13;
                var12 = var12;
                var13 = var194 * 0.5F;
                var13 = var5 - var13;
                int var14 = 0;
                var13 = var13;
                var14 = var14;
                var3 ^= -324524679;
                var3 ^= 1891417582;
                var3 ^= 977157613;

                label160:
                while (true) {
                    long var15 = var3;
                    long var17 = var15 + 1L;
                    var17 = var15 * var17;
                    var15 = var17 & 1L;
                    long var288;
                    int var227 = (var288 = var15 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                    if (var227 != 0) {
                        break label163;
                    }

                    String[] var228 = BT;
                    long var16 = var4;
                    long var18 = var16 + 1L;
                    var18 = var16 * var18;
                    var16 = var18 & 1L;
                    long var289;
                    int var234 = (var289 = var16 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                    if (var234 != 0) {
                        switch (var3) {
                            case -658038117:
                                var3 ^= 667465618;
                                break label160;
                            case -429596014:
                                var3 |= -1788597462;
                                var3 &= 635747414;
                                var3 &= 649209776;
                                var3 ^= 223165301;
                                break label160;
                            case 1250629007:
                            default:
                                var3 ^= -1595808160;
                                break label160;
                        }
                    }

                    var3 ^= -2081746684;
                    var3 += 323482552;
                    var3 ^= -171092874;
                    int var235 = var3 + 1;
                    int var236 = var3 * var235;
                    int var237 = var236 & 1;
                    if (var237 != 0) {
                        break label163;
                    }

                    int var229 = var228.length;
                    if (var14 >= var229) {
                        var3 = switch (var3) {
                            case -2021497801 -> var3 ^ -2134102927;
                            case -1927630024 -> {
                                var3 += -1385287307;
                                var3 -= -38653356;
                                var3 += 1390220676;
                                var3 <<= 14;
                                yield var3 ^ -1695750759;
                            }
                            default -> var3 ^ 1203544526;
                        };
                        long var158 = var3;
                        long var209 = var158 + 1L;
                        long var210 = var158 * var209;
                        var17 = var158 + 2L;
                        long var211 = var210 * var17;
                        long var159 = var158 + 3L;
                        long var212 = var211 * var159;
                        long var160 = var212 & 7L;
                        long var290;
                        int var161 = (var290 = var160 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                        if (var161 != 0) {
                            break label163;
                        }

                        float var162 = var119 * 0.32F;
                        var8 += var162;
                        Integer var163 = var4;
                        if (var163 == null) {
                            var3 &= -505408050;
                            var3 |= 90782195;
                            var3 >>>= 2;
                            var3 ^= 808932379;
                        } else {
                            var3 += -1925282918;
                            var3 += -1762280369;
                            var3 += -212501190;
                            var3 ^= 1575578121;
                            long var164 = var3;
                            long var213 = var164 + 1L;
                            long var214 = var164 * var213;
                            var17 = var164 + 2L;
                            long var215 = var214 * var17;
                            long var165 = var164 + 3L;
                            long var216 = var215 * var165;
                            long var166 = var216 & 7L;
                            long var291;
                            int var167 = (var291 = var166 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                            if (var167 != 0) {
                                break label163;
                            }

                            var9 = sT_2.R;
                            var7 = qB(var7, 0.15F, 0.6F);
                            var7 = var9.l(var7);
                            float var127 = var194 * 0.5F;
                            float var169 = var119 * 0.8F;
                            float var128 = var127 + var169;
                            var7 = var128 * var7;
                            float var292;
                            int var130 = (var292 = var7 - 0.5F) == 0.0F ? 0 : (var292 < 0.0F ? -1 : 1);
                            if (var130 > 0) {
                                var3 *= 1526381117;
                                var3 ^= 555716868;
                                var3 *= -1740640029;
                                var3 ^= 606736179;
                                var3 ^= 23044017;
                                float var131 = var5 - var7;
                                float var170 = var8 - 1.0F;
                                float var188 = var7 * 2.0F;
                                var11 = var2.K;
                                var11 = DP.Y(var11, 0.55F);
                                var1.shadow(var131, var170, var188, 2.0F, 1.0F, 7.0F, var11);
                                float var132 = var5 - var7;
                                float var171 = var8 - 0.5F;
                                float var189 = var7 * 2.0F;
                                var11 = DP.Y(-657414, 0.9F);
                                var1.rect(var132, var171, var189, 1.0F, var11);
                                var7 = var5 - var7;
                                var7--;
                                float var172 = var8 - 2.5F;
                                var176 = var2.K;
                                Integer var198 = var4;
                                if (var198 == null) {
                                    var3 |= -719949852;
                                    var3 >>>= 9;
                                    var3 -= -1766098338;
                                    var3 ^= 1088313980;
                                    break;
                                }

                                var3 |= 1735028748;
                                var3 += -54589542;
                                var3 ^= 1946463869;
                                long var199 = var3;
                                long var221 = var199 + 1L;
                                long var222 = var199 * var221;
                                var17 = var199 + 2L;
                                long var223 = var222 * var17;
                                long var200 = var199 + 3L;
                                long var224 = var223 * var200;
                                long var201 = var224 & 7L;
                                long var293;
                                int var202 = (var293 = var201 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                                if (var202 != 0) {
                                    break label163;
                                }

                                var1.rect(var7, var172, 2.0F, 5.0F, var176);
                                var7 = var5 + var7;
                                var7--;
                                float var173 = var8 - 2.5F;
                                var176 = var2.K;
                                var1.rect(var7, var173, 2.0F, 5.0F, var176);
                                switch (var3) {
                                    case -1740722790:
                                        var3 ^= -13517872;
                                        var3 <<= 22;
                                        var3 ^= -1159654015;
                                        break;
                                    case -577063714:
                                        var3 ^= -1251015703;
                                        break;
                                    case -361268630:
                                    default:
                                        var3 ^= -1865243585;
                                }
                            } else {
                                var3 |= -1689404397;
                                var3 ^= -287400275;
                                var3 ^= 435304347;
                            }

                            long var174 = var3;
                            long var203 = var174 + 1L;
                            long var204 = var174 * var203;
                            long var175 = var204 & 1L;
                            long var294;
                            int var137 = (var294 = var175 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                            if (var137 != 0) {
                                break label163;
                            }

                            var7 = var119 * 0.45F;
                            var7 = var8 + var7;
                            int var145 = var3 + 1523205136;
                            int var146 = var145 + 1825229569;
                            int var147 = var146 | 405403289;
                            int var148 = var147 + 534998974;
                            int var149 = var148 ^ 2008075444;
                            vc(var1, var2, var5, var7, var119, var149);
                            long var105 = var4;
                            long var120 = var105 + 1L;
                            long var121 = var105 * var120;
                            long var150 = var105 + 2L;
                            long var122 = var121 * var150;
                            long var106 = var105 + 3L;
                            long var123 = var122 * var106;
                            long var107 = var123 & 7L;
                            long var295;
                            var4 = (var295 = var107 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                            if (var4 == 0) {
                                var3 >>= 30;
                                var3 += -1820619368;
                                var3 |= 684744020;
                                var3 &= -386595332;
                                var3 ^= -989431420;
                                var4 = var3 + 1;
                                var4 = var3 * var4;
                                int var115 = var3 + 2;
                                var4 *= var115;
                                int var116 = var3 + 3;
                                var4 *= var116;
                                var4 &= 7;
                                if (var4 == 0) {
                                    var1.restore();
                                    return;
                                }
                                break label163;
                            }

                            var3 *= 1898260021;
                            var3 ^= -125664560;
                        }
                        break;
                    }
                    var3 = switch (var3) {
                        case -1927630024 -> {
                            var3 *= -388337079;
                            var3 ^= -508742277;
                            var3 ^= -639462025;
                            yield var3 ^ -951511657;
                        }
                        default -> var3 ^ 1635030300;
                        case 1217901223 -> var3 ^ -460193022;
                    };
                    Lv var230 = sT_2.aO;
                    float var238 = var14;
                    var17 = var4;
                    long var19 = var17 + 1L;
                    var19 = var17 * var19;
                    long var21 = var17 + 2L;
                    var19 *= var21;
                    var17 += 3L;
                    var19 *= var17;
                    var17 = var19 & 7L;
                    long var296;
                    int var250 = (var296 = var17 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                    if (var250 != 0) {
                        var3 += 1086548741;
                        var3 ^= -390909683;
                        break;
                    }

                    var3 |= 787138164;
                    var3 ^= -199318134;
                    float var239 = var238 * 0.045F;
                    float var240 = 0.3F + var239;
                    float var241 = qB(var7, var240, 0.35F);
                    float var231 = var230.l(var241);
                    String[] var242 = BT;
                    String var243 = var242[var14];
                    float var244 = var1.measure(var243, var187);
                    float var297;
                    int var251 = (var297 = var231 - 0.0F) == 0.0F ? 0 : (var297 < 0.0F ? -1 : 1);
                    if (var251 > 0) {
                        var3 = switch (var3) {
                            default -> var3 ^ 1838070948;
                            case 593999898 -> var3 ^ -80722472;
                            case 1541692157 -> {
                                var3 >>>= 20;
                                yield var3 ^ 1270268862;
                            }
                        };
                        var1.save();
                        var1.alpha(var231);
                        float var252 = 1.0F - var231;
                        Integer var273 = var4;
                        if (var273 == null) {
                            var3 *= 862306195;
                            var3 ^= -591353499;
                            break;
                        }

                        var3 ^= -900780975;
                        var3 -= -333368566;
                        var3 |= -85006444;
                        var3 ^= 1179158209;
                        Integer var274 = var3;
                        if (var274 == null) {
                            break label163;
                        }

                        float var253 = var252 * 3.0F;
                        var1.blur(var253);
                        String[] var254 = BT;
                        String var255 = var254[var14];
                        float var275 = 1.0F - var231;
                        float var276 = var275 * var119;
                        float var277 = var276 * 0.35F;
                        float var278 = var12 + var277;
                        float var256 = var1.text(var255, var13, var278, var187);
                        var1.restore();
                        switch (var3) {
                            case -1179225834:
                                var3 &= 247433759;
                                var3 *= 67700291;
                                var3 |= 2121058364;
                                var3 ^= 577136560;
                                break;
                            case -80683657:
                            default:
                                var3 ^= 319602584;
                                break;
                            case 225432958:
                                var3 ^= -801552736;
                        }
                    } else {
                        var3 *= -967490815;
                        var3 >>>= 4;
                        var3 ^= -600705199;
                    }

                    var17 = var3;
                    var19 = var17 + 1L;
                    var19 = var17 * var19;
                    var21 = var17 + 2L;
                    var19 *= var21;
                    var17 += 3L;
                    var19 *= var17;
                    var17 = var19 & 7L;
                    long var298;
                    int var260 = (var298 = var17 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                    if (var260 != 0) {
                        break label163;
                    }

                    float var261 = var244 + var157;
                    float var262 = var13 + var261;
                    int var279 = var14 + 1;
                    var13 = var262;
                    int var263 = var4 + 1;
                    int var264 = var4 * var263;
                    int var265 = var264 & 1;
                    if (var265 != 0) {
                        switch (var3) {
                            case -639588655:
                            default:
                                var3 ^= 720474142;
                                break label160;
                            case -603279794:
                                var3 -= -517129402;
                                var3 ^= 1519330318;
                                var3 -= -1557330006;
                                var3 ^= -733457351;
                                break label160;
                            case 1849023020:
                                var3 ^= 1030234879;
                                break label160;
                        }
                    }

                    var3 ^= -1867063858;
                    var3 ^= 888645388;
                    int var266 = var3 + 1;
                    int var267 = var3 * var266;
                    int var268 = var267 & 1;
                    if (var268 != 0) {
                        break label163;
                    }

                    var14 = var279;
                    var3 |= -421890784;
                    var3 ^= -1614093021;
                    var3 ^= -2022313443;
                }
            } else {
                switch (var3) {
                    case -1684516842:
                        var3 ^= -1182917686;
                        break;
                    case 1104961068:
                    default:
                        var3 ^= -1179893231;
                        break;
                    case 1117169506:
                        var3 ^= 124132222;
                        var3 *= 834957139;
                        var3 ^= 1499478641;
                }
            }

            Integer var102 = var3;
            if (var102 != null) {
                UnsupportedOperationException var104 = new UnsupportedOperationException();
                throw var104;
            }
        }

        AssertionError var103 = new AssertionError();
        throw var103;
    }

    private static void vc(Canvas var0, XK var1, float var2, float var3, float var4, int var5) {
        label129: {
            label128: {
                int var7 = System.identityHashCode(var0);
                Integer var8 = var7;
                int var25;
                if (var8 != null) {
                    var25 = var5 * -534657437;
                    var25 -= 750601826;
                    var25 ^= -1856982398;
                    Lv var106 = sT_2.aO;
                    float var9 = var1.jQ;
                    var9 = qB(var9, 0.85F, 0.45F);
                    float var107 = var106.l(var9);
                    float var183;
                    int var119 = (var183 = var107 - 0.0F) == 0.0F ? 0 : (var183 < 0.0F ? -1 : 1);
                    if (var119 <= 0) {
                        switch (var25) {
                            case -619801657:
                                var25 |= 1915337639;
                                var25 <<= 31;
                                var25 ^= -503677789;
                                return;
                            case 1452544744:
                            default:
                                var25 ^= -1699384024;
                                return;
                            case 1825413583:
                                var25 ^= 1908334429;
                                return;
                        }
                    }

                    var25 += -1565988705;
                    var25 += -938791794;
                    var25 *= 102255273;
                    var25 ^= -992814423;
                    int var120 = var25 + 1;
                    int var121 = var25 * var120;
                    int var10 = var25 + 2;
                    int var122 = var121 * var10;
                    var10 = var25 + 3;
                    int var123 = var122 * var10;
                    int var124 = var123 & 7;
                    if (var124 != 0) {
                        break label129;
                    }

                    String var125 = var1.Ry;
                    boolean var126 = var125.isEmpty();
                    Integer var134 = var7;
                    if (var134 == null) {
                        var25 *= -683722423;
                        var25 |= 1869321954;
                        var25 += 2080923293;
                        var25 ^= 1518405080;
                    } else {
                        label140: {
                            var25 = switch (var25) {
                                case -2136869269 -> var25 ^ -1760330123;
                                case 636144573 -> {
                                    var25 <<= 29;
                                    var25 *= -1341431663;
                                    var25 *= -1820378437;
                                    var25 *= 894347701;
                                    yield var25 ^ -1336321271;
                                }
                                default -> var25 ^ 42115726;
                            };
                            int var135 = var25 + 1;
                            var135 = var25 * var135;
                            var135 &= 1;
                            if (var135 != 0) {
                                break label129;
                            }

                            if (var126) {
                                var25 -= 1466940223;
                                var25 ^= -1320003576;
                                String var127 = var1.MZ;
                                boolean var128 = var127.isEmpty();
                                var135 = var7 + 1;
                                var135 = var7 * var135;
                                var135 &= 1;
                                if (var135 != 0) {
                                    var25 |= -1069175526;
                                    var25 -= -1044433184;
                                    var25 &= -109441402;
                                    var25 ^= 784929758;
                                    break label140;
                                }
                                var25 = switch (var25) {
                                    case -1606126146 -> var25 ^ 306125674;
                                    case -910440510 -> {
                                        var25 &= -387945660;
                                        var25 >>= 22;
                                        var25 |= 139261332;
                                        yield var25 ^ -294187235;
                                    }
                                    default -> var25 ^ -262725612;
                                };
                                long var141 = var25;
                                long var12 = var141 + 1L;
                                var12 = var141 * var12;
                                long var142 = var12 & 1L;
                                long var184;
                                var135 = (var184 = var142 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                                if (var135 != 0) {
                                    break label129;
                                }

                                if (var128) {
                                    switch (var25) {
                                        case 294187179:
                                            var25 &= 406644740;
                                            var25 &= -968783601;
                                            var25 &= 979794437;
                                            var25 |= -1518172501;
                                            var25 ^= -998704632;
                                            return;
                                        case 580255178:
                                        default:
                                            var25 ^= 2127951117;
                                            return;
                                        case 1158023432:
                                            var25 ^= -1904018341;
                                            return;
                                    }
                                }

                                var25 |= 1865537988;
                                var25 ^= -232539157;
                            } else {
                                var25 -= -1914656185;
                                var25 ^= -807210298;
                            }

                            var9 = 1.0F - var107;
                            var9 *= var4;
                            var9 *= 0.25F;
                            Integer var144 = var7;
                            if (var144 != null) {
                                var25 += -204607684;
                                var25 *= -1182033265;
                                var25 *= 1626053443;
                                var25 ^= 583521687;
                                var25 ^= -1369062406;
                                var9 = var3 + var9;
                                var0.save();
                                var0.alpha(var107);
                                String var108 = var1.Ry;
                                boolean var109 = var108.isEmpty();
                                if (!var109) {
                                    var25 ^= -700185587;
                                    var25 ^= 200990103;
                                    var25 ^= 119009294;
                                    int var110 = var25 + 1;
                                    var110 = var25 * var110;
                                    var110 &= 1;
                                    if (var110 != 0) {
                                        break label129;
                                    }

                                    float var113 = var4 * 0.34F;
                                    int var145 = DP.Y(-657414, 0.72F);
                                    TextStyle var114 = TextStyle.of(var113, var145);
                                    TextStyle var115 = var114.semibold();
                                    float var146 = var4 * 0.08F;
                                    TextStyle var116 = var115.spacing(var146);
                                    float var147 = var4 * 0.52F;
                                    int var11 = var1.K;
                                    TextStyle var148 = TextStyle.of(var147, var11);
                                    var11 = var7 + 1;
                                    var11 = var7 * var11;
                                    int var169 = var7 + 2;
                                    var11 *= var169;
                                    var169 = var7 + 3;
                                    var11 *= var169;
                                    var11 &= 7;
                                    if (var11 == 0) {
                                        var25 += -1021659129;
                                        var25 |= -1479273752;
                                        var25 *= 889220395;
                                        var25 ^= -341399669;
                                        TextStyle var149 = var148.semibold();
                                        var11 = var1.K;
                                        var11 = DP.Y(var11, 0.4F);
                                        TextStyle var150 = var149.shadow(var11, 0.0F, 0.3F);
                                        float var161 = var4 * 0.25F;
                                        float var171 = var0.measure("BY", var116);
                                        String var13 = var1.Ry;
                                        float var173 = var0.measure(var13, var150);
                                        float var14 = var171 + var161;
                                        float var174 = var14 + var173;
                                        float var175 = var174 * 0.5F;
                                        float var176 = var2 - var175;
                                        var14 = var0.lineHeight(var150);
                                        float var15 = var0.lineHeight(var116);
                                        var14 -= var15;
                                        var14 *= 0.62F;
                                        var14 = var9 + var14;
                                        var14 = var0.text("BY", var176, var14, var116);
                                        String var182 = var1.Ry;
                                        float var172 = var176 + var171;
                                        float var162 = var172 + var161;
                                        float var151 = var0.text(var182, var162, var9, var150);
                                        var25 += -436429894;
                                        var25 += -698984123;
                                        var25 ^= 1433436939;
                                        break label128;
                                    }

                                    switch (var25) {
                                        case -915443204:
                                        default:
                                            var25 ^= 1819911981;
                                            break;
                                        case -695054084:
                                            var25 ^= -1980982910;
                                            break;
                                        case 1890437049:
                                            var25 >>>= 1;
                                            var25 += 1465478586;
                                            var25 ^= -1455863094;
                                    }
                                } else {
                                    var25 *= -251468645;
                                    var25 -= 999076778;
                                    var25 &= 691697827;
                                    var25 ^= -2142194247;
                                    float var152 = var4 * 0.4F;
                                    int var163 = var7 + 1;
                                    var163 = var7 * var163;
                                    var7 = var163 & 1;
                                    if (var7 == 0) {
                                        var25 &= -2121633512;
                                        var25 -= 1211388984;
                                        var25 >>>= 27;
                                        var25 ^= -103507553;
                                        var7 = var25 + 1;
                                        var7 = var25 * var7;
                                        var163 = var25 + 2;
                                        var7 *= var163;
                                        var163 = var25 + 3;
                                        var7 *= var163;
                                        var7 &= 7;
                                        if (var7 != 0) {
                                            break label129;
                                        }

                                        var7 = DP.Y(-657414, 0.88F);
                                        TextStyle var101 = TextStyle.of(var152, var7);
                                        TextStyle var102 = var101.medium();
                                        int var153 = DP.Y(-16777216, 0.5F);
                                        float var167 = var4 * 0.03F;
                                        TextStyle var103 = var102.shadow(var153, var167, 0.15F);
                                        String var104 = var1.MZ;
                                        float var105 = var0.textCentered(var104, var2, var9, var103);
                                        switch (var25) {
                                            case -1693605154:
                                                var25 ^= 1138269578;
                                                break label128;
                                            case -103507559:
                                                var25 -= -671611985;
                                                var25 ^= -1870606445;
                                                break label128;
                                            case 575963650:
                                            default:
                                                var25 ^= 1236009973;
                                                break label128;
                                        }
                                    }

                                    switch (var25) {
                                        case -2139577032:
                                            var25 -= 185022949;
                                            var25 <<= 16;
                                            var25 ^= 1306139484;
                                            break;
                                        case -2006482212:
                                        default:
                                            var25 ^= 369093134;
                                            break;
                                        case -1852006014:
                                            var25 ^= 47707713;
                                    }
                                }
                            } else {
                                switch (var25) {
                                    case -1919270396:
                                        var25 |= 64021860;
                                        var25 &= -1847124234;
                                        var25 -= -520386188;
                                        var25 -= -2133690105;
                                        var25 ^= 964499637;
                                        break;
                                    case -1071843772:
                                    default:
                                        var25 ^= -1534137413;
                                        break;
                                    case -926636798:
                                        var25 ^= -796152400;
                                }
                            }
                        }
                    }
                } else {
                    var25 = var5 >> 11;
                    var25 ^= 646189353;
                }

                Integer var91 = var25;
                if (var91 != null) {
                    UnsupportedOperationException var93 = new UnsupportedOperationException();
                    throw var93;
                }
                break label129;
            }

            var0.restore();
            return;
        }

        UnsupportedOperationException var92 = new UnsupportedOperationException();
        throw var92;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1065107585;
        int var2 = vS_2.Ol;
        int var4 = of_2.xF(var3, var1, var2);
        RL = var4;
        String[] var5 = "ELIMINATED".split("");
        BT = var5;
    }
}
