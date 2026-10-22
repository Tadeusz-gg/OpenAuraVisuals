package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.Optional;

public final class Az {
    public static final String i = "hit";
    public static final String k = "crit";
    public static final String h = "sweep";
    public static final String Q = "custom_crit";
    public static final String hb = "custom_sweep";
    public static final String Zc = "heavy";
    public static final String nR = "kill";
    public static final String B = "totem";
    public static final String Kb = "ui_click";
    public static final String E = "ui_toggle_on";
    public static final String H = "ui_toggle_off";
    public static final String Bm = "ui_open";
    public static final String W = "ui_close";
    public static final String O = "ui_chime_on";
    public static final String Lg = "ui_chime_off";
    public static final String V = "bell";
    public static final String fn = "bonk";
    public static final String m = "bubble";
    public static final String M = "pok";
    public static final String KW = "magic";
    public static final String u = "get";
    public static final String mj = "custom";
    public static final String l = "voice_on";
    public static final String Z = "voice_off";
    public static final String SR = "death_wasted";
    public static final String I = "death_souls";
    public static final String J = "death_flatline";
    public static final String C = "death_eliminated";
    public static final String a = "death_custom";
    private static final String[] lK;
    public static final int kT;

    private Az() {
    }

    public static void AL(Fp var0) {
        label213: {
            int var1 = kT;
            var1 ^= 1224571427;
            int var2 = System.identityHashCode(var0);
            hn var3 = Pd.gz("hit");
            WK var4 = WK.vY("auravisuals:hit.tick");
            var4 = var4.volume(0.8F);
            var4 = var4.jitter(0.04F, 0.05F);
            var3 = var3.Y(var4);
            var3 = var3.d(35);
            var3 = var3.Xp(0.045F, 6, 1200);
            Pd var115 = var3.gI();
            var0.wb(var115);
            var3 = Pd.gz("crit");
            var4 = WK.vY("auravisuals:hit.crit");
            var4 = var4.volume(0.75F);
            var4 = var4.jitter(0.03F, 0.05F);
            var3 = var3.Y(var4);
            var4 = WK.vY("auravisuals:hit.tick");
            var4 = var4.volume(0.35F);
            var4 = var4.pitch(1.25F);
            var3 = var3.Y(var4);
            var3 = var3.d(35);
            var3 = var3.Xp(0.04F, 6, 1200);
            Pd var121 = var3.gI();
            var0.wb(var121);
            var3 = Pd.gz("sweep");
            var4 = WK.vY("auravisuals:hit.pok");
            var4 = var4.volume(0.65F);
            var4 = var4.pitch(0.8F);
            var3 = var3.Y(var4);
            var3 = var3.d(75);
            Pd var125 = var3.gI();
            var0.wb(var125);
            var3 = Pd.gz("custom_crit");
            var4 = WK.vY("auravisuals:hit.custom_crit");
            var3 = var3.Y(var4);
            var3 = var3.d(150);
            Pd var129 = var3.gI();
            var0.wb(var129);
            var3 = Pd.gz("custom_sweep");
            var4 = WK.vY("auravisuals:hit.custom_sweep");
            var3 = var3.Y(var4);
            var3 = var3.d(150);
            Pd var133 = var3.gI();
            var0.wb(var133);
            var3 = Pd.gz("heavy");
            var4 = WK.vY("auravisuals:hit.heavy");
            var4 = var4.volume(0.9F);
            var4 = var4.jitter(0.05F, 0.05F);
            var3 = var3.Y(var4);
            var3 = var3.d(60);
            Pd var137 = var3.gI();
            var0.wb(var137);
            var3 = Pd.gz("kill");
            var4 = WK.vY("auravisuals:hit.heavy");
            var4 = var4.volume(0.7F);
            var4 = var4.pitch(0.8F);
            var3 = var3.Y(var4);
            var4 = WK.vY("auravisuals:kill.confirm");
            var4 = var4.volume(0.9F);
            var4 = var4.delay(40);
            var3 = var3.Y(var4);
            var3 = var3.d(250);
            Pd var142 = var3.gI();
            var0.wb(var142);
            var3 = Pd.gz("totem");
            var4 = WK.vY("auravisuals:totem.pop");
            var4 = var4.volume(0.9F);
            var4 = var4.jitter(0.02F, 0.0F);
            var3 = var3.Y(var4);
            var3 = var3.d(200);
            Pd var146 = var3.gI();
            var0.wb(var146);
            var3 = Pd.gz("ui_click");
            var4 = WK.vY("auravisuals:ui.click");
            var4 = var4.volume(0.45F);
            var3 = var3.Y(var4);
            var3 = var3.d(20);
            Pd var150 = var3.gI();
            var0.wb(var150);
            var3 = Pd.gz("ui_toggle_on");
            var4 = WK.vY("auravisuals:ui.toggle_on");
            var4 = var4.volume(0.45F);
            var3 = var3.Y(var4);
            Pd var153 = var3.gI();
            var0.wb(var153);
            var3 = Pd.gz("ui_toggle_off");
            var4 = WK.vY("auravisuals:ui.toggle_off");
            var4 = var4.volume(0.45F);
            var3 = var3.Y(var4);
            Pd var156 = var3.gI();
            var0.wb(var156);
            var3 = Pd.gz("ui_open");
            var4 = WK.vY("auravisuals:ui.open");
            var4 = var4.volume(0.5F);
            var3 = var3.Y(var4);
            var3 = var3.d(100);
            Pd var160 = var3.gI();
            var0.wb(var160);
            var3 = Pd.gz("ui_close");
            var4 = WK.vY("auravisuals:ui.close");
            var4 = var4.volume(0.45F);
            var3 = var3.Y(var4);
            var3 = var3.d(100);
            Pd var164 = var3.gI();
            var0.wb(var164);
            var3 = Pd.gz("ui_chime_on");
            var4 = WK.vY("auravisuals:ui.chime_on");
            var4 = var4.volume(0.4F);
            var3 = var3.Y(var4);
            Pd var167 = var3.gI();
            var0.wb(var167);
            var3 = Pd.gz("ui_chime_off");
            var4 = WK.vY("auravisuals:ui.chime_off");
            var4 = var4.volume(0.4F);
            var3 = var3.Y(var4);
            Pd var170 = var3.gI();
            var0.wb(var170);
            String[] var171 = lK;
            String[] var172 = var171;
            Integer var218 = var2;
            if (var218 == null) {
                var1 |= 2102326386;
                var1 ^= 201225298;
            } else {
                label210: {
                    var1 ^= -109816550;
                    var1 ^= -685501279;
                    long var219 = var1;
                    long var6 = var219 + 1L;
                    var6 = var219 * var6;
                    long var220 = var6 & 1L;
                    long var334;
                    int var221 = (var334 = var220 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                    if (var221 != 0) {
                        break label213;
                    }

                    int var222 = var171.length;
                    int var223 = var222;
                    int var5 = 0;
                    var5 = var5;
                    var1 -= -165916787;
                    var1 *= -1153917219;
                    var1 ^= -1949286194;

                    while (var5 < var223) {
                        var1 += 434527500;
                        var1 >>>= 26;
                        var1 ^= 1619702499;
                        var6 = var1;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var335;
                        int var249 = (var335 = var6 - 0L) == 0L ? 0 : (var335 < 0L ? -1 : 1);
                        if (var249 != 0) {
                            break label213;
                        }

                        String var250 = var172[var5];
                        hn var7 = Pd.gz(var250);
                        String var288 = "auravisuals:hit." + var250;
                        WK var289 = WK.vY(var288);
                        var7 = var7.Y(var289);
                        var7 = var7.d(150);
                        Pd var256 = var7.gI();
                        var0.wb(var256);
                        int var257 = var5 + 1;
                        int var290 = var2 + 1;
                        int var291 = var2 * var290;
                        int var292 = var291 & 1;
                        if (var292 != 0) {
                            switch (var1) {
                                case 1227753567:
                                    var1 ^= -562513792;
                                    break label210;
                                case 1619702481:
                                    var1 *= -1277414721;
                                    var1 |= 1150472243;
                                    var1 ^= -1725531690;
                                    break label210;
                                case 1921939347:
                                default:
                                    var1 ^= 228428259;
                                    break label210;
                            }
                        }
                        var1 = switch (var1) {
                            case -727131400 -> var1 ^ -966868687;
                            default -> var1 ^ 1902184704;
                            case 1619702481 -> {
                                var1 *= -759032931;
                                var1 >>= 22;
                                var1 ^= 1430316556;
                                var1 <<= 14;
                                yield var1 ^ 546298554;
                            }
                        };
                        Integer var293 = var1;
                        if (var293 == null) {
                            break label213;
                        }

                        var5 = var257;
                        var1 &= 2007540833;
                        var1 ^= -1579676023;
                    }

                    var1 *= 1959984209;
                    var1 *= -663389997;
                    var1 ^= -414653362;
                    String[] var227 = new String[]{"death_wasted", "death_souls", null, null, null};
                    Integer var258 = var2;
                    if (var258 == null) {
                        var1 *= 292816193;
                        var1 ^= -157056802;
                        var1 ^= -991448638;
                    } else {
                        var1 = switch (var1) {
                            case 308587765 -> {
                                var1 >>= 28;
                                yield var1 ^ 847572993;
                            }
                            default -> var1 ^ 85633942;
                            case 1801479651 -> var1 ^ 964165622;
                        };
                        var227[2] = "death_flatline";
                        var227[3] = "death_eliminated";
                        var227[4] = "death_custom";
                        String[] var173 = var227;
                        var5 = var227.length;
                        int var224 = var5;
                        int var229 = 0;
                        var229 = var229;

                        var1 = switch (var1) {
                            default -> var1 ^ 1374838829;
                            case -400949599 -> var1 ^ 923543749;
                            case 847572992 -> {
                                var1 ^= 556407598;
                                yield var1 ^ -1339055451;
                            }
                        };

                        label192:
                        while (true) {
                            var258 = var1;
                            if (var258 == null) {
                                break label213;
                            }

                            if (var229 >= var224) {
                                var1 *= -2069333859;
                                var1 ^= 1477140022;
                                long var266 = var1;
                                long var308 = var266 + 1L;
                                var308 = var266 * var308;
                                long var267 = var308 & 1L;
                                long var336;
                                var229 = (var336 = var267 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                                if (var229 != 0) {
                                    break label213;
                                }

                                hn var232 = Pd.gz("voice_on");
                                WK var268 = WK.vY("auravisuals:ui.chime_on");
                                hn var233 = var232.Y(var268);
                                hn var234 = var233.d(150);
                                Pd var235 = var234.gI();
                                var0.wb(var235);
                                hn var236 = Pd.gz("voice_off");
                                WK var269 = WK.vY("auravisuals:ui.chime_off");
                                hn var237 = var236.Y(var269);
                                hn var238 = var237.d(150);
                                Pd var239 = var238.gI();
                                var0.wb(var239);
                                String[] var240 = new String[8];
                                var240[0] = "bell";
                                var240[1] = "bonk";
                                var240[2] = "bubble";
                                long var270 = var2;
                                var308 = var270 + 1L;
                                var308 = var270 * var308;
                                long var11 = var270 + 2L;
                                var308 *= var11;
                                long var271 = var270 + 3L;
                                var308 *= var271;
                                long var272 = var308 & 7L;
                                long var337;
                                int var273 = (var337 = var272 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                                if (var273 != 0) {
                                    var1 ^= 900876859;
                                    var1 *= -2099182523;
                                    var1 &= -96900756;
                                    var1 *= 25025219;
                                    var1 ^= -238870511;
                                    break;
                                }

                                var1 >>= 17;
                                var1 &= 1470660050;
                                var1 >>= 18;
                                var1 -= 25361103;
                                var1 ^= 1488001643;
                                var240[3] = "pok";
                                var240[4] = "magic";
                                var240[5] = "get";
                                var240[6] = "voice_on";
                                var240[7] = "voice_off";
                                String[] var174 = var240;
                                var229 = var240.length;
                                int var225 = var229;
                                int var242 = 0;
                                var242 = var242;
                                var1 += 1959346920;
                                var1 ^= 99634807;

                                label187:
                                while (true) {
                                    Integer var274 = var1;
                                    if (var274 == null) {
                                        break label213;
                                    }

                                    if (var242 >= var225) {
                                        var1 |= -1672649514;
                                        var1 ^= 473607298;
                                        Integer var111 = var1;
                                        if (var111 != null) {
                                            return;
                                        }
                                        break label213;
                                    }
                                    var1 = switch (var1) {
                                        case -1685599351 -> var1 ^ 245567152;
                                        default -> var1 ^ -1060569964;
                                        case 509938223 -> {
                                            var1 |= -508595619;
                                            yield var1 ^ 183493745;
                                        }
                                    };
                                    String var275 = var174[var242];
                                    String var252 = var275;
                                    Optional var276 = var0.ap(var275);
                                    // var274
                                    Pd var278 = (Pd)var276.orElseThrow();
                                    Pd var279 = var278;
                                    String[] var303 = new String[]{"normal", "critical", "sweep"};
                                    String[] var304 = var303;
                                    int var314 = var303.length;
                                    Integer var316 = var2;
                                    if (var316 == null) {
                                        var1 += -2011308961;
                                        var1 &= -861336898;
                                        var1 ^= 951617541;
                                        break label192;
                                    }

                                    var1 >>>= 6;
                                    var1 -= 1157585302;
                                    var1 &= -694165027;
                                    var1 ^= -339825656;
                                    var316 = var1;
                                    if (var316 == null) {
                                        break label213;
                                    }

                                    int var315 = var314;
                                    byte var318 = 0;
                                    int var319 = var318;

                                    var1 = switch (var1) {
                                        default -> var1 ^ -2050785331;
                                        case -155145235 -> var1 ^ 1777988997;
                                        case 2099907784 -> {
                                            var1 >>= 24;
                                            var1 *= 296291889;
                                            yield var1 ^ -1778146775;
                                        }
                                    };

                                    while (true) {
                                        Integer var320 = var1;
                                        if (var320 == null) {
                                            break label213;
                                        }

                                        if (var319 >= var315) {
                                            var1 &= 861864051;
                                            var1 -= 1174279453;
                                            var1 -= -947160914;
                                            var1 &= -651881744;
                                            var1 ^= 1583319710;
                                            int var253 = var242 + 1;
                                            int var280 = var2 + 1;
                                            var280 = var2 * var280;
                                            int var305 = var2 + 2;
                                            var280 *= var305;
                                            int var306 = var2 + 3;
                                            var280 *= var306;
                                            var280 &= 7;
                                            if (var280 != 0) {
                                                var1 |= 1653701371;
                                                var1 |= -1952593262;
                                                var1 -= -875335529;
                                                var1 &= -1188614783;
                                                var1 ^= 1419020841;
                                                break label192;
                                            }

                                            var1 -= -1963029988;
                                            var1 >>= 19;
                                            var1 ^= -1823999125;
                                            var242 = var253;
                                            switch (var1) {
                                                case -1823999004:
                                                    var1 *= 1897238895;
                                                    var1 ^= -235712013;
                                                    continue label187;
                                                case 792525660:
                                                    var1 ^= 1164133657;
                                                    continue label187;
                                                case 1476075238:
                                                default:
                                                    var1 ^= -202931494;
                                                    continue label187;
                                            }
                                        }

                                        var1 |= -846624707;
                                        var1 &= 1561209879;
                                        var1 |= 619546002;
                                        var1 ^= -840085156;
                                        String var321 = var304[var319];
                                        int var12 = var2 + 1;
                                        var12 = var2 * var12;
                                        var12 &= 1;
                                        if (var12 != 0) {
                                            var1 -= 1571834811;
                                            var1 &= 1453938143;
                                            var1 ^= 917541689;
                                            break label192;
                                        }
                                        var1 = switch (var1) {
                                            case -1610556213 -> {
                                                var1 += -283023559;
                                                var1 &= 1768410628;
                                                yield var1 ^ -1875232597;
                                            }
                                            default -> var1 ^ -366440677;
                                            case 986964330 -> var1 ^ 1376122814;
                                        };
                                        var12 = var1 + 1;
                                        var12 = var1 * var12;
                                        int var13 = var1 + 2;
                                        var12 *= var13;
                                        var13 = var1 + 3;
                                        var12 *= var13;
                                        var12 &= 7;
                                        if (var12 != 0) {
                                            break label213;
                                        }

                                        String var322 = var321 + "_" + var252;
                                        List var333 = var279.layers();
                                        int var14 = var279.cooldownMs();
                                        float var15 = var279.comboPitchStep();
                                        int var16 = var279.maxCombo();
                                        int var17 = var279.comboWindowMs();
                                        Pd var331 = new Pd(var322, var333, var14, var15, var16, var17);
                                        var0.wb(var331);
                                        int var323 = var319 + 1;
                                        var319 = var323;
                                        switch (var1) {
                                            case -1743098294:
                                            default:
                                                var1 ^= -674312669;
                                                break;
                                            case -1726448465:
                                                var1 *= -2114835011;
                                                var1 ^= 1759813623;
                                                break;
                                            case 1060708749:
                                                var1 ^= -1270984682;
                                        }
                                    }
                                }
                            }
                            var1 = switch (var1) {
                                case -1551808117 -> {
                                    var1 += 1030647829;
                                    var1 -= -124054069;
                                    yield var1 ^ -1178402615;
                                }
                                default -> var1 ^ 1677622626;
                                case 894408470 -> var1 ^ 1991828512;
                            };
                            String var260 = var173[var229];
                            hn var261 = Pd.gz(var260);
                            String var294 = var260.substring(6);
                            var294 = "auravisuals:death." + var294;
                            WK var296 = WK.vY(var294);
                            hn var262 = var261.Y(var296);
                            hn var263 = var262.d(800);
                            Integer var297 = var2;
                            if (var297 == null) {
                                switch (var1) {
                                    case -1957414626:
                                    default:
                                        var1 ^= 1460560581;
                                        break label192;
                                    case -1623326559:
                                        var1 ^= 46663021;
                                        break label192;
                                    case 1368892188:
                                        var1 |= 283651457;
                                        var1 &= -1842437340;
                                        var1 ^= -669223174;
                                        var1 ^= -1132308521;
                                        break label192;
                                }
                            }

                            var1 -= 1392259425;
                            var1 |= 1017042958;
                            var1 ^= 1210593966;
                            int var298 = var1 + 1;
                            int var299 = var1 * var298;
                            int var9 = var1 + 2;
                            int var300 = var299 * var9;
                            var9 = var1 + 3;
                            int var301 = var300 * var9;
                            int var302 = var301 & 7;
                            if (var302 != 0) {
                                break label213;
                            }

                            Pd var264 = var263.gI();
                            var0.wb(var264);
                            int var265 = var229 + 1;
                            var229 = var265;
                            var1 += 1053253832;
                            var1 ^= 1459511890;
                        }
                    }
                }
            }

            long var105 = var1;
            long var175 = var105 + 1L;
            long var176 = var105 * var175;
            long var244 = var105 + 2L;
            long var177 = var176 * var244;
            long var106 = var105 + 3L;
            long var178 = var177 * var106;
            long var107 = var178 & 7L;
            long var338;
            var1 = (var338 = var107 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var110 = new IllegalArgumentException();
                throw var110;
            }
        }

        IllegalArgumentException var109 = new IllegalArgumentException();
        throw var109;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2125332582;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        kT = var4;
        String[] var5 = new String[]{"bell", "bonk", "bubble", "pok", "magic", "get", "custom"};
        lK = var5;
    }
}
