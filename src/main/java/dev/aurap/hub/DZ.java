package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class DZ extends XR {
    private final Uq Uw;
    private final XF zU;
    private final XF oG;
    public static final int Y;

    public DZ(Uq var1) {
        kE_2 var3 = kE_2.SNAPPY;
        XF var2 = new XF(0.0F, var3);
        this.oG = var2;
        this.Uw = var1;
        float var6 = var1.MU();
        kE_2 var4 = kE_2.uY(0.18F, 0.9F);
        var2 = new XF(var6, var4);
        this.zU = var2;
    }

    @Override
    public xB W() {
        int var1 = Y;
        var1 ^= -199967367;
        int var2 = System.identityHashCode(this);
        Integer var10 = var2;
        if (var10 == null) {
            var1 ^= 1759327290;
            var1 += -282311064;
            var1 ^= -1568549225;
            var10 = var1;
            if (var10 == null) {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            } else {
                AssertionError var12 = new AssertionError();
                throw var12;
            }
        } else {
            var1 |= -1322331931;
            var1 ^= 440027273;
            var1 ^= 1842142794;
            return this.Uw;
        }
    }

    @Override
    public float v() {
        int var1 = System.identityHashCode(this);
        return 24.0F;
    }

    @Override
    public void ol(float var1) {
        int var2 = Y;
        var2 ^= 309574010;
        int var3 = System.identityHashCode(this);
        XF var4 = this.zU;
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var29;
        var3 = (var29 = var5 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var3 != 0) {
            var2 = switch (var2) {
                case -2093762264 -> {
                    var2 ^= 1128363859;
                    yield var2 ^ -782757295;
                }
                default -> var2 ^ -1528360843;
                case -884578747 -> var2 ^ -168151264;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                IllegalStateException var26 = new IllegalStateException();
                throw var26;
            } else {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            }
        } else {
            var2 <<= 15;
            var2 ^= 1534024860;
            Uq var12 = this.Uw;
            float var13 = var12.MU();
            float var14 = TP.S(var13);
            var4.H(var14);
            XF var15 = this.zU;
            float var16 = var15.N(var1);
            XF var17 = this.oG;
            float var18 = var17.N(var1);
        }
    }

    @Override
    protected void R(Canvas var1, jX var2, float var3) {
        boolean var127 = false;
        float var199 = 0.0F;
        label164: {
            int var42;
            var42 = Y;
            var42 ^= 1779850064;
            int var5 = System.identityHashCode(this);
            int var6 = var5 + 1;
            var6 = var5 * var6;
            var6 &= 1;
            label163:
            if (var6 == 0) {
                label167: {
                    var42 = switch (var42) {
                        case -78226686 -> {
                            var42 &= -1189348738;
                            var42 &= 611196467;
                            var42 -= -893505024;
                            var42 += -404187323;
                            yield var42 ^ -145867507;
                        }
                        default -> var42 ^ 239865751;
                        case 1570559771 -> var42 ^ -1521696831;
                    };
                    Object var121 = var2.Q;
                    if (var121 != this) {
                        var42 -= -1944980159;
                        var42 &= 620755680;
                        var42 *= -2060287299;
                        var42 ^= 1735329902;
                        long var122 = var42;
                        long var8 = var122 + 1L;
                        var8 = var122 * var8;
                        long var123 = var8 & 1L;
                        long var270;
                        var6 = (var270 = var123 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label164;
                        }

                        float var125 = this.U;
                        float var7 = this.fb;
                        float var151 = this.pP;
                        long var9 = var5;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var271;
                        int var177 = (var271 = var9 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                        if (var177 != 0) {
                            var42 &= 144387395;
                            var42 *= -1291752907;
                            var42 *= -734996579;
                            var42 |= 1769738758;
                            var42 ^= -875227359;
                            break label163;
                        }
                        var42 = switch (var42) {
                            case -994434962 -> {
                                var42 >>>= 10;
                                var42 &= 1370576522;
                                yield var42 ^ 1369892617;
                            }
                            default -> var42 ^ 203772560;
                            case 528695298 -> var42 ^ -602696452;
                        };
                        float var178 = this.v();
                        boolean var126 = var2.hQ(var125, var7, var151, var178);
                        if (!var126) {
                            var42 *= 208107443;
                            var42 *= -580274297;
                            var42 ^= 2005694886;
                            var42 ^= 2112049951;
                            var42 ^= 1250135770;
                            var127 = false;
                            switch (var42) {
                                case -1040535674:
                                    var42 &= 1512394709;
                                    var42 >>= 19;
                                    var42 ^= 1455263311;
                                    break label167;
                                case 1650800062:
                                    var42 ^= 1765319738;
                                    break label167;
                                case 2084085059:
                                default:
                                    var42 ^= -84486749;
                                    break label167;
                            }
                        }

                        var42 |= -1310099472;
                        var42 ^= -963228875;
                    } else {
                        var42 *= 1918058083;
                        var42 ^= -1251855782;
                    }

                    Integer var142 = var42;
                    if (var142 == null) {
                        break label164;
                    }

                    var127 = true;
                    var42 += 270882678;
                    var42 ^= 288526961;
                }

                XF var143 = this.oG;
                long var152 = var5;
                long var10 = var152 + 1L;
                var10 = var152 * var10;
                long var12 = var152 + 2L;
                var10 *= var12;
                var152 += 3L;
                var10 *= var152;
                var152 = var10 & 7L;
                long var272;
                int var155 = (var272 = var152 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                if (var155 != 0) {
                    var42 &= 465558522;
                    var42 += 706859896;
                    var42 += -1053298673;
                    var42 ^= -859928138;
                } else {
                    var42 &= 1051944873;
                    var42 <<= 27;
                    var42 -= -933325317;
                    var42 ^= -2140077594;
                    Integer var156 = var42;
                    if (var156 == null) {
                        break label164;
                    }

                    float var128;
                    if (var127) {
                        var42 += -1676052299;
                        var42 += 407544691;
                        var42 ^= 1897376670;
                        var42 ^= -1247071592;
                        var128 = 1.0F;
                        var42 *= 954919749;
                        var42 *= -812921727;
                        var42 += -550057335;
                        var42 |= 392023369;
                        var42 ^= -1241420604;
                    } else {
                        var42 = switch (var42) {
                            default -> var42 ^ -682756762;
                            case -340714198 -> var42 ^ -1368042882;
                            case -3118109 -> {
                                var42 &= -2009565344;
                                yield var42 ^ -604889045;
                            }
                        };
                        int var157 = var42 + 1;
                        int var158 = var42 * var157;
                        int var179 = var42 + 2;
                        int var159 = var158 * var179;
                        var179 = var42 + 3;
                        int var160 = var159 * var179;
                        int var161 = var160 & 7;
                        if (var161 != 0) {
                            break label164;
                        }

                        var128 = 0.0F;
                        var42 |= 511189132;
                        var42 ^= -863454469;
                        var42 <<= 14;
                        var42 += 790097931;
                        var42 ^= 1813529348;
                    }

                    var152 = var42;
                    var10 = var152 + 1L;
                    var10 = var152 * var10;
                    var152 = var10 & 1L;
                    long var273;
                    int var164 = (var273 = var152 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
                    if (var164 != 0) {
                        break label164;
                    }

                    var143.H(var128);
                    Uq var129 = this.Uw;
                    String var130 = var129.Tp();
                    float var144 = this.U;
                    float var165 = this.fb;
                    float var166 = var165 + 2.0F;
                    TextStyle var181 = lt;
                    TextStyle var213 = lt;
                    int var214 = var213.color();
                    int var215 = DP.nq(var214, var3);
                    var181 = var181.color(var215);
                    float var131 = var1.text(var130, var144, var166, var181);
                    Uq var132 = this.Uw;
                    String var133 = var132.D();
                    float var145 = this.U;
                    float var167 = this.pP;
                    float var146 = var145 + var167;
                    float var168 = this.fb;
                    float var169 = var168 + 2.0F;
                    var181 = M;
                    TextStyle var216 = M;
                    int var217 = var216.color();
                    int var218 = DP.nq(var217, var3);
                    var181 = var181.color(var218);
                    float var134 = var1.textRight(var133, var146, var169, var181);
                    float var135 = this.fb;
                    float var136 = var135 + 16.0F;
                    float var147 = 2.0F;
                    XF var170 = this.zU;
                    float var171 = var170.bs();
                    float var172 = TP.S(var171);
                    Uq var185 = this.Uw;
                    float var186 = var185.g();
                    int var219 = var5 + 1;
                    int var220 = var5 * var219;
                    int var240 = var5 + 2;
                    int var221 = var220 * var240;
                    var240 = var5 + 3;
                    int var222 = var221 * var240;
                    int var223 = var222 & 7;
                    label146:
                    if (var223 == 0) {
                        label143: {
                            var42 |= -2136498232;
                            var42 ^= 9519546;
                            var42 ^= -1096312570;
                            float var274;
                            int var187 = (var274 = var186 - 0.0F) == 0.0F ? 0 : (var274 < 0.0F ? -1 : 1);
                            if (var187 < 0) {
                                var42 ^= 303903297;
                                var42 ^= -1124834855;
                                var42 ^= 70587544;
                                Uq var188 = this.Uw;
                                float var189 = var188.li();
                                var10 = var5;
                                var12 = var10 + 1L;
                                var12 = var10 * var12;
                                var10 = var12 & 1L;
                                long var275;
                                int var226 = (var275 = var10 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
                                if (var226 != 0) {
                                    switch (var42) {
                                        case -1659559821:
                                            var42 &= 478361063;
                                            var42 ^= 782822404;
                                            break label146;
                                        case -224660958:
                                            var42 ^= -1216653521;
                                            break label146;
                                        case 12407657:
                                        default:
                                            var42 ^= -185008469;
                                            break label146;
                                    }
                                }

                                var42 -= -1863386171;
                                var42 += -400717348;
                                var42 += -1717627291;
                                var42 *= -796112455;
                                var42 ^= 2102397927;
                                Integer var227 = var42;
                                if (var227 == null) {
                                    break label164;
                                }

                                float var276;
                                int var190 = (var276 = var189 - 0.0F) == 0.0F ? 0 : (var276 < 0.0F ? -1 : 1);
                                if (var190 > 0) {
                                    var42 ^= 754012760;
                                    var42 ^= -882932537;
                                    int var191 = var42 + 1;
                                    int var192 = var42 * var191;
                                    int var228 = var42 + 2;
                                    int var193 = var192 * var228;
                                    int var229 = var42 + 3;
                                    int var194 = var193 * var229;
                                    int var195 = var194 & 7;
                                    if (var195 != 0) {
                                        break label164;
                                    }

                                    Uq var196 = this.Uw;
                                    float var197 = var196.g();
                                    Uq var230 = this.Uw;
                                    float var231 = var230.li();
                                    long var242 = var5;
                                    long var13 = var242 + 1L;
                                    var13 = var242 * var13;
                                    long var243 = var13 & 1L;
                                    long var277;
                                    var240 = (var277 = var243 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                                    if (var240 != 0) {
                                        var42 |= 2042198312;
                                        var42 ^= -850249848;
                                        break label146;
                                    }
                                    var42 = switch (var42) {
                                        case -2038197181 -> var42 ^ 1514272422;
                                        case -1891456305 -> {
                                            var42 -= -843146697;
                                            var42 += -831116436;
                                            yield var42 ^ 861428513;
                                        }
                                        default -> var42 ^ -1588756800;
                                    };
                                    long var245 = var42;
                                    var13 = var245 + 1L;
                                    var13 = var245 * var13;
                                    long var246 = var13 & 1L;
                                    long var278;
                                    var240 = (var278 = var246 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
                                    if (var240 != 0) {
                                        break label164;
                                    }

                                    float var198 = TP.q(var197, var231, 0.0F);
                                    var199 = var198;
                                    var42 += 646127036;
                                    var42 += -1727233828;
                                    var42 &= -319353902;
                                    var42 ^= -1964260324;
                                    break label143;
                                }

                                var42 ^= 398019270;
                                var42 &= 1039442986;
                                var42 -= 593154517;
                                var42 ^= 1482014331;
                            } else {
                                var42 &= -1811344584;
                                var42 ^= 1436938086;
                            }

                            var199 = 0.0F;
                            var42 >>>= 1;
                            var42 -= -1730553175;
                            var42 += 1927322654;
                            var42 ^= 470086188;
                        }

                        Integer var232 = var42;
                        if (var232 == null) {
                            break label164;
                        }

                        float var233 = Math.min(var199, var172);
                        float var200 = Math.max(var199, var172);
                        float var248 = this.U;
                        float var258 = this.pP;
                        float var267 = var147 / 2.0F;
                        int var14 = DP.nq(650501887, var3);
                        var1.roundRect(var248, var136, var258, var147, var267, var14);
                        float var249 = this.U;
                        float var259 = this.pP;
                        float var260 = var259 * var233;
                        float var250 = var249 + var260;
                        float var261 = this.pP;
                        float var201 = var200 - var233;
                        float var202 = var261 * var201;
                        float var203 = Math.max(var147, var202);
                        float var234 = var147 / 2.0F;
                        int var262 = DP.nq(-7684353, var3);
                        var1.roundRect(var250, var136, var203, var147, var234, var262);
                        XF var204 = this.oG;
                        float var205 = var204.bs();
                        float var206 = var205 * 0.6F;
                        float var207 = 2.5F + var206;
                        float var235 = this.U;
                        float var251 = this.pP;
                        float var173 = var251 * var172;
                        float var174 = var235 + var173;
                        float var236 = var174 - var207;
                        float var252 = var147 / 2.0F;
                        float var253 = var136 + var252;
                        float var254 = var253 - var207;
                        float var255 = var254 + 0.6F;
                        float var263 = var207 * 2.0F;
                        var267 = var207 * 2.0F;
                        var14 = DP.nq(Integer.MIN_VALUE, var3);
                        var1.shadow(var236, var255, var263, var267, var207, 3.0F, var14);
                        float var148 = var147 / 2.0F;
                        float var137 = var136 + var148;
                        int var149 = DP.nq(-854017, var3);
                        Integer var113 = var5;
                        if (var113 != null) {
                            var42 ^= 586956344;
                            var42 ^= -2145600615;
                            int var114 = var42 + 1;
                            var114 = var42 * var114;
                            int var237 = var42 + 2;
                            var114 *= var237;
                            int var238 = var42 + 3;
                            var114 *= var238;
                            var114 &= 7;
                            if (var114 == 0) {
                                var1.circle(var174, var137, var207, var149);
                                return;
                            }
                            break label164;
                        }

                        var42 &= -107444381;
                        var42 -= 512524405;
                        var42 <<= 11;
                        var42 -= 1357529905;
                        var42 ^= 1033099432;
                    } else {
                        var42 *= 2108831219;
                        var42 -= -669654147;
                        var42 ^= 2137121447;
                    }
                }
            } else {
                var42 -= -924446964;
                var42 += -2074085879;
                var42 ^= -2072408680;
            }

            long var107 = var42;
            long var138 = var107 + 1L;
            long var139 = var107 * var138;
            long var175 = var107 + 2L;
            long var140 = var139 * var175;
            long var108 = var107 + 3L;
            long var141 = var140 * var108;
            long var109 = var141 & 7L;
            long var279;
            var42 = (var279 = var109 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
            if (var42 == 0) {
                AssertionError var112 = new AssertionError();
                throw var112;
            }
        }

        IllegalStateException var111 = new IllegalStateException();
        throw var111;
    }

    @Override
    public boolean i(jX var1, float var2, float var3, int var4) {
        label61: {
            int var5 = Y;
            var5 ^= -866388968;
            int var7 = System.identityHashCode(this);
            long var8 = var7;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            var8 = var10 & 1L;
            long var74;
            int var62 = (var74 = var8 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
            if (var62 != 0) {
                switch (var5) {
                    case -1712848646:
                        var5 ^= -553189598;
                        break;
                    case 676476559:
                    default:
                        var5 ^= -149411068;
                        break;
                    case 1562113098:
                        var5 -= -1944370376;
                        var5 |= -733842288;
                        var5 *= 1877184373;
                        var5 ^= 1154102446;
                }
            } else {
                var5 >>= 12;
                var5 += 1432164678;
                var5 ^= 1135302122;
                if (var4 == 1) {
                    var5 &= -452154362;
                    var5 >>= 5;
                    var5 ^= -1314821327;
                    var5 ^= -1228734373;
                    Uq var63 = this.Uw;
                    var63.s();
                    Integer var64 = var7;
                    if (var64 != null) {
                        var5 &= -491781360;
                        var5 *= -651244531;
                        var5 *= 136241437;
                        var5 ^= 592512844;
                        var1.Ht("ui_click");
                        return true;
                    }

                    var5 += 650201009;
                    var5 ^= -2013951825;
                } else {
                    var5 = switch (var5) {
                        default -> var5 ^ 762949610;
                        case 382320367 -> {
                            var5 += 1157083594;
                            var5 *= -2109233289;
                            var5 &= -634321278;
                            var5 &= 1269830;
                            yield var5 ^ 140546963;
                        }
                        case 1087675148 -> var5 ^ 201224574;
                    };
                    if (var4 != 0) {
                        var5 += 174244616;
                        var5 ^= 655717534;
                        var5 &= 2003960792;
                        var5 ^= -802948365;
                        var8 = var4;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var75;
                        int var70 = (var75 = var8 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                        if (var70 == 0) {
                            return false;
                        }
                        break label61;
                    }

                    var5 *= -1264278591;
                    var5 ^= -2100537420;
                    var5 += -191319587;
                    var5 *= 1114660299;
                    var5 ^= -643926402;
                    int var65 = var4 + 1;
                    int var66 = var4 * var65;
                    int var67 = var66 & 1;
                    if (var67 != 0) {
                        break label61;
                    }

                    var1.Q = this;
                    Integer var59 = var7;
                    if (var59 != null) {
                        var5 += -327910966;
                        var5 ^= -1304342319;
                        var5 >>>= 27;
                        var5 ^= -321569512;
                        var5 ^= 166095752;
                        Integer var53 = var4;
                        if (var53 != null) {
                            this.M(var1, var2, var3);
                            return true;
                        }
                        break label61;
                    }

                    switch (var5) {
                        case 1209193384:
                            var5 >>>= 25;
                            var5 &= 1368013263;
                            var5 -= 1478311696;
                            var5 ^= 236207584;
                            break;
                        case 1575804696:
                            var5 ^= 831747835;
                            break;
                        case 1993475140:
                        default:
                            var5 ^= -1958362556;
                    }
                }
            }

            IllegalArgumentException var60 = new IllegalArgumentException();
            throw var60;
        }

        AssertionError var58 = new AssertionError();
        throw var58;
    }

    @Override
    public void M(jX var1, float var2, float var3) {
        int var4 = Y;
        var4 ^= -2059678632;
        int var5 = System.identityHashCode(this);
        Uq var6 = this.Uw;
        float var7 = this.U;
        var7 = var2 - var7;
        float var8 = this.pP;
        var8 = Math.max(1.0F, var8);
        int var9 = var5 + 1;
        var9 = var5 * var9;
        int var10 = var5 + 2;
        var9 *= var10;
        var5 += 3;
        var9 *= var5;
        var5 = var9 & 7;
        if (var5 != 0) {
            Integer var24 = switch (var4) {
                default -> var4 ^ -1601016720;
                case 343657482 -> {
                    var4 += -1955236724;
                    var4 ^= -1418181035;
                    var4 -= 1419281608;
                    var4 ^= -1829976271;
                    yield var4 ^ 1691837887;
                }
                case 1577354535 -> var4 ^ -1758218022;
            };
            if (var24 != null) {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            } else {
                RuntimeException var25 = new RuntimeException();
                throw var25;
            }
        } else {
            var4 *= 1362434075;
            var4 -= 224223139;
            var4 ^= -137659039;
            float var15 = var7 / var8;
            float var16 = TP.S(var15);
            var6.U(var16);
        }
    }

    @Override
    public void u(jX var1) {
        int var2 = Y;
        var2 ^= 1471632508;
        int var3 = System.identityHashCode(this);
        long var36 = var3;
        long var5 = var36 + 1L;
        var5 = var36 * var5;
        long var37 = var5 & 1L;
        long var46;
        var3 = (var46 = var37 - 0L) == 0L ? 0 : (var46 < 0L ? -1 : 1);
        label35:
        if (var3 == 0) {
            var2 <<= 13;
            var2 <<= 28;
            var2 += -1161823739;
            var2 ^= 941465840;
            Object var43 = var1.Q;
            if (var43 == this) {
                var2 -= -153491703;
                var2 += -1698069288;
                var2 &= 1362674898;
                var2 ^= 1176640421;
                Integer var44 = var2;
                if (var44 == null) {
                    break label35;
                }

                var1.Q = null;
                switch (var2) {
                    case 539640401:
                        var2 ^= -883743839;
                        break;
                    case 1177738085:
                        var2 &= 1059349717;
                        var2 |= 1123496888;
                        var2 -= -1280593589;
                        var2 ^= 1763639603;
                        break;
                    case 1305378105:
                    default:
                        var2 ^= 128004073;
                }
            } else {
                switch (var2) {
                    case -2103289099:
                        var2 |= 1382156412;
                        var2 ^= -781250963;
                        var2 >>>= 30;
                        var2 ^= -95108223;
                        break;
                    case -1018480295:
                        var2 ^= -1508280419;
                        break;
                    case 1487097214:
                    default:
                        var2 ^= 122291632;
                }
            }

            return;
        } else {
            var2 -= -598320591;
            var2 &= 702523593;
            var2 += -1786382759;
            var2 ^= 637453927;
            var3 = var2 + 1;
            var3 = var2 * var3;
            int var4 = var2 + 2;
            var3 *= var4;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        }

        IllegalStateException var29 = new IllegalStateException();
        throw var29;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1392735789;
        int var2 = XR.Mz;
        int var4 = of_2.xF(var3, var1, var2);
        Y = var4;
    }
}
