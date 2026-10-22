package mvggs.modules.client;

import dev.aurap.hub.*;

import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.RenderStats;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Locale;

public final class performance extends tR_2 {
    private static final float NE = 7.0F;
    private static final float C = 9.5F;
    private static final TextStyle VA;
    private static final TextStyle T;
    private TextStyle V;
    private TextStyle z;
    private final String[] Yf;
    private float w;
    public static final int GN;

    public performance() {
        super("performance_overlay", "Performance", AJ.CLIENT, Cl_2.TOP_LEFT, 4.0F, 23.0F, 2.0F);
        TextStyle var3 = VA;
        this.V = var3;
        TextStyle var4 = T;
        this.z = var4;
        String[] var5 = new String[4];
        this.Yf = var5;
        this.w = 1.0F;
        this.dy("FPS and render engine statistics.");
    }

    @Override
    protected void r(Oo var1) {
        int var2 = GN;
        var2 ^= -2033030875;
        int var3 = System.identityHashCode(this);
        TextStyle var4 = VA;
        int var5 = var1.MD();
        var4 = var4.color(var5);
        this.V = var4;
        var4 = T;
        var5 = var1.Hb();
        Integer var19 = var3;
        if (var19 != null) {
            var2 |= -1340695055;
            var2 -= -817726705;
            var2 -= 270547223;
            var2 ^= 391064078;
            var2 ^= -1762328208;
            long var6 = var2;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var28;
            int var20 = (var28 = var6 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var20 == 0) {
                TextStyle var22 = var4.color(var5);
                this.z = var22;
            } else {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        } else {
            var2 &= -1506389092;
            var2 ^= 1836451966;
            AssertionError var13 = new AssertionError();
            throw var13;
        }
    }

    @Override
    protected void eF() {
        int var1 = GN;
        var1 ^= 653920415;
        int var2 = System.identityHashCode(this);
        Ud var3 = Ud.Z();
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 == 0) {
            var1 &= -649432464;
            var1 &= 325947998;
            var1 ^= -1895560914;
            long var27 = var1;
            long var6 = var27 + 1L;
            var6 = var27 * var6;
            long var28 = var6 & 1L;
            long var30;
            var2 = (var30 = var28 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                AuraRenderer var23 = var3.ZP();
                var23.setTiming(true);
                return;
            }
        } else {
            var1 -= 1637178304;
            var1 -= 1475290649;
            var1 += 1976094887;
            var1 ^= 179070732;
            long var16 = var1;
            long var24 = var16 + 1L;
            long var25 = var16 * var24;
            long var17 = var25 & 1L;
            long var31;
            var1 = (var31 = var17 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    @Override
    protected void J() {
        int var1 = GN;
        var1 ^= -441110387;
        int var2 = System.identityHashCode(this);
        Ud var3 = Ud.Z();
        AuraRenderer var24 = var3.ZP();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var38;
        var2 = (var38 = var4 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += 617942411;
            var1 &= -553983204;
            var1 *= 1988433439;
            var1 -= 1756177065;
            var1 ^= 366187986;
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var39;
            var2 = (var39 = var4 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var2 != 0) {
                IllegalArgumentException var23 = new IllegalArgumentException();
                throw var23;
            } else {
                var24.setTiming(false);
            }
        } else {
            var1 |= 1906133878;
            var1 ^= -1200317324;
            var1 |= -1410453110;
            var1 ^= 895305570;
            RuntimeException var15 = new RuntimeException();
            throw var15;
        }
    }

    @Override
    protected boolean BM(lH_3 var1) {
        int var2 = GN;
        var2 ^= -1478117803;
        int var3 = System.identityHashCode(this);
        float var4 = this.w;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var5 &= 1;
        if (var5 != 0) {
            var2 &= -1964331732;
            var2 &= -253465664;
            var2 ^= 423478469;
        } else {
            label147: {
                label142: {
                    label143: {
                        var2 |= -1799131787;
                        var2 &= -1780595307;
                        var2 ^= 1642364489;
                        float var126 = var1.l();
                        var4 += var126;
                        this.w = var4;
                        float var228;
                        int var106 = (var228 = var4 - 0.25F) == 0.0F ? 0 : (var228 < 0.0F ? -1 : 1);
                        if (var106 < 0) {
                            var2 |= 657037979;
                            var2 *= -839828759;
                            var2 &= -787280400;
                            var2 ^= -238030472;
                            long var107 = var2;
                            long var6 = var107 + 1L;
                            var6 = var107 * var6;
                            long var108 = var6 & 1L;
                            long var229;
                            int var109 = (var229 = var108 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                            if (var109 != 0) {
                                break label142;
                            }

                            String[] var110 = this.Yf;
                            String var111 = var110[0];
                            Integer var127 = var3;
                            if (var127 == null) {
                                var2 += -1087502829;
                                var2 *= -1138051927;
                                var2 |= -1403248066;
                                var2 -= 905280490;
                                var2 ^= -1607097776;
                                break label147;
                            }

                            var2 |= 483105110;
                            var2 ^= 257783021;
                            var2 &= -878173836;
                            var2 += -1613331329;
                            var2 ^= 453116852;
                            int var128 = var2 + 1;
                            var128 = var2 * var128;
                            int var148 = var2 + 2;
                            var128 *= var148;
                            int var149 = var2 + 3;
                            var128 *= var149;
                            var128 &= 7;
                            if (var128 != 0) {
                                break label142;
                            }

                            if (var111 != null) {
                                var2 *= 51448473;
                                var2 -= -1262951422;
                                var2 -= -390451115;
                                var2 >>= 4;
                                var2 ^= -1235669127;
                                break label143;
                            }

                            var2 += -1720847827;
                            var2 ^= 531926256;
                        } else {
                            var2 ^= -2051546262;
                            var2 += -780996167;
                            var2 ^= 209075543;
                        }

                        this.w = 0.0F;
                        Ud var112 = Ud.Z();
                        AuraRenderer var113 = var112.ZP();
                        RenderStats var114 = var113.stats();
                        String[] var133 = this.Yf;
                        int var150 = i_2.r();
                        String var151 = var150 + " FPS";
                        var133[0] = var151;
                        String[] var134 = this.Yf;
                        Locale var152 = Locale.ROOT;
                        Object[] var7 = new Object[3];
                        int var8 = var114.instances();
                        Integer var203 = var8;
                        var7[0] = var203;
                        int var204 = var114.drawCalls();
                        Integer var205 = var204;
                        var7[1] = var205;
                        int var206 = var114.backdropCaptures();
                        Integer var207 = var206;
                        var7[2] = var207;
                        String var153 = String.format(var152, "%d shapes · %d draws · %d blur", var7);
                        var134[1] = var153;
                        String[] var135 = this.Yf;
                        Locale var154 = Locale.ROOT;
                        var7 = new Object[2];
                        double var208 = var114.cpuMs();
                        Integer var10 = var3;
                        if (var10 == null) {
                            switch (var2) {
                                case 139395199:
                                    var2 ^= 53440092;
                                    break label147;
                                case 321214399:
                                default:
                                    var2 ^= -1002441818;
                                    break label147;
                                case 1316418744:
                                    var2 &= -264435646;
                                    var2 |= -1994422546;
                                    var2 ^= -796767701;
                                    break label147;
                            }
                        }

                        var2 *= -855485597;
                        var2 -= -2092702411;
                        var2 >>>= 9;
                        var2 &= 766294914;
                        var2 ^= -1160513479;
                        Double var209 = var208;
                        var7[0] = var209;
                        double var210 = var114.gpuMs();
                        Double var115 = var210;
                        var7[1] = var115;
                        String var116 = String.format(var154, "cpu %.2f ms · gpu %.2f ms", var7);
                        var135[2] = var116;
                        String[] var117 = this.Yf;
                        String var136 = i_2.s();
                        String var155 = i_2.Fc();
                        String var137 = "MC " + var136 + " · " + var155;
                        var117[3] = var137;
                        var2 |= 364831976;
                        var2 += -822193217;
                        var2 -= 579237442;
                        var2 -= -677907168;
                        var2 ^= 599218653;
                    }

                    Integer var118 = var2;
                    if (var118 != null) {
                        String[] var119 = this.Yf;
                        String var120 = var119[0];
                        TextStyle var138 = this.V;
                        var4 = var1.me(var120, var138);
                        int var139 = 1;
                        int var156 = var3 + 1;
                        var156 = var3 * var156;
                        var156 &= 1;
                        if (var156 != 0) {
                            var2 -= 722136695;
                            var2 -= -1898103660;
                            var2 ^= -465739841;
                            break label147;
                        }

                        var2 *= 671667347;
                        var2 += 1497719702;
                        var2 -= -1741187783;
                        var2 -= 951869398;
                        var2 ^= 360069043;
                        Integer var159 = var2;
                        if (var159 != null) {
                            var4 = var4;
                            var139 = var139;

                            var2 = switch (var2) {
                                default -> var2 ^ -9153274;
                                case -1959459966 -> var2 ^ 1895017281;
                                case 1175637845 -> {
                                    var2 >>= 8;
                                    yield var2 ^ 422936102;
                                }
                            };

                            while (true) {
                                int var160 = var2 + 1;
                                var160 = var2 * var160;
                                var160 &= 1;
                                if (var160 != 0) {
                                    break;
                                }

                                String[] var163 = this.Yf;
                                int var186 = var3 + 1;
                                var186 = var3 * var186;
                                int var211 = var3 + 2;
                                var186 *= var211;
                                var211 = var3 + 3;
                                var186 *= var211;
                                var186 &= 7;
                                if (var186 != 0) {
                                    var2 &= 712254280;
                                    var2 |= -895450739;
                                    var2 |= 274048451;
                                    var2 &= 1260955353;
                                    var2 ^= 1402824716;
                                    break label147;
                                }
                                var2 = switch (var2) {
                                    case -671761684 -> var2 ^ -1985429955;
                                    case 426994921 -> {
                                        var2 -= -1933878400;
                                        var2 += -815250973;
                                        var2 -= 1591826413;
                                        var2 -= 785377281;
                                        yield var2 ^ -1090632279;
                                    }
                                    default -> var2 ^ 1255872813;
                                };
                                long var191 = var2;
                                long var9 = var191 + 1L;
                                var9 = var191 * var9;
                                long var192 = var9 & 1L;
                                long var230;
                                var186 = (var230 = var192 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                                if (var186 != 0) {
                                    break;
                                }

                                var160 = var163.length;
                                if (var139 >= var160) {
                                    var2 |= 109433753;
                                    var2 += 49909402;
                                    var2 += 226241259;
                                    var2 *= 1652976913;
                                    var2 ^= -1101162660;
                                    Integer var141 = var2;
                                    if (var141 != null) {
                                        var4 += 14.0F;
                                        TextStyle var142 = VA;
                                        float var143 = var142.size();
                                        float var144 = 14.0F + var143;
                                        String[] var174 = this.Yf;
                                        var160 = var174.length;
                                        float var177 = --var160;
                                        float var178 = 9.5F * var177;
                                        float var145 = var144 + var178;
                                        float var146 = var145 + 2.0F;
                                        long var179 = var3;
                                        long var213 = var179 + 1L;
                                        long var214 = var179 * var213;
                                        long var226 = var179 + 2L;
                                        long var215 = var214 * var226;
                                        long var180 = var179 + 3L;
                                        long var216 = var215 * var180;
                                        long var181 = var216 & 7L;
                                        long var231;
                                        var3 = (var231 = var181 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                                        if (var3 != 0) {
                                            var2 >>= 3;
                                            var2 += 595027212;
                                            var2 ^= -1701082841;
                                            var2 ^= -1416713283;
                                            break label147;
                                        }
                                        long var182 = switch (var2) {
                                            case 450140091 -> var2 ^ 956152327;
                                            case 697059992 -> {
                                                var2 *= -1033417885;
                                                yield var2 ^ -12569638;
                                            }
                                            default -> var2 ^ -683567629;
                                        };
                                        long var217 = var182 + 1L;
                                        long var218 = var182 * var217;
                                        var226 = var182 + 2L;
                                        long var219 = var218 * var226;
                                        long var183 = var182 + 3L;
                                        long var220 = var219 * var183;
                                        long var184 = var220 & 7L;
                                        long var232;
                                        var3 = (var232 = var184 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                                        if (var3 == 0) {
                                            this.dV(var4, var146);
                                            return true;
                                        }
                                    }
                                    break;
                                }

                                var2 *= -1924964791;
                                var2 ^= 1134623402;
                                var2 ^= -596410507;
                                var160 = var2 + 1;
                                var160 = var2 * var160;
                                var186 = var2 + 2;
                                var160 *= var186;
                                var186 = var2 + 3;
                                var160 *= var186;
                                var160 &= 7;
                                if (var160 != 0) {
                                    break;
                                }

                                String[] var170 = this.Yf;
                                String var171 = var170[var139];
                                TextStyle var196 = this.z;
                                float var172 = var1.me(var171, var196);
                                float var173 = Math.max(var4, var172);
                                long var197 = var3;
                                var9 = var197 + 1L;
                                var9 = var197 * var9;
                                long var11 = var197 + 2L;
                                var9 *= var11;
                                long var198 = var197 + 3L;
                                var9 *= var198;
                                long var199 = var9 & 7L;
                                long var233;
                                var186 = (var233 = var199 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                                if (var186 != 0) {
                                    var2 &= 1667954038;
                                    var2 |= 1976096252;
                                    var2 ^= 1853307193;
                                    break label147;
                                }

                                var2 ^= -1412292263;
                                var2 ^= 684971395;
                                var2 <<= 22;
                                var2 ^= 852789766;
                                Integer var201 = var2;
                                if (var201 == null) {
                                    break;
                                }

                                int var202 = var139 + 1;
                                var4 = var173;
                                var139 = var202;
                                switch (var2) {
                                    case -397112826:
                                        var2 ^= -892068786;
                                        var2 *= -345554009;
                                        var2 &= 1272434125;
                                        var2 ^= 292924449;
                                        break;
                                    case 1399025377:
                                        var2 ^= -1241904063;
                                        break;
                                    case 2000064272:
                                    default:
                                        var2 ^= -371013835;
                                }
                            }
                        }
                    }
                }

                AssertionError var104 = new AssertionError();
                throw var104;
            }
        }

        UnsupportedOperationException var101 = new UnsupportedOperationException();
        throw var101;
    }

    @Override
    protected void BO(hr var1, lH_3 var2) {
        int var3 = GN;
        var3 ^= -1190404793;
        int var4 = System.identityHashCode(this);
        float var5 = this.tQ();
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var29;
        var4 = (var29 = var6 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var4 == 0) {
            var3 &= -268158345;
            var3 *= 372229579;
            var3 ^= 759642266;
            float var23 = this.Yo();
            var1.Ky(0.0F, 0.0F, var5, var23, 8.0F);
        } else {
            Integer var16 = switch (var3) {
                default -> var3 ^ -1020626814;
                case 1014047044 -> {
                    var3 -= 411850949;
                    var3 &= 1240072472;
                    yield var3 ^ 1917044104;
                }
                case 1948143970 -> var3 ^ 1274236123;
            };
            if (var16 != null) {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            } else {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            }
        }
    }

    @Override
    protected void G(Canvas var1, lH_3 var2) {
        int var3 = GN;
        var3 ^= -1894542968;
        int var4 = System.identityHashCode(this);
        Integer var5 = var4;
        if (var5 == null) {
            switch (var3) {
                case -460485107:
                default:
                    var3 ^= 1857397438;
                    break;
                case 105007172:
                    var3 ^= -733390558;
                    break;
                case 174681483:
                    var3 <<= 24;
                    var3 ^= -357370572;
            }
        } else {
            label63: {
                var3 = switch (var3) {
                    case -2099363448 -> var3 ^ 1122796135;
                    case 174681483 -> {
                        var3 <<= 2;
                        yield var3 ^ -1524053275;
                    }
                    default -> var3 ^ -1893519035;
                };
                String[] var55 = this.Yf;
                String var56 = var55[0];
                TextStyle var6 = this.V;
                float var57 = var1.text(var56, 7.0F, 6.5F, var6);
                byte var58 = 1;
                int var59 = var58;
                var3 <<= 8;
                var3 |= -311057431;
                var3 &= 22579896;
                var3 ^= -2135023811;

                while (true) {
                    String[] var60 = this.Yf;
                    int var61 = var60.length;
                    Integer var7 = var4;
                    if (var7 == null) {
                        var3 += 48849057;
                        var3 -= 1778676708;
                        var3 &= -1333039484;
                        var3 ^= 1899624244;
                        break label63;
                    }

                    var3 &= -1330130326;
                    var3 ^= 1969159389;
                    var3 >>>= 3;
                    var3 ^= 290972993;
                    long var72 = var3;
                    long var9 = var72 + 1L;
                    var9 = var72 * var9;
                    long var73 = var9 & 1L;
                    long var88;
                    int var74 = (var88 = var73 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                    if (var74 != 0) {
                        break;
                    }

                    if (var59 >= var61) {
                        var3 |= 556987744;
                        var3 += -1597710434;
                        var3 &= -962225293;
                        var3 >>= 4;
                        var3 ^= 1214972510;
                        long var51 = var3;
                        long var70 = var51 + 1L;
                        long var71 = var51 * var70;
                        long var52 = var71 & 1L;
                        long var89;
                        var4 = (var89 = var52 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            return;
                        }
                        break;
                    }
                    var3 = switch (var3) {
                        case -1666023879 -> var3 ^ -1864453342;
                        case 266922202 -> {
                            var3 -= 1040274222;
                            var3 += 1108685383;
                            yield var3 ^ 1679676739;
                        }
                        default -> var3 ^ 1310897229;
                    };
                    String[] var62 = this.Yf;
                    String var63 = var62[var59];
                    TextStyle var75 = VA;
                    float var76 = var75.size();
                    float var77 = 7.0F + var76;
                    float var78 = var77 + 2.0F;
                    int var8 = var59 - 1;
                    float var80 = var8;
                    float var81 = 9.5F * var80;
                    float var79 = var78 + var81;
                    TextStyle var82 = this.z;
                    float var64 = var1.text(var63, 7.0F, var79, var82);
                    long var65 = var4;
                    long var83 = var65 + 1L;
                    long var84 = var65 * var83;
                    long var10 = var65 + 2L;
                    long var85 = var84 * var10;
                    long var66 = var65 + 3L;
                    long var86 = var85 * var66;
                    long var67 = var86 & 7L;
                    long var90;
                    int var68 = (var90 = var67 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                    if (var68 != 0) {
                        var3 ^= -1053285803;
                        var3 |= -1676956649;
                        var3 ^= -546747965;
                        break label63;
                    }

                    var3 += -661016032;
                    var3 *= -159649519;
                    var3 += 852957926;
                    var3 ^= 1740345580;
                    int var69 = var59 + 1;
                    var59 = var69;
                    var3 *= 2020320913;
                    var3 ^= -2143260710;
                    var3 <<= 7;
                    var3 |= -1439302410;
                    var3 ^= 1847159139;
                }

                UnsupportedOperationException var54 = new UnsupportedOperationException();
                throw var54;
            }
        }

        UnsupportedOperationException var50 = new UnsupportedOperationException();
        throw var50;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -162092723;
        int var2 = tR_2.qG;
        int var4 = of_2.xF(var3, var1, var2);
        GN = var4;
        TextStyle var5 = TextStyle.of(9.0F, -1);
        TextStyle var6 = var5.semibold();
        TextStyle var7 = var6.tabular();
        VA = var7;
        TextStyle var8 = TextStyle.of(7.0F, -1);
        TextStyle var9 = var8.tabular();
        T = var9;
    }
}
