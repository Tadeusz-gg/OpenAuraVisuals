package dev.aurap.hub;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ProcessBuilder.Redirect;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class CG {
    private static final int x = 262144;
    public static final int Za;

    private CG() {
    }

    public static FN XK(long var0, List var2) throws IOException {
        boolean var274 = false;
        Jh var275 = null;
        Jh var276 = null;
        String var277 = null;
        InputStream var292 = null;
        Jh var296 = null;
        Jh var303 = null;
        String var325 = null;
        InputStream var346 = null;
        FN var362 = null;
        IOException var365 = null;
        Integer var375 = null;
        Object var376 = null;
        String var377 = null;
        String var378 = null;
        int var4 = Za;
        var4 ^= 203850426;
        Throwable var5 = null;
        ProcessBuilder var6 = new ProcessBuilder(var2);
        Redirect var7 = Redirect.PIPE;
        var6 = var6.redirectInput(var7);
        Process var268 = var6.start();
        var4 >>= 27;
        var4 *= -1543785833;
        var4 *= -1294705583;
        var4 ^= -878459150;
        Process var269 = var268;
        OutputStream var270 = var268.getOutputStream();
        var270.close();
        var4 += 1324833834;
        var4 += 274740105;
        var4 *= -731897335;
        var4 *= -612084153;
        var4 ^= 1060914511;
        int var271 = var4 + 1;
        int var272 = var4 * var271;
        int var273 = var272 & 1;
        label223:
        if (var273 == 0) {
            Throwable var3;
            label324: {
                try {
                    var275 = null;
                    var4 *= -964226515;
                    var4 &= -136395172;
                    var4 <<= 15;
                    var4 ^= -456861516;
                } catch (Throwable var32) {
                    var3 = var32;
                    int var47 = Za;
                    int var48 = var47 ^ 177244622;
                    var274 = var32 instanceof InterruptedException;
                    int var49 = var48 ^ -785344919;
                    int var50 = var49 ^ 1636881808;
                    int var51 = var50 >> 17;
                    int var52 = var51 & 785507269;
                    var4 = var52 ^ -1783658833;
                    int var8 = var4 + 1;
                    var8 = var4 * var8;
                    var8 &= 1;
                    if (var8 != 0) {
                        break label223;
                    }
                    break label324;
                }

                long var285 = var4;
                long var10 = var285 + 1L;
                var10 = var285 * var10;
                long var12 = var285 + 2L;
                var10 *= var12;
                var285 += 3L;
                var10 *= var285;
                var285 = var10 & 7L;
                long var406;
                int var288 = (var406 = var285 - 0L) == 0L ? 0 : (var406 < 0L ? -1 : 1);
                if (var288 != 0) {
                    break label223;
                }

                try {
                    var292 = var269.getInputStream();
                    var4 |= 1680438679;
                    var4 += 156930193;
                    var4 |= -1876353394;
                    var4 *= 82664823;
                    var4 ^= -18464359;
                } catch (Throwable var31) {
                    var3 = var31;
                    int var58 = Za;
                    int var59 = var58 ^ 177244622;
                    var274 = var31 instanceof InterruptedException;
                    int var60 = var59 ^ -785344919;
                    int var61 = var60 ^ 1636881808;
                    int var62 = var61 >> 17;
                    int var63 = var62 & 785507269;
                    var4 = var63 ^ -1783658833;
                    int var289 = var4 + 1;
                    int var290 = var4 * var289;
                    int var291 = var290 & 1;
                    if (var291 != 0) {
                        break label223;
                    }
                    break label324;
                }

                int var9 = var4 + 1;
                var9 = var4 * var9;
                var9 &= 1;
                if (var9 != 0) {
                    break label223;
                }

                try {
                    var275 = new Jh(var292);
                    var4 ^= 650102364;
                    var4 |= -112176808;
                    var4 ^= 1177894722;
                    var276 = var275;
                    var4 &= 303686542;
                    var4 &= 744901498;
                    var4 ^= -218389020;
                    var296 = null;
                    var4 >>>= 16;
                    var4 &= -1482188948;
                    var4 += 73607713;
                    var4 ^= -912262458;
                    var346 = var269.getErrorStream();
                    var4 += -844758282;
                    var4 += 2042822200;
                    var4 ^= 1749755289;
                } catch (Throwable var30) {
                    var3 = var30;
                    int var69 = Za;
                    int var70 = var69 ^ 177244622;
                    var274 = var30 instanceof InterruptedException;
                    int var71 = var70 ^ -785344919;
                    int var72 = var71 ^ 1636881808;
                    int var73 = var72 >> 17;
                    int var74 = var73 & 785507269;
                    var4 = var74 ^ -1783658833;
                    int var293 = var4 + 1;
                    int var294 = var4 * var293;
                    int var295 = var294 & 1;
                    if (var295 != 0) {
                        break label223;
                    }
                    break label324;
                }

                var10 = var4;
                var12 = var10 + 1L;
                var12 = var10 * var12;
                var10 = var12 & 1L;
                long var407;
                int var371 = (var407 = var10 - 0L) == 0L ? 0 : (var407 < 0L ? -1 : 1);
                if (var371 != 0) {
                    break label223;
                }

                try {
                    var296 = new Jh(var346);
                    var4 += 29032596;
                    var4 <<= 7;
                    var4 &= -77090471;
                    var4 ^= -633173668;
                } catch (Throwable var29) {
                    var3 = var29;
                    int var88 = Za;
                    int var89 = var88 ^ 177244622;
                    var274 = var29 instanceof InterruptedException;
                    int var90 = var89 ^ -785344919;
                    int var91 = var90 ^ 1636881808;
                    int var92 = var91 >> 17;
                    int var93 = var92 & 785507269;
                    var4 = var93 ^ -1783658833;
                    int var297 = var4 + 1;
                    int var298 = var4 * var297;
                    int var299 = var298 & 1;
                    if (var299 != 0) {
                        break label223;
                    }
                    break label324;
                }

                long var347 = var4;
                long var11 = var347 + 1L;
                var11 = var347 * var11;
                long var348 = var11 & 1L;
                long var408;
                var9 = (var408 = var348 - 0L) == 0L ? 0 : (var408 < 0L ? -1 : 1);
                if (var9 != 0) {
                    break label223;
                }

                try {
                    var303 = var296;
                } catch (Throwable var28) {
                    var3 = var28;
                    int var98 = Za;
                    int var99 = var98 ^ 177244622;
                    var274 = var28 instanceof InterruptedException;
                    int var100 = var99 ^ -785344919;
                    int var101 = var100 ^ 1636881808;
                    int var102 = var101 >> 17;
                    int var103 = var102 & 785507269;
                    var4 = var103 ^ -1783658833;
                    int var300 = var4 + 1;
                    int var301 = var4 * var300;
                    int var302 = var301 & 1;
                    if (var302 != 0) {
                        break label223;
                    }
                    break label324;
                }
                var4 = switch (var4) {
                    case -1436337828 -> {
                        var4 ^= -1823737428;
                        yield var4 ^ -642252846;
                    }
                    case 617706898 -> var4 ^ -41665101;
                    default -> var4 ^ 1934507415;
                };
                long var350 = var4;
                var11 = var350 + 1L;
                var11 = var350 * var11;
                long var351 = var11 & 1L;
                long var409;
                var9 = (var409 = var351 - 0L) == 0L ? 0 : (var409 < 0L ? -1 : 1);
                if (var9 != 0) {
                    break label223;
                }

                label325: {
                    try {
                        var276.start();
                        var4 += -934376217;
                        var4 *= -802871781;
                        var4 |= -408334778;
                        var4 ^= -1784989585;
                        var303.start();
                        var4 += -1218469812;
                        var4 *= -1163312319;
                        var4 ^= -738032787;
                        TimeUnit var353 = TimeUnit.MILLISECONDS;
                        var4 *= 1850039127;
                        var4 >>>= 30;
                        var4 ^= 539637543;
                        boolean var354 = var269.waitFor(var0, var353);
                        var4 |= -1301307802;
                        var4 += 1836604059;
                        var4 ^= 267553432;
                        if (!var354) {
                            break label325;
                        }
                    } catch (Throwable var27) {
                        var3 = var27;
                        int var106 = Za;
                        int var107 = var106 ^ 177244622;
                        var274 = var27 instanceof InterruptedException;
                        int var108 = var107 ^ -785344919;
                        int var109 = var108 ^ 1636881808;
                        int var110 = var109 >> 17;
                        int var111 = var110 & 785507269;
                        var4 = var111 ^ -1783658833;
                        int var304 = var4 + 1;
                        int var305 = var4 * var304;
                        int var306 = var305 & 1;
                        if (var306 != 0) {
                            break label223;
                        }
                        break label324;
                    }
                    var4 = switch (var4) {
                        case 270176410 -> {
                            var4 -= -1088950830;
                            var4 *= -1413372089;
                            yield var4 ^ -167017824;
                        }
                        case 1381396616 -> var4 ^ 1203128895;
                        default -> var4 ^ 729686350;
                    };

                    var4 = switch (var4) {
                        case -1105605871 -> var4 ^ -1041826636;
                        default -> var4 ^ -1787781385;
                        case 1991778264 -> {
                            var4 >>>= 3;
                            yield var4 ^ 1459461467;
                        }
                    };
                    long var355 = var4;
                    var11 = var355 + 1L;
                    var11 = var355 * var11;
                    long var356 = var11 & 1L;
                    long var410;
                    var9 = (var410 = var356 - 0L) == 0L ? 0 : (var410 < 0L ? -1 : 1);
                    if (var9 != 0) {
                        break label223;
                    }

                    try {
                        var276.join(500L);
                        var4 -= -1253727081;
                        var4 &= -1573088602;
                        var4 += 71360885;
                        var4 -= -955358694;
                        var4 ^= -383387024;
                    } catch (Throwable var26) {
                        var3 = var26;
                        int var130 = Za;
                        int var131 = var130 ^ 177244622;
                        var274 = var26 instanceof InterruptedException;
                        int var132 = var131 ^ -785344919;
                        int var133 = var132 ^ 1636881808;
                        int var134 = var133 >> 17;
                        int var135 = var134 & 785507269;
                        var4 = var135 ^ -1783658833;
                        int var307 = var4 + 1;
                        int var308 = var4 * var307;
                        int var309 = var308 & 1;
                        if (var309 != 0) {
                            break label223;
                        }
                        break label324;
                    }

                    var9 = var4 + 1;
                    var9 = var4 * var9;
                    var9 &= 1;
                    if (var9 != 0) {
                        break label223;
                    }

                    try {
                        var303.join(500L);
                    } catch (Throwable var25) {
                        var3 = var25;
                        int var141 = Za;
                        int var142 = var141 ^ 177244622;
                        var274 = var25 instanceof InterruptedException;
                        int var143 = var142 ^ -785344919;
                        int var144 = var143 ^ 1636881808;
                        int var145 = var144 >> 17;
                        int var146 = var145 & 785507269;
                        var4 = var146 ^ -1783658833;
                        int var310 = var4 + 1;
                        int var311 = var4 * var310;
                        int var312 = var311 & 1;
                        if (var312 != 0) {
                            break label223;
                        }
                        break label324;
                    }
                    var4 = switch (var4) {
                        case -1993203807 -> var4 ^ 1017279202;
                        case 913500971 -> {
                            var4 |= 1975584707;
                            yield var4 ^ -2063692521;
                        }
                        default -> var4 ^ 1381324695;
                    };
                    Integer var361 = var4;
                    if (var361 == null) {
                        break label223;
                    }

                    try {
                        var362 = null;
                    } catch (Throwable var24) {
                        var3 = var24;
                        int var149 = Za;
                        int var150 = var149 ^ 177244622;
                        var274 = var24 instanceof InterruptedException;
                        int var151 = var150 ^ -785344919;
                        int var152 = var151 ^ 1636881808;
                        int var153 = var152 >> 17;
                        int var154 = var153 & 785507269;
                        var4 = var154 ^ -1783658833;
                        int var313 = var4 + 1;
                        int var314 = var4 * var313;
                        int var315 = var314 & 1;
                        if (var315 != 0) {
                            break label223;
                        }
                        break label324;
                    }
                    var4 = switch (var4) {
                        default -> var4 ^ 1484389998;
                        case -906495332 -> var4 ^ -854659635;
                        case -217226500 -> {
                            var4 ^= -1246619075;
                            var4 += 1342080381;
                            yield var4 ^ -1930723062;
                        }
                    };
                    int var372 = var4 + 1;
                    int var373 = var4 * var372;
                    int var374 = var373 & 1;
                    if (var374 != 0) {
                        break label223;
                    }

                    try {
                        var375 = var269.exitValue();
                    } catch (Throwable var23) {
                        var3 = var23;
                        int var158 = Za;
                        int var159 = var158 ^ 177244622;
                        var274 = var23 instanceof InterruptedException;
                        int var160 = var159 ^ -785344919;
                        int var161 = var160 ^ 1636881808;
                        int var162 = var161 >> 17;
                        int var163 = var162 & 785507269;
                        var4 = var163 ^ -1783658833;
                        int var316 = var4 + 1;
                        int var317 = var4 * var316;
                        int var318 = var317 & 1;
                        if (var318 != 0) {
                            break label223;
                        }
                        break label324;
                    }
                    var4 = switch (var4) {
                        case -1057563690 -> var4 ^ 94248280;
                        default -> var4 ^ -1103808546;
                        case 441876276 -> {
                            var4 *= 481269967;
                            var4 -= -358516276;
                            var4 |= -1979228786;
                            var4 &= 149816301;
                            yield var4 ^ -168682441;
                        }
                    };
                    var11 = var4;
                    long var13 = var11 + 1L;
                    var13 = var11 * var13;
                    var11 = var13 & 1L;
                    long var411;
                    int var391 = (var411 = var11 - 0L) == 0L ? 0 : (var411 < 0L ? -1 : 1);
                    if (var391 != 0) {
                        break label223;
                    }

                    try {
                        var277 = var276.text();
                        var4 ^= 208566000;
                        var4 -= -214234575;
                        var4 ^= -1724744370;
                    } catch (Throwable var22) {
                        var3 = var22;
                        int var169 = Za;
                        int var170 = var169 ^ 177244622;
                        var274 = var22 instanceof InterruptedException;
                        int var171 = var170 ^ -785344919;
                        int var172 = var171 ^ 1636881808;
                        int var173 = var172 >> 17;
                        int var174 = var173 & 785507269;
                        var4 = var174 ^ -1783658833;
                        int var319 = var4 + 1;
                        int var320 = var4 * var319;
                        int var321 = var320 & 1;
                        if (var321 != 0) {
                            break label223;
                        }
                        break label324;
                    }

                    Integer var392 = var4;
                    if (var392 == null) {
                        break label223;
                    }

                    try {
                        var325 = var303.text();
                    } catch (Throwable var21) {
                        var3 = var21;
                        int var178 = Za;
                        int var179 = var178 ^ 177244622;
                        var274 = var21 instanceof InterruptedException;
                        int var180 = var179 ^ -785344919;
                        int var181 = var180 ^ 1636881808;
                        int var182 = var181 >> 17;
                        int var183 = var182 & 785507269;
                        var4 = var183 ^ -1783658833;
                        int var322 = var4 + 1;
                        int var323 = var4 * var322;
                        int var324 = var323 & 1;
                        if (var324 != 0) {
                            break label223;
                        }
                        break label324;
                    }
                    var4 = switch (var4) {
                        default -> var4 ^ 430250092;
                        case 1737301396 -> {
                            var4 >>= 14;
                            var4 += -1906444861;
                            var4 ^= 803392290;
                            yield var4 ^ 1610723363;
                        }
                        case 1744103715 -> var4 ^ 1394974088;
                    };
                    var11 = var4;
                    var13 = var11 + 1L;
                    var13 = var11 * var13;
                    var11 = var13 & 1L;
                    long var412;
                    int var395 = (var412 = var11 - 0L) == 0L ? 0 : (var412 < 0L ? -1 : 1);
                    if (var395 != 0) {
                        break label223;
                    }

                    try {
                        var362 = new FN(var375, var277, var325);
                    } catch (Throwable var20) {
                        var3 = var20;
                        int var188 = Za;
                        int var189 = var188 ^ 177244622;
                        var274 = var20 instanceof InterruptedException;
                        int var190 = var189 ^ -785344919;
                        int var191 = var190 ^ 1636881808;
                        int var192 = var191 >> 17;
                        int var193 = var192 & 785507269;
                        var4 = var193 ^ -1783658833;
                        int var326 = var4 + 1;
                        int var327 = var4 * var326;
                        int var328 = var327 & 1;
                        if (var328 != 0) {
                            break label223;
                        }
                        break label324;
                    }
                    Integer var33 = switch (var4) {
                        default -> var4 ^ 267799406;
                        case -1044584202 -> {
                            var4 >>= 28;
                            var4 += 180752043;
                            var4 |= -395486423;
                            var4 |= -225687251;
                            yield var4 ^ 1479046527;
                        }
                        case 128583906 -> var4 ^ -2038053076;
                    };
                    if (var33 != null) {
                        return var362;
                    }
                    break label223;
                }

                var4 &= 511897526;
                var4 *= 183867109;
                var4 ^= 1062108819;
                Integer var363 = var4;
                if (var363 == null) {
                    break label223;
                }

                try {
                    var4 *= 423697937;
                    var4 ^= 1653815193;
                    Process var364 = var269.destroyForcibly();
                    var4 ^= 1181348989;
                    var4 ^= -648601982;
                    var4 &= 802992671;
                    var4 *= -1535258365;
                    var4 ^= -838989175;
                    var365 = null;
                    var4 ^= -1162724867;
                    var4 += -1655702608;
                    var4 ^= 1616847746;
                    var376 = var2.get(0);
                    var4 *= 279697509;
                    var4 ^= -1291944136;
                } catch (Throwable var19) {
                    var3 = var19;
                    int var202 = Za;
                    int var203 = var202 ^ 177244622;
                    var274 = var19 instanceof InterruptedException;
                    int var204 = var203 ^ -785344919;
                    int var205 = var204 ^ 1636881808;
                    int var206 = var205 >> 17;
                    int var207 = var206 & 785507269;
                    var4 = var207 ^ -1783658833;
                    int var329 = var4 + 1;
                    int var330 = var4 * var329;
                    int var331 = var330 & 1;
                    if (var331 != 0) {
                        break label223;
                    }
                    break label324;
                }

                Integer var396 = var4;
                if (var396 == null) {
                    break label223;
                }

                try {
                    var377 = (String)var376;
                    var4 -= -1299377976;
                    var4 ^= -1203169258;
                } catch (Throwable var18) {
                    var3 = var18;
                    int var220 = Za;
                    int var221 = var220 ^ 177244622;
                    var274 = var18 instanceof InterruptedException;
                    int var222 = var221 ^ -785344919;
                    int var223 = var222 ^ 1636881808;
                    int var224 = var223 >> 17;
                    int var225 = var224 & 785507269;
                    var4 = var225 ^ -1783658833;
                    int var332 = var4 + 1;
                    int var333 = var4 * var332;
                    int var334 = var333 & 1;
                    if (var334 != 0) {
                        break label223;
                    }
                    break label324;
                }

                int var397 = var4 + 1;
                int var398 = var4 * var397;
                int var399 = var398 & 1;
                if (var399 != 0) {
                    break label223;
                }

                try {
                    var378 = var377 + " timed out";
                } catch (Throwable var17) {
                    var3 = var17;
                    int var228 = Za;
                    int var229 = var228 ^ 177244622;
                    var274 = var17 instanceof InterruptedException;
                    int var230 = var229 ^ -785344919;
                    int var231 = var230 ^ 1636881808;
                    int var232 = var231 >> 17;
                    int var233 = var232 & 785507269;
                    var4 = var233 ^ -1783658833;
                    int var335 = var4 + 1;
                    int var336 = var4 * var335;
                    int var337 = var336 & 1;
                    if (var337 != 0) {
                        break label223;
                    }
                    break label324;
                }
                var4 = switch (var4) {
                    default -> var4 ^ -173785489;
                    case 692322366 -> var4 ^ 986439003;
                    case 1262912001 -> {
                        var4 |= 1913722754;
                        var4 ^= 1983340165;
                        yield var4 ^ 982913121;
                    }
                };
                Integer var400 = var4;
                if (var400 == null) {
                    break label223;
                }

                try {
                    var365 = new IOException(var378);
                    var4 *= -578781649;
                    var4 >>>= 29;
                    var4 ^= -1547848710;
                } catch (Throwable var16) {
                    var3 = var16;
                    int var237 = Za;
                    int var238 = var237 ^ 177244622;
                    var274 = var16 instanceof InterruptedException;
                    int var239 = var238 ^ -785344919;
                    int var240 = var239 ^ 1636881808;
                    int var241 = var240 >> 17;
                    int var242 = var241 & 785507269;
                    var4 = var242 ^ -1783658833;
                    int var338 = var4 + 1;
                    int var339 = var4 * var338;
                    int var340 = var339 & 1;
                    if (var340 != 0) {
                        break label223;
                    }
                    break label324;
                }

                Integer var379 = var4;
                if (var379 == null) {
                    break label223;
                }

                try {
                    throw var365;
                } catch (Throwable var15) {
                    var3 = var15;
                    int var246 = Za;
                    int var247 = var246 ^ 177244622;
                    var274 = var15 instanceof InterruptedException;
                    int var248 = var247 ^ -785344919;
                    int var249 = var248 ^ 1636881808;
                    int var250 = var249 >> 17;
                    int var251 = var250 & 785507269;
                    var4 = var251 ^ -1783658833;
                    int var341 = var4 + 1;
                    int var342 = var4 * var341;
                    int var343 = var342 & 1;
                    if (var343 != 0) {
                        break label223;
                    }
                }
            }

            if (!var274) {
                var4 &= 2036862344;
                var4 += -1762992779;
                var4 ^= -1499280518;
                throw UncheckedExceptions.rethrow(var3);
            }

            var4 |= 1048531450;
            var4 ^= -923350026;
            long var278 = var4;
            long var380 = var278 + 1L;
            var380 = var278 * var380;
            long var279 = var380 & 1L;
            long var413;
            int var280 = (var413 = var279 - 0L) == 0L ? 0 : (var413 < 0L ? -1 : 1);
            if (var280 == 0) {
                var5 = (InterruptedException)var3;
                var4 ^= 803762958;
                var4 ^= 1219918710;
                long var281 = var4;
                var380 = var281 + 1L;
                var380 = var281 * var380;
                long var282 = var380 & 1L;
                long var414;
                int var34 = (var414 = var282 - 0L) == 0L ? 0 : (var414 < 0L ? -1 : 1);
                if (var34 == 0) {
                    Process var264 = var268.destroyForcibly();
                    var4 += -102121108;
                    var4 ^= 296687255;
                    var4 |= 967950908;
                    var4 ^= 1569241030;
                    Thread var265 = Thread.currentThread();
                    var265.interrupt();
                    var5 = new IOException("interrupted", (Throwable)var5);
                    throw UncheckedExceptions.rethrow(var5);
                }
            }
        }

        IllegalStateException var36 = new IllegalStateException();
        throw var36;
    }

    public static boolean VM(String var0) {
        ProcessBuilder var183 = null;
        ProcessBuilder var184 = null;
        Process var185 = null;
        Process var186 = null;
        Integer var187 = null;
        String[] var192 = null;
        OutputStream var208 = null;
        InputStream var212 = null;
        TimeUnit var214 = null;
        boolean var215 = false;
        label382: {
            int var126;
            label355: {
                label354: {
                    Throwable var1;
                    int var6;
                    label353: {
                        label352: {
                            label351: {
                                label374: {
                                    try {
                                        var126 = Za;
                                        var126 ^= 980330700;
                                        Object var3 = null;
                                        Object var4 = null;
                                        var126 += -1670209385;
                                        var126 -= -306193910;
                                        var126 -= -2101867042;
                                        var126 ^= 423126192;
                                    } catch (Throwable var29) {
                                        var1 = var29;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var29 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }

                                    Integer var5 = var126;
                                    if (var5 == null) {
                                        break label382;
                                    }

                                    try {
                                        var183 = null;
                                        var126 += -1763439877;
                                        var126 ^= -587644316;
                                        var126 ^= 1798062686;
                                        var126 ^= -1162665320;
                                    } catch (Throwable var28) {
                                        var1 = var28;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var28 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }

                                    long var189 = var126;
                                    long var8 = var189 + 1L;
                                    var8 = var189 * var8;
                                    long var190 = var8 & 1L;
                                    long var299;
                                    var6 = (var299 = var190 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                    if (var6 != 0) {
                                        break label382;
                                    }

                                    try {
                                        var192 = new String[2];
                                        var126 &= 136258553;
                                        var126 >>>= 10;
                                        var126 &= -1972941838;
                                        var126 ^= 1338741148;
                                        var126 ^= -1375106012;
                                    } catch (Throwable var27) {
                                        var1 = var27;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var27 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }

                                    long var7 = var126;
                                    long var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    long var11 = var7 + 2L;
                                    var9 *= var11;
                                    var7 += 3L;
                                    var9 *= var7;
                                    var7 = var9 & 7L;
                                    long var300;
                                    int var248 = (var300 = var7 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                                    if (var248 != 0) {
                                        break label382;
                                    }

                                    try {
                                        var192[0] = var0;
                                    } catch (Throwable var26) {
                                        var1 = var26;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var26 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }
                                    var126 = switch (var126) {
                                        case -507503112 -> {
                                            var126 >>>= 11;
                                            var126 |= 1869484344;
                                            var126 &= 1081363199;
                                            var126 ^= -1641034086;
                                            yield var126 ^ -1937383598;
                                        }
                                        default -> var126 ^ -998243544;
                                        case 1145681522 -> var126 ^ -989261020;
                                    };

                                    try {
                                        var192[1] = "--version";
                                        var126 |= -332791815;
                                        var126 ^= -1024039458;
                                        var183 = new ProcessBuilder(var192);
                                        var126 -= 961866139;
                                        var126 >>= 14;
                                        var126 *= 1024617283;
                                        var126 ^= -1560221464;
                                        var184 = var183.redirectErrorStream(true);
                                    } catch (Throwable var25) {
                                        var1 = var25;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var25 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }
                                    var126 = switch (var126) {
                                        default -> var126 ^ -84169165;
                                        case 1313847957 -> var126 ^ 261256888;
                                        case 1917612574 -> {
                                            var126 &= -1023609717;
                                            var126 -= 1906809198;
                                            yield var126 ^ 1016671515;
                                        }
                                    };
                                    var6 = var126 + 1;
                                    var6 = var126 * var6;
                                    int var249 = var126 + 2;
                                    var6 *= var249;
                                    int var250 = var126 + 3;
                                    var6 *= var250;
                                    var6 &= 7;
                                    if (var6 != 0) {
                                        break label382;
                                    }

                                    try {
                                        var185 = var184.start();
                                        var126 -= 27262727;
                                        var126 &= -1177366671;
                                        var126 &= 68353015;
                                        var126 ^= -731863942;
                                    } catch (Throwable var24) {
                                        var1 = var24;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var24 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }

                                    var6 = var126 + 1;
                                    var6 = var126 * var6;
                                    int var251 = var126 + 2;
                                    var6 *= var251;
                                    int var252 = var126 + 3;
                                    var6 *= var252;
                                    var6 &= 7;
                                    if (var6 != 0) {
                                        break label382;
                                    }

                                    try {
                                        var186 = var185;
                                    } catch (Throwable var23) {
                                        var1 = var23;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var23 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }
                                    var126 = switch (var126) {
                                        default -> var126 ^ -1668034220;
                                        case -882480334 -> var126 ^ 1722500206;
                                        case -730829702 -> {
                                            var126 <<= 3;
                                            yield var126 ^ -1572867922;
                                        }
                                    };
                                    var6 = var126 + 1;
                                    var6 = var126 * var6;
                                    int var253 = var126 + 2;
                                    var6 *= var253;
                                    int var254 = var126 + 3;
                                    var6 *= var254;
                                    var6 &= 7;
                                    if (var6 != 0) {
                                        break label382;
                                    }

                                    try {
                                        var208 = var186.getOutputStream();
                                        var126 *= -1003454709;
                                        var126 ^= 1309309904;
                                    } catch (Throwable var22) {
                                        var1 = var22;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var22 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }

                                    Integer var255 = var126;
                                    if (var255 == null) {
                                        break label382;
                                    }

                                    try {
                                        var208.close();
                                    } catch (Throwable var21) {
                                        var1 = var21;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var21 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }
                                    var126 = switch (var126) {
                                        default -> var126 ^ 838510057;
                                        case -235953222 -> {
                                            var126 |= 21710872;
                                            var126 >>= 14;
                                            var126 >>= 29;
                                            var126 >>= 23;
                                            yield var126 ^ 1388228822;
                                        }
                                        case 984203336 -> var126 ^ 352113403;
                                    };
                                    long var209 = var126;
                                    var8 = var209 + 1L;
                                    var8 = var209 * var8;
                                    long var210 = var8 & 1L;
                                    long var301;
                                    var6 = (var301 = var210 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                                    if (var6 != 0) {
                                        break label382;
                                    }

                                    try {
                                        var212 = var186.getInputStream();
                                    } catch (Throwable var20) {
                                        var1 = var20;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var20 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }
                                    var126 = switch (var126) {
                                        case -1388228823 -> {
                                            var126 &= 350667310;
                                            var126 -= 1477634698;
                                            yield var126 ^ 16363571;
                                        }
                                        case -1169328184 -> var126 ^ 1236359099;
                                        default -> var126 ^ -1793304867;
                                    };

                                    try {
                                        OutputStream var256 = OutputStream.nullOutputStream();
                                        var126 >>= 29;
                                        var126 ^= -1969150005;
                                        var126 *= -1460773491;
                                        var126 ^= -513803023;
                                        long var213 = var212.transferTo(var256);
                                        var126 += -915283751;
                                        var126 >>>= 11;
                                        var126 += -1479510840;
                                        var126 ^= 367710687;
                                        var214 = TimeUnit.SECONDS;
                                        var126 ^= -1632748040;
                                        var126 ^= 976986988;
                                    } catch (Throwable var19) {
                                        var1 = var19;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var19 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }

                                    Integer var257 = var126;
                                    if (var257 == null) {
                                        break label382;
                                    }

                                    try {
                                        var215 = var186.waitFor(3L, var214);
                                        var126 += -689476714;
                                        var126 |= -1584706298;
                                        var126 ^= 820386187;
                                    } catch (Throwable var18) {
                                        var1 = var18;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var18 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break label374;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }

                                    int var258 = var126 + 1;
                                    int var259 = var126 * var258;
                                    int var260 = var259 & 1;
                                    if (var260 != 0) {
                                        break label382;
                                    }

                                    label360: {
                                        label300: {
                                            label361: {
                                                try {
                                                    if (!var215) {
                                                        break label361;
                                                    }
                                                } catch (Throwable var17) {
                                                    var1 = var17;
                                                    var126 = Za;
                                                    var126 ^= 587551172;
                                                    var6 = (var17 instanceof IOException) ? 1 : 0;
                                                    switch (var126) {
                                                        case -618438350:
                                                            break label374;
                                                        case -192232939:
                                                            break label351;
                                                        case 2020636066:
                                                        default:
                                                            break label352;
                                                    }
                                                }

                                                var126 += -1711585946;
                                                var126 *= -370740061;
                                                var126 -= 710493510;
                                                var126 ^= 315871237;
                                                var6 = var126 + 1;
                                                var6 = var126 * var6;
                                                var6 &= 1;
                                                if (var6 != 0) {
                                                    break label382;
                                                }

                                                try {
                                                    var126 >>>= 26;
                                                    var126 *= 379194635;
                                                    var126 += -1617858294;
                                                    var126 ^= -1213553463;
                                                    var126 ^= 331889298;
                                                    var187 = var186.exitValue();
                                                    var126 |= -1952234477;
                                                    var126 ^= 1406351314;
                                                } catch (Throwable var15) {
                                                    var1 = var15;
                                                    var126 = Za;
                                                    var126 ^= 587551172;
                                                    var6 = (var15 instanceof IOException) ? 1 : 0;
                                                    switch (var126) {
                                                        case -618438350:
                                                            break label374;
                                                        case -192232939:
                                                            break label351;
                                                        case 2020636066:
                                                        default:
                                                            break label352;
                                                    }
                                                }

                                                var6 = var126 + 1;
                                                var6 = var126 * var6;
                                                var6 &= 1;
                                                if (var6 != 0) {
                                                    break label382;
                                                }

                                                try {
                                                    if (var187 == 0) {
                                                        break label360;
                                                    }
                                                } catch (Throwable var16) {
                                                    var1 = var16;
                                                    var126 = Za;
                                                    var126 ^= 587551172;
                                                    var6 = (var16 instanceof IOException) ? 1 : 0;
                                                    switch (var126) {
                                                        case -618438350:
                                                            break label374;
                                                        case -192232939:
                                                            break label351;
                                                        case 2020636066:
                                                        default:
                                                            break label352;
                                                    }
                                                }

                                                var126 |= 187874600;
                                                var126 *= -1374704009;
                                                var126 ^= 86682780;
                                                break label300;
                                            }

                                            switch (var126) {
                                                case -578980300:
                                                    var126 ^= 398090788;
                                                    var126 &= 353436959;
                                                    var126 |= -600762119;
                                                    var126 &= 659352257;
                                                    var126 ^= -497044590;
                                                    break;
                                                case 329097566:
                                                    var126 ^= -1167569212;
                                                    break;
                                                case 507079843:
                                                default:
                                                    var126 ^= -1810586920;
                                            }
                                        }

                                        Integer var222 = var126;
                                        if (var222 == null) {
                                            break label382;
                                        }

                                        try {
                                            var126 >>>= 29;
                                            var126 += 1820082351;
                                            var126 += 480320489;
                                            var126 *= -1007723455;
                                            var126 ^= 481930149;
                                            break label354;
                                        } catch (Throwable var14) {
                                            var1 = var14;
                                            var126 = Za;
                                            var126 ^= 587551172;
                                            var6 = (var14 instanceof IOException) ? 1 : 0;
                                            switch (var126) {
                                                case -618438350:
                                                    break label374;
                                                case -192232939:
                                                    break label351;
                                                case 2020636066:
                                                default:
                                                    break label352;
                                            }
                                        }
                                    }

                                    var126 >>>= 25;
                                    var126 >>>= 29;
                                    var126 ^= -75493875;
                                    var126 ^= 499971936;

                                    try {
                                        var126 &= 1983050900;
                                        var126 -= -662057555;
                                        var126 ^= -2118920827;
                                        break label355;
                                    } catch (Throwable var13) {
                                        var1 = var13;
                                        var126 = Za;
                                        var126 ^= 587551172;
                                        var6 = (var13 instanceof IOException) ? 1 : 0;
                                        switch (var126) {
                                            case -618438350:
                                                break;
                                            case -192232939:
                                                break label351;
                                            case 2020636066:
                                            default:
                                                break label352;
                                        }
                                    }
                                }

                                var126 ^= 1467027068;
                                break label353;
                            }

                            var126 &= 873914444;
                            var126 |= 598563465;
                            var126 ^= 1720923468;
                            var126 >>= 26;
                            var126 ^= -788043614;
                            break label353;
                        }

                        var126 ^= 114403061;
                    }

                    long var261 = var126;
                    long var290 = var261 + 1L;
                    var290 = var261 * var290;
                    var261 = var290 & 1L;
                    long var302;
                    int var263 = (var302 = var261 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                    if (var263 == 0) {
                        if (var6 == 0) {
                            var126 ^= -1742269866;
                            var126 ^= -1183506159;
                            long var223 = var126;
                            long var273 = var223 + 1L;
                            var273 = var223 * var273;
                            long var10 = var223 + 2L;
                            var273 *= var10;
                            long var224 = var223 + 3L;
                            var273 *= var224;
                            long var225 = var273 & 7L;
                            long var303;
                            var6 = (var303 = var225 - 0L) == 0L ? 0 : (var303 < 0L ? -1 : 1);
                            if (var6 == 0) {
                                int var227 = (var1 instanceof InterruptedException) ? 1 : 0;
                                var126 <<= 1;
                                var126 += -283156444;
                                var126 *= 647583765;
                                var126 += -596672793;
                                var126 ^= -2030081223;
                                var261 = var126;
                                var290 = var261 + 1L;
                                var290 = var261 * var290;
                                long var298 = var261 + 2L;
                                var290 *= var298;
                                var261 += 3L;
                                var290 *= var261;
                                var261 = var290 & 7L;
                                long var304;
                                int var267 = (var304 = var261 - 0L) == 0L ? 0 : (var304 < 0L ? -1 : 1);
                                if (var267 == 0) {
                                    if (var227 == 0) {
                                        var126 >>>= 13;
                                        var126 &= 415587269;
                                        var126 ^= -1656539521;
                                        long var228 = var126;
                                        var273 = var228 + 1L;
                                        var273 = var228 * var273;
                                        var10 = var228 + 2L;
                                        var273 *= var10;
                                        long var229 = var228 + 3L;
                                        var273 *= var229;
                                        long var230 = var273 & 7L;
                                        long var305;
                                        var227 = (var305 = var230 - 0L) == 0L ? 0 : (var305 < 0L ? -1 : 1);
                                        if (var227 == 0) {
                                            throw UncheckedExceptions.rethrow(var1);
                                        }
                                    } else {
                                        var126 = switch (var126) {
                                            case 201216493 -> var126 ^ 40324228;
                                            case 421850204 -> {
                                                var126 >>>= 6;
                                                yield var126 ^ 1449800149;
                                            }
                                            default -> var126 ^ -884660077;
                                        };
                                        long var232 = var126;
                                        var273 = var232 + 1L;
                                        var273 = var232 * var273;
                                        long var233 = var273 & 1L;
                                        long var306;
                                        var227 = (var306 = var233 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
                                        if (var227 == 0) {
                                            InterruptedException var180 = (InterruptedException)var1;
                                            var126 |= -1009208091;
                                            var126 -= -1370822993;
                                            var126 ^= -972902783;
                                            var126 ^= -909510114;
                                            var227 = var126 + 1;
                                            var227 = var126 * var227;
                                            int var268 = var126 + 2;
                                            var227 *= var268;
                                            int var269 = var126 + 3;
                                            var227 *= var269;
                                            var227 &= 7;
                                            if (var227 == 0) {
                                                Thread var181 = Thread.currentThread();
                                                var126 -= 731076107;
                                                var126 -= -722991349;
                                                var126 ^= -1983973333;
                                                var227 = var126 + 1;
                                                var227 = var126 * var227;
                                                var227 &= 1;
                                                if (var227 == 0) {
                                                    var181.interrupt();
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            var126 &= 95049205;
                            var126 *= 285865811;
                            var126 -= -673249946;
                            var126 ^= -823183184;
                            var126 ^= -1196744823;
                            Integer var182 = var126;
                            if (var182 != null) {
                                IOException var179 = (IOException)var1;
                                var126 -= -2048758932;
                                var126 -= -2036014531;
                                var126 ^= 695185427;
                                long var243 = var126;
                                long var283 = var243 + 1L;
                                var283 = var243 * var283;
                                long var297 = var243 + 2L;
                                var283 *= var297;
                                long var244 = var243 + 3L;
                                var283 *= var244;
                                long var245 = var283 & 7L;
                                long var307;
                                int var30 = (var307 = var245 - 0L) == 0L ? 0 : (var307 < 0L ? -1 : 1);
                                if (var30 == 0) {
                                    return false;
                                }
                            }
                        }
                    }
                    break label382;
                }

                boolean var308 = false;
                switch (var126) {
                    case -275315718:
                        var126 &= 1903722398;
                        var126 ^= -1770158321;
                        return var308;
                    case 559466692:
                        var126 ^= 1176467485;
                        return var308;
                    case 848352370:
                    default:
                        var126 ^= -1183267255;
                        return var308;
                }
            }

            boolean var188 = true;
            switch (var126) {
                case -1575019098:
                    var126 ^= -2029393716;
                    break;
                case 214235090:
                    var126 -= -1048139074;
                    var126 += 708965641;
                    var126 ^= -1443030754;
                    var126 ^= 722526102;
                    break;
                case 216085078:
                default:
                    var126 ^= -455062347;
            }

            return var188;
        }

        IllegalArgumentException var31 = new IllegalArgumentException();
        throw var31;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -645717964;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Za = var4;
    }
}
