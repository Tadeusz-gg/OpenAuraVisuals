package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Locale;
import java.util.Map;
import java.util.function.LongSupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Zq {
    private static final Logger gf;
    public static final long Nk = 259200000L;
    public static final long Al = 30000L;
    private static final int i = 48;
    private static final String u = "aura-lyrics 1";
    private final UI R;
    private final Path U;
    private final LongSupplier ga;
    private final Map DI;
    private final Object f;
    private volatile be_2 sK;
    private FX v;
    private Thread mn;
    private long H;
    public static final int LH;

    public Zq(UI var1, Path var2, LongSupplier var3) {
        Bo var4 = new Bo(this, 16, 0.75F, true);
        this.DI = var4;
        this.f = new Object();
        be_2 var6 = be_2.IDLE;
        this.sK = var6;
        this.R = var1;
        this.U = var2;
        this.ga = var3;
    }

    public be_2 nB() {
        int var1 = LH;
        var1 ^= 967045653;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            var1 += -922193617;
            var1 ^= -131053374;
            var1 *= -1836321417;
            var1 *= 1303827915;
            var1 ^= 938475781;
            var14 = var1;
            if (var14 == null) {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            } else {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        } else {
            var1 |= -847100650;
            var1 *= -2103964701;
            var1 >>= 9;
            var1 *= 1432220453;
            var1 ^= 1882507883;
            return this.sK;
        }
    }

    public void f(FX var1) {
        Za var405 = null;
        Throwable var418 = null;
        Thread var420 = null;
        Thread var429 = null;
        Thread var430 = null;
        Thread var431 = null;
        LongSupplier var513 = null;
        int var514 = 0;
        FX var516 = null;
        Throwable var523 = null;
        Object var536 = null;
        Throwable var541 = null;
        Object var542 = null;
        long var585 = 0L;
        int var2 = LH;
        var2 ^= -1901281074;
        Object var3 = null;
        Object var4 = null;

        var2 = switch (var2) {
            case 243876560 -> {
                var2 ^= 737266209;
                yield var2 ^ -1204288955;
            }
            case 373958359 -> var2 ^ -1102175128;
            default -> var2 ^ -1257603705;
        };
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var634;
        int var491 = (var634 = var5 - 0L) == 0L ? 0 : (var634 < 0L ? -1 : 1);
        label543:
        if (var491 == 0) {
            Object var492 = null;
            if (var1 != null) {
                var2 *= -139001839;
                var2 -= 2065537064;
                var2 &= 963287545;
                var2 |= -1535590903;
                var2 ^= -171070564;
                Integer var6 = var2;
                if (var6 == null) {
                    break label543;
                }

                boolean var497 = var1.isSong();
                var2 >>>= 19;
                var2 *= 1583582417;
                var2 ^= 74630848;
                var2 <<= 25;
                var2 ^= -564128237;
                if (var497) {
                    var2 = switch (var2) {
                        case -390458403 -> var2 ^ 165352478;
                        case 1918899731 -> {
                            var2 <<= 31;
                            var2 ^= 34095270;
                            var2 ^= 188113585;
                            var2 += -77655970;
                            yield var2 ^ 1676187419;
                        }
                        default -> var2 ^ -43198688;
                    };
                    int var498 = var2 + 1;
                    var498 = var2 * var498;
                    var498 &= 1;
                    if (var498 == 0) {
                        be_2 var501 = this.sK;
                        var2 += 1319694008;
                        var2 += 2066564920;
                        var2 ^= 134372967;
                        Integer var532 = var2;
                        if (var532 != null) {
                            Throwable var10000;
                            label522: {
                                String var533 = var501.trackId();
                                String var8 = var1.trackId();
                                boolean var534 = var533.equals(var8);
                                label521:
                                if (var534) {
                                    var2 |= -1546696535;
                                    var2 += 1393544485;
                                    var2 ^= -233643280;
                                    BA var502 = var501.state();
                                    BA var535 = BA.ERROR;
                                    var2 <<= 22;
                                    var2 -= 2067837922;
                                    var2 &= -217447332;
                                    var2 >>= 31;
                                    var2 ^= 1716280250;
                                    if (var502 != var535) {
                                        var2 >>= 26;
                                        var2 >>>= 5;
                                        var2 <<= 29;
                                        var2 >>>= 12;
                                        var2 ^= -682317485;
                                        Integer var526 = var2;
                                        if (var526 != null) {
                                            return;
                                        }
                                        break label543;
                                    }

                                    var2 -= -826032028;
                                    var2 |= -1436799720;
                                    var2 ^= 763498778;
                                    var498 = var2 + 1;
                                    var498 = var2 * var498;
                                    var498 &= 1;
                                    if (var498 != 0) {
                                        break label543;
                                    }

                                    Object var506 = this.f;
                                    var536 = var506;
                                    var2 &= -1528974661;
                                    var2 ^= 199209350;
                                    var2 &= -877207284;
                                    var2 ^= 2010059992;
                                    synchronized (var506){}
                                    var2 += -322507279;
                                    var2 += -1249281831;
                                    var2 *= -58565907;
                                    var2 ^= 1837494140;
                                    var2 ^= -1282195797;
                                    var498 = var2 + 1;
                                    var498 = var2 * var498;
                                    int var580 = var2 + 2;
                                    var498 *= var580;
                                    int var581 = var2 + 3;
                                    var498 *= var581;
                                    var498 &= 7;
                                    if (var498 != 0) {
                                        break label543;
                                    }
                                    var2 = switch (var2) {
                                        case 939266169 -> {
                                            var2 -= -2029797752;
                                            var2 *= -2147019737;
                                            var2 -= 994862389;
                                            var2 ^= 572293848;
                                            yield var2 ^ 1315764407;
                                        }
                                        default -> var2 ^ 94932848;
                                        case 1864354723 -> var2 ^ -121706160;
                                    };
                                    Integer var512 = var2;
                                    if (var512 == null) {
                                        break label543;
                                    }

                                    try {
                                        var513 = this.ga;
                                    } catch (Throwable var43) {
                                        var10000 = var43;
                                        break label522;
                                    }
                                    var2 = switch (var2) {
                                        case -1292529427 -> {
                                            var2 -= 1820253689;
                                            var2 ^= -2081369017;
                                            var2 ^= 871920018;
                                            yield var2 ^ -709861034;
                                        }
                                        case -519397952 -> var2 ^ 1213800909;
                                        default -> var2 ^ 1646831844;
                                    };
                                    long var582 = var2;
                                    long var10 = var582 + 1L;
                                    var10 = var582 * var10;
                                    long var583 = var10 & 1L;
                                    long var635;
                                    int var584 = (var635 = var583 - 0L) == 0L ? 0 : (var635 < 0L ? -1 : 1);
                                    if (var584 != 0) {
                                        break label543;
                                    }

                                    try {
                                        var585 = var513.getAsLong();
                                    } catch (Throwable var42) {
                                        var10000 = var42;
                                        break label522;
                                    }
                                    var2 = switch (var2) {
                                        case -204690687 -> var2 ^ -1461590219;
                                        case 600733303 -> {
                                            var2 ^= -1763788381;
                                            var2 >>= 1;
                                            var2 &= -485123274;
                                            var2 ^= -1159228233;
                                            yield var2 ^ -758552958;
                                        }
                                        default -> var2 ^ -1674740647;
                                    };

                                    try {
                                        var10 = this.H;
                                        long var586 = var585 - var10;
                                        long var636;
                                        var514 = (var636 = var586 - 30000L) == 0L ? 0 : (var636 < 0L ? -1 : 1);
                                        var2 ^= 2137771195;
                                        var2 -= 1317948552;
                                        var2 += -86320235;
                                        var2 ^= 70056988;
                                    } catch (Throwable var41) {
                                        var10000 = var41;
                                        break label522;
                                    }

                                    Integer var587 = var2;
                                    if (var587 == null) {
                                        break label543;
                                    }

                                    label518: {
                                        label589: {
                                            try {
                                                if (var514 < 0) {
                                                    break label589;
                                                }
                                            } catch (Throwable var45) {
                                                var10000 = var45;
                                                break label522;
                                            }

                                            var2 += 643518589;
                                            var2 &= 400886795;
                                            var2 |= 430950346;
                                            var2 += 1133875082;
                                            var2 ^= -582450605;

                                            var2 = switch (var2) {
                                                case -1139944185 -> {
                                                    var2 &= 849788403;
                                                    yield var2 ^ 143962538;
                                                }
                                                default -> var2 ^ 1203907481;
                                                case 1647295548 -> var2 ^ -426885292;
                                            };
                                            long var588 = var2;
                                            var10 = var588 + 1L;
                                            var10 = var588 * var10;
                                            long var12 = var588 + 2L;
                                            var10 *= var12;
                                            long var589 = var588 + 3L;
                                            var10 *= var589;
                                            long var590 = var10 & 7L;
                                            long var637;
                                            int var515 = (var637 = var590 - 0L) == 0L ? 0 : (var637 < 0L ? -1 : 1);
                                            if (var515 != 0) {
                                                break label543;
                                            }

                                            try {
                                                var516 = this.v;
                                            } catch (Throwable var40) {
                                                var10000 = var40;
                                                break label522;
                                            }
                                            var2 = switch (var2) {
                                                default -> var2 ^ -876034909;
                                                case -949174151 -> var2 ^ -758388418;
                                                case 948970665 -> {
                                                    var2 -= 2015058450;
                                                    yield var2 ^ 579553770;
                                                }
                                            };
                                            long var591 = var2;
                                            var10 = var591 + 1L;
                                            var10 = var591 * var10;
                                            long var592 = var10 & 1L;
                                            long var638;
                                            int var593 = (var638 = var592 - 0L) == 0L ? 0 : (var638 < 0L ? -1 : 1);
                                            if (var593 != 0) {
                                                break label543;
                                            }

                                            label552: {
                                                try {
                                                    if (var516 != null) {
                                                        break label552;
                                                    }
                                                } catch (Throwable var44) {
                                                    var10000 = var44;
                                                    break label522;
                                                }

                                                var2 *= -1383734885;
                                                var2 *= -3455367;
                                                var2 >>= 22;
                                                var2 ^= -354782510;
                                                var515 = var2 + 1;
                                                var515 = var2 * var515;
                                                int var594 = var2 + 2;
                                                var515 *= var594;
                                                int var595 = var2 + 3;
                                                var515 *= var595;
                                                var515 &= 7;
                                                if (var515 != 0) {
                                                    break label543;
                                                }

                                                try {
                                                    var2 <<= 29;
                                                    var2 &= -2057243704;
                                                    var2 ^= -1941873557;
                                                    var2 -= 607717268;
                                                    var2 <<= 9;
                                                    var2 *= 706749657;
                                                    var2 ^= 1822515458;
                                                } catch (Throwable var39) {
                                                    var10000 = var39;
                                                    break label522;
                                                }

                                                var2 -= 1121293890;
                                                var2 <<= 4;
                                                var2 |= -39924911;
                                                var2 ^= 943773346;
                                                break label521;
                                            }

                                            switch (var2) {
                                                case -1607879730:
                                                default:
                                                    var2 ^= -893412301;
                                                    break label518;
                                                case -486571139:
                                                    var2 |= 2007968665;
                                                    var2 *= -1361788605;
                                                    var2 &= -1139822638;
                                                    var2 ^= -1881188686;
                                                    break label518;
                                                case 707516448:
                                                    var2 ^= 1641044691;
                                                    break label518;
                                            }
                                        }

                                        var2 |= -1050248867;
                                        var2 ^= 1177005917;
                                    }

                                    try {
                                        var2 &= -376015461;
                                        var2 ^= -1052360673;
                                    } catch (Throwable var38) {
                                        var10000 = var38;
                                        break label522;
                                    }

                                    long var596 = var2;
                                    var10 = var596 + 1L;
                                    var10 = var596 * var10;
                                    long var597 = var10 & 1L;
                                    long var639;
                                    int var522 = (var639 = var597 - 0L) == 0L ? 0 : (var639 < 0L ? -1 : 1);
                                    if (var522 != 0) {
                                        break label543;
                                    }

                                    try {
                                        var2 |= 1204778483;
                                        var2 &= 1998787190;
                                        var2 ^= -1905174625;
                                        var2 ^= 1809331285;
                                        var2 ^= -1422209007;
                                    } catch (Throwable var37) {
                                        var10000 = var37;
                                        break label522;
                                    }

                                    long var524 = var2;
                                    long var598 = var524 + 1L;
                                    long var599 = var524 * var598;
                                    long var525 = var599 & 1L;
                                    long var640;
                                    int var392 = (var640 = var525 - 0L) == 0L ? 0 : (var640 < 0L ? -1 : 1);
                                    if (var392 == 0) {
                                        return;
                                    }
                                    break label543;
                                } else {
                                    var2 += 247276828;
                                    var2 ^= 230208422;
                                }

                                int var393 = var2 + 1;
                                int var394 = var2 * var393;
                                int var395 = var394 & 1;
                                if (var395 == 0) {
                                    var3 = this.f;
                                    Object var527 = var3;
                                    var2 ^= 1670271753;
                                    var2 += -2135870304;
                                    var2 &= -606042523;
                                    var2 ^= 397222095;
                                    synchronized (var3){}
                                    var2 *= 1993469279;
                                    var2 <<= 26;
                                    var2 *= -848175607;
                                    var2 |= 1538089750;
                                    var2 ^= 930915695;
                                    int var397 = var2 + 1;
                                    int var398 = var2 * var397;
                                    int var539 = var2 + 2;
                                    int var399 = var398 * var539;
                                    int var540 = var2 + 3;
                                    int var400 = var399 * var540;
                                    int var401 = var400 & 7;
                                    if (var401 == 0) {
                                        label459: {
                                            label590: {
                                                try {
                                                    var2 *= -381039389;
                                                    var2 ^= 1625702140;
                                                } catch (Throwable var36) {
                                                    int var169 = LH;
                                                    int var170 = var169 ^ 1192482449;
                                                    var541 = var36;
                                                    int var171 = var170 - -1359764200;
                                                    var2 = var171 ^ 914626730;
                                                    Integer var600 = var2;
                                                    if (var600 == null) {
                                                        break label543;
                                                    }
                                                    break label590;
                                                }

                                                var3 = var2;
                                                if (var3 == null) {
                                                    break label543;
                                                }

                                                try {
                                                    var3 = this.DI;
                                                    var2 -= -1912312102;
                                                    var2 ^= -761418415;
                                                    var542 = var1.trackId();
                                                } catch (Throwable var35) {
                                                    int var175 = LH;
                                                    int var176 = var175 ^ 1192482449;
                                                    var541 = var35;
                                                    int var177 = var176 - -1359764200;
                                                    var2 = var177 ^ 914626730;
                                                    Integer var601 = var2;
                                                    if (var601 == null) {
                                                        break label543;
                                                    }
                                                    break label590;
                                                }
                                                var2 = switch (var2) {
                                                    case -230578914 -> var2 ^ 1488701111;
                                                    default -> var2 ^ -636956707;
                                                    case 1440236940 -> {
                                                        var2 ^= 527448545;
                                                        var2 >>>= 9;
                                                        yield var2 ^ 420821484;
                                                    }
                                                };

                                                try {
                                                    var3 = ((Map)var3).get(var542);
                                                    var2 <<= 1;
                                                    var2 -= -780635018;
                                                    var2 -= -84699690;
                                                    var2 -= -965839771;
                                                    var2 ^= 859173747;
                                                } catch (Throwable var34) {
                                                    int var183 = LH;
                                                    int var184 = var183 ^ 1192482449;
                                                    var541 = var34;
                                                    int var185 = var184 - -1359764200;
                                                    var2 = var185 ^ 914626730;
                                                    Integer var602 = var2;
                                                    if (var602 == null) {
                                                        break label543;
                                                    }
                                                    break label590;
                                                }

                                                int var543 = var2 + 1;
                                                int var544 = var2 * var543;
                                                int var603 = var2 + 2;
                                                int var545 = var544 * var603;
                                                int var604 = var2 + 3;
                                                int var546 = var545 * var604;
                                                int var547 = var546 & 7;
                                                if (var547 != 0) {
                                                    break label543;
                                                }

                                                try {
                                                    var405 = (Za)var3;
                                                    var2 *= 375277511;
                                                    var2 |= 1394249801;
                                                    var2 ^= 1972897669;
                                                    var2 ^= 2053545806;
                                                    var2 ^= -736697302;
                                                } catch (Throwable var33) {
                                                    int var191 = LH;
                                                    int var192 = var191 ^ 1192482449;
                                                    var541 = var33;
                                                    int var193 = var192 - -1359764200;
                                                    var2 = var193 ^ 914626730;
                                                    Integer var605 = var2;
                                                    if (var605 == null) {
                                                        break label543;
                                                    }
                                                    break label590;
                                                }

                                                Integer var548 = var2;
                                                if (var548 == null) {
                                                    break label543;
                                                }

                                                try {
                                                    var3 = var405;
                                                    var2 += -1511101029;
                                                    var2 += -164324549;
                                                    var2 -= -606941293;
                                                    var2 ^= 2012518836;
                                                } catch (Throwable var32) {
                                                    int var199 = LH;
                                                    int var200 = var199 ^ 1192482449;
                                                    var541 = var32;
                                                    int var201 = var200 - -1359764200;
                                                    var2 = var201 ^ 914626730;
                                                    Integer var606 = var2;
                                                    if (var606 == null) {
                                                        break label543;
                                                    }
                                                    break label590;
                                                }

                                                var7 = var2;
                                                var9 = var7 + 1L;
                                                var9 = var7 * var9;
                                                var7 = var9 & 1L;
                                                long var641;
                                                int var551 = (var641 = var7 - 0L) == 0L ? 0 : (var641 < 0L ? -1 : 1);
                                                if (var551 != 0) {
                                                    break label543;
                                                }

                                                try {
                                                    var2 >>= 4;
                                                    var2 *= -1505617173;
                                                    var2 ^= -391928385;
                                                    var2 ^= -1009607675;
                                                    break label459;
                                                } catch (Throwable var31) {
                                                    int var206 = LH;
                                                    int var207 = var206 ^ 1192482449;
                                                    var541 = var31;
                                                    int var208 = var207 - -1359764200;
                                                    var2 = var208 ^ 914626730;
                                                    Integer var607 = var2;
                                                    if (var607 == null) {
                                                        break label543;
                                                    }
                                                }
                                            }

                                            while (true) {
                                                try {
                                                    var2 &= 1445075849;
                                                    var2 ^= 718871734;
                                                } catch (Throwable var16) {
                                                    int var209 = LH;
                                                    int var210 = var209 ^ 1192482449;
                                                    var541 = var16;
                                                    int var211 = var210 - -1359764200;
                                                    var2 = var211 ^ 914626730;
                                                    Integer var608 = var2;
                                                    if (var608 != null) {
                                                        continue;
                                                    }
                                                    break label543;
                                                }

                                                int var451 = var2 + 1;
                                                int var452 = var2 * var451;
                                                int var453 = var452 & 1;
                                                if (var453 == 0) {
                                                    throw UncheckedExceptions.rethrow(var541);
                                                }
                                                break label543;
                                            }
                                        }

                                        var2 *= -1796799395;
                                        var2 *= 1472388223;
                                        var2 ^= -787626865;
                                        int var454 = var2 + 1;
                                        int var455 = var2 * var454;
                                        int var552 = var2 + 2;
                                        int var456 = var455 * var552;
                                        int var553 = var2 + 3;
                                        int var457 = var456 * var553;
                                        int var458 = var457 & 7;
                                        if (var458 == 0) {
                                            if (var3 != null) {
                                                var2 += 951902980;
                                                var2 ^= 2115114886;
                                                var2 *= -1202395723;
                                                var2 ^= 1250131027;
                                                String var579 = var1.trackId();
                                                BA var611 = BA.FOUND;
                                                var4 = new be_2(var579, var611, (Za)var3);
                                                var2 >>= 14;
                                                var2 -= 1871072579;
                                                var2 += 355076673;
                                                var2 += -908295551;
                                                var2 ^= 1047734369;
                                                this.sK = (be_2)var4;
                                                return;
                                            }

                                            var2 |= -1515583234;
                                            var2 ^= -1023688309;
                                            int var407 = var2 + 1;
                                            int var408 = var2 * var407;
                                            int var459 = var2 + 2;
                                            int var409 = var408 * var459;
                                            int var460 = var2 + 3;
                                            int var410 = var409 * var460;
                                            int var411 = var410 & 7;
                                            if (var411 == 0) {
                                                var4 = var1.trackId();
                                                BA var554 = BA.LOADING;
                                                be_2 var412 = new be_2((String)var4, var554, null);
                                                this.sK = var412;
                                                var3 = (Map)this.f;
                                                Object var528 = var3;
                                                var2 ^= -1849424311;
                                                var2 |= 463858045;
                                                var2 >>= 14;
                                                var2 ^= -660290048;
                                                var2 ^= -714795165;
                                                var4 = var2;
                                                if (var4 != null) {
                                                    synchronized (var3){}
                                                    var2 ^= 1362042857;
                                                    var2 += 203531739;
                                                    var2 &= -781532056;
                                                    var2 ^= -301233425;
                                                    var2 ^= -554679552;
                                                    long var414 = var2;
                                                    var7 = var414 + 1L;
                                                    var7 = var414 * var7;
                                                    var9 = var414 + 2L;
                                                    var7 *= var9;
                                                    long var415 = var414 + 3L;
                                                    var7 *= var415;
                                                    long var416 = var7 & 7L;
                                                    long var642;
                                                    int var417 = (var642 = var416 - 0L) == 0L ? 0 : (var642 < 0L ? -1 : 1);
                                                    if (var417 == 0) {
                                                        label592: {
                                                            label556: {
                                                                try {
                                                                    var2 ^= 1725208745;
                                                                    var2 |= -616948573;
                                                                    var2 &= -2034652314;
                                                                    var2 |= 1675187480;
                                                                    var2 ^= 186041973;
                                                                    this.v = var1;
                                                                    var2 -= 1048828770;
                                                                    var2 &= -1605997015;
                                                                    var2 &= 704421536;
                                                                    var2 ^= 277218326;
                                                                } catch (Throwable var30) {
                                                                    var2 = LH;
                                                                    var2 ^= -1144613860;
                                                                    var418 = var30;
                                                                    var2 |= -1446445391;
                                                                    var2 ^= -1871211433;
                                                                    break label556;
                                                                }

                                                                Integer var419 = var2;
                                                                if (var419 == null) {
                                                                    break label543;
                                                                }

                                                                try {
                                                                    var420 = this.mn;
                                                                    var2 &= -746000611;
                                                                    var2 -= -195695449;
                                                                    var2 -= 1719906699;
                                                                    var2 >>= 6;
                                                                    var2 ^= 1054154890;
                                                                } catch (Throwable var29) {
                                                                    var2 = LH;
                                                                    var2 ^= -1144613860;
                                                                    var418 = var29;
                                                                    var2 |= -1446445391;
                                                                    var2 ^= -1871211433;
                                                                    break label556;
                                                                }

                                                                int var463 = var2 + 1;
                                                                int var464 = var2 * var463;
                                                                int var559 = var2 + 2;
                                                                int var465 = var464 * var559;
                                                                int var560 = var2 + 3;
                                                                int var466 = var465 * var560;
                                                                int var467 = var466 & 7;
                                                                if (var467 != 0) {
                                                                    break label543;
                                                                }

                                                                label408: {
                                                                    label593: {
                                                                        try {
                                                                            if (var420 != null) {
                                                                                break label593;
                                                                            }
                                                                        } catch (Throwable var28) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var28;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }

                                                                        var2 += 999806707;
                                                                        var2 ^= 1536742425;
                                                                        var2 |= 449938397;
                                                                        var2 ^= -1633729922;
                                                                        long var421 = var2;
                                                                        var7 = var421 + 1L;
                                                                        var7 = var421 * var7;
                                                                        long var422 = var7 & 1L;
                                                                        long var643;
                                                                        int var423 = (var643 = var422 - 0L) == 0L ? 0 : (var643 < 0L ? -1 : 1);
                                                                        if (var423 != 0) {
                                                                            break label543;
                                                                        }

                                                                        try {
                                                                            var2 >>= 24;
                                                                            var2 *= -1244244761;
                                                                            var2 += -368506318;
                                                                            var2 ^= -310964119;
                                                                        } catch (Throwable var27) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var27;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }

                                                                        int var424 = var2 + 1;
                                                                        int var425 = var2 * var424;
                                                                        int var468 = var2 + 2;
                                                                        int var426 = var425 * var468;
                                                                        int var469 = var2 + 3;
                                                                        int var427 = var426 * var469;
                                                                        int var428 = var427 & 7;
                                                                        if (var428 != 0) {
                                                                            break label543;
                                                                        }

                                                                        try {
                                                                            var429 = null;
                                                                            var2 &= 331154539;
                                                                            var2 ^= 763802601;
                                                                        } catch (Throwable var26) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var26;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }

                                                                        var4 = var2;
                                                                        if (var4 == null) {
                                                                            break label543;
                                                                        }

                                                                        try {
                                                                            var4 = (Runnable)this::i;
                                                                            var2 ^= 1458579641;
                                                                            var2 ^= 10836465;
                                                                        } catch (Throwable var25) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var25;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }

                                                                        int var563 = var2 + 1;
                                                                        int var564 = var2 * var563;
                                                                        int var609 = var2 + 2;
                                                                        int var565 = var564 * var609;
                                                                        int var610 = var2 + 3;
                                                                        int var566 = var565 * var610;
                                                                        int var567 = var566 & 7;
                                                                        if (var567 != 0) {
                                                                            break label543;
                                                                        }

                                                                        try {
                                                                            var429 = new Thread((Runnable)var4, "Aura Lyrics");
                                                                        } catch (Throwable var24) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var24;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }
                                                                        var2 = switch (var2) {
                                                                            case -1090173513 -> var2 ^ 1444391602;
                                                                            default -> var2 ^ 1817801864;
                                                                            case 1791673058 -> {
                                                                                var2 &= 332226782;
                                                                                var2 += -1580426283;
                                                                                var2 += -1156900815;
                                                                                yield var2 ^ -514801828;
                                                                            }
                                                                        };

                                                                        try {
                                                                            this.mn = var429;
                                                                            var2 += 1690555538;
                                                                            var2 -= 804947334;
                                                                            var2 ^= -1992801011;
                                                                            var430 = this.mn;
                                                                            var2 &= -112175946;
                                                                            var2 += -743313964;
                                                                            var2 >>>= 20;
                                                                            var2 <<= 12;
                                                                            var2 ^= -190237524;
                                                                        } catch (Throwable var23) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var23;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }

                                                                        var7 = var2;
                                                                        var9 = var7 + 1L;
                                                                        var9 = var7 * var9;
                                                                        var7 = var9 & 1L;
                                                                        long var644;
                                                                        int var472 = (var644 = var7 - 0L) == 0L ? 0 : (var644 < 0L ? -1 : 1);
                                                                        if (var472 != 0) {
                                                                            break label543;
                                                                        }

                                                                        try {
                                                                            var430.setDaemon(true);
                                                                            var2 <<= 17;
                                                                            var2 ^= 1403337868;
                                                                            var2 *= -1842422609;
                                                                            var2 ^= 973514773;
                                                                            var431 = this.mn;
                                                                            var2 += 1011799386;
                                                                            var2 &= 1220741981;
                                                                            var2 ^= 1866802995;
                                                                            var2 ^= 674377695;
                                                                        } catch (Throwable var22) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var22;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }

                                                                        var7 = var2;
                                                                        var9 = var7 + 1L;
                                                                        var9 = var7 * var9;
                                                                        long var11 = var7 + 2L;
                                                                        var9 *= var11;
                                                                        var7 += 3L;
                                                                        var9 *= var7;
                                                                        var7 = var9 & 7L;
                                                                        long var645;
                                                                        int var473 = (var645 = var7 - 0L) == 0L ? 0 : (var645 < 0L ? -1 : 1);
                                                                        if (var473 != 0) {
                                                                            break label543;
                                                                        }

                                                                        try {
                                                                            var431.start();
                                                                        } catch (Throwable var21) {
                                                                            var2 = LH;
                                                                            var2 ^= -1144613860;
                                                                            var418 = var21;
                                                                            var2 |= -1446445391;
                                                                            var2 ^= -1871211433;
                                                                            break label556;
                                                                        }

                                                                        switch (var2) {
                                                                            case -1521018506:
                                                                            default:
                                                                                var2 ^= -1140580164;
                                                                                break label408;
                                                                            case 133630133:
                                                                                var2 -= -924912796;
                                                                                var2 -= -2096872122;
                                                                                var2 ^= 330953474;
                                                                                break label408;
                                                                            case 1572369854:
                                                                                var2 ^= -426889161;
                                                                                break label408;
                                                                        }
                                                                    }

                                                                    var2 <<= 25;
                                                                    var2 ^= -441834743;
                                                                }

                                                                int var432 = var2 + 1;
                                                                int var433 = var2 * var432;
                                                                int var434 = var433 & 1;
                                                                if (var434 != 0) {
                                                                    break label543;
                                                                }

                                                                try {
                                                                    var2 += -841382570;
                                                                    var2 <<= 1;
                                                                    var2 ^= 931811368;
                                                                    var2 ^= 1073698860;
                                                                } catch (Throwable var20) {
                                                                    var2 = LH;
                                                                    var2 ^= -1144613860;
                                                                    var418 = var20;
                                                                    var2 |= -1446445391;
                                                                    var2 ^= -1871211433;
                                                                    break label556;
                                                                }

                                                                long var435 = var2;
                                                                var7 = var435 + 1L;
                                                                var7 = var435 * var7;
                                                                var9 = var435 + 2L;
                                                                var7 *= var9;
                                                                long var436 = var435 + 3L;
                                                                var7 *= var436;
                                                                long var437 = var7 & 7L;
                                                                long var646;
                                                                int var438 = (var646 = var437 - 0L) == 0L ? 0 : (var646 < 0L ? -1 : 1);
                                                                if (var438 != 0) {
                                                                    break label543;
                                                                }

                                                                try {
                                                                    var3 = (Map)this.f;
                                                                    var2 <<= 9;
                                                                    var2 &= -140571149;
                                                                    var2 *= 1826174157;
                                                                    var2 -= 1143108403;
                                                                    var2 ^= 477370915;
                                                                } catch (Throwable var19) {
                                                                    var2 = LH;
                                                                    var2 ^= -1144613860;
                                                                    var418 = var19;
                                                                    var2 |= -1446445391;
                                                                    var2 ^= -1871211433;
                                                                    break label556;
                                                                }

                                                                var7 = var2;
                                                                var9 = var7 + 1L;
                                                                var9 = var7 * var9;
                                                                var7 = var9 & 1L;
                                                                long var647;
                                                                int var474 = (var647 = var7 - 0L) == 0L ? 0 : (var647 < 0L ? -1 : 1);
                                                                if (var474 != 0) {
                                                                    break label543;
                                                                }

                                                                try {
                                                                    var3.notifyAll();
                                                                    var2 |= 2146418184;
                                                                    var2 <<= 21;
                                                                    var2 >>= 19;
                                                                    var2 ^= -1229391052;
                                                                } catch (Throwable var18) {
                                                                    var2 = LH;
                                                                    var2 ^= -1144613860;
                                                                    var418 = var18;
                                                                    var2 |= -1446445391;
                                                                    var2 ^= -1871211433;
                                                                    break label556;
                                                                }

                                                                int var440 = var2 + 1;
                                                                int var441 = var2 * var440;
                                                                int var475 = var2 + 2;
                                                                int var442 = var441 * var475;
                                                                int var476 = var2 + 3;
                                                                int var443 = var442 * var476;
                                                                int var444 = var443 & 7;
                                                                if (var444 != 0) {
                                                                    break label543;
                                                                }

                                                                try {
                                                                    break label592;
                                                                } catch (Throwable var17) {
                                                                    var2 = LH;
                                                                    var2 ^= -1144613860;
                                                                    var418 = var17;
                                                                    var2 |= -1446445391;
                                                                    var2 ^= -1871211433;
                                                                }
                                                            }

                                                            while (true) {
                                                                try {
                                                                    break;
                                                                } catch (Throwable var14) {
                                                                    var2 = LH;
                                                                    var2 ^= -1144613860;
                                                                    var418 = var14;
                                                                    var2 |= -1446445391;
                                                                    var2 ^= -1871211433;
                                                                }
                                                            }
                                                            var2 = switch (var2) {
                                                                default -> var2 ^ -1118585284;
                                                                case 731671268 -> {
                                                                    var2 <<= 19;
                                                                    yield var2 ^ -440227806;
                                                                }
                                                                case 1975278749 -> var2 ^ 1360273239;
                                                            };
                                                            int var477 = var2 + 1;
                                                            int var478 = var2 * var477;
                                                            int var479 = var478 & 1;
                                                            if (var479 == 0) {
                                                                throw UncheckedExceptions.rethrow(var418);
                                                            }
                                                            break label543;
                                                        }
                                                        var2 = switch (var2) {
                                                            case -1543007193 -> var2 ^ 1778217872;
                                                            case 1229389964 -> {
                                                                var2 += -371010498;
                                                                var2 >>>= 22;
                                                                var2 |= 500271084;
                                                                yield var2 ^ 1122023124;
                                                            }
                                                            default -> var2 ^ -1513856582;
                                                        };
                                                        Integer var445 = var2;
                                                        if (var445 != null) {
                                                            var2 -= 2136443785;
                                                            var2 <<= 18;
                                                            var2 ^= -1533940494;
                                                            var2 += 1072354211;
                                                            var2 ^= -1089197181;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break label543;
                            }

                            while (true) {
                                try {
                                    Throwable var386 = var10000;
                                    var2 = LH;
                                    var2 ^= 1791729542;
                                    var523 = var386;
                                    var2 += 638293155;
                                    var2 <<= 30;
                                    var2 ^= -1967159600;
                                    var2 |= 1256832031;
                                    var2 <<= 14;
                                    var2 *= 852510989;
                                    var2 ^= -735185158;
                                    break;
                                } catch (Throwable var15) {
                                    var10000 = var15;
                                }
                            }

                            int var387 = var2 + 1;
                            int var388 = var2 * var387;
                            int var537 = var2 + 2;
                            int var389 = var388 * var537;
                            int var538 = var2 + 3;
                            int var390 = var389 * var538;
                            int var391 = var390 & 7;
                            if (var391 == 0) {
                                throw UncheckedExceptions.rethrow(var523);
                            }
                        }
                    }
                    break label543;
                }

                var2 |= -2030349955;
                var2 &= 373551083;
                var2 ^= -17152364;
                var2 ^= -974509480;
            } else {
                var2 >>>= 11;
                var2 |= -1956205308;
                var2 &= 1068000621;
                var2 ^= 2058902921;
                var2 ^= 1556828971;
            }

            be_2 var446 = this.sK;

            var2 = switch (var2) {
                default -> var2 ^ -784881972;
                case 760425383 -> {
                    var2 &= 1151811503;
                    var2 &= -1100357001;
                    var2 |= -278090547;
                    var2 += 2047272102;
                    yield var2 ^ 938465645;
                }
                case 1135835645 -> var2 ^ -72198818;
            };
            int var481 = var2 + 1;
            int var482 = var2 * var481;
            int var493 = var2 + 2;
            int var483 = var482 * var493;
            int var494 = var2 + 3;
            int var484 = var483 * var494;
            int var485 = var484 & 7;
            label534:
            if (var485 == 0) {
                var4 = be_2.IDLE;
                if (var446 != var4) {
                    var2 = switch (var2) {
                        default -> var2 ^ -1748038994;
                        case 691207210 -> var2 ^ 67000684;
                        case 1587235576 -> {
                            var2 &= -1889286312;
                            yield var2 ^ 925837999;
                        }
                    };
                    long var447 = var2;
                    var5 = var447 + 1L;
                    var5 = var447 * var5;
                    long var448 = var5 & 1L;
                    long var648;
                    int var449 = (var648 = var448 - 0L) == 0L ? 0 : (var648 < 0L ? -1 : 1);
                    if (var449 != 0) {
                        break label534;
                    }

                    be_2 var450 = be_2.IDLE;
                    var2 += -1346422907;
                    var2 |= 1653769833;
                    var2 ^= -1444497374;
                    this.sK = var450;
                    var2 *= -218568137;
                    var2 >>= 13;
                    var2 *= -1263999811;
                    var2 -= 254138860;
                    var2 ^= 1873303378;
                } else {
                    var2 -= 2060285121;
                    var2 ^= 873000715;
                }

                long var382 = var2;
                long var487 = var382 + 1L;
                long var488 = var382 * var487;
                long var383 = var488 & 1L;
                long var649;
                var2 = (var649 = var383 - 0L) == 0L ? 0 : (var649 < 0L ? -1 : 1);
                if (var2 == 0) {
                    return;
                }
            }
        }

        RuntimeException var385 = new RuntimeException();
        throw var385;
    }

    private void i() {
    synchronized (this.f) {
        FX current = this.v;
        if (current != null && current.isSong()) {
            String trackId = current.trackId();
            if (trackId != null && !trackId.isEmpty()) {
                be_2 cached = (be_2) this.DI.get(trackId);
                if (cached != null) {
                    this.sK = cached;
                } else if (this.mn == null || !this.mn.isAlive()) {
                    this.sK = new be_2(trackId, BA.LOADING, null);
                    this.mn = new Thread(() -> {
                        be_2 result = this.d(current, 0);
                        synchronized (this.f) {
                            if (java.util.Objects.equals(this.v, current)) {
                                this.sK = result;
                            }
                        }
                    }, "Aura Lyrics");
                    this.mn.setDaemon(true);
                    this.mn.start();
                }
            }
        }
    }
}


    private be_2 d(FX var1, int var2) {
        be_2 var195 = null;
        be_2 var196 = null;
        UI var215 = null;
        Za var223 = null;
        be_2 var301 = null;
        String var306 = null;
        String var328 = null;
        BA var342 = null;
        BA var348 = null;
        Exception var4 = null;
        int var5 = var2 | -2007281317;
        var5 -= -2090652257;
        var5 ^= -1696592790;
        var5 ^= -521084841;
        Path var192 = this.E(var1, var5);
        Path var193 = var192;
        String var6 = var1.trackId();

        int var3 = switch (var2) {
            case 180326709 -> {
                int var25 = var2 | 2107671467;
                yield var25 ^ -471135924;
            }
            default -> var2 ^ 529792140;
            case 1156817676 -> var2 ^ -169397961;
        };
        int var7 = var3 + 1;
        var7 = var3 * var7;
        int var8 = var3 + 2;
        var7 *= var8;
        var8 = var3 + 3;
        var7 *= var8;
        var7 &= 7;
        label141:
        if (var7 == 0) {
            var7 = var3 - 674365414;
            var7 ^= 1696941984;
            be_2 var197 = this.T(var192, var6, var7);
            if (var197 != null) {
                switch (var3) {
                    case -1897620384:
                    default:
                        var3 ^= -989383399;
                        break;
                    case -1672176909:
                        var3 -= -1358747643;
                        var3 -= 888369753;
                        var3 &= -2045332236;
                        var3 ^= 1277719270;
                        break;
                    case 1071492043:
                        var3 ^= -567891717;
                }

                return var197;
            }

            var3 |= -1371782371;
            var3 -= 318206227;
            var3 |= -110022282;
            var3 ^= -1119306024;

            label194: {
                label217: {
                    try {
                        var3 -= 618387671;
                        var3 -= 1547987981;
                        var3 ^= -2146963730;
                        var3 ^= 194333017;
                    } catch (RuntimeException var24) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var198 = p(var24);
                        var4 = (Exception)var198;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var199 = var3 + 1;
                        int var200 = var3 * var199;
                        var8 = var3 + 2;
                        int var201 = var200 * var8;
                        var8 = var3 + 3;
                        int var202 = var201 * var8;
                        int var203 = var202 & 7;
                        if (var203 != 0) {
                            break label141;
                        }
                        break label217;
                    }

                    int var204 = var3 + 1;
                    int var205 = var3 * var204;
                    var7 = var3 + 2;
                    int var206 = var205 * var7;
                    var7 = var3 + 3;
                    int var207 = var206 * var7;
                    int var208 = var207 & 7;
                    if (var208 != 0) {
                        break label141;
                    }

                    try {
                        var215 = this.R;
                    } catch (RuntimeException var23) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var209 = p(var23);
                        var4 = (Exception)var209;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var210 = var3 + 1;
                        int var211 = var3 * var210;
                        var8 = var3 + 2;
                        int var212 = var211 * var8;
                        var8 = var3 + 3;
                        int var213 = var212 * var8;
                        int var214 = var213 & 7;
                        if (var214 != 0) {
                            break label141;
                        }
                        break label217;
                    }
                    var3 = switch (var3) {
                        case -1998444001 -> var3 ^ 626335404;
                        default -> var3 ^ -1980116342;
                        case 1309616117 -> {
                            var3 |= -1520673515;
                            var3 <<= 1;
                            yield var3 ^ 1439152782;
                        }
                    };

                    try {
                        Za var222 = var215.eV(var1);
                        var3 >>>= 10;
                        var3 *= 1366865003;
                        var3 ^= -1846890852;
                        var223 = var222;
                    } catch (RuntimeException | IOException var22) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var216 = p(var22);
                        var4 = (Exception)var216;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var217 = var3 + 1;
                        int var218 = var3 * var217;
                        var8 = var3 + 2;
                        int var219 = var218 * var8;
                        var8 = var3 + 3;
                        int var220 = var219 * var8;
                        int var221 = var220 & 7;
                        if (var221 != 0) {
                            break label141;
                        }
                        break label217;
                    }
                    var3 = switch (var3) {
                        default -> var3 ^ 2023790351;
                        case -1371983837 -> var3 ^ -2143502998;
                        case -130977465 -> {
                            var3 += 149186829;
                            var3 ^= 487884750;
                            var3 *= 1451200167;
                            var3 &= -1950760623;
                            yield var3 ^ -1975092939;
                        }
                    };
                    Integer var291 = var3;
                    if (var291 == null) {
                        break label141;
                    }

                    try {
                        int var292 = var3 * 374373277;
                        var292 ^= 411712683;
                        this.Ih(var193, var223, var292);
                        var3 >>= 10;
                        var3 ^= 1344834662;
                    } catch (RuntimeException var21) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var224 = p(var21);
                        var4 = (Exception)var224;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var225 = var3 + 1;
                        int var226 = var3 * var225;
                        var8 = var3 + 2;
                        int var227 = var226 * var8;
                        var8 = var3 + 3;
                        int var228 = var227 * var8;
                        int var229 = var228 & 7;
                        if (var229 != 0) {
                            break label141;
                        }
                        break label217;
                    }

                    long var294 = var3;
                    long var9 = var294 + 1L;
                    var9 = var294 * var9;
                    long var295 = var9 & 1L;
                    long var360;
                    var5 = (var360 = var295 - 0L) == 0L ? 0 : (var360 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        break label141;
                    }

                    label218: {
                        try {
                            if (var223 == null) {
                                break label218;
                            }
                        } catch (RuntimeException var20) {
                            var3 = LH;
                            var3 ^= -467836754;
                            Throwable var230 = p(var20);
                            var4 = (Exception)var230;
                            var4 = var4;
                            var3 ^= -347997287;
                            var3 &= 1798601859;
                            var3 -= 1125768276;
                            var3 ^= -1813962041;
                            int var231 = var3 + 1;
                            int var232 = var3 * var231;
                            var8 = var3 + 2;
                            int var233 = var232 * var8;
                            var8 = var3 + 3;
                            int var234 = var233 * var8;
                            int var235 = var234 & 7;
                            if (var235 != 0) {
                                break label141;
                            }
                            break label217;
                        }

                        var3 ^= -895183255;
                        var3 &= -733546551;
                        var3 ^= 1204099582;
                        int var296 = var3 + 1;
                        var296 = var3 * var296;
                        var8 = var3 + 2;
                        var296 *= var8;
                        var8 = var3 + 3;
                        var296 *= var8;
                        var296 &= 7;
                        if (var296 != 0) {
                            break label141;
                        }

                        try {
                            var301 = null;
                            var3 *= 251623407;
                            var3 += -1838932760;
                            var3 ^= -278151800;
                        } catch (RuntimeException var19) {
                            var3 = LH;
                            var3 ^= -467836754;
                            Throwable var236 = p(var19);
                            var4 = (Exception)var236;
                            var4 = var4;
                            var3 ^= -347997287;
                            var3 &= 1798601859;
                            var3 -= 1125768276;
                            var3 ^= -1813962041;
                            int var237 = var3 + 1;
                            int var238 = var3 * var237;
                            var8 = var3 + 2;
                            int var239 = var238 * var8;
                            var8 = var3 + 3;
                            int var240 = var239 * var8;
                            int var241 = var240 & 7;
                            if (var241 != 0) {
                                break label141;
                            }
                            break label217;
                        }

                        var8 = var3 + 1;
                        var8 = var3 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            break label141;
                        }

                        try {
                            var328 = var1.trackId();
                            var3 ^= -1944453010;
                            var3 -= -259904510;
                            var3 &= 1562813955;
                            var3 ^= -1676424476;
                            var348 = BA.FOUND;
                        } catch (RuntimeException var18) {
                            var3 = LH;
                            var3 ^= -467836754;
                            Throwable var242 = p(var18);
                            var4 = (Exception)var242;
                            var4 = var4;
                            var3 ^= -347997287;
                            var3 &= 1798601859;
                            var3 -= 1125768276;
                            var3 ^= -1813962041;
                            int var243 = var3 + 1;
                            int var244 = var3 * var243;
                            var8 = var3 + 2;
                            int var245 = var244 * var8;
                            var8 = var3 + 3;
                            int var246 = var245 * var8;
                            int var247 = var246 & 7;
                            if (var247 != 0) {
                                break label141;
                            }
                            break label217;
                        }
                        var3 = switch (var3) {
                            default -> var3 ^ -33913176;
                            case -1157586750 -> var3 ^ 204983006;
                            case -801937179 -> {
                                var3 &= 1166056247;
                                var3 *= 1195296185;
                                var3 <<= 6;
                                yield var3 ^ 1495598070;
                            }
                        };

                        try {
                            var301 = new be_2(var328, var348, var223);
                            var3 ^= 211916021;
                            var3 ^= -1107570583;
                        } catch (RuntimeException var17) {
                            var3 = LH;
                            var3 ^= -467836754;
                            Throwable var248 = p(var17);
                            var4 = (Exception)var248;
                            var4 = var4;
                            var3 ^= -347997287;
                            var3 &= 1798601859;
                            var3 -= 1125768276;
                            var3 ^= -1813962041;
                            int var249 = var3 + 1;
                            int var250 = var3 * var249;
                            var8 = var3 + 2;
                            int var251 = var250 * var8;
                            var8 = var3 + 3;
                            int var252 = var251 * var8;
                            int var253 = var252 & 7;
                            if (var253 != 0) {
                                break label141;
                            }
                            break label217;
                        }

                        int var175 = var3 + 1;
                        int var176 = var3 * var175;
                        int var254 = var3 + 2;
                        int var177 = var176 * var254;
                        int var255 = var3 + 3;
                        int var178 = var177 * var255;
                        int var179 = var178 & 7;
                        if (var179 != 0) {
                            break label141;
                        }

                        var195 = var301;
                        switch (var3) {
                            case -1625152576:
                                var3 ^= 1441664224;
                                break label194;
                            case -1483587652:
                            default:
                                var3 ^= 1144118079;
                                break label194;
                            case 2020190250:
                                var3 &= 1083106303;
                                var3 ^= 781306305;
                                break label194;
                        }
                    }

                    var3 += -1034839479;
                    var3 ^= 1268886347;

                    try {
                        var196 = null;
                        var3 |= 1349719852;
                        var3 &= 635250083;
                        var3 &= -1454658416;
                        var3 |= 570454992;
                        var3 ^= -1871283653;
                    } catch (RuntimeException var16) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var256 = p(var16);
                        var4 = (Exception)var256;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var257 = var3 + 1;
                        int var258 = var3 * var257;
                        var8 = var3 + 2;
                        int var259 = var258 * var8;
                        var8 = var3 + 3;
                        int var260 = var259 * var8;
                        int var261 = var260 & 7;
                        if (var261 != 0) {
                            break label141;
                        }
                        break label217;
                    }

                    long var302 = var3;
                    var9 = var302 + 1L;
                    var9 = var302 * var9;
                    long var11 = var302 + 2L;
                    var9 *= var11;
                    long var303 = var302 + 3L;
                    var9 *= var303;
                    long var304 = var9 & 7L;
                    long var361;
                    int var305 = (var361 = var304 - 0L) == 0L ? 0 : (var361 < 0L ? -1 : 1);
                    if (var305 != 0) {
                        break label141;
                    }

                    try {
                        var306 = var1.trackId();
                        var3 |= 1083675713;
                        var3 -= -1355309561;
                        var3 |= -1593365875;
                        var3 |= -713394202;
                        var3 ^= 295783983;
                    } catch (RuntimeException var15) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var262 = p(var15);
                        var4 = (Exception)var262;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var263 = var3 + 1;
                        int var264 = var3 * var263;
                        var8 = var3 + 2;
                        int var265 = var264 * var8;
                        var8 = var3 + 3;
                        int var266 = var265 * var8;
                        int var267 = var266 & 7;
                        if (var267 != 0) {
                            break label141;
                        }
                        break label217;
                    }

                    var8 = var3 + 1;
                    var8 = var3 * var8;
                    int var353 = var3 + 2;
                    var8 *= var353;
                    int var354 = var3 + 3;
                    var8 *= var354;
                    var8 &= 7;
                    if (var8 != 0) {
                        break label141;
                    }

                    try {
                        var342 = BA.MISSING;
                        var3 -= -638754460;
                        var3 -= 1496704009;
                        var3 ^= -498067338;
                    } catch (RuntimeException var14) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var268 = p(var14);
                        var4 = (Exception)var268;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var269 = var3 + 1;
                        int var270 = var3 * var269;
                        var8 = var3 + 2;
                        int var271 = var270 * var8;
                        var8 = var3 + 3;
                        int var272 = var271 * var8;
                        int var273 = var272 & 7;
                        if (var273 != 0) {
                            break label141;
                        }
                        break label217;
                    }

                    var9 = var3;
                    var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var9 = var11 & 1L;
                    long var362;
                    int var357 = (var362 = var9 - 0L) == 0L ? 0 : (var362 < 0L ? -1 : 1);
                    if (var357 != 0) {
                        break label141;
                    }

                    try {
                        var196 = new be_2(var306, var342, null);
                        var3 += -1705587844;
                        var3 |= 1441774644;
                        var3 -= 1482457634;
                        var3 ^= 1036351010;
                    } catch (RuntimeException var13) {
                        var3 = LH;
                        var3 ^= -467836754;
                        Throwable var274 = p(var13);
                        var4 = (Exception)var274;
                        var4 = var4;
                        var3 ^= -347997287;
                        var3 &= 1798601859;
                        var3 -= 1125768276;
                        var3 ^= -1813962041;
                        int var275 = var3 + 1;
                        int var276 = var3 * var275;
                        var8 = var3 + 2;
                        int var277 = var276 * var8;
                        var8 = var3 + 3;
                        int var278 = var277 * var8;
                        int var279 = var278 & 7;
                        if (var279 != 0) {
                            break label141;
                        }
                        break label217;
                    }

                    Integer var307 = var3;
                    if (var307 == null) {
                        break label141;
                    }

                    var195 = var196;
                    var3 >>>= 17;
                    var3 ^= 1855530432;
                    break label194;
                }

                Logger var280 = gf;
                String var345 = var1.title();
                String var184 = var4.toString();
                var280.debug("Lyrics lookup failed for {} ({})", var345, var184);
                var6 = var1.trackId();
                BA var346 = BA.ERROR;
                return new be_2(var6, var346, null);
            }

            int var185 = var3 + 1;
            int var186 = var3 * var185;
            int var282 = var3 + 2;
            int var187 = var186 * var282;
            var3 += 3;
            int var188 = var187 * var3;
            var3 = var188 & 7;
            if (var3 == 0) {
                return var195;
            }
        }

        IllegalArgumentException var159 = new IllegalArgumentException();
        throw var159;
    }

    private Path E(FX var1, int var2) {
        java.security.MessageDigest var171 = null;
        java.security.MessageDigest var172 = null;
        byte[] var173 = null;
        byte[] var174 = null;
        Object var175 = null;
        String var176 = null;
        Object var188 = null;
        String var192 = null;
        String var194 = null;
        byte[] var197 = null;
        Path var203 = null;
        Object var219 = null;
        java.nio.charset.Charset var226 = null;
        java.util.HexFormat var234 = null;
        Object var246 = null;
        Object var5 = null;
        Path var6 = this.U;

        int var33 = switch (var2) {
            case -2034830995 -> var2 ^ 2008748650;
            default -> var2 ^ 823454167;
            case 2106347485 -> {
                int var4 = var2 & -371884148;
                var4 >>= 23;
                var4 += -494634527;
                yield var4 ^ 414274425;
            }
        };
        int var7 = var33 + 1;
        var7 = var33 * var7;
        int var8 = var33 + 2;
        var7 *= var8;
        var8 = var33 + 3;
        var7 *= var8;
        var7 &= 7;
        if (var7 == 0) {
            if (var6 == null) {
                var33 += -1765534691;
                var33 *= 764339785;
                var33 >>= 2;
                var33 |= 560509289;
                var33 ^= -434810187;
                long var165 = var33;
                long var214 = var165 + 1L;
                long var215 = var165 * var214;
                long var166 = var215 & 1L;
                long var267;
                int var167 = (var267 = var166 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                if (var167 == 0) {
                    return null;
                }
            } else {
                var33 ^= -1560555771;
                var33 ^= 241022218;
                var33 *= 236016231;
                var33 -= 1005455972;
                var33 ^= -1829344962;
                long var168 = var33;
                long var216 = var168 + 1L;
                long var217 = var168 * var216;
                long var169 = var217 & 1L;
                long var268;
                int var170 = (var268 = var169 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                label242:
                if (var170 == 0) {
                    var33 = switch (var33) {
                        default -> var33 ^ -1018406564;
                        case 1694016916 -> {
                            var33 -= 1151414859;
                            var33 ^= -772486628;
                            var33 ^= 1760517467;
                            yield var33 ^ -537581605;
                        }
                        case 1716875194 -> var33 ^ -1376741165;
                    };

                    label239: {
                        Throwable var3;
                        label238: {
                            label270: {
                                try {
                                    var171 = MessageDigest.getInstance("SHA-256");
                                } catch (Throwable var27) {
                                    var3 = var27;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var182 = var27 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var182) {
                                        break label238;
                                    }
                                    break label270;
                                }
                                var33 = switch (var33) {
                                    case -1304995327 -> var33 ^ -722042512;
                                    case 1186579413 -> {
                                        var33 ^= -563785323;
                                        var33 &= -644943551;
                                        yield var33 ^ 285403230;
                                    }
                                    default -> var33 ^ -891995258;
                                };
                                long var183 = var33;
                                long var9 = var183 + 1L;
                                var9 = var183 * var9;
                                long var11 = var183 + 2L;
                                var9 *= var11;
                                long var184 = var183 + 3L;
                                var9 *= var184;
                                long var185 = var9 & 7L;
                                long var269;
                                var7 = (var269 = var185 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label242;
                                }

                                try {
                                    var172 = var171;
                                    var33 |= 456611837;
                                    var33 += 2074333747;
                                    var33 <<= 23;
                                    var33 *= -982685081;
                                    var33 ^= 641562303;
                                    var188 = var1.trackId();
                                } catch (Throwable var26) {
                                    var3 = var26;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var187 = var26 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var187) {
                                        break label238;
                                    }
                                    break label270;
                                }
                                var33 = switch (var33) {
                                    case -785771223 -> var33 ^ 1252898652;
                                    default -> var33 ^ 2078103562;
                                    case 691893951 -> {
                                        var33 *= 918361669;
                                        var33 *= 1533808097;
                                        var33 <<= 7;
                                        var33 += 1543398073;
                                        yield var33 ^ 1038306074;
                                    }
                                };
                                Integer var218 = var33;
                                if (var218 == null) {
                                    break label242;
                                }

                                try {
                                    var219 = var1.title();
                                    var33 ^= 1240555953;
                                    var33 -= 1424626323;
                                    var33 ^= -1117442205;
                                } catch (Throwable var25) {
                                    var3 = var25;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var189 = var25 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var189) {
                                        break label238;
                                    }
                                    break label270;
                                }

                                int var241 = var33 + 1;
                                int var242 = var33 * var241;
                                int var10 = var33 + 2;
                                int var243 = var242 * var10;
                                var10 = var33 + 3;
                                int var244 = var243 * var10;
                                int var245 = var244 & 7;
                                if (var245 != 0) {
                                    break label242;
                                }

                                try {
                                    var246 = var1.artist();
                                    var33 |= 187646889;
                                    var33 *= 320711167;
                                    var33 |= 760552564;
                                    var33 |= -673148430;
                                    var33 ^= 1735114432;
                                } catch (Throwable var24) {
                                    var3 = var24;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var190 = var24 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var190) {
                                        break label238;
                                    }
                                    break label270;
                                }

                                var10 = var33 + 1;
                                var10 = var33 * var10;
                                var10 &= 1;
                                if (var10 != 0) {
                                    break label242;
                                }

                                try {
                                    var192 = var188 + "\n" + var219 + "\n" + var246;
                                    var33 *= 413437571;
                                    var33 += 595628864;
                                    var33 ^= 506141663;
                                    var33 |= -1711230450;
                                    var33 ^= -2042409873;
                                } catch (Throwable var23) {
                                    var3 = var23;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var191 = var23 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var191) {
                                        break label238;
                                    }
                                    break label270;
                                }

                                var218 = var33;
                                if (var218 == null) {
                                    break label242;
                                }

                                try {
                                    var194 = var192;
                                } catch (Throwable var22) {
                                    var3 = var22;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var193 = var22 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var193) {
                                        break label238;
                                    }
                                    break label270;
                                }
                                var33 = switch (var33) {
                                    case -1855613261 -> var33 ^ 991079218;
                                    default -> var33 ^ 1960066835;
                                    case 2021454801 -> {
                                        var33 &= -179836004;
                                        var33 ^= -1944637026;
                                        var33 &= 445993058;
                                        yield var33 ^ 1976999717;
                                    }
                                };
                                int var221 = var33 + 1;
                                var221 = var33 * var221;
                                int var247 = var33 + 2;
                                var221 *= var247;
                                int var248 = var33 + 3;
                                var221 *= var248;
                                var221 &= 7;
                                if (var221 != 0) {
                                    break label242;
                                }

                                try {
                                    var226 = StandardCharsets.UTF_8;
                                } catch (Throwable var21) {
                                    var3 = var21;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var195 = var21 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var195) {
                                        break label238;
                                    }
                                    break label270;
                                }
                                var33 = switch (var33) {
                                    default -> var33 ^ -1911906749;
                                    case -1739835252 -> var33 ^ 1965236752;
                                    case 1841811239 -> {
                                        var33 <<= 20;
                                        yield var33 ^ -1780907217;
                                    }
                                };

                                try {
                                    var197 = var194.getBytes(var226);
                                    var33 <<= 17;
                                    var33 ^= 425505167;
                                } catch (Throwable var20) {
                                    var3 = var20;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var196 = var20 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var196) {
                                        break label238;
                                    }
                                    break label270;
                                }

                                var221 = var33 + 1;
                                var221 = var33 * var221;
                                var221 &= 1;
                                if (var221 != 0) {
                                    break label242;
                                }

                                try {
                                    var173 = var172.digest(var197);
                                    var33 |= -1017378196;
                                    var33 *= -1345205511;
                                    var33 ^= -1847754785;
                                } catch (Throwable var19) {
                                    var3 = var19;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var198 = var19 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var198) {
                                        break label238;
                                    }
                                    break label270;
                                }

                                var7 = var33 + 1;
                                var7 = var33 * var7;
                                var7 &= 1;
                                if (var7 != 0) {
                                    break label242;
                                }

                                try {
                                    var174 = var173;
                                    var33 -= 1403938011;
                                    var33 += -2082844902;
                                    var33 *= -1586349245;
                                    var33 >>= 20;
                                    var33 ^= 406047226;
                                    var203 = this.U;
                                } catch (Throwable var18) {
                                    var3 = var18;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var202 = var18 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var202) {
                                        break label238;
                                    }
                                    break label270;
                                }
                                var33 = switch (var33) {
                                    case -1678909375 -> var33 ^ 387706891;
                                    default -> var33 ^ -806418106;
                                    case -406048248 -> {
                                        var33 &= 780694319;
                                        var33 += -990123616;
                                        yield var33 ^ 138863937;
                                    }
                                };
                                long var230 = var33;
                                long var260 = var230 + 1L;
                                long var261 = var230 * var260;
                                long var12 = var230 + 2L;
                                long var262 = var261 * var12;
                                long var231 = var230 + 3L;
                                long var263 = var262 * var231;
                                long var232 = var263 & 7L;
                                long var270;
                                var221 = (var270 = var232 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                                if (var221 != 0) {
                                    break label242;
                                }

                                try {
                                    var234 = HexFormat.of();
                                    var33 &= -374612257;
                                    var33 &= -944657032;
                                    var33 |= -886747465;
                                    var33 *= 998180219;
                                    var33 ^= -1667709258;
                                } catch (Throwable var17) {
                                    var3 = var17;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var204 = var17 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var204) {
                                        break label238;
                                    }
                                    break label270;
                                }

                                var9 = var33;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                var9 = var11 & 1L;
                                long var271;
                                int var251 = (var271 = var9 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                                if (var251 != 0) {
                                    break label242;
                                }

                                try {
                                    var175 = var234.formatHex(var174, 0, 16);
                                } catch (Throwable var16) {
                                    var3 = var16;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var205 = var16 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var205) {
                                        break label238;
                                    }
                                    break label270;
                                }
                                var33 = switch (var33) {
                                    default -> var33 ^ -1666170008;
                                    case -1271649109 -> var33 ^ -1160807749;
                                    case 397322547 -> {
                                        var33 ^= 1466595718;
                                        var33 <<= 20;
                                        var33 += 1373471425;
                                        yield var33 ^ 990190507;
                                    }
                                };

                                try {
                                    var176 = var175 + ".lrc";
                                } catch (Throwable var15) {
                                    var3 = var15;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var206 = var15 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var206) {
                                        break label238;
                                    }
                                    break label270;
                                }
                                var33 = switch (var33) {
                                    case -1427220757 -> var33 ^ -1538559446;
                                    default -> var33 ^ -1715445475;
                                    case 1713936746 -> {
                                        var33 += -326940105;
                                        yield var33 ^ -1355699713;
                                    }
                                };
                                var221 = var33 + 1;
                                var221 = var33 * var221;
                                var221 &= 1;
                                if (var221 != 0) {
                                    break label242;
                                }

                                try {
                                    var6 = var203.resolve(var176);
                                    var33 += -1463710068;
                                    var33 ^= -56760893;
                                    var33 ^= 180581125;
                                    break label239;
                                } catch (Throwable var14) {
                                    var3 = var14;
                                    var33 = LH;
                                    var33 ^= 1772832311;
                                    boolean var207 = var14 instanceof NoSuchAlgorithmException;
                                    var33 *= 1699359489;
                                    var33 ^= 834275056;
                                    if (!var207) {
                                        break label238;
                                    }
                                }
                            }

                            var33 *= -144079989;
                            var33 ^= 311210713;
                            var33 *= -924918931;
                            var33 *= 318521823;
                            var33 ^= -1228942358;
                            Integer var208 = var33;
                            if (var208 != null) {
                                var5 = (NoSuchAlgorithmException)var3;
                                var33 &= -759200329;
                                var33 *= -566170013;
                                var33 ^= 744035949;
                                var33 ^= 1993493046;
                                Integer var28 = var33;
                                if (var28 != null) {
                                    return null;
                                }
                            }
                            break label242;
                        }

                        var33 -= -371478389;
                        var33 *= 357541783;
                        var33 &= -1937160997;
                        var33 ^= -252301479;
                        var33 ^= 410691408;
                        long var209 = var33;
                        long var252 = var209 + 1L;
                        var252 = var209 * var252;
                        long var266 = var209 + 2L;
                        var252 *= var266;
                        long var210 = var209 + 3L;
                        var252 *= var210;
                        long var211 = var252 & 7L;
                        long var272;
                        var7 = (var272 = var211 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                        if (var7 == 0) {
                            throw UncheckedExceptions.rethrow(var3);
                        }
                        break label242;
                    }

                    Integer var29 = var33;
                    if (var29 != null) {
                        return var6;
                    }
                }
            }
        }

        IllegalStateException var30 = new IllegalStateException();
        throw var30;
    }

    private be_2 T(Path var1, String var2, int var3) {
        Throwable var503 = null;
        String var510 = null;
        String var511 = null;
        String var512 = null;
        String var513 = null;
        Object var514 = null;
        Za var515 = null;
        String var537 = null;
        String var538 = null;
        boolean var539 = false;
        int var541 = 0;
        be_2 var545 = null;
        LongSupplier var554 = null;
        long var556 = 0L;
        be_2 var561 = null;
        int var572 = 0;
        int var573 = 0;
        int var574 = 0;
        int var577 = 0;
        int var581 = 0;
        BA var587 = null;
        be_2 var599 = null;
        be_2 var604 = null;
        be_2 var610 = null;
        int var627 = 0;
        int var633 = 0;
        BA var643 = null;
        BA var648 = null;
        BA var660 = null;
        Object var671 = null;
        boolean var672 = false;
        Za var698 = null;
        Za var707 = null;
        boolean var759 = false;
        int var764 = 0;
        int var778 = 0;
        Object var5 = null;
        int var4 = var3 & 2040296889;
        var4 -= 1637606713;
        var4 |= -711863734;
        var4 ^= -2100741167;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        var6 = var8 & 1L;
        long var847;
        int var499 = (var847 = var6 - 0L) == 0L ? 0 : (var847 < 0L ? -1 : 1);
        label1092:
        if (var499 == 0) {
            if (var1 != null) {
                var4 += -1949495544;
                var4 |= 1629283618;
                var4 ^= 1949795023;
                Integer var500 = var4;
                if (var500 == null) {
                    break label1092;
                }

                LinkOption[] var501 = new LinkOption[0];

                var4 = switch (var4) {
                    case -230261053 -> var4 ^ -2109553972;
                    case 499807612 -> {
                        var4 &= 177358877;
                        yield var4 ^ -49389628;
                    }
                    default -> var4 ^ 65677776;
                };
                int var7 = var4 + 1;
                var7 = var4 * var7;
                var7 &= 1;
                if (var7 != 0) {
                    break label1092;
                }

                boolean var502 = Files.isRegularFile(var1, var501);
                if (var502) {
                    var4 = switch (var4) {
                        case -1232511676 -> var4 ^ -229782680;
                        case -175366184 -> {
                            var4 &= 939628508;
                            var4 += -123825413;
                            yield var4 ^ -2114098634;
                        }
                        default -> var4 ^ 418147890;
                    };

                    label1079: {
                        label1078: {
                            label1077: {
                                label1076: {
                                    label1167: {
                                        try {
                                            var4 ^= 1796447212;
                                            var4 ^= -1875007874;
                                            var4 ^= -1545005315;
                                        } catch (RuntimeException var61) {
                                            var4 = LH;
                                            var4 ^= 206329630;
                                            var503 = p(var61);
                                            switch (var4) {
                                                case -1939221248:
                                                    break label1076;
                                                case -1668699656:
                                                default:
                                                    break label1077;
                                                case 1380447960:
                                                    break label1167;
                                            }
                                        }

                                        int var504 = var4 + 1;
                                        int var505 = var4 * var504;
                                        var7 = var4 + 2;
                                        int var506 = var505 * var7;
                                        var7 = var4 + 3;
                                        int var507 = var506 * var7;
                                        int var508 = var507 & 7;
                                        if (var508 != 0) {
                                            break label1092;
                                        }

                                        try {
                                            Charset var509 = StandardCharsets.UTF_8;
                                            var4 &= 2125610569;
                                            var4 ^= 1016959248;
                                            var4 ^= 1129300270;
                                            var510 = Files.readString(var1, var509);
                                        } catch (RuntimeException | IOException var60) {
                                            var4 = LH;
                                            var4 ^= 206329630;
                                            var503 = p(var60);
                                            switch (var4) {
                                                case -1939221248:
                                                    break label1076;
                                                case -1668699656:
                                                default:
                                                    break label1077;
                                                case 1380447960:
                                                    break label1167;
                                            }
                                        }
                                        var4 = switch (var4) {
                                            case -334425328 -> var4 ^ 354221579;
                                            case 259160630 -> {
                                                var4 -= -1292423017;
                                                yield var4 ^ 430207944;
                                            }
                                            default -> var4 ^ 667129017;
                                        };

                                        try {
                                            var511 = var510;
                                            var4 ^= -602088167;
                                            var4 ^= 1083834819;
                                            var4 &= 2147393529;
                                            var4 ^= -1786554532;
                                        } catch (RuntimeException var59) {
                                            var4 = LH;
                                            var4 ^= 206329630;
                                            var503 = p(var59);
                                            switch (var4) {
                                                case -1939221248:
                                                    break label1076;
                                                case -1668699656:
                                                default:
                                                    break label1077;
                                                case 1380447960:
                                                    break label1167;
                                            }
                                        }

                                        var7 = var4 + 1;
                                        var7 = var4 * var7;
                                        var7 &= 1;
                                        if (var7 != 0) {
                                            break label1092;
                                        }

                                        try {
                                            var7 = var511.indexOf(10);
                                            var7 = var7;
                                            var4 |= 2146222786;
                                            var4 -= 1121139445;
                                            var4 += 69195769;
                                            var4 ^= 750740187;
                                            var4 ^= 515931046;
                                            var572 = var7 + 1;
                                        } catch (RuntimeException var58) {
                                            var4 = LH;
                                            var4 ^= 206329630;
                                            var503 = p(var58);
                                            switch (var4) {
                                                case -1939221248:
                                                    break label1076;
                                                case -1668699656:
                                                default:
                                                    break label1077;
                                                case 1380447960:
                                                    break label1167;
                                            }
                                        }
                                        var4 = switch (var4) {
                                            case -252688602 -> var4 ^ -1509226900;
                                            case -214734426 -> {
                                                var4 *= -760897067;
                                                var4 &= -154210060;
                                                var4 ^= -1771160065;
                                                var4 += 1891520109;
                                                yield var4 ^ -175172650;
                                            }
                                            default -> var4 ^ -1505178460;
                                        };
                                        Integer var9 = var4;
                                        if (var9 == null) {
                                            break label1092;
                                        }

                                        try {
                                            var573 = var511.indexOf(10, var572);
                                            var4 += 802570225;
                                            var4 ^= -1063202474;
                                        } catch (RuntimeException var57) {
                                            var4 = LH;
                                            var4 ^= 206329630;
                                            var503 = p(var57);
                                            switch (var4) {
                                                case -1939221248:
                                                    break label1076;
                                                case -1668699656:
                                                default:
                                                    break label1077;
                                                case 1380447960:
                                                    break label1167;
                                            }
                                        }

                                        long var618 = var4;
                                        long var11 = var618 + 1L;
                                        var11 = var618 * var11;
                                        long var619 = var11 & 1L;
                                        long var848;
                                        int var620 = (var848 = var619 - 0L) == 0L ? 0 : (var848 < 0L ? -1 : 1);
                                        if (var620 != 0) {
                                            break label1092;
                                        }

                                        try {
                                            var574 = var573;
                                            var620 = var573 + 1;
                                            var4 *= 1507914237;
                                            var4 |= -1310666854;
                                            var4 -= -1795416951;
                                            var4 &= 1085992370;
                                            var4 ^= -204761446;
                                            var620 = var511.indexOf(10, var620);
                                            var620 = var620;
                                            var4 ^= -1304068133;
                                            var4 *= -1702998291;
                                            var4 *= -627991899;
                                            var4 *= -1385774191;
                                            var4 ^= 1011371574;
                                        } catch (RuntimeException var56) {
                                            var4 = LH;
                                            var4 ^= 206329630;
                                            var503 = p(var56);
                                            switch (var4) {
                                                case -1939221248:
                                                    break label1076;
                                                case -1668699656:
                                                default:
                                                    break label1077;
                                                case 1380447960:
                                                    break label1167;
                                            }
                                        }

                                        long var10 = var4;
                                        long var12 = var10 + 1L;
                                        var12 = var10 * var12;
                                        long var14 = var10 + 2L;
                                        var12 *= var14;
                                        var10 += 3L;
                                        var12 *= var10;
                                        var10 = var12 & 7L;
                                        long var849;
                                        int var666 = (var849 = var10 - 0L) == 0L ? 0 : (var849 < 0L ? -1 : 1);
                                        if (var666 != 0) {
                                            break label1092;
                                        }

                                        label1073: {
                                            label1097: {
                                                try {
                                                    if (var7 < 0) {
                                                        break label1097;
                                                    }
                                                } catch (RuntimeException var70) {
                                                    var4 = LH;
                                                    var4 ^= 206329630;
                                                    var503 = p(var70);
                                                    switch (var4) {
                                                        case -1939221248:
                                                            break label1076;
                                                        case -1668699656:
                                                        default:
                                                            break label1077;
                                                        case 1380447960:
                                                            break label1167;
                                                    }
                                                }

                                                var4 *= 1230319749;
                                                var4 ^= -372024795;
                                                if (var574 >= 0) {
                                                    var4 = switch (var4) {
                                                        default -> var4 ^ -1994822989;
                                                        case -1086265110 -> var4 ^ 1156820804;
                                                        case -445230356 -> {
                                                            var4 += -40605221;
                                                            var4 >>>= 23;
                                                            var4 >>= 4;
                                                            yield var4 ^ 1766391760;
                                                        }
                                                    };
                                                    int var667 = var4 + 1;
                                                    int var668 = var4 * var667;
                                                    int var669 = var668 & 1;
                                                    if (var669 != 0) {
                                                        break label1092;
                                                    }

                                                    if (var620 >= 0) {
                                                        var4 *= 191357709;
                                                        var4 ^= -1729321829;

                                                        var4 = switch (var4) {
                                                            default -> var4 ^ -1599489646;
                                                            case 1514878051 -> var4 ^ -1155295903;
                                                            case 1517700551 -> {
                                                                var4 ^= -197302721;
                                                                var4 |= 1403513546;
                                                                yield var4 ^ 1369223560;
                                                            }
                                                        };
                                                        Integer var670 = var4;
                                                        if (var670 == null) {
                                                            break label1092;
                                                        }

                                                        try {
                                                            var671 = var511.substring(0, var7);
                                                            var4 ^= 383665583;
                                                            var4 += 1115131634;
                                                            var4 -= 754101708;
                                                            var4 <<= 28;
                                                            var4 ^= -1334860907;
                                                        } catch (RuntimeException var55) {
                                                            var4 = LH;
                                                            var4 ^= 206329630;
                                                            var503 = p(var55);
                                                            switch (var4) {
                                                                case -1939221248:
                                                                    break label1076;
                                                                case -1668699656:
                                                                default:
                                                                    break label1077;
                                                                case 1380447960:
                                                                    break label1167;
                                                            }
                                                        }

                                                        int var718 = var4 + 1;
                                                        int var719 = var4 * var718;
                                                        int var745 = var4 + 2;
                                                        int var720 = var719 * var745;
                                                        int var746 = var4 + 3;
                                                        int var721 = var720 * var746;
                                                        int var722 = var721 & 7;
                                                        if (var722 != 0) {
                                                            break label1092;
                                                        }

                                                        try {
                                                            var672 = var671.equals("aura-lyrics 1");
                                                            var4 >>>= 4;
                                                            var4 &= -2102570427;
                                                            var4 <<= 15;
                                                            var4 *= -514992901;
                                                            var4 ^= 2130411421;
                                                        } catch (RuntimeException var54) {
                                                            var4 = LH;
                                                            var4 ^= 206329630;
                                                            var503 = p(var54);
                                                            switch (var4) {
                                                                case -1939221248:
                                                                    break label1076;
                                                                case -1668699656:
                                                                default:
                                                                    break label1077;
                                                                case 1380447960:
                                                                    break label1167;
                                                            }
                                                        }

                                                        Integer var723 = var4;
                                                        if (var723 == null) {
                                                            break label1092;
                                                        }

                                                        label1170: {
                                                            try {
                                                                if (!var672) {
                                                                    break label1170;
                                                                }
                                                            } catch (RuntimeException var69) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var69);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }

                                                            var4 ^= 1033190448;
                                                            var4 ^= -1834138507;
                                                            Integer var673 = var4;
                                                            if (var673 == null) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var7++;
                                                                var4 |= 835648651;
                                                                var4 ^= 355393422;
                                                            } catch (RuntimeException var53) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var53);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }

                                                            int var674 = var4 + 1;
                                                            int var675 = var4 * var674;
                                                            int var724 = var4 + 2;
                                                            int var676 = var675 * var724;
                                                            int var725 = var4 + 3;
                                                            int var677 = var676 * var725;
                                                            int var678 = var677 & 7;
                                                            if (var678 != 0) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                String var536 = var511.substring(var7, var574);
                                                                var537 = var536;
                                                                var4 *= 888068145;
                                                                var4 ^= -424845096;
                                                                var4 |= 1300038399;
                                                                var4 ^= -455459537;
                                                            } catch (RuntimeException var52) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var52);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }

                                                            Integer var679 = var4;
                                                            if (var679 == null) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var574++;
                                                                var4 ^= 83089360;
                                                                var4 += -1088469509;
                                                                var4 -= -859875686;
                                                                var4 >>>= 17;
                                                                var4 ^= 1062089132;
                                                            } catch (RuntimeException var51) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var51);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }

                                                            var10 = var4;
                                                            var12 = var10 + 1L;
                                                            var12 = var10 * var12;
                                                            var14 = var10 + 2L;
                                                            var12 *= var14;
                                                            var10 += 3L;
                                                            var12 *= var10;
                                                            var10 = var12 & 7L;
                                                            long var850;
                                                            int var683 = (var850 = var10 - 0L) == 0L ? 0 : (var850 < 0L ? -1 : 1);
                                                            if (var683 != 0) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                String var576 = var511.substring(var574, var620);
                                                                var4 -= 254032305;
                                                                var4 -= -428210498;
                                                                var4 ^= -144188299;
                                                                var4 ^= 2138436024;
                                                                var10 = Long.parseLong(var576);
                                                                var10 = var10;
                                                                var4 &= 958784046;
                                                                var4 ^= 410613111;
                                                                var577 = var620 + 1;
                                                            } catch (RuntimeException var50) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var50);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }
                                                            var4 = switch (var4) {
                                                                case -442931864 -> var4 ^ 649725562;
                                                                default -> var4 ^ -645451013;
                                                                case 425506163 -> {
                                                                    var4 |= -1639199162;
                                                                    yield var4 ^ 15807065;
                                                                }
                                                            };
                                                            Integer var624 = var4;
                                                            if (var624 == null) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var512 = var511.substring(var577);
                                                                var4 -= -819947488;
                                                                var4 &= 5310047;
                                                                var4 ^= 1354709984;
                                                            } catch (RuntimeException var49) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var49);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }

                                                            int var578 = var4 + 1;
                                                            int var579 = var4 * var578;
                                                            int var580 = var579 & 1;
                                                            if (var580 != 0) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var513 = var512;
                                                                var538 = var537;
                                                                var581 = -1;
                                                            } catch (RuntimeException var48) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var48);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }
                                                            var4 = switch (var4) {
                                                                case 1295886674 -> var4 ^ -1467520006;
                                                                case 1354711022 -> {
                                                                    var4 &= -531043262;
                                                                    var4 -= 509854926;
                                                                    var4 >>>= 6;
                                                                    var4 ^= 113846429;
                                                                    yield var4 ^ -1389021269;
                                                                }
                                                                default -> var4 ^ -1470688194;
                                                            };
                                                            var624 = var4;
                                                            if (var624 == null) {
                                                                break label1092;
                                                            }

                                                            label1052: {
                                                                label1171: {
                                                                    label1172: {
                                                                        label1173: {
                                                                            label1104: {
                                                                                try {
                                                                                    int var626 = var538.hashCode();
                                                                                    switch (var626) {
                                                                                        case -887493510:
                                                                                            break;
                                                                                        case 3387192:
                                                                                            break label1104;
                                                                                        case 106748362:
                                                                                            break label1172;
                                                                                        case 1029968466:
                                                                                            break label1173;
                                                                                        default:
                                                                                            break label1171;
                                                                                    }
                                                                                } catch (RuntimeException var68) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var68);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                var4 |= 1359551861;
                                                                                var4 -= -1677010138;
                                                                                var4 ^= -291851119;
                                                                                Integer var783 = var4;
                                                                                if (var783 == null) {
                                                                                    break label1092;
                                                                                }

                                                                                try {
                                                                                    var4 |= -1209634917;
                                                                                    var4 ^= -1629322860;
                                                                                    var4 ^= 619486194;
                                                                                } catch (RuntimeException var45) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var45);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                int var784 = var4 + 1;
                                                                                int var785 = var4 * var784;
                                                                                int var814 = var4 + 2;
                                                                                int var786 = var785 * var814;
                                                                                var814 = var4 + 3;
                                                                                int var787 = var786 * var814;
                                                                                int var788 = var787 & 7;
                                                                                if (var788 != 0) {
                                                                                    break label1092;
                                                                                }

                                                                                try {
                                                                                    var539 = var538.equals("synced");
                                                                                    var4 &= -961529746;
                                                                                    var4 *= -1402632267;
                                                                                    var4 ^= 632634514;
                                                                                } catch (RuntimeException var44) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var44);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                int var789 = var4 + 1;
                                                                                int var790 = var4 * var789;
                                                                                int var791 = var790 & 1;
                                                                                if (var791 != 0) {
                                                                                    break label1092;
                                                                                }

                                                                                label1105: {
                                                                                    try {
                                                                                        if (!var539) {
                                                                                            break label1105;
                                                                                        }
                                                                                    } catch (RuntimeException var67) {
                                                                                        var4 = LH;
                                                                                        var4 ^= 206329630;
                                                                                        var503 = p(var67);
                                                                                        switch (var4) {
                                                                                            case -1939221248:
                                                                                                break label1076;
                                                                                            case -1668699656:
                                                                                            default:
                                                                                                break label1077;
                                                                                            case 1380447960:
                                                                                                break label1167;
                                                                                        }
                                                                                    }

                                                                                    var4 -= -1894590244;
                                                                                    var4 ^= 939787533;
                                                                                    var12 = var4;
                                                                                    var14 = var12 + 1L;
                                                                                    var14 = var12 * var14;
                                                                                    long var846 = var12 + 2L;
                                                                                    var14 *= var846;
                                                                                    var12 += 3L;
                                                                                    var14 *= var12;
                                                                                    var12 = var14 & 7L;
                                                                                    long var851;
                                                                                    var7 = (var851 = var12 - 0L) == 0L ? 0 : (var851 < 0L ? -1 : 1);
                                                                                    if (var7 != 0) {
                                                                                        break label1092;
                                                                                    }

                                                                                    try {
                                                                                        var541 = 0;
                                                                                        var4 >>>= 9;
                                                                                        var4 -= 910537916;
                                                                                        var4 *= 407588445;
                                                                                        var4 >>>= 9;
                                                                                        var4 ^= 1840443986;
                                                                                    } catch (RuntimeException var39) {
                                                                                        var4 = LH;
                                                                                        var4 ^= 206329630;
                                                                                        var503 = p(var39);
                                                                                        switch (var4) {
                                                                                            case -1939221248:
                                                                                                break label1076;
                                                                                            case -1668699656:
                                                                                            default:
                                                                                                break label1077;
                                                                                            case 1380447960:
                                                                                                break label1167;
                                                                                        }
                                                                                    }

                                                                                    Integer var795 = var4;
                                                                                    if (var795 == null) {
                                                                                        break label1092;
                                                                                    }

                                                                                    var627 = var541;
                                                                                    var4 <<= 26;
                                                                                    var4 -= -557162259;
                                                                                    var4 ^= 1192882284;
                                                                                    break label1052;
                                                                                }

                                                                                var4 ^= -1822263705;
                                                                                var4 += -1562501310;
                                                                                var4 ^= -596429529;
                                                                                var7 = var4 + 1;
                                                                                var7 = var4 * var7;
                                                                                var7 &= 1;
                                                                                if (var7 != 0) {
                                                                                    break label1092;
                                                                                }

                                                                                var627 = var581;
                                                                                switch (var4) {
                                                                                    case -1455680801:
                                                                                    default:
                                                                                        var4 ^= 180491986;
                                                                                        break label1052;
                                                                                    case 944761868:
                                                                                        var4 ^= -995567713;
                                                                                        var4 &= -227097443;
                                                                                        var4 |= -57409633;
                                                                                        var4 |= 521885547;
                                                                                        var4 ^= 1574146176;
                                                                                        break label1052;
                                                                                    case 1791923156:
                                                                                        var4 ^= -510743683;
                                                                                        break label1052;
                                                                                }
                                                                            }

                                                                            var4 *= 638832751;
                                                                            var4 |= -1138949283;
                                                                            var4 &= -1341268944;
                                                                            var4 ^= 203435971;

                                                                            try {
                                                                                var4 |= -2025186274;
                                                                                var4 >>= 17;
                                                                                var4 *= -1012592283;
                                                                                var4 &= -1182262054;
                                                                                var4 ^= 1274506605;
                                                                            } catch (RuntimeException var43) {
                                                                                var4 = LH;
                                                                                var4 ^= 206329630;
                                                                                var503 = p(var43);
                                                                                switch (var4) {
                                                                                    case -1939221248:
                                                                                        break label1076;
                                                                                    case -1668699656:
                                                                                    default:
                                                                                        break label1077;
                                                                                    case 1380447960:
                                                                                        break label1167;
                                                                                }
                                                                            }

                                                                            var12 = var4;
                                                                            var14 = var12 + 1L;
                                                                            var14 = var12 * var14;
                                                                            var12 = var14 & 1L;
                                                                            long var852;
                                                                            int var771 = (var852 = var12 - 0L) == 0L ? 0 : (var852 < 0L ? -1 : 1);
                                                                            if (var771 != 0) {
                                                                                break label1092;
                                                                            }

                                                                            label1106: {
                                                                                try {
                                                                                    boolean var772 = var538.equals("none");
                                                                                    var4 |= 1600114990;
                                                                                    var4 |= 1544693926;
                                                                                    var4 >>>= 21;
                                                                                    var4 |= -581752000;
                                                                                    var4 ^= -575299053;
                                                                                    if (!var772) {
                                                                                        break label1106;
                                                                                    }
                                                                                } catch (RuntimeException var66) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var66);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                var4 *= -546626653;
                                                                                var4 &= -606329017;
                                                                                var4 += 1285416608;
                                                                                var4 ^= -1165421495;
                                                                                int var773 = var4 + 1;
                                                                                int var774 = var4 * var773;
                                                                                int var811 = var4 + 2;
                                                                                int var775 = var774 * var811;
                                                                                var811 = var4 + 3;
                                                                                int var776 = var775 * var811;
                                                                                int var777 = var776 & 7;
                                                                                if (var777 != 0) {
                                                                                    break label1092;
                                                                                }

                                                                                try {
                                                                                    var778 = 3;
                                                                                    var4 -= 377835992;
                                                                                    var4 <<= 27;
                                                                                    var4 -= 248429016;
                                                                                    var4 |= -1019766813;
                                                                                    var4 ^= -103785749;
                                                                                } catch (RuntimeException var40) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var40);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                Integer var813 = var4;
                                                                                if (var813 == null) {
                                                                                    break label1092;
                                                                                }

                                                                                var627 = var778;
                                                                                var4 ^= -1832495243;
                                                                                var4 *= 1871147767;
                                                                                var4 ^= -1333227620;
                                                                                break label1052;
                                                                            }
                                                                            var4 = switch (var4) {
                                                                                default -> var4 ^ -1401371202;
                                                                                case 15109608 -> {
                                                                                    var4 &= 1626195353;
                                                                                    var4 |= 1968502111;
                                                                                    var4 -= -1904844217;
                                                                                    yield var4 ^ -1623600881;
                                                                                }
                                                                                case 866868278 -> var4 ^ 442761665;
                                                                            };
                                                                            var12 = var4;
                                                                            var14 = var12 + 1L;
                                                                            var14 = var12 * var14;
                                                                            long var845 = var12 + 2L;
                                                                            var14 *= var845;
                                                                            var12 += 3L;
                                                                            var14 *= var12;
                                                                            var12 = var14 & 7L;
                                                                            long var853;
                                                                            int var782 = (var853 = var12 - 0L) == 0L ? 0 : (var853 < 0L ? -1 : 1);
                                                                            if (var782 != 0) {
                                                                                break label1092;
                                                                            }

                                                                            var627 = var581;
                                                                            switch (var4) {
                                                                                case -1055915545:
                                                                                default:
                                                                                    var4 ^= -1302014263;
                                                                                    break label1052;
                                                                                case -5210377:
                                                                                    var4 ^= -1939310569;
                                                                                    break label1052;
                                                                                case 2017936023:
                                                                                    var4 &= 342605088;
                                                                                    var4 *= 1474140857;
                                                                                    var4 &= -1463592840;
                                                                                    var4 ^= -1435537537;
                                                                                    break label1052;
                                                                            }
                                                                        }
                                                                        var4 = switch (var4) {
                                                                            case -1418015061 -> {
                                                                                var4 &= -1321489618;
                                                                                var4 |= -1548119404;
                                                                                var4 ^= -336245942;
                                                                                var4 += -1593573061;
                                                                                yield var4 ^ 1031946591;
                                                                            }
                                                                            default -> var4 ^ 1031315010;
                                                                            case -187318230 -> var4 ^ -486212141;
                                                                        };

                                                                        try {
                                                                            var4 *= 317553819;
                                                                            var4 |= 1794486018;
                                                                            var4 += 1360627998;
                                                                            var4 ^= -2079650234;
                                                                        } catch (RuntimeException var42) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var42);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }

                                                                        int var628 = var4 + 1;
                                                                        var628 = var4 * var628;
                                                                        var628 &= 1;
                                                                        if (var628 != 0) {
                                                                            break label1092;
                                                                        }

                                                                        label1174: {
                                                                            try {
                                                                                boolean var631 = var538.equals("instrumental");
                                                                                var4 *= -2000548957;
                                                                                var4 |= 269046970;
                                                                                var4 -= 1513555123;
                                                                                var4 -= 376544269;
                                                                                var4 ^= -275944563;
                                                                                if (!var631) {
                                                                                    break label1174;
                                                                                }
                                                                            } catch (RuntimeException var65) {
                                                                                var4 = LH;
                                                                                var4 ^= 206329630;
                                                                                var503 = p(var65);
                                                                                switch (var4) {
                                                                                    case -1939221248:
                                                                                        break label1076;
                                                                                    case -1668699656:
                                                                                    default:
                                                                                        break label1077;
                                                                                    case 1380447960:
                                                                                        break label1167;
                                                                                }
                                                                            }
                                                                            var4 = switch (var4) {
                                                                                case -1363428169 -> {
                                                                                    var4 -= -729940348;
                                                                                    var4 *= -608920777;
                                                                                    yield var4 ^ -1565651408;
                                                                                }
                                                                                case -554907692 -> var4 ^ 1263204415;
                                                                                default -> var4 ^ -247913458;
                                                                            };
                                                                            Integer var632 = var4;
                                                                            if (var632 == null) {
                                                                                break label1092;
                                                                            }

                                                                            try {
                                                                                var633 = 2;
                                                                            } catch (RuntimeException var41) {
                                                                                var4 = LH;
                                                                                var4 ^= 206329630;
                                                                                var503 = p(var41);
                                                                                switch (var4) {
                                                                                    case -1939221248:
                                                                                        break label1076;
                                                                                    case -1668699656:
                                                                                    default:
                                                                                        break label1077;
                                                                                    case 1380447960:
                                                                                        break label1167;
                                                                                }
                                                                            }
                                                                            var4 = switch (var4) {
                                                                                case 4489226 -> var4 ^ 1305400650;
                                                                                case 15119301 -> {
                                                                                    var4 -= -1506453704;
                                                                                    yield var4 ^ -2138118995;
                                                                                }
                                                                                default -> var4 ^ 1057399334;
                                                                            };
                                                                            var12 = var4;
                                                                            var14 = var12 + 1L;
                                                                            var14 = var12 * var14;
                                                                            var12 = var14 & 1L;
                                                                            long var854;
                                                                            int var753 = (var854 = var12 - 0L) == 0L ? 0 : (var854 < 0L ? -1 : 1);
                                                                            if (var753 != 0) {
                                                                                break label1092;
                                                                            }

                                                                            var627 = var633;
                                                                            var4 >>>= 3;
                                                                            var4 &= -200565738;
                                                                            var4 |= 2050634240;
                                                                            var4 ^= -669525637;
                                                                            break label1052;
                                                                        }
                                                                        var4 = switch (var4) {
                                                                            case -1363428169 -> {
                                                                                var4 &= -844798886;
                                                                                yield var4 ^ 198615943;
                                                                            }
                                                                            case 421331297 -> var4 ^ -1434773031;
                                                                            default -> var4 ^ 716962494;
                                                                        };
                                                                        Integer var754 = var4;
                                                                        if (var754 == null) {
                                                                            break label1092;
                                                                        }

                                                                        var627 = var581;
                                                                        var4 ^= -643392064;
                                                                        var4 += -1920419225;
                                                                        var4 -= -1699399824;
                                                                        var4 ^= -209128909;
                                                                        break label1052;
                                                                    }

                                                                    var4 ^= -1075400336;
                                                                    var4 ^= 347233969;
                                                                    var12 = var4;
                                                                    var14 = var12 + 1L;
                                                                    var14 = var12 * var14;
                                                                    var12 = var14 & 1L;
                                                                    long var855;
                                                                    int var757 = (var855 = var12 - 0L) == 0L ? 0 : (var855 < 0L ? -1 : 1);
                                                                    if (var757 != 0) {
                                                                        break label1092;
                                                                    }
                                                                    var4 = switch (var4) {
                                                                        default -> var4 ^ -675103153;
                                                                        case 3023210 -> {
                                                                            var4 >>>= 16;
                                                                            yield var4 ^ -300925444;
                                                                        }
                                                                        case 1785762638 -> var4 ^ 609230460;
                                                                    };
                                                                    Integer var758 = var4;
                                                                    if (var758 == null) {
                                                                        break label1092;
                                                                    }

                                                                    try {
                                                                        var759 = var538.equals("plain");
                                                                        var4 ^= 1503959526;
                                                                        var4 &= 742526215;
                                                                        var4 ^= -768304348;
                                                                        var4 ^= 1284947388;
                                                                    } catch (RuntimeException var47) {
                                                                        var4 = LH;
                                                                        var4 ^= 206329630;
                                                                        var503 = p(var47);
                                                                        switch (var4) {
                                                                            case -1939221248:
                                                                                break label1076;
                                                                            case -1668699656:
                                                                            default:
                                                                                break label1077;
                                                                            case 1380447960:
                                                                                break label1167;
                                                                        }
                                                                    }

                                                                    Integer var13 = var4;
                                                                    if (var13 == null) {
                                                                        break label1092;
                                                                    }

                                                                    label1108: {
                                                                        try {
                                                                            if (!var759) {
                                                                                break label1108;
                                                                            }
                                                                        } catch (RuntimeException var64) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var64);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }

                                                                        var4 |= -456485701;
                                                                        var4 *= -671163467;
                                                                        var4 -= -1506453664;
                                                                        var4 <<= 18;
                                                                        var4 ^= 936567064;
                                                                        var12 = var4;
                                                                        var14 = var12 + 1L;
                                                                        var14 = var12 * var14;
                                                                        long var16 = var12 + 2L;
                                                                        var14 *= var16;
                                                                        var12 += 3L;
                                                                        var14 *= var12;
                                                                        var12 = var14 & 7L;
                                                                        long var856;
                                                                        int var763 = (var856 = var12 - 0L) == 0L ? 0 : (var856 < 0L ? -1 : 1);
                                                                        if (var763 != 0) {
                                                                            break label1092;
                                                                        }

                                                                        try {
                                                                            var764 = 1;
                                                                            var4 &= 1190780195;
                                                                            var4 ^= -1198420250;
                                                                            var4 ^= -161321777;
                                                                        } catch (RuntimeException var46) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var46);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }

                                                                        var627 = var764;
                                                                        var4 += -2143535682;
                                                                        var4 *= 1422268153;
                                                                        var4 += 329669342;
                                                                        var4 ^= -1833100558;
                                                                        break label1052;
                                                                    }

                                                                    var4 *= -269133581;
                                                                    var4 ^= -884884663;
                                                                    var4 -= -1172596620;
                                                                    var4 ^= 1911996003;
                                                                    var12 = var4;
                                                                    var14 = var12 + 1L;
                                                                    var14 = var12 * var14;
                                                                    long var844 = var12 + 2L;
                                                                    var14 *= var844;
                                                                    var12 += 3L;
                                                                    var14 *= var12;
                                                                    var12 = var14 & 7L;
                                                                    long var857;
                                                                    int var768 = (var857 = var12 - 0L) == 0L ? 0 : (var857 < 0L ? -1 : 1);
                                                                    if (var768 != 0) {
                                                                        break label1092;
                                                                    }

                                                                    var627 = var581;
                                                                    var4 ^= -14052327;
                                                                    var4 -= 548320400;
                                                                    var4 ^= -1105321604;
                                                                    break label1052;
                                                                }

                                                                var4 >>= 29;
                                                                var4 *= -810012659;
                                                                var4 |= -1163409140;
                                                                var4 ^= -654935285;
                                                                var627 = var581;
                                                                var4 *= -2010346935;
                                                                var4 >>>= 8;
                                                                var4 |= -884683928;
                                                                var4 ^= 1769574546;
                                                            }

                                                            label1175: {
                                                                label1176: {
                                                                    label1111: {
                                                                        label1177: {
                                                                            try {
                                                                                switch (var627) {
                                                                                    case 0:
                                                                                        break label1111;
                                                                                    case 1:
                                                                                        break label1176;
                                                                                    case 2:
                                                                                        break label1175;
                                                                                    case 3:
                                                                                        break;
                                                                                    default:
                                                                                        break label1177;
                                                                                }
                                                                            } catch (RuntimeException var63) {
                                                                                var4 = LH;
                                                                                var4 ^= 206329630;
                                                                                var503 = p(var63);
                                                                                switch (var4) {
                                                                                    case -1939221248:
                                                                                        break label1076;
                                                                                    case -1668699656:
                                                                                    default:
                                                                                        break label1077;
                                                                                    case 1380447960:
                                                                                        break label1167;
                                                                                }
                                                                            }
                                                                            var4 = switch (var4) {
                                                                                case -1574146177 -> {
                                                                                    var4 -= -325416045;
                                                                                    var4 |= -1952466064;
                                                                                    var4 |= -1674179244;
                                                                                    yield var4 ^ -937198023;
                                                                                }
                                                                                default -> var4 ^ 2069197411;
                                                                                case 1052357848 -> var4 ^ -810368527;
                                                                            };
                                                                            var7 = var4 + 1;
                                                                            var7 = var4 * var7;
                                                                            int var582 = var4 + 2;
                                                                            var7 *= var582;
                                                                            int var583 = var4 + 3;
                                                                            var7 *= var583;
                                                                            var7 &= 7;
                                                                            if (var7 != 0) {
                                                                                break label1092;
                                                                            }

                                                                            try {
                                                                                var4 |= -1179816678;
                                                                                var4 *= -1774101789;
                                                                                var4 ^= -232236794;
                                                                            } catch (RuntimeException var38) {
                                                                                var4 = LH;
                                                                                var4 ^= 206329630;
                                                                                var503 = p(var38);
                                                                                switch (var4) {
                                                                                    case -1939221248:
                                                                                        break label1076;
                                                                                    case -1668699656:
                                                                                    default:
                                                                                        break label1077;
                                                                                    case 1380447960:
                                                                                        break label1167;
                                                                                }
                                                                            }

                                                                            var7 = var4 + 1;
                                                                            var7 = var4 * var7;
                                                                            var7 &= 1;
                                                                            if (var7 != 0) {
                                                                                break label1092;
                                                                            }

                                                                            try {
                                                                                var554 = this.ga;
                                                                                var4 |= 657181678;
                                                                                var4 |= -1712346635;
                                                                                var4 += 295270662;
                                                                                var4 ^= -345706576;
                                                                            } catch (RuntimeException var37) {
                                                                                var4 = LH;
                                                                                var4 ^= 206329630;
                                                                                var503 = p(var37);
                                                                                switch (var4) {
                                                                                    case -1939221248:
                                                                                        break label1076;
                                                                                    case -1668699656:
                                                                                    default:
                                                                                        break label1077;
                                                                                    case 1380447960:
                                                                                        break label1167;
                                                                                }
                                                                            }

                                                                            int var584 = var4 + 1;
                                                                            int var585 = var4 * var584;
                                                                            int var586 = var585 & 1;
                                                                            if (var586 != 0) {
                                                                                break label1092;
                                                                            }

                                                                            try {
                                                                                long var555 = var554.getAsLong();
                                                                                var556 = var555 - var10;
                                                                            } catch (RuntimeException var36) {
                                                                                var4 = LH;
                                                                                var4 ^= 206329630;
                                                                                var503 = p(var36);
                                                                                switch (var4) {
                                                                                    case -1939221248:
                                                                                        break label1076;
                                                                                    case -1668699656:
                                                                                    default:
                                                                                        break label1077;
                                                                                    case 1380447960:
                                                                                        break label1167;
                                                                                }
                                                                            }
                                                                            var4 = switch (var4) {
                                                                                default -> var4 ^ 2013557281;
                                                                                case -85095755 -> {
                                                                                    var4 += 230477434;
                                                                                    var4 >>= 27;
                                                                                    var4 *= -2135550669;
                                                                                    yield var4 ^ 997924996;
                                                                                }
                                                                                case 172953392 -> var4 ^ 1006545822;
                                                                            };
                                                                            long var634 = var4;
                                                                            var11 = var634 + 1L;
                                                                            var11 = var634 * var11;
                                                                            long var635 = var11 & 1L;
                                                                            long var858;
                                                                            int var636 = (var858 = var635 - 0L) == 0L ? 0 : (var858 < 0L ? -1 : 1);
                                                                            if (var636 != 0) {
                                                                                break label1092;
                                                                            }

                                                                            label1113: {
                                                                                try {
                                                                                    long var859;
                                                                                    var7 = (var859 = var556 - 259200000L) == 0L ? 0 : (var859 < 0L ? -1 : 1);
                                                                                    if (var7 >= 0) {
                                                                                        break label1113;
                                                                                    }
                                                                                } catch (RuntimeException var62) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var62);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                var4 |= 429762247;
                                                                                var4 |= -1783328221;
                                                                                var4 &= -288385363;
                                                                                var4 ^= 1255814897;
                                                                                var7 = var4 + 1;
                                                                                var7 = var4 * var7;
                                                                                var7 &= 1;
                                                                                if (var7 != 0) {
                                                                                    break label1092;
                                                                                }

                                                                                try {
                                                                                    var561 = null;
                                                                                    var4 >>= 25;
                                                                                    var4 -= 783565102;
                                                                                    var4 |= 1832732396;
                                                                                    var4 ^= -1457022591;
                                                                                    var587 = BA.MISSING;
                                                                                    var4 ^= -785421094;
                                                                                    var4 *= 1683067437;
                                                                                    var4 ^= -859926694;
                                                                                } catch (RuntimeException var19) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var19);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                Integer var637 = var4;
                                                                                if (var637 == null) {
                                                                                    break label1092;
                                                                                }

                                                                                try {
                                                                                    var561 = new be_2(var2, var587, null);
                                                                                    var4 += -2001233789;
                                                                                    var4 ^= 1040399445;
                                                                                } catch (RuntimeException var18) {
                                                                                    var4 = LH;
                                                                                    var4 ^= 206329630;
                                                                                    var503 = p(var18);
                                                                                    switch (var4) {
                                                                                        case -1939221248:
                                                                                            break label1076;
                                                                                        case -1668699656:
                                                                                        default:
                                                                                            break label1077;
                                                                                        case 1380447960:
                                                                                            break label1167;
                                                                                    }
                                                                                }

                                                                                int var588 = var4 + 1;
                                                                                int var589 = var4 * var588;
                                                                                int var590 = var589 & 1;
                                                                                if (var590 != 0) {
                                                                                    break label1092;
                                                                                }

                                                                                var545 = var561;
                                                                                var4 >>>= 17;
                                                                                var4 &= 908771090;
                                                                                var4 ^= -1626038699;
                                                                                break label1079;
                                                                            }
                                                                            var4 = switch (var4) {
                                                                                default -> var4 ^ 979210267;
                                                                                case -1144179273 -> {
                                                                                    var4 |= -1751809784;
                                                                                    var4 |= 738848049;
                                                                                    var4 *= -737505035;
                                                                                    yield var4 ^ 634048451;
                                                                                }
                                                                                case 1751770997 -> var4 ^ -443229720;
                                                                            };
                                                                            var8 = var4;
                                                                            var10 = var8 + 1L;
                                                                            var10 = var8 * var10;
                                                                            var8 = var10 & 1L;
                                                                            long var860;
                                                                            int var593 = (var860 = var8 - 0L) == 0L ? 0 : (var860 < 0L ? -1 : 1);
                                                                            if (var593 != 0) {
                                                                                break label1092;
                                                                            }
                                                                            var4 = switch (var4) {
                                                                                case -1234204664 -> {
                                                                                    var4 ^= 1191187500;
                                                                                    yield var4 ^ 924478681;
                                                                                }
                                                                                case 90399635 -> var4 ^ -1495484226;
                                                                                default -> var4 ^ 1221722583;
                                                                            };
                                                                            Integer var594 = var4;
                                                                            if (var594 == null) {
                                                                                break label1092;
                                                                            }

                                                                            var545 = null;
                                                                            var4 -= 1216169709;
                                                                            var4 <<= 14;
                                                                            var4 += -1953018100;
                                                                            var4 ^= 688908619;
                                                                            break label1079;
                                                                        }

                                                                        var4 -= 1341828470;
                                                                        var4 >>= 11;
                                                                        var4 |= -649683343;
                                                                        var4 &= 1171861482;
                                                                        var4 ^= 1115737629;

                                                                        try {
                                                                            var4 *= 1603319055;
                                                                            var4 ^= -1703671551;
                                                                            var4 ^= -559503418;
                                                                            var4 >>= 1;
                                                                            var4 ^= 2021854539;
                                                                        } catch (RuntimeException var34) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var34);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }

                                                                        var545 = null;
                                                                        var4 += -224266042;
                                                                        var4 -= -579918826;
                                                                        var4 |= 2036559296;
                                                                        var4 ^= 1652545970;
                                                                        break label1079;
                                                                    }
                                                                    var4 = switch (var4) {
                                                                        case -1574146177 -> {
                                                                            var4 >>= 16;
                                                                            yield var4 ^ -70026906;
                                                                        }
                                                                        case -1176185372 -> var4 ^ 1933532893;
                                                                        default -> var4 ^ -204772065;
                                                                    } * 392698937;
                                                                    var4 ^= -1526521656;

                                                                    try {
                                                                        var514 = tJ.l(var513);
                                                                        var4 |= 170959193;
                                                                        var4 ^= -1144007654;
                                                                    } catch (RuntimeException var33) {
                                                                        var4 = LH;
                                                                        var4 ^= 206329630;
                                                                        var503 = p(var33);
                                                                        switch (var4) {
                                                                            case -1939221248:
                                                                                break label1076;
                                                                            case -1668699656:
                                                                            default:
                                                                                break label1077;
                                                                            case 1380447960:
                                                                                break label1167;
                                                                        }
                                                                    }

                                                                    int var605 = var4 + 1;
                                                                    int var606 = var4 * var605;
                                                                    int var654 = var4 + 2;
                                                                    int var607 = var606 * var654;
                                                                    var654 = var4 + 3;
                                                                    int var608 = var607 * var654;
                                                                    int var609 = var608 & 7;
                                                                    if (var609 != 0) {
                                                                        break label1092;
                                                                    }

                                                                    label1178: {
                                                                        try {
                                                                            var515 = (Za)var514;
                                                                            if (var514 == null) {
                                                                                break label1178;
                                                                            }
                                                                        } catch (RuntimeException var32) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var32);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }

                                                                        var4 += 1589291633;
                                                                        var4 >>= 23;
                                                                        var4 -= -296995454;
                                                                        var4 &= -1617527715;
                                                                        var4 ^= -1498348410;

                                                                        try {
                                                                            var610 = null;
                                                                        } catch (RuntimeException var31) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var31);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }
                                                                        var4 = switch (var4) {
                                                                            case -2103188499 -> var4 ^ -607344101;
                                                                            default -> var4 ^ -1220318546;
                                                                            case -1222423357 -> {
                                                                                var4 <<= 22;
                                                                                yield var4 ^ 704357928;
                                                                            }
                                                                        };
                                                                        long var656 = var4;
                                                                        var11 = var656 + 1L;
                                                                        var11 = var656 * var11;
                                                                        long var818 = var656 + 2L;
                                                                        var11 *= var818;
                                                                        long var657 = var656 + 3L;
                                                                        var11 *= var657;
                                                                        long var658 = var11 & 7L;
                                                                        long var861;
                                                                        var654 = (var861 = var658 - 0L) == 0L ? 0 : (var861 < 0L ? -1 : 1);
                                                                        if (var654 != 0) {
                                                                            break label1092;
                                                                        }

                                                                        try {
                                                                            var660 = BA.FOUND;
                                                                        } catch (RuntimeException var30) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var30);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }
                                                                        var4 = switch (var4) {
                                                                            case -454578066 -> var4 ^ -424881646;
                                                                            case 423339560 -> {
                                                                                var4 |= 1785135908;
                                                                                var4 <<= 3;
                                                                                var4 &= 2133244004;
                                                                                yield var4 ^ -812193579;
                                                                            }
                                                                            default -> var4 ^ 576766998;
                                                                        };
                                                                        var10 = var4;
                                                                        var12 = var10 + 1L;
                                                                        var12 = var10 * var12;
                                                                        var10 = var12 & 1L;
                                                                        long var862;
                                                                        int var712 = (var862 = var10 - 0L) == 0L ? 0 : (var862 < 0L ? -1 : 1);
                                                                        if (var712 != 0) {
                                                                            break label1092;
                                                                        }

                                                                        try {
                                                                            var610 = new be_2(var2, var660, var515);
                                                                            var4 <<= 14;
                                                                            var4 += 917899958;
                                                                            var4 *= -677607209;
                                                                            var4 ^= 1342530210;
                                                                        } catch (RuntimeException var29) {
                                                                            var4 = LH;
                                                                            var4 ^= 206329630;
                                                                            var503 = p(var29);
                                                                            switch (var4) {
                                                                                case -1939221248:
                                                                                    break label1076;
                                                                                case -1668699656:
                                                                                default:
                                                                                    break label1077;
                                                                                case 1380447960:
                                                                                    break label1167;
                                                                            }
                                                                        }

                                                                        int var516 = var4 + 1;
                                                                        int var517 = var4 * var516;
                                                                        var654 = var4 + 2;
                                                                        int var518 = var517 * var654;
                                                                        var654 = var4 + 3;
                                                                        int var519 = var518 * var654;
                                                                        int var520 = var519 & 7;
                                                                        if (var520 != 0) {
                                                                            break label1092;
                                                                        }

                                                                        var545 = var610;
                                                                        var4 >>= 24;
                                                                        var4 ^= -1626036622;
                                                                        break label1079;
                                                                    }
                                                                    var4 = switch (var4) {
                                                                        default -> var4 ^ 394202885;
                                                                        case -2064367647 -> {
                                                                            var4 *= -1520499343;
                                                                            var4 *= 403414953;
                                                                            var4 ^= -706647929;
                                                                            yield var4 ^ -82627025;
                                                                        }
                                                                        case 1979631340 -> var4 ^ 421072915;
                                                                    };

                                                                    try {
                                                                        var4 += -1430161007;
                                                                        var4 *= -1706070617;
                                                                        var4 <<= 17;
                                                                        var4 &= -1837679585;
                                                                        var4 ^= -1739212110;
                                                                    } catch (RuntimeException var28) {
                                                                        var4 = LH;
                                                                        var4 ^= 206329630;
                                                                        var503 = p(var28);
                                                                        switch (var4) {
                                                                            case -1939221248:
                                                                                break label1076;
                                                                            case -1668699656:
                                                                            default:
                                                                                break label1077;
                                                                            case 1380447960:
                                                                                break label1167;
                                                                        }
                                                                    }

                                                                    Integer var611 = var4;
                                                                    if (var611 == null) {
                                                                        break label1092;
                                                                    }

                                                                    var545 = null;
                                                                    var4 *= -16566781;
                                                                    var4 <<= 13;
                                                                    var4 ^= 144074311;
                                                                    break label1079;
                                                                }

                                                                var4 -= 1605756142;
                                                                var4 *= -1101176003;
                                                                var4 >>= 19;
                                                                var4 ^= -306181293;
                                                                var8 = var4;
                                                                var10 = var8 + 1L;
                                                                var10 = var8 * var10;
                                                                var12 = var8 + 2L;
                                                                var10 *= var12;
                                                                var8 += 3L;
                                                                var10 *= var8;
                                                                var8 = var10 & 7L;
                                                                long var863;
                                                                int var603 = (var863 = var8 - 0L) == 0L ? 0 : (var863 < 0L ? -1 : 1);
                                                                if (var603 != 0) {
                                                                    break label1092;
                                                                }

                                                                try {
                                                                    var604 = null;
                                                                    var4 *= 1081020109;
                                                                    var4 += 2126537188;
                                                                    var4 ^= 590500820;
                                                                } catch (RuntimeException var27) {
                                                                    var4 = LH;
                                                                    var4 ^= 206329630;
                                                                    var503 = p(var27);
                                                                    switch (var4) {
                                                                        case -1939221248:
                                                                            break label1076;
                                                                        case -1668699656:
                                                                        default:
                                                                            break label1077;
                                                                        case 1380447960:
                                                                            break label1167;
                                                                    }
                                                                }

                                                                long var645 = var4;
                                                                var11 = var645 + 1L;
                                                                var11 = var645 * var11;
                                                                long var646 = var11 & 1L;
                                                                long var864;
                                                                int var647 = (var864 = var646 - 0L) == 0L ? 0 : (var864 < 0L ? -1 : 1);
                                                                if (var647 != 0) {
                                                                    break label1092;
                                                                }

                                                                try {
                                                                    var648 = BA.FOUND;
                                                                    var4 ^= -31307969;
                                                                    var4 ^= 369808484;
                                                                    var4 *= 178554605;
                                                                    var4 ^= -694821754;
                                                                } catch (RuntimeException var26) {
                                                                    var4 = LH;
                                                                    var4 ^= 206329630;
                                                                    var503 = p(var26);
                                                                    switch (var4) {
                                                                        case -1939221248:
                                                                            break label1076;
                                                                        case -1668699656:
                                                                        default:
                                                                            break label1077;
                                                                        case 1380447960:
                                                                            break label1167;
                                                                    }
                                                                }

                                                                var10 = var4;
                                                                var12 = var10 + 1L;
                                                                var12 = var10 * var12;
                                                                var14 = var10 + 2L;
                                                                var12 *= var14;
                                                                var10 += 3L;
                                                                var12 *= var10;
                                                                var10 = var12 & 7L;
                                                                long var865;
                                                                int var706 = (var865 = var10 - 0L) == 0L ? 0 : (var865 < 0L ? -1 : 1);
                                                                if (var706 != 0) {
                                                                    break label1092;
                                                                }

                                                                try {
                                                                    var707 = Za.F(var513);
                                                                } catch (RuntimeException var25) {
                                                                    var4 = LH;
                                                                    var4 ^= 206329630;
                                                                    var503 = p(var25);
                                                                    switch (var4) {
                                                                        case -1939221248:
                                                                            break label1076;
                                                                        case -1668699656:
                                                                        default:
                                                                            break label1077;
                                                                        case 1380447960:
                                                                            break label1167;
                                                                    }
                                                                }
                                                                var4 = switch (var4) {
                                                                    default -> var4 ^ -1568805946;
                                                                    case -767039758 -> {
                                                                        var4 >>>= 15;
                                                                        var4 >>>= 28;
                                                                        yield var4 ^ 141583703;
                                                                    }
                                                                    case 2020311311 -> var4 ^ 1716501545;
                                                                };
                                                                var11 = var4;
                                                                long var816 = var11 + 1L;
                                                                var816 = var11 * var816;
                                                                var11 = var816 & 1L;
                                                                long var866;
                                                                int var737 = (var866 = var11 - 0L) == 0L ? 0 : (var866 < 0L ? -1 : 1);
                                                                if (var737 != 0) {
                                                                    break label1092;
                                                                }

                                                                try {
                                                                    var604 = new be_2(var2, var648, var707);
                                                                    var4 -= -1849268194;
                                                                    var4 ^= 1934869924;
                                                                } catch (RuntimeException var24) {
                                                                    var4 = LH;
                                                                    var4 ^= 206329630;
                                                                    var503 = p(var24);
                                                                    switch (var4) {
                                                                        case -1939221248:
                                                                            break label1076;
                                                                        case -1668699656:
                                                                        default:
                                                                            break label1077;
                                                                        case 1380447960:
                                                                            break label1167;
                                                                    }
                                                                }

                                                                var647 = var4 + 1;
                                                                var647 = var4 * var647;
                                                                int var708 = var4 + 2;
                                                                var647 *= var708;
                                                                int var709 = var4 + 3;
                                                                var647 *= var709;
                                                                var647 &= 7;
                                                                if (var647 != 0) {
                                                                    break label1092;
                                                                }

                                                                var545 = var604;
                                                                var4 &= -1636875122;
                                                                var4 -= 137020711;
                                                                var4 >>= 15;
                                                                var4 ^= 1626037817;
                                                                break label1079;
                                                            }
                                                            var4 = switch (var4) {
                                                                case -1574146177 -> {
                                                                    var4 ^= 495591600;
                                                                    var4 >>= 9;
                                                                    var4 |= -86661534;
                                                                    yield var4 ^ 889652725;
                                                                }
                                                                default -> var4 ^ -1018149603;
                                                                case -236738322 -> var4 ^ 1186872800;
                                                            };
                                                            var8 = var4;
                                                            var10 = var8 + 1L;
                                                            var10 = var8 * var10;
                                                            var12 = var8 + 2L;
                                                            var10 *= var12;
                                                            var8 += 3L;
                                                            var10 *= var8;
                                                            var8 = var10 & 7L;
                                                            long var867;
                                                            int var598 = (var867 = var8 - 0L) == 0L ? 0 : (var867 < 0L ? -1 : 1);
                                                            if (var598 != 0) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var599 = null;
                                                                var4 ^= -1358353645;
                                                                var4 += -1285261963;
                                                                var4 += -474717981;
                                                                var4 &= 860862316;
                                                                var4 ^= -1262763691;
                                                            } catch (RuntimeException var23) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var23);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }

                                                            int var638 = var4 + 1;
                                                            var638 = var4 * var638;
                                                            int var692 = var4 + 2;
                                                            var638 *= var692;
                                                            int var693 = var4 + 3;
                                                            var638 *= var693;
                                                            var638 &= 7;
                                                            if (var638 != 0) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var643 = BA.FOUND;
                                                                var4 &= -1406820289;
                                                                var4 -= 1522340427;
                                                                var4 ^= 1941205688;
                                                            } catch (RuntimeException var22) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var22);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }

                                                            var10 = var4;
                                                            var12 = var10 + 1L;
                                                            var12 = var10 * var12;
                                                            var14 = var10 + 2L;
                                                            var12 *= var14;
                                                            var10 += 3L;
                                                            var12 *= var10;
                                                            var10 = var12 & 7L;
                                                            long var868;
                                                            int var697 = (var868 = var10 - 0L) == 0L ? 0 : (var868 < 0L ? -1 : 1);
                                                            if (var697 != 0) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var698 = Za.FQ;
                                                            } catch (RuntimeException var21) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var21);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }
                                                            var4 = switch (var4) {
                                                                default -> var4 ^ 1387689055;
                                                                case 1397642099 -> var4 ^ 288276884;
                                                                case 1523613546 -> {
                                                                    var4 += 426632581;
                                                                    var4 >>>= 17;
                                                                    var4 &= 1837155574;
                                                                    var4 |= -271613096;
                                                                    yield var4 ^ -1727751722;
                                                                }
                                                            };
                                                            int var728 = var4 + 1;
                                                            int var729 = var4 * var728;
                                                            int var801 = var4 + 2;
                                                            int var730 = var729 * var801;
                                                            int var802 = var4 + 3;
                                                            int var731 = var730 * var802;
                                                            int var732 = var731 & 7;
                                                            if (var732 != 0) {
                                                                break label1092;
                                                            }

                                                            try {
                                                                var599 = new be_2(var2, var643, var698);
                                                            } catch (RuntimeException var20) {
                                                                var4 = LH;
                                                                var4 ^= 206329630;
                                                                var503 = p(var20);
                                                                switch (var4) {
                                                                    case -1939221248:
                                                                        break label1076;
                                                                    case -1668699656:
                                                                    default:
                                                                        break label1077;
                                                                    case 1380447960:
                                                                        break label1167;
                                                                }
                                                            }
                                                            var4 = switch (var4) {
                                                                case -925982997 -> var4 ^ 1585397105;
                                                                default -> var4 ^ 98421256;
                                                                case 1993022088 -> {
                                                                    var4 &= 1802512057;
                                                                    yield var4 ^ 1564374127;
                                                                }
                                                            };
                                                            Integer var644 = var4;
                                                            if (var644 == null) {
                                                                break label1092;
                                                            }

                                                            var545 = var599;
                                                            var4 >>>= 24;
                                                            var4 ^= -1626036616;
                                                            break label1079;
                                                        }

                                                        var4 &= -323178137;
                                                        var4 &= -134974121;
                                                        var4 |= -494820195;
                                                        var4 ^= -1881644552;
                                                        break label1073;
                                                    }

                                                    var4 |= -1256174517;
                                                    var4 ^= -32624408;
                                                    var4 ^= 1849367362;
                                                    break label1073;
                                                }

                                                var4 &= -682539174;
                                                var4 ^= -1475504595;
                                                break label1073;
                                            }

                                            var4 |= 39848406;
                                            var4 >>= 12;
                                            var4 += -1387503772;
                                            var4 ^= -1336645763;
                                            var4 ^= 1884994958;
                                        }

                                        try {
                                            var4 -= -1856477541;
                                            var4 *= -1754148661;
                                            var4 &= 1457773552;
                                            var4 ^= -11581564;
                                            var4 ^= 628804785;
                                        } catch (RuntimeException var35) {
                                            var4 = LH;
                                            var4 ^= 206329630;
                                            var503 = p(var35);
                                            switch (var4) {
                                                case -1939221248:
                                                    break label1076;
                                                case -1668699656:
                                                default:
                                                    break label1077;
                                                case 1380447960:
                                                    break label1167;
                                            }
                                        }

                                        long var494 = var4;
                                        long var567 = var494 + 1L;
                                        long var568 = var494 * var567;
                                        long var663 = var494 + 2L;
                                        long var569 = var568 * var663;
                                        long var495 = var494 + 3L;
                                        long var570 = var569 * var495;
                                        long var496 = var570 & 7L;
                                        long var869;
                                        int var497 = (var869 = var496 - 0L) == 0L ? 0 : (var869 < 0L ? -1 : 1);
                                        if (var497 == 0) {
                                            return null;
                                        }
                                        break label1092;
                                    }

                                    var4 ^= 2147378307;
                                    break label1078;
                                }

                                var4 >>= 10;
                                var4 ^= 1499957705;
                                break label1078;
                            }

                            var4 ^= 1972539863;
                        }

                        var7 = var4 + 1;
                        var7 = var4 * var7;
                        int var615 = var4 + 2;
                        var7 *= var615;
                        int var616 = var4 + 3;
                        var7 *= var616;
                        var7 &= 7;
                        if (var7 == 0) {
                            var5 = (Exception)var503;
                            return null;
                        }
                        break label1092;
                    }

                    var8 = var4;
                    long var713 = var8 + 1L;
                    var713 = var8 * var713;
                    long var810 = var8 + 2L;
                    var713 *= var810;
                    var8 += 3L;
                    var713 *= var8;
                    var8 = var713 & 7L;
                    long var870;
                    int var521 = (var870 = var8 - 0L) == 0L ? 0 : (var870 < 0L ? -1 : 1);
                    if (var521 == 0) {
                        return var545;
                    }
                    break label1092;
                }

                var4 -= 838629272;
                var4 *= -1748729135;
                var4 <<= 12;
                var4 ^= -89738959;
            } else {
                var4 <<= 7;
                var4 &= -212396023;
                var4 *= -719307359;
                var4 &= 558487316;
                var4 ^= 1445634353;
            }

            long var488 = var4;
            var6 = var488 + 1L;
            var6 = var488 * var6;
            var8 = var488 + 2L;
            var6 *= var8;
            long var489 = var488 + 3L;
            var6 *= var489;
            long var490 = var6 & 7L;
            long var871;
            var4 = (var871 = var490 - 0L) == 0L ? 0 : (var871 < 0L ? -1 : 1);
            if (var4 == 0) {
                return null;
            }
        }

        IllegalStateException var492 = new IllegalStateException();
        throw var492;
    }

    private void Ih(Path var1, Za var2, int var3) {
        Logger var214 = null;
        CopyOption[] var231 = null;
        Path var270 = null;
        java.nio.file.Path var273 = null;
        java.nio.file.Path var276 = null;
        Path var277 = null;
        FileAttribute[] var304 = null;
        java.nio.charset.Charset var309 = null;
        java.nio.file.CopyOption var312 = null;
        java.nio.file.CopyOption var313 = null;
        OpenOption[] var340 = null;
        Exception var5 = null;
        int var4 = var3 * 720846843;
        var4 ^= -855307954;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var368;
        int var206 = (var368 = var6 - 0L) == 0L ? 0 : (var368 < 0L ? -1 : 1);
        if (var206 == 0) {
            if (var1 == null) {
                var4 >>>= 24;
                var4 ^= 1247079251;
                var4 |= -1299169770;
                var4 += -2074678322;
                var4 ^= 680424211;
                var6 = var4;
                var8 = var6 + 1L;
                var8 = var6 * var8;
                var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var369;
                int var239 = (var369 = var6 - 0L) == 0L ? 0 : (var369 < 0L ? -1 : 1);
                if (var239 == 0) {
                    return;
                }
            } else {
                label398: {
                    var4 = switch (var4) {
                        case -429205648 -> {
                            var4 *= -1720769477;
                            var4 -= 302426666;
                            var4 &= -617987670;
                            yield var4 ^ 1210307181;
                        }
                        default -> var4 ^ 1253809172;
                        case 1583175814 -> var4 ^ 460939417;
                    };
                    String var207;
                    if (var2 == null) {
                        var4 *= -1589749463;
                        var4 += -1473088031;
                        var4 += 391625570;
                        var4 += 551166261;
                        var4 ^= 1449357371;
                        var207 = "none";
                        var4 += -936862103;
                        var4 ^= 1696860232;
                    } else {
                        var4 = switch (var4) {
                            default -> var4 ^ -1266138173;
                            case -107517374 -> var4 ^ -1877806328;
                            case 250575 -> {
                                var4 ^= 1116242789;
                                yield var4 ^ -1054411501;
                            }
                        };
                        Integer var7 = var4;
                        if (var7 == null) {
                            break label398;
                        }

                        boolean var240 = var2.RZ();
                        var4 &= -950324322;
                        var4 ^= 1017023076;
                        int var284 = var4 + 1;
                        int var285 = var4 * var284;
                        int var9 = var4 + 2;
                        int var286 = var285 * var9;
                        var9 = var4 + 3;
                        int var287 = var286 * var9;
                        int var288 = var287 & 7;
                        if (var288 != 0) {
                            break label398;
                        }

                        if (var240) {
                            var4 ^= -1776459330;
                            var4 ^= -2147397080;
                            var4 += 1256851863;
                            var4 >>= 20;
                            var4 ^= 501240908;
                            var7 = var4;
                            if (var7 == null) {
                                break label398;
                            }

                            var207 = "instrumental";
                            var4 -= 763443420;
                            var4 *= -1373311535;
                            var4 ^= -1396725734;
                        } else {
                            var4 >>= 20;
                            var4 ^= 1299050664;
                            int var242 = var4 + 1;
                            var242 = var4 * var242;
                            int var289 = var4 + 2;
                            var242 *= var289;
                            int var290 = var4 + 3;
                            var242 *= var290;
                            var242 &= 7;
                            if (var242 != 0) {
                                break label398;
                            }

                            int var247 = (var2.Gd()) ? 1 : 0;
                            var4 *= 817630149;
                            var4 ^= -1326199540;
                            var4 -= 2086792177;
                            var4 ^= 1024143499;
                            var4 ^= 2070439223;
                            var8 = var4;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var8 = var10 & 1L;
                            long var370;
                            int var293 = (var370 = var8 - 0L) == 0L ? 0 : (var370 < 0L ? -1 : 1);
                            if (var293 != 0) {
                                break label398;
                            }

                            if (var247 != 0) {
                                var4 -= -1277140861;
                                var4 |= 1494138772;
                                var4 >>= 13;
                                var4 += 1221764054;
                                var4 ^= 531080757;
                                long var248 = var4;
                                long var320 = var248 + 1L;
                                long var321 = var248 * var320;
                                long var11 = var248 + 2L;
                                long var322 = var321 * var11;
                                long var249 = var248 + 3L;
                                long var323 = var322 * var249;
                                long var250 = var323 & 7L;
                                long var371;
                                var247 = (var371 = var250 - 0L) == 0L ? 0 : (var371 < 0L ? -1 : 1);
                                if (var247 != 0) {
                                    break label398;
                                }

                                var207 = "synced";
                                var4 &= 1686017558;
                                var4 -= -1183602446;
                                var4 += 1666479473;
                                var4 ^= 1732628282;
                            } else {
                                var4 = switch (var4) {
                                    case 15848967 -> var4 ^ -470480666;
                                    default -> var4 ^ -1040358092;
                                    case 1109673172 -> {
                                        var4 += 211298755;
                                        var4 -= 141011145;
                                        var4 *= 943095037;
                                        var4 -= -141947697;
                                        yield var4 ^ -465305632;
                                    }
                                };
                                Integer var252 = var4;
                                if (var252 == null) {
                                    break label398;
                                }

                                var207 = "plain";
                                switch (var4) {
                                    case -2017277913:
                                        var4 |= 758037715;
                                        var4 -= -528362205;
                                        var4 += -1444815860;
                                        var4 -= 1664086643;
                                        var4 ^= -1626602968;
                                        break;
                                    case -1164952112:
                                    default:
                                        var4 ^= -1844065937;
                                        break;
                                    case 401932667:
                                        var4 ^= 201300656;
                                }
                            }
                        }
                    }

                    int var253 = var4 + 1;
                    var253 = var4 * var253;
                    int var294 = var4 + 2;
                    var253 *= var294;
                    int var295 = var4 + 3;
                    var253 *= var295;
                    var253 &= 7;
                    if (var253 == 0) {
                        StringBuilder var258 = new StringBuilder("aura-lyrics 1");
                        StringBuilder var259 = var258.append('\n');
                        var4 >>= 8;
                        var4 += 315901716;
                        var4 ^= -1789142535;
                        int var296 = var4 + 1;
                        int var297 = var4 * var296;
                        int var324 = var4 + 2;
                        int var298 = var297 * var324;
                        var324 = var4 + 3;
                        int var299 = var298 * var324;
                        int var300 = var299 & 7;
                        label216:
                        if (var300 == 0) {
                            StringBuilder var208 = var259.append(var207);
                            StringBuilder var209 = var208.append('\n');
                            LongSupplier var260 = this.ga;
                            long var261 = var260.getAsLong();
                            StringBuilder var210 = var209.append(var261);
                            StringBuilder var211 = var210.append('\n');
                            StringBuilder var212 = var211;
                            if (var2 != null) {
                                var4 = switch (var4) {
                                    case -2029616162 -> {
                                        var4 ^= -1688290711;
                                        var4 *= -964672077;
                                        var4 >>>= 5;
                                        yield var4 ^ 1199688850;
                                    }
                                    default -> var4 ^ -572638936;
                                    case 1488458099 -> var4 ^ -1163548978;
                                };
                                long var262 = var4;
                                long var326 = var262 + 1L;
                                long var327 = var262 * var326;
                                long var361 = var262 + 2L;
                                long var328 = var327 * var361;
                                long var263 = var262 + 3L;
                                long var329 = var328 * var263;
                                long var264 = var329 & 7L;
                                long var372;
                                var253 = (var372 = var264 - 0L) == 0L ? 0 : (var372 < 0L ? -1 : 1);
                                if (var253 != 0) {
                                    break label216;
                                }

                                u(var211, var2);
                                switch (var4) {
                                    case -1299946886:
                                    default:
                                        var4 ^= -1841898045;
                                        break;
                                    case -987689779:
                                        var4 ^= -240304583;
                                        break;
                                    case 1081358845:
                                        var4 += 169037090;
                                        var4 >>= 14;
                                        var4 ^= -1284196590;
                                }
                            } else {
                                var4 ^= 1629633948;
                                var4 |= -1312861694;
                                var4 ^= 1154114382;
                            }

                            Integer var266 = var4;
                            label210:
                            if (var266 != null) {
                                label407: {
                                    label359: {
                                        label358: {
                                            label357: {
                                                label403: {
                                                    try {
                                                        var4 <<= 8;
                                                        var4 += -1839326535;
                                                        var4 &= -97670772;
                                                        var4 ^= -2080740536;
                                                    } catch (RuntimeException var26) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var213 = p(var26);
                                                        var5 = (Exception)var213;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    long var267 = var4;
                                                    long var330 = var267 + 1L;
                                                    long var331 = var267 * var330;
                                                    long var268 = var331 & 1L;
                                                    long var373;
                                                    int var269 = (var373 = var268 - 0L) == 0L ? 0 : (var373 < 0L ? -1 : 1);
                                                    if (var269 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var270 = var1.getParent();
                                                        var4 |= 452187355;
                                                        var4 >>>= 11;
                                                        var4 ^= 1124832294;
                                                        var4 ^= -1120431412;
                                                    } catch (RuntimeException var25) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var215 = p(var25);
                                                        var5 = (Exception)var215;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    var8 = var4;
                                                    var10 = var8 + 1L;
                                                    var10 = var8 * var10;
                                                    var8 = var10 & 1L;
                                                    long var374;
                                                    int var303 = (var374 = var8 - 0L) == 0L ? 0 : (var374 < 0L ? -1 : 1);
                                                    if (var303 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var304 = new FileAttribute[0];
                                                        var4 += 420399618;
                                                        var4 ^= -918034362;
                                                        var4 ^= 1898502115;
                                                    } catch (RuntimeException var24) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var216 = p(var24);
                                                        var5 = (Exception)var216;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    long var332 = var4;
                                                    long var362 = var332 + 1L;
                                                    var362 = var332 * var362;
                                                    long var333 = var362 & 1L;
                                                    long var375;
                                                    var324 = (var375 = var333 - 0L) == 0L ? 0 : (var375 < 0L ? -1 : 1);
                                                    if (var324 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        Path var271 = Files.createDirectories(var270, var304);
                                                        var4 ^= 1247683787;
                                                        var4 >>= 10;
                                                        var4 |= -1418501593;
                                                        var4 ^= 2030418767;
                                                    } catch (RuntimeException | IOException var23) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var217 = p(var23);
                                                        var5 = (Exception)var217;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    Integer var272 = var4;
                                                    if (var272 == null) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var273 = var1.getFileName();
                                                    } catch (RuntimeException var22) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var218 = p(var22);
                                                        var5 = (Exception)var218;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }
                                                    var4 = switch (var4) {
                                                        case -2030118728 -> {
                                                            var4 |= -1217484187;
                                                            var4 >>= 29;
                                                            yield var4 ^ -753970578;
                                                        }
                                                        default -> var4 ^ -1325519464;
                                                        case 1384902303 -> var4 ^ 1010000919;
                                                    };

                                                    try {
                                                        String var274 = String.valueOf(var273);
                                                        var4 ^= 956122532;
                                                        var4 *= 252079355;
                                                        var4 -= 1451796016;
                                                        var4 &= 1913362877;
                                                        var4 ^= 438054476;
                                                        String var275 = var274 + ".tmp";
                                                        var4 <<= 4;
                                                        var4 -= 933140778;
                                                        var4 |= 1754105969;
                                                        var4 ^= 1151959824;
                                                        var276 = var1.resolveSibling(var275);
                                                    } catch (RuntimeException var21) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var219 = p(var21);
                                                        var5 = (Exception)var219;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }
                                                    var4 = switch (var4) {
                                                        default -> var4 ^ -995904666;
                                                        case -617007284 -> var4 ^ 1256430784;
                                                        case 762605287 -> {
                                                            var4 ^= -1040919473;
                                                            yield var4 ^ -933748582;
                                                        }
                                                    };
                                                    Integer var305 = var4;
                                                    if (var305 == null) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var277 = var276;
                                                        var4 *= -1324729861;
                                                        var4 ^= -64352911;
                                                        var4 *= -1082569631;
                                                        var4 ^= -265051094;
                                                    } catch (RuntimeException var20) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var220 = p(var20);
                                                        var5 = (Exception)var220;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    var8 = var4;
                                                    var10 = var8 + 1L;
                                                    var10 = var8 * var10;
                                                    var8 = var10 & 1L;
                                                    long var376;
                                                    int var308 = (var376 = var8 - 0L) == 0L ? 0 : (var376 < 0L ? -1 : 1);
                                                    if (var308 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var309 = StandardCharsets.UTF_8;
                                                        var4 <<= 23;
                                                        var4 |= 648911804;
                                                        var4 &= 245285088;
                                                        var4 ^= -1120331625;
                                                    } catch (RuntimeException var19) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var221 = p(var19);
                                                        var5 = (Exception)var221;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    var324 = var4 + 1;
                                                    var324 = var4 * var324;
                                                    int var353 = var4 + 2;
                                                    var324 *= var353;
                                                    int var354 = var4 + 3;
                                                    var324 *= var354;
                                                    var324 &= 7;
                                                    if (var324 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var340 = new OpenOption[0];
                                                        var4 &= 2110929196;
                                                        var4 *= -1939119735;
                                                        var4 ^= 98801471;
                                                    } catch (RuntimeException var18) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var222 = p(var18);
                                                        var5 = (Exception)var222;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    int var355 = var4 + 1;
                                                    int var356 = var4 * var355;
                                                    int var364 = var4 + 2;
                                                    int var357 = var356 * var364;
                                                    int var365 = var4 + 3;
                                                    int var358 = var357 * var365;
                                                    int var359 = var358 & 7;
                                                    if (var359 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        Path var224 = Files.writeString(var277, var212, var309, var340);
                                                        var4 += 718393262;
                                                        var4 &= 430692531;
                                                        var4 -= -1295412518;
                                                        var4 ^= 58357987;
                                                    } catch (RuntimeException | IOException var17) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var223 = p(var17);
                                                        var5 = (Exception)var223;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    int var225 = var4 + 1;
                                                    int var226 = var4 * var225;
                                                    int var310 = var4 + 2;
                                                    int var227 = var226 * var310;
                                                    int var311 = var4 + 3;
                                                    int var228 = var227 * var311;
                                                    int var229 = var228 & 7;
                                                    if (var229 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var231 = new CopyOption[2];
                                                        var4 ^= -148707458;
                                                        var4 <<= 1;
                                                        var4 ^= -2119278319;
                                                        var312 = StandardCopyOption.REPLACE_EXISTING;
                                                        var4 |= -1097482490;
                                                        var4 >>= 15;
                                                        var4 ^= -2079354638;
                                                    } catch (RuntimeException var16) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var230 = p(var16);
                                                        var5 = (Exception)var230;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    long var341 = var4;
                                                    var362 = var341 + 1L;
                                                    var362 = var341 * var362;
                                                    long var342 = var362 & 1L;
                                                    long var377;
                                                    var324 = (var377 = var342 - 0L) == 0L ? 0 : (var377 < 0L ? -1 : 1);
                                                    if (var324 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var231[0] = var312;
                                                        var4 &= 1324618944;
                                                        var4 += -1650567657;
                                                        var4 -= -766137166;
                                                        var4 ^= 1585727305;
                                                        var313 = StandardCopyOption.ATOMIC_MOVE;
                                                    } catch (RuntimeException var15) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var232 = p(var15);
                                                        var5 = (Exception)var232;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }
                                                    var4 = switch (var4) {
                                                        case 845250617 -> var4 ^ -1214341761;
                                                        case 1220340460 -> {
                                                            var4 -= -1269702097;
                                                            var4 &= -2002047636;
                                                            var4 ^= 378267712;
                                                            var4 ^= 617668527;
                                                            yield var4 ^ 1277287038;
                                                        }
                                                        default -> var4 ^ 1159558364;
                                                    };
                                                    var324 = var4 + 1;
                                                    var324 = var4 * var324;
                                                    var324 &= 1;
                                                    if (var324 != 0) {
                                                        break label210;
                                                    }

                                                    try {
                                                        var231[1] = var313;
                                                        var4 -= -912684378;
                                                        var4 >>>= 11;
                                                        var4 |= 831280955;
                                                        var4 ^= 387628705;
                                                    } catch (RuntimeException var14) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var233 = p(var14);
                                                        var5 = (Exception)var233;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                                break label403;
                                                        }
                                                    }

                                                    Integer var314 = var4;
                                                    if (var314 == null) {
                                                        break label210;
                                                    }

                                                    try {
                                                        Path var235 = Files.move(var277, var1, var231);
                                                        break label407;
                                                    } catch (RuntimeException | IOException var13) {
                                                        var4 = LH;
                                                        var4 ^= 376043202;
                                                        Throwable var234 = p(var13);
                                                        var5 = (Exception)var234;
                                                        var5 = var5;
                                                        var214 = gf;
                                                        switch (var4) {
                                                            case -1773374244:
                                                                break label357;
                                                            case 975139945:
                                                            default:
                                                                break label358;
                                                            case 1849939085:
                                                        }
                                                    }
                                                }

                                                var4 ^= -1928939310;
                                                break label359;
                                            }

                                            var4 &= -1130539735;
                                            var4 += -1537997495;
                                            var4 ^= 835717054;
                                            break label359;
                                        }

                                        var4 ^= 1598910646;
                                    }

                                    int var278 = var4 + 1;
                                    var278 = var4 * var278;
                                    var278 &= 1;
                                    if (var278 != 0) {
                                        break label210;
                                    }

                                    String var200 = var5.toString();
                                    var214.debug("Could not cache lyrics ({})", var200);
                                    var4 |= 1786540622;
                                    var4 |= 1111044292;
                                    var4 |= -679593076;
                                    var4 ^= 1472184989;
                                    return;
                                }
                                var4 = switch (var4) {
                                    default -> var4 ^ 915020302;
                                    case 647260570 -> {
                                        var4 |= 1660400531;
                                        var4 *= -1622631743;
                                        var4 ^= 245916531;
                                        yield var4 ^ 855484609;
                                    }
                                    case 1828697402 -> var4 ^ -575170168;
                                };
                                int var201 = var4 + 1;
                                int var202 = var4 * var201;
                                int var203 = var202 & 1;
                                if (var203 == 0) {
                                    var4 |= 2092136073;
                                    var4 += 7363204;
                                    var4 ^= 2122355478;
                                    var4 ^= 702807817;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        AssertionError var184 = new AssertionError();
        throw var184;
    }

    public static void u(StringBuilder var0, Za var1) {
        label122: {
            int var2 = LH;
            var2 ^= 1256642555;
            int var3 = System.identityHashCode(var0);
            int var4 = 0;
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var144;
            int var79 = (var144 = var5 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
            if (var79 == 0) {
                var2 |= -14356383;
                var2 |= 1476425626;
                var2 >>>= 16;
                var2 ^= -91280319;
                var5 = var2;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var145;
                int var82 = (var145 = var5 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                if (var82 != 0) {
                    break label122;
                }

                var4 = var4;
                var2 |= -784627448;
                var2 ^= -1085117768;
                var2 -= 1805216697;
                var2 ^= -534498583;

                while (true) {
                    Integer var83 = var2;
                    if (var83 == null) {
                        break label122;
                    }

                    int var84 = var1.o();
                    Integer var6 = var3;
                    if (var6 == null) {
                        var2 |= -597935300;
                        var2 += -1634616614;
                        var2 ^= 1024630405;
                        break;
                    }
                    var2 = switch (var2) {
                        case 833780134 -> var2 ^ 1949662895;
                        case 963671988 -> {
                            var2 += -82886186;
                            yield var2 ^ 729331562;
                        }
                        default -> var2 ^ 1240942731;
                    };
                    int var98 = var2 + 1;
                    var98 = var2 * var98;
                    int var128 = var2 + 2;
                    var98 *= var128;
                    int var129 = var2 + 3;
                    var98 *= var129;
                    var98 &= 7;
                    if (var98 != 0) {
                        break label122;
                    }

                    if (var4 >= var84) {
                        long var69 = switch (var2) {
                            default -> var2 ^ 1077386160;
                            case -1271212747 -> var2 ^ -1607548889;
                            case 520556256 -> {
                                var2 *= -422839945;
                                var2 |= -400256528;
                                var2 -= 210638150;
                                yield var2 ^ -211212834;
                            }
                        };
                        var5 = var69 + 1L;
                        var5 = var69 * var5;
                        long var70 = var5 & 1L;
                        long var147;
                        var3 = (var147 = var70 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                        break label122;
                    }

                    var2 -= 1945182703;
                    var2 ^= 1572386043;
                    var2 >>= 14;
                    var2 += -1682786168;
                    var2 ^= -200140438;
                    int var85 = var2 + 1;
                    int var86 = var2 * var85;
                    var98 = var2 + 2;
                    int var87 = var86 * var98;
                    var98 = var2 + 3;
                    int var88 = var87 * var98;
                    int var89 = var88 & 7;
                    if (var89 != 0) {
                        break label122;
                    }

                    hP_2 var90 = var1.VP(var4);
                    var98 = var3 + 1;
                    var98 = var3 * var98;
                    var98 &= 1;
                    if (var98 != 0) {
                        var2 -= 209492019;
                        var2 += -96103941;
                        var2 ^= -59432948;
                        break;
                    }

                    var2 -= 956518599;
                    var2 ^= -1378647505;
                    long var108 = var2;
                    long var8 = var108 + 1L;
                    var8 = var108 * var8;
                    long var109 = var8 & 1L;
                    long var146;
                    var98 = (var146 = var109 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                    if (var98 != 0) {
                        break label122;
                    }

                    int var111 = (var1.Gd()) ? 1 : 0;
                    if (var111 != 0) {
                        var2 ^= 1827992827;
                        var2 ^= 559434367;
                        var111 = var2 + 1;
                        var111 = var2 * var111;
                        int var130 = var2 + 2;
                        var111 *= var130;
                        int var131 = var2 + 3;
                        var111 *= var131;
                        var111 &= 7;
                        if (var111 != 0) {
                            break label122;
                        }

                        long var117 = var90.startMs();
                        Locale var139 = Locale.ROOT;
                        Object[] var9 = new Object[3];
                        long var10 = var117 / 60000L;
                        Long var140 = var10;
                        var9[0] = var140;
                        long var141 = var117 / 1000L;
                        var141 %= 60L;
                        Long var143 = var141;
                        var9[1] = var143;
                        long var118 = var117 % 1000L;
                        Long var119 = var118;
                        var9[2] = var119;
                        String var120 = String.format(var139, "[%02d:%02d.%03d]", var9);
                        int var132 = var3 + 1;
                        int var133 = var3 * var132;
                        int var134 = var133 & 1;
                        if (var134 != 0) {
                            var2 &= 1019729748;
                            var2 ^= -1243700989;
                            break;
                        }
                        var2 = switch (var2) {
                            case -689830597 -> {
                                var2 -= -246742330;
                                var2 ^= 1916486963;
                                var2 -= 1690519634;
                                var2 -= 430704417;
                                yield var2 ^ -975465526;
                            }
                            default -> var2 ^ 876064230;
                            case 550563067 -> var2 ^ -1799994272;
                        };
                        int var135 = var2 + 1;
                        int var136 = var2 * var135;
                        int var137 = var136 & 1;
                        if (var137 != 0) {
                            break label122;
                        }

                        StringBuilder var121 = var0.append(var120);
                        switch (var2) {
                            case -1663258979:
                            default:
                                var2 ^= -1549784527;
                                break;
                            case -588815335:
                                var2 *= 1586116223;
                                var2 |= -658579536;
                                var2 &= 230774966;
                                var2 ^= -2037139016;
                                break;
                            case 1092366549:
                                var2 ^= 1599724394;
                        }
                    } else {
                        var2 >>>= 28;
                        var2 &= -425927268;
                        var2 ^= -1890393850;
                    }

                    var111 = var2 + 1;
                    var111 = var2 * var111;
                    var111 &= 1;
                    if (var111 != 0) {
                        break label122;
                    }

                    String var91 = var90.text();
                    StringBuilder var92 = var0.append(var91);
                    StringBuilder var93 = var92.append('\n');
                    Integer var94 = var3;
                    if (var94 == null) {
                        var2 >>= 7;
                        var2 ^= 1577189841;
                        break;
                    }

                    var2 *= -872816565;
                    var2 |= 934009348;
                    var2 >>= 7;
                    var2 |= -576514115;
                    var2 ^= -144414210;
                    int var95 = var4 + 1;
                    var4 = var95;
                    var2 >>>= 6;
                    var2 |= 1723807315;
                    var2 ^= 1607420367;
                }
            } else {
                var2 <<= 4;
                var2 *= 2129911677;
                var2 |= 1106581838;
                var2 &= -98453846;
                var2 ^= -650309607;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                IllegalArgumentException var67 = new IllegalArgumentException();
                throw var67;
            }
        }

        UnsupportedOperationException var68 = new UnsupportedOperationException();
        throw var68;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1827656088;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        LH = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/lyrics");
        gf = var5;
    }

    private static Throwable p(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
