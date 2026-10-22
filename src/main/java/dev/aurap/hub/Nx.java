package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Nx extends XR {
    private final ia qu;
    private float x;
    public static final int hr;

    public Nx(ia var1) {
        this.qu = var1;
    }

    @Override
    public xB W() {
        int var1 = hr;
        var1 ^= 387540127;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 ^= -1117824054;
            var1 ^= 1426907164;
            IllegalArgumentException var17 = new IllegalArgumentException();
            throw var17;
        } else {
            Integer var11 = switch (var1) {
                case -1263664981 -> var1 ^ 1910921498;
                default -> var1 ^ 1850415310;
                case 509078936 -> {
                    var1 -= -756763943;
                    var1 >>>= 27;
                    var1 &= 891084500;
                    var1 >>>= 20;
                    yield var1 ^ -1478002412;
                }
            };
            if (var11 == null) {
                IllegalStateException var12 = new IllegalStateException();
                throw var12;
            } else {
                return this.qu;
            }
        }
    }

    @Override
    public float v() {
        int var1 = System.identityHashCode(this);
        return 16.0F;
    }

    @Override
    public void ol(float var1) {
        int var2 = hr;
        var2 ^= -311385678;
        int var3 = System.identityHashCode(this);
        float var4 = this.x;
        var4 += var1;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 == 0) {
            var2 -= -1169219211;
            var2 -= -1901621919;
            var2 &= 940137368;
            var2 ^= 1935581112;
            Integer var20 = var2;
            if (var20 != null) {
                this.x = var4;
                return;
            }
        } else {
            var2 |= 928109964;
            var2 ^= 84764372;
            var2 ^= 961549201;
            Integer var15 = var2;
            if (var15 != null) {
                IllegalStateException var17 = new IllegalStateException();
                throw var17;
            }
        }

        RuntimeException var16 = new RuntimeException();
        throw var16;
    }

    @Override
    protected void R(Canvas var1, jX var2, float var3) {
        label192: {
            int var4 = hr;
            var4 ^= -836735769;
            int var5 = System.identityHashCode(this);
            Integer var6 = var5;
            if (var6 != null) {
                var4 |= -1366734930;
                var4 |= 1613545755;
                var4 -= 1182446821;
                var4 &= 1084194272;
                var4 ^= -766966441;
                long var152 = var4;
                long var8 = var152 + 1L;
                var8 = var152 * var8;
                long var153 = var8 & 1L;
                long var251;
                int var154 = (var251 = var153 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                if (var154 != 0) {
                    break label192;
                }

                ia var155 = this.qu;
                String var156 = var155.Tp();
                float var7 = this.x;
                float var192 = this.fb;
                float var193 = var192 + 4.0F;
                TextStyle var9 = lt;
                TextStyle var10 = lt;
                int var235 = var10.color();
                int var236 = DP.nq(var235, var3);
                var9 = var9.color(var236);
                float var157 = var1.text(var156, var7, var193, var9);
                Object var158 = var2.dl;
                int var159;
                if (var158 == this) {
                    var4 += -1235109442;
                    var4 ^= -1478125254;
                    var159 = 1;
                    var4 <<= 25;
                    var4 -= -916879956;
                    var4 ^= 1296059558;
                } else {
                    var4 ^= 1484611823;
                    var4 ^= -2033428046;
                    var4 *= 1706019463;
                    var4 ^= 2056713196;
                    int var177 = var4 + 1;
                    int var178 = var4 * var177;
                    int var179 = var178 & 1;
                    if (var179 != 0) {
                        break label192;
                    }

                    var159 = 0;
                    var4 += -412392066;
                    var4 += 833682922;
                    var4 >>>= 8;
                    var4 <<= 22;
                    var4 ^= 1059469042;
                }

                int var180 = var4 + 1;
                int var181 = var4 * var180;
                int var182 = var181 & 1;
                if (var182 != 0) {
                    break label192;
                }

                long var183 = var5;
                long var215 = var183 + 1L;
                long var216 = var183 * var215;
                long var184 = var216 & 1L;
                long var252;
                int var185 = (var252 = var184 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                if (var185 != 0) {
                    var4 ^= 1091283181;
                    var4 &= 1654614200;
                    var4 ^= -1217967616;
                } else {
                    label195: {
                        var4 *= -1068858447;
                        var4 <<= 11;
                        var4 >>>= 15;
                        var4 &= -318236062;
                        var4 ^= -513633802;
                        Integer var186 = var4;
                        if (var186 == null) {
                            break label192;
                        }

                        String var190;
                        if (var159 != 0) {
                            var4 = switch (var4) {
                                case -513635882 -> {
                                    var4 *= 1450931689;
                                    var4 ^= 949036577;
                                    yield var4 ^ -388355627;
                                }
                                default -> var4 ^ 1756436922;
                                case 1578609113 -> var4 ^ 1918083508;
                            };
                            int var187 = var4 + 1;
                            int var188 = var4 * var187;
                            int var189 = var188 & 1;
                            if (var189 != 0) {
                                break label192;
                            }

                            var190 = "press a key…";
                            var4 >>>= 24;
                            var4 -= 1763440225;
                            var4 += -2011733375;
                            var4 ^= -1674169214;
                            var4 ^= 848545674;
                        } else {
                            var4 = switch (var4) {
                                case -1139854685 -> var4 ^ 1922243335;
                                case -513635882 -> {
                                    var4 |= 340346740;
                                    var4 |= -1436050696;
                                    var4 ^= -1018370350;
                                    yield var4 ^ -916797517;
                                }
                                default -> var4 ^ 219046792;
                            };
                            ia var194 = this.qu;
                            boolean var195 = var194.r();
                            Integer var217 = var5;
                            if (var217 == null) {
                                switch (var4) {
                                    case -1937352745:
                                    default:
                                        var4 ^= 1966587784;
                                        break label195;
                                    case -176554337:
                                        var4 &= -1679505193;
                                        var4 |= 1078754796;
                                        var4 -= -893591102;
                                        var4 >>>= 17;
                                        var4 ^= -1209384640;
                                        break label195;
                                    case 142000528:
                                        var4 ^= -910653701;
                                        break label195;
                                }
                            }

                            var4 *= 1892847099;
                            var4 |= 25823713;
                            var4 ^= -85237131;
                            int var218 = var4 + 1;
                            int var219 = var4 * var218;
                            int var220 = var219 & 1;
                            if (var220 != 0) {
                                break label192;
                            }

                            if (var195) {
                                var4 *= 1634605699;
                                var4 <<= 11;
                                var4 ^= 956385516;
                                ia var196 = this.qu;
                                int var197 = var196.JQ();
                                String var198 = i_2.Q(var197);
                                int var221 = var5 + 1;
                                int var222 = var5 * var221;
                                int var223 = var222 & 1;
                                if (var223 != 0) {
                                    switch (var4) {
                                        case -2049762269:
                                        default:
                                            var4 ^= -93727967;
                                            break label195;
                                        case -892024596:
                                            var4 -= 1404579020;
                                            var4 ^= -1057563080;
                                            break label195;
                                        case 2061561141:
                                            var4 ^= -56043448;
                                            break label195;
                                    }
                                }
                                var4 = switch (var4) {
                                    case -892024596 -> {
                                        var4 <<= 22;
                                        yield var4 ^ 1795710138;
                                    }
                                    case 327834410 -> var4 ^ -77241455;
                                    default -> var4 ^ 483372651;
                                };
                                Integer var224 = var4;
                                if (var224 == null) {
                                    break label192;
                                }

                                var190 = var198;
                                var4 &= 1580106257;
                                var4 += -1235969373;
                                var4 *= -1459160423;
                                var4 ^= -1211900598;
                            } else {
                                var4 = switch (var4) {
                                    case -1256105072 -> {
                                        var4 ^= 1791186888;
                                        var4 |= 1159670554;
                                        var4 |= 1636260661;
                                        yield var4 ^ 492115061;
                                    }
                                    case -204683541 -> var4 ^ -1810208165;
                                    default -> var4 ^ -1073568182;
                                };
                                var190 = "none";
                                var4 *= -1529310107;
                                var4 ^= 466656579;
                            }
                        }

                        Integer var199 = var4;
                        if (var199 == null) {
                            break label192;
                        }

                        var8 = var5;
                        long var237 = var8 + 1L;
                        long var238 = var8 * var237;
                        long var12 = var8 + 2L;
                        long var239 = var238 * var12;
                        var8 += 3L;
                        long var240 = var239 * var8;
                        var8 = var240 & 7L;
                        long var253;
                        int var203 = (var253 = var8 - 0L) == 0L ? 0 : (var253 < 0L ? -1 : 1);
                        if (var203 == 0) {
                            var4 = switch (var4) {
                                case -1335976015 -> {
                                    var4 &= 1268065949;
                                    var4 += -88314263;
                                    var4 ^= -375060939;
                                    var4 &= -204012098;
                                    yield var4 ^ 364347507;
                                }
                                case -983477648 -> var4 ^ -175676829;
                                default -> var4 ^ 448629223;
                            };
                            Integer var204 = var4;
                            if (var204 == null) {
                                break label192;
                            }

                            int var210;
                            if (var159 != 0) {
                                var4 |= 2027072332;
                                var4 &= 927656533;
                                var4 >>= 21;
                                var4 >>>= 6;
                                var4 ^= 404285447;
                                int var205 = var4 + 1;
                                int var206 = var4 * var205;
                                int var225 = var4 + 2;
                                int var207 = var206 * var225;
                                int var226 = var4 + 3;
                                int var208 = var207 * var226;
                                int var209 = var208 & 7;
                                if (var209 != 0) {
                                    break label192;
                                }

                                var210 = -1;
                                var4 += 1620225216;
                                var4 -= -1938197093;
                                var4 ^= -1577045997;
                                var4 ^= -15907793;
                            } else {
                                var4 = switch (var4) {
                                    case -1828843902 -> var4 ^ -814121030;
                                    case 115507453 -> {
                                        var4 *= 1647717709;
                                        var4 |= -447794487;
                                        var4 &= -2123661345;
                                        var4 ^= -1224117206;
                                        yield var4 ^ 1238292708;
                                    }
                                    default -> var4 ^ 2137026670;
                                };
                                var210 = -1275068417;
                                var4 -= -914889371;
                                var4 <<= 22;
                                var4 >>= 28;
                                var4 *= 72260887;
                                var4 ^= -1461140080;
                            }

                            long var227 = var4;
                            long var11 = var227 + 1L;
                            var11 = var227 * var11;
                            long var228 = var11 & 1L;
                            long var254;
                            int var229 = (var254 = var228 - 0L) == 0L ? 0 : (var254 < 0L ? -1 : 1);
                            if (var229 != 0) {
                                break label192;
                            }

                            TextStyle var211 = TextStyle.of(7.0F, var210);
                            Integer var230 = var5;
                            if (var230 == null) {
                                var4 *= 1274358303;
                                var4 += 1443407124;
                                var4 &= -702340987;
                                var4 ^= -439852520;
                            } else {
                                label200: {
                                    var4 ^= 960646021;
                                    var4 -= -1404510742;
                                    var4 *= 150179241;
                                    var4 -= 1474438091;
                                    var4 ^= -1705904196;
                                    TextStyle var212 = var211.bold();
                                    float var231 = var1.measure(var190, var212);
                                    float var232 = var231 + 10.0F;
                                    float var171;
                                    if (var159 != 0) {
                                        var4 -= -2086298259;
                                        var4 ^= 2125144545;
                                        var159 = var4 + 1;
                                        var159 = var4 * var159;
                                        var159 &= 1;
                                        if (var159 != 0) {
                                            break label192;
                                        }

                                        float var163 = this.x;
                                        float var164 = var163 * 6.0F;
                                        double var241 = var164;
                                        var159 = var5 + 1;
                                        var159 = var5 * var159;
                                        var159 &= 1;
                                        if (var159 != 0) {
                                            switch (var4) {
                                                case -1956559116:
                                                    var4 ^= 1941459637;
                                                    break label200;
                                                case -1317084608:
                                                    var4 += -1283533681;
                                                    var4 |= 134997998;
                                                    var4 -= 429841267;
                                                    var4 -= 809904686;
                                                    var4 ^= -1796165546;
                                                    break label200;
                                                case -721679771:
                                                default:
                                                    var4 ^= 163330568;
                                                    break label200;
                                            }
                                        }

                                        var4 -= -1470226697;
                                        var4 -= -1216018715;
                                        var4 ^= 1579839383;
                                        var4 ^= -499810422;
                                        double var242 = Math.sin(var241);
                                        float var168 = (float)var242;
                                        float var169 = 0.5F * var168;
                                        float var170 = 0.5F + var169;
                                        var171 = var170;
                                        var4 >>>= 29;
                                        var4 += -1527491002;
                                        var4 &= -1504982647;
                                        var4 ^= 972215392;
                                        var4 ^= -1913367786;
                                    } else {
                                        var4 -= 1001870152;
                                        var4 += 572441077;
                                        var4 ^= -1260575287;
                                        var4 &= 1773589140;
                                        var4 ^= -1348372321;
                                        var171 = 0.0F;
                                        switch (var4) {
                                            case -1500005745:
                                                var4 ^= -1817126434;
                                                var4 -= 700251588;
                                                var4 >>>= 24;
                                                var4 ^= 273074036;
                                                break;
                                            case -986376919:
                                                var4 ^= -324407494;
                                                break;
                                            case -977604527:
                                            default:
                                                var4 ^= 1156281020;
                                        }
                                    }

                                    float var243 = this.x;
                                    float var247 = this.pP;
                                    float var244 = var243 + var247;
                                    float var245 = var244 - var232;
                                    Integer var143 = var5;
                                    if (var143 != null) {
                                        var4 <<= 2;
                                        var4 >>= 21;
                                        var4 ^= 1369278009;
                                        var11 = var4;
                                        long var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        var11 = var13 & 1L;
                                        long var255;
                                        int var144 = (var255 = var11 - 0L) == 0L ? 0 : (var255 < 0L ? -1 : 1);
                                        if (var144 == 0) {
                                            float var145 = this.fb;
                                            float var146 = var145 + 2.0F;
                                            var159 = DP.Z(536870911, 1207959551, var171);
                                            var159 = DP.nq(var159, var3);
                                            var1.roundRect(var245, var146, var232, 12.0F, 6.0F, var159);
                                            float var147 = this.x;
                                            float var174 = this.pP;
                                            float var148 = var147 + var174;
                                            float var149 = var148 - var232;
                                            float var150 = var149 + 5.0F;
                                            float var175 = this.fb;
                                            float var176 = var175 + 4.5F;
                                            int var233 = var212.color();
                                            int var234 = DP.nq(var233, var3);
                                            TextStyle var213 = var212.color(var234);
                                            float var151 = var1.text(var190, var150, var176, var213);
                                            return;
                                        }
                                        break label192;
                                    }

                                    var4 |= 1405850053;
                                    var4 >>>= 11;
                                    var4 ^= -1210041374;
                                }
                            }
                        } else {
                            var4 *= 1487969531;
                            var4 &= 292013533;
                            var4 ^= -1498675567;
                        }
                    }
                }
            } else {
                var4 &= -1854792228;
                var4 <<= 1;
                var4 &= 1087358108;
                var4 += 1742283094;
                var4 ^= -545823794;
            }

            Integer var140 = var4;
            if (var140 != null) {
                RuntimeException var142 = new RuntimeException();
                throw var142;
            }
        }

        IllegalArgumentException var141 = new IllegalArgumentException();
        throw var141;
    }

    @Override
    public boolean i(jX var1, float var2, float var3, int var4) {
        label76: {
            int var5 = hr;
            var5 ^= 1776734353;
            int var7 = System.identityHashCode(this);
            int var8 = var7 + 1;
            var8 = var7 * var8;
            var8 &= 1;
            if (var8 != 0) {
                switch (var5) {
                    case -1602846503:
                        var5 ^= 295353381;
                        break;
                    case -647116191:
                    default:
                        var5 ^= 2132438719;
                        break;
                    case 1621645718:
                        var5 >>= 12;
                        var5 ^= 1910105119;
                }
            } else {
                var5 >>>= 15;
                var5 ^= 29930854;
                var8 = var4 + 1;
                var8 = var4 * var8;
                var8 &= 1;
                if (var8 != 0) {
                    break label76;
                }

                if (var4 != 0) {
                    var5 += 833974757;
                    var5 ^= -1087904621;
                    var5 ^= 1582339897;
                    long var69 = var4;
                    long var76 = var69 + 1L;
                    var76 = var69 * var76;
                    long var70 = var76 & 1L;
                    long var78;
                    var8 = (var78 = var70 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                    if (var8 == 0) {
                        return false;
                    }
                    break label76;
                }
                var5 = switch (var5) {
                    case 29914166 -> {
                        var5 |= -1155982248;
                        var5 += 876842929;
                        var5 ^= -269840360;
                        var5 ^= 1780227653;
                        yield var5 ^ 1623552928;
                    }
                    default -> var5 ^ -459374776;
                    case 2026738957 -> var5 ^ -650050853;
                };
                var8 = var4 + 1;
                var8 = var4 * var8;
                int var9 = var4 + 2;
                var8 *= var9;
                var9 = var4 + 3;
                var8 *= var9;
                var8 &= 7;
                if (var8 != 0) {
                    break label76;
                }

                Object var64 = var1.dl;
                Integer var73 = var7;
                if (var73 == null) {
                    var5 += -637435249;
                    var5 -= 76004378;
                    var5 |= 106144527;
                    var5 |= -1433131765;
                    var5 ^= -1625271851;
                } else {
                    var5 += -1391984990;
                    var5 ^= 1795693745;
                    var73 = var4;
                    if (var73 == null) {
                        break label76;
                    }

                    Nx var68;
                    if (var64 == this) {
                        var5 *= -1478501921;
                        var5 -= 53395669;
                        var5 &= -1774934730;
                        var5 ^= -473431254;
                        long var65 = var4;
                        long var10 = var65 + 1L;
                        var10 = var65 * var10;
                        long var66 = var10 & 1L;
                        long var79;
                        var8 = (var79 = var66 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                        if (var8 != 0) {
                            break label76;
                        }

                        var68 = null;
                        var5 <<= 2;
                        var5 ^= -820816554;
                    } else {
                        var5 = switch (var5) {
                            default -> var5 ^ -362042744;
                            case -1455493947 -> {
                                var5 ^= -2127451269;
                                yield var5 ^ -248362864;
                            }
                            case -1228826779 -> var5 ^ -1020166197;
                        };
                        var68 = this;
                        var5 -= -2039773953;
                        var5 |= 2938849;
                        var5 ^= 442368521;
                    }

                    Integer var6 = var4;
                    if (var6 == null) {
                        break label76;
                    }

                    var1.dl = var68;
                    var6 = var7;
                    if (var6 != null) {
                        var5 -= 1313701615;
                        var5 ^= -554605637;
                        var5 &= -219217960;
                        var5 ^= 268113928;
                        var1.Ht("ui_click");
                        return true;
                    }

                    var5 += 358599218;
                    var5 ^= 742316271;
                    var5 ^= 65183341;
                }
            }

            UnsupportedOperationException var44 = new UnsupportedOperationException();
            throw var44;
        }

        IllegalStateException var52 = new IllegalStateException();
        throw var52;
    }

    @Override
    public boolean E(jX var1, int var2) {
        label102: {
            int var3 = hr;
            var3 ^= -270937659;
            int var5 = System.identityHashCode(this);
            long var6 = var5;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var126;
            int var87 = (var126 = var6 - 0L) == 0L ? 0 : (var126 < 0L ? -1 : 1);
            if (var87 != 0) {
                switch (var3) {
                    case -1169741074:
                        var3 ^= 1907381874;
                        break;
                    case -823956591:
                    default:
                        var3 ^= 1835434500;
                        break;
                    case -426288958:
                        var3 &= 1120992816;
                        var3 ^= 1945270077;
                }
            } else {
                label104: {
                    var3 |= 830473713;
                    var3 ^= -1952783664;
                    Integer var88 = var2;
                    if (var88 == null) {
                        break label102;
                    }

                    Object var89 = var1.dl;
                    if (var89 != this) {
                        var3 >>= 14;
                        var3 |= -1949325408;
                        var3 ^= -1317809320;
                        int var106 = var2 + 1;
                        int var107 = var2 * var106;
                        int var119 = var2 + 2;
                        int var108 = var107 * var119;
                        var119 = var2 + 3;
                        int var109 = var108 * var119;
                        int var110 = var109 & 7;
                        if (var110 == 0) {
                            return false;
                        }
                        break label102;
                    }

                    label105: {
                        var3 &= -1868801859;
                        var3 ^= 948058988;
                        var3 -= -1299845044;
                        var3 *= -1847011569;
                        var3 ^= 358491752;
                        if (var2 != 259) {
                            var3 ^= 1474722840;
                            var3 >>= 5;
                            var3 ^= 1144932716;
                            var6 = var2;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            long var10 = var6 + 2L;
                            var8 *= var10;
                            var6 += 3L;
                            var8 *= var6;
                            var6 = var8 & 7L;
                            long var127;
                            int var93 = (var127 = var6 - 0L) == 0L ? 0 : (var127 < 0L ? -1 : 1);
                            if (var93 != 0) {
                                break label102;
                            }

                            if (var2 != 261) {
                                var3 &= -158932838;
                                var3 ^= 1855807689;
                                Integer var94 = var2;
                                if (var94 == null) {
                                    break label102;
                                }

                                if (var2 != 256) {
                                    var3 += 266265394;
                                    var3 -= 1159865886;
                                    var3 ^= -769187118;
                                    int var95 = var2 + 1;
                                    int var96 = var2 * var95;
                                    int var7 = var2 + 2;
                                    int var97 = var96 * var7;
                                    var7 = var2 + 3;
                                    int var98 = var97 * var7;
                                    int var99 = var98 & 7;
                                    if (var99 != 0) {
                                        break label102;
                                    }

                                    ia var100 = this.qu;
                                    var7 = var5 + 1;
                                    var7 = var5 * var7;
                                    var7 &= 1;
                                    if (var7 != 0) {
                                        var3 >>= 23;
                                        var3 &= 948593549;
                                        var3 <<= 19;
                                        var3 ^= -575109012;
                                        var3 ^= -393042095;
                                        break label104;
                                    }

                                    var3 |= 1360234692;
                                    var3 *= -1163705151;
                                    var3 <<= 2;
                                    var3 ^= -260219385;
                                    var100.y(var2);
                                    var3 &= -1307826288;
                                    var3 &= 2015648973;
                                    var3 -= 1533594723;
                                    var3 ^= -1834466542;
                                } else {
                                    var3 -= 955692356;
                                    var3 += 857824924;
                                    var3 &= 766417085;
                                    var3 |= -1437971701;
                                    var3 ^= -394675164;
                                }
                                break label105;
                            }

                            var3 |= -1524994984;
                            var3 ^= -53999262;
                        } else {
                            var3 &= -1749916098;
                            var3 |= -1835001895;
                            var3 |= 511151971;
                            var3 ^= -576349246;
                        }

                        Integer var101 = var2;
                        if (var101 == null) {
                            break label102;
                        }

                        ia var102 = this.qu;
                        int var115 = var5 + 1;
                        var115 = var5 * var115;
                        var115 &= 1;
                        if (var115 != 0) {
                            var3 -= 960089477;
                            var3 >>>= 27;
                            var3 <<= 20;
                            var3 ^= 829566781;
                            break label104;
                        }

                        var3 ^= -862205563;
                        var3 -= -1275660706;
                        var3 ^= -369820811;
                        var102.y(-1);
                        var3 += 872948693;
                        var3 |= -362036548;
                        var3 -= -1128361603;
                        var3 ^= 2005014064;
                    }

                    Integer var103 = var2;
                    if (var103 == null) {
                        break label102;
                    }

                    var1.dl = null;
                    int var104 = var5 + 1;
                    int var105 = var5 * var104;
                    var5 = var105 & 1;
                    if (var5 == 0) {
                        switch (var3) {
                            case 693956661:
                                var3 ^= 1066677364;
                                break;
                            case 1177777935:
                                var3 *= 228477445;
                                var3 ^= -682918119;
                                var3 ^= -1961786951;
                                break;
                            case 1353934637:
                            default:
                                var3 ^= -1080829652;
                        }

                        Integer var81 = var2;
                        if (var81 != null) {
                            var1.Ht("ui_click");
                            return true;
                        }
                        break label102;
                    }

                    var3 |= -104086493;
                    var3 ^= -828778478;
                }
            }

            long var71 = var2;
            long var82 = var71 + 1L;
            long var83 = var71 * var82;
            long var118 = var71 + 2L;
            long var84 = var83 * var118;
            long var72 = var71 + 3L;
            long var85 = var84 * var72;
            long var73 = var85 & 7L;
            long var128;
            var3 = (var128 = var73 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
            if (var3 == 0) {
                RuntimeException var75 = new RuntimeException();
                throw var75;
            }
        }

        RuntimeException var79 = new RuntimeException();
        throw var79;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -640377619;
        int var2 = XR.Mz;
        int var4 = of_2.xF(var3, var1, var2);
        hr = var4;
    }
}
