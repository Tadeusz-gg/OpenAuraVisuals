package dev.aurap.hub;

import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import dev.skidware.visuals.render.image.RgbaImage;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class sN_2 {
    private static final Logger b;
    private static final int gI = 256;
    private static final int M = 32;
    private static final float i = 3.2F;
    private static final TextStyle g;
    private final AtomicReference zC;
    private volatile String LQ;
    private m_2 cU;
    private m_2 NC;
    private float j;
    private static final ExecutorService Ji;
    public static final int W;

    public sN_2() {
        AtomicReference var1 = new AtomicReference();
        this.zC = var1;
        this.LQ = "";
        this.j = 1.0F;
    }

    public void Kz(YG var1, AuraRenderer var2, float var3) {
        String var225 = null;
        label321: {
            int var185;
            label337: {
                var185 = W;
                var185 ^= 656439543;
                int var5 = System.identityHashCode(this);
                long var6 = var5;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var408;
                int var211 = (var408 = var6 - 0L) == 0L ? 0 : (var408 < 0L ? -1 : 1);
                label318:
                if (var211 == 0) {
                    var185 &= -1594723957;
                    var185 *= 823884823;
                    var185 |= 1424557229;
                    var185 -= 754742474;
                    var185 ^= 1439380493;
                    int var212 = var185 + 1;
                    int var213 = var185 * var212;
                    int var7 = var185 + 2;
                    int var214 = var213 * var7;
                    var7 = var185 + 3;
                    int var215 = var214 * var7;
                    int var216 = var215 & 7;
                    if (var216 != 0) {
                        break label321;
                    }

                    label325: {
                        if (var1 != null) {
                            var185 *= 400194931;
                            var185 ^= -628125578;
                            int var217 = var185 + 1;
                            int var218 = var185 * var217;
                            var7 = var185 + 2;
                            int var219 = var218 * var7;
                            var7 = var185 + 3;
                            int var220 = var219 * var7;
                            int var221 = var220 & 7;
                            if (var221 != 0) {
                                break label321;
                            }

                            byte[] var222 = var1.bytes();
                            long var257 = var5;
                            long var9 = var257 + 1L;
                            var9 = var257 * var9;
                            long var258 = var9 & 1L;
                            long var409;
                            var7 = (var409 = var258 - 0L) == 0L ? 0 : (var409 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                switch (var185) {
                                    case -1014276082:
                                    default:
                                        var185 ^= -1863219141;
                                        break label318;
                                    case 91613242:
                                        var185 ^= -1655094832;
                                        break label318;
                                    case 1320064988:
                                        var185 -= 146098685;
                                        var185 *= -1109478261;
                                        var185 &= -2136821250;
                                        var185 += 1301757863;
                                        var185 ^= 84260410;
                                        break label318;
                                }
                            }

                            var185 >>= 10;
                            var185 -= -76457273;
                            var185 ^= -1593755378;
                            long var260 = var185;
                            var9 = var260 + 1L;
                            var9 = var260 * var9;
                            long var261 = var9 & 1L;
                            long var410;
                            var7 = (var410 = var261 - 0L) == 0L ? 0 : (var410 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                break label321;
                            }

                            if (var222 != null) {
                                var185 *= -226504247;
                                var185 ^= -1095916153;
                                Integer var223 = var185;
                                if (var223 == null) {
                                    break label321;
                                }

                                String var224 = var1.key();
                                Integer var263 = var5;
                                if (var263 == null) {
                                    switch (var185) {
                                        case -110549574:
                                            var185 ^= 2016145578;
                                            break label318;
                                        case 530728725:
                                        default:
                                            var185 ^= -1462918620;
                                            break label318;
                                        case 709706199:
                                            var185 -= 1754846247;
                                            var185 <<= 28;
                                            var185 ^= 1259534721;
                                            break label318;
                                    }
                                }

                                var185 >>>= 10;
                                var185 <<= 7;
                                var185 -= -2118579228;
                                var185 &= 1177496706;
                                var185 ^= 1862321742;
                                long var264 = var185;
                                var9 = var264 + 1L;
                                var9 = var264 * var9;
                                long var265 = var9 & 1L;
                                long var411;
                                int var266 = (var411 = var265 - 0L) == 0L ? 0 : (var411 < 0L ? -1 : 1);
                                if (var266 != 0) {
                                    break label321;
                                }

                                var225 = var224;
                                var185 ^= 1827637488;
                                var185 ^= -590117377;
                                var185 -= -1612035064;
                                var185 += -695664804;
                                var185 ^= -1264001314;
                                break label325;
                            }

                            var185 -= 172594922;
                            var185 |= -1922501470;
                            var185 ^= -1272752729;
                        } else {
                            var185 += 1792176230;
                            var185 -= -1095198838;
                            var185 ^= 1611172683;
                        }

                        long var267 = var185;
                        long var373 = var267 + 1L;
                        var373 = var267 * var373;
                        long var268 = var373 & 1L;
                        long var412;
                        var7 = (var412 = var268 - 0L) == 0L ? 0 : (var412 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label321;
                        }

                        var225 = "";
                        var185 &= 160189711;
                        var185 |= -317301672;
                        var185 &= -1091257678;
                        var185 <<= 18;
                        var185 ^= -952916917;
                    }

                    long var270 = var185;
                    long var375 = var270 + 1L;
                    var375 = var270 * var375;
                    long var271 = var375 & 1L;
                    long var413;
                    var7 = (var413 = var271 - 0L) == 0L ? 0 : (var413 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label321;
                    }

                    String var273 = this.LQ;
                    int var274 = (var225.equals(var273)) ? 1 : 0;
                    var8 = var5;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    long var12 = var8 + 2L;
                    var10 *= var12;
                    var8 += 3L;
                    var10 *= var8;
                    var8 = var10 & 7L;
                    long var414;
                    int var338 = (var414 = var8 - 0L) == 0L ? 0 : (var414 < 0L ? -1 : 1);
                    if (var338 != 0) {
                        var185 <<= 30;
                        var185 ^= -2105532234;
                        var185 ^= 160618807;
                    } else {
                        var185 -= -1358871406;
                        var185 <<= 13;
                        var185 ^= -769522768;
                        var185 ^= 556302220;
                        var8 = var185;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var415;
                        int var341 = (var415 = var8 - 0L) == 0L ? 0 : (var415 < 0L ? -1 : 1);
                        if (var341 != 0) {
                            break label321;
                        }

                        if (var274 == 0) {
                            var185 += -896042411;
                            var185 ^= 1133276020;
                            Integer var275 = var185;
                            if (var275 == null) {
                                break label321;
                            }

                            this.LQ = var225;
                            var274 = var225.isEmpty() ? 1 : 0;
                            var8 = var5;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var12 = var8 + 2L;
                            var10 *= var12;
                            var8 += 3L;
                            var10 *= var8;
                            var8 = var10 & 7L;
                            long var416;
                            int var345 = (var416 = var8 - 0L) == 0L ? 0 : (var416 < 0L ? -1 : 1);
                            if (var345 != 0) {
                                var185 -= 826187335;
                                var185 &= 643825243;
                                var185 >>>= 31;
                                var185 ^= 1899978751;
                                var185 ^= 976070270;
                                break label318;
                            }

                            var185 -= -1914445329;
                            var185 ^= 259485891;
                            Integer var346 = var185;
                            if (var346 == null) {
                                break label321;
                            }

                            if (var274 == 0) {
                                var185 *= -1601101175;
                                var185 ^= 2021187176;
                                var185 ^= -1406540946;
                                long var277 = var185;
                                var375 = var277 + 1L;
                                var375 = var277 * var375;
                                long var278 = var375 & 1L;
                                long var417;
                                var274 = (var417 = var278 - 0L) == 0L ? 0 : (var417 < 0L ? -1 : 1);
                                if (var274 != 0) {
                                    break label321;
                                }

                                byte[] var280 = var1.bytes();
                                var8 = var5;
                                var10 = var8 + 1L;
                                var10 = var8 * var10;
                                var8 = var10 & 1L;
                                long var418;
                                int var349 = (var418 = var8 - 0L) == 0L ? 0 : (var418 < 0L ? -1 : 1);
                                if (var349 != 0) {
                                    var185 |= -33122722;
                                    var185 *= 398804695;
                                    var185 &= -199261646;
                                    var185 *= -1369536793;
                                    var185 ^= 1081030529;
                                    break label318;
                                }

                                var185 += -1253135946;
                                var185 >>= 19;
                                var185 += 1183095464;
                                var185 += -1199782045;
                                var185 ^= -1320024063;
                                int var350 = var185 ^ -2000437597;
                                int var351 = var350 - 1431152928;
                                int var352 = var351 - 1204698877;
                                int var353 = var352 ^ 372776536;
                                this.ht(var225, var280, var353);
                                var185 |= -2030122026;
                                var185 &= -1469912526;
                                var185 <<= 1;
                                var185 ^= -1282834127;
                            } else {
                                var185 >>>= 19;
                                var185 ^= -1555295555;
                            }
                        } else {
                            var185 >>= 20;
                            var185 ^= 1580950218;
                            var185 &= 2067750397;
                            var185 -= -1088050885;
                            var185 ^= -1030593249;
                        }

                        AtomicReference var226 = this.zC;
                        Object var227 = var226.get();
                        var274 = var5 + 1;
                        var274 = var5 * var274;
                        int var354 = var5 + 2;
                        var274 *= var354;
                        int var355 = var5 + 3;
                        var274 *= var355;
                        var274 &= 7;
                        if (var274 == 0) {
                            var185 ^= -1247769179;
                            var185 ^= -198063804;
                            var185 += -595973962;
                            var185 ^= 814300799;
                            long var286 = var185;
                            var375 = var286 + 1L;
                            var375 = var286 * var375;
                            long var287 = var375 & 1L;
                            long var419;
                            var274 = (var419 = var287 - 0L) == 0L ? 0 : (var419 < 0L ? -1 : 1);
                            if (var274 != 0) {
                                break label321;
                            }

                            R var228 = (R)var227;
                            if (var228 != null) {
                                var185 &= -990682370;
                                var185 += 2017772409;
                                var185 ^= -1147244275;
                                String var289 = var228.key();
                                String var356 = this.LQ;
                                Integer var381 = var5;
                                if (var381 == null) {
                                    var185 >>>= 25;
                                    var185 ^= 1259534754;
                                    break label318;
                                }
                                var185 = switch (var185) {
                                    case -1985796161 -> var185 ^ 1539088084;
                                    default -> var185 ^ 349616984;
                                    case 1183413568 -> {
                                        var185 += -2120661237;
                                        yield var185 ^ -471105709;
                                    }
                                };
                                Integer var382 = var185;
                                if (var382 == null) {
                                    break label321;
                                }

                                int var290 = (var289.equals(var356)) ? 1 : 0;
                                if (var290 != 0) {
                                    var185 += 2065485180;
                                    var185 >>>= 23;
                                    var185 *= -1977475453;
                                    var185 &= 1650693042;
                                    var185 ^= -1596691020;
                                    var290 = var185 + 1;
                                    var290 = var185 * var290;
                                    var290 &= 1;
                                    if (var290 != 0) {
                                        break label321;
                                    }

                                    AtomicReference var294 = this.zC;
                                    int var295 = var294.compareAndSet(var228, null) ? 1 : 0;
                                    var8 = var5;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var8 = var10 & 1L;
                                    long var420;
                                    int var359 = (var420 = var8 - 0L) == 0L ? 0 : (var420 < 0L ? -1 : 1);
                                    if (var359 != 0) {
                                        var185 |= -574939266;
                                        var185 ^= 1195881999;
                                        var185 ^= -739594128;
                                        break label318;
                                    }
                                    var185 = switch (var185) {
                                        case -2102002282 -> {
                                            var185 &= 671381893;
                                            var185 += 7082796;
                                            yield var185 ^ -625083235;
                                        }
                                        case -897516465 -> var185 ^ -902104306;
                                        default -> var185 ^ 1116768691;
                                    };
                                    var8 = var185;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var12 = var8 + 2L;
                                    var10 *= var12;
                                    var8 += 3L;
                                    var10 *= var8;
                                    var8 = var10 & 7L;
                                    long var421;
                                    int var363 = (var421 = var8 - 0L) == 0L ? 0 : (var421 < 0L ? -1 : 1);
                                    if (var363 != 0) {
                                        break label321;
                                    }

                                    if (var295 != 0) {
                                        var185 &= -115575777;
                                        var185 += 909986776;
                                        var185 >>= 21;
                                        var185 ^= -1575163071;
                                        var295 = var185 & 181495644;
                                        var295 ^= 141608197;
                                        m_2 var229 = Mn(var228, var2, var295);
                                        var295 = var5 + 1;
                                        var295 = var5 * var295;
                                        int var364 = var5 + 2;
                                        var295 *= var364;
                                        int var365 = var5 + 3;
                                        var295 *= var365;
                                        var295 &= 7;
                                        if (var295 != 0) {
                                            var185 &= 1082227214;
                                            var185 -= 266779780;
                                            var185 *= -260200501;
                                            var185 ^= -1340261013;
                                            break label318;
                                        }

                                        var185 <<= 1;
                                        var185 ^= 1423703857;
                                        var295 = var185 + 1;
                                        var295 = var185 * var295;
                                        int var366 = var185 + 2;
                                        var295 *= var366;
                                        int var367 = var185 + 3;
                                        var295 *= var367;
                                        var295 &= 7;
                                        if (var295 != 0) {
                                            break label321;
                                        }

                                        var295 = var185 & -245453576;
                                        var295 &= 505018060;
                                        var295 |= 422601674;
                                        var295 ^= -914834768;
                                        var295 ^= -1638167898;
                                        this.i(var229, var2, var295);
                                        var185 -= -1805805282;
                                        var185 += 1144914158;
                                        var185 |= -1396286356;
                                        var185 ^= -655778104;
                                        var185 ^= 254227097;
                                    } else {
                                        switch (var185) {
                                            case -624070611:
                                                var185 -= 503423060;
                                                var185 += -132729647;
                                                var185 ^= -1880427116;
                                                break;
                                            case -409151641:
                                            default:
                                                var185 ^= 775250901;
                                                break;
                                            case -340416813:
                                                var185 ^= -2048403567;
                                        }
                                    }
                                } else {
                                    var185 += -1014923702;
                                    var185 &= -1723743648;
                                    var185 += -1754718022;
                                    var185 <<= 21;
                                    var185 ^= 407400766;
                                }
                            } else {
                                var185 &= 789612797;
                                var185 >>>= 30;
                                var185 >>>= 4;
                                var185 ^= 990409022;
                            }

                            int var230 = var185 + 1;
                            int var231 = var185 * var230;
                            var274 = var185 + 2;
                            int var232 = var231 * var274;
                            var274 = var185 + 3;
                            int var233 = var232 * var274;
                            int var234 = var233 & 7;
                            if (var234 != 0) {
                                break label321;
                            }

                            String var235 = this.LQ;
                            long var315 = var5;
                            var375 = var315 + 1L;
                            var375 = var315 * var375;
                            long var11 = var315 + 2L;
                            var375 *= var11;
                            long var316 = var315 + 3L;
                            var375 *= var316;
                            long var317 = var375 & 7L;
                            long var422;
                            var274 = (var422 = var317 - 0L) == 0L ? 0 : (var422 < 0L ? -1 : 1);
                            if (var274 != 0) {
                                switch (var185) {
                                    case 990409022:
                                        var185 += -1393270348;
                                        var185 &= 1117883008;
                                        var185 += -69336532;
                                        var185 *= 935539603;
                                        var185 ^= 1359645509;
                                        break label318;
                                    case 1055837929:
                                        var185 ^= 1128938190;
                                        break label318;
                                    case 1398096941:
                                    default:
                                        var185 ^= -634797394;
                                }
                            } else {
                                var185 -= 17525296;
                                var185 ^= -549755456;
                                var185 ^= -654486572;
                                boolean var236 = var235.isEmpty();
                                if (var236) {
                                    var185 = switch (var185) {
                                        default -> var185 ^ -356612557;
                                        case -1866259445 -> var185 ^ -497553507;
                                        case 1044066586 -> {
                                            var185 -= -606412300;
                                            yield var185 ^ 1041664222;
                                        }
                                    };
                                    m_2 var237 = this.cU;
                                    Integer var319 = var5;
                                    if (var319 == null) {
                                        var185 += 271500757;
                                        var185 >>= 20;
                                        var185 &= 1435382160;
                                        var185 ^= 1259534593;
                                        break label318;
                                    }

                                    var185 |= -699657606;
                                    var185 &= 1876398415;
                                    var185 ^= 1698001654;
                                    if (var237 != null) {
                                        var185 += -183049829;
                                        var185 -= -42205057;
                                        var185 += -1615960265;
                                        var185 ^= 2094502777;
                                        Integer var238 = var185;
                                        if (var238 == null) {
                                            break label321;
                                        }

                                        int var239 = var185 | -270692789;
                                        int var240 = var239 + 1932934766;
                                        int var241 = var240 - -1201112308;
                                        int var242 = var241 + 345961461;
                                        int var243 = var242 ^ -2122373878;
                                        this.i(null, var2, var243);
                                        var185 &= 202757292;
                                        var185 ^= -2125305737;
                                        var185 ^= 2144023181;
                                    } else {
                                        switch (var185) {
                                            case 120476209:
                                                var185 ^= 215194112;
                                                break;
                                            case 727966652:
                                                var185 &= -964789270;
                                                var185 -= -912143991;
                                                var185 |= 1784949849;
                                                var185 ^= -2006093695;
                                                break;
                                            case 1990620640:
                                            default:
                                                var185 ^= 20519179;
                                        }
                                    }
                                } else {
                                    var185 *= -796124857;
                                    var185 >>>= 9;
                                    var185 *= 1079499841;
                                    var185 ^= 1832444618;
                                }

                                float var244 = this.j;
                                float var423;
                                int var245 = (var423 = var244 - 1.0F) == 0.0F ? 0 : (var423 < 0.0F ? -1 : 1);
                                long var320 = var5;
                                var375 = var320 + 1L;
                                var375 = var320 * var375;
                                long var321 = var375 & 1L;
                                long var424;
                                var274 = (var424 = var321 - 0L) == 0L ? 0 : (var424 < 0L ? -1 : 1);
                                if (var274 == 0) {
                                    var185 = switch (var185) {
                                        case -2061937016 -> var185 ^ 5423122;
                                        case -225849634 -> {
                                            var185 ^= 326259021;
                                            var185 -= -92251132;
                                            var185 += 1360969944;
                                            yield var185 ^ -663913639;
                                        }
                                        default -> var185 ^ -1208370096;
                                    };
                                    var274 = var185 + 1;
                                    var274 = var185 * var274;
                                    var274 &= 1;
                                    if (var274 != 0) {
                                        break label321;
                                    }

                                    if (var245 >= 0) {
                                        var185 ^= -845144663;
                                        var185 -= -1538069247;
                                        var185 ^= 856304397;
                                        var185 ^= 1312384752;
                                        break label337;
                                    }
                                    var185 = switch (var185) {
                                        case -520650946 -> {
                                            var185 |= -1660196679;
                                            var185 += -1245001150;
                                            yield var185 ^ -1663822634;
                                        }
                                        default -> var185 ^ -953125297;
                                        case 900810065 -> var185 ^ -2002677872;
                                    };
                                    float var246 = this.j;
                                    float var326 = var3 * 3.2F;
                                    float var247 = var246 + var326;
                                    float var248 = Math.min(1.0F, var247);
                                    Integer var327 = var5;
                                    if (var327 != null) {
                                        var185 = switch (var185) {
                                            default -> var185 ^ 1570911664;
                                            case 790519511 -> {
                                                var185 &= -486953383;
                                                var185 >>= 31;
                                                var185 <<= 24;
                                                yield var185 ^ -1430669695;
                                            }
                                            case 800168379 -> var185 ^ -2104535405;
                                        };
                                        this.j = var248;
                                        float var249 = this.j;
                                        float var425;
                                        int var250 = (var425 = var249 - 1.0F) == 0.0F ? 0 : (var425 < 0.0F ? -1 : 1);
                                        if (var250 < 0) {
                                            switch (var185) {
                                                case -1430669695:
                                                    var185 += 1389336629;
                                                    var185 ^= -1980642402;
                                                    var185 ^= -2142257853;
                                                    break label337;
                                                case 163216711:
                                                default:
                                                    var185 ^= 1120685611;
                                                    break label337;
                                                case 460462133:
                                                    var185 ^= -1540332894;
                                                    break label337;
                                            }
                                        }
                                        var185 = switch (var185) {
                                            case -1430669695 -> {
                                                var185 >>= 9;
                                                var185 *= 757624423;
                                                var185 += -836047067;
                                                var185 &= 1263215757;
                                                yield var185 ^ 1277078751;
                                            }
                                            case -1277689956 -> var185 ^ 787438829;
                                            default -> var185 ^ 2025983816;
                                        };
                                        m_2 var251 = this.NC;
                                        int var328 = var185 >>> 25;
                                        var328 -= -201736095;
                                        var328 -= -987162751;
                                        var328 ^= 1199014536;
                                        D(var251, var2, var328);
                                        int var252 = var5 + 1;
                                        int var253 = var5 * var252;
                                        var5 = var253 & 1;
                                        if (var5 == 0) {
                                            var185 &= -1600012923;
                                            var185 ^= -639165267;
                                            var185 >>>= 25;
                                            var185 ^= 217135299;
                                            long var206 = var185;
                                            long var332 = var206 + 1L;
                                            long var333 = var206 * var332;
                                            long var207 = var333 & 1L;
                                            long var426;
                                            var5 = (var426 = var207 - 0L) == 0L ? 0 : (var426 < 0L ? -1 : 1);
                                            if (var5 != 0) {
                                                break label321;
                                            }

                                            this.NC = null;
                                            var185 >>= 9;
                                            var185 >>= 6;
                                            var185 ^= -1252216016;
                                            var185 ^= 1925137428;
                                            var185 ^= 869586605;
                                            break label337;
                                        }

                                        var185 += -31294028;
                                        var185 += -2003257077;
                                        var185 |= -583674859;
                                        var185 -= 1736369627;
                                        var185 ^= 865329221;
                                    } else {
                                        switch (var185) {
                                            case -1741837486:
                                                var185 ^= -1948124953;
                                                break label318;
                                            case -1525963008:
                                            default:
                                                var185 ^= -1079496776;
                                                break label318;
                                            case 790519511:
                                                var185 -= -1949964920;
                                                var185 ^= 1079271568;
                                                var185 += 537095357;
                                                var185 -= -830024822;
                                                var185 ^= 2140818067;
                                        }
                                    }
                                } else {
                                    var185 &= 1347099156;
                                    var185 ^= 454816661;
                                }
                            }
                        } else {
                            var185 ^= -782119102;
                            var185 -= -1131523458;
                            var185 ^= -24281512;
                        }
                    }
                } else {
                    var185 += -30106119;
                    var185 -= 282603519;
                    var185 ^= -1524070548;
                }

                Integer var202 = var185;
                if (var202 != null) {
                    UnsupportedOperationException var203 = new UnsupportedOperationException();
                    throw var203;
                }
                break label321;
            }

            Integer var209 = var185;
            if (var209 != null) {
                return;
            }
        }

        IllegalArgumentException var204 = new IllegalArgumentException();
        throw var204;
    }

    public int r() {
        int var1 = W;
        var1 ^= -499074758;
        int var2 = System.identityHashCode(this);
        m_2 var3 = this.cU;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var64;
        int var45 = (var64 = var4 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
        if (var45 != 0) {
            var1 &= 1241041678;
            var1 ^= -1992920600;
        } else {
            label56: {
                var1 *= -463362209;
                var1 |= -1923518679;
                var1 ^= -1757346258;
                int var46 = var1 + 1;
                int var47 = var1 * var46;
                int var48 = var47 & 1;
                label45:
                if (var48 == 0) {
                    int var43;
                    if (var3 == null) {
                        var1 *= -1246882437;
                        var1 >>= 21;
                        var1 ^= -165490484;
                        var43 = 0;
                        var1 *= -1323306345;
                        var1 ^= 454327318;
                    } else {
                        var1 = switch (var1) {
                            default -> var1 ^ 214992832;
                            case -537971350 -> var1 ^ -773970826;
                            case 1251768581 -> {
                                var1 *= -359889273;
                                var1 ^= 212928239;
                                yield var1 ^ 694956067;
                            }
                        };
                        int var49 = var1 + 1;
                        int var50 = var1 * var49;
                        int var5 = var1 + 2;
                        int var51 = var50 * var5;
                        var5 = var1 + 3;
                        int var52 = var51 * var5;
                        int var53 = var52 & 7;
                        if (var53 != 0) {
                            break label45;
                        }

                        m_2 var54 = this.cU;
                        long var58 = var2;
                        long var7 = var58 + 1L;
                        var7 = var58 * var7;
                        long var59 = var7 & 1L;
                        long var65;
                        var2 = (var65 = var59 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            switch (var1) {
                                case -1391541938:
                                default:
                                    var1 ^= 293848159;
                                    break label56;
                                case 106883909:
                                    var1 ^= -996767816;
                                    break label56;
                                case 625301871:
                                    var1 *= -1449530857;
                                    var1 -= -381710059;
                                    var1 += 578619296;
                                    var1 *= 1615430045;
                                    var1 ^= 478586130;
                                    break label56;
                            }
                        }

                        var1 >>= 16;
                        var1 *= -364939859;
                        var1 ^= -1736994083;
                        var1 ^= -1872202694;
                        var2 = var54.accent();
                        var43 = var2;
                        var1 |= -981444526;
                        var1 >>= 10;
                        var1 &= 1763751967;
                        var1 |= 758496709;
                        var1 ^= -786320191;
                    }

                    var4 = var1;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var66;
                    var2 = (var66 = var4 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        return var43;
                    }
                }

                UnsupportedOperationException var42 = new UnsupportedOperationException();
                throw var42;
            }
        }

        IllegalArgumentException var38 = new IllegalArgumentException();
        throw var38;
    }

    public boolean J() {
        int var1 = W;
        var1 ^= 362549700;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 ^= 1054311910;
            var1 >>>= 7;
            var1 *= -1545636483;
            var1 -= 1021687703;
            var1 ^= 1987731233;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            label41:
            if (var2 == 0) {
                m_2 var41 = this.cU;
                boolean var43;
                if (var41 != null) {
                    var1 = switch (var1) {
                        default -> var1 ^ 2030706940;
                        case 345900960 -> {
                            var1 *= 1513121719;
                            var1 += -1378197393;
                            yield var1 ^ 1412006116;
                        }
                        case 603157849 -> var1 ^ 1705194925;
                    };
                    Integer var42 = var1;
                    if (var42 == null) {
                        break label41;
                    }

                    var43 = true;
                    var1 ^= 1029908153;
                    var1 += -1882225283;
                    var1 += -666055185;
                    var1 -= -906253554;
                    var1 ^= -2015742405;
                } else {
                    var1 |= -232309148;
                    var1 <<= 26;
                    var1 ^= -1208900734;
                    long var45 = var1;
                    long var5 = var45 + 1L;
                    var5 = var45 * var5;
                    long var7 = var45 + 2L;
                    var5 *= var7;
                    long var46 = var45 + 3L;
                    var5 *= var46;
                    long var47 = var5 & 7L;
                    long var58;
                    var3 = (var58 = var47 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        break label41;
                    }

                    var43 = false;
                    var1 |= -480158214;
                    var1 *= -1743402911;
                    var1 ^= 598934188;
                    var1 |= -670000725;
                    var1 ^= 1015862388;
                }

                var3 = var1 + 1;
                var3 = var1 * var3;
                int var4 = var1 + 2;
                var3 *= var4;
                var4 = var1 + 3;
                var3 *= var4;
                var3 &= 7;
                if (var3 == 0) {
                    return var43;
                }
            }
        } else {
            var1 &= 247216424;
            var1 |= 762483864;
            var1 >>= 4;
            var1 ^= 2037502455;
            Integer var34 = var1;
            if (var34 != null) {
                IllegalStateException var36 = new IllegalStateException();
                throw var36;
            }
        }

        IllegalArgumentException var35 = new IllegalArgumentException();
        throw var35;
    }

    public void R(Canvas var1, float var2, float var3, float var4, float var5, float var6) {
        float var229 = 0.0F;
        int var7 = W;
        var7 ^= -1081242128;
        int var8 = System.identityHashCode(this);
        float var9 = this.j;
        var9 = TP.N(0.0F, 1.0F, var9);
        Integer var10 = var8;
        int var11 = of_2.sZ;
        var7 ^= var11;
        var7 ^= 1468362197;
        of_2.sZ = 1468362197;
        var11 = of_2.k;
        var7 ^= var11;
        var7 ^= 793857101;
        of_2.k = 793857101;
        if (var10 == null) {
            var7 += 388476101;
            var7 -= -1921818421;
            var7 ^= -2031506849;
            var7 ^= -126318692;
        } else {
            label204: {
                var7 <<= 15;
                var7 += -1852693445;
                var7 ^= -1047588011;
                long var173 = var7;
                long var12 = var173 + 1L;
                var12 = var173 * var12;
                long var174 = var12 & 1L;
                long var275;
                int var175 = (var275 = var174 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
                label193:
                if (var175 == 0) {
                    m_2 var176 = this.NC;
                    if (var176 != null) {
                        var7 = switch (var7) {
                            default -> var7 ^ 643150836;
                            case 1157838702 -> {
                                var7 |= 428556401;
                                var7 ^= -152788158;
                                var7 ^= -1518221256;
                                var7 |= 157225926;
                                yield var7 ^ 541580575;
                            }
                            case 1513568105 -> var7 ^ -124503420;
                        };
                        Integer var177 = var7;
                        if (var177 == null) {
                            break label193;
                        }

                        float var276;
                        int var178 = (var276 = var9 - 1.0F) == 0.0F ? 0 : (var276 < 0.0F ? -1 : 1);
                        var11 = var8 + 1;
                        var11 = var8 * var11;
                        int var237 = var8 + 2;
                        var11 *= var237;
                        int var238 = var8 + 3;
                        var11 *= var238;
                        var11 &= 7;
                        if (var11 != 0) {
                            switch (var7) {
                                case -1984800975:
                                default:
                                    var7 ^= 1737740798;
                                    break label204;
                                case 800637656:
                                    var7 *= 615849443;
                                    var7 *= -426070645;
                                    var7 ^= -1922937611;
                                    break label204;
                                case 1237509152:
                                    var7 ^= -1263399779;
                                    break label204;
                            }
                        }

                        var7 -= 701060494;
                        var7 -= -1052713209;
                        var7 *= -49271657;
                        var7 &= -448462263;
                        var7 ^= -528985899;
                        Integer var205 = var7;
                        if (var205 == null) {
                            break label193;
                        }

                        if (var178 < 0) {
                            var7 |= -1396185422;
                            var7 ^= -1679205201;
                            Integer var179 = var7;
                            if (var179 == null) {
                                break label193;
                            }

                            m_2 var180 = this.NC;
                            long var206 = var8;
                            long var13 = var206 + 1L;
                            var13 = var206 * var13;
                            long var207 = var13 & 1L;
                            long var277;
                            int var208 = (var277 = var207 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                            if (var208 != 0) {
                                var7 *= 1965155581;
                                var7 >>= 13;
                                var7 >>= 15;
                                var7 *= -1667331959;
                                var7 ^= 1202890645;
                                break label204;
                            }

                            var7 -= -915945788;
                            var7 &= 1240851976;
                            var7 ^= -1484659483;
                            var7 ^= -184016929;
                            long var209 = var7;
                            var13 = var209 + 1L;
                            var13 = var209 * var13;
                            long var15 = var209 + 2L;
                            var13 *= var15;
                            long var210 = var209 + 3L;
                            var13 *= var210;
                            long var211 = var13 & 7L;
                            long var278;
                            var208 = (var278 = var211 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
                            if (var208 != 0) {
                                break label193;
                            }

                            var208 = var7 ^ 446686107;
                            var208 <<= 5;
                            var208 |= -2109808914;
                            var208 ^= -845409485;
                            GE(var1, var180, var2, var3, var4, var5, var6, 1.0F, var208);
                            switch (var7) {
                                case 1398978300:
                                    var7 ^= 1960133718;
                                    break;
                                case 1529682234:
                                    var7 += -170212028;
                                    var7 |= -1069077156;
                                    var7 ^= 1032779936;
                                    var7 |= -34878078;
                                    var7 ^= -1681016020;
                                    break;
                                case 2012697517:
                                default:
                                    var7 ^= 350660768;
                            }
                        } else {
                            switch (var7) {
                                case -958246734:
                                    var7 ^= -341124027;
                                    break;
                                case -712641788:
                                default:
                                    var7 ^= -67983366;
                                    break;
                                case 1685672148:
                                    var7 &= 733551988;
                                    var7 ^= 1176462502;
                            }
                        }
                    } else {
                        var7 ^= -758991983;
                        var7 ^= -236457971;
                    }

                    Integer var181 = var7;
                    if (var181 != null) {
                        m_2 var182 = this.cU;
                        var11 = var8 + 1;
                        var11 = var8 * var11;
                        var11 &= 1;
                        if (var11 != 0) {
                            var7 |= 647207019;
                            var7 <<= 8;
                            var7 -= 696580073;
                            var7 ^= -759095494;
                            break label204;
                        }

                        var7 *= -53725961;
                        var7 *= -1268549707;
                        var7 <<= 27;
                        var7 &= -151270285;
                        var7 ^= -965788600;
                        long var220 = var7;
                        long var266 = var220 + 1L;
                        var266 = var220 * var266;
                        long var274 = var220 + 2L;
                        var266 *= var274;
                        long var221 = var220 + 3L;
                        var266 *= var221;
                        long var222 = var266 & 7L;
                        long var279;
                        var11 = (var279 = var222 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                        label164:
                        if (var11 == 0) {
                            if (var182 != null) {
                                var7 &= 264771586;
                                var7 &= -1041961319;
                                var7 *= 1738918711;
                                var7 ^= -479508868;
                                long var183 = var7;
                                var12 = var183 + 1L;
                                var12 = var183 * var12;
                                long var14 = var183 + 2L;
                                var12 *= var14;
                                long var184 = var183 + 3L;
                                var12 *= var184;
                                long var185 = var12 & 7L;
                                long var280;
                                int var186 = (var280 = var185 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                                if (var186 != 0) {
                                    break label164;
                                }

                                m_2 var187 = this.cU;
                                m_2 var224 = this.NC;
                                Integer var243 = var8;
                                if (var243 == null) {
                                    var7 ^= 1008186817;
                                    var7 *= -397419975;
                                    var7 ^= -1746480328;
                                    break label204;
                                }

                                var7 *= 2141089153;
                                var7 += 1329804571;
                                var7 ^= -351182129;
                                var7 ^= 1195469168;
                                int var244 = var7 + 1;
                                int var245 = var7 * var244;
                                int var270 = var7 + 2;
                                int var246 = var245 * var270;
                                int var271 = var7 + 3;
                                int var247 = var246 * var271;
                                int var248 = var247 & 7;
                                if (var248 != 0) {
                                    break label164;
                                }

                                label171: {
                                    if (var224 == null) {
                                        var7 = switch (var7) {
                                            case 524826152 -> {
                                                var7 <<= 19;
                                                var7 -= 1462284411;
                                                var7 += -414026685;
                                                yield var7 ^ -1291453734;
                                            }
                                            case 632746113 -> var7 ^ 2072694637;
                                            default -> var7 ^ -370268230;
                                        };
                                        Integer var225 = var7;
                                        if (var225 == null) {
                                            break label164;
                                        }

                                        float var226 = this.j;
                                        float var281;
                                        int var227 = (var281 = var226 - 1.0F) == 0.0F ? 0 : (var281 < 0.0F ? -1 : 1);
                                        Integer var249 = var8;
                                        if (var249 == null) {
                                            var7 ^= -1311109293;
                                            var7 += 2061971120;
                                            var7 >>= 13;
                                            var7 ^= -1555765050;
                                            break label204;
                                        }

                                        var7 += 1942513963;
                                        var7 ^= 2143782533;
                                        if (var227 >= 0) {
                                            var7 -= 2092560845;
                                            var7 -= -247984917;
                                            var7 |= 1195039599;
                                            var7 ^= 734411062;
                                            var7 ^= 921420487;
                                            Integer var228 = var7;
                                            if (var228 == null) {
                                                break label164;
                                            }

                                            var229 = 1.0F;
                                            var7 |= 2047433135;
                                            var7 ^= -581252565;
                                            var7 *= 1293112021;
                                            var7 += 1484478950;
                                            var7 ^= -913207988;
                                            break label171;
                                        }

                                        var7 += -1467135398;
                                        var7 ^= -2038732766;
                                    } else {
                                        var7 -= -1670183591;
                                        var7 *= -1833012283;
                                        var7 |= 113748314;
                                        var7 *= 1654667915;
                                        var7 ^= 996325721;
                                    }

                                    var229 = var9;
                                    var7 >>>= 23;
                                    var7 += -1510423772;
                                    var7 ^= 2139270891;
                                }

                                int var250 = var7 + 1;
                                int var251 = var7 * var250;
                                int var272 = var7 + 2;
                                int var252 = var251 * var272;
                                int var273 = var7 + 3;
                                int var253 = var252 * var273;
                                int var254 = var253 & 7;
                                if (var254 != 0) {
                                    break label164;
                                }

                                int var255 = var7 >>> 19;
                                int var256 = var255 + 1528200280;
                                int var257 = var256 * -461811109;
                                int var258 = var257 ^ 865940626;
                                int var259 = var258 ^ 1341431570;
                                GE(var1, var187, var2, var3, var4, var5, var6, var229, var259);
                                var7 |= 1771130255;
                                var7 |= 1649233900;
                                var7 ^= -734286237;
                            } else {
                                var7 -= 854768526;
                                var7 ^= 1584345766;
                                m_2 var188 = this.NC;
                                Integer var230 = var8;
                                if (var230 == null) {
                                    var7 &= 768490463;
                                    var7 ^= 1371221553;
                                    break label204;
                                }

                                var7 += -900892276;
                                var7 *= -2025741167;
                                var7 ^= -973118385;
                                int var231 = var7 + 1;
                                var231 = var7 * var231;
                                var231 &= 1;
                                if (var231 != 0) {
                                    break label164;
                                }

                                if (var188 != null) {
                                    var7 |= 1571014001;
                                    var7 &= -2088259207;
                                    var7 &= -832153927;
                                    var7 >>>= 20;
                                    var7 ^= -854330816;
                                    var9 = var9;
                                    switch (var7) {
                                        case -854330784:
                                            var7 |= -678560282;
                                            var7 >>= 18;
                                            var7 -= -697102410;
                                            var7 += 1105576855;
                                            var7 ^= 972790210;
                                            break;
                                        case -261931646:
                                            var7 ^= 1582371359;
                                            break;
                                        case 2076696742:
                                        default:
                                            var7 ^= -1066056255;
                                    }
                                } else {
                                    var7 += 1847290241;
                                    var7 -= 1244165402;
                                    var7 += -1262087707;
                                    var7 *= 747691647;
                                    var7 ^= 1129978429;
                                    int var189 = var7 + 1;
                                    var189 = var7 * var189;
                                    var189 &= 1;
                                    if (var189 != 0) {
                                        break label164;
                                    }

                                    var9 = 1.0F;
                                    var7 *= 222585465;
                                    var7 *= 21378293;
                                    var7 ^= 1453089755;
                                    var7 <<= 4;
                                    var7 ^= 405818554;
                                }

                                int var192 = DP.Y(-14013906, var9);
                                var1.roundRect(var2, var3, var4, var4, var5, var192);
                                float var193 = var4 * 0.5F;
                                float var194 = var2 + var193;
                                float var234 = var4 * 0.5F;
                                float var235 = var3 + var234;
                                var1.save();
                                var1.alpha(var9);
                                var9 = var4 * 0.055F;
                                var1.scale(var9, var194, var235);
                                int var169 = var8 + 1;
                                int var170 = var8 * var169;
                                var8 = var170 & 1;
                                if (var8 != 0) {
                                    switch (var7) {
                                        case -1353410803:
                                        default:
                                            var7 ^= -2009062815;
                                            break label204;
                                        case 1384722954:
                                            var7 |= -728372669;
                                            var7 ^= 1268709827;
                                            var7 ^= -1044766811;
                                            break label204;
                                        case 1687159540:
                                            var7 ^= 305913050;
                                            break label204;
                                    }
                                }

                                var7 <<= 30;
                                var7 |= 402690332;
                                var7 &= -851229115;
                                var7 += -502062969;
                                var7 ^= 1560847008;
                                var8 = var7 + 1;
                                var8 = var7 * var8;
                                int var171 = var7 + 2;
                                var8 *= var171;
                                int var172 = var7 + 3;
                                var8 *= var172;
                                var8 &= 7;
                                if (var8 != 0) {
                                    break label164;
                                }

                                TextStyle var160 = g;
                                ii.o(var1, var194, var235, var160);
                                var1.restore();
                                var7 -= 1910773730;
                                var7 ^= -107591695;
                                var7 &= -1911456447;
                                var7 += -147004435;
                                var7 ^= 754635105;
                            }

                            long var161 = var7;
                            long var195 = var161 + 1L;
                            long var196 = var161 * var195;
                            var12 = var161 + 2L;
                            long var197 = var196 * var12;
                            long var162 = var161 + 3L;
                            long var198 = var197 * var162;
                            long var163 = var198 & 7L;
                            long var282;
                            var8 = (var282 = var163 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                            if (var8 == 0) {
                                return;
                            }
                        }
                    }
                }

                IllegalStateException var165 = new IllegalStateException();
                throw var165;
            }
        }

        IllegalStateException var153 = new IllegalStateException();
        throw var153;
    }

    public void wj(AuraRenderer var1) {
        int var2 = W;
        var2 ^= 1064243869;
        int var3 = System.identityHashCode(this);
        Integer var17 = var3;
        if (var17 == null) {
            var2 += -1574288140;
            var2 ^= 806497054;
            IllegalStateException var21 = new IllegalStateException();
            throw var21;
        } else {
            var2 += -659978985;
            var2 *= 51714361;
            var2 |= 319885904;
            var2 += -953306703;
            var2 ^= -718589578;
            var17 = var2;
            if (var17 != null) {
                m_2 var19 = this.cU;
                int var4 = var2 - 70782456;
                var4 += 1263312410;
                var4 *= 213151179;
                var4 &= 917590779;
                var4 ^= 898299995;
                D(var19, var1, var4);
                m_2 var20 = this.NC;
                var2 += 2130957277;
                var2 ^= 256712604;
                D(var20, var1, var2);
                this.NC = null;
                this.cU = null;
                this.LQ = "";
                AtomicReference var14 = this.zC;
                var14.set(null);
                this.j = 1.0F;
            } else {
                UnsupportedOperationException var11 = new UnsupportedOperationException();
                throw var11;
            }
        }
    }

    private static void GE(Canvas var0, m_2 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
        label95: {
            int var10 = System.identityHashCode(var0);
            int var11 = 0;
            Integer var12 = var10;
            int var21;
            if (var12 == null) {
                var21 = var8 - -538535723;
                var21 -= -468020017;
                var21 >>= 21;
                var21 ^= 1864847707;
            } else {
                var21 = switch (var8) {
                    case -1420580840 -> var8 ^ -995117023;
                    default -> var8 ^ -1774987075;
                    case 2078526941 -> {
                        var21 = var8 + -1930624362;
                        yield var21 ^ 1238792285;
                    }
                };
                var12 = var21;
                if (var12 == null) {
                    break label95;
                }

                var11 = var11;
                var21 += 241115103;
                var21 |= 69783869;
                var21 ^= -383389974;

                while (true) {
                    var12 = var21;
                    if (var12 == null) {
                        break label95;
                    }

                    int var78 = var11 + 1;
                    int[] var13 = var1.sizes();
                    int var95 = var13.length;
                    int var14 = var10 + 1;
                    var14 = var10 * var14;
                    int var15 = var10 + 2;
                    var14 *= var15;
                    var15 = var10 + 3;
                    var14 *= var15;
                    var14 &= 7;
                    if (var14 != 0) {
                        var21 &= 491707550;
                        var21 ^= -1802454926;
                        break;
                    }

                    var21 *= -933642905;
                    var21 *= -756645247;
                    var21 |= -395538288;
                    var21 ^= -1522680978;
                    if (var78 < var95) {
                        var21 += -553352588;
                        var21 |= -1289591746;
                        var21 *= 1059211249;
                        var21 &= -297341000;
                        var21 ^= 1396873662;
                        var78 = var21 + 1;
                        var78 = var21 * var78;
                        var78 &= 1;
                        if (var78 != 0) {
                            break label95;
                        }

                        int[] var82 = var1.sizes();
                        long var96 = var10;
                        long var124 = var96 + 1L;
                        long var125 = var96 * var124;
                        long var17 = var96 + 2L;
                        long var126 = var125 * var17;
                        long var97 = var96 + 3L;
                        long var127 = var126 * var97;
                        long var98 = var127 & 7L;
                        long var128;
                        int var99 = (var128 = var98 - 0L) == 0L ? 0 : (var128 < 0L ? -1 : 1);
                        if (var99 != 0) {
                            var21 <<= 12;
                            var21 ^= -1122251548;
                            break;
                        }

                        var21 &= 1823985669;
                        var21 ^= 2103505067;
                        var21 ^= 1305803953;
                        var21 ^= 1882761912;
                        var21 ^= -1288647449;
                        int var100 = var21 + 1;
                        int var101 = var21 * var100;
                        var14 = var21 + 2;
                        int var102 = var101 * var14;
                        var14 = var21 + 3;
                        int var103 = var102 * var14;
                        int var104 = var103 & 7;
                        if (var104 != 0) {
                            break label95;
                        }

                        int var105 = var11 + 1;
                        var78 = var82[var105];
                        float var84 = var78;
                        float var129;
                        var78 = (var129 = var84 - var6) == 0.0F ? 0 : (var129 < 0.0F ? -1 : 1);
                        if (var78 >= 0) {
                            var21 = switch (var21) {
                                default -> var21 ^ 22846141;
                                case -790377752 -> var21 ^ 1727539956;
                                case -138495423 -> {
                                    var21 *= -2033159591;
                                    var21 += -1191284580;
                                    yield var21 ^ -2014748045;
                                }
                            };
                            long var86 = var21;
                            long var119 = var86 + 1L;
                            long var120 = var86 * var119;
                            long var87 = var120 & 1L;
                            long var130;
                            var78 = (var130 = var87 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                            if (var78 != 0) {
                                break label95;
                            }

                            var78 = var11 + 1;
                            int var106 = var10 + 1;
                            int var107 = var10 * var106;
                            var14 = var10 + 2;
                            int var108 = var107 * var14;
                            var14 = var10 + 3;
                            int var109 = var108 * var14;
                            int var110 = var109 & 7;
                            if (var110 != 0) {
                                var21 -= 11359729;
                                var21 ^= 41350074;
                                var21 &= 323646498;
                                var21 |= 857995497;
                                var21 ^= -1548528625;
                                break;
                            }

                            var21 <<= 22;
                            var21 &= -1012049514;
                            var21 ^= 1996379638;
                            var11 = var78;
                            var21 |= 908658071;
                            var21 |= 1450051553;
                            var21 &= -52084977;
                            var21 ^= -931521455;
                            var21 ^= 441924737;
                            continue;
                        }

                        var21 *= -1004183461;
                        var21 |= 890007285;
                        var21 ^= 1321862280;
                    } else {
                        var21 <<= 30;
                        var21 >>>= 8;
                        var21 |= -710735816;
                        var21 ^= -333122737;
                    }

                    var78 = var21 + 1;
                    var78 = var21 * var78;
                    var78 &= 1;
                    if (var78 != 0) {
                        break label95;
                    }

                    int[] var93 = var1.textures();
                    var11 = var93[var11];
                    var78 = DP.Y(-1, var7);
                    int var111 = var10 + 1;
                    int var112 = var10 * var111;
                    var10 = var112 & 1;
                    if (var10 == 0) {
                        var21 *= -1400558709;
                        var21 -= 1345919404;
                        var21 ^= 2031072498;
                        var10 = var21 + 1;
                        var10 = var21 * var10;
                        var21 = var10 & 1;
                        if (var21 == 0) {
                            var0.image(var11, var2, var3, var4, var4, 0.0F, 0.0F, 1.0F, 1.0F, var78, var5, true);
                            return;
                        }
                        break label95;
                    }

                    var21 *= -1653159473;
                    var21 ^= 807823581;
                    break;
                }
            }

            Integer var72 = var21;
            if (var72 != null) {
                AssertionError var73 = new AssertionError();
                throw var73;
            }
        }

        RuntimeException var68 = new RuntimeException();
        throw var68;
    }

    private void i(m_2 var1, AuraRenderer var2, int var3) {
        float var40;
        label47: {
            int var5 = System.identityHashCode(this);
            Integer var35 = var5;
            if (var35 == null) {
                int var31 = var3 | 554735124;
                var31 |= -439011802;
                var31 ^= 982455733;
                var31 ^= 1959695053;
                long var41 = var31;
                long var7 = var41 + 1L;
                var7 = var41 * var7;
                long var42 = var7 & 1L;
                long var50;
                int var43 = (var50 = var42 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
                if (var43 == 0) {
                    IllegalArgumentException var44 = new IllegalArgumentException();
                    throw var44;
                }
            } else {
                label50: {
                    int var11 = switch (var3) {
                        default -> var3 ^ 649070688;
                        case -164671519 -> var3 ^ -1261754924;
                        case 1309889500 -> {
                            int var4 = var3 & 1304494928;
                            var4 += -803818711;
                            var4 += 745464068;
                            yield var4 ^ 1573221272;
                        }
                    };
                    m_2 var36 = this.NC;
                    int var6 = var11 | 1516898703;
                    var6 |= -1697821824;
                    var6 ^= -565885625;
                    D(var36, var2, var6);
                    m_2 var37 = this.cU;
                    this.NC = var37;
                    this.cU = var1;
                    m_2 var38 = this.NC;
                    if (var38 == null) {
                        var11 += -1130793538;
                        var11 &= -1850651366;
                        var11 &= 2121736141;
                        var11 ^= 1864006849;
                        var11 ^= 219072751;
                        if (var1 == null) {
                            var11 ^= -1408100298;
                            var11 *= -94114881;
                            var11 += -1435649623;
                            var11 ^= 432933730;
                            Integer var39 = var11;
                            if (var39 != null) {
                                var40 = 1.0F;
                                var11 &= -911500328;
                                var11 ^= 1170498720;
                                break label47;
                            }
                            break label50;
                        }

                        var11 >>= 24;
                        var11 ^= 68409828;
                        var11 *= -1643409491;
                        var11 ^= 2038223187;
                    } else {
                        var11 ^= 2075292226;
                        var11 ^= -756313174;
                    }

                    Integer var47 = var11;
                    if (var47 != null) {
                        var40 = 0.0F;
                        var11 *= 1871864375;
                        var11 -= -212580839;
                        var11 ^= 2088676802;
                        break label47;
                    }
                }
            }

            IllegalArgumentException var48 = new IllegalArgumentException();
            throw var48;
        }

        this.j = var40;
    }

    private void ht(String var1, byte[] var2, int var3) {
        int var5 = System.identityHashCode(this);
        long var19 = var5;
        long var7 = var19 + 1L;
        var7 = var19 * var7;
        long var20 = var7 & 1L;
        long var32;
        var5 = (var32 = var20 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var5 != 0) {
            int var14 = switch (var3) {
                case 1062017747 -> {
                    int var15 = var3 * 1035201671;
                    var15 |= 1544407716;
                    var15 &= 358634288;
                    var15 >>>= 15;
                    yield var15 ^ -1607517506;
                }
                case 1632904207 -> var3 ^ -23864676;
                default -> var3 ^ 288717151;
            };
            var5 = var14 + 1;
            var5 = var14 * var5;
            int var6 = var14 + 2;
            var5 *= var6;
            var6 = var14 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 == 0) {
                AssertionError var29 = new AssertionError();
                throw var29;
            } else {
                AssertionError var28 = new AssertionError();
                throw var28;
            }
        } else {
            switch (var3) {
                case -900462234:
                    int var12 = var3 ^ -1335131954;
                    break;
                case 543978373:
                default:
                    int var11 = var3 ^ 91075453;
                    break;
                case 1062017747:
                    int var4 = var3 & -641469875;
                    var4 >>= 2;
                    var4 ^= -1462919441;
            }

            ExecutorService var13 = Ji;
            Runnable var22 = () -> {
                RgbaImage[] var228;
                RgbaImage[] var233;
                RgbaImage var298;
                int[] var329;
                Object var337;
                boolean var340;
                AtomicReference var352;
                R var367;
                int var3x = W;
                var3x ^= 747485421;
                Throwable var4x = null;
                String var5x = this.LQ;

                var3x = switch (var3x) {
                    case 192139497 -> {
                        var3x >>>= 18;
                        var3x &= -1202817372;
                        yield var3x ^ -1778898973;
                    }
                    case 914641073 -> var3x ^ 499752299;
                    default -> var3x ^ 1369198364;
                };
                boolean var213 = var1.equals(var5x);
                if (!var213) {
                    Integer var214 = switch (var3x) {
                        case -1778899609 -> {
                            var3x -= -1438442764;
                            yield var3x ^ -106688071;
                        }
                        default -> var3x ^ -89618148;
                        case 419733439 -> var3x ^ 1895074923;
                    };
                    if (var214 != null) {
                        return;
                    }
                } else {
                    label259: {
                        var3x |= -826931421;
                        var3x *= -259347769;
                        var3x ^= 829685907;

                        label260: {
                            label251: {
                                label250: {
                                    label278: {
                                        try {
                                            var3x -= -663246603;
                                            var3x -= 1076085428;
                                            var3x >>>= 31;
                                            var3x &= 714861681;
                                            var3x ^= 2028991690;
                                        } catch (LinkageError | Exception var30x) {
                                            int var40 = W;
                                            int var41 = var40 ^ -839436007;
                                            Throwable var215 = I(var30x);
                                            var4x = var215;
                                            int var42 = var41 & -504347700;
                                            int var43 = var42 * 1745873491;
                                            var3x = var43 ^ -2027943326;
                                            long var216 = var3x;
                                            long var7x = var216 + 1L;
                                            var7x = var216 * var7x;
                                            long var217 = var7x & 1L;
                                            long var383;
                                            int var218 = (var383 = var217 - 0L) == 0L ? 0 : (var383 < 0L ? -1 : 1);
                                            if (var218 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        long var219 = var3x;
                                        long var304 = var219 + 1L;
                                        var304 = var219 * var304;
                                        long var9x = var219 + 2L;
                                        var304 *= var9x;
                                        long var220 = var219 + 3L;
                                        var304 *= var220;
                                        long var221 = var304 & 7L;
                                        long var384;
                                        int var222 = (var384 = var221 - 0L) == 0L ? 0 : (var384 < 0L ? -1 : 1);
                                        if (var222 != 0) {
                                            break label259;
                                        }

                                        try {
                                            RgbaImage var227 = RgbaImage.decode(var2);
                                            var3x |= -1377225842;
                                            var3x &= 321449337;
                                            var3x |= 1369389655;
                                            var3x -= -136441796;
                                            var3x ^= 1834572827;
                                            var228 = var227.squareMips(256, 32);
                                            var3x &= 1350650559;
                                            var3x ^= 1440133409;
                                        } catch (LinkageError | Exception var29x) {
                                            int var50 = W;
                                            int var51 = var50 ^ -839436007;
                                            Throwable var223 = I(var29x);
                                            var4x = var223;
                                            int var52 = var51 & -504347700;
                                            int var53 = var52 * 1745873491;
                                            var3x = var53 ^ -2027943326;
                                            long var224 = var3x;
                                            var304 = var224 + 1L;
                                            var304 = var224 * var304;
                                            long var225 = var304 & 1L;
                                            long var385;
                                            int var226 = (var385 = var225 - 0L) == 0L ? 0 : (var385 < 0L ? -1 : 1);
                                            if (var226 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        int var6x = var3x + 1;
                                        var6x = var3x * var6x;
                                        var6x &= 1;
                                        if (var6x != 0) {
                                            break label259;
                                        }

                                        try {
                                            var233 = var228;
                                            var3x &= -450396580;
                                            var3x ^= 52275278;
                                            var6x = var228.length;
                                        } catch (LinkageError | Exception var28x) {
                                            int var61 = W;
                                            int var62 = var61 ^ -839436007;
                                            Throwable var229 = I(var28x);
                                            var4x = var229;
                                            int var63 = var62 & -504347700;
                                            int var64 = var63 * 1745873491;
                                            var3x = var64 ^ -2027943326;
                                            long var230 = var3x;
                                            var304 = var230 + 1L;
                                            var304 = var230 * var304;
                                            long var231 = var304 & 1L;
                                            long var386;
                                            int var232 = (var386 = var231 - 0L) == 0L ? 0 : (var386 < 0L ? -1 : 1);
                                            if (var232 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }
                                        var3x = switch (var3x) {
                                            case -1673485751 -> var3x ^ 488950718;
                                            default -> var3x ^ 432062433;
                                            case 1176214102 -> {
                                                var3x += 1093178608;
                                                var3x ^= -1219743767;
                                                var3x -= -1593853573;
                                                yield var3x ^ 116042879;
                                            }
                                        };
                                        int var312 = var3x + 1;
                                        int var313 = var3x * var312;
                                        int var8 = var3x + 2;
                                        int var314 = var313 * var8;
                                        var8 = var3x + 3;
                                        int var315 = var314 * var8;
                                        int var316 = var315 & 7;
                                        if (var316 != 0) {
                                            break label259;
                                        }

                                        try {
                                            var6x--;
                                            var3x -= -1655956691;
                                            var3x ^= 1838700467;
                                        } catch (LinkageError | Exception var27x) {
                                            int var71 = W;
                                            int var72 = var71 ^ -839436007;
                                            Throwable var234 = I(var27x);
                                            var4x = var234;
                                            int var73 = var72 & -504347700;
                                            int var74 = var73 * 1745873491;
                                            var3x = var74 ^ -2027943326;
                                            long var235 = var3x;
                                            var304 = var235 + 1L;
                                            var304 = var235 * var304;
                                            long var236 = var304 & 1L;
                                            long var387;
                                            int var237 = (var387 = var236 - 0L) == 0L ? 0 : (var387 < 0L ? -1 : 1);
                                            if (var237 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        int var319 = var3x + 1;
                                        int var320 = var3x * var319;
                                        int var321 = var320 & 1;
                                        if (var321 != 0) {
                                            break label259;
                                        }

                                        try {
                                            RgbaImage var297 = var233[var6x];
                                            var3x -= 1615777395;
                                            var3x *= 45330955;
                                            var3x -= -1539555130;
                                            var3x ^= 151690651;
                                            var3x ^= -1212347276;
                                            var298 = var297;
                                            var3x ^= 1337543973;
                                            var3x ^= -1005500891;
                                        } catch (LinkageError | Exception var26x) {
                                            int var77 = W;
                                            int var78 = var77 ^ -839436007;
                                            Throwable var238 = I(var26x);
                                            var4x = var238;
                                            int var79 = var78 & -504347700;
                                            int var80 = var79 * 1745873491;
                                            var3x = var80 ^ -2027943326;
                                            long var239 = var3x;
                                            var304 = var239 + 1L;
                                            var304 = var239 * var304;
                                            long var240 = var304 & 1L;
                                            long var388;
                                            int var241 = (var388 = var240 - 0L) == 0L ? 0 : (var388 < 0L ? -1 : 1);
                                            if (var241 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        int var324 = var3x + 1;
                                        int var325 = var3x * var324;
                                        int var326 = var325 & 1;
                                        if (var326 != 0) {
                                            break label259;
                                        }

                                        try {
                                            var329 = var298.argb();
                                            var3x *= 1056929201;
                                            var3x ^= -1247075186;
                                            var8 = var298.width();
                                            var3x ^= -1645630132;
                                            var3x <<= 18;
                                            var3x |= -225699820;
                                            var3x ^= -939172725;
                                        } catch (LinkageError | Exception var25x) {
                                            int var88 = W;
                                            int var89 = var88 ^ -839436007;
                                            Throwable var242 = I(var25x);
                                            var4x = var242;
                                            int var90 = var89 & -504347700;
                                            int var91 = var90 * 1745873491;
                                            var3x = var91 ^ -2027943326;
                                            long var243 = var3x;
                                            var304 = var243 + 1L;
                                            var304 = var243 * var304;
                                            long var244 = var304 & 1L;
                                            long var389;
                                            int var245 = (var389 = var244 - 0L) == 0L ? 0 : (var389 < 0L ? -1 : 1);
                                            if (var245 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        var9x = var3x;
                                        long var11x = var9x + 1L;
                                        var11x = var9x * var11x;
                                        long var13x = var9x + 2L;
                                        var11x *= var13x;
                                        var9x += 3L;
                                        var11x *= var9x;
                                        var9x = var11x & 7L;
                                        long var390;
                                        int var371 = (var390 = var9x - 0L) == 0L ? 0 : (var390 < 0L ? -1 : 1);
                                        if (var371 != 0) {
                                            break label259;
                                        }

                                        try {
                                            var6x = var298.height();
                                            var3x |= -52700;
                                            var3x += -1349813602;
                                            var3x |= -365473631;
                                            var3x ^= -330474376;
                                            var6x = var8 * var6x;
                                            var3x ^= -882610972;
                                            var3x ^= 2080686398;
                                            var6x = Rc.ve(var329, var6x);
                                        } catch (LinkageError | Exception var24x) {
                                            int var98 = W;
                                            int var99 = var98 ^ -839436007;
                                            Throwable var246 = I(var24x);
                                            var4x = var246;
                                            int var100 = var99 & -504347700;
                                            int var101 = var100 * 1745873491;
                                            var3x = var101 ^ -2027943326;
                                            long var247 = var3x;
                                            var304 = var247 + 1L;
                                            var304 = var247 * var304;
                                            long var248 = var304 & 1L;
                                            long var391;
                                            int var249 = (var391 = var248 - 0L) == 0L ? 0 : (var391 < 0L ? -1 : 1);
                                            if (var249 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }
                                        var3x = switch (var3x) {
                                            case -1265500065 -> {
                                                var3x *= 1113254163;
                                                yield var3x ^ 648808779;
                                            }
                                            default -> var3x ^ 376930176;
                                            case 1892462680 -> var3x ^ -1181337873;
                                        };

                                        try {
                                            var6x = var6x;
                                            var3x *= 809054897;
                                            var3x += -1458554405;
                                            var3x >>= 17;
                                            var3x ^= 374632649;
                                        } catch (LinkageError | Exception var23x) {
                                            int var110 = W;
                                            int var111 = var110 ^ -839436007;
                                            Throwable var250 = I(var23x);
                                            var4x = var250;
                                            int var112 = var111 & -504347700;
                                            int var113 = var112 * 1745873491;
                                            var3x = var113 ^ -2027943326;
                                            long var251 = var3x;
                                            var304 = var251 + 1L;
                                            var304 = var251 * var304;
                                            long var252 = var304 & 1L;
                                            long var392;
                                            int var253 = (var392 = var252 - 0L) == 0L ? 0 : (var392 < 0L ? -1 : 1);
                                            if (var253 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        Integer var334 = var3x;
                                        if (var334 == null) {
                                            break label259;
                                        }

                                        try {
                                            var337 = this.LQ;
                                        } catch (LinkageError | Exception var22x) {
                                            int var118 = W;
                                            int var119 = var118 ^ -839436007;
                                            Throwable var254 = I(var22x);
                                            var4x = var254;
                                            int var120 = var119 & -504347700;
                                            int var121 = var120 * 1745873491;
                                            var3x = var121 ^ -2027943326;
                                            long var255 = var3x;
                                            var304 = var255 + 1L;
                                            var304 = var255 * var304;
                                            long var256 = var304 & 1L;
                                            long var393;
                                            int var257 = (var393 = var256 - 0L) == 0L ? 0 : (var393 < 0L ? -1 : 1);
                                            if (var257 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }
                                        var3x = switch (var3x) {
                                            case 374629080 -> {
                                                var3x -= -1846141373;
                                                var3x ^= -480879962;
                                                yield var3x ^ -810295341;
                                            }
                                            case 552461576 -> var3x ^ 1317210146;
                                            default -> var3x ^ -1579025490;
                                        };
                                        Integer var361 = var3x;
                                        if (var361 == null) {
                                            break label259;
                                        }

                                        try {
                                            var340 = var1.equals(var337);
                                        } catch (LinkageError | Exception var21x) {
                                            int var125 = W;
                                            int var126 = var125 ^ -839436007;
                                            Throwable var258 = I(var21x);
                                            var4x = var258;
                                            int var127 = var126 & -504347700;
                                            int var128 = var127 * 1745873491;
                                            var3x = var128 ^ -2027943326;
                                            long var259 = var3x;
                                            var304 = var259 + 1L;
                                            var304 = var259 * var304;
                                            long var260 = var304 & 1L;
                                            long var394;
                                            int var261 = (var394 = var260 - 0L) == 0L ? 0 : (var394 < 0L ? -1 : 1);
                                            if (var261 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }
                                        var3x = switch (var3x) {
                                            default -> var3x ^ -2089369040;
                                            case -1464090144 -> {
                                                var3x += -1390318509;
                                                var3x &= -1368772932;
                                                yield var3x ^ 314487334;
                                            }
                                            case 7218598 -> var3x ^ -854883539;
                                        };
                                        long var362 = var3x;
                                        long var10x = var362 + 1L;
                                        var10x = var362 * var10x;
                                        long var363 = var10x & 1L;
                                        long var395;
                                        int var364 = (var395 = var363 - 0L) == 0L ? 0 : (var395 < 0L ? -1 : 1);
                                        if (var364 != 0) {
                                            break label259;
                                        }

                                        try {
                                            if (!var340) {
                                                break label250;
                                            }
                                        } catch (LinkageError | Exception var20x) {
                                            int var132 = W;
                                            int var133 = var132 ^ -839436007;
                                            Throwable var262 = I(var20x);
                                            var4x = var262;
                                            int var134 = var133 & -504347700;
                                            int var135 = var134 * 1745873491;
                                            var3x = var135 ^ -2027943326;
                                            long var263 = var3x;
                                            var304 = var263 + 1L;
                                            var304 = var263 * var304;
                                            long var264 = var304 & 1L;
                                            long var396;
                                            int var265 = (var396 = var264 - 0L) == 0L ? 0 : (var396 < 0L ? -1 : 1);
                                            if (var265 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        var3x -= -865801593;
                                        var3x ^= 1685716004;

                                        try {
                                            var3x &= -1567522600;
                                            var3x &= 879810744;
                                            var3x ^= -242915470;
                                            var3x -= -1109884796;
                                            var3x ^= 166777987;
                                        } catch (LinkageError | Exception var19x) {
                                            int var138 = W;
                                            int var139 = var138 ^ -839436007;
                                            Throwable var266 = I(var19x);
                                            var4x = var266;
                                            int var140 = var139 & -504347700;
                                            int var141 = var140 * 1745873491;
                                            var3x = var141 ^ -2027943326;
                                            long var267 = var3x;
                                            var304 = var267 + 1L;
                                            var304 = var267 * var304;
                                            long var268 = var304 & 1L;
                                            long var397;
                                            int var269 = (var397 = var268 - 0L) == 0L ? 0 : (var397 < 0L ? -1 : 1);
                                            if (var269 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        int var345 = var3x + 1;
                                        int var346 = var3x * var345;
                                        var364 = var3x + 2;
                                        int var347 = var346 * var364;
                                        var364 = var3x + 3;
                                        int var348 = var347 * var364;
                                        int var349 = var348 & 7;
                                        if (var349 != 0) {
                                            break label259;
                                        }

                                        try {
                                            var352 = this.zC;
                                        } catch (LinkageError | Exception var18x) {
                                            int var147 = W;
                                            int var148 = var147 ^ -839436007;
                                            Throwable var270 = I(var18x);
                                            var4x = var270;
                                            int var149 = var148 & -504347700;
                                            int var150 = var149 * 1745873491;
                                            var3x = var150 ^ -2027943326;
                                            long var271 = var3x;
                                            var304 = var271 + 1L;
                                            var304 = var271 * var304;
                                            long var272 = var304 & 1L;
                                            long var398;
                                            int var273 = (var398 = var272 - 0L) == 0L ? 0 : (var398 < 0L ? -1 : 1);
                                            if (var273 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }
                                        var3x = switch (var3x) {
                                            case 442250229 -> {
                                                var3x <<= 24;
                                                var3x &= 577937569;
                                                var3x &= -576340095;
                                                yield var3x ^ 1252370665;
                                            }
                                            case 732137728 -> var3x ^ 1846854028;
                                            default -> var3x ^ 429483293;
                                        };

                                        try {
                                            var367 = null;
                                            var3x ^= 1970308967;
                                            var3x ^= 857498977;
                                        } catch (LinkageError | Exception var17x) {
                                            int var155 = W;
                                            int var156 = var155 ^ -839436007;
                                            Throwable var274 = I(var17x);
                                            var4x = var274;
                                            int var157 = var156 & -504347700;
                                            int var158 = var157 * 1745873491;
                                            var3x = var158 ^ -2027943326;
                                            long var275 = var3x;
                                            var304 = var275 + 1L;
                                            var304 = var275 * var304;
                                            long var276 = var304 & 1L;
                                            long var399;
                                            int var277 = (var399 = var276 - 0L) == 0L ? 0 : (var399 < 0L ? -1 : 1);
                                            if (var277 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        int var372 = var3x + 1;
                                        int var373 = var3x * var372;
                                        int var378 = var3x + 2;
                                        int var374 = var373 * var378;
                                        int var379 = var3x + 3;
                                        int var375 = var374 * var379;
                                        int var376 = var375 & 7;
                                        if (var376 != 0) {
                                            break label259;
                                        }

                                        try {
                                            var367 = new R(var1, var233, var6x);
                                            var3x >>= 5;
                                            var3x ^= 1565885163;
                                        } catch (LinkageError | Exception var16x) {
                                            int var161 = W;
                                            int var162 = var161 ^ -839436007;
                                            Throwable var278 = I(var16x);
                                            var4x = var278;
                                            int var163 = var162 & -504347700;
                                            int var164 = var163 * 1745873491;
                                            var3x = var164 ^ -2027943326;
                                            long var279 = var3x;
                                            var304 = var279 + 1L;
                                            var304 = var279 * var304;
                                            long var280 = var304 & 1L;
                                            long var400;
                                            int var281 = (var400 = var280 - 0L) == 0L ? 0 : (var400 < 0L ? -1 : 1);
                                            if (var281 != 0) {
                                                break label259;
                                            }
                                            break label278;
                                        }

                                        int var282 = var3x + 1;
                                        int var283 = var3x * var282;
                                        int var284 = var283 & 1;
                                        if (var284 != 0) {
                                            break label259;
                                        }

                                        try {
                                            var352.set(var367);
                                            var3x |= 350627402;
                                            var3x ^= -97257916;
                                            var3x &= 787931587;
                                            var3x <<= 9;
                                            var3x ^= -944495315;
                                            break label251;
                                        } catch (LinkageError | Exception var15x) {
                                            int var167 = W;
                                            int var168 = var167 ^ -839436007;
                                            Throwable var285 = I(var15x);
                                            var4x = var285;
                                            int var169 = var168 & -504347700;
                                            int var170 = var169 * 1745873491;
                                            var3x = var170 ^ -2027943326;
                                            long var286 = var3x;
                                            var304 = var286 + 1L;
                                            var304 = var286 * var304;
                                            long var287 = var304 & 1L;
                                            long var401;
                                            int var288 = (var401 = var287 - 0L) == 0L ? 0 : (var401 < 0L ? -1 : 1);
                                            if (var288 != 0) {
                                                break label259;
                                            }
                                        }
                                    }

                                    Logger var289 = b;
                                    String var199 = var4x.toString();
                                    var289.debug("Cover not decodable ({})", var199);
                                    String var200 = this.LQ;
                                    boolean var201 = var1.equals(var200);
                                    if (var201) {
                                        var3x -= -1107093812;
                                        var3x <<= 9;
                                        var3x *= 1220593799;
                                        var3x -= 129721097;
                                        var3x ^= -1373271890;
                                        int var202 = var3x + 1;
                                        int var203 = var3x * var202;
                                        int var290 = var3x + 2;
                                        int var204 = var203 * var290;
                                        int var291 = var3x + 3;
                                        int var205 = var204 * var291;
                                        int var206 = var205 & 7;
                                        if (var206 != 0) {
                                            break label259;
                                        }

                                        AtomicReference var207 = this.zC;
                                        var3x |= -766908329;
                                        var3x &= -1157785887;
                                        var3x &= 488458924;
                                        var3x >>= 12;
                                        var3x ^= 2126487766;
                                        R var292 = new R(var1, null, 0);
                                        var207.set(var292);
                                        switch (var3x) {
                                            case -1694132516:
                                                var3x ^= 33258293;
                                                break label260;
                                            case 2126389574:
                                                var3x += 1594246673;
                                                var3x >>>= 19;
                                                var3x ^= -2144949059;
                                                break label260;
                                            case 2132920593:
                                            default:
                                                var3x ^= 1708188249;
                                        }
                                    } else {
                                        var3x ^= -1612466598;
                                        var3x ^= 333120985;
                                    }
                                    break label260;
                                }

                                switch (var3x) {
                                    case -467522058:
                                        var3x ^= 1929861038;
                                        break;
                                    case 385260566:
                                        var3x *= -1069825369;
                                        var3x *= -265771585;
                                        var3x *= -972393265;
                                        var3x |= -932166413;
                                        var3x ^= -2050236714;
                                        break;
                                    case 1856927795:
                                    default:
                                        var3x ^= 896141322;
                                }
                            }

                            int var208 = var3x + 1;
                            int var209 = var3x * var208;
                            int var210 = var209 & 1;
                            if (var210 != 0) {
                                break label259;
                            }

                            var3x *= -471850875;
                            var3x |= 1989974446;
                            var3x ^= 2142857962;
                        }

                        int var211 = var3x + 1;
                        int var212 = var3x * var211;
                        var3x = var212 & 1;
                        if (var3x == 0) {
                            return;
                        }
                    }
                }

                IllegalArgumentException var197 = new IllegalArgumentException();
                throw var197;
            };
            var13.execute(var22);
        }
    }

    private static m_2 Mn(R var0, AuraRenderer var1, int var2) {
        label180: {
            int var4 = System.identityHashCode(var0);
            int var5 = var4 + 1;
            var5 = var4 * var5;
            var5 &= 1;
            int var15;
            if (var5 == 0) {
                var15 = switch (var2) {
                    case -434609462 -> var2 ^ -412622984;
                    case 174106133 -> {
                        var15 = var2 ^ 461775373;
                        var15 *= -193988157;
                        var15 ^= 876827943;
                        var15 &= 1743216371;
                        yield var15 ^ 1980288955;
                    }
                    default -> var2 ^ -929548014;
                };
                long var104 = var15;
                long var7 = var104 + 1L;
                var7 = var104 * var7;
                long var105 = var7 & 1L;
                long var206;
                var5 = (var206 = var105 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label180;
                }

                RgbaImage[] var107 = var0.mips();
                if (var107 == null) {
                    var15 |= 414905324;
                    var15 ^= -44939733;
                    var15 &= 222226642;
                    var15 += 1180386030;
                    var15 ^= 1037500678;
                    return null;
                }

                var15 += -1248417390;
                var15 += 1258563841;
                var15 += 363609096;
                var15 >>>= 30;
                var15 ^= -1499560855;
                RgbaImage[] var108 = var0.mips();
                var5 = var108.length;
                long var6 = var4;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                long var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var207;
                int var114 = (var207 = var6 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                if (var114 == 0) {
                    var15 *= -1478091777;
                    var15 <<= 10;
                    var15 += -1213055721;
                    var15 += -176042983;
                    var15 ^= 1607932456;
                    var6 = var15;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var208;
                    int var117 = (var208 = var6 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                    if (var117 != 0) {
                        break label180;
                    }

                    int[] var110 = new int[var5];
                    int[] var111 = var110;
                    RgbaImage[] var118 = var0.mips();
                    int var119 = var118.length;
                    int[] var120 = new int[var119];
                    int[] var121 = var120;
                    byte var123 = 0;
                    int var124 = var123;
                    var15 <<= 8;
                    var15 ^= 590955591;

                    label163:
                    while (true) {
                        Integer var133 = var15;
                        if (var133 == null) {
                            break label180;
                        }

                        RgbaImage[] var134 = var0.mips();
                        int var135 = var134.length;
                        int var9 = var4 + 1;
                        var9 = var4 * var9;
                        int var190 = var4 + 2;
                        var9 *= var190;
                        int var191 = var4 + 3;
                        var9 *= var191;
                        var9 &= 7;
                        if (var9 != 0) {
                            var15 &= -767053012;
                            var15 += -1479606512;
                            var15 ^= 1015746243;
                            break;
                        }
                        var15 = switch (var15) {
                            case -1619659974 -> var15 ^ -1510232396;
                            default -> var15 ^ -1899726973;
                            case 1447713863 -> {
                                var15 >>>= 20;
                                yield var15 ^ -1501410239;
                            }
                        };
                        long var165 = var15;
                        long var11 = var165 + 1L;
                        var11 = var165 * var11;
                        long var166 = var11 & 1L;
                        long var209;
                        var9 = (var209 = var166 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            break label180;
                        }

                        if (var124 >= var135) {
                            var15 ^= 928613749;
                            var15 += 418126364;
                            var15 >>>= 9;
                            var15 ^= -286720850;
                            var7 = var15;
                            long var188 = var7 + 1L;
                            long var189 = var7 * var188;
                            var7 = var189 & 1L;
                            long var214;
                            var4 = (var214 = var7 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                            if (var4 == 0) {
                                String var127 = var0.key();
                                int var160 = var0.accent();
                                return new m_2(var127, var111, var121, var160);
                            }
                            break label180;
                        }
                        var15 = switch (var15) {
                            case -1501411035 -> {
                                var15 *= -817314925;
                                var15 += 1748418569;
                                var15 >>= 22;
                                yield var15 ^ -1922087265;
                            }
                            default -> var15 ^ 302569532;
                            case 1689668271 -> var15 ^ -1488174993;
                        };
                        int var136 = var15 + 1;
                        int var137 = var15 * var136;
                        var9 = var15 + 2;
                        int var138 = var137 * var9;
                        var9 = var15 + 3;
                        int var139 = var138 * var9;
                        int var140 = var139 & 7;
                        if (var140 != 0) {
                            break label180;
                        }

                        RgbaImage[] var141 = var0.mips();
                        RgbaImage var142 = var141[var124];
                        int var143 = var1.createImage(var142);
                        long var170 = var4;
                        var11 = var170 + 1L;
                        var11 = var170 * var11;
                        long var171 = var11 & 1L;
                        long var210;
                        var9 = (var210 = var171 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            var15 *= 424184085;
                            var15 <<= 3;
                            var15 |= 186330890;
                            var15 += -607704924;
                            var15 ^= 1306056233;
                            break;
                        }

                        var15 += 1406580834;
                        var15 -= -1044214795;
                        var15 ^= -1857584671;
                        long var173 = var15;
                        var11 = var173 + 1L;
                        var11 = var173 * var11;
                        long var174 = var11 & 1L;
                        long var211;
                        var9 = (var211 = var174 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            break label180;
                        }

                        var111[var124] = var143;
                        RgbaImage[] var144 = var0.mips();
                        RgbaImage var145 = var144[var124];
                        int var146 = var145.width();
                        var121[var124] = var146;
                        int var147 = var111[var124];
                        if (var147 == 0) {
                            var15 &= 495154935;
                            var15 += -589907032;
                            var15 ^= 449428639;
                            var8 = var15;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var8 = var10 & 1L;
                            long var212;
                            int var152 = (var212 = var8 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                            if (var152 != 0) {
                                break label180;
                            }

                            byte var153 = 0;
                            Integer var181 = var4;
                            if (var181 != null) {
                                var15 *= -1355668277;
                                var15 ^= -1038335230;
                                var181 = var15;
                                if (var181 == null) {
                                    break label180;
                                }

                                int var154 = var153;
                                var15 |= -1990236239;
                                var15 ^= -31720128;

                                while (var154 < var124) {
                                    var15 = switch (var15) {
                                        default -> var15 ^ 1457628216;
                                        case 1640241845 -> {
                                            var15 *= -426690249;
                                            yield var15 ^ -1780942583;
                                        }
                                        case 2123065580 -> var15 ^ 1175745650;
                                    };
                                    var181 = var15;
                                    if (var181 == null) {
                                        break label180;
                                    }

                                    int var184 = var111[var154];
                                    var1.deleteImage(var184);
                                    var184 = var154 + 1;
                                    int var194 = var4 + 1;
                                    int var195 = var4 * var194;
                                    int var196 = var195 & 1;
                                    if (var196 != 0) {
                                        var15 >>>= 25;
                                        var15 ^= -962985559;
                                        break label163;
                                    }

                                    var15 *= -774433187;
                                    var15 ^= 1826799791;
                                    var154 = var184;
                                    var15 ^= 688177010;
                                    var15 &= -50472125;
                                    var15 ^= 351764089;
                                    var15 ^= -1464243312;
                                    var15 ^= 893572383;
                                }

                                var15 ^= -735657992;
                                var15 |= 1642821514;
                                var15 |= -1220503347;
                                var15 ^= 2019203554;
                                int var155 = var15 + 1;
                                int var156 = var15 * var155;
                                int var186 = var15 + 2;
                                int var157 = var156 * var186;
                                var186 = var15 + 3;
                                int var158 = var157 * var186;
                                int var159 = var158 & 7;
                                if (var159 == 0) {
                                    return null;
                                }
                                break label180;
                            }

                            var15 &= -1528940161;
                            var15 += 1988848938;
                            var15 |= -588484574;
                            var15 ^= 426243305;
                            break;
                        }
                        var15 = switch (var15) {
                            case -1780258835 -> {
                                var15 <<= 23;
                                var15 >>= 13;
                                var15 &= -796723499;
                                yield var15 ^ -973761282;
                            }
                            case -1362340451 -> var15 ^ 1984609194;
                            default -> var15 ^ -1598500155;
                        };
                        Integer var148 = var15;
                        if (var148 == null) {
                            break label180;
                        }

                        int var149 = var124 + 1;
                        long var176 = var4;
                        var11 = var176 + 1L;
                        var11 = var176 * var11;
                        long var13 = var176 + 2L;
                        var11 *= var13;
                        long var177 = var176 + 3L;
                        var11 *= var177;
                        long var178 = var11 & 7L;
                        long var213;
                        var9 = (var213 = var178 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            var15 ^= -1724326050;
                            var15 |= -27535634;
                            var15 ^= 952499769;
                            break;
                        }

                        var15 <<= 22;
                        var15 >>= 26;
                        var15 <<= 30;
                        var15 |= 1152261832;
                        var15 ^= 1591293828;
                        Integer var180 = var15;
                        if (var180 == null) {
                            break label180;
                        }

                        var124 = var149;
                        switch (var15) {
                            case -1703466676:
                                var15 += -1177012688;
                                var15 >>= 3;
                                var15 |= -1394415179;
                                var15 |= 1728468625;
                                var15 ^= -1180326984;
                                break;
                            case 472420267:
                                var15 ^= 1001494881;
                                break;
                            case 1338656283:
                            default:
                                var15 ^= 355888579;
                        }
                    }
                } else {
                    var15 &= -401515613;
                    var15 ^= 1720320503;
                }
            } else {
                var15 = var2 & -963727164;
                var15 ^= -996498989;
            }

            var4 = var15 + 1;
            var4 = var15 * var4;
            var15 = var4 & 1;
            if (var15 == 0) {
                RuntimeException var92 = new RuntimeException();
                throw var92;
            }
        }

        RuntimeException var98 = new RuntimeException();
        throw var98;
    }

    private static void D(m_2 var0, AuraRenderer var1, int var2) {
        int var4 = System.identityHashCode(var0);
        Integer var5 = var4;
        if (var5 == null) {
            int var50 = var2 ^ -1567247205;
            var50 += 1802665387;
            var50 &= 901077517;
            var50 ^= 1724855590;
            var50 ^= 64602046;
        } else {
            label90: {
                int var3 = var2 & 1577515245;
                var3 |= -258009555;
                var3 *= 243815091;
                var3 ^= -122995486;
                int var58 = var3 + 1;
                var58 = var3 * var58;
                int var6 = var3 + 2;
                var58 *= var6;
                var6 = var3 + 3;
                var58 *= var6;
                var58 &= 7;
                if (var58 == 0) {
                    if (var0 == null) {
                        var3 &= 1759385951;
                        var3 |= 51297219;
                        var3 -= -1801287254;
                        var3 ^= 188042446;
                        long var66 = var3;
                        long var78 = var66 + 1L;
                        var78 = var66 * var78;
                        long var67 = var78 & 1L;
                        long var99;
                        var58 = (var99 = var67 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                        if (var58 == 0) {
                            return;
                        }
                    } else {
                        var3 |= 740634518;
                        var3 ^= -1800363857;
                        var3 ^= -2103771866;
                        Integer var63 = var3;
                        if (var63 != null) {
                            int[] var64 = var0.textures();
                            long var70 = var4;
                            long var8 = var70 + 1L;
                            var8 = var70 * var8;
                            long var10 = var70 + 2L;
                            var8 *= var10;
                            long var71 = var70 + 3L;
                            var8 *= var71;
                            long var72 = var8 & 7L;
                            long var100;
                            var6 = (var100 = var72 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                switch (var3) {
                                    case -643568750:
                                        var3 ^= -2087598844;
                                        break label90;
                                    case -368184802:
                                        var3 *= 1148114149;
                                        var3 ^= -1971717054;
                                        break label90;
                                    case 882532777:
                                    default:
                                        var3 ^= -16911675;
                                        break label90;
                                }
                            }

                            var3 ^= -2145306390;
                            var3 ^= -1692927417;
                            Integer var74 = var3;
                            if (var74 != null) {
                                int[] var65 = var64;
                                int var75 = var64.length;
                                var75 = var75;
                                int var7 = 0;
                                var7 = var7;
                                var3 *= -243212599;
                                var3 *= -597919687;
                                var3 >>= 11;
                                var3 -= 2030787428;
                                var3 ^= -1833016290;

                                while (true) {
                                    int var83 = var3 + 1;
                                    int var84 = var3 * var83;
                                    int var9 = var3 + 2;
                                    int var85 = var84 * var9;
                                    var9 = var3 + 3;
                                    int var86 = var85 * var9;
                                    int var87 = var86 & 7;
                                    if (var87 != 0) {
                                        break;
                                    }

                                    if (var7 >= var75) {
                                        Integer var56 = switch (var3) {
                                            case -1560979564 -> var3 ^ -1129225888;
                                            default -> var3 ^ -984197167;
                                            case 341552915 -> {
                                                var3 += 454057998;
                                                var3 &= 356618587;
                                                var3 *= 983325379;
                                                yield var3 ^ 1169818683;
                                            }
                                        };
                                        if (var56 != null) {
                                            return;
                                        }
                                        break;
                                    }

                                    var3 += -640436193;
                                    var3 ^= -1094465113;
                                    Integer var88 = var3;
                                    if (var88 == null) {
                                        break;
                                    }

                                    int var89 = var65[var7];
                                    var1.deleteImage(var89);
                                    int var90 = var7 + 1;
                                    var9 = var4 + 1;
                                    var9 = var4 * var9;
                                    int var97 = var4 + 2;
                                    var9 *= var97;
                                    int var98 = var4 + 3;
                                    var9 *= var98;
                                    var9 &= 7;
                                    if (var9 != 0) {
                                        var3 *= -47720589;
                                        var3 ^= 1998274783;
                                        var3 &= 1820016660;
                                        var3 ^= 1838993540;
                                        break label90;
                                    }

                                    var3 |= 1177069888;
                                    var3 -= 302338718;
                                    var3 |= -1703421819;
                                    var3 ^= 129566251;
                                    var7 = var90;
                                    var3 >>>= 26;
                                    var3 -= 440550744;
                                    var3 -= -473583491;
                                    var3 ^= 363046258;
                                }
                            }
                        }
                    }
                }

                RuntimeException var57 = new RuntimeException();
                throw var57;
            }
        }

        AssertionError var55 = new AssertionError();
        throw var55;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1279321364;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        W = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/island");
        b = var5;
        TextStyle var6 = ii.w(10.0F, -1929379841);
        g = var6;
        ThreadFactory var7 = var0x -> {
            int var1x = W;
            var1x ^= 917231735;
            int var2x = System.identityHashCode(var0x);
            Thread var3x = new Thread(var0x, "Aura Artwork");
            Integer var19 = var2x;
            if (var19 != null) {
                var1x *= 1560394741;
                var1x ^= 1377797157;
                int var20 = var1x + 1;
                var20 = var1x * var20;
                int var4x = var1x + 2;
                var20 *= var4x;
                var4x = var1x + 3;
                var20 *= var4x;
                var20 &= 7;
                if (var20 == 0) {
                    var3x.setDaemon(true);
                    return var3x;
                }
            } else {
                long var13 = switch (var1x) {
                    case -837424261 -> var1x ^ 1421155360;
                    case 290828403 -> {
                        var1x -= 887280431;
                        var1x |= -1996385773;
                        yield var1x ^ -381612456;
                    }
                    default -> var1x ^ 866023033;
                };
                long var25 = var13 + 1L;
                long var26 = var13 * var25;
                long var5x = var13 + 2L;
                long var27 = var26 * var5x;
                long var14 = var13 + 3L;
                long var28 = var27 * var14;
                long var15 = var28 & 7L;
                long var30;
                var1x = (var30 = var15 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
                if (var1x == 0) {
                    AssertionError var18 = new AssertionError();
                    throw var18;
                }
            }

            IllegalArgumentException var17 = new IllegalArgumentException();
            throw var17;
        };
        ExecutorService var8 = Executors.newSingleThreadExecutor(var7);
        Ji = var8;
    }

    private static Throwable I(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
