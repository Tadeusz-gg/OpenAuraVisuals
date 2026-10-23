package mvggs.modules.hud;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class combocounter extends Module {
    private final NumberSetting zh;
    private final NumberSetting d;
    private final XF Ru;
    private final XF x;
    private int Qp;
    private float H;
    public static final int Y;

    public combocounter() {
        super("combo_counter", "Combo Counter", ModuleCategory.HUD);
        ModuleCategory var1 = ModuleCategory.HUD;

        NumberSetting var3 = new NumberSetting("min_combo", "Show From", 2.0F, 1.0F, 10.0F);
        NumberSetting var4 = var3.W(1.0F);
        Setting var5 = this.addSetting(var4);
        NumberSetting var6 = (NumberSetting)var5;
        this.zh = var6;
        NumberSetting var7 = new NumberSetting("hold", "Hold Time", 1.6F, 0.5F, 4.0F);
        NumberSetting var8 = var7.W(0.1F);
        NumberSetting var9 = var8.L("s");
        Setting var10 = this.addSetting(var9);
        NumberSetting var11 = (NumberSetting)var10;
        this.d = var11;
        kE_2 var2 = kE_2.uY(0.32F, 0.4F);
        XF var12 = new XF(1.0F, var2);
        this.Ru = var12;
        var2 = kE_2.SMOOTH;
        XF var13 = new XF(0.0F, var2);
        this.x = var13;
        this.H = Float.MAX_VALUE;
        this.dy("Shows your current hit combo next to the crosshair.");
        this.fJ(true);
        EventListener<HitEvent> var14 = (HitEvent var1x) -> {
            label68: {
                int var2x = Y;
                var2x ^= 872880460;
                int var3x = System.identityHashCode(this);
                int var4x = var3x + 1;
                var4x = var3x * var4x;
                var4x &= 1;
                if (var4x != 0) {
                    switch (var2x) {
                        case -1760627634:
                            var2x ^= -1042264515;
                            break;
                        case -30433951:
                            var2x |= -521536311;
                            var2x &= -1713864471;
                            var2x ^= -1564585772;
                            break;
                        case 1202352382:
                        default:
                            var2x ^= -1846218331;
                    }
                } else {
                    label71: {
                        var2x = switch (var2x) {
                            case -1478844496 -> var2x ^ -236864740;
                            case -30433951 -> {
                                var2x &= -12272626;
                                var2x ^= 419003238;
                                yield var2x ^ -984253569;
                            }
                            default -> var2x ^ 1945258745;
                        };
                        var4x = var2x + 1;
                        var4x = var2x * var4x;
                        var4x &= 1;
                        if (var4x != 0) {
                            break label68;
                        }

                        var4x = var1x.combo();
                        this.Qp = var4x;
                        this.H = 0.0F;
                        var4x = this.Qp;
                        NumberSetting var5x = this.zh;
                          int var61 = var5x.B();
                        if (var4x >= var61) {
                            var2x -= -743494666;
                            var2x &= 1099710307;
                            var2x &= -1055037685;
                            var2x ^= -1970330714;
                            var4x = var2x + 1;
                            var4x = var2x * var4x;
                            int var62 = var2x + 2;
                            var4x *= var62;
                            int var63 = var2x + 3;
                            var4x *= var63;
                            var4x &= 7;
                            if (var4x != 0) {
                                break label68;
                            }

                            XF var58 = this.Ru;
                            Integer var38 = var3x;
                            if (var38 == null) {
                                switch (var2x) {
                                    case -1410042120:
                                    default:
                                        var2x ^= 301726444;
                                        break label71;
                                    case -880344155:
                                        var2x += 1805161242;
                                        var2x ^= 225003138;
                                        break label71;
                                    case 2136378032:
                                        var2x ^= 1910510861;
                                        break label71;
                                }
                            }

                            var2x ^= 649919500;
                            var2x >>= 15;
                            var2x |= -1137177357;
                            var2x -= -2134793771;
                            var2x ^= 2004242142;
                            long var64 = var2x;
                            long var7x = var64 + 1L;
                            var7x = var64 * var7x;
                            long var65 = var7x & 1L;
                            long var69;
                            int var39 = (var69 = var65 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                            if (var39 != 0) {
                                break label68;
                            }

                            var58.v(2.5F);
                            var2x -= 1444785240;
                            var2x >>>= 14;
                            var2x -= -486514960;
                            var2x &= -1883960310;
                            var2x ^= -1162286227;
                        } else {
                            switch (var2x) {
                                case -1465164952:
                                default:
                                    var2x ^= 109524972;
                                    break;
                                case -1259806859:
                                    var2x ^= -1498889255;
                                    break;
                                case 598252569:
                                    var2x |= -351768884;
                                    var2x *= 844522565;
                                    var2x ^= 1216004000;
                                    var2x ^= -1348773546;
                            }
                        }

                        long var32 = var2x;
                        long var59 = var32 + 1L;
                        long var60 = var32 * var59;
                        long var33 = var60 & 1L;
                        long var70;
                        var2x = (var70 = var33 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                        if (var2x == 0) {
                            return;
                        }
                        break label68;
                    }
                }

                var3x = var2x + 1;
                var3x = var2x * var3x;
                int var66 = var2x + 2;
                var3x *= var66;
                var66 = var2x + 3;
                var3x *= var66;
                var3x &= 7;
                if (var3x == 0) {
                    RuntimeException var45 = new RuntimeException();
                    throw var45;
                }
            }

            UnsupportedOperationException var37 = new UnsupportedOperationException();
            throw var37;
        };
        this.onEvent(HitEvent.class, var14);
        EventListener<RenderEvent> var15 = this::As;
        this.onEvent(RenderEvent.class, var15);
    }

    private void As(RenderEvent var1) {
        boolean var205 = false;
        label235: {
            int var2 = Y;
            var2 ^= -1053898122;
            int var3 = System.identityHashCode(this);
            long var4 = var3;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var362;
            int var170 = (var362 = var4 - 0L) == 0L ? 0 : (var362 < 0L ? -1 : 1);
            if (var170 != 0) {
                switch (var2) {
                    case -878990705:
                        var2 ^= 1947916795;
                        break;
                    case 184962651:
                        var2 += 1888712232;
                        var2 *= 382336455;
                        var2 ^= 468892779;
                        var2 ^= 1732147597;
                        break;
                    case 712521052:
                    default:
                        var2 ^= -389945842;
                }
            } else {
                var2 <<= 12;
                var2 += -2061788137;
                var2 += 392470306;
                var2 -= -1075601424;
                var2 ^= 165810091;
                int var171 = var2 + 1;
                int var172 = var2 * var171;
                int var173 = var172 & 1;
                if (var173 != 0) {
                    break label235;
                }

                RenderPhase var174 = var1.phase();
                RenderPhase var5 = RenderPhase.UNDERLAY;
                if (var174 != var5) {
                    var2 |= 953276203;
                    var2 &= 471398266;
                    var2 |= -1138990766;
                    var2 |= -2027475017;
                    var2 ^= -490280082;
                    Integer var185 = var2;
                    if (var185 != null) {
                        return;
                    }
                    break label235;
                }

                var2 ^= -2056914451;
                var2 ^= 508299446;
                FrameContext var175 = var1.frame();
                float var176 = var175.dt();
                float var186 = this.H;
                float var187 = var186 + var176;
                this.H = var187;
                long var188 = var3;
                long var7 = var188 + 1L;
                var7 = var188 * var7;
                long var9 = var188 + 2L;
                var7 *= var9;
                long var189 = var188 + 3L;
                var7 *= var189;
                long var190 = var7 & 7L;
                long var363;
                int var191 = (var363 = var190 - 0L) == 0L ? 0 : (var363 < 0L ? -1 : 1);
                if (var191 != 0) {
                    var2 |= 1773093952;
                    var2 -= -1557629884;
                    var2 -= 2126839665;
                    var2 ^= 1045856119;
                } else {
                    label239: {
                        var2 += -1666415797;
                        var2 ^= -1746497692;
                        int var192 = var2 + 1;
                        int var193 = var2 * var192;
                        int var217 = var2 + 2;
                        int var194 = var193 * var217;
                        int var218 = var2 + 3;
                        int var195 = var194 * var218;
                        int var196 = var195 & 7;
                        if (var196 != 0) {
                            break label235;
                        }

                        label229: {
                            int var197 = this.Qp;
                            NumberSetting var219 = this.zh;
                              int var220 = var219.B();
                            if (var197 >= var220) {
                                var2 |= 774794379;
                                var2 >>>= 31;
                                var2 &= -1123783417;
                                var2 ^= -1312637531;
                                var2 ^= 1690557948;
                                float var198 = this.H;
                                var6 = var3;
                                var8 = var6 + 1L;
                                var8 = var6 * var8;
                                var6 = var8 & 1L;
                                long var364;
                                int var223 = (var364 = var6 - 0L) == 0L ? 0 : (var364 < 0L ? -1 : 1);
                                if (var223 != 0) {
                                    var2 ^= -910248166;
                                    var2 ^= -118805903;
                                    break label239;
                                }

                                var2 &= 662912416;
                                var2 |= -1077191065;
                                var2 ^= -321700675;
                                NumberSetting var224 = this.d;
                                float var225 = var224.WM();
                                float var365;
                                int var199 = (var365 = var198 - var225) == 0.0F ? 0 : (var365 < 0.0F ? -1 : 1);
                                if (var199 < 0) {
                                    var2 |= 1181620354;
                                    var2 ^= -1305515139;
                                    int var200 = var2 + 1;
                                    int var201 = var2 * var200;
                                    int var226 = var2 + 2;
                                    int var202 = var201 * var226;
                                    int var227 = var2 + 3;
                                    int var203 = var202 * var227;
                                    int var204 = var203 & 7;
                                    if (var204 != 0) {
                                        break label235;
                                    }

                                    var205 = true;
                                    var2 -= 444068393;
                                    var2 ^= 1337089990;
                                    var2 ^= -2040912389;
                                    break label229;
                                }

                                var2 |= -235682334;
                                var2 &= 4180508;
                                var2 &= 2117635894;
                                var2 ^= -1476691847;
                            } else {
                                var2 >>= 12;
                                var2 -= 2104122458;
                                var2 -= -452901016;
                                var2 += 884222800;
                                var2 ^= 1972105968;
                            }

                            var205 = false;
                            var2 ^= 184983261;
                            var2 *= 2069218707;
                            var2 ^= 78254623;
                        }

                        Integer var228 = var3;
                        if (var228 == null) {
                            var2 -= -942482083;
                            var2 >>>= 25;
                            var2 -= -1306154352;
                            var2 ^= -1450268482;
                        } else {
                            var2 >>>= 28;
                            var2 ^= 283766512;
                            var6 = var2;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var366;
                            int var231 = (var366 = var6 - 0L) == 0L ? 0 : (var366 < 0L ? -1 : 1);
                            if (var231 != 0) {
                                break label235;
                            }

                            XF var232 = this.x;
                            float var206;
                            if (var205) {
                                var2 >>= 13;
                                var2 >>= 9;
                                var2 |= -73912339;
                                var2 &= 379070392;
                                var2 ^= 1533119171;
                                var206 = 1.0F;
                                switch (var2) {
                                    case -2052582408:
                                    default:
                                        var2 ^= -1525259162;
                                        break;
                                    case -1841328004:
                                        var2 ^= 413397531;
                                        break;
                                    case 1241099627:
                                        var2 ^= 1807960559;
                                        var2 -= -1392697102;
                                        var2 -= -301698454;
                                        var2 ^= 228149682;
                                }
                            } else {
                                var2 *= -1396624097;
                                var2 >>= 25;
                                var2 >>>= 2;
                                var2 ^= -1099570953;
                                var2 ^= 119626619;
                                var206 = 0.0F;
                                var2 ^= -1304764323;
                                var2 ^= -1104036688;
                            }

                            Integer var254 = var2;
                            if (var254 == null) {
                                break label235;
                            }

                            var232.H(var206);
                            XF var207 = this.x;
                            float var208 = var207.N(var176);
                            Integer var233 = var3;
                            if (var233 != null) {
                                var2 |= 565902831;
                                var2 ^= 307604519;
                                int var234 = var2 + 1;
                                int var235 = var2 * var234;
                                int var236 = var235 & 1;
                                if (var236 != 0) {
                                    break label235;
                                }

                                XF var237 = this.Ru;
                                var237.H(1.0F);
                                XF var238 = this.Ru;
                                float var177 = var238.N(var176);
                                float var367;
                                int var239 = (var367 = var208 - 0.01F) == 0.0F ? 0 : (var367 < 0.0F ? -1 : 1);
                                if (var239 < 0) {
                                    switch (var2) {
                                        case -1175498280:
                                            var2 -= -32088085;
                                            var2 |= -1451577916;
                                            var2 += 339119595;
                                            var2 ^= -2059627015;
                                            return;
                                        case 1107053261:
                                            var2 ^= 1510351065;
                                            return;
                                        case 1219038273:
                                        default:
                                            var2 ^= -1559161304;
                                            return;
                                    }
                                }

                                var2 += 1374506458;
                                var2 += -2134273485;
                                var2 ^= 1806835100;
                                var2 ^= 33000906;
                                var2 ^= -732399105;
                                Integer var240 = var2;
                                if (var240 == null) {
                                    break label235;
                                }

                                FrameContext var241 = var1.frame();
                                var7 = var3;
                                var9 = var7 + 1L;
                                var9 = var7 * var9;
                                long var11 = var7 + 2L;
                                var9 *= var11;
                                var7 += 3L;
                                var9 *= var7;
                                var7 = var9 & 7L;
                                long var368;
                                int var258 = (var368 = var7 - 0L) == 0L ? 0 : (var368 < 0L ? -1 : 1);
                                if (var258 != 0) {
                                    var2 >>= 21;
                                    var2 *= 1827160931;
                                    var2 >>>= 13;
                                    var2 -= -1141947519;
                                    var2 ^= -1605901024;
                                } else {
                                    var2 ^= -1875115261;
                                    var2 ^= -1965134524;
                                    int var259 = var2 + 1;
                                    int var260 = var2 * var259;
                                    int var261 = var260 & 1;
                                    if (var261 != 0) {
                                        break label235;
                                    }

                                    boolean var242 = var241.hideGui();
                                    if (var242) {
                                        switch (var2) {
                                            case 557868458:
                                            default:
                                                var2 ^= 1352992690;
                                                return;
                                            case 676967947:
                                                var2 *= -885247075;
                                                var2 ^= 1423035294;
                                                return;
                                            case 816017198:
                                                var2 ^= 1887062521;
                                                return;
                                        }
                                    }

                                    var2 -= 945327342;
                                    var2 += 1427292232;
                                    var2 ^= -548333361;
                                    Integer var243 = var2;
                                    if (var243 == null) {
                                        break label235;
                                    }

                                    FrameContext var244 = var1.frame();
                                    boolean var245 = var244.screenOpen();
                                    var7 = var3;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var7 = var9 & 1L;
                                    long var369;
                                    int var264 = (var369 = var7 - 0L) == 0L ? 0 : (var369 < 0L ? -1 : 1);
                                    if (var264 != 0) {
                                        var2 &= -552720238;
                                        var2 ^= 2119622065;
                                    } else {
                                        var2 >>= 25;
                                        var2 |= 1749157219;
                                        var2 += -230234461;
                                        var2 ^= -1161046922;
                                        var2 ^= -1830832;
                                        var7 = var2;
                                        var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        var11 = var7 + 2L;
                                        var9 *= var11;
                                        var7 += 3L;
                                        var9 *= var7;
                                        var7 = var9 & 7L;
                                        long var370;
                                        int var268 = (var370 = var7 - 0L) == 0L ? 0 : (var370 < 0L ? -1 : 1);
                                        if (var268 != 0) {
                                            break label235;
                                        }

                                        if (var245) {
                                            switch (var2) {
                                                case -1217846604:
                                                    var2 -= -1439693914;
                                                    var2 ^= 1479803183;
                                                    return;
                                                case 1216985903:
                                                    var2 ^= 1351793021;
                                                    return;
                                                case 1993791869:
                                                default:
                                                    var2 ^= 312876161;
                                                    return;
                                            }
                                        }

                                        var2 |= 237480008;
                                        var2 *= -221231881;
                                        var2 |= -731108821;
                                        var2 *= -688981731;
                                        var2 ^= 1254702100;
                                        var6 = var2;
                                        var8 = var6 + 1L;
                                        var8 = var6 * var8;
                                        long var10 = var6 + 2L;
                                        var8 *= var10;
                                        var6 += 3L;
                                        var8 *= var6;
                                        var6 = var8 & 7L;
                                        long var371;
                                        int var249 = (var371 = var6 - 0L) == 0L ? 0 : (var371 < 0L ? -1 : 1);
                                        if (var249 != 0) {
                                            break label235;
                                        }

                                        Canvas var250 = var1.canvas();
                                        int var269 = this.Qp;
                                        int var270 = var269 - 2;
                                        float var271 = var270;
                                        float var272 = var271 / 8.0F;
                                        float var273 = TP.S(var272);
                                        var8 = var3;
                                        var10 = var8 + 1L;
                                        var10 = var8 * var10;
                                        long var12 = var8 + 2L;
                                        var10 *= var12;
                                        var8 += 3L;
                                        var10 *= var8;
                                        var8 = var10 & 7L;
                                        long var372;
                                        int var294 = (var372 = var8 - 0L) == 0L ? 0 : (var372 < 0L ? -1 : 1);
                                        label204:
                                        if (var294 == 0) {
                                            var2 &= -527521446;
                                            var2 |= 927824939;
                                            var2 ^= 1873599194;
                                            var8 = var2;
                                            var10 = var8 + 1L;
                                            var10 = var8 * var10;
                                            var12 = var8 + 2L;
                                            var10 *= var12;
                                            var8 += 3L;
                                            var10 *= var8;
                                            var8 = var10 & 7L;
                                            long var373;
                                            int var298 = (var373 = var8 - 0L) == 0L ? 0 : (var373 < 0L ? -1 : 1);
                                            if (var298 != 0) {
                                                break label235;
                                            }

                                            float var374;
                                            int var299 = (var374 = var273 - 0.5F) == 0.0F ? 0 : (var374 < 0.0F ? -1 : 1);
                                            int var307;
                                            if (var299 < 0) {
                                                var2 >>= 4;
                                                var2 += -2027764814;
                                                var2 *= -1556779561;
                                                var2 &= 1782530467;
                                                var2 ^= 1384534203;
                                                int var300 = var2 + 1;
                                                int var301 = var2 * var300;
                                                int var327 = var2 + 2;
                                                int var302 = var301 * var327;
                                                int var328 = var2 + 3;
                                                int var303 = var302 * var328;
                                                int var304 = var303 & 7;
                                                if (var304 != 0) {
                                                    break label235;
                                                }

                                                float var305 = var273 * 2.0F;
                                                int var306 = DP.Bp(-854017, -1850997, var305);
                                                Integer var329 = var3;
                                                if (var329 == null) {
                                                    switch (var2) {
                                                        case 152280726:
                                                        default:
                                                            var2 ^= -1862543665;
                                                            break label204;
                                                        case 1488588856:
                                                            var2 &= -1698978158;
                                                            var2 ^= -51446493;
                                                            break label204;
                                                        case 1912080579:
                                                            var2 ^= 1821351878;
                                                            break label204;
                                                    }
                                                }

                                                var2 *= 657980747;
                                                var2 ^= -342495691;
                                                var2 ^= -2009898621;
                                                var307 = var306;
                                                var2 ^= 1802291145;
                                                var2 ^= -91040338;
                                            } else {
                                                var2 = switch (var2) {
                                                    case -1738430543 -> {
                                                        var2 |= -337035059;
                                                        var2 &= -115478702;
                                                        yield var2 ^ -687366213;
                                                    }
                                                    case -1508855006 -> var2 ^ 1900646058;
                                                    default -> var2 ^ 1316533236;
                                                };
                                                Integer var330 = var2;
                                                if (var330 == null) {
                                                    break label235;
                                                }

                                                float var274 = var273 * 2.0F;
                                                int var276 = DP.Bp(-1850997, -1601135, --var274);
                                                int var331 = var3 + 1;
                                                int var332 = var3 * var331;
                                                int var333 = var332 & 1;
                                                if (var333 != 0) {
                                                    switch (var2) {
                                                        case -1633056456:
                                                        default:
                                                            var2 ^= -1547085947;
                                                            break label204;
                                                        case -439625473:
                                                            var2 ^= 1522222222;
                                                            break label204;
                                                        case 772700395:
                                                            var2 -= 431503575;
                                                            var2 ^= -339736822;
                                                            var2 ^= 465746477;
                                                            break label204;
                                                    }
                                                }

                                                var2 >>= 6;
                                                var2 <<= 31;
                                                var2 &= 1040864247;
                                                var2 ^= 1351668070;
                                                var9 = var2;
                                                var11 = var9 + 1L;
                                                var11 = var9 * var11;
                                                var9 = var11 & 1L;
                                                long var375;
                                                int var336 = (var375 = var9 - 0L) == 0L ? 0 : (var375 < 0L ? -1 : 1);
                                                if (var336 != 0) {
                                                    break label235;
                                                }

                                                var307 = var276;
                                                var2 &= 1892567117;
                                                var2 -= -1632890994;
                                                var2 ^= -1389592902;
                                                var2 |= -834680205;
                                                var2 ^= -936031290;
                                            }

                                            int var277 = var2 + 1;
                                            int var278 = var2 * var277;
                                            int var279 = var278 & 1;
                                            if (var279 != 0) {
                                                break label235;
                                            }

                                            float var308 = var250.width();
                                            float var309 = var308 * 0.5F;
                                            float var310 = var309 + 11.0F;
                                            float var337 = var250.height();
                                            float var338 = var337 * 0.5F;
                                            float var339 = var338 + 9.0F;
                                            var250.save();
                                            var250.alpha(var208);
                                            float var209 = var339 + 6.0F;
                                            var250.scale(var177, var310, var209);
                                            TextStyle var178 = TextStyle.of(9.5F, -854017);
                                            TextStyle var179 = var178.bold();
                                            TextStyle var180 = var179.weight(0.04F);
                                            int var210 = DP.Y(var307, 0.8F);
                                            TextStyle var181 = var180.shadow(var210, 0.0F, 0.32F);
                                            int var211 = this.Qp;
                                            String var212 = Integer.toString(var211);
                                            float var182 = var250.text(var212, var310, var339, var181);
                                            float var183 = var310 + var182;
                                            float var184 = var183 + 2.5F;
                                            float var213 = var339 + 3.2F;
                                            TextStyle var281 = TextStyle.of(4.6F, var307);
                                            TextStyle var282 = var281.bold();
                                            var8 = var3;
                                            var10 = var8 + 1L;
                                            var10 = var8 * var10;
                                            var12 = var8 + 2L;
                                            var10 *= var12;
                                            var8 += 3L;
                                            var10 *= var8;
                                            var8 = var10 & 7L;
                                            long var376;
                                            var3 = (var376 = var8 - 0L) == 0L ? 0 : (var376 < 0L ? -1 : 1);
                                            if (var3 == 0) {
                                                var2 *= 568895971;
                                                var2 ^= -27283602;
                                                var2 ^= 1956559106;
                                                var8 = var2;
                                                var10 = var8 + 1L;
                                                var10 = var8 * var10;
                                                var12 = var8 + 2L;
                                                var10 *= var12;
                                                var8 += 3L;
                                                var10 *= var8;
                                                var8 = var10 & 7L;
                                                long var377;
                                                var3 = (var377 = var8 - 0L) == 0L ? 0 : (var377 < 0L ? -1 : 1);
                                                if (var3 == 0) {
                                                    TextStyle var165 = var282.spacing(0.65F);
                                                    TextStyle var166 = var165.shadow(-1342177280, 0.35F, 0.12F);
                                                    float var167 = var250.text("COMBO", var184, var213, var166);
                                                    var250.restore();
                                                    return;
                                                }
                                                break label235;
                                            }

                                            var2 |= -254915493;
                                            var2 *= -316940659;
                                            var2 >>>= 28;
                                            var2 ^= -464192202;
                                        } else {
                                            var2 &= 710394356;
                                            var2 |= 1791354375;
                                            var2 &= 1077484594;
                                            var2 |= 1722088807;
                                            var2 ^= -2098134956;
                                        }
                                    }
                                }
                            } else {
                                var2 *= 1495929151;
                                var2 &= 1528148986;
                                var2 ^= -1236205871;
                            }
                        }
                    }
                }
            }

            Integer var155 = var2;
            if (var155 != null) {
                RuntimeException var156 = new RuntimeException();
                throw var156;
            }
        }

        IllegalArgumentException var162 = new IllegalArgumentException();
        throw var162;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -874710304;
        int var2 = Module.C;
        int var4 = of_2.xF(var3, var1, var2);
        Y = var4;
    }
}
