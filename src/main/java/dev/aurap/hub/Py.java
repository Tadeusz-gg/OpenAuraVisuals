package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Py {
    MALFORMED(1, 400, fy.FIX_CLIENT),
    UNSUPPORTED_SCHEMA(2, 400, fy.FIX_CLIENT),
    PAYLOAD_TOO_LARGE(3, 413, fy.FIX_CLIENT),
    BAD_SIGNATURE(4, 401, fy.FIX_CLIENT),
    CHALLENGE_INVALID(5, 401, fy.RETRY_NOW),
    REPLAY(6, 401, fy.RETRY_NOW),
    CLOCK_SKEW(7, 401, fy.RETRY_NOW),
    UNKNOWN_CREDENTIAL(8, 401, fy.USER_ACTION),
    NOT_ACTIVATED(9, 409, fy.ACTIVATE),
    DEVICE_MISMATCH(10, 403, fy.USER_ACTION),
    BINDING_CHANGED(11, 403, fy.USER_ACTION),
    EPOCH_STALE(12, 403, fy.USER_ACTION),
    REVOKED(13, 403, fy.TERMINAL),
    SUSPENDED(14, 403, fy.TERMINAL),
    SESSION_UNKNOWN(15, 401, fy.REAUTHENTICATE),
    RATE_LIMITED(16, 429, fy.RETRY_LATER),
    RESET_COOLDOWN(17, 429, fy.USER_ACTION),
    SERVER_ERROR(18, 500, fy.RETRY_LATER),
    UNAVAILABLE(19, 503, fy.RETRY_LATER),
    NOT_FOUND(20, 404, fy.FIX_CLIENT),
    METHOD_NOT_ALLOWED(21, 405, fy.FIX_CLIENT),
    LOADER_ENVIRONMENT(22, 403, fy.USER_ACTION);

    private final int r;
    private final int Y;
    private final fy s;
    public static final int nJ;

    private Py(int var3, int var4, fy var5) {
        this.r = var3;
        this.Y = var4;
        this.s = var5;
    }

    public int id() {
        int var1 = nJ;
        var1 ^= 1127971570;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 == null) {
            var1 >>= 11;
            var1 ^= -1003986670;
            var1 *= -925280999;
            var1 &= 923333011;
            var1 ^= -570189150;
            int var18 = var1 + 1;
            var18 = var1 * var18;
            int var3 = var1 + 2;
            var18 *= var3;
            var3 = var1 + 3;
            var18 *= var3;
            var18 &= 7;
            if (var18 == 0) {
                AssertionError var23 = new AssertionError();
                throw var23;
            }
        } else {
            var1 ^= -1920545857;
            var1 >>= 20;
            var1 *= 1709748577;
            var1 ^= -427137367;
            int var24 = var1 + 1;
            var24 = var1 * var24;
            int var29 = var1 + 2;
            var24 *= var29;
            var1 += 3;
            var24 *= var1;
            var1 = var24 & 7;
            if (var1 == 0) {
                return this.r;
            }
        }

        RuntimeException var16 = new RuntimeException();
        throw var16;
    }

    public int httpStatus() {
        int var1 = nJ;
        var1 ^= 1327410629;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var26;
        var2 = (var26 = var18 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += -929220901;
            var1 ^= 1420830634;
            var1 -= 1880328148;
            var1 ^= 659148691;
            Integer var20 = var1;
            if (var20 != null) {
                return this.Y;
            }
        } else {
            var1 ^= -1419552830;
            var1 ^= -1763481551;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    public fy recovery() {
        int var1 = nJ;
        var1 ^= 2085981270;
        int var2 = System.identityHashCode(this);
        long var13 = var2;
        long var4 = var13 + 1L;
        var4 = var13 * var4;
        long var14 = var4 & 1L;
        long var22;
        var2 = (var22 = var14 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 144195887;
            var1 ^= -2048967354;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            } else {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        } else {
            var1 &= -331155374;
            var1 -= -732713303;
            var1 -= -1962348016;
            var1 ^= -1305283552;
            return this.s;
        }
    }

    public static Py F(int var0) {
        label98: {
            int var1 = nJ;
            int var2 = var0;
            var1 ^= 253308448;
            int var3 = var0;
            Py[] var4 = values();
            var4 = var4;
            long var5 = var0;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var103;
            int var75 = (var103 = var5 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
            if (var75 != 0) {
                switch (var1) {
                    case -1976697089:
                        var1 ^= -1706042631;
                        break;
                    case -335977940:
                        var1 += -862594796;
                        var1 *= 260662681;
                        var1 ^= -784086910;
                        break;
                    case 157981083:
                    default:
                        var1 ^= 1632358555;
                }
            } else {
                var1 |= -12493946;
                var1 |= 781313479;
                var1 ^= 235328432;
                Integer var76 = var0;
                if (var76 == null) {
                    break label98;
                }

                byte var77 = 0;
                int var78 = var77;

                var1 = switch (var1) {
                    case -234935201 -> {
                        var1 += 254545927;
                        var1 += 581717516;
                        yield var1 ^ 1898945810;
                    }
                    default -> var1 ^ -653088754;
                    case 1400490858 -> var1 ^ 16339468;
                };

                label94:
                while (true) {
                    int var6 = var4.length;
                    var7 = var3;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var104;
                    int var88 = (var104 = var7 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                    if (var88 != 0) {
                        var1 *= 1870247691;
                        var1 ^= 1223318046;
                        var1 ^= 1867052966;
                        var1 &= -2076848197;
                        var1 ^= 342715738;
                        break;
                    }

                    var1 *= -1542116939;
                    var1 |= -496069293;
                    var1 ^= -848466008;
                    if (var78 >= var6) {
                        switch (var1) {
                            case -828253347:
                            default:
                                var1 ^= 97408706;
                                break;
                            case 1057200219:
                                var1 <<= 15;
                                var1 <<= 13;
                                var1 -= -177229105;
                                var1 &= -2143430764;
                                var1 ^= 943144313;
                                break;
                            case 2010516328:
                                var1 ^= 1163108303;
                        }

                        return SERVER_ERROR;
                    }
                    var1 = switch (var1) {
                        default -> var1 ^ -1466299455;
                        case -811904196 -> var1 ^ 35005929;
                        case 1057200219 -> {
                            var1 -= 2137970993;
                            yield var1 ^ 857223898;
                        }
                    };
                    Py var79 = var4[var78];
                    var7 = var3;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var105;
                    int var91 = (var105 = var7 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
                    if (var91 != 0) {
                        var1 += -874061750;
                        var1 *= 1444007367;
                        var1 &= -2056873104;
                        var1 >>>= 18;
                        var1 ^= -1803992878;
                        break;
                    }

                    var1 += 575303332;
                    var1 -= -1279856071;
                    var1 ^= 913063445;
                    int var92 = var2 + 1;
                    int var93 = var2 * var92;
                    int var94 = var93 & 1;
                    if (var94 != 0) {
                        break label98;
                    }

                    var6 = var79.r;
                    if (var6 == var0) {
                        var1 >>= 30;
                        var1 -= -751626489;
                        var1 ^= -1250117982;
                        var1 ^= 656175847;
                        return var4[var78];
                    }

                    var1 += 851485085;
                    var1 ^= 1782959804;
                    long var81 = var2;
                    long var8 = var81 + 1L;
                    var8 = var81 * var8;
                    long var82 = var8 & 1L;
                    long var106;
                    var6 = (var106 = var82 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        break label98;
                    }

                    var6 = var78 + 1;
                    Integer var95 = var3;
                    if (var95 == null) {
                        switch (var1) {
                            case -2126946435:
                            default:
                                var1 ^= 359845856;
                                break label94;
                            case 419911126:
                                var1 ^= -758636455;
                                break label94;
                            case 1783176023:
                                var1 &= 2093053252;
                                var1 &= 708585518;
                                var1 <<= 22;
                                var1 ^= -1787207230;
                                break label94;
                        }
                    }

                    var1 -= -442115818;
                    var1 &= 1441635417;
                    var1 &= 1415891529;
                    var1 ^= 1591621861;
                    int var96 = var2 + 1;
                    int var97 = var2 * var96;
                    int var98 = var97 & 1;
                    if (var98 != 0) {
                        break label98;
                    }

                    var78 = var6;
                    switch (var1) {
                        case -1689802172:
                            var1 ^= 1321349567;
                            break;
                        case -134980677:
                        default:
                            var1 ^= 103762455;
                            break;
                        case 1526610084:
                            var1 += 293935364;
                            var1 -= 1358951861;
                            var1 ^= 1232817299;
                    }
                }
            }

            long var66 = var2;
            long var72 = var66 + 1L;
            long var73 = var66 * var72;
            long var67 = var73 & 1L;
            long var107;
            var2 = (var107 = var67 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var69 = new AssertionError();
                throw var69;
            }
        }

        RuntimeException var70 = new RuntimeException();
        throw var70;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1988007610;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        nJ = var4;
        fy var28 = fy.FIX_CLIENT;
        fy var29 = fy.FIX_CLIENT;
        fy var30 = fy.FIX_CLIENT;
        fy var31 = fy.FIX_CLIENT;
        fy var32 = fy.RETRY_NOW;
        fy var33 = fy.RETRY_NOW;
        fy var34 = fy.RETRY_NOW;
        fy var35 = fy.USER_ACTION;
        fy var36 = fy.ACTIVATE;
        fy var37 = fy.USER_ACTION;
        fy var38 = fy.USER_ACTION;
        fy var39 = fy.USER_ACTION;
        fy var40 = fy.TERMINAL;
        fy var41 = fy.TERMINAL;
        fy var42 = fy.REAUTHENTICATE;
        fy var43 = fy.RETRY_LATER;
        fy var44 = fy.USER_ACTION;
        fy var45 = fy.RETRY_LATER;
        fy var46 = fy.RETRY_LATER;
        fy var47 = fy.FIX_CLIENT;
        fy var48 = fy.FIX_CLIENT;
        fy var49 = fy.USER_ACTION;
    }
}
